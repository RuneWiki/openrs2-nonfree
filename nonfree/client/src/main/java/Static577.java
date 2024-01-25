import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static577 {

	@OriginalMember(owner = "client!tha", name = "m", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_103 = new Class240(18, 3);

	@OriginalMember(owner = "client!tha", name = "p", descriptor = "[I")
	public static final int[] anIntArray503 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!tha", name = "r", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_142 = new Class171(2, 6);

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BII)Z")
	public static boolean method7588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static505.method6600(arg0, arg1) || Static506.method6604(arg1, arg0);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)Lclient!pja;")
	public static Class3_Sub37 method7590() {
		return Static122.anInt2193 == 0 ? new Class3_Sub37() : Static95.aClass3_Sub37Array8[--Static122.anInt2193];
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BC)C")
	public static char method7591(@OriginalArg(1) char arg0) {
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
