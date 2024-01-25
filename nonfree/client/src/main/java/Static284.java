import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!oj", name = "B", descriptor = "Lclient!l;")
	public static Class17 aClass17_39;

	@OriginalMember(owner = "client!oj", name = "C", descriptor = "Lclient!c;")
	public static Class35 aClass35_5;

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
	public static int anInt5128 = 0;

	@OriginalMember(owner = "client!oj", name = "D", descriptor = "[I")
	public static final int[] anIntArray418 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[200];

	@OriginalMember(owner = "client!oj", name = "H", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_110 = new Class265(40, 12);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(FIFZFIII)[F")
	public static float[] method4116(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[2] = local25;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		local6[3] = 0.0F;
		local6[5] = 0.0F;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[6] = -local25;
		local6[8] = local17;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = (float) arg1 / 32767.0F;
		@Pc(89) float local89 = 1.0F - local84;
		@Pc(99) float local99 = -((float) Math.sqrt((double) (1.0F - local84 * local84)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg5 * arg5 + arg6 * arg6));
		if (local110 == 0.0F && local84 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local79 = (float) arg6 / local110;
				local77 = (float) -arg5 / local110;
			}
			local75[4] = local84;
			local75[7] = local99 * -local77;
			local75[0] = local89 * local77 * local77 + local84;
			local75[8] = local79 * local79 * local89 + local84;
			local75[1] = local99 * local79;
			local75[3] = -local79 * local99;
			local75[2] = local77 * local79 * local89;
			local75[5] = local77 * local99;
			local75[6] = local89 * local79 * local77;
			local9[0] = local6[2] * local75[6] + local6[1] * local75[3] + local6[0] * local75[0];
			local9[1] = local75[7] * local6[2] + local6[0] * local75[1] + local75[4] * local6[1];
			local9[2] = local6[0] * local75[2] + local6[1] * local75[5] + local6[2] * local75[8];
			local9[3] = local6[3] * local75[0] + local75[3] * local6[4] + local75[6] * local6[5];
			local9[4] = local75[7] * local6[5] + local75[4] * local6[4] + local6[3] * local75[1];
			local9[5] = local75[5] * local6[4] + local75[2] * local6[3] + local6[5] * local75[8];
			local9[6] = local75[3] * local6[7] + local75[0] * local6[6] + local6[8] * local75[6];
			local9[7] = local75[4] * local6[7] + local75[1] * local6[6] + local75[7] * local6[8];
			local9[8] = local6[6] * local75[2] + local75[5] * local6[7] + local6[8] * local75[8];
		}
		local9[0] *= arg3;
		local9[8] *= arg0;
		local9[1] *= arg3;
		local9[4] *= arg2;
		local9[5] *= arg2;
		local9[6] *= arg0;
		local9[3] *= arg2;
		local9[7] *= arg0;
		local9[2] *= arg3;
		return local9;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIJILclient!ma;IILclient!em;I)V")
	public static void method4117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class73 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class68 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) int local11 = arg5 * arg5 + arg1 * arg1;
		if ((long) local11 > arg2) {
			return;
		}
		@Pc(36) int local36 = Math.min(arg6.anInt2188 / 2, arg6.anInt2252 / 2);
		if (local36 * local36 >= local11) {
			Static216.method4816(arg1, arg4, arg0, Static359.aClass17Array14[arg7], arg5, arg3, arg6);
			return;
		}
		local36 -= 10;
		@Pc(64) int local64;
		if (Static159.anInt3195 == 4) {
			local64 = (int) Static202.aFloat62 & 0x3FFF;
		} else {
			local64 = (int) Static202.aFloat62 + Static166.anInt3321 & 0x3FFF;
		}
		@Pc(78) int local78 = Class162.anIntArray388[local64];
		@Pc(82) int local82 = Class162.anIntArray387[local64];
		if (Static159.anInt3195 != 4) {
			local82 = local82 * 256 / (Static261.anInt4889 + 256);
			local78 = local78 * 256 / (Static261.anInt4889 + 256);
		}
		@Pc(111) int local111 = arg5 * local78 + local82 * arg1 >> 15;
		@Pc(122) int local122 = local82 * arg5 - local78 * arg1 >> 15;
		@Pc(128) double local128 = Math.atan2((double) local111, (double) local122);
		@Pc(135) int local135 = (int) (Math.sin(local128) * (double) local36);
		@Pc(142) int local142 = (int) ((double) local36 * Math.cos(local128));
		Static224.aClass17Array8[arg7].method5772((float) arg6.anInt2188 / 2.0F + (float) arg0 + (float) local135, (float) arg6.anInt2252 / 2.0F + (float) arg3 - (float) local142, 4096, (int) (-local128 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIII)I")
	public static int method4118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg1;
			arg1 = local12;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg0;
		} else {
			return 1 + 7 - arg1 - arg3;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIBIII)V")
	public static void method4119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(55) int local55 = local17 - (local29 - 1) * local25;
		@Pc(59) int local59 = local13 << 2;
		@Pc(63) int local63 = local17 << 2;
		@Pc(71) int local71 = local21 * 3;
		@Pc(79) int local79 = local25 * ((arg3 << 1) - 3);
		@Pc(85) int local85 = local63;
		@Pc(91) int local91 = local59 * (arg3 - 1);
		@Pc(113) int local113;
		@Pc(122) int local122;
		if (arg2 >= Static430.anInt7123 && arg2 <= Static181.anInt3543) {
			local113 = Static327.method4554(arg1 + arg4, Static184.anInt3600, Static8.anInt223);
			local122 = Static327.method4554(arg4 - arg1, Static184.anInt3600, Static8.anInt223);
			Static64.method1247(local122, Static280.anIntArrayArray51[arg2], local113, arg0);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local55 += local85;
					local38 += local71;
					local71 += local63;
					local85 += local63;
					local7++;
				}
			}
			if (local55 < 0) {
				local38 += local71;
				local55 += local85;
				local85 += local63;
				local7++;
				local71 += local63;
			}
			local55 += -local79;
			local38 += -local91;
			local91 -= local59;
			local79 -= local59;
			local9--;
			local113 = arg2 - local9;
			local122 = arg2 + local9;
			if (Static430.anInt7123 <= local122 && Static181.anInt3543 >= local113) {
				@Pc(222) int local222 = Static327.method4554(arg4 + local7, Static184.anInt3600, Static8.anInt223);
				@Pc(231) int local231 = Static327.method4554(arg4 - local7, Static184.anInt3600, Static8.anInt223);
				if (Static430.anInt7123 <= local113) {
					Static64.method1247(local231, Static280.anIntArrayArray51[local113], local222, arg0);
				}
				if (Static181.anInt3543 >= local122) {
					Static64.method1247(local231, Static280.anIntArrayArray51[local122], local222, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V")
	public static void method4120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = Static12.aClass79_Sub1_1.anInt4931 * arg1 >> 8;
		if (local15 != 0 && arg2 != -1) {
			Static59.method1150(Static223.aClass160_42, arg2, local15);
			Static144.aBoolean238 = true;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIILclient!id;)V")
	public static void method4121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub4 arg4) {
		@Pc(4) Class106 local4 = Static292.method4206(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt4301 = (arg1 << Static307.anInt5425) + Static414.anInt6898;
		arg4.anInt4296 = arg3;
		arg4.anInt4300 = (arg2 << Static307.anInt5425) + Static414.anInt6898;
		for (@Pc(28) Class4 local28 = local4.aClass4_3; local28 != null; local28 = local28.aClass4_1) {
			if (local28.aClass3_Sub2_1.aBoolean425) {
				@Pc(38) int local38 = local28.aClass3_Sub2_1.method4916();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt4296 += local8;
			arg4.aBoolean313 = true;
		}
		local4.aClass3_Sub4_1 = arg4;
	}
}
