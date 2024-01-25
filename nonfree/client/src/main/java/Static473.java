import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!tq", name = "eb", descriptor = "Lclient!bj;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "Lclient!im;")
	public static final Class140 aClass140_129 = new Class140(76, 6);

	@OriginalMember(owner = "client!tq", name = "db", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_119 = new Class306(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!tq", name = "fb", descriptor = "[[I")
	public static final int[][] anIntArrayArray104 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!tq", name = "gb", descriptor = "I")
	public static int anInt7951 = 0;

	@OriginalMember(owner = "client!tq", name = "hb", descriptor = "[I")
	public static final int[] anIntArray745 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!dc;BIII)V")
	public static void method6592(@OriginalArg(0) Class49_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class230 local9 = arg0.method3799();
		@Pc(25) int local25 = arg0.anInt4330 - arg0.aClass143_7.anInt4120 & 0x3FFF;
		if (arg3 == -1) {
			if (local25 != 0 || arg0.anInt4325 > 25) {
				arg0.aBoolean306 = false;
				if (arg1 < 0 && local9.anInt6387 != -1) {
					arg0.anInt4282 = local9.anInt6387;
				} else if (arg1 <= 0 || local9.anInt6405 == -1) {
					arg0.anInt4282 = local9.anInt6409;
				} else {
					arg0.anInt4282 = local9.anInt6405;
				}
			} else if (!arg0.aBoolean306 || !local9.method5400(arg0.anInt4282)) {
				arg0.anInt4282 = local9.method5395();
				arg0.aBoolean306 = arg0.anInt4282 != -1;
			}
		} else if (arg0.anInt4323 != -1 && (local25 >= 10240 || local25 <= 2048)) {
			@Pc(54) int local54 = Static242.anIntArray465[arg2] - arg0.aClass143_7.anInt4120 & 0x3FFF;
			if (arg3 == 2 && local9.anInt6382 != -1) {
				if (local54 > 2048 && local54 <= 6144 && local9.anInt6378 != -1) {
					arg0.anInt4282 = local9.anInt6378;
				} else if (local54 >= 10240 && local54 < 14336 && local9.anInt6390 != -1) {
					arg0.anInt4282 = local9.anInt6390;
				} else if (local54 <= 6144 || local54 >= 10240 || local9.anInt6408 == -1) {
					arg0.anInt4282 = local9.anInt6382;
				} else {
					arg0.anInt4282 = local9.anInt6408;
				}
			} else if (arg3 == 0 && local9.anInt6377 != -1) {
				if (local54 > 2048 && local54 <= 6144 && local9.anInt6400 != -1) {
					arg0.anInt4282 = local9.anInt6400;
				} else if (local54 >= 10240 && local54 < 14336 && local9.anInt6407 != -1) {
					arg0.anInt4282 = local9.anInt6407;
				} else if (local54 <= 6144 || local54 >= 10240 || local9.anInt6398 == -1) {
					arg0.anInt4282 = local9.anInt6377;
				} else {
					arg0.anInt4282 = local9.anInt6398;
				}
			} else if (local54 > 2048 && local54 <= 6144 && local9.anInt6375 != -1) {
				arg0.anInt4282 = local9.anInt6375;
			} else if (local54 >= 10240 && local54 < 14336 && local9.anInt6393 != -1) {
				arg0.anInt4282 = local9.anInt6393;
			} else if (local54 <= 6144 || local54 >= 10240 || local9.anInt6402 == -1) {
				arg0.anInt4282 = local9.anInt6409;
			} else {
				arg0.anInt4282 = local9.anInt6402;
			}
			arg0.aBoolean306 = false;
		} else if (local25 == 0 && arg0.anInt4325 <= 25) {
			if (arg3 == 2 && local9.anInt6382 != -1) {
				arg0.anInt4282 = local9.anInt6382;
			} else if (arg3 == 0 && local9.anInt6377 != -1) {
				arg0.anInt4282 = local9.anInt6377;
			} else {
				arg0.anInt4282 = local9.anInt6409;
			}
			arg0.aBoolean306 = false;
		} else {
			arg0.aBoolean306 = false;
			if (arg3 == 2 && local9.anInt6382 != -1) {
				if (arg1 < 0 && local9.anInt6391 != -1) {
					arg0.anInt4282 = local9.anInt6391;
				} else if (arg1 <= 0 || local9.anInt6394 == -1) {
					arg0.anInt4282 = local9.anInt6382;
				} else {
					arg0.anInt4282 = local9.anInt6394;
				}
			} else if (arg3 == 0 && local9.anInt6377 != -1) {
				if (arg1 < 0 && local9.anInt6406 != -1) {
					arg0.anInt4282 = local9.anInt6406;
				} else if (arg1 <= 0 || local9.anInt6404 == -1) {
					arg0.anInt4282 = local9.anInt6377;
				} else {
					arg0.anInt4282 = local9.anInt6404;
				}
			} else if (arg1 < 0 && local9.anInt6376 != -1) {
				arg0.anInt4282 = local9.anInt6376;
			} else if (arg1 <= 0 || local9.anInt6419 == -1) {
				arg0.anInt4282 = local9.anInt6409;
			} else {
				arg0.anInt4282 = local9.anInt6419;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!jq;I)V")
	public static void method6593(@OriginalArg(0) Class156 arg0) {
		if (Static546.anInt2819 == arg0.anInt4701) {
			Static3.aBooleanArray1[arg0.anInt4679] = true;
		}
	}
}
