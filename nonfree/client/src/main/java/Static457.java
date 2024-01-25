import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "Lclient!fo;")
	public static Class82 aClass82_106;

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_182 = new Class119("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)Z")
	public static boolean method5947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static160.method2326(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static215.anInt4460;
		@Pc(14) int local14 = arg2 << Static215.anInt4460;
		@Pc(23) int local23 = Static94.aClass157Array1[arg0].ua(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static215.anInt4460 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static215.anInt4460 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static215.anInt4460 - 7);
		if (arg3 == 1) {
			if (local10 > Static111.anInt2102) {
				if (!Static409.method5278(local10, local23, local14)) {
					return false;
				}
				if (!Static409.method5278(local10, local23, local14 + Static341.anInt5832)) {
					return false;
				}
				if (!Static409.method5278(local10, local23, local14 + Static5.anInt78)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static409.method5278(local10, local31, local14)) {
					return false;
				}
				if (!Static409.method5278(local10, local31, local14 + Static341.anInt5832)) {
					return false;
				}
				if (!Static409.method5278(local10, local31, local14 + Static5.anInt78)) {
					return false;
				}
			}
			if (!Static409.method5278(local10, local39, local14)) {
				return false;
			} else if (Static409.method5278(local10, local39, local14 + Static341.anInt5832)) {
				return Static409.method5278(local10, local39, local14 + Static5.anInt78);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static330.anInt5627) {
				if (!Static409.method5278(local10, local23, local14 + Static5.anInt78)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static341.anInt5832, local23, local14 + Static5.anInt78)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static5.anInt78, local23, local14 + Static5.anInt78)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static409.method5278(local10, local31, local14 + Static5.anInt78)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static341.anInt5832, local31, local14 + Static5.anInt78)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static5.anInt78, local31, local14 + Static5.anInt78)) {
					return false;
				}
			}
			if (!Static409.method5278(local10, local39, local14 + Static5.anInt78)) {
				return false;
			} else if (Static409.method5278(local10 + Static341.anInt5832, local39, local14 + Static5.anInt78)) {
				return Static409.method5278(local10 + Static5.anInt78, local39, local14 + Static5.anInt78);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static111.anInt2102) {
				if (!Static409.method5278(local10 + Static5.anInt78, local23, local14)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static5.anInt78, local23, local14 + Static341.anInt5832)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static5.anInt78, local23, local14 + Static5.anInt78)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static409.method5278(local10 + Static5.anInt78, local31, local14)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static5.anInt78, local31, local14 + Static341.anInt5832)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static5.anInt78, local31, local14 + Static5.anInt78)) {
					return false;
				}
			}
			if (!Static409.method5278(local10 + Static5.anInt78, local39, local14)) {
				return false;
			} else if (Static409.method5278(local10 + Static5.anInt78, local39, local14 + Static341.anInt5832)) {
				return Static409.method5278(local10 + Static5.anInt78, local39, local14 + Static5.anInt78);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static330.anInt5627) {
				if (!Static409.method5278(local10, local23, local14)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static341.anInt5832, local23, local14)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static5.anInt78, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static409.method5278(local10, local31, local14)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static341.anInt5832, local31, local14)) {
					return false;
				}
				if (!Static409.method5278(local10 + Static5.anInt78, local31, local14)) {
					return false;
				}
			}
			if (!Static409.method5278(local10, local39, local14)) {
				return false;
			} else if (Static409.method5278(local10 + Static341.anInt5832, local39, local14)) {
				return Static409.method5278(local10 + Static5.anInt78, local39, local14);
			} else {
				return false;
			}
		} else if (!Static409.method5278(local10 + Static341.anInt5832, local47, local14 + Static341.anInt5832)) {
			return false;
		} else if (arg3 == 16) {
			return Static409.method5278(local10, local39, local14 + Static5.anInt78);
		} else if (arg3 == 32) {
			return Static409.method5278(local10 + Static5.anInt78, local39, local14 + Static5.anInt78);
		} else if (arg3 == 64) {
			return Static409.method5278(local10 + Static5.anInt78, local39, local14);
		} else if (arg3 == 128) {
			return Static409.method5278(local10, local39, local14);
		} else {
			return true;
		}
	}
}
