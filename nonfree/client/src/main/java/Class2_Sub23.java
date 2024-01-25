import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "[I")
	public int[] anIntArray233 = new int[1];

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "[I")
	public int[] anIntArray234 = new int[] { -1 };

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIZLclient!r;Lclient!kn;IILclient!dr;)Lclient!da;")
	public Class66 method3244(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2, @OriginalArg(5) Class100 arg3, @OriginalArg(6) Class194 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class84 arg7) {
		@Pc(7) Class66 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class54 local11 = null;
		if (arg6 != -1) {
			local11 = Static207.aClass354_1.method7795(arg6);
		}
		@Pc(22) int[] local22 = this.anIntArray234;
		if (local11 != null && local11.anIntArray74 != null) {
			local22 = new int[local11.anIntArray74.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray74.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray74[local34];
				if (local41 >= 0 && local41 < this.anIntArray234.length) {
					local22[local34] = this.anIntArray234[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(72) boolean local72 = false;
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) int local80 = -1;
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = 0;
		@Pc(86) Class2_Sub3_Sub19 local86 = null;
		@Pc(88) Class2_Sub3_Sub19 local88 = null;
		if (arg7 != null) {
			local9 = 2080;
			local80 = arg7.anIntArray108[arg5];
			@Pc(103) int local103 = local80 >>> 16;
			local80 &= 0xFFFF;
			local86 = Static116.aClass140_2.method3286(local103);
			if (local86 != null) {
				local74 = local86.method7770(local80) | false;
				local72 = local86.method7768(local80) | false;
				local78 = local86.method7771(local80) | false;
				local76 = arg7.aBoolean184 | false;
			}
			if ((arg7.aBoolean186 || Static564.aBoolean711) && arg0 != -1 && arg0 < arg7.anIntArray108.length) {
				local82 = arg7.anIntArray108[arg0];
				local84 = arg7.anIntArray110[arg5];
				@Pc(173) int local173 = local82 >>> 16;
				local82 &= 0xFFFF;
				if (local173 == local103) {
					local88 = local86;
				} else {
					local88 = Static116.aClass140_2.method3286(local82 >>> 16);
				}
				if (local88 != null) {
					local74 |= local88.method7770(local82);
					local72 |= local88.method7768(local82);
					local78 |= local88.method7771(local82);
				}
			}
			if (local74) {
				local9 = 2208;
			}
			if (local72) {
				local9 |= 0x100;
			}
			if (local76) {
				local9 |= 0x200;
			}
			if (local78) {
				local9 |= 0x400;
			}
		}
		@Pc(256) long local256 = this.method3245(arg6, arg2, local22, arg4 == null ? null : arg4.anIntArray347);
		if (Static42.aClass313_10 != null) {
			local7 = (Class66) Static42.aClass313_10.method6989(local256);
		}
		if (local7 == null || arg3.method6216(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method6215(local9, local7.PA());
			}
			@Pc(285) int local285 = local9;
			@Pc(287) boolean local287 = false;
			for (@Pc(289) int local289 = 0; local289 < local22.length; local289++) {
				if (local22[local289] != -1 && !Static296.aClass218_1.method5067(local22[local289]).method7483(arg2)) {
					local287 = true;
				}
			}
			if (local287) {
				return null;
			}
			@Pc(326) Class93[] local326 = new Class93[local22.length];
			for (@Pc(328) int local328 = 0; local328 < local22.length; local328++) {
				if (local22[local328] != -1) {
					local326[local328] = Static296.aClass218_1.method5067(local22[local328]).method7468(arg2);
				}
			}
			@Pc(384) int local384;
			@Pc(391) int local391;
			if (local11 != null && local11.anIntArrayArray2 != null) {
				for (@Pc(364) int local364 = 0; local364 < local11.anIntArrayArray2.length; local364++) {
					if (local11.anIntArrayArray2[local364] != null && local326[local364] != null) {
						local384 = local11.anIntArrayArray2[local364][0];
						local391 = local11.anIntArrayArray2[local364][1];
						@Pc(398) int local398 = local11.anIntArrayArray2[local364][2];
						@Pc(405) int local405 = local11.anIntArrayArray2[local364][3];
						@Pc(412) int local412 = local11.anIntArrayArray2[local364][4];
						@Pc(419) int local419 = local11.anIntArrayArray2[local364][5];
						if (local405 != 0 || local412 != 0 || local419 != 0) {
							local326[local364].method1762(local405, local419, local412);
						}
						if (local384 != 0 || local391 != 0 || local398 != 0) {
							local326[local364].method1752(local398, local384, local391);
						}
					}
				}
			}
			@Pc(469) Class93 local469 = new Class93(local326, local326.length);
			if (arg4 != null) {
				local285 = local9 | 0x4000;
			}
			local7 = arg3.method6191(local469, local285, Static288.anInt5200, 64, 850);
			if (arg4 != null) {
				for (local384 = 0; local384 < 5; local384++) {
					for (local391 = 0; local391 < Static65.aShortArrayArrayArray1.length; local391++) {
						if (arg4.anIntArray347[local384] < Static65.aShortArrayArrayArray1[local391][local384].length) {
							local7.d(Static315.aShortArrayArray31[local391][local384], Static65.aShortArrayArrayArray1[local391][local384][arg4.anIntArray347[local384]]);
						}
					}
				}
			}
			if (Static42.aClass313_10 != null) {
				local7.SA(local9);
				Static42.aClass313_10.method6980(local256, local7);
			}
		}
		if (arg7 == null || local86 == null) {
			return local7;
		} else {
			@Pc(552) Class66 local552 = local7.method7551((byte) 1, local9, true);
			local552.method7559(arg7.aBoolean184, local86, local82, local80, local88, arg1 - 1, 0, local84);
			return local552;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZ[IB[I)J")
	private long method3245(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class223.aLongArray8;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0 >> 8)) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) ((local25 ^ (long) arg0) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg2.length; local41++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local41] >> 24)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg2[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg2[local41] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg2[local41] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
				local9 = local7[(int) (((long) arg3[local142] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg1 ? 1 : 0) ^ local9) & 0xFFL)];
	}
}
