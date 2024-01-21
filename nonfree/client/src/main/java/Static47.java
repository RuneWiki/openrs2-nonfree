import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!wc;")
	public static Class1_Sub2_Sub8_Sub5 aClass1_Sub2_Sub8_Sub5_11;

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
	public static int anInt1175;

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_17 = new Class86(100);

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_292 = Static81.method1507("Welt");

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_293 = Static81.method1507("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method854() {
		for (@Pc(3) int local3 = 0; local3 < Static24.anInt663; local3++) {
			@Pc(9) int local9 = Static127.anIntArray222[local3];
			@Pc(13) Class5_Sub2_Sub2 local13 = Static148.aClass5_Sub2_Sub2Array1[local9];
			@Pc(17) int local17 = Static192.aClass1_Sub7_Sub1_31.method2771();
			if ((local17 & 0x8) != 0) {
				local13.aClass1_Sub2_Sub21_1 = Static135.method2296(Static192.aClass1_Sub7_Sub1_31.method2794());
				local13.anInt2497 = local13.aClass1_Sub2_Sub21_1.anInt3954;
				local13.anInt2449 = local13.aClass1_Sub2_Sub21_1.anInt3941;
				local13.anInt2450 = local13.aClass1_Sub2_Sub21_1.anInt3950;
				local13.anInt2499 = local13.aClass1_Sub2_Sub21_1.anInt3965;
				local13.anInt2454 = local13.aClass1_Sub2_Sub21_1.anInt3969;
				local13.anInt2494 = local13.aClass1_Sub2_Sub21_1.anInt3952;
				local13.anInt2484 = local13.aClass1_Sub2_Sub21_1.anInt3960;
				local13.anInt2480 = local13.aClass1_Sub2_Sub21_1.anInt3966;
				local13.anInt2492 = local13.aClass1_Sub2_Sub21_1.anInt3942;
			}
			@Pc(84) int local84;
			@Pc(88) int local88;
			if ((local17 & 0x80) != 0) {
				local84 = Static192.aClass1_Sub7_Sub1_31.method2769();
				local88 = Static192.aClass1_Sub7_Sub1_31.method2777();
				local13.method1888(local88, Static42.anInt1100, local84);
				local13.anInt2475 = Static42.anInt1100 + 300;
				local13.anInt2457 = Static192.aClass1_Sub7_Sub1_31.method2777();
			}
			if ((local17 & 0x2) != 0) {
				local84 = Static192.aClass1_Sub7_Sub1_31.method2794();
				if (local84 == 65535) {
					local84 = -1;
				}
				local88 = Static192.aClass1_Sub7_Sub1_31.method2799();
				if (local84 == local13.anInt2485 && local84 != -1) {
					@Pc(133) Class1_Sub2_Sub22 local133 = Static85.method2622(local84);
					@Pc(136) int local136 = local133.anInt3996;
					if (local136 == 1) {
						local13.anInt2472 = local88;
						local13.anInt2496 = 0;
						local13.anInt2466 = 0;
						local13.anInt2493 = 0;
						Static125.method2098(local133, local13.anInt2501, local13.anInt2448, local13.anInt2493, false);
					}
					if (local136 == 2) {
						local13.anInt2466 = 0;
					}
				} else if (local84 == -1 || local13.anInt2485 == -1 || Static85.method2622(local84).anInt3994 >= Static85.method2622(local13.anInt2485).anInt3994) {
					local13.anInt2485 = local84;
					local13.anInt2472 = local88;
					local13.anInt2456 = local13.anInt2447;
					local13.anInt2496 = 0;
					local13.anInt2466 = 0;
					local13.anInt2493 = 0;
					if (local13.anInt2485 != -1) {
						Static125.method2098(Static85.method2622(local13.anInt2485), local13.anInt2501, local13.anInt2448, local13.anInt2493, false);
					}
				}
			}
			if ((local17 & 0x20) != 0) {
				local13.anInt2462 = Static192.aClass1_Sub7_Sub1_31.method2765();
				local13.anInt2487 = Static192.aClass1_Sub7_Sub1_31.method2765();
			}
			if ((local17 & 0x4) != 0) {
				local84 = Static192.aClass1_Sub7_Sub1_31.method2771();
				local88 = Static192.aClass1_Sub7_Sub1_31.method2769();
				local13.method1888(local88, Static42.anInt1100, local84);
			}
			if ((local17 & 0x10) != 0) {
				local13.anInt2500 = Static192.aClass1_Sub7_Sub1_31.method2794();
				if (local13.anInt2500 == 65535) {
					local13.anInt2500 = -1;
				}
			}
			if ((local17 & 0x1) != 0) {
				local13.aClass24_736 = Static192.aClass1_Sub7_Sub1_31.method2761();
				local13.anInt2483 = 100;
			}
			if ((local17 & 0x40) != 0) {
				local13.anInt2458 = Static192.aClass1_Sub7_Sub1_31.method2752();
				local84 = Static192.aClass1_Sub7_Sub1_31.method2793();
				local13.anInt2461 = local84 >> 16;
				local13.anInt2473 = (local84 & 0xFFFF) + Static42.anInt1100;
				if (local13.anInt2458 == 65535) {
					local13.anInt2458 = -1;
				}
				local13.anInt2488 = 0;
				local13.anInt2471 = 0;
				if (Static42.anInt1100 < local13.anInt2473) {
					local13.anInt2471 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	public static void method857(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static49.aClass57_12.method1872((long) arg0);
		if (local10 != null) {
			local10.method3563();
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
	public static void method859() {
		Static88.method1593(false);
		Static104.anInt2346 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static116.aByteArrayArray7.length; local14++) {
			if (Static169.anIntArray318[local14] != -1 && Static116.aByteArrayArray7[local14] == null) {
				Static116.aByteArrayArray7[local14] = Static184.aClass69_Sub1_139.method2208(Static169.anIntArray318[local14], 0);
				if (Static116.aByteArrayArray7[local14] == null) {
					local12 = false;
					Static104.anInt2346++;
				}
			}
			if (Static73.anIntArray150[local14] != -1 && Static34.aByteArrayArray2[local14] == null) {
				Static34.aByteArrayArray2[local14] = Static184.aClass69_Sub1_139.method2219(Static73.anIntArray150[local14], 0, Static57.anIntArrayArray12[local14]);
				if (Static34.aByteArrayArray2[local14] == null) {
					local12 = false;
					Static104.anInt2346++;
				}
			}
		}
		if (!local12) {
			Static58.anInt1427 = 1;
			return;
		}
		local12 = true;
		Static128.anInt2830 = 0;
		@Pc(124) int local124;
		for (@Pc(94) int local94 = 0; local94 < Static116.aByteArrayArray7.length; local94++) {
			@Pc(100) byte[] local100 = Static34.aByteArrayArray2[local94];
			if (local100 != null) {
				@Pc(113) int local113 = (Static152.anIntArray284[local94] & 0xFF) * 64 - Static127.anInt2789;
				local124 = (Static152.anIntArray284[local94] >> 8) * 64 - Static196.anInt4343;
				if (Static130.aBoolean137) {
					local124 = 10;
					local113 = 10;
				}
				local12 &= Static105.method1832(local100, local124, local113);
			}
		}
		if (!local12) {
			Static58.anInt1427 = 2;
			return;
		}
		if (Static58.anInt1427 != 0) {
			Static132.method2262(true, Static63.method1281(new Class24[] { Static150.aClass24_988, Static130.aClass24_862 }));
		}
		Static67.method1334();
		Static142.method2460();
		Static67.method1334();
		Static172.method2978();
		Static67.method1334();
		System.gc();
		for (@Pc(177) int local177 = 0; local177 < 4; local177++) {
			Static66.aClass93Array1[local177].method3269();
		}
		@Pc(204) int local204;
		@Pc(208) int local208;
		for (local124 = 0; local124 < 4; local124++) {
			for (local204 = 0; local204 < 104; local204++) {
				for (local208 = 0; local208 < 104; local208++) {
					Static43.aByteArrayArrayArray3[local124][local204][local208] = 0;
				}
			}
		}
		Static67.method1334();
		Static176.method3550();
		local204 = Static116.aByteArrayArray7.length;
		Static81.method1510();
		Static88.method1593(true);
		@Pc(259) int local259;
		@Pc(270) int local270;
		@Pc(338) int local338;
		@Pc(327) int local327;
		@Pc(385) int local385;
		if (!Static130.aBoolean137) {
			@Pc(274) byte[] local274;
			for (local208 = 0; local208 < local204; local208++) {
				local259 = (Static152.anIntArray284[local208] >> 8) * 64 - Static196.anInt4343;
				local270 = (Static152.anIntArray284[local208] & 0xFF) * 64 - Static127.anInt2789;
				local274 = Static116.aByteArrayArray7[local208];
				if (local274 != null) {
					Static67.method1334();
					Static212.method3581(local274, local259, (Static115.anInt2583 - 6) * 8, local270, Static66.aClass93Array1, (Static120.anInt2672 - 6) * 8);
				}
			}
			for (local259 = 0; local259 < local204; local259++) {
				local270 = (Static152.anIntArray284[local259] >> 8) * 64 - Static196.anInt4343;
				@Pc(317) byte[] local317 = Static116.aByteArrayArray7[local259];
				local327 = (Static152.anIntArray284[local259] & 0xFF) * 64 - Static127.anInt2789;
				if (local317 == null && Static115.anInt2583 < 800) {
					Static67.method1334();
					for (local338 = 0; local338 < 4; local338++) {
						Static45.method839(64, local327, local338, 64, local270);
					}
				}
			}
			Static88.method1593(true);
			for (local270 = 0; local270 < local204; local270++) {
				local274 = Static34.aByteArrayArray2[local270];
				if (local274 != null) {
					local385 = (Static152.anIntArray284[local270] >> 8) * 64 - Static196.anInt4343;
					local338 = (Static152.anIntArray284[local270] & 0xFF) * 64 - Static127.anInt2789;
					Static67.method1334();
					Static36.method689(local274, local338, Static66.aClass93Array1, local385);
				}
			}
		}
		@Pc(443) int local443;
		@Pc(455) int local455;
		if (Static130.aBoolean137) {
			@Pc(461) int local461;
			@Pc(471) int local471;
			@Pc(473) int local473;
			for (local208 = 0; local208 < 4; local208++) {
				Static67.method1334();
				for (local259 = 0; local259 < 13; local259++) {
					for (local270 = 0; local270 < 13; local270++) {
						@Pc(425) boolean local425 = false;
						local385 = Static114.anIntArrayArrayArray6[local208][local259][local270];
						if (local385 != -1) {
							local443 = local385 >> 1 & 0x3;
							local338 = local385 >> 24 & 0x3;
							local455 = local385 >> 14 & 0x3FF;
							local461 = local385 >> 3 & 0x7FF;
							local471 = local461 / 8 + (local455 / 8 << 8);
							for (local473 = 0; local473 < Static152.anIntArray284.length; local473++) {
								if (Static152.anIntArray284[local473] == local471 && Static116.aByteArrayArray7[local473] != null) {
									Static63.method1276(local270 * 8, Static66.aClass93Array1, (local461 & 0x7) * 8, local338, local208, (local455 & 0x7) * 8, local443, local259 * 8, Static116.aByteArrayArray7[local473]);
									local425 = true;
									break;
								}
							}
						}
						if (!local425) {
							Static45.method839(8, local270 * 8, local208, 8, local259 * 8);
						}
					}
				}
			}
			Static88.method1593(true);
			for (local259 = 0; local259 < 4; local259++) {
				Static67.method1334();
				for (local270 = 0; local270 < 13; local270++) {
					for (local327 = 0; local327 < 13; local327++) {
						local385 = Static114.anIntArrayArrayArray6[local259][local270][local327];
						if (local385 != -1) {
							local443 = local385 >> 1 & 0x3;
							local338 = local385 >> 24 & 0x3;
							local461 = local385 >> 3 & 0x7FF;
							local455 = local385 >> 14 & 0x3FF;
							local471 = local461 / 8 + (local455 / 8 << 8);
							for (local473 = 0; local473 < Static152.anIntArray284.length; local473++) {
								if (local471 == Static152.anIntArray284[local473] && Static34.aByteArrayArray2[local473] != null) {
									Static12.method302(local327 * 8, Static34.aByteArrayArray2[local473], Static66.aClass93Array1, local338, local270 * 8, (local461 & 0x7) * 8, local443, (local455 & 0x7) * 8, local259);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static88.method1593(true);
		Static142.method2460();
		Static67.method1334();
		Static151.method2592(Static66.aClass93Array1);
		Static88.method1593(true);
		local208 = Static80.anInt1917;
		if (local208 > Static170.anInt3799) {
			local208 = Static170.anInt3799;
		}
		if (local208 < Static170.anInt3799 - 1) {
		}
		if (Static30.aBoolean35) {
			Static67.method1327(Static80.anInt1917);
		} else {
			Static67.method1327(0);
		}
		for (local259 = 0; local259 < 104; local259++) {
			for (local270 = 0; local270 < 104; local270++) {
				Static37.method700(local259, local270);
			}
		}
		Static67.method1334();
		Static147.method2536();
		Static142.method2460();
		if (Static32.aFrame1 != null) {
			Static176.aClass1_Sub7_Sub1_34.method2808(163);
			Static176.aClass1_Sub7_Sub1_34.method2754(1057001181);
		}
		if (!Static130.aBoolean137) {
			local327 = (Static120.anInt2672 + 6) / 8;
			local385 = (Static115.anInt2583 - 6) / 8;
			local270 = (Static120.anInt2672 - 6) / 8;
			local338 = (Static115.anInt2583 + 6) / 8;
			for (local443 = local270 - 1; local443 <= local327 + 1; local443++) {
				for (local455 = local385 - 1; local455 <= local338 + 1; local455++) {
					if (local443 < local270 || local327 < local443 || local385 > local455 || local338 < local455) {
						Static184.aClass69_Sub1_139.method2200(Static63.method1281(new Class24[] { Static212.aClass24_1332, Static175.method3020(local443), Static72.aClass24_529, Static175.method3020(local455) }));
						Static184.aClass69_Sub1_139.method2200(Static63.method1281(new Class24[] { Static127.aClass24_842, Static175.method3020(local443), Static72.aClass24_529, Static175.method3020(local455) }));
					}
				}
			}
		}
		Static57.method1099(30);
		Static67.method1334();
		Static59.method1107();
		Static176.aClass1_Sub7_Sub1_34.method2808(77);
		Static49.method901();
	}
}
