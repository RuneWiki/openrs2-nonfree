import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static184 {

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!kr;")
	public static final Class195 aClass195_1 = new Class195("runescape", 0);

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Z")
	public static boolean aBoolean243 = false;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_28 = new Class70(49, 3);

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "J")
	public static final long aLong107 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
	public static int anInt3252 = 0;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
	public static int anInt3253 = -1;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V")
	public static void method2585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static270.anInt4759 <= arg0 && arg2 <= Static162.anInt2935 && arg4 >= Static514.anInt8722 && arg5 <= Static451.anInt7775) {
			if (arg1 == 1) {
				Static378.method5055(arg5, arg3, arg4, arg0, arg2);
			} else {
				Static99.method4651(arg5, arg3, arg0, arg4, arg1, arg2);
			}
		} else if (arg1 == 1) {
			Static539.method7370(arg4, arg0, arg2, arg3, arg5);
		} else {
			Static414.method5700(arg4, arg1, arg5, arg0, arg3, arg2);
		}
	}
}
