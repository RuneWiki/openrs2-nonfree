import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bka", name = "R", descriptor = "Lclient!jia;")
	public static final Class193 aClass193_6 = new Class193();

	@OriginalMember(owner = "client!bka", name = "S", descriptor = "[I")
	public static final int[] anIntArray60 = new int[1];

	@OriginalMember(owner = "client!bka", name = "g", descriptor = "(I)V")
	public static void method1367() {
		Static318.aBoolean461 = false;
		Static341.anIntArray395 = null;
		Static357.anIntArray597 = null;
		Static567.anIntArray589 = null;
		Static50.anIntArray55 = null;
		Static432.anIntArray456 = null;
	}

	@OriginalMember(owner = "client!bka", name = "h", descriptor = "(I)V")
	public static void method1368() {
		Static616.method8090();
		Static654.method8553(Static227.aClass3_Sub15_11.aClass17_Sub7_1.method2458() == 1);
		Static212.aClass232_2 = Static664.method5820(22050, Static469.aCanvas11, Static499.aClass231_4, 0);
		Static619.method8224(Static552.method7577((Class3_Sub9_Sub5) null));
		Static18.aClass232_1 = Static664.method5820(2048, Static469.aCanvas11, Static499.aClass231_4, 1);
		Static18.aClass232_1.method8514(Static557.aClass3_Sub9_Sub1_2);
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(BIILclient!uv;I)V")
	public static void method1370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23_Sub2_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class351 local14 = arg2.method8630();
		@Pc(24) int local24 = arg2.anInt10181 - arg2.aClass314_7.anInt8733 & 0x3FFF;
		if (arg1 == -1) {
			if (local24 != 0 || arg2.anInt10137 > 25) {
				if (arg3 < 0 && local14.anInt9398 != -1) {
					arg2.anInt10148 = local14.anInt9398;
					arg2.aBoolean748 = false;
				} else if (arg3 <= 0 || local14.anInt9378 == -1) {
					arg2.anInt10148 = local14.anInt9399;
				} else {
					arg2.anInt10148 = local14.anInt9378;
				}
				arg2.aBoolean748 = false;
			} else if (!arg2.aBoolean748 || !local14.method7962(arg2.anInt10148)) {
				arg2.anInt10148 = local14.method7964();
				arg2.aBoolean748 = arg2.anInt10148 != -1;
			}
		} else if (arg2.anInt10178 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(271) int local271 = Static29.anIntArray22[arg0] - arg2.aClass314_7.anInt8733 & 0x3FFF;
			arg2.aBoolean748 = false;
			if (arg1 == 2 && local14.anInt9413 != -1) {
				if (local271 > 2048 && local271 <= 6144 && local14.anInt9406 != -1) {
					arg2.anInt10148 = local14.anInt9406;
				} else if (local271 >= 10240 && local271 < 14336 && local14.anInt9404 != -1) {
					arg2.anInt10148 = local14.anInt9404;
				} else if (local271 <= 6144 || local271 >= 10240 || local14.anInt9387 == -1) {
					arg2.anInt10148 = local14.anInt9413;
				} else {
					arg2.anInt10148 = local14.anInt9387;
				}
			} else if (arg1 == 0 && local14.anInt9417 != -1) {
				if (local271 > 2048 && local271 <= 6144 && local14.anInt9411 != -1) {
					arg2.anInt10148 = local14.anInt9411;
				} else if (local271 >= 10240 && local271 < 14336 && local14.anInt9386 != -1) {
					arg2.anInt10148 = local14.anInt9386;
				} else if (local271 <= 6144 || local271 >= 10240 || local14.anInt9400 == -1) {
					arg2.anInt10148 = local14.anInt9417;
				} else {
					arg2.anInt10148 = local14.anInt9400;
				}
			} else if (local271 > 2048 && local271 <= 6144 && local14.anInt9409 != -1) {
				arg2.anInt10148 = local14.anInt9409;
			} else if (local271 >= 10240 && local271 < 14336 && local14.anInt9390 != -1) {
				arg2.anInt10148 = local14.anInt9390;
			} else if (local271 <= 6144 || local271 >= 10240 || local14.anInt9418 == -1) {
				arg2.anInt10148 = local14.anInt9399;
			} else {
				arg2.anInt10148 = local14.anInt9418;
			}
		} else if (local24 == 0 && arg2.anInt10137 <= 25) {
			arg2.aBoolean748 = false;
			if (arg1 == 2 && local14.anInt9413 != -1) {
				arg2.anInt10148 = local14.anInt9413;
			} else if (arg1 == 0 && local14.anInt9417 != -1) {
				arg2.anInt10148 = local14.anInt9417;
			} else {
				arg2.anInt10148 = local14.anInt9399;
			}
		} else {
			arg2.aBoolean748 = false;
			if (arg1 == 2 && local14.anInt9413 != -1) {
				if (arg3 < 0 && local14.anInt9397 != -1) {
					arg2.anInt10148 = local14.anInt9397;
				} else if (arg3 <= 0 || local14.anInt9402 == -1) {
					arg2.anInt10148 = local14.anInt9413;
				} else {
					arg2.anInt10148 = local14.anInt9402;
				}
			} else if (arg1 == 0 && local14.anInt9417 != -1) {
				if (arg3 < 0 && local14.anInt9414 != -1) {
					arg2.anInt10148 = local14.anInt9414;
				} else if (arg3 <= 0 || local14.anInt9421 == -1) {
					arg2.anInt10148 = local14.anInt9417;
				} else {
					arg2.anInt10148 = local14.anInt9421;
				}
			} else if (arg3 < 0 && local14.anInt9394 != -1) {
				arg2.anInt10148 = local14.anInt9394;
			} else if (arg3 <= 0 || local14.anInt9405 == -1) {
				arg2.anInt10148 = local14.anInt9399;
			} else {
				arg2.anInt10148 = local14.anInt9405;
			}
		}
	}
}
