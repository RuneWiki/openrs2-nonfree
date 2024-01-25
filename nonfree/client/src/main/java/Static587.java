import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
	public static int anInt9342;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "Z")
	public static boolean aBoolean697 = false;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method8172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg0 && arg5 == arg3 && arg8 == arg2 && arg7 == arg6) {
			Static519.method7510(arg4, arg0, arg8, arg3, arg6);
			return;
		}
		@Pc(45) int local45 = arg0;
		@Pc(47) int local47 = arg3;
		@Pc(51) int local51 = arg0 * 3;
		@Pc(55) int local55 = arg3 * 3;
		@Pc(59) int local59 = arg1 * 3;
		@Pc(63) int local63 = arg5 * 3;
		@Pc(67) int local67 = arg2 * 3;
		@Pc(71) int local71 = arg7 * 3;
		@Pc(81) int local81 = arg8 + local59 - arg0 - local67;
		@Pc(92) int local92 = arg6 + local63 - arg3 - local71;
		@Pc(101) int local101 = local51 + local67 - local59 - local59;
		@Pc(111) int local111 = local55 + local71 - local63 - local63;
		@Pc(115) int local115 = local59 - local51;
		@Pc(120) int local120 = local63 - local55;
		for (@Pc(122) int local122 = 128; local122 <= 4096; local122 += 128) {
			@Pc(130) int local130 = local122 * local122 >> 12;
			@Pc(136) int local136 = local122 * local130 >> 12;
			@Pc(140) int local140 = local136 * local81;
			@Pc(144) int local144 = local136 * local92;
			@Pc(148) int local148 = local130 * local101;
			@Pc(152) int local152 = local111 * local130;
			@Pc(156) int local156 = local122 * local115;
			@Pc(160) int local160 = local122 * local120;
			@Pc(171) int local171 = arg0 + (local156 + local140 + local148 >> 12);
			@Pc(181) int local181 = (local160 + local144 + local152 >> 12) + arg3;
			Static519.method7510(arg4, local45, local171, local47, local181);
			local47 = local181;
			local45 = local171;
		}
	}
}
