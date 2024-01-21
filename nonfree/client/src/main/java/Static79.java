import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public static int anInt1731;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_751 = Static119.method1462("");

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_752 = Static119.method1462("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_753 = Static119.method1462("gleiten:");

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!pe;")
	public static Class65 aClass65_754 = Static119.method1462("blinken3:");

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Z")
	public static boolean aBoolean65 = true;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public static int anInt1736 = 2;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
	public static int anInt1739 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1298() {
		aClass65_753 = null;
		aClass65_752 = null;
		aClass65_751 = null;
		anIntArray227 = null;
		aClass65_754 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!pe;BI)V")
	public static void method1299(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) boolean local14 = false;
		@Pc(20) Class65 local20 = arg0.method1481().method1506();
		for (@Pc(22) int local22 = 0; local22 < Static35.anInt795; local22++) {
			@Pc(30) Class2_Sub1_Sub1_Sub4_Sub1 local30 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[Static76.anIntArray223[local22]];
			if (local30 != null && local30.aClass65_457 != null && local30.aClass65_457.method1488(local20)) {
				Static70.method1234(local30.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local30.anIntArray263[0], false);
				local14 = true;
				if (arg1 == 1) {
					Static49.aClass2_Sub4_Sub1_1.method962(178);
					Static49.aClass2_Sub4_Sub1_1.method920(Static76.anIntArray223[local22]);
				} else if (arg1 == 4) {
					Static49.aClass2_Sub4_Sub1_1.method962(241);
					Static49.aClass2_Sub4_Sub1_1.method900(Static76.anIntArray223[local22]);
				} else if (arg1 == 6) {
					Static49.aClass2_Sub4_Sub1_1.method962(225);
					Static49.aClass2_Sub4_Sub1_1.method920(Static76.anIntArray223[local22]);
				} else if (arg1 == 7) {
					Static49.aClass2_Sub4_Sub1_1.method962(102);
					Static49.aClass2_Sub4_Sub1_1.method925(Static76.anIntArray223[local22]);
				}
				break;
			}
		}
		if (!local14) {
			Static59.method1098(0, Static110.aClass65_1038, Static35.method647(new Class65[] { Static133.aClass65_1268, local20 }));
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public static void method1300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub1_Sub7 local9 = Static108.method1744(arg1);
		@Pc(12) int local12 = local9.anInt1196;
		@Pc(15) int local15 = local9.anInt1198;
		@Pc(23) int local23 = local9.anInt1204;
		@Pc(30) int local30 = Class35.anIntArray120[local23 - local15];
		if (arg0 < 0 || arg0 > local30) {
			arg0 = 0;
		}
		local30 <<= local15;
		Static129.anIntArray363[local12] = local30 & arg0 << local15 | ~local30 & Static129.anIntArray363[local12];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!wa;B)V")
	public static void method1301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub22 arg2) {
		if (arg2.anInt2778 == 1) {
			Static101.method1657(0, arg2.aClass65_1221, arg2.anInt2835, 0, 45, Static110.aClass65_1038);
		}
		if (arg2.anInt2778 == 2 && !Static117.aBoolean103) {
			@Pc(35) Class65 local35 = Static108.method1746(arg2);
			if (local35 != null) {
				Static101.method1657(-1, local35, arg2.anInt2835, 0, 25, Static35.method647(new Class65[] { Static62.aClass65_658, arg2.aClass65_1223 }));
			}
		}
		if (arg2.anInt2778 == 3) {
			Static101.method1657(0, Static126.aClass65_1171, arg2.anInt2835, 0, 34, Static110.aClass65_1038);
		}
		if (arg2.anInt2778 == 4) {
			Static101.method1657(0, arg2.aClass65_1221, arg2.anInt2835, 0, 37, Static110.aClass65_1038);
		}
		if (arg2.anInt2778 == 5) {
			Static101.method1657(0, arg2.aClass65_1221, arg2.anInt2835, 0, 7, Static110.aClass65_1038);
		}
		if (arg2.anInt2778 == 6 && Static101.aClass2_Sub22_12 == null) {
			Static101.method1657(-1, arg2.aClass65_1221, arg2.anInt2835, 0, 12, Static110.aClass65_1038);
		}
		@Pc(155) int local155;
		@Pc(149) int local149;
		if (arg2.anInt2813 == 2) {
			local149 = 0;
			for (@Pc(151) int local151 = 0; local151 < arg2.anInt2765; local151++) {
				for (local155 = 0; local155 < arg2.anInt2787; local155++) {
					@Pc(164) int local164 = (arg2.anInt2773 + 32) * local155;
					@Pc(172) int local172 = local151 * (arg2.anInt2783 + 32);
					if (local149 < 20) {
						local164 += arg2.anIntArray371[local149];
						local172 += arg2.anIntArray367[local149];
					}
					if (local164 <= arg0 && arg1 >= local172 && arg0 < local164 + 32 && local172 + 32 > arg1) {
						Static102.aClass2_Sub22_13 = arg2;
						Static76.anInt1704 = local149;
						if (arg2.anIntArray374[local149] > 0) {
							@Pc(230) Class2_Sub1_Sub11 local230 = Static4.method872(arg2.anIntArray374[local149] - 1);
							if (Static113.anInt2520 == 1 && Static17.method271(Static114.method1834(arg2))) {
								if (Static103.anInt2355 != arg2.anInt2835 || Static19.anInt479 != local149) {
									Static101.method1657(local149, Static76.aClass65_725, arg2.anInt2835, local230.anInt2093, 23, Static35.method647(new Class65[] { Static18.aClass65_143, Static26.aClass65_289, local230.aClass65_870 }));
								}
							} else if (!Static117.aBoolean103 || !Static17.method271(Static114.method1834(arg2))) {
								@Pc(287) Class65[] local287 = local230.aClass65Array49;
								if (Static99.aBoolean91) {
									local287 = Static47.method810(local287);
								}
								@Pc(307) int local307;
								@Pc(357) byte local357;
								if (Static17.method271(Static114.method1834(arg2))) {
									for (local307 = 4; local307 >= 3; local307--) {
										if (local287 != null && local287[local307] != null) {
											if (local307 == 3) {
												local357 = 46;
											} else {
												local357 = 3;
											}
											Static101.method1657(local149, local287[local307], arg2.anInt2835, local230.anInt2093, local357, Static35.method647(new Class65[] { Static42.aClass65_462, local230.aClass65_870 }));
										} else if (local307 == 4) {
											Static101.method1657(local149, Static38.aClass65_402, arg2.anInt2835, local230.anInt2093, 3, Static35.method647(new Class65[] { Static42.aClass65_462, local230.aClass65_870 }));
										}
									}
								}
								if (Static73.method1249(Static114.method1834(arg2))) {
									Static101.method1657(local149, Static76.aClass65_725, arg2.anInt2835, local230.anInt2093, 19, Static35.method647(new Class65[] { Static42.aClass65_462, local230.aClass65_870 }));
								}
								if (Static17.method271(Static114.method1834(arg2)) && local287 != null) {
									for (local307 = 2; local307 >= 0; local307--) {
										if (local287[local307] != null) {
											local357 = 0;
											if (local307 == 0) {
												local357 = 35;
											}
											if (local307 == 1) {
												local357 = 30;
											}
											if (local307 == 2) {
												local357 = 10;
											}
											Static101.method1657(local149, local287[local307], arg2.anInt2835, local230.anInt2093, local357, Static35.method647(new Class65[] { Static42.aClass65_462, local230.aClass65_870 }));
										}
									}
								}
								local287 = arg2.aClass65Array78;
								if (Static99.aBoolean91) {
									local287 = Static47.method810(local287);
								}
								if (local287 != null) {
									for (local307 = 4; local307 >= 0; local307--) {
										if (local287[local307] != null) {
											local357 = 0;
											if (local307 == 0) {
												local357 = 1;
											}
											if (local307 == 1) {
												local357 = 15;
											}
											if (local307 == 2) {
												local357 = 20;
											}
											if (local307 == 3) {
												local357 = 26;
											}
											if (local307 == 4) {
												local357 = 33;
											}
											Static101.method1657(local149, local287[local307], arg2.anInt2835, local230.anInt2093, local357, Static35.method647(new Class65[] { Static42.aClass65_462, local230.aClass65_870 }));
										}
									}
								}
								Static101.method1657(local149, Static117.aClass65_1113, arg2.anInt2835, local230.anInt2093, 1001, Static35.method647(new Class65[] { Static42.aClass65_462, local230.aClass65_870 }));
							} else if ((Static16.anInt2217 & 0x10) == 16) {
								Static101.method1657(local149, Static103.aClass65_984, arg2.anInt2835, local230.anInt2093, 16, Static35.method647(new Class65[] { Static22.aClass65_262, Static26.aClass65_289, local230.aClass65_870 }));
							}
						}
					}
					local149++;
				}
			}
		}
		if (!arg2.aBoolean124) {
			return;
		}
		if (Static117.aBoolean103) {
			if (Static66.method1208(Static114.method1834(arg2)) && (Static16.anInt2217 & 0x20) == 32) {
				Static101.method1657(arg2.anInt2814, Static103.aClass65_984, arg2.anInt2835, 0, 32, Static35.method647(new Class65[] { Static22.aClass65_262, Static39.aClass65_405, arg2.aClass65_1226 }));
				return;
			}
			return;
		}
		@Pc(716) Class65 local716;
		for (local149 = 9; local149 >= 5; local149--) {
			local716 = Static122.method1883(local149, arg2);
			if (local716 != null) {
				Static101.method1657(arg2.anInt2814, local716, arg2.anInt2835, local149 + 1, 1003, arg2.aClass65_1226);
			}
		}
		local716 = Static108.method1746(arg2);
		if (local716 != null) {
			Static101.method1657(arg2.anInt2814, local716, arg2.anInt2835, 0, 25, arg2.aClass65_1226);
		}
		for (local155 = 4; local155 >= 0; local155--) {
			@Pc(773) Class65 local773 = Static122.method1883(local155, arg2);
			if (local773 != null) {
				Static101.method1657(arg2.anInt2814, local773, arg2.anInt2835, local155 + 1, 18, arg2.aClass65_1226);
			}
		}
		if (Static126.method1924(Static114.method1834(arg2))) {
			Static101.method1657(arg2.anInt2814, Static11.aClass65_574, arg2.anInt2835, 0, 12, Static110.aClass65_1038);
			return;
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)I")
	public static int method1302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = (arg1 & 0x7F) * arg0 / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0 + (arg1 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!df;ILjava/lang/Object;)V")
	public static void method1303(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static81.method1325(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
