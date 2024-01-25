import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "[I")
	public static int[] anIntArray163;

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
	public static int anInt3312 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIB)I")
	public static int method3044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 13;
		@Pc(38) int local38 = local16 * (local16 * 15731 * local16 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local38 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIB)V")
	public static void method3045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static161.anInt7734 <= arg2 - arg3 && Static38.anInt823 >= arg3 + arg2 && Static380.anInt7421 <= arg0 - arg3 && Static237.anInt5159 >= arg0 + arg3) {
			Static557.method8311(arg0, arg2, arg1, arg3);
		} else {
			Static191.method3915(arg2, arg1, arg0, arg3);
		}
	}
}
