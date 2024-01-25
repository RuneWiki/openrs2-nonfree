import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class Class3 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "J")
	public long aLong248;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!ie;")
	public Class3 aClass3_267;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!ie;")
	public Class3 aClass3_268;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)Z")
	public final boolean method6287() {
		return this.aClass3_267 != null;
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
	public final void method6288() {
		if (this.aClass3_267 != null) {
			this.aClass3_267.aClass3_268 = this.aClass3_268;
			this.aClass3_268.aClass3_267 = this.aClass3_267;
			this.aClass3_267 = null;
			this.aClass3_268 = null;
		}
	}
}
