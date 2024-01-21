import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!cf;")
	public Class2_Sub2 aClass2_Sub2_61;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Lclient!cf;")
	public Class2_Sub2 aClass2_Sub2_62;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V")
	public final void method3026() {
		if (this.aClass2_Sub2_61 != null) {
			this.aClass2_Sub2_61.aClass2_Sub2_62 = this.aClass2_Sub2_62;
			this.aClass2_Sub2_62.aClass2_Sub2_61 = this.aClass2_Sub2_61;
			this.aClass2_Sub2_61 = null;
			this.aClass2_Sub2_62 = null;
		}
	}
}
