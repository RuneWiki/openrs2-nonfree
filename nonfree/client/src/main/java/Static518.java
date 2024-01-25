import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "[J")
	public static long[] aLongArray16;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "[J")
	public static final long[] aLongArray15 = new long[32];

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
	public static int anInt9014 = 1;

	@OriginalMember(owner = "client!vq", name = "A", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_259 = new Class202("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!vq", name = "G", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_182 = new Class239(52, 0);

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_20 = new Class245(14, 0, 4, 1);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(CB)C")
	public static char method7530(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)Z")
	public static boolean method7535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
	public static void method7537(@OriginalArg(0) int arg0) {
		Static514.anInt8971 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static515.anInt3809; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static315.anInt5693; local6++) {
				if (Static399.aClass262ArrayArrayArray2[arg0][local3][local6] == null) {
					Static399.aClass262ArrayArrayArray2[arg0][local3][local6] = new Class262(arg0, local3, local6);
				}
			}
		}
	}
}
