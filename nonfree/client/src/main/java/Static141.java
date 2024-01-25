import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!is", name = "b", descriptor = "I")
	public static int anInt2986;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "I")
	public static int anInt2989;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString109 = "Loaded input handler";

	@OriginalMember(owner = "client!is", name = "g", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!is", name = "j", descriptor = "I")
	public static int anInt2992 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public static void method2821() {
		Static13.aClass11_56.method213();
		Static120.aClass11_60.method213();
		Static16.aClass11_9.method213();
		Static15.aClass11_132.method213();
		Static83.aClass11_141.method213();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	public static void method2824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass10_Sub2_2 != null) {
			local7.aClass10_Sub2_2 = null;
		}
		if (local7.aClass10_Sub2_1 != null) {
			local7.aClass10_Sub2_1 = null;
		}
	}
}
