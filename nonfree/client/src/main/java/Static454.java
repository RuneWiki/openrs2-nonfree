import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
	public static int anInt8017 = -1;

	@OriginalMember(owner = "client!qda", name = "y", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_111 = new Class130(70, 3);

	@OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
	public static int anInt8026 = 0;

	@OriginalMember(owner = "client!qda", name = "B", descriptor = "Lclient!cga;")
	public static final Class50 aClass50_12 = new Class50();

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IB)V")
	public static void method6977(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4_Sub12 local10 = Static556.method8018(12, arg0);
		local10.method3607();
	}

	@OriginalMember(owner = "client!qda", name = "i", descriptor = "(I)V")
	public static void method6979() {
		Static644.method8773(false);
		Static236.anInt4460 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static29.aByteArrayArray1.length; local14++) {
			if (Static593.anIntArray631[local14] != -1 && Static29.aByteArrayArray1[local14] == null) {
				Static29.aByteArrayArray1[local14] = Static395.aClass196_80.method5102(Static593.anIntArray631[local14], 0);
				if (Static29.aByteArrayArray1[local14] == null) {
					Static236.anInt4460++;
					local12 = false;
				}
			}
			if (Static363.anIntArray57[local14] != -1 && Static145.aByteArrayArray5[local14] == null) {
				Static145.aByteArrayArray5[local14] = Static395.aClass196_80.method5120(0, Static363.anIntArray57[local14], Static559.anIntArrayArray59[local14]);
				if (Static145.aByteArrayArray5[local14] == null) {
					Static236.anInt4460++;
					local12 = false;
				}
			}
			if (Static438.anIntArray481[local14] != -1 && Static419.aByteArrayArray26[local14] == null) {
				Static419.aByteArrayArray26[local14] = Static395.aClass196_80.method5102(Static438.anIntArray481[local14], 0);
				if (Static419.aByteArrayArray26[local14] == null) {
					Static236.anInt4460++;
					local12 = false;
				}
			}
			if (Static238.anIntArray235[local14] != -1 && Static156.aByteArrayArray17[local14] == null) {
				Static156.aByteArrayArray17[local14] = Static395.aClass196_80.method5102(Static238.anIntArray235[local14], 0);
				if (Static156.aByteArrayArray17[local14] == null) {
					Static236.anInt4460++;
					local12 = false;
				}
			}
			if (Static276.anIntArray264 != null && Static349.aByteArrayArray19[local14] == null && Static276.anIntArray264[local14] != -1) {
				Static349.aByteArrayArray19[local14] = Static395.aClass196_80.method5120(0, Static276.anIntArray264[local14], Static559.anIntArrayArray59[local14]);
				if (Static349.aByteArrayArray19[local14] == null) {
					Static236.anInt4460++;
					local12 = false;
				}
			}
		}
		if (Static531.aClass156_8 == null) {
			if (Static76.aClass3_Sub4_Sub11_1 == null || !Static508.aClass196_106.method5107(Static76.aClass3_Sub4_Sub11_1.aString40 + "_staticelements")) {
				Static531.aClass156_8 = new Class156(0);
			} else if (Static508.aClass196_106.method5106(Static76.aClass3_Sub4_Sub11_1.aString40 + "_staticelements")) {
				Static531.aClass156_8 = Static477.method7145(Static475.aBoolean582, Static508.aClass196_106, Static76.aClass3_Sub4_Sub11_1.aString40 + "_staticelements");
			} else {
				local12 = false;
				Static236.anInt4460++;
			}
		}
		if (!local12) {
			Static263.anInt4810 = 1;
			return;
		}
		Static365.anInt6937 = 0;
		local12 = true;
		@Pc(274) int local274;
		@Pc(285) int local285;
		for (@Pc(255) int local255 = 0; local255 < Static29.aByteArrayArray1.length; local255++) {
			@Pc(261) byte[] local261 = Static145.aByteArrayArray5[local255];
			if (local261 != null) {
				local274 = (Static351.anIntArray405[local255] >> 8) * 64 - Static299.anInt5307;
				local285 = (Static351.anIntArray405[local255] & 0xFF) * 64 - Static171.anInt3340;
				if (Static402.anInt7435 != 0) {
					local285 = 10;
					local274 = 10;
				}
				local12 &= Static52.method1482(local285, Static638.anInt10172, Static634.anInt10129, local261, local274);
			}
			local261 = Static156.aByteArrayArray17[local255];
			if (local261 != null) {
				local274 = (Static351.anIntArray405[local255] >> 8) * 64 - Static299.anInt5307;
				local285 = (Static351.anIntArray405[local255] & 0xFF) * 64 - Static171.anInt3340;
				if (Static402.anInt7435 != 0) {
					local274 = 10;
					local285 = 10;
				}
				local12 &= Static52.method1482(local285, Static638.anInt10172, Static634.anInt10129, local261, local274);
			}
		}
		if (!local12) {
			Static263.anInt4810 = 2;
			return;
		}
		if (Static263.anInt4810 != 0) {
			Static301.method4799(Static256.aClass282_7, Static323.aClass5_9, Static187.aClass62_4, true, Static59.aClass43_12.method1598(Static325.anInt6083) + "<br>(100%)");
		}
		Static1.method8294();
		Static518.method7722();
		Static540.method7898();
		@Pc(396) boolean local396 = false;
		if (Static323.aClass5_9.method7497() && Static262.aClass3_Sub27_12.aClass21_Sub15_1.method5810() == 2) {
			for (local274 = 0; local274 < Static29.aByteArrayArray1.length; local274++) {
				if (Static156.aByteArrayArray17[local274] != null || Static419.aByteArrayArray26[local274] != null) {
					local396 = true;
					break;
				}
			}
		}
		if (Static262.aClass3_Sub27_12.aClass21_Sub20_1.method6682() == 1) {
			local274 = Static88.anIntArray76[Static276.anInt4985];
		} else {
			local274 = Static400.anIntArray455[Static276.anInt4985];
		}
		if (Static323.aClass5_9.method7568()) {
			local274++;
		}
		Static541.method7918(Static323.aClass5_9, Static302.anInt5362, Static634.anInt10129, Static638.anInt10172, local274, local396, Static323.aClass5_9.method7517() > 0);
		Static440.method6851(Static228.anInt4286);
		if (Static228.anInt4286 == 0) {
			Static510.method7617(null);
		} else {
			Static510.method7617(Static557.aClass62_12);
		}
		for (local285 = 0; local285 < 4; local285++) {
			Static271.aClass105Array1[local285].method2737();
		}
		Static10.method673();
		Static61.method1646(false);
		Static625.method8731();
		Static175.aClass327_1 = null;
		Static355.aBoolean492 = false;
		Static1.method8294();
		System.gc();
		Static644.method8773(true);
		Static371.method6019();
		Static337.anInt6317 = Static262.aClass3_Sub27_12.aClass21_Sub5_1.method1474();
		Static72.aBoolean106 = Static131.anInt2701 >= 96;
		Static200.aBoolean264 = Static262.aClass3_Sub27_12.aClass21_Sub15_1.method5810() == 2;
		Static241.aBoolean301 = Static262.aClass3_Sub27_12.aClass21_Sub12_1.method4533() == 1;
		Static576.anInt9497 = Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 1 ? -1 : Static35.anInt1167;
		Static542.aBoolean663 = Static262.aClass3_Sub27_12.aClass21_Sub3_1.method1270() == 1;
		Static291.aBoolean339 = Static262.aClass3_Sub27_12.aClass21_Sub9_1.method3111() == 1;
		Static493.aClass81_Sub1_1 = new Class81_Sub1(4, Static634.anInt10129, Static638.anInt10172, false);
		if (Static402.anInt7435 == 0) {
			Static559.method8064(Static493.aClass81_Sub1_1, Static29.aByteArrayArray1);
		} else {
			Static111.method2292(Static29.aByteArrayArray1, Static493.aClass81_Sub1_1);
		}
		Static210.method3566(Static638.anInt10172 >> 4, Static634.anInt10129 >> 4);
		Static144.method2656();
		if (local396) {
			Static48.method1421(true);
			Static622.aClass81_Sub1_2 = new Class81_Sub1(1, Static634.anInt10129, Static638.anInt10172, true);
			if (Static402.anInt7435 == 0) {
				Static559.method8064(Static622.aClass81_Sub1_2, Static419.aByteArrayArray26);
				Static644.method8773(true);
			} else {
				Static111.method2292(Static419.aByteArrayArray26, Static622.aClass81_Sub1_2);
				Static644.method8773(true);
			}
			Static622.aClass81_Sub1_2.method2277(Static493.aClass81_Sub1_1.anIntArrayArrayArray8[0]);
			Static622.aClass81_Sub1_2.method2285(Static323.aClass5_9, null, null);
			Static48.method1421(false);
		}
		Static493.aClass81_Sub1_1.method2285(Static323.aClass5_9, Static271.aClass105Array1, local396 ? Static622.aClass81_Sub1_2.anIntArrayArrayArray8 : null);
		if (Static402.anInt7435 == 0) {
			Static644.method8773(true);
			Static572.method8138(Static493.aClass81_Sub1_1, Static145.aByteArrayArray5);
			if (Static349.aByteArrayArray19 != null) {
				Static512.method7642();
			}
		} else {
			Static644.method8773(true);
			Static265.method4359(Static145.aByteArrayArray5, Static493.aClass81_Sub1_1);
		}
		Static518.method7722();
		if (Static131.anInt2701 < 96) {
			Static414.method6551();
		}
		Static644.method8773(true);
		Static493.aClass81_Sub1_1.method2274(local396 ? Static2.aClass51Array1[0] : null, Static323.aClass5_9, null);
		Static493.aClass81_Sub1_1.method2291(Static323.aClass5_9, false);
		Static644.method8773(true);
		if (local396) {
			Static48.method1421(true);
			Static644.method8773(true);
			if (Static402.anInt7435 == 0) {
				Static572.method8138(Static622.aClass81_Sub1_2, Static156.aByteArrayArray17);
			} else {
				Static265.method4359(Static156.aByteArrayArray17, Static622.aClass81_Sub1_2);
			}
			Static518.method7722();
			Static644.method8773(true);
			Static622.aClass81_Sub1_2.method2274(null, Static323.aClass5_9, Static559.aClass51Array4[0]);
			Static622.aClass81_Sub1_2.method2291(Static323.aClass5_9, true);
			Static644.method8773(true);
			Static48.method1421(false);
		}
		Static641.method8742();
		@Pc(788) int local788 = Static493.aClass81_Sub1_1.anInt2430;
		if (local788 > Static549.anInt9262) {
			local788 = Static549.anInt9262;
		}
		if (local788 < Static549.anInt9262 - 1) {
			local788 = Static549.anInt9262 - 1;
		}
		if (Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 0) {
			Static380.method6114(local788);
		} else {
			Static380.method6114(0);
		}
		@Pc(826) int local826;
		@Pc(830) int local830;
		for (@Pc(822) int local822 = 0; local822 < 4; local822++) {
			for (local826 = 0; local826 < Static634.anInt10129; local826++) {
				for (local830 = 0; local830 < Static638.anInt10172; local830++) {
					Static264.method4347(local830, local822, local826);
				}
			}
		}
		Static429.method6678();
		Static1.method8294();
		Static398.method6437();
		Static518.method7722();
		Static381.method6150();
		@Pc(879) Class3_Sub14 local879;
		if (Static209.aFrame3 != null && Static413.aClass230_1 != null && Static485.anInt8420 == 11) {
			local879 = Static139.method2308(Static363.aClass130_26, Static24.aClass233_1);
			local879.aClass3_Sub3_Sub2_2.method4265(1057001181);
			Static562.method8096(local879);
		}
		if (Static402.anInt7435 == 0) {
			local826 = (Static482.anInt8390 - (Static634.anInt10129 >> 4)) / 8;
			local830 = (Static482.anInt8390 + (Static634.anInt10129 >> 4)) / 8;
			@Pc(919) int local919 = (Static133.anInt2704 - (Static638.anInt10172 >> 4)) / 8;
			@Pc(927) int local927 = ((Static638.anInt10172 >> 4) + Static133.anInt2704) / 8;
			for (@Pc(931) int local931 = local826 - 1; local931 <= local830 + 1; local931++) {
				for (@Pc(937) int local937 = local919 - 1; local937 <= local927 + 1; local937++) {
					if (local931 < local826 || local931 > local830 || local937 < local919 || local927 < local937) {
						Static395.aClass196_80.method5109("m" + local931 + "_" + local937);
						Static395.aClass196_80.method5109("l" + local931 + "_" + local937);
					}
				}
			}
		}
		if (Static485.anInt8420 == 4) {
			Static256.method4279(3);
		} else if (Static485.anInt8420 == 8) {
			Static256.method4279(7);
		} else {
			Static256.method4279(10);
			if (Static413.aClass230_1 != null) {
				local879 = Static139.method2308(Static352.aClass130_94, Static24.aClass233_1);
				Static562.method8096(local879);
			}
		}
		Static526.method7735();
		Static1.method8294();
		Static504.method7455();
		Static585.aBoolean690 = true;
		if (Static51.aBoolean94) {
			Static410.method6501("Took: " + (Static374.method6036() - Static452.aLong83) + "ms");
			Static51.aBoolean94 = false;
		}
	}
}
