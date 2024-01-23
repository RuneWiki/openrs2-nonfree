import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Lclient!o;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_2;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean170 = true;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)Lclient!hg;")
	public static Class1_Sub2_Sub7_Sub1 method2375(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub7_Sub1 local10 = (Class1_Sub2_Sub7_Sub1) Static158.aClass79_21.method2483((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static218.aClass51_70.method1874(arg0, 0);
		local10 = new Class1_Sub2_Sub7_Sub1(local25);
		local10.method1937(Static33.aClass7Array5, null);
		Static158.aClass79_21.method2486(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public static void method2377() {
		Static212.aClass79_31.method2479(5);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method2378() {
		@Pc(7) boolean local7 = true;
		Static241.method3957(false);
		Static230.anInt5423 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static254.aByteArrayArray13.length; local14++) {
			if (Static143.anIntArray266[local14] != -1 && Static254.aByteArrayArray13[local14] == null) {
				Static254.aByteArrayArray13[local14] = Static251.aClass51_80.method1874(Static143.anIntArray266[local14], 0);
				if (Static254.aByteArrayArray13[local14] == null) {
					Static230.anInt5423++;
					local7 = false;
				}
			}
			if (Static48.anIntArray105[local14] != -1 && Static240.aByteArrayArray11[local14] == null) {
				Static240.aByteArrayArray11[local14] = Static251.aClass51_80.method1858(Static59.anIntArrayArray13[local14], 0, Static48.anIntArray105[local14]);
				if (Static240.aByteArrayArray11[local14] == null) {
					Static230.anInt5423++;
					local7 = false;
				}
			}
			if (Static43.anIntArray96 != null && Static172.aByteArrayArray8[local14] == null && Static43.anIntArray96[local14] != -1) {
				Static172.aByteArrayArray8[local14] = Static251.aClass51_80.method1858(Static59.anIntArrayArray13[local14], 0, Static43.anIntArray96[local14]);
				if (Static172.aByteArrayArray8[local14] == null) {
					Static230.anInt5423++;
					local7 = false;
				}
			}
		}
		if (Static176.aClass151_1 == null) {
			if (Static89.aClass1_Sub2_Sub11_1 == null || !Static5.aClass51_1.method1854(Static89.aClass1_Sub2_Sub11_1.aString250 + "_labels")) {
				Static176.aClass151_1 = new Class151(0);
			} else if (Static5.aClass51_1.method1851(Static89.aClass1_Sub2_Sub11_1.aString250 + "_labels")) {
				Static176.aClass151_1 = Static67.method1311(Static5.aClass51_1, Static89.aClass1_Sub2_Sub11_1.aString250 + "_labels");
			} else {
				Static230.anInt5423++;
				local7 = false;
			}
		}
		if (!local7) {
			Static212.anInt4622 = 1;
			return;
		}
		local7 = true;
		Static16.anInt4951 = 0;
		@Pc(204) int local204;
		@Pc(215) int local215;
		for (@Pc(186) int local186 = 0; local186 < Static254.aByteArrayArray13.length; local186++) {
			@Pc(192) byte[] local192 = Static240.aByteArrayArray11[local186];
			if (local192 != null) {
				local204 = (Static169.anIntArray298[local186] >> 8) * 64 - Static64.anInt1786;
				local215 = (Static169.anIntArray298[local186] & 0xFF) * 64 - Static29.anInt907;
				if (Static51.aBoolean84) {
					local215 = 10;
					local204 = 10;
				}
				local7 &= Static125.method2399(local215, local192, local204);
			}
		}
		if (!local7) {
			Static212.anInt4622 = 2;
			return;
		}
		if (Static212.anInt4622 != 0) {
			Static179.method3059(true, Static136.aString218 + "<br>(100%)");
		}
		Static98.method2086();
		Static24.method483();
		Static128.method2424();
		for (local204 = 0; local204 < 4; local204++) {
			Static47.aClass65Array1[local204].method2206();
		}
		@Pc(289) int local289;
		@Pc(293) int local293;
		for (local215 = 0; local215 < 4; local215++) {
			for (local289 = 0; local289 < 104; local289++) {
				for (local293 = 0; local293 < 104; local293++) {
					Static145.aByteArrayArrayArray13[local215][local289][local293] = 0;
				}
			}
		}
		Static205.method3440(false);
		Static98.method2086();
		System.gc();
		Static241.method3957(true);
		Static252.method4074();
		if (!Static51.aBoolean84) {
			Static198.method3467();
			Static241.method3957(true);
			Static101.method2103();
			if (Static172.aByteArrayArray8 != null) {
				Static210.method3482();
			}
		}
		if (Static51.aBoolean84) {
			Static3.method35();
			Static241.method3957(true);
			Static30.method585();
		}
		Static24.method483();
		Static241.method3957(true);
		Static182.method3132(Static51.aBoolean84 ? Static127.anIntArrayArrayArray8 : null, Static47.aClass65Array1);
		Static241.method3957(true);
		local289 = Static124.anInt3159;
		if (local289 > Static137.anInt3321) {
			local289 = Static137.anInt3321;
		}
		if (local289 < Static137.anInt3321 - 1) {
		}
		if (Static25.method507()) {
			Static182.method3129(0);
		} else {
			Static182.method3129(Static124.anInt3159);
		}
		Static147.method2673();
		@Pc(420) int local420;
		for (local293 = 0; local293 < 104; local293++) {
			for (local420 = 0; local420 < 104; local420++) {
				Static28.method574(local420, local293);
			}
		}
		Static165.method2871();
		Static98.method2086();
		Static244.method3993();
		Static24.method483();
		if (Static42.aFrame1 != null && Static34.aClass109_2 != null && Static224.anInt4922 == 25) {
			Static171.aClass1_Sub13_Sub1_3.method1825(82);
			Static171.aClass1_Sub13_Sub1_3.method1754(1057001181);
		}
		if (!Static51.aBoolean84) {
			local420 = (Static165.anInt3877 - 6) / 8;
			@Pc(475) int local475 = (Static165.anInt3877 + 6) / 8;
			@Pc(481) int local481 = (Static261.anInt5479 - 6) / 8;
			@Pc(487) int local487 = (Static261.anInt5479 + 6) / 8;
			for (@Pc(491) int local491 = local420 - 1; local491 <= local475 + 1; local491++) {
				for (@Pc(497) int local497 = local481 - 1; local497 <= local487 + 1; local497++) {
					if (local491 < local420 || local475 < local491 || local497 < local481 || local497 > local487) {
						Static251.aClass51_80.method1849("m" + local491 + "_" + local497);
						Static251.aClass51_80.method1849("l" + local491 + "_" + local497);
					}
				}
			}
		}
		if (Static224.anInt4922 == 28) {
			Static168.method2918(10);
		} else {
			Static168.method2918(30);
			if (Static34.aClass109_2 != null) {
				Static171.aClass1_Sub13_Sub1_3.method1825(246);
			}
		}
		Static239.method3937();
		Static98.method2086();
		Static90.method1901();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
	public static boolean method2379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static259.aBoolean280) {
			return false;
		}
		@Pc(21) int local21 = arg0 & 0xFFFF;
		@Pc(25) int local25 = arg0 >> 16;
		if (Static80.aClass122ArrayArray1[local25] == null || Static80.aClass122ArrayArray1[local25][local21] == null) {
			return false;
		}
		@Pc(43) Class122 local43 = Static80.aClass122ArrayArray1[local25][local21];
		@Pc(52) int local52;
		if (arg1 == -1 && local43.anInt4656 == 0) {
			for (local52 = 0; local52 < Static230.anInt5417; local52++) {
				if (Static57.aShortArray26[local52] == 22 || Static57.aShortArray26[local52] == 1006 || Static57.aShortArray26[local52] == 50 || Static57.aShortArray26[local52] == 40 || Static57.aShortArray26[local52] == 26) {
					for (@Pc(91) Class122 local91 = Static206.method3444(Static161.anIntArray281[local52]); local91 != null; local91 = Static90.method1899(local91)) {
						if (local91.anInt4686 == local43.anInt4686) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = 0; local52 < Static230.anInt5417; local52++) {
				if (arg1 == Static216.anIntArray379[local52] && local43.anInt4686 == Static161.anIntArray281[local52] && (Static57.aShortArray26[local52] == 22 || Static57.aShortArray26[local52] == 1006 || Static57.aShortArray26[local52] == 50 || Static57.aShortArray26[local52] == 40 || Static57.aShortArray26[local52] == 26)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	public static void method2380() {
		Static160.aClass79_22.method2479(5);
	}
}
