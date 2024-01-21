import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class3_Sub1_Sub5_Sub1_Sub2 extends Class3_Sub1_Sub5_Sub1 {

	@OriginalMember(owner = "client!rb", name = "Sc", descriptor = "Lclient!ba;")
	public Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(Z)Lclient!oa;")
	@Override
	public Class3_Sub1_Sub5_Sub7 method1874() {
		if (this.aClass3_Sub1_Sub3_1 == null) {
			return null;
		}
		@Pc(27) Class3_Sub1_Sub17 local27 = super.anInt2738 != -1 && super.anInt2695 == 0 ? Static111.method2009(super.anInt2738) : null;
		@Pc(45) Class3_Sub1_Sub17 local45 = super.anInt2723 == -1 || super.anInt2729 == super.anInt2723 && local27 != null ? null : Static111.method2009(super.anInt2723);
		@Pc(56) Class3_Sub1_Sub5_Sub7 local56 = this.aClass3_Sub1_Sub3_1.method133(local27, local45, super.anInt2724, super.anInt2708);
		if (local56 == null) {
			return null;
		}
		local56.method1475();
		super.anInt2743 = local56.anInt2680;
		if (super.anInt2698 != -1 && super.anInt2711 != -1) {
			@Pc(84) Class3_Sub1_Sub5_Sub7 local84 = Static90.method1658(super.anInt2698).method814(super.anInt2711);
			if (local84 != null) {
				local84.method1474(0, -super.anInt2700, 0);
				@Pc(104) Class3_Sub1_Sub5_Sub7[] local104 = new Class3_Sub1_Sub5_Sub7[] { local56, local84 };
				local56 = new Class3_Sub1_Sub5_Sub7(local104, 2);
			}
		}
		if (this.aClass3_Sub1_Sub3_1.anInt227 == 1) {
			local56.aBoolean130 = true;
		}
		return local56;
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method1880() {
		return this.aClass3_Sub1_Sub3_1 != null;
	}
}
