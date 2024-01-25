import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static481 {

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "S")
	public static short aShort103 = 256;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
	public static int anInt8517 = 0;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)Z")
	public static boolean method7100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static406.method6372(arg1, arg0) & Static238.method4327(arg1, arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIBIIII)V")
	public static void method7101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static309.anInt6227 <= arg3 && Static7.anInt464 >= arg1 && arg4 >= Static633.anInt10644 && Static389.anInt7300 >= arg5) {
			if (arg2 == 1) {
				Static35.method820(arg4, arg5, arg1, arg3, arg0);
			} else {
				Static284.method4958(arg4, arg1, arg2, arg0, arg5, arg3);
			}
		} else if (arg2 == 1) {
			Static506.method7276(arg5, arg3, arg4, arg1, arg0);
		} else {
			Static328.method5505(arg3, arg0, arg4, arg2, arg1, arg5);
		}
	}
}
