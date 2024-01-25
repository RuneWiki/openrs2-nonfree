import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
	public static int anInt3758;

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
	public static int anInt3760;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
	public static int anInt3759 = 2;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[I[II)V")
	public static void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) int local34 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local34;
		@Pc(54) int local54 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg0; local56 < arg1; local56++) {
			if ((local56 & local54) + local20 > arg2[local56]) {
				@Pc(77) int local77 = arg2[local56];
				arg2[local56] = arg2[local16];
				arg2[local16] = local77;
				@Pc(91) int local91 = arg3[local56];
				arg3[local56] = arg3[local16];
				arg3[local16++] = local91;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg3[arg1] = arg3[local16];
		arg3[local16] = local34;
		method3388(arg0, local16 - 1, arg2, arg3);
		method3388(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Lclient!vr;")
	public static Class9_Sub1_Sub3 method3389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub1_Sub3_2;
	}
}
