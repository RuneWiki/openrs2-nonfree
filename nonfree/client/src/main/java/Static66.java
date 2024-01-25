import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public static void method1263(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub1_Sub12 local12 = Static449.method5975(arg0, 16);
		local12.method3048();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)Z")
	public static boolean method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static275.method4186(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static301.anInt2759;
		@Pc(14) int local14 = arg2 << Static301.anInt2759;
		@Pc(23) int local23 = Static420.aClass84Array4[arg0].method5322(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static301.anInt2759 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static301.anInt2759 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static301.anInt2759 - 7);
		if (arg3 == 1) {
			if (local10 > Static385.anInt6349) {
				if (!Static365.method3018(local10, local23, local14)) {
					return false;
				}
				if (!Static365.method3018(local10, local23, local14 + Static25.anInt7191)) {
					return false;
				}
				if (!Static365.method3018(local10, local23, local14 + Static22.anInt397)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static365.method3018(local10, local31, local14)) {
					return false;
				}
				if (!Static365.method3018(local10, local31, local14 + Static25.anInt7191)) {
					return false;
				}
				if (!Static365.method3018(local10, local31, local14 + Static22.anInt397)) {
					return false;
				}
			}
			if (!Static365.method3018(local10, local39, local14)) {
				return false;
			} else if (Static365.method3018(local10, local39, local14 + Static25.anInt7191)) {
				return Static365.method3018(local10, local39, local14 + Static22.anInt397);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static352.anInt5944) {
				if (!Static365.method3018(local10, local23, local14 + Static22.anInt397)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static25.anInt7191, local23, local14 + Static22.anInt397)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static22.anInt397, local23, local14 + Static22.anInt397)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static365.method3018(local10, local31, local14 + Static22.anInt397)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static25.anInt7191, local31, local14 + Static22.anInt397)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static22.anInt397, local31, local14 + Static22.anInt397)) {
					return false;
				}
			}
			if (!Static365.method3018(local10, local39, local14 + Static22.anInt397)) {
				return false;
			} else if (Static365.method3018(local10 + Static25.anInt7191, local39, local14 + Static22.anInt397)) {
				return Static365.method3018(local10 + Static22.anInt397, local39, local14 + Static22.anInt397);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static385.anInt6349) {
				if (!Static365.method3018(local10 + Static22.anInt397, local23, local14)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static22.anInt397, local23, local14 + Static25.anInt7191)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static22.anInt397, local23, local14 + Static22.anInt397)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static365.method3018(local10 + Static22.anInt397, local31, local14)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static22.anInt397, local31, local14 + Static25.anInt7191)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static22.anInt397, local31, local14 + Static22.anInt397)) {
					return false;
				}
			}
			if (!Static365.method3018(local10 + Static22.anInt397, local39, local14)) {
				return false;
			} else if (Static365.method3018(local10 + Static22.anInt397, local39, local14 + Static25.anInt7191)) {
				return Static365.method3018(local10 + Static22.anInt397, local39, local14 + Static22.anInt397);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static352.anInt5944) {
				if (!Static365.method3018(local10, local23, local14)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static25.anInt7191, local23, local14)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static22.anInt397, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static365.method3018(local10, local31, local14)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static25.anInt7191, local31, local14)) {
					return false;
				}
				if (!Static365.method3018(local10 + Static22.anInt397, local31, local14)) {
					return false;
				}
			}
			if (!Static365.method3018(local10, local39, local14)) {
				return false;
			} else if (Static365.method3018(local10 + Static25.anInt7191, local39, local14)) {
				return Static365.method3018(local10 + Static22.anInt397, local39, local14);
			} else {
				return false;
			}
		} else if (!Static365.method3018(local10 + Static25.anInt7191, local47, local14 + Static25.anInt7191)) {
			return false;
		} else if (arg3 == 16) {
			return Static365.method3018(local10, local39, local14 + Static22.anInt397);
		} else if (arg3 == 32) {
			return Static365.method3018(local10 + Static22.anInt397, local39, local14 + Static22.anInt397);
		} else if (arg3 == 64) {
			return Static365.method3018(local10 + Static22.anInt397, local39, local14);
		} else if (arg3 == 128) {
			return Static365.method3018(local10, local39, local14);
		} else {
			return true;
		}
	}
}
