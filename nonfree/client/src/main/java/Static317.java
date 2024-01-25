import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "Lclient!ha;")
	public static Class84 aClass84_16;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "Lclient!is;")
	public static Class148 aClass148_1;

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "[I")
	public static final int[] anIntArray425 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIII)I")
	public static int method5060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
