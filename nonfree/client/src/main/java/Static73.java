import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Z")
	public static boolean aBoolean98;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!pc;")
	public static Class12 aClass12_56;

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "Lclient!hb;")
	private static Class27 aClass27_940 = Static87.method1648("Loaded fonts");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!hb;")
	public static Class27 aClass27_933 = aClass27_940;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!hb;")
	private static Class27 aClass27_934 = Static87.method1648("Enter name of friend to add to list");

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!hb;")
	public static Class27 aClass27_935 = aClass27_934;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!hb;")
	private static Class27 aClass27_936 = Static87.method1648("Loading wordpack )2 ");

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!hb;")
	public static Class27 aClass27_937 = Static87.method1648("Lade Konfig )2 ");

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	public static int anInt1924 = 0;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "Lclient!hb;")
	public static Class27 aClass27_938 = Static87.method1648("::");

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_939 = Static87.method1648("backhmid2");

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!hb;")
	public static Class27 aClass27_941 = aClass27_936;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method1340() {
		Static78.aClass3_Sub11_Sub1_3.method1478(155);
		if (Static41.anInt1210 != -1) {
			Static97.method1607(Static41.anInt1210);
			Static109.anInt2025 = -1;
			Static41.anInt1210 = -1;
			Static75.aBoolean101 = true;
			Static86.aBoolean116 = true;
		}
		if (Static84.anInt2220 != -1) {
			Static97.method1607(Static84.anInt2220);
			Static84.anInt2220 = -1;
			Static13.aBoolean40 = true;
			Static109.anInt2025 = -1;
		}
		if (Static55.anInt1446 != -1) {
			Static97.method1607(Static55.anInt1446);
			Static55.anInt1446 = -1;
			Static109.method1459(30);
		}
		if (Static92.anInt2543 != -1) {
			Static97.method1607(Static92.anInt2543);
			Static92.anInt2543 = -1;
		}
		if (Static104.anInt2723 != -1) {
			Static97.method1607(Static104.anInt2723);
			Static104.anInt2723 = -1;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1341() {
		while (true) {
			if (Static47.aClass3_Sub11_Sub1_1.method1482(Static11.anInt2733) >= 27) {
				@Pc(14) int local14 = Static47.aClass3_Sub11_Sub1_1.method1476(15);
				if (local14 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local14] == null) {
						Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local14] = new Class3_Sub3_Sub1_Sub4_Sub1();
						local19 = true;
					}
					@Pc(35) Class3_Sub3_Sub1_Sub4_Sub1 local35 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local14];
					Static85.anIntArray349[Static104.anInt2724++] = local14;
					local35.anInt2382 = Static2.anInt38;
					@Pc(51) int local51 = Static47.aClass3_Sub11_Sub1_1.method1476(5);
					if (local51 > 15) {
						local51 -= 32;
					}
					@Pc(64) int local64 = Static31.anIntArray150[Static47.aClass3_Sub11_Sub1_1.method1476(3)];
					if (local19) {
						local35.anInt2432 = local64;
					}
					@Pc(74) int local74 = Static47.aClass3_Sub11_Sub1_1.method1476(5);
					local35.aClass3_Sub3_Sub3_1 = Static99.method1802(Static47.aClass3_Sub11_Sub1_1.method1476(13));
					@Pc(87) int local87 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
					if (local74 > 15) {
						local74 -= 32;
					}
					@Pc(98) int local98 = Static47.aClass3_Sub11_Sub1_1.method1476(1);
					if (local98 == 1) {
						Static82.anIntArray335[Static70.anInt1829++] = local14;
					}
					local35.anInt2431 = local35.aClass3_Sub3_Sub3_1.anInt906;
					local35.anInt2435 = local35.aClass3_Sub3_Sub3_1.anInt920;
					local35.anInt2401 = local35.aClass3_Sub3_Sub3_1.anInt934;
					local35.anInt2412 = local35.aClass3_Sub3_Sub3_1.anInt918;
					local35.anInt2410 = local35.aClass3_Sub3_Sub3_1.anInt919;
					local35.anInt2398 = local35.aClass3_Sub3_Sub3_1.anInt932;
					local35.anInt2386 = local35.aClass3_Sub3_Sub3_1.anInt925;
					if (local35.anInt2401 == 0) {
						local35.anInt2432 = 0;
					}
					local35.anInt2375 = local35.aClass3_Sub3_Sub3_1.anInt940;
					local35.anInt2411 = local35.aClass3_Sub3_Sub3_1.anInt921;
					local35.method1677(local87 == 1, local51 + Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray357[0], local74 + Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anIntArray359[0]);
					continue;
				}
			}
			Static47.aClass3_Sub11_Sub1_1.method1480();
			return;
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)[Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4[] method1343() {
		@Pc(16) Class3_Sub3_Sub2_Sub4[] local16 = new Class3_Sub3_Sub2_Sub4[Static86.anInt2324];
		for (@Pc(18) int local18 = 0; local18 < Static86.anInt2324; local18++) {
			@Pc(28) Class3_Sub3_Sub2_Sub4 local28 = local16[local18] = new Class3_Sub3_Sub2_Sub4();
			local28.anInt1903 = Static28.anInt748;
			local28.anInt1901 = Static66.anInt1710;
			local28.anInt1905 = Static54.anIntArray238[local18];
			local28.anInt1900 = Static72.anIntArray316[local18];
			local28.anInt1904 = Static36.anIntArray160[local18];
			local28.anInt1902 = Static54.anIntArray239[local18];
			local28.anIntArray315 = Static98.anIntArray378;
			local28.aByteArray15 = Static72.aByteArrayArray10[local18];
		}
		Static96.method1232();
		return local16;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
	public static void method1344() {
		Static11.aClass7_5.method682();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static96.aLongArray9[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static70.aLongArray10[local24] = 0L;
		}
		Static70.anInt1832 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLclient!ra;I)V")
	public static void method1346(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub1_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		if ((arg0 & 0x8) != 0) {
			local9 = Static47.aClass3_Sub11_Sub1_1.method1445();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(17) Class3_Sub11 local17 = new Class3_Sub11(local12);
			Static47.aClass3_Sub11_Sub1_1.method1420(local9, local12);
			Static90.aClass3_Sub11Array1[arg2] = local17;
			arg1.method1683(local17);
		}
		if ((arg0 & 0x10) != 0) {
			arg1.anInt2403 = Static47.aClass3_Sub11_Sub1_1.method1451();
			if (arg1.anInt2403 == 65535) {
				arg1.anInt2403 = -1;
			}
		}
		@Pc(63) int local63;
		if ((arg0 & 0x100) != 0) {
			local9 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local63 = Static47.aClass3_Sub11_Sub1_1.method1421();
			arg1.method1678(local63, Static2.anInt38, local9);
			arg1.anInt2380 = Static2.anInt38 + 300;
			arg1.anInt2413 = Static47.aClass3_Sub11_Sub1_1.method1422();
			arg1.anInt2396 = Static47.aClass3_Sub11_Sub1_1.method1445();
		}
		@Pc(103) int local103;
		if ((arg0 & 0x1) != 0) {
			local9 = Static47.aClass3_Sub11_Sub1_1.method1441();
			local63 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local103 = Static47.aClass3_Sub11_Sub1_1.method1422();
			@Pc(106) int local106 = Static47.aClass3_Sub11_Sub1_1.anInt2060;
			if (arg1.aClass27_1150 != null && arg1.aClass15_2 != null) {
				@Pc(117) long local117 = arg1.aClass27_1150.method758();
				@Pc(119) boolean local119 = false;
				if (local63 <= 1) {
					for (@Pc(126) int local126 = 0; local126 < Static38.anInt910; local126++) {
						if (Static45.aLongArray5[local126] == local117) {
							local119 = true;
							break;
						}
					}
				}
				if (!local119 && Static7.anInt182 == 0) {
					Static25.aClass3_Sub11_1.anInt2060 = 0;
					Static47.aClass3_Sub11_Sub1_1.method1442(Static25.aClass3_Sub11_1.aByteArray17, local103);
					Static25.aClass3_Sub11_1.anInt2060 = 0;
					@Pc(174) Class27 local174 = Static38.method721(Static25.aClass3_Sub11_1).method728();
					arg1.aClass27_1138 = local174.method735();
					arg1.anInt2400 = 150;
					arg1.anInt2383 = local9 & 0xFF;
					arg1.anInt2379 = local9 >> 8;
					if (local63 == 2 || local63 == 3) {
						Static43.method901(local174, Static98.method1779(new Class27[] { Static42.aClass27_600, arg1.aClass27_1150 }), 1);
					} else if (local63 == 1) {
						Static43.method901(local174, Static98.method1779(new Class27[] { Static4.aClass27_1330, arg1.aClass27_1150 }), 1);
					} else {
						Static43.method901(local174, arg1.aClass27_1150, 2);
					}
				}
			}
			Static47.aClass3_Sub11_Sub1_1.anInt2060 = local103 + local106;
		}
		if ((arg0 & 0x40) != 0) {
			local9 = Static47.aClass3_Sub11_Sub1_1.method1419();
			local63 = Static47.aClass3_Sub11_Sub1_1.method1470();
			if (local9 == 65535) {
				local9 = -1;
			}
			if (arg1.anInt2430 == local9 && local9 != -1) {
				local103 = Static16.method298(local9).anInt2620;
				if (local103 == 1) {
					arg1.anInt2388 = local63;
					arg1.anInt2397 = 0;
					arg1.anInt2425 = 0;
					arg1.anInt2414 = 0;
				}
				if (local103 == 2) {
					arg1.anInt2414 = 0;
				}
			} else if (local9 == -1 || arg1.anInt2430 == -1 || Static16.method298(local9).anInt2621 >= Static16.method298(arg1.anInt2430).anInt2621) {
				arg1.anInt2425 = 0;
				arg1.anInt2420 = arg1.anInt2405;
				arg1.anInt2414 = 0;
				arg1.anInt2388 = local63;
				arg1.anInt2397 = 0;
				arg1.anInt2430 = local9;
			}
		}
		if ((arg0 & 0x2) != 0) {
			local9 = Static47.aClass3_Sub11_Sub1_1.method1421();
			local63 = Static47.aClass3_Sub11_Sub1_1.method1470();
			arg1.method1678(local63, Static2.anInt38, local9);
			arg1.anInt2380 = Static2.anInt38 + 300;
			arg1.anInt2413 = Static47.aClass3_Sub11_Sub1_1.method1421();
			arg1.anInt2396 = Static47.aClass3_Sub11_Sub1_1.method1470();
		}
		if ((arg0 & 0x80) != 0) {
			arg1.anInt2428 = Static47.aClass3_Sub11_Sub1_1.method1457();
			arg1.anInt2406 = Static47.aClass3_Sub11_Sub1_1.method1457();
		}
		if ((arg0 & 0x200) != 0) {
			arg1.anInt2381 = Static47.aClass3_Sub11_Sub1_1.method1422();
			arg1.anInt2407 = Static47.aClass3_Sub11_Sub1_1.method1422();
			arg1.anInt2427 = Static47.aClass3_Sub11_Sub1_1.method1445();
			arg1.anInt2395 = Static47.aClass3_Sub11_Sub1_1.method1422();
			arg1.anInt2424 = Static47.aClass3_Sub11_Sub1_1.method1419() + Static2.anInt38;
			arg1.anInt2402 = Static47.aClass3_Sub11_Sub1_1.method1457() + Static2.anInt38;
			arg1.anInt2415 = Static47.aClass3_Sub11_Sub1_1.method1422();
			arg1.method1673();
		}
		if ((arg0 & 0x400) != 0) {
			arg1.anInt2385 = Static47.aClass3_Sub11_Sub1_1.method1451();
			local9 = Static47.aClass3_Sub11_Sub1_1.method1423();
			arg1.anInt2389 = 0;
			arg1.anInt2391 = Static2.anInt38 + (local9 & 0xFFFF);
			arg1.anInt2404 = 0;
			if (arg1.anInt2385 == 65535) {
				arg1.anInt2385 = -1;
			}
			if (Static2.anInt38 < arg1.anInt2391) {
				arg1.anInt2404 = -1;
			}
			arg1.anInt2392 = local9 >> 16;
		}
		if ((arg0 & 0x4) == 0) {
			return;
		}
		arg1.aClass27_1138 = Static47.aClass3_Sub11_Sub1_1.method1426();
		if (arg1.aClass27_1138.method736(0) == 126) {
			arg1.aClass27_1138 = arg1.aClass27_1138.method731(1);
			Static43.method901(arg1.aClass27_1138, arg1.aClass27_1150, 2);
		} else if (arg1 == Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1) {
			Static43.method901(arg1.aClass27_1138, arg1.aClass27_1150, 2);
		}
		arg1.anInt2400 = 150;
		arg1.anInt2383 = 0;
		arg1.anInt2379 = 0;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
	public static void method1347() {
		aByteArrayArrayArray6 = null;
		aClass27_941 = null;
		aClass27_936 = null;
		aClass27_934 = null;
		aClass27_940 = null;
		aClass12_56 = null;
		aClass27_933 = null;
		aClass27_939 = null;
		aClass27_938 = null;
		aClass27_937 = null;
		aClass27_935 = null;
	}
}
