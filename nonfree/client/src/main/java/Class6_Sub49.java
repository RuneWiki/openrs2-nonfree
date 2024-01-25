import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class6_Sub49 extends Class6 {

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "[I")
	public int[] anIntArray696 = new int[1];

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "[I")
	public int[] anIntArray697 = new int[] { -1 };

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([I[IZIZ)J")
	private long method7522(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long[] local7 = Class287.aLongArray14;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) (((long) (arg3 >> 8) ^ local9) & 0xFFL)];
		local9 = local7[(int) ((local25 ^ (long) arg3) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			local9 = local7[(int) (((long) (arg0[local41] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local41] >> 16) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg0[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg0[local41] ^ local9) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local7[(int) ((local9 ^ (long) arg1[local122]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local7[(int) ((local9 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!h;Lclient!oa;IIIIILclient!cu;Z)Lclient!ba;")
	public Class20 method7523(@OriginalArg(0) int arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class57 arg6, @OriginalArg(9) boolean arg7) {
		@Pc(7) Class20 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class118 local11 = null;
		if (arg3 != -1) {
			local11 = Static333.aClass149_1.method3770(arg3);
		}
		@Pc(22) int[] local22 = this.anIntArray697;
		if (local11 != null && local11.anIntArray207 != null) {
			local22 = new int[local11.anIntArray207.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray207.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray207[local34];
				if (local41 >= 0 && local41 < this.anIntArray697.length) {
					local22[local34] = this.anIntArray697[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(85) boolean local85 = false;
		@Pc(87) boolean local87 = false;
		@Pc(89) int local89 = -1;
		@Pc(91) int local91 = -1;
		@Pc(93) int local93 = 0;
		@Pc(95) Class6_Sub2_Sub19 local95 = null;
		@Pc(97) Class6_Sub2_Sub19 local97 = null;
		if (arg6 != null) {
			local9 = 2080;
			local89 = arg6.anIntArray132[arg4];
			@Pc(112) int local112 = local89 >>> 16;
			local95 = Static78.aClass298_2.method6517(local112);
			local89 &= 0xFFFF;
			if (local95 != null) {
				local78 = local95.method7102(local89) | false;
				local76 = local95.method7106(local89) | false;
				local87 = local95.method7107(local89) | false;
				local85 = arg6.aBoolean113 | false;
			}
			if ((arg6.aBoolean114 || Static132.aBoolean213) && arg5 != -1 && arg5 < arg6.anIntArray132.length) {
				local91 = arg6.anIntArray132[arg5];
				local93 = arg6.anIntArray130[arg4];
				@Pc(184) int local184 = local91 >>> 16;
				local91 &= 0xFFFF;
				if (local112 == local184) {
					local97 = local95;
				} else {
					local97 = Static78.aClass298_2.method6517(local91 >>> 16);
				}
				if (local97 != null) {
					local78 |= local97.method7102(local91);
					local76 |= local97.method7106(local91);
					local87 |= local97.method7107(local91);
				}
			}
			if (local78) {
				local9 = 2208;
			}
			if (local76) {
				local9 |= 0x100;
			}
			if (local85) {
				local9 |= 0x200;
			}
			if (local87) {
				local9 |= 0x400;
			}
		}
		@Pc(261) long local261 = this.method7522(local22, arg1 == null ? null : arg1.anIntArray214, arg7, arg3);
		if (Static134.aClass136_32 != null) {
			local7 = (Class20) Static134.aClass136_32.method3473(local261);
		}
		if (local7 == null || arg2.method6884(local7.h(), local9) != 0) {
			if (local7 != null) {
				local9 = arg2.method6879(local9, local7.h());
			}
			@Pc(287) int local287 = local9;
			@Pc(289) boolean local289 = false;
			for (@Pc(291) int local291 = 0; local291 < local22.length; local291++) {
				if (local22[local291] != -1 && !Static444.aClass322_2.method7141(local22[local291]).method5534(arg7)) {
					local289 = true;
				}
			}
			if (local289) {
				return null;
			}
			@Pc(323) Class220[] local323 = new Class220[local22.length];
			for (@Pc(325) int local325 = 0; local325 < local22.length; local325++) {
				if (local22[local325] != -1) {
					local323[local325] = Static444.aClass322_2.method7141(local22[local325]).method5535(arg7);
				}
			}
			@Pc(376) int local376;
			@Pc(383) int local383;
			if (local11 != null && local11.anIntArrayArray20 != null) {
				for (@Pc(356) int local356 = 0; local356 < local11.anIntArrayArray20.length; local356++) {
					if (local11.anIntArrayArray20[local356] != null && local323[local356] != null) {
						local376 = local11.anIntArrayArray20[local356][0];
						local383 = local11.anIntArrayArray20[local356][1];
						@Pc(390) int local390 = local11.anIntArrayArray20[local356][2];
						@Pc(397) int local397 = local11.anIntArrayArray20[local356][3];
						@Pc(404) int local404 = local11.anIntArrayArray20[local356][4];
						@Pc(411) int local411 = local11.anIntArrayArray20[local356][5];
						if (local397 != 0 || local404 != 0 || local411 != 0) {
							local323[local356].method5302(local411, local404, local397);
						}
						if (local376 != 0 || local383 != 0 || local390 != 0) {
							local323[local356].method5308(local390, local383, local376);
						}
					}
				}
			}
			if (arg1 != null) {
				local287 = local9 | 0x4000;
			}
			@Pc(465) Class220 local465 = new Class220(local323, local323.length);
			local7 = arg2.method6833(local465, local287, Static384.anInt6757, 64, 850);
			if (arg1 != null) {
				for (local376 = 0; local376 < 5; local376++) {
					for (local383 = 0; local383 < Static336.aShortArrayArrayArray2.length; local383++) {
						if (arg1.anIntArray214[local376] < Static336.aShortArrayArrayArray2[local383][local376].length) {
							local7.UA(Static155.aShortArrayArray2[local383][local376], Static336.aShortArrayArrayArray2[local383][local376][arg1.anIntArray214[local376]]);
						}
					}
				}
			}
			if (Static134.aClass136_32 != null) {
				local7.ia(local9);
				Static134.aClass136_32.method3482(local261, local7);
			}
		}
		if (arg6 == null || local95 == null) {
			return local7;
		} else {
			@Pc(546) Class20 local546 = local7.method7264((byte) 1, local9, true);
			local546.method7262(local95, arg6.aBoolean113, local91, local93, local89, local97, arg0 - 1, 0);
			return local546;
		}
	}
}
