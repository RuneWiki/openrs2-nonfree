import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static29 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray3;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
	public static int[] anIntArray64 = new int[50];

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString26 = "Face here";

	@OriginalMember(owner = "client!c", name = "d", descriptor = "Lclient!sf;")
	public static Class157 aClass157_7 = new Class157(64);

	@OriginalMember(owner = "client!c", name = "f", descriptor = "S")
	public static short aShort8 = 1;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!g;")
	public static Class56 aClass56_4 = null;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString27 = "Connected to update server";

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public static void method565() {
		aClass157_7.method4033();
		Static90.aClass157_20.method4033();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V")
	public static void method566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static53.anInt1319 && arg1 <= Static81.anInt1915 && arg0 >= Static148.anInt3245 && Static166.anInt3675 >= arg3) {
			Static24.method477(arg0, arg1, arg3, arg2, arg4);
		} else {
			Static200.method3396(arg1, arg4, arg2, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
	public static void method567(@OriginalArg(1) int arg0) {
		Static219.anInt4477 = arg0;
		Static30.method576(3);
		Static30.method576(4);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method568() {
		Static220.aClass157_37.method4033();
		Static4.aClass157_3.method4033();
		Static301.aClass157_45.method4033();
	}
}
