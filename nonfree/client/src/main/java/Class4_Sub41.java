import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class4_Sub41 extends Class4 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
	public int[] anIntArray537 = new int[1];

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "[I")
	public int[] anIntArray538 = new int[] { -1 };

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIZ[II)J")
	private long method5596(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class143.aLongArray4;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local7[(int) ((local14 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ local14 >>> 8;
		local14 = local7[(int) (((long) arg3 ^ local30) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg2.length; local46++) {
			local14 = local7[(int) (((long) (arg2[local46] >> 24) ^ local14) & 0xFFL)] ^ local14 >>> 8;
			local14 = local14 >>> 8 ^ local7[(int) ((local14 ^ (long) (arg2[local46] >> 16)) & 0xFFL)];
			local14 = local14 >>> 8 ^ local7[(int) ((local14 ^ (long) (arg2[local46] >> 8)) & 0xFFL)];
			local14 = local14 >>> 8 ^ local7[(int) (((long) arg2[local46] ^ local14) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local7[(int) ((local14 ^ (long) arg0[local127]) & 0xFFL)] ^ local14 >>> 8;
			}
		}
		return local7[(int) ((local14 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ local14 >>> 8;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!ol;IZBLclient!vm;ILclient!lb;)Lclient!jn;")
	public Class5 method5598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class148 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(7) Class92 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class116 arg7) {
		@Pc(7) Class5 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class10 local11 = null;
		if (arg1 != -1) {
			local11 = Static354.method4067(arg1);
		}
		@Pc(21) int[] local21 = this.anIntArray538;
		if (local11 != null && local11.anIntArray44 != null) {
			local21 = new int[local11.anIntArray44.length];
			for (@Pc(33) int local33 = 0; local33 < local11.anIntArray44.length; local33++) {
				@Pc(40) int local40 = local11.anIntArray44[local33];
				if (local40 >= 0 && local40 < this.anIntArray538.length) {
					local21[local33] = this.anIntArray538[local40];
				} else {
					local21[local33] = -1;
				}
			}
		}
		@Pc(72) boolean local72 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = 0;
		@Pc(90) Class4_Sub1_Sub16 local90 = null;
		@Pc(92) Class4_Sub1_Sub16 local92 = null;
		if (arg7 != null) {
			local9 = 1056;
			local84 = arg7.anIntArray330[arg0];
			@Pc(107) int local107 = local84 >>> 16;
			local84 &= 0xFFFF;
			local90 = Static194.method3524(local107);
			if (local90 != null) {
				local80 = local90.method3937(local84) | false;
				local72 = local90.method3938(local84) | false;
				local82 = arg7.aBoolean311 | false;
			}
			if ((arg7.aBoolean310 || Static199.aBoolean564) && arg6 != -1 && arg7.anIntArray330.length > arg6) {
				local86 = arg7.anIntArray330[arg6];
				local88 = arg7.anIntArray329[arg0];
				@Pc(163) int local163 = local86 >>> 16;
				local86 &= 0xFFFF;
				if (local107 == local163) {
					local92 = local90;
				} else {
					local92 = Static194.method3524(local86 >>> 16);
				}
				if (local92 != null) {
					local80 |= local92.method3937(local86);
					local72 |= local92.method3938(local86);
				}
			}
			if (local80) {
				local9 = 1184;
			}
			if (local72) {
				local9 |= 0x100;
			}
			if (local82) {
				local9 |= 0x200;
			}
		}
		@Pc(230) long local230 = this.method5596(arg2 == null ? null : arg2.anIntArray390, arg4, local21, arg1);
		if (Static110.aClass154_37 != null) {
			local7 = (Class5) Static110.aClass154_37.method4222(local230);
		}
		if (local7 == null || arg5.method4501(local7.method3992(), local9) != 0) {
			if (local7 != null) {
				local9 = arg5.method4477(local9, local7.method3992());
			}
			@Pc(259) int local259 = local9;
			@Pc(261) boolean local261 = false;
			for (@Pc(263) int local263 = 0; local263 < local21.length; local263++) {
				if (local21[local263] != -1 && !Static247.method4270(local21[local263]).method3736(arg4)) {
					local261 = true;
				}
			}
			if (local261) {
				return null;
			}
			@Pc(294) Class153[] local294 = new Class153[local21.length];
			for (@Pc(296) int local296 = 0; local296 < local21.length; local296++) {
				if (local21[local296] != -1) {
					local294[local296] = Static247.method4270(local21[local296]).method3725(arg4);
				}
			}
			@Pc(351) int local351;
			if (local11 != null && local11.anIntArrayArray6 != null) {
				for (@Pc(331) int local331 = 0; local331 < local11.anIntArrayArray6.length; local331++) {
					if (local11.anIntArrayArray6[local331] != null && local294[local331] != null) {
						local351 = local11.anIntArrayArray6[local331][0];
						@Pc(358) int local358 = local11.anIntArrayArray6[local331][1];
						@Pc(365) int local365 = local11.anIntArrayArray6[local331][2];
						@Pc(372) int local372 = local11.anIntArrayArray6[local331][3];
						@Pc(379) int local379 = local11.anIntArrayArray6[local331][4];
						@Pc(386) int local386 = local11.anIntArrayArray6[local331][5];
						if (local372 != 0 || local379 != 0 || local386 != 0) {
							local294[local331].method4166(local372, local386, local379);
						}
						if (local351 != 0 || local358 != 0 || local365 != 0) {
							local294[local331].method4162(local365, local358, local351);
						}
					}
				}
			}
			@Pc(436) Class153 local436 = new Class153(local294, local294.length);
			if (arg2 != null) {
				local259 = local9 | 0x2000;
			}
			local7 = arg5.method4513(local436, local259, Static241.anInt5033, 64, 850);
			if (arg2 != null) {
				for (local351 = 0; local351 < 5; local351++) {
					if (Static335.aShortArrayArray12[local351].length > arg2.anIntArray390[local351]) {
						local7.method4022(Static218.aShortArray72[local351], Static335.aShortArrayArray12[local351][arg2.anIntArray390[local351]]);
					}
					if (arg2.anIntArray390[local351] < Static101.aShortArrayArray8[local351].length) {
						local7.method4022(Static311.aShortArray112[local351], Static101.aShortArrayArray8[local351][arg2.anIntArray390[local351]]);
					}
				}
			}
			if (Static110.aClass154_37 != null) {
				local7.method3988(local9);
				Static110.aClass154_37.method4221(local230, local7);
			}
		}
		if (arg7 == null || local90 == null) {
			return local7;
		} else {
			@Pc(526) Class5 local526 = local7.method4018((byte) 1, local9, true);
			local526.method3993(local92, arg3 - 1, local90, 0, arg7.aBoolean311, local84, local88, local86);
			return local526;
		}
	}
}
