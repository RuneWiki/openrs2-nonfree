import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static346 {

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_120 = new Class211(72, 0);

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)Z")
	public static boolean method4610(@OriginalArg(1) int arg0) {
		if (arg0 == 22 || arg0 == 18 || arg0 == 19 || arg0 == 4 || arg0 == 21) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 1001;
		}
	}
}
