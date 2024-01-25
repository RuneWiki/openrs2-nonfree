import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class105 {

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "[C")
	public static final char[] aCharArray1 = new char[64];

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray1[local6] = (char) (local6 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray1[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray1[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray1[62] = '+';
		aCharArray1[63] = '/';
	}
}
