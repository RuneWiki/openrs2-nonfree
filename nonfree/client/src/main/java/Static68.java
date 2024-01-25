import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Lclient!oh;")
	public static Class237 aClass237_22;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!pt;)I")
	public static int method1796(@OriginalArg(1) Class265 arg0) {
		if (Static625.aClass265_10 == arg0) {
			return 5890;
		} else if (arg0 == Static303.aClass265_5) {
			return 34167;
		} else if (Static613.aClass265_9 == arg0) {
			return 34168;
		} else if (arg0 == Static190.aClass265_8) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
