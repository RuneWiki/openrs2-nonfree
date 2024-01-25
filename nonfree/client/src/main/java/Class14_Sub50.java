import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sw")
public final class Class14_Sub50 extends Class14 {

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "[I")
	public int[] anIntArray698 = new int[1];

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "[I")
	public int[] anIntArray699 = new int[] { -1 };

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!pf;Lclient!ha;Lclient!sq;IIZIIII)Lclient!ka;")
	public Class80 method7852(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) Class325 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(18) Class80 local18 = null;
		@Pc(20) int local20 = 2048;
		@Pc(22) Class132 local22 = null;
		if (arg4 != -1) {
			local22 = Static110.aClass197_1.method4401(arg4);
		}
		@Pc(33) int[] local33 = this.anIntArray699;
		if (local22 != null && local22.anIntArray305 != null) {
			local33 = new int[local22.anIntArray305.length];
			for (@Pc(45) int local45 = 0; local45 < local22.anIntArray305.length; local45++) {
				@Pc(52) int local52 = local22.anIntArray305[local45];
				if (local52 >= 0 && this.anIntArray699.length > local52) {
					local33[local45] = this.anIntArray699[local52];
				} else {
					local33[local45] = -1;
				}
			}
		}
		@Pc(87) boolean local87 = false;
		@Pc(89) boolean local89 = false;
		@Pc(91) boolean local91 = false;
		@Pc(93) boolean local93 = false;
		@Pc(95) int local95 = -1;
		@Pc(97) int local97 = -1;
		@Pc(99) int local99 = 0;
		@Pc(101) Class14_Sub3_Sub1 local101 = null;
		@Pc(103) Class14_Sub3_Sub1 local103 = null;
		if (arg0 != null) {
			local95 = arg0.anIntArray598[arg7];
			local20 = 2080;
			@Pc(118) int local118 = local95 >>> 16;
			local101 = Static501.aClass191_2.method4319(local118);
			local95 &= 0xFFFF;
			if (local101 != null) {
				local89 = local101.method216(local95) | false;
				local87 = local101.method217(local95) | false;
				local93 = local101.method213(local95) | false;
				local91 = arg0.aBoolean544 | false;
			}
			if ((arg0.aBoolean543 || Static394.aBoolean505) && arg6 != -1 && arg6 < arg0.anIntArray598.length) {
				local97 = arg0.anIntArray598[arg6];
				local99 = arg0.anIntArray599[arg7];
				@Pc(183) int local183 = local97 >>> 16;
				local97 &= 0xFFFF;
				if (local183 == local118) {
					local103 = local101;
				} else {
					local103 = Static501.aClass191_2.method4319(local97 >>> 16);
				}
				if (local103 != null) {
					local89 |= local103.method216(local97);
					local87 |= local103.method217(local97);
					local93 |= local103.method213(local97);
				}
			}
			if (local89) {
				local20 = 2208;
			}
			if (local87) {
				local20 |= 0x100;
			}
			if (local91) {
				local20 |= 0x200;
			}
			if (local93) {
				local20 |= 0x400;
			}
		}
		@Pc(260) long local260 = this.method7853(arg5, arg2 == null ? null : arg2.anIntArray693, local33, arg4);
		if (Static597.aClass264_59 != null) {
			local18 = (Class80) Static597.aClass264_59.method6367(local260);
		}
		if (local18 == null || arg1.method7922(local18.ua(), local20) != 0) {
			if (local18 != null) {
				local20 = arg1.method7943(local20, local18.ua());
			}
			@Pc(289) int local289 = local20;
			@Pc(291) boolean local291 = false;
			for (@Pc(293) int local293 = 0; local293 < local33.length; local293++) {
				if (local33[local293] != -1 && !Static175.aClass247_2.method5962(local33[local293]).method817(arg5, (Class110) null)) {
					local291 = true;
				}
			}
			if (local291) {
				return null;
			}
			@Pc(330) Class67[] local330 = new Class67[local33.length];
			for (@Pc(332) int local332 = 0; local332 < local33.length; local332++) {
				if (local33[local332] != -1) {
					local330[local332] = Static175.aClass247_2.method5962(local33[local332]).method812(arg5, (Class110) null);
				}
			}
			@Pc(384) int local384;
			@Pc(391) int local391;
			if (local22 != null && local22.anIntArrayArray22 != null) {
				for (@Pc(364) int local364 = 0; local364 < local22.anIntArrayArray22.length; local364++) {
					if (local22.anIntArrayArray22[local364] != null && local330[local364] != null) {
						local384 = local22.anIntArrayArray22[local364][0];
						local391 = local22.anIntArrayArray22[local364][1];
						@Pc(398) int local398 = local22.anIntArrayArray22[local364][2];
						@Pc(405) int local405 = local22.anIntArrayArray22[local364][3];
						@Pc(412) int local412 = local22.anIntArrayArray22[local364][4];
						@Pc(419) int local419 = local22.anIntArrayArray22[local364][5];
						if (local405 != 0 || local412 != 0 || local419 != 0) {
							local330[local364].method1722(local412, local419, local405);
						}
						if (local384 != 0 || local391 != 0 || local398 != 0) {
							local330[local364].method1725(local398, local391, local384);
						}
					}
				}
			}
			@Pc(466) Class67 local466 = new Class67(local330, local330.length);
			if (arg2 != null) {
				local289 = local20 | 0x4000;
			}
			local18 = arg1.method7901(local466, local289, Static368.anInt6814, 64, 850);
			if (arg2 != null) {
				for (local384 = 0; local384 < 5; local384++) {
					for (local391 = 0; local391 < Static509.aShortArrayArrayArray4.length; local391++) {
						if (arg2.anIntArray693[local384] < Static509.aShortArrayArrayArray4[local391][local384].length) {
							local18.ia(Static582.aShortArrayArray18[local391][local384], Static509.aShortArrayArrayArray4[local391][local384][arg2.anIntArray693[local384]]);
						}
					}
				}
			}
			if (Static597.aClass264_59 != null) {
				local18.s(local20);
				Static597.aClass264_59.method6364(local260, local18);
			}
		}
		if (arg0 == null || local101 == null) {
			return local18;
		} else {
			@Pc(553) Class80 local553 = local18.method6378((byte) 1, local20, true);
			local553.method6387(local103, local95, arg3 - 1, local97, local99, arg0.aBoolean544, local101, 0);
			return local553;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z[I[III)J")
	private long method7853(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class70.aLongArray1;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg3 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg3 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg2.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg2[local41] >> 24) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg2[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local41] >> 8)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg2[local41] ^ local9) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local131] ^ local9) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg0 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}
}
