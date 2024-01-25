import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	public static int anInt2416 = 0;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
	public static int anInt2418 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(CI)C")
	public static char method2181(@OriginalArg(0) char arg0) {
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
