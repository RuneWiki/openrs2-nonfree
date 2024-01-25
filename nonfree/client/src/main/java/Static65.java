import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
	public static int anInt1178;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIB)V")
	public static void method921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static317.anInt5047 != 0) {
			if (arg1 >= 0) {
				Static501.anIntArray574[arg1] = arg0;
			} else {
				for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
					Static501.anIntArray574[local20] = arg0;
				}
			}
		}
		Static267.aClass2_Sub13_Sub3_3.method6133(arg0, arg1);
	}
}
