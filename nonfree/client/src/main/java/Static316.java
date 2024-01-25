import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "Lclient!bu;")
	public static Class32 aClass32_71;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
	public static int anInt5557 = 1;

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
	public static int anInt5558 = 0;

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_87 = new Class217(26, -1);

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "I")
	public static int anInt5563 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IC)C")
	public static char method4357(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static55.method1137(arg3)) {
			if (Static111.aClass156ArrayArray1[arg3] == null) {
				Static202.method3167(Static178.aClass156ArrayArray2[arg3], arg0, arg7, arg2, arg1, -1, arg4, arg6, arg5);
			} else {
				Static202.method3167(Static111.aClass156ArrayArray1[arg3], arg0, arg7, arg2, arg1, -1, arg4, arg6, arg5);
			}
		} else if (arg4 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static55.aBooleanArray8[local19] = true;
			}
		} else {
			Static55.aBooleanArray8[arg4] = true;
		}
	}
}
