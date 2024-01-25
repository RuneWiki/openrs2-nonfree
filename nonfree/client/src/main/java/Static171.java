import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_41 = new Class61(52, 18);

	@OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
	public static int anInt3692 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIII)Z")
	public static boolean method3298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static246.method4173(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static41.anInt810;
		@Pc(14) int local14 = arg2 << Static41.anInt810;
		@Pc(23) int local23 = Static112.aClass16Array3[arg0].JA(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static41.anInt810 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static41.anInt810 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static41.anInt810 - 7);
		if (arg3 == 1) {
			if (local10 > Static365.anInt6607) {
				if (!Static452.method6398(local10, local23, local14)) {
					return false;
				}
				if (!Static452.method6398(local10, local23, local14 + Static436.anInt7494)) {
					return false;
				}
				if (!Static452.method6398(local10, local23, local14 + Static514.anInt8839)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static452.method6398(local10, local31, local14)) {
					return false;
				}
				if (!Static452.method6398(local10, local31, local14 + Static436.anInt7494)) {
					return false;
				}
				if (!Static452.method6398(local10, local31, local14 + Static514.anInt8839)) {
					return false;
				}
			}
			if (!Static452.method6398(local10, local39, local14)) {
				return false;
			} else if (Static452.method6398(local10, local39, local14 + Static436.anInt7494)) {
				return Static452.method6398(local10, local39, local14 + Static514.anInt8839);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static427.anInt7348) {
				if (!Static452.method6398(local10, local23, local14 + Static514.anInt8839)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static436.anInt7494, local23, local14 + Static514.anInt8839)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static514.anInt8839, local23, local14 + Static514.anInt8839)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static452.method6398(local10, local31, local14 + Static514.anInt8839)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static436.anInt7494, local31, local14 + Static514.anInt8839)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static514.anInt8839, local31, local14 + Static514.anInt8839)) {
					return false;
				}
			}
			if (!Static452.method6398(local10, local39, local14 + Static514.anInt8839)) {
				return false;
			} else if (Static452.method6398(local10 + Static436.anInt7494, local39, local14 + Static514.anInt8839)) {
				return Static452.method6398(local10 + Static514.anInt8839, local39, local14 + Static514.anInt8839);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static365.anInt6607) {
				if (!Static452.method6398(local10 + Static514.anInt8839, local23, local14)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static514.anInt8839, local23, local14 + Static436.anInt7494)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static514.anInt8839, local23, local14 + Static514.anInt8839)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static452.method6398(local10 + Static514.anInt8839, local31, local14)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static514.anInt8839, local31, local14 + Static436.anInt7494)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static514.anInt8839, local31, local14 + Static514.anInt8839)) {
					return false;
				}
			}
			if (!Static452.method6398(local10 + Static514.anInt8839, local39, local14)) {
				return false;
			} else if (Static452.method6398(local10 + Static514.anInt8839, local39, local14 + Static436.anInt7494)) {
				return Static452.method6398(local10 + Static514.anInt8839, local39, local14 + Static514.anInt8839);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static427.anInt7348) {
				if (!Static452.method6398(local10, local23, local14)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static436.anInt7494, local23, local14)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static514.anInt8839, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static452.method6398(local10, local31, local14)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static436.anInt7494, local31, local14)) {
					return false;
				}
				if (!Static452.method6398(local10 + Static514.anInt8839, local31, local14)) {
					return false;
				}
			}
			if (!Static452.method6398(local10, local39, local14)) {
				return false;
			} else if (Static452.method6398(local10 + Static436.anInt7494, local39, local14)) {
				return Static452.method6398(local10 + Static514.anInt8839, local39, local14);
			} else {
				return false;
			}
		} else if (!Static452.method6398(local10 + Static436.anInt7494, local47, local14 + Static436.anInt7494)) {
			return false;
		} else if (arg3 == 16) {
			return Static452.method6398(local10, local39, local14 + Static514.anInt8839);
		} else if (arg3 == 32) {
			return Static452.method6398(local10 + Static514.anInt8839, local39, local14 + Static514.anInt8839);
		} else if (arg3 == 64) {
			return Static452.method6398(local10 + Static514.anInt8839, local39, local14);
		} else if (arg3 == 128) {
			return Static452.method6398(local10, local39, local14);
		} else {
			return true;
		}
	}
}
