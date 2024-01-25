import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class1_Sub20 extends Class1 {

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "[I")
	public int[] anIntArray149 = new int[] { -1 };

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "[I")
	public int[] anIntArray150 = new int[1];

	static {
		new Class151("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZIIILclient!qa;Lclient!da;IIILclient!nm;)Lclient!c;")
	public Class33 method2332(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class128 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class171 arg7) {
		@Pc(7) Class33 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class51 local11 = null;
		if (arg1 != -1) {
			local11 = Static332.aClass174_1.method3490(arg1);
		}
		@Pc(23) int[] local23 = this.anIntArray149;
		if (local11 != null && local11.anIntArray58 != null) {
			local23 = new int[local11.anIntArray58.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray58.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray58[local35];
				if (local42 >= 0 && local42 < this.anIntArray149.length) {
					local23[local35] = this.anIntArray149[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(70) boolean local70 = false;
		@Pc(72) boolean local72 = false;
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) int local78 = -1;
		@Pc(80) int local80 = -1;
		@Pc(82) int local82 = 0;
		@Pc(84) Class1_Sub3_Sub11 local84 = null;
		@Pc(86) Class1_Sub3_Sub11 local86 = null;
		if (arg7 != null) {
			local78 = arg7.anIntArray235[arg2];
			local9 = 2080;
			@Pc(101) int local101 = local78 >>> 16;
			local78 &= 0xFFFF;
			local84 = Static152.aClass213_1.method4412(local101);
			if (local84 != null) {
				local72 = local84.method3068(local78) | false;
				local70 = local84.method3067(local78) | false;
				local76 = local84.method3070(local78) | false;
				local74 = arg7.aBoolean335 | false;
			}
			if ((arg7.aBoolean334 || Static240.aBoolean304) && arg6 != -1 && arg6 < arg7.anIntArray235.length) {
				local80 = arg7.anIntArray235[arg6];
				local82 = arg7.anIntArray234[arg2];
				@Pc(172) int local172 = local80 >>> 16;
				local80 &= 0xFFFF;
				if (local101 == local172) {
					local86 = local84;
				} else {
					local86 = Static152.aClass213_1.method4412(local80 >>> 16);
				}
				if (local86 != null) {
					local72 |= local86.method3068(local80);
					local70 |= local86.method3067(local80);
					local76 |= local86.method3070(local80);
				}
			}
			if (local72) {
				local9 = 2208;
			}
			if (local70) {
				local9 |= 0x100;
			}
			if (local74) {
				local9 |= 0x200;
			}
			if (local76) {
				local9 |= 0x400;
			}
		}
		@Pc(257) long local257 = this.method2336(arg1, arg4 == null ? null : arg4.anIntArray51, local23, arg0);
		if (Static350.aClass167_83 != null) {
			local7 = (Class33) Static350.aClass167_83.method3386(local257);
		}
		if (local7 == null || arg3.method3605(local7.n(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method3554(local9, local7.n());
			}
			@Pc(283) int local283 = local9;
			@Pc(285) boolean local285 = false;
			for (@Pc(287) int local287 = 0; local287 < local23.length; local287++) {
				if (local23[local287] != -1 && !Static227.aClass65_2.method1327(local23[local287]).method1505(arg0)) {
					local285 = true;
				}
			}
			if (local285) {
				return null;
			}
			@Pc(324) Class199[] local324 = new Class199[local23.length];
			for (@Pc(326) int local326 = 0; local326 < local23.length; local326++) {
				if (local23[local326] != -1) {
					local324[local326] = Static227.aClass65_2.method1327(local23[local326]).method1496(arg0);
				}
			}
			@Pc(384) int local384;
			if (local11 != null && local11.anIntArrayArray34 != null) {
				for (@Pc(364) int local364 = 0; local364 < local11.anIntArrayArray34.length; local364++) {
					if (local11.anIntArrayArray34[local364] != null && local324[local364] != null) {
						local384 = local11.anIntArrayArray34[local364][0];
						@Pc(391) int local391 = local11.anIntArrayArray34[local364][1];
						@Pc(398) int local398 = local11.anIntArrayArray34[local364][2];
						@Pc(405) int local405 = local11.anIntArrayArray34[local364][3];
						@Pc(412) int local412 = local11.anIntArrayArray34[local364][4];
						@Pc(419) int local419 = local11.anIntArrayArray34[local364][5];
						if (local405 != 0 || local412 != 0 || local419 != 0) {
							local324[local364].method4140(local412, local405, local419);
						}
						if (local384 != 0 || local391 != 0 || local398 != 0) {
							local324[local364].method4134(local384, local398, local391);
						}
					}
				}
			}
			if (arg4 != null) {
				local283 = local9 | 0x4000;
			}
			@Pc(482) Class199 local482 = new Class199(local324, local324.length);
			local7 = arg3.method3602(local482, local283, Static382.anInt6349, 64, 850);
			if (arg4 != null) {
				for (local384 = 0; local384 < 5; local384++) {
					if (arg4.anIntArray51[local384] < Static101.aShortArrayArray30[local384].length) {
						local7.N(Static250.aShortArray15[local384], Static101.aShortArrayArray30[local384][arg4.anIntArray51[local384]]);
					}
					if (arg4.anIntArray51[local384] < Static126.aShortArrayArray12[local384].length) {
						local7.N(Static356.aShortArray73[local384], Static126.aShortArrayArray12[local384][arg4.anIntArray51[local384]]);
					}
				}
			}
			if (Static350.aClass167_83 != null) {
				local7.u(local9);
				Static350.aClass167_83.method3392(local7, local257);
			}
		}
		if (arg7 == null || local84 == null) {
			return local7;
		} else {
			@Pc(571) Class33 local571 = local7.method5383((byte) 1, local9, true);
			local571.method5392(local84, 0, arg7.aBoolean335, arg5 - 1, local82, local86, local78, local80);
			return local571;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[II[IZ)J")
	private long method2336(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class5_Sub1_Sub1.aLongArray9;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg0 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg0 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg2.length; local46++) {
			local9 = local7[(int) ((local9 ^ (long) (arg2[local46] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg2[local46] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg2[local46] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) arg2[local46]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local9 = local7[(int) (((long) arg1[local127] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg3 ? 1 : 0) ^ local9) & 0xFFL)];
	}
}
