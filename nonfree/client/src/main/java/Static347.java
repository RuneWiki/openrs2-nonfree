import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "Z")
	public static boolean aBoolean442;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "[I")
	public static final int[] anIntArray640 = new int[128];

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString247 = "Loading world list data";

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString248 = "Loading defaults - ";

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
	public static int anInt6625 = 0;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray14 = new int[2][][];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!jd;III)V")
	public static void method5908(@OriginalArg(1) Class10_Sub3_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class128 local17 = arg0.method5364();
		@Pc(27) int local27 = arg0.anInt5920 - arg0.aClass133_7.anInt3899 & 0x3FFF;
		if (arg3 == -1) {
			if (local27 != 0 || arg0.anInt5964 > 25) {
				arg0.aBoolean414 = false;
				if (arg1 < 0 && local17.anInt3736 != -1) {
					arg0.anInt5939 = local17.anInt3736;
				} else if (arg1 <= 0 || local17.anInt3716 == -1) {
					arg0.anInt5939 = local17.anInt3758;
				} else {
					arg0.anInt5939 = local17.anInt3716;
				}
			} else if (!arg0.aBoolean414 || !local17.method3504(arg0.anInt5939)) {
				arg0.anInt5939 = local17.method3508();
				arg0.aBoolean414 = arg0.anInt5939 != -1;
			}
		} else if (arg0.anInt5921 != -1 && (local27 >= 10240 || local27 <= 2048)) {
			@Pc(274) int local274 = Static315.anIntArray616[arg2] - arg0.aClass133_7.anInt3899 & 0x3FFF;
			arg0.aBoolean414 = false;
			if (arg3 == 2 && local17.anInt3760 != -1) {
				if (local274 > 2048 && local274 <= 6144 && local17.anInt3733 != -1) {
					arg0.anInt5939 = local17.anInt3733;
				} else if (local274 >= 10240 && local274 < 14336 && local17.anInt3743 != -1) {
					arg0.anInt5939 = local17.anInt3743;
				} else if (local274 <= 6144 || local274 >= 10240 || local17.anInt3725 == -1) {
					arg0.anInt5939 = local17.anInt3760;
				} else {
					arg0.anInt5939 = local17.anInt3725;
				}
			} else if (arg3 == 0 && local17.anInt3754 != -1) {
				if (local274 > 2048 && local274 <= 6144 && local17.anInt3749 != -1) {
					arg0.anInt5939 = local17.anInt3749;
				} else if (local274 >= 10240 && local274 < 14336 && local17.anInt3741 != -1) {
					arg0.anInt5939 = local17.anInt3741;
				} else if (local274 <= 6144 || local274 >= 10240 || local17.anInt3718 == -1) {
					arg0.anInt5939 = local17.anInt3754;
				} else {
					arg0.anInt5939 = local17.anInt3718;
				}
			} else if (local274 > 2048 && local274 <= 6144 && local17.anInt3737 != -1) {
				arg0.anInt5939 = local17.anInt3737;
			} else if (local274 >= 10240 && local274 < 14336 && local17.anInt3731 != -1) {
				arg0.anInt5939 = local17.anInt3731;
			} else if (local274 <= 6144 || local274 >= 10240 || local17.anInt3745 == -1) {
				arg0.anInt5939 = local17.anInt3758;
			} else {
				arg0.anInt5939 = local17.anInt3745;
			}
		} else if (local27 == 0 && arg0.anInt5964 <= 25) {
			arg0.aBoolean414 = false;
			if (arg3 == 2 && local17.anInt3760 != -1) {
				arg0.anInt5939 = local17.anInt3760;
			} else if (arg3 == 0 && local17.anInt3754 != -1) {
				arg0.anInt5939 = local17.anInt3754;
			} else {
				arg0.anInt5939 = local17.anInt3758;
			}
		} else {
			if (arg3 == 2 && local17.anInt3760 != -1) {
				if (arg1 < 0 && local17.anInt3751 != -1) {
					arg0.anInt5939 = local17.anInt3751;
				} else if (arg1 <= 0 || local17.anInt3719 == -1) {
					arg0.anInt5939 = local17.anInt3760;
				} else {
					arg0.anInt5939 = local17.anInt3719;
				}
			} else if (arg3 == 0 && local17.anInt3754 != -1) {
				if (arg1 < 0 && local17.anInt3735 != -1) {
					arg0.anInt5939 = local17.anInt3735;
				} else if (arg1 <= 0 || local17.anInt3729 == -1) {
					arg0.anInt5939 = local17.anInt3754;
				} else {
					arg0.anInt5939 = local17.anInt3729;
				}
			} else if (arg1 < 0 && local17.anInt3732 != -1) {
				arg0.anInt5939 = local17.anInt3732;
			} else if (arg1 <= 0 || local17.anInt3727 == -1) {
				arg0.anInt5939 = local17.anInt3758;
			} else {
				arg0.anInt5939 = local17.anInt3727;
			}
			arg0.aBoolean414 = false;
		}
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
	public static void method5909() {
		@Pc(5) Class11 local5 = Static22.aClass11_15;
		synchronized (Static22.aClass11_15) {
			Static22.aClass11_15.method213();
		}
		local5 = Static24.aClass11_16;
		synchronized (Static24.aClass11_16) {
			Static24.aClass11_16.method213();
		}
	}
}
