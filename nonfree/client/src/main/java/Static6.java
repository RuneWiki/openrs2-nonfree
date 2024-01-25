import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "Lclient!rg;")
	public static Class310 aClass310_2;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
	public static int anInt75;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
	public static boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Z")
	public static boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[JII[I)V")
	public static void method100(@OriginalArg(1) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(17) int local17 = (arg2 + arg1) / 2;
		@Pc(19) int local19 = arg2;
		@Pc(23) long local23 = arg0[local17];
		arg0[local17] = arg0[arg1];
		arg0[arg1] = local23;
		@Pc(37) int local37 = arg3[local17];
		arg3[local17] = arg3[arg1];
		arg3[arg1] = local37;
		@Pc(56) int local56 = local23 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg2; local58 < arg1; local58++) {
			if (local23 + (long) (local56 & local58) > arg0[local58]) {
				@Pc(78) long local78 = arg0[local58];
				arg0[local58] = arg0[local19];
				arg0[local19] = local78;
				@Pc(92) int local92 = arg3[local58];
				arg3[local58] = arg3[local19];
				arg3[local19++] = local92;
			}
		}
		arg0[arg1] = arg0[local19];
		arg0[local19] = local23;
		arg3[arg1] = arg3[local19];
		arg3[local19] = local37;
		method100(arg0, local19 - 1, arg2, arg3);
		method100(arg0, arg1, local19 + 1, arg3);
	}
}
