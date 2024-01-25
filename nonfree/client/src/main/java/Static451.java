import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "Lclient!v;")
	public static Class244 aClass244_16;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
	public static int anInt7602 = 0;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	public static int anInt7605 = 0;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_254 = new Class92(2, -1);

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "[Lclient!qt;")
	public static final Class1_Sub3_Sub3_Sub2[] aClass1_Sub3_Sub3_Sub2Array1 = new Class1_Sub3_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	public static void method5973() {
		Static108.method2814(false);
		Static202.anInt4031 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static445.aByteArrayArray25.length; local14++) {
			if (Static277.anIntArray351[local14] != -1 && Static445.aByteArrayArray25[local14] == null) {
				Static445.aByteArrayArray25[local14] = Static93.aClass56_22.method1384(Static277.anIntArray351[local14], 0);
				if (Static445.aByteArrayArray25[local14] == null) {
					Static202.anInt4031++;
					local12 = false;
				}
			}
			if (Static20.anIntArray43[local14] != -1 && Static104.aByteArrayArray9[local14] == null) {
				Static104.aByteArrayArray9[local14] = Static93.aClass56_22.method1392(Static20.anIntArray43[local14], 0, Static244.anIntArrayArray37[local14]);
				if (Static104.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static202.anInt4031++;
				}
			}
			if (Static437.anIntArray569[local14] != -1 && Static265.aByteArrayArray14[local14] == null) {
				Static265.aByteArrayArray14[local14] = Static93.aClass56_22.method1384(Static437.anIntArray569[local14], 0);
				if (Static265.aByteArrayArray14[local14] == null) {
					local12 = false;
					Static202.anInt4031++;
				}
			}
			if (Static144.anIntArray241[local14] != -1 && Static303.aByteArrayArray17[local14] == null) {
				Static303.aByteArrayArray17[local14] = Static93.aClass56_22.method1384(Static144.anIntArray241[local14], 0);
				if (Static303.aByteArrayArray17[local14] == null) {
					Static202.anInt4031++;
					local12 = false;
				}
			}
			if (Static363.anIntArray466 != null && Static57.aByteArrayArray4[local14] == null && Static363.anIntArray466[local14] != -1) {
				Static57.aByteArrayArray4[local14] = Static93.aClass56_22.method1392(Static363.anIntArray466[local14], 0, Static244.anIntArrayArray37[local14]);
				if (Static57.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static202.anInt4031++;
				}
			}
		}
		if (Static17.aClass226_1 == null) {
			if (Static213.aClass3_Sub3_Sub5_2 == null || !Static384.aClass56_77.method1364(Static213.aClass3_Sub3_Sub5_2.aString10 + "_staticelements")) {
				Static17.aClass226_1 = new Class226(0);
			} else if (Static384.aClass56_77.method1374(Static213.aClass3_Sub3_Sub5_2.aString10 + "_staticelements")) {
				Static17.aClass226_1 = Static122.method2161(Static213.aClass3_Sub3_Sub5_2.aString10 + "_staticelements", Static139.aBoolean249, Static384.aClass56_77);
			} else {
				local12 = false;
				Static202.anInt4031++;
			}
		}
		if (!local12) {
			Static439.anInt7489 = 1;
			return;
		}
		local12 = true;
		Static383.anInt6683 = 0;
		@Pc(269) int local269;
		@Pc(280) int local280;
		for (@Pc(250) int local250 = 0; local250 < Static445.aByteArrayArray25.length; local250++) {
			@Pc(256) byte[] local256 = Static104.aByteArrayArray9[local250];
			if (local256 != null) {
				local269 = (Static289.anIntArray407[local250] >> 8) * 64 - Static108.anInt3458;
				local280 = (Static289.anIntArray407[local250] & 0xFF) * 64 - Static339.anInt6223;
				if (Static197.anInt4304 != 0) {
					local269 = 10;
					local280 = 10;
				}
				local12 &= Static159.method2741(Static127.anInt2696, local280, local269, local256, Static399.anInt6923);
			}
			local256 = Static303.aByteArrayArray17[local250];
			if (local256 != null) {
				local269 = (Static289.anIntArray407[local250] >> 8) * 64 - Static108.anInt3458;
				local280 = (Static289.anIntArray407[local250] & 0xFF) * 64 - Static339.anInt6223;
				if (Static197.anInt4304 != 0) {
					local280 = 10;
					local269 = 10;
				}
				local12 &= Static159.method2741(Static127.anInt2696, local280, local269, local256, Static399.anInt6923);
			}
		}
		if (!local12) {
			Static439.anInt7489 = 2;
			return;
		}
		if (Static439.anInt7489 != 0) {
			Static373.method5170(Static277.aClass65_5, true, Static427.aClass175_237.method4201(Static216.anInt4257) + "<br>(100%)");
		}
		Static143.method2556();
		Static245.method3782();
		@Pc(382) boolean local382 = false;
		if (Static266.aClass75_7.method2624() && Static123.aClass21_Sub1_1.aBoolean73) {
			for (local269 = 0; local269 < Static445.aByteArrayArray25.length; local269++) {
				if (Static303.aByteArrayArray17[local269] != null || Static265.aByteArrayArray14[local269] != null) {
					local382 = true;
					break;
				}
			}
		}
		if (Static123.aClass21_Sub1_1.aBoolean76) {
			local269 = Static342.anIntArray457[Static441.anInt7511];
		} else {
			local269 = Static47.anIntArray71[Static441.anInt7511];
		}
		if (Static266.aClass75_7.method2589()) {
			local269++;
		}
		Static78.method1397(Static399.anInt6923, Static127.anInt2696, local269, local382, Static266.aClass75_7.method2584() > 0);
		for (local280 = 0; local280 < 4; local280++) {
			Static389.aClass23Array1[local280].method825();
		}
		Static20.method568();
		Static361.method5115(false);
		Static445.method5917();
		Static5.aClass29_1 = null;
		Static143.method2556();
		System.gc();
		Static108.method2814(true);
		Static303.method4478();
		anInt7602 = Static123.aClass21_Sub1_1.method775(Static347.anInt6318);
		Static337.aBoolean435 = Static102.anInt619 >= 96;
		Static335.aBoolean432 = Static123.aClass21_Sub1_1.aBoolean73;
		Static380.aBoolean463 = Static123.aClass21_Sub1_1.method780(Static347.anInt6318);
		Static413.aBoolean306 = !Static123.aClass21_Sub1_1.aBoolean66;
		Static268.anInt5016 = Static123.aClass21_Sub1_1.method787(Static347.anInt6318) ? -1 : Static367.anInt6555;
		Static80.aBoolean137 = Static123.aClass21_Sub1_1.aBoolean67;
		Static433.aBoolean511 = Static347.anInt6318 == 1 || Static123.aClass21_Sub1_1.aBoolean80;
		Static368.aClass4_Sub1_1 = new Class4_Sub1(4, Static399.anInt6923, Static127.anInt2696, false);
		if (Static197.anInt4304 == 0) {
			Static160.method2756(Static445.aByteArrayArray25, Static368.aClass4_Sub1_1);
		} else {
			Static247.method3790(Static445.aByteArrayArray25, Static368.aClass4_Sub1_1);
		}
		Static330.method4795(Static399.anInt6923 >> 4, Static127.anInt2696 >> 4);
		Static265.method3998();
		if (local382) {
			Static41.method922(true);
			Static404.aClass4_Sub1_2 = new Class4_Sub1(1, Static399.anInt6923, Static127.anInt2696, true);
			if (Static197.anInt4304 == 0) {
				Static160.method2756(Static265.aByteArrayArray14, Static404.aClass4_Sub1_2);
				Static108.method2814(true);
			} else {
				Static247.method3790(Static265.aByteArrayArray14, Static404.aClass4_Sub1_2);
				Static108.method2814(true);
			}
			Static404.aClass4_Sub1_2.method743(Static368.aClass4_Sub1_1.anIntArrayArrayArray2[0]);
			Static404.aClass4_Sub1_2.method752(null, null, Static266.aClass75_7);
			Static41.method922(false);
		}
		Static368.aClass4_Sub1_1.method752(Static389.aClass23Array1, local382 ? Static404.aClass4_Sub1_2.anIntArrayArrayArray2 : null, Static266.aClass75_7);
		if (Static197.anInt4304 == 0) {
			Static108.method2814(true);
			Static223.method4971(Static368.aClass4_Sub1_1, Static104.aByteArrayArray9);
			if (Static57.aByteArrayArray4 != null) {
				Static287.method4199();
			}
		} else {
			Static108.method2814(true);
			Static132.method2289(Static104.aByteArrayArray9, Static368.aClass4_Sub1_1);
		}
		Static245.method3782();
		Static108.method2814(true);
		Static368.aClass4_Sub1_1.method747(local382 ? Static401.aClass64Array3[0] : null, null, Static266.aClass75_7);
		Static368.aClass4_Sub1_1.method753(Static266.aClass75_7);
		Static108.method2814(true);
		if (local382) {
			Static41.method922(true);
			Static108.method2814(true);
			if (Static197.anInt4304 == 0) {
				Static223.method4971(Static404.aClass4_Sub1_2, Static303.aByteArrayArray17);
			} else {
				Static132.method2289(Static303.aByteArrayArray17, Static404.aClass4_Sub1_2);
			}
			Static245.method3782();
			Static108.method2814(true);
			Static404.aClass4_Sub1_2.method747(null, Static205.aClass64Array2[0], Static266.aClass75_7);
			Static404.aClass4_Sub1_2.method753(Static266.aClass75_7);
			Static108.method2814(true);
			Static41.method922(false);
		}
		Static434.method5753();
		@Pc(716) int local716 = Static368.aClass4_Sub1_1.anInt822;
		if (local716 > Static124.anInt2688) {
			local716 = Static124.anInt2688;
		}
		if (local716 < Static124.anInt2688 - 1) {
			local716 = Static124.anInt2688 - 1;
		}
		if (Static123.aClass21_Sub1_1.method787(Static347.anInt6318)) {
			Static420.method5623(0);
		} else {
			Static420.method5623(local716);
		}
		@Pc(755) int local755;
		@Pc(759) int local759;
		for (@Pc(751) int local751 = 0; local751 < 4; local751++) {
			for (local755 = 0; local755 < Static399.anInt6923; local755++) {
				for (local759 = 0; local759 < Static127.anInt2696; local759++) {
					Static213.method3438(local759, local755, local751);
				}
			}
		}
		Static42.method929();
		Static143.method2556();
		Static396.method5332();
		Static245.method3782();
		Static428.aBoolean505 = false;
		Static84.method1461();
		if (Static225.aFrame1 != null && Static122.aClass27_1 != null && Static142.anInt3209 == 25) {
			Static414.method5552(Static317.aClass92_190);
			Static302.aClass3_Sub2_Sub2_2.method6008(1057001181);
		}
		if (Static197.anInt4304 == 0) {
			local755 = (Static422.anInt7272 - (Static399.anInt6923 >> 4)) / 8;
			local759 = (Static422.anInt7272 + (Static399.anInt6923 >> 4)) / 8;
			@Pc(842) int local842 = (Static442.anInt7524 - (Static127.anInt2696 >> 4)) / 8;
			@Pc(850) int local850 = (Static442.anInt7524 + (Static127.anInt2696 >> 4)) / 8;
			for (@Pc(854) int local854 = local755 - 1; local854 <= local759 + 1; local854++) {
				for (@Pc(860) int local860 = local842 - 1; local860 <= local850 + 1; local860++) {
					if (local755 > local854 || local759 < local854 || local842 > local860 || local860 > local850) {
						Static93.aClass56_22.method1376("m" + local854 + "_" + local860);
						Static93.aClass56_22.method1376("l" + local854 + "_" + local860);
					}
				}
			}
		}
		if (Static142.anInt3209 == 28) {
			Static293.method2805(10);
		} else {
			Static293.method2805(30);
			if (Static122.aClass27_1 != null) {
				Static414.method5552(Static6.aClass92_6);
			}
		}
		Static111.method5936();
		Static143.method2556();
		Static227.method4681();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIZIZ)I")
	public static int method5974(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(8) Class3_Sub30 local8 = Static9.method237(false, arg1);
		if (local8 == null) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < local8.anIntArray360.length; local16++) {
			if (local8.anIntArray360[local16] >= 0 && local8.anIntArray360[local16] < Static89.aClass157_1.anInt4724) {
				@Pc(40) Class191 local40 = Static89.aClass157_1.method3832(local8.anIntArray360[local16]);
				@Pc(50) int local50 = local40.method4662(Static294.aClass69_2.method1740(arg0).anInt7023, arg0);
				if (arg2) {
					local14 += local50 * local8.anIntArray362[local16];
				} else {
					local14 += local50;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method5975(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static116.anInt6677 > 0) {
			local18 = Static140.aByteArrayArray10[--Static116.anInt6677];
			Static140.aByteArrayArray10[Static116.anInt6677] = null;
			return local18;
		} else if (arg0 == 5000 && Static72.anInt2368 > 0) {
			local18 = Static440.aByteArrayArray24[--Static72.anInt2368];
			Static440.aByteArrayArray24[Static72.anInt2368] = null;
			return local18;
		} else if (arg0 == 30000 && Static278.anInt6872 > 0) {
			local18 = Static434.aByteArrayArray22[--Static278.anInt6872];
			Static434.aByteArrayArray22[Static278.anInt6872] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}
}
