import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class Class3 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "Lclient!qm;")
	public Class3 aClass3_299;

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "J")
	public long aLong276;

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "Lclient!qm;")
	public Class3 aClass3_300;

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V")
	public final void method8769() {
		if (this.aClass3_299 != null) {
			this.aClass3_299.aClass3_300 = this.aClass3_300;
			this.aClass3_300.aClass3_299 = this.aClass3_299;
			this.aClass3_300 = null;
			this.aClass3_299 = null;
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z")
	public final boolean method8770() {
		return this.aClass3_299 != null;
	}
}
