import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!xa;")
	public static Class4 aClass4_33;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!rq;)V")
	public static void method6879(@OriginalArg(0) int arg0, @OriginalArg(2) Class29_Sub2_Sub1 arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (arg1.anInt8507 > Static358.anInt6263) {
			Static72.method950(arg1);
		} else if (arg1.anInt8567 >= Static358.anInt6263) {
			Static577.method5077(arg1);
		} else {
			Static96.method1501(false, arg1);
			local12 = Static149.anInt2647;
			local14 = Static44.anInt717;
		}
		if (arg1.anInt9222 < 512 || arg1.anInt9218 < 512 || arg1.anInt9222 >= Static301.anInt4912 * 512 - 512 || arg1.anInt9218 >= Static473.anInt7969 * 512 - 512) {
			local14 = 0;
			arg1.anInt8507 = 0;
			arg1.anInt8525 = -1;
			local12 = -1;
			arg1.anInt8567 = 0;
			arg1.anInt8534 = -1;
			arg1.anInt8538 = -1;
			arg1.anInt9222 = arg1.anIntArray661[0] * 512 + arg1.method7008() * 256;
			arg1.anInt9218 = arg1.anIntArray660[0] * 512 + arg1.method7008() * 256;
			arg1.method6996();
		}
		if (Static426.aClass29_Sub2_Sub1_Sub2_2 == arg1 && (arg1.anInt9222 < 6144 || arg1.anInt9218 < 6144 || (Static301.anInt4912 - 12) * 512 <= arg1.anInt9222 || arg1.anInt9218 >= (Static473.anInt7969 - 12) * 512)) {
			arg1.anInt8534 = -1;
			local12 = -1;
			local14 = 0;
			arg1.anInt8525 = -1;
			arg1.anInt8507 = 0;
			arg1.anInt8567 = 0;
			arg1.anInt8538 = -1;
			arg1.anInt9222 = arg1.anIntArray661[0] * 512 + arg1.method7008() * 256;
			arg1.anInt9218 = arg1.anIntArray660[0] * 512 + arg1.method7008() * 256;
			arg1.method6996();
		}
		@Pc(209) int local209 = Static241.method3496(arg1);
		Static484.method6712(local209, local12, local14, arg1);
		Static522.method7344(arg1);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!dga;I)Lclient!ns;")
	public static Class38_Sub4 method6880(@OriginalArg(0) Class6_Sub14 arg0) {
		return new Class38_Sub4(arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method6008(), arg0.method5988(), arg0.method5988(), arg0.method6041());
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static448.anIntArrayArrayArray18[arg0][local16][local20] == -Static216.anInt3692) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static188.anInt3275) + 1;
			@Pc(142) int local142 = (arg3 << Static188.anInt3275) + 2;
			@Pc(151) int local151 = Static285.aClass60Array8[arg0].JA(arg1, arg3) + arg5;
			if (!Static236.method3450(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static188.anInt3275) - 1;
			if (!Static236.method3450(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static188.anInt3275) - 1;
			if (!Static236.method3450(local20, local151, local177)) {
				return false;
			} else if (Static236.method3450(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static98.method1512(arg0, arg1, arg3)) {
			local16 = arg1 << Static188.anInt3275;
			local20 = arg3 << Static188.anInt3275;
			return Static236.method3450(local16 + 1, Static285.aClass60Array8[arg0].JA(arg1, arg3) + arg5, local20 + 1) && Static236.method3450(local16 + Static57.anInt953 - 1, Static285.aClass60Array8[arg0].JA(arg1 + 1, arg3) + arg5, local20 + 1) && Static236.method3450(local16 + Static57.anInt953 - 1, Static285.aClass60Array8[arg0].JA(arg1 + 1, arg3 + 1) + arg5, local20 + Static57.anInt953 - 1) && Static236.method3450(local16 + 1, Static285.aClass60Array8[arg0].JA(arg1, arg3 + 1) + arg5, local20 + Static57.anInt953 - 1);
		} else {
			return false;
		}
	}
}
