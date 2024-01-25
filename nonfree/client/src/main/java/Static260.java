import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static260 {

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!c;")
	public static Class33 aClass33_4;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[Lclient!go;")
	public static Class91_Sub1[] aClass91_Sub1Array1 = new Class91_Sub1[0];

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[I")
	public static final int[] anIntArray404 = new int[2048];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(CI)C")
	public static char method3873(@OriginalArg(0) char arg0) {
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
