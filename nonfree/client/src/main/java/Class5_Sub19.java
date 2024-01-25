import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class5_Sub19 extends Class5 {

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "[I")
	public int[] anIntArray135 = new int[] { -1 };

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "[I")
	public int[] anIntArray134 = new int[1];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIZLclient!en;Lclient!bb;Lclient!eq;IIBI)Lclient!mj;")
	public Class101 method2149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(4) Class17 arg4, @OriginalArg(5) Class61 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7) {
		@Pc(13) Class101 local13 = null;
		@Pc(15) int local15 = 1024;
		@Pc(17) Class33 local17 = null;
		if (arg0 != -1) {
			local17 = Static104.method2066(arg0);
		}
		@Pc(27) int[] local27 = this.anIntArray135;
		if (local17 != null && local17.anIntArray48 != null) {
			local27 = new int[local17.anIntArray48.length];
			for (@Pc(39) int local39 = 0; local39 < local17.anIntArray48.length; local39++) {
				@Pc(46) int local46 = local17.anIntArray48[local39];
				if (local46 >= 0 && this.anIntArray135.length > local46) {
					local27[local39] = this.anIntArray135[local46];
				} else {
					local27[local39] = -1;
				}
			}
		}
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) int local80 = -1;
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = 0;
		@Pc(86) Class5_Sub9_Sub11 local86 = null;
		@Pc(88) Class5_Sub9_Sub11 local88 = null;
		if (arg4 != null) {
			local15 = 1056;
			local80 = arg4.anIntArray24[arg1];
			@Pc(103) int local103 = local80 >>> 16;
			local86 = Static12.method396(local103);
			local80 &= 0xFFFF;
			if (local86 != null) {
				local76 = local86.method2616(local80) | false;
				local74 = local86.method2610(local80) | false;
				local78 = arg4.aBoolean35 | false;
			}
			if ((arg4.aBoolean34 || Static353.aBoolean489) && arg6 != -1 && arg6 < arg4.anIntArray24.length) {
				local82 = arg4.anIntArray24[arg6];
				local84 = arg4.anIntArray26[arg1];
				@Pc(160) int local160 = local82 >>> 16;
				local82 &= 0xFFFF;
				if (local160 == local103) {
					local88 = local86;
				} else {
					local88 = Static12.method396(local82 >>> 16);
				}
				if (local88 != null) {
					local76 |= local88.method2616(local82);
					local74 |= local88.method2610(local82);
				}
			}
			if (local76) {
				local15 = 1184;
			}
			if (local74) {
				local15 |= 0x100;
			}
			if (local78) {
				local15 |= 0x200;
			}
		}
		@Pc(227) long local227 = this.method2150(local27, arg0, arg2, arg5 == null ? null : arg5.anIntArray101);
		if (Static42.aClass66_13 != null) {
			local13 = (Class101) Static42.aClass66_13.method1939(local227);
		}
		if (local13 == null || arg3.method4792(local13.method5171(), local15) != 0) {
			if (local13 != null) {
				local15 = arg3.method4843(local15, local13.method5171());
			}
			@Pc(253) int local253 = local15;
			@Pc(255) boolean local255 = false;
			for (@Pc(257) int local257 = 0; local257 < local27.length; local257++) {
				if (local27[local257] != -1 && !Static88.method1382(local27[local257]).method4416(arg2)) {
					local255 = true;
				}
			}
			if (local255) {
				return null;
			}
			@Pc(292) Class150[] local292 = new Class150[local27.length];
			for (@Pc(294) int local294 = 0; local294 < local27.length; local294++) {
				if (local27[local294] != -1) {
					local292[local294] = Static88.method1382(local27[local294]).method4429(arg2);
				}
			}
			@Pc(344) int local344;
			if (local17 != null && local17.anIntArrayArray5 != null) {
				for (@Pc(324) int local324 = 0; local324 < local17.anIntArrayArray5.length; local324++) {
					if (local17.anIntArrayArray5[local324] != null && local292[local324] != null) {
						local344 = local17.anIntArrayArray5[local324][0];
						@Pc(351) int local351 = local17.anIntArrayArray5[local324][1];
						@Pc(358) int local358 = local17.anIntArrayArray5[local324][2];
						@Pc(365) int local365 = local17.anIntArrayArray5[local324][3];
						@Pc(372) int local372 = local17.anIntArrayArray5[local324][4];
						@Pc(379) int local379 = local17.anIntArrayArray5[local324][5];
						if (local365 != 0 || local372 != 0 || local379 != 0) {
							local292[local324].method3969(local372, local365, local379);
						}
						if (local344 != 0 || local351 != 0 || local358 != 0) {
							local292[local324].method3973(local344, local351, local358);
						}
					}
				}
			}
			if (arg5 != null) {
				local253 = local15 | 0x2000;
			}
			@Pc(445) Class150 local445 = new Class150(local292, local292.length);
			local13 = arg3.method4804(local445, local253, Static193.anInt3823, 64, 850);
			if (arg5 != null) {
				for (local344 = 0; local344 < 5; local344++) {
					if (Static165.aShortArrayArray9[local344].length > arg5.anIntArray101[local344]) {
						local13.method5159(Static202.aShortArray47[local344], Static165.aShortArrayArray9[local344][arg5.anIntArray101[local344]]);
					}
					if (Static336.aShortArrayArray13[local344].length > arg5.anIntArray101[local344]) {
						local13.method5159(Static306.aShortArray99[local344], Static336.aShortArrayArray13[local344][arg5.anIntArray101[local344]]);
					}
				}
			}
			if (Static42.aClass66_13 != null) {
				local13.method5145(local15);
				Static42.aClass66_13.method1936(local227, local13);
			}
		}
		if (arg4 == null || local86 == null) {
			return local13;
		} else {
			@Pc(533) Class101 local533 = local13.method5184((byte) 1, local15, true);
			local533.method5146(local84, local82, local80, arg4.aBoolean35, local86, arg7 - 1, 0, local88);
			return local533;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[IIZ[I)J")
	private long method2150(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class42.aLongArray1;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg1 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) ((local25 ^ (long) arg1) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(55) int local55 = 0; local55 < arg0.length; local55++) {
			local9 = local7[(int) ((local9 ^ (long) (arg0[local55] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0[local55] >> 16)) & 0xFFL)];
			local9 = local7[(int) (((long) (arg0[local55] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg0[local55] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(140) int local140 = 0; local140 < 5; local140++) {
				local9 = local7[(int) ((local9 ^ (long) arg3[local140]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}
}
