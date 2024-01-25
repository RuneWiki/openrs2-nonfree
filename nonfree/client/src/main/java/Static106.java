import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "Lclient!r;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!js;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_77 = new Class189("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_45 = new Class119(104, 8);

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public static int anInt2386 = 0;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method1829() {
		Static8.method4684(false);
		Static162.anInt3324 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static29.aByteArrayArray18.length; local14++) {
			if (Static319.anIntArray115[local14] != -1 && Static29.aByteArrayArray18[local14] == null) {
				Static29.aByteArrayArray18[local14] = Static64.aClass32_28.method785(0, Static319.anIntArray115[local14]);
				if (Static29.aByteArrayArray18[local14] == null) {
					Static162.anInt3324++;
					local12 = false;
				}
			}
			if (Static371.anIntArray402[local14] != -1 && Static231.aByteArrayArray8[local14] == null) {
				Static231.aByteArrayArray8[local14] = Static64.aClass32_28.method801(Static295.anIntArrayArray34[local14], Static371.anIntArray402[local14], 0);
				if (Static231.aByteArrayArray8[local14] == null) {
					Static162.anInt3324++;
					local12 = false;
				}
			}
			if (Static414.anIntArray465[local14] != -1 && Static378.aByteArrayArray21[local14] == null) {
				Static378.aByteArrayArray21[local14] = Static64.aClass32_28.method785(0, Static414.anIntArray465[local14]);
				if (Static378.aByteArrayArray21[local14] == null) {
					Static162.anInt3324++;
					local12 = false;
				}
			}
			if (Static184.anIntArray230[local14] != -1 && Static242.aByteArrayArray9[local14] == null) {
				Static242.aByteArrayArray9[local14] = Static64.aClass32_28.method785(0, Static184.anIntArray230[local14]);
				if (Static242.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static162.anInt3324++;
				}
			}
			if (Static322.anIntArray372 != null && Static299.aByteArrayArray15[local14] == null && Static322.anIntArray372[local14] != -1) {
				Static299.aByteArrayArray15[local14] = Static64.aClass32_28.method801(Static295.anIntArrayArray34[local14], Static322.anIntArray372[local14], 0);
				if (Static299.aByteArrayArray15[local14] == null) {
					Static162.anInt3324++;
					local12 = false;
				}
			}
		}
		if (Static240.aClass116_2 == null) {
			if (Static87.aClass3_Sub4_Sub8_6 == null || !Static419.aClass32_84.method793(Static87.aClass3_Sub4_Sub8_6.aString15 + "_staticelements")) {
				Static240.aClass116_2 = new Class116(0);
			} else if (Static419.aClass32_84.method804(Static87.aClass3_Sub4_Sub8_6.aString15 + "_staticelements")) {
				Static240.aClass116_2 = Static50.method915(Static419.aClass32_84, Static187.aBoolean320, Static87.aClass3_Sub4_Sub8_6.aString15 + "_staticelements");
			} else {
				Static162.anInt3324++;
				local12 = false;
			}
		}
		if (!local12) {
			Static268.anInt5044 = 1;
			return;
		}
		local12 = true;
		Static180.anInt3570 = 0;
		@Pc(280) int local280;
		@Pc(291) int local291;
		for (@Pc(261) int local261 = 0; local261 < Static29.aByteArrayArray18.length; local261++) {
			@Pc(267) byte[] local267 = Static231.aByteArrayArray8[local261];
			if (local267 != null) {
				local280 = (Static81.anIntArray204[local261] >> 8) * 64 - Static223.anInt7618;
				local291 = (Static81.anIntArray204[local261] & 0xFF) * 64 - Static57.anInt5085;
				if (Static166.anInt3385 != 0) {
					local291 = 10;
					local280 = 10;
				}
				local12 &= Static263.method3822(local267, Static44.anInt7276, local280, Static40.anInt1089, local291);
			}
			local267 = Static242.aByteArrayArray9[local261];
			if (local267 != null) {
				local280 = (Static81.anIntArray204[local261] >> 8) * 64 - Static223.anInt7618;
				local291 = (Static81.anIntArray204[local261] & 0xFF) * 64 - Static57.anInt5085;
				if (Static166.anInt3385 != 0) {
					local280 = 10;
					local291 = 10;
				}
				local12 &= Static263.method3822(local267, Static44.anInt7276, local280, Static40.anInt1089, local291);
			}
		}
		if (!local12) {
			Static268.anInt5044 = 2;
			return;
		}
		if (Static268.anInt5044 != 0) {
			Static53.method1120(true, Static21.aClass189_14.method4262(Static53.anInt1454) + "<br>(100%)", Static299.aClass59_3);
		}
		Static170.method2751();
		Static235.method3584();
		@Pc(390) boolean local390 = false;
		if (Static121.aClass172_3.method5508() && Static374.aClass20_Sub1_1.aBoolean198) {
			for (local280 = 0; local280 < Static29.aByteArrayArray18.length; local280++) {
				if (Static242.aByteArrayArray9[local280] != null || Static378.aByteArrayArray21[local280] != null) {
					local390 = true;
					break;
				}
			}
		}
		if (Static374.aClass20_Sub1_1.aBoolean190) {
			local280 = Static424.anIntArray502[Static101.anInt6818];
		} else {
			local280 = Static150.anIntArray263[Static101.anInt6818];
		}
		if (Static121.aClass172_3.method5516()) {
			local280++;
		}
		Static161.method2684(Static40.anInt1089, Static44.anInt7276, local280, local390, Static121.aClass172_3.method5531() > 0);
		for (local291 = 0; local291 < 4; local291++) {
			Static382.aClass29Array3[local291].method751();
		}
		Static40.method778();
		Static393.method5081(false);
		Static104.method1808();
		Static81.aClass108_4 = null;
		Static170.method2751();
		System.gc();
		Static8.method4684(true);
		Static179.method4526();
		Static72.anInt1822 = Static374.aClass20_Sub1_1.method1806(Static105.anInt2382);
		Static388.aBoolean563 = Static286.anInt1448 >= 96;
		Static436.aBoolean633 = Static374.aClass20_Sub1_1.aBoolean198;
		Static204.aBoolean340 = Static374.aClass20_Sub1_1.method1805(Static105.anInt2382);
		Static177.aBoolean303 = !Static374.aClass20_Sub1_1.aBoolean200;
		Static419.anInt6868 = Static374.aClass20_Sub1_1.method1814(Static105.anInt2382) ? -1 : Static228.anInt4246;
		Static387.aBoolean560 = Static105.anInt2382 == 1 || Static374.aClass20_Sub1_1.aBoolean184;
		Static382.aBoolean155 = Static374.aClass20_Sub1_1.aBoolean193;
		Static381.aClass105_Sub1_3 = new Class105_Sub1(4, Static40.anInt1089, Static44.anInt7276, false);
		if (Static166.anInt3385 == 0) {
			Static19.method383(Static381.aClass105_Sub1_3, Static29.aByteArrayArray18);
		} else {
			Static300.method4229(Static29.aByteArrayArray18, Static381.aClass105_Sub1_3);
		}
		Static189.method3472(Static44.anInt7276 >> 4, Static40.anInt1089 >> 4);
		Static307.method4288();
		if (local390) {
			Static61.method1234(true);
			Static422.aClass105_Sub1_2 = new Class105_Sub1(1, Static40.anInt1089, Static44.anInt7276, true);
			if (Static166.anInt3385 == 0) {
				Static19.method383(Static422.aClass105_Sub1_2, Static378.aByteArrayArray21);
				Static8.method4684(true);
			} else {
				Static300.method4229(Static378.aByteArrayArray21, Static422.aClass105_Sub1_2);
				Static8.method4684(true);
			}
			Static422.aClass105_Sub1_2.method2672(Static381.aClass105_Sub1_3.anIntArrayArrayArray5[0]);
			Static422.aClass105_Sub1_2.method2674(Static121.aClass172_3, null, null);
			Static61.method1234(false);
		}
		Static381.aClass105_Sub1_3.method2674(Static121.aClass172_3, Static382.aClass29Array3, local390 ? Static422.aClass105_Sub1_2.anIntArrayArrayArray5 : null);
		if (Static166.anInt3385 == 0) {
			Static8.method4684(true);
			Static328.method4426(Static231.aByteArrayArray8, Static381.aClass105_Sub1_3);
			if (Static299.aByteArrayArray15 != null) {
				Static66.method1312();
			}
		} else {
			Static8.method4684(true);
			Static105.method1827(Static381.aClass105_Sub1_3, Static231.aByteArrayArray8);
		}
		Static235.method3584();
		Static8.method4684(true);
		Static381.aClass105_Sub1_3.method2664(null, Static121.aClass172_3, local390 ? Static85.aClass159Array2[0] : null);
		Static381.aClass105_Sub1_3.method2677(Static121.aClass172_3);
		Static8.method4684(true);
		if (local390) {
			Static61.method1234(true);
			Static8.method4684(true);
			if (Static166.anInt3385 == 0) {
				Static328.method4426(Static242.aByteArrayArray9, Static422.aClass105_Sub1_2);
			} else {
				Static105.method1827(Static422.aClass105_Sub1_2, Static242.aByteArrayArray9);
			}
			Static235.method3584();
			Static8.method4684(true);
			Static422.aClass105_Sub1_2.method2664(Static26.aClass159Array1[0], Static121.aClass172_3, null);
			Static422.aClass105_Sub1_2.method2677(Static121.aClass172_3);
			Static8.method4684(true);
			Static61.method1234(false);
		}
		Static50.method911();
		@Pc(729) int local729 = Static381.aClass105_Sub1_3.anInt3310;
		if (local729 > Static6.anInt93) {
			local729 = Static6.anInt93;
		}
		if (local729 < Static6.anInt93 - 1) {
			local729 = Static6.anInt93 - 1;
		}
		if (Static374.aClass20_Sub1_1.method1814(Static105.anInt2382)) {
			Static297.method4164(0);
		} else {
			Static297.method4164(local729);
		}
		@Pc(768) int local768;
		@Pc(772) int local772;
		for (@Pc(764) int local764 = 0; local764 < 4; local764++) {
			for (local768 = 0; local768 < Static40.anInt1089; local768++) {
				for (local772 = 0; local772 < Static44.anInt7276; local772++) {
					Static80.method1553(local772, local764, local768);
				}
			}
		}
		Static416.method5340();
		Static170.method2751();
		Static256.method3777();
		Static235.method3584();
		Static115.aBoolean223 = false;
		Static6.method43();
		if (Static10.aFrame1 != null && Static88.aClass251_2 != null && Static120.anInt2584 == 25) {
			Static30.method641(Static440.aClass217_111);
			Static302.aClass3_Sub7_Sub1_2.method2636(1057001181);
		}
		if (Static166.anInt3385 == 0) {
			local768 = (Static373.anInt6270 - (Static40.anInt1089 >> 4)) / 8;
			local772 = (Static373.anInt6270 + (Static40.anInt1089 >> 4)) / 8;
			@Pc(867) int local867 = (Static417.anInt6837 - (Static44.anInt7276 >> 4)) / 8;
			@Pc(875) int local875 = (Static417.anInt6837 + (Static44.anInt7276 >> 4)) / 8;
			for (@Pc(879) int local879 = local768 - 1; local879 <= local772 + 1; local879++) {
				for (@Pc(885) int local885 = local867 - 1; local885 <= local875 + 1; local885++) {
					if (local768 > local879 || local879 > local772 || local885 < local867 || local885 > local875) {
						Static64.aClass32_28.method782("m" + local879 + "_" + local885);
						Static64.aClass32_28.method782("l" + local879 + "_" + local885);
					}
				}
			}
		}
		if (Static120.anInt2584 == 28) {
			Static230.method3465(10);
		} else {
			Static230.method3465(30);
			if (Static88.aClass251_2 != null) {
				Static30.method641(Static212.aClass217_68);
			}
		}
		Static1.method1();
		Static170.method2751();
		Static333.method4463();
	}
}
