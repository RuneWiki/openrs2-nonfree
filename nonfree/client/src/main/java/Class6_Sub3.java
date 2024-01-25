import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "[I")
	public int[] anIntArray20 = new int[1];

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "[I")
	public int[] anIntArray21 = new int[] { -1 };

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "([IZBI[I)J")
	private long method349(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		@Pc(7) long[] local7 = Class20.aLongArray1;
		@Pc(9) long local9 = -1L;
		@Pc(31) long local31 = local9 >>> 8 ^ local7[(int) (((long) (arg2 >> 8) ^ local9) & 0xFFL)];
		local9 = local31 >>> 8 ^ local7[(int) ((local31 ^ (long) arg2) & 0xFFL)];
		for (@Pc(47) int local47 = 0; local47 < arg3.length; local47++) {
			local9 = local7[(int) (((long) (arg3[local47] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg3[local47] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg3[local47] >> 8)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg3[local47]) & 0xFFL)];
		}
		if (arg0 != null) {
			for (@Pc(132) int local132 = 0; local132 < 5; local132++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local132]) & 0xFFL)];
			}
		}
		return local7[(int) (((long) (arg1 ? 1 : 0) ^ local9) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!dea;ILclient!qu;BIZLclient!ha;)Lclient!ka;")
	public Class54 method354(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) Class75 arg4) {
		@Pc(7) Class54 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(17) Class396 local17 = null;
		if (arg1 != -1) {
			local17 = Static551.aClass392_1.method8909(arg1);
		}
		@Pc(29) int[] local29 = this.anIntArray21;
		if (local17 != null && local17.anIntArray695 != null) {
			local29 = new int[local17.anIntArray695.length];
			for (@Pc(43) int local43 = 0; local43 < local17.anIntArray695.length; local43++) {
				@Pc(50) int local50 = local17.anIntArray695[local43];
				if (local50 >= 0 && local50 < this.anIntArray21.length) {
					local29[local43] = this.anIntArray21[local50];
				} else {
					local29[local43] = -1;
				}
			}
		}
		if (arg2 != null) {
			local9 = arg2.method9025() | 0x800;
		}
		@Pc(106) long local106 = this.method349(arg0 == null ? null : arg0.anIntArray88, arg3, arg1, local29);
		if (Static3.aClass359_1 != null) {
			local7 = (Class54) Static3.aClass359_1.method8517(local106);
		}
		if (local7 == null || arg4.method6712(local7.ua(), local9) != 0) {
			if (local7 != null) {
				local9 = arg4.method6686(local9, local7.ua());
			}
			@Pc(136) int local136 = local9;
			@Pc(138) boolean local138 = false;
			for (@Pc(140) int local140 = 0; local140 < local29.length; local140++) {
				if (local29[local140] != -1 && !Static149.aClass244_1.method5958(local29[local140]).method6971(arg3, (Class383) null)) {
					local138 = true;
				}
			}
			if (local138) {
				return null;
			}
			@Pc(186) Class316[] local186 = new Class316[local29.length];
			for (@Pc(188) int local188 = 0; local188 < local29.length; local188++) {
				if (local29[local188] != -1) {
					local186[local188] = Static149.aClass244_1.method5958(local29[local188]).method6982(arg3, (Class383) null);
				}
			}
			@Pc(261) int local261;
			@Pc(268) int local268;
			if (local17 != null && local17.anIntArrayArray60 != null) {
				for (@Pc(235) int local235 = 0; local235 < local17.anIntArrayArray60.length; local235++) {
					if (local17.anIntArrayArray60[local235] != null && local186[local235] != null) {
						local261 = local17.anIntArrayArray60[local235][0];
						local268 = local17.anIntArrayArray60[local235][1];
						@Pc(275) int local275 = local17.anIntArrayArray60[local235][2];
						@Pc(282) int local282 = local17.anIntArrayArray60[local235][3];
						@Pc(289) int local289 = local17.anIntArrayArray60[local235][4];
						@Pc(296) int local296 = local17.anIntArrayArray60[local235][5];
						if (local282 != 0 || local289 != 0 || local296 != 0) {
							local186[local235].method7541(local296, local282, local289);
						}
						if (local261 != 0 || local268 != 0 || local275 != 0) {
							local186[local235].method7544(local261, local275, local268);
						}
					}
				}
			}
			if (arg0 != null) {
				local136 = local9 | 0x4000;
			}
			@Pc(370) Class316 local370 = new Class316(local186, local186.length);
			local7 = arg4.method6688(local370, local136, Static669.anInt10290, 64, 850);
			if (arg0 != null) {
				for (local261 = 0; local261 < 5; local261++) {
					for (local268 = 0; local268 < Static299.aShortArrayArrayArray2.length; local268++) {
						if (arg0.anIntArray88[local261] < Static299.aShortArrayArrayArray2[local268][local261].length) {
							local7.ia(Static98.aShortArrayArray4[local268][local261], Static299.aShortArrayArrayArray2[local268][local261][arg0.anIntArray88[local261]]);
						}
					}
				}
			}
			if (Static3.aClass359_1 != null) {
				local7.s(local9);
				Static3.aClass359_1.method8515(local106, local7);
			}
		}
		if (arg2 == null) {
			return local7;
		} else {
			@Pc(462) Class54 local462 = local7.method7398((byte) 1, local9, true);
			arg2.method9020(0, local462);
			return local462;
		}
	}
}
