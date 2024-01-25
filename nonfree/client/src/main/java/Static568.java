import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!uu;")
	public static Class239 aClass239_8;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
	public static boolean method8029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(III)I")
	public static int method8030(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(40) int local40 = (arg0 & 0x7F) * 96 >> 7;
			if (local40 < 2) {
				local40 = 2;
			} else if (local40 > 126) {
				local40 = 126;
			}
			return local40 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIBIIIIIII)V")
	public static void method8031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static27.method666(arg7)) {
			return;
		}
		if (Static285.aClass260ArrayArray4[arg7] == null) {
			Static79.method1519(Static489.aClass260ArrayArray3[arg7], -1, arg5, arg2, arg3, arg8, arg0, arg9, arg4, arg1, arg6, arg10);
		} else {
			Static79.method1519(Static285.aClass260ArrayArray4[arg7], -1, arg5, arg2, arg3, arg8, arg0, arg9, arg4, arg1, arg6, arg10);
		}
	}
}
