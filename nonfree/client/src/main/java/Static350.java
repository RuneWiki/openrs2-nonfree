import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static350 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!ne;")
	public static Class170 aClass170_10;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public static int anInt5747;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(CI)C")
	public static char method4559(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
