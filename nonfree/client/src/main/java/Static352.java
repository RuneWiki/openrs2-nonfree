import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "[[Lclient!vp;")
	public static Class309[][] aClass309ArrayArray2;

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "Lclient!ha;")
	public static Class12 aClass12_8;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
	public static int anInt3841 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method3440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg8 && arg7 == arg2 && arg4 == arg3 && arg5 == arg1) {
			Static139.method2955(arg2, arg5, arg0, arg6, arg4);
			return;
		}
		@Pc(36) int local36 = arg0;
		@Pc(38) int local38 = arg2;
		@Pc(42) int local42 = arg0 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg3 * 3;
		@Pc(62) int local62 = arg1 * 3;
		@Pc(72) int local72 = arg4 + local50 - local58 - arg0;
		@Pc(82) int local82 = local54 + arg5 - arg2 - local62;
		@Pc(92) int local92 = local42 + local58 - local50 - local50;
		@Pc(102) int local102 = local62 + local46 - local54 - local54;
		@Pc(107) int local107 = local50 - local42;
		@Pc(112) int local112 = local54 - local46;
		for (@Pc(114) int local114 = 128; local114 <= 4096; local114 += 128) {
			@Pc(122) int local122 = local114 * local114 >> 12;
			@Pc(128) int local128 = local114 * local122 >> 12;
			@Pc(132) int local132 = local128 * local72;
			@Pc(136) int local136 = local82 * local128;
			@Pc(140) int local140 = local122 * local92;
			@Pc(144) int local144 = local102 * local122;
			@Pc(148) int local148 = local107 * local114;
			@Pc(152) int local152 = local112 * local114;
			@Pc(162) int local162 = (local148 + local140 + local132 >> 12) + arg0;
			@Pc(174) int local174 = arg2 + (local136 + local144 + local152 >> 12);
			Static139.method2955(local38, local174, local36, arg6, local162);
			local38 = local174;
			local36 = local162;
		}
	}
}
