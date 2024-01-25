import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Lclient!oea;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg5 && arg0 == arg7 && arg4 == arg1 && arg8 == arg2) {
			Static149.method2044(arg3, arg5, arg7, arg2, arg4);
			return;
		}
		@Pc(32) int local32 = arg5;
		@Pc(34) int local34 = arg7;
		@Pc(38) int local38 = arg5 * 3;
		@Pc(42) int local42 = arg7 * 3;
		@Pc(46) int local46 = arg6 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(68) int local68 = arg4 + local46 - arg5 - local54;
		@Pc(78) int local78 = local50 + arg2 - local58 - arg7;
		@Pc(88) int local88 = local38 + local54 - local46 - local46;
		@Pc(98) int local98 = local58 + local42 - local50 - local50;
		@Pc(103) int local103 = local46 - local38;
		@Pc(107) int local107 = local50 - local42;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(117) int local117 = local109 * local109 >> 12;
			@Pc(123) int local123 = local117 * local109 >> 12;
			@Pc(127) int local127 = local123 * local68;
			@Pc(131) int local131 = local123 * local78;
			@Pc(135) int local135 = local117 * local88;
			@Pc(139) int local139 = local117 * local98;
			@Pc(143) int local143 = local109 * local103;
			@Pc(147) int local147 = local109 * local107;
			@Pc(157) int local157 = (local143 + local135 + local127 >> 12) + arg5;
			@Pc(169) int local169 = arg7 + (local131 + local139 + local147 >> 12);
			Static149.method2044(arg3, local32, local34, local169, local157);
			local32 = local157;
			local34 = local169;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
	public static void method2543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 11);
		local8.method6227();
		local8.anInt7693 = arg1;
		local8.anInt7701 = arg2;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method2549(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static159.anInt2496 = 0;
		Static537.anInt8833 = 0;
		Static86.anInt1458++;
		for (@Pc(15) int local15 = 0; local15 < Static313.anIntArray359[local5]; local15++) {
			if (!Static174.method2277(Static146.aClass12_Sub2ArrayArray1[local5][local15], arg0, arg1, arg2, arg3)) {
				Static147.method2022(Static146.aClass12_Sub2ArrayArray1[local5][local15]);
				if (Static146.aClass12_Sub2ArrayArray1[local5][local15].anInt9377 != -1) {
					Static488.aClass12_Sub2Array2[Static159.anInt2496++] = Static146.aClass12_Sub2ArrayArray1[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static503.anIntArray540[local5]; local61++) {
			if (!Static174.method2277(Static310.aClass12_Sub2ArrayArray2[local5][local61], arg0, arg1, arg2, arg3)) {
				Static147.method2022(Static310.aClass12_Sub2ArrayArray2[local5][local61]);
				if (Static310.aClass12_Sub2ArrayArray2[local5][local61].anInt9377 != -1) {
					Static242.aClass12_Sub2Array1[Static537.anInt8833++] = Static310.aClass12_Sub2ArrayArray2[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static535.anIntArray577[local5]; local107++) {
			if (!Static174.method2277(Static585.aClass12_Sub2ArrayArray3[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static585.aClass12_Sub2ArrayArray3[local5][local107].method7503()) {
					Static147.method2022(Static585.aClass12_Sub2ArrayArray3[local5][local107]);
					if (Static585.aClass12_Sub2ArrayArray3[local5][local107].anInt9377 != -1) {
						Static242.aClass12_Sub2Array1[Static537.anInt8833++] = Static585.aClass12_Sub2ArrayArray3[local5][local107];
					}
				} else {
					Static147.method2022(Static585.aClass12_Sub2ArrayArray3[local5][local107]);
					if (Static585.aClass12_Sub2ArrayArray3[local5][local107].anInt9377 != -1) {
						Static488.aClass12_Sub2Array2[Static159.anInt2496++] = Static585.aClass12_Sub2ArrayArray3[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static153.anInt2452; local190++) {
				if (!Static174.method2277(Static256.aClass12_Sub2_Sub1Array1[local190], arg0, arg1, arg2, arg3)) {
					Static147.method2022(Static256.aClass12_Sub2_Sub1Array1[local190]);
					if (Static256.aClass12_Sub2_Sub1Array1[local190].anInt9377 != -1) {
						if (Static256.aClass12_Sub2_Sub1Array1[local190].method7503()) {
							Static242.aClass12_Sub2Array1[Static537.anInt8833++] = Static256.aClass12_Sub2_Sub1Array1[local190];
						} else {
							Static488.aClass12_Sub2Array2[Static159.anInt2496++] = Static256.aClass12_Sub2_Sub1Array1[local190];
						}
					}
				}
			}
		}
		if (Static159.anInt2496 > 0) {
			Static9.method175(Static488.aClass12_Sub2Array2, 0, Static159.anInt2496 - 1);
			for (local190 = 0; local190 < Static159.anInt2496; local190++) {
				Static379.method5275(Static488.aClass12_Sub2Array2[local190]);
			}
		}
		if (Static107.aBoolean120) {
			Static337.aClass162_13.method6874(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static238.anInt3981; local190 < Static450.anInt7223; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static590.aBooleanArrayArray10.length;
				if (Static149.anInt2384 + Static590.aBooleanArrayArray10.length > Static83.anInt1434) {
					local278 -= Static149.anInt2384 + Static590.aBooleanArrayArray10.length - Static83.anInt1434;
				}
				local298 = Static590.aBooleanArrayArray10[0].length;
				if (Static284.anInt4831 + Static590.aBooleanArrayArray10[0].length > Static405.anInt6657) {
					local298 -= Static284.anInt4831 + Static590.aBooleanArrayArray10[0].length - Static405.anInt6657;
				}
				local319 = Static184.aBooleanArrayArray5;
				if (Static571.aBoolean773) {
					if (Static492.aBoolean660) {
						local319 = Static362.aBooleanArrayArrayArray1[local190];
					}
					for (local329 = Static279.anInt4791; local329 < local278; local329++) {
						local336 = local329 + Static149.anInt2384 - Static279.anInt4791;
						for (local338 = Static330.anInt155; local338 < local298; local338++) {
							if (Static590.aBooleanArrayArray10[local329][local338] && !Static158.method6599(local338 + Static284.anInt4831 - Static330.anInt155, local190, local336)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static492.aBoolean660) {
					Static114.aClass151Array1[local190].method7681(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static448.anInt1236; local329++) {
						Static228.aClass318Array1[local329].method6439(new Class12_Sub8(local190 + 1));
					}
				} else if (Static521.aBoolean703) {
					Static114.aClass151Array1[local190].method7678(Static258.anInt4281, Static505.anInt8016, Static351.anInt6012, Static184.aBooleanArrayArray5, true, Static160.anInt2497);
				} else {
					Static114.aClass151Array1[local190].method7681(Static258.anInt4281, Static505.anInt8016, Static351.anInt6012, Static184.aBooleanArrayArray5, true);
				}
			} else {
				local278 = Static590.aBooleanArrayArray10.length;
				if (Static149.anInt2384 + Static590.aBooleanArrayArray10.length > Static83.anInt1434) {
					local278 -= Static149.anInt2384 + Static590.aBooleanArrayArray10.length - Static83.anInt1434;
				}
				local298 = Static590.aBooleanArrayArray10[0].length;
				if (Static284.anInt4831 + Static590.aBooleanArrayArray10[0].length > Static405.anInt6657) {
					local298 -= Static284.anInt4831 + Static590.aBooleanArrayArray10[0].length - Static405.anInt6657;
				}
				local319 = Static184.aBooleanArrayArray5;
				if (Static571.aBoolean773) {
					if (Static492.aBoolean660) {
						local319 = Static362.aBooleanArrayArrayArray1[local190];
					}
					for (local329 = Static279.anInt4791; local329 < local278; local329++) {
						local336 = local329 + Static149.anInt2384 - Static279.anInt4791;
						for (local338 = Static330.anInt155; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static590.aBooleanArrayArray10[local329][local338]) {
								@Pc(357) int local357 = local338 + Static284.anInt4831 - Static330.anInt155;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static469.aClass228ArrayArrayArray6[local359][local336][local357] != null && Static469.aClass228ArrayArrayArray6[local359][local336][local357].aByte80 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static158.method6599(local357, local190, local336)) {
											local319[local329][local338] = true;
											break;
										}
										local319[local329][local338] = false;
										break;
									}
								}
							}
						}
					}
				}
				if (Static492.aBoolean660) {
					Static114.aClass151Array1[local190].method7681(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static448.anInt1236; local329++) {
						Static228.aClass318Array1[local329].method6439(new Class12_Sub8(local190 + 1));
					}
				} else if (Static521.aBoolean703) {
					Static114.aClass151Array1[local190].method7678(Static258.anInt4281, Static505.anInt8016, Static351.anInt6012, Static184.aBooleanArrayArray5, false, Static160.anInt2497);
				} else {
					Static114.aClass151Array1[local190].method7681(Static258.anInt4281, Static505.anInt8016, Static351.anInt6012, Static184.aBooleanArrayArray5, false);
				}
			}
		}
		if (Static537.anInt8833 > 0) {
			Static73.method1200(Static242.aClass12_Sub2Array1, 0, Static537.anInt8833 - 1);
			for (local278 = 0; local278 < Static537.anInt8833; local278++) {
				Static379.method5275(Static242.aClass12_Sub2Array1[local278]);
			}
		}
	}
}
