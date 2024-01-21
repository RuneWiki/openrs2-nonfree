import java.awt.Component;
import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2 aClass10_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!va;")
	private static Class61 aClass61_9 = Static88.method1421("shake:");

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!va;")
	public static Class61 aClass61_3 = aClass61_9;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public static int anInt18 = -1;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!va;")
	public static Class61 aClass61_4 = Static88.method1421("backvmid3");

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!va;")
	private static Class61 aClass61_5 = Static88.method1421(" is already on your friend list");

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	public static int anInt25 = 0;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!va;")
	private static Class61 aClass61_6 = Static88.method1421("flash2:");

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Lclient!va;")
	public static Class61 aClass61_7 = aClass61_6;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_8 = aClass61_5;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
	public static int anInt27 = 0;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method27() {
		if (Static57.aClass51_1 != null) {
			@Pc(3) Class51 local3 = Static57.aClass51_1;
			synchronized (Static57.aClass51_1) {
				Static57.aClass51_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z")
	public static boolean method28() {
		if (Static99.aClass27_4 == null) {
			return false;
		}
		@Pc(233) int local233;
		try {
			@Pc(13) int local13 = Static99.aClass27_4.method608();
			if (local13 == 0) {
				return false;
			}
			if (Static96.anInt2447 == -1) {
				local13--;
				Static99.aClass27_4.method609(1, Static55.aClass10_Sub10_Sub1_4.aByteArray9, 0);
				Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
				Static96.anInt2447 = Static55.aClass10_Sub10_Sub1_4.method1166();
				Static5.anInt34 = Static33.anIntArray110[Static96.anInt2447];
			}
			if (Static5.anInt34 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static99.aClass27_4.method609(1, Static55.aClass10_Sub10_Sub1_4.aByteArray9, 0);
				Static5.anInt34 = Static55.aClass10_Sub10_Sub1_4.aByteArray9[0] & 0xFF;
				local13--;
			}
			if (Static5.anInt34 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static99.aClass27_4.method609(2, Static55.aClass10_Sub10_Sub1_4.aByteArray9, 0);
				local13 -= 2;
				Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
				Static5.anInt34 = Static55.aClass10_Sub10_Sub1_4.method1160();
			}
			if (local13 < Static5.anInt34) {
				return false;
			}
			Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
			Static99.aClass27_4.method609(Static5.anInt34, Static55.aClass10_Sub10_Sub1_4.aByteArray9, 0);
			Static33.anInt988 = 0;
			Static76.anInt2037 = Static50.anInt1405;
			Static50.anInt1405 = Static47.anInt1308;
			Static47.anInt1308 = Static96.anInt2447;
			if (Static96.anInt2447 == 41) {
				Static48.method752();
				Static96.anInt2447 = -1;
				return false;
			}
			if (Static96.anInt2447 == 17) {
				Static24.method1431(true);
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 125) {
				Static25.anInt782 = Static55.aClass10_Sub10_Sub1_4.method1109();
				Static80.aBoolean94 = true;
				Static96.anInt2447 = -1;
				Static22.aBoolean35 = true;
				return true;
			}
			@Pc(160) int local160;
			if (Static96.anInt2447 == 232) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1124();
				if (local160 >= 0) {
					Static51.method786(local160);
				}
				if (local160 != Static75.anInt2018) {
					Static103.method595(Static75.anInt2018);
					Static75.anInt2018 = local160;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 89) {
				Static1.anInt6 = 1;
				Static15.aClass61_132 = Static15.aClass61_166;
				Static7.aBoolean1 = true;
				Static32.aBoolean44 = false;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 46) {
				Static98.anInt2480 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static96.anInt2447 = -1;
				if (Static25.anInt782 == Static98.anInt2480) {
					Static80.aBoolean94 = true;
					if (Static98.anInt2480 == 3) {
						Static25.anInt782 = 1;
					} else {
						Static25.anInt782 = 3;
					}
				}
				return true;
			}
			@Pc(237) int local237;
			@Pc(241) int local241;
			if (Static96.anInt2447 == 40) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local237 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local241 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static75.aBooleanArray9[local160] = true;
				Static57.anIntArray161[local160] = local233;
				Static1.anIntArray2[local160] = local237;
				Static48.anIntArray143[local160] = local241;
				Static67.anIntArray195[local160] = 0;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 135) {
				Static32.aBoolean44 = false;
				Static15.aClass61_132 = Static15.aClass61_166;
				Static96.anInt2447 = -1;
				Static1.anInt6 = 2;
				Static7.aBoolean1 = true;
				return true;
			}
			if (Static96.anInt2447 == 211) {
				Static29.anInt897 = Static55.aClass10_Sub10_Sub1_4.method1109();
				Static65.anInt1747 = Static55.aClass10_Sub10_Sub1_4.method1111();
				for (local160 = Static29.anInt897; local160 < Static29.anInt897 + 8; local160++) {
					for (local233 = Static65.anInt1747; local233 < Static65.anInt1747 + 8; local233++) {
						if (Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local160][local233] != null) {
							Static11.aClass9ArrayArrayArray1[Static101.anInt2582][local160][local233] = null;
							Static78.method1241(local160, local233);
						}
					}
				}
				for (@Pc(342) Class10_Sub3 local342 = (Class10_Sub3) Static56.aClass9_6.method72(); local342 != null; local342 = (Class10_Sub3) Static56.aClass9_6.method81()) {
					if (Static29.anInt897 <= local342.anInt728 && local342.anInt728 < Static29.anInt897 + 8 && Static65.anInt1747 <= local342.anInt731 && Static65.anInt1747 + 8 > local342.anInt731 && Static101.anInt2582 == local342.anInt723) {
						local342.anInt725 = 0;
					}
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 154) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1160();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local237 = Static55.aClass10_Sub10_Sub1_4.method1160();
				if (Static88.anInt2323 != 0 && local233 != 0 && Static41.anInt1196 < 50) {
					Static63.anIntArray56[Static41.anInt1196] = local160;
					Static94.anIntArray318[Static41.anInt1196] = local233;
					Static98.anIntArray327[Static41.anInt1196] = local237;
					Static74.aClass36Array1[Static41.anInt1196] = null;
					Static41.anInt1196++;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 25) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1119();
				Static51.method786(local160);
				if (Static57.anInt1518 != -1) {
					Static103.method595(Static57.anInt1518);
					Static22.aBoolean35 = true;
					Static80.aBoolean94 = true;
					Static57.anInt1518 = -1;
				}
				if (Static53.anInt1448 != -1) {
					Static103.method595(Static53.anInt1448);
					Static53.anInt1448 = -1;
					Static50.method780(30);
				}
				if (anInt18 != -1) {
					Static103.method595(anInt18);
					anInt18 = -1;
				}
				if (Static23.anInt752 != -1) {
					Static103.method595(Static23.anInt752);
					Static23.anInt752 = -1;
				}
				if (local160 != Static74.anInt1871) {
					Static103.method595(Static74.anInt1871);
					Static74.anInt1871 = local160;
				}
				Static104.aBoolean120 = false;
				Static7.aBoolean1 = true;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 196) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1119();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1132();
				Static51.method786(local160);
				if (local233 != -1) {
					Static51.method786(local233);
				}
				if (Static23.anInt752 != -1) {
					Static103.method595(Static23.anInt752);
					Static23.anInt752 = -1;
				}
				if (Static57.anInt1518 != -1) {
					Static103.method595(Static57.anInt1518);
					Static57.anInt1518 = -1;
				}
				if (Static74.anInt1871 != -1) {
					Static103.method595(Static74.anInt1871);
					Static74.anInt1871 = -1;
				}
				if (Static53.anInt1448 != local160) {
					Static103.method595(Static53.anInt1448);
					Static53.anInt1448 = local160;
					Static50.method780(35);
				}
				if (anInt18 != local160) {
					Static103.method595(anInt18);
					anInt18 = local233;
				}
				Static1.anInt6 = 0;
				Static104.aBoolean120 = false;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 23) {
				for (local160 = 0; local160 < Static66.anInt1760; local160++) {
					@Pc(616) Class10_Sub1_Sub16 local616 = Static61.method903(local160);
					if (local616 != null && local616.anInt2623 == 0) {
						Static23.anIntArray79[local160] = 0;
						Static74.anIntArray228[local160] = 0;
					}
				}
				if (Static98.anInt2479 != -1) {
					Static7.aBoolean1 = true;
				}
				Static96.anInt2447 = -1;
				Static80.aBoolean94 = true;
				return true;
			}
			if (Static96.anInt2447 == 225) {
				Static34.method602();
				Static96.anInt2447 = -1;
				return true;
			}
			@Pc(678) int local678;
			@Pc(784) int local784;
			@Pc(664) long local664;
			if (Static96.anInt2447 == 129) {
				local664 = Static55.aClass10_Sub10_Sub1_4.method1144();
				local237 = Static55.aClass10_Sub10_Sub1_4.method1160();
				@Pc(676) Class61 local676 = Static78.method1234(local664).method1617();
				for (local678 = 0; local678 < Static6.anInt70; local678++) {
					if (local664 == Static76.aLongArray6[local678]) {
						if (Static33.anIntArray112[local678] != local237) {
							Static33.anIntArray112[local678] = local237;
							Static80.aBoolean94 = true;
							if (local237 > 0) {
								Static52.method794(Static15.aClass61_166, Static93.method1156(new Class61[] { local676, Static98.aClass61_1012 }), 5);
							}
							if (local237 == 0) {
								Static52.method794(Static15.aClass61_166, Static93.method1156(new Class61[] { local676, Static80.aClass61_867 }), 5);
							}
						}
						local676 = null;
						break;
					}
				}
				if (local676 != null && Static6.anInt70 < 200) {
					Static76.aLongArray6[Static6.anInt70] = local664;
					Static106.aClass61Array15[Static6.anInt70] = local676;
					Static33.anIntArray112[Static6.anInt70] = local237;
					Static80.aBoolean94 = true;
					Static6.anInt70++;
				}
				@Pc(778) boolean local778 = false;
				while (!local778) {
					local778 = true;
					for (local784 = 0; local784 < Static6.anInt70 - 1; local784++) {
						if (Static18.anInt614 != Static33.anIntArray112[local784] && Static33.anIntArray112[local784 + 1] == Static18.anInt614 || Static33.anIntArray112[local784] == 0 && Static33.anIntArray112[local784 + 1] != 0) {
							@Pc(815) int local815 = Static33.anIntArray112[local784];
							Static33.anIntArray112[local784] = Static33.anIntArray112[local784 + 1];
							local778 = false;
							Static33.anIntArray112[local784 + 1] = local815;
							@Pc(835) Class61 local835 = Static106.aClass61Array15[local784];
							Static106.aClass61Array15[local784] = Static106.aClass61Array15[local784 + 1];
							Static106.aClass61Array15[local784 + 1] = local835;
							@Pc(853) long local853 = Static76.aLongArray6[local784];
							Static76.aLongArray6[local784] = Static76.aLongArray6[local784 + 1];
							Static76.aLongArray6[local784 + 1] = local853;
							Static80.aBoolean94 = true;
						}
					}
				}
				Static96.anInt2447 = -1;
				return true;
			}
			@Pc(904) Class10_Sub1_Sub4 local904;
			if (Static96.anInt2447 == 128) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1112();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1132();
				local237 = Static55.aClass10_Sub10_Sub1_4.method1132();
				local904 = Static103.method591(local160);
				local904.anInt602 = (local233 << 16) + local237;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 118) {
				Static96.aBoolean112 = true;
				Static106.anInt2678 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static23.anInt762 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static18.anInt612 = Static55.aClass10_Sub10_Sub1_4.method1160();
				Static21.anInt699 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static57.anInt1512 = Static55.aClass10_Sub10_Sub1_4.method1111();
				if (Static57.anInt1512 >= 100) {
					Static12.anInt349 = Static106.anInt2678 * 128 + 64;
					Static30.anInt918 = Static23.anInt762 * 128 + 64;
					Static96.anInt2449 = Static39.method230(Static12.anInt349, Static101.anInt2582, Static30.anInt918) - Static18.anInt612;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 248) {
				Static96.aBoolean112 = false;
				for (local160 = 0; local160 < 5; local160++) {
					Static75.aBooleanArray9[local160] = false;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 221) {
				local664 = Static55.aClass10_Sub10_Sub1_4.method1144();
				@Pc(1007) Class61 local1007 = Static20.method1653(Static55.aClass10_Sub10_Sub1_4).method1620();
				Static52.method794(Static78.method1234(local664).method1617(), local1007, 6);
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 195) {
				for (local160 = 0; local160 < Static74.anIntArray228.length; local160++) {
					if (Static23.anIntArray79[local160] != Static74.anIntArray228[local160]) {
						Static74.anIntArray228[local160] = Static23.anIntArray79[local160];
						Static26.method922(local160);
						Static80.aBoolean94 = true;
					}
				}
				Static96.anInt2447 = -1;
				return true;
			}
			@Pc(1075) Class10_Sub1_Sub4 local1075;
			if (Static96.anInt2447 == 150) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1120();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1119();
				local1075 = Static103.method591(local160);
				Static96.anInt2447 = -1;
				local1075.anInt560 = 1;
				local1075.anInt558 = local233;
				return true;
			}
			if (Static96.anInt2447 == 175) {
				for (local160 = 0; local160 < Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1.length; local160++) {
					if (Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local160] != null) {
						Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local160].anInt1688 = -1;
					}
				}
				for (local233 = 0; local233 < Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1.length; local233++) {
					if (Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local233] != null) {
						Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local233].anInt1688 = -1;
					}
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 61 || Static96.anInt2447 == 249 || Static96.anInt2447 == 136 || Static96.anInt2447 == 108 || Static96.anInt2447 == 238 || Static96.anInt2447 == 100 || Static96.anInt2447 == 184 || Static96.anInt2447 == 92 || Static96.anInt2447 == 18 || Static96.anInt2447 == 209 || Static96.anInt2447 == 158) {
				Static67.method963();
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 97) {
				Static41.method685(Static5.anInt34, Static55.aClass10_Sub10_Sub1_4, Static1.aClass55_1);
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 254) {
				if (Static25.anInt782 == 12) {
					Static80.aBoolean94 = true;
				}
				Static47.anInt1299 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 78) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1112();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1117();
				local1075 = Static103.method591(local160);
				if (local1075.anInt578 != local233 || local233 == -1) {
					local1075.anInt571 = 0;
					local1075.anInt556 = 0;
					local1075.anInt578 = local233;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 222) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1124();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1120();
				local237 = Static55.aClass10_Sub10_Sub1_4.method1110();
				local904 = Static103.method591(local233);
				Static96.anInt2447 = -1;
				local904.anInt594 = local904.anInt552 + local237;
				local904.anInt592 = local904.anInt598 + local160;
				return true;
			}
			if (Static96.anInt2447 == 98) {
				@Pc(1297) boolean local1297 = Static55.aClass10_Sub10_Sub1_4.method1109() == 1;
				local233 = Static55.aClass10_Sub10_Sub1_4.method1120();
				local1075 = Static103.method591(local233);
				Static96.anInt2447 = -1;
				local1075.aBoolean29 = local1297;
				return true;
			}
			@Pc(1325) Class10_Sub1_Sub4 local1325;
			if (Static96.anInt2447 == 76) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1115();
				local1325 = Static103.method591(local160);
				local1325.anInt560 = 3;
				local1325.anInt558 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.aClass44_1.method968();
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 157) {
				Static80.anInt2163 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 2) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1132();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1120();
				local237 = Static55.aClass10_Sub10_Sub1_4.method1160();
				local904 = Static103.method591(local233);
				if (local160 == 65535) {
					local904.anInt560 = 0;
					Static96.anInt2447 = -1;
					return true;
				}
				@Pc(1386) Class10_Sub1_Sub15 local1386 = Static94.method1491(local160);
				local904.anInt566 = local1386.anInt2524;
				local904.anInt576 = local1386.anInt2531 * 100 / local237;
				local904.anInt558 = local160;
				local904.anInt560 = 4;
				Static96.anInt2447 = -1;
				local904.anInt582 = local1386.anInt2510;
				return true;
			}
			if (Static96.anInt2447 == 6) {
				Static41.method682();
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 63) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1132();
				Static51.method786(local160);
				if (Static74.anInt1871 != -1) {
					Static103.method595(Static74.anInt1871);
					Static74.anInt1871 = -1;
					Static7.aBoolean1 = true;
				}
				if (Static53.anInt1448 != -1) {
					Static103.method595(Static53.anInt1448);
					Static53.anInt1448 = -1;
					Static50.method780(30);
				}
				if (anInt18 != -1) {
					Static103.method595(anInt18);
					anInt18 = -1;
				}
				if (Static23.anInt752 != -1) {
					Static103.method595(Static23.anInt752);
					Static23.anInt752 = -1;
				}
				if (Static57.anInt1518 != local160) {
					Static103.method595(Static57.anInt1518);
					Static57.anInt1518 = local160;
				}
				Static104.aBoolean120 = false;
				Static80.aBoolean94 = true;
				if (Static1.anInt6 != 0) {
					Static7.aBoolean1 = true;
					Static1.anInt6 = 0;
				}
				Static22.aBoolean35 = true;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 242) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1141();
				if (local160 == 65535) {
					local160 = -1;
				}
				local233 = Static55.aClass10_Sub10_Sub1_4.method1109();
				if (local160 != Static34.anIntArray114[local233]) {
					Static103.method595(Static34.anIntArray114[local233]);
					Static34.anIntArray114[local233] = local160;
				}
				Static96.anInt2447 = -1;
				Static80.aBoolean94 = true;
				Static22.aBoolean35 = true;
				return true;
			}
			if (Static96.anInt2447 == 252) {
				Static19.anInt628 = Static55.aClass10_Sub10_Sub1_4.method1141() * 30;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 26) {
				Static65.anInt1747 = Static55.aClass10_Sub10_Sub1_4.method1135();
				Static29.anInt897 = Static55.aClass10_Sub10_Sub1_4.method1109();
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 10) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1141();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1132();
				if (Static74.anInt1871 != -1) {
					Static103.method595(Static74.anInt1871);
					Static7.aBoolean1 = true;
					Static74.anInt1871 = -1;
				}
				if (Static53.anInt1448 != -1) {
					Static103.method595(Static53.anInt1448);
					Static53.anInt1448 = -1;
					Static50.method780(30);
				}
				if (anInt18 != -1) {
					Static103.method595(anInt18);
					anInt18 = -1;
				}
				if (local160 != Static23.anInt752) {
					Static103.method595(Static23.anInt752);
					Static23.anInt752 = local160;
				}
				if (local233 != Static57.anInt1518) {
					Static103.method595(Static57.anInt1518);
					Static57.anInt1518 = local233;
				}
				Static96.anInt2447 = -1;
				Static22.aBoolean35 = true;
				Static80.aBoolean94 = true;
				if (Static1.anInt6 != 0) {
					Static7.aBoolean1 = true;
					Static1.anInt6 = 0;
				}
				Static104.aBoolean120 = false;
				return true;
			}
			if (Static96.anInt2447 == 77) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1127();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1160();
				local237 = local233 >> 10 & 0x1F;
				local241 = local233 >> 5 & 0x1F;
				local678 = local233 & 0x1F;
				@Pc(1683) Class10_Sub1_Sub4 local1683 = Static103.method591(local160);
				local1683.anInt605 = (local678 << 3) + (local241 << 11) + (local237 << 19);
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 13) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1119();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1120();
				local1075 = Static103.method591(local233);
				Static96.anInt2447 = -1;
				if (local1075 != null && local1075.anInt577 == 0) {
					if (local160 < 0) {
						local160 = 0;
					}
					if (local1075.anInt575 - local1075.anInt557 < local160) {
						local160 = local1075.anInt575 - local1075.anInt557;
					}
					local1075.anInt579 = local160;
				}
				return true;
			}
			@Pc(1766) Class61 local1766;
			if (Static96.anInt2447 == 122) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1143();
				local1766 = Static55.aClass10_Sub10_Sub1_4.method1151();
				local237 = Static55.aClass10_Sub10_Sub1_4.method1135();
				if (local237 >= 1 && local237 <= 5) {
					if (local1766.method1594(Static71.aClass61_761)) {
						local1766 = null;
					}
					Static63.aClass61Array5[local237 - 1] = local1766;
					Static56.aBooleanArray7[local237 - 1] = local160 == 0;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 139) {
				Static80.anInt2155 = Static5.anInt34 / 8;
				for (local160 = 0; local160 < Static80.anInt2155; local160++) {
					Static57.aLongArray4[local160] = Static55.aClass10_Sub10_Sub1_4.method1144();
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 174) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1141();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1141();
				local237 = Static55.aClass10_Sub10_Sub1_4.method1132();
				local241 = Static55.aClass10_Sub10_Sub1_4.method1127();
				@Pc(1858) Class10_Sub1_Sub4 local1858 = Static103.method591(local241);
				Static96.anInt2447 = -1;
				local1858.anInt576 = local233;
				local1858.anInt566 = local237;
				local1858.anInt582 = local160;
				return true;
			}
			if (Static96.anInt2447 == 15) {
				if (Static57.anInt1518 != -1) {
					Static103.method595(Static57.anInt1518);
					Static57.anInt1518 = -1;
					Static22.aBoolean35 = true;
					Static80.aBoolean94 = true;
				}
				if (Static74.anInt1871 != -1) {
					Static103.method595(Static74.anInt1871);
					Static7.aBoolean1 = true;
					Static74.anInt1871 = -1;
				}
				if (Static53.anInt1448 != -1) {
					Static103.method595(Static53.anInt1448);
					Static53.anInt1448 = -1;
					Static50.method780(30);
				}
				if (anInt18 != -1) {
					Static103.method595(anInt18);
					anInt18 = -1;
				}
				if (Static23.anInt752 != -1) {
					Static103.method595(Static23.anInt752);
					Static23.anInt752 = -1;
				}
				if (Static1.anInt6 != 0) {
					Static1.anInt6 = 0;
					Static7.aBoolean1 = true;
				}
				Static104.aBoolean120 = false;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 217) {
				Static53.anInt1449 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static17.anInt584 = Static55.aClass10_Sub10_Sub1_4.method1111();
				anInt25 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static75.aBoolean91 = true;
				Static7.aBoolean1 = true;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 164) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1141();
				if (local160 == 65535) {
					local160 = -1;
				}
				if (local160 == -1 && Static70.anInt2671 == 0) {
					Static15.method343();
				} else if (local160 != -1 && Static47.anInt1303 != local160 && Static51.anInt1419 != 0 && Static70.anInt2671 == 0) {
					Static15.method346(0, Static51.anInt1419, local160, Static106.aClass11_Sub1_16);
				}
				Static47.anInt1303 = local160;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 182) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1145();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1119();
				if (local233 == 65535) {
					local233 = -1;
				}
				if (Static51.anInt1419 != 0 && local233 != -1) {
					Static15.method344(Static51.anInt1419, local233, Static99.aClass11_Sub1_13, 1);
					Static70.anInt2671 = local160;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 50) {
				Static6.anInt63 = Static55.aClass10_Sub10_Sub1_4.method1119();
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 161) {
				Static18.anInt611 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static80.aBoolean94 = true;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 255) {
				Static80.aBoolean94 = true;
				local160 = Static55.aClass10_Sub10_Sub1_4.method1112();
				local1325 = Static103.method591(local160);
				while (Static55.aClass10_Sub10_Sub1_4.anInt1957 < Static5.anInt34) {
					local237 = Static55.aClass10_Sub10_Sub1_4.method1136();
					local241 = Static55.aClass10_Sub10_Sub1_4.method1160();
					local678 = Static55.aClass10_Sub10_Sub1_4.method1111();
					if (local678 == 255) {
						local678 = Static55.aClass10_Sub10_Sub1_4.method1112();
					}
					if (local237 >= 0 && local1325.anIntArray63.length > local237) {
						local1325.anIntArray63[local237] = local241;
						local1325.anIntArray65[local237] = local678;
					}
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 231) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1141();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1112();
				local1075 = Static103.method591(local233);
				local1075.anInt560 = 2;
				local1075.anInt558 = local160;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 114) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1112();
				Static16.aClass19_2 = Static1.aClass55_1.method1398(local160);
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 69) {
				Static80.aBoolean94 = true;
				local160 = Static55.aClass10_Sub10_Sub1_4.method1112();
				local1325 = Static103.method591(local160);
				local237 = Static55.aClass10_Sub10_Sub1_4.method1160();
				for (local241 = 0; local241 < local237; local241++) {
					local678 = Static55.aClass10_Sub10_Sub1_4.method1111();
					if (local678 == 255) {
						local678 = Static55.aClass10_Sub10_Sub1_4.method1120();
					}
					local1325.anIntArray63[local241] = Static55.aClass10_Sub10_Sub1_4.method1119();
					local1325.anIntArray65[local241] = local678;
				}
				for (local678 = local237; local678 < local1325.anIntArray63.length; local678++) {
					local1325.anIntArray63[local678] = 0;
					local1325.anIntArray65[local678] = 0;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 183) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1115();
				local1766 = Static55.aClass10_Sub10_Sub1_4.method1151();
				local1075 = Static103.method591(local160);
				local1075.aClass61_192 = local1766;
				if (local160 >> 16 == Static34.anIntArray114[Static25.anInt782]) {
					Static80.aBoolean94 = true;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 241) {
				Static78.anInt2122 = Static55.aClass10_Sub10_Sub1_4.method1111();
				if (Static78.anInt2122 == 1) {
					Static88.anInt2318 = Static55.aClass10_Sub10_Sub1_4.method1160();
				}
				if (Static78.anInt2122 >= 2 && Static78.anInt2122 <= 6) {
					if (Static78.anInt2122 == 2) {
						Static51.anInt1414 = 64;
						Static39.anInt262 = 64;
					}
					if (Static78.anInt2122 == 3) {
						Static51.anInt1414 = 64;
						Static39.anInt262 = 0;
					}
					if (Static78.anInt2122 == 4) {
						Static51.anInt1414 = 64;
						Static39.anInt262 = 128;
					}
					if (Static78.anInt2122 == 5) {
						Static51.anInt1414 = 0;
						Static39.anInt262 = 64;
					}
					if (Static78.anInt2122 == 6) {
						Static51.anInt1414 = 128;
						Static39.anInt262 = 64;
					}
					Static78.anInt2122 = 2;
					Static93.anInt2002 = Static55.aClass10_Sub10_Sub1_4.method1160();
					Static30.anInt922 = Static55.aClass10_Sub10_Sub1_4.method1160();
					Static17.anInt585 = Static55.aClass10_Sub10_Sub1_4.method1111();
				}
				if (Static78.anInt2122 == 10) {
					Static49.anInt1391 = Static55.aClass10_Sub10_Sub1_4.method1160();
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 88) {
				Static35.anInt1020 = 0;
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 163) {
				@Pc(2423) byte local2423 = Static55.aClass10_Sub10_Sub1_4.method1142();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1132();
				Static23.anIntArray79[local233] = local2423;
				if (local2423 != Static74.anIntArray228[local233]) {
					Static74.anIntArray228[local233] = local2423;
					Static26.method922(local233);
					Static80.aBoolean94 = true;
					if (Static98.anInt2479 != -1) {
						Static7.aBoolean1 = true;
					}
				}
				Static96.anInt2447 = -1;
				return true;
			}
			@Pc(2489) int local2489;
			@Pc(2485) long local2485;
			if (Static96.anInt2447 == 75) {
				@Pc(2467) Class61 local2467 = Static55.aClass10_Sub10_Sub1_4.method1151();
				@Pc(2487) boolean local2487;
				if (local2467.method1588(Static81.aClass61_878)) {
					local1766 = local2467.method1611(local2467.method1604(Static26.aClass61_698), 0);
					local2485 = local1766.method1586();
					local2487 = false;
					for (local2489 = 0; local2489 < Static80.anInt2155; local2489++) {
						if (local2485 == Static57.aLongArray4[local2489]) {
							local2487 = true;
							break;
						}
					}
					if (!local2487 && Static18.anInt606 == 0) {
						Static52.method794(local1766, Static104.aClass61_1059, 4);
					}
				} else if (local2467.method1588(Static17.aClass61_196)) {
					local1766 = local2467.method1611(local2467.method1604(Static26.aClass61_698), 0);
					local2485 = local1766.method1586();
					local2487 = false;
					for (local2489 = 0; local2489 < Static80.anInt2155; local2489++) {
						if (local2485 == Static57.aLongArray4[local2489]) {
							local2487 = true;
							break;
						}
					}
					if (!local2487 && Static18.anInt606 == 0) {
						Static52.method794(local1766, Static51.aClass61_582, 8);
					}
				} else if (local2467.method1588(Static46.aClass61_536)) {
					local1766 = local2467.method1611(local2467.method1604(Static26.aClass61_698), 0);
					local2485 = local1766.method1586();
					local2487 = false;
					for (local2489 = 0; local2489 < Static80.anInt2155; local2489++) {
						if (local2485 == Static57.aLongArray4[local2489]) {
							local2487 = true;
							break;
						}
					}
					if (!local2487 && Static18.anInt606 == 0) {
						@Pc(2594) Class61 local2594 = local2467.method1611(local2467.method1596() - 9, local2467.method1604(Static26.aClass61_698) + 1);
						Static52.method794(local1766, local2594, 8);
					}
				} else {
					Static52.method794(Static15.aClass61_166, local2467, 0);
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 138) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1117();
				if (local160 != Static98.anInt2479) {
					Static103.method595(Static98.anInt2479);
					Static98.anInt2479 = local160;
				}
				Static96.anInt2447 = -1;
				Static7.aBoolean1 = true;
				return true;
			}
			if (Static96.anInt2447 == 145) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1141();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1120();
				Static23.anIntArray79[local160] = local233;
				if (Static74.anIntArray228[local160] != local233) {
					Static74.anIntArray228[local160] = local233;
					Static26.method922(local160);
					if (Static98.anInt2479 != -1) {
						Static7.aBoolean1 = true;
					}
					Static80.aBoolean94 = true;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 200) {
				local664 = Static55.aClass10_Sub10_Sub1_4.method1144();
				local2485 = Static55.aClass10_Sub10_Sub1_4.method1160();
				@Pc(2738) long local2738 = (long) Static55.aClass10_Sub10_Sub1_4.method1138();
				local784 = Static55.aClass10_Sub10_Sub1_4.method1111();
				@Pc(2744) boolean local2744 = false;
				@Pc(2751) long local2751 = (local2485 << 32) + local2738;
				for (@Pc(2753) int local2753 = 0; local2753 < 100; local2753++) {
					if (Static5.aLongArray1[local2753] == local2751) {
						local2744 = true;
						break;
					}
				}
				if (local784 <= 1) {
					for (@Pc(2776) int local2776 = 0; local2776 < Static80.anInt2155; local2776++) {
						if (local664 == Static57.aLongArray4[local2776]) {
							local2744 = true;
							break;
						}
					}
				}
				if (!local2744 && Static18.anInt606 == 0) {
					Static5.aLongArray1[Static20.anInt2654] = local2751;
					Static20.anInt2654 = (Static20.anInt2654 + 1) % 100;
					@Pc(2818) Class61 local2818 = Static20.method1653(Static55.aClass10_Sub10_Sub1_4).method1620();
					if (local784 == 2 || local784 == 3) {
						Static52.method794(Static93.method1156(new Class61[] { Static44.aClass61_515, Static78.method1234(local664).method1617() }), local2818, 7);
					} else if (local784 == 1) {
						Static52.method794(Static93.method1156(new Class61[] { Static104.aClass61_1058, Static78.method1234(local664).method1617() }), local2818, 7);
					} else {
						Static52.method794(Static78.method1234(local664).method1617(), local2818, 3);
					}
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 215) {
				if (Static25.anInt782 == 12) {
					Static80.aBoolean94 = true;
				}
				Static21.anInt694 = Static55.aClass10_Sub10_Sub1_4.method1117();
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 142) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1160();
				Static51.method786(local160);
				if (Static57.anInt1518 != -1) {
					Static103.method595(Static57.anInt1518);
					Static80.aBoolean94 = true;
					Static57.anInt1518 = -1;
					Static22.aBoolean35 = true;
				}
				if (Static74.anInt1871 != -1) {
					Static103.method595(Static74.anInt1871);
					Static74.anInt1871 = -1;
					Static7.aBoolean1 = true;
				}
				if (Static53.anInt1448 != -1) {
					Static103.method595(Static53.anInt1448);
					Static53.anInt1448 = -1;
					Static50.method780(30);
				}
				if (anInt18 != -1) {
					Static103.method595(anInt18);
					anInt18 = -1;
				}
				if (local160 != Static23.anInt752) {
					Static103.method595(Static23.anInt752);
					Static23.anInt752 = local160;
				}
				Static96.anInt2447 = -1;
				Static104.aBoolean120 = false;
				if (Static1.anInt6 != 0) {
					Static7.aBoolean1 = true;
					Static1.anInt6 = 0;
				}
				return true;
			}
			if (Static96.anInt2447 == 127) {
				Static24.method1431(false);
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 169) {
				Static29.anInt897 = Static55.aClass10_Sub10_Sub1_4.method1143();
				Static65.anInt1747 = Static55.aClass10_Sub10_Sub1_4.method1111();
				while (Static5.anInt34 > Static55.aClass10_Sub10_Sub1_4.anInt1957) {
					Static96.anInt2447 = Static55.aClass10_Sub10_Sub1_4.method1111();
					Static67.method963();
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 11) {
				Static80.aBoolean94 = true;
				local160 = Static55.aClass10_Sub10_Sub1_4.method1111();
				local233 = Static55.aClass10_Sub10_Sub1_4.method1120();
				local237 = Static55.aClass10_Sub10_Sub1_4.method1109();
				Static20.anIntArray341[local237] = local233;
				Static26.anIntArray187[local237] = local160;
				Static16.anIntArray60[local237] = 1;
				for (local241 = 0; local241 < 98; local241++) {
					if (local233 >= Class10_Sub1_Sub10.anIntArray147[local241]) {
						Static16.anIntArray60[local237] = local241 + 2;
					}
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 253) {
				Static96.aBoolean112 = true;
				Static67.anInt1769 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static50.anInt1399 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static74.anInt1866 = Static55.aClass10_Sub10_Sub1_4.method1160();
				Static82.anInt2204 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static42.anInt2377 = Static55.aClass10_Sub10_Sub1_4.method1111();
				if (Static42.anInt2377 >= 100) {
					local233 = Static50.anInt1399 * 128 + 64;
					local160 = Static67.anInt1769 * 128 + 64;
					local237 = Static39.method230(local160, Static101.anInt2582, local233) - Static74.anInt1866;
					local241 = local160 - Static12.anInt349;
					local2489 = local233 - Static30.anInt918;
					local678 = local237 - Static96.anInt2449;
					local784 = (int) Math.sqrt((double) (local2489 * local2489 + local241 * local241));
					Static75.anInt2015 = (int) (Math.atan2((double) local678, (double) local784) * 325.949D) & 0x7FF;
					Static40.anInt1090 = (int) (Math.atan2((double) local241, (double) local2489) * -325.949D) & 0x7FF;
					if (Static75.anInt2015 < 128) {
						Static75.anInt2015 = 128;
					}
					if (Static75.anInt2015 > 383) {
						Static75.anInt2015 = 383;
					}
				}
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 147) {
				Static1.anInt2 = Static55.aClass10_Sub10_Sub1_4.method1111();
				Static96.anInt2447 = -1;
				return true;
			}
			if (Static96.anInt2447 == 197) {
				local160 = Static55.aClass10_Sub10_Sub1_4.method1115();
				local1325 = Static103.method591(local160);
				for (local237 = 0; local237 < local1325.anIntArray63.length; local237++) {
					local1325.anIntArray63[local237] = -1;
					local1325.anIntArray63[local237] = 0;
				}
				Static96.anInt2447 = -1;
				return true;
			}
			Static99.method1580("T1 - " + Static96.anInt2447 + "," + Static50.anInt1405 + "," + Static76.anInt2037 + " - " + Static5.anInt34, null);
			Static48.method752();
		} catch (@Pc(3277) IOException local3277) {
			Static19.method413();
		} catch (@Pc(3283) Exception local3283) {
			@Pc(3324) String local3324 = "T2 - " + Static96.anInt2447 + "," + Static50.anInt1405 + "," + Static76.anInt2037 + " - " + Static5.anInt34 + "," + (Static107.anInt2431 + Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0]) + "," + (Static7.anInt80 + Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]) + " - ";
			for (local233 = 0; Static5.anInt34 > local233 && local233 < 50; local233++) {
				local3324 = local3324 + Static55.aClass10_Sub10_Sub1_4.aByteArray9[local233] + ",";
			}
			Static99.method1580(local3324, local3283);
			Static48.method752();
		}
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1 method29() {
		@Pc(7) Class10_Sub1_Sub1_Sub1 local7 = new Class10_Sub1_Sub1_Sub1();
		local7.anInt174 = Static1.anInt4;
		local7.anInt176 = Static22.anInt740;
		local7.anInt178 = Static96.anIntArray321[0];
		local7.anInt175 = Static54.anIntArray158[0];
		local7.anInt179 = Static88.anIntArray306[0];
		local7.anInt177 = Static71.anIntArray207[0];
		@Pc(39) int local39 = local7.anInt179 * local7.anInt177;
		@Pc(43) byte[] local43 = Static47.aByteArrayArray8[0];
		local7.anIntArray31 = new int[local39];
		for (@Pc(49) int local49 = 0; local49 < local39; local49++) {
			local7.anIntArray31[local49] = Static25.anIntArray80[local43[local49] & 0xFF];
		}
		Static1.method5();
		return local7;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!d;II)I")
	public static int method30(@OriginalArg(0) Class10_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray7 == null || arg1 >= arg0.anIntArrayArray7.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg0.anIntArrayArray7[arg1];
			@Pc(22) int local22 = 0;
			@Pc(24) int local24 = 0;
			@Pc(32) byte local32 = 0;
			while (true) {
				@Pc(37) int local37 = local20[local24++];
				@Pc(39) int local39 = 0;
				@Pc(41) byte local41 = 0;
				if (local37 == 0) {
					return local22;
				}
				if (local37 == 1) {
					local39 = Static26.anIntArray187[local20[local24++]];
				}
				if (local37 == 15) {
					local41 = 1;
				}
				if (local37 == 2) {
					local39 = Static16.anIntArray60[local20[local24++]];
				}
				if (local37 == 3) {
					local39 = Static20.anIntArray341[local20[local24++]];
				}
				if (local37 == 16) {
					local41 = 2;
				}
				@Pc(103) int local103;
				@Pc(114) Class10_Sub1_Sub4 local114;
				@Pc(119) int local119;
				@Pc(132) int local132;
				if (local37 == 4) {
					local103 = local20[local24++] << 16;
					@Pc(110) int local110 = local103 + local20[local24++];
					local114 = Static103.method591(local110);
					local119 = local20[local24++];
					if (local119 != -1 && (!Static94.method1491(local119).aBoolean118 || Static106.aBoolean121)) {
						for (local132 = 0; local132 < local114.anIntArray63.length; local132++) {
							if (local119 + 1 == local114.anIntArray63[local132]) {
								local39 += local114.anIntArray65[local132];
							}
						}
					}
				}
				if (local37 == 5) {
					local39 = Static74.anIntArray228[local20[local24++]];
				}
				if (local37 == 17) {
					local41 = 3;
				}
				if (local37 == 6) {
					local39 = Class10_Sub1_Sub10.anIntArray147[Static16.anIntArray60[local20[local24++]] - 1];
				}
				if (local37 == 7) {
					local39 = Static74.anIntArray228[local20[local24++]] * 100 / 46875;
				}
				if (local37 == 8) {
					local39 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1702;
				}
				if (local37 == 9) {
					for (local103 = 0; local103 < 25; local103++) {
						if (Static53.aBooleanArray6[local103]) {
							local39 += Static16.anIntArray60[local103];
						}
					}
				}
				if (local37 == 10) {
					local103 = local20[local24++] << 16;
					local103 += local20[local24++];
					local114 = Static103.method591(local103);
					local119 = local20[local24++];
					if (local119 != -1 && (!Static94.method1491(local119).aBoolean118 || Static106.aBoolean121)) {
						for (local132 = 0; local132 < local114.anIntArray63.length; local132++) {
							if (local119 + 1 == local114.anIntArray63[local132]) {
								local39 = 999999999;
								break;
							}
						}
					}
				}
				if (local37 == 11) {
					local39 = Static47.anInt1299;
				}
				if (local37 == 12) {
					local39 = Static21.anInt694;
				}
				if (local37 == 13) {
					local103 = Static74.anIntArray228[local20[local24++]];
					@Pc(324) int local324 = local20[local24++];
					local39 = (0x1 << local324 & local103) == 0 ? 0 : 1;
				}
				if (local37 == 14) {
					local103 = local20[local24++];
					local39 = Static69.method1014(local103);
				}
				if (local37 == 18) {
					local39 = Static107.anInt2431 + (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 >> 7);
				}
				if (local37 == 19) {
					local39 = (Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 >> 7) + Static7.anInt80;
				}
				if (local37 == 20) {
					local39 = local20[local24++];
				}
				if (local41 == 0) {
					if (local32 == 0) {
						local22 += local39;
					}
					if (local32 == 1) {
						local22 -= local39;
					}
					if (local32 == 2 && local39 != 0) {
						local22 /= local39;
					}
					if (local32 == 3) {
						local22 *= local39;
					}
					local32 = 0;
				} else {
					local32 = local41;
				}
			}
		} catch (@Pc(419) Exception local419) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method31() {
		aClass61_5 = null;
		aClass61_9 = null;
		aClass61_6 = null;
		aClass61_3 = null;
		aClass10_Sub1_Sub1_Sub2_2 = null;
		aClass61_8 = null;
		aClass61_4 = null;
		aClass61_7 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method32(@OriginalArg(1) Component arg0) {
		try {
			@Pc(1) Method local1 = Static86.aMethod1;
			if (local1 != null) {
				local1.invoke(arg0, Boolean.FALSE);
			}
		} catch (@Pc(15) Throwable local15) {
		}
		arg0.addKeyListener(Static57.aClass51_1);
		arg0.addFocusListener(Static57.aClass51_1);
	}
}
