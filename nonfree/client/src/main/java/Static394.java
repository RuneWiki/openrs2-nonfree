import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "I")
	public static int anInt6532;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Lclient!ke;")
	public static final Class137 aClass137_34 = new Class137(16);

	@OriginalMember(owner = "client!u", name = "n", descriptor = "[I")
	public static final int[] anIntArray569 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILclient!fn;IIIIIIIZLclient!cd;BLclient!qq;)Lclient!cd;")
	public static Class39 method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) Class39 arg12, @OriginalArg(14) Class28 arg13) {
		if (arg12 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg3 != null) {
			local11 = arg3.method1831(-1, arg6, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = (long) ((arg10 << 16) + arg5 + (arg2 << 24)) + ((long) arg4 << 32) + ((long) arg0 << 48);
		@Pc(49) Class220 local49 = Static131.aClass220_15;
		@Pc(57) Class39 local57;
		synchronized (Static131.aClass220_15) {
			local57 = (Class39) Static131.aClass220_15.method4990(local47);
		}
		@Pc(151) int local151;
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(167) int local167;
		if (local57 == null || arg13.method3532(local57.method4900(), local11) != 0) {
			if (local57 != null) {
				local11 = arg13.method3539(local11, local57.method4900());
			}
			@Pc(89) byte local89;
			if (arg5 == 1) {
				local89 = 9;
			} else if (arg5 == 2) {
				local89 = 12;
			} else if (arg5 == 3) {
				local89 = 15;
			} else if (arg5 == 4) {
				local89 = 18;
			} else {
				local89 = 21;
			}
			@Pc(126) int[] local126 = new int[] { 64, 96, 128 };
			@Pc(144) Class266 local144 = new Class266(local89 * 3 + 1, -local89 + local89 * 3 * 2, 0);
			local151 = local144.method5965(0, 0, 0);
			@Pc(155) int[][] local155 = new int[3][local89];
			@Pc(169) int local169;
			@Pc(193) int local193;
			for (local157 = 0; local157 < 3; local157++) {
				local163 = local126[local157];
				local167 = local126[local157];
				for (local169 = 0; local169 < local89; local169++) {
					@Pc(177) int local177 = (local169 << 14) / local89;
					@Pc(185) int local185 = local163 * Class6_Sub1_Sub18.anIntArray642[local177] >> 15;
					local193 = Class6_Sub1_Sub18.anIntArray643[local177] * local167 >> 15;
					local155[local157][local169] = local144.method5965(0, local193, local185);
				}
			}
			for (local163 = 0; local163 < 3; local163++) {
				local167 = (local163 * 256 + 128) / 3;
				local169 = 256 - local167;
				@Pc(244) byte local244 = (byte) (arg10 * local169 + local167 * arg2 >> 8);
				@Pc(289) short local289 = (short) (((arg4 & 0x380) * local169 + local167 * (arg0 & 0x380) & 0x38000) + (local167 * (arg0 & 0xFC00) + (arg4 & 0xFC00) * local169 & 0xFC0000) + ((arg0 & 0x7F) * local167 + (arg4 & 0x7F) * local169 & 0x7F00) >> 8);
				for (local193 = 0; local193 < local89; local193++) {
					if (local163 == 0) {
						local144.method5966(local289, local244, local155[0][(local193 + 1) % local89], local155[0][local193], local151, (byte) 1, (byte) -1, (short) -1);
					} else {
						local144.method5966(local289, local244, local155[local163 - 1][(local193 + 1) % local89], local155[local163][(local193 + 1) % local89], local155[local163 - 1][local193], (byte) 1, (byte) -1, (short) -1);
						local144.method5966(local289, local244, local155[local163][(local193 + 1) % local89], local155[local163][local193], local155[local163 - 1][local193], (byte) 1, (byte) -1, (short) -1);
					}
				}
			}
			local57 = arg13.method3496(local144, local11, Static306.anInt3568, 64, 768);
			@Pc(405) Class220 local405 = Static131.aClass220_15;
			synchronized (Static131.aClass220_15) {
				Static131.aClass220_15.method4996(local57, local47);
			}
		}
		@Pc(424) int local424 = (arg5 << 6) - 1;
		@Pc(427) int local427 = -local424;
		@Pc(430) int local430 = -local424;
		@Pc(432) int local432 = local424;
		local151 = local424;
		if (arg11) {
			if (arg7 > 5120 && arg7 < 11264) {
				local151 = local424 + 128;
			}
			if (arg7 > 9216 && arg7 < 15360) {
				local432 = local424 + 128;
			}
			if (arg7 > 13312 || arg7 < 3072) {
				local430 -= 128;
			}
			if (arg7 > 1024 && arg7 < 7168) {
				local427 -= 128;
			}
		}
		@Pc(477) int local477 = arg12.method4877();
		local157 = arg12.method4890();
		local163 = arg12.method4894();
		if (local477 < local427) {
			local477 = local427;
		}
		if (local432 < local157) {
			local157 = local432;
		}
		if (local430 > local163) {
			local163 = local430;
		}
		local167 = arg12.method4867();
		if (local151 < local167) {
			local167 = local151;
		}
		@Pc(525) Class6_Sub1_Sub5 local525 = null;
		if (arg3 != null) {
			@Pc(532) int local532 = arg3.anIntArray211[arg6];
			local525 = Static244.aClass174_2.method4013(local532 >> 16);
			arg6 = local532 & 0xFFFF;
		}
		if (local525 == null) {
			local57 = local57.method4863((byte) 3, local11, true);
			local57.method4870(local157 - local477 >> 1, 128, local167 - local163 >> 1);
			local57.method4874(local477 + local157 >> 1, 0, local167 + local163 >> 1);
		} else {
			local57 = local57.method4863((byte) 3, local11, true);
			local57.method4870(local157 - local477 >> 1, 128, local167 - local163 >> 1);
			local57.method4874(local157 + local477 >> 1, 0, local167 + local163 >> 1);
			local57.method4898(local525, arg6);
		}
		if (arg9 != 0) {
			local57.method4883(arg9);
		}
		if (arg8 != 0) {
			local57.method4886(arg8);
		}
		if (arg1 != 0) {
			local57.method4874(0, arg1, 0);
		}
		return local57;
	}
}
