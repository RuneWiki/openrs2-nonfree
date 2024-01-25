import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1139(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static318.method4521("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)Z")
	public static boolean method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static50.method775(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static146.anInt2674;
		@Pc(14) int local14 = arg2 << Static146.anInt2674;
		@Pc(23) int local23 = Static241.aClass22Array3[arg0].ua(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static146.anInt2674 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static146.anInt2674 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static146.anInt2674 - 7);
		if (arg3 == 1) {
			if (local10 > Static268.anInt4658) {
				if (!Static238.method3232(local10, local23, local14)) {
					return false;
				}
				if (!Static238.method3232(local10, local23, local14 + Static417.anInt7156)) {
					return false;
				}
				if (!Static238.method3232(local10, local23, local14 + Static327.anInt5862)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static238.method3232(local10, local31, local14)) {
					return false;
				}
				if (!Static238.method3232(local10, local31, local14 + Static417.anInt7156)) {
					return false;
				}
				if (!Static238.method3232(local10, local31, local14 + Static327.anInt5862)) {
					return false;
				}
			}
			if (!Static238.method3232(local10, local39, local14)) {
				return false;
			} else if (Static238.method3232(local10, local39, local14 + Static417.anInt7156)) {
				return Static238.method3232(local10, local39, local14 + Static327.anInt5862);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static171.anInt5502) {
				if (!Static238.method3232(local10, local23, local14 + Static327.anInt5862)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static417.anInt7156, local23, local14 + Static327.anInt5862)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static327.anInt5862, local23, local14 + Static327.anInt5862)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static238.method3232(local10, local31, local14 + Static327.anInt5862)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static417.anInt7156, local31, local14 + Static327.anInt5862)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static327.anInt5862, local31, local14 + Static327.anInt5862)) {
					return false;
				}
			}
			if (!Static238.method3232(local10, local39, local14 + Static327.anInt5862)) {
				return false;
			} else if (Static238.method3232(local10 + Static417.anInt7156, local39, local14 + Static327.anInt5862)) {
				return Static238.method3232(local10 + Static327.anInt5862, local39, local14 + Static327.anInt5862);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static268.anInt4658) {
				if (!Static238.method3232(local10 + Static327.anInt5862, local23, local14)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static327.anInt5862, local23, local14 + Static417.anInt7156)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static327.anInt5862, local23, local14 + Static327.anInt5862)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static238.method3232(local10 + Static327.anInt5862, local31, local14)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static327.anInt5862, local31, local14 + Static417.anInt7156)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static327.anInt5862, local31, local14 + Static327.anInt5862)) {
					return false;
				}
			}
			if (!Static238.method3232(local10 + Static327.anInt5862, local39, local14)) {
				return false;
			} else if (Static238.method3232(local10 + Static327.anInt5862, local39, local14 + Static417.anInt7156)) {
				return Static238.method3232(local10 + Static327.anInt5862, local39, local14 + Static327.anInt5862);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static171.anInt5502) {
				if (!Static238.method3232(local10, local23, local14)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static417.anInt7156, local23, local14)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static327.anInt5862, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static238.method3232(local10, local31, local14)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static417.anInt7156, local31, local14)) {
					return false;
				}
				if (!Static238.method3232(local10 + Static327.anInt5862, local31, local14)) {
					return false;
				}
			}
			if (!Static238.method3232(local10, local39, local14)) {
				return false;
			} else if (Static238.method3232(local10 + Static417.anInt7156, local39, local14)) {
				return Static238.method3232(local10 + Static327.anInt5862, local39, local14);
			} else {
				return false;
			}
		} else if (!Static238.method3232(local10 + Static417.anInt7156, local47, local14 + Static417.anInt7156)) {
			return false;
		} else if (arg3 == 16) {
			return Static238.method3232(local10, local39, local14 + Static327.anInt5862);
		} else if (arg3 == 32) {
			return Static238.method3232(local10 + Static327.anInt5862, local39, local14 + Static327.anInt5862);
		} else if (arg3 == 64) {
			return Static238.method3232(local10 + Static327.anInt5862, local39, local14);
		} else if (arg3 == 128) {
			return Static238.method3232(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public static void method1141() {
		if (Static433.anInt7309 == 6) {
			Static360.method5072(false);
		} else {
			Static54.aClass66_1 = Static339.aClass66_2;
			Static339.aClass66_2 = null;
			Static274.method3920(12);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIB)I")
	public static int method1142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}
}
