import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "[I")
	public static int[] anIntArray435;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	public static int anInt4991;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!uq;Z)V")
	public static void method4147(@OriginalArg(0) Class251 arg0) {
		if (arg0.anInt6654 == 5 && arg0.anInt6704 != -1) {
			Static321.method4580(Static415.aClass39_11, arg0);
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg4 && arg1 == arg3 && arg7 == arg6 && arg5 == arg8) {
			Static372.method5077(arg7, arg4, arg5, arg0, arg3);
			return;
		}
		@Pc(25) int local25 = arg4;
		@Pc(27) int local27 = arg3;
		@Pc(31) int local31 = arg4 * 3;
		@Pc(35) int local35 = arg3 * 3;
		@Pc(39) int local39 = arg2 * 3;
		@Pc(43) int local43 = arg1 * 3;
		@Pc(47) int local47 = arg6 * 3;
		@Pc(51) int local51 = arg8 * 3;
		@Pc(61) int local61 = arg7 + local39 - local47 - arg4;
		@Pc(71) int local71 = local43 + arg5 - arg3 - local51;
		@Pc(81) int local81 = local31 + local47 - local39 - local39;
		@Pc(90) int local90 = local51 + local35 - local43 - local43;
		@Pc(94) int local94 = local39 - local31;
		@Pc(99) int local99 = local43 - local35;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(108) int local108 = local101 * local101 >> 12;
			@Pc(114) int local114 = local108 * local101 >> 12;
			@Pc(118) int local118 = local61 * local114;
			@Pc(122) int local122 = local71 * local114;
			@Pc(126) int local126 = local81 * local108;
			@Pc(130) int local130 = local108 * local90;
			@Pc(134) int local134 = local101 * local94;
			@Pc(138) int local138 = local99 * local101;
			@Pc(150) int local150 = arg4 + (local118 + local126 + local134 >> 12);
			@Pc(161) int local161 = arg3 + (local138 + local122 + local130 >> 12);
			Static372.method5077(local150, local25, local161, arg0, local27);
			local25 = local150;
			local27 = local161;
		}
	}
}
