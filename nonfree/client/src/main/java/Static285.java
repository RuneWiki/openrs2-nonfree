import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "Lclient!db;")
	public static Class31 aClass31_44 = new Class31(64);

	@OriginalMember(owner = "client!vk", name = "t", descriptor = "S")
	public static short aShort39 = 320;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method4358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg5 && arg4 == arg7 && arg3 == arg2 && arg0 == arg8) {
			Static205.method3213(arg1, arg0, arg3, arg6, arg4);
			return;
		}
		@Pc(31) int local31 = arg4;
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = arg4 * 3;
		@Pc(41) int local41 = arg1 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(53) int local53 = arg2 * 3;
		@Pc(57) int local57 = arg8 * 3;
		@Pc(67) int local67 = arg3 + local49 - local53 - arg1;
		@Pc(78) int local78 = arg0 + local45 - local57 - arg4;
		@Pc(88) int local88 = local41 + local53 - local49 - local49;
		@Pc(98) int local98 = local37 + local57 - local45 - local45;
		@Pc(102) int local102 = local45 - local37;
		@Pc(107) int local107 = local49 - local41;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(120) int local120 = local109 * local109 >> 12;
			@Pc(126) int local126 = local109 * local120 >> 12;
			@Pc(130) int local130 = local78 * local126;
			@Pc(134) int local134 = local67 * local126;
			@Pc(138) int local138 = local88 * local120;
			@Pc(142) int local142 = local120 * local98;
			@Pc(146) int local146 = local102 * local109;
			@Pc(150) int local150 = local109 * local107;
			@Pc(160) int local160 = arg1 + (local150 + local138 + local134 >> 12);
			@Pc(171) int local171 = (local130 + local142 + local146 >> 12) + arg4;
			Static205.method3213(local33, local171, local160, arg6, local31);
			local31 = local171;
			local33 = local160;
		}
	}
}
