import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[I")
	public static int[] anIntArray446;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public static int anInt4419 = 0;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public static int anInt4423 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static254.anIntArrayArrayArray16[arg0][local16][local20] == -Static219.anInt4904) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static287.anIntArrayArrayArray18[arg0][arg1][arg3] + arg5;
			if (!Static79.method1420(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static79.method1420(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static79.method1420(local16, local156, local182)) {
				return false;
			} else if (Static79.method1420(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static264.method4486(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static79.method1420(local16 + 1, Static287.anIntArrayArrayArray18[arg0][arg1][arg3] + arg5, local20 + 1) && Static79.method1420(local16 + 128 - 1, Static287.anIntArrayArrayArray18[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static79.method1420(local16 + 128 - 1, Static287.anIntArrayArrayArray18[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static79.method1420(local16 + 1, Static287.anIntArrayArrayArray18[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!kb;II)Z")
	public static boolean method3508(@OriginalArg(0) Class83 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2330(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static41.method916(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	public static void method3509() {
		for (@Pc(6) Class1_Sub9 local6 = (Class1_Sub9) Static236.aClass131_17.method3791(); local6 != null; local6 = (Class1_Sub9) Static236.aClass131_17.method3792()) {
			if (local6.anInt1485 == -1) {
				local6.anInt1473 = 0;
				Static191.method3398(local6);
			} else {
				local6.method4742();
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BIII)I")
	public static int method3510(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
	public static int method3511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) >> 7;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!c;II)V")
	public static void method3512(@OriginalArg(0) int arg0, @OriginalArg(1) Class25_Sub1_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg1.anInt1625 && arg2 != -1) {
			@Pc(22) Class163 local22 = Static115.method1895(arg2);
			@Pc(25) int local25 = local22.anInt5911;
			if (local25 == 1) {
				arg1.anInt1670 = 0;
				arg1.anInt1653 = arg0;
				arg1.anInt1614 = 0;
				arg1.anInt1608 = 0;
				arg1.anInt1619 = 1;
				Static188.method3369(arg1.anInt1604, local22, arg1.anInt1608, arg1.anInt1635, arg1 == Static239.aClass25_Sub1_Sub1_2);
			}
			if (local25 == 2) {
				arg1.anInt1670 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt1625 == -1 || Static115.method1895(arg2).anInt5905 >= Static115.method1895(arg1.anInt1625).anInt5905) {
			arg1.anInt1625 = arg2;
			arg1.anInt1619 = 1;
			arg1.anInt1670 = 0;
			arg1.anInt1608 = 0;
			arg1.anInt1652 = arg1.anInt1610;
			arg1.anInt1653 = arg0;
			arg1.anInt1614 = 0;
			if (arg1.anInt1625 != -1) {
				Static188.method3369(arg1.anInt1604, Static115.method1895(arg1.anInt1625), arg1.anInt1608, arg1.anInt1635, Static239.aClass25_Sub1_Sub1_2 == arg1);
			}
		}
	}
}
