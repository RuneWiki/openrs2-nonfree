import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(II)I")
	public static int method2345(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BI)V")
	public static void method2346(@OriginalArg(1) int arg0) {
		if (Static253.anInt4705 == 1) {
			Static503.anInt8425 = arg0;
		} else if (Static253.anInt4705 == 2 || Static253.anInt4705 == 3) {
			Static46.anInt1128 = arg0;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(II[J[Ljava/lang/Object;B)V")
	public static void method2347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg1) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) long local24 = arg2[local18];
		arg2[local18] = arg2[arg1];
		arg2[arg1] = local24;
		@Pc(38) Object local38 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg0; local60 < arg1; local60++) {
			if (local24 + (long) (local60 & local58) > arg2[local60]) {
				@Pc(77) long local77 = arg2[local60];
				arg2[local60] = arg2[local20];
				arg2[local20] = local77;
				@Pc(91) Object local91 = arg3[local60];
				arg3[local60] = arg3[local20];
				arg3[local20++] = local91;
			}
		}
		arg2[arg1] = arg2[local20];
		arg2[local20] = local24;
		arg3[arg1] = arg3[local20];
		arg3[local20] = local38;
		method2347(arg0, local20 - 1, arg2, arg3);
		method2347(local20 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	public static void method2348() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static295.aBooleanArray36[local7] = true;
		}
	}
}
