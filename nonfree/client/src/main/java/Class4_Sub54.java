import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class4_Sub54 extends Class4 {

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "[I")
	public int[] anIntArray721 = new int[1];

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "[I")
	public int[] anIntArray723 = new int[] { -1 };

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z[III[I)J")
	private long method8909(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class219.aLongArray8;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 >> 8)) & 0xFFL)];
		local9 = local7[(int) ((local25 ^ (long) arg2) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg3.length; local41++) {
			local9 = local7[(int) (((long) (arg3[local41] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg3[local41] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg3[local41] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) arg3[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(125) int local125 = 0; local125 < 5; local125++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg1[local125] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZIILclient!ha;ILclient!fs;ILclient!nba;I)Lclient!ka;")
	public Class62 method8910(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(6) Class124 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class245 arg7) {
		@Pc(7) Class62 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class377 local11 = null;
		if (arg2 != -1) {
			local11 = Static116.aClass177_1.method3979(arg2);
		}
		@Pc(23) int[] local23 = this.anIntArray723;
		if (local11 != null && local11.anIntArray698 != null) {
			local23 = new int[local11.anIntArray698.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray698.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray698[local35];
				if (local42 >= 0 && local42 < this.anIntArray723.length) {
					local23[local35] = this.anIntArray723[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(74) boolean local74 = false;
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = 0;
		@Pc(88) Class4_Sub5_Sub15 local88 = null;
		@Pc(90) Class4_Sub5_Sub15 local90 = null;
		if (arg5 != null) {
			local82 = arg5.anIntArray224[arg6];
			local9 = 2080;
			@Pc(105) int local105 = local82 >>> 16;
			local88 = Static99.aClass2_1.method24(local105);
			local82 &= 0xFFFF;
			if (local88 != null) {
				local76 = local88.method5086(local82) | false;
				local74 = local88.method5089(local82) | false;
				local80 = local88.method5085(local82) | false;
				local78 = arg5.aBoolean221 | false;
			}
			if ((arg5.aBoolean219 || Static562.aBoolean673) && arg3 != -1 && arg3 < arg5.anIntArray224.length) {
				local86 = arg5.anIntArray221[arg6];
				local84 = arg5.anIntArray224[arg3];
				@Pc(174) int local174 = local84 >>> 16;
				local84 &= 0xFFFF;
				if (local174 == local105) {
					local90 = local88;
				} else {
					local90 = Static99.aClass2_1.method24(local84 >>> 16);
				}
				if (local90 != null) {
					local76 |= local90.method5086(local84);
					local74 |= local90.method5089(local84);
					local80 |= local90.method5085(local84);
				}
			}
			if (local76) {
				local9 = 2208;
			}
			if (local74) {
				local9 |= 0x100;
			}
			if (local78) {
				local9 |= 0x200;
			}
			if (local80) {
				local9 |= 0x400;
			}
		}
		@Pc(251) long local251 = this.method8909(arg1, arg7 == null ? null : arg7.anIntArray437, arg2, local23);
		if (Static270.aClass352_38 != null) {
			local7 = (Class62) Static270.aClass352_38.method7653(local251);
		}
		if (local7 == null || arg4.method8124(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method8140(local9, local7.ua());
			}
			@Pc(280) int local280 = local9;
			@Pc(282) boolean local282 = false;
			for (@Pc(284) int local284 = 0; local284 < local23.length; local284++) {
				if (local23[local284] != -1 && !Static532.aClass255_2.method5210(local23[local284]).method2624((Class38) null, arg1)) {
					local282 = true;
				}
			}
			if (local282) {
				return null;
			}
			@Pc(321) Class334[] local321 = new Class334[local23.length];
			for (@Pc(323) int local323 = 0; local323 < local23.length; local323++) {
				if (local23[local323] != -1) {
					local321[local323] = Static532.aClass255_2.method5210(local23[local323]).method2612((Class38) null, arg1);
				}
			}
			@Pc(375) int local375;
			@Pc(382) int local382;
			if (local11 != null && local11.anIntArrayArray62 != null) {
				for (@Pc(355) int local355 = 0; local355 < local11.anIntArrayArray62.length; local355++) {
					if (local11.anIntArrayArray62[local355] != null && local321[local355] != null) {
						local375 = local11.anIntArrayArray62[local355][0];
						local382 = local11.anIntArrayArray62[local355][1];
						@Pc(389) int local389 = local11.anIntArrayArray62[local355][2];
						@Pc(396) int local396 = local11.anIntArrayArray62[local355][3];
						@Pc(403) int local403 = local11.anIntArrayArray62[local355][4];
						@Pc(410) int local410 = local11.anIntArrayArray62[local355][5];
						if (local396 != 0 || local403 != 0 || local410 != 0) {
							local321[local355].method7379(local410, local403, local396);
						}
						if (local375 != 0 || local382 != 0 || local389 != 0) {
							local321[local355].method7387(local375, local389, local382);
						}
					}
				}
			}
			if (arg7 != null) {
				local280 = local9 | 0x4000;
			}
			@Pc(468) Class334 local468 = new Class334(local321, local321.length);
			local7 = arg4.method8072(local468, local280, Static320.anInt8925, 64, 850);
			if (arg7 != null) {
				for (local375 = 0; local375 < 5; local375++) {
					for (local382 = 0; local382 < Static158.aShortArrayArrayArray8.length; local382++) {
						if (arg7.anIntArray437[local375] < Static158.aShortArrayArrayArray8[local382][local375].length) {
							local7.ia(Static46.aShortArrayArray4[local382][local375], Static158.aShortArrayArrayArray8[local382][local375][arg7.anIntArray437[local375]]);
						}
					}
				}
			}
			if (Static270.aClass352_38 != null) {
				local7.s(local9);
				Static270.aClass352_38.method7655(local251, local7);
			}
		}
		if (arg5 == null || local88 == null) {
			return local7;
		} else {
			@Pc(555) Class62 local555 = local7.method7329((byte) 1, local9, true);
			local555.method7346(local82, local86, local90, arg5.aBoolean221, arg0 - 1, local88, 0, local84);
			return local555;
		}
	}
}
