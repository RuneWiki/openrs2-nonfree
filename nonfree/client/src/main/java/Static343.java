import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "Lclient!im;")
	public static Class147 aClass147_3;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
	public static int anInt6094 = 0;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Lclient!jv;")
	public static final Class165 aClass165_14 = new Class165(1, 1);

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "[I")
	public static int[] anIntArray529 = new int[2];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Z")
	public static boolean method5176() {
		if (Static465.aBoolean538) {
			try {
				if ((Boolean) Static587.method3349(Static189.anApplet4, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(B)V")
	public static void method5178() {
		Static487.method6722();
		Static503.method848(Static480.aClass6_Sub37_Sub1_1.aBoolean397);
		Static29.aClass45_1 = Static573.method7835(22050, Static152.aClass57_4, Static34.aCanvas15, 0);
		Static29.aClass45_1.method6501(Static555.aClass6_Sub19_Sub4_8);
		Static194.aClass45_2 = Static573.method7835(2048, Static152.aClass57_4, Static34.aCanvas15, 1);
		Static194.aClass45_2.method6501(Static144.aClass6_Sub19_Sub3_2);
	}

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public static void method5179() {
		Static193.method2891(false);
		Static66.anInt1118 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static202.aByteArrayArray11.length; local14++) {
			if (Static268.anIntArray440[local14] != -1 && Static202.aByteArrayArray11[local14] == null) {
				Static202.aByteArrayArray11[local14] = Static285.aClass251_84.method5860(Static268.anIntArray440[local14], 0);
				if (Static202.aByteArrayArray11[local14] == null) {
					Static66.anInt1118++;
					local12 = false;
				}
			}
			if (Static193.anIntArray386[local14] != -1 && Static196.aByteArrayArray10[local14] == null) {
				Static196.aByteArrayArray10[local14] = Static285.aClass251_84.method5853(0, Static193.anIntArray386[local14], Static84.anIntArrayArray25[local14]);
				if (Static196.aByteArrayArray10[local14] == null) {
					Static66.anInt1118++;
					local12 = false;
				}
			}
			if (Static225.anIntArray414[local14] != -1 && Static491.aByteArrayArray24[local14] == null) {
				Static491.aByteArrayArray24[local14] = Static285.aClass251_84.method5860(Static225.anIntArray414[local14], 0);
				if (Static491.aByteArrayArray24[local14] == null) {
					Static66.anInt1118++;
					local12 = false;
				}
			}
			if (Static370.anIntArray541[local14] != -1 && Static340.aByteArrayArray20[local14] == null) {
				Static340.aByteArrayArray20[local14] = Static285.aClass251_84.method5860(Static370.anIntArray541[local14], 0);
				if (Static340.aByteArrayArray20[local14] == null) {
					Static66.anInt1118++;
					local12 = false;
				}
			}
			if (Static567.anIntArray719 != null && Static69.aByteArrayArray3[local14] == null && Static567.anIntArray719[local14] != -1) {
				Static69.aByteArrayArray3[local14] = Static285.aClass251_84.method5853(0, Static567.anIntArray719[local14], Static84.anIntArrayArray25[local14]);
				if (Static69.aByteArrayArray3[local14] == null) {
					Static66.anInt1118++;
					local12 = false;
				}
			}
		}
		if (Static517.aClass252_6 == null) {
			if (Static60.aClass6_Sub1_Sub9_1 == null || !Static30.aClass251_82.method5835(Static60.aClass6_Sub1_Sub9_1.aString47 + "_staticelements")) {
				Static517.aClass252_6 = new Class252(0);
			} else if (Static30.aClass251_82.method5856(Static60.aClass6_Sub1_Sub9_1.aString47 + "_staticelements")) {
				Static517.aClass252_6 = Static158.method2322(Static60.aClass6_Sub1_Sub9_1.aString47 + "_staticelements", Static296.aBoolean667, Static30.aClass251_82);
			} else {
				Static66.anInt1118++;
				local12 = false;
			}
		}
		if (!local12) {
			Static274.anInt3318 = 1;
			return;
		}
		Static235.anInt3967 = 0;
		local12 = true;
		@Pc(272) int local272;
		@Pc(283) int local283;
		for (@Pc(254) int local254 = 0; local254 < Static202.aByteArrayArray11.length; local254++) {
			@Pc(260) byte[] local260 = Static196.aByteArrayArray10[local254];
			if (local260 != null) {
				local272 = (Static35.anIntArray45[local254] >> 8) * 64 - Static218.anInt3718;
				local283 = (Static35.anIntArray45[local254] & 0xFF) * 64 - Static167.anInt3048;
				if (Static228.anInt3904 != 0) {
					local283 = 10;
					local272 = 10;
				}
				local12 &= Static293.method4104(Static473.anInt7969, local260, Static301.anInt4912, local283, local272);
			}
			local260 = Static340.aByteArrayArray20[local254];
			if (local260 != null) {
				local272 = (Static35.anIntArray45[local254] >> 8) * 64 - Static218.anInt3718;
				local283 = (Static35.anIntArray45[local254] & 0xFF) * 64 - Static167.anInt3048;
				if (Static228.anInt3904 != 0) {
					local272 = 10;
					local283 = 10;
				}
				local12 &= Static293.method4104(Static473.anInt7969, local260, Static301.anInt4912, local283, local272);
			}
		}
		if (!local12) {
			Static274.anInt3318 = 2;
			return;
		}
		if (Static274.anInt3318 != 0) {
			Static87.method1420(Static141.aClass104_11.method2145(Static470.anInt7957) + "<br>(100%)", Static85.aClass56_2, true);
		}
		Static11.method182();
		Static244.method3524();
		@Pc(384) boolean local384 = false;
		if (Static176.aClass121_5.method7159() && Static480.aClass6_Sub37_Sub1_1.aBoolean396) {
			for (local272 = 0; local272 < Static202.aByteArrayArray11.length; local272++) {
				if (Static340.aByteArrayArray20[local272] != null || Static491.aByteArrayArray24[local272] != null) {
					local384 = true;
					break;
				}
			}
		}
		if (Static480.aClass6_Sub37_Sub1_1.aBoolean406) {
			local272 = Static546.anIntArray692[Static63.anInt1007];
		} else {
			local272 = Static34.anIntArray579[Static63.anInt1007];
		}
		if (Static176.aClass121_5.method7131()) {
			local272++;
		}
		Static518.method2904(Static301.anInt4912, Static473.anInt7969, local272, local384, Static176.aClass121_5.method7085() > 0);
		for (local283 = 0; local283 < 4; local283++) {
			Static296.aClass295Array3[local283].method6550();
		}
		Static88.method1428();
		Static141.method2143(false);
		Static407.method5937();
		Static285.aClass89_1 = null;
		Static43.aBoolean28 = false;
		Static11.method182();
		System.gc();
		Static193.method2891(true);
		Static51.method682();
		Static397.anInt333 = Static480.aClass6_Sub37_Sub1_1.method5149(Static567.anInt9503);
		Static339.aBoolean395 = Static480.aClass6_Sub37_Sub1_1.aBoolean396;
		Static244.aBoolean262 = Static31.anInt551 >= 96;
		Static566.aBoolean664 = Static480.aClass6_Sub37_Sub1_1.method5151(Static567.anInt9503);
		Static390.aBoolean488 = !Static480.aClass6_Sub37_Sub1_1.aBoolean408;
		Static137.anInt2437 = Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503) ? -1 : Static356.anInt6242;
		Static534.aBoolean639 = Static244.method3522(Static567.anInt9503) || Static480.aClass6_Sub37_Sub1_1.aBoolean409;
		Static439.aBoolean525 = Static480.aClass6_Sub37_Sub1_1.aBoolean401;
		Static416.aClass193_Sub1_2 = new Class193_Sub1(4, Static301.anInt4912, Static473.anInt7969, false);
		if (Static228.anInt3904 == 0) {
			Static418.method6134(Static202.aByteArrayArray11, Static416.aClass193_Sub1_2);
		} else {
			Static6.method1742(Static202.aByteArrayArray11, Static416.aClass193_Sub1_2);
		}
		Static358.method5316(Static473.anInt7969 >> 4, Static301.anInt4912 >> 4);
		Static38.method533();
		if (local384) {
			Static137.method2053(true);
			Static203.aClass193_Sub1_1 = new Class193_Sub1(1, Static301.anInt4912, Static473.anInt7969, true);
			if (Static228.anInt3904 == 0) {
				Static418.method6134(Static491.aByteArrayArray24, Static203.aClass193_Sub1_1);
				Static193.method2891(true);
			} else {
				Static6.method1742(Static491.aByteArrayArray24, Static203.aClass193_Sub1_1);
				Static193.method2891(true);
			}
			Static203.aClass193_Sub1_1.method4177(Static416.aClass193_Sub1_2.anIntArrayArrayArray17[0]);
			Static203.aClass193_Sub1_1.method4182(null, Static176.aClass121_5, null);
			Static137.method2053(false);
		}
		Static416.aClass193_Sub1_2.method4182(local384 ? Static203.aClass193_Sub1_1.anIntArrayArrayArray17 : null, Static176.aClass121_5, Static296.aClass295Array3);
		if (Static228.anInt3904 == 0) {
			Static193.method2891(true);
			Static221.method3232(Static196.aByteArrayArray10, Static416.aClass193_Sub1_2);
			if (Static69.aByteArrayArray3 != null) {
				Static190.method3489();
			}
		} else {
			Static193.method2891(true);
			Static535.method5173(Static196.aByteArrayArray10, Static416.aClass193_Sub1_2);
		}
		Static244.method3524();
		if (Static31.anInt551 < 96) {
			Static262.method3723();
		}
		Static193.method2891(true);
		Static416.aClass193_Sub1_2.method4181(local384 ? Static127.aClass60Array7[0] : null, null, Static176.aClass121_5);
		Static416.aClass193_Sub1_2.method4185(Static176.aClass121_5);
		Static193.method2891(true);
		if (local384) {
			Static137.method2053(true);
			Static193.method2891(true);
			if (Static228.anInt3904 == 0) {
				Static221.method3232(Static340.aByteArrayArray20, Static203.aClass193_Sub1_1);
			} else {
				Static535.method5173(Static340.aByteArrayArray20, Static203.aClass193_Sub1_1);
			}
			Static244.method3524();
			Static193.method2891(true);
			Static203.aClass193_Sub1_1.method4181(null, Static34.aClass60Array10[0], Static176.aClass121_5);
			Static203.aClass193_Sub1_1.method4185(Static176.aClass121_5);
			Static193.method2891(true);
			Static137.method2053(false);
		}
		Static337.method5124();
		@Pc(736) int local736 = Static416.aClass193_Sub1_2.anInt4876;
		if (Static282.anInt4677 < local736) {
			local736 = Static282.anInt4677;
		}
		if (Static282.anInt4677 - 1 > local736) {
			local736 = Static282.anInt4677 - 1;
		}
		if (Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503)) {
			Static489.method6754(0);
		} else {
			Static489.method6754(local736);
		}
		@Pc(767) int local767;
		@Pc(771) int local771;
		for (@Pc(763) int local763 = 0; local763 < 4; local763++) {
			for (local767 = 0; local767 < Static301.anInt4912; local767++) {
				for (local771 = 0; local771 < Static473.anInt7969; local771++) {
					Static20.method287(local763, local767, local771);
				}
			}
		}
		Static358.method5319();
		Static11.method182();
		Static399.method5871();
		Static244.method3524();
		Static252.method3567();
		if (Static183.aFrame2 != null && Static225.aClass71_1 != null && Static146.anInt2581 == 11) {
			Static136.method2051(Static65.aClass160_21);
			Static218.aClass6_Sub14_Sub2_1.method5990(1057001181);
		}
		if (Static228.anInt3904 == 0) {
			local767 = (Static274.anInt3319 - (Static301.anInt4912 >> 4)) / 8;
			local771 = (Static274.anInt3319 + (Static301.anInt4912 >> 4)) / 8;
			@Pc(859) int local859 = (Static374.anInt6445 - (Static473.anInt7969 >> 4)) / 8;
			@Pc(867) int local867 = ((Static473.anInt7969 >> 4) + Static374.anInt6445) / 8;
			for (@Pc(871) int local871 = local767 - 1; local871 <= local771 + 1; local871++) {
				for (@Pc(877) int local877 = local859 - 1; local877 <= local867 + 1; local877++) {
					if (local767 > local871 || local771 < local871 || local877 < local859 || local877 > local867) {
						Static285.aClass251_84.method5830("m" + local871 + "_" + local877);
						Static285.aClass251_84.method5830("l" + local871 + "_" + local877);
					}
				}
			}
		}
		if (Static146.anInt2581 == 4) {
			Static99.method1593(3);
		} else if (Static146.anInt2581 == 8) {
			Static99.method1593(7);
		} else {
			Static99.method1593(10);
			if (Static225.aClass71_1 != null) {
				Static136.method2051(Static4.aClass160_4);
			}
		}
		Static167.method2612();
		Static11.method182();
		Static220.method3227();
	}
}
