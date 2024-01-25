import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "[I")
	public int[] anIntArray328 = new int[] { -1 };

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
	public int[] anIntArray327 = new int[1];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIILclient!r;IBLclient!kga;ILclient!rk;)Lclient!da;")
	public Class63 method3292(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class134 arg4, @OriginalArg(7) Class190 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class290 arg7) {
		@Pc(7) Class63 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class140 local11 = null;
		if (arg6 != -1) {
			local11 = Static384.aClass305_1.method6490(arg6);
		}
		@Pc(22) int[] local22 = this.anIntArray328;
		if (local11 != null && local11.anIntArray311 != null) {
			local22 = new int[local11.anIntArray311.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray311.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray311[local34];
				if (local41 >= 0 && this.anIntArray328.length > local41) {
					local22[local34] = this.anIntArray328[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(80) boolean local80 = false;
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) int local88 = -1;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = 0;
		@Pc(94) Class1_Sub6_Sub1 local94 = null;
		@Pc(96) Class1_Sub6_Sub1 local96 = null;
		if (arg7 != null) {
			local9 = 2080;
			local88 = arg7.anIntArray604[arg2];
			@Pc(111) int local111 = local88 >>> 16;
			local88 &= 0xFFFF;
			local94 = Static192.aClass211_1.method4272(local111);
			if (local94 != null) {
				local82 = local94.method348(local88) | false;
				local80 = local94.method346(local88) | false;
				local86 = local94.method353(local88) | false;
				local84 = arg7.aBoolean603 | false;
			}
			if ((arg7.aBoolean599 || Static444.aBoolean410) && arg3 != -1 && arg7.anIntArray604.length > arg3) {
				local92 = arg7.anIntArray603[arg2];
				local90 = arg7.anIntArray604[arg3];
				@Pc(179) int local179 = local90 >>> 16;
				local90 &= 0xFFFF;
				if (local179 == local111) {
					local96 = local94;
				} else {
					local96 = Static192.aClass211_1.method4272(local90 >>> 16);
				}
				if (local96 != null) {
					local82 |= local96.method348(local90);
					local80 |= local96.method346(local90);
					local86 |= local96.method353(local90);
				}
			}
			if (local82) {
				local9 = 2208;
			}
			if (local80) {
				local9 |= 0x100;
			}
			if (local84) {
				local9 |= 0x200;
			}
			if (local86) {
				local9 |= 0x400;
			}
		}
		@Pc(260) long local260 = this.method3293(arg1, arg6, arg5 == null ? null : arg5.anIntArray369, local22);
		if (Static42.aClass222_3 != null) {
			local7 = (Class63) Static42.aClass222_3.method4430(local260);
		}
		if (local7 == null || arg4.method6915(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method6967(local9, local7.PA());
			}
			@Pc(289) int local289 = local9;
			@Pc(291) boolean local291 = false;
			for (@Pc(293) int local293 = 0; local293 < local22.length; local293++) {
				if (local22[local293] != -1 && !Static175.aClass114_4.method2217(local22[local293]).method5010(arg1)) {
					local291 = true;
				}
			}
			if (local291) {
				return null;
			}
			@Pc(329) Class210[] local329 = new Class210[local22.length];
			for (@Pc(331) int local331 = 0; local331 < local22.length; local331++) {
				if (local22[local331] != -1) {
					local329[local331] = Static175.aClass114_4.method2217(local22[local331]).method5007(arg1);
				}
			}
			@Pc(383) int local383;
			@Pc(390) int local390;
			if (local11 != null && local11.anIntArrayArray87 != null) {
				for (@Pc(363) int local363 = 0; local363 < local11.anIntArrayArray87.length; local363++) {
					if (local11.anIntArrayArray87[local363] != null && local329[local363] != null) {
						local383 = local11.anIntArrayArray87[local363][0];
						local390 = local11.anIntArrayArray87[local363][1];
						@Pc(397) int local397 = local11.anIntArrayArray87[local363][2];
						@Pc(404) int local404 = local11.anIntArrayArray87[local363][3];
						@Pc(411) int local411 = local11.anIntArrayArray87[local363][4];
						@Pc(418) int local418 = local11.anIntArrayArray87[local363][5];
						if (local404 != 0 || local411 != 0 || local418 != 0) {
							local329[local363].method4262(local404, local418, local411);
						}
						if (local383 != 0 || local390 != 0 || local397 != 0) {
							local329[local363].method4268(local390, local397, local383);
						}
					}
				}
			}
			@Pc(472) Class210 local472 = new Class210(local329, local329.length);
			if (arg5 != null) {
				local289 = local9 | 0x4000;
			}
			local7 = arg4.method6910(local472, local289, Static426.anInt7374, 64, 850);
			if (arg5 != null) {
				for (local383 = 0; local383 < 5; local383++) {
					for (local390 = 0; local390 < Static261.aShortArrayArrayArray1.length; local390++) {
						if (arg5.anIntArray369[local383] < Static261.aShortArrayArrayArray1[local390][local383].length) {
							local7.d(Static177.aShortArrayArray2[local390][local383], Static261.aShortArrayArrayArray1[local390][local383][arg5.anIntArray369[local383]]);
						}
					}
				}
			}
			if (Static42.aClass222_3 != null) {
				local7.SA(local9);
				Static42.aClass222_3.method4434(local7, local260);
			}
		}
		if (arg7 == null || local94 == null) {
			return local7;
		} else {
			@Pc(570) Class63 local570 = local7.method7417((byte) 1, local9, true);
			local570.method7410(arg0 - 1, local92, local96, 0, arg7.aBoolean603, local88, local90, local94);
			return local570;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI[IB[I)J")
	private long method3293(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class203.aLongArray15;
		@Pc(9) long local9 = -1L;
		@Pc(32) long local32 = local7[(int) ((local9 ^ (long) (arg1 >> 8)) & 0xFFL)] ^ local9 >>> 8;
		local9 = local7[(int) (((long) arg1 ^ local32) & 0xFFL)] ^ local32 >>> 8;
		for (@Pc(48) int local48 = 0; local48 < arg3.length; local48++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg3[local48] >> 24) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg3[local48] >> 16) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg3[local48] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) arg3[local48] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(133) int local133 = 0; local133 < 5; local133++) {
				local9 = local7[(int) (((long) arg2[local133] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg0 ? 1 : 0) ^ local9) & 0xFFL)];
	}
}
