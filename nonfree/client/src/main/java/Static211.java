import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static211 {

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	public static int anInt4205;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "[S")
	public static short[] aShortArray74;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "[Lclient!pn;")
	public static Class1_Sub2_Sub11[] aClass1_Sub2_Sub11Array7;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!km;")
	public static Class91 aClass91_158;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!tj;")
	public static Class12_Sub2 aClass12_Sub2_3 = null;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!hi;")
	public static Class61 aClass61_23 = new Class61();

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString245 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString246 = "Loaded config";

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString247 = "green:";

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BIIII)V")
	public static void method3349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > arg3) {
			Static126.method1523(Static22.anIntArrayArray3[arg2], arg0, arg1, arg3);
		} else {
			Static126.method1523(Static22.anIntArrayArray3[arg2], arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!in;II)V")
	public static void method3351(@OriginalArg(1) Class71 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static84.aClass71_11 != null || Static14.aBoolean23 || (arg0 == null || Static296.method4433(arg0) == null)) {
			return;
		}
		Static84.aClass71_11 = arg0;
		Static100.aClass71_12 = Static296.method4433(arg0);
		Static254.anInt4980 = 0;
		Static10.anInt245 = arg1;
		Static9.anInt238 = arg2;
		Static264.aBoolean389 = false;
	}
}
