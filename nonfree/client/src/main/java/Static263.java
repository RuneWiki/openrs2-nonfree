import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static263 {

	@OriginalMember(owner = "client!qr", name = "md", descriptor = "I")
	public static int anInt5404;

	@OriginalMember(owner = "client!qr", name = "Sc", descriptor = "I")
	public static int anInt5385 = 0;

	@OriginalMember(owner = "client!qr", name = "ed", descriptor = "I")
	public static int anInt5396 = 0;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIILclient!ae;)V")
	public static void method4786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4 arg2) {
		Static122.aClass105ArrayArray3 = new Class105[arg0][arg1];
		Static214.aClass4_9 = arg2;
		if (Static319.anIntArray471 != null) {
			Static318.aClass22_4 = Static252.method4567(Static319.anIntArray471[4], Static319.anIntArray471[3], Static319.anIntArray471[5], Static319.anIntArray471[1], Static319.anIntArray471[0], Static319.anIntArray471[2]);
		}
		Static49.aClass105_2 = new Class105();
		Static119.method2503();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 + arg0 > arg6 && arg3 < arg6 + arg2) {
			return arg1 < arg4 + arg7 && arg5 + arg1 > arg7;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(CB)C")
	public static char method4794(@OriginalArg(0) char arg0) {
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
}
