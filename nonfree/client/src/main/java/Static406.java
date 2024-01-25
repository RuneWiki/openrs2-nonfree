import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
	public static int anInt7435 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)Z")
	public static boolean method6037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BILclient!rn;IIII)Z")
	public static boolean method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class305 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static12.aBoolean9 || !Static33.aBoolean71) {
			return false;
		} else if (Static24.anInt440 < 100) {
			return false;
		} else if (arg0 != arg2 || arg3 != arg5) {
			for (@Pc(60) int local60 = arg0; local60 <= arg2; local60++) {
				for (@Pc(64) int local64 = arg3; local64 <= arg5; local64++) {
					if (-Static337.anInt6353 == Static369.anIntArrayArrayArray11[arg4][local60][local64]) {
						return false;
					}
				}
			}
			if (Static586.method8377(arg1)) {
				Static508.anInt8976++;
				return true;
			} else {
				return false;
			}
		} else if (!Static623.method8750(arg3, arg0, arg4)) {
			return false;
		} else if (Static586.method8377(arg1)) {
			Static508.anInt8976++;
			return true;
		} else {
			return false;
		}
	}
}
