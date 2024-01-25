import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "J")
	public static long aLong5;

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "Lclient!sb;")
	public static Class301 aClass301_1;

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "Lclient!dia;")
	public static Class8_Sub16_Sub1 aClass8_Sub16_Sub1_1;

	@OriginalMember(owner = "client!afa", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!afa", name = "o", descriptor = "Lclient!tp;")
	public static Class331 aClass331_3 = null;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILclient!bda;III)V")
	public static void method131(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub1_Sub2_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class102 local14 = arg1.method6686();
		@Pc(24) int local24 = arg1.anInt8133 - arg1.aClass371_7.anInt10460 & 0x3FFF;
		if (arg0 == -1) {
			if (local24 != 0 || arg1.anInt8118 > 25) {
				if (arg3 < 0 && local14.anInt3762 != -1) {
					arg1.aBoolean585 = false;
					arg1.anInt8107 = local14.anInt3762;
				} else if (arg3 <= 0 || local14.anInt3720 == -1) {
					arg1.anInt8107 = local14.anInt3752;
				} else {
					arg1.anInt8107 = local14.anInt3720;
				}
				arg1.aBoolean585 = false;
			} else if (!arg1.aBoolean585 || !local14.method3051(arg1.anInt8107)) {
				arg1.anInt8107 = local14.method3054();
				arg1.aBoolean585 = arg1.anInt8107 != -1;
			}
		} else if (arg1.anInt8108 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(51) int local51 = Static245.anIntArray601[arg2] - arg1.aClass371_7.anInt10460 & 0x3FFF;
			if (arg0 == 2 && local14.anInt3731 != -1) {
				if (local51 > 2048 && local51 <= 6144 && local14.anInt3753 != -1) {
					arg1.anInt8107 = local14.anInt3753;
				} else if (local51 >= 10240 && local51 < 14336 && local14.anInt3740 != -1) {
					arg1.anInt8107 = local14.anInt3740;
				} else if (local51 <= 6144 || local51 >= 10240 || local14.anInt3744 == -1) {
					arg1.anInt8107 = local14.anInt3731;
				} else {
					arg1.anInt8107 = local14.anInt3744;
				}
			} else if (arg0 == 0 && local14.anInt3763 != -1) {
				if (local51 > 2048 && local51 <= 6144 && local14.anInt3760 != -1) {
					arg1.anInt8107 = local14.anInt3760;
				} else if (local51 >= 10240 && local51 < 14336 && local14.anInt3755 != -1) {
					arg1.anInt8107 = local14.anInt3755;
				} else if (local51 <= 6144 || local51 >= 10240 || local14.anInt3734 == -1) {
					arg1.anInt8107 = local14.anInt3763;
				} else {
					arg1.anInt8107 = local14.anInt3734;
				}
			} else if (local51 > 2048 && local51 <= 6144 && local14.anInt3737 != -1) {
				arg1.anInt8107 = local14.anInt3737;
			} else if (local51 >= 10240 && local51 < 14336 && local14.anInt3757 != -1) {
				arg1.anInt8107 = local14.anInt3757;
			} else if (local51 <= 6144 || local51 >= 10240 || local14.anInt3747 == -1) {
				arg1.anInt8107 = local14.anInt3752;
			} else {
				arg1.anInt8107 = local14.anInt3747;
			}
			arg1.aBoolean585 = false;
		} else if (local24 == 0 && arg1.anInt8118 <= 25) {
			if (arg0 == 2 && local14.anInt3731 != -1) {
				arg1.anInt8107 = local14.anInt3731;
			} else if (arg0 == 0 && local14.anInt3763 != -1) {
				arg1.anInt8107 = local14.anInt3763;
			} else {
				arg1.anInt8107 = local14.anInt3752;
			}
			arg1.aBoolean585 = false;
		} else {
			arg1.aBoolean585 = false;
			if (arg0 == 2 && local14.anInt3731 != -1) {
				if (arg3 < 0 && local14.anInt3749 != -1) {
					arg1.anInt8107 = local14.anInt3749;
				} else if (arg3 <= 0 || local14.anInt3727 == -1) {
					arg1.anInt8107 = local14.anInt3731;
				} else {
					arg1.anInt8107 = local14.anInt3727;
				}
			} else if (arg0 == 0 && local14.anInt3763 != -1) {
				if (arg3 < 0 && local14.anInt3728 != -1) {
					arg1.anInt8107 = local14.anInt3728;
				} else if (arg3 <= 0 || local14.anInt3729 == -1) {
					arg1.anInt8107 = local14.anInt3763;
				} else {
					arg1.anInt8107 = local14.anInt3729;
				}
			} else if (arg3 < 0 && local14.anInt3750 != -1) {
				arg1.anInt8107 = local14.anInt3750;
			} else if (arg3 <= 0 || local14.anInt3756 == -1) {
				arg1.anInt8107 = local14.anInt3752;
			} else {
				arg1.anInt8107 = local14.anInt3756;
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5) {
		Static531.method7498(arg1, arg5, arg3, arg4, arg2, 0, arg0);
	}
}
