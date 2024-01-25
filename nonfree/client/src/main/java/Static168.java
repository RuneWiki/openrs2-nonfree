import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "Lclient!wv;")
	public static Class366 aClass366_1;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Lclient!ch;")
	public static final Class41 aClass41_2 = new Class41(2);

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2728(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static99.anInt1760; local11++) {
			if (arg0.equalsIgnoreCase(Static187.aStringArray6[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
