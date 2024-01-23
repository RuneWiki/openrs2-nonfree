import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static238 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
	public static int[] anIntArray434;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Lclient!aj;")
	public static Class10 aClass10_10;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt4828;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString161 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!re", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40 = null;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BC)C")
	public static char method3751(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method3752() {
		if (Static245.aBoolean177) {
			return;
		}
		Static245.aBoolean177 = true;
		if (Static51.aBoolean77) {
			Static2.aFloat1 = (int) Static2.aFloat1 + 191 & 0xFFFFFF80;
		} else {
			Static287.aFloat54 += (24.0F - Static287.aFloat54) / 2.0F;
		}
		Static104.aBoolean149 = true;
	}
}
