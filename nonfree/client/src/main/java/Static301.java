import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray21 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
	public static int anInt5476 = 0;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
	public static void method4960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static534.aClass229_16 == Static551.aClass229_15) {
			if (!Static76.method1368(-2, 0, 1, arg0, 1, 0, false, arg1)) {
				Static76.method1368(-3, 0, 1, arg0, 1, 0, false, arg1);
			}
		} else if (!Static76.method1368(-3, 0, 1, arg0, 1, 0, false, arg1)) {
			Static76.method1368(-2, 0, 1, arg0, 1, 0, false, arg1);
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[JII[I)V")
	public static void method4962(@OriginalArg(1) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg2 + arg1) / 2;
		@Pc(17) int local17 = arg2;
		@Pc(21) long local21 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg1];
		arg3[arg1] = local35;
		@Pc(53) int local53 = local21 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg2; local55 < arg1; local55++) {
			if (local21 + (long) (local53 & local55) > arg0[local55]) {
				@Pc(73) long local73 = arg0[local55];
				arg0[local55] = arg0[local17];
				arg0[local17] = local73;
				@Pc(87) int local87 = arg3[local55];
				arg3[local55] = arg3[local17];
				arg3[local17++] = local87;
			}
		}
		arg0[arg1] = arg0[local17];
		arg0[local17] = local21;
		arg3[arg1] = arg3[local17];
		arg3[local17] = local35;
		method4962(arg0, local17 - 1, arg2, arg3);
		method4962(arg0, arg1, local17 + 1, arg3);
	}
}
