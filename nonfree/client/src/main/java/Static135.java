import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "F")
	public static float aFloat64;

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "I")
	public static int anInt3010;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method2644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static508.method7071(arg6)) {
			if (Static131.aClass292ArrayArray2[arg6] == null) {
				Static15.method325(-1, arg4, arg3, arg5, Static14.aClass292ArrayArray1[arg6], arg1, arg2, arg0, arg7);
			} else {
				Static15.method325(-1, arg4, arg3, arg5, Static131.aClass292ArrayArray2[arg6], arg1, arg2, arg0, arg7);
			}
		} else if (arg3 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static31.aBooleanArray17[local20] = true;
			}
		} else {
			Static31.aBooleanArray17[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BJ)V")
	public static void method2645(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}
}
