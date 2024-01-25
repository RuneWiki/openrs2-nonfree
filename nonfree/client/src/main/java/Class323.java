import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class323 {

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "[C")
	private static final char[] aCharArray5 = new char[64];

	static {
		for (@Pc(39) int local39 = 0; local39 < 26; local39++) {
			aCharArray5[local39] = (char) (local39 + 65);
		}
		for (@Pc(53) int local53 = 26; local53 < 52; local53++) {
			aCharArray5[local53] = (char) (local53 + 71);
		}
		for (@Pc(67) int local67 = 52; local67 < 62; local67++) {
			aCharArray5[local67] = (char) (local67 + 48 - 52);
		}
		aCharArray5[62] = '*';
		aCharArray5[63] = '-';
	}
}
