import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!js", name = "o", descriptor = "[I")
	public int[] anIntArray328 = new int[] { -1 };

	@OriginalMember(owner = "client!js", name = "q", descriptor = "[I")
	public int[] anIntArray329 = new int[1];

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([IZI[IB)J")
	private long method4561(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(5) long[] local5 = Class64.aLongArray3;
		@Pc(7) long local7 = -1L;
		@Pc(23) long local23 = local7 >>> 8 ^ local5[(int) (((long) (arg2 >> 8) ^ local7) & 0xFFL)];
		local7 = local23 >>> 8 ^ local5[(int) ((local23 ^ (long) arg2) & 0xFFL)];
		for (@Pc(44) int local44 = 0; local44 < arg3.length; local44++) {
			local7 = local7 >>> 8 ^ local5[(int) (((long) (arg3[local44] >> 24) ^ local7) & 0xFFL)];
			local7 = local5[(int) (((long) (arg3[local44] >> 16) ^ local7) & 0xFFL)] ^ local7 >>> 8;
			local7 = local5[(int) (((long) (arg3[local44] >> 8) ^ local7) & 0xFFL)] ^ local7 >>> 8;
			local7 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) arg3[local44]) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(124) int local124 = 0; local124 < 5; local124++) {
				local7 = local5[(int) ((local7 ^ (long) arg0[local124]) & 0xFFL)] ^ local7 >>> 8;
			}
		}
		return local5[(int) ((local7 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ local7 >>> 8;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IBLclient!oa;IILclient!to;ZLclient!jq;II)Lclient!ba;")
	public Class21 method4562(@OriginalArg(0) int arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class314 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class174 arg6, @OriginalArg(9) int arg7) {
		@Pc(5) Class21 local5 = null;
		@Pc(7) int local7 = 2048;
		@Pc(9) Class171 local9 = null;
		if (arg0 != -1) {
			local9 = Static144.aClass188_1.method4910(arg0);
		}
		@Pc(20) int[] local20 = this.anIntArray328;
		if (local9 != null && local9.anIntArray311 != null) {
			local20 = new int[local9.anIntArray311.length];
			for (@Pc(32) int local32 = 0; local32 < local9.anIntArray311.length; local32++) {
				@Pc(38) int local38 = local9.anIntArray311[local32];
				if (local38 >= 0 && local38 < this.anIntArray328.length) {
					local20[local32] = this.anIntArray328[local38];
				} else {
					local20[local32] = -1;
				}
			}
		}
		@Pc(68) boolean local68 = false;
		@Pc(70) boolean local70 = false;
		@Pc(72) boolean local72 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = 0;
		@Pc(90) Class3_Sub4_Sub12 local90 = null;
		@Pc(92) Class3_Sub4_Sub12 local92 = null;
		if (arg6 != null) {
			local84 = arg6.anIntArray326[arg2];
			local7 = 2080;
			@Pc(107) int local107 = local84 >>> 16;
			local90 = Static532.aClass157_2.method3737(local107);
			local84 &= 0xFFFF;
			if (local90 != null) {
				local70 = local90.method2964(local84) | false;
				local68 = local90.method2966(local84) | false;
				local82 = local90.method2965(local84) | false;
				local72 = arg6.aBoolean468 | false;
			}
			if ((arg6.aBoolean471 || Static4.aBoolean20) && arg7 != -1 && arg6.anIntArray326.length > arg7) {
				local86 = arg6.anIntArray326[arg7];
				local88 = arg6.anIntArray325[arg2];
				@Pc(172) int local172 = local86 >>> 16;
				local86 &= 0xFFFF;
				if (local172 == local107) {
					local92 = local90;
				} else {
					local92 = Static532.aClass157_2.method3737(local86 >>> 16);
				}
				if (local92 != null) {
					local70 |= local92.method2964(local86);
					local68 |= local92.method2966(local86);
					local82 |= local92.method2965(local86);
				}
			}
			if (local70) {
				local7 = 2208;
			}
			if (local68) {
				local7 |= 0x100;
			}
			if (local72) {
				local7 |= 0x200;
			}
			if (local82) {
				local7 |= 0x400;
			}
		}
		@Pc(249) long local249 = this.method4561(arg4 == null ? null : arg4.anIntArray615, arg5, arg0, local20);
		if (Static183.aClass211_23 != null) {
			local5 = (Class21) Static183.aClass211_23.method5534(local249);
		}
		if (local5 == null || arg1.method5321(local5.h(), local7) != 0) {
			if (local5 != null) {
				local7 = arg1.method5315(local7, local5.h());
			}
			@Pc(275) int local275 = local7;
			@Pc(277) boolean local277 = false;
			for (@Pc(279) int local279 = 0; local279 < local20.length; local279++) {
				if (local20[local279] != -1 && !Static517.aClass23_2.method901(local20[local279]).method766(arg5)) {
					local277 = true;
				}
			}
			if (local277) {
				return null;
			}
			@Pc(310) Class96[] local310 = new Class96[local20.length];
			for (@Pc(312) int local312 = 0; local312 < local20.length; local312++) {
				if (local20[local312] != -1) {
					local310[local312] = Static517.aClass23_2.method901(local20[local312]).method770(arg5);
				}
			}
			@Pc(360) int local360;
			@Pc(367) int local367;
			if (local9 != null && local9.anIntArrayArray39 != null) {
				for (@Pc(342) int local342 = 0; local342 < local9.anIntArrayArray39.length; local342++) {
					if (local9.anIntArrayArray39[local342] != null && local310[local342] != null) {
						local360 = local9.anIntArrayArray39[local342][0];
						local367 = local9.anIntArrayArray39[local342][1];
						@Pc(374) int local374 = local9.anIntArrayArray39[local342][2];
						@Pc(381) int local381 = local9.anIntArrayArray39[local342][3];
						@Pc(388) int local388 = local9.anIntArrayArray39[local342][4];
						@Pc(395) int local395 = local9.anIntArrayArray39[local342][5];
						if (local381 != 0 || local388 != 0 || local395 != 0) {
							local310[local342].method2790(local388, local395, local381);
						}
						if (local360 != 0 || local367 != 0 || local374 != 0) {
							local310[local342].method2777(local360, local374, local367);
						}
					}
				}
			}
			if (arg4 != null) {
				local275 = local7 | 0x4000;
			}
			@Pc(451) Class96 local451 = new Class96(local310, local310.length);
			local5 = arg1.method5352(local451, local275, Static118.anInt9299, 64, 850);
			if (arg4 != null) {
				for (local360 = 0; local360 < 5; local360++) {
					for (local367 = 0; local367 < Static152.aShortArrayArrayArray1.length; local367++) {
						if (Static152.aShortArrayArrayArray1[local367][local360].length > arg4.anIntArray615[local360]) {
							local5.UA(Static545.aShortArrayArray12[local367][local360], Static152.aShortArrayArrayArray1[local367][local360][arg4.anIntArray615[local360]]);
						}
					}
				}
			}
			if (Static183.aClass211_23 != null) {
				local5.ia(local7);
				Static183.aClass211_23.method5529(local249, local5);
			}
		}
		if (arg6 == null || local90 == null) {
			return local5;
		} else {
			@Pc(530) Class21 local530 = local5.method7131((byte) 1, local7, true);
			local530.method7132(arg6.aBoolean468, local92, local86, arg3 - 1, local84, 0, local90, local88);
			return local530;
		}
	}
}
