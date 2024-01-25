import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
	public static int anInt9964 = 0;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_186 = new Class322(76, -2);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!dm;IIII)V")
	public static void method8643(@OriginalArg(0) Class6_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0.aClass6_Sub15_Sub1_1.method3040(arg1);
		arg0.aClass6_Sub15_Sub1_1.method3017(arg3);
		arg0.aClass6_Sub15_Sub1_1.method3040(arg2);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
	public static void method8644() {
		Static227.method4060(false);
		Static492.anInt3481 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static432.aByteArrayArray134.length; local14++) {
			if (Static224.anIntArray221[local14] != -1 && Static432.aByteArrayArray134[local14] == null) {
				Static432.aByteArrayArray134[local14] = Static194.aClass223_39.method5267(0, Static224.anIntArray221[local14]);
				if (Static432.aByteArrayArray134[local14] == null) {
					Static492.anInt3481++;
					local12 = false;
				}
			}
			if (Static346.anIntArray343[local14] != -1 && Static173.aByteArrayArray61[local14] == null) {
				Static173.aByteArrayArray61[local14] = Static194.aClass223_39.method5254(Static222.anIntArrayArray21[local14], Static346.anIntArray343[local14], 0);
				if (Static173.aByteArrayArray61[local14] == null) {
					local12 = false;
					Static492.anInt3481++;
				}
			}
			if (Static504.anIntArray530[local14] != -1 && Static89.aByteArrayArray29[local14] == null) {
				Static89.aByteArrayArray29[local14] = Static194.aClass223_39.method5267(0, Static504.anIntArray530[local14]);
				if (Static89.aByteArrayArray29[local14] == null) {
					Static492.anInt3481++;
					local12 = false;
				}
			}
			if (Static364.anIntArray363[local14] != -1 && Static384.aByteArrayArray119[local14] == null) {
				Static384.aByteArrayArray119[local14] = Static194.aClass223_39.method5267(0, Static364.anIntArray363[local14]);
				if (Static384.aByteArrayArray119[local14] == null) {
					local12 = false;
					Static492.anInt3481++;
				}
			}
			if (Static293.anIntArray289 != null && Static76.aByteArrayArray27[local14] == null && Static293.anIntArray289[local14] != -1) {
				Static76.aByteArrayArray27[local14] = Static194.aClass223_39.method5254(Static222.anIntArrayArray21[local14], Static293.anIntArray289[local14], 0);
				if (Static76.aByteArrayArray27[local14] == null) {
					local12 = false;
					Static492.anInt3481++;
				}
			}
		}
		if (Static66.aClass176_1 == null) {
			if (Static680.aClass6_Sub2_Sub9_3 == null || !Static482.aClass223_95.method5276(Static680.aClass6_Sub2_Sub9_3.aString48 + "_staticelements")) {
				Static66.aClass176_1 = new Class176(0);
			} else if (Static482.aClass223_95.method5258(Static680.aClass6_Sub2_Sub9_3.aString48 + "_staticelements")) {
				Static66.aClass176_1 = Static517.method7489(Static340.aBoolean430, Static680.aClass6_Sub2_Sub9_3.aString48 + "_staticelements", Static482.aClass223_95);
			} else {
				local12 = false;
				Static492.anInt3481++;
			}
		}
		if (!local12) {
			Static551.anInt8913 = 1;
			return;
		}
		Static593.anInt9435 = 0;
		local12 = true;
		@Pc(312) int local312;
		@Pc(322) int local322;
		for (@Pc(293) int local293 = 0; local293 < Static432.aByteArrayArray134.length; local293++) {
			@Pc(299) byte[] local299 = Static173.aByteArrayArray61[local293];
			if (local299 != null) {
				local312 = (Static617.anIntArray642[local293] >> 8) * 64 - Static50.anInt606;
				local322 = (Static617.anIntArray642[local293] & 0xFF) * 64 - Static404.anInt7039;
				if (Static541.anInt9249 != 0) {
					local322 = 10;
					local312 = 10;
				}
				local12 &= Static12.method173(Static327.anInt5650, local312, local299, local322, Static29.anInt380);
			}
			local299 = Static384.aByteArrayArray119[local293];
			if (local299 != null) {
				local312 = (Static617.anIntArray642[local293] >> 8) * 64 - Static50.anInt606;
				local322 = (Static617.anIntArray642[local293] & 0xFF) * 64 - Static404.anInt7039;
				if (Static541.anInt9249 != 0) {
					local312 = 10;
					local322 = 10;
				}
				local12 &= Static12.method173(Static327.anInt5650, local312, local299, local322, Static29.anInt380);
			}
		}
		if (!local12) {
			Static551.anInt8913 = 2;
			return;
		}
		if (Static551.anInt8913 != 0) {
			Static562.method7944(Static507.aClass53_16, Static50.aClass43_12.method596(Static601.anInt9518) + "<br>(100%)", Static180.aClass67_5, Static202.aClass75_5, true);
		}
		Static302.method4850();
		Static375.method5662();
		Static253.method4389();
		@Pc(442) boolean local442 = false;
		if (Static202.aClass75_5.method6633() && Static687.aClass6_Sub44_33.aClass7_Sub28_1.method8314() == 2) {
			for (local312 = 0; local312 < Static432.aByteArrayArray134.length; local312++) {
				if (Static384.aByteArrayArray119[local312] != null || Static89.aByteArrayArray29[local312] != null) {
					local442 = true;
					break;
				}
			}
		}
		if (Static687.aClass6_Sub44_33.lb.method7058() == 1) {
			local312 = Static466.anIntArray503[Static162.anInt3401];
		} else {
			local312 = Static597.anIntArray613[Static162.anInt3401];
		}
		if (Static202.aClass75_5.method6680()) {
			local312++;
		}
		Static17.method223(Static202.aClass75_5, Static241.anInt4642, Static29.anInt380, Static327.anInt5650, local312, local442, Static202.aClass75_5.method6689() > 0);
		Static633.method7208(Static437.anInt7442);
		if (Static437.anInt7442 == 0) {
			Static367.method5560((Class67) null);
		} else {
			Static367.method5560(Static23.aClass67_1);
		}
		for (local322 = 0; local322 < 4; local322++) {
			Static669.aClass356Array1[local322].method8400();
		}
		Static79.method1090();
		Static658.method8776(false);
		Static221.method4014();
		Static496.aBoolean641 = false;
		Static302.method4850();
		System.gc();
		Static227.method4060(true);
		Static73.method3135();
		Static102.anInt2052 = Static687.aClass6_Sub44_33.aClass7_Sub3_1.method591();
		Static28.aBoolean29 = Static532.anInt8714 >= 96;
		Static30.aBoolean33 = Static687.aClass6_Sub44_33.aClass7_Sub28_1.method8314() == 2;
		Static58.aBoolean47 = Static687.aClass6_Sub44_33.aClass7_Sub4_1.method648() == 1;
		Static591.anInt9403 = Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 1 ? -1 : Static621.anInt9796;
		Static14.aBoolean20 = Static687.aClass6_Sub44_33.aClass7_Sub20_1.method6876() == 1;
		Static537.aBoolean669 = Static687.aClass6_Sub44_33.aClass7_Sub2_1.method236() == 1;
		Static286.aClass116_Sub1_4 = new Class116_Sub1(4, Static29.anInt380, Static327.anInt5650, false);
		if (Static541.anInt9249 == 0) {
			Static80.method1184(Static286.aClass116_Sub1_4, Static432.aByteArrayArray134);
		} else {
			Static228.method4064(Static286.aClass116_Sub1_4, Static432.aByteArrayArray134);
		}
		Static368.method5565(Static327.anInt5650 >> 4, Static29.anInt380 >> 4);
		Static550.method7787();
		if (local442) {
			Static79.method1089(true);
			Static263.aClass116_Sub1_3 = new Class116_Sub1(1, Static29.anInt380, Static327.anInt5650, true);
			if (Static541.anInt9249 == 0) {
				Static80.method1184(Static263.aClass116_Sub1_3, Static89.aByteArrayArray29);
				Static227.method4060(true);
			} else {
				Static228.method4064(Static263.aClass116_Sub1_3, Static89.aByteArrayArray29);
				Static227.method4060(true);
			}
			Static263.aClass116_Sub1_3.method3282(Static286.aClass116_Sub1_4.anIntArrayArrayArray10[0]);
			Static263.aClass116_Sub1_3.method3285((Class356[]) null, Static202.aClass75_5, (int[][][]) null);
			Static79.method1089(false);
		}
		Static286.aClass116_Sub1_4.method3285(Static669.aClass356Array1, Static202.aClass75_5, local442 ? Static263.aClass116_Sub1_3.anIntArrayArrayArray10 : null);
		if (Static541.anInt9249 == 0) {
			Static227.method4060(true);
			Static24.method289(Static286.aClass116_Sub1_4, Static173.aByteArrayArray61);
			if (Static76.aByteArrayArray27 != null) {
				Static100.method1965();
			}
		} else {
			Static227.method4060(true);
			Static376.method5666(Static286.aClass116_Sub1_4, Static173.aByteArrayArray61);
		}
		Static375.method5662();
		if (Static532.anInt8714 < 96) {
			Static434.method6604();
		}
		Static227.method4060(true);
		Static286.aClass116_Sub1_4.method3279((Class96) null, local442 ? Static216.aClass96Array1[0] : null, Static202.aClass75_5);
		Static286.aClass116_Sub1_4.method3295(Static202.aClass75_5, false);
		Static227.method4060(true);
		if (local442) {
			Static79.method1089(true);
			Static227.method4060(true);
			if (Static541.anInt9249 == 0) {
				Static24.method289(Static263.aClass116_Sub1_3, Static384.aByteArrayArray119);
			} else {
				Static376.method5666(Static263.aClass116_Sub1_3, Static384.aByteArrayArray119);
			}
			Static375.method5662();
			Static227.method4060(true);
			Static263.aClass116_Sub1_3.method3279(Static524.aClass96Array2[0], (Class96) null, Static202.aClass75_5);
			Static263.aClass116_Sub1_3.method3295(Static202.aClass75_5, true);
			Static227.method4060(true);
			Static79.method1089(false);
		}
		Static315.method4978();
		@Pc(881) int local881 = Static286.aClass116_Sub1_4.anInt3506;
		if (local881 > Static504.anInt8428) {
			local881 = Static504.anInt8428;
		}
		if (local881 < Static504.anInt8428 - 1) {
			local881 = Static504.anInt8428 - 1;
		}
		if (Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 0) {
			Static554.method7866(local881);
		} else {
			Static554.method7866(0);
		}
		@Pc(921) int local921;
		@Pc(925) int local925;
		for (@Pc(915) int local915 = 0; local915 < 4; local915++) {
			for (local921 = 0; local921 < Static29.anInt380; local921++) {
				for (local925 = 0; local925 < Static327.anInt5650; local925++) {
					Static459.method7009(local925, local915, local921);
				}
			}
		}
		Static183.method3450();
		Static302.method4850();
		Static461.method7017();
		Static375.method5662();
		Static53.method649();
		@Pc(990) Class6_Sub13 local990;
		if (Static637.aFrame3 != null && Static525.aClass260_4.aClass141_1 != null && Static37.anInt498 == 12) {
			local990 = Static30.method353(Static377.aClass241_83, Static525.aClass260_4.aClass270_2);
			local990.aClass6_Sub15_Sub1_1.method3029(1057001181);
			Static525.aClass260_4.method6404(local990);
		}
		if (Static541.anInt9249 == 0) {
			local921 = (Static253.anInt4790 - (Static29.anInt380 >> 4)) / 8;
			local925 = (Static253.anInt4790 + (Static29.anInt380 >> 4)) / 8;
			@Pc(1034) int local1034 = (Static405.anInt9127 - (Static327.anInt5650 >> 4)) / 8;
			@Pc(1042) int local1042 = ((Static327.anInt5650 >> 4) + Static405.anInt9127) / 8;
			for (@Pc(1046) int local1046 = local921 - 1; local1046 <= local925 + 1; local1046++) {
				for (@Pc(1052) int local1052 = local1034 - 1; local1052 <= local1042 + 1; local1052++) {
					if (local1046 < local921 || local925 < local1046 || local1034 > local1052 || local1052 > local1042) {
						Static194.aClass223_39.method5271("m" + local1046 + "_" + local1052);
						Static194.aClass223_39.method5271("l" + local1046 + "_" + local1052);
					}
				}
			}
		}
		if (Static37.anInt498 == 4) {
			Static307.method4889(3);
		} else if (Static37.anInt498 == 8) {
			Static307.method4889(7);
		} else if (Static37.anInt498 == 10) {
			Static307.method4889(9);
		} else {
			Static307.method4889(11);
			if (Static525.aClass260_4.aClass141_1 != null) {
				local990 = Static30.method353(Static378.aClass241_84, Static525.aClass260_4.aClass270_2);
				Static525.aClass260_4.method6404(local990);
			}
		}
		Static422.method6437();
		Static302.method4850();
		Static19.method235();
		Static429.aBoolean549 = true;
		if (Static634.aBoolean729) {
			Static655.method8761("Took: " + (Static549.method7758() - Static259.aLong156) + "ms");
			Static634.aBoolean729 = false;
		}
	}
}
