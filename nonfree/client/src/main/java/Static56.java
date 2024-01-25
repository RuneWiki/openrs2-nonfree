import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "Lclient!vj;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
	public static int anInt1345 = 0;

	@OriginalMember(owner = "client!dl", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString47 = "Take";

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public static void method1103() {
		Static61.anInt1413 = 0;
		Static58.aClass14_4.method305();
		Static308.aBoolean499 = false;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
	public static void method1104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static282.anInt3502 = arg0 - Static150.anInt2643;
		Static288.anInt5766 = arg1 - Static150.anInt2638;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!mp;IIII)V")
	public static void method1107(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static345.method5771(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static97.anInt1852) {
			Static345.method5771(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static345.method5771(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static3.anInt38) {
			Static345.method5771(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static3.anInt38) {
			Static345.method5771(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static97.anInt1852 && arg4 <= Static3.anInt38) {
			Static345.method5771(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static345.method5771(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static97.anInt1852 && arg4 > 0) {
			Static345.method5771(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
