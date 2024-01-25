import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
	public static int anInt6023;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString57 = null;

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "[S")
	public static short[] aShortArray111 = new short[256];

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[100];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method4625(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(2) String local2 = arg1.toLowerCase();
		@Pc(9) short[] local9 = new short[16];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(27) int local27 = (arg0 ? Static439.aClass127_2.anInt3987 : Static439.aClass127_2.anInt3986) + local17;
		for (@Pc(34) int local34 = local17; local34 < local27; local34++) {
			@Pc(40) Class1_Sub1_Sub13 local40 = Static439.aClass127_2.method3086(local34);
			if (local40.aBoolean399 && local40.method4837().toLowerCase().indexOf(local2) != -1) {
				if (local11 >= 50) {
					Static314.aShortArray100 = null;
					Static343.anInt6320 = -1;
					return;
				}
				if (local9.length <= local11) {
					@Pc(74) short[] local74 = new short[local9.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local11; local76++) {
						local74[local76] = local9[local76];
					}
					local9 = local74;
				}
				local9[local11++] = (short) local34;
			}
		}
		Static314.aShortArray100 = local9;
		Static343.anInt6320 = local11;
		Static230.anInt4555 = 0;
		@Pc(116) String[] local116 = new String[Static343.anInt6320];
		for (@Pc(118) int local118 = 0; local118 < Static343.anInt6320; local118++) {
			local116[local118] = Static439.aClass127_2.method3086(local9[local118]).method4837();
		}
		Static106.method1756(Static314.aShortArray100, local116);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	public static void method4626() {
		Static155.method2610(false);
		Static26.anInt653 = 0;
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < Static311.aByteArrayArray18.length; local12++) {
			if (Static155.anIntArray345[local12] != -1 && Static311.aByteArrayArray18[local12] == null) {
				Static311.aByteArrayArray18[local12] = Static136.aClass211_36.method4758(0, Static155.anIntArray345[local12]);
				if (Static311.aByteArrayArray18[local12] == null) {
					Static26.anInt653++;
					local10 = false;
				}
			}
			if (Static257.anIntArray473[local12] != -1 && Static237.aByteArrayArray15[local12] == null) {
				Static237.aByteArrayArray15[local12] = Static136.aClass211_36.method4770(Static337.anIntArrayArray48[local12], 0, Static257.anIntArray473[local12]);
				if (Static237.aByteArrayArray15[local12] == null) {
					Static26.anInt653++;
					local10 = false;
				}
			}
			if (Static243.anIntArray443[local12] != -1 && Static106.aByteArrayArray8[local12] == null) {
				Static106.aByteArrayArray8[local12] = Static136.aClass211_36.method4758(0, Static243.anIntArray443[local12]);
				if (Static106.aByteArrayArray8[local12] == null) {
					Static26.anInt653++;
					local10 = false;
				}
			}
			if (Static135.anIntArray311[local12] != -1 && Static299.aByteArrayArray5[local12] == null) {
				Static299.aByteArrayArray5[local12] = Static136.aClass211_36.method4758(0, Static135.anIntArray311[local12]);
				if (Static299.aByteArrayArray5[local12] == null) {
					Static26.anInt653++;
					local10 = false;
				}
			}
			if (Static225.anIntArray431 != null && Static339.aByteArrayArray20[local12] == null && Static225.anIntArray431[local12] != -1) {
				Static339.aByteArrayArray20[local12] = Static136.aClass211_36.method4770(Static337.anIntArrayArray48[local12], 0, Static225.anIntArray431[local12]);
				if (Static339.aByteArrayArray20[local12] == null) {
					local10 = false;
					Static26.anInt653++;
				}
			}
		}
		if (Static90.aClass121_1 == null) {
			if (Static264.aClass1_Sub1_Sub17_3 == null || !Static263.aClass211_69.method4776(Static264.aClass1_Sub1_Sub17_3.aString65 + "_staticelements")) {
				Static90.aClass121_1 = new Class121(0);
			} else if (Static263.aClass211_69.method4747(Static264.aClass1_Sub1_Sub17_3.aString65 + "_staticelements")) {
				Static90.aClass121_1 = Static367.method5117(Static264.aClass1_Sub1_Sub17_3.aString65 + "_staticelements", Static263.aClass211_69, Static94.aBoolean149);
			} else {
				local10 = false;
				Static26.anInt653++;
			}
		}
		if (!local10) {
			Static368.anInt6726 = 1;
			return;
		}
		local10 = true;
		Static169.anInt3489 = 0;
		@Pc(265) int local265;
		@Pc(276) int local276;
		for (@Pc(247) int local247 = 0; local247 < Static311.aByteArrayArray18.length; local247++) {
			@Pc(252) byte[] local252 = Static237.aByteArrayArray15[local247];
			if (local252 != null) {
				local265 = (Static168.anIntArray147[local247] >> 8) * 64 - Static278.anInt5374;
				local276 = (Static168.anIntArray147[local247] & 0xFF) * 64 - Static380.anInt6896;
				if (Static367.anInt6719 != 0) {
					local276 = 10;
					local265 = 10;
				}
				local10 &= Static380.method5245(local252, Static211.anInt4295, local265, Static209.anInt4283, local276);
			}
			local252 = Static299.aByteArrayArray5[local247];
			if (local252 != null) {
				local265 = (Static168.anIntArray147[local247] >> 8) * 64 - Static278.anInt5374;
				local276 = (Static168.anIntArray147[local247] & 0xFF) * 64 - Static380.anInt6896;
				if (Static367.anInt6719 != 0) {
					local276 = 10;
					local265 = 10;
				}
				local10 &= Static380.method5245(local252, Static211.anInt4295, local265, Static209.anInt4283, local276);
			}
		}
		if (!local10) {
			Static368.anInt6726 = 2;
			return;
		}
		if (Static368.anInt6726 != 0) {
			Static338.method5238(true, Static374.aClass158_147.method3594(Static365.anInt6682) + "<br>(100%)", Static308.aClass20_5);
		}
		Static326.method4622();
		Static312.method4476();
		@Pc(371) boolean local371 = false;
		if (Static30.aClass106_3.method5973() && Static12.aClass34_Sub1_1.aBoolean451) {
			for (local265 = 0; local265 < Static311.aByteArrayArray18.length; local265++) {
				if (Static299.aByteArrayArray5[local265] != null || Static106.aByteArrayArray8[local265] != null) {
					local371 = true;
					break;
				}
			}
		}
		if (Static12.aClass34_Sub1_1.aBoolean447) {
			local265 = Static249.anIntArray464[Static229.anInt4545];
		} else {
			local265 = Static154.anIntArray335[Static229.anInt4545];
		}
		if (Static30.aClass106_3.method5907()) {
			local265++;
		}
		Static336.method4729(Static209.anInt4283, Static211.anInt4295, local265, local371, Static30.aClass106_3.method5928() > 0);
		for (local276 = 0; local276 < 4; local276++) {
			Static19.aClass120Array1[local276].method3044();
		}
		Static273.method4062();
		Static54.method1003(false);
		Static391.method5431();
		Static311.aClass189_1 = null;
		Static326.method4622();
		System.gc();
		Static155.method2610(true);
		Static172.method2877();
		Static193.anInt4033 = Static12.aClass34_Sub1_1.method5462(Static262.anInt2805);
		Static381.aBoolean481 = Static12.aClass34_Sub1_1.aBoolean451;
		Static446.aBoolean509 = Static155.anInt3339 >= 96;
		Static343.aBoolean400 = Static12.aClass34_Sub1_1.method5466(Static262.anInt2805);
		Static201.aBoolean261 = !Static12.aClass34_Sub1_1.aBoolean444;
		Static234.anInt4634 = Static12.aClass34_Sub1_1.method5471(Static262.anInt2805) ? -1 : Static313.anInt5847;
		Static331.aBoolean383 = Static262.anInt2805 == 1 || Static12.aClass34_Sub1_1.aBoolean446;
		Static190.aBoolean245 = Static12.aClass34_Sub1_1.aBoolean458;
		Static349.aClass29_Sub1_5 = new Class29_Sub1(4, Static209.anInt4283, Static211.anInt4295, false);
		if (Static367.anInt6719 == 0) {
			Static69.method1329(Static349.aClass29_Sub1_5, Static311.aByteArrayArray18);
		} else {
			Static379.method5244(Static311.aByteArrayArray18, Static349.aClass29_Sub1_5);
		}
		Static374.method4326(Static209.anInt4283 >> 4, Static211.anInt4295 >> 4);
		Static106.method1755();
		if (local371) {
			Static272.method4042(true);
			Static44.aClass29_Sub1_4 = new Class29_Sub1(1, Static209.anInt4283, Static211.anInt4295, true);
			if (Static367.anInt6719 == 0) {
				Static69.method1329(Static44.aClass29_Sub1_4, Static106.aByteArrayArray8);
				Static155.method2610(true);
			} else {
				Static379.method5244(Static106.aByteArrayArray8, Static44.aClass29_Sub1_4);
				Static155.method2610(true);
			}
			Static44.aClass29_Sub1_4.method1545(Static349.aClass29_Sub1_5.anIntArrayArrayArray3[0]);
			Static44.aClass29_Sub1_4.method1539(null, Static30.aClass106_3, null);
			Static272.method4042(false);
		}
		Static349.aClass29_Sub1_5.method1539(Static19.aClass120Array1, Static30.aClass106_3, local371 ? Static44.aClass29_Sub1_4.anIntArrayArrayArray3 : null);
		if (Static367.anInt6719 == 0) {
			Static155.method2610(true);
			Static429.method5772(Static349.aClass29_Sub1_5, Static237.aByteArrayArray15);
			if (Static339.aByteArrayArray20 != null) {
				Static255.method3781();
			}
		} else {
			Static155.method2610(true);
			Static323.method4589(Static237.aByteArrayArray15, Static349.aClass29_Sub1_5);
		}
		Static312.method4476();
		Static155.method2610(true);
		Static349.aClass29_Sub1_5.method1534(local371 ? Static221.aClass96Array4[0] : null, Static30.aClass106_3, null);
		Static349.aClass29_Sub1_5.method1548(Static30.aClass106_3);
		Static155.method2610(true);
		if (local371) {
			Static272.method4042(true);
			Static155.method2610(true);
			if (Static367.anInt6719 == 0) {
				Static429.method5772(Static44.aClass29_Sub1_4, Static299.aByteArrayArray5);
			} else {
				Static323.method4589(Static299.aByteArrayArray5, Static44.aClass29_Sub1_4);
			}
			Static312.method4476();
			Static155.method2610(true);
			Static44.aClass29_Sub1_4.method1534(null, Static30.aClass106_3, Static262.aClass96Array3[0]);
			Static44.aClass29_Sub1_4.method1548(Static30.aClass106_3);
			Static155.method2610(true);
			Static272.method4042(false);
		}
		Static254.method3773();
		@Pc(690) int local690 = Static349.aClass29_Sub1_5.anInt2067;
		if (Static426.anInt1486 < local690) {
			local690 = Static426.anInt1486;
		}
		if (Static426.anInt1486 - 1 > local690) {
			local690 = Static426.anInt1486 - 1;
		}
		if (Static12.aClass34_Sub1_1.method5471(Static262.anInt2805)) {
			Static299.method951(0);
		} else {
			Static299.method951(local690);
		}
		@Pc(727) int local727;
		@Pc(730) int local730;
		for (@Pc(724) int local724 = 0; local724 < 4; local724++) {
			for (local727 = 0; local727 < Static209.anInt4283; local727++) {
				for (local730 = 0; local730 < Static211.anInt4295; local730++) {
					Static54.method1000(local727, local730, local724);
				}
			}
		}
		Static257.method3816();
		Static326.method4622();
		Static253.method3770();
		Static312.method4476();
		Static108.aBoolean158 = false;
		Static398.method5482();
		if (Static416.aFrame3 != null && Static388.aClass236_13 != null && Static170.anInt3494 == 10) {
			Static32.method677(Static51.aClass177_20);
			Static433.aClass1_Sub3_Sub1_11.method1197(1057001181);
		}
		if (Static367.anInt6719 == 0) {
			local727 = (Static150.anInt3209 - (Static209.anInt4283 >> 4)) / 8;
			local730 = (Static150.anInt3209 + (Static209.anInt4283 >> 4)) / 8;
			@Pc(815) int local815 = (Static76.anInt1937 - (Static211.anInt4295 >> 4)) / 8;
			@Pc(823) int local823 = (Static76.anInt1937 + (Static211.anInt4295 >> 4)) / 8;
			for (@Pc(827) int local827 = local727 - 1; local827 <= local730 + 1; local827++) {
				for (@Pc(832) int local832 = local815 - 1; local832 <= local823 + 1; local832++) {
					if (local827 < local727 || local827 > local730 || local815 > local832 || local823 < local832) {
						Static136.aClass211_36.method4763("m" + local827 + "_" + local832);
						Static136.aClass211_36.method4763("l" + local827 + "_" + local832);
					}
				}
			}
		}
		if (Static170.anInt3494 == 3) {
			Static118.method2017(2);
		} else if (Static170.anInt3494 == 7) {
			Static118.method2017(6);
		} else {
			Static118.method2017(9);
			if (Static388.aClass236_13 != null) {
				Static32.method677(Static446.aClass177_109);
			}
		}
		Static255.method3783();
		Static326.method4622();
		Static435.method5864();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BII)V")
	public static void method4628(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static266.aClass272_3 == Static268.aClass272_4) {
			if (!Static56.method1067(0, -2, arg0, arg1, 0, false, 1, 1)) {
				Static56.method1067(0, -3, arg0, arg1, 0, false, 1, 1);
			}
		} else if (!Static56.method1067(0, -3, arg0, arg1, 0, false, 1, 1)) {
			Static56.method1067(0, -2, arg0, arg1, 0, false, 1, 1);
		}
	}
}
