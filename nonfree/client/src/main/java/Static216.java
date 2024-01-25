import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!nn", name = "P", descriptor = "Lclient!gf;")
	public static Interface3 anInterface3_5;

	@OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
	public static int anInt4317;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V")
	public static void method3986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class174 local28 = Static178.aClass174ArrayArrayArray3[local9][arg0][arg1] = Static178.aClass174ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte48--;
				for (@Pc(40) Class84 local40 = local28.aClass84_3; local40 != null; local40 = local40.aClass84_2) {
					@Pc(44) Class4_Sub5 local44 = local40.aClass4_Sub5_1;
					if (local44.aShort92 == arg0 && local44.aShort93 == arg1) {
						local44.aByte75--;
					}
				}
			}
		}
		if (Static178.aClass174ArrayArrayArray3[0][arg0][arg1] == null) {
			Static178.aClass174ArrayArrayArray3[0][arg0][arg1] = new Class174(0, arg0, arg1);
			Static178.aClass174ArrayArrayArray3[0][arg0][arg1].aByte44 = 1;
		}
		Static178.aClass174ArrayArrayArray3[0][arg0][arg1].aClass174_1 = local7;
		Static178.aClass174ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!ea;)V")
	public static void method3987(@OriginalArg(1) Class55 arg0) {
		if (Static93.aBoolean128) {
			Static221.method4020(arg0);
		} else {
			Static138.method2446(arg0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(B)V")
	public static void method3988() {
		Static92.method1666(false);
		if (Static128.anInt3750 >= 0 && Static128.anInt3750 != 0) {
			Static144.method2633(Static128.anInt3750);
			Static128.anInt3750 = -1;
		}
	}
}
