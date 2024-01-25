import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class6_Sub15 extends Class6 {

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "[I")
	public int[] anIntArray174 = new int[1];

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "[I")
	public int[] anIntArray173 = new int[] { -1 };

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[IZ[I)J")
	private long method2100(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(15) long[] local15 = Class108_Sub1.aLongArray2;
		@Pc(17) long local17 = -1L;
		@Pc(33) long local33 = local17 >>> 8 ^ local15[(int) (((long) (arg0 >> 8) ^ local17) & 0xFFL)];
		local17 = local15[(int) ((local33 ^ (long) arg0) & 0xFFL)] ^ local33 >>> 8;
		for (@Pc(49) int local49 = 0; local49 < arg3.length; local49++) {
			local17 = local17 >>> 8 ^ local15[(int) (((long) (arg3[local49] >> 24) ^ local17) & 0xFFL)];
			local17 = local17 >>> 8 ^ local15[(int) ((local17 ^ (long) (arg3[local49] >> 16)) & 0xFFL)];
			local17 = local15[(int) ((local17 ^ (long) (arg3[local49] >> 8)) & 0xFFL)] ^ local17 >>> 8;
			local17 = local15[(int) ((local17 ^ (long) arg3[local49]) & 0xFFL)] ^ local17 >>> 8;
		}
		if (arg1 != null) {
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				local17 = local17 >>> 8 ^ local15[(int) (((long) arg1[local130] ^ local17) & 0xFFL)];
			}
		}
		return local17 >>> 8 ^ local15[(int) ((local17 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!oa;ZIIIILclient!am;ZLclient!dea;)Lclient!ba;")
	public Class23 method2101(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class16 arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) Class67 arg7) {
		@Pc(7) Class23 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class169 local11 = null;
		if (arg3 != -1) {
			local11 = Static416.aClass250_1.method6264(arg3);
		}
		@Pc(23) int[] local23 = this.anIntArray173;
		if (local11 != null && local11.anIntArray328 != null) {
			local23 = new int[local11.anIntArray328.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray328.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray328[local35];
				if (local42 >= 0 && this.anIntArray173.length > local42) {
					local23[local35] = this.anIntArray173[local42];
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
		@Pc(91) Class6_Sub4_Sub15 local91 = null;
		@Pc(93) Class6_Sub4_Sub15 local93 = null;
		if (arg5 != null) {
			local9 = 2080;
			local85 = arg5.anIntArray47[arg2];
			@Pc(108) int local108 = local85 >>> 16;
			local85 &= 0xFFFF;
			local91 = Static114.aClass156_2.method4108(local108);
			if (local91 != null) {
				local79 = local91.method6848(local85) | false;
				local77 = local91.method6851(local85) | false;
				local83 = local91.method6847(local85) | false;
				local81 = arg5.aBoolean41 | false;
			}
			if ((arg5.aBoolean39 || Static305.aBoolean438) && arg4 != -1 && arg5.anIntArray47.length > arg4) {
				local87 = arg5.anIntArray47[arg4];
				local89 = arg5.anIntArray46[arg2];
				@Pc(176) int local176 = local87 >>> 16;
				local87 &= 0xFFFF;
				if (local108 == local176) {
					local93 = local91;
				} else {
					local93 = Static114.aClass156_2.method4108(local87 >>> 16);
				}
				if (local93 != null) {
					local79 |= local93.method6848(local87);
					local77 |= local93.method6851(local87);
					local83 |= local93.method6847(local87);
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
		@Pc(253) long local253 = this.method2100(arg3, arg7 == null ? null : arg7.anIntArray158, arg6, local23);
		if (Static572.aClass245_72 != null) {
			local7 = (Class23) Static572.aClass245_72.method6082(local253);
		}
		if (local7 == null || arg1.method5468(local7.h(), local9) != 0) {
			if (local7 != null) {
				local9 = arg1.method5416(local9, local7.h());
			}
			@Pc(282) int local282 = local9;
			@Pc(284) boolean local284 = false;
			for (@Pc(286) int local286 = 0; local286 < local23.length; local286++) {
				if (local23[local286] != -1 && !Static98.aClass203_1.method4899(local23[local286]).method3853(arg6)) {
					local284 = true;
				}
			}
			if (local284) {
				return null;
			}
			@Pc(319) Class260[] local319 = new Class260[local23.length];
			for (@Pc(321) int local321 = 0; local321 < local23.length; local321++) {
				if (local23[local321] != -1) {
					local319[local321] = Static98.aClass203_1.method4899(local23[local321]).method3841(arg6);
				}
			}
			@Pc(373) int local373;
			if (local11 != null && local11.anIntArrayArray35 != null) {
				for (@Pc(353) int local353 = 0; local353 < local11.anIntArrayArray35.length; local353++) {
					if (local11.anIntArrayArray35[local353] != null && local319[local353] != null) {
						local373 = local11.anIntArrayArray35[local353][0];
						@Pc(380) int local380 = local11.anIntArrayArray35[local353][1];
						@Pc(387) int local387 = local11.anIntArrayArray35[local353][2];
						@Pc(394) int local394 = local11.anIntArrayArray35[local353][3];
						@Pc(401) int local401 = local11.anIntArrayArray35[local353][4];
						@Pc(408) int local408 = local11.anIntArrayArray35[local353][5];
						if (local394 != 0 || local401 != 0 || local408 != 0) {
							local319[local353].method6430(local394, local408, local401);
						}
						if (local373 != 0 || local380 != 0 || local387 != 0) {
							local319[local353].method6426(local380, local373, local387);
						}
					}
				}
			}
			@Pc(463) Class260 local463 = new Class260(local319, local319.length);
			if (arg7 != null) {
				local282 = local9 | 0x4000;
			}
			local7 = arg1.method5404(local463, local282, Static248.anInt5069, 64, 850);
			if (arg7 != null) {
				for (local373 = 0; local373 < 5; local373++) {
					if (Static548.aShortArrayArray10[local373].length > arg7.anIntArray158[local373]) {
						local7.UA(Static223.aShortArray58[local373], Static548.aShortArrayArray10[local373][arg7.anIntArray158[local373]]);
					}
					if (arg7.anIntArray158[local373] < Static340.aShortArrayArray6[local373].length) {
						local7.UA(Static20.aShortArray65[local373], Static340.aShortArrayArray6[local373][arg7.anIntArray158[local373]]);
					}
				}
			}
			if (Static572.aClass245_72 != null) {
				local7.ia(local9);
				Static572.aClass245_72.method6075(local7, local253);
			}
		}
		if (arg5 == null || local91 == null) {
			return local7;
		} else {
			@Pc(559) Class23 local559 = local7.method7068((byte) 1, local9, true);
			local559.method7065(local91, local93, arg5.aBoolean41, local89, arg0 - 1, local87, local85, 0);
			return local559;
		}
	}
}
