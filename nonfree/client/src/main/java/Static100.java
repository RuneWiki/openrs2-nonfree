import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_41 = new Class27(29, 8);

	@OriginalMember(owner = "client!er", name = "i", descriptor = "I")
	public static int anInt2070 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	public static void method1780() {
		Static458.method6071(10);
		Static420.method5520();
		System.gc();
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
	public static void method1782() {
		@Pc(9) int[] local9 = new int[Static313.aClass272_2.anInt7599];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static313.aClass272_2.anInt7599; local13++) {
			@Pc(25) Class60 local25 = Static313.aClass272_2.method6068(local13);
			if (local25.anInt1727 >= 0 || local25.anInt1744 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static243.anIntArray443 = new int[local11];
		for (@Pc(56) int local56 = 0; local56 < local11; local56++) {
			Static243.anIntArray443[local56] = local9[local56];
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(CB)C")
	public static char method1783(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ms;II)V")
	public static void method1784(@OriginalArg(0) Class24_Sub3_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static400.anInt6752 < arg0.anInt6285) {
			Static2.method6(arg0);
		} else if (arg0.anInt6261 < Static400.anInt6752) {
			Static128.method5643(arg0, false);
			local9 = Static5.anInt78;
			local7 = Static130.anInt2653;
		} else {
			Static92.method1710(arg0);
		}
		if (arg0.anInt7092 < 128 || arg0.anInt7094 < 128 || Static2.anInt7 * 128 - 128 <= arg0.anInt7092 || Static17.anInt315 * 128 - 128 <= arg0.anInt7094) {
			arg0.anInt6274 = -1;
			local9 = 0;
			arg0.anInt6270 = -1;
			arg0.anInt6211 = -1;
			arg0.anInt6261 = 0;
			local7 = -1;
			arg0.anInt6285 = 0;
			arg0.anInt7092 = arg0.anIntArray610[0] * 128 + arg0.method4919() * 64;
			arg0.anInt7094 = arg0.anIntArray611[0] * 128 + arg0.method4919() * 64;
			arg0.method4913();
		}
		if (Static263.aClass24_Sub3_Sub2_Sub2_4 == arg0 && (arg0.anInt7092 < 1536 || arg0.anInt7094 < 1536 || (Static2.anInt7 - 12) * 128 <= arg0.anInt7092 || (Static17.anInt315 - 12) * 128 <= arg0.anInt7094)) {
			arg0.anInt6211 = -1;
			local9 = 0;
			arg0.anInt6261 = 0;
			local7 = -1;
			arg0.anInt6270 = -1;
			arg0.anInt6274 = -1;
			arg0.anInt6285 = 0;
			arg0.anInt7092 = arg0.anIntArray610[0] * 128 + arg0.method4919() * 64;
			arg0.anInt7094 = arg0.anIntArray611[0] * 128 + arg0.method4919() * 64;
			arg0.method4913();
		}
		@Pc(232) int local232 = Static54.method938(arg0);
		Static45.method5778(local7, local9, arg0, local232);
		Static242.method4562(arg0);
	}
}
