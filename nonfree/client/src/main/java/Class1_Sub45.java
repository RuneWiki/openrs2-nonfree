import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!taa", name = "m", descriptor = "[I")
	public int[] anIntArray521 = new int[] { -1 };

	@OriginalMember(owner = "client!taa", name = "l", descriptor = "[I")
	public int[] anIntArray520 = new int[1];

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BIIIILclient!qi;ZILclient!ks;Lclient!r;)Lclient!da;")
	public Class52 method6771(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class283 arg3, @OriginalArg(6) boolean arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class197 arg6, @OriginalArg(9) Class78 arg7) {
		@Pc(7) Class52 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class114 local11 = null;
		if (arg5 != -1) {
			local11 = Static241.aClass340_1.method7431(arg5);
		}
		@Pc(28) int[] local28 = this.anIntArray521;
		if (local11 != null && local11.anIntArray135 != null) {
			local28 = new int[local11.anIntArray135.length];
			for (@Pc(40) int local40 = 0; local40 < local11.anIntArray135.length; local40++) {
				@Pc(47) int local47 = local11.anIntArray135[local40];
				if (local47 >= 0 && local47 < this.anIntArray521.length) {
					local28[local40] = this.anIntArray521[local47];
				} else {
					local28[local40] = -1;
				}
			}
		}
		@Pc(82) boolean local82 = false;
		@Pc(84) boolean local84 = false;
		@Pc(86) boolean local86 = false;
		@Pc(88) boolean local88 = false;
		@Pc(90) int local90 = -1;
		@Pc(92) int local92 = -1;
		@Pc(94) int local94 = 0;
		@Pc(96) Class1_Sub8_Sub18 local96 = null;
		@Pc(98) Class1_Sub8_Sub18 local98 = null;
		if (arg6 != null) {
			local9 = 2080;
			local90 = arg6.anIntArray284[arg2];
			@Pc(113) int local113 = local90 >>> 16;
			local96 = Static223.aClass245_1.method5307(local113);
			local90 &= 0xFFFF;
			if (local96 != null) {
				local84 = local96.method7355(local90) | false;
				local82 = local96.method7356(local90) | false;
				local88 = local96.method7359(local90) | false;
				local86 = arg6.aBoolean385 | false;
			}
			if ((arg6.aBoolean384 || Static503.aBoolean658) && arg0 != -1 && arg6.anIntArray284.length > arg0) {
				local94 = arg6.anIntArray279[arg2];
				local92 = arg6.anIntArray284[arg0];
				@Pc(182) int local182 = local92 >>> 16;
				local92 &= 0xFFFF;
				if (local113 == local182) {
					local98 = local96;
				} else {
					local98 = Static223.aClass245_1.method5307(local92 >>> 16);
				}
				if (local98 != null) {
					local84 |= local98.method7355(local92);
					local82 |= local98.method7356(local92);
					local88 |= local98.method7359(local92);
				}
			}
			if (local84) {
				local9 = 2208;
			}
			if (local82) {
				local9 |= 0x100;
			}
			if (local86) {
				local9 |= 0x200;
			}
			if (local88) {
				local9 |= 0x400;
			}
		}
		@Pc(261) long local261 = this.method6773(arg4, arg5, arg3 == null ? null : arg3.anIntArray457, local28);
		if (Static392.aClass207_44 != null) {
			local7 = (Class52) Static392.aClass207_44.method4390(local261);
		}
		if (local7 == null || arg7.method6819(local7.PA(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method6782(local9, local7.PA());
			}
			@Pc(290) int local290 = local9;
			@Pc(292) boolean local292 = false;
			for (@Pc(294) int local294 = 0; local294 < local28.length; local294++) {
				if (local28[local294] != -1 && !Static230.aClass225_1.method4857(local28[local294]).method4789(arg4)) {
					local292 = true;
				}
			}
			if (local292) {
				return null;
			}
			@Pc(328) Class231[] local328 = new Class231[local28.length];
			for (@Pc(330) int local330 = 0; local330 < local28.length; local330++) {
				if (local28[local330] != -1) {
					local328[local330] = Static230.aClass225_1.method4857(local28[local330]).method4778(arg4);
				}
			}
			@Pc(381) int local381;
			@Pc(388) int local388;
			if (local11 != null && local11.anIntArrayArray10 != null) {
				for (@Pc(361) int local361 = 0; local361 < local11.anIntArrayArray10.length; local361++) {
					if (local11.anIntArrayArray10[local361] != null && local328[local361] != null) {
						local381 = local11.anIntArrayArray10[local361][0];
						local388 = local11.anIntArrayArray10[local361][1];
						@Pc(395) int local395 = local11.anIntArrayArray10[local361][2];
						@Pc(402) int local402 = local11.anIntArrayArray10[local361][3];
						@Pc(409) int local409 = local11.anIntArrayArray10[local361][4];
						@Pc(416) int local416 = local11.anIntArrayArray10[local361][5];
						if (local402 != 0 || local409 != 0 || local416 != 0) {
							local328[local361].method5064(local402, local416, local409);
						}
						if (local381 != 0 || local388 != 0 || local395 != 0) {
							local328[local361].method5074(local395, local388, local381);
						}
					}
				}
			}
			@Pc(470) Class231 local470 = new Class231(local328, local328.length);
			if (arg3 != null) {
				local290 = local9 | 0x4000;
			}
			local7 = arg7.method6817(local470, local290, Static535.anInt7160, 64, 850);
			if (arg3 != null) {
				for (local381 = 0; local381 < 5; local381++) {
					for (local388 = 0; local388 < Static103.aShortArrayArrayArray1.length; local388++) {
						if (Static103.aShortArrayArrayArray1[local388][local381].length > arg3.anIntArray457[local381]) {
							local7.d(Static327.aShortArrayArray8[local388][local381], Static103.aShortArrayArrayArray1[local388][local381][arg3.anIntArray457[local381]]);
						}
					}
				}
			}
			if (Static392.aClass207_44 != null) {
				local7.SA(local9);
				Static392.aClass207_44.method4391(local261, local7);
			}
		}
		if (arg6 == null || local96 == null) {
			return local7;
		} else {
			@Pc(561) Class52 local561 = local7.method7412((byte) 1, local9, true);
			local561.method7394(local98, arg6.aBoolean385, arg1 - 1, local92, local90, local96, 0, local94);
			return local561;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZI[I[II)J")
	private long method6773(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		@Pc(7) long[] local7 = Class209_Sub2_Sub2.aLongArray17;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg1 >> 8) ^ local9) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) ((local25 ^ (long) arg1) & 0xFFL)];
		for (@Pc(47) int local47 = 0; local47 < arg3.length; local47++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3[local47] >> 24)) & 0xFFL)];
			local9 = local7[(int) (((long) (arg3[local47] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg3[local47] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg3[local47]) & 0xFFL)];
		}
		if (arg2 != null) {
			for (@Pc(128) int local128 = 0; local128 < 5; local128++) {
				local9 = local7[(int) (((long) arg2[local128] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) (((long) (arg0 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}
}
