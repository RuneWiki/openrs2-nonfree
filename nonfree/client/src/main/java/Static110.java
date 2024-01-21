import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!oa", name = "Jb", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_16;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1217 = Static146.method2172("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "Lclient!ua;")
	public static Class82 aClass82_49 = new Class82(64);

	@OriginalMember(owner = "client!oa", name = "Ab", descriptor = "I")
	public static int anInt3442 = 0;

	@OriginalMember(owner = "client!oa", name = "Bb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1218 = Static146.method2172("Could not complete login)3");

	@OriginalMember(owner = "client!oa", name = "Gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1219 = Static146.method2172("Fertigkeit)2");

	@OriginalMember(owner = "client!oa", name = "Lb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1222 = Static146.method2172("wave:");

	@OriginalMember(owner = "client!oa", name = "Hb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1220 = aClass77_1222;

	@OriginalMember(owner = "client!oa", name = "Ib", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1221 = aClass77_1218;

	@OriginalMember(owner = "client!oa", name = "Mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1223 = aClass77_1222;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)V")
	public static void method2347(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static44.aBooleanArray5[arg0]) {
			return;
		}
		Static19.aClass43_6.method2218(arg0);
		if (Static125.aClass66ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(24) boolean local24 = true;
		for (@Pc(26) int local26 = 0; local26 < Static125.aClass66ArrayArray1[arg0].length; local26++) {
			if (Static125.aClass66ArrayArray1[arg0][local26] != null) {
				if (Static125.aClass66ArrayArray1[arg0][local26].anInt3230 == 2) {
					local24 = false;
				} else {
					Static125.aClass66ArrayArray1[arg0][local26] = null;
				}
			}
		}
		if (local24) {
			Static125.aClass66ArrayArray1[arg0] = null;
		}
		Static44.aBooleanArray5[arg0] = false;
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "(I)V")
	public static void method2362() {
		aClass77_1220 = null;
		aClass77_1217 = null;
		aClass77_1222 = null;
		aClass77_1218 = null;
		aClass43_Sub1_16 = null;
		aClass82_49 = null;
		aClass77_1221 = null;
		aClass77_1223 = null;
		aClass77_1219 = null;
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "(I)V")
	public static void method2368() {
		Static51.method964(false);
		Static16.anInt510 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static117.aByteArrayArray7.length; local14++) {
			if (Static111.anIntArray427[local14] != -1 && Static117.aByteArrayArray7[local14] == null) {
				Static117.aByteArrayArray7[local14] = Static120.aClass43_Sub1_6.method2205(0, Static111.anIntArray427[local14]);
				if (Static117.aByteArrayArray7[local14] == null) {
					local12 = false;
					Static16.anInt510++;
				}
			}
			if (Static159.anIntArray570[local14] != -1 && Static51.aByteArrayArray1[local14] == null) {
				Static51.aByteArrayArray1[local14] = Static120.aClass43_Sub1_6.method2219(Static159.anIntArray570[local14], Static37.anIntArrayArray9[local14], 0);
				if (Static51.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static16.anInt510++;
				}
			}
		}
		if (!local12) {
			Static72.anInt1931 = 1;
			return;
		}
		local12 = true;
		Static124.anInt3043 = 0;
		@Pc(118) int local118;
		@Pc(129) int local129;
		for (@Pc(99) int local99 = 0; local99 < Static117.aByteArrayArray7.length; local99++) {
			@Pc(105) byte[] local105 = Static51.aByteArrayArray1[local99];
			if (local105 != null) {
				local118 = (Static60.anIntArray250[local99] >> 8) * 64 - Static157.anInt3889;
				local129 = (Static60.anIntArray250[local99] & 0xFF) * 64 - Static168.anInt4143;
				if (Static158.aBoolean162) {
					local129 = 10;
					local118 = 10;
				}
				local12 &= Static152.method2594(local105, local118, local129);
			}
		}
		if (!local12) {
			Static72.anInt1931 = 2;
			return;
		}
		if (Static72.anInt1931 != 0) {
			Static91.method1669(Static146.method2168(new Class77[] { Static131.aClass77_1491, Static128.aClass77_1149 }), true);
		}
		Static34.method700();
		Static123.method2157();
		Static34.method700();
		Static172.aClass60_1.method2088();
		Static34.method700();
		System.gc();
		for (@Pc(187) int local187 = 0; local187 < 4; local187++) {
			Static27.aClass86Array1[local187].method2811();
		}
		@Pc(212) int local212;
		for (local118 = 0; local118 < 4; local118++) {
			for (local129 = 0; local129 < 104; local129++) {
				for (local212 = 0; local212 < 104; local212++) {
					Static140.aByteArrayArrayArray6[local118][local129][local212] = 0;
				}
			}
		}
		Static34.method700();
		Static111.method1992();
		local129 = Static117.aByteArrayArray7.length;
		Static25.method521();
		Static51.method964(true);
		@Pc(267) int local267;
		@Pc(282) int local282;
		@Pc(395) int local395;
		@Pc(324) int local324;
		@Pc(384) int local384;
		if (!Static158.aBoolean162) {
			@Pc(271) byte[] local271;
			for (local212 = 0; local212 < local129; local212++) {
				local267 = (Static60.anIntArray250[local212] >> 8) * 64 - Static157.anInt3889;
				local271 = Static117.aByteArrayArray7[local212];
				local282 = (Static60.anIntArray250[local212] & 0xFF) * 64 - Static168.anInt4143;
				if (local271 != null) {
					Static34.method700();
					Static171.method2867(Static82.anInt2149 * 8 - 48, local282, Static27.aClass86Array1, local271, local267, Static6.anInt181 * 8 - 48);
				}
			}
			for (local267 = 0; local267 < local129; local267++) {
				local324 = (Static60.anIntArray250[local267] & 0xFF) * 64 - Static168.anInt4143;
				local282 = (Static60.anIntArray250[local267] >> 8) * 64 - Static157.anInt3889;
				@Pc(339) byte[] local339 = Static117.aByteArrayArray7[local267];
				if (local339 == null && Static82.anInt2149 < 800) {
					Static34.method700();
					Static156.method2670(64, local324, 64, local282);
				}
			}
			Static51.method964(true);
			for (local282 = 0; local282 < local129; local282++) {
				local271 = Static51.aByteArrayArray1[local282];
				if (local271 != null) {
					local384 = (Static60.anIntArray250[local282] >> 8) * 64 - Static157.anInt3889;
					local395 = (Static60.anIntArray250[local282] & 0xFF) * 64 - Static168.anInt4143;
					Static34.method700();
					Static132.method2253(Static172.aClass60_1, local384, local395, local271, Static27.aClass86Array1);
				}
			}
		}
		@Pc(450) int local450;
		@Pc(456) int local456;
		if (Static158.aBoolean162) {
			@Pc(462) int local462;
			@Pc(472) int local472;
			@Pc(474) int local474;
			for (local212 = 0; local212 < 4; local212++) {
				Static34.method700();
				for (local267 = 0; local267 < 13; local267++) {
					for (local282 = 0; local282 < 13; local282++) {
						@Pc(426) boolean local426 = false;
						local384 = Static181.anIntArrayArrayArray9[local212][local267][local282];
						if (local384 != -1) {
							local395 = local384 >> 24 & 0x3;
							local450 = local384 >> 1 & 0x3;
							local456 = local384 >> 14 & 0x3FF;
							local462 = local384 >> 3 & 0x7FF;
							local472 = (local456 / 8 << 8) + local462 / 8;
							for (local474 = 0; local474 < Static60.anIntArray250.length; local474++) {
								if (Static60.anIntArray250[local474] == local472 && Static117.aByteArrayArray7[local474] != null) {
									local426 = true;
									Static57.method2990(local395, local267 * 8, Static117.aByteArrayArray7[local474], local212, local450, (local456 & 0x7) * 8, Static27.aClass86Array1, (local462 & 0x7) * 8, local282 * 8);
									break;
								}
							}
						}
						if (!local426) {
							Static96.method1756(local282 * 8, local212, local267 * 8);
						}
					}
				}
			}
			for (local267 = 0; local267 < 13; local267++) {
				for (local282 = 0; local282 < 13; local282++) {
					local324 = Static181.anIntArrayArrayArray9[0][local267][local282];
					if (local324 == -1) {
						Static156.method2670(8, local282 * 8, 8, local267 * 8);
					}
				}
			}
			Static51.method964(true);
			for (local282 = 0; local282 < 4; local282++) {
				Static34.method700();
				for (local324 = 0; local324 < 13; local324++) {
					for (local384 = 0; local384 < 13; local384++) {
						local395 = Static181.anIntArrayArrayArray9[local282][local324][local384];
						if (local395 != -1) {
							local450 = local395 >> 24 & 0x3;
							local456 = local395 >> 1 & 0x3;
							local462 = local395 >> 14 & 0x3FF;
							local472 = local395 >> 3 & 0x7FF;
							local474 = (local462 / 8 << 8) + (local472 / 8);
							for (@Pc(659) int local659 = 0; local659 < Static60.anIntArray250.length; local659++) {
								if (Static60.anIntArray250[local659] == local474 && Static51.aByteArrayArray1[local659] != null) {
									Static85.method1559(local456, local324 * 8, local384 * 8, local282, (local472 & 0x7) * 8, local450, (local462 & 0x7) * 8, Static51.aByteArrayArray1[local659], Static172.aClass60_1, Static27.aClass86Array1);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static51.method964(true);
		Static123.method2157();
		Static34.method700();
		Static126.method1619(Static27.aClass86Array1, Static172.aClass60_1);
		Static51.method964(true);
		local212 = Static118.anInt2928;
		if (Static54.anInt1472 < local212) {
			local212 = Static54.anInt1472;
		}
		if (Static54.anInt1472 - 1 > local212) {
		}
		if (Static92.aBoolean101) {
			Static172.aClass60_1.method2054(Static118.anInt2928);
		} else {
			Static172.aClass60_1.method2054(0);
		}
		for (local267 = 0; local267 < 104; local267++) {
			for (local282 = 0; local282 < 104; local282++) {
				Static181.method3022(local267, local282);
			}
		}
		Static34.method700();
		Static148.method2501();
		Static123.method2157();
		if (Static145.aFrame1 != null) {
			Static124.aClass2_Sub18_Sub1_3.method2398(217);
			Static124.aClass2_Sub18_Sub1_3.method2370(1057001181);
		}
		if (!Static158.aBoolean162) {
			local324 = (Static6.anInt181 + 6) / 8;
			local395 = (Static82.anInt2149 + 6) / 8;
			local384 = (Static82.anInt2149 - 6) / 8;
			local282 = (Static6.anInt181 - 6) / 8;
			for (local450 = local282 - 1; local450 <= local324 + 1; local450++) {
				for (local456 = local384 - 1; local456 <= local395 + 1; local456++) {
					if (local450 < local282 || local450 > local324 || local456 < local384 || local456 > local395) {
						Static120.aClass43_Sub1_6.method2203(Static146.method2168(new Class77[] { Static98.aClass77_962, Static2.method61(local450), Static118.aClass77_1096, Static2.method61(local456) }));
						Static120.aClass43_Sub1_6.method2203(Static146.method2168(new Class77[] { Static58.aClass77_602, Static2.method61(local450), Static118.aClass77_1096, Static2.method61(local456) }));
					}
				}
			}
		}
		Static123.method2155(30);
		Static34.method700();
		Static87.method1611();
		Static124.aClass2_Sub18_Sub1_3.method2398(197);
		Static99.method1792();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!ma;Ljava/awt/Component;II)Lclient!ud;")
	public static Class19 method2391(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (Static63.anInt1680 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class19 local36 = (Class19) Class.forName("Class19_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray207 = new int[(Static46.aBoolean62 ? 2 : 1) * 256];
			local36.anInt1264 = arg0;
			local36.method893(arg2);
			local36.anInt1265 = (arg0 & 0xFFFFFC00) + 1024;
			if (local36.anInt1265 > 16384) {
				local36.anInt1265 = 16384;
			}
			local36.method885(local36.anInt1265);
			if (Static57.anInt4556 > 0 && Static174.aClass12_1 == null) {
				Static174.aClass12_1 = new Class12();
				Static174.aClass12_1.aClass50_1 = arg1;
				arg1.method1748(Static174.aClass12_1, Static57.anInt4556);
			}
			if (Static174.aClass12_1 != null) {
				if (Static174.aClass12_1.aClass19Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static174.aClass12_1.aClass19Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(116) Throwable local116) {
			try {
				@Pc(122) Class19_Sub1 local122 = new Class19_Sub1(arg1, arg3);
				local122.anIntArray207 = new int[(Static46.aBoolean62 ? 2 : 1) * 256];
				local122.anInt1264 = arg0;
				local122.method893(arg2);
				local122.anInt1265 = 16384;
				local122.method885(local122.anInt1265);
				if (Static57.anInt4556 > 0 && Static174.aClass12_1 == null) {
					Static174.aClass12_1 = new Class12();
					Static174.aClass12_1.aClass50_1 = arg1;
					arg1.method1748(Static174.aClass12_1, Static57.anInt4556);
				}
				if (Static174.aClass12_1 != null) {
					if (Static174.aClass12_1.aClass19Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static174.aClass12_1.aClass19Array1[arg3] = local122;
				}
				return local122;
			} catch (@Pc(184) Throwable local184) {
				return new Class19();
			}
		}
	}
}
