import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class5_Sub24 extends Class5 {

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[I")
	public int[] anIntArray260 = new int[1];

	@OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
	public int[] anIntArray261 = new int[] { -1 };

	static {
		new Class40("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIBILclient!bj;Lclient!qa;IZLclient!qn;I)Lclient!r;")
	public Class36 method3077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) Class62 arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) Class248 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class36 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(16) Class281 local16 = null;
		if (arg7 != -1) {
			local16 = Static201.aClass85_1.method2270(arg7);
		}
		@Pc(27) int[] local27 = this.anIntArray261;
		if (local16 != null && local16.anIntArray631 != null) {
			local27 = new int[local16.anIntArray631.length];
			for (@Pc(39) int local39 = 0; local39 < local16.anIntArray631.length; local39++) {
				@Pc(46) int local46 = local16.anIntArray631[local39];
				if (local46 >= 0 && this.anIntArray261.length > local46) {
					local27[local39] = this.anIntArray261[local46];
				} else {
					local27[local39] = -1;
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
		@Pc(88) Class5_Sub2_Sub16 local88 = null;
		@Pc(90) Class5_Sub2_Sub16 local90 = null;
		if (arg3 != null) {
			local82 = arg3.anIntArray69[arg0];
			local9 = 2080;
			@Pc(105) int local105 = local82 >>> 16;
			local88 = Static155.aClass76_2.method2153(local105);
			local82 &= 0xFFFF;
			if (local88 != null) {
				local76 = local88.method4953(local82) | false;
				local74 = local88.method4957(local82) | false;
				local80 = local88.method4954(local82) | false;
				local78 = arg3.aBoolean39 | false;
			}
			if ((arg3.aBoolean37 || Static457.aBoolean567) && arg1 != -1 && arg1 < arg3.anIntArray69.length) {
				local84 = arg3.anIntArray69[arg1];
				local86 = arg3.anIntArray68[arg0];
				@Pc(175) int local175 = local84 >>> 16;
				local84 &= 0xFFFF;
				if (local105 == local175) {
					local90 = local88;
				} else {
					local90 = Static155.aClass76_2.method2153(local84 >>> 16);
				}
				if (local90 != null) {
					local76 |= local90.method4953(local84);
					local74 |= local90.method4957(local84);
					local80 |= local90.method4954(local84);
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
		@Pc(256) long local256 = this.method3078(arg7, arg5, local27, arg6 == null ? null : arg6.anIntArray563);
		if (Static431.aClass288_56 != null) {
			local7 = (Class36) Static431.aClass288_56.method6745(local256);
		}
		if (local7 == null || arg4.method7017(local7.ba(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method7024(local9, local7.ba());
			}
			@Pc(285) int local285 = local9;
			@Pc(287) boolean local287 = false;
			for (@Pc(289) int local289 = 0; local289 < local27.length; local289++) {
				if (local27[local289] != -1 && !Static451.aClass67_2.method2006(local27[local289]).method682(arg5)) {
					local287 = true;
				}
			}
			if (local287) {
				return null;
			}
			@Pc(325) Class184[] local325 = new Class184[local27.length];
			for (@Pc(327) int local327 = 0; local327 < local27.length; local327++) {
				if (local27[local327] != -1) {
					local325[local327] = Static451.aClass67_2.method2006(local27[local327]).method677(arg5);
				}
			}
			@Pc(378) int local378;
			if (local16 != null && local16.anIntArrayArray67 != null) {
				for (@Pc(358) int local358 = 0; local358 < local16.anIntArrayArray67.length; local358++) {
					if (local16.anIntArrayArray67[local358] != null && local325[local358] != null) {
						local378 = local16.anIntArrayArray67[local358][0];
						@Pc(385) int local385 = local16.anIntArrayArray67[local358][1];
						@Pc(392) int local392 = local16.anIntArrayArray67[local358][2];
						@Pc(399) int local399 = local16.anIntArrayArray67[local358][3];
						@Pc(406) int local406 = local16.anIntArrayArray67[local358][4];
						@Pc(413) int local413 = local16.anIntArrayArray67[local358][5];
						if (local399 != 0 || local406 != 0 || local413 != 0) {
							local325[local358].method4527(local399, local406, local413);
						}
						if (local378 != 0 || local385 != 0 || local392 != 0) {
							local325[local358].method4522(local378, local385, local392);
						}
					}
				}
			}
			if (arg6 != null) {
				local285 = local9 | 0x4000;
			}
			@Pc(466) Class184 local466 = new Class184(local325, local325.length);
			local7 = arg4.method7012(local466, local285, Static45.anInt1001, 64, 850);
			if (arg6 != null) {
				for (local378 = 0; local378 < 5; local378++) {
					if (arg6.anIntArray563[local378] < Static130.aShortArrayArray2[local378].length) {
						local7.pa(Static247.aShortArray50[local378], Static130.aShortArrayArray2[local378][arg6.anIntArray563[local378]]);
					}
					if (arg6.anIntArray563[local378] < Static141.aShortArrayArray4[local378].length) {
						local7.pa(Static399.aShortArray112[local378], Static141.aShortArrayArray4[local378][arg6.anIntArray563[local378]]);
					}
				}
			}
			if (Static431.aClass288_56 != null) {
				local7.m(local9);
				Static431.aClass288_56.method6746(local7, local256);
			}
		}
		if (arg3 == null || local88 == null) {
			return local7;
		} else {
			@Pc(552) Class36 local552 = local7.method7356((byte) 1, local9, true);
			local552.method7348(0, local84, local90, local82, arg2 - 1, local88, arg3.aBoolean39, local86);
			return local552;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ[I[II)J")
	private long method3078(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		@Pc(15) long[] local15 = Class273.aLongArray8;
		@Pc(17) long local17 = -1L;
		@Pc(33) long local33 = local15[(int) ((local17 ^ (long) (arg0 >> 8)) & 0xFFL)] ^ local17 >>> 8;
		local17 = local15[(int) (((long) arg0 ^ local33) & 0xFFL)] ^ local33 >>> 8;
		for (@Pc(49) int local49 = 0; local49 < arg2.length; local49++) {
			local17 = local17 >>> 8 ^ local15[(int) (((long) (arg2[local49] >> 24) ^ local17) & 0xFFL)];
			local17 = local15[(int) ((local17 ^ (long) (arg2[local49] >> 16)) & 0xFFL)] ^ local17 >>> 8;
			local17 = local17 >>> 8 ^ local15[(int) (((long) (arg2[local49] >> 8) ^ local17) & 0xFFL)];
			local17 = local15[(int) (((long) arg2[local49] ^ local17) & 0xFFL)] ^ local17 >>> 8;
		}
		if (arg3 != null) {
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				local17 = local15[(int) ((local17 ^ (long) arg3[local130]) & 0xFFL)] ^ local17 >>> 8;
			}
		}
		return local15[(int) ((local17 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)] ^ local17 >>> 8;
	}
}
