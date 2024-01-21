import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Z")
	public static boolean aBoolean49;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "J")
	public static long aLong31;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!ta;")
	public static Class14 aClass14_9;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!kc;")
	private static Class36 aClass36_480 = Static14.method2017("This world is full)3");

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "Lclient!kc;")
	public static Class36 aClass36_477 = aClass36_480;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "[Lclient!qc;")
	public static Class2_Sub1_Sub4_Sub2_Sub2[] aClass2_Sub1_Sub4_Sub2_Sub2Array1 = new Class2_Sub1_Sub4_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public static int anInt914 = -1;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!kc;")
	private static Class36 aClass36_478 = Static14.method2017("Too many connections from your address)3");

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!kc;")
	public static Class36 aClass36_479 = Static14.method2017(" ");

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!gd;")
	public static Class22 aClass22_9 = new Class22(100);

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!kc;")
	public static Class36 aClass36_481 = Static14.method2017("(U");

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_482 = aClass36_478;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method710() {
		method715(false);
		@Pc(6) boolean local6 = true;
		Static48.anInt1265 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static15.aByteArrayArray7.length; local14++) {
			if (Static26.anIntArray58[local14] != -1 && Static15.aByteArrayArray7[local14] == null) {
				Static15.aByteArrayArray7[local14] = Static110.aClass3_Sub1_13.method928(0, Static26.anIntArray58[local14]);
				if (Static15.aByteArrayArray7[local14] == null) {
					Static48.anInt1265++;
					local6 = false;
				}
			}
			if (Static36.anIntArray131[local14] != -1 && Static33.aByteArrayArray9[local14] == null) {
				Static33.aByteArrayArray9[local14] = Static110.aClass3_Sub1_13.method933(0, Static36.anIntArray131[local14], Static83.anIntArrayArray25[local14]);
				if (Static33.aByteArrayArray9[local14] == null) {
					local6 = false;
					Static48.anInt1265++;
				}
			}
		}
		if (!local6) {
			Static111.anInt2890 = 1;
			return;
		}
		local6 = true;
		Static101.anInt2667 = 0;
		@Pc(113) int local113;
		@Pc(123) int local123;
		for (@Pc(94) int local94 = 0; local94 < Static15.aByteArrayArray7.length; local94++) {
			@Pc(100) byte[] local100 = Static33.aByteArrayArray9[local94];
			if (local100 != null) {
				local113 = (Static20.anIntArray32[local94] >> 8) * 64 - Static25.anInt632;
				local123 = (Static20.anIntArray32[local94] & 0xFF) * 64 - Static23.anInt592;
				if (Static108.aBoolean130) {
					local113 = 10;
					local123 = 10;
				}
				local6 &= Static65.method1154(local113, local100, local123);
			}
		}
		if (!local6) {
			Static111.anInt2890 = 2;
			return;
		}
		if (Static111.anInt2890 != 0) {
			Static89.method1643(true, Static100.aClass36_1274, Static14.aClass36_1421);
		}
		Static15.method273();
		Static85.aClass61_1.method1703();
		System.gc();
		for (@Pc(161) int local161 = 0; local161 < 4; local161++) {
			Static11.aClass4Array1[local161].method129();
		}
		@Pc(184) int local184;
		for (local113 = 0; local113 < 4; local113++) {
			for (local123 = 0; local123 < 104; local123++) {
				for (local184 = 0; local184 < 104; local184++) {
					Static16.aByteArrayArrayArray3[local113][local123][local184] = 0;
				}
			}
		}
		Static113.method2048();
		local123 = Static15.aByteArrayArray7.length;
		Static107.method1943();
		method715(true);
		@Pc(250) int local250;
		@Pc(239) int local239;
		@Pc(357) int local357;
		@Pc(301) int local301;
		@Pc(346) int local346;
		if (!Static108.aBoolean130) {
			@Pc(228) byte[] local228;
			for (local184 = 0; local184 < local123; local184++) {
				local228 = Static15.aByteArrayArray7[local184];
				local239 = (Static20.anIntArray32[local184] & 0xFF) * 64 - Static23.anInt592;
				local250 = (Static20.anIntArray32[local184] >> 8) * 64 - Static25.anInt632;
				if (local228 != null) {
					Static57.method1052((Static71.anInt1804 - 6) * 8, Static11.aClass4Array1, local239, local228, Static22.anInt578 * 8 - 48, local250);
				}
			}
			for (local250 = 0; local250 < local123; local250++) {
				local239 = (Static20.anIntArray32[local250] >> 8) * 64 - Static25.anInt632;
				local301 = (Static20.anIntArray32[local250] & 0xFF) * 64 - Static23.anInt592;
				@Pc(305) byte[] local305 = Static15.aByteArrayArray7[local250];
				if (local305 == null && Static71.anInt1804 < 800) {
					Static94.method1758(64, 64, local301, local239);
				}
			}
			method715(true);
			for (local239 = 0; local239 < local123; local239++) {
				local228 = Static33.aByteArrayArray9[local239];
				if (local228 != null) {
					local346 = (Static20.anIntArray32[local239] >> 8) * 64 - Static25.anInt632;
					local357 = (Static20.anIntArray32[local239] & 0xFF) * 64 - Static23.anInt592;
					Static84.method1521(Static11.aClass4Array1, local228, local357, local346, Static85.aClass61_1);
				}
			}
		}
		@Pc(412) int local412;
		@Pc(418) int local418;
		if (Static108.aBoolean130) {
			@Pc(424) int local424;
			@Pc(434) int local434;
			@Pc(436) int local436;
			for (local184 = 0; local184 < 4; local184++) {
				for (local250 = 0; local250 < 13; local250++) {
					for (local239 = 0; local239 < 13; local239++) {
						@Pc(388) boolean local388 = false;
						local346 = Static51.anIntArrayArrayArray9[local184][local250][local239];
						if (local346 != -1) {
							local357 = local346 >> 24 & 0x3;
							local412 = local346 >> 1 & 0x3;
							local418 = local346 >> 14 & 0x3FF;
							local424 = local346 >> 3 & 0x7FF;
							local434 = local424 / 8 + (local418 / 8 << 8);
							for (local436 = 0; local436 < Static20.anIntArray32.length; local436++) {
								if (local434 == Static20.anIntArray32[local436] && Static15.aByteArrayArray7[local436] != null) {
									local388 = true;
									Static60.method1108((local418 & 0x7) * 8, (local424 & 0x7) * 8, local184, Static15.aByteArrayArray7[local436], Static11.aClass4Array1, local412, local357, local250 * 8, local239 * 8);
									break;
								}
							}
						}
						if (!local388) {
							Static84.method1522(local184, local250 * 8, local239 * 8);
						}
					}
				}
			}
			for (local250 = 0; local250 < 13; local250++) {
				for (local239 = 0; local239 < 13; local239++) {
					local301 = Static51.anIntArrayArrayArray9[0][local250][local239];
					if (local301 == -1) {
						Static94.method1758(8, 8, local239 * 8, local250 * 8);
					}
				}
			}
			method715(true);
			for (local239 = 0; local239 < 4; local239++) {
				for (local301 = 0; local301 < 13; local301++) {
					for (local346 = 0; local346 < 13; local346++) {
						local357 = Static51.anIntArrayArrayArray9[local239][local301][local346];
						if (local357 != -1) {
							local412 = local357 >> 24 & 0x3;
							local418 = local357 >> 1 & 0x3;
							local424 = local357 >> 14 & 0x3FF;
							local434 = local357 >> 3 & 0x7FF;
							local436 = local434 / 8 + (local424 / 8 << 8);
							for (@Pc(614) int local614 = 0; local614 < Static20.anIntArray32.length; local614++) {
								if (local436 == Static20.anIntArray32[local614] && Static33.aByteArrayArray9[local614] != null) {
									Static88.method1636(Static11.aClass4Array1, (local434 & 0x7) * 8, local418, local346 * 8, local239, local301 * 8, local412, (local424 & 0x7) * 8, Static85.aClass61_1, Static33.aByteArrayArray9[local614]);
									break;
								}
							}
						}
					}
				}
			}
		}
		method715(true);
		Static15.method273();
		Static63.method1122(Static11.aClass4Array1, Static85.aClass61_1);
		method715(true);
		local184 = Static53.anInt1481;
		if (local184 > Static92.anInt2412) {
			local184 = Static92.anInt2412;
		}
		if (Static92.anInt2412 - 1 > local184) {
		}
		if (Static35.aBoolean51) {
			Static85.aClass61_1.method1739(Static53.anInt1481);
		} else {
			Static85.aClass61_1.method1739(0);
		}
		for (local250 = 0; local250 < 104; local250++) {
			for (local239 = 0; local239 < 104; local239++) {
				Static66.method1156(local239, local250);
			}
		}
		Static2.method2069();
		Static55.aClass22_37.method716();
		if (Static13.aFrame2 != null) {
			Static42.aClass2_Sub12_Sub1_1.method1422(226);
			Static42.aClass2_Sub12_Sub1_1.method1394(1057001181);
		}
		if (!Static108.aBoolean130) {
			local239 = (Static22.anInt578 - 6) / 8;
			local301 = (Static22.anInt578 + 6) / 8;
			local346 = (Static71.anInt1804 - 6) / 8;
			local357 = (Static71.anInt1804 + 6) / 8;
			for (local412 = local239 - 1; local412 <= local301 + 1; local412++) {
				for (local418 = local346 - 1; local418 <= local357 + 1; local418++) {
					if (local412 < local239 || local412 > local301 || local418 < local346 || local418 > local357) {
						Static110.aClass3_Sub1_13.method927(Static49.method949(new Class36[] { Static106.aClass36_1336, Static57.method1055(local412), Static113.aClass36_1448, Static57.method1055(local418) }));
						Static110.aClass3_Sub1_13.method927(Static49.method949(new Class36[] { Static56.aClass36_708, Static57.method1055(local412), Static113.aClass36_1448, Static57.method1055(local418) }));
					}
				}
			}
		}
		if (Static46.anInt1229 == -1) {
			Static104.method1914(30);
		} else {
			Static104.method1914(35);
		}
		Static85.method1557();
		Static42.aClass2_Sub12_Sub1_1.method1422(230);
		Static83.method1506();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method714() {
		aClass36_478 = null;
		aClass36_477 = null;
		aClass36_481 = null;
		aClass2_Sub1_Sub4_Sub2_Sub2Array1 = null;
		aClass22_9 = null;
		aClass36_479 = null;
		aClass14_9 = null;
		aClass36_480 = null;
		aClass36_482 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZ)V")
	private static void method715(@OriginalArg(1) boolean arg0) {
		Static71.anInt1810++;
		if (Static71.anInt1810 < 50 && !arg0) {
			return;
		}
		Static71.anInt1810 = 0;
		if (Static69.aBoolean76 || Static57.aClass51_3 == null) {
			return;
		}
		Static42.aClass2_Sub12_Sub1_1.method1422(99);
		try {
			Static57.aClass51_3.method1486(Static42.aClass2_Sub12_Sub1_1.anInt1939, Static42.aClass2_Sub12_Sub1_1.aByteArray20);
			Static42.aClass2_Sub12_Sub1_1.anInt1939 = 0;
		} catch (@Pc(47) IOException local47) {
			Static69.aBoolean76 = true;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIILclient!kc;ILclient!kc;B)V")
	public static void method717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class36 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class36 arg5) {
		if (Static43.anInt1141 >= 500) {
			return;
		}
		if (arg3.method1028() <= 0) {
			Static90.aClass36Array40[Static43.anInt1141] = arg5;
		} else {
			Static90.aClass36Array40[Static43.anInt1141] = Static49.method949(new Class36[] { arg5, Static89.aClass36_1084, arg3 });
		}
		Static55.anIntArray329[Static43.anInt1141] = arg0;
		Static22.anIntArray38[Static43.anInt1141] = arg4;
		Static57.anIntArray187[Static43.anInt1141] = arg2;
		Static51.anIntArray317[Static43.anInt1141] = arg1;
		Static43.anInt1141++;
	}
}
