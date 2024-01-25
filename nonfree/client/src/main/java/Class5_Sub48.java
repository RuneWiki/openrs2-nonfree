import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class5_Sub48 extends Class5 {

	@OriginalMember(owner = "client!so", name = "j", descriptor = "[I")
	public int[] anIntArray523 = new int[] { -1 };

	@OriginalMember(owner = "client!so", name = "n", descriptor = "[I")
	public int[] anIntArray524 = new int[1];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[I[IIZ)J")
	private long method7975(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class166.aLongArray10;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg2 >> 8) ^ local9) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg2 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local41] >> 16) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) arg0[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local126] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) ((long) 255 & (local9 ^ (long) (arg3 ? 1 : 0)))];
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!ee;Lclient!hs;BIILclient!ha;ZII)Lclient!ka;")
	public Class164 method7976(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class165 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class57 arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class164 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class101 local11 = null;
		if (arg6 != -1) {
			local11 = Static356.aClass325_2.method7979(arg6);
		}
		@Pc(23) int[] local23 = this.anIntArray523;
		if (local11 != null && local11.anIntArray126 != null) {
			local23 = new int[local11.anIntArray126.length];
			for (@Pc(37) int local37 = 0; local37 < local11.anIntArray126.length; local37++) {
				@Pc(44) int local44 = local11.anIntArray126[local37];
				if (local44 >= 0 && this.anIntArray523.length > local44) {
					local23[local37] = this.anIntArray523[local44];
				} else {
					local23[local37] = -1;
				}
			}
		}
		@Pc(85) boolean local85 = false;
		@Pc(87) boolean local87 = false;
		@Pc(89) boolean local89 = false;
		@Pc(91) boolean local91 = false;
		@Pc(93) int local93 = -1;
		@Pc(95) int local95 = -1;
		@Pc(97) int local97 = 0;
		@Pc(107) Class5_Sub5_Sub15 local107 = null;
		@Pc(109) Class5_Sub5_Sub15 local109 = null;
		if (arg1 != null) {
			local9 = 2080;
			local93 = arg1.anIntArray226[arg2];
			@Pc(128) int local128 = local93 >>> 16;
			local107 = Static158.aClass317_1.method7883(local128, 64);
			local93 &= 0xFFFF;
			if (local107 != null) {
				local87 = local107.method4805(local93, -25695) | false;
				local85 = local107.method4801(local93, (byte) 93) | false;
				local91 = local107.method4799(local93) | false;
				local89 = arg1.aBoolean306 | false;
			}
			if ((arg1.aBoolean303 || Static95.aBoolean147) && arg7 != -1 && arg1.anIntArray226.length > arg7) {
				local95 = arg1.anIntArray226[arg7];
				local97 = arg1.anIntArray225[arg2];
				@Pc(199) int local199 = local95 >>> 16;
				local95 &= 0xFFFF;
				if (local199 == local128) {
					local109 = local107;
				} else {
					local109 = Static158.aClass317_1.method7883(local95 >>> 16, 64);
				}
				if (local109 != null) {
					local87 |= local109.method4805(local95, -25695);
					local85 |= local109.method4801(local95, (byte) 93);
					local91 |= local109.method4799(local95);
				}
			}
			if (local87) {
				local9 = 2208;
			}
			if (local85) {
				local9 |= 0x100;
			}
			if (local89) {
				local9 |= 0x200;
			}
			if (local91) {
				local9 |= 0x400;
			}
		}
		@Pc(277) long local277 = this.method7975(local23, arg0 == null ? null : arg0.anIntArray124, arg6, arg5);
		if (Static28.aClass391_53 != null) {
			local7 = (Class164) Static28.aClass391_53.method9275(local277);
		}
		if (local7 == null || arg4.method7670(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method7661(local9, local7.ua());
			}
			@Pc(307) int local307 = local9;
			@Pc(309) boolean local309 = false;
			for (@Pc(311) int local311 = 0; local311 < local23.length; local311++) {
				if (local23[local311] != -1 && !Static201.aClass127_1.method2501(local23[local311]).method4863((Class306) null, arg5)) {
					local309 = true;
				}
			}
			if (local309) {
				return null;
			}
			@Pc(354) Class192[] local354 = new Class192[local23.length];
			for (@Pc(356) int local356 = 0; local356 < local23.length; local356++) {
				if (local23[local356] != -1) {
					local354[local356] = Static201.aClass127_1.method2501(local23[local356]).method4872((Class306) null, arg5);
				}
			}
			@Pc(425) int local425;
			@Pc(432) int local432;
			if (local11 != null && local11.anIntArrayArray15 != null) {
				for (@Pc(399) int local399 = 0; local399 < local11.anIntArrayArray15.length; local399++) {
					if (local11.anIntArrayArray15[local399] != null && local354[local399] != null) {
						local425 = local11.anIntArrayArray15[local399][0];
						local432 = local11.anIntArrayArray15[local399][1];
						@Pc(439) int local439 = local11.anIntArrayArray15[local399][2];
						@Pc(446) int local446 = local11.anIntArrayArray15[local399][3];
						@Pc(453) int local453 = local11.anIntArrayArray15[local399][4];
						@Pc(460) int local460 = local11.anIntArrayArray15[local399][5];
						if (local446 != 0 || local453 != 0 || local460 != 0) {
							local354[local399].method4333(local460, local453, local446);
						}
						if (local425 != 0 || local432 != 0 || local439 != 0) {
							local354[local399].method4332(local432, local439, local425);
						}
					}
				}
			}
			@Pc(522) Class192 local522 = new Class192(local354, local354.length);
			if (arg0 != null) {
				local307 = local9 | 0x4000;
			}
			local7 = arg4.method7700(local522, local307, Static314.anInt5572, 64, 850);
			if (arg0 != null) {
				for (local425 = 0; local425 < 5; local425++) {
					for (local432 = 0; local432 < Static114.aShortArrayArrayArray1.length; local432++) {
						if (Static114.aShortArrayArrayArray1[local432][local425].length > arg0.anIntArray124[local425]) {
							local7.ia(Static59.aShortArrayArray2[local432][local425], Static114.aShortArrayArrayArray1[local432][local425][arg0.anIntArray124[local425]]);
						}
					}
				}
			}
			if (Static28.aClass391_53 != null) {
				local7.s(local9);
				Static28.aClass391_53.method9273(local277, local7, 1);
			}
		}
		if (arg1 == null || local107 == null) {
			return local7;
		} else {
			@Pc(624) Class164 local624 = local7.method9072((byte) 1, local9, true);
			local624.method9094(local97, local109, local95, local107, arg1.aBoolean306, local93, arg3 - 1, 0);
			return local624;
		}
	}
}
