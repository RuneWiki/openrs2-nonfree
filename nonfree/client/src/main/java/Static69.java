import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
	public static int anInt1146;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
	public static int anInt1154;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public static int anInt1151 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method889(@OriginalArg(0) String arg0) {
		return Static345.method5200(ai.class, arg0);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIII)V")
	public static void method891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 - arg5 >= Static235.anInt3970 && arg5 + arg3 <= Static151.anInt2683 && arg4 - arg5 >= Static134.anInt2364 && Static60.anInt971 >= arg4 + arg5) {
			Static25.method396(arg0, arg3, arg1, arg4, arg5, arg2);
		} else {
			Static474.method6613(arg0, arg4, arg5, arg3, arg2, arg1);
		}
	}
}
