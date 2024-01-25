import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class6_Sub46 extends Class6 {

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "[I")
	public int[] anIntArray582 = new int[] { -1 };

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "[I")
	public int[] anIntArray583 = new int[1];

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!oa;Lclient!n;IIIBZILclient!ct;)Lclient!ba;")
	public Class24 method6589(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) Class63 arg7) {
		@Pc(7) Class24 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class154 local11 = null;
		if (arg4 != -1) {
			local11 = Static81.aClass12_1.method198(arg4);
		}
		@Pc(22) int[] local22 = this.anIntArray582;
		if (local11 != null && local11.anIntArray373 != null) {
			local22 = new int[local11.anIntArray373.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray373.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray373[local34];
				if (local41 >= 0 && local41 < this.anIntArray582.length) {
					local22[local34] = this.anIntArray582[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = -1;
		@Pc(88) int local88 = 0;
		@Pc(90) Class6_Sub5_Sub15 local90 = null;
		@Pc(98) Class6_Sub5_Sub15 local98 = null;
		if (arg7 != null) {
			local84 = arg7.anIntArray127[arg0];
			local9 = 2080;
			@Pc(113) int local113 = local84 >>> 16;
			local90 = Static388.aClass324_2.method7259(local113);
			local84 &= 0xFFFF;
			if (local90 != null) {
				local78 = local90.method6376(local84) | false;
				local76 = local90.method6375(local84) | false;
				local82 = local90.method6377(local84) | false;
				local80 = arg7.aBoolean104 | false;
			}
			if ((arg7.aBoolean103 || Static38.aBoolean50) && arg5 != -1 && arg5 < arg7.anIntArray127.length) {
				local88 = arg7.anIntArray128[arg0];
				local86 = arg7.anIntArray127[arg5];
				@Pc(182) int local182 = local86 >>> 16;
				local86 &= 0xFFFF;
				if (local113 == local182) {
					local98 = local90;
				} else {
					local98 = Static388.aClass324_2.method7259(local86 >>> 16);
				}
				if (local98 != null) {
					local78 |= local98.method6376(local86);
					local76 |= local98.method6375(local86);
					local82 |= local98.method6377(local86);
				}
			}
			if (local78) {
				local9 = 2208;
			}
			if (local76) {
				local9 |= 0x100;
			}
			if (local80) {
				local9 |= 0x200;
			}
			if (local82) {
				local9 |= 0x400;
			}
		}
		@Pc(263) long local263 = this.method6590(local22, arg2 == null ? null : arg2.anIntArray444, arg6, arg4);
		if (Static363.aClass330_41 != null) {
			local7 = (Class24) Static363.aClass330_41.method7677(local263);
		}
		if (local7 == null || arg1.method7505(local7.h(), local9) != 0) {
			if (local7 != null) {
				local9 = arg1.method7461(local9, local7.h());
			}
			@Pc(289) int local289 = local9;
			@Pc(291) boolean local291 = false;
			for (@Pc(293) int local293 = 0; local293 < local22.length; local293++) {
				if (local22[local293] != -1 && !Static119.aClass244_4.method5726(local22[local293]).method5482(arg6)) {
					local291 = true;
				}
			}
			if (local291) {
				return null;
			}
			@Pc(329) Class134[] local329 = new Class134[local22.length];
			for (@Pc(331) int local331 = 0; local331 < local22.length; local331++) {
				if (local22[local331] != -1) {
					local329[local331] = Static119.aClass244_4.method5726(local22[local331]).method5473(arg6);
				}
			}
			@Pc(386) int local386;
			if (local11 != null && local11.anIntArrayArray41 != null) {
				for (@Pc(366) int local366 = 0; local366 < local11.anIntArrayArray41.length; local366++) {
					if (local11.anIntArrayArray41[local366] != null && local329[local366] != null) {
						local386 = local11.anIntArrayArray41[local366][0];
						@Pc(393) int local393 = local11.anIntArrayArray41[local366][1];
						@Pc(400) int local400 = local11.anIntArrayArray41[local366][2];
						@Pc(407) int local407 = local11.anIntArrayArray41[local366][3];
						@Pc(414) int local414 = local11.anIntArrayArray41[local366][4];
						@Pc(421) int local421 = local11.anIntArrayArray41[local366][5];
						if (local407 != 0 || local414 != 0 || local421 != 0) {
							local329[local366].method3348(local414, local421, local407);
						}
						if (local386 != 0 || local393 != 0 || local400 != 0) {
							local329[local366].method3347(local393, local400, local386);
						}
					}
				}
			}
			@Pc(475) Class134 local475 = new Class134(local329, local329.length);
			if (arg2 != null) {
				local289 = local9 | 0x4000;
			}
			local7 = arg1.method7464(local475, local289, Static511.anInt8799, 64, 850);
			if (arg2 != null) {
				for (local386 = 0; local386 < 5; local386++) {
					if (arg2.anIntArray444[local386] < Static252.aShortArrayArray18[local386].length) {
						local7.UA(Static297.aShortArray82[local386], Static252.aShortArrayArray18[local386][arg2.anIntArray444[local386]]);
					}
					if (arg2.anIntArray444[local386] < Static8.aShortArrayArray1[local386].length) {
						local7.UA(Static184.aShortArray48[local386], Static8.aShortArrayArray1[local386][arg2.anIntArray444[local386]]);
					}
				}
			}
			if (Static363.aClass330_41 != null) {
				local7.ia(local9);
				Static363.aClass330_41.method7676(local7, local263);
			}
		}
		if (arg7 == null || local90 == null) {
			return local7;
		} else {
			@Pc(569) Class24 local569 = local7.method7398((byte) 1, local9, true);
			local569.method7395(arg3 - 1, local84, arg7.aBoolean104, local86, 0, local98, local88, local90);
			return local569;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([I[IZBI)J")
	private long method6590(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class5.aLongArray1;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) ((local9 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) ((local25 ^ (long) arg3) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg0[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0[local41] >> 16)) & 0xFFL)];
			local9 = local7[(int) (((long) (arg0[local41] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) arg0[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
				local9 = local7[(int) (((long) arg1[local126] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}
}
