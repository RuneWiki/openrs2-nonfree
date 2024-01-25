import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	public static int anInt4880 = 0;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_81 = new Class397(36, -2);

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_47 = new Class144(51, 3);

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	public static int anInt4881 = -1;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method4483() {
		Static315.method4631(false);
		Static294.anInt4507 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static592.aByteArrayArray14.length; local14++) {
			if (Static266.anIntArray325[local14] != -1 && Static592.aByteArrayArray14[local14] == null) {
				Static592.aByteArrayArray14[local14] = Static699.aClass182_127.method3985(0, Static266.anIntArray325[local14]);
				if (Static592.aByteArrayArray14[local14] == null) {
					Static294.anInt4507++;
					local12 = false;
				}
			}
			if (Static22.anIntArray50[local14] != -1 && Static169.aByteArrayArray3[local14] == null) {
				Static169.aByteArrayArray3[local14] = Static699.aClass182_127.method3979(Static297.anIntArrayArray21[local14], 0, Static22.anIntArray50[local14]);
				if (Static169.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static294.anInt4507++;
				}
			}
			if (Static253.anIntArray292[local14] != -1 && Static699.aByteArrayArray23[local14] == null) {
				Static699.aByteArrayArray23[local14] = Static699.aClass182_127.method3985(0, Static253.anIntArray292[local14]);
				if (Static699.aByteArrayArray23[local14] == null) {
					Static294.anInt4507++;
					local12 = false;
				}
			}
			if (Static469.anIntArray550[local14] != -1 && Static176.aByteArrayArray4[local14] == null) {
				Static176.aByteArrayArray4[local14] = Static699.aClass182_127.method3985(0, Static469.anIntArray550[local14]);
				if (Static176.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static294.anInt4507++;
				}
			}
			if (Static223.anIntArray250 != null && Static186.aByteArrayArray5[local14] == null && Static223.anIntArray250[local14] != -1) {
				Static186.aByteArrayArray5[local14] = Static699.aClass182_127.method3979(Static297.anIntArrayArray21[local14], 0, Static223.anIntArray250[local14]);
				if (Static186.aByteArrayArray5[local14] == null) {
					Static294.anInt4507++;
					local12 = false;
				}
			}
		}
		if (Static242.aClass377_3 == null) {
			if (Static336.aClass3_Sub7_Sub18_3 == null || !Static196.aClass182_65.method3973(Static336.aClass3_Sub7_Sub18_3.aString98 + "_staticelements")) {
				Static242.aClass377_3 = new Class377(0);
			} else if (Static196.aClass182_65.method3953(Static336.aClass3_Sub7_Sub18_3.aString98 + "_staticelements")) {
				Static242.aClass377_3 = Static353.method4959(Static5.aBoolean3, Static196.aClass182_65, Static336.aClass3_Sub7_Sub18_3.aString98 + "_staticelements");
			} else {
				local12 = false;
				Static294.anInt4507++;
			}
		}
		if (!local12) {
			Static104.anInt2258 = 1;
			return;
		}
		Static208.anInt3445 = 0;
		local12 = true;
		@Pc(312) int local312;
		@Pc(323) int local323;
		for (@Pc(293) int local293 = 0; local293 < Static592.aByteArrayArray14.length; local293++) {
			@Pc(299) byte[] local299 = Static169.aByteArrayArray3[local293];
			if (local299 != null) {
				local312 = (Static385.anIntArray437[local293] >> 8) * 64 - Static291.anInt4448;
				local323 = (Static385.anIntArray437[local293] & 0xFF) * 64 - Static189.anInt3243;
				if (Static49.anInt1325 != 0) {
					local323 = 10;
					local312 = 10;
				}
				local12 &= Static403.method5443(Static646.anInt9979, Static497.anInt7926, local323, local299, local312);
			}
			local299 = Static176.aByteArrayArray4[local293];
			if (local299 != null) {
				local312 = (Static385.anIntArray437[local293] >> 8) * 64 - Static291.anInt4448;
				local323 = (Static385.anIntArray437[local293] & 0xFF) * 64 - Static189.anInt3243;
				if (Static49.anInt1325 != 0) {
					local323 = 10;
					local312 = 10;
				}
				local12 &= Static403.method5443(Static646.anInt9979, Static497.anInt7926, local323, local299, local312);
			}
		}
		if (!local12) {
			Static104.anInt2258 = 2;
			return;
		}
		if (Static104.anInt2258 != 0) {
			Static472.method6430(Static153.aClass22_4, true, Static480.aClass57_9, Static52.aClass169_1, Static430.aClass257_12.method5699(Static456.anInt7118) + "<br>(100%)");
		}
		Static445.method5895();
		Static473.method6434();
		Static194.method3001();
		@Pc(435) boolean local435 = false;
		if (Static153.aClass22_4.method9342() && Static580.aClass3_Sub22_24.aClass21_Sub25_1.method7954() == 2) {
			for (local312 = 0; local312 < Static592.aByteArrayArray14.length; local312++) {
				if (Static176.aByteArrayArray4[local312] != null || Static699.aByteArrayArray23[local312] != null) {
					local435 = true;
					break;
				}
			}
		}
		if (Static580.aClass3_Sub22_24.aClass21_Sub8_1.method3997() == 1) {
			local312 = Static227.anIntArray268[Static203.anInt3380];
		} else {
			local312 = Static623.anIntArray696[Static203.anInt3380];
		}
		if (Static153.aClass22_4.method9379()) {
			local312++;
		}
		Static487.method6608(Static153.aClass22_4, Static219.anInt3590, Static497.anInt7926, Static646.anInt9979, local312, local435, Static153.aClass22_4.method9362() > 0);
		Static670.method8991(Static644.anInt9956);
		if (Static644.anInt9956 == 0) {
			Static465.method6289((Class57) null);
		} else {
			Static465.method6289(Static607.aClass57_12);
		}
		for (local323 = 0; local323 < 4; local323++) {
			Static455.aClass109Array1[local323].method2731();
		}
		Static541.method7182();
		Static675.method9007(false);
		Static177.method2858();
		Static332.aBoolean354 = false;
		Static445.method5895();
		System.gc();
		Static315.method4631(true);
		Static471.method6408();
		Static366.anInt5734 = Static580.aClass3_Sub22_24.aClass21_Sub30_1.method9242();
		Static243.aBoolean240 = Static7.anInt229 >= 96;
		Static468.aBoolean495 = Static580.aClass3_Sub22_24.aClass21_Sub25_1.method7954() == 2;
		Static92.aBoolean152 = Static580.aClass3_Sub22_24.aClass21_Sub2_1.method1740() == 1;
		Static466.anInt7299 = Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() == 1 ? -1 : Static606.anInt9196;
		Static185.aBoolean203 = Static580.aClass3_Sub22_24.aClass21_Sub22_1.method7245() == 1;
		Static557.aBoolean569 = Static580.aClass3_Sub22_24.aClass21_Sub27_1.method8320() == 1;
		Static414.aClass114_Sub1_15 = new Class114_Sub1(4, Static497.anInt7926, Static646.anInt9979, false);
		if (Static49.anInt1325 == 0) {
			Static56.method1310(Static414.aClass114_Sub1_15, Static592.aByteArrayArray14);
		} else {
			Static358.method4992(Static592.aByteArrayArray14, Static414.aClass114_Sub1_15);
		}
		Static481.method6509(Static497.anInt7926 >> 4, Static646.anInt9979 >> 4);
		Static125.method2294();
		if (local435) {
			Static204.method3094(true);
			Static135.aClass114_Sub1_21 = new Class114_Sub1(1, Static497.anInt7926, Static646.anInt9979, true);
			if (Static49.anInt1325 == 0) {
				Static56.method1310(Static135.aClass114_Sub1_21, Static699.aByteArrayArray23);
				Static315.method4631(true);
			} else {
				Static358.method4992(Static699.aByteArrayArray23, Static135.aClass114_Sub1_21);
				Static315.method4631(true);
			}
			Static135.aClass114_Sub1_21.method8678(Static414.aClass114_Sub1_15.anIntArrayArrayArray14[0]);
			Static135.aClass114_Sub1_21.method8682(Static153.aClass22_4, (int[][][]) null, (Class109[]) null);
			Static204.method3094(false);
		}
		Static414.aClass114_Sub1_15.method8682(Static153.aClass22_4, local435 ? Static135.aClass114_Sub1_21.anIntArrayArrayArray14 : null, Static455.aClass109Array1);
		if (Static49.anInt1325 == 0) {
			Static315.method4631(true);
			Static709.method9462(Static169.aByteArrayArray3, Static414.aClass114_Sub1_15);
			if (Static186.aByteArrayArray5 != null) {
				Static180.method2873();
			}
		} else {
			Static315.method4631(true);
			Static609.method7808(Static414.aClass114_Sub1_15, Static169.aByteArrayArray3);
		}
		Static473.method6434();
		if (Static7.anInt229 < 96) {
			Static393.method5323();
		}
		Static315.method4631(true);
		Static414.aClass114_Sub1_15.method8687(Static153.aClass22_4, (Class259) null, local435 ? Static378.aClass259Array2[0] : null);
		Static414.aClass114_Sub1_15.method8698(false, Static153.aClass22_4);
		Static315.method4631(true);
		if (local435) {
			Static204.method3094(true);
			Static315.method4631(true);
			if (Static49.anInt1325 == 0) {
				Static709.method9462(Static176.aByteArrayArray4, Static135.aClass114_Sub1_21);
			} else {
				Static609.method7808(Static135.aClass114_Sub1_21, Static176.aByteArrayArray4);
			}
			Static473.method6434();
			Static315.method4631(true);
			Static135.aClass114_Sub1_21.method8687(Static153.aClass22_4, Static43.aClass259Array1[0], (Class259) null);
			Static135.aClass114_Sub1_21.method8698(true, Static153.aClass22_4);
			Static315.method4631(true);
			Static204.method3094(false);
		}
		Static706.method9430();
		@Pc(867) int local867 = Static414.aClass114_Sub1_15.anInt10218;
		if (local867 > Static723.anInt11225) {
			local867 = Static723.anInt11225;
		}
		if (local867 < Static723.anInt11225 - 1) {
			local867 = Static723.anInt11225 - 1;
		}
		if (Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() == 0) {
			Static730.method9537(local867);
		} else {
			Static730.method9537(0);
		}
		@Pc(911) int local911;
		@Pc(915) int local915;
		for (@Pc(905) int local905 = 0; local905 < 4; local905++) {
			for (local911 = 0; local911 < Static497.anInt7926; local911++) {
				for (local915 = 0; local915 < Static646.anInt9979; local915++) {
					Static332.method4778(local915, local905, local911);
				}
			}
		}
		Static436.method5765();
		Static445.method5895();
		Static600.method7710();
		Static473.method6434();
		Static609.method7805();
		@Pc(984) Class3_Sub29 local984;
		if (Static628.aFrame2 != null && Static95.aClass292_2.aClass118_2 != null && Static98.anInt2140 == 12) {
			local984 = Static507.method6901(Static7.aClass144_2, Static95.aClass292_2.aClass88_2);
			local984.aClass3_Sub2_Sub1_1.method2018(1057001181);
			Static95.aClass292_2.method6855(local984);
		}
		if (Static49.anInt1325 == 0) {
			local911 = (Static67.anInt1612 - (Static497.anInt7926 >> 4)) / 8;
			local915 = ((Static497.anInt7926 >> 4) + Static67.anInt1612) / 8;
			@Pc(1026) int local1026 = (Static654.anInt10061 - (Static646.anInt9979 >> 4)) / 8;
			@Pc(1034) int local1034 = (Static654.anInt10061 + (Static646.anInt9979 >> 4)) / 8;
			for (@Pc(1038) int local1038 = local911 - 1; local1038 <= local915 + 1; local1038++) {
				for (@Pc(1044) int local1044 = local1026 - 1; local1044 <= local1034 + 1; local1044++) {
					if (local1038 < local911 || local1038 > local915 || local1044 < local1026 || local1034 < local1044) {
						Static699.aClass182_127.method3972("m" + local1038 + "_" + local1044);
						Static699.aClass182_127.method3972("l" + local1038 + "_" + local1044);
					}
				}
			}
		}
		if (Static98.anInt2140 == 4) {
			Static336.method4832(3);
		} else if (Static98.anInt2140 == 8) {
			Static336.method4832(7);
		} else if (Static98.anInt2140 == 10) {
			Static336.method4832(9);
		} else {
			Static336.method4832(11);
			if (Static95.aClass292_2.aClass118_2 != null) {
				local984 = Static507.method6901(Static57.aClass144_11, Static95.aClass292_2.aClass88_2);
				Static95.aClass292_2.method6855(local984);
			}
		}
		Static628.method8262();
		Static445.method5895();
		Static32.method1057(94);
		Static632.aBoolean653 = true;
		if (Static296.aBoolean291) {
			Static369.method5071("Took: " + (Static517.method6965() - Static726.aLong344) + "ms");
			Static296.aBoolean291 = false;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
	public static void method4484() {
		Static144.method2456(Static580.aClass3_Sub22_24.aClass21_Sub3_1.method1940() == 1);
		Static467.aClass107_3 = Static358.method4995(Static508.aCanvas8, 22050, 0, Static122.aClass47_1);
		Static666.method8675(Static551.method7224((Class3_Sub33_Sub3) null));
		Static93.aClass107_1 = Static358.method4995(Static508.aCanvas8, 2048, 1, Static122.aClass47_1);
		Static391.aClass3_Sub33_Sub4_1 = new Class3_Sub33_Sub4();
		Static93.aClass107_1.method5377(Static391.aClass3_Sub33_Sub4_1);
		Static53.aClass359_1 = new Class359(22050, Static330.anInt9773);
		Static217.method3246();
	}
}
