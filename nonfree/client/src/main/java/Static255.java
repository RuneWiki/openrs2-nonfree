import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	public static int anInt4963;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
	public static int anInt4966;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "Lclient!bs;")
	public static final Class37 aClass37_2 = new Class37("stellardawn", 1);

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "[I")
	public static final int[] anIntArray378 = new int[14];

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[6][];

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "[I")
	public static final int[] anIntArray379 = new int[1];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIIIIILclient!oa;ILclient!ba;IIIIILclient!cu;)Lclient!ba;")
	public static Class20 method4297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class20 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class57 arg13) {
		if (arg7 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg13 != null) {
			local11 = arg13.method1448(-1, false, arg9) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = (long) ((arg2 << 24) + (arg12 << 16) + arg0) + ((long) arg1 << 32) + ((long) arg3 << 48);
		@Pc(49) Class136 local49 = Static579.aClass136_107;
		@Pc(57) Class20 local57;
		synchronized (Static579.aClass136_107) {
			local57 = (Class20) Static579.aClass136_107.method3473(local47);
		}
		@Pc(150) int local150;
		@Pc(156) int local156;
		@Pc(162) int local162;
		@Pc(166) int local166;
		if (local57 == null || arg5.method6884(local57.h(), local11) != 0) {
			if (local57 != null) {
				local11 = arg5.method6879(local11, local57.h());
			}
			@Pc(90) byte local90;
			if (arg0 == 1) {
				local90 = 9;
			} else if (arg0 == 2) {
				local90 = 12;
			} else if (arg0 == 3) {
				local90 = 15;
			} else if (arg0 == 4) {
				local90 = 18;
			} else {
				local90 = 21;
			}
			@Pc(125) int[] local125 = new int[] { 64, 96, 128 };
			@Pc(143) Class220 local143 = new Class220(local90 * 3 + 1, -local90 + local90 * 2 * 3, 0);
			local150 = local143.method5293(0, 0, 0);
			@Pc(154) int[][] local154 = new int[3][local90];
			@Pc(168) int local168;
			@Pc(192) int local192;
			for (local156 = 0; local156 < 3; local156++) {
				local162 = local125[local156];
				local166 = local125[local156];
				for (local168 = 0; local168 < local90; local168++) {
					@Pc(176) int local176 = (local168 << 14) / local90;
					@Pc(184) int local184 = local162 * Class6_Sub2_Sub7.anIntArray178[local176] >> 14;
					local192 = Class6_Sub2_Sub7.anIntArray177[local176] * local166 >> 14;
					local154[local156][local168] = local143.method5293(local184, 0, local192);
				}
			}
			for (local162 = 0; local162 < 3; local162++) {
				local166 = (local162 * 256 + 128) / 3;
				local168 = 256 - local166;
				@Pc(239) byte local239 = (byte) (local168 * arg12 + arg2 * local166 >> 8);
				@Pc(284) short local284 = (short) (((arg3 & 0x380) * local166 + local168 * (arg1 & 0x380) & 0x38000) + (local166 * (arg3 & 0xFC00) + local168 * (arg1 & 0xFC00) & 0xFC0000) + ((arg3 & 0x7F) * local166 + (arg1 & 0x7F) * local168 & 0x7F00) >> 8);
				for (local192 = 0; local192 < local90; local192++) {
					if (local162 == 0) {
						local143.method5306((byte) 1, (byte) -1, local154[0][(local192 + 1) % local90], local239, local150, (short) -1, local154[0][local192], local284);
					} else {
						local143.method5306((byte) 1, (byte) -1, local154[local162 - 1][(local192 + 1) % local90], local239, local154[local162 - 1][local192], (short) -1, local154[local162][(local192 + 1) % local90], local284);
						local143.method5306((byte) 1, (byte) -1, local154[local162][(local192 + 1) % local90], local239, local154[local162 - 1][local192], (short) -1, local154[local162][local192], local284);
					}
				}
			}
			local57 = arg5.method6833(local143, local11, Static88.anInt1744, 64, 768);
			@Pc(407) Class136 local407 = Static579.aClass136_107;
			synchronized (Static579.aClass136_107) {
				Static579.aClass136_107.method3482(local47, local57);
			}
		}
		@Pc(426) int local426 = (arg0 << 8) - 1;
		@Pc(429) int local429 = -local426;
		@Pc(432) int local432 = -local426;
		@Pc(434) int local434 = local426;
		local150 = local426;
		if (arg10 != 0) {
			if ((arg10 & 0x2) != 0) {
				local432 -= 512;
			}
			if ((arg10 & 0x8) != 0) {
				local429 -= 512;
			}
			if ((arg10 & 0x1) != 0) {
				local150 = local426 + 512;
			}
			if ((arg10 & 0x4) != 0) {
				local434 = local426 + 512;
			}
		}
		@Pc(467) int local467 = arg7.ha();
		local156 = arg7.M();
		local162 = arg7.LA();
		if (local162 < local432) {
			local162 = local432;
		}
		if (local434 < local156) {
			local156 = local434;
		}
		local166 = arg7.K();
		if (local429 > local467) {
			local467 = local429;
		}
		if (local166 > local150) {
			local166 = local150;
		}
		@Pc(511) Class6_Sub2_Sub19 local511 = null;
		if (arg13 != null) {
			@Pc(518) int local518 = arg13.anIntArray132[arg9];
			local511 = Static78.aClass298_2.method6517(local518 >> 16);
			arg9 = local518 & 0xFFFF;
		}
		if (local511 == null) {
			local57 = local57.method7264((byte) 3, local11, true);
			local57.l(local156 - local467 >> 1, 128, local166 - local162 >> 1);
			local57.m(local156 + local467 >> 1, 0, local162 + local166 >> 1);
		} else {
			local57 = local57.method7264((byte) 3, local11, true);
			local57.l(local156 - local467 >> 1, 128, local166 - local162 >> 1);
			local57.m(local467 + local156 >> 1, 0, local166 + local162 >> 1);
			local57.method7257(arg9, local511);
		}
		if (arg6 != 0) {
			local57.AA(arg6);
		}
		if (arg4 != 0) {
			local57.v(arg4);
		}
		if (arg8 != 0) {
			local57.m(0, arg8, 0);
		}
		return local57;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!nh;I)I")
	public static int method4299(@OriginalArg(0) Class219 arg0) {
		if (Static156.aClass219_11 == arg0) {
			return 6407;
		} else if (arg0 == Static122.aClass219_7) {
			return 6408;
		} else if (arg0 == Static145.aClass219_10) {
			return 6406;
		} else if (arg0 == Static544.aClass219_14) {
			return 6409;
		} else if (arg0 == Static132.aClass219_8) {
			return 6410;
		} else if (arg0 == Static34.aClass219_3) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
