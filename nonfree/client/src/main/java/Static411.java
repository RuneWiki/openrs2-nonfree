import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!ri;")
	public static Class217 aClass217_1;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Lclient!ga;")
	public static Interface4 anInterface4_7;

	@OriginalMember(owner = "client!un", name = "e", descriptor = "Lclient!lg;")
	public static Class142 aClass142_4;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
	public static boolean method5164(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([JII[IB)V")
	public static void method5166(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg2) / 2;
		@Pc(20) int local20 = arg2;
		@Pc(24) long local24 = arg0[local18];
		arg0[local18] = arg0[arg1];
		arg0[arg1] = local24;
		@Pc(38) int local38 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local38;
		@Pc(56) int local56 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg2; local58 < arg1; local58++) {
			if (arg0[local58] < (long) (local58 & local56) + local24) {
				@Pc(79) long local79 = arg0[local58];
				arg0[local58] = arg0[local20];
				arg0[local20] = local79;
				@Pc(93) int local93 = arg3[local58];
				arg3[local58] = arg3[local20];
				arg3[local20++] = local93;
			}
		}
		arg0[arg1] = arg0[local20];
		arg0[local20] = local24;
		arg3[arg1] = arg3[local20];
		arg3[local20] = local38;
		method5166(arg0, local20 - 1, arg2, arg3);
		method5166(arg0, arg1, local20 + 1, arg3);
	}
}
