import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)I")
	public static int method3521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(IIII)I")
	public static int method3525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 4095 - arg2;
		} else if (local7 == 2) {
			return 4095 - arg1;
		} else {
			return arg2;
		}
	}
}
