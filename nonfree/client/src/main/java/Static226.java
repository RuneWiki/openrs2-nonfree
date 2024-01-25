import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!jda", name = "A", descriptor = "I")
	public static int anInt4840;

	@OriginalMember(owner = "client!jda", name = "C", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_71 = new Class45(75, 10);

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(III)Z")
	public static boolean method4097(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static437.method6659(arg0, arg1) || Static203.method3818(arg1, arg0);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIBILclient!r;IIIILclient!qa;IIILclient!dba;I)Lclient!r;")
	public static Class26 method4098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class42 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class64 arg12, @OriginalArg(14) int arg13) {
		if (arg3 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method1829(-1, false, arg2) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(51) long local51 = (long) ((arg0 << 24) + (arg11 + (arg6 << 16))) + ((long) arg13 << 32) + ((long) arg1 << 48);
		@Pc(53) Class125 local53 = Static218.aClass125_30;
		@Pc(61) Class26 local61;
		synchronized (Static218.aClass125_30) {
			local61 = (Class26) Static218.aClass125_30.method3446(local51);
		}
		@Pc(159) int local159;
		@Pc(165) int local165;
		@Pc(171) int local171;
		@Pc(175) int local175;
		if (local61 == null || arg8.method5857(local61.ba(), local11) != 0) {
			if (local61 != null) {
				local11 = arg8.method5820(local11, local61.ba());
			}
			@Pc(96) byte local96;
			if (arg11 == 1) {
				local96 = 9;
			} else if (arg11 == 2) {
				local96 = 12;
			} else if (arg11 == 3) {
				local96 = 15;
			} else if (arg11 == 4) {
				local96 = 18;
			} else {
				local96 = 21;
			}
			@Pc(135) int[] local135 = new int[] { 64, 96, 128 };
			@Pc(152) Class192 local152 = new Class192(local96 * 3 + 1, local96 * 6 - local96, 0);
			local159 = local152.method4666(0, 0, 0);
			@Pc(163) int[][] local163 = new int[3][local96];
			@Pc(177) int local177;
			@Pc(201) int local201;
			for (local165 = 0; local165 < 3; local165++) {
				local171 = local135[local165];
				local175 = local135[local165];
				for (local177 = 0; local177 < local96; local177++) {
					@Pc(185) int local185 = (local177 << 14) / local96;
					@Pc(193) int local193 = local171 * Class12_Sub1_Sub36.anIntArray667[local185] >> 15;
					local201 = local175 * Class12_Sub1_Sub36.anIntArray668[local185] >> 15;
					local163[local165][local177] = local152.method4666(local193, local201, 0);
				}
			}
			for (local171 = 0; local171 < 3; local171++) {
				local175 = (local171 * 256 + 128) / 3;
				local177 = 256 - local175;
				@Pc(252) byte local252 = (byte) (local175 * arg0 + arg6 * local177 >> 8);
				@Pc(297) short local297 = (short) ((local175 * (arg1 & 0x380) + local177 * (arg13 & 0x380) & 0x38000) + (local175 * (arg1 & 0xFC00) + (arg13 & 0xFC00) * local177 & 0xFC0000) + (local175 * (arg1 & 0x7F) + (arg13 & 0x7F) * local177 & 0x7F00) >> 8);
				for (local201 = 0; local201 < local96; local201++) {
					if (local171 == 0) {
						local152.method4660(local163[0][local201], local252, (short) -1, local297, (byte) 1, local159, local163[0][(local201 + 1) % local96], (byte) -1);
					} else {
						local152.method4660(local163[local171][(local201 + 1) % local96], local252, (short) -1, local297, (byte) 1, local163[local171 - 1][local201], local163[local171 - 1][(local201 + 1) % local96], (byte) -1);
						local152.method4660(local163[local171][local201], local252, (short) -1, local297, (byte) 1, local163[local171 - 1][local201], local163[local171][(local201 + 1) % local96], (byte) -1);
					}
				}
			}
			local61 = arg8.method5812(local152, local11, Static174.anInt3956, 64, 768);
			@Pc(419) Class125 local419 = Static218.aClass125_30;
			synchronized (Static218.aClass125_30) {
				Static218.aClass125_30.method3437(local61, local51);
			}
		}
		@Pc(440) int local440 = (arg11 << 6) - 1;
		@Pc(443) int local443 = -local440;
		@Pc(446) int local446 = -local440;
		@Pc(448) int local448 = local440;
		local159 = local440;
		if (arg5 != 0) {
			if ((arg5 & 0x2) != 0) {
				local446 -= 128;
			}
			if ((arg5 & 0x4) != 0) {
				local448 = local440 + 128;
			}
			if ((arg5 & 0x1) != 0) {
				local159 = local440 + 128;
			}
			if ((arg5 & 0x8) != 0) {
				local443 -= 128;
			}
		}
		@Pc(487) int local487 = arg3.wa();
		local165 = arg3.va();
		local171 = arg3.Q();
		local175 = arg3.U();
		if (local171 < local446) {
			local171 = local446;
		}
		if (local165 > local448) {
			local165 = local448;
		}
		if (local487 < local443) {
			local487 = local443;
		}
		if (local159 < local175) {
			local175 = local159;
		}
		@Pc(527) Class12_Sub4_Sub13 local527 = null;
		if (arg12 != null) {
			@Pc(534) int local534 = arg12.anIntArray185[arg2];
			local527 = Static47.aClass41_1.method910(local534 >> 16);
			arg2 = local534 & 0xFFFF;
		}
		if (local527 == null) {
			local61 = local61.method7992((byte) 3, local11, true);
			local61.V(local165 - local487 >> 1, 128, local175 - local171 >> 1);
			local61.ca(local487 + local165 >> 1, 0, local175 + local171 >> 1);
		} else {
			local61 = local61.method7992((byte) 3, local11, true);
			local61.V(local165 - local487 >> 1, 128, local175 - local171 >> 1);
			local61.ca(local487 + local165 >> 1, 0, local175 + local171 >> 1);
			local61.method8009(arg2, local527);
		}
		if (arg7 != 0) {
			local61.D(arg7);
		}
		if (arg9 != 0) {
			local61.b(arg9);
		}
		if (arg10 != 0) {
			local61.ca(0, arg10, 0);
		}
		return local61;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIII)V")
	public static void method4099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class240 local9 = Static544.aClass240ArrayArray1[arg1][arg2];
		Static104.method2136(arg0, local9 == null ? Static283.aClass240_9 : local9);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BII)Z")
	public static boolean method4100(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static125.method2670(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static231.method4128(arg0, arg1) | Static486.method7266(arg0, arg1) ? true : (Static133.method2769(arg1, arg0) | Static435.method6630(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
