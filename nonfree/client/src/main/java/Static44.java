import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "[[B")
	public static byte[][] aByteArrayArray53;

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_326 = new Class123(21, -1);

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString268 = null;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)Z")
	public static boolean method8133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILjava/lang/String;I)Lclient!ak;")
	public static Class16 method8134(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class16 local8;
		try {
			local8 = (Class16) Class.forName("Class16_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class16_Sub2();
		}
		local8.aString236 = arg1;
		local8.anInt8859 = arg0;
		return local8;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(CB)C")
	public static char method8135(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method8137(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static403.anInt7291 = 1;
		Static314.anInt5779 = -1;
		Static81.method1893(arg1, false, arg0);
	}
}
