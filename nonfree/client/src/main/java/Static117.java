import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!wa", name = "cb", descriptor = "Lclient!id;")
	public static Class1_Sub6 aClass1_Sub6_5 = new Class1_Sub6(8);

	@OriginalMember(owner = "client!wa", name = "lb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1801 = Static69.method1153(" ");

	@OriginalMember(owner = "client!wa", name = "ob", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1802 = Static69.method1153("(U2");

	@OriginalMember(owner = "client!wa", name = "qb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1803 = Static69.method1153("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!wa", name = "rb", descriptor = "I")
	public static int anInt2814 = 0;

	@OriginalMember(owner = "client!wa", name = "ub", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1804 = Static69.method1153("System)2Update in: ");

	@OriginalMember(owner = "client!wa", name = "Ab", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1807 = Static69.method1153("Too many connections from your address)3");

	@OriginalMember(owner = "client!wa", name = "vb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1805 = aClass64_1807;

	@OriginalMember(owner = "client!wa", name = "xb", descriptor = "I")
	public static int anInt2816 = 0;

	@OriginalMember(owner = "client!wa", name = "yb", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1806 = Static69.method1153("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IJ)V")
	public static void method2058(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static85.method2016(arg0 - 1L);
			Static85.method2016(1L);
		} else {
			Static85.method2016(arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
	public static void method2059() {
		@Pc(7) Class64 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < Static48.anInt2603; local9++) {
			if (Static101.aClass64Array16[local9].method1473(Static19.aClass64_372) != -1) {
				local7 = Static101.aClass64Array16[local9].method1481(Static101.aClass64Array16[local9].method1473(Static19.aClass64_372));
				break;
			}
		}
		if (local7 == null) {
			Static19.method391();
			return;
		}
		@Pc(46) int local46 = Static109.anInt2635;
		@Pc(48) int local48 = Static71.anInt1611;
		@Pc(50) int local50 = Static110.anInt2655;
		if (local50 > 190) {
			local50 = 190;
		}
		if (local46 < 0) {
			local46 = 0;
		}
		@Pc(66) int local66 = Static119.anInt2852;
		Static47.method1957(local46, local48, local50, local66, 6116423);
		Static47.method1957(local46 + 1, local48 - -1, local50 - 2, 16, 0);
		Static47.method1950(local46 + 1, local48 - -18, local50 - 2, local66 + -19, 0);
		Static17.aClass1_Sub1_Sub5_Sub1_2.method666(local7, local46 + 3, local48 + 14, 6116423, false);
		@Pc(111) int local111 = Static63.anInt1474;
		@Pc(113) int local113 = Static81.anInt1404;
		if (Static12.anInt1938 == 0) {
			local111 -= 4;
			local113 -= 4;
		}
		if (Static12.anInt1938 == 1) {
			local111 -= 205;
			local113 -= 553;
		}
		if (Static12.anInt1938 == 2) {
			local111 -= 357;
			local113 -= 17;
		}
		for (@Pc(129) int local129 = 0; local129 < Static48.anInt2603; local129++) {
			@Pc(133) int local133 = 16777215;
			@Pc(146) int local146 = (Static48.anInt2603 - local129 - 1) * 15 + local48 + 31;
			@Pc(150) Class64 local150 = Static101.aClass64Array16[local129];
			if (local113 > local46 && local113 < local50 + local46 && local146 - 13 < local111 && local146 + 3 > local111) {
				local133 = 16776960;
			}
			if (local150.method1474(local7)) {
				local150 = local150.method1475(local150.method1469() - local7.method1469(), 0);
				if (local150.method1474(Static52.aClass64_1821)) {
					local150 = local150.method1475(local150.method1469() - Static52.aClass64_1821.method1469(), 0);
				}
			}
			Static17.aClass1_Sub1_Sub5_Sub1_2.method666(local150, local46 + 3, local146, local133, true);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Lclient!n;")
	public static Class1_Sub1_Sub10 method2063(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub1_Sub10 local13 = (Class1_Sub1_Sub10) Static102.aClass19_89.method410((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(27) byte[] local27 = Static45.aClass41_28.method1062(16, arg0);
		local13 = new Class1_Sub1_Sub10();
		if (local27 != null) {
			local13.method1177(new Class1_Sub6(local27));
		}
		Static102.aClass19_89.method409(local13, (long) arg0);
		return local13;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
	public static void method2064() {
		aClass64_1807 = null;
		aClass64_1805 = null;
		aClass1_Sub6_5 = null;
		aClass64_1802 = null;
		aClass64_1803 = null;
		aClass64_1804 = null;
		aClass64_1801 = null;
		aClass64_1806 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method2065(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136) {
			try {
				@Pc(23) Class11 local23 = (Class11) Class.forName("Class11_Sub1").getDeclaredConstructor().newInstance();
				local23.method1398(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!nc;IIIIIIILclient!ua;)V")
	public static void method2067(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class68 arg8) {
		@Pc(13) int local13 = Static102.anIntArrayArrayArray5[arg7][arg5][arg0];
		@Pc(23) int local23 = Static102.anIntArrayArrayArray5[arg7][arg5 + 1][arg0];
		@Pc(35) int local35 = Static102.anIntArrayArrayArray5[arg7][arg5 + 1][arg0 + 1];
		@Pc(45) int local45 = Static102.anIntArrayArrayArray5[arg7][arg5][arg0 + 1];
		@Pc(49) Class1_Sub1_Sub3 local49 = Static108.method1807(arg3);
		@Pc(60) int local60 = local35 + local23 + local13 + local45 >> 2;
		@Pc(66) int local66 = arg4 + (arg2 << 6);
		@Pc(78) int local78 = (arg3 << 14) + (arg0 << 7) + arg5 + 1073741824;
		if (local49.anInt395 == 1) {
			local66 += 256;
		}
		if (local49.anInt401 == 0) {
			local78 += Integer.MIN_VALUE;
		}
		if (arg4 == 22) {
			@Pc(116) Class1_Sub1_Sub2 local116;
			if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
				local116 = local49.method255(arg2, local13, local23, 22, local35, local45);
			} else {
				local116 = new Class1_Sub1_Sub2_Sub5(arg3, 22, arg2, local13, local23, local35, local45, local49.anInt382, true, null);
			}
			arg8.method1772(arg6, arg5, arg0, local60, local116, local78, local66);
			if (local49.aBoolean25 && local49.anInt401 == 1) {
				arg1.method1200(arg5, arg0);
			}
			return;
		}
		@Pc(189) Class1_Sub1_Sub2 local189;
		@Pc(219) int local219;
		if (arg4 == 10 || arg4 == 11) {
			if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
				local189 = local49.method255(arg2, local13, local23, 10, local35, local45);
			} else {
				local189 = new Class1_Sub1_Sub2_Sub5(arg3, 10, arg2, local13, local23, local35, local45, local49.anInt382, true, null);
			}
			if (local189 != null) {
				@Pc(222) int local222;
				if (arg2 == 1 || arg2 == 3) {
					local219 = local49.anInt411;
					local222 = local49.anInt420;
				} else {
					local219 = local49.anInt420;
					local222 = local49.anInt411;
				}
				@Pc(232) int local232 = 0;
				if (arg4 == 11) {
					local232 += 256;
				}
				arg8.method1754(arg6, arg5, arg0, local60, local219, local222, local189, local232, local78, local66);
			}
			if (local49.aBoolean25) {
				arg1.method1204(local49.anInt411, local49.anInt420, arg5, local49.aBoolean31, arg2, arg0);
			}
		} else if (arg4 >= 12) {
			if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
				local189 = local49.method255(arg2, local13, local23, arg4, local35, local45);
			} else {
				local189 = new Class1_Sub1_Sub2_Sub5(arg3, arg4, arg2, local13, local23, local35, local45, local49.anInt382, true, null);
			}
			arg8.method1754(arg6, arg5, arg0, local60, 1, 1, local189, 0, local78, local66);
			if (local49.aBoolean25) {
				arg1.method1204(local49.anInt411, local49.anInt420, arg5, local49.aBoolean31, arg2, arg0);
			}
		} else if (arg4 == 0) {
			if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
				local189 = local49.method255(arg2, local13, local23, 0, local35, local45);
			} else {
				local189 = new Class1_Sub1_Sub2_Sub5(arg3, 0, arg2, local13, local23, local35, local45, local49.anInt382, true, null);
			}
			arg8.method1780(arg6, arg5, arg0, local60, local189, null, Static37.anIntArray135[arg2], 0, local78, local66);
			if (local49.aBoolean25) {
				arg1.method1196(arg0, arg5, local49.aBoolean31, arg4, arg2);
			}
		} else if (arg4 == 1) {
			if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
				local189 = local49.method255(arg2, local13, local23, 1, local35, local45);
			} else {
				local189 = new Class1_Sub1_Sub2_Sub5(arg3, 1, arg2, local13, local23, local35, local45, local49.anInt382, true, null);
			}
			arg8.method1780(arg6, arg5, arg0, local60, local189, null, Static102.anIntArray341[arg2], 0, local78, local66);
			if (local49.aBoolean25) {
				arg1.method1196(arg0, arg5, local49.aBoolean31, arg4, arg2);
			}
		} else {
			@Pc(473) int local473;
			@Pc(503) Class1_Sub1_Sub2 local503;
			if (arg4 == 2) {
				local473 = arg2 + 1 & 0x3;
				@Pc(493) Class1_Sub1_Sub2 local493;
				if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
					local493 = local49.method255(arg2 + 4, local13, local23, 2, local35, local45);
					local503 = local49.method255(local473, local13, local23, 2, local35, local45);
				} else {
					local493 = new Class1_Sub1_Sub2_Sub5(arg3, 2, arg2 + 4, local13, local23, local35, local45, local49.anInt382, true, null);
					local503 = new Class1_Sub1_Sub2_Sub5(arg3, 2, local473, local13, local23, local35, local45, local49.anInt382, true, null);
				}
				arg8.method1780(arg6, arg5, arg0, local60, local493, local503, Static37.anIntArray135[arg2], Static37.anIntArray135[local473], local78, local66);
				if (local49.aBoolean25) {
					arg1.method1196(arg0, arg5, local49.aBoolean31, arg4, arg2);
				}
			} else if (arg4 == 3) {
				if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
					local189 = local49.method255(arg2, local13, local23, 3, local35, local45);
				} else {
					local189 = new Class1_Sub1_Sub2_Sub5(arg3, 3, arg2, local13, local23, local35, local45, local49.anInt382, true, null);
				}
				arg8.method1780(arg6, arg5, arg0, local60, local189, null, Static102.anIntArray341[arg2], 0, local78, local66);
				if (local49.aBoolean25) {
					arg1.method1196(arg0, arg5, local49.aBoolean31, arg4, arg2);
				}
			} else if (arg4 == 9) {
				if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
					local189 = local49.method255(arg2, local13, local23, arg4, local35, local45);
				} else {
					local189 = new Class1_Sub1_Sub2_Sub5(arg3, arg4, arg2, local13, local23, local35, local45, local49.anInt382, true, null);
				}
				arg8.method1754(arg6, arg5, arg0, local60, 1, 1, local189, 0, local78, local66);
				if (local49.aBoolean25) {
					arg1.method1204(local49.anInt411, local49.anInt420, arg5, local49.aBoolean31, arg2, arg0);
				}
			} else {
				if (local49.aBoolean28) {
					if (arg2 == 1) {
						local473 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local473;
					} else if (arg2 == 2) {
						local473 = local45;
						local45 = local23;
						local23 = local473;
						local473 = local35;
						local35 = local13;
						local13 = local473;
					} else if (arg2 == 3) {
						local473 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local473;
					}
				}
				if (arg4 == 4) {
					if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
						local189 = local49.method255(0, local13, local23, 4, local35, local45);
					} else {
						local189 = new Class1_Sub1_Sub2_Sub5(arg3, 4, 0, local13, local23, local35, local45, local49.anInt382, true, null);
					}
					arg8.method1744(arg6, arg5, arg0, local60, local189, Static37.anIntArray135[arg2], arg2 * 512, 0, 0, local78, local66);
				} else if (arg4 == 5) {
					local473 = 16;
					local219 = arg8.method1785(arg6, arg5, arg0);
					if (local219 != 0) {
						local473 = Static108.method1807(local219 >> 14 & 0x7FFF).anInt405;
					}
					if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
						local503 = local49.method255(0, local13, local23, 4, local35, local45);
					} else {
						local503 = new Class1_Sub1_Sub2_Sub5(arg3, 4, 0, local13, local23, local35, local45, local49.anInt382, true, null);
					}
					arg8.method1744(arg6, arg5, arg0, local60, local503, Static37.anIntArray135[arg2], arg2 * 512, local473 * Static5.anIntArray20[arg2], Static26.anIntArray107[arg2] * local473, local78, local66);
				} else if (arg4 == 6) {
					if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
						local189 = local49.method255(0, local13, local23, 4, local35, local45);
					} else {
						local189 = new Class1_Sub1_Sub2_Sub5(arg3, 4, 0, local13, local23, local35, local45, local49.anInt382, true, null);
					}
					arg8.method1744(arg6, arg5, arg0, local60, local189, 256, arg2, 0, 0, local78, local66);
				} else if (arg4 == 7) {
					if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
						local189 = local49.method255(0, local13, local23, 4, local35, local45);
					} else {
						local189 = new Class1_Sub1_Sub2_Sub5(arg3, 4, 0, local13, local23, local35, local45, local49.anInt382, true, null);
					}
					arg8.method1744(arg6, arg5, arg0, local60, local189, 512, arg2, 0, 0, local78, local66);
				} else if (arg4 == 8) {
					if (local49.anInt382 == -1 && local49.anIntArray61 == null) {
						local189 = local49.method255(0, local13, local23, 4, local35, local45);
					} else {
						local189 = new Class1_Sub1_Sub2_Sub5(arg3, 4, 0, local13, local23, local35, local45, local49.anInt382, true, null);
					}
					arg8.method1744(arg6, arg5, arg0, local60, local189, 768, arg2, 0, 0, local78, local66);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILclient!pb;)Z")
	public static boolean method2068(@OriginalArg(0) int arg0, @OriginalArg(2) Class41 arg1) {
		@Pc(13) byte[] local13 = arg1.method1055(arg0);
		if (local13 == null) {
			return false;
		} else {
			Static82.method1382(local13);
			return true;
		}
	}
}
