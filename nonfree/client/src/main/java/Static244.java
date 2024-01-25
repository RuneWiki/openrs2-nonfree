import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static244 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	public static int anInt5399 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!bga;B)I")
	public static int method4442(@OriginalArg(0) Class34 arg0) {
		if (Static428.aClass34_5 == arg0) {
			return 7681;
		} else if (Static402.aClass34_4 == arg0) {
			return 8448;
		} else if (arg0 == Static584.aClass34_6) {
			return 34165;
		} else if (Static125.aClass34_3 == arg0) {
			return 260;
		} else if (Static588.aClass34_7 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
