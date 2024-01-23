import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	public static int anInt4842;

	@OriginalMember(owner = "client!tg", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray24;

	@OriginalMember(owner = "client!tg", name = "O", descriptor = "Lclient!an;")
	public static Class10 aClass10_54 = new Class10();

	@OriginalMember(owner = "client!tg", name = "R", descriptor = "[Lclient!qb;")
	public static Class12_Sub3_Sub2[] aClass12_Sub3_Sub2Array1 = new Class12_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
	public static int anInt4854 = 0;

	@OriginalMember(owner = "client!tg", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString167 = "flash3:";

	@OriginalMember(owner = "client!tg", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString168 = "Loaded update list";

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
	public static void method3880() {
		aBooleanArray24 = null;
		aString168 = null;
		aClass12_Sub3_Sub2Array1 = null;
		aString167 = null;
		aClass10_54 = null;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)[F")
	public static float[] method3881(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static291.method4315() + Static291.method4314();
		@Pc(9) int local9 = Static291.method4318();
		Static191.aFloatArray29[3] = 1.0F;
		@Pc(22) float local22 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(31) float local31 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(38) float local38 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(40) float local40 = 0.58823526F;
		Static191.aFloatArray29[0] = local40 * (float) (arg0 >> 16 & 0xFF) / 255.0F * local31 * local7;
		Static191.aFloatArray29[1] = local22 * ((float) (arg0 >> 8 & 0xFF) / 255.0F) * local40 * local7;
		Static191.aFloatArray29[2] = local7 * local40 * (float) (arg0 & 0xFF) / 255.0F * local38;
		return Static191.aFloatArray29;
	}

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V")
	public static void method3882() {
		Static137.aClass33_22.method839();
		Static116.aClass33_21.method839();
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(IZ)V")
	public static void method3883(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static165.method2602();
		} else if (arg0 == 2) {
			Static79.method1234();
		} else if (arg0 == 3) {
			Static249.method3772();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method3884(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
