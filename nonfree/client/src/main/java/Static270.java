import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray56;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public static int anInt5273 = 0;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray55 = new String[100];

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	public static int anInt5276 = -1;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt5277 = 1;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	public static int anInt5278 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public static void method4085() {
		@Pc(5) int local5 = Static134.aClass1_Sub2_Sub1_3.method451(Static185.aString226);
		@Pc(15) int local15;
		@Pc(24) int local24;
		for (local15 = 0; local15 < Static134.anInt2945; local15++) {
			local24 = Static134.aClass1_Sub2_Sub1_3.method451(Static132.method2239(local15));
			if (local5 < local24) {
				local5 = local24;
			}
		}
		local5 += 8;
		local15 = Static134.anInt2945 * 15 + 21;
		local24 = Static29.anInt661;
		if (local15 + local24 > Static148.anInt3206) {
			local24 = Static148.anInt3206 - local15;
		}
		@Pc(67) int local67 = Static137.anInt3016 - local5 / 2;
		if (local67 + local5 > Static3.anInt122) {
			local67 = Static3.anInt122 - local5;
		}
		if (local67 < 0) {
			local67 = 0;
		}
		if (local24 < 0) {
			local24 = 0;
		}
		if (Static30.anInt3296 == 1) {
			if (Static298.anInt5621 == Static137.anInt3016 && Static29.anInt661 == Static58.anInt992) {
				Static116.anInt5594 = local5;
				Static14.aBoolean23 = true;
				Static30.anInt3296 = 0;
				Static276.anInt2924 = Static134.anInt2945 * 15 + (Static221.aBoolean340 ? 26 : 22);
				Static279.anInt5379 = local67;
				Static88.anInt1955 = local24;
			}
		} else if (Static137.anInt3016 == Static249.anInt4936 && Static40.anInt1015 == Static29.anInt661) {
			Static30.anInt3296 = 0;
			Static116.anInt5594 = local5;
			Static14.aBoolean23 = true;
			Static88.anInt1955 = local24;
			Static276.anInt2924 = (Static221.aBoolean340 ? 26 : 22) + Static134.anInt2945 * 15;
			Static279.anInt5379 = local67;
		} else {
			Static58.anInt992 = Static40.anInt1015;
			Static298.anInt5621 = Static249.anInt4936;
			Static30.anInt3296 = 1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
	public static void method4087() {
		Static220.method3469(false);
		Static273.anInt5323 = 0;
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static39.aByteArrayArray5.length; local14++) {
			if (Static136.anIntArray379[local14] != -1 && Static39.aByteArrayArray5[local14] == null) {
				Static39.aByteArrayArray5[local14] = Static203.aClass91_157.method2495(Static136.anIntArray379[local14], 0);
				if (Static39.aByteArrayArray5[local14] == null) {
					local12 = false;
					Static273.anInt5323++;
				}
			}
			if (Static202.anIntArray365[local14] != -1 && Static16.aByteArrayArray2[local14] == null) {
				Static16.aByteArrayArray2[local14] = Static203.aClass91_157.method2490(Static202.anIntArray365[local14], Static124.anIntArrayArray9[local14], 0);
				if (Static16.aByteArrayArray2[local14] == null) {
					local12 = false;
					Static273.anInt5323++;
				}
			}
			if (Static277.aBoolean412) {
				if (Static225.anIntArray398[local14] != -1 && Static143.aByteArrayArray8[local14] == null) {
					Static143.aByteArrayArray8[local14] = Static203.aClass91_157.method2495(Static225.anIntArray398[local14], 0);
					if (Static143.aByteArrayArray8[local14] == null) {
						local12 = false;
						Static273.anInt5323++;
					}
				}
				if (Static189.anIntArray350[local14] != -1 && aByteArrayArray14[local14] == null) {
					aByteArrayArray14[local14] = Static203.aClass91_157.method2495(Static189.anIntArray350[local14], 0);
					if (aByteArrayArray14[local14] == null) {
						Static273.anInt5323++;
						local12 = false;
					}
				}
			}
			if (Static118.anIntArray250 != null && Static170.aByteArrayArray9[local14] == null && Static118.anIntArray250[local14] != -1) {
				Static170.aByteArrayArray9[local14] = Static203.aClass91_157.method2490(Static118.anIntArray250[local14], Static124.anIntArrayArray9[local14], 0);
				if (Static170.aByteArrayArray9[local14] == null) {
					Static273.anInt5323++;
					local12 = false;
				}
			}
		}
		if (Static92.aClass82_6 == null) {
			if (Static236.aClass1_Sub2_Sub21_2 == null || !Static106.aClass91_88.method2505(Static236.aClass1_Sub2_Sub21_2.aString319 + "_labels")) {
				Static92.aClass82_6 = new Class82(0);
			} else if (Static106.aClass91_88.method2491(Static236.aClass1_Sub2_Sub21_2.aString319 + "_labels")) {
				Static92.aClass82_6 = Static227.method3559(Static236.aClass1_Sub2_Sub21_2.aString319 + "_labels", Static106.aClass91_88);
			} else {
				Static273.anInt5323++;
				local12 = false;
			}
		}
		if (!local12) {
			Static198.anInt35 = 1;
			return;
		}
		Static69.anInt1472 = 0;
		local12 = true;
		@Pc(291) int local291;
		@Pc(301) int local301;
		for (local14 = 0; local14 < Static39.aByteArrayArray5.length; local14++) {
			@Pc(278) byte[] local278 = Static16.aByteArrayArray2[local14];
			if (local278 != null) {
				local291 = (Static24.anIntArray414[local14] >> 8) * 64 - Static53.anInt5288;
				local301 = (Static24.anIntArray414[local14] & 0xFF) * 64 - Static83.anInt1875;
				if (Static127.aBoolean210) {
					local301 = 10;
					local291 = 10;
				}
				local12 &= Static30.method2635(local278, local301, local291);
			}
			if (Static277.aBoolean412) {
				local278 = aByteArrayArray14[local14];
				if (local278 != null) {
					local291 = (Static24.anIntArray414[local14] >> 8) * 64 - Static53.anInt5288;
					local301 = (Static24.anIntArray414[local14] & 0xFF) * 64 - Static83.anInt1875;
					if (Static127.aBoolean210) {
						local291 = 10;
						local301 = 10;
					}
					local12 &= Static30.method2635(local278, local301, local291);
				}
			}
		}
		if (!local12) {
			Static198.anInt35 = 2;
			return;
		}
		if (Static198.anInt35 != 0) {
			Static21.method412(true, Static186.aString229 + "<br>(100%)");
		}
		Static105.method1947();
		Static197.method3240();
		@Pc(389) boolean local389 = false;
		@Pc(395) int local395;
		if (Static277.aBoolean412 && Static236.aBoolean353) {
			for (local395 = 0; local395 < Static39.aByteArrayArray5.length; local395++) {
				if (aByteArrayArray14[local395] != null || Static143.aByteArrayArray8[local395] != null) {
					local389 = true;
					break;
				}
			}
		}
		Static66.method1193(Static277.aBoolean412 ? 28 : 25, local389);
		for (local395 = 0; local395 < 4; local395++) {
			Static88.aClass92Array1[local395].method2576();
		}
		for (local395 = 0; local395 < 4; local395++) {
			for (local291 = 0; local291 < 104; local291++) {
				for (local301 = 0; local301 < 104; local301++) {
					Static260.aByteArrayArrayArray25[local395][local291][local301] = 0;
				}
			}
		}
		Static174.method2984(false);
		if (Static277.aBoolean412) {
			Static292.aClass12_Sub2_4.method3935();
			for (local395 = 0; local395 < 13; local395++) {
				for (local291 = 0; local291 < 13; local291++) {
					Static292.aClass101ArrayArray1[local395][local291].aBoolean247 = true;
				}
			}
		}
		if (Static277.aBoolean412) {
			Static120.method2133();
		}
		if (Static277.aBoolean412) {
			Static194.method3209();
		}
		Static105.method1947();
		System.gc();
		Static220.method3469(true);
		Static255.method3904(false);
		if (!Static127.aBoolean210) {
			Static181.method3038(false);
			Static220.method3469(true);
			if (Static277.aBoolean412) {
				local291 = Static197.aClass14_Sub2_Sub1_2.anIntArray418[0] >> 3;
				local395 = Static197.aClass14_Sub2_Sub1_2.anIntArray415[0] >> 3;
				Static24.method3657(local395, local291);
			}
			Static299.method4470(false);
			if (Static170.aByteArrayArray9 != null) {
				Static16.method306();
			}
		}
		if (Static127.aBoolean210) {
			Static55.method1042(false);
			Static220.method3469(true);
			if (Static277.aBoolean412) {
				local395 = Static197.aClass14_Sub2_Sub1_2.anIntArray415[0] >> 3;
				local291 = Static197.aClass14_Sub2_Sub1_2.anIntArray418[0] >> 3;
				Static24.method3657(local395, local291);
			}
			Static221.method3475(false);
		}
		Static197.method3240();
		Static220.method3469(true);
		Static18.method339(false, Static127.aBoolean210 ? Static33.anIntArrayArrayArray2 : (int[][][]) null, Static88.aClass92Array1);
		if (Static277.aBoolean412) {
			Static120.method2140();
		}
		Static220.method3469(true);
		local395 = Static153.anInt3320;
		if (local395 > Static140.anInt3034) {
			local395 = Static140.anInt3034;
		}
		if (Static140.anInt3034 - 1 > local395) {
		}
		if (Static60.method1068()) {
			Static295.method4417(0);
		} else {
			Static295.method4417(Static153.anInt3320);
		}
		Static134.method2282();
		if (Static277.aBoolean412 && local389) {
			Static284.method4269(true);
			Static255.method3904(true);
			if (!Static127.aBoolean210) {
				Static181.method3038(true);
				Static220.method3469(true);
				Static299.method4470(true);
			}
			if (Static127.aBoolean210) {
				Static55.method1042(true);
				Static220.method3469(true);
				Static221.method3475(true);
			}
			Static197.method3240();
			Static220.method3469(true);
			Static18.method339(true, Static127.aBoolean210 ? Static33.anIntArrayArrayArray2 : (int[][][]) null, Static88.aClass92Array1);
			Static220.method3469(true);
			Static134.method2282();
			Static284.method4269(false);
		}
		if (Static277.aBoolean412) {
			for (local291 = 0; local291 < 13; local291++) {
				for (local301 = 0; local301 < 13; local301++) {
					Static292.aClass101ArrayArray1[local291][local301].method2758(Static55.anIntArrayArrayArray3[0], local291 * 8, local301 * 8);
				}
			}
		}
		for (local291 = 0; local291 < 104; local291++) {
			for (local301 = 0; local301 < 104; local301++) {
				Static183.method3509(local291, local301);
			}
		}
		Static88.method1529();
		Static105.method1947();
		Static194.method3207();
		Static197.method3240();
		Static7.aBoolean158 = false;
		if (Static277.aBoolean412) {
			Static279.method4238(true);
		}
		if (Static193.aFrame1 != null && Static87.aClass113_1 != null && Static194.anInt4017 == 25) {
			Static283.aClass1_Sub11_Sub1_3.method2697(171);
			Static283.aClass1_Sub11_Sub1_3.method2659(1057001181);
		}
		if (!Static127.aBoolean210) {
			local291 = (Static181.anInt3792 - 6) / 8;
			local301 = (Static181.anInt3792 + 6) / 8;
			@Pc(809) int local809 = (Static153.anInt3329 - 6) / 8;
			@Pc(815) int local815 = (Static153.anInt3329 + 6) / 8;
			for (@Pc(819) int local819 = local291 - 1; local819 <= local301 + 1; local819++) {
				for (@Pc(832) int local832 = local809 - 1; local832 <= local815 + 1; local832++) {
					if (local819 < local291 || local301 < local819 || local832 < local809 || local832 > local815) {
						Static203.aClass91_157.method2500("m" + local819 + "_" + local832);
						Static203.aClass91_157.method2500("l" + local819 + "_" + local832);
					}
				}
			}
		}
		if (Static194.anInt4017 == 28) {
			Static163.method2823(10);
		} else {
			Static163.method2823(30);
			if (Static87.aClass113_1 != null) {
				Static283.aClass1_Sub11_Sub1_3.method2697(195);
			}
		}
		Static219.method3468();
		Static105.method1947();
		Static115.method2092();
	}
}
