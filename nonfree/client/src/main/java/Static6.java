import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "[I")
	public static int[] anIntArray20;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "Lclient!qj;")
	public static Class165 aClass165_5;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "[I")
	public static final int[] anIntArray19 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)V")
	public static void method240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0];
		@Pc(17) int local17 = Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0];
		if (Static341.anInt2259 == 1) {
			if (!Static222.method4055(local17, 0, false, 1, -2, local12, 0, 1, arg0, arg1)) {
				Static222.method4055(local17, 0, false, 1, -3, local12, 0, 1, arg0, arg1);
			}
		} else if (!Static222.method4055(local17, 0, false, 1, -3, local12, 0, 1, arg0, arg1)) {
			Static222.method4055(local17, 0, false, 1, -2, local12, 0, 1, arg0, arg1);
		}
	}
}
