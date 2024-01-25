import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "Z")
	public static boolean aBoolean390 = true;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)Z")
	public static boolean method4330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static387.method5127(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static307.anInt5425;
		@Pc(14) int local14 = arg2 << Static307.anInt5425;
		@Pc(23) int local23 = Static58.aClass64Array1[arg0].l(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static307.anInt5425 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static307.anInt5425 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static307.anInt5425 - 7);
		if (arg3 == 1) {
			if (local10 > Static123.anInt2736) {
				if (!Static389.method5165(local10, local23, local14)) {
					return false;
				}
				if (!Static389.method5165(local10, local23, local14 + Static414.anInt6898)) {
					return false;
				}
				if (!Static389.method5165(local10, local23, local14 + Static8.anInt242)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static389.method5165(local10, local31, local14)) {
					return false;
				}
				if (!Static389.method5165(local10, local31, local14 + Static414.anInt6898)) {
					return false;
				}
				if (!Static389.method5165(local10, local31, local14 + Static8.anInt242)) {
					return false;
				}
			}
			if (!Static389.method5165(local10, local39, local14)) {
				return false;
			} else if (Static389.method5165(local10, local39, local14 + Static414.anInt6898)) {
				return Static389.method5165(local10, local39, local14 + Static8.anInt242);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static201.anInt3541) {
				if (!Static389.method5165(local10, local23, local14 + Static8.anInt242)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static414.anInt6898, local23, local14 + Static8.anInt242)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static8.anInt242, local23, local14 + Static8.anInt242)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static389.method5165(local10, local31, local14 + Static8.anInt242)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static414.anInt6898, local31, local14 + Static8.anInt242)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static8.anInt242, local31, local14 + Static8.anInt242)) {
					return false;
				}
			}
			if (!Static389.method5165(local10, local39, local14 + Static8.anInt242)) {
				return false;
			} else if (Static389.method5165(local10 + Static414.anInt6898, local39, local14 + Static8.anInt242)) {
				return Static389.method5165(local10 + Static8.anInt242, local39, local14 + Static8.anInt242);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static123.anInt2736) {
				if (!Static389.method5165(local10 + Static8.anInt242, local23, local14)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static8.anInt242, local23, local14 + Static414.anInt6898)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static8.anInt242, local23, local14 + Static8.anInt242)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static389.method5165(local10 + Static8.anInt242, local31, local14)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static8.anInt242, local31, local14 + Static414.anInt6898)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static8.anInt242, local31, local14 + Static8.anInt242)) {
					return false;
				}
			}
			if (!Static389.method5165(local10 + Static8.anInt242, local39, local14)) {
				return false;
			} else if (Static389.method5165(local10 + Static8.anInt242, local39, local14 + Static414.anInt6898)) {
				return Static389.method5165(local10 + Static8.anInt242, local39, local14 + Static8.anInt242);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static201.anInt3541) {
				if (!Static389.method5165(local10, local23, local14)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static414.anInt6898, local23, local14)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static8.anInt242, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static389.method5165(local10, local31, local14)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static414.anInt6898, local31, local14)) {
					return false;
				}
				if (!Static389.method5165(local10 + Static8.anInt242, local31, local14)) {
					return false;
				}
			}
			if (!Static389.method5165(local10, local39, local14)) {
				return false;
			} else if (Static389.method5165(local10 + Static414.anInt6898, local39, local14)) {
				return Static389.method5165(local10 + Static8.anInt242, local39, local14);
			} else {
				return false;
			}
		} else if (!Static389.method5165(local10 + Static414.anInt6898, local47, local14 + Static414.anInt6898)) {
			return false;
		} else if (arg3 == 16) {
			return Static389.method5165(local10, local39, local14 + Static8.anInt242);
		} else if (arg3 == 32) {
			return Static389.method5165(local10 + Static8.anInt242, local39, local14 + Static8.anInt242);
		} else if (arg3 == 64) {
			return Static389.method5165(local10 + Static8.anInt242, local39, local14);
		} else if (arg3 == 128) {
			return Static389.method5165(local10, local39, local14);
		} else {
			return true;
		}
	}
}
