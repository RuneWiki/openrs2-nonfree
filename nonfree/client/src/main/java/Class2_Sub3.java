import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "Lclient!vf;")
	public Class2_Sub3 aClass2_Sub3_69;

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "Lclient!vf;")
	public Class2_Sub3 aClass2_Sub3_70;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	public final void method2725() {
		if (this.aClass2_Sub3_70 != null) {
			this.aClass2_Sub3_70.aClass2_Sub3_69 = this.aClass2_Sub3_69;
			this.aClass2_Sub3_69.aClass2_Sub3_70 = this.aClass2_Sub3_70;
			this.aClass2_Sub3_69 = null;
			this.aClass2_Sub3_70 = null;
		}
	}
}
