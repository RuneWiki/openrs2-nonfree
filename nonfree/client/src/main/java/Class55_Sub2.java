import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Lclient!np;")
	public Class55_Sub2 aClass55_Sub2_9;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Lclient!np;")
	public Class55_Sub2 aClass55_Sub2_10;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	public final void method4577() {
		if (this.aClass55_Sub2_9 != null) {
			this.aClass55_Sub2_9.aClass55_Sub2_10 = this.aClass55_Sub2_10;
			this.aClass55_Sub2_10.aClass55_Sub2_9 = this.aClass55_Sub2_9;
			this.aClass55_Sub2_9 = null;
			this.aClass55_Sub2_10 = null;
		}
	}
}
