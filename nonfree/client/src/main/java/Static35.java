import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!ni;")
	public static Class223 aClass223_10;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public static int anInt884 = -1;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	public static int anInt885 = -1;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)V")
	public static void method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg0 + 1;
		Static571.method7990(arg4, Static173.anIntArrayArray15[arg0], arg3, arg2);
		@Pc(18) int local18 = arg1 - 1;
		Static571.method7990(arg4, Static173.anIntArrayArray15[arg1], arg3, arg2);
		for (@Pc(30) int local30 = local5; local30 <= local18; local30++) {
			@Pc(36) int[] local36 = Static173.anIntArrayArray15[local30];
			local36[arg3] = local36[arg2] = arg4;
		}
	}
}
