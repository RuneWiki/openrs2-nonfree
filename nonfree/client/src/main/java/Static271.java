import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!sb;")
	public static Class219 aClass219_4;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method3660() {
		if (Static309.aBoolean335) {
			return;
		}
		if (Static216.aClass1_Sub1_1.aBoolean297) {
			Static10.aFloat7 = (int) Static10.aFloat7 + 47 & 0xFFFFFFF0;
		} else {
			Static346.aFloat136 += (12.0F - Static346.aFloat136) / 2.0F;
		}
		Static309.aBoolean335 = true;
		Static324.aBoolean348 = true;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!fh;Z)Ljava/lang/String;")
	public static String method3662(@OriginalArg(0) Class5_Sub15 arg0) {
		return Static335.method4338(arg0);
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	public static void method3663() {
		Static255.aClass252_27.method5661();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BIIILclient!wl;)V")
	public static void method3664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub3 arg3) {
		@Pc(9) Class133 local9 = arg3.method4910();
		@Pc(19) int local19 = arg3.anInt6165 - arg3.aClass110_7.anInt2906 & 0x3FFF;
		if (arg1 == -1) {
			if (local19 != 0 || arg3.anInt6157 > 25) {
				arg3.aBoolean410 = false;
				if (arg2 < 0 && local9.anInt3548 != -1) {
					arg3.lb = local9.anInt3548;
				} else if (arg2 <= 0 || local9.anInt3529 == -1) {
					arg3.lb = local9.anInt3511;
				} else {
					arg3.lb = local9.anInt3529;
				}
			} else if (!arg3.aBoolean410 || !local9.method2808(arg3.lb)) {
				arg3.lb = local9.method2804();
				arg3.aBoolean410 = arg3.lb != -1;
			}
		} else if (arg3.anInt6176 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(47) int local47 = Static123.anIntArray121[arg0] - arg3.aClass110_7.anInt2906 & 0x3FFF;
			if (arg1 == 2 && local9.anInt3510 != -1) {
				if (local47 > 2048 && local47 <= 6144 && local9.anInt3526 != -1) {
					arg3.lb = local9.anInt3526;
				} else if (local47 >= 10240 && local47 < 14336 && local9.anInt3544 != -1) {
					arg3.lb = local9.anInt3544;
				} else if (local47 <= 6144 || local47 >= 10240 || local9.anInt3515 == -1) {
					arg3.lb = local9.anInt3510;
				} else {
					arg3.lb = local9.anInt3515;
				}
			} else if (arg1 == 0 && local9.anInt3507 != -1) {
				if (local47 > 2048 && local47 <= 6144 && local9.anInt3513 != -1) {
					arg3.lb = local9.anInt3513;
				} else if (local47 >= 10240 && local47 < 14336 && local9.anInt3532 != -1) {
					arg3.lb = local9.anInt3532;
				} else if (local47 <= 6144 || local47 >= 10240 || local9.anInt3542 == -1) {
					arg3.lb = local9.anInt3507;
				} else {
					arg3.lb = local9.anInt3542;
				}
			} else if (local47 > 2048 && local47 <= 6144 && local9.anInt3536 != -1) {
				arg3.lb = local9.anInt3536;
			} else if (local47 >= 10240 && local47 < 14336 && local9.anInt3543 != -1) {
				arg3.lb = local9.anInt3543;
			} else if (local47 <= 6144 || local47 >= 10240 || local9.anInt3509 == -1) {
				arg3.lb = local9.anInt3511;
			} else {
				arg3.lb = local9.anInt3509;
			}
			arg3.aBoolean410 = false;
		} else if (local19 == 0 && arg3.anInt6157 <= 25) {
			if (arg1 == 2 && local9.anInt3510 != -1) {
				arg3.lb = local9.anInt3510;
			} else if (arg1 == 0 && local9.anInt3507 != -1) {
				arg3.lb = local9.anInt3507;
			} else {
				arg3.lb = local9.anInt3511;
			}
			arg3.aBoolean410 = false;
		} else {
			arg3.aBoolean410 = false;
			if (arg1 == 2 && local9.anInt3510 != -1) {
				if (arg2 < 0 && local9.anInt3527 != -1) {
					arg3.lb = local9.anInt3527;
				} else if (arg2 <= 0 || local9.anInt3517 == -1) {
					arg3.lb = local9.anInt3510;
				} else {
					arg3.lb = local9.anInt3517;
				}
			} else if (arg1 == 0 && local9.anInt3507 != -1) {
				if (arg2 < 0 && local9.anInt3518 != -1) {
					arg3.lb = local9.anInt3518;
				} else if (arg2 <= 0 || local9.anInt3541 == -1) {
					arg3.lb = local9.anInt3507;
				} else {
					arg3.lb = local9.anInt3541;
				}
			} else if (arg2 < 0 && local9.anInt3539 != -1) {
				arg3.lb = local9.anInt3539;
			} else if (arg2 <= 0 || local9.anInt3524 == -1) {
				arg3.lb = local9.anInt3511;
			} else {
				arg3.lb = local9.anInt3524;
			}
		}
	}
}
