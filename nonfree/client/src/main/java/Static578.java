import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Z")
	public static boolean aBoolean725;

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_148 = new Class47(80, 8);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B[[I)V")
	public static void method7715(@OriginalArg(1) int[][] arg0) {
		Static454.anIntArrayArray71 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIILclient!wv;)V")
	public static void method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub1_Sub1 arg3) {
		@Pc(11) Class118 local11 = arg3.method5891();
		@Pc(21) int local21 = arg3.anInt7055 - arg3.aClass354_7.anInt9527 & 0x3FFF;
		if (arg2 == -1) {
			if (local21 != 0 || arg3.anInt7075 > 25) {
				if (arg0 < 0 && local11.anInt3615 != -1) {
					arg3.anInt7100 = local11.anInt3615;
				} else if (arg0 <= 0 || local11.anInt3599 == -1) {
					arg3.anInt7100 = local11.anInt3612;
				} else {
					arg3.anInt7100 = local11.anInt3599;
				}
				arg3.aBoolean495 = false;
			} else if (!arg3.aBoolean495 || !local11.method3172(arg3.anInt7100)) {
				arg3.anInt7100 = local11.method3168();
				arg3.aBoolean495 = arg3.anInt7100 != -1;
			}
		} else if (arg3.anInt7123 != -1 && (local21 >= 10240 || local21 <= 2048)) {
			@Pc(277) int local277 = Static458.anIntArray568[arg1] - arg3.aClass354_7.anInt9527 & 0x3FFF;
			if (arg2 == 2 && local11.anInt3607 != -1) {
				if (local277 > 2048 && local277 <= 6144 && local11.anInt3593 != -1) {
					arg3.anInt7100 = local11.anInt3593;
				} else if (local277 >= 10240 && local277 < 14336 && local11.anInt3575 != -1) {
					arg3.anInt7100 = local11.anInt3575;
				} else if (local277 <= 6144 || local277 >= 10240 || local11.anInt3604 == -1) {
					arg3.anInt7100 = local11.anInt3607;
				} else {
					arg3.anInt7100 = local11.anInt3604;
				}
			} else if (arg2 == 0 && local11.anInt3590 != -1) {
				if (local277 > 2048 && local277 <= 6144 && local11.anInt3572 != -1) {
					arg3.anInt7100 = local11.anInt3572;
				} else if (local277 >= 10240 && local277 < 14336 && local11.anInt3610 != -1) {
					arg3.anInt7100 = local11.anInt3610;
				} else if (local277 <= 6144 || local277 >= 10240 || local11.anInt3606 == -1) {
					arg3.anInt7100 = local11.anInt3590;
				} else {
					arg3.anInt7100 = local11.anInt3606;
				}
			} else if (local277 > 2048 && local277 <= 6144 && local11.anInt3611 != -1) {
				arg3.anInt7100 = local11.anInt3611;
			} else if (local277 >= 10240 && local277 < 14336 && local11.anInt3600 != -1) {
				arg3.anInt7100 = local11.anInt3600;
			} else if (local277 <= 6144 || local277 >= 10240 || local11.anInt3583 == -1) {
				arg3.anInt7100 = local11.anInt3612;
			} else {
				arg3.anInt7100 = local11.anInt3583;
			}
			arg3.aBoolean495 = false;
		} else if (local21 == 0 && arg3.anInt7075 <= 25) {
			if (arg2 == 2 && local11.anInt3607 != -1) {
				arg3.anInt7100 = local11.anInt3607;
			} else if (arg2 == 0 && local11.anInt3590 != -1) {
				arg3.anInt7100 = local11.anInt3590;
			} else {
				arg3.anInt7100 = local11.anInt3612;
			}
			arg3.aBoolean495 = false;
		} else {
			arg3.aBoolean495 = false;
			if (arg2 == 2 && local11.anInt3607 != -1) {
				if (arg0 < 0 && local11.anInt3584 != -1) {
					arg3.anInt7100 = local11.anInt3584;
				} else if (arg0 <= 0 || local11.anInt3585 == -1) {
					arg3.anInt7100 = local11.anInt3607;
				} else {
					arg3.anInt7100 = local11.anInt3585;
				}
			} else if (arg2 == 0 && local11.anInt3590 != -1) {
				if (arg0 < 0 && local11.anInt3602 != -1) {
					arg3.anInt7100 = local11.anInt3602;
				} else if (arg0 <= 0 || local11.anInt3578 == -1) {
					arg3.anInt7100 = local11.anInt3590;
				} else {
					arg3.anInt7100 = local11.anInt3578;
				}
			} else if (arg0 < 0 && local11.anInt3594 != -1) {
				arg3.anInt7100 = local11.anInt3594;
			} else if (arg0 <= 0 || local11.anInt3597 == -1) {
				arg3.anInt7100 = local11.anInt3612;
			} else {
				arg3.anInt7100 = local11.anInt3597;
			}
		}
	}
}
