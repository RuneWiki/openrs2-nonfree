import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!os", name = "x", descriptor = "Lclient!at;")
	public static Class16 aClass16_5;

	@OriginalMember(owner = "client!os", name = "H", descriptor = "I")
	public static int anInt1006;

	@OriginalMember(owner = "client!os", name = "L", descriptor = "Lclient!dk;")
	public static Class54 aClass54_21;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "Lclient!sp;")
	public static Class227 aClass227_2;

	@OriginalMember(owner = "client!os", name = "P", descriptor = "I")
	private static int anInt1010;

	@OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
	private static int anInt1011;

	@OriginalMember(owner = "client!os", name = "R", descriptor = "I")
	private static int anInt1012;

	@OriginalMember(owner = "client!os", name = "S", descriptor = "Z")
	private static boolean aBoolean88;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_35 = new Class102(0, 7);

	@OriginalMember(owner = "client!os", name = "d", descriptor = "I")
	public static int anInt979 = 0;

	@OriginalMember(owner = "client!os", name = "J", descriptor = "[I")
	public static final int[] anIntArray95 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!os", name = "K", descriptor = "I")
	public static int anInt1008 = 0;

	@OriginalMember(owner = "client!os", name = "providesignlink", descriptor = "(Lclient!or;)V")
	private static void method784(@OriginalArg(0) Class183 arg0) {
		Static79.aClass183_2 = arg0;
		Static425.aClass183_5 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIII)Z")
	public static boolean method788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static135.method1996(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static460.anInt7074;
		@Pc(14) int local14 = arg2 << Static460.anInt7074;
		@Pc(23) int local23 = Static345.aClass162Array3[arg0].ua(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static460.anInt7074 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static460.anInt7074 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static460.anInt7074 - 7);
		if (arg3 == 1) {
			if (local10 > Static375.anInt6251) {
				if (!Static387.method4966(local10, local23, local14)) {
					return false;
				}
				if (!Static387.method4966(local10, local23, local14 + Static179.anInt3078)) {
					return false;
				}
				if (!Static387.method4966(local10, local23, local14 + Static67.anInt1221)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static387.method4966(local10, local31, local14)) {
					return false;
				}
				if (!Static387.method4966(local10, local31, local14 + Static179.anInt3078)) {
					return false;
				}
				if (!Static387.method4966(local10, local31, local14 + Static67.anInt1221)) {
					return false;
				}
			}
			if (!Static387.method4966(local10, local39, local14)) {
				return false;
			} else if (Static387.method4966(local10, local39, local14 + Static179.anInt3078)) {
				return Static387.method4966(local10, local39, local14 + Static67.anInt1221);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static422.anInt6875) {
				if (!Static387.method4966(local10, local23, local14 + Static67.anInt1221)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static179.anInt3078, local23, local14 + Static67.anInt1221)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static67.anInt1221, local23, local14 + Static67.anInt1221)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static387.method4966(local10, local31, local14 + Static67.anInt1221)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static179.anInt3078, local31, local14 + Static67.anInt1221)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static67.anInt1221, local31, local14 + Static67.anInt1221)) {
					return false;
				}
			}
			if (!Static387.method4966(local10, local39, local14 + Static67.anInt1221)) {
				return false;
			} else if (Static387.method4966(local10 + Static179.anInt3078, local39, local14 + Static67.anInt1221)) {
				return Static387.method4966(local10 + Static67.anInt1221, local39, local14 + Static67.anInt1221);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static375.anInt6251) {
				if (!Static387.method4966(local10 + Static67.anInt1221, local23, local14)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static67.anInt1221, local23, local14 + Static179.anInt3078)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static67.anInt1221, local23, local14 + Static67.anInt1221)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static387.method4966(local10 + Static67.anInt1221, local31, local14)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static67.anInt1221, local31, local14 + Static179.anInt3078)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static67.anInt1221, local31, local14 + Static67.anInt1221)) {
					return false;
				}
			}
			if (!Static387.method4966(local10 + Static67.anInt1221, local39, local14)) {
				return false;
			} else if (Static387.method4966(local10 + Static67.anInt1221, local39, local14 + Static179.anInt3078)) {
				return Static387.method4966(local10 + Static67.anInt1221, local39, local14 + Static67.anInt1221);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static422.anInt6875) {
				if (!Static387.method4966(local10, local23, local14)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static179.anInt3078, local23, local14)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static67.anInt1221, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static387.method4966(local10, local31, local14)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static179.anInt3078, local31, local14)) {
					return false;
				}
				if (!Static387.method4966(local10 + Static67.anInt1221, local31, local14)) {
					return false;
				}
			}
			if (!Static387.method4966(local10, local39, local14)) {
				return false;
			} else if (Static387.method4966(local10 + Static179.anInt3078, local39, local14)) {
				return Static387.method4966(local10 + Static67.anInt1221, local39, local14);
			} else {
				return false;
			}
		} else if (!Static387.method4966(local10 + Static179.anInt3078, local47, local14 + Static179.anInt3078)) {
			return false;
		} else if (arg3 == 16) {
			return Static387.method4966(local10, local39, local14 + Static67.anInt1221);
		} else if (arg3 == 32) {
			return Static387.method4966(local10 + Static67.anInt1221, local39, local14 + Static67.anInt1221);
		} else if (arg3 == 64) {
			return Static387.method4966(local10 + Static67.anInt1221, local39, local14);
		} else if (arg3 == 128) {
			return Static387.method4966(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!tn;)V")
	public static void method794(@OriginalArg(0) Class3_Sub4 arg0) {
		for (@Pc(2) int local2 = arg0.aShort92; local2 <= arg0.aShort91; local2++) {
			for (@Pc(6) int local6 = arg0.aShort89; local6 <= arg0.aShort90; local6++) {
				@Pc(16) Class270 local16 = Static309.aClass270ArrayArrayArray3[arg0.aByte91][local2][local6];
				if (local16 != null) {
					@Pc(21) Class241 local21 = local16.aClass241_2;
					@Pc(23) Class241 local23 = null;
					while (local21 != null) {
						if (local21.aClass3_Sub4_2 == arg0) {
							if (local23 == null) {
								local16.aClass241_2 = local21.aClass241_1;
							} else {
								local23.aClass241_1 = local21.aClass241_1;
							}
							local21.method5079();
							break;
						}
						local23 = local21;
						local21 = local21.aClass241_1;
					}
					local16.aByte100 = 0;
					for (@Pc(56) Class241 local56 = local16.aClass241_2; local56 != null; local56 = local56.aClass241_1) {
						local16.aByte100 = (byte) (local16.aByte100 | local56.anInt6554);
					}
				}
			}
		}
	}
}
