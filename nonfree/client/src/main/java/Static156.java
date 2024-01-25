import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "Lclient!gaa;")
	public static final Class112 aClass112_21 = new Class112();

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "Lclient!me;")
	public static final Class211 aClass211_64 = new Class211(64);

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
	public static int anInt10168 = 0;

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "Z")
	public static boolean aBoolean841 = false;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V")
	public static void method8245() {
		Static306.method5124(false);
		Static427.anInt9469 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static558.aByteArrayArray26.length; local14++) {
			if (Static537.anIntArray654[local14] != -1 && Static558.aByteArrayArray26[local14] == null) {
				Static558.aByteArrayArray26[local14] = Static136.aClass254_43.method6401(Static537.anIntArray654[local14], 0);
				if (Static558.aByteArrayArray26[local14] == null) {
					local12 = false;
					Static427.anInt9469++;
				}
			}
			if (Static422.anIntArray504[local14] != -1 && Static349.aByteArrayArray17[local14] == null) {
				Static349.aByteArrayArray17[local14] = Static136.aClass254_43.method6399(Static261.anIntArrayArray34[local14], Static422.anIntArray504[local14], 0);
				if (Static349.aByteArrayArray17[local14] == null) {
					Static427.anInt9469++;
					local12 = false;
				}
			}
			if (Static215.anIntArray376[local14] != -1 && Static523.aByteArrayArray30[local14] == null) {
				Static523.aByteArrayArray30[local14] = Static136.aClass254_43.method6401(Static215.anIntArray376[local14], 0);
				if (Static523.aByteArrayArray30[local14] == null) {
					Static427.anInt9469++;
					local12 = false;
				}
			}
			if (Static577.anIntArray661[local14] != -1 && Static256.aByteArrayArray19[local14] == null) {
				Static256.aByteArrayArray19[local14] = Static136.aClass254_43.method6401(Static577.anIntArray661[local14], 0);
				if (Static256.aByteArrayArray19[local14] == null) {
					Static427.anInt9469++;
					local12 = false;
				}
			}
			if (Static511.anIntArray616 != null && Static177.aByteArrayArray16[local14] == null && Static511.anIntArray616[local14] != -1) {
				Static177.aByteArrayArray16[local14] = Static136.aClass254_43.method6399(Static261.anIntArrayArray34[local14], Static511.anIntArray616[local14], 0);
				if (Static177.aByteArrayArray16[local14] == null) {
					local12 = false;
					Static427.anInt9469++;
				}
			}
		}
		if (Static356.aClass238_3 == null) {
			if (Static424.aClass3_Sub4_Sub7_3 == null || !Static392.aClass254_104.method6409(Static424.aClass3_Sub4_Sub7_3.aString25 + "_staticelements")) {
				Static356.aClass238_3 = new Class238(0);
			} else if (Static392.aClass254_104.method6425(Static424.aClass3_Sub4_Sub7_3.aString25 + "_staticelements")) {
				Static356.aClass238_3 = Static53.method1294(Static584.aBoolean846, Static424.aClass3_Sub4_Sub7_3.aString25 + "_staticelements", Static392.aClass254_104);
			} else {
				Static427.anInt9469++;
				local12 = false;
			}
		}
		if (!local12) {
			Static432.anInt5801 = 1;
			return;
		}
		local12 = true;
		Static37.anInt1043 = 0;
		@Pc(273) int local273;
		@Pc(283) int local283;
		for (@Pc(254) int local254 = 0; local254 < Static558.aByteArrayArray26.length; local254++) {
			@Pc(260) byte[] local260 = Static349.aByteArrayArray17[local254];
			if (local260 != null) {
				local273 = (Static478.anIntArray584[local254] >> 8) * 64 - Static230.anInt4667;
				local283 = (Static478.anIntArray584[local254] & 0xFF) * 64 - Static563.anInt10006;
				if (Static39.anInt1074 != 0) {
					local273 = 10;
					local283 = 10;
				}
				local12 &= Static69.method1733(local273, local260, Static292.anInt7682, local283, Static460.anInt8640);
			}
			local260 = Static256.aByteArrayArray19[local254];
			if (local260 != null) {
				local273 = (Static478.anIntArray584[local254] >> 8) * 64 - Static230.anInt4667;
				local283 = (Static478.anIntArray584[local254] & 0xFF) * 64 - Static563.anInt10006;
				if (Static39.anInt1074 != 0) {
					local283 = 10;
					local273 = 10;
				}
				local12 &= Static69.method1733(local273, local260, Static292.anInt7682, local283, Static460.anInt8640);
			}
		}
		if (!local12) {
			Static432.anInt5801 = 2;
			return;
		}
		if (Static432.anInt5801 != 0) {
			Static569.method8164(true, Static139.aClass101_11.method2841(Static126.anInt2904) + "<br>(100%)", Static546.aClass15_16, Static137.aClass111_5, Static13.aClass297_2);
		}
		Static129.method8413();
		Static247.method4472();
		@Pc(387) boolean local387 = false;
		if (Static546.aClass15_16.method5333() && Static455.aClass3_Sub27_Sub1_1.aBoolean387) {
			for (local273 = 0; local273 < Static558.aByteArrayArray26.length; local273++) {
				if (Static256.aByteArrayArray19[local273] != null || Static523.aByteArrayArray30[local273] != null) {
					local387 = true;
					break;
				}
			}
		}
		if (Static455.aClass3_Sub27_Sub1_1.aBoolean386) {
			local273 = Static86.anIntArray94[Static320.anInt6616];
		} else {
			local273 = Static240.anIntArray304[Static320.anInt6616];
		}
		if (Static546.aClass15_16.method5327()) {
			local273++;
		}
		Static595.method8406(Static460.anInt8640, Static292.anInt7682, local273, local387, Static546.aClass15_16.method5329() > 0);
		for (local283 = 0; local283 < 4; local283++) {
			Static403.aClass350Array1[local283].method8207();
		}
		Static369.method6036();
		Static262.method4616(false);
		Static354.method5892();
		Static429.aClass140_1 = null;
		Static54.aBoolean104 = false;
		Static129.method8413();
		System.gc();
		Static306.method5124(true);
		Static60.method1516();
		Static514.anInt9447 = Static455.aClass3_Sub27_Sub1_1.method4035(Static275.anInt5823);
		Static554.aBoolean827 = Static188.anInt3749 >= 96;
		Static553.aBoolean825 = Static455.aClass3_Sub27_Sub1_1.aBoolean387;
		Static370.aBoolean617 = Static455.aClass3_Sub27_Sub1_1.method4036(Static275.anInt5823);
		Static197.aBoolean301 = !Static455.aClass3_Sub27_Sub1_1.aBoolean397;
		Static521.anInt9520 = Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823) ? -1 : Static96.anInt2320;
		Static74.aBoolean150 = Static347.method5854(Static275.anInt5823) || Static455.aClass3_Sub27_Sub1_1.aBoolean383;
		Static102.aBoolean186 = Static455.aClass3_Sub27_Sub1_1.aBoolean391;
		Static231.aClass152_Sub1_1 = new Class152_Sub1(4, Static460.anInt8640, Static292.anInt7682, false);
		if (Static39.anInt1074 == 0) {
			Static159.method3030(Static231.aClass152_Sub1_1, Static558.aByteArrayArray26);
		} else {
			Static178.method3153(Static558.aByteArrayArray26, Static231.aClass152_Sub1_1);
		}
		Static11.method372(Static460.anInt8640 >> 4, Static292.anInt7682 >> 4);
		Static78.method1787();
		if (local387) {
			Static571.method8173(true);
			Static495.aClass152_Sub1_2 = new Class152_Sub1(1, Static460.anInt8640, Static292.anInt7682, true);
			if (Static39.anInt1074 == 0) {
				Static159.method3030(Static495.aClass152_Sub1_2, Static523.aByteArrayArray30);
				Static306.method5124(true);
			} else {
				Static178.method3153(Static523.aByteArrayArray30, Static495.aClass152_Sub1_2);
				Static306.method5124(true);
			}
			Static495.aClass152_Sub1_2.method3659(Static231.aClass152_Sub1_1.anIntArrayArrayArray8[0]);
			Static495.aClass152_Sub1_2.method3657(null, null, Static546.aClass15_16);
			Static571.method8173(false);
		}
		Static231.aClass152_Sub1_1.method3657(local387 ? Static495.aClass152_Sub1_2.anIntArrayArrayArray8 : null, Static403.aClass350Array1, Static546.aClass15_16);
		if (Static39.anInt1074 == 0) {
			Static306.method5124(true);
			Static415.method6703(Static349.aByteArrayArray17, Static231.aClass152_Sub1_1);
			if (Static177.aByteArrayArray16 != null) {
				Static274.method4783();
			}
		} else {
			Static306.method5124(true);
			Static235.method4095(Static231.aClass152_Sub1_1, Static349.aByteArrayArray17);
		}
		Static247.method4472();
		if (Static188.anInt3749 < 96) {
			Static580.method8284();
		}
		Static306.method5124(true);
		Static231.aClass152_Sub1_1.method3647(null, local387 ? Static495.aClass4Array4[0] : null, Static546.aClass15_16);
		Static231.aClass152_Sub1_1.method3669(Static546.aClass15_16);
		Static306.method5124(true);
		if (local387) {
			Static571.method8173(true);
			Static306.method5124(true);
			if (Static39.anInt1074 == 0) {
				Static415.method6703(Static256.aByteArrayArray19, Static495.aClass152_Sub1_2);
			} else {
				Static235.method4095(Static495.aClass152_Sub1_2, Static256.aByteArrayArray19);
			}
			Static247.method4472();
			Static306.method5124(true);
			Static495.aClass152_Sub1_2.method3647(Static381.aClass4Array2[0], null, Static546.aClass15_16);
			Static495.aClass152_Sub1_2.method3669(Static546.aClass15_16);
			Static306.method5124(true);
			Static571.method8173(false);
		}
		Static495.method7488();
		@Pc(733) int local733 = Static231.aClass152_Sub1_1.anInt4319;
		if (local733 > Static212.anInt4380) {
			local733 = Static212.anInt4380;
		}
		if (local733 < Static212.anInt4380 - 1) {
			local733 = Static212.anInt4380 - 1;
		}
		if (Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823)) {
			Static167.method3098(0);
		} else {
			Static167.method3098(local733);
		}
		@Pc(772) int local772;
		@Pc(776) int local776;
		for (@Pc(768) int local768 = 0; local768 < 4; local768++) {
			for (local772 = 0; local772 < Static460.anInt8640; local772++) {
				for (local776 = 0; local776 < Static292.anInt7682; local776++) {
					Static510.method7653(local776, local772, local768);
				}
			}
		}
		Static573.method8192();
		Static129.method8413();
		Static274.method4781();
		Static247.method4472();
		Static460.method7069();
		@Pc(827) Class3_Sub9 local827;
		if (Static531.aFrame1 != null && Static393.aClass8_2 != null && Static75.anInt1880 == 11) {
			local827 = Static587.method8316(Static187.aClass40_2, Static145.aClass230_33);
			local827.aClass3_Sub7_Sub1_1.method6495(1057001181);
			Static230.method3933(local827);
		}
		if (Static39.anInt1074 == 0) {
			local772 = (Static368.anInt7248 - (Static460.anInt8640 >> 4)) / 8;
			local776 = ((Static460.anInt8640 >> 4) + Static368.anInt7248) / 8;
			@Pc(868) int local868 = (Static187.anInt3746 - (Static292.anInt7682 >> 4)) / 8;
			@Pc(876) int local876 = (Static187.anInt3746 + (Static292.anInt7682 >> 4)) / 8;
			for (@Pc(880) int local880 = local772 - 1; local880 <= local776 + 1; local880++) {
				for (@Pc(886) int local886 = local868 - 1; local886 <= local876 + 1; local886++) {
					if (local772 > local880 || local776 < local880 || local886 < local868 || local876 < local886) {
						Static136.aClass254_43.method6400("m" + local880 + "_" + local886);
						Static136.aClass254_43.method6400("l" + local880 + "_" + local886);
					}
				}
			}
		}
		if (Static75.anInt1880 == 4) {
			Static168.method3104(3);
		} else if (Static75.anInt1880 == 8) {
			Static168.method3104(7);
		} else {
			Static168.method3104(10);
			if (Static393.aClass8_2 != null) {
				local827 = Static587.method8316(Static187.aClass40_2, Static147.aClass230_34);
				Static230.method3933(local827);
			}
		}
		Static230.method3938();
		Static129.method8413();
		Static168.method3106();
	}
}
