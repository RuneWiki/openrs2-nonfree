import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class5_Sub43 extends Class5 {

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "[I")
	public int[] anIntArray405 = new int[1];

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "[I")
	public int[] anIntArray406 = new int[] { -1 };

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray8[local6] = (char) (local6 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray8[local20] = (char) (local20 + 71);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray8[local36] = (char) (local36 + 48 - 52);
		}
		aCharArray8[63] = '-';
		aCharArray8[62] = '*';
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "([I[IIZI)J")
	private long method5976(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(13) long[] local13 = Class25.aLongArray1;
		@Pc(15) long local15 = -1L;
		@Pc(31) long local31 = local15 >>> 8 ^ local13[(int) (((long) (arg3 >> 8) ^ local15) & 0xFFL)];
		local15 = local13[(int) (((long) arg3 ^ local31) & 0xFFL)] ^ local31 >>> 8;
		for (@Pc(47) int local47 = 0; local47 < arg0.length; local47++) {
			local15 = local15 >>> 8 ^ local13[(int) (((long) (arg0[local47] >> 24) ^ local15) & 0xFFL)];
			local15 = local13[(int) (((long) (arg0[local47] >> 16) ^ local15) & 0xFFL)] ^ local15 >>> 8;
			local15 = local15 >>> 8 ^ local13[(int) (((long) (arg0[local47] >> 8) ^ local15) & 0xFFL)];
			local15 = local13[(int) ((local15 ^ (long) arg0[local47]) & 0xFFL)] ^ local15 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				local15 = local13[(int) ((local15 ^ (long) arg1[local132]) & 0xFFL)] ^ local15 >>> 8;
			}
		}
		return local15 >>> 8 ^ local13[(int) ((local15 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!jba;IIIIZILclient!lga;Lclient!ha;)Lclient!ka;")
	public Class153 method5979(@OriginalArg(0) int arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class213 arg6, @OriginalArg(9) Class65 arg7) {
		@Pc(7) Class153 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class167 local11 = null;
		if (arg0 != -1) {
			local11 = Static299.aClass286_2.method6793(arg0);
		}
		@Pc(23) int[] local23 = this.anIntArray406;
		if (local11 != null && local11.anIntArray259 != null) {
			local23 = new int[local11.anIntArray259.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray259.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray259[local35];
				if (local42 >= 0 && local42 < this.anIntArray406.length) {
					local23[local35] = this.anIntArray406[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) boolean local81 = false;
		@Pc(83) boolean local83 = false;
		@Pc(85) int local85 = -1;
		@Pc(87) int local87 = -1;
		@Pc(89) int local89 = 0;
		@Pc(91) Class5_Sub3_Sub9 local91 = null;
		@Pc(93) Class5_Sub3_Sub9 local93 = null;
		if (arg1 != null) {
			local9 = 2080;
			local85 = arg1.anIntArray288[arg2];
			@Pc(108) int local108 = local85 >>> 16;
			local85 &= 0xFFFF;
			local91 = Static591.aClass66_2.method1767(local108);
			if (local91 != null) {
				local79 = local91.method4152(local85) | false;
				local77 = local91.method4156(local85) | false;
				local83 = local91.method4151(local85) | false;
				local81 = arg1.aBoolean424 | false;
			}
			if ((arg1.aBoolean426 || Static31.aBoolean30) && arg3 != -1 && arg3 < arg1.anIntArray288.length) {
				local89 = arg1.anIntArray291[arg2];
				local87 = arg1.anIntArray288[arg3];
				@Pc(181) int local181 = local87 >>> 16;
				local87 &= 0xFFFF;
				if (local108 == local181) {
					local93 = local91;
				} else {
					local93 = Static591.aClass66_2.method1767(local87 >>> 16);
				}
				if (local93 != null) {
					local79 |= local93.method4152(local87);
					local77 |= local93.method4156(local87);
					local83 |= local93.method4151(local87);
				}
			}
			if (local79) {
				local9 = 2208;
			}
			if (local77) {
				local9 |= 0x100;
			}
			if (local81) {
				local9 |= 0x200;
			}
			if (local83) {
				local9 |= 0x400;
			}
		}
		@Pc(258) long local258 = this.method5976(local23, arg6 == null ? null : arg6.anIntArray363, arg4, arg0);
		if (Static166.aClass340_19 != null) {
			local7 = (Class153) Static166.aClass340_19.method7999(local258);
		}
		if (local7 == null || arg7.method6885(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method6882(local9, local7.ua());
			}
			@Pc(287) int local287 = local9;
			@Pc(289) boolean local289 = false;
			for (@Pc(291) int local291 = 0; local291 < local23.length; local291++) {
				if (local23[local291] != -1 && !Static110.aClass105_1.method2659(local23[local291]).method5703((Class154) null, arg4)) {
					local289 = true;
				}
			}
			if (local289) {
				return null;
			}
			@Pc(324) Class329[] local324 = new Class329[local23.length];
			for (@Pc(326) int local326 = 0; local326 < local23.length; local326++) {
				if (local23[local326] != -1) {
					local324[local326] = Static110.aClass105_1.method2659(local23[local326]).method5707((Class154) null, arg4);
				}
			}
			@Pc(381) int local381;
			@Pc(388) int local388;
			if (local11 != null && local11.anIntArrayArray22 != null) {
				for (@Pc(361) int local361 = 0; local361 < local11.anIntArrayArray22.length; local361++) {
					if (local11.anIntArrayArray22[local361] != null && local324[local361] != null) {
						local381 = local11.anIntArrayArray22[local361][0];
						local388 = local11.anIntArrayArray22[local361][1];
						@Pc(395) int local395 = local11.anIntArrayArray22[local361][2];
						@Pc(402) int local402 = local11.anIntArrayArray22[local361][3];
						@Pc(409) int local409 = local11.anIntArrayArray22[local361][4];
						@Pc(416) int local416 = local11.anIntArrayArray22[local361][5];
						if (local402 != 0 || local409 != 0 || local416 != 0) {
							local324[local361].method7684(local402, local416, local409);
						}
						if (local381 != 0 || local388 != 0 || local395 != 0) {
							local324[local361].method7674(local381, local395, local388);
						}
					}
				}
			}
			if (arg6 != null) {
				local287 = local9 | 0x4000;
			}
			@Pc(479) Class329 local479 = new Class329(local324, local324.length);
			local7 = arg7.method6964(local479, local287, Static368.anInt6667, 64, 850);
			if (arg6 != null) {
				for (local381 = 0; local381 < 5; local381++) {
					for (local388 = 0; local388 < Static551.aShortArrayArrayArray4.length; local388++) {
						if (Static551.aShortArrayArrayArray4[local388][local381].length > arg6.anIntArray363[local381]) {
							local7.ia(Static661.aShortArrayArray18[local388][local381], Static551.aShortArrayArrayArray4[local388][local381][arg6.anIntArray363[local381]]);
						}
					}
				}
			}
			if (Static166.aClass340_19 != null) {
				local7.s(local9);
				Static166.aClass340_19.method7986(local258, local7);
			}
		}
		if (arg1 == null || local91 == null) {
			return local7;
		} else {
			@Pc(556) Class153 local556 = local7.method8580((byte) 1, local9, true);
			local556.method8599(arg5 - 1, local89, local93, 0, local85, local87, arg1.aBoolean424, local91);
			return local556;
		}
	}
}
