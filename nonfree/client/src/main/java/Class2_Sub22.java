import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class2_Sub22 extends Class2 {

	@OriginalMember(owner = "client!es", name = "i", descriptor = "[I")
	public int[] anIntArray219 = new int[] { -1 };

	@OriginalMember(owner = "client!es", name = "l", descriptor = "[I")
	public int[] anIntArray220 = new int[1];

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BZ[II[I)J")
	private long method2595(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(5) long[] local5 = Class365.aLongArray18;
		@Pc(7) long local7 = -1L;
		@Pc(23) long local23 = local5[(int) ((local7 ^ (long) (arg2 >> 8)) & 0xFFL)] ^ local7 >>> 8;
		local7 = local23 >>> 8 ^ local5[(int) (((long) arg2 ^ local23) & 0xFFL)];
		for (@Pc(39) int local39 = 0; local39 < arg1.length; local39++) {
			local7 = local5[(int) ((local7 ^ (long) (arg1[local39] >> 24)) & 0xFFL)] ^ local7 >>> 8;
			local7 = local5[(int) ((local7 ^ (long) (arg1[local39] >> 16)) & 0xFFL)] ^ local7 >>> 8;
			local7 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) (arg1[local39] >> 8)) & 0xFFL)];
			local7 = local7 >>> 8 ^ local5[(int) (((long) arg1[local39] ^ local7) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(123) int local123 = 0; local123 < 5; local123++) {
				local7 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) arg3[local123]) & 0xFFL)];
			}
		}
		return local7 >>> 8 ^ local5[(int) ((local7 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZIILclient!ha;Lclient!in;ILclient!hn;I)Lclient!ka;")
	public Class25 method2598(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class87 arg4, @OriginalArg(6) Class163 arg5, @OriginalArg(8) Class149 arg6, @OriginalArg(9) int arg7) {
		@Pc(5) Class25 local5 = null;
		@Pc(12) int local12 = 2048;
		@Pc(14) Class165 local14 = null;
		if (arg3 != -1) {
			local14 = Static182.aClass140_1.method3446(arg3);
		}
		@Pc(26) int[] local26 = this.anIntArray219;
		if (local14 != null && local14.anIntArray333 != null) {
			local26 = new int[local14.anIntArray333.length];
			for (@Pc(38) int local38 = 0; local38 < local14.anIntArray333.length; local38++) {
				@Pc(44) int local44 = local14.anIntArray333[local38];
				if (local44 >= 0 && this.anIntArray219.length > local44) {
					local26[local38] = this.anIntArray219[local44];
				} else {
					local26[local38] = -1;
				}
			}
		}
		@Pc(75) boolean local75 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) boolean local81 = false;
		@Pc(83) int local83 = -1;
		@Pc(85) int local85 = -1;
		@Pc(87) int local87 = 0;
		@Pc(89) Class2_Sub5_Sub5 local89 = null;
		@Pc(91) Class2_Sub5_Sub5 local91 = null;
		if (arg6 != null) {
			local83 = arg6.anIntArray308[arg2];
			local12 = 2080;
			@Pc(106) int local106 = local83 >>> 16;
			local83 &= 0xFFFF;
			local89 = Static185.aClass303_1.method7206(local106);
			if (local89 != null) {
				local77 = local89.method1835(local83) | false;
				local75 = local89.method1838(local83) | false;
				local81 = local89.method1837(local83) | false;
				local79 = arg6.aBoolean375 | false;
			}
			if ((arg6.aBoolean379 || Static424.aBoolean577) && arg7 != -1 && arg7 < arg6.anIntArray308.length) {
				local85 = arg6.anIntArray308[arg7];
				local87 = arg6.anIntArray306[arg2];
				@Pc(171) int local171 = local85 >>> 16;
				local85 &= 0xFFFF;
				if (local106 == local171) {
					local91 = local89;
				} else {
					local91 = Static185.aClass303_1.method7206(local85 >>> 16);
				}
				if (local91 != null) {
					local77 |= local91.method1835(local85);
					local75 |= local91.method1838(local85);
					local81 |= local91.method1837(local85);
				}
			}
			if (local77) {
				local12 = 2208;
			}
			if (local75) {
				local12 |= 0x100;
			}
			if (local79) {
				local12 |= 0x200;
			}
			if (local81) {
				local12 |= 0x400;
			}
		}
		@Pc(254) long local254 = this.method2595(arg1, local26, arg3, arg5 == null ? null : arg5.anIntArray329);
		if (Static495.aClass233_48 != null) {
			local5 = (Class25) Static495.aClass233_48.method5669(local254);
		}
		if (local5 == null || arg4.method7950(local5.ua(), local12) != 0) {
			if (local5 != null) {
				local12 = arg4.method7952(local12, local5.ua());
			}
			@Pc(280) int local280 = local12;
			@Pc(282) boolean local282 = false;
			for (@Pc(284) int local284 = 0; local284 < local26.length; local284++) {
				if (local26[local284] != -1 && !Static570.aClass267_2.method6597(local26[local284]).method6282(arg1)) {
					local282 = true;
				}
			}
			if (local282) {
				return null;
			}
			@Pc(316) Class379[] local316 = new Class379[local26.length];
			for (@Pc(318) int local318 = 0; local318 < local26.length; local318++) {
				if (local26[local318] != -1) {
					local316[local318] = Static570.aClass267_2.method6597(local26[local318]).method6275(arg1);
				}
			}
			@Pc(373) int local373;
			@Pc(380) int local380;
			if (local14 != null && local14.anIntArrayArray39 != null) {
				for (@Pc(355) int local355 = 0; local355 < local14.anIntArrayArray39.length; local355++) {
					if (local14.anIntArrayArray39[local355] != null && local316[local355] != null) {
						local373 = local14.anIntArrayArray39[local355][0];
						local380 = local14.anIntArrayArray39[local355][1];
						@Pc(387) int local387 = local14.anIntArrayArray39[local355][2];
						@Pc(394) int local394 = local14.anIntArrayArray39[local355][3];
						@Pc(401) int local401 = local14.anIntArrayArray39[local355][4];
						@Pc(408) int local408 = local14.anIntArrayArray39[local355][5];
						if (local394 != 0 || local401 != 0 || local408 != 0) {
							local316[local355].method8585(local408, local394, local401);
						}
						if (local373 != 0 || local380 != 0 || local387 != 0) {
							local316[local355].method8584(local387, local380, local373);
						}
					}
				}
			}
			@Pc(463) Class379 local463 = new Class379(local316, local316.length);
			if (arg5 != null) {
				local280 = local12 | 0x4000;
			}
			local5 = arg4.method7975(local463, local280, Static464.anInt8027, 64, 850);
			if (arg5 != null) {
				for (local373 = 0; local373 < 5; local373++) {
					for (local380 = 0; local380 < Static200.aShortArrayArrayArray5.length; local380++) {
						if (Static200.aShortArrayArrayArray5[local380][local373].length > arg5.anIntArray329[local373]) {
							local5.ia(Static256.aShortArrayArray15[local380][local373], Static200.aShortArrayArrayArray5[local380][local373][arg5.anIntArray329[local373]]);
						}
					}
				}
			}
			if (Static495.aClass233_48 != null) {
				local5.s(local12);
				Static495.aClass233_48.method5662(local5, local254);
			}
		}
		if (arg6 == null || local89 == null) {
			return local5;
		} else {
			@Pc(554) Class25 local554 = local5.method7732((byte) 1, local12, true);
			local554.method7715(arg6.aBoolean375, local89, local83, 0, local85, arg0 - 1, local91, local87);
			return local554;
		}
	}
}
