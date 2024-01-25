import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class155 {

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "[C")
	public static final char[] aCharArray10 = new char[64];

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray10[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray10[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray10[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray10[62] = '*';
		aCharArray10[63] = '-';
	}
}
