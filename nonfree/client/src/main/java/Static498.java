import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!fw;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "[C")
	public static final char[] aCharArray10 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIZILclient!pfa;)V")
	public static void method6755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) Class251 arg2) {
		Static377.aClass251_90 = arg2;
		Static171.anInt3648 = 1;
		Static300.anInt5541 = arg1;
		Static394.anInt6906 = 0;
		Static430.anInt7500 = arg0;
		Static259.aBoolean354 = false;
		Static213.anInt8692 = 2;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public static void method6757() {
		@Pc(8) Class6_Sub5 local8 = (Class6_Sub5) Static395.aClass361_52.method7838();
		@Pc(20) boolean local20 = Static547.aClass292_14 != null || Static114.anInt2194 > 0;
		if (local20) {
			Static300.anInt5542 = 1;
		}
		if (Static159.aBoolean736 && Static365.aClass155_1.method4042(81) && Static421.anInt7365 > 2) {
			if (local20) {
				Static113.aClass6_Sub45_2 = (Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285.aClass6_285;
			} else {
				Static540.method3563((Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285.aClass6_285, local8.method1982(), local8.method1991());
			}
		} else if (local20) {
			Static113.aClass6_Sub45_2 = (Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285;
		} else {
			Static540.method3563((Class6_Sub45) Static182.aClass361_23.aClass6_287.aClass6_285, local8.method1982(), local8.method1991());
		}
	}
}
