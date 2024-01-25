import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!m;")
	public static Interface5 anInterface5_3;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[8];

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_61 = new Class12(37, 6);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!tn;)Z")
	public static boolean method740(@OriginalArg(0) Class229 arg0) {
		if (Static424.aBoolean633) {
			if (method751(arg0).anInt1143 != 0) {
				return false;
			}
			if (arg0.anInt6863 == 0) {
				return false;
			}
		}
		return arg0.aBoolean557;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Lclient!og;")
	public static Class182 method741(@OriginalArg(0) int arg0) {
		@Pc(8) Class182[] local8 = Static196.method3037();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			@Pc(24) Class182 local24 = local8[local18];
			if (local24.anInt4769 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method742() {
		for (@Pc(1) int local1 = 0; local1 < Static80.anInt6558; local1++) {
			@Pc(6) int[] local6 = Static150.anIntArrayArray17[local1];
			for (@Pc(8) int local8 = 0; local8 < Static104.anInt2048; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method744(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static97.anInt1902;
		@Pc(3) int[] local3 = Static105.anIntArray107;
		@Pc(11) int local11 = Static179.aBoolean265 ? local1 : local1 + Static47.anInt760;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class47_Sub1_Sub5 local23;
			if (local13 < local1) {
				local23 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local3[local13]];
			} else {
				local23 = Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local13 - local1]];
			}
			if (local23.aByte97 == arg0) {
				local23.anInt5346 = 0;
				if (local23.anInt5361 < 0) {
					local23.aBoolean430 = false;
				} else {
					@Pc(50) int local50 = local23.method4317();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt7060 & 0x7F) != 0 || (local23.anInt7066 & 0x7F) != 0) {
							local23.aBoolean430 = false;
							continue;
						}
					} else if ((local23.anInt7060 & 0x7F) != 64 || (local23.anInt7066 & 0x7F) != 64) {
						local23.aBoolean430 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt7060 >> 7;
						local97 = local23.anInt7066 >> 7;
						if (local23.anInt5361 != Static150.anIntArrayArray17[local92][local97]) {
							local23.aBoolean430 = true;
							continue;
						}
						if (Static310.anIntArrayArray39[local92][local97] > 1) {
							local122 = Static310.anIntArrayArray39[local92][local97]--;
							local23.aBoolean430 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt7060 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt7066 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt7060 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt7066 + local92 >> 7;
						if (!Static140.method2256(local151, local158, local97, local165, local23.anInt5361)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt5361 == Static150.anIntArrayArray17[local176][local179]) {
										local122 = Static310.anIntArrayArray39[local176][local179]--;
									}
								}
							}
							local23.aBoolean430 = true;
							continue;
						}
					}
					if (local23 instanceof Class47_Sub1_Sub5_Sub2 && local23.aClass1_Sub36_3 != null && Static123.anInt2333 >= local23.aClass1_Sub36_3.anInt6202 && Static123.anInt2333 < local23.aClass1_Sub36_3.anInt6196) {
						((Class47_Sub1_Sub5_Sub2) local23).aBoolean437 = false;
					}
					local23.aBoolean430 = false;
					local23.anInt7064 = Static405.method5510(local23.anInt7066, local23.anInt7060, local23.aByte97);
					Static97.method1543(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	public static void method746() {
		@Pc(7) Class110 local7 = null;
		try {
			@Pc(12) Class159 local12 = Static403.aClass42_6.method661("2");
			while (local12.anInt4271 == 0) {
				Static366.method5214(1L);
			}
			if (local12.anInt4271 == 1) {
				local7 = (Class110) local12.anObject8;
				@Pc(40) Class1_Sub14 local40 = new Class1_Sub14(Static87.anInt5505 * 6 + 3);
				local40.method4553(1);
				local40.method4504(Static87.anInt5505);
				for (@Pc(50) int local50 = 0; local50 < Static103.anIntArray102.length; local50++) {
					if (Static342.aBooleanArray23[local50]) {
						local40.method4504(local50);
						local40.method4522(Static103.anIntArray102[local50]);
					}
				}
				local7.method2355(local40.aByteArray65, local40.anInt5695, 0);
			}
		} catch (@Pc(85) Exception local85) {
		}
		try {
			if (local7 != null) {
				local7.method2357();
			}
		} catch (@Pc(97) Exception local97) {
		}
		Static443.aLong233 = Static107.method1707();
		Static330.aBoolean487 = false;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method747() {
		Static340.anInt6179 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static47.anInt760; local3++) {
			@Pc(10) Class47_Sub1_Sub5_Sub1 local10 = Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local3]];
			if (local10.aBoolean430 && local10.method4319() != -1) {
				@Pc(28) int local28 = (local10.method4317() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt7060 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt7066 - local28 >> 7;
				@Pc(49) Class47_Sub1_Sub5 local49 = Static425.method5721(local42, local35, local10.aByte97);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt5358;
					if (local49 instanceof Class47_Sub1_Sub5_Sub1) {
						local54 += 2048;
					}
					if (local49.anInt5346 == 0 && local49.method4319() != -1) {
						Static333.anIntArray447[Static340.anInt6179] = local54;
						Static265.anIntArray354[Static340.anInt6179] = local54;
						Static340.anInt6179++;
						local49.anInt5346++;
					}
					Static333.anIntArray447[Static340.anInt6179] = local54;
					Static265.anIntArray354[Static340.anInt6179] = local10.anInt5358 + 2048;
					Static340.anInt6179++;
					local49.anInt5346++;
				}
			}
		}
		Static364.method5173(0, Static333.anIntArray447, Static340.anInt6179 - 1, Static265.anIntArray354);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method748() {
		@Pc(1) int local1 = Static97.anInt1902;
		@Pc(3) int[] local3 = Static105.anIntArray107;
		@Pc(11) int local11 = Static179.aBoolean265 ? local1 : local1 + Static47.anInt760;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class47_Sub1_Sub5 local23;
			if (local13 < local1) {
				local23 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local3[local13]];
			} else {
				local23 = Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local13 - local1]];
			}
			if (local23.anInt5361 >= 0) {
				@Pc(39) int local39 = local23.method4317();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt7060 & 0x7F) == 0 && (local23.anInt7066 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7060 & 0x7F) == 64 && (local23.anInt7066 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class47_Sub1_Sub5_Sub2 && local23.aClass1_Sub36_3 != null && Static123.anInt2333 >= local23.aClass1_Sub36_3.anInt6202 && Static123.anInt2333 < local23.aClass1_Sub36_3.anInt6196) {
					((Class47_Sub1_Sub5_Sub2) local23).aBoolean437 = false;
				}
				local23.anInt7064 = Static405.method5510(local23.anInt7066, local23.anInt7060, local23.aByte97);
				Static97.method1543(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!tn;IIIIIIIII)V")
	public static void method749(@OriginalArg(0) Class229[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class229 local6 = arg0[local1];
			if (local6 != null && local6.anInt6882 == arg1) {
				@Pc(17) int local17 = local6.anInt6864 + arg6;
				@Pc(22) int local22 = local6.anInt6896 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6863 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6905;
					@Pc(45) int local45 = local22 + local6.anInt6895;
					if (local6.anInt6863 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6863 == 0 || local6.aBoolean566 || method751(local6).anInt1143 != 0 || local6 == Static196.aClass229_5 || local6.anInt6893 == Static165.anInt4807) {
					if (!method740(local6)) {
						if (local6 == Static206.aClass229_6) {
							Static104.aBoolean164 = true;
							Static136.anInt2493 = local17;
							Static36.anInt7705 = local22;
						}
						if (local6.aBoolean558 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean563 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class1_Sub16 local148 = (Class1_Sub16) Static38.aClass142_8.method3199(); local148 != null; local148 = (Class1_Sub16) Static38.aClass142_8.method3198()) {
									if (local148.aBoolean206) {
										local148.method5965();
										local148.aClass229_4.aBoolean562 = false;
									}
								}
								if (Static317.anInt5502 == 0) {
									Static206.aClass229_6 = null;
									Static196.aClass229_5 = null;
								}
								Static105.anInt2085 = 0;
								Static58.aBoolean88 = false;
								Static257.aBoolean347 = false;
								if (!Static378.aBoolean549) {
									Static176.method2834();
								}
							}
							@Pc(204) boolean local204;
							if (Static38.aClass32_1.method3517() >= local28 && Static38.aClass32_1.method3524() >= local30 && Static38.aClass32_1.method3517() < local32 && Static38.aClass32_1.method3524() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static217.aBoolean311 && local204) {
								if (local6.anInt6908 >= 0) {
									Static139.anInt2525 = local6.anInt6908;
								} else if (local6.aBoolean563) {
									Static139.anInt2525 = -1;
								}
							}
							if (!Static378.aBoolean549 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static202.method3110(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(248) boolean local248 = false;
							if (Static38.aClass32_1.method3519() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class1_Sub22 local263 = (Class1_Sub22) Static335.aClass142_42.method3199();
							if (local263 != null && local263.method2937() == 0 && local263.method2939() >= local28 && local263.method2936() >= local30 && local263.method2939() < local32 && local263.method2936() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray83 != null) {
								for (local296 = 0; local296 < local6.aByteArray83.length; local296++) {
									if (Static254.aClass10_1.method221(local6.aByteArray83[local296])) {
										if (local6.anIntArray507 == null || Static123.anInt2333 >= local6.anIntArray507[local296]) {
											@Pc(328) byte local328 = local6.aByteArray84[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static254.aClass10_1.method221(86) && !Static254.aClass10_1.method221(82) && !Static254.aClass10_1.method221(81)) && ((local328 & 0x2) == 0 || Static254.aClass10_1.method221(86)) && ((local328 & 0x1) == 0 || Static254.aClass10_1.method221(82)) && ((local328 & 0x4) == 0 || Static254.aClass10_1.method221(81))) {
												if (local296 < 10) {
													Static4.method128(-1, "", local6.anInt6923, local296 + 1);
												} else if (local296 == 10) {
													Static161.method2531();
													@Pc(399) Class1_Sub7 local399 = method751(local6);
													Static5.method5256(local399.method958(), local399.anInt1150, local6);
													Static225.aString52 = Static224.method3275(local6);
													if (Static225.aString52 == null) {
														Static225.aString52 = "Null";
													}
													Static363.aString75 = local6.aString82 + "<col=ffffff>";
												}
												local430 = local6.anIntArray513[local296];
												if (local6.anIntArray507 == null) {
													local6.anIntArray507 = new int[local6.aByteArray83.length];
												}
												if (local430 == 0) {
													local6.anIntArray507[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray507[local296] = Static123.anInt2333 + local430;
												}
											}
										}
									} else if (local6.anIntArray507 != null) {
										local6.anIntArray507[local296] = 0;
									}
								}
							}
							if (local258) {
								Static144.method2321(local6, local263.method2936() - local22, local263.method2939() - local17);
							}
							if (Static206.aClass229_6 != null && Static206.aClass229_6 != local6 && local204 && method751(local6).method960()) {
								Static297.aClass229_8 = local6;
							}
							if (local6 == Static196.aClass229_5) {
								Static196.aBoolean280 = true;
								Static283.anInt4756 = local17;
								Static296.anInt4967 = local22;
							}
							if (local6.aBoolean566 || local6.anInt6893 != 0) {
								@Pc(515) Class1_Sub16 local515;
								if (local204 && Static152.anInt2736 != 0 && local6.anObjectArray28 != null) {
									local515 = new Class1_Sub16();
									local515.aBoolean206 = true;
									local515.aClass229_4 = local6;
									local515.anInt2540 = Static152.anInt2736;
									local515.anObjectArray1 = local6.anObjectArray28;
									Static38.aClass142_8.method3212(local515);
								}
								if (Static206.aClass229_6 != null || Static378.aBoolean549 || local6.anInt6893 != Static274.anInt4625 && Static105.anInt2085 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt6893 != 0) {
									if (local6.anInt6893 == Static67.anInt1218 || local6.anInt6893 == Static388.anInt7308) {
										Static436.aClass229_14 = local6;
										if (Static448.aClass223_1 != null) {
											Static448.aClass223_1.method5316(Static447.aClass121_11, local6.anInt6895);
										}
										if (local6.anInt6893 == Static67.anInt1218) {
											if (!Static378.aBoolean549 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static243.method3541(arg9, Static447.aClass121_11, arg8);
												for (@Pc(598) Class36_Sub4 local598 = (Class36_Sub4) Static337.aClass242_6.method5503(); local598 != null; local598 = (Class36_Sub4) Static337.aClass242_6.method5506()) {
													if (arg8 >= local598.anInt3859 && arg8 < local598.anInt3857 && arg9 >= local598.anInt3860 && arg9 < local598.anInt3858) {
														Static176.method2834();
														Static98.method1594(local598.aClass47_Sub1_Sub5_1);
													}
												}
											}
											Static130.method3751(local17, local22, local6);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt6893 == Static165.anInt4807) {
										if (local6.method5378(Static447.aClass121_11) == null || Static417.anInt7328 != 0 && Static417.anInt7328 != 3 || Static378.aBoolean549 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray515[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray509[local670]) {
											continue;
										}
										local296 -= local6.anInt6905 / 2;
										local670 -= local6.anInt6895 / 2;
										if (Static57.anInt883 == 4) {
											local709 = (int) Static147.aFloat59 & 0x3FFF;
										} else {
											local709 = (int) Static147.aFloat59 + Static388.anInt7297 & 0x3FFF;
										}
										@Pc(721) int local721 = Class262.anIntArray575[local709];
										@Pc(725) int local725 = Class262.anIntArray576[local709];
										if (Static57.anInt883 != 4) {
											local721 = local721 * (Static25.anInt430 + 256) >> 8;
											local725 = local725 * (Static25.anInt430 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static57.anInt883 == 4) {
											local775 = (Static370.anInt7662 >> 7) + (local754 >> 2);
											local783 = (Static263.anInt4468 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static255.aClass47_Sub1_Sub5_Sub2_2.method4317() - 1) * 64;
											local775 = (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 - local792 >> 7) + (local754 >> 2);
											local783 = (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 - local792 >> 7) - (local764 >> 2);
										}
										if (Static217.aBoolean311 && (Static93.anInt1804 & 0x40) != 0) {
											@Pc(825) Class229 local825 = Static99.method1611(Static380.anInt6831, Static224.anInt3903);
											if (local825 == null) {
												Static161.method2531();
											} else {
												Static379.method5349(local6.anInt6918, Static36.anInt7708, " ->", Static225.aString52, local775, false, 1L, 58, true, local783);
											}
											continue;
										}
										if (Static325.aClass169_2 == Static92.aClass169_1) {
											Static379.method5349(-1, -1, "", Static19.aClass96_3.method1935(Static389.anInt7061), local775, false, 1L, 16, true, local783);
										}
										Static379.method5349(-1, Static348.anInt6362, "", Static399.aString85, local775, false, 1L, 48, true, local783);
										continue;
									}
									if (local6.anInt6893 == Static274.anInt4625) {
										Static413.aClass229_13 = local6;
										if (local204) {
											Static58.aBoolean88 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method2939() - local17 - local6.anInt6905 / 2) * 2.0D / (double) Static350.aFloat113);
											local670 = (int) -((double) (local263.method2936() - local22 - local6.anInt6895 / 2) * 2.0D / (double) Static350.aFloat113);
											local430 = Static347.anInt6358 + local296 + Static350.anInt6639;
											local709 = Static39.anInt620 + local670 + Static350.anInt6636;
											@Pc(939) Class1_Sub1_Sub6 local939 = Static246.method3559();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method918(local430, local944, local709);
											if (local944 != null) {
												if (Static254.aClass10_1.method221(82) && Static64.anInt1161 > 0) {
													Static228.method3290(local944[2], local944[1], local944[0]);
													continue;
												}
												Static257.aBoolean347 = true;
												Static253.anInt1024 = local944[0];
												Static394.anInt7050 = local944[1];
												Static15.anInt284 = local944[2];
											}
											Static105.anInt2085 = 1;
											Static238.aBoolean330 = false;
											Static255.anInt4375 = Static38.aClass32_1.method3517();
											Static367.anInt6677 = Static38.aClass32_1.method3524();
											continue;
										}
										if (local248 && Static105.anInt2085 > 0) {
											if (Static105.anInt2085 == 1 && (Static255.anInt4375 != Static38.aClass32_1.method3517() || Static367.anInt6677 != Static38.aClass32_1.method3524())) {
												Static70.anInt1281 = Static347.anInt6358;
												Static292.anInt4882 = Static39.anInt620;
												Static105.anInt2085 = 2;
											}
											if (Static105.anInt2085 == 2) {
												Static238.aBoolean330 = true;
												Static394.method5432(Static70.anInt1281 + (int) ((double) (Static255.anInt4375 - Static38.aClass32_1.method3517()) * 2.0D / (double) Static350.aFloat112));
												Static182.method2941(Static292.anInt4882 - (int) ((double) (Static367.anInt6677 - Static38.aClass32_1.method3524()) * 2.0D / (double) Static350.aFloat112));
											}
											continue;
										}
										if (Static105.anInt2085 > 0 && !Static238.aBoolean330) {
											if ((Static82.anInt1486 == 1 || Static102.method1634()) && Static119.anInt2296 > 2) {
												Static50.method697(Static255.anInt4375, Static367.anInt6677);
											} else if (Static88.method1243()) {
												Static50.method697(Static255.anInt4375, Static367.anInt6677);
											}
										}
										Static105.anInt2085 = 0;
										continue;
									}
									if (local6.anInt6893 == Static204.anInt3636) {
										if (local248) {
											Static23.method317(local6.anInt6895, Static38.aClass32_1.method3524() - local22, local6.anInt6905, Static38.aClass32_1.method3517() - local17);
										}
										continue;
									}
									if (local6.anInt6893 == Static76.anInt1443) {
										Static296.method4063(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean553 && local258) {
									local6.aBoolean553 = true;
									if (local6.anObjectArray23 != null) {
										local515 = new Class1_Sub16();
										local515.aBoolean206 = true;
										local515.aClass229_4 = local6;
										local515.anInt2543 = local263.method2939() - local17;
										local515.anInt2540 = local263.method2936() - local22;
										local515.anObjectArray1 = local6.anObjectArray23;
										Static38.aClass142_8.method3212(local515);
									}
								}
								if (local6.aBoolean553 && local248 && local6.anObjectArray29 != null) {
									local515 = new Class1_Sub16();
									local515.aBoolean206 = true;
									local515.aClass229_4 = local6;
									local515.anInt2543 = Static38.aClass32_1.method3517() - local17;
									local515.anInt2540 = Static38.aClass32_1.method3524() - local22;
									local515.anObjectArray1 = local6.anObjectArray29;
									Static38.aClass142_8.method3212(local515);
								}
								if (local6.aBoolean553 && !local248) {
									local6.aBoolean553 = false;
									if (local6.anObjectArray26 != null) {
										local515 = new Class1_Sub16();
										local515.aBoolean206 = true;
										local515.aClass229_4 = local6;
										local515.anInt2543 = Static38.aClass32_1.method3517() - local17;
										local515.anInt2540 = Static38.aClass32_1.method3524() - local22;
										local515.anObjectArray1 = local6.anObjectArray26;
										Static135.aClass142_16.method3212(local515);
									}
								}
								if (local248 && local6.anObjectArray25 != null) {
									local515 = new Class1_Sub16();
									local515.aBoolean206 = true;
									local515.aClass229_4 = local6;
									local515.anInt2543 = Static38.aClass32_1.method3517() - local17;
									local515.anInt2540 = Static38.aClass32_1.method3524() - local22;
									local515.anObjectArray1 = local6.anObjectArray25;
									Static38.aClass142_8.method3212(local515);
								}
								if (!local6.aBoolean562 && local204) {
									local6.aBoolean562 = true;
									if (local6.anObjectArray15 != null) {
										local515 = new Class1_Sub16();
										local515.aBoolean206 = true;
										local515.aClass229_4 = local6;
										local515.anInt2543 = Static38.aClass32_1.method3517() - local17;
										local515.anInt2540 = Static38.aClass32_1.method3524() - local22;
										local515.anObjectArray1 = local6.anObjectArray15;
										Static38.aClass142_8.method3212(local515);
									}
								}
								if (local6.aBoolean562 && local204 && local6.anObjectArray34 != null) {
									local515 = new Class1_Sub16();
									local515.aBoolean206 = true;
									local515.aClass229_4 = local6;
									local515.anInt2543 = Static38.aClass32_1.method3517() - local17;
									local515.anInt2540 = Static38.aClass32_1.method3524() - local22;
									local515.anObjectArray1 = local6.anObjectArray34;
									Static38.aClass142_8.method3212(local515);
								}
								if (local6.aBoolean562 && !local204) {
									local6.aBoolean562 = false;
									if (local6.anObjectArray33 != null) {
										local515 = new Class1_Sub16();
										local515.aBoolean206 = true;
										local515.aClass229_4 = local6;
										local515.anInt2543 = Static38.aClass32_1.method3517() - local17;
										local515.anInt2540 = Static38.aClass32_1.method3524() - local22;
										local515.anObjectArray1 = local6.anObjectArray33;
										Static135.aClass142_16.method3212(local515);
									}
								}
								if (local6.anObjectArray22 != null) {
									local515 = new Class1_Sub16();
									local515.aClass229_4 = local6;
									local515.anObjectArray1 = local6.anObjectArray22;
									Static306.aClass142_31.method3212(local515);
								}
								@Pc(1483) Class1_Sub16 local1483;
								if (local6.anObjectArray20 != null && Static357.anInt6539 > local6.anInt6924) {
									if (local6.anIntArray511 == null || Static357.anInt6539 - local6.anInt6924 > 32) {
										local515 = new Class1_Sub16();
										local515.aClass229_4 = local6;
										local515.anObjectArray1 = local6.anObjectArray20;
										Static38.aClass142_8.method3212(local515);
									} else {
										label678: for (local296 = local6.anInt6924; local296 < Static357.anInt6539; local296++) {
											local670 = Static452.anIntArray584[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray511.length; local430++) {
												if (local6.anIntArray511[local430] == local670) {
													local1483 = new Class1_Sub16();
													local1483.aClass229_4 = local6;
													local1483.anObjectArray1 = local6.anObjectArray20;
													Static38.aClass142_8.method3212(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt6924 = Static357.anInt6539;
								}
								if (local6.anObjectArray13 != null && Static330.anInt6005 > local6.anInt6900) {
									if (local6.anIntArray506 == null || Static330.anInt6005 - local6.anInt6900 > 32) {
										local515 = new Class1_Sub16();
										local515.aClass229_4 = local6;
										local515.anObjectArray1 = local6.anObjectArray13;
										Static38.aClass142_8.method3212(local515);
									} else {
										label654: for (local296 = local6.anInt6900; local296 < Static330.anInt6005; local296++) {
											local670 = Static290.anIntArray377[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray506.length; local430++) {
												if (local6.anIntArray506[local430] == local670) {
													local1483 = new Class1_Sub16();
													local1483.aClass229_4 = local6;
													local1483.anObjectArray1 = local6.anObjectArray13;
													Static38.aClass142_8.method3212(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt6900 = Static330.anInt6005;
								}
								if (local6.anObjectArray18 != null && Static271.anInt4570 > local6.anInt6928) {
									if (local6.anIntArray514 == null || Static271.anInt4570 - local6.anInt6928 > 32) {
										local515 = new Class1_Sub16();
										local515.aClass229_4 = local6;
										local515.anObjectArray1 = local6.anObjectArray18;
										Static38.aClass142_8.method3212(local515);
									} else {
										label630: for (local296 = local6.anInt6928; local296 < Static271.anInt4570; local296++) {
											local670 = Static163.anIntArray220[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray514.length; local430++) {
												if (local6.anIntArray514[local430] == local670) {
													local1483 = new Class1_Sub16();
													local1483.aClass229_4 = local6;
													local1483.anObjectArray1 = local6.anObjectArray18;
													Static38.aClass142_8.method3212(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt6928 = Static271.anInt4570;
								}
								if (local6.anObjectArray19 != null && Static151.anInt2727 > local6.anInt6943) {
									if (local6.anIntArray512 == null || Static151.anInt2727 - local6.anInt6943 > 32) {
										local515 = new Class1_Sub16();
										local515.aClass229_4 = local6;
										local515.anObjectArray1 = local6.anObjectArray19;
										Static38.aClass142_8.method3212(local515);
									} else {
										label606: for (local296 = local6.anInt6943; local296 < Static151.anInt2727; local296++) {
											local670 = Static118.anIntArray119[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray512.length; local430++) {
												if (local6.anIntArray512[local430] == local670) {
													local1483 = new Class1_Sub16();
													local1483.aClass229_4 = local6;
													local1483.anObjectArray1 = local6.anObjectArray19;
													Static38.aClass142_8.method3212(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt6943 = Static151.anInt2727;
								}
								if (local6.anObjectArray32 != null && Static332.anInt6038 > local6.anInt6867) {
									if (local6.anIntArray508 == null || Static332.anInt6038 - local6.anInt6867 > 32) {
										local515 = new Class1_Sub16();
										local515.aClass229_4 = local6;
										local515.anObjectArray1 = local6.anObjectArray32;
										Static38.aClass142_8.method3212(local515);
									} else {
										label582: for (local296 = local6.anInt6867; local296 < Static332.anInt6038; local296++) {
											local670 = Static401.anIntArray527[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray508.length; local430++) {
												if (local6.anIntArray508[local430] == local670) {
													local1483 = new Class1_Sub16();
													local1483.aClass229_4 = local6;
													local1483.anObjectArray1 = local6.anObjectArray32;
													Static38.aClass142_8.method3212(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt6867 = Static332.anInt6038;
								}
								if (Static108.anInt2095 > local6.anInt6858 && local6.anObjectArray8 != null) {
									local515 = new Class1_Sub16();
									local515.aClass229_4 = local6;
									local515.anObjectArray1 = local6.anObjectArray8;
									Static38.aClass142_8.method3212(local515);
								}
								if (Static238.anInt4203 > local6.anInt6858 && local6.anObjectArray17 != null) {
									local515 = new Class1_Sub16();
									local515.aClass229_4 = local6;
									local515.anObjectArray1 = local6.anObjectArray17;
									Static38.aClass142_8.method3212(local515);
								}
								if (Static452.anInt7791 > local6.anInt6858 && local6.anObjectArray36 != null) {
									local515 = new Class1_Sub16();
									local515.aClass229_4 = local6;
									local515.anObjectArray1 = local6.anObjectArray36;
									Static38.aClass142_8.method3212(local515);
								}
								if (Static434.anInt7554 > local6.anInt6858 && local6.anObjectArray12 != null) {
									local515 = new Class1_Sub16();
									local515.aClass229_4 = local6;
									local515.anObjectArray1 = local6.anObjectArray12;
									Static38.aClass142_8.method3212(local515);
								}
								if (Static392.anInt7048 > local6.anInt6858 && local6.anObjectArray16 != null) {
									local515 = new Class1_Sub16();
									local515.aClass229_4 = local6;
									local515.anObjectArray1 = local6.anObjectArray16;
									Static38.aClass142_8.method3212(local515);
								}
								local6.anInt6858 = Static270.anInt2350;
								if (local6.anObjectArray35 != null) {
									for (local296 = 0; local296 < Static64.anInt1162; local296++) {
										@Pc(1951) Class1_Sub16 local1951 = new Class1_Sub16();
										local1951.aClass229_4 = local6;
										local1951.anInt2542 = Static209.aClass22Array3[local296].method367();
										local1951.anInt2539 = Static209.aClass22Array3[local296].method366();
										local1951.anObjectArray1 = local6.anObjectArray35;
										Static38.aClass142_8.method3212(local1951);
									}
								}
								if (Static35.aBoolean53 && local6.anObjectArray11 != null) {
									local515 = new Class1_Sub16();
									local515.aClass229_4 = local6;
									local515.anObjectArray1 = local6.anObjectArray11;
									Static38.aClass142_8.method3212(local515);
								}
							}
							if (local6.anInt6863 == 5 && local6.anInt6920 != -1) {
								local6.method5389(Static377.aClass243_1, Static347.aClass163_1).method5316(Static447.aClass121_11, local6.anInt6895);
							}
							Static327.method4736(local6);
							if (local6.anInt6863 == 0) {
								method749(arg0, local6.anInt6923, local28, local30, local32, local34, local17 - local6.anInt6886, local22 - local6.anInt6871, arg8, arg9);
								if (local6.aClass229Array2 != null) {
									method749(local6.aClass229Array2, local6.anInt6923, local28, local30, local32, local34, local17 - local6.anInt6886, local22 - local6.anInt6871, arg8, arg9);
								}
								@Pc(2073) Class1_Sub38 local2073 = (Class1_Sub38) Static81.aClass51_5.method930((long) local6.anInt6923);
								if (local2073 != null) {
									if (Static325.aClass169_2 == Static392.aClass169_3 && local2073.anInt6524 == 0 && !Static378.aBoolean549 && local204 && !Static424.aBoolean633) {
										Static176.method2834();
									}
									Static45.method613(local30, local22, local2073.anInt6527, arg9, local32, local34, arg8, local28, local17);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static327.method4736(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!tn;)Lclient!d;")
	public static Class1_Sub7 method751(@OriginalArg(0) Class229 arg0) {
		@Pc(13) Class1_Sub7 local13 = (Class1_Sub7) Static402.aClass51_37.method930(((long) arg0.anInt6923 << 32) + (long) arg0.anInt6860);
		return local13 == null ? arg0.aClass1_Sub7_4 : local13;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method753(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static97.anInt1902;
		@Pc(3) int[] local3 = Static105.anIntArray107;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static47.anInt760; local5++) {
			@Pc(15) Class47_Sub1_Sub5 local15;
			if (local5 < local1) {
				local15 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local3[local5]];
			} else {
				local15 = Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local5 - local1]];
			}
			if (local15.aByte97 == arg0 && local15.anInt5361 >= 0) {
				@Pc(35) int local35 = local15.method4317();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt7060 & 0x7F) != 0 || (local15.anInt7066 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7060 & 0x7F) != 64 || (local15.anInt7066 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt7060 >> 7;
					local76 = local15.anInt7066 >> 7;
					if (local15.anInt5361 > Static150.anIntArrayArray17[local71][local76]) {
						Static150.anIntArrayArray17[local71][local76] = local15.anInt5361;
						Static310.anIntArrayArray39[local71][local76] = 1;
					} else if (local15.anInt5361 == Static150.anIntArrayArray17[local71][local76]) {
						local112 = Static310.anIntArrayArray39[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt7060 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt7066 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt7060 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt7066 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt5361 > Static150.anIntArrayArray17[local154][local157]) {
								Static150.anIntArrayArray17[local154][local157] = local15.anInt5361;
								Static310.anIntArrayArray39[local154][local157] = 1;
							} else if (local15.anInt5361 == Static150.anIntArrayArray17[local154][local157]) {
								local112 = Static310.anIntArrayArray39[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!tn;)Lclient!tn;")
	public static Class229 method754(@OriginalArg(0) Class229 arg0) {
		@Pc(4) int local4 = method751(arg0).method965();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static203.method1670(arg0.anInt6882);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method755() {
		@Pc(1) int local1 = Static97.anInt1902;
		@Pc(3) int[] local3 = Static105.anIntArray107;
		@Pc(20) boolean local20 = Static327.aClass230_Sub1_1.anInt7296 == 1 && local1 > 200 || Static327.aClass230_Sub1_1.anInt7296 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class47_Sub1_Sub5_Sub2 local29 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local3[local22]];
			if (local29.method4341()) {
				local29.method5446();
				if (local29.aShort104 >= 0 && local29.aShort105 >= 0 && local29.aShort107 < Static80.anInt6558 && local29.aShort106 < Static104.anInt2048) {
					local29.aBoolean437 = local29.aBoolean432 ? local20 : false;
					if (local29 == Static255.aClass47_Sub1_Sub5_Sub2_2) {
						local29.anInt5361 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean430) {
							local75++;
						}
						if (local29.anInt5363 > Static123.anInt2333) {
							local75 += 2;
						}
						local75 += 5 - local29.method4317() << 2;
						if (local29.aBoolean438) {
							local75 += 512;
						} else {
							if (Static256.anInt4402 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt5361 = local75 + 1;
					}
				} else {
					local29.anInt5361 = -1;
				}
			} else {
				local29.anInt5361 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static47.anInt760; local116++) {
			@Pc(123) Class47_Sub1_Sub5_Sub1 local123 = Static307.aClass47_Sub1_Sub5_Sub1Array1[Static151.anIntArray211[local116]];
			if (local123.method3156() && local123.aClass196_1.method4408(Static237.aClass80_1)) {
				local123.method5446();
				if (local123.aShort104 >= 0 && local123.aShort105 >= 0 && local123.aShort107 < Static80.anInt6558 && local123.aShort106 < Static104.anInt2048) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean430) {
						local160++;
					}
					if (local123.anInt5363 > Static123.anInt2333) {
						local160 += 2;
					}
					local160 += 5 - local123.method4317() << 2;
					if (Static256.anInt4402 == 0) {
						if (local123.aClass196_1.aBoolean442) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static256.anInt4402 == 1) {
						if (local123.aClass196_1.aBoolean442) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass196_1.aBoolean443) {
						local160 += 1024;
					} else if (!local123.aClass196_1.aBoolean446) {
						local160 += 256;
					}
					local123.anInt5361 = local160 + 1;
				} else {
					local123.anInt5361 = -1;
				}
			} else {
				local123.anInt5361 = -1;
			}
		}
		for (local75 = 0; local75 < Static416.aClass262Array1.length; local75++) {
			@Pc(226) Class262 local226 = Static416.aClass262Array1[local75];
			if (local226 != null) {
				if (local226.anInt7695 == 1) {
					@Pc(237) Class47_Sub1_Sub5_Sub1 local237 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local226.anInt7698];
					if (local237 != null && local237.anInt5361 >= 0) {
						local237.anInt5361 += 2048;
					}
				} else if (local226.anInt7695 == 10) {
					@Pc(258) Class47_Sub1_Sub5_Sub2 local258 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local226.anInt7698];
					if (local258 != null && local258 != Static255.aClass47_Sub1_Sub5_Sub2_2 && local258.anInt5361 >= 0) {
						local258.anInt5361 += 2048;
					}
				}
			}
		}
	}
}
