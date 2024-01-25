import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!we", name = "m", descriptor = "[I")
	public int[] anIntArray560 = new int[] { -1 };

	@OriginalMember(owner = "client!we", name = "l", descriptor = "[I")
	public int[] anIntArray559 = new int[1];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!rj;ILclient!tj;ZIIIILclient!md;)Lclient!qb;")
	public Class124 method5613(@OriginalArg(0) int arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class131 arg7) {
		@Pc(7) Class124 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class54 local11 = null;
		if (arg5 != -1) {
			local11 = Static251.method4222(arg5);
		}
		@Pc(22) int[] local22 = this.anIntArray560;
		if (local11 != null && local11.anIntArray96 != null) {
			local22 = new int[local11.anIntArray96.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray96.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray96[local34];
				if (local41 >= 0 && this.anIntArray560.length > local41) {
					local22[local34] = this.anIntArray560[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(69) boolean local69 = false;
		@Pc(71) boolean local71 = false;
		@Pc(73) boolean local73 = false;
		@Pc(75) int local75 = -1;
		@Pc(93) int local93 = -1;
		@Pc(95) int local95 = 0;
		@Pc(97) Class3_Sub7_Sub21 local97 = null;
		@Pc(99) Class3_Sub7_Sub21 local99 = null;
		if (arg7 != null) {
			local75 = arg7.anIntArray335[arg6];
			local9 = 1056;
			@Pc(114) int local114 = local75 >>> 16;
			local97 = Static1.method1(local114);
			local75 &= 0xFFFF;
			if (local97 != null) {
				local71 = local97.method5289(local75) | false;
				local69 = local97.method5287(local75) | false;
				local73 = arg7.aBoolean227 | false;
			}
			if ((arg7.aBoolean228 || Static151.aBoolean164) && arg4 != -1 && arg4 < arg7.anIntArray335.length) {
				local95 = arg7.anIntArray337[arg6];
				local93 = arg7.anIntArray335[arg4];
				@Pc(174) int local174 = local93 >>> 16;
				local93 &= 0xFFFF;
				if (local114 == local174) {
					local99 = local97;
				} else {
					local99 = Static1.method1(local93 >>> 16);
				}
				if (local99 != null) {
					local71 |= local99.method5289(local93);
					local69 |= local99.method5287(local93);
				}
			}
			if (local71) {
				local9 = 1184;
			}
			if (local69) {
				local9 |= 0x100;
			}
			if (local73) {
				local9 |= 0x200;
			}
		}
		@Pc(241) long local241 = this.method5616(arg5, local22, arg1 == null ? null : arg1.anIntArray434, arg3);
		if (Static152.aClass198_24 != null) {
			local7 = (Class124) Static152.aClass198_24.method5242(local241);
		}
		if (local7 == null || arg2.method4766(local7.method4108(), local9) != 0) {
			if (local7 != null) {
				local9 = arg2.method4799(local9, local7.method4108());
			}
			@Pc(267) int local267 = local9;
			@Pc(269) boolean local269 = false;
			for (@Pc(271) int local271 = 0; local271 < local22.length; local271++) {
				if (local22[local271] != -1 && !Static230.method5537(local22[local271]).method941(arg3)) {
					local269 = true;
				}
			}
			if (local269) {
				return null;
			}
			@Pc(306) Class40[] local306 = new Class40[local22.length];
			for (@Pc(308) int local308 = 0; local308 < local22.length; local308++) {
				if (local22[local308] != -1) {
					local306[local308] = Static230.method5537(local22[local308]).method935(arg3);
				}
			}
			@Pc(359) int local359;
			if (local11 != null && local11.anIntArrayArray9 != null) {
				for (@Pc(339) int local339 = 0; local339 < local11.anIntArrayArray9.length; local339++) {
					if (local11.anIntArrayArray9[local339] != null && local306[local339] != null) {
						local359 = local11.anIntArrayArray9[local339][0];
						@Pc(366) int local366 = local11.anIntArrayArray9[local339][1];
						@Pc(373) int local373 = local11.anIntArrayArray9[local339][2];
						@Pc(380) int local380 = local11.anIntArrayArray9[local339][3];
						@Pc(387) int local387 = local11.anIntArrayArray9[local339][4];
						@Pc(394) int local394 = local11.anIntArrayArray9[local339][5];
						if (local380 != 0 || local387 != 0 || local394 != 0) {
							local306[local339].method916(local394, local387, local380);
						}
						if (local359 != 0 || local366 != 0 || local373 != 0) {
							local306[local339].method906(local373, local359, local366);
						}
					}
				}
			}
			if (arg1 != null) {
				local267 = local9 | 0x2000;
			}
			@Pc(453) Class40 local453 = new Class40(local306, local306.length);
			local7 = arg2.method4794(local453, local267, Static200.anInt4109, 64, 850);
			if (arg1 != null) {
				for (local359 = 0; local359 < 5; local359++) {
					if (Static196.aShortArrayArray4[local359].length > arg1.anIntArray434[local359]) {
						local7.method4083(Static333.aShortArray111[local359], Static196.aShortArrayArray4[local359][arg1.anIntArray434[local359]]);
					}
					if (Static8.aShortArrayArray1[local359].length > arg1.anIntArray434[local359]) {
						local7.method4083(Static157.aShortArray71[local359], Static8.aShortArrayArray1[local359][arg1.anIntArray434[local359]]);
					}
				}
			}
			if (Static152.aClass198_24 != null) {
				local7.method4080(local9);
				Static152.aClass198_24.method5231(local241, local7);
			}
		}
		if (arg7 == null || local97 == null) {
			return local7;
		} else {
			@Pc(539) Class124 local539 = local7.method4094((byte) 1, local9, true);
			local539.method4096(local75, arg0 - 1, 0, local99, arg7.aBoolean227, local93, local97, local95);
			return local539;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[I[IZB)J")
	private long method5616(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(23) long[] local23 = Class27.aLongArray2;
		@Pc(25) long local25 = -1L;
		@Pc(41) long local41 = local25 >>> 8 ^ local23[(int) (((long) (arg0 >> 8) ^ local25) & 0xFFL)];
		local25 = local41 >>> 8 ^ local23[(int) (((long) arg0 ^ local41) & 0xFFL)];
		for (@Pc(57) int local57 = 0; local57 < arg1.length; local57++) {
			local25 = local25 >>> 8 ^ local23[(int) ((local25 ^ (long) (arg1[local57] >> 24)) & 0xFFL)];
			local25 = local25 >>> 8 ^ local23[(int) (((long) (arg1[local57] >> 16) ^ local25) & 0xFFL)];
			local25 = local23[(int) (((long) (arg1[local57] >> 8) ^ local25) & 0xFFL)] ^ local25 >>> 8;
			local25 = local23[(int) ((local25 ^ (long) arg1[local57]) & 0xFFL)] ^ local25 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(138) int local138 = 0; local138 < 5; local138++) {
				local25 = local25 >>> 8 ^ local23[(int) ((local25 ^ (long) arg2[local138]) & 0xFFL)];
			}
		}
		return local25 >>> 8 ^ local23[(int) (((long) (arg3 ? 1 : 0) ^ local25) & 0xFFL)];
	}
}
