import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
	public static int anInt5369;

	@OriginalMember(owner = "client!sm", name = "x", descriptor = "Lclient!rp;")
	public static Class21 aClass21_4;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)Z")
	public static boolean method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static66.method1052(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static333.anInt5694;
		@Pc(14) int local14 = arg2 << Static333.anInt5694;
		@Pc(23) int local23 = Static350.aClass107Array4[arg0].method4685(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 == 1) {
			if (local10 > Static203.anInt3750) {
				if (!Static4.method85(local10, local23, local14)) {
					return false;
				}
				if (!Static4.method85(local10, local23, local14 + Static180.anInt6489)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static4.method85(local10, local27, local14)) {
					return false;
				}
				if (!Static4.method85(local10, local27, local14 + Static180.anInt6489)) {
					return false;
				}
			}
			if (Static4.method85(local10, local31, local14)) {
				return Static4.method85(local10, local31, local14 + Static180.anInt6489);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static64.anInt1275) {
				if (!Static4.method85(local10, local23, local14 + Static180.anInt6489)) {
					return false;
				}
				if (!Static4.method85(local10 + Static180.anInt6489, local23, local14 + Static180.anInt6489)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static4.method85(local10, local27, local14 + Static180.anInt6489)) {
					return false;
				}
				if (!Static4.method85(local10 + Static180.anInt6489, local27, local14 + Static180.anInt6489)) {
					return false;
				}
			}
			if (Static4.method85(local10, local31, local14 + Static180.anInt6489)) {
				return Static4.method85(local10 + Static180.anInt6489, local31, local14 + Static180.anInt6489);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static203.anInt3750) {
				if (!Static4.method85(local10 + Static180.anInt6489, local23, local14)) {
					return false;
				}
				if (!Static4.method85(local10 + Static180.anInt6489, local23, local14 + Static180.anInt6489)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static4.method85(local10 + Static180.anInt6489, local27, local14)) {
					return false;
				}
				if (!Static4.method85(local10 + Static180.anInt6489, local27, local14 + Static180.anInt6489)) {
					return false;
				}
			}
			if (Static4.method85(local10 + Static180.anInt6489, local31, local14)) {
				return Static4.method85(local10 + Static180.anInt6489, local31, local14 + Static180.anInt6489);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static64.anInt1275) {
				if (!Static4.method85(local10, local23, local14)) {
					return false;
				}
				if (!Static4.method85(local10 + Static180.anInt6489, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static4.method85(local10, local27, local14)) {
					return false;
				}
				if (!Static4.method85(local10 + Static180.anInt6489, local27, local14)) {
					return false;
				}
			}
			if (Static4.method85(local10, local31, local14)) {
				return Static4.method85(local10 + Static180.anInt6489, local31, local14);
			} else {
				return false;
			}
		} else if (!Static4.method85(local10 + Static241.anInt4320, local35, local14 + Static241.anInt4320)) {
			return false;
		} else if (arg3 == 16) {
			return Static4.method85(local10, local31, local14 + Static180.anInt6489);
		} else if (arg3 == 32) {
			return Static4.method85(local10 + Static180.anInt6489, local31, local14 + Static180.anInt6489);
		} else if (arg3 == 64) {
			return Static4.method85(local10 + Static180.anInt6489, local31, local14);
		} else if (arg3 == 128) {
			return Static4.method85(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)V")
	public static void method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static143.anInt2862 == 0 || arg2 == 0 || Static3.anInt135 >= 50 || arg0 == -1) {
			return;
		}
		Static286.anIntArray982[Static3.anInt135] = arg0;
		Static67.anIntArray273[Static3.anInt135] = arg2;
		Static62.anIntArray267[Static3.anInt135] = arg1;
		Static276.aClass130Array1[Static3.anInt135] = null;
		Static284.anIntArray971[Static3.anInt135] = 0;
		Static56.anIntArray228[Static3.anInt135] = arg3;
		Static3.anInt135++;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZBLjava/awt/Component;)Lclient!po;")
	public static Class129 method4661(@OriginalArg(2) Component arg0) {
		return new Class129_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[III)V")
	public static void method4662(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(11) int local11 = arg0 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (local15 > arg2) {
			@Pc(19) int local19 = arg2 + 1;
			arg1[local19] = arg3;
			@Pc(24) int local24 = local19 + 1;
			arg1[local24] = arg3;
			@Pc(29) int local29 = local24 + 1;
			arg1[local29] = arg3;
			@Pc(34) int local34 = local29 + 1;
			arg1[local34] = arg3;
			@Pc(39) int local39 = local34 + 1;
			arg1[local39] = arg3;
			@Pc(44) int local44 = local39 + 1;
			arg1[local44] = arg3;
			@Pc(49) int local49 = local44 + 1;
			arg1[local49] = arg3;
			arg2 = local49 + 1;
			arg1[arg2] = arg3;
		}
		while (local11 > arg2) {
			arg2++;
			arg1[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIB)V")
	public static void method4663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static243.anInt4326 <= arg1 && Static235.anInt4193 >= arg0 && Static138.anInt932 <= arg2 && arg3 <= Static40.anInt818) {
			Static37.method680(arg0, arg3, arg4, arg2, arg1);
		} else {
			Static64.method1051(arg0, arg2, arg3, arg4, arg1);
		}
	}
}
