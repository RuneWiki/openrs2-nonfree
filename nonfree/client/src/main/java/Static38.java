import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "Lclient!vf;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "Lclient!dd;")
	public static Class15 aClass15_3;

	@OriginalMember(owner = "client!ed", name = "I", descriptor = "[B")
	public static byte[] aByteArray11 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "Lclient!cd;")
	public static Class10 aClass10_477 = Static51.method932("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public static void method779() {
		aClass15_3 = null;
		aByteArray11 = null;
		aClass82_1 = null;
		aClass10_477 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public static void method780(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static177.anIntArray421[arg0];
		@Pc(17) int local17 = Static157.anIntArray359[arg0];
		@Pc(21) int local21 = Static27.anIntArray60[arg0];
		@Pc(25) int local25 = Static93.anIntArray229[arg0];
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		@Pc(38) Class2_Sub1_Sub3_Sub2_Sub1 local38;
		if (local25 == 46) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static54.anInt1339 = 2;
				Static160.anInt3405 = Static62.anInt1534;
				Static90.anInt2132 = 0;
				Static136.anInt3023 = Static40.anInt977;
				Static141.aClass2_Sub11_Sub1_3.method1495(195);
				Static141.aClass2_Sub11_Sub1_3.method1474(local21);
			}
		}
		if (local25 == 15) {
			Static99.method1647(local13, local21, local17);
			Static141.aClass2_Sub11_Sub1_3.method1495(147);
			Static141.aClass2_Sub11_Sub1_3.method1457(local21 >> 14 & 0x7FFF);
			Static141.aClass2_Sub11_Sub1_3.method1479(local13 + Static137.anInt3049);
			Static141.aClass2_Sub11_Sub1_3.method1480(Static85.anInt1937 + local17);
		}
		@Pc(137) Class23 local137;
		if (local25 == 12) {
			Static131.method2090();
			local137 = Static102.method2541(local17);
			Static115.anInt2604 = local21;
			Static149.anInt3231 = local17;
			Static73.anInt1744 = local13;
			Static44.anInt1023 = 1;
			Static3.method34(local137);
			Static163.aClass10_1521 = Static3.method36(new Class10[] { Static150.aClass10_1549, Static78.method577(local21).aClass10_662, Static177.aClass10_1609 });
			if (Static163.aClass10_1521 == null) {
				Static163.aClass10_1521 = Static176.aClass10_1601;
			}
			return;
		}
		if (local25 == 39) {
			Static180.aClass60_1.method1824(Static56.anInt1432, local13, local17);
		}
		@Pc(208) boolean local208;
		if (local25 == 44) {
			local208 = Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, local13, 0, 0, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			if (!local208) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local13, 0, 1, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			}
			Static136.anInt3023 = Static40.anInt977;
			Static90.anInt2132 = 0;
			Static54.anInt1339 = 2;
			Static160.anInt3405 = Static62.anInt1534;
			Static141.aClass2_Sub11_Sub1_3.method1495(70);
			Static141.aClass2_Sub11_Sub1_3.method1457(local21);
			Static141.aClass2_Sub11_Sub1_3.method1457(Static137.anInt3049 + local13);
			Static141.aClass2_Sub11_Sub1_3.method1479(local17 + Static85.anInt1937);
		}
		if (local25 == 17) {
			Static10.method168();
		}
		if (local25 == 11) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static90.anInt2132 = 0;
				Static136.anInt3023 = Static40.anInt977;
				Static160.anInt3405 = Static62.anInt1534;
				Static54.anInt1339 = 2;
				Static141.aClass2_Sub11_Sub1_3.method1495(160);
				Static141.aClass2_Sub11_Sub1_3.method1480(local21);
				Static141.aClass2_Sub11_Sub1_3.method1457(Static148.anInt3212);
				Static141.aClass2_Sub11_Sub1_3.method1453(Static169.anInt3668);
			}
		}
		if (local25 == 1002) {
			Static136.anInt3023 = Static40.anInt977;
			Static160.anInt3405 = Static62.anInt1534;
			Static54.anInt1339 = 2;
			Static90.anInt2132 = 0;
			Static141.aClass2_Sub11_Sub1_3.method1495(255);
			Static141.aClass2_Sub11_Sub1_3.method1457(local21 >> 14 & 0x7FFF);
		}
		if (local25 == 28) {
			Static141.aClass2_Sub11_Sub1_3.method1495(132);
			Static141.aClass2_Sub11_Sub1_3.method1457(local13);
			Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			Static141.aClass2_Sub11_Sub1_3.method1470(local17);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 42) {
			Static99.method1647(local13, local21, local17);
			Static141.aClass2_Sub11_Sub1_3.method1495(220);
			Static141.aClass2_Sub11_Sub1_3.method1457(Static137.anInt3049 + local13);
			Static141.aClass2_Sub11_Sub1_3.method1457(local21 >> 14 & 0x7FFF);
			Static141.aClass2_Sub11_Sub1_3.method1474(local17 + Static85.anInt1937);
		}
		if (local25 == 21) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static54.anInt1339 = 2;
				Static90.anInt2132 = 0;
				Static160.anInt3405 = Static62.anInt1534;
				Static136.anInt3023 = Static40.anInt977;
				Static141.aClass2_Sub11_Sub1_3.method1495(122);
				Static141.aClass2_Sub11_Sub1_3.method1474(Static115.anInt2604);
				Static141.aClass2_Sub11_Sub1_3.method1485(Static149.anInt3231);
				Static141.aClass2_Sub11_Sub1_3.method1474(Static73.anInt1744);
				Static141.aClass2_Sub11_Sub1_3.method1457(local21);
			}
		}
		@Pc(504) Class2_Sub1_Sub3_Sub2_Sub2 local504;
		if (local25 == 7) {
			local504 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local21];
			if (local504 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local504.anIntArray365[0], 0, 1, 2, local504.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static90.anInt2132 = 0;
				Static54.anInt1339 = 2;
				Static160.anInt3405 = Static62.anInt1534;
				Static136.anInt3023 = Static40.anInt977;
				Static141.aClass2_Sub11_Sub1_3.method1495(60);
				Static141.aClass2_Sub11_Sub1_3.method1457(local21);
			}
		}
		if (local25 == 24) {
			Static141.aClass2_Sub11_Sub1_3.method1495(240);
			Static141.aClass2_Sub11_Sub1_3.method1474(local13);
			Static141.aClass2_Sub11_Sub1_3.method1453(local17);
			Static141.aClass2_Sub11_Sub1_3.method1479(local21);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 37) {
			local208 = Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, local13, 0, 0, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			if (!local208) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local13, 0, 1, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			}
			Static54.anInt1339 = 2;
			Static160.anInt3405 = Static62.anInt1534;
			Static136.anInt3023 = Static40.anInt977;
			Static90.anInt2132 = 0;
			Static141.aClass2_Sub11_Sub1_3.method1495(24);
			Static141.aClass2_Sub11_Sub1_3.method1453(Static169.anInt3668);
			Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			Static141.aClass2_Sub11_Sub1_3.method1474(local17 + Static85.anInt1937);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static148.anInt3212);
			Static141.aClass2_Sub11_Sub1_3.method1480(local13 + Static137.anInt3049);
		}
		if (local25 == 13) {
			Static141.aClass2_Sub11_Sub1_3.method1495(167);
			Static141.aClass2_Sub11_Sub1_3.method1480(local13);
			Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			Static141.aClass2_Sub11_Sub1_3.method1453(local17);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 30) {
			local208 = Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, local13, 0, 0, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			if (!local208) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local13, 0, 1, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			}
			Static136.anInt3023 = Static40.anInt977;
			Static160.anInt3405 = Static62.anInt1534;
			Static54.anInt1339 = 2;
			Static90.anInt2132 = 0;
			Static141.aClass2_Sub11_Sub1_3.method1495(116);
			Static141.aClass2_Sub11_Sub1_3.method1457(local13 + Static137.anInt3049);
			Static141.aClass2_Sub11_Sub1_3.method1474(local21);
			Static141.aClass2_Sub11_Sub1_3.method1480(Static85.anInt1937 + local17);
		}
		if (local25 == 51) {
			Static141.aClass2_Sub11_Sub1_3.method1495(50);
			Static141.aClass2_Sub11_Sub1_3.method1479(local13);
			Static141.aClass2_Sub11_Sub1_3.method1470(local17);
			Static141.aClass2_Sub11_Sub1_3.method1479(local21);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 22) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static54.anInt1339 = 2;
				Static136.anInt3023 = Static40.anInt977;
				Static90.anInt2132 = 0;
				Static160.anInt3405 = Static62.anInt1534;
				Static141.aClass2_Sub11_Sub1_3.method1495(40);
				Static141.aClass2_Sub11_Sub1_3.method1474(local21);
			}
		}
		if (local25 == 26) {
			local208 = Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, local13, 0, 0, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			if (!local208) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local13, 0, 1, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			}
			Static90.anInt2132 = 0;
			Static160.anInt3405 = Static62.anInt1534;
			Static54.anInt1339 = 2;
			Static136.anInt3023 = Static40.anInt977;
			Static141.aClass2_Sub11_Sub1_3.method1495(188);
			Static141.aClass2_Sub11_Sub1_3.method1479(local13 + Static137.anInt3049);
			Static141.aClass2_Sub11_Sub1_3.method1474(Static85.anInt1937 + local17);
			Static141.aClass2_Sub11_Sub1_3.method1457(local21);
		}
		if (local25 == 14) {
			Static141.aClass2_Sub11_Sub1_3.method1495(92);
			Static141.aClass2_Sub11_Sub1_3.method1480(local13);
			Static141.aClass2_Sub11_Sub1_3.method1445(local17);
			Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 45) {
			local208 = Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, local13, 0, 0, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			if (!local208) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local13, 0, 1, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			}
			Static160.anInt3405 = Static62.anInt1534;
			Static136.anInt3023 = Static40.anInt977;
			Static54.anInt1339 = 2;
			Static90.anInt2132 = 0;
			Static141.aClass2_Sub11_Sub1_3.method1495(236);
			Static141.aClass2_Sub11_Sub1_3.method1445(Static149.anInt3231);
			Static141.aClass2_Sub11_Sub1_3.method1457(local21);
			Static141.aClass2_Sub11_Sub1_3.method1457(local17 + Static85.anInt1937);
			Static141.aClass2_Sub11_Sub1_3.method1480(Static73.anInt1744);
			Static141.aClass2_Sub11_Sub1_3.method1480(local13 + Static137.anInt3049);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static115.anInt2604);
		}
		if (local25 == 34) {
			local504 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local21];
			if (local504 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local504.anIntArray365[0], 0, 1, 2, local504.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static90.anInt2132 = 0;
				Static54.anInt1339 = 2;
				Static136.anInt3023 = Static40.anInt977;
				Static160.anInt3405 = Static62.anInt1534;
				Static141.aClass2_Sub11_Sub1_3.method1495(250);
				Static141.aClass2_Sub11_Sub1_3.method1480(Static148.anInt3212);
				Static141.aClass2_Sub11_Sub1_3.method1453(Static169.anInt3668);
				Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			}
		}
		if (local25 == 5) {
			Static99.method1647(local13, local21, local17);
			Static141.aClass2_Sub11_Sub1_3.method1495(55);
			Static141.aClass2_Sub11_Sub1_3.method1480(local21 >> 14 & 0x7FFF);
			Static141.aClass2_Sub11_Sub1_3.method1474(local13 + Static137.anInt3049);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static85.anInt1937 + local17);
		}
		@Pc(1213) int local1213;
		if (local25 == 1) {
			Static141.aClass2_Sub11_Sub1_3.method1495(157);
			Static141.aClass2_Sub11_Sub1_3.method1445(local17);
			local137 = Static102.method2541(local17);
			if (local137.anIntArrayArray14 != null && local137.anIntArrayArray14[0][0] == 5) {
				local1213 = local137.anIntArrayArray14[0][1];
				if (Static51.anIntArray143[local1213] != local137.anIntArray127[0]) {
					Static51.anIntArray143[local1213] = local137.anIntArray127[0];
					Static121.method1953(local1213);
				}
			}
		}
		if (local25 == 33) {
			Static141.aClass2_Sub11_Sub1_3.method1495(191);
			Static141.aClass2_Sub11_Sub1_3.method1453(Static169.anInt3668);
			Static141.aClass2_Sub11_Sub1_3.method1474(local13);
			Static141.aClass2_Sub11_Sub1_3.method1474(Static148.anInt3212);
			Static141.aClass2_Sub11_Sub1_3.method1445(local17);
		}
		if (local25 == 9) {
			local504 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local21];
			if (local504 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local504.anIntArray365[0], 0, 1, 2, local504.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static54.anInt1339 = 2;
				Static90.anInt2132 = 0;
				Static160.anInt3405 = Static62.anInt1534;
				Static136.anInt3023 = Static40.anInt977;
				Static141.aClass2_Sub11_Sub1_3.method1495(228);
				Static141.aClass2_Sub11_Sub1_3.method1457(Static73.anInt1744);
				Static141.aClass2_Sub11_Sub1_3.method1479(local21);
				Static141.aClass2_Sub11_Sub1_3.method1457(Static115.anInt2604);
				Static141.aClass2_Sub11_Sub1_3.method1485(Static149.anInt3231);
			}
		}
		if (local25 == 29) {
			local504 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local21];
			if (local504 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local504.anIntArray365[0], 0, 1, 2, local504.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static160.anInt3405 = Static62.anInt1534;
				Static54.anInt1339 = 2;
				Static136.anInt3023 = Static40.anInt977;
				Static90.anInt2132 = 0;
				Static141.aClass2_Sub11_Sub1_3.method1495(75);
				Static141.aClass2_Sub11_Sub1_3.method1479(local21);
			}
		}
		if (local25 == 3) {
			Static99.method1647(local13, local21, local17);
			Static141.aClass2_Sub11_Sub1_3.method1495(20);
			Static141.aClass2_Sub11_Sub1_3.method1480(Static137.anInt3049 + local13);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static85.anInt1937 + local17);
			Static141.aClass2_Sub11_Sub1_3.method1479(local21 >> 14 & 0x7FFF);
		}
		if (local25 == 49) {
			local208 = Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, local13, 0, 0, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			if (!local208) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local13, 0, 1, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			}
			Static54.anInt1339 = 2;
			Static136.anInt3023 = Static40.anInt977;
			Static160.anInt3405 = Static62.anInt1534;
			Static90.anInt2132 = 0;
			Static141.aClass2_Sub11_Sub1_3.method1495(81);
			Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static137.anInt3049 + local13);
			Static141.aClass2_Sub11_Sub1_3.method1474(Static85.anInt1937 + local17);
		}
		if (local25 == 43) {
			Static141.aClass2_Sub11_Sub1_3.method1495(157);
			Static141.aClass2_Sub11_Sub1_3.method1445(local17);
			local137 = Static102.method2541(local17);
			if (local137.anIntArrayArray14 != null && local137.anIntArrayArray14[0][0] == 5) {
				local1213 = local137.anIntArrayArray14[0][1];
				Static51.anIntArray143[local1213] = 1 - Static51.anIntArray143[local1213];
				Static121.method1953(local1213);
			}
		}
		if (local25 == 4) {
			Static141.aClass2_Sub11_Sub1_3.method1495(164);
			Static141.aClass2_Sub11_Sub1_3.method1470(local17);
			Static141.aClass2_Sub11_Sub1_3.method1479(local21);
			Static141.aClass2_Sub11_Sub1_3.method1480(local13);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 40 || local25 == 1006) {
			Static48.method883(local21, Static75.aClass10Array12[arg0], local17, local13);
		}
		if (local25 == 35) {
			Static141.aClass2_Sub11_Sub1_3.method1495(25);
			Static141.aClass2_Sub11_Sub1_3.method1470(Static169.anInt3668);
			Static141.aClass2_Sub11_Sub1_3.method1453(local17);
			Static141.aClass2_Sub11_Sub1_3.method1479(local13);
			Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static148.anInt3212);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 50) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static90.anInt2132 = 0;
				Static160.anInt3405 = Static62.anInt1534;
				Static136.anInt3023 = Static40.anInt977;
				Static54.anInt1339 = 2;
				Static141.aClass2_Sub11_Sub1_3.method1495(77);
				Static141.aClass2_Sub11_Sub1_3.method1474(local21);
			}
		}
		if (local25 == 8) {
			@Pc(1709) boolean local1709 = true;
			local137 = Static102.method2541(local17);
			if (local137.anInt1088 > 0) {
				local1709 = Static36.method758(local137);
			}
			if (local1709) {
				Static141.aClass2_Sub11_Sub1_3.method1495(157);
				Static141.aClass2_Sub11_Sub1_3.method1445(local17);
			}
		}
		if (local25 == 48) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static160.anInt3405 = Static62.anInt1534;
				Static54.anInt1339 = 2;
				Static136.anInt3023 = Static40.anInt977;
				Static90.anInt2132 = 0;
				Static141.aClass2_Sub11_Sub1_3.method1495(242);
				Static141.aClass2_Sub11_Sub1_3.method1474(local21);
			}
		}
		if (local25 == 57) {
			local208 = Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 0, local13, 0, 0, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			if (!local208) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local13, 0, 1, 2, local17, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
			}
			Static54.anInt1339 = 2;
			Static90.anInt2132 = 0;
			Static160.anInt3405 = Static62.anInt1534;
			Static136.anInt3023 = Static40.anInt977;
			Static141.aClass2_Sub11_Sub1_3.method1495(173);
			Static141.aClass2_Sub11_Sub1_3.method1474(Static137.anInt3049 + local13);
			Static141.aClass2_Sub11_Sub1_3.method1457(local17 + Static85.anInt1937);
			Static141.aClass2_Sub11_Sub1_3.method1474(local21);
		}
		if (local25 == 36 && Static68.aClass23_6 == null) {
			Static118.method1908(local13, local17);
			Static68.aClass23_6 = Static14.method222(local17, local13);
			Static3.method34(Static68.aClass23_6);
		}
		if (local25 == 20) {
			Static141.aClass2_Sub11_Sub1_3.method1495(53);
			Static141.aClass2_Sub11_Sub1_3.method1479(local21);
			Static141.aClass2_Sub11_Sub1_3.method1479(local13);
			Static141.aClass2_Sub11_Sub1_3.method1485(local17);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 38 && Static99.method1647(local13, local21, local17)) {
			Static141.aClass2_Sub11_Sub1_3.method1495(114);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static85.anInt1937 + local17);
			Static141.aClass2_Sub11_Sub1_3.method1474(Static73.anInt1744);
			Static141.aClass2_Sub11_Sub1_3.method1457(Static137.anInt3049 + local13);
			Static141.aClass2_Sub11_Sub1_3.method1445(Static149.anInt3231);
			Static141.aClass2_Sub11_Sub1_3.method1474(local21 >> 14 & 0x7FFF);
			Static141.aClass2_Sub11_Sub1_3.method1457(Static115.anInt2604);
		}
		if (local25 == 31) {
			Static141.aClass2_Sub11_Sub1_3.method1495(66);
			Static141.aClass2_Sub11_Sub1_3.method1445(local17);
			Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			Static141.aClass2_Sub11_Sub1_3.method1479(local13);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 1001) {
			local137 = Static102.method2541(local17);
			if (local137 == null || local137.anIntArray126[local13] < 100000) {
				Static141.aClass2_Sub11_Sub1_3.method1495(125);
				Static141.aClass2_Sub11_Sub1_3.method1474(local21);
			} else {
				Static96.method2627(Static63.aClass10_687, 0, Static3.method36(new Class10[] { Static164.method2485(local137.anIntArray126[local13]), Static2.aClass10_30, Static78.method577(local21).aClass10_662 }));
			}
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 2) {
			Static141.aClass2_Sub11_Sub1_3.method1495(11);
			Static141.aClass2_Sub11_Sub1_3.method1474(local13);
			Static141.aClass2_Sub11_Sub1_3.method1453(local17);
			Static141.aClass2_Sub11_Sub1_3.method1479(local21);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 58) {
			local504 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local21];
			if (local504 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local504.anIntArray365[0], 0, 1, 2, local504.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static54.anInt1339 = 2;
				Static90.anInt2132 = 0;
				Static136.anInt3023 = Static40.anInt977;
				Static160.anInt3405 = Static62.anInt1534;
				Static141.aClass2_Sub11_Sub1_3.method1495(29);
				Static141.aClass2_Sub11_Sub1_3.method1479(local21);
			}
		}
		if (local25 == 25) {
			Static141.aClass2_Sub11_Sub1_3.method1495(47);
			Static141.aClass2_Sub11_Sub1_3.method1457(local21);
			Static141.aClass2_Sub11_Sub1_3.method1445(local17);
			Static141.aClass2_Sub11_Sub1_3.method1479(local13);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 19) {
			local504 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local21];
			if (local504 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local504.anIntArray365[0], 0, 1, 2, local504.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static160.anInt3405 = Static62.anInt1534;
				Static136.anInt3023 = Static40.anInt977;
				Static90.anInt2132 = 0;
				Static54.anInt1339 = 2;
				Static141.aClass2_Sub11_Sub1_3.method1495(82);
				Static141.aClass2_Sub11_Sub1_3.method1457(local21);
			}
		}
		if (local25 == 6) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static90.anInt2132 = 0;
				Static54.anInt1339 = 2;
				Static160.anInt3405 = Static62.anInt1534;
				Static136.anInt3023 = Static40.anInt977;
				Static141.aClass2_Sub11_Sub1_3.method1495(13);
				Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			}
		}
		if (local25 == 41) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static136.anInt3023 = Static40.anInt977;
				Static160.anInt3405 = Static62.anInt1534;
				Static54.anInt1339 = 2;
				Static90.anInt2132 = 0;
				Static141.aClass2_Sub11_Sub1_3.method1495(210);
				Static141.aClass2_Sub11_Sub1_3.method1474(local21);
			}
		}
		if (local25 == 10) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static90.anInt2132 = 0;
				Static54.anInt1339 = 2;
				Static136.anInt3023 = Static40.anInt977;
				Static160.anInt3405 = Static62.anInt1534;
				Static141.aClass2_Sub11_Sub1_3.method1495(54);
				Static141.aClass2_Sub11_Sub1_3.method1480(local21);
			}
		}
		if (local25 == 18) {
			local38 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local21];
			if (local38 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local38.anIntArray365[0], 0, 1, 2, local38.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static54.anInt1339 = 2;
				Static136.anInt3023 = Static40.anInt977;
				Static160.anInt3405 = Static62.anInt1534;
				Static90.anInt2132 = 0;
				Static141.aClass2_Sub11_Sub1_3.method1495(9);
				Static141.aClass2_Sub11_Sub1_3.method1479(local21);
			}
		}
		if (local25 == 1004) {
			Static136.anInt3023 = Static40.anInt977;
			Static160.anInt3405 = Static62.anInt1534;
			Static90.anInt2132 = 0;
			Static54.anInt1339 = 2;
			Static141.aClass2_Sub11_Sub1_3.method1495(125);
			Static141.aClass2_Sub11_Sub1_3.method1474(local21);
		}
		if (local25 == 32) {
			local137 = Static14.method222(local17, local13);
			if (local137 != null) {
				Static131.method2090();
				Static4.method51(local13, Static64.method1127(Static126.method2068(local137)), local17);
				Static44.anInt1023 = 0;
				Static111.aClass10_1098 = Static63.method1125(local137);
				if (Static111.aClass10_1098 == null) {
					Static111.aClass10_1098 = Static158.aClass10_1479;
				}
				if (!local137.aBoolean37) {
					Static121.aClass10_1190 = Static3.method36(new Class10[] { Static114.aClass10_1105, local137.aClass10_505, Static177.aClass10_1609 });
					return;
				}
				Static121.aClass10_1190 = Static3.method36(new Class10[] { local137.aClass10_501, Static177.aClass10_1609 });
			}
			return;
		}
		if (local25 == 23) {
			Static141.aClass2_Sub11_Sub1_3.method1495(51);
			Static141.aClass2_Sub11_Sub1_3.method1445(Static149.anInt3231);
			Static141.aClass2_Sub11_Sub1_3.method1457(Static73.anInt1744);
			Static141.aClass2_Sub11_Sub1_3.method1457(local21);
			Static141.aClass2_Sub11_Sub1_3.method1457(Static115.anInt2604);
			Static141.aClass2_Sub11_Sub1_3.method1457(local13);
			Static141.aClass2_Sub11_Sub1_3.method1485(local17);
			Static152.anInt3296 = 0;
			Static83.aClass23_7 = Static102.method2541(local17);
			Static109.anInt2501 = local13;
		}
		if (local25 == 16) {
			local504 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local21];
			if (local504 != null) {
				Static165.method2527(0, false, 0, Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0], 1, local504.anIntArray365[0], 0, 1, 2, local504.anIntArray366[0], Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0]);
				Static136.anInt3023 = Static40.anInt977;
				Static54.anInt1339 = 2;
				Static90.anInt2132 = 0;
				Static160.anInt3405 = Static62.anInt1534;
				Static141.aClass2_Sub11_Sub1_3.method1495(21);
				Static141.aClass2_Sub11_Sub1_3.method1457(local21);
			}
		}
		if (local25 == 47 && Static99.method1647(local13, local21, local17)) {
			Static141.aClass2_Sub11_Sub1_3.method1495(22);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static137.anInt3049 + local13);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static148.anInt3212);
			Static141.aClass2_Sub11_Sub1_3.method1445(Static169.anInt3668);
			Static141.aClass2_Sub11_Sub1_3.method1479(local17 + Static85.anInt1937);
			Static141.aClass2_Sub11_Sub1_3.method1479(local21 >> 14 & 0x7FFF);
		}
		if (local25 == 1005) {
			Static136.anInt3023 = Static40.anInt977;
			Static160.anInt3405 = Static62.anInt1534;
			Static90.anInt2132 = 0;
			Static54.anInt1339 = 2;
			local504 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local21];
			if (local504 != null) {
				@Pc(2724) Class2_Sub1_Sub2 local2724 = local504.aClass2_Sub1_Sub2_1;
				if (local2724.anIntArray5 != null) {
					local2724 = local2724.method57();
				}
				if (local2724 != null) {
					Static141.aClass2_Sub11_Sub1_3.method1495(68);
					Static141.aClass2_Sub11_Sub1_3.method1480(local2724.anInt58);
				}
			}
		}
		if (local25 == 1007) {
			Static99.method1647(local13, local21, local17);
			Static141.aClass2_Sub11_Sub1_3.method1495(123);
			Static141.aClass2_Sub11_Sub1_3.method1479(Static85.anInt1937 + local17);
			Static141.aClass2_Sub11_Sub1_3.method1457(local13 + Static137.anInt3049);
			Static141.aClass2_Sub11_Sub1_3.method1479(local21 >> 14 & 0x7FFF);
		}
		if (Static44.anInt1023 != 0) {
			Static44.anInt1023 = 0;
			Static3.method34(Static102.method2541(Static149.anInt3231));
		}
		if (Static69.aBoolean74) {
			Static131.method2090();
		}
		if (Static83.aClass23_7 != null && Static152.anInt3296 == 0) {
			Static3.method34(Static83.aClass23_7);
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Z")
	public static boolean method781(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
	public static void method783() {
		try {
			if (Static168.anInt3655 == 1) {
				@Pc(10) int local10 = Static178.aClass2_Sub5_Sub4_2.method2660();
				if (local10 > 0 && Static178.aClass2_Sub5_Sub4_2.method2666()) {
					local10 -= Static123.anInt2781;
					if (local10 < 0) {
						local10 = 0;
					}
					Static178.aClass2_Sub5_Sub4_2.method2684(local10);
					return;
				}
				Static178.aClass2_Sub5_Sub4_2.method2691();
				Static178.aClass2_Sub5_Sub4_2.method2664();
				if (Static111.aClass29_49 == null) {
					Static168.anInt3655 = 0;
				} else {
					Static168.anInt3655 = 2;
				}
				Static79.aClass2_Sub12_1 = null;
				Static18.aClass24_1 = null;
			}
		} catch (@Pc(56) Exception local56) {
			local56.printStackTrace();
			Static178.aClass2_Sub5_Sub4_2.method2691();
			Static79.aClass2_Sub12_1 = null;
			Static168.anInt3655 = 0;
			Static111.aClass29_49 = null;
			Static18.aClass24_1 = null;
		}
	}
}
