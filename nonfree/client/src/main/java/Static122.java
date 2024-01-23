import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!nj;")
	public static Class113 aClass113_4;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
	public static int anInt3995;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I")
	public static int method3204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}
}
