import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	public static int anInt2993;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "[I")
	public static int[] anIntArray367;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt2990 = -1;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "[S")
	public static short[] aShortArray77 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!md", name = "k", descriptor = "I")
	public static int anInt2997 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg2 + arg3;
		@Pc(14) int local14 = arg5 - arg3;
		@Pc(19) int local19 = arg6 - arg3;
		@Pc(24) int local24 = arg4 + arg3;
		@Pc(26) int local26;
		for (local26 = arg2; local26 < local10; local26++) {
			Static288.method4405(arg1, arg6, arg4, Static151.anIntArrayArray26[local26]);
		}
		for (local26 = arg5; local26 > local14; local26--) {
			Static288.method4405(arg1, arg6, arg4, Static151.anIntArrayArray26[local26]);
		}
		for (local26 = local10; local26 <= local14; local26++) {
			@Pc(87) int[] local87 = Static151.anIntArrayArray26[local26];
			Static288.method4405(arg1, local24, arg4, local87);
			Static288.method4405(arg0, local19, local24, local87);
			Static288.method4405(arg1, arg6, local19, local87);
		}
	}
}
