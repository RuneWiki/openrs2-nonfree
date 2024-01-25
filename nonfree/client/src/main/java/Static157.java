import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!kn", name = "bb", descriptor = "I")
	public static int anInt3294;

	@OriginalMember(owner = "client!kn", name = "gb", descriptor = "I")
	public static int anInt3298;

	@OriginalMember(owner = "client!kn", name = "ab", descriptor = "[I")
	public static final int[] anIntArray323 = new int[25];

	@OriginalMember(owner = "client!kn", name = "fb", descriptor = "Lclient!ps;")
	public static Class163 aClass163_11 = null;

	@OriginalMember(owner = "client!kn", name = "hb", descriptor = "[Lclient!ur;")
	public static Class127_Sub1[] aClass127_Sub1Array1 = new Class127_Sub1[0];

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(IB)Lclient!bg;")
	public static Class22 method2796(@OriginalArg(0) int arg0) {
		@Pc(5) Class37 local5 = Static165.aClass37_54;
		@Pc(14) Class22 local14;
		synchronized (Static165.aClass37_54) {
			local14 = (Class22) Static165.aClass37_54.method915((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(42) byte[] local42 = Static17.aClass134_8.method3009(Static140.method2314(arg0), Static248.method24(arg0));
		local14 = new Class22();
		if (local42 != null) {
			local14.method403(new Class1_Sub21(local42));
		}
		@Pc(57) Class37 local57 = Static165.aClass37_54;
		synchronized (Static165.aClass37_54) {
			Static165.aClass37_54.method922((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IC)Z")
	public static boolean method2798(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(CI)C")
	public static char method2799(@OriginalArg(0) char arg0) {
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
