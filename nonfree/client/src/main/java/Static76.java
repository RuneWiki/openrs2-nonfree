import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
	public static void method1068(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static580.anInt9430;
		@Pc(3) int[] local3 = Static6.anIntArray9;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static639.anInt10306; local5++) {
			@Pc(15) Class13_Sub1_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) Static147.anIntArray182[local5 - local1])).aClass13_Sub1_Sub1_Sub1_Sub1_2;
			}
			if (local15.aByte127 == arg0 && local15.anInt4614 >= 0) {
				@Pc(39) int local39 = local15.method3950();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10090 & 0x1FF) != 0 || (local15.anInt10089 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10090 & 0x1FF) != 256 || (local15.anInt10089 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10090 >> 9;
					local80 = local15.anInt10089 >> 9;
					if (local15.anInt4614 > Static559.anIntArrayArray63[local75][local80]) {
						Static559.anIntArrayArray63[local75][local80] = local15.anInt4614;
						Static544.anIntArrayArray65[local75][local80] = 1;
					} else if (local15.anInt4614 == Static559.anIntArrayArray63[local75][local80]) {
						local116 = Static544.anIntArrayArray65[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10090 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10089 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10090 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10089 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt4614 > Static559.anIntArrayArray63[local158][local161]) {
								Static559.anIntArrayArray63[local158][local161] = local15.anInt4614;
								Static544.anIntArrayArray65[local158][local161] = 1;
							} else if (local15.anInt4614 == Static559.anIntArrayArray63[local158][local161]) {
								local116 = Static544.anIntArrayArray65[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1069() {
		@Pc(1) int local1 = Static580.anInt9430;
		@Pc(3) int[] local3 = Static6.anIntArray9;
		@Pc(8) int local8 = Static234.aClass2_Sub5_48.aClass6_Sub12_1.method3734();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class13_Sub1_Sub1_Sub1_Sub2 local32 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local3[local25]];
			if (!local32.method3969()) {
				local32.anInt4614 = -1;
			} else if (local32.aBoolean322) {
				local32.anInt4614 = -1;
			} else {
				local32.method7691();
				if (local32.aShort117 >= 0 && local32.aShort119 >= 0 && local32.aShort120 < Static228.anInt3704 && local32.aShort118 < Static162.anInt2911) {
					local32.aBoolean326 = local32.aBoolean319 ? local23 : false;
					if (local32 == Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1) {
						local32.anInt4614 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean317) {
							local85++;
						}
						if (local32.anInt4579 > Static262.anInt5597) {
							local85 += 2;
						}
						local85 += 5 - local32.method3950() << 2;
						if (local32.aBoolean323) {
							local85 += 512;
						} else {
							if (Static271.anInt4365 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt4614 = local85 + 1;
					}
				} else {
					local32.anInt4614 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static639.anInt10306; local126++) {
			@Pc(137) Class13_Sub1_Sub1_Sub1_Sub1 local137 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) Static147.anIntArray182[local126])).aClass13_Sub1_Sub1_Sub1_Sub1_2;
			if (local137.method401() && local137.aClass150_1.method3194(Static431.aClass205_1)) {
				local137.method7691();
				if (local137.aShort117 >= 0 && local137.aShort119 >= 0 && local137.aShort120 < Static228.anInt3704 && local137.aShort118 < Static162.anInt2911) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean317) {
						local174++;
					}
					if (local137.anInt4579 > Static262.anInt5597) {
						local174 += 2;
					}
					local174 += 5 - local137.method3950() << 2;
					if (Static271.anInt4365 == 0) {
						if (local137.aClass150_1.aBoolean270) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static271.anInt4365 == 1) {
						if (local137.aClass150_1.aBoolean270) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass150_1.aBoolean269) {
						local174 += 1024;
					} else if (!local137.aClass150_1.aBoolean271) {
						local174 += 256;
					}
					local137.anInt4614 = local174 + 1;
				} else {
					local137.anInt4614 = -1;
				}
			} else {
				local137.anInt4614 = -1;
			}
		}
		for (local85 = 0; local85 < Static341.aClass372Array1.length; local85++) {
			@Pc(240) Class372 local240 = Static341.aClass372Array1[local85];
			if (local240 != null) {
				if (local240.anInt9971 == 1) {
					@Pc(254) Class2_Sub43 local254 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local240.anInt9978);
					if (local254 != null) {
						@Pc(259) Class13_Sub1_Sub1_Sub1_Sub1 local259 = local254.aClass13_Sub1_Sub1_Sub1_Sub1_2;
						if (local259.anInt4614 >= 0) {
							local259.anInt4614 += 2048;
						}
					}
				} else if (local240.anInt9971 == 10) {
					@Pc(278) Class13_Sub1_Sub1_Sub1_Sub2 local278 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local240.anInt9978];
					if (local278 != null && local278 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1 && local278.anInt4614 >= 0) {
						local278.anInt4614 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!paa;)Lclient!rm;")
	public static Class2_Sub41 method1071(@OriginalArg(0) Class261 arg0) {
		@Pc(13) Class2_Sub41 local13 = (Class2_Sub41) Static247.aClass118_22.method2595(((long) arg0.anInt6614 << 32) + (long) arg0.anInt6629);
		return local13 == null ? arg0.aClass2_Sub41_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1072() {
		for (@Pc(1) int local1 = 0; local1 < Static228.anInt3704; local1++) {
			@Pc(6) int[] local6 = Static559.anIntArrayArray63[local1];
			for (@Pc(8) int local8 = 0; local8 < Static162.anInt2911; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1073(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static580.anInt9430;
		@Pc(3) int[] local3 = Static6.anIntArray9;
		@Pc(11) int local11 = Static489.aBoolean136 ? local1 : local1 + Static639.anInt10306;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class13_Sub1_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) Static147.anIntArray182[local13 - local1])).aClass13_Sub1_Sub1_Sub1_Sub1_2;
			}
			if (local23.aByte127 == arg0) {
				local23.anInt4620 = 0;
				if (local23.anInt4614 < 0) {
					local23.aBoolean317 = false;
				} else {
					@Pc(54) int local54 = local23.method3950();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10090 & 0x1FF) != 0 || (local23.anInt10089 & 0x1FF) != 0) {
							local23.aBoolean317 = false;
							continue;
						}
					} else if ((local23.anInt10090 & 0x1FF) != 256 || (local23.anInt10089 & 0x1FF) != 256) {
						local23.aBoolean317 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10090 >> 9;
						local101 = local23.anInt10089 >> 9;
						if (local23.anInt4614 != Static559.anIntArrayArray63[local96][local101]) {
							local23.aBoolean317 = true;
							continue;
						}
						if (Static544.anIntArrayArray65[local96][local101] > 1) {
							local126 = Static544.anIntArrayArray65[local96][local101]--;
							local23.aBoolean317 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10090 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10089 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10090 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10089 + local96 >> 9;
						if (!Static595.method8062(local23.anInt4614, local169, local162, local155, local101)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt4614 == Static559.anIntArrayArray63[local180][local183]) {
										local126 = Static544.anIntArrayArray65[local180][local183]--;
									}
								}
							}
							local23.aBoolean317 = true;
							continue;
						}
					}
					local23.aBoolean317 = false;
					local23.anInt10097 = Static504.method6917(local23.anInt10090, local23.aByte127, local23.anInt10089);
					Static545.method7521(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1075() {
		Static453.anInt7266 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static639.anInt10306; local3++) {
			@Pc(14) Class13_Sub1_Sub1_Sub1_Sub1 local14 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) Static147.anIntArray182[local3])).aClass13_Sub1_Sub1_Sub1_Sub1_2;
			if (local14.aBoolean317 && local14.method3962() != -1) {
				@Pc(32) int local32 = (local14.method3950() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10090 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10089 - local32 >> 9;
				@Pc(53) Class13_Sub1_Sub1_Sub1 local53 = Static61.method911(local46, local39, local14.aByte127);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt4582;
					if (local53 instanceof Class13_Sub1_Sub1_Sub1_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt4620 == 0 && local53.method3962() != -1) {
						Static145.anIntArray177[Static453.anInt7266] = local58;
						Static642.anIntArray695[Static453.anInt7266] = local58;
						Static453.anInt7266++;
						local53.anInt4620++;
					}
					Static145.anIntArray177[Static453.anInt7266] = local58;
					Static642.anIntArray695[Static453.anInt7266] = local14.anInt4582 + 2048;
					Static453.anInt7266++;
					local53.anInt4620++;
				}
			}
		}
		Static177.method7513(Static453.anInt7266 - 1, Static642.anIntArray695, Static145.anIntArray177, 0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIILclient!ep;I)Lclient!dd;")
	public static Class65_Sub1_Sub1 method1076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class95_Sub1 arg4) {
		if (arg4.aBoolean173 || Static485.method6790(arg0) && Static485.method6790(arg2)) {
			return new Class65_Sub1_Sub1(arg4, 3553, arg1, arg3, arg0, arg2, true);
		} else if (arg4.aBoolean176) {
			return new Class65_Sub1_Sub1(arg4, 34037, arg1, arg3, arg0, arg2, true);
		} else {
			return new Class65_Sub1_Sub1(arg4, arg1, arg3, arg0, arg2, Static350.method4699(arg0), Static350.method4699(arg2), true);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!paa;IIIIIIIIIII)V")
	public static void method1078(@OriginalArg(0) Class261[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class261 local6 = arg0[local1];
			if (local6 != null && local6.anInt6631 == arg1) {
				@Pc(17) int local17 = local6.anInt6642 + arg6;
				@Pc(22) int local22 = local6.anInt6623 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt6635 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt6595;
					local45 = local22 + local6.anInt6622;
					if (local6.anInt6635 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6635 == 0 || local6.aBoolean481 || method1071(local6).anInt8108 != 0 || local6 == Static583.aClass261_12 || local6.anInt6573 == Static534.anInt8757 || local6.anInt6573 == Static207.anInt3508) {
					if (!method1080(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static319.aBoolean356) {
							local40 = Static274.method3801();
							local45 = Static69.method966();
						}
						if (local6 == Static444.aClass261_9 && Static108.method1609(Static444.aClass261_9) != null) {
							Static362.aBoolean420 = true;
							Static268.anInt4312 = local17;
							Static50.anInt1048 = local22;
						}
						if (local6.aBoolean478 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean487 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class2_Sub46 local168 = (Class2_Sub46) Static122.aClass109_13.method2325(); local168 != null; local168 = (Class2_Sub46) Static122.aClass109_13.method2318()) {
									if (local168.aBoolean688) {
										local168.method8653();
										local168.aClass261_10.aBoolean485 = false;
									}
								}
								if (Static339.anInt5386 == 0) {
									Static444.aClass261_9 = null;
									Static583.aClass261_12 = null;
								}
								Static91.anInt1707 = 0;
								Static349.aBoolean399 = false;
								Static35.aBoolean730 = false;
								if (!Static627.aBoolean736) {
									Static131.method8459();
								}
							}
							@Pc(232) boolean local232;
							if (Static507.aClass335_1.method7811() + local40 >= local28 && Static507.aClass335_1.method7821() + local45 >= local30 && Static507.aClass335_1.method7811() + local40 < local32 && Static507.aClass335_1.method7821() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static8.aBoolean11 && local232) {
								if (local6.anInt6596 >= 0) {
									Static144.anInt2622 = local6.anInt6596;
								} else if (local6.aBoolean487) {
									Static144.anInt2622 = -1;
								}
							}
							if (!Static627.aBoolean736 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static109.method1619(arg10 - local17, arg11 - local22, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static507.aClass335_1.method7818() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class2_Sub12 local291 = (Class2_Sub12) Static595.aClass109_69.method2325();
							if (local291 != null && local291.method7241() == 0 && local291.method7237() + local40 >= local28 && local291.method7238() + local45 >= local30 && local291.method7237() + local40 < local32 && local291.method7238() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray84 != null && !Static578.method7895()) {
								for (local335 = 0; local335 < local6.aByteArray84.length; local335++) {
									if (Static16.aClass167_1.method3544(local6.aByteArray84[local335])) {
										if (local6.anIntArray483 == null || Static262.anInt5597 >= local6.anIntArray483[local335]) {
											@Pc(367) byte local367 = local6.aByteArray83[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static16.aClass167_1.method3544(86) && !Static16.aClass167_1.method3544(82) && !Static16.aClass167_1.method3544(81)) && ((local367 & 0x2) == 0 || Static16.aClass167_1.method3544(86)) && ((local367 & 0x1) == 0 || Static16.aClass167_1.method3544(82)) && ((local367 & 0x4) == 0 || Static16.aClass167_1.method3544(81))) {
												if (local335 < 10) {
													Static139.method2125(-1, "", local335 + 1, local6.anInt6614);
												} else if (local335 == 10) {
													Static618.method8289();
													@Pc(438) Class2_Sub41 local438 = method1071(local6);
													Static404.method5471(local438.method6880(), local6, local438.anInt8112);
													Static577.aString105 = Static91.method1438(local6);
													if (Static577.aString105 == null) {
														Static577.aString105 = "Null";
													}
													Static90.aString16 = local6.aString90 + "<col=ffffff>";
												}
												local469 = local6.anIntArray492[local335];
												if (local6.anIntArray483 == null) {
													local6.anIntArray483 = new int[local6.aByteArray84.length];
												}
												if (local469 == 0) {
													local6.anIntArray483[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray483[local335] = Static262.anInt5597 + local469;
												}
											}
										}
									} else if (local6.anIntArray483 != null) {
										local6.anIntArray483[local335] = 0;
									}
								}
							}
							if (local286) {
								Static190.method2759(local6, local40 + local291.method7237() - local17, local45 + local291.method7238() - local22);
							}
							if (Static444.aClass261_9 != null && Static444.aClass261_9 != local6 && local232 && method1071(local6).method6881()) {
								Static637.aClass261_14 = local6;
							}
							if (local6 == Static583.aClass261_12) {
								Static443.aBoolean532 = true;
								Static496.anInt8111 = local17;
								Static217.anInt3575 = local22;
							}
							if (local6.aBoolean481 || local6.anInt6573 != 0) {
								@Pc(558) Class2_Sub46 local558;
								if (local232 && Static487.anInt8042 != 0 && local6.anObjectArray18 != null) {
									local558 = new Class2_Sub46();
									local558.aBoolean688 = true;
									local558.aClass261_10 = local6;
									local558.anInt9265 = Static487.anInt8042;
									local558.anObjectArray32 = local6.anObjectArray18;
									Static122.aClass109_13.method2323(local558);
								}
								if (Static444.aClass261_9 != null || Static627.aBoolean736 || local6.anInt6573 != Static40.anInt796 && Static91.anInt1707 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt6573 != 0) {
									if (local6.anInt6573 == Static476.anInt7607 || local6.anInt6573 == Static324.anInt5147) {
										Static352.aClass261_7 = local6;
										if (Static382.aClass160_1 != null) {
											Static382.aClass160_1.method3438(Static192.aClass95_4, local6.anInt6622);
										}
										if (local6.anInt6573 == Static476.anInt7607) {
											if (Static627.aBoolean736 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static543.method7493(arg9, arg8, Static192.aClass95_4);
											@Pc(641) Class13_Sub4 local641 = (Class13_Sub4) Static592.aClass171_10.method3745();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt2839 && arg10 < local641.anInt2841 && arg11 >= local641.anInt2842 && arg11 < local641.anInt2840) {
													Static131.method8459();
													Static319.method4276(local641.aClass13_Sub1_Sub1_Sub1_1);
												}
												local641 = (Class13_Sub4) Static592.aClass171_10.method3744();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt6573 == Static534.anInt8757) {
										if (local6.method5621(Static192.aClass95_4) == null || Static502.anInt2999 != 0 && Static502.anInt2999 != 3 || Static627.aBoolean736 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray486[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray487[local708]) {
											continue;
										}
										local335 -= local6.anInt6595 / 2;
										local708 -= local6.anInt6622 / 2;
										if (Static445.anInt7122 == 4) {
											local747 = (int) Static440.aFloat144 & 0x3FFF;
										} else {
											local747 = (int) Static440.aFloat144 + Static99.anInt7118 & 0x3FFF;
										}
										@Pc(759) int local759 = Canvas_Sub1.anIntArray497[local747];
										@Pc(763) int local763 = Canvas_Sub1.anIntArray498[local747];
										if (Static445.anInt7122 != 4) {
											local759 = local759 * (Static407.anInt9051 + 256) >> 8;
											local763 = local763 * (Static407.anInt9051 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static445.anInt7122 == 4) {
											local813 = (Static319.anInt5080 >> 9) + (local792 >> 2);
											local821 = (Static418.anInt6556 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.method3950() - 1) * 256;
											local813 = (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 - local830 >> 9) + (local792 >> 2);
											local821 = (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 - local830 >> 9) - (local802 >> 2);
										}
										if (Static8.aBoolean11 && (Static241.anInt3917 & 0x40) != 0) {
											@Pc(863) Class261 local863 = Static98.method1508(Static301.anInt4926, Static620.anInt9955);
											if (local863 == null) {
												Static618.method8289();
											} else {
												Static564.method7726(true, local813, local6.anInt6585, Static83.anInt1494, false, local821, (long) (local6.anInt6629 << 0 | local6.anInt6614), Static577.aString105, 1L, 4, true, " ->");
											}
											continue;
										}
										if (Static189.aClass375_5 == Static25.aClass375_2) {
											Static564.method7726(true, local813, -1, -1, false, local821, 0L, Static434.aClass271_27.method5972(Static483.anInt7694), 1L, 48, true, "");
										}
										Static564.method7726(true, local813, -1, Static480.anInt10368, false, local821, 0L, Static356.aString65, 1L, 12, true, "");
										continue;
									}
									if (local6.anInt6573 == Static40.anInt796) {
										Static93.aClass261_2 = local6;
										if (local232) {
											Static349.aBoolean399 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method7237() - local17 - local6.anInt6595 / 2) * 2.0D / (double) Static193.aFloat15);
											local708 = (int) -((double) (local45 + local291.method7238() - local22 - local6.anInt6622 / 2) * 2.0D / (double) Static193.aFloat15);
											local469 = Static40.anInt794 + local335 + Static193.anInt1548;
											local747 = Static347.anInt5452 + local708 + Static193.anInt1551;
											@Pc(994) Class2_Sub2_Sub9 local994 = Static242.method3402();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method2425(local747, local999, local469);
											if (local999 != null) {
												if (Static16.aClass167_1.method3544(82) && Static165.anInt5949 > 0) {
													Static499.method6900(local999[0], local999[1], local999[2]);
													continue;
												}
												Static35.aBoolean730 = true;
												Static540.anInt8853 = local999[0];
												Static581.anInt9451 = local999[1];
												Static457.anInt7377 = local999[2];
											}
											Static91.anInt1707 = 1;
											Static561.aBoolean682 = false;
											Static280.anInt4507 = Static507.aClass335_1.method7811();
											Static434.anInt7016 = Static507.aClass335_1.method7821();
											continue;
										}
										if (local276 && Static91.anInt1707 > 0) {
											if (Static91.anInt1707 == 1 && (Static280.anInt4507 != Static507.aClass335_1.method7811() || Static434.anInt7016 != Static507.aClass335_1.method7821())) {
												Static282.anInt7271 = Static40.anInt794;
												Static366.anInt5787 = Static347.anInt5452;
												Static91.anInt1707 = 2;
											}
											if (Static91.anInt1707 == 2) {
												Static561.aBoolean682 = true;
												Static43.method684(Static282.anInt7271 + (int) ((double) (Static280.anInt4507 - Static507.aClass335_1.method7811()) * 2.0D / (double) Static193.aFloat16));
												Static251.method3440(Static366.anInt5787 - (int) ((double) (Static434.anInt7016 - Static507.aClass335_1.method7821()) * 2.0D / (double) Static193.aFloat16));
											}
											continue;
										}
										if (Static91.anInt1707 > 0 && !Static561.aBoolean682) {
											if ((Static95.anInt1810 == 1 || Static158.method2369()) && Static474.anInt7600 > 2) {
												Static123.method1777(Static280.anInt4507, Static434.anInt7016);
											} else if (Static393.method5372()) {
												Static123.method1777(Static280.anInt4507, Static434.anInt7016);
											}
										}
										Static91.anInt1707 = 0;
										continue;
									}
									if (local6.anInt6573 == Static42.anInt5797) {
										if (local276) {
											Static239.method3347(local6.anInt6622, local45 + Static507.aClass335_1.method7821() - local22, local40 + Static507.aClass335_1.method7811() - local17, local6.anInt6595);
										}
										continue;
									}
									if (local6.anInt6573 == Static207.anInt3508) {
										Static415.method5565(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean486 && local286) {
									local6.aBoolean486 = true;
									if (local6.anObjectArray24 != null) {
										local558 = new Class2_Sub46();
										local558.aBoolean688 = true;
										local558.aClass261_10 = local6;
										local558.anInt9259 = local40 + local291.method7237() - local17;
										local558.anInt9265 = local45 + local291.method7238() - local22;
										local558.anObjectArray32 = local6.anObjectArray24;
										Static122.aClass109_13.method2323(local558);
									}
								}
								if (local6.aBoolean486 && local276 && local6.anObjectArray30 != null) {
									local558 = new Class2_Sub46();
									local558.aBoolean688 = true;
									local558.aClass261_10 = local6;
									local558.anInt9259 = local40 + Static507.aClass335_1.method7811() - local17;
									local558.anInt9265 = local45 + Static507.aClass335_1.method7821() - local22;
									local558.anObjectArray32 = local6.anObjectArray30;
									Static122.aClass109_13.method2323(local558);
								}
								if (local6.aBoolean486 && !local276) {
									local6.aBoolean486 = false;
									if (local6.anObjectArray9 != null) {
										local558 = new Class2_Sub46();
										local558.aBoolean688 = true;
										local558.aClass261_10 = local6;
										local558.anInt9259 = local40 + Static507.aClass335_1.method7811() - local17;
										local558.anInt9265 = local45 + Static507.aClass335_1.method7821() - local22;
										local558.anObjectArray32 = local6.anObjectArray9;
										Static79.aClass109_7.method2323(local558);
									}
								}
								if (local276 && local6.anObjectArray10 != null) {
									local558 = new Class2_Sub46();
									local558.aBoolean688 = true;
									local558.aClass261_10 = local6;
									local558.anInt9259 = local40 + Static507.aClass335_1.method7811() - local17;
									local558.anInt9265 = local45 + Static507.aClass335_1.method7821() - local22;
									local558.anObjectArray32 = local6.anObjectArray10;
									Static122.aClass109_13.method2323(local558);
								}
								if (!local6.aBoolean485 && local232) {
									local6.aBoolean485 = true;
									if (local6.anObjectArray14 != null) {
										local558 = new Class2_Sub46();
										local558.aBoolean688 = true;
										local558.aClass261_10 = local6;
										local558.anInt9259 = local40 + Static507.aClass335_1.method7811() - local17;
										local558.anInt9265 = local45 + Static507.aClass335_1.method7821() - local22;
										local558.anObjectArray32 = local6.anObjectArray14;
										Static122.aClass109_13.method2323(local558);
									}
								}
								if (local6.aBoolean485 && local232 && local6.anObjectArray3 != null) {
									local558 = new Class2_Sub46();
									local558.aBoolean688 = true;
									local558.aClass261_10 = local6;
									local558.anInt9259 = local40 + Static507.aClass335_1.method7811() - local17;
									local558.anInt9265 = local45 + Static507.aClass335_1.method7821() - local22;
									local558.anObjectArray32 = local6.anObjectArray3;
									Static122.aClass109_13.method2323(local558);
								}
								if (local6.aBoolean485 && !local232) {
									local6.aBoolean485 = false;
									if (local6.anObjectArray2 != null) {
										local558 = new Class2_Sub46();
										local558.aBoolean688 = true;
										local558.aClass261_10 = local6;
										local558.anInt9259 = local40 + Static507.aClass335_1.method7811() - local17;
										local558.anInt9265 = local45 + Static507.aClass335_1.method7821() - local22;
										local558.anObjectArray32 = local6.anObjectArray2;
										Static79.aClass109_7.method2323(local558);
									}
								}
								if (local6.anObjectArray22 != null) {
									local558 = new Class2_Sub46();
									local558.aClass261_10 = local6;
									local558.anObjectArray32 = local6.anObjectArray22;
									Static485.aClass109_51.method2323(local558);
								}
								@Pc(1570) Class2_Sub46 local1570;
								if (local6.anObjectArray27 != null && Static376.anInt5904 > local6.anInt6655) {
									if (local6.anIntArray485 == null || Static376.anInt5904 - local6.anInt6655 > 32) {
										local558 = new Class2_Sub46();
										local558.aClass261_10 = local6;
										local558.anObjectArray32 = local6.anObjectArray27;
										Static122.aClass109_13.method2323(local558);
									} else {
										label687: for (local335 = local6.anInt6655; local335 < Static376.anInt5904; local335++) {
											local708 = Static437.anIntArray501[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray485.length; local469++) {
												if (local6.anIntArray485[local469] == local708) {
													local1570 = new Class2_Sub46();
													local1570.aClass261_10 = local6;
													local1570.anObjectArray32 = local6.anObjectArray27;
													Static122.aClass109_13.method2323(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt6655 = Static376.anInt5904;
								}
								if (local6.anObjectArray11 != null && Static480.anInt10375 > local6.anInt6606) {
									if (local6.anIntArray493 == null || Static480.anInt10375 - local6.anInt6606 > 32) {
										local558 = new Class2_Sub46();
										local558.aClass261_10 = local6;
										local558.anObjectArray32 = local6.anObjectArray11;
										Static122.aClass109_13.method2323(local558);
									} else {
										label663: for (local335 = local6.anInt6606; local335 < Static480.anInt10375; local335++) {
											local708 = Static143.anIntArray176[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray493.length; local469++) {
												if (local6.anIntArray493[local469] == local708) {
													local1570 = new Class2_Sub46();
													local1570.aClass261_10 = local6;
													local1570.anObjectArray32 = local6.anObjectArray11;
													Static122.aClass109_13.method2323(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt6606 = Static480.anInt10375;
								}
								if (local6.anObjectArray1 != null && Static245.anInt3947 > local6.anInt6660) {
									if (local6.anIntArray488 == null || Static245.anInt3947 - local6.anInt6660 > 32) {
										local558 = new Class2_Sub46();
										local558.aClass261_10 = local6;
										local558.anObjectArray32 = local6.anObjectArray1;
										Static122.aClass109_13.method2323(local558);
									} else {
										label639: for (local335 = local6.anInt6660; local335 < Static245.anInt3947; local335++) {
											local708 = Static553.anIntArray619[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray488.length; local469++) {
												if (local6.anIntArray488[local469] == local708) {
													local1570 = new Class2_Sub46();
													local1570.aClass261_10 = local6;
													local1570.anObjectArray32 = local6.anObjectArray1;
													Static122.aClass109_13.method2323(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt6660 = Static245.anInt3947;
								}
								if (local6.anObjectArray26 != null && Static180.anInt3120 > local6.anInt6653) {
									if (local6.anIntArray484 == null || Static180.anInt3120 - local6.anInt6653 > 32) {
										local558 = new Class2_Sub46();
										local558.aClass261_10 = local6;
										local558.anObjectArray32 = local6.anObjectArray26;
										Static122.aClass109_13.method2323(local558);
									} else {
										label615: for (local335 = local6.anInt6653; local335 < Static180.anInt3120; local335++) {
											local708 = Static421.anIntArray495[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray484.length; local469++) {
												if (local6.anIntArray484[local469] == local708) {
													local1570 = new Class2_Sub46();
													local1570.aClass261_10 = local6;
													local1570.anObjectArray32 = local6.anObjectArray26;
													Static122.aClass109_13.method2323(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt6653 = Static180.anInt3120;
								}
								if (local6.anObjectArray12 != null && Static518.anInt8602 > local6.anInt6611) {
									if (local6.anIntArray489 == null || Static518.anInt8602 - local6.anInt6611 > 32) {
										local558 = new Class2_Sub46();
										local558.aClass261_10 = local6;
										local558.anObjectArray32 = local6.anObjectArray12;
										Static122.aClass109_13.method2323(local558);
									} else {
										label591: for (local335 = local6.anInt6611; local335 < Static518.anInt8602; local335++) {
											local708 = Static559.anIntArray625[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray489.length; local469++) {
												if (local6.anIntArray489[local469] == local708) {
													local1570 = new Class2_Sub46();
													local1570.aClass261_10 = local6;
													local1570.anObjectArray32 = local6.anObjectArray12;
													Static122.aClass109_13.method2323(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt6611 = Static518.anInt8602;
								}
								if (Static265.anInt4279 > local6.anInt6666 && local6.anObjectArray21 != null) {
									local558 = new Class2_Sub46();
									local558.aClass261_10 = local6;
									local558.anObjectArray32 = local6.anObjectArray21;
									Static122.aClass109_13.method2323(local558);
								}
								if (Static111.anInt2031 > local6.anInt6666 && local6.anObjectArray16 != null) {
									local558 = new Class2_Sub46();
									local558.aClass261_10 = local6;
									local558.anObjectArray32 = local6.anObjectArray16;
									Static122.aClass109_13.method2323(local558);
								}
								if (Static620.anInt9960 > local6.anInt6666 && local6.anObjectArray17 != null) {
									local558 = new Class2_Sub46();
									local558.aClass261_10 = local6;
									local558.anObjectArray32 = local6.anObjectArray17;
									Static122.aClass109_13.method2323(local558);
								}
								if (Static55.anInt1108 > local6.anInt6666 && local6.anObjectArray7 != null) {
									local558 = new Class2_Sub46();
									local558.aClass261_10 = local6;
									local558.anObjectArray32 = local6.anObjectArray7;
									Static122.aClass109_13.method2323(local558);
								}
								if (Static369.anInt5832 > local6.anInt6666 && local6.anObjectArray25 != null) {
									local558 = new Class2_Sub46();
									local558.aClass261_10 = local6;
									local558.anObjectArray32 = local6.anObjectArray25;
									Static122.aClass109_13.method2323(local558);
								}
								local6.anInt6666 = Static542.anInt8903;
								if (local6.anObjectArray8 != null) {
									for (local335 = 0; local335 < Static427.anInt6728; local335++) {
										@Pc(2038) Class2_Sub46 local2038 = new Class2_Sub46();
										local2038.aClass261_10 = local6;
										local2038.anInt9263 = Static587.anInterface22Array1[local335].method5223();
										local2038.anInt9266 = Static587.anInterface22Array1[local335].method5226();
										local2038.anObjectArray32 = local6.anObjectArray8;
										Static122.aClass109_13.method2323(local2038);
									}
								}
								if (Static208.aBoolean252 && local6.anObjectArray6 != null) {
									local558 = new Class2_Sub46();
									local558.aClass261_10 = local6;
									local558.anObjectArray32 = local6.anObjectArray6;
									Static122.aClass109_13.method2323(local558);
								}
							}
							if (local6.anInt6635 == 5 && local6.anInt6662 != -1) {
								local6.method5629(Static355.aClass157_1, Static263.aClass224_1).method3438(Static192.aClass95_4, local6.anInt6622);
							}
							Static53.method844(local6);
							if (local6.anInt6635 == 0) {
								method1078(arg0, local6.anInt6614, local28, local30, local32, local34, local17 - local6.anInt6598, local22 - local6.anInt6624, arg8, arg9, arg10, arg11);
								if (local6.aClass261Array2 != null) {
									method1078(local6.aClass261Array2, local6.anInt6614, local28, local30, local32, local34, local17 - local6.anInt6598, local22 - local6.anInt6624, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class2_Sub9 local2164 = (Class2_Sub9) Static606.aClass118_47.method2595((long) local6.anInt6614);
								if (local2164 != null) {
									if (Static189.aClass375_5 == Static605.aClass375_7 && local2164.anInt2172 == 0 && !Static627.aBoolean736 && local232 && !Static488.aBoolean602) {
										Static131.method8459();
									}
									Static529.method7306(arg10, local28, local30, local32, local34, arg8, local2164.anInt2171, arg11, local22, arg9, local17);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static53.method844(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!paa;)Lclient!paa;")
	public static Class261 method1079(@OriginalArg(0) Class261 arg0) {
		@Pc(4) int local4 = method1071(arg0).method6879();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static357.method4826(arg0.anInt6631);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!paa;)Z")
	public static boolean method1080(@OriginalArg(0) Class261 arg0) {
		if (Static488.aBoolean602) {
			if (method1071(arg0).anInt8108 != 0) {
				return false;
			}
			if (arg0.anInt6635 == 0) {
				return false;
			}
		}
		return arg0.aBoolean482;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)Z")
	public static boolean method1081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static27.aByteArrayArrayArray1[0][arg1][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static27.aByteArrayArrayArray1[arg0][arg1][arg2] & 0x10) == 0) {
			return arg3 == Static225.method3110(arg2, arg0, arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1082() {
		@Pc(1) int local1 = Static580.anInt9430;
		@Pc(3) int[] local3 = Static6.anIntArray9;
		@Pc(11) int local11 = Static489.aBoolean136 ? local1 : local1 + Static639.anInt10306;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class13_Sub1_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) Static147.anIntArray182[local13 - local1])).aClass13_Sub1_Sub1_Sub1_Sub1_2;
			}
			if (local23.anInt4614 >= 0) {
				@Pc(43) int local43 = local23.method3950();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10090 & 0x1FF) == 0 && (local23.anInt10089 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10090 & 0x1FF) == 256 && (local23.anInt10089 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10097 = Static504.method6917(local23.anInt10090, local23.aByte127, local23.anInt10089);
				Static545.method7521(local23, true);
			}
		}
	}
}
