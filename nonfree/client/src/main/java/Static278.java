import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
	public static int anInt4928;

	@OriginalMember(owner = "client!nu", name = "I", descriptor = "Lclient!tc;")
	public static Class232 aClass232_5;

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
	public static int anInt4935;

	@OriginalMember(owner = "client!nu", name = "C", descriptor = "Z")
	public static boolean aBoolean562 = false;

	@OriginalMember(owner = "client!nu", name = "H", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B[BI)I")
	public static int method3865(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static328.method4417(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method3867(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = 2;
		for (@Pc(43) int local43 = arg0 / 10; local43 != 0; local43 /= 10) {
			local39++;
		}
		@Pc(55) char[] local55 = new char[local39];
		local55[0] = '+';
		for (@Pc(68) int local68 = local39 - 1; local68 > 0; local68--) {
			@Pc(72) int local72 = arg0;
			arg0 /= 10;
			@Pc(83) int local83 = local72 - arg0 * 10;
			if (local83 < 10) {
				local55[local68] = (char) (local83 + 48);
			} else {
				local55[local68] = (char) (local83 + 87);
			}
		}
		return new String(local55);
	}

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)J")
	public static long method3868() {
		return Static36.aClass37_3.method4748();
	}
}
