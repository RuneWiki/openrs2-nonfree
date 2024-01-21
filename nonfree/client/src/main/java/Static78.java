import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "Lclient!fc;")
	private static Class25 aClass25_819 = method1313("Hidden");

	@OriginalMember(owner = "client!n", name = "B", descriptor = "Lclient!fc;")
	public static Class25 aClass25_818 = aClass25_819;

	@OriginalMember(owner = "client!n", name = "gb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_821 = method1313(" has logged in)3");

	@OriginalMember(owner = "client!n", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_820 = aClass25_821;

	@OriginalMember(owner = "client!n", name = "db", descriptor = "Lclient!dc;")
	public static Class1_Sub5 aClass1_Sub5_37 = new Class1_Sub5(new byte[5000]);

	@OriginalMember(owner = "client!n", name = "hb", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[5];

	@OriginalMember(owner = "client!n", name = "ib", descriptor = "Lclient!p;")
	public static Class63 aClass63_14 = new Class63(30);

	@OriginalMember(owner = "client!n", name = "jb", descriptor = "[I")
	public static int[] anIntArray312 = new int[50];

	@OriginalMember(owner = "client!n", name = "kb", descriptor = "I")
	public static int anInt1705 = 0;

	@OriginalMember(owner = "client!n", name = "lb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_822 = method1313("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!n", name = "mb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_823 = method1313("Loaded update list");

	@OriginalMember(owner = "client!n", name = "nb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_824 = method1313("Login limit exceeded)3");

	@OriginalMember(owner = "client!n", name = "ob", descriptor = "Lclient!fc;")
	public static Class25 aClass25_825 = aClass25_823;

	@OriginalMember(owner = "client!n", name = "pb", descriptor = "I")
	public static final int anInt1706 = 50;

	@OriginalMember(owner = "client!n", name = "qb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_826 = aClass25_824;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!oc;Lclient!oc;)V")
	public static void method1310(@OriginalArg(1) Class56 arg0, @OriginalArg(2) Class56 arg1) {
		Static13.aClass56_14 = arg0;
		Static122.aClass56_92 = arg1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method1311(@OriginalArg(1) Class56 arg0) {
		Static121.aClass56_91 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public static void method1312() {
		anIntArray312 = null;
		aClass25_821 = null;
		aClass25_824 = null;
		aClass25_818 = null;
		aClass25_825 = null;
		aClass25_826 = null;
		aClass25_819 = null;
		aClass25_822 = null;
		aBooleanArray7 = null;
		aClass25_820 = null;
		aClass1_Sub5_37 = null;
		aClass63_14 = null;
		aClass25_823 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!fc;")
	public static Class25 method1313(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(8) int local8 = 0;
		@Pc(11) int local11 = local6.length;
		@Pc(20) Class25 local20 = new Class25();
		local20.aByteArray15 = new byte[local11];
		while (local11 > local8) {
			@Pc(32) int local32 = local6[local8++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local11 <= local8) {
					break;
				}
				@Pc(54) int local54 = local6[local8++] & 0xFF;
				local20.aByteArray15[local20.anInt956++] = (byte) ((local32 - 40) * 43 + local54 - 48);
			} else if (local32 != 0) {
				local20.aByteArray15[local20.anInt956++] = (byte) local32;
			}
		}
		local20.method798();
		return local20.method765();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
	public static boolean method1314(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Lclient!ef;")
	public static Class1_Sub2_Sub6 method1315(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub2_Sub6 local11 = (Class1_Sub2_Sub6) Static111.aClass63_22.method1517((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static109.aClass56_75.method1269(6, arg0);
		local11 = new Class1_Sub2_Sub6();
		local11.anInt858 = arg0;
		if (local25 != null) {
			local11.method709(new Class1_Sub5(local25));
		}
		local11.method705();
		if (local11.aBoolean33) {
			local11.aBoolean34 = false;
			local11.anInt871 = 0;
		}
		Static111.aClass63_22.method1520(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V")
	public static void method1316(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static86.anIntArray347[arg0];
		@Pc(16) int local16 = Static46.anIntArray239[arg0];
		@Pc(20) int local20 = Static94.anIntArray381[arg0];
		@Pc(24) int local24 = Static102.anIntArray413[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		if (Static104.anInt2372 != 0 && local20 != 1003) {
			Static104.anInt2372 = 0;
			Static110.aBoolean113 = true;
		}
		@Pc(53) Class1_Sub2_Sub3_Sub4_Sub2 local53;
		if (local20 == 13) {
			local53 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local24];
			if (local53 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local53.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local53.anIntArray484[0]);
				Static108.anInt2494 = 2;
				Static65.anInt1451 = Static23.anInt675;
				Static10.anInt270 = Static30.anInt815;
				Static9.anInt249 = 0;
				Static68.aClass1_Sub5_Sub1_2.method688(168);
				Static68.aClass1_Sub5_Sub1_2.method675(local24);
			}
		}
		if (local20 == 47) {
			Static68.aClass1_Sub5_Sub1_2.method688(189);
			Static68.aClass1_Sub5_Sub1_2.method675(local24);
			Static68.aClass1_Sub5_Sub1_2.method653(local16);
			Static68.aClass1_Sub5_Sub1_2.method647(local12);
			Static25.anInt723 = 2;
			Static54.anInt1295 = local16;
			Static129.anInt2956 = 0;
			if (Static108.anInt2497 == local16 >> 16) {
				Static25.anInt723 = 1;
			}
			if (Static33.anInt916 == local16 >> 16) {
				Static25.anInt723 = 3;
			}
			Static94.anInt2163 = local12;
		}
		if (local20 == 22) {
			Static68.aClass1_Sub5_Sub1_2.method688(95);
			Static68.aClass1_Sub5_Sub1_2.method631(local12);
			Static68.aClass1_Sub5_Sub1_2.method647(local24);
			Static68.aClass1_Sub5_Sub1_2.method633(local16);
			Static129.anInt2956 = 0;
			Static25.anInt723 = 2;
			Static94.anInt2163 = local12;
			Static54.anInt1295 = local16;
			if (local16 >> 16 == Static108.anInt2497) {
				Static25.anInt723 = 1;
			}
			if (local16 >> 16 == Static33.anInt916) {
				Static25.anInt723 = 3;
			}
		}
		if (local20 == 41) {
			Static68.aClass1_Sub5_Sub1_2.method688(125);
			Static68.aClass1_Sub5_Sub1_2.method633(local16);
			Static68.aClass1_Sub5_Sub1_2.method631(local24);
			Static68.aClass1_Sub5_Sub1_2.method647(local12);
			Static94.anInt2163 = local12;
			Static129.anInt2956 = 0;
			Static54.anInt1295 = local16;
			Static25.anInt723 = 2;
			if (local16 >> 16 == Static108.anInt2497) {
				Static25.anInt723 = 1;
			}
			if (Static33.anInt916 == local16 >> 16) {
				Static25.anInt723 = 3;
			}
		}
		@Pc(252) Class1_Sub2_Sub14 local252;
		if (local20 == 45) {
			local252 = Static62.method1091(local16, local12);
			if (local252 != null) {
				Static75.method1229();
				Static110.method1772(local16, Static58.method1057(Static77.method1300(local252)), local12);
				Static90.aBoolean98 = true;
				Static80.anInt1774 = 0;
				Static83.aClass25_888 = Static110.method1774(local252);
				if (Static83.aClass25_888 == null) {
					Static83.aClass25_888 = Static104.aClass25_1131;
				}
				if (local252.aBoolean90) {
					Static89.aClass25_236 = Static116.method1859(new Class25[] { local252.aClass25_939, Static50.aClass25_516 });
				} else {
					Static89.aClass25_236 = Static116.method1859(new Class25[] { Static103.aClass25_1362, local252.aClass25_940, Static50.aClass25_516 });
				}
				if (Static94.anInt2162 == 16 && !local252.aBoolean90) {
					Static90.anInt2027 = 3;
					Static120.aBoolean126 = true;
					Static90.aBoolean98 = true;
				}
			}
			return;
		}
		if (local20 == 23) {
			local53 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local24];
			if (local53 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local53.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local53.anIntArray484[0]);
				Static65.anInt1451 = Static23.anInt675;
				Static108.anInt2494 = 2;
				Static10.anInt270 = Static30.anInt815;
				Static9.anInt249 = 0;
				Static68.aClass1_Sub5_Sub1_2.method688(173);
				Static68.aClass1_Sub5_Sub1_2.method647(local24);
			}
		}
		@Pc(396) int local396;
		@Pc(410) long local410;
		@Pc(412) int local412;
		@Pc(391) Class25 local391;
		if (local20 == 48) {
			local391 = Static84.aClass25Array14[arg0];
			local396 = local391.method796(Static50.aClass25_516);
			if (local396 != -1) {
				local410 = local391.method794(local396 + 12).method773().method770();
				local412 = -1;
				for (@Pc(414) int local414 = 0; local414 < Static80.anInt1786; local414++) {
					if (Static129.aLongArray6[local414] == local410) {
						local412 = local414;
						break;
					}
				}
				if (local412 != -1 && Static47.anIntArray241[local412] > 0) {
					Static54.anInt1288 = 3;
					Static110.aBoolean115 = true;
					Static110.aBoolean113 = true;
					Static104.anInt2372 = 0;
					Static92.aClass25_982 = Static92.aClass25_985;
					Static116.aLong166 = Static129.aLongArray6[local412];
					Static92.aClass25_981 = Static116.method1859(new Class25[] { Static68.aClass25_691, Static118.aClass25Array22[local412] });
				}
			}
		}
		if (local20 == 38) {
			Static68.aClass1_Sub5_Sub1_2.method688(52);
			Static68.aClass1_Sub5_Sub1_2.method650(local12);
			Static68.aClass1_Sub5_Sub1_2.method653(local16);
			Static68.aClass1_Sub5_Sub1_2.method647(local24);
			Static94.anInt2163 = local12;
			Static54.anInt1295 = local16;
			Static129.anInt2956 = 0;
			Static25.anInt723 = 2;
			if (Static108.anInt2497 == local16 >> 16) {
				Static25.anInt723 = 1;
			}
			if (Static33.anInt916 == local16 >> 16) {
				Static25.anInt723 = 3;
			}
		}
		if (local20 == 1001) {
			Static10.anInt270 = Static30.anInt815;
			Static108.anInt2494 = 2;
			Static9.anInt249 = 0;
			Static65.anInt1451 = Static23.anInt675;
			Static68.aClass1_Sub5_Sub1_2.method688(137);
			Static68.aClass1_Sub5_Sub1_2.method650(local24 >> 14 & 0x7FFF);
		}
		@Pc(561) Class1_Sub2_Sub3_Sub4_Sub1 local561;
		if (local20 == 53) {
			local561 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local24];
			if (local561 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local561.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local561.anIntArray484[0]);
				Static10.anInt270 = Static30.anInt815;
				Static9.anInt249 = 0;
				Static65.anInt1451 = Static23.anInt675;
				Static108.anInt2494 = 2;
				Static68.aClass1_Sub5_Sub1_2.method688(177);
				Static68.aClass1_Sub5_Sub1_2.method650(local24);
			}
		}
		if (local20 == 44) {
			Static68.aClass1_Sub5_Sub1_2.method688(68);
			Static68.aClass1_Sub5_Sub1_2.method653(local16);
			Static68.aClass1_Sub5_Sub1_2.method650(local24);
			Static68.aClass1_Sub5_Sub1_2.method650(local12);
			Static94.anInt2163 = local12;
			Static54.anInt1295 = local16;
			Static25.anInt723 = 2;
			if (local16 >> 16 == Static108.anInt2497) {
				Static25.anInt723 = 1;
			}
			if (local16 >> 16 == Static33.anInt916) {
				Static25.anInt723 = 3;
			}
			Static129.anInt2956 = 0;
		}
		if (local20 == 32) {
			Static75.method1229();
			Static76.anInt1587 = local12;
			Static39.anInt1093 = local24;
			Static90.aBoolean98 = true;
			Static80.anInt1774 = 1;
			Static92.anInt2081 = local16;
			Static65.aClass25_670 = Static116.method1859(new Class25[] { Static86.aClass25_937, Static33.method736(local24).aClass25_1018, Static50.aClass25_516 });
			if (Static65.aClass25_670 == null) {
				Static65.aClass25_670 = Static11.aClass25_147;
			}
			return;
		}
		if (local20 == 37) {
			local53 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local24];
			if (local53 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local53.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local53.anIntArray484[0]);
				Static9.anInt249 = 0;
				Static10.anInt270 = Static30.anInt815;
				Static108.anInt2494 = 2;
				Static65.anInt1451 = Static23.anInt675;
				Static68.aClass1_Sub5_Sub1_2.method688(166);
				Static68.aClass1_Sub5_Sub1_2.method631(Static47.anInt1217);
				Static68.aClass1_Sub5_Sub1_2.method647(local24);
				Static68.aClass1_Sub5_Sub1_2.method635(Static56.anInt1325);
			}
		}
		if (local20 == 1) {
			Static114.method1836(local12, local16, local24);
			Static68.aClass1_Sub5_Sub1_2.method688(66);
			Static68.aClass1_Sub5_Sub1_2.method647(local24 >> 14 & 0x7FFF);
			Static68.aClass1_Sub5_Sub1_2.method647(local16 + Static47.anInt1211);
			Static68.aClass1_Sub5_Sub1_2.method650(Static46.anInt1190 + local12);
		}
		if (local20 == 1005) {
			Static9.anInt249 = 0;
			Static10.anInt270 = Static30.anInt815;
			Static108.anInt2494 = 2;
			Static65.anInt1451 = Static23.anInt675;
			Static68.aClass1_Sub5_Sub1_2.method688(118);
			Static68.aClass1_Sub5_Sub1_2.method631(local24);
		}
		if (local20 == 52) {
			Static114.method1836(local12, local16, local24);
			Static68.aClass1_Sub5_Sub1_2.method688(202);
			Static68.aClass1_Sub5_Sub1_2.method650(local12 + Static46.anInt1190);
			Static68.aClass1_Sub5_Sub1_2.method675(local16 + Static47.anInt1211);
			Static68.aClass1_Sub5_Sub1_2.method631(local24 >> 14 & 0x7FFF);
		}
		if (local20 == 43) {
			Static114.method1836(local12, local16, local24);
			Static68.aClass1_Sub5_Sub1_2.method688(39);
			Static68.aClass1_Sub5_Sub1_2.method631(Static47.anInt1211 + local16);
			Static68.aClass1_Sub5_Sub1_2.method675(local24 >> 14 & 0x7FFF);
			Static68.aClass1_Sub5_Sub1_2.method650(Static46.anInt1190 + local12);
		}
		if (local20 == 17) {
			Static114.method1836(local12, local16, local24);
			Static68.aClass1_Sub5_Sub1_2.method688(23);
			Static68.aClass1_Sub5_Sub1_2.method650(local16 + Static47.anInt1211);
			Static68.aClass1_Sub5_Sub1_2.method675(local12 + Static46.anInt1190);
			Static68.aClass1_Sub5_Sub1_2.method631(local24 >> 14 & 0x7FFF);
		}
		if (local20 == 21) {
			if (Static82.aBoolean77) {
				Static118.aClass4_1.method53(Static21.anInt596, local12 - 4, local16 + -4);
			} else {
				Static118.aClass4_1.method53(Static21.anInt596, Static30.anInt815 - 4, Static23.anInt675 + -4);
			}
		}
		if (local20 == 42) {
			Static68.aClass1_Sub5_Sub1_2.method688(141);
			Static68.aClass1_Sub5_Sub1_2.method650(local12);
			Static68.aClass1_Sub5_Sub1_2.method645(local16);
			Static68.aClass1_Sub5_Sub1_2.method631(local24);
			Static54.anInt1295 = local16;
			Static25.anInt723 = 2;
			Static94.anInt2163 = local12;
			if (Static108.anInt2497 == local16 >> 16) {
				Static25.anInt723 = 1;
			}
			if (Static33.anInt916 == local16 >> 16) {
				Static25.anInt723 = 3;
			}
			Static129.anInt2956 = 0;
		}
		if (local20 == 15 && Static33.anInt917 == -1) {
			Static124.method2013(local16, local12);
			Static33.anInt917 = local16;
			Static5.anInt111 = local12;
		}
		if (local20 == 56) {
			local391 = Static84.aClass25Array14[arg0];
			local396 = local391.method796(Static50.aClass25_516);
			if (local396 != -1) {
				if (Static108.anInt2497 == -1) {
					Static9.method238();
					if (Static9.anInt244 != -1) {
						Static92.aClass25_979 = local391.method794(local396 + 12).method773();
						Static89.aBoolean17 = false;
						Static52.anInt1260 = Static108.anInt2497 = Static9.anInt244;
					}
				} else {
					Static25.method584(0, Static3.aClass25_44, Static92.aClass25_985);
					if (Static115.aClass25_1289 != null) {
						Static25.method584(0, Static115.aClass25_1289, Static92.aClass25_985);
					}
				}
			}
		}
		if (local20 == 1002) {
			Static114.method1836(local12, local16, local24);
			Static68.aClass1_Sub5_Sub1_2.method688(208);
			Static68.aClass1_Sub5_Sub1_2.method650(local12 + Static46.anInt1190);
			Static68.aClass1_Sub5_Sub1_2.method631(Static47.anInt1211 + local16);
			Static68.aClass1_Sub5_Sub1_2.method647(local24 >> 14 & 0x7FFF);
		}
		@Pc(1145) boolean local1145;
		if (local20 == 16) {
			local1145 = Static81.method1376(false, 0, 2, 0, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			if (!local1145) {
				Static81.method1376(false, 0, 2, 1, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			}
			Static65.anInt1451 = Static23.anInt675;
			Static108.anInt2494 = 2;
			Static9.anInt249 = 0;
			Static10.anInt270 = Static30.anInt815;
			Static68.aClass1_Sub5_Sub1_2.method688(2);
			Static68.aClass1_Sub5_Sub1_2.method633(Static92.anInt2081);
			Static68.aClass1_Sub5_Sub1_2.method650(Static46.anInt1190 + local12);
			Static68.aClass1_Sub5_Sub1_2.method647(Static39.anInt1093);
			Static68.aClass1_Sub5_Sub1_2.method647(local16 + Static47.anInt1211);
			Static68.aClass1_Sub5_Sub1_2.method647(Static76.anInt1587);
			Static68.aClass1_Sub5_Sub1_2.method675(local24);
		}
		if (local20 == 58) {
			@Pc(1214) boolean local1214 = true;
			local252 = Static46.method968(local16);
			if (local252.anInt1934 > 0) {
				local1214 = Static22.method646(local252);
			}
			if (local1214) {
				Static68.aClass1_Sub5_Sub1_2.method688(115);
				Static68.aClass1_Sub5_Sub1_2.method633(local16);
			}
		}
		if (local20 == 51) {
			Static68.aClass1_Sub5_Sub1_2.method688(43);
			Static68.aClass1_Sub5_Sub1_2.method647(local12);
			Static68.aClass1_Sub5_Sub1_2.method631(local24);
			Static68.aClass1_Sub5_Sub1_2.method633(local16);
			Static129.anInt2956 = 0;
			Static25.anInt723 = 2;
			Static94.anInt2163 = local12;
			Static54.anInt1295 = local16;
			if (local16 >> 16 == Static108.anInt2497) {
				Static25.anInt723 = 1;
			}
			if (Static33.anInt916 == local16 >> 16) {
				Static25.anInt723 = 3;
			}
		}
		if (local20 == 50) {
			Static68.aClass1_Sub5_Sub1_2.method688(247);
			Static68.aClass1_Sub5_Sub1_2.method631(Static47.anInt1217);
			Static68.aClass1_Sub5_Sub1_2.method653(local16);
			Static68.aClass1_Sub5_Sub1_2.method675(local12);
			Static68.aClass1_Sub5_Sub1_2.method645(Static56.anInt1325);
		}
		if (local20 == 18) {
			Static68.aClass1_Sub5_Sub1_2.method688(78);
			Static68.aClass1_Sub5_Sub1_2.method653(local16);
			Static68.aClass1_Sub5_Sub1_2.method631(local24);
			Static68.aClass1_Sub5_Sub1_2.method675(local12);
			Static25.anInt723 = 2;
			Static129.anInt2956 = 0;
			Static94.anInt2163 = local12;
			Static54.anInt1295 = local16;
			if (local16 >> 16 == Static108.anInt2497) {
				Static25.anInt723 = 1;
			}
			if (Static33.anInt916 == local16 >> 16) {
				Static25.anInt723 = 3;
			}
		}
		if (local20 == 25) {
			Static68.aClass1_Sub5_Sub1_2.method688(113);
			Static68.aClass1_Sub5_Sub1_2.method633(local16);
			Static68.aClass1_Sub5_Sub1_2.method647(local12);
			Static68.aClass1_Sub5_Sub1_2.method675(local24);
			Static94.anInt2163 = local12;
			Static25.anInt723 = 2;
			Static54.anInt1295 = local16;
			if (local16 >> 16 == Static108.anInt2497) {
				Static25.anInt723 = 1;
			}
			Static129.anInt2956 = 0;
			if (local16 >> 16 == Static33.anInt916) {
				Static25.anInt723 = 3;
			}
		}
		if (local20 == 55 || local20 == 10) {
			local391 = Static84.aClass25Array14[arg0];
			local396 = local391.method796(Static50.aClass25_516);
			if (local396 != -1) {
				local391 = local391.method794(local396 + 12).method773();
				@Pc(1452) Class25 local1452 = local391.method761().method772();
				@Pc(1454) boolean local1454 = false;
				for (local412 = 0; local412 < Static96.anInt2797; local412++) {
					@Pc(1464) Class1_Sub2_Sub3_Sub4_Sub2 local1464 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[Static28.anIntArray150[local412]];
					if (local1464 != null && local1464.aClass25_1384 != null && local1464.aClass25_1384.method786(local1452)) {
						local1454 = true;
						Static81.method1376(false, 0, 2, 1, 0, local1464.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local1464.anIntArray484[0]);
						if (local20 == 55) {
							Static68.aClass1_Sub5_Sub1_2.method688(140);
							Static68.aClass1_Sub5_Sub1_2.method650(Static28.anIntArray150[local412]);
						}
						if (local20 == 10) {
							Static68.aClass1_Sub5_Sub1_2.method688(173);
							Static68.aClass1_Sub5_Sub1_2.method647(Static28.anIntArray150[local412]);
						}
						break;
					}
				}
				if (!local1454) {
					Static25.method584(0, Static116.method1859(new Class25[] { Static21.aClass25_270, local1452 }), Static92.aClass25_985);
				}
			}
		}
		if (local20 == 39) {
			local1145 = Static81.method1376(false, 0, 2, 0, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			if (!local1145) {
				Static81.method1376(false, 0, 2, 1, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			}
			Static65.anInt1451 = Static23.anInt675;
			Static10.anInt270 = Static30.anInt815;
			Static9.anInt249 = 0;
			Static108.anInt2494 = 2;
			Static68.aClass1_Sub5_Sub1_2.method688(38);
			Static68.aClass1_Sub5_Sub1_2.method631(local12 + Static46.anInt1190);
			Static68.aClass1_Sub5_Sub1_2.method647(local16 + Static47.anInt1211);
			Static68.aClass1_Sub5_Sub1_2.method631(local24);
		}
		if (local20 == 14) {
			Static68.aClass1_Sub5_Sub1_2.method688(196);
			Static68.aClass1_Sub5_Sub1_2.method631(local12);
			Static68.aClass1_Sub5_Sub1_2.method633(Static56.anInt1325);
			Static68.aClass1_Sub5_Sub1_2.method650(local24);
			Static68.aClass1_Sub5_Sub1_2.method647(Static47.anInt1217);
			Static68.aClass1_Sub5_Sub1_2.method645(local16);
			Static129.anInt2956 = 0;
			Static25.anInt723 = 2;
			Static54.anInt1295 = local16;
			Static94.anInt2163 = local12;
			if (Static108.anInt2497 == local16 >> 16) {
				Static25.anInt723 = 1;
			}
			if (local16 >> 16 == Static33.anInt916) {
				Static25.anInt723 = 3;
			}
		}
		if (local20 == 1006) {
			local252 = Static46.method968(local16);
			if (local252 == null || local252.anIntArray344[local12] < 100000) {
				Static68.aClass1_Sub5_Sub1_2.method688(118);
				Static68.aClass1_Sub5_Sub1_2.method631(local24);
			} else {
				Static25.method584(0, Static116.method1859(new Class25[] { Static74.method1214(local252.anIntArray344[local12]), Static82.aClass25_869, Static33.method736(local24).aClass25_1018 }), Static92.aClass25_985);
			}
			Static129.anInt2956 = 0;
			Static94.anInt2163 = local12;
			Static25.anInt723 = 2;
			if (local16 >> 16 == Static108.anInt2497) {
				Static25.anInt723 = 1;
			}
			if (local16 >> 16 == Static33.anInt916) {
				Static25.anInt723 = 3;
			}
			Static54.anInt1295 = local16;
		}
		if (local20 == 24 && Static114.method1836(local12, local16, local24)) {
			Static68.aClass1_Sub5_Sub1_2.method688(240);
			Static68.aClass1_Sub5_Sub1_2.method631(Static76.anInt1587);
			Static68.aClass1_Sub5_Sub1_2.method650(local12 + Static46.anInt1190);
			Static68.aClass1_Sub5_Sub1_2.method633(Static92.anInt2081);
			Static68.aClass1_Sub5_Sub1_2.method650(Static39.anInt1093);
			Static68.aClass1_Sub5_Sub1_2.method675(local24 >> 14 & 0x7FFF);
			Static68.aClass1_Sub5_Sub1_2.method647(Static47.anInt1211 + local16);
		}
		if (local20 == 1004) {
			Static9.anInt249 = 0;
			Static65.anInt1451 = Static23.anInt675;
			Static108.anInt2494 = 2;
			Static10.anInt270 = Static30.anInt815;
			local561 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local24];
			if (local561 != null) {
				@Pc(1863) Class1_Sub2_Sub13 local1863 = local561.aClass1_Sub2_Sub13_1;
				if (local1863.anIntArray332 != null) {
					local1863 = local1863.method1408();
				}
				if (local1863 != null) {
					Static68.aClass1_Sub5_Sub1_2.method688(255);
					Static68.aClass1_Sub5_Sub1_2.method647(local1863.anInt1839);
				}
			}
		}
		if (local20 == 57) {
			local561 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local24];
			if (local561 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local561.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local561.anIntArray484[0]);
				Static108.anInt2494 = 2;
				Static10.anInt270 = Static30.anInt815;
				Static65.anInt1451 = Static23.anInt675;
				Static9.anInt249 = 0;
				Static68.aClass1_Sub5_Sub1_2.method688(102);
				Static68.aClass1_Sub5_Sub1_2.method675(local24);
			}
		}
		if (local20 == 27) {
			local1145 = Static81.method1376(false, 0, 2, 0, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			if (!local1145) {
				Static81.method1376(false, 0, 2, 1, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			}
			Static10.anInt270 = Static30.anInt815;
			Static108.anInt2494 = 2;
			Static9.anInt249 = 0;
			Static65.anInt1451 = Static23.anInt675;
			Static68.aClass1_Sub5_Sub1_2.method688(246);
			Static68.aClass1_Sub5_Sub1_2.method650(Static46.anInt1190 + local12);
			Static68.aClass1_Sub5_Sub1_2.method647(local16 + Static47.anInt1211);
			Static68.aClass1_Sub5_Sub1_2.method650(local24);
		}
		if (local20 == 31 && Static114.method1836(local12, local16, local24)) {
			Static68.aClass1_Sub5_Sub1_2.method688(31);
			Static68.aClass1_Sub5_Sub1_2.method633(Static56.anInt1325);
			Static68.aClass1_Sub5_Sub1_2.method650(Static47.anInt1217);
			Static68.aClass1_Sub5_Sub1_2.method631(local12 + Static46.anInt1190);
			Static68.aClass1_Sub5_Sub1_2.method647(local16 + Static47.anInt1211);
			Static68.aClass1_Sub5_Sub1_2.method675(local24 >> 14 & 0x7FFF);
		}
		if (local20 == 9) {
			Static68.aClass1_Sub5_Sub1_2.method688(109);
			Static68.aClass1_Sub5_Sub1_2.method633(local16);
			Static68.aClass1_Sub5_Sub1_2.method631(Static76.anInt1587);
			Static68.aClass1_Sub5_Sub1_2.method647(Static39.anInt1093);
			Static68.aClass1_Sub5_Sub1_2.method631(local12);
			Static68.aClass1_Sub5_Sub1_2.method645(Static92.anInt2081);
			Static68.aClass1_Sub5_Sub1_2.method647(local24);
			Static129.anInt2956 = 0;
			Static54.anInt1295 = local16;
			Static25.anInt723 = 2;
			Static94.anInt2163 = local12;
			if (Static108.anInt2497 == local16 >> 16) {
				Static25.anInt723 = 1;
			}
			if (Static33.anInt916 == local16 >> 16) {
				Static25.anInt723 = 3;
			}
		}
		if (local20 == 30) {
			local53 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local24];
			if (local53 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local53.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local53.anIntArray484[0]);
				Static108.anInt2494 = 2;
				Static10.anInt270 = Static30.anInt815;
				Static65.anInt1451 = Static23.anInt675;
				Static9.anInt249 = 0;
				Static68.aClass1_Sub5_Sub1_2.method688(32);
				Static68.aClass1_Sub5_Sub1_2.method650(Static76.anInt1587);
				Static68.aClass1_Sub5_Sub1_2.method650(local24);
				Static68.aClass1_Sub5_Sub1_2.method635(Static92.anInt2081);
				Static68.aClass1_Sub5_Sub1_2.method647(Static39.anInt1093);
			}
		}
		if (local20 == 33) {
			local561 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local24];
			if (local561 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local561.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local561.anIntArray484[0]);
				Static65.anInt1451 = Static23.anInt675;
				Static108.anInt2494 = 2;
				Static10.anInt270 = Static30.anInt815;
				Static9.anInt249 = 0;
				Static68.aClass1_Sub5_Sub1_2.method688(145);
				Static68.aClass1_Sub5_Sub1_2.method647(local24);
			}
		}
		if (local20 == 34) {
			local1145 = Static81.method1376(false, 0, 2, 0, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			if (!local1145) {
				Static81.method1376(false, 0, 2, 1, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			}
			Static10.anInt270 = Static30.anInt815;
			Static108.anInt2494 = 2;
			Static65.anInt1451 = Static23.anInt675;
			Static9.anInt249 = 0;
			Static68.aClass1_Sub5_Sub1_2.method688(226);
			Static68.aClass1_Sub5_Sub1_2.method650(local24);
			Static68.aClass1_Sub5_Sub1_2.method647(Static46.anInt1190 + local12);
			Static68.aClass1_Sub5_Sub1_2.method647(Static47.anInt1211 + local16);
		}
		if (local20 == 49) {
			local561 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local24];
			if (local561 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local561.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local561.anIntArray484[0]);
				Static9.anInt249 = 0;
				Static65.anInt1451 = Static23.anInt675;
				Static10.anInt270 = Static30.anInt815;
				Static108.anInt2494 = 2;
				Static68.aClass1_Sub5_Sub1_2.method688(101);
				Static68.aClass1_Sub5_Sub1_2.method675(Static76.anInt1587);
				Static68.aClass1_Sub5_Sub1_2.method635(Static92.anInt2081);
				Static68.aClass1_Sub5_Sub1_2.method650(Static39.anInt1093);
				Static68.aClass1_Sub5_Sub1_2.method650(local24);
			}
		}
		if (local20 == 8) {
			local561 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local24];
			if (local561 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local561.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local561.anIntArray484[0]);
				Static65.anInt1451 = Static23.anInt675;
				Static108.anInt2494 = 2;
				Static9.anInt249 = 0;
				Static10.anInt270 = Static30.anInt815;
				Static68.aClass1_Sub5_Sub1_2.method688(193);
				Static68.aClass1_Sub5_Sub1_2.method647(local24);
			}
		}
		if (local20 == 7) {
			Static68.aClass1_Sub5_Sub1_2.method688(115);
			Static68.aClass1_Sub5_Sub1_2.method633(local16);
			local252 = Static46.method968(local16);
			if (local252.anIntArrayArray21 != null && local252.anIntArrayArray21[0][0] == 5) {
				local396 = local252.anIntArrayArray21[0][1];
				if (Static95.anIntArray385[local396] != local252.anIntArray346[0]) {
					Static95.anIntArray385[local396] = local252.anIntArray346[0];
					Static67.method1137(local396);
					Static90.aBoolean98 = true;
				}
			}
		}
		if (local20 == 28) {
			Static101.method1677(Static108.anInt2502);
			Static110.aBoolean113 = true;
			Static108.anInt2502 = -1;
		}
		if (local20 == 12) {
			Static68.aClass1_Sub5_Sub1_2.method688(115);
			Static68.aClass1_Sub5_Sub1_2.method633(local16);
			local252 = Static46.method968(local16);
			if (local252.anIntArrayArray21 != null && local252.anIntArrayArray21[0][0] == 5) {
				local396 = local252.anIntArrayArray21[0][1];
				Static95.anIntArray385[local396] = 1 - Static95.anIntArray385[local396];
				Static67.method1137(local396);
				Static90.aBoolean98 = true;
			}
		}
		if (local20 == 29) {
			local1145 = Static81.method1376(false, 0, 2, 0, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			if (!local1145) {
				Static81.method1376(false, 0, 2, 1, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			}
			Static10.anInt270 = Static30.anInt815;
			Static9.anInt249 = 0;
			Static108.anInt2494 = 2;
			Static65.anInt1451 = Static23.anInt675;
			Static68.aClass1_Sub5_Sub1_2.method688(48);
			Static68.aClass1_Sub5_Sub1_2.method650(Static46.anInt1190 + local12);
			Static68.aClass1_Sub5_Sub1_2.method631(local16 + Static47.anInt1211);
			Static68.aClass1_Sub5_Sub1_2.method650(local24);
		}
		if (local20 == 36) {
			local1145 = Static81.method1376(false, 0, 2, 0, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			if (!local1145) {
				Static81.method1376(false, 0, 2, 1, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			}
			Static108.anInt2494 = 2;
			Static65.anInt1451 = Static23.anInt675;
			Static9.anInt249 = 0;
			Static10.anInt270 = Static30.anInt815;
			Static68.aClass1_Sub5_Sub1_2.method688(231);
			Static68.aClass1_Sub5_Sub1_2.method631(Static47.anInt1217);
			Static68.aClass1_Sub5_Sub1_2.method675(Static47.anInt1211 + local16);
			Static68.aClass1_Sub5_Sub1_2.method631(Static46.anInt1190 + local12);
			Static68.aClass1_Sub5_Sub1_2.method631(local24);
			Static68.aClass1_Sub5_Sub1_2.method635(Static56.anInt1325);
		}
		if (local20 == 40) {
			Static68.aClass1_Sub5_Sub1_2.method688(119);
			Static68.aClass1_Sub5_Sub1_2.method650(local24);
			Static68.aClass1_Sub5_Sub1_2.method647(local12);
			Static68.aClass1_Sub5_Sub1_2.method653(local16);
			Static94.anInt2163 = local12;
			Static54.anInt1295 = local16;
			Static25.anInt723 = 2;
			if (local16 >> 16 == Static108.anInt2497) {
				Static25.anInt723 = 1;
			}
			if (Static33.anInt916 == local16 >> 16) {
				Static25.anInt723 = 3;
			}
			Static129.anInt2956 = 0;
		}
		if (local20 == 11) {
			local1145 = Static81.method1376(false, 0, 2, 0, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			if (!local1145) {
				Static81.method1376(false, 0, 2, 1, 0, local16, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local12);
			}
			Static108.anInt2494 = 2;
			Static65.anInt1451 = Static23.anInt675;
			Static9.anInt249 = 0;
			Static10.anInt270 = Static30.anInt815;
			Static68.aClass1_Sub5_Sub1_2.method688(62);
			Static68.aClass1_Sub5_Sub1_2.method650(Static46.anInt1190 + local12);
			Static68.aClass1_Sub5_Sub1_2.method647(local24);
			Static68.aClass1_Sub5_Sub1_2.method631(Static47.anInt1211 + local16);
		}
		if (local20 == 6) {
			local561 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local24];
			if (local561 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local561.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local561.anIntArray484[0]);
				Static65.anInt1451 = Static23.anInt675;
				Static10.anInt270 = Static30.anInt815;
				Static9.anInt249 = 0;
				Static108.anInt2494 = 2;
				Static68.aClass1_Sub5_Sub1_2.method688(200);
				Static68.aClass1_Sub5_Sub1_2.method675(local24);
				Static68.aClass1_Sub5_Sub1_2.method647(Static47.anInt1217);
				Static68.aClass1_Sub5_Sub1_2.method635(Static56.anInt1325);
			}
		}
		if (local20 == 5) {
			local53 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local24];
			if (local53 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local53.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local53.anIntArray484[0]);
				Static65.anInt1451 = Static23.anInt675;
				Static10.anInt270 = Static30.anInt815;
				Static108.anInt2494 = 2;
				Static9.anInt249 = 0;
				Static68.aClass1_Sub5_Sub1_2.method688(140);
				Static68.aClass1_Sub5_Sub1_2.method650(local24);
			}
		}
		if (local20 == 46) {
			Static9.method238();
		}
		if (local20 == 35) {
			Static25.method587(local16, local12, local24);
		}
		if (local20 == 26) {
			local561 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local24];
			if (local561 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local561.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local561.anIntArray484[0]);
				Static9.anInt249 = 0;
				Static108.anInt2494 = 2;
				Static65.anInt1451 = Static23.anInt675;
				Static10.anInt270 = Static30.anInt815;
				Static68.aClass1_Sub5_Sub1_2.method688(217);
				Static68.aClass1_Sub5_Sub1_2.method647(local24);
			}
		}
		if (local20 == 19) {
			local53 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local24];
			if (local53 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local53.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local53.anIntArray484[0]);
				Static9.anInt249 = 0;
				Static65.anInt1451 = Static23.anInt675;
				Static108.anInt2494 = 2;
				Static10.anInt270 = Static30.anInt815;
				Static68.aClass1_Sub5_Sub1_2.method688(129);
				Static68.aClass1_Sub5_Sub1_2.method675(local24);
			}
		}
		if (local20 == 20) {
			local53 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local24];
			if (local53 != null) {
				Static81.method1376(false, 0, 2, 1, 0, local53.anIntArray485[0], Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, 1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], local53.anIntArray484[0]);
				Static9.anInt249 = 0;
				Static10.anInt270 = Static30.anInt815;
				Static108.anInt2494 = 2;
				Static65.anInt1451 = Static23.anInt675;
				Static68.aClass1_Sub5_Sub1_2.method688(126);
				Static68.aClass1_Sub5_Sub1_2.method650(local24);
			}
		}
		if (local20 == 4 || local20 == 54 || local20 == 3 || local20 == 2) {
			local391 = Static84.aClass25Array14[arg0];
			local396 = local391.method796(Static50.aClass25_516);
			if (local396 != -1) {
				local410 = local391.method794(local396 + 12).method773().method770();
				if (local20 == 4) {
					Static101.method1681(local410);
				}
				if (local20 == 54) {
					Static94.method1590(local410);
				}
				if (local20 == 3) {
					Static129.method2046(local410);
				}
				if (local20 == 2) {
					Static92.method1556(local410);
				}
			}
		}
		if (Static80.anInt1774 != 0) {
			Static90.aBoolean98 = true;
			Static80.anInt1774 = 0;
		}
		if (Static84.aBoolean83) {
			Static75.method1229();
			Static90.aBoolean98 = true;
		}
	}
}
