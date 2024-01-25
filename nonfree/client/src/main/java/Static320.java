import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "S")
	public static short aShort68;

	@OriginalMember(owner = "client!jo", name = "T", descriptor = "Lclient!bma;")
	public static Class43 aClass43_4;

	@OriginalMember(owner = "client!jo", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIB)I")
	public static int method4668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg1;
		}
	}
}
