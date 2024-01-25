import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static430 {

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "Lclient!fm;")
	public static Class113 aClass113_2;

	@OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
	public static int anInt7728;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(CI)C")
	public static char method6700(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIII)V")
	public static void method6702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static630.anInt10099 && Static16.anInt4339 >= arg3 && arg2 >= Static11.anInt9803 && arg0 <= Static149.anInt2949) {
			Static508.method7598(arg3, arg0, arg4, arg1, arg2);
		} else {
			Static182.method3152(arg4, arg1, arg2, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!jw;)V")
	public static void method6704(@OriginalArg(0) Class4_Sub1 arg0) {
		Static232.aClass5_8.H(arg0.anInt8916, arg0.anInt8915 + (arg0.method7703() >> 1), arg0.anInt8911, Static320.anIntArray341);
		arg0.anInt8914 = Static320.anIntArray341[0];
		arg0.anInt8917 = Static320.anIntArray341[1];
		arg0.anInt8918 = Static320.anIntArray341[2];
	}
}
