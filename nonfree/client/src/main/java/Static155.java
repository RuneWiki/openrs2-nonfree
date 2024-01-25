import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!hi", name = "Ib", descriptor = "Z")
	public static boolean aBoolean247;

	@OriginalMember(owner = "client!hi", name = "Eb", descriptor = "Lclient!mt;")
	public static final Class165 aClass165_5 = new Class165(11, 0, 1, 2);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)Z")
	public static boolean method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static292.method3894(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static41.anInt612;
		@Pc(14) int local14 = arg2 << Static41.anInt612;
		@Pc(23) int local23 = Static452.aClass139Array3[arg0].ua(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static41.anInt612 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static41.anInt612 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static41.anInt612 - 7);
		if (arg3 == 1) {
			if (local10 > Static188.anInt3434) {
				if (!Static207.method3007(local10, local23, local14)) {
					return false;
				}
				if (!Static207.method3007(local10, local23, local14 + Static324.anInt5325)) {
					return false;
				}
				if (!Static207.method3007(local10, local23, local14 + Static383.anInt6136)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static207.method3007(local10, local31, local14)) {
					return false;
				}
				if (!Static207.method3007(local10, local31, local14 + Static324.anInt5325)) {
					return false;
				}
				if (!Static207.method3007(local10, local31, local14 + Static383.anInt6136)) {
					return false;
				}
			}
			if (!Static207.method3007(local10, local39, local14)) {
				return false;
			} else if (Static207.method3007(local10, local39, local14 + Static324.anInt5325)) {
				return Static207.method3007(local10, local39, local14 + Static383.anInt6136);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static197.anInt3614) {
				if (!Static207.method3007(local10, local23, local14 + Static383.anInt6136)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static324.anInt5325, local23, local14 + Static383.anInt6136)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static383.anInt6136, local23, local14 + Static383.anInt6136)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static207.method3007(local10, local31, local14 + Static383.anInt6136)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static324.anInt5325, local31, local14 + Static383.anInt6136)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static383.anInt6136, local31, local14 + Static383.anInt6136)) {
					return false;
				}
			}
			if (!Static207.method3007(local10, local39, local14 + Static383.anInt6136)) {
				return false;
			} else if (Static207.method3007(local10 + Static324.anInt5325, local39, local14 + Static383.anInt6136)) {
				return Static207.method3007(local10 + Static383.anInt6136, local39, local14 + Static383.anInt6136);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static188.anInt3434) {
				if (!Static207.method3007(local10 + Static383.anInt6136, local23, local14)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static383.anInt6136, local23, local14 + Static324.anInt5325)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static383.anInt6136, local23, local14 + Static383.anInt6136)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static207.method3007(local10 + Static383.anInt6136, local31, local14)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static383.anInt6136, local31, local14 + Static324.anInt5325)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static383.anInt6136, local31, local14 + Static383.anInt6136)) {
					return false;
				}
			}
			if (!Static207.method3007(local10 + Static383.anInt6136, local39, local14)) {
				return false;
			} else if (Static207.method3007(local10 + Static383.anInt6136, local39, local14 + Static324.anInt5325)) {
				return Static207.method3007(local10 + Static383.anInt6136, local39, local14 + Static383.anInt6136);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static197.anInt3614) {
				if (!Static207.method3007(local10, local23, local14)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static324.anInt5325, local23, local14)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static383.anInt6136, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static207.method3007(local10, local31, local14)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static324.anInt5325, local31, local14)) {
					return false;
				}
				if (!Static207.method3007(local10 + Static383.anInt6136, local31, local14)) {
					return false;
				}
			}
			if (!Static207.method3007(local10, local39, local14)) {
				return false;
			} else if (Static207.method3007(local10 + Static324.anInt5325, local39, local14)) {
				return Static207.method3007(local10 + Static383.anInt6136, local39, local14);
			} else {
				return false;
			}
		} else if (!Static207.method3007(local10 + Static324.anInt5325, local47, local14 + Static324.anInt5325)) {
			return false;
		} else if (arg3 == 16) {
			return Static207.method3007(local10, local39, local14 + Static383.anInt6136);
		} else if (arg3 == 32) {
			return Static207.method3007(local10 + Static383.anInt6136, local39, local14 + Static383.anInt6136);
		} else if (arg3 == 64) {
			return Static207.method3007(local10 + Static383.anInt6136, local39, local14);
		} else if (arg3 == 128) {
			return Static207.method3007(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZB)V")
	public static void method2066(@OriginalArg(0) boolean arg0) {
		if (Static2.aString1.length() == 0) {
			return;
		}
		Static246.method3501("--> " + Static2.aString1);
		Static56.method804(false, Static2.aString1, arg0);
		Static2.aString1 = "";
		Static247.anInt4420 = 0;
		Static229.anInt4148 = 0;
	}
}
