import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "Lclient!jj;")
	public static final Class160 aClass160_72 = new Class160(62, -1);

	@OriginalMember(owner = "client!mo", name = "k", descriptor = "Lclient!rn;")
	public static final Class277 aClass277_4 = new Class277();

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray66 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray67 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V")
	public static void method4902(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) Object local34 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg2; local56 < arg1; local56++) {
			if (arg0[local56] < (long) (local54 & local56) + local20) {
				@Pc(73) long local73 = arg0[local56];
				arg0[local56] = arg0[local16];
				arg0[local16] = local73;
				@Pc(87) Object local87 = arg3[local56];
				arg3[local56] = arg3[local16];
				arg3[local16++] = local87;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local20;
		arg3[arg1] = arg3[local16];
		arg3[local16] = local34;
		method4902(arg0, local16 - 1, arg2, arg3);
		method4902(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Lclient!ul;")
	public static Class29_Sub3 method4904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass29_Sub3_1 == null ? null : local7.aClass29_Sub3_1;
	}
}
