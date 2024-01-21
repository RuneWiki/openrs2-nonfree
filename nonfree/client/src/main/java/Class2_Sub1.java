import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "Lclient!qb;")
	public Class2_Sub1 aClass2_Sub1_59;

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "Lclient!qb;")
	public Class2_Sub1 aClass2_Sub1_60;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V")
	public final void method2053() {
		if (this.aClass2_Sub1_60 != null) {
			this.aClass2_Sub1_60.aClass2_Sub1_59 = this.aClass2_Sub1_59;
			this.aClass2_Sub1_59.aClass2_Sub1_60 = this.aClass2_Sub1_60;
			this.aClass2_Sub1_59 = null;
			this.aClass2_Sub1_60 = null;
		}
	}
}
