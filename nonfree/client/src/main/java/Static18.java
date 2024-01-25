import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "[I")
	public static final int[] anIntArray38 = new int[2048];

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BLclient!jd;)Z")
	public static boolean method360(@OriginalArg(1) Class129 arg0) {
		return arg0 == Static197.aClass129_5 || Static19.aClass129_3 == arg0 || arg0 == Static418.aClass129_7 || Static305.aClass129_2 == arg0;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg3 && arg4 == arg2 && arg6 == arg5 && arg7 == arg0) {
			Static185.method2698(arg1, arg5, arg8, arg2, arg0);
			return;
		}
		@Pc(36) int local36 = arg1;
		@Pc(38) int local38 = arg2;
		@Pc(42) int local42 = arg1 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg3 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg7 * 3;
		@Pc(71) int local71 = local50 + arg5 - arg1 - local58;
		@Pc(81) int local81 = local54 + arg0 - arg2 - local62;
		@Pc(90) int local90 = local58 + local42 - local50 - local50;
		@Pc(98) int local98 = local62 + local46 - local54 - local54;
		@Pc(103) int local103 = local50 - local42;
		@Pc(108) int local108 = local54 - local46;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local118 * local110 >> 12;
			@Pc(128) int local128 = local124 * local71;
			@Pc(132) int local132 = local124 * local81;
			@Pc(136) int local136 = local90 * local118;
			@Pc(140) int local140 = local118 * local98;
			@Pc(144) int local144 = local110 * local103;
			@Pc(148) int local148 = local108 * local110;
			@Pc(160) int local160 = arg1 + (local136 + local128 + local144 >> 12);
			@Pc(171) int local171 = (local140 + local132 + local148 >> 12) + arg2;
			Static185.method2698(local36, local160, arg8, local38, local171);
			local36 = local160;
			local38 = local171;
		}
	}
}
