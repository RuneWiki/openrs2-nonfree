import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!aj;")
	public static Class15 aClass15_148;

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
	public static int anInt9602;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "[I")
	public static final int[] anIntArray826 = new int[50];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([III[JB)V")
	public static void method8387(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg1) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) long local29 = arg3[local23];
		arg3[local23] = arg3[arg2];
		arg3[arg2] = local29;
		@Pc(43) int local43 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local43;
		@Pc(63) int local63 = ~local29 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg1; local65 < arg2; local65++) {
			if (local29 + (long) (local63 & local65) > arg3[local65]) {
				@Pc(86) long local86 = arg3[local65];
				arg3[local65] = arg3[local25];
				arg3[local25] = local86;
				@Pc(100) int local100 = arg0[local65];
				arg0[local65] = arg0[local25];
				arg0[local25++] = local100;
			}
		}
		arg3[arg2] = arg3[local25];
		arg3[local25] = local29;
		arg0[arg2] = arg0[local25];
		arg0[local25] = local43;
		method8387(arg0, arg1, local25 - 1, arg3);
		method8387(arg0, local25 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
	public static int method8389(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
