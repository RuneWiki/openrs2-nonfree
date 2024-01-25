import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
	public static int anInt7210;

	@OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
	public static int anInt7222;

	@OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
	public static int anInt7221 = 0;

	@OriginalMember(owner = "client!pia", name = "t", descriptor = "[I")
	public static final int[] anIntArray487 = new int[14];

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIILclient!qca;)V")
	public static void method6314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16_Sub1_Sub3 arg3) {
		@Pc(4) Class84 local4 = Static111.method2006(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass16_Sub1_Sub3_1 = arg3;
		@Pc(16) int local16 = Static511.aClass91Array3 == Static332.aClass91Array2 ? 1 : 0;
		if (arg3.method6990()) {
			if (arg3.method6974()) {
				arg3.aClass16_Sub1_23 = Static451.aClass16_Sub1Array3[local16];
				Static451.aClass16_Sub1Array3[local16] = arg3;
				return;
			}
			arg3.aClass16_Sub1_23 = Static524.aClass16_Sub1Array5[local16];
			Static524.aClass16_Sub1Array5[local16] = arg3;
			Static578.aBoolean673 = true;
			return;
		}
		arg3.aClass16_Sub1_23 = Static518.aClass16_Sub1Array4[local16];
		Static518.aClass16_Sub1Array4[local16] = arg3;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)V")
	public static void method6316() {
		if (Static247.aClass48_23 != null) {
			Static113.aClass23_1 = new Class23();
			Static113.aClass23_1.method621(Static96.aLong65, Static247.aClass48_23, Static247.aClass48_23.anInt1437, Static247.aClass48_23.aClass345_1.method7951(Static496.anInt7407));
			Static272.aThread2 = new Thread(Static113.aClass23_1, "");
			Static272.aThread2.start();
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIBIIII[Lclient!ria;Z)V")
	public static void method6317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class303[] arg8, @OriginalArg(10) boolean arg9) {
		Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
		for (@Pc(18) int local18 = 0; local18 < arg8.length; local18++) {
			@Pc(24) Class303 local24 = arg8[local18];
			if (local24 != null && (arg5 == local24.anInt7985 || arg5 == -1412584499 && local24 == Static351.aClass303_13)) {
				@Pc(49) int local49 = arg4 + local24.anInt7923;
				@Pc(54) int local54 = local24.anInt7955 + arg0;
				@Pc(61) int local61 = local24.anInt7914 + local49 + 1;
				@Pc(68) int local68 = local24.anInt7971 + local54 + 1;
				@Pc(94) int local94;
				if (arg6 == -1) {
					Class2_Sub18.aRectangleArray1[Static509.anInt8223].setBounds(arg4 + local24.anInt7923, arg0 + local24.anInt7955, local24.anInt7914, local24.anInt7971);
					local94 = Static509.anInt8223++;
				} else {
					local94 = arg6;
				}
				local24.anInt7944 = local94;
				local24.anInt7925 = Static389.anInt6694;
				if (!Static79.method1725(local24)) {
					if (local24.anInt7972 != 0) {
						Static605.method8507(local24);
					}
					@Pc(122) int local122 = local24.anInt7923 + arg4;
					@Pc(127) int local127 = arg0 + local24.anInt7955;
					@Pc(129) int local129 = 0;
					@Pc(131) int local131 = 0;
					if (Static148.aBoolean241) {
						local129 = Static100.method1939();
						local131 = Static260.method4303();
					}
					@Pc(142) int local142 = local24.anInt7980;
					if (Static179.aBoolean273 && (Static79.method1734(local24).anInt3087 != 0 || local24.anInt7935 == 0) && local142 > 127) {
						local142 = 127;
					}
					@Pc(198) int local198;
					@Pc(206) int local206;
					if (Static351.aClass303_13 == local24) {
						if (arg5 != -1412584499 && (local24.anInt7981 == Static78.anInt1985 || Static45.anInt1208 == local24.anInt7981)) {
							Static114.aClass303Array1 = arg8;
							anInt7222 = arg4;
							Static198.anInt3923 = arg0;
							continue;
						}
						if (Static610.aBoolean726 && Static252.aBoolean360) {
							local198 = Static186.aClass358_1.method8722() + local129;
							local206 = local131 + Static186.aClass358_1.method8721();
							local198 -= Static521.anInt8409;
							local206 -= Static474.anInt7662;
							if (local198 < Static518.anInt8367) {
								local198 = Static518.anInt8367;
							}
							if (local198 + local24.anInt7914 > Static518.anInt8367 - -Static373.aClass303_14.anInt7914) {
								local198 = Static518.anInt8367 + Static373.aClass303_14.anInt7914 - local24.anInt7914;
							}
							if (local206 < Static335.anInt5865) {
								local206 = Static335.anInt5865;
							}
							if (local24.anInt7971 + local206 > Static373.aClass303_14.anInt7971 + Static335.anInt5865) {
								local206 = Static373.aClass303_14.anInt7971 + Static335.anInt5865 - local24.anInt7971;
							}
							local122 = local198;
							local127 = local206;
						}
						if (Static45.anInt1208 == local24.anInt7981) {
							local142 = 128;
						}
					}
					@Pc(293) int local293;
					@Pc(295) int local295;
					@Pc(304) int local304;
					@Pc(309) int local309;
					if (local24.anInt7935 == 2) {
						local206 = arg7;
						local293 = arg1;
						local295 = arg2;
						local198 = arg3;
					} else {
						local304 = local24.anInt7914 + local122;
						local309 = local24.anInt7971 + local127;
						local206 = arg7 < local127 ? local127 : arg7;
						local198 = arg3 < local122 ? local122 : arg3;
						if (local24.anInt7935 == 9) {
							local304++;
							local309++;
						}
						local293 = arg1 > local304 ? local304 : arg1;
						local295 = local309 < arg2 ? local309 : arg2;
					}
					if (local293 > local198 && local295 > local206) {
						@Pc(604) int local604;
						@Pc(650) int local650;
						@Pc(744) int local744;
						@Pc(746) int local746;
						@Pc(635) int local635;
						@Pc(637) int local637;
						if (local24.anInt7972 != 0) {
							if (Static40.anInt838 == local24.anInt7972 || Static600.anInt9941 == local24.anInt7972) {
								Static90.method1856(local24, local122, local127);
								if (!Static148.aBoolean241) {
									Static6.method97(local24.anInt7972 == Static600.anInt9941, local127, local24.anInt7971, local122, local24.anInt7914);
									Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
								}
								Static377.aBooleanArray14[local94] = true;
								continue;
							}
							if (Static451.anInt7363 == local24.anInt7972) {
								if (local24.method6948(Static141.aClass13_27) != null) {
									Static113.method2018();
									Static114.method2021(local127, local122, Static141.aClass13_27, local24);
									Static375.aBooleanArray13[local94] = true;
									Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
									if (Static148.aBoolean241) {
										if (arg9) {
											Static103.method1953(local54, local61, local49, local68);
										} else {
											Static242.method4112(local68, local54, local49, local61);
										}
									}
								}
								continue;
							}
							if (local24.anInt7972 == Static445.anInt7304) {
								if (local24.method6948(Static141.aClass13_27) != null) {
									Static236.method3793(local122, local127, local24);
									Static375.aBooleanArray13[local94] = true;
									Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
									if (Static148.aBoolean241) {
										if (arg9) {
											Static103.method1953(local54, local61, local49, local68);
										} else {
											Static242.method4112(local68, local54, local49, local61);
										}
									}
								}
								continue;
							}
							if (local24.anInt7972 == Static473.anInt7620) {
								Static639.method8763(Static141.aClass13_27, local24.anInt7914, Static173.anInterface2_7, local127, local122, local24.anInt7971);
								Static377.aBooleanArray14[local94] = true;
								Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
								continue;
							}
							if (Static430.anInt7139 == local24.anInt7972) {
								Static73.method8010(local24.anInt7971, Static141.aClass13_27, local122, local24.anInt7914, local127);
								Static377.aBooleanArray14[local94] = true;
								Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
								continue;
							}
							if (local24.anInt7972 == Static643.anInt10246) {
								if (!Static238.aBoolean585 && !Static60.aBoolean132) {
									continue;
								}
								local304 = local122 + local24.anInt7914;
								if (Static148.aBoolean241) {
									if (arg9) {
										Static103.method1953(local54, local61, local49, local68);
									} else {
										Static242.method4112(local68, local54, local49, local61);
									}
								}
								local309 = local127 + 15;
								if (Static238.aBoolean585) {
									local604 = -256;
									if (Static91.anInt2244 < 20) {
										local604 = -65536;
									}
									Static39.aClass37_1.method6071(local604, "Fps:" + Static91.anInt2244, local304, -1, local309);
									local309 += 15;
									@Pc(626) Runtime local626 = Runtime.getRuntime();
									local635 = (int) ((local626.totalMemory() - local626.freeMemory()) / 1024L);
									local637 = -256;
									if (local635 > 98304) {
										local637 = -65536;
										if (Static272.aBoolean375) {
											Static258.method4283();
											for (local650 = 0; local650 < 10; local650++) {
												System.gc();
											}
											local635 = (int) ((local626.totalMemory() - local626.freeMemory()) / 1024L);
											if (local635 > 65536) {
												Static601.method8468("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static39.aClass37_1.method6071(local637, "Mem:" + local635 + "k", local304, -1, local309);
									local309 += 15;
									Static39.aClass37_1.method6071(-256, "In:" + Static545.anInt8784 + "B/s Out:" + Static357.anInt6186 + "B/s", local304, -1, local309);
									local309 += 15;
									local650 = Static141.aClass13_27.E() / 1024;
									Static39.aClass37_1.method6071(local650 <= 65536 ? -256 : -65536, "Offheap:" + local650 + "k", local304, -1, local309);
									local309 += 15;
									local744 = 0;
									local746 = 0;
									@Pc(748) int local748 = 0;
									for (@Pc(750) int local750 = 0; local750 < 37; local750++) {
										if (Static59.aClass87_Sub1Array4[local750] != null) {
											local744 += Static59.aClass87_Sub1Array4[local750].method5185();
											local746 += Static59.aClass87_Sub1Array4[local750].method5180();
											local748 += Static59.aClass87_Sub1Array4[local750].method5183();
										}
									}
									@Pc(790) int local790 = local748 * 100 / local744;
									@Pc(796) int local796 = local746 * 10000 / local744;
									@Pc(816) String local816 = "Cache:" + Static176.method3032(2, 0, (long) local796, true) + "% (" + local790 + "%)";
									Static591.aClass37_12.method6071(-256, local816, local304, -1, local309);
									local309 += 12;
								}
								if (anInt7221 > 0) {
									Static591.aClass37_12.method6071(-256, "Particles: " + Static267.anInt5012 + " / " + anInt7221, local304, -1, local309);
								}
								local309 += 12;
								if (Static60.aBoolean132) {
									Static591.aClass37_12.method6071(-256, "Polys: " + Static141.aClass13_27.I() + " Models: " + Static141.aClass13_27.M(), local304, -1, local309);
									local309 += 12;
									Static591.aClass37_12.method6071(-256, "Ls: " + Static196.anInt3909 + " La: " + Static452.anInt7377 + " NPC: " + Static194.anInt3866 + " Pl: " + Static556.anInt9201, local304, -1, local309);
									Static34.method758();
									local309 += 12;
								}
								Static377.aBooleanArray14[local94] = true;
								continue;
							}
						}
						@Pc(977) Class2_Sub28 local977;
						if (local24.anInt7935 == 0) {
							if (Static384.anInt5395 == local24.anInt7972 && Static141.aClass13_27.method8093()) {
								Static141.aClass13_27.method8112(local122, local127, local24.anInt7914, local24.anInt7971);
							}
							method6317(local127 - local24.anInt7982, local293, local295, local198, local122 - local24.anInt7920, local24.anInt7962, local94, local206, arg8, arg9);
							if (local24.aClass303Array2 != null) {
								method6317(local127 - local24.anInt7982, local293, local295, local198, local122 - local24.anInt7920, local24.anInt7962, local94, local206, local24.aClass303Array2, arg9);
							}
							local977 = (Class2_Sub28) Static22.aClass323_4.method7484((long) local24.anInt7962);
							if (local977 != null) {
								Static452.method6429(local198, local977.anInt5454, local295, local122, local206, local127, local293, local94);
							}
							if (Static384.anInt5395 == local24.anInt7972 && Static141.aClass13_27.method8093()) {
								Static141.aClass13_27.method8150();
							}
							Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
						}
						if (Static205.aBooleanArray16[local94] || Static108.anInt2358 > 1) {
							if (local24.anInt7935 == 3) {
								if (local142 == 0) {
									if (local24.aBoolean571) {
										Static141.aClass13_27.aa(local122, local127, local24.anInt7914, local24.anInt7971, local24.anInt7947, 0);
									} else {
										Static141.aClass13_27.method8104(local122, local127, local24.anInt7914, local24.anInt7971, local24.anInt7947, 0);
									}
								} else if (local24.aBoolean571) {
									Static141.aClass13_27.aa(local122, local127, local24.anInt7914, local24.anInt7971, 255 - (local142 & 0xFF) << 24 | local24.anInt7947 & 0xFFFFFF, 1);
								} else {
									Static141.aClass13_27.method8104(local122, local127, local24.anInt7914, local24.anInt7971, 255 - (local142 & 0xFF) << 24 | local24.anInt7947 & 0xFFFFFF, 1);
								}
								if (Static148.aBoolean241) {
									if (arg9) {
										Static103.method1953(local54, local61, local49, local68);
									} else {
										Static242.method4112(local68, local54, local49, local61);
									}
								}
							} else {
								@Pc(1158) Class327 local1158;
								if (local24.anInt7935 == 4) {
									@Pc(1133) Class37 local1133 = local24.method6939(Static141.aClass13_27);
									if (local1133 != null) {
										local309 = local24.anInt7947;
										@Pc(1148) String local1148 = local24.aString80;
										if (local24.anInt7964 != -1) {
											local1158 = Static470.aClass250_1.method5960(local24.anInt7964);
											local1148 = local1158.aString86;
											if (local1148 == null) {
												local1148 = "null";
											}
											if ((local1158.anInt8756 == 1 || local24.anInt7927 != 1) && local24.anInt7927 != -1) {
												local1148 = "<col=ff9040>" + local1148 + "</col> x" + Static582.method8066(local24.anInt7927);
											}
										}
										if (local24.anInt7946 != -1) {
											local1148 = Static589.method8334(local24.anInt7946);
											if (local1148 == null) {
												local1148 = "";
											}
										}
										if (Static381.aClass303_23 == local24) {
											local1148 = Static573.aClass345_33.method7951(Static496.anInt7407);
											local309 = local24.anInt7947;
										}
										if (Static342.aBoolean426) {
											Static141.aClass13_27.T(local122, local127, local122 + local24.anInt7914, local127 + local24.anInt7971);
										}
										local1133.method6076(local24.anInt7938, (int[]) null, Static435.aClass31Array12, 0, local24.anInt7991, local24.anInt7989, local24.aBoolean572 ? 255 - (local142 & 0xFF) << 24 : -1, (Class1) null, 0, local122, local309 | 255 - (local142 & 0xFF) << 24, local24.anInt7971, local24.anInt7914, local24.anInt7978, local1148, local127);
										if (Static342.aBoolean426) {
											Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
										}
										if (local1148.trim().length() > 0) {
											if (!Static342.aBoolean426) {
												@Pc(1320) Class183 local1320 = Static258.method4281(local24.anInt7918, Static141.aClass13_27);
												local635 = local1320.method4452(local24.anInt7914, Static435.aClass31Array12, local1148);
												local637 = local1320.method4456(Static435.aClass31Array12, local1148, local24.anInt7914, local24.anInt7938);
												if (Static148.aBoolean241) {
													if (arg9) {
														Static103.method1953(local127, local635 + local122, local122, local127 + local637);
													} else {
														Static242.method4112(local127 + local637, local127, local122, local122 + local635);
													}
												}
											} else if (Static148.aBoolean241) {
												if (arg9) {
													Static103.method1953(local54, local61, local49, local68);
												} else {
													Static242.method4112(local68, local54, local49, local61);
												}
											}
										}
									} else if (Static393.aBoolean479) {
										Static514.method7103(local24);
									}
								} else {
									@Pc(1463) int local1463;
									if (local24.anInt7935 == 5) {
										if (local24.anInt7993 < 0) {
											@Pc(1409) Class31 local1409;
											if (local24.anInt7964 != -1) {
												@Pc(1391) Class284 local1391 = local24.aBoolean573 ? Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 : null;
												local1409 = Static470.aClass250_1.method5963(local24.anInt7964, Static141.aClass13_27, local1391, local24.anInt7927, local24.anInt8000 | 0xFF000000, local24.anInt7922, local24.anInt7932);
											} else if (local24.anInt7946 == -1) {
												local1409 = local24.method6940(Static141.aClass13_27);
											} else {
												local1409 = Static99.method1932(local24.anInt7946, Static141.aClass13_27);
											}
											if (local1409 != null) {
												local309 = local1409.method8788();
												local604 = local1409.method8807();
												local1463 = (local24.anInt7947 == 0 ? 16777215 : local24.anInt7947 & 0xFFFFFF) | 255 - (local142 & 0xFF) << 24;
												if (local24.aBoolean569) {
													Static141.aClass13_27.T(local122, local127, local122 + local24.anInt7914, local127 + local24.anInt7971);
													if (local24.anInt7929 != 0) {
														local635 = (local309 + local24.anInt7914 - 1) / local309;
														local637 = (local24.anInt7971 + local604 - 1) / local604;
														for (local650 = 0; local650 < local635; local650++) {
															for (local744 = 0; local744 < local637; local744++) {
																if (local24.anInt7947 == 0) {
																	local1409.method8809((float) local309 / 2.0F + (float) (local122 + local650 * local309), (float) local604 / 2.0F + (float) (local604 * local744 + local127), 4096, local24.anInt7929);
																} else {
																	local1409.method8790((float) local309 / 2.0F + (float) (local122 + local309 * local650), (float) (local127 + local604 * local744) + (float) local604 / 2.0F, 4096, local24.anInt7929, local1463);
																}
															}
														}
													} else if (local24.anInt7947 == 0 && local142 == 0) {
														local1409.method8810(local122, local127, local24.anInt7914, local24.anInt7971);
													} else {
														local1409.method8808(local122, local127, local24.anInt7914, local24.anInt7971, 0, local1463, 1);
													}
													Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
												} else if (local24.anInt7947 == 0 && local142 == 0) {
													if (local24.anInt7929 != 0) {
														local1409.method8809((float) local122 + (float) local24.anInt7914 / 2.0F, (float) local127 + (float) local24.anInt7971 / 2.0F, local24.anInt7914 * 4096 / local309, local24.anInt7929);
													} else if (local309 == local24.anInt7914 && local24.anInt7971 == local604) {
														local1409.method8793(local122, local127);
													} else {
														local1409.method8795(local122, local127, local24.anInt7914, local24.anInt7971);
													}
												} else if (local24.anInt7929 != 0) {
													local1409.method8790((float) local122 + (float) local24.anInt7914 / 2.0F, (float) local127 + (float) local24.anInt7971 / 2.0F, local24.anInt7914 * 4096 / local309, local24.anInt7929, local1463);
												} else if (local24.anInt7914 == local309 && local604 == local24.anInt7971) {
													local1409.method8796(local122, local127, 0, local1463, 1);
												} else {
													local1409.method8797(local122, local127, local24.anInt7914, local24.anInt7971, 0, local1463, 1);
												}
											} else if (Static393.aBoolean479) {
												Static514.method7103(local24);
											}
										} else {
											local24.method6941(Static405.aClass231_1, Static302.aClass181_1).method5320(0, local24.anInt7914, local122, local24.anInt7961 << 3, 0, local24.anInt7971, Static141.aClass13_27, local24.anInt7963 << 3, local127);
										}
										if (Static148.aBoolean241) {
											if (arg9) {
												Static103.method1953(local54, local61, local49, local68);
											} else {
												Static242.method4112(local68, local54, local49, local61);
											}
										}
									} else if (local24.anInt7935 == 6) {
										Static577.method8014();
										local977 = null;
										@Pc(1820) Class193 local1820 = null;
										local604 = 0;
										@Pc(1928) Class228 local1928;
										@Pc(1938) Class284 local1938;
										if (local24.anInt7964 != -1) {
											local1158 = Static470.aClass250_1.method5960(local24.anInt7964);
											if (local1158 != null) {
												local1158 = local1158.method7499(local24.anInt7927);
												local1928 = local24.anInt7931 == -1 ? null : Static479.aClass308_2.method7075(local24.anInt7931);
												local1938 = local24.aBoolean573 ? Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 : null;
												local1820 = local1158.method7500(local1928, Static141.aClass13_27, local1938, local24.anInt8005, local24.anInt7913, 1, 2048, local24.anInt7990);
												if (local1820 == null) {
													Static514.method7103(local24);
												} else {
													local604 = -local1820.fa() >> 1;
												}
											}
										} else if (local24.anInt7956 == 5) {
											local1463 = local24.anInt7992;
											if (local1463 >= 0 && local1463 < 2048) {
												@Pc(1981) Class16_Sub1_Sub1_Sub3_Sub2 local1981 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local1463];
												@Pc(1994) Class228 local1994 = local24.anInt7931 == -1 ? null : Static479.aClass308_2.method7075(local24.anInt7931);
												if (local1981 != null && (Static608.anInt10056 == local1463 || Static480.method6805(local1981.aString82) == local24.anInt7945)) {
													local1820 = local1981.aClass284_1.method6518(Static629.aClass177_2, 2048, 0, local24.anInt7913, local1994, local24.anInt8005, (Class148[]) null, Static137.aClass366_1, 0, Static6.aClass146_1, (Class228) null, -1, Static479.aClass308_2, (int[]) null, 0, Static470.aClass250_1, Static382.aClass282_1, Static141.aClass13_27, local24.anInt7990);
												}
											}
										} else if (local24.anInt7956 == 8 || local24.anInt7956 == 9) {
											@Pc(1916) Class2_Sub43 local1916 = Static95.method1915(false, local24.anInt7992);
											local1928 = local24.anInt7931 == -1 ? null : Static479.aClass308_2.method7075(local24.anInt7931);
											if (local1916 != null) {
												local1938 = local24.aBoolean573 ? Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 : null;
												local1820 = local1916.method7942(local24.anInt7913, Static141.aClass13_27, local1938, local24.anInt7956 == 9, local24.anInt8005, local24.anInt7990, local24.anInt7945, local1928);
											}
										} else if (local24.anInt7931 == -1) {
											local1820 = local24.method6945(local977, Static479.aClass308_2, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1, Static382.aClass282_1, -1, Static6.aClass146_1, Static470.aClass250_1, Static629.aClass177_2, 0, (Class228) null, 2048, -1, Static137.aClass366_1, Static141.aClass13_27);
											if (local1820 == null && Static393.aBoolean479) {
												Static514.method7103(local24);
											}
										} else {
											@Pc(1880) Class228 local1880 = Static479.aClass308_2.method7075(local24.anInt7931);
											local1820 = local24.method6945(local977, Static479.aClass308_2, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1, Static382.aClass282_1, local24.anInt8005, Static6.aClass146_1, Static470.aClass250_1, Static629.aClass177_2, local24.anInt7990, local1880, 2048, local24.anInt7913, Static137.aClass366_1, Static141.aClass13_27);
											if (local1820 == null && Static393.aBoolean479) {
												Static514.method7103(local24);
											}
										}
										if (local1820 != null) {
											if (local24.anInt7951 > 0) {
												local1463 = (local24.anInt7914 << 9) / local24.anInt7951;
											} else {
												local1463 = 512;
											}
											if (local24.anInt7957 > 0) {
												local635 = (local24.anInt7971 << 9) / local24.anInt7957;
											} else {
												local635 = 512;
											}
											local637 = local122 + local24.anInt7914 / 2;
											local650 = local24.anInt7971 / 2 + local127;
											if (!local24.aBoolean577) {
												local650 += local24.anInt7928 * local635 >> 9;
												local637 += local24.anInt7998 * local1463 >> 9;
											}
											Static46.aClass51_5.method6714();
											Static141.aClass13_27.method8138(Static46.aClass51_5);
											Static141.aClass13_27.DA(local637, local650, local1463, local635);
											Static141.aClass13_27.ya();
											if (local24.aBoolean563) {
												Static141.aClass13_27.C(false);
											}
											if (local24.aBoolean577) {
												Static113.aClass51_3.method6708(local24.anInt7997);
												Static113.aClass51_3.method6703(local24.anInt7967);
												Static113.aClass51_3.method6720(local24.anInt7937);
												Static113.aClass51_3.method6711(local24.anInt7998, local24.anInt7928, local24.anInt7977);
											} else {
												local744 = Class290.anIntArray546[local24.anInt7997 << 3] * (local24.anInt7960 << 2) >> 14;
												local746 = (local24.anInt7960 << 2) * Class290.anIntArray547[local24.anInt7997 << 3] >> 14;
												Static113.aClass51_3.method6718(-local24.anInt7937 << 3);
												Static113.aClass51_3.method6703(local24.anInt7967 << 3);
												Static113.aClass51_3.method6711(local24.anInt7975 << 2, (local24.anInt7939 << 2) + local744 + local604, (local24.anInt7939 << 2) + local746);
												Static113.aClass51_3.method6707(local24.anInt7997 << 3);
											}
											local24.method6933(Static389.anInt6694, local1820, Static113.aClass51_3, Static141.aClass13_27);
											if (Static342.aBoolean426) {
												Static141.aClass13_27.T(local122, local127, local24.anInt7914 + local122, local24.anInt7971 + local127);
											}
											if (local24.aBoolean577) {
												if (local24.aBoolean575) {
													local1820.method6622(Static113.aClass51_3, (Class16_Sub10) null, local24.anInt7960, 1);
												} else {
													local1820.method6612(Static113.aClass51_3, (Class16_Sub10) null, 1);
													if (local24.aClass16_Sub7_7 != null) {
														Static141.aClass13_27.method8101(local24.aClass16_Sub7_7.method5992());
													}
												}
											} else if (local24.aBoolean575) {
												local1820.method6622(Static113.aClass51_3, (Class16_Sub10) null, local24.anInt7960 << 2, 1);
											} else {
												local1820.method6612(Static113.aClass51_3, (Class16_Sub10) null, 1);
												if (local24.aClass16_Sub7_7 != null) {
													Static141.aClass13_27.method8101(local24.aClass16_Sub7_7.method5992());
												}
											}
											if (Static342.aBoolean426) {
												Static141.aClass13_27.KA(arg3, arg7, arg1, arg2);
											}
											if (local24.aBoolean563) {
												Static141.aClass13_27.C(true);
											}
										}
										if (Static148.aBoolean241) {
											if (arg9) {
												Static103.method1953(local54, local61, local49, local68);
											} else {
												Static242.method4112(local68, local54, local49, local61);
											}
										}
									} else if (local24.anInt7935 == 9) {
										if (local24.aBoolean565) {
											local309 = local127 + local24.anInt7971;
											local604 = local24.anInt7914 + local122;
											local1463 = local127;
										} else {
											local309 = local127;
											local604 = local24.anInt7914 + local122;
											local1463 = local127 + local24.anInt7971;
										}
										if (local24.anInt7974 == 1) {
											Static141.aClass13_27.method8090(local122, local309, local604, local1463, local24.anInt7947, 0);
										} else {
											Static141.aClass13_27.method8115(local122, local309, local604, local1463, local24.anInt7947, local24.anInt7974);
										}
										if (Static148.aBoolean241) {
											if (arg9) {
												Static103.method1953(local54, local61, local49, local68);
											} else {
												Static242.method4112(local68, local54, local49, local61);
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

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V")
	public static void method6318() {
		if (!Static405.aBoolean494) {
			Static383.aFloat185 += (24.0F - Static383.aFloat185) / 2.0F;
			Static583.aBoolean679 = true;
			Static405.aBoolean494 = true;
		}
	}
}
