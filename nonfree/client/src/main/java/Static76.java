import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!ce;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
	public static int[] anIntArray222 = new int[25];

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!pe;")
	private static Class65 aClass65_730 = Static119.method1462("Please use a different world)3");

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_721 = aClass65_730;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!pe;")
	private static Class65 aClass65_722 = Static119.method1462("Use");

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
	public static int[] anIntArray223 = new int[2048];

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public static int anInt1698 = 0;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_723 = Static119.method1462("sl_button");

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!pe;")
	private static Class65 aClass65_724 = Static119.method1462("Loaded fonts");

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_725 = aClass65_722;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_726 = aClass65_730;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Lclient!pe;")
	private static Class65 aClass65_728 = Static119.method1462("The server is being updated)3");

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Lclient!pe;")
	public static Class65 aClass65_727 = aClass65_728;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "[[[Lclient!cd;")
	public static Class13[][][] aClass13ArrayArrayArray1 = new Class13[4][104][104];

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_729 = aClass65_724;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
	public static int anInt1703 = 0;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	public static int anInt1704 = 0;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	public static int anInt1705 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
	public static void method1279(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static84.anIntArray241[arg0];
		@Pc(17) int local17 = Static113.anIntArray333[arg0];
		@Pc(21) int local21 = Static126.anIntArray355[arg0];
		@Pc(25) int local25 = Static45.anIntArray131[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		if (local21 == 20) {
			Static49.aClass2_Sub4_Sub1_1.method962(112);
			Static49.aClass2_Sub4_Sub1_1.method920(local13);
			Static49.aClass2_Sub4_Sub1_1.method925(local25);
			Static49.aClass2_Sub4_Sub1_1.method914(local17);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		@Pc(68) Class2_Sub22 local68;
		if (local21 == 25) {
			local68 = Static84.method1365(local17, local13);
			if (local68 != null) {
				Static35.method644();
				Static53.method889(local13, Static83.method1356(Static114.method1834(local68)), local17);
				Static113.anInt2520 = 0;
				Static103.aClass65_984 = Static108.method1746(local68);
				if (Static103.aClass65_984 == null) {
					Static103.aClass65_984 = Static111.aClass65_1059;
				}
				if (local68.aBoolean124) {
					Static22.aClass65_262 = Static35.method647(new Class65[] { local68.aClass65_1226, Static106.aClass65_1003 });
					return;
				}
				Static22.aClass65_262 = Static35.method647(new Class65[] { Static62.aClass65_658, local68.aClass65_1223, Static106.aClass65_1003 });
			}
			return;
		}
		@Pc(137) Class2_Sub1_Sub1_Sub4_Sub1 local137;
		if (local21 == 24) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static14.anInt351 = 2;
				Static49.anInt1206 = Static96.anInt2190;
				Static14.anInt355 = 0;
				Static97.anInt2215 = Static100.anInt2282;
				Static49.aClass2_Sub4_Sub1_1.method962(241);
				Static49.aClass2_Sub4_Sub1_1.method900(local25);
			}
		}
		@Pc(212) boolean local212;
		if (local21 == 22) {
			local212 = Static70.method1234(local17, 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			if (!local212) {
				Static70.method1234(local17, 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			}
			Static49.anInt1206 = Static96.anInt2190;
			Static97.anInt2215 = Static100.anInt2282;
			Static14.anInt351 = 2;
			Static14.anInt355 = 0;
			Static49.aClass2_Sub4_Sub1_1.method962(140);
			Static49.aClass2_Sub4_Sub1_1.method925(local13 + Static34.anInt791);
			Static49.aClass2_Sub4_Sub1_1.method900(local25);
			Static49.aClass2_Sub4_Sub1_1.method900(Static66.anInt1577 + local17);
		}
		if (local21 == 18 || local21 == 1003) {
			Static102.method1663(Static83.aClass65Array40[arg0], local17, local25, local13);
		}
		@Pc(287) Class2_Sub1_Sub1_Sub4_Sub2 local287;
		if (local21 == 36) {
			local287 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25];
			if (local287 != null) {
				Static70.method1234(local287.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local287.anIntArray263[0], false);
				Static49.anInt1206 = Static96.anInt2190;
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt351 = 2;
				Static14.anInt355 = 0;
				Static49.aClass2_Sub4_Sub1_1.method962(174);
				Static49.aClass2_Sub4_Sub1_1.method920(Static113.anInt2532);
				Static49.aClass2_Sub4_Sub1_1.method901(Static117.anInt2577);
				Static49.aClass2_Sub4_Sub1_1.method900(local25);
			}
		}
		if (local21 == 42) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static49.anInt1206 = Static96.anInt2190;
				Static14.anInt355 = 0;
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt351 = 2;
				Static49.aClass2_Sub4_Sub1_1.method962(225);
				Static49.aClass2_Sub4_Sub1_1.method920(local25);
			}
		}
		if (local21 == 44) {
			local212 = Static70.method1234(local17, 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			if (!local212) {
				Static70.method1234(local17, 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			}
			Static14.anInt355 = 0;
			Static49.anInt1206 = Static96.anInt2190;
			Static97.anInt2215 = Static100.anInt2282;
			Static14.anInt351 = 2;
			Static49.aClass2_Sub4_Sub1_1.method962(59);
			Static49.aClass2_Sub4_Sub1_1.method925(local13 + Static34.anInt791);
			Static49.aClass2_Sub4_Sub1_1.method920(local25);
			Static49.aClass2_Sub4_Sub1_1.method925(Static66.anInt1577 + local17);
		}
		if (local21 == 1) {
			Static49.aClass2_Sub4_Sub1_1.method962(145);
			Static49.aClass2_Sub4_Sub1_1.method920(local13);
			Static49.aClass2_Sub4_Sub1_1.method900(local25);
			Static49.aClass2_Sub4_Sub1_1.method914(local17);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		@Pc(549) int local549;
		if (local21 == 37) {
			Static49.aClass2_Sub4_Sub1_1.method962(121);
			Static49.aClass2_Sub4_Sub1_1.method914(local17);
			local68 = Static35.method645(local17);
			if (local68.anIntArrayArray25 != null && local68.anIntArrayArray25[0][0] == 5) {
				local549 = local68.anIntArrayArray25[0][1];
				Static129.anIntArray363[local549] = 1 - Static129.anIntArray363[local549];
				Static11.method916(local549);
			}
		}
		if (local21 == 41) {
			Static1.method15(local17, local25, local13);
			Static49.aClass2_Sub4_Sub1_1.method962(169);
			Static49.aClass2_Sub4_Sub1_1.method900(local17 + Static66.anInt1577);
			Static49.aClass2_Sub4_Sub1_1.method937(local13 + Static34.anInt791);
			Static49.aClass2_Sub4_Sub1_1.method937(local25 >> 14 & 0x7FFF);
		}
		if (local21 == 1006) {
			Static14.anInt355 = 0;
			Static97.anInt2215 = Static100.anInt2282;
			Static49.anInt1206 = Static96.anInt2190;
			Static14.anInt351 = 2;
			Static49.aClass2_Sub4_Sub1_1.method962(217);
			Static49.aClass2_Sub4_Sub1_1.method920(local25);
		}
		if (local21 == 26) {
			Static49.aClass2_Sub4_Sub1_1.method962(108);
			Static49.aClass2_Sub4_Sub1_1.method925(local13);
			Static49.aClass2_Sub4_Sub1_1.method914(local17);
			Static49.aClass2_Sub4_Sub1_1.method937(local25);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 9) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static49.anInt1206 = Static96.anInt2190;
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt351 = 2;
				Static14.anInt355 = 0;
				Static49.aClass2_Sub4_Sub1_1.method962(186);
				Static49.aClass2_Sub4_Sub1_1.method925(local25);
				Static49.aClass2_Sub4_Sub1_1.method909(Static117.anInt2577);
				Static49.aClass2_Sub4_Sub1_1.method925(Static113.anInt2532);
			}
		}
		if (local21 == 43) {
			local287 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25];
			if (local287 != null) {
				Static70.method1234(local287.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local287.anIntArray263[0], false);
				Static14.anInt355 = 0;
				Static49.anInt1206 = Static96.anInt2190;
				Static14.anInt351 = 2;
				Static97.anInt2215 = Static100.anInt2282;
				Static49.aClass2_Sub4_Sub1_1.method962(58);
				Static49.aClass2_Sub4_Sub1_1.method900(local25);
				Static49.aClass2_Sub4_Sub1_1.method900(Static134.anInt2949);
				Static49.aClass2_Sub4_Sub1_1.method925(Static19.anInt479);
				Static49.aClass2_Sub4_Sub1_1.method947(Static103.anInt2355);
			}
		}
		if (local21 == 23) {
			Static49.aClass2_Sub4_Sub1_1.method962(53);
			Static49.aClass2_Sub4_Sub1_1.method914(local17);
			Static49.aClass2_Sub4_Sub1_1.method925(Static134.anInt2949);
			Static49.aClass2_Sub4_Sub1_1.method947(Static103.anInt2355);
			Static49.aClass2_Sub4_Sub1_1.method925(local13);
			Static49.aClass2_Sub4_Sub1_1.method925(Static19.anInt479);
			Static49.aClass2_Sub4_Sub1_1.method937(local25);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 12 && Static101.aClass2_Sub22_12 == null) {
			Static57.method1075(local17, local13);
			Static101.aClass2_Sub22_12 = Static84.method1365(local17, local13);
			Static116.method1853(Static101.aClass2_Sub22_12);
		}
		if (local21 == 14) {
			Static1.method15(local17, local25, local13);
			Static49.aClass2_Sub4_Sub1_1.method962(48);
			Static49.aClass2_Sub4_Sub1_1.method920(local25 >> 14 & 0x7FFF);
			Static49.aClass2_Sub4_Sub1_1.method937(Static66.anInt1577 + local17);
			Static49.aClass2_Sub4_Sub1_1.method937(Static34.anInt791 + local13);
		}
		if (local21 == 30) {
			Static49.aClass2_Sub4_Sub1_1.method962(243);
			Static49.aClass2_Sub4_Sub1_1.method937(local13);
			Static49.aClass2_Sub4_Sub1_1.method914(local17);
			Static49.aClass2_Sub4_Sub1_1.method900(local25);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 15) {
			Static49.aClass2_Sub4_Sub1_1.method962(13);
			Static49.aClass2_Sub4_Sub1_1.method937(local25);
			Static49.aClass2_Sub4_Sub1_1.method920(local13);
			Static49.aClass2_Sub4_Sub1_1.method901(local17);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 58) {
			local212 = Static70.method1234(local17, 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			if (!local212) {
				Static70.method1234(local17, 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			}
			Static14.anInt355 = 0;
			Static49.anInt1206 = Static96.anInt2190;
			Static14.anInt351 = 2;
			Static97.anInt2215 = Static100.anInt2282;
			Static49.aClass2_Sub4_Sub1_1.method962(98);
			Static49.aClass2_Sub4_Sub1_1.method925(Static34.anInt791 + local13);
			Static49.aClass2_Sub4_Sub1_1.method900(local17 + Static66.anInt1577);
			Static49.aClass2_Sub4_Sub1_1.method900(local25);
		}
		if (local21 == 40) {
			Static124.aClass49_1.method1182(Static59.anInt1479, local13, local17);
		}
		if (local21 == 45) {
			local68 = Static35.method645(local17);
			@Pc(1052) boolean local1052 = true;
			if (local68.anInt2801 > 0) {
				local1052 = Static21.method347(local68);
			}
			if (local1052) {
				Static49.aClass2_Sub4_Sub1_1.method962(121);
				Static49.aClass2_Sub4_Sub1_1.method914(local17);
			}
		}
		if (local21 == 34) {
			Static103.method1701();
		}
		if (local21 == 8) {
			Static1.method15(local17, local25, local13);
			Static49.aClass2_Sub4_Sub1_1.method962(255);
			Static49.aClass2_Sub4_Sub1_1.method925(Static66.anInt1577 + local17);
			Static49.aClass2_Sub4_Sub1_1.method925(local13 + Static34.anInt791);
			Static49.aClass2_Sub4_Sub1_1.method925(local25 >> 14 & 0x7FFF);
		}
		if (local21 == 1001) {
			local68 = Static35.method645(local17);
			if (local68 == null || local68.anIntArray370[local13] < 100000) {
				Static49.aClass2_Sub4_Sub1_1.method962(217);
				Static49.aClass2_Sub4_Sub1_1.method920(local25);
			} else {
				Static59.method1098(0, Static110.aClass65_1038, Static35.method647(new Class65[] { Static120.method1871(local68.anIntArray370[local13]), Static13.aClass65_1124, Static4.method872(local25).aClass65_870 }));
			}
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 5) {
			local212 = Static70.method1234(local17, 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			if (!local212) {
				Static70.method1234(local17, 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			}
			Static14.anInt351 = 2;
			Static14.anInt355 = 0;
			Static49.anInt1206 = Static96.anInt2190;
			Static97.anInt2215 = Static100.anInt2282;
			Static49.aClass2_Sub4_Sub1_1.method962(185);
			Static49.aClass2_Sub4_Sub1_1.method920(local25);
			Static49.aClass2_Sub4_Sub1_1.method920(local17 + Static66.anInt1577);
			Static49.aClass2_Sub4_Sub1_1.method925(Static34.anInt791 + local13);
		}
		if (local21 == 13) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static14.anInt355 = 0;
				Static14.anInt351 = 2;
				Static49.anInt1206 = Static96.anInt2190;
				Static97.anInt2215 = Static100.anInt2282;
				Static49.aClass2_Sub4_Sub1_1.method962(83);
				Static49.aClass2_Sub4_Sub1_1.method920(local25);
			}
		}
		if (local21 == 1002) {
			Static1.method15(local17, local25, local13);
			Static49.aClass2_Sub4_Sub1_1.method962(10);
			Static49.aClass2_Sub4_Sub1_1.method925(local13 + Static34.anInt791);
			Static49.aClass2_Sub4_Sub1_1.method937(local17 + Static66.anInt1577);
			Static49.aClass2_Sub4_Sub1_1.method920(local25 >> 14 & 0x7FFF);
		}
		if (local21 == 16) {
			Static49.aClass2_Sub4_Sub1_1.method962(31);
			Static49.aClass2_Sub4_Sub1_1.method920(local25);
			Static49.aClass2_Sub4_Sub1_1.method947(local17);
			Static49.aClass2_Sub4_Sub1_1.method900(Static113.anInt2532);
			Static49.aClass2_Sub4_Sub1_1.method920(local13);
			Static49.aClass2_Sub4_Sub1_1.method947(Static117.anInt2577);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 48) {
			local287 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25];
			if (local287 != null) {
				Static70.method1234(local287.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local287.anIntArray263[0], false);
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt355 = 0;
				Static49.anInt1206 = Static96.anInt2190;
				Static14.anInt351 = 2;
				Static49.aClass2_Sub4_Sub1_1.method962(123);
				Static49.aClass2_Sub4_Sub1_1.method925(local25);
			}
		}
		if (local21 == 6) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static49.anInt1206 = Static96.anInt2190;
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt351 = 2;
				Static14.anInt355 = 0;
				Static49.aClass2_Sub4_Sub1_1.method962(168);
				Static49.aClass2_Sub4_Sub1_1.method920(local25);
			}
		}
		if (local21 == 4) {
			local212 = Static70.method1234(local17, 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			if (!local212) {
				Static70.method1234(local17, 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			}
			Static49.anInt1206 = Static96.anInt2190;
			Static97.anInt2215 = Static100.anInt2282;
			Static14.anInt351 = 2;
			Static14.anInt355 = 0;
			Static49.aClass2_Sub4_Sub1_1.method962(105);
			Static49.aClass2_Sub4_Sub1_1.method920(Static19.anInt479);
			Static49.aClass2_Sub4_Sub1_1.method901(Static103.anInt2355);
			Static49.aClass2_Sub4_Sub1_1.method937(local25);
			Static49.aClass2_Sub4_Sub1_1.method920(Static34.anInt791 + local13);
			Static49.aClass2_Sub4_Sub1_1.method900(Static66.anInt1577 + local17);
			Static49.aClass2_Sub4_Sub1_1.method920(Static134.anInt2949);
		}
		if (local21 == 28) {
			Static1.method15(local17, local25, local13);
			Static49.aClass2_Sub4_Sub1_1.method962(96);
			Static49.aClass2_Sub4_Sub1_1.method937(local25 >> 14 & 0x7FFF);
			Static49.aClass2_Sub4_Sub1_1.method920(local13 + Static34.anInt791);
			Static49.aClass2_Sub4_Sub1_1.method937(Static66.anInt1577 + local17);
		}
		if (local21 == 21) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static14.anInt355 = 0;
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt351 = 2;
				Static49.anInt1206 = Static96.anInt2190;
				Static49.aClass2_Sub4_Sub1_1.method962(178);
				Static49.aClass2_Sub4_Sub1_1.method920(local25);
			}
		}
		if (local21 == 57) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static14.anInt355 = 0;
				Static14.anInt351 = 2;
				Static97.anInt2215 = Static100.anInt2282;
				Static49.anInt1206 = Static96.anInt2190;
				Static49.aClass2_Sub4_Sub1_1.method962(244);
				Static49.aClass2_Sub4_Sub1_1.method937(local25);
			}
		}
		if (local21 == 39) {
			local287 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25];
			if (local287 != null) {
				Static70.method1234(local287.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local287.anIntArray263[0], false);
				Static14.anInt355 = 0;
				Static49.anInt1206 = Static96.anInt2190;
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt351 = 2;
				Static49.aClass2_Sub4_Sub1_1.method962(28);
				Static49.aClass2_Sub4_Sub1_1.method925(local25);
			}
		}
		if (local21 == 10) {
			Static49.aClass2_Sub4_Sub1_1.method962(233);
			Static49.aClass2_Sub4_Sub1_1.method925(local13);
			Static49.aClass2_Sub4_Sub1_1.method925(local25);
			Static49.aClass2_Sub4_Sub1_1.method914(local17);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 29) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static49.anInt1206 = Static96.anInt2190;
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt355 = 0;
				Static14.anInt351 = 2;
				Static49.aClass2_Sub4_Sub1_1.method962(102);
				Static49.aClass2_Sub4_Sub1_1.method925(local25);
			}
		}
		if (local21 == 49) {
			local212 = Static70.method1234(local17, 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			if (!local212) {
				Static70.method1234(local17, 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			}
			Static97.anInt2215 = Static100.anInt2282;
			Static49.anInt1206 = Static96.anInt2190;
			Static14.anInt355 = 0;
			Static14.anInt351 = 2;
			Static49.aClass2_Sub4_Sub1_1.method962(101);
			Static49.aClass2_Sub4_Sub1_1.method937(local17 + Static66.anInt1577);
			Static49.aClass2_Sub4_Sub1_1.method925(local25);
			Static49.aClass2_Sub4_Sub1_1.method937(Static34.anInt791 + local13);
			Static49.aClass2_Sub4_Sub1_1.method925(Static113.anInt2532);
			Static49.aClass2_Sub4_Sub1_1.method947(Static117.anInt2577);
		}
		if (local21 == 47) {
			local212 = Static70.method1234(local17, 0, 0, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			if (!local212) {
				Static70.method1234(local17, 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local13, false);
			}
			Static14.anInt351 = 2;
			Static49.anInt1206 = Static96.anInt2190;
			Static97.anInt2215 = Static100.anInt2282;
			Static14.anInt355 = 0;
			Static49.aClass2_Sub4_Sub1_1.method962(94);
			Static49.aClass2_Sub4_Sub1_1.method937(Static66.anInt1577 + local17);
			Static49.aClass2_Sub4_Sub1_1.method920(local25);
			Static49.aClass2_Sub4_Sub1_1.method920(Static34.anInt791 + local13);
		}
		if (local21 == 33) {
			Static49.aClass2_Sub4_Sub1_1.method962(176);
			Static49.aClass2_Sub4_Sub1_1.method914(local17);
			Static49.aClass2_Sub4_Sub1_1.method900(local25);
			Static49.aClass2_Sub4_Sub1_1.method920(local13);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 35) {
			Static49.aClass2_Sub4_Sub1_1.method962(164);
			Static49.aClass2_Sub4_Sub1_1.method937(local25);
			Static49.aClass2_Sub4_Sub1_1.method920(local13);
			Static49.aClass2_Sub4_Sub1_1.method901(local17);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 32) {
			Static49.aClass2_Sub4_Sub1_1.method962(60);
			Static49.aClass2_Sub4_Sub1_1.method900(local13);
			Static49.aClass2_Sub4_Sub1_1.method947(Static117.anInt2577);
			Static49.aClass2_Sub4_Sub1_1.method920(Static113.anInt2532);
			Static49.aClass2_Sub4_Sub1_1.method947(local17);
		}
		if (local21 == 1007) {
			Static14.anInt355 = 0;
			Static97.anInt2215 = Static100.anInt2282;
			Static14.anInt351 = 2;
			Static49.anInt1206 = Static96.anInt2190;
			local287 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25];
			if (local287 != null) {
				@Pc(2171) Class2_Sub1_Sub12 local2171 = local287.aClass2_Sub1_Sub12_1;
				if (local2171.anIntArray282 != null) {
					local2171 = local2171.method1557();
				}
				if (local2171 != null) {
					Static49.aClass2_Sub4_Sub1_1.method962(38);
					Static49.aClass2_Sub4_Sub1_1.method925(local2171.anInt2128);
				}
			}
		}
		if (local21 == 11) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static97.anInt2215 = Static100.anInt2282;
				Static49.anInt1206 = Static96.anInt2190;
				Static14.anInt351 = 2;
				Static14.anInt355 = 0;
				Static49.aClass2_Sub4_Sub1_1.method962(63);
				Static49.aClass2_Sub4_Sub1_1.method900(local25);
			}
		}
		if (local21 == 3) {
			Static49.aClass2_Sub4_Sub1_1.method962(23);
			Static49.aClass2_Sub4_Sub1_1.method937(local13);
			Static49.aClass2_Sub4_Sub1_1.method947(local17);
			Static49.aClass2_Sub4_Sub1_1.method920(local25);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 17 && Static1.method15(local17, local25, local13)) {
			Static49.aClass2_Sub4_Sub1_1.method962(75);
			Static49.aClass2_Sub4_Sub1_1.method900(local25 >> 14 & 0x7FFF);
			Static49.aClass2_Sub4_Sub1_1.method900(local17 + Static66.anInt1577);
			Static49.aClass2_Sub4_Sub1_1.method925(Static19.anInt479);
			Static49.aClass2_Sub4_Sub1_1.method925(Static34.anInt791 + local13);
			Static49.aClass2_Sub4_Sub1_1.method920(Static134.anInt2949);
			Static49.aClass2_Sub4_Sub1_1.method947(Static103.anInt2355);
		}
		if (local21 == 38) {
			local287 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25];
			if (local287 != null) {
				Static70.method1234(local287.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local287.anIntArray263[0], false);
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt355 = 0;
				Static14.anInt351 = 2;
				Static49.anInt1206 = Static96.anInt2190;
				Static49.aClass2_Sub4_Sub1_1.method962(187);
				Static49.aClass2_Sub4_Sub1_1.method925(local25);
			}
		}
		if (local21 == 51 && Static1.method15(local17, local25, local13)) {
			Static49.aClass2_Sub4_Sub1_1.method962(175);
			Static49.aClass2_Sub4_Sub1_1.method920(Static113.anInt2532);
			Static49.aClass2_Sub4_Sub1_1.method901(Static117.anInt2577);
			Static49.aClass2_Sub4_Sub1_1.method937(Static66.anInt1577 + local17);
			Static49.aClass2_Sub4_Sub1_1.method920(Static34.anInt791 + local13);
			Static49.aClass2_Sub4_Sub1_1.method925(local25 >> 14 & 0x7FFF);
		}
		if (local21 == 50) {
			local287 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25];
			if (local287 != null) {
				Static70.method1234(local287.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local287.anIntArray263[0], false);
				Static14.anInt355 = 0;
				Static14.anInt351 = 2;
				Static97.anInt2215 = Static100.anInt2282;
				Static49.anInt1206 = Static96.anInt2190;
				Static49.aClass2_Sub4_Sub1_1.method962(236);
				Static49.aClass2_Sub4_Sub1_1.method920(local25);
			}
		}
		if (local21 == 7) {
			Static49.aClass2_Sub4_Sub1_1.method962(121);
			Static49.aClass2_Sub4_Sub1_1.method914(local17);
			local68 = Static35.method645(local17);
			if (local68.anIntArrayArray25 != null && local68.anIntArrayArray25[0][0] == 5) {
				local549 = local68.anIntArrayArray25[0][1];
				if (Static129.anIntArray363[local549] != local68.anIntArray365[0]) {
					Static129.anIntArray363[local549] = local68.anIntArray365[0];
					Static11.method916(local549);
				}
			}
		}
		if (local21 == 1004) {
			Static14.anInt351 = 2;
			Static49.anInt1206 = Static96.anInt2190;
			Static97.anInt2215 = Static100.anInt2282;
			Static14.anInt355 = 0;
			Static49.aClass2_Sub4_Sub1_1.method962(242);
			Static49.aClass2_Sub4_Sub1_1.method920(local25 >> 14 & 0x7FFF);
		}
		if (local21 == 19) {
			Static35.method644();
			local68 = Static35.method645(local17);
			Static134.anInt2949 = local25;
			Static19.anInt479 = local13;
			Static103.anInt2355 = local17;
			Static113.anInt2520 = 1;
			Static116.method1853(local68);
			Static18.aClass65_143 = Static35.method647(new Class65[] { Static42.aClass65_462, Static4.method872(local25).aClass65_870, Static106.aClass65_1003 });
			if (Static18.aClass65_143 == null) {
				Static18.aClass65_143 = Static124.aClass65_1153;
			}
			return;
		}
		if (local21 == 2) {
			local137 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local25];
			if (local137 != null) {
				Static70.method1234(local137.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local137.anIntArray263[0], false);
				Static14.anInt355 = 0;
				Static49.anInt1206 = Static96.anInt2190;
				Static14.anInt351 = 2;
				Static97.anInt2215 = Static100.anInt2282;
				Static49.aClass2_Sub4_Sub1_1.method962(237);
				Static49.aClass2_Sub4_Sub1_1.method900(Static19.anInt479);
				Static49.aClass2_Sub4_Sub1_1.method937(Static134.anInt2949);
				Static49.aClass2_Sub4_Sub1_1.method901(Static103.anInt2355);
				Static49.aClass2_Sub4_Sub1_1.method937(local25);
			}
		}
		if (local21 == 46) {
			Static49.aClass2_Sub4_Sub1_1.method962(116);
			Static49.aClass2_Sub4_Sub1_1.method920(local13);
			Static49.aClass2_Sub4_Sub1_1.method901(local17);
			Static49.aClass2_Sub4_Sub1_1.method925(local25);
			Static11.anInt1293 = 0;
			Static28.aClass2_Sub22_3 = Static35.method645(local17);
			Static91.anInt2038 = local13;
		}
		if (local21 == 31) {
			local287 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local25];
			if (local287 != null) {
				Static70.method1234(local287.anIntArray264[0], 1, 0, 1, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0], 0, 2, 0, Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0], local287.anIntArray263[0], false);
				Static49.anInt1206 = Static96.anInt2190;
				Static97.anInt2215 = Static100.anInt2282;
				Static14.anInt351 = 2;
				Static14.anInt355 = 0;
				Static49.aClass2_Sub4_Sub1_1.method962(106);
				Static49.aClass2_Sub4_Sub1_1.method937(local25);
			}
		}
		if (Static113.anInt2520 != 0) {
			Static113.anInt2520 = 0;
			Static116.method1853(Static35.method645(Static103.anInt2355));
		}
		if (Static117.aBoolean103) {
			Static35.method644();
		}
		if (Static28.aClass2_Sub22_3 != null && Static11.anInt1293 == 0) {
			Static116.method1853(Static28.aClass2_Sub22_3);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1280() {
		aClass65_729 = null;
		aClass65_725 = null;
		aClass65_728 = null;
		aClass14_1 = null;
		aClass65_724 = null;
		aClass65_721 = null;
		anIntArray222 = null;
		anIntArray223 = null;
		aClass13ArrayArrayArray1 = null;
		aClass65_726 = null;
		aByteArrayArray6 = null;
		aClass65_730 = null;
		aClass65_723 = null;
		aClass65_727 = null;
		aClass65_722 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!na;I)Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2 method1281(@OriginalArg(0) int arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) int arg2) {
		return Static10.method2052(arg1, arg2, arg0) ? Static63.method1131() : null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BZ)V")
	public static void method1282(@OriginalArg(1) boolean arg0) {
		Static124.method1897();
		Static111.anInt2492++;
		if (Static111.anInt2492 < 50 && !arg0) {
			return;
		}
		Static111.anInt2492 = 0;
		if (Static129.aBoolean116 || Static129.aClass7_6 == null) {
			return;
		}
		Static49.aClass2_Sub4_Sub1_1.method962(7);
		try {
			Static129.aClass7_6.method161(Static49.aClass2_Sub4_Sub1_1.aByteArray20, Static49.aClass2_Sub4_Sub1_1.anInt1298);
			Static49.aClass2_Sub4_Sub1_1.anInt1298 = 0;
		} catch (@Pc(43) IOException local43) {
			Static129.aBoolean116 = true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public static void method1283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg0);
		@Pc(22) Class2_Sub1_Sub16 local22 = (Class2_Sub1_Sub16) Static7.aClass40_3.method851(local16);
		if (local22 != null) {
			Static39.aClass74_2.method1825(local22);
		}
	}
}
