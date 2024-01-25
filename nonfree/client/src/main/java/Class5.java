import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class Class5 {

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "J")
	public long aLong234;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!dd;")
	public Class5 aClass5_267;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!dd;")
	public Class5 aClass5_268;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	public final void method6003() {
		if (this.aClass5_268 != null) {
			this.aClass5_268.aClass5_267 = this.aClass5_267;
			this.aClass5_267.aClass5_268 = this.aClass5_268;
			this.aClass5_268 = null;
			this.aClass5_267 = null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Z")
	public final boolean method6005() {
		return this.aClass5_268 != null;
	}
}
