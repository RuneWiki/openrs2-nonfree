import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method3472(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static96.method1640(arg0.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIIIZII)V")
	public static void method3474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static300.method4909(arg6)) {
			Static51.method784(Static272.aClass3ArrayArray1[arg6], -1, arg2, arg7, arg5, arg3, arg0, arg4, arg1, arg8);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZI)I")
	public static int method3476(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local10 += 16;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local10++;
			arg0 >>>= 0x1;
		}
		return local10 + arg0;
	}
}
