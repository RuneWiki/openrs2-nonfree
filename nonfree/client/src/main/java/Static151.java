import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
	public static int anInt3085;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
	public static int anInt3086;

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "I")
	public static int anInt3087 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZC)C")
	public static char method2887(@OriginalArg(1) char arg0) {
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
