import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "J")
	public static long aLong47 = 0L;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!iv;")
	public static final Class168 aClass168_1 = new Class168(1);

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
	public static final int[] anIntArray97 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Z")
	public static boolean aBoolean84 = true;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method1164() {
		Static167.method2802(false);
		Static486.anInt8252 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static50.aByteArrayArray1.length; local14++) {
			if (Static544.anIntArray571[local14] != -1 && Static50.aByteArrayArray1[local14] == null) {
				Static50.aByteArrayArray1[local14] = Static235.aClass343_118.method8132(Static544.anIntArray571[local14], 0);
				if (Static50.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static486.anInt8252++;
				}
			}
			if (Static247.anIntArray268[local14] != -1 && Static289.aByteArrayArray13[local14] == null) {
				Static289.aByteArrayArray13[local14] = Static235.aClass343_118.method8137(Static247.anIntArray268[local14], Static543.anIntArrayArray54[local14], 0);
				if (Static289.aByteArrayArray13[local14] == null) {
					local12 = false;
					Static486.anInt8252++;
				}
			}
			if (Static243.anIntArray265[local14] != -1 && Static151.aByteArrayArray10[local14] == null) {
				Static151.aByteArrayArray10[local14] = Static235.aClass343_118.method8132(Static243.anIntArray265[local14], 0);
				if (Static151.aByteArrayArray10[local14] == null) {
					Static486.anInt8252++;
					local12 = false;
				}
			}
			if (Static252.anIntArray273[local14] != -1 && Static316.aByteArrayArray16[local14] == null) {
				Static316.aByteArrayArray16[local14] = Static235.aClass343_118.method8132(Static252.anIntArray273[local14], 0);
				if (Static316.aByteArrayArray16[local14] == null) {
					local12 = false;
					Static486.anInt8252++;
				}
			}
			if (Static427.anIntArray447 != null && Static606.aByteArrayArray28[local14] == null && Static427.anIntArray447[local14] != -1) {
				Static606.aByteArrayArray28[local14] = Static235.aClass343_118.method8137(Static427.anIntArray447[local14], Static543.anIntArrayArray54[local14], 0);
				if (Static606.aByteArrayArray28[local14] == null) {
					Static486.anInt8252++;
					local12 = false;
				}
			}
		}
		if (Static177.aClass76_3 == null) {
			if (Static101.aClass3_Sub7_Sub6_1 == null || !Static207.aClass343_103.method8147(Static101.aClass3_Sub7_Sub6_1.aString10 + "_staticelements")) {
				Static177.aClass76_3 = new Class76(0);
			} else if (Static207.aClass343_103.method8140(Static101.aClass3_Sub7_Sub6_1.aString10 + "_staticelements")) {
				Static177.aClass76_3 = Static168.method2810(Static207.aClass343_103, Static101.aClass3_Sub7_Sub6_1.aString10 + "_staticelements", Static166.aBoolean243);
			} else {
				local12 = false;
				Static486.anInt8252++;
			}
		}
		if (!local12) {
			Static149.anInt3034 = 1;
			return;
		}
		local12 = true;
		Static586.anInt9503 = 0;
		@Pc(279) int local279;
		@Pc(290) int local290;
		for (@Pc(260) int local260 = 0; local260 < Static50.aByteArrayArray1.length; local260++) {
			@Pc(266) byte[] local266 = Static289.aByteArrayArray13[local260];
			if (local266 != null) {
				local279 = (Static454.anIntArray476[local260] >> 8) * 64 - Static427.anInt7462;
				local290 = (Static454.anIntArray476[local260] & 0xFF) * 64 - Static22.anInt329;
				if (Static41.anInt768 != 0) {
					local279 = 10;
					local290 = 10;
				}
				local12 &= Static451.method6688(Static24.anInt345, local290, local279, local266, Static399.anInt7121);
			}
			local266 = Static316.aByteArrayArray16[local260];
			if (local266 != null) {
				local279 = (Static454.anIntArray476[local260] >> 8) * 64 - Static427.anInt7462;
				local290 = (Static454.anIntArray476[local260] & 0xFF) * 64 - Static22.anInt329;
				if (Static41.anInt768 != 0) {
					local290 = 10;
					local279 = 10;
				}
				local12 &= Static451.method6688(Static24.anInt345, local290, local279, local266, Static399.anInt7121);
			}
		}
		if (!local12) {
			Static149.anInt3034 = 2;
			return;
		}
		if (Static149.anInt3034 != 0) {
			Static447.method6682(true, Static232.aClass63_6, Static369.aClass235_15.method5893(Static455.anInt7738) + "<br>(100%)", Static240.aClass93_4, Static266.aClass82_8);
		}
		Static234.method3998();
		Static393.method7906();
		Static540.method7787();
		@Pc(395) boolean local395 = false;
		if (Static266.aClass82_8.method6183() && Static32.aClass3_Sub41_3.aClass7_Sub27_1.method8231() == 2) {
			for (local279 = 0; local279 < Static50.aByteArrayArray1.length; local279++) {
				if (Static316.aByteArrayArray16[local279] != null || Static151.aByteArrayArray10[local279] != null) {
					local395 = true;
					break;
				}
			}
		}
		if (Static32.aClass3_Sub41_3.aClass7_Sub7_1.method3298() == 1) {
			local279 = Static211.anIntArray231[Static259.anInt5050];
		} else {
			local279 = Static150.anIntArray187[Static259.anInt5050];
		}
		if (Static266.aClass82_8.method6120()) {
			local279++;
		}
		Static75.method1269(Static266.aClass82_8, Static259.anInt5039, Static399.anInt7121, Static24.anInt345, local279, local395, Static266.aClass82_8.method6131() > 0);
		Static414.method6403(Static109.anInt2200);
		if (Static109.anInt2200 == 0) {
			Static420.method6470((Class63) null);
		} else {
			Static420.method6470(Static227.aClass63_5);
		}
		for (local290 = 0; local290 < 4; local290++) {
			Static174.aClass237Array1[local290].method5911();
		}
		Static225.method3905();
		Static616.method8422(false);
		Static247.method4167();
		Static626.aClass137_1 = null;
		Static85.aBoolean122 = false;
		Static234.method3998();
		System.gc();
		Static167.method2802(true);
		Static350.method5654();
		Static164.anInt3251 = Static32.aClass3_Sub41_3.aClass7_Sub2_1.method984();
		Static464.aBoolean568 = Static248.anInt4899 >= 96;
		Static48.aBoolean705 = Static32.aClass3_Sub41_3.aClass7_Sub27_1.method8231() == 2;
		Static236.aBoolean345 = Static32.aClass3_Sub41_3.aClass7_Sub6_1.method3237() == 1;
		Static416.anInt7323 = Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() == 1 ? -1 : Static282.anInt5422;
		Static469.aBoolean573 = Static32.aClass3_Sub41_3.aClass7_Sub1_1.method189() == 1;
		Static23.aBoolean19 = Static32.aClass3_Sub41_3.aClass7_Sub28_1.method8245() == 1;
		Static206.aClass83_Sub1_2 = new Class83_Sub1(4, Static399.anInt7121, Static24.anInt345, false);
		if (Static41.anInt768 == 0) {
			Static564.method7987(Static50.aByteArrayArray1, Static206.aClass83_Sub1_2);
		} else {
			Static37.method554(Static206.aClass83_Sub1_2, Static50.aByteArrayArray1);
		}
		Static162.method2788(Static24.anInt345 >> 4, Static399.anInt7121 >> 4);
		Static248.method4182();
		if (local395) {
			Static623.method8471(true);
			Static169.aClass83_Sub1_1 = new Class83_Sub1(1, Static399.anInt7121, Static24.anInt345, true);
			if (Static41.anInt768 == 0) {
				Static564.method7987(Static151.aByteArrayArray10, Static169.aClass83_Sub1_1);
				Static167.method2802(true);
			} else {
				Static37.method554(Static169.aClass83_Sub1_1, Static151.aByteArrayArray10);
				Static167.method2802(true);
			}
			Static169.aClass83_Sub1_1.method7804(Static206.aClass83_Sub1_2.anIntArrayArrayArray36[0]);
			Static169.aClass83_Sub1_1.method7806((int[][][]) null, (Class237[]) null, Static266.aClass82_8);
			Static623.method8471(false);
		}
		Static206.aClass83_Sub1_2.method7806(local395 ? Static169.aClass83_Sub1_1.anIntArrayArrayArray36 : null, Static174.aClass237Array1, Static266.aClass82_8);
		if (Static41.anInt768 == 0) {
			Static167.method2802(true);
			Static389.method6078(Static206.aClass83_Sub1_2, Static289.aByteArrayArray13);
			if (Static606.aByteArrayArray28 != null) {
				Static494.method7229();
			}
		} else {
			Static167.method2802(true);
			Static330.method5400(Static206.aClass83_Sub1_2, Static289.aByteArrayArray13);
		}
		Static393.method7906();
		if (Static248.anInt4899 < 96) {
			Static407.method6327();
		}
		Static167.method2802(true);
		Static206.aClass83_Sub1_2.method7803(local395 ? Static485.aClass91Array1[0] : null, (Class91) null, Static266.aClass82_8);
		Static206.aClass83_Sub1_2.method7820(false, Static266.aClass82_8);
		Static167.method2802(true);
		if (local395) {
			Static623.method8471(true);
			Static167.method2802(true);
			if (Static41.anInt768 == 0) {
				Static389.method6078(Static169.aClass83_Sub1_1, Static316.aByteArrayArray16);
			} else {
				Static330.method5400(Static169.aClass83_Sub1_1, Static316.aByteArrayArray16);
			}
			Static393.method7906();
			Static167.method2802(true);
			Static169.aClass83_Sub1_1.method7803((Class91) null, Static518.aClass91Array2[0], Static266.aClass82_8);
			Static169.aClass83_Sub1_1.method7820(true, Static266.aClass82_8);
			Static167.method2802(true);
			Static623.method8471(false);
		}
		Static343.method5465();
		@Pc(785) int local785 = Static206.aClass83_Sub1_2.anInt9104;
		if (Static65.anInt1298 < local785) {
			local785 = Static65.anInt1298;
		}
		if (Static65.anInt1298 - 1 > local785) {
			local785 = Static65.anInt1298 - 1;
		}
		if (Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() == 0) {
			Static557.method7912(local785);
		} else {
			Static557.method7912(0);
		}
		@Pc(827) int local827;
		@Pc(831) int local831;
		for (@Pc(823) int local823 = 0; local823 < 4; local823++) {
			for (local827 = 0; local827 < Static399.anInt7121; local827++) {
				for (local831 = 0; local831 < Static24.anInt345; local831++) {
					Static61.method1047(local823, local831, local827);
				}
			}
		}
		Static212.method3299();
		Static234.method3998();
		Static500.method7268();
		Static393.method7906();
		Static370.method5897();
		@Pc(890) Class3_Sub27 local890;
		if (Static190.aFrame1 != null && Static547.aClass197_1 != null && Static82.anInt1653 == 11) {
			local890 = Static59.method1040(Static325.aClass20_2, Static360.aClass314_101);
			local890.aClass3_Sub9_Sub2_2.method5601(1057001181);
			Static148.method2572(local890);
		}
		if (Static41.anInt768 == 0) {
			local827 = (Static270.anInt5273 - (Static399.anInt7121 >> 4)) / 8;
			local831 = ((Static399.anInt7121 >> 4) + Static270.anInt5273) / 8;
			@Pc(926) int local926 = (Static263.anInt5102 - (Static24.anInt345 >> 4)) / 8;
			@Pc(934) int local934 = ((Static24.anInt345 >> 4) + Static263.anInt5102) / 8;
			for (@Pc(938) int local938 = local827 - 1; local938 <= local831 + 1; local938++) {
				for (@Pc(944) int local944 = local926 - 1; local944 <= local934 + 1; local944++) {
					if (local938 < local827 || local831 < local938 || local944 < local926 || local934 < local944) {
						Static235.aClass343_118.method8155("m" + local938 + "_" + local944);
						Static235.aClass343_118.method8155("l" + local938 + "_" + local944);
					}
				}
			}
		}
		if (Static82.anInt1653 == 4) {
			Static206.method3226(3);
		} else if (Static82.anInt1653 == 8) {
			Static206.method3226(7);
		} else {
			Static206.method3226(10);
			if (Static547.aClass197_1 != null) {
				local890 = Static59.method1040(Static325.aClass20_2, Static527.aClass314_131);
				Static148.method2572(local890);
			}
		}
		Static641.method8591();
		Static234.method3998();
		Static617.method8426();
		Static334.aBoolean462 = true;
		if (Static65.aBoolean79) {
			Static8.method147("Took: " + (Static191.method3071() - Static257.aLong135) + "ms");
			Static65.aBoolean79 = false;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZIIIIII)V")
	public static void method1165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0 + arg3;
		@Pc(14) int local14 = arg5 - arg3;
		for (@Pc(16) int local16 = arg0; local16 < local9; local16++) {
			Static82.method1400(arg6, arg4, arg2, Static71.anIntArrayArray5[local16]);
		}
		@Pc(38) int local38 = arg3 + arg4;
		for (@Pc(40) int local40 = arg5; local40 > local14; local40--) {
			Static82.method1400(arg6, arg4, arg2, Static71.anIntArrayArray5[local40]);
		}
		@Pc(64) int local64 = arg2 - arg3;
		for (@Pc(66) int local66 = local9; local66 <= local14; local66++) {
			@Pc(72) int[] local72 = Static71.anIntArrayArray5[local66];
			Static82.method1400(arg6, arg4, local38, local72);
			Static82.method1400(arg1, local38, local64, local72);
			Static82.method1400(arg6, local64, arg2, local72);
		}
	}
}
