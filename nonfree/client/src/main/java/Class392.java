import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class392 {

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "[C")
	private static final char[] aCharArray7 = new char[64];

	static {
		for (@Pc(34) int local34 = 0; local34 < 26; local34++) {
			aCharArray7[local34] = (char) (local34 + 65);
		}
		for (@Pc(48) int local48 = 26; local48 < 52; local48++) {
			aCharArray7[local48] = (char) (local48 + 97 - 26);
		}
		for (@Pc(66) int local66 = 52; local66 < 62; local66++) {
			aCharArray7[local66] = (char) (local66 + 48 - 52);
		}
		aCharArray7[62] = '+';
		aCharArray7[63] = '/';
	}
}
