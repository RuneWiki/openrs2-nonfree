import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!mia", name = "p", descriptor = "Z")
	public static boolean aBoolean554 = true;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method5858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg1 + arg4 && arg0 + arg2 > arg4) {
			return arg5 + arg7 > arg6 && arg7 < arg6 + arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I[IB[ILclient!uja;I)Lclient!jja;")
	public static Class1_Sub1 method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class145_Sub3 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg4 * arg0];
		for (@Pc(19) int local19 = 0; local19 < arg4; local19++) {
			@Pc(29) int local29 = arg2[local19] + arg0 * local19;
			for (@Pc(31) int local31 = 0; local31 < arg1[local19]; local31++) {
				local10[local29++] = -1;
			}
		}
		return new Class1_Sub1(arg3, arg0, arg4, local10);
	}
}
