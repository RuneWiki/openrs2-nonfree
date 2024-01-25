import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II[I[Ljava/lang/String;I)V")
	public static void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) String[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg0) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) String local29 = arg3[local23];
		arg3[local23] = arg3[arg1];
		arg3[arg1] = local29;
		@Pc(43) int local43 = arg2[local23];
		arg2[local23] = arg2[arg1];
		arg2[arg1] = local43;
		for (@Pc(55) int local55 = arg0; local55 < arg1; local55++) {
			if (local29 == null || arg3[local55] != null && arg3[local55].compareTo(local29) < (local55 & 0x1)) {
				@Pc(86) String local86 = arg3[local55];
				arg3[local55] = arg3[local25];
				arg3[local25] = local86;
				@Pc(100) int local100 = arg2[local55];
				arg2[local55] = arg2[local25];
				arg2[local25++] = local100;
			}
		}
		arg3[arg1] = arg3[local25];
		arg3[local25] = local29;
		arg2[arg1] = arg2[local25];
		arg2[local25] = local43;
		method6924(arg0, local25 - 1, arg2, arg3);
		method6924(local25 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIII)Z")
	public static boolean method6925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static6.aByteArrayArrayArray1[0][arg1][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static6.aByteArrayArrayArray1[arg0][arg1][arg3] & 0x10) == 0) {
			return Static310.method4683(arg3, arg1, arg0) == arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "([B[BIIIIIII)V")
	public static void method6926(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(25) int local25 = -(arg7 & 0x3);
		for (@Pc(28) int local28 = -arg4; local28 < 0; local28++) {
			@Pc(36) int local36;
			for (@Pc(32) int local32 = local10; local32 < 0; local32++) {
				local36 = arg6++;
				arg0[local36] = (byte) (arg0[local36] - arg1[arg5++]);
				@Pc(49) int local49 = arg6++;
				arg0[local49] = (byte) (arg0[local49] - arg1[arg5++]);
				@Pc(62) int local62 = arg6++;
				arg0[local62] = (byte) (arg0[local62] - arg1[arg5++]);
				@Pc(75) int local75 = arg6++;
				arg0[local75] = (byte) (arg0[local75] - arg1[arg5++]);
			}
			for (@Pc(96) int local96 = local25; local96 < 0; local96++) {
				local36 = arg6++;
				arg0[local36] = (byte) (arg0[local36] - arg1[arg5++]);
			}
			arg6 += arg3;
			arg5 += arg2;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)Z")
	public static boolean method6927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = (arg1 & 0x37) == 0 ? Static284.method4284(arg0, arg1) : Static471.method8864(arg0, arg1);
		return local18 | Static71.method909(arg0, arg1) | (arg0 & 0x10000) != 0;
	}
}
