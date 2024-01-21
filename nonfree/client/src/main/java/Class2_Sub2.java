import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "Lclient!qe;")
	public Class2_Sub2 aClass2_Sub2_69;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "Lclient!qe;")
	public Class2_Sub2 aClass2_Sub2_70;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public final void method2900() {
		if (this.aClass2_Sub2_70 != null) {
			this.aClass2_Sub2_70.aClass2_Sub2_69 = this.aClass2_Sub2_69;
			this.aClass2_Sub2_69.aClass2_Sub2_70 = this.aClass2_Sub2_70;
			this.aClass2_Sub2_70 = null;
			this.aClass2_Sub2_69 = null;
		}
	}
}
