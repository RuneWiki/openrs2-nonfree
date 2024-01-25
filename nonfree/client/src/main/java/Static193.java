import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static193 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[5];

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(CI)C")
	public static char method3538(@OriginalArg(0) char arg0) {
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
