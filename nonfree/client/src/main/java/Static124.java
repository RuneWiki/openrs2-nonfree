import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static124 {

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "[I")
	public static final int[] anIntArray611 = new int[50];

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "Lclient!au;")
	public static final Class21 aClass21_95 = new Class21(4);

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString144 = null;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	public static int anInt9459 = -1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!rf;B)I")
	public static int method7563(@OriginalArg(0) Class297 arg0) {
		if (arg0 == Static437.aClass297_1) {
			return 9216;
		} else if (arg0 == Static530.aClass297_3) {
			return 34065;
		} else if (arg0 == Static452.aClass297_2) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
