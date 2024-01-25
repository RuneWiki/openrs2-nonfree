import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public static int anInt87;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
	public static int anInt93 = 0;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_4 = new Class98(66, 10);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ps;I)I")
	public static int method88(@OriginalArg(0) Class254 arg0) {
		if (Static407.aClass254_11 == arg0) {
			return 5120;
		} else if (arg0 == Static407.aClass254_12) {
			return 5122;
		} else if (Static407.aClass254_13 == arg0) {
			return 5124;
		} else if (arg0 == Static407.aClass254_14) {
			return 5121;
		} else if (Static407.aClass254_15 == arg0) {
			return 5123;
		} else if (Static407.aClass254_16 == arg0) {
			return 5125;
		} else if (arg0 == Static407.aClass254_17) {
			return 5131;
		} else if (arg0 == Static407.aClass254_18) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
