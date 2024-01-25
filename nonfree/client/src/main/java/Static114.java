import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	public static int anInt2051 = 0;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "I")
	public static int anInt2056 = 100;

	@OriginalMember(owner = "client!du", name = "t", descriptor = "I")
	public static int anInt2059 = -1;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "(I)I")
	public static int method1806() {
		return Static339.anInt5859;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)Z")
	public static boolean method1808(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIB[I[I)V")
	public static void method1814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(21) int local21 = (arg0 + arg1) / 2;
		@Pc(23) int local23 = arg1;
		@Pc(27) int local27 = arg2[local21];
		arg2[local21] = arg2[arg0];
		arg2[arg0] = local27;
		@Pc(41) int local41 = arg3[local21];
		arg3[local21] = arg3[arg0];
		arg3[arg0] = local41;
		@Pc(58) int local58 = local27 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg1; local60 < arg0; local60++) {
			if (local27 + (local60 & local58) > arg2[local60]) {
				@Pc(75) int local75 = arg2[local60];
				arg2[local60] = arg2[local23];
				arg2[local23] = local75;
				@Pc(89) int local89 = arg3[local60];
				arg3[local60] = arg3[local23];
				arg3[local23++] = local89;
			}
		}
		arg2[arg0] = arg2[local23];
		arg2[local23] = local27;
		arg3[arg0] = arg3[local23];
		arg3[local23] = local41;
		method1814(local23 - 1, arg1, arg2, arg3);
		method1814(arg0, local23 + 1, arg2, arg3);
	}
}
