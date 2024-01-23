import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
	public static int anInt2426;

	@OriginalMember(owner = "client!ib", name = "S", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString137 = " from your friend list first.";

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V")
	public static void method2063(@OriginalArg(0) int arg0) {
		Static110.anInt2281--;
		if (arg0 == Static110.anInt2281) {
			return;
		}
		Static319.method1772(Static164.aStringArray25, arg0 + 1, Static164.aStringArray25, arg0, Static110.anInt2281 - arg0);
		Static319.method1772(Static73.aStringArray6, arg0 + 1, Static73.aStringArray6, arg0, Static110.anInt2281 - arg0);
		Static319.method1771(Static21.anIntArray19, arg0 + 1, Static21.anIntArray19, arg0, Static110.anInt2281 - arg0);
		Static319.method1768(Static17.aShortArray2, arg0 + 1, Static17.aShortArray2, arg0, Static110.anInt2281 - arg0);
		Static319.method1769(Static32.aLongArray8, arg0 + 1, Static32.aLongArray8, arg0, Static110.anInt2281 - arg0);
		Static319.method1771(Static85.anIntArray147, arg0 + 1, Static85.anIntArray147, arg0, Static110.anInt2281 - arg0);
		Static319.method1771(Static252.anIntArray400, arg0 + 1, Static252.anIntArray400, arg0, Static110.anInt2281 - arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!lf;BI)Ljava/lang/String;")
	public static String method2065(@OriginalArg(0) Class1_Sub14 arg0) {
		try {
			@Pc(7) int local7 = arg0.method1362();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local7];
			arg0.anInt1480 += Static117.aClass192_1.method4610(arg0.anInt1480, arg0.aByteArray17, 0, local7, local24);
			return Static168.method2852(local24, 0, local7);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public static void method2066() {
		if (Static28.anInt497 != Static65.anInt1300 && Static251.method3966(Static65.anInt1300)) {
			Static28.anInt497 = Static65.anInt1300;
		}
	}

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
	public static void method2067() {
		if (Static248.aClass28_1 != null) {
			Static248.aClass28_1.method4778();
		}
		if (Static300.aClass28_2 != null) {
			Static300.aClass28_2.method4778();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIII)Z")
	public static boolean method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static12.method165(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static24.anIntArrayArrayArray2[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static160.anInt3163) {
					if (!Static154.method2639(local10, local24, local14)) {
						return false;
					}
					if (!Static154.method2639(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static154.method2639(local10, local28, local14)) {
						return false;
					}
					if (!Static154.method2639(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static154.method2639(local10, local32, local14)) {
					return false;
				}
				if (!Static154.method2639(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static100.anInt2013) {
					if (!Static154.method2639(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static154.method2639(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static154.method2639(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static154.method2639(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static154.method2639(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static154.method2639(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static160.anInt3163) {
					if (!Static154.method2639(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static154.method2639(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static154.method2639(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static154.method2639(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static154.method2639(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static154.method2639(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static100.anInt2013) {
					if (!Static154.method2639(local10, local24, local14)) {
						return false;
					}
					if (!Static154.method2639(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static154.method2639(local10, local28, local14)) {
						return false;
					}
					if (!Static154.method2639(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static154.method2639(local10, local32, local14)) {
					return false;
				}
				if (!Static154.method2639(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static154.method2639(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static154.method2639(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static154.method2639(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static154.method2639(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static154.method2639(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZILjava/lang/String;)Z")
	public static boolean method2070(@OriginalArg(3) String arg0) {
		@Pc(27) boolean local27 = false;
		@Pc(29) boolean local29 = false;
		@Pc(32) int local32 = arg0.length();
		@Pc(34) int local34 = 0;
		for (@Pc(42) int local42 = 0; local42 < local32; local42++) {
			@Pc(49) char local49 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local49 == '-') {
					local27 = true;
					continue;
				}
				if (local49 == '+') {
					continue;
				}
			}
			@Pc(83) int local83;
			if (local49 >= '0' && local49 <= '9') {
				local83 = local49 - '0';
			} else if (local49 >= 'A' && local49 <= 'Z') {
				local83 = local49 - '7';
			} else if (local49 >= 'a' && local49 <= 'z') {
				local83 = local49 - 'W';
			} else {
				return false;
			}
			if (local83 >= 10) {
				return false;
			}
			if (local27) {
				local83 = -local83;
			}
			@Pc(122) int local122 = local83 + local34 * 10;
			if (local34 != local122 / 10) {
				return false;
			}
			local34 = local122;
			local29 = true;
		}
		return local29;
	}
}
