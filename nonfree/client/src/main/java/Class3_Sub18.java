import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
	public int[] anIntArray226 = new int[] { -1 };

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "[I")
	public int[] anIntArray227 = new int[1];

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([IZ[III)J")
	private long method1917(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		@Pc(12) long[] local12 = Class3_Sub1_Sub11.aLongArray3;
		@Pc(14) long local14 = -1L;
		@Pc(30) long local30 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg3 >> 8)) & 0xFFL)];
		local14 = local12[(int) ((local30 ^ (long) arg3) & 0xFFL)] ^ local30 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg0.length; local46++) {
			local14 = local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg0[local46] >> 24)) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg0[local46] >> 16) ^ local14) & 0xFFL)];
			local14 = local14 >>> 8 ^ local12[(int) (((long) (arg0[local46] >> 8) ^ local14) & 0xFFL)];
			local14 = local12[(int) ((local14 ^ (long) arg0[local46]) & 0xFFL)] ^ local14 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(127) int local127 = 0; local127 < 5; local127++) {
				local14 = local14 >>> 8 ^ local12[(int) (((long) arg2[local127] ^ local14) & 0xFFL)];
			}
		}
		return local14 >>> 8 ^ local12[(int) ((local14 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BILclient!np;IILclient!cu;ILclient!ok;IZ)Lclient!f;")
	public Class75 method1918(@OriginalArg(2) Class155 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class49 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class177 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) boolean arg7) {
		@Pc(13) Class75 local13 = null;
		@Pc(15) int local15 = 1024;
		@Pc(17) Class36 local17 = null;
		if (arg1 != -1) {
			local17 = Static79.aClass124_1.method2628(arg1);
		}
		@Pc(28) int[] local28 = this.anIntArray226;
		if (local17 != null && local17.anIntArray64 != null) {
			local28 = new int[local17.anIntArray64.length];
			for (@Pc(40) int local40 = 0; local40 < local17.anIntArray64.length; local40++) {
				@Pc(47) int local47 = local17.anIntArray64[local40];
				if (local47 >= 0 && local47 < this.anIntArray226.length) {
					local28[local40] = this.anIntArray226[local47];
				} else {
					local28[local40] = -1;
				}
			}
		}
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = 0;
		@Pc(94) Class3_Sub7_Sub15 local94 = null;
		@Pc(96) Class3_Sub7_Sub15 local96 = null;
		if (arg5 != null) {
			local88 = arg5.anIntArray499[arg2];
			local15 = 1056;
			@Pc(111) int local111 = local88 >>> 16;
			local94 = Static176.aClass43_2.method931(local111);
			local88 &= 0xFFFF;
			if (local94 != null) {
				local84 = local94.method5583(local88) | false;
				local82 = local94.method5582(local88) | false;
				local86 = arg5.aBoolean352 | false;
			}
			if ((arg5.aBoolean351 || Static120.aBoolean173) && arg6 != -1 && arg5.anIntArray499.length > arg6) {
				local90 = arg5.anIntArray499[arg6];
				local92 = arg5.anIntArray501[arg2];
				@Pc(169) int local169 = local90 >>> 16;
				local90 &= 0xFFFF;
				if (local169 == local111) {
					local96 = local94;
				} else {
					local96 = Static176.aClass43_2.method931(local90 >>> 16);
				}
				if (local96 != null) {
					local84 |= local96.method5583(local90);
					local82 |= local96.method5582(local90);
				}
			}
			if (local84) {
				local15 = 1184;
			}
			if (local82) {
				local15 |= 0x100;
			}
			if (local86) {
				local15 |= 0x200;
			}
		}
		@Pc(233) long local233 = this.method1917(local28, arg7, arg3 == null ? null : arg3.anIntArray99, arg1);
		if (Static295.aClass139_62 != null) {
			local13 = (Class75) Static295.aClass139_62.method3076(local233);
		}
		if (local13 == null || arg0.method4919(local13.method5462(), local15) != 0) {
			if (local13 != null) {
				local15 = arg0.method4920(local15, local13.method5462());
			}
			@Pc(259) int local259 = local15;
			@Pc(261) boolean local261 = false;
			for (@Pc(263) int local263 = 0; local263 < local28.length; local263++) {
				if (local28[local263] != -1 && !Static176.aClass78_3.method1641(local28[local263]).method1019(arg7)) {
					local261 = true;
				}
			}
			if (local261) {
				return null;
			}
			@Pc(296) Class239[] local296 = new Class239[local28.length];
			for (@Pc(298) int local298 = 0; local298 < local28.length; local298++) {
				if (local28[local298] != -1) {
					local296[local298] = Static176.aClass78_3.method1641(local28[local298]).method1022(arg7);
				}
			}
			@Pc(350) int local350;
			if (local17 != null && local17.anIntArrayArray6 != null) {
				for (@Pc(330) int local330 = 0; local330 < local17.anIntArrayArray6.length; local330++) {
					if (local17.anIntArrayArray6[local330] != null && local296[local330] != null) {
						local350 = local17.anIntArrayArray6[local330][0];
						@Pc(357) int local357 = local17.anIntArrayArray6[local330][1];
						@Pc(364) int local364 = local17.anIntArrayArray6[local330][2];
						@Pc(371) int local371 = local17.anIntArrayArray6[local330][3];
						@Pc(378) int local378 = local17.anIntArrayArray6[local330][4];
						@Pc(385) int local385 = local17.anIntArrayArray6[local330][5];
						if (local371 != 0 || local378 != 0 || local385 != 0) {
							local296[local330].method5559(local371, local378, local385);
						}
						if (local350 != 0 || local357 != 0 || local364 != 0) {
							local296[local330].method5564(local357, local350, local364);
						}
					}
				}
			}
			if (arg3 != null) {
				local259 = local15 | 0x2000;
			}
			@Pc(441) Class239 local441 = new Class239(local296, local296.length);
			local13 = arg0.method4930(local441, local259, Static118.anInt2254, 64, 850);
			if (arg3 != null) {
				for (local350 = 0; local350 < 5; local350++) {
					if (Static38.aShortArrayArray2[local350].length > arg3.anIntArray99[local350]) {
						local13.method5484(Static100.aShortArray40[local350], Static38.aShortArrayArray2[local350][arg3.anIntArray99[local350]]);
					}
					if (arg3.anIntArray99[local350] < Static183.aShortArrayArray3[local350].length) {
						local13.method5484(Static191.aShortArray61[local350], Static183.aShortArrayArray3[local350][arg3.anIntArray99[local350]]);
					}
				}
			}
			if (Static295.aClass139_62 != null) {
				local13.method5479(local15);
				Static295.aClass139_62.method3070(local13, local233);
			}
		}
		if (arg5 == null || local94 == null) {
			return local13;
		} else {
			@Pc(529) Class75 local529 = local13.method5473((byte) 1, local15, true);
			local529.method5489(local88, local94, local92, 0, arg4 - 1, arg5.aBoolean352, local90, local96);
			return local529;
		}
	}
}
