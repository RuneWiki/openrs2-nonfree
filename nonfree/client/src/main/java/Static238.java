import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "I")
	public static int anInt4736;

	@OriginalMember(owner = "client!iha", name = "l", descriptor = "I")
	public static int anInt4740;

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
	public static int anInt4735 = 0;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZIZI)Lclient!eq;")
	public static Class97 method3938(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class262 local5 = null;
		if (Static624.aClass31_7 != null) {
			local5 = new Class262(arg1, Static624.aClass31_7, Static572.aClass31Array1[arg1], 1000000);
		}
		Static8.aClass167_Sub1Array1[arg1] = Static622.aClass224_1.method5481(Static548.aClass262_4, arg1, local5);
		Static8.aClass167_Sub1Array1[arg1].method6958();
		return new Class97(Static8.aClass167_Sub1Array1[arg1], arg0, arg2);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(CB)C")
	public static char method3939(@OriginalArg(0) char arg0) {
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
