import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class4_Sub44 extends Class4 {

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "[I")
	public int[] anIntArray502 = new int[] { -1 };

	@OriginalMember(owner = "client!vp", name = "v", descriptor = "[I")
	public int[] anIntArray503 = new int[1];

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z[I[III)J")
	private long method5480(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class4_Sub4_Sub6.aLongArray3;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg3 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) ((local25 ^ (long) arg3) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) arg1[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
				local9 = local7[(int) ((local9 ^ (long) arg2[local126]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIIILclient!b;Lclient!vq;ILclient!cn;Z)Lclient!ni;")
	public Class38 method5481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class14 arg4, @OriginalArg(6) Class47 arg5, @OriginalArg(8) Class33 arg6, @OriginalArg(9) boolean arg7) {
		@Pc(7) Class38 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class40 local11 = null;
		if (arg0 != -1) {
			local11 = Static343.method5478(arg0);
		}
		@Pc(22) int[] local22 = this.anIntArray502;
		if (local11 != null && local11.anIntArray90 != null) {
			local22 = new int[local11.anIntArray90.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray90.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray90[local34];
				if (local41 >= 0 && this.anIntArray502.length > local41) {
					local22[local34] = this.anIntArray502[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = 0;
		@Pc(88) Class4_Sub4_Sub15 local88 = null;
		@Pc(90) Class4_Sub4_Sub15 local90 = null;
		if (arg4 != null) {
			local9 = 1056;
			local82 = arg4.anIntArray12[arg1];
			@Pc(105) int local105 = local82 >>> 16;
			local88 = Static287.method3916(local105);
			local82 &= 0xFFFF;
			if (local88 != null) {
				local78 = local88.method4670(local82) | false;
				local76 = local88.method4673(local82) | false;
				local80 = arg4.aBoolean29 | false;
			}
			if ((arg4.aBoolean30 || Static246.aBoolean378) && arg2 != -1 && arg2 < arg4.anIntArray12.length) {
				local86 = arg4.anIntArray11[arg1];
				local84 = arg4.anIntArray12[arg2];
				@Pc(163) int local163 = local84 >>> 16;
				local84 &= 0xFFFF;
				if (local163 == local105) {
					local90 = local88;
				} else {
					local90 = Static287.method3916(local84 >>> 16);
				}
				if (local90 != null) {
					local78 |= local90.method4670(local84);
					local76 |= local90.method4673(local84);
				}
			}
			if (local78) {
				local9 = 1184;
			}
			if (local76) {
				local9 |= 0x100;
			}
			if (local80) {
				local9 |= 0x200;
			}
		}
		@Pc(228) long local228 = this.method5480(arg7, local22, arg6 == null ? null : arg6.anIntArray56, arg0);
		if (Static108.aClass198_91 != null) {
			local7 = (Class38) Static108.aClass198_91.method5210(local228);
		}
		if (local7 == null || arg5.method2695(local7.method1898(), local9) != 0) {
			if (local7 != null) {
				local9 = arg5.method2742(local9, local7.method1898());
			}
			@Pc(257) int local257 = local9;
			@Pc(259) boolean local259 = false;
			for (@Pc(261) int local261 = 0; local261 < local22.length; local261++) {
				if (local22[local261] != -1 && !Static177.method3465(local22[local261]).method5452(arg7)) {
					local259 = true;
				}
			}
			if (local259) {
				return null;
			}
			@Pc(292) Class165[] local292 = new Class165[local22.length];
			for (@Pc(294) int local294 = 0; local294 < local22.length; local294++) {
				if (local22[local294] != -1) {
					local292[local294] = Static177.method3465(local22[local294]).method5465(arg7);
				}
			}
			@Pc(344) int local344;
			if (local11 != null && local11.anIntArrayArray33 != null) {
				for (@Pc(324) int local324 = 0; local324 < local11.anIntArrayArray33.length; local324++) {
					if (local11.anIntArrayArray33[local324] != null && local292[local324] != null) {
						local344 = local11.anIntArrayArray33[local324][0];
						@Pc(351) int local351 = local11.anIntArrayArray33[local324][1];
						@Pc(358) int local358 = local11.anIntArrayArray33[local324][2];
						@Pc(365) int local365 = local11.anIntArrayArray33[local324][3];
						@Pc(372) int local372 = local11.anIntArrayArray33[local324][4];
						@Pc(379) int local379 = local11.anIntArrayArray33[local324][5];
						if (local365 != 0 || local372 != 0 || local379 != 0) {
							local292[local324].method4483(local365, local379, local372);
						}
						if (local344 != 0 || local351 != 0 || local358 != 0) {
							local292[local324].method4479(local351, local358, local344);
						}
					}
				}
			}
			@Pc(438) Class165 local438 = new Class165(local292, local292.length);
			if (arg6 != null) {
				local257 = local9 | 0x2000;
			}
			local7 = arg5.method2717(local438, local257, Static258.anInt5197, 64, 850);
			if (arg6 != null) {
				for (local344 = 0; local344 < 5; local344++) {
					if (Static106.aShortArrayArray5[local344].length > arg6.anIntArray56[local344]) {
						local7.method1886(Static155.aShortArray46[local344], Static106.aShortArrayArray5[local344][arg6.anIntArray56[local344]]);
					}
					if (Static62.aShortArrayArray1[local344].length > arg6.anIntArray56[local344]) {
						local7.method1886(Static139.aShortArray45[local344], Static62.aShortArrayArray1[local344][arg6.anIntArray56[local344]]);
					}
				}
			}
			if (Static108.aClass198_91 != null) {
				local7.method1890(local9);
				Static108.aClass198_91.method5201(local7, local228);
			}
		}
		if (arg4 == null || local88 == null) {
			return local7;
		} else {
			@Pc(532) Class38 local532 = local7.method1915((byte) 1, local9, true);
			local532.method1887(0, local84, local88, local90, local86, arg3 - 1, arg4.aBoolean29, local82);
			return local532;
		}
	}
}
