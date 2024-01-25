import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "Z")
	public static boolean aBoolean341;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_80 = new Class126(22, -2);

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_62 = new Class376(69, 2);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public static void method3701() {
		Static591.method7939(false);
		Static587.anInt9293 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static618.aByteArrayArray24.length; local14++) {
			if (Static384.anIntArray27[local14] != -1 && Static618.aByteArrayArray24[local14] == null) {
				Static618.aByteArrayArray24[local14] = Static673.aClass143_110.method3125(0, Static384.anIntArray27[local14]);
				if (Static618.aByteArrayArray24[local14] == null) {
					local12 = false;
					Static587.anInt9293++;
				}
			}
			if (Static63.anIntArray539[local14] != -1 && Static287.aByteArrayArray11[local14] == null) {
				Static287.aByteArrayArray11[local14] = Static673.aClass143_110.method3126(Static63.anIntArray539[local14], 0, Static192.anIntArrayArray39[local14]);
				if (Static287.aByteArrayArray11[local14] == null) {
					local12 = false;
					Static587.anInt9293++;
				}
			}
			if (Static663.anIntArray662[local14] != -1 && Static143.aByteArrayArray4[local14] == null) {
				Static143.aByteArrayArray4[local14] = Static673.aClass143_110.method3125(0, Static663.anIntArray662[local14]);
				if (Static143.aByteArrayArray4[local14] == null) {
					Static587.anInt9293++;
					local12 = false;
				}
			}
			if (Static489.anIntArray535[local14] != -1 && Static169.aByteArrayArray6[local14] == null) {
				Static169.aByteArrayArray6[local14] = Static673.aClass143_110.method3125(0, Static489.anIntArray535[local14]);
				if (Static169.aByteArrayArray6[local14] == null) {
					local12 = false;
					Static587.anInt9293++;
				}
			}
			if (Static284.anIntArray343 != null && Static316.aByteArrayArray16[local14] == null && Static284.anIntArray343[local14] != -1) {
				Static316.aByteArrayArray16[local14] = Static673.aClass143_110.method3126(Static284.anIntArray343[local14], 0, Static192.anIntArrayArray39[local14]);
				if (Static316.aByteArrayArray16[local14] == null) {
					Static587.anInt9293++;
					local12 = false;
				}
			}
		}
		if (Static17.aClass121_1 == null) {
			if (Static438.aClass3_Sub6_Sub13_1 == null || !Static390.aClass143_97.method3138(Static438.aClass3_Sub6_Sub13_1.aString66 + "_staticelements")) {
				Static17.aClass121_1 = new Class121(0);
			} else if (Static390.aClass143_97.method3118(Static438.aClass3_Sub6_Sub13_1.aString66 + "_staticelements")) {
				Static17.aClass121_1 = Static645.method8452(Static390.aClass143_97, Static438.aClass3_Sub6_Sub13_1.aString66 + "_staticelements", Static375.aBoolean505);
			} else {
				local12 = false;
				Static587.anInt9293++;
			}
		}
		if (!local12) {
			Static493.anInt7679 = 1;
			return;
		}
		Static8.anInt100 = 0;
		local12 = true;
		@Pc(270) int local270;
		@Pc(280) int local280;
		for (@Pc(251) int local251 = 0; local251 < Static618.aByteArrayArray24.length; local251++) {
			@Pc(257) byte[] local257 = Static287.aByteArrayArray11[local251];
			if (local257 != null) {
				local270 = (Static442.anIntArray464[local251] >> 8) * 64 - Static417.anInt7047;
				local280 = (Static442.anIntArray464[local251] & 0xFF) * 64 - Static347.anInt7851;
				if (Static176.anInt3321 != 0) {
					local270 = 10;
					local280 = 10;
				}
				local12 &= Static514.method7282(Static251.anInt4680, local270, local257, local280, Static406.anInt6924);
			}
			local257 = Static169.aByteArrayArray6[local251];
			if (local257 != null) {
				local270 = (Static442.anIntArray464[local251] >> 8) * 64 - Static417.anInt7047;
				local280 = (Static442.anIntArray464[local251] & 0xFF) * 64 - Static347.anInt7851;
				if (Static176.anInt3321 != 0) {
					local270 = 10;
					local280 = 10;
				}
				local12 &= Static514.method7282(Static251.anInt4680, local270, local257, local280, Static406.anInt6924);
			}
		}
		if (!local12) {
			Static493.anInt7679 = 2;
			return;
		}
		if (Static493.anInt7679 != 0) {
			Static659.method8584(Static582.aClass16_12, Static117.aClass202_3, Static277.aClass69_9, Static569.aClass335_13.method7694(Static319.anInt5939) + "<br>(100%)", true);
		}
		Static312.method4827();
		Static389.method5059();
		Static17.method713();
		@Pc(385) boolean local385 = false;
		if (Static582.aClass16_12.method8195() && Static227.aClass3_Sub15_11.aClass17_Sub5_1.method2068() == 2) {
			for (local270 = 0; local270 < Static618.aByteArrayArray24.length; local270++) {
				if (Static169.aByteArrayArray6[local270] != null || Static143.aByteArrayArray4[local270] != null) {
					local385 = true;
					break;
				}
			}
		}
		if (Static227.aClass3_Sub15_11.aClass17_Sub27_1.method8266() == 1) {
			local270 = Static47.anIntArray47[Static545.anInt8886];
		} else {
			local270 = Static291.anIntArray355[Static545.anInt8886];
		}
		if (Static582.aClass16_12.method8192()) {
			local270++;
		}
		Static210.method3304(Static582.aClass16_12, Static188.anInt3451, Static251.anInt4680, Static406.anInt6924, local270, local385, Static582.aClass16_12.method8130() > 0);
		Static362.method5407(Static245.anInt4575);
		if (Static245.anInt4575 == 0) {
			Static498.method7098((Class69) null);
		} else {
			Static498.method7098(Static157.aClass69_2);
		}
		for (local280 = 0; local280 < 4; local280++) {
			Static27.aClass198Array1[local280].method4537();
		}
		Static1.method8421();
		Static397.method5726(false);
		Static642.method8426();
		Static578.aClass10_1 = null;
		Static190.aBoolean282 = false;
		Static312.method4827();
		System.gc();
		Static591.method7939(true);
		Static295.method4579();
		Static649.anInt9990 = Static227.aClass3_Sub15_11.aClass17_Sub21_1.method6502();
		Static471.aBoolean734 = Static595.anInt9375 >= 96;
		Static7.aBoolean12 = Static227.aClass3_Sub15_11.aClass17_Sub5_1.method2068() == 2;
		Static285.aBoolean412 = Static227.aClass3_Sub15_11.aClass17_Sub2_1.method725() == 1;
		Static533.anInt8771 = Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 1 ? -1 : Static407.anInt6944;
		Static549.aBoolean404 = Static227.aClass3_Sub15_11.aClass17_Sub22_1.method6659() == 1;
		Static172.aBoolean260 = Static227.aClass3_Sub15_11.aClass17_Sub12_1.method4577() == 1;
		Static196.aClass67_Sub1_2 = new Class67_Sub1(4, Static251.anInt4680, Static406.anInt6924, false);
		if (Static176.anInt3321 == 0) {
			Static273.method4347(Static618.aByteArrayArray24, Static196.aClass67_Sub1_2);
		} else {
			Static658.method8569(Static196.aClass67_Sub1_2, Static618.aByteArrayArray24);
		}
		Static332.method5116(Static406.anInt6924 >> 4, Static251.anInt4680 >> 4);
		Static581.method7831();
		if (local385) {
			Static95.method1889(true);
			Static24.aClass67_Sub1_1 = new Class67_Sub1(1, Static251.anInt4680, Static406.anInt6924, true);
			if (Static176.anInt3321 == 0) {
				Static273.method4347(Static143.aByteArrayArray4, Static24.aClass67_Sub1_1);
				Static591.method7939(true);
			} else {
				Static658.method8569(Static24.aClass67_Sub1_1, Static143.aByteArrayArray4);
				Static591.method7939(true);
			}
			Static24.aClass67_Sub1_1.method1824(Static196.aClass67_Sub1_2.anIntArrayArrayArray2[0]);
			Static24.aClass67_Sub1_1.method1828((int[][][]) null, Static582.aClass16_12, (Class198[]) null);
			Static95.method1889(false);
		}
		Static196.aClass67_Sub1_2.method1828(local385 ? Static24.aClass67_Sub1_1.anIntArrayArrayArray2 : null, Static582.aClass16_12, Static27.aClass198Array1);
		if (Static176.anInt3321 == 0) {
			Static591.method7939(true);
			Static148.method2560(Static287.aByteArrayArray11, Static196.aClass67_Sub1_2);
			if (Static316.aByteArrayArray16 != null) {
				Static499.method7104();
			}
		} else {
			Static591.method7939(true);
			Static268.method4277(Static196.aClass67_Sub1_2, Static287.aByteArrayArray11);
		}
		Static389.method5059();
		if (Static595.anInt9375 < 96) {
			Static469.method6704();
		}
		Static591.method7939(true);
		Static196.aClass67_Sub1_2.method1815((Class104) null, Static582.aClass16_12, local385 ? Static605.aClass104Array3[0] : null);
		Static196.aClass67_Sub1_2.method1839(Static582.aClass16_12, false);
		Static591.method7939(true);
		if (local385) {
			Static95.method1889(true);
			Static591.method7939(true);
			if (Static176.anInt3321 == 0) {
				Static148.method2560(Static169.aByteArrayArray6, Static24.aClass67_Sub1_1);
			} else {
				Static268.method4277(Static24.aClass67_Sub1_1, Static169.aByteArrayArray6);
			}
			Static389.method5059();
			Static591.method7939(true);
			Static24.aClass67_Sub1_1.method1815(Static239.aClass104Array1[0], Static582.aClass16_12, (Class104) null);
			Static24.aClass67_Sub1_1.method1839(Static582.aClass16_12, true);
			Static591.method7939(true);
			Static95.method1889(false);
		}
		Static51.method1367();
		@Pc(781) int local781 = Static196.aClass67_Sub1_2.anInt1981;
		if (local781 > Static576.anInt9136) {
			local781 = Static576.anInt9136;
		}
		if (local781 < Static576.anInt9136 - 1) {
			local781 = Static576.anInt9136 - 1;
		}
		if (Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 0) {
			Static187.method3023(local781);
		} else {
			Static187.method3023(0);
		}
		@Pc(816) int local816;
		@Pc(820) int local820;
		for (@Pc(812) int local812 = 0; local812 < 4; local812++) {
			for (local816 = 0; local816 < Static251.anInt4680; local816++) {
				for (local820 = 0; local820 < Static406.anInt6924; local820++) {
					Static263.method4141(local816, local820, local812);
				}
			}
		}
		Static541.method7490();
		Static312.method4827();
		Static15.method139();
		Static389.method5059();
		Static530.method7397();
		@Pc(873) Class3_Sub44 local873;
		if (Static90.aFrame2 != null && Static673.aClass160_3 != null && Static520.anInt6836 == 11) {
			local873 = Static275.method5689(Static673.aClass376_109, Static540.aClass282_4);
			local873.aClass3_Sub17_Sub2_3.method4854(1057001181);
			Static616.method8089(local873);
		}
		if (Static176.anInt3321 == 0) {
			local816 = (Static660.anInt10217 - (Static251.anInt4680 >> 4)) / 8;
			local820 = ((Static251.anInt4680 >> 4) + Static660.anInt10217) / 8;
			@Pc(911) int local911 = (Static279.anInt5230 - (Static406.anInt6924 >> 4)) / 8;
			@Pc(919) int local919 = ((Static406.anInt6924 >> 4) + Static279.anInt5230) / 8;
			for (@Pc(923) int local923 = local816 - 1; local923 <= local820 + 1; local923++) {
				for (@Pc(929) int local929 = local911 - 1; local929 <= local919 + 1; local929++) {
					if (local816 > local923 || local923 > local820 || local911 > local929 || local919 < local929) {
						Static673.aClass143_110.method3128("m" + local923 + "_" + local929);
						Static673.aClass143_110.method3128("l" + local923 + "_" + local929);
					}
				}
			}
		}
		if (Static520.anInt6836 == 4) {
			Static482.method6863(3);
		} else if (Static520.anInt6836 == 8) {
			Static482.method6863(7);
		} else {
			Static482.method6863(10);
			if (Static673.aClass160_3 != null) {
				local873 = Static275.method5689(Static278.aClass376_71, Static540.aClass282_4);
				Static616.method8089(local873);
			}
		}
		Static458.method6577();
		Static312.method4827();
		Static368.method5462();
		Static674.aBoolean763 = true;
		if (Static21.aBoolean66) {
			Static339.method5160("Took: " + (Static131.method2268() - Static513.aLong254) + "ms");
			Static21.aBoolean66 = false;
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)[Lclient!rha;")
	public static Class309[] method3702() {
		return new Class309[] { Static216.aClass309_6, Static115.aClass309_3, Static625.aClass309_9, Static17.aClass309_1, Static312.aClass309_7, Static102.aClass309_2 };
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V")
	public static void method3703() {
		if (Static520.anInt6836 == 3) {
			Static482.method6863(4);
		} else if (Static520.anInt6836 == 7) {
			Static482.method6863(8);
		} else if (Static520.anInt6836 == 10) {
			Static482.method6863(11);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()V")
	public static void method3704() {
		for (@Pc(1) int local1 = 0; local1 < Static279.anInt5224; local1++) {
			@Pc(6) Class23_Sub2_Sub1 local6 = Static594.aClass23_Sub2_Sub1Array1[local1];
			Static447.method6466(local6, true);
			Static594.aClass23_Sub2_Sub1Array1[local1] = null;
		}
		Static279.anInt5224 = 0;
	}
}
