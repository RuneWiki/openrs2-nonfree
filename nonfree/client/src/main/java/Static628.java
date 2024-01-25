import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	public static int anInt10402;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!uq;")
	public static Class362 aClass362_150;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIILclient!qba;I)V")
	public static void method8495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34_Sub1_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class286 local9 = arg2.method7878();
		@Pc(23) int local23 = arg2.anInt9636 - arg2.aClass292_7.anInt7699 & 0x3FFF;
		if (arg3 == -1) {
			if (local23 != 0 || arg2.anInt9690 > 25) {
				if (arg1 < 0 && local9.anInt7541 != -1) {
					arg2.anInt9647 = local9.anInt7541;
					arg2.aBoolean673 = false;
				} else if (arg1 <= 0 || local9.anInt7550 == -1) {
					arg2.anInt9647 = local9.anInt7552;
				} else {
					arg2.anInt9647 = local9.anInt7550;
				}
				arg2.aBoolean673 = false;
			} else if (!arg2.aBoolean673 || !local9.method6292(arg2.anInt9647)) {
				arg2.anInt9647 = local9.method6294();
				arg2.aBoolean673 = arg2.anInt9647 != -1;
			}
		} else if (arg2.anInt9673 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(51) int local51 = Static322.anIntArray306[arg0] - arg2.aClass292_7.anInt7699 & 0x3FFF;
			arg2.aBoolean673 = false;
			if (arg3 == 2 && local9.anInt7545 != -1) {
				if (local51 > 2048 && local51 <= 6144 && local9.anInt7525 != -1) {
					arg2.anInt9647 = local9.anInt7525;
				} else if (local51 >= 10240 && local51 < 14336 && local9.anInt7517 != -1) {
					arg2.anInt9647 = local9.anInt7517;
				} else if (local51 <= 6144 || local51 >= 10240 || local9.anInt7513 == -1) {
					arg2.anInt9647 = local9.anInt7545;
				} else {
					arg2.anInt9647 = local9.anInt7513;
				}
			} else if (arg3 == 0 && local9.anInt7510 != -1) {
				if (local51 > 2048 && local51 <= 6144 && local9.anInt7535 != -1) {
					arg2.anInt9647 = local9.anInt7535;
				} else if (local51 >= 10240 && local51 < 14336 && local9.anInt7526 != -1) {
					arg2.anInt9647 = local9.anInt7526;
				} else if (local51 <= 6144 || local51 >= 10240 || local9.anInt7507 == -1) {
					arg2.anInt9647 = local9.anInt7510;
				} else {
					arg2.anInt9647 = local9.anInt7507;
				}
			} else if (local51 > 2048 && local51 <= 6144 && local9.anInt7542 != -1) {
				arg2.anInt9647 = local9.anInt7542;
			} else if (local51 >= 10240 && local51 < 14336 && local9.anInt7530 != -1) {
				arg2.anInt9647 = local9.anInt7530;
			} else if (local51 <= 6144 || local51 >= 10240 || local9.anInt7533 == -1) {
				arg2.anInt9647 = local9.anInt7552;
			} else {
				arg2.anInt9647 = local9.anInt7533;
			}
		} else if (local23 == 0 && arg2.anInt9690 <= 25) {
			if (arg3 == 2 && local9.anInt7545 != -1) {
				arg2.anInt9647 = local9.anInt7545;
			} else if (arg3 == 0 && local9.anInt7510 != -1) {
				arg2.anInt9647 = local9.anInt7510;
			} else {
				arg2.anInt9647 = local9.anInt7552;
			}
			arg2.aBoolean673 = false;
		} else {
			arg2.aBoolean673 = false;
			if (arg3 == 2 && local9.anInt7545 != -1) {
				if (arg1 < 0 && local9.anInt7549 != -1) {
					arg2.anInt9647 = local9.anInt7549;
				} else if (arg1 <= 0 || local9.anInt7512 == -1) {
					arg2.anInt9647 = local9.anInt7545;
				} else {
					arg2.anInt9647 = local9.anInt7512;
				}
			} else if (arg3 == 0 && local9.anInt7510 != -1) {
				if (arg1 < 0 && local9.anInt7536 != -1) {
					arg2.anInt9647 = local9.anInt7536;
				} else if (arg1 <= 0 || local9.anInt7514 == -1) {
					arg2.anInt9647 = local9.anInt7510;
				} else {
					arg2.anInt9647 = local9.anInt7514;
				}
			} else if (arg1 < 0 && local9.anInt7503 != -1) {
				arg2.anInt9647 = local9.anInt7503;
			} else if (arg1 <= 0 || local9.anInt7524 == -1) {
				arg2.anInt9647 = local9.anInt7552;
			} else {
				arg2.anInt9647 = local9.anInt7524;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
	public static void method8496(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static185.method2900(arg0)) {
			Static417.method5666(arg1, Static270.aClass265ArrayArray2[arg0]);
		}
	}
}
