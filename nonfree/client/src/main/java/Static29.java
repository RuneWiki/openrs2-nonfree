import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Lclient!g;")
	public static Class26 aClass26_4;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public static int anInt685 = 0;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public static int anInt686 = 0;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!u;")
	public static Class74 aClass74_532 = Static72.method1077("(U(Y");

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Lclient!e;")
	public static Class16 aClass16_28 = new Class16(50);

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_533 = Static72.method1077("m");

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Lclient!u;")
	private static Class74 aClass74_536 = Static72.method1077(" is already on your ignore list");

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_534 = aClass74_536;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
	public static int anInt691 = 0;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "Lclient!u;")
	public static Class74 aClass74_535 = Static72.method1077("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!u;")
	public static Class74 aClass74_537 = Static72.method1077("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method516() {
		Static93.aClass16_69.method485();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!u;Lclient!u;BLclient!g;)Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 method517(@OriginalArg(0) Class74 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(3) Class26 arg2) {
		@Pc(16) int local16 = arg2.method1351(arg1);
		@Pc(22) int local22 = arg2.method1374(local16, arg0);
		return Static67.method1027(arg2, local16, local22);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method518(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static51.method1505(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static95.aClass15_46.anApplet1 != null) {
				@Pc(102) Class37 local102 = Static95.aClass15_46.method461(new URL(Static95.aClass15_46.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static83.anInt1809 + "&u=" + Static84.aLong71 + "&v1=" + Static22.aString3 + "&v2=" + Static22.aString2 + "&e=" + local7));
				while (local102.anInt1337 == 0) {
					Static80.method1260(1L);
				}
				if (local102.anInt1337 == 1) {
					@Pc(118) DataInputStream local118 = (DataInputStream) local102.anObject3;
					local118.read();
					local118.close();
				}
			}
		} catch (@Pc(125) Exception local125) {
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IJ)V")
	public static void method520(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static65.anInt1450 >= 100 && anInt691 != 1 || Static65.anInt1450 >= 200) {
			Static67.method1024(0, Static97.aClass74_1736, Static12.aClass74_330);
			return;
		}
		@Pc(33) Class74 local33 = Static112.method1686(arg0).method1720();
		for (@Pc(35) int local35 = 0; local35 < Static65.anInt1450; local35++) {
			if (arg0 == Static6.aLongArray2[local35]) {
				Static67.method1024(0, Static97.aClass74_1736, Static91.method1340(new Class74[] { local33, Static81.aClass74_1221 }));
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static101.anInt2247; local74++) {
			if (arg0 == Static10.aLongArray6[local74]) {
				Static67.method1024(0, Static97.aClass74_1736, Static91.method1340(new Class74[] { Static19.aClass74_449, local33, Static32.aClass74_605 }));
				return;
			}
		}
		if (local33.method1733(Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass74_1661)) {
			return;
		}
		Static19.aClass74Array2[Static65.anInt1450] = local33;
		Static6.aLongArray2[Static65.anInt1450] = arg0;
		Static78.anIntArray251[Static65.anInt1450] = 0;
		Static23.anIntArray67[Static65.anInt1450] = 0;
		Static116.aBoolean107 = true;
		Static46.anInt1053 = Static107.anInt2338 + 1;
		Static65.anInt1450++;
		Static128.aClass2_Sub10_Sub1_3.method1533(174);
		Static128.aClass2_Sub10_Sub1_3.method1495(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method521() {
		aClass74_536 = null;
		aClass74_533 = null;
		aClass26_4 = null;
		aClass74_534 = null;
		aClass74_535 = null;
		aClass16_28 = null;
		aClass74_532 = null;
		aClass74_537 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)V")
	public static void method522(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static55.anIntArray53[arg0];
		@Pc(16) int local16 = Static77.anIntArray246[arg0];
		@Pc(20) int local20 = Static57.anIntArray159[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(30) int local30 = Static88.anIntArray261[arg0];
		if (Static36.anInt869 != 0 && local20 != 1004) {
			Static55.aBoolean16 = true;
			Static36.anInt869 = 0;
		}
		@Pc(58) Class74 local58;
		@Pc(63) int local63;
		@Pc(86) int local86;
		if (local20 == 2 || local20 == 51) {
			local58 = Static92.aClass74Array14[arg0];
			local63 = local58.method1722(Static42.aClass74_702);
			if (local63 != -1) {
				@Pc(69) boolean local69 = false;
				local58 = local58.method1697(local63 + 5).method1718();
				@Pc(84) Class74 local84 = local58.method1709().method1720();
				for (local86 = 0; local86 < Static10.anInt320; local86++) {
					@Pc(94) Class2_Sub2_Sub2_Sub1_Sub2 local94 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[Static92.anIntArray267[local86]];
					if (local94 != null && local94.aClass74_1661 != null && local94.aClass74_1661.method1701(local84)) {
						local69 = true;
						Static48.method794(2, 1, false, 0, local94.anIntArray393[0], 0, local94.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
						if (local20 == 2) {
							Static128.aClass2_Sub10_Sub1_3.method1533(59);
							Static128.aClass2_Sub10_Sub1_3.method1485(Static92.anIntArray267[local86]);
						}
						if (local20 == 51) {
							Static128.aClass2_Sub10_Sub1_3.method1533(231);
							Static128.aClass2_Sub10_Sub1_3.method1511(Static92.anIntArray267[local86]);
						}
						break;
					}
				}
				if (!local69) {
					Static67.method1024(0, Static97.aClass74_1736, Static91.method1340(new Class74[] { Static120.aClass74_1604, local84 }));
				}
			}
		}
		if (local20 == 54) {
			Static56.method943(local12, local30, local16);
			Static128.aClass2_Sub10_Sub1_3.method1533(251);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static62.anInt1413 + local16);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static107.anInt2343 + local12);
			Static128.aClass2_Sub10_Sub1_3.method1482(local30 >> 14 & 0x7FFF);
		}
		@Pc(241) Class2_Sub2_Sub2_Sub1_Sub2 local241;
		if (local20 == 30) {
			local241 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local30];
			if (local241 != null) {
				Static48.method794(2, 1, false, 0, local241.anIntArray393[0], 0, local241.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static126.anInt2857 = 2;
				Static75.anInt1601 = Static120.anInt2565;
				Static38.anInt929 = 0;
				Static124.anInt2729 = Static15.anInt442;
				Static128.aClass2_Sub10_Sub1_3.method1533(59);
				Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			}
		}
		if (local20 == 53) {
			local241 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local30];
			if (local241 != null) {
				Static48.method794(2, 1, false, 0, local241.anIntArray393[0], 0, local241.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static75.anInt1601 = Static120.anInt2565;
				Static126.anInt2857 = 2;
				Static38.anInt929 = 0;
				Static124.anInt2729 = Static15.anInt442;
				Static128.aClass2_Sub10_Sub1_3.method1533(231);
				Static128.aClass2_Sub10_Sub1_3.method1511(local30);
			}
		}
		@Pc(373) boolean local373;
		if (local20 == 40) {
			local373 = Static48.method794(2, 0, false, 0, local16, 0, local12, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			if (!local373) {
				Static48.method794(2, 1, false, 0, local16, 0, local12, 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			}
			Static124.anInt2729 = Static15.anInt442;
			Static75.anInt1601 = Static120.anInt2565;
			Static38.anInt929 = 0;
			Static126.anInt2857 = 2;
			Static128.aClass2_Sub10_Sub1_3.method1533(124);
			Static128.aClass2_Sub10_Sub1_3.method1482(local30);
			Static128.aClass2_Sub10_Sub1_3.method1511(local16 + Static62.anInt1413);
			Static128.aClass2_Sub10_Sub1_3.method1485(Static107.anInt2343 + local12);
		}
		if (local20 == 27) {
			local373 = Static48.method794(2, 0, false, 0, local16, 0, local12, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			if (!local373) {
				Static48.method794(2, 1, false, 0, local16, 0, local12, 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			}
			Static38.anInt929 = 0;
			Static124.anInt2729 = Static15.anInt442;
			Static75.anInt1601 = Static120.anInt2565;
			Static126.anInt2857 = 2;
			Static128.aClass2_Sub10_Sub1_3.method1533(24);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static62.anInt1413 + local16);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static107.anInt2343 + local12);
		}
		@Pc(510) Class2_Sub2_Sub2_Sub1_Sub1 local510;
		if (local20 == 9) {
			local510 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local30];
			if (local510 != null) {
				Static48.method794(2, 1, false, 0, local510.anIntArray393[0], 0, local510.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static126.anInt2857 = 2;
				Static124.anInt2729 = Static15.anInt442;
				Static75.anInt1601 = Static120.anInt2565;
				Static38.anInt929 = 0;
				Static128.aClass2_Sub10_Sub1_3.method1533(235);
				Static128.aClass2_Sub10_Sub1_3.method1511(Static45.anInt1031);
				Static128.aClass2_Sub10_Sub1_3.method1511(Static47.anInt1083);
				Static128.aClass2_Sub10_Sub1_3.method1492(Static78.anInt1699);
				Static128.aClass2_Sub10_Sub1_3.method1482(local30);
			}
		}
		if (local20 == 16) {
			local241 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local30];
			if (local241 != null) {
				Static48.method794(2, 1, false, 0, local241.anIntArray393[0], 0, local241.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static38.anInt929 = 0;
				Static75.anInt1601 = Static120.anInt2565;
				Static124.anInt2729 = Static15.anInt442;
				Static126.anInt2857 = 2;
				Static128.aClass2_Sub10_Sub1_3.method1533(75);
				Static128.aClass2_Sub10_Sub1_3.method1504(local30);
				Static128.aClass2_Sub10_Sub1_3.method1524(Static40.anInt956);
				Static128.aClass2_Sub10_Sub1_3.method1485(Static46.anInt1060);
			}
		}
		if (local20 == 8) {
			Static128.aClass2_Sub10_Sub1_3.method1533(233);
			Static128.aClass2_Sub10_Sub1_3.method1482(local12);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30);
			Static128.aClass2_Sub10_Sub1_3.method1492(local16);
			Static91.anInt1908 = 2;
			Static84.anInt1825 = local16;
			Static38.anInt936 = local12;
			Static68.anInt1494 = 0;
			if (Static90.anInt1905 == local16 >> 16) {
				Static91.anInt1908 = 1;
			}
			if (Static42.anInt982 == local16 >> 16) {
				Static91.anInt1908 = 3;
			}
		}
		if (local20 == 42) {
			Static56.method943(local12, local30, local16);
			Static128.aClass2_Sub10_Sub1_3.method1533(111);
			Static128.aClass2_Sub10_Sub1_3.method1511(local30 >> 14 & 0x7FFF);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static107.anInt2343 + local12);
			Static128.aClass2_Sub10_Sub1_3.method1485(local16 + Static62.anInt1413);
		}
		if (local20 == 38) {
			Static128.aClass2_Sub10_Sub1_3.method1533(80);
			Static128.aClass2_Sub10_Sub1_3.method1482(local30);
			Static128.aClass2_Sub10_Sub1_3.method1504(local12);
			Static128.aClass2_Sub10_Sub1_3.method1492(local16);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static46.anInt1060);
			Static128.aClass2_Sub10_Sub1_3.method1524(Static40.anInt956);
			Static68.anInt1494 = 0;
			Static84.anInt1825 = local16;
			Static38.anInt936 = local12;
			Static91.anInt1908 = 2;
			if (Static90.anInt1905 == local16 >> 16) {
				Static91.anInt1908 = 1;
			}
			if (local16 >> 16 == Static42.anInt982) {
				Static91.anInt1908 = 3;
			}
		}
		if (local20 == 5) {
			local510 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local30];
			if (local510 != null) {
				Static48.method794(2, 1, false, 0, local510.anIntArray393[0], 0, local510.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static126.anInt2857 = 2;
				Static124.anInt2729 = Static15.anInt442;
				Static38.anInt929 = 0;
				Static75.anInt1601 = Static120.anInt2565;
				Static128.aClass2_Sub10_Sub1_3.method1533(126);
				Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			}
		}
		if (local20 == 36) {
			Static128.aClass2_Sub10_Sub1_3.method1533(93);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30);
			Static128.aClass2_Sub10_Sub1_3.method1485(local12);
			Static128.aClass2_Sub10_Sub1_3.method1492(local16);
			Static38.anInt936 = local12;
			Static84.anInt1825 = local16;
			Static91.anInt1908 = 2;
			if (local16 >> 16 == Static90.anInt1905) {
				Static91.anInt1908 = 1;
			}
			if (local16 >> 16 == Static42.anInt982) {
				Static91.anInt1908 = 3;
			}
			Static68.anInt1494 = 0;
		}
		if (local20 == 15) {
			local373 = Static48.method794(2, 0, false, 0, local16, 0, local12, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			if (!local373) {
				Static48.method794(2, 1, false, 0, local16, 0, local12, 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			}
			Static124.anInt2729 = Static15.anInt442;
			Static38.anInt929 = 0;
			Static126.anInt2857 = 2;
			Static75.anInt1601 = Static120.anInt2565;
			Static128.aClass2_Sub10_Sub1_3.method1533(216);
			Static128.aClass2_Sub10_Sub1_3.method1482(local12 + Static107.anInt2343);
			Static128.aClass2_Sub10_Sub1_3.method1511(local30);
			Static128.aClass2_Sub10_Sub1_3.method1482(Static62.anInt1413 + local16);
		}
		if (local20 == 18) {
			Static128.aClass2_Sub10_Sub1_3.method1533(228);
			Static128.aClass2_Sub10_Sub1_3.method1482(local12);
			Static128.aClass2_Sub10_Sub1_3.method1508(local16);
			Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			Static68.anInt1494 = 0;
			Static84.anInt1825 = local16;
			Static38.anInt936 = local12;
			Static91.anInt1908 = 2;
			if (local16 >> 16 == Static90.anInt1905) {
				Static91.anInt1908 = 1;
			}
			if (Static42.anInt982 == local16 >> 16) {
				Static91.anInt1908 = 3;
			}
		}
		if (local20 == 14) {
			Static128.aClass2_Sub10_Sub1_3.method1533(131);
			Static128.aClass2_Sub10_Sub1_3.method1492(Static40.anInt956);
			Static128.aClass2_Sub10_Sub1_3.method1504(local12);
			Static128.aClass2_Sub10_Sub1_3.method1524(local16);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static46.anInt1060);
		}
		@Pc(1075) Class2_Sub2_Sub17 local1075;
		if (local20 == 21) {
			Static128.aClass2_Sub10_Sub1_3.method1533(139);
			Static128.aClass2_Sub10_Sub1_3.method1497(local16);
			local1075 = Static41.method668(local16);
			if (local1075.anIntArrayArray30 != null && local1075.anIntArrayArray30[0][0] == 5) {
				local63 = local1075.anIntArrayArray30[0][1];
				if (local1075.anIntArray405[0] != Static88.anIntArray260[local63]) {
					Static88.anIntArray260[local63] = local1075.anIntArray405[0];
					Static41.method674(local63);
					Static116.aBoolean107 = true;
				}
			}
		}
		if (local20 == 1) {
			Static128.aClass2_Sub10_Sub1_3.method1533(238);
			Static128.aClass2_Sub10_Sub1_3.method1497(local16);
			Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			Static128.aClass2_Sub10_Sub1_3.method1482(local12);
			Static84.anInt1825 = local16;
			Static38.anInt936 = local12;
			Static91.anInt1908 = 2;
			Static68.anInt1494 = 0;
			if (Static90.anInt1905 == local16 >> 16) {
				Static91.anInt1908 = 1;
			}
			if (Static42.anInt982 == local16 >> 16) {
				Static91.anInt1908 = 3;
			}
		}
		if (local20 == 50) {
			local241 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local30];
			if (local241 != null) {
				Static48.method794(2, 1, false, 0, local241.anIntArray393[0], 0, local241.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static126.anInt2857 = 2;
				Static124.anInt2729 = Static15.anInt442;
				Static38.anInt929 = 0;
				Static75.anInt1601 = Static120.anInt2565;
				Static128.aClass2_Sub10_Sub1_3.method1533(50);
				Static128.aClass2_Sub10_Sub1_3.method1482(local30);
			}
		}
		if (local20 == 1005) {
			Static56.method943(local12, local30, local16);
			Static128.aClass2_Sub10_Sub1_3.method1533(89);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30 >> 14 & 0x7FFF);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static107.anInt2343 + local12);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static62.anInt1413 + local16);
		}
		if (local20 == 1002) {
			local1075 = Static41.method668(local16);
			if (local1075 == null || local1075.anIntArray406[local12] < 100000) {
				Static128.aClass2_Sub10_Sub1_3.method1533(210);
				Static128.aClass2_Sub10_Sub1_3.method1482(local30);
			} else {
				Static67.method1024(0, Static97.aClass74_1736, Static91.method1340(new Class74[] { Static56.method940(local1075.anIntArray406[local12]), Static93.aClass74_1328, Static35.method1934(local30).aClass74_1184 }));
			}
			Static91.anInt1908 = 2;
			Static68.anInt1494 = 0;
			if (Static90.anInt1905 == local16 >> 16) {
				Static91.anInt1908 = 1;
			}
			Static38.anInt936 = local12;
			if (Static42.anInt982 == local16 >> 16) {
				Static91.anInt1908 = 3;
			}
			Static84.anInt1825 = local16;
		}
		if (local20 == 24) {
			Static56.method943(local12, local30, local16);
			Static128.aClass2_Sub10_Sub1_3.method1533(115);
			Static128.aClass2_Sub10_Sub1_3.method1504(local16 + Static62.anInt1413);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static107.anInt2343 + local12);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30 >> 14 & 0x7FFF);
		}
		if (local20 == 29) {
			Static21.method456();
			Static116.aBoolean107 = true;
			Static78.anInt1699 = local16;
			Static40.anInt960 = 1;
			Static45.anInt1031 = local30;
			Static47.anInt1083 = local12;
			Static121.aClass74_1619 = Static91.method1340(new Class74[] { Static55.aClass74_432, Static35.method1934(local30).aClass74_1184, Static42.aClass74_702 });
			if (Static121.aClass74_1619 == null) {
				Static121.aClass74_1619 = Static75.aClass74_1112;
			}
			return;
		}
		if (local20 == 57) {
			Static128.aClass2_Sub10_Sub1_3.method1533(6);
			Static128.aClass2_Sub10_Sub1_3.method1497(local16);
			Static128.aClass2_Sub10_Sub1_3.method1482(local12);
			Static128.aClass2_Sub10_Sub1_3.method1511(local30);
			Static38.anInt936 = local12;
			Static68.anInt1494 = 0;
			Static84.anInt1825 = local16;
			Static91.anInt1908 = 2;
			if (local16 >> 16 == Static90.anInt1905) {
				Static91.anInt1908 = 1;
			}
			if (local16 >> 16 == Static42.anInt982) {
				Static91.anInt1908 = 3;
			}
		}
		if (local20 == 6) {
			local373 = Static48.method794(2, 0, false, 0, local16, 0, local12, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			if (!local373) {
				Static48.method794(2, 1, false, 0, local16, 0, local12, 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			}
			Static38.anInt929 = 0;
			Static126.anInt2857 = 2;
			Static75.anInt1601 = Static120.anInt2565;
			Static124.anInt2729 = Static15.anInt442;
			Static128.aClass2_Sub10_Sub1_3.method1533(94);
			Static128.aClass2_Sub10_Sub1_3.method1524(Static78.anInt1699);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static47.anInt1083);
			Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			Static128.aClass2_Sub10_Sub1_3.method1511(local16 + Static62.anInt1413);
			Static128.aClass2_Sub10_Sub1_3.method1511(local12 + Static107.anInt2343);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static45.anInt1031);
		}
		if (local20 == 17) {
			Static128.aClass2_Sub10_Sub1_3.method1533(196);
			Static128.aClass2_Sub10_Sub1_3.method1508(local16);
			Static128.aClass2_Sub10_Sub1_3.method1511(local12);
			Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			Static38.anInt936 = local12;
			Static84.anInt1825 = local16;
			Static91.anInt1908 = 2;
			Static68.anInt1494 = 0;
			if (Static90.anInt1905 == local16 >> 16) {
				Static91.anInt1908 = 1;
			}
			if (local16 >> 16 == Static42.anInt982) {
				Static91.anInt1908 = 3;
			}
		}
		if (local20 == 43) {
			local510 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local30];
			if (local510 != null) {
				Static48.method794(2, 1, false, 0, local510.anIntArray393[0], 0, local510.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static75.anInt1601 = Static120.anInt2565;
				Static126.anInt2857 = 2;
				Static38.anInt929 = 0;
				Static124.anInt2729 = Static15.anInt442;
				Static128.aClass2_Sub10_Sub1_3.method1533(123);
				Static128.aClass2_Sub10_Sub1_3.method1508(Static40.anInt956);
				Static128.aClass2_Sub10_Sub1_3.method1504(Static46.anInt1060);
				Static128.aClass2_Sub10_Sub1_3.method1482(local30);
			}
		}
		if (local20 == 12) {
			local510 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local30];
			if (local510 != null) {
				Static48.method794(2, 1, false, 0, local510.anIntArray393[0], 0, local510.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static124.anInt2729 = Static15.anInt442;
				Static38.anInt929 = 0;
				Static75.anInt1601 = Static120.anInt2565;
				Static126.anInt2857 = 2;
				Static128.aClass2_Sub10_Sub1_3.method1533(4);
				Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			}
		}
		if (local20 == 58) {
			Static80.method1255();
		}
		@Pc(1790) long local1790;
		if (local20 == 13 || local20 == 56 || local20 == 25 || local20 == 41) {
			local58 = Static92.aClass74Array14[arg0];
			local63 = local58.method1722(Static42.aClass74_702);
			if (local63 != -1) {
				local1790 = local58.method1697(local63 + 5).method1718().method1696();
				if (local20 == 13) {
					method520(local1790);
				}
				if (local20 == 56) {
					Static42.method675(local1790);
				}
				if (local20 == 25) {
					Static71.method1073(local1790);
				}
				if (local20 == 41) {
					Static67.method1030(local1790);
				}
			}
		}
		if (local20 == 28) {
			Static56.method943(local12, local30, local16);
			Static128.aClass2_Sub10_Sub1_3.method1533(138);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30 >> 14 & 0x7FFF);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static107.anInt2343 + local12);
			Static128.aClass2_Sub10_Sub1_3.method1504(local16 + Static62.anInt1413);
		}
		if (local20 == 49) {
			local1075 = Static41.method668(local16);
			@Pc(1866) boolean local1866 = true;
			if (local1075.anInt2796 > 0) {
				local1866 = Static49.method798(local1075);
			}
			if (local1866) {
				Static128.aClass2_Sub10_Sub1_3.method1533(139);
				Static128.aClass2_Sub10_Sub1_3.method1497(local16);
			}
		}
		if (local20 == 23) {
			local241 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local30];
			if (local241 != null) {
				Static48.method794(2, 1, false, 0, local241.anIntArray393[0], 0, local241.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static75.anInt1601 = Static120.anInt2565;
				Static124.anInt2729 = Static15.anInt442;
				Static126.anInt2857 = 2;
				Static38.anInt929 = 0;
				Static128.aClass2_Sub10_Sub1_3.method1533(97);
				Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			}
		}
		if (local20 == 46 && Static88.anInt1857 == -1) {
			Static57.method952(local16, local12);
			Static88.anInt1857 = local16;
			Static39.anInt952 = local12;
		}
		if (local20 == 26) {
			Static46.method746(local30, local12, local16);
		}
		if (local20 == 52) {
			Static128.aClass2_Sub10_Sub1_3.method1533(218);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static47.anInt1083);
			Static128.aClass2_Sub10_Sub1_3.method1508(local16);
			Static128.aClass2_Sub10_Sub1_3.method1508(Static78.anInt1699);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static45.anInt1031);
			Static128.aClass2_Sub10_Sub1_3.method1504(local12);
			Static68.anInt1494 = 0;
			Static91.anInt1908 = 2;
			if (local16 >> 16 == Static90.anInt1905) {
				Static91.anInt1908 = 1;
			}
			if (local16 >> 16 == Static42.anInt982) {
				Static91.anInt1908 = 3;
			}
			Static38.anInt936 = local12;
			Static84.anInt1825 = local16;
		}
		if (local20 == 7) {
			local510 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local30];
			if (local510 != null) {
				Static48.method794(2, 1, false, 0, local510.anIntArray393[0], 0, local510.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static124.anInt2729 = Static15.anInt442;
				Static38.anInt929 = 0;
				Static126.anInt2857 = 2;
				Static75.anInt1601 = Static120.anInt2565;
				Static128.aClass2_Sub10_Sub1_3.method1533(197);
				Static128.aClass2_Sub10_Sub1_3.method1504(local30);
			}
		}
		if (local20 == 33 && Static56.method943(local12, local30, local16)) {
			Static128.aClass2_Sub10_Sub1_3.method1533(36);
			Static128.aClass2_Sub10_Sub1_3.method1492(Static40.anInt956);
			Static128.aClass2_Sub10_Sub1_3.method1482(local30 >> 14 & 0x7FFF);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static107.anInt2343 + local12);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static46.anInt1060);
			Static128.aClass2_Sub10_Sub1_3.method1511(local16 + Static62.anInt1413);
		}
		if (local20 == 22) {
			local1075 = Static23.method478(local12, local16);
			if (local1075 != null) {
				Static21.method456();
				Static90.method1333(local12, local16, Static89.method1326(Static19.method429(local1075)));
				Static116.aBoolean107 = true;
				Static40.anInt960 = 0;
				Static25.aClass74_526 = Static34.method601(local1075);
				if (Static25.aClass74_526 == null) {
					Static25.aClass74_526 = Static56.aClass74_958;
				}
				if (local1075.aBoolean125) {
					Static4.aClass74_41 = Static91.method1340(new Class74[] { local1075.aClass74_1689, Static42.aClass74_702 });
				} else {
					Static4.aClass74_41 = Static91.method1340(new Class74[] { Static70.aClass74_1086, local1075.aClass74_1691, Static42.aClass74_702 });
				}
				if (Static65.anInt1451 == 16 && !local1075.aBoolean125) {
					Static8.aBoolean11 = true;
					Static42.anInt980 = 3;
					Static116.aBoolean107 = true;
				}
			}
			return;
		}
		if (local20 == 35) {
			if (Static109.aBoolean103) {
				Static84.aClass69_1.method1628(Static117.anInt2529, local12 - 4, local16 + -4);
			} else {
				Static84.aClass69_1.method1628(Static117.anInt2529, Static120.anInt2565 - 4, Static15.anInt442 + -4);
			}
		}
		if (local20 == 34) {
			Static128.aClass2_Sub10_Sub1_3.method1533(84);
			Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			Static128.aClass2_Sub10_Sub1_3.method1524(local16);
			Static128.aClass2_Sub10_Sub1_3.method1511(local12);
			Static91.anInt1908 = 2;
			Static38.anInt936 = local12;
			if (Static90.anInt1905 == local16 >> 16) {
				Static91.anInt1908 = 1;
			}
			Static84.anInt1825 = local16;
			Static68.anInt1494 = 0;
			if (Static42.anInt982 == local16 >> 16) {
				Static91.anInt1908 = 3;
			}
		}
		if (local20 == 19) {
			Static128.aClass2_Sub10_Sub1_3.method1533(148);
			Static128.aClass2_Sub10_Sub1_3.method1482(local30);
			Static128.aClass2_Sub10_Sub1_3.method1508(local16);
			Static128.aClass2_Sub10_Sub1_3.method1511(local12);
			Static84.anInt1825 = local16;
			Static68.anInt1494 = 0;
			Static91.anInt1908 = 2;
			Static38.anInt936 = local12;
			if (Static90.anInt1905 == local16 >> 16) {
				Static91.anInt1908 = 1;
			}
			if (local16 >> 16 == Static42.anInt982) {
				Static91.anInt1908 = 3;
			}
		}
		if (local20 == 45) {
			local58 = Static92.aClass74Array14[arg0];
			local63 = local58.method1722(Static42.aClass74_702);
			if (local63 != -1) {
				if (Static90.anInt1905 == -1) {
					Static80.method1255();
					if (Static90.anInt1903 != -1) {
						Static97.aClass74_1722 = local58.method1697(local63 + 5).method1718();
						Static7.anInt2699 = Static90.anInt1905 = Static90.anInt1903;
						Static105.aBoolean98 = false;
					}
				} else {
					Static67.method1024(0, Static97.aClass74_1736, Static82.aClass74_1231);
					if (Static47.aClass74_805 != null) {
						Static67.method1024(0, Static97.aClass74_1736, Static47.aClass74_805);
					}
				}
			}
		}
		if (local20 == 48) {
			local373 = Static48.method794(2, 0, false, 0, local16, 0, local12, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			if (!local373) {
				Static48.method794(2, 1, false, 0, local16, 0, local12, 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			}
			Static75.anInt1601 = Static120.anInt2565;
			Static124.anInt2729 = Static15.anInt442;
			Static38.anInt929 = 0;
			Static126.anInt2857 = 2;
			Static128.aClass2_Sub10_Sub1_3.method1533(90);
			Static128.aClass2_Sub10_Sub1_3.method1497(Static40.anInt956);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static46.anInt1060);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30);
			Static128.aClass2_Sub10_Sub1_3.method1482(local12 + Static107.anInt2343);
			Static128.aClass2_Sub10_Sub1_3.method1504(local16 + Static62.anInt1413);
		}
		if (local20 == 44) {
			Static128.aClass2_Sub10_Sub1_3.method1533(139);
			Static128.aClass2_Sub10_Sub1_3.method1497(local16);
			local1075 = Static41.method668(local16);
			if (local1075.anIntArrayArray30 != null && local1075.anIntArrayArray30[0][0] == 5) {
				local63 = local1075.anIntArrayArray30[0][1];
				Static88.anIntArray260[local63] = 1 - Static88.anIntArray260[local63];
				Static41.method674(local63);
				Static116.aBoolean107 = true;
			}
		}
		if (local20 == 32) {
			local241 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local30];
			if (local241 != null) {
				Static48.method794(2, 1, false, 0, local241.anIntArray393[0], 0, local241.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static124.anInt2729 = Static15.anInt442;
				Static75.anInt1601 = Static120.anInt2565;
				Static126.anInt2857 = 2;
				Static38.anInt929 = 0;
				Static128.aClass2_Sub10_Sub1_3.method1533(45);
				Static128.aClass2_Sub10_Sub1_3.method1504(Static45.anInt1031);
				Static128.aClass2_Sub10_Sub1_3.method1482(Static47.anInt1083);
				Static128.aClass2_Sub10_Sub1_3.method1508(Static78.anInt1699);
				Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			}
		}
		if (local20 == 39) {
			local510 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local30];
			if (local510 != null) {
				Static48.method794(2, 1, false, 0, local510.anIntArray393[0], 0, local510.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static38.anInt929 = 0;
				Static126.anInt2857 = 2;
				Static124.anInt2729 = Static15.anInt442;
				Static75.anInt1601 = Static120.anInt2565;
				Static128.aClass2_Sub10_Sub1_3.method1533(81);
				Static128.aClass2_Sub10_Sub1_3.method1482(local30);
			}
		}
		if (local20 == 1006) {
			Static126.anInt2857 = 2;
			Static124.anInt2729 = Static15.anInt442;
			Static38.anInt929 = 0;
			Static75.anInt1601 = Static120.anInt2565;
			local510 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local30];
			if (local510 != null) {
				@Pc(2684) Class2_Sub2_Sub9 local2684 = local510.aClass2_Sub2_Sub9_1;
				if (local2684.anIntArray130 != null) {
					local2684 = local2684.method767();
				}
				if (local2684 != null) {
					Static128.aClass2_Sub10_Sub1_3.method1533(254);
					Static128.aClass2_Sub10_Sub1_3.method1485(local2684.anInt1091);
				}
			}
		}
		if (local20 == 55) {
			Static126.method1922(Static83.anInt1804);
			Static83.anInt1804 = -1;
			Static55.aBoolean16 = true;
		}
		if (local20 == 4) {
			local510 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local30];
			if (local510 != null) {
				Static48.method794(2, 1, false, 0, local510.anIntArray393[0], 0, local510.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static75.anInt1601 = Static120.anInt2565;
				Static126.anInt2857 = 2;
				Static38.anInt929 = 0;
				Static124.anInt2729 = Static15.anInt442;
				Static128.aClass2_Sub10_Sub1_3.method1533(143);
				Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			}
		}
		if (local20 == 11) {
			local373 = Static48.method794(2, 0, false, 0, local16, 0, local12, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			if (!local373) {
				Static48.method794(2, 1, false, 0, local16, 0, local12, 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			}
			Static124.anInt2729 = Static15.anInt442;
			Static38.anInt929 = 0;
			Static126.anInt2857 = 2;
			Static75.anInt1601 = Static120.anInt2565;
			Static128.aClass2_Sub10_Sub1_3.method1533(200);
			Static128.aClass2_Sub10_Sub1_3.method1485(Static107.anInt2343 + local12);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30);
			Static128.aClass2_Sub10_Sub1_3.method1504(Static62.anInt1413 + local16);
		}
		if (local20 == 20) {
			local241 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local30];
			if (local241 != null) {
				Static48.method794(2, 1, false, 0, local241.anIntArray393[0], 0, local241.anIntArray394[0], 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
				Static75.anInt1601 = Static120.anInt2565;
				Static126.anInt2857 = 2;
				Static38.anInt929 = 0;
				Static124.anInt2729 = Static15.anInt442;
				Static128.aClass2_Sub10_Sub1_3.method1533(103);
				Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			}
		}
		if (local20 == 47) {
			Static128.aClass2_Sub10_Sub1_3.method1533(95);
			Static128.aClass2_Sub10_Sub1_3.method1482(local12);
			Static128.aClass2_Sub10_Sub1_3.method1508(local16);
			Static128.aClass2_Sub10_Sub1_3.method1485(local30);
			Static38.anInt936 = local12;
			Static84.anInt1825 = local16;
			Static91.anInt1908 = 2;
			Static68.anInt1494 = 0;
			if (local16 >> 16 == Static90.anInt1905) {
				Static91.anInt1908 = 1;
			}
			if (Static42.anInt982 == local16 >> 16) {
				Static91.anInt1908 = 3;
			}
		}
		if (local20 == 3) {
			local58 = Static92.aClass74Array14[arg0];
			local63 = local58.method1722(Static42.aClass74_702);
			if (local63 != -1) {
				local1790 = local58.method1697(local63 + 5).method1718().method1696();
				local86 = -1;
				for (@Pc(2998) int local2998 = 0; local2998 < Static65.anInt1450; local2998++) {
					if (local1790 == Static6.aLongArray2[local2998]) {
						local86 = local2998;
						break;
					}
				}
				if (local86 != -1 && Static78.anIntArray251[local86] > 0) {
					Static36.anInt869 = 0;
					Static55.aBoolean16 = true;
					Static121.anInt2602 = 3;
					aBoolean25 = true;
					Static97.aClass74_1733 = Static97.aClass74_1736;
					Static32.aLong34 = Static6.aLongArray2[local86];
					Static97.aClass74_1726 = Static91.method1340(new Class74[] { Static40.aClass74_690, Static19.aClass74Array2[local86] });
				}
			}
		}
		if (local20 == 37) {
			local373 = Static48.method794(2, 0, false, 0, local16, 0, local12, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			if (!local373) {
				Static48.method794(2, 1, false, 0, local16, 0, local12, 0, 1, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			}
			Static38.anInt929 = 0;
			Static126.anInt2857 = 2;
			Static124.anInt2729 = Static15.anInt442;
			Static75.anInt1601 = Static120.anInt2565;
			Static128.aClass2_Sub10_Sub1_3.method1533(213);
			Static128.aClass2_Sub10_Sub1_3.method1482(local30);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static107.anInt2343 + local12);
			Static128.aClass2_Sub10_Sub1_3.method1485(Static62.anInt1413 + local16);
		}
		if (local20 == 1001) {
			Static38.anInt929 = 0;
			Static124.anInt2729 = Static15.anInt442;
			Static126.anInt2857 = 2;
			Static75.anInt1601 = Static120.anInt2565;
			Static128.aClass2_Sub10_Sub1_3.method1533(161);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30 >> 14 & 0x7FFF);
		}
		if (local20 == 10 && Static56.method943(local12, local30, local16)) {
			Static128.aClass2_Sub10_Sub1_3.method1533(209);
			Static128.aClass2_Sub10_Sub1_3.method1482(local12 + Static107.anInt2343);
			Static128.aClass2_Sub10_Sub1_3.method1511(Static45.anInt1031);
			Static128.aClass2_Sub10_Sub1_3.method1492(Static78.anInt1699);
			Static128.aClass2_Sub10_Sub1_3.method1485(Static47.anInt1083);
			Static128.aClass2_Sub10_Sub1_3.method1482(local16 + Static62.anInt1413);
			Static128.aClass2_Sub10_Sub1_3.method1504(local30 >> 14 & 0x7FFF);
		}
		if (local20 == 1003) {
			Static126.anInt2857 = 2;
			Static75.anInt1601 = Static120.anInt2565;
			Static38.anInt929 = 0;
			Static124.anInt2729 = Static15.anInt442;
			Static128.aClass2_Sub10_Sub1_3.method1533(210);
			Static128.aClass2_Sub10_Sub1_3.method1482(local30);
		}
		if (local20 == 31) {
			Static128.aClass2_Sub10_Sub1_3.method1533(219);
			Static128.aClass2_Sub10_Sub1_3.method1511(local30);
			Static128.aClass2_Sub10_Sub1_3.method1504(local12);
			Static128.aClass2_Sub10_Sub1_3.method1508(local16);
			Static38.anInt936 = local12;
			Static84.anInt1825 = local16;
			Static68.anInt1494 = 0;
			Static91.anInt1908 = 2;
			if (Static90.anInt1905 == local16 >> 16) {
				Static91.anInt1908 = 1;
			}
			if (local16 >> 16 == Static42.anInt982) {
				Static91.anInt1908 = 3;
			}
		}
		if (Static40.anInt960 != 0) {
			Static116.aBoolean107 = true;
			Static40.anInt960 = 0;
		}
		if (Static6.aBoolean7) {
			Static21.method456();
			Static116.aBoolean107 = true;
		}
	}
}
