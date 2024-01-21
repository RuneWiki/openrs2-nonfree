import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!u;")
	public static Class74 aClass74_411 = null;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	public static int anInt456 = 0;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_412 = Static72.method1077("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "[I")
	public static int[] anIntArray49 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_413 = Static72.method1077("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_414 = Static72.method1077("Benutzen");

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	public static int anInt463 = 0;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public static volatile int anInt465 = 0;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!u;")
	public static Class74 aClass74_415 = Static72.method1077("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!u;")
	public static Class74 aClass74_416 = Static72.method1077("backtop1");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V")
	public static void method358() {
		Static77.aBoolean68 = false;
		Static107.anInt2339 = -1;
		Static121.anInt2594 = 0;
		Static72.anInt1559 = 2;
		Static84.anInt1827 = -1;
		Static9.anInt300 = 1;
		Static62.aClass26_12 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method359() {
		aClass74_411 = null;
		aClass74_415 = null;
		aClass74_413 = null;
		aClass74_416 = null;
		anIntArray49 = null;
		aClass74_412 = null;
		aClass74_414 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method360() {
		Static31.method574();
		Static15.method355();
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (Static53.anInt1291 == 2 || Static53.anInt1291 == 5) {
			@Pc(20) byte[] local20 = Static42.aClass2_Sub2_Sub1_Sub1_21.aByteArray1;
			@Pc(22) int[] local22 = Static58.anIntArray117;
			local25 = local20.length;
			for (local27 = 0; local27 < local25; local27++) {
				if (local20[local27] == 0) {
					local22[local27] = 0;
				}
			}
			if (Static53.anInt1291 < 3) {
				Static67.aClass2_Sub2_Sub1_Sub2_3.method202(0, 0, 33, 33, 25, 25, Static18.anInt562, 256, Static64.anIntArray175, Static52.anIntArray142);
			}
			Static15.method352();
			return;
		}
		@Pc(69) int local69 = Static18.anInt562 + Static5.anInt62 & 0x7FF;
		@Pc(76) int local76 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 / 32 + 48;
		local25 = 464 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 / 32;
		Static80.aClass2_Sub2_Sub1_Sub2_5.method202(25, 5, 146, 151, local76, local25, local69, Static41.anInt968 + 256, Static45.anIntArray124, Static43.anIntArray114);
		for (local27 = 0; local27 < Static84.anInt1828; local27++) {
			local25 = Static126.anIntArray409[local27] * 4 + 2 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 / 32;
			local76 = Static19.anIntArray56[local27] * 4 + 2 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 / 32;
			Static51.method1483(local76, Static116.aClass2_Sub2_Sub1_Sub2Array11[local27], local25);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 0; local149 < 104; local149++) {
			for (local153 = 0; local153 < 104; local153++) {
				@Pc(163) Class13 local163 = Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local149][local153];
				if (local163 != null) {
					local76 = local149 * 4 + 2 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 / 32;
					local25 = local153 * 4 + 2 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 / 32;
					Static51.method1483(local76, Static46.aClass2_Sub2_Sub1_Sub2Array6[0], local25);
				}
			}
		}
		for (local153 = 0; local153 < Static29.anInt686; local153++) {
			@Pc(219) Class2_Sub2_Sub2_Sub1_Sub1 local219 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[Static40.anIntArray110[local153]];
			if (local219 != null && local219.method1861()) {
				@Pc(228) Class2_Sub2_Sub9 local228 = local219.aClass2_Sub2_Sub9_1;
				if (local228 != null && local228.anIntArray130 != null) {
					local228 = local228.method767();
				}
				if (local228 != null && local228.aBoolean46 && local228.aBoolean47) {
					local76 = local219.anInt2673 / 32 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 / 32;
					local25 = local219.anInt2672 / 32 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 / 32;
					Static51.method1483(local76, Static46.aClass2_Sub2_Sub1_Sub2Array6[1], local25);
				}
			}
		}
		@Pc(327) int local327;
		@Pc(291) Class2_Sub2_Sub2_Sub1_Sub2 local291;
		for (@Pc(283) int local283 = 0; local283 < Static10.anInt320; local283++) {
			local291 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[Static92.anIntArray267[local283]];
			if (local291 != null && local291.method1861()) {
				local25 = local291.anInt2672 / 32 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 / 32;
				local76 = local291.anInt2673 / 32 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 / 32;
				@Pc(320) boolean local320 = false;
				@Pc(325) long local325 = local291.aClass74_1661.method1696();
				for (local327 = 0; local327 < Static65.anInt1450; local327++) {
					if (local325 == Static6.aLongArray2[local327] && Static78.anIntArray251[local327] != 0) {
						local320 = true;
						break;
					}
				}
				@Pc(352) boolean local352 = false;
				if (Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2752 != 0 && local291.anInt2752 != 0 && Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2752 == local291.anInt2752) {
					local352 = true;
				}
				if (local320) {
					Static51.method1483(local76, Static46.aClass2_Sub2_Sub1_Sub2Array6[3], local25);
				} else if (local352) {
					Static51.method1483(local76, Static46.aClass2_Sub2_Sub1_Sub2Array6[4], local25);
				} else {
					Static51.method1483(local76, Static46.aClass2_Sub2_Sub1_Sub2Array6[2], local25);
				}
			}
		}
		if (Static52.anInt1251 != 0 && Static107.anInt2338 % 20 < 10) {
			if (Static52.anInt1251 == 1 && Static124.anInt2739 >= 0 && Static124.anInt2739 < Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1.length) {
				@Pc(431) Class2_Sub2_Sub2_Sub1_Sub1 local431 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[Static124.anInt2739];
				if (local431 != null) {
					local76 = local431.anInt2673 / 32 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 / 32;
					local25 = local431.anInt2672 / 32 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 / 32;
					Static101.method1561(local76, Static71.aClass2_Sub2_Sub1_Sub2Array7[1], local25);
				}
			}
			if (Static52.anInt1251 == 2) {
				local25 = (Static47.anInt1098 - Static62.anInt1413) * 4 + 2 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 / 32;
				local76 = (-Static107.anInt2343 + Static30.anInt727) * 4 + 2 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 / 32;
				Static101.method1561(local76, Static71.aClass2_Sub2_Sub1_Sub2Array7[1], local25);
			}
			if (Static52.anInt1251 == 10 && Static54.anInt1326 >= 0 && Static54.anInt1326 < Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1.length) {
				local291 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[Static54.anInt1326];
				if (local291 != null) {
					local25 = local291.anInt2672 / 32 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 / 32;
					local76 = local291.anInt2673 / 32 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 / 32;
					Static101.method1561(local76, Static71.aClass2_Sub2_Sub1_Sub2Array7[1], local25);
				}
			}
		}
		if (Static71.anInt1556 != 0) {
			local76 = Static71.anInt1556 * 4 + 2 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2673 / 32;
			local25 = Static109.anInt2398 * 4 + 2 - Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anInt2672 / 32;
			Static51.method1483(local76, Static71.aClass2_Sub2_Sub1_Sub2Array7[0], local25);
		}
		Static58.method702(97, 78, 3, 3, 16777215);
		if (Static53.anInt1291 >= 3) {
			@Pc(600) byte[] local600 = Static42.aClass2_Sub2_Sub1_Sub1_21.aByteArray1;
			@Pc(602) int[] local602 = Static58.anIntArray117;
			for (@Pc(604) int local604 = 0; local604 <= 33; local604++) {
				@Pc(611) int local611 = local604 * Static42.aClass2_Sub2_Sub1_Sub1_21.anInt116;
				for (local327 = 0; local327 <= 33; local327++) {
					if (local600[local611 + local327] == 0) {
						local602[local327 + local611] = 0;
					}
				}
			}
		} else {
			Static67.aClass2_Sub2_Sub1_Sub2_3.method202(0, 0, 33, 33, 25, 25, Static18.anInt562, 256, Static64.anIntArray175, Static52.anIntArray142);
		}
		Static15.method352();
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method361() {
		Static65.aClass7_1.method923();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static123.aLongArray15[local15] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static17.aLongArray7[local27] = 0L;
		}
		Static99.anInt2122 = 0;
	}
}
