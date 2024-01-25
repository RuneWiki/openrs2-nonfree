import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
	public static int anInt5818;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public static int anInt5819;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!gh;")
	public static Class76 aClass76_9;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public static int anInt5822;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!mo;")
	public static Class143 aClass143_104;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString217 = "Starting 3d Library";

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public static int anInt5821 = 0;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	public static int anInt5825 = -1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IC)C")
	public static char method5289(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(JLjava/lang/String;IIIILjava/lang/String;I)V")
	public static void method5291(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		if (!Static302.aBoolean409 && Static41.anInt980 < 500) {
			@Pc(19) int local19 = arg3 == -1 ? Static288.anInt5579 : arg3;
			@Pc(37) Class14_Sub23 local37 = new Class14_Sub23(arg1, arg6, local19, arg4, arg0, arg2, arg5);
			Static95.aClass18_9.method451(local37);
			Static41.anInt980++;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Z")
	public static boolean method5292() {
		try {
			if (Static106.anInt2365 == 2) {
				if (Static339.aClass14_Sub21_3 == null) {
					Static339.aClass14_Sub21_3 = Static362.method3412(Static285.aClass143_100, Static270.anInt5151, Static104.anInt2321);
					if (Static339.aClass14_Sub21_3 == null) {
						return false;
					}
				}
				if (Static36.aClass55_1 == null) {
					Static36.aClass55_1 = new Class55(Static130.aClass143_61, aClass143_104);
				}
				if (Static143.aClass14_Sub19_Sub4_2.method5516(Static36.aClass55_1, Static339.aClass14_Sub21_3, Static134.aClass143_62)) {
					Static143.aClass14_Sub19_Sub4_2.method5534();
					Static143.aClass14_Sub19_Sub4_2.method5536(Static355.anInt6755);
					Static143.aClass14_Sub19_Sub4_2.method5520(Static99.aBoolean159, Static339.aClass14_Sub21_3);
					Static339.aClass14_Sub21_3 = null;
					Static285.aClass143_100 = null;
					Static36.aClass55_1 = null;
					Static106.anInt2365 = 0;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static143.aClass14_Sub19_Sub4_2.method5545();
			Static36.aClass55_1 = null;
			Static106.anInt2365 = 0;
			Static339.aClass14_Sub21_3 = null;
			Static285.aClass143_100 = null;
		}
		return false;
	}
}
