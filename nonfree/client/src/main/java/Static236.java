import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII)V")
	public static void method4579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static248.aClass145_2 == Static96.aClass145_1) {
			if (!Static52.method875(arg1, 1, 1, false, 0, 0, -2, arg0)) {
				Static52.method875(arg1, 1, 1, false, 0, 0, -3, arg0);
			}
		} else if (!Static52.method875(arg1, 1, 1, false, 0, 0, -3, arg0)) {
			Static52.method875(arg1, 1, 1, false, 0, 0, -2, arg0);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V")
	public static void method4583() {
		Static3.aClass80_1 = null;
		Static378.aClass80_18 = null;
		Static227.aClass80_10 = null;
		Static29.aClass80_2 = null;
		Static211.aClass80_9 = null;
		Static320.aClass80_13 = null;
		Static110.aClass80_6 = null;
		Static427.aClass80_20 = null;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIIBI)V")
	public static void method4584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static83.anInt7380 <= arg1 && arg3 <= Static221.anInt4001 && Static305.anInt5429 <= arg2 && Static212.anInt452 >= arg4) {
			if (arg5 == 1) {
				Static87.method1460(arg0, arg1, arg3, arg2, arg4);
			} else {
				Static56.method5518(arg2, arg3, arg1, arg4, arg0, arg5);
			}
		} else if (arg5 == 1) {
			Static433.method5781(arg1, arg0, arg3, arg4, arg2);
		} else {
			Static148.method2225(arg0, arg4, arg5, arg3, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBI)I")
	public static int method4585(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 >>> 31;
		return (local18 + arg1) / arg0 - local18;
	}
}
