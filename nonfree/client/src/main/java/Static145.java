import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "Lclient!ta;")
	public static Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!jn", name = "s", descriptor = "[I")
	public static int[] anIntArray271;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString29 = "";

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Z")
	public static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "Z")
	public static volatile boolean aBoolean304 = true;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BILclient!oo;ZZILclient!oo;)I")
	public static int method2881(@OriginalArg(1) int arg0, @OriginalArg(2) Class104_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class104_Sub1 arg5) {
		@Pc(10) int local10 = Static59.method1510(arg3, arg0, arg5, arg1);
		if (local10 != 0) {
			return arg3 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(34) int local34 = Static59.method1510(arg2, arg4, arg5, arg1);
			return arg2 ? -local34 : local34;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!bo;IIIIIZLclient!uo;IIIIILclient!ge;I)Lclient!ge;")
	public static Class73 method2882(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class32 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class73 arg12, @OriginalArg(14) int arg13) {
		if (arg12 == null) {
			return null;
		}
		@Pc(23) int local23 = 1031;
		if (arg0 != null) {
			local23 = arg0.method770(arg9, false, -1) | 0x407;
			local23 &= 0xFFFFFDFF;
		}
		@Pc(59) long local59 = ((long) arg2 << 32) + (long) ((arg13 << 24) + arg1 + (arg3 << 16)) + ((long) arg8 << 48);
		@Pc(61) Class87 local61 = Static115.aClass87_23;
		@Pc(69) Class73 local69;
		synchronized (Static115.aClass87_23) {
			local69 = (Class73) Static115.aClass87_23.method2482(local59);
		}
		@Pc(168) int local168;
		@Pc(174) int local174;
		@Pc(180) int local180;
		@Pc(184) int local184;
		if (local69 == null || arg6.method2173(local69.method3298(), local23) != 0) {
			if (local69 != null) {
				local23 = arg6.method2159(local23, local69.method3298());
			}
			@Pc(98) byte local98;
			if (arg1 == 1) {
				local98 = 9;
			} else if (arg1 == 2) {
				local98 = 12;
			} else if (arg1 == 3) {
				local98 = 15;
			} else if (arg1 == 4) {
				local98 = 18;
			} else {
				local98 = 21;
			}
			@Pc(142) int[] local142 = new int[] { 64, 96, 128 };
			@Pc(161) Class82 local161 = new Class82(local98 * 3 + 1, local98 * 3 * 2 + -local98, 0);
			local168 = local161.method2360(0, 0, 0);
			@Pc(172) int[][] local172 = new int[3][local98];
			@Pc(186) int local186;
			@Pc(210) int local210;
			for (local174 = 0; local174 < 3; local174++) {
				local180 = local142[local174];
				local184 = local142[local174];
				for (local186 = 0; local186 < local98; local186++) {
					@Pc(194) int local194 = (local186 << 14) / local98;
					@Pc(202) int local202 = Class1_Sub3_Sub8.anIntArray159[local194] * local180 >> 15;
					local210 = Class1_Sub3_Sub8.anIntArray156[local194] * local184 >> 15;
					local172[local174][local186] = local161.method2360(local210, local202, 0);
				}
			}
			for (local180 = 0; local180 < 3; local180++) {
				local184 = (local180 * 256 + 128) / 3;
				local186 = 256 - local184;
				@Pc(265) byte local265 = (byte) (local186 * arg3 + arg13 * local184 >> 8);
				@Pc(310) short local310 = (short) (((arg8 & 0x7F) * local184 + local186 * (arg2 & 0x7F) & 0x7F00) + (local184 * (arg8 & 0x380) + (arg2 & 0x380) * local186 & 0x38000) + ((arg8 & 0xFC00) * local184 + (arg2 & 0xFC00) * local186 & 0xFC0000) >> 8);
				for (local210 = 0; local210 < local98; local210++) {
					if (local180 == 0) {
						local161.method2358(local265, (byte) 1, local168, (byte) -1, (short) -1, local172[0][local210], local310, local172[0][(local210 + 1) % local98]);
					} else {
						local161.method2358(local265, (byte) 1, local172[local180 - 1][local210], (byte) -1, (short) -1, local172[local180][(local210 + 1) % local98], local310, local172[local180 - 1][(local210 + 1) % local98]);
						local161.method2358(local265, (byte) 1, local172[local180 - 1][local210], (byte) -1, (short) -1, local172[local180][local210], local310, local172[local180][(local210 + 1) % local98]);
					}
				}
			}
			local69 = arg6.method2153(local161, local23, Static99.anInt2382, 64, 768);
			@Pc(431) Class87 local431 = Static115.aClass87_23;
			synchronized (Static115.aClass87_23) {
				Static115.aClass87_23.method2481(local69, local59);
			}
		}
		@Pc(450) int local450 = arg1 * 64 - 1;
		@Pc(453) int local453 = -local450;
		@Pc(456) int local456 = -local450;
		@Pc(458) int local458 = local450;
		local168 = local450;
		if (arg5) {
			if (arg7 > 9216 && arg7 < 15360) {
				local458 = local450 + 128;
			}
			if (arg7 > 5120 && arg7 < 11264) {
				local168 = local450 + 128;
			}
			if (arg7 > 1024 && arg7 < 7168) {
				local453 -= 128;
			}
			if (arg7 > 13312 || arg7 < 3072) {
				local456 -= 128;
			}
		}
		@Pc(497) int local497 = arg12.method3323();
		local174 = arg12.method3291();
		local180 = arg12.method3328();
		if (local453 > local497) {
			local497 = local453;
		}
		if (local458 < local174) {
			local174 = local458;
		}
		local184 = arg12.method3295();
		if (local180 < local456) {
			local180 = local456;
		}
		if (local184 > local168) {
			local184 = local168;
		}
		@Pc(532) Class1_Sub4_Sub19 local532 = null;
		if (arg0 != null) {
			@Pc(539) int local539 = arg0.anIntArray90[arg9];
			local532 = Static115.method2445(local539 >> 16);
			arg9 = local539 & 0xFFFF;
		}
		if (local532 == null) {
			local69 = local69.method3306((byte) 3, local23, true);
			local69.method3290((local174 - local497) / 2, 128, (local184 - local180) / 2);
			local69.method3293((local497 + local174) / 2, 0, (local184 + local180) / 2);
		} else {
			local69 = local69.method3306((byte) 3, local23, true);
			local69.method3290((local174 - local497) / 2, 128, (local184 - local180) / 2);
			local69.method3293((local174 + local497) / 2, 0, (local184 + local180) / 2);
			local69.method3316(local532, arg9);
		}
		if (arg11 != 0) {
			local69.method3284(arg11);
		}
		if (arg4 != 0) {
			local69.method3324(arg4);
		}
		if (arg10 != 0) {
			local69.method3293(0, arg10, 0);
		}
		return local69;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!aq;)Z")
	public static boolean method2885(@OriginalArg(1) Class12 arg0) {
		if (arg0.anInt435 == 205) {
			Static111.anInt2599 = 250;
			return true;
		} else {
			return false;
		}
	}
}
