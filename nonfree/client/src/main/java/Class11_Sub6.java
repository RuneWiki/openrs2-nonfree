import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class11_Sub6 extends Class11 {

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "[I")
	public int[] anIntArray48 = new int[] { -1 };

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "[I")
	public int[] anIntArray46 = new int[1];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[IZ[II)J")
	private long method508(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3) {
		@Pc(7) long[] local7 = Class27_Sub4.aLongArray9;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg0 >> 8) ^ local9) & 0xFFL)];
		local9 = local7[(int) (((long) arg0 ^ local25) & (long) 255)] ^ local25 >>> 8;
		for (@Pc(42) int local42 = 0; local42 < arg1.length; local42++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1[local42] >> 24)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg1[local42] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg1[local42] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg1[local42]) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg3[local127] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg2 ? 1 : 0) ^ local9) & 0xFFL)];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!nj;Lclient!jm;IIIIZLclient!uo;I)Lclient!mj;")
	public Class126 method510(@OriginalArg(1) Class140 arg0, @OriginalArg(2) Class111 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) Class129 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class126 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class55 local11 = null;
		if (arg7 != -1) {
			local11 = Static157.method2529(arg7);
		}
		@Pc(22) int[] local22 = this.anIntArray48;
		if (local11 != null && local11.anIntArray73 != null) {
			local22 = new int[local11.anIntArray73.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray73.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray73[local34];
				if (local41 >= 0 && local41 < this.anIntArray48.length) {
					local22[local34] = this.anIntArray48[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(73) boolean local73 = false;
		@Pc(75) boolean local75 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) int local79 = -1;
		@Pc(81) int local81 = -1;
		@Pc(83) int local83 = 0;
		@Pc(92) Class11_Sub4_Sub14 local92 = null;
		@Pc(94) Class11_Sub4_Sub14 local94 = null;
		if (arg1 != null) {
			local79 = arg1.anIntArray191[arg2];
			local9 = 1056;
			@Pc(109) int local109 = local79 >>> 16;
			local79 &= 0xFFFF;
			local92 = Static36.method537(local109);
			if (local92 != null) {
				local75 = local92.method4230(local79) | false;
				local73 = local92.method4229(local79) | false;
				local77 = arg1.aBoolean186 | false;
			}
			if ((arg1.aBoolean188 || Static256.aBoolean339) && arg4 != -1 && arg4 < arg1.anIntArray191.length) {
				local83 = arg1.anIntArray190[arg2];
				local81 = arg1.anIntArray191[arg4];
				@Pc(169) int local169 = local81 >>> 16;
				local81 &= 0xFFFF;
				if (local169 == local109) {
					local94 = local92;
				} else {
					local94 = Static36.method537(local81 >>> 16);
				}
				if (local94 != null) {
					local75 |= local94.method4230(local81);
					local73 |= local94.method4229(local81);
				}
			}
			if (local75) {
				local9 = 1184;
			}
			if (local73) {
				local9 |= 0x100;
			}
			if (local77) {
				local9 |= 0x200;
			}
		}
		@Pc(232) long local232 = this.method508(arg7, local22, arg5, arg0 == null ? null : arg0.anIntArray328);
		if (Static325.aClass26_7 != null) {
			local7 = (Class126) Static325.aClass26_7.method332(local232);
		}
		if (local7 == null || arg6.method4938(local7.method3142(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method4989(local9, local7.method3142());
			}
			@Pc(261) int local261 = local9;
			@Pc(263) boolean local263 = false;
			for (@Pc(265) int local265 = 0; local265 < local22.length; local265++) {
				if (local22[local265] != -1 && !Static283.method4717(local22[local265]).method4526(arg5)) {
					local263 = true;
				}
			}
			if (local263) {
				return null;
			}
			@Pc(296) Class31[] local296 = new Class31[local22.length];
			for (@Pc(298) int local298 = 0; local298 < local22.length; local298++) {
				if (local22[local298] != -1) {
					local296[local298] = Static283.method4717(local22[local298]).method4541(arg5);
				}
			}
			@Pc(349) int local349;
			if (local11 != null && local11.anIntArrayArray5 != null) {
				for (@Pc(329) int local329 = 0; local329 < local11.anIntArrayArray5.length; local329++) {
					if (local11.anIntArrayArray5[local329] != null && local296[local329] != null) {
						local349 = local11.anIntArrayArray5[local329][0];
						@Pc(356) int local356 = local11.anIntArrayArray5[local329][1];
						@Pc(363) int local363 = local11.anIntArrayArray5[local329][2];
						@Pc(370) int local370 = local11.anIntArrayArray5[local329][3];
						@Pc(377) int local377 = local11.anIntArrayArray5[local329][4];
						@Pc(384) int local384 = local11.anIntArrayArray5[local329][5];
						if (local370 != 0 || local377 != 0 || local384 != 0) {
							local296[local329].method437(local377, local370, local384);
						}
						if (local349 != 0 || local356 != 0 || local363 != 0) {
							local296[local329].method436(local356, local363, local349);
						}
					}
				}
			}
			@Pc(431) Class31 local431 = new Class31(local296, local296.length);
			if (arg0 != null) {
				local261 = local9 | 0x2000;
			}
			local7 = arg6.method4929(local431, local261, Static237.anInt4759, 64, 850);
			if (arg0 != null) {
				for (local349 = 0; local349 < 5; local349++) {
					if (Static229.aShortArrayArray12[local349].length > arg0.anIntArray328[local349]) {
						local7.method3162(Static307.aShortArray92[local349], Static229.aShortArrayArray12[local349][arg0.anIntArray328[local349]]);
					}
					if (arg0.anIntArray328[local349] < Static169.aShortArrayArray16[local349].length) {
						local7.method3162(Static45.aShortArray38[local349], Static169.aShortArrayArray16[local349][arg0.anIntArray328[local349]]);
					}
				}
			}
			if (Static325.aClass26_7 != null) {
				local7.method3143(local9);
				Static325.aClass26_7.method330(local232, local7);
			}
		}
		if (arg1 == null || local92 == null) {
			return local7;
		} else {
			@Pc(527) Class126 local527 = local7.method3158((byte) 1, local9, true);
			local527.method3144(local81, local92, arg1.aBoolean186, local79, local94, 0, local83, arg3 - 1);
			return local527;
		}
	}
}
