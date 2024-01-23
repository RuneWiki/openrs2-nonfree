import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static166 {

	@OriginalMember(owner = "client!m", name = "N", descriptor = "Lclient!rg;")
	public static Class151 aClass151_5;

	@OriginalMember(owner = "client!m", name = "P", descriptor = "I")
	public static int anInt3122;

	@OriginalMember(owner = "client!m", name = "K", descriptor = "Lclient!l;")
	public static Class98 aClass98_25 = new Class98(50);

	@OriginalMember(owner = "client!m", name = "M", descriptor = "I")
	public static volatile int anInt3120 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IC)C")
	public static char method2761(@OriginalArg(1) char arg0) {
		if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == '-') {
			return '\u0000';
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
		} else if (arg0 == ' ' || arg0 == ' ') {
			return '_';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
