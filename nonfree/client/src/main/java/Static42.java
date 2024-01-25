import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Lclient!tv;")
	public static Class235 aClass235_1;

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_11 = new Class194(32, 3);

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BI)V")
	public static void method666(@OriginalArg(1) int arg0) {
		Static70.anInt1274 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILclient!za;ILclient!e;IILclient!kt;IIIIIII)Lclient!e;")
	public static Class57 method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class200 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class143 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg7 != null) {
			local11 = arg7.method2992(-1, arg10, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(55) long local55 = ((long) arg1 << 32) + (long) ((arg9 << 24) + (arg13 << 16) + arg11) + ((long) arg8 << 48);
		@Pc(57) Class44 local57 = Static74.aClass44_9;
		@Pc(65) Class57 local65;
		synchronized (Static74.aClass44_9) {
			local65 = (Class57) Static74.aClass44_9.method1028(local55);
		}
		@Pc(155) int local155;
		@Pc(161) int local161;
		@Pc(167) int local167;
		@Pc(171) int local171;
		if (local65 == null || arg2.method5860(local65.RA(), local11) != 0) {
			if (local65 != null) {
				local11 = arg2.method5879(local11, local65.RA());
			}
			@Pc(95) byte local95;
			if (arg11 == 1) {
				local95 = 9;
			} else if (arg11 == 2) {
				local95 = 12;
			} else if (arg11 == 3) {
				local95 = 15;
			} else if (arg11 == 4) {
				local95 = 18;
			} else {
				local95 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(148) Class74 local148 = new Class74(local95 * 3 + 1, local95 * 3 * 2 + -local95, 0);
			local155 = local148.method1585(0, 0, 0);
			@Pc(159) int[][] local159 = new int[3][local95];
			@Pc(173) int local173;
			@Pc(197) int local197;
			for (local161 = 0; local161 < 3; local161++) {
				local167 = local130[local161];
				local171 = local130[local161];
				for (local173 = 0; local173 < local95; local173++) {
					@Pc(181) int local181 = (local173 << 14) / local95;
					@Pc(189) int local189 = Class30.anIntArray38[local181] * local167 >> 15;
					local197 = local171 * Class30.anIntArray37[local181] >> 15;
					local159[local161][local173] = local148.method1585(0, local197, local189);
				}
			}
			for (local167 = 0; local167 < 3; local167++) {
				local171 = (local167 * 256 + 128) / 3;
				local173 = 256 - local171;
				@Pc(252) byte local252 = (byte) (arg13 * local173 + local171 * arg9 >> 8);
				@Pc(297) short local297 = (short) ((local173 * (arg1 & 0x7F) + local171 * (arg8 & 0x7F) & 0x7F00) + ((arg8 & 0x380) * local171 + local173 * (arg1 & 0x380) & 0x38000) + ((arg8 & 0xFC00) * local171 + local173 * (arg1 & 0xFC00) & 0xFC0000) >> 8);
				for (local197 = 0; local197 < local95; local197++) {
					if (local167 == 0) {
						local148.method1592((byte) -1, local159[0][(local197 + 1) % local95], local159[0][local197], local252, (short) -1, local155, local297, (byte) 1);
					} else {
						local148.method1592((byte) -1, local159[local167 - 1][(local197 + 1) % local95], local159[local167][(local197 + 1) % local95], local252, (short) -1, local159[local167 - 1][local197], local297, (byte) 1);
						local148.method1592((byte) -1, local159[local167][(local197 + 1) % local95], local159[local167][local197], local252, (short) -1, local159[local167 - 1][local197], local297, (byte) 1);
					}
				}
			}
			local65 = arg2.method5882(local148, local11, Static136.anInt7478, 64, 768);
			@Pc(420) Class44 local420 = Static74.aClass44_9;
			synchronized (Static74.aClass44_9) {
				Static74.aClass44_9.method1017(local55, local65);
			}
		}
		@Pc(439) int local439 = (arg11 << 6) - 1;
		@Pc(442) int local442 = -local439;
		@Pc(445) int local445 = -local439;
		@Pc(447) int local447 = local439;
		local155 = local439;
		if (arg3 != 0) {
			if ((arg3 & 0x1) != 0) {
				local155 = local439 + 128;
			}
			if ((arg3 & 0x4) != 0) {
				local447 = local439 + 128;
			}
			if ((arg3 & 0x2) != 0) {
				local445 -= 128;
			}
			if ((arg3 & 0x8) != 0) {
				local442 -= 128;
			}
		}
		@Pc(483) int local483 = arg4.ta();
		local161 = arg4.MA();
		local167 = arg4.Z();
		local171 = arg4.S();
		if (local167 < local445) {
			local167 = local445;
		}
		if (local447 < local161) {
			local161 = local447;
		}
		if (local442 > local483) {
			local483 = local442;
		}
		if (local171 > local155) {
			local171 = local155;
		}
		@Pc(518) Class5_Sub2_Sub6 local518 = null;
		if (arg7 != null) {
			@Pc(525) int local525 = arg7.anIntArray241[arg10];
			local518 = Static271.aClass219_4.method4756(local525 >> 16);
			arg10 = local525 & 0xFFFF;
		}
		if (local518 == null) {
			local65 = local65.method6066((byte) 3, local11, true);
			local65.n(local161 - local483 >> 1, 128, local171 - local167 >> 1);
			local65.a(local161 + local483 >> 1, 0, local171 + local167 >> 1);
		} else {
			local65 = local65.method6066((byte) 3, local11, true);
			local65.n(local161 - local483 >> 1, 128, local171 - local167 >> 1);
			local65.a(local483 + local161 >> 1, 0, local171 + local167 >> 1);
			local65.method6065(local518, arg10);
		}
		if (arg12 != 0) {
			local65.W(arg12);
		}
		if (arg6 != 0) {
			local65.K(arg6);
		}
		if (arg0 != 0) {
			local65.a(0, arg0, 0);
		}
		return local65;
	}
}
