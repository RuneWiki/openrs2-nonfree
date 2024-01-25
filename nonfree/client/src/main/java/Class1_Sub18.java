import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "[I")
	public int[] anIntArray254 = new int[] { -1 };

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "[I")
	public int[] anIntArray255 = new int[1];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II[IZ[I)J")
	private long method2246(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class173.aLongArray14;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0 >> 8)) & 0xFFL)];
		local9 = local7[(int) ((local25 ^ (long) arg0) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(41) int local41 = 0; local41 < arg3.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg3[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) (((long) (arg3[local41] >> 16) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg3[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) arg3[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
				local9 = local7[(int) (((long) arg1[local122] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg2 ? 1 : 0) ^ local9) & 0xFFL)];
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!na;IIILclient!qa;Lclient!nl;IZI)Lclient!r;")
	public Class145 method2247(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class122 arg4, @OriginalArg(6) Class206 arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class145 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class230 local11 = null;
		if (arg7 != -1) {
			local11 = Static351.aClass228_1.method5341(arg7);
		}
		@Pc(28) int[] local28 = this.anIntArray254;
		if (local11 != null && local11.anIntArray650 != null) {
			local28 = new int[local11.anIntArray650.length];
			for (@Pc(40) int local40 = 0; local40 < local11.anIntArray650.length; local40++) {
				@Pc(47) int local47 = local11.anIntArray650[local40];
				if (local47 >= 0 && local47 < this.anIntArray254.length) {
					local28[local40] = this.anIntArray254[local47];
				} else {
					local28[local40] = -1;
				}
			}
		}
		@Pc(79) boolean local79 = false;
		@Pc(81) boolean local81 = false;
		@Pc(83) boolean local83 = false;
		@Pc(85) boolean local85 = false;
		@Pc(87) int local87 = -1;
		@Pc(89) int local89 = -1;
		@Pc(91) int local91 = 0;
		@Pc(93) Class1_Sub1_Sub6 local93 = null;
		@Pc(95) Class1_Sub1_Sub6 local95 = null;
		if (arg1 != null) {
			local9 = 2080;
			local87 = arg1.anIntArray574[arg0];
			@Pc(110) int local110 = local87 >>> 16;
			local87 &= 0xFFFF;
			local93 = Static182.aClass218_1.method5222(local110);
			if (local93 != null) {
				local81 = local93.method2962(local87) | false;
				local79 = local93.method2963(local87) | false;
				local85 = local93.method2965(local87) | false;
				local83 = arg1.aBoolean418 | false;
			}
			if ((arg1.aBoolean417 || Static157.aBoolean315) && arg3 != -1 && arg1.anIntArray574.length > arg3) {
				local91 = arg1.anIntArray575[arg0];
				local89 = arg1.anIntArray574[arg3];
				@Pc(182) int local182 = local89 >>> 16;
				local89 &= 0xFFFF;
				if (local182 == local110) {
					local95 = local93;
				} else {
					local95 = Static182.aClass218_1.method5222(local89 >>> 16);
				}
				if (local95 != null) {
					local81 |= local95.method2962(local89);
					local79 |= local95.method2963(local89);
					local85 |= local95.method2965(local89);
				}
			}
			if (local81) {
				local9 = 2208;
			}
			if (local79) {
				local9 |= 0x100;
			}
			if (local83) {
				local9 |= 0x200;
			}
			if (local85) {
				local9 |= 0x400;
			}
		}
		@Pc(265) long local265 = this.method2246(arg7, arg5 == null ? null : arg5.anIntArray590, arg6, local28);
		if (Static235.aClass313_29 != null) {
			local7 = (Class145) Static235.aClass313_29.method7406(local265);
		}
		if (local7 == null || arg4.method7225(local7.ba(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method7241(local9, local7.ba());
			}
			@Pc(291) int local291 = local9;
			@Pc(293) boolean local293 = false;
			for (@Pc(295) int local295 = 0; local295 < local28.length; local295++) {
				if (local28[local295] != -1 && !Static342.aClass250_2.method5980(local28[local295]).method3453(arg6)) {
					local293 = true;
				}
			}
			if (local293) {
				return null;
			}
			@Pc(332) Class97[] local332 = new Class97[local28.length];
			for (@Pc(334) int local334 = 0; local334 < local28.length; local334++) {
				if (local28[local334] != -1) {
					local332[local334] = Static342.aClass250_2.method5980(local28[local334]).method3446(arg6);
				}
			}
			@Pc(389) int local389;
			if (local11 != null && local11.anIntArrayArray84 != null) {
				for (@Pc(369) int local369 = 0; local369 < local11.anIntArrayArray84.length; local369++) {
					if (local11.anIntArrayArray84[local369] != null && local332[local369] != null) {
						local389 = local11.anIntArrayArray84[local369][0];
						@Pc(396) int local396 = local11.anIntArrayArray84[local369][1];
						@Pc(403) int local403 = local11.anIntArrayArray84[local369][2];
						@Pc(410) int local410 = local11.anIntArrayArray84[local369][3];
						@Pc(417) int local417 = local11.anIntArrayArray84[local369][4];
						@Pc(424) int local424 = local11.anIntArrayArray84[local369][5];
						if (local410 != 0 || local417 != 0 || local424 != 0) {
							local332[local369].method2310(local417, local424, local410);
						}
						if (local389 != 0 || local396 != 0 || local403 != 0) {
							local332[local369].method2306(local389, local403, local396);
						}
					}
				}
			}
			if (arg5 != null) {
				local291 = local9 | 0x4000;
			}
			@Pc(486) Class97 local486 = new Class97(local332, local332.length);
			local7 = arg4.method7280(local486, local291, Static455.anInt7772, 64, 850);
			if (arg5 != null) {
				for (local389 = 0; local389 < 5; local389++) {
					if (arg5.anIntArray590[local389] < Static293.aShortArrayArray4[local389].length) {
						local7.pa(Static430.aShortArray117[local389], Static293.aShortArrayArray4[local389][arg5.anIntArray590[local389]]);
					}
					if (Static45.aShortArrayArray1[local389].length > arg5.anIntArray590[local389]) {
						local7.pa(Static88.aShortArray33[local389], Static45.aShortArrayArray1[local389][arg5.anIntArray590[local389]]);
					}
				}
			}
			if (Static235.aClass313_29 != null) {
				local7.m(local9);
				Static235.aClass313_29.method7399(local265, local7);
			}
		}
		if (arg1 == null || local93 == null) {
			return local7;
		} else {
			@Pc(576) Class145 local576 = local7.method6672((byte) 1, local9, true);
			local576.method6687(local93, local91, arg2 - 1, local95, local89, 0, local87, arg1.aBoolean418);
			return local576;
		}
	}
}
