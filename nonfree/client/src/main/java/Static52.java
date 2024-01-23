import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fa", name = "gb", descriptor = "Lclient!q;")
	public static Class80 aClass80_6;

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!fa", name = "T", descriptor = "Lclient!i;")
	private static Class41 aClass41_427 = Static184.method2923("wave:");

	@OriginalMember(owner = "client!fa", name = "V", descriptor = "Lclient!i;")
	public static Class41 aClass41_428 = Static184.method2923("AUS");

	@OriginalMember(owner = "client!fa", name = "Y", descriptor = "Lclient!i;")
	public static Class41 aClass41_429 = aClass41_427;

	@OriginalMember(owner = "client!fa", name = "Z", descriptor = "Lclient!i;")
	public static Class41 aClass41_430 = Static184.method2923("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!fa", name = "bb", descriptor = "Lclient!i;")
	public static Class41 aClass41_431 = aClass41_427;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIILclient!q;I)V")
	public static void method1007(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class80 arg3) {
		@Pc(8) int local8 = arg3.anInt3635;
		if (arg3.aByte14 == 0) {
			arg3.anInt3635 = arg3.anInt3696;
		} else if (arg3.aByte14 == 1) {
			arg3.anInt3635 = arg2 - arg3.anInt3696;
		} else if (arg3.aByte14 == 2) {
			arg3.anInt3635 = arg2 * arg3.anInt3696 >> 14;
		} else if (arg3.aByte14 == 3) {
			if (arg3.anInt3640 == 2) {
				arg3.anInt3635 = arg3.anInt3696 * 32 + arg3.anInt3677 * (arg3.anInt3696 - 1);
			} else if (arg3.anInt3640 == 7) {
				arg3.anInt3635 = (arg3.anInt3696 - 1) * arg3.anInt3677 + arg3.anInt3696 * 115;
			}
		}
		@Pc(97) int local97 = arg3.anInt3660;
		if (arg3.aByte12 == 0) {
			arg3.anInt3660 = arg3.anInt3658;
		} else if (arg3.aByte12 == 1) {
			arg3.anInt3660 = arg1 - arg3.anInt3658;
		} else if (arg3.aByte12 == 2) {
			arg3.anInt3660 = arg3.anInt3658 * arg1 >> 14;
		} else if (arg3.aByte12 == 3) {
			if (arg3.anInt3640 == 2) {
				arg3.anInt3660 = arg3.anInt3699 * (arg3.anInt3658 - 1) + arg3.anInt3658 * 32;
			} else if (arg3.anInt3640 == 7) {
				arg3.anInt3660 = arg3.anInt3699 * (arg3.anInt3658 - 1) + arg3.anInt3658 * 12;
			}
		}
		if (Static102.aBoolean133 && (Static70.method1287(arg3) != 0 || arg3.anInt3640 == 0)) {
			if (arg3.anInt3660 < 5 && arg3.anInt3635 < 5) {
				arg3.anInt3635 = 5;
				arg3.anInt3660 = 5;
			} else {
				if (arg3.anInt3660 <= 0) {
					arg3.anInt3660 = 5;
				}
				if (arg3.anInt3635 <= 0) {
					arg3.anInt3635 = 5;
				}
			}
		}
		if (arg0 && arg3.anObjectArray10 != null && (arg3.anInt3635 != local8 || arg3.anInt3660 != local97)) {
			@Pc(256) Class2_Sub5 local256 = new Class2_Sub5();
			local256.anObjectArray3 = arg3.anObjectArray10;
			local256.aClass80_3 = arg3;
			Static176.method2835(local256);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)V")
	public static void method1008(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static32.method629(Static62.aClass41_489, Static10.aClass41_79, Static198.aClass41_1182);
		} else if (arg0 == -2) {
			Static32.method629(Static62.aClass41_490, Static62.aClass41_508, Static136.aClass41_865);
		} else if (arg0 == -1) {
			Static32.method629(Static62.aClass41_487, Static27.aClass41_677, Static198.aClass41_1174);
		} else if (arg0 == 3) {
			Static32.method629(Static62.aClass41_511, Static62.aClass41_485, Static209.aClass41_1246);
		} else if (arg0 == 4) {
			Static32.method629(Static62.aClass41_505, Static7.aClass41_60, Static50.aClass41_632);
		} else if (arg0 == 5) {
			Static32.method629(Static62.aClass41_519, Static198.aClass41_1178, Static157.aClass41_988);
		} else if (arg0 == 6) {
			Static32.method629(Static62.aClass41_483, Static100.aClass41_723, Static58.aClass41_472);
		} else if (arg0 == 7) {
			Static32.method629(Static62.aClass41_516, Static77.aClass41_597, Static204.aClass41_1219);
		} else if (arg0 == 8) {
			Static32.method629(Static62.aClass41_484, Static192.aClass41_1158, Static144.aClass41_915);
		} else if (arg0 == 9) {
			Static32.method629(Static62.aClass41_507, Static195.aClass41_1167, Static15.aClass41_93);
		} else if (arg0 == 10) {
			Static32.method629(Static62.aClass41_495, Static192.aClass41_1159, Static153.aClass41_971);
		} else if (arg0 == 11) {
			Static32.method629(Static62.aClass41_500, Static44.aClass41_384, Static176.aClass41_1088);
		} else if (arg0 == 12) {
			Static32.method629(Static62.aClass41_496, Static108.aClass41_763, Static186.aClass41_1130);
		} else if (arg0 == 13) {
			Static32.method629(Static62.aClass41_513, Static70.aClass41_574, Static198.aClass41_1175);
		} else if (arg0 == 14) {
			Static32.method629(Static62.aClass41_514, Static149.aClass41_930, Static139.aClass41_881);
		} else if (arg0 == 16) {
			Static32.method629(Static62.aClass41_493, Static201.aClass41_1205, Static48.aClass41_415);
		} else if (arg0 == 17) {
			Static32.method629(Static62.aClass41_488, Static18.aClass41_115, Static138.aClass41_878);
		} else if (arg0 == 18) {
			Static32.method629(Static62.aClass41_501, Static27.aClass41_678, Static89.aClass41_655);
		} else if (arg0 == 19) {
			Static32.method629(Static204.aClass41_1218, Static140.aClass41_894, Static103.aClass41_743);
		} else if (arg0 == 20) {
			Static32.method629(Static62.aClass41_503, Static4.aClass41_37, Static198.aClass41_1176);
		} else if (arg0 == 22) {
			Static32.method629(Static62.aClass41_498, Static44.aClass41_380, Static218.aClass41_1278);
		} else if (arg0 == 23) {
			Static32.method629(Static62.aClass41_486, Static44.aClass41_385, Static139.aClass41_887);
		} else if (arg0 == 24) {
			Static32.method629(Static62.aClass41_517, Static117.aClass41_806, Static206.aClass41_1232);
		} else if (arg0 == 25) {
			Static32.method629(Static62.aClass41_497, Static9.aClass41_65, Static198.aClass41_1179);
		} else if (arg0 == 26) {
			Static32.method629(Static62.aClass41_515, Static48.aClass41_404, Static95.aClass41_700);
		} else if (arg0 == 27) {
			Static32.method629(Static62.aClass41_494, Static62.aClass41_510, Static146.aClass41_923);
		} else {
			Static32.method629(Static62.aClass41_518, Static219.aClass41_1286, Static198.aClass41_1180);
		}
		Static116.method1955(10);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIILclient!q;Lclient!rc;I)V")
	public static void method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class80 arg3, @OriginalArg(5) Class2_Sub2_Sub16 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(12) int local12 = Static47.anInt1372 + Static183.anInt1324 & 0x7FF;
		@Pc(20) int local20 = arg5 * arg5 + arg2 * arg2;
		@Pc(32) int local32 = Math.max(arg3.anInt3635 / 2, arg3.anInt3660 / 2) + 10;
		if (local20 > local32 * local32) {
			return;
		}
		@Pc(46) int local46 = Class79.anIntArray375[local12];
		@Pc(54) int local54 = local46 * 256 / (Static58.anInt1635 + 256);
		@Pc(63) int local63 = Class79.anIntArray377[local12];
		@Pc(71) int local71 = local63 * 256 / (Static58.anInt1635 + 256);
		@Pc(82) int local82 = local54 * arg2 - arg5 * local71 >> 16;
		@Pc(92) int local92 = arg5 * local54 + arg2 * local71 >> 16;
		((Class2_Sub2_Sub16_Sub1) arg4).method2414(arg3.anInt3635 / 2 + arg1 + local92 - arg4.anInt3489 / 2, -(arg4.anInt3486 / 2) + arg3.anInt3660 / 2 + arg0 + -local82, arg3.anIntArray384, arg3.anIntArray385);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)I")
	public static int method1010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class79.anIntArray375[arg2 * 1024 / arg0] >> 1;
		return (arg1 * (65536 - local16) >> 16) + (arg3 * local16 >> 16);
	}
}
