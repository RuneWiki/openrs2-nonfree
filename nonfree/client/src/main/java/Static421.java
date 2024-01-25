import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!up", name = "q", descriptor = "I")
	public static int anInt7116;

	@OriginalMember(owner = "client!up", name = "w", descriptor = "Lclient!aj;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Lclient!la;")
	public static final Class136 aClass136_189 = new Class136(8, 3);

	@OriginalMember(owner = "client!up", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!up", name = "u", descriptor = "J")
	public static long aLong234 = -1L;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "([Ljava/lang/Object;IIZ[J)V")
	public static void method5764(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg2) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) long local25 = arg3[local19];
		arg3[local19] = arg3[arg1];
		arg3[arg1] = local25;
		@Pc(39) Object local39 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local39;
		@Pc(57) int local57 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg2; local59 < arg1; local59++) {
			if (local25 + (long) (local59 & local57) > arg3[local59]) {
				@Pc(77) long local77 = arg3[local59];
				arg3[local59] = arg3[local21];
				arg3[local21] = local77;
				@Pc(91) Object local91 = arg0[local59];
				arg0[local59] = arg0[local21];
				arg0[local21++] = local91;
			}
		}
		arg3[arg1] = arg3[local21];
		arg3[local21] = local25;
		arg0[arg1] = arg0[local21];
		arg0[local21] = local39;
		method5764(arg0, local21 - 1, arg2, arg3);
		method5764(arg0, arg1, local21 + 1, arg3);
	}
}
