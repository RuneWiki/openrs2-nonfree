import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public static int anInt3698 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIBIIIZII[Lclient!vo;)V")
	public static void method3454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class381[] arg9) {
		Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < arg9.length; local13++) {
			@Pc(19) Class381 local19 = arg9[local13];
			if (local19 != null && (arg1 == local19.anInt10079 || arg1 == -1412584499 && local19 == Static637.aClass381_13)) {
				@Pc(48) int local48 = arg8 + local19.anInt10155;
				@Pc(53) int local53 = arg0 + local19.anInt10116;
				@Pc(60) int local60 = local19.anInt10159 + local48 + 1;
				@Pc(68) int local68 = local53 + local19.anInt10131 + 1;
				@Pc(94) int local94;
				if (arg5 == -1) {
					Class6_Sub24.aRectangleArray2[Static149.anInt3119].setBounds(local19.anInt10155 + arg8, local19.anInt10116 + arg0, local19.anInt10159, local19.anInt10131);
					local94 = Static149.anInt3119++;
				} else {
					local94 = arg5;
				}
				local19.anInt10095 = Static141.anInt8737;
				local19.anInt10074 = local94;
				if (!Static78.method1076(local19)) {
					if (local19.anInt10117 != 0) {
						Static224.method4043(local19);
					}
					@Pc(122) int local122 = local19.anInt10155 + arg8;
					@Pc(127) int local127 = local19.anInt10116 + arg0;
					@Pc(129) int local129 = 0;
					@Pc(131) int local131 = 0;
					if (Static93.aBoolean113) {
						local129 = Static24.method290();
						local131 = Static488.method7227();
					}
					@Pc(142) int local142 = local19.anInt10078;
					if (Static628.aBoolean728 && (Static78.method1061(local19).anInt5776 != 0 || local19.anInt10156 == 0) && local142 > 127) {
						local142 = 127;
					}
					@Pc(217) int local217;
					@Pc(224) int local224;
					if (local19 == Static637.aClass381_13) {
						if (arg1 != -1412584499 && (Static24.anInt312 == local19.anInt10107 || Static302.anInt5297 == local19.anInt10107)) {
							Static183.anInt3686 = arg8;
							Static504.anInt8425 = arg0;
							Static672.aClass381Array3 = arg9;
							continue;
						}
						if (Static511.aBoolean648 && Static636.aBoolean732) {
							local217 = local129 + Static331.aClass42_8.method6019();
							local224 = Static331.aClass42_8.method6014() + local131;
							local217 -= Static75.anInt1038;
							local224 -= Static231.anInt4491;
							if (local217 < Static22.anInt5053) {
								local217 = Static22.anInt5053;
							}
							if (Static603.anInt9534 > local224) {
								local224 = Static603.anInt9534;
							}
							if (Static22.anInt5053 + Static220.aClass381_4.anInt10159 < local19.anInt10159 + local217) {
								local217 = Static22.anInt5053 + Static220.aClass381_4.anInt10159 - local19.anInt10159;
							}
							if (Static220.aClass381_4.anInt10131 + Static603.anInt9534 < local224 + local19.anInt10131) {
								local224 = Static603.anInt9534 + Static220.aClass381_4.anInt10131 - local19.anInt10131;
							}
							local122 = local217;
							local127 = local224;
						}
						if (local19.anInt10107 == Static302.anInt5297) {
							local142 = 128;
						}
					}
					@Pc(366) int local366;
					@Pc(354) int local354;
					@Pc(307) int local307;
					@Pc(312) int local312;
					if (local19.anInt10156 == 2) {
						local224 = arg7;
						local354 = arg4;
						local366 = arg3;
						local217 = arg2;
					} else {
						local307 = local122 + local19.anInt10159;
						local312 = local127 + local19.anInt10131;
						local217 = arg2 < local122 ? local122 : arg2;
						local224 = arg7 >= local127 ? arg7 : local127;
						if (local19.anInt10156 == 9) {
							local307++;
							local312++;
						}
						local354 = local312 < arg4 ? local312 : arg4;
						local366 = arg3 > local307 ? local307 : arg3;
					}
					if (local366 > local217 && local354 > local224) {
						@Pc(729) int local729;
						@Pc(765) int local765;
						@Pc(776) int local776;
						@Pc(920) int local920;
						@Pc(922) int local922;
						@Pc(763) int local763;
						if (local19.anInt10117 != 0) {
							if (Static557.anInt9010 == local19.anInt10117 || local19.anInt10117 == Static175.anInt3559) {
								Static616.method8499(local19, local122, local127);
								if (!Static93.aBoolean113) {
									Static649.method8701(local127, local19.anInt10159, local19.anInt10117 == Static175.anInt3559, local122, local19.anInt10131);
									Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
								}
								Static72.aBooleanArray5[local94] = true;
								continue;
							}
							if (local19.anInt10117 == Static70.anInt928) {
								if (local19.method8751(Static202.aClass75_5) != null) {
									Static302.method4850();
									Static143.method441(Static202.aClass75_5, local127, local19, local122);
									Static411.aBooleanArray22[local94] = true;
									Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
									if (Static93.aBoolean113) {
										if (arg6) {
											Static494.method3707(local53, local48, local68, local60);
										} else {
											Static416.method6405(local53, local68, local60, local48);
										}
									}
								}
								continue;
							}
							if (local19.anInt10117 == Static640.anInt9956) {
								Static568.method8737(local122, local127, local19, Static202.aClass75_5);
								continue;
							}
							if (Static477.anInt5051 == local19.anInt10117) {
								Static581.method8102(local19.anInt10106 % 64, Static202.aClass75_5, local127, local122, local19);
								continue;
							}
							if (Static80.anInt1221 == local19.anInt10117) {
								if (local19.method8751(Static202.aClass75_5) != null) {
									Static300.method7415(local127, local19, local122);
									Static411.aBooleanArray22[local94] = true;
									Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
									if (Static93.aBoolean113) {
										if (arg6) {
											Static494.method3707(local53, local48, local68, local60);
										} else {
											Static416.method6405(local53, local68, local60, local48);
										}
									}
								}
								continue;
							}
							if (local19.anInt10117 == Static605.anInt9563) {
								Static494.method3706(local127, Static334.anInterface11_7, local19.anInt10159, Static202.aClass75_5, local122, local19.anInt10131);
								Static72.aBooleanArray5[local94] = true;
								Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
								continue;
							}
							if (Static339.anInt5791 == local19.anInt10117) {
								Static326.method5117(local19.anInt10159, local127, local19.anInt10131, Static202.aClass75_5, local122);
								Static72.aBooleanArray5[local94] = true;
								Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
								continue;
							}
							if (local19.anInt10117 == Static571.anInt9156) {
								if (!Static46.aBoolean42 && !Static309.aBoolean404) {
									continue;
								}
								local307 = local122 + local19.anInt10159;
								if (Static93.aBoolean113) {
									if (arg6) {
										Static494.method3707(local53, local48, local68, local60);
									} else {
										Static416.method6405(local53, local68, local60, local48);
									}
								}
								local312 = local127 + 15;
								if (Static46.aBoolean42) {
									local729 = -256;
									if (Static467.anInt8014 < 20) {
										local729 = -65536;
									}
									Static180.aClass67_5.method8285("Fps:" + Static467.anInt8014, local307, local729, local312, -1);
									local312 += 15;
									@Pc(753) Runtime local753 = Runtime.getRuntime();
									local763 = (int) ((local753.totalMemory() - local753.freeMemory()) / 1024L);
									local765 = -256;
									if (local763 > 98304) {
										if (Static111.aBoolean187) {
											Static163.method3217();
											for (local776 = 0; local776 < 10; local776++) {
												System.gc();
											}
											local763 = (int) ((local753.totalMemory() - local753.freeMemory()) / 1024L);
											if (local763 > 65536) {
												Static298.method4814("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local765 = -65536;
									}
									Static180.aClass67_5.method8285("Mem:" + local763 + "k", local307, local765, local312, -1);
									local312 += 15;
									Static180.aClass67_5.method8285("Game: In:" + Static525.aClass260_4.anInt7197 + "B/s Out:" + Static525.aClass260_4.anInt7201 + "B/s", local307, -256, local312, -1);
									local312 += 15;
									Static180.aClass67_5.method8285("Lobby: In:" + Static525.aClass260_3.anInt7197 + "B/s Out:" + Static525.aClass260_3.anInt7201 + "B/s", local307, -256, local312, -1);
									local312 += 15;
									local776 = Static202.aClass75_5.E() / 1024;
									Static180.aClass67_5.method8285("Offheap:" + local776 + "k", local307, local776 <= 65536 ? -256 : -65536, local312, -1);
									local312 += 15;
									local920 = 0;
									local922 = 0;
									@Pc(924) int local924 = 0;
									for (@Pc(926) int local926 = 0; local926 < 37; local926++) {
										if (Static16.aClass21_Sub1Array1[local926] != null) {
											local920 += Static16.aClass21_Sub1Array1[local926].method4630();
											local922 += Static16.aClass21_Sub1Array1[local926].method4620();
											local924 += Static16.aClass21_Sub1Array1[local926].method4629();
										}
									}
									@Pc(970) int local970 = local924 * 100 / local920;
									@Pc(976) int local976 = local922 * 10000 / local920;
									@Pc(1002) String local1002 = "Cache:" + Static562.method7943(true, (long) local976, 0, 2) + "% (" + local970 + "%)";
									Static23.aClass67_1.method8285(local1002, local307, -256, local312, -1);
									local312 += 12;
								}
								if (Static689.anInt10537 > 0) {
									Static23.aClass67_1.method8285("Particles: " + Static354.anInt6011 + " / " + Static689.anInt10537, local307, -256, local312, -1);
								}
								local312 += 12;
								if (Static309.aBoolean404) {
									Static23.aClass67_1.method8285("Polys: " + Static202.aClass75_5.I() + " Models: " + Static202.aClass75_5.M(), local307, -256, local312, -1);
									local312 += 12;
									Static23.aClass67_1.method8285("Ls: " + Static630.anInt4592 + " La: " + Static109.anInt2146 + " NPC: " + Static566.anInt8431 + " Pl: " + Static583.anInt9303, local307, -256, local312, -1);
									Static667.method8850();
									local312 += 12;
								}
								Static72.aBooleanArray5[local94] = true;
								continue;
							}
						}
						@Pc(1198) Class6_Sub25 local1198;
						if (local19.anInt10156 == 0) {
							if (Static210.anInt4186 == local19.anInt10117 && Static202.aClass75_5.method6705()) {
								Static202.aClass75_5.method6653(local122, local127, local19.anInt10159, local19.anInt10131);
							}
							method3454(local127 - local19.anInt10141, local19.anInt10089, local217, local366, local354, local94, arg6, local224, local122 - local19.anInt10136, arg9);
							if (local19.aClass381Array2 != null) {
								method3454(local127 - local19.anInt10141, local19.anInt10089, local217, local366, local354, local94, arg6, local224, local122 - local19.anInt10136, local19.aClass381Array2);
							}
							local1198 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local19.anInt10089);
							if (local1198 != null) {
								Static278.method3590(local354, local127, local224, local94, local122, local366, local217, local1198.anInt5007);
							}
							if (Static210.anInt4186 == local19.anInt10117 && Static202.aClass75_5.method6705()) {
								Static202.aClass75_5.method6642();
							}
							Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
						}
						if (Static400.aBooleanArray21[local94] || Static47.anInt577 > 1) {
							if (local19.anInt10156 == 3) {
								if (local142 == 0) {
									if (local19.aBoolean740) {
										Static202.aClass75_5.aa(local122, local127, local19.anInt10159, local19.anInt10131, local19.anInt10106, 0);
									} else {
										Static202.aClass75_5.method6701(local122, local127, local19.anInt10159, local19.anInt10131, local19.anInt10106, 0);
									}
								} else if (local19.aBoolean740) {
									Static202.aClass75_5.aa(local122, local127, local19.anInt10159, local19.anInt10131, local19.anInt10106 & 0xFFFFFF | 255 - (local142 & 0xFF) << 24, 1);
								} else {
									Static202.aClass75_5.method6701(local122, local127, local19.anInt10159, local19.anInt10131, 255 - (local142 & 0xFF) << 24 | local19.anInt10106 & 0xFFFFFF, 1);
								}
								if (Static93.aBoolean113) {
									if (arg6) {
										Static494.method3707(local53, local48, local68, local60);
									} else {
										Static416.method6405(local53, local68, local60, local48);
									}
								}
							} else {
								@Pc(1411) Class282 local1411;
								if (local19.anInt10156 == 4) {
									@Pc(1381) Class67 local1381 = local19.method8747(Static202.aClass75_5);
									if (local1381 != null) {
										local312 = local19.anInt10106;
										@Pc(1400) String local1400 = local19.aString123;
										if (local19.anInt10149 != -1) {
											local1411 = Static149.aClass244_1.method5958(local19.anInt10149);
											local1400 = local1411.aString87;
											if (local1400 == null) {
												local1400 = "null";
											}
											if ((local1411.anInt7877 == 1 || local19.anInt10160 != 1) && local19.anInt10160 != -1) {
												local1400 = "<col=ff9040>" + local1400 + "</col> x" + Static472.method7117(local19.anInt10160);
											}
										}
										if (local19.anInt10121 != -1) {
											local1400 = Static251.method4376(local19.anInt10121);
											if (local1400 == null) {
												local1400 = "";
											}
										}
										if (Static339.aClass381_8 == local19) {
											local1400 = Static50.aClass43_30.method596(Static601.anInt9518);
											local312 = local19.anInt10106;
										}
										if (Static506.aBoolean647) {
											Static202.aClass75_5.T(local122, local127, local122 + local19.anInt10159, local19.anInt10131 + local127);
										}
										local1381.method8293(local19.anInt10131, (int[]) null, local19.anInt10159, local1400, local19.aBoolean744 ? 255 - (local142 & 0xFF) << 24 : -1, 0, 0, Static626.aClass49Array16, 255 - (local142 & 0xFF) << 24 | local312, local19.anInt10077, (Class1) null, local122, local127, local19.anInt10073, local19.anInt10085, local19.anInt10082);
										if (Static506.aBoolean647) {
											Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
										}
										if (local1400.trim().length() > 0) {
											if (!Static506.aBoolean647) {
												@Pc(1572) Class53 local1572 = Static234.method4144(Static202.aClass75_5, local19.anInt10080);
												local763 = local1572.method814(local19.anInt10159, local1400, Static626.aClass49Array16);
												local765 = local1572.method815(Static626.aClass49Array16, local19.anInt10159, local1400, local19.anInt10077);
												if (Static93.aBoolean113) {
													if (arg6) {
														Static494.method3707(local127, local122, local127 + local765, local763 + local122);
													} else {
														Static416.method6405(local127, local765 + local127, local763 + local122, local122);
													}
												}
											} else if (Static93.aBoolean113) {
												if (arg6) {
													Static494.method3707(local53, local48, local68, local60);
												} else {
													Static416.method6405(local53, local68, local60, local48);
												}
											}
										}
									} else if (Static38.aBoolean38) {
										Static168.method3312(local19);
									}
								} else {
									@Pc(1784) int local1784;
									if (local19.anInt10156 == 5) {
										if (local19.anInt10147 >= 0) {
											local19.method8748(Static276.aClass350_1, Static227.aClass298_1).method6937(Static202.aClass75_5, local127, local19.anInt10131, local19.anInt10068 << 3, local122, local19.anInt10152 << 3, local19.anInt10159);
										} else {
											@Pc(1714) Class49 local1714;
											if (local19.anInt10149 != -1) {
												@Pc(1735) Class73 local1735 = local19.aBoolean747 ? Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 : null;
												local1714 = Static149.aClass244_1.method5959(local19.anInt10149, local19.anInt10160, local19.anInt10090 | 0xFF000000, local19.anInt10083, local1735, local19.anInt10140, Static202.aClass75_5);
											} else if (local19.anInt10121 == -1) {
												local1714 = local19.method8750(Static202.aClass75_5);
											} else {
												local1714 = Static473.method7123(Static202.aClass75_5, local19.anInt10121);
											}
											if (local1714 != null) {
												local312 = local1714.method8991();
												local729 = local1714.method8987();
												local1784 = (local19.anInt10106 == 0 ? 16777215 : local19.anInt10106 & 0xFFFFFF) | 255 - (local142 & 0xFF) << 24;
												if (local19.aBoolean741) {
													Static202.aClass75_5.T(local122, local127, local122 + local19.anInt10159, local19.anInt10131 + local127);
													if (local19.anInt10151 != 0) {
														local763 = (local19.anInt10159 + local312 - 1) / local312;
														local765 = (local729 + local19.anInt10131 - 1) / local729;
														for (local776 = 0; local776 < local763; local776++) {
															for (local920 = 0; local920 < local765; local920++) {
																if (local19.anInt10106 == 0) {
																	local1714.method8999((float) local312 / 2.0F + (float) (local122 + local776 * local312), (float) (local920 * local729 + local127) + (float) local729 / 2.0F, 4096, local19.anInt10151);
																} else {
																	local1714.method8995((float) (local776 * local312 + local122) + (float) local312 / 2.0F, (float) (local729 * local920 + local127) + (float) local729 / 2.0F, 4096, local19.anInt10151, local1784);
																}
															}
														}
													} else if (local19.anInt10106 == 0 && local142 == 0) {
														local1714.method8998(local122, local127, local19.anInt10159, local19.anInt10131);
													} else {
														local1714.method8990(local122, local127, local19.anInt10159, local19.anInt10131, 0, local1784, 1);
													}
													Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
												} else if (local19.anInt10106 == 0 && local142 == 0) {
													if (local19.anInt10151 != 0) {
														local1714.method8999((float) local19.anInt10159 / 2.0F + (float) local122, (float) local19.anInt10131 / 2.0F + (float) local127, local19.anInt10159 * 4096 / local312, local19.anInt10151);
													} else if (local19.anInt10159 == local312 && local729 == local19.anInt10131) {
														local1714.method8997(local122, local127);
													} else {
														local1714.method8986(local122, local127, local19.anInt10159, local19.anInt10131);
													}
												} else if (local19.anInt10151 != 0) {
													local1714.method8995((float) local19.anInt10159 / 2.0F + (float) local122, (float) local127 + (float) local19.anInt10131 / 2.0F, local19.anInt10159 * 4096 / local312, local19.anInt10151, local1784);
												} else if (local19.anInt10159 == local312 && local729 == local19.anInt10131) {
													local1714.method8981(local122, local127, 0, local1784, 1);
												} else {
													local1714.method8996(local122, local127, local19.anInt10159, local19.anInt10131, 0, local1784, 1);
												}
											} else if (Static38.aBoolean38) {
												Static168.method3312(local19);
											}
										}
										if (Static93.aBoolean113) {
											if (arg6) {
												Static494.method3707(local53, local48, local68, local60);
											} else {
												Static416.method6405(local53, local68, local60, local48);
											}
										}
									} else if (local19.anInt10156 == 6) {
										Static108.method2050();
										local1198 = null;
										@Pc(2180) Class54 local2180 = null;
										local729 = 0;
										if (local19.anInt10149 != -1) {
											local1411 = Static149.aClass244_1.method5958(local19.anInt10149);
											if (local1411 != null) {
												local1411 = local1411.method6986(local19.anInt10160);
												local2180 = local1411.method6985(2048, 1, local19.aBoolean747 ? Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 : null, Static202.aClass75_5, local19.aClass104_11);
												if (local2180 == null) {
													Static168.method3312(local19);
												} else {
													local729 = -local2180.fa() >> 1;
												}
											}
										} else if (local19.anInt10086 == 5) {
											local1784 = local19.anInt10114;
											if (local1784 >= 0 && local1784 < 2048) {
												@Pc(2208) Class60_Sub1_Sub1_Sub3_Sub1 local2208 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local1784];
												if (local2208 != null && (local1784 == Static503.anInt8407 || Static278.method3589(local2208.aString23) == local19.anInt10071)) {
													local2180 = local2208.aClass73_1.method1364(Static664.aClass319_2, Static557.aClass262_1, (Class104) null, Static551.aClass392_1, (byte) 125, 0, local19.aClass104_11, Static303.aClass55_2, Static221.aClass164_1, Static149.aClass244_1, Static444.aClass68_3, (Class104[]) null, Static202.aClass75_5, 2048, (int[]) null);
												}
											}
										} else if (local19.anInt10086 == 8 || local19.anInt10086 == 9) {
											@Pc(2268) Class6_Sub3 local2268 = Static536.method7657(false, local19.anInt10114);
											if (local2268 != null) {
												local2180 = local2268.method354(local19.aBoolean747 ? Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 : null, local19.anInt10071, local19.aClass104_11, local19.anInt10086 == 9, Static202.aClass75_5);
											}
										} else if (local19.aClass104_11 != null && local19.aClass104_11.method9030()) {
											local2180 = local19.method8760(Static149.aClass244_1, local1198, Static221.aClass164_1, Static664.aClass319_2, local19.aClass104_11, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1, Static303.aClass55_2, 2048, Static551.aClass392_1, Static444.aClass68_3, Static202.aClass75_5);
											if (local2180 == null && Static38.aBoolean38) {
												Static168.method3312(local19);
											}
										} else {
											local2180 = local19.method8760(Static149.aClass244_1, local1198, Static221.aClass164_1, Static664.aClass319_2, (Class104) null, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1, Static303.aClass55_2, 2048, Static551.aClass392_1, Static444.aClass68_3, Static202.aClass75_5);
											if (local2180 == null && Static38.aBoolean38) {
												Static168.method3312(local19);
											}
										}
										if (local2180 != null) {
											if (local19.anInt10092 <= 0) {
												local1784 = 512;
											} else {
												local1784 = (local19.anInt10159 << 9) / local19.anInt10092;
											}
											if (local19.anInt10138 <= 0) {
												local763 = 512;
											} else {
												local763 = (local19.anInt10131 << 9) / local19.anInt10138;
											}
											local765 = local19.anInt10159 / 2 + local122;
											local776 = local19.anInt10131 / 2 + local127;
											if (!local19.aBoolean746) {
												local776 += local19.anInt10132 * local763 >> 9;
												local765 += local19.anInt10125 * local1784 >> 9;
											}
											Static373.aClass109_5.method4612();
											Static202.aClass75_5.method6695(Static373.aClass109_5);
											Static202.aClass75_5.DA(local765, local776, local1784, local763);
											Static202.aClass75_5.ya();
											if (local19.aBoolean748) {
												Static202.aClass75_5.C(false);
											}
											if (local19.aBoolean746) {
												Static635.aClass109_12.method4607(local19.anInt10101);
												Static635.aClass109_12.method4608(local19.anInt10144);
												Static635.aClass109_12.method4611(local19.anInt10128);
												Static635.aClass109_12.method4604(local19.anInt10125, local19.anInt10132, local19.anInt10145);
											} else {
												local920 = (local19.anInt10111 << 2) * Class6_Sub2_Sub12.anIntArray293[local19.anInt10101 << 3] >> 14;
												local922 = Class6_Sub2_Sub12.anIntArray292[local19.anInt10101 << 3] * (local19.anInt10111 << 2) >> 14;
												Static635.aClass109_12.method4598(-local19.anInt10128 << 3);
												Static635.aClass109_12.method4608(local19.anInt10144 << 3);
												Static635.aClass109_12.method4604(local19.anInt10127 << 2, local920 + (local19.anInt10109 << 2) + local729, local922 + (local19.anInt10109 << 2));
												Static635.aClass109_12.method4602(local19.anInt10101 << 3);
											}
											local19.method8752(Static202.aClass75_5, Static635.aClass109_12, Static141.anInt8737, local2180);
											if (Static506.aBoolean647) {
												Static202.aClass75_5.T(local122, local127, local122 + local19.anInt10159, local19.anInt10131 + local127);
											}
											if (local19.aBoolean746) {
												if (local19.aBoolean756) {
													local2180.method7407(Static635.aClass109_12, (Class60_Sub10) null, local19.anInt10111, 1);
												} else {
													local2180.method7401(Static635.aClass109_12, (Class60_Sub10) null, 1);
													if (local19.aClass60_Sub4_8 != null) {
														Static202.aClass75_5.method6634(local19.aClass60_Sub4_8.method4556());
													}
												}
											} else if (local19.aBoolean756) {
												local2180.method7407(Static635.aClass109_12, (Class60_Sub10) null, local19.anInt10111 << 2, 1);
											} else {
												local2180.method7401(Static635.aClass109_12, (Class60_Sub10) null, 1);
												if (local19.aClass60_Sub4_8 != null) {
													Static202.aClass75_5.method6634(local19.aClass60_Sub4_8.method4556());
												}
											}
											if (Static506.aBoolean647) {
												Static202.aClass75_5.KA(arg2, arg7, arg3, arg4);
											}
											if (local19.aBoolean748) {
												Static202.aClass75_5.C(true);
											}
										}
										if (Static93.aBoolean113) {
											if (arg6) {
												Static494.method3707(local53, local48, local68, local60);
											} else {
												Static416.method6405(local53, local68, local60, local48);
											}
										}
									} else if (local19.anInt10156 == 9) {
										if (local19.aBoolean753) {
											local729 = local19.anInt10159 + local122;
											local1784 = local127;
											local312 = local127 + local19.anInt10131;
										} else {
											local312 = local127;
											local1784 = local127 + local19.anInt10131;
											local729 = local19.anInt10159 + local122;
										}
										if (local19.anInt10150 == 1) {
											Static202.aClass75_5.method6707(local122, local312, local729, local1784, local19.anInt10106, 0);
										} else {
											Static202.aClass75_5.method6673(local122, local312, local729, local1784, local19.anInt10106, local19.anInt10150);
										}
										if (Static93.aBoolean113) {
											if (arg6) {
												Static494.method3707(local53, local48, local68, local60);
											} else {
												Static416.method6405(local53, local68, local60, local48);
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

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLclient!lga;)V")
	public static void method3455(@OriginalArg(1) Class223 arg0) {
		Static41.anInt541 = arg0.method5257("hitmarks");
		Static543.anInt8811 = arg0.method5257("hitbar_default");
		Static568.anInt10057 = arg0.method5257("timerbar_default");
		Static149.anInt3121 = arg0.method5257("headicons_pk");
		Static18.anInt252 = arg0.method5257("headicons_prayer");
		Static394.anInt6801 = arg0.method5257("hint_headicons");
		Static414.anInt7189 = arg0.method5257("hint_mapmarkers");
		Static343.anInt5857 = arg0.method5257("mapflag");
		Static188.anInt3781 = arg0.method5257("cross");
		Static225.anInt4391 = arg0.method5257("mapdots");
		Static453.anInt7811 = arg0.method5257("scrollbar");
		Static678.anInt10369 = arg0.method5257("name_icons");
		Static395.anInt6853 = arg0.method5257("floorshadows");
		Static521.anInt9053 = arg0.method5257("compass");
		Static233.anInt4507 = arg0.method5257("otherlevel");
		Static302.anInt5298 = arg0.method5257("hint_mapedge");
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(CI)Z")
	public static boolean method3464(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
