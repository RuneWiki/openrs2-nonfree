import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray194 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!co", name = "c", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_180 = new Class131(61, -1);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B[[[Lclient!sd;)V")
	public static void method5515(@OriginalArg(1) Class211[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class211[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class211 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass26_Sub4_2 instanceof Interface6) {
							((Interface6) local27.aClass26_Sub4_2).method4672();
						}
						if (local27.aClass26_Sub3_3 instanceof Interface6) {
							((Interface6) local27.aClass26_Sub3_3).method4672();
						}
						if (local27.aClass26_Sub3_2 instanceof Interface6) {
							((Interface6) local27.aClass26_Sub3_2).method4672();
						}
						if (local27.aClass26_Sub1_2 instanceof Interface6) {
							((Interface6) local27.aClass26_Sub1_2).method4672();
						}
						if (local27.aClass26_Sub1_3 instanceof Interface6) {
							((Interface6) local27.aClass26_Sub1_3).method4672();
						}
						for (@Pc(77) Class125 local77 = local27.aClass125_3; local77 != null; local77 = local77.aClass125_1) {
							@Pc(82) Class26_Sub2 local82 = local77.aClass26_Sub2_1;
							if (local82 instanceof Interface6) {
								((Interface6) local82).method4672();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V")
	public static void method5518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 + arg5;
		@Pc(15) int local15 = arg3 - arg5;
		for (@Pc(17) int local17 = arg0; local17 < local10; local17++) {
			Static217.method3280(Static59.anIntArrayArray34[local17], arg2, arg4, arg1);
		}
		@Pc(35) int local35 = arg5 + arg2;
		@Pc(39) int local39 = arg1 - arg5;
		for (@Pc(41) int local41 = arg3; local41 > local15; local41--) {
			Static217.method3280(Static59.anIntArrayArray34[local41], arg2, arg4, arg1);
		}
		for (@Pc(63) int local63 = local10; local63 <= local15; local63++) {
			@Pc(69) int[] local69 = Static59.anIntArrayArray34[local63];
			Static217.method3280(local69, arg2, arg4, local35);
			Static217.method3280(local69, local39, arg4, arg1);
		}
	}
}
