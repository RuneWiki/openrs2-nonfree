import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
	public static int anInt709;

	@OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
	public static int anInt710;

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "Lclient!jm;")
	public static Class103 aClass103_21 = new Class103();

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_13 = new Class109(64);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!ts;Lclient!i;ZZIIILclient!ea;IIIII)Lclient!ts;")
	public static Class112 method627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class89 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class55 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg2 == null) {
			return null;
		}
		@Pc(9) int local9 = 1031;
		if (arg3 != null) {
			local9 = arg3.method2269(arg7, false, -1) | 0x407;
			local9 &= 0xFFFFFDFF;
		}
		@Pc(46) long local46 = ((long) arg10 << 32) + ((long) ((arg13 << 24) + (arg11 << 16) + arg1) + ((long) arg9 << 48));
		@Pc(48) Class109 local48 = Static39.aClass109_12;
		@Pc(56) Class112 local56;
		synchronized (Static39.aClass109_12) {
			local56 = (Class112) Static39.aClass109_12.method2857(local46);
		}
		@Pc(149) int local149;
		@Pc(155) int local155;
		@Pc(160) int local160;
		@Pc(164) int local164;
		if (local56 == null || arg8.method5181(local56.method4308(), local9) != 0) {
			if (local56 != null) {
				local9 = arg8.method5165(local9, local56.method4308());
			}
			@Pc(93) byte local93;
			if (arg1 == 1) {
				local93 = 9;
			} else if (arg1 == 2) {
				local93 = 12;
			} else if (arg1 == 3) {
				local93 = 15;
			} else if (arg1 == 4) {
				local93 = 18;
			} else {
				local93 = 21;
			}
			@Pc(125) int[] local125 = new int[] { 64, 96, 128 };
			@Pc(142) Class177 local142 = new Class177(local93 * 3 + 1, local93 * 6 - local93, 0);
			local149 = local142.method4849(0, 0, 0);
			@Pc(153) int[][] local153 = new int[3][local93];
			@Pc(166) int local166;
			@Pc(189) int local189;
			for (local155 = 0; local155 < 3; local155++) {
				local160 = local125[local155];
				local164 = local125[local155];
				for (local166 = 0; local166 < local93; local166++) {
					@Pc(173) int local173 = (local166 << 14) / local93;
					@Pc(181) int local181 = local160 * Class187.anIntArray571[local173] >> 15;
					local189 = Class187.anIntArray570[local173] * local164 >> 15;
					local153[local155][local166] = local142.method4849(0, local189, local181);
				}
			}
			for (local160 = 0; local160 < 3; local160++) {
				local164 = (local160 * 256 + 128) / 3;
				local166 = 256 - local164;
				@Pc(239) byte local239 = (byte) (local164 * arg13 + local166 * arg11 >> 8);
				@Pc(284) short local284 = (short) (((arg10 & 0x380) * local166 + local164 * (arg9 & 0x380) & 0x38000) + ((arg10 & 0xFC00) * local166 + (arg9 & 0xFC00) * local164 & 0xFC0000) + ((arg10 & 0x7F) * local166 + local164 * (arg9 & 0x7F) & 0x7F00) >> 8);
				for (local189 = 0; local189 < local93; local189++) {
					if (local160 == 0) {
						local142.method4853(local153[0][local189], (byte) -1, local149, local239, (byte) 1, (short) -1, local153[0][(local189 + 1) % local93], local284);
					} else {
						local142.method4853(local153[local160][(local189 + 1) % local93], (byte) -1, local153[local160 - 1][local189], local239, (byte) 1, (short) -1, local153[local160 - 1][(local189 + 1) % local93], local284);
						local142.method4853(local153[local160][local189], (byte) -1, local153[local160 - 1][local189], local239, (byte) 1, (short) -1, local153[local160][(local189 + 1) % local93], local284);
					}
				}
			}
			local56 = arg8.method5201(local142, local9, Static49.anInt4962, 64, 768);
			@Pc(405) Class109 local405 = Static39.aClass109_12;
			synchronized (Static39.aClass109_12) {
				Static39.aClass109_12.method2855(local46, local56);
			}
		}
		@Pc(424) int local424 = arg1 * 64 - 1;
		@Pc(427) int local427 = -local424;
		@Pc(430) int local430 = -local424;
		@Pc(432) int local432 = local424;
		local149 = local424;
		if (arg4) {
			if (arg0 > 1024 && arg0 < 7168) {
				local427 -= 128;
			}
			if (arg0 > 5120 && arg0 < 11264) {
				local149 = local424 + 128;
			}
			if (arg0 > 9216 && arg0 < 15360) {
				local432 = local424 + 128;
			}
			if (arg0 > 13312 || arg0 < 3072) {
				local430 -= 128;
			}
		}
		@Pc(471) int local471 = arg2.method4310();
		local155 = arg2.method4326();
		local160 = arg2.method4305();
		if (local160 < local430) {
			local160 = local430;
		}
		if (local155 > local432) {
			local155 = local432;
		}
		local164 = arg2.method4341();
		if (local427 > local471) {
			local471 = local427;
		}
		if (local164 > local149) {
			local164 = local149;
		}
		@Pc(515) Class5_Sub1_Sub9 local515 = null;
		if (arg3 != null) {
			@Pc(522) int local522 = arg3.anIntArray245[arg7];
			local515 = Static207.method3801(local522 >> 16);
			arg7 = local522 & 0xFFFF;
		}
		if (local515 == null) {
			local56 = local56.method4349((byte) 3, local9, true);
			local56.method4332((local155 - local471) / 2, 128, (local164 - local160) / 2);
			local56.method4324((local155 + local471) / 2, 0, (local164 + local160) / 2);
		} else {
			local56 = local56.method4349((byte) 3, local9, true);
			local56.method4332((local155 - local471) / 2, 128, (local164 - local160) / 2);
			local56.method4324((local471 + local155) / 2, 0, (local160 + local164) / 2);
			local56.method4318(arg7, local515);
		}
		if (arg12 != 0) {
			local56.method4352(arg12);
		}
		if (arg5 != 0) {
			local56.method4315(arg5);
		}
		if (arg6 != 0) {
			local56.method4324(0, arg6, 0);
		}
		return local56;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(II)V")
	public static void method629(@OriginalArg(1) int arg0) {
		if (Static92.method1683(arg0)) {
			Static190.method428(-1, Static304.aClass201ArrayArray1[arg0]);
		}
	}
}
