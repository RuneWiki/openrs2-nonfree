import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	public static int anInt4709;

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
	public static int anInt4710 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static330.anIntArrayArrayArray15[arg0][local16][local20] == -Static389.anInt6446) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static187.anInt3390) + 1;
			@Pc(142) int local142 = (arg3 << Static187.anInt3390) + 2;
			@Pc(151) int local151 = Static337.aClass7Array3[arg0].method5648(arg1, arg3) + arg5;
			if (!Static79.method1320(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static187.anInt3390) - 1;
			if (!Static79.method1320(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static187.anInt3390) - 1;
			if (!Static79.method1320(local20, local151, local177)) {
				return false;
			} else if (Static79.method1320(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static364.method5430(arg0, arg1, arg3)) {
			local16 = arg1 << Static187.anInt3390;
			local20 = arg3 << Static187.anInt3390;
			return Static79.method1320(local16 + 1, Static337.aClass7Array3[arg0].method5648(arg1, arg3) + arg5, local20 + 1) && Static79.method1320(local16 + Static258.anInt4653 - 1, Static337.aClass7Array3[arg0].method5648(arg1 + 1, arg3) + arg5, local20 + 1) && Static79.method1320(local16 + Static258.anInt4653 - 1, Static337.aClass7Array3[arg0].method5648(arg1 + 1, arg3 + 1) + arg5, local20 + Static258.anInt4653 - 1) && Static79.method1320(local16 + 1, Static337.aClass7Array3[arg0].method5648(arg1, arg3 + 1) + arg5, local20 + Static258.anInt4653 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public static void method4234() {
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			Static8.aBooleanArray148[local18] = false;
		}
		Static81.anInt1661 = 0;
		Static302.anInt5239 = -1;
		Static200.anInt3586 = 0;
		Static254.anInt1042 = -1;
		Static88.anInt1815 = 1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)Z")
	public static boolean method4236(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static347.aClass155_9.method4898();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static347.aClass155_9.method4948();
		} else if (!Static347.aClass155_9.method4947()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static164.aClass154_Sub1_1.aBoolean472 = arg0;
			Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
			return true;
		}
	}
}
