import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "Lclient!mf;")
	public Class2_Sub1 aClass2_Sub1_69;

	@OriginalMember(owner = "client!mf", name = "y", descriptor = "Lclient!mf;")
	public Class2_Sub1 aClass2_Sub1_70;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public final void method2540() {
		if (this.aClass2_Sub1_70 != null) {
			this.aClass2_Sub1_70.aClass2_Sub1_69 = this.aClass2_Sub1_69;
			this.aClass2_Sub1_69.aClass2_Sub1_70 = this.aClass2_Sub1_70;
			this.aClass2_Sub1_69 = null;
			this.aClass2_Sub1_70 = null;
		}
	}
}
