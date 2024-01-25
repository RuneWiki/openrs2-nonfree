import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!us", name = "g", descriptor = "I")
	public static int anInt1445;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III)I")
	public static int method1206(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static21.anIntArray23[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB[Ljava/lang/Object;[I)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg3[local22];
		arg3[local22] = arg3[arg0];
		arg3[arg0] = local28;
		@Pc(42) Object local42 = arg2[local22];
		arg2[local22] = arg2[arg0];
		arg2[arg0] = local42;
		@Pc(61) int local61 = ~local28 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg1; local63 < arg0; local63++) {
			if (arg3[local63] < (local61 & local63) + local28) {
				@Pc(82) int local82 = arg3[local63];
				arg3[local63] = arg3[local24];
				arg3[local24] = local82;
				@Pc(96) Object local96 = arg2[local63];
				arg2[local63] = arg2[local24];
				arg2[local24++] = local96;
			}
		}
		arg3[arg0] = arg3[local24];
		arg3[local24] = local28;
		arg2[arg0] = arg2[local24];
		arg2[local24] = local42;
		method1207(local24 - 1, arg1, arg2, arg3);
		method1207(arg0, local24 + 1, arg2, arg3);
	}
}
