import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "[C")
	public static char[] aCharArray10 = new char[] { '-', ' ', ' ', '_', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!eg", name = "o", descriptor = "Z")
	public static boolean aBoolean94 = true;

	@OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
	public static int anInt1232 = -1;

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "[[S")
	public static short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public static int anInt1235 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public static void method1029() {
		if (Static122.anIntArray279 != null && Static220.anIntArray542 != null) {
			return;
		}
		Static220.anIntArray542 = new int[256];
		Static122.anIntArray279 = new int[256];
		for (@Pc(20) int local20 = 0; local20 < 256; local20++) {
			@Pc(32) double local32 = (double) local20 / 255.0D * 6.283185307179586D;
			Static122.anIntArray279[local20] = (int) (Math.sin(local32) * 4096.0D);
			Static220.anIntArray542[local20] = (int) (Math.cos(local32) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([BZ)Lclient!bi;")
	public static Class3_Sub4_Sub2 method1030(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(25) Class3_Sub4_Sub2 local25;
		if (Static283.aBoolean393) {
			local25 = new Class3_Sub4_Sub2_Sub1(arg0, Static93.anIntArray162, Static35.anIntArray54, Static101.anIntArray185, Static306.anIntArray618, Static314.aByteArrayArray130);
		} else {
			local25 = new Class3_Sub4_Sub2_Sub2(arg0, Static93.anIntArray162, Static35.anIntArray54, Static101.anIntArray185, Static306.anIntArray618, Static314.aByteArrayArray130);
		}
		Static6.method108();
		return local25;
	}
}
