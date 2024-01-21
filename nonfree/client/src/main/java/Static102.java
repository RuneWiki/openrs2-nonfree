import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array61;

	@OriginalMember(owner = "client!s", name = "rb", descriptor = "J")
	public static long aLong108;

	@OriginalMember(owner = "client!s", name = "tb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1422 = Static106.method1849("scroll:");

	@OriginalMember(owner = "client!s", name = "X", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1417 = aClass66_1422;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1418 = aClass66_1422;

	@OriginalMember(owner = "client!s", name = "ib", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1419 = Static106.method1849("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!s", name = "kb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1420 = Static106.method1849("Cancel");

	@OriginalMember(owner = "client!s", name = "nb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1421 = aClass66_1420;

	@OriginalMember(owner = "client!s", name = "sb", descriptor = "I")
	public static int anInt2533 = 0;

	@OriginalMember(owner = "client!s", name = "vb", descriptor = "I")
	public static int anInt2535 = 1;

	@OriginalMember(owner = "client!s", name = "xb", descriptor = "[I")
	public static int[] anIntArray427 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!s", name = "yb", descriptor = "Lclient!rb;")
	public static Class60 aClass60_79 = new Class60(50);

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)V")
	public static void method1786() {
		Static10.aBoolean14 = false;
		Static87.aBoolean96 = false;
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Z")
	public static boolean method1787() {
		if (Static49.aClass34_3 == null) {
			return false;
		}
		@Pc(133) int local133;
		try {
			@Pc(13) int local13 = Static49.aClass34_3.method1103();
			if (local13 == 0) {
				return false;
			}
			if (Static59.anInt1826 == -1) {
				local13--;
				Static49.aClass34_3.method1102(0, 1, Static133.aClass1_Sub12_Sub1_3.aByteArray12);
				Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
				Static59.anInt1826 = Static133.aClass1_Sub12_Sub1_3.method1225();
				Static105.anInt2602 = Static45.anIntArray216[Static59.anInt1826];
			}
			if (Static105.anInt2602 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static49.aClass34_3.method1102(0, 1, Static133.aClass1_Sub12_Sub1_3.aByteArray12);
				local13--;
				Static105.anInt2602 = Static133.aClass1_Sub12_Sub1_3.aByteArray12[0] & 0xFF;
			}
			if (Static105.anInt2602 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static49.aClass34_3.method1102(0, 2, Static133.aClass1_Sub12_Sub1_3.aByteArray12);
				Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
				Static105.anInt2602 = Static133.aClass1_Sub12_Sub1_3.method1176();
				local13 -= 2;
			}
			if (local13 < Static105.anInt2602) {
				return false;
			}
			Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
			Static49.aClass34_3.method1102(0, Static105.anInt2602, Static133.aClass1_Sub12_Sub1_3.aByteArray12);
			Static40.anInt1278 = 0;
			Static1.anInt74 = Static81.anInt2190;
			Static81.anInt2190 = Static1.anInt77;
			Static1.anInt77 = Static59.anInt1826;
			@Pc(176) int local176;
			@Pc(258) int local258;
			@Pc(264) int local264;
			@Pc(129) int local129;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(218) Class1_Sub22 local218;
			@Pc(172) int local172;
			@Pc(262) int local262;
			@Pc(274) long local274;
			if (Static59.anInt1826 == 253) {
				local129 = Static133.aClass1_Sub12_Sub1_3.anInt1694 + Static105.anInt2602;
				local133 = Static133.aClass1_Sub12_Sub1_3.method1176();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1176();
				if (Static22.anInt637 != local133) {
					Static22.anInt637 = local133;
					Static127.method2029(Static22.anInt637);
					Static81.method1501(Static22.anInt637);
					for (local150 = 0; local150 < 100; local150++) {
						Static128.aBooleanArray18[local150] = true;
					}
				}
				while (local137-- > 0) {
					local150 = Static133.aClass1_Sub12_Sub1_3.method1210();
					local172 = Static133.aClass1_Sub12_Sub1_3.method1176();
					local176 = Static133.aClass1_Sub12_Sub1_3.method1190();
					@Pc(183) Class1_Sub22 local183 = (Class1_Sub22) Static52.aClass65_22.method1802((long) local150);
					if (local183 != null && local183.anInt2781 != local172) {
						Static36.method651(local183, true);
						local183 = null;
					}
					if (local183 == null) {
						local183 = Static4.method138(local150, local172, local176);
					}
					local183.aBoolean117 = true;
				}
				for (local218 = (Class1_Sub22) Static52.aClass65_22.method1803(); local218 != null; local218 = (Class1_Sub22) Static52.aClass65_22.method1801()) {
					if (local218.aBoolean117) {
						local218.aBoolean117 = false;
					} else {
						Static36.method651(local218, true);
					}
				}
				Static127.aClass65_44 = new Class65(512);
				while (local129 > Static133.aClass1_Sub12_Sub1_3.anInt1694) {
					local172 = Static133.aClass1_Sub12_Sub1_3.method1210();
					local176 = Static133.aClass1_Sub12_Sub1_3.method1176();
					local258 = Static133.aClass1_Sub12_Sub1_3.method1176();
					local262 = Static133.aClass1_Sub12_Sub1_3.method1210();
					for (local264 = local176; local264 <= local258; local264++) {
						local274 = (long) local264 + ((long) local172 << 32);
						Static127.aClass65_44.method1797(new Class1_Sub19(local262), local274);
					}
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 150) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1222();
				Static22.anInt637 = local129;
				Static127.method2029(local129);
				Static81.method1501(Static22.anInt637);
				for (local133 = 0; local133 < 100; local133++) {
					Static128.aBooleanArray18[local133] = true;
				}
				Static59.anInt1826 = -1;
				return true;
			}
			@Pc(359) Class1_Sub10 local359;
			if (Static59.anInt1826 == 173) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1210();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1221();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1176();
				if (local137 == 65535) {
					local137 = -1;
				}
				local359 = Static38.method2002(local133);
				@Pc(372) Class1_Sub1_Sub6 local372;
				if (local359.aBoolean54) {
					local359.anInt1399 = local137;
					local359.anInt1390 = local129;
					local372 = Static20.method496(local137);
					local359.anInt1382 = local372.anInt1574;
					local359.anInt1368 = local372.anInt1562;
					local359.anInt1355 = local372.anInt1541;
					local359.anInt1402 = local372.anInt1551;
					local359.anInt1374 = local372.anInt1568;
					if (local359.anInt1367 > 0) {
						local359.anInt1374 = local359.anInt1374 * 32 / local359.anInt1367;
					}
					local359.anInt1370 = local372.anInt1534;
					Static70.method537(local359);
				} else if (local137 == -1) {
					local359.anInt1376 = 0;
					Static59.anInt1826 = -1;
					return true;
				} else {
					local372 = Static20.method496(local137);
					local359.anInt1374 = local372.anInt1568 * 100 / local129;
					local359.anInt1402 = local372.anInt1551;
					local359.anInt1355 = local372.anInt1541;
					local359.anInt1337 = local137;
					local359.anInt1376 = 4;
					Static70.method537(local359);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			@Pc(485) Class1_Sub10 local485;
			if (Static59.anInt1826 == 141) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1210();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1176();
				if (local129 < -70000) {
					local133 += 32768;
				}
				if (local129 >= 0) {
					local485 = Static38.method2002(local129);
				} else {
					local485 = null;
				}
				while (Static105.anInt2602 > Static133.aClass1_Sub12_Sub1_3.anInt1694) {
					local150 = Static133.aClass1_Sub12_Sub1_3.method1180();
					local176 = 0;
					local172 = Static133.aClass1_Sub12_Sub1_3.method1176();
					if (local172 != 0) {
						local176 = Static133.aClass1_Sub12_Sub1_3.method1190();
						if (local176 == 255) {
							local176 = Static133.aClass1_Sub12_Sub1_3.method1210();
						}
					}
					if (local485 != null && local150 >= 0 && local150 < local485.anIntArray201.length) {
						local485.anIntArray201[local150] = local172;
						local485.anIntArray206[local150] = local176;
					}
					Static126.method2021(local176, local172 - 1, local150, local133);
				}
				if (local485 != null) {
					Static70.method537(local485);
				}
				Static3.method76();
				Static80.anIntArray359[Static116.anInt2727++ & 0x1F] = local133 & 0x7FFF;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 158) {
				if (Static22.anInt637 != -1) {
					Static99.method905(0, Static22.anInt637);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 114) {
				for (local129 = 0; local129 < Static103.anIntArray429.length; local129++) {
					if (Static103.anIntArray429[local129] != Static12.anIntArray72[local129]) {
						Static103.anIntArray429[local129] = Static12.anIntArray72[local129];
						Static57.method1262(local129);
						Static119.anIntArray480[Static52.anInt1595++ & 0x1F] = local129;
					}
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 187) {
				for (local129 = 0; local129 < Static34.anInt104; local129++) {
					@Pc(644) Class1_Sub1_Sub7 local644 = Static66.method441(local129);
					if (local644 != null && local644.anInt1815 == 0) {
						Static12.anIntArray72[local129] = 0;
						Static103.anIntArray429[local129] = 0;
					}
				}
				Static3.method76();
				Static59.anInt1826 = -1;
				Static52.anInt1595 += 32;
				return true;
			}
			if (Static59.anInt1826 == 109) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1183();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1189();
				local485 = Static38.method2002(local133);
				if (local485.anInt1376 != 1 || local485.anInt1337 != local129) {
					local485.anInt1337 = local129;
					local485.anInt1376 = 1;
					Static70.method537(local485);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 221) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1206();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1209();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1173();
				local359 = Static38.method2002(local133);
				local176 = local129 + local359.anInt1347;
				local172 = local359.anInt1339 + local137;
				if (local172 != local359.anInt1344 || local176 != local359.anInt1388) {
					local359.anInt1344 = local172;
					local359.anInt1388 = local176;
					Static70.method537(local359);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 8) {
				Static14.anInt475 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static103.anInt2539 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static100.anInt2501 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 154) {
				Static67.anInt1683 = Static133.aClass1_Sub12_Sub1_3.method1202();
				Static131.anInt2695 = Static133.aClass1_Sub12_Sub1_3.method1202();
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 178) {
				Static109.aBoolean111 = true;
				Static50.anInt1533 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static108.anInt177 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static117.anInt2742 = Static133.aClass1_Sub12_Sub1_3.method1176();
				Static131.anInt2698 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static103.anInt2545 = Static133.aClass1_Sub12_Sub1_3.method1190();
				if (Static103.anInt2545 >= 100) {
					local129 = Static50.anInt1533 * 128 + 64;
					local133 = Static108.anInt177 * 128 + 64;
					local137 = Static77.method1476(local133, Static22.anInt635, local129) - Static117.anInt2742;
					local150 = local129 - Static122.anInt2830;
					local176 = local133 - Static1.anInt70;
					local172 = local137 - Static51.anInt1580;
					local258 = (int) Math.sqrt((double) (local176 * local176 + local150 * local150));
					Static131.anInt2696 = (int) (Math.atan2((double) local172, (double) local258) * 325.949D) & 0x7FF;
					Static1.anInt76 = (int) (-325.949D * Math.atan2((double) local150, (double) local176)) & 0x7FF;
					if (Static131.anInt2696 < 128) {
						Static131.anInt2696 = 128;
					}
					if (Static131.anInt2696 > 383) {
						Static131.anInt2696 = 383;
					}
				}
				Static59.anInt1826 = -1;
				return true;
			}
			@Pc(931) Class66 local931;
			if (Static59.anInt1826 == 216) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1189();
				local931 = Static133.aClass1_Sub12_Sub1_3.method1214();
				local485 = Static38.method2002(local129);
				if (!local931.method1824(local485.aClass66_732)) {
					local485.aClass66_732 = local931;
					Static70.method537(local485);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			@Pc(980) long local980;
			@Pc(1086) int local1086;
			@Pc(960) long local960;
			@Pc(1079) int local1079;
			if (Static59.anInt1826 == 82) {
				anInt2533 = Static112.anInt2674;
				local960 = Static133.aClass1_Sub12_Sub1_3.method1219();
				if (local960 == 0L) {
					Static3.aClass1_Sub11Array1 = null;
					Static93.aClass66_1333 = null;
					Static81.anInt2188 = 0;
					Static59.anInt1826 = -1;
					Static117.aClass66_1571 = null;
					return true;
				}
				local980 = Static133.aClass1_Sub12_Sub1_3.method1219();
				Static93.aClass66_1333 = Static106.method1850(local980);
				Static117.aClass66_1571 = Static106.method1850(local960);
				Static71.aByte5 = Static133.aClass1_Sub12_Sub1_3.method1211();
				local172 = Static133.aClass1_Sub12_Sub1_3.method1190();
				if (local172 == 255) {
					Static59.anInt1826 = -1;
					return true;
				}
				Static81.anInt2188 = local172;
				@Pc(1010) Class1_Sub11[] local1010 = new Class1_Sub11[100];
				for (local258 = 0; local258 < Static81.anInt2188; local258++) {
					local1010[local258] = new Class1_Sub11();
					local1010[local258].aLong130 = Static133.aClass1_Sub12_Sub1_3.method1219();
					local1010[local258].aClass66_826 = Static106.method1850(local1010[local258].aLong130);
					local1010[local258].anInt1508 = Static133.aClass1_Sub12_Sub1_3.method1176();
					local1010[local258].aByte3 = Static133.aClass1_Sub12_Sub1_3.method1211();
					if (aLong108 == local1010[local258].aLong130) {
						Static132.aByte8 = local1010[local258].aByte3;
					}
				}
				local1079 = Static81.anInt2188;
				while (local1079 > 0) {
					local1079--;
					@Pc(1084) boolean local1084 = true;
					for (local1086 = 0; local1086 < local1079; local1086++) {
						if (local1010[local1086].aClass66_826.method1822(local1010[local1086 + 1].aClass66_826) > 0) {
							local1084 = false;
							@Pc(1110) Class1_Sub11 local1110 = local1010[local1086];
							local1010[local1086] = local1010[local1086 + 1];
							local1010[local1086 + 1] = local1110;
						}
					}
					if (local1084) {
						break;
					}
				}
				Static3.aClass1_Sub11Array1 = local1010;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 60) {
				Static3.method76();
				Static1.anInt79 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static59.anInt1826 = -1;
				Static112.anInt2669 = Static112.anInt2674;
				return true;
			}
			if (Static59.anInt1826 == 182) {
				Static125.anInt2869 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static59.anInt1826 = -1;
				return true;
			}
			@Pc(1181) Class1_Sub10 local1181;
			if (Static59.anInt1826 == 15) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1210();
				local1181 = Static38.method2002(local129);
				local1181.anInt1376 = 3;
				local1181.anInt1337 = Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass38_1.method1251();
				Static70.method537(local1181);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 110) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1183();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1221();
				local137 = local129 >> 10 & 0x1F;
				local172 = local129 & 0x1F;
				local150 = local129 >> 5 & 0x1F;
				local176 = (local172 << 3) + (local150 << 11) + (local137 << 19);
				@Pc(1242) Class1_Sub10 local1242 = Static38.method2002(local133);
				if (local1242.anInt1331 != local176) {
					local1242.anInt1331 = local176;
					Static70.method537(local1242);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 26) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1176();
				if (local129 == 65535) {
					local129 = -1;
				}
				Static81.method1498(local129);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 192) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1174();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1222();
				if (local133 == 65535) {
					local133 = -1;
				}
				Static128.method2032(local129, local133);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 202) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1210();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1222();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1209();
				if (local133 == 65535) {
					local133 = -1;
				}
				local150 = Static133.aClass1_Sub12_Sub1_3.method1194();
				if (local150 == 65535) {
					local150 = -1;
				}
				for (local172 = local133; local172 <= local150; local172++) {
					@Pc(1353) long local1353 = ((long) local137 << 32) + ((long) local172);
					@Pc(1358) Class1 local1358 = Static127.aClass65_44.method1802(local1353);
					if (local1358 != null) {
						local1358.method2050();
					}
					Static127.aClass65_44.method1797(new Class1_Sub19(local129), local1353);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			@Pc(1392) Class66 local1392;
			@Pc(1399) boolean local1399;
			if (Static59.anInt1826 == 98) {
				local1392 = Static133.aClass1_Sub12_Sub1_3.method1214();
				if (local1392.method1835(Static53.aClass66_916)) {
					local1399 = false;
					local931 = local1392.method1807(0, local1392.method1819(Static75.aClass66_1127));
					local980 = local931.method1806();
					for (local176 = 0; local176 < Static126.anInt2886; local176++) {
						if (Static41.aLongArray4[local176] == local980) {
							local1399 = true;
							break;
						}
					}
					if (!local1399 && Static63.anInt1927 == 0) {
						Static103.method1791(4, local931, Static103.aClass66_1426);
					}
				} else if (local1392.method1835(Static133.aClass66_1740)) {
					local931 = local1392.method1807(0, local1392.method1819(Static75.aClass66_1127));
					local980 = local931.method1806();
					local1399 = false;
					for (local176 = 0; local176 < Static126.anInt2886; local176++) {
						if (Static41.aLongArray4[local176] == local980) {
							local1399 = true;
							break;
						}
					}
					if (!local1399 && Static63.anInt1927 == 0) {
						Static103.method1791(8, local931, Static54.aClass66_921);
					}
				} else if (local1392.method1835(Static126.aClass66_1688)) {
					local931 = local1392.method1807(0, local1392.method1819(Static75.aClass66_1127));
					local1399 = false;
					local980 = local931.method1806();
					for (local176 = 0; local176 < Static126.anInt2886; local176++) {
						if (Static41.aLongArray4[local176] == local980) {
							local1399 = true;
							break;
						}
					}
					if (!local1399 && Static63.anInt1927 == 0) {
						@Pc(1518) Class66 local1518 = local1392.method1807(local1392.method1819(Static75.aClass66_1127) + 1, local1392.method1847() + -9);
						Static103.method1791(8, local931, local1518);
					}
				} else if (local1392.method1835(Static22.aClass66_386)) {
					local1399 = false;
					local931 = local1392.method1807(0, local1392.method1819(Static75.aClass66_1127));
					local980 = local931.method1806();
					for (local176 = 0; local176 < Static126.anInt2886; local176++) {
						if (Static41.aLongArray4[local176] == local980) {
							local1399 = true;
							break;
						}
					}
					if (!local1399 && Static63.anInt1927 == 0) {
						Static103.method1791(10, local931, Static13.aClass66_284);
					}
				} else if (local1392.method1835(Static17.aClass66_345)) {
					local931 = local1392.method1807(0, local1392.method1819(Static17.aClass66_345));
					Static103.method1791(11, Static13.aClass66_284, local931);
				} else if (local1392.method1835(Static122.aClass66_1654)) {
					local931 = local1392.method1807(0, local1392.method1819(Static122.aClass66_1654));
					if (Static63.anInt1927 == 0) {
						Static103.method1791(12, Static13.aClass66_284, local931);
					}
				} else if (local1392.method1835(Static133.aClass66_1741)) {
					local931 = local1392.method1807(0, local1392.method1819(Static133.aClass66_1741));
					if (Static63.anInt1927 == 0) {
						Static103.method1791(13, Static13.aClass66_284, local931);
					}
				} else {
					Static103.method1791(0, Static13.aClass66_284, local1392);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 119) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1210();
				@Pc(1721) Class1_Sub22 local1721 = (Class1_Sub22) Static52.aClass65_22.method1802((long) local129);
				if (local1721 != null) {
					Static36.method651(local1721, true);
				}
				if (Static87.aClass1_Sub10_10 != null) {
					Static70.method537(Static87.aClass1_Sub10_10);
					Static87.aClass1_Sub10_10 = null;
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 68) {
				Static126.anInt2886 = Static105.anInt2602 / 8;
				for (local129 = 0; local129 < Static126.anInt2886; local129++) {
					Static41.aLongArray4[local129] = Static133.aClass1_Sub12_Sub1_3.method1219();
					Static123.aClass66Array22[local129] = Static106.method1850(Static41.aLongArray4[local129]);
				}
				Static59.anInt1826 = -1;
				Static60.anInt1850 = Static112.anInt2674;
				return true;
			}
			if (Static59.anInt1826 == 189) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1210();
				Static2.aClass32_1 = Static120.aClass7_4.method276(local129);
				Static59.anInt1826 = -1;
				return true;
			}
			@Pc(1808) Class66 local1808;
			if (Static59.anInt1826 == 136) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1203();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1202();
				local1808 = Static133.aClass1_Sub12_Sub1_3.method1214();
				if (local129 >= 1 && local129 <= 8) {
					if (local1808.method1843(Static52.aClass66_862)) {
						local1808 = null;
					}
					Static132.aClass66Array24[local129 - 1] = local1808;
					Static24.aBooleanArray4[local129 - 1] = local133 == 0;
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 14) {
				Static67.anInt1683 = Static133.aClass1_Sub12_Sub1_3.method1202();
				Static131.anInt2695 = Static133.aClass1_Sub12_Sub1_3.method1212();
				for (local129 = Static131.anInt2695; local129 < Static131.anInt2695 + 8; local129++) {
					for (local133 = Static67.anInt1683; local133 < Static67.anInt1683 + 8; local133++) {
						if (Static101.aClass61ArrayArrayArray1[Static22.anInt635][local129][local133] != null) {
							Static101.aClass61ArrayArrayArray1[Static22.anInt635][local129][local133] = null;
							Static44.method962(local129, local133);
						}
					}
				}
				for (@Pc(1908) Class1_Sub4 local1908 = (Class1_Sub4) Static71.aClass61_12.method1748(); local1908 != null; local1908 = (Class1_Sub4) Static71.aClass61_12.method1760()) {
					if (local1908.anInt437 >= Static131.anInt2695 && Static131.anInt2695 + 8 > local1908.anInt437 && Static67.anInt1683 <= local1908.anInt429 && Static67.anInt1683 + 8 > local1908.anInt429 && Static22.anInt635 == local1908.anInt443) {
						local1908.anInt436 = 0;
					}
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 170) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1210();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1176();
				if (local129 >= 0) {
					local485 = Static38.method2002(local129);
				} else {
					local485 = null;
				}
				if (local485 != null) {
					for (local150 = 0; local150 < local485.anIntArray201.length; local150++) {
						local485.anIntArray201[local150] = 0;
						local485.anIntArray206[local150] = 0;
					}
				}
				if (local129 < -70000) {
					local133 += 32768;
				}
				Static89.method1645(local133);
				local150 = Static133.aClass1_Sub12_Sub1_3.method1176();
				for (local172 = 0; local172 < local150; local172++) {
					local176 = Static133.aClass1_Sub12_Sub1_3.method1203();
					if (local176 == 255) {
						local176 = Static133.aClass1_Sub12_Sub1_3.method1209();
					}
					local258 = Static133.aClass1_Sub12_Sub1_3.method1183();
					if (local485 != null && local172 < local485.anIntArray201.length) {
						local485.anIntArray201[local172] = local258;
						local485.anIntArray206[local172] = local176;
					}
					Static126.method2021(local176, local258 - 1, local172, local133);
				}
				if (local485 != null) {
					Static70.method537(local485);
				}
				Static3.method76();
				Static80.anIntArray359[Static116.anInt2727++ & 0x1F] = local133 & 0x7FFF;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 238) {
				Static3.method76();
				Static127.anInt2905 = Static133.aClass1_Sub12_Sub1_3.method1181();
				Static112.anInt2669 = Static112.anInt2674;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 235) {
				Static67.method1179(Static133.aClass1_Sub12_Sub1_3);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 74) {
				Static45.method1019();
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 94) {
				Static109.aBoolean111 = false;
				for (local129 = 0; local129 < 5; local129++) {
					Static63.aBooleanArray12[local129] = false;
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 226) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1221();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1181();
				local485 = Static38.method2002(local129);
				if (local485.anInt1360 != local133 || local133 == -1) {
					local485.anInt1360 = local133;
					local485.anInt1379 = 0;
					local485.anInt1366 = 0;
					Static70.method537(local485);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 0) {
				Static109.aBoolean111 = true;
				Static20.anInt619 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static130.anInt2921 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static55.anInt1766 = Static133.aClass1_Sub12_Sub1_3.method1176();
				Static11.anInt391 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static116.anInt2726 = Static133.aClass1_Sub12_Sub1_3.method1190();
				if (Static116.anInt2726 >= 100) {
					Static122.anInt2830 = Static20.anInt619 * 128 + 64;
					Static1.anInt70 = Static130.anInt2921 * 128 + 64;
					Static51.anInt1580 = Static77.method1476(Static1.anInt70, Static22.anInt635, Static122.anInt2830) - Static55.anInt1766;
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 181) {
				Static3.method76();
				local129 = Static133.aClass1_Sub12_Sub1_3.method1190();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1209();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1202();
				Static127.anIntArray495[local137] = local133;
				Static4.anIntArray31[local137] = local129;
				Static50.anIntArray234[local137] = 1;
				for (local150 = 0; local150 < 98; local150++) {
					if (local133 >= Class1_Sub1_Sub17.anIntArray492[local150]) {
						Static50.anIntArray234[local137] = local150 + 2;
					}
				}
				Static131.anIntArray458[Static108.anInt181++ & 0x1F] = local137;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 66) {
				local960 = Static133.aClass1_Sub12_Sub1_3.method1219();
				local1808 = Static110.method772(Static68.method1378(Static133.aClass1_Sub12_Sub1_3).method1839());
				Static103.method1791(6, Static106.method1850(local960).method1820(), local1808);
				Static59.anInt1826 = -1;
				return true;
			}
			@Pc(2378) long local2378;
			@Pc(2422) int local2422;
			if (Static59.anInt1826 == 29) {
				local960 = Static133.aClass1_Sub12_Sub1_3.method1219();
				Static133.aClass1_Sub12_Sub1_3.method1211();
				local980 = Static133.aClass1_Sub12_Sub1_3.method1219();
				local2378 = Static133.aClass1_Sub12_Sub1_3.method1176();
				@Pc(2383) long local2383 = (long) Static133.aClass1_Sub12_Sub1_3.method1215();
				@Pc(2385) boolean local2385 = false;
				local274 = local2383 + (local2378 << 32);
				local264 = Static133.aClass1_Sub12_Sub1_3.method1190();
				for (@Pc(2397) int local2397 = 0; local2397 < 100; local2397++) {
					if (local274 == Static73.aLongArray8[local2397]) {
						local2385 = true;
						break;
					}
				}
				if (local264 <= 1) {
					for (local2422 = 0; local2422 < Static126.anInt2886; local2422++) {
						if (local960 == Static41.aLongArray4[local2422]) {
							local2385 = true;
							break;
						}
					}
				}
				if (!local2385 && Static63.anInt1927 == 0) {
					Static73.aLongArray8[Static89.anInt2343] = local274;
					Static89.anInt2343 = (Static89.anInt2343 + 1) % 100;
					@Pc(2470) Class66 local2470 = Static110.method772(Static68.method1378(Static133.aClass1_Sub12_Sub1_3).method1839());
					if (local264 == 2 || local264 == 3) {
						Static12.method384(Static106.method1850(local980).method1820(), 9, local2470, Static41.method897(new Class66[] { Static132.aClass66_1733, Static106.method1850(local960).method1820() }));
					} else if (local264 == 1) {
						Static12.method384(Static106.method1850(local980).method1820(), 9, local2470, Static41.method897(new Class66[] { Static121.aClass66_1649, Static106.method1850(local960).method1820() }));
					} else {
						Static12.method384(Static106.method1850(local980).method1820(), 9, local2470, Static106.method1850(local960).method1820());
					}
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 19) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1176();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1221();
				local485 = Static38.method2002(local133);
				if (local485 != null && local485.anInt1359 == 0) {
					if (local485.anInt1354 - local485.anInt1345 < local129) {
						local129 = local485.anInt1354 - local485.anInt1345;
					}
					if (local129 < 0) {
						local129 = 0;
					}
					if (local485.anInt1396 != local129) {
						local485.anInt1396 = local129;
						Static70.method537(local485);
					}
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 7) {
				local960 = Static133.aClass1_Sub12_Sub1_3.method1219();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1176();
				local150 = Static133.aClass1_Sub12_Sub1_3.method1190();
				@Pc(2638) Class66 local2638 = Static106.method1850(local960).method1820();
				for (local176 = 0; local176 < Static27.anInt730; local176++) {
					if (local960 == Static43.aLongArray5[local176]) {
						if (Static9.anIntArray56[local176] != local137) {
							Static9.anIntArray56[local176] = local137;
							if (local137 > 0) {
								Static103.method1791(5, Static13.aClass66_284, Static41.method897(new Class66[] { local2638, Static25.aClass66_431 }));
							}
							if (local137 == 0) {
								Static103.method1791(5, Static13.aClass66_284, Static41.method897(new Class66[] { local2638, Static120.aClass66_1612 }));
							}
						}
						local2638 = null;
						Static8.anIntArray55[local176] = local150;
						break;
					}
				}
				if (local2638 != null && Static27.anInt730 < 200) {
					Static43.aLongArray5[Static27.anInt730] = local960;
					Static88.aClass66Array20[Static27.anInt730] = local2638;
					Static9.anIntArray56[Static27.anInt730] = local137;
					Static8.anIntArray55[Static27.anInt730] = local150;
					Static27.anInt730++;
				}
				Static60.anInt1850 = Static112.anInt2674;
				local262 = Static27.anInt730;
				while (local262 > 0) {
					@Pc(2748) boolean local2748 = true;
					local262--;
					for (local264 = 0; local264 < local262; local264++) {
						if (Static118.anInt2768 != Static9.anIntArray56[local264] && Static9.anIntArray56[local264 + 1] == Static118.anInt2768 || Static9.anIntArray56[local264] == 0 && Static9.anIntArray56[local264 + 1] != 0) {
							local1079 = Static9.anIntArray56[local264];
							local2748 = false;
							Static9.anIntArray56[local264] = Static9.anIntArray56[local264 + 1];
							Static9.anIntArray56[local264 + 1] = local1079;
							@Pc(2806) Class66 local2806 = Static88.aClass66Array20[local264];
							Static88.aClass66Array20[local264] = Static88.aClass66Array20[local264 + 1];
							Static88.aClass66Array20[local264 + 1] = local2806;
							@Pc(2824) long local2824 = Static43.aLongArray5[local264];
							Static43.aLongArray5[local264] = Static43.aLongArray5[local264 + 1];
							Static43.aLongArray5[local264 + 1] = local2824;
							local2422 = Static8.anIntArray55[local264];
							Static8.anIntArray55[local264] = Static8.anIntArray55[local264 + 1];
							Static8.anIntArray55[local264 + 1] = local2422;
						}
					}
					if (local2748) {
						break;
					}
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 194) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1190();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1190();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1190();
				local150 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static63.aBooleanArray12[local129] = true;
				Static74.anIntArray331[local129] = local133;
				Static22.anIntArray94[local129] = local137;
				Static134.anIntArray503[local129] = local150;
				Static18.anIntArray82[local129] = 0;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 208) {
				Static88.method1628();
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 32) {
				Static19.method488(false);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 203) {
				for (local129 = 0; local129 < Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1.length; local129++) {
					if (Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local129] != null) {
						Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local129].anInt1266 = -1;
					}
				}
				for (local133 = 0; local133 < Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3.length; local133++) {
					if (Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local133] != null) {
						Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local133].anInt1266 = -1;
					}
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 215) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1202();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1183();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1221();
				local218 = (Class1_Sub22) Static52.aClass65_22.method1802((long) local137);
				if (local218 != null) {
					Static36.method651(local218, local133 != local218.anInt2781);
				}
				Static4.method138(local137, local133, local129);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 102) {
				Static109.method1855(Static120.aClass7_4, Static105.anInt2602, Static133.aClass1_Sub12_Sub1_3);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 210) {
				local960 = Static133.aClass1_Sub12_Sub1_3.method1219();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1176();
				local1399 = false;
				@Pc(3069) byte local3069 = Static133.aClass1_Sub12_Sub1_3.method1211();
				if ((Long.MIN_VALUE & local960) != 0L) {
					local1399 = true;
				}
				if (local1399) {
					if (Static81.anInt2188 == 0) {
						Static59.anInt1826 = -1;
						return true;
					}
					local960 &= Long.MAX_VALUE;
					for (local176 = 0; Static81.anInt2188 > local176 && (Static3.aClass1_Sub11Array1[local176].aLong130 != local960 || local137 != Static3.aClass1_Sub11Array1[local176].anInt1508); local176++) {
					}
					if (local176 < Static81.anInt2188) {
						while (local176 < Static81.anInt2188 - 1) {
							Static3.aClass1_Sub11Array1[local176] = Static3.aClass1_Sub11Array1[local176 + 1];
							local176++;
						}
						Static81.anInt2188--;
						Static3.aClass1_Sub11Array1[Static81.anInt2188] = null;
					}
				} else {
					@Pc(3083) Class1_Sub11 local3083 = new Class1_Sub11();
					local3083.aLong130 = local960;
					local3083.aClass66_826 = Static106.method1850(local3083.aLong130);
					local3083.aByte3 = local3069;
					local3083.anInt1508 = local137;
					for (local258 = Static81.anInt2188 - 1; local258 >= 0; local258--) {
						local262 = Static3.aClass1_Sub11Array1[local258].aClass66_826.method1822(local3083.aClass66_826);
						if (local262 == 0) {
							Static3.aClass1_Sub11Array1[local258].anInt1508 = local137;
							Static3.aClass1_Sub11Array1[local258].aByte3 = local3069;
							anInt2533 = Static112.anInt2674;
							if (aLong108 == local960) {
								Static132.aByte8 = local3069;
							}
							Static59.anInt1826 = -1;
							return true;
						}
						if (local262 < 0) {
							break;
						}
					}
					if (Static3.aClass1_Sub11Array1.length <= Static81.anInt2188) {
						Static59.anInt1826 = -1;
						return true;
					}
					for (local262 = Static81.anInt2188 - 1; local262 > local258; local262--) {
						Static3.aClass1_Sub11Array1[local262 + 1] = Static3.aClass1_Sub11Array1[local262];
					}
					if (Static81.anInt2188 == 0) {
						Static3.aClass1_Sub11Array1 = new Class1_Sub11[100];
					}
					Static3.aClass1_Sub11Array1[local258 + 1] = local3083;
					if (aLong108 == local960) {
						Static132.aByte8 = local3069;
					}
					Static81.anInt2188++;
				}
				Static59.anInt1826 = -1;
				anInt2533 = Static112.anInt2674;
				return true;
			}
			if (Static59.anInt1826 == 24) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1194();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1221();
				local485 = Static38.method2002(local133);
				if (local485.anInt1376 != 2 || local485.anInt1337 != local129) {
					local485.anInt1337 = local129;
					local485.anInt1376 = 2;
					Static70.method537(local485);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 242) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1203();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1203();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1202();
				Static22.anInt635 = local129 >> 1;
				Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.method929(local137, (local129 & 0x1) == 1, local133);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 172) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1176();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1209();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1222();
				local150 = Static133.aClass1_Sub12_Sub1_3.method1222();
				@Pc(3393) Class1_Sub10 local3393 = Static38.method2002(local133);
				if (local3393.anInt1402 != local137 || local3393.anInt1355 != local150 || local129 != local3393.anInt1374) {
					local3393.anInt1374 = local129;
					local3393.anInt1355 = local150;
					local3393.anInt1402 = local137;
					Static70.method537(local3393);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 45) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1221();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1176();
				Static12.anIntArray72[local133] = local129;
				if (Static103.anIntArray429[local133] != local129) {
					Static103.anIntArray429[local133] = local129;
					Static57.method1262(local133);
				}
				Static119.anIntArray480[Static52.anInt1595++ & 0x1F] = local133;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 146) {
				Static19.method488(true);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 100) {
				@Pc(3496) boolean local3496 = Static133.aClass1_Sub12_Sub1_3.method1203() == 1;
				local133 = Static133.aClass1_Sub12_Sub1_3.method1189();
				local485 = Static38.method2002(local133);
				if (local3496 != local485.aBoolean53) {
					local485.aBoolean53 = local3496;
					Static70.method537(local485);
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 139) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1176();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1190();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1176();
				Static120.method1964(local133, local137, local129);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 126) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1194();
				Static19.method486(local129);
				Static80.anIntArray359[Static116.anInt2727++ & 0x1F] = local129 & 0x7FFF;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 47) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1209();
				local1181 = Static38.method2002(local129);
				for (local137 = 0; local137 < local1181.anIntArray201.length; local137++) {
					local1181.anIntArray201[local137] = -1;
					local1181.anIntArray201[local137] = 0;
				}
				Static70.method537(local1181);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 206) {
				Static59.anInt1826 = -1;
				Static52.anInt1607 = 0;
				return true;
			}
			if (Static59.anInt1826 == 243) {
				Static49.anInt1513 = Static133.aClass1_Sub12_Sub1_3.method1194() * 30;
				Static112.anInt2669 = Static112.anInt2674;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 87) {
				Static28.anInt734 = Static133.aClass1_Sub12_Sub1_3.method1190();
				if (Static28.anInt734 == 1) {
					Static134.anInt2955 = Static133.aClass1_Sub12_Sub1_3.method1176();
				}
				if (Static28.anInt734 >= 2 && Static28.anInt734 <= 6) {
					if (Static28.anInt734 == 2) {
						Static85.anInt2251 = 64;
						Static101.anInt2504 = 64;
					}
					if (Static28.anInt734 == 3) {
						Static85.anInt2251 = 0;
						Static101.anInt2504 = 64;
					}
					if (Static28.anInt734 == 4) {
						Static101.anInt2504 = 64;
						Static85.anInt2251 = 128;
					}
					if (Static28.anInt734 == 5) {
						Static85.anInt2251 = 64;
						Static101.anInt2504 = 0;
					}
					if (Static28.anInt734 == 6) {
						Static101.anInt2504 = 128;
						Static85.anInt2251 = 64;
					}
					Static28.anInt734 = 2;
					Static4.anInt192 = Static133.aClass1_Sub12_Sub1_3.method1176();
					Static90.anInt1841 = Static133.aClass1_Sub12_Sub1_3.method1176();
					Static27.anInt728 = Static133.aClass1_Sub12_Sub1_3.method1190();
				}
				if (Static28.anInt734 == 10) {
					Static77.anInt2146 = Static133.aClass1_Sub12_Sub1_3.method1176();
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 156) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1189();
				local133 = Static133.aClass1_Sub12_Sub1_3.method1222();
				local137 = Static133.aClass1_Sub12_Sub1_3.method1194();
				local359 = Static38.method2002(local129);
				local359.anInt1335 = local133 + (local137 << 16);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 219) {
				local129 = Static133.aClass1_Sub12_Sub1_3.method1183();
				@Pc(3785) byte local3785 = Static133.aClass1_Sub12_Sub1_3.method1211();
				Static12.anIntArray72[local129] = local3785;
				if (Static103.anIntArray429[local129] != local3785) {
					Static103.anIntArray429[local129] = local3785;
					Static57.method1262(local129);
				}
				Static119.anIntArray480[Static52.anInt1595++ & 0x1F] = local129;
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 213) {
				Static28.anInt743 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static59.anInt1826 = -1;
				Static60.anInt1850 = Static112.anInt2674;
				return true;
			}
			if (Static59.anInt1826 == 129) {
				local1392 = Static133.aClass1_Sub12_Sub1_3.method1214();
				@Pc(3846) Object[] local3846 = new Object[local1392.method1847() + 1];
				for (local137 = local1392.method1847() - 1; local137 >= 0; local137--) {
					if (local1392.method1814(local137) == 115) {
						local3846[local137 + 1] = Static133.aClass1_Sub12_Sub1_3.method1214();
					} else {
						local3846[local137 + 1] = Integer.valueOf(Static133.aClass1_Sub12_Sub1_3.method1210());
					}
				}
				local3846[0] = Integer.valueOf(Static133.aClass1_Sub12_Sub1_3.method1210());
				@Pc(3897) Class1_Sub5 local3897 = new Class1_Sub5();
				local3897.anObjectArray3 = local3846;
				Static38.method2005(local3897);
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 241) {
				local960 = Static133.aClass1_Sub12_Sub1_3.method1219();
				local980 = Static133.aClass1_Sub12_Sub1_3.method1176();
				local2378 = Static133.aClass1_Sub12_Sub1_3.method1215();
				@Pc(3931) long local3931 = (local980 << 32) + local2378;
				local258 = Static133.aClass1_Sub12_Sub1_3.method1190();
				@Pc(3937) boolean local3937 = false;
				for (local1086 = 0; local1086 < 100; local1086++) {
					if (local3931 == Static73.aLongArray8[local1086]) {
						local3937 = true;
						break;
					}
				}
				if (local258 <= 1) {
					for (@Pc(3960) int local3960 = 0; local3960 < Static126.anInt2886; local3960++) {
						if (local960 == Static41.aLongArray4[local3960]) {
							local3937 = true;
							break;
						}
					}
				}
				if (!local3937 && Static63.anInt1927 == 0) {
					Static73.aLongArray8[Static89.anInt2343] = local3931;
					Static89.anInt2343 = (Static89.anInt2343 + 1) % 100;
					@Pc(4005) Class66 local4005 = Static110.method772(Static68.method1378(Static133.aClass1_Sub12_Sub1_3).method1839());
					if (local258 == 2 || local258 == 3) {
						Static103.method1791(7, Static41.method897(new Class66[] { Static132.aClass66_1733, Static106.method1850(local960).method1820() }), local4005);
					} else if (local258 == 1) {
						Static103.method1791(7, Static41.method897(new Class66[] { Static121.aClass66_1649, Static106.method1850(local960).method1820() }), local4005);
					} else {
						Static103.method1791(3, Static106.method1850(local960).method1820(), local4005);
					}
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 232) {
				Static131.anInt2695 = Static133.aClass1_Sub12_Sub1_3.method1190();
				Static67.anInt1683 = Static133.aClass1_Sub12_Sub1_3.method1202();
				while (Static133.aClass1_Sub12_Sub1_3.anInt1694 < Static105.anInt2602) {
					Static59.anInt1826 = Static133.aClass1_Sub12_Sub1_3.method1190();
					Static19.method485();
				}
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 248 || Static59.anInt1826 == 144 || Static59.anInt1826 == 164 || Static59.anInt1826 == 237 || Static59.anInt1826 == 83 || Static59.anInt1826 == 50 || Static59.anInt1826 == 149 || Static59.anInt1826 == 106 || Static59.anInt1826 == 118 || Static59.anInt1826 == 140 || Static59.anInt1826 == 72) {
				Static19.method485();
				Static59.anInt1826 = -1;
				return true;
			}
			if (Static59.anInt1826 == 85) {
				Static71.method1400();
				Static59.anInt1826 = -1;
				return false;
			}
			Static93.method1709(null, "T1 - " + Static59.anInt1826 + "," + Static81.anInt2190 + "," + Static1.anInt74 + " - " + Static105.anInt2602);
			Static71.method1400();
		} catch (@Pc(4182) IOException local4182) {
			Static36.method653();
		} catch (@Pc(4186) Exception local4186) {
			@Pc(4226) String local4226 = "T2 - " + Static59.anInt1826 + "," + Static81.anInt2190 + "," + Static1.anInt74 + " - " + Static105.anInt2602 + "," + (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0] + Static48.anInt1496) + "," + (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0] + Static52.anInt1603) + " - ";
			for (local133 = 0; local133 < Static105.anInt2602 && local133 < 50; local133++) {
				local4226 = local4226 + Static133.aClass1_Sub12_Sub1_3.aByteArray12[local133] + ",";
			}
			Static93.method1709(local4186, local4226);
			Static71.method1400();
		}
		return true;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([BIZI)Z")
	public static boolean method1788(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub12 local10 = new Class1_Sub12(arg0);
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(18) int local18 = local10.method1180();
			if (local18 == 0) {
				return local12;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(65) int local65;
				@Pc(90) Class1_Sub1_Sub9 local90;
				do {
					@Pc(55) int local55;
					@Pc(69) int local69;
					do {
						do {
							do {
								do {
									@Pc(34) int local34;
									while (local28) {
										local34 = local10.method1180();
										if (local34 == 0) {
											continue label68;
										}
										local10.method1190();
									}
									local34 = local10.method1180();
									if (local34 == 0) {
										continue label68;
									}
									local26 += local34 - 1;
									@Pc(51) int local51 = local26 >> 6 & 0x3F;
									local55 = arg1 + local51;
									@Pc(59) int local59 = local26 & 0x3F;
									local65 = local10.method1190() >> 2;
									local69 = arg2 + local59;
								} while (local55 <= 0);
							} while (local69 <= 0);
						} while (local55 >= 103);
					} while (local69 >= 103);
					local90 = Static122.method1995(local14);
				} while (local65 == 22 && Static87.aBoolean96 && local90.anInt2089 == 0 && local90.anInt2084 != 1 && !local90.aBoolean83);
				local28 = true;
				if (!local90.method1441()) {
					Static39.anInt985++;
					local12 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V")
	public static void method1789() {
		aClass66_1422 = null;
		aClass66_1420 = null;
		aClass66_1421 = null;
		aClass1_Sub1_Sub2_Sub1Array61 = null;
		aClass66_1418 = null;
		aClass66_1417 = null;
		aClass66_1419 = null;
		aClass60_79 = null;
		anIntArray427 = null;
	}
}
