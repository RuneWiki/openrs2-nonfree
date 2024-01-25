import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
	public static int anInt701;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "[Lclient!qm;")
	public static final Class62_Sub1_Sub2_Sub1[] aClass62_Sub1_Sub2_Sub1Array1 = new Class62_Sub1_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!rd;I)[Lclient!k;")
	public static Class106[] method857(@OriginalArg(0) Class168 arg0) {
		if (!arg0.method4846()) {
			return new Class106[0];
		}
		@Pc(16) Class193 local16 = arg0.method4852();
		while (local16.anInt6293 == 0) {
			Static102.method2276(10L);
		}
		if (local16.anInt6293 == 2) {
			return new Class106[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject7;
		@Pc(43) Class106[] local43 = new Class106[local37.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local43.length; local50++) {
			@Pc(56) Class106 local56 = new Class106();
			local43[local50] = local56;
			local56.anInt3264 = local37[local50 << 2];
			local56.anInt3267 = local37[(local50 << 2) + 1];
			local56.anInt3266 = local37[(local50 << 2) + 2];
			local56.anInt3265 = local37[(local50 << 2) + 3];
		}
		return local43;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
	public static byte[] method858(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static336.method5826(local13) : local13;
		} else if (arg1 instanceof Class53) {
			@Pc(27) Class53 local27 = (Class53) arg1;
			return local27.method3193();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Lclient!ln;")
	public static Class123 method859() {
		try {
			return (Class123) Class.forName("Class123_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)Z")
	public static boolean method860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static39.method938(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static301.aClass73Array31[arg0].method4931(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static120.anInt2593) {
					if (!Static97.method5912(local10, local23, local14)) {
						return false;
					}
					if (!Static97.method5912(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static97.method5912(local10, local27, local14)) {
						return false;
					}
					if (!Static97.method5912(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static97.method5912(local10, local31, local14)) {
					return false;
				}
				if (!Static97.method5912(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static79.anInt1748) {
					if (!Static97.method5912(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static97.method5912(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static97.method5912(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static97.method5912(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static97.method5912(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static97.method5912(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static120.anInt2593) {
					if (!Static97.method5912(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static97.method5912(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static97.method5912(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static97.method5912(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static97.method5912(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static97.method5912(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static79.anInt1748) {
					if (!Static97.method5912(local10, local23, local14)) {
						return false;
					}
					if (!Static97.method5912(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static97.method5912(local10, local27, local14)) {
						return false;
					}
					if (!Static97.method5912(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static97.method5912(local10, local31, local14)) {
					return false;
				}
				if (!Static97.method5912(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static97.method5912(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static97.method5912(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static97.method5912(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static97.method5912(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static97.method5912(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIZI)V")
	public static void method861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub20 local7 = null;
		for (@Pc(12) Class2_Sub20 local12 = (Class2_Sub20) Static147.aClass216_8.method5992(); local12 != null; local12 = (Class2_Sub20) Static147.aClass216_8.method6000()) {
			if (arg5 == local12.anInt2461 && local12.anInt2464 == arg2 && arg0 == local12.anInt2468 && arg6 == local12.anInt2462) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub20();
			local7.anInt2461 = arg5;
			local7.anInt2462 = arg6;
			local7.anInt2464 = arg2;
			local7.anInt2468 = arg0;
			Static285.method5107(local7);
			Static147.aClass216_8.method5995(local7);
		}
		local7.anInt2466 = arg3;
		local7.anInt2459 = arg1;
		local7.anInt2463 = arg8;
		local7.anInt2465 = arg7;
		local7.anInt2467 = arg4;
	}
}
