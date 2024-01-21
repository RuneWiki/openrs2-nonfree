import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ja", name = "ib", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!ja", name = "tb", descriptor = "Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3 aClass2_Sub4_Sub3_Sub3_2;

	@OriginalMember(owner = "client!ja", name = "gb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1209 = Static107.method1838("<col=ffffff>");

	@OriginalMember(owner = "client!ja", name = "hb", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array28 = new Class28[100];

	@OriginalMember(owner = "client!ja", name = "jb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1210 = Static107.method1838("button near the top of that page)3");

	@OriginalMember(owner = "client!ja", name = "kb", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!ja", name = "mb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1211 = aClass28_1210;

	@OriginalMember(owner = "client!ja", name = "nb", descriptor = "J")
	public static long aLong72 = 0L;

	@OriginalMember(owner = "client!ja", name = "pb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1212 = Static107.method1838("wave2:");

	@OriginalMember(owner = "client!ja", name = "qb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1213 = Static107.method1838("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ja", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1214 = aClass28_1212;

	@OriginalMember(owner = "client!ja", name = "sb", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!ja", name = "vb", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!ja", name = "wb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1215 = aClass28_1212;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IJ)V")
	public static void method1432(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static38.anInt1022; local12++) {
			if (arg0 == Static77.aLongArray7[local12]) {
				Static38.anInt1022--;
				for (@Pc(30) int local30 = local12; local30 < Static38.anInt1022; local30++) {
					Static127.aClass28Array43[local30] = Static127.aClass28Array43[local30 + 1];
					Static112.anIntArray261[local30] = Static112.anIntArray261[local30 + 1];
					Static77.aLongArray7[local30] = Static77.aLongArray7[local30 + 1];
					Static177.anIntArray363[local30] = Static177.anIntArray363[local30 + 1];
				}
				Static30.anInt928 = Static70.anInt1853;
				Static128.aClass2_Sub2_Sub1_2.method1711(90);
				Static128.aClass2_Sub2_Sub1_2.method1666(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
	public static void method1433() {
		aClass28_1209 = null;
		aClass28_1214 = null;
		aClass2_Sub4_Sub3_Sub3_2 = null;
		aString2 = null;
		aClass28_1210 = null;
		aClass28_1215 = null;
		aClass28_1213 = null;
		aClass28_1212 = null;
		aClass28Array28 = null;
		aClass28_1211 = null;
		anIntArrayArray17 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIII)I")
	public static int method1434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return (4096 - arg0) * arg2 + arg1 * arg0 >> 12;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Z")
	public static boolean method1435() {
		if (Static155.aClass22_4 == null) {
			return false;
		}
		@Pc(172) int local172;
		try {
			@Pc(13) int local13 = Static155.aClass22_4.method963();
			if (local13 == 0) {
				return false;
			}
			if (Static113.anInt2734 == -1) {
				local13--;
				Static155.aClass22_4.method967(0, 1, Static151.aClass2_Sub2_Sub1_3.aByteArray35);
				Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
				Static113.anInt2734 = Static151.aClass2_Sub2_Sub1_3.method1720();
				Static103.anInt2571 = Static167.anIntArray351[Static113.anInt2734];
			}
			if (Static103.anInt2571 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static155.aClass22_4.method967(0, 1, Static151.aClass2_Sub2_Sub1_3.aByteArray35);
				Static103.anInt2571 = Static151.aClass2_Sub2_Sub1_3.aByteArray35[0] & 0xFF;
			}
			if (Static103.anInt2571 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static155.aClass22_4.method967(0, 2, Static151.aClass2_Sub2_Sub1_3.aByteArray35);
				Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
				Static103.anInt2571 = Static151.aClass2_Sub2_Sub1_3.method1680();
			}
			if (local13 < Static103.anInt2571) {
				return false;
			}
			Static151.aClass2_Sub2_Sub1_3.anInt2385 = 0;
			Static155.aClass22_4.method967(0, Static103.anInt2571, Static151.aClass2_Sub2_Sub1_3.aByteArray35);
			Static84.anInt2129 = 0;
			Static124.anInt2925 = Static116.anInt2829;
			Static116.anInt2829 = Static148.anInt3347;
			Static148.anInt3347 = Static113.anInt2734;
			if (Static113.anInt2734 == 27) {
				Static30.method634(false);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 95) {
				Static140.method2211();
				Static45.anInt1212 = Static151.aClass2_Sub2_Sub1_3.method1659();
				Static48.anInt1254 = Static70.anInt1853;
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(176) int local176;
			@Pc(168) int local168;
			if (Static113.anInt2734 == 242) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1680();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1680();
				Static94.method1638(local172, local176, local168);
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(206) Class24 local206;
			@Pc(211) int local211;
			@Pc(216) int local216;
			if (Static113.anInt2734 == 220) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1709();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1660();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1671();
				local206 = Static58.method1035(local176);
				local211 = local172 + local206.anInt1395;
				local216 = local168 + local206.anInt1376;
				if (local206.anInt1373 != local211 || local216 != local206.anInt1358) {
					local206.anInt1358 = local216;
					local206.anInt1373 = local211;
					Static104.method1828(local206);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(252) Class28 local252;
			if (Static113.anInt2734 == 106) {
				local252 = Static151.aClass2_Sub2_Sub1_3.method1662();
				@Pc(259) Object[] local259 = new Object[local252.method1121() + 1];
				for (local176 = local252.method1121() - 1; local176 >= 0; local176--) {
					if (local252.method1112(local176) == 115) {
						local259[local176 + 1] = Static151.aClass2_Sub2_Sub1_3.method1662();
					} else {
						local259[local176 + 1] = Integer.valueOf(Static151.aClass2_Sub2_Sub1_3.method1690());
					}
				}
				local259[0] = Integer.valueOf(Static151.aClass2_Sub2_Sub1_3.method1690());
				@Pc(319) Class2_Sub21 local319 = new Class2_Sub21();
				local319.anObjectArray29 = local259;
				Static118.method2854(local319);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 116) {
				Static82.anInt2102 = Static151.aClass2_Sub2_Sub1_3.method1670() * 30;
				Static113.anInt2734 = -1;
				Static48.anInt1254 = Static70.anInt1853;
				return true;
			}
			@Pc(373) int local373;
			if (Static113.anInt2734 == 127) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1671();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1670();
				local176 = local172 >> 10 & 0x1F;
				local211 = local172 & 0x1F;
				local373 = local172 >> 5 & 0x1F;
				local216 = (local211 << 3) + (local373 << 11) + (local176 << 19);
				@Pc(389) Class24 local389 = Static58.method1035(local168);
				if (local216 != local389.anInt1384) {
					local389.anInt1384 = local216;
					Static104.method1828(local389);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 223) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1665();
				if (local168 == 65535) {
					local168 = -1;
				}
				local172 = Static151.aClass2_Sub2_Sub1_3.method1671();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1690();
				local373 = Static151.aClass2_Sub2_Sub1_3.method1680();
				if (local373 == 65535) {
					local373 = -1;
				}
				for (local211 = local168; local211 <= local373; local211++) {
					@Pc(449) long local449 = ((long) local172 << 32) + ((long) local211);
					@Pc(454) Class2 local454 = Static151.aClass35_40.method1354(local449);
					if (local454 != null) {
						local454.method2888();
					}
					Static151.aClass35_40.method1362(new Class2_Sub10(local176), local449);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(499) Class2_Sub22 local499;
			if (Static113.anInt2734 == 16) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1668();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1665();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1653();
				local499 = (Class2_Sub22) Static121.aClass35_35.method1354((long) local176);
				if (local499 != null) {
					Static110.method1875(local499, local499.anInt2866 != local172);
				}
				Static30.method630(local176, local168, local172);
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(540) Class24 local540;
			if (Static113.anInt2734 == 216) {
				local252 = Static151.aClass2_Sub2_Sub1_3.method1662();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1684();
				local540 = Static58.method1035(local172);
				if (!local252.method1107(local540.aClass28_812)) {
					local540.aClass28_812 = local252;
					Static104.method1828(local540);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 104) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1674();
				Static118.anInt4001 = local168;
				Static6.method225(local168);
				Static50.method944(Static118.anInt4001);
				for (local172 = 0; local172 < 100; local172++) {
					Static123.aBooleanArray17[local172] = true;
				}
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(737) int local737;
			@Pc(745) int local745;
			@Pc(743) int local743;
			@Pc(756) long local756;
			if (Static113.anInt2734 == 4) {
				local168 = Static151.aClass2_Sub2_Sub1_3.anInt2385 + Static103.anInt2571;
				local172 = Static151.aClass2_Sub2_Sub1_3.method1680();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1680();
				if (Static118.anInt4001 != local172) {
					Static118.anInt4001 = local172;
					Static6.method225(Static118.anInt4001);
					Static50.method944(Static118.anInt4001);
					for (local373 = 0; local373 < 100; local373++) {
						Static123.aBooleanArray17[local373] = true;
					}
				}
				while (local176-- > 0) {
					local373 = Static151.aClass2_Sub2_Sub1_3.method1690();
					local211 = Static151.aClass2_Sub2_Sub1_3.method1680();
					local216 = Static151.aClass2_Sub2_Sub1_3.method1698();
					@Pc(661) Class2_Sub22 local661 = (Class2_Sub22) Static121.aClass35_35.method1354((long) local373);
					if (local661 != null && local211 != local661.anInt2866) {
						Static110.method1875(local661, true);
						local661 = null;
					}
					if (local661 == null) {
						local661 = Static30.method630(local373, local216, local211);
					}
					local661.aBoolean130 = true;
				}
				for (local499 = (Class2_Sub22) Static121.aClass35_35.method1359(); local499 != null; local499 = (Class2_Sub22) Static121.aClass35_35.method1361()) {
					if (local499.aBoolean130) {
						local499.aBoolean130 = false;
					} else {
						Static110.method1875(local499, true);
					}
				}
				Static151.aClass35_40 = new Class35(512);
				while (local168 > Static151.aClass2_Sub2_Sub1_3.anInt2385) {
					local211 = Static151.aClass2_Sub2_Sub1_3.method1690();
					local216 = Static151.aClass2_Sub2_Sub1_3.method1680();
					local737 = Static151.aClass2_Sub2_Sub1_3.method1680();
					local743 = Static151.aClass2_Sub2_Sub1_3.method1690();
					for (local745 = local216; local745 <= local737; local745++) {
						local756 = ((long) local211 << 32) + ((long) local745);
						Static151.aClass35_40.method1362(new Class2_Sub10(local743), local756);
					}
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 159) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1668();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1667();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1667();
				Static103.anInt2568 = local172 >> 1;
				Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.method1101(local176, (local172 & 0x1) == 1, local168);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 191) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1690();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1680();
				if (local168 < -70000) {
					local172 += 32768;
				}
				if (local168 < 0) {
					local540 = null;
				} else {
					local540 = Static58.method1035(local168);
				}
				if (local540 != null) {
					for (local373 = 0; local373 < local540.anIntArray120.length; local373++) {
						local540.anIntArray120[local373] = 0;
						local540.anIntArray119[local373] = 0;
					}
				}
				Static83.method1482(local172);
				local373 = Static151.aClass2_Sub2_Sub1_3.method1680();
				for (local211 = 0; local211 < local373; local211++) {
					local216 = Static151.aClass2_Sub2_Sub1_3.method1703();
					if (local216 == 255) {
						local216 = Static151.aClass2_Sub2_Sub1_3.method1671();
					}
					local737 = Static151.aClass2_Sub2_Sub1_3.method1674();
					if (local540 != null && local540.anIntArray120.length > local211) {
						local540.anIntArray120[local211] = local737;
						local540.anIntArray119[local211] = local216;
					}
					Static169.method2648(local211, local737 - 1, local216, local172);
				}
				if (local540 != null) {
					Static104.method1828(local540);
				}
				Static140.method2211();
				Static125.anIntArray270[Static158.anInt3505++ & 0x1F] = local172 & 0x7FFF;
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 44) {
				Static18.anInt3716 = Static151.aClass2_Sub2_Sub1_3.method1668();
				Static118.anInt4004 = Static151.aClass2_Sub2_Sub1_3.method1703();
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 2) {
				Static100.anInt2509 = Static151.aClass2_Sub2_Sub1_3.method1698();
				if (Static100.anInt2509 == 1) {
					Static168.anInt3787 = Static151.aClass2_Sub2_Sub1_3.method1680();
				}
				if (Static100.anInt2509 >= 2 && Static100.anInt2509 <= 6) {
					if (Static100.anInt2509 == 2) {
						Static169.anInt3800 = 64;
						Static64.anInt1756 = 64;
					}
					if (Static100.anInt2509 == 3) {
						Static169.anInt3800 = 64;
						Static64.anInt1756 = 0;
					}
					if (Static100.anInt2509 == 4) {
						Static169.anInt3800 = 64;
						Static64.anInt1756 = 128;
					}
					if (Static100.anInt2509 == 5) {
						Static169.anInt3800 = 0;
						Static64.anInt1756 = 64;
					}
					if (Static100.anInt2509 == 6) {
						Static64.anInt1756 = 64;
						Static169.anInt3800 = 128;
					}
					Static100.anInt2509 = 2;
					Static125.anInt2945 = Static151.aClass2_Sub2_Sub1_3.method1680();
					Static21.anInt727 = Static151.aClass2_Sub2_Sub1_3.method1680();
					Static90.anInt2311 = Static151.aClass2_Sub2_Sub1_3.method1698();
				}
				if (Static100.anInt2509 == 10) {
					Static152.anInt3420 = Static151.aClass2_Sub2_Sub1_3.method1680();
				}
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(1194) int local1194;
			@Pc(1090) long local1090;
			@Pc(1070) long local1070;
			@Pc(1187) int local1187;
			if (Static113.anInt2734 == 97) {
				Static16.anInt647 = Static70.anInt1853;
				local1070 = Static151.aClass2_Sub2_Sub1_3.method1655();
				if (local1070 == 0L) {
					Static69.aClass28_1082 = null;
					Static136.anInt3108 = 0;
					Static113.anInt2734 = -1;
					Static61.aClass28_952 = null;
					Static58.aClass2_Sub9Array1 = null;
					return true;
				}
				local1090 = Static151.aClass2_Sub2_Sub1_3.method1655();
				Static61.aClass28_952 = Static83.method1479(local1090);
				Static69.aClass28_1082 = Static83.method1479(local1070);
				Static104.aByte6 = Static151.aClass2_Sub2_Sub1_3.method1707();
				local211 = Static151.aClass2_Sub2_Sub1_3.method1698();
				if (local211 == 255) {
					Static113.anInt2734 = -1;
					return true;
				}
				Static136.anInt3108 = local211;
				@Pc(1118) Class2_Sub9[] local1118 = new Class2_Sub9[100];
				for (local737 = 0; local737 < Static136.anInt3108; local737++) {
					local1118[local737] = new Class2_Sub9();
					local1118[local737].aLong145 = Static151.aClass2_Sub2_Sub1_3.method1655();
					local1118[local737].aClass28_1106 = Static83.method1479(local1118[local737].aLong145);
					local1118[local737].anInt1861 = Static151.aClass2_Sub2_Sub1_3.method1680();
					local1118[local737].aByte3 = Static151.aClass2_Sub2_Sub1_3.method1707();
					if (local1118[local737].aLong145 == Static103.aLong91) {
						Static175.aByte9 = local1118[local737].aByte3;
					}
				}
				local1187 = Static136.anInt3108;
				while (local1187 > 0) {
					local1187--;
					@Pc(1192) boolean local1192 = true;
					for (local1194 = 0; local1194 < local1187; local1194++) {
						if (local1118[local1194].aClass28_1106.method1144(local1118[local1194 + 1].aClass28_1106) > 0) {
							@Pc(1216) Class2_Sub9 local1216 = local1118[local1194];
							local1118[local1194] = local1118[local1194 + 1];
							local1192 = false;
							local1118[local1194 + 1] = local1216;
						}
					}
					if (local1192) {
						break;
					}
				}
				Static58.aClass2_Sub9Array1 = local1118;
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(1294) boolean local1294;
			if (Static113.anInt2734 == 99) {
				local252 = Static151.aClass2_Sub2_Sub1_3.method1662();
				@Pc(1292) Class28 local1292;
				if (local252.method1114(Static130.aClass28_1792)) {
					local1292 = local252.method1135(0, local252.method1124(Static107.aClass28_1540));
					local1090 = local1292.method1129();
					local1294 = false;
					for (local216 = 0; local216 < Static92.anInt2333; local216++) {
						if (Static11.aLongArray3[local216] == local1090) {
							local1294 = true;
							break;
						}
					}
					if (!local1294 && Static67.anInt1799 == 0) {
						Static93.method1632(4, local1292, Static140.aClass28_1893);
					}
				} else if (local252.method1114(Static64.aClass28_983)) {
					local1292 = local252.method1135(0, local252.method1124(Static107.aClass28_1540));
					local1090 = local1292.method1129();
					local1294 = false;
					for (local216 = 0; local216 < Static92.anInt2333; local216++) {
						if (Static11.aLongArray3[local216] == local1090) {
							local1294 = true;
							break;
						}
					}
					if (!local1294 && Static67.anInt1799 == 0) {
						@Pc(1662) Class28 local1662 = local252.method1135(local252.method1124(Static107.aClass28_1540) + 1, local252.method1121() + -9);
						Static93.method1632(8, local1292, local1662);
					}
				} else if (local252.method1114(Static174.aClass28_2310)) {
					local1292 = local252.method1135(0, local252.method1124(Static107.aClass28_1540));
					local1294 = false;
					local1090 = local1292.method1129();
					for (local216 = 0; local216 < Static92.anInt2333; local216++) {
						if (local1090 == Static11.aLongArray3[local216]) {
							local1294 = true;
							break;
						}
					}
					if (!local1294 && Static67.anInt1799 == 0) {
						Static93.method1632(10, local1292, Static136.aClass28_1828);
					}
				} else if (local252.method1114(Static148.aClass28_1967)) {
					local1292 = local252.method1135(0, local252.method1124(Static148.aClass28_1967));
					Static93.method1632(11, Static136.aClass28_1828, local1292);
				} else if (local252.method1114(Static180.aClass28_2422)) {
					local1292 = local252.method1135(0, local252.method1124(Static180.aClass28_2422));
					if (Static67.anInt1799 == 0) {
						Static93.method1632(12, Static136.aClass28_1828, local1292);
					}
				} else if (local252.method1114(Static129.aClass28_1779)) {
					local1292 = local252.method1135(0, local252.method1124(Static129.aClass28_1779));
					if (Static67.anInt1799 == 0) {
						Static93.method1632(13, Static136.aClass28_1828, local1292);
					}
				} else if (local252.method1114(Static38.aClass28_640)) {
					local1292 = local252.method1135(0, local252.method1124(Static107.aClass28_1540));
					local1090 = local1292.method1129();
					local1294 = false;
					for (local216 = 0; local216 < Static92.anInt2333; local216++) {
						if (local1090 == Static11.aLongArray3[local216]) {
							local1294 = true;
							break;
						}
					}
					if (!local1294 && Static67.anInt1799 == 0) {
						Static93.method1632(14, local1292, Static136.aClass28_1828);
					}
				} else if (local252.method1114(Static130.aClass28_1794)) {
					local1292 = local252.method1135(0, local252.method1124(Static107.aClass28_1540));
					local1090 = local1292.method1129();
					local1294 = false;
					for (local216 = 0; local216 < Static92.anInt2333; local216++) {
						if (local1090 == Static11.aLongArray3[local216]) {
							local1294 = true;
							break;
						}
					}
					if (!local1294 && Static67.anInt1799 == 0) {
						Static93.method1632(15, local1292, Static136.aClass28_1828);
					}
				} else if (local252.method1114(Static129.aClass28_1784)) {
					local1292 = local252.method1135(0, local252.method1124(Static107.aClass28_1540));
					local1294 = false;
					local1090 = local1292.method1129();
					for (local216 = 0; local216 < Static92.anInt2333; local216++) {
						if (local1090 == Static11.aLongArray3[local216]) {
							local1294 = true;
							break;
						}
					}
					if (!local1294 && Static67.anInt1799 == 0) {
						Static93.method1632(16, local1292, Static136.aClass28_1828);
					}
				} else {
					Static93.method1632(0, Static136.aClass28_1828, local252);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 143) {
				Static98.anInt2452 = 0;
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 134) {
				Static140.method2211();
				local168 = Static151.aClass2_Sub2_Sub1_3.method1703();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1690();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1703();
				Static61.anIntArray143[local168] = local172;
				Static176.anIntArray361[local168] = local176;
				Static105.anIntArray239[local168] = 1;
				for (local373 = 0; local373 < 98; local373++) {
					if (local172 >= Class2_Sub3_Sub10.anIntArray144[local373]) {
						Static105.anIntArray239[local168] = local373 + 2;
					}
				}
				Static180.anIntArray369[Static181.anInt4073++ & 0x1F] = local168;
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 15) {
				Static11.method352();
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 79) {
				aBoolean99 = false;
				for (local168 = 0; local168 < 5; local168++) {
					Static101.aBooleanArray5[local168] = false;
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 54) {
				for (local168 = 0; local168 < Static67.anInt1800; local168++) {
					@Pc(1845) Class2_Sub4_Sub15 local1845 = Static152.method2361(local168);
					if (local1845 != null && local1845.anInt2953 == 0) {
						Static158.anIntArray325[local168] = 0;
						Static24.anIntArray52[local168] = 0;
					}
				}
				Static140.method2211();
				Static113.anInt2734 = -1;
				Static10.anInt494 += 32;
				return true;
			}
			@Pc(1890) Class24 local1890;
			if (Static113.anInt2734 == 107) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1671();
				local1890 = Static58.method1035(local168);
				local1890.anInt1405 = 3;
				local1890.anInt1433 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2.method417();
				Static104.method1828(local1890);
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(2133) int local2133;
			if (Static113.anInt2734 == 230) {
				local1070 = Static151.aClass2_Sub2_Sub1_3.method1655();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1680();
				local373 = Static151.aClass2_Sub2_Sub1_3.method1698();
				@Pc(1931) Class28 local1931 = Static83.method1479(local1070).method1115();
				for (local216 = 0; local216 < Static38.anInt1022; local216++) {
					if (local1070 == Static77.aLongArray7[local216]) {
						if (Static112.anIntArray261[local216] != local176) {
							Static112.anIntArray261[local216] = local176;
							if (local176 > 0) {
								Static93.method1632(5, Static136.aClass28_1828, Static83.method1481(new Class28[] { local1931, Static77.aClass28_1163 }));
							}
							if (local176 == 0) {
								Static93.method1632(5, Static136.aClass28_1828, Static83.method1481(new Class28[] { local1931, Static14.aClass28_410 }));
							}
						}
						local1931 = null;
						Static177.anIntArray363[local216] = local373;
						break;
					}
				}
				if (local1931 != null && Static38.anInt1022 < 200) {
					Static77.aLongArray7[Static38.anInt1022] = local1070;
					Static127.aClass28Array43[Static38.anInt1022] = local1931;
					Static112.anIntArray261[Static38.anInt1022] = local176;
					Static177.anIntArray363[Static38.anInt1022] = local373;
					Static38.anInt1022++;
				}
				Static30.anInt928 = Static70.anInt1853;
				local743 = Static38.anInt1022;
				while (local743 > 0) {
					@Pc(2042) boolean local2042 = true;
					local743--;
					for (local745 = 0; local745 < local743; local745++) {
						if (Static112.anIntArray261[local745] != Static97.anInt2448 && Static97.anInt2448 == Static112.anIntArray261[local745 + 1] || Static112.anIntArray261[local745] == 0 && Static112.anIntArray261[local745 + 1] != 0) {
							local2042 = false;
							local1187 = Static112.anIntArray261[local745];
							Static112.anIntArray261[local745] = Static112.anIntArray261[local745 + 1];
							Static112.anIntArray261[local745 + 1] = local1187;
							@Pc(2097) Class28 local2097 = Static127.aClass28Array43[local745];
							Static127.aClass28Array43[local745] = Static127.aClass28Array43[local745 + 1];
							Static127.aClass28Array43[local745 + 1] = local2097;
							@Pc(2115) long local2115 = Static77.aLongArray7[local745];
							Static77.aLongArray7[local745] = Static77.aLongArray7[local745 + 1];
							Static77.aLongArray7[local745 + 1] = local2115;
							local2133 = Static177.anIntArray363[local745];
							Static177.anIntArray363[local745] = Static177.anIntArray363[local745 + 1];
							Static177.anIntArray363[local745 + 1] = local2133;
						}
					}
					if (local2042) {
						break;
					}
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 93) {
				aBoolean99 = true;
				Static110.anInt2690 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static156.anInt3489 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static169.anInt3799 = Static151.aClass2_Sub2_Sub1_3.method1680();
				Static104.anInt2593 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static81.anInt2528 = Static151.aClass2_Sub2_Sub1_3.method1698();
				if (Static81.anInt2528 >= 100) {
					local168 = Static110.anInt2690 * 128 + 64;
					local172 = Static156.anInt3489 * 128 + 64;
					local176 = Static103.method1808(Static103.anInt2568, local168, local172) - Static169.anInt3799;
					local373 = local168 - Static36.anInt977;
					local216 = local172 - Static21.anInt726;
					local211 = local176 - Static40.anInt1057;
					local737 = (int) Math.sqrt((double) (local216 * local216 + local373 * local373));
					Static112.anInt2716 = (int) (Math.atan2((double) local211, (double) local737) * 325.949D) & 0x7FF;
					Static33.anInt943 = (int) (-325.949D * Math.atan2((double) local373, (double) local216)) & 0x7FF;
					if (Static112.anInt2716 < 128) {
						Static112.anInt2716 = 128;
					}
					if (Static112.anInt2716 > 383) {
						Static112.anInt2716 = 383;
					}
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 41) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1670();
				@Pc(2290) byte local2290 = Static151.aClass2_Sub2_Sub1_3.method1652();
				Static158.anIntArray325[local168] = local2290;
				if (Static24.anIntArray52[local168] != local2290) {
					Static24.anIntArray52[local168] = local2290;
					Static10.method318(local168);
				}
				Static50.anIntArray108[Static10.anInt494++ & 0x1F] = local168;
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 67) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1690();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1680();
				if (local168 >= 0) {
					local540 = Static58.method1035(local168);
				} else {
					local540 = null;
				}
				if (local168 < -70000) {
					local172 += 32768;
				}
				while (Static151.aClass2_Sub2_Sub1_3.anInt2385 < Static103.anInt2571) {
					local373 = Static151.aClass2_Sub2_Sub1_3.method1679();
					local211 = Static151.aClass2_Sub2_Sub1_3.method1680();
					local216 = 0;
					if (local211 != 0) {
						local216 = Static151.aClass2_Sub2_Sub1_3.method1698();
						if (local216 == 255) {
							local216 = Static151.aClass2_Sub2_Sub1_3.method1690();
						}
					}
					if (local540 != null && local373 >= 0 && local540.anIntArray120.length > local373) {
						local540.anIntArray120[local373] = local211;
						local540.anIntArray119[local373] = local216;
					}
					Static169.method2648(local373, local211 - 1, local216, local172);
				}
				if (local540 != null) {
					Static104.method1828(local540);
				}
				Static140.method2211();
				Static125.anIntArray270[Static158.anInt3505++ & 0x1F] = local172 & 0x7FFF;
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(2463) long local2463;
			if (Static113.anInt2734 == 144) {
				local1070 = Static151.aClass2_Sub2_Sub1_3.method1655();
				Static151.aClass2_Sub2_Sub1_3.method1707();
				local1090 = Static151.aClass2_Sub2_Sub1_3.method1655();
				local2463 = Static151.aClass2_Sub2_Sub1_3.method1680();
				@Pc(2468) long local2468 = (long) Static151.aClass2_Sub2_Sub1_3.method1654();
				@Pc(2470) boolean local2470 = false;
				local745 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local756 = (local2463 << 32) + local2468;
				for (@Pc(2482) int local2482 = 0; local2482 < 100; local2482++) {
					if (Static98.aLongArray9[local2482] == local756) {
						local2470 = true;
						break;
					}
				}
				if (local745 <= 1) {
					for (local2133 = 0; local2133 < Static92.anInt2333; local2133++) {
						if (Static11.aLongArray3[local2133] == local1070) {
							local2470 = true;
							break;
						}
					}
				}
				if (!local2470 && Static67.anInt1799 == 0) {
					Static98.aLongArray9[Static11.anInt535] = local756;
					Static11.anInt535 = (Static11.anInt535 + 1) % 100;
					@Pc(2552) Class28 local2552 = Static68.method2470(Static156.method2408(Static151.aClass2_Sub2_Sub1_3).method1138());
					if (local745 == 2 || local745 == 3) {
						Static135.method2138(local2552, 9, Static83.method1479(local1090).method1115(), Static83.method1481(new Class28[] { Static148.aClass28_1971, Static83.method1479(local1070).method1115() }));
					} else if (local745 == 1) {
						Static135.method2138(local2552, 9, Static83.method1479(local1090).method1115(), Static83.method1481(new Class28[] { Static69.aClass28_1087, Static83.method1479(local1070).method1115() }));
					} else {
						Static135.method2138(local2552, 9, Static83.method1479(local1090).method1115(), Static83.method1479(local1070).method1115());
					}
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 180) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1671();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1674();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1665();
				local206 = Static58.method1035(local168);
				local206.anInt1366 = local172 + (local176 << 16);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 92) {
				Static18.anInt3716 = Static151.aClass2_Sub2_Sub1_3.method1667();
				Static118.anInt4004 = Static151.aClass2_Sub2_Sub1_3.method1698();
				for (local168 = Static118.anInt4004; local168 < Static118.anInt4004 + 8; local168++) {
					for (local172 = Static18.anInt3716; local172 < Static18.anInt3716 + 8; local172++) {
						if (Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local168][local172] != null) {
							Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local168][local172] = null;
							Static52.method966(local172, local168);
						}
					}
				}
				for (@Pc(2733) Class2_Sub19 local2733 = (Class2_Sub19) Static29.aClass65_2.method2115(); local2733 != null; local2733 = (Class2_Sub19) Static29.aClass65_2.method2117()) {
					if (local2733.anInt2708 >= Static118.anInt4004 && Static118.anInt4004 + 8 > local2733.anInt2708 && Static18.anInt3716 <= local2733.anInt2723 && Static18.anInt3716 + 8 > local2733.anInt2723 && Static103.anInt2568 == local2733.anInt2721) {
						local2733.anInt2722 = 0;
					}
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 55) {
				Static19.anInt890 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 90) {
				local1294 = false;
				local1070 = Static151.aClass2_Sub2_Sub1_3.method1655();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1680();
				if ((Long.MIN_VALUE & local1070) != 0L) {
					local1294 = true;
				}
				@Pc(2819) byte local2819 = Static151.aClass2_Sub2_Sub1_3.method1707();
				if (local1294) {
					if (Static136.anInt3108 == 0) {
						Static113.anInt2734 = -1;
						return true;
					}
					local1070 &= Long.MAX_VALUE;
					for (local216 = 0; local216 < Static136.anInt3108 && (Static58.aClass2_Sub9Array1[local216].aLong145 != local1070 || local176 != Static58.aClass2_Sub9Array1[local216].anInt1861); local216++) {
					}
					if (Static136.anInt3108 > local216) {
						while (Static136.anInt3108 - 1 > local216) {
							Static58.aClass2_Sub9Array1[local216] = Static58.aClass2_Sub9Array1[local216 + 1];
							local216++;
						}
						Static136.anInt3108--;
						Static58.aClass2_Sub9Array1[Static136.anInt3108] = null;
					}
				} else {
					@Pc(2901) Class2_Sub9 local2901 = new Class2_Sub9();
					local2901.aLong145 = local1070;
					local2901.aClass28_1106 = Static83.method1479(local2901.aLong145);
					local2901.aByte3 = local2819;
					local2901.anInt1861 = local176;
					for (local737 = Static136.anInt3108 - 1; local737 >= 0; local737--) {
						local743 = Static58.aClass2_Sub9Array1[local737].aClass28_1106.method1144(local2901.aClass28_1106);
						if (local743 == 0) {
							Static58.aClass2_Sub9Array1[local737].anInt1861 = local176;
							Static58.aClass2_Sub9Array1[local737].aByte3 = local2819;
							Static113.anInt2734 = -1;
							Static16.anInt647 = Static70.anInt1853;
							if (Static103.aLong91 == local1070) {
								Static175.aByte9 = local2819;
							}
							return true;
						}
						if (local743 < 0) {
							break;
						}
					}
					if (Static136.anInt3108 >= Static58.aClass2_Sub9Array1.length) {
						Static113.anInt2734 = -1;
						return true;
					}
					for (local743 = Static136.anInt3108 - 1; local743 > local737; local743--) {
						Static58.aClass2_Sub9Array1[local743 + 1] = Static58.aClass2_Sub9Array1[local743];
					}
					if (Static136.anInt3108 == 0) {
						Static58.aClass2_Sub9Array1 = new Class2_Sub9[100];
					}
					Static58.aClass2_Sub9Array1[local737 + 1] = local2901;
					if (local1070 == Static103.aLong91) {
						Static175.aByte9 = local2819;
					}
					Static136.anInt3108++;
				}
				Static113.anInt2734 = -1;
				Static16.anInt647 = Static70.anInt1853;
				return true;
			}
			if (Static113.anInt2734 == 123) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1698();
				if (Static151.aClass2_Sub2_Sub1_3.method1698() == 0) {
					Static156.aClass62Array1[local168] = new Class62();
				} else {
					Static151.aClass2_Sub2_Sub1_3.anInt2385--;
					Static156.aClass62Array1[local168] = new Class62(Static151.aClass2_Sub2_Sub1_3);
				}
				Static109.anInt2644 = Static70.anInt1853;
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 163 || Static113.anInt2734 == 28 || Static113.anInt2734 == 124 || Static113.anInt2734 == 229 || Static113.anInt2734 == 120 || Static113.anInt2734 == 37 || Static113.anInt2734 == 105 || Static113.anInt2734 == 232 || Static113.anInt2734 == 102 || Static113.anInt2734 == 165 || Static113.anInt2734 == 26) {
				Static80.method1440();
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 81) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1671();
				Static100.aClass41_3 = Static76.aClass66_2.method2125(local168);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 96) {
				Static176.anInt3910 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static136.anInt3116 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static61.anInt1659 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static113.anInt2734 = -1;
				return true;
			}
			@Pc(3179) Class28 local3179;
			if (Static113.anInt2734 == 187) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1703();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local3179 = Static151.aClass2_Sub2_Sub1_3.method1662();
				if (local172 >= 1 && local172 <= 8) {
					if (local3179.method1140(Static102.aClass28_1468)) {
						local3179 = null;
					}
					Static151.aClass28Array50[local172 - 1] = local3179;
					Static23.aBooleanArray9[local172 - 1] = local168 == 0;
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 145) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1684();
				local1890 = Static58.method1035(local168);
				for (local176 = 0; local176 < local1890.anIntArray120.length; local176++) {
					local1890.anIntArray120[local176] = -1;
					local1890.anIntArray120[local176] = 0;
				}
				Static104.method1828(local1890);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 45) {
				Static61.method1105(Static103.anInt2571, Static151.aClass2_Sub2_Sub1_3, Static76.aClass66_2);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 114) {
				@Pc(3288) boolean local3288 = Static151.aClass2_Sub2_Sub1_3.method1667() == 1;
				local172 = Static151.aClass2_Sub2_Sub1_3.method1690();
				local540 = Static58.method1035(local172);
				if (local3288 != local540.aBoolean72) {
					local540.aBoolean72 = local3288;
					Static104.method1828(local540);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 115) {
				aBoolean99 = true;
				Static112.anInt2718 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static151.anInt3390 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static94.anInt2359 = Static151.aClass2_Sub2_Sub1_3.method1680();
				Static4.anInt156 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static168.anInt3786 = Static151.aClass2_Sub2_Sub1_3.method1698();
				if (Static168.anInt3786 >= 100) {
					Static36.anInt977 = Static112.anInt2718 * 128 + 64;
					Static21.anInt726 = Static151.anInt3390 * 128 + 64;
					Static40.anInt1057 = Static103.method1808(Static103.anInt2568, Static36.anInt977, Static21.anInt726) - Static94.anInt2359;
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 215) {
				Static113.anInt2751 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static113.anInt2734 = -1;
				Static30.anInt928 = Static70.anInt1853;
				return true;
			}
			if (Static113.anInt2734 == 109) {
				Static113.method1897();
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 252) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1684();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1680();
				local540 = Static58.method1035(local168);
				if (local540.anInt1405 != 2 || local540.anInt1433 != local172) {
					local540.anInt1433 = local172;
					local540.anInt1405 = 2;
					Static104.method1828(local540);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 98) {
				local1070 = Static151.aClass2_Sub2_Sub1_3.method1655();
				local1090 = Static151.aClass2_Sub2_Sub1_3.method1680();
				@Pc(3454) boolean local3454 = false;
				local2463 = Static151.aClass2_Sub2_Sub1_3.method1654();
				local737 = Static151.aClass2_Sub2_Sub1_3.method1698();
				@Pc(3470) long local3470 = (local1090 << 32) + local2463;
				for (local1194 = 0; local1194 < 100; local1194++) {
					if (local3470 == Static98.aLongArray9[local1194]) {
						local3454 = true;
						break;
					}
				}
				if (local737 <= 1) {
					for (@Pc(3495) int local3495 = 0; local3495 < Static92.anInt2333; local3495++) {
						if (local1070 == Static11.aLongArray3[local3495]) {
							local3454 = true;
							break;
						}
					}
				}
				if (!local3454 && Static67.anInt1799 == 0) {
					Static98.aLongArray9[Static11.anInt535] = local3470;
					Static11.anInt535 = (Static11.anInt535 + 1) % 100;
					@Pc(3532) Class28 local3532 = Static68.method2470(Static156.method2408(Static151.aClass2_Sub2_Sub1_3).method1138());
					if (local737 == 2 || local737 == 3) {
						Static93.method1632(7, Static83.method1481(new Class28[] { Static148.aClass28_1971, Static83.method1479(local1070).method1115() }), local3532);
					} else if (local737 == 1) {
						Static93.method1632(7, Static83.method1481(new Class28[] { Static69.aClass28_1087, Static83.method1479(local1070).method1115() }), local3532);
					} else {
						Static93.method1632(3, Static83.method1479(local1070).method1115(), local3532);
					}
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 209) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1670();
				if (local168 == 65535) {
					local168 = -1;
				}
				Static116.method1948(local168);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 239) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1704();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1670();
				if (local172 == 65535) {
					local172 = -1;
				}
				Static139.method2188(local168, local172);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 84) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1690();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1670();
				local540 = Static58.method1035(local168);
				if (local540.anInt1405 != 1 || local540.anInt1433 != local172) {
					local540.anInt1433 = local172;
					local540.anInt1405 = 1;
					Static104.method1828(local540);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 121) {
				Static140.method2211();
				Static120.anInt2869 = Static151.aClass2_Sub2_Sub1_3.method1698();
				Static48.anInt1254 = Static70.anInt1853;
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 199) {
				local1070 = Static151.aClass2_Sub2_Sub1_3.method1655();
				local3179 = Static68.method2470(Static156.method2408(Static151.aClass2_Sub2_Sub1_3).method1138());
				Static93.method1632(6, Static83.method1479(local1070).method1115(), local3179);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 185) {
				for (local168 = 0; local168 < Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1.length; local168++) {
					if (Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local168] != null) {
						Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local168].anInt1653 = -1;
					}
				}
				for (local172 = 0; local172 < Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1.length; local172++) {
					if (Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local172] != null) {
						Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local172].anInt1653 = -1;
					}
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 74) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1665();
				Static111.method1880(local168);
				Static125.anIntArray270[Static158.anInt3505++ & 0x1F] = local168 & 0x7FFF;
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 189) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1680();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1684();
				local540 = Static58.method1035(local172);
				if (local540 != null && local540.anInt1425 == 0) {
					if (local168 > local540.anInt1389 - local540.anInt1427) {
						local168 = local540.anInt1389 - local540.anInt1427;
					}
					if (local168 < 0) {
						local168 = 0;
					}
					if (local168 != local540.anInt1406) {
						local540.anInt1406 = local168;
						Static104.method1828(local540);
					}
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 162) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1671();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1709();
				local540 = Static58.method1035(local168);
				if (local172 != local540.anInt1385 || local172 == -1) {
					local540.anInt1385 = local172;
					local540.anInt1422 = 0;
					local540.anInt1359 = 0;
					Static104.method1828(local540);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 233) {
				Static30.method634(true);
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 228) {
				Static14.method395();
				Static113.anInt2734 = -1;
				return false;
			}
			if (Static113.anInt2734 == 43) {
				Static118.anInt4004 = Static151.aClass2_Sub2_Sub1_3.method1703();
				Static18.anInt3716 = Static151.aClass2_Sub2_Sub1_3.method1667();
				while (Static151.aClass2_Sub2_Sub1_3.anInt2385 < Static103.anInt2571) {
					Static113.anInt2734 = Static151.aClass2_Sub2_Sub1_3.method1698();
					Static80.method1440();
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 186) {
				for (local168 = 0; local168 < Static24.anIntArray52.length; local168++) {
					if (Static24.anIntArray52[local168] != Static158.anIntArray325[local168]) {
						Static24.anIntArray52[local168] = Static158.anIntArray325[local168];
						Static10.method318(local168);
						Static50.anIntArray108[Static10.anInt494++ & 0x1F] = local168;
					}
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 240) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1690();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1680();
				Static158.anIntArray325[local172] = local168;
				if (local168 != Static24.anIntArray52[local172]) {
					Static24.anIntArray52[local172] = local168;
					Static10.method318(local172);
				}
				Static50.anIntArray108[Static10.anInt494++ & 0x1F] = local172;
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 118) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local373 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local211 = Static151.aClass2_Sub2_Sub1_3.method1680();
				Static101.aBooleanArray5[local168] = true;
				Static14.anIntArray39[local168] = local172;
				Static130.anIntArray275[local168] = local176;
				Static40.anIntArray85[local168] = local373;
				Static28.anIntArray69[local168] = local211;
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 194) {
				Static92.anInt2333 = Static103.anInt2571 / 8;
				for (local168 = 0; local168 < Static92.anInt2333; local168++) {
					Static11.aLongArray3[local168] = Static151.aClass2_Sub2_Sub1_3.method1655();
					Static127.aClass28Array42[local168] = Static83.method1479(Static11.aLongArray3[local168]);
				}
				Static113.anInt2734 = -1;
				Static30.anInt928 = Static70.anInt1853;
				return true;
			}
			if (Static113.anInt2734 == 24) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1690();
				@Pc(4158) Class2_Sub22 local4158 = (Class2_Sub22) Static121.aClass35_35.method1354((long) local168);
				if (local4158 != null) {
					Static110.method1875(local4158, true);
				}
				if (Static177.aClass24_14 != null) {
					Static104.method1828(Static177.aClass24_14);
					Static177.aClass24_14 = null;
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 94) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1670();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1684();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1665();
				local373 = Static151.aClass2_Sub2_Sub1_3.method1680();
				@Pc(4200) Class24 local4200 = Static58.method1035(local172);
				if (local4200.anInt1416 != local373 || local176 != local4200.anInt1418 || local4200.anInt1364 != local168) {
					local4200.anInt1364 = local168;
					local4200.anInt1418 = local176;
					local4200.anInt1416 = local373;
					Static104.method1828(local4200);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 193) {
				local168 = Static151.aClass2_Sub2_Sub1_3.method1684();
				local172 = Static151.aClass2_Sub2_Sub1_3.method1684();
				local176 = Static151.aClass2_Sub2_Sub1_3.method1670();
				if (local176 == 65535) {
					local176 = -1;
				}
				local206 = Static58.method1035(local168);
				@Pc(4275) Class2_Sub4_Sub12 local4275;
				if (local206.aBoolean63) {
					local206.anInt1363 = local172;
					local206.anInt1408 = local176;
					local4275 = Static58.method1034(local176);
					local206.anInt1416 = local4275.anInt2230;
					local206.anInt1364 = local4275.anInt2210;
					local206.anInt1414 = local4275.anInt2207;
					local206.anInt1365 = local4275.anInt2211;
					local206.anInt1418 = local4275.anInt2214;
					if (local206.anInt1357 > 0) {
						local206.anInt1364 = local206.anInt1364 * 32 / local206.anInt1357;
					}
					local206.anInt1424 = local4275.anInt2232;
					Static104.method1828(local206);
				} else if (local176 == -1) {
					Static113.anInt2734 = -1;
					local206.anInt1405 = 0;
					return true;
				} else {
					local4275 = Static58.method1034(local176);
					local206.anInt1405 = 4;
					local206.anInt1418 = local4275.anInt2214;
					local206.anInt1433 = local176;
					local206.anInt1364 = local4275.anInt2210 * 100 / local172;
					local206.anInt1416 = local4275.anInt2230;
					Static104.method1828(local206);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 226) {
				if (Static118.anInt4001 != -1) {
					Static95.method1646(Static118.anInt4001, 0);
				}
				Static113.anInt2734 = -1;
				return true;
			}
			if (Static113.anInt2734 == 85) {
				Static127.method2070(Static151.aClass2_Sub2_Sub1_3);
				Static113.anInt2734 = -1;
				return true;
			}
			Static178.method2785("T1 - " + Static113.anInt2734 + "," + Static116.anInt2829 + "," + Static124.anInt2925 + " - " + Static103.anInt2571, null);
			Static14.method395();
		} catch (@Pc(4420) IOException local4420) {
			Static13.method385();
		} catch (@Pc(4424) Exception local4424) {
			@Pc(4465) String local4465 = "T2 - " + Static113.anInt2734 + "," + Static116.anInt2829 + "," + Static124.anInt2925 + " - " + Static103.anInt2571 + "," + (Static3.anInt2434 + Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0]) + "," + (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0] + Static39.anInt1055) + " - ";
			for (local172 = 0; Static103.anInt2571 > local172 && local172 < 50; local172++) {
				local4465 = local4465 + Static151.aClass2_Sub2_Sub1_3.aByteArray35[local172] + ",";
			}
			Static178.method2785(local4465, local4424);
			Static14.method395();
		}
		return true;
	}
}
