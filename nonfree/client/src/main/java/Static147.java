import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZC)C")
	public static char method2542(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V")
	public static void method2543() {
		@Pc(9) int local9;
		if (Static560.aClass262Array4 != null) {
			for (local9 = 0; local9 < Static28.anInt1048; local9++) {
				Static560.aClass262Array4[local9] = null;
			}
			Static560.aClass262Array4 = null;
		}
		if (Static542.aClass262Array3 != null) {
			for (local9 = 0; local9 < Static123.anInt9178; local9++) {
				Static542.aClass262Array3[local9] = null;
			}
			Static542.aClass262Array3 = null;
		}
		if (Static248.aClass262Array2 != null) {
			for (local9 = 0; local9 < Static120.anInt2729; local9++) {
				Static248.aClass262Array2[local9] = null;
			}
			Static248.aClass262Array2 = null;
		}
		Static251.anInt5137 = -1;
		Static161.anInt3354 = -1;
		Static333.anIntArray353 = null;
		Static218.aClass262Array1 = null;
		Static206.anIntArrayArrayArray23 = null;
	}
}
