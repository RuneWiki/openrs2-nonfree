import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "[I")
	public int[] anIntArray255 = new int[] { -1 };

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "[I")
	public int[] anIntArray256 = new int[1];

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([I[IBZI)J")
	private long method3121(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(12) long[] local12 = Class64.aLongArray5;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local14 >>> 8 ^ local12[(int) (((long) (arg3 >> 8) ^ local14) & 0xFFL)];
		local14 = local30 >>> 8 ^ local12[(int) (((long) arg3 ^ local30) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg0.length; local46++) {
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg0[local46] >> 24)) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg0[local46] >> 16) ^ local14) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg0[local46] >> 8) ^ local14) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) arg0[local46] ^ local14) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local14 >>> 8 ^ local12[(int) (((long) arg1[local127] ^ local14) & 0xFFL)];
			}
		}
		return local14 >>> 8 ^ local12[(int) (((long) (arg2 ? 1 : 0) ^ local14) & 0xFFL)];
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZIILclient!tq;Lclient!tp;IIILclient!fp;)Lclient!bi;")
	public Class3 method3123(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) Class200 arg2, @OriginalArg(5) Class199 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class63 arg7) {
		@Pc(7) Class3 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class67 local11 = null;
		if (arg0 != -1) {
			local11 = Static217.method4010(arg0);
		}
		@Pc(22) int[] local22 = this.anIntArray255;
		if (local11 != null && local11.anIntArray166 != null) {
			local22 = new int[local11.anIntArray166.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray166.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray166[local34];
				if (local41 >= 0 && local41 < this.anIntArray255.length) {
					local22[local34] = this.anIntArray255[local41];
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
		@Pc(91) int local91 = 0;
		@Pc(93) Class1_Sub4_Sub20 local93 = null;
		@Pc(95) Class1_Sub4_Sub20 local95 = null;
		if (arg3 != null) {
			local9 = 1056;
			local79 = arg3.anIntArray467[arg6];
			@Pc(110) int local110 = local79 >>> 16;
			local79 &= 0xFFFF;
			local93 = Static156.method2960(local110);
			if (local93 != null) {
				local75 = local93.method4029(local79) | false;
				local73 = local93.method4032(local79) | false;
				local77 = arg3.aBoolean448 | false;
			}
			if ((arg3.aBoolean446 || Static21.aBoolean29) && arg5 != -1 && arg5 < arg3.anIntArray467.length) {
				local81 = arg3.anIntArray467[arg5];
				local91 = arg3.anIntArray466[arg6];
				@Pc(166) int local166 = local81 >>> 16;
				local81 &= 0xFFFF;
				if (local110 == local166) {
					local95 = local93;
				} else {
					local95 = Static156.method2960(local81 >>> 16);
				}
				if (local95 != null) {
					local75 |= local95.method4029(local81);
					local73 |= local95.method4032(local81);
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
		@Pc(233) long local233 = this.method3121(local22, arg2 == null ? null : arg2.anIntArray469, arg1, arg0);
		if (Static120.aClass21_78 != null) {
			local7 = (Class3) Static120.aClass21_78.method854(local233);
		}
		if (local7 == null || arg7.method4574(local7.method1256(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method4628(local9, local7.method1256());
			}
			@Pc(259) int local259 = local9;
			@Pc(261) boolean local261 = false;
			for (@Pc(263) int local263 = 0; local263 < local22.length; local263++) {
				if (local22[local263] != -1 && !Static243.aClass220_2.method5972(local22[local263]).method887(arg1)) {
					local261 = true;
				}
			}
			if (local261) {
				return null;
			}
			@Pc(300) Class41[] local300 = new Class41[local22.length];
			for (@Pc(302) int local302 = 0; local302 < local22.length; local302++) {
				if (local22[local302] != -1) {
					local300[local302] = Static243.aClass220_2.method5972(local22[local302]).method900(arg1);
				}
			}
			@Pc(353) int local353;
			if (local11 != null && local11.anIntArrayArray18 != null) {
				for (@Pc(333) int local333 = 0; local333 < local11.anIntArrayArray18.length; local333++) {
					if (local11.anIntArrayArray18[local333] != null && local300[local333] != null) {
						local353 = local11.anIntArrayArray18[local333][0];
						@Pc(360) int local360 = local11.anIntArrayArray18[local333][1];
						@Pc(367) int local367 = local11.anIntArrayArray18[local333][2];
						@Pc(374) int local374 = local11.anIntArrayArray18[local333][3];
						@Pc(381) int local381 = local11.anIntArrayArray18[local333][4];
						@Pc(388) int local388 = local11.anIntArrayArray18[local333][5];
						if (local374 != 0 || local381 != 0 || local388 != 0) {
							local300[local333].method1516(local388, local381, local374);
						}
						if (local353 != 0 || local360 != 0 || local367 != 0) {
							local300[local333].method1513(local367, local360, local353);
						}
					}
				}
			}
			if (arg2 != null) {
				local259 = local9 | 0x2000;
			}
			@Pc(445) Class41 local445 = new Class41(local300, local300.length);
			local7 = arg7.method4652(local445, local259, Static227.anInt4589, 64, 850);
			if (arg2 != null) {
				for (local353 = 0; local353 < 5; local353++) {
					if (arg2.anIntArray469[local353] < Static217.aShortArrayArray6[local353].length) {
						local7.method1260(Static123.aShortArray59[local353], Static217.aShortArrayArray6[local353][arg2.anIntArray469[local353]]);
					}
					if (Static220.aShortArrayArray7[local353].length > arg2.anIntArray469[local353]) {
						local7.method1260(Static140.aShortArray63[local353], Static220.aShortArrayArray7[local353][arg2.anIntArray469[local353]]);
					}
				}
			}
			if (Static120.aClass21_78 != null) {
				local7.method1270(local9);
				Static120.aClass21_78.method843(local7, local233);
			}
		}
		if (arg3 == null || local93 == null) {
			return local7;
		} else {
			@Pc(535) Class3 local535 = local7.method1261((byte) 1, local9, true);
			local535.method1279(local79, local93, local81, arg4 - 1, arg3.aBoolean448, 0, local91, local95);
			return local535;
		}
	}
}
