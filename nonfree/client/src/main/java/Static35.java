import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static35 {

	@OriginalMember(owner = "client!br", name = "I", descriptor = "Lclient!kj;")
	public static final Class131 aClass131_1 = new Class131("", 16);

	@OriginalMember(owner = "client!br", name = "M", descriptor = "S")
	public static short aShort4 = 320;

	@OriginalMember(owner = "client!br", name = "N", descriptor = "I")
	public static int anInt620 = 0;

	@OriginalMember(owner = "client!br", name = "P", descriptor = "I")
	public static int anInt622 = 0;

	@OriginalMember(owner = "client!br", name = "R", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_29 = new Class214(50, 6);

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
	public static void method513() {
		if (Static355.anInt6246 != -1) {
			Static118.method2250(Static355.anInt6246, -1, false, -1);
			Static355.anInt6246 = -1;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Z")
	public static boolean method516(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V")
	public static void method519(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static425.aClass4_Sub1_Sub18_3 != null) {
			Static355.anInt6246 = Static425.aClass4_Sub1_Sub18_3.anInt6952;
		} else {
			Static355.anInt6246 = -1;
		}
		Static345.aClass91_41 = null;
		Static89.aClass240_7 = null;
		Static165.anInt3267 = 0;
		Static425.aClass4_Sub1_Sub18_3 = null;
		Static425.method3276();
		Static425.aClass91_24.method2582();
		Static425.aClass189_2 = null;
		Static266.aClass2_26 = null;
		Static10.aClass122_1 = null;
		Static113.anInt2426 = -1;
		Static237.aClass122_3 = null;
		Static416.aClass122_8 = null;
		Static262.aClass122_5 = null;
		Static291.aClass122_6 = null;
		Static245.anInt4781 = -1;
		Static171.aClass122_2 = null;
		Static381.aClass122_7 = null;
		Static259.aClass122_4 = null;
		Static425.aClass116_3.method3299();
		Static425.aClass8_3.method66(64, 64);
		Static425.aClass116_3.method3301(64, 128);
		Static425.aClass228_3.method5201(64);
		Static166.aClass86_3.method2417(64);
	}
}
