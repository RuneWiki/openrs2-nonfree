import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "I")
	public static int anInt2317;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	public static int anInt2319;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "[I")
	public static int[] anIntArray260;

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] aClass2_Sub1_Sub7_Sub2Array6;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_620 = Static158.method3034("Unable to connect)3");

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "Lclient!ob;")
	public static Class60 aClass60_617 = aClass60_620;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_618 = Static158.method3034("Texturen geladen)3");

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_623 = Static158.method3034("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "Lclient!ob;")
	public static Class60 aClass60_619 = aClass60_623;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
	public static int anInt2320 = 0;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_622 = Static158.method3034("scrollen:");

	@OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_624 = Static158.method3034("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lclient!ob;")
	public static Class60 aClass60_625 = aClass60_620;

	@OriginalMember(owner = "client!ic", name = "cb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_626 = Static158.method3034("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z")
	public static boolean method1853() {
		if (Static29.aClass66_10 == null) {
			return false;
		}
		@Pc(140) int local140;
		try {
			@Pc(13) int local13 = Static29.aClass66_10.method2841();
			if (local13 == 0) {
				return false;
			}
			if (Static62.anInt1922 == -1) {
				local13--;
				Static29.aClass66_10.method2839(1, Static139.aClass2_Sub3_Sub1_32.aByteArray4, 0);
				Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
				Static62.anInt1922 = Static139.aClass2_Sub3_Sub1_32.method251();
				Static168.anInt4121 = Static41.anIntArray119[Static62.anInt1922];
			}
			if (Static168.anInt4121 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static29.aClass66_10.method2839(1, Static139.aClass2_Sub3_Sub1_32.aByteArray4, 0);
				local13--;
				Static168.anInt4121 = Static139.aClass2_Sub3_Sub1_32.aByteArray4[0] & 0xFF;
			}
			if (Static168.anInt4121 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static29.aClass66_10.method2839(2, Static139.aClass2_Sub3_Sub1_32.aByteArray4, 0);
				local13 -= 2;
				Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
				Static168.anInt4121 = Static139.aClass2_Sub3_Sub1_32.method234();
			}
			if (local13 < Static168.anInt4121) {
				return false;
			}
			Static139.aClass2_Sub3_Sub1_32.anInt273 = 0;
			Static29.aClass66_10.method2839(Static168.anInt4121, Static139.aClass2_Sub3_Sub1_32.aByteArray4, 0);
			Static175.anInt4268 = Static54.anInt1755;
			Static46.anInt1433 = 0;
			Static54.anInt1755 = Static156.anInt3973;
			Static156.anInt3973 = Static62.anInt1922;
			@Pc(122) int local122;
			if (Static62.anInt1922 == 56) {
				for (local122 = 0; local122 < Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3.length; local122++) {
					if (Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local122] != null) {
						Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local122].anInt3270 = -1;
					}
				}
				for (local140 = 0; local140 < Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1.length; local140++) {
					if (Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local140] != null) {
						Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local140].anInt3270 = -1;
					}
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 88) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method218();
				local140 = local122 >> 6;
				@Pc(179) Class47 local179 = new Class47();
				local179.anInt2856 = local122 & 0x3F;
				local179.anInt2860 = Static139.aClass2_Sub3_Sub1_32.method218();
				if (local179.anInt2860 >= 0 && Static63.aClass2_Sub1_Sub7_Sub4Array5.length > local179.anInt2860) {
					if (local179.anInt2856 == 1 || local179.anInt2856 == 10) {
						local179.anInt2853 = Static139.aClass2_Sub3_Sub1_32.method234();
					}
					if (local179.anInt2856 >= 2 && local179.anInt2856 <= 6) {
						if (local179.anInt2856 == 2) {
							local179.anInt2859 = 64;
							local179.anInt2862 = 64;
						}
						if (local179.anInt2856 == 3) {
							local179.anInt2859 = 64;
							local179.anInt2862 = 0;
						}
						if (local179.anInt2856 == 4) {
							local179.anInt2862 = 128;
							local179.anInt2859 = 64;
						}
						if (local179.anInt2856 == 5) {
							local179.anInt2859 = 0;
							local179.anInt2862 = 64;
						}
						if (local179.anInt2856 == 6) {
							local179.anInt2862 = 64;
							local179.anInt2859 = 128;
						}
						local179.anInt2856 = 2;
						local179.anInt2857 = Static139.aClass2_Sub3_Sub1_32.method234();
						local179.anInt2855 = Static139.aClass2_Sub3_Sub1_32.method234();
						local179.anInt2854 = Static139.aClass2_Sub3_Sub1_32.method218();
					}
					Static177.aClass47Array1[local140] = local179;
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 237) {
				Static134.anInt3571 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static103.anInt2977 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(399) int local399;
			@Pc(352) Class72 local352;
			@Pc(362) int local362;
			@Pc(393) int local393;
			@Pc(403) int local403;
			if (Static62.anInt1922 == 217) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method206();
				local140 = Static139.aClass2_Sub3_Sub1_32.method234();
				if (local122 < -70000) {
					local140 += 32768;
				}
				if (local122 < 0) {
					local352 = null;
				} else {
					local352 = Static173.method3201(local122);
				}
				if (local352 != null) {
					for (local362 = 0; local362 < local352.anIntArray436.length; local362++) {
						local352.anIntArray436[local362] = 0;
						local352.anIntArray430[local362] = 0;
					}
				}
				Static95.method2243(local140);
				local362 = Static139.aClass2_Sub3_Sub1_32.method234();
				for (local393 = 0; local393 < local362; local393++) {
					local399 = Static139.aClass2_Sub3_Sub1_32.method209();
					local403 = Static139.aClass2_Sub3_Sub1_32.method218();
					if (local403 == 255) {
						local403 = Static139.aClass2_Sub3_Sub1_32.method212();
					}
					if (local352 != null && local393 < local352.anIntArray436.length) {
						local352.anIntArray436[local393] = local399;
						local352.anIntArray430[local393] = local403;
					}
					Static192.method3524(local393, local399 - 1, local140, local403);
				}
				if (local352 != null) {
					Static39.method900(local352);
				}
				Static117.method758();
				Static54.anIntArray168[Static167.anInt4110++ & 0x1F] = local140 & 0x7FFF;
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 114) {
				@Pc(484) boolean local484 = Static139.aClass2_Sub3_Sub1_32.method218() == 1;
				local140 = Static139.aClass2_Sub3_Sub1_32.method206();
				local352 = Static173.method3201(local140);
				if (local484 != local352.aBoolean148) {
					local352.aBoolean148 = local484;
					Static39.method900(local352);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(524) int local524;
			@Pc(608) Class2_Sub20 local608;
			@Pc(652) int local652;
			@Pc(654) int local654;
			@Pc(664) long local664;
			if (Static62.anInt1922 == 230) {
				local122 = Static168.anInt4121 + Static139.aClass2_Sub3_Sub1_32.anInt273;
				local140 = Static139.aClass2_Sub3_Sub1_32.method234();
				local524 = Static139.aClass2_Sub3_Sub1_32.method234();
				if (local140 != Static18.anInt4401) {
					Static18.anInt4401 = local140;
					Static146.method2942(Static18.anInt4401);
					Static101.method2309(Static18.anInt4401);
					for (local362 = 0; local362 < 100; local362++) {
						Static127.aBooleanArray14[local362] = true;
					}
				}
				while (local524-- > 0) {
					local362 = Static139.aClass2_Sub3_Sub1_32.method206();
					local393 = Static139.aClass2_Sub3_Sub1_32.method234();
					local399 = Static139.aClass2_Sub3_Sub1_32.method218();
					@Pc(570) Class2_Sub20 local570 = (Class2_Sub20) Static156.aClass51_11.method2458((long) local362);
					if (local570 != null && local570.anInt3986 != local393) {
						Static12.method312(local570, true);
						local570 = null;
					}
					if (local570 == null) {
						local570 = Static153.method2980(local399, local362, local393);
					}
					local570.aBoolean157 = true;
				}
				for (local608 = (Class2_Sub20) Static156.aClass51_11.method2465(); local608 != null; local608 = (Class2_Sub20) Static156.aClass51_11.method2462()) {
					if (local608.aBoolean157) {
						local608.aBoolean157 = false;
					} else {
						Static12.method312(local608, true);
					}
				}
				Static174.aClass51_13 = new Class51(512);
				while (Static139.aClass2_Sub3_Sub1_32.anInt273 < local122) {
					local393 = Static139.aClass2_Sub3_Sub1_32.method206();
					local399 = Static139.aClass2_Sub3_Sub1_32.method234();
					local403 = Static139.aClass2_Sub3_Sub1_32.method234();
					local652 = Static139.aClass2_Sub3_Sub1_32.method206();
					for (local654 = local399; local654 <= local403; local654++) {
						local664 = (long) local654 + ((long) local393 << 32);
						Static174.aClass51_13.method2463(new Class2_Sub12(local652), local664);
					}
				}
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(721) int local721;
			@Pc(709) long local709;
			@Pc(704) long local704;
			@Pc(697) long local697;
			@Pc(794) Class60 local794;
			if (Static62.anInt1922 == 9) {
				local697 = Static139.aClass2_Sub3_Sub1_32.method204();
				@Pc(699) boolean local699 = false;
				local704 = Static139.aClass2_Sub3_Sub1_32.method234();
				local709 = Static139.aClass2_Sub3_Sub1_32.method239();
				@Pc(715) long local715 = local709 + (local704 << 32);
				local403 = Static139.aClass2_Sub3_Sub1_32.method218();
				for (local721 = 0; local721 < 100; local721++) {
					if (Static54.aLongArray3[local721] == local715) {
						local699 = true;
						break;
					}
				}
				if (local403 <= 1) {
					for (@Pc(750) int local750 = 0; local750 < Static88.anInt2600; local750++) {
						if (local697 == Static138.aLongArray2[local750]) {
							local699 = true;
							break;
						}
					}
				}
				if (!local699 && Static19.anInt3087 == 0) {
					Static54.aLongArray3[Static198.anInt4666] = local715;
					Static198.anInt4666 = (Static198.anInt4666 + 1) % 100;
					local794 = Static124.method1777(Static162.method3069(Static139.aClass2_Sub3_Sub1_32).method2700());
					if (local403 == 2 || local403 == 3) {
						Static118.method2563(7, Static193.method3536(new Class60[] { Static75.aClass60_611, Static182.method3394(local697).method2663() }), local794);
					} else if (local403 == 1) {
						Static118.method2563(7, Static193.method3536(new Class60[] { Static183.aClass60_1250, Static182.method3394(local697).method2663() }), local794);
					} else {
						Static118.method2563(3, Static182.method3394(local697).method2663(), local794);
					}
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 169) {
				Static63.anInt1932 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static22.anInt705 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static123.anInt3380 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 204) {
				Static88.anInt2600 = Static168.anInt4121 / 8;
				for (local122 = 0; local122 < Static88.anInt2600; local122++) {
					Static138.aLongArray2[local122] = Static139.aClass2_Sub3_Sub1_32.method204();
					Static149.aClass60Array21[local122] = Static182.method3394(Static138.aLongArray2[local122]);
				}
				Static1.anInt4 = Static157.anInt3990;
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(1066) boolean local1066;
			@Pc(1061) int local1061;
			if (Static62.anInt1922 == 206) {
				Static96.anInt3104 = Static157.anInt3990;
				local697 = Static139.aClass2_Sub3_Sub1_32.method204();
				if (local697 == 0L) {
					Static4.aClass60_33 = null;
					Static62.anInt1922 = -1;
					Static89.aClass60_709 = null;
					Static163.aClass2_Sub23Array1 = null;
					Static128.anInt3496 = 0;
					return true;
				}
				local704 = Static139.aClass2_Sub3_Sub1_32.method204();
				Static89.aClass60_709 = Static182.method3394(local704);
				Static4.aClass60_33 = Static182.method3394(local697);
				Static112.aByte5 = Static139.aClass2_Sub3_Sub1_32.method227();
				local393 = Static139.aClass2_Sub3_Sub1_32.method218();
				if (local393 == 255) {
					Static62.anInt1922 = -1;
					return true;
				}
				Static128.anInt3496 = local393;
				@Pc(985) Class2_Sub23[] local985 = new Class2_Sub23[100];
				for (local403 = 0; local403 < Static128.anInt3496; local403++) {
					local985[local403] = new Class2_Sub23();
					local985[local403].aLong151 = Static139.aClass2_Sub3_Sub1_32.method204();
					local985[local403].aClass60_1284 = Static182.method3394(local985[local403].aLong151);
					local985[local403].anInt4504 = Static139.aClass2_Sub3_Sub1_32.method234();
					local985[local403].aByte9 = Static139.aClass2_Sub3_Sub1_32.method227();
					local985[local403].aClass60_1287 = Static139.aClass2_Sub3_Sub1_32.method240();
					if (Static152.aLong95 == local985[local403].aLong151) {
						Static106.aByte4 = local985[local403].aByte9;
					}
				}
				local1061 = Static128.anInt3496;
				while (local1061 > 0) {
					local1061--;
					local1066 = true;
					for (local721 = 0; local721 < local1061; local721++) {
						if (local985[local721].aClass60_1284.method2678(local985[local721 + 1].aClass60_1284) > 0) {
							@Pc(1087) Class2_Sub23 local1087 = local985[local721];
							local985[local721] = local985[local721 + 1];
							local1066 = false;
							local985[local721 + 1] = local1087;
						}
					}
					if (local1066) {
						break;
					}
				}
				Static163.aClass2_Sub23Array1 = local985;
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 8) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method209();
				Static18.anInt4401 = local122;
				Static146.method2942(local122);
				Static101.method2309(Static18.anInt4401);
				for (local140 = 0; local140 < 100; local140++) {
					Static127.aBooleanArray14[local140] = true;
				}
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(1169) Class60 local1169;
			if (Static62.anInt1922 == 196) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method201();
				local140 = Static139.aClass2_Sub3_Sub1_32.method194();
				local1169 = Static139.aClass2_Sub3_Sub1_32.method240();
				if (local140 >= 1 && local140 <= 8) {
					if (local1169.method2698(Static197.aClass60_1333)) {
						local1169 = null;
					}
					Static63.aClass60Array12[local140 - 1] = local1169;
					Static56.aBooleanArray6[local140 - 1] = local122 == 0;
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 151) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method209();
				@Pc(1218) byte local1218 = Static139.aClass2_Sub3_Sub1_32.method227();
				Static90.anIntArray284[local122] = local1218;
				if (local1218 != Static163.anIntArray447[local122]) {
					Static163.anIntArray447[local122] = local1218;
					Static65.method1489(local122);
				}
				Static155.anIntArray439[Static33.anInt1058++ & 0x1F] = local122;
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(1260) Class60 local1260;
			if (Static62.anInt1922 == 120) {
				local1260 = Static139.aClass2_Sub3_Sub1_32.method240();
				local140 = Static139.aClass2_Sub3_Sub1_32.method215();
				local352 = Static173.method3201(local140);
				if (!local1260.method2687(local352.aClass60_1057)) {
					local352.aClass60_1057 = local1260;
					Static39.method900(local352);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 81) {
				Static78.method1884(Static139.aClass2_Sub3_Sub1_32);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 184) {
				Static31.aBoolean40 = true;
				Static185.anInt4465 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static149.anInt3855 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static145.anInt3795 = Static139.aClass2_Sub3_Sub1_32.method234();
				Static112.anInt3133 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static57.anInt1786 = Static139.aClass2_Sub3_Sub1_32.method218();
				if (Static57.anInt1786 >= 100) {
					local122 = Static185.anInt4465 * 128 + 64;
					local140 = Static149.anInt3855 * 128 + 64;
					local524 = Static182.method3393(Static62.anInt1923, local122, local140) - Static145.anInt3795;
					local362 = local122 - Static161.anInt4013;
					local393 = local524 - Static172.anInt4190;
					local399 = local140 - Static166.anInt4103;
					local403 = (int) Math.sqrt((double) (local362 * local362 + local399 * local399));
					Static19.anInt3094 = (int) (Math.atan2((double) local393, (double) local403) * 325.949D) & 0x7FF;
					Static158.anInt4007 = (int) (-325.949D * Math.atan2((double) local362, (double) local399)) & 0x7FF;
					if (Static19.anInt3094 < 128) {
						Static19.anInt3094 = 128;
					}
					if (Static19.anInt3094 > 383) {
						Static19.anInt3094 = 383;
					}
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 231) {
				local697 = Static139.aClass2_Sub3_Sub1_32.method204();
				local1169 = Static124.method1777(Static162.method3069(Static139.aClass2_Sub3_Sub1_32).method2700());
				Static118.method2563(6, Static182.method3394(local697).method2663(), local1169);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 245) {
				Static31.aBoolean40 = false;
				for (local122 = 0; local122 < 5; local122++) {
					Static171.aBooleanArray15[local122] = false;
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 92) {
				Static62.anInt1922 = -1;
				Static197.anInt4656 = 0;
				return true;
			}
			if (Static62.anInt1922 == 125) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method206();
				@Pc(1484) Class2_Sub20 local1484 = (Class2_Sub20) Static156.aClass51_11.method2458((long) local122);
				if (local1484 != null) {
					Static12.method312(local1484, true);
				}
				if (Static164.aClass72_10 != null) {
					Static39.method900(Static164.aClass72_10);
					Static164.aClass72_10 = null;
				}
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(1520) Class72 local1520;
			if (Static62.anInt1922 == 216) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method192();
				local140 = Static139.aClass2_Sub3_Sub1_32.method233();
				local524 = Static139.aClass2_Sub3_Sub1_32.method242();
				local1520 = Static173.method3201(local140);
				local1520.anInt3906 = (local122 << 16) + local524;
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(1560) Class60 local1560;
			if (Static62.anInt1922 == 178) {
				local697 = Static139.aClass2_Sub3_Sub1_32.method204();
				local524 = Static139.aClass2_Sub3_Sub1_32.method234();
				local362 = Static139.aClass2_Sub3_Sub1_32.method218();
				@Pc(1548) Class60 local1548 = Static101.aClass60_807;
				if (local524 > 0) {
					local1548 = Static139.aClass2_Sub3_Sub1_32.method240();
				}
				local1560 = Static182.method3394(local697).method2663();
				for (local403 = 0; local403 < Static81.anInt2399; local403++) {
					if (Static118.aLongArray5[local403] == local697) {
						if (local524 != Static93.anIntArray313[local403]) {
							Static93.anIntArray313[local403] = local524;
							if (local524 > 0) {
								Static118.method2563(5, Static101.aClass60_807, Static193.method3536(new Class60[] { local1560, Static179.aClass60_1204 }));
							}
							if (local524 == 0) {
								Static118.method2563(5, Static101.aClass60_807, Static193.method3536(new Class60[] { local1560, Static143.aClass60_1017 }));
							}
						}
						Static25.aClass60Array6[local403] = local1548;
						Static180.anIntArray373[local403] = local362;
						local1560 = null;
						break;
					}
				}
				if (local1560 != null && Static81.anInt2399 < 200) {
					Static118.aLongArray5[Static81.anInt2399] = local697;
					Static169.aClass60Array25[Static81.anInt2399] = local1560;
					Static93.anIntArray313[Static81.anInt2399] = local524;
					Static25.aClass60Array6[Static81.anInt2399] = local1548;
					Static180.anIntArray373[Static81.anInt2399] = local362;
					Static81.anInt2399++;
				}
				local654 = Static81.anInt2399;
				Static1.anInt4 = Static157.anInt3990;
				while (local654 > 0) {
					local654--;
					local1066 = true;
					for (local1061 = 0; local1061 < local654; local1061++) {
						if (Static156.anInt3974 != Static93.anIntArray313[local1061] && Static93.anIntArray313[local1061 + 1] == Static156.anInt3974 || Static93.anIntArray313[local1061] == 0 && Static93.anIntArray313[local1061 + 1] != 0) {
							local1066 = false;
							local721 = Static93.anIntArray313[local1061];
							Static93.anIntArray313[local1061] = Static93.anIntArray313[local1061 + 1];
							Static93.anIntArray313[local1061 + 1] = local721;
							local794 = Static25.aClass60Array6[local1061];
							Static25.aClass60Array6[local1061] = Static25.aClass60Array6[local1061 + 1];
							Static25.aClass60Array6[local1061 + 1] = local794;
							@Pc(1752) Class60 local1752 = Static169.aClass60Array25[local1061];
							Static169.aClass60Array25[local1061] = Static169.aClass60Array25[local1061 + 1];
							Static169.aClass60Array25[local1061 + 1] = local1752;
							@Pc(1770) long local1770 = Static118.aLongArray5[local1061];
							Static118.aLongArray5[local1061] = Static118.aLongArray5[local1061 + 1];
							Static118.aLongArray5[local1061 + 1] = local1770;
							@Pc(1788) int local1788 = Static180.anIntArray373[local1061];
							Static180.anIntArray373[local1061] = Static180.anIntArray373[local1061 + 1];
							Static180.anIntArray373[local1061 + 1] = local1788;
						}
					}
					if (local1066) {
						break;
					}
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 121) {
				Static134.anInt3571 = Static139.aClass2_Sub3_Sub1_32.method201();
				Static103.anInt2977 = Static139.aClass2_Sub3_Sub1_32.method218();
				for (local122 = Static103.anInt2977; local122 < Static103.anInt2977 + 8; local122++) {
					for (local140 = Static134.anInt3571; local140 < Static134.anInt3571 + 8; local140++) {
						if (Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local122][local140] != null) {
							Static70.aClass67ArrayArrayArray1[Static62.anInt1923][local122][local140] = null;
							Static171.method3180(local140, local122);
						}
					}
				}
				for (@Pc(1878) Class2_Sub6 local1878 = (Class2_Sub6) Static190.aClass67_14.method2848(); local1878 != null; local1878 = (Class2_Sub6) Static190.aClass67_14.method2851()) {
					if (local1878.anInt1921 >= Static103.anInt2977 && local1878.anInt1921 < Static103.anInt2977 + 8 && Static134.anInt3571 <= local1878.anInt1926 && local1878.anInt1926 < Static134.anInt3571 + 8 && Static62.anInt1923 == local1878.anInt1915) {
						local1878.anInt1927 = 0;
					}
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 164) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method206();
				local140 = Static139.aClass2_Sub3_Sub1_32.method212();
				local524 = Static139.aClass2_Sub3_Sub1_32.method209();
				local362 = Static139.aClass2_Sub3_Sub1_32.method209();
				if (local524 == 65535) {
					local524 = -1;
				}
				if (local362 == 65535) {
					local362 = -1;
				}
				for (local393 = local524; local393 <= local362; local393++) {
					@Pc(1973) long local1973 = ((long) local140 << 32) + (long) local393;
					@Pc(1978) Class2 local1978 = Static174.aClass51_13.method2458(local1973);
					if (local1978 != null) {
						local1978.method3556();
					}
					Static174.aClass51_13.method2463(new Class2_Sub12(local122), local1973);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 74) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method230();
				local140 = Static139.aClass2_Sub3_Sub1_32.method215();
				local524 = Static139.aClass2_Sub3_Sub1_32.method219();
				local1520 = Static173.method3201(local140);
				local399 = local1520.anInt3938 + local524;
				local393 = local1520.anInt3917 + local122;
				if (local1520.anInt3907 != local393 || local399 != local1520.anInt3919) {
					local1520.anInt3907 = local393;
					local1520.anInt3919 = local399;
					Static39.method900(local1520);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 225) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method201();
				local140 = Static139.aClass2_Sub3_Sub1_32.method229();
				local524 = Static139.aClass2_Sub3_Sub1_32.method229();
				Static62.anInt1923 = local140 >> 1;
				Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.method2555(local524, local122, (local140 & 0x1) == 1);
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(2109) boolean local2109;
			if (Static62.anInt1922 == 134) {
				local1260 = Static139.aClass2_Sub3_Sub1_32.method240();
				@Pc(2118) Class60 local2118;
				if (local1260.method2664(Static122.aClass60_936)) {
					local2109 = false;
					local2118 = local1260.method2667(local1260.method2675(Static32.aClass60_236), 0);
					local704 = local2118.method2691();
					for (local399 = 0; local399 < Static88.anInt2600; local399++) {
						if (Static138.aLongArray2[local399] == local704) {
							local2109 = true;
							break;
						}
					}
					if (!local2109 && Static19.anInt3087 == 0) {
						Static118.method2563(4, local2118, Static196.aClass60_1320);
					}
				} else if (local1260.method2664(Static125.aClass60_954)) {
					local2118 = local1260.method2667(local1260.method2675(Static32.aClass60_236), 0);
					local2109 = false;
					local704 = local2118.method2691();
					for (local399 = 0; local399 < Static88.anInt2600; local399++) {
						if (local704 == Static138.aLongArray2[local399]) {
							local2109 = true;
							break;
						}
					}
					if (!local2109 && Static19.anInt3087 == 0) {
						@Pc(2508) Class60 local2508 = local1260.method2667(local1260.method2673() - 9, local1260.method2675(Static32.aClass60_236) + 1);
						Static118.method2563(8, local2118, local2508);
					}
				} else if (local1260.method2664(Static67.aClass60_508)) {
					local2118 = local1260.method2667(local1260.method2675(Static32.aClass60_236), 0);
					local704 = local2118.method2691();
					local2109 = false;
					for (local399 = 0; local399 < Static88.anInt2600; local399++) {
						if (local704 == Static138.aLongArray2[local399]) {
							local2109 = true;
							break;
						}
					}
					if (!local2109 && Static19.anInt3087 == 0) {
						Static118.method2563(10, local2118, Static101.aClass60_807);
					}
				} else if (local1260.method2664(Static89.aClass60_707)) {
					local2118 = local1260.method2667(local1260.method2675(Static89.aClass60_707), 0);
					Static118.method2563(11, Static101.aClass60_807, local2118);
				} else if (local1260.method2664(Static37.aClass60_261)) {
					local2118 = local1260.method2667(local1260.method2675(Static37.aClass60_261), 0);
					if (Static19.anInt3087 == 0) {
						Static118.method2563(12, Static101.aClass60_807, local2118);
					}
				} else if (local1260.method2664(Static37.aClass60_257)) {
					local2118 = local1260.method2667(local1260.method2675(Static37.aClass60_257), 0);
					if (Static19.anInt3087 == 0) {
						Static118.method2563(13, Static101.aClass60_807, local2118);
					}
				} else if (local1260.method2664(Static42.aClass60_298)) {
					local2118 = local1260.method2667(local1260.method2675(Static32.aClass60_236), 0);
					local704 = local2118.method2691();
					local2109 = false;
					for (local399 = 0; local399 < Static88.anInt2600; local399++) {
						if (local704 == Static138.aLongArray2[local399]) {
							local2109 = true;
							break;
						}
					}
					if (!local2109 && Static19.anInt3087 == 0) {
						Static118.method2563(14, local2118, Static101.aClass60_807);
					}
				} else if (local1260.method2664(Static37.aClass60_255)) {
					local2109 = false;
					local2118 = local1260.method2667(local1260.method2675(Static32.aClass60_236), 0);
					local704 = local2118.method2691();
					for (local399 = 0; local399 < Static88.anInt2600; local399++) {
						if (local704 == Static138.aLongArray2[local399]) {
							local2109 = true;
							break;
						}
					}
					if (!local2109 && Static19.anInt3087 == 0) {
						Static118.method2563(15, local2118, Static101.aClass60_807);
					}
				} else if (local1260.method2664(Static108.aClass60_860)) {
					local2118 = local1260.method2667(local1260.method2675(Static32.aClass60_236), 0);
					local2109 = false;
					local704 = local2118.method2691();
					for (local399 = 0; local399 < Static88.anInt2600; local399++) {
						if (Static138.aLongArray2[local399] == local704) {
							local2109 = true;
							break;
						}
					}
					if (!local2109 && Static19.anInt3087 == 0) {
						Static118.method2563(16, local2118, Static101.aClass60_807);
					}
				} else {
					Static118.method2563(0, Static101.aClass60_807, local1260);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 42) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method190();
				local140 = Static139.aClass2_Sub3_Sub1_32.method233();
				local352 = Static173.method3201(local140);
				if (local352.anInt3923 != local122 || local122 == -1) {
					local352.anInt3941 = 0;
					local352.anInt3923 = local122;
					local352.anInt3902 = 0;
					Static39.method900(local352);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 146) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method234();
				local140 = Static139.aClass2_Sub3_Sub1_32.method233();
				local524 = local122 >> 10 & 0x1F;
				local362 = local122 >> 5 & 0x1F;
				@Pc(2586) Class72 local2586 = Static173.method3201(local140);
				local393 = local122 & 0x1F;
				local399 = (local393 << 3) + (local362 << 11) + (local524 << 19);
				if (local2586.anInt3879 != local399) {
					local2586.anInt3879 = local399;
					Static39.method900(local2586);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 34) {
				Static117.method758();
				Static99.anInt2866 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static62.anInt1922 = -1;
				Static82.anInt2436 = Static157.anInt3990;
				return true;
			}
			if (Static62.anInt1922 == 109) {
				for (local122 = 0; local122 < Static163.anIntArray447.length; local122++) {
					if (Static90.anIntArray284[local122] != Static163.anIntArray447[local122]) {
						Static163.anIntArray447[local122] = Static90.anIntArray284[local122];
						Static65.method1489(local122);
						Static155.anIntArray439[Static33.anInt1058++ & 0x1F] = local122;
					}
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 162) {
				Static31.aBoolean40 = true;
				Static22.anInt700 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static70.anInt2137 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static164.anInt4089 = Static139.aClass2_Sub3_Sub1_32.method234();
				Static94.anInt2816 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static82.anInt2430 = Static139.aClass2_Sub3_Sub1_32.method218();
				if (Static82.anInt2430 >= 100) {
					Static166.anInt4103 = Static70.anInt2137 * 128 + 64;
					Static161.anInt4013 = Static22.anInt700 * 128 + 64;
					Static172.anInt4190 = Static182.method3393(Static62.anInt1923, Static161.anInt4013, Static166.anInt4103) - Static164.anInt4089;
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 72) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method234();
				Static20.method448(local122);
				Static54.anIntArray168[Static167.anInt4110++ & 0x1F] = local122 & 0x7FFF;
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 78) {
				if (Static18.anInt4401 != -1) {
					Static190.method3488(0, Static18.anInt4401);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 236) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method234();
				if (local122 == 65535) {
					local122 = -1;
				}
				local140 = Static139.aClass2_Sub3_Sub1_32.method233();
				local352 = Static173.method3201(local140);
				if (local352.anInt3885 != 2 || local122 != local352.anInt3891) {
					local352.anInt3885 = 2;
					local352.anInt3891 = local122;
					Static39.method900(local352);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 38) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method209();
				local140 = Static139.aClass2_Sub3_Sub1_32.method215();
				local524 = Static139.aClass2_Sub3_Sub1_32.method209();
				local362 = Static139.aClass2_Sub3_Sub1_32.method209();
				@Pc(2849) Class72 local2849 = Static173.method3201(local140);
				if (local2849.anInt3865 != local362 || local2849.anInt3881 != local122 || local2849.anInt3874 != local524) {
					local2849.anInt3881 = local122;
					local2849.anInt3874 = local524;
					local2849.anInt3865 = local362;
					Static39.method900(local2849);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 39) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method209();
				if (local122 == 65535) {
					local122 = -1;
				}
				Static173.method3200(local122);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 219) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method209();
				if (local122 == 65535) {
					local122 = -1;
				}
				local140 = Static139.aClass2_Sub3_Sub1_32.method239();
				Static122.method2602(local140, local122);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 199) {
				Static166.anInt4104 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 51) {
				Static79.aClass60_642 = Static139.aClass2_Sub3_Sub1_32.method240();
				Static35.method2412(Static79.aClass60_642);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 148) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method218();
				local140 = Static139.aClass2_Sub3_Sub1_32.method218();
				local524 = Static139.aClass2_Sub3_Sub1_32.method218();
				local362 = Static139.aClass2_Sub3_Sub1_32.method218();
				local393 = Static139.aClass2_Sub3_Sub1_32.method234();
				Static171.aBooleanArray15[local122] = true;
				Static162.anIntArray446[local122] = local140;
				Static126.anIntArray396[local122] = local524;
				Static30.anIntArray97[local122] = local362;
				Static151.anIntArray292[local122] = local393;
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 108) {
				Static29.anInt888 = Static139.aClass2_Sub3_Sub1_32.method218();
				Static1.anInt4 = Static157.anInt3990;
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 127) {
				Static117.method758();
				Static153.anInt3875 = Static139.aClass2_Sub3_Sub1_32.method219();
				Static62.anInt1922 = -1;
				Static82.anInt2436 = Static157.anInt3990;
				return true;
			}
			if (Static62.anInt1922 == 135) {
				Static77.method1866(Static139.aClass2_Sub3_Sub1_32, Static168.anInt4121, Static65.aClass81_1);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 234) {
				Static96.anInt3098 = Static139.aClass2_Sub3_Sub1_32.method234() * 30;
				Static62.anInt1922 = -1;
				Static82.anInt2436 = Static157.anInt3990;
				return true;
			}
			if (Static62.anInt1922 == 14) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method206();
				local140 = Static139.aClass2_Sub3_Sub1_32.method234();
				if (local122 < -70000) {
					local140 += 32768;
				}
				if (local122 < 0) {
					local352 = null;
				} else {
					local352 = Static173.method3201(local122);
				}
				while (Static139.aClass2_Sub3_Sub1_32.anInt273 < Static168.anInt4121) {
					local362 = Static139.aClass2_Sub3_Sub1_32.method237();
					local393 = Static139.aClass2_Sub3_Sub1_32.method234();
					local399 = 0;
					if (local393 != 0) {
						local399 = Static139.aClass2_Sub3_Sub1_32.method218();
						if (local399 == 255) {
							local399 = Static139.aClass2_Sub3_Sub1_32.method206();
						}
					}
					if (local352 != null && local362 >= 0 && local352.anIntArray436.length > local362) {
						local352.anIntArray436[local362] = local393;
						local352.anIntArray430[local362] = local399;
					}
					Static192.method3524(local362, local393 - 1, local140, local399);
				}
				if (local352 != null) {
					Static39.method900(local352);
				}
				Static117.method758();
				Static54.anIntArray168[Static167.anInt4110++ & 0x1F] = local140 & 0x7FFF;
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 46) {
				local697 = Static139.aClass2_Sub3_Sub1_32.method204();
				local524 = Static139.aClass2_Sub3_Sub1_32.method234();
				@Pc(3200) byte local3200 = Static139.aClass2_Sub3_Sub1_32.method227();
				local2109 = false;
				if ((local697 & Long.MIN_VALUE) != 0L) {
					local2109 = true;
				}
				if (local2109) {
					if (Static128.anInt3496 == 0) {
						Static62.anInt1922 = -1;
						return true;
					}
					local697 &= Long.MAX_VALUE;
					for (local399 = 0; local399 < Static128.anInt3496 && (Static163.aClass2_Sub23Array1[local399].aLong151 != local697 || local524 != Static163.aClass2_Sub23Array1[local399].anInt4504); local399++) {
					}
					if (Static128.anInt3496 > local399) {
						while (Static128.anInt3496 - 1 > local399) {
							Static163.aClass2_Sub23Array1[local399] = Static163.aClass2_Sub23Array1[local399 + 1];
							local399++;
						}
						Static128.anInt3496--;
						Static163.aClass2_Sub23Array1[Static128.anInt3496] = null;
					}
				} else {
					local1560 = Static139.aClass2_Sub3_Sub1_32.method240();
					@Pc(3222) Class2_Sub23 local3222 = new Class2_Sub23();
					local3222.aLong151 = local697;
					local3222.aClass60_1284 = Static182.method3394(local3222.aLong151);
					local3222.aByte9 = local3200;
					local3222.anInt4504 = local524;
					local3222.aClass60_1287 = local1560;
					for (local652 = Static128.anInt3496 - 1; local652 >= 0; local652--) {
						local654 = Static163.aClass2_Sub23Array1[local652].aClass60_1284.method2678(local3222.aClass60_1284);
						if (local654 == 0) {
							Static163.aClass2_Sub23Array1[local652].anInt4504 = local524;
							Static163.aClass2_Sub23Array1[local652].aByte9 = local3200;
							Static163.aClass2_Sub23Array1[local652].aClass60_1287 = local1560;
							if (local697 == Static152.aLong95) {
								Static106.aByte4 = local3200;
							}
							Static96.anInt3104 = Static157.anInt3990;
							Static62.anInt1922 = -1;
							return true;
						}
						if (local654 < 0) {
							break;
						}
					}
					if (Static128.anInt3496 >= Static163.aClass2_Sub23Array1.length) {
						Static62.anInt1922 = -1;
						return true;
					}
					for (local654 = Static128.anInt3496 - 1; local654 > local652; local654--) {
						Static163.aClass2_Sub23Array1[local654 + 1] = Static163.aClass2_Sub23Array1[local654];
					}
					if (Static128.anInt3496 == 0) {
						Static163.aClass2_Sub23Array1 = new Class2_Sub23[100];
					}
					Static163.aClass2_Sub23Array1[local652 + 1] = local3222;
					Static128.anInt3496++;
					if (Static152.aLong95 == local697) {
						Static106.aByte4 = local3200;
					}
				}
				Static62.anInt1922 = -1;
				Static96.anInt3104 = Static157.anInt3990;
				return true;
			}
			if (Static62.anInt1922 == 18) {
				Static57.method1339(true);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 153) {
				local697 = Static139.aClass2_Sub3_Sub1_32.method204();
				Static139.aClass2_Sub3_Sub1_32.method227();
				local704 = Static139.aClass2_Sub3_Sub1_32.method204();
				local709 = Static139.aClass2_Sub3_Sub1_32.method234();
				@Pc(3465) long local3465 = (long) Static139.aClass2_Sub3_Sub1_32.method239();
				local654 = Static139.aClass2_Sub3_Sub1_32.method218();
				local664 = local3465 + (local709 << 32);
				@Pc(3477) boolean local3477 = false;
				for (@Pc(3479) int local3479 = 0; local3479 < 100; local3479++) {
					if (Static54.aLongArray3[local3479] == local664) {
						local3477 = true;
						break;
					}
				}
				if (local654 <= 1) {
					for (@Pc(3506) int local3506 = 0; local3506 < Static88.anInt2600; local3506++) {
						if (local697 == Static138.aLongArray2[local3506]) {
							local3477 = true;
							break;
						}
					}
				}
				if (!local3477 && Static19.anInt3087 == 0) {
					Static54.aLongArray3[Static198.anInt4666] = local664;
					Static198.anInt4666 = (Static198.anInt4666 + 1) % 100;
					@Pc(3558) Class60 local3558 = Static124.method1777(Static162.method3069(Static139.aClass2_Sub3_Sub1_32).method2700());
					if (local654 == 2 || local654 == 3) {
						Static113.method2494(Static193.method3536(new Class60[] { Static75.aClass60_611, Static182.method3394(local697).method2663() }), Static182.method3394(local704).method2663(), local3558, 9);
					} else if (local654 == 1) {
						Static113.method2494(Static193.method3536(new Class60[] { Static183.aClass60_1250, Static182.method3394(local697).method2663() }), Static182.method3394(local704).method2663(), local3558, 9);
					} else {
						Static113.method2494(Static182.method3394(local697).method2663(), Static182.method3394(local704).method2663(), local3558, 9);
					}
				}
				Static62.anInt1922 = -1;
				return true;
			}
			@Pc(3652) Class72 local3652;
			if (Static62.anInt1922 == 90) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method215();
				local3652 = Static173.method3201(local122);
				local3652.anInt3885 = 3;
				local3652.anInt3891 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.aClass32_1.method1578();
				Static39.method900(local3652);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 91) {
				local1260 = Static139.aClass2_Sub3_Sub1_32.method240();
				@Pc(3684) Object[] local3684 = new Object[local1260.method2673() + 1];
				for (local524 = local1260.method2673() - 1; local524 >= 0; local524--) {
					if (local1260.method2665(local524) == 115) {
						local3684[local524 + 1] = Static139.aClass2_Sub3_Sub1_32.method240();
					} else {
						local3684[local524 + 1] = Integer.valueOf(Static139.aClass2_Sub3_Sub1_32.method206());
					}
				}
				local3684[0] = Integer.valueOf(Static139.aClass2_Sub3_Sub1_32.method206());
				@Pc(3738) Class2_Sub25 local3738 = new Class2_Sub25();
				local3738.anObjectArray29 = local3684;
				Static197.method3578(local3738);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 4) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method234();
				local140 = Static139.aClass2_Sub3_Sub1_32.method206();
				if (local122 == 65535) {
					local122 = -1;
				}
				local524 = Static139.aClass2_Sub3_Sub1_32.method212();
				local1520 = Static173.method3201(local524);
				@Pc(3792) Class2_Sub1_Sub8 local3792;
				if (local1520.aBoolean151) {
					local1520.anInt3939 = local140;
					local1520.anInt3913 = local122;
					local3792 = Static88.method2046(local122);
					local1520.anInt3881 = local3792.anInt1547;
					local1520.anInt3940 = local3792.anInt1529;
					local1520.anInt3925 = local3792.anInt1557;
					local1520.anInt3889 = local3792.anInt1553;
					local1520.anInt3874 = local3792.anInt1527;
					if (local1520.anInt3878 > 0) {
						local1520.anInt3874 = local1520.anInt3874 * 32 / local1520.anInt3878;
					}
					local1520.anInt3865 = local3792.anInt1556;
					Static39.method900(local1520);
				} else if (local122 == -1) {
					local1520.anInt3885 = 0;
					Static62.anInt1922 = -1;
					return true;
				} else {
					local3792 = Static88.method2046(local122);
					local1520.anInt3885 = 4;
					local1520.anInt3874 = local3792.anInt1527 * 100 / local140;
					local1520.anInt3865 = local3792.anInt1556;
					local1520.anInt3881 = local3792.anInt1547;
					local1520.anInt3891 = local122;
					Static39.method900(local1520);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 221 || Static62.anInt1922 == 240 || Static62.anInt1922 == 142 || Static62.anInt1922 == 85 || Static62.anInt1922 == 183 || Static62.anInt1922 == 149 || Static62.anInt1922 == 172 || Static62.anInt1922 == 52 || Static62.anInt1922 == 48 || Static62.anInt1922 == 232 || Static62.anInt1922 == 247) {
				Static40.method903();
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 66) {
				Static33.method826();
				Static62.anInt1922 = -1;
				return false;
			}
			if (Static62.anInt1922 == 99) {
				Static18.method3390();
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 100) {
				for (local122 = 0; local122 < Static194.anInt4617; local122++) {
					@Pc(3959) Class2_Sub1_Sub18 local3959 = Static146.method2943(local122);
					if (local3959 != null && local3959.anInt3971 == 0) {
						Static90.anIntArray284[local122] = 0;
						Static163.anIntArray447[local122] = 0;
					}
				}
				Static117.method758();
				Static62.anInt1922 = -1;
				Static33.anInt1058 += 32;
				return true;
			}
			if (Static62.anInt1922 == 128) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method206();
				Static32.aClass25_9 = Static65.aClass81_1.method3152(local122);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 122) {
				Static134.anInt3571 = Static139.aClass2_Sub3_Sub1_32.method194();
				Static103.anInt2977 = Static139.aClass2_Sub3_Sub1_32.method229();
				while (Static139.aClass2_Sub3_Sub1_32.anInt273 < Static168.anInt4121) {
					Static62.anInt1922 = Static139.aClass2_Sub3_Sub1_32.method218();
					Static40.method903();
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 233) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method192();
				local140 = Static139.aClass2_Sub3_Sub1_32.method212();
				local352 = Static173.method3201(local140);
				if (local352 != null && local352.anInt3932 == 0) {
					if (local122 > local352.anInt3886 - local352.anInt3871) {
						local122 = local352.anInt3886 - local352.anInt3871;
					}
					if (local122 < 0) {
						local122 = 0;
					}
					if (local122 != local352.anInt3926) {
						local352.anInt3926 = local122;
						Static39.method900(local352);
					}
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 176) {
				Static117.method758();
				local122 = Static139.aClass2_Sub3_Sub1_32.method194();
				local140 = Static139.aClass2_Sub3_Sub1_32.method215();
				local524 = Static139.aClass2_Sub3_Sub1_32.method194();
				Static39.anIntArray118[local524] = local140;
				Static37.anIntArray100[local524] = local122;
				Static64.anIntArray183[local524] = 1;
				for (local362 = 0; local362 < 98; local362++) {
					if (local140 >= Class21.anIntArray135[local362]) {
						Static64.anIntArray183[local524] = local362 + 2;
					}
				}
				Static100.anIntArray332[Static56.anInt1776++ & 0x1F] = local524;
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 166) {
				Static57.method1339(false);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 101) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method234();
				if (local122 == 65535) {
					local122 = -1;
				}
				local140 = Static139.aClass2_Sub3_Sub1_32.method218();
				local524 = Static139.aClass2_Sub3_Sub1_32.method234();
				Static80.method1894(local140, local122, local524);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 159) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method218();
				if (Static139.aClass2_Sub3_Sub1_32.method218() == 0) {
					Static96.aClass42Array3[local122] = new Class42();
				} else {
					Static139.aClass2_Sub3_Sub1_32.anInt273--;
					Static96.aClass42Array3[local122] = new Class42(Static139.aClass2_Sub3_Sub1_32);
				}
				Static66.anInt2049 = Static157.anInt3990;
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 44) {
				Static7.method3572();
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 175) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method201();
				local140 = Static139.aClass2_Sub3_Sub1_32.method212();
				local524 = Static139.aClass2_Sub3_Sub1_32.method242();
				local608 = (Class2_Sub20) Static156.aClass51_11.method2458((long) local140);
				if (local608 != null) {
					Static12.method312(local608, local524 != local608.anInt3986);
				}
				Static153.method2980(local122, local140, local524);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 220) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method234();
				if (local122 == 65535) {
					local122 = -1;
				}
				local140 = Static139.aClass2_Sub3_Sub1_32.method215();
				local352 = Static173.method3201(local140);
				if (local352.anInt3885 != 1 || local122 != local352.anInt3891) {
					local352.anInt3891 = local122;
					local352.anInt3885 = 1;
					Static39.method900(local352);
				}
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 118) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method212();
				local140 = Static139.aClass2_Sub3_Sub1_32.method209();
				Static90.anIntArray284[local140] = local122;
				if (Static163.anIntArray447[local140] != local122) {
					Static163.anIntArray447[local140] = local122;
					Static65.method1489(local140);
				}
				Static155.anIntArray439[Static33.anInt1058++ & 0x1F] = local140;
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 186) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method233();
				local3652 = Static173.method3201(local122);
				for (local524 = 0; local524 < local3652.anIntArray436.length; local524++) {
					local3652.anIntArray436[local524] = -1;
					local3652.anIntArray436[local524] = 0;
				}
				Static39.method900(local3652);
				Static62.anInt1922 = -1;
				return true;
			}
			if (Static62.anInt1922 == 124) {
				local122 = Static139.aClass2_Sub3_Sub1_32.method209();
				local140 = Static139.aClass2_Sub3_Sub1_32.method209();
				Static158.anInt4007 = local122;
				Static62.anInt1922 = -1;
				Static19.anInt3094 = local140;
				return true;
			}
			Static153.method2973("T1 - " + Static62.anInt1922 + "," + Static54.anInt1755 + "," + Static175.anInt4268 + " - " + Static168.anInt4121, null);
			Static33.method826();
		} catch (@Pc(4487) IOException local4487) {
			Static4.method69();
		} catch (@Pc(4491) Exception local4491) {
			@Pc(4531) String local4531 = "T2 - " + Static62.anInt1922 + "," + Static54.anInt1755 + "," + Static175.anInt4268 + " - " + Static168.anInt4121 + "," + (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0] + anInt2319) + "," + (Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0] + anInt2317) + " - ";
			for (local140 = 0; Static168.anInt4121 > local140 && local140 < 50; local140++) {
				local4531 = local4531 + Static139.aClass2_Sub3_Sub1_32.aByteArray4[local140] + ",";
			}
			Static153.method2973(local4531, local4491);
			Static33.method826();
		}
		return true;
	}
}
