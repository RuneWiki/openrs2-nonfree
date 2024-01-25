import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
	public static int anInt2851;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "[I")
	public static final int[] anIntArray258 = new int[1];

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "([J[IBII)V")
	public static void method2268(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg3) / 2;
		@Pc(25) int local25 = arg2;
		@Pc(29) long local29 = arg0[local23];
		arg0[local23] = arg0[arg3];
		arg0[arg3] = local29;
		@Pc(43) int local43 = arg1[local23];
		arg1[local23] = arg1[arg3];
		arg1[arg3] = local43;
		@Pc(63) int local63 = ~local29 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg2; local65 < arg3; local65++) {
			if ((long) (local63 & local65) + local29 > arg0[local65]) {
				@Pc(86) long local86 = arg0[local65];
				arg0[local65] = arg0[local25];
				arg0[local25] = local86;
				@Pc(100) int local100 = arg1[local65];
				arg1[local65] = arg1[local25];
				arg1[local25++] = local100;
			}
		}
		arg0[arg3] = arg0[local25];
		arg0[local25] = local29;
		arg1[arg3] = arg1[local25];
		arg1[local25] = local43;
		method2268(arg0, arg1, arg2, local25 - 1);
		method2268(arg0, arg1, local25 + 1, arg3);
	}
}
