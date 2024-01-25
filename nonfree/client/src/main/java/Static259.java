import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "Lclient!wo;")
	public static Class216 aClass216_46;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Lclient!wo;")
	public static Class216 aClass216_47;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "Lclient!jk;")
	public static Class106 aClass106_4;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "Z")
	public static boolean aBoolean281 = true;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "Lclient!hq;")
	public static Class87 aClass87_26 = new Class87(64);

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "I")
	public static int anInt2903 = -1;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
	public static int anInt2907 = 0;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_94 = new Class34("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(CI)C")
	public static char method2698(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BCI)I")
	public static int method2699(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public static void method2702(@OriginalArg(1) int arg0) {
		Static271.method4752();
		Static169.method3378();
		Static173.method3437(arg0, true);
		Static133.method2751(Static208.aClass32_11, Static193.aClass216_64, Static34.aClass216_8);
		Static327.method5309(Static193.aClass216_64, Static208.aClass32_11);
		Static26.method722(Static163.aClass5Array13);
		Static345.method5539();
		Static45.method1050();
		if (Static295.anInt5811 == 10) {
			Static112.method2422(false);
		} else if (Static295.anInt5811 == 30) {
			Static232.method4269(25);
		} else if (Static295.anInt5811 == 5) {
			Static338.method5467(Static208.aClass32_11, Static193.aClass216_64);
		}
	}
}
