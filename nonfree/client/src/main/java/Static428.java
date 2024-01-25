import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method6262(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < Static143.anInt2455; local12++) {
			if (arg0.equalsIgnoreCase(Static80.aStringArray8[local12])) {
				return local12;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(FFFZ)F")
	public static float method6264(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg2 + arg1 * (arg0 - arg2);
	}
}
