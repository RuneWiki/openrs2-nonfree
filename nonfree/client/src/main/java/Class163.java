import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class163 {

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "[Lclient!qw;")
	public static final Class319[] aClass319Array1 = new Class319[5];

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "[C")
	private static final char[] aCharArray9;

	static {
		@Pc(49) int local49;
		for (local49 = 0; local49 < aClass319Array1.length; local49++) {
			aClass319Array1[local49] = new Class319();
		}
		aCharArray9 = new char[64];
		for (local49 = 0; local49 < 26; local49++) {
			aCharArray9[local49] = (char) (local49 + 65);
		}
		for (@Pc(82) int local82 = 26; local82 < 52; local82++) {
			aCharArray9[local82] = (char) (local82 + 97 - 26);
		}
		for (@Pc(98) int local98 = 52; local98 < 62; local98++) {
			aCharArray9[local98] = (char) (local98 - 4);
		}
		aCharArray9[62] = '*';
		aCharArray9[63] = '-';
	}
}
