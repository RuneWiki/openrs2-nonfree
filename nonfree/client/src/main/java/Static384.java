import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!tf", name = "pd", descriptor = "Lclient!vh;")
	public static Class250 aClass250_76;

	@OriginalMember(owner = "client!tf", name = "qd", descriptor = "[I")
	public static int[] anIntArray551;

	@OriginalMember(owner = "client!tf", name = "wd", descriptor = "I")
	public static int anInt6665;

	@OriginalMember(owner = "client!tf", name = "Gc", descriptor = "Lclient!wo;")
	public static final Class266 aClass266_45 = new Class266();

	@OriginalMember(owner = "client!tf", name = "md", descriptor = "Lclient!lg;")
	public static final Class146 aClass146_12 = new Class146(3, 14);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method5251(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)Z")
	public static boolean method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static97.method1525(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static139.anInt2355;
		@Pc(14) int local14 = arg2 << Static139.anInt2355;
		@Pc(23) int local23 = Static92.aClass136Array1[arg0].I(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static139.anInt2355 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static139.anInt2355 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static139.anInt2355 - 7);
		if (arg3 == 1) {
			if (local10 > Static251.anInt4514) {
				if (!Static64.method1127(local10, local23, local14)) {
					return false;
				}
				if (!Static64.method1127(local10, local23, local14 + Static122.anInt2160)) {
					return false;
				}
				if (!Static64.method1127(local10, local23, local14 + Static337.anInt7424)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static64.method1127(local10, local31, local14)) {
					return false;
				}
				if (!Static64.method1127(local10, local31, local14 + Static122.anInt2160)) {
					return false;
				}
				if (!Static64.method1127(local10, local31, local14 + Static337.anInt7424)) {
					return false;
				}
			}
			if (!Static64.method1127(local10, local39, local14)) {
				return false;
			} else if (Static64.method1127(local10, local39, local14 + Static122.anInt2160)) {
				return Static64.method1127(local10, local39, local14 + Static337.anInt7424);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static424.anInt7347) {
				if (!Static64.method1127(local10, local23, local14 + Static337.anInt7424)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static122.anInt2160, local23, local14 + Static337.anInt7424)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static337.anInt7424, local23, local14 + Static337.anInt7424)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static64.method1127(local10, local31, local14 + Static337.anInt7424)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static122.anInt2160, local31, local14 + Static337.anInt7424)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static337.anInt7424, local31, local14 + Static337.anInt7424)) {
					return false;
				}
			}
			if (!Static64.method1127(local10, local39, local14 + Static337.anInt7424)) {
				return false;
			} else if (Static64.method1127(local10 + Static122.anInt2160, local39, local14 + Static337.anInt7424)) {
				return Static64.method1127(local10 + Static337.anInt7424, local39, local14 + Static337.anInt7424);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static251.anInt4514) {
				if (!Static64.method1127(local10 + Static337.anInt7424, local23, local14)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static337.anInt7424, local23, local14 + Static122.anInt2160)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static337.anInt7424, local23, local14 + Static337.anInt7424)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static64.method1127(local10 + Static337.anInt7424, local31, local14)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static337.anInt7424, local31, local14 + Static122.anInt2160)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static337.anInt7424, local31, local14 + Static337.anInt7424)) {
					return false;
				}
			}
			if (!Static64.method1127(local10 + Static337.anInt7424, local39, local14)) {
				return false;
			} else if (Static64.method1127(local10 + Static337.anInt7424, local39, local14 + Static122.anInt2160)) {
				return Static64.method1127(local10 + Static337.anInt7424, local39, local14 + Static337.anInt7424);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static424.anInt7347) {
				if (!Static64.method1127(local10, local23, local14)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static122.anInt2160, local23, local14)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static337.anInt7424, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static64.method1127(local10, local31, local14)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static122.anInt2160, local31, local14)) {
					return false;
				}
				if (!Static64.method1127(local10 + Static337.anInt7424, local31, local14)) {
					return false;
				}
			}
			if (!Static64.method1127(local10, local39, local14)) {
				return false;
			} else if (Static64.method1127(local10 + Static122.anInt2160, local39, local14)) {
				return Static64.method1127(local10 + Static337.anInt7424, local39, local14);
			} else {
				return false;
			}
		} else if (!Static64.method1127(local10 + Static122.anInt2160, local47, local14 + Static122.anInt2160)) {
			return false;
		} else if (arg3 == 16) {
			return Static64.method1127(local10, local39, local14 + Static337.anInt7424);
		} else if (arg3 == 32) {
			return Static64.method1127(local10 + Static337.anInt7424, local39, local14 + Static337.anInt7424);
		} else if (arg3 == 64) {
			return Static64.method1127(local10 + Static337.anInt7424, local39, local14);
		} else if (arg3 == 128) {
			return Static64.method1127(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIII)V")
	public static void method5261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg2, 9);
		local8.method202();
		local8.anInt214 = arg1;
		local8.anInt218 = arg0;
	}
}
