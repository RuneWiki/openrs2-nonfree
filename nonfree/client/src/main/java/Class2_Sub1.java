import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "[I")
	public int[] anIntArray14 = new int[] { -1 };

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "[I")
	public int[] anIntArray15 = new int[1];

	static {
		new Class32(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "([I[IIIZ)J")
	private long method28(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class209.aLongArray7;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg2 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg2 ^ local25) & 0xFFL)];
		for (@Pc(46) int local46 = 0; local46 < arg1.length; local46++) {
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local46] >> 24) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) (arg1[local46] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1[local46] >> 8)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg1[local46]) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local9 = local9 >>> 8 ^ local7[(int) (((long) arg0[local131] ^ local9) & 0xFFL)];
			}
		}
		return local9 >>> 8 ^ local7[(int) (((long) (arg3 ? 1 : 0) ^ local9) & 0xFFL)];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIILclient!qp;IILclient!tj;IZLclient!vc;)Lclient!n;")
	public Class66 method32(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class202 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class224 arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) Class63 arg7) {
		@Pc(7) Class66 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class103 local11 = null;
		if (arg4 != -1) {
			local11 = Static46.aClass139_1.method3157(arg4);
		}
		@Pc(25) int[] local25 = this.anIntArray14;
		if (local11 != null && local11.anIntArray581 != null) {
			local25 = new int[local11.anIntArray581.length];
			for (@Pc(37) int local37 = 0; local37 < local11.anIntArray581.length; local37++) {
				@Pc(44) int local44 = local11.anIntArray581[local37];
				if (local44 >= 0 && this.anIntArray14.length > local44) {
					local25[local37] = this.anIntArray14[local44];
				} else {
					local25[local37] = -1;
				}
			}
		}
		@Pc(75) boolean local75 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) int local81 = -1;
		@Pc(83) int local83 = -1;
		@Pc(85) int local85 = 0;
		@Pc(87) Class2_Sub10_Sub12 local87 = null;
		@Pc(89) Class2_Sub10_Sub12 local89 = null;
		if (arg2 != null) {
			local9 = 1056;
			local81 = arg2.anIntArray974[arg3];
			@Pc(104) int local104 = local81 >>> 16;
			local87 = Static36.aClass236_1.method5395(local104);
			local81 &= 0xFFFF;
			if (local87 != null) {
				local77 = local87.method3682(local81) | false;
				local75 = local87.method3683(local81) | false;
				local79 = arg2.aBoolean373 | false;
			}
			if ((arg2.aBoolean376 || Static298.aBoolean384) && arg0 != -1 && arg2.anIntArray974.length > arg0) {
				local85 = arg2.anIntArray973[arg3];
				local83 = arg2.anIntArray974[arg0];
				@Pc(165) int local165 = local83 >>> 16;
				local83 &= 0xFFFF;
				if (local104 == local165) {
					local89 = local87;
				} else {
					local89 = Static36.aClass236_1.method5395(local83 >>> 16);
				}
				if (local89 != null) {
					local77 |= local89.method3682(local83);
					local75 |= local89.method3683(local83);
				}
			}
			if (local77) {
				local9 = 1184;
			}
			if (local75) {
				local9 |= 0x100;
			}
			if (local79) {
				local9 |= 0x200;
			}
		}
		@Pc(235) long local235 = this.method28(arg5 == null ? null : arg5.anIntArray1158, local25, arg4, arg6);
		if (Static241.aClass160_37 != null) {
			local7 = (Class66) Static241.aClass160_37.method3599(local235);
		}
		if (local7 == null || arg7.method2051(local7.method5127(), local9) != 0) {
			if (local7 != null) {
				local9 = arg7.method2031(local9, local7.method5127());
			}
			@Pc(264) int local264 = local9;
			@Pc(266) boolean local266 = false;
			for (@Pc(268) int local268 = 0; local268 < local25.length; local268++) {
				if (local25[local268] != -1 && !Static15.aClass81_1.method2175(local25[local268]).method3942(arg6)) {
					local266 = true;
				}
			}
			if (local266) {
				return null;
			}
			@Pc(305) Class200[] local305 = new Class200[local25.length];
			for (@Pc(307) int local307 = 0; local307 < local25.length; local307++) {
				if (local25[local307] != -1) {
					local305[local307] = Static15.aClass81_1.method2175(local25[local307]).method3948(arg6);
				}
			}
			@Pc(359) int local359;
			if (local11 != null && local11.anIntArrayArray24 != null) {
				for (@Pc(339) int local339 = 0; local339 < local11.anIntArrayArray24.length; local339++) {
					if (local11.anIntArrayArray24[local339] != null && local305[local339] != null) {
						local359 = local11.anIntArrayArray24[local339][0];
						@Pc(366) int local366 = local11.anIntArrayArray24[local339][1];
						@Pc(373) int local373 = local11.anIntArrayArray24[local339][2];
						@Pc(380) int local380 = local11.anIntArrayArray24[local339][3];
						@Pc(387) int local387 = local11.anIntArrayArray24[local339][4];
						@Pc(394) int local394 = local11.anIntArrayArray24[local339][5];
						if (local380 != 0 || local387 != 0 || local394 != 0) {
							local305[local339].method4265(local394, local387, local380);
						}
						if (local359 != 0 || local366 != 0 || local373 != 0) {
							local305[local339].method4264(local366, local373, local359);
						}
					}
				}
			}
			@Pc(453) Class200 local453 = new Class200(local305, local305.length);
			if (arg5 != null) {
				local264 = local9 | 0x2000;
			}
			local7 = arg7.method1998(local453, local264, Static359.anInt6026, 64, 850);
			if (arg5 != null) {
				for (local359 = 0; local359 < 5; local359++) {
					if (arg5.anIntArray1158[local359] < Static158.aShortArrayArray3[local359].length) {
						local7.method5147(Static216.aShortArray69[local359], Static158.aShortArrayArray3[local359][arg5.anIntArray1158[local359]]);
					}
					if (Static283.aShortArrayArray7[local359].length > arg5.anIntArray1158[local359]) {
						local7.method5147(Static325.aShortArray104[local359], Static283.aShortArrayArray7[local359][arg5.anIntArray1158[local359]]);
					}
				}
			}
			if (Static241.aClass160_37 != null) {
				local7.method5118(local9);
				Static241.aClass160_37.method3602(local235, local7);
			}
		}
		if (arg2 == null || local87 == null) {
			return local7;
		} else {
			@Pc(551) Class66 local551 = local7.method5119((byte) 1, local9, true);
			local551.method5143(local83, arg2.aBoolean373, local81, local89, local85, local87, 0, arg1 - 1);
			return local551;
		}
	}
}
