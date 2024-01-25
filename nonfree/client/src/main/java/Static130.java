import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([BIIII[BIIB)V")
	public static void method2169(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg3++;
				arg0[local26] += arg5[arg4++];
				@Pc(38) int local38 = arg3++;
				arg0[local38] += arg5[arg4++];
				@Pc(50) int local50 = arg3++;
				arg0[local50] += arg5[arg4++];
				@Pc(62) int local62 = arg3++;
				arg0[local62] += arg5[arg4++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg3++;
				arg0[local26] += arg5[arg4++];
			}
			arg4 += arg2;
			arg3 += arg6;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)Z")
	public static boolean method2175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static441.method6336(arg1, arg0) & (Static330.method5080(arg0, arg1) | (arg0 & 0x2000) != 0 | Static64.method1153(arg1, arg0));
	}
}
