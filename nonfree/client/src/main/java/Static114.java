import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "[I")
	public static int[] anIntArray539;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_17 = new Class33(4, 3);

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)Z")
	public static boolean method6188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6190(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(22) int local22 = arg1 - arg2;
		@Pc(26) int local26 = arg2 + arg3;
		for (@Pc(28) int local28 = arg3; local28 < local26; local28++) {
			Static227.method7421(arg4, arg6, arg5, Static81.anIntArrayArray25[local28]);
		}
		for (@Pc(44) int local44 = arg1; local44 > local22; local44--) {
			Static227.method7421(arg4, arg6, arg5, Static81.anIntArrayArray25[local44]);
		}
		@Pc(63) int local63 = arg5 - arg2;
		@Pc(67) int local67 = arg4 + arg2;
		for (@Pc(69) int local69 = local26; local69 <= local22; local69++) {
			@Pc(75) int[] local75 = Static81.anIntArrayArray25[local69];
			Static227.method7421(arg4, arg6, local67, local75);
			Static227.method7421(local67, arg0, local63, local75);
			Static227.method7421(local63, arg6, arg5, local75);
		}
	}
}
