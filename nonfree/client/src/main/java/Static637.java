import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "Lclient!paa;")
	public static Class261 aClass261_14 = null;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "Z")
	public static boolean aBoolean745 = false;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "[I")
	public static final int[] anIntArray694 = new int[5];

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIILclient!ha;IILclient!ka;IIILclient!ec;)Lclient!ka;")
	public static Class182 method8578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class95 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class182 arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class81 arg12) {
		if (arg9 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method1751(false, -1, arg11) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(53) long local53 = ((long) arg5 << 48) + ((long) arg8 << 32) + (long) ((arg3 << 24) + arg0 - -(arg10 << 16));
		@Pc(55) Class32 local55 = Static22.aClass32_6;
		@Pc(63) Class182 local63;
		synchronized (Static22.aClass32_6) {
			local63 = (Class182) Static22.aClass32_6.method630(local53);
		}
		if (local63 == null || arg6.method6963(local63.ua(), local11) != 0) {
			if (local63 != null) {
				local11 = arg6.method7005(local11, local63.ua());
			}
			@Pc(95) byte local95;
			if (arg0 == 1) {
				local95 = 9;
			} else if (arg0 == 2) {
				local95 = 12;
			} else if (arg0 == 3) {
				local95 = 15;
			} else if (arg0 == 4) {
				local95 = 18;
			} else {
				local95 = 21;
			}
			@Pc(130) int[] local130 = new int[] { 64, 96, 128 };
			@Pc(147) Class186 local147 = new Class186(local95 * 3 + 1, local95 * 2 * 3 - local95, 0);
			@Pc(154) int local154 = local147.method3995(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local95];
			@Pc(166) int local166;
			@Pc(170) int local170;
			@Pc(172) int local172;
			@Pc(196) int local196;
			for (@Pc(160) int local160 = 0; local160 < 3; local160++) {
				local166 = local130[local160];
				local170 = local130[local160];
				for (local172 = 0; local172 < local95; local172++) {
					@Pc(180) int local180 = (local172 << 14) / local95;
					@Pc(188) int local188 = Canvas_Sub1.anIntArray497[local180] * local166 >> 14;
					local196 = Canvas_Sub1.anIntArray498[local180] * local170 >> 14;
					local158[local160][local172] = local147.method3995(0, local196, local188);
				}
			}
			for (local166 = 0; local166 < 3; local166++) {
				local170 = (local166 * 256 + 128) / 3;
				local172 = 256 - local170;
				@Pc(251) byte local251 = (byte) (arg10 * local172 + local170 * arg3 >> 8);
				@Pc(296) short local296 = (short) ((local172 * (arg8 & 0x7F) + (arg5 & 0x7F) * local170 & 0x7F00) + (local170 * (arg5 & 0x380) + local172 * (arg8 & 0x380) & 0x38000) + ((arg5 & 0xFC00) * local170 + local172 * (arg8 & 0xFC00) & 0xFC0000) >> 8);
				for (local196 = 0; local196 < local95; local196++) {
					if (local166 == 0) {
						local147.method4001((short) -1, (byte) -1, local296, (byte) 1, local158[0][local196], local251, local154, local158[0][(local196 + 1) % local95]);
					} else {
						local147.method4001((short) -1, (byte) -1, local296, (byte) 1, local158[local166][(local196 + 1) % local95], local251, local158[local166 - 1][local196], local158[local166 - 1][(local196 + 1) % local95]);
						local147.method4001((short) -1, (byte) -1, local296, (byte) 1, local158[local166][local196], local251, local158[local166 - 1][local196], local158[local166][(local196 + 1) % local95]);
					}
				}
			}
			local63 = arg6.method6938(local147, local11, Static169.anInt3003, 64, 768);
			@Pc(415) Class32 local415 = Static22.aClass32_6;
			synchronized (Static22.aClass32_6) {
				Static22.aClass32_6.method629(local63, local53);
			}
		}
		@Pc(431) int local431 = arg9.V();
		@Pc(434) int local434 = arg9.RA();
		@Pc(437) int local437 = arg9.HA();
		@Pc(440) int local440 = arg9.G();
		@Pc(442) Class2_Sub2_Sub15 local442 = null;
		if (arg12 != null) {
			@Pc(449) int local449 = arg12.anIntArray149[arg11];
			local442 = Static540.aClass173_2.method3793(local449 >> 16);
			arg11 = local449 & 0xFFFF;
		}
		if (local442 == null) {
			local63 = local63.method6208((byte) 3, local11, true);
			local63.O(local434 - local431 >> 1, 128, local440 - local437 >> 1);
			local63.H(local431 + local434 >> 1, 0, local440 + local437 >> 1);
		} else {
			local63 = local63.method6208((byte) 3, local11, true);
			local63.O(local434 - local431 >> 1, 128, local440 - local437 >> 1);
			local63.H(local431 + local434 >> 1, 0, local437 + local440 >> 1);
			local63.method6198(local442, arg11);
		}
		if (arg4 != 0) {
			local63.FA(arg4);
		}
		if (arg1 != 0) {
			local63.VA(arg1);
		}
		if (arg7 != 0) {
			local63.H(0, arg7, 0);
		}
		return local63;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BZ)V")
	public static void method8580(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static38.anInt777 != -1) {
				Static555.method7632(Static38.anInt777);
			}
			for (@Pc(18) Class2_Sub9 local18 = (Class2_Sub9) Static606.aClass118_47.method2596(); local18 != null; local18 = (Class2_Sub9) Static606.aClass118_47.method2597()) {
				if (!local18.method8652()) {
					local18 = (Class2_Sub9) Static606.aClass118_47.method2596();
					if (local18 == null) {
						break;
					}
				}
				Static588.method8013(local18, false, true);
			}
			Static38.anInt777 = -1;
			Static606.aClass118_47 = new Class118(8);
			Static289.method4012();
			Static38.anInt777 = Static380.anInt5918;
			Static311.method4222(false);
			Static32.method574();
			Static300.method4134(Static38.anInt777);
		}
		Static427.aBoolean500 = true;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBII)V")
	public static void method8582(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static234.aClass2_Sub5_48.aClass6_Sub22_3.method7291() * arg2 >> 8;
		if (arg1 == -1 && !Static446.aBoolean675) {
			Static109.method1616();
		} else if (arg1 != -1 && (Static489.anInt1781 != arg1 || !Static334.method4507()) && local10 != 0 && !Static446.aBoolean675) {
			Static630.method8445(Static539.aClass380_121, arg0, local10, arg1);
			Static151.method2243();
		}
		if (Static489.anInt1781 != arg1) {
			Static78.aClass2_Sub13_Sub3_1 = null;
		}
		Static489.anInt1781 = arg1;
	}
}
