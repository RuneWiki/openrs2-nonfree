import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "Lclient!fs;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "Lclient!un;")
	public static Class242 aClass242_1;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "Z")
	public static boolean aBoolean15 = false;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static162.anIntArrayArrayArray13[arg0][local16][local20] == -Static143.anInt2891) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static231.anInt4434) + 1;
			@Pc(142) int local142 = (arg3 << Static231.anInt4434) + 2;
			@Pc(151) int local151 = Static417.aClass65Array4[arg0].l(arg1, arg3) + arg5;
			if (!Static299.method4088(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static231.anInt4434) - 1;
			if (!Static299.method4088(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static231.anInt4434) - 1;
			if (!Static299.method4088(local20, local151, local177)) {
				return false;
			} else if (Static299.method4088(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static112.method2030(arg0, arg1, arg3)) {
			local16 = arg1 << Static231.anInt4434;
			local20 = arg3 << Static231.anInt4434;
			return Static299.method4088(local16 + 1, Static417.aClass65Array4[arg0].l(arg1, arg3) + arg5, local20 + 1) && Static299.method4088(local16 + Static4.anInt5935 - 1, Static417.aClass65Array4[arg0].l(arg1 + 1, arg3) + arg5, local20 + 1) && Static299.method4088(local16 + Static4.anInt5935 - 1, Static417.aClass65Array4[arg0].l(arg1 + 1, arg3 + 1) + arg5, local20 + Static4.anInt5935 - 1) && Static299.method4088(local16 + 1, Static417.aClass65Array4[arg0].l(arg1, arg3 + 1) + arg5, local20 + Static4.anInt5935 - 1);
		} else {
			return false;
		}
	}
}
