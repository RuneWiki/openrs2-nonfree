import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_34 = new Class240(30, 3);

	@OriginalMember(owner = "client!fv", name = "k", descriptor = "Z")
	public static boolean aBoolean246 = true;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	public static void method2869() {
		Static207.method7394(false);
		Static358.anInt6109 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static455.aByteArrayArray21.length; local14++) {
			if (Static312.anIntArray296[local14] != -1 && Static455.aByteArrayArray21[local14] == null) {
				Static455.aByteArrayArray21[local14] = Static405.aClass362_87.method8368(Static312.anIntArray296[local14], 0);
				if (Static455.aByteArrayArray21[local14] == null) {
					local12 = false;
					Static358.anInt6109++;
				}
			}
			if (Static144.anIntArray149[local14] != -1 && Static322.aByteArrayArray16[local14] == null) {
				Static322.aByteArrayArray16[local14] = Static405.aClass362_87.method8363(Static517.anIntArrayArray49[local14], Static144.anIntArray149[local14], 0);
				if (Static322.aByteArrayArray16[local14] == null) {
					Static358.anInt6109++;
					local12 = false;
				}
			}
			if (Static115.anIntArray118[local14] != -1 && Static376.aByteArrayArray18[local14] == null) {
				Static376.aByteArrayArray18[local14] = Static405.aClass362_87.method8368(Static115.anIntArray118[local14], 0);
				if (Static376.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static358.anInt6109++;
				}
			}
			if (Static572.anIntArray485[local14] != -1 && Static315.aByteArrayArray15[local14] == null) {
				Static315.aByteArrayArray15[local14] = Static405.aClass362_87.method8368(Static572.anIntArray485[local14], 0);
				if (Static315.aByteArrayArray15[local14] == null) {
					local12 = false;
					Static358.anInt6109++;
				}
			}
			if (Static614.anIntArray542 != null && Static110.aByteArrayArray7[local14] == null && Static614.anIntArray542[local14] != -1) {
				Static110.aByteArrayArray7[local14] = Static405.aClass362_87.method8363(Static517.anIntArrayArray49[local14], Static614.anIntArray542[local14], 0);
				if (Static110.aByteArrayArray7[local14] == null) {
					Static358.anInt6109++;
					local12 = false;
				}
			}
		}
		if (Static406.aClass392_1 == null) {
			if (Static194.aClass3_Sub5_Sub4_1 == null || !Static305.aClass362_61.method8361(Static194.aClass3_Sub5_Sub4_1.aString21 + "_staticelements")) {
				Static406.aClass392_1 = new Class392(0);
			} else if (Static305.aClass362_61.method8339(Static194.aClass3_Sub5_Sub4_1.aString21 + "_staticelements")) {
				Static406.aClass392_1 = Static576.method7566(Static20.aBoolean23, Static305.aClass362_61, Static194.aClass3_Sub5_Sub4_1.aString21 + "_staticelements");
			} else {
				Static358.anInt6109++;
				local12 = false;
			}
		}
		if (!local12) {
			Static642.anInt10564 = 1;
			return;
		}
		local12 = true;
		Static483.anInt7695 = 0;
		@Pc(268) int local268;
		@Pc(278) int local278;
		for (@Pc(249) int local249 = 0; local249 < Static455.aByteArrayArray21.length; local249++) {
			@Pc(255) byte[] local255 = Static322.aByteArrayArray16[local249];
			if (local255 != null) {
				local268 = (Static448.anIntArray394[local249] >> 8) * 64 - Static534.anInt8358;
				local278 = (Static448.anIntArray394[local249] & 0xFF) * 64 - Static402.anInt6661;
				if (Static447.anInt7216 != 0) {
					local268 = 10;
					local278 = 10;
				}
				local12 &= Static240.method3642(local268, Static98.anInt361, local278, Static438.anInt7120, local255);
			}
			local255 = Static315.aByteArrayArray15[local249];
			if (local255 != null) {
				local268 = (Static448.anIntArray394[local249] >> 8) * 64 - Static534.anInt8358;
				local278 = (Static448.anIntArray394[local249] & 0xFF) * 64 - Static402.anInt6661;
				if (Static447.anInt7216 != 0) {
					local268 = 10;
					local278 = 10;
				}
				local12 &= Static240.method3642(local268, Static98.anInt361, local278, Static438.anInt7120, local255);
			}
		}
		if (!local12) {
			Static642.anInt10564 = 2;
			return;
		}
		if (Static642.anInt10564 != 0) {
			Static651.method8742(true, Static114.aClass84_12.method1729(Static654.anInt10668) + "<br>(100%)", Static119.aClass95_4, Static513.aClass91_12, Static184.aClass67_3);
		}
		Static333.method4737();
		Static655.method8761();
		Static492.method742();
		@Pc(380) boolean local380 = false;
		if (Static119.aClass95_4.method8002() && Static336.aClass3_Sub41_18.aClass14_Sub27_1.method8410() == 2) {
			for (local268 = 0; local268 < Static455.aByteArrayArray21.length; local268++) {
				if (Static315.aByteArrayArray15[local268] != null || Static376.aByteArrayArray18[local268] != null) {
					local380 = true;
					break;
				}
			}
		}
		if (Static336.aClass3_Sub41_18.aClass14_Sub16_1.method4688() == 1) {
			local268 = Static666.anIntArray618[Static297.anInt5046];
		} else {
			local268 = Static674.anIntArray628[Static297.anInt5046];
		}
		if (Static119.aClass95_4.method7999()) {
			local268++;
		}
		Static81.method8381(Static119.aClass95_4, Static339.anInt5831, Static98.anInt361, Static438.anInt7120, local268, local380, Static119.aClass95_4.method8026() > 0);
		Static533.method6101(Static205.anInt3593);
		if (Static205.anInt3593 == 0) {
			Static667.method8916((Class67) null);
		} else {
			Static667.method8916(Static261.aClass67_5);
		}
		for (local278 = 0; local278 < 4; local278++) {
			Static609.aClass110Array1[local278].method2365();
		}
		Static492.method747();
		Static179.method7839(false);
		Static622.method8399();
		Static54.aBoolean76 = false;
		Static481.aClass118_2 = null;
		Static333.method4737();
		System.gc();
		Static207.method7394(true);
		Static372.method5297();
		Static65.anInt1330 = Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2511();
		Static499.aBoolean550 = Static525.anInt8303 >= 96;
		Static379.aBoolean444 = Static336.aClass3_Sub41_18.aClass14_Sub27_1.method8410() == 2;
		Static296.aBoolean336 = Static336.aClass3_Sub41_18.aClass14_Sub17_1.method5487() == 1;
		Static470.anInt7453 = Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 1 ? -1 : Static566.anInt9142;
		Static59.aBoolean88 = Static336.aClass3_Sub41_18.aClass14_Sub21_1.method6184() == 1;
		Class3_Sub5_Sub21.aBoolean755 = Static336.aClass3_Sub41_18.aClass14_Sub8_1.method2916() == 1;
		Static326.aClass49_Sub1_1 = new Class49_Sub1(4, Static98.anInt361, Static438.anInt7120, false);
		if (Static447.anInt7216 == 0) {
			Static243.method3678(Static455.aByteArrayArray21, Static326.aClass49_Sub1_1);
		} else {
			Static589.method7798(Static326.aClass49_Sub1_1, Static455.aByteArrayArray21);
		}
		Static208.method3104(Static438.anInt7120 >> 4, Static98.anInt361 >> 4);
		Static181.method2862();
		if (local380) {
			Static224.method3292(true);
			Static534.aClass49_Sub1_2 = new Class49_Sub1(1, Static98.anInt361, Static438.anInt7120, true);
			if (Static447.anInt7216 == 0) {
				Static243.method3678(Static376.aByteArrayArray18, Static534.aClass49_Sub1_2);
				Static207.method7394(true);
			} else {
				Static589.method7798(Static534.aClass49_Sub1_2, Static376.aByteArrayArray18);
				Static207.method7394(true);
			}
			Static534.aClass49_Sub1_2.method1215(Static326.aClass49_Sub1_1.anIntArrayArrayArray9[0]);
			Static534.aClass49_Sub1_2.method1208((int[][][]) null, (Class110[]) null, Static119.aClass95_4);
			Static224.method3292(false);
		}
		Static326.aClass49_Sub1_1.method1208(local380 ? Static534.aClass49_Sub1_2.anIntArrayArrayArray9 : null, Static609.aClass110Array1, Static119.aClass95_4);
		if (Static447.anInt7216 == 0) {
			Static207.method7394(true);
			Static298.method4354(Static326.aClass49_Sub1_1, Static322.aByteArrayArray16);
			if (Static110.aByteArrayArray7 != null) {
				Static263.method1777();
			}
		} else {
			Static207.method7394(true);
			Static31.method658(Static322.aByteArrayArray16, Static326.aClass49_Sub1_1);
		}
		Static655.method8761();
		if (Static525.anInt8303 < 96) {
			Static242.method5989();
		}
		Static207.method7394(true);
		Static326.aClass49_Sub1_1.method1206(Static119.aClass95_4, local380 ? Static368.aClass35Array1[0] : null, (Class35) null);
		Static326.aClass49_Sub1_1.method1225(false, Static119.aClass95_4);
		Static207.method7394(true);
		if (local380) {
			Static224.method3292(true);
			Static207.method7394(true);
			if (Static447.anInt7216 == 0) {
				Static298.method4354(Static534.aClass49_Sub1_2, Static315.aByteArrayArray15);
			} else {
				Static31.method658(Static315.aByteArrayArray15, Static534.aClass49_Sub1_2);
			}
			Static655.method8761();
			Static207.method7394(true);
			Static534.aClass49_Sub1_2.method1206(Static119.aClass95_4, (Class35) null, Static556.aClass35Array2[0]);
			Static534.aClass49_Sub1_2.method1225(true, Static119.aClass95_4);
			Static207.method7394(true);
			Static224.method3292(false);
		}
		Static86.method1384();
		@Pc(780) int local780 = Static326.aClass49_Sub1_1.anInt1385;
		if (local780 > Static570.anInt9192) {
			local780 = Static570.anInt9192;
		}
		if (Static570.anInt9192 - 1 > local780) {
			local780 = Static570.anInt9192 - 1;
		}
		if (Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 0) {
			Static208.method3102(local780);
		} else {
			Static208.method3102(0);
		}
		@Pc(818) int local818;
		@Pc(822) int local822;
		for (@Pc(814) int local814 = 0; local814 < 4; local814++) {
			for (local818 = 0; local818 < Static98.anInt361; local818++) {
				for (local822 = 0; local822 < Static438.anInt7120; local822++) {
					Static593.method7810(local814, local822, local818);
				}
			}
		}
		Static495.method6508();
		Static333.method4737();
		Static545.method6990();
		Static655.method8761();
		Static26.method595();
		@Pc(871) Class3_Sub37 local871;
		if (Static572.aFrame2 != null && Static12.aClass26_1 != null && Static221.anInt3831 == 11) {
			local871 = Static90.method1509(Static402.aClass240_68, Static226.aClass144_2);
			local871.aClass3_Sub4_Sub1_2.method7909(1057001181);
			Static301.method2678(local871);
		}
		if (Static447.anInt7216 == 0) {
			local818 = (Static55.anInt1158 - (Static98.anInt361 >> 4)) / 8;
			local822 = (Static55.anInt1158 + (Static98.anInt361 >> 4)) / 8;
			@Pc(908) int local908 = (Static586.anInt9541 - (Static438.anInt7120 >> 4)) / 8;
			@Pc(916) int local916 = ((Static438.anInt7120 >> 4) + Static586.anInt9541) / 8;
			for (@Pc(920) int local920 = local818 - 1; local920 <= local822 + 1; local920++) {
				for (@Pc(926) int local926 = local908 - 1; local926 <= local916 + 1; local926++) {
					if (local920 < local818 || local822 < local920 || local926 < local908 || local926 > local916) {
						Static405.aClass362_87.method8364("m" + local920 + "_" + local926);
						Static405.aClass362_87.method8364("l" + local920 + "_" + local926);
					}
				}
			}
		}
		if (Static221.anInt3831 == 4) {
			Static279.method4069(3);
		} else if (Static221.anInt3831 == 8) {
			Static279.method4069(7);
		} else {
			Static279.method4069(10);
			if (Static12.aClass26_1 != null) {
				local871 = Static90.method1509(Static393.aClass240_64, Static226.aClass144_2);
				Static301.method2678(local871);
			}
		}
		Static168.method2664();
		Static333.method4737();
		Static613.method8315();
		aBoolean246 = true;
		if (Static109.aBoolean159) {
			Static85.method1345("Took: " + (Static15.method380() - Static524.aLong238) + "ms");
			Static109.aBoolean159 = false;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	public static void method2871() {
		Static345.method5025(false);
		if (Static449.anInt7237 >= 0 && Static449.anInt7237 != 0) {
			Static168.method2665(false, Static449.anInt7237);
			Static449.anInt7237 = -1;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method2873(@OriginalArg(1) Class95 arg0) {
		if (Static532.aBoolean580) {
			Static500.method6563(arg0);
		} else {
			Static634.method5645(arg0);
		}
	}
}
