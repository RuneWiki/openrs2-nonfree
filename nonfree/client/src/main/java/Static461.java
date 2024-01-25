import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFZ)I")
	public static int method6475(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(21) float local21 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(30) float local30 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(39) float local39 = arg0 < 0.0F ? -arg0 : arg0;
		if (local30 > local21 && local39 < local30) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local39 > local21 && local30 < local39) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	public static void method6476() {
		@Pc(1) Class332 local1 = Static23.aClass332_14;
		synchronized (Static23.aClass332_14) {
			Static23.aClass332_14.method7497(5);
		}
		local1 = Static234.aClass332_102;
		synchronized (Static234.aClass332_102) {
			Static234.aClass332_102.method7497(5);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[II[II)V")
	public static void method6477(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg3 + arg0) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) int local29 = arg2[local23];
		arg2[local23] = arg2[arg3];
		arg2[arg3] = local29;
		@Pc(43) int local43 = arg1[local23];
		arg1[local23] = arg1[arg3];
		arg1[arg3] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg0; local62 < arg3; local62++) {
			if (arg2[local62] < local29 + (local62 & local60)) {
				@Pc(77) int local77 = arg2[local62];
				arg2[local62] = arg2[local25];
				arg2[local25] = local77;
				@Pc(91) int local91 = arg1[local62];
				arg1[local62] = arg1[local25];
				arg1[local25++] = local91;
			}
		}
		arg2[arg3] = arg2[local25];
		arg2[local25] = local29;
		arg1[arg3] = arg1[local25];
		arg1[local25] = local43;
		method6477(arg0, arg1, arg2, local25 - 1);
		method6477(local25 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIBI)V")
	public static void method6478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg1 > arg0) {
			for (local6 = arg0; local6 < arg1; local6++) {
				Static503.anIntArrayArray12[local6][arg3] = arg2;
			}
		} else {
			for (local6 = arg1; local6 < arg0; local6++) {
				Static503.anIntArrayArray12[local6][arg3] = arg2;
			}
		}
	}
}
