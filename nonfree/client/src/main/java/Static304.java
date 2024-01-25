import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZLjava/lang/String;II)V")
	public static void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		Static566.method7895(arg2, false, arg3, arg0, (String) null, arg1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static294.aBoolean394 = true;
		Static463.aBoolean532 = Static380.aClass13_86.method8089() > 0;
		Static126.aBoolean214 = true;
		Static636.anInt10301 = arg1 >> Static326.anInt5713;
		Static66.anInt1803 = arg3 >> Static326.anInt5713;
		Static274.anInt5086 = arg1;
		Static372.anInt6422 = arg3;
		Static444.anInt7300 = arg2;
		Static590.anInt9801 = Static636.anInt10301 - Static621.anInt10151;
		if (Static590.anInt9801 < 0) {
			Static399.anInt6858 = -Static590.anInt9801;
			Static590.anInt9801 = 0;
		} else {
			Static399.anInt6858 = 0;
		}
		Static641.anInt10384 = Static66.anInt1803 - Static621.anInt10151;
		if (Static641.anInt10384 < 0) {
			Static137.anInt2913 = -Static641.anInt10384;
			Static641.anInt10384 = 0;
		} else {
			Static137.anInt2913 = 0;
		}
		Static42.anInt979 = Static636.anInt10301 + Static621.anInt10151;
		if (Static42.anInt979 > Static595.anInt9881) {
			Static42.anInt979 = Static595.anInt9881;
		}
		Static298.anInt5384 = Static66.anInt1803 + Static621.anInt10151;
		if (Static298.anInt5384 > Static389.anInt6693) {
			Static298.anInt5384 = Static389.anInt6693;
		}
		@Pc(72) boolean[][] local72 = Static447.aBooleanArrayArray9;
		@Pc(74) boolean[][] local74 = Static139.aBooleanArrayArray3;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(83) int local83;
		if (Static126.aBoolean214) {
			for (local78 = 0; local78 < Static621.anInt10151 + Static621.anInt10151 + 2; local78++) {
				local81 = 0;
				local83 = 0;
				for (@Pc(85) int local85 = 0; local85 < Static621.anInt10151 + Static621.anInt10151 + 2; local85++) {
					if (local85 > 1) {
						Static622.anIntArray715[local85 - 2] = local81;
					}
					local81 = local83;
					@Pc(103) int local103 = Static636.anInt10301 + local78 - Static621.anInt10151;
					@Pc(109) int local109 = Static66.anInt1803 + local85 - Static621.anInt10151;
					@Pc(123) int local123;
					if (local103 >= 0 && local109 >= 0 && local103 < Static595.anInt9881 && local109 < Static389.anInt6693) {
						local123 = local103 << Static326.anInt5713;
						@Pc(127) int local127 = local109 << Static326.anInt5713;
						@Pc(144) int local144 = Static124.aClass91Array1[Static124.aClass91Array1.length - 1].method7447(local109, local103) - (0x3E8 << Static326.anInt5713 - 7);
						@Pc(166) int local166 = Static332.aClass91Array2 == null ? Static124.aClass91Array1[0].method7447(local109, local103) + Static519.anInt8387 : Static332.aClass91Array2[0].method7447(local109, local103) + Static519.anInt8387;
						local83 = arg15 >= 0 ? Static380.aClass13_86.r(local123, local144, local127, local123, local166, local127, arg15) : Static380.aClass13_86.JA(local123, local144, local127, local123, local166, local127);
						Static139.aBooleanArrayArray3[local78][local85] = local83 == 0;
					} else {
						local83 = -1;
						Static139.aBooleanArrayArray3[local78][local85] = false;
					}
					if (local78 > 0 && local85 > 0) {
						local123 = Static622.anIntArray715[local85 - 1] & Static622.anIntArray715[local85] & local81 & local83;
						Static447.aBooleanArrayArray9[local78 - 1][local85 - 1] = local123 == 0;
					}
				}
				Static622.anIntArray715[Static621.anInt10151 + Static621.anInt10151] = local81;
				Static622.anIntArray715[Static621.anInt10151 + Static621.anInt10151 + 1] = local83;
			}
			if (arg15 >= 0) {
				Static294.aBoolean394 = false;
			} else {
				Static456.anIntArray507 = arg5;
				Static602.anIntArray703 = arg6;
				Static425.anIntArray474 = arg7;
				Static619.anIntArray713 = arg8;
				Static72.anIntArray144 = arg9;
				Static213.method3546(arg10, Static380.aClass13_86);
			}
		} else {
			if (Static135.aBooleanArrayArray2 == null) {
				Static135.aBooleanArrayArray2 = new boolean[Static595.anInt9881 + Static595.anInt9881 + 1][Static389.anInt6693 + Static595.anInt9881 + 1];
			}
			for (local78 = 0; local78 < Static135.aBooleanArrayArray2.length; local78++) {
				for (local81 = 0; local81 < Static135.aBooleanArrayArray2[0].length; local81++) {
					Static135.aBooleanArrayArray2[local78][local81] = true;
				}
			}
			Static139.aBooleanArrayArray3 = Static135.aBooleanArrayArray2;
			Static447.aBooleanArrayArray9 = Static135.aBooleanArrayArray2;
			Static590.anInt9801 = 0;
			Static641.anInt10384 = 0;
			Static42.anInt979 = Static595.anInt9881;
			Static298.anInt5384 = Static389.anInt6693;
			Static294.aBoolean394 = false;
		}
		Static419.method6396(Static380.aClass13_86);
		if (!Static141.aClass25_2.aBoolean57) {
			@Pc(349) Class19 local349 = Static141.aClass25_2.aClass19_1;
			for (@Pc(354) Class16_Sub5 local354 = (Class16_Sub5) local349.method562(); local354 != null; local354 = (Class16_Sub5) local349.method558()) {
				local354.method8874();
				Static274.method4473(local354);
			}
		}
		if (Static463.aBoolean532) {
			for (local78 = 0; local78 < Static4.anInt53; local78++) {
				Static547.aClass342Array1[local78].method7898(arg0, arg14);
			}
		}
		if (Static573.aBoolean668) {
			Static105.anIntArray174 = Static380.aClass13_86.Y();
			Static380.aClass13_86.K(Static106.anIntArray175);
			local78 = (Static106.anIntArray175[2] - Static106.anIntArray175[0]) / Static17.anInt398;
			for (local81 = 0; local81 < Static17.anInt398 - 1; local81++) {
				Static192.anIntArray247[local81] = local78 * (local81 + 1) + Static194.anIntArray248[local81];
			}
			for (local83 = 0; local83 < Static569.aClass380Array1.length; local83++) {
				Static569.aClass380Array1[local83].method8755();
			}
		}
		if (Static230.aClass84ArrayArrayArray4 != null) {
			if (Static573.aBoolean668) {
				Static183.method3130(0);
			}
			Static192.method3293(true);
			Static380.aClass13_86.ra(-1, 1583160, 40, 127);
			Static411.method6040(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static573.aBoolean668) {
				Static341.method5166();
			}
			Static380.aClass13_86.pa();
			Static192.method3293(false);
		}
		Static411.method6040(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static573.aBoolean668) {
			for (local78 = 0; local78 < Static395.anInt6810; local78++) {
				Static268.aBooleanArrayArrayArray3[local78] = Static598.aBooleanArrayArrayArray2[local78];
			}
			Static183.method3130(0);
			for (local81 = 0; local81 < Static569.aClass380Array1.length; local81++) {
				Static569.aClass380Array1[local81].method8755();
			}
		}
		if (Static573.aBoolean668) {
			Static341.method5166();
			for (local78 = 0; local78 < Static395.anInt6810; local78++) {
				Static598.aBooleanArrayArrayArray2[local78] = Static268.aBooleanArrayArrayArray3[local78];
			}
			if (Static601.anInt9959 == 2) {
				@Pc(543) int local543;
				if (Static609.aLongArray16[0] < Static609.aLongArray16[1]) {
					if (Static192.anIntArray247[0] + Static194.anIntArray248[0] > Static106.anIntArray175[0]) {
						local543 = Static194.anIntArray248[0]++;
					}
				} else if (Static609.aLongArray16[0] > Static609.aLongArray16[1] && Static192.anIntArray247[0] + Static194.anIntArray248[0] < Static106.anIntArray175[2]) {
					local543 = Static194.anIntArray248[0]--;
				}
			}
		}
		if (!Static126.aBoolean214) {
			Static447.aBooleanArrayArray9 = local72;
			Static139.aBooleanArrayArray3 = local74;
		}
		Static546.method7560();
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)Z")
	public static boolean method4769() throws IOException {
		if (Static341.aClass22_4 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static346.aClass200_117 == null) {
			if (Static253.aBoolean361) {
				if (!Static341.aClass22_4.method7464(1)) {
					return false;
				}
				Static341.aClass22_4.method7461(1, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
				Static253.anInt4808++;
				Static253.aBoolean361 = false;
				Static535.anInt8620 = 0;
			}
			Static327.aClass2_Sub17_Sub1_1.anInt3378 = 0;
			if (Static327.aClass2_Sub17_Sub1_1.method2451()) {
				if (!Static341.aClass22_4.method7464(1)) {
					return false;
				}
				Static341.aClass22_4.method7461(1, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 1);
				Static253.anInt4808++;
				Static535.anInt8620 = 0;
			}
			Static253.aBoolean361 = true;
			@Pc(71) Class200[] local71 = Static79.method1721();
			local75 = Static327.aClass2_Sub17_Sub1_1.method2459();
			if (local75 < 0 || local75 >= local71.length) {
				throw new IOException("invo:" + local75 + " ip:" + Static327.aClass2_Sub17_Sub1_1.anInt3378);
			}
			Static346.aClass200_117 = local71[local75];
			Static245.anInt4755 = Static346.aClass200_117.anInt5279;
		}
		if (Static245.anInt4755 == -1) {
			if (!Static341.aClass22_4.method7464(1)) {
				return false;
			}
			Static341.aClass22_4.method7461(1, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
			Static245.anInt4755 = Static327.aClass2_Sub17_Sub1_1.aByteArray26[0] & 0xFF;
			Static535.anInt8620 = 0;
			Static253.anInt4808++;
		}
		if (Static245.anInt4755 == -2) {
			if (!Static341.aClass22_4.method7464(2)) {
				return false;
			}
			Static341.aClass22_4.method7461(2, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
			Static327.aClass2_Sub17_Sub1_1.anInt3378 = 0;
			Static245.anInt4755 = Static327.aClass2_Sub17_Sub1_1.method2825();
			Static253.anInt4808 += 2;
			Static535.anInt8620 = 0;
		}
		if (Static245.anInt4755 > 0) {
			if (!Static341.aClass22_4.method7464(Static245.anInt4755)) {
				return false;
			}
			Static327.aClass2_Sub17_Sub1_1.anInt3378 = 0;
			Static341.aClass22_4.method7461(Static245.anInt4755, Static327.aClass2_Sub17_Sub1_1.aByteArray26, 0);
			Static253.anInt4808 += Static245.anInt4755;
			Static535.anInt8620 = 0;
		}
		Static533.aClass200_198 = Static606.aClass200_222;
		Static606.aClass200_222 = Static370.aClass200_142;
		Static370.aClass200_142 = Static346.aClass200_117;
		@Pc(213) byte local213;
		if (Static346.aClass200_117 == Static333.aClass200_129) {
			local213 = Static327.aClass2_Sub17_Sub1_1.method2852();
			local75 = Static327.aClass2_Sub17_Sub1_1.method2888();
			Static141.method2567();
			Static154.method2695(local75, local213);
			Static346.aClass200_117 = null;
			return true;
		}
		@Pc(237) int local237;
		@Pc(263) int local263;
		if (Static264.aClass200_102 == Static346.aClass200_117) {
			local237 = Static327.aClass2_Sub17_Sub1_1.method2830();
			Static141.method2567();
			if (local237 == -1) {
				Static648.anInt10476 = -1;
				Static644.anInt10415 = -1;
			} else {
				local75 = local237 >> 14 & 0x3FFF;
				local75 -= Static406.anInt6899;
				local263 = local237 & 0x3FFF;
				if (local75 < 0) {
					local75 = 0;
				} else if (local75 >= Static456.anInt7428) {
					local75 = Static456.anInt7428;
				}
				local263 -= Static338.anInt5885;
				Static644.anInt10415 = (local75 << 9) + 256;
				if (local263 < 0) {
					local263 = 0;
				} else if (local263 >= Static5.anInt112) {
					local263 = Static5.anInt112;
				}
				Static648.anInt10476 = (local263 << 9) + 256;
			}
			Static346.aClass200_117 = null;
			return true;
		} else if (Static346.aClass200_117 == Static159.aClass200_66) {
			for (local237 = 0; local237 < Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1.length; local237++) {
				if (Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local237] != null) {
					Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local237].anIntArray586 = null;
					Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local237].anInt8049 = -1;
				}
			}
			for (local75 = 0; local75 < Static608.anInt10053; local75++) {
				Static480.aClass2_Sub32Array1[local75].aClass16_Sub1_Sub1_Sub3_Sub1_2.anIntArray586 = null;
				Static480.aClass2_Sub32Array1[local75].aClass16_Sub1_Sub1_Sub3_Sub1_2.anInt8049 = -1;
			}
			Static346.aClass200_117 = null;
			return true;
		} else {
			@Pc(398) int local398;
			@Pc(394) int local394;
			if (Static346.aClass200_117 == Static448.aClass200_168) {
				local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
				if (local237 == 65535) {
					local237 = -1;
				}
				local75 = Static327.aClass2_Sub17_Sub1_1.method2859();
				local263 = Static327.aClass2_Sub17_Sub1_1.method2825();
				local394 = Static327.aClass2_Sub17_Sub1_1.method2859();
				local398 = Static327.aClass2_Sub17_Sub1_1.method2825();
				Static297.method4695(local237, local398, false, local75, local263, local394);
				Static346.aClass200_117 = null;
				return true;
			} else if (Static266.aClass200_103 == Static346.aClass200_117) {
				local237 = Static327.aClass2_Sub17_Sub1_1.method2859();
				local75 = Static327.aClass2_Sub17_Sub1_1.method2888();
				if (local237 == 255) {
					local75 = -1;
					local237 = -1;
				}
				Static234.method3746(local75, local237);
				Static346.aClass200_117 = null;
				return true;
			} else if (Static346.aClass200_117 == Static540.aClass200_201) {
				local237 = Static327.aClass2_Sub17_Sub1_1.method2863() << 2;
				local75 = Static327.aClass2_Sub17_Sub1_1.method2865();
				local263 = Static327.aClass2_Sub17_Sub1_1.method2865();
				local394 = Static327.aClass2_Sub17_Sub1_1.method2842();
				local398 = Static327.aClass2_Sub17_Sub1_1.method2888();
				Static141.method2567();
				Static343.method5198(local237, local75, local394, local263, local398);
				Static346.aClass200_117 = null;
				return true;
			} else {
				@Pc(490) String local490;
				@Pc(484) String local484;
				if (Static345.aClass200_208 == Static346.aClass200_117) {
					local484 = Static327.aClass2_Sub17_Sub1_1.method2833();
					local490 = Static355.method5321(Static281.method4506(Static327.aClass2_Sub17_Sub1_1));
					Static107.method1973(local490, 0, local484, local484, 6, local484);
					Static346.aClass200_117 = null;
					return true;
				} else if (Static346.aClass200_117 == Static103.aClass200_43) {
					Static374.method5553(Static77.aClass55_3);
					Static346.aClass200_117 = null;
					return true;
				} else if (Static346.aClass200_117 == Static232.aClass200_85) {
					Static374.method5553(Static197.aClass55_7);
					Static346.aClass200_117 = null;
					return true;
				} else {
					@Pc(544) boolean local544;
					if (Static635.aClass200_223 == Static346.aClass200_117) {
						local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
						local75 = Static327.aClass2_Sub17_Sub1_1.method2859();
						local544 = (local75 & 0x1) == 1;
						Static80.method1747(local544, local237);
						Static434.anIntArray484[Static43.anInt1122++ & 0x1F] = local237;
						Static346.aClass200_117 = null;
						return true;
					}
					@Pc(586) String local586;
					@Pc(883) String local883;
					@Pc(615) int local615;
					@Pc(578) boolean local578;
					@Pc(598) boolean local598;
					@Pc(596) String local596;
					@Pc(847) String local847;
					if (Static346.aClass200_117 == Static380.aClass200_228) {
						@Pc(632) boolean local632;
						while (Static327.aClass2_Sub17_Sub1_1.anInt3378 < Static245.anInt4755) {
							local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
							local490 = Static327.aClass2_Sub17_Sub1_1.method2833();
							local586 = Static327.aClass2_Sub17_Sub1_1.method2833();
							local394 = Static327.aClass2_Sub17_Sub1_1.method2825();
							local398 = Static327.aClass2_Sub17_Sub1_1.method2859();
							local596 = "";
							local598 = false;
							if (local394 > 0) {
								local596 = Static327.aClass2_Sub17_Sub1_1.method2833();
								local598 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
							}
							for (local615 = 0; local615 < Static289.anInt5236; local615++) {
								if (local578) {
									if (local586.equals(Static514.aStringArray44[local615])) {
										Static514.aStringArray44[local615] = local490;
										Static83.aStringArray7[local615] = local586;
										local490 = null;
										break;
									}
								} else if (local490.equals(Static514.aStringArray44[local615])) {
									if (Static521.anIntArray622[local615] != local394) {
										local632 = true;
										for (@Pc(639) Class16_Sub6_Sub2 local639 = (Class16_Sub6_Sub2) Static39.aClass19_2.method562(); local639 != null; local639 = (Class16_Sub6_Sub2) Static39.aClass19_2.method558()) {
											if (local639.aString50.equals(local490)) {
												if (local394 != 0 && local639.aShort83 == 0) {
													local632 = false;
													local639.method8874();
												} else if (local394 == 0 && local639.aShort83 != 0) {
													local632 = false;
													local639.method8874();
												}
											}
										}
										if (local632) {
											Static39.aClass19_2.method566(new Class16_Sub6_Sub2(local490, local394));
										}
										Static521.anIntArray622[local615] = local394;
									}
									Static83.aStringArray7[local615] = local586;
									Static384.aStringArray31[local615] = local596;
									Static89.anIntArray463[local615] = local398;
									local490 = null;
									Static471.aBooleanArray22[local615] = local598;
									break;
								}
							}
							if (local490 != null && Static289.anInt5236 < 200) {
								Static514.aStringArray44[Static289.anInt5236] = local490;
								Static83.aStringArray7[Static289.anInt5236] = local586;
								Static521.anIntArray622[Static289.anInt5236] = local394;
								Static384.aStringArray31[Static289.anInt5236] = local596;
								Static89.anIntArray463[Static289.anInt5236] = local398;
								Static471.aBooleanArray22[Static289.anInt5236] = local598;
								Static289.anInt5236++;
							}
						}
						Static464.anInt7517 = 2;
						Static76.anInt1945 = Static148.anInt3063;
						local75 = Static289.anInt5236;
						while (local75 > 0) {
							local578 = true;
							local75--;
							for (local263 = 0; local263 < local75; local263++) {
								if (Static262.aClass155_9.anInt4152 != Static521.anIntArray622[local263] && Static262.aClass155_9.anInt4152 == Static521.anIntArray622[local263 + 1] || Static521.anIntArray622[local263] == 0 && Static521.anIntArray622[local263 + 1] != 0) {
									local394 = Static521.anIntArray622[local263];
									Static521.anIntArray622[local263] = Static521.anIntArray622[local263 + 1];
									Static521.anIntArray622[local263 + 1] = local394;
									local847 = Static384.aStringArray31[local263];
									Static384.aStringArray31[local263] = Static384.aStringArray31[local263 + 1];
									Static384.aStringArray31[local263 + 1] = local847;
									local596 = Static514.aStringArray44[local263];
									Static514.aStringArray44[local263] = Static514.aStringArray44[local263 + 1];
									Static514.aStringArray44[local263 + 1] = local596;
									local883 = Static83.aStringArray7[local263];
									Static83.aStringArray7[local263] = Static83.aStringArray7[local263 + 1];
									Static83.aStringArray7[local263 + 1] = local883;
									local615 = Static89.anIntArray463[local263];
									Static89.anIntArray463[local263] = Static89.anIntArray463[local263 + 1];
									Static89.anIntArray463[local263 + 1] = local615;
									local632 = Static471.aBooleanArray22[local263];
									Static471.aBooleanArray22[local263] = Static471.aBooleanArray22[local263 + 1];
									Static471.aBooleanArray22[local263 + 1] = local632;
									local578 = false;
								}
							}
							if (local578) {
								break;
							}
						}
						Static346.aClass200_117 = null;
						return true;
					} else if (Static346.aClass200_117 == Static269.aClass200_106) {
						Static297.method4696();
						Static346.aClass200_117 = null;
						return true;
					} else {
						@Pc(996) long local996;
						@Pc(1001) long local1001;
						@Pc(1013) boolean local1013;
						@Pc(1015) int local1015;
						if (Static346.aClass200_117 == Static107.aClass200_44) {
							local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
							local490 = Static327.aClass2_Sub17_Sub1_1.method2833();
							local586 = local490;
							if (local578) {
								local586 = Static327.aClass2_Sub17_Sub1_1.method2833();
							}
							local996 = (long) Static327.aClass2_Sub17_Sub1_1.method2825();
							local1001 = (long) Static327.aClass2_Sub17_Sub1_1.method2835();
							local615 = Static327.aClass2_Sub17_Sub1_1.method2859();
							@Pc(1011) long local1011 = (local996 << 32) + local1001;
							local1013 = false;
							local1015 = 0;
							while (true) {
								if (local1015 >= 100) {
									if (local615 <= 1) {
										if (Static279.aBoolean378 && !Static318.aBoolean410 || Static539.aBoolean620) {
											local1013 = true;
										} else if (Static209.method3513(local586)) {
											local1013 = true;
										}
									}
									break;
								}
								if (local1011 == Static294.aLongArray10[local1015]) {
									local1013 = true;
									break;
								}
								local1015++;
							}
							if (!local1013 && Static365.anInt6307 == 0) {
								Static294.aLongArray10[Static246.anInt4756] = local1011;
								Static246.anInt4756 = (Static246.anInt4756 + 1) % 100;
								@Pc(1078) String local1078 = Static355.method5321(Static281.method4506(Static327.aClass2_Sub17_Sub1_1));
								if (local615 == 2) {
									Static144.method2592(local490, 7, -1, "<img=1>" + local586, "<img=1>" + local490, local1078, (String) null, 0);
								} else if (local615 == 1) {
									Static144.method2592(local490, 7, -1, "<img=0>" + local586, "<img=0>" + local490, local1078, (String) null, 0);
								} else {
									Static144.method2592(local490, 3, -1, local586, local490, local1078, (String) null, 0);
								}
							}
							Static346.aClass200_117 = null;
							return true;
						} else if (Static346.aClass200_117 == Static23.aClass200_18) {
							local237 = Static327.aClass2_Sub17_Sub1_1.method2843();
							Static141.method2567();
							Static361.method5387(-1, local237, 3, -1);
							Static346.aClass200_117 = null;
							return true;
						} else if (Static346.aClass200_117 == Static114.aClass200_45) {
							local237 = Static327.aClass2_Sub17_Sub1_1.method2854();
							local75 = Static327.aClass2_Sub17_Sub1_1.method2887();
							Static141.method2567();
							Static79.method1730(local75, local237);
							Static346.aClass200_117 = null;
							return true;
						} else if (Static346.aClass200_117 == Static488.aClass200_188) {
							Static231.anInt4254 = Static327.aClass2_Sub17_Sub1_1.method2842();
							Static487.anInt7837 = Static327.aClass2_Sub17_Sub1_1.method2888();
							Static346.aClass200_117 = null;
							return true;
						} else {
							@Pc(1285) int local1285;
							@Pc(1243) boolean local1243;
							@Pc(1398) int local1398;
							@Pc(1295) int local1295;
							@Pc(1260) Class75 local1260;
							if (Static415.aClass200_162 == Static346.aClass200_117) {
								local484 = Static327.aClass2_Sub17_Sub1_1.method2833();
								local544 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
								if (local544) {
									local490 = Static327.aClass2_Sub17_Sub1_1.method2833();
								} else {
									local490 = local484;
								}
								local394 = Static327.aClass2_Sub17_Sub1_1.method2825();
								@Pc(1241) byte local1241 = Static327.aClass2_Sub17_Sub1_1.method2860();
								local1243 = false;
								if (local1241 == -128) {
									local1243 = true;
								}
								if (local1243) {
									if (Static340.anInt5975 == 0) {
										Static346.aClass200_117 = null;
										return true;
									}
									for (local1398 = 0; Static340.anInt5975 > local1398 && (!Static58.aClass75Array1[local1398].aString18.equals(local490) || local394 != Static58.aClass75Array1[local1398].anInt2335); local1398++) {
									}
									if (Static340.anInt5975 > local1398) {
										while (Static340.anInt5975 - 1 > local1398) {
											Static58.aClass75Array1[local1398] = Static58.aClass75Array1[local1398 + 1];
											local1398++;
										}
										Static340.anInt5975--;
										Static58.aClass75Array1[Static340.anInt5975] = null;
									}
								} else {
									local883 = Static327.aClass2_Sub17_Sub1_1.method2833();
									local1260 = new Class75();
									local1260.aString19 = local484;
									local1260.aString18 = local490;
									local1260.aString20 = Static529.method7327(local1260.aString18);
									local1260.aString21 = local883;
									local1260.aByte41 = local1241;
									local1260.anInt2335 = local394;
									for (local1285 = Static340.anInt5975 - 1; local1285 >= 0; local1285--) {
										local1295 = Static58.aClass75Array1[local1285].aString20.compareTo(local1260.aString20);
										if (local1295 == 0) {
											Static58.aClass75Array1[local1285].anInt2335 = local394;
											Static58.aClass75Array1[local1285].aByte41 = local1241;
											Static58.aClass75Array1[local1285].aString21 = local883;
											if (local490.equals(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82)) {
												Static502.aByte131 = local1241;
											}
											Static48.anInt1289 = Static148.anInt3063;
											Static346.aClass200_117 = null;
											return true;
										}
										if (local1295 < 0) {
											break;
										}
									}
									if (Static58.aClass75Array1.length <= Static340.anInt5975) {
										Static346.aClass200_117 = null;
										return true;
									}
									for (local1295 = Static340.anInt5975 - 1; local1295 > local1285; local1295--) {
										Static58.aClass75Array1[local1295 + 1] = Static58.aClass75Array1[local1295];
									}
									if (Static340.anInt5975 == 0) {
										Static58.aClass75Array1 = new Class75[100];
									}
									Static58.aClass75Array1[local1285 + 1] = local1260;
									Static340.anInt5975++;
									if (local490.equals(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82)) {
										Static502.aByte131 = local1241;
									}
								}
								Static346.aClass200_117 = null;
								Static48.anInt1289 = Static148.anInt3063;
								return true;
							}
							@Pc(1531) int local1531;
							if (Static346.aClass200_117 == Static282.aClass200_175) {
								Static48.anInt1289 = Static148.anInt3063;
								if (Static245.anInt4755 == 0) {
									Static479.aString72 = null;
									Static190.aString33 = null;
									Static340.anInt5975 = 0;
									Static58.aClass75Array1 = null;
									Static346.aClass200_117 = null;
									return true;
								}
								Static479.aString72 = Static327.aClass2_Sub17_Sub1_1.method2833();
								local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
								if (local578) {
									Static327.aClass2_Sub17_Sub1_1.method2833();
								}
								@Pc(1505) long local1505 = Static327.aClass2_Sub17_Sub1_1.method2872();
								Static190.aString33 = Static228.method3699(local1505);
								Static114.aByte44 = Static327.aClass2_Sub17_Sub1_1.method2860();
								local394 = Static327.aClass2_Sub17_Sub1_1.method2859();
								if (local394 == 255) {
									Static346.aClass200_117 = null;
									return true;
								}
								Static340.anInt5975 = local394;
								@Pc(1529) Class75[] local1529 = new Class75[100];
								for (local1531 = 0; local1531 < Static340.anInt5975; local1531++) {
									local1529[local1531] = new Class75();
									local1529[local1531].aString19 = Static327.aClass2_Sub17_Sub1_1.method2833();
									local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
									if (local578) {
										local1529[local1531].aString18 = Static327.aClass2_Sub17_Sub1_1.method2833();
									} else {
										local1529[local1531].aString18 = local1529[local1531].aString19;
									}
									local1529[local1531].aString20 = Static529.method7327(local1529[local1531].aString18);
									local1529[local1531].anInt2335 = Static327.aClass2_Sub17_Sub1_1.method2825();
									local1529[local1531].aByte41 = Static327.aClass2_Sub17_Sub1_1.method2860();
									local1529[local1531].aString21 = Static327.aClass2_Sub17_Sub1_1.method2833();
									if (local1529[local1531].aString18.equals(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aString82)) {
										Static502.aByte131 = local1529[local1531].aByte41;
									}
								}
								local1285 = Static340.anInt5975;
								while (local1285 > 0) {
									local598 = true;
									local1285--;
									for (local1295 = 0; local1295 < local1285; local1295++) {
										if (local1529[local1295].aString20.compareTo(local1529[local1295 + 1].aString20) > 0) {
											local1260 = local1529[local1295];
											local1529[local1295] = local1529[local1295 + 1];
											local1529[local1295 + 1] = local1260;
											local598 = false;
										}
									}
									if (local598) {
										break;
									}
								}
								Static58.aClass75Array1 = local1529;
								Static346.aClass200_117 = null;
								return true;
							}
							@Pc(1710) String local1710;
							if (Static585.aClass200_209 == Static346.aClass200_117) {
								local237 = Static327.aClass2_Sub17_Sub1_1.method2853();
								local75 = Static327.aClass2_Sub17_Sub1_1.method2881();
								local263 = Static327.aClass2_Sub17_Sub1_1.method2859();
								local1710 = "";
								local847 = local1710;
								if ((local263 & 0x1) != 0) {
									local1710 = Static327.aClass2_Sub17_Sub1_1.method2833();
									if ((local263 & 0x2) == 0) {
										local847 = local1710;
									} else {
										local847 = Static327.aClass2_Sub17_Sub1_1.method2833();
									}
								}
								local596 = Static327.aClass2_Sub17_Sub1_1.method2833();
								if (local237 == 99) {
									Static575.method7997(local596);
								} else if (local847.equals("") || !Static209.method3513(local847)) {
									Static107.method1973(local596, local75, local1710, local847, local237, local1710);
								} else {
									Static346.aClass200_117 = null;
									return true;
								}
								Static346.aClass200_117 = null;
								return true;
							} else if (Static346.aClass200_117 == Static17.aClass200_16) {
								local237 = Static327.aClass2_Sub17_Sub1_1.method2887();
								local75 = Static327.aClass2_Sub17_Sub1_1.method2876();
								Static141.method2567();
								Static635.method8745(local237, local75);
								Static346.aClass200_117 = null;
								return true;
							} else if (Static346.aClass200_117 == Static643.aClass200_220) {
								Static346.aClass200_117 = null;
								return false;
							} else if (Static159.aClass200_67 == Static346.aClass200_117) {
								Static648.anInt10472 = Static327.aClass2_Sub17_Sub1_1.method2865();
								Static412.anInt6934 = Static327.aClass2_Sub17_Sub1_1.method2852() << 3;
								Static458.anInt4947 = Static327.aClass2_Sub17_Sub1_1.method2852() << 3;
								for (@Pc(1828) Class2_Sub23 local1828 = (Class2_Sub23) Static263.aClass323_18.method7480(); local1828 != null; local1828 = (Class2_Sub23) Static263.aClass323_18.method7482()) {
									local75 = (int) (local1828.aLong278 >> 28 & 0x3L);
									local263 = (int) (local1828.aLong278 & 0x3FFFL);
									local394 = local263 - Static406.anInt6899;
									local398 = (int) (local1828.aLong278 >> 14 & 0x3FFFL);
									local1531 = local398 - Static338.anInt5885;
									if (Static648.anInt10472 == local75 && Static412.anInt6934 <= local394 && Static412.anInt6934 + 8 > local394 && local1531 >= Static458.anInt4947 && Static458.anInt4947 + 8 > local1531) {
										local1828.method8920();
										if (local394 >= 0 && local1531 >= 0 && Static456.anInt7428 > local394 && Static5.anInt112 > local1531) {
											Static72.method1634(local1531, Static648.anInt10472, local394);
										}
									}
								}
								@Pc(1919) Class2_Sub2 local1919;
								for (local1919 = (Class2_Sub2) Static536.aClass114_42.method2772(); local1919 != null; local1919 = (Class2_Sub2) Static536.aClass114_42.method2762()) {
									if (Static412.anInt6934 <= local1919.anInt129 && local1919.anInt129 < Static412.anInt6934 + 8 && Static458.anInt4947 <= local1919.anInt119 && Static458.anInt4947 + 8 > local1919.anInt119 && local1919.anInt125 == Static648.anInt10472) {
										local1919.aBoolean18 = true;
									}
								}
								for (local1919 = (Class2_Sub2) Static387.aClass114_33.method2772(); local1919 != null; local1919 = (Class2_Sub2) Static387.aClass114_33.method2762()) {
									if (local1919.anInt129 >= Static412.anInt6934 && local1919.anInt129 < Static412.anInt6934 + 8 && Static458.anInt4947 <= local1919.anInt119 && Static458.anInt4947 + 8 > local1919.anInt119 && local1919.anInt125 == Static648.anInt10472) {
										local1919.aBoolean18 = true;
									}
								}
								Static346.aClass200_117 = null;
								return true;
							} else if (Static346.aClass200_117 == Static431.aClass200_179) {
								local237 = Static327.aClass2_Sub17_Sub1_1.method2859();
								local75 = Static327.aClass2_Sub17_Sub1_1.method2887();
								local263 = Static327.aClass2_Sub17_Sub1_1.method2888();
								Static505.anIntArray600[local237] = local75;
								Static216.anIntArray265[local237] = local263;
								Static451.anIntArray502[local237] = 1;
								local394 = Static67.anIntArray137[local237] - 1;
								for (local398 = 0; local398 < local394; local398++) {
									if (Class2_Sub4_Sub13.anIntArray228[local398] <= local75) {
										Static451.anIntArray502[local237] = local398 + 2;
									}
								}
								Static550.anIntArray658[Static260.anInt4890++ & 0x1F] = local237;
								Static346.aClass200_117 = null;
								return true;
							} else if (Static346.aClass200_117 == Static155.aClass200_65) {
								local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
								local75 = Static327.aClass2_Sub17_Sub1_1.method2887();
								Static141.method2567();
								Static48.method1202(local75, local237);
								Static346.aClass200_117 = null;
								return true;
							} else if (Static286.aClass200_111 == Static346.aClass200_117) {
								local237 = Static327.aClass2_Sub17_Sub1_1.method2863();
								local75 = Static327.aClass2_Sub17_Sub1_1.method2881();
								local263 = Static327.aClass2_Sub17_Sub1_1.method2825();
								local394 = Static327.aClass2_Sub17_Sub1_1.method2825();
								Static141.method2567();
								Static361.method5387(local263 | local237 << 16, local75, 7, local394);
								Static346.aClass200_117 = null;
								return true;
							} else if (Static250.aClass200_96 == Static346.aClass200_117) {
								Static374.method5553(Static433.aClass55_11);
								Static346.aClass200_117 = null;
								return true;
							} else if (Static346.aClass200_117 == Static428.aClass200_161) {
								local237 = Static327.aClass2_Sub17_Sub1_1.method2854();
								if (local237 == 65535) {
									local237 = -1;
								}
								local75 = Static327.aClass2_Sub17_Sub1_1.method2887();
								Static141.method2567();
								Static361.method5387(local237, local75, 1, -1);
								Static346.aClass200_117 = null;
								return true;
							} else {
								@Pc(2228) boolean local2228;
								if (Static346.aClass200_117 == Static499.aClass200_151) {
									local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
									@Pc(2197) Class16_Sub1_Sub1_Sub3_Sub2 local2197;
									if (Static608.anInt10056 == local237) {
										local2197 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1;
									} else {
										local2197 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local237];
									}
									if (local2197 == null) {
										Static346.aClass200_117 = null;
										return true;
									}
									local263 = Static327.aClass2_Sub17_Sub1_1.method2825();
									local394 = Static327.aClass2_Sub17_Sub1_1.method2859();
									local2228 = (local263 & 0x8000) != 0;
									if (local2197.aString82 != null && local2197.aClass284_1 != null) {
										local1243 = false;
										if (local394 <= 1) {
											if (!local2228 && (Static279.aBoolean378 && !Static318.aBoolean410 || Static539.aBoolean620)) {
												local1243 = true;
											} else if (Static209.method3513(local2197.aString82)) {
												local1243 = true;
											}
										}
										if (!local1243 && Static365.anInt6307 == 0) {
											local615 = -1;
											if (local2228) {
												local263 &= 0x7FFF;
												@Pc(2289) Class330 local2289 = Static233.method3737(Static327.aClass2_Sub17_Sub1_1);
												local615 = local2289.anInt8838;
												local883 = local2289.aClass2_Sub7_Sub16_1.method6603(Static327.aClass2_Sub17_Sub1_1);
											} else {
												local883 = Static355.method5321(Static281.method4506(Static327.aClass2_Sub17_Sub1_1));
											}
											local2197.aString81 = local883.trim();
											local2197.anInt8125 = 150;
											local2197.anInt8107 = local263 >> 8;
											local2197.anInt8091 = local263 & 0xFF;
											if (local394 == 1 || local394 == 2) {
												local1285 = local2228 ? 17 : 1;
											} else {
												local1285 = local2228 ? 17 : 2;
											}
											if (local394 == 2) {
												Static144.method2592(local2197.aString83, local1285, local615, "<img=1>" + local2197.method7018(), "<img=1>" + local2197.method7015(), local883, (String) null, 0);
											} else if (local394 == 1) {
												Static144.method2592(local2197.aString83, local1285, local615, "<img=0>" + local2197.method7018(), "<img=0>" + local2197.method7015(), local883, (String) null, 0);
											} else {
												Static144.method2592(local2197.aString83, local1285, local615, local2197.method7018(), local2197.method7015(), local883, (String) null, 0);
											}
										}
									}
									Static346.aClass200_117 = null;
									return true;
								} else if (Static346.aClass200_117 == Static135.aClass200_59) {
									local237 = Static327.aClass2_Sub17_Sub1_1.method2876();
									local75 = Static327.aClass2_Sub17_Sub1_1.method2830();
									Static382.aClass282_1.method6475(local237, local75);
									Static346.aClass200_117 = null;
									return true;
								} else if (Static425.aClass200_160 == Static346.aClass200_117) {
									local484 = Static327.aClass2_Sub17_Sub1_1.method2833();
									local75 = Static327.aClass2_Sub17_Sub1_1.method2876();
									if (local75 == 65535) {
										local75 = -1;
									}
									local263 = Static327.aClass2_Sub17_Sub1_1.method2842();
									local394 = Static327.aClass2_Sub17_Sub1_1.method2888();
									if (local394 >= 1 && local394 <= 8) {
										if (local484.equalsIgnoreCase("null")) {
											local484 = null;
										}
										Static288.aStringArray30[local394 - 1] = local484;
										Static236.anIntArray282[local394 - 1] = local75;
										Static393.aBooleanArray17[local394 - 1] = local263 == 0;
									}
									Static346.aClass200_117 = null;
									return true;
								} else if (Static346.aClass200_117 == Static302.aClass200_115) {
									Static141.method2567();
									Static213.method3544();
									Static346.aClass200_117 = null;
									return true;
								} else if (Static367.aClass200_141 == Static346.aClass200_117) {
									Static458.anInt4947 = Static327.aClass2_Sub17_Sub1_1.method2886() << 3;
									Static648.anInt10472 = Static327.aClass2_Sub17_Sub1_1.method2859();
									Static412.anInt6934 = Static327.aClass2_Sub17_Sub1_1.method2860() << 3;
									while (Static327.aClass2_Sub17_Sub1_1.anInt3378 < Static245.anInt4755) {
										@Pc(2569) Class55 local2569 = Static562.method7869()[Static327.aClass2_Sub17_Sub1_1.method2859()];
										Static374.method5553(local2569);
									}
									Static346.aClass200_117 = null;
									return true;
								} else if (Static544.aClass200_202 == Static346.aClass200_117) {
									Static97.method1921();
									Static346.aClass200_117 = null;
									return true;
								} else if (Static70.aClass200_41 == Static346.aClass200_117) {
									local237 = Static327.aClass2_Sub17_Sub1_1.method2859();
									@Pc(2609) boolean local2609 = (local237 & 0x1) == 1;
									local586 = Static327.aClass2_Sub17_Sub1_1.method2833();
									local1710 = Static327.aClass2_Sub17_Sub1_1.method2833();
									if (local1710.equals("")) {
										local1710 = local586;
									}
									local847 = Static327.aClass2_Sub17_Sub1_1.method2833();
									local596 = Static327.aClass2_Sub17_Sub1_1.method2833();
									if (local596.equals("")) {
										local596 = local847;
									}
									if (local2609) {
										for (local1398 = 0; local1398 < Static568.anInt9305; local1398++) {
											if (Static307.aStringArray33[local1398].equals(local596)) {
												Static84.aStringArray8[local1398] = local586;
												Static307.aStringArray33[local1398] = local1710;
												Static188.aStringArray22[local1398] = local847;
												Static204.aStringArray26[local1398] = local596;
												break;
											}
										}
									} else {
										Static84.aStringArray8[Static568.anInt9305] = local586;
										Static307.aStringArray33[Static568.anInt9305] = local1710;
										Static188.aStringArray22[Static568.anInt9305] = local847;
										Static204.aStringArray26[Static568.anInt9305] = local596;
										Static66.aBooleanArray1[Static568.anInt9305] = (local237 & 0x2) == 2;
										Static568.anInt9305++;
									}
									Static76.anInt1945 = Static148.anInt3063;
									Static346.aClass200_117 = null;
									return true;
								} else if (Static346.aClass200_117 == Static55.aClass200_26) {
									local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
									if (local237 == 65535) {
										local237 = -1;
									}
									local75 = Static327.aClass2_Sub17_Sub1_1.method2859();
									local263 = Static327.aClass2_Sub17_Sub1_1.method2825();
									local394 = Static327.aClass2_Sub17_Sub1_1.method2859();
									local398 = Static327.aClass2_Sub17_Sub1_1.method2825();
									Static565.method7889(local75, local394, local237, local263, local398);
									Static346.aClass200_117 = null;
									return true;
								} else if (Static346.aClass200_117 == Static443.aClass200_166) {
									Static141.method2567();
									Static83.method1789();
									Static346.aClass200_117 = null;
									return true;
								} else if (Static521.aClass200_195 == Static346.aClass200_117) {
									local484 = Static327.aClass2_Sub17_Sub1_1.method2833();
									local75 = Static327.aClass2_Sub17_Sub1_1.method2825();
									local586 = Static327.aClass344_1.method7949(local75).method6603(Static327.aClass2_Sub17_Sub1_1);
									Static144.method2592(local484, 19, local75, local484, local484, local586, (String) null, 0);
									Static346.aClass200_117 = null;
									return true;
								} else if (Static284.aClass200_109 == Static346.aClass200_117) {
									Static309.method6851();
									Static346.aClass200_117 = null;
									return false;
								} else {
									@Pc(2867) int local2867;
									@Pc(2859) long local2859;
									@Pc(2877) int local2877;
									if (Static346.aClass200_117 == Static473.aClass200_176) {
										local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
										local490 = Static327.aClass2_Sub17_Sub1_1.method2833();
										local586 = local490;
										if (local578) {
											local586 = Static327.aClass2_Sub17_Sub1_1.method2833();
										}
										local996 = Static327.aClass2_Sub17_Sub1_1.method2872();
										local1001 = (long) Static327.aClass2_Sub17_Sub1_1.method2825();
										local2859 = (long) Static327.aClass2_Sub17_Sub1_1.method2835();
										local1295 = Static327.aClass2_Sub17_Sub1_1.method2859();
										local2867 = Static327.aClass2_Sub17_Sub1_1.method2825();
										@Pc(2873) long local2873 = (local1001 << 32) + local2859;
										@Pc(2875) boolean local2875 = false;
										local2877 = 0;
										while (true) {
											if (local2877 >= 100) {
												if (local1295 <= 1 && Static209.method3513(local586)) {
													local2875 = true;
												}
												break;
											}
											if (Static294.aLongArray10[local2877] == local2873) {
												local2875 = true;
												break;
											}
											local2877++;
										}
										if (!local2875 && Static365.anInt6307 == 0) {
											Static294.aLongArray10[Static246.anInt4756] = local2873;
											Static246.anInt4756 = (Static246.anInt4756 + 1) % 100;
											@Pc(2931) String local2931 = Static327.aClass344_1.method7949(local2867).method6603(Static327.aClass2_Sub17_Sub1_1);
											if (local1295 == 2) {
												Static144.method2592(local490, 20, local2867, "<img=1>" + local586, "<img=1>" + local490, local2931, Static4.method68(local996), 0);
											} else if (local1295 == 1) {
												Static144.method2592(local490, 20, local2867, "<img=0>" + local586, "<img=0>" + local490, local2931, Static4.method68(local996), 0);
											} else {
												Static144.method2592(local490, 20, local2867, local586, local490, local2931, Static4.method68(local996), 0);
											}
										}
										Static346.aClass200_117 = null;
										return true;
									} else if (Static346.aClass200_117 == Static335.aClass200_132) {
										local237 = Static327.aClass2_Sub17_Sub1_1.method2854();
										if (local237 == 65535) {
											local237 = -1;
										}
										local75 = Static327.aClass2_Sub17_Sub1_1.method2887();
										local263 = Static327.aClass2_Sub17_Sub1_1.method2843();
										Static141.method2567();
										Static176.method3031(local75, local237, local263);
										@Pc(3044) Class327 local3044 = Static470.aClass250_1.method5960(local237);
										Static269.method4435(local3044.anInt8720, local3044.anInt8765, local263, local3044.anInt8723);
										Static437.method6297(local3044.lb, local263, local3044.anInt8724, local3044.anInt8739);
										Static346.aClass200_117 = null;
										return true;
									} else if (Static34.aClass200_24 == Static346.aClass200_117) {
										Static374.method5553(Static49.aClass55_2);
										Static346.aClass200_117 = null;
										return true;
									} else if (Static229.aClass200_81 == Static346.aClass200_117) {
										Static346.aClass200_117 = null;
										Static76.anInt1945 = Static148.anInt3063;
										Static464.anInt7517 = 1;
										return true;
									} else if (Static346.aClass200_117 == Static167.aClass200_70) {
										local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
										local75 = Static327.aClass2_Sub17_Sub1_1.method2825();
										local263 = Static327.aClass2_Sub17_Sub1_1.method2830();
										Static141.method2567();
										Static580.method8045(local263, local237 + (local75 << 16));
										Static346.aClass200_117 = null;
										return true;
									} else if (Static346.aClass200_117 == Static333.aClass200_131) {
										local484 = Static327.aClass2_Sub17_Sub1_1.method2833();
										local75 = Static327.aClass2_Sub17_Sub1_1.method2863();
										Static141.method2567();
										Static604.method8495(local484, local75);
										Static346.aClass200_117 = null;
										return true;
									} else {
										@Pc(3175) Class2_Sub28 local3175;
										if (Static346.aClass200_117 == Static385.aClass200_145) {
											local237 = Static327.aClass2_Sub17_Sub1_1.method2843();
											local75 = Static327.aClass2_Sub17_Sub1_1.method2887();
											Static141.method2567();
											@Pc(3168) Class2_Sub28 local3168 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local237);
											local3175 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local75);
											if (local3175 != null) {
												Static4.method71(false, local3175, local3168 == null || local3168.anInt5454 != local3175.anInt5454);
											}
											if (local3168 != null) {
												local3168.method8920();
												Static22.aClass323_4.method7477(local3168, (long) local75);
											}
											@Pc(3206) Class303 local3206 = Static43.method1101(local237);
											if (local3206 != null) {
												Static514.method7103(local3206);
											}
											local3206 = Static43.method1101(local75);
											if (local3206 != null) {
												Static514.method7103(local3206);
												Static103.method1958(local3206, true);
											}
											if (Static592.anInt9857 != -1) {
												Static593.method8369(1, Static592.anInt9857);
											}
											Static346.aClass200_117 = null;
											return true;
										} else if (Static638.aClass200_224 == Static346.aClass200_117) {
											local237 = Static327.aClass2_Sub17_Sub1_1.method2863();
											@Pc(3247) byte local3247 = Static327.aClass2_Sub17_Sub1_1.method2860();
											Static382.aClass282_1.method6477(local3247, local237);
											Static346.aClass200_117 = null;
											return true;
										} else if (Static346.aClass200_117 == Static467.aClass200_227) {
											local237 = Static327.aClass2_Sub17_Sub1_1.method2859();
											local75 = Static327.aClass2_Sub17_Sub1_1.method2887();
											Static141.method2567();
											Static149.method2642(local237, local75);
											Static346.aClass200_117 = null;
											return true;
										} else if (Static346.aClass200_117 == Static11.aClass200_3) {
											local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
											@Pc(3299) byte[] local3299 = new byte[Static245.anInt4755 - 1];
											Static327.aClass2_Sub17_Sub1_1.method2832(local3299, Static245.anInt4755 - 1, 0);
											Static74.method7151(local3299, local578);
											Static346.aClass200_117 = null;
											return true;
										} else if (Static346.aClass200_117 == Static429.aClass200_229) {
											if (Static85.method1801(Static454.anInt7416)) {
												Static626.anInt10190 = (int) ((float) Static327.aClass2_Sub17_Sub1_1.method2825() * 2.5F);
											} else {
												Static626.anInt10190 = Static327.aClass2_Sub17_Sub1_1.method2825() * 30;
											}
											Static82.anInt2146 = Static148.anInt3063;
											Static346.aClass200_117 = null;
											return true;
										} else if (Static509.aClass200_191 == Static346.aClass200_117) {
											local237 = Static327.aClass2_Sub17_Sub1_1.method2843();
											Static141.method2567();
											Static361.method5387(Static608.anInt10056, local237, 5, 0);
											Static346.aClass200_117 = null;
											return true;
										} else if (Static333.aClass200_130 == Static346.aClass200_117) {
											local237 = Static327.aClass2_Sub17_Sub1_1.method2859();
											local75 = local237 >> 5;
											local263 = local237 & 0x1F;
											if (local263 == 0) {
												Static448.aClass110Array1[local75] = null;
												Static346.aClass200_117 = null;
												return true;
											}
											@Pc(3400) Class110 local3400 = new Class110();
											local3400.anInt3142 = local263;
											local3400.anInt3135 = Static327.aClass2_Sub17_Sub1_1.method2859();
											if (local3400.anInt3135 >= 0 && Static435.aClass31Array13.length > local3400.anInt3135) {
												if (local3400.anInt3142 == 1 || local3400.anInt3142 == 10) {
													local3400.anInt3136 = Static327.aClass2_Sub17_Sub1_1.method2825();
													Static327.aClass2_Sub17_Sub1_1.anInt3378 += 6;
												} else if (local3400.anInt3142 >= 2 && local3400.anInt3142 <= 6) {
													if (local3400.anInt3142 == 2) {
														local3400.anInt3139 = 256;
														local3400.anInt3143 = 256;
													}
													if (local3400.anInt3142 == 3) {
														local3400.anInt3139 = 0;
														local3400.anInt3143 = 256;
													}
													if (local3400.anInt3142 == 4) {
														local3400.anInt3143 = 256;
														local3400.anInt3139 = 512;
													}
													if (local3400.anInt3142 == 5) {
														local3400.anInt3139 = 256;
														local3400.anInt3143 = 0;
													}
													if (local3400.anInt3142 == 6) {
														local3400.anInt3143 = 512;
														local3400.anInt3139 = 256;
													}
													local3400.anInt3142 = 2;
													local3400.anInt3144 = Static327.aClass2_Sub17_Sub1_1.method2859();
													local3400.anInt3139 += Static327.aClass2_Sub17_Sub1_1.method2825() - Static406.anInt6899 << 9;
													local3400.anInt3143 += Static327.aClass2_Sub17_Sub1_1.method2825() - Static338.anInt5885 << 9;
													local3400.anInt3137 = Static327.aClass2_Sub17_Sub1_1.method2859() << 2;
													local3400.anInt3145 = Static327.aClass2_Sub17_Sub1_1.method2825();
												}
												local3400.anInt3140 = Static327.aClass2_Sub17_Sub1_1.method2825();
												if (local3400.anInt3140 == 65535) {
													local3400.anInt3140 = -1;
												}
												Static448.aClass110Array1[local75] = local3400;
											}
											Static346.aClass200_117 = null;
											return true;
										} else if (Static346.aClass200_117 == Static284.aClass200_110) {
											local237 = Static327.aClass2_Sub17_Sub1_1.method2865();
											local75 = Static327.aClass2_Sub17_Sub1_1.method2888();
											local263 = Static327.aClass2_Sub17_Sub1_1.method2854() << 2;
											local394 = Static327.aClass2_Sub17_Sub1_1.method2842();
											local398 = Static327.aClass2_Sub17_Sub1_1.method2888();
											Static141.method2567();
											Static411.method6039(local263, local237, true, local398, local75, local394);
											Static346.aClass200_117 = null;
											return true;
										} else if (Static346.aClass200_117 == Static230.aClass200_83) {
											Static191.anInt3815 = Static327.aClass2_Sub17_Sub1_1.method2859();
											Static346.aClass200_117 = null;
											Static82.anInt2146 = Static148.anInt3063;
											return true;
										} else if (Static346.aClass200_117 == Static310.aClass200_120) {
											local237 = Static327.aClass2_Sub17_Sub1_1.method2865();
											local75 = Static327.aClass2_Sub17_Sub1_1.method2859();
											local263 = Static327.aClass2_Sub17_Sub1_1.method2876();
											local394 = Static327.aClass2_Sub17_Sub1_1.method2865();
											local398 = Static327.aClass2_Sub17_Sub1_1.method2859();
											Static141.method2567();
											Static298.aBooleanArray10[local237] = true;
											Static522.anIntArray623[local237] = local394;
											Static406.anIntArray460[local237] = local398;
											Static487.anIntArray559[local237] = local75;
											Static455.anIntArray684[local237] = local263;
											Static346.aClass200_117 = null;
											return true;
										} else {
											@Pc(3746) int local3746;
											if (Static346.aClass200_117 == Static457.aClass200_204) {
												local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
												local490 = Static327.aClass2_Sub17_Sub1_1.method2833();
												local586 = local490;
												if (local578) {
													local586 = Static327.aClass2_Sub17_Sub1_1.method2833();
												}
												local996 = Static327.aClass2_Sub17_Sub1_1.method2872();
												local1001 = (long) Static327.aClass2_Sub17_Sub1_1.method2825();
												local2859 = (long) Static327.aClass2_Sub17_Sub1_1.method2835();
												local1295 = Static327.aClass2_Sub17_Sub1_1.method2859();
												@Pc(3742) long local3742 = (local1001 << 32) + local2859;
												@Pc(3744) boolean local3744 = false;
												local3746 = 0;
												while (true) {
													if (local3746 >= 100) {
														if (local1295 <= 1) {
															if (Static279.aBoolean378 && !Static318.aBoolean410 || Static539.aBoolean620) {
																local3744 = true;
															} else if (Static209.method3513(local586)) {
																local3744 = true;
															}
														}
														break;
													}
													if (Static294.aLongArray10[local3746] == local3742) {
														local3744 = true;
														break;
													}
													local3746++;
												}
												if (!local3744 && Static365.anInt6307 == 0) {
													Static294.aLongArray10[Static246.anInt4756] = local3742;
													Static246.anInt4756 = (Static246.anInt4756 + 1) % 100;
													@Pc(3808) String local3808 = Static355.method5321(Static281.method4506(Static327.aClass2_Sub17_Sub1_1));
													if (local1295 == 2 || local1295 == 3) {
														Static144.method2592(local490, 9, -1, "<img=1>" + local586, "<img=1>" + local490, local3808, Static4.method68(local996), 0);
													} else if (local1295 == 1) {
														Static144.method2592(local490, 9, -1, "<img=0>" + local586, "<img=0>" + local490, local3808, Static4.method68(local996), 0);
													} else {
														Static144.method2592(local490, 9, -1, local586, local490, local3808, Static4.method68(local996), 0);
													}
												}
												Static346.aClass200_117 = null;
												return true;
											} else if (Static346.aClass200_117 == Static425.aClass200_159) {
												local237 = Static327.aClass2_Sub17_Sub1_1.method2859();
												if (Static327.aClass2_Sub17_Sub1_1.method2859() == 0) {
													Static158.aClass29Array1[local237] = new Class29();
												} else {
													Static327.aClass2_Sub17_Sub1_1.anInt3378--;
													Static158.aClass29Array1[local237] = new Class29(Static327.aClass2_Sub17_Sub1_1);
												}
												Static346.aClass200_117 = null;
												Static313.anInt8606 = Static148.anInt3063;
												return true;
											} else if (Static346.aClass200_117 == Static2.aClass200_1) {
												Static596.method8399();
												Static346.aClass200_117 = null;
												return false;
											} else if (Static520.aClass200_193 == Static346.aClass200_117) {
												if (Static18.aFrame1 != null) {
													Static63.method1431(-1, false, Static305.aClass2_Sub49_15.aClass33_Sub25_2.method7520(), -1);
												}
												@Pc(3955) byte[] local3955 = new byte[Static245.anInt4755];
												Static327.aClass2_Sub17_Sub1_1.method2453(local3955, Static245.anInt4755);
												local490 = Static422.method6164(0, Static245.anInt4755, local3955);
												Static165.method2816(true, local490, Static265.aClass286_3, Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 1);
												Static346.aClass200_117 = null;
												return true;
											} else if (Static346.aClass200_117 == Static136.aClass200_60) {
												local213 = Static327.aClass2_Sub17_Sub1_1.method2860();
												local75 = Static327.aClass2_Sub17_Sub1_1.method2876();
												Static141.method2567();
												Static79.method1730(local213, local75);
												Static346.aClass200_117 = null;
												return true;
											} else if (Static346.aClass200_117 == Static299.aClass200_114) {
												local237 = Static327.aClass2_Sub17_Sub1_1.method2876();
												local75 = Static327.aClass2_Sub17_Sub1_1.method2863();
												Static141.method2567();
												Static182.method3120(local237, local75);
												Static346.aClass200_117 = null;
												return true;
											} else if (Static346.aClass200_117 == Static233.aClass200_86) {
												local237 = Static327.aClass2_Sub17_Sub1_1.method2876();
												local490 = Static327.aClass2_Sub17_Sub1_1.method2833();
												Static141.method2567();
												Static604.method8495(local490, local237);
												Static346.aClass200_117 = null;
												return true;
											} else {
												@Pc(4112) Class2_Sub19 local4112;
												@Pc(4130) Class2_Sub19 local4130;
												if (Static187.aClass200_75 == Static346.aClass200_117) {
													local237 = Static327.aClass2_Sub17_Sub1_1.method2876();
													local75 = Static327.aClass2_Sub17_Sub1_1.method2825();
													if (local75 == 65535) {
														local75 = -1;
													}
													local263 = Static327.aClass2_Sub17_Sub1_1.method2854();
													if (local263 == 65535) {
														local263 = -1;
													}
													local394 = Static327.aClass2_Sub17_Sub1_1.method2830();
													Static141.method2567();
													for (local398 = local75; local398 <= local263; local398++) {
														local1001 = (long) local398 + ((long) local394 << 32);
														local4112 = (Class2_Sub19) Static472.aClass323_28.method7484(local1001);
														if (local4112 != null) {
															local4130 = new Class2_Sub19(local4112.anInt3087, local237);
															local4112.method8920();
														} else if (local398 == -1) {
															local4130 = new Class2_Sub19(Static43.method1101(local394).aClass2_Sub19_2.anInt3087, local237);
														} else {
															local4130 = new Class2_Sub19(0, local237);
														}
														Static472.aClass323_28.method7477(local4130, local1001);
													}
													Static346.aClass200_117 = null;
													return true;
												} else if (Static346.aClass200_117 == Static233.aClass200_87) {
													Static286.method4558(Static327.aClass2_Sub17_Sub1_1.method2833());
													Static346.aClass200_117 = null;
													return true;
												} else if (Static431.aClass200_180 == Static346.aClass200_117) {
													local237 = Static327.aClass2_Sub17_Sub1_1.method2887();
													local75 = Static327.aClass2_Sub17_Sub1_1.method2854();
													Static141.method2567();
													if (local75 == 65535) {
														local75 = -1;
													}
													Static361.method5387(local75, local237, 2, -1);
													Static346.aClass200_117 = null;
													return true;
												} else if (Static346.aClass200_117 == Static283.aClass200_108) {
													local237 = Static327.aClass2_Sub17_Sub1_1.method2876();
													local75 = Static327.aClass2_Sub17_Sub1_1.method2865();
													@Pc(4222) int[] local4222 = new int[4];
													for (local394 = 0; local394 < 4; local394++) {
														local4222[local394] = Static327.aClass2_Sub17_Sub1_1.method2825();
													}
													@Pc(4243) Class2_Sub32 local4243 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local237);
													if (local4243 != null) {
														Static18.method520(local4243.aClass16_Sub1_Sub1_Sub3_Sub1_2, local75, local4222);
													}
													Static346.aClass200_117 = null;
													return true;
												} else if (Static564.aClass200_190 == Static346.aClass200_117) {
													Static374.method5553(Static645.aClass55_15);
													Static346.aClass200_117 = null;
													return true;
												} else if (Static346.aClass200_117 == Static238.aClass200_189) {
													local237 = Static327.aClass2_Sub17_Sub1_1.method2854();
													if (local237 == 65535) {
														local237 = -1;
													}
													local75 = Static327.aClass2_Sub17_Sub1_1.method2881();
													local263 = Static327.aClass2_Sub17_Sub1_1.method2825();
													if (local263 == 65535) {
														local263 = -1;
													}
													local394 = Static327.aClass2_Sub17_Sub1_1.method2843();
													Static141.method2567();
													for (local398 = local263; local398 <= local237; local398++) {
														local1001 = ((long) local75 << 32) + (long) local398;
														local4112 = (Class2_Sub19) Static472.aClass323_28.method7484(local1001);
														if (local4112 != null) {
															local4130 = new Class2_Sub19(local394, local4112.anInt3092);
															local4112.method8920();
														} else if (local398 == -1) {
															local4130 = new Class2_Sub19(local394, Static43.method1101(local75).aClass2_Sub19_2.anInt3092);
														} else {
															local4130 = new Class2_Sub19(local394, -1);
														}
														Static472.aClass323_28.method7477(local4130, local1001);
													}
													Static346.aClass200_117 = null;
													return true;
												} else if (Static31.aClass200_23 == Static346.aClass200_117) {
													local237 = Static327.aClass2_Sub17_Sub1_1.method2842();
													local75 = Static327.aClass2_Sub17_Sub1_1.method2854();
													if (local75 == 65535) {
														local75 = -1;
													}
													local263 = Static327.aClass2_Sub17_Sub1_1.method2842();
													Static283.method4512(local237, local263, local75);
													Static346.aClass200_117 = null;
													return true;
												} else if (Static529.aClass200_196 == Static346.aClass200_117) {
													local237 = Static327.aClass2_Sub17_Sub1_1.method2859();
													local75 = Static327.aClass2_Sub17_Sub1_1.method2839();
													local263 = Static327.aClass2_Sub17_Sub1_1.method2876();
													if (local263 == 65535) {
														local263 = -1;
													}
													Static554.method7827(local237, local263, local75);
													Static346.aClass200_117 = null;
													return true;
												} else if (Static346.aClass200_117 == Static414.aClass200_152) {
													Static374.method5553(Static190.aClass55_6);
													Static346.aClass200_117 = null;
													return true;
												} else {
													@Pc(4524) boolean local4524;
													@Pc(4532) int local4532;
													if (Static346.aClass200_117 == Static639.aClass200_225) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2863();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2863();
														local263 = Static327.aClass2_Sub17_Sub1_1.method2854();
														local394 = Static327.aClass2_Sub17_Sub1_1.method2887();
														local398 = Static327.aClass2_Sub17_Sub1_1.method2859();
														local1243 = (local398 & 0x80) != 0;
														local1398 = local398 & 0x7;
														local615 = local398 >> 3 & 0xF;
														if (local615 == 15) {
															local615 = -1;
														}
														if (local394 >> 30 == 0) {
															@Pc(4550) Class354 local4550;
															@Pc(4613) Class228 local4613;
															@Pc(4564) Class228 local4564;
															if (local394 >> 29 != 0) {
																local1285 = local394 & 0xFFFF;
																@Pc(4510) Class2_Sub32 local4510 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local1285);
																if (local4510 != null) {
																	if (local75 == 65535) {
																		local75 = -1;
																	}
																	@Pc(4522) Class16_Sub1_Sub1_Sub3_Sub1 local4522 = local4510.aClass16_Sub1_Sub1_Sub3_Sub1_2;
																	local4524 = true;
																	local4532 = local1243 ? local4522.anInt8084 : local4522.anInt8053;
																	if (local75 != -1 && local4532 != -1) {
																		if (local75 == local4532) {
																			local4550 = Static546.aClass263_1.method6113(local75);
																			if (local4550.aBoolean712 && local4550.anInt9829 != -1) {
																				local4564 = Static479.aClass308_2.method7075(local4550.anInt9829);
																				@Pc(4567) int local4567 = local4564.anInt6220;
																				if (local4567 == 0 || local4567 == 2) {
																					local4524 = false;
																				} else if (local4567 == 1) {
																					local4524 = true;
																				}
																			}
																		} else {
																			local4550 = Static546.aClass263_1.method6113(local75);
																			@Pc(4598) Class354 local4598 = Static546.aClass263_1.method6113(local4532);
																			if (local4550.anInt9829 != -1 && local4598.anInt9829 != -1) {
																				local4613 = Static479.aClass308_2.method7075(local4550.anInt9829);
																				@Pc(4619) Class228 local4619 = Static479.aClass308_2.method7075(local4598.anInt9829);
																				if (local4619.anInt6227 > local4613.anInt6227) {
																					local4524 = false;
																				}
																			}
																		}
																	}
																	if (local4524) {
																		if (local1243) {
																			local4522.anInt8129 = 1;
																			local4522.anInt8079 = 0;
																			local4522.anInt8061 = local1398;
																			local4522.anInt8084 = local75;
																			local4522.anInt8088 = Static389.anInt6694 + local263;
																			local4522.anInt8058 = 0;
																			local4522.anInt8070 = local615;
																			local4522.anInt8093 = local237;
																			if (local4522.anInt8088 > Static389.anInt6694) {
																				local4522.anInt8058 = -1;
																			}
																			if (local4522.anInt8084 != -1 && local4522.anInt8088 == Static389.anInt6694) {
																				local3746 = Static546.aClass263_1.method6113(local4522.anInt8084).anInt9829;
																				if (local3746 != -1) {
																					local4564 = Static479.aClass308_2.method7075(local3746);
																					if (local4564 != null && local4564.anIntArray403 != null && !local4522.aBoolean587) {
																						Static145.method2602(0, local4522, local4564);
																					}
																				}
																			}
																		} else {
																			local4522.anInt8063 = local615;
																			local4522.anInt8108 = local263 + Static389.anInt6694;
																			local4522.anInt8055 = local237;
																			local4522.anInt8066 = 1;
																			local4522.anInt8052 = local1398;
																			local4522.anInt8099 = 0;
																			local4522.anInt8053 = local75;
																			local4522.anInt8132 = 0;
																			if (Static389.anInt6694 < local4522.anInt8108) {
																				local4522.anInt8099 = -1;
																			}
																			if (local4522.anInt8053 != -1 && local4522.anInt8108 == Static389.anInt6694) {
																				local3746 = Static546.aClass263_1.method6113(local4522.anInt8053).anInt9829;
																				if (local3746 != -1) {
																					local4564 = Static479.aClass308_2.method7075(local3746);
																					if (local4564 != null && local4564.anIntArray403 != null && !local4522.aBoolean587) {
																						Static145.method2602(0, local4522, local4564);
																					}
																				}
																			}
																		}
																	}
																}
															} else if (local394 >> 28 != 0) {
																local1285 = local394 & 0xFFFF;
																@Pc(4795) Class16_Sub1_Sub1_Sub3_Sub2 local4795;
																if (local1285 == Static608.anInt10056) {
																	local4795 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1;
																} else {
																	local4795 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local1285];
																}
																if (local4795 != null) {
																	if (local75 == 65535) {
																		local75 = -1;
																	}
																	local1013 = true;
																	local1015 = local1243 ? local4795.anInt8084 : local4795.anInt8053;
																	@Pc(4852) Class228 local4852;
																	if (local75 != -1 && local1015 != -1) {
																		@Pc(4839) Class354 local4839;
																		if (local1015 == local75) {
																			local4839 = Static546.aClass263_1.method6113(local75);
																			if (local4839.aBoolean712 && local4839.anInt9829 != -1) {
																				local4852 = Static479.aClass308_2.method7075(local4839.anInt9829);
																				local2877 = local4852.anInt6220;
																				if (local2877 == 0 || local2877 == 2) {
																					local1013 = false;
																				} else if (local2877 == 1) {
																					local1013 = true;
																				}
																			}
																		} else {
																			local4839 = Static546.aClass263_1.method6113(local75);
																			local4550 = Static546.aClass263_1.method6113(local1015);
																			if (local4839.anInt9829 != -1 && local4550.anInt9829 != -1) {
																				local4564 = Static479.aClass308_2.method7075(local4839.anInt9829);
																				local4613 = Static479.aClass308_2.method7075(local4550.anInt9829);
																				if (local4564.anInt6227 < local4613.anInt6227) {
																					local1013 = false;
																				}
																			}
																		}
																	}
																	if (local1013) {
																		if (local1243) {
																			local4795.anInt8061 = local1398;
																			local4795.anInt8070 = local615;
																			local4795.anInt8129 = 1;
																			local4795.anInt8093 = local237;
																			local4795.anInt8084 = local75;
																			local4795.anInt8088 = local263 + Static389.anInt6694;
																			local4795.anInt8079 = 0;
																			local4795.anInt8058 = 0;
																			if (local4795.anInt8084 == 65535) {
																				local4795.anInt8084 = -1;
																			}
																			if (local4795.anInt8088 > Static389.anInt6694) {
																				local4795.anInt8058 = -1;
																			}
																			if (local4795.anInt8084 != -1 && local4795.anInt8088 == Static389.anInt6694) {
																				local4532 = Static546.aClass263_1.method6113(local4795.anInt8084).anInt9829;
																				if (local4532 != -1) {
																					local4852 = Static479.aClass308_2.method7075(local4532);
																					if (local4852 != null && local4852.anIntArray403 != null && !local4795.aBoolean587) {
																						Static145.method2602(0, local4795, local4852);
																					}
																				}
																			}
																		} else {
																			local4795.anInt8099 = 0;
																			local4795.anInt8063 = local615;
																			local4795.anInt8108 = local263 + Static389.anInt6694;
																			local4795.anInt8055 = local237;
																			local4795.anInt8066 = 1;
																			local4795.anInt8132 = 0;
																			local4795.anInt8052 = local1398;
																			local4795.anInt8053 = local75;
																			if (local4795.anInt8053 == 65535) {
																				local4795.anInt8053 = -1;
																			}
																			if (Static389.anInt6694 < local4795.anInt8108) {
																				local4795.anInt8099 = -1;
																			}
																			if (local4795.anInt8053 != -1 && Static389.anInt6694 == local4795.anInt8108) {
																				local4532 = Static546.aClass263_1.method6113(local4795.anInt8053).anInt9829;
																				if (local4532 != -1) {
																					local4852 = Static479.aClass308_2.method7075(local4532);
																					if (local4852 != null && local4852.anIntArray403 != null && !local4795.aBoolean587) {
																						Static145.method2602(0, local4795, local4852);
																					}
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local1285 = local394 >> 28 & 0x3;
															local1295 = (local394 >> 14 & 0x3FFF) - Static406.anInt6899;
															local2867 = (local394 & 0x3FFF) - Static338.anInt5885;
															if (local1295 >= 0 && local2867 >= 0 && Static456.anInt7428 > local1295 && Static5.anInt112 > local2867) {
																local1015 = local1295 * 512 + 256;
																local4532 = local2867 * 512 + 256;
																local3746 = local1285;
																if (local1285 < 3 && Static481.method6813(local2867, local1295)) {
																	local3746 = local1285 + 1;
																}
																@Pc(5176) Class16_Sub1_Sub1_Sub2 local5176 = new Class16_Sub1_Sub1_Sub2(local75, local263, Static389.anInt6694, local1285, local3746, local1015, Static392.method5799(local1285, local1015, local4532) - local237, local4532, local1295, local1295, local2867, local2867, local1398);
																Static329.aClass114_28.method2771(new Class2_Sub7_Sub1(local5176));
															}
														}
														Static346.aClass200_117 = null;
														return true;
													} else if (Static444.aClass200_167 == Static346.aClass200_117) {
														Static448.method6402(false);
														Static346.aClass200_117 = null;
														return false;
													} else if (Static346.aClass200_117 == Static191.aClass200_78) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2881();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2826();
														Static141.method2567();
														Static179.method3070(local75, local237);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static374.aClass200_143) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2863();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2881();
														Static141.method2567();
														Static89.method6070(local75, local237);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static229.aClass200_82) {
														Static374.method5553(Static308.aClass55_9);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static572.aClass200_207) {
														Static502.anInt9931 = Static327.aClass2_Sub17_Sub1_1.method2859();
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static424.aClass200_156) {
														Static501.anInt8009 = Static327.aClass2_Sub17_Sub1_1.method2836();
														Static82.anInt2146 = Static148.anInt3063;
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static347.aClass200_215) {
														local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
														local490 = Static327.aClass2_Sub17_Sub1_1.method2833();
														local586 = local490;
														if (local578) {
															local586 = Static327.aClass2_Sub17_Sub1_1.method2833();
														}
														local394 = Static327.aClass2_Sub17_Sub1_1.method2859();
														local2228 = false;
														if (local394 <= 1) {
															if (Static279.aBoolean378 && !Static318.aBoolean410 || Static539.aBoolean620) {
																local2228 = true;
															} else if (local394 <= 1 && Static209.method3513(local586)) {
																local2228 = true;
															}
														}
														if (!local2228 && Static365.anInt6307 == 0) {
															local596 = Static355.method5321(Static281.method4506(Static327.aClass2_Sub17_Sub1_1));
															if (local394 == 2) {
																Static144.method2592(local490, 24, -1, "<img=1>" + local586, "<img=1>" + local490, local596, (String) null, 0);
															} else if (local394 == 1) {
																Static144.method2592(local490, 24, -1, "<img=0>" + local586, "<img=0>" + local490, local596, (String) null, 0);
															} else {
																Static144.method2592(local490, 24, -1, local586, local490, local596, (String) null, 0);
															}
														}
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static450.aClass200_170) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2825();
														local263 = Static327.aClass2_Sub17_Sub1_1.method2825();
														Static141.method2567();
														if (Static261.aClass303ArrayArray1[local237] != null) {
															for (local394 = local75; local394 < local263; local394++) {
																local398 = Static327.aClass2_Sub17_Sub1_1.method2835();
																if (Static261.aClass303ArrayArray1[local237].length > local394 && Static261.aClass303ArrayArray1[local237][local394] != null) {
																	Static261.aClass303ArrayArray1[local237][local394].anInt7987 = local398;
																}
															}
														}
														Static346.aClass200_117 = null;
														return true;
													} else if (Static318.aClass200_125 == Static346.aClass200_117) {
														Static374.method5553(Static360.aClass55_10);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static93.aClass200_42) {
														Static382.aClass282_1.method6480();
														Static134.anInt9427 += 32;
														Static346.aClass200_117 = null;
														return true;
													} else if (Static520.aClass200_194 == Static346.aClass200_117) {
														Static374.method5553(Static460.aClass55_12);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static61.aClass200_35) {
														Static374.method5553(Static5.aClass55_1);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static356.aClass200_138 == Static346.aClass200_117) {
														Static412.anInt6934 = Static327.aClass2_Sub17_Sub1_1.method2852() << 3;
														Static458.anInt4947 = Static327.aClass2_Sub17_Sub1_1.method2838() << 3;
														Static648.anInt10472 = Static327.aClass2_Sub17_Sub1_1.method2865();
														Static346.aClass200_117 = null;
														return true;
													} else if (Static457.aClass200_203 == Static346.aClass200_117) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2854();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2830();
														Static141.method2567();
														Static346.method4792(local75, local237);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static626.aClass200_219) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2859();
														local544 = (local75 & 0x1) == 1;
														while (Static327.aClass2_Sub17_Sub1_1.anInt3378 < Static245.anInt4755) {
															local394 = Static327.aClass2_Sub17_Sub1_1.method2853();
															local398 = Static327.aClass2_Sub17_Sub1_1.method2825();
															local1531 = 0;
															if (local398 != 0) {
																local1531 = Static327.aClass2_Sub17_Sub1_1.method2859();
																if (local1531 == 255) {
																	local1531 = Static327.aClass2_Sub17_Sub1_1.method2881();
																}
															}
															Static194.method3320(local544, local398 - 1, local394, local237, local1531);
														}
														Static434.anIntArray484[Static43.anInt1122++ & 0x1F] = local237;
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static315.aClass200_124) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2887();
														Static141.method2567();
														@Pc(5670) Class2_Sub28 local5670 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local237);
														if (local5670 != null) {
															Static4.method71(false, local5670, true);
														}
														if (Static381.aClass303_23 != null) {
															Static514.method7103(Static381.aClass303_23);
															Static381.aClass303_23 = null;
														}
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static433.aClass200_163) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
														Static141.method2567();
														Static414.method6057(local237);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static364.aClass200_140) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2888();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2843();
														local263 = Static327.aClass2_Sub17_Sub1_1.method2863();
														Static141.method2567();
														local3175 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local75);
														if (local3175 != null) {
															Static4.method71(false, local3175, local3175.anInt5454 != local263);
														}
														Static602.method8473(local75, false, local263, local237);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static329.aClass200_127) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2859();
														Static141.method2567();
														if (local75 == 2) {
															Static234.method3745();
														}
														Static592.anInt9857 = local237;
														Static138.method2521(local237);
														Static403.method6011(false);
														Static156.method2736(Static592.anInt9857);
														for (local263 = 0; local263 < 100; local263++) {
															Static377.aBooleanArray14[local263] = true;
														}
														Static346.aClass200_117 = null;
														return true;
													} else if (Static163.aClass200_69 == Static346.aClass200_117) {
														local484 = Static327.aClass2_Sub17_Sub1_1.method2833();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2887();
														Static141.method2567();
														Static366.method5447(local75, local484);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static450.aClass200_169 == Static346.aClass200_117) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2836();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2826();
														local263 = Static327.aClass2_Sub17_Sub1_1.method2881();
														Static141.method2567();
														Static181.method3101(local263, local75, local237);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static287.aClass200_226) {
														Static428.method6232(Static327.aClass2_Sub17_Sub1_1, Static265.aClass286_3, Static245.anInt4755);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static420.aClass200_155 == Static346.aClass200_117) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2876();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2887();
														Static382.aClass282_1.method6477(local75, local237);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static592.aClass200_210 == Static346.aClass200_117) {
														Static374.method5553(Static150.aClass55_4);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static359.aClass200_139 == Static346.aClass200_117) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2842();
														Static141.method2567();
														Static346.aClass200_117 = null;
														Static616.anInt8094 = local237;
														return true;
													} else if (Static346.aClass200_117 == Static620.aClass200_218) {
														Static298.aString48 = Static245.anInt4755 <= 2 ? Static573.aClass345_28.method7951(Static496.anInt7407) : Static327.aClass2_Sub17_Sub1_1.method2833();
														Static621.anInt10148 = Static245.anInt4755 > 0 ? Static327.aClass2_Sub17_Sub1_1.method2825() : -1;
														Static346.aClass200_117 = null;
														if (Static621.anInt10148 == 65535) {
															Static621.anInt10148 = -1;
														}
														return true;
													} else if (Static492.aClass200_185 == Static346.aClass200_117) {
														Static374.method5553(Static582.aClass55_13);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static291.aClass200_113) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2842();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2825();
														Static141.method2567();
														Static188.method3205(true, local237, local75);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static529.aClass200_197 == Static346.aClass200_117) {
														Static327.aClass2_Sub17_Sub1_1.anInt3378 += 28;
														if (Static327.aClass2_Sub17_Sub1_1.method2846()) {
															Static334.method5080(Static327.aClass2_Sub17_Sub1_1.anInt3378 - 28, Static327.aClass2_Sub17_Sub1_1);
														}
														Static346.aClass200_117 = null;
														return true;
													} else if (Static487.aClass200_184 == Static346.aClass200_117) {
														Static378.anInt8485 = Static327.aClass2_Sub17_Sub1_1.method2841();
														Static279.aBoolean378 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static6.aClass200_2) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2843();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2876();
														Static141.method2567();
														if (local75 == 65535) {
															local75 = -1;
														}
														Static464.method6566(local237, local75);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static115.aClass200_50) {
														Static580.aClass36_4 = Static488.method6981(Static327.aClass2_Sub17_Sub1_1.method2859());
														Static346.aClass200_117 = null;
														return true;
													} else if (Static643.aClass200_221 == Static346.aClass200_117) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2854();
														Static141.method2567();
														Static141.method2564(local237);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static162.aClass200_68 == Static346.aClass200_117) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2881();
														Static55.aClass319_1 = Static265.aClass286_3.method6572(local237);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static331.aClass200_128 == Static346.aClass200_117) {
														local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
														local490 = Static327.aClass2_Sub17_Sub1_1.method2833();
														local586 = local490;
														if (local578) {
															local586 = Static327.aClass2_Sub17_Sub1_1.method2833();
														}
														local996 = (long) Static327.aClass2_Sub17_Sub1_1.method2825();
														local1001 = (long) Static327.aClass2_Sub17_Sub1_1.method2835();
														local615 = Static327.aClass2_Sub17_Sub1_1.method2859();
														local1285 = Static327.aClass2_Sub17_Sub1_1.method2825();
														@Pc(6169) long local6169 = (local996 << 32) + local1001;
														local4524 = false;
														local4532 = 0;
														while (true) {
															if (local4532 >= 100) {
																if (local615 <= 1 && Static209.method3513(local586)) {
																	local4524 = true;
																}
																break;
															}
															if (local6169 == Static294.aLongArray10[local4532]) {
																local4524 = true;
																break;
															}
															local4532++;
														}
														if (!local4524 && Static365.anInt6307 == 0) {
															Static294.aLongArray10[Static246.anInt4756] = local6169;
															Static246.anInt4756 = (Static246.anInt4756 + 1) % 100;
															@Pc(6220) String local6220 = Static327.aClass344_1.method7949(local1285).method6603(Static327.aClass2_Sub17_Sub1_1);
															if (local615 == 2) {
																Static144.method2592(local490, 18, local1285, "<img=1>" + local586, "<img=1>" + local490, local6220, (String) null, 0);
															} else if (local615 == 1) {
																Static144.method2592(local490, 18, local1285, "<img=0>" + local586, "<img=0>" + local490, local6220, (String) null, 0);
															} else {
																Static144.method2592(local490, 18, local1285, local586, local490, local6220, (String) null, 0);
															}
														}
														Static346.aClass200_117 = null;
														return true;
													} else if (Static416.aClass200_154 == Static346.aClass200_117) {
														local484 = Static327.aClass2_Sub17_Sub1_1.method2833();
														@Pc(6303) Object[] local6303 = new Object[local484.length() + 1];
														for (local263 = local484.length() - 1; local263 >= 0; local263--) {
															if (local484.charAt(local263) == 's') {
																local6303[local263 + 1] = Static327.aClass2_Sub17_Sub1_1.method2833();
															} else {
																local6303[local263 + 1] = Integer.valueOf(Static327.aClass2_Sub17_Sub1_1.method2881());
															}
														}
														local6303[0] = Integer.valueOf(Static327.aClass2_Sub17_Sub1_1.method2881());
														Static141.method2567();
														@Pc(6362) Class2_Sub18 local6362 = new Class2_Sub18();
														local6362.anObjectArray1 = local6303;
														Static156.method2728(local6362);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static45.aClass200_25 == Static346.aClass200_117) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
														if (local237 == 65535) {
															local237 = -1;
														}
														local75 = Static327.aClass2_Sub17_Sub1_1.method2859();
														local263 = Static327.aClass2_Sub17_Sub1_1.method2825();
														local394 = Static327.aClass2_Sub17_Sub1_1.method2859();
														Static297.method4695(local237, 256, true, local75, local263, local394);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static409.aClass200_149 == Static346.aClass200_117) {
														Static374.method5553(Static636.aClass55_14);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static231.aClass200_84 == Static346.aClass200_117) {
														local578 = Static327.aClass2_Sub17_Sub1_1.method2888() == 1;
														Static141.method2567();
														Static346.aClass200_117 = null;
														Static11.aBoolean26 = local578;
														return true;
													} else if (Static173.aClass200_71 == Static346.aClass200_117) {
														Static374.method5553(Static185.aClass55_5);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static186.aClass200_74) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
														if (local237 == 65535) {
															local237 = -1;
														}
														local75 = Static327.aClass2_Sub17_Sub1_1.method2842();
														local263 = local75 >> 2;
														local394 = local75 & 0x3;
														local398 = Static567.anIntArray676[local263];
														local1531 = Static327.aClass2_Sub17_Sub1_1.method2843();
														local1398 = local1531 >> 28 & 0x3;
														local615 = local1531 >> 14 & 0x3FFF;
														local1285 = local1531 & 0x3FFF;
														local615 -= Static406.anInt6899;
														local1285 -= Static338.anInt5885;
														Static51.method722(local1285, local394, local237, local398, local1398, local263, local615);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static435.aClass200_164) {
														if (Static592.anInt9857 != -1) {
															Static593.method8369(0, Static592.anInt9857);
														}
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static536.aClass200_200) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2859();
														local544 = (local75 & 0x1) == 1;
														Static360.method5382(local544, local237);
														local394 = Static327.aClass2_Sub17_Sub1_1.method2825();
														for (local398 = 0; local398 < local394; local398++) {
															local1531 = Static327.aClass2_Sub17_Sub1_1.method2888();
															if (local1531 == 255) {
																local1531 = Static327.aClass2_Sub17_Sub1_1.method2881();
															}
															local1398 = Static327.aClass2_Sub17_Sub1_1.method2825();
															Static194.method3320(local544, local1398 - 1, local398, local237, local1531);
														}
														Static434.anIntArray484[Static43.anInt1122++ & 0x1F] = local237;
														Static346.aClass200_117 = null;
														return true;
													} else if (Static310.aClass200_121 == Static346.aClass200_117) {
														Static568.anInt9305 = Static327.aClass2_Sub17_Sub1_1.method2859();
														for (local237 = 0; local237 < Static568.anInt9305; local237++) {
															Static84.aStringArray8[local237] = Static327.aClass2_Sub17_Sub1_1.method2833();
															Static307.aStringArray33[local237] = Static327.aClass2_Sub17_Sub1_1.method2833();
															if (Static307.aStringArray33[local237].equals("")) {
																Static307.aStringArray33[local237] = Static84.aStringArray8[local237];
															}
															Static188.aStringArray22[local237] = Static327.aClass2_Sub17_Sub1_1.method2833();
															Static204.aStringArray26[local237] = Static327.aClass2_Sub17_Sub1_1.method2833();
															if (Static204.aStringArray26[local237].equals("")) {
																Static204.aStringArray26[local237] = Static188.aStringArray22[local237];
															}
															Static66.aBooleanArray1[local237] = false;
														}
														Static76.anInt1945 = Static148.anInt3063;
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static233.aClass200_88) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2887();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2830();
														local263 = Static327.aClass2_Sub17_Sub1_1.method2863();
														Static141.method2567();
														Static361.method5387(local263, local237, 5, local75);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static244.aClass200_94) {
														Static137.method2509(Static245.anInt4755, Static327.aClass2_Sub17_Sub1_1);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static480.aClass200_181 == Static346.aClass200_117) {
														local578 = Static327.aClass2_Sub17_Sub1_1.method2859() == 1;
														local490 = Static327.aClass2_Sub17_Sub1_1.method2833();
														local586 = local490;
														if (local578) {
															local586 = Static327.aClass2_Sub17_Sub1_1.method2833();
														}
														local394 = Static327.aClass2_Sub17_Sub1_1.method2859();
														local398 = Static327.aClass2_Sub17_Sub1_1.method2825();
														local1243 = false;
														if (local394 <= 1 && Static209.method3513(local586)) {
															local1243 = true;
														}
														if (!local1243 && Static365.anInt6307 == 0) {
															local883 = Static327.aClass344_1.method7949(local398).method6603(Static327.aClass2_Sub17_Sub1_1);
															if (local394 == 2) {
																Static144.method2592(local490, 25, local398, "<img=1>" + local586, "<img=1>" + local490, local883, (String) null, 0);
															} else if (local394 == 1) {
																Static144.method2592(local490, 25, local398, "<img=0>" + local586, "<img=0>" + local490, local883, (String) null, 0);
															} else {
																Static144.method2592(local490, 25, local398, local586, local490, local883, (String) null, 0);
															}
														}
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static302.aClass200_116) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2854();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2830();
														local263 = Static327.aClass2_Sub17_Sub1_1.method2854();
														local394 = Static327.aClass2_Sub17_Sub1_1.method2825();
														Static141.method2567();
														Static269.method4435(local263, local237, local75, local394);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static328.aClass200_126) {
														local237 = Static327.aClass2_Sub17_Sub1_1.method2825();
														local75 = Static327.aClass2_Sub17_Sub1_1.method2842();
														Static382.aClass282_1.method6475(local237, local75);
														Static346.aClass200_117 = null;
														return true;
													} else if (Static346.aClass200_117 == Static18.aClass200_17) {
														Static448.method6402(Static633.aBoolean744);
														Static346.aClass200_117 = null;
														return false;
													} else if (Static346.aClass200_117 == Static29.aClass200_22) {
														Static374.method5553(Static214.aClass55_8);
														Static346.aClass200_117 = null;
														return true;
													} else {
														Static25.method7457((Throwable) null, "T1 - " + (Static346.aClass200_117 == null ? -1 : Static346.aClass200_117.method4622()) + "," + (Static606.aClass200_222 == null ? -1 : Static606.aClass200_222.method4622()) + "," + (Static533.aClass200_198 == null ? -1 : Static533.aClass200_198.method4622()) + " - " + Static245.anInt4755);
														Static448.method6402(false);
														return true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
