import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static456 {

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "J")
	public static long aLong206 = -1L;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILclient!aq;)I")
	public static int method6571(@OriginalArg(1) Class16 arg0) {
		if (Static470.aClass16_16 == arg0) {
			return 6407;
		} else if (Static72.aClass16_3 == arg0) {
			return 6408;
		} else if (arg0 == Static97.aClass16_17) {
			return 6406;
		} else if (arg0 == Static155.aClass16_10) {
			return 6409;
		} else if (Static300.aClass16_14 == arg0) {
			return 6410;
		} else if (Static524.aClass16_20 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
