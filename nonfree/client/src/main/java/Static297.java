import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "Lclient!ej;")
	public static final Class84 aClass84_10 = new Class84("", 13);

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "[I")
	public static final int[] anIntArray458 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4137(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[J[III)V")
	public static void method4139(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg0[local10];
		arg0[local10] = arg0[arg2];
		arg0[arg2] = local16;
		@Pc(30) int local30 = arg1[local10];
		arg1[local10] = arg1[arg2];
		arg1[arg2] = local30;
		@Pc(48) int local48 = local16 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(50) int local50 = arg3; local50 < arg2; local50++) {
			if ((long) (local48 & local50) + local16 > arg0[local50]) {
				@Pc(67) long local67 = arg0[local50];
				arg0[local50] = arg0[local12];
				arg0[local12] = local67;
				@Pc(81) int local81 = arg1[local50];
				arg1[local50] = arg1[local12];
				arg1[local12++] = local81;
			}
		}
		arg0[arg2] = arg0[local12];
		arg0[local12] = local16;
		arg1[arg2] = arg1[local12];
		arg1[local12] = local30;
		method4139(arg0, arg1, local12 - 1, arg3);
		method4139(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
	public static void method4140(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub1_Sub5 local12 = Static77.method1176(arg0, 2);
		local12.method770();
	}
}
