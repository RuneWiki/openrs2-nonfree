import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "Lclient!wo;")
	public static Class216 aClass216_8;

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_3 = new Class16();

	@OriginalMember(owner = "client!ca", name = "Q", descriptor = "[B")
	public static final byte[] aByteArray19 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
	public static int anInt1164 = 0;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BILclient!wo;)Lclient!fa;")
	public static Class63 method845(@OriginalArg(1) int arg0, @OriginalArg(2) Class216 arg1) {
		@Pc(16) byte[] local16 = arg1.method5659(arg0);
		return local16 == null ? null : new Class63(local16);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method846(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(18) int local18 = 0;
		@Pc(24) int local24 = arg1 ? 32768 : 0;
		@Pc(32) int local32 = (arg1 ? Static175.anInt3789 : Static148.anInt3247) + local24;
		for (@Pc(34) int local34 = local24; local34 < local32; local34++) {
			@Pc(40) Class1_Sub4_Sub11 local40 = Static8.method5022(local34);
			if (local40.aBoolean217 && local40.method2084().toLowerCase().indexOf(local4) != -1) {
				if (local18 >= 50) {
					Static15.anInt524 = -1;
					Static326.aShortArray44 = null;
					return;
				}
				if (local18 >= local11.length) {
					@Pc(71) short[] local71 = new short[local11.length * 2];
					for (@Pc(73) int local73 = 0; local73 < local18; local73++) {
						local71[local73] = local11[local73];
					}
					local11 = local71;
				}
				local11[local18++] = (short) local34;
			}
		}
		Static326.aShortArray44 = local11;
		Static270.anInt5516 = 0;
		Static15.anInt524 = local18;
		@Pc(110) String[] local110 = new String[Static15.anInt524];
		for (@Pc(112) int local112 = 0; local112 < Static15.anInt524; local112++) {
			local110[local112] = Static8.method5022(local11[local112]).method2084();
		}
		Static52.method1338(Static326.aShortArray44, local110);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!be;)V")
	public static void method848(@OriginalArg(1) Class17_Sub1_Sub1_Sub1 arg0) {
		@Pc(16) Class1_Sub22 local16 = (Class1_Sub22) Static248.aClass197_24.method5157((long) arg0.anInt4867);
		if (local16 == null) {
			return;
		}
		if (local16.aClass1_Sub1_Sub2_2 != null) {
			Static145.aClass1_Sub1_Sub4_1.method5037(local16.aClass1_Sub1_Sub2_2);
			local16.aClass1_Sub1_Sub2_2 = null;
		}
		local16.method5628();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII[Lclient!aq;IIIII)V")
	public static void method849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
		for (@Pc(13) int local13 = 0; local13 < arg4.length; local13++) {
			@Pc(27) Class12 local27 = arg4[local13];
			if (local27 != null && (arg1 == local27.anInt459 || arg1 == -1412584499 && local27 == Static28.aClass12_3)) {
				@Pc(52) int local52;
				if (arg3 == -1) {
					Class1_Sub4_Sub13.aRectangleArray5[Static47.anInt1510].setBounds(arg8 + local27.anInt423, local27.anInt447 - -arg5, local27.lb, local27.anInt446);
					local52 = Static47.anInt1510++;
				} else {
					local52 = arg3;
				}
				local27.anInt422 = Static5.anInt208;
				local27.anInt451 = local52;
				if (!Static44.method1013(local27)) {
					if (local27.anInt435 > 0) {
						Static18.method436(local27);
					}
					@Pc(100) int local100 = local27.anInt423 + arg8;
					@Pc(105) int local105 = local27.anInt447 + arg5;
					@Pc(108) int local108 = local27.anInt413;
					if (Static185.aBoolean369 && (Static44.method1023(local27).anInt6683 != 0 || local27.anInt416 == 0) && local108 > 127) {
						local108 = 127;
					}
					@Pc(152) int local152;
					@Pc(156) int local156;
					if (Static28.aClass12_3 == local27) {
						if (arg1 != -1412584499 && !local27.aBoolean51) {
							Static97.aClass12Array12 = arg4;
							Static194.anInt4144 = arg5;
							Static135.anInt2981 = arg8;
							continue;
						}
						if (Static45.aBoolean139 && Static198.aBoolean118) {
							local152 = Static222.aClass84_1.method5408();
							local156 = Static222.aClass84_1.method5406();
							local152 -= Static136.anInt3010;
							local156 -= Static306.anInt6042;
							if (Static318.anInt6136 > local152) {
								local152 = Static318.anInt6136;
							}
							if (local27.lb + local152 > Static285.aClass12_12.lb + Static318.anInt6136) {
								local152 = Static285.aClass12_12.lb + Static318.anInt6136 - local27.lb;
							}
							if (Static101.anInt2415 > local156) {
								local156 = Static101.anInt2415;
							}
							local100 = local152;
							if (local27.anInt446 + local156 > Static101.anInt2415 - -Static285.aClass12_12.anInt446) {
								local156 = Static285.aClass12_12.anInt446 + Static101.anInt2415 - local27.anInt446;
							}
							local105 = local156;
						}
						if (!local27.aBoolean51) {
							local108 = 128;
						}
					}
					@Pc(238) int local238;
					@Pc(240) int local240;
					@Pc(249) int local249;
					@Pc(254) int local254;
					if (local27.anInt416 == 2) {
						local152 = arg6;
						local238 = arg7;
						local240 = arg2;
						local156 = arg0;
					} else {
						local249 = local27.lb + local100;
						local254 = local105 + local27.anInt446;
						local152 = arg6 < local100 ? local100 : arg6;
						if (local27.anInt416 == 9) {
							local254++;
							local249++;
						}
						local156 = local105 <= arg0 ? arg0 : local105;
						local240 = arg2 > local254 ? local254 : arg2;
						local238 = arg7 > local249 ? local249 : arg7;
					}
					if (local238 > local152 && local156 < local240) {
						@Pc(536) int local536;
						@Pc(560) int local560;
						@Pc(562) int local562;
						@Pc(507) int local507;
						@Pc(509) int local509;
						if (local27.anInt435 != 0) {
							if (local27.anInt435 == 1337 || local27.anInt435 == 1403) {
								Static352.method5610(local27.lb, local27.anInt446, local100, local105, local27.anInt435 == 1403);
								Static223.aBooleanArray28[local52] = true;
								Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
								continue;
							}
							if (local27.anInt435 == 1338) {
								if (local27.method367(Static208.aClass32_11) != null) {
									Static63.method4863();
									Static296.method4977(local100, local105, local27, Static208.aClass32_11);
									Static161.aBooleanArray16[local52] = true;
									Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
								}
								continue;
							}
							if (local27.anInt435 == 1339) {
								if (local27.method367(Static208.aClass32_11) != null) {
									Static72.method1683(local100, local105, local27);
									Static161.aBooleanArray16[local52] = true;
									Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
								}
								continue;
							}
							if (local27.anInt435 == 1400) {
								Static24.method663(local27.anInt446, local100, local105, Static208.aClass32_11, Static357.anInterface2_7, local27.lb);
								Static223.aBooleanArray28[local52] = true;
								Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
								continue;
							}
							if (local27.anInt435 == 1401) {
								Static211.method4078(local27.lb, Static208.aClass32_11, local105, local100, local27.anInt446);
								Static223.aBooleanArray28[local52] = true;
								Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
								continue;
							}
							if (local27.anInt435 == 1405) {
								if (!Static33.aBoolean105 && !Static251.aBoolean454) {
									continue;
								}
								local249 = local27.lb + local100;
								local254 = local105 + 15;
								if (Static33.aBoolean105) {
									Static212.aClass9_3.method5023(local249, local254, "Fps:" + Static24.anInt942, -256);
									local254 += 15;
									@Pc(497) Runtime local497 = Runtime.getRuntime();
									local507 = (int) ((local497.totalMemory() - local497.freeMemory()) / 1024L);
									local509 = -256;
									if (local507 > 65536) {
										local509 = -65536;
									}
									Static212.aClass9_3.method5023(local249, local254, "Mem:" + local507 + "k", local509);
									local254 += 15;
									local536 = Static208.aClass32_11.method2227() / 1024;
									Static212.aClass9_3.method5023(local249, local254, "Offheap:" + local536 + "k", local536 <= 65536 ? -256 : -65536);
									local254 += 15;
									local560 = 0;
									local562 = 0;
									@Pc(564) int local564 = 0;
									for (@Pc(566) int local566 = 0; local566 < 29; local566++) {
										local560 += Static114.aClass51_Sub1Array4[local566].method4880();
										local562 += Static114.aClass51_Sub1Array4[local566].method4878();
										local564 += Static114.aClass51_Sub1Array4[local566].method4875();
									}
									@Pc(604) int local604 = local564 * 100 / local560;
									@Pc(610) int local610 = local562 * 10000 / local560;
									@Pc(630) String local630 = "Cache:" + Static326.method2186((long) local610, true, 0, 2) + "% (" + local604 + "%)";
									Static56.aClass9_2.method5023(local249, local254, local630, -256);
									local254 += 12;
								}
								if (Static355.anInt6768 > 0) {
									Static56.aClass9_2.method5023(local249, local254, "Particles: " + Static271.anInt5532 + " / " + Static355.anInt6768, -256);
								}
								local254 += 12;
								if (Static251.aBoolean454) {
									Static56.aClass9_2.method5023(local249, local254, "Polys: " + Static208.aClass32_11.method2230() + " Models: " + Static208.aClass32_11.method2151(), -256);
									local254 += 12;
									Static56.aClass9_2.method5023(local249, local254, "Ls: " + Static22.anInt5200 + " La: " + Static308.anInt3004 + " NPC: " + Static85.anInt5391 + " Pl: " + Static227.anInt4722, -256);
									local254 += 12;
									Static18.method435();
								}
								Static223.aBooleanArray28[local52] = true;
								continue;
							}
						}
						if (local27.anInt416 == 0) {
							if (local27.anInt435 == 1407 && Static208.aClass32_11.method2166()) {
								Static208.aClass32_11.method2218(local100, local105, local27.lb, local27.anInt446);
							}
							method849(local156, local27.anInt465, local240, local52, arg4, local105 - local27.anInt419, local152, local238, local100 - local27.anInt400);
							if (local27.aClass12Array3 != null) {
								method849(local156, local27.anInt465, local240, local52, local27.aClass12Array3, local105 - local27.anInt419, local152, local238, local100 - local27.anInt400);
							}
							@Pc(793) Class1_Sub37 local793 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local27.anInt465);
							if (local793 != null) {
								Static118.method2492(local105, local100, local52, local793.anInt6281, local152, local240, local238, local156);
							}
							if (local27.anInt435 == 1407 && Static208.aClass32_11.method2166()) {
								Static208.aClass32_11.method2179();
								Static87.aBoolean205 = true;
							}
							Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
						}
						if (Static320.aBooleanArray24[local52] || Static262.anInt5352 > 1) {
							if (local27.anInt416 == 3) {
								if (local108 == 0) {
									if (local27.aBoolean37) {
										Static208.aClass32_11.method2241(local100, local105, local27.lb, local27.anInt446, local27.anInt405, 0);
									} else {
										Static208.aClass32_11.method2200(local100, local105, local27.lb, local27.anInt446, local27.anInt405, 0);
									}
								} else if (local27.aBoolean37) {
									Static208.aClass32_11.method2241(local100, local105, local27.lb, local27.anInt446, 255 - (local108 & 0xFF) << 24 | local27.anInt405 & 0xFFFFFF, 1);
								} else {
									Static208.aClass32_11.method2200(local100, local105, local27.lb, local27.anInt446, local27.anInt405 & 0xFFFFFF | 255 - (local108 & 0xFF) << 24, 1);
								}
							} else if (local27.anInt416 == 4) {
								@Pc(929) Class9 local929 = local27.method362(Static208.aClass32_11);
								if (local929 != null) {
									local254 = local27.anInt405;
									@Pc(944) String local944 = local27.aString6;
									if (local27.anInt406 != -1) {
										@Pc(953) Class111 local953 = Static20.method561(local27.anInt406);
										local944 = local953.aString30;
										if (local944 == null) {
											local944 = "null";
										}
										if ((local953.anInt3287 == 1 || local27.anInt454 != 1) && local27.anInt454 != -1) {
											local944 = "<col=ff9040>" + local944 + "</col> x" + Static300.method5085(local27.anInt454);
										}
									}
									if (Static111.aClass12_7 == local27) {
										local944 = Static129.aClass34_89.method1285(Static259.anInt2907);
										local254 = local27.anInt405;
									}
									if (Static81.aBoolean497) {
										Static208.aClass32_11.method2220(local100, local105, local100 + local27.lb, local27.anInt446 + local105);
									}
									local929.method5014(local27.anInt466, null, local27.anInt446, local105, local27.anInt461, local27.aBoolean40 ? -16777216 : -1, Static163.aClass5Array13, local27.lb, local27.anInt418, local944, 0, local100, 0, local254 | 0xFF000000, null);
									if (Static81.aBoolean497) {
										Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
									}
								} else if (Static39.aBoolean121) {
									Static6.method247(local27);
								}
							} else {
								@Pc(1108) int local1108;
								if (local27.anInt416 == 5) {
									if (local27.anInt440 < 0) {
										@Pc(1073) Class5 local1073;
										if (local27.anInt406 == -1) {
											local1073 = local27.method368(Static208.aClass32_11);
										} else {
											@Pc(1083) Class60 local1083 = local27.aBoolean42 ? Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1 : null;
											local1073 = Static345.method5541(local27.anInt406, local27.anInt452, Static208.aClass32_11, local27.anInt407, local1083, local27.anInt463 | 0xFF000000, local27.anInt454);
										}
										if (local1073 != null) {
											local254 = local1073.method3632();
											local1108 = local1073.method3630();
											if (local27.aBoolean48) {
												Static208.aClass32_11.method2220(local100, local105, local27.lb + local100, local105 + local27.anInt446);
												if (local27.anInt445 != 0) {
													local507 = (local254 + local27.lb - 1) / local254;
													local509 = (local1108 + local27.anInt446 - 1) / local1108;
													for (local536 = 0; local536 < local507; local536++) {
														for (local560 = 0; local560 < local509; local560++) {
															local1073.method3624((float) (local536 * local254 + local100) + (float) local254 / 2.0F, (float) local1108 / 2.0F + (float) (local560 * local1108 + local105), 4096, local27.anInt445);
														}
													}
												} else if (local108 == 0) {
													local1073.method3625(local100, local105, local27.lb, local27.anInt446, 0, 0);
												} else {
													local1073.method3625(local100, local105, local27.lb, local27.anInt446, 1, 255 - (local108 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
											} else if (local108 != 0) {
												local507 = 255 - (local108 & 0xFF) << 24 | 0xFFFFFF;
												if (local27.anInt445 != 0) {
													local1073.method3637((float) local100 + (float) local27.lb / 2.0F, (float) local27.anInt446 / 2.0F + (float) local105, local27.lb * 4096 / local254, local27.anInt445, local507);
												} else if (local27.lb == local254 && local27.anInt446 == local1108) {
													local1073.method3619(local100, local105, 1, local507);
												} else {
													local1073.method3634(local100, local105, local27.lb, local27.anInt446, 1, local507, 1);
												}
											} else if (local27.anInt445 != 0) {
												local1073.method3624((float) local100 + (float) local27.lb / 2.0F, (float) local27.anInt446 / 2.0F + (float) local105, local27.lb * 4096 / local254, local27.anInt445);
											} else if (local27.lb == local254 && local1108 == local27.anInt446) {
												local1073.method3621(local100, local105);
											} else {
												local1073.method3633(local100, local105, local27.lb, local27.anInt446);
											}
										} else if (Static39.aBoolean121) {
											Static6.method247(local27);
										}
									} else {
										local27.method366().method5469(local100, local27.anInt411 << 3, 0, local27.lb, local27.anInt446, Static208.aClass32_11, local27.anInt469 << 3, local105, 0);
									}
								} else if (local27.anInt416 == 6) {
									Static71.method3159();
									@Pc(1431) Class73 local1431 = null;
									local254 = 0;
									@Pc(1607) Class24 local1607;
									@Pc(1617) Class60 local1617;
									if (local27.anInt406 != -1) {
										@Pc(1646) Class111 local1646 = Static20.method561(local27.anInt406);
										if (local1646 != null) {
											local1646 = local1646.method3002(local27.anInt454);
											local1607 = local27.anInt441 == -1 ? null : Static110.method5411(local27.anInt441);
											local1617 = local27.aBoolean42 ? Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1 : null;
											local1431 = local1646.method2995(local27.anInt388, local1607, local1617, 1, local27.anInt450, 1024, local27.anInt395, Static208.aClass32_11);
											if (local1431 == null) {
												Static6.method247(local27);
											} else {
												local254 = -local1431.method3327() / 2;
											}
										}
									} else if (local27.anInt433 == 5) {
										if (local27.anInt448 == -1) {
											local1431 = Static98.aClass60_2.method1713(0, -1, 1024, Static208.aClass32_11, null, null, -1, 0, null, -1, -1);
										} else {
											local1108 = local27.anInt448;
											@Pc(1473) Class17_Sub1_Sub1_Sub1 local1473;
											if (local1108 == Static16.anInt527) {
												local1473 = Static198.aClass17_Sub1_Sub1_Sub1_3;
											} else {
												local1473 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local1108];
											}
											@Pc(1491) Class24 local1491 = local27.anInt441 == -1 ? null : Static110.method5411(local27.anInt441);
											if (local1473 != null && (local1108 == 2047 || Static54.method1414(local1473.aString13) == local27.anInt394)) {
												local1431 = local1473.aClass60_1.method1713(local27.anInt450, 0, 1024, Static208.aClass32_11, local1491, null, -1, 0, null, local27.anInt388, local27.anInt395);
											}
										}
									} else if (local27.anInt433 == 8 || local27.anInt433 == 9) {
										@Pc(1596) Class1_Sub19 local1596 = Static274.method4804(local27.anInt448, false);
										local1607 = local27.anInt441 == -1 ? null : Static110.method5411(local27.anInt441);
										if (local1596 != null) {
											local1617 = local27.aBoolean42 ? Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1 : null;
											local1431 = local1596.method2493(local27.anInt450, Static208.aClass32_11, local27.anInt388, local27.anInt433 == 9, local27.anInt394, local27.anInt395, local1607, local1617);
										}
									} else if (local27.anInt441 == -1) {
										local1431 = local27.method361(1024, -1, 0, null, Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1, -1, Static208.aClass32_11);
										if (local1431 == null && Static39.aBoolean121) {
											Static6.method247(local27);
										}
									} else {
										@Pc(1567) Class24 local1567 = Static110.method5411(local27.anInt441);
										local1431 = local27.method361(1024, local27.anInt388, local27.anInt450, local1567, Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1, local27.anInt395, Static208.aClass32_11);
										if (local1431 == null && Static39.aBoolean121) {
											Static6.method247(local27);
										}
									}
									if (local1431 != null) {
										if (local27.anInt426 > 0) {
											local1108 = (local27.lb << 9) / local27.anInt426;
										} else {
											local1108 = 512;
										}
										if (local27.anInt399 > 0) {
											local507 = (local27.anInt446 << 9) / local27.anInt399;
										} else {
											local507 = 512;
										}
										local509 = (local27.anInt453 * local1108 >> 9) + local100 + local27.lb / 2;
										local536 = local27.anInt446 / 2 + local105 + (local27.anInt431 * local507 >> 9);
										Static265.aClass109_33.method3875();
										Static208.aClass32_11.method2201(Static265.aClass109_33);
										local560 = Class1_Sub3_Sub8.anIntArray159[local27.anInt468 << 3] * local27.anInt434 >> 15;
										local562 = local27.anInt434 * Class1_Sub3_Sub8.anIntArray156[local27.anInt468 << 3] >> 15;
										Static208.aClass32_11.method2242(local509, local536, local1108, local507);
										Static208.aClass32_11.method2225((float) local27.aShort3, local27.aBoolean44 ? (float) local27.aShort2 : (float) local27.aShort2 * 1.5F);
										if (Static87.aBoolean205) {
											Static208.aClass32_11.method2184();
											Static208.aClass32_11.method2177();
											Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
											Static87.aBoolean205 = false;
										}
										if (local27.aBoolean46) {
											Static208.aClass32_11.method2142(false);
										}
										Static9.aClass109_3.method3864(-local27.anInt467 << 3);
										Static9.aClass109_3.method3868(local27.anInt396 << 3);
										Static9.aClass109_3.method3874(local27.anInt456, local254 + local560 + local27.anInt403, local27.anInt403 + local562);
										Static9.aClass109_3.method3880(local27.anInt468 << 3);
										if (Static81.aBoolean497) {
											Static208.aClass32_11.method2220(local100, local105, local27.lb + local100, local105 - -local27.anInt446);
										}
										if (local27.aBoolean44) {
											local1431.method3310(Static9.aClass109_3, null, local27.anInt434);
										} else {
											local1431.method3322(Static9.aClass109_3, null, 1);
										}
										if (Static81.aBoolean497) {
											Static208.aClass32_11.method2226(arg6, arg0, arg7, arg2);
										}
										if (local27.aBoolean46) {
											Static208.aClass32_11.method2142(true);
										}
									}
								} else if (local27.anInt416 == 9) {
									if (local27.aBoolean39) {
										local1108 = local100 + local27.lb;
										local507 = local105;
										local254 = local105 + local27.anInt446;
									} else {
										local1108 = local27.lb + local100;
										local254 = local105;
										local507 = local27.anInt446 + local105;
									}
									if (local27.anInt415 == 1) {
										Static208.aClass32_11.method2193(local100, local254, local1108, local507, local27.anInt405, 0);
									} else {
										Static208.aClass32_11.method2188(local100, local254, local1108, local507, local27.anInt405, local27.anInt415);
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
