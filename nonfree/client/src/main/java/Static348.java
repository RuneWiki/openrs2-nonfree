import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!tr;")
	public static Class110 aClass110_12;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	public static int anInt4437;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public static int anInt4438 = 0;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	public static int anInt4439 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILclient!np;ILclient!dt;)V")
	public static void method4045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class155 arg2, @OriginalArg(4) Class62 arg3) {
		@Pc(14) Class38 local14 = arg3.method1292(arg2);
		if (local14 == null) {
			return;
		}
		arg2.method4867(arg1, arg0, arg3.anInt1546 + arg1, arg3.anInt1551 + arg0);
		if (Static154.anInt6085 == 2 || Static154.anInt6085 == 5 || Static346.aClass110_17 == null) {
			arg2.method4918(local14, arg1, arg0);
			return;
		}
		@Pc(57) int local57;
		@Pc(49) int local49;
		@Pc(55) int local55;
		@Pc(59) int local59;
		if (Static88.anInt1815 == 4) {
			local49 = Static268.anInt4726;
			local55 = (int) -Static352.aFloat68 & 0x3FFF;
			local57 = Static71.anInt1429;
			local59 = 4096;
		} else {
			local55 = (int) -Static352.aFloat68 + Static129.anInt2435 & 0x3FFF;
			local59 = 4096 - Static187.anInt3396 * 16;
			local57 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774;
			local49 = Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766;
		}
		@Pc(95) int local95 = local57 / 32 + 48 - (Static12.anInt161 - 104) * 2;
		@Pc(112) int local112 = Static44.anInt787 * 4 + 48 + 208 - local49 / 32 - Static44.anInt787 * 2;
		Static346.aClass110_17.method5096((float) arg3.anInt1546 / 2.0F + (float) arg1, (float) arg3.anInt1551 / 2.0F + (float) arg0, (float) local95, (float) local112, local59, local55 << 2, local14, arg1, arg0);
		@Pc(163) int local163;
		@Pc(173) int local173;
		@Pc(184) int local184;
		@Pc(195) int local195;
		for (@Pc(146) Class3_Sub28 local146 = (Class3_Sub28) Static286.aClass138_45.method3051(); local146 != null; local146 = (Class3_Sub28) Static286.aClass138_45.method3050()) {
			@Pc(151) int local151 = local146.anInt3982;
			local163 = (Static384.aClass169_3.anIntArray480[local151] >> 14 & 0x3FFF) - Static21.anInt265;
			local173 = (Static384.aClass169_3.anIntArray480[local151] & 0x3FFF) - Static103.anInt2044;
			local184 = local163 * 4 + 2 - local57 / 32;
			local195 = local173 * 4 + 2 - local49 / 32;
			Static289.method4515(local184, arg1, arg0, local195, Static384.aClass169_3.anIntArray481[local151], arg3, arg2, local14);
		}
		for (local163 = 0; local163 < Static205.anInt327; local163++) {
			local173 = Static323.anIntArray602[local163] * 4 + 2 - local57 / 32;
			local184 = Static282.anIntArray545[local163] * 4 + 2 - local49 / 32;
			@Pc(252) Class60 local252 = Static97.aClass217_4.method5007(Static331.anIntArray609[local163]);
			if (local252.anIntArray134 != null) {
				local252 = local252.method1191(Static331.aClass115_1);
				if (local252 == null || local252.anInt1426 == -1) {
					continue;
				}
			}
			Static289.method4515(local173, arg1, arg0, local184, local252.anInt1426, arg3, arg2, local14);
		}
		for (@Pc(289) Class3_Sub16 local289 = (Class3_Sub16) Static384.aClass44_39.method950(); local289 != null; local289 = (Class3_Sub16) Static384.aClass44_39.method949()) {
			local184 = (int) (local289.aLong240 >> 28 & 0x3L);
			if (local184 == Static91.anInt2989) {
				local195 = (int) (local289.aLong240 & 0x3FFFL) * 4 + 2 - local57 / 32;
				@Pc(333) int local333 = (int) (local289.aLong240 >> 14 & 0x3FFFL) * 4 + 2 - local49 / 32;
				Static342.method5171(local333, Static81.aClass110Array3[0], arg1, local14, local195, arg0, arg3);
			}
		}
		@Pc(407) int local407;
		for (local184 = 0; local184 < Static23.anInt305; local184++) {
			@Pc(361) Class28_Sub1_Sub1_Sub1 local361 = Static166.aClass28_Sub1_Sub1_Sub1Array41[Static369.anIntArray664[local184]];
			if (local361 != null && local361.method2971() && Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 == local361.aByte73) {
				@Pc(379) Class61 local379 = local361.aClass61_1;
				if (local379 != null && local379.anIntArray142 != null) {
					local379 = local379.method1216(Static331.aClass115_1);
				}
				if (local379 != null && local379.aBoolean106 && local379.aBoolean102) {
					local407 = local361.anInt5774 / 32 - local57 / 32;
					@Pc(417) int local417 = local361.anInt5766 / 32 - local49 / 32;
					if (local379.lb == -1) {
						Static342.method5171(local417, Static81.aClass110Array3[1], arg1, local14, local407, arg0, arg3);
					} else {
						Static289.method4515(local407, arg1, arg0, local417, local379.lb, arg3, arg2, local14);
					}
				}
			}
		}
		local195 = Static366.anInt4870;
		@Pc(458) int[] local458 = Static3.anIntArray9;
		@Pc(496) int local496;
		@Pc(506) int local506;
		@Pc(510) int local510;
		for (local407 = 0; local407 < local195; local407++) {
			@Pc(468) Class28_Sub1_Sub1_Sub2 local468 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local458[local407]];
			if (local468 != null && local468.method4028() && Static226.aClass28_Sub1_Sub1_Sub2_2 != local468 && local468.aByte73 == Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73) {
				local496 = local468.anInt5774 / 32 - local57 / 32;
				local506 = local468.anInt5766 / 32 - local49 / 32;
				@Pc(508) boolean local508 = false;
				for (local510 = 0; local510 < Static351.anInt3266; local510++) {
					if (local468.aString51.equals(Static244.aStringArray28[local510]) && Static110.anIntArray215[local510] != 0) {
						local508 = true;
						break;
					}
				}
				@Pc(540) boolean local540 = false;
				for (@Pc(542) int local542 = 0; local542 < Static12.anInt159; local542++) {
					if (local468.aString51.equals(Static54.aClass236Array1[local542].aString58)) {
						local540 = true;
						break;
					}
				}
				@Pc(566) boolean local566 = false;
				if (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4401 != 0 && local468.anInt4401 != 0 && local468.anInt4401 == Static226.aClass28_Sub1_Sub1_Sub2_2.anInt4401) {
					local566 = true;
				}
				if (local508) {
					Static342.method5171(local506, Static81.aClass110Array3[3], arg1, local14, local496, arg0, arg3);
				} else if (local540) {
					Static342.method5171(local506, Static81.aClass110Array3[5], arg1, local14, local496, arg0, arg3);
				} else if (local566) {
					Static342.method5171(local506, Static81.aClass110Array3[4], arg1, local14, local496, arg0, arg3);
				} else {
					Static342.method5171(local506, Static81.aClass110Array3[2], arg1, local14, local496, arg0, arg3);
				}
			}
		}
		@Pc(644) Class229[] local644 = Static323.aClass229Array1;
		@Pc(742) int local742;
		for (local496 = 0; local496 < local644.length; local496++) {
			@Pc(652) Class229 local652 = local644[local496];
			if (local652 != null && local652.anInt5877 != 0 && Static76.anInt1617 % 20 < 10) {
				@Pc(710) int local710;
				if (local652.anInt5877 == 1 && local652.anInt5873 >= 0 && Static166.aClass28_Sub1_Sub1_Sub1Array41.length > local652.anInt5873) {
					@Pc(689) Class28_Sub1_Sub1_Sub1 local689 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local652.anInt5873];
					if (local689 != null) {
						local510 = local689.anInt5774 / 32 - local57 / 32;
						local710 = local689.anInt5766 / 32 - local49 / 32;
						Static43.method690(local710, local14, arg3, 360000, local510, arg0, arg1, local652.anInt5876);
					}
				}
				if (local652.anInt5877 == 2) {
					local742 = (local652.anInt5872 - Static21.anInt265) * 4 + 2 - local57 / 32;
					local510 = (local652.anInt5868 - Static103.anInt2044) * 4 + 2 - local49 / 32;
					local710 = local652.anInt5874 * 4;
					local710 *= local710;
					Static43.method690(local510, local14, arg3, local710, local742, arg0, arg1, local652.anInt5876);
				}
				if (local652.anInt5877 == 10 && local652.anInt5873 >= 0 && Static308.aClass28_Sub1_Sub1_Sub2Array1.length > local652.anInt5873) {
					@Pc(793) Class28_Sub1_Sub1_Sub2 local793 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local652.anInt5873];
					if (local793 != null) {
						local510 = local793.anInt5774 / 32 - local57 / 32;
						local710 = local793.anInt5766 / 32 - local49 / 32;
						Static43.method690(local710, local14, arg3, 360000, local510, arg0, arg1, local652.anInt5876);
					}
				}
			}
		}
		if (Static88.anInt1815 == 4) {
			return;
		}
		if (Static361.anInt6050 != 0) {
			local506 = Static361.anInt6050 * 4 + Static226.aClass28_Sub1_Sub1_Sub2_2.method4009() * 2 + 2 - local57 / 32 - 2;
			local742 = Static109.anInt2145 * 4 + (Static226.aClass28_Sub1_Sub1_Sub2_2.method4009() + -1) * 2 + 2 - local49 / 32;
			Static342.method5171(local742, Static30.aClass110Array1[Static66.aBoolean72 ? 1 : 0], arg1, local14, local506, arg0, arg3);
		}
		arg2.method4954(3, arg0 + arg3.anInt1551 / 2 - 1, 3, arg1 + arg3.anInt1546 / 2 - 1, -1);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!nm;)V")
	public static void method4046(@OriginalArg(0) Class28_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort89; local2 <= arg0.aShort88; local2++) {
			for (@Pc(6) int local6 = arg0.aShort87; local6 <= arg0.aShort90; local6++) {
				@Pc(16) Class48 local16 = Static69.aClass48ArrayArrayArray1[arg0.aByte73][local2][local6];
				if (local16 != null) {
					@Pc(21) Class50 local21 = local16.aClass50_1;
					@Pc(23) Class50 local23 = null;
					while (local21 != null) {
						if (local21.aClass28_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass50_1 = local21.aClass50_2;
							} else {
								local23.aClass50_2 = local21.aClass50_2;
							}
							local21.method1009();
							break;
						}
						local23 = local21;
						local21 = local21.aClass50_2;
					}
					local16.aByte13 = 0;
					for (@Pc(56) Class50 local56 = local16.aClass50_1; local56 != null; local56 = local56.aClass50_2) {
						local16.aByte13 = (byte) (local16.aByte13 | local56.anInt1127);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V")
	public static void method4048(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(10, arg0);
		local8.method3217();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BZ)V")
	public static void method4050(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static42.aClass3_Sub7_Sub16_2 != null) {
			Static22.anInt291 = Static42.aClass3_Sub7_Sub16_2.anInt6373;
		} else {
			Static22.anInt291 = -1;
		}
		Static16.aClass62_1 = null;
		Static130.anInt2452 = 0;
		Static42.aClass3_Sub7_Sub16_2 = null;
		Static299.aClass138_37 = null;
		Static42.method448();
		Static42.aClass138_5.method3046();
		Static127.aClass111_5 = null;
		Static114.aClass111_4 = null;
		Static98.aClass111_2 = null;
		Static291.aClass111_8 = null;
		Static42.aClass169_2 = null;
		Static233.aClass111_7 = null;
		Static156.aClass111_6 = null;
		Static253.anInt4565 = -1;
		Static105.aClass111_3 = null;
		Static125.anInt2380 = -1;
		aClass110_12 = null;
		Static16.aClass111_1 = null;
		Static42.aClass195_2.method4499();
		Static42.aClass24_2.method313(64, 64);
		Static42.aClass195_2.method4497(128, 64);
		Static42.aClass217_2.method5006(64);
		Static139.aClass163_1.method3740(64);
	}
}
