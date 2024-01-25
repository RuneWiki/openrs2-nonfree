import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ega", name = "g", descriptor = "Lclient!nt;")
	public static Class270 aClass270_6;

	@OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
	public static int anInt2618 = 0;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I[Ljava/lang/Object;ZI[J)V")
	public static void method2390(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg0) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) long local25 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local25;
		@Pc(39) Object local39 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local39;
		@Pc(58) int local58 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg0; local60 < arg2; local60++) {
			if (arg3[local60] < (long) (local58 & local60) + local25) {
				@Pc(83) long local83 = arg3[local60];
				arg3[local60] = arg3[local21];
				arg3[local21] = local83;
				@Pc(97) Object local97 = arg1[local60];
				arg1[local60] = arg1[local21];
				arg1[local21++] = local97;
			}
		}
		arg3[arg2] = arg3[local21];
		arg3[local21] = local25;
		arg1[arg2] = arg1[local21];
		arg1[local21] = local39;
		method2390(arg0, arg1, local21 - 1, arg3);
		method2390(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2392(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
