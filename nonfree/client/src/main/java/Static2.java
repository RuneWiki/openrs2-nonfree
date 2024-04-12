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

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 5)
	public static void method18() {
		if (!Class18.aBoolean152) {
			return;
		}
		Static95.aClass2_Sub2_Sub2_Sub3_24 = null;
		Static3.aClass2_Sub2_Sub2_Sub3_2 = null;
		Static94.aClass2_Sub2_Sub2_Sub3_23 = null;
		Class18.aBoolean152 = false;
		Static89.aClass2_Sub2_Sub2_Sub3_22 = null;
		Static94.anIntArray544 = null;
		Static84.aClass45_29 = null;
		Static48.aClass2_Sub2_Sub2_Sub3_12 = null;
		Static38.aClass45_20 = null;
		Static1.aClass45_1 = null;
		Static31.aClass2_Sub2_Sub2_Sub3_9 = null;
		anIntArray3 = null;
		Static28.aClass45_15 = null;
		Static14.aClass2_Sub2_Sub2_Sub3_17 = null;
		Static67.anIntArray407 = null;
		Static14.aClass2_Sub2_Sub2_Sub3_19 = null;
		Static72.aClass45_28 = null;
		Static24.aClass45_12 = null;
		Static41.aClass45_21 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		Static11.aClass45_6 = null;
		Static46.aClass2_Sub2_Sub2_Sub3_10 = null;
		Static73.aClass2_Sub2_Sub2_Sub3Array10 = null;
		Static14.aClass2_Sub2_Sub2_Sub3_18 = null;
		Static16.aClass2_Sub2_Sub2_Sub3_6 = null;
		Static63.aClass45_8 = null;
		Static30.aClass2_Sub2_Sub2_Sub3_7 = null;
		Static56.aClass45_23 = null;
		Static4.aClass45_4 = null;
		Static48.aClass2_Sub2_Sub2_Sub3_13 = null;
		Static96.anIntArray548 = null;
		Static46.aClass2_Sub2_Sub2_Sub3_11 = null;
		Static76.anIntArray431 = null;
		Static75.aClass2_Sub2_Sub2_Sub3_20 = null;
		Static7.aClass45_5 = null;
		Static3.anIntArray4 = null;
		Static18.aClass45_9 = null;
		Static19.aClass45_10 = null;
		Static42.anIntArray225 = null;
		aClass45_2 = null;
		Static27.aClass45_13 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 62)
	public static void method19() {
		@Pc(15) int local15;
		for (@Pc(8) int local8 = -1; local8 < Class54.anInt2067; local8++) {
			if (local8 == -1) {
				local15 = 2047;
			} else {
				local15 = Class41.anIntArray408[local8];
			}
			@Pc(25) Class2_Sub2_Sub12_Sub1_Sub1 local25 = Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local15];
			if (local25 != null && local25.anInt2294 > 0) {
				local25.anInt2294--;
				if (local25.anInt2294 == 0) {
					local25.aClass40_660 = null;
				}
			}
		}
		for (local15 = 0; local15 < Class41.anInt1800; local15++) {
			@Pc(54) int local54 = Class2_Sub2_Sub13.anIntArray326[local15];
			@Pc(58) Class2_Sub2_Sub12_Sub1_Sub2 local58 = Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local54];
			if (local58 != null && local58.anInt2294 > 0) {
				local58.anInt2294--;
				if (local58.anInt2294 == 0) {
					local58.aClass40_660 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V", line = 128)
	public static void method20() {
		Class3.aClass14Array1 = null;
		aClass2_Sub2_Sub2_Sub3_1 = null;
		aClass45_3 = null;
		Class3.aClass47_1 = null;
		Class3.aClass40_14 = null;
		aClass45_2 = null;
		Class3.aClass40_13 = null;
		Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1 = null;
		Class3.anIntArray2 = null;
		Class3.aClass40_15 = null;
		anIntArray3 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lclient!o;", line = 150)
	public static Class40 method21(@OriginalArg(0) int arg0) {
		return Static72.method1334(new Class40[] { Static48.method859(arg0 >> 24 & 0xFF), Class47.aClass40_557, Static48.method859(arg0 >> 16 & 0xFF), Class47.aClass40_557, Static48.method859(arg0 >> 8 & 0xFF), Class47.aClass40_557, Static48.method859(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Z", line = 163)
	public static boolean method22() {
		if (Static64.aClass25_36 == null) {
			return false;
		}
		@Pc(226) int local226;
		try {
			@Pc(13) int local13 = Static64.aClass25_36.method728();
			if (local13 == 0) {
				return false;
			}
			if (Class54.anInt2083 == -1) {
				local13--;
				Static64.aClass25_36.method725(0, 1, Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24);
				Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
				Class54.anInt2083 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1733();
				Class2_Sub2_Sub7.anInt785 = Class14.anIntArray82[Class54.anInt2083];
			}
			if (Class2_Sub2_Sub7.anInt785 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static64.aClass25_36.method725(0, 1, Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24);
				Class2_Sub2_Sub7.anInt785 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24[0] & 0xFF;
				local13--;
			}
			if (Class2_Sub2_Sub7.anInt785 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static64.aClass25_36.method725(0, 2, Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24);
				local13 -= 2;
				Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
				Class2_Sub2_Sub7.anInt785 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
			}
			if (local13 < Class2_Sub2_Sub7.anInt785) {
				return false;
			}
			Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 = 0;
			Static64.aClass25_36.method725(0, Class2_Sub2_Sub7.anInt785, Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24);
			Class6.anInt231 = 0;
			Class53.anInt1986 = Class2_Sub12.anInt2352;
			Class2_Sub12.anInt2352 = Class2_Sub2_Sub7.anInt788;
			Class2_Sub2_Sub7.anInt788 = Class54.anInt2083;
			@Pc(125) int local125;
			if (Class54.anInt2083 == 224) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
				Static95.method1648(local125);
				if (Class37.anInt1654 != -1) {
					Static75.method1350(Class37.anInt1654);
					Class37.anInt1654 = -1;
					Class2_Sub2_Sub7.aBoolean59 = true;
					Class2_Sub3.aBoolean184 = true;
				}
				if (Class52.anInt1971 != -1) {
					Static75.method1350(Class52.anInt1971);
					Class52.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Class58.anInt2175 != -1) {
					Static75.method1350(Class58.anInt2175);
					Class58.anInt2175 = -1;
				}
				if (Class2_Sub3.anInt2585 != -1) {
					Static75.method1350(Class2_Sub3.anInt2585);
					Class2_Sub3.anInt2585 = -1;
				}
				if (Class53.anInt1994 != local125) {
					Static75.method1350(Class53.anInt1994);
					Class53.anInt1994 = local125;
				}
				Class18_Sub1.aBoolean40 = false;
				Class41.aBoolean144 = true;
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 142) {
				Static87.anInt2237 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Static83.anInt2138 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1706();
				while (Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546 < Class2_Sub2_Sub7.anInt785) {
					Class54.anInt2083 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
					Static3.method26();
				}
				Class54.anInt2083 = -1;
				return true;
			}
			@Pc(230) int local230;
			@Pc(234) Class2_Sub2_Sub13 local234;
			if (Class54.anInt2083 == 7) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1732();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				local234 = Static73.method1340(local125);
				if (local230 == 65535) {
					Class54.anInt2083 = -1;
					local234.anInt1607 = 0;
					return true;
				}
				@Pc(248) Class2_Sub2_Sub8 local248 = Static97.method1669(local230);
				local234.anInt1607 = 4;
				local234.anInt1579 = local248.anInt952;
				Class54.anInt2083 = -1;
				local234.anInt1586 = local248.anInt926 * 100 / local226;
				local234.anInt1602 = local230;
				local234.anInt1614 = local248.anInt918;
				return true;
			}
			if (Class54.anInt2083 == 249) {
				Class2_Sub6.anInt808 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 157) {
				Static64.method1111(Static91.aClass7_2, Class2_Sub2_Sub7.anInt785, Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5);
				Class54.anInt2083 = -1;
				return true;
			}
			@Pc(355) int local355;
			@Pc(364) int local364;
			@Pc(359) int local359;
			@Pc(376) int local376;
			if (Class54.anInt2083 == 215) {
				Class6.aBoolean22 = true;
				Static71.anInt1867 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Static72.anInt1914 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Static75.anInt1963 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				Static21.anInt2586 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Static69.anInt1832 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				if (Static69.anInt1832 >= 100) {
					local125 = Static71.anInt1867 * 128 + 64;
					local226 = Static72.anInt1914 * 128 + 64;
					local230 = Static78.method1383(Static1.anInt8, local125, local226) - Static75.anInt1963;
					local355 = local125 - Static44.anInt1114;
					local359 = local226 - Static14.anInt1863;
					local364 = local230 - Static73.anInt1935;
					local376 = (int) Math.sqrt((double) (local355 * local355 + local359 * local359));
					Static33.anInt824 = (int) (Math.atan2((double) local364, (double) local376) * 325.949D) & 0x7FF;
					Static26.anInt686 = (int) (-325.949D * Math.atan2((double) local355, (double) local359)) & 0x7FF;
					if (Static33.anInt824 < 128) {
						Static33.anInt824 = 128;
					}
					if (Static33.anInt824 > 383) {
						Static33.anInt824 = 383;
					}
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 116) {
				Class2_Sub2_Sub7.aBoolean59 = true;
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1715();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1729();
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1730();
				Class12_Sub2.anIntArray234[local230] = local226;
				Class59.anIntArray473[local230] = local125;
				Class32.anIntArray312[local230] = 1;
				for (local355 = 0; local355 < 98; local355++) {
					if (Class11.anIntArray80[local355] <= local226) {
						Class32.anIntArray312[local230] = local355 + 2;
					}
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 90) {
				Class57.anInt2139 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				if (Class57.anInt2139 == 1) {
					Class53.anInt1989 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				}
				if (Class57.anInt2139 >= 2 && Class57.anInt2139 <= 6) {
					if (Class57.anInt2139 == 2) {
						Class17.anInt441 = 64;
						Class2_Sub2_Sub12_Sub3.anInt1493 = 64;
					}
					if (Class57.anInt2139 == 3) {
						Class2_Sub2_Sub12_Sub3.anInt1493 = 64;
						Class17.anInt441 = 0;
					}
					if (Class57.anInt2139 == 4) {
						Class17.anInt441 = 128;
						Class2_Sub2_Sub12_Sub3.anInt1493 = 64;
					}
					if (Class57.anInt2139 == 5) {
						Class2_Sub2_Sub12_Sub3.anInt1493 = 0;
						Class17.anInt441 = 64;
					}
					if (Class57.anInt2139 == 6) {
						Class2_Sub2_Sub12_Sub3.anInt1493 = 128;
						Class17.anInt441 = 64;
					}
					Class57.anInt2139 = 2;
					client.anInt410 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
					Class51.anInt1952 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
					Class47.anInt1917 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				}
				if (Class57.anInt2139 == 10) {
					Class2_Sub12.anInt2353 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 15) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1729();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1693();
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1719();
				local234 = Static73.method1340(local125);
				local234.anInt1588 = local234.anInt1616 + local226;
				local234.anInt1582 = local234.anInt1573 + local230;
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 232) {
				for (local125 = 0; local125 < Class38.anIntArray339.length; local125++) {
					if (Class2_Sub2_Sub12_Sub1_Sub1.anIntArray288[local125] != Class38.anIntArray339[local125]) {
						Class38.anIntArray339[local125] = Class2_Sub2_Sub12_Sub1_Sub1.anIntArray288[local125];
						Static21.method1700(local125);
						Class2_Sub2_Sub7.aBoolean59 = true;
					}
				}
				Class54.anInt2083 = -1;
				return true;
			}
			@Pc(650) long local650;
			@Pc(655) long local655;
			if (Class54.anInt2083 == 103) {
				local650 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1717();
				local655 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				@Pc(660) long local660 = (long) Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1718();
				local376 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				@Pc(671) long local671 = (local655 << 32) + local660;
				@Pc(673) boolean local673 = false;
				for (@Pc(675) int local675 = 0; local675 < 100; local675++) {
					if (local671 == Class2_Sub7.aLongArray3[local675]) {
						local673 = true;
						break;
					}
				}
				if (local376 <= 1) {
					for (@Pc(702) int local702 = 0; local702 < Class5.anInt121; local702++) {
						if (Class52.aLongArray4[local702] == local650) {
							local673 = true;
							break;
						}
					}
				}
				if (!local673 && Class17.anInt440 == 0) {
					Class2_Sub7.aLongArray3[Class2_Sub12.anInt2359] = local671;
					Class2_Sub12.anInt2359 = (Class2_Sub12.anInt2359 + 1) % 100;
					@Pc(738) Class40 local738 = Static7.method192(Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5).method1166();
					if (local376 == 2 || local376 == 3) {
						Static53.method989(7, Static72.method1334(new Class40[] { Class45_Sub1.aClass40_622, Static44.method819(local650).method1167() }), local738);
					} else if (local376 == 1) {
						Static53.method989(7, Static72.method1334(new Class40[] { Class2_Sub2_Sub10.aClass40_323, Static44.method819(local650).method1167() }), local738);
					} else {
						Static53.method989(3, Static44.method819(local650).method1167(), local738);
					}
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 216) {
				Class35.anInt1551 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1715();
				Class2_Sub2_Sub7.aBoolean59 = true;
				Class2_Sub3.aBoolean184 = true;
				Class54.anInt2083 = -1;
				return true;
			}
			@Pc(836) Class2_Sub2_Sub13 local836;
			if (Class54.anInt2083 == 84) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1729();
				local836 = Static73.method1340(local125);
				local836.anInt1607 = 3;
				local836.anInt1602 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass33_2.method1006();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 74) {
				if (Class35.anInt1551 == 12) {
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				Class58.anInt2181 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 162) {
				Class6.aBoolean22 = true;
				Static70.anInt2149 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Static34.anInt840 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Static45.anInt2259 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				Static18.anInt439 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Static51.anInt2325 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				if (Static51.anInt2325 >= 100) {
					Static44.anInt1114 = Static70.anInt2149 * 128 + 64;
					Static14.anInt1863 = Static34.anInt840 * 128 + 64;
					Static73.anInt1935 = Static78.method1383(Static1.anInt8, Static44.anInt1114, Static14.anInt1863) - Static45.anInt2259;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 108) {
				for (local125 = 0; local125 < Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1.length; local125++) {
					if (Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local125] != null) {
						Class2_Sub2_Sub15.aClass2_Sub2_Sub12_Sub1_Sub1Array1[local125].anInt2307 = -1;
					}
				}
				for (local226 = 0; local226 < Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1.length; local226++) {
					if (Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local226] != null) {
						Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[local226].anInt2307 = -1;
					}
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 126) {
				Static91.method58(true);
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 32) {
				Class61.anInt2399 = 1;
				Class54.anInt2083 = -1;
				Class41.aBoolean144 = true;
				Class34.aClass40_444 = Class34.aClass40_445;
				Class42.aBoolean146 = false;
				return true;
			}
			if (Class54.anInt2083 == 94) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1693();
				if (local125 != Class25.anInt980) {
					Static75.method1350(Class25.anInt980);
					Class25.anInt980 = local125;
				}
				Class54.anInt2083 = -1;
				Class41.aBoolean144 = true;
				return true;
			}
			if (Class54.anInt2083 == 120) {
				if (Class35.anInt1551 == 12) {
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				Class42.anInt1813 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1701();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 70) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				if (local125 == 65535) {
					local125 = -1;
				}
				if (local125 == -1 && Class18_Sub1.anInt470 == 0) {
					Static86.method1497();
				} else if (local125 != -1 && local125 != Class52.anInt1977 && Class6.anInt239 != 0 && Class18_Sub1.anInt470 == 0) {
					Static86.method1491(local125, Class6.anInt239, 0, Static77.aClass5_Sub1_17);
				}
				Class52.anInt1977 = local125;
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 62) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1718();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (Class6.anInt239 != 0 && local226 != -1) {
					Static86.method1499(1, local226, Static68.aClass5_Sub1_13, Class6.anInt239);
					Class18_Sub1.anInt470 = local125;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 17) {
				Class6.aBoolean22 = false;
				for (local125 = 0; local125 < 5; local125++) {
					Class60.aBooleanArray35[local125] = false;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			@Pc(1170) Class2_Sub2_Sub13 local1170;
			if (Class54.anInt2083 == 241) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1710();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				local1170 = Static73.method1340(local125);
				Class54.anInt2083 = -1;
				local1170.anInt1602 = local226;
				local1170.anInt1607 = 2;
				return true;
			}
			if (Class54.anInt2083 == 97) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				if (Class53.anInt1994 != -1) {
					Static75.method1350(Class53.anInt1994);
					Class53.anInt1994 = -1;
					Class41.aBoolean144 = true;
				}
				if (Class52.anInt1971 != -1) {
					Static75.method1350(Class52.anInt1971);
					Class52.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Class58.anInt2175 != -1) {
					Static75.method1350(Class58.anInt2175);
					Class58.anInt2175 = -1;
				}
				if (Class2_Sub3.anInt2585 != local226) {
					Static75.method1350(Class2_Sub3.anInt2585);
					Class2_Sub3.anInt2585 = local226;
				}
				if (Class37.anInt1654 != local125) {
					Static75.method1350(Class37.anInt1654);
					Class37.anInt1654 = local125;
				}
				if (Class61.anInt2399 != 0) {
					Class61.anInt2399 = 0;
					Class41.aBoolean144 = true;
				}
				Class54.anInt2083 = -1;
				Class2_Sub2_Sub7.aBoolean59 = true;
				Class2_Sub3.aBoolean184 = true;
				Class18_Sub1.aBoolean40 = false;
				return true;
			}
			if (Class54.anInt2083 == 153) {
				Static75.anInt1960 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				Static51.anInt2272 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				Static61.anInt1664 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				Static46.anInt1167 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
				Static53.anInt1494 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				Static35.anInt941 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Static46.anInt1163 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
				Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				Static78.anInt2035 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				Static53.anInt1487 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1710();
				Static56.aClass48_6 = Static91.aClass7_2.method199(Static53.anInt1487);
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 11) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				if (Class60.anInt2372 != 0 && local226 != 0 && Class5_Sub1.anInt131 < 50) {
					Class2_Sub2_Sub12_Sub1_Sub2.anIntArray497[Class5_Sub1.anInt131] = local125;
					Class11.anIntArray79[Class5_Sub1.anInt131] = local226;
					Class2_Sub2_Sub1.anIntArray36[Class5_Sub1.anInt131] = local230;
					Class44.aClass43Array1[Class5_Sub1.anInt131] = null;
					Class5_Sub1.anInt131++;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 122) {
				Static91.method58(false);
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 136) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1728();
				local836 = Static73.method1340(local125);
				for (local230 = 0; local230 < local836.anIntArray331.length; local230++) {
					local836.anIntArray331[local230] = -1;
					local836.anIntArray331[local230] = 0;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 28) {
				Class62.anInt2492 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1706();
				Class54.anInt2083 = -1;
				if (Class35.anInt1551 == Class62.anInt2492) {
					Class2_Sub2_Sub7.aBoolean59 = true;
					if (Class62.anInt2492 == 3) {
						Class35.anInt1551 = 1;
					} else {
						Class35.anInt1551 = 3;
					}
				}
				return true;
			}
			if (Class54.anInt2083 == 170) {
				Static20.method399();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 250) {
				@Pc(1474) boolean local1474 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708() == 1;
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1728();
				local1170 = Static73.method1340(local226);
				local1170.aBoolean125 = local1474;
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 155) {
				local650 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1717();
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				@Pc(1508) Class40 local1508 = Static44.method819(local650).method1167();
				for (local364 = 0; local364 < Class2_Sub3.anInt2594; local364++) {
					if (local650 == Class19.aLongArray2[local364]) {
						if (local230 != Class35.anIntArray316[local364]) {
							Class35.anIntArray316[local364] = local230;
							Class2_Sub2_Sub7.aBoolean59 = true;
							if (local230 > 0) {
								Static53.method989(5, Class34.aClass40_445, Static72.method1334(new Class40[] { local1508, Class40.aClass40_505 }));
							}
							if (local230 == 0) {
								Static53.method989(5, Class34.aClass40_445, Static72.method1334(new Class40[] { local1508, Class1.aClass40_1 }));
							}
						}
						local1508 = null;
						break;
					}
				}
				@Pc(1581) boolean local1581 = false;
				if (local1508 != null && Class2_Sub3.anInt2594 < 200) {
					Class19.aLongArray2[Class2_Sub3.anInt2594] = local650;
					Canvas_Sub1.aClass40Array23[Class2_Sub3.anInt2594] = local1508;
					Class35.anIntArray316[Class2_Sub3.anInt2594] = local230;
					Class2_Sub3.anInt2594++;
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				while (!local1581) {
					local1581 = true;
					for (local376 = 0; local376 < Class2_Sub3.anInt2594 - 1; local376++) {
						if (Class5_Sub1.anInt140 != Class35.anIntArray316[local376] && Class35.anIntArray316[local376 + 1] == Class5_Sub1.anInt140 || Class35.anIntArray316[local376] == 0 && Class35.anIntArray316[local376 + 1] != 0) {
							local1581 = false;
							@Pc(1649) int local1649 = Class35.anIntArray316[local376];
							Class35.anIntArray316[local376] = Class35.anIntArray316[local376 + 1];
							Class35.anIntArray316[local376 + 1] = local1649;
							@Pc(1667) Class40 local1667 = Canvas_Sub1.aClass40Array23[local376];
							Canvas_Sub1.aClass40Array23[local376] = Canvas_Sub1.aClass40Array23[local376 + 1];
							Canvas_Sub1.aClass40Array23[local376 + 1] = local1667;
							@Pc(1685) long local1685 = Class19.aLongArray2[local376];
							Class19.aLongArray2[local376] = Class19.aLongArray2[local376 + 1];
							Class19.aLongArray2[local376 + 1] = local1685;
							Class2_Sub2_Sub7.aBoolean59 = true;
						}
					}
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 197) {
				Static56.method1039();
				Class54.anInt2083 = -1;
				return false;
			}
			if (Class54.anInt2083 == 36) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1710();
				local1170 = Static73.method1340(local226);
				if (local1170 != null && local1170.anInt1613 == 0) {
					if (local125 < 0) {
						local125 = 0;
					}
					if (local125 > local1170.anInt1601 - local1170.anInt1609) {
						local125 = local1170.anInt1601 - local1170.anInt1609;
					}
					local1170.anInt1587 = local125;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 26) {
				Class54.anInt2083 = -1;
				Class34.aClass40_444 = Class34.aClass40_445;
				Class61.anInt2399 = 2;
				Class42.aBoolean146 = false;
				Class41.aBoolean144 = true;
				return true;
			}
			@Pc(1801) Class40 local1801;
			@Pc(1822) Class40 local1822;
			if (Class54.anInt2083 == 3) {
				local1801 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1721();
				@Pc(1813) boolean local1813;
				if (local1801.method1195(Class64.aClass40_728)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(Class2_Sub12.aClass40_673), 0);
					local655 = local1822.method1179();
					for (local359 = 0; local359 < Class5.anInt121; local359++) {
						if (local655 == Class52.aLongArray4[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Class17.anInt440 == 0) {
						Static53.method989(4, local1822, Class3.aClass40_14);
					}
				} else if (local1801.method1195(Class2_Sub2_Sub12.aClass40_654)) {
					local1813 = false;
					local1822 = local1801.method1180(local1801.method1200(Class2_Sub12.aClass40_673), 0);
					local655 = local1822.method1179();
					for (local359 = 0; local359 < Class5.anInt121; local359++) {
						if (Class52.aLongArray4[local359] == local655) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Class17.anInt440 == 0) {
						Static53.method989(8, local1822, Class2_Sub2_Sub16.aClass40_708);
					}
				} else if (local1801.method1195(Class18.aClass40_542)) {
					local1822 = local1801.method1180(local1801.method1200(Class2_Sub12.aClass40_673), 0);
					local655 = local1822.method1179();
					local1813 = false;
					for (local359 = 0; local359 < Class5.anInt121; local359++) {
						if (local655 == Class52.aLongArray4[local359]) {
							local1813 = true;
							break;
						}
					}
					if (!local1813 && Class17.anInt440 == 0) {
						@Pc(1923) Class40 local1923 = local1801.method1180(local1801.method1169() - 9, local1801.method1200(Class2_Sub12.aClass40_673) + 1);
						Static53.method989(8, local1822, local1923);
					}
				} else {
					Static53.method989(0, Class34.aClass40_445, local1801);
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 85) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1706();
				local1822 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1721();
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1730();
				if (local230 >= 1 && local230 <= 5) {
					if (local1822.method1199(Class30.aClass40_359)) {
						local1822 = null;
					}
					Class11.aClass40Array6[local230 - 1] = local1822;
					Class2_Sub2.aBooleanArray41[local230 - 1] = local125 == 0;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 110) {
				Static86.method1495();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 128) {
				Class2_Sub2_Sub7.aBoolean59 = true;
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1728();
				local836 = Static73.method1340(local125);
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				for (local355 = 0; local355 < local230; local355++) {
					local364 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1706();
					if (local364 == 255) {
						local364 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1728();
					}
					local836.anIntArray331[local355] = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
					local836.anIntArray327[local355] = local364;
				}
				for (local364 = local230; local364 < local836.anIntArray331.length; local364++) {
					local836.anIntArray331[local364] = 0;
					local836.anIntArray327[local364] = 0;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 133) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1729();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				local1170 = Static73.method1340(local125);
				Class54.anInt2083 = -1;
				local1170.anInt1607 = 1;
				local1170.anInt1602 = local226;
				return true;
			}
			if (Class54.anInt2083 == 54) {
				Class5.anInt121 = Class2_Sub2_Sub7.anInt785 / 8;
				for (local125 = 0; local125 < Class5.anInt121; local125++) {
					Class52.aLongArray4[local125] = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1717();
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 38) {
				Class52.anInt1973 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714() * 30;
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 66) {
				Class2_Sub2_Sub12_Sub1_Sub2.anInt2328 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 118 || Class54.anInt2083 == 63 || Class54.anInt2083 == 21 || Class54.anInt2083 == 46 || Class54.anInt2083 == 135 || Class54.anInt2083 == 69 || Class54.anInt2083 == 221 || Class54.anInt2083 == 56 || Class54.anInt2083 == 129 || Class54.anInt2083 == 35 || Class54.anInt2083 == 244) {
				Static3.method26();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 195) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
				Static95.method1648(local125);
				if (Class37.anInt1654 != -1) {
					Static75.method1350(Class37.anInt1654);
					Class37.anInt1654 = -1;
					Class2_Sub3.aBoolean184 = true;
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				if (Class53.anInt1994 != -1) {
					Static75.method1350(Class53.anInt1994);
					Class53.anInt1994 = -1;
					Class41.aBoolean144 = true;
				}
				if (Class52.anInt1971 != -1) {
					Static75.method1350(Class52.anInt1971);
					Class52.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Class58.anInt2175 != -1) {
					Static75.method1350(Class58.anInt2175);
					Class58.anInt2175 = -1;
				}
				if (Class2_Sub3.anInt2585 != local125) {
					Static75.method1350(Class2_Sub3.anInt2585);
					Class2_Sub3.anInt2585 = local125;
				}
				Class18_Sub1.aBoolean40 = false;
				if (Class61.anInt2399 != 0) {
					Class61.anInt2399 = 0;
					Class41.aBoolean144 = true;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 144) {
				Static83.anInt2138 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1730();
				Static87.anInt2237 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1715();
				for (local125 = Static87.anInt2237; local125 < Static87.anInt2237 + 8; local125++) {
					for (local226 = Static83.anInt2138; local226 < Static83.anInt2138 + 8; local226++) {
						if (Class57.aClass44ArrayArrayArray1[Static1.anInt8][local125][local226] != null) {
							Class57.aClass44ArrayArrayArray1[Static1.anInt8][local125][local226] = null;
							Static75.method1356(local226, local125);
						}
					}
				}
				for (@Pc(2420) Class2_Sub7 local2420 = (Class2_Sub7) Class45_Sub1.aClass44_7.method1224(); local2420 != null; local2420 = (Class2_Sub7) Class45_Sub1.aClass44_7.method1231()) {
					if (Static87.anInt2237 <= local2420.anInt818 && local2420.anInt818 < Static87.anInt2237 + 8 && local2420.anInt821 >= Static83.anInt2138 && Static83.anInt2138 + 8 > local2420.anInt821 && local2420.anInt817 == Static1.anInt8) {
						local2420.anInt826 = 0;
					}
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 239) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1723();
				if (local125 >= 0) {
					Static95.method1648(local125);
				}
				if (local125 != Class4.anInt51) {
					Static75.method1350(Class4.anInt51);
					Class4.anInt51 = local125;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 202) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1732();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				local230 = local226 >> 10 & 0x1F;
				local355 = local226 >> 5 & 0x1F;
				local364 = local226 & 0x1F;
				@Pc(2530) Class2_Sub2_Sub13 local2530 = Static73.method1340(local125);
				Class54.anInt2083 = -1;
				local2530.anInt1584 = (local355 << 11) + (local230 << 19) + (local364 << 3);
				return true;
			}
			if (Class54.anInt2083 == 243) {
				for (local125 = 0; local125 < Static54.anInt1505; local125++) {
					@Pc(2561) Class2_Sub2_Sub11 local2561 = Static90.method1568(local125);
					if (local2561 != null && local2561.anInt1076 == 0) {
						Class2_Sub2_Sub12_Sub1_Sub1.anIntArray288[local125] = 0;
						Class38.anIntArray339[local125] = 0;
					}
				}
				Class2_Sub2_Sub7.aBoolean59 = true;
				Class54.anInt2083 = -1;
				if (Class25.anInt980 != -1) {
					Class41.aBoolean144 = true;
				}
				return true;
			}
			if (Class54.anInt2083 == 181) {
				Class24.anInt2505 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 180) {
				Class2_Sub2_Sub4.anInt583 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Class63.anInt2515 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Class62.anInt2491 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Class41.aBoolean144 = true;
				Class54.anInt2083 = -1;
				Class30.aBoolean95 = true;
				return true;
			}
			if (Class54.anInt2083 == 121) {
				Class54.anInt2083 = -1;
				Class25.anInt986 = 0;
				return true;
			}
			if (Class54.anInt2083 == 53) {
				local1801 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1721();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1732();
				local1170 = Static73.method1340(local226);
				local1170.aClass40_466 = local1801;
				if (local226 >> 16 == Class3.anIntArray2[Class35.anInt1551]) {
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 45) {
				Class2_Sub2_Sub7.aBoolean59 = true;
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1728();
				local836 = Static73.method1340(local125);
				while (Class2_Sub2_Sub7.anInt785 > Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.anInt2546) {
					local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1698();
					local355 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
					local364 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
					if (local364 == 255) {
						local364 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1728();
					}
					if (local230 >= 0 && local230 < local836.anIntArray331.length) {
						local836.anIntArray331[local230] = local355;
						local836.anIntArray327[local230] = local364;
					}
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 58) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1729();
				local355 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				@Pc(2761) Class2_Sub2_Sub13 local2761 = Static73.method1340(local230);
				local2761.anInt1579 = local125;
				Class54.anInt2083 = -1;
				local2761.anInt1586 = local226;
				local2761.anInt1614 = local355;
				return true;
			}
			if (Class54.anInt2083 == 24) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1705();
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1710();
				local234 = Static73.method1340(local230);
				local234.anInt1617 = (local125 << 16) + local226;
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 25) {
				if (Class37.anInt1654 != -1) {
					Static75.method1350(Class37.anInt1654);
					Class2_Sub2_Sub7.aBoolean59 = true;
					Class37.anInt1654 = -1;
					Class2_Sub3.aBoolean184 = true;
				}
				if (Class53.anInt1994 != -1) {
					Static75.method1350(Class53.anInt1994);
					Class53.anInt1994 = -1;
					Class41.aBoolean144 = true;
				}
				if (Class52.anInt1971 != -1) {
					Static75.method1350(Class52.anInt1971);
					Class52.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Class58.anInt2175 != -1) {
					Static75.method1350(Class58.anInt2175);
					Class58.anInt2175 = -1;
				}
				if (Class2_Sub3.anInt2585 != -1) {
					Static75.method1350(Class2_Sub3.anInt2585);
					Class2_Sub3.anInt2585 = -1;
				}
				Class54.anInt2083 = -1;
				if (Class61.anInt2399 != 0) {
					Class61.anInt2399 = 0;
					Class41.aBoolean144 = true;
				}
				Class18_Sub1.aBoolean40 = false;
				return true;
			}
			if (Class54.anInt2083 == 252) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1706();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				if (local226 == 65535) {
					local226 = -1;
				}
				if (Class3.anIntArray2[local125] != local226) {
					Static75.method1350(Class3.anIntArray2[local125]);
					Class3.anIntArray2[local125] = local226;
				}
				Class2_Sub2_Sub7.aBoolean59 = true;
				Class2_Sub3.aBoolean184 = true;
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 203) {
				Class2_Sub2_Sub10.anInt1038 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Class2_Sub2_Sub7.aBoolean59 = true;
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 71) {
				local650 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1717();
				@Pc(2944) Class40 local2944 = Static7.method192(Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5).method1166();
				Static53.method989(6, Static44.method819(local650).method1167(), local2944);
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 163) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1714();
				Static95.method1648(local226);
				if (local125 != -1) {
					Static95.method1648(local125);
				}
				if (Class2_Sub3.anInt2585 != -1) {
					Static75.method1350(Class2_Sub3.anInt2585);
					Class2_Sub3.anInt2585 = -1;
				}
				if (Class37.anInt1654 != -1) {
					Static75.method1350(Class37.anInt1654);
					Class37.anInt1654 = -1;
				}
				if (Class53.anInt1994 != -1) {
					Static75.method1350(Class53.anInt1994);
					Class53.anInt1994 = -1;
				}
				if (Class52.anInt1971 != local226) {
					Static75.method1350(Class52.anInt1971);
					Class52.anInt1971 = local226;
					Static7.method187(35);
				}
				if (local226 != Class58.anInt2175) {
					Static75.method1350(Class58.anInt2175);
					Class58.anInt2175 = local125;
				}
				Class18_Sub1.aBoolean40 = false;
				Class54.anInt2083 = -1;
				Class61.anInt2399 = 0;
				return true;
			}
			if (Class54.anInt2083 == 80) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1728();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1704();
				Class2_Sub2_Sub12_Sub1_Sub1.anIntArray288[local226] = local125;
				if (local125 != Class38.anIntArray339[local226]) {
					Class38.anIntArray339[local226] = local125;
					Static21.method1700(local226);
					if (Class25.anInt980 != -1) {
						Class41.aBoolean144 = true;
					}
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 223) {
				Static83.anInt2138 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1715();
				Static87.anInt2237 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 102) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
				Static95.method1648(local125);
				if (Class53.anInt1994 != -1) {
					Static75.method1350(Class53.anInt1994);
					Class41.aBoolean144 = true;
					Class53.anInt1994 = -1;
				}
				if (Class52.anInt1971 != -1) {
					Static75.method1350(Class52.anInt1971);
					Class52.anInt1971 = -1;
					Static7.method187(30);
				}
				if (Class58.anInt2175 != -1) {
					Static75.method1350(Class58.anInt2175);
					Class58.anInt2175 = -1;
				}
				if (Class2_Sub3.anInt2585 != -1) {
					Static75.method1350(Class2_Sub3.anInt2585);
					Class2_Sub3.anInt2585 = -1;
				}
				if (local125 != Class37.anInt1654) {
					Static75.method1350(Class37.anInt1654);
					Class37.anInt1654 = local125;
				}
				Class2_Sub3.aBoolean184 = true;
				Class18_Sub1.aBoolean40 = false;
				if (Class61.anInt2399 != 0) {
					Class61.anInt2399 = 0;
					Class41.aBoolean144 = true;
				}
				Class54.anInt2083 = -1;
				Class2_Sub2_Sub7.aBoolean59 = true;
				return true;
			}
			if (Class54.anInt2083 == 194) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1681();
				@Pc(3171) byte local3171 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1690();
				Class2_Sub2_Sub12_Sub1_Sub1.anIntArray288[local125] = local3171;
				if (local3171 != Class38.anIntArray339[local125]) {
					Class38.anIntArray339[local125] = local3171;
					Static21.method1700(local125);
					if (Class25.anInt980 != -1) {
						Class41.aBoolean144 = true;
					}
					Class2_Sub2_Sub7.aBoolean59 = true;
				}
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 255) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				local230 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				local355 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1708();
				Class60.aBooleanArray35[local125] = true;
				Class18_Sub1.anIntArray93[local125] = local226;
				Class23.anIntArray164[local125] = local230;
				Class2_Sub7.anIntArray159[local125] = local355;
				Class18.anIntArray415[local125] = 0;
				Class54.anInt2083 = -1;
				return true;
			}
			if (Class54.anInt2083 == 213) {
				local125 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1729();
				local226 = Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.method1719();
				local1170 = Static73.method1340(local125);
				Class54.anInt2083 = -1;
				if (local226 != local1170.anInt1574 || local226 == -1) {
					local1170.anInt1569 = 0;
					local1170.anInt1574 = local226;
					local1170.anInt1593 = 0;
				}
				return true;
			}
			Static36.method727("T1 - " + Class54.anInt2083 + "," + Class2_Sub12.anInt2352 + "," + Class53.anInt1986 + " - " + Class2_Sub2_Sub7.anInt785, null);
			Static56.method1039();
		} catch (@Pc(3308) IOException local3308) {
			Static32.method626();
		} catch (@Pc(3312) Exception local3312) {
			@Pc(3352) String local3352 = "T2 - " + Class54.anInt2083 + "," + Class2_Sub12.anInt2352 + "," + Class53.anInt1986 + " - " + Class2_Sub2_Sub7.anInt785 + "," + (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0] + Static79.anInt2058) + "," + (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0] + Static28.anInt725) + " - ";
			for (local226 = 0; local226 < Class2_Sub2_Sub7.anInt785 && local226 < 50; local226++) {
				local3352 = local3352 + Class2_Sub2_Sub12_Sub1.aClass2_Sub3_Sub1_5.aByteArray24[local226] + ",";
			}
			Static36.method727(local3352, local3312);
			Static56.method1039();
		}
		return true;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 1919)
	public static void method23() {
		Class6.aBoolean23 = true;
		Static85.method1486();
		if (Class42.aBoolean146) {
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Class34.aClass40_453, 239, 40, 0);
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Static72.method1334(new Class40[] { Class34.aClass40_447, Class14.aClass40_116 }), 239, 60, 128);
		} else if (Class61.anInt2399 == 1) {
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Class6.aClass40_60, 239, 40, 0);
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Static72.method1334(new Class40[] { Class34.aClass40_444, Class14.aClass40_116 }), 239, 60, 128);
		} else if (Class61.anInt2399 == 2) {
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Class61.aClass40_695, 239, 40, 0);
			Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Static72.method1334(new Class40[] { Class34.aClass40_444, Class14.aClass40_116 }), 239, 60, 128);
		} else {
			@Pc(68) Class2_Sub2_Sub2_Sub2 local68;
			@Pc(75) int local75;
			@Pc(87) int local87;
			if (Class61.anInt2399 == 3) {
				if (Class34.aClass40_444 != Class34.aClass40_452) {
					Static13.method264(Class34.aClass40_444);
					Class34.aClass40_452 = Class34.aClass40_444;
				}
				local68 = Static95.aClass2_Sub2_Sub2_Sub2_5;
				Static25.method1613(0, 0, 463, 77);
				for (local75 = 0; local75 < Class2_Sub2_Sub14.anInt2066; local75++) {
					local87 = local75 * 14 + 18 - Class4.anInt53;
					if (local87 > 0 && local87 < 110) {
						local68.method566(Class14.aClass40Array7[local75], 239, local87, 0);
					}
				}
				Static25.method1614();
				if (Class2_Sub2_Sub14.anInt2066 > 5) {
					Static35.method711(77, 463, Class4.anInt53, 0, Class2_Sub2_Sub14.anInt2066 * 14 + 7);
				}
				if (Class34.aClass40_444.method1169() == 0) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Class2_Sub2_Sub4.aClass40_159, 239, 40, 255);
				} else if (Class2_Sub2_Sub14.anInt2066 == 0) {
					Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Class52.aClass40_569, 239, 40, 0);
				}
				local68.method566(Static72.method1334(new Class40[] { Class34.aClass40_444, Class14.aClass40_116 }), 239, 90, 0);
				Static25.method1603(0, 77, 479, 0);
			} else if (Class14.aClass40_112 == null) {
				@Pc(781) boolean local781;
				if (Class53.anInt1994 != -1) {
					local781 = Static20.method403(0, -1, Class53.anInt1994, 2, 0, 96, 0, 479);
					if (!local781) {
						Class41.aBoolean144 = true;
					}
				} else if (Class25.anInt980 == -1) {
					local75 = 0;
					local68 = Static95.aClass2_Sub2_Sub2_Sub2_5;
					Static25.method1613(0, 0, 463, 77);
					for (local87 = 0; local87 < 100; local87++) {
						if (Class2_Sub2_Sub13.aClass40Array30[local87] != null) {
							@Pc(218) int local218 = Class2_Sub6.anInt799 + 70 - local75 * 14;
							@Pc(222) int local222 = Class45.anIntArray469[local87];
							@Pc(224) byte local224 = 0;
							@Pc(228) Class40 local228 = Class2_Sub3_Sub1.aClass40Array40[local87];
							if (local228 != null && local228.method1168(Class2_Sub2_Sub10.aClass40_323)) {
								local228 = local228.method1185(5);
								local224 = 1;
							}
							if (local228 != null && local228.method1168(Class45_Sub1.aClass40_622)) {
								local228 = local228.method1185(5);
								local224 = 2;
							}
							if (local222 == 0) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.method575(Class2_Sub2_Sub13.aClass40Array30[local87], 4, local218, 0);
								}
							}
							@Pc(306) int local306;
							if ((local222 == 1 || local222 == 2) && (local222 == 1 || Class2_Sub2_Sub4.anInt583 == 0 || Class2_Sub2_Sub4.anInt583 == 1 && Static36.method729(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local306 = 4;
									if (local224 == 1) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(4, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local306, local218 - 12);
										local306 += 14;
									}
									local68.method575(Static72.method1334(new Class40[] { local228, Class2_Sub12.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.method575(Class2_Sub2_Sub13.aClass40Array30[local87], local306, local218, 255);
								}
							}
							if ((local222 == 3 || local222 == 7) && Class2_Sub2_Sub16.anInt2473 == 0 && (local222 == 7 || Class63.anInt2515 == 0 || Class63.anInt2515 == 1 && Static36.method729(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.method575(Class27.aClass40_340, 4, local218, 0);
									local306 = local68.method568(Class50.aClass40_564) + 4;
									if (local224 == 1) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[0].method1320(local306, local218 - 12);
										local306 += 14;
									}
									if (local224 == 2) {
										Static64.aClass2_Sub2_Sub2_Sub3Array8[1].method1320(local306, local218 - 12);
										local306 += 14;
									}
									local68.method575(Static72.method1334(new Class40[] { local228, Class2_Sub12.aClass40_673 }), local306, local218, 0);
									local306 += local68.method568(local228) + 8;
									local68.method575(Class2_Sub2_Sub13.aClass40Array30[local87], local306, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 4 && (Class62.anInt2491 == 0 || Class62.anInt2491 == 1 && Static36.method729(local228))) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static72.method1334(new Class40[] { local228, Class24.aClass40_716, Class2_Sub2_Sub13.aClass40Array30[local87] }), 4, local218, 8388736);
								}
							}
							if (local222 == 5 && Class2_Sub2_Sub16.anInt2473 == 0 && Class63.anInt2515 < 2) {
								if (local218 > 0 && local218 < 110) {
									local68.method575(Class2_Sub2_Sub13.aClass40Array30[local87], 4, local218, 8388608);
								}
								local75++;
							}
							if (local222 == 6 && Class2_Sub2_Sub16.anInt2473 == 0 && Class63.anInt2515 < 2) {
								local75++;
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static72.method1334(new Class40[] { Class2_Sub2_Sub15.aClass40_690, local228, Class2_Sub12.aClass40_673 }), 4, local218, 0);
									local68.method575(Class2_Sub2_Sub13.aClass40Array30[local87], local68.method568(Static72.method1334(new Class40[] { Class2_Sub2_Sub15.aClass40_690, local228 })) + 12, local218, 8388608);
								}
							}
							if (local222 == 8 && (Class62.anInt2491 == 0 || Class62.anInt2491 == 1 && Static36.method729(local228))) {
								if (local218 > 0 && local218 < 110) {
									local68.method575(Static72.method1334(new Class40[] { local228, Class24.aClass40_716, Class2_Sub2_Sub13.aClass40Array30[local87] }), 4, local218, 8270336);
								}
								local75++;
							}
						}
					}
					Static25.method1614();
					Class32.anInt1506 = local75 * 14 + 7;
					if (Class32.anInt1506 < 78) {
						Class32.anInt1506 = 78;
					}
					Static35.method711(77, 463, Class32.anInt1506 - Class2_Sub6.anInt799 - 77, 0, Class32.anInt1506);
					@Pc(709) Class40 local709;
					if (Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1 == null || Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395 == null) {
						local709 = Class2_Sub2_Sub12_Sub5.aClass40_591;
					} else {
						local709 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.aClass40_395;
					}
					local68.method575(Static72.method1334(new Class40[] { local709, Class2_Sub12.aClass40_673 }), 4, 90, 0);
					local68.method575(Static72.method1334(new Class40[] { Class34.aClass40_451, Class14.aClass40_116 }), local68.method568(Static72.method1334(new Class40[] { local709, Class1.aClass40_4 })) + 6, 90, 255);
					Static25.method1603(0, 77, 479, 0);
				} else {
					local781 = Static20.method403(0, -1, Class25.anInt980, 3, 0, 96, 0, 479);
					if (!local781) {
						Class41.aBoolean144 = true;
					}
				}
			} else {
				Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Class14.aClass40_112, 239, 40, 0);
				Static13.aClass2_Sub2_Sub2_Sub2_1.method566(Class2_Sub7.aClass40_252, 239, 60, 128);
			}
		}
		if (Class2_Sub12.aBoolean175 && Static1.anInt16 == 2) {
			Static22.method480();
		}
		Static4.method83(Static23.aGraphics1);
	}
}
