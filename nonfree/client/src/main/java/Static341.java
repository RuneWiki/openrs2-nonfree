import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public static int anInt5807 = -1;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString160 = "";

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB[I[Ljava/lang/Object;)V")
	public static void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg1) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) int local25 = arg2[local19];
		arg2[local19] = arg2[arg0];
		arg2[arg0] = local25;
		@Pc(39) Object local39 = arg3[local19];
		arg3[local19] = arg3[arg0];
		arg3[arg0] = local39;
		@Pc(58) int local58 = ~local25 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg1; local60 < arg0; local60++) {
			if (arg2[local60] < local25 + (local58 & local60)) {
				@Pc(76) int local76 = arg2[local60];
				arg2[local60] = arg2[local21];
				arg2[local21] = local76;
				@Pc(90) Object local90 = arg3[local60];
				arg3[local60] = arg3[local21];
				arg3[local21++] = local90;
			}
		}
		arg2[arg0] = arg2[local21];
		arg2[local21] = local25;
		arg3[arg0] = arg3[local21];
		arg3[local21] = local39;
		method4560(local21 - 1, arg1, arg2, arg3);
		method4560(arg0, local21 + 1, arg2, arg3);
	}
}
