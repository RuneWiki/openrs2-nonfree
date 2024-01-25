import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!jia", name = "M", descriptor = "Lclient!db;")
	public static Class2_Sub6_Sub3 aClass2_Sub6_Sub3_2;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIZIIIIZ[Lclient!at;II)V")
	public static void method4888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class24[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
		for (@Pc(17) int local17 = 0; local17 < arg7.length; local17++) {
			@Pc(23) Class24 local23 = arg7[local17];
			if (local23 != null && (local23.anInt511 == arg8 || arg8 == -1412584499 && Static612.aClass24_17 == local23)) {
				@Pc(44) int local44 = arg3 + local23.anInt495;
				@Pc(49) int local49 = local23.anInt465 + arg1;
				@Pc(56) int local56 = local23.anInt441 + local44 + 1;
				@Pc(63) int local63 = local23.anInt488 + local49 + 1;
				@Pc(89) int local89;
				if (arg5 == -1) {
					Class272.aRectangleArray2[Static511.anInt9364].setBounds(arg3 + local23.anInt495, arg1 + local23.anInt465, local23.anInt441, local23.anInt488);
					local89 = Static511.anInt9364++;
				} else {
					local89 = arg5;
				}
				local23.anInt490 = Static407.anInt7704;
				local23.anInt472 = local89;
				if (!Static76.method2241(local23)) {
					if (local23.anInt474 != 0) {
						Static261.method4788(local23);
					}
					@Pc(114) int local114 = local23.anInt495 + arg3;
					@Pc(119) int local119 = local23.anInt465 + arg1;
					@Pc(121) int local121 = 0;
					@Pc(123) int local123 = 0;
					if (Static487.aBoolean676) {
						local121 = Static465.method7210();
						local123 = Static207.method4090();
					}
					@Pc(134) int local134 = local23.anInt433;
					if (Static591.aBoolean480 && (Static76.method2235(local23).anInt10800 != 0 || local23.anInt480 == 0) && local134 > 127) {
						local134 = 127;
					}
					@Pc(188) int local188;
					@Pc(194) int local194;
					if (local23 == Static612.aClass24_17) {
						if (arg8 != -1412584499 && (Static69.anInt2215 == local23.anInt493 || Static128.anInt3270 == local23.anInt493)) {
							Static384.anInt7428 = arg1;
							Static2.anInt4537 = arg3;
							Static388.aClass24Array2 = arg7;
							continue;
						}
						if (Static630.aBoolean747 && Static133.aBoolean254) {
							local188 = Static628.aClass9_1.method803() + local121;
							local194 = Static628.aClass9_1.method800() + local123;
							local188 -= Static257.anInt5500;
							local194 -= Static505.anInt9315;
							if (Static146.anInt3560 > local188) {
								local188 = Static146.anInt3560;
							}
							if (local194 < Static239.anInt5180) {
								local194 = Static239.anInt5180;
							}
							if (local23.anInt441 + local188 > Static102.aClass24_7.anInt441 + Static146.anInt3560) {
								local188 = Static146.anInt3560 + Static102.aClass24_7.anInt441 - local23.anInt441;
							}
							if (local194 + local23.anInt488 > Static102.aClass24_7.anInt488 + Static239.anInt5180) {
								local194 = Static239.anInt5180 + Static102.aClass24_7.anInt488 - local23.anInt488;
							}
							local114 = local188;
							local119 = local194;
						}
						if (Static128.anInt3270 == local23.anInt493) {
							local134 = 128;
						}
					}
					@Pc(313) int local313;
					@Pc(324) int local324;
					@Pc(275) int local275;
					@Pc(280) int local280;
					if (local23.anInt480 == 2) {
						local188 = arg0;
						local194 = arg4;
						local324 = arg9;
						local313 = arg6;
					} else {
						local275 = local114 + local23.anInt441;
						local280 = local119 + local23.anInt488;
						if (local23.anInt480 == 9) {
							local280++;
							local275++;
						}
						local188 = arg0 < local114 ? local114 : arg0;
						local194 = local119 <= arg4 ? arg4 : local119;
						local313 = arg6 <= local275 ? arg6 : local275;
						local324 = local280 < arg9 ? local280 : arg9;
					}
					if (local188 < local313 && local194 < local324) {
						@Pc(631) int local631;
						@Pc(642) int local642;
						@Pc(732) int local732;
						@Pc(595) int local595;
						@Pc(629) int local629;
						if (local23.anInt474 != 0) {
							if (local23.anInt474 == Static392.anInt7538 || Static69.anInt2217 == local23.anInt474) {
								Static327.method5626(local23, local119, local114);
								if (!Static487.aBoolean676) {
									Static507.method7812(Static69.anInt2217 == local23.anInt474, local23.anInt441, local114, local23.anInt488, local119);
									Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
								}
								Static403.aBooleanArray18[local89] = true;
								continue;
							}
							if (Static63.anInt2060 == local23.anInt474) {
								if (local23.method611(Static186.aClass20_4) != null) {
									Static293.method5263();
									Static353.method6004(local23, Static186.aClass20_4, local114, local119);
									Static60.aBooleanArray9[local89] = true;
									Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
									if (Static487.aBoolean676) {
										if (arg2) {
											Static113.method2842(local44, local56, local49, local63);
										} else {
											Static258.method4741(local63, local44, local56, local49);
										}
									}
								}
								continue;
							}
							if (Static416.anInt7872 == local23.anInt474) {
								if (local23.method611(Static186.aClass20_4) != null) {
									Static210.method4125(local119, local23, local114);
									Static60.aBooleanArray9[local89] = true;
									Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
									if (Static487.aBoolean676) {
										if (arg2) {
											Static113.method2842(local44, local56, local49, local63);
										} else {
											Static258.method4741(local63, local44, local56, local49);
										}
									}
								}
								continue;
							}
							if (Static55.anInt8363 == local23.anInt474) {
								Static320.method5565(local114, local23.anInt441, local23.anInt488, Static186.aClass20_4, local119, Static216.anInterface4_10);
								Static403.aBooleanArray18[local89] = true;
								Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
								continue;
							}
							if (Static501.anInt9260 == local23.anInt474) {
								Static147.method3253(local23.anInt488, Static186.aClass20_4, local114, local23.anInt441, local119);
								Static403.aBooleanArray18[local89] = true;
								Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
								continue;
							}
							if (local23.anInt474 == Static384.anInt7429) {
								if (!Static624.aBoolean742 && !Static460.aBoolean604) {
									continue;
								}
								local275 = local23.anInt441 + local114;
								local280 = local119 + 15;
								if (Static487.aBoolean676) {
									if (arg2) {
										Static113.method2842(local44, local56, local49, local63);
									} else {
										Static258.method4741(local63, local44, local56, local49);
									}
								}
								if (Static624.aBoolean742) {
									local595 = -256;
									if (Static290.anInt6169 < 20) {
										local595 = -65536;
									}
									Static300.aClass68_4.method8100("Fps:" + Static290.anInt6169, local280, local595, local275, -1);
									local280 += 15;
									@Pc(619) Runtime local619 = Runtime.getRuntime();
									local629 = (int) ((local619.totalMemory() - local619.freeMemory()) / 1024L);
									local631 = -256;
									if (local629 > 98304) {
										local631 = -65536;
										if (Static418.aBoolean568) {
											Static24.method613();
											for (local642 = 0; local642 < 10; local642++) {
												System.gc();
											}
											local629 = (int) ((local619.totalMemory() - local619.freeMemory()) / 1024L);
											if (local629 > 65536) {
												Static271.method9045("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static300.aClass68_4.method8100("Mem:" + local629 + "k", local280, local631, local275, -1);
									local280 += 15;
									Static300.aClass68_4.method8100("In:" + Static573.anInt10250 + "B/s Out:" + Static57.anInt1931 + "B/s", local280, -256, local275, -1);
									local280 += 15;
									local642 = Static186.aClass20_4.E() / 1024;
									Static300.aClass68_4.method8100("Offheap:" + local642 + "k", local280, local642 <= 65536 ? -256 : -65536, local275, -1);
									local280 += 15;
									local732 = 0;
									@Pc(734) int local734 = 0;
									@Pc(736) int local736 = 0;
									for (@Pc(738) int local738 = 0; local738 < 37; local738++) {
										if (Static18.aClass37_Sub1Array1[local738] != null) {
											local732 += Static18.aClass37_Sub1Array1[local738].method1667();
											local734 += Static18.aClass37_Sub1Array1[local738].method1673();
											local736 += Static18.aClass37_Sub1Array1[local738].method1663();
										}
									}
									@Pc(780) int local780 = local736 * 100 / local732;
									@Pc(786) int local786 = local734 * 10000 / local732;
									@Pc(806) String local806 = "Cache:" + Static136.method3074(2, true, 0, (long) local786) + "% (" + local780 + "%)";
									Static529.aClass68_10.method8100(local806, local280, -256, local275, -1);
									local280 += 12;
								}
								if (Static70.anInt2219 > 0) {
									Static529.aClass68_10.method8100("Particles: " + Static578.anInt8201 + " / " + Static70.anInt2219, local280, -256, local275, -1);
								}
								local280 += 12;
								if (Static460.aBoolean604) {
									Static529.aClass68_10.method8100("Polys: " + Static186.aClass20_4.I() + " Models: " + Static186.aClass20_4.M(), local280, -256, local275, -1);
									local280 += 12;
									Static529.aClass68_10.method8100("Ls: " + Static440.anInt8154 + " La: " + Static319.anInt6496 + " NPC: " + Static515.anInt9427 + " Pl: " + Static13.anInt197, local280, -256, local275, -1);
									Static344.method5906();
									local280 += 12;
								}
								Static403.aBooleanArray18[local89] = true;
								continue;
							}
						}
						if (local23.anInt480 == 0) {
							if (Static168.anInt4130 == local23.anInt474 && Static186.aClass20_4.method7269()) {
								Static186.aClass20_4.method7261(local114, local119, local23.anInt441, local23.anInt488);
							}
							method4888(local188, local119 - local23.anInt467, arg2, local114 - local23.anInt463, local194, local89, local313, arg7, local23.anInt510, local324);
							if (local23.aClass24Array1 != null) {
								method4888(local188, local119 - local23.anInt467, arg2, local114 - local23.anInt463, local194, local89, local313, local23.aClass24Array1, local23.anInt510, local324);
							}
							@Pc(974) Class2_Sub48 local974 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local23.anInt510);
							if (local974 != null) {
								Static412.method6654(local119, local974.anInt10125, local194, local89, local114, local313, local324, local188);
							}
							if (Static168.anInt4130 == local23.anInt474 && Static186.aClass20_4.method7269()) {
								Static186.aClass20_4.method7301();
							}
							Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
						}
						if (Static437.aBooleanArray20[local89] || Static626.anInt1506 > 1) {
							if (local23.anInt480 == 3) {
								if (local134 == 0) {
									if (local23.aBoolean42) {
										Static186.aClass20_4.aa(local114, local119, local23.anInt441, local23.anInt488, local23.anInt464, 0);
									} else {
										Static186.aClass20_4.method7231(local114, local119, local23.anInt441, local23.anInt488, local23.anInt464, 0);
									}
								} else if (local23.aBoolean42) {
									Static186.aClass20_4.aa(local114, local119, local23.anInt441, local23.anInt488, local23.anInt464 & 0xFFFFFF | 255 - (local134 & 0xFF) << 24, 1);
								} else {
									Static186.aClass20_4.method7231(local114, local119, local23.anInt441, local23.anInt488, local23.anInt464 & 0xFFFFFF | 255 - (local134 & 0xFF) << 24, 1);
								}
								if (Static487.aBoolean676) {
									if (arg2) {
										Static113.method2842(local44, local56, local49, local63);
									} else {
										Static258.method4741(local63, local44, local56, local49);
									}
								}
							} else if (local23.anInt480 == 4) {
								@Pc(1130) Class68 local1130 = local23.method612(Static186.aClass20_4);
								if (local1130 != null) {
									local280 = local23.anInt464;
									@Pc(1145) String local1145 = local23.aString5;
									if (local23.anInt501 != -1) {
										@Pc(1155) Class301 local1155 = Static635.aClass336_2.method8424(local23.anInt501);
										local1145 = local1155.aString97;
										if (local1145 == null) {
											local1145 = "null";
										}
										if ((local1155.anInt9219 == 1 || local23.anInt483 != 1) && local23.anInt483 != -1) {
											local1145 = "<col=ff9040>" + local1145 + "</col> x" + Static235.method4440(local23.anInt483);
										}
									}
									if (local23.anInt498 != -1) {
										local1145 = Static135.method3072(local23.anInt498);
										if (local1145 == null) {
											local1145 = "";
										}
									}
									if (Static249.aClass24_10 == local23) {
										local1145 = Static588.aClass351_33.method8691(Static476.anInt8915);
										local280 = local23.anInt464;
									}
									if (Static148.aBoolean267) {
										Static186.aClass20_4.T(local114, local119, local23.anInt441 + local114, local23.anInt488 + local119);
									}
									local1130.method8099(null, local23.anInt488, null, 0, Static38.aClass46Array2, 255 - (local134 & 0xFF) << 24 | local280, local119, local23.anInt441, local23.anInt436, local1145, 0, local114, local23.anInt473, local23.aBoolean37 ? 255 - (local134 & 0xFF) << 24 : -1, local23.anInt479, local23.anInt422);
									if (Static148.aBoolean267) {
										Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
									}
									if (local1145.trim().length() > 0) {
										if (!Static148.aBoolean267) {
											@Pc(1320) Class239 local1320 = Static43.method5097(Static186.aClass20_4, local23.anInt437);
											local629 = local1320.method6486(local1145, local23.anInt441, Static38.aClass46Array2);
											local631 = local1320.method6484(Static38.aClass46Array2, local23.anInt422, local23.anInt441, local1145);
											if (Static487.aBoolean676) {
												if (arg2) {
													Static113.method2842(local114, local629 + local114, local119, local119 + local631);
												} else {
													Static258.method4741(local119 + local631, local114, local114 + local629, local119);
												}
											}
										} else if (Static487.aBoolean676) {
											if (arg2) {
												Static113.method2842(local44, local56, local49, local63);
											} else {
												Static258.method4741(local63, local44, local56, local49);
											}
										}
									}
								} else if (Static610.aBoolean728) {
									Static553.method8248(local23);
								}
							} else {
								@Pc(1489) int local1489;
								if (local23.anInt480 == 5) {
									if (local23.anInt440 >= 0) {
										local23.method630(Static371.aClass137_1, Static227.aClass190_1).method9210(0, Static186.aClass20_4, local114, local23.anInt441, local119, local23.anInt512 << 3, local23.anInt471 << 3, 0, local23.anInt488);
									} else {
										@Pc(1432) Class46 local1432;
										if (local23.anInt501 != -1) {
											@Pc(1414) Class249 local1414 = local23.aBoolean31 ? Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 : null;
											local1432 = Static635.aClass336_2.method8425(local23.anInt421, local23.anInt501, local23.anInt483, local23.anInt500 | 0xFF000000, local23.anInt425, Static186.aClass20_4, local1414);
										} else if (local23.anInt498 == -1) {
											local1432 = local23.method629(Static186.aClass20_4);
										} else {
											local1432 = Static451.method7097(Static186.aClass20_4, local23.anInt498);
										}
										if (local1432 != null) {
											local280 = local1432.method6205();
											local595 = local1432.method6219();
											local1489 = 255 - (local134 & 0xFF) << 24 | (local23.anInt464 == 0 ? 16777215 : local23.anInt464 & 0xFFFFFF);
											if (local23.aBoolean30) {
												Static186.aClass20_4.T(local114, local119, local114 + local23.anInt441, local23.anInt488 + local119);
												if (local23.anInt508 != 0) {
													local629 = (local280 + local23.anInt441 - 1) / local280;
													local631 = (local595 + local23.anInt488 - 1) / local595;
													for (local642 = 0; local642 < local629; local642++) {
														for (local732 = 0; local732 < local631; local732++) {
															if (local23.anInt464 == 0) {
																local1432.method6220((float) local280 / 2.0F + (float) (local114 + local280 * local642), (float) local595 / 2.0F + (float) (local732 * local595 + local119), 4096, local23.anInt508);
															} else {
																local1432.method6216((float) local280 / 2.0F + (float) (local280 * local642 + local114), (float) local595 / 2.0F + (float) (local119 + local732 * local595), 4096, local23.anInt508, local1489);
															}
														}
													}
												} else if (local23.anInt464 == 0 && local134 == 0) {
													local1432.method6211(local114, local119, local23.anInt441, local23.anInt488);
												} else {
													local1432.method6204(local114, local119, local23.anInt441, local23.anInt488, 0, local1489, 1);
												}
												Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
											} else if (local23.anInt464 == 0 && local134 == 0) {
												if (local23.anInt508 != 0) {
													local1432.method6220((float) local114 + (float) local23.anInt441 / 2.0F, (float) local23.anInt488 / 2.0F + (float) local119, local23.anInt441 * 4096 / local280, local23.anInt508);
												} else if (local280 == local23.anInt441 && local23.anInt488 == local595) {
													local1432.method6213(local114, local119);
												} else {
													local1432.method6212(local114, local119, local23.anInt441, local23.anInt488);
												}
											} else if (local23.anInt508 != 0) {
												local1432.method6216((float) local114 + (float) local23.anInt441 / 2.0F, (float) local119 + (float) local23.anInt488 / 2.0F, local23.anInt441 * 4096 / local280, local23.anInt508, local1489);
											} else if (local280 == local23.anInt441 && local23.anInt488 == local595) {
												local1432.method6203(local114, local119, 0, local1489, 1);
											} else {
												local1432.method6209(local114, local119, local23.anInt441, local23.anInt488, 0, local1489, 1);
											}
										} else if (Static610.aBoolean728) {
											Static553.method8248(local23);
										}
									}
									if (Static487.aBoolean676) {
										if (arg2) {
											Static113.method2842(local44, local56, local49, local63);
										} else {
											Static258.method4741(local63, local44, local56, local49);
										}
									}
								} else if (local23.anInt480 == 6) {
									Static140.method3122();
									@Pc(1807) Class166 local1807 = null;
									local280 = 0;
									@Pc(1840) Class130 local1840;
									@Pc(1848) Class249 local1848;
									if (local23.anInt501 != -1) {
										@Pc(1820) Class301 local1820 = Static635.aClass336_2.method8424(local23.anInt501);
										if (local1820 != null) {
											local1820 = local1820.method7706(local23.anInt483);
											local1840 = local23.anInt435 == -1 ? null : Static195.aClass193_1.method5573(local23.anInt435);
											local1848 = local23.aBoolean31 ? Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 : null;
											local1807 = local1820.method7705(local1848, local1840, Static186.aClass20_4, 2048, local23.anInt514, 1, local23.anInt491, local23.anInt456);
											if (local1807 == null) {
												Static553.method8248(local23);
											} else {
												local280 = -local1807.fa() >> 1;
											}
										}
									} else if (local23.anInt478 == 5) {
										local595 = local23.anInt466;
										if (local595 >= 0 && local595 < 2048) {
											@Pc(1900) Class3_Sub1_Sub3_Sub3_Sub2 local1900 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local595];
											@Pc(1913) Class130 local1913 = local23.anInt435 == -1 ? null : Static195.aClass193_1.method5573(local23.anInt435);
											if (local1900 != null && (local595 == Static569.anInt10211 || Static105.method2755(local1900.aString64) == local23.anInt482)) {
												local1807 = local1900.aClass249_1.method6585(Static286.aClass263_3, null, null, Static635.aClass336_2, 0, local1913, local23.anInt456, -1, null, 2048, Static541.aClass245_2, local23.anInt514, Static186.aClass20_4, Static462.aClass355_2, Static195.aClass193_1, 0, local23.anInt491, 0, Static415.aClass340_1);
											}
										}
									} else if (local23.anInt478 == 8 || local23.anInt478 == 9) {
										@Pc(2039) Class2_Sub24 local2039 = Static628.method9105(local23.anInt466, false);
										local1840 = local23.anInt435 == -1 ? null : Static195.aClass193_1.method5573(local23.anInt435);
										if (local2039 != null) {
											local1848 = local23.aBoolean31 ? Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1 : null;
											local1807 = local2039.method4453(local1840, local1848, local23.anInt482, local23.anInt491, local23.anInt514, local23.anInt456, Static186.aClass20_4, local23.anInt478 == 9);
										}
									} else if (local23.anInt435 == -1) {
										local1807 = local23.method616(Static541.aClass245_2, Static195.aClass193_1, 2048, Static186.aClass20_4, -1, 0, Static635.aClass336_2, Static286.aClass263_3, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1, null, Static415.aClass340_1, Static462.aClass355_2, -1);
										if (local1807 == null && Static610.aBoolean728) {
											Static553.method8248(local23);
										}
									} else {
										@Pc(1978) Class130 local1978 = Static195.aClass193_1.method5573(local23.anInt435);
										local1807 = local23.method616(Static541.aClass245_2, Static195.aClass193_1, 2048, Static186.aClass20_4, local23.anInt491, local23.anInt514, Static635.aClass336_2, Static286.aClass263_3, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aClass249_1, local1978, Static415.aClass340_1, Static462.aClass355_2, local23.anInt456);
										if (local1807 == null && Static610.aBoolean728) {
											Static553.method8248(local23);
										}
									}
									if (local1807 != null) {
										if (local23.anInt492 > 0) {
											local595 = (local23.anInt441 << 9) / local23.anInt492;
										} else {
											local595 = 512;
										}
										if (local23.anInt506 <= 0) {
											local1489 = 512;
										} else {
											local1489 = (local23.anInt488 << 9) / local23.anInt506;
										}
										local629 = local114 + local23.anInt441 / 2;
										local631 = local119 + local23.anInt488 / 2;
										if (!local23.aBoolean39) {
											local629 += local595 * local23.anInt427 >> 9;
											local631 += local1489 * local23.anInt494 >> 9;
										}
										Static45.aClass30_3.method4665();
										Static186.aClass20_4.method7241(Static45.aClass30_3);
										Static186.aClass20_4.DA(local629, local631, local595, local1489);
										Static186.aClass20_4.ya();
										if (local23.aBoolean36) {
											Static186.aClass20_4.C(false);
										}
										if (local23.aBoolean39) {
											Static172.aClass30_6.method4654(local23.anInt469);
											Static172.aClass30_6.method4651(local23.anInt424);
											Static172.aClass30_6.method4663(local23.anInt447);
											Static172.aClass30_6.method4646(local23.anInt427, local23.anInt494, local23.anInt486);
										} else {
											local642 = (local23.anInt446 << 2) * Class177.anIntArray361[local23.anInt469 << 3] >> 14;
											local732 = Class177.anIntArray360[local23.anInt469 << 3] * (local23.anInt446 << 2) >> 14;
											Static172.aClass30_6.method4657(-local23.anInt447 << 3);
											Static172.aClass30_6.method4651(local23.anInt424 << 3);
											Static172.aClass30_6.method4646(local23.anInt499 << 2, (local23.anInt485 << 2) + local642 + local280, (local23.anInt485 << 2) + local732);
											Static172.aClass30_6.method4655(local23.anInt469 << 3);
										}
										local23.method623(local1807, Static186.aClass20_4, Static407.anInt7704, Static172.aClass30_6);
										if (Static148.aBoolean267) {
											Static186.aClass20_4.T(local114, local119, local23.anInt441 + local114, local119 + local23.anInt488);
										}
										if (local23.aBoolean39) {
											if (local23.aBoolean29) {
												local1807.method6678(Static172.aClass30_6, null, local23.anInt446, 1);
											} else {
												local1807.method6685(Static172.aClass30_6, null, 1);
												if (local23.aClass3_Sub9_1 != null) {
													Static186.aClass20_4.method7287(local23.aClass3_Sub9_1.method8590());
												}
											}
										} else if (local23.aBoolean29) {
											local1807.method6678(Static172.aClass30_6, null, local23.anInt446 << 2, 1);
										} else {
											local1807.method6685(Static172.aClass30_6, null, 1);
											if (local23.aClass3_Sub9_1 != null) {
												Static186.aClass20_4.method7287(local23.aClass3_Sub9_1.method8590());
											}
										}
										if (Static148.aBoolean267) {
											Static186.aClass20_4.KA(arg0, arg4, arg6, arg9);
										}
										if (local23.aBoolean36) {
											Static186.aClass20_4.C(true);
										}
									}
									if (Static487.aBoolean676) {
										if (arg2) {
											Static113.method2842(local44, local56, local49, local63);
										} else {
											Static258.method4741(local63, local44, local56, local49);
										}
									}
								} else if (local23.anInt480 == 9) {
									if (local23.aBoolean34) {
										local280 = local23.anInt488 + local119;
										local595 = local23.anInt441 + local114;
										local1489 = local119;
									} else {
										local1489 = local119 + local23.anInt488;
										local595 = local23.anInt441 + local114;
										local280 = local119;
									}
									if (local23.anInt428 == 1) {
										Static186.aClass20_4.method7312(local114, local280, local595, local1489, local23.anInt464, 0);
									} else {
										Static186.aClass20_4.method7291(local114, local280, local595, local1489, local23.anInt464, local23.anInt428);
									}
									if (Static487.aBoolean676) {
										if (arg2) {
											Static113.method2842(local44, local56, local49, local63);
										} else {
											Static258.method4741(local63, local44, local56, local49);
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

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(IZI)V")
	public static void method4889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class2_Sub52 local19 = Static130.method3019(Static14.aClass94_6, Static361.aClass183_1);
		local19.aClass2_Sub11_Sub2_7.method8331(arg1);
		local19.aClass2_Sub11_Sub2_7.method8332(arg0);
		Static96.method2563(local19);
	}
}
