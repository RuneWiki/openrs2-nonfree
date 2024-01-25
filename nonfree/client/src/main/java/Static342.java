import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rd", name = "Uc", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array10;

	@OriginalMember(owner = "client!rd", name = "yd", descriptor = "I")
	public static int anInt5684;

	@OriginalMember(owner = "client!rd", name = "Jc", descriptor = "Lclient!ub;")
	public static Class244 aClass244_34 = new Class244();

	@OriginalMember(owner = "client!rd", name = "Oc", descriptor = "Z")
	public static boolean aBoolean400 = false;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IIII)V")
	public static void method4552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class206 local14 = Static67.aClass206ArrayArray1[arg0][arg2];
		Static71.method5806(local14 == null ? Static18.aClass206_1 : local14, arg1);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V")
	public static void method4553(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(14, arg0);
		local8.method5523();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!ya;IILclient!t;IZIIIIILclient!id;II)Lclient!t;")
	public static Class116 method4555(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class116 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class119 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg11 != null) {
			local11 = arg11.method2293(false, arg9, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(53) long local53 = (long) ((arg8 << 24) + arg10 + (arg12 << 16)) + ((long) arg4 << 32) + ((long) arg13 << 48);
		@Pc(55) Class137 local55 = Static31.aClass137_5;
		@Pc(63) Class116 local63;
		synchronized (Static31.aClass137_5) {
			local63 = (Class116) Static31.aClass137_5.method2744(local53);
		}
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(166) int local166;
		@Pc(170) int local170;
		if (local63 == null || arg1.method5356(local63.P(), local11) != 0) {
			if (local63 != null) {
				local11 = arg1.method5399(local11, local63.P());
			}
			@Pc(90) byte local90;
			if (arg10 == 1) {
				local90 = 9;
			} else if (arg10 == 2) {
				local90 = 12;
			} else if (arg10 == 3) {
				local90 = 15;
			} else if (arg10 == 4) {
				local90 = 18;
			} else {
				local90 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(147) Class166 local147 = new Class166(local90 * 3 + 1, 2 * 3 * local90 - local90, 0);
			local154 = local147.method3198(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local90];
			@Pc(172) int local172;
			@Pc(196) int local196;
			for (local160 = 0; local160 < 3; local160++) {
				local166 = local130[local160];
				local170 = local130[local160];
				for (local172 = 0; local172 < local90; local172++) {
					@Pc(180) int local180 = (local172 << 14) / local90;
					@Pc(188) int local188 = Class100.anIntArray206[local180] * local166 >> 15;
					local196 = Class100.anIntArray208[local180] * local170 >> 15;
					local158[local160][local172] = local147.method3198(0, local196, local188);
				}
			}
			for (local166 = 0; local166 < 3; local166++) {
				local170 = (local166 * 256 + 128) / 3;
				local172 = 256 - local170;
				@Pc(243) byte local243 = (byte) (arg8 * local170 + arg12 * local172 >> 8);
				@Pc(288) short local288 = (short) (((arg4 & 0x7F) * local172 + (arg13 & 0x7F) * local170 & 0x7F00) + ((arg4 & 0x380) * local172 + (arg13 & 0x380) * local170 & 0x38000) + ((arg4 & 0xFC00) * local172 + (arg13 & 0xFC00) * local170 & 0xFC0000) >> 8);
				for (local196 = 0; local196 < local90; local196++) {
					if (local166 == 0) {
						local147.method3201(local158[0][(local196 + 1) % local90], local154, local243, (byte) 1, local288, (short) -1, (byte) -1, local158[0][local196]);
					} else {
						local147.method3201(local158[local166 - 1][(local196 + 1) % local90], local158[local166 - 1][local196], local243, (byte) 1, local288, (short) -1, (byte) -1, local158[local166][(local196 + 1) % local90]);
						local147.method3201(local158[local166][(local196 + 1) % local90], local158[local166 - 1][local196], local243, (byte) 1, local288, (short) -1, (byte) -1, local158[local166][local196]);
					}
				}
			}
			local63 = arg1.method5391(local147, local11, Static69.anInt3210, 64, 768);
			@Pc(412) Class137 local412 = Static31.aClass137_5;
			synchronized (Static31.aClass137_5) {
				Static31.aClass137_5.method2732(local53, local63);
			}
		}
		@Pc(431) int local431 = (arg10 << 6) - 1;
		@Pc(434) int local434 = -local431;
		@Pc(437) int local437 = -local431;
		@Pc(439) int local439 = local431;
		local154 = local431;
		if (arg5) {
			if (arg2 > 13312 || arg2 < 3072) {
				local437 -= 128;
			}
			if (arg2 > 9216 && arg2 < 15360) {
				local439 = local431 + 128;
			}
			if (arg2 > 1024 && arg2 < 7168) {
				local434 -= 128;
			}
			if (arg2 > 5120 && arg2 < 11264) {
				local154 = local431 + 128;
			}
		}
		@Pc(480) int local480 = arg3.HA();
		local160 = arg3.NA();
		local166 = arg3.PA();
		if (local434 > local480) {
			local480 = local434;
		}
		local170 = arg3.m();
		if (local160 > local439) {
			local160 = local439;
		}
		if (local166 < local437) {
			local166 = local437;
		}
		if (local154 < local170) {
			local170 = local154;
		}
		@Pc(515) Class4_Sub2_Sub6 local515 = null;
		if (arg11 != null) {
			@Pc(522) int local522 = arg11.anIntArray244[arg9];
			local515 = Static170.aClass125_3.method2383(local522 >> 16);
			arg9 = local522 & 0xFFFF;
		}
		if (local515 == null) {
			local63 = local63.method3123((byte) 3, local11, true);
			local63.H(local160 - local480 >> 1, 128, local170 - local166 >> 1);
			local63.JA(local160 + local480 >> 1, 0, local170 + local166 >> 1);
		} else {
			local63 = local63.method3123((byte) 3, local11, true);
			local63.H(local160 - local480 >> 1, 128, local170 - local166 >> 1);
			local63.JA(local160 + local480 >> 1, 0, local166 + local170 >> 1);
			local63.method3108(local515, arg9);
		}
		if (arg7 != 0) {
			local63.Z(arg7);
		}
		if (arg6 != 0) {
			local63.R(arg6);
		}
		if (arg0 != 0) {
			local63.JA(0, arg0, 0);
		}
		return local63;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!lo;)V")
	public static void method4556(@OriginalArg(1) Class20_Sub5 arg0) {
		arg0.aClass8_1 = null;
		@Pc(10) int local10 = arg0.aClass20_Sub8Array1.length;
		for (@Pc(16) int local16 = 0; local16 < local10; local16++) {
			arg0.aClass20_Sub8Array1[local16].aBoolean508 = false;
		}
		@Pc(33) Class248[] local33 = Class4_Sub2_Sub11.aClass248Array1;
		synchronized (Class4_Sub2_Sub11.aClass248Array1) {
			if (local10 < Class4_Sub2_Sub11.aClass248Array1.length && Static353.anIntArray465[local10] < 200) {
				Class4_Sub2_Sub11.aClass248Array1[local10].method5585(arg0);
				@Pc(62) int local62 = Static353.anIntArray465[local10]++;
			}
		}
	}
}
