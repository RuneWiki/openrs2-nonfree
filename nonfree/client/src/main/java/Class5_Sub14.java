import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class5_Sub14 extends Class5 {

	@OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
	public int[] anIntArray128 = new int[1];

	@OriginalMember(owner = "client!f", name = "t", descriptor = "[I")
	public int[] anIntArray129 = new int[] { -1 };

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI[I[II)J")
	private long method1462(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class4_Sub3_Sub2.aLongArray7;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg3 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg3 ^ local25) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < arg2.length; local50++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg2[local50] >> 24) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) (arg2[local50] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local50] >> 8)) & 0xFFL)];
			local9 = local7[(int) (((long) arg2[local50] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(135) int local135 = 0; local135 < 5; local135++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local135] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg0 ? 1 : 0) ^ local9) & 0xFFL)];
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!cc;ZZIILclient!i;IILclient!ea;)Lclient!ts;")
	public Class112 method1464(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class89 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class55 arg7) {
		@Pc(7) Class112 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class88 local11 = null;
		if (arg6 != -1) {
			local11 = Static60.method1859(arg6);
		}
		@Pc(22) int[] local22 = this.anIntArray129;
		if (local11 != null && local11.anIntArray220 != null) {
			local22 = new int[local11.anIntArray220.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray220.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray220[local34];
				if (local41 >= 0 && this.anIntArray129.length > local41) {
					local22[local34] = this.anIntArray129[local41];
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
		@Pc(88) Class5_Sub1_Sub9 local88 = null;
		@Pc(90) Class5_Sub1_Sub9 local90 = null;
		if (arg4 != null) {
			local9 = 1056;
			local82 = arg4.anIntArray245[arg5];
			@Pc(105) int local105 = local82 >>> 16;
			local82 &= 0xFFFF;
			local88 = Static207.method3801(local105);
			if (local88 != null) {
				local78 = local88.method2462(local82) | false;
				local76 = local88.method2461(local82) | false;
				local80 = arg4.aBoolean184 | false;
			}
			if ((arg4.aBoolean185 || Static85.aBoolean108) && arg0 != -1 && arg4.anIntArray245.length > arg0) {
				local84 = arg4.anIntArray245[arg0];
				local86 = arg4.anIntArray244[arg5];
				@Pc(161) int local161 = local84 >>> 16;
				local84 &= 0xFFFF;
				if (local161 == local105) {
					local90 = local88;
				} else {
					local90 = Static207.method3801(local84 >>> 16);
				}
				if (local90 != null) {
					local78 |= local90.method2462(local84);
					local76 |= local90.method2461(local84);
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
		@Pc(224) long local224 = this.method1462(arg2, arg1 == null ? null : arg1.anIntArray73, local22, arg6);
		if (Static238.aClass109_47 != null) {
			local7 = (Class112) Static238.aClass109_47.method2857(local224);
		}
		if (local7 == null || arg7.method5181(local7.method4308(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method5165(local9, local7.method4308());
			}
			@Pc(250) int local250 = local9;
			@Pc(252) boolean local252 = false;
			for (@Pc(254) int local254 = 0; local254 < local22.length; local254++) {
				if (local22[local254] != -1 && !Static322.method544(local22[local254]).method3447(arg2)) {
					local252 = true;
				}
			}
			if (local252) {
				return null;
			}
			@Pc(285) Class177[] local285 = new Class177[local22.length];
			for (@Pc(287) int local287 = 0; local287 < local22.length; local287++) {
				if (local22[local287] != -1) {
					local285[local287] = Static322.method544(local22[local287]).method3454(arg2);
				}
			}
			@Pc(341) int local341;
			if (local11 != null && local11.anIntArrayArray41 != null) {
				for (@Pc(321) int local321 = 0; local321 < local11.anIntArrayArray41.length; local321++) {
					if (local11.anIntArrayArray41[local321] != null && local285[local321] != null) {
						local341 = local11.anIntArrayArray41[local321][0];
						@Pc(348) int local348 = local11.anIntArrayArray41[local321][1];
						@Pc(355) int local355 = local11.anIntArrayArray41[local321][2];
						@Pc(362) int local362 = local11.anIntArrayArray41[local321][3];
						@Pc(369) int local369 = local11.anIntArrayArray41[local321][4];
						@Pc(376) int local376 = local11.anIntArrayArray41[local321][5];
						if (local362 != 0 || local369 != 0 || local376 != 0) {
							local285[local321].method4848(local369, local362, local376);
						}
						if (local341 != 0 || local348 != 0 || local355 != 0) {
							local285[local321].method4854(local341, local355, local348);
						}
					}
				}
			}
			@Pc(430) Class177 local430 = new Class177(local285, local285.length);
			if (arg1 != null) {
				local250 = local9 | 0x2000;
			}
			local7 = arg7.method5201(local430, local250, Static166.anInt3323, 64, 850);
			if (arg1 != null) {
				for (local341 = 0; local341 < 5; local341++) {
					if (Static352.aShortArrayArray7[local341].length > arg1.anIntArray73[local341]) {
						local7.method4351(Static47.aShortArray8[local341], Static352.aShortArrayArray7[local341][arg1.anIntArray73[local341]]);
					}
					if (Static96.aShortArrayArray3[local341].length > arg1.anIntArray73[local341]) {
						local7.method4351(Static274.aShortArray92[local341], Static96.aShortArrayArray3[local341][arg1.anIntArray73[local341]]);
					}
				}
			}
			if (Static238.aClass109_47 != null) {
				local7.method4339(local9);
				Static238.aClass109_47.method2855(local224, local7);
			}
		}
		if (arg4 == null || local88 == null) {
			return local7;
		} else {
			@Pc(520) Class112 local520 = local7.method4349((byte) 1, local9, true);
			local520.method4333(local86, arg4.aBoolean184, local82, local84, local88, local90, 0, arg3 - 1);
			return local520;
		}
	}
}
