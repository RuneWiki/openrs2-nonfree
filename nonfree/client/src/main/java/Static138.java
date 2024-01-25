import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "Lclient!jf;")
	public static final Class178 aClass178_2 = new Class178();

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method2414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg6 && arg2 == arg8 && arg7 == arg1 && arg3 == arg5) {
			Static666.method8874(arg1, arg6, arg0, arg3, arg2);
			return;
		}
		@Pc(36) int local36 = arg6;
		@Pc(38) int local38 = arg2;
		@Pc(42) int local42 = arg6 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg8 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(62) int local62 = arg5 * 3;
		@Pc(72) int local72 = arg1 + local50 - local58 - arg6;
		@Pc(80) int local80 = local54 + arg3 - local62 - arg2;
		@Pc(90) int local90 = local58 + local42 - local50 - local50;
		@Pc(99) int local99 = local46 + local62 - local54 - local54;
		@Pc(104) int local104 = local50 - local42;
		@Pc(109) int local109 = local54 - local46;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local111 * local119 >> 12;
			@Pc(129) int local129 = local125 * local72;
			@Pc(133) int local133 = local125 * local80;
			@Pc(137) int local137 = local90 * local119;
			@Pc(141) int local141 = local119 * local99;
			@Pc(145) int local145 = local111 * local104;
			@Pc(149) int local149 = local109 * local111;
			@Pc(159) int local159 = arg6 + (local145 + local129 + local137 >> 12);
			@Pc(169) int local169 = (local149 + local141 + local133 >> 12) + arg2;
			Static666.method8874(local159, local36, arg0, local169, local38);
			local38 = local169;
			local36 = local159;
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IBI)Z")
	public static boolean method2415(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static187.method5797(arg0, arg1) || Static443.method6451(arg0, arg1);
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIZ)V")
	public static void method2416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(19, (long) arg0 | (long) arg1 << 32);
		local14.method7288();
	}
}
