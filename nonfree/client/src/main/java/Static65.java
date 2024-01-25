import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public static int anInt1507;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
	public static int anInt1510;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	public static int anInt1512;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	public static int anInt1511 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
	public static void method1421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static75.aClass134_7.method3348(Static544.aClass343_28.method7222(Static256.anInt4535));
		@Pc(26) int local26;
		for (@Pc(18) Class3_Sub43 local18 = (Class3_Sub43) Static133.aClass112_20.method3088(); local18 != null; local18 = (Class3_Sub43) Static133.aClass112_20.method3084()) {
			local26 = Static58.method1196(local18);
			if (local13 < local26) {
				local13 = local26;
			}
		}
		local13 += 8;
		local26 = Static571.anInt9281 * 16 + 21;
		@Pc(51) int local51 = arg0 - local13 / 2;
		if (local13 + local51 > Static40.anInt758) {
			local51 = Static40.anInt758 - local13;
		}
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(69) int local69 = arg1;
		if (arg1 + local26 > Static308.anInt5171) {
			local69 = Static308.anInt5171 - local26;
		}
		if (local69 < 0) {
			local69 = 0;
		}
		Static211.anInt3825 = local51;
		Static520.anInt9775 = local13;
		Static122.anInt2800 = (Static270.aBoolean347 ? 26 : 22) + Static571.anInt9281 * 16;
		Static150.aBoolean254 = true;
		Static538.anInt8629 = local69;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method1422() {
		Static214.method3435(false);
		Static122.anInt2803 = 0;
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < Static551.aByteArrayArray22.length; local18++) {
			if (Static450.anIntArray623[local18] != -1 && Static551.aByteArrayArray22[local18] == null) {
				Static551.aByteArrayArray22[local18] = Static99.aClass322_36.method6802(Static450.anIntArray623[local18], 0);
				if (Static551.aByteArrayArray22[local18] == null) {
					local16 = false;
					Static122.anInt2803++;
				}
			}
			if (Static73.anIntArray77[local18] != -1 && Static401.aByteArrayArray20[local18] == null) {
				Static401.aByteArrayArray20[local18] = Static99.aClass322_36.method6821(Static73.anIntArray77[local18], Static189.anIntArrayArray81[local18], 0);
				if (Static401.aByteArrayArray20[local18] == null) {
					Static122.anInt2803++;
					local16 = false;
				}
			}
			if (Static529.anIntArray557[local18] != -1 && Static308.aByteArrayArray13[local18] == null) {
				Static308.aByteArrayArray13[local18] = Static99.aClass322_36.method6802(Static529.anIntArray557[local18], 0);
				if (Static308.aByteArrayArray13[local18] == null) {
					local16 = false;
					Static122.anInt2803++;
				}
			}
			if (Static299.anIntArray289[local18] != -1 && Static274.aByteArrayArray12[local18] == null) {
				Static274.aByteArrayArray12[local18] = Static99.aClass322_36.method6802(Static299.anIntArray289[local18], 0);
				if (Static274.aByteArrayArray12[local18] == null) {
					Static122.anInt2803++;
					local16 = false;
				}
			}
			if (Static58.anIntArray60 != null && Static346.aByteArrayArray18[local18] == null && Static58.anIntArray60[local18] != -1) {
				Static346.aByteArrayArray18[local18] = Static99.aClass322_36.method6821(Static58.anIntArray60[local18], Static189.anIntArrayArray81[local18], 0);
				if (Static346.aByteArrayArray18[local18] == null) {
					local16 = false;
					Static122.anInt2803++;
				}
			}
		}
		if (Static319.aClass355_2 == null) {
			if (Static173.aClass3_Sub7_Sub17_2 == null || !Static69.aClass322_27.method6832(Static173.aClass3_Sub7_Sub17_2.aString76 + "_staticelements")) {
				Static319.aClass355_2 = new Class355(0);
			} else if (Static69.aClass322_27.method6818(Static173.aClass3_Sub7_Sub17_2.aString76 + "_staticelements")) {
				Static319.aClass355_2 = Static591.method7906(Static69.aClass322_27, Static173.aClass3_Sub7_Sub17_2.aString76 + "_staticelements", Static191.aBoolean273);
			} else {
				local16 = false;
				Static122.anInt2803++;
			}
		}
		if (!local16) {
			Static398.anInt6933 = 1;
			return;
		}
		local16 = true;
		Static303.anInt5123 = 0;
		@Pc(279) int local279;
		@Pc(290) int local290;
		for (@Pc(260) int local260 = 0; local260 < Static551.aByteArrayArray22.length; local260++) {
			@Pc(266) byte[] local266 = Static401.aByteArrayArray20[local260];
			if (local266 != null) {
				local279 = (Static403.anIntArray428[local260] >> 8) * 64 - Static335.anInt5608;
				local290 = (Static403.anIntArray428[local260] & 0xFF) * 64 - Static246.anInt4344;
				if (Static39.anInt749 != 0) {
					local290 = 10;
					local279 = 10;
				}
				local16 &= Static371.method5419(Static54.anInt1038, local279, local290, Static140.anInt3026, local266);
			}
			local266 = Static274.aByteArrayArray12[local260];
			if (local266 != null) {
				local279 = (Static403.anIntArray428[local260] >> 8) * 64 - Static335.anInt5608;
				local290 = (Static403.anIntArray428[local260] & 0xFF) * 64 - Static246.anInt4344;
				if (Static39.anInt749 != 0) {
					local290 = 10;
					local279 = 10;
				}
				local16 &= Static371.method5419(Static54.anInt1038, local279, local290, Static140.anInt3026, local266);
			}
		}
		if (!local16) {
			Static398.anInt6933 = 2;
			return;
		}
		if (Static398.anInt6933 != 0) {
			Static525.method7021(Static544.aClass343_16.method7222(Static256.anInt4535) + "<br>(100%)", Static505.aClass45_11, Static569.aClass54_9, Static521.aClass134_12, true);
		}
		Static236.method3658();
		Static495.method6690();
		@Pc(387) boolean local387 = false;
		if (Static505.aClass45_11.method7430() && Static405.aClass3_Sub3_Sub1_1.aBoolean589) {
			for (local279 = 0; local279 < Static551.aByteArrayArray22.length; local279++) {
				if (Static274.aByteArrayArray12[local279] != null || Static308.aByteArrayArray13[local279] != null) {
					local387 = true;
					break;
				}
			}
		}
		if (Static405.aClass3_Sub3_Sub1_1.aBoolean584) {
			local279 = Static566.anIntArray587[Static587.anInt9573];
		} else {
			local279 = Static46.anIntArray37[Static587.anInt9573];
		}
		if (Static505.aClass45_11.method7435()) {
			local279++;
		}
		Static339.method5039(Static505.aClass45_11, Static536.anInt8590, Static54.anInt1038, Static140.anInt3026, local279, local387, Static505.aClass45_11.method7374() > 0);
		if (Static285.aBoolean354) {
			Static125.method2542(Static544.aClass54_15);
		} else {
			Static125.method2542(null);
		}
		for (local290 = 0; local290 < 4; local290++) {
			Static460.aClass169Array3[local290].method4038();
		}
		Static215.method3459();
		Static491.method6644(false);
		Static385.method5696();
		Static84.aClass350_1 = null;
		Static132.aBoolean736 = false;
		Static236.method3658();
		System.gc();
		Static214.method3435(true);
		Static345.method5112();
		Static459.anInt7699 = Static405.aClass3_Sub3_Sub1_1.method6299(Static60.anInt1312);
		Static469.aBoolean316 = Static405.aClass3_Sub3_Sub1_1.aBoolean589;
		Static394.aBoolean516 = Static350.anInt6083 >= 96;
		Static15.aBoolean29 = Static405.aClass3_Sub3_Sub1_1.method6297(Static60.anInt1312);
		Static85.aBoolean159 = !Static405.aClass3_Sub3_Sub1_1.aBoolean590;
		Static504.anInt8197 = Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312) ? -1 : Static364.anInt645;
		Static40.aBoolean75 = Static436.method6101(Static60.anInt1312) || Static405.aClass3_Sub3_Sub1_1.aBoolean588;
		Static317.aBoolean399 = Static405.aClass3_Sub3_Sub1_1.aBoolean579;
		Static25.aClass26_Sub1_1 = new Class26_Sub1(4, Static54.anInt1038, Static140.anInt3026, false);
		if (Static39.anInt749 == 0) {
			Static239.method3672(Static25.aClass26_Sub1_1, Static551.aByteArrayArray22);
		} else {
			Static296.method4400(Static551.aByteArrayArray22, Static25.aClass26_Sub1_1);
		}
		Static571.method7686(Static140.anInt3026 >> 4, Static54.anInt1038 >> 4);
		Static79.method5529();
		if (local387) {
			Static366.method5362(true);
			Static453.aClass26_Sub1_2 = new Class26_Sub1(1, Static54.anInt1038, Static140.anInt3026, true);
			if (Static39.anInt749 == 0) {
				Static239.method3672(Static453.aClass26_Sub1_2, Static308.aByteArrayArray13);
				Static214.method3435(true);
			} else {
				Static296.method4400(Static308.aByteArrayArray13, Static453.aClass26_Sub1_2);
				Static214.method3435(true);
			}
			Static453.aClass26_Sub1_2.method7105(Static25.aClass26_Sub1_1.anIntArrayArrayArray19[0]);
			Static453.aClass26_Sub1_2.method7116(null, Static505.aClass45_11, null);
			Static366.method5362(false);
		}
		Static25.aClass26_Sub1_1.method7116(Static460.aClass169Array3, Static505.aClass45_11, local387 ? Static453.aClass26_Sub1_2.anIntArrayArrayArray19 : null);
		if (Static39.anInt749 == 0) {
			Static214.method3435(true);
			Static365.method5319(Static401.aByteArrayArray20, Static25.aClass26_Sub1_1);
			if (Static346.aByteArrayArray18 != null) {
				Static387.method5737();
			}
		} else {
			Static214.method3435(true);
			Static430.method6070(Static401.aByteArrayArray20, Static25.aClass26_Sub1_1);
		}
		Static495.method6690();
		if (Static350.anInt6083 < 96) {
			Static587.method7878();
		}
		Static214.method3435(true);
		Static25.aClass26_Sub1_1.method7112(Static505.aClass45_11, local387 ? Static426.aClass34Array5[0] : null, null);
		Static25.aClass26_Sub1_1.method7120(false, Static505.aClass45_11);
		Static214.method3435(true);
		if (local387) {
			Static366.method5362(true);
			Static214.method3435(true);
			if (Static39.anInt749 == 0) {
				Static365.method5319(Static274.aByteArrayArray12, Static453.aClass26_Sub1_2);
			} else {
				Static430.method6070(Static274.aByteArrayArray12, Static453.aClass26_Sub1_2);
			}
			Static495.method6690();
			Static214.method3435(true);
			Static453.aClass26_Sub1_2.method7112(Static505.aClass45_11, null, Static108.aClass34Array6[0]);
			Static453.aClass26_Sub1_2.method7120(true, Static505.aClass45_11);
			Static214.method3435(true);
			Static366.method5362(false);
		}
		Static20.method318();
		@Pc(758) int local758 = Static25.aClass26_Sub1_1.anInt8553;
		if (Static117.anInt2694 < local758) {
			local758 = Static117.anInt2694;
		}
		if (local758 < Static117.anInt2694 - 1) {
			local758 = Static117.anInt2694 - 1;
		}
		if (Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312)) {
			Static20.method317(0);
		} else {
			Static20.method317(local758);
		}
		@Pc(793) int local793;
		@Pc(797) int local797;
		for (@Pc(789) int local789 = 0; local789 < 4; local789++) {
			for (local793 = 0; local793 < Static54.anInt1038; local793++) {
				for (local797 = 0; local797 < Static140.anInt3026; local797++) {
					Static297.method4420(local797, local793, local789);
				}
			}
		}
		Static286.method4255();
		Static236.method3658();
		Static120.method2485();
		Static495.method6690();
		Static81.method1656();
		@Pc(856) Class3_Sub42 local856;
		if (Static203.aFrame3 != null && Static324.aClass165_2 != null && Static32.anInt602 == 11) {
			local856 = Static591.method7910(Static9.aClass199_3, Static362.aClass303_67);
			local856.aClass3_Sub11_Sub1_1.method5215(1057001181);
			Static511.method6885(local856);
		}
		if (Static39.anInt749 == 0) {
			local793 = (Static110.anInt2172 - (Static54.anInt1038 >> 4)) / 8;
			local797 = ((Static54.anInt1038 >> 4) + Static110.anInt2172) / 8;
			@Pc(894) int local894 = (Static132.anInt9449 - (Static140.anInt3026 >> 4)) / 8;
			@Pc(902) int local902 = ((Static140.anInt3026 >> 4) + Static132.anInt9449) / 8;
			for (@Pc(906) int local906 = local793 - 1; local906 <= local797 + 1; local906++) {
				for (@Pc(912) int local912 = local894 - 1; local912 <= local902 + 1; local912++) {
					if (local906 < local793 || local797 < local906 || local894 > local912 || local912 > local902) {
						Static99.aClass322_36.method6804("m" + local906 + "_" + local912);
						Static99.aClass322_36.method6804("l" + local906 + "_" + local912);
					}
				}
			}
		}
		if (Static32.anInt602 == 4) {
			Static25.method439(3);
		} else if (Static32.anInt602 == 8) {
			Static25.method439(7);
		} else {
			Static25.method439(10);
			if (Static324.aClass165_2 != null) {
				local856 = Static591.method7910(Static9.aClass199_3, Static394.aClass303_72);
				Static511.method6885(local856);
			}
		}
		Static416.method5934();
		Static236.method3658();
		Static395.method5770();
		if (Static313.aBoolean391) {
			Static359.method5539("Took: " + (Static158.method2936() - Static270.aLong139) + "ms");
			Static313.aBoolean391 = false;
		}
	}
}
