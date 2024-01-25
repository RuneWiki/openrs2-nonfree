import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!of", name = "g", descriptor = "I")
	public static int anInt6285;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	public static int anInt6280 = -1;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!vg;")
	public static Class341 aClass341_17 = null;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Z")
	public static boolean method5046(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static164.method7473(arg0, arg1) & Static218.method3385(arg1, arg0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public static void method5047() {
		Static541.method7393(false);
		Static246.anInt4520 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static269.aByteArrayArray20.length; local14++) {
			if (Static259.anIntArray367[local14] != -1 && Static269.aByteArrayArray20[local14] == null) {
				Static269.aByteArrayArray20[local14] = Static559.aClass270_116.method5704(Static259.anIntArray367[local14], 0);
				if (Static269.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static246.anInt4520++;
				}
			}
			if (Static162.anIntArray263[local14] != -1 && Static103.aByteArrayArray11[local14] == null) {
				Static103.aByteArrayArray11[local14] = Static559.aClass270_116.method5670(Static162.anIntArray263[local14], Static342.anIntArrayArray132[local14], 0);
				if (Static103.aByteArrayArray11[local14] == null) {
					local12 = false;
					Static246.anInt4520++;
				}
			}
			if (Static279.anIntArray375[local14] != -1 && Static317.aByteArrayArray21[local14] == null) {
				Static317.aByteArrayArray21[local14] = Static559.aClass270_116.method5704(Static279.anIntArray375[local14], 0);
				if (Static317.aByteArrayArray21[local14] == null) {
					Static246.anInt4520++;
					local12 = false;
				}
			}
			if (Static405.anIntArray542[local14] != -1 && Static173.aByteArrayArray15[local14] == null) {
				Static173.aByteArrayArray15[local14] = Static559.aClass270_116.method5704(Static405.anIntArray542[local14], 0);
				if (Static173.aByteArrayArray15[local14] == null) {
					Static246.anInt4520++;
					local12 = false;
				}
			}
			if (Static101.anIntArray182 != null && Static481.aByteArrayArray30[local14] == null && Static101.anIntArray182[local14] != -1) {
				Static481.aByteArrayArray30[local14] = Static559.aClass270_116.method5670(Static101.anIntArray182[local14], Static342.anIntArrayArray132[local14], 0);
				if (Static481.aByteArrayArray30[local14] == null) {
					local12 = false;
					Static246.anInt4520++;
				}
			}
		}
		if (Static439.aClass13_3 == null) {
			if (Static505.aClass1_Sub6_Sub11_3 == null || !Static129.aClass270_30.method5689(Static505.aClass1_Sub6_Sub11_3.aString66 + "_staticelements")) {
				Static439.aClass13_3 = new Class13(0);
			} else if (Static129.aClass270_30.method5698(Static505.aClass1_Sub6_Sub11_3.aString66 + "_staticelements")) {
				Static439.aClass13_3 = Static237.method3600(Static129.aClass270_30, Static505.aClass1_Sub6_Sub11_3.aString66 + "_staticelements", Static154.aBoolean211);
			} else {
				local12 = false;
				Static246.anInt4520++;
			}
		}
		if (!local12) {
			Static157.anInt2860 = 1;
			return;
		}
		Static2.anInt50 = 0;
		local12 = true;
		@Pc(264) int local264;
		@Pc(275) int local275;
		for (@Pc(245) int local245 = 0; local245 < Static269.aByteArrayArray20.length; local245++) {
			@Pc(251) byte[] local251 = Static103.aByteArrayArray11[local245];
			if (local251 != null) {
				local264 = (Static566.anIntArray710[local245] >> 8) * 64 - Static541.anInt9058;
				local275 = (Static566.anIntArray710[local245] & 0xFF) * 64 - Static116.anInt2289;
				if (Static90.anInt1938 != 0) {
					local264 = 10;
					local275 = 10;
				}
				local12 &= Static325.method4454(Static71.anInt1410, local264, local251, Static471.anInt8012, local275);
			}
			local251 = Static173.aByteArrayArray15[local245];
			if (local251 != null) {
				local264 = (Static566.anIntArray710[local245] >> 8) * 64 - Static541.anInt9058;
				local275 = (Static566.anIntArray710[local245] & 0xFF) * 64 - Static116.anInt2289;
				if (Static90.anInt1938 != 0) {
					local264 = 10;
					local275 = 10;
				}
				local12 &= Static325.method4454(Static71.anInt1410, local264, local251, Static471.anInt8012, local275);
			}
		}
		if (!local12) {
			Static157.anInt2860 = 2;
			return;
		}
		if (Static157.anInt2860 != 0) {
			Static152.method2206(Static442.aClass64_12, true, Static268.aClass334_14, Static16.aClass134_1, Static568.aClass351_16.method7651(Static307.anInt5279) + "<br>(100%)");
		}
		Static510.method7089();
		Static283.method3948();
		@Pc(378) boolean local378 = false;
		if (Static16.aClass134_1.method6968() && Static348.aClass1_Sub30_Sub1_1.aBoolean391) {
			for (local264 = 0; local264 < Static269.aByteArrayArray20.length; local264++) {
				if (Static173.aByteArrayArray15[local264] != null || Static317.aByteArrayArray21[local264] != null) {
					local378 = true;
					break;
				}
			}
		}
		if (Static348.aClass1_Sub30_Sub1_1.aBoolean380) {
			local264 = Static521.anIntArray669[Static532.anInt8934];
		} else {
			local264 = Static340.anIntArray462[Static532.anInt8934];
		}
		if (Static16.aClass134_1.method6936()) {
			local264++;
		}
		Static592.method7863(Static16.aClass134_1, Static537.anInt8995, Static71.anInt1410, Static471.anInt8012, local264, local378, Static16.aClass134_1.method6955() > 0);
		if (Static217.aBoolean319) {
			Static261.method3774(Static28.aClass64_1);
		} else {
			Static261.method3774(null);
		}
		for (local275 = 0; local275 < 4; local275++) {
			Static478.aClass59Array2[local275].method1192();
		}
		Static548.method7012();
		Static346.method4714(false);
		Static395.method5457();
		Static84.aBoolean690 = false;
		Static544.aClass197_1 = null;
		Static510.method7089();
		System.gc();
		Static541.method7393(true);
		Static48.method745();
		Static315.anInt5405 = Static348.aClass1_Sub30_Sub1_1.method3908(Static113.anInt2222);
		Static556.aBoolean726 = Static117.anInt2297 >= 96;
		Static363.aBoolean470 = Static348.aClass1_Sub30_Sub1_1.aBoolean391;
		Static153.aBoolean210 = Static348.aClass1_Sub30_Sub1_1.method3907(Static113.anInt2222);
		Static588.aBoolean751 = !Static348.aClass1_Sub30_Sub1_1.aBoolean384;
		Static32.anInt509 = Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222) ? -1 : Static42.anInt691;
		Static308.aBoolean424 = Static44.method701(Static113.anInt2222) || Static348.aClass1_Sub30_Sub1_1.aBoolean381;
		Static83.aBoolean144 = Static348.aClass1_Sub30_Sub1_1.aBoolean397;
		Static343.aClass26_Sub1_3 = new Class26_Sub1(4, Static71.anInt1410, Static471.anInt8012, false);
		if (Static90.anInt1938 == 0) {
			Static473.method6469(Static343.aClass26_Sub1_3, Static269.aByteArrayArray20);
		} else {
			Static525.method7246(Static269.aByteArrayArray20, Static343.aClass26_Sub1_3);
		}
		Static594.method7869(Static471.anInt8012 >> 4, Static71.anInt1410 >> 4);
		Static360.method4786();
		if (local378) {
			Static98.method5017(true);
			Static251.aClass26_Sub1_4 = new Class26_Sub1(1, Static71.anInt1410, Static471.anInt8012, true);
			if (Static90.anInt1938 == 0) {
				Static473.method6469(Static251.aClass26_Sub1_4, Static317.aByteArrayArray21);
				Static541.method7393(true);
			} else {
				Static525.method7246(Static317.aByteArrayArray21, Static251.aClass26_Sub1_4);
				Static541.method7393(true);
			}
			Static251.aClass26_Sub1_4.method409(Static343.aClass26_Sub1_3.anIntArrayArrayArray2[0]);
			Static251.aClass26_Sub1_4.method413(null, Static16.aClass134_1, null);
			Static98.method5017(false);
		}
		Static343.aClass26_Sub1_3.method413(local378 ? Static251.aClass26_Sub1_4.anIntArrayArrayArray2 : null, Static16.aClass134_1, Static478.aClass59Array2);
		if (Static90.anInt1938 == 0) {
			Static541.method7393(true);
			Static456.method6296(Static343.aClass26_Sub1_3, Static103.aByteArrayArray11);
			if (Static481.aByteArrayArray30 != null) {
				Static326.method4471();
			}
		} else {
			Static541.method7393(true);
			Static222.method3421(Static103.aByteArrayArray11, Static343.aClass26_Sub1_3);
		}
		Static283.method3948();
		if (Static117.anInt2297 < 96) {
			Static580.method7776();
		}
		Static541.method7393(true);
		Static343.aClass26_Sub1_3.method406(local378 ? Static557.aClass47Array3[0] : null, Static16.aClass134_1, null);
		Static343.aClass26_Sub1_3.method426(Static16.aClass134_1, false);
		Static541.method7393(true);
		if (local378) {
			Static98.method5017(true);
			Static541.method7393(true);
			if (Static90.anInt1938 == 0) {
				Static456.method6296(Static251.aClass26_Sub1_4, Static173.aByteArrayArray15);
			} else {
				Static222.method3421(Static173.aByteArrayArray15, Static251.aClass26_Sub1_4);
			}
			Static283.method3948();
			Static541.method7393(true);
			Static251.aClass26_Sub1_4.method406(null, Static16.aClass134_1, Static216.aClass47Array2[0]);
			Static251.aClass26_Sub1_4.method426(Static16.aClass134_1, true);
			Static541.method7393(true);
			Static98.method5017(false);
		}
		Static553.method7538();
		@Pc(718) int local718 = Static343.aClass26_Sub1_3.anInt499;
		if (Static433.anInt7592 < local718) {
			local718 = Static433.anInt7592;
		}
		if (Static433.anInt7592 - 1 > local718) {
			local718 = Static433.anInt7592 - 1;
		}
		if (Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222)) {
			Static181.method2555(0);
		} else {
			Static181.method2555(local718);
		}
		@Pc(749) int local749;
		@Pc(753) int local753;
		for (@Pc(745) int local745 = 0; local745 < 4; local745++) {
			for (local749 = 0; local749 < Static71.anInt1410; local749++) {
				for (local753 = 0; local753 < Static471.anInt8012; local753++) {
					Static38.method540(local753, local745, local749);
				}
			}
		}
		Static468.method6431();
		Static510.method7089();
		Static425.method5882();
		Static283.method3948();
		Static31.method420();
		@Pc(810) Class1_Sub11 local810;
		if (Static142.aFrame1 != null && Static568.aClass149_2 != null && Static216.anInt4135 == 11) {
			local810 = Static276.method3885(Static365.aClass70_63, Static481.aClass276_2);
			local810.aClass1_Sub35_Sub2_1.method5792(1057001181);
			Static48.method743(local810);
		}
		if (Static90.anInt1938 == 0) {
			local749 = (Static504.anInt5716 - (Static71.anInt1410 >> 4)) / 8;
			local753 = (Static504.anInt5716 + (Static71.anInt1410 >> 4)) / 8;
			@Pc(850) int local850 = (Static188.anInt3531 - (Static471.anInt8012 >> 4)) / 8;
			@Pc(858) int local858 = ((Static471.anInt8012 >> 4) + Static188.anInt3531) / 8;
			for (@Pc(862) int local862 = local749 - 1; local862 <= local753 + 1; local862++) {
				for (@Pc(868) int local868 = local850 - 1; local868 <= local858 + 1; local868++) {
					if (local862 < local749 || local862 > local753 || local850 > local868 || local868 > local858) {
						Static559.aClass270_116.method5705("m" + local862 + "_" + local868);
						Static559.aClass270_116.method5705("l" + local862 + "_" + local868);
					}
				}
			}
		}
		if (Static216.anInt4135 == 4) {
			Static426.method5887(3);
		} else if (Static216.anInt4135 == 8) {
			Static426.method5887(7);
		} else {
			Static426.method5887(10);
			if (Static568.aClass149_2 != null) {
				local810 = Static276.method3885(Static75.aClass70_99, Static481.aClass276_2);
				Static48.method743(local810);
			}
		}
		Static450.method7632();
		Static510.method7089();
		Static483.method6529();
		if (Static3.aBoolean4) {
			Static165.method2388("Took: " + (Static413.method5668() - Static1.aLong4) + "ms");
			Static3.aBoolean4 = false;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BILclient!gf;I)V")
	public static void method5048(@OriginalArg(1) int arg0, @OriginalArg(2) Class119 arg1, @OriginalArg(3) int arg2) {
		Static204.aClass119ArrayArray1[arg0][arg2] = arg1;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method5050() {
		Static567.anInt9401 = -1;
		Static296.aClass22_28 = null;
	}
}
