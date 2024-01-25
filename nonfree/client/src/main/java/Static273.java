import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "Lclient!wb;")
	public static Class243 aClass243_20 = new Class243(8);

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	public static int anInt5127 = 0;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "[I")
	public static final int[] anIntArray444 = new int[4];

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	public static int anInt5130 = 0;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)I")
	public static int method4583(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	public static void method4587() {
		if (Static56.aBoolean384) {
			Static200.aClass27_13 = null;
			Static56.aBoolean384 = false;
			Static75.aClass27_8 = null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)V")
	public static void method4589(@OriginalArg(0) int arg0) {
		if (Static226.anIntArray378 == null || arg0 > Static226.anIntArray378.length) {
			Static226.anIntArray378 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!qh;IILclient!oj;ILclient!hu;IIIIIZIII)Lclient!qh;")
	public static Class159 method4590(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class48 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class102 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 1031;
		if (arg5 != null) {
			local11 = arg5.method2409(false, arg13, -1) | 0x407;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg7 << 32) + (long) ((arg6 << 24) + arg9 + (arg4 << 16)) + ((long) arg12 << 48);
		@Pc(49) Class41 local49 = Static281.aClass41_61;
		@Pc(57) Class159 local57;
		synchronized (Static281.aClass41_61) {
			local57 = (Class159) Static281.aClass41_61.method823(local47);
		}
		@Pc(151) int local151;
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(167) int local167;
		if (local57 == null || arg3.method2448(local57.method4951(), local11) != 0) {
			if (local57 != null) {
				local11 = arg3.method2451(local11, local57.method4951());
			}
			@Pc(84) byte local84;
			if (arg9 == 1) {
				local84 = 9;
			} else if (arg9 == 2) {
				local84 = 12;
			} else if (arg9 == 3) {
				local84 = 15;
			} else if (arg9 == 4) {
				local84 = 18;
			} else {
				local84 = 21;
			}
			@Pc(126) int[] local126 = new int[] { 64, 96, 128 };
			@Pc(144) Class130 local144 = new Class130(local84 * 3 + 1, -local84 + local84 * 3 * 2, 0);
			local151 = local144.method3410(0, 0, 0);
			@Pc(155) int[][] local155 = new int[3][local84];
			@Pc(169) int local169;
			@Pc(193) int local193;
			for (local157 = 0; local157 < 3; local157++) {
				local163 = local126[local157];
				local167 = local126[local157];
				for (local169 = 0; local169 < local84; local169++) {
					@Pc(177) int local177 = (local169 << 14) / local84;
					@Pc(185) int local185 = Class106.anIntArray240[local177] * local163 >> 15;
					local193 = Class106.anIntArray242[local177] * local167 >> 15;
					local155[local157][local169] = local144.method3410(local185, 0, local193);
				}
			}
			for (local163 = 0; local163 < 3; local163++) {
				local167 = (local163 * 256 + 128) / 3;
				local169 = 256 - local167;
				@Pc(244) byte local244 = (byte) (arg4 * local169 + arg6 * local167 >> 8);
				@Pc(289) short local289 = (short) (((arg7 & 0x7F) * local169 + (arg12 & 0x7F) * local167 & 0x7F00) + (local167 * (arg12 & 0x380) + (arg7 & 0x380) * local169 & 0x38000) + ((arg7 & 0xFC00) * local169 + (arg12 & 0xFC00) * local167 & 0xFC0000) >> 8);
				for (local193 = 0; local193 < local84; local193++) {
					if (local163 == 0) {
						local144.method3408((byte) -1, local151, local244, (short) -1, local155[0][(local193 + 1) % local84], local155[0][local193], local289, (byte) 1);
					} else {
						local144.method3408((byte) -1, local155[local163 - 1][local193], local244, (short) -1, local155[local163 - 1][(local193 + 1) % local84], local155[local163][(local193 + 1) % local84], local289, (byte) 1);
						local144.method3408((byte) -1, local155[local163 - 1][local193], local244, (short) -1, local155[local163][(local193 + 1) % local84], local155[local163][local193], local289, (byte) 1);
					}
				}
			}
			local57 = arg3.method2540(local144, local11, Static110.anInt2471, 64, 768);
			@Pc(413) Class41 local413 = Static281.aClass41_61;
			synchronized (Static281.aClass41_61) {
				Static281.aClass41_61.method832(local47, local57);
			}
		}
		@Pc(432) int local432 = arg9 * 64 - 1;
		@Pc(435) int local435 = -local432;
		@Pc(438) int local438 = -local432;
		@Pc(445) int local445 = local432;
		local151 = local432;
		if (arg11) {
			if (arg10 > 9216 && arg10 < 15360) {
				local445 = local432 + 128;
			}
			if (arg10 > 1024 && arg10 < 7168) {
				local435 -= 128;
			}
			if (arg10 > 5120 && arg10 < 11264) {
				local151 = local432 + 128;
			}
			if (arg10 > 13312 || arg10 < 3072) {
				local438 -= 128;
			}
		}
		@Pc(486) int local486 = arg0.method4934();
		local157 = arg0.method4963();
		local163 = arg0.method4935();
		if (local157 > local445) {
			local157 = local445;
		}
		if (local438 > local163) {
			local163 = local438;
		}
		local167 = arg0.method4959();
		if (local486 < local435) {
			local486 = local435;
		}
		if (local167 > local151) {
			local167 = local151;
		}
		@Pc(525) Class2_Sub7_Sub10 local525 = null;
		if (arg5 != null) {
			@Pc(532) int local532 = arg5.anIntArray231[arg13];
			local525 = Static333.aClass50_2.method1173(local532 >> 16);
			arg13 = local532 & 0xFFFF;
		}
		if (local525 == null) {
			local57 = local57.method4927((byte) 3, local11, true);
			local57.method4947((local157 - local486) / 2, 128, (local167 - local163) / 2);
			local57.method4945((local486 + local157) / 2, 0, (local167 + local163) / 2);
		} else {
			local57 = local57.method4927((byte) 3, local11, true);
			local57.method4947((local157 - local486) / 2, 128, (local167 - local163) / 2);
			local57.method4945((local486 + local157) / 2, 0, (local167 + local163) / 2);
			local57.method4972(local525, arg13);
		}
		if (arg2 != 0) {
			local57.method4954(arg2);
		}
		if (arg1 != 0) {
			local57.method4968(arg1);
		}
		if (arg8 != 0) {
			local57.method4945(0, arg8, 0);
		}
		return local57;
	}
}
