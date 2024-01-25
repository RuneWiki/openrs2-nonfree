import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!an", name = "g", descriptor = "J")
	public static long aLong15 = 0L;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	public static byte[] method262(@OriginalArg(0) File arg0) {
		return Static407.method6329(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Z")
	public static boolean method265() {
		@Pc(7) boolean local7 = true;
		if (Static51.aClass251_1 == null) {
			if (Static419.aClass343_200.method8138(Static484.anInt8234)) {
				Static51.aClass251_1 = Static656.method6339(Static419.aClass343_200, Static484.anInt8234);
			} else {
				local7 = false;
			}
		}
		if (Static228.aClass251_2 == null) {
			if (Static419.aClass343_200.method8138(Static528.anInt8948)) {
				Static228.aClass251_2 = Static656.method6339(Static419.aClass343_200, Static528.anInt8948);
			} else {
				local7 = false;
			}
		}
		if (Static303.aClass251_4 == null) {
			if (Static419.aClass343_200.method8138(Static540.anInt9070)) {
				Static303.aClass251_4 = Static656.method6339(Static419.aClass343_200, Static540.anInt9070);
			} else {
				local7 = false;
			}
		}
		if (Static586.aClass93_13 == null) {
			if (Static394.aClass343_188.method8138(Static182.anInt3457)) {
				Static586.aClass93_13 = Static382.method6021(Static182.anInt3457, Static394.aClass343_188);
			} else {
				local7 = false;
			}
		}
		if (Static235.aClass251Array1 == null) {
			if (Static419.aClass343_200.method8138(Static182.anInt3457)) {
				Static235.aClass251Array1 = Static656.method6341(Static419.aClass343_200, Static182.anInt3457);
			} else {
				local7 = false;
			}
		}
		return local7;
	}
}
