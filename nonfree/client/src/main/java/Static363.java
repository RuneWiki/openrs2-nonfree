import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "[Lclient!ei;")
	public static Class89_Sub1[] aClass89_Sub1Array4;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "Lclient!on;")
	public static Class254 aClass254_9;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_75 = new Class179(25, 6);

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
	public static int anInt5740 = 0;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
	public static int anInt5741 = -1;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	public static void method4914() {
		Static206.method2919(false);
		Static380.anInt5922 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static403.aByteArrayArray22.length; local14++) {
			if (Static60.anIntArray91[local14] != -1 && Static403.aByteArrayArray22[local14] == null) {
				Static403.aByteArrayArray22[local14] = Static280.aClass380_67.method8620(Static60.anIntArray91[local14], 0);
				if (Static403.aByteArrayArray22[local14] == null) {
					Static380.anInt5922++;
					local12 = false;
				}
			}
			if (Static439.anIntArray503[local14] != -1 && Static4.aByteArrayArray1[local14] == null) {
				Static4.aByteArrayArray1[local14] = Static280.aClass380_67.method8630(Static439.anIntArray503[local14], 0, Static220.anIntArrayArray16[local14]);
				if (Static4.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static380.anInt5922++;
				}
			}
			if (Static352.anIntArray395[local14] != -1 && Static508.aByteArrayArray26[local14] == null) {
				Static508.aByteArrayArray26[local14] = Static280.aClass380_67.method8620(Static352.anIntArray395[local14], 0);
				if (Static508.aByteArrayArray26[local14] == null) {
					Static380.anInt5922++;
					local12 = false;
				}
			}
			if (Static416.anIntArray474[local14] != -1 && Static388.aByteArrayArray21[local14] == null) {
				Static388.aByteArrayArray21[local14] = Static280.aClass380_67.method8620(Static416.anIntArray474[local14], 0);
				if (Static388.aByteArrayArray21[local14] == null) {
					local12 = false;
					Static380.anInt5922++;
				}
			}
			if (Static399.anIntArray466 != null && Static171.aByteArrayArray9[local14] == null && Static399.anIntArray466[local14] != -1) {
				Static171.aByteArrayArray9[local14] = Static280.aClass380_67.method8630(Static399.anIntArray466[local14], 0, Static220.anIntArrayArray16[local14]);
				if (Static171.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static380.anInt5922++;
				}
			}
		}
		if (Static146.aClass84_3 == null) {
			if (Static61.aClass2_Sub2_Sub9_1 == null || !Static416.aClass380_99.method8608(Static61.aClass2_Sub2_Sub9_1.aString27 + "_staticelements")) {
				Static146.aClass84_3 = new Class84(0);
			} else if (Static416.aClass380_99.method8641(Static61.aClass2_Sub2_Sub9_1.aString27 + "_staticelements")) {
				Static146.aClass84_3 = Static15.method226(Static61.aClass2_Sub2_Sub9_1.aString27 + "_staticelements", Static416.aClass380_99, Static570.aBoolean690);
			} else {
				local12 = false;
				Static380.anInt5922++;
			}
		}
		if (!local12) {
			Static275.anInt4390 = 1;
			return;
		}
		local12 = true;
		Static483.anInt7695 = 0;
		@Pc(269) int local269;
		@Pc(279) int local279;
		for (@Pc(250) int local250 = 0; local250 < Static403.aByteArrayArray22.length; local250++) {
			@Pc(256) byte[] local256 = Static4.aByteArrayArray1[local250];
			if (local256 != null) {
				local269 = (Static407.anIntArray620[local250] >> 8) * 64 - Static132.anInt2246;
				local279 = (Static407.anIntArray620[local250] & 0xFF) * 64 - Static123.anInt2176;
				if (Static592.anInt9602 != 0) {
					local279 = 10;
					local269 = 10;
				}
				local12 &= Static205.method5464(Static162.anInt2911, local256, local279, local269, Static228.anInt3704);
			}
			local256 = Static388.aByteArrayArray21[local250];
			if (local256 != null) {
				local269 = (Static407.anIntArray620[local250] >> 8) * 64 - Static132.anInt2246;
				local279 = (Static407.anIntArray620[local250] & 0xFF) * 64 - Static123.anInt2176;
				if (Static592.anInt9602 != 0) {
					local279 = 10;
					local269 = 10;
				}
				local12 &= Static205.method5464(Static162.anInt2911, local256, local279, local269, Static228.anInt3704);
			}
		}
		if (!local12) {
			Static275.anInt4390 = 2;
			return;
		}
		if (Static275.anInt4390 != 0) {
			Static445.method6068(Static389.aClass256_13, Static434.aClass271_12.method5972(Static483.anInt7694) + "<br>(100%)", Static505.aClass62_21, true, Static192.aClass95_4);
		}
		Static48.method803();
		Static88.method1312();
		Static620.method8303();
		@Pc(381) boolean local381 = false;
		if (Static192.aClass95_4.method6964() && Static234.aClass2_Sub5_48.aClass6_Sub15_1.method4218() == 2) {
			for (local269 = 0; local269 < Static403.aByteArrayArray22.length; local269++) {
				if (Static388.aByteArrayArray21[local269] != null || Static508.aByteArrayArray26[local269] != null) {
					local381 = true;
					break;
				}
			}
		}
		if (Static234.aClass2_Sub5_48.aClass6_Sub6_1.method2780() == 1) {
			local269 = Static271.anIntArray290[Static612.anInt9862];
		} else {
			local269 = Static644.anIntArray697[Static612.anInt9862];
		}
		if (Static192.aClass95_4.method6932()) {
			local269++;
		}
		Static93.method1442(Static192.aClass95_4, Static429.anInt6737, Static228.anInt3704, Static162.anInt2911, local269, local381, Static192.aClass95_4.method6994() > 0);
		Static522.method7265(Static541.anInt8880);
		if (Static541.anInt8880 == 0) {
			Static116.method1717(null);
		} else {
			Static116.method1717(Static139.aClass62_7);
		}
		for (local279 = 0; local279 < 4; local279++) {
			Static230.aClass240Array1[local279].method5187();
		}
		Static129.method7549();
		Static99.method6065(false);
		method4915();
		Static382.aClass160_1 = null;
		Static540.aBoolean665 = false;
		Static48.method803();
		System.gc();
		Static206.method2919(true);
		Static187.method2725();
		Static51.anInt1073 = Static234.aClass2_Sub5_48.aClass6_Sub24_1.method7575();
		Static127.aBoolean164 = Static234.anInt10094 >= 96;
		Static432.aBoolean529 = Static234.aClass2_Sub5_48.aClass6_Sub15_1.method4218() == 2;
		Static335.aBoolean381 = Static234.aClass2_Sub5_48.aClass6_Sub17_1.method4403() == 1;
		Static566.anInt9254 = Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() == 1 ? -1 : Static130.anInt2239;
		Static236.aBoolean275 = Static234.aClass2_Sub5_48.aClass6_Sub10_1.method3108() == 1;
		Static187.aBoolean235 = Static234.aClass2_Sub5_48.aClass6_Sub25_1.method8110() == 1;
		Static365.aClass275_Sub1_2 = new Class275_Sub1(4, Static228.anInt3704, Static162.anInt2911, false);
		if (Static592.anInt9602 == 0) {
			Static94.method1466(Static403.aByteArrayArray22, Static365.aClass275_Sub1_2);
		} else {
			Static108.method1611(Static403.aByteArrayArray22, Static365.aClass275_Sub1_2);
		}
		Static634.method8476(Static162.anInt2911 >> 4, Static228.anInt3704 >> 4);
		Static384.method5146();
		if (local381) {
			Static643.method8627(true);
			Static351.aClass275_Sub1_1 = new Class275_Sub1(1, Static228.anInt3704, Static162.anInt2911, true);
			if (Static592.anInt9602 == 0) {
				Static94.method1466(Static508.aByteArrayArray26, Static351.aClass275_Sub1_1);
				Static206.method2919(true);
			} else {
				Static108.method1611(Static508.aByteArrayArray26, Static351.aClass275_Sub1_1);
				Static206.method2919(true);
			}
			Static351.aClass275_Sub1_1.method7615(Static365.aClass275_Sub1_2.anIntArrayArrayArray20[0]);
			Static351.aClass275_Sub1_1.method7614(Static192.aClass95_4, null, null);
			Static643.method8627(false);
		}
		Static365.aClass275_Sub1_2.method7614(Static192.aClass95_4, Static230.aClass240Array1, local381 ? Static351.aClass275_Sub1_1.anIntArrayArrayArray20 : null);
		if (Static592.anInt9602 == 0) {
			Static206.method2919(true);
			Static611.method8221(Static4.aByteArrayArray1, Static365.aClass275_Sub1_2);
			if (Static171.aByteArrayArray9 != null) {
				Static217.method2984();
			}
		} else {
			Static206.method2919(true);
			Static511.method7192(Static365.aClass275_Sub1_2, Static4.aByteArrayArray1);
		}
		Static88.method1312();
		if (Static234.anInt10094 < 96) {
			Static237.method3328();
		}
		Static206.method2919(true);
		Static365.aClass275_Sub1_2.method7611(Static192.aClass95_4, null, local381 ? Static313.aClass76Array1[0] : null);
		Static365.aClass275_Sub1_2.method7630(Static192.aClass95_4, false);
		Static206.method2919(true);
		if (local381) {
			Static643.method8627(true);
			Static206.method2919(true);
			if (Static592.anInt9602 == 0) {
				Static611.method8221(Static388.aByteArrayArray21, Static351.aClass275_Sub1_1);
			} else {
				Static511.method7192(Static351.aClass275_Sub1_1, Static388.aByteArrayArray21);
			}
			Static88.method1312();
			Static206.method2919(true);
			Static351.aClass275_Sub1_1.method7611(Static192.aClass95_4, Static462.aClass76Array3[0], null);
			Static351.aClass275_Sub1_1.method7630(Static192.aClass95_4, true);
			Static206.method2919(true);
			Static643.method8627(false);
		}
		Static632.method8448();
		@Pc(780) int local780 = Static365.aClass275_Sub1_2.anInt9089;
		if (Static91.anInt1705 < local780) {
			local780 = Static91.anInt1705;
		}
		if (local780 < Static91.anInt1705 - 1) {
			local780 = Static91.anInt1705 - 1;
		}
		if (Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() == 0) {
			Static242.method3400(local780);
		} else {
			Static242.method3400(0);
		}
		@Pc(819) int local819;
		@Pc(823) int local823;
		for (@Pc(815) int local815 = 0; local815 < 4; local815++) {
			for (local819 = 0; local819 < Static228.anInt3704; local819++) {
				for (local823 = 0; local823 < Static162.anInt2911; local823++) {
					Static185.method2704(local823, local819, local815);
				}
			}
		}
		Static422.method5643();
		Static48.method803();
		Static333.method4499();
		Static88.method1312();
		Static17.method251();
		@Pc(876) Class2_Sub40 local876;
		if (Static202.aFrame2 != null && Static155.aClass121_2 != null && Static324.anInt5145 == 11) {
			local876 = Static464.method6285(Static251.aClass131_1, Static137.aClass179_31);
			local876.aClass2_Sub22_Sub2_2.method8552(1057001181);
			Static528.method7295(local876);
		}
		if (Static592.anInt9602 == 0) {
			local819 = (Static22.anInt551 - (Static228.anInt3704 >> 4)) / 8;
			local823 = (Static22.anInt551 + (Static228.anInt3704 >> 4)) / 8;
			@Pc(915) int local915 = (Static8.anInt114 - (Static162.anInt2911 >> 4)) / 8;
			@Pc(923) int local923 = ((Static162.anInt2911 >> 4) + Static8.anInt114) / 8;
			for (@Pc(927) int local927 = local819 - 1; local927 <= local823 + 1; local927++) {
				for (@Pc(933) int local933 = local915 - 1; local933 <= local923 + 1; local933++) {
					if (local927 < local819 || local927 > local823 || local915 > local933 || local923 < local933) {
						Static280.aClass380_67.method8605("m" + local927 + "_" + local933);
						Static280.aClass380_67.method8605("l" + local927 + "_" + local933);
					}
				}
			}
		}
		if (Static324.anInt5145 == 4) {
			Static158.method2370(3);
		} else if (Static324.anInt5145 == 8) {
			Static158.method2370(7);
		} else {
			Static158.method2370(10);
			if (Static155.aClass121_2 != null) {
				local876 = Static464.method6285(Static251.aClass131_1, Static12.aClass179_2);
				Static528.method7295(local876);
			}
		}
		Static202.method2856();
		Static48.method803();
		Static266.method3743();
		Static116.aBoolean155 = true;
		if (Static356.aBoolean408) {
			Static338.method4547("Took: " + (Static476.method6413() - Static168.aLong90) + "ms");
			Static356.aBoolean408 = false;
		}
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V")
	public static void method4915() {
		for (@Pc(7) int local7 = 0; local7 < Static113.aClass350ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static113.aClass350ArrayArray1[local7].length; local11++) {
				Static113.aClass350ArrayArray1[local7][local11] = Static642.aClass350_2;
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIB)I")
	public static int method4916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg1 & arg2 - 1;
		@Pc(30) int local30 = Static198.method7009(local7, local17);
		@Pc(37) int local37 = Static198.method7009(local7 + 1, local17);
		@Pc(46) int local46 = Static198.method7009(local7, local17 + 1);
		@Pc(55) int local55 = Static198.method7009(local7 + 1, local17 + 1);
		@Pc(62) int local62 = Static310.method4219(local13, arg2, local30, local37);
		@Pc(69) int local69 = Static310.method4219(local13, arg2, local46, local55);
		return Static310.method4219(local23, arg2, local62, local69);
	}
}
