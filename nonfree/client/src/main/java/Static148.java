import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	public static int anInt3051;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!uq;")
	public static Class202 aClass202_4;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!ke;")
	public static final Class122 aClass122_4 = new Class122();

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	public static int anInt3053 = 0;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString111 = "Choose Option";

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public static void method2609() {
		Static303.aClass37_101.method914();
		Static123.aClass37_81.method914();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)V")
	public static void method2610(@OriginalArg(0) int arg0) {
		Static128.aClass37_56 = new Class37(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static200.anIntArrayArrayArray10[arg0][local16][local20] == -Static77.anInt1573) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static263.aClass12Array2[arg0].method2704(arg1, arg3) + arg5;
			if (!Static62.method5782(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static62.method5782(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static62.method5782(local20, local151, local177)) {
				return false;
			} else if (Static62.method5782(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static235.method5310(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static62.method5782(local16 + 1, Static263.aClass12Array2[arg0].method2704(arg1, arg3) + arg5, local20 + 1) && Static62.method5782(local16 + 128 - 1, Static263.aClass12Array2[arg0].method2704(arg1 + 1, arg3) + arg5, local20 + 1) && Static62.method5782(local16 + 128 - 1, Static263.aClass12Array2[arg0].method2704(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static62.method5782(local16 + 1, Static263.aClass12Array2[arg0].method2704(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!lm;IIIIZI)V")
	public static void method2613(@OriginalArg(0) Class134 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static93.aBoolean127 = false;
		Static9.aClass134_3 = arg0;
		Static204.anInt6779 = arg2;
		Static49.anInt5279 = 1;
		Static348.anInt6160 = 2;
		Static204.anInt6780 = arg1;
		Static78.anInt1582 = 0;
	}
}
