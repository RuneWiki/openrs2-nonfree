import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public static int anInt5807 = 0;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "[[B")
	public static final byte[][] aByteArrayArray17 = new byte[250][];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)I")
	public static int method4542() {
		return 16;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BC)C")
	public static char method4543(@OriginalArg(1) char arg0) {
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
