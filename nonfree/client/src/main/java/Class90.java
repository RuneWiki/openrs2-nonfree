import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class90 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "[C")
	private static final char[] aCharArray2;

	static {
		new Class88("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
		aCharArray2 = new char[64];
		for (@Pc(10) int local10 = 0; local10 < 26; local10++) {
			aCharArray2[local10] = (char) (local10 + 65);
		}
		for (@Pc(24) int local24 = 26; local24 < 52; local24++) {
			aCharArray2[local24] = (char) (local24 + 71);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray2[local38] = (char) (local38 + 48 - 52);
		}
		aCharArray2[62] = '*';
		aCharArray2[63] = '-';
	}
}
