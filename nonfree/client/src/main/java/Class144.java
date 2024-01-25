import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class144 {

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "[C")
	private static final char[] aCharArray2 = new char[64];

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	public int anInt4175;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public int anInt4176;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "Lclient!pm;")
	public final Class254 aClass254_1 = new Class254();

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Z")
	public boolean aBoolean288 = false;

	static {
		for (@Pc(44) int local44 = 0; local44 < 26; local44++) {
			aCharArray2[local44] = (char) (local44 + 65);
		}
		for (@Pc(58) int local58 = 26; local58 < 52; local58++) {
			aCharArray2[local58] = (char) (local58 + 97 - 26);
		}
		for (@Pc(74) int local74 = 52; local74 < 62; local74++) {
			aCharArray2[local74] = (char) (local74 + 48 - 52);
		}
		aCharArray2[62] = '+';
		aCharArray2[63] = '/';
	}
}
