import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
	public static int anInt1925;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "[I")
	public static final int[] anIntArray143 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Lclient!ria;")
	public static Class303 method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class303 local7 = Static43.method1101(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass303Array2 == null || arg0 >= local7.aClass303Array2.length) {
			return null;
		} else {
			return local7.aClass303Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)I")
	public static int method1633() {
		return Static227.anInt4204;
	}
}
