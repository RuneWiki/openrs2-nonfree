import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V")
	public static void method2218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static36.anInt809 * arg0 >> 8;
		if (arg1 == -1 && !Static107.aBoolean119) {
			Static271.method4582();
		} else if (arg1 != -1 && (Static312.anInt6282 != arg1 || !Static48.method838()) && local9 != 0 && !Static107.aBoolean119) {
			Static225.method4598(arg1, Static244.aClass100_98, local9);
		}
		Static312.anInt6282 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(Z)V")
	public static void method2219() {
		Static291.aClass3_Sub4_Sub2_3.method3682(95);
		Static291.aClass3_Sub4_Sub2_3.method3614(0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIBI)Z")
	public static boolean method2220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface5 local11 = (Interface5) Static132.method2235(arg1, arg2, arg0);
		if (local11 != null) {
			local5 = Static234.method4369(local11) & true;
		}
		local11 = (Interface5) Static134.method2239(arg1, arg2, arg0, lk.class);
		if (local11 != null) {
			local5 &= Static234.method4369(local11);
		}
		local11 = (Interface5) Static135.method2262(arg1, arg2, arg0);
		if (local11 != null) {
			local5 &= Static234.method4369(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BC)C")
	public static char method2221(@OriginalArg(1) char arg0) {
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
