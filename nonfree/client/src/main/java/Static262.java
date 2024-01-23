import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "[I")
	public static int[] anIntArray559 = new int[25];

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "[I")
	public static int[] anIntArray560 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "J")
	public static long aLong210 = 0L;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V")
	public static void method4359() {
		Static175.aClass98_27.method2565(5);
		Static218.aClass98_38.method2565(5);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)[Lclient!qi;")
	public static Class81[] method4360() {
		@Pc(8) Class81[] local8 = new Class81[Static28.anInt494];
		for (@Pc(16) int local16 = 0; local16 < Static28.anInt494; local16++) {
			if (Static283.aBoolean393) {
				local8[local16] = new Class81_Sub1(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local16], Static35.anIntArray54[local16], Static101.anIntArray185[local16], Static306.anIntArray618[local16], Static314.aByteArrayArray130[local16], Static299.anIntArray611);
			} else {
				local8[local16] = new Class81_Sub2(Static148.anInt2816, Static43.anInt812, Static93.anIntArray162[local16], Static35.anIntArray54[local16], Static101.anIntArray185[local16], Static306.anIntArray618[local16], Static314.aByteArrayArray130[local16], Static299.anIntArray611);
			}
		}
		Static6.method108();
		return local8;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg2 && arg4 == arg3 && arg1 == arg8 && arg7 == arg5) {
			Static167.method2788(arg1, arg2, arg5, arg3, arg0);
			return;
		}
		@Pc(40) int local40 = arg3;
		@Pc(42) int local42 = arg2;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg3 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg8 * 3;
		@Pc(66) int local66 = arg7 * 3;
		@Pc(75) int local75 = local58 + arg1 - local62 - arg2;
		@Pc(86) int local86 = arg5 + local50 - arg3 - local66;
		@Pc(91) int local91 = local58 - local46;
		@Pc(100) int local100 = local62 + local46 - local58 - local58;
		@Pc(109) int local109 = local54 + local66 - local50 - local50;
		@Pc(114) int local114 = local50 - local54;
		for (@Pc(116) int local116 = 128; local116 <= 4096; local116 += 128) {
			@Pc(125) int local125 = local116 * local116 >> 12;
			@Pc(131) int local131 = local125 * local116 >> 12;
			@Pc(135) int local135 = local75 * local131;
			@Pc(139) int local139 = local86 * local131;
			@Pc(143) int local143 = local125 * local100;
			@Pc(147) int local147 = local91 * local116;
			@Pc(151) int local151 = local125 * local109;
			@Pc(155) int local155 = local116 * local114;
			@Pc(166) int local166 = (local143 + local135 + local147 >> 12) + arg2;
			@Pc(177) int local177 = (local139 + local151 + local155 >> 12) + arg3;
			Static167.method2788(local166, local42, local177, local40, arg0);
			local40 = local177;
			local42 = local166;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BS)Z")
	public static boolean method4363(@OriginalArg(1) short arg0) {
		if (arg0 == 21 || arg0 == 47 || arg0 == 12 || arg0 == 15 || arg0 == 51 || arg0 == 16 || arg0 == 26 || arg0 == 19) {
			return true;
		} else if (arg0 == 2 || arg0 == 57 || arg0 == 1009 || arg0 == 1007) {
			return true;
		} else if (arg0 == 43 || arg0 == 3 || arg0 == 24 || arg0 == 9 || arg0 == 7) {
			return true;
		} else {
			return arg0 == 40 || arg0 == 20 || arg0 == 11 || arg0 == 42 || arg0 == 36 || arg0 == 58;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method4364() {
		Static259.aClass98_43.method2572();
		Static201.aClass98_32.method2572();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZFIB)[I")
	public static int[] method4367(@OriginalArg(5) float arg0) {
		@Pc(7) Class3_Sub2_Sub6 local7 = new Class3_Sub2_Sub6();
		local7.anInt799 = 8;
		local7.anInt803 = (int) (arg0 * 4096.0F);
		local7.aBoolean69 = true;
		@Pc(22) int[] local22 = new int[2048];
		local7.anInt811 = 8;
		local7.anInt801 = 4;
		local7.anInt806 = 35;
		local7.method4952();
		Static10.method156(1, 2048);
		local7.method656(0, local22);
		return local22;
	}
}
