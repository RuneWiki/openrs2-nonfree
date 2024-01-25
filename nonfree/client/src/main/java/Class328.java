import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class328 {

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "[C")
	public static final char[] aCharArray8 = new char[64];

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray8[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray8[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray8[local36] = (char) (local36 - 4);
		}
		aCharArray8[63] = '-';
		aCharArray8[62] = '*';
	}
}
