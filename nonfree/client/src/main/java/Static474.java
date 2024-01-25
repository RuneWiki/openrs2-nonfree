import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
	public static int anInt4535 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIILclient!qt;IIIII)Z")
	public static boolean method4197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class243 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = arg3 - 64;
		Static430.anIntArrayArray124[64][64] = 99;
		@Pc(28) int local28 = arg2 - 64;
		Static219.anIntArrayArray45[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static159.anIntArray267[0] = arg3;
		@Pc(50) int local50 = 0;
		@Pc(53) int local53 = local36 + 1;
		Static266.anIntArray423[0] = arg2;
		@Pc(58) int[][] local58 = arg5.anIntArrayArray95;
		while (local50 != local53) {
			local9 = Static266.anIntArray423[local50];
			local7 = Static159.anIntArray267[local50];
			@Pc(73) int local73 = local7 - local17;
			@Pc(78) int local78 = local9 - arg5.anInt7169;
			@Pc(84) int local84 = local7 - arg5.anInt7190;
			local50 = local50 + 1 & 0xFFF;
			@Pc(95) int local95 = local9 - local28;
			if (arg1 == -4) {
				if (local7 == arg9 && arg8 == local9) {
					Static106.anInt2252 = local7;
					Static140.anInt2808 = local9;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static116.method2268(arg0, 1, arg9, local7, arg8, local9, 1, arg7)) {
					Static140.anInt2808 = local9;
					Static106.anInt2252 = local7;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg5.method6465(arg6, arg7, arg8, arg9, local9, 1, 1, local7, arg0)) {
					Static106.anInt2252 = local7;
					Static140.anInt2808 = local9;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg5.method6464(1, local7, arg8, arg0, arg9, arg7, local9, arg6)) {
					Static140.anInt2808 = local9;
					Static106.anInt2252 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg5.method6461(arg4, arg8, arg1, arg9, local7, 1, local9)) {
					Static140.anInt2808 = local9;
					Static106.anInt2252 = local7;
					return true;
				}
			} else if (arg5.method6463(arg4, arg9, local9, local7, arg1, 1, arg8)) {
				Static140.anInt2808 = local9;
				Static106.anInt2252 = local7;
				return true;
			}
			@Pc(246) int local246 = Static219.anIntArrayArray45[local73][local95] + 1;
			if (local73 > 0 && Static430.anIntArrayArray124[local73 - 1][local95] == 0 && (local58[local84 - 1][local78] & 0x42240000) == 0) {
				Static159.anIntArray267[local53] = local7 - 1;
				Static266.anIntArray423[local53] = local9;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local73 - 1][local95] = 2;
				Static219.anIntArrayArray45[local73 - 1][local95] = local246;
			}
			if (local73 < 127 && Static430.anIntArrayArray124[local73 + 1][local95] == 0 && (local58[local84 + 1][local78] & 0x60240000) == 0) {
				Static159.anIntArray267[local53] = local7 + 1;
				Static266.anIntArray423[local53] = local9;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local73 + 1][local95] = 8;
				Static219.anIntArrayArray45[local73 + 1][local95] = local246;
			}
			if (local95 > 0 && Static430.anIntArrayArray124[local73][local95 - 1] == 0 && (local58[local84][local78 - 1] & 0x40A40000) == 0) {
				Static159.anIntArray267[local53] = local7;
				Static266.anIntArray423[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local73][local95 - 1] = 1;
				Static219.anIntArrayArray45[local73][local95 - 1] = local246;
			}
			if (local95 < 127 && Static430.anIntArrayArray124[local73][local95 + 1] == 0 && (local58[local84][local78 + 1] & 0x48240000) == 0) {
				Static159.anIntArray267[local53] = local7;
				Static266.anIntArray423[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local73][local95 + 1] = 4;
				Static219.anIntArrayArray45[local73][local95 + 1] = local246;
			}
			if (local73 > 0 && local95 > 0 && Static430.anIntArrayArray124[local73 - 1][local95 - 1] == 0 && (local58[local84 - 1][local78 - 1] & 0x43A40000) == 0 && (local58[local84 - 1][local78] & 0x42240000) == 0 && (local58[local84][local78 - 1] & 0x40A40000) == 0) {
				Static159.anIntArray267[local53] = local7 - 1;
				Static266.anIntArray423[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local73 - 1][local95 - 1] = 3;
				Static219.anIntArrayArray45[local73 - 1][local95 - 1] = local246;
			}
			if (local73 < 127 && local95 > 0 && Static430.anIntArrayArray124[local73 + 1][local95 - 1] == 0 && (local58[local84 + 1][local78 - 1] & 0x60E40000) == 0 && (local58[local84 + 1][local78] & 0x60240000) == 0 && (local58[local84][local78 - 1] & 0x40A40000) == 0) {
				Static159.anIntArray267[local53] = local7 + 1;
				Static266.anIntArray423[local53] = local9 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local73 + 1][local95 - 1] = 9;
				Static219.anIntArrayArray45[local73 + 1][local95 - 1] = local246;
			}
			if (local73 > 0 && local95 < 127 && Static430.anIntArrayArray124[local73 - 1][local95 + 1] == 0 && (local58[local84 - 1][local78 + 1] & 0x4E240000) == 0 && (local58[local84 - 1][local78] & 0x42240000) == 0 && (local58[local84][local78 + 1] & 0x48240000) == 0) {
				Static159.anIntArray267[local53] = local7 - 1;
				Static266.anIntArray423[local53] = local9 + 1;
				Static430.anIntArrayArray124[local73 - 1][local95 + 1] = 6;
				local53 = local53 + 1 & 0xFFF;
				Static219.anIntArrayArray45[local73 - 1][local95 + 1] = local246;
			}
			if (local73 < 127 && local95 < 127 && Static430.anIntArrayArray124[local73 + 1][local95 + 1] == 0 && (local58[local84 + 1][local78 + 1] & 0x78240000) == 0 && (local58[local84 + 1][local78] & 0x60240000) == 0 && (local58[local84][local78 + 1] & 0x48240000) == 0) {
				Static159.anIntArray267[local53] = local7 + 1;
				Static266.anIntArray423[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static430.anIntArrayArray124[local73 + 1][local95 + 1] = 12;
				Static219.anIntArrayArray45[local73 + 1][local95 + 1] = local246;
			}
		}
		Static106.anInt2252 = local7;
		Static140.anInt2808 = local9;
		return false;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZ)V")
	public static void method4198(@OriginalArg(1) boolean arg0) {
		Static336.anInt6245 = 0;
		Static363.anInt6549 = 0;
		Static423.method6608();
		Static287.method6884(arg0);
		Static530.method8090();
		@Pc(26) boolean local26 = false;
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < Static363.anInt6549; local28++) {
			local34 = Static314.anIntArray469[local28];
			@Pc(41) Class1_Sub41 local41 = (Class1_Sub41) Static362.aClass230_46.method6144((long) local34);
			@Pc(44) Class20_Sub1_Sub1_Sub2 local44 = local41.aClass20_Sub1_Sub1_Sub2_2;
			if (Static238.aBoolean354 && Static79.method1792(local34)) {
				Static47.method5107();
			}
			if (Static445.anInt7791 != local44.anInt8985) {
				if (local44.aClass283_1.method7376()) {
					Static231.method4171(local44);
				}
				local44.method7826(null);
				local41.method8239();
				local26 = true;
			}
		}
		if (local26) {
			Static342.anInt6322 = Static362.aClass230_46.method6138();
			Static362.aClass230_46.method6143(Static35.aClass1_Sub41Array1);
		}
		if (Static352.aClass1_Sub17_Sub2_2.anInt4872 != Static494.anInt8660) {
			throw new RuntimeException("gnp1 pos:" + Static352.aClass1_Sub17_Sub2_2.anInt4872 + " psize:" + Static494.anInt8660);
		}
		for (local34 = 0; local34 < Static141.anInt2822; local34++) {
			if (Static362.aClass230_46.method6144((long) Static220.anIntArray339[local34]) == null) {
				throw new RuntimeException("gnp2 pos:" + local34 + " size:" + Static141.anInt2822);
			}
		}
	}
}
