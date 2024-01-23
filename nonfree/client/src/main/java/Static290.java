import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static290 {

	@OriginalMember(owner = "client!uo", name = "Q", descriptor = "Lclient!ch;")
	public static Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_5;

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "[I")
	public static int[] anIntArray461 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!uo", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString308 = "Loaded wordpack";

	@OriginalMember(owner = "client!uo", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString309 = "Select";

	@OriginalMember(owner = "client!uo", name = "N", descriptor = "[I")
	public static int[] anIntArray462 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!uo", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString310 = "Members object";

	@OriginalMember(owner = "client!uo", name = "V", descriptor = "[Lclient!pb;")
	public static Class134[] aClass134Array1 = new Class134[8];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V")
	public static void method4438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static85.method1597(arg1)) {
			Static274.method4261(arg0, Static274.aClass66ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)V")
	public static void method4439(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static104.aBoolean115) {
			Static104.aBoolean115 = arg0;
			Static222.method3453();
		}
	}
}
