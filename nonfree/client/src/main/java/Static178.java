import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!tf", name = "pb", descriptor = "Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1 aClass1_Sub2_Sub5_Sub1_3;

	@OriginalMember(owner = "client!tf", name = "qb", descriptor = "I")
	public static int anInt4019;

	@OriginalMember(owner = "client!tf", name = "gb", descriptor = "[I")
	public static final int[] anIntArray457 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!tf", name = "hb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2400 = Static118.method2249("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!tf", name = "kb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2402 = Static118.method2249("glow2:");

	@OriginalMember(owner = "client!tf", name = "ib", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2401 = aClass65_2402;

	@OriginalMember(owner = "client!tf", name = "mb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2403 = aClass65_2402;

	@OriginalMember(owner = "client!tf", name = "ob", descriptor = "[B")
	public static final byte[] aByteArray47 = new byte[520];

	@OriginalMember(owner = "client!tf", name = "wb", descriptor = "I")
	public static int anInt4025 = -1;

	@OriginalMember(owner = "client!tf", name = "xb", descriptor = "[I")
	public static final int[] anIntArray458 = new int[32];

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIII)V")
	public static void method3020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static51.method893(arg3, Static40.anIntArrayArray11[arg2], arg1 + arg0, -arg1 + arg0);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = -1;
		@Pc(24) int local24 = arg1;
		@Pc(27) int local27 = -arg1;
		while (local20 < local24) {
			local22 += 2;
			local20++;
			local27 += local22;
			if (local27 >= 0) {
				local24--;
				@Pc(48) int[] local48 = Static40.anIntArrayArray11[arg2 - local24];
				local27 -= local24 << 1;
				@Pc(58) int local58 = local20 + arg0;
				@Pc(63) int local63 = arg0 - local20;
				@Pc(69) int[] local69 = Static40.anIntArrayArray11[arg2 + local24];
				Static51.method893(arg3, local69, local58, local63);
				Static51.method893(arg3, local48, local58, local63);
			}
			@Pc(85) int local85 = arg0 + local24;
			@Pc(90) int local90 = arg0 - local24;
			@Pc(96) int[] local96 = Static40.anIntArrayArray11[local20 + arg2];
			@Pc(103) int[] local103 = Static40.anIntArrayArray11[arg2 - local20];
			Static51.method893(arg3, local96, local85, local90);
			Static51.method893(arg3, local103, local85, local90);
		}
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)V")
	public static void method3021() {
		Static70.aByteArrayArrayArray38 = new byte[4][105][105];
		Static71.aByteArrayArrayArray40 = new byte[4][104][104];
		Static196.anIntArray486 = new int[104];
		Static173.aByteArrayArrayArray104 = new byte[4][104][104];
		Static82.aByteArrayArrayArray51 = new byte[4][104][104];
		Static162.aByteArrayArrayArray98 = new byte[4][104][104];
		Static122.anIntArray398 = new int[104];
		Static49.anInt1297 = 99;
		Static93.anIntArray267 = new int[104];
		Static154.anIntArray423 = new int[104];
		Static204.anIntArrayArrayArray9 = new int[4][105][105];
		Static88.anIntArray243 = new int[104];
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
	public static void method3022() {
		Static18.anInt456 = 0;
		@Pc(12) int local12 = Static205.anInt4337 + (Static201.aClass6_Sub4_Sub1_3.anInt3934 >> 7);
		@Pc(24) int local24 = Static58.anInt1543 + (Static201.aClass6_Sub4_Sub1_3.anInt3976 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static18.anInt456 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static18.anInt456 = 1;
		}
		if (Static18.anInt456 == 1 && local12 >= 3139 && local12 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static18.anInt456 = 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!sd;I)Z")
	public static boolean method3023(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) byte[] local13 = arg1.method2340(arg0, arg2);
		if (local13 == null) {
			return false;
		} else {
			Static116.method2132(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIILclient!wg;JLclient!wg;Lclient!wg;)V")
	public static void method3024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class6 arg6, @OriginalArg(7) Class6 arg7) {
		@Pc(3) Class55 local3 = new Class55();
		local3.aClass6_7 = arg4;
		local3.anInt2662 = arg1 * 128 + 64;
		local3.anInt2658 = arg2 * 128 + 64;
		local3.anInt2665 = arg3;
		local3.aLong85 = arg5;
		local3.aClass6_6 = arg6;
		local3.aClass6_8 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub7 local42 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1677; local46++) {
				@Pc(52) Class54 local52 = local42.aClass54Array2[local46];
				if ((local52.aLong83 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass6_5.method2984();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt2661 = -local34;
		if (Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub7(arg0, arg1, arg2);
		}
		Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass55_1 = local3;
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(B)V")
	public static void method3025() {
		Static45.aClass1_Sub14_Sub1_8.method1761(205);
		Static45.aClass1_Sub14_Sub1_8.method1721(0L);
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(B)V")
	public static void method3027() {
		Static102.aClass65_1507 = Static28.aClass65_595;
		Static95.aClass65_1373 = Static131.aClass65_1816;
		Static49.aClass65_809 = Static39.aClass65_671;
		Static37.aClass65_660 = Static120.aClass65_1714;
		Static208.aClass65_2355 = Static206.aClass65_2572;
		Static89.aClass65_1260 = aClass65_2400;
		Static157.aClass65_2548 = Static201.aClass65_2376;
		Static99.aClass65_1486 = Static86.aClass65_1236;
		Static98.aClass65_1473 = Static64.aClass65_1002;
		Static108.aClass65_1551 = Static23.aClass65_506;
		Static14.aClass65_257 = Static153.aClass65_2028;
		Static166.aClass65_2238 = Static16.aClass65_320;
		Static54.aClass65_2165 = Static167.aClass65_2241;
		Static163.aClass65_2179 = Static49.aClass65_810;
		Static141.aClass65_1970 = Static29.aClass65_600;
		Static108.aClass65_1552 = Static57.aClass65_944;
		Static142.aClass65_1985 = Static210.aClass65_2608;
		Static123.aClass65_1735 = Static80.aClass65_1203;
		Static40.aClass65_676 = Static65.aClass65_1009;
		Static144.aClass65_2163 = Static51.aClass65_848;
		Static126.aClass65_1757 = Static37.aClass65_659;
		Static208.aClass65_2343 = Static80.aClass65_1201;
		Static97.aClass65_1450 = Static20.aClass65_486;
		Static138.aClass65_1898 = Static29.aClass65_602;
		Static141.aClass65_1973 = Static146.aClass65_2001;
		Static196.aClass65_2525 = Static80.aClass65_1201;
		Static58.aClass65_953 = Static173.aClass65_2282;
		Static196.aClass65_2530 = Static80.aClass65_1201;
		Static122.aClass65_1994 = Static148.aClass65_2007;
		Static149.aClass65_2018 = Static193.aClass65_2485;
		Static51.aClass65_850 = Static188.aClass65_2452;
		Static86.aClass65_1235 = Static9.aClass65_122;
		Static28.aClass65_593 = Static52.aClass65_879;
		Static33.aClass65_634 = Static22.aClass65_495;
		Static124.aClass65_1740 = Static29.aClass65_601;
		Static39.aClass65_669 = Static156.aClass65_2073;
		Static71.aClass65_1074 = Static128.aClass65_1782;
		Static62.aClass65_972 = Static18.aClass65_376;
		Static196.aClass65_2519 = Static80.aClass65_1201;
		Static208.aClass65_2360 = Static206.aClass65_2572;
		Static161.aClass65_2157 = Static198.aClass65_2542;
		Static208.aClass65_2339 = Static206.aClass65_2572;
		Static156.aClass65_2075 = Static145.aClass65_1987;
		Static154.aClass65_2045 = Static83.aClass65_1221;
		Static138.aClass65_1902 = Static149.aClass65_2013;
		Static145.aClass65_1989 = Static92.aClass65_1341;
		Static208.aClass65_2338 = Static77.aClass65_1166;
		Static186.aClass65_2441 = Static191.aClass65_2471;
		Static154.aClass65_2042 = Static109.aClass65_1561;
		Static208.aClass65_2335 = Static206.aClass65_2572;
		Static142.aClass65_1986 = Static33.aClass65_631;
		Static208.aClass65_2340 = Static40.aClass65_677;
		aClass65_2401 = Static165.aClass65_2214;
		Static208.aClass65_2332 = Static191.aClass65_2474;
		Static159.aClass65_2152 = Static154.aClass65_2040;
		Static111.aClass65_1578 = Static77.aClass65_1168;
		Static197.aClass65_2535 = Static77.aClass65_1169;
		Static140.aClass65_1965 = Static33.aClass65_637;
		Static39.aClass65_672 = Static163.aClass65_2182;
		Static208.aClass65_2346 = Static206.aClass65_2572;
		Static93.aClass65_1345 = Static74.aClass65_1115;
		Static48.aClass65_784 = Static38.aClass65_662;
		Static160.aClass65_1612 = Static190.aClass65_2470;
		Static65.aClass65_1010 = Static168.aClass65_1732;
		Static123.aClass65_1737 = Static43.aClass65_700;
		Static105.aClass65_1534 = Static156.aClass65_2072;
		Static126.aClass65_1756 = Static197.aClass65_2536;
		Static92.aClass65_1342 = Static108.aClass65_1554;
		Static208.aClass65_2347 = Static206.aClass65_2572;
		Static146.aClass65_2000 = Static113.aClass65_1609;
		Static158.aClass65_2104 = Static111.aClass65_1576;
		Static99.aClass65_1485 = Static204.aClass65_2562;
		Static109.aClass65_1560 = Static31.aClass65_616;
		Static208.aClass65_2373 = Static206.aClass65_2572;
		Static122.aClass65_1997 = Static96.aClass65_1424;
		Static154.aClass65_2041 = Static109.aClass65_1561;
		Static2.aClass65_45 = Static117.aClass65_1666;
		Static199.aClass65_2554 = Static7.aClass65_87;
		Static101.aClass65_1500 = Static134.aClass65_1865;
		Static25.aClass65_533 = Static4.aClass65_54;
		Static208.aClass65_2337 = Static206.aClass65_2572;
		Static208.aClass65_2368 = Static132.aClass65_1840;
		Static72.aClass65_1097 = Static146.aClass65_1998;
		Static196.aClass65_2522 = Static131.aClass65_1815;
		Static23.aClass65_510 = Static205.aClass65_2571;
		Static208.aClass65_2365 = Static206.aClass65_2572;
		Static1.aClass65_2604 = Static185.aClass65_2439;
		Static196.aClass65_2520 = Static143.aClass65_978;
		Static140.aClass65_1959 = Static169.aClass65_1226;
		Static208.aClass65_2359 = Static206.aClass65_2572;
		Static14.aClass65_253 = Static46.aClass65_749;
		Static179.aClass65_2404 = Static174.aClass65_2308;
		Static30.aClass65_612 = Static43.aClass65_702;
		Static192.aClass65_2475 = Static19.aClass65_480;
		Static208.aClass65_2364 = Static206.aClass65_2572;
		Static63.aClass65_975 = Static171.aClass65_2253;
		Static166.aClass65_2237 = Static180.aClass65_2319;
		Static208.aClass65_2351 = Static77.aClass65_1166;
		Static81.aClass65_1217 = Static53.aClass65_902;
		Static5.aClass65_56 = Static193.aClass65_2486;
		Static208.aClass65_2362 = Static206.aClass65_2572;
		Static84.aClass65_1230 = Static173.aClass65_2284;
		Static42.aClass65_694 = Static47.aClass65_772;
		Static100.aClass65_1494 = Static159.aClass65_2155;
		Static138.aClass65_1897 = Static157.aClass65_2551;
		Static208.aClass65_2371 = Static14.aClass65_258;
		Static136.aClass65_1874 = Static22.aClass65_496;
		Static148.aClass65_2006 = Static27.aClass65_573;
		Static172.aClass65_2276 = Static78.aClass65_1171;
		Static208.aClass65_2361 = Static206.aClass65_2572;
		Static142.aClass65_1983 = Static88.aClass65_1258;
		Static50.aClass65_875 = Static99.aClass65_1487;
		Static46.aClass65_750 = Static190.aClass65_2469;
		Static25.aClass65_534 = Static9.aClass65_120;
		Static208.aClass65_2336 = Static206.aClass65_2572;
		Static198.aClass65_2540 = Static112.aClass65_1586;
		Static209.aClass65_2577 = Static53.aClass65_903;
		Static208.aClass65_2345 = Static206.aClass65_2572;
		Static77.aClass65_1164 = Static208.aClass65_2342;
		Static149.aClass65_2014 = Static52.aClass65_878;
		Static199.aClass65_2552 = Static171.aClass65_2254;
		Static196.aClass65_2523 = Static131.aClass65_1815;
		Static1.aClass65_2603 = Static185.aClass65_2439;
		Static174.aClass65_2310 = Static204.aClass65_2559;
		Static188.aClass65_2457 = Static82.aClass65_1220;
		Static196.aClass65_2524 = Static114.aClass65_1622;
		Static208.aClass65_2329 = Static21.aClass65_491;
		Static208.aClass65_2333 = Static140.aClass65_1962;
		Static113.aClass65_1610 = Static75.aClass65_1133;
		Static42.aClass65_690 = Static33.aClass65_633;
		Static181.aClass65_2429 = Static141.aClass65_1977;
		Static196.aClass65_2521 = Static125.aClass65_1748;
		Static14.aClass65_254 = Static176.aClass65_2326;
		Static21.aClass65_492 = Static60.aClass65_959;
		Static51.aClass65_851 = Static107.aClass65_1547;
		Static8.aClass65_94 = Static84.aClass65_1232;
		Static89.aClass65_1263 = Static188.aClass65_2455;
		Static208.aClass65_2366 = Static9.aClass65_119;
		Static25.aClass65_540 = Static14.aClass65_260;
		Static42.aClass65_696 = Static31.aClass65_617;
		Static125.aClass65_1746 = Static58.aClass65_954;
		Static208.aClass65_2331 = Static206.aClass65_2572;
		Static92.aClass65_1337 = Static160.aClass65_1614;
		Static42.aClass65_698 = Static23.aClass65_511;
		Static102.aClass65_1510 = Static44.aClass65_703;
		Static208.aClass65_2372 = Static206.aClass65_2572;
		Static161.aClass65_2160 = Static33.aClass65_639;
		Static161.aClass65_2159 = Static206.aClass65_2572;
		Static183.aClass65_2322 = Static128.aClass65_1781;
		Static57.aClass65_943 = Static59.aClass65_957;
		Static204.aClass65_2560 = Static79.aClass65_1179;
		Static25.aClass65_541 = Static9.aClass65_120;
		Static208.aClass65_2358 = Static5.aClass65_59;
		Static42.aClass65_683 = Static89.aClass65_1259;
		Static153.aClass65_2023 = Static51.aClass65_852;
		Static208.aClass65_2353 = Static206.aClass65_2572;
		Static57.aClass65_949 = Static92.aClass65_1339;
		Static33.aClass65_640 = Static149.aClass65_2012;
		Static208.aClass65_2330 = Static206.aClass65_2572;
		Static169.aClass65_1228 = Static54.aClass65_2169;
		Static33.aClass65_632 = Static15.aClass65_309;
		Static208.aClass65_2352 = Static80.aClass65_1204;
		Static27.aClass65_567 = Static154.aClass65_2043;
		Static78.aClass65_1172 = Static48.aClass65_785;
		Static42.aClass65_689 = Static184.aClass65_2433;
		Static141.aClass65_1969 = Static107.aClass65_1546;
		Static97.aClass65_1448 = Static127.aClass65_1780;
		Static107.aClass65_1545 = Static25.aClass65_536;
		Static168.aClass65_1733 = Static140.aClass65_1960;
		Static208.aClass65_2349 = Static206.aClass65_2572;
		Static208.aClass65_2344 = Static93.aClass65_1344;
		Static208.aClass65_2357 = Static80.aClass65_1204;
		Static11.aClass65_217 = Static40.aClass65_673;
		Static135.aClass65_1867 = Static75.aClass65_1132;
		Static96.aClass65_1422 = Static146.aClass65_2002;
		Static42.aClass65_687 = Static184.aClass65_2433;
		Static163.aClass65_2180 = Static60.aClass65_958;
		Static205.aClass65_2570 = Static133.aClass65_1841;
		Static114.aClass65_1618 = Static62.aClass65_974;
		Static54.aClass65_2166 = Static27.aClass65_570;
		Static99.aClass65_1490 = Static135.aClass65_1870;
		Static50.aClass65_877 = Static99.aClass65_1487;
		Static173.aClass65_2281 = Static46.aClass65_748;
		Static208.aClass65_2370 = Static145.aClass65_1988;
		Static208.aClass65_2348 = Static206.aClass65_2572;
		Static196.aClass65_2529 = Static114.aClass65_1622;
		Static90.aClass65_2587 = Static28.aClass65_597;
		Static25.aClass65_538 = Static64.aClass65_1000;
		Static208.aClass65_2369 = Static158.aClass65_2103;
		Static114.aClass65_1617 = Static13.aClass65_615;
		Static142.aClass65_1980 = Static41.aClass65_680;
		Static28.aClass65_596 = Static174.aClass65_2309;
		Static19.aClass65_484 = Static198.aClass65_2539;
		Static169.aClass65_1227 = Static41.aClass65_681;
		Static155.aClass65_2067 = Static53.aClass65_901;
		Static158.aClass65_2099 = Static189.aClass65_2467;
	}
}
