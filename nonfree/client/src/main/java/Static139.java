import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "Lclient!rn;")
	public static Class148 aClass148_1;

	@OriginalMember(owner = "client!ki", name = "n", descriptor = "Z")
	public static boolean aBoolean229 = false;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
	public static int anInt2774 = 0;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	public static int anInt2775 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString99 = "yellow:";

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([III[IB)V")
	public static void method2218(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg1 + arg2) / 2;
		@Pc(24) int local24 = arg2;
		@Pc(28) int local28 = arg0[local22];
		arg0[local22] = arg0[arg1];
		arg0[arg1] = local28;
		@Pc(42) int local42 = arg3[local22];
		arg3[local22] = arg3[arg1];
		arg3[arg1] = local42;
		for (@Pc(54) int local54 = arg2; local54 < arg1; local54++) {
			if (arg0[local54] > local28 + (local54 & 0x1)) {
				@Pc(80) int local80 = arg0[local54];
				arg0[local54] = arg0[local24];
				arg0[local24] = local80;
				@Pc(94) int local94 = arg3[local54];
				arg3[local54] = arg3[local24];
				arg3[local24++] = local94;
			}
		}
		arg0[arg1] = arg0[local24];
		arg0[local24] = local28;
		arg3[arg1] = arg3[local24];
		arg3[local24] = local42;
		method2218(arg0, local24 - 1, arg2, arg3);
		method2218(arg0, arg1, local24 + 1, arg3);
	}
}
