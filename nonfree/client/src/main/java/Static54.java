import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cba", name = "y", descriptor = "Lclient!sga;")
	public static Class297 aClass297_6;

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIII)Z")
	public static boolean method1305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static232.method3980(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static309.anInt6172;
		@Pc(14) int local14 = arg2 << Static309.anInt6172;
		@Pc(23) int local23 = Static224.aClass4Array3[arg0].JA(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static309.anInt6172 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static309.anInt6172 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static309.anInt6172 - 7);
		if (arg3 == 1) {
			if (local10 > Static238.anInt9925) {
				if (!Static557.method1639(local10, local23, local14)) {
					return false;
				}
				if (!Static557.method1639(local10, local23, local14 + Static377.anInt7321)) {
					return false;
				}
				if (!Static557.method1639(local10, local23, local14 + Static480.anInt8971)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static557.method1639(local10, local31, local14)) {
					return false;
				}
				if (!Static557.method1639(local10, local31, local14 + Static377.anInt7321)) {
					return false;
				}
				if (!Static557.method1639(local10, local31, local14 + Static480.anInt8971)) {
					return false;
				}
			}
			if (!Static557.method1639(local10, local39, local14)) {
				return false;
			} else if (Static557.method1639(local10, local39, local14 + Static377.anInt7321)) {
				return Static557.method1639(local10, local39, local14 + Static480.anInt8971);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static327.anInt6816) {
				if (!Static557.method1639(local10, local23, local14 + Static480.anInt8971)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static377.anInt7321, local23, local14 + Static480.anInt8971)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static480.anInt8971, local23, local14 + Static480.anInt8971)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static557.method1639(local10, local31, local14 + Static480.anInt8971)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static377.anInt7321, local31, local14 + Static480.anInt8971)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static480.anInt8971, local31, local14 + Static480.anInt8971)) {
					return false;
				}
			}
			if (!Static557.method1639(local10, local39, local14 + Static480.anInt8971)) {
				return false;
			} else if (Static557.method1639(local10 + Static377.anInt7321, local39, local14 + Static480.anInt8971)) {
				return Static557.method1639(local10 + Static480.anInt8971, local39, local14 + Static480.anInt8971);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static238.anInt9925) {
				if (!Static557.method1639(local10 + Static480.anInt8971, local23, local14)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static480.anInt8971, local23, local14 + Static377.anInt7321)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static480.anInt8971, local23, local14 + Static480.anInt8971)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static557.method1639(local10 + Static480.anInt8971, local31, local14)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static480.anInt8971, local31, local14 + Static377.anInt7321)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static480.anInt8971, local31, local14 + Static480.anInt8971)) {
					return false;
				}
			}
			if (!Static557.method1639(local10 + Static480.anInt8971, local39, local14)) {
				return false;
			} else if (Static557.method1639(local10 + Static480.anInt8971, local39, local14 + Static377.anInt7321)) {
				return Static557.method1639(local10 + Static480.anInt8971, local39, local14 + Static480.anInt8971);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static327.anInt6816) {
				if (!Static557.method1639(local10, local23, local14)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static377.anInt7321, local23, local14)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static480.anInt8971, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static557.method1639(local10, local31, local14)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static377.anInt7321, local31, local14)) {
					return false;
				}
				if (!Static557.method1639(local10 + Static480.anInt8971, local31, local14)) {
					return false;
				}
			}
			if (!Static557.method1639(local10, local39, local14)) {
				return false;
			} else if (Static557.method1639(local10 + Static377.anInt7321, local39, local14)) {
				return Static557.method1639(local10 + Static480.anInt8971, local39, local14);
			} else {
				return false;
			}
		} else if (!Static557.method1639(local10 + Static377.anInt7321, local47, local14 + Static377.anInt7321)) {
			return false;
		} else if (arg3 == 16) {
			return Static557.method1639(local10, local39, local14 + Static480.anInt8971);
		} else if (arg3 == 32) {
			return Static557.method1639(local10 + Static480.anInt8971, local39, local14 + Static480.anInt8971);
		} else if (arg3 == 64) {
			return Static557.method1639(local10 + Static480.anInt8971, local39, local14);
		} else if (arg3 == 128) {
			return Static557.method1639(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
	public static void method1306() {
		Static547.aClass3_Sub14_Sub4_3.method7834();
		Static568.aClass254_136 = null;
		Static178.anInt3592 = 1;
	}
}
