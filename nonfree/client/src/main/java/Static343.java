import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "[I")
	public static final int[] anIntArray470 = new int[3];

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_100 = new Class237(31, -1);

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_101 = new Class237(30, 0);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lclient!rs;")
	public static Class207 method4811(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static7.aFloat39 == 3.0D) {
				return Static41.aClass207_20;
			}
			if ((double) Static7.aFloat39 == 4.0D) {
				return Static323.aClass207_17;
			}
			if ((double) Static7.aFloat39 == 6.0D) {
				return Static22.aClass207_13;
			}
			if ((double) Static7.aFloat39 >= 8.0D) {
				return Static261.aClass207_21;
			}
		} else if (arg0 == 1) {
			if ((double) Static7.aFloat39 == 3.0D) {
				return Static22.aClass207_13;
			}
			if ((double) Static7.aFloat39 == 4.0D) {
				return Static261.aClass207_21;
			}
			if ((double) Static7.aFloat39 == 6.0D) {
				return Static190.aClass207_10;
			}
			if ((double) Static7.aFloat39 >= 8.0D) {
				return Static157.aClass207_8;
			}
		} else if (arg0 == 2) {
			if ((double) Static7.aFloat39 == 3.0D) {
				return Static190.aClass207_10;
			}
			if ((double) Static7.aFloat39 == 4.0D) {
				return Static157.aClass207_8;
			}
			if ((double) Static7.aFloat39 == 6.0D) {
				return Static244.aClass207_15;
			}
			if ((double) Static7.aFloat39 >= 8.0D) {
				return Static212.aClass207_2;
			}
		}
		return null;
	}
}
