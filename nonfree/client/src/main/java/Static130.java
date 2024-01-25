import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_34 = new Class181(35, 7);

	@OriginalMember(owner = "client!et", name = "f", descriptor = "I")
	public static int anInt2837 = 1;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)Z")
	public static boolean method2515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static104.method6580(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static494.anInt8859;
		@Pc(14) int local14 = arg2 << Static494.anInt8859;
		@Pc(23) int local23 = Static47.aClass62Array1[arg0].JA(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static494.anInt8859 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static494.anInt8859 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static494.anInt8859 - 7);
		if (arg3 == 1) {
			if (local10 > Static279.anInt5385) {
				if (!Static220.method3989(local10, local23, local14)) {
					return false;
				}
				if (!Static220.method3989(local10, local23, local14 + Static406.anInt9843)) {
					return false;
				}
				if (!Static220.method3989(local10, local23, local14 + Static364.anInt7313)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static220.method3989(local10, local31, local14)) {
					return false;
				}
				if (!Static220.method3989(local10, local31, local14 + Static406.anInt9843)) {
					return false;
				}
				if (!Static220.method3989(local10, local31, local14 + Static364.anInt7313)) {
					return false;
				}
			}
			if (!Static220.method3989(local10, local39, local14)) {
				return false;
			} else if (Static220.method3989(local10, local39, local14 + Static406.anInt9843)) {
				return Static220.method3989(local10, local39, local14 + Static364.anInt7313);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static325.anInt6147) {
				if (!Static220.method3989(local10, local23, local14 + Static364.anInt7313)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static406.anInt9843, local23, local14 + Static364.anInt7313)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static364.anInt7313, local23, local14 + Static364.anInt7313)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static220.method3989(local10, local31, local14 + Static364.anInt7313)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static406.anInt9843, local31, local14 + Static364.anInt7313)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static364.anInt7313, local31, local14 + Static364.anInt7313)) {
					return false;
				}
			}
			if (!Static220.method3989(local10, local39, local14 + Static364.anInt7313)) {
				return false;
			} else if (Static220.method3989(local10 + Static406.anInt9843, local39, local14 + Static364.anInt7313)) {
				return Static220.method3989(local10 + Static364.anInt7313, local39, local14 + Static364.anInt7313);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static279.anInt5385) {
				if (!Static220.method3989(local10 + Static364.anInt7313, local23, local14)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static364.anInt7313, local23, local14 + Static406.anInt9843)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static364.anInt7313, local23, local14 + Static364.anInt7313)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static220.method3989(local10 + Static364.anInt7313, local31, local14)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static364.anInt7313, local31, local14 + Static406.anInt9843)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static364.anInt7313, local31, local14 + Static364.anInt7313)) {
					return false;
				}
			}
			if (!Static220.method3989(local10 + Static364.anInt7313, local39, local14)) {
				return false;
			} else if (Static220.method3989(local10 + Static364.anInt7313, local39, local14 + Static406.anInt9843)) {
				return Static220.method3989(local10 + Static364.anInt7313, local39, local14 + Static364.anInt7313);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static325.anInt6147) {
				if (!Static220.method3989(local10, local23, local14)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static406.anInt9843, local23, local14)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static364.anInt7313, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static220.method3989(local10, local31, local14)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static406.anInt9843, local31, local14)) {
					return false;
				}
				if (!Static220.method3989(local10 + Static364.anInt7313, local31, local14)) {
					return false;
				}
			}
			if (!Static220.method3989(local10, local39, local14)) {
				return false;
			} else if (Static220.method3989(local10 + Static406.anInt9843, local39, local14)) {
				return Static220.method3989(local10 + Static364.anInt7313, local39, local14);
			} else {
				return false;
			}
		} else if (!Static220.method3989(local10 + Static406.anInt9843, local47, local14 + Static406.anInt9843)) {
			return false;
		} else if (arg3 == 16) {
			return Static220.method3989(local10, local39, local14 + Static364.anInt7313);
		} else if (arg3 == 32) {
			return Static220.method3989(local10 + Static364.anInt7313, local39, local14 + Static364.anInt7313);
		} else if (arg3 == 64) {
			return Static220.method3989(local10 + Static364.anInt7313, local39, local14);
		} else if (arg3 == 128) {
			return Static220.method3989(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)[Lclient!fv;")
	public static Class112[] method2516() {
		return new Class112[] { Static486.aClass112_13, Static175.aClass112_6, Static3.aClass112_8, Static444.aClass112_11, Static247.aClass112_7, Static434.aClass112_10, Static88.aClass112_5, Static554.aClass112_16, Static539.aClass112_15, Static3.aClass112_9, Static493.aClass112_14, Static6.aClass112_4, Static467.aClass112_12, Static5.aClass112_3 };
	}
}
