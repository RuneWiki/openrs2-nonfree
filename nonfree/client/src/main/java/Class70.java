import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class70 {

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray1[local6] = (char) (local6 + 65);
		}
		for (@Pc(22) int local22 = 26; local22 < 52; local22++) {
			aCharArray1[local22] = (char) (local22 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray1[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray1[62] = '*';
		aCharArray1[63] = '-';
	}
}
