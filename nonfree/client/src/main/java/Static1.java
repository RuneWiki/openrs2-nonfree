import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "u", descriptor = "I")
	public static int anInt24;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	public static int anInt36 = 0;

	@OriginalMember(owner = "client!a", name = "N", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!a", name = "eb", descriptor = "I")
	public static int anInt49 = 0;

	@OriginalMember(owner = "client!a", name = "pb", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!a", name = "xb", descriptor = "S")
	public static short aShort1 = 256;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IZII)V")
	public static void method25(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) Class165 local9 = Static37.aClass165ArrayArray1[arg0][arg1];
		Static76.method1725(5000, local9 == null ? Static86.aClass165_1 : local9);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!uo;B)V")
	public static void method36(@OriginalArg(0) Class32 arg0) {
		if (Static146.aBoolean308) {
			Static121.method2561(arg0);
		} else {
			Static182.method3599(arg0);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIILclient!ki;I)V")
	public static void method59(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class17_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class123 local13 = arg2.method4319();
		@Pc(23) int local23 = arg2.anInt4819 - arg2.aClass135_7.anInt4073 & 0x3FFF;
		if (arg0 == -1) {
			if (local23 != 0 || arg2.anInt4871 > 25) {
				if (arg3 < 0 && local13.anInt3694 != -1) {
					arg2.anInt4824 = local13.anInt3694;
				} else if (arg3 <= 0 || local13.anInt3670 == -1) {
					arg2.anInt4824 = local13.anInt3659;
				} else {
					arg2.anInt4824 = local13.anInt3670;
				}
				arg2.aBoolean471 = false;
			} else if (!arg2.aBoolean471 || !local13.method3393(arg2.anInt4824)) {
				arg2.anInt4824 = local13.method3397();
				arg2.aBoolean471 = arg2.anInt4824 != -1;
			}
		} else if (arg2.anInt4829 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(50) int local50 = Static321.anIntArray503[arg1] - arg2.aClass135_7.anInt4073 & 0x3FFF;
			arg2.aBoolean471 = false;
			if (arg0 == 2 && local13.anInt3700 != -1) {
				if (local50 > 2048 && local50 <= 6144 && local13.anInt3683 != -1) {
					arg2.anInt4824 = local13.anInt3683;
				} else if (local50 >= 10240 && local50 < 14336 && local13.anInt3698 != -1) {
					arg2.anInt4824 = local13.anInt3698;
				} else if (local50 <= 6144 || local50 >= 10240 || local13.anInt3686 == -1) {
					arg2.anInt4824 = local13.anInt3700;
				} else {
					arg2.anInt4824 = local13.anInt3686;
				}
			} else if (arg0 == 0 && local13.anInt3693 != -1) {
				if (local50 > 2048 && local50 <= 6144 && local13.anInt3667 != -1) {
					arg2.anInt4824 = local13.anInt3667;
				} else if (local50 >= 10240 && local50 < 14336 && local13.anInt3685 != -1) {
					arg2.anInt4824 = local13.anInt3685;
				} else if (local50 <= 6144 || local50 >= 10240 || local13.anInt3672 == -1) {
					arg2.anInt4824 = local13.anInt3693;
				} else {
					arg2.anInt4824 = local13.anInt3672;
				}
			} else if (local50 > 2048 && local50 <= 6144 && local13.anInt3681 != -1) {
				arg2.anInt4824 = local13.anInt3681;
			} else if (local50 >= 10240 && local50 < 14336 && local13.anInt3699 != -1) {
				arg2.anInt4824 = local13.anInt3699;
			} else if (local50 <= 6144 || local50 >= 10240 || local13.anInt3663 == -1) {
				arg2.anInt4824 = local13.anInt3659;
			} else {
				arg2.anInt4824 = local13.anInt3663;
			}
		} else if (local23 == 0 && arg2.anInt4871 <= 25) {
			if (arg0 == 2 && local13.anInt3700 != -1) {
				arg2.anInt4824 = local13.anInt3700;
			} else if (arg0 == 0 && local13.anInt3693 != -1) {
				arg2.anInt4824 = local13.anInt3693;
			} else {
				arg2.anInt4824 = local13.anInt3659;
			}
			arg2.aBoolean471 = false;
		} else {
			if (arg0 == 2 && local13.anInt3700 != -1) {
				if (arg3 < 0 && local13.anInt3679 != -1) {
					arg2.anInt4824 = local13.anInt3679;
				} else if (arg3 <= 0 || local13.anInt3678 == -1) {
					arg2.anInt4824 = local13.anInt3700;
				} else {
					arg2.anInt4824 = local13.anInt3678;
				}
			} else if (arg0 == 0 && local13.anInt3693 != -1) {
				if (arg3 < 0 && local13.anInt3656 != -1) {
					arg2.anInt4824 = local13.anInt3656;
				} else if (arg3 <= 0 || local13.anInt3675 == -1) {
					arg2.anInt4824 = local13.anInt3693;
				} else {
					arg2.anInt4824 = local13.anInt3675;
				}
			} else if (arg3 < 0 && local13.anInt3665 != -1) {
				arg2.anInt4824 = local13.anInt3665;
			} else if (arg3 <= 0 || local13.anInt3682 == -1) {
				arg2.anInt4824 = local13.anInt3659;
			} else {
				arg2.anInt4824 = local13.anInt3682;
			}
			arg2.aBoolean471 = false;
		}
	}
}
