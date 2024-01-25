import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class6_Sub38 extends Class6 {

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "[I")
	public int[] anIntArray652 = new int[1];

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "[I")
	public int[] anIntArray653 = new int[] { -1 };

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIBLclient!bn;Lclient!bq;ZLclient!ja;II)Lclient!rc;")
	public Class78 method5257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class21 arg2, @OriginalArg(5) Class24 arg3, @OriginalArg(6) boolean arg4, @OriginalArg(7) Class81 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class78 local7 = null;
		@Pc(9) int local9 = 1024;
		@Pc(11) Class128 local11 = null;
		if (arg1 != -1) {
			local11 = Static279.method4823(arg1);
		}
		@Pc(22) int[] local22 = this.anIntArray653;
		if (local11 != null && local11.anIntArray398 != null) {
			local22 = new int[local11.anIntArray398.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray398.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray398[local34];
				if (local41 >= 0 && this.anIntArray653.length > local41) {
					local22[local34] = this.anIntArray653[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(76) boolean local76 = false;
		@Pc(78) boolean local78 = false;
		@Pc(80) boolean local80 = false;
		@Pc(82) int local82 = -1;
		@Pc(84) int local84 = -1;
		@Pc(86) int local86 = 0;
		@Pc(88) Class6_Sub2_Sub9 local88 = null;
		@Pc(90) Class6_Sub2_Sub9 local90 = null;
		if (arg3 != null) {
			local82 = arg3.anIntArray64[arg7];
			local9 = 1056;
			@Pc(105) int local105 = local82 >>> 16;
			local82 &= 0xFFFF;
			local88 = Static109.method2198(local105);
			if (local88 != null) {
				local78 = local88.method3163(local82) | false;
				local76 = local88.method3161(local82) | false;
				local80 = arg3.aBoolean46 | false;
			}
			if ((arg3.aBoolean43 || Static139.aBoolean207) && arg6 != -1 && arg6 < arg3.anIntArray64.length) {
				local84 = arg3.anIntArray64[arg6];
				local86 = arg3.anIntArray66[arg7];
				@Pc(162) int local162 = local84 >>> 16;
				local84 &= 0xFFFF;
				if (local162 == local105) {
					local90 = local88;
				} else {
					local90 = Static109.method2198(local84 >>> 16);
				}
				if (local90 != null) {
					local78 |= local90.method3163(local84);
					local76 |= local90.method3161(local84);
				}
			}
			if (local78) {
				local9 = 1184;
			}
			if (local76) {
				local9 |= 0x100;
			}
			if (local80) {
				local9 |= 0x200;
			}
		}
		@Pc(231) long local231 = this.method5258(arg1, arg4, local22, arg2 == null ? null : arg2.anIntArray61);
		if (Static21.aClass70_10 != null) {
			local7 = (Class78) Static21.aClass70_10.method1396(local231);
		}
		if (local7 == null || arg5.method2958(local7.method4652(), local9) != 0) {
			if (local7 != null) {
				local9 = arg5.method2994(local9, local7.method4652());
			}
			@Pc(260) int local260 = local9;
			@Pc(262) boolean local262 = false;
			for (@Pc(264) int local264 = 0; local264 < local22.length; local264++) {
				if (local22[local264] != -1 && !Static211.method3762(local22[local264]).method3845(arg4)) {
					local262 = true;
				}
			}
			if (local262) {
				return null;
			}
			@Pc(304) Class57[] local304 = new Class57[local22.length];
			for (@Pc(306) int local306 = 0; local306 < local22.length; local306++) {
				if (local22[local306] != -1) {
					local304[local306] = Static211.method3762(local22[local306]).method3858(arg4);
				}
			}
			@Pc(360) int local360;
			if (local11 != null && local11.anIntArrayArray123 != null) {
				for (@Pc(340) int local340 = 0; local340 < local11.anIntArrayArray123.length; local340++) {
					if (local11.anIntArrayArray123[local340] != null && local304[local340] != null) {
						local360 = local11.anIntArrayArray123[local340][0];
						@Pc(367) int local367 = local11.anIntArrayArray123[local340][1];
						@Pc(374) int local374 = local11.anIntArrayArray123[local340][2];
						@Pc(381) int local381 = local11.anIntArrayArray123[local340][3];
						@Pc(388) int local388 = local11.anIntArrayArray123[local340][4];
						@Pc(395) int local395 = local11.anIntArrayArray123[local340][5];
						if (local381 != 0 || local388 != 0 || local395 != 0) {
							local304[local340].method1140(local395, local388, local381);
						}
						if (local360 != 0 || local367 != 0 || local374 != 0) {
							local304[local340].method1132(local367, local374, local360);
						}
					}
				}
			}
			@Pc(445) Class57 local445 = new Class57(local304, local304.length);
			if (arg2 != null) {
				local260 = local9 | 0x2000;
			}
			local7 = arg5.method3016(local445, local260, Static233.anInt4345, 64, 850);
			if (arg2 != null) {
				for (local360 = 0; local360 < 5; local360++) {
					if (arg2.anIntArray61[local360] < Static263.aShortArrayArray46[local360].length) {
						local7.method4645(Static318.aShortArray113[local360], Static263.aShortArrayArray46[local360][arg2.anIntArray61[local360]]);
					}
					if (Static191.aShortArrayArray32[local360].length > arg2.anIntArray61[local360]) {
						local7.method4645(Static230.aShortArray76[local360], Static191.aShortArrayArray32[local360][arg2.anIntArray61[local360]]);
					}
				}
			}
			if (Static21.aClass70_10 != null) {
				local7.method4624(local9);
				Static21.aClass70_10.method1406(local7, local231);
			}
		}
		if (arg3 == null || local88 == null) {
			return local7;
		} else {
			@Pc(539) Class78 local539 = local7.method4661((byte) 1, local9, true);
			local539.method4628(local88, local84, local86, arg3.aBoolean46, local90, 0, arg0 - 1, local82);
			return local539;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZB[I[I)J")
	private long method5258(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class6_Sub16.aLongArray4;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local7[(int) (((long) (arg0 >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg0 ^ local25) & 0xFFL)];
		for (@Pc(47) int local47 = 0; local47 < arg2.length; local47++) {
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local47] >> 24)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local47] >> 16)) & 0xFFL)];
			local9 = local7[(int) (((long) (arg2[local47] >> 8) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) arg2[local47] ^ local9) & 0xFFL)];
		}
		if (arg3 != null) {
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				local9 = local7[(int) ((local9 ^ (long) arg3[local132]) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg1 ? 1 : 0)) & 0xFFL)];
	}
}
