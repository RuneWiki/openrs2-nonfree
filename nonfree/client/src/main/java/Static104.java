import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!td", name = "cd", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1537 = Static69.method1153("backtop1");

	@OriginalMember(owner = "client!td", name = "kd", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1538 = Static69.method1153("Enter name of player to delete from list");

	@OriginalMember(owner = "client!td", name = "pd", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1539 = Static69.method1153("(U1");

	@OriginalMember(owner = "client!td", name = "qd", descriptor = "Lclient!dd;")
	public static Class19 aClass19_94 = new Class19(30);

	@OriginalMember(owner = "client!td", name = "td", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1540 = aClass64_1538;

	@OriginalMember(owner = "client!td", name = "ud", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1541 = Static69.method1153("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!td", name = "wd", descriptor = "I")
	public static volatile int anInt2431 = 0;

	@OriginalMember(owner = "client!td", name = "yd", descriptor = "I")
	public static volatile int anInt2433 = 0;

	@OriginalMember(owner = "client!td", name = "Dd", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1542 = Static69.method1153("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!td", name = "Id", descriptor = "[Lclient!ke;")
	public static Class41_Sub1[] aClass41_Sub1Array1 = new Class41_Sub1[256];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public static void method1694(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && Static68.anInt1536 == 0) {
			Static65.method1106();
		} else if (arg0 != -1 && arg0 != Static6.anInt317 && Static31.anInt803 != 0 && Static68.anInt1536 == 0) {
			Static65.method1105(Static31.anInt803, 0, Static114.aClass41_Sub1_21, arg0);
		}
		Static6.anInt317 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!pb;Lclient!pb;I)V")
	public static void method1695(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1) {
		Static102.aClass41_59 = arg1;
		Static116.aClass41_75 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(B)V")
	public static void method1696() {
		Static5.anIntArrayArrayArray4 = new int[4][105][105];
		Static101.aByteArrayArrayArray5 = new byte[4][104][104];
		Static106.aByteArrayArrayArray6 = new byte[4][104][104];
		Static110.aByteArrayArrayArray7 = new byte[4][105][105];
		Static96.anIntArray435 = new int[104];
		Static17.anInt569 = 99;
		Static75.aByteArrayArrayArray3 = new byte[4][104][104];
		Static79.anIntArray284 = new int[104];
		Static38.anIntArrayArray7 = new int[105][105];
		Static48.anIntArray381 = new int[104];
		Static94.anIntArray310 = new int[104];
		Static1.aByteArrayArrayArray1 = new byte[4][104][104];
		Static28.anIntArray357 = new int[104];
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	public static void method1698() {
		aClass41_Sub1Array1 = null;
		aClass64_1537 = null;
		aClass64_1540 = null;
		aClass19_94 = null;
		aClass64_1542 = null;
		aClass64_1539 = null;
		aClass64_1538 = null;
		aClass64_1541 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[Lclient!nd;IIIIIIIIII)V")
	public static void method1699(@OriginalArg(1) Class1_Sub1_Sub11[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg8 > arg10 || arg4 > arg6 || arg10 >= arg3 || arg6 >= arg2) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
			@Pc(26) Class1_Sub1_Sub11 local26 = arg0[local20];
			if (local26 != null && arg9 == local26.anInt1739 && (!local26.aBoolean95 || !Static99.method1605(local26))) {
				@Pc(53) int local53 = arg8 + local26.anInt1690 - arg7;
				@Pc(60) int local60 = arg4 + local26.anInt1702 - arg1;
				if ((local26.anInt1725 >= 0 || local26.anInt1712 != 0) && arg10 >= local53 && local60 <= arg6 && arg10 < local26.anInt1700 + local53 && local26.anInt1707 + local60 > arg6) {
					if (local26.anInt1725 >= 0) {
						Static39.anInt909 = local26.anInt1725;
					} else {
						Static39.anInt909 = local20;
					}
				}
				if (local26.anInt1697 == 8 && local53 <= arg10 && local60 <= arg6 && local53 + local26.anInt1700 > arg10 && local26.anInt1707 + local60 > arg6) {
					Static121.anInt2879 = local20;
				}
				if (local26.anInt1697 == 0) {
					if (!local26.aBoolean95 && Static99.method1605(local26) && !Static99.method1600(arg5, local20)) {
						continue;
					}
					method1699(arg0, local26.anInt1689, local60 + local26.anInt1707, local53 - -local26.anInt1700, local60, arg5, arg6, local26.anInt1706, local53, local26.anInt1717, arg10);
					if (local26.aClass1_Sub1_Sub11Array2 != null) {
						method1699(local26.aClass1_Sub1_Sub11Array2, local26.anInt1689, local60 + local26.anInt1707, local53 + local26.anInt1700, local60, arg5, arg6, local26.anInt1706, local53, local26.anInt1717, arg10);
					}
					if (local26.anInt1692 > local26.anInt1707 && !local26.aBoolean95) {
						Static72.method1194(local26.anInt1692, local26.anInt1707, local60, arg6, arg5, arg10, local26, local53 + local26.anInt1700);
					}
					if (!local26.aBoolean95) {
						continue;
					}
				}
				if (local26.anInt1720 == 1 && local53 <= arg10 && arg6 >= local60 && local26.anInt1700 + local53 > arg10 && arg6 < local26.anInt1707 + local60) {
					@Pc(278) boolean local278 = false;
					if (local26.anInt1709 != 0) {
						local278 = Static94.method1543(local26);
					}
					if (!local278) {
						Static2.method63(0, Static60.aClass64_862, local26.anInt1717, 42, local26.aClass64_1069, 0);
					}
				}
				if (local26.anInt1720 == 2 && !Static103.aBoolean143 && local53 <= arg10 && local60 <= arg6 && local53 + local26.anInt1700 > arg10 && arg6 < local26.anInt1707 + local60) {
					@Pc(349) Class64 local349 = Static16.method305(local26);
					if (local349 != null) {
						Static2.method63(-1, Static82.method1383(new Class64[] { Static70.aClass64_987, local26.aClass64_1065 }), local26.anInt1717, 4, local349, 0);
					}
				}
				if (local26.anInt1720 == 3 && local53 <= arg10 && arg6 >= local60 && local26.anInt1700 + local53 > arg10 && arg6 < local26.anInt1707 + local60) {
					@Pc(413) byte local413;
					if (arg5 == 3) {
						local413 = 55;
					} else {
						local413 = 39;
					}
					Static2.method63(0, Static60.aClass64_862, local26.anInt1717, local413, Static20.aClass64_377, 0);
				}
				if (local26.anInt1720 == 4 && arg10 >= local53 && arg6 >= local60 && arg10 < local26.anInt1700 + local53 && arg6 < local60 + local26.anInt1707) {
					Static2.method63(0, Static60.aClass64_862, local26.anInt1717, 25, local26.aClass64_1069, 0);
				}
				if (local26.anInt1720 == 5 && local53 <= arg10 && local60 <= arg6 && local26.anInt1700 + local53 > arg10 && arg6 < local26.anInt1707 + local60) {
					Static2.method63(0, Static60.aClass64_862, local26.anInt1717, 53, local26.aClass64_1069, 0);
				}
				if (local26.anInt1720 == 6 && Static15.anInt468 == -1 && local53 <= arg10 && local60 <= arg6 && local26.anInt1700 + local53 > arg10 && arg6 < local26.anInt1707 + local60) {
					Static2.method63(-1, Static60.aClass64_862, local26.anInt1717, 45, local26.aClass64_1069, 0);
				}
				@Pc(570) int local570;
				@Pc(564) int local564;
				if (local26.anInt1697 == 2) {
					local564 = 0;
					for (@Pc(566) int local566 = 0; local566 < local26.anInt1707; local566++) {
						for (local570 = 0; local570 < local26.anInt1700; local570++) {
							@Pc(581) int local581 = local53 + local570 * (local26.anInt1688 + 32);
							@Pc(592) int local592 = local60 + (local26.anInt1740 + 32) * local566;
							if (local564 < 20) {
								local581 += local26.anIntArray246[local564];
								local592 += local26.anIntArray250[local564];
							}
							if (arg10 >= local581 && local592 <= arg6 && arg10 < local581 + 32 && local592 + 32 > arg6) {
								Static15.anInt467 = local564;
								Static114.anInt2739 = local26.anInt1717;
								if (local26.anIntArray245[local564] > 0) {
									@Pc(659) Class1_Sub1_Sub6 local659 = Static106.method1739(local26.anIntArray245[local564] - 1);
									if (Static121.anInt2872 == 1 && Static6.method213(Static31.method548(local26))) {
										if (local26.anInt1717 != Static67.anInt1531 || Static43.anInt969 != local564) {
											Static2.method63(local564, Static82.method1383(new Class64[] { Static13.aClass64_304, Static20.aClass64_378, local659.aClass64_646 }), local26.anInt1717, 29, Static95.aClass64_1380, local659.anInt960);
										}
									} else if (!Static103.aBoolean143 || !Static6.method213(Static31.method548(local26))) {
										@Pc(722) Class64[] local722 = local659.aClass64Array11;
										if (Static86.aBoolean122) {
											local722 = Static23.method457(local722);
										}
										@Pc(740) int local740;
										@Pc(753) byte local753;
										if (Static6.method213(Static31.method548(local26))) {
											for (local740 = 4; local740 >= 3; local740--) {
												if (local722 != null && local722[local740] != null) {
													if (local740 == 3) {
														local753 = 31;
													} else {
														local753 = 57;
													}
													Static2.method63(local564, Static82.method1383(new Class64[] { Static19.aClass64_372, local659.aClass64_646 }), local26.anInt1717, local753, local722[local740], local659.anInt960);
												} else if (local740 == 4) {
													Static2.method63(local564, Static82.method1383(new Class64[] { Static19.aClass64_372, local659.aClass64_646 }), local26.anInt1717, 57, Static69.aClass64_976, local659.anInt960);
												}
											}
										}
										if (Static58.method970(Static31.method548(local26))) {
											Static2.method63(local564, Static82.method1383(new Class64[] { Static19.aClass64_372, local659.aClass64_646 }), local26.anInt1717, 23, Static95.aClass64_1380, local659.anInt960);
										}
										if (Static6.method213(Static31.method548(local26)) && local722 != null) {
											for (local740 = 2; local740 >= 0; local740--) {
												if (local722[local740] != null) {
													local753 = 0;
													if (local740 == 0) {
														local753 = 28;
													}
													if (local740 == 1) {
														local753 = 50;
													}
													if (local740 == 2) {
														local753 = 6;
													}
													Static2.method63(local564, Static82.method1383(new Class64[] { Static19.aClass64_372, local659.aClass64_646 }), local26.anInt1717, local753, local722[local740], local659.anInt960);
												}
											}
										}
										local722 = local26.aClass64Array12;
										if (Static86.aBoolean122) {
											local722 = Static23.method457(local722);
										}
										if (local722 != null) {
											for (local740 = 4; local740 >= 0; local740--) {
												if (local722[local740] != null) {
													local753 = 0;
													if (local740 == 0) {
														local753 = 37;
													}
													if (local740 == 1) {
														local753 = 10;
													}
													if (local740 == 2) {
														local753 = 1;
													}
													if (local740 == 3) {
														local753 = 48;
													}
													if (local740 == 4) {
														local753 = 36;
													}
													Static2.method63(local564, Static82.method1383(new Class64[] { Static19.aClass64_372, local659.aClass64_646 }), local26.anInt1717, local753, local722[local740], local659.anInt960);
												}
											}
										}
										Static2.method63(local564, Static82.method1383(new Class64[] { Static19.aClass64_372, local659.aClass64_646 }), local26.anInt1717, 1006, Static102.aClass64_1480, local659.anInt960);
									} else if ((Static18.anInt582 & 0x10) == 16) {
										Static2.method63(local564, Static82.method1383(new Class64[] { Static27.aClass64_579, Static20.aClass64_378, local659.aClass64_646 }), local26.anInt1717, 41, Static98.aClass64_1399, local659.anInt960);
									}
								}
							}
							local564++;
						}
					}
				}
				if (local26.aBoolean95) {
					if (Static103.aBoolean143) {
						if (Static74.method1227(Static31.method548(local26)) && (Static18.anInt582 & 0x20) == 32 && local53 <= arg10 && local60 <= arg6 && local26.anInt1700 + local53 > arg10 && local26.anInt1707 + local60 > arg6) {
							Static2.method63(local26.anInt1742, Static82.method1383(new Class64[] { Static27.aClass64_579, Static100.aClass64_1418, local26.aClass64_1068 }), local26.anInt1717, 15, Static98.aClass64_1399, 0);
						}
					} else if (arg10 >= local53 && local60 <= arg6 && local53 + local26.anInt1700 > arg10 && arg6 < local60 + local26.anInt1707) {
						@Pc(1118) Class64 local1118;
						for (local564 = 9; local564 >= 5; local564--) {
							local1118 = Static116.method2043(local26, local564);
							if (local1118 != null) {
								Static2.method63(local26.anInt1742, local26.aClass64_1068, local26.anInt1717, 24, local1118, local564 + 1);
							}
						}
						local1118 = Static16.method305(local26);
						if (local1118 != null) {
							Static2.method63(local26.anInt1742, local26.aClass64_1068, local26.anInt1717, 4, local1118, 0);
						}
						for (local570 = 4; local570 >= 0; local570--) {
							@Pc(1173) Class64 local1173 = Static116.method2043(local26, local570);
							if (local1173 != null) {
								Static2.method63(local26.anInt1742, local26.aClass64_1068, local26.anInt1717, 24, local1173, local570 + 1);
							}
						}
						if (Static94.method1544(Static31.method548(local26))) {
							Static2.method63(-1, Static60.aClass64_862, local26.anInt1717, 45, local26.aClass64_1069, 0);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!id;IIII)V")
	public static void method1700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub6 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(32) int local32;
		if (arg1 < 0 || arg1 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local32 = arg3.method1837();
				if (local32 == 0) {
					break;
				}
				if (local32 == 1) {
					arg3.method1837();
					break;
				}
				if (local32 <= 49) {
					arg3.method1837();
				}
			}
			return;
		}
		Static18.aByteArrayArrayArray2[arg6][arg1][arg5] = 0;
		while (true) {
			local32 = arg3.method1837();
			if (local32 == 0) {
				if (arg6 == 0) {
					Static102.anIntArrayArrayArray5[0][arg1][arg5] = -Static89.method1448(arg2 + arg1 + 932731, arg4 + arg5 + 556238) * 8;
				} else {
					Static102.anIntArrayArrayArray5[arg6][arg1][arg5] = Static102.anIntArrayArrayArray5[arg6 - 1][arg1][arg5] - 240;
				}
				break;
			}
			if (local32 == 1) {
				@Pc(95) int local95 = arg3.method1837();
				if (local95 == 1) {
					local95 = 0;
				}
				if (arg6 == 0) {
					Static102.anIntArrayArrayArray5[0][arg1][arg5] = -local95 * 8;
				} else {
					Static102.anIntArrayArrayArray5[arg6][arg1][arg5] = Static102.anIntArrayArrayArray5[arg6 - 1][arg1][arg5] - local95 * 8;
				}
				break;
			}
			if (local32 <= 49) {
				Static106.aByteArrayArrayArray6[arg6][arg1][arg5] = arg3.method1824();
				Static101.aByteArrayArrayArray5[arg6][arg1][arg5] = (byte) ((local32 - 2) / 4);
				Static1.aByteArrayArrayArray1[arg6][arg1][arg5] = (byte) (arg0 + local32 - 2 & 0x3);
			} else if (local32 <= 81) {
				Static18.aByteArrayArrayArray2[arg6][arg1][arg5] = (byte) (local32 - 49);
			} else {
				Static75.aByteArrayArrayArray3[arg6][arg1][arg5] = (byte) (local32 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V")
	public static void method1701() {
		@Pc(1) Class24 local1 = Static51.aClass24_1;
		synchronized (Static51.aClass24_1) {
			Static94.anInt2145 = Static6.anInt320;
			Static81.anInt1404 = Static22.anInt680;
			Static63.anInt1474 = Static87.anInt1981;
			Static17.anInt576 = Static61.anInt1423;
			Static118.anInt2842 = anInt2431;
			Static96.anInt2745 = Static22.anInt675;
			Static94.aLong66 = Static74.aLong50;
			Static61.anInt1423 = 0;
		}
	}
}
