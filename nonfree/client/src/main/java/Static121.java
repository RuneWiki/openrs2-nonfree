import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "Lclient!ib;")
	public static Class148 aClass148_1;

	@OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
	public static int anInt2449 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method2073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static300.method4703(arg6)) {
			if (Static440.aClass365ArrayArray4[arg6] == null) {
				Static66.method1434(arg5, arg1, arg0, arg2, -1, arg3, Static249.aClass365ArrayArray3[arg6], arg7, arg4);
			} else {
				Static66.method1434(arg5, arg1, arg0, arg2, -1, arg3, Static440.aClass365ArrayArray4[arg6], arg7, arg4);
			}
		} else if (arg4 == -1) {
			for (@Pc(23) int local23 = 0; local23 < 100; local23++) {
				Static510.aBooleanArray29[local23] = true;
			}
		} else {
			Static510.aBooleanArray29[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([BB)[B")
	public static byte[] method2075(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static600.method3768(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
