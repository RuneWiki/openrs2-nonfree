import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
	public static final int[] anIntArray109 = new int[1000];

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
	public static final int[] anIntArray110 = new int[1];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILclient!ba;IILclient!oa;IIIIIILclient!ct;I)Lclient!ba;")
	public static Class24 method963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class90 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class63 arg13) {
		if (arg3 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg13 != null) {
			local11 = arg13.method1147(false, arg4, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(50) long local50 = ((long) arg10 << 32) + (long) (arg9 + (arg0 << 16) + (arg12 << 24)) + ((long) arg1 << 48);
		@Pc(52) Class330 local52 = Static129.aClass330_17;
		@Pc(60) Class24 local60;
		synchronized (Static129.aClass330_17) {
			local60 = (Class24) Static129.aClass330_17.method7677(local50);
		}
		@Pc(161) int local161;
		@Pc(167) int local167;
		@Pc(173) int local173;
		@Pc(177) int local177;
		if (local60 == null || arg6.method7505(local60.h(), local11) != 0) {
			if (local60 != null) {
				local11 = arg6.method7461(local11, local60.h());
			}
			@Pc(90) byte local90;
			if (arg9 == 1) {
				local90 = 9;
			} else if (arg9 == 2) {
				local90 = 12;
			} else if (arg9 == 3) {
				local90 = 15;
			} else if (arg9 == 4) {
				local90 = 18;
			} else {
				local90 = 21;
			}
			@Pc(134) int[] local134 = new int[] { 64, 96, 128 };
			@Pc(152) Class134 local152 = new Class134(local90 * 3 + 1, -local90 + local90 * 2 * 3, 0);
			local161 = local152.method3341(0, 0, 0);
			@Pc(165) int[][] local165 = new int[3][local90];
			@Pc(179) int local179;
			@Pc(203) int local203;
			for (local167 = 0; local167 < 3; local167++) {
				local173 = local134[local167];
				local177 = local134[local167];
				for (local179 = 0; local179 < local90; local179++) {
					@Pc(187) int local187 = (local179 << 14) / local90;
					@Pc(195) int local195 = local173 * Class22.anIntArray20[local187] >> 14;
					local203 = Class22.anIntArray19[local187] * local177 >> 14;
					local165[local167][local179] = local152.method3341(local203, 0, local195);
				}
			}
			for (local173 = 0; local173 < 3; local173++) {
				local177 = (local173 * 256 + 128) / 3;
				local179 = 256 - local177;
				@Pc(254) byte local254 = (byte) (arg12 * local177 + arg0 * local179 >> 8);
				@Pc(299) short local299 = (short) ((local177 * (arg1 & 0x380) + (arg10 & 0x380) * local179 & 0x38000) + ((arg1 & 0xFC00) * local177 + (arg10 & 0xFC00) * local179 & 0xFC0000) + ((arg10 & 0x7F) * local179 + local177 * (arg1 & 0x7F) & 0x7F00) >> 8);
				for (local203 = 0; local203 < local90; local203++) {
					if (local173 == 0) {
						local152.method3353((byte) -1, local161, local299, local165[0][(local203 + 1) % local90], (short) -1, local165[0][local203], local254, (byte) 1);
					} else {
						local152.method3353((byte) -1, local165[local173 - 1][local203], local299, local165[local173 - 1][(local203 + 1) % local90], (short) -1, local165[local173][(local203 + 1) % local90], local254, (byte) 1);
						local152.method3353((byte) -1, local165[local173 - 1][local203], local299, local165[local173][(local203 + 1) % local90], (short) -1, local165[local173][local203], local254, (byte) 1);
					}
				}
			}
			local60 = arg6.method7464(local152, local11, Static560.anInt9760, 64, 768);
			@Pc(419) Class330 local419 = Static129.aClass330_17;
			synchronized (Static129.aClass330_17) {
				Static129.aClass330_17.method7676(local60, local50);
			}
		}
		@Pc(438) int local438 = (arg9 << 8) - 1;
		@Pc(441) int local441 = -local438;
		@Pc(444) int local444 = -local438;
		@Pc(451) int local451 = local438;
		local161 = local438;
		if (arg8 != 0) {
			if ((arg8 & 0x8) != 0) {
				local441 -= 512;
			}
			if ((arg8 & 0x1) != 0) {
				local161 = local438 + 512;
			}
			if ((arg8 & 0x4) != 0) {
				local451 = local438 + 512;
			}
			if ((arg8 & 0x2) != 0) {
				local444 -= 512;
			}
		}
		@Pc(490) int local490 = arg3.ha();
		local167 = arg3.M();
		local173 = arg3.LA();
		local177 = arg3.K();
		if (local173 < local444) {
			local173 = local444;
		}
		if (local451 < local167) {
			local167 = local451;
		}
		if (local441 > local490) {
			local490 = local441;
		}
		if (local161 < local177) {
			local177 = local161;
		}
		@Pc(525) Class6_Sub5_Sub15 local525 = null;
		if (arg13 != null) {
			@Pc(532) int local532 = arg13.anIntArray127[arg4];
			local525 = Static388.aClass324_2.method7259(local532 >> 16);
			arg4 = local532 & 0xFFFF;
		}
		if (local525 == null) {
			local60 = local60.method7398((byte) 3, local11, true);
			local60.l(local167 - local490 >> 1, 128, local177 - local173 >> 1);
			local60.m(local167 + local490 >> 1, 0, local173 + local177 >> 1);
		} else {
			local60 = local60.method7398((byte) 3, local11, true);
			local60.l(local167 - local490 >> 1, 128, local177 - local173 >> 1);
			local60.m(local490 + local167 >> 1, 0, local173 + local177 >> 1);
			local60.method7400(arg4, local525);
		}
		if (arg7 != 0) {
			local60.AA(arg7);
		}
		if (arg11 != 0) {
			local60.v(arg11);
		}
		if (arg2 != 0) {
			local60.m(0, arg2, 0);
		}
		return local60;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)Z")
	public static boolean method964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
