import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "Z")
	public static boolean aBoolean658 = false;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)B")
	public static byte method7061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BII)V")
	public static void method7065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static110.aClass42_2 == Static101.aClass42_1) {
			if (!Static590.method7873(arg1, false, 0, -2, arg0, 0, 1, 1)) {
				Static590.method7873(arg1, false, 0, -3, arg0, 0, 1, 1);
			}
		} else if (!Static590.method7873(arg1, false, 0, -3, arg0, 0, 1, 1)) {
			Static590.method7873(arg1, false, 0, -2, arg0, 0, 1, 1);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BIIII)V")
	public static void method7066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		if (arg2 < arg1) {
			for (local19 = arg2; local19 < arg1; local19++) {
				Static280.anIntArrayArray25[local19][arg3] = arg0;
			}
		} else {
			for (local19 = arg1; local19 < arg2; local19++) {
				Static280.anIntArrayArray25[local19][arg3] = arg0;
			}
		}
	}
}
