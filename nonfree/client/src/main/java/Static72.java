import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static72 {

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString97 = " from your friend list first.";

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString98 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "Z")
	public static boolean aBoolean118 = true;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIZIIII)V")
	public static void method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (Static56.aClass2_Sub4_Sub2_1.method2088() == 2) {
			Static93.method1578(arg1, arg5, arg7, arg4, arg0, arg8, arg3, arg2, arg6);
		} else if (Static56.aClass2_Sub4_Sub2_1.method2088() > 2) {
			Static148.method2405(arg2, arg3, arg1, Static56.aClass2_Sub4_Sub2_1.method2088(), arg7, arg4, arg8, arg0, arg5, arg6);
		} else {
			Static236.method1276(arg6, arg5, arg7, arg4, arg0, arg2, arg1, arg8, arg3);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
	public static void method1267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static7.aClass89_1 = new Class89(arg1);
		Static192.aClass89_28 = new Class89(arg0);
	}
}
