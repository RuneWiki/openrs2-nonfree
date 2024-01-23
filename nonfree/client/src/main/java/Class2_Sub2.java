import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!me", name = "y", descriptor = "Lclient!me;")
	public Class2_Sub2 aClass2_Sub2_65;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Lclient!me;")
	public Class2_Sub2 aClass2_Sub2_66;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
	public final void method3320() {
		if (this.aClass2_Sub2_66 != null) {
			this.aClass2_Sub2_66.aClass2_Sub2_65 = this.aClass2_Sub2_65;
			this.aClass2_Sub2_65.aClass2_Sub2_66 = this.aClass2_Sub2_66;
			this.aClass2_Sub2_65 = null;
			this.aClass2_Sub2_66 = null;
		}
	}
}
