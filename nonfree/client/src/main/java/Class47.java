import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class47 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray1[local6] = (char) (local6 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray1[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray1[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray1[63] = '/';
		aCharArray1[62] = '+';
	}
}
