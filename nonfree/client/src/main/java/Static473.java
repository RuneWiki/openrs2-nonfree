import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!rr", name = "A", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_128 = new Class349(90, 6);

	@OriginalMember(owner = "client!rr", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray51 = new int[128][128];

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!eda;Lclient!eda;BI)I")
	public static int method6135(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class86_Sub1 arg1, @OriginalArg(2) Class86_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg3 == 1) {
			local9 = arg2.anInt1978;
			local12 = arg1.anInt1978;
			if (!arg0) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg3 == 2) {
			return Static96.method1457(arg1.method1663().aString114, arg2.method1663().aString114, Static261.anInt4297);
		} else if (arg3 == 3) {
			if (arg2.aString23.equals("-")) {
				if (arg1.aString23.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString23.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static96.method1457(arg1.aString23, arg2.aString23, Static261.anInt4297);
			}
		} else if (arg3 == 4) {
			if (arg2.method1658()) {
				return arg1.method1658() ? 0 : 1;
			} else if (arg1.method1658()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg2.method1653()) {
				return arg1.method1653() ? 0 : 1;
			} else if (arg1.method1653()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg2.method1654()) {
				return arg1.method1654() ? 0 : 1;
			} else if (arg1.method1654()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg2.method1655()) {
				return arg1.method1655() ? 0 : 1;
			} else if (arg1.method1655()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local9 = arg2.anInt1988;
			local12 = arg1.anInt1988;
			if (arg0) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg2.anInt1989 - arg1.anInt1989;
		}
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
	public static void method6136() {
		Static494.aBoolean666 = true;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIZI)I")
	public static int method6137(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub16 local13 = Static261.method3663(arg0, arg1);
		if (local13 == null) {
			return 0;
		} else if (arg2 >= 0 && local13.anIntArray214.length > arg2) {
			return local13.anIntArray214[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V")
	public static void method6139(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 7);
		local8.method6229();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!u;I)I")
	public static int method6141(@OriginalArg(0) Class12_Sub2_Sub1_Sub4_Sub2 arg0) {
		@Pc(8) Class295 local8 = arg0.aClass295_1;
		if (local8.anIntArray493 != null) {
			local8 = local8.method5942(Static426.aClass160_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt7355;
		@Pc(27) Class61 local27 = arg0.method6767();
		if (arg0.anInt8351 == -1 || arg0.aBoolean710) {
			local23 = local8.anInt7328;
		} else if (arg0.anInt8351 == local27.anInt1317 || arg0.anInt8351 == local27.anInt1325 || arg0.anInt8351 == local27.anInt1331 || arg0.anInt8351 == local27.anInt1328) {
			local23 = local8.anInt7357;
		} else if (arg0.anInt8351 == local27.anInt1301 || arg0.anInt8351 == local27.anInt1309 || arg0.anInt8351 == local27.anInt1312 || arg0.anInt8351 == local27.anInt1298) {
			local23 = local8.anInt7349;
		}
		return local23;
	}
}
