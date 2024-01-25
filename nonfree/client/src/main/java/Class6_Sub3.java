import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!ta;")
	public Class6_Sub3 aClass6_Sub3_5;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Lclient!ta;")
	public Class6_Sub3 aClass6_Sub3_6;

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	public final void method1456() {
		if (this.aClass6_Sub3_6 != null) {
			this.aClass6_Sub3_6.aClass6_Sub3_5 = this.aClass6_Sub3_5;
			this.aClass6_Sub3_5.aClass6_Sub3_6 = this.aClass6_Sub3_6;
			this.aClass6_Sub3_6 = null;
			this.aClass6_Sub3_5 = null;
		}
	}
}
