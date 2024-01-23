import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public static int anInt4516;

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "Lclient!qn;")
	public static Class3_Sub4_Sub12_Sub2 aClass3_Sub4_Sub12_Sub2_3;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "Lclient!ho;")
	public static Class3_Sub4_Sub12 aClass3_Sub4_Sub12_3;

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
	public static int anInt4518;

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
	public static int anInt4519;

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
	public static int anInt4515 = 1;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
	public static void method3803() {
		Static134.method3639(Static191.aClass151_10);
		Static248.anInt4999++;
		if (Static112.aBoolean408 && Static306.aBoolean429) {
			@Pc(27) int local27 = Static167.anInt3153;
			@Pc(29) int local29 = Static153.anInt2892;
			@Pc(32) int local32 = Static191.aClass151_10.anInt4745;
			local29 -= Static39.anInt682;
			if (local29 < Static49.anInt947) {
				local29 = Static49.anInt947;
			}
			if (Static191.aClass151_10.anInt4751 + local29 > Static49.anInt947 - -Static168.aClass151_6.anInt4751) {
				local29 = Static49.anInt947 + Static168.aClass151_6.anInt4751 - Static191.aClass151_10.anInt4751;
			}
			@Pc(66) int local66 = local29 - Static165.anInt3088;
			local27 -= Static152.anInt2868;
			if (local27 < Static276.anInt5570) {
				local27 = Static276.anInt5570;
			}
			if (Static276.anInt5570 + Static168.aClass151_6.anInt4773 < local27 + Static191.aClass151_10.anInt4773) {
				local27 = Static168.aClass151_6.anInt4773 + Static276.anInt5570 - Static191.aClass151_10.anInt4773;
			}
			@Pc(110) int local110 = local27 - Static54.anInt1014;
			@Pc(119) int local119 = local29 + Static168.aClass151_6.anInt4747 - Static49.anInt947;
			@Pc(127) int local127 = local27 + Static168.aClass151_6.anInt4757 - Static276.anInt5570;
			if (Static191.aClass151_10.anInt4791 < Static248.anInt4999 && (local32 < local110 || local110 < -local32 || local66 > local32 || local66 < -local32)) {
				Static255.aBoolean363 = true;
			}
			@Pc(171) Class3_Sub24 local171;
			if (Static191.aClass151_10.anObjectArray8 != null && Static255.aBoolean363) {
				local171 = new Class3_Sub24();
				local171.anInt4256 = local127;
				local171.aClass151_13 = Static191.aClass151_10;
				local171.anInt4255 = local119;
				local171.anObjectArray1 = Static191.aClass151_10.anObjectArray8;
				Static161.method2653(local171);
			}
			if (Static39.anInt681 == 0) {
				if (Static255.aBoolean363) {
					if (Static191.aClass151_10.anObjectArray3 != null) {
						local171 = new Class3_Sub24();
						local171.anInt4256 = local127;
						local171.aClass151_13 = Static191.aClass151_10;
						local171.anObjectArray1 = Static191.aClass151_10.anObjectArray3;
						local171.anInt4255 = local119;
						local171.aClass151_14 = Static131.aClass151_4;
						Static161.method2653(local171);
					}
					if (Static131.aClass151_4 != null && Static42.method625(Static191.aClass151_10) != null) {
						Static215.aClass3_Sub26_Sub1_2.method3958(78);
						Static215.aClass3_Sub26_Sub1_2.method3897(Static131.aClass151_4.anInt4776);
						Static215.aClass3_Sub26_Sub1_2.method3886(Static191.aClass151_10.anInt4800);
						Static215.aClass3_Sub26_Sub1_2.method3949(Static131.aClass151_4.anInt4800);
						Static215.aClass3_Sub26_Sub1_2.method3892(Static191.aClass151_10.anInt4776);
					}
				} else if ((Static11.anInt5182 == 1 || Static60.method598(Static152.anInt2876 - 1)) && Static152.anInt2876 > 2) {
					Static173.method2867();
				} else if (Static152.anInt2876 > 0) {
					Static138.method2355();
				}
				Static191.aClass151_10 = null;
			}
		} else if (Static248.anInt4999 > 1) {
			Static191.aClass151_10 = null;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
	public static void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
		Static215.aClass3_Sub26_Sub1_2.method3907(20);
		Static215.aClass3_Sub26_Sub1_2.method3907(arg3);
		Static215.aClass3_Sub26_Sub1_2.method3907(arg2);
		Static215.aClass3_Sub26_Sub1_2.method3938(arg0);
		Static215.aClass3_Sub26_Sub1_2.method3938(arg1);
		Static254.anInt5245 = 0;
		Static205.anInt4056 = -3;
		Static214.anInt4184 = 1;
		Static93.anInt1701 = 0;
	}
}
