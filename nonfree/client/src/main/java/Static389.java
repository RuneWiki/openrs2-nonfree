import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!lt", name = "cb", descriptor = "I")
	public static int anInt6051 = 0;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
	public static void method5283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = Static448.aClass364ArrayArrayArray2[0][arg1][arg2] != null && Static448.aClass364ArrayArrayArray2[0][arg1][arg2].aClass364_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (Static448.aClass364ArrayArrayArray2[local25][arg1][arg2] == null) {
				@Pc(47) Class364 local47 = Static448.aClass364ArrayArrayArray2[local25][arg1][arg2] = new Class364(local25);
				if (local23) {
					local47.aByte135++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILclient!afa;BI)V")
	public static void method5284(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int[] local11 = new int[4];
		Static732.method6314(local11, 0, local11.length, arg2);
		Static98.method1975(local11, false, arg1, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIBIII)V")
	public static void method5285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static82.anInt1902 <= arg0 && Static77.anInt1737 >= arg1 && Static549.anInt5294 <= arg2 && Static334.anInt5381 >= arg3) {
			if (arg5 == 1) {
				Static593.method7661(arg4, arg0, arg3, arg2, arg1);
			} else {
				Static613.method7849(arg4, arg0, arg2, arg1, arg5, arg3);
			}
		} else if (arg5 == 1) {
			Static351.method4933(arg3, arg1, arg0, arg2, arg4);
		} else {
			Static726.method9589(arg4, arg1, -127, arg5, arg0, arg3, arg2);
		}
	}
}
