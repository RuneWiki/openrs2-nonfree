import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[200];

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "[I")
	public static final int[] anIntArray231 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III[J[Ljava/lang/Object;)V")
	public static void method3295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg0];
		arg3[arg0] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg1; local52 < arg0; local52++) {
			if (arg2[local52] < local16 + (long) (local50 & local52)) {
				@Pc(69) long local69 = arg2[local52];
				arg2[local52] = arg2[local12];
				arg2[local12] = local69;
				@Pc(83) Object local83 = arg3[local52];
				arg3[local52] = arg3[local12];
				arg3[local12++] = local83;
			}
		}
		arg2[arg0] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg0] = arg3[local12];
		arg3[local12] = local30;
		method3295(local12 - 1, arg1, arg2, arg3);
		method3295(arg0, local12 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
	public static void method3296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg0; local55 < arg1; local55++) {
			if (arg3[local55] < (local53 & local55) + local20) {
				@Pc(74) int local74 = arg3[local55];
				arg3[local55] = arg3[local16];
				arg3[local16] = local74;
				@Pc(88) Object local88 = arg2[local55];
				arg2[local55] = arg2[local16];
				arg2[local16++] = local88;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method3296(arg0, local16 - 1, arg2, arg3);
		method3296(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)I")
	public static int method3297() {
		return Static424.anInt7715 == 1 ? Static520.anInt8806 : 0;
	}
}
