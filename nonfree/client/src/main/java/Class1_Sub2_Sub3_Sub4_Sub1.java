import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub2_Sub3_Sub4_Sub1 extends Class1_Sub2_Sub3_Sub4 {

	@OriginalMember(owner = "client!rc", name = "Jc", descriptor = "Lclient!nf;")
	public Class1_Sub2_Sub13 aClass1_Sub2_Sub13_1;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)Lclient!da;")
	@Override
	public Class1_Sub2_Sub3_Sub2 method1969() {
		if (this.aClass1_Sub2_Sub13_1 == null) {
			return null;
		}
		@Pc(27) Class1_Sub2_Sub17 local27 = super.anInt2810 != -1 && super.anInt2829 == 0 ? Static34.method755(super.anInt2810) : null;
		@Pc(45) Class1_Sub2_Sub17 local45 = super.anInt2795 == -1 || super.anInt2795 == super.anInt2835 && local27 != null ? null : Static34.method755(super.anInt2795);
		@Pc(56) Class1_Sub2_Sub3_Sub2 local56 = this.aClass1_Sub2_Sub13_1.method1400(local27, local45, super.anInt2808, super.anInt2814);
		if (local56 == null) {
			return null;
		}
		local56.method465();
		super.anInt2838 = local56.anInt2778;
		if (super.anInt2813 != -1 && super.anInt2792 != -1) {
			@Pc(86) Class1_Sub2_Sub3_Sub2 local86 = Static52.method1009(super.anInt2813).method1553(super.anInt2792);
			if (local86 != null) {
				local86.method470(0, -super.anInt2821, 0);
				@Pc(106) Class1_Sub2_Sub3_Sub2[] local106 = new Class1_Sub2_Sub3_Sub2[] { local56, local86 };
				local56 = new Class1_Sub2_Sub3_Sub2(local106, 2);
			}
		}
		if (this.aClass1_Sub2_Sub13_1.anInt1863 == 1) {
			local56.aBoolean19 = true;
		}
		return local56;
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method1977() {
		return this.aClass1_Sub2_Sub13_1 != null;
	}
}
