import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class213 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "[C")
	private static final char[] aCharArray5 = new char[64];

	static {
		for (@Pc(8) int local8 = 0; local8 < 26; local8++) {
			aCharArray5[local8] = (char) (local8 + 65);
		}
		for (@Pc(24) int local24 = 26; local24 < 52; local24++) {
			aCharArray5[local24] = (char) (local24 + 97 - 26);
		}
		for (@Pc(42) int local42 = 52; local42 < 62; local42++) {
			aCharArray5[local42] = (char) (local42 + 48 - 52);
		}
		aCharArray5[62] = '*';
		aCharArray5[63] = '-';
	}
}
