import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static496 {

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "Lclient!oh;")
	public static Class237 aClass237_121;

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
	public static int anInt8768;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)Z")
	public static boolean method7231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static343.method5469(arg0, arg1) || Static416.method6524(arg1, arg0);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIBIIII)V")
	public static void method7234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static251.anInt9634 <= arg1 && Static366.anInt6946 >= arg0 && arg5 >= Static444.anInt8258 && arg3 <= Static188.anInt4410) {
			if (arg2 == 1) {
				Static534.method7516(arg0, arg5, arg1, arg3, arg4);
			} else {
				Static236.method4338(arg3, arg0, arg1, arg5, arg4, arg2);
			}
		} else if (arg2 == 1) {
			Static512.method7374(arg0, arg1, arg4, arg3, arg5);
		} else {
			Static459.method6944(arg0, arg4, arg2, arg5, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;ZILjava/lang/String;)V")
	public static void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) String arg3) {
		Static281.method4758(-1, arg1, arg0, true, arg3, arg2);
	}
}
