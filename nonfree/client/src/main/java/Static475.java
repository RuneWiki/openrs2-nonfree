import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static475 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static int anInt8512;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!pea;")
	public static final Class251 aClass251_9 = new Class251(2);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!jm;Z)I")
	public static int method7039(@OriginalArg(0) Class160 arg0) {
		if (Static258.aClass160_6 == arg0) {
			return 5120;
		} else if (arg0 == Static258.aClass160_7) {
			return 5122;
		} else if (Static258.aClass160_8 == arg0) {
			return 5124;
		} else if (Static258.aClass160_9 == arg0) {
			return 5121;
		} else if (arg0 == Static258.aClass160_10) {
			return 5123;
		} else if (Static258.aClass160_11 == arg0) {
			return 5125;
		} else if (arg0 == Static258.aClass160_12) {
			return 5131;
		} else if (Static258.aClass160_13 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
