import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ih", name = "Cb", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!ih", name = "Qb", descriptor = "I")
	public static int anInt2867;

	@OriginalMember(owner = "client!ih", name = "Db", descriptor = "I")
	public static int anInt2855 = 0;

	@OriginalMember(owner = "client!ih", name = "Eb", descriptor = "I")
	public static int anInt2856 = 0;

	@OriginalMember(owner = "client!ih", name = "Mb", descriptor = "J")
	public static volatile long aLong90 = 0L;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IIIIIII)I")
	public static int method2197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(12) int local12 = arg2;
			arg2 = arg3;
			arg3 = local12;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 + 1 - arg1 - arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg3;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZC)C")
	public static char method2203(@OriginalArg(1) char arg0) {
		if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == '-') {
			return '\u0000';
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
		} else if (arg0 == ' ' || arg0 == ' ') {
			return '_';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
