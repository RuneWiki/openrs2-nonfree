import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
	public static int anInt6472;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "[I")
	public static int[] anIntArray705;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_97 = new Class244(40, -1);

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_47 = new Class138();

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!f;IIIILclient!np;IIIIBZILclient!ok;I)Lclient!f;")
	public static Class75 method5712(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class155 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class177 arg12, @OriginalArg(14) int arg13) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg12 != null) {
			local11 = arg12.method4083(false, -1, arg9) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(50) long local50 = ((long) arg6 << 48) + ((long) arg3 << 32) + (long) ((arg8 << 24) + (arg2 - -(arg1 << 16)));
		@Pc(52) Class139 local52 = Static59.aClass139_8;
		@Pc(60) Class75 local60;
		synchronized (Static59.aClass139_8) {
			local60 = (Class75) Static59.aClass139_8.method3076(local50);
		}
		@Pc(155) int local155;
		@Pc(161) int local161;
		@Pc(167) int local167;
		@Pc(171) int local171;
		if (local60 == null || arg5.method4919(local60.method5462(), local11) != 0) {
			if (local60 != null) {
				local11 = arg5.method4920(local11, local60.method5462());
			}
			@Pc(101) byte local101;
			if (arg2 == 1) {
				local101 = 9;
			} else if (arg2 == 2) {
				local101 = 12;
			} else if (arg2 == 3) {
				local101 = 15;
			} else if (arg2 == 4) {
				local101 = 18;
			} else {
				local101 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(148) Class239 local148 = new Class239(local101 * 3 + 1, local101 * 3 * 2 - local101, 0);
			local155 = local148.method5565(0, 0, 0);
			@Pc(159) int[][] local159 = new int[3][local101];
			@Pc(173) int local173;
			@Pc(197) int local197;
			for (local161 = 0; local161 < 3; local161++) {
				local167 = local130[local161];
				local171 = local130[local161];
				for (local173 = 0; local173 < local101; local173++) {
					@Pc(181) int local181 = (local173 << 14) / local101;
					@Pc(189) int local189 = Class226.anIntArray614[local181] * local167 >> 15;
					local197 = Class226.anIntArray613[local181] * local171 >> 15;
					local159[local161][local173] = local148.method5565(0, local197, local189);
				}
			}
			for (local167 = 0; local167 < 3; local167++) {
				local171 = (local167 * 256 + 128) / 3;
				local173 = 256 - local171;
				@Pc(252) byte local252 = (byte) (arg8 * local171 + local173 * arg1 >> 8);
				@Pc(297) short local297 = (short) ((local171 * (arg6 & 0x380) + local173 * (arg3 & 0x380) & 0x38000) + (local173 * (arg3 & 0xFC00) + (arg6 & 0xFC00) * local171 & 0xFC0000) + ((arg3 & 0x7F) * local173 + local171 * (arg6 & 0x7F) & 0x7F00) >> 8);
				for (local197 = 0; local197 < local101; local197++) {
					if (local167 == 0) {
						local148.method5572(local297, local155, (byte) 1, local159[0][local197], local252, local159[0][(local197 + 1) % local101], (short) -1, (byte) -1);
					} else {
						local148.method5572(local297, local159[local167 - 1][local197], (byte) 1, local159[local167][(local197 + 1) % local101], local252, local159[local167 - 1][(local197 + 1) % local101], (short) -1, (byte) -1);
						local148.method5572(local297, local159[local167 - 1][local197], (byte) 1, local159[local167][local197], local252, local159[local167][(local197 + 1) % local101], (short) -1, (byte) -1);
					}
				}
			}
			local60 = arg5.method4930(local148, local11, Static156.anInt2793, 64, 768);
			@Pc(419) Class139 local419 = Static59.aClass139_8;
			synchronized (Static59.aClass139_8) {
				Static59.aClass139_8.method3070(local60, local50);
			}
		}
		@Pc(440) int local440 = arg2 * 64 - 1;
		@Pc(443) int local443 = -local440;
		@Pc(446) int local446 = -local440;
		@Pc(448) int local448 = local440;
		local155 = local440;
		if (arg10) {
			if (arg11 > 5120 && arg11 < 11264) {
				local155 = local440 + 128;
			}
			if (arg11 > 9216 && arg11 < 15360) {
				local448 = local440 + 128;
			}
			if (arg11 > 13312 || arg11 < 3072) {
				local446 -= 128;
			}
			if (arg11 > 1024 && arg11 < 7168) {
				local443 -= 128;
			}
		}
		@Pc(496) int local496 = arg0.method5457();
		local161 = arg0.method5464();
		local167 = arg0.method5477();
		if (local446 > local167) {
			local167 = local446;
		}
		local171 = arg0.method5490();
		if (local443 > local496) {
			local496 = local443;
		}
		if (local448 < local161) {
			local161 = local448;
		}
		if (local155 < local171) {
			local171 = local155;
		}
		@Pc(539) Class3_Sub7_Sub15 local539 = null;
		if (arg12 != null) {
			@Pc(546) int local546 = arg12.anIntArray499[arg9];
			local539 = Static176.aClass43_2.method931(local546 >> 16);
			arg9 = local546 & 0xFFFF;
		}
		if (local539 == null) {
			local60 = local60.method5473((byte) 3, local11, true);
			local60.method5485((local161 - local496) / 2, 128, (local171 - local167) / 2);
			local60.method5482((local496 + local161) / 2, 0, (local171 + local167) / 2);
		} else {
			local60 = local60.method5473((byte) 3, local11, true);
			local60.method5485((local161 - local496) / 2, 128, (local171 - local167) / 2);
			local60.method5482((local161 + local496) / 2, 0, (local171 + local167) / 2);
			local60.method5455(local539, arg9);
		}
		if (arg4 != 0) {
			local60.method5466(arg4);
		}
		if (arg7 != 0) {
			local60.method5474(arg7);
		}
		if (arg13 != 0) {
			local60.method5482(0, arg13, 0);
		}
		return local60;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
	public static void method5713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) Object local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		for (@Pc(46) int local46 = arg0; local46 < arg1; local46++) {
			if (arg3[local46] < (local46 & 0x1) + local20) {
				@Pc(65) int local65 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local65;
				@Pc(79) Object local79 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local79;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method5713(arg0, local16 - 1, arg2, arg3);
		method5713(local16 + 1, arg1, arg2, arg3);
	}
}
