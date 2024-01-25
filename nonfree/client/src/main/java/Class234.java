import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class234 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "[C")
	private static final char[] aCharArray5 = new char[64];

	static {
		for (@Pc(9) int local9 = 0; local9 < 26; local9++) {
			aCharArray5[local9] = (char) (local9 + 65);
		}
		for (@Pc(25) int local25 = 26; local25 < 52; local25++) {
			aCharArray5[local25] = (char) (local25 + 97 - 26);
		}
		for (@Pc(41) int local41 = 52; local41 < 62; local41++) {
			aCharArray5[local41] = (char) (local41 - 4);
		}
		aCharArray5[63] = '/';
		aCharArray5[62] = '+';
	}
}
