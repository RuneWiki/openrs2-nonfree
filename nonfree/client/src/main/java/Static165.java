import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "Lclient!kr;")
	public static Class20 aClass20_6;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II)I")
	public static int method3055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static41.anIntArrayArray9 == null ? 0 : Static41.anIntArrayArray9[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V")
	public static void method3058() {
		for (@Pc(6) Class2_Sub31 local6 = (Class2_Sub31) Static228.aClass238_26.method5833(); local6 != null; local6 = (Class2_Sub31) Static228.aClass238_26.method5838()) {
			if (local6.aBoolean436) {
				local6.method4826();
			}
		}
		for (@Pc(37) Class2_Sub31 local37 = (Class2_Sub31) Static124.aClass238_22.method5833(); local37 != null; local37 = (Class2_Sub31) Static124.aClass238_22.method5838()) {
			if (local37.aBoolean436) {
				local37.method4826();
			}
		}
	}
}
