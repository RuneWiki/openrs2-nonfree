import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!oh", name = "V", descriptor = "Lclient!br;")
	public static Class21 aClass21_4 = null;

	@OriginalMember(owner = "client!oh", name = "W", descriptor = "[I")
	public static final int[] anIntArray51 = new int[1000];

	@OriginalMember(owner = "client!oh", name = "Y", descriptor = "[Lclient!b;")
	public static final Class14[] aClass14Array4 = new Class14[14];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!tj;Lclient!tj;I)V")
	public static void method810(@OriginalArg(0) Class193 arg0, @OriginalArg(1) Class193 arg1) {
		Static6.aClass193_4 = arg0;
		Static170.aClass193_61 = arg1;
		Static307.anInt5951 = Static6.aClass193_4.method5055(3);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!hl;IIII)V")
	public static void method812(@OriginalArg(0) Class8_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class40 local9 = arg0.method4347();
		@Pc(18) int local18 = arg0.anInt4976 - arg0.aClass106_7.anInt3316 & 0x3FFF;
		if (arg2 == -1) {
			if (local18 != 0 || arg0.anInt4955 > 25) {
				if (arg3 < 0 && local9.anInt1465 != -1) {
					arg0.anInt4937 = local9.anInt1465;
				} else if (arg3 <= 0 || local9.anInt1476 == -1) {
					arg0.anInt4937 = local9.anInt1441;
				} else {
					arg0.anInt4937 = local9.anInt1476;
				}
				arg0.aBoolean371 = false;
			} else if (!arg0.aBoolean371 || !local9.method1179(arg0.anInt4937)) {
				arg0.anInt4937 = local9.method1178();
				arg0.aBoolean371 = arg0.anInt4937 != -1;
			}
		} else if (arg0.anInt4964 != -1 && (local18 >= 10240 || local18 <= 2048)) {
			@Pc(276) int local276 = Static100.anIntArray226[arg1] - arg0.aClass106_7.anInt3316 & 0x3FFF;
			if (arg2 == 2 && local9.anInt1443 != -1) {
				if (local276 > 2048 && local276 <= 6144 && local9.anInt1452 != -1) {
					arg0.anInt4937 = local9.anInt1452;
				} else if (local276 >= 10240 && local276 < 14336 && local9.anInt1466 != -1) {
					arg0.anInt4937 = local9.anInt1466;
				} else if (local276 <= 6144 || local276 >= 10240 || local9.anInt1450 == -1) {
					arg0.anInt4937 = local9.anInt1443;
				} else {
					arg0.anInt4937 = local9.anInt1450;
				}
			} else if (arg2 == 0 && local9.anInt1472 != -1) {
				if (local276 > 2048 && local276 <= 6144 && local9.anInt1438 != -1) {
					arg0.anInt4937 = local9.anInt1438;
				} else if (local276 >= 10240 && local276 < 14336 && local9.anInt1478 != -1) {
					arg0.anInt4937 = local9.anInt1478;
				} else if (local276 <= 6144 || local276 >= 10240 || local9.anInt1461 == -1) {
					arg0.anInt4937 = local9.anInt1472;
				} else {
					arg0.anInt4937 = local9.anInt1461;
				}
			} else if (local276 > 2048 && local276 <= 6144 && local9.anInt1439 != -1) {
				arg0.anInt4937 = local9.anInt1439;
			} else if (local276 >= 10240 && local276 < 14336 && local9.anInt1437 != -1) {
				arg0.anInt4937 = local9.anInt1437;
			} else if (local276 <= 6144 || local276 >= 10240 || local9.anInt1467 == -1) {
				arg0.anInt4937 = local9.anInt1441;
			} else {
				arg0.anInt4937 = local9.anInt1467;
			}
			arg0.aBoolean371 = false;
		} else if (local18 == 0 && arg0.anInt4955 <= 25) {
			if (arg2 == 2 && local9.anInt1443 != -1) {
				arg0.anInt4937 = local9.anInt1443;
			} else if (arg2 == 0 && local9.anInt1472 != -1) {
				arg0.anInt4937 = local9.anInt1472;
			} else {
				arg0.anInt4937 = local9.anInt1441;
			}
			arg0.aBoolean371 = false;
		} else {
			arg0.aBoolean371 = false;
			if (arg2 == 2 && local9.anInt1443 != -1) {
				if (arg3 < 0 && local9.anInt1469 != -1) {
					arg0.anInt4937 = local9.anInt1469;
				} else if (arg3 <= 0 || local9.anInt1446 == -1) {
					arg0.anInt4937 = local9.anInt1443;
				} else {
					arg0.anInt4937 = local9.anInt1446;
				}
			} else if (arg2 == 0 && local9.anInt1472 != -1) {
				if (arg3 < 0 && local9.anInt1456 != -1) {
					arg0.anInt4937 = local9.anInt1456;
				} else if (arg3 <= 0 || local9.anInt1475 == -1) {
					arg0.anInt4937 = local9.anInt1472;
				} else {
					arg0.anInt4937 = local9.anInt1475;
				}
			} else if (arg3 < 0 && local9.anInt1445 != -1) {
				arg0.anInt4937 = local9.anInt1445;
			} else if (arg3 <= 0 || local9.anInt1458 == -1) {
				arg0.anInt4937 = local9.anInt1441;
			} else {
				arg0.anInt4937 = local9.anInt1458;
			}
		}
	}
}
