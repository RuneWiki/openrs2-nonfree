import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_34 = new Class288(260);

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Lclient!ml;")
	public static final Class199 aClass199_5 = new Class199("WTI", 5);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!hn;IIII)V")
	public static void method4083(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class281 local9 = arg0.method4026();
		@Pc(24) int local24 = arg0.anInt4747 - arg0.aClass257_7.anInt7554 & 0x3FFF;
		if (arg3 == -1) {
			if (local24 != 0 || arg0.anInt4696 > 25) {
				if (arg1 < 0 && local9.anInt8122 != -1) {
					arg0.anInt4725 = local9.anInt8122;
				} else if (arg1 <= 0 || local9.anInt8123 == -1) {
					arg0.anInt4725 = local9.anInt8134;
				} else {
					arg0.anInt4725 = local9.anInt8123;
				}
				arg0.aBoolean299 = false;
			} else if (!arg0.aBoolean299 || !local9.method6590(arg0.anInt4725)) {
				arg0.anInt4725 = local9.method6588();
				arg0.aBoolean299 = arg0.anInt4725 != -1;
			}
		} else if (arg0.anInt4720 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(279) int local279 = Static179.anIntArray259[arg2] - arg0.aClass257_7.anInt7554 & 0x3FFF;
			if (arg3 == 2 && local9.anInt8093 != -1) {
				if (local279 > 2048 && local279 <= 6144 && local9.anInt8113 != -1) {
					arg0.anInt4725 = local9.anInt8113;
				} else if (local279 >= 10240 && local279 < 14336 && local9.anInt8121 != -1) {
					arg0.anInt4725 = local9.anInt8121;
				} else if (local279 <= 6144 || local279 >= 10240 || local9.anInt8117 == -1) {
					arg0.anInt4725 = local9.anInt8093;
				} else {
					arg0.anInt4725 = local9.anInt8117;
				}
			} else if (arg3 == 0 && local9.anInt8124 != -1) {
				if (local279 > 2048 && local279 <= 6144 && local9.anInt8116 != -1) {
					arg0.anInt4725 = local9.anInt8116;
				} else if (local279 >= 10240 && local279 < 14336 && local9.anInt8098 != -1) {
					arg0.anInt4725 = local9.anInt8098;
				} else if (local279 <= 6144 || local279 >= 10240 || local9.anInt8099 == -1) {
					arg0.anInt4725 = local9.anInt8124;
				} else {
					arg0.anInt4725 = local9.anInt8099;
				}
			} else if (local279 > 2048 && local279 <= 6144 && local9.anInt8133 != -1) {
				arg0.anInt4725 = local9.anInt8133;
			} else if (local279 >= 10240 && local279 < 14336 && local9.anInt8106 != -1) {
				arg0.anInt4725 = local9.anInt8106;
			} else if (local279 <= 6144 || local279 >= 10240 || local9.anInt8126 == -1) {
				arg0.anInt4725 = local9.anInt8134;
			} else {
				arg0.anInt4725 = local9.anInt8126;
			}
			arg0.aBoolean299 = false;
		} else if (local24 == 0 && arg0.anInt4696 <= 25) {
			if (arg3 == 2 && local9.anInt8093 != -1) {
				arg0.anInt4725 = local9.anInt8093;
			} else if (arg3 == 0 && local9.anInt8124 != -1) {
				arg0.anInt4725 = local9.anInt8124;
			} else {
				arg0.anInt4725 = local9.anInt8134;
			}
			arg0.aBoolean299 = false;
		} else {
			arg0.aBoolean299 = false;
			if (arg3 == 2 && local9.anInt8093 != -1) {
				if (arg1 < 0 && local9.anInt8107 != -1) {
					arg0.anInt4725 = local9.anInt8107;
				} else if (arg1 <= 0 || local9.anInt8132 == -1) {
					arg0.anInt4725 = local9.anInt8093;
				} else {
					arg0.anInt4725 = local9.anInt8132;
				}
			} else if (arg3 == 0 && local9.anInt8124 != -1) {
				if (arg1 < 0 && local9.anInt8096 != -1) {
					arg0.anInt4725 = local9.anInt8096;
				} else if (arg1 <= 0 || local9.anInt8118 == -1) {
					arg0.anInt4725 = local9.anInt8124;
				} else {
					arg0.anInt4725 = local9.anInt8118;
				}
			} else if (arg1 < 0 && local9.anInt8102 != -1) {
				arg0.anInt4725 = local9.anInt8102;
			} else if (arg1 <= 0 || local9.anInt8114 == -1) {
				arg0.anInt4725 = local9.anInt8134;
			} else {
				arg0.anInt4725 = local9.anInt8114;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(FFFIILclient!vo;FIFIB)[B")
	public static byte[] method4084(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(5) Class304 arg3, @OriginalArg(6) float arg4, @OriginalArg(8) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static372.method2816(arg5, arg4, local10, 0, arg0, arg2, arg1, arg3);
		return local10;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
	public static void method4085() {
		if (Static287.aBoolean405) {
			return;
		}
		Static474.aBoolean196 = true;
		if (Static300.aClass5_Sub28_Sub1_1.aBoolean334) {
			Static476.aFloat339 = (int) Static476.aFloat339 - 65 & 0xFFFFFF80;
		} else {
			Static124.aFloat137 += (-Static124.aFloat137 - 24.0F) / 2.0F;
		}
		Static287.aBoolean405 = true;
	}
}
