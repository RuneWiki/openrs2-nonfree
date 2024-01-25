import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	public static int anInt5672;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([[IZILclient!ja;I)V")
	public static void method5150(@OriginalArg(0) int[][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class81 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
			@Pc(19) int[][] local19;
			@Pc(21) int local21;
			@Pc(25) int local25;
			if (arg0 == null) {
				local19 = null;
			} else {
				local19 = new int[Static153.anInt2883 + 1][Static246.anInt4606 + 1];
				for (local21 = 0; local21 <= Static246.anInt4606; local21++) {
					for (local25 = 0; local25 <= Static153.anInt2883; local25++) {
						local19[local25][local21] = Static5.anIntArrayArrayArray1[local7][local25][local21] - arg0[local25][local21];
					}
				}
			}
			local21 = 0;
			local25 = 0;
			if (!arg1) {
				if (Static194.aBoolean277) {
					local21 = 2;
				}
				if (Static20.aBoolean26) {
					local25 = 8;
				}
				if (Static282.anInt5340 != 0) {
					if (local7 == 0 || Static183.anInt3439 >= 96) {
						local25 |= 0x10;
					}
					local21 |= 0x1;
				}
			}
			if (Static194.aBoolean277) {
				local25 |= 0x7;
			}
			@Pc(113) Class106 local113 = arg3.method3008(Static153.anInt2883, Static246.anInt4606, Static5.anIntArrayArrayArray1[local7], local19, local21, local25);
			Static207.method3716(local7, local113);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BIII)V")
	public static void method5151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1012) {
			Static140.method2657(10, arg1, arg0);
		} else if (arg2 == 1009) {
			Static140.method2657(11, arg1, arg0);
		} else if (arg2 == 1011) {
			Static140.method2657(12, arg1, arg0);
		} else if (arg2 == 1007) {
			Static140.method2657(13, arg1, arg0);
			return;
		} else if (arg2 == 1006) {
			Static140.method2657(14, arg1, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIILclient!ja;I)V")
	public static void method5154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class81 arg3, @OriginalArg(5) int arg4) {
		arg3.method3033(arg2, arg1, arg2 + arg0, arg4 + arg1);
		arg3.method3017(arg4, -16777216, arg0, arg2, arg1);
		if (Static271.anInt5044 < 100) {
			return;
		}
		@Pc(34) float local34 = (float) Static307.anInt1198 / (float) Static307.anInt1202;
		@Pc(36) int local36 = arg0;
		@Pc(38) int local38 = arg4;
		if (local34 < 1.0F) {
			local38 = (int) (local34 * (float) arg0);
		} else {
			local36 = (int) ((float) arg4 / local34);
		}
		@Pc(65) int local65 = arg1 + (arg4 - local38) / 2;
		@Pc(73) int local73 = arg2 + (arg0 - local36) / 2;
		if (Static71.aClass40_3 == null || arg0 != Static71.aClass40_3.method5071() || arg4 != Static71.aClass40_3.method5075()) {
			Static307.method1095(Static307.anInt1200, Static307.anInt1198 + Static307.anInt1195, Static307.anInt1200 + Static307.anInt1202, Static307.anInt1195, local73, local65, local36 + local73, local65 + local38);
			Static307.method1097(arg3);
			Static71.aClass40_3 = arg3.method2967(local73, local65, local36, local38, false);
		}
		Static71.aClass40_3.method5077(local73, local65);
		@Pc(128) int local128 = Static31.anInt575 * local36 / Static307.anInt1202;
		@Pc(134) int local134 = Static323.anInt5956 * local38 / Static307.anInt1198;
		@Pc(142) int local142 = local73 + local36 * Static206.anInt3782 / Static307.anInt1202;
		@Pc(157) int local157 = local65 + local38 - local134 - local38 * Static29.anInt561 / Static307.anInt1198;
		@Pc(159) int local159 = -1996554240;
		if (Static105.anInt1941 == 1) {
			local159 = -1996488705;
		}
		arg3.method2962(local142, local157, local128, local134, local159, 1);
		arg3.method2992(local142, local157, local128, local134, local159, 0);
		if (Static41.anInt6388 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static297.anInt5578 <= 50) {
			local194 = Static297.anInt5578 * 5;
		} else {
			local194 = 500 - Static297.anInt5578 * 5;
		}
		for (@Pc(208) Class6_Sub35 local208 = (Class6_Sub35) Static307.aClass211_7.method5594(); local208 != null; local208 = (Class6_Sub35) Static307.aClass211_7.method5582()) {
			@Pc(215) Class165 local215 = Static345.method5701(local208.anInt5312);
			if (Static299.method5133(local215)) {
				@Pc(232) int local232;
				@Pc(244) int local244;
				if (Static151.anInt2868 == local208.anInt5312) {
					local232 = local208.anInt5320 * local36 / Static307.anInt1202 + local73;
					local244 = local65 + (Static307.anInt1198 - local208.anInt5324) * local38 / Static307.anInt1198;
					arg3.method3017(4, local194 << 24 | 0xFFFF00, 4, local232 - 2, local244 + -2);
				} else if (Static204.anInt3768 != -1 && local215.anInt4700 == Static204.anInt3768) {
					local232 = local208.anInt5320 * local36 / Static307.anInt1202 + local73;
					local244 = local38 * (Static307.anInt1198 - local208.anInt5324) / Static307.anInt1198 + local65;
					arg3.method3017(4, local194 << 24 | 0xFFFF00, 4, local232 - 2, local244 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V")
	public static void method5155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static311.anInt5837 <= arg1 - arg5 && arg5 + arg1 <= Static265.anInt4933 && Static327.anInt3039 <= arg4 - arg5 && arg4 + arg5 <= Static230.anInt4308) {
			Static326.method5431(arg1, arg3, arg0, arg4, arg2, arg5);
		} else {
			Static221.method3915(arg2, arg5, arg0, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ja;IILclient!po;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5156(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class72 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static289.aClass81_6 = arg0;
		Static23.anInt367 = arg1;
		Static213.aClass72_4 = arg3;
		Static2.aBoolean8 = Static289.aClass81_6.method3038() > 0;
		Static339.anInt6187 = arg4 >> 7;
		Static8.anInt3154 = arg6 >> 7;
		Static209.anInt3813 = arg4;
		Static256.anInt4741 = arg6;
		Static81.anInt1473 = arg5;
		Static107.anInt1991 = Static339.anInt6187 - Static30.anInt573;
		if (Static107.anInt1991 < 0) {
			Static28.anInt540 = -Static107.anInt1991;
			Static107.anInt1991 = 0;
		} else {
			Static28.anInt540 = 0;
		}
		Static23.anInt378 = Static8.anInt3154 - Static30.anInt573;
		if (Static23.anInt378 < 0) {
			Static2.anInt45 = -Static23.anInt378;
			Static23.anInt378 = 0;
		} else {
			Static2.anInt45 = 0;
		}
		Static236.anInt2368 = Static339.anInt6187 + Static30.anInt573;
		if (Static236.anInt2368 > Static310.anInt5828) {
			Static236.anInt2368 = Static310.anInt5828;
		}
		Static305.anInt5784 = Static8.anInt3154 + Static30.anInt573;
		if (Static305.anInt5784 > Static163.anInt3084) {
			Static305.anInt5784 = Static163.anInt3084;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static30.anInt573 + Static30.anInt573 + 2; local74++) {
			for (local77 = 0; local77 < Static30.anInt573 + Static30.anInt573 + 2; local77++) {
				local84 = Static339.anInt6187 + local74 - Static30.anInt573;
				local90 = Static8.anInt3154 + local77 - Static30.anInt573;
				if (local84 >= 0 && local90 >= 0 && local84 < Static310.anInt5828 && local90 < Static163.anInt3084) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static99.aClass106Array4[3].method5720(local84, local90) - 1000;
					@Pc(137) int local137 = Static84.aClass106Array1 == null ? Static99.aClass106Array4[0].method5720(local84, local90) + 128 : Static84.aClass106Array1[0].method5720(local84, local90) + 128;
					Static266.aBooleanArrayArray6[local74][local77] = Static289.aClass81_6.method2972(local104, local117, local108, local104, local137, local108);
				} else {
					Static266.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static30.anInt573 + Static30.anInt573 + 1; local77++) {
			for (local84 = 0; local84 < Static30.anInt573 + Static30.anInt573 + 1; local84++) {
				Static258.aBooleanArrayArray5[local77][local84] = Static266.aBooleanArrayArray6[local77][local84] || Static266.aBooleanArrayArray6[local77 + 1][local84] || Static266.aBooleanArrayArray6[local77][local84 + 1] || Static266.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static12.anIntArray21 = arg8;
		Static183.anIntArray399 = arg9;
		Static110.anIntArray276 = arg10;
		Static71.anIntArray146 = arg11;
		Static230.anIntArray486 = arg12;
		Static68.method4000();
		Static244.method4299();
		for (@Pc(253) Class20_Sub6 local253 = (Class20_Sub6) Static66.aClass109_2.method2948(); local253 != null; local253 = (Class20_Sub6) Static66.aClass109_2.method2939()) {
			local253.method5103();
			Static226.method4030(local253);
		}
		if (Static2.aBoolean8) {
			for (local90 = 0; local90 < Static105.anInt1943; local90++) {
				Static240.aClass6_Sub17_Sub1Array4[local90].method2486(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static289.aClass81_6.method2982(0);
			if (Static59.aClass155_1 == null || Static59.aClass155_1 instanceof Class155_Sub2) {
				Static59.aClass155_1 = new Class155_Sub1();
			}
		} else if (Static59.aClass155_1 == null || Static59.aClass155_1 instanceof Class155_Sub1) {
			Static59.aClass155_1 = new Class155_Sub2();
		}
		Static59.aClass155_1.method5571(arg2);
		Static59.aClass155_1.method5569();
		if (Static287.aClass187ArrayArrayArray2 != null) {
			Static44.method762(true);
			Static59.aClass155_1.method5570(22);
			Static298.method5107(arg2, null, 0, (byte) 0, arg15, arg16);
			Static59.aClass155_1.method5569();
			Static59.aClass155_1.method5570(23);
			Static44.method762(false);
		}
		Static298.method5107(arg2, arg7, arg13, arg14, arg15, arg16);
		Static59.aClass155_1.method5569();
		Static59.aClass155_1.method5572();
		Static59.aClass155_1.method5569();
		if (arg2 > 1) {
			Static289.aClass81_6.method3039(0);
		}
		Static289.aClass81_6.method3036(0, null);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)V")
	public static void method5157() {
		Static21.anInt335 = -1;
		Static281.aBoolean369 = false;
		Static252.aClass53_117 = null;
		Static319.anInt5902 = 1;
		Static76.anInt2855 = 0;
		Static16.anInt300 = -1;
		Static281.anInt5318 = 2;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Z")
	public static boolean method5159(@OriginalArg(1) int arg0) {
		Static124.aBoolean193 = true;
		Static31.anInt579 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
