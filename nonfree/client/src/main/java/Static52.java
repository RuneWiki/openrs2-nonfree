import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Lclient!ag;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "[I")
	public static final int[] anIntArray70 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "[I")
	public static final int[] anIntArray71 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ofa;BI)Ljava/lang/String;")
	public static String method902(@OriginalArg(0) Class5_Sub22 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5947();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local7];
			arg0.anInt6629 += Static411.aClass152_1.method3711(arg0.aByteArray71, local7, arg0.anInt6629, 0, local20);
			return Static392.method5817(local20, 0, local7);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(CI)C")
	public static char method903(@OriginalArg(0) char arg0) {
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
