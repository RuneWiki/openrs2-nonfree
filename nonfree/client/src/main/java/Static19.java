import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public static int anInt568;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "J")
	public static long aLong14;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!ca;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Lclient!ta;")
	public static Class36_Sub1 aClass36_Sub1_5;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!i;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public static int anInt575;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_282 = Static2.method66(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!qd;")
	public static Class54 aClass54_9 = new Class54(64);

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!ke;")
	public static Class39 aClass39_283 = Static2.method66("backvmid1");

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_284 = Static2.method66(" (X");

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	public static int anInt574 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method424() {
		if (Static1.aClass24_1 == null) {
			return;
		}
		@Pc(14) long local14 = System.currentTimeMillis();
		if (Static94.aLong73 >= local14) {
			return;
		}
		Static1.aClass24_1.method1136(local14);
		@Pc(31) int local31 = (int) (local14 - Static94.aLong73);
		Static94.aLong73 = local14;
		@Pc(42) Class local42 = m.class;
		synchronized (m.class) {
			Static39.anInt1169 += local31 * Static57.anInt1657;
			@Pc(59) int local59 = (Static39.anInt1169 - Static57.anInt1657 * 2000) / 1000;
			if (local59 > 0) {
				if (Static96.aClass2_Sub4_1 != null) {
					Static96.aClass2_Sub4_1.method1655(local59);
				}
				Static39.anInt1169 -= local59 * 1000;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z")
	public static boolean method425() {
		if (Static85.aClass10_3 == null) {
			return false;
		}
		@Pc(137) int local137;
		try {
			@Pc(18) int local18 = Static85.aClass10_3.method259();
			if (local18 == 0) {
				return false;
			}
			if (Static95.anInt2513 == -1) {
				Static85.aClass10_3.method261(Static51.aClass2_Sub5_Sub1_4.aByteArray16, 1, 0);
				Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
				Static95.anInt2513 = Static51.aClass2_Sub5_Sub1_4.method1306();
				Static48.anInt1342 = Static62.anIntArray235[Static95.anInt2513];
				local18--;
			}
			if (Static48.anInt1342 == -1) {
				if (local18 <= 0) {
					return false;
				}
				Static85.aClass10_3.method261(Static51.aClass2_Sub5_Sub1_4.aByteArray16, 1, 0);
				local18--;
				Static48.anInt1342 = Static51.aClass2_Sub5_Sub1_4.aByteArray16[0] & 0xFF;
			}
			if (Static48.anInt1342 == -2) {
				if (local18 <= 1) {
					return false;
				}
				local18 -= 2;
				Static85.aClass10_3.method261(Static51.aClass2_Sub5_Sub1_4.aByteArray16, 2, 0);
				Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
				Static48.anInt1342 = Static51.aClass2_Sub5_Sub1_4.method1273();
			}
			if (local18 < Static48.anInt1342) {
				return false;
			}
			Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
			Static85.aClass10_3.method261(Static51.aClass2_Sub5_Sub1_4.aByteArray16, Static48.anInt1342, 0);
			Static12.anInt322 = 0;
			Static2.anInt90 = Static102.anInt2774;
			Static102.anInt2774 = Static8.anInt185;
			Static8.anInt185 = Static95.anInt2513;
			@Pc(141) int local141;
			@Pc(147) int local147;
			@Pc(133) int local133;
			if (Static95.anInt2513 == 192) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1276();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1273();
				local141 = Static51.aClass2_Sub5_Sub1_4.method1271();
				local147 = Static51.aClass2_Sub5_Sub1_4.method1273();
				@Pc(151) Class2_Sub1_Sub6 local151 = Static90.method1705(local133);
				Static95.anInt2513 = -1;
				local151.anInt724 = local147;
				local151.anInt691 = local141;
				local151.anInt693 = local137;
				return true;
			}
			if (Static95.anInt2513 == 157) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1261();
				Static97.method1856(local133);
				if (Static57.anInt1650 != -1) {
					Static22.method439(Static57.anInt1650);
					Static97.aBoolean120 = true;
					Static57.anInt1650 = -1;
					Static107.aBoolean121 = true;
				}
				if (Static7.anInt161 != -1) {
					Static22.method439(Static7.anInt161);
					Static7.anInt161 = -1;
					Static60.method1127(30);
				}
				if (Static88.anInt1137 != -1) {
					Static22.method439(Static88.anInt1137);
					Static88.anInt1137 = -1;
				}
				if (Static78.anInt2159 != -1) {
					Static22.method439(Static78.anInt2159);
					Static78.anInt2159 = -1;
				}
				if (Static99.anInt2696 != local133) {
					Static22.method439(Static99.anInt2696);
					Static99.anInt2696 = local133;
				}
				Static31.aBoolean91 = true;
				Static95.anInt2513 = -1;
				Static12.aBoolean14 = false;
				return true;
			}
			@Pc(250) int local250;
			if (Static95.anInt2513 == 242) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1284();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1261();
				local250 = local137 & 0x1F;
				local141 = local137 >> 10 & 0x1F;
				local147 = local137 >> 5 & 0x1F;
				@Pc(266) Class2_Sub1_Sub6 local266 = Static90.method1705(local133);
				Static95.anInt2513 = -1;
				local266.anInt713 = (local250 << 3) + (local141 << 19) + (local147 << 11);
				return true;
			}
			@Pc(301) Class39 local301;
			if (Static95.anInt2513 == 58) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1293();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1289();
				local301 = Static51.aClass2_Sub5_Sub1_4.method1250();
				if (local137 >= 1 && local137 <= 5) {
					if (local301.method1106(Static64.aClass39_831)) {
						local301 = null;
					}
					Static100.aClass39Array14[local137 - 1] = local301;
					Static58.aBooleanArray11[local137 - 1] = local133 == 0;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 39) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1273();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1281();
				local141 = Static51.aClass2_Sub5_Sub1_4.method1273();
				if (Static25.anInt723 != 0 && local137 != 0 && Static1.anInt1 < 50) {
					Static54.anIntArray210[Static1.anInt1] = local133;
					Static23.anIntArray70[Static1.anInt1] = local137;
					Static8.anIntArray26[Static1.anInt1] = local141;
					Static66.aClass56Array1[Static1.anInt1] = null;
					Static79.anIntArray335[Static1.anInt1] = 0;
					Static1.anInt1++;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 164) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1273();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1271();
				if (Static99.anInt2696 != -1) {
					Static22.method439(Static99.anInt2696);
					Static99.anInt2696 = -1;
					Static31.aBoolean91 = true;
				}
				if (Static7.anInt161 != -1) {
					Static22.method439(Static7.anInt161);
					Static7.anInt161 = -1;
					Static60.method1127(30);
				}
				if (Static88.anInt1137 != -1) {
					Static22.method439(Static88.anInt1137);
					Static88.anInt1137 = -1;
				}
				if (Static78.anInt2159 != local133) {
					Static22.method439(Static78.anInt2159);
					Static78.anInt2159 = local133;
				}
				if (Static57.anInt1650 != local137) {
					Static22.method439(Static57.anInt1650);
					Static57.anInt1650 = local137;
				}
				Static95.anInt2513 = -1;
				Static12.aBoolean14 = false;
				Static107.aBoolean121 = true;
				if (Static97.anInt2646 != 0) {
					Static31.aBoolean91 = true;
					Static97.anInt2646 = 0;
				}
				Static97.aBoolean120 = true;
				return true;
			}
			@Pc(496) Class2_Sub1_Sub6 local496;
			if (Static95.anInt2513 == 94) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1261();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1276();
				local496 = Static90.method1705(local137);
				if (local496 != null && local496.anInt700 == 0) {
					if (local133 < 0) {
						local133 = 0;
					}
					if (local496.anInt701 - local496.anInt725 < local133) {
						local133 = local496.anInt701 - local496.anInt725;
					}
					local496.anInt727 = local133;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 162) {
				Static65.method1360(false);
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 111) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1284();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1247();
				local496 = Static90.method1705(local133);
				local496.anInt718 = local137;
				Static95.anInt2513 = -1;
				local496.anInt711 = 1;
				return true;
			}
			if (Static95.anInt2513 == 226) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1261();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1294();
				local496 = Static90.method1705(local137);
				local496.anInt711 = 2;
				Static95.anInt2513 = -1;
				local496.anInt718 = local133;
				return true;
			}
			if (Static95.anInt2513 == 238) {
				for (local133 = 0; local133 < Static49.anInt1375; local133++) {
					@Pc(614) Class2_Sub1_Sub11 local614 = Static2.method65(local133);
					if (local614 != null && local614.anInt1894 == 0) {
						Static22.anIntArray68[local133] = 0;
						Static28.anIntArray89[local133] = 0;
					}
				}
				Static97.aBoolean120 = true;
				if (Static41.anInt1197 != -1) {
					Static31.aBoolean91 = true;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 34) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1292();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1253();
				local496 = Static90.method1705(local137);
				if (local133 != local496.anInt731 || local133 == -1) {
					local496.anInt702 = 0;
					local496.anInt731 = local133;
					local496.anInt689 = 0;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			@Pc(699) Class2_Sub1_Sub6 local699;
			if (Static95.anInt2513 == 209) {
				Static97.aBoolean120 = true;
				local133 = Static51.aClass2_Sub5_Sub1_4.method1276();
				local699 = Static90.method1705(local133);
				while (Static48.anInt1342 > Static51.aClass2_Sub5_Sub1_4.anInt1772) {
					local141 = Static51.aClass2_Sub5_Sub1_4.method1258();
					local147 = Static51.aClass2_Sub5_Sub1_4.method1273();
					local250 = Static51.aClass2_Sub5_Sub1_4.method1281();
					if (local250 == 255) {
						local250 = Static51.aClass2_Sub5_Sub1_4.method1276();
					}
					if (local141 >= 0 && local699.anIntArray75.length > local141) {
						local699.anIntArray75[local141] = local147;
						local699.anIntArray78[local141] = local250;
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 234) {
				Static76.anInt2104 = Static51.aClass2_Sub5_Sub1_4.method1293();
				Static107.anInt2656 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 116) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1271();
				@Pc(779) byte local779 = Static51.aClass2_Sub5_Sub1_4.method1282();
				Static22.anIntArray68[local133] = local779;
				if (Static28.anIntArray89[local133] != local779) {
					Static28.anIntArray89[local133] = local779;
					Static28.method563(local133);
					Static97.aBoolean120 = true;
					if (Static41.anInt1197 != -1) {
						Static31.aBoolean91 = true;
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			@Pc(817) long local817;
			if (Static95.anInt2513 == 153) {
				local817 = Static51.aClass2_Sub5_Sub1_4.method1291();
				local301 = Static20.method429(Static51.aClass2_Sub5_Sub1_4).method1118();
				Static87.method1642(local301, 6, Static24.method488(local817).method1120());
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 147) {
				Static101.method1963();
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 165) {
				@Pc(865) boolean local865 = Static51.aClass2_Sub5_Sub1_4.method1264() == 1;
				local137 = Static51.aClass2_Sub5_Sub1_4.method1276();
				local496 = Static90.method1705(local137);
				Static95.anInt2513 = -1;
				local496.aBoolean41 = local865;
				return true;
			}
			if (Static95.anInt2513 == 201) {
				Static95.anInt2513 = -1;
				Static7.aBoolean5 = false;
				Static86.aClass39_1049 = Static86.aClass39_1048;
				Static31.aBoolean91 = true;
				Static97.anInt2646 = 2;
				return true;
			}
			@Pc(961) int local961;
			@Pc(977) int local977;
			if (Static95.anInt2513 == 163) {
				Static87.aBoolean103 = true;
				Static58.anInt1679 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static40.anInt1173 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static24.anInt658 = Static51.aClass2_Sub5_Sub1_4.method1273();
				Static55.anInt1567 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static46.anInt1243 = Static51.aClass2_Sub5_Sub1_4.method1281();
				if (Static46.anInt1243 >= 100) {
					local137 = Static40.anInt1173 * 128 + 64;
					local133 = Static58.anInt1679 * 128 + 64;
					local141 = Static51.method1779(local137, local133, Static18.anInt560) - Static24.anInt658;
					local147 = local133 - Static88.anInt1136;
					local961 = local137 - Static41.anInt1188;
					local250 = local141 - Static5.anInt100;
					local977 = (int) Math.sqrt((double) (local961 * local961 + local147 * local147));
					Static64.anInt1897 = (int) (Math.atan2((double) local250, (double) local977) * 325.949D) & 0x7FF;
					Static41.anInt1190 = (int) (-325.949D * Math.atan2((double) local147, (double) local961)) & 0x7FF;
					if (Static64.anInt1897 < 128) {
						Static64.anInt1897 = 128;
					}
					if (Static64.anInt1897 > 383) {
						Static64.anInt1897 = 383;
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 221) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1273();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1253();
				Static22.anIntArray68[local133] = local137;
				if (Static28.anIntArray89[local133] != local137) {
					Static28.anIntArray89[local133] = local137;
					Static28.method563(local133);
					Static97.aBoolean120 = true;
					if (Static41.anInt1197 != -1) {
						Static31.aBoolean91 = true;
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 98) {
				Static6.anInt2870 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static96.anInt2634 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static78.anInt2150 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static31.aBoolean91 = true;
				Static53.aBoolean80 = true;
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 133) {
				for (local133 = 0; local133 < Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1.length; local133++) {
					if (Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local133] != null) {
						Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[local133].anInt2901 = -1;
					}
				}
				for (local137 = 0; local137 < Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1.length; local137++) {
					if (Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local137] != null) {
						Static27.aClass2_Sub1_Sub2_Sub3_Sub2Array1[local137].anInt2901 = -1;
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 29) {
				Static27.method556(Static48.anInt1342, Static51.aClass2_Sub5_Sub1_4, Static61.aClass12_3);
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 28) {
				Static7.aBoolean5 = false;
				Static86.aClass39_1049 = Static86.aClass39_1048;
				Static31.aBoolean91 = true;
				Static95.anInt2513 = -1;
				Static97.anInt2646 = 1;
				return true;
			}
			if (Static95.anInt2513 == 130) {
				if (Static77.anInt2108 == 12) {
					Static97.aBoolean120 = true;
				}
				Static47.anInt1329 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 173) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1261();
				Static97.method1856(local133);
				if (Static57.anInt1650 != -1) {
					Static22.method439(Static57.anInt1650);
					Static57.anInt1650 = -1;
					Static107.aBoolean121 = true;
					Static97.aBoolean120 = true;
				}
				if (Static99.anInt2696 != -1) {
					Static22.method439(Static99.anInt2696);
					Static99.anInt2696 = -1;
					Static31.aBoolean91 = true;
				}
				if (Static7.anInt161 != -1) {
					Static22.method439(Static7.anInt161);
					Static7.anInt161 = -1;
					Static60.method1127(30);
				}
				if (Static88.anInt1137 != -1) {
					Static22.method439(Static88.anInt1137);
					Static88.anInt1137 = -1;
				}
				if (Static78.anInt2159 != local133) {
					Static22.method439(Static78.anInt2159);
					Static78.anInt2159 = local133;
				}
				if (Static97.anInt2646 != 0) {
					Static97.anInt2646 = 0;
					Static31.aBoolean91 = true;
				}
				Static95.anInt2513 = -1;
				Static12.aBoolean14 = false;
				return true;
			}
			if (Static95.anInt2513 == 183) {
				for (local133 = 0; local133 < Static28.anIntArray89.length; local133++) {
					if (Static28.anIntArray89[local133] != Static22.anIntArray68[local133]) {
						Static28.anIntArray89[local133] = Static22.anIntArray68[local133];
						Static28.method563(local133);
						Static97.aBoolean120 = true;
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 127) {
				Static65.method1360(true);
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 139) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1292();
				if (local133 >= 0) {
					Static97.method1856(local133);
				}
				if (Static47.anInt1323 != local133) {
					Static22.method439(Static47.anInt1323);
					Static47.anInt1323 = local133;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 57) {
				Static66.anInt1920 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 241) {
				Static41.anInt1196 = Static48.anInt1342 / 8;
				for (local133 = 0; local133 < Static41.anInt1196; local133++) {
					Static30.aLongArray3[local133] = Static51.aClass2_Sub5_Sub1_4.method1291();
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 74) {
				local817 = Static51.aClass2_Sub5_Sub1_4.method1291();
				local141 = Static51.aClass2_Sub5_Sub1_4.method1273();
				@Pc(1412) Class39 local1412 = Static24.method488(local817).method1120();
				for (local250 = 0; local250 < Static72.anInt2061; local250++) {
					if (local817 == Static1.aLongArray1[local250]) {
						if (local141 != Static45.anIntArray177[local250]) {
							Static45.anIntArray177[local250] = local141;
							Static97.aBoolean120 = true;
							if (local141 > 0) {
								Static87.method1642(Static20.method431(new Class39[] { local1412, Static78.aClass39_971 }), 5, Static86.aClass39_1048);
							}
							if (local141 == 0) {
								Static87.method1642(Static20.method431(new Class39[] { local1412, Static54.aClass39_672 }), 5, Static86.aClass39_1048);
							}
						}
						local1412 = null;
						break;
					}
				}
				if (local1412 != null && Static72.anInt2061 < 200) {
					Static1.aLongArray1[Static72.anInt2061] = local817;
					Static75.aClass39Array4[Static72.anInt2061] = local1412;
					Static45.anIntArray177[Static72.anInt2061] = local141;
					Static72.anInt2061++;
					Static97.aBoolean120 = true;
				}
				@Pc(1513) boolean local1513 = false;
				while (!local1513) {
					local1513 = true;
					for (local977 = 0; local977 < Static72.anInt2061 - 1; local977++) {
						if (Static88.anInt1141 != Static45.anIntArray177[local977] && Static88.anInt1141 == Static45.anIntArray177[local977 + 1] || Static45.anIntArray177[local977] == 0 && Static45.anIntArray177[local977 + 1] != 0) {
							local1513 = false;
							@Pc(1557) int local1557 = Static45.anIntArray177[local977];
							Static45.anIntArray177[local977] = Static45.anIntArray177[local977 + 1];
							Static45.anIntArray177[local977 + 1] = local1557;
							@Pc(1575) Class39 local1575 = Static75.aClass39Array4[local977];
							Static75.aClass39Array4[local977] = Static75.aClass39Array4[local977 + 1];
							Static75.aClass39Array4[local977 + 1] = local1575;
							@Pc(1593) long local1593 = Static1.aLongArray1[local977];
							Static1.aLongArray1[local977] = Static1.aLongArray1[local977 + 1];
							Static1.aLongArray1[local977 + 1] = local1593;
							Static97.aBoolean120 = true;
						}
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 101) {
				anInt574 = Static51.aClass2_Sub5_Sub1_4.method1271();
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 76) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1261();
				Static97.method1856(local133);
				if (Static99.anInt2696 != -1) {
					Static22.method439(Static99.anInt2696);
					Static99.anInt2696 = -1;
					Static31.aBoolean91 = true;
				}
				if (Static7.anInt161 != -1) {
					Static22.method439(Static7.anInt161);
					Static7.anInt161 = -1;
					Static60.method1127(30);
				}
				if (Static88.anInt1137 != -1) {
					Static22.method439(Static88.anInt1137);
					Static88.anInt1137 = -1;
				}
				if (Static78.anInt2159 != -1) {
					Static22.method439(Static78.anInt2159);
					Static78.anInt2159 = -1;
				}
				if (Static57.anInt1650 != local133) {
					Static22.method439(Static57.anInt1650);
					Static57.anInt1650 = local133;
				}
				Static97.aBoolean120 = true;
				Static107.aBoolean121 = true;
				Static95.anInt2513 = -1;
				Static12.aBoolean14 = false;
				if (Static97.anInt2646 != 0) {
					Static31.aBoolean91 = true;
					Static97.anInt2646 = 0;
				}
				return true;
			}
			if (Static95.anInt2513 == 196) {
				Static45.anInt1235 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static95.anInt2513 = -1;
				return true;
			}
			@Pc(1745) Class2_Sub1_Sub6 local1745;
			if (Static95.anInt2513 == 0) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1253();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1271();
				local141 = Static51.aClass2_Sub5_Sub1_4.method1247();
				local1745 = Static90.method1705(local133);
				Static95.anInt2513 = -1;
				local1745.anInt737 = (local141 << 16) + local137;
				return true;
			}
			if (Static95.anInt2513 == 167) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1288();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1284();
				local141 = Static51.aClass2_Sub5_Sub1_4.method1292();
				local1745 = Static90.method1705(local137);
				Static95.anInt2513 = -1;
				local1745.anInt732 = local133 + local1745.anInt699;
				local1745.anInt703 = local141 + local1745.anInt734;
				return true;
			}
			if (Static95.anInt2513 == 191) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1276();
				local699 = Static90.method1705(local133);
				local699.anInt711 = 3;
				local699.anInt718 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.aClass35_2.method910();
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 137) {
				Static97.aBoolean120 = true;
				local133 = Static51.aClass2_Sub5_Sub1_4.method1276();
				local699 = Static90.method1705(local133);
				local141 = Static51.aClass2_Sub5_Sub1_4.method1273();
				for (local147 = 0; local147 < local141; local147++) {
					local250 = Static51.aClass2_Sub5_Sub1_4.method1281();
					if (local250 == 255) {
						local250 = Static51.aClass2_Sub5_Sub1_4.method1253();
					}
					local699.anIntArray75[local147] = Static51.aClass2_Sub5_Sub1_4.method1271();
					local699.anIntArray78[local147] = local250;
				}
				for (local250 = local141; local250 < local699.anIntArray75.length; local250++) {
					local699.anIntArray75[local250] = 0;
					local699.anIntArray78[local250] = 0;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 93) {
				Static104.anInt2782 = Static51.aClass2_Sub5_Sub1_4.method1247() * 30;
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 194) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1271();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1271();
				Static97.method1856(local133);
				if (local137 != -1) {
					Static97.method1856(local137);
				}
				if (Static78.anInt2159 != -1) {
					Static22.method439(Static78.anInt2159);
					Static78.anInt2159 = -1;
				}
				if (Static57.anInt1650 != -1) {
					Static22.method439(Static57.anInt1650);
					Static57.anInt1650 = -1;
				}
				if (Static99.anInt2696 != -1) {
					Static22.method439(Static99.anInt2696);
					Static99.anInt2696 = -1;
				}
				if (Static7.anInt161 != local133) {
					Static22.method439(Static7.anInt161);
					Static7.anInt161 = local133;
					Static60.method1127(35);
				}
				if (local133 != Static88.anInt1137) {
					Static22.method439(Static88.anInt1137);
					Static88.anInt1137 = local137;
				}
				Static97.anInt2646 = 0;
				Static12.aBoolean14 = false;
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 252) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1273();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1253();
				local141 = Static51.aClass2_Sub5_Sub1_4.method1271();
				local1745 = Static90.method1705(local137);
				if (local133 == 65535) {
					local1745.anInt711 = 0;
					Static95.anInt2513 = -1;
					return true;
				}
				@Pc(2030) Class2_Sub1_Sub7 local2030 = Static66.method1384(local133);
				local1745.anInt693 = local2030.anInt1284;
				Static95.anInt2513 = -1;
				local1745.anInt718 = local133;
				local1745.anInt724 = local2030.anInt1300;
				local1745.anInt711 = 4;
				local1745.anInt691 = local2030.anInt1289 * 100 / local141;
				return true;
			}
			if (Static95.anInt2513 == 45) {
				if (Static77.anInt2108 == 12) {
					Static97.aBoolean120 = true;
				}
				Static4.anInt96 = Static51.aClass2_Sub5_Sub1_4.method1269();
				Static95.anInt2513 = -1;
				return true;
			}
			@Pc(2122) long local2122;
			@Pc(2085) Class39 local2085;
			if (Static95.anInt2513 == 7) {
				local2085 = Static51.aClass2_Sub5_Sub1_4.method1250();
				@Pc(2124) boolean local2124;
				@Pc(2118) Class39 local2118;
				if (local2085.method1116(Static100.aClass39_1250)) {
					local2118 = local2085.method1115(0, local2085.method1100(Static10.aClass39_118));
					local2122 = local2118.method1090();
					local2124 = false;
					for (local961 = 0; local961 < Static41.anInt1196; local961++) {
						if (Static30.aLongArray3[local961] == local2122) {
							local2124 = true;
							break;
						}
					}
					if (!local2124 && Static49.anInt1373 == 0) {
						Static87.method1642(Static8.aClass39_81, 4, local2118);
					}
				} else if (local2085.method1116(Static73.aClass39_920)) {
					local2118 = local2085.method1115(0, local2085.method1100(Static10.aClass39_118));
					local2122 = local2118.method1090();
					local2124 = false;
					for (local961 = 0; local961 < Static41.anInt1196; local961++) {
						if (Static30.aLongArray3[local961] == local2122) {
							local2124 = true;
							break;
						}
					}
					if (!local2124 && Static49.anInt1373 == 0) {
						Static87.method1642(Static51.aClass39_1127, 8, local2118);
					}
				} else if (local2085.method1116(Static105.aClass39_1277)) {
					local2118 = local2085.method1115(0, local2085.method1100(Static10.aClass39_118));
					local2122 = local2118.method1090();
					local2124 = false;
					for (local961 = 0; local961 < Static41.anInt1196; local961++) {
						if (local2122 == Static30.aLongArray3[local961]) {
							local2124 = true;
							break;
						}
					}
					if (!local2124 && Static49.anInt1373 == 0) {
						@Pc(2170) Class39 local2170 = local2085.method1115(local2085.method1100(Static10.aClass39_118) + 1, local2085.method1088() + -9);
						Static87.method1642(local2170, 8, local2118);
					}
				} else {
					Static87.method1642(local2085, 0, Static86.aClass39_1048);
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 108) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1275();
				if (Static41.anInt1197 != local133) {
					Static22.method439(Static41.anInt1197);
					Static41.anInt1197 = local133;
				}
				Static31.aBoolean91 = true;
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 63) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1273();
				if (local133 == 65535) {
					local133 = -1;
				}
				local137 = Static51.aClass2_Sub5_Sub1_4.method1289();
				if (Static25.anIntArray81[local137] != local133) {
					Static22.method439(Static25.anIntArray81[local137]);
					Static25.anIntArray81[local137] = local133;
				}
				Static97.aBoolean120 = true;
				Static107.aBoolean121 = true;
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 41) {
				Static107.anInt2656 = Static51.aClass2_Sub5_Sub1_4.method1289();
				Static76.anInt2104 = Static51.aClass2_Sub5_Sub1_4.method1281();
				for (local133 = Static76.anInt2104; local133 < Static76.anInt2104 + 8; local133++) {
					for (local137 = Static107.anInt2656; local137 < Static107.anInt2656 + 8; local137++) {
						if (Static55.aClass34ArrayArrayArray1[Static18.anInt560][local133][local137] != null) {
							Static55.aClass34ArrayArrayArray1[Static18.anInt560][local133][local137] = null;
							Static84.method2052(local137, local133);
						}
					}
				}
				for (@Pc(2411) Class2_Sub3 local2411 = (Class2_Sub3) Static89.aClass34_44.method872(); local2411 != null; local2411 = (Class2_Sub3) Static89.aClass34_44.method879()) {
					if (Static76.anInt2104 <= local2411.anInt500 && Static76.anInt2104 + 8 > local2411.anInt500 && local2411.anInt497 >= Static107.anInt2656 && local2411.anInt497 < Static107.anInt2656 + 8 && Static18.anInt560 == local2411.anInt495) {
						local2411.anInt499 = 0;
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 66) {
				Static7.anInt151 = Static51.aClass2_Sub5_Sub1_4.method1281();
				if (Static7.anInt151 == 1) {
					Static47.anInt1324 = Static51.aClass2_Sub5_Sub1_4.method1273();
				}
				if (Static7.anInt151 >= 2 && Static7.anInt151 <= 6) {
					if (Static7.anInt151 == 2) {
						Static64.anInt1896 = 64;
						Static95.anInt2504 = 64;
					}
					if (Static7.anInt151 == 3) {
						Static95.anInt2504 = 0;
						Static64.anInt1896 = 64;
					}
					if (Static7.anInt151 == 4) {
						Static95.anInt2504 = 128;
						Static64.anInt1896 = 64;
					}
					if (Static7.anInt151 == 5) {
						Static64.anInt1896 = 0;
						Static95.anInt2504 = 64;
					}
					if (Static7.anInt151 == 6) {
						Static95.anInt2504 = 64;
						Static64.anInt1896 = 128;
					}
					Static7.anInt151 = 2;
					Static18.anInt547 = Static51.aClass2_Sub5_Sub1_4.method1273();
					Static107.anInt2654 = Static51.aClass2_Sub5_Sub1_4.method1273();
					Static80.anInt2189 = Static51.aClass2_Sub5_Sub1_4.method1281();
				}
				if (Static7.anInt151 == 10) {
					Static82.anInt2220 = Static51.aClass2_Sub5_Sub1_4.method1273();
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 6) {
				Static6.method2062();
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 110) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1284();
				local699 = Static90.method1705(local133);
				for (local141 = 0; local141 < local699.anIntArray75.length; local141++) {
					local699.anIntArray75[local141] = -1;
					local699.anIntArray75[local141] = 0;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 103) {
				Static97.aBoolean120 = true;
				local133 = Static51.aClass2_Sub5_Sub1_4.method1281();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1253();
				local141 = Static51.aClass2_Sub5_Sub1_4.method1264();
				Static105.anIntArray351[local141] = local137;
				Static46.anIntArray178[local141] = local133;
				Static20.anIntArray65[local141] = 1;
				for (local147 = 0; local147 < 98; local147++) {
					if (Class55.anIntArray300[local147] <= local137) {
						Static20.anIntArray65[local141] = local147 + 2;
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 161) {
				Static18.anInt526 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static97.aBoolean120 = true;
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 247) {
				local2085 = Static51.aClass2_Sub5_Sub1_4.method1250();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1284();
				local496 = Static90.method1705(local137);
				local496.aClass39_341 = local2085;
				if (local137 >> 16 == Static25.anIntArray81[Static77.anInt2108]) {
					Static97.aBoolean120 = true;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 218) {
				Static71.anInt2035 = Static51.aClass2_Sub5_Sub1_4.method1289();
				if (Static71.anInt2035 == Static77.anInt2108) {
					Static97.aBoolean120 = true;
					if (Static71.anInt2035 == 3) {
						Static77.anInt2108 = 1;
					} else {
						Static77.anInt2108 = 3;
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 91) {
				Static87.aBoolean103 = true;
				Static55.anInt1553 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static50.anInt1407 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static89.anInt2357 = Static51.aClass2_Sub5_Sub1_4.method1273();
				Static31.anInt1763 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static12.anInt313 = Static51.aClass2_Sub5_Sub1_4.method1281();
				if (Static12.anInt313 >= 100) {
					Static88.anInt1136 = Static55.anInt1553 * 128 + 64;
					Static41.anInt1188 = Static50.anInt1407 * 128 + 64;
					Static5.anInt100 = Static51.method1779(Static41.anInt1188, Static88.anInt1136, Static18.anInt560) - Static89.anInt2357;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 46) {
				local817 = Static51.aClass2_Sub5_Sub1_4.method1291();
				local2122 = Static51.aClass2_Sub5_Sub1_4.method1273();
				@Pc(2801) long local2801 = (long) Static51.aClass2_Sub5_Sub1_4.method1255();
				local977 = Static51.aClass2_Sub5_Sub1_4.method1281();
				@Pc(2807) boolean local2807 = false;
				@Pc(2813) long local2813 = (local2122 << 32) + local2801;
				for (@Pc(2815) int local2815 = 0; local2815 < 100; local2815++) {
					if (local2813 == Static69.aLongArray6[local2815]) {
						local2807 = true;
						break;
					}
				}
				if (local977 <= 1) {
					for (@Pc(2842) int local2842 = 0; local2842 < Static41.anInt1196; local2842++) {
						if (local817 == Static30.aLongArray3[local2842]) {
							local2807 = true;
							break;
						}
					}
				}
				if (!local2807 && Static49.anInt1373 == 0) {
					Static69.aLongArray6[Static41.anInt1195] = local2813;
					Static41.anInt1195 = (Static41.anInt1195 + 1) % 100;
					@Pc(2882) Class39 local2882 = Static20.method429(Static51.aClass2_Sub5_Sub1_4).method1118();
					if (local977 == 2 || local977 == 3) {
						Static87.method1642(local2882, 7, Static20.method431(new Class39[] { Static18.aClass39_279, Static24.method488(local817).method1120() }));
					} else if (local977 == 1) {
						Static87.method1642(local2882, 7, Static20.method431(new Class39[] { Static46.aClass39_575, Static24.method488(local817).method1120() }));
					} else {
						Static87.method1642(local2882, 3, Static24.method488(local817).method1120());
					}
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 90) {
				Static87.aBoolean103 = false;
				for (local133 = 0; local133 < 5; local133++) {
					Static108.aBooleanArray17[local133] = false;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 83 || Static95.anInt2513 == 80 || Static95.anInt2513 == 187 || Static95.anInt2513 == 200 || Static95.anInt2513 == 51 || Static95.anInt2513 == 249 || Static95.anInt2513 == 60 || Static95.anInt2513 == 85 || Static95.anInt2513 == 171 || Static95.anInt2513 == 210 || Static95.anInt2513 == 37) {
				Static97.method1854();
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 1) {
				Static77.anInt2108 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static97.aBoolean120 = true;
				Static95.anInt2513 = -1;
				Static107.aBoolean121 = true;
				return true;
			}
			if (Static95.anInt2513 == 228) {
				if (Static57.anInt1650 != -1) {
					Static22.method439(Static57.anInt1650);
					Static97.aBoolean120 = true;
					Static107.aBoolean121 = true;
					Static57.anInt1650 = -1;
				}
				if (Static99.anInt2696 != -1) {
					Static22.method439(Static99.anInt2696);
					Static31.aBoolean91 = true;
					Static99.anInt2696 = -1;
				}
				if (Static7.anInt161 != -1) {
					Static22.method439(Static7.anInt161);
					Static7.anInt161 = -1;
					Static60.method1127(30);
				}
				if (Static88.anInt1137 != -1) {
					Static22.method439(Static88.anInt1137);
					Static88.anInt1137 = -1;
				}
				if (Static78.anInt2159 != -1) {
					Static22.method439(Static78.anInt2159);
					Static78.anInt2159 = -1;
				}
				Static95.anInt2513 = -1;
				Static12.aBoolean14 = false;
				if (Static97.anInt2646 != 0) {
					Static31.aBoolean91 = true;
					Static97.anInt2646 = 0;
				}
				return true;
			}
			if (Static95.anInt2513 == 207) {
				Static95.anInt2513 = -1;
				Static12.anInt325 = 0;
				return true;
			}
			if (Static95.anInt2513 == 184) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1281();
				local137 = Static51.aClass2_Sub5_Sub1_4.method1281();
				local141 = Static51.aClass2_Sub5_Sub1_4.method1281();
				local147 = Static51.aClass2_Sub5_Sub1_4.method1281();
				Static108.aBooleanArray17[local133] = true;
				Static1.anIntArray1[local133] = local137;
				Static2.anIntArray9[local133] = local141;
				Static69.anIntArray249[local133] = local147;
				Static6.anIntArray362[local133] = 0;
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 118) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1261();
				if (local133 == 65535) {
					local133 = -1;
				}
				if (local133 == -1 && Static31.anInt1773 == 0) {
					Static73.method1495();
				} else if (local133 != -1 && local133 != Static38.anInt1156 && Static79.anInt2768 != 0 && Static31.anInt1773 == 0) {
					Static73.method1491(Static79.anInt2768, 0, Static50.aClass36_Sub1_12, local133);
				}
				Static38.anInt1156 = local133;
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 169) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1247();
				if (local133 == 65535) {
					local133 = -1;
				}
				local137 = Static51.aClass2_Sub5_Sub1_4.method1283();
				if (Static79.anInt2768 != 0 && local133 != -1) {
					Static73.method1502(1, Static49.aClass36_Sub1_11, Static79.anInt2768, local133);
					Static31.anInt1773 = local137;
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 102) {
				local133 = Static51.aClass2_Sub5_Sub1_4.method1276();
				Static85.aClass19_7 = Static61.aClass12_3.method325(local133);
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 126) {
				Static107.anInt2656 = Static51.aClass2_Sub5_Sub1_4.method1289();
				Static76.anInt2104 = Static51.aClass2_Sub5_Sub1_4.method1264();
				while (Static48.anInt1342 > Static51.aClass2_Sub5_Sub1_4.anInt1772) {
					Static95.anInt2513 = Static51.aClass2_Sub5_Sub1_4.method1281();
					Static97.method1854();
				}
				Static95.anInt2513 = -1;
				return true;
			}
			if (Static95.anInt2513 == 152) {
				Static2.method56();
				Static95.anInt2513 = -1;
				return false;
			}
			Static108.method2075(null, "T1 - " + Static95.anInt2513 + "," + Static102.anInt2774 + "," + Static2.anInt90 + " - " + Static48.anInt1342);
			Static2.method56();
		} catch (@Pc(3358) IOException local3358) {
			Static102.method1975();
		} catch (@Pc(3362) Exception local3362) {
			@Pc(3402) String local3402 = "T2 - " + Static95.anInt2513 + "," + Static102.anInt2774 + "," + Static2.anInt90 + " - " + Static48.anInt1342 + "," + (anInt575 + Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0]) + "," + (Static75.anInt454 + Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]) + " - ";
			for (local137 = 0; Static48.anInt1342 > local137 && local137 < 50; local137++) {
				local3402 = local3402 + Static51.aClass2_Sub5_Sub1_4.aByteArray16[local137] + ",";
			}
			Static108.method2075(local3362, local3402);
			Static2.method56();
		}
		return true;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method426(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method427() {
		aClass39_284 = null;
		aClass39_283 = null;
		aClass36_Sub1_5 = null;
		aClass10_1 = null;
		anIntArrayArray6 = null;
		aClass39_282 = null;
		aClass30_1 = null;
		aClass54_9 = null;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V")
	public static void method428() {
		Static61.aClass54_18.method1635();
	}
}
