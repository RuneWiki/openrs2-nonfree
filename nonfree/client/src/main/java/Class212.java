import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class212 {

	@OriginalMember(owner = "client!lfa", name = "d", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
	public int anInt6361;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
	public int anInt6362;

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	public int anInt6363;

	static {
		for (@Pc(7) int local7 = 0; local7 < 26; local7++) {
			aCharArray6[local7] = (char) (local7 + 65);
		}
		for (@Pc(23) int local23 = 26; local23 < 52; local23++) {
			aCharArray6[local23] = (char) (local23 + 97 - 26);
		}
		for (@Pc(39) int local39 = 52; local39 < 62; local39++) {
			aCharArray6[local39] = (char) (local39 + 48 - 52);
		}
		aCharArray6[62] = '+';
		aCharArray6[63] = '/';
	}
}
