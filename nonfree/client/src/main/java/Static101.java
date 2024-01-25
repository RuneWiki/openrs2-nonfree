import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "Z")
	public static boolean aBoolean612;

	@OriginalMember(owner = "client!eba", name = "j", descriptor = "I")
	public static int anInt8474 = 0;

	@OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
	public static int anInt8477 = 2;

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "Z")
	public static boolean aBoolean613 = false;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method7084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		if (arg1 < 128 || arg5 < 128 || arg1 > Static363.anInt1158 * 128 - 256 || (Static511.anInt8889 - 2) * 128 < arg5) {
			Static429.anIntArray610[0] = Static429.anIntArray610[1] = -1;
			return;
		}
		@Pc(44) int local44 = Static200.method3233(arg4, arg1, arg5) - arg0;
		Static338.aClass181_13.TA(arg6, 0, 0);
		Static103.aClass39_3.method6015(Static338.aClass181_13);
		Static103.aClass39_3.IA(arg1, local44, arg5, Static429.anIntArray610);
		Static338.aClass181_13.TA(-arg6, 0, 0);
		Static103.aClass39_3.method6015(Static338.aClass181_13);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7090(@OriginalArg(1) String arg0) {
		if (Static482.aString187.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Static482.aString187.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Static482.aString187.startsWith("mac")) {
			return "lib" + arg0 + ".jnilib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(IBI)V")
	public static void method7093(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class142 local9 = Static355.aClass142ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static88.anInt1772 = local9.anInt3961;
			Static188.anInt91 = local9.anInt3967;
			Static67.anInt1355 = local9.anInt3963;
		}
		Static510.method7460();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IB)Z")
	public static boolean method7094(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)I")
	public static int method7096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static130.anIntArray762[arg1 & 0x3] : Static524.anIntArray699[arg1 & 0x3];
	}
}
