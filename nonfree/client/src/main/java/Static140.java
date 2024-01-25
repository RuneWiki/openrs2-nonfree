import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
	public static int anInt2877;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Lclient!qh;")
	public static Class24_Sub5 method2396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass24_Sub5_2;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLclient!mv;Lclient!mv;BI)I")
	public static int method2397(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class56_Sub1 arg1, @OriginalArg(2) Class56_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg3 == 1) {
			local11 = arg1.anInt4652;
			local14 = arg2.anInt4652;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg3 == 2) {
			return Static208.method3231(arg1.method3769().aString65, Static191.anInt3842, arg2.method3769().aString65);
		} else if (arg3 == 3) {
			if (arg1.aString50.equals("-")) {
				if (arg2.aString50.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString50.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static208.method3231(arg1.aString50, Static191.anInt3842, arg2.aString50);
			}
		} else if (arg3 == 4) {
			if (arg1.method3767()) {
				return arg2.method3767() ? 0 : 1;
			} else if (arg2.method3767()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method3763()) {
				return arg2.method3763() ? 0 : 1;
			} else if (arg2.method3763()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method3765()) {
				return arg2.method3765() ? 0 : 1;
			} else if (arg2.method3765()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method3766()) {
				return arg2.method3766() ? 0 : 1;
			} else if (arg2.method3766()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local11 = arg1.anInt4661;
			local14 = arg2.anInt4661;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local11 == -1) {
					local11 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg1.anInt4663 - arg2.anInt4663;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2398(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class10_Sub8 local8 = new Class10_Sub8(arg0);
		@Pc(17) int local17 = local8.method2502();
		@Pc(21) int local21 = local8.method2459();
		if (local21 < 0 || Static80.anInt1677 != 0 && local21 > Static80.anInt1677) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(44) byte[] local44 = new byte[local21];
			local8.method2493(local21, local44);
			return local44;
		} else {
			@Pc(56) int local56 = local8.method2459();
			if (local56 < 0 || Static80.anInt1677 != 0 && local56 > Static80.anInt1677) {
				throw new RuntimeException();
			}
			@Pc(73) byte[] local73 = new byte[local56];
			if (local17 == 1) {
				Static213.method3268(local73, local56, arg0, local21);
			} else {
				Static29.aClass111_1.method2685(local8, local73);
			}
			return local73;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBII)V")
	public static void method2399(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			Static310.method4308(Static76.aClass27_29);
		}
		if (arg2 == 1) {
			Static310.method4308(Static178.aClass27_62);
		}
		Static337.aClass10_Sub8_Sub2_2.method2464(Static197.aClass245_1.method5907(82) ? 1 : 0);
		Static337.aClass10_Sub8_Sub2_2.method2497(arg0 + Static72.anInt1488);
		Static337.aClass10_Sub8_Sub2_2.method2497(Static168.anInt3353 + arg1);
		Static457.anInt7597 = arg0;
		Static336.aBoolean367 = false;
		Static297.anInt5146 = arg1;
		Static245.method3582();
	}
}
