import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "Lclient!hv;")
	public static Class110 aClass110_31;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIZIIII)V")
	public static void method5623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg5 && arg3 == arg7 && arg6 == arg4 && arg1 == arg8) {
			Static170.method2386(arg2, arg8, arg0, arg4, arg7);
			return;
		}
		@Pc(27) int local27 = arg2;
		@Pc(29) int local29 = arg7;
		@Pc(33) int local33 = arg2 * 3;
		@Pc(37) int local37 = arg7 * 3;
		@Pc(41) int local41 = arg5 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg6 * 3;
		@Pc(53) int local53 = arg1 * 3;
		@Pc(63) int local63 = local41 + arg4 - arg2 - local49;
		@Pc(73) int local73 = arg8 + local45 - arg7 - local53;
		@Pc(82) int local82 = local33 + local49 - local41 - local41;
		@Pc(93) int local93 = local53 + local37 - local45 - local45;
		@Pc(97) int local97 = local41 - local33;
		@Pc(102) int local102 = local45 - local37;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local104 * local112 >> 12;
			@Pc(122) int local122 = local118 * local63;
			@Pc(126) int local126 = local118 * local73;
			@Pc(130) int local130 = local82 * local112;
			@Pc(134) int local134 = local112 * local93;
			@Pc(138) int local138 = local97 * local104;
			@Pc(142) int local142 = local104 * local102;
			@Pc(153) int local153 = arg2 + (local130 + local122 + local138 >> 12);
			@Pc(165) int local165 = arg7 + (local126 + local134 + local142 >> 12);
			Static170.method2386(local27, local165, arg0, local153, local29);
			local27 = local153;
			local29 = local165;
		}
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)V")
	public static void method5625() {
		if (Static356.aClass38_1 != null) {
			Static356.aClass38_1.method1480();
		}
		if (Static385.aClass38_2 != null) {
			Static385.aClass38_2.method1480();
		}
	}
}
