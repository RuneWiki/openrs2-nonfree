import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!uda", name = "E", descriptor = "Lclient!ha;")
	public static Class82 aClass82_14;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)V")
	public static void method7086() throws Exception_Sub1 {
		if (Static424.anInt7715 == 1) {
			Static366.aClass82_11.method6166(Static520.anInt8806, Static2.anInt5);
		} else {
			Static366.aClass82_11.method6166(0, 0);
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method7088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg1 && arg6 == arg4 && arg7 == arg2 && arg3 == arg8) {
			Static176.method2899(arg8, arg0, arg5, arg7, arg6);
			return;
		}
		@Pc(40) int local40 = arg0;
		@Pc(42) int local42 = arg6;
		@Pc(46) int local46 = arg0 * 3;
		@Pc(50) int local50 = arg6 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg4 * 3;
		@Pc(62) int local62 = arg2 * 3;
		@Pc(66) int local66 = arg3 * 3;
		@Pc(76) int local76 = local54 + arg7 - arg0 - local62;
		@Pc(87) int local87 = arg8 + local58 - arg6 - local66;
		@Pc(97) int local97 = local62 + local46 - local54 - local54;
		@Pc(107) int local107 = local50 + local66 - local58 - local58;
		@Pc(112) int local112 = local54 - local46;
		@Pc(117) int local117 = local58 - local50;
		for (@Pc(119) int local119 = 128; local119 <= 4096; local119 += 128) {
			@Pc(127) int local127 = local119 * local119 >> 12;
			@Pc(133) int local133 = local127 * local119 >> 12;
			@Pc(137) int local137 = local133 * local76;
			@Pc(141) int local141 = local87 * local133;
			@Pc(145) int local145 = local97 * local127;
			@Pc(149) int local149 = local107 * local127;
			@Pc(153) int local153 = local119 * local112;
			@Pc(157) int local157 = local117 * local119;
			@Pc(169) int local169 = (local137 + local145 + local153 >> 12) + arg0;
			@Pc(179) int local179 = (local157 + local149 + local141 >> 12) + arg6;
			Static176.method2899(local179, local40, arg5, local169, local42);
			local42 = local179;
			local40 = local169;
		}
	}
}
