import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
	public static int anInt6961;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
	public static int anInt6962 = 2;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
	public static void method5800() {
		Static31.method559(false);
		Static483.anInt8144 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static220.aByteArrayArray18.length; local14++) {
			if (Static240.anIntArray424[local14] != -1 && Static220.aByteArrayArray18[local14] == null) {
				Static220.aByteArrayArray18[local14] = Static370.aClass31_81.method667(Static240.anIntArray424[local14], 0);
				if (Static220.aByteArrayArray18[local14] == null) {
					Static483.anInt8144++;
					local12 = false;
				}
			}
			if (Static206.anIntArray400[local14] != -1 && Static34.aByteArrayArray40[local14] == null) {
				Static34.aByteArrayArray40[local14] = Static370.aClass31_81.method681(0, Static206.anIntArray400[local14], Static376.anIntArrayArray61[local14]);
				if (Static34.aByteArrayArray40[local14] == null) {
					local12 = false;
					Static483.anInt8144++;
				}
			}
			if (Static101.anIntArray236[local14] != -1 && Static238.aByteArrayArray38[local14] == null) {
				Static238.aByteArrayArray38[local14] = Static370.aClass31_81.method667(Static101.anIntArray236[local14], 0);
				if (Static238.aByteArrayArray38[local14] == null) {
					local12 = false;
					Static483.anInt8144++;
				}
			}
			if (Static293.anIntArray459[local14] != -1 && Static434.aByteArrayArray31[local14] == null) {
				Static434.aByteArrayArray31[local14] = Static370.aClass31_81.method667(Static293.anIntArray459[local14], 0);
				if (Static434.aByteArrayArray31[local14] == null) {
					local12 = false;
					Static483.anInt8144++;
				}
			}
			if (Static197.anIntArray391 != null && Static475.aByteArrayArray33[local14] == null && Static197.anIntArray391[local14] != -1) {
				Static475.aByteArrayArray33[local14] = Static370.aClass31_81.method681(0, Static197.anIntArray391[local14], Static376.anIntArrayArray61[local14]);
				if (Static475.aByteArrayArray33[local14] == null) {
					local12 = false;
					Static483.anInt8144++;
				}
			}
		}
		if (Static378.aClass67_1 == null) {
			if (Static591.aClass4_Sub7_Sub13_3 == null || !Static376.aClass31_82.method669(Static591.aClass4_Sub7_Sub13_3.aString76 + "_staticelements")) {
				Static378.aClass67_1 = new Class67(0);
			} else if (Static376.aClass31_82.method652(Static591.aClass4_Sub7_Sub13_3.aString76 + "_staticelements")) {
				Static378.aClass67_1 = Static478.method6641(Static591.aClass4_Sub7_Sub13_3.aString76 + "_staticelements", Static376.aClass31_82, Static148.aBoolean511);
			} else {
				local12 = false;
				Static483.anInt8144++;
			}
		}
		if (!local12) {
			Static505.anInt8749 = 1;
			return;
		}
		Static407.anInt7051 = 0;
		local12 = true;
		@Pc(266) int local266;
		@Pc(277) int local277;
		for (@Pc(247) int local247 = 0; local247 < Static220.aByteArrayArray18.length; local247++) {
			@Pc(253) byte[] local253 = Static34.aByteArrayArray40[local247];
			if (local253 != null) {
				local266 = (Static380.anIntArray543[local247] >> 8) * 64 - Static373.anInt6695;
				local277 = (Static380.anIntArray543[local247] & 0xFF) * 64 - Static6.anInt97;
				if (Static236.anInt4754 != 0) {
					local266 = 10;
					local277 = 10;
				}
				local12 &= Static153.method3082(Static38.anInt740, local266, Static38.anInt741, local277, local253);
			}
			local253 = Static434.aByteArrayArray31[local247];
			if (local253 != null) {
				local266 = (Static380.anIntArray543[local247] >> 8) * 64 - Static373.anInt6695;
				local277 = (Static380.anIntArray543[local247] & 0xFF) * 64 - Static6.anInt97;
				if (Static236.anInt4754 != 0) {
					local277 = 10;
					local266 = 10;
				}
				local12 &= Static153.method3082(Static38.anInt740, local266, Static38.anInt741, local277, local253);
			}
		}
		if (!local12) {
			Static505.anInt8749 = 2;
			return;
		}
		if (Static505.anInt8749 != 0) {
			Static433.method6141(Static275.aClass198_11.method4407(Static56.anInt953) + "<br>(100%)", true, Static185.aClass66_14, Static375.aClass91_7, Static162.aClass196_4);
		}
		Static464.method6712();
		Static409.method7475();
		@Pc(385) boolean local385 = false;
		if (Static185.aClass66_14.method6778() && Static189.aClass4_Sub2_Sub1_1.aBoolean648) {
			for (local266 = 0; local266 < Static220.aByteArrayArray18.length; local266++) {
				if (Static434.aByteArrayArray31[local266] != null || Static238.aByteArrayArray38[local266] != null) {
					local385 = true;
					break;
				}
			}
		}
		if (Static189.aClass4_Sub2_Sub1_1.aBoolean657) {
			local266 = Static172.anIntArray361[Static547.anInt6934];
		} else {
			local266 = Static289.anIntArray457[Static547.anInt6934];
		}
		if (Static185.aClass66_14.method6820()) {
			local266++;
		}
		Static415.method5942(Static38.anInt740, Static38.anInt741, local266, local385, Static185.aClass66_14.method6832() > 0);
		for (local277 = 0; local277 < 4; local277++) {
			Static15.aClass84Array1[local277].method2344();
		}
		Static243.method4114();
		Static527.method7354(false);
		Static577.method7857();
		Static380.aBoolean501 = false;
		Static122.aClass255_3 = null;
		Static464.method6712();
		System.gc();
		Static31.method559(true);
		Static91.method2090();
		Static574.anInt6916 = Static189.aClass4_Sub2_Sub1_1.method7643(Static403.anInt6994);
		Static532.aBoolean628 = Static189.aClass4_Sub2_Sub1_1.aBoolean648;
		Static276.aBoolean391 = Static87.anInt2262 >= 96;
		Static461.aBoolean546 = Static189.aClass4_Sub2_Sub1_1.method7644(Static403.anInt6994);
		Static110.aBoolean210 = !Static189.aClass4_Sub2_Sub1_1.aBoolean644;
		Static447.anInt7625 = Static189.aClass4_Sub2_Sub1_1.method7652(Static403.anInt6994) ? -1 : Static312.anInt9775;
		Static190.aBoolean301 = Static158.method3131(Static403.anInt6994) || Static189.aClass4_Sub2_Sub1_1.aBoolean653;
		Static175.aBoolean640 = Static189.aClass4_Sub2_Sub1_1.aBoolean661;
		Static560.aClass85_Sub1_2 = new Class85_Sub1(4, Static38.anInt740, Static38.anInt741, false);
		if (Static236.anInt4754 == 0) {
			Static206.method3646(Static560.aClass85_Sub1_2, Static220.aByteArrayArray18);
		} else {
			Static103.method397(Static220.aByteArrayArray18, Static560.aClass85_Sub1_2);
		}
		Static95.method7586(Static38.anInt740 >> 4, Static38.anInt741 >> 4);
		Static2.method50();
		if (local385) {
			Static58.method855(true);
			Static76.aClass85_Sub1_1 = new Class85_Sub1(1, Static38.anInt740, Static38.anInt741, true);
			if (Static236.anInt4754 == 0) {
				Static206.method3646(Static76.aClass85_Sub1_1, Static238.aByteArrayArray38);
				Static31.method559(true);
			} else {
				Static103.method397(Static238.aByteArrayArray38, Static76.aClass85_Sub1_1);
				Static31.method559(true);
			}
			Static76.aClass85_Sub1_1.method2375(Static560.aClass85_Sub1_2.anIntArrayArrayArray12[0]);
			Static76.aClass85_Sub1_1.method2383(null, null, Static185.aClass66_14);
			Static58.method855(false);
		}
		Static560.aClass85_Sub1_2.method2383(Static15.aClass84Array1, local385 ? Static76.aClass85_Sub1_1.anIntArrayArrayArray12 : null, Static185.aClass66_14);
		if (Static236.anInt4754 == 0) {
			Static31.method559(true);
			Static231.method3998(Static34.aByteArrayArray40, Static560.aClass85_Sub1_2);
			if (Static475.aByteArrayArray33 != null) {
				Static33.method601();
			}
		} else {
			Static31.method559(true);
			Static438.method6222(Static34.aByteArrayArray40, Static560.aClass85_Sub1_2);
		}
		Static409.method7475();
		if (Static87.anInt2262 < 96) {
			Static463.method6490();
		}
		Static31.method559(true);
		Static560.aClass85_Sub1_2.method2384(local385 ? Static109.aClass16Array2[0] : null, null, Static185.aClass66_14);
		Static560.aClass85_Sub1_2.method2392(Static185.aClass66_14);
		Static31.method559(true);
		if (local385) {
			Static58.method855(true);
			Static31.method559(true);
			if (Static236.anInt4754 == 0) {
				Static231.method3998(Static434.aByteArrayArray31, Static76.aClass85_Sub1_1);
			} else {
				Static438.method6222(Static434.aByteArrayArray31, Static76.aClass85_Sub1_1);
			}
			Static409.method7475();
			Static31.method559(true);
			Static76.aClass85_Sub1_1.method2384(null, Static45.aClass16Array1[0], Static185.aClass66_14);
			Static76.aClass85_Sub1_1.method2392(Static185.aClass66_14);
			Static31.method559(true);
			Static58.method855(false);
		}
		Static475.method6608();
		@Pc(726) int local726 = Static560.aClass85_Sub1_2.anInt2691;
		if (Static320.anInt5748 < local726) {
			local726 = Static320.anInt5748;
		}
		if (local726 < Static320.anInt5748 - 1) {
			local726 = Static320.anInt5748 - 1;
		}
		if (Static189.aClass4_Sub2_Sub1_1.method7652(Static403.anInt6994)) {
			Static543.method7529(0);
		} else {
			Static543.method7529(local726);
		}
		@Pc(757) int local757;
		@Pc(761) int local761;
		for (@Pc(753) int local753 = 0; local753 < 4; local753++) {
			for (local757 = 0; local757 < Static38.anInt740; local757++) {
				for (local761 = 0; local761 < Static38.anInt741; local761++) {
					Static293.method4590(local757, local761, local753);
				}
			}
		}
		Static308.method4762();
		Static464.method6712();
		Static514.method7263();
		Static409.method7475();
		Static448.method6329();
		@Pc(814) Class4_Sub41 local814;
		if (Static537.aFrame2 != null && Static235.aClass45_1 != null && Static598.anInt9831 == 11) {
			local814 = Static128.method2707(Static519.aClass61_119, Class16_Sub3.lb);
			local814.aClass4_Sub9_Sub1_3.method5963(1057001181);
			Static551.method7603(local814);
		}
		if (Static236.anInt4754 == 0) {
			local757 = (Static304.anInt5549 - (Static38.anInt740 >> 4)) / 8;
			local761 = (Static304.anInt5549 + (Static38.anInt740 >> 4)) / 8;
			@Pc(854) int local854 = (Static403.anInt6995 - (Static38.anInt741 >> 4)) / 8;
			@Pc(862) int local862 = ((Static38.anInt741 >> 4) + Static403.anInt6995) / 8;
			for (@Pc(866) int local866 = local757 - 1; local866 <= local761 + 1; local866++) {
				for (@Pc(872) int local872 = local854 - 1; local872 <= local862 + 1; local872++) {
					if (local866 < local757 || local761 < local866 || local854 > local872 || local862 < local872) {
						Static370.aClass31_81.method658("m" + local866 + "_" + local872);
						Static370.aClass31_81.method658("l" + local866 + "_" + local872);
					}
				}
			}
		}
		if (Static598.anInt9831 == 4) {
			Static33.method600(3);
		} else if (Static598.anInt9831 == 8) {
			Static33.method600(7);
		} else {
			Static33.method600(10);
			if (Static235.aClass45_1 != null) {
				local814 = Static128.method2707(Static481.aClass61_114, Class16_Sub3.lb);
				Static551.method7603(local814);
			}
		}
		Static224.method3850();
		Static464.method6712();
		Static437.method6207();
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILclient!st;IB)V")
	public static void method5801(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray653[0];
		@Pc(15) int local15 = arg1.anIntArray654[0];
		if (local10 < 0 || local10 >= Static38.anInt740 || local15 < 0 || local15 >= Static38.anInt741 || (arg0 < 0 || Static38.anInt740 <= arg0 || arg2 < 0 || Static38.anInt741 <= arg2)) {
			return;
		}
		@Pc(77) int local77 = Static208.method3673(local10, 0, arg0, true, local15, 0, Static15.aClass84Array1[arg1.aByte101], arg1.method7021(), 0, arg2, 0, -4, Static475.anIntArray637, Static556.anIntArray591);
		if (local77 >= 1 && local77 <= 3) {
			for (@Pc(89) int local89 = 0; local89 < local77 - 1; local89++) {
				arg1.method7038(Static475.anIntArray637[local89], Static556.anIntArray591[local89], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)V")
	public static void method5802() {
		if (!Static524.aBoolean617) {
			return;
		}
		@Pc(15) Class115 local15 = Static279.method4432(Static539.anInt9099, Static143.anInt3245);
		if (local15 != null && local15.anObjectArray25 != null) {
			@Pc(24) Class4_Sub12 local24 = new Class4_Sub12();
			local24.anObjectArray3 = local15.anObjectArray25;
			local24.aClass115_5 = local15;
			Static205.method3636(local24);
		}
		Static209.anInt9662 = -1;
		Static485.anInt8162 = -1;
		Static524.aBoolean617 = false;
		if (local15 != null) {
			Static330.method4950(local15);
		}
	}
}
