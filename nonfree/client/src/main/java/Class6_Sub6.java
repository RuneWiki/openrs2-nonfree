import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "[I")
	public int[] anIntArray32 = new int[1];

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "[I")
	public int[] anIntArray33 = new int[] { -1 };

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!gaa;IIZLclient!tfa;IIIBLclient!ha;)Lclient!ka;")
	public Class92 method784(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class5 arg7) {
		@Pc(7) Class92 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class303 local11 = null;
		if (arg5 != -1) {
			local11 = Static629.aClass271_1.method6871(arg5);
		}
		@Pc(23) int[] local23 = this.anIntArray33;
		if (local11 != null && local11.anIntArray462 != null) {
			local23 = new int[local11.anIntArray462.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray462.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray462[local35];
				if (local42 >= 0 && local42 < this.anIntArray33.length) {
					local23[local35] = this.anIntArray33[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = 0;
		@Pc(92) Class6_Sub5_Sub18 local92 = null;
		@Pc(94) Class6_Sub5_Sub18 local94 = null;
		if (arg0 != null) {
			local9 = 2080;
			local86 = arg0.anIntArray178[arg2];
			@Pc(125) int local125 = local86 >>> 16;
			local92 = Static528.aClass198_2.method5707(local125);
			local86 &= 0xFFFF;
			if (local92 != null) {
				local80 = local92.method4650(local86) | false;
				local78 = local92.method4648(local86) | false;
				local84 = local92.method4646(local86) | false;
				local82 = arg0.aBoolean308 | false;
			}
			if ((arg0.aBoolean310 || Static609.aBoolean809) && arg6 != -1 && arg0.anIntArray178.length > arg6) {
				local90 = arg0.anIntArray176[arg2];
				local88 = arg0.anIntArray178[arg6];
				@Pc(190) int local190 = local88 >>> 16;
				local88 &= 0xFFFF;
				if (local125 == local190) {
					local94 = local92;
				} else {
					local94 = Static528.aClass198_2.method5707(local88 >>> 16);
				}
				if (local94 != null) {
					local80 |= local94.method4650(local88);
					local78 |= local94.method4648(local88);
					local84 |= local94.method4646(local88);
				}
			}
			if (local80) {
				local9 = 2208;
			}
			if (local78) {
				local9 |= 0x100;
			}
			if (local82) {
				local9 |= 0x200;
			}
			if (local84) {
				local9 |= 0x400;
			}
		}
		@Pc(271) long local271 = this.method785(arg5, arg3, local23, arg4 == null ? null : arg4.anIntArray497);
		if (Static135.aClass94_14 != null) {
			local7 = (Class92) Static135.aClass94_14.method2960(local271);
		}
		if (local7 == null || arg7.method6147(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method6140(local9, local7.ua());
			}
			@Pc(300) int local300 = local9;
			@Pc(302) boolean local302 = false;
			for (@Pc(304) int local304 = 0; local304 < local23.length; local304++) {
				if (local23[local304] != -1 && !Static356.aClass221_1.method5923(local23[local304]).method7406(arg3)) {
					local302 = true;
				}
			}
			if (local302) {
				return null;
			}
			@Pc(341) Class192[] local341 = new Class192[local23.length];
			for (@Pc(343) int local343 = 0; local343 < local23.length; local343++) {
				if (local23[local343] != -1) {
					local341[local343] = Static356.aClass221_1.method5923(local23[local343]).method7414(arg3);
				}
			}
			@Pc(395) int local395;
			@Pc(402) int local402;
			if (local11 != null && local11.anIntArrayArray47 != null) {
				for (@Pc(375) int local375 = 0; local375 < local11.anIntArrayArray47.length; local375++) {
					if (local11.anIntArrayArray47[local375] != null && local341[local375] != null) {
						local395 = local11.anIntArrayArray47[local375][0];
						local402 = local11.anIntArrayArray47[local375][1];
						@Pc(409) int local409 = local11.anIntArrayArray47[local375][2];
						@Pc(416) int local416 = local11.anIntArrayArray47[local375][3];
						@Pc(423) int local423 = local11.anIntArrayArray47[local375][4];
						@Pc(430) int local430 = local11.anIntArrayArray47[local375][5];
						if (local416 != 0 || local423 != 0 || local430 != 0) {
							local341[local375].method5557(local430, local416, local423);
						}
						if (local395 != 0 || local402 != 0 || local409 != 0) {
							local341[local375].method5554(local409, local395, local402);
						}
					}
				}
			}
			if (arg4 != null) {
				local300 = local9 | 0x4000;
			}
			@Pc(493) Class192 local493 = new Class192(local341, local341.length);
			local7 = arg7.method6153(local493, local300, Static191.anInt4141, 64, 850);
			if (arg4 != null) {
				for (local395 = 0; local395 < 5; local395++) {
					for (local402 = 0; local402 < Static119.aShortArrayArrayArray3.length; local402++) {
						if (Static119.aShortArrayArrayArray3[local402][local395].length > arg4.anIntArray497[local395]) {
							local7.ia(Static158.aShortArrayArray13[local402][local395], Static119.aShortArrayArrayArray3[local402][local395][arg4.anIntArray497[local395]]);
						}
					}
				}
			}
			if (Static135.aClass94_14 != null) {
				local7.s(local9);
				Static135.aClass94_14.method2963(local271, local7);
			}
		}
		if (arg0 == null || local92 == null) {
			return local7;
		} else {
			@Pc(570) Class92 local570 = local7.method7069((byte) 1, local9, true);
			local570.method7066(arg1 - 1, local92, local86, local94, arg0.aBoolean308, 0, local90, local88);
			return local570;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ[I[II)J")
	private long method785(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		@Pc(7) long[] local7 = Class377.aLongArray16;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg0 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg0 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg2.length; local41++) {
			local9 = local7[(int) (((long) (arg2[local41] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local41] >> 16)) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg2[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg2[local41] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg3[local122] ^ local9) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg1 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}
}
