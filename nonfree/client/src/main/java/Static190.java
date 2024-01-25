import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gfa", name = "ib", descriptor = "I")
	public static int anInt3825;

	@OriginalMember(owner = "client!gfa", name = "jb", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!gfa", name = "i", descriptor = "[I")
	public static final int[] anIntArray326 = new int[8];

	@OriginalMember(owner = "client!gfa", name = "N", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_51 = new Class218(18, 8);

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BC)C")
	public static char method3479(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	public static void method3480() {
		Static66.aClass83_3.method2374();
		Static593.aClass74_13.method1845();
		Static33.aClass74_15.method1845();
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)V")
	public static void method3481() {
		Static245.aClass165_30.method4403();
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BI)V")
	public static void method3491(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub11_Sub4 local15 = Static583.method8201(11, (long) arg0);
		local15.method2194();
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method3493(@OriginalArg(1) String arg0) {
		if (!Static513.aClass291_6.aBoolean619) {
			return -1;
		} else if (Static590.aHashtable6.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static150.method5040(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static87.aString13 + local20;
			if (!Static649.aClass15_160.method527("", local33)) {
				return -1;
			} else if (Static649.aClass15_160.method532(local33)) {
				@Pc(57) byte[] local57 = Static649.aClass15_160.method533(local33, "");
				@Pc(70) File local70;
				try {
					local70 = Static626.method8772(local20);
				} catch (@Pc(72) RuntimeException local72) {
					return -1;
				}
				if (local57 == null || local70 == null) {
					return -1;
				}
				@Pc(80) boolean local80 = true;
				@Pc(84) byte[] local84 = Static601.method8443(local70);
				if (local84 != null && local57.length == local84.length) {
					for (@Pc(97) int local97 = 0; local97 < local84.length; local97++) {
						if (local57[local97] != local84[local97]) {
							local80 = false;
							break;
						}
					}
				} else {
					local80 = false;
				}
				try {
					if (!local80) {
						Static513.aClass291_6.method7139(local57, local70);
					}
				} catch (@Pc(133) Throwable local133) {
					return -1;
				}
				Static656.method9123(arg0, local70);
				return 100;
			} else {
				return Static649.aClass15_160.method538(local33);
			}
		}
	}
}
