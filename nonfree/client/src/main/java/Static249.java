import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!tc", name = "T", descriptor = "Lclient!b;")
	public static Class12 aClass12_3;

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!tc", name = "Q", descriptor = "[I")
	public static int[] anIntArray446 = new int[2500];

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)Z")
	public static boolean method3995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static217.method3664(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static141.anIntArrayArrayArray4[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static77.anInt1648) {
					if (!Static113.method2086(local10, local24, local14)) {
						return false;
					}
					if (!Static113.method2086(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static113.method2086(local10, local28, local14)) {
						return false;
					}
					if (!Static113.method2086(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static113.method2086(local10, local32, local14)) {
					return false;
				}
				if (!Static113.method2086(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static173.anInt3690) {
					if (!Static113.method2086(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static113.method2086(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static113.method2086(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static113.method2086(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static113.method2086(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static113.method2086(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static77.anInt1648) {
					if (!Static113.method2086(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static113.method2086(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static113.method2086(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static113.method2086(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static113.method2086(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static113.method2086(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static173.anInt3690) {
					if (!Static113.method2086(local10, local24, local14)) {
						return false;
					}
					if (!Static113.method2086(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static113.method2086(local10, local28, local14)) {
						return false;
					}
					if (!Static113.method2086(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static113.method2086(local10, local32, local14)) {
					return false;
				}
				if (!Static113.method2086(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static113.method2086(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static113.method2086(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static113.method2086(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static113.method2086(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static113.method2086(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V")
	public static void method3996(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && Static96.aBooleanArray10.length > arg0) {
			Static96.aBooleanArray10[arg0] = !Static96.aBooleanArray10[arg0];
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)Z")
	public static boolean method3997(@OriginalArg(0) int arg0) {
		if (Static116.aBooleanArray12[arg0]) {
			return true;
		} else if (Static277.aClass84_118.method2128(arg0)) {
			@Pc(41) int local41 = Static277.aClass84_118.method2116(arg0);
			if (local41 == 0) {
				Static116.aBooleanArray12[arg0] = true;
				return true;
			}
			if (Static219.aClass115ArrayArray1[arg0] == null) {
				Static219.aClass115ArrayArray1[arg0] = new Class115[local41];
			}
			for (@Pc(61) int local61 = 0; local61 < local41; local61++) {
				if (Static219.aClass115ArrayArray1[arg0][local61] == null) {
					@Pc(80) byte[] local80 = Static277.aClass84_118.method2127(local61, arg0);
					if (local80 != null) {
						@Pc(94) Class115 local94 = Static219.aClass115ArrayArray1[arg0][local61] = new Class115();
						local94.anInt3552 = (arg0 << 16) + local61;
						if (local80[0] == -1) {
							local94.method2855(new Class2_Sub26(local80));
						} else {
							local94.method2865(new Class2_Sub26(local80));
						}
					}
				}
			}
			Static116.aBooleanArray12[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILclient!fc;IJIIII)Z")
	public static boolean method3998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static286.method4734(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}
}
