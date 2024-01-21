import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub1_Sub1_30;

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Lclient!re;")
	public static Class9 aClass9_30;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
	public static int[] anIntArray173 = new int[50];

	@OriginalMember(owner = "client!la", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[104][104];

	@OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
	public static int[] anIntArray174 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!la", name = "p", descriptor = "[Lclient!fc;")
	public static Class24[] aClass24Array1 = new Class24[16];

	@OriginalMember(owner = "client!la", name = "q", descriptor = "Lclient!e;")
	public static Class16 aClass16_52 = new Class16(64);

	@OriginalMember(owner = "client!la", name = "u", descriptor = "Lclient!da;")
	public static Class13 aClass13_38 = new Class13();

	@OriginalMember(owner = "client!la", name = "B", descriptor = "Lclient!u;")
	private static Class74 aClass74_998 = Static72.method1077("Could not complete login)3");

	@OriginalMember(owner = "client!la", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_995 = aClass74_998;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Lclient!u;")
	public static Class74 aClass74_996 = Static72.method1077("jolt");

	@OriginalMember(owner = "client!la", name = "y", descriptor = "Lclient!u;")
	public static Class74 aClass74_997 = Static72.method1077("AUS");

	@OriginalMember(owner = "client!la", name = "A", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array9 = new Class74[5];

	@OriginalMember(owner = "client!la", name = "C", descriptor = "Lclient!u;")
	private static Class74 aClass74_999 = Static72.method1077("wishes to duel with you)3");

	@OriginalMember(owner = "client!la", name = "D", descriptor = "Lclient!u;")
	public static Class74 aClass74_1000 = aClass74_999;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Z")
	public static boolean method997() {
		if (Static88.aClass62_4 == null) {
			return false;
		}
		@Pc(217) int local217;
		try {
			@Pc(15) int local15 = Static88.aClass62_4.method1350();
			if (local15 == 0) {
				return false;
			}
			if (Static35.anInt2888 == -1) {
				Static88.aClass62_4.method1345(Static19.aClass2_Sub10_Sub1_1.aByteArray27, 1, 0);
				Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
				Static35.anInt2888 = Static19.aClass2_Sub10_Sub1_1.method1536();
				Static16.anInt463 = Static91.anIntArray266[Static35.anInt2888];
				local15--;
			}
			if (Static16.anInt463 == -1) {
				if (local15 <= 0) {
					return false;
				}
				local15--;
				Static88.aClass62_4.method1345(Static19.aClass2_Sub10_Sub1_1.aByteArray27, 1, 0);
				Static16.anInt463 = Static19.aClass2_Sub10_Sub1_1.aByteArray27[0] & 0xFF;
			}
			if (Static16.anInt463 == -2) {
				if (local15 <= 1) {
					return false;
				}
				local15 -= 2;
				Static88.aClass62_4.method1345(Static19.aClass2_Sub10_Sub1_1.aByteArray27, 2, 0);
				Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
				Static16.anInt463 = Static19.aClass2_Sub10_Sub1_1.method1517();
			}
			if (Static16.anInt463 > local15) {
				return false;
			}
			Static19.aClass2_Sub10_Sub1_1.anInt2187 = 0;
			Static88.aClass62_4.method1345(Static19.aClass2_Sub10_Sub1_1.aByteArray27, Static16.anInt463, 0);
			Static30.anInt720 = 0;
			Static5.anInt61 = Static97.anInt2894;
			Static97.anInt2894 = Static81.anInt1790;
			Static81.anInt1790 = Static35.anInt2888;
			@Pc(144) int local144;
			@Pc(129) Class74 local129;
			if (Static35.anInt2888 == 136) {
				local129 = Static19.aClass2_Sub10_Sub1_1.method1530();
				@Pc(136) Object[] local136 = new Object[local129.method1695() + 1];
				for (local144 = local129.method1695() - 1; local144 >= 0; local144--) {
					if (local129.method1703(local144) == 115) {
						local136[local144 + 1] = Static19.aClass2_Sub10_Sub1_1.method1530();
					} else {
						local136[local144 + 1] = Integer.valueOf(Static19.aClass2_Sub10_Sub1_1.method1532());
					}
				}
				local136[0] = Integer.valueOf(Static19.aClass2_Sub10_Sub1_1.method1532());
				Static45.method732(null, local136, 0, 0, null, 0);
				Static35.anInt2888 = -1;
				return true;
			}
			@Pc(213) int local213;
			if (Static35.anInt2888 == 233) {
				Static114.anInt2460 = Static19.aClass2_Sub10_Sub1_1.method1490();
				Static36.anInt867 = Static19.aClass2_Sub10_Sub1_1.method1503();
				for (local213 = Static36.anInt867; local213 < Static36.anInt867 + 8; local213++) {
					for (local217 = Static114.anInt2460; local217 < Static114.anInt2460 + 8; local217++) {
						if (Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local213][local217] != null) {
							Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local213][local217] = null;
							Static121.method1782(local217, local213);
						}
					}
				}
				for (@Pc(266) Class2_Sub8 local266 = (Class2_Sub8) Static104.aClass13_66.method415(); local266 != null; local266 = (Class2_Sub8) Static104.aClass13_66.method414()) {
					if (Static36.anInt867 <= local266.anInt921 && local266.anInt921 < Static36.anInt867 + 8 && local266.anInt933 >= Static114.anInt2460 && local266.anInt933 < Static114.anInt2460 + 8 && local266.anInt919 == Static117.anInt2529) {
						local266.anInt932 = 0;
					}
				}
				Static35.anInt2888 = -1;
				return true;
			}
			@Pc(333) Class2_Sub2_Sub17 local333;
			if (Static35.anInt2888 == 190) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1502();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1480();
				local333 = Static41.method668(local213);
				Static35.anInt2888 = -1;
				if (local217 != local333.anInt2811 || local217 == -1) {
					local333.anInt2805 = 0;
					local333.anInt2776 = 0;
					local333.anInt2811 = local217;
				}
				return true;
			}
			if (Static35.anInt2888 == 11) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1503();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1490();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static117.anInt2529 = local213 >> 1;
				Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.method1867((local213 & 0x1) == 1, local217, local144);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 158) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1525();
				Static102.method1569(local213);
				Static35.anInt2888 = -1;
				Static46.anInt1051 = Static107.anInt2338;
				return true;
			}
			if (Static35.anInt2888 == 74) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1502();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1517();
				Static45.anIntArray125[local217] = local213;
				if (Static88.anIntArray260[local217] != local213) {
					Static88.anIntArray260[local217] = local213;
					Static41.method674(local217);
					if (Static83.anInt1804 != -1) {
						Static55.aBoolean16 = true;
					}
					Static116.aBoolean107 = true;
				}
				Static46.anInt1053 = Static107.anInt2338;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 83) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1525();
				Static38.method652(local213);
				if (Static42.anInt982 != -1) {
					Static126.method1922(Static42.anInt982);
					Static55.aBoolean16 = true;
					Static42.anInt982 = -1;
				}
				if (Static14.anInt401 != -1) {
					Static126.method1922(Static14.anInt401);
					Static14.anInt401 = -1;
					Static106.method1597(30);
				}
				if (Static98.anInt2115 != -1) {
					Static126.method1922(Static98.anInt2115);
					Static98.anInt2115 = -1;
				}
				if (Static90.anInt1905 != -1) {
					Static126.method1922(Static90.anInt1905);
					Static90.anInt1905 = -1;
				}
				if (Static66.anInt1458 == local213) {
					Static123.method1854(Static66.anInt1458);
				} else {
					Static126.method1922(Static66.anInt1458);
					Static66.anInt1458 = local213;
				}
				Static116.aBoolean107 = true;
				Static88.anInt1857 = -1;
				if (Static36.anInt869 != 0) {
					Static55.aBoolean16 = true;
					Static36.anInt869 = 0;
				}
				Static8.aBoolean11 = true;
				Static127.method1927(Static66.anInt1458);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 147) {
				if (Static42.anInt982 != -1) {
					Static126.method1922(Static42.anInt982);
					Static42.anInt982 = -1;
				}
				Static29.aBoolean25 = false;
				Static35.anInt2888 = -1;
				Static97.aClass74_1724 = Static97.aClass74_1736;
				Static36.anInt869 = 2;
				Static55.aBoolean16 = true;
				return true;
			}
			if (Static35.anInt2888 == 117) {
				Static65.anInt1443 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static41.anInt964 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static107.anInt2345 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static36.aBoolean29 = true;
				Static35.anInt2888 = -1;
				Static55.aBoolean16 = true;
				return true;
			}
			@Pc(626) Class2_Sub2_Sub17 local626;
			if (Static35.anInt2888 == 123) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1522();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1498();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1517();
				local626 = Static41.method668(local217);
				local626.anInt2792 = (local213 << 16) + local144;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 221) {
				if (Static66.anInt1458 != -1) {
					Static126.method1922(Static66.anInt1458);
					Static66.anInt1458 = -1;
					Static116.aBoolean107 = true;
					Static8.aBoolean11 = true;
				}
				if (Static42.anInt982 != -1) {
					Static126.method1922(Static42.anInt982);
					Static55.aBoolean16 = true;
					Static42.anInt982 = -1;
				}
				if (Static14.anInt401 != -1) {
					Static126.method1922(Static14.anInt401);
					Static14.anInt401 = -1;
					Static106.method1597(30);
				}
				if (Static98.anInt2115 != -1) {
					Static126.method1922(Static98.anInt2115);
					Static98.anInt2115 = -1;
				}
				if (Static90.anInt1905 != -1) {
					Static126.method1922(Static90.anInt1905);
					Static90.anInt1905 = -1;
				}
				Static88.anInt1857 = -1;
				Static35.anInt2888 = -1;
				if (Static36.anInt869 != 0) {
					Static36.anInt869 = 0;
					Static55.aBoolean16 = true;
				}
				return true;
			}
			if (Static35.anInt2888 == 149) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1480();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1532();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1488();
				local626 = Static41.method668(local217);
				local626.anInt2834 = local213 + local626.anInt2815;
				local626.anInt2780 = local626.anInt2819 + local144;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 249) {
				Static54.anInt1325 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static35.anInt2888 = -1;
				Static46.anInt1053 = Static107.anInt2338;
				Static116.aBoolean107 = true;
				return true;
			}
			if (Static35.anInt2888 == 227) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1525();
				Static38.method652(local213);
				if (Static66.anInt1458 != -1) {
					Static126.method1922(Static66.anInt1458);
					Static116.aBoolean107 = true;
					Static66.anInt1458 = -1;
					Static8.aBoolean11 = true;
				}
				if (Static14.anInt401 != -1) {
					Static126.method1922(Static14.anInt401);
					Static14.anInt401 = -1;
					Static106.method1597(30);
				}
				if (Static98.anInt2115 != -1) {
					Static126.method1922(Static98.anInt2115);
					Static98.anInt2115 = -1;
				}
				if (Static90.anInt1905 != -1) {
					Static126.method1922(Static90.anInt1905);
					Static90.anInt1905 = -1;
				}
				if (local213 == Static42.anInt982) {
					Static123.method1854(Static42.anInt982);
				} else {
					Static126.method1922(Static42.anInt982);
					Static42.anInt982 = local213;
				}
				Static88.anInt1857 = -1;
				Static127.method1927(Static42.anInt982);
				Static55.aBoolean16 = true;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 69) {
				@Pc(856) boolean local856 = Static19.aClass2_Sub10_Sub1_1.method1503() == 1;
				local217 = Static19.aClass2_Sub10_Sub1_1.method1502();
				local333 = Static41.method668(local217);
				local333.aBoolean122 = local856;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 113) {
				Static46.anInt1049 = Static19.aClass2_Sub10_Sub1_1.method1503();
				Static35.anInt2888 = -1;
				if (Static46.anInt1049 == Static42.anInt980) {
					if (Static46.anInt1049 == 3) {
						Static42.anInt980 = 1;
					} else {
						Static42.anInt980 = 3;
					}
					Static116.aBoolean107 = true;
				}
				return true;
			}
			@Pc(958) int local958;
			@Pc(968) int local968;
			@Pc(963) int local963;
			@Pc(979) int local979;
			if (Static35.anInt2888 == 237) {
				Static90.aBoolean76 = true;
				Static23.anInt648 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static126.anInt2858 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static79.anInt1771 = Static19.aClass2_Sub10_Sub1_1.method1517();
				Static21.anInt611 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static45.anInt1025 = Static19.aClass2_Sub10_Sub1_1.method1514();
				if (Static45.anInt1025 >= 100) {
					local213 = Static23.anInt648 * 128 + 64;
					local217 = Static126.anInt2858 * 128 + 64;
					local144 = Static15.method348(local213, local217, Static117.anInt2529) - Static79.anInt1771;
					local958 = local213 - Static113.anInt2444;
					local963 = local217 - Static40.anInt958;
					local968 = local144 - Static12.anInt362;
					local979 = (int) Math.sqrt((double) (local963 * local963 + local958 * local958));
					Static53.anInt1290 = (int) (Math.atan2((double) local968, (double) local979) * 325.949D) & 0x7FF;
					Static100.anInt2211 = (int) (Math.atan2((double) local958, (double) local963) * -325.949D) & 0x7FF;
					if (Static53.anInt1290 < 128) {
						Static53.anInt1290 = 128;
					}
					if (Static53.anInt1290 > 383) {
						Static53.anInt1290 = 383;
					}
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 22) {
				for (local213 = 0; local213 < Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1.length; local213++) {
					if (Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local213] != null) {
						Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local213].anInt2670 = -1;
					}
				}
				for (local217 = 0; local217 < Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1.length; local217++) {
					if (Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local217] != null) {
						Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local217].anInt2670 = -1;
					}
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 84) {
				Static53.anInt1291 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 10) {
				Static54.anInt1332 = Static19.aClass2_Sub10_Sub1_1.method1522() * 30;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 162 || Static35.anInt2888 == 146 || Static35.anInt2888 == 107 || Static35.anInt2888 == 181 || Static35.anInt2888 == 92 || Static35.anInt2888 == 241 || Static35.anInt2888 == 104 || Static35.anInt2888 == 64 || Static35.anInt2888 == 165 || Static35.anInt2888 == 98 || Static35.anInt2888 == 33) {
				Static77.method1205();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 57) {
				Static119.anInt2548 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 91) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1517();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1514();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1517();
				Static48.method795(local213, local144, local217);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 27) {
				Static90.aBoolean76 = false;
				for (local213 = 0; local213 < 5; local213++) {
					Static125.aBooleanArray15[local213] = false;
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 209) {
				Static124.method1874();
				Static35.anInt2888 = -1;
				return false;
			}
			@Pc(1229) long local1229;
			if (Static35.anInt2888 == 108) {
				local1229 = Static19.aClass2_Sub10_Sub1_1.method1478();
				@Pc(1237) Class74 local1237 = Static111.method1677(Static19.aClass2_Sub10_Sub1_1).method1710();
				Static67.method1024(6, Static112.method1686(local1229).method1720(), local1237);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 193) {
				Static19.method426();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 34) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1517();
				Static38.method652(local213);
				if (Static66.anInt1458 != -1) {
					Static126.method1922(Static66.anInt1458);
					Static8.aBoolean11 = true;
					Static116.aBoolean107 = true;
					Static66.anInt1458 = -1;
				}
				if (Static42.anInt982 != -1) {
					Static126.method1922(Static42.anInt982);
					Static42.anInt982 = -1;
					Static55.aBoolean16 = true;
				}
				if (Static14.anInt401 != -1) {
					Static126.method1922(Static14.anInt401);
					Static14.anInt401 = -1;
					Static106.method1597(30);
				}
				if (Static98.anInt2115 != -1) {
					Static126.method1922(Static98.anInt2115);
					Static98.anInt2115 = -1;
				}
				if (Static90.anInt1905 == local213) {
					Static123.method1854(Static90.anInt1905);
				} else {
					Static126.method1922(Static90.anInt1905);
					Static90.anInt1905 = local213;
				}
				Static88.anInt1857 = -1;
				if (Static36.anInt869 != 0) {
					Static36.anInt869 = 0;
					Static55.aBoolean16 = true;
				}
				Static127.method1927(Static90.anInt1905);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 251) {
				Static35.anInt2888 = -1;
				Static71.anInt1556 = 0;
				return true;
			}
			if (Static35.anInt2888 == 134) {
				Static90.anInt1903 = Static19.aClass2_Sub10_Sub1_1.method1517();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 7) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1506();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1527();
				local333 = Static41.method668(local217);
				Static35.anInt2888 = -1;
				local333.anInt2767 = 2;
				local333.anInt2812 = local213;
				return true;
			}
			@Pc(1409) long local1409;
			@Pc(1426) long local1426;
			if (Static35.anInt2888 == 191) {
				local1229 = Static19.aClass2_Sub10_Sub1_1.method1478();
				local1409 = Static19.aClass2_Sub10_Sub1_1.method1517();
				@Pc(1414) long local1414 = (long) Static19.aClass2_Sub10_Sub1_1.method1489();
				local979 = Static19.aClass2_Sub10_Sub1_1.method1514();
				@Pc(1420) boolean local1420 = false;
				local1426 = local1414 + (local1409 << 32);
				for (@Pc(1428) int local1428 = 0; local1428 < 100; local1428++) {
					if (local1426 == Static4.aLongArray1[local1428]) {
						local1420 = true;
						break;
					}
				}
				if (local979 <= 1) {
					for (@Pc(1449) int local1449 = 0; local1449 < Static101.anInt2247; local1449++) {
						if (Static10.aLongArray6[local1449] == local1229) {
							local1420 = true;
							break;
						}
					}
				}
				if (!local1420 && Static116.anInt2490 == 0) {
					Static4.aLongArray1[Static98.anInt2117] = local1426;
					Static98.anInt2117 = (Static98.anInt2117 + 1) % 100;
					@Pc(1489) Class74 local1489 = Static111.method1677(Static19.aClass2_Sub10_Sub1_1).method1710();
					if (local979 == 2 || local979 == 3) {
						Static67.method1024(7, Static91.method1340(new Class74[] { Static21.aClass74_474, Static112.method1686(local1229).method1720() }), local1489);
					} else if (local979 == 1) {
						Static67.method1024(7, Static91.method1340(new Class74[] { Static48.aClass74_838, Static112.method1686(local1229).method1720() }), local1489);
					} else {
						Static67.method1024(3, Static112.method1686(local1229).method1720(), local1489);
					}
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 31) {
				Static52.anInt1251 = Static19.aClass2_Sub10_Sub1_1.method1514();
				if (Static52.anInt1251 == 1) {
					Static124.anInt2739 = Static19.aClass2_Sub10_Sub1_1.method1517();
				}
				if (Static52.anInt1251 >= 2 && Static52.anInt1251 <= 6) {
					if (Static52.anInt1251 == 2) {
						Static87.anInt1345 = 64;
						Static35.anInt2887 = 64;
					}
					if (Static52.anInt1251 == 3) {
						Static35.anInt2887 = 0;
						Static87.anInt1345 = 64;
					}
					if (Static52.anInt1251 == 4) {
						Static35.anInt2887 = 128;
						Static87.anInt1345 = 64;
					}
					if (Static52.anInt1251 == 5) {
						Static35.anInt2887 = 64;
						Static87.anInt1345 = 0;
					}
					if (Static52.anInt1251 == 6) {
						Static35.anInt2887 = 64;
						Static87.anInt1345 = 128;
					}
					Static52.anInt1251 = 2;
					Static30.anInt727 = Static19.aClass2_Sub10_Sub1_1.method1517();
					Static47.anInt1098 = Static19.aClass2_Sub10_Sub1_1.method1517();
					Static42.anInt979 = Static19.aClass2_Sub10_Sub1_1.method1514();
				}
				if (Static52.anInt1251 == 10) {
					Static54.anInt1326 = Static19.aClass2_Sub10_Sub1_1.method1517();
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 46) {
				@Pc(1658) byte local1658 = Static19.aClass2_Sub10_Sub1_1.method1520();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1522();
				Static45.anIntArray125[local217] = local1658;
				if (Static88.anIntArray260[local217] != local1658) {
					Static88.anIntArray260[local217] = local1658;
					Static41.method674(local217);
					if (Static83.anInt1804 != -1) {
						Static55.aBoolean16 = true;
					}
					Static116.aBoolean107 = true;
				}
				Static35.anInt2888 = -1;
				Static46.anInt1053 = Static107.anInt2338;
				return true;
			}
			if (Static35.anInt2888 == 187) {
				Static97.aClass74_1732 = Static19.aClass2_Sub10_Sub1_1.method1530();
				if (Static42.anInt982 != -1) {
					Static126.method1922(Static42.anInt982);
					Static42.anInt982 = -1;
				}
				Static29.aBoolean25 = false;
				Static55.aBoolean16 = true;
				Static36.anInt869 = 4;
				Static35.anInt2888 = -1;
				Static97.aClass74_1724 = Static97.aClass74_1736;
				return true;
			}
			if (Static35.anInt2888 == 176) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1514();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1514();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1514();
				local958 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static125.aBooleanArray15[local213] = true;
				Static67.anIntArray183[local213] = local217;
				Static98.anIntArray309[local213] = local144;
				Static86.anIntArray259[local213] = local958;
				Static106.anIntArray328[local213] = 0;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 105) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1525();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1498();
				local333 = Static41.method668(local217);
				if (local333 != null && local333.anInt2777 == 0) {
					if (local213 > local333.anInt2807 - local333.anInt2829) {
						local213 = local333.anInt2807 - local333.anInt2829;
					}
					if (local213 < 0) {
						local213 = 0;
					}
					local333.anInt2836 = local213;
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 238) {
				Static19.aClass2_Sub10_Sub1_1.method1525();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 130) {
				Static90.aBoolean76 = true;
				Static85.anInt1838 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static69.anInt1517 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static127.anInt2881 = Static19.aClass2_Sub10_Sub1_1.method1517();
				Static17.anInt543 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static40.anInt953 = Static19.aClass2_Sub10_Sub1_1.method1514();
				if (Static40.anInt953 >= 100) {
					Static113.anInt2444 = Static85.anInt1838 * 128 + 64;
					Static40.anInt958 = Static69.anInt1517 * 128 + 64;
					Static12.anInt362 = Static15.method348(Static113.anInt2444, Static40.anInt958, Static117.anInt2529) - Static127.anInt2881;
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 252) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1490();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1525();
				if (local217 == 65535) {
					local217 = -1;
				}
				if (Static16.anIntArray49[local213] == local217) {
					Static123.method1854(Static16.anIntArray49[local213]);
				} else {
					Static126.method1922(Static16.anIntArray49[local213]);
					Static16.anIntArray49[local213] = local217;
				}
				Static8.aBoolean11 = true;
				Static116.aBoolean107 = true;
				Static127.method1927(Static16.anIntArray49[local213]);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 248) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1506();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1522();
				Static38.method652(local213);
				if (local217 != -1) {
					Static38.method652(local217);
				}
				if (Static90.anInt1905 != -1) {
					Static126.method1922(Static90.anInt1905);
					Static90.anInt1905 = -1;
				}
				if (Static66.anInt1458 != -1) {
					Static126.method1922(Static66.anInt1458);
					Static66.anInt1458 = -1;
				}
				if (Static42.anInt982 != -1) {
					Static126.method1922(Static42.anInt982);
					Static42.anInt982 = -1;
				}
				if (local213 == Static14.anInt401) {
					Static123.method1854(Static14.anInt401);
				} else {
					Static126.method1922(Static14.anInt401);
					Static14.anInt401 = local213;
					Static106.method1597(35);
				}
				if (local213 == Static98.anInt2115) {
					Static123.method1854(Static98.anInt2115);
				} else {
					Static126.method1922(Static98.anInt2115);
					Static98.anInt2115 = local217;
				}
				Static36.anInt869 = 0;
				Static88.anInt1857 = -1;
				Static127.method1927(Static14.anInt401);
				Static127.method1927(Static98.anInt2115);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 2) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1506();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1506();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1502();
				local958 = Static19.aClass2_Sub10_Sub1_1.method1522();
				@Pc(2058) Class2_Sub2_Sub17 local2058 = Static41.method668(local144);
				local2058.anInt2824 = local217;
				local2058.anInt2825 = local213;
				Static35.anInt2888 = -1;
				local2058.anInt2793 = local958;
				return true;
			}
			if (Static35.anInt2888 == 203) {
				Static19.aClass2_Sub10_Sub1_1.method1532();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 196) {
				Static42.anInt980 = Static19.aClass2_Sub10_Sub1_1.method1518();
				Static116.aBoolean107 = true;
				Static8.aBoolean11 = true;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 61) {
				Static36.anInt867 = Static19.aClass2_Sub10_Sub1_1.method1503();
				Static114.anInt2460 = Static19.aClass2_Sub10_Sub1_1.method1518();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 129) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1532();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1517();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1498();
				if (local217 == 65535) {
					local217 = -1;
				}
				local626 = Static41.method668(local213);
				@Pc(2162) Class2_Sub2_Sub12 local2162;
				if (local626.aBoolean125) {
					local626.anInt2784 = local144;
					local626.anInt2806 = local217;
					local2162 = Static35.method1934(local217);
					local626.anInt2793 = local2162.anInt1690;
					local626.anInt2783 = local2162.anInt1691;
					local626.anInt2824 = local2162.anInt1696;
					local626.anInt2825 = local2162.anInt1705;
					local626.anInt2789 = local2162.anInt1710;
					if (local626.anInt2810 > 0) {
						local626.anInt2825 = local626.anInt2825 * 32 / local626.anInt2810;
					}
					local626.anInt2801 = local2162.anInt1714;
					Static31.method575(local626);
				} else if (local217 == -1) {
					Static35.anInt2888 = -1;
					local626.anInt2767 = 0;
					return true;
				} else {
					local2162 = Static35.method1934(local217);
					local626.anInt2793 = local2162.anInt1690;
					local626.anInt2825 = local2162.anInt1705 * 100 / local144;
					local626.anInt2767 = 4;
					local626.anInt2824 = local2162.anInt1696;
					local626.anInt2812 = local217;
				}
				Static35.anInt2888 = -1;
				return true;
			}
			@Pc(2281) long local2281;
			@Pc(2259) long local2259;
			if (Static35.anInt2888 == 185) {
				local1229 = Static19.aClass2_Sub10_Sub1_1.method1478();
				@Pc(2255) byte local2255 = Static19.aClass2_Sub10_Sub1_1.method1509();
				local2259 = Static19.aClass2_Sub10_Sub1_1.method1478();
				@Pc(2264) long local2264 = (long) Static19.aClass2_Sub10_Sub1_1.method1517();
				local1426 = Static19.aClass2_Sub10_Sub1_1.method1489();
				@Pc(2273) int local2273 = Static19.aClass2_Sub10_Sub1_1.method1514();
				@Pc(2275) boolean local2275 = false;
				local2281 = (local2264 << 32) + local1426;
				for (@Pc(2283) int local2283 = 0; local2283 < 100; local2283++) {
					if (local2281 == Static4.aLongArray1[local2283]) {
						local2275 = true;
						break;
					}
				}
				if (local2273 <= 1) {
					for (@Pc(2310) int local2310 = 0; local2310 < Static101.anInt2247; local2310++) {
						if (local1229 == Static10.aLongArray6[local2310]) {
							local2275 = true;
							break;
						}
					}
				}
				if (!local2275 && Static116.anInt2490 == 0) {
					Static4.aLongArray1[Static98.anInt2117] = local2281;
					Static98.anInt2117 = (Static98.anInt2117 + 1) % 100;
					@Pc(2352) Class74 local2352 = Static111.method1677(Static19.aClass2_Sub10_Sub1_1).method1710();
					@Pc(2381) Class74 local2381 = Static91.method1340(new Class74[] { Static85.aClass74_1240, Static112.method1686(local2259), Static64.aClass74_1002, Static56.method940(local2255), Static39.aClass74_679 });
					if (local2273 == 2 || local2273 == 3) {
						Static67.method1024(7, Static91.method1340(new Class74[] { local2381, Static21.aClass74_474, Static112.method1686(local1229).method1720() }), local2352);
					} else if (local2273 == 1) {
						Static67.method1024(7, Static91.method1340(new Class74[] { local2381, Static48.aClass74_838, Static112.method1686(local1229).method1720() }), local2352);
					} else {
						Static67.method1024(3, Static91.method1340(new Class74[] { local2381, Static112.method1686(local1229).method1720() }), local2352);
					}
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 79) {
				Static48.method793(true);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 38) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1522();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1498();
				local333 = Static41.method668(local217);
				Static35.anInt2888 = -1;
				local333.anInt2812 = local213;
				local333.anInt2767 = 1;
				return true;
			}
			if (Static35.anInt2888 == 210) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1481();
				if (local213 != Static83.anInt1804) {
					Static126.method1922(Static83.anInt1804);
					Static83.anInt1804 = local213;
				}
				Static55.aBoolean16 = true;
				Static127.method1927(Static83.anInt1804);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 220) {
				Static48.method793(false);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 54) {
				if (Static42.anInt980 == 12) {
					Static116.aBoolean107 = true;
				}
				Static64.anInt1441 = Static19.aClass2_Sub10_Sub1_1.method1480();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 99) {
				local129 = Static19.aClass2_Sub10_Sub1_1.method1530();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1518();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1518();
				if (local217 >= 1 && local217 <= 5) {
					if (local129.method1701(Static75.aClass74_1112)) {
						local129 = null;
					}
					aClass74Array9[local217 - 1] = local129;
					Static62.aBooleanArray2[local217 - 1] = local144 == 0;
				}
				Static35.anInt2888 = -1;
				return true;
			}
			@Pc(2629) Class2_Sub2_Sub17 local2629;
			if (Static35.anInt2888 == 106) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1527();
				local2629 = Static41.method668(local213);
				for (local144 = 0; local144 < local2629.anIntArray402.length; local144++) {
					local2629.anIntArray402[local144] = -1;
					local2629.anIntArray402[local144] = 0;
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 110) {
				Static19.aClass2_Sub10_Sub1_1.method1490();
				Static19.aClass2_Sub10_Sub1_1.method1498();
				Static19.aClass2_Sub10_Sub1_1.method1525();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 41) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1488();
				if (local213 >= 0) {
					Static38.method652(local213);
				}
				if (Static79.anInt1754 != local213) {
					Static126.method1922(Static79.anInt1754);
					Static79.anInt1754 = local213;
				}
				Static127.method1927(Static79.anInt1754);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 40) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1498();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1522();
				local144 = local217 >> 10 & 0x1F;
				local968 = local217 & 0x1F;
				local958 = local217 >> 5 & 0x1F;
				@Pc(2743) Class2_Sub2_Sub17 local2743 = Static41.method668(local213);
				Static35.anInt2888 = -1;
				local2743.anInt2818 = (local968 << 3) + (local958 << 11) + (local144 << 19);
				return true;
			}
			if (Static35.anInt2888 == 55) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1517();
				if (local213 == 65535) {
					local213 = -1;
				}
				local217 = Static19.aClass2_Sub10_Sub1_1.method1502();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1532();
				local2259 = (long) local213 + ((long) local144 << 32);
				@Pc(2795) Class2 local2795 = Static98.aClass58_53.method1307(local2259);
				if (local2795 != null) {
					local2795.method1930();
				}
				Static98.aClass58_53.method1301(local2259, new Class2_Sub3(local217));
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 172) {
				local1229 = Static19.aClass2_Sub10_Sub1_1.method1478();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1517();
				local958 = Static19.aClass2_Sub10_Sub1_1.method1514();
				@Pc(2839) Class74 local2839 = Static112.method1686(local1229).method1720();
				for (local963 = 0; local963 < Static65.anInt1450; local963++) {
					if (local1229 == Static6.aLongArray2[local963]) {
						if (local144 != Static78.anIntArray251[local963]) {
							Static78.anIntArray251[local963] = local144;
							Static116.aBoolean107 = true;
							if (local144 > 0) {
								Static67.method1024(5, Static97.aClass74_1736, Static91.method1340(new Class74[] { local2839, Static102.aClass74_1465 }));
							}
							if (local144 == 0) {
								Static67.method1024(5, Static97.aClass74_1736, Static91.method1340(new Class74[] { local2839, Static120.aClass74_1602 }));
							}
						}
						local2839 = null;
						Static23.anIntArray67[local963] = local958;
						break;
					}
				}
				if (local2839 != null && Static65.anInt1450 < 200) {
					Static6.aLongArray2[Static65.anInt1450] = local1229;
					Static19.aClass74Array2[Static65.anInt1450] = local2839;
					Static78.anIntArray251[Static65.anInt1450] = local144;
					Static23.anIntArray67[Static65.anInt1450] = local958;
					Static65.anInt1450++;
					Static46.anInt1053 = Static107.anInt2338;
					Static116.aBoolean107 = true;
				}
				@Pc(2948) boolean local2948 = false;
				while (!local2948) {
					local2948 = true;
					for (@Pc(2954) int local2954 = 0; local2954 < Static65.anInt1450 - 1; local2954++) {
						if (Static45.anInt1033 != Static78.anIntArray251[local2954] && Static78.anIntArray251[local2954 + 1] == Static45.anInt1033 || Static78.anIntArray251[local2954] == 0 && Static78.anIntArray251[local2954 + 1] != 0) {
							@Pc(2982) int local2982 = Static78.anIntArray251[local2954];
							Static78.anIntArray251[local2954] = Static78.anIntArray251[local2954 + 1];
							Static78.anIntArray251[local2954 + 1] = local2982;
							local2948 = false;
							@Pc(3002) Class74 local3002 = Static19.aClass74Array2[local2954];
							Static19.aClass74Array2[local2954] = Static19.aClass74Array2[local2954 + 1];
							Static19.aClass74Array2[local2954 + 1] = local3002;
							local2281 = Static6.aLongArray2[local2954];
							Static6.aLongArray2[local2954] = Static6.aLongArray2[local2954 + 1];
							Static6.aLongArray2[local2954 + 1] = local2281;
							@Pc(3038) int local3038 = Static23.anIntArray67[local2954];
							Static23.anIntArray67[local2954] = Static23.anIntArray67[local2954 + 1];
							Static23.anIntArray67[local2954 + 1] = local3038;
							Static116.aBoolean107 = true;
						}
					}
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 60) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1502();
				local2629 = Static41.method668(local213);
				local2629.anInt2767 = 3;
				local2629.anInt2812 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass14_2.method441();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 211) {
				Static36.anInt867 = Static19.aClass2_Sub10_Sub1_1.method1503();
				Static114.anInt2460 = Static19.aClass2_Sub10_Sub1_1.method1518();
				while (Static19.aClass2_Sub10_Sub1_1.anInt2187 < Static16.anInt463) {
					Static35.anInt2888 = Static19.aClass2_Sub10_Sub1_1.method1514();
					Static77.method1205();
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 137) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1532();
				Static18.aClass37_1 = Static35.aClass15_59.method466(local213);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 23) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1517();
				if (local213 == 65535) {
					local213 = -1;
				}
				method1005(local213);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 145) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1489();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1517();
				if (local217 == 65535) {
					local217 = -1;
				}
				Static103.method1587(local213, local217);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 234) {
				local129 = Static19.aClass2_Sub10_Sub1_1.method1530();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1502();
				local333 = Static41.method668(local217);
				local333.aClass74_1690 = local129;
				if (Static16.anIntArray49[Static42.anInt980] == local217 >> 16) {
					Static116.aBoolean107 = true;
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 205) {
				Static116.aBoolean107 = true;
				local213 = Static19.aClass2_Sub10_Sub1_1.method1532();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1517();
				if (local213 < -70000) {
					local217 += 32768;
				}
				if (local213 >= 0) {
					local333 = Static41.method668(local213);
				} else {
					local333 = null;
				}
				while (Static16.anInt463 > Static19.aClass2_Sub10_Sub1_1.anInt2187) {
					local958 = Static19.aClass2_Sub10_Sub1_1.method1484();
					local968 = Static19.aClass2_Sub10_Sub1_1.method1517();
					local963 = 0;
					if (local968 != 0) {
						local963 = Static19.aClass2_Sub10_Sub1_1.method1514();
						if (local963 == 255) {
							local963 = Static19.aClass2_Sub10_Sub1_1.method1532();
						}
					}
					if (local333 != null && local958 >= 0 && local958 < local333.anIntArray402.length) {
						local333.anIntArray402[local958] = local968;
						local333.anIntArray406[local958] = local963;
					}
					Static90.method1334(local968 - 1, local217, local958, local963);
				}
				Static35.anInt2888 = -1;
				Static46.anInt1051 = Static107.anInt2338;
				return true;
			}
			if (Static35.anInt2888 == 225) {
				local129 = Static19.aClass2_Sub10_Sub1_1.method1530();
				@Pc(3376) Class74 local3376;
				@Pc(3382) boolean local3382;
				if (local129.method1724(Static65.aClass74_1017)) {
					local3376 = local129.method1706(0, local129.method1722(Static119.aClass74_1590));
					local1409 = local3376.method1696();
					local3382 = false;
					for (local963 = 0; local963 < Static101.anInt2247; local963++) {
						if (Static10.aLongArray6[local963] == local1409) {
							local3382 = true;
							break;
						}
					}
					if (!local3382 && Static116.anInt2490 == 0) {
						Static67.method1024(4, local3376, Static86.aClass74_1258);
					}
				} else if (local129.method1724(Static2.aClass74_28)) {
					local3376 = local129.method1706(0, local129.method1722(Static119.aClass74_1590));
					local1409 = local3376.method1696();
					local3382 = false;
					for (local963 = 0; local963 < Static101.anInt2247; local963++) {
						if (local1409 == Static10.aLongArray6[local963]) {
							local3382 = true;
							break;
						}
					}
					if (!local3382 && Static116.anInt2490 == 0) {
						Static67.method1024(8, local3376, aClass74_1000);
					}
				} else if (local129.method1724(Static116.aClass74_1558)) {
					local3376 = local129.method1706(0, local129.method1722(Static119.aClass74_1590));
					local1409 = local3376.method1696();
					local3382 = false;
					for (local963 = 0; local963 < Static101.anInt2247; local963++) {
						if (local1409 == Static10.aLongArray6[local963]) {
							local3382 = true;
							break;
						}
					}
					if (!local3382 && Static116.anInt2490 == 0) {
						@Pc(3544) Class74 local3544 = local129.method1706(local129.method1722(Static119.aClass74_1590) + 1, local129.method1695() - 9);
						Static67.method1024(8, local3376, local3544);
					}
				} else {
					Static67.method1024(0, Static97.aClass74_1736, local129);
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 155) {
				Static116.aBoolean107 = true;
				local213 = Static19.aClass2_Sub10_Sub1_1.method1490();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1532();
				local144 = Static19.aClass2_Sub10_Sub1_1.method1518();
				Static109.anIntArray344[local213] = local217;
				Static70.anIntArray193[local213] = local144;
				Static102.anIntArray323[local213] = 1;
				for (local958 = 0; local958 < 98; local958++) {
					if (Class55.anIntArray256[local958] <= local217) {
						Static102.anIntArray323[local213] = local958 + 2;
					}
				}
				Static99.anInt2127 = Static107.anInt2338;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 243) {
				Static116.aBoolean107 = true;
				local213 = Static19.aClass2_Sub10_Sub1_1.method1532();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1517();
				if (local213 >= 0) {
					local333 = Static41.method668(local213);
				} else {
					local333 = null;
				}
				if (local333 != null) {
					for (local958 = 0; local958 < local333.anIntArray402.length; local958++) {
						local333.anIntArray402[local958] = 0;
						local333.anIntArray406[local958] = 0;
					}
				}
				if (local213 < -70000) {
					local217 += 32768;
				}
				Static46.method750(local217);
				local958 = Static19.aClass2_Sub10_Sub1_1.method1517();
				for (local968 = 0; local968 < local958; local968++) {
					local963 = Static19.aClass2_Sub10_Sub1_1.method1518();
					if (local963 == 255) {
						local963 = Static19.aClass2_Sub10_Sub1_1.method1502();
					}
					local979 = Static19.aClass2_Sub10_Sub1_1.method1506();
					if (local333 != null && local333.anIntArray402.length > local968) {
						local333.anIntArray402[local968] = local979;
						local333.anIntArray406[local968] = local963;
					}
					Static90.method1334(local979 - 1, local217, local968, local963);
				}
				Static35.anInt2888 = -1;
				Static46.anInt1051 = Static107.anInt2338;
				return true;
			}
			if (Static35.anInt2888 == 3) {
				Static32.method587();
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 35) {
				local213 = Static19.aClass2_Sub10_Sub1_1.method1506();
				local217 = Static19.aClass2_Sub10_Sub1_1.method1522();
				if (Static42.anInt982 != -1) {
					Static126.method1922(Static42.anInt982);
					Static42.anInt982 = -1;
					Static55.aBoolean16 = true;
				}
				if (Static14.anInt401 != -1) {
					Static126.method1922(Static14.anInt401);
					Static14.anInt401 = -1;
					Static106.method1597(30);
				}
				if (Static98.anInt2115 != -1) {
					Static126.method1922(Static98.anInt2115);
					Static98.anInt2115 = -1;
				}
				if (Static90.anInt1905 == local217) {
					Static123.method1854(Static90.anInt1905);
				} else {
					Static126.method1922(Static90.anInt1905);
					Static90.anInt1905 = local217;
				}
				if (Static66.anInt1458 == local213) {
					Static123.method1854(Static66.anInt1458);
				} else {
					Static126.method1922(Static66.anInt1458);
					Static66.anInt1458 = local213;
				}
				Static88.anInt1857 = -1;
				if (Static36.anInt869 != 0) {
					Static36.anInt869 = 0;
					Static55.aBoolean16 = true;
				}
				Static116.aBoolean107 = true;
				Static8.aBoolean11 = true;
				Static127.method1927(Static90.anInt1905);
				Static127.method1927(Static66.anInt1458);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 245) {
				if (Static42.anInt982 != -1) {
					Static126.method1922(Static42.anInt982);
					Static42.anInt982 = -1;
				}
				Static55.aBoolean16 = true;
				Static36.anInt869 = 1;
				Static97.aClass74_1724 = Static97.aClass74_1736;
				Static29.aBoolean25 = false;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 19) {
				for (local213 = 0; local213 < Static88.anIntArray260.length; local213++) {
					if (Static45.anIntArray125[local213] != Static88.anIntArray260[local213]) {
						Static88.anIntArray260[local213] = Static45.anIntArray125[local213];
						Static41.method674(local213);
						Static116.aBoolean107 = true;
					}
				}
				Static46.anInt1053 = Static107.anInt2338;
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 127) {
				for (local213 = 0; local213 < Static52.anInt1261; local213++) {
					@Pc(3921) Class2_Sub2_Sub8 local3921 = Static36.method619(local213);
					if (local3921 != null && local3921.anInt1052 == 0) {
						Static45.anIntArray125[local213] = 0;
						Static88.anIntArray260[local213] = 0;
					}
				}
				Static35.anInt2888 = -1;
				Static46.anInt1053 = Static107.anInt2338;
				if (Static83.anInt1804 != -1) {
					Static55.aBoolean16 = true;
				}
				Static116.aBoolean107 = true;
				return true;
			}
			if (Static35.anInt2888 == 171) {
				Static101.anInt2247 = Static16.anInt463 / 8;
				for (local213 = 0; local213 < Static101.anInt2247; local213++) {
					Static10.aLongArray6[local213] = Static19.aClass2_Sub10_Sub1_1.method1478();
				}
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 0) {
				Static51.method1526(Static19.aClass2_Sub10_Sub1_1, Static16.anInt463, Static35.aClass15_59);
				Static35.anInt2888 = -1;
				return true;
			}
			if (Static35.anInt2888 == 73) {
				if (Static42.anInt980 == 12) {
					Static116.aBoolean107 = true;
				}
				Static21.anInt612 = Static19.aClass2_Sub10_Sub1_1.method1514();
				Static35.anInt2888 = -1;
				return true;
			}
			Static29.method518("T1 - " + Static35.anInt2888 + "," + Static97.anInt2894 + "," + Static5.anInt61 + " - " + Static16.anInt463, null);
			Static124.method1874();
		} catch (@Pc(4047) IOException local4047) {
			Static79.method1244();
		} catch (@Pc(4051) Exception local4051) {
			@Pc(4092) String local4092 = "T2 - " + Static35.anInt2888 + "," + Static97.anInt2894 + "," + Static5.anInt61 + " - " + Static16.anInt463 + "," + (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0] + Static107.anInt2343) + "," + (Static62.anInt1413 + Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0]) + " - ";
			for (local217 = 0; Static16.anInt463 > local217 && local217 < 50; local217++) {
				local4092 = local4092 + Static19.aClass2_Sub10_Sub1_1.aByteArray27[local217] + ",";
			}
			Static29.method518(local4092, local4051);
			Static124.method1874();
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z")
	public static boolean method998(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public static void method999() {
		aClass74Array9 = null;
		aClass74_998 = null;
		aClass16_52 = null;
		anIntArray173 = null;
		aClass74_999 = null;
		aClass13_38 = null;
		aClass24Array1 = null;
		aClass74_1000 = null;
		aClass9_30 = null;
		anIntArrayArray11 = null;
		aClass74_996 = null;
		aClass74_995 = null;
		aClass2_Sub2_Sub1_Sub1_30 = null;
		anIntArray174 = null;
		aClass74_997 = null;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1000() {
		if (Static27.anInt678 != 0 || Static101.aClass2_Sub2_Sub17_3 != null) {
			return;
		}
		@Pc(18) int local18 = Static41.anInt973;
		if (Static6.aBoolean7 && Static120.anInt2565 >= 516 && Static15.anInt442 >= 160 && Static120.anInt2565 <= 765 && Static15.anInt442 <= 205) {
			local18 = 0;
		}
		@Pc(51) int local51;
		@Pc(105) int local105;
		@Pc(111) int local111;
		if (!Static109.aBoolean103) {
			if (local18 == 1 && Static112.anInt2421 > 0) {
				local51 = Static57.anIntArray159[Static112.anInt2421 - 1];
				if (local51 == 8 || local51 == 1 || local51 == 17 || local51 == 19 || local51 == 34 || local51 == 18 || local51 == 36 || local51 == 57 || local51 == 47 || local51 == 31 || local51 == 29 || local51 == 1002) {
					local105 = Static55.anIntArray53[Static112.anInt2421 - 1];
					local111 = Static77.anIntArray246[Static112.anInt2421 - 1];
					@Pc(115) Class2_Sub2_Sub17 local115 = Static41.method668(local111);
					if (Static85.method1299(Static19.method429(local115)) || Static80.method1257(Static19.method429(local115))) {
						Static27.aBoolean24 = false;
						Static27.anInt678 = 2;
						if (Static90.anInt1905 == local111 >> 16) {
							Static27.anInt678 = 1;
						}
						if (Static42.anInt982 == local111 >> 16) {
							Static27.anInt678 = 3;
						}
						Static27.anInt675 = local111;
						Static10.anInt319 = 0;
						Static56.anInt1355 = Static120.anInt2565;
						Static57.anInt1375 = Static15.anInt442;
						Static9.anInt301 = local105;
						return;
					}
				}
			}
			if (local18 == 1 && (Static128.anInt2901 == 1 || Static6.method113(Static112.anInt2421 - 1)) && Static112.anInt2421 > 2) {
				local18 = 2;
			}
			if (local18 == 1 && Static112.anInt2421 > 0) {
				Static29.method522(Static112.anInt2421 - 1);
			}
			if (local18 == 2 && Static112.anInt2421 > 0) {
				Static103.method1586();
			}
			return;
		}
		if (local18 != 1) {
			local105 = Static62.anInt1414;
			local51 = Static46.anInt1062;
			if (Static78.anInt1701 == 0) {
				local51 -= 4;
				local105 -= 4;
			}
			if (Static78.anInt1701 == 1) {
				local51 -= 553;
				local105 -= 205;
			}
			if (Static78.anInt1701 == 2) {
				local51 -= 17;
				local105 -= 357;
			}
			if (local51 < Static66.anInt1462 - 10 || local51 > Static9.anInt299 + Static66.anInt1462 + 10 || Static10.anInt321 - 10 > local105 || Static23.anInt642 + Static10.anInt321 + 10 < local105) {
				if (Static78.anInt1701 == 1) {
					Static116.aBoolean107 = true;
				}
				Static109.aBoolean103 = false;
				if (Static78.anInt1701 == 2) {
					Static55.aBoolean16 = true;
				}
			}
		}
		if (local18 != 1) {
			return;
		}
		local51 = Static66.anInt1462;
		local105 = Static10.anInt321;
		local111 = Static9.anInt299;
		@Pc(288) int local288 = Static120.anInt2565;
		@Pc(290) int local290 = Static15.anInt442;
		if (Static78.anInt1701 == 0) {
			local290 -= 4;
			local288 -= 4;
		}
		@Pc(299) int local299 = -1;
		if (Static78.anInt1701 == 1) {
			local290 -= 205;
			local288 -= 553;
		}
		if (Static78.anInt1701 == 2) {
			local288 -= 17;
			local290 -= 357;
		}
		for (@Pc(313) int local313 = 0; local313 < Static112.anInt2421; local313++) {
			@Pc(328) int local328 = (Static112.anInt2421 - local313 - 1) * 15 + local105 + 31;
			if (local51 < local288 && local51 + local111 > local288 && local328 - 13 < local290 && local328 + 3 > local290) {
				local299 = local313;
			}
		}
		if (local299 != -1) {
			Static29.method522(local299);
		}
		Static109.aBoolean103 = false;
		if (Static78.anInt1701 == 2) {
			Static55.aBoolean16 = true;
		}
		if (Static78.anInt1701 == 1) {
			Static116.aBoolean107 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)I")
	public static int method1001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ve;I)Z")
	public static boolean method1002(@OriginalArg(0) Class2_Sub2_Sub17 arg0) {
		if (Static67.aBoolean58) {
			if (Static19.method429(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2777 == 0) {
				return false;
			}
		}
		return arg0.aBoolean122;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1003() {
		if (Static27.anInt678 != 0) {
			return;
		}
		Static57.anIntArray159[0] = 1004;
		Static112.anInt2421 = 1;
		Static92.aClass74Array14[0] = Static27.aClass74_530;
		if (Static14.anInt401 != -1) {
			Static110.anInt2411 = -1;
			Static52.anInt1263 = -1;
			Static99.method1472(503, 0, Static14.anInt401, Static62.anInt1414, 765, 0, Static46.anInt1062, 0);
			Static36.anInt879 = Static52.anInt1263;
			Static11.anInt336 = Static110.anInt2411;
			return;
		}
		Static41.method672();
		Static52.anInt1263 = -1;
		Static110.anInt2411 = -1;
		if (Static46.anInt1062 > 4 && Static62.anInt1414 > 4 && Static46.anInt1062 < 516 && Static62.anInt1414 < 338) {
			if (Static90.anInt1905 == -1) {
				Static124.method1869();
			} else {
				Static99.method1472(338, 4, Static90.anInt1905, Static62.anInt1414, 516, 0, Static46.anInt1062, 4);
			}
		}
		Static36.anInt879 = Static52.anInt1263;
		Static11.anInt336 = Static110.anInt2411;
		@Pc(87) boolean local87 = false;
		Static110.anInt2411 = -1;
		Static52.anInt1263 = -1;
		if (Static46.anInt1062 > 553 && Static62.anInt1414 > 205 && Static46.anInt1062 < 743 && Static62.anInt1414 < 466) {
			if (Static66.anInt1458 != -1) {
				Static99.method1472(466, 553, Static66.anInt1458, Static62.anInt1414, 743, 1, Static46.anInt1062, 205);
			} else if (Static16.anIntArray49[Static42.anInt980] != -1) {
				Static99.method1472(466, 553, Static16.anIntArray49[Static42.anInt980], Static62.anInt1414, 743, 1, Static46.anInt1062, 205);
			}
		}
		if (Static110.anInt2411 != Static116.anInt2466) {
			Static116.anInt2466 = Static110.anInt2411;
			Static116.aBoolean107 = true;
		}
		Static110.anInt2411 = -1;
		if (Static52.anInt1263 != Static38.anInt934) {
			Static38.anInt934 = Static52.anInt1263;
			Static116.aBoolean107 = true;
		}
		Static52.anInt1263 = -1;
		if (Static46.anInt1062 > 17 && Static62.anInt1414 > 357 && Static46.anInt1062 < 496 && Static62.anInt1414 < 453) {
			if (Static42.anInt982 != -1) {
				Static99.method1472(453, 17, Static42.anInt982, Static62.anInt1414, 496, 2, Static46.anInt1062, 357);
			} else if (Static83.anInt1804 != -1) {
				Static99.method1472(453, 17, Static83.anInt1804, Static62.anInt1414, 496, 3, Static46.anInt1062, 357);
			} else if (Static62.anInt1414 < 434 && Static46.anInt1062 < 426) {
				Static12.method271(Static62.anInt1414 - 357, Static46.anInt1062 - 17);
			}
		}
		if ((Static42.anInt982 != -1 || Static83.anInt1804 != -1) && Static110.anInt2411 != Static117.anInt2525) {
			Static55.aBoolean16 = true;
			Static117.anInt2525 = Static110.anInt2411;
		}
		if ((Static42.anInt982 != -1 || Static83.anInt1804 != -1) && Static52.anInt1263 != Static18.anInt555) {
			Static18.anInt555 = Static52.anInt1263;
			Static55.aBoolean16 = true;
		}
		while (!local87) {
			local87 = true;
			for (@Pc(267) int local267 = 0; local267 < Static112.anInt2421 - 1; local267++) {
				if (Static57.anIntArray159[local267] < 1000 && Static57.anIntArray159[local267 + 1] > 1000) {
					local87 = false;
					@Pc(289) Class74 local289 = Static92.aClass74Array14[local267];
					Static92.aClass74Array14[local267] = Static92.aClass74Array14[local267 + 1];
					Static92.aClass74Array14[local267 + 1] = local289;
					@Pc(307) int local307 = Static57.anIntArray159[local267];
					Static57.anIntArray159[local267] = Static57.anIntArray159[local267 + 1];
					Static57.anIntArray159[local267 + 1] = local307;
					@Pc(325) int local325 = Static55.anIntArray53[local267];
					Static55.anIntArray53[local267] = Static55.anIntArray53[local267 + 1];
					Static55.anIntArray53[local267 + 1] = local325;
					@Pc(343) int local343 = Static77.anIntArray246[local267];
					Static77.anIntArray246[local267] = Static77.anIntArray246[local267 + 1];
					Static77.anIntArray246[local267 + 1] = local343;
					@Pc(361) int local361 = Static88.anIntArray261[local267];
					Static88.anIntArray261[local267] = Static88.anIntArray261[local267 + 1];
					Static88.anIntArray261[local267 + 1] = local361;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lclient!u;")
	public static Class74 method1004(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static56.method940(arg0);
		} else if (arg0 < 10000000) {
			return Static91.method1340(new Class74[] { Static56.method940(arg0 / 1000), Static1.aClass74_1399 });
		} else {
			return Static91.method1340(new Class74[] { Static56.method940(arg0 / 1000000), Static2.aClass74_26 });
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
	public static void method1005(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static57.aBoolean52) {
			Static87.method926();
		} else if (arg0 != -1 && Static64.anInt1437 != arg0 && Static69.anInt1519 != 0 && !Static57.aBoolean52) {
			Static47.method775(Static35.aClass26_Sub1_77, 0, arg0, Static69.anInt1519);
		}
		Static64.anInt1437 = arg0;
	}
}
