import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZIIIZ)V")
	public static void method1604(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(30) int local30 = (arg3 + arg0) / 2;
		@Pc(32) int local32 = arg3;
		@Pc(36) Class182_Sub1 local36 = Static29.aClass182_Sub1Array1[local30];
		Static29.aClass182_Sub1Array1[local30] = Static29.aClass182_Sub1Array1[arg0];
		Static29.aClass182_Sub1Array1[arg0] = local36;
		for (@Pc(48) int local48 = arg3; local48 < arg0; local48++) {
			if (Static197.method3206(arg4, local36, Static29.aClass182_Sub1Array1[local48], arg2, arg1, arg5) <= 0) {
				@Pc(70) Class182_Sub1 local70 = Static29.aClass182_Sub1Array1[local48];
				Static29.aClass182_Sub1Array1[local48] = Static29.aClass182_Sub1Array1[local32];
				Static29.aClass182_Sub1Array1[local32++] = local70;
			}
		}
		Static29.aClass182_Sub1Array1[arg0] = Static29.aClass182_Sub1Array1[local32];
		Static29.aClass182_Sub1Array1[local32] = local36;
		method1604(local32 - 1, arg1, arg2, arg3, arg4, arg5);
		method1604(arg0, arg1, arg2, local32 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([IIIIII)V")
	public static void method1605(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub17 local7 = Static122.aClass1_Sub17ArrayArrayArray3[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class36 local13 = local7.aClass36_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt847;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class105 local58 = local7.aClass105_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt3305;
		@Pc(67) int local67 = local58.anInt3307;
		@Pc(70) int local70 = local58.anInt3308;
		@Pc(73) int local73 = local58.anInt3306;
		@Pc(77) int[] local77 = Static306.anIntArrayArray46[local23];
		@Pc(81) int[] local81 = Static59.anIntArrayArray2[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIILclient!qf;I)V")
	public static void method1606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class146 arg5, @OriginalArg(7) int arg6) {
		if (Static69.aBoolean111) {
			Static298.anInt5644 = 32;
		} else {
			Static298.anInt5644 = 0;
		}
		Static69.aBoolean111 = false;
		@Pc(131) int local131;
		if (Static191.anInt3909 != 0) {
			if (arg0 >= arg2 && arg0 < arg2 + 16 && arg6 <= arg3 && arg3 < arg6 + 16) {
				arg5.anInt4418 -= 4;
				Static237.method2927(arg5);
			} else if (arg0 >= arg2 && arg0 < arg2 + 16 && arg6 + arg1 - 16 <= arg3 && arg1 + arg6 > arg3) {
				arg5.anInt4418 += 4;
				Static237.method2927(arg5);
			} else if (arg0 >= arg2 - Static298.anInt5644 && arg2 + Static298.anInt5644 + 16 > arg0 && arg3 >= arg6 + 16 && arg3 < arg6 + arg1 - 16) {
				local131 = (arg1 - 32) * arg1 / arg4;
				if (local131 < 8) {
					local131 = 8;
				}
				@Pc(150) int local150 = arg3 - local131 / 2 - arg6 - 16;
				@Pc(157) int local157 = arg1 - local131 - 32;
				arg5.anInt4418 = local150 * (arg4 - arg1) / local157;
				Static237.method2927(arg5);
				Static69.aBoolean111 = true;
			}
		}
		if (Static26.anInt498 == 0) {
			return;
		}
		local131 = arg5.anInt4345;
		if (arg0 >= arg2 - local131 && arg6 <= arg3 && arg2 + 16 > arg0 && arg3 <= arg1 + arg6) {
			arg5.anInt4418 += Static26.anInt498 * 45;
			Static237.method2927(arg5);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	public static void method1607() {
		Static179.aClass169_100.method4014();
	}
}
