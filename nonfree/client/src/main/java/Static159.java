import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1566 = Static32.method683("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1567 = Static32.method683("Okay");

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "Z")
	public static boolean aBoolean148 = false;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1568 = Static32.method683("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Z")
	public static boolean method2680() {
		if (Static51.aClass57_3 == null) {
			return false;
		}
		@Pc(132) int local132;
		try {
			@Pc(15) int local15 = Static51.aClass57_3.method1884();
			if (local15 == 0) {
				return false;
			}
			if (Static120.anInt2508 == -1) {
				local15--;
				Static51.aClass57_3.method1883(1, Static86.aClass2_Sub13_Sub1_13.aByteArray49, 0);
				Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
				Static120.anInt2508 = Static86.aClass2_Sub13_Sub1_13.method2971();
				Static180.anInt3988 = Static153.anIntArray293[Static120.anInt2508];
			}
			if (Static180.anInt3988 == -1) {
				if (local15 <= 0) {
					return false;
				}
				local15--;
				Static51.aClass57_3.method1883(1, Static86.aClass2_Sub13_Sub1_13.aByteArray49, 0);
				Static180.anInt3988 = Static86.aClass2_Sub13_Sub1_13.aByteArray49[0] & 0xFF;
			}
			if (Static180.anInt3988 == -2) {
				if (local15 <= 1) {
					return false;
				}
				Static51.aClass57_3.method1883(2, Static86.aClass2_Sub13_Sub1_13.aByteArray49, 0);
				local15 -= 2;
				Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
				Static180.anInt3988 = Static86.aClass2_Sub13_Sub1_13.method2933();
			}
			if (local15 < Static180.anInt3988) {
				return false;
			}
			Static86.aClass2_Sub13_Sub1_13.anInt3940 = 0;
			Static51.aClass57_3.method1883(Static180.anInt3988, Static86.aClass2_Sub13_Sub1_13.aByteArray49, 0);
			Static102.anInt2167 = 0;
			Static76.anInt1566 = Static171.anInt3746;
			Static171.anInt3746 = Static14.anInt254;
			Static14.anInt254 = Static120.anInt2508;
			@Pc(148) int local148;
			@Pc(138) int local138;
			@Pc(142) int local142;
			@Pc(128) int local128;
			@Pc(161) int local161;
			if (Static120.anInt2508 == 56) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2944();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2933();
				local138 = local132 >> 5 & 0x1F;
				local142 = local132 & 0x1F;
				local148 = local132 >> 10 & 0x1F;
				local161 = (local138 << 11) + ((local148 << 19) + (local142 << 3));
				@Pc(165) Class85 local165 = Static140.method2337(local128);
				if (local161 != local165.anInt3837) {
					local165.anInt3837 = local161;
					Static102.method1756(local165);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 61) {
				Static28.anInt626 = Static86.aClass2_Sub13_Sub1_13.method2933() * 30;
				Static120.anInt2508 = -1;
				Static88.anInt1858 = Static69.anInt1431;
				return true;
			}
			if (Static120.anInt2508 == 207) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2939();
				Static3.anInt57 = local128;
				Static180.method2982(local128);
				Static13.method198(Static3.anInt57);
				for (local132 = 0; local132 < 100; local132++) {
					Static171.aBooleanArray18[local132] = true;
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 223) {
				Static70.anInt1438 = Static86.aClass2_Sub13_Sub1_13.method2962();
				if (Static70.anInt1438 == 1) {
					Static23.anInt509 = Static86.aClass2_Sub13_Sub1_13.method2933();
				}
				if (Static70.anInt1438 >= 2 && Static70.anInt1438 <= 6) {
					if (Static70.anInt1438 == 2) {
						Static72.anInt1484 = 64;
						Static7.anInt137 = 64;
					}
					if (Static70.anInt1438 == 3) {
						Static72.anInt1484 = 64;
						Static7.anInt137 = 0;
					}
					if (Static70.anInt1438 == 4) {
						Static7.anInt137 = 128;
						Static72.anInt1484 = 64;
					}
					if (Static70.anInt1438 == 5) {
						Static72.anInt1484 = 0;
						Static7.anInt137 = 64;
					}
					if (Static70.anInt1438 == 6) {
						Static72.anInt1484 = 128;
						Static7.anInt137 = 64;
					}
					Static70.anInt1438 = 2;
					Static124.anInt2747 = Static86.aClass2_Sub13_Sub1_13.method2933();
					Static171.anInt3745 = Static86.aClass2_Sub13_Sub1_13.method2933();
					Static175.anInt3805 = Static86.aClass2_Sub13_Sub1_13.method2962();
				}
				if (Static70.anInt1438 == 10) {
					Static93.anInt1969 = Static86.aClass2_Sub13_Sub1_13.method2933();
				}
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(337) Class49 local337;
			@Pc(330) long local330;
			if (Static120.anInt2508 == 252) {
				local330 = Static86.aClass2_Sub13_Sub1_13.method2936();
				local337 = Static16.method618(Static53.method929(Static86.aClass2_Sub13_Sub1_13).method1675());
				Static88.method1475(Static120.method2046(local330).method1677(), local337, 6);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 31) {
				Static85.method1440(false);
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(423) int local423;
			@Pc(497) int local497;
			@Pc(393) long local393;
			@Pc(490) int local490;
			if (Static120.anInt2508 == 17) {
				Static144.anInt3045 = Static69.anInt1431;
				local330 = Static86.aClass2_Sub13_Sub1_13.method2936();
				if (local330 == 0L) {
					Static169.aClass2_Sub15Array1 = null;
					Static120.anInt2508 = -1;
					Static18.aClass49_240 = null;
					Static40.aClass49_503 = null;
					Static107.anInt2240 = 0;
					return true;
				}
				local393 = Static86.aClass2_Sub13_Sub1_13.method2936();
				Static18.aClass49_240 = Static120.method2046(local393);
				Static40.aClass49_503 = Static120.method2046(local330);
				Static120.aByte8 = Static86.aClass2_Sub13_Sub1_13.method2948();
				local142 = Static86.aClass2_Sub13_Sub1_13.method2962();
				if (local142 == 255) {
					Static120.anInt2508 = -1;
					return true;
				}
				Static107.anInt2240 = local142;
				@Pc(421) Class2_Sub15[] local421 = new Class2_Sub15[100];
				for (local423 = 0; local423 < Static107.anInt2240; local423++) {
					local421[local423] = new Class2_Sub15();
					local421[local423].aLong157 = Static86.aClass2_Sub13_Sub1_13.method2936();
					local421[local423].aClass49_866 = Static120.method2046(local421[local423].aLong157);
					local421[local423].anInt1733 = Static86.aClass2_Sub13_Sub1_13.method2933();
					local421[local423].aByte5 = Static86.aClass2_Sub13_Sub1_13.method2948();
					if (Static179.aLong155 == local421[local423].aLong157) {
						Static59.aByte2 = local421[local423].aByte5;
					}
				}
				local490 = Static107.anInt2240;
				while (local490 > 0) {
					@Pc(494) boolean local494 = true;
					local490--;
					for (local497 = 0; local497 < local490; local497++) {
						if (local421[local497].aClass49_866.method1640(local421[local497 + 1].aClass49_866) > 0) {
							local494 = false;
							@Pc(518) Class2_Sub15 local518 = local421[local497];
							local421[local497] = local421[local497 + 1];
							local421[local497 + 1] = local518;
						}
					}
					if (local494) {
						break;
					}
				}
				Static169.aClass2_Sub15Array1 = local421;
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(566) Class85 local566;
			if (Static120.anInt2508 == 28) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2946();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2933();
				if (local128 < 0) {
					local566 = null;
				} else {
					local566 = Static140.method2337(local128);
				}
				if (local128 < -70000) {
					local132 += 32768;
				}
				while (Static180.anInt3988 > Static86.aClass2_Sub13_Sub1_13.anInt3940) {
					local138 = Static86.aClass2_Sub13_Sub1_13.method2924();
					local142 = Static86.aClass2_Sub13_Sub1_13.method2933();
					local161 = 0;
					if (local142 != 0) {
						local161 = Static86.aClass2_Sub13_Sub1_13.method2962();
						if (local161 == 255) {
							local161 = Static86.aClass2_Sub13_Sub1_13.method2946();
						}
					}
					if (local566 != null && local138 >= 0 && local138 < local566.anIntArray358.length) {
						local566.anIntArray358[local138] = local142;
						local566.anIntArray357[local138] = local161;
					}
					Static108.method1834(local138, local161, local142 - 1, local132);
				}
				if (local566 != null) {
					Static102.method1756(local566);
				}
				Static8.method1803();
				Static71.anIntArray173[Static123.anInt2733++ & 0x1F] = local132 & 0x7FFF;
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 75) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2944();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2917();
				if (local132 == 65535) {
					local132 = -1;
				}
				local566 = Static140.method2337(local128);
				if (local566.anInt3864 != 1 || local132 != local566.anInt3885) {
					local566.anInt3885 = local132;
					local566.anInt3864 = 1;
					Static102.method1756(local566);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 141) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2943();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2917();
				local566 = Static140.method2337(local128);
				if (local566 != null && local566.anInt3855 == 0) {
					if (local566.anInt3839 - local566.anInt3867 < local132) {
						local132 = local566.anInt3839 - local566.anInt3867;
					}
					if (local132 < 0) {
						local132 = 0;
					}
					if (local566.anInt3891 != local132) {
						local566.anInt3891 = local132;
						Static102.method1756(local566);
					}
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 208) {
				Static18.anInt381 = Static180.anInt3988 / 8;
				for (local128 = 0; local128 < Static18.anInt381; local128++) {
					Static76.aLongArray11[local128] = Static86.aClass2_Sub13_Sub1_13.method2936();
					Static30.aClass49Array4[local128] = Static120.method2046(Static76.aLongArray11[local128]);
				}
				Static95.anInt2012 = Static69.anInt1431;
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 151) {
				if (Static3.anInt57 != -1) {
					Static24.method455(0, Static3.anInt57);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 25) {
				Static25.method463(Static45.aClass45_1, Static86.aClass2_Sub13_Sub1_13, Static180.anInt3988);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 192) {
				for (local128 = 0; local128 < Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1.length; local128++) {
					if (Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local128] != null) {
						Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local128].anInt3568 = -1;
					}
				}
				for (local132 = 0; local132 < Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1.length; local132++) {
					if (Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local132] != null) {
						Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local132].anInt3568 = -1;
					}
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 204) {
				Static145.anInt3081 = Static86.aClass2_Sub13_Sub1_13.method2937();
				Static28.anInt627 = Static86.aClass2_Sub13_Sub1_13.method2954();
				while (Static86.aClass2_Sub13_Sub1_13.anInt3940 < Static180.anInt3988) {
					Static120.anInt2508 = Static86.aClass2_Sub13_Sub1_13.method2962();
					Static171.method2847();
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 87) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2958();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2939();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2933();
				local138 = Static86.aClass2_Sub13_Sub1_13.method2925();
				@Pc(963) Class85 local963 = Static140.method2337(local138);
				if (local148 != local963.anInt3853 || local132 != local963.anInt3862 || local128 != local963.anInt3874) {
					local963.anInt3862 = local132;
					local963.anInt3853 = local148;
					local963.anInt3874 = local128;
					Static102.method1756(local963);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(1149) int local1149;
			@Pc(1103) Class2_Sub8 local1103;
			@Pc(1147) int local1147;
			@Pc(1159) long local1159;
			if (Static120.anInt2508 == 59) {
				local128 = Static180.anInt3988 + Static86.aClass2_Sub13_Sub1_13.anInt3940;
				local132 = Static86.aClass2_Sub13_Sub1_13.method2933();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2933();
				if (Static3.anInt57 != local132) {
					Static3.anInt57 = local132;
					Static180.method2982(Static3.anInt57);
					Static13.method198(Static3.anInt57);
					for (local138 = 0; local138 < 100; local138++) {
						Static171.aBooleanArray18[local138] = true;
					}
				}
				while (local148-- > 0) {
					local138 = Static86.aClass2_Sub13_Sub1_13.method2946();
					local142 = Static86.aClass2_Sub13_Sub1_13.method2933();
					local161 = Static86.aClass2_Sub13_Sub1_13.method2962();
					@Pc(1065) Class2_Sub8 local1065 = (Class2_Sub8) Static100.aClass25_7.method836((long) local138);
					if (local1065 != null && local1065.anInt1201 != local142) {
						Static139.method2311(true, local1065);
						local1065 = null;
					}
					if (local1065 == null) {
						local1065 = Static51.method904(local161, local138, local142);
					}
					local1065.aBoolean47 = true;
				}
				for (local1103 = (Class2_Sub8) Static100.aClass25_7.method837(); local1103 != null; local1103 = (Class2_Sub8) Static100.aClass25_7.method834()) {
					if (local1103.aBoolean47) {
						local1103.aBoolean47 = false;
					} else {
						Static139.method2311(true, local1103);
					}
				}
				Static171.aClass25_14 = new Class25(512);
				while (local128 > Static86.aClass2_Sub13_Sub1_13.anInt3940) {
					local142 = Static86.aClass2_Sub13_Sub1_13.method2946();
					local161 = Static86.aClass2_Sub13_Sub1_13.method2933();
					local423 = Static86.aClass2_Sub13_Sub1_13.method2933();
					local1147 = Static86.aClass2_Sub13_Sub1_13.method2946();
					for (local1149 = local161; local1149 <= local423; local1149++) {
						local1159 = (long) local1149 + ((long) local142 << 32);
						Static171.aClass25_14.method838(local1159, new Class2_Sub21(local1147));
					}
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 148) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2946();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2933();
				if (local128 < -70000) {
					local132 += 32768;
				}
				if (local128 < 0) {
					local566 = null;
				} else {
					local566 = Static140.method2337(local128);
				}
				if (local566 != null) {
					for (local138 = 0; local138 < local566.anIntArray358.length; local138++) {
						local566.anIntArray358[local138] = 0;
						local566.anIntArray357[local138] = 0;
					}
				}
				Static130.method2878(local132);
				local138 = Static86.aClass2_Sub13_Sub1_13.method2933();
				for (local142 = 0; local142 < local138; local142++) {
					local161 = Static86.aClass2_Sub13_Sub1_13.method2937();
					if (local161 == 255) {
						local161 = Static86.aClass2_Sub13_Sub1_13.method2946();
					}
					local423 = Static86.aClass2_Sub13_Sub1_13.method2917();
					if (local566 != null && local142 < local566.anIntArray358.length) {
						local566.anIntArray358[local142] = local423;
						local566.anIntArray357[local142] = local161;
					}
					Static108.method1834(local142, local161, local423 - 1, local132);
				}
				if (local566 != null) {
					Static102.method1756(local566);
				}
				Static8.method1803();
				Static71.anIntArray173[Static123.anInt2733++ & 0x1F] = local132 & 0x7FFF;
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 80) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2933();
				@Pc(1343) byte local1343 = Static86.aClass2_Sub13_Sub1_13.method2922();
				Static153.anIntArray294[local128] = local1343;
				if (Static165.anIntArray317[local128] != local1343) {
					Static165.anIntArray317[local128] = local1343;
					Static164.method2769(local128);
				}
				Static151.anIntArray292[Static57.anInt1209++ & 0x1F] = local128;
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 110) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2963();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2944();
				local566 = Static140.method2337(local132);
				if (local566.anInt3863 != local128 || local128 == -1) {
					local566.anInt3824 = 0;
					local566.anInt3863 = local128;
					local566.anInt3888 = 0;
					Static102.method1756(local566);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 173) {
				Static153.method2531();
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 127) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2933();
				if (local128 == 65535) {
					local128 = -1;
				}
				Static161.method2712(local128);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 181) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2933();
				if (local128 == 65535) {
					local128 = -1;
				}
				local132 = Static86.aClass2_Sub13_Sub1_13.method2930();
				Static136.method2265(local132, local128);
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(1491) Class49 local1491;
			if (Static120.anInt2508 == 35) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2943();
				local1491 = Static86.aClass2_Sub13_Sub1_13.method2926();
				local566 = Static140.method2337(local128);
				if (!local1491.method1676(local566.aClass49_1716)) {
					local566.aClass49_1716 = local1491;
					Static102.method1756(local566);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(1520) Class49 local1520;
			if (Static120.anInt2508 == 152) {
				local1520 = Static86.aClass2_Sub13_Sub1_13.method2926();
				@Pc(1527) Object[] local1527 = new Object[local1520.method1653() + 1];
				for (local148 = local1520.method1653() - 1; local148 >= 0; local148--) {
					if (local1520.method1646(local148) == 115) {
						local1527[local148 + 1] = Static86.aClass2_Sub13_Sub1_13.method2926();
					} else {
						local1527[local148 + 1] = Integer.valueOf(Static86.aClass2_Sub13_Sub1_13.method2946());
					}
				}
				local1527[0] = Integer.valueOf(Static86.aClass2_Sub13_Sub1_13.method2946());
				@Pc(1583) Class2_Sub12 local1583 = new Class2_Sub12();
				local1583.anObjectArray2 = local1527;
				Static38.method766(local1583);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 22) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2957();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2957();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2957();
				Static66.anInt1396 = local128 >> 1;
				Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.method2735(local148, (local128 & 0x1) == 1, local132);
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(1656) Class85 local1656;
			if (Static120.anInt2508 == 240) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2917();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2943();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2933();
				local1656 = Static140.method2337(local132);
				Static120.anInt2508 = -1;
				local1656.anInt3878 = (local128 << 16) + local148;
				return true;
			}
			if (Static120.anInt2508 == 92 || Static120.anInt2508 == 95 || Static120.anInt2508 == 197 || Static120.anInt2508 == 55 || Static120.anInt2508 == 123 || Static120.anInt2508 == 143 || Static120.anInt2508 == 11 || Static120.anInt2508 == 232 || Static120.anInt2508 == 126 || Static120.anInt2508 == 161 || Static120.anInt2508 == 171) {
				Static171.method2847();
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 220) {
				Static153.method2526();
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 160) {
				Static85.method1440(true);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 108) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2939();
				if (local128 == 65535) {
					local128 = -1;
				}
				local132 = Static86.aClass2_Sub13_Sub1_13.method2944();
				local566 = Static140.method2337(local132);
				if (local566.anInt3864 != 2 || local128 != local566.anInt3885) {
					local566.anInt3885 = local128;
					local566.anInt3864 = 2;
					Static102.method1756(local566);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 166) {
				Static28.anInt627 = Static86.aClass2_Sub13_Sub1_13.method2937();
				Static145.anInt3081 = Static86.aClass2_Sub13_Sub1_13.method2937();
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 136) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2925();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2943();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2958();
				local1656 = Static140.method2337(local132);
				if (local148 == 65535) {
					local148 = -1;
				}
				@Pc(1840) Class2_Sub2_Sub10 local1840;
				if (local1656.aBoolean171) {
					local1656.anInt3821 = local128;
					local1656.anInt3826 = local148;
					local1840 = Static113.method1913(local148);
					local1656.anInt3871 = local1840.anInt1615;
					local1656.anInt3862 = local1840.anInt1624;
					local1656.anInt3843 = local1840.anInt1617;
					local1656.anInt3856 = local1840.anInt1600;
					local1656.anInt3874 = local1840.anInt1608;
					local1656.anInt3853 = local1840.anInt1587;
					if (local1656.anInt3858 > 0) {
						local1656.anInt3874 = local1656.anInt3874 * 32 / local1656.anInt3858;
					}
					Static102.method1756(local1656);
				} else if (local148 == -1) {
					Static120.anInt2508 = -1;
					local1656.anInt3864 = 0;
					return true;
				} else {
					local1840 = Static113.method1913(local148);
					local1656.anInt3885 = local148;
					local1656.anInt3853 = local1840.anInt1587;
					local1656.anInt3862 = local1840.anInt1624;
					local1656.anInt3874 = local1840.anInt1608 * 100 / local128;
					local1656.anInt3864 = 4;
					Static102.method1756(local1656);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 186) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2962();
				if (Static86.aClass2_Sub13_Sub1_13.method2962() == 0) {
					Static17.aClass61Array2[local128] = new Class61();
				} else {
					Static86.aClass2_Sub13_Sub1_13.anInt3940--;
					Static17.aClass61Array2[local128] = new Class61(Static86.aClass2_Sub13_Sub1_13);
				}
				Static131.anInt3735 = Static69.anInt1431;
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(2003) boolean local2003;
			if (Static120.anInt2508 == 27) {
				local1520 = Static86.aClass2_Sub13_Sub1_13.method2926();
				if (local1520.method1668(Static152.aClass49_1483)) {
					local1491 = local1520.method1661(local1520.method1666(Static139.aClass49_1341), 0);
					local393 = local1491.method1651();
					local2003 = false;
					for (local161 = 0; local161 < Static18.anInt381; local161++) {
						if (local393 == Static76.aLongArray11[local161]) {
							local2003 = true;
							break;
						}
					}
					if (!local2003 && Static32.anInt846 == 0) {
						Static88.method1475(local1491, Static49.aClass49_568, 4);
					}
				} else if (local1520.method1668(Static150.aClass49_1452)) {
					local1491 = local1520.method1661(local1520.method1666(Static139.aClass49_1341), 0);
					local2003 = false;
					local393 = local1491.method1651();
					for (local161 = 0; local161 < Static18.anInt381; local161++) {
						if (local393 == Static76.aLongArray11[local161]) {
							local2003 = true;
							break;
						}
					}
					if (!local2003 && Static32.anInt846 == 0) {
						@Pc(2102) Class49 local2102 = local1520.method1661(local1520.method1653() - 9, local1520.method1666(Static139.aClass49_1341) + 1);
						Static88.method1475(local1491, local2102, 8);
					}
				} else if (local1520.method1668(Static168.aClass49_1642)) {
					local1491 = local1520.method1661(local1520.method1666(Static139.aClass49_1341), 0);
					local2003 = false;
					local393 = local1491.method1651();
					for (local161 = 0; local161 < Static18.anInt381; local161++) {
						if (local393 == Static76.aLongArray11[local161]) {
							local2003 = true;
							break;
						}
					}
					if (!local2003 && Static32.anInt846 == 0) {
						Static88.method1475(local1491, Static154.aClass49_1489, 10);
					}
				} else if (local1520.method1668(Static156.aClass49_1528)) {
					local1491 = local1520.method1661(local1520.method1666(Static156.aClass49_1528), 0);
					Static88.method1475(Static154.aClass49_1489, local1491, 11);
				} else if (local1520.method1668(Static87.aClass49_1324)) {
					local1491 = local1520.method1661(local1520.method1666(Static87.aClass49_1324), 0);
					if (Static32.anInt846 == 0) {
						Static88.method1475(Static154.aClass49_1489, local1491, 12);
					}
				} else if (local1520.method1668(Static110.aClass49_1068)) {
					local1491 = local1520.method1661(local1520.method1666(Static110.aClass49_1068), 0);
					if (Static32.anInt846 == 0) {
						Static88.method1475(Static154.aClass49_1489, local1491, 13);
					}
				} else if (local1520.method1668(Static2.aClass49_14)) {
					local1491 = local1520.method1661(local1520.method1666(Static139.aClass49_1341), 0);
					local393 = local1491.method1651();
					local2003 = false;
					for (local161 = 0; local161 < Static18.anInt381; local161++) {
						if (local393 == Static76.aLongArray11[local161]) {
							local2003 = true;
							break;
						}
					}
					if (!local2003 && Static32.anInt846 == 0) {
						Static88.method1475(local1491, Static154.aClass49_1489, 14);
					}
				} else if (local1520.method1668(Static51.aClass49_587)) {
					local2003 = false;
					local1491 = local1520.method1661(local1520.method1666(Static139.aClass49_1341), 0);
					local393 = local1491.method1651();
					for (local161 = 0; local161 < Static18.anInt381; local161++) {
						if (Static76.aLongArray11[local161] == local393) {
							local2003 = true;
							break;
						}
					}
					if (!local2003 && Static32.anInt846 == 0) {
						Static88.method1475(local1491, Static154.aClass49_1489, 15);
					}
				} else if (local1520.method1668(Static55.aClass49_604)) {
					local1491 = local1520.method1661(local1520.method1666(Static139.aClass49_1341), 0);
					local2003 = false;
					local393 = local1491.method1651();
					for (local161 = 0; local161 < Static18.anInt381; local161++) {
						if (local393 == Static76.aLongArray11[local161]) {
							local2003 = true;
							break;
						}
					}
					if (!local2003 && Static32.anInt846 == 0) {
						Static88.method1475(local1491, Static154.aClass49_1489, 16);
					}
				} else {
					Static88.method1475(Static154.aClass49_1489, local1520, 0);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(2479) int local2479;
			@Pc(2439) long local2439;
			if (Static120.anInt2508 == 174) {
				local330 = Static86.aClass2_Sub13_Sub1_13.method2936();
				Static86.aClass2_Sub13_Sub1_13.method2948();
				@Pc(2430) boolean local2430 = false;
				local393 = Static86.aClass2_Sub13_Sub1_13.method2936();
				local2439 = Static86.aClass2_Sub13_Sub1_13.method2933();
				@Pc(2444) long local2444 = (long) Static86.aClass2_Sub13_Sub1_13.method2942();
				local1149 = Static86.aClass2_Sub13_Sub1_13.method2962();
				local1159 = local2444 + (local2439 << 32);
				for (@Pc(2456) int local2456 = 0; local2456 < 100; local2456++) {
					if (local1159 == Static161.aLongArray19[local2456]) {
						local2430 = true;
						break;
					}
				}
				if (local1149 <= 1) {
					for (local2479 = 0; local2479 < Static18.anInt381; local2479++) {
						if (Static76.aLongArray11[local2479] == local330) {
							local2430 = true;
							break;
						}
					}
				}
				if (!local2430 && Static32.anInt846 == 0) {
					Static161.aLongArray19[Static90.anInt1925] = local1159;
					Static90.anInt1925 = (Static90.anInt1925 + 1) % 100;
					@Pc(2523) Class49 local2523 = Static16.method618(Static53.method929(Static86.aClass2_Sub13_Sub1_13).method1675());
					if (local1149 == 2 || local1149 == 3) {
						Static102.method1753(Static33.method692(new Class49[] { Static9.aClass49_87, Static120.method2046(local330).method1677() }), Static120.method2046(local393).method1677(), 9, local2523);
					} else if (local1149 == 1) {
						Static102.method1753(Static33.method692(new Class49[] { Static63.aClass49_690, Static120.method2046(local330).method1677() }), Static120.method2046(local393).method1677(), 9, local2523);
					} else {
						Static102.method1753(Static120.method2046(local330).method1677(), Static120.method2046(local393).method1677(), 9, local2523);
					}
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 228) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2963();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2943();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2923();
				local1656 = Static140.method2337(local132);
				local142 = local1656.anInt3828 + local148;
				local161 = local1656.anInt3857 + local128;
				if (local142 != local1656.anInt3827 || local161 != local1656.anInt3886) {
					local1656.anInt3827 = local142;
					local1656.anInt3886 = local161;
					Static102.method1756(local1656);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 23) {
				Static8.method1803();
				Static155.anInt3386 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static120.anInt2508 = -1;
				Static88.anInt1858 = Static69.anInt1431;
				return true;
			}
			if (Static120.anInt2508 == 175) {
				Static36.anInt924 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 0) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2958();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2944();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2937();
				local1103 = (Class2_Sub8) Static100.aClass25_7.method836((long) local132);
				if (local1103 != null) {
					Static139.method2311(local128 != local1103.anInt1201, local1103);
				}
				Static51.method904(local148, local132, local128);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 105) {
				for (local128 = 0; local128 < Static73.anInt1523; local128++) {
					@Pc(2759) Class2_Sub2_Sub7 local2759 = Static155.method2620(local128);
					if (local2759 != null && local2759.anInt1421 == 0) {
						Static153.anIntArray294[local128] = 0;
						Static165.anIntArray317[local128] = 0;
					}
				}
				Static8.method1803();
				Static57.anInt1209 += 32;
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 74) {
				local330 = Static86.aClass2_Sub13_Sub1_13.method2936();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2933();
				local138 = Static86.aClass2_Sub13_Sub1_13.method2962();
				@Pc(2812) Class49 local2812 = Static120.method2046(local330).method1677();
				for (local161 = 0; local161 < Static175.anInt3799; local161++) {
					if (Static96.aLongArray12[local161] == local330) {
						if (Static85.anIntArray188[local161] != local148) {
							Static85.anIntArray188[local161] = local148;
							if (local148 > 0) {
								Static88.method1475(Static154.aClass49_1489, Static33.method692(new Class49[] { local2812, Static171.aClass49_1677 }), 5);
							}
							if (local148 == 0) {
								Static88.method1475(Static154.aClass49_1489, Static33.method692(new Class49[] { local2812, Static128.aClass49_1254 }), 5);
							}
						}
						Static126.anIntArray261[local161] = local138;
						local2812 = null;
						break;
					}
				}
				if (local2812 != null && Static175.anInt3799 < 200) {
					Static96.aLongArray12[Static175.anInt3799] = local330;
					Static101.aClass49Array14[Static175.anInt3799] = local2812;
					Static85.anIntArray188[Static175.anInt3799] = local148;
					Static126.anIntArray261[Static175.anInt3799] = local138;
					Static175.anInt3799++;
				}
				Static95.anInt2012 = Static69.anInt1431;
				local1147 = Static175.anInt3799;
				while (local1147 > 0) {
					@Pc(2933) boolean local2933 = true;
					local1147--;
					for (local1149 = 0; local1149 < local1147; local1149++) {
						if (Static85.anIntArray188[local1149] != Static67.anInt1405 && Static67.anInt1405 == Static85.anIntArray188[local1149 + 1] || Static85.anIntArray188[local1149] == 0 && Static85.anIntArray188[local1149 + 1] != 0) {
							local2933 = false;
							local490 = Static85.anIntArray188[local1149];
							Static85.anIntArray188[local1149] = Static85.anIntArray188[local1149 + 1];
							Static85.anIntArray188[local1149 + 1] = local490;
							@Pc(2988) Class49 local2988 = Static101.aClass49Array14[local1149];
							Static101.aClass49Array14[local1149] = Static101.aClass49Array14[local1149 + 1];
							Static101.aClass49Array14[local1149 + 1] = local2988;
							@Pc(3006) long local3006 = Static96.aLongArray12[local1149];
							Static96.aLongArray12[local1149] = Static96.aLongArray12[local1149 + 1];
							Static96.aLongArray12[local1149 + 1] = local3006;
							local2479 = Static126.anIntArray261[local1149];
							Static126.anIntArray261[local1149] = Static126.anIntArray261[local1149 + 1];
							Static126.anIntArray261[local1149 + 1] = local2479;
						}
					}
					if (local2933) {
						break;
					}
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 3) {
				local330 = Static86.aClass2_Sub13_Sub1_13.method2936();
				local393 = Static86.aClass2_Sub13_Sub1_13.method2933();
				@Pc(3066) boolean local3066 = false;
				local2439 = Static86.aClass2_Sub13_Sub1_13.method2942();
				local423 = Static86.aClass2_Sub13_Sub1_13.method2962();
				@Pc(3081) long local3081 = local2439 + (local393 << 32);
				for (local497 = 0; local497 < 100; local497++) {
					if (Static161.aLongArray19[local497] == local3081) {
						local3066 = true;
						break;
					}
				}
				if (local423 <= 1) {
					for (@Pc(3110) int local3110 = 0; local3110 < Static18.anInt381; local3110++) {
						if (Static76.aLongArray11[local3110] == local330) {
							local3066 = true;
							break;
						}
					}
				}
				if (!local3066 && Static32.anInt846 == 0) {
					Static161.aLongArray19[Static90.anInt1925] = local3081;
					Static90.anInt1925 = (Static90.anInt1925 + 1) % 100;
					@Pc(3158) Class49 local3158 = Static16.method618(Static53.method929(Static86.aClass2_Sub13_Sub1_13).method1675());
					if (local423 == 2 || local423 == 3) {
						Static88.method1475(Static33.method692(new Class49[] { Static9.aClass49_87, Static120.method2046(local330).method1677() }), local3158, 7);
					} else if (local423 == 1) {
						Static88.method1475(Static33.method692(new Class49[] { Static63.aClass49_690, Static120.method2046(local330).method1677() }), local3158, 7);
					} else {
						Static88.method1475(Static120.method2046(local330).method1677(), local3158, 3);
					}
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 233) {
				local330 = Static86.aClass2_Sub13_Sub1_13.method2936();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2933();
				@Pc(3247) byte local3247 = Static86.aClass2_Sub13_Sub1_13.method2948();
				local2003 = false;
				if ((local330 & Long.MIN_VALUE) != 0L) {
					local2003 = true;
				}
				if (local2003) {
					if (Static107.anInt2240 == 0) {
						Static120.anInt2508 = -1;
						return true;
					}
					local330 &= Long.MAX_VALUE;
					for (local161 = 0; local161 < Static107.anInt2240 && (local330 != Static169.aClass2_Sub15Array1[local161].aLong157 || local148 != Static169.aClass2_Sub15Array1[local161].anInt1733); local161++) {
					}
					if (Static107.anInt2240 > local161) {
						while (local161 < Static107.anInt2240 - 1) {
							Static169.aClass2_Sub15Array1[local161] = Static169.aClass2_Sub15Array1[local161 + 1];
							local161++;
						}
						Static107.anInt2240--;
						Static169.aClass2_Sub15Array1[Static107.anInt2240] = null;
					}
				} else {
					@Pc(3342) Class2_Sub15 local3342 = new Class2_Sub15();
					local3342.aLong157 = local330;
					local3342.aClass49_866 = Static120.method2046(local3342.aLong157);
					local3342.anInt1733 = local148;
					local3342.aByte5 = local3247;
					for (local423 = Static107.anInt2240 - 1; local423 >= 0; local423--) {
						local1147 = Static169.aClass2_Sub15Array1[local423].aClass49_866.method1640(local3342.aClass49_866);
						if (local1147 == 0) {
							Static169.aClass2_Sub15Array1[local423].anInt1733 = local148;
							Static169.aClass2_Sub15Array1[local423].aByte5 = local3247;
							Static144.anInt3045 = Static69.anInt1431;
							if (local330 == Static179.aLong155) {
								Static59.aByte2 = local3247;
							}
							Static120.anInt2508 = -1;
							return true;
						}
						if (local1147 < 0) {
							break;
						}
					}
					if (Static169.aClass2_Sub15Array1.length <= Static107.anInt2240) {
						Static120.anInt2508 = -1;
						return true;
					}
					for (local1147 = Static107.anInt2240 - 1; local1147 > local423; local1147--) {
						Static169.aClass2_Sub15Array1[local1147 + 1] = Static169.aClass2_Sub15Array1[local1147];
					}
					if (Static107.anInt2240 == 0) {
						Static169.aClass2_Sub15Array1 = new Class2_Sub15[100];
					}
					Static169.aClass2_Sub15Array1[local423 + 1] = local3342;
					Static107.anInt2240++;
					if (Static179.aLong155 == local330) {
						Static59.aByte2 = local3247;
					}
				}
				Static120.anInt2508 = -1;
				Static144.anInt3045 = Static69.anInt1431;
				return true;
			}
			if (Static120.anInt2508 == 244) {
				Static142.anInt3015 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static120.anInt2508 = -1;
				Static95.anInt2012 = Static69.anInt1431;
				return true;
			}
			if (Static120.anInt2508 == 113) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2958();
				Static107.method1823(local128);
				Static71.anIntArray173[Static123.anInt2733++ & 0x1F] = local128 & 0x7FFF;
				Static120.anInt2508 = -1;
				return true;
			}
			@Pc(3515) Class85 local3515;
			if (Static120.anInt2508 == 250) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2943();
				local3515 = Static140.method2337(local128);
				for (local148 = 0; local148 < local3515.anIntArray358.length; local148++) {
					local3515.anIntArray358[local148] = -1;
					local3515.anIntArray358[local148] = 0;
				}
				Static102.method1756(local3515);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 72) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2925();
				Static51.aClass16_3 = Static45.aClass45_1.method1488(local128);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 10) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2946();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2958();
				Static153.anIntArray294[local132] = local128;
				if (local128 != Static165.anIntArray317[local132]) {
					Static165.anIntArray317[local132] = local128;
					Static164.method2769(local132);
				}
				Static151.anIntArray292[Static57.anInt1209++ & 0x1F] = local132;
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 53) {
				Static42.method819(Static86.aClass2_Sub13_Sub1_13);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 135) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2933();
				if (local128 == 65535) {
					local128 = -1;
				}
				local132 = Static86.aClass2_Sub13_Sub1_13.method2962();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2933();
				Static7.method107(local132, local128, local148);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 140) {
				for (local128 = 0; local128 < Static165.anIntArray317.length; local128++) {
					if (Static153.anIntArray294[local128] != Static165.anIntArray317[local128]) {
						Static165.anIntArray317[local128] = Static153.anIntArray294[local128];
						Static164.method2769(local128);
						Static151.anIntArray292[Static57.anInt1209++ & 0x1F] = local128;
					}
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 52) {
				Static28.anInt627 = Static86.aClass2_Sub13_Sub1_13.method2937();
				Static145.anInt3081 = Static86.aClass2_Sub13_Sub1_13.method2954();
				for (local128 = Static28.anInt627; local128 < Static28.anInt627 + 8; local128++) {
					for (local132 = Static145.anInt3081; local132 < Static145.anInt3081 + 8; local132++) {
						if (Static177.aClass81ArrayArrayArray1[Static66.anInt1396][local128][local132] != null) {
							Static177.aClass81ArrayArrayArray1[Static66.anInt1396][local128][local132] = null;
							Static151.method2502(local128, local132);
						}
					}
				}
				for (@Pc(3760) Class2_Sub11 local3760 = (Class2_Sub11) Static43.aClass81_3.method2682(); local3760 != null; local3760 = (Class2_Sub11) Static43.aClass81_3.method2686()) {
					if (local3760.anInt1544 >= Static28.anInt627 && local3760.anInt1544 < Static28.anInt627 + 8 && Static145.anInt3081 <= local3760.anInt1540 && Static145.anInt3081 + 8 > local3760.anInt1540 && local3760.anInt1541 == Static66.anInt1396) {
						local3760.anInt1549 = 0;
					}
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 149) {
				@Pc(3836) boolean local3836 = Static86.aClass2_Sub13_Sub1_13.method2937() == 1;
				local132 = Static86.aClass2_Sub13_Sub1_13.method2943();
				local566 = Static140.method2337(local132);
				if (local566.aBoolean161 != local3836) {
					local566.aBoolean161 = local3836;
					Static102.method1756(local566);
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 218) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2925();
				local3515 = Static140.method2337(local128);
				local3515.anInt3864 = 3;
				local3515.anInt3885 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass10_2.method219();
				Static102.method1756(local3515);
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 84) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2937();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2954();
				local337 = Static86.aClass2_Sub13_Sub1_13.method2926();
				if (local132 >= 1 && local132 <= 8) {
					if (local337.method1645(Static31.aClass49_428)) {
						local337 = null;
					}
					Static182.aClass49Array24[local132 - 1] = local337;
					Static6.aBooleanArray1[local132 - 1] = local128 == 0;
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 101) {
				Static96.aBoolean84 = true;
				Static12.anInt221 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static116.anInt2428 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static79.anInt4043 = Static86.aClass2_Sub13_Sub1_13.method2933();
				Static165.anInt3583 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static30.anInt745 = Static86.aClass2_Sub13_Sub1_13.method2962();
				if (Static30.anInt745 >= 100) {
					Static101.anInt2150 = Static116.anInt2428 * 128 + 64;
					Static35.anInt894 = Static12.anInt221 * 128 + 64;
					Static110.anInt2302 = Static18.method346(Static101.anInt2150, Static66.anInt1396, Static35.anInt894) - Static79.anInt4043;
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 89) {
				Static8.method1803();
				local128 = Static86.aClass2_Sub13_Sub1_13.method2944();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2957();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2954();
				Static171.anIntArray333[local148] = local128;
				Static17.anIntArray242[local148] = local132;
				Static163.anIntArray58[local148] = 1;
				for (local138 = 0; local138 < 98; local138++) {
					if (Class2_Sub3_Sub30.anIntArray290[local138] <= local128) {
						Static163.anIntArray58[local148] = local138 + 2;
					}
				}
				Static83.anIntArray187[Static94.anInt1977++ & 0x1F] = local148;
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 133) {
				Static96.aBoolean84 = true;
				Static107.anInt2244 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static146.anInt3098 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static20.anInt446 = Static86.aClass2_Sub13_Sub1_13.method2933();
				Static160.anInt3501 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static138.anInt2939 = Static86.aClass2_Sub13_Sub1_13.method2962();
				if (Static138.anInt2939 >= 100) {
					local128 = Static107.anInt2244 * 128 + 64;
					local132 = Static146.anInt3098 * 128 + 64;
					local148 = Static18.method346(local132, Static66.anInt1396, local128) - Static20.anInt446;
					local161 = local132 - Static101.anInt2150;
					local142 = local148 - Static110.anInt2302;
					local138 = local128 - Static35.anInt894;
					local423 = (int) Math.sqrt((double) (local161 * local161 + local138 * local138));
					Static66.anInt1389 = (int) (Math.atan2((double) local142, (double) local423) * 325.949D) & 0x7FF;
					Static127.anInt2754 = (int) (-325.949D * Math.atan2((double) local138, (double) local161)) & 0x7FF;
					if (Static66.anInt1389 < 128) {
						Static66.anInt1389 = 128;
					}
					if (Static66.anInt1389 > 383) {
						Static66.anInt1389 = 383;
					}
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 24) {
				Static120.anInt2508 = -1;
				Static37.anInt934 = 0;
				return true;
			}
			if (Static120.anInt2508 == 237) {
				Static107.method1821();
				Static120.anInt2508 = -1;
				return false;
			}
			if (Static120.anInt2508 == 57) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2946();
				@Pc(4203) Class2_Sub8 local4203 = (Class2_Sub8) Static100.aClass25_7.method836((long) local128);
				if (local4203 != null) {
					Static139.method2311(true, local4203);
				}
				if (Static141.aClass85_12 != null) {
					Static102.method1756(Static141.aClass85_12);
					Static141.aClass85_12 = null;
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 5) {
				Static8.method1803();
				Static163.anInt694 = Static86.aClass2_Sub13_Sub1_13.method2941();
				Static88.anInt1858 = Static69.anInt1431;
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 86) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2962();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2962();
				local148 = Static86.aClass2_Sub13_Sub1_13.method2962();
				local138 = Static86.aClass2_Sub13_Sub1_13.method2962();
				local142 = Static86.aClass2_Sub13_Sub1_13.method2933();
				Static124.aBooleanArray15[local128] = true;
				Static95.anIntArray202[local128] = local132;
				Static29.anIntArray59[local128] = local148;
				Static160.anIntArray314[local128] = local138;
				Static62.anIntArray163[local128] = local142;
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 203) {
				Static76.anInt1568 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static128.anInt2776 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static11.anInt189 = Static86.aClass2_Sub13_Sub1_13.method2962();
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 165) {
				local128 = Static86.aClass2_Sub13_Sub1_13.method2946();
				local132 = Static86.aClass2_Sub13_Sub1_13.method2917();
				if (local132 == 65535) {
					local132 = -1;
				}
				local148 = Static86.aClass2_Sub13_Sub1_13.method2958();
				local138 = Static86.aClass2_Sub13_Sub1_13.method2943();
				if (local148 == 65535) {
					local148 = -1;
				}
				for (local142 = local148; local142 <= local132; local142++) {
					@Pc(4350) long local4350 = ((long) local138 << 32) + (long) local142;
					@Pc(4355) Class2 local4355 = Static171.aClass25_14.method836(local4350);
					if (local4355 != null) {
						local4355.method3007();
					}
					Static171.aClass25_14.method838(local4350, new Class2_Sub21(local128));
				}
				Static120.anInt2508 = -1;
				return true;
			}
			if (Static120.anInt2508 == 189) {
				Static96.aBoolean84 = false;
				for (local128 = 0; local128 < 5; local128++) {
					Static124.aBooleanArray15[local128] = false;
				}
				Static120.anInt2508 = -1;
				return true;
			}
			Static8.method1789("T1 - " + Static120.anInt2508 + "," + Static171.anInt3746 + "," + Static76.anInt1566 + " - " + Static180.anInt3988, null);
			Static107.method1821();
		} catch (@Pc(4427) IOException local4427) {
			Static48.method881();
		} catch (@Pc(4431) Exception local4431) {
			@Pc(4472) String local4472 = "T2 - " + Static120.anInt2508 + "," + Static171.anInt3746 + "," + Static76.anInt1566 + " - " + Static180.anInt3988 + "," + (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0] + Static49.anInt1133) + "," + (Static38.anInt944 + Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0]) + " - ";
			for (local132 = 0; local132 < Static180.anInt3988 && local132 < 50; local132++) {
				local4472 = local4472 + Static86.aClass2_Sub13_Sub1_13.aByteArray49[local132] + ",";
			}
			Static8.method1789(local4472, local4431);
			Static107.method1821();
		}
		return true;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	public static void method2684() {
		aClass49_1568 = null;
		aClass49_1566 = null;
		aClass49_1567 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!vg;II)I")
	public static int method2687(@OriginalArg(0) Class85 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray35 == null || arg0.anIntArrayArray35.length <= arg1) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray35[arg1];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			while (true) {
				@Pc(35) int local35 = local24[local28++];
				@Pc(37) int local37 = 0;
				@Pc(39) byte local39 = 0;
				if (local35 == 0) {
					return local26;
				}
				if (local35 == 15) {
					local39 = 1;
				}
				if (local35 == 16) {
					local39 = 2;
				}
				if (local35 == 1) {
					local37 = Static17.anIntArray242[local24[local28++]];
				}
				if (local35 == 2) {
					local37 = Static163.anIntArray58[local24[local28++]];
				}
				if (local35 == 17) {
					local39 = 3;
				}
				if (local35 == 3) {
					local37 = Static171.anIntArray333[local24[local28++]];
				}
				@Pc(106) int local106;
				@Pc(117) Class85 local117;
				@Pc(122) int local122;
				@Pc(134) int local134;
				if (local35 == 4) {
					local106 = local24[local28++] << 16;
					@Pc(113) int local113 = local106 + local24[local28++];
					local117 = Static140.method2337(local113);
					local122 = local24[local28++];
					if (local122 != -1 && (!Static113.method1913(local122).aBoolean69 || Static62.aBoolean56)) {
						for (local134 = 0; local134 < local117.anIntArray358.length; local134++) {
							if (local117.anIntArray358[local134] == local122 + 1) {
								local37 += local117.anIntArray357[local134];
							}
						}
					}
				}
				if (local35 == 5) {
					local37 = Static165.anIntArray317[local24[local28++]];
				}
				if (local35 == 6) {
					local37 = Class2_Sub3_Sub30.anIntArray290[Static163.anIntArray58[local24[local28++]] - 1];
				}
				if (local35 == 7) {
					local37 = Static165.anIntArray317[local24[local28++]] * 100 / 46875;
				}
				if (local35 == 8) {
					local37 = Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3599;
				}
				if (local35 == 9) {
					for (local106 = 0; local106 < 25; local106++) {
						if (Static176.aBooleanArray19[local106]) {
							local37 += Static163.anIntArray58[local106];
						}
					}
				}
				if (local35 == 10) {
					local106 = local24[local28++] << 16;
					local106 += local24[local28++];
					local117 = Static140.method2337(local106);
					local122 = local24[local28++];
					if (local122 != -1 && (!Static113.method1913(local122).aBoolean69 || Static62.aBoolean56)) {
						for (local134 = 0; local134 < local117.anIntArray358.length; local134++) {
							if (local117.anIntArray358[local134] == local122 + 1) {
								local37 = 999999999;
								break;
							}
						}
					}
				}
				if (local35 == 11) {
					local37 = Static155.anInt3386;
				}
				if (local35 == 12) {
					local37 = Static163.anInt694;
				}
				if (local35 == 13) {
					local106 = Static165.anIntArray317[local24[local28++]];
					@Pc(319) int local319 = local24[local28++];
					local37 = (local106 & 0x1 << local319) == 0 ? 0 : 1;
				}
				if (local35 == 14) {
					local106 = local24[local28++];
					local37 = Static102.method1754(local106);
				}
				if (local35 == 18) {
					local37 = Static49.anInt1133 + (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3529 >> 7);
				}
				if (local35 == 19) {
					local37 = (Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anInt3578 >> 7) + Static38.anInt944;
				}
				if (local35 == 20) {
					local37 = local24[local28++];
				}
				if (local39 == 0) {
					if (local30 == 0) {
						local26 += local37;
					}
					if (local30 == 1) {
						local26 -= local37;
					}
					if (local30 == 2 && local37 != 0) {
						local26 /= local37;
					}
					if (local30 == 3) {
						local26 *= local37;
					}
					local30 = 0;
				} else {
					local30 = local39;
				}
			}
		} catch (@Pc(420) Exception local420) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!lf;ILclient!bg;Lclient!lf;BZI)V")
	public static void method2690(@OriginalArg(0) Class49 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class49 arg2) {
		@Pc(8) int local8 = arg1.method2053(arg0);
		@Pc(22) int local22 = arg1.method2056(arg2, local8);
		Static122.method2086(local8, local22, arg1, 255);
	}
}
