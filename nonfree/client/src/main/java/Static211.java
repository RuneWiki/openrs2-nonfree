import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!kr", name = "s", descriptor = "Lclient!l;")
	public static Class143 aClass143_23;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "S")
	public static short aShort57 = 256;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V")
	public static void method3342(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			client.lb = Static346.aClass80ArrayArrayArray3;
			Static105.aClass149Array1 = Static277.aClass149Array3;
		} else {
			client.lb = Static18.aClass80ArrayArrayArray2;
			Static105.aClass149Array1 = Static269.aClass149Array2;
		}
		Static68.anInt1553 = client.lb.length;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)Z")
	public static boolean method3343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static255.method3829(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static31.anInt665;
		@Pc(14) int local14 = arg2 << Static31.anInt665;
		@Pc(23) int local23 = Static105.aClass149Array1[arg0].l(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static31.anInt665 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static31.anInt665 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static31.anInt665 - 7);
		if (arg3 == 1) {
			if (local10 > Static396.anInt6364) {
				if (!Static316.method4482(local10, local23, local14)) {
					return false;
				}
				if (!Static316.method4482(local10, local23, local14 + Static69.anInt1593)) {
					return false;
				}
				if (!Static316.method4482(local10, local23, local14 + Static186.anInt3374)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static316.method4482(local10, local31, local14)) {
					return false;
				}
				if (!Static316.method4482(local10, local31, local14 + Static69.anInt1593)) {
					return false;
				}
				if (!Static316.method4482(local10, local31, local14 + Static186.anInt3374)) {
					return false;
				}
			}
			if (!Static316.method4482(local10, local39, local14)) {
				return false;
			} else if (Static316.method4482(local10, local39, local14 + Static69.anInt1593)) {
				return Static316.method4482(local10, local39, local14 + Static186.anInt3374);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static263.anInt4683) {
				if (!Static316.method4482(local10, local23, local14 + Static186.anInt3374)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static69.anInt1593, local23, local14 + Static186.anInt3374)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static186.anInt3374, local23, local14 + Static186.anInt3374)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static316.method4482(local10, local31, local14 + Static186.anInt3374)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static69.anInt1593, local31, local14 + Static186.anInt3374)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static186.anInt3374, local31, local14 + Static186.anInt3374)) {
					return false;
				}
			}
			if (!Static316.method4482(local10, local39, local14 + Static186.anInt3374)) {
				return false;
			} else if (Static316.method4482(local10 + Static69.anInt1593, local39, local14 + Static186.anInt3374)) {
				return Static316.method4482(local10 + Static186.anInt3374, local39, local14 + Static186.anInt3374);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static396.anInt6364) {
				if (!Static316.method4482(local10 + Static186.anInt3374, local23, local14)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static186.anInt3374, local23, local14 + Static69.anInt1593)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static186.anInt3374, local23, local14 + Static186.anInt3374)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static316.method4482(local10 + Static186.anInt3374, local31, local14)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static186.anInt3374, local31, local14 + Static69.anInt1593)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static186.anInt3374, local31, local14 + Static186.anInt3374)) {
					return false;
				}
			}
			if (!Static316.method4482(local10 + Static186.anInt3374, local39, local14)) {
				return false;
			} else if (Static316.method4482(local10 + Static186.anInt3374, local39, local14 + Static69.anInt1593)) {
				return Static316.method4482(local10 + Static186.anInt3374, local39, local14 + Static186.anInt3374);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static263.anInt4683) {
				if (!Static316.method4482(local10, local23, local14)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static69.anInt1593, local23, local14)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static186.anInt3374, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static316.method4482(local10, local31, local14)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static69.anInt1593, local31, local14)) {
					return false;
				}
				if (!Static316.method4482(local10 + Static186.anInt3374, local31, local14)) {
					return false;
				}
			}
			if (!Static316.method4482(local10, local39, local14)) {
				return false;
			} else if (Static316.method4482(local10 + Static69.anInt1593, local39, local14)) {
				return Static316.method4482(local10 + Static186.anInt3374, local39, local14);
			} else {
				return false;
			}
		} else if (!Static316.method4482(local10 + Static69.anInt1593, local47, local14 + Static69.anInt1593)) {
			return false;
		} else if (arg3 == 16) {
			return Static316.method4482(local10, local39, local14 + Static186.anInt3374);
		} else if (arg3 == 32) {
			return Static316.method4482(local10 + Static186.anInt3374, local39, local14 + Static186.anInt3374);
		} else if (arg3 == 64) {
			return Static316.method4482(local10 + Static186.anInt3374, local39, local14);
		} else if (arg3 == 128) {
			return Static316.method4482(local10, local39, local14);
		} else {
			return true;
		}
	}
}
