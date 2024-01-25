import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "[[Lclient!kg;")
	public static Class171[][] aClass171ArrayArray1;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "[I")
	public static final int[] anIntArray173 = new int[32];

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIIIIII)I")
	public static int method1311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(16) int local16 = arg3;
			arg3 = arg1;
			arg1 = local16;
		}
		if (local7 == 0) {
			return arg4;
		} else if (local7 == 1) {
			return 1 + 7 - arg5 - arg3;
		} else if (local7 == 2) {
			return 8 - arg1 - arg4;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(IIIIIII)V")
	public static void method1312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static235.anInt3970 && Static151.anInt2683 >= arg2 && arg4 >= Static134.anInt2364 && arg5 <= Static60.anInt971) {
			if (arg1 == 1) {
				Static435.method6277(arg0, arg4, arg5, arg3, arg2);
			} else {
				Static446.method6406(arg3, arg0, arg1, arg4, arg2, arg5);
			}
		} else if (arg1 == 1) {
			Static333.method5097(arg5, arg4, arg0, arg3, arg2);
		} else {
			Static417.method6124(arg5, arg0, arg2, arg4, arg1, arg3);
		}
	}
}
