import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public static int anInt2825;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!ns;")
	public static Class142 aClass142_3;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
	public static int anInt2829;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Lclient!va;")
	public static Class199 aClass199_12 = new Class199(64);

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public static int anInt2827 = -1;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(B[Ljava/lang/String;I[SI)V")
	public static void method2711(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(22) int local22 = (arg1 + arg3) / 2;
		@Pc(24) int local24 = arg3;
		@Pc(28) String local28 = arg0[local22];
		arg0[local22] = arg0[arg1];
		arg0[arg1] = local28;
		@Pc(42) short local42 = arg2[local22];
		arg2[local22] = arg2[arg1];
		arg2[arg1] = local42;
		for (@Pc(54) int local54 = arg3; local54 < arg1; local54++) {
			if (local28 == null || arg0[local54] != null && (local54 & 0x1) > arg0[local54].compareTo(local28)) {
				@Pc(79) String local79 = arg0[local54];
				arg0[local54] = arg0[local24];
				arg0[local24] = local79;
				@Pc(93) short local93 = arg2[local54];
				arg2[local54] = arg2[local24];
				arg2[local24++] = local93;
			}
		}
		arg0[arg1] = arg0[local24];
		arg0[local24] = local28;
		arg2[arg1] = arg2[local24];
		arg2[local24] = local42;
		method2711(arg0, local24 - 1, arg2, arg3);
		method2711(arg0, arg1, arg2, local24 + 1);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BII)I")
	public static int method2712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lclient!ec;")
	public static Class2_Sub11_Sub2 method2714(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub11_Sub2 local10 = (Class2_Sub11_Sub2) Static260.aClass179_9.method5092((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static253.aClass191_222.method5459(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static241.method4170(local25);
			Static260.aClass179_9.method5085(local10, (long) arg0);
			return local10;
		}
	}
}
