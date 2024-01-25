import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static457 {

	@OriginalMember(owner = "client!rda", name = "wb", descriptor = "I")
	public static int anInt7363;

	@OriginalMember(owner = "client!rda", name = "ib", descriptor = "I")
	public static int anInt7352 = -1;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!nw;)I")
	public static int method5939(@OriginalArg(1) Class247 arg0) {
		if (arg0 == Static317.aClass247_2) {
			return 7681;
		} else if (Static460.aClass247_4 == arg0) {
			return 8448;
		} else if (Static584.aClass247_5 == arg0) {
			return 34165;
		} else if (Static449.aClass247_3 == arg0) {
			return 260;
		} else if (Static100.aClass247_1 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
