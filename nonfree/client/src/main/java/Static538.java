import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public static int anInt9806 = -1;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ufa;IIBI)V")
	public static void method7538(@OriginalArg(0) Class21_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class252 local9 = arg0.method3322();
		@Pc(26) int local26 = arg0.anInt4228 - arg0.aClass133_7.anInt3807 & 0x3FFF;
		if (arg3 == -1) {
			if (local26 != 0 || arg0.anInt4218 > 25) {
				if (arg2 < 0 && local9.anInt7490 != -1) {
					arg0.aBoolean294 = false;
					arg0.anInt4254 = local9.anInt7490;
				} else if (arg2 <= 0 || local9.anInt7474 == -1) {
					arg0.anInt4254 = local9.anInt7494;
				} else {
					arg0.anInt4254 = local9.anInt7474;
				}
				arg0.aBoolean294 = false;
			} else if (!arg0.aBoolean294 || !local9.method5904(arg0.anInt4254)) {
				arg0.anInt4254 = local9.method5906();
				arg0.aBoolean294 = arg0.anInt4254 != -1;
			}
		} else if (arg0.anInt4263 != -1 && (local26 >= 10240 || local26 <= 2048)) {
			@Pc(284) int local284 = Static159.anIntArray160[arg1] - arg0.aClass133_7.anInt3807 & 0x3FFF;
			arg0.aBoolean294 = false;
			if (arg3 == 2 && local9.anInt7486 != -1) {
				if (local284 > 2048 && local284 <= 6144 && local9.anInt7518 != -1) {
					arg0.anInt4254 = local9.anInt7518;
				} else if (local284 >= 10240 && local284 < 14336 && local9.anInt7511 != -1) {
					arg0.anInt4254 = local9.anInt7511;
				} else if (local284 <= 6144 || local284 >= 10240 || local9.anInt7504 == -1) {
					arg0.anInt4254 = local9.anInt7486;
				} else {
					arg0.anInt4254 = local9.anInt7504;
				}
			} else if (arg3 == 0 && local9.anInt7478 != -1) {
				if (local284 > 2048 && local284 <= 6144 && local9.anInt7516 != -1) {
					arg0.anInt4254 = local9.anInt7516;
				} else if (local284 >= 10240 && local284 < 14336 && local9.anInt7492 != -1) {
					arg0.anInt4254 = local9.anInt7492;
				} else if (local284 <= 6144 || local284 >= 10240 || local9.anInt7484 == -1) {
					arg0.anInt4254 = local9.anInt7478;
				} else {
					arg0.anInt4254 = local9.anInt7484;
				}
			} else if (local284 > 2048 && local284 <= 6144 && local9.anInt7496 != -1) {
				arg0.anInt4254 = local9.anInt7496;
			} else if (local284 >= 10240 && local284 < 14336 && local9.anInt7493 != -1) {
				arg0.anInt4254 = local9.anInt7493;
			} else if (local284 <= 6144 || local284 >= 10240 || local9.anInt7497 == -1) {
				arg0.anInt4254 = local9.anInt7494;
			} else {
				arg0.anInt4254 = local9.anInt7497;
			}
		} else if (local26 == 0 && arg0.anInt4218 <= 25) {
			if (arg3 == 2 && local9.anInt7486 != -1) {
				arg0.anInt4254 = local9.anInt7486;
			} else if (arg3 == 0 && local9.anInt7478 != -1) {
				arg0.anInt4254 = local9.anInt7478;
			} else {
				arg0.anInt4254 = local9.anInt7494;
			}
			arg0.aBoolean294 = false;
		} else {
			if (arg3 == 2 && local9.anInt7486 != -1) {
				if (arg2 < 0 && local9.anInt7502 != -1) {
					arg0.anInt4254 = local9.anInt7502;
				} else if (arg2 <= 0 || local9.anInt7519 == -1) {
					arg0.anInt4254 = local9.anInt7486;
				} else {
					arg0.anInt4254 = local9.anInt7519;
				}
			} else if (arg3 == 0 && local9.anInt7478 != -1) {
				if (arg2 < 0 && local9.anInt7508 != -1) {
					arg0.anInt4254 = local9.anInt7508;
				} else if (arg2 <= 0 || local9.anInt7482 == -1) {
					arg0.anInt4254 = local9.anInt7478;
				} else {
					arg0.anInt4254 = local9.anInt7482;
				}
			} else if (arg2 < 0 && local9.anInt7510 != -1) {
				arg0.anInt4254 = local9.anInt7510;
			} else if (arg2 <= 0 || local9.anInt7500 == -1) {
				arg0.anInt4254 = local9.anInt7494;
			} else {
				arg0.anInt4254 = local9.anInt7500;
			}
			arg0.aBoolean294 = false;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!sj;I)V")
	public static void method7540(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13_Sub2 arg1) {
		Static394.aBoolean561 = false;
		Static124.anInt2827 = 0;
		Static180.method7444(arg1);
		Static427.method6370(arg1);
		if (Static394.aBoolean561) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt9170 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt9170 + " psize:" + arg0);
		}
	}
}
