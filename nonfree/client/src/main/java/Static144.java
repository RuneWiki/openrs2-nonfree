import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString111 = "Examine";

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "[I")
	public static final int[] anIntArray274 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method2888(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(42) int local42 = 2;
		for (@Pc(46) int local46 = arg0 / 10; local46 != 0; local46 /= 10) {
			local42++;
		}
		@Pc(58) char[] local58 = new char[local42];
		local58[0] = '+';
		for (@Pc(66) int local66 = local42 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 >= 10) {
				local58[local66] = (char) (local81 + 87);
			} else {
				local58[local66] = (char) (local81 + 48);
			}
		}
		return new String(local58);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!mo;IZLclient!mo;)V")
	public static void method2889(@OriginalArg(0) Class143 arg0, @OriginalArg(3) Class143 arg1) {
		Static227.aClass143_83 = arg1;
		Static57.aBoolean90 = true;
		Static178.aClass143_73 = arg0;
		@Pc(17) int local17 = Static227.aClass143_83.method3747() - 1;
		Static178.anInt3666 = local17 * 256 + Static227.aClass143_83.method3732(local17);
		Static333.aStringArray72 = new String[] { null, null, null, null, Static165.aString191 };
		Static240.aStringArray73 = new String[] { null, null, Static39.aString39, null, null };
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)Z")
	public static boolean method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static124.method2601(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static158.aClass114Array2[arg0].method3610(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static269.anInt5123) {
					if (!Static2.method106(local10, local23, local14)) {
						return false;
					}
					if (!Static2.method106(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static2.method106(local10, local27, local14)) {
						return false;
					}
					if (!Static2.method106(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static2.method106(local10, local31, local14)) {
					return false;
				}
				if (!Static2.method106(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static103.anInt2312) {
					if (!Static2.method106(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static2.method106(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static2.method106(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static2.method106(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static2.method106(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static2.method106(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static269.anInt5123) {
					if (!Static2.method106(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static2.method106(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static2.method106(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static2.method106(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static2.method106(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static2.method106(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static103.anInt2312) {
					if (!Static2.method106(local10, local23, local14)) {
						return false;
					}
					if (!Static2.method106(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static2.method106(local10, local27, local14)) {
						return false;
					}
					if (!Static2.method106(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static2.method106(local10, local31, local14)) {
					return false;
				}
				if (!Static2.method106(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static2.method106(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static2.method106(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static2.method106(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static2.method106(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static2.method106(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	public static void method2891() {
		if (Static12.anInt244 != 3) {
			Static296.anInt5689 = -1;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIII)Z")
	public static boolean method2893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static124.method2601(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static2.method106(local10 + 1, Static158.aClass114Array2[arg0].method3610(arg1, arg2) + arg3, local14 + 1) && Static2.method106(local10 + 128 - 1, Static158.aClass114Array2[arg0].method3610(arg1 + 1, arg2) + arg3, local14 + 1) && Static2.method106(local10 + 128 - 1, Static158.aClass114Array2[arg0].method3610(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static2.method106(local10 + 1, Static158.aClass114Array2[arg0].method3610(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
