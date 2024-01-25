import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!so", name = "d", descriptor = "F")
	public static float aFloat182;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "Lclient!dj;")
	public static Class71 aClass71_5;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_78 = new Class77(55, -1);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)B")
	public static byte method6859(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method6860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static369.anIntArrayArrayArray7[arg0][local16][local20] == -Static69.anInt9137) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static193.anInt4311) + 1;
			@Pc(142) int local142 = (arg3 << Static193.anInt4311) + 2;
			@Pc(151) int local151 = Static51.aClass215Array6[arg0].ba(arg1, arg3) + arg5;
			if (!Static502.method7462(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static193.anInt4311) - 1;
			if (!Static502.method7462(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static193.anInt4311) - 1;
			if (!Static502.method7462(local20, local151, local177)) {
				return false;
			} else if (Static502.method7462(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static214.method3975(arg0, arg1, arg3)) {
			local16 = arg1 << Static193.anInt4311;
			local20 = arg3 << Static193.anInt4311;
			return Static502.method7462(local16 + 1, Static51.aClass215Array6[arg0].ba(arg1, arg3) + arg5, local20 + 1) && Static502.method7462(local16 + Static316.anInt6040 - 1, Static51.aClass215Array6[arg0].ba(arg1 + 1, arg3) + arg5, local20 + 1) && Static502.method7462(local16 + Static316.anInt6040 - 1, Static51.aClass215Array6[arg0].ba(arg1 + 1, arg3 + 1) + arg5, local20 + Static316.anInt6040 - 1) && Static502.method7462(local16 + 1, Static51.aClass215Array6[arg0].ba(arg1, arg3 + 1) + arg5, local20 + Static316.anInt6040 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)V")
	public static void method6861(@OriginalArg(0) int arg0) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(2, arg0);
		local8.method823();
	}
}
