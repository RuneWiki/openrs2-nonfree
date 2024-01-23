import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!r", name = "H", descriptor = "[S")
	public static short[] aShortArray76 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([II[III)V")
	public static void method3751(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(21) int local21 = (arg1 + arg3) / 2;
		@Pc(23) int local23 = arg1;
		@Pc(27) int local27 = arg2[local21];
		arg2[local21] = arg2[arg3];
		arg2[arg3] = local27;
		@Pc(41) int local41 = arg0[local21];
		arg0[local21] = arg0[arg3];
		arg0[arg3] = local41;
		for (@Pc(53) int local53 = arg1; local53 < arg3; local53++) {
			if ((local53 & 0x1) + local27 < arg2[local53]) {
				@Pc(70) int local70 = arg2[local53];
				arg2[local53] = arg2[local23];
				arg2[local23] = local70;
				@Pc(84) int local84 = arg0[local53];
				arg0[local53] = arg0[local23];
				arg0[local23++] = local84;
			}
		}
		arg2[arg3] = arg2[local23];
		arg2[local23] = local27;
		arg0[arg3] = arg0[local23];
		arg0[local23] = local41;
		method3751(arg0, arg1, arg2, local23 - 1);
		method3751(arg0, local23 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)Lclient!gi;")
	public static Class65 method3753(@OriginalArg(1) int arg0) {
		@Pc(10) Class65 local10 = (Class65) Static266.aClass175_39.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static146.aClass119_58.method3235(arg0, 1);
		local10 = new Class65();
		if (local22 != null) {
			local10.method1726(new Class1_Sub13(local22), arg0);
		}
		Static266.aClass175_39.method4285(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)Z")
	public static boolean method3754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static17.method273(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static280.anIntArrayArrayArray13[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static156.anInt3124) {
					if (!Static193.method3324(local10, local24, local14)) {
						return false;
					}
					if (!Static193.method3324(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static193.method3324(local10, local28, local14)) {
						return false;
					}
					if (!Static193.method3324(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static193.method3324(local10, local32, local14)) {
					return false;
				}
				if (!Static193.method3324(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static292.anInt5278) {
					if (!Static193.method3324(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static193.method3324(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static193.method3324(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static193.method3324(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static193.method3324(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static193.method3324(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static156.anInt3124) {
					if (!Static193.method3324(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static193.method3324(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static193.method3324(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static193.method3324(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static193.method3324(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static193.method3324(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static292.anInt5278) {
					if (!Static193.method3324(local10, local24, local14)) {
						return false;
					}
					if (!Static193.method3324(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static193.method3324(local10, local28, local14)) {
						return false;
					}
					if (!Static193.method3324(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static193.method3324(local10, local32, local14)) {
					return false;
				}
				if (!Static193.method3324(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static193.method3324(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static193.method3324(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static193.method3324(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static193.method3324(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static193.method3324(local10, local32, local14);
		} else {
			return true;
		}
	}
}
