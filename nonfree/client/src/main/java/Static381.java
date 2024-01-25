import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "Lclient!g;")
	public static Class83 aClass83_125;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public static int anInt6604 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method5692() {
		for (@Pc(14) Class7_Sub3 local14 = (Class7_Sub3) Static228.aClass199_4.method4896(); local14 != null; local14 = (Class7_Sub3) Static228.aClass199_4.method4902()) {
			local14.method524();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZII)V")
	public static void method5693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub7_Sub2 local12 = Static328.method5290(9, arg1);
		local12.method1198();
		local12.anInt1462 = arg2;
		local12.anInt1465 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!gn;IIII)V")
	public static void method5694(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class227 local9 = arg0.method4799();
		@Pc(19) int local19 = arg0.anInt5368 - arg0.aClass217_7.anInt6273 & 0x3FFF;
		if (arg3 == -1) {
			if (local19 != 0 || arg0.anInt5403 > 25) {
				arg0.aBoolean394 = false;
				if (arg2 < 0 && local9.anInt6456 != -1) {
					arg0.anInt5421 = local9.anInt6456;
				} else if (arg2 <= 0 || local9.anInt6463 == -1) {
					arg0.anInt5421 = local9.anInt6460;
				} else {
					arg0.anInt5421 = local9.anInt6463;
				}
			} else if (!arg0.aBoolean394 || !local9.method5584(arg0.anInt5421)) {
				arg0.anInt5421 = local9.method5576();
				arg0.aBoolean394 = arg0.anInt5421 != -1;
			}
		} else if (arg0.anInt5418 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(49) int local49 = Static205.anIntArray308[arg1] - arg0.aClass217_7.anInt6273 & 0x3FFF;
			if (arg3 == 2 && local9.anInt6455 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local9.anInt6459 != -1) {
					arg0.anInt5421 = local9.anInt6459;
				} else if (local49 >= 10240 && local49 < 14336 && local9.anInt6435 != -1) {
					arg0.anInt5421 = local9.anInt6435;
				} else if (local49 <= 6144 || local49 >= 10240 || local9.anInt6462 == -1) {
					arg0.anInt5421 = local9.anInt6455;
				} else {
					arg0.anInt5421 = local9.anInt6462;
				}
			} else if (arg3 == 0 && local9.anInt6437 != -1) {
				if (local49 > 2048 && local49 <= 6144 && local9.anInt6431 != -1) {
					arg0.anInt5421 = local9.anInt6431;
				} else if (local49 >= 10240 && local49 < 14336 && local9.anInt6457 != -1) {
					arg0.anInt5421 = local9.anInt6457;
				} else if (local49 <= 6144 || local49 >= 10240 || local9.anInt6453 == -1) {
					arg0.anInt5421 = local9.anInt6437;
				} else {
					arg0.anInt5421 = local9.anInt6453;
				}
			} else if (local49 > 2048 && local49 <= 6144 && local9.anInt6424 != -1) {
				arg0.anInt5421 = local9.anInt6424;
			} else if (local49 >= 10240 && local49 < 14336 && local9.anInt6451 != -1) {
				arg0.anInt5421 = local9.anInt6451;
			} else if (local49 <= 6144 || local49 >= 10240 || local9.anInt6443 == -1) {
				arg0.anInt5421 = local9.anInt6460;
			} else {
				arg0.anInt5421 = local9.anInt6443;
			}
			arg0.aBoolean394 = false;
		} else if (local19 == 0 && arg0.anInt5403 <= 25) {
			arg0.aBoolean394 = false;
			if (arg3 == 2 && local9.anInt6455 != -1) {
				arg0.anInt5421 = local9.anInt6455;
			} else if (arg3 == 0 && local9.anInt6437 != -1) {
				arg0.anInt5421 = local9.anInt6437;
			} else {
				arg0.anInt5421 = local9.anInt6460;
			}
		} else {
			arg0.aBoolean394 = false;
			if (arg3 == 2 && local9.anInt6455 != -1) {
				if (arg2 < 0 && local9.anInt6439 != -1) {
					arg0.anInt5421 = local9.anInt6439;
				} else if (arg2 <= 0 || local9.anInt6461 == -1) {
					arg0.anInt5421 = local9.anInt6455;
				} else {
					arg0.anInt5421 = local9.anInt6461;
				}
			} else if (arg3 == 0 && local9.anInt6437 != -1) {
				if (arg2 < 0 && local9.anInt6440 != -1) {
					arg0.anInt5421 = local9.anInt6440;
				} else if (arg2 <= 0 || local9.anInt6464 == -1) {
					arg0.anInt5421 = local9.anInt6437;
				} else {
					arg0.anInt5421 = local9.anInt6464;
				}
			} else if (arg2 < 0 && local9.anInt6449 != -1) {
				arg0.anInt5421 = local9.anInt6449;
			} else if (arg2 <= 0 || local9.anInt6422 == -1) {
				arg0.anInt5421 = local9.anInt6460;
			} else {
				arg0.anInt5421 = local9.anInt6422;
			}
		}
	}
}
