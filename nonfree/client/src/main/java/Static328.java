import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	public static int anInt6427;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public static int anInt6426 = 0;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V")
	public static void method5066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static491.anInt9287 != 0) {
			if (arg1 < 0) {
				for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
					Static364.anIntArray391[local17] = arg0;
				}
			} else {
				Static364.anIntArray391[arg1] = arg0;
			}
		}
		Static365.aClass4_Sub21_Sub4_6.method6164(arg0, arg1);
	}
}
