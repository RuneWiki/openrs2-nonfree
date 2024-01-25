import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "[I")
	public static final int[] anIntArray605 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "Lclient!hga;")
	public static final Class130 aClass130_48 = new Class130();

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
	public static void method6606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class3_Sub3_Sub7 local15 = Static363.method5457(arg1, 12);
		local15.method839();
		local15.anInt1088 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([II[JII)V")
	public static void method6607(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg3) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) long local24 = arg2[local18];
		arg2[local18] = arg2[arg3];
		arg2[arg3] = local24;
		@Pc(38) int local38 = arg0[local18];
		arg0[local18] = arg0[arg3];
		arg0[arg3] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg1; local60 < arg3; local60++) {
			if (arg2[local60] < (long) (local60 & local58) + local24) {
				@Pc(77) long local77 = arg2[local60];
				arg2[local60] = arg2[local20];
				arg2[local20] = local77;
				@Pc(91) int local91 = arg0[local60];
				arg0[local60] = arg0[local20];
				arg0[local20++] = local91;
			}
		}
		arg2[arg3] = arg2[local20];
		arg2[local20] = local24;
		arg0[arg3] = arg0[local20];
		arg0[local20] = local38;
		method6607(arg0, arg1, arg2, local20 - 1);
		method6607(arg0, local20 + 1, arg2, arg3);
	}
}
