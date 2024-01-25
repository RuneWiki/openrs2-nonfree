import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	public static int anInt5499;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
	public static int anInt5502;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_70 = new Class84("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_93 = new Class237(109, 3);

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_71 = new Class84("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)V")
	public static void method4395() {
		Static148.method2226(false);
		Static295.anInt5212 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static264.aByteArrayArray90.length; local14++) {
			if (Static86.anIntArray149[local14] != -1 && Static264.aByteArrayArray90[local14] == null) {
				Static264.aByteArrayArray90[local14] = Static88.aClass250_19.method5667(0, Static86.anIntArray149[local14]);
				if (Static264.aByteArrayArray90[local14] == null) {
					local12 = false;
					Static295.anInt5212++;
				}
			}
			if (Static337.anIntArray642[local14] != -1 && Static209.aByteArrayArray149[local14] == null) {
				Static209.aByteArrayArray149[local14] = Static88.aClass250_19.method5655(Static337.anIntArray642[local14], Static303.anIntArrayArray151[local14], 0);
				if (Static209.aByteArrayArray149[local14] == null) {
					local12 = false;
					Static295.anInt5212++;
				}
			}
			if (Static231.anIntArray336[local14] != -1 && Static68.aByteArrayArray29[local14] == null) {
				Static68.aByteArrayArray29[local14] = Static88.aClass250_19.method5667(0, Static231.anIntArray336[local14]);
				if (Static68.aByteArrayArray29[local14] == null) {
					Static295.anInt5212++;
					local12 = false;
				}
			}
			if (Static442.anIntArray407[local14] != -1 && Static14.aByteArrayArray9[local14] == null) {
				Static14.aByteArrayArray9[local14] = Static88.aClass250_19.method5667(0, Static442.anIntArray407[local14]);
				if (Static14.aByteArrayArray9[local14] == null) {
					Static295.anInt5212++;
					local12 = false;
				}
			}
			if (Static208.anIntArray319 != null && Static25.aByteArrayArray15[local14] == null && Static208.anIntArray319[local14] != -1) {
				Static25.aByteArrayArray15[local14] = Static88.aClass250_19.method5655(Static208.anIntArray319[local14], Static303.anIntArrayArray151[local14], 0);
				if (Static25.aByteArrayArray15[local14] == null) {
					local12 = false;
					Static295.anInt5212++;
				}
			}
		}
		if (Static208.aClass222_3 == null) {
			if (Static324.aClass1_Sub2_Sub12_3 == null || !Static243.aClass250_54.method5662(Static324.aClass1_Sub2_Sub12_3.aString22 + "_staticelements")) {
				Static208.aClass222_3 = new Class222(0);
			} else if (Static243.aClass250_54.method5656(Static324.aClass1_Sub2_Sub12_3.aString22 + "_staticelements")) {
				Static208.aClass222_3 = Static66.method1144(Static324.aClass1_Sub2_Sub12_3.aString22 + "_staticelements", Static429.aBoolean475, Static243.aClass250_54);
			} else {
				local12 = false;
				Static295.anInt5212++;
			}
		}
		if (!local12) {
			Static12.anInt324 = 1;
			return;
		}
		Static120.anInt2114 = 0;
		local12 = true;
		@Pc(265) int local265;
		@Pc(276) int local276;
		for (@Pc(246) int local246 = 0; local246 < Static264.aByteArrayArray90.length; local246++) {
			@Pc(252) byte[] local252 = Static209.aByteArrayArray149[local246];
			if (local252 != null) {
				local265 = (Static157.anIntArray255[local246] >> 8) * 64 - Static437.anInt7555;
				local276 = (Static157.anIntArray255[local246] & 0xFF) * 64 - anInt5502;
				if (Static12.anInt325 != 0) {
					local265 = 10;
					local276 = 10;
				}
				local12 &= Static147.method2218(local252, local276, local265, Static352.anInt6022, Static135.anInt2314);
			}
			local252 = Static14.aByteArrayArray9[local246];
			if (local252 != null) {
				local265 = (Static157.anIntArray255[local246] >> 8) * 64 - Static437.anInt7555;
				local276 = (Static157.anIntArray255[local246] & 0xFF) * 64 - anInt5502;
				if (Static12.anInt325 != 0) {
					local265 = 10;
					local276 = 10;
				}
				local12 &= Static147.method2218(local252, local276, local265, Static352.anInt6022, Static135.anInt2314);
			}
		}
		if (!local12) {
			Static12.anInt324 = 2;
			return;
		}
		if (Static12.anInt324 != 0) {
			Static289.method4079(Static372.aClass129_6, Static364.aClass84_84.method1678(Static167.anInt3118) + "<br>(100%)", true);
		}
		Static81.method1403();
		Static95.method1501();
		@Pc(386) boolean local386 = false;
		if (Static276.aClass109_10.method4721() && Static389.aClass128_Sub1_1.aBoolean246) {
			for (local265 = 0; local265 < Static264.aByteArrayArray90.length; local265++) {
				if (Static14.aByteArrayArray9[local265] != null || Static68.aByteArrayArray29[local265] != null) {
					local386 = true;
					break;
				}
			}
		}
		if (Static389.aClass128_Sub1_1.aBoolean229) {
			local265 = Static58.anIntArray82[Static215.anInt3917];
		} else {
			local265 = Static429.anIntArray641[Static215.anInt3917];
		}
		if (Static276.aClass109_10.method4712()) {
			local265++;
		}
		Static408.method5510(Static135.anInt2314, Static352.anInt6022, local265, local386, Static276.aClass109_10.method4755() > 0);
		for (local276 = 0; local276 < 4; local276++) {
			Static170.aClass112Array1[local276].method2686();
		}
		Static146.method2198();
		Static330.method4637(false);
		Static336.method4677();
		Static58.aClass154_1 = null;
		Static81.method1403();
		System.gc();
		Static148.method2226(true);
		Static351.method4852();
		Static348.anInt5978 = Static389.aClass128_Sub1_1.method2977(Static285.anInt7839);
		Static220.aBoolean274 = Static389.aClass128_Sub1_1.aBoolean246;
		Static131.aBoolean469 = Static113.anInt5764 >= 96;
		Static304.aBoolean347 = Static389.aClass128_Sub1_1.method2975(Static285.anInt7839);
		Static215.aBoolean271 = !Static389.aClass128_Sub1_1.aBoolean242;
		Static434.anInt7473 = Static389.aClass128_Sub1_1.method2984(Static285.anInt7839) ? -1 : Static424.anInt7348;
		Static342.aBoolean386 = Static285.anInt7839 == 1 || Static389.aClass128_Sub1_1.aBoolean230;
		Static37.aBoolean22 = Static389.aClass128_Sub1_1.aBoolean245;
		Static59.aClass155_Sub1_2 = new Class155_Sub1(4, Static135.anInt2314, Static352.anInt6022, false);
		if (Static12.anInt325 == 0) {
			Static256.method3766(Static264.aByteArrayArray90, Static59.aClass155_Sub1_2);
		} else {
			Static349.method1154(Static264.aByteArrayArray90, Static59.aClass155_Sub1_2);
		}
		Static269.method3934(Static352.anInt6022 >> 4, Static135.anInt2314 >> 4);
		Static83.method5719();
		if (local386) {
			Static126.method1875(true);
			Static44.aClass155_Sub1_1 = new Class155_Sub1(1, Static135.anInt2314, Static352.anInt6022, true);
			if (Static12.anInt325 == 0) {
				Static256.method3766(Static68.aByteArrayArray29, Static44.aClass155_Sub1_1);
				Static148.method2226(true);
			} else {
				Static349.method1154(Static68.aByteArrayArray29, Static44.aClass155_Sub1_1);
				Static148.method2226(true);
			}
			Static44.aClass155_Sub1_1.method3646(Static59.aClass155_Sub1_2.anIntArrayArrayArray12[0]);
			Static44.aClass155_Sub1_1.method3655(null, null, Static276.aClass109_10);
			Static126.method1875(false);
		}
		Static59.aClass155_Sub1_2.method3655(local386 ? Static44.aClass155_Sub1_1.anIntArrayArrayArray12 : null, Static170.aClass112Array1, Static276.aClass109_10);
		if (Static12.anInt325 == 0) {
			Static148.method2226(true);
			Static232.method3438(Static59.aClass155_Sub1_2, Static209.aByteArrayArray149);
			if (Static25.aByteArrayArray15 != null) {
				Static364.method5020();
			}
		} else {
			Static148.method2226(true);
			Static14.method307(Static209.aByteArrayArray149, Static59.aClass155_Sub1_2);
		}
		Static95.method1501();
		Static148.method2226(true);
		Static59.aClass155_Sub1_2.method3649(Static276.aClass109_10, local386 ? Static160.aClass136Array2[0] : null, null);
		Static59.aClass155_Sub1_2.method3661(Static276.aClass109_10);
		Static148.method2226(true);
		if (local386) {
			Static126.method1875(true);
			Static148.method2226(true);
			if (Static12.anInt325 == 0) {
				Static232.method3438(Static44.aClass155_Sub1_1, Static14.aByteArrayArray9);
			} else {
				Static14.method307(Static14.aByteArrayArray9, Static44.aClass155_Sub1_1);
			}
			Static95.method1501();
			Static148.method2226(true);
			Static44.aClass155_Sub1_1.method3649(Static276.aClass109_10, null, Static328.aClass136Array3[0]);
			Static44.aClass155_Sub1_1.method3661(Static276.aClass109_10);
			Static148.method2226(true);
			Static126.method1875(false);
		}
		Static407.method5501();
		@Pc(725) int local725 = Static59.aClass155_Sub1_2.anInt4456;
		if (Static152.anInt2600 < local725) {
			local725 = Static152.anInt2600;
		}
		if (local725 < Static152.anInt2600 - 1) {
			local725 = Static152.anInt2600 - 1;
		}
		if (Static389.aClass128_Sub1_1.method2984(Static285.anInt7839)) {
			Static47.method800(0);
		} else {
			Static47.method800(local725);
		}
		@Pc(756) int local756;
		@Pc(760) int local760;
		for (@Pc(752) int local752 = 0; local752 < 4; local752++) {
			for (local756 = 0; local756 < Static135.anInt2314; local756++) {
				for (local760 = 0; local760 < Static352.anInt6022; local760++) {
					Static377.method5162(local752, local756, local760);
				}
			}
		}
		Static109.method1679();
		Static81.method1403();
		Static232.method3439();
		Static95.method1501();
		Static47.aBoolean40 = false;
		Static131.method5613();
		if (Static97.aFrame1 != null && Static372.aClass161_6 != null && Static151.anInt2579 == 25) {
			Static55.method989(Static124.aClass131_68);
			Static232.aClass1_Sub1_Sub1_2.method4105(1057001181);
		}
		if (Static12.anInt325 == 0) {
			local756 = (Static13.anInt330 - (Static135.anInt2314 >> 4)) / 8;
			local760 = ((Static135.anInt2314 >> 4) + Static13.anInt330) / 8;
			@Pc(844) int local844 = (Static138.anInt2346 - (Static352.anInt6022 >> 4)) / 8;
			@Pc(852) int local852 = (Static138.anInt2346 + (Static352.anInt6022 >> 4)) / 8;
			for (@Pc(856) int local856 = local756 - 1; local856 <= local760 + 1; local856++) {
				for (@Pc(862) int local862 = local844 - 1; local862 <= local852 + 1; local862++) {
					if (local756 > local856 || local856 > local760 || local844 > local862 || local852 < local862) {
						Static88.aClass250_19.method5648("m" + local856 + "_" + local862);
						Static88.aClass250_19.method5648("l" + local856 + "_" + local862);
					}
				}
			}
		}
		if (Static151.anInt2579 == 28) {
			Static455.method4431(10);
		} else {
			Static455.method4431(30);
			if (Static372.aClass161_6 != null) {
				Static55.method989(Static361.aClass131_156);
			}
		}
		Static382.method5215();
		Static81.method1403();
		Static194.method2942();
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public static void method4396() {
		Static455.method4431(25);
		Static92.method1482();
		System.gc();
	}
}
