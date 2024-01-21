import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "Lclient!ph;")
	public Class2_Sub2 aClass2_Sub2_69;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "Lclient!ph;")
	public Class2_Sub2 aClass2_Sub2_70;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
	public final void method2843() {
		if (this.aClass2_Sub2_69 != null) {
			this.aClass2_Sub2_69.aClass2_Sub2_70 = this.aClass2_Sub2_70;
			this.aClass2_Sub2_70.aClass2_Sub2_69 = this.aClass2_Sub2_69;
			this.aClass2_Sub2_70 = null;
			this.aClass2_Sub2_69 = null;
		}
	}
}
