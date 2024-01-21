import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "Lclient!qb;")
	public Class2_Sub2 aClass2_Sub2_65;

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "Lclient!qb;")
	public Class2_Sub2 aClass2_Sub2_66;

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public final void method1935() {
		if (this.aClass2_Sub2_66 != null) {
			this.aClass2_Sub2_66.aClass2_Sub2_65 = this.aClass2_Sub2_65;
			this.aClass2_Sub2_65.aClass2_Sub2_66 = this.aClass2_Sub2_66;
			this.aClass2_Sub2_66 = null;
			this.aClass2_Sub2_65 = null;
		}
	}
}
