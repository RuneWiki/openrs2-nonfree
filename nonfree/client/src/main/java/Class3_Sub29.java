import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "[I")
	public int[] anIntArray353 = new int[] { -1 };

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "[I")
	public int[] anIntArray354 = new int[1];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[IZ[II)J")
	private long method4561(@OriginalArg(1) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		@Pc(7) long[] local7 = Class223.aLongArray11;
		@Pc(9) long local9 = -1L;
		@Pc(31) long local31 = local7[(int) (((long) (arg3 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local31 >>> 8 ^ local7[(int) (((long) arg3 ^ local31) & 0xFFL)];
		for (@Pc(47) int local47 = 0; local47 < arg0.length; local47++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local47] >> 24) ^ local9) & 0xFFL)];
			local9 = local7[(int) (((long) (arg0[local47] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg0[local47] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) arg0[local47] ^ local9) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(128) int local128 = 0; local128 < 5; local128++) {
				local9 = local7[(int) (((long) arg2[local128] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg1 ? 1 : 0) ^ local9) & 0xFFL)];
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIILclient!c;IZILclient!ha;ILclient!qha;)Lclient!ka;")
	public Class28 method4563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class48 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class16 arg6, @OriginalArg(9) Class293 arg7) {
		@Pc(7) Class28 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class351 local11 = null;
		if (arg5 != -1) {
			local11 = Static658.aClass88_2.method2132(arg5);
		}
		@Pc(27) int[] local27 = this.anIntArray353;
		if (local11 != null && local11.anIntArray614 != null) {
			local27 = new int[local11.anIntArray614.length];
			for (@Pc(39) int local39 = 0; local39 < local11.anIntArray614.length; local39++) {
				@Pc(46) int local46 = local11.anIntArray614[local39];
				if (local46 >= 0 && this.anIntArray353.length > local46) {
					local27[local39] = this.anIntArray353[local46];
				} else {
					local27[local39] = -1;
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
		@Pc(96) Class3_Sub6_Sub11 local96 = null;
		@Pc(98) Class3_Sub6_Sub11 local98 = null;
		if (arg2 != null) {
			local90 = arg2.anIntArray72[arg0];
			local9 = 2080;
			@Pc(113) int local113 = local90 >>> 16;
			local96 = Static483.aClass373_2.method8321(local113);
			local90 &= 0xFFFF;
			if (local96 != null) {
				local84 = local96.method4042(local90) | false;
				local82 = local96.method4044(local90) | false;
				local88 = local96.method4037(local90) | false;
				local86 = arg2.aBoolean138 | false;
			}
			if ((arg2.aBoolean139 || Static296.aBoolean620) && arg3 != -1 && arg3 < arg2.anIntArray72.length) {
				local94 = arg2.anIntArray68[arg0];
				local92 = arg2.anIntArray72[arg3];
				@Pc(180) int local180 = local92 >>> 16;
				local92 &= 0xFFFF;
				if (local113 == local180) {
					local98 = local96;
				} else {
					local98 = Static483.aClass373_2.method8321(local92 >>> 16);
				}
				if (local98 != null) {
					local84 |= local98.method4042(local92);
					local82 |= local98.method4044(local92);
					local88 |= local98.method4037(local92);
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
		@Pc(261) long local261 = this.method4561(local27, arg4, arg7 == null ? null : arg7.anIntArray533, arg5);
		if (Static560.aClass279_52 != null) {
			local7 = (Class28) Static560.aClass279_52.method6631(local261);
		}
		if (local7 == null || arg6.method8122(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg6.method8198(local9, local7.ua());
			}
			@Pc(287) int local287 = local9;
			@Pc(289) boolean local289 = false;
			for (@Pc(291) int local291 = 0; local291 < local27.length; local291++) {
				if (local27[local291] != -1 && !Static237.aClass371_2.method8305(local27[local291]).method3201((Class356) null, arg4)) {
					local289 = true;
				}
			}
			if (local289) {
				return null;
			}
			@Pc(329) Class73[] local329 = new Class73[local27.length];
			for (@Pc(331) int local331 = 0; local331 < local27.length; local331++) {
				if (local27[local331] != -1) {
					local329[local331] = Static237.aClass371_2.method8305(local27[local331]).method3195(arg4, (Class356) null);
				}
			}
			@Pc(383) int local383;
			@Pc(390) int local390;
			if (local11 != null && local11.anIntArrayArray99 != null) {
				for (@Pc(363) int local363 = 0; local363 < local11.anIntArrayArray99.length; local363++) {
					if (local11.anIntArrayArray99[local363] != null && local329[local363] != null) {
						local383 = local11.anIntArrayArray99[local363][0];
						local390 = local11.anIntArrayArray99[local363][1];
						@Pc(397) int local397 = local11.anIntArrayArray99[local363][2];
						@Pc(404) int local404 = local11.anIntArrayArray99[local363][3];
						@Pc(411) int local411 = local11.anIntArrayArray99[local363][4];
						@Pc(418) int local418 = local11.anIntArrayArray99[local363][5];
						if (local404 != 0 || local411 != 0 || local418 != 0) {
							local329[local363].method1902(local418, local411, local404);
						}
						if (local383 != 0 || local390 != 0 || local397 != 0) {
							local329[local363].method1898(local390, local397, local383);
						}
					}
				}
			}
			if (arg7 != null) {
				local287 = local9 | 0x4000;
			}
			@Pc(476) Class73 local476 = new Class73(local329, local329.length);
			local7 = arg6.method8137(local476, local287, Static576.anInt9135, 64, 850);
			if (arg7 != null) {
				for (local383 = 0; local383 < 5; local383++) {
					for (local390 = 0; local390 < Static580.aShortArrayArrayArray3.length; local390++) {
						if (arg7.anIntArray533[local383] < Static580.aShortArrayArrayArray3[local390][local383].length) {
							local7.ia(Static398.aShortArrayArray16[local390][local383], Static580.aShortArrayArrayArray3[local390][local383][arg7.anIntArray533[local383]]);
						}
					}
				}
			}
			if (Static560.aClass279_52 != null) {
				local7.s(local9);
				Static560.aClass279_52.method6635(local7, local261);
			}
		}
		if (arg2 == null || local96 == null) {
			return local7;
		} else {
			@Pc(561) Class28 local561 = local7.method6900((byte) 1, local9, true);
			local561.method6893(0, arg2.aBoolean138, local94, arg1 - 1, local92, local96, local98, local90);
			return local561;
		}
	}
}
