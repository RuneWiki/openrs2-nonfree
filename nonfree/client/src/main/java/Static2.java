import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!p;")
	public static Class45 aClass45_2;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3 aClass2_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!p;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "[Lclient!ua;")
	public static Class2_Sub2_Sub12_Sub1_Sub2[] aClass2_Sub2_Sub12_Sub1_Sub2Array1 = new Class2_Sub2_Sub12_Sub1_Sub2[16384];

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!o;")
	public static Class40 aClass40_13 = Static13.method257("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
	public static int[] anIntArray2 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public static int anInt34 = 0;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!o;")
	private static Class40 aClass40_14 = Static13.method257("wishes to trade with you)3");

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "[Lclient!d;")
	public static Class14[] aClass14Array1 = new Class14[12];

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!qc;")
	public static Class47 aClass47_1 = new Class47(30);

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_15 = Static13.method257("Your account has been disabled)3");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public static void method18() {
		if (!Static79.aBoolean152) {
			return;
		}
		Static103.aClass2_Sub2_Sub2_Sub3_24 = null;
		Static3.aClass2_Sub2_Sub2_Sub3_2 = null;
		Static102.aClass2_Sub2_Sub2_Sub3_23 = null;
		Static79.aBoolean152 = false;
		Static97.aClass2_Sub2_Sub2_Sub3_22 = null;
		Static102.anIntArray544 = null;
		Static92.aClass45_29 = null;
		Static53.aClass2_Sub2_Sub2_Sub3_12 = null;
		Static41.aClass45_20 = null;
		Static1.aClass45_1 = null;
		Static33.aClass2_Sub2_Sub2_Sub3_9 = null;
		anIntArray3 = null;
		Static30.aClass45_15 = null;
		Static15.aClass2_Sub2_Sub2_Sub3_17 = null;
		Static73.anIntArray407 = null;
		Static15.aClass2_Sub2_Sub2_Sub3_19 = null;
		Static80.aClass45_28 = null;
		Static25.aClass45_12 = null;
		Static44.aClass45_21 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		Static12.aClass45_6 = null;
		Static51.aClass2_Sub2_Sub2_Sub3_10 = null;
		Static81.aClass2_Sub2_Sub2_Sub3Array10 = null;
		Static15.aClass2_Sub2_Sub2_Sub3_18 = null;
		Static17.aClass2_Sub2_Sub2_Sub3_6 = null;
		Static68.aClass45_8 = null;
		Static32.aClass2_Sub2_Sub2_Sub3_7 = null;
		Static61.aClass45_23 = null;
		Static4.aClass45_4 = null;
		Static53.aClass2_Sub2_Sub2_Sub3_13 = null;
		Static104.anIntArray548 = null;
		Static51.aClass2_Sub2_Sub2_Sub3_11 = null;
		Static84.anIntArray431 = null;
		Static83.aClass2_Sub2_Sub2_Sub3_20 = null;
		Static7.aClass45_5 = null;
		Static3.anIntArray4 = null;
		Static19.aClass45_9 = null;
		Static20.aClass45_10 = null;
		Static45.anIntArray225 = null;
		aClass45_2 = null;
		Static29.aClass45_13 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method19() {
		@Pc(15) int local15;
		for (@Pc(8) int local8 = -1; local8 < Static88.anInt2067; local8++) {
			if (local8 == -1) {
				local15 = 2047;
			} else {
				local15 = Static73.anIntArray408[local8];
			}
			@Pc(25) Class2_Sub2_Sub12_Sub1_Sub1 local25 = Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local15];
			if (local25 != null && local25.anInt2294 > 0) {
				local25.anInt2294--;
				if (local25.anInt2294 == 0) {
					local25.aClass40_660 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static73.anInt1800; local15++) {
			@Pc(54) int local54 = Static63.anIntArray326[local15];
			@Pc(58) Class2_Sub2_Sub12_Sub1_Sub2 local58 = aClass2_Sub2_Sub12_Sub1_Sub2Array1[local54];
			if (local58 != null && local58.anInt2294 > 0) {
				local58.anInt2294--;
				if (local58.anInt2294 == 0) {
					local58.aClass40_660 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
	public static void method20() {
		aClass14Array1 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		aClass45_3 = null;
		aClass47_1 = null;
		aClass40_14 = null;
		aClass45_2 = null;
		aClass40_13 = null;
		aClass2_Sub2_Sub12_Sub1_Sub2Array1 = null;
		anIntArray2 = null;
		aClass40_15 = null;
		anIntArray3 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lclient!o;")
	public static Class40 method21(@OriginalArg(0) int arg0) {
		return Static80.method1334(new Class40[] { Static53.method859(arg0 >> 24 & 0xFF), Static80.aClass40_557, Static53.method859(arg0 >> 16 & 0xFF), Static80.aClass40_557, Static53.method859(arg0 >> 8 & 0xFF), Static80.aClass40_557, Static53.method859(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z")
	public static boolean method22() {
		if (Static70.aClass25_36 == null) {
			return false;
		}
		@Pc(226) int local226;
		try {
			@Pc(13) int local13 = Static70.aClass25_36.method728();
			if (local13 == 0) {
				return false;
			}
			if (Static88.anInt2083 == -1) {
				local13--;
				Static70.aClass25_36.method725(0, 1, Static56.aClass2_Sub3_Sub1_5.aByteArray24);
				Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
				Static88.anInt2083 = Static56.aClass2_Sub3_Sub1_5.method1733();
				Static33.anInt785 = Static17.anIntArray82[Static88.anInt2083];
			}
			if (Static33.anInt785 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static70.aClass25_36.method725(0, 1, Static56.aClass2_Sub3_Sub1_5.aByteArray24);
				Static33.anInt785 = Static56.aClass2_Sub3_Sub1_5.aByteArray24[0] & 0xFF;
				local13--;
			}
			if (Static33.anInt785 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static70.aClass25_36.method725(0, 2, Static56.aClass2_Sub3_Sub1_5.aByteArray24);
				local13 -= 2;
				Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
				Static33.anInt785 = Static56.aClass2_Sub3_Sub1_5.method1704();
			}
			if (local13 < Static33.anInt785) {
				return false;
			}
			Static56.aClass2_Sub3_Sub1_5.anInt2546 = 0;
			Static70.aClass25_36.method725(0, Static33.anInt785, Static56.aClass2_Sub3_Sub1_5.aByteArray24);
			Static7.anInt231 = 0;
			Static85.anInt1986 = Static97.anInt2352;
			Static97.anInt2352 = Static33.anInt788;
			Static33.anInt788 = Static88.anInt2083;
			@Pc(125) int local125;
			if (Static88.anInt2083 == 224) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1681();
				Static103.method1648(local125);
				if (Static66.anInt1654 != -1) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = -1;
					Static33.aBoolean59 = true;
					Static22.aBoolean184 = true;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != -1) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = -1;
				}
				if (Static85.anInt1994 != local125) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = local125;
				}
				Static20.aBoolean40 = false;
				Static73.aBoolean144 = true;
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 142) {
				Static95.anInt2237 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static91.anInt2138 = Static56.aClass2_Sub3_Sub1_5.method1706();
				while (Static56.aClass2_Sub3_Sub1_5.anInt2546 < Static33.anInt785) {
					Static88.anInt2083 = Static56.aClass2_Sub3_Sub1_5.method1708();
					Static3.method26();
				}
				Static88.anInt2083 = -1;
				return true;
			}
			@Pc(230) int local230;
			@Pc(234) Class2_Sub2_Sub13 local234;
			if (Static88.anInt2083 == 7) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1732();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1705();
				local230 = Static56.aClass2_Sub3_Sub1_5.method1705();
				local234 = Static81.method1340(local125);
				if (local230 == 65535) {
					Static88.anInt2083 = -1;
					local234.anInt1607 = 0;
					return true;
				}
				@Pc(248) Class2_Sub2_Sub8 local248 = Static105.method1669(local230);
				local234.anInt1607 = 4;
				local234.anInt1579 = local248.anInt952;
				Static88.anInt2083 = -1;
				local234.anInt1586 = local248.anInt926 * 100 / local226;
				local234.anInt1602 = local230;
				local234.anInt1614 = local248.anInt918;
				return true;
			}
			if (Static88.anInt2083 == 249) {
				Static34.anInt808 = Static56.aClass2_Sub3_Sub1_5.method1681();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 157) {
				Static70.method1111(Static99.aClass7_2, Static33.anInt785, Static56.aClass2_Sub3_Sub1_5);
				Static88.anInt2083 = -1;
				return true;
			}
			@Pc(355) int local355;
			@Pc(364) int local364;
			@Pc(359) int local359;
			@Pc(376) int local376;
			if (Static88.anInt2083 == 215) {
				Static7.aBoolean22 = true;
				Static79.anInt1867 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static80.anInt1914 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static83.anInt1963 = Static56.aClass2_Sub3_Sub1_5.method1704();
				Static22.anInt2586 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static75.anInt1832 = Static56.aClass2_Sub3_Sub1_5.method1708();
				if (Static75.anInt1832 >= 100) {
					local125 = Static79.anInt1867 * 128 + 64;
					local226 = Static80.anInt1914 * 128 + 64;
					local230 = Static86.method1383(Static1.anInt8, local125, local226) - Static83.anInt1963;
					local355 = local125 - Static48.anInt1114;
					local359 = local226 - Static15.anInt1863;
					local364 = local230 - Static81.anInt1935;
					local376 = (int) Math.sqrt((double) (local355 * local355 + local359 * local359));
					Static35.anInt824 = (int) (Math.atan2((double) local364, (double) local376) * 325.949D) & 0x7FF;
					Static27.anInt686 = (int) (-325.949D * Math.atan2((double) local355, (double) local359)) & 0x7FF;
					if (Static35.anInt824 < 128) {
						Static35.anInt824 = 128;
					}
					if (Static35.anInt824 > 383) {
						Static35.anInt824 = 383;
					}
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 116) {
				Static33.aBoolean59 = true;
				local125 = Static56.aClass2_Sub3_Sub1_5.method1715();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1729();
				local230 = Static56.aClass2_Sub3_Sub1_5.method1730();
				Static48.anIntArray234[local230] = local226;
				Static94.anIntArray473[local230] = local125;
				Static59.anIntArray312[local230] = 1;
				for (local355 = 0; local355 < 98; local355++) {
					if (Class11.anIntArray80[local355] <= local226) {
						Static59.anIntArray312[local230] = local355 + 2;
					}
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 90) {
				Static91.anInt2139 = Static56.aClass2_Sub3_Sub1_5.method1708();
				if (Static91.anInt2139 == 1) {
					Static85.anInt1989 = Static56.aClass2_Sub3_Sub1_5.method1704();
				}
				if (Static91.anInt2139 >= 2 && Static91.anInt2139 <= 6) {
					if (Static91.anInt2139 == 2) {
						Static19.anInt441 = 64;
						Static58.anInt1493 = 64;
					}
					if (Static91.anInt2139 == 3) {
						Static58.anInt1493 = 64;
						Static19.anInt441 = 0;
					}
					if (Static91.anInt2139 == 4) {
						Static19.anInt441 = 128;
						Static58.anInt1493 = 64;
					}
					if (Static91.anInt2139 == 5) {
						Static58.anInt1493 = 0;
						Static19.anInt441 = 64;
					}
					if (Static91.anInt2139 == 6) {
						Static58.anInt1493 = 128;
						Static19.anInt441 = 64;
					}
					Static91.anInt2139 = 2;
					Static16.anInt410 = Static56.aClass2_Sub3_Sub1_5.method1704();
					Static83.anInt1952 = Static56.aClass2_Sub3_Sub1_5.method1704();
					Static80.anInt1917 = Static56.aClass2_Sub3_Sub1_5.method1708();
				}
				if (Static91.anInt2139 == 10) {
					Static97.anInt2353 = Static56.aClass2_Sub3_Sub1_5.method1704();
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 15) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1729();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1693();
				local230 = Static56.aClass2_Sub3_Sub1_5.method1719();
				local234 = Static81.method1340(local125);
				local234.anInt1588 = local234.anInt1616 + local226;
				local234.anInt1582 = local234.anInt1573 + local230;
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 232) {
				for (local125 = 0; local125 < Static67.anIntArray339.length; local125++) {
					if (Static54.anIntArray288[local125] != Static67.anIntArray339[local125]) {
						Static67.anIntArray339[local125] = Static54.anIntArray288[local125];
						Static22.method1700(local125);
						Static33.aBoolean59 = true;
					}
				}
				Static88.anInt2083 = -1;
				return true;
			}
			@Pc(650) long local650;
			@Pc(655) long local655;
			if (Static88.anInt2083 == 103) {
				local650 = Static56.aClass2_Sub3_Sub1_5.method1717();
				local655 = Static56.aClass2_Sub3_Sub1_5.method1704();
				@Pc(660) long local660 = (long) Static56.aClass2_Sub3_Sub1_5.method1718();
				local376 = Static56.aClass2_Sub3_Sub1_5.method1708();
				@Pc(671) long local671 = (local655 << 32) + local660;
				@Pc(673) boolean local673 = false;
				for (@Pc(675) int local675 = 0; local675 < 100; local675++) {
					if (local671 == Static35.aLongArray3[local675]) {
						local673 = true;
						break;
					}
				}
				if (local376 <= 1) {
					for (@Pc(702) int local702 = 0; local702 < Static99.anInt121; local702++) {
						if (Static84.aLongArray4[local702] == local650) {
							local673 = true;
							break;
						}
					}
				}
				if (!local673 && Static19.anInt440 == 0) {
					Static35.aLongArray3[Static97.anInt2359] = local671;
					Static97.anInt2359 = (Static97.anInt2359 + 1) % 100;
					@Pc(738) Class40 local738 = Static7.method192(Static56.aClass2_Sub3_Sub1_5).method1166();
					if (local376 == 2 || local376 == 3) {
						Static58.method989(7, Static80.method1334(new Class40[] { Static92.aClass40_622, Static48.method819(local650).method1167() }), local738);
					} else if (local376 == 1) {
						Static58.method989(7, Static80.method1334(new Class40[] { Static42.aClass40_323, Static48.method819(local650).method1167() }), local738);
					} else {
						Static58.method989(3, Static48.method819(local650).method1167(), local738);
					}
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 216) {
				Static62.anInt1551 = Static56.aClass2_Sub3_Sub1_5.method1715();
				Static33.aBoolean59 = true;
				Static22.aBoolean184 = true;
				Static88.anInt2083 = -1;
				return true;
			}
			@Pc(836) Class2_Sub2_Sub13 local836;
			if (Static88.anInt2083 == 84) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1729();
				local836 = Static81.method1340(local125);
				local836.anInt1607 = 3;
				local836.anInt1602 = Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass33_2.method1006();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 74) {
				if (Static62.anInt1551 == 12) {
					Static33.aBoolean59 = true;
				}
				Static93.anInt2181 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 162) {
				Static7.aBoolean22 = true;
				Static76.anInt2149 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static36.anInt840 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static49.anInt2259 = Static56.aClass2_Sub3_Sub1_5.method1704();
				Static19.anInt439 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static56.anInt2325 = Static56.aClass2_Sub3_Sub1_5.method1708();
				if (Static56.anInt2325 >= 100) {
					Static48.anInt1114 = Static76.anInt2149 * 128 + 64;
					Static15.anInt1863 = Static36.anInt840 * 128 + 64;
					Static81.anInt1935 = Static86.method1383(Static1.anInt8, Static48.anInt1114, Static15.anInt1863) - Static49.anInt2259;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 108) {
				for (local125 = 0; local125 < Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1.length; local125++) {
					if (Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local125] != null) {
						Static100.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local125].anInt2307 = -1;
					}
				}
				for (local226 = 0; local226 < aClass2_Sub2_Sub12_Sub1_Sub2Array1.length; local226++) {
					if (aClass2_Sub2_Sub12_Sub1_Sub2Array1[local226] != null) {
						aClass2_Sub2_Sub12_Sub1_Sub2Array1[local226].anInt2307 = -1;
					}
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 126) {
				Static99.method58(true);
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 32) {
				Static101.anInt2399 = 1;
				Static88.anInt2083 = -1;
				Static73.aBoolean144 = true;
				Static61.aClass40_444 = Static61.aClass40_445;
				Static74.aBoolean146 = false;
				return true;
			}
			if (Static88.anInt2083 == 94) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1693();
				if (local125 != Static38.anInt980) {
					Static83.method1350(Static38.anInt980);
					Static38.anInt980 = local125;
				}
				Static88.anInt2083 = -1;
				Static73.aBoolean144 = true;
				return true;
			}
			if (Static88.anInt2083 == 120) {
				if (Static62.anInt1551 == 12) {
					Static33.aBoolean59 = true;
				}
				Static74.anInt1813 = Static56.aClass2_Sub3_Sub1_5.method1701();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 70) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1705();
				if (local125 == 65535) {
					local125 = -1;
				}
				if (local125 == -1 && Static20.anInt470 == 0) {
					Static94.method1497();
				} else if (local125 != -1 && local125 != Static84.anInt1977 && Static7.anInt239 != 0 && Static20.anInt470 == 0) {
					Static94.method1491(local125, Static7.anInt239, 0, Static85.aClass5_Sub1_17);
				}
				Static84.anInt1977 = local125;
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 62) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1718();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1705();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (Static7.anInt239 != 0 && local226 != -1) {
					Static94.method1499(1, local226, Static74.aClass5_Sub1_13, Static7.anInt239);
					Static20.anInt470 = local125;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 17) {
				Static7.aBoolean22 = false;
				for (local125 = 0; local125 < 5; local125++) {
					Static98.aBooleanArray35[local125] = false;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			@Pc(1170) Class2_Sub2_Sub13 local1170;
			if (Static88.anInt2083 == 241) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1710();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1714();
				local1170 = Static81.method1340(local125);
				Static88.anInt2083 = -1;
				local1170.anInt1602 = local226;
				local1170.anInt1607 = 2;
				return true;
			}
			if (Static88.anInt2083 == 97) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1704();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1705();
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = -1;
					Static73.aBoolean144 = true;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != local226) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = local226;
				}
				if (Static66.anInt1654 != local125) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = local125;
				}
				if (Static101.anInt2399 != 0) {
					Static101.anInt2399 = 0;
					Static73.aBoolean144 = true;
				}
				Static88.anInt2083 = -1;
				Static33.aBoolean59 = true;
				Static22.aBoolean184 = true;
				Static20.aBoolean40 = false;
				return true;
			}
			if (Static88.anInt2083 == 153) {
				Static83.anInt1960 = Static56.aClass2_Sub3_Sub1_5.method1714();
				Static56.aClass2_Sub3_Sub1_5.method1704();
				Static56.anInt2272 = Static56.aClass2_Sub3_Sub1_5.method1705();
				Static66.anInt1664 = Static56.aClass2_Sub3_Sub1_5.method1705();
				Static51.anInt1167 = Static56.aClass2_Sub3_Sub1_5.method1681();
				Static58.anInt1494 = Static56.aClass2_Sub3_Sub1_5.method1714();
				Static37.anInt941 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static51.anInt1163 = Static56.aClass2_Sub3_Sub1_5.method1681();
				Static56.aClass2_Sub3_Sub1_5.method1714();
				Static86.anInt2035 = Static56.aClass2_Sub3_Sub1_5.method1705();
				Static58.anInt1487 = Static56.aClass2_Sub3_Sub1_5.method1710();
				Static61.aClass48_6 = Static99.aClass7_2.method199(Static58.anInt1487);
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 11) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1704();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1708();
				local230 = Static56.aClass2_Sub3_Sub1_5.method1704();
				if (Static98.anInt2372 != 0 && local226 != 0 && Static4.anInt131 < 50) {
					Static96.anIntArray497[Static4.anInt131] = local125;
					Static13.anIntArray79[Static4.anInt131] = local226;
					Static5.anIntArray36[Static4.anInt131] = local230;
					Static75.aClass43Array1[Static4.anInt131] = null;
					Static4.anInt131++;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 122) {
				Static99.method58(false);
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 136) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1728();
				local836 = Static81.method1340(local125);
				for (local230 = 0; local230 < local836.anIntArray331.length; local230++) {
					local836.anIntArray331[local230] = -1;
					local836.anIntArray331[local230] = 0;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 28) {
				Static103.anInt2492 = Static56.aClass2_Sub3_Sub1_5.method1706();
				Static88.anInt2083 = -1;
				if (Static62.anInt1551 == Static103.anInt2492) {
					Static33.aBoolean59 = true;
					if (Static103.anInt2492 == 3) {
						Static62.anInt1551 = 1;
					} else {
						Static62.anInt1551 = 3;
					}
				}
				return true;
			}
			if (Static88.anInt2083 == 170) {
				Static21.method399();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 250) {
				@Pc(1474) boolean local1474 = Static56.aClass2_Sub3_Sub1_5.method1708() == 1;
				local226 = Static56.aClass2_Sub3_Sub1_5.method1728();
				local1170 = Static81.method1340(local226);
				local1170.aBoolean125 = local1474;
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 155) {
				local650 = Static56.aClass2_Sub3_Sub1_5.method1717();
				local230 = Static56.aClass2_Sub3_Sub1_5.method1704();
				@Pc(1508) Class40 local1508 = Static48.method819(local650).method1167();
				for (local364 = 0; local364 < Static22.anInt2594; local364++) {
					if (local650 == Static21.aLongArray2[local364]) {
						if (local230 != Static62.anIntArray316[local364]) {
							Static62.anIntArray316[local364] = local230;
							Static33.aBoolean59 = true;
							if (local230 > 0) {
								Static58.method989(5, Static61.aClass40_445, Static80.method1334(new Class40[] { local1508, Static72.aClass40_505 }));
							}
							if (local230 == 0) {
								Static58.method989(5, Static61.aClass40_445, Static80.method1334(new Class40[] { local1508, Static1.aClass40_1 }));
							}
						}
						local1508 = null;
						break;
					}
				}
				@Pc(1581) boolean local1581 = false;
				if (local1508 != null && Static22.anInt2594 < 200) {
					Static21.aLongArray2[Static22.anInt2594] = local650;
					Static51.aClass40Array23[Static22.anInt2594] = local1508;
					Static62.anIntArray316[Static22.anInt2594] = local230;
					Static22.anInt2594++;
					Static33.aBoolean59 = true;
				}
				while (!local1581) {
					local1581 = true;
					for (local376 = 0; local376 < Static22.anInt2594 - 1; local376++) {
						if (Static4.anInt140 != Static62.anIntArray316[local376] && Static62.anIntArray316[local376 + 1] == Static4.anInt140 || Static62.anIntArray316[local376] == 0 && Static62.anIntArray316[local376 + 1] != 0) {
							local1581 = false;
							@Pc(1649) int local1649 = Static62.anIntArray316[local376];
							Static62.anIntArray316[local376] = Static62.anIntArray316[local376 + 1];
							Static62.anIntArray316[local376 + 1] = local1649;
							@Pc(1667) Class40 local1667 = Static51.aClass40Array23[local376];
							Static51.aClass40Array23[local376] = Static51.aClass40Array23[local376 + 1];
							Static51.aClass40Array23[local376 + 1] = local1667;
							@Pc(1685) long local1685 = Static21.aLongArray2[local376];
							Static21.aLongArray2[local376] = Static21.aLongArray2[local376 + 1];
							Static21.aLongArray2[local376 + 1] = local1685;
							Static33.aBoolean59 = true;
						}
					}
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 197) {
				Static61.method1039();
				Static88.anInt2083 = -1;
				return false;
			}
			if (Static88.anInt2083 == 36) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1705();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1710();
				local1170 = Static81.method1340(local226);
				if (local1170 != null && local1170.anInt1613 == 0) {
					if (local125 < 0) {
						local125 = 0;
					}
					if (local125 > local1170.anInt1601 - local1170.anInt1609) {
						local125 = local1170.anInt1601 - local1170.anInt1609;
					}
					local1170.anInt1587 = local125;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 26) {
				Static88.anInt2083 = -1;
				Static61.aClass40_444 = Static61.aClass40_445;
				Static101.anInt2399 = 2;
				Static74.aBoolean146 = false;
				Static73.aBoolean144 = true;
				return true;
			}
			@Pc(1801) Class40 local1801;
			@Pc(1822) Class40 local1822;
			if (Static88.anInt2083 == 3) {
				local1801 = Static56.aClass2_Sub3_Sub1_5.method1721();
				@Pc(1813) boolean local1813;
				if (local1801.method1195(Static105.aClass40_728)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(Static97.aClass40_673), 0);
					local655 = local1822.method1179();
					for (local359 = 0; local359 < Static99.anInt121; local359++) {
						if (local655 == Static84.aLongArray4[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static19.anInt440 == 0) {
						Static58.method989(4, local1822, aClass40_14);
					}
				} else if (local1801.method1195(Static49.aClass40_654)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(Static97.aClass40_673), 0);
					local655 = local1822.method1179();
					for (local359 = 0; local359 < Static99.anInt121; local359++) {
						if (Static84.aLongArray4[local359] == local655) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static19.anInt440 == 0) {
						Static58.method989(8, local1822, Static102.aClass40_708);
					}
				} else if (local1801.method1195(Static79.aClass40_542)) {
					local1822 = local1801.method1180(local1801.method1200(Static97.aClass40_673), 0);
					local655 = local1822.method1179();
					local1813 = false;
					for (local359 = 0; local359 < Static99.anInt121; local359++) {
						if (local655 == Static84.aLongArray4[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Static19.anInt440 == 0) {
						@Pc(1923) Class40 local1923 = local1801.method1180(local1801.method1169() - 9, local1801.method1200(Static97.aClass40_673) + 1);
						Static58.method989(8, local1822, local1923);
					}
				} else {
					Static58.method989(0, Static61.aClass40_445, local1801);
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 85) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1706();
				local1822 = Static56.aClass2_Sub3_Sub1_5.method1721();
				local230 = Static56.aClass2_Sub3_Sub1_5.method1730();
				if (local230 >= 1 && local230 <= 5) {
					if (local1822.method1199(Static52.aClass40_359)) {
						local1822 = null;
					}
					Static13.aClass40Array6[local230 - 1] = local1822;
					Static46.aBooleanArray41[local230 - 1] = local125 == 0;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 110) {
				Static94.method1495();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 128) {
				Static33.aBoolean59 = true;
				local125 = Static56.aClass2_Sub3_Sub1_5.method1728();
				local836 = Static81.method1340(local125);
				local230 = Static56.aClass2_Sub3_Sub1_5.method1704();
				for (local355 = 0; local355 < local230; local355++) {
					local364 = Static56.aClass2_Sub3_Sub1_5.method1706();
					if (local364 == 255) {
						local364 = Static56.aClass2_Sub3_Sub1_5.method1728();
					}
					local836.anIntArray331[local355] = Static56.aClass2_Sub3_Sub1_5.method1714();
					local836.anIntArray327[local355] = local364;
				}
				for (local364 = local230; local364 < local836.anIntArray331.length; local364++) {
					local836.anIntArray331[local364] = 0;
					local836.anIntArray327[local364] = 0;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 133) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1729();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1714();
				local1170 = Static81.method1340(local125);
				Static88.anInt2083 = -1;
				local1170.anInt1607 = 1;
				local1170.anInt1602 = local226;
				return true;
			}
			if (Static88.anInt2083 == 54) {
				Static99.anInt121 = Static33.anInt785 / 8;
				for (local125 = 0; local125 < Static99.anInt121; local125++) {
					Static84.aLongArray4[local125] = Static56.aClass2_Sub3_Sub1_5.method1717();
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 38) {
				Static84.anInt1973 = Static56.aClass2_Sub3_Sub1_5.method1714() * 30;
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 66) {
				Static96.anInt2328 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 118 || Static88.anInt2083 == 63 || Static88.anInt2083 == 21 || Static88.anInt2083 == 46 || Static88.anInt2083 == 135 || Static88.anInt2083 == 69 || Static88.anInt2083 == 221 || Static88.anInt2083 == 56 || Static88.anInt2083 == 129 || Static88.anInt2083 == 35 || Static88.anInt2083 == 244) {
				Static3.method26();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 195) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1681();
				Static103.method1648(local125);
				if (Static66.anInt1654 != -1) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = -1;
					Static22.aBoolean184 = true;
					Static33.aBoolean59 = true;
				}
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = -1;
					Static73.aBoolean144 = true;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != local125) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = local125;
				}
				Static20.aBoolean40 = false;
				if (Static101.anInt2399 != 0) {
					Static101.anInt2399 = 0;
					Static73.aBoolean144 = true;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 144) {
				Static91.anInt2138 = Static56.aClass2_Sub3_Sub1_5.method1730();
				Static95.anInt2237 = Static56.aClass2_Sub3_Sub1_5.method1715();
				for (local125 = Static95.anInt2237; local125 < Static95.anInt2237 + 8; local125++) {
					for (local226 = Static91.anInt2138; local226 < Static91.anInt2138 + 8; local226++) {
						if (Static91.aClass44ArrayArrayArray1[Static1.anInt8][local125][local226] != null) {
							Static91.aClass44ArrayArrayArray1[Static1.anInt8][local125][local226] = null;
							Static83.method1356(local226, local125);
						}
					}
				}
				for (@Pc(2420) Class2_Sub7 local2420 = (Class2_Sub7) Static92.aClass44_7.method1224(); local2420 != null; local2420 = (Class2_Sub7) Static92.aClass44_7.method1231()) {
					if (Static95.anInt2237 <= local2420.anInt818 && local2420.anInt818 < Static95.anInt2237 + 8 && local2420.anInt821 >= Static91.anInt2138 && Static91.anInt2138 + 8 > local2420.anInt821 && local2420.anInt817 == Static1.anInt8) {
						local2420.anInt826 = 0;
					}
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 239) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1723();
				if (local125 >= 0) {
					Static103.method1648(local125);
				}
				if (local125 != Static3.anInt51) {
					Static83.method1350(Static3.anInt51);
					Static3.anInt51 = local125;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 202) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1732();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1714();
				local230 = local226 >> 10 & 0x1F;
				local355 = local226 >> 5 & 0x1F;
				local364 = local226 & 0x1F;
				@Pc(2530) Class2_Sub2_Sub13 local2530 = Static81.method1340(local125);
				Static88.anInt2083 = -1;
				local2530.anInt1584 = (local355 << 11) + (local230 << 19) + (local364 << 3);
				return true;
			}
			if (Static88.anInt2083 == 243) {
				for (local125 = 0; local125 < Static59.anInt1505; local125++) {
					@Pc(2561) Class2_Sub2_Sub11 local2561 = Static98.method1568(local125);
					if (local2561 != null && local2561.anInt1076 == 0) {
						Static54.anIntArray288[local125] = 0;
						Static67.anIntArray339[local125] = 0;
					}
				}
				Static33.aBoolean59 = true;
				Static88.anInt2083 = -1;
				if (Static38.anInt980 != -1) {
					Static73.aBoolean144 = true;
				}
				return true;
			}
			if (Static88.anInt2083 == 181) {
				Static107.anInt2505 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 180) {
				Static23.anInt583 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static104.anInt2515 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static103.anInt2491 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static73.aBoolean144 = true;
				Static88.anInt2083 = -1;
				Static52.aBoolean95 = true;
				return true;
			}
			if (Static88.anInt2083 == 121) {
				Static88.anInt2083 = -1;
				Static38.anInt986 = 0;
				return true;
			}
			if (Static88.anInt2083 == 53) {
				local1801 = Static56.aClass2_Sub3_Sub1_5.method1721();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1732();
				local1170 = Static81.method1340(local226);
				local1170.aClass40_466 = local1801;
				if (local226 >> 16 == anIntArray2[Static62.anInt1551]) {
					Static33.aBoolean59 = true;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 45) {
				Static33.aBoolean59 = true;
				local125 = Static56.aClass2_Sub3_Sub1_5.method1728();
				local836 = Static81.method1340(local125);
				while (Static33.anInt785 > Static56.aClass2_Sub3_Sub1_5.anInt2546) {
					local230 = Static56.aClass2_Sub3_Sub1_5.method1698();
					local355 = Static56.aClass2_Sub3_Sub1_5.method1704();
					local364 = Static56.aClass2_Sub3_Sub1_5.method1708();
					if (local364 == 255) {
						local364 = Static56.aClass2_Sub3_Sub1_5.method1728();
					}
					if (local230 >= 0 && local230 < local836.anIntArray331.length) {
						local836.anIntArray331[local230] = local355;
						local836.anIntArray327[local230] = local364;
					}
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 58) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1681();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1705();
				local230 = Static56.aClass2_Sub3_Sub1_5.method1729();
				local355 = Static56.aClass2_Sub3_Sub1_5.method1705();
				@Pc(2761) Class2_Sub2_Sub13 local2761 = Static81.method1340(local230);
				local2761.anInt1579 = local125;
				Static88.anInt2083 = -1;
				local2761.anInt1586 = local226;
				local2761.anInt1614 = local355;
				return true;
			}
			if (Static88.anInt2083 == 24) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1714();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1705();
				local230 = Static56.aClass2_Sub3_Sub1_5.method1710();
				local234 = Static81.method1340(local230);
				local234.anInt1617 = (local125 << 16) + local226;
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 25) {
				if (Static66.anInt1654 != -1) {
					Static83.method1350(Static66.anInt1654);
					Static33.aBoolean59 = true;
					Static66.anInt1654 = -1;
					Static22.aBoolean184 = true;
				}
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = -1;
					Static73.aBoolean144 = true;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != -1) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = -1;
				}
				Static88.anInt2083 = -1;
				if (Static101.anInt2399 != 0) {
					Static101.anInt2399 = 0;
					Static73.aBoolean144 = true;
				}
				Static20.aBoolean40 = false;
				return true;
			}
			if (Static88.anInt2083 == 252) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1706();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1714();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (anIntArray2[local125] != local226) {
					Static83.method1350(anIntArray2[local125]);
					anIntArray2[local125] = local226;
				}
				Static33.aBoolean59 = true;
				Static22.aBoolean184 = true;
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 203) {
				Static42.anInt1038 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static33.aBoolean59 = true;
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 71) {
				local650 = Static56.aClass2_Sub3_Sub1_5.method1717();
				@Pc(2944) Class40 local2944 = Static7.method192(Static56.aClass2_Sub3_Sub1_5).method1166();
				Static58.method989(6, Static48.method819(local650).method1167(), local2944);
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 163) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1681();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1714();
				Static103.method1648(local226);
				if (local125 != -1) {
					Static103.method1648(local125);
				}
				if (Static22.anInt2585 != -1) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = -1;
				}
				if (Static66.anInt1654 != -1) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = -1;
				}
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static85.anInt1994 = -1;
				}
				if (Static84.anInt1971 != local226) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = local226;
					Static7.method187(35);
				}
				if (local226 != Static93.anInt2175) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = local125;
				}
				Static20.aBoolean40 = false;
				Static88.anInt2083 = -1;
				Static101.anInt2399 = 0;
				return true;
			}
			if (Static88.anInt2083 == 80) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1728();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1704();
				Static54.anIntArray288[local226] = local125;
				if (local125 != Static67.anIntArray339[local226]) {
					Static67.anIntArray339[local226] = local125;
					Static22.method1700(local226);
					if (Static38.anInt980 != -1) {
						Static73.aBoolean144 = true;
					}
					Static33.aBoolean59 = true;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 223) {
				Static91.anInt2138 = Static56.aClass2_Sub3_Sub1_5.method1715();
				Static95.anInt2237 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 102) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1681();
				Static103.method1648(local125);
				if (Static85.anInt1994 != -1) {
					Static83.method1350(Static85.anInt1994);
					Static73.aBoolean144 = true;
					Static85.anInt1994 = -1;
				}
				if (Static84.anInt1971 != -1) {
					Static83.method1350(Static84.anInt1971);
					Static84.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Static93.anInt2175 != -1) {
					Static83.method1350(Static93.anInt2175);
					Static93.anInt2175 = -1;
				}
				if (Static22.anInt2585 != -1) {
					Static83.method1350(Static22.anInt2585);
					Static22.anInt2585 = -1;
				}
				if (local125 != Static66.anInt1654) {
					Static83.method1350(Static66.anInt1654);
					Static66.anInt1654 = local125;
				}
				Static22.aBoolean184 = true;
				Static20.aBoolean40 = false;
				if (Static101.anInt2399 != 0) {
					Static101.anInt2399 = 0;
					Static73.aBoolean144 = true;
				}
				Static88.anInt2083 = -1;
				Static33.aBoolean59 = true;
				return true;
			}
			if (Static88.anInt2083 == 194) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1681();
				@Pc(3171) byte local3171 = Static56.aClass2_Sub3_Sub1_5.method1690();
				Static54.anIntArray288[local125] = local3171;
				if (local3171 != Static67.anIntArray339[local125]) {
					Static67.anIntArray339[local125] = local3171;
					Static22.method1700(local125);
					if (Static38.anInt980 != -1) {
						Static73.aBoolean144 = true;
					}
					Static33.aBoolean59 = true;
				}
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 255) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1708();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1708();
				local230 = Static56.aClass2_Sub3_Sub1_5.method1708();
				local355 = Static56.aClass2_Sub3_Sub1_5.method1708();
				Static98.aBooleanArray35[local125] = true;
				Static20.anIntArray93[local125] = local226;
				Static36.anIntArray164[local125] = local230;
				Static35.anIntArray159[local125] = local355;
				Static79.anIntArray415[local125] = 0;
				Static88.anInt2083 = -1;
				return true;
			}
			if (Static88.anInt2083 == 213) {
				local125 = Static56.aClass2_Sub3_Sub1_5.method1729();
				local226 = Static56.aClass2_Sub3_Sub1_5.method1719();
				local1170 = Static81.method1340(local125);
				Static88.anInt2083 = -1;
				if (local226 != local1170.anInt1574 || local226 == -1) {
					local1170.anInt1569 = 0;
					local1170.anInt1574 = local226;
					local1170.anInt1593 = 0;
				}
				return true;
			}
			Static38.method727("T1 - " + Static88.anInt2083 + "," + Static97.anInt2352 + "," + Static85.anInt1986 + " - " + Static33.anInt785, null);
			Static61.method1039();
		} catch (@Pc(3308) IOException local3308) {
			Static34.method626();
		} catch (@Pc(3312) Exception local3312) {
			@Pc(3352) String local3352 = "T2 - " + Static88.anInt2083 + "," + Static97.anInt2352 + "," + Static85.anInt1986 + " - " + Static33.anInt785 + "," + (Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] + Static87.anInt2058) + "," + (Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] + Static30.anInt725) + " - ";
			for (local226 = 0; local226 < Static33.anInt785 && local226 < 50; local226++) {
				local3352 = local3352 + Static56.aClass2_Sub3_Sub1_5.aByteArray24[local226] + ",";
			}
			Static38.method727(local3352, local3312);
			Static61.method1039();
		}
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public static void method23() {
		Static7.aBoolean23 = true;
		Static93.method1486();
		if (Static74.aBoolean146) {
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static61.aClass40_453, 239, 40, 0);
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static80.method1334(new Class40[] { Static61.aClass40_447, Static17.aClass40_116 }), 239, 60, 128);
		} else if (Static101.anInt2399 == 1) {
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static7.aClass40_60, 239, 40, 0);
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static80.method1334(new Class40[] { Static61.aClass40_444, Static17.aClass40_116 }), 239, 60, 128);
		} else if (Static101.anInt2399 == 2) {
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static101.aClass40_695, 239, 40, 0);
			Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static80.method1334(new Class40[] { Static61.aClass40_444, Static17.aClass40_116 }), 239, 60, 128);
		} else {
			@Pc(68) Class2_Sub2_Sub2_Sub2 local68;
			@Pc(75) int local75;
			@Pc(87) int local87;
			if (Static101.anInt2399 == 3) {
				if (Static61.aClass40_444 != Static61.aClass40_452) {
					Static14.method264(Static61.aClass40_444);
					Static61.aClass40_452 = Static61.aClass40_444;
				}
				local68 = Static103.aClass2_Sub2_Sub2_Sub2_5;
				Static26.method1613(0, 0, 463, 77);
				for (local75 = 0; local75 < Static87.anInt2066; local75++) {
					local87 = local75 * 14 + 18 - Static3.anInt53;
					if (local87 > 0 && local87 < 110) {
						local68.method566(Static17.aClass40Array7[local75], 239, local87, 0);
					}
				}
				Static26.method1614();
				if (Static87.anInt2066 > 5) {
					Static37.method711(77, 463, Static3.anInt53, 0, Static87.anInt2066 * 14 + 7);
				}
				if (Static61.aClass40_444.method1169() == 0) {
					Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static23.aClass40_159, 239, 40, 255);
				} else if (Static87.anInt2066 == 0) {
					Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static84.aClass40_569, 239, 40, 0);
				}
				local68.method566(Static80.method1334(new Class40[] { Static61.aClass40_444, Static17.aClass40_116 }), 239, 90, 0);
				Static26.method1603(0, 77, 479, 0);
			} else if (Static17.aClass40_112 == null) {
				@Pc(781) boolean local781;
				if (Static85.anInt1994 != -1) {
					local781 = Static21.method403(0, -1, Static85.anInt1994, 2, 0, 96, 0, 479);
					if (!local781) {
						Static73.aBoolean144 = true;
					}
				} else if (Static38.anInt980 == -1) {
					local75 = 0;
					local68 = Static103.aClass2_Sub2_Sub2_Sub2_5;
					Static26.method1613(0, 0, 463, 77);
					for (local87 = 0; local87 < 100; local87++) {
						if (Static63.aClass40Array30[local87] != null) {
							@Pc(218) int local218 = Static34.anInt799 + 70 - local75 * 14;
							@Pc(222) int local222 = Static76.anIntArray469[local87];
							@Pc(224) byte local224 = 0;
							@Pc(228) Class40 local228 = Static106.aClass40Array40[local87];
							if (local228 != null && local228.method1168(Static42.aClass40_323)) {
								local228 = local228.method1185(5);
								local224 = 1;
							}
							if (local228 != null && local228.method1168(Static92.aClass40_622)) {
								local228 = local228.method1185(5);
								local224 = 2;
							}
							if (local222 == 0) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static63.aClass40Array30[local87], 4, local218, 0);
								}
							}
							@Pc(306) int local306;
							if ((local222 == 1 || local222 == 2) && (local222 == 1 || Static23.anInt583 == 0 || Static23.anInt583 == 1 && Static38.method729(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local306 = 4;
									if (local224 == 1) {
										Static70.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(4, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static70.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local306, local218 - 12);
										local306 += 14;
									}
									local68.method575(Static80.method1334(new Class40[] { local228, Static97.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.method575(Static63.aClass40Array30[local87], local306, local218, 255);
								}
							}
							if ((local222 == 3 || local222 == 7) && Static102.anInt2473 == 0 && (local222 == 7 || Static104.anInt2515 == 0 || Static104.anInt2515 == 1 && Static38.method729(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static45.aClass40_340, 4, local218, 0);
									local306 = local68.method568(Static82.aClass40_564) + 4;
									if (local224 == 1) {
										Static70.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(local306, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static70.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local306, local218 - 12);
										local306 += 14;
									}
									local68.method575(Static80.method1334(new Class40[] { local228, Static97.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.method575(Static63.aClass40Array30[local87], local306, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 4 && (Static103.anInt2491 == 0 || Static103.anInt2491 == 1 && Static38.method729(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static80.method1334(new Class40[] { local228, Static107.aClass40_716, Static63.aClass40Array30[local87] }), 4, local218, 8388736);
								}
							}
							if (local222 == 5 && Static102.anInt2473 == 0 && Static104.anInt2515 < 2) {
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static63.aClass40Array30[local87], 4, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 6 && Static102.anInt2473 == 0 && Static104.anInt2515 < 2) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static80.method1334(new Class40[] { Static100.aClass40_690, local228, Static97.aClass40_673 }), 4, local218, 0);
									local68.method575(Static63.aClass40Array30[local87], local68.method568(Static80.method1334(new Class40[] { Static100.aClass40_690, local228 })) + 12, local218, 8388608);
								}
							}
							if (local222 == 8 && (Static103.anInt2491 == 0 || Static103.anInt2491 == 1 && Static38.method729(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static80.method1334(new Class40[] { local228, Static107.aClass40_716, Static63.aClass40Array30[local87] }), 4, local218, 8270336);
								}
								local75++;
							}
						}
					}
					Static26.method1614();
					Static59.anInt1506 = local75 * 14 + 7;
					if (Static59.anInt1506 < 78) {
						Static59.anInt1506 = 78;
					}
					Static37.method711(77, 463, Static59.anInt1506 - Static34.anInt799 - 77, 0, Static59.anInt1506);
					@Pc(709) Class40 local709;
					if (Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1 == null || Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395 == null) {
						local709 = Static86.aClass40_591;
					} else {
						local709 = Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395;
					}
					local68.method575(Static80.method1334(new Class40[] { local709, Static97.aClass40_673 }), 4, 90, 0);
					local68.method575(Static80.method1334(new Class40[] { Static61.aClass40_451, Static17.aClass40_116 }), local68.method568(Static80.method1334(new Class40[] { local709, Static1.aClass40_4 })) + 6, 90, 255);
					Static26.method1603(0, 77, 479, 0);
				} else {
					local781 = Static21.method403(0, -1, Static38.anInt980, 3, 0, 96, 0, 479);
					if (!local781) {
						Static73.aBoolean144 = true;
					}
				}
			} else {
				Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static17.aClass40_112, 239, 40, 0);
				Static14.aClass2_Sub2_Sub2_Sub2_1.method566(Static35.aClass40_252, 239, 60, 128);
			}
		}
		if (Static97.aBoolean175 && Static1.anInt16 == 2) {
			Static23.method480();
		}
		Static4.method83(Static24.aGraphics1);
	}
}
