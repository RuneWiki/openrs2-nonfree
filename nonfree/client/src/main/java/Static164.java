import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "Z")
	public static boolean aBoolean219;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
	public static int anInt3042 = 0;

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "[I")
	public static final int[] anIntArray255 = new int[14];

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "[C")
	public static final char[] aCharArray4 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJ)V")
	public static void method2398(@OriginalArg(1) long arg0) {
		if (Static40.aClass53ArrayArrayArray2 != null) {
			if (Static134.anInt2621 == 1 || Static134.anInt2621 == 5) {
				Static252.method1736(arg0);
			} else if (Static134.anInt2621 == 4) {
				Static308.method4244(arg0);
			}
		}
		Static270.method3652(Static16.aClass30_11, (long) Static175.anInt3261);
		if (Static404.anInt6892 != -1) {
			Static46.method4093(Static404.anInt6892);
		}
		for (@Pc(50) int local50 = 0; local50 < Static180.anInt3352; local50++) {
			if (Static26.aBooleanArray2[local50]) {
				Static203.aBooleanArray11[local50] = true;
			}
			Static86.aBooleanArray24[local50] = Static26.aBooleanArray2[local50];
			Static26.aBooleanArray2[local50] = false;
		}
		Static99.anInt5862 = Static175.anInt3261;
		if (Static16.aClass30_11.method4682()) {
			Static231.aBoolean315 = true;
		}
		if (Static404.anInt6892 != -1) {
			Static180.anInt3352 = 0;
			Static340.method4726();
		}
		Static16.aClass30_11.va();
		Static242.method4045(Static16.aClass30_11);
		@Pc(101) int local101 = Static237.method3293();
		if (local101 == -1) {
			local101 = Static52.anInt1389;
		}
		if (local101 == -1) {
			local101 = Static105.anInt2235;
		}
		Static239.method3308(local101);
		Static51.method1039(Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061, Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86, Static4.anInt161, Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062);
		Static4.anInt161 = 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
	public static int method2399(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
