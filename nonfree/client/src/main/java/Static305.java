import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "Lclient!qe;")
	public static Class132 aClass132_3;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
	public static int anInt5983;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "Lclient!sg;")
	public static Class97 aClass97_20;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_101 = new Class117(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "[I")
	public static final int[] anIntArray490 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)Z")
	public static boolean method5141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static259.method4515(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static108.aClass77Array2[arg0].method4122(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static10.anInt229) {
					if (!Static153.method2460(local10, local23, local14)) {
						return false;
					}
					if (!Static153.method2460(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static153.method2460(local10, local27, local14)) {
						return false;
					}
					if (!Static153.method2460(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static153.method2460(local10, local31, local14)) {
					return false;
				}
				if (!Static153.method2460(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static178.anInt3541) {
					if (!Static153.method2460(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static153.method2460(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static153.method2460(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static153.method2460(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static153.method2460(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static153.method2460(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static10.anInt229) {
					if (!Static153.method2460(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static153.method2460(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static153.method2460(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static153.method2460(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static153.method2460(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static153.method2460(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static178.anInt3541) {
					if (!Static153.method2460(local10, local23, local14)) {
						return false;
					}
					if (!Static153.method2460(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static153.method2460(local10, local27, local14)) {
						return false;
					}
					if (!Static153.method2460(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static153.method2460(local10, local31, local14)) {
					return false;
				}
				if (!Static153.method2460(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static153.method2460(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static153.method2460(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static153.method2460(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static153.method2460(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static153.method2460(local10, local31, local14);
		} else {
			return true;
		}
	}
}
