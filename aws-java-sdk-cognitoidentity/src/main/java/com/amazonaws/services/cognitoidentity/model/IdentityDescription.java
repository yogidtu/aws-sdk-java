/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/**
 * <p>
 * A description of the identity.
 * </p>
 */
public class IdentityDescription implements Serializable {

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     */
    private String identityId;

    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> logins;

    /**
     * Date on which the identity was created.
     */
    private java.util.Date creationDate;

    /**
     * Date on which the identity was last modified.
     */
    private java.util.Date lastModifiedDate;

    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @return A unique identifier in the format REGION:GUID.
     */
    public String getIdentityId() {
        return identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }
    
    /**
     * A unique identifier in the format REGION:GUID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>[\w-]+:[0-9a-f-]+<br/>
     *
     * @param identityId A unique identifier in the format REGION:GUID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityDescription withIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     *
     * @return A set of optional name-value pairs that map provider names to provider
     *         tokens.
     */
    public java.util.List<String> getLogins() {
        return logins;
    }
    
    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     *
     * @param logins A set of optional name-value pairs that map provider names to provider
     *         tokens.
     */
    public void setLogins(java.util.Collection<String> logins) {
        if (logins == null) {
            this.logins = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> loginsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(logins.size());
        loginsCopy.addAll(logins);
        this.logins = loginsCopy;
    }
    
    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logins A set of optional name-value pairs that map provider names to provider
     *         tokens.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityDescription withLogins(String... logins) {
        if (getLogins() == null) setLogins(new java.util.ArrayList<String>(logins.length));
        for (String value : logins) {
            getLogins().add(value);
        }
        return this;
    }
    
    /**
     * A set of optional name-value pairs that map provider names to provider
     * tokens.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logins A set of optional name-value pairs that map provider names to provider
     *         tokens.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityDescription withLogins(java.util.Collection<String> logins) {
        if (logins == null) {
            this.logins = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> loginsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(logins.size());
            loginsCopy.addAll(logins);
            this.logins = loginsCopy;
        }

        return this;
    }

    /**
     * Date on which the identity was created.
     *
     * @return Date on which the identity was created.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * Date on which the identity was created.
     *
     * @param creationDate Date on which the identity was created.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * Date on which the identity was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate Date on which the identity was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityDescription withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Date on which the identity was last modified.
     *
     * @return Date on which the identity was last modified.
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    
    /**
     * Date on which the identity was last modified.
     *
     * @param lastModifiedDate Date on which the identity was last modified.
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    /**
     * Date on which the identity was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate Date on which the identity was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IdentityDescription withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIdentityId() != null) sb.append("IdentityId: " + getIdentityId() + ",");
        if (getLogins() != null) sb.append("Logins: " + getLogins() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode()); 
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IdentityDescription == false) return false;
        IdentityDescription other = (IdentityDescription)obj;
        
        if (other.getIdentityId() == null ^ this.getIdentityId() == null) return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false) return false; 
        if (other.getLogins() == null ^ this.getLogins() == null) return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false; 
        return true;
    }
    
}
    