import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	public static int anInt3888 = 0;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	public static int anInt3890 = 0;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Lclient!ps;")
	public static Class4_Sub32 method2932() {
		if (Static137.aClass258_37 == null || Static279.aClass18_1 == null) {
			return null;
		}
		Static279.aClass18_1.method525(Static137.aClass258_37);
		@Pc(26) Class4_Sub32 local26 = (Class4_Sub32) Static279.aClass18_1.method524();
		if (local26 == null) {
			return null;
		} else {
			@Pc(36) Class25 local36 = Static137.aClass198_4.method4491(local26.anInt5601);
			return local36 != null && local36.aBoolean45 && local36.method666(Static137.anInterface4_2) ? local26 : Static380.method5183();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2933(@OriginalArg(1) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local13];
		Static457.method1215(arg0, 0, local16, 0, local13);
		return local16;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!ap;II)V")
	public static void method2934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class132 local15 = arg2.method4762();
		@Pc(24) int local24 = arg2.anInt6095 - arg2.aClass216_7.anInt6397 & 0x3FFF;
		if (arg0 == -1) {
			if (local24 != 0 || arg2.anInt6121 > 25) {
				arg2.aBoolean421 = false;
				if (arg1 < 0 && local15.anInt3763 != -1) {
					arg2.anInt6077 = local15.anInt3763;
				} else if (arg1 <= 0 || local15.anInt3747 == -1) {
					arg2.anInt6077 = local15.anInt3748;
				} else {
					arg2.anInt6077 = local15.anInt3747;
				}
			} else if (!arg2.aBoolean421 || !local15.method2832(arg2.anInt6077)) {
				arg2.anInt6077 = local15.method2830();
				arg2.aBoolean421 = arg2.anInt6077 != -1;
			}
		} else if (arg2.anInt6081 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(51) int local51 = Static337.anIntArray528[arg3] - arg2.aClass216_7.anInt6397 & 0x3FFF;
			if (arg0 == 2 && local15.anInt3752 != -1) {
				if (local51 > 2048 && local51 <= 6144 && local15.anInt3754 != -1) {
					arg2.anInt6077 = local15.anInt3754;
				} else if (local51 >= 10240 && local51 < 14336 && local15.anInt3759 != -1) {
					arg2.anInt6077 = local15.anInt3759;
				} else if (local51 <= 6144 || local51 >= 10240 || local15.anInt3737 == -1) {
					arg2.anInt6077 = local15.anInt3752;
				} else {
					arg2.anInt6077 = local15.anInt3737;
				}
			} else if (arg0 == 0 && local15.anInt3750 != -1) {
				if (local51 > 2048 && local51 <= 6144 && local15.anInt3738 != -1) {
					arg2.anInt6077 = local15.anInt3738;
				} else if (local51 >= 10240 && local51 < 14336 && local15.anInt3742 != -1) {
					arg2.anInt6077 = local15.anInt3742;
				} else if (local51 <= 6144 || local51 >= 10240 || local15.anInt3740 == -1) {
					arg2.anInt6077 = local15.anInt3750;
				} else {
					arg2.anInt6077 = local15.anInt3740;
				}
			} else if (local51 > 2048 && local51 <= 6144 && local15.anInt3756 != -1) {
				arg2.anInt6077 = local15.anInt3756;
			} else if (local51 >= 10240 && local51 < 14336 && local15.anInt3766 != -1) {
				arg2.anInt6077 = local15.anInt3766;
			} else if (local51 <= 6144 || local51 >= 10240 || local15.anInt3768 == -1) {
				arg2.anInt6077 = local15.anInt3748;
			} else {
				arg2.anInt6077 = local15.anInt3768;
			}
			arg2.aBoolean421 = false;
		} else if (local24 == 0 && arg2.anInt6121 <= 25) {
			if (arg0 == 2 && local15.anInt3752 != -1) {
				arg2.anInt6077 = local15.anInt3752;
			} else if (arg0 == 0 && local15.anInt3750 != -1) {
				arg2.anInt6077 = local15.anInt3750;
			} else {
				arg2.anInt6077 = local15.anInt3748;
			}
			arg2.aBoolean421 = false;
		} else {
			if (arg0 == 2 && local15.anInt3752 != -1) {
				if (arg1 < 0 && local15.anInt3736 != -1) {
					arg2.anInt6077 = local15.anInt3736;
				} else if (arg1 <= 0 || local15.anInt3751 == -1) {
					arg2.anInt6077 = local15.anInt3752;
				} else {
					arg2.anInt6077 = local15.anInt3751;
				}
			} else if (arg0 == 0 && local15.anInt3750 != -1) {
				if (arg1 < 0 && local15.anInt3762 != -1) {
					arg2.anInt6077 = local15.anInt3762;
				} else if (arg1 <= 0 || local15.anInt3728 == -1) {
					arg2.anInt6077 = local15.anInt3750;
				} else {
					arg2.anInt6077 = local15.anInt3728;
				}
			} else if (arg1 < 0 && local15.anInt3770 != -1) {
				arg2.anInt6077 = local15.anInt3770;
			} else if (arg1 <= 0 || local15.anInt3730 == -1) {
				arg2.anInt6077 = local15.anInt3748;
			} else {
				arg2.anInt6077 = local15.anInt3730;
			}
			arg2.aBoolean421 = false;
		}
	}
}
