import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)I")
	public static int method4642(@OriginalArg(0) boolean arg0) {
		if (Static48.anIntArray101 == null) {
			return 0;
		} else if (arg0 || Static585.aClass345Array1 == null) {
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static48.anIntArray101.length; local27++) {
				@Pc(33) int local33 = Static48.anIntArray101[local27];
				if (Static212.aClass229_48.method4954(local33)) {
					local25++;
				}
				if (Static37.aClass229_9.method4954(local33)) {
					local25++;
				}
			}
			return local25;
		} else {
			return Static48.anIntArray101.length * 2;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
	public static boolean method4643(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[I[III)V")
	public static void method4644(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg3) / 2;
		@Pc(25) int local25 = arg2;
		@Pc(29) int local29 = arg1[local23];
		arg1[local23] = arg1[arg3];
		arg1[arg3] = local29;
		@Pc(43) int local43 = arg0[local23];
		arg0[local23] = arg0[arg3];
		arg0[arg3] = local43;
		@Pc(62) int local62 = ~local29 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(64) int local64 = arg2; local64 < arg3; local64++) {
			if (local29 + (local64 & local62) > arg1[local64]) {
				@Pc(84) int local84 = arg1[local64];
				arg1[local64] = arg1[local25];
				arg1[local25] = local84;
				@Pc(98) int local98 = arg0[local64];
				arg0[local64] = arg0[local25];
				arg0[local25++] = local98;
			}
		}
		arg1[arg3] = arg1[local25];
		arg1[local25] = local29;
		arg0[arg3] = arg0[local25];
		arg0[local25] = local43;
		method4644(arg0, arg1, arg2, local25 - 1);
		method4644(arg0, arg1, local25 + 1, arg3);
	}
}
