import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_52 = new Class218(110, -2);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)V")
	public static void method3818(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static141.aString29 = arg0;
		Static346.aBoolean583 = arg1;
		Static562.aString109 = arg2;
		if (!Static346.aBoolean583 && (Static141.aString29.equals("") || Static562.aString109.equals(""))) {
			Static142.method3164(3);
			return;
		}
		if (Static331.anInt6610 != 1) {
			Static390.anInt7399 = 0;
			Static126.anInt3178 = -1;
		}
		Static123.aBoolean245 = false;
		Static142.method3164(-3);
		Static621.anInt10311 = 1;
		Static186.anInt4404 = 0;
		Static144.anInt3605 = 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BIIIIIIII)Z")
	public static boolean method3820(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 + arg0 > arg1 && arg3 + arg1 > arg4) {
			return arg7 < arg5 + arg2 && arg6 + arg7 > arg5;
		} else {
			return false;
		}
	}
}
