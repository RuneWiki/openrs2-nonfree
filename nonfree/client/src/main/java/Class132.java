import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class132 {

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "[C")
	private static final char[] aCharArray3 = new char[64];

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray3[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray3[local18] = (char) (local18 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray3[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray3[63] = '-';
		aCharArray3[62] = '*';
	}
}
