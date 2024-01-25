import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!qw;")
	public static Class3_Sub38 aClass3_Sub38_1;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "[I")
	public static final int[] anIntArray122 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)Z")
	public static boolean method2050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static456.method6229(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static437.anInt7308;
		@Pc(14) int local14 = arg2 << Static437.anInt7308;
		@Pc(23) int local23 = Static178.aClass55Array1[arg0].oa(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static437.anInt7308 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static437.anInt7308 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static437.anInt7308 - 7);
		if (arg3 == 1) {
			if (local10 > Static257.anInt4288) {
				if (!Static303.method4310(local10, local23, local14)) {
					return false;
				}
				if (!Static303.method4310(local10, local23, local14 + Static22.anInt382)) {
					return false;
				}
				if (!Static303.method4310(local10, local23, local14 + Static99.anInt1803)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static303.method4310(local10, local31, local14)) {
					return false;
				}
				if (!Static303.method4310(local10, local31, local14 + Static22.anInt382)) {
					return false;
				}
				if (!Static303.method4310(local10, local31, local14 + Static99.anInt1803)) {
					return false;
				}
			}
			if (!Static303.method4310(local10, local39, local14)) {
				return false;
			} else if (Static303.method4310(local10, local39, local14 + Static22.anInt382)) {
				return Static303.method4310(local10, local39, local14 + Static99.anInt1803);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static344.anInt5818) {
				if (!Static303.method4310(local10, local23, local14 + Static99.anInt1803)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static22.anInt382, local23, local14 + Static99.anInt1803)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static99.anInt1803, local23, local14 + Static99.anInt1803)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static303.method4310(local10, local31, local14 + Static99.anInt1803)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static22.anInt382, local31, local14 + Static99.anInt1803)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static99.anInt1803, local31, local14 + Static99.anInt1803)) {
					return false;
				}
			}
			if (!Static303.method4310(local10, local39, local14 + Static99.anInt1803)) {
				return false;
			} else if (Static303.method4310(local10 + Static22.anInt382, local39, local14 + Static99.anInt1803)) {
				return Static303.method4310(local10 + Static99.anInt1803, local39, local14 + Static99.anInt1803);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static257.anInt4288) {
				if (!Static303.method4310(local10 + Static99.anInt1803, local23, local14)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static99.anInt1803, local23, local14 + Static22.anInt382)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static99.anInt1803, local23, local14 + Static99.anInt1803)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static303.method4310(local10 + Static99.anInt1803, local31, local14)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static99.anInt1803, local31, local14 + Static22.anInt382)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static99.anInt1803, local31, local14 + Static99.anInt1803)) {
					return false;
				}
			}
			if (!Static303.method4310(local10 + Static99.anInt1803, local39, local14)) {
				return false;
			} else if (Static303.method4310(local10 + Static99.anInt1803, local39, local14 + Static22.anInt382)) {
				return Static303.method4310(local10 + Static99.anInt1803, local39, local14 + Static99.anInt1803);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static344.anInt5818) {
				if (!Static303.method4310(local10, local23, local14)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static22.anInt382, local23, local14)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static99.anInt1803, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static303.method4310(local10, local31, local14)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static22.anInt382, local31, local14)) {
					return false;
				}
				if (!Static303.method4310(local10 + Static99.anInt1803, local31, local14)) {
					return false;
				}
			}
			if (!Static303.method4310(local10, local39, local14)) {
				return false;
			} else if (Static303.method4310(local10 + Static22.anInt382, local39, local14)) {
				return Static303.method4310(local10 + Static99.anInt1803, local39, local14);
			} else {
				return false;
			}
		} else if (!Static303.method4310(local10 + Static22.anInt382, local47, local14 + Static22.anInt382)) {
			return false;
		} else if (arg3 == 16) {
			return Static303.method4310(local10, local39, local14 + Static99.anInt1803);
		} else if (arg3 == 32) {
			return Static303.method4310(local10 + Static99.anInt1803, local39, local14 + Static99.anInt1803);
		} else if (arg3 == 64) {
			return Static303.method4310(local10 + Static99.anInt1803, local39, local14);
		} else if (arg3 == 128) {
			return Static303.method4310(local10, local39, local14);
		} else {
			return true;
		}
	}
}
