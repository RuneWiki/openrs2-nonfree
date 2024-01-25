import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static568 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "[F")
	public static final float[] aFloatArray72 = new float[16];

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
	public static int anInt9372 = 0;

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Z")
	public static boolean aBoolean683 = false;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BC)C")
	public static char method7831(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
