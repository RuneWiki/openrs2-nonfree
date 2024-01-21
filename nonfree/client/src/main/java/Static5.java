import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "J")
	public static long aLong10;

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Lclient!la;")
	public static Class17 aClass17_3;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!v;")
	public static Class76 aClass76_43 = Static134.method2017("p11_full");

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
	public static int anInt111 = 128;

	@OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
	public static int anInt127 = 0;

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "Lclient!v;")
	public static Class76 aClass76_44 = Static134.method2017("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "Lclient!v;")
	public static Class76 aClass76_45 = Static134.method2017(":clan:");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method67() {
		if (Static76.aBoolean119 && Static8.anInt164 != Static124.anInt2712) {
			Static52.method944(Static72.anInt1877, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0], Static124.anInt2712, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0], Static122.anInt2656);
		} else if (Static42.anInt1167 != Static124.anInt2712) {
			Static42.anInt1167 = Static124.anInt2712;
			Static63.method1094(Static124.anInt2712);
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
	public static void method68() {
		while (true) {
			if (Static24.aClass4_Sub10_Sub1_1.method609(Static30.anInt1437) >= 27) {
				@Pc(21) int local21 = Static24.aClass4_Sub10_Sub1_1.method608(15);
				if (local21 != 32767) {
					@Pc(26) boolean local26 = false;
					if (Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local21] == null) {
						local26 = true;
						Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local21] = new Class4_Sub4_Sub3_Sub1_Sub1();
					}
					@Pc(42) Class4_Sub4_Sub3_Sub1_Sub1 local42 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local21];
					Static47.anIntArray153[Static76.anInt1935++] = local21;
					local42.anInt1391 = Static78.anInt1981;
					@Pc(58) int local58 = Static24.aClass4_Sub10_Sub1_1.method608(1);
					@Pc(63) int local63 = Static24.aClass4_Sub10_Sub1_1.method608(5);
					@Pc(70) int local70 = Static98.anIntArray319[Static24.aClass4_Sub10_Sub1_1.method608(3)];
					if (local63 > 15) {
						local63 -= 32;
					}
					if (local26) {
						local42.anInt1409 = local42.anInt1395 = local70;
					}
					@Pc(89) int local89 = Static24.aClass4_Sub10_Sub1_1.method608(1);
					if (local89 == 1) {
						Static60.anIntArray201[Static48.anInt1228++] = local21;
					}
					local42.aClass4_Sub4_Sub10_1 = Static88.method1465(Static24.aClass4_Sub10_Sub1_1.method608(14));
					@Pc(113) int local113 = Static24.aClass4_Sub10_Sub1_1.method608(5);
					local42.anInt1431 = local42.aClass4_Sub4_Sub10_1.anInt1708;
					local42.anInt1435 = local42.aClass4_Sub4_Sub10_1.anInt1702;
					local42.anInt1426 = local42.aClass4_Sub4_Sub10_1.anInt1717;
					local42.anInt1382 = local42.aClass4_Sub4_Sub10_1.anInt1706;
					local42.anInt1430 = local42.aClass4_Sub4_Sub10_1.anInt1697;
					if (local113 > 15) {
						local113 -= 32;
					}
					local42.anInt1389 = local42.aClass4_Sub4_Sub10_1.anInt1698;
					local42.anInt1412 = local42.aClass4_Sub4_Sub10_1.anInt1716;
					local42.anInt1384 = local42.aClass4_Sub4_Sub10_1.anInt1692;
					local42.anInt1388 = local42.aClass4_Sub4_Sub10_1.anInt1701;
					if (local42.anInt1431 == 0) {
						local42.anInt1395 = 0;
					}
					local42.method967(local58 == 1, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray184[0] + local113, Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anIntArray180[0] + local63);
					continue;
				}
			}
			Static24.aClass4_Sub10_Sub1_1.method606();
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	public static void method69() {
		for (@Pc(15) Class4_Sub15 local15 = (Class4_Sub15) Static9.aClass78_2.method1916(); local15 != null; local15 = (Class4_Sub15) Static9.aClass78_2.method1920()) {
			if (local15.anInt2042 == -1) {
				local15.anInt2054 = 0;
				Static54.method1756(local15);
			} else {
				local15.method2004();
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BJ)V")
	public static void method70(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static104.anInt2337; local17++) {
			if (Static100.aLongArray55[local17] == arg0) {
				Static104.anInt2337--;
				for (@Pc(35) int local35 = local17; local35 < Static104.anInt2337; local35++) {
					Static51.aClass76Array23[local35] = Static51.aClass76Array23[local35 + 1];
					Static84.anIntArray281[local35] = Static84.anIntArray281[local35 + 1];
					Static100.aLongArray55[local35] = Static100.aLongArray55[local35 + 1];
					Static93.anIntArray305[local35] = Static93.anIntArray305[local35 + 1];
				}
				Static72.anInt1883 = Static36.anInt1031;
				Static69.aClass4_Sub10_Sub1_2.method611(97);
				Static69.aClass4_Sub10_Sub1_2.method555(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII[Lclient!dd;III)V")
	public static void method71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub8[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg4.length; local7++) {
			@Pc(13) Class4_Sub8 local13 = arg4[local7];
			if (local13 != null && (!local13.aBoolean37 || local13.anInt473 == 0 || local13.aBoolean36 || Static35.method627(local13) != 0 || Static55.aClass4_Sub8_11 == local13) && arg0 == local13.anInt489 && (!local13.aBoolean37 || !Static31.method444(local13))) {
				@Pc(52) int local52 = local13.anInt491 + arg1;
				@Pc(58) int local58 = local13.anInt457 + arg2;
				@Pc(139) int local139;
				@Pc(127) int local127;
				@Pc(107) int local107;
				@Pc(146) int local146;
				@Pc(80) int local80;
				if (local13.anInt473 == 2) {
					local146 = arg6;
					local127 = arg7;
					local139 = arg5;
					local107 = arg3;
				} else {
					@Pc(70) int local70;
					@Pc(82) int local82;
					if (local13.anInt473 == 9) {
						local70 = local58;
						@Pc(75) int local75 = local13.anInt513 + local58;
						local80 = local52 + local13.anInt498;
						local82 = local52;
						if (local58 > local75) {
							local70 = local75;
							local75 = local58;
						}
						local75++;
						local107 = local75 < arg3 ? local75 : arg3;
						if (local80 < local52) {
							local82 = local80;
							local80 = local52;
						}
						local127 = arg7 < local82 ? local82 : arg7;
						local80++;
						local139 = arg5 < local70 ? local70 : arg5;
						local146 = local80 < arg6 ? local80 : arg6;
					} else {
						local127 = local52 <= arg7 ? arg7 : local52;
						local139 = local58 <= arg5 ? arg5 : local58;
						local70 = local13.anInt513 + local58;
						local107 = arg3 > local70 ? local70 : arg3;
						local82 = local13.anInt498 + local52;
						local146 = local82 >= arg6 ? arg6 : local82;
					}
				}
				if (local13 == Static17.aClass4_Sub8_1) {
					Static87.aBoolean120 = true;
					Static63.anInt1642 = local52;
					Static63.anInt1641 = local58;
				}
				if (!local13.aBoolean37 || local107 > local139 && local146 > local127) {
					if (local13.anInt458 == 1337) {
						Static63.method1095(local13);
					} else if (local13.anInt458 == 1338) {
						Static47.method834(local52, local58);
					} else {
						if (local13.anInt473 == 0) {
							if (!local13.aBoolean37 && Static31.method444(local13) && Static40.aClass4_Sub8_8 != local13) {
								continue;
							}
							method71(local13.anInt514, local52 - local13.anInt494, local58 - local13.anInt492, local107, arg4, local139, local146, local127);
							if (local13.aClass4_Sub8Array1 != null) {
								method71(local13.anInt514, local52 - local13.anInt494, local58 + -local13.anInt492, local107, local13.aClass4_Sub8Array1, local139, local146, local127);
							}
							@Pc(318) Class4_Sub14 local318 = (Class4_Sub14) Static42.aClass28_3.method770((long) local13.anInt514);
							if (local318 != null) {
								Static23.method350(local52, local127, local107, local318.anInt1980, local58, local146, local139);
							}
						}
						if (local13.aBoolean37) {
							@Pc(335) boolean local335 = false;
							@Pc(353) boolean local353;
							if (Static2.anInt31 >= local139 && local127 <= Static126.anInt2734 && local107 > Static2.anInt31 && local146 > Static126.anInt2734) {
								local353 = true;
							} else {
								local353 = false;
							}
							if (Static122.anInt2680 == 1 && local353) {
								local335 = true;
							}
							@Pc(366) boolean local366 = false;
							if (Static38.anInt1093 == 1 && local139 <= Static75.anInt1928 && Static20.anInt427 >= local127 && local107 > Static75.anInt1928 && Static20.anInt427 < local146) {
								local366 = true;
							}
							if (local366) {
								Static31.method451(local13, Static75.anInt1928 - local58, Static20.anInt427 + -local52);
							}
							if (Static17.aClass4_Sub8_1 != null && local13 != Static17.aClass4_Sub8_1 && local353 && Static126.method1912(Static35.method627(local13))) {
								Static77.aClass4_Sub8_12 = local13;
							}
							if (Static55.aClass4_Sub8_11 == local13) {
								Static28.anInt586 = local52;
								Static43.aBoolean17 = true;
								Static54.anInt2513 = local58;
							}
							if (local13.aBoolean36) {
								@Pc(446) Class4_Sub20 local446;
								if (local353 && Static124.anInt2718 != 0 && local13.anObjectArray9 != null) {
									local446 = new Class4_Sub20();
									local446.anObjectArray28 = local13.anObjectArray9;
									local446.aClass4_Sub8_14 = local13;
									local446.anInt2295 = Static124.anInt2718;
									Static97.aClass78_10.method1914(local446);
								}
								if (Static17.aClass4_Sub8_1 != null || Static23.aClass4_Sub8_7 != null || Static32.aBoolean56) {
									local353 = false;
									local335 = false;
									local366 = false;
								}
								if (!local13.aBoolean41 && local366) {
									local13.aBoolean41 = true;
									if (local13.anObjectArray4 != null) {
										local446 = new Class4_Sub20();
										local446.anInt2295 = Static20.anInt427 - local52;
										local446.aClass4_Sub8_14 = local13;
										local446.anObjectArray28 = local13.anObjectArray4;
										local446.anInt2288 = Static75.anInt1928 - local58;
										Static97.aClass78_10.method1914(local446);
									}
								}
								if (local13.aBoolean41 && local335 && local13.anObjectArray8 != null) {
									local446 = new Class4_Sub20();
									local446.anInt2295 = Static126.anInt2734 - local52;
									local446.aClass4_Sub8_14 = local13;
									local446.anObjectArray28 = local13.anObjectArray8;
									local446.anInt2288 = Static2.anInt31 - local58;
									Static97.aClass78_10.method1914(local446);
								}
								if (local13.aBoolean41 && !local335) {
									local13.aBoolean41 = false;
									if (local13.anObjectArray5 != null) {
										local446 = new Class4_Sub20();
										local446.aClass4_Sub8_14 = local13;
										local446.anObjectArray28 = local13.anObjectArray5;
										local446.anInt2288 = Static2.anInt31 - local58;
										local446.anInt2295 = Static126.anInt2734 - local52;
										Static120.aClass78_13.method1914(local446);
									}
								}
								if (local335 && local13.anObjectArray18 != null) {
									local446 = new Class4_Sub20();
									local446.aClass4_Sub8_14 = local13;
									local446.anInt2295 = Static126.anInt2734 - local52;
									local446.anObjectArray28 = local13.anObjectArray18;
									local446.anInt2288 = Static2.anInt31 - local58;
									Static97.aClass78_10.method1914(local446);
								}
								if (!local13.aBoolean33 && local353) {
									local13.aBoolean33 = true;
									if (local13.anObjectArray21 != null) {
										local446 = new Class4_Sub20();
										local446.anObjectArray28 = local13.anObjectArray21;
										local446.aClass4_Sub8_14 = local13;
										local446.anInt2295 = Static126.anInt2734 - local52;
										local446.anInt2288 = Static2.anInt31 - local58;
										Static97.aClass78_10.method1914(local446);
									}
								}
								if (local13.aBoolean33 && local353 && local13.anObjectArray7 != null) {
									local446 = new Class4_Sub20();
									local446.anObjectArray28 = local13.anObjectArray7;
									local446.aClass4_Sub8_14 = local13;
									local446.anInt2295 = Static126.anInt2734 - local52;
									local446.anInt2288 = Static2.anInt31 - local58;
									Static97.aClass78_10.method1914(local446);
								}
								if (local13.aBoolean33 && !local353) {
									local13.aBoolean33 = false;
									if (local13.anObjectArray10 != null) {
										local446 = new Class4_Sub20();
										local446.anInt2288 = Static2.anInt31 - local58;
										local446.aClass4_Sub8_14 = local13;
										local446.anObjectArray28 = local13.anObjectArray10;
										local446.anInt2295 = Static126.anInt2734 - local52;
										Static120.aClass78_13.method1914(local446);
									}
								}
								if (local13.anObjectArray6 != null) {
									local446 = new Class4_Sub20();
									local446.anObjectArray28 = local13.anObjectArray6;
									local446.aClass4_Sub8_14 = local13;
									Static72.aClass78_8.method1914(local446);
								}
								@Pc(786) int local786;
								@Pc(788) int local788;
								@Pc(800) Class4_Sub20 local800;
								if (local13.anObjectArray17 != null && Static57.anInt1490 > local13.anInt504) {
									if (local13.anIntArray72 == null || Static57.anInt1490 - local13.anInt504 > 32) {
										local446 = new Class4_Sub20();
										local446.anObjectArray28 = local13.anObjectArray17;
										local446.aClass4_Sub8_14 = local13;
										Static97.aClass78_10.method1914(local446);
									} else {
										label369: for (local80 = local13.anInt504; local80 < Static57.anInt1490; local80++) {
											local786 = Static90.anIntArray298[local80 & 0x1F];
											for (local788 = 0; local788 < local13.anIntArray72.length; local788++) {
												if (local13.anIntArray72[local788] == local786) {
													local800 = new Class4_Sub20();
													local800.anObjectArray28 = local13.anObjectArray17;
													local800.aClass4_Sub8_14 = local13;
													Static97.aClass78_10.method1914(local800);
													break label369;
												}
											}
										}
									}
									local13.anInt504 = Static57.anInt1490;
								}
								if (local13.anObjectArray12 != null && Static58.anInt1530 > local13.anInt500) {
									if (local13.anIntArray69 == null || Static58.anInt1530 - local13.anInt500 > 32) {
										local446 = new Class4_Sub20();
										local446.aClass4_Sub8_14 = local13;
										local446.anObjectArray28 = local13.anObjectArray12;
										Static97.aClass78_10.method1914(local446);
									} else {
										label349: for (local80 = local13.anInt500; local80 < Static58.anInt1530; local80++) {
											local786 = Static66.anIntArray227[local80 & 0x1F];
											for (local788 = 0; local788 < local13.anIntArray69.length; local788++) {
												if (local786 == local13.anIntArray69[local788]) {
													local800 = new Class4_Sub20();
													local800.aClass4_Sub8_14 = local13;
													local800.anObjectArray28 = local13.anObjectArray12;
													Static97.aClass78_10.method1914(local800);
													break label349;
												}
											}
										}
									}
									local13.anInt500 = Static58.anInt1530;
								}
								if (local13.anObjectArray27 != null && Static121.anInt2619 > local13.anInt456) {
									if (local13.anIntArray75 == null || Static121.anInt2619 - local13.anInt456 > 32) {
										local446 = new Class4_Sub20();
										local446.anObjectArray28 = local13.anObjectArray27;
										local446.aClass4_Sub8_14 = local13;
										Static97.aClass78_10.method1914(local446);
									} else {
										label329: for (local80 = local13.anInt456; local80 < Static121.anInt2619; local80++) {
											local786 = Static48.anIntArray155[local80 & 0x1F];
											for (local788 = 0; local788 < local13.anIntArray75.length; local788++) {
												if (local13.anIntArray75[local788] == local786) {
													local800 = new Class4_Sub20();
													local800.aClass4_Sub8_14 = local13;
													local800.anObjectArray28 = local13.anObjectArray27;
													Static97.aClass78_10.method1914(local800);
													break label329;
												}
											}
										}
									}
									local13.anInt456 = Static121.anInt2619;
								}
								if (local13.anInt476 < Static97.anInt2253 && local13.anObjectArray14 != null) {
									local446 = new Class4_Sub20();
									local446.aClass4_Sub8_14 = local13;
									local446.anObjectArray28 = local13.anObjectArray14;
									Static97.aClass78_10.method1914(local446);
								}
								if (Static72.anInt1883 > local13.anInt476 && local13.anObjectArray3 != null) {
									local446 = new Class4_Sub20();
									local446.aClass4_Sub8_14 = local13;
									local446.anObjectArray28 = local13.anObjectArray3;
									Static97.aClass78_10.method1914(local446);
								}
								if (local13.anInt476 < Static73.anInt1893 && local13.anObjectArray26 != null) {
									local446 = new Class4_Sub20();
									local446.aClass4_Sub8_14 = local13;
									local446.anObjectArray28 = local13.anObjectArray26;
									Static97.aClass78_10.method1914(local446);
								}
								if (Static119.anInt2566 > local13.anInt476 && local13.anObjectArray25 != null) {
									local446 = new Class4_Sub20();
									local446.aClass4_Sub8_14 = local13;
									local446.anObjectArray28 = local13.anObjectArray25;
									Static97.aClass78_10.method1914(local446);
								}
								local13.anInt476 = Static36.anInt1031;
								if (local13.anObjectArray19 != null) {
									for (local80 = 0; local80 < Static39.anInt1130; local80++) {
										@Pc(1115) Class4_Sub20 local1115 = new Class4_Sub20();
										local1115.aClass4_Sub8_14 = local13;
										local1115.anInt2294 = Static122.anIntArray389[local80];
										local1115.anInt2290 = Static41.anIntArray130[local80];
										local1115.anObjectArray28 = local13.anObjectArray19;
										Static97.aClass78_10.method1914(local1115);
									}
								}
							}
						}
						if (!local13.aBoolean37) {
							if (Static17.aClass4_Sub8_1 != null || Static23.aClass4_Sub8_7 != null || Static32.aBoolean56) {
								return;
							}
							if ((local13.anInt467 >= 0 || local13.anInt520 != 0) && Static2.anInt31 >= local139 && local127 <= Static126.anInt2734 && local107 > Static2.anInt31 && Static126.anInt2734 < local146) {
								if (local13.anInt467 < 0) {
									Static40.aClass4_Sub8_8 = local13;
								} else {
									Static40.aClass4_Sub8_8 = arg4[local13.anInt467];
								}
							}
							if (local13.anInt473 == 8 && Static2.anInt31 >= local139 && local127 <= Static126.anInt2734 && Static2.anInt31 < local107 && Static126.anInt2734 < local146) {
								Static65.aClass4_Sub8_4 = local13;
							}
							if (local13.anInt482 > local13.anInt498) {
								Static64.method1099(Static2.anInt31, local58 + local13.anInt513, local13, local13.anInt482, local13.anInt498, local52, Static126.anInt2734);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
	public static void method72() {
		Static32.aClass72_13.method1786();
		Static3.aClass72_23.method1786();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!hc;I)V")
	public static void method73(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static38.anInt1093 != 1) {
			return;
		}
		if (Static75.anInt1928 >= 280 && Static75.anInt1928 <= 294 && Static20.anInt427 >= 4 && Static20.anInt427 <= 18) {
			Static84.method1427(0, 0);
			return;
		}
		if (Static75.anInt1928 >= 295 && Static75.anInt1928 <= 360 && Static20.anInt427 >= 4 && Static20.anInt427 <= 18) {
			Static84.method1427(1, 0);
			return;
		}
		if (Static75.anInt1928 >= 390 && Static75.anInt1928 <= 404 && Static20.anInt427 >= 4 && Static20.anInt427 <= 18) {
			Static84.method1427(0, 1);
			return;
		}
		if (Static75.anInt1928 >= 405 && Static75.anInt1928 <= 470 && Static20.anInt427 >= 4 && Static20.anInt427 <= 18) {
			Static84.method1427(1, 1);
			return;
		}
		if (Static75.anInt1928 >= 500 && Static75.anInt1928 <= 514 && Static20.anInt427 >= 4 && Static20.anInt427 <= 18) {
			Static84.method1427(0, 2);
			return;
		}
		if (Static75.anInt1928 >= 515 && Static75.anInt1928 <= 580 && Static20.anInt427 >= 4 && Static20.anInt427 <= 18) {
			Static84.method1427(1, 2);
			return;
		}
		if (Static75.anInt1928 >= 610 && Static75.anInt1928 <= 624 && Static20.anInt427 >= 4 && Static20.anInt427 <= 18) {
			Static84.method1427(0, 3);
			return;
		}
		if (Static75.anInt1928 >= 625 && Static75.anInt1928 <= 690 && Static20.anInt427 >= 4 && Static20.anInt427 <= 18) {
			Static84.method1427(1, 3);
			return;
		}
		if (Static75.anInt1928 >= 708 && Static20.anInt427 >= 4 && Static75.anInt1928 <= 758 && Static20.anInt427 <= 20) {
			Static103.aBoolean137 = false;
			Static73.aClass4_Sub4_Sub5_Sub2_2.method910(0, 0);
			Static68.aClass4_Sub4_Sub5_Sub2_1.method910(382, 0);
			Static85.aClass4_Sub4_Sub5_Sub4_5.method1836(382 - Static85.aClass4_Sub4_Sub5_Sub4_5.anInt2607 / 2, 18);
			return;
		}
		if (Static41.anInt1150 == -1) {
			return;
		}
		@Pc(259) Class61 local259 = Static81.aClass61Array1[Static41.anInt1150];
		if (local259.aBoolean136 == Static68.aBoolean108) {
			@Pc(283) byte[] local283 = Static59.method1017(new Class76[] { local259.aClass76_1069, Static24.aClass76_206 }).method1866();
			Static104.aString4 = new String(local283, 0, local283.length);
			if (Static21.anInt508 != 0) {
				Static6.anInt138 = 43594;
				Static38.anInt1095 = 43594;
				Static34.anInt967 = 443;
				Static21.anInt508 = 0;
			}
			Static103.aBoolean137 = false;
			Static28.anInt591 = local259.anInt2309;
			Static73.aClass4_Sub4_Sub5_Sub2_2.method910(0, 0);
			Static68.aClass4_Sub4_Sub5_Sub2_1.method910(382, 0);
			Static85.aClass4_Sub4_Sub5_Sub4_5.method1836(382 - Static85.aClass4_Sub4_Sub5_Sub4_5.anInt2607 / 2, 18);
			return;
		}
		@Pc(381) Class76 local381 = Static59.method1017(new Class76[] { Static105.aClass76_1099, local259.aClass76_1069, Static24.aClass76_206, Static133.aClass76_1321, Static77.aClass76_835, Static63.method1092(Static76.aBoolean119 ? 1 : 0), Static63.aClass76_683, Static63.method1092(Static132.anInt2821), Static10.aClass76_95, Static63.method1092(Static36.anInt1017) });
		try {
			arg0.getAppletContext().showDocument(local381.method1887(), "_self");
		} catch (@Pc(390) Exception local390) {
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
	public static void method75() {
		aClass76_43 = null;
		aClass17_3 = null;
		aClass76_44 = null;
		aClass76_45 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I[Lclient!dd;B)V")
	public static void method76(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub8[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class4_Sub8 local9 = arg1[local3];
			if (local9 != null && arg0 == local9.anInt489 && (!local9.aBoolean37 || !Static31.method444(local9))) {
				if (local9.anInt473 == 0) {
					if (!local9.aBoolean37 && Static31.method444(local9) && local9 != Static40.aClass4_Sub8_8) {
						continue;
					}
					method76(local9.anInt514, arg1);
					if (local9.aClass4_Sub8Array1 != null) {
						method76(local9.anInt514, local9.aClass4_Sub8Array1);
					}
					@Pc(60) Class4_Sub14 local60 = (Class4_Sub14) Static42.aClass28_3.method770((long) local9.anInt514);
					if (local60 != null) {
						Static85.method1436(local60.anInt1980);
					}
				}
				if (local9.anInt473 == 6) {
					@Pc(88) int local88;
					if (local9.anInt507 != -1 || local9.anInt521 != -1) {
						@Pc(83) boolean local83 = Static2.method14(local9);
						if (local83) {
							local88 = local9.anInt521;
						} else {
							local88 = local9.anInt507;
						}
						if (local88 != -1) {
							@Pc(100) Class4_Sub4_Sub9 local100 = Static118.method1796(local88);
							local9.anInt527 += Static1.anInt5;
							while (local9.anInt527 > local100.anIntArray200[local9.anInt519]) {
								local9.anInt527 -= local100.anIntArray200[local9.anInt519];
								local9.anInt519++;
								if (local9.anInt519 >= local100.anIntArray196.length) {
									local9.anInt519 -= local100.anInt1569;
									if (local9.anInt519 < 0 || local9.anInt519 >= local100.anIntArray196.length) {
										local9.anInt519 = 0;
									}
								}
								Static63.method1095(local9);
							}
						}
					}
					if (local9.anInt460 != 0 && !local9.aBoolean37) {
						@Pc(174) int local174 = local9.anInt460 >> 16;
						@Pc(178) int local178 = local174 * Static1.anInt5;
						local88 = local9.anInt460 << 16 >> 16;
						local9.anInt509 = local178 + local9.anInt509 & 0x7FF;
						local88 *= Static1.anInt5;
						local9.anInt470 = local9.anInt470 + local88 & 0x7FF;
						Static63.method1095(local9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "(I)V")
	public static void method77() {
		Static119.aClass72_27.method1786();
		Static115.aClass72_26.method1786();
		Static35.aClass72_15.method1786();
		Static133.aClass72_29.method1786();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZIZZ)Lclient!dc;")
	public static Class17_Sub1 method78(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class58 local10 = null;
		if (Static66.aClass68_7 != null) {
			local10 = new Class58(arg1, Static66.aClass68_7, Static20.aClass68Array1[arg1], 1000000);
		}
		return new Class17_Sub1(local10, Static77.aClass58_4, arg1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Z")
	public static boolean method79(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static95.anIntArray311[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1004;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([Lclient!dd;II)V")
	public static void method80(@OriginalArg(0) Class4_Sub8[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(18) Class4_Sub8 local18 = arg0[local12];
			if (local18 != null) {
				if (local18.anInt473 == 0) {
					if (local18.aClass4_Sub8Array1 != null) {
						method80(local18.aClass4_Sub8Array1, arg1);
					}
					@Pc(42) Class4_Sub14 local42 = (Class4_Sub14) Static42.aClass28_3.method770((long) local18.anInt514);
					if (local42 != null) {
						Static6.method85(arg1, local42.anInt1980);
					}
				}
				@Pc(61) Class4_Sub20 local61;
				if (arg1 == 0 && local18.anObjectArray22 != null) {
					local61 = new Class4_Sub20();
					local61.anObjectArray28 = local18.anObjectArray22;
					local61.aClass4_Sub8_14 = local18;
					Static20.method307(local61);
				}
				if (arg1 == 1 && local18.anObjectArray20 != null) {
					if (local18.anInt466 >= 0) {
						@Pc(90) Class4_Sub8 local90 = Static52.method946(local18.anInt514);
						if (local90 == null || local90.aClass4_Sub8Array1 == null || local90.aClass4_Sub8Array1.length <= local18.anInt466 || local90.aClass4_Sub8Array1[local18.anInt466] != local18) {
							continue;
						}
					}
					local61 = new Class4_Sub20();
					local61.aClass4_Sub8_14 = local18;
					local61.anObjectArray28 = local18.anObjectArray20;
					Static20.method307(local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method81(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static20.method311(local18) : local18;
		} else if (arg0 instanceof Class34) {
			@Pc(32) Class34 local32 = (Class34) arg0;
			return local32.method1455();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
