import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static389 {

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
	public static int anInt1932;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method1528() {
		if (Static234.aClass215_6 == null) {
			return;
		}
		if (Static234.aClass215_6.anInt5791 == 1) {
			Static234.aClass215_6 = null;
			return;
		}
		if (Static234.aClass215_6.anInt5791 == 2) {
			Static376.method4826(2, aString20, Static201.aClass124_3);
			Static234.aClass215_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(CI)C")
	public static char method1529(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
	public static boolean method1531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static156.method2193(arg0, arg1) || Static6.method105(arg1, arg0);
	}
}
