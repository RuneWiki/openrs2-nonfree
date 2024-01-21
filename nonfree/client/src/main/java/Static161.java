import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public static int anInt3417 = 3;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "[J")
	public static final long[] aLongArray10 = new long[100];

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
	public static final int[] anIntArray294 = new int[4000];

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "J")
	public static long aLong110 = 0L;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method2372() {
		Static152.method2258(Static42.anInt4285, Static40.anInt969, Static169.anInt3579);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
	public static void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg2 >= arg1) {
			for (local6 = arg1; local6 < arg2; local6++) {
				Static55.anIntArrayArray8[local6][arg3] = arg0;
			}
		} else {
			for (local6 = arg2; local6 < arg1; local6++) {
				Static55.anIntArrayArray8[local6][arg3] = arg0;
			}
		}
	}
}
