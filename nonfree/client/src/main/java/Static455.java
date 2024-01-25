import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
	public static int anInt7235;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	public static int anInt7239;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_275 = new Class67(96, 5);

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
	public static int anInt7243 = 0;

	@OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
	public static final int anInt7244 = 328;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZZII)Ljava/lang/String;")
	public static String method5866(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		for (@Pc(38) int local38 = arg0 / 10; local38 != 0; local38 /= 10) {
			local34++;
		}
		@Pc(55) char[] local55 = new char[local34];
		local55[0] = '+';
		for (@Pc(63) int local63 = local34 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local67 - arg0 * 10;
			if (local78 >= 10) {
				local55[local63] = (char) (local78 + 87);
			} else {
				local55[local63] = (char) (local78 + 48);
			}
		}
		return new String(local55);
	}
}
