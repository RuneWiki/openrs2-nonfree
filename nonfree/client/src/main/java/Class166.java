import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class166 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "[C")
	private static final char[] aCharArray3 = new char[64];

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray3[local6] = (char) (local6 + 65);
		}
		for (@Pc(22) int local22 = 26; local22 < 52; local22++) {
			aCharArray3[local22] = (char) (local22 + 71);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray3[local36] = (char) (local36 - 4);
		}
		aCharArray3[63] = '/';
		aCharArray3[62] = '+';
	}
}
