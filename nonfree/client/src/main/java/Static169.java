import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!sc", name = "ab", descriptor = "Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 aClass1_Sub2_Sub8_Sub3_3;

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1083 = Static81.method1507("blinken1:");

	@OriginalMember(owner = "client!sc", name = "T", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1084 = Static81.method1507("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "J")
	public static long aLong122 = 0L;

	@OriginalMember(owner = "client!sc", name = "V", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1085 = Static81.method1507("http:)4)4www)3runescape)3com)4l=");

	@OriginalMember(owner = "client!sc", name = "Z", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1086 = aClass24_1084;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIBII)V")
	public static void method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static63.anInt1608 <= arg3 && arg0 <= Static63.anInt1595 && arg4 >= Static13.anInt308 && Static52.anInt1338 >= arg1) {
			Static166.method2833(arg4, arg0, arg1, arg2, arg3);
		} else {
			Static170.method2919(arg1, arg3, arg2, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!gb;Lclient!gb;)V")
	public static void method2917(@OriginalArg(1) Class1_Sub2_Sub8_Sub1_Sub1 arg0, @OriginalArg(2) Class1_Sub2_Sub8_Sub1_Sub1 arg1) {
		if (Static122.aBoolean123) {
			Static143.method2482(arg1, arg0);
			return;
		}
		if (Static160.anInt4679 == 0 || Static160.anInt4679 == 5) {
			arg0.method1246(Static98.aClass24_655, 382, 225, 16777215, -1);
			Static90.method3490(230, 233, 304, 34, 9179409);
			Static90.method3490(231, 234, 302, 32, 0);
			Static90.method3482(232, 235, Static50.anInt1256 * 3, 30, 9179409);
			Static90.method3482(Static50.anInt1256 * 3 + 232, 235, 300 - Static50.anInt1256 * 3, 30, 0);
			arg0.method1246(Static159.aClass24_1030, 382, 256, 16777215, -1);
		}
		@Pc(116) short local116;
		@Pc(124) int local124;
		if (Static160.anInt4679 == 20) {
			Static93.aClass1_Sub2_Sub8_Sub2_2.method1960(382 - Static93.aClass1_Sub2_Sub8_Sub2_2.anInt2563 / 2, 271 - Static93.aClass1_Sub2_Sub8_Sub2_2.anInt2562 / 2);
			local116 = 211;
			arg0.method1246(Static159.aClass24_1029, 382, 211, 16776960, 0);
			local124 = local116 + 15;
			arg0.method1246(Static159.aClass24_1034, 382, 226, 16776960, 0);
			@Pc(132) int local132 = local124 + 15;
			arg0.method1246(Static159.aClass24_1033, 382, 241, 16776960, 0);
			@Pc(140) int local140 = local132 + 15;
			@Pc(141) int local141 = local140 + 10;
			arg0.method1273(Static63.method1281(new Class24[] { Static4.aClass24_1303, Static51.method1264(Static159.aClass24_1036) }), 272, 266, 16777215, 0);
			@Pc(161) int local161 = local141 + 15;
			arg0.method1273(Static63.method1281(new Class24[] { Static66.aClass24_471, Static159.aClass24_1031.method777() }), 274, 281, 16777215, 0);
			@Pc(182) int local182 = local161 + 15;
		}
		if (Static160.anInt4679 == 10) {
			Static93.aClass1_Sub2_Sub8_Sub2_2.method1960(202, 171);
			if (Static106.anInt2402 == 0) {
				local116 = 251;
				arg0.method1246(Static146.aClass24_929, 382, 251, 16776960, 0);
				local124 = local116 + 30;
				Static172.aClass1_Sub2_Sub8_Sub2_4.method1960(229, 271);
				arg0.method1248(Static172.aClass24_1102, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static172.aClass1_Sub2_Sub8_Sub2_4.method1960(389, 271);
				arg0.method1248(Static127.aClass24_843, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static106.anInt2402 == 2) {
				local116 = 211;
				arg0.method1246(Static159.aClass24_1029, 382, 211, 16776960, 0);
				local124 = local116 + 15;
				arg0.method1246(Static159.aClass24_1034, 382, 226, 16776960, 0);
				local124 += 15;
				arg0.method1246(Static159.aClass24_1033, 382, 241, 16776960, 0);
				@Pc(371) boolean local371;
				if (Static85.anInt3409 == 0 && Static42.anInt1100 % 40 < 20 && Static161.aBoolean168) {
					local371 = true;
				} else {
					local371 = false;
				}
				local124 += 15;
				local124 += 10;
				arg0.method1273(Static63.method1281(new Class24[] { Static4.aClass24_1303, Static51.method1264(Static159.aClass24_1036), local371 ? Static42.aClass24_264 : Static159.aClass24_1035 }), 272, 266, 16777215, 0);
				local124 += 15;
				if (Static85.anInt3409 == 1 && Static42.anInt1100 % 40 < 20 && Static161.aBoolean168) {
					local371 = true;
				} else {
					local371 = false;
				}
				arg0.method1273(Static63.method1281(new Class24[] { Static66.aClass24_471, Static159.aClass24_1031.method777(), local371 ? Static42.aClass24_264 : Static159.aClass24_1035 }), 274, 281, 16777215, 0);
				local124 += 15;
				Static172.aClass1_Sub2_Sub8_Sub2_4.method1960(229, 301);
				arg0.method1246(Static160.aClass24_1328, 302, 326, 16777215, 0);
				Static172.aClass1_Sub2_Sub8_Sub2_4.method1960(389, 301);
				arg0.method1246(Static95.aClass24_649, 462, 326, 16777215, 0);
			} else if (Static106.anInt2402 == 3) {
				local116 = 236;
				arg0.method1246(Static98.aClass24_657, 382, 211, 16776960, 0);
				arg0.method1246(Static155.aClass24_872, 382, 236, 16777215, 0);
				local124 = local116 + 15;
				arg0.method1246(Static3.aClass24_33, 382, 251, 16777215, 0);
				local124 += 15;
				arg0.method1246(Static87.aClass24_616, 382, 266, 16777215, 0);
				local124 += 15;
				arg0.method1246(Static80.aClass24_578, 382, 281, 16777215, 0);
				local124 += 15;
				Static172.aClass1_Sub2_Sub8_Sub2_4.method1960(309, 301);
				arg0.method1246(Static95.aClass24_649, 382, 326, 16777215, 0);
			}
		}
		if (Static5.anInt123 != 1) {
			if (Static184.anInt4128 > 0) {
				Static62.method1205(Static184.anInt4128);
				Static184.anInt4128 = 0;
			}
			Static3.method94();
		}
		Static48.aClass1_Sub2_Sub8_Sub2Array5[Static92.aBoolean104 ? 1 : 0].method1960(725, 463);
		if (Static160.anInt4679 <= 5 || Static83.anInt2000 == 2) {
			return;
		}
		if (Static94.aClass1_Sub2_Sub8_Sub2_3 == null) {
			Static94.aClass1_Sub2_Sub8_Sub2_3 = Static60.method2792(Static134.anInt2974, Static44.aClass69_Sub1_34);
		}
		if (Static94.aClass1_Sub2_Sub8_Sub2_3 == null) {
			return;
		}
		Static94.aClass1_Sub2_Sub8_Sub2_3.method1960(5, 463);
		arg0.method1246(Static63.method1281(new Class24[] { Static187.aClass24_1201, Static61.aClass24_411, Static175.method3020(Static162.anInt3573) }), 55, 478, 16777215, 0);
		if (Static100.aClass89_1 != null) {
			arg1.method1246(Static131.aClass24_881, 55, 492, 16777215, 0);
			return;
		}
		arg1.method1246(Static1.aClass24_13, 55, 492, 16777215, 0);
		return;
	}
}
