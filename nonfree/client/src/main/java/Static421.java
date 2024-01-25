import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!uv", name = "h", descriptor = "Lclient!mr;")
	public static Class174 aClass174_2;

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "[I")
	public static int[] anIntArray582;

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
	public static void method5769() {
		for (@Pc(12) Class2_Sub42 local12 = (Class2_Sub42) Static465.aClass181_49.method3972(); local12 != null; local12 = (Class2_Sub42) Static465.aClass181_49.method3975()) {
			if (local12.anInt7067 == -1) {
				local12.anInt7069 = 0;
				if (local12.anInt7064 >= 0 && local12.anInt7066 >= 0 && local12.anInt7064 < Static234.anInt3949 && Static371.anInt6492 > local12.anInt7066) {
					Static437.method5905(local12);
				}
			} else {
				local12.method6260();
			}
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILclient!za;IIII)Lclient!e;")
	public static Class63 method5770(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(24) Class63 local24 = (Class63) Static170.aClass188_31.method4158(local6);
		if (local24 == null) {
			@Pc(34) Class76 local34 = Static378.method5924(Static323.aClass171_70, arg3);
			if (local34 == null) {
				return null;
			}
			if (local34.anInt1809 < 13) {
				local34.method1775();
			}
			local24 = arg1.method6016(local34, 2055, Static288.anInt5154, 64, 768);
			Static170.aClass188_31.method4155(local6, local24);
		}
		local24 = local24.method6296((byte) 2, 2055, true);
		if (arg2 != 0) {
			local24.ma(arg2);
		}
		if (arg4 != 0) {
			local24.W(arg4);
		}
		if (arg0 != 0) {
			local24.K(arg0);
		}
		if (arg5 != 0) {
			local24.a(0, arg5, 0);
		}
		return local24;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method5771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static59.anIntArrayArrayArray16[arg0][local16][local20] == -Static455.anInt7589) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static146.anInt2674) + 1;
			@Pc(142) int local142 = (arg3 << Static146.anInt2674) + 2;
			@Pc(151) int local151 = Static241.aClass22Array3[arg0].ua(arg1, arg3) + arg5;
			if (!Static238.method3232(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static146.anInt2674) - 1;
			if (!Static238.method3232(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static146.anInt2674) - 1;
			if (!Static238.method3232(local20, local151, local177)) {
				return false;
			} else if (Static238.method3232(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static50.method775(arg0, arg1, arg3)) {
			local16 = arg1 << Static146.anInt2674;
			local20 = arg3 << Static146.anInt2674;
			return Static238.method3232(local16 + 1, Static241.aClass22Array3[arg0].ua(arg1, arg3) + arg5, local20 + 1) && Static238.method3232(local16 + Static327.anInt5862 - 1, Static241.aClass22Array3[arg0].ua(arg1 + 1, arg3) + arg5, local20 + 1) && Static238.method3232(local16 + Static327.anInt5862 - 1, Static241.aClass22Array3[arg0].ua(arg1 + 1, arg3 + 1) + arg5, local20 + Static327.anInt5862 - 1) && Static238.method3232(local16 + 1, Static241.aClass22Array3[arg0].ua(arg1, arg3 + 1) + arg5, local20 + Static327.anInt5862 - 1);
		} else {
			return false;
		}
	}
}
