import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!wm", name = "mb", descriptor = "I")
	public static int anInt7974;

	@OriginalMember(owner = "client!wm", name = "ob", descriptor = "Lclient!tb;")
	public static Class6_Sub40 aClass6_Sub40_2;

	@OriginalMember(owner = "client!wm", name = "ab", descriptor = "Lclient!dc;")
	public static final Class44 aClass44_59 = new Class44(20);

	@OriginalMember(owner = "client!wm", name = "hb", descriptor = "[I")
	public static final int[] anIntArray549 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!wm", name = "jb", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_154 = new Class92(62, 8);

	@OriginalMember(owner = "client!wm", name = "nb", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_420 = new Class123(62, 6);

	@OriginalMember(owner = "client!wm", name = "pb", descriptor = "I")
	public static int anInt7975 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIILclient!ab;Lclient!ab;)V")
	public static void method6519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1 arg3, @OriginalArg(4) Class3_Sub1 arg4) {
		@Pc(4) Class101 local4 = Static217.method3259(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass3_Sub1_2 = arg3;
			local4.aClass3_Sub1_3 = arg4;
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)V")
	public static void method6520(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg0, 14);
		local8.method3084();
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(B)V")
	public static void method6521() {
		if (Static181.anInt3578 == -1 || Static53.anInt1471 == -1) {
			return;
		}
		@Pc(32) int local32 = (Static112.anInt2389 * (Static77.anInt1946 - Static38.anInt1153) >> 16) + Static38.anInt1153;
		Static112.anInt2389 += local32;
		if (Static112.anInt2389 >= 65535) {
			if (Static33.aBoolean90) {
				Static378.aBoolean431 = false;
			} else {
				Static378.aBoolean431 = true;
			}
			Static112.anInt2389 = 65535;
			Static33.aBoolean90 = true;
		} else {
			Static378.aBoolean431 = false;
			Static33.aBoolean90 = false;
		}
		@Pc(62) float local62 = (float) Static112.anInt2389 / 65535.0F;
		@Pc(65) float[] local65 = new float[3];
		@Pc(69) int local69 = Static14.anInt444 * 2;
		@Pc(95) int local95;
		@Pc(128) int local128;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(150) int local150;
		@Pc(168) int local168;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(83) int local83 = Static345.anIntArrayArrayArray13[Static181.anInt3578][local69][local71] * 3;
			local95 = Static345.anIntArrayArrayArray13[Static181.anInt3578][local69 + 1][local71] * 3;
			local128 = (Static345.anIntArrayArrayArray13[Static181.anInt3578][local69 + 2][local71] + Static345.anIntArrayArrayArray13[Static181.anInt3578][local69 + 2][local71] - Static345.anIntArrayArrayArray13[Static181.anInt3578][local69 + 3][local71]) * 3;
			local136 = Static345.anIntArrayArrayArray13[Static181.anInt3578][local69][local71];
			local140 = local95 - local83;
			local150 = local83 + local128 - local95 * 2;
			local168 = local95 + Static345.anIntArrayArrayArray13[Static181.anInt3578][local69 + 2][local71] - local128 - local136;
			local65[local71] = local62 * ((float) local140 + local62 * (local62 * (float) local168 + (float) local150)) + (float) local136;
		}
		Static229.anInt4187 = (int) local65[2] - Static348.anInt6273 * 128;
		Static157.anInt3220 = (int) local65[0] - Static2.anInt6396 * 128;
		Static367.anInt6653 = (int) local65[1] * -1;
		@Pc(223) float[] local223 = new float[3];
		local95 = Static110.anInt6977 * 2;
		for (local128 = 0; local128 < 3; local128++) {
			local136 = Static345.anIntArrayArrayArray13[Static53.anInt1471][local95][local128] * 3;
			local140 = Static345.anIntArrayArrayArray13[Static53.anInt1471][local95 + 1][local128] * 3;
			local150 = (Static345.anIntArrayArrayArray13[Static53.anInt1471][local95 + 2][local128] + Static345.anIntArrayArrayArray13[Static53.anInt1471][local95 + 2][local128] - Static345.anIntArrayArrayArray13[Static53.anInt1471][local95 + 3][local128]) * 3;
			local168 = Static345.anIntArrayArrayArray13[Static53.anInt1471][local95][local128];
			@Pc(299) int local299 = local140 - local136;
			@Pc(308) int local308 = local150 + local136 - local140 * 2;
			@Pc(326) int local326 = local140 + Static345.anIntArrayArrayArray13[Static53.anInt1471][local95 + 2][local128] - local150 - local168;
			local223[local128] = local62 * (((float) local308 + local62 * (float) local326) * local62 + (float) local299) + (float) local168;
		}
		@Pc(361) float local361 = local223[0] - local65[0];
		@Pc(372) float local372 = -1.0F * (local223[1] - local65[1]);
		@Pc(380) float local380 = local223[2] - local65[2];
		@Pc(390) double local390 = Math.sqrt((double) (local380 * local380 + local361 * local361));
		Static328.anInt5668 = (int) (Math.atan2((double) local372, local390) * 2607.5945876176133D) & 0x3FFF;
		Static260.anInt4728 = (int) (-Math.atan2((double) local361, (double) local380) * 2607.5945876176133D) & 0x3FFF;
		Static251.anInt6446 = (Static112.anInt2389 * (Static345.anIntArrayArrayArray13[Static181.anInt3578][local69 + 2][3] - Static345.anIntArrayArrayArray13[Static181.anInt3578][local69][3]) >> 16) + Static345.anIntArrayArrayArray13[Static181.anInt3578][local69][3];
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIILclient!eq;III[[[BIIIII)V")
	public static void method6522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg10 == 0 || arg0 == 0) {
			return;
		}
		if (arg10 == 9) {
			arg10 = 1;
			arg5 = arg5 + 1 & 0x3;
		}
		if (arg10 == 10) {
			arg5 = arg5 + 3 & 0x3;
			arg10 = 1;
		}
		if (arg10 == 11) {
			arg10 = 8;
			arg5 = arg5 + 3 & 0x3;
		}
		arg3.method4989(arg11, arg1, arg9, arg8, arg4, arg2, arg7[arg10 - 1][arg5], arg0, arg6);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIZIIZ)V")
	public static void method6524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) Class152_Sub1 local20 = Static266.aClass152_Sub1Array2[local14];
		Static266.aClass152_Sub1Array2[local14] = Static266.aClass152_Sub1Array2[arg1];
		Static266.aClass152_Sub1Array2[arg1] = local20;
		for (@Pc(32) int local32 = arg0; local32 < arg1; local32++) {
			if (Static275.method4148(local20, Static266.aClass152_Sub1Array2[local32], arg2, arg3, arg5, arg4) <= 0) {
				@Pc(51) Class152_Sub1 local51 = Static266.aClass152_Sub1Array2[local32];
				Static266.aClass152_Sub1Array2[local32] = Static266.aClass152_Sub1Array2[local16];
				Static266.aClass152_Sub1Array2[local16++] = local51;
			}
		}
		Static266.aClass152_Sub1Array2[arg1] = Static266.aClass152_Sub1Array2[local16];
		Static266.aClass152_Sub1Array2[local16] = local20;
		method6524(arg0, local16 - 1, arg2, arg3, arg4, arg5);
		method6524(local16 + 1, arg1, arg2, arg3, arg4, arg5);
	}
}
