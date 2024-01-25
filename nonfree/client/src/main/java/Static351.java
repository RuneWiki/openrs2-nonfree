import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray30;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "[I")
	public static int[] anIntArray518;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
	public static final int[] anIntArray517 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class11 local13 = local7.aClass11_2; local13 != null; local13 = local13.aClass11_1) {
			@Pc(17) Class1_Sub2 local17 = local13.aClass1_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort89 == arg1 && local17.aShort90 == arg2) {
				Static242.method4781(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)I")
	public static int method5658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static338.anIntArray504[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)I")
	public static int method5659(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
