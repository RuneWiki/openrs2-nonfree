import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class309 {

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	static {
		for (@Pc(20) int local20 = 0; local20 < 26; local20++) {
			aCharArray6[local20] = (char) (local20 + 65);
		}
		for (@Pc(36) int local36 = 26; local36 < 52; local36++) {
			aCharArray6[local36] = (char) (local36 + 97 - 26);
		}
		for (@Pc(52) int local52 = 52; local52 < 62; local52++) {
			aCharArray6[local52] = (char) (local52 + 48 - 52);
		}
		aCharArray6[63] = '-';
		aCharArray6[62] = '*';
	}

	@OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
