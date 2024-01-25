import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class130 {

	@OriginalMember(owner = "client!go", name = "c", descriptor = "[C")
	private static final char[] aCharArray4 = new char[64];

	static {
		for (@Pc(7) int local7 = 0; local7 < 26; local7++) {
			aCharArray4[local7] = (char) (local7 + 65);
		}
		for (@Pc(23) int local23 = 26; local23 < 52; local23++) {
			aCharArray4[local23] = (char) (local23 + 97 - 26);
		}
		for (@Pc(41) int local41 = 52; local41 < 62; local41++) {
			aCharArray4[local41] = (char) (local41 - 4);
		}
		aCharArray4[63] = '-';
		aCharArray4[62] = '*';
	}
}
