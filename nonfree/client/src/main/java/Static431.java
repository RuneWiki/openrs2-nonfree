import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject8;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public static int anInt2502;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
	public static int anInt2504 = -1;

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Z")
	public static boolean aBoolean188 = false;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB[J[Ljava/lang/Object;I)V")
	public static void method2323(@OriginalArg(0) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg3) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) long local24 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		@Pc(56) int local56 = local24 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg3; local58 < arg0; local58++) {
			if ((long) (local58 & local56) + local24 > arg1[local58]) {
				@Pc(75) long local75 = arg1[local58];
				arg1[local58] = arg1[local20];
				arg1[local20] = local75;
				@Pc(89) Object local89 = arg2[local58];
				arg2[local58] = arg2[local20];
				arg2[local20++] = local89;
			}
		}
		arg1[arg0] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method2323(local20 - 1, arg1, arg2, arg3);
		method2323(arg0, arg1, arg2, local20 + 1);
	}
}
