import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!lda", name = "D", descriptor = "Lclient!fc;")
	public static Class96 aClass96_10;

	@OriginalMember(owner = "client!lda", name = "F", descriptor = "I")
	public static int anInt5197;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(JIILclient!et;IIZILclient!pa;)V")
	public static void method4817(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class28 arg7) {
		@Pc(17) int local17 = arg4 * arg4 + arg1 * arg1;
		if (arg0 < (long) local17) {
			return;
		}
		@Pc(33) int local33 = Math.min(arg3.anInt2399 / 2, arg3.anInt2378 / 2);
		if (local17 <= local33 * local33) {
			Static119.method2307(arg7, arg3, arg2, arg5, arg1, arg4, Static128.aClass104Array51[arg6]);
			return;
		}
		local33 -= 10;
		@Pc(61) int local61;
		if (Static170.anInt3418 == 4) {
			local61 = (int) Static135.aFloat193 & 0x3FFF;
		} else {
			local61 = (int) Static135.aFloat193 + Static445.anInt7798 & 0x3FFF;
		}
		@Pc(75) int local75 = Class200_Sub1.lb[local61];
		@Pc(79) int local79 = Class200_Sub1.anIntArray576[local61];
		if (Static170.anInt3418 != 4) {
			local75 = local75 * 256 / (Static220.anInt4325 + 256);
			local79 = local79 * 256 / (Static220.anInt4325 + 256);
		}
		@Pc(111) int local111 = local75 * arg1 + local79 * arg4 >> 15;
		@Pc(122) int local122 = arg1 * local79 - arg4 * local75 >> 15;
		@Pc(128) double local128 = Math.atan2((double) local111, (double) local122);
		@Pc(135) int local135 = (int) (Math.sin(local128) * (double) local33);
		@Pc(142) int local142 = (int) (Math.cos(local128) * (double) local33);
		Static480.aClass104Array79[arg6].method7714((float) arg2 + (float) arg3.anInt2399 / 2.0F + (float) local135, (float) arg5 + (float) arg3.anInt2378 / 2.0F - (float) local142, 4096, (int) (-local128 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIILclient!lk;IIIILclient!r;BIIIILclient!qa;)Lclient!r;")
	public static Class97 method4818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class176 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class97 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class4 arg13) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method4868(false, -1, arg0) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg7 << 48) + (long) (arg9 + (arg11 << 16) + (arg4 << 24)) + ((long) arg2 << 32);
		@Pc(49) Class277 local49 = Static332.aClass277_47;
		@Pc(57) Class97 local57;
		synchronized (Static332.aClass277_47) {
			local57 = (Class97) Static332.aClass277_47.method7014(local47);
		}
		@Pc(155) int local155;
		@Pc(161) int local161;
		@Pc(167) int local167;
		@Pc(171) int local171;
		if (local57 == null || arg13.method7167(local57.ba(), local11) != 0) {
			if (local57 != null) {
				local11 = arg13.method7184(local11, local57.ba());
			}
			@Pc(92) byte local92;
			if (arg9 == 1) {
				local92 = 9;
			} else if (arg9 == 2) {
				local92 = 12;
			} else if (arg9 == 3) {
				local92 = 15;
			} else if (arg9 == 4) {
				local92 = 18;
			} else {
				local92 = 21;
			}
			@Pc(129) int[] local129 = new int[] { 64, 96, 128 };
			@Pc(148) Class81 local148 = new Class81(local92 * 3 + 1, -local92 + local92 * 6, 0);
			local155 = local148.method2161(0, 0, 0);
			@Pc(159) int[][] local159 = new int[3][local92];
			@Pc(173) int local173;
			@Pc(197) int local197;
			for (local161 = 0; local161 < 3; local161++) {
				local167 = local129[local161];
				local171 = local129[local161];
				for (local173 = 0; local173 < local92; local173++) {
					@Pc(181) int local181 = (local173 << 14) / local92;
					@Pc(189) int local189 = local167 * Class200_Sub1.lb[local181] >> 15;
					local197 = local171 * Class200_Sub1.anIntArray576[local181] >> 15;
					local159[local161][local173] = local148.method2161(0, local197, local189);
				}
			}
			for (local167 = 0; local167 < 3; local167++) {
				local171 = (local167 * 256 + 128) / 3;
				local173 = 256 - local171;
				@Pc(248) byte local248 = (byte) (local173 * arg11 + local171 * arg4 >> 8);
				@Pc(293) short local293 = (short) (((arg2 & 0x7F) * local173 + local171 * (arg7 & 0x7F) & 0x7F00) + (local171 * (arg7 & 0xFC00) + local173 * (arg2 & 0xFC00) & 0xFC0000) + (local171 * (arg7 & 0x380) + (arg2 & 0x380) * local173 & 0x38000) >> 8);
				for (local197 = 0; local197 < local92; local197++) {
					if (local167 == 0) {
						local148.method2160(local155, local248, (byte) -1, (short) -1, (byte) 1, local293, local159[0][(local197 + 1) % local92], local159[0][local197]);
					} else {
						local148.method2160(local159[local167 - 1][local197], local248, (byte) -1, (short) -1, (byte) 1, local293, local159[local167 - 1][(local197 + 1) % local92], local159[local167][(local197 + 1) % local92]);
						local148.method2160(local159[local167 - 1][local197], local248, (byte) -1, (short) -1, (byte) 1, local293, local159[local167][(local197 + 1) % local92], local159[local167][local197]);
					}
				}
			}
			local57 = arg13.method7192(local148, local11, Static374.anInt6710, 64, 768);
			@Pc(413) Class277 local413 = Static332.aClass277_47;
			synchronized (Static332.aClass277_47) {
				Static332.aClass277_47.method7016(local57, local47);
			}
		}
		@Pc(432) int local432 = (arg9 << 6) - 1;
		@Pc(435) int local435 = -local432;
		@Pc(438) int local438 = -local432;
		@Pc(440) int local440 = local432;
		local155 = local432;
		if (arg1 != 0) {
			if ((arg1 & 0x1) != 0) {
				local155 = local432 + 128;
			}
			if ((arg1 & 0x4) != 0) {
				local440 = local432 + 128;
			}
			if ((arg1 & 0x8) != 0) {
				local435 -= 128;
			}
			if ((arg1 & 0x2) != 0) {
				local438 -= 128;
			}
		}
		@Pc(470) int local470 = arg8.wa();
		local161 = arg8.va();
		local167 = arg8.Q();
		if (local438 > local167) {
			local167 = local438;
		}
		if (local161 > local440) {
			local161 = local440;
		}
		if (local470 < local435) {
			local470 = local435;
		}
		local171 = arg8.U();
		if (local155 < local171) {
			local171 = local155;
		}
		@Pc(537) Class1_Sub2_Sub17 local537 = null;
		if (arg3 != null) {
			@Pc(544) int local544 = arg3.anIntArray432[arg0];
			local537 = Static35.aClass152_1.method4041(local544 >> 16);
			arg0 = local544 & 0xFFFF;
		}
		if (local537 == null) {
			local57 = local57.method6770((byte) 3, local11, true);
			local57.V(local161 - local470 >> 1, 128, local171 - local167 >> 1);
			local57.ca(local470 + local161 >> 1, 0, local167 + local171 >> 1);
		} else {
			local57 = local57.method6770((byte) 3, local11, true);
			local57.V(local161 - local470 >> 1, 128, local171 - local167 >> 1);
			local57.ca(local470 + local161 >> 1, 0, local167 + local171 >> 1);
			local57.method6780(arg0, local537);
		}
		if (arg10 != 0) {
			local57.D(arg10);
		}
		if (arg5 != 0) {
			local57.b(arg5);
		}
		if (arg6 != 0) {
			local57.ca(0, arg6, 0);
		}
		return local57;
	}
}
