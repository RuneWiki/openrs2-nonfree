import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	public static int anInt1401;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	public static int anInt1407;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1351() {
		Static17.anInt512 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static464.anInt7995; local3++) {
			@Pc(14) Class4_Sub1_Sub1_Sub1 local14 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) Static291.anIntArray405[local3])).aClass4_Sub1_Sub1_Sub1_2;
			if (local14.aBoolean493 && local14.method5899() != -1) {
				@Pc(32) int local32 = (local14.method5892() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9542 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9540 - local32 >> 9;
				@Pc(53) Class4_Sub1_Sub1 local53 = Static379.method5622(local14.aByte108, local46, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt7126;
					if (local53 instanceof Class4_Sub1_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt7110 == 0 && local53.method5899() != -1) {
						Static411.anIntArray703[Static17.anInt512] = local58;
						Static221.anIntArray277[Static17.anInt512] = local58;
						Static17.anInt512++;
						local53.anInt7110++;
					}
					Static411.anIntArray703[Static17.anInt512] = local58;
					Static221.anIntArray277[Static17.anInt512] = local14.anInt7126 + 2048;
					Static17.anInt512++;
					local53.anInt7110++;
				}
			}
		}
		Static116.method2033(0, Static17.anInt512 - 1, Static221.anIntArray277, Static411.anIntArray703);
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1352(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static231.anInt4727;
		@Pc(3) int[] local3 = Static249.anIntArray372;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static464.anInt7995; local5++) {
			@Pc(15) Class4_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local3[local5]];
			} else {
				local15 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) Static291.anIntArray405[local5 - local1])).aClass4_Sub1_Sub1_Sub1_2;
			}
			if (local15.aByte108 == arg0 && local15.anInt7111 >= 0) {
				@Pc(39) int local39 = local15.method5892();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9542 & 0x1FF) != 0 || (local15.anInt9540 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9542 & 0x1FF) != 256 || (local15.anInt9540 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9542 >> 9;
					local80 = local15.anInt9540 >> 9;
					if (local15.anInt7111 > Static181.anIntArrayArray23[local75][local80]) {
						Static181.anIntArrayArray23[local75][local80] = local15.anInt7111;
						Static86.anIntArrayArray14[local75][local80] = 1;
					} else if (local15.anInt7111 == Static181.anIntArrayArray23[local75][local80]) {
						local116 = Static86.anIntArrayArray14[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9542 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9540 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9542 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9540 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt7111 > Static181.anIntArrayArray23[local158][local161]) {
								Static181.anIntArrayArray23[local158][local161] = local15.anInt7111;
								Static86.anIntArrayArray14[local158][local161] = 1;
							} else if (local15.anInt7111 == Static181.anIntArrayArray23[local158][local161]) {
								local116 = Static86.anIntArrayArray14[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1353() {
		@Pc(1) int local1 = Static231.anInt4727;
		@Pc(3) int[] local3 = Static249.anIntArray372;
		@Pc(11) int local11 = Static147.aBoolean698 ? local1 : local1 + Static464.anInt7995;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class4_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local3[local13]];
			} else {
				local23 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) Static291.anIntArray405[local13 - local1])).aClass4_Sub1_Sub1_Sub1_2;
			}
			if (local23.anInt7111 >= 0) {
				@Pc(43) int local43 = local23.method5892();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9542 & 0x1FF) == 0 && (local23.anInt9540 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9542 & 0x1FF) == 256 && (local23.anInt9540 & 0x1FF) == 256) {
					continue;
				}
				if (local23 instanceof Class4_Sub1_Sub1_Sub2 && local23.aClass6_Sub29_3 != null && Static312.anInt5688 >= local23.aClass6_Sub29_3.anInt5275 && Static312.anInt5688 < local23.aClass6_Sub29_3.anInt5268) {
					((Class4_Sub1_Sub1_Sub2) local23).aBoolean499 = false;
				}
				local23.anInt9541 = Static160.method2951(local23.anInt9540, local23.anInt9542, local23.aByte108);
				Static254.method7016(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!rr;)Lclient!ah;")
	public static Class6_Sub3 method1354(@OriginalArg(0) Class292 arg0) {
		@Pc(13) Class6_Sub3 local13 = (Class6_Sub3) Static121.aClass128_7.method3263(((long) arg0.anInt7890 << 32) + (long) arg0.anInt7964);
		return local13 == null ? arg0.aClass6_Sub3_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!rr;IIIIIIIII)V")
	public static void method1355(@OriginalArg(0) Class292[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class292 local6 = arg0[local1];
			if (local6 != null && local6.anInt7901 == arg1) {
				@Pc(17) int local17 = local6.anInt7883 + arg6;
				@Pc(22) int local22 = local6.anInt7923 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.lb == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt7963;
					@Pc(45) int local45 = local22 + local6.anInt7912;
					if (local6.lb == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.lb == 0 || local6.aBoolean567 || method1354(local6).anInt317 != 0 || local6 == Static473.aClass292_10 || local6.anInt7955 == Static471.anInt6501) {
					if (!method1363(local6)) {
						if (local6 == Static547.aClass292_14 && Static328.method5140(Static547.aClass292_14) != null) {
							Static90.aBoolean718 = true;
							Static304.anInt5592 = local17;
							Static29.anInt855 = local22;
						}
						if (local6.aBoolean566 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean556 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(152) Class6_Sub43 local152 = (Class6_Sub43) Static127.aClass361_21.method7838(); local152 != null; local152 = (Class6_Sub43) Static127.aClass361_21.method7845()) {
									if (local152.aBoolean585) {
										local152.method7804();
										local152.aClass292_12.aBoolean569 = false;
									}
								}
								if (Static315.anInt5383 == 0) {
									Static547.aClass292_14 = null;
									Static473.aClass292_10 = null;
								}
								Static114.anInt2194 = 0;
								Static335.aBoolean429 = false;
								Static395.aBoolean486 = false;
								if (!Static587.aBoolean734) {
									Static305.method1155();
								}
							}
							@Pc(208) boolean local208;
							if (Static164.aClass173_1.method6487() >= local28 && Static164.aClass173_1.method6489() >= local30 && Static164.aClass173_1.method6487() < local32 && Static164.aClass173_1.method6489() < local34) {
								local208 = true;
							} else {
								local208 = false;
							}
							if (!Static199.aBoolean458 && local208) {
								if (local6.anInt7909 >= 0) {
									Static245.anInt4901 = local6.anInt7909;
								} else if (local6.aBoolean556) {
									Static245.anInt4901 = -1;
								}
							}
							if (!Static587.aBoolean734 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static190.method3452(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(252) boolean local252 = false;
							if (Static164.aClass173_1.method6496() && local208) {
								local252 = true;
							}
							@Pc(262) boolean local262 = false;
							@Pc(267) Class6_Sub5 local267 = (Class6_Sub5) Static395.aClass361_52.method7838();
							if (local267 != null && local267.method1986() == 0 && local267.method1991() >= local28 && local267.method1982() >= local30 && local267.method1991() < local32 && local267.method1982() < local34) {
								local262 = true;
							}
							@Pc(303) int local303;
							@Pc(437) int local437;
							if (local6.aByteArray98 != null && !Static161.method2957()) {
								for (local303 = 0; local303 < local6.aByteArray98.length; local303++) {
									if (Static365.aClass155_1.method4042(local6.aByteArray98[local303])) {
										if (local6.anIntArray577 == null || Static312.anInt5688 >= local6.anIntArray577[local303]) {
											@Pc(335) byte local335 = local6.aByteArray99[local303];
											if (local335 == 0 || ((local335 & 0x8) == 0 || !Static365.aClass155_1.method4042(86) && !Static365.aClass155_1.method4042(82) && !Static365.aClass155_1.method4042(81)) && ((local335 & 0x2) == 0 || Static365.aClass155_1.method4042(86)) && ((local335 & 0x1) == 0 || Static365.aClass155_1.method4042(82)) && ((local335 & 0x4) == 0 || Static365.aClass155_1.method4042(81))) {
												if (local303 < 10) {
													Static182.method3323(-1, "", local303 + 1, local6.anInt7890);
												} else if (local303 == 10) {
													Static489.method6689();
													@Pc(406) Class6_Sub3 local406 = method1354(local6);
													Static398.method5831(local6, local406.method245(), local406.anInt316);
													Static104.aString16 = Static394.method5797(local6);
													if (Static104.aString16 == null) {
														Static104.aString16 = "Null";
													}
													Static22.aString33 = local6.aString79 + "<col=ffffff>";
												}
												local437 = local6.anIntArray571[local303];
												if (local6.anIntArray577 == null) {
													local6.anIntArray577 = new int[local6.aByteArray98.length];
												}
												if (local437 == 0) {
													local6.anIntArray577[local303] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray577[local303] = Static312.anInt5688 + local437;
												}
											}
										}
									} else if (local6.anIntArray577 != null) {
										local6.anIntArray577[local303] = 0;
									}
								}
							}
							if (local262) {
								Static138.method2737(local6, local267.method1982() - local22, local267.method1991() - local17);
							}
							if (Static547.aClass292_14 != null && Static547.aClass292_14 != local6 && local208 && method1354(local6).method246()) {
								Static408.aClass292_6 = local6;
							}
							if (local6 == Static473.aClass292_10) {
								Static577.aBoolean723 = true;
								Static428.anInt7474 = local17;
								Static529.anInt4675 = local22;
							}
							if (local6.aBoolean567 || local6.anInt7955 != 0) {
								@Pc(522) Class6_Sub43 local522;
								if (local208 && Static330.anInt6006 != 0 && local6.anObjectArray11 != null) {
									local522 = new Class6_Sub43();
									local522.aBoolean585 = true;
									local522.aClass292_12 = local6;
									local522.anInt8284 = Static330.anInt6006;
									local522.anObjectArray34 = local6.anObjectArray11;
									Static127.aClass361_21.method7833(local522);
								}
								if (Static547.aClass292_14 != null || Static587.aBoolean734 || local6.anInt7955 != Static117.anInt2721 && Static114.anInt2194 > 0) {
									local262 = false;
									local252 = false;
									local208 = false;
								}
								@Pc(677) int local677;
								if (local6.anInt7955 != 0) {
									if (local6.anInt7955 == Static322.anInt5908 || local6.anInt7955 == Static384.anInt6753) {
										Static206.aClass292_4 = local6;
										if (Static385.aClass268_1 != null) {
											Static385.aClass268_1.method5997(Static240.aClass14_7, local6.anInt7912);
										}
										if (local6.anInt7955 == Static322.anInt5908) {
											if (!Static587.aBoolean734 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static399.method5849(arg9, arg8, Static240.aClass14_7);
												for (@Pc(605) Class98_Sub4 local605 = (Class98_Sub4) Static158.aClass40_3.method1132(); local605 != null; local605 = (Class98_Sub4) Static158.aClass40_3.method1129()) {
													if (arg8 >= local605.anInt5725 && arg8 < local605.anInt5723 && arg9 >= local605.anInt5724 && arg9 < local605.anInt5726) {
														Static305.method1155();
														Static330.method5154(local605.aClass4_Sub1_Sub1_1);
													}
												}
											}
											Static560.method7563(local6, local22, local17);
											continue;
										}
									}
									@Pc(716) int local716;
									if (local6.anInt7955 == Static471.anInt6501) {
										if (local6.method6463(Static240.aClass14_7) == null || Static113.anInt2183 != 0 && Static113.anInt2183 != 3 || Static587.aBoolean734 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local303 = arg8 - local17;
										local677 = arg9 - local22;
										local437 = local6.anIntArray574[local677];
										if (local303 < local437 || local303 > local437 + local6.anIntArray572[local677]) {
											continue;
										}
										local303 -= local6.anInt7963 / 2;
										local677 -= local6.anInt7912 / 2;
										if (Static346.anInt6215 == 4) {
											local716 = (int) Static428.aFloat160 & 0x3FFF;
										} else {
											local716 = (int) Static428.aFloat160 + Static185.anInt3860 & 0x3FFF;
										}
										@Pc(728) int local728 = Class6_Sub2_Sub7.anIntArray178[local716];
										@Pc(732) int local732 = Class6_Sub2_Sub7.anIntArray177[local716];
										if (Static346.anInt6215 != 4) {
											local728 = local728 * (Static291.anInt5446 + 256) >> 8;
											local732 = local732 * (Static291.anInt5446 + 256) >> 8;
										}
										@Pc(761) int local761 = local677 * local728 + local303 * local732 >> 14;
										@Pc(771) int local771 = local677 * local732 - local303 * local728 >> 14;
										@Pc(782) int local782;
										@Pc(790) int local790;
										if (Static346.anInt6215 == 4) {
											local782 = (Static157.anInt3359 >> 9) + (local761 >> 2);
											local790 = (Static220.anInt4550 >> 9) - (local771 >> 2);
										} else {
											@Pc(799) int local799 = (Static328.aClass4_Sub1_Sub1_Sub2_2.method5892() - 1) * 256;
											local782 = (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 - local799 >> 9) + (local761 >> 2);
											local790 = (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 - local799 >> 9) - (local771 >> 2);
										}
										if (Static199.aBoolean458 && (Static348.anInt6222 & 0x40) != 0) {
											@Pc(832) Class292 local832 = Static391.method5747(Static593.anInt9601, Static115.anInt2199);
											if (local832 == null) {
												Static489.method6689();
											} else {
												Static142.method7766(false, true, local6.anInt7933, 45, Static104.aString16, 1L, " ->", local790, Static209.anInt4228, local782);
											}
											continue;
										}
										if (Static317.aClass37_3 == Static255.aClass37_2) {
											Static142.method7766(false, true, -1, 8, Static230.aClass156_26.method4065(Static25.anInt769), 1L, "", local790, -1, local782);
										}
										Static142.method7766(false, true, -1, 9, Static356.aString47, 1L, "", local790, Static543.anInt8952, local782);
										continue;
									}
									if (local6.anInt7955 == Static117.anInt2721) {
										Static1.aClass292_16 = local6;
										if (local208) {
											Static335.aBoolean429 = true;
										}
										if (local262) {
											local303 = (int) ((double) (local267.method1991() - local17 - local6.anInt7963 / 2) * 2.0D / (double) Static217.aFloat73);
											local677 = (int) -((double) (local267.method1982() - local22 - local6.anInt7912 / 2) * 2.0D / (double) Static217.aFloat73);
											local437 = Static39.anInt4953 + local303 + Static217.anInt3835;
											local716 = Static538.anInt8915 + local677 + Static217.anInt3841;
											@Pc(946) Class6_Sub2_Sub6 local946 = Static573.method7682();
											if (local946 == null) {
												continue;
											}
											@Pc(951) int[] local951 = new int[3];
											local946.method2026(local437, local716, local951);
											if (local951 != null) {
												if (Static365.aClass155_1.method4042(82) && Static582.anInt9457 > 0) {
													Static284.method4645(local951[0], local951[2], local951[1]);
													continue;
												}
												Static395.aBoolean486 = true;
												Static310.anInt1807 = local951[0];
												Static290.anInt5424 = local951[1];
												Static130.anInt2956 = local951[2];
											}
											Static114.anInt2194 = 1;
											Static553.aBoolean706 = false;
											Static66.anInt1325 = Static164.aClass173_1.method6487();
											Static565.anInt6649 = Static164.aClass173_1.method6489();
											continue;
										}
										if (local252 && Static114.anInt2194 > 0) {
											if (Static114.anInt2194 == 1 && (Static66.anInt1325 != Static164.aClass173_1.method6487() || Static565.anInt6649 != Static164.aClass173_1.method6489())) {
												Static560.anInt9246 = Static39.anInt4953;
												Static412.anInt7225 = Static538.anInt8915;
												Static114.anInt2194 = 2;
											}
											if (Static114.anInt2194 == 2) {
												Static553.aBoolean706 = true;
												Static142.method7769(Static560.anInt9246 + (int) ((double) (Static66.anInt1325 - Static164.aClass173_1.method6487()) * 2.0D / (double) Static217.aFloat72));
												Static339.method5269(Static412.anInt7225 - (int) ((double) (Static565.anInt6649 - Static164.aClass173_1.method6489()) * 2.0D / (double) Static217.aFloat72));
											}
											continue;
										}
										if (Static114.anInt2194 > 0 && !Static553.aBoolean706) {
											if ((Static51.anInt1132 == 1 || Static176.method3232()) && Static421.anInt7365 > 2) {
												Static92.method1684(Static565.anInt6649, Static66.anInt1325);
											} else if (Static472.method6556()) {
												Static92.method1684(Static565.anInt6649, Static66.anInt1325);
											}
										}
										Static114.anInt2194 = 0;
										continue;
									}
									if (local6.anInt7955 == Static4.anInt239) {
										if (local252) {
											Static139.method2742(Static164.aClass173_1.method6487() - local17, local6.anInt7963, local6.anInt7912, Static164.aClass173_1.method6489() - local22);
										}
										continue;
									}
									if (local6.anInt7955 == Static487.anInt8218) {
										Static202.method3654(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean568 && local262) {
									local6.aBoolean568 = true;
									if (local6.anObjectArray29 != null) {
										local522 = new Class6_Sub43();
										local522.aBoolean585 = true;
										local522.aClass292_12 = local6;
										local522.anInt8283 = local267.method1991() - local17;
										local522.anInt8284 = local267.method1982() - local22;
										local522.anObjectArray34 = local6.anObjectArray29;
										Static127.aClass361_21.method7833(local522);
									}
								}
								if (local6.aBoolean568 && local252 && local6.anObjectArray31 != null) {
									local522 = new Class6_Sub43();
									local522.aBoolean585 = true;
									local522.aClass292_12 = local6;
									local522.anInt8283 = Static164.aClass173_1.method6487() - local17;
									local522.anInt8284 = Static164.aClass173_1.method6489() - local22;
									local522.anObjectArray34 = local6.anObjectArray31;
									Static127.aClass361_21.method7833(local522);
								}
								if (local6.aBoolean568 && !local252) {
									local6.aBoolean568 = false;
									if (local6.anObjectArray3 != null) {
										local522 = new Class6_Sub43();
										local522.aBoolean585 = true;
										local522.aClass292_12 = local6;
										local522.anInt8283 = Static164.aClass173_1.method6487() - local17;
										local522.anInt8284 = Static164.aClass173_1.method6489() - local22;
										local522.anObjectArray34 = local6.anObjectArray3;
										Static141.aClass361_22.method7833(local522);
									}
								}
								if (local252 && local6.anObjectArray21 != null) {
									local522 = new Class6_Sub43();
									local522.aBoolean585 = true;
									local522.aClass292_12 = local6;
									local522.anInt8283 = Static164.aClass173_1.method6487() - local17;
									local522.anInt8284 = Static164.aClass173_1.method6489() - local22;
									local522.anObjectArray34 = local6.anObjectArray21;
									Static127.aClass361_21.method7833(local522);
								}
								if (!local6.aBoolean569 && local208) {
									local6.aBoolean569 = true;
									if (local6.anObjectArray12 != null) {
										local522 = new Class6_Sub43();
										local522.aBoolean585 = true;
										local522.aClass292_12 = local6;
										local522.anInt8283 = Static164.aClass173_1.method6487() - local17;
										local522.anInt8284 = Static164.aClass173_1.method6489() - local22;
										local522.anObjectArray34 = local6.anObjectArray12;
										Static127.aClass361_21.method7833(local522);
									}
								}
								if (local6.aBoolean569 && local208 && local6.anObjectArray14 != null) {
									local522 = new Class6_Sub43();
									local522.aBoolean585 = true;
									local522.aClass292_12 = local6;
									local522.anInt8283 = Static164.aClass173_1.method6487() - local17;
									local522.anInt8284 = Static164.aClass173_1.method6489() - local22;
									local522.anObjectArray34 = local6.anObjectArray14;
									Static127.aClass361_21.method7833(local522);
								}
								if (local6.aBoolean569 && !local208) {
									local6.aBoolean569 = false;
									if (local6.anObjectArray24 != null) {
										local522 = new Class6_Sub43();
										local522.aBoolean585 = true;
										local522.aClass292_12 = local6;
										local522.anInt8283 = Static164.aClass173_1.method6487() - local17;
										local522.anInt8284 = Static164.aClass173_1.method6489() - local22;
										local522.anObjectArray34 = local6.anObjectArray24;
										Static141.aClass361_22.method7833(local522);
									}
								}
								if (local6.anObjectArray26 != null) {
									local522 = new Class6_Sub43();
									local522.aClass292_12 = local6;
									local522.anObjectArray34 = local6.anObjectArray26;
									Static445.aClass361_55.method7833(local522);
								}
								@Pc(1490) Class6_Sub43 local1490;
								if (local6.anObjectArray22 != null && Static155.anInt3335 > local6.anInt7908) {
									if (local6.anIntArray578 == null || Static155.anInt3335 - local6.anInt7908 > 32) {
										local522 = new Class6_Sub43();
										local522.aClass292_12 = local6;
										local522.anObjectArray34 = local6.anObjectArray22;
										Static127.aClass361_21.method7833(local522);
									} else {
										label681: for (local303 = local6.anInt7908; local303 < Static155.anInt3335; local303++) {
											local677 = Static79.anIntArray143[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray578.length; local437++) {
												if (local6.anIntArray578[local437] == local677) {
													local1490 = new Class6_Sub43();
													local1490.aClass292_12 = local6;
													local1490.anObjectArray34 = local6.anObjectArray22;
													Static127.aClass361_21.method7833(local1490);
													break label681;
												}
											}
										}
									}
									local6.anInt7908 = Static155.anInt3335;
								}
								if (local6.anObjectArray7 != null && Static308.anInt5659 > local6.anInt7902) {
									if (local6.anIntArray575 == null || Static308.anInt5659 - local6.anInt7902 > 32) {
										local522 = new Class6_Sub43();
										local522.aClass292_12 = local6;
										local522.anObjectArray34 = local6.anObjectArray7;
										Static127.aClass361_21.method7833(local522);
									} else {
										label657: for (local303 = local6.anInt7902; local303 < Static308.anInt5659; local303++) {
											local677 = Static499.anIntArray606[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray575.length; local437++) {
												if (local6.anIntArray575[local437] == local677) {
													local1490 = new Class6_Sub43();
													local1490.aClass292_12 = local6;
													local1490.anObjectArray34 = local6.anObjectArray7;
													Static127.aClass361_21.method7833(local1490);
													break label657;
												}
											}
										}
									}
									local6.anInt7902 = Static308.anInt5659;
								}
								if (local6.anObjectArray15 != null && Static51.anInt1126 > local6.anInt7948) {
									if (local6.anIntArray579 == null || Static51.anInt1126 - local6.anInt7948 > 32) {
										local522 = new Class6_Sub43();
										local522.aClass292_12 = local6;
										local522.anObjectArray34 = local6.anObjectArray15;
										Static127.aClass361_21.method7833(local522);
									} else {
										label633: for (local303 = local6.anInt7948; local303 < Static51.anInt1126; local303++) {
											local677 = Static528.anIntArray649[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray579.length; local437++) {
												if (local6.anIntArray579[local437] == local677) {
													local1490 = new Class6_Sub43();
													local1490.aClass292_12 = local6;
													local1490.anObjectArray34 = local6.anObjectArray15;
													Static127.aClass361_21.method7833(local1490);
													break label633;
												}
											}
										}
									}
									local6.anInt7948 = Static51.anInt1126;
								}
								if (local6.anObjectArray16 != null && Static51.anInt1133 > local6.anInt7907) {
									if (local6.anIntArray573 == null || Static51.anInt1133 - local6.anInt7907 > 32) {
										local522 = new Class6_Sub43();
										local522.aClass292_12 = local6;
										local522.anObjectArray34 = local6.anObjectArray16;
										Static127.aClass361_21.method7833(local522);
									} else {
										label609: for (local303 = local6.anInt7907; local303 < Static51.anInt1133; local303++) {
											local677 = Static12.anIntArray29[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray573.length; local437++) {
												if (local6.anIntArray573[local437] == local677) {
													local1490 = new Class6_Sub43();
													local1490.aClass292_12 = local6;
													local1490.anObjectArray34 = local6.anObjectArray16;
													Static127.aClass361_21.method7833(local1490);
													break label609;
												}
											}
										}
									}
									local6.anInt7907 = Static51.anInt1133;
								}
								if (local6.anObjectArray8 != null && Static18.anInt542 > local6.anInt7935) {
									if (local6.anIntArray576 == null || Static18.anInt542 - local6.anInt7935 > 32) {
										local522 = new Class6_Sub43();
										local522.aClass292_12 = local6;
										local522.anObjectArray34 = local6.anObjectArray8;
										Static127.aClass361_21.method7833(local522);
									} else {
										label585: for (local303 = local6.anInt7935; local303 < Static18.anInt542; local303++) {
											local677 = Static144.anIntArray193[local303 & 0x1F];
											for (local437 = 0; local437 < local6.anIntArray576.length; local437++) {
												if (local6.anIntArray576[local437] == local677) {
													local1490 = new Class6_Sub43();
													local1490.aClass292_12 = local6;
													local1490.anObjectArray34 = local6.anObjectArray8;
													Static127.aClass361_21.method7833(local1490);
													break label585;
												}
											}
										}
									}
									local6.anInt7935 = Static18.anInt542;
								}
								if (Static474.anInt8693 > local6.anInt7965 && local6.anObjectArray17 != null) {
									local522 = new Class6_Sub43();
									local522.aClass292_12 = local6;
									local522.anObjectArray34 = local6.anObjectArray17;
									Static127.aClass361_21.method7833(local522);
								}
								if (Static449.anInt7763 > local6.anInt7965 && local6.anObjectArray32 != null) {
									local522 = new Class6_Sub43();
									local522.aClass292_12 = local6;
									local522.anObjectArray34 = local6.anObjectArray32;
									Static127.aClass361_21.method7833(local522);
								}
								if (Static404.anInt7178 > local6.anInt7965 && local6.anObjectArray10 != null) {
									local522 = new Class6_Sub43();
									local522.aClass292_12 = local6;
									local522.anObjectArray34 = local6.anObjectArray10;
									Static127.aClass361_21.method7833(local522);
								}
								if (Static345.anInt6206 > local6.anInt7965 && local6.anObjectArray33 != null) {
									local522 = new Class6_Sub43();
									local522.aClass292_12 = local6;
									local522.anObjectArray34 = local6.anObjectArray33;
									Static127.aClass361_21.method7833(local522);
								}
								if (Static330.anInt6004 > local6.anInt7965 && local6.anObjectArray28 != null) {
									local522 = new Class6_Sub43();
									local522.aClass292_12 = local6;
									local522.anObjectArray34 = local6.anObjectArray28;
									Static127.aClass361_21.method7833(local522);
								}
								local6.anInt7965 = Static592.anInt9587;
								if (local6.anObjectArray9 != null) {
									for (local303 = 0; local303 < Static21.anInt685; local303++) {
										@Pc(1958) Class6_Sub43 local1958 = new Class6_Sub43();
										local1958.aClass292_12 = local6;
										local1958.anInt8280 = Static551.anInterface8Array2[local303].method1038();
										local1958.anInt8282 = Static551.anInterface8Array2[local303].method1040();
										local1958.anObjectArray34 = local6.anObjectArray9;
										Static127.aClass361_21.method7833(local1958);
									}
								}
								if (Static519.aBoolean635 && local6.anObjectArray19 != null) {
									local522 = new Class6_Sub43();
									local522.aClass292_12 = local6;
									local522.anObjectArray34 = local6.anObjectArray19;
									Static127.aClass361_21.method7833(local522);
								}
							}
							if (local6.lb == 5 && local6.anInt7943 != -1) {
								local6.method6477(Static230.aClass306_1, Static209.aClass270_1).method5997(Static240.aClass14_7, local6.anInt7912);
							}
							Static14.method324(local6);
							if (local6.lb == 0) {
								method1355(arg0, local6.anInt7890, local28, local30, local32, local34, local17 - local6.anInt7957, local22 - local6.anInt7911, arg8, arg9);
								if (local6.aClass292Array2 != null) {
									method1355(local6.aClass292Array2, local6.anInt7890, local28, local30, local32, local34, local17 - local6.anInt7957, local22 - local6.anInt7911, arg8, arg9);
								}
								@Pc(2080) Class6_Sub11 local2080 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local6.anInt7890);
								if (local2080 != null) {
									if (Static317.aClass37_3 == Static336.aClass37_4 && local2080.anInt1217 == 0 && !Static587.aBoolean734 && local208 && !Static226.aBoolean321) {
										Static305.method1155();
									}
									Static470.method898(local17, local30, local28, local34, local22, local2080.anInt1216, arg9, local32, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static14.method324(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIZ)V")
	public static void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static508.method7071(arg1)) {
			Static321.method5071(arg0, arg2, arg3, Static14.aClass292ArrayArray1[arg1], -1);
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1357() {
		@Pc(1) int local1 = Static231.anInt4727;
		@Pc(3) int[] local3 = Static249.anIntArray372;
		@Pc(20) boolean local20 = Static140.aClass6_Sub48_Sub1_1.anInt9010 == 1 && local1 > 200 || Static140.aClass6_Sub48_Sub1_1.anInt9010 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class4_Sub1_Sub1_Sub2 local29 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local3[local22]];
			if (local29.method5920()) {
				local29.method7792();
				if (local29.aShort126 >= 0 && local29.aShort125 >= 0 && local29.aShort123 < Static473.anInt8075 && local29.aShort124 < Static165.anInt6749) {
					local29.aBoolean499 = local29.aBoolean495 ? local20 : false;
					if (local29 == Static328.aClass4_Sub1_Sub1_Sub2_2) {
						local29.anInt7111 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean493) {
							local75++;
						}
						if (local29.anInt7073 > Static312.anInt5688) {
							local75 += 2;
						}
						local75 += 5 - local29.method5892() << 2;
						if (local29.aBoolean498) {
							local75 += 512;
						} else {
							if (Static481.anInt8148 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7111 = local75 + 1;
					}
				} else {
					local29.anInt7111 = -1;
				}
			} else {
				local29.anInt7111 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static464.anInt7995; local116++) {
			@Pc(127) Class4_Sub1_Sub1_Sub1 local127 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) Static291.anIntArray405[local116])).aClass4_Sub1_Sub1_Sub1_2;
			if (local127.method155() && local127.aClass273_1.method6163(Static498.aClass101_1)) {
				local127.method7792();
				if (local127.aShort126 >= 0 && local127.aShort125 >= 0 && local127.aShort123 < Static473.anInt8075 && local127.aShort124 < Static165.anInt6749) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean493) {
						local164++;
					}
					if (local127.anInt7073 > Static312.anInt5688) {
						local164 += 2;
					}
					local164 += 5 - local127.method5892() << 2;
					if (Static481.anInt8148 == 0) {
						if (local127.aClass273_1.aBoolean518) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static481.anInt8148 == 1) {
						if (local127.aClass273_1.aBoolean518) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass273_1.aBoolean515) {
						local164 += 1024;
					} else if (!local127.aClass273_1.aBoolean516) {
						local164 += 256;
					}
					local127.anInt7111 = local164 + 1;
				} else {
					local127.anInt7111 = -1;
				}
			} else {
				local127.anInt7111 = -1;
			}
		}
		for (local75 = 0; local75 < Static434.aClass262Array1.length; local75++) {
			@Pc(230) Class262 local230 = Static434.aClass262Array1[local75];
			if (local230 != null) {
				if (local230.anInt7229 == 1) {
					@Pc(244) Class6_Sub34 local244 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local230.anInt7228);
					if (local244 != null) {
						@Pc(249) Class4_Sub1_Sub1_Sub1 local249 = local244.aClass4_Sub1_Sub1_Sub1_2;
						if (local249.anInt7111 >= 0) {
							local249.anInt7111 += 2048;
						}
					}
				} else if (local230.anInt7229 == 10) {
					@Pc(268) Class4_Sub1_Sub1_Sub2 local268 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local230.anInt7228];
					if (local268 != null && local268 != Static328.aClass4_Sub1_Sub1_Sub2_2 && local268.anInt7111 >= 0) {
						local268.anInt7111 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1360(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static231.anInt4727;
		@Pc(3) int[] local3 = Static249.anIntArray372;
		@Pc(11) int local11 = Static147.aBoolean698 ? local1 : local1 + Static464.anInt7995;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class4_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local3[local13]];
			} else {
				local23 = ((Class6_Sub34) Static593.aClass128_43.method3263((long) Static291.anIntArray405[local13 - local1])).aClass4_Sub1_Sub1_Sub1_2;
			}
			if (local23.aByte108 == arg0) {
				local23.anInt7110 = 0;
				if (local23.anInt7111 < 0) {
					local23.aBoolean493 = false;
				} else {
					@Pc(54) int local54 = local23.method5892();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9542 & 0x1FF) != 0 || (local23.anInt9540 & 0x1FF) != 0) {
							local23.aBoolean493 = false;
							continue;
						}
					} else if ((local23.anInt9542 & 0x1FF) != 256 || (local23.anInt9540 & 0x1FF) != 256) {
						local23.aBoolean493 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9542 >> 9;
						local101 = local23.anInt9540 >> 9;
						if (local23.anInt7111 != Static181.anIntArrayArray23[local96][local101]) {
							local23.aBoolean493 = true;
							continue;
						}
						if (Static86.anIntArrayArray14[local96][local101] > 1) {
							local126 = Static86.anIntArrayArray14[local96][local101]--;
							local23.aBoolean493 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9542 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9540 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9542 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9540 + local96 >> 9;
						if (!Static561.method7567(local23.anInt7111, local169, local162, local155, local101)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt7111 == Static181.anIntArrayArray23[local180][local183]) {
										local126 = Static86.anIntArrayArray14[local180][local183]--;
									}
								}
							}
							local23.aBoolean493 = true;
							continue;
						}
					}
					if (local23 instanceof Class4_Sub1_Sub1_Sub2 && local23.aClass6_Sub29_3 != null && Static312.anInt5688 >= local23.aClass6_Sub29_3.anInt5275 && Static312.anInt5688 < local23.aClass6_Sub29_3.anInt5268) {
						((Class4_Sub1_Sub1_Sub2) local23).aBoolean499 = false;
					}
					local23.aBoolean493 = false;
					local23.anInt9541 = Static160.method2951(local23.anInt9540, local23.anInt9542, local23.aByte108);
					Static254.method7016(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!rr;)Z")
	public static boolean method1363(@OriginalArg(0) Class292 arg0) {
		if (Static226.aBoolean321) {
			if (method1354(arg0).anInt317 != 0) {
				return false;
			}
			if (arg0.lb == 0) {
				return false;
			}
		}
		return arg0.aBoolean560;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!rr;)Lclient!rr;")
	public static Class292 method1365(@OriginalArg(0) Class292 arg0) {
		@Pc(4) int local4 = method1354(arg0).method242();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static367.method5505(arg0.anInt7901);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1367() {
		for (@Pc(1) int local1 = 0; local1 < Static473.anInt8075; local1++) {
			@Pc(6) int[] local6 = Static181.anIntArrayArray23[local1];
			for (@Pc(8) int local8 = 0; local8 < Static165.anInt6749; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
