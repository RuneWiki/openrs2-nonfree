import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
	public static int anInt2505;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "[Lclient!fe;")
	public static Class23_Sub1[] aClass23_Sub1Array1;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
	public static int[] anIntArray214 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
	public static int anInt2510 = 0;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIBIIII)V")
	public static void method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg5 < 0 || arg4 >= 103 || arg5 >= 103) {
			return;
		}
		@Pc(34) int local34;
		if (arg2 == 0) {
			@Pc(23) Class160 local23 = Static281.method4343(arg0, arg4, arg5);
			if (local23 != null) {
				local34 = (int) (local23.aLong170 >>> 32) & Integer.MAX_VALUE;
				if (arg1 == 2) {
					local23.aClass15_7 = new Class15_Sub3(local34, 2, arg3 + 4, arg0, arg4, arg5, arg6, false, local23.aClass15_7);
					local23.aClass15_8 = new Class15_Sub3(local34, 2, arg3 + 1 & 0x3, arg0, arg4, arg5, arg6, false, local23.aClass15_8);
				} else {
					local23.aClass15_7 = new Class15_Sub3(local34, arg1, arg3, arg0, arg4, arg5, arg6, false, local23.aClass15_7);
				}
			}
		}
		if (arg2 == 1) {
			@Pc(99) Class52 local99 = Static75.method1471(arg0, arg4, arg5);
			if (local99 != null) {
				local34 = Integer.MAX_VALUE & (int) (local99.aLong63 >>> 32);
				if (arg1 == 4 || arg1 == 5) {
					local99.aClass15_2 = new Class15_Sub3(local34, 4, arg3, arg0, arg4, arg5, arg6, false, local99.aClass15_2);
				} else if (arg1 == 6) {
					local99.aClass15_2 = new Class15_Sub3(local34, 4, arg3 + 4, arg0, arg4, arg5, arg6, false, local99.aClass15_2);
				} else if (arg1 == 7) {
					local99.aClass15_2 = new Class15_Sub3(local34, 4, (arg3 + 2 & 0x3) + 4, arg0, arg4, arg5, arg6, false, local99.aClass15_2);
				} else if (arg1 == 8) {
					local99.aClass15_2 = new Class15_Sub3(local34, 4, arg3 + 4, arg0, arg4, arg5, arg6, false, local99.aClass15_2);
					local99.aClass15_3 = new Class15_Sub3(local34, 4, (arg3 + 2 & 0x3) + 4, arg0, arg4, arg5, arg6, false, local99.aClass15_3);
				}
			}
		}
		if (arg2 == 2) {
			if (arg1 == 11) {
				arg1 = 10;
			}
			@Pc(244) Class161 local244 = Static178.method2963(arg0, arg4, arg5);
			if (local244 != null) {
				local244.aClass15_9 = new Class15_Sub3(Integer.MAX_VALUE & (int) (local244.aLong171 >>> 32), arg1, arg3, arg0, arg4, arg5, arg6, false, local244.aClass15_9);
			}
		}
		if (arg2 == 3) {
			@Pc(277) Class36 local277 = Static62.method1134(arg0, arg4, arg5);
			if (local277 != null) {
				local277.aClass15_1 = new Class15_Sub3((int) (local277.aLong44 >>> 32) & Integer.MAX_VALUE, 22, arg3, arg0, arg4, arg5, arg6, false, local277.aClass15_1);
			}
		}
	}
}
