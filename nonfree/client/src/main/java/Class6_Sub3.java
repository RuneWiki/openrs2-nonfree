import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "Lclient!se;")
	public Class6_Sub3 aClass6_Sub3_63;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "Lclient!se;")
	public Class6_Sub3 aClass6_Sub3_64;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
	public final void method2131() {
		if (this.aClass6_Sub3_64 != null) {
			this.aClass6_Sub3_64.aClass6_Sub3_63 = this.aClass6_Sub3_63;
			this.aClass6_Sub3_63.aClass6_Sub3_64 = this.aClass6_Sub3_64;
			this.aClass6_Sub3_64 = null;
			this.aClass6_Sub3_63 = null;
		}
	}
}
