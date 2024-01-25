import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Lclient!pj;")
	public static Class248 aClass248_4;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	public static int anInt431;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "I")
	public static int anInt427 = -1;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Lclient!su;")
	public static Class298 aClass298_14 = new Class298();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z")
	public static boolean method349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!mh;IIII)V")
	public static void method350(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static535.method7283(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static547.anInt9363) {
			Static535.method7283(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static535.method7283(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static20.anInt358) {
			Static535.method7283(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static20.anInt358) {
			Static535.method7283(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static547.anInt9363 && arg4 <= Static20.anInt358) {
			Static535.method7283(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static535.method7283(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static547.anInt9363 && arg4 > 0) {
			Static535.method7283(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
