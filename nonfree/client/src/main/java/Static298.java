import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!te", name = "m", descriptor = "B")
	public static byte aByte73;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "I")
	public static int anInt5943;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	public static int anInt5944;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Lclient!ss;")
	public static final Class187 aClass187_1 = Static223.method3900();

	@OriginalMember(owner = "client!te", name = "i", descriptor = "I")
	public static int anInt5938 = -1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	public static void method5056() {
		Static235.aClass122_9.method4752(((float) Static144.anInt2893 * 0.1F + 0.7F) * 1.1523438F);
		Static235.aClass122_9.method4784(Static290.anInt5810, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static235.aClass122_9.method4718(Static18.anInt527, -1);
		Static235.aClass122_9.method4706(Static228.aClass113_2);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method5057() {
		Static236.aBooleanArray23 = null;
		Static225.anIntArray435 = null;
		Static118.anIntArray148 = null;
		Static13.aBoolean25 = false;
		Static9.anIntArray10 = null;
		Static136.aClipboard1 = null;
		Static203.method3543();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg4 + arg2;
		@Pc(15) int local15 = arg3 - arg2;
		for (@Pc(17) int local17 = arg4; local17 < local10; local17++) {
			Static162.method1731(arg1, Static196.anIntArrayArray37[local17], arg6, arg5);
		}
		@Pc(40) int local40 = arg1 - arg2;
		@Pc(45) int local45 = arg6 + arg2;
		for (@Pc(47) int local47 = arg3; local47 > local15; local47--) {
			Static162.method1731(arg1, Static196.anIntArrayArray37[local47], arg6, arg5);
		}
		for (@Pc(68) int local68 = local10; local68 <= local15; local68++) {
			@Pc(74) int[] local74 = Static196.anIntArrayArray37[local68];
			Static162.method1731(local45, local74, arg6, arg5);
			Static162.method1731(local40, local74, local45, arg0);
			Static162.method1731(arg1, local74, local40, arg5);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)S")
	public static short method5060(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(42) int local42 = local24 <= 64 ? local20 * local24 >> 7 : (127 - local24) * local20 >> 7;
		@Pc(46) int local46 = local24 + local42;
		@Pc(52) int local52;
		if (local46 == 0) {
			local52 = local42 << 1;
		} else {
			local52 = (local42 << 8) / local46;
		}
		return (short) (local46 | local52 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILclient!ps;)V")
	public static void method5062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub4_Sub4 arg3) {
		@Pc(9) Class54 local9 = arg3.method4201();
		@Pc(24) int local24 = arg3.anInt4885 - arg3.aClass193_7.anInt6100 & 0x3FFF;
		if (arg1 == -1) {
			if (local24 != 0 || arg3.anInt4923 > 25) {
				arg3.aBoolean285 = false;
				if (arg2 < 0 && local9.anInt1513 != -1) {
					arg3.anInt4911 = local9.anInt1513;
				} else if (arg2 <= 0 || local9.anInt1490 == -1) {
					arg3.anInt4911 = local9.anInt1493;
				} else {
					arg3.anInt4911 = local9.anInt1490;
				}
			} else if (!arg3.aBoolean285 || !local9.method1154(arg3.anInt4911)) {
				arg3.anInt4911 = local9.method1157();
				arg3.aBoolean285 = arg3.anInt4911 != -1;
			}
		} else if (arg3.anInt4942 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(109) int local109 = Static51.anIntArray67[arg0] - arg3.aClass193_7.anInt6100 & 0x3FFF;
			arg3.aBoolean285 = false;
			if (arg1 == 2 && local9.anInt1509 != -1) {
				if (local109 > 2048 && local109 <= 6144 && local9.anInt1505 != -1) {
					arg3.anInt4911 = local9.anInt1505;
				} else if (local109 >= 10240 && local109 < 14336 && local9.anInt1498 != -1) {
					arg3.anInt4911 = local9.anInt1498;
				} else if (local109 <= 6144 || local109 >= 10240 || local9.anInt1491 == -1) {
					arg3.anInt4911 = local9.anInt1509;
				} else {
					arg3.anInt4911 = local9.anInt1491;
				}
			} else if (arg1 == 0 && local9.anInt1499 != -1) {
				if (local109 > 2048 && local109 <= 6144 && local9.anInt1475 != -1) {
					arg3.anInt4911 = local9.anInt1475;
				} else if (local109 >= 10240 && local109 < 14336 && local9.anInt1482 != -1) {
					arg3.anInt4911 = local9.anInt1482;
				} else if (local109 <= 6144 || local109 >= 10240 || local9.anInt1473 == -1) {
					arg3.anInt4911 = local9.anInt1499;
				} else {
					arg3.anInt4911 = local9.anInt1473;
				}
			} else if (local109 > 2048 && local109 <= 6144 && local9.anInt1506 != -1) {
				arg3.anInt4911 = local9.anInt1506;
			} else if (local109 >= 10240 && local109 < 14336 && local9.anInt1476 != -1) {
				arg3.anInt4911 = local9.anInt1476;
			} else if (local109 <= 6144 || local109 >= 10240 || local9.anInt1488 == -1) {
				arg3.anInt4911 = local9.anInt1493;
			} else {
				arg3.anInt4911 = local9.anInt1488;
			}
		} else if (local24 == 0 && arg3.anInt4923 <= 25) {
			if (arg1 == 2 && local9.anInt1509 != -1) {
				arg3.anInt4911 = local9.anInt1509;
			} else if (arg1 == 0 && local9.anInt1499 != -1) {
				arg3.anInt4911 = local9.anInt1499;
			} else {
				arg3.anInt4911 = local9.anInt1493;
			}
			arg3.aBoolean285 = false;
		} else {
			arg3.aBoolean285 = false;
			if (arg1 == 2 && local9.anInt1509 != -1) {
				if (arg2 < 0 && local9.anInt1500 != -1) {
					arg3.anInt4911 = local9.anInt1500;
				} else if (arg2 <= 0 || local9.anInt1479 == -1) {
					arg3.anInt4911 = local9.anInt1509;
				} else {
					arg3.anInt4911 = local9.anInt1479;
				}
			} else if (arg1 == 0 && local9.anInt1499 != -1) {
				if (arg2 < 0 && local9.anInt1504 != -1) {
					arg3.anInt4911 = local9.anInt1504;
				} else if (arg2 <= 0 || local9.anInt1484 == -1) {
					arg3.anInt4911 = local9.anInt1499;
				} else {
					arg3.anInt4911 = local9.anInt1484;
				}
			} else if (arg2 < 0 && local9.anInt1510 != -1) {
				arg3.anInt4911 = local9.anInt1510;
			} else if (arg2 <= 0 || local9.anInt1501 == -1) {
				arg3.anInt4911 = local9.anInt1493;
			} else {
				arg3.anInt4911 = local9.anInt1501;
			}
		}
	}
}
