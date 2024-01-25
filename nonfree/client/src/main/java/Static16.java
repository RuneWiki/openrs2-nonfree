import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static16 {

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "[I")
	public static int[] anIntArray22;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public static int anInt226 = -1;

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "Lclient!ek;")
	public static final Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	public static int anInt234 = -1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!gn;B)I")
	public static int method279(@OriginalArg(0) Class138 arg0) {
		if (arg0 == Static308.aClass138_4) {
			return 5890;
		} else if (arg0 == Static627.aClass138_6) {
			return 34167;
		} else if (Static225.aClass138_3 == arg0) {
			return 34168;
		} else if (arg0 == Static216.aClass138_5) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
