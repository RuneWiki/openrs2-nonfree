import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static491 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "[I")
	public static int[] anIntArray637;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "Z")
	public static boolean aBoolean558 = false;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IC)C")
	public static char method6774(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)I")
	public static int method6775(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!lj;Lclient!lj;)V")
	public static void method6777(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg1.aClass6_Sub1_59 != null) {
			arg1.method7852();
		}
		arg1.aClass6_Sub1_59 = arg0;
		arg1.aClass6_Sub1_60 = arg0.aClass6_Sub1_60;
		arg1.aClass6_Sub1_59.aClass6_Sub1_60 = arg1;
		arg1.aClass6_Sub1_60.aClass6_Sub1_59 = arg1;
	}
}
