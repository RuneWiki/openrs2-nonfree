import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "[I")
	public static final int[] anIntArray531 = new int[2];

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "[I")
	public static final int[] anIntArray532 = new int[2];

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "(I)Lclient!g;")
	public static Class96_Sub1 method7375() {
		return Static528.aClass96_Sub1Array2.length > Static118.anInt2567 ? Static528.aClass96_Sub1Array2[Static118.anInt2567++] : null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[IIZI[I[IZ[[[BBIII[II[III)V")
	public static void method7377(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(8) byte[][][] arg6, @OriginalArg(9) byte arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int[] arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int[] arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15) {
		if (Static234.anInt4427 == -1) {
			return;
		}
		@Pc(13) int[] local13 = Static398.aClass5_13.Y();
		@Pc(17) int local17 = local13[0];
		@Pc(26) int local26 = local13[1];
		@Pc(30) int local30 = local13[2];
		@Pc(34) int local34 = local13[3];
		@Pc(36) int local36 = local30;
		@Pc(38) int local38 = local34;
		if (Static234.anInt4427 == 1) {
			local36 = (int) ((double) Static107.anInt2317 * (double) local30 / (double) Static430.anInt7728);
			local38 = (int) ((double) Static107.anInt2317 * (double) local34 / (double) Static430.anInt7728);
		}
		if (!Static585.aBoolean690) {
			if (Static234.anInt4427 == 1) {
				Static384.method6206();
			}
			@Pc(75) int local75 = arg15 - Static598.anInt9781;
			@Pc(80) int local80 = arg9 - Static542.anInt9213;
			@Pc(85) int local85 = arg12 - Static274.anInt4970;
			@Pc(107) int local107 = (int) ((Static478.aDouble29 * (double) local85 + Static70.aDouble25 * (double) local75 + (double) local80 * Static638.aDouble37) * (double) local36 / (double) arg10);
			@Pc(129) int local129 = (int) (((double) local75 * Static547.aDouble4 + Static100.aDouble6 * (double) local80 + (double) local85 * Static49.aDouble5) * (double) local38 / (double) arg10);
			@Pc(144) double local144 = (double) local80 * Static225.aDouble30 + (double) local75 * Static116.aDouble7 + (double) local85 * Static545.aDouble34;
			@Pc(151) int local151 = local107 + Static39.anInt1252 - Static98.anInt2236;
			@Pc(158) int local158 = local129 + Static505.anInt8728 - Static342.anInt6683;
			@Pc(162) int local162 = Static245.anInt4546 + local151;
			@Pc(166) int local166 = Static107.anInt2317 + local158;
			if (local151 >= 0 && local158 >= 0 && Static476.anInt8315 >= local162 && local166 <= Static430.anInt7728 || Static234.anInt4427 == 2) {
				Static631.anInt10100 = local158;
				if (Static234.anInt4427 == 2) {
					Static572.aDouble32 = -local144;
				}
				Static207.anInt4031 = local151;
			} else if (local162 > 0 && local166 > 0 && Static476.anInt8315 > local151 && Static430.anInt7728 > local158) {
				@Pc(218) int local218 = local151 - Static39.anInt1252;
				@Pc(222) int local222 = local158 - Static505.anInt8728;
				@Pc(224) int local224 = 0;
				@Pc(226) int local226 = 0;
				@Pc(228) int local228 = 0;
				@Pc(230) int local230 = 0;
				@Pc(232) double local232 = 0.0D;
				if (Static234.anInt4427 == 0) {
					local232 = local144 + Static572.aDouble32;
					local224 = local218;
					local226 = local222;
				} else if (Static234.anInt4427 == 1) {
					local230 = local222 / Static159.anInt3138;
					local228 = local218 / Static153.anInt3029;
					local224 = Static153.anInt3029 * local228;
					local226 = Static159.anInt3138 * local230;
					local232 = (double) (local222 * local226 + local218 * local224) * (local144 + Static572.aDouble32) / (double) (local222 * local222 + local218 * local218);
				}
				local232 = -local232;
				@Pc(295) int local295 = 0;
				@Pc(297) int local297 = 0;
				@Pc(299) int local299 = 0;
				@Pc(301) int local301 = 0;
				@Pc(303) int local303 = 0;
				@Pc(308) int local308;
				@Pc(312) int local312;
				@Pc(314) int local314;
				@Pc(316) int local316;
				if (local224 < 0) {
					local308 = -local224;
					local312 = local224 + Static476.anInt8315;
					local314 = 0;
					local316 = local308;
					if (Static234.anInt4427 == 1) {
						local303 = -local228;
						local299 = 0;
					}
				} else {
					local308 = 0;
					local312 = Static476.anInt8315 - local224;
					if (Static234.anInt4427 == 1) {
						local303 = local228;
						local299 = Static330.anInt6169 - local228;
					}
					local314 = local312;
					local316 = local224;
				}
				@Pc(351) int local351 = 0;
				@Pc(355) int local355;
				@Pc(360) int local360;
				@Pc(379) int local379;
				@Pc(381) int local381;
				@Pc(364) int local364;
				if (local226 >= 0) {
					local355 = 0;
					local360 = Static430.anInt7728 - local226;
					local364 = 0;
					if (Static234.anInt4427 == 1) {
						local301 = 0;
						local295 = Static592.anInt9706 - local230;
						local297 = local230;
						local351 = local295;
					}
					local379 = local360;
					local381 = local226;
				} else {
					local355 = -local226;
					local360 = Static430.anInt7728 + local226;
					local379 = 0;
					local381 = local355;
					local364 = local355;
					if (Static234.anInt4427 == 1) {
						local295 = 0;
						local297 = -local230;
						local351 = local230 + Static592.anInt9706;
						local301 = local297;
					}
				}
				@Pc(415) Class120 local415 = Static308.aClass301_1.aClass120_6;
				@Pc(429) int local429;
				for (@Pc(420) Class4_Sub8 local420 = (Class4_Sub8) local415.method2966(); local420 != null; local420 = (Class4_Sub8) local415.method2962()) {
					@Pc(425) Class4_Sub5[] local425 = local420.aClass4_Sub5Array1;
					@Pc(427) boolean local427 = true;
					for (local429 = 0; local429 < local425.length; local429++) {
						@Pc(435) Class4_Sub5 local435 = local425[local429];
						@Pc(438) int local438 = local435.anInt7142;
						@Pc(441) int local441 = local435.anInt7144;
						@Pc(444) int local444 = local435.anInt7143;
						@Pc(447) int local447 = local435.anInt7145;
						@Pc(454) int local454;
						local435.anInt7143 = local454 = local444 - local224;
						@Pc(458) int local458 = local435.anInt7146;
						@Pc(464) int local464;
						local435.anInt7145 = local464 = local447 - local226;
						@Pc(472) int local472;
						local435.anInt7142 = local472 = local438 - local224;
						@Pc(479) int local479;
						local435.anInt7144 = local479 = local441 - local226;
						if (local427) {
							@Pc(492) int local492 = (local454 > local472 ? local472 : local454) - local458;
							if (local492 <= Static476.anInt8315) {
								@Pc(508) int local508 = (local479 >= local464 ? local464 : local479) - local458;
								if (local508 <= Static430.anInt7728) {
									@Pc(524) int local524 = local458 + (local454 > local472 ? local454 : local472);
									if (local524 >= 0) {
										@Pc(538) int local538 = local458 + (local464 <= local479 ? local479 : local464);
										if (local538 >= 0) {
											local427 = false;
										}
									}
								}
							}
						}
					}
					if (local427) {
						local420.method7841();
						Static427.method6667(local420);
					}
				}
				if (Static234.anInt4427 == 0) {
					Static398.aClass5_13.method7527(Static613.anInterface8_1);
				}
				Static398.aClass5_13.F(-local224, -local226);
				Static398.aClass5_13.b(local308, local355, local312, local360, local232);
				Static220.method3684(Static572.aDouble32 + local232);
				Static617.aDouble35 = local232 + Static572.aDouble32;
				if (Static234.anInt4427 == 1) {
					Static140.anInt2835 = local26 - local226 - Static342.anInt6683;
					Static368.anInt6967 = local17 - local224 - Static98.anInt2236;
					Static46.anInt1328 = local38;
					Static525.anInt4734 = local36;
					Static398.aClass5_13.DA(Static368.anInt6967, Static140.anInt2835, Static525.anInt4734, Static46.anInt1328);
				} else {
					Static140.anInt2835 = local26 + Static505.anInt8728 - Static342.anInt6683 - local226;
					Static525.anInt4734 = local36;
					Static46.anInt1328 = local38;
					Static368.anInt6967 = local17 + Static39.anInt1252 - local224 - Static98.anInt2236;
					Static398.aClass5_13.DA(Static368.anInt6967, Static140.anInt2835, Static525.anInt4734, Static46.anInt1328);
				}
				Static564.method8103(Static308.aClass301_1);
				if (local381 > 0) {
					Static398.aClass5_13.KA(0, local379, Static476.anInt8315, local381 + local379);
					Static398.aClass5_13.ya();
					Static398.aClass5_13.GA(Static413.anInt7536);
					Static623.method8626(arg2, arg15, arg9, arg12, arg6, arg1, arg5, arg13, arg4, arg11, arg8, arg7, arg0, arg14, arg3, arg10, 1, false);
				}
				if (local316 > 0) {
					Static398.aClass5_13.KA(local314, local364, local316 + local314, local364 + local360);
					Static398.aClass5_13.ya();
					Static398.aClass5_13.GA(Static413.anInt7536);
					Static623.method8626(arg2, arg15, arg9, arg12, arg6, arg1, arg5, arg13, arg4, arg11, arg8, arg7, arg0, arg14, arg3, arg10, 1, false);
				}
				Static398.aClass5_13.la();
				Static555.method8008();
				if (Static234.anInt4427 == 0) {
					Static398.aClass5_13.method7535();
				}
				Static98.anInt2236 += local224;
				Static572.aDouble32 += local232;
				Static342.anInt6683 += local226;
				Static207.anInt4031 = Static39.anInt1252 + local107 - Static98.anInt2236;
				Static631.anInt10100 = local129 + Static505.anInt8728 - Static342.anInt6683;
				if (Static234.anInt4427 == 1) {
					Static408.anInt7470 += local228;
					Static596.anInt9751 += local230;
					for (@Pc(782) int local782 = 0; local782 < Static592.anInt9706; local782++) {
						@Pc(793) int local793 = Static583.method8236(local782 + Static596.anInt9751, Static592.anInt9706) * Static330.anInt6169;
						for (local429 = 0; local429 < Static330.anInt6169; local429++) {
							@Pc(807) int local807 = Static583.method8236(local429 + Static408.anInt7470, Static330.anInt6169) + local793;
							@Pc(839) boolean local839 = local782 >= local295 && local782 < local295 + local297 || local782 >= local301 && local782 < local301 + local351 && local429 >= local299 && local429 < local303 + local299;
							Static440.anInterface8Array1[local807].method8530(Static153.anInt3029 * local429, Static159.anInt3138 * local782, Static153.anInt3029, Static159.anInt3138, local839);
						}
					}
				}
			} else {
				Static585.aBoolean690 = true;
			}
		}
		if (Static585.aBoolean690) {
			Static207.anInt4031 = Static39.anInt1252;
			Static572.aDouble32 = 0.0D;
			Static542.anInt9213 = arg9;
			Static274.anInt4970 = arg12;
			Static342.anInt6683 = 0;
			Static631.anInt10100 = Static505.anInt8728;
			Static598.anInt9781 = arg15;
			Static98.anInt2236 = 0;
			if (Static234.anInt4427 == 0) {
				Static398.aClass5_13.method7527(Static613.anInterface8_1);
			}
			Static398.aClass5_13.la();
			Static398.aClass5_13.ya();
			Static398.aClass5_13.GA(Static413.anInt7536);
			Static72.aClass39_3.method7249(Static598.anInt9781, Static542.anInt9213, Static274.anInt4970, Static176.anInt3424, Static26.anInt961, Static222.anInt4226);
			Static398.aClass5_13.method7504(Static72.aClass39_3);
			if (Static234.anInt4427 == 1) {
				Static46.anInt1328 = local38;
				Static525.anInt4734 = local36;
				Static140.anInt2835 = local26;
				Static368.anInt6967 = local17;
				Static398.aClass5_13.DA(Static368.anInt6967, Static140.anInt2835, Static525.anInt4734, Static46.anInt1328);
			} else {
				Static46.anInt1328 = local38;
				Static525.anInt4734 = local36;
				Static368.anInt6967 = local17 + Static39.anInt1252;
				Static140.anInt2835 = local26 + Static505.anInt8728;
				Static398.aClass5_13.DA(Static368.anInt6967, Static140.anInt2835, Static525.anInt4734, Static46.anInt1328);
			}
			Static617.aDouble35 = 0.0D;
			Static308.aClass301_1.method7458();
			Static564.method8103(Static308.aClass301_1);
			Static623.method8626(arg2, arg15, arg9, arg12, arg6, arg1, arg5, arg13, arg4, arg11, arg8, arg7, arg0, arg14, arg3, arg10, 1, false);
			Static555.method8008();
			Static585.aBoolean690 = false;
			if (Static234.anInt4427 == 0) {
				Static398.aClass5_13.method7535();
			}
			if (Static234.anInt4427 == 1) {
				Static129.method2513();
			}
		}
		if (Static234.anInt4427 == 0) {
			Static613.anInterface8_1.method8529(Static207.anInt4031, Static631.anInt10100, Static245.anInt4546, Static107.anInt2317, 0, 0);
		}
		Static576.anInt9495++;
		Static220.method3684(Static572.aDouble32);
		Static602.aDouble33 = Static572.aDouble32;
		if (Static234.anInt4427 == 0 || Static234.anInt4427 == 2) {
			if (Static234.anInt4427 == 2) {
				Static398.aClass5_13.GA(Static413.anInt7536);
				Static398.aClass5_13.ya();
			}
			Static504.anInt8719 = local38;
			Static395.anInt7324 = local17 + Static39.anInt1252 - Static98.anInt2236 - Static207.anInt4031;
			Static608.anInt9869 = local36;
			Static259.anInt4785 = local26 + Static505.anInt8728 - Static342.anInt6683 - Static631.anInt10100;
			Static398.aClass5_13.DA(Static395.anInt7324, Static259.anInt4785, Static608.anInt9869, Static504.anInt8719);
		} else if (Static234.anInt4427 == 1) {
			Static608.anInt9869 = local36;
			Static259.anInt4785 = local26 - Static342.anInt6683;
			Static504.anInt8719 = local38;
			Static395.anInt7324 = local17 - Static98.anInt2236;
			Static398.aClass5_13.DA(Static395.anInt7324, Static259.anInt4785, Static608.anInt9869, Static504.anInt8719);
			Static398.aClass5_13.KA(Static207.anInt4031, Static631.anInt10100, Static207.anInt4031 + Static245.anInt4546, Static107.anInt2317 + Static631.anInt10100);
		}
		Static623.method8626(arg2, arg15, arg9, arg12, arg6, arg1, arg5, arg13, arg4, arg11, arg8, arg7, arg0, arg14, arg3, arg10, Static234.anInt4427 == 2 ? 0 : 2, Static234.anInt4427 == 1);
		Static398.aClass5_13.la();
		Static398.aClass5_13.DA(local17, local26, local30, local34);
	}
}
