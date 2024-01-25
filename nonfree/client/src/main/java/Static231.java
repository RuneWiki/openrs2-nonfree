import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
	public static int anInt4228;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "Z")
	public static boolean aBoolean315 = false;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_135 = new Class186(13, -2);

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "[I")
	public static final int[] anIntArray341 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
	public static int anInt4229 = 0;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static413.method5427(arg5)) {
			if (Static70.aClass126ArrayArray4[arg5] == null) {
				Static233.method3220(arg0, arg6, arg3, -1, arg7, Static320.aClass126ArrayArray2[arg5], arg4, arg2, arg1);
			} else {
				Static233.method3220(arg0, arg6, arg3, -1, arg7, Static70.aClass126ArrayArray4[arg5], arg4, arg2, arg1);
			}
		} else if (arg4 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static26.aBooleanArray2[local15] = true;
			}
		} else {
			Static26.aBooleanArray2[arg4] = true;
		}
	}
}
