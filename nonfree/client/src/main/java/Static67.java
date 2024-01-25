import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!tf;")
	public static Class322 aClass322_26;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	public static int anInt1539;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
	public static final int[] anIntArray66 = new int[50];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!rb;)V")
	public static void method1444(@OriginalArg(0) Class41_Sub2 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static279.anIntArray622[local4]; local7++) {
				if (Static417.aClass41_Sub2ArrayArray1[local4][local7] == arg0) {
					Static601.method2819(Static417.aClass41_Sub2ArrayArray1[local4], local7 + 1, Static417.aClass41_Sub2ArrayArray1[local4], local7, Static279.anIntArray622[local4] - local7 - 1);
					local37 = Static279.anIntArray622[local4]--;
					return;
				}
			}
			for (@Pc(49) int local49 = 0; local49 < Static462.anIntArray496[local4]; local49++) {
				if (Static548.aClass41_Sub2ArrayArray3[local4][local49] == arg0) {
					Static601.method2819(Static548.aClass41_Sub2ArrayArray3[local4], local49 + 1, Static548.aClass41_Sub2ArrayArray3[local4], local49, Static462.anIntArray496[local4] - local49 - 1);
					local37 = Static462.anIntArray496[local4]--;
					return;
				}
			}
			for (@Pc(91) int local91 = 0; local91 < Static505.anIntArray524[local4]; local91++) {
				if (Static533.aClass41_Sub2ArrayArray2[local4][local91] == arg0) {
					Static601.method2819(Static533.aClass41_Sub2ArrayArray2[local4], local91 + 1, Static533.aClass41_Sub2ArrayArray2[local4], local91, Static505.anIntArray524[local4] - local91 - 1);
					local37 = Static505.anIntArray524[local4]--;
					return;
				}
			}
		}
	}
}
