import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	public static int anInt811;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[6][];

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BII)I")
	public static int method713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLclient!ac;)Lclient!ob;")
	public static Class132_Sub1 method714(@OriginalArg(1) Class1_Sub3 arg0) {
		@Pc(7) Class132 local7 = Static548.method7476(arg0);
		@Pc(13) int local13 = arg0.method7966();
		return new Class132_Sub1(local7.anInt6606, local7.aClass259_9, local7.aClass216_10, local7.anInt6604, local7.anInt6610, local13);
	}
}
