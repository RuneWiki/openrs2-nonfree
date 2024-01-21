import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!k", name = "mb", descriptor = "Lclient!n;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!k", name = "qb", descriptor = "J")
	public static long aLong54;

	@OriginalMember(owner = "client!k", name = "Sb", descriptor = "I")
	public static int anInt1501;

	@OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
	public static int anInt1480 = 0;

	@OriginalMember(owner = "client!k", name = "jb", descriptor = "[J")
	public static long[] aLongArray6 = new long[200];

	@OriginalMember(owner = "client!k", name = "Jb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_760 = Static38.method736("Loaded config");

	@OriginalMember(owner = "client!k", name = "lb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_758 = aClass71_760;

	@OriginalMember(owner = "client!k", name = "nb", descriptor = "I")
	public static int anInt1482 = 0;

	@OriginalMember(owner = "client!k", name = "Ab", descriptor = "Lclient!vc;")
	public static Class71 aClass71_759 = Static38.method736("Fertigkeit)2");

	@OriginalMember(owner = "client!k", name = "Bb", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!k", name = "Eb", descriptor = "I")
	public static int anInt1493 = 0;

	@OriginalMember(owner = "client!k", name = "Tb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_761 = Static38.method736("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I")
	public static int method1016(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)Lclient!wc;")
	public static Class5_Sub1_Sub18 method1017(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub1_Sub18 local10 = (Class5_Sub1_Sub18) Static32.aClass54_20.method1397((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static108.aClass24_23.method679(12, arg0);
		local10 = new Class5_Sub1_Sub18();
		if (local22 != null) {
			local10.method1961(new Class5_Sub11(local22));
		}
		local10.method1957();
		Static32.aClass54_20.method1399(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
	public static void method1020() {
		aClass71_759 = null;
		aLongArray6 = null;
		aClass71_760 = null;
		aClass3_1 = null;
		aClass71_761 = null;
		aClass71_758 = null;
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(B)V")
	public static void method1021() {
		Static78.aBoolean42 = true;
		Static16.method425();
		if (Static58.aBoolean66) {
			Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static38.aClass71_569, 239, 40, 0);
			Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static74.method677(new Class71[] { Static38.aClass71_573, Static72.aClass71_877 }), 239, 60, 128);
		} else if (Static77.anInt1917 == 1) {
			Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static34.aClass71_528, 239, 40, 0);
			Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static74.method677(new Class71[] { Static38.aClass71_563, Static72.aClass71_877 }), 239, 60, 128);
		} else if (Static77.anInt1917 == 2) {
			Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static30.aClass71_464, 239, 40, 0);
			Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static74.method677(new Class71[] { Static38.aClass71_563, Static72.aClass71_877 }), 239, 60, 128);
		} else {
			@Pc(61) Class5_Sub1_Sub10_Sub4 local61;
			@Pc(68) int local68;
			@Pc(79) int local79;
			if (Static77.anInt1917 == 3) {
				if (Static38.aClass71_566 != Static38.aClass71_563) {
					Static5.method146(Static38.aClass71_563);
					Static38.aClass71_566 = Static38.aClass71_563;
				}
				local61 = Static64.aClass5_Sub1_Sub10_Sub4_6;
				Static52.method2025(0, 0, 463, 77);
				for (local68 = 0; local68 < Static32.anInt853; local68++) {
					local79 = local68 * 14 + 18 - Static98.anInt1925;
					if (local79 > 0 && local79 < 110) {
						local61.method2048(Static4.aClass71Array1[local68], 239, local79, 0);
					}
				}
				Static52.method2028();
				if (Static32.anInt853 > 5) {
					Static97.method1607(77, 463, Static98.anInt1925, Static32.anInt853 * 14 + 7, 0);
				}
				if (Static38.aClass71_563.method1784() == 0) {
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static1.aClass71_7, 239, 40, 255);
				} else if (Static32.anInt853 == 0) {
					Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static7.aClass71_199, 239, 40, 0);
				}
				local61.method2048(Static74.method677(new Class71[] { Static38.aClass71_563, Static72.aClass71_877 }), 239, 90, 0);
				Static52.method2023(0, 77, 479, 0);
			} else if (Static77.anInt1917 == 4) {
				Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static38.aClass71_572, 239, 40, 0);
				Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static74.method677(new Class71[] { Static38.aClass71_563, Static72.aClass71_877 }), 239, 60, 128);
			} else if (Static48.aClass71_709 == null) {
				@Pc(208) boolean local208;
				if (Static62.anInt1577 != -1) {
					local208 = Static23.method549(479, 96, 2, Static62.anInt1577);
					if (!local208) {
						Static68.aBoolean72 = true;
					}
				} else if (Static7.anInt275 == -1) {
					local68 = 0;
					local61 = Static64.aClass5_Sub1_Sub10_Sub4_6;
					Static52.method2025(0, 0, 463, 77);
					for (local79 = 0; local79 < 100; local79++) {
						if (Static31.aClass71Array9[local79] != null) {
							@Pc(235) int local235 = Static31.anIntArray104[local79];
							@Pc(239) Class71 local239 = Static9.aClass71Array3[local79];
							@Pc(247) int local247 = Static34.anInt970 + 70 - local68 * 14;
							@Pc(249) byte local249 = 0;
							if (local239 != null && local239.method1801(Static49.aClass71_712)) {
								local239 = local239.method1822(5);
								local249 = 1;
							}
							if (local239 != null && local239.method1801(Static71.aClass71_861)) {
								local249 = 2;
								local239 = local239.method1822(5);
							}
							if (local235 == 0) {
								local68++;
								if (local247 > 0 && local247 < 110) {
									local61.method2033(Static31.aClass71Array9[local79], 4, local247, 0);
								}
							}
							@Pc(335) int local335;
							if ((local235 == 1 || local235 == 2) && (local235 == 1 || Static16.anInt518 == 0 || Static16.anInt518 == 1 && Static14.method409(local239))) {
								if (local247 > 0 && local247 < 110) {
									local335 = 4;
									if (local249 == 1) {
										Static73.aClass5_Sub1_Sub10_Sub1Array8[0].method921(4, local247 - 12);
										local335 += 14;
									}
									if (local249 == 2) {
										Static73.aClass5_Sub1_Sub10_Sub1Array8[1].method921(local335, local247 - 12);
										local335 += 14;
									}
									local61.method2033(Static74.method677(new Class71[] { local239, Static77.aClass71_938 }), local335, local247, 0);
									local335 += local61.method2032(local239) + 8;
									local61.method2033(Static31.aClass71Array9[local79], local335, local247, 255);
								}
								local68++;
							}
							if ((local235 == 3 || local235 == 7) && Static5.anInt204 == 0 && (local235 == 7 || Static60.anInt1551 == 0 || Static60.anInt1551 == 1 && Static14.method409(local239))) {
								local68++;
								if (local247 > 0 && local247 < 110) {
									local61.method2033(Static87.aClass71_1027, 4, local247, 0);
									local335 = local61.method2032(Static87.aClass71_1027) + 4;
									local335 += local61.method2038(32);
									if (local249 == 1) {
										Static73.aClass5_Sub1_Sub10_Sub1Array8[0].method921(local335, local247 - 12);
										local335 += 14;
									}
									if (local249 == 2) {
										Static73.aClass5_Sub1_Sub10_Sub1Array8[1].method921(local335, local247 - 12);
										local335 += 14;
									}
									local61.method2033(Static74.method677(new Class71[] { local239, Static77.aClass71_938 }), local335, local247, 0);
									local335 += local61.method2032(local239) + 8;
									local61.method2033(Static31.aClass71Array9[local79], local335, local247, 8388608);
								}
							}
							if (local235 == 4 && (Static93.anInt2252 == 0 || Static93.anInt2252 == 1 && Static14.method409(local239))) {
								local68++;
								if (local247 > 0 && local247 < 110) {
									local61.method2033(Static74.method677(new Class71[] { local239, Static59.aClass71_778, Static31.aClass71Array9[local79] }), 4, local247, 8388736);
								}
							}
							if (local235 == 5 && Static5.anInt204 == 0 && Static60.anInt1551 < 2) {
								if (local247 > 0 && local247 < 110) {
									local61.method2033(Static31.aClass71Array9[local79], 4, local247, 8388608);
								}
								local68++;
							}
							if (local235 == 6 && Static5.anInt204 == 0 && Static60.anInt1551 < 2) {
								if (local247 > 0 && local247 < 110) {
									local61.method2033(Static74.method677(new Class71[] { Static28.aClass71_449, Static59.aClass71_778, local239, Static77.aClass71_938 }), 4, local247, 0);
									local61.method2033(Static31.aClass71Array9[local79], local61.method2032(Static74.method677(new Class71[] { Static28.aClass71_449, Static59.aClass71_778, local239 })) + 12, local247, 8388608);
								}
								local68++;
							}
							if (local235 == 8 && (Static93.anInt2252 == 0 || Static93.anInt2252 == 1 && Static14.method409(local239))) {
								if (local247 > 0 && local247 < 110) {
									local61.method2033(Static74.method677(new Class71[] { local239, Static59.aClass71_778, Static31.aClass71Array9[local79] }), 4, local247, 8270336);
								}
								local68++;
							}
						}
					}
					Static52.method2028();
					Static66.anInt1648 = local68 * 14 + 7;
					if (Static66.anInt1648 < 78) {
						Static66.anInt1648 = 78;
					}
					Static97.method1607(77, 463, Static66.anInt1648 - Static34.anInt970 - 77, Static66.anInt1648, 0);
					@Pc(742) Class71 local742;
					if (Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1 == null || Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass71_1236 == null) {
						local742 = Static98.aClass71_943;
					} else {
						local742 = Static87.aClass5_Sub1_Sub1_Sub3_Sub2_1.aClass71_1236;
					}
					local61.method2033(Static74.method677(new Class71[] { local742, Static77.aClass71_938 }), 4, 90, 0);
					local61.method2033(Static74.method677(new Class71[] { Static38.aClass71_564, Static72.aClass71_877 }), local61.method2032(Static74.method677(new Class71[] { local742, Static66.aClass71_822 })) + 6, 90, 255);
					Static52.method2023(0, 77, 479, 0);
				} else {
					local208 = Static23.method549(479, 96, 3, Static7.anInt275);
					if (!local208) {
						Static68.aBoolean72 = true;
					}
				}
			} else {
				Static35.aClass5_Sub1_Sub10_Sub4_2.method2036(Static48.aClass71_709, 10, 20, 459, 40, 0, false, 1, 1, 0);
				Static35.aClass5_Sub1_Sub10_Sub4_2.method2048(Static60.aClass71_781, 239, 80, 128);
			}
		}
		if (Static65.aBoolean71 && Static90.anInt2998 == 2) {
			Static89.method1412();
		}
		Static17.method476();
	}
}
