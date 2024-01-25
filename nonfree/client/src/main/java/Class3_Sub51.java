import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class3_Sub51 extends Class3 {

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "[I")
	public int[] anIntArray577 = new int[] { -1 };

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "[I")
	public int[] anIntArray576 = new int[1];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IZILclient!maa;Lclient!js;ILclient!ha;)Lclient!ka;")
	public Class157 method8447(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class236 arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(6) Class67 arg4) {
		@Pc(7) Class157 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class274 local11 = null;
		if (arg1 != -1) {
			local11 = Static255.aClass238_1.method5902(arg1);
		}
		@Pc(22) int[] local22 = this.anIntArray577;
		if (local11 != null && local11.anIntArray440 != null) {
			local22 = new int[local11.anIntArray440.length];
			for (@Pc(36) int local36 = 0; local36 < local11.anIntArray440.length; local36++) {
				@Pc(43) int local43 = local11.anIntArray440[local36];
				if (local43 >= 0 && this.anIntArray577.length > local43) {
					local22[local36] = this.anIntArray577[local43];
				} else {
					local22[local36] = -1;
				}
			}
		}
		if (arg3 != null) {
			local9 = arg3.method8967() | 0x800;
		}
		@Pc(106) long local106 = this.method8448(arg1, arg2 == null ? null : arg2.anIntArray373, arg0, local22);
		if (Static526.aClass338_44 != null) {
			local7 = (Class157) Static526.aClass338_44.method8049(local106);
		}
		if (local7 == null || arg4.method7660(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method7671(local9, local7.ua());
			}
			@Pc(136) int local136 = local9;
			@Pc(138) boolean local138 = false;
			for (@Pc(140) int local140 = 0; local140 < local22.length; local140++) {
				if (local22[local140] != -1 && !Static243.aClass406_2.method9394(local22[local140]).method2371((Class22) null, arg0)) {
					local138 = true;
				}
			}
			if (local138) {
				return null;
			}
			@Pc(187) Class178[] local187 = new Class178[local22.length];
			for (@Pc(189) int local189 = 0; local189 < local22.length; local189++) {
				if (local22[local189] != -1) {
					local187[local189] = Static243.aClass406_2.method9394(local22[local189]).method2383((Class22) null, arg0);
				}
			}
			@Pc(261) int local261;
			@Pc(268) int local268;
			if (local11 != null && local11.anIntArrayArray44 != null) {
				for (@Pc(235) int local235 = 0; local235 < local11.anIntArrayArray44.length; local235++) {
					if (local11.anIntArrayArray44[local235] != null && local187[local235] != null) {
						local261 = local11.anIntArrayArray44[local235][0];
						local268 = local11.anIntArrayArray44[local235][1];
						@Pc(275) int local275 = local11.anIntArrayArray44[local235][2];
						@Pc(282) int local282 = local11.anIntArrayArray44[local235][3];
						@Pc(289) int local289 = local11.anIntArrayArray44[local235][4];
						@Pc(296) int local296 = local11.anIntArrayArray44[local235][5];
						if (local282 != 0 || local289 != 0 || local296 != 0) {
							local187[local235].method4276(local296, local282, local289);
						}
						if (local261 != 0 || local268 != 0 || local275 != 0) {
							local187[local235].method4272(local275, local268, local261);
						}
					}
				}
			}
			if (arg2 != null) {
				local136 = local9 | 0x4000;
			}
			@Pc(366) Class178 local366 = new Class178(local187, local187.length);
			local7 = arg4.method7653(local366, local136, Static217.anInt4229, 64, 850);
			if (arg2 != null) {
				for (local261 = 0; local261 < 10; local261++) {
					for (local268 = 0; local268 < Static576.aShortArrayArray4[local261].length; local268++) {
						if (Static92.aShortArrayArrayArray1[local261][local268].length > arg2.anIntArray373[local261]) {
							local7.ia(Static576.aShortArrayArray4[local261][local268], Static92.aShortArrayArrayArray1[local261][local268][arg2.anIntArray373[local261]]);
						}
					}
				}
			}
			if (Static526.aClass338_44 != null) {
				local7.s(local9);
				Static526.aClass338_44.method8044(local106, local7);
			}
		}
		if (arg3 == null) {
			return local7;
		} else {
			@Pc(472) Class157 local472 = local7.method5211((byte) 1, local9, true);
			arg3.method8978(0, local472);
			return local472;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I[IIZ[I)J")
	private long method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class3_Sub28_Sub2.aLongArray10;
		@Pc(21) long local21 = -1L;
		@Pc(37) long local37 = local21 >>> 8 ^ local7[(int) ((local21 ^ (long) (arg0 >> 8)) & 0xFFL)];
		local21 = local7[(int) (((long) arg0 ^ local37) & 0xFFL)] ^ local37 >>> 8;
		for (@Pc(53) int local53 = 0; local53 < arg3.length; local53++) {
			local21 = local7[(int) (((long) (arg3[local53] >> 24) ^ local21) & 0xFFL)] ^ local21 >>> 8;
			local21 = local7[(int) ((local21 ^ (long) (arg3[local53] >> 16)) & 0xFFL)] ^ local21 >>> 8;
			local21 = local21 >>> 8 ^ local7[(int) (((long) (arg3[local53] >> 8) ^ local21) & 0xFFL)];
			local21 = local21 >>> 8 ^ local7[(int) ((local21 ^ (long) arg3[local53]) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(142) int local142 = 0; local142 < 5; local142++) {
				local21 = local7[(int) (((long) arg1[local142] ^ local21) & 0xFFL)] ^ local21 >>> 8;
			}
		}
		return local21 >>> 8 ^ local7[(int) (((long) (arg2 ? 1 : 0) ^ local21) & 0xFFL)];
	}
}
