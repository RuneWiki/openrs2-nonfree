import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class109 {

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	static {
		for (@Pc(71) int local71 = 0; local71 < 26; local71++) {
			aCharArray6[local71] = (char) (local71 + 65);
		}
		for (@Pc(87) int local87 = 26; local87 < 52; local87++) {
			aCharArray6[local87] = (char) (local87 + 97 - 26);
		}
		for (@Pc(105) int local105 = 52; local105 < 62; local105++) {
			aCharArray6[local105] = (char) (local105 + 48 - 52);
		}
		aCharArray6[62] = '+';
		aCharArray6[63] = '/';
	}
}
