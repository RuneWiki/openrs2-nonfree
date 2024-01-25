import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "Lclient!qa;")
	public static Class109 aClass109_9;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
	public static int anInt4844 = 0;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)Z")
	public static boolean method3929() {
		return Static82.anInt1627 > 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!vq;Lclient!vq;IZZ)I")
	public static int method3930(@OriginalArg(0) Class196_Sub1 arg0, @OriginalArg(1) Class196_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local9 = arg1.anInt7418;
			local12 = arg0.anInt7418;
			if (!arg3) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static180.method2774(Static167.anInt3118, arg0.method5758().aString2, arg1.method5758().aString2);
		} else if (arg2 == 3) {
			if (arg1.aString63.equals("-")) {
				if (arg0.aString63.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString63.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static180.method2774(Static167.anInt3118, arg0.aString63, arg1.aString63);
			}
		} else if (arg2 == 4) {
			if (arg1.method5751()) {
				return arg0.method5751() ? 0 : 1;
			} else if (arg0.method5751()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg1.method5754()) {
				return arg0.method5754() ? 0 : 1;
			} else if (arg0.method5754()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg1.method5750()) {
				return arg0.method5750() ? 0 : 1;
			} else if (arg0.method5750()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg1.method5752()) {
				return arg0.method5752() ? 0 : 1;
			} else if (arg0.method5752()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local9 = arg1.anInt7429;
			local12 = arg0.anInt7429;
			if (arg3) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local9 == -1) {
					local9 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg1.anInt7431 - arg0.anInt7431;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!bt;)V")
	public static void method3931(@OriginalArg(0) Class26_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort93; local2 <= arg0.aShort92; local2++) {
			for (@Pc(6) int local6 = arg0.aShort94; local6 <= arg0.aShort95; local6++) {
				@Pc(16) Class211 local16 = Static268.aClass211ArrayArrayArray4[arg0.aByte95][local2][local6];
				if (local16 != null) {
					@Pc(21) Class125 local21 = local16.aClass125_3;
					@Pc(23) Class125 local23 = null;
					while (local21 != null) {
						if (local21.aClass26_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass125_3 = local21.aClass125_1;
							} else {
								local23.aClass125_1 = local21.aClass125_1;
							}
							local21.method2893();
							break;
						}
						local23 = local21;
						local21 = local21.aClass125_1;
					}
					local16.aByte74 = 0;
					for (@Pc(56) Class125 local56 = local16.aClass125_3; local56 != null; local56 = local56.aClass125_1) {
						local16.aByte74 = (byte) (local16.aByte74 | local56.anInt3453);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z")
	public static boolean method3932(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V")
	public static void method3934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class33 local14 = Static150.aClass33ArrayArray1[arg1][arg0];
		if (local14 != null) {
			Static340.anInt5934 = local14.anInt734;
			Static54.anInt1111 = local14.anInt739;
			Static40.anInt740 = local14.anInt736;
		}
		Static211.method3225();
	}
}
