import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fc", name = "tb", descriptor = "Lclient!t;")
	public static Class34 aClass34_2;

	@OriginalMember(owner = "client!fc", name = "Bb", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_2;

	@OriginalMember(owner = "client!fc", name = "rb", descriptor = "Lclient!ob;")
	public static Class55 aClass55_29 = new Class55(50);

	@OriginalMember(owner = "client!fc", name = "ub", descriptor = "Lclient!ob;")
	public static Class55 aClass55_30 = new Class55(64);

	@OriginalMember(owner = "client!fc", name = "zb", descriptor = "Lclient!je;")
	private static Class40 aClass40_460 = Static69.method1231("Loading )2 please wait)3");

	@OriginalMember(owner = "client!fc", name = "vb", descriptor = "Lclient!je;")
	public static Class40 aClass40_456 = aClass40_460;

	@OriginalMember(owner = "client!fc", name = "wb", descriptor = "Lclient!je;")
	private static Class40 aClass40_457 = Static69.method1231("Loading title screen )2 ");

	@OriginalMember(owner = "client!fc", name = "xb", descriptor = "Lclient!je;")
	public static Class40 aClass40_458 = Static69.method1231("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!fc", name = "yb", descriptor = "Lclient!je;")
	public static Class40 aClass40_459 = aClass40_457;

	@OriginalMember(owner = "client!fc", name = "Ab", descriptor = "I")
	public static int anInt773 = -1;

	@OriginalMember(owner = "client!fc", name = "Eb", descriptor = "Lclient!je;")
	private static Class40 aClass40_463 = Static69.method1231("flash2:");

	@OriginalMember(owner = "client!fc", name = "Cb", descriptor = "Lclient!je;")
	public static Class40 aClass40_461 = aClass40_463;

	@OriginalMember(owner = "client!fc", name = "Db", descriptor = "Lclient!je;")
	public static Class40 aClass40_462 = aClass40_463;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(B)Z")
	public static boolean method489() {
		try {
			if (Static77.anInt2023 == 2) {
				if (Static29.aClass2_Sub18_1 == null) {
					Static29.aClass2_Sub18_1 = Static138.method1616(Static122.aClass24_32, Static56.anInt1471, Static120.anInt2820);
					if (Static29.aClass2_Sub18_1 == null) {
						return false;
					}
				}
				if (Static93.aClass1_1 == null) {
					Static93.aClass1_1 = new Class1(Static38.aClass24_12, Static57.aClass24_15);
				}
				if (Static129.aClass2_Sub5_Sub4_2.method1963(Static121.aClass24_31, Static29.aClass2_Sub18_1, Static93.aClass1_1)) {
					Static129.aClass2_Sub5_Sub4_2.method1980();
					Static129.aClass2_Sub5_Sub4_2.method1974(Static26.anInt673);
					Static129.aClass2_Sub5_Sub4_2.method1982(Static29.aClass2_Sub18_1, Static104.aBoolean204);
					Static122.aClass24_32 = null;
					Static29.aClass2_Sub18_1 = null;
					Static77.anInt2023 = 0;
					Static93.aClass1_1 = null;
					return true;
				}
			}
		} catch (@Pc(66) Exception local66) {
			local66.printStackTrace();
			Static129.aClass2_Sub5_Sub4_2.method1967();
			Static122.aClass24_32 = null;
			Static93.aClass1_1 = null;
			Static77.anInt2023 = 0;
			Static29.aClass2_Sub18_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)I")
	public static int method490() {
		@Pc(8) int local8 = 3;
		if (Static38.anInt1005 < 310) {
			@Pc(15) int local15 = Static83.anInt2155 >> 7;
			@Pc(19) int local19 = Static127.anInt2944 >> 7;
			if ((Static66.aByteArrayArrayArray10[Static105.anInt2531][local15][local19] & 0x4) != 0) {
				local8 = Static105.anInt2531;
			}
			@Pc(36) int local36 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 >> 7;
			@Pc(48) int local48;
			if (local15 >= local36) {
				local48 = local15 - local36;
			} else {
				local48 = local36 - local15;
			}
			@Pc(60) int local60 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 >> 7;
			@Pc(67) int local67;
			if (local19 < local60) {
				local67 = local60 - local19;
			} else {
				local67 = local19 - local60;
			}
			@Pc(82) int local82;
			@Pc(84) int local84;
			if (local67 >= local48) {
				local82 = local48 * 65536 / local67;
				local84 = 32768;
				while (local60 != local19) {
					local84 += local82;
					if (local19 < local60) {
						local19++;
					} else if (local60 < local19) {
						local19--;
					}
					if ((Static66.aByteArrayArrayArray10[Static105.anInt2531][local15][local19] & 0x4) != 0) {
						local8 = Static105.anInt2531;
					}
					if (local84 >= 65536) {
						local84 -= 65536;
						if (local15 < local36) {
							local15++;
						} else if (local36 < local15) {
							local15--;
						}
						if ((Static66.aByteArrayArrayArray10[Static105.anInt2531][local15][local19] & 0x4) != 0) {
							local8 = Static105.anInt2531;
						}
					}
				}
			} else {
				local82 = local67 * 65536 / local48;
				local84 = 32768;
				while (local36 != local15) {
					local84 += local82;
					if (local36 > local15) {
						local15++;
					} else if (local15 > local36) {
						local15--;
					}
					if ((Static66.aByteArrayArrayArray10[Static105.anInt2531][local15][local19] & 0x4) != 0) {
						local8 = Static105.anInt2531;
					}
					if (local84 >= 65536) {
						if (local60 > local19) {
							local19++;
						} else if (local19 > local60) {
							local19--;
						}
						if ((Static66.aByteArrayArrayArray10[Static105.anInt2531][local15][local19] & 0x4) != 0) {
							local8 = Static105.anInt2531;
						}
						local84 -= 65536;
					}
				}
			}
		}
		if ((Static66.aByteArrayArrayArray10[Static105.anInt2531][Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 >> 7][Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 >> 7] & 0x4) != 0) {
			local8 = Static105.anInt2531;
		}
		return local8;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public static void method491(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static56.method1005(Static106.aClass40_1358, Static7.aClass40_162, Static104.aClass40_1345);
		} else if (arg0 == -2) {
			Static56.method1005(Static133.aClass40_1649, Static7.aClass40_160, Static7.aClass40_163);
		} else if (arg0 == -1) {
			Static56.method1005(Static106.aClass40_1356, Static7.aClass40_138, Static3.aClass40_78);
		} else if (arg0 == 3) {
			Static56.method1005(Static104.aClass40_1342, Static7.aClass40_150, Static7.aClass40_131);
		} else if (arg0 == 4) {
			Static56.method1005(Static62.aClass40_835, Static7.aClass40_146, Static17.aClass40_269);
		} else if (arg0 == 5) {
			Static56.method1005(Static94.aClass40_1241, Static7.aClass40_159, Static87.aClass40_671);
		} else if (arg0 == 6) {
			Static56.method1005(Static50.aClass40_657, Static7.aClass40_165, Static122.aClass40_1540);
		} else if (arg0 == 7) {
			Static56.method1005(Static105.aClass40_1350, Static7.aClass40_148, Static10.aClass40_1603);
		} else if (arg0 == 8) {
			Static56.method1005(Static63.aClass40_246, Static7.aClass40_143, Static21.aClass40_358);
		} else if (arg0 == 9) {
			Static56.method1005(Static118.aClass40_1490, Static7.aClass40_139, Static114.aClass40_1426);
		} else if (arg0 == 10) {
			Static56.method1005(Static74.aClass40_520, Static7.aClass40_151, Static21.aClass40_357);
		} else if (arg0 == 11) {
			Static56.method1005(Static11.aClass40_195, Static7.aClass40_166, Static45.aClass40_597);
		} else if (arg0 == 12) {
			Static56.method1005(Static125.aClass40_1566, Static7.aClass40_171, Static3.aClass40_77);
		} else if (arg0 == 13) {
			Static56.method1005(Static106.aClass40_1360, Static7.aClass40_133, Static48.aClass40_637);
		} else if (arg0 == 14) {
			Static56.method1005(Static100.aClass40_1314, Static7.aClass40_161, Static23.aClass40_368);
		} else if (arg0 == 16) {
			Static56.method1005(Static52.aClass40_708, Static7.aClass40_153, Static43.aClass40_569);
		} else if (arg0 == 17) {
			Static56.method1005(Static123.aClass40_1549, Static7.aClass40_137, Static92.aClass40_1220);
		} else if (arg0 == 18) {
			Static56.method1005(Static75.aClass40_972, Static7.aClass40_154, Static37.aClass40_529);
		} else if (arg0 == 19) {
			Static56.method1005(Static54.aClass40_716, Static105.aClass40_1352, Static120.aClass40_1517);
		} else if (arg0 == 20) {
			Static56.method1005(Static106.aClass40_1357, Static7.aClass40_157, Static13.aClass40_202);
		} else if (arg0 == 22) {
			Static56.method1005(Static12.aClass40_1636, Static7.aClass40_140, Static64.aClass40_850);
		} else if (arg0 == 23) {
			Static56.method1005(Static100.aClass40_1311, Static7.aClass40_170, Static23.aClass40_373);
		} else if (arg0 == 24) {
			Static56.method1005(Static83.aClass40_1108, Static7.aClass40_164, Static96.aClass40_1278);
		} else if (arg0 == 25) {
			Static56.method1005(Static106.aClass40_1361, Static7.aClass40_168, Static54.aClass40_717);
		} else if (arg0 == 26) {
			Static56.method1005(Static55.aClass40_723, Static7.aClass40_135, Static112.aClass40_1418);
		} else if (arg0 == 27) {
			Static56.method1005(Static81.aClass40_1059, Static7.aClass40_156, Static7.aClass40_149);
		} else {
			Static56.method1005(Static106.aClass40_1355, Static7.aClass40_141, Static92.aClass40_1223);
		}
		Static21.method402(10);
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)V")
	public static void method492() {
		aClass40_456 = null;
		aClass40_463 = null;
		aClass40_458 = null;
		aClass40_457 = null;
		aClass34_2 = null;
		aClass40_461 = null;
		aClass55_29 = null;
		aClass40_462 = null;
		aClass55_30 = null;
		aClass40_460 = null;
		aClass24_Sub1_2 = null;
		aClass40_459 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZIILclient!fd;III)V")
	public static void method493(@OriginalArg(1) int arg0, @OriginalArg(3) Class24 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static26.anInt673 = arg2;
		Static56.anInt1471 = arg3;
		Static77.anInt2023 = 1;
		Static122.aClass24_32 = arg1;
		Static120.anInt2820 = arg0;
		Static70.anInt1896 = 2;
		Static104.aBoolean204 = false;
	}
}
