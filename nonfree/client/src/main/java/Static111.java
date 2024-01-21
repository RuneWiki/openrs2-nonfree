import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!u", name = "w", descriptor = "I")
	public static int anInt2992;

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!v;")
	public static Class2_Sub1_Sub9_Sub4 aClass2_Sub1_Sub9_Sub4_34;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "I")
	public static int anInt3002;

	@OriginalMember(owner = "client!u", name = "u", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1154 = Static2.method59("M");

	@OriginalMember(owner = "client!u", name = "x", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1155 = aClass80_1154;

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Lclient!ua;")
	public static Class70 aClass70_32 = new Class70();

	@OriginalMember(owner = "client!u", name = "z", descriptor = "I")
	public static int anInt2993 = 0;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "I")
	public static int anInt2998 = -1;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "Lclient!i;")
	public static Class32 aClass32_54 = new Class32(64);

	@OriginalMember(owner = "client!u", name = "I", descriptor = "I")
	public static int anInt2999 = 0;

	@OriginalMember(owner = "client!u", name = "J", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1156 = Static2.method59("hel");

	@OriginalMember(owner = "client!u", name = "K", descriptor = "I")
	public static int anInt3000 = -1;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "I")
	public static int anInt3001 = -1;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "[I")
	public static int[] anIntArray393 = new int[25];

	@OriginalMember(owner = "client!u", name = "O", descriptor = "I")
	public static int anInt3003 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public static void method1935() {
		aClass2_Sub1_Sub9_Sub4_34 = null;
		aClass80_1156 = null;
		anIntArray393 = null;
		aClass70_32 = null;
		aClass32_54 = null;
		aClass80_1154 = null;
		aClass80_1155 = null;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)I")
	public static int method1936() {
		@Pc(9) int local9 = Static24.method513(Static53.anInt1647, Static16.anInt444, Static42.anInt1257);
		return local9 - Static107.anInt2863 >= 800 || (Static108.aByteArrayArrayArray7[Static16.anInt444][Static53.anInt1647 >> 7][Static42.anInt1257 >> 7] & 0x4) == 0 ? 3 : Static16.anInt444;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(B)V")
	public static void method1937() {
		Static38.method657();
		Static112.aBoolean216 = true;
		Static40.method668();
		if (Static53.aBoolean109) {
			aClass2_Sub1_Sub9_Sub4_34.method1924(Static40.aClass80_450, 239, 40, 0);
			aClass2_Sub1_Sub9_Sub4_34.method1924(Static93.method1444(new Class80[] { Static40.aClass80_454, Static62.aClass80_662 }), 239, 60, 128);
		} else if (Static42.anInt1258 == 1) {
			aClass2_Sub1_Sub9_Sub4_34.method1924(Static27.aClass80_343, 239, 40, 0);
			aClass2_Sub1_Sub9_Sub4_34.method1924(Static93.method1444(new Class80[] { Static40.aClass80_455, Static62.aClass80_662 }), 239, 60, 128);
		} else if (Static42.anInt1258 == 2) {
			aClass2_Sub1_Sub9_Sub4_34.method1924(Static64.aClass80_677, 239, 40, 0);
			aClass2_Sub1_Sub9_Sub4_34.method1924(Static93.method1444(new Class80[] { Static40.aClass80_455, Static62.aClass80_662 }), 239, 60, 128);
		} else {
			@Pc(138) int local138;
			@Pc(140) int local140;
			@Pc(131) Class2_Sub1_Sub9_Sub4 local131;
			if (Static42.anInt1258 == 3) {
				if (Static40.aClass80_444 != Static40.aClass80_455) {
					Static105.method1428(Static40.aClass80_455);
					Static40.aClass80_444 = Static40.aClass80_455;
				}
				local131 = Static21.aClass2_Sub1_Sub9_Sub4_12;
				Static99.method1896(0, 0, 463, 77);
				for (local138 = 0; local138 < Static19.anInt800; local138++) {
					local140 = local138 * 14 + 18 - Static98.anInt2618;
					if (local140 > 0 && local140 < 110) {
						local131.method1924(Static88.aClass80Array14[local138], 239, local140, 0);
					}
				}
				Static99.method1893();
				if (Static19.anInt800 > 5) {
					Static25.method519(77, Static19.anInt800 * 14 + 7, 463, 0, Static98.anInt2618);
				}
				if (Static40.aClass80_455.method1999() == 0) {
					aClass2_Sub1_Sub9_Sub4_34.method1924(Static108.aClass80_1078, 239, 40, 255);
				} else if (Static19.anInt800 == 0) {
					aClass2_Sub1_Sub9_Sub4_34.method1924(Static87.aClass80_895, 239, 40, 0);
				}
				local131.method1924(Static93.method1444(new Class80[] { Static40.aClass80_455, Static62.aClass80_662 }), 239, 90, 0);
				Static99.method1889(0, 77, 479, 0);
			} else if (Static42.anInt1258 == 4) {
				aClass2_Sub1_Sub9_Sub4_34.method1924(Static40.aClass80_453, 239, 40, 0);
				aClass2_Sub1_Sub9_Sub4_34.method1924(Static93.method1444(new Class80[] { Static40.aClass80_455, Static62.aClass80_662 }), 239, 60, 128);
			} else if (Static95.aClass80_947 == null) {
				@Pc(120) boolean local120;
				if (Static57.anInt1737 != -1) {
					local120 = Static125.method1778(Static57.anInt1737, 479, 2, 96);
					if (!local120) {
						Static37.aBoolean77 = true;
					}
				} else if (Static28.anInt2316 == -1) {
					local131 = Static21.aClass2_Sub1_Sub9_Sub4_12;
					Static99.method1896(0, 0, 463, 77);
					local138 = 0;
					for (local140 = 0; local140 < 100; local140++) {
						if (Static36.aClass80Array8[local140] != null) {
							@Pc(150) int local150 = Static110.anIntArray378[local140];
							@Pc(159) int local159 = Static84.anInt2049 + 70 - local138 * 14;
							@Pc(163) Class80 local163 = Static25.aClass80Array6[local140];
							@Pc(165) byte local165 = 0;
							if (local163 != null && local163.method2028(Static92.aClass80_886)) {
								local165 = 1;
								local163 = local163.method2021(5);
							}
							if (local163 != null && local163.method2028(Static4.aClass80_49)) {
								local165 = 2;
								local163 = local163.method2021(5);
							}
							if (local150 == 0) {
								local138++;
								if (local159 > 0 && local159 < 110) {
									local131.method1925(Static36.aClass80Array8[local140], 4, local159, 0);
								}
							}
							@Pc(246) int local246;
							if ((local150 == 1 || local150 == 2) && (local150 == 1 || Static112.anInt2924 == 0 || Static112.anInt2924 == 1 && Static110.method1844(local163))) {
								local138++;
								if (local159 > 0 && local159 < 110) {
									local246 = 4;
									if (local165 == 1) {
										Static110.aClass2_Sub1_Sub9_Sub3Array8[0].method1494(4, local159 - 12);
										local246 += 14;
									}
									if (local165 == 2) {
										Static110.aClass2_Sub1_Sub9_Sub3Array8[1].method1494(local246, local159 - 12);
										local246 += 14;
									}
									local131.method1925(Static93.method1444(new Class80[] { local163, Static40.aClass80_458 }), local246, local159, 0);
									local246 += local131.method1910(local163) + 8;
									local131.method1925(Static36.aClass80Array8[local140], local246, local159, 255);
								}
							}
							if ((local150 == 3 || local150 == 7) && Static98.anInt2611 == 0 && (local150 == 7 || Static6.anInt172 == 0 || Static6.anInt172 == 1 && Static110.method1844(local163))) {
								if (local159 > 0 && local159 < 110) {
									local131.method1925(Static61.aClass80_646, 4, local159, 0);
									local246 = local131.method1910(Static61.aClass80_646) + 4;
									local246 += local131.method1908(32);
									if (local165 == 1) {
										Static110.aClass2_Sub1_Sub9_Sub3Array8[0].method1494(local246, local159 - 12);
										local246 += 14;
									}
									if (local165 == 2) {
										Static110.aClass2_Sub1_Sub9_Sub3Array8[1].method1494(local246, local159 - 12);
										local246 += 14;
									}
									local131.method1925(Static93.method1444(new Class80[] { local163, Static40.aClass80_458 }), local246, local159, 0);
									local246 += local131.method1910(local163) + 8;
									local131.method1925(Static36.aClass80Array8[local140], local246, local159, 8388608);
								}
								local138++;
							}
							if (local150 == 4 && (anInt2993 == 0 || anInt2993 == 1 && Static110.method1844(local163))) {
								local138++;
								if (local159 > 0 && local159 < 110) {
									local131.method1925(Static93.method1444(new Class80[] { local163, Static7.aClass80_95, Static36.aClass80Array8[local140] }), 4, local159, 8388736);
								}
							}
							if (local150 == 5 && Static98.anInt2611 == 0 && Static6.anInt172 < 2) {
								local138++;
								if (local159 > 0 && local159 < 110) {
									local131.method1925(Static36.aClass80Array8[local140], 4, local159, 8388608);
								}
							}
							if (local150 == 6 && Static98.anInt2611 == 0 && Static6.anInt172 < 2) {
								local138++;
								if (local159 > 0 && local159 < 110) {
									local131.method1925(Static93.method1444(new Class80[] { Static91.aClass80_880, Static7.aClass80_95, local163, Static40.aClass80_458 }), 4, local159, 0);
									local131.method1925(Static36.aClass80Array8[local140], local131.method1910(Static93.method1444(new Class80[] { Static91.aClass80_880, Static7.aClass80_95, local163 })) + 12, local159, 8388608);
								}
							}
							if (local150 == 8 && (anInt2993 == 0 || anInt2993 == 1 && Static110.method1844(local163))) {
								if (local159 > 0 && local159 < 110) {
									local131.method1925(Static93.method1444(new Class80[] { local163, Static7.aClass80_95, Static36.aClass80Array8[local140] }), 4, local159, 8270336);
								}
								local138++;
							}
						}
					}
					Static99.method1893();
					Static123.anInt3114 = local138 * 14 + 7;
					if (Static123.anInt3114 < 78) {
						Static123.anInt3114 = 78;
					}
					Static25.method519(77, Static123.anInt3114, 463, 0, Static123.anInt3114 - Static84.anInt2049 - 77);
					@Pc(662) Class80 local662;
					if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1 == null || Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass80_924 == null) {
						local662 = Static79.aClass80_786;
					} else {
						local662 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass80_924;
					}
					local131.method1925(Static93.method1444(new Class80[] { local662, Static40.aClass80_458 }), 4, 90, 0);
					local131.method1925(Static93.method1444(new Class80[] { Static40.aClass80_457, Static62.aClass80_662 }), local131.method1910(Static93.method1444(new Class80[] { local662, Static63.aClass80_665 })) + 6, 90, 255);
					Static99.method1889(0, 77, 479, 0);
				} else {
					local120 = Static125.method1778(Static28.anInt2316, 479, 3, 96);
					if (!local120) {
						Static37.aBoolean77 = true;
					}
				}
			} else {
				aClass2_Sub1_Sub9_Sub4_34.method1912(Static95.aClass80_947, 10, 20, 459, 40, 0, false, 1, 1, 0);
				aClass2_Sub1_Sub9_Sub4_34.method1924(Static76.aClass80_757, 239, 80, 128);
			}
		}
		if (Static122.aBoolean241 && Static11.anInt315 == 2) {
			Static112.method1848();
		}
		Static71.method1137();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!ff;Lclient!ff;)I")
	public static int method1938(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method385(Static79.aClass80_788, Static65.aClass80_689)) {
			local5++;
		}
		if (arg1.method385(Static79.aClass80_788, Static63.aClass80_675)) {
			local5++;
		}
		if (arg1.method385(Static79.aClass80_788, Static61.aClass80_652)) {
			local5++;
		}
		if (arg1.method385(Static79.aClass80_788, Static107.aClass80_1071)) {
			local5++;
		}
		if (arg1.method385(Static79.aClass80_788, Static122.aClass80_1189)) {
			local5++;
		}
		if (arg1.method385(Static79.aClass80_788, Static33.aClass80_380)) {
			local5++;
		}
		arg1.method385(Static79.aClass80_788, Static65.aClass80_692);
		arg1.method385(Static79.aClass80_788, Static60.aClass80_632);
		arg1.method385(Static79.aClass80_788, Static19.aClass80_274);
		arg1.method385(Static79.aClass80_788, Static44.aClass80_505);
		arg1.method385(Static79.aClass80_788, Static18.aClass80_258);
		return local5;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BLclient!he;)V")
	public static void method1939(@OriginalArg(1) Class2_Sub5 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt1511 == 0) {
			local5 = Static93.aClass64_1.method1656(arg0.anInt1502, arg0.anInt1509, arg0.anInt1497);
		}
		@Pc(19) int local19 = -1;
		if (arg0.anInt1511 == 1) {
			local5 = Static93.aClass64_1.method1610(arg0.anInt1502, arg0.anInt1509, arg0.anInt1497);
		}
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		if (arg0.anInt1511 == 2) {
			local5 = Static93.aClass64_1.method1653(arg0.anInt1502, arg0.anInt1509, arg0.anInt1497);
		}
		if (arg0.anInt1511 == 3) {
			local5 = Static93.aClass64_1.method1620(arg0.anInt1502, arg0.anInt1509, arg0.anInt1497);
		}
		if (local5 != 0) {
			local19 = local5 >> 14 & 0x7FFF;
			@Pc(91) int local91 = Static93.aClass64_1.method1622(arg0.anInt1502, arg0.anInt1509, arg0.anInt1497, local5);
			local34 = local91 & 0x1F;
			local36 = local91 >> 6 & 0x3;
		}
		arg0.anInt1501 = local19;
		arg0.anInt1507 = local36;
		arg0.anInt1503 = local34;
	}
}
