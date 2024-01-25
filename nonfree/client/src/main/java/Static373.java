import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!sg", name = "dd", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array42;

	@OriginalMember(owner = "client!sg", name = "Gc", descriptor = "F")
	public static float aFloat89 = 1.0F;

	@OriginalMember(owner = "client!sg", name = "Mc", descriptor = "I")
	public static int anInt6559 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBLclient!uc;II)V")
	public static void method5314(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub5_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class231 local14 = arg1.method5306();
		@Pc(24) int local24 = arg1.anInt6511 - arg1.aClass102_7.anInt3248 & 0x3FFF;
		if (arg2 == -1) {
			if (local24 != 0 || arg1.anInt6539 > 25) {
				arg1.aBoolean475 = false;
				if (arg0 < 0 && local14.anInt6392 != -1) {
					arg1.anInt6484 = local14.anInt6392;
				} else if (arg0 <= 0 || local14.anInt6421 == -1) {
					arg1.anInt6484 = local14.anInt6391;
				} else {
					arg1.anInt6484 = local14.anInt6421;
				}
			} else if (!arg1.aBoolean475 || !local14.method5239(arg1.anInt6484)) {
				arg1.anInt6484 = local14.method5240();
				arg1.aBoolean475 = arg1.anInt6484 != -1;
			}
		} else if (arg1.anInt6495 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(292) int local292 = Static316.anIntArray462[arg3] - arg1.aClass102_7.anInt3248 & 0x3FFF;
			arg1.aBoolean475 = false;
			if (arg2 == 2 && local14.anInt6389 != -1) {
				if (local292 > 2048 && local292 <= 6144 && local14.anInt6397 != -1) {
					arg1.anInt6484 = local14.anInt6397;
				} else if (local292 >= 10240 && local292 < 14336 && local14.anInt6404 != -1) {
					arg1.anInt6484 = local14.anInt6404;
				} else if (local292 <= 6144 || local292 >= 10240 || local14.anInt6423 == -1) {
					arg1.anInt6484 = local14.anInt6389;
				} else {
					arg1.anInt6484 = local14.anInt6423;
				}
			} else if (arg2 == 0 && local14.anInt6422 != -1) {
				if (local292 > 2048 && local292 <= 6144 && local14.anInt6396 != -1) {
					arg1.anInt6484 = local14.anInt6396;
				} else if (local292 >= 10240 && local292 < 14336 && local14.anInt6412 != -1) {
					arg1.anInt6484 = local14.anInt6412;
				} else if (local292 <= 6144 || local292 >= 10240 || local14.anInt6414 == -1) {
					arg1.anInt6484 = local14.anInt6422;
				} else {
					arg1.anInt6484 = local14.anInt6414;
				}
			} else if (local292 > 2048 && local292 <= 6144 && local14.anInt6425 != -1) {
				arg1.anInt6484 = local14.anInt6425;
			} else if (local292 >= 10240 && local292 < 14336 && local14.anInt6410 != -1) {
				arg1.anInt6484 = local14.anInt6410;
			} else if (local292 <= 6144 || local292 >= 10240 || local14.anInt6407 == -1) {
				arg1.anInt6484 = local14.anInt6391;
			} else {
				arg1.anInt6484 = local14.anInt6407;
			}
		} else if (local24 == 0 && arg1.anInt6539 <= 25) {
			arg1.aBoolean475 = false;
			if (arg2 == 2 && local14.anInt6389 != -1) {
				arg1.anInt6484 = local14.anInt6389;
			} else if (arg2 == 0 && local14.anInt6422 != -1) {
				arg1.anInt6484 = local14.anInt6422;
			} else {
				arg1.anInt6484 = local14.anInt6391;
			}
		} else {
			if (arg2 == 2 && local14.anInt6389 != -1) {
				if (arg0 < 0 && local14.anInt6401 != -1) {
					arg1.anInt6484 = local14.anInt6401;
				} else if (arg0 <= 0 || local14.anInt6416 == -1) {
					arg1.anInt6484 = local14.anInt6389;
				} else {
					arg1.anInt6484 = local14.anInt6416;
				}
			} else if (arg2 == 0 && local14.anInt6422 != -1) {
				if (arg0 < 0 && local14.anInt6390 != -1) {
					arg1.anInt6484 = local14.anInt6390;
				} else if (arg0 <= 0 || local14.anInt6408 == -1) {
					arg1.anInt6484 = local14.anInt6422;
				} else {
					arg1.anInt6484 = local14.anInt6408;
				}
			} else if (arg0 < 0 && local14.anInt6409 != -1) {
				arg1.anInt6484 = local14.anInt6409;
			} else if (arg0 <= 0 || local14.anInt6411 == -1) {
				arg1.anInt6484 = local14.anInt6391;
			} else {
				arg1.anInt6484 = local14.anInt6411;
			}
			arg1.aBoolean475 = false;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z")
	public static boolean method5316(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Z)I")
	public static int method5317() {
		return 2;
	}
}
