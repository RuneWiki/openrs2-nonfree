import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static717 {

	@OriginalMember(owner = "client!wla", name = "h", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!wla", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[128][128];

	@OriginalMember(owner = "client!wla", name = "b", descriptor = "(II)V")
	public static void method9351(@OriginalArg(1) int arg0) {
		if (!Static137.method2243()) {
			return;
		}
		if (Static478.anInt8342 != arg0) {
			Static364.aString94 = "";
		}
		Static478.anInt8342 = arg0;
		Static532.aClass400_2.method9229();
		Static638.method8657(5);
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(IIFIFI[BFILclient!bo;FBF)V")
	public static void method9353(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) float arg4, @OriginalArg(9) Class34 arg5, @OriginalArg(10) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(11) int local11 = 0; local11 < 16; local11++) {
			Static338.method3589(arg2, arg7, arg6, arg4, arg5, arg3, arg1, arg0, local11);
			arg0 += 16384;
		}
	}
}
