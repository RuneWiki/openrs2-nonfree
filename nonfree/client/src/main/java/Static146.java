import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1193 = Static38.method685(" seconds)3");

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1194 = aClass6_1193;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1196 = Static38.method685("skill)2");

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1195 = aClass6_1196;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1197 = Static38.method685("sl_button");

	@OriginalMember(owner = "client!s", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1198 = Static38.method685("nav");

	@OriginalMember(owner = "client!s", name = "p", descriptor = "I")
	public static int anInt4005 = -1;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
	public static void method2704() {
		aClass6_1195 = null;
		aClass6_1194 = null;
		aClass6_1197 = null;
		aClass6_1196 = null;
		aClass6_1193 = null;
		aClass6_1198 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
	public static void method2706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static66.aClass2_Sub13_Sub1_2.method1455(216);
		Static66.aClass2_Sub13_Sub1_2.method1428(arg0);
		Static66.aClass2_Sub13_Sub1_2.method1426(arg1);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BLjava/awt/Component;II)Lclient!s;")
	public static Class67 method2707(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(13) Class local13 = Class.forName("Class67_Sub1");
			@Pc(17) Class67 local17 = (Class67) local13.getDeclaredConstructor().newInstance();
			local17.method2708(arg0, arg2, arg1);
			return local17;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class67_Sub2 local30 = new Class67_Sub2();
			local30.method2708(arg0, arg2, arg1);
			return local30;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
	public static void method2709() {
		@Pc(7) boolean local7 = true;
		Static124.method1930(false);
		Static52.anInt1433 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static18.aByteArrayArray1.length; local14++) {
			if (Static179.anIntArray403[local14] != -1 && Static18.aByteArrayArray1[local14] == null) {
				Static18.aByteArrayArray1[local14] = Static165.aClass10_Sub1_17.method1605(0, Static179.anIntArray403[local14]);
				if (Static18.aByteArrayArray1[local14] == null) {
					local7 = false;
					Static52.anInt1433++;
				}
			}
			if (Static25.anIntArray29[local14] != -1 && Static58.aByteArrayArray4[local14] == null) {
				Static58.aByteArrayArray4[local14] = Static165.aClass10_Sub1_17.method1604(Static129.anIntArrayArray75[local14], 0, Static25.anIntArray29[local14]);
				if (Static58.aByteArrayArray4[local14] == null) {
					local7 = false;
					Static52.anInt1433++;
				}
			}
		}
		if (!local7) {
			Static123.anInt2876 = 1;
			return;
		}
		Static73.anInt1794 = 0;
		local7 = true;
		@Pc(113) int local113;
		@Pc(123) int local123;
		for (@Pc(94) int local94 = 0; local94 < Static18.aByteArrayArray1.length; local94++) {
			@Pc(100) byte[] local100 = Static58.aByteArrayArray4[local94];
			if (local100 != null) {
				local113 = (Static127.anIntArray257[local94] >> 8) * 64 - Static2.anInt66;
				local123 = (Static127.anIntArray257[local94] & 0xFF) * 64 - Static176.anInt4061;
				if (Static29.aBoolean31) {
					local113 = 10;
					local123 = 10;
				}
				local7 &= Static131.method2043(local123, local113, local100);
			}
		}
		if (!local7) {
			Static123.anInt2876 = 2;
			return;
		}
		if (Static123.anInt2876 != 0) {
			Static59.method978(true, Static58.method956(new Class6[] { Static117.aClass6_801, Static137.aClass6_932 }));
		}
		Static58.method957();
		Static135.method2097();
		Static58.method957();
		Static30.aClass44_1.method1246();
		Static58.method957();
		System.gc();
		for (@Pc(181) int local181 = 0; local181 < 4; local181++) {
			Static51.aClass48Array1[local181].method1484();
		}
		for (local113 = 0; local113 < 4; local113++) {
			for (local123 = 0; local123 < 104; local123++) {
				for (@Pc(204) int local204 = 0; local204 < 104; local204++) {
					Static164.aByteArrayArrayArray7[local113][local123][local204] = 0;
				}
			}
		}
		Static58.method957();
		Static116.method1864();
		local123 = Static18.aByteArrayArray1.length;
		Static5.method56();
		Static124.method1930(true);
		@Pc(252) int local252;
		@Pc(275) int local275;
		@Pc(264) int local264;
		@Pc(391) int local391;
		@Pc(337) int local337;
		@Pc(380) int local380;
		if (!Static29.aBoolean31) {
			@Pc(279) byte[] local279;
			for (local252 = 0; local252 < local123; local252++) {
				local264 = (Static127.anIntArray257[local252] & 0xFF) * 64 - Static176.anInt4061;
				local275 = (Static127.anIntArray257[local252] >> 8) * 64 - Static2.anInt66;
				local279 = Static18.aByteArrayArray1[local252];
				if (local279 != null) {
					Static58.method957();
					Static169.method2688(Static51.aClass48Array1, (Static104.anInt2541 - 6) * 8, (Static143.anInt3376 - 6) * 8, local264, local275, local279);
				}
			}
			for (local275 = 0; local275 < local123; local275++) {
				local264 = (Static127.anIntArray257[local275] >> 8) * 64 - Static2.anInt66;
				@Pc(326) byte[] local326 = Static18.aByteArrayArray1[local275];
				local337 = (Static127.anIntArray257[local275] & 0xFF) * 64 - Static176.anInt4061;
				if (local326 == null && Static104.anInt2541 < 800) {
					Static58.method957();
					Static85.method1459(64, local264, 64, local337);
				}
			}
			Static124.method1930(true);
			for (local264 = 0; local264 < local123; local264++) {
				local279 = Static58.aByteArrayArray4[local264];
				if (local279 != null) {
					local380 = (Static127.anIntArray257[local264] >> 8) * 64 - Static2.anInt66;
					local391 = (Static127.anIntArray257[local264] & 0xFF) * 64 - Static176.anInt4061;
					Static58.method957();
					Static148.method2278(Static30.aClass44_1, local391, local380, local279, Static51.aClass48Array1);
				}
			}
		}
		@Pc(450) int local450;
		@Pc(456) int local456;
		if (Static29.aBoolean31) {
			@Pc(462) int local462;
			@Pc(472) int local472;
			@Pc(474) int local474;
			for (local252 = 0; local252 < 4; local252++) {
				Static58.method957();
				for (local275 = 0; local275 < 13; local275++) {
					for (local264 = 0; local264 < 13; local264++) {
						@Pc(426) boolean local426 = false;
						local380 = Static42.anIntArrayArrayArray1[local252][local275][local264];
						if (local380 != -1) {
							local391 = local380 >> 24 & 0x3;
							local450 = local380 >> 1 & 0x3;
							local456 = local380 >> 14 & 0x3FF;
							local462 = local380 >> 3 & 0x7FF;
							local472 = (local456 / 8 << 8) + local462 / 8;
							for (local474 = 0; local474 < Static127.anIntArray257.length; local474++) {
								if (Static127.anIntArray257[local474] == local472 && Static18.aByteArrayArray1[local474] != null) {
									Static179.method2803((local456 & 0x7) * 8, Static18.aByteArrayArray1[local474], local450, local275 * 8, local252, Static51.aClass48Array1, local264 * 8, (local462 & 0x7) * 8, local391);
									local426 = true;
									break;
								}
							}
						}
						if (!local426) {
							Static43.method841(local275 * 8, local264 * 8, local252);
						}
					}
				}
			}
			for (local275 = 0; local275 < 13; local275++) {
				for (local264 = 0; local264 < 13; local264++) {
					local337 = Static42.anIntArrayArrayArray1[0][local275][local264];
					if (local337 == -1) {
						Static85.method1459(8, local275 * 8, 8, local264 * 8);
					}
				}
			}
			Static124.method1930(true);
			for (local264 = 0; local264 < 4; local264++) {
				Static58.method957();
				for (local337 = 0; local337 < 13; local337++) {
					for (local380 = 0; local380 < 13; local380++) {
						local391 = Static42.anIntArrayArrayArray1[local264][local337][local380];
						if (local391 != -1) {
							local450 = local391 >> 24 & 0x3;
							local456 = local391 >> 1 & 0x3;
							local462 = local391 >> 14 & 0x3FF;
							local472 = local391 >> 3 & 0x7FF;
							local474 = local472 / 8 + (local462 / 8 << 8);
							for (@Pc(650) int local650 = 0; local650 < Static127.anIntArray257.length; local650++) {
								if (local474 == Static127.anIntArray257[local650] && Static58.aByteArrayArray4[local650] != null) {
									Static23.method397(Static30.aClass44_1, Static51.aClass48Array1, local456, local337 * 8, (local462 & 0x7) * 8, (local472 & 0x7) * 8, Static58.aByteArrayArray4[local650], local450, local380 * 8, local264);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static124.method1930(true);
		Static135.method2097();
		Static58.method957();
		Static21.method377(Static30.aClass44_1, Static51.aClass48Array1);
		Static124.method1930(true);
		local252 = Static148.anInt3458;
		if (local252 > Static36.anInt1020) {
			local252 = Static36.anInt1020;
		}
		if (Static36.anInt1020 - 1 > local252) {
		}
		if (Static113.aBoolean112) {
			Static30.aClass44_1.method1244(Static148.anInt3458);
		} else {
			Static30.aClass44_1.method1244(0);
		}
		for (local275 = 0; local275 < 104; local275++) {
			for (local264 = 0; local264 < 104; local264++) {
				Static117.method1873(local264, local275);
			}
		}
		Static58.method957();
		Static73.method1146();
		Static135.method2097();
		if (Static24.aFrame1 != null) {
			Static66.aClass2_Sub13_Sub1_2.method1455(113);
			Static66.aClass2_Sub13_Sub1_2.method1421(1057001181);
		}
		if (!Static29.aBoolean31) {
			local337 = (Static143.anInt3376 + 6) / 8;
			local264 = (Static143.anInt3376 - 6) / 8;
			local380 = (Static104.anInt2541 - 6) / 8;
			local391 = (Static104.anInt2541 + 6) / 8;
			for (local450 = local264 - 1; local450 <= local337 + 1; local450++) {
				for (local456 = local380 - 1; local456 <= local391 + 1; local456++) {
					if (local450 < local264 || local450 > local337 || local456 < local380 || local456 > local391) {
						Static165.aClass10_Sub1_17.method1585(Static58.method956(new Class6[] { Static41.aClass6_328, Static106.method2806(local450), Static108.aClass6_742, Static106.method2806(local456) }));
						Static165.aClass10_Sub1_17.method1585(Static58.method956(new Class6[] { Static63.aClass6_456, Static106.method2806(local450), Static108.aClass6_742, Static106.method2806(local456) }));
					}
				}
			}
		}
		Static98.method1607(30);
		Static58.method957();
		Static173.method2729();
		Static66.aClass2_Sub13_Sub1_2.method1455(254);
		Static34.method620();
	}
}
