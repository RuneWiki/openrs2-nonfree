import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)V")
	public static void method336(@OriginalArg(1) int arg0) {
		if (Static445.anInt7975 == 0) {
			Static387.aClass6_Sub4_Sub2_3.method746(arg0);
		} else {
			Static387.anInt6869 = arg0;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IILclient!bn;II)V")
	public static void method337(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class246 local9 = arg1.method5513();
		@Pc(19) int local19 = arg1.anInt6583 - arg1.aClass214_7.anInt5929 & 0x3FFF;
		if (arg3 == -1) {
			if (local19 != 0 || arg1.anInt6573 > 25) {
				if (arg2 < 0 && local9.anInt7319 != -1) {
					arg1.anInt6597 = local9.anInt7319;
				} else if (arg2 <= 0 || local9.anInt7323 == -1) {
					arg1.anInt6597 = local9.anInt7318;
				} else {
					arg1.anInt6597 = local9.anInt7323;
				}
				arg1.aBoolean418 = false;
			} else if (!arg1.aBoolean418 || !local9.method6014(arg1.anInt6597)) {
				arg1.anInt6597 = local9.method6015();
				arg1.aBoolean418 = arg1.anInt6597 != -1;
			}
		} else if (arg1.anInt6569 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(45) int local45 = Static3.anIntArray9[arg0] - arg1.aClass214_7.anInt5929 & 0x3FFF;
			if (arg3 == 2 && local9.anInt7296 != -1) {
				if (local45 > 2048 && local45 <= 6144 && local9.anInt7293 != -1) {
					arg1.anInt6597 = local9.anInt7293;
				} else if (local45 >= 10240 && local45 < 14336 && local9.anInt7315 != -1) {
					arg1.anInt6597 = local9.anInt7315;
				} else if (local45 <= 6144 || local45 >= 10240 || local9.anInt7311 == -1) {
					arg1.anInt6597 = local9.anInt7296;
				} else {
					arg1.anInt6597 = local9.anInt7311;
				}
			} else if (arg3 == 0 && local9.anInt7325 != -1) {
				if (local45 > 2048 && local45 <= 6144 && local9.anInt7327 != -1) {
					arg1.anInt6597 = local9.anInt7327;
				} else if (local45 >= 10240 && local45 < 14336 && local9.anInt7308 != -1) {
					arg1.anInt6597 = local9.anInt7308;
				} else if (local45 <= 6144 || local45 >= 10240 || local9.anInt7322 == -1) {
					arg1.anInt6597 = local9.anInt7325;
				} else {
					arg1.anInt6597 = local9.anInt7322;
				}
			} else if (local45 > 2048 && local45 <= 6144 && local9.anInt7304 != -1) {
				arg1.anInt6597 = local9.anInt7304;
			} else if (local45 >= 10240 && local45 < 14336 && local9.anInt7334 != -1) {
				arg1.anInt6597 = local9.anInt7334;
			} else if (local45 <= 6144 || local45 >= 10240 || local9.anInt7336 == -1) {
				arg1.anInt6597 = local9.anInt7318;
			} else {
				arg1.anInt6597 = local9.anInt7336;
			}
			arg1.aBoolean418 = false;
		} else if (local19 == 0 && arg1.anInt6573 <= 25) {
			if (arg3 == 2 && local9.anInt7296 != -1) {
				arg1.anInt6597 = local9.anInt7296;
			} else if (arg3 == 0 && local9.anInt7325 != -1) {
				arg1.anInt6597 = local9.anInt7325;
			} else {
				arg1.anInt6597 = local9.anInt7318;
			}
			arg1.aBoolean418 = false;
		} else {
			if (arg3 == 2 && local9.anInt7296 != -1) {
				if (arg2 < 0 && local9.anInt7317 != -1) {
					arg1.anInt6597 = local9.anInt7317;
				} else if (arg2 <= 0 || local9.anInt7302 == -1) {
					arg1.anInt6597 = local9.anInt7296;
				} else {
					arg1.anInt6597 = local9.anInt7302;
				}
			} else if (arg3 == 0 && local9.anInt7325 != -1) {
				if (arg2 < 0 && local9.anInt7333 != -1) {
					arg1.anInt6597 = local9.anInt7333;
				} else if (arg2 <= 0 || local9.anInt7316 == -1) {
					arg1.anInt6597 = local9.anInt7325;
				} else {
					arg1.anInt6597 = local9.anInt7316;
				}
			} else if (arg2 < 0 && local9.anInt7297 != -1) {
				arg1.anInt6597 = local9.anInt7297;
			} else if (arg2 <= 0 || local9.anInt7309 == -1) {
				arg1.anInt6597 = local9.anInt7318;
			} else {
				arg1.anInt6597 = local9.anInt7309;
			}
			arg1.aBoolean418 = false;
		}
	}
}
