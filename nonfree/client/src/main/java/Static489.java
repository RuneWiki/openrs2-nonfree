import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "J")
	public static long aLong243;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "[I")
	public static int[] anIntArray535;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	public static int anInt8294;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
	public static void method7017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static161.method2738(local7.aClass23_Sub2_Sub3_1);
			if (local7.aClass23_Sub2_Sub3_1 != null) {
				local7.aClass23_Sub2_Sub3_1 = null;
			}
		}
	}
}
