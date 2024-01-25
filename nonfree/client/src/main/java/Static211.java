import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Lclient!ac;")
	public static Class4 aClass4_5;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "Lclient!rk;")
	public static Class180 aClass180_54;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	public static int anInt4222;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "[I")
	public static final int[] anIntArray578 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString273 = "Loading fonts - ";

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString274 = "scroll:";

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
	public static void method3759() {
		Static263.aClass103_52.method2678();
		Static281.aClass103_51.method2678();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)I")
	public static int method3763(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(35) int local35 = (arg0 & 0x7F) * 96 >> 7;
			if (local35 < 2) {
				local35 = 2;
			} else if (local35 > 126) {
				local35 = 126;
			}
			return (arg0 & 0xFF80) + local35;
		}
	}
}
