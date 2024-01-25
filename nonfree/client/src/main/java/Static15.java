import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "Lclient!nt;")
	public static Class177 aClass177_1;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
	public static int anInt252;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "Lclient!ul;")
	public static Class252 aClass252_5;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "[S")
	public static final short[] aShortArray9 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([IIIB[J)V")
	public static void method274(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) long local24 = arg3[local18];
		arg3[local18] = arg3[arg2];
		arg3[arg2] = local24;
		@Pc(38) int local38 = arg0[local18];
		arg0[local18] = arg0[arg2];
		arg0[arg2] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg1; local60 < arg2; local60++) {
			if ((long) (local58 & local60) + local24 > arg3[local60]) {
				@Pc(77) long local77 = arg3[local60];
				arg3[local60] = arg3[local20];
				arg3[local20] = local77;
				@Pc(91) int local91 = arg0[local60];
				arg0[local60] = arg0[local20];
				arg0[local20++] = local91;
			}
		}
		arg3[arg2] = arg3[local20];
		arg3[local20] = local24;
		arg0[arg2] = arg0[local20];
		arg0[local20] = local38;
		method274(arg0, arg1, local20 - 1, arg3);
		method274(arg0, local20 + 1, arg2, arg3);
	}
}
