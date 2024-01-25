import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public final class Exception_Sub1 extends Exception {

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "[C")
	private static final char[] aCharArray10 = new char[64];

	static {
		for (@Pc(9) int local9 = 0; local9 < 26; local9++) {
			aCharArray10[local9] = (char) (local9 + 65);
		}
		for (@Pc(23) int local23 = 26; local23 < 52; local23++) {
			aCharArray10[local23] = (char) (local23 + 97 - 26);
		}
		for (@Pc(39) int local39 = 52; local39 < 62; local39++) {
			aCharArray10[local39] = (char) (local39 - 4);
		}
		aCharArray10[62] = '*';
		aCharArray10[63] = '-';
	}
}
