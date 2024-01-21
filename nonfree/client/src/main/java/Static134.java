import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!jf;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!vd;")
	public static Class77 aClass77_1;

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!wd;")
	public static Class82 aClass82_15 = new Class82();

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!ec;")
	public static Class22 aClass22_975 = Static60.method1113("Standort");

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "Lclient!ec;")
	private static Class22 aClass22_976 = Static60.method1113("Hidden");

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!ec;")
	public static Class22 aClass22_977 = Static60.method1113("");

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 8412, 8301, 8076, 6936, 5675, 941, 5056, 15795, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_978 = aClass22_976;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_979 = Static60.method1113("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	public static int anInt3157 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public static void method2039() {
		aClass77_1 = null;
		aClass22_979 = null;
		aClass35_1 = null;
		aClass82_15 = null;
		aClass22_978 = null;
		aClass22_975 = null;
		aClass22_976 = null;
		aClass22_977 = null;
		aShortArrayArray6 = null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!nf;ILclient!nf;)V")
	public static void method2040(@OriginalArg(0) Class4_Sub1_Sub2_Sub4_Sub1 arg0, @OriginalArg(2) Class4_Sub1_Sub2_Sub4_Sub1 arg1) {
		if (Static97.aBoolean228) {
			Static43.method819(arg1, arg0);
			return;
		}
		if (Static112.anInt2775 == 0 || Static112.anInt2775 == 5) {
			arg1.method1417(Static133.aClass22_974, 382, 225, 16777215, -1);
			Static118.method1378(230, 233, 304, 34, 9179409);
			Static118.method1378(231, 234, 302, 32, 0);
			Static118.method1373(232, 235, Static7.anInt160 * 3, 30, 9179409);
			Static118.method1373(Static7.anInt160 * 3 + 232, 235, 300 - Static7.anInt160 * 3, 30, 0);
			arg1.method1417(Static61.aClass22_473, 382, 256, 16777215, -1);
		}
		@Pc(93) short local93;
		@Pc(116) int local116;
		if (Static112.anInt2775 == 20) {
			local93 = 211;
			Static4.aClass4_Sub1_Sub2_Sub3_1.method853(382 - Static4.aClass4_Sub1_Sub2_Sub3_1.anInt1206 / 2, 271 - Static4.aClass4_Sub1_Sub2_Sub3_1.anInt1210 / 2);
			arg1.method1417(Static61.aClass22_478, 382, 211, 16776960, 0);
			local116 = local93 + 15;
			arg1.method1417(Static61.aClass22_472, 382, 226, 16776960, 0);
			@Pc(124) int local124 = local116 + 15;
			arg1.method1417(Static61.aClass22_471, 382, 241, 16776960, 0);
			@Pc(132) int local132 = local124 + 15;
			@Pc(133) int local133 = local132 + 10;
			arg1.method1415(Static44.method856(new Class22[] { Static54.aClass22_387, Static81.method1393(Static61.aClass22_476) }), 272, 266, 16777215, 0);
			@Pc(153) int local153 = local133 + 15;
			arg1.method1415(Static44.method856(new Class22[] { Static32.aClass22_215, Static61.aClass22_470.method457() }), 274, 281, 16777215, 0);
			@Pc(174) int local174 = local153 + 15;
		}
		if (Static112.anInt2775 == 10) {
			Static4.aClass4_Sub1_Sub2_Sub3_1.method853(202, 171);
			if (Static9.anInt190 == 0) {
				local93 = 251;
				arg1.method1417(Static28.aClass22_183, 382, 251, 16776960, 0);
				Static66.aClass4_Sub1_Sub2_Sub3_3.method853(229, 271);
				arg1.method1391(Static4.aClass22_28, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				local116 = local93 + 30;
				Static66.aClass4_Sub1_Sub2_Sub3_3.method853(389, 271);
				arg1.method1391(Static87.aClass22_658, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static9.anInt190 == 2) {
				local93 = 211;
				arg1.method1417(Static61.aClass22_478, 382, 211, 16776960, 0);
				local116 = local93 + 15;
				arg1.method1417(Static61.aClass22_472, 382, 226, 16776960, 0);
				local116 += 15;
				arg1.method1417(Static61.aClass22_471, 382, 241, 16776960, 0);
				local116 += 15;
				local116 += 10;
				arg1.method1415(Static44.method856(new Class22[] { Static54.aClass22_387, Static81.method1393(Static61.aClass22_476), Static113.anInt2785 == 0 & Static117.anInt2877 % 40 < 20 ? Static76.aClass22_560 : Static61.aClass22_474 }), 272, 266, 16777215, 0);
				local116 += 15;
				arg1.method1415(Static44.method856(new Class22[] { Static32.aClass22_215, Static61.aClass22_470.method457(), Static117.anInt2877 % 40 < 20 & Static113.anInt2785 == 1 ? Static76.aClass22_560 : Static61.aClass22_474 }), 274, 281, 16777215, 0);
				local116 += 15;
				Static66.aClass4_Sub1_Sub2_Sub3_3.method853(229, 301);
				arg1.method1417(Static32.aClass22_217, 302, 326, 16777215, 0);
				Static66.aClass4_Sub1_Sub2_Sub3_3.method853(389, 301);
				arg1.method1417(Static76.aClass22_562, 462, 326, 16777215, 0);
			} else if (Static9.anInt190 == 3) {
				local93 = 236;
				arg1.method1417(Static72.aClass22_534, 382, 211, 16776960, 0);
				arg1.method1417(Static19.aClass22_152, 382, 236, 16777215, 0);
				local116 = local93 + 15;
				arg1.method1417(Static80.aClass22_628, 382, 251, 16777215, 0);
				local116 += 15;
				arg1.method1417(Static37.aClass22_257, 382, 266, 16777215, 0);
				local116 += 15;
				arg1.method1417(Static87.aClass22_657, 382, 281, 16777215, 0);
				Static66.aClass4_Sub1_Sub2_Sub3_3.method853(309, 301);
				arg1.method1417(Static76.aClass22_562, 382, 326, 16777215, 0);
				local116 += 15;
			}
		}
		if (Static130.anInt3095 != 1) {
			if (Static55.anInt1100 > 0) {
				Static59.method1104(Static55.anInt1100);
				Static55.anInt1100 = 0;
			}
			Static104.method1721();
		}
		Static12.aClass4_Sub1_Sub2_Sub3Array1[Static26.aBoolean94 ? 1 : 0].method853(725, 463);
		if (Static112.anInt2775 > 5 && Static89.anInt2372 != 2 && Static16.anInt379 == 0) {
			if (Static131.aClass4_Sub1_Sub2_Sub3_5 == null) {
				Static131.aClass4_Sub1_Sub2_Sub3_5 = Static114.method1820(Static61.aClass22_474, Static26.aClass20_Sub1_25, Static97.aClass22_752);
			} else {
				Static131.aClass4_Sub1_Sub2_Sub3_5.method853(5, 463);
				arg1.method1417(Static44.method856(new Class22[] { Static13.aClass22_88, Static64.aClass22_488, method2042(Static72.anInt1919) }), 55, 478, 16777215, 0);
				if (Static67.aClass9_1 == null) {
					arg0.method1417(Static58.aClass22_448, 55, 492, 16777215, 0);
				} else {
					arg0.method1417(Static59.aClass22_465, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(627) Graphics local627 = Static89.aCanvas1.getGraphics();
			Static43.aClass11_1.method578(local627);
		} catch (@Pc(635) Exception local635) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)V")
	public static void method2041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub1_Sub1 local7 = Static66.method1161(arg1);
		@Pc(10) int local10 = local7.anInt79;
		@Pc(17) int local17 = local7.anInt81;
		@Pc(20) int local20 = local7.anInt76;
		@Pc(26) int local26 = Class60.anIntArray282[local17 - local20];
		if (arg0 < 0 || arg0 > local26) {
			arg0 = 0;
		}
		local26 <<= local20;
		Static23.anIntArray61[local10] = local26 & arg0 << local20 | Static23.anIntArray61[local10] & ~local26;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lclient!ec;")
	public static Class22 method2042(@OriginalArg(0) int arg0) {
		return Static103.method1719(arg0, false);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILclient!f;I)V")
	public static void method2043(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub7 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt762 == 1) {
			Static48.method905(0, arg1.aClass22_204, arg1.anInt738, 26, Static64.aClass22_485, 0);
		}
		if (arg1.anInt762 == 2 && !Static128.aBoolean274) {
			@Pc(33) Class22 local33 = Static50.method963(arg1);
			if (local33 != null) {
				Static48.method905(0, local33, arg1.anInt738, 8, Static44.method856(new Class22[] { Static112.aClass22_865, arg1.aClass22_208 }), -1);
			}
		}
		if (arg1.anInt762 == 3) {
			Static48.method905(0, Static57.aClass22_443, arg1.anInt738, 4, Static64.aClass22_485, 0);
		}
		if (arg1.anInt762 == 4) {
			Static48.method905(0, arg1.aClass22_204, arg1.anInt738, 40, Static64.aClass22_485, 0);
		}
		if (arg1.anInt762 == 5) {
			Static48.method905(0, arg1.aClass22_204, arg1.anInt738, 34, Static64.aClass22_485, 0);
		}
		if (arg1.anInt762 == 6 && Static43.aClass4_Sub7_9 == null) {
			Static48.method905(0, arg1.aClass22_204, arg1.anInt738, 39, Static64.aClass22_485, -1);
		}
		@Pc(149) int local149;
		@Pc(143) int local143;
		if (arg1.anInt743 == 2) {
			local143 = 0;
			for (@Pc(145) int local145 = 0; local145 < arg1.anInt753; local145++) {
				for (local149 = 0; local149 < arg1.anInt773; local149++) {
					@Pc(158) int local158 = local149 * (arg1.anInt779 + 32);
					@Pc(166) int local166 = (arg1.anInt758 + 32) * local145;
					if (local143 < 20) {
						local158 += arg1.anIntArray87[local143];
						local166 += arg1.anIntArray81[local143];
					}
					if (local158 <= arg2 && local166 <= arg0 && local158 + 32 > arg2 && arg0 < local166 + 32) {
						Static42.aClass4_Sub7_8 = arg1;
						Static67.anInt1869 = local143;
						if (arg1.anIntArray89[local143] > 0) {
							@Pc(219) Class4_Sub1_Sub8 local219 = Static123.method2000(arg1.anIntArray89[local143] - 1);
							if (Static104.anInt2636 == 1 && Static85.method1500(Static124.method1890(arg1))) {
								if (Static38.anInt951 != arg1.anInt738 || Static35.anInt879 != local143) {
									Static48.method905(local219.anInt1456, Static35.aClass22_246, arg1.anInt738, 25, Static44.method856(new Class22[] { Static43.aClass22_290, Static42.aClass22_250, local219.aClass22_359 }), local143);
								}
							} else if (!Static128.aBoolean274 || !Static85.method1500(Static124.method1890(arg1))) {
								@Pc(245) Class22[] local245 = local219.aClass22Array12;
								if (Static78.aBoolean179) {
									local245 = Static104.method1728(local245);
								}
								@Pc(259) int local259;
								@Pc(276) byte local276;
								if (Static85.method1500(Static124.method1890(arg1))) {
									for (local259 = 4; local259 >= 3; local259--) {
										if (local245 != null && local245[local259] != null) {
											if (local259 == 3) {
												local276 = 19;
											} else {
												local276 = 35;
											}
											Static48.method905(local219.anInt1456, local245[local259], arg1.anInt738, local276, Static44.method856(new Class22[] { Static33.aClass22_221, local219.aClass22_359 }), local143);
										} else if (local259 == 4) {
											Static48.method905(local219.anInt1456, Static96.aClass22_716, arg1.anInt738, 35, Static44.method856(new Class22[] { Static33.aClass22_221, local219.aClass22_359 }), local143);
										}
									}
								}
								if (Static132.method2024(Static124.method1890(arg1))) {
									Static48.method905(local219.anInt1456, Static35.aClass22_246, arg1.anInt738, 21, Static44.method856(new Class22[] { Static33.aClass22_221, local219.aClass22_359 }), local143);
								}
								if (Static85.method1500(Static124.method1890(arg1)) && local245 != null) {
									for (local259 = 2; local259 >= 0; local259--) {
										if (local245[local259] != null) {
											local276 = 0;
											if (local259 == 0) {
												local276 = 17;
											}
											if (local259 == 1) {
												local276 = 30;
											}
											if (local259 == 2) {
												local276 = 7;
											}
											Static48.method905(local219.anInt1456, local245[local259], arg1.anInt738, local276, Static44.method856(new Class22[] { Static33.aClass22_221, local219.aClass22_359 }), local143);
										}
									}
								}
								local245 = arg1.aClass22Array4;
								if (Static78.aBoolean179) {
									local245 = Static104.method1728(local245);
								}
								if (local245 != null) {
									for (local259 = 4; local259 >= 0; local259--) {
										if (local245[local259] != null) {
											local276 = 0;
											if (local259 == 0) {
												local276 = 38;
											}
											if (local259 == 1) {
												local276 = 15;
											}
											if (local259 == 2) {
												local276 = 51;
											}
											if (local259 == 3) {
												local276 = 18;
											}
											if (local259 == 4) {
												local276 = 41;
											}
											Static48.method905(local219.anInt1456, local245[local259], arg1.anInt738, local276, Static44.method856(new Class22[] { Static33.aClass22_221, local219.aClass22_359 }), local143);
										}
									}
								}
								Static48.method905(local219.anInt1456, Static113.aClass22_870, arg1.anInt738, 1004, Static44.method856(new Class22[] { Static33.aClass22_221, local219.aClass22_359 }), local143);
							} else if ((Static73.anInt1961 & 0x10) == 16) {
								Static48.method905(local219.anInt1456, Static124.aClass22_927, arg1.anInt738, 43, Static44.method856(new Class22[] { Static12.aClass22_80, Static42.aClass22_250, local219.aClass22_359 }), local143);
							}
						}
					}
					local143++;
				}
			}
		}
		if (!arg1.aBoolean79) {
			return;
		}
		if (!Static128.aBoolean274) {
			@Pc(660) Class22 local660;
			for (local143 = 9; local143 >= 5; local143--) {
				local660 = Static58.method1099(arg1, local143);
				if (local660 != null) {
					Static48.method905(local143 + 1, local660, arg1.anInt738, 1005, arg1.aClass22_205, arg1.anInt784);
				}
			}
			local660 = Static50.method963(arg1);
			if (local660 != null) {
				Static48.method905(0, local660, arg1.anInt738, 8, arg1.aClass22_205, arg1.anInt784);
			}
			for (local149 = 4; local149 >= 0; local149--) {
				@Pc(715) Class22 local715 = Static58.method1099(arg1, local149);
				if (local715 != null) {
					Static48.method905(local149 + 1, local715, arg1.anInt738, 46, arg1.aClass22_205, arg1.anInt784);
				}
			}
			if (Static58.method1098(Static124.method1890(arg1))) {
				Static48.method905(0, Static72.aClass22_525, arg1.anInt738, 39, Static64.aClass22_485, arg1.anInt784);
			}
		} else if (Static78.method1300(Static124.method1890(arg1)) && (Static73.anInt1961 & 0x20) == 32) {
			Static48.method905(0, Static124.aClass22_927, arg1.anInt738, 42, Static44.method856(new Class22[] { Static12.aClass22_80, Static1.aClass22_1, arg1.aClass22_205 }), arg1.anInt784);
		}
	}
}
