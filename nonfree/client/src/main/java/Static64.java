import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
	public static int anInt1662 = 0;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
	public static int anInt1674 = -1;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)V")
	public static void method1349() {
		Static243.aClass47_10.method2703(Static235.anInt4755, Static144.aBoolean265 ? Static261.anInt5279 + 256 : -1);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)V")
	public static void method1350(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static2.aByteArrayArrayArray1 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
	public static void method1351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass8_Sub4_1 != null) {
			local7.aClass8_Sub4_1 = null;
		}
		if (local7.aClass8_Sub4_2 != null) {
			local7.aClass8_Sub4_2 = null;
		}
	}
}
