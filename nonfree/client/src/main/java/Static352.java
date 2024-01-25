import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	public static int anInt5640 = -1;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
	public static final int anInt5642 = 0;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	public static int anInt5643 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static252.method3355(arg6)) {
			if (Static216.aClass95ArrayArray2[arg6] == null) {
				Static269.method3629(arg7, -1, arg3, arg1, arg5, arg0, Static294.aClass95ArrayArray3[arg6], arg2, arg4);
			} else {
				Static269.method3629(arg7, -1, arg3, arg1, arg5, arg0, Static216.aClass95ArrayArray2[arg6], arg2, arg4);
			}
		} else if (arg2 == -1) {
			for (@Pc(28) int local28 = 0; local28 < 100; local28++) {
				Static69.aBooleanArray2[local28] = true;
			}
		} else {
			Static69.aBooleanArray2[arg2] = true;
		}
	}
}
