import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "[I")
	public int[] anIntArray344 = new int[1];

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "[I")
	public int[] anIntArray345 = new int[] { -1 };

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!eb;BILclient!ya;ZIIILclient!id;)Lclient!t;")
	public Class116 method3314(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class135 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class119 arg7) {
		@Pc(7) Class116 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class42 local11 = null;
		if (arg0 != -1) {
			local11 = Static445.aClass1_1.method1(arg0);
		}
		@Pc(23) int[] local23 = this.anIntArray345;
		if (local11 != null && local11.anIntArray97 != null) {
			local23 = new int[local11.anIntArray97.length];
			for (@Pc(35) int local35 = 0; local35 < local11.anIntArray97.length; local35++) {
				@Pc(42) int local42 = local11.anIntArray97[local35];
				if (local42 >= 0 && local42 < this.anIntArray345.length) {
					local23[local35] = this.anIntArray345[local42];
				} else {
					local23[local35] = -1;
				}
			}
		}
		@Pc(74) boolean local74 = false;
		@Pc(81) boolean local81 = false;
		@Pc(83) boolean local83 = false;
		@Pc(85) boolean local85 = false;
		@Pc(87) int local87 = -1;
		@Pc(89) int local89 = -1;
		@Pc(91) int local91 = 0;
		@Pc(93) Class4_Sub2_Sub6 local93 = null;
		@Pc(95) Class4_Sub2_Sub6 local95 = null;
		if (arg7 != null) {
			local9 = 2080;
			local87 = arg7.anIntArray244[arg6];
			@Pc(110) int local110 = local87 >>> 16;
			local87 &= 0xFFFF;
			local93 = Static170.aClass125_3.method2383(local110);
			if (local93 != null) {
				local81 = local93.method783(local87) | false;
				local74 = local93.method781(local87) | false;
				local85 = local93.method780(local87) | false;
				local83 = arg7.aBoolean222 | false;
			}
			if ((arg7.aBoolean223 || Static272.aBoolean335) && arg5 != -1 && arg7.anIntArray244.length > arg5) {
				local91 = arg7.anIntArray242[arg6];
				local89 = arg7.anIntArray244[arg5];
				@Pc(180) int local180 = local89 >>> 16;
				local89 &= 0xFFFF;
				if (local110 == local180) {
					local95 = local93;
				} else {
					local95 = Static170.aClass125_3.method2383(local89 >>> 16);
				}
				if (local95 != null) {
					local81 |= local95.method783(local89);
					local74 |= local95.method781(local89);
					local85 |= local95.method780(local89);
				}
			}
			if (local81) {
				local9 = 2208;
			}
			if (local74) {
				local9 |= 0x100;
			}
			if (local83) {
				local9 |= 0x200;
			}
			if (local85) {
				local9 |= 0x400;
			}
		}
		@Pc(261) long local261 = this.method3316(arg0, local23, arg1 == null ? null : arg1.anIntArray122, arg4);
		if (Static310.aClass137_49 != null) {
			local7 = (Class116) Static310.aClass137_49.method2744(local261);
		}
		if (local7 == null || arg3.method5356(local7.P(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method5399(local9, local7.P());
			}
			@Pc(287) int local287 = local9;
			@Pc(289) boolean local289 = false;
			for (@Pc(291) int local291 = 0; local291 < local23.length; local291++) {
				if (local23[local291] != -1 && !Static416.aClass64_2.method1372(local23[local291]).method1610(arg4)) {
					local289 = true;
				}
			}
			if (local289) {
				return null;
			}
			@Pc(328) Class166[] local328 = new Class166[local23.length];
			for (@Pc(330) int local330 = 0; local330 < local23.length; local330++) {
				if (local23[local330] != -1) {
					local328[local330] = Static416.aClass64_2.method1372(local23[local330]).method1608(arg4);
				}
			}
			@Pc(382) int local382;
			if (local11 != null && local11.anIntArrayArray14 != null) {
				for (@Pc(362) int local362 = 0; local362 < local11.anIntArrayArray14.length; local362++) {
					if (local11.anIntArrayArray14[local362] != null && local328[local362] != null) {
						local382 = local11.anIntArrayArray14[local362][0];
						@Pc(389) int local389 = local11.anIntArrayArray14[local362][1];
						@Pc(396) int local396 = local11.anIntArrayArray14[local362][2];
						@Pc(403) int local403 = local11.anIntArrayArray14[local362][3];
						@Pc(410) int local410 = local11.anIntArrayArray14[local362][4];
						@Pc(417) int local417 = local11.anIntArrayArray14[local362][5];
						if (local403 != 0 || local410 != 0 || local417 != 0) {
							local328[local362].method3197(local410, local403, local417);
						}
						if (local382 != 0 || local389 != 0 || local396 != 0) {
							local328[local362].method3204(local396, local382, local389);
						}
					}
				}
			}
			@Pc(467) Class166 local467 = new Class166(local328, local328.length);
			if (arg1 != null) {
				local287 = local9 | 0x4000;
			}
			local7 = arg3.method5391(local467, local287, Static226.anInt3892, 64, 850);
			if (arg1 != null) {
				for (local382 = 0; local382 < 5; local382++) {
					if (Static180.aShortArrayArray3[local382].length > arg1.anIntArray122[local382]) {
						local7.BA(Static276.aShortArray84[local382], Static180.aShortArrayArray3[local382][arg1.anIntArray122[local382]]);
					}
					if (arg1.anIntArray122[local382] < Static155.aShortArrayArray2[local382].length) {
						local7.BA(Static34.aShortArray30[local382], Static155.aShortArrayArray2[local382][arg1.anIntArray122[local382]]);
					}
				}
			}
			if (Static310.aClass137_49 != null) {
				local7.UA(local9);
				Static310.aClass137_49.method2732(local261, local7);
			}
		}
		if (arg7 == null || local93 == null) {
			return local7;
		} else {
			@Pc(561) Class116 local561 = local7.method3123((byte) 1, local9, true);
			local561.method3109(arg7.aBoolean222, local93, arg2 - 1, local95, local89, 0, local87, local91);
			return local561;
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI[I[IZ)J")
	private long method3316(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(15) long[] local15 = Class8_Sub2_Sub3.aLongArray7;
		@Pc(17) long local17 = -1L;
		@Pc(33) long local33 = local15[(int) (((long) (arg0 >> 8) ^ local17) & 0xFFL)] ^ local17 >>> 8;
		local17 = local15[(int) (((long) arg0 ^ local33) & 0xFFL)] ^ local33 >>> 8;
		for (@Pc(49) int local49 = 0; local49 < arg1.length; local49++) {
			local17 = local17 >>> 8 ^ local15[(int) ((local17 ^ (long) (arg1[local49] >> 24)) & 0xFFL)];
			local17 = local15[(int) (((long) (arg1[local49] >> 16) ^ local17) & 0xFFL)] ^ local17 >>> 8;
			local17 = local15[(int) ((local17 ^ (long) (arg1[local49] >> 8)) & 0xFFL)] ^ local17 >>> 8;
			local17 = local15[(int) (((long) arg1[local49] ^ local17) & 0xFFL)] ^ local17 >>> 8;
		}
		if (arg2 != null) {
			for (@Pc(130) int local130 = 0; local130 < 5; local130++) {
				local17 = local17 >>> 8 ^ local15[(int) ((local17 ^ (long) arg2[local130]) & 0xFFL)];
			}
		}
		return local17 >>> 8 ^ local15[(int) ((local17 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}
}
