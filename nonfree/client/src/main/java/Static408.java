import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_120 = new Class287(55, 4);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!qaa;I)I")
	public static int method5757(@OriginalArg(0) Class266 arg0) {
		if (Static514.aClass266_6 == arg0) {
			return 7681;
		} else if (arg0 == Static486.aClass266_5) {
			return 8448;
		} else if (arg0 == Static336.aClass266_4) {
			return 34165;
		} else if (Static438.aClass266_2 == arg0) {
			return 260;
		} else if (arg0 == Static245.aClass266_3) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
