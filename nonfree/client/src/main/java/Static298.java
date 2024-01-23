import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!wm", name = "S", descriptor = "Lclient!sm;")
	public static Class158 aClass158_4;

	@OriginalMember(owner = "client!wm", name = "Z", descriptor = "I")
	public static int anInt5541;

	@OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
	public static int anInt5528 = 0;

	@OriginalMember(owner = "client!wm", name = "R", descriptor = "Z")
	public static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!wm", name = "W", descriptor = "Z")
	public static boolean aBoolean357 = true;

	@OriginalMember(owner = "client!wm", name = "X", descriptor = "I")
	public static int anInt5539 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static222.method3559(arg5)) {
			Static152.method2436(arg1, arg3, arg0, -1, arg4, arg6, arg2, Static148.aClass22ArrayArray1[arg5], arg7);
		} else if (arg2 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static222.aBooleanArray20[local20] = true;
			}
		} else {
			Static222.aBooleanArray20[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)V")
	public static void method4388() {
		aClass158_4 = null;
	}
}
