import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class299 {

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
	public int anInt7441;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Ljava/lang/String;")
	public String aString114;

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray6[local6] = (char) (local6 + 65);
		}
		for (@Pc(22) int local22 = 26; local22 < 52; local22++) {
			aCharArray6[local22] = (char) (local22 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray6[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray6[63] = '-';
		aCharArray6[62] = '*';
	}
}
