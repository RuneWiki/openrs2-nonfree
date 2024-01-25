import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_8 = new Class66(30);

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString55 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString56 = "Members object";

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIII)V")
	public static void method848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg0 << 1) - 3) * local25;
		@Pc(77) int local77 = local55;
		Static247.method3552(arg1, arg2 - arg4, Static332.anIntArrayArray56[arg3], arg2 + arg4);
		@Pc(104) int local104 = local51 * (arg0 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local77;
					local77 += local55;
					local7++;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local63 += local55;
				local7++;
				local77 += local55;
			}
			local47 += -local71;
			local38 += -local104;
			local104 -= local51;
			local9--;
			local71 -= local51;
			@Pc(177) int local177 = arg3 - local9;
			@Pc(181) int local181 = local9 + arg3;
			@Pc(185) int local185 = local7 + arg2;
			@Pc(190) int local190 = arg2 - local7;
			Static247.method3552(arg1, local190, Static332.anIntArrayArray56[local177], local185);
			Static247.method3552(arg1, local190, Static332.anIntArrayArray56[local181], local185);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lclient!jf;I)V")
	public static void method849(@OriginalArg(1) Class96[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class96 local17 = arg0[local11];
			if (local17 != null) {
				if (local17.anInt2933 == 0) {
					if (local17.aClass96Array1 != null) {
						method849(local17.aClass96Array1, arg1);
					}
					@Pc(41) Class5_Sub40 local41 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local17.anInt2877);
					if (local41 != null) {
						Static55.method1183(arg1, local41.anInt6233);
					}
				}
				@Pc(57) Class5_Sub12 local57;
				if (arg1 == 0 && local17.anObjectArray8 != null) {
					local57 = new Class5_Sub12();
					local57.aClass96_4 = local17;
					local57.anObjectArray3 = local17.anObjectArray8;
					Static223.method3891(local57);
				}
				if (arg1 == 1 && local17.anObjectArray6 != null) {
					if (local17.anInt2914 >= 0) {
						@Pc(85) Class96 local85 = Static121.method2396(local17.anInt2877);
						if (local85 == null || local85.aClass96Array1 == null || local85.aClass96Array1.length <= local17.anInt2914 || local85.aClass96Array1[local17.anInt2914] != local17) {
							continue;
						}
					}
					local57 = new Class5_Sub12();
					local57.aClass96_4 = local17;
					local57.anObjectArray3 = local17.anObjectArray6;
					Static223.method3891(local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method850() {
		Static288.method4915();
		Static100.method2025();
		Static285.method5100();
		Static8.method241();
		Static77.method1721();
		Static90.method3835();
		Static10.method304();
		Static280.method4736();
		Static29.method724();
		Static191.method5173();
		Static173.method3940();
		Static52.method1170();
		Static189.method3469();
		Static342.method5674();
		Static116.method2283();
		Static55.method1185();
		Static91.method1966();
		Static116.method2282();
		Static118.method2322();
		Static147.method2740();
		Static207.method3699();
		Static255.method4438();
		Static163.method3009();
		Static21.aClass66_102.method1944(5);
		Static259.aClass66_57.method1944(5);
		Static95.aClass66_105.method1944(5);
		Static156.aClass66_54.method1944(5);
		Static223.aClass66_77.method1944(5);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method852() {
		Static42.aClass66_13.method1933();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIII[Lclient!jf;III)V")
	public static void method853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class96[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
		for (@Pc(13) int local13 = 0; local13 < arg5.length; local13++) {
			@Pc(19) Class96 local19 = arg5[local13];
			if (local19 != null && (local19.anInt2929 == arg6 || arg6 == -1412584499 && local19 == Static287.aClass96_16)) {
				@Pc(59) int local59;
				if (arg1 == -1) {
					Class5_Sub3.aRectangleArray3[Static169.anInt3450].setBounds(local19.anInt2893 + arg8, arg2 + local19.anInt2951, local19.anInt2943, local19.anInt2916);
					local59 = Static169.anInt3450++;
				} else {
					local59 = arg1;
				}
				local19.anInt2880 = Static180.anInt3606;
				local19.anInt2964 = local59;
				if (!local19.aBoolean197 || !Static43.method974(local19)) {
					if (local19.anInt2935 > 0) {
						Static5.method172(local19);
					}
					@Pc(87) int local87 = local19.anInt2893 + arg8;
					@Pc(93) int local93 = local19.anInt2951 + arg2;
					@Pc(96) int local96 = local19.anInt2952;
					if (Static213.aBoolean311 && (Static43.method975(local19).anInt1281 != 0 || local19.anInt2933 == 0) && local96 > 127) {
						local96 = 127;
					}
					@Pc(141) int local141;
					@Pc(147) int local147;
					if (Static287.aClass96_16 == local19) {
						if (arg6 != -1412584499 && !local19.aBoolean207) {
							Static34.anInt904 = arg2;
							Static295.aClass96Array2 = arg5;
							Static125.anInt2612 = arg8;
							continue;
						}
						if (Static203.aBoolean279 && Static10.aBoolean13) {
							local141 = Static270.anInt5171;
							local141 -= Static25.anInt606;
							local147 = Static274.anInt5378;
							local147 -= Static42.anInt1007;
							if (Static311.anInt6465 > local141) {
								local141 = Static311.anInt6465;
							}
							if (Static311.anInt6465 + Static232.aClass96_15.anInt2943 < local19.anInt2943 + local141) {
								local141 = Static311.anInt6465 + Static232.aClass96_15.anInt2943 - local19.anInt2943;
							}
							if (local147 < Static353.anInt6608) {
								local147 = Static353.anInt6608;
							}
							local87 = local141;
							if (Static232.aClass96_15.anInt2916 + Static353.anInt6608 < local19.anInt2916 + local147) {
								local147 = Static232.aClass96_15.anInt2916 + Static353.anInt6608 - local19.anInt2916;
							}
							local93 = local147;
						}
						if (!local19.aBoolean207) {
							local96 = 128;
						}
					}
					@Pc(267) int local267;
					@Pc(274) int local274;
					@Pc(227) int local227;
					@Pc(232) int local232;
					if (local19.anInt2933 == 2) {
						local274 = arg7;
						local267 = arg0;
						local147 = arg3;
						local141 = arg4;
					} else {
						local227 = local87 + local19.anInt2943;
						local232 = local19.anInt2916 + local93;
						local141 = local87 > arg4 ? local87 : arg4;
						local147 = local93 > arg3 ? local93 : arg3;
						if (local19.anInt2933 == 9) {
							local232++;
							local227++;
						}
						local267 = arg0 <= local227 ? arg0 : local227;
						local274 = local232 < arg7 ? local232 : arg7;
					}
					if (!local19.aBoolean197 || local141 < local267 && local147 < local274) {
						@Pc(501) int local501;
						@Pc(554) int local554;
						@Pc(556) int local556;
						@Pc(558) int local558;
						@Pc(560) int local560;
						@Pc(604) int local604;
						@Pc(503) int local503;
						@Pc(530) int local530;
						if (local19.anInt2935 != 0) {
							if (local19.anInt2935 == 1337 || local19.anInt2935 == 1403) {
								Static77.method1720(local93, local19.anInt2916, local19.anInt2943, local87, local19.anInt2935 == 1403);
								Static293.aBooleanArray25[local59] = true;
								Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
								continue;
							}
							if (local19.anInt2935 == 1338) {
								if (local19.method2702(Static15.aClass59_1) != null) {
									Static153.method2894();
									Static16.method524(local19, Static15.aClass59_1, local87, local93);
									Static39.aBooleanArray3[local59] = true;
									Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
								}
								continue;
							}
							if (local19.anInt2935 == 1339) {
								if (local19.method2702(Static15.aClass59_1) != null) {
									Static19.method555(local87, local93, local19);
									Static39.aBooleanArray3[local59] = true;
									Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
								}
								continue;
							}
							if (local19.anInt2935 == 1400) {
								Static224.method3896(Static15.aClass59_1, local19.anInt2916, local93, Static112.anInterface1_2, local87, local19.anInt2943);
								Static293.aBooleanArray25[local59] = true;
								Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
								continue;
							}
							if (local19.anInt2935 == 1401) {
								Static54.method1179(local19.anInt2916, local93, Static15.aClass59_1, local19.anInt2943, local87);
								Static293.aBooleanArray25[local59] = true;
								Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
								continue;
							}
							if (local19.anInt2935 == 1405) {
								if (!Static336.aBoolean407 && !Static29.aBoolean57) {
									continue;
								}
								local227 = local87 + local19.anInt2943;
								local232 = local93 + 15;
								if (Static336.aBoolean407) {
									Static62.aClass91_3.method5306(local227, -256, local232, "Fps:" + Static236.anInt4586);
									local232 += 15;
									@Pc(491) Runtime local491 = Runtime.getRuntime();
									local501 = (int) ((local491.totalMemory() - local491.freeMemory()) / 1024L);
									local503 = -256;
									if (local501 > 65536) {
										local503 = -65536;
									}
									Static62.aClass91_3.method5306(local227, local503, local232, "Mem:" + local501 + "k");
									local232 += 15;
									local530 = Static15.aClass59_1.method4880() / 1024;
									Static62.aClass91_3.method5306(local227, local530 > 65536 ? -65536 : -256, local232, "Offheap:" + local530 + "k");
									local232 += 15;
									local554 = 0;
									local556 = 0;
									local558 = 0;
									for (local560 = 0; local560 < 29; local560++) {
										local554 += Static277.aClass159_Sub1Array1[local560].method4076();
										local556 += Static277.aClass159_Sub1Array1[local560].method4081();
										local558 += Static277.aClass159_Sub1Array1[local560].method4078();
									}
									@Pc(598) int local598 = local558 * 100 / local554;
									local604 = local556 * 10000 / local554;
									@Pc(624) String local624 = "Cache:" + Static247.method3550(true, (long) local604, 2, 0) + "% (" + local598 + "%)";
									Static247.aClass91_9.method5306(local227, -256, local232, local624);
									local232 += 12;
								}
								if (Static336.anInt5416 > 0) {
									Static247.aClass91_9.method5306(local227, -256, local232, "Particles: " + Static230.anInt4514 + " / " + Static336.anInt5416);
								}
								local232 += 12;
								if (Static29.aBoolean57) {
									Static247.aClass91_9.method5306(local227, -256, local232, "Polys: " + Static15.aClass59_1.method4853() + " Models: " + Static15.aClass59_1.method4800());
									local232 += 12;
									Static247.aClass91_9.method5306(local227, -256, local232, "Ls: " + Static241.anInt4696 + " La: " + Static151.anInt3087 + " NPC: " + Static122.anInt2587 + " Pl: " + Static247.anInt3873);
									Static86.method1935();
									local232 += 12;
								}
								Static293.aBooleanArray25[local59] = true;
								continue;
							}
						}
						if (local19.anInt2933 == 0) {
							if (!local19.aBoolean197 && Static43.method974(local19) && Static287.aClass96_17 != local19) {
								continue;
							}
							if (!local19.aBoolean197) {
								if (local19.anInt2904 > local19.anInt2965 - local19.anInt2916) {
									local19.anInt2904 = local19.anInt2965 - local19.anInt2916;
								}
								if (local19.anInt2904 < 0) {
									local19.anInt2904 = 0;
								}
							}
							if (local19.anInt2935 == 1407 && Static15.aClass59_1.method4844()) {
								Static15.aClass59_1.method4866(local87, local93, local19.anInt2943, local19.anInt2916);
							}
							method853(local267, local59, local93 - local19.anInt2904, local147, local141, arg5, local19.anInt2877, local274, local87 - local19.anInt2918);
							if (local19.aClass96Array1 != null) {
								method853(local267, local59, local93 - local19.anInt2904, local147, local141, local19.aClass96Array1, local19.anInt2877, local274, local87 - local19.anInt2918);
							}
							@Pc(826) Class5_Sub40 local826 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local19.anInt2877);
							if (local826 != null) {
								Static344.method949(local141, local147, local826.anInt6233, local59, local87, local274, local93, local267);
							}
							if (local19.anInt2935 == 1407 && Static15.aClass59_1.method4844()) {
								Static15.aClass59_1.method4871();
								Static256.aBoolean382 = true;
							}
							Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
						}
						if (Static177.aBooleanArray9[local59] || Static138.anInt2773 > 1) {
							if (local19.anInt2933 == 0 && !local19.aBoolean197 && local19.anInt2916 < local19.anInt2965) {
								Static94.method1995(local19.anInt2904, local93, local19.anInt2965, local19.anInt2916, local19.anInt2943 + local87);
							}
							if (local19.anInt2933 != 1) {
								@Pc(909) int local909;
								if (local19.anInt2933 == 2) {
									local227 = 0;
									for (local232 = 0; local232 < local19.anInt2900; local232++) {
										for (local909 = 0; local909 < local19.anInt2901; local909++) {
											local501 = local909 * (local19.anInt2890 + 32) + local87;
											local503 = local93 + local232 * (local19.anInt2875 + 32);
											if (local227 < 20) {
												local503 += local19.anIntArray190[local227];
												local501 += local19.anIntArray184[local227];
											}
											if (local19.anIntArray191[local227] > 0) {
												local556 = local19.anIntArray191[local227] - 1;
												if (arg4 < local501 + 32 && arg0 > local501 && local503 + 32 > arg3 && local503 < arg7 || Static47.aClass96_2 == local19 && local227 == Static28.anInt774) {
													@Pc(1045) Class54 local1045;
													if (Static100.anInt2199 == 1 && Static229.anInt4484 == local227 && local19.anInt2877 == Static51.anInt1288) {
														local1045 = Static193.method3496(2, 0, Static15.aClass59_1, local19.anInt2895, local556, null, local19.anIntArray195[local227]);
													} else {
														local1045 = Static193.method3496(1, -13623264, Static15.aClass59_1, local19.anInt2895, local556, null, local19.anIntArray195[local227]);
													}
													if (local1045 == null) {
														Static336.method4719(local19);
													} else if (local19 == Static47.aClass96_2 && local227 == Static28.anInt774) {
														local554 = Static274.anInt5378 - Static246.anInt4800;
														local530 = Static270.anInt5171 - Static353.anInt6602;
														if (local554 < 5 && local554 > -5) {
															local554 = 0;
														}
														if (local530 < 5 && local530 > -5) {
															local530 = 0;
														}
														if (Static244.anInt4736 < 5) {
															local530 = 0;
															local554 = 0;
														}
														local1045.method5575(local501 + local530, local554 + local503, 0, -2013265920);
														if (arg6 != -1) {
															@Pc(1140) Class96 local1140 = arg5[arg6 & 0xFFFF];
															@Pc(1143) int[] local1143 = new int[4];
															Static15.aClass59_1.method4817(local1143);
															local604 = local1143[1];
															@Pc(1154) int local1154 = local1143[3];
															@Pc(1176) int local1176;
															if (local604 > local503 + local554 && local1140.anInt2904 > 0) {
																local1176 = (local604 - local503 - local554) * Static346.anInt6449 / 3;
																if (Static346.anInt6449 * 10 < local1176) {
																	local1176 = Static346.anInt6449 * 10;
																}
																if (local1140.anInt2904 < local1176) {
																	local1176 = local1140.anInt2904;
																}
																Static246.anInt4800 += local1176;
																local1140.anInt2904 -= local1176;
																Static336.method4719(local1140);
															}
															if (local1154 < local554 + local503 + 32 && local1140.anInt2965 - local1140.anInt2916 > local1140.anInt2904) {
																local1176 = (local503 + local554 + 32 - local1154) * Static346.anInt6449 / 3;
																if (Static346.anInt6449 * 10 < local1176) {
																	local1176 = Static346.anInt6449 * 10;
																}
																if (local1140.anInt2965 - local1140.anInt2916 - local1140.anInt2904 < local1176) {
																	local1176 = local1140.anInt2965 - local1140.anInt2916 - local1140.anInt2904;
																}
																Static246.anInt4800 -= local1176;
																local1140.anInt2904 += local1176;
																Static336.method4719(local1140);
															}
														}
													} else if (local19 == Static72.aClass96_6 && local227 == Static62.anInt1439) {
														local1045.method5575(local501, local503, 0, -2013265920);
													} else {
														local1045.method5569(local501, local503);
													}
												}
											} else if (local19.anIntArray185 != null && local227 < 20) {
												@Pc(965) Class54 local965 = local19.method2700(Static15.aClass59_1, local227);
												if (local965 != null) {
													local965.method5569(local501, local503);
												} else if (Static137.aBoolean153) {
													Static336.method4719(local19);
												}
											}
											local227++;
										}
									}
								} else if (local19.anInt2933 == 3) {
									if (Static302.method5141(local19)) {
										local227 = local19.anInt2881;
										if (local19 == Static287.aClass96_17 && local19.anInt2878 != 0) {
											local227 = local19.anInt2878;
										}
									} else {
										local227 = local19.anInt2911;
										if (Static287.aClass96_17 == local19 && local19.anInt2889 != 0) {
											local227 = local19.anInt2889;
										}
									}
									if (local96 == 0) {
										if (local19.aBoolean195) {
											Static15.aClass59_1.method4877(local87, local93, local19.anInt2943, local19.anInt2916, local227, 0);
										} else {
											Static15.aClass59_1.method4851(local87, local93, local19.anInt2943, local19.anInt2916, local227, 0);
										}
									} else if (local19.aBoolean195) {
										Static15.aClass59_1.method4877(local87, local93, local19.anInt2943, local19.anInt2916, 255 - (local96 & 0xFF) << 24 | local227 & 0xFFFFFF, 1);
									} else {
										Static15.aClass59_1.method4851(local87, local93, local19.anInt2943, local19.anInt2916, 255 - (local96 & 0xFF) << 24 | local227 & 0xFFFFFF, 1);
									}
								} else {
									@Pc(1453) Class91 local1453;
									if (local19.anInt2933 == 4) {
										local1453 = local19.method2694(Static15.aClass59_1);
										if (local1453 != null) {
											@Pc(1465) String local1465 = local19.aString187;
											if (Static302.method5141(local19)) {
												local232 = local19.anInt2881;
												if (local19 == Static287.aClass96_17 && local19.anInt2878 != 0) {
													local232 = local19.anInt2878;
												}
												if (local19.aString189.length() > 0) {
													local1465 = local19.aString189;
												}
											} else {
												local232 = local19.anInt2911;
												if (local19 == Static287.aClass96_17 && local19.anInt2889 != 0) {
													local232 = local19.anInt2889;
												}
											}
											if (local19.aBoolean197 && local19.anInt2969 != -1) {
												@Pc(1522) Class165 local1522 = Static88.method1382(local19.anInt2969);
												local1465 = local1522.aString291;
												if (local1465 == null) {
													local1465 = "null";
												}
												if ((local1522.anInt4953 == 1 || local19.anInt2879 != 1) && local19.anInt2879 != -1) {
													local1465 = "<col=ff9040>" + local1465 + "</col> x" + Static29.method721(local19.anInt2879);
												}
											}
											if (Static323.aClass96_20 == local19) {
												local1465 = Static214.aString245;
												local232 = local19.anInt2911;
											}
											if (!local19.aBoolean197) {
												local1465 = Static104.method2064(local19, local1465);
											}
											if (Static123.aBoolean176) {
												Static15.aClass59_1.method4829(local87, local93, local87 + local19.anInt2943, local93 - -local19.anInt2916);
											}
											local1453.method5296(0, local19.anInt2916, local93, local19.anInt2923, null, local1465, local232 | 0xFF000000, local19.anInt2953, null, local87, local19.anInt2910, local19.anInt2943, 0, Static29.aClass54Array1, local19.aBoolean196 ? -16777216 : -1);
											if (Static123.aBoolean176) {
												Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
											}
										} else if (Static137.aBoolean153) {
											Static336.method4719(local19);
										}
									} else if (local19.anInt2933 == 5) {
										@Pc(1676) Class54 local1676;
										if (!local19.aBoolean197) {
											local1676 = local19.method2693(Static15.aClass59_1, Static302.method5141(local19));
											if (local1676 != null) {
												local1676.method5569(local87, local93);
											} else if (Static137.aBoolean153) {
												Static336.method4719(local19);
											}
										} else if (local19.anInt2885 < 0) {
											if (local19.anInt2969 == -1) {
												local1676 = local19.method2693(Static15.aClass59_1, false);
											} else {
												@Pc(1659) Class61 local1659 = local19.aBoolean208 ? Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1 : null;
												local1676 = Static193.method3496(local19.anInt2938, local19.anInt2948 | 0xFF000000, Static15.aClass59_1, local19.anInt2895, local19.anInt2969, local1659, local19.anInt2879);
											}
											if (local1676 != null) {
												local232 = local1676.method5560();
												local909 = local1676.method5576();
												if (local19.aBoolean203) {
													Static15.aClass59_1.method4829(local87, local93, local19.anInt2943 + local87, local93 - -local19.anInt2916);
													if (local19.anInt2884 != 0) {
														local501 = (local232 + local19.anInt2943 - 1) / local232;
														local503 = (local909 + local19.anInt2916 - 1) / local909;
														for (local530 = 0; local530 < local501; local530++) {
															for (local554 = 0; local554 < local503; local554++) {
																local1676.method5579((float) (local87 + local530 * local232) + (float) local232 / 2.0F, (float) local909 / 2.0F + (float) (local93 + local554 * local909), 4096, local19.anInt2884);
															}
														}
													} else if (local96 == 0) {
														local1676.method5568(local87, local93, local19.anInt2943, local19.anInt2916, 0, 0);
													} else {
														local1676.method5568(local87, local93, local19.anInt2943, local19.anInt2916, 1, 255 - (local96 & 0xFF) << 24 | 0xFFFFFF);
													}
													Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
												} else if (local96 != 0) {
													local501 = 255 - (local96 & 0xFF) << 24 | 0xFFFFFF;
													if (local19.anInt2884 != 0) {
														local1676.method5571((float) local19.anInt2943 / 2.0F + (float) local87, (float) local19.anInt2916 / 2.0F + (float) local93, local19.anInt2943 * 4096 / local232, local19.anInt2884, local501);
													} else if (local232 == local19.anInt2943 && local909 == local19.anInt2916) {
														local1676.method5575(local87, local93, 1, local501);
													} else {
														local1676.method5573(local87, local93, local19.anInt2943, local19.anInt2916, 1, local501, 1);
													}
												} else if (local19.anInt2884 != 0) {
													local1676.method5579((float) local19.anInt2943 / 2.0F + (float) local87, (float) local93 + (float) local19.anInt2916 / 2.0F, local19.anInt2943 * 4096 / local232, local19.anInt2884);
												} else if (local19.anInt2943 == local232 && local19.anInt2916 == local909) {
													local1676.method5569(local87, local93);
												} else {
													local1676.method5578(local87, local93, local19.anInt2943, local19.anInt2916);
												}
											} else if (Static137.aBoolean153) {
												Static336.method4719(local19);
											}
										} else {
											local19.method2707().method3484(Static15.aClass59_1, local19.anInt2943, local19.anInt2916, local19.anInt2939 << 3, local87, 0, 0, local93, local19.anInt2919 << 3);
										}
									} else {
										@Pc(2267) Class165 local2267;
										if (local19.anInt2933 == 6) {
											@Pc(2037) boolean local2037 = Static302.method5141(local19);
											if (local2037) {
												local232 = local19.anInt2936;
											} else {
												local232 = local19.anInt2888;
											}
											Static94.method1992();
											@Pc(2053) Class101 local2053 = null;
											local501 = 0;
											@Pc(2238) Class61 local2238;
											@Pc(2228) Class17 local2228;
											if (local19.anInt2969 != -1) {
												local2267 = Static88.method1382(local19.anInt2969);
												if (local2267 != null) {
													local2267 = local2267.method4421(local19.anInt2879);
													local2228 = local232 == -1 ? null : Static261.method4492(local232);
													local2238 = local19.aBoolean208 ? Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1 : null;
													local2053 = local2267.method4428(1024, 1, local19.anInt2892, local19.anInt2906, local2238, Static15.aClass59_1, local19.anInt2950, local2228);
													if (local2053 == null) {
														Static336.method4719(local19);
													} else {
														local501 = -local2053.method5147() / 2;
													}
												}
											} else if (local19.anInt2958 == 5) {
												if (local19.anInt2925 == -1) {
													local2053 = Static210.aClass61_3.method1715(null, -1, 0, null, -1, 1024, -1, -1, null, 0, Static15.aClass59_1);
												} else {
													local503 = local19.anInt2925;
													@Pc(2081) Class25_Sub1_Sub1_Sub1 local2081;
													if (Static99.anInt2186 == local503) {
														local2081 = Static85.aClass25_Sub1_Sub1_Sub1_1;
													} else {
														local2081 = Static312.aClass25_Sub1_Sub1_Sub1Array1[local503];
													}
													@Pc(2095) Class17 local2095 = local232 == -1 ? null : Static261.method4492(local232);
													if (local2081 != null && (local503 == 2047 || Static297.method5044(local2081.aString237) == local19.anInt2957)) {
														local2053 = local2081.aClass61_1.method1715(local2095, local19.anInt2906, local19.anInt2892, null, -1, 1024, 0, local19.anInt2950, null, 0, Static15.aClass59_1);
													}
												}
											} else if (local19.anInt2958 == 8 || local19.anInt2958 == 9) {
												@Pc(2218) Class5_Sub19 local2218 = Static79.method1757(local19.anInt2925);
												local2228 = local232 == -1 ? null : Static261.method4492(local232);
												if (local2218 != null) {
													local2238 = local19.aBoolean208 ? Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1 : null;
													local2053 = local2218.method2149(local19.anInt2957, local19.anInt2950, local19.anInt2958 == 9, Static15.aClass59_1, local2228, local2238, local19.anInt2906, local19.anInt2892);
												}
											} else if (local232 == -1) {
												local2053 = local19.method2691(Static15.aClass59_1, 1024, null, 0, Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1, -1, -1, local2037);
												if (local2053 == null && Static137.aBoolean153) {
													Static336.method4719(local19);
												}
											} else {
												@Pc(2189) Class17 local2189 = Static261.method4492(local232);
												local2053 = local19.method2691(Static15.aClass59_1, 1024, local2189, local19.anInt2892, Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1, local19.anInt2906, local19.anInt2950, local2037);
												if (local2053 == null && Static137.aBoolean153) {
													Static336.method4719(local19);
												}
											}
											if (local2053 != null) {
												if (local19.anInt2931 <= 0) {
													local503 = 512;
												} else {
													local503 = (local19.anInt2943 << 9) / local19.anInt2931;
												}
												if (local19.anInt2898 > 0) {
													local530 = (local19.anInt2916 << 9) / local19.anInt2898;
												} else {
													local530 = 512;
												}
												local554 = (local503 * local19.anInt2902 >> 9) + local87 + local19.anInt2943 / 2;
												local556 = local93 + local19.anInt2916 / 2 + (local530 * local19.anInt2944 >> 9);
												Static110.aClass112_2.method3591();
												Static15.aClass59_1.method4787(Static110.aClass112_2);
												local558 = local19.anInt2920 * Class5_Sub9_Sub12.anIntArray169[local19.anInt2886 << 3] >> 15;
												local560 = local19.anInt2920 * Class5_Sub9_Sub12.anIntArray170[local19.anInt2886 << 3] >> 15;
												Static15.aClass59_1.method4869(local554, local556, local503, local530);
												Static15.aClass59_1.method4859((float) local19.aShort34, local19.aBoolean199 ? (float) local19.aShort33 : (float) local19.aShort33 * 1.5F);
												if (Static256.aBoolean382) {
													Static15.aClass59_1.method4810();
													Static15.aClass59_1.method4860();
													Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
													Static256.aBoolean382 = false;
												}
												if (local19.aBoolean198) {
													Static15.aClass59_1.method4825(false);
												}
												if (local19.aBoolean197) {
													Static353.aClass112_5.method3588(-local19.anInt2891 << 3);
													Static353.aClass112_5.method3597(local19.anInt2927 << 3);
													Static353.aClass112_5.method3584(local19.anInt2908, local501 + local558 + local19.anInt2932, local19.anInt2932 + local560);
												} else {
													Static353.aClass112_5.method3595(local19.anInt2927 << 3);
													Static353.aClass112_5.method3584(0, local558, local560);
												}
												Static353.aClass112_5.method3585(local19.anInt2886 << 3);
												if (Static123.aBoolean176) {
													Static15.aClass59_1.method4829(local87, local93, local87 + local19.anInt2943, local93 - -local19.anInt2916);
												}
												if (local19.aBoolean199) {
													local2053.method5151(Static353.aClass112_5, null, local19.anInt2920);
												} else {
													local2053.method5172(Static353.aClass112_5, null, 1);
												}
												if (Static123.aBoolean176) {
													Static15.aClass59_1.method4795(arg4, arg3, arg0, arg7);
												}
												if (local19.aBoolean198) {
													Static15.aClass59_1.method4825(true);
												}
											}
										} else {
											if (local19.anInt2933 == 7) {
												local1453 = local19.method2694(Static15.aClass59_1);
												if (local1453 == null) {
													if (Static137.aBoolean153) {
														Static336.method4719(local19);
													}
													continue;
												}
												local232 = 0;
												for (local909 = 0; local909 < local19.anInt2900; local909++) {
													for (local501 = 0; local501 < local19.anInt2901; local501++) {
														if (local19.anIntArray191[local232] > 0) {
															local2267 = Static88.method1382(local19.anIntArray191[local232] - 1);
															@Pc(2625) String local2625;
															if (local2267.anInt4953 != 1 && local19.anIntArray195[local232] == 1) {
																local2625 = "<col=ff9040>" + local2267.aString291 + "</col>";
															} else {
																local2625 = "<col=ff9040>" + local2267.aString291 + "</col> x" + Static29.method721(local19.anIntArray195[local232]);
															}
															local554 = local87 + (local19.anInt2890 + 115) * local501;
															local556 = (local19.anInt2875 + 12) * local909 + local93;
															if (local19.anInt2910 == 0) {
																local1453.method5303(local2625, local19.aBoolean196 ? -16777216 : -1, local19.anInt2911 | 0xFF000000, null, local556, local554, Static29.aClass54Array1);
															} else if (local19.anInt2910 == 1) {
																local1453.method5311(null, local19.aBoolean196 ? -16777216 : -1, local2625, Static29.aClass54Array1, local19.anInt2911 | 0xFF000000, local556, local554 + 57);
															} else {
																local1453.method5314(Static29.aClass54Array1, local19.anInt2911 | 0xFF000000, local2625, local556, local19.aBoolean196 ? -16777216 : -1, local554 + 114, null);
															}
														}
														local232++;
													}
												}
											}
											if (local19.anInt2933 == 8 && local19 == Static347.aClass96_21 && Static31.anInt824 == Static184.anInt6249) {
												local227 = 0;
												local232 = 0;
												@Pc(2773) Class91 local2773 = Static62.aClass91_3;
												@Pc(2776) String local2776 = local19.aString187;
												local2776 = Static104.method2064(local19, local2776);
												@Pc(2798) String local2798;
												while (local2776.length() > 0) {
													local530 = local2776.indexOf("<br>");
													if (local530 == -1) {
														local2798 = local2776;
														local2776 = "";
													} else {
														local2798 = local2776.substring(0, local530);
														local2776 = local2776.substring(local530 + 4);
													}
													local554 = Static282.aClass138_7.method3725(local2798);
													if (local227 < local554) {
														local227 = local554;
													}
													local232 += Static282.aClass138_7.anInt4172 + 1;
												}
												local227 += 6;
												local232 += 7;
												local530 = local19.anInt2943 + local87 - local227 - 5;
												local554 = local93 + local19.anInt2916 + 5;
												if (local87 + 5 > local530) {
													local530 = local87 + 5;
												}
												if (arg0 < local227 + local530) {
													local530 = arg0 - local227;
												}
												if (arg7 < local232 + local554) {
													local554 = arg7 - local232;
												}
												Static15.aClass59_1.method4877(local530, local554, local227, local232, -96, 0);
												Static15.aClass59_1.method4851(local530, local554, local227, local232, -16777216, 0);
												local2776 = local19.aString187;
												local556 = Static282.aClass138_7.anInt4172 + local554 + 2;
												local2776 = Static104.method2064(local19, local2776);
												while (local2776.length() > 0) {
													local558 = local2776.indexOf("<br>");
													if (local558 == -1) {
														local2798 = local2776;
														local2776 = "";
													} else {
														local2798 = local2776.substring(0, local558);
														local2776 = local2776.substring(local558 + 4);
													}
													local2773.method5300(-1, local556, local2798, -16777216, local530 + 3);
													local556 += Static282.aClass138_7.anInt4172 + 1;
												}
											}
											if (local19.anInt2933 == 9) {
												if (local19.aBoolean204) {
													local909 = local87 + local19.anInt2943;
													local501 = local93;
													local232 = local93 + local19.anInt2916;
												} else {
													local909 = local19.anInt2943 + local87;
													local501 = local93 + local19.anInt2916;
													local232 = local93;
												}
												if (local19.anInt2887 == 1) {
													Static15.aClass59_1.method4850(local87, local232, local909, local501, local19.anInt2911, 0);
												} else {
													Static15.aClass59_1.method4802(local87, local232, local909, local501, local19.anInt2911, local19.anInt2887);
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
