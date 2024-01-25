import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "[Lclient!qm;")
	public static Class4_Sub33_Sub1[] aClass4_Sub33_Sub1Array1;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!bi", name = "jb", descriptor = "Lclient!tj;")
	public static Class193 aClass193_7;

	@OriginalMember(owner = "client!bi", name = "xb", descriptor = "I")
	public static int anInt538;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
	public static int anInt501 = 0;

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "[I")
	public static final int[] anIntArray17 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "[I")
	public static final int[] anIntArray18 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "Z")
	public static boolean aBoolean42 = false;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	public static void method405() {
		Static234.anInt4720 = 0;
		@Pc(12) int local12 = Static286.anInt6699 + (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 >> 7);
		@Pc(19) int local19 = Static136.anInt3193 + (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static234.anInt4720 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static234.anInt4720 = 1;
		}
		if (Static234.anInt4720 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static234.anInt4720 = 0;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!tj;Lclient!bk;B)V")
	public static void method407(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Interface3 arg1) {
		Static146.anInterface3_4 = arg1;
		Static344.aClass193_45 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(Z)V")
	public static void method411() {
		Static5.aBoolean212 = false;
		Static287.aBooleanArray22 = null;
		Static183.anIntArray326 = null;
		Static340.anIntArray497 = null;
		Static238.aClipboard2 = null;
		Class192.lb = null;
		Static12.method242();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBI)I")
	public static int method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 & 0x3;
		if (local12 == 0) {
			return arg1;
		} else if (local12 == 1) {
			return 7 - arg0;
		} else if (local12 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
