import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
	public static int[] anIntArray119;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_48 = new Class296(14, 2);

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public static void method904() {
		if (Static291.aClass122_6 != null) {
			Static291.aClass122_6.method7224();
			Static291.aClass122_6 = null;
			Static379.aClass67_13 = null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIII)V")
	public static void method905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg5 + arg0;
		@Pc(18) int local18 = arg3 - arg0;
		for (@Pc(20) int local20 = arg5; local20 < local14; local20++) {
			Static424.method6216(arg4, arg1, arg2, Static447.anIntArrayArray99[local20]);
		}
		for (@Pc(36) int local36 = arg3; local36 > local18; local36--) {
			Static424.method6216(arg4, arg1, arg2, Static447.anIntArrayArray99[local36]);
		}
		@Pc(59) int local59 = arg4 - arg0;
		@Pc(64) int local64 = arg2 + arg0;
		for (@Pc(66) int local66 = local14; local66 <= local18; local66++) {
			@Pc(72) int[] local72 = Static447.anIntArrayArray99[local66];
			Static424.method6216(local64, arg1, arg2, local72);
			Static424.method6216(arg4, arg1, local59, local72);
		}
	}
}
