import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_60 = new Class45("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
	public static final int anInt4240 = 1407;

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIII)Z")
	public static boolean method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static529.method8238(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static275.anInt5260;
		@Pc(14) int local14 = arg2 << Static275.anInt5260;
		@Pc(23) int local23 = Static296.aClass7Array11[arg0].ba(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static275.anInt5260 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static275.anInt5260 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static275.anInt5260 - 7);
		if (arg3 == 1) {
			if (local10 > Static107.anInt2259) {
				if (!Static188.method3617(local10, local23, local14)) {
					return false;
				}
				if (!Static188.method3617(local10, local23, local14 + Static270.anInt5197)) {
					return false;
				}
				if (!Static188.method3617(local10, local23, local14 + Static382.anInt6794)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static188.method3617(local10, local31, local14)) {
					return false;
				}
				if (!Static188.method3617(local10, local31, local14 + Static270.anInt5197)) {
					return false;
				}
				if (!Static188.method3617(local10, local31, local14 + Static382.anInt6794)) {
					return false;
				}
			}
			if (!Static188.method3617(local10, local39, local14)) {
				return false;
			} else if (Static188.method3617(local10, local39, local14 + Static270.anInt5197)) {
				return Static188.method3617(local10, local39, local14 + Static382.anInt6794);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static478.anInt8519) {
				if (!Static188.method3617(local10, local23, local14 + Static382.anInt6794)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static270.anInt5197, local23, local14 + Static382.anInt6794)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static382.anInt6794, local23, local14 + Static382.anInt6794)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static188.method3617(local10, local31, local14 + Static382.anInt6794)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static270.anInt5197, local31, local14 + Static382.anInt6794)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static382.anInt6794, local31, local14 + Static382.anInt6794)) {
					return false;
				}
			}
			if (!Static188.method3617(local10, local39, local14 + Static382.anInt6794)) {
				return false;
			} else if (Static188.method3617(local10 + Static270.anInt5197, local39, local14 + Static382.anInt6794)) {
				return Static188.method3617(local10 + Static382.anInt6794, local39, local14 + Static382.anInt6794);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static107.anInt2259) {
				if (!Static188.method3617(local10 + Static382.anInt6794, local23, local14)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static382.anInt6794, local23, local14 + Static270.anInt5197)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static382.anInt6794, local23, local14 + Static382.anInt6794)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static188.method3617(local10 + Static382.anInt6794, local31, local14)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static382.anInt6794, local31, local14 + Static270.anInt5197)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static382.anInt6794, local31, local14 + Static382.anInt6794)) {
					return false;
				}
			}
			if (!Static188.method3617(local10 + Static382.anInt6794, local39, local14)) {
				return false;
			} else if (Static188.method3617(local10 + Static382.anInt6794, local39, local14 + Static270.anInt5197)) {
				return Static188.method3617(local10 + Static382.anInt6794, local39, local14 + Static382.anInt6794);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static478.anInt8519) {
				if (!Static188.method3617(local10, local23, local14)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static270.anInt5197, local23, local14)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static382.anInt6794, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static188.method3617(local10, local31, local14)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static270.anInt5197, local31, local14)) {
					return false;
				}
				if (!Static188.method3617(local10 + Static382.anInt6794, local31, local14)) {
					return false;
				}
			}
			if (!Static188.method3617(local10, local39, local14)) {
				return false;
			} else if (Static188.method3617(local10 + Static270.anInt5197, local39, local14)) {
				return Static188.method3617(local10 + Static382.anInt6794, local39, local14);
			} else {
				return false;
			}
		} else if (!Static188.method3617(local10 + Static270.anInt5197, local47, local14 + Static270.anInt5197)) {
			return false;
		} else if (arg3 == 16) {
			return Static188.method3617(local10, local39, local14 + Static382.anInt6794);
		} else if (arg3 == 32) {
			return Static188.method3617(local10 + Static382.anInt6794, local39, local14 + Static382.anInt6794);
		} else if (arg3 == 64) {
			return Static188.method3617(local10 + Static382.anInt6794, local39, local14);
		} else if (arg3 == 128) {
			return Static188.method3617(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([Ljava/lang/Object;II[II)V")
	public static void method3946(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg1) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg3; local55 < arg1; local55++) {
			if (local20 + (local55 & local53) > arg2[local55]) {
				@Pc(75) int local75 = arg2[local55];
				arg2[local55] = arg2[local16];
				arg2[local16] = local75;
				@Pc(89) Object local89 = arg0[local55];
				arg0[local55] = arg0[local16];
				arg0[local16++] = local89;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method3946(arg0, local16 - 1, arg2, arg3);
		method3946(arg0, arg1, arg2, local16 + 1);
	}
}
