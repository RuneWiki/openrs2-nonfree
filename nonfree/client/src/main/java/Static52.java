import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!ic;")
	public static Class113 aClass113_20;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!cw;")
	public static Class1_Sub10 aClass1_Sub10_1;

	@OriginalMember(owner = "client!client", name = "U", descriptor = "[F")
	public static final float[] aFloatArray3 = new float[4];

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt942 = -2;

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method798(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static31.anInt624;
		@Pc(3) int[] local3 = Static363.anIntArray373;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static411.anInt6695; local5++) {
			@Pc(15) Class20_Sub3_Sub3 local15;
			if (local5 < local1) {
				local15 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local3[local5]];
			} else {
				local15 = Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local5 - local1]];
			}
			if (local15.aByte89 == arg0 && local15.anInt6020 >= 0) {
				@Pc(35) int local35 = local15.method4678();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6613 & 0x7F) != 0 || (local15.anInt6616 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6613 & 0x7F) != 64 || (local15.anInt6616 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6613 >> 7;
					local76 = local15.anInt6616 >> 7;
					if (local15.anInt6020 > Static328.anIntArrayArray136[local71][local76]) {
						Static328.anIntArrayArray136[local71][local76] = local15.anInt6020;
						Static378.anIntArrayArray155[local71][local76] = 1;
					} else if (local15.anInt6020 == Static328.anIntArrayArray136[local71][local76]) {
						local112 = Static378.anIntArrayArray155[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6613 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6616 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6613 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6616 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6020 > Static328.anIntArrayArray136[local154][local157]) {
								Static328.anIntArrayArray136[local154][local157] = local15.anInt6020;
								Static378.anIntArrayArray155[local154][local157] = 1;
							} else if (local15.anInt6020 == Static328.anIntArrayArray136[local154][local157]) {
								local112 = Static378.anIntArrayArray155[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method799(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static31.anInt624;
		@Pc(3) int[] local3 = Static363.anIntArray373;
		@Pc(11) int local11 = Static171.aBoolean219 ? local1 : local1 + Static411.anInt6695;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class20_Sub3_Sub3 local23;
			if (local13 < local1) {
				local23 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local13 - local1]];
			}
			if (local23.aByte89 == arg0) {
				local23.anInt6025 = 0;
				if (local23.anInt6020 < 0) {
					local23.aBoolean503 = false;
				} else {
					@Pc(50) int local50 = local23.method4678();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6613 & 0x7F) != 0 || (local23.anInt6616 & 0x7F) != 0) {
							local23.aBoolean503 = false;
							continue;
						}
					} else if ((local23.anInt6613 & 0x7F) != 64 || (local23.anInt6616 & 0x7F) != 64) {
						local23.aBoolean503 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6613 >> 7;
						local97 = local23.anInt6616 >> 7;
						if (local23.anInt6020 != Static328.anIntArrayArray136[local92][local97]) {
							local23.aBoolean503 = true;
							continue;
						}
						if (Static378.anIntArrayArray155[local92][local97] > 1) {
							local122 = Static378.anIntArrayArray155[local92][local97]--;
							local23.aBoolean503 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6613 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6616 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6613 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6616 + local92 >> 7;
						if (!Static105.method1483(local23.anInt6020, local97, local151, local165, local158)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6020 == Static328.anIntArrayArray136[local176][local179]) {
										local122 = Static378.anIntArrayArray155[local176][local179]--;
									}
								}
							}
							local23.aBoolean503 = true;
							continue;
						}
					}
					if (local23 instanceof Class20_Sub3_Sub3_Sub1 && local23.aClass1_Sub38_3 != null && Static368.anInt6250 >= local23.aClass1_Sub38_3.anInt6275 && Static368.anInt6250 < local23.aClass1_Sub38_3.anInt6266) {
						((Class20_Sub3_Sub3_Sub1) local23).aBoolean393 = false;
					}
					local23.aBoolean503 = false;
					local23.anInt6615 = Static183.method4175(local23.anInt6616, local23.anInt6613, local23.aByte89);
					Static222.method2947(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method800() {
		@Pc(1) int local1 = Static31.anInt624;
		@Pc(3) int[] local3 = Static363.anIntArray373;
		@Pc(20) boolean local20 = Static336.aClass106_Sub1_1.anInt5678 == 1 && local1 > 200 || Static336.aClass106_Sub1_1.anInt5678 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class20_Sub3_Sub3_Sub1 local29 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local3[local22]];
			if (local29.method3879()) {
				local29.method5096();
				if (local29.aShort85 >= 0 && local29.aShort88 >= 0 && local29.aShort87 < Static425.anInt6922 && local29.aShort86 < Static251.anInt4072) {
					local29.aBoolean393 = local29.aBoolean502 ? local20 : false;
					if (local29 == Static239.aClass20_Sub3_Sub3_Sub1_1) {
						local29.anInt6020 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean503) {
							local75++;
						}
						if (local29.anInt6058 > Static368.anInt6250) {
							local75 += 2;
						}
						local75 += 5 - local29.method4678() << 2;
						if (local29.aBoolean395) {
							local75 += 512;
						} else {
							if (Static259.anInt4172 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6020 = local75 + 1;
					}
				} else {
					local29.anInt6020 = -1;
				}
			} else {
				local29.anInt6020 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static411.anInt6695; local116++) {
			@Pc(123) Class20_Sub3_Sub3_Sub2 local123 = Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local116]];
			if (local123.method4693() && local123.aClass246_1.method5246(Static364.aClass259_1)) {
				local123.method5096();
				if (local123.aShort85 >= 0 && local123.aShort88 >= 0 && local123.aShort87 < Static425.anInt6922 && local123.aShort86 < Static251.anInt4072) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean503) {
						local160++;
					}
					if (local123.anInt6058 > Static368.anInt6250) {
						local160 += 2;
					}
					local160 += 5 - local123.method4678() << 2;
					if (Static259.anInt4172 == 0) {
						if (local123.aClass246_1.aBoolean559) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static259.anInt4172 == 1) {
						if (local123.aClass246_1.aBoolean559) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass246_1.aBoolean561) {
						local160 += 1024;
					} else if (!local123.aClass246_1.aBoolean562) {
						local160 += 256;
					}
					local123.anInt6020 = local160 + 1;
				} else {
					local123.anInt6020 = -1;
				}
			} else {
				local123.anInt6020 = -1;
			}
		}
		for (local75 = 0; local75 < Static162.aClass209Array1.length; local75++) {
			@Pc(226) Class209 local226 = Static162.aClass209Array1[local75];
			if (local226 != null) {
				if (local226.anInt5510 == 1) {
					@Pc(237) Class20_Sub3_Sub3_Sub2 local237 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local226.anInt5517];
					if (local237 != null && local237.anInt6020 >= 0) {
						local237.anInt6020 += 2048;
					}
				} else if (local226.anInt5510 == 10) {
					@Pc(258) Class20_Sub3_Sub3_Sub1 local258 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local226.anInt5517];
					if (local258 != null && local258 != Static239.aClass20_Sub3_Sub3_Sub1_1 && local258.anInt6020 >= 0) {
						local258.anInt6020 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method801() {
		@Pc(1) int local1 = Static31.anInt624;
		@Pc(3) int[] local3 = Static363.anIntArray373;
		@Pc(11) int local11 = Static171.aBoolean219 ? local1 : local1 + Static411.anInt6695;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class20_Sub3_Sub3 local23;
			if (local13 < local1) {
				local23 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local13 - local1]];
			}
			if (local23.anInt6020 >= 0) {
				@Pc(39) int local39 = local23.method4678();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6613 & 0x7F) == 0 && (local23.anInt6616 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6613 & 0x7F) == 64 && (local23.anInt6616 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class20_Sub3_Sub3_Sub1 && local23.aClass1_Sub38_3 != null && Static368.anInt6250 >= local23.aClass1_Sub38_3.anInt6275 && Static368.anInt6250 < local23.aClass1_Sub38_3.anInt6266) {
					((Class20_Sub3_Sub3_Sub1) local23).aBoolean393 = false;
				}
				local23.anInt6615 = Static183.method4175(local23.anInt6616, local23.anInt6613, local23.aByte89);
				Static222.method2947(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method803() {
		for (@Pc(7) int local7 = 0; local7 < Static411.anInt6695; local7++) {
			@Pc(13) int local13 = Static220.anIntArray193[local7];
			@Pc(17) Class20_Sub3_Sub3_Sub2 local17 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local13];
			if (local17 != null) {
				Static40.method3800(local17, local17.aClass246_1.anInt6830);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!vg;)Lclient!fs;")
	public static Class1_Sub15 method804(@OriginalArg(0) Class250 arg0) {
		@Pc(13) Class1_Sub15 local13 = (Class1_Sub15) Static291.aClass257_18.method5503(((long) arg0.anInt6994 << 32) + (long) arg0.anInt7038);
		return local13 == null ? arg0.aClass1_Sub15_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method805() {
		for (@Pc(1) int local1 = 0; local1 < Static425.anInt6922; local1++) {
			@Pc(6) int[] local6 = Static328.anIntArrayArray136[local1];
			for (@Pc(8) int local8 = 0; local8 < Static251.anInt4072; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!vg;)Z")
	public static boolean method809(@OriginalArg(0) Class250 arg0) {
		if (Static419.aBoolean556) {
			if (method804(arg0).anInt2172 != 0) {
				return false;
			}
			if (arg0.anInt7009 == 0) {
				return false;
			}
		}
		return arg0.aBoolean576;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method810() {
		Static101.anInt6648 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static411.anInt6695; local3++) {
			@Pc(10) Class20_Sub3_Sub3_Sub2 local10 = Static98.aClass20_Sub3_Sub3_Sub2Array1[Static220.anIntArray193[local3]];
			if (local10.aBoolean503 && local10.method4683() != -1) {
				@Pc(28) int local28 = (local10.method4678() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6613 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6616 - local28 >> 7;
				@Pc(49) Class20_Sub3_Sub3 local49 = Static399.method5014(local42, local35, local10.aByte89);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6045;
					if (local49 instanceof Class20_Sub3_Sub3_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt6025 == 0 && local49.method4683() != -1) {
						Static350.anIntArray344[Static101.anInt6648] = local54;
						Static28.anIntArray31[Static101.anInt6648] = local54;
						Static101.anInt6648++;
						local49.anInt6025++;
					}
					Static350.anIntArray344[Static101.anInt6648] = local54;
					Static28.anIntArray31[Static101.anInt6648] = local10.anInt6045 + 2048;
					Static101.anInt6648++;
					local49.anInt6025++;
				}
			}
		}
		Static351.method4508(Static28.anIntArray31, Static101.anInt6648 - 1, 0, Static350.anIntArray344);
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(B)[Lclient!ri;")
	public static Class214[] method811() {
		return new Class214[] { Static359.aClass214_214, Static79.aClass214_58, Static342.aClass214_203, Static172.aClass214_110, Static416.aClass214_242, Static289.aClass214_175, Static188.aClass214_118, Static145.aClass214_93, Static259.aClass214_158, Static37.aClass214_30, Static178.aClass214_112, Static415.aClass214_62, Static238.aClass214_148, Static217.aClass214_132, Static159.aClass214_100, Static140.aClass214_88, Static44.aClass214_32, Static77.aClass214_57, Static380.aClass214_230, Static74.aClass214_54, Static71.aClass214_48, Static164.aClass214_105, Static388.aClass214_38, Static159.aClass214_99, Static354.aClass214_212, Static405.aClass214_237, Static148.aClass214_94, Static373.aClass214_239, Static286.aClass214_170, Static49.aClass214_33, Static264.aClass214_161, Static443.aClass214_225, Static11.aClass214_11, Static304.aClass214_184, Static23.aClass214_18, Static27.aClass214_42, Static380.aClass214_231, Static2.aClass214_122, Static40.aClass214_176, Static322.aClass214_253, Static129.aClass214_86, Static249.aClass214_156, Static271.aClass214_163, Static244.aClass214_151, Static101.aClass214_240, Static370.aClass214_226, Static252.aClass214_130, Static203.aClass214_128, Static148.aClass214_95, Static385.aClass214_232, Static322.aClass214_252, Static261.aClass214_159, Static152.aClass214_96, Static27.aClass214_43, Static172.aClass214_109, Static146.aClass214_221, Static326.aClass214_192, Static324.aClass214_189, Static126.aClass214_84, Static164.aClass214_104, Static345.aClass214_207, Static304.aClass214_183, Static2.aClass214_121, Static362.aClass214_218, Static349.aClass214_208, Static421.aClass214_244, Static33.aClass214_27, Static116.aClass214_195, Static63.aClass214_47, Static51.aClass214_36, Static350.aClass214_209, Static377.aClass214_227, Static237.aClass214_147, Static159.aClass214_101, Static298.aClass214_180, Static344.aClass214_204, Static269.aClass214_162, Static72.aClass214_49, Static334.aClass214_198, Static351.aClass214_210, Static221.aClass214_134, Static27.aClass214_41, Static58.aClass214_44, Static171.aClass214_108, Static273.aClass214_164, Static328.aClass214_194, Static291.aClass214_177, Static61.aClass214_46, Static266.aClass214_126, Static359.aClass214_215, Static138.aClass214_133, Static249.aClass214_157, Static262.aClass214_160, Static217.aClass214_131, Static326.aClass214_193, Static104.aClass214_249, Static235.aClass214_144, Static301.aClass214_181, Static283.aClass214_167, Static195.aClass214_124, Static379.aClass214_228, Static90.aClass214_63, Static60.aClass214_45, Static453.aClass214_251, Static355.aClass214_213, Static183.aClass214_191, Static411.aClass214_241, Static161.aClass214_73, Static127.aClass214_85, Static324.aClass214_190 };
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!vg;IIIIIIIII)V")
	public static void method812(@OriginalArg(0) Class250[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class250 local6 = arg0[local1];
			if (local6 != null && local6.anInt7002 == arg1) {
				@Pc(17) int local17 = local6.anInt6964 + arg6;
				@Pc(22) int local22 = local6.anInt7013 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt7009 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt7041;
					@Pc(45) int local45 = local22 + local6.anInt6997;
					if (local6.anInt7009 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt7009 == 0 || local6.aBoolean577 || method804(local6).anInt2172 != 0 || local6 == Static6.aClass250_1 || local6.anInt6983 == Static282.anInt4477) {
					if (!method809(local6)) {
						if (local6 == Static68.aClass250_2) {
							Static118.aBoolean147 = true;
							Static79.anInt1463 = local17;
							Static442.anInt7350 = local22;
						}
						if (local6.aBoolean574 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean572 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class1_Sub31 local148 = (Class1_Sub31) Static6.aClass254_1.method5437(); local148 != null; local148 = (Class1_Sub31) Static6.aClass254_1.method5433()) {
									if (local148.aBoolean408) {
										local148.method5617();
										local148.aClass250_8.aBoolean587 = false;
									}
								}
								if (Static221.anInt3584 == 0) {
									Static68.aClass250_2 = null;
									Static6.aClass250_1 = null;
								}
								Static316.anInt5247 = 0;
								Static310.aBoolean416 = false;
								Static24.aBoolean38 = false;
								if (!Static263.aBoolean329) {
									Static35.method607();
								}
							}
							@Pc(204) boolean local204;
							if (Static210.aClass26_1.method576() >= local28 && Static210.aClass26_1.method574() >= local30 && Static210.aClass26_1.method576() < local32 && Static210.aClass26_1.method574() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static360.aBoolean498 && local204) {
								if (local6.anInt6970 >= 0) {
									Static258.anInt4103 = local6.anInt6970;
								} else if (local6.aBoolean572) {
									Static258.anInt4103 = -1;
								}
							}
							if (!Static263.aBoolean329 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static113.method1579(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(248) boolean local248 = false;
							if (Static210.aClass26_1.method573() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class1_Sub29 local263 = (Class1_Sub29) Static416.aClass254_44.method5437();
							if (local263 != null && local263.method3483() == 0 && local263.method3481() >= local28 && local263.method3484() >= local30 && local263.method3481() < local32 && local263.method3484() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray89 != null) {
								for (local296 = 0; local296 < local6.aByteArray89.length; local296++) {
									if (Static321.aClass31_4.method3798(local6.aByteArray89[local296])) {
										if (local6.anIntArray469 == null || Static368.anInt6250 >= local6.anIntArray469[local296]) {
											@Pc(328) byte local328 = local6.aByteArray90[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static321.aClass31_4.method3798(86) && !Static321.aClass31_4.method3798(82) && !Static321.aClass31_4.method3798(81)) && ((local328 & 0x2) == 0 || Static321.aClass31_4.method3798(86)) && ((local328 & 0x1) == 0 || Static321.aClass31_4.method3798(82)) && ((local328 & 0x4) == 0 || Static321.aClass31_4.method3798(81))) {
												if (local296 < 10) {
													Static362.method4702("", local296 + 1, local6.anInt6994, -1);
												} else if (local296 == 10) {
													Static172.method2334();
													@Pc(399) Class1_Sub15 local399 = method804(local6);
													Static72.method1140(local399.method1723(), local399.anInt2174, local6);
													Static149.aString68 = Static105.method1480(local6);
													if (Static149.aString68 == null) {
														Static149.aString68 = "Null";
													}
													Static419.aString58 = local6.aString63 + "<col=ffffff>";
												}
												local430 = local6.anIntArray473[local296];
												if (local6.anIntArray469 == null) {
													local6.anIntArray469 = new int[local6.aByteArray89.length];
												}
												if (local430 == 0) {
													local6.anIntArray469[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray469[local296] = Static368.anInt6250 + local430;
												}
											}
										}
									} else if (local6.anIntArray469 != null) {
										local6.anIntArray469[local296] = 0;
									}
								}
							}
							if (local258) {
								Static438.method5502(local6, local263.method3484() - local22, local263.method3481() - local17);
							}
							if (Static68.aClass250_2 != null && Static68.aClass250_2 != local6 && local204 && method804(local6).method1726()) {
								Static70.aClass250_3 = local6;
							}
							if (local6 == Static6.aClass250_1) {
								Static245.aBoolean313 = true;
								Static15.anInt285 = local17;
								Static118.anInt2023 = local22;
							}
							if (local6.aBoolean577 || local6.anInt6983 != 0) {
								@Pc(515) Class1_Sub31 local515;
								if (local204 && Static230.anInt6340 != 0 && local6.anObjectArray25 != null) {
									local515 = new Class1_Sub31();
									local515.aBoolean408 = true;
									local515.aClass250_8 = local6;
									local515.anInt5068 = Static230.anInt6340;
									local515.anObjectArray5 = local6.anObjectArray25;
									Static6.aClass254_1.method5430(local515);
								}
								if (Static68.aClass250_2 != null || Static263.aBoolean329 || local6.anInt6983 != Static439.anInt7306 && Static316.anInt5247 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt6983 != 0) {
									if (local6.anInt6983 == Static363.anInt6140 || local6.anInt6983 == Static406.anInt6569) {
										Static298.aClass250_7 = local6;
										if (Static25.aClass256_1 != null) {
											Static25.aClass256_1.method5477(Static213.aClass128_22, local6.anInt6997);
										}
										if (local6.anInt6983 == Static363.anInt6140) {
											if (!Static263.aBoolean329 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static362.method4704(arg9, Static213.aClass128_22, arg8);
												for (@Pc(598) Class13_Sub6 local598 = (Class13_Sub6) Static397.aClass227_6.method4827(); local598 != null; local598 = (Class13_Sub6) Static397.aClass227_6.method4834()) {
													if (arg8 >= local598.anInt5956 && arg8 < local598.anInt5964 && arg9 >= local598.anInt5966 && arg9 < local598.anInt5962) {
														Static35.method607();
														Static319.method4118(local598.aClass20_Sub3_Sub3_1);
													}
												}
											}
											Static177.method2367(local17, local22, local6);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt6983 == Static282.anInt4477) {
										if (local6.method5342(Static213.aClass128_22) == null || Static345.anInt5644 != 0 && Static345.anInt5644 != 3 || Static263.aBoolean329 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray470[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray466[local670]) {
											continue;
										}
										local296 -= local6.anInt7041 / 2;
										local670 -= local6.anInt6997 / 2;
										if (Static100.anInt1781 == 4) {
											local709 = (int) Static95.aFloat27 & 0x3FFF;
										} else {
											local709 = (int) Static95.aFloat27 + Static171.anInt2824 & 0x3FFF;
										}
										@Pc(721) int local721 = Class1_Sub1_Sub25.anIntArray249[local709];
										@Pc(725) int local725 = Class1_Sub1_Sub25.anIntArray248[local709];
										if (Static100.anInt1781 != 4) {
											local721 = local721 * (Static305.anInt5082 + 256) >> 8;
											local725 = local725 * (Static305.anInt5082 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static100.anInt1781 == 4) {
											local775 = (Static446.anInt7388 >> 7) + (local754 >> 2);
											local783 = (Static317.anInt5271 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static239.aClass20_Sub3_Sub3_Sub1_1.method4678() - 1) * 64;
											local775 = (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 - local792 >> 7) + (local754 >> 2);
											local783 = (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 - local792 >> 7) - (local764 >> 2);
										}
										if (Static360.aBoolean498 && (Static20.anInt436 & 0x40) != 0) {
											@Pc(825) Class250 local825 = Static359.method4655(Static315.anInt5215, Static234.anInt3782);
											if (local825 == null) {
												Static172.method2334();
											} else {
												Static87.method1275(false, local775, 1L, " ->", Static161.anInt1936, true, Static149.aString68, local6.anInt7030, local783, 45);
											}
											continue;
										}
										if (Static357.aClass6_4 == Static43.aClass6_3) {
											Static87.method1275(false, local775, 1L, "", -1, true, Static393.aClass151_200.method3122(Static188.anInt3028), -1, local783, 44);
										}
										Static87.method1275(false, local775, 1L, "", Static281.anInt4403, true, Static249.aString40, -1, local783, 5);
										continue;
									}
									if (local6.anInt6983 == Static439.anInt7306) {
										Static289.aClass250_6 = local6;
										if (local204) {
											Static310.aBoolean416 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method3481() - local17 - local6.anInt7041 / 2) * 2.0D / (double) Static114.aFloat93);
											local670 = (int) -((double) (local263.method3484() - local22 - local6.anInt6997 / 2) * 2.0D / (double) Static114.aFloat93);
											local430 = Static257.anInt6932 + local296 + Static114.anInt6798;
											local709 = Static2.anInt3076 + local670 + Static114.anInt6800;
											@Pc(939) Class1_Sub3_Sub16 local939 = Static390.method4941();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method5180(local430, local944, local709);
											if (local944 != null) {
												if (Static321.aClass31_4.method3798(82) && Static411.anInt6701 > 0) {
													Static414.method5164(local944[0], local944[1], local944[2]);
													continue;
												}
												Static24.aBoolean38 = true;
												Static189.anInt3034 = local944[0];
												Static299.anInt5003 = local944[1];
												Static97.anInt1705 = local944[2];
											}
											Static316.anInt5247 = 1;
											Static345.aBoolean456 = false;
											Static380.anInt6320 = Static210.aClass26_1.method576();
											Static16.anInt3240 = Static210.aClass26_1.method574();
											continue;
										}
										if (local248 && Static316.anInt5247 > 0) {
											if (Static316.anInt5247 == 1 && (Static380.anInt6320 != Static210.aClass26_1.method576() || Static16.anInt3240 != Static210.aClass26_1.method574())) {
												Static227.anInt3685 = Static257.anInt6932;
												Static161.anInt1937 = Static2.anInt3076;
												Static316.anInt5247 = 2;
											}
											if (Static316.anInt5247 == 2) {
												Static345.aBoolean456 = true;
												Static378.method4843(Static227.anInt3685 + (int) ((double) (Static380.anInt6320 - Static210.aClass26_1.method576()) * 2.0D / (double) Static114.aFloat94));
												Static288.method3757(Static161.anInt1937 - (int) ((double) (Static16.anInt3240 - Static210.aClass26_1.method574()) * 2.0D / (double) Static114.aFloat94));
											}
											continue;
										}
										if (Static316.anInt5247 > 0 && !Static345.aBoolean456) {
											if ((Static354.anInt5869 == 1 || Static286.method3731()) && Static19.anInt396 > 2) {
												Static23.method431(Static380.anInt6320, Static16.anInt3240);
											} else if (Static18.method279()) {
												Static23.method431(Static380.anInt6320, Static16.anInt3240);
											}
										}
										Static316.anInt5247 = 0;
										continue;
									}
									if (local6.anInt6983 == Static26.anInt546) {
										if (local248) {
											Static285.method3725(local6.anInt7041, Static210.aClass26_1.method576() - local17, Static210.aClass26_1.method574() - local22, local6.anInt6997);
										}
										continue;
									}
									if (local6.anInt6983 == Static29.anInt576) {
										Static244.method3191(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean583 && local258) {
									local6.aBoolean583 = true;
									if (local6.anObjectArray16 != null) {
										local515 = new Class1_Sub31();
										local515.aBoolean408 = true;
										local515.aClass250_8 = local6;
										local515.anInt5071 = local263.method3481() - local17;
										local515.anInt5068 = local263.method3484() - local22;
										local515.anObjectArray5 = local6.anObjectArray16;
										Static6.aClass254_1.method5430(local515);
									}
								}
								if (local6.aBoolean583 && local248 && local6.anObjectArray21 != null) {
									local515 = new Class1_Sub31();
									local515.aBoolean408 = true;
									local515.aClass250_8 = local6;
									local515.anInt5071 = Static210.aClass26_1.method576() - local17;
									local515.anInt5068 = Static210.aClass26_1.method574() - local22;
									local515.anObjectArray5 = local6.anObjectArray21;
									Static6.aClass254_1.method5430(local515);
								}
								if (local6.aBoolean583 && !local248) {
									local6.aBoolean583 = false;
									if (local6.anObjectArray28 != null) {
										local515 = new Class1_Sub31();
										local515.aBoolean408 = true;
										local515.aClass250_8 = local6;
										local515.anInt5071 = Static210.aClass26_1.method576() - local17;
										local515.anInt5068 = Static210.aClass26_1.method574() - local22;
										local515.anObjectArray5 = local6.anObjectArray28;
										Static275.aClass254_27.method5430(local515);
									}
								}
								if (local248 && local6.anObjectArray22 != null) {
									local515 = new Class1_Sub31();
									local515.aBoolean408 = true;
									local515.aClass250_8 = local6;
									local515.anInt5071 = Static210.aClass26_1.method576() - local17;
									local515.anInt5068 = Static210.aClass26_1.method574() - local22;
									local515.anObjectArray5 = local6.anObjectArray22;
									Static6.aClass254_1.method5430(local515);
								}
								if (!local6.aBoolean587 && local204) {
									local6.aBoolean587 = true;
									if (local6.anObjectArray9 != null) {
										local515 = new Class1_Sub31();
										local515.aBoolean408 = true;
										local515.aClass250_8 = local6;
										local515.anInt5071 = Static210.aClass26_1.method576() - local17;
										local515.anInt5068 = Static210.aClass26_1.method574() - local22;
										local515.anObjectArray5 = local6.anObjectArray9;
										Static6.aClass254_1.method5430(local515);
									}
								}
								if (local6.aBoolean587 && local204 && local6.anObjectArray23 != null) {
									local515 = new Class1_Sub31();
									local515.aBoolean408 = true;
									local515.aClass250_8 = local6;
									local515.anInt5071 = Static210.aClass26_1.method576() - local17;
									local515.anInt5068 = Static210.aClass26_1.method574() - local22;
									local515.anObjectArray5 = local6.anObjectArray23;
									Static6.aClass254_1.method5430(local515);
								}
								if (local6.aBoolean587 && !local204) {
									local6.aBoolean587 = false;
									if (local6.anObjectArray32 != null) {
										local515 = new Class1_Sub31();
										local515.aBoolean408 = true;
										local515.aClass250_8 = local6;
										local515.anInt5071 = Static210.aClass26_1.method576() - local17;
										local515.anInt5068 = Static210.aClass26_1.method574() - local22;
										local515.anObjectArray5 = local6.anObjectArray32;
										Static275.aClass254_27.method5430(local515);
									}
								}
								if (local6.anObjectArray31 != null) {
									local515 = new Class1_Sub31();
									local515.aClass250_8 = local6;
									local515.anObjectArray5 = local6.anObjectArray31;
									Static40.aClass254_37.method5430(local515);
								}
								@Pc(1483) Class1_Sub31 local1483;
								if (local6.anObjectArray18 != null && Static387.anInt6408 > local6.anInt6985) {
									if (local6.anIntArray471 == null || Static387.anInt6408 - local6.anInt6985 > 32) {
										local515 = new Class1_Sub31();
										local515.aClass250_8 = local6;
										local515.anObjectArray5 = local6.anObjectArray18;
										Static6.aClass254_1.method5430(local515);
									} else {
										label678: for (local296 = local6.anInt6985; local296 < Static387.anInt6408; local296++) {
											local670 = Static398.anIntArray400[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray471.length; local430++) {
												if (local6.anIntArray471[local430] == local670) {
													local1483 = new Class1_Sub31();
													local1483.aClass250_8 = local6;
													local1483.anObjectArray5 = local6.anObjectArray18;
													Static6.aClass254_1.method5430(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt6985 = Static387.anInt6408;
								}
								if (local6.anObjectArray6 != null && Static81.anInt1506 > local6.anInt7033) {
									if (local6.anIntArray468 == null || Static81.anInt1506 - local6.anInt7033 > 32) {
										local515 = new Class1_Sub31();
										local515.aClass250_8 = local6;
										local515.anObjectArray5 = local6.anObjectArray6;
										Static6.aClass254_1.method5430(local515);
									} else {
										label654: for (local296 = local6.anInt7033; local296 < Static81.anInt1506; local296++) {
											local670 = Static128.anIntArray106[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray468.length; local430++) {
												if (local6.anIntArray468[local430] == local670) {
													local1483 = new Class1_Sub31();
													local1483.aClass250_8 = local6;
													local1483.anObjectArray5 = local6.anObjectArray6;
													Static6.aClass254_1.method5430(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt7033 = Static81.anInt1506;
								}
								if (local6.anObjectArray24 != null && Static53.anInt975 > local6.anInt7016) {
									if (local6.anIntArray472 == null || Static53.anInt975 - local6.anInt7016 > 32) {
										local515 = new Class1_Sub31();
										local515.aClass250_8 = local6;
										local515.anObjectArray5 = local6.anObjectArray24;
										Static6.aClass254_1.method5430(local515);
									} else {
										label630: for (local296 = local6.anInt7016; local296 < Static53.anInt975; local296++) {
											local670 = Static103.anIntArray84[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray472.length; local430++) {
												if (local6.anIntArray472[local430] == local670) {
													local1483 = new Class1_Sub31();
													local1483.aClass250_8 = local6;
													local1483.anObjectArray5 = local6.anObjectArray24;
													Static6.aClass254_1.method5430(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt7016 = Static53.anInt975;
								}
								if (local6.anObjectArray20 != null && Static445.anInt7376 > local6.anInt7017) {
									if (local6.anIntArray464 == null || Static445.anInt7376 - local6.anInt7017 > 32) {
										local515 = new Class1_Sub31();
										local515.aClass250_8 = local6;
										local515.anObjectArray5 = local6.anObjectArray20;
										Static6.aClass254_1.method5430(local515);
									} else {
										label606: for (local296 = local6.anInt7017; local296 < Static445.anInt7376; local296++) {
											local670 = Static125.anIntArray102[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray464.length; local430++) {
												if (local6.anIntArray464[local430] == local670) {
													local1483 = new Class1_Sub31();
													local1483.aClass250_8 = local6;
													local1483.anObjectArray5 = local6.anObjectArray20;
													Static6.aClass254_1.method5430(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt7017 = Static445.anInt7376;
								}
								if (local6.anObjectArray29 != null && Static137.anInt2321 > local6.anInt6968) {
									if (local6.anIntArray467 == null || Static137.anInt2321 - local6.anInt6968 > 32) {
										local515 = new Class1_Sub31();
										local515.aClass250_8 = local6;
										local515.anObjectArray5 = local6.anObjectArray29;
										Static6.aClass254_1.method5430(local515);
									} else {
										label582: for (local296 = local6.anInt6968; local296 < Static137.anInt2321; local296++) {
											local670 = Static385.anIntArray395[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray467.length; local430++) {
												if (local6.anIntArray467[local430] == local670) {
													local1483 = new Class1_Sub31();
													local1483.aClass250_8 = local6;
													local1483.anObjectArray5 = local6.anObjectArray29;
													Static6.aClass254_1.method5430(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt6968 = Static137.anInt2321;
								}
								if (Static167.anInt2743 > local6.anInt6971 && local6.anObjectArray19 != null) {
									local515 = new Class1_Sub31();
									local515.aClass250_8 = local6;
									local515.anObjectArray5 = local6.anObjectArray19;
									Static6.aClass254_1.method5430(local515);
								}
								if (Static136.anInt2311 > local6.anInt6971 && local6.anObjectArray30 != null) {
									local515 = new Class1_Sub31();
									local515.aClass250_8 = local6;
									local515.anObjectArray5 = local6.anObjectArray30;
									Static6.aClass254_1.method5430(local515);
								}
								if (Static422.anInt6844 > local6.anInt6971 && local6.anObjectArray33 != null) {
									local515 = new Class1_Sub31();
									local515.aClass250_8 = local6;
									local515.anObjectArray5 = local6.anObjectArray33;
									Static6.aClass254_1.method5430(local515);
								}
								if (Static367.anInt6218 > local6.anInt6971 && local6.anObjectArray34 != null) {
									local515 = new Class1_Sub31();
									local515.aClass250_8 = local6;
									local515.anObjectArray5 = local6.anObjectArray34;
									Static6.aClass254_1.method5430(local515);
								}
								if (Static376.anInt6288 > local6.anInt6971 && local6.anObjectArray26 != null) {
									local515 = new Class1_Sub31();
									local515.aClass250_8 = local6;
									local515.anObjectArray5 = local6.anObjectArray26;
									Static6.aClass254_1.method5430(local515);
								}
								local6.anInt6971 = Static443.anInt6230;
								if (local6.anObjectArray13 != null) {
									for (local296 = 0; local296 < Static36.anInt708; local296++) {
										@Pc(1951) Class1_Sub31 local1951 = new Class1_Sub31();
										local1951.aClass250_8 = local6;
										local1951.anInt5072 = Static266.aClass143Array3[local296].method2870();
										local1951.anInt5070 = Static266.aClass143Array3[local296].method2873();
										local1951.anObjectArray5 = local6.anObjectArray13;
										Static6.aClass254_1.method5430(local1951);
									}
								}
								if (Static269.aBoolean337 && local6.anObjectArray11 != null) {
									local515 = new Class1_Sub31();
									local515.aClass250_8 = local6;
									local515.anObjectArray5 = local6.anObjectArray11;
									Static6.aClass254_1.method5430(local515);
								}
							}
							if (local6.anInt7009 == 5 && local6.anInt6957 != -1) {
								local6.method5336(Static128.aClass66_1, Static331.aClass238_1).method5477(Static213.aClass128_22, local6.anInt6997);
							}
							Static15.method240(local6);
							if (local6.anInt7009 == 0) {
								method812(arg0, local6.anInt6994, local28, local30, local32, local34, local17 - local6.anInt7015, local22 - local6.anInt6966, arg8, arg9);
								if (local6.aClass250Array2 != null) {
									method812(local6.aClass250Array2, local6.anInt6994, local28, local30, local32, local34, local17 - local6.anInt7015, local22 - local6.anInt6966, arg8, arg9);
								}
								@Pc(2073) Class1_Sub26 local2073 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local6.anInt6994);
								if (local2073 != null) {
									if (Static357.aClass6_4 == Static455.aClass6_5 && local2073.anInt3846 == 0 && !Static263.aBoolean329 && local204 && !Static419.aBoolean556) {
										Static35.method607();
									}
									Static443.method4785(local17, local34, arg8, local32, local30, arg9, local28, local2073.anInt3847, local22);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static15.method240(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!vg;)Lclient!vg;")
	public static Class250 method814(@OriginalArg(0) Class250 arg0) {
		@Pc(4) int local4 = method804(arg0).method1729();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static96.method1379(arg0.anInt7002);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
