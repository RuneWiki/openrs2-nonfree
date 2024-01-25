import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	public static int anInt8825;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
	public static void method7795(@OriginalArg(0) int arg0) {
		Static538.anInt9382 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZII)Z")
	public static boolean method7796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!fm;III)V")
	public static void method7797(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub3_Sub3_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class248 local16 = arg1.method3673();
		@Pc(26) int local26 = arg1.anInt3993 - arg1.aClass106_7.anInt3524 & 0x3FFF;
		if (arg2 == -1) {
			if (local26 != 0 || arg1.anInt4026 > 25) {
				if (arg3 < 0 && local16.anInt7446 != -1) {
					arg1.aBoolean314 = false;
					arg1.anInt3968 = local16.anInt7446;
				} else if (arg3 <= 0 || local16.anInt7449 == -1) {
					arg1.anInt3968 = local16.anInt7434;
				} else {
					arg1.anInt3968 = local16.anInt7449;
				}
				arg1.aBoolean314 = false;
			} else if (!arg1.aBoolean314 || !local16.method6618(arg1.anInt3968)) {
				arg1.anInt3968 = local16.method6615();
				arg1.aBoolean314 = arg1.anInt3968 != -1;
			}
		} else if (arg1.anInt3979 != -1 && (local26 >= 10240 || local26 <= 2048)) {
			@Pc(124) int local124 = Static12.anIntArray4[arg0] - arg1.aClass106_7.anInt3524 & 0x3FFF;
			arg1.aBoolean314 = false;
			if (arg2 == 2 && local16.anInt7475 != -1) {
				if (local124 > 2048 && local124 <= 6144 && local16.anInt7472 != -1) {
					arg1.anInt3968 = local16.anInt7472;
				} else if (local124 >= 10240 && local124 < 14336 && local16.anInt7447 != -1) {
					arg1.anInt3968 = local16.anInt7447;
				} else if (local124 <= 6144 || local124 >= 10240 || local16.anInt7443 == -1) {
					arg1.anInt3968 = local16.anInt7475;
				} else {
					arg1.anInt3968 = local16.anInt7443;
				}
			} else if (arg2 == 0 && local16.anInt7440 != -1) {
				if (local124 > 2048 && local124 <= 6144 && local16.anInt7451 != -1) {
					arg1.anInt3968 = local16.anInt7451;
				} else if (local124 >= 10240 && local124 < 14336 && local16.anInt7437 != -1) {
					arg1.anInt3968 = local16.anInt7437;
				} else if (local124 <= 6144 || local124 >= 10240 || local16.anInt7458 == -1) {
					arg1.anInt3968 = local16.anInt7440;
				} else {
					arg1.anInt3968 = local16.anInt7458;
				}
			} else if (local124 > 2048 && local124 <= 6144 && local16.anInt7461 != -1) {
				arg1.anInt3968 = local16.anInt7461;
			} else if (local124 >= 10240 && local124 < 14336 && local16.anInt7455 != -1) {
				arg1.anInt3968 = local16.anInt7455;
			} else if (local124 <= 6144 || local124 >= 10240 || local16.anInt7433 == -1) {
				arg1.anInt3968 = local16.anInt7434;
			} else {
				arg1.anInt3968 = local16.anInt7433;
			}
		} else if (local26 == 0 && arg1.anInt4026 <= 25) {
			if (arg2 == 2 && local16.anInt7475 != -1) {
				arg1.anInt3968 = local16.anInt7475;
			} else if (arg2 == 0 && local16.anInt7440 != -1) {
				arg1.anInt3968 = local16.anInt7440;
			} else {
				arg1.anInt3968 = local16.anInt7434;
			}
			arg1.aBoolean314 = false;
		} else {
			if (arg2 == 2 && local16.anInt7475 != -1) {
				if (arg3 < 0 && local16.anInt7457 != -1) {
					arg1.anInt3968 = local16.anInt7457;
				} else if (arg3 <= 0 || local16.anInt7476 == -1) {
					arg1.anInt3968 = local16.anInt7475;
				} else {
					arg1.anInt3968 = local16.anInt7476;
				}
			} else if (arg2 == 0 && local16.anInt7440 != -1) {
				if (arg3 < 0 && local16.anInt7442 != -1) {
					arg1.anInt3968 = local16.anInt7442;
				} else if (arg3 <= 0 || local16.anInt7463 == -1) {
					arg1.anInt3968 = local16.anInt7440;
				} else {
					arg1.anInt3968 = local16.anInt7463;
				}
			} else if (arg3 < 0 && local16.anInt7473 != -1) {
				arg1.anInt3968 = local16.anInt7473;
			} else if (arg3 <= 0 || local16.anInt7444 == -1) {
				arg1.anInt3968 = local16.anInt7434;
			} else {
				arg1.anInt3968 = local16.anInt7444;
			}
			arg1.aBoolean314 = false;
		}
	}
}
