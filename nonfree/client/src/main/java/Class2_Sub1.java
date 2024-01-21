import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "Lclient!rg;")
	public Class2_Sub1 aClass2_Sub1_72;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Lclient!rg;")
	public Class2_Sub1 aClass2_Sub1_73;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	public final void method3415() {
		if (this.aClass2_Sub1_72 != null) {
			this.aClass2_Sub1_72.aClass2_Sub1_73 = this.aClass2_Sub1_73;
			this.aClass2_Sub1_73.aClass2_Sub1_72 = this.aClass2_Sub1_72;
			this.aClass2_Sub1_72 = null;
			this.aClass2_Sub1_73 = null;
		}
	}
}
