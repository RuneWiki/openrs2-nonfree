import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!la", name = "G", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_847 = Static9.method266("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!id;")
	private static Class34 aClass34_848 = Static9.method266("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!la", name = "B", descriptor = "Lclient!id;")
	public static Class34 aClass34_849 = aClass34_848;

	@OriginalMember(owner = "client!la", name = "C", descriptor = "Lclient!id;")
	public static Class34 aClass34_850 = Static9.method266("::fpson");

	@OriginalMember(owner = "client!la", name = "D", descriptor = "Lclient!id;")
	public static Class34 aClass34_851 = Static9.method266("<col=ff7000>");

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Lclient!id;")
	public static Class34 aClass34_852 = Static9.method266("Okay");

	@OriginalMember(owner = "client!la", name = "F", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_10 = null;

	@OriginalMember(owner = "client!la", name = "J", descriptor = "I")
	public static int anInt1823 = 0;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "Lclient!id;")
	private static Class34 aClass34_854 = Static9.method266("Loaded sprites");

	@OriginalMember(owner = "client!la", name = "K", descriptor = "Lclient!id;")
	public static Class34 aClass34_853 = aClass34_854;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1188() {
		@Pc(9) int local9 = Static118.anInt2817 * 128 + 64;
		@Pc(15) int local15 = Static12.anInt546 * 128 + 64;
		@Pc(24) int local24 = Static45.method1845(Static42.anInt1208, local15, local9) - Static65.anInt1734;
		if (local24 > Static88.anInt2285) {
			Static88.anInt2285 += Static59.anInt1632 * (local24 - Static88.anInt2285) / 1000 + Static12.anInt518;
			if (Static88.anInt2285 > local24) {
				Static88.anInt2285 = local24;
			}
		}
		if (local24 < Static88.anInt2285) {
			Static88.anInt2285 -= Static12.anInt518 + (Static88.anInt2285 - local24) * Static59.anInt1632 / 1000;
			if (local24 > Static88.anInt2285) {
				Static88.anInt2285 = local24;
			}
		}
		if (Static119.anInt2839 < local9) {
			Static119.anInt2839 += Static12.anInt518 + Static59.anInt1632 * (local9 - Static119.anInt2839) / 1000;
			if (local9 < Static119.anInt2839) {
				Static119.anInt2839 = local9;
			}
		}
		if (local15 > Static109.anInt3091) {
			Static109.anInt3091 += Static12.anInt518 + (local15 - Static109.anInt3091) * Static59.anInt1632 / 1000;
			if (Static109.anInt3091 > local15) {
				Static109.anInt3091 = local15;
			}
		}
		if (local9 < Static119.anInt2839) {
			Static119.anInt2839 -= Static12.anInt518 + (Static119.anInt2839 - local9) * Static59.anInt1632 / 1000;
			if (Static119.anInt2839 < local9) {
				Static119.anInt2839 = local9;
			}
		}
		if (local15 < Static109.anInt3091) {
			Static109.anInt3091 -= Static59.anInt1632 * (Static109.anInt3091 - local15) / 1000 + Static12.anInt518;
			if (local15 > Static109.anInt3091) {
				Static109.anInt3091 = local15;
			}
		}
		local15 = Static48.anInt1458 * 128 + 64;
		local9 = Static124.anInt2985 * 128 + 64;
		local24 = Static45.method1845(Static42.anInt1208, local15, local9) - Static95.anInt2446;
		@Pc(203) int local203 = local24 - Static88.anInt2285;
		@Pc(208) int local208 = local9 - Static119.anInt2839;
		@Pc(213) int local213 = local15 - Static109.anInt3091;
		@Pc(225) int local225 = (int) Math.sqrt((double) (local208 * local208 + local213 * local213));
		@Pc(236) int local236 = (int) (Math.atan2((double) local203, (double) local225) * 325.949D) & 0x7FF;
		if (local236 < 128) {
			local236 = 128;
		}
		@Pc(252) int local252 = (int) (Math.atan2((double) local208, (double) local213) * -325.949D) & 0x7FF;
		if (local236 > 383) {
			local236 = 383;
		}
		if (Static58.anInt1617 < local236) {
			Static58.anInt1617 += (local236 - Static58.anInt1617) * Static54.anInt1515 / 1000 + Static130.anInt1511;
			if (Static58.anInt1617 > local236) {
				Static58.anInt1617 = local236;
			}
		}
		if (Static58.anInt1617 > local236) {
			Static58.anInt1617 -= Static54.anInt1515 * (Static58.anInt1617 - local236) / 1000 + Static130.anInt1511;
			if (local236 > Static58.anInt1617) {
				Static58.anInt1617 = local236;
			}
		}
		@Pc(312) int local312 = local252 - Static66.anInt1754;
		if (local312 > 1024) {
			local312 -= 2048;
		}
		if (local312 < -1024) {
			local312 += 2048;
		}
		if (local312 > 0) {
			Static66.anInt1754 += Static130.anInt1511 + local312 * Static54.anInt1515 / 1000;
			Static66.anInt1754 &= 0x7FF;
		}
		if (local312 < 0) {
			Static66.anInt1754 -= Static130.anInt1511 + -local312 * Static54.anInt1515 / 1000;
			Static66.anInt1754 &= 0x7FF;
		}
		@Pc(365) int local365 = local252 - Static66.anInt1754;
		if (local365 > 1024) {
			local365 -= 2048;
		}
		if (local365 < -1024) {
			local365 += 2048;
		}
		if (local365 < 0 && local312 > 0 || local365 > 0 && local312 < 0) {
			Static66.anInt1754 = local252;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1189() {
		aClass34_847 = null;
		aClass34_850 = null;
		aClass34_851 = null;
		aClass1_Sub9_10 = null;
		aClass34_853 = null;
		aClass34_852 = null;
		aByteArrayArrayArray7 = null;
		aClass34_848 = null;
		aClass34_849 = null;
		aClass34_854 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)I")
	public static int method1190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!of;B)Lclient!id;")
	public static Class34 method1191(@OriginalArg(0) Class1_Sub19 arg0) {
		return Static15.method361(arg0);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	public static void method1192() {
		if (Static23.aClass1_Sub9_6 != null || Static129.aClass1_Sub9_15 != null) {
			return;
		}
		@Pc(13) int local13 = Static55.anInt1547;
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(84) int local84;
		if (Static115.aBoolean158) {
			if (local13 != 1) {
				local22 = Static39.anInt1143;
				local24 = Static19.anInt658;
				if (local22 < Static88.anInt2288 - 10 || local22 > Static88.anInt2288 + Static2.anInt274 + 10 || Static58.anInt1621 - 10 > local24 || Static58.anInt1621 + Static15.anInt605 + 10 < local24) {
					Static115.aBoolean158 = false;
					Static8.method259(Static2.anInt274, Static88.anInt2288, Static15.anInt605, Static58.anInt1621);
				}
			}
			if (local13 == 1) {
				local24 = Static58.anInt1621;
				local22 = Static88.anInt2288;
				@Pc(78) int local78 = Static119.anInt2832;
				@Pc(80) int local80 = -1;
				@Pc(82) int local82 = Static118.anInt2830;
				local84 = Static2.anInt274;
				for (@Pc(86) int local86 = 0; local86 < Static71.anInt1876; local86++) {
					@Pc(101) int local101 = (Static71.anInt1876 - local86 - 1) * 15 + local24 + 31;
					if (local78 > local22 && local78 < local84 + local22 && local101 - 13 < local82 && local101 + 3 > local82) {
						local80 = local86;
					}
				}
				if (local80 != -1) {
					Static118.method1878(local80);
				}
				Static115.aBoolean158 = false;
				Static8.method259(Static2.anInt274, Static88.anInt2288, Static15.anInt605, Static58.anInt1621);
			}
			return;
		}
		if (local13 == 1 && Static71.anInt1876 > 0) {
			local22 = Static78.anIntArray245[Static71.anInt1876 - 1];
			if (local22 == 5 || local22 == 38 || local22 == 20 || local22 == 47 || local22 == 2 || local22 == 30 || local22 == 31 || local22 == 37 || local22 == 23 || local22 == 26 || local22 == 49 || local22 == 1001) {
				local24 = Static51.anIntArray155[Static71.anInt1876 - 1];
				local84 = Static62.anIntArray178[Static71.anInt1876 - 1];
				@Pc(227) Class1_Sub9 local227 = Static113.method1814(local84);
				if (Static8.method262(Static84.method1448(local227)) || Static129.method2012(Static84.method1448(local227))) {
					Static67.anInt1765 = 0;
					Static110.aBoolean137 = false;
					if (Static23.aClass1_Sub9_6 != null) {
						Static10.method277(Static23.aClass1_Sub9_6);
					}
					Static23.aClass1_Sub9_6 = Static113.method1814(local84);
					Static45.anInt2766 = Static119.anInt2832;
					Static26.anInt849 = Static118.anInt2830;
					Static55.anInt1554 = local24;
					Static10.method277(Static23.aClass1_Sub9_6);
					return;
				}
			}
		}
		if (local13 == 1 && (Static56.anInt2386 == 1 && Static71.anInt1876 > 2 || Static90.method2085(Static71.anInt1876 - 1))) {
			local13 = 2;
		}
		if (local13 == 1 && Static71.anInt1876 > 0) {
			Static118.method1878(Static71.anInt1876 - 1);
		}
		if (local13 == 2 && Static71.anInt1876 > 0) {
			Static10.method274();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!ie;I)Z")
	public static boolean method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2) {
		@Pc(10) byte[] local10 = arg2.method1573(arg0, arg1);
		if (local10 == null) {
			return false;
		} else {
			Static11.method282(local10);
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI[BI)Z")
	public static boolean method1194(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub19 local10 = new Class1_Sub19(arg1);
		@Pc(17) boolean local17 = true;
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local10.method2078();
			if (local23 == 0) {
				return local17;
			}
			local19 += local23;
			@Pc(31) boolean local31 = false;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(39) int local39;
				while (!local31) {
					local39 = local10.method2078();
					if (local39 == 0) {
						continue label54;
					}
					local33 += local39 - 1;
					@Pc(66) int local66 = local33 & 0x3F;
					@Pc(72) int local72 = local33 >> 6 & 0x3F;
					@Pc(78) int local78 = local10.method2072() >> 2;
					@Pc(83) int local83 = local72 + arg2;
					@Pc(87) int local87 = local66 + arg0;
					if (local83 > 0 && local87 > 0 && local83 < 103 && local87 < 103) {
						@Pc(106) Class1_Sub1_Sub16 local106 = Static28.method2008(local19);
						if (local78 != 22 || !Static21.aBoolean39 || local106.anInt2980 != 0 || local106.anInt2971 == 1 || local106.aBoolean169) {
							local31 = true;
							if (!local106.method1967()) {
								local17 = false;
								Static89.anInt1975++;
							}
						}
					}
				}
				local39 = local10.method2078();
				if (local39 == 0) {
					break;
				}
				local10.method2072();
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1195(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static122.aClass71_1);
		arg0.removeMouseMotionListener(Static122.aClass71_1);
		arg0.removeFocusListener(Static122.aClass71_1);
		Static116.anInt2803 = 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLclient!ef;)V")
	public static void method1196(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt1434 == 0) {
			arg0.anInt1402 = 1024;
		}
		arg0.anInt1412 = 0;
		@Pc(17) int local17 = arg0.anInt1425 - Static73.anInt1947;
		if (arg0.anInt1434 == 1) {
			arg0.anInt1402 = 1536;
		}
		if (arg0.anInt1434 == 2) {
			arg0.anInt1402 = 0;
		}
		if (arg0.anInt1434 == 3) {
			arg0.anInt1402 = 512;
		}
		@Pc(57) int local57 = arg0.anInt1399 * 128 + arg0.anInt1443 * 64;
		arg0.anInt1428 += (local57 - arg0.anInt1428) / local17;
		@Pc(79) int local79 = arg0.anInt1411 * 128 + arg0.anInt1443 * 64;
		arg0.anInt1405 += (local79 - arg0.anInt1405) / local17;
	}
}
