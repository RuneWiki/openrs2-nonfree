import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
	public static int anInt1357;

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "Lclient!tg;")
	public static Class81 aClass81_470 = Static120.method2057(" loggt sich aus)3");

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
	public static int anInt1352 = 0;

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "Lclient!tg;")
	public static Class81 aClass81_471 = Static120.method2057(":clan:");

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
	public static int anInt1355 = 0;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
	public static void method1006() {
		Static96.aClass59_17.method1967();
		Static98.aClass59_18.method1967();
		Static156.aClass59_25.method1967();
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
	public static void method1007() {
		aClass81_470 = null;
		aClass81_471 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static144.method2427(arg3)) {
			Static168.aClass77Array2 = null;
			Static183.method3127(Static131.aClass77ArrayArray1[arg3], arg0, arg6, arg7, arg1, arg2, -1, arg4, arg5);
			if (Static168.aClass77Array2 != null) {
				Static183.method3127(Static168.aClass77Array2, arg0, arg6, arg7, arg1, Static11.anInt650, -1412584499, Static104.anInt2269, arg5);
				Static168.aClass77Array2 = null;
			}
		} else if (arg1 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static87.aBooleanArray11[local20] = true;
			}
		} else {
			Static87.aBooleanArray11[arg1] = true;
		}
	}
}
