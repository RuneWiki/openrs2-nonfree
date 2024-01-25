import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
	public static int anInt3645;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array8;

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "[I")
	public static int[] anIntArray223;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
	public static int anInt3646 = 0;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
	public static void method2890() {
		Static251.method3224(false);
		Static168.anInt4861 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static160.aByteArrayArray7.length; local14++) {
			if (Static149.anIntArray139[local14] != -1 && Static160.aByteArrayArray7[local14] == null) {
				Static160.aByteArrayArray7[local14] = Static71.aClass243_255.method5455(0, Static149.anIntArray139[local14]);
				if (Static160.aByteArrayArray7[local14] == null) {
					Static168.anInt4861++;
					local12 = false;
				}
			}
			if (Static393.anIntArray330[local14] != -1 && Static415.aByteArrayArray19[local14] == null) {
				Static415.aByteArrayArray19[local14] = Static71.aClass243_255.method5476(Static393.anIntArray330[local14], Static113.anIntArrayArray11[local14], 0);
				if (Static415.aByteArrayArray19[local14] == null) {
					Static168.anInt4861++;
					local12 = false;
				}
			}
			if (Static398.anIntArray459[local14] != -1 && Static191.aByteArrayArray9[local14] == null) {
				Static191.aByteArrayArray9[local14] = Static71.aClass243_255.method5455(0, Static398.anIntArray459[local14]);
				if (Static191.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static168.anInt4861++;
				}
			}
			if (Static404.anIntArray465[local14] != -1 && Static48.aByteArrayArray3[local14] == null) {
				Static48.aByteArrayArray3[local14] = Static71.aClass243_255.method5455(0, Static404.anIntArray465[local14]);
				if (Static48.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static168.anInt4861++;
				}
			}
			if (Static319.anIntArray372 != null && Static415.aByteArrayArray18[local14] == null && Static319.anIntArray372[local14] != -1) {
				Static415.aByteArrayArray18[local14] = Static71.aClass243_255.method5476(Static319.anIntArray372[local14], Static113.anIntArrayArray11[local14], 0);
				if (Static415.aByteArrayArray18[local14] == null) {
					Static168.anInt4861++;
					local12 = false;
				}
			}
		}
		if (Static161.aClass153_2 == null) {
			if (Static164.aClass5_Sub2_Sub18_3 == null || !Static129.aClass243_72.method5456(Static164.aClass5_Sub2_Sub18_3.aString75 + "_staticelements")) {
				Static161.aClass153_2 = new Class153(0);
			} else if (Static129.aClass243_72.method5474(Static164.aClass5_Sub2_Sub18_3.aString75 + "_staticelements")) {
				Static161.aClass153_2 = Static122.method1731(Static150.aBoolean175, Static164.aClass5_Sub2_Sub18_3.aString75 + "_staticelements", Static129.aClass243_72);
			} else {
				local12 = false;
				Static168.anInt4861++;
			}
		}
		if (!local12) {
			Static192.anInt3195 = 1;
			return;
		}
		Static198.anInt3281 = 0;
		local12 = true;
		@Pc(271) int local271;
		@Pc(282) int local282;
		for (@Pc(253) int local253 = 0; local253 < Static160.aByteArrayArray7.length; local253++) {
			@Pc(259) byte[] local259 = Static415.aByteArrayArray19[local253];
			if (local259 != null) {
				local271 = (Static362.anIntArray418[local253] >> 8) * 64 - Static31.anInt618;
				local282 = (Static362.anIntArray418[local253] & 0xFF) * 64 - Static226.anInt3768;
				if (Static148.anInt2668 != 0) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static57.method932(local282, local271, Static418.anInt6969, Static433.anInt7210, local259);
			}
			local259 = Static48.aByteArrayArray3[local253];
			if (local259 != null) {
				local271 = (Static362.anIntArray418[local253] >> 8) * 64 - Static31.anInt618;
				local282 = (Static362.anIntArray418[local253] & 0xFF) * 64 - Static226.anInt3768;
				if (Static148.anInt2668 != 0) {
					local282 = 10;
					local271 = 10;
				}
				local12 &= Static57.method932(local282, local271, Static418.anInt6969, Static433.anInt7210, local259);
			}
		}
		if (!local12) {
			Static192.anInt3195 = 2;
			return;
		}
		if (Static192.anInt3195 != 0) {
			Static255.method3305(Static428.aClass23_4, Static427.aClass198_118.method4012(Static38.anInt4834) + "<br>(100%)", true);
		}
		Static341.method4427();
		Static159.method2247();
		@Pc(389) boolean local389 = false;
		if (Static407.aClass200_9.method5812() && Static216.aClass1_Sub1_1.aBoolean306) {
			for (local271 = 0; local271 < Static160.aByteArrayArray7.length; local271++) {
				if (Static48.aByteArrayArray3[local271] != null || Static191.aByteArrayArray9[local271] != null) {
					local389 = true;
					break;
				}
			}
		}
		if (Static216.aClass1_Sub1_1.aBoolean313) {
			local271 = Static225.anIntArray235[Static50.anInt905];
		} else {
			local271 = Static170.anIntArray160[Static50.anInt905];
		}
		if (Static407.aClass200_9.method5833()) {
			local271++;
		}
		Static118.method1682(Static433.anInt7210, Static418.anInt6969, local271, local389, Static407.aClass200_9.method5852() > 0);
		for (local282 = 0; local282 < 4; local282++) {
			Static163.aClass240Array1[local282].method5416();
		}
		Static451.method5941();
		Static402.method5352(false);
		Static224.method2950();
		Static51.aClass207_1 = null;
		Static341.method4427();
		System.gc();
		Static251.method3224(true);
		Static398.method5173();
		Static49.anInt896 = Static216.aClass1_Sub1_1.method3580(Static146.anInt2644);
		Static50.aBoolean73 = Static102.anInt1724 >= 96;
		Static426.aBoolean479 = Static216.aClass1_Sub1_1.aBoolean306;
		Static20.aBoolean37 = Static216.aClass1_Sub1_1.method3579(Static146.anInt2644);
		Static159.aBoolean178 = !Static216.aClass1_Sub1_1.aBoolean311;
		Static304.anInt4779 = Static216.aClass1_Sub1_1.method3587(Static146.anInt2644) ? -1 : Static123.anInt2187;
		Static87.aBoolean107 = Static216.aClass1_Sub1_1.aBoolean312;
		Static233.aBoolean246 = Static146.anInt2644 == 1 || Static216.aClass1_Sub1_1.aBoolean302;
		Static427.aClass113_Sub1_2 = new Class113_Sub1(4, Static433.anInt7210, Static418.anInt6969, false);
		if (Static148.anInt2668 == 0) {
			Static253.method3241(Static160.aByteArrayArray7, Static427.aClass113_Sub1_2);
		} else {
			Static87.method1266(Static160.aByteArrayArray7, Static427.aClass113_Sub1_2);
		}
		Static234.method3039(Static418.anInt6969 >> 4, Static433.anInt7210 >> 4);
		Static268.method3384();
		if (local389) {
			Static423.method5618(true);
			Static248.aClass113_Sub1_1 = new Class113_Sub1(1, Static433.anInt7210, Static418.anInt6969, true);
			if (Static148.anInt2668 == 0) {
				Static253.method3241(Static191.aByteArrayArray9, Static248.aClass113_Sub1_1);
				Static251.method3224(true);
			} else {
				Static87.method1266(Static191.aByteArrayArray9, Static248.aClass113_Sub1_1);
				Static251.method3224(true);
			}
			Static248.aClass113_Sub1_1.method2964(Static427.aClass113_Sub1_2.anIntArrayArrayArray11[0]);
			Static248.aClass113_Sub1_1.method2973(Static407.aClass200_9, null, null);
			Static423.method5618(false);
		}
		Static427.aClass113_Sub1_2.method2973(Static407.aClass200_9, Static163.aClass240Array1, local389 ? Static248.aClass113_Sub1_1.anIntArrayArrayArray11 : null);
		if (Static148.anInt2668 == 0) {
			Static251.method3224(true);
			Static353.method4568(Static415.aByteArrayArray19, Static427.aClass113_Sub1_2);
			if (Static415.aByteArrayArray18 != null) {
				Static81.method1207();
			}
		} else {
			Static251.method3224(true);
			Static277.method3445(Static427.aClass113_Sub1_2, Static415.aByteArrayArray19);
		}
		Static159.method2247();
		Static251.method3224(true);
		Static427.aClass113_Sub1_2.method2967(null, local389 ? Static408.aClass125Array2[0] : null, Static407.aClass200_9);
		Static427.aClass113_Sub1_2.method2980(Static407.aClass200_9);
		Static251.method3224(true);
		if (local389) {
			Static423.method5618(true);
			Static251.method3224(true);
			if (Static148.anInt2668 == 0) {
				Static353.method4568(Static48.aByteArrayArray3, Static248.aClass113_Sub1_1);
			} else {
				Static277.method3445(Static248.aClass113_Sub1_1, Static48.aByteArrayArray3);
			}
			Static159.method2247();
			Static251.method3224(true);
			Static248.aClass113_Sub1_1.method2967(Static110.aClass125Array1[0], null, Static407.aClass200_9);
			Static248.aClass113_Sub1_1.method2980(Static407.aClass200_9);
			Static251.method3224(true);
			Static423.method5618(false);
		}
		Static200.method2683();
		@Pc(726) int local726 = Static427.aClass113_Sub1_2.anInt3762;
		if (local726 > Static6.anInt131) {
			local726 = Static6.anInt131;
		}
		if (local726 < Static6.anInt131 - 1) {
			local726 = Static6.anInt131 - 1;
		}
		if (Static216.aClass1_Sub1_1.method3587(Static146.anInt2644)) {
			Static178.method4586(0);
		} else {
			Static178.method4586(local726);
		}
		@Pc(761) int local761;
		@Pc(765) int local765;
		for (@Pc(757) int local757 = 0; local757 < 4; local757++) {
			for (local761 = 0; local761 < Static433.anInt7210; local761++) {
				for (local765 = 0; local765 < Static418.anInt6969; local765++) {
					Static235.method3042(local765, local757, local761);
				}
			}
		}
		Static353.method4566();
		Static341.method4427();
		Static197.method2626();
		Static159.method2247();
		Static50.aBoolean74 = false;
		Static355.method4596();
		if (Static34.aFrame1 != null && Static14.aClass99_2 != null && Static376.anInt6324 == 10) {
			Static288.method3576(Static113.aClass194_26);
			Static281.aClass5_Sub15_Sub2_13.method5550(1057001181);
		}
		if (Static148.anInt2668 == 0) {
			local761 = (Static345.anInt5641 - (Static433.anInt7210 >> 4)) / 8;
			local765 = ((Static433.anInt7210 >> 4) + Static345.anInt5641) / 8;
			@Pc(842) int local842 = (Static375.anInt6241 - (Static418.anInt6969 >> 4)) / 8;
			@Pc(850) int local850 = ((Static418.anInt6969 >> 4) + Static375.anInt6241) / 8;
			for (@Pc(854) int local854 = local761 - 1; local854 <= local765 + 1; local854++) {
				for (@Pc(860) int local860 = local842 - 1; local860 <= local850 + 1; local860++) {
					if (local854 < local761 || local765 < local854 || local860 < local842 || local860 > local850) {
						Static71.aClass243_255.method5473("m" + local854 + "_" + local860);
						Static71.aClass243_255.method5473("l" + local854 + "_" + local860);
					}
				}
			}
		}
		if (Static376.anInt6324 == 3) {
			Static407.method5394(2);
		} else if (Static376.anInt6324 == 7) {
			Static407.method5394(6);
		} else {
			Static407.method5394(9);
			if (Static14.aClass99_2 != null) {
				Static288.method3576(Static307.aClass194_84);
			}
		}
		Static164.method2262();
		Static341.method4427();
		Static262.method3350();
	}
}
