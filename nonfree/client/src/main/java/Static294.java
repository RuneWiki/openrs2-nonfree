import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt5493 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method4703() {
		Static306.method4837(false);
		if (Static502.anInt8502 >= 0 && Static502.anInt8502 != 0) {
			Static390.method4905(Static502.anInt8502);
			Static502.anInt8502 = -1;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static87.anIntArrayArrayArray1[arg0][local16][local20] == -Static463.anInt7846) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static451.anInt7905) + 1;
			@Pc(142) int local142 = (arg3 << Static451.anInt7905) + 2;
			@Pc(151) int local151 = Static544.aClass205Array3[arg0].ba(arg1, arg3) + arg5;
			if (!Static393.method5943(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static451.anInt7905) - 1;
			if (!Static393.method5943(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static451.anInt7905) - 1;
			if (!Static393.method5943(local20, local151, local177)) {
				return false;
			} else if (Static393.method5943(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static184.method6133(arg0, arg1, arg3)) {
			local16 = arg1 << Static451.anInt7905;
			local20 = arg3 << Static451.anInt7905;
			return Static393.method5943(local16 + 1, Static544.aClass205Array3[arg0].ba(arg1, arg3) + arg5, local20 + 1) && Static393.method5943(local16 + Static201.anInt3950 - 1, Static544.aClass205Array3[arg0].ba(arg1 + 1, arg3) + arg5, local20 + 1) && Static393.method5943(local16 + Static201.anInt3950 - 1, Static544.aClass205Array3[arg0].ba(arg1 + 1, arg3 + 1) + arg5, local20 + Static201.anInt3950 - 1) && Static393.method5943(local16 + 1, Static544.aClass205Array3[arg0].ba(arg1, arg3 + 1) + arg5, local20 + Static201.anInt3950 - 1);
		} else {
			return false;
		}
	}
}
