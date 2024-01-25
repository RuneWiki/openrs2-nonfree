import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!ct", name = "q", descriptor = "[I")
	public int[] anIntArray118 = new int[] { -1 };

	@OriginalMember(owner = "client!ct", name = "t", descriptor = "[I")
	public int[] anIntArray119 = new int[1];

	static {
		new Class45("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I[I[IIZ)J")
	private long method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class97_Sub3.aLongArray15;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg0 >> 8)) & 0xFFL)];
		local9 = local7[(int) ((local25 ^ (long) arg0) & 0xFFL)] ^ local25 >>> 8;
		for (@Pc(46) int local46 = 0; local46 < arg2.length; local46++) {
			local9 = local7[(int) (((long) (arg2[local46] >> 24) ^ local9) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2[local46] >> 16)) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg2[local46] >> 8) ^ local9) & 0xFFL)];
			local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg2[local46]) & 0xFFL)];
		}
		if (arg1 != null) {
			for (@Pc(131) int local131 = 0; local131 < 5; local131++) {
				local9 = local7[(int) (((long) arg1[local131] ^ local9) & 0xFFL)] ^ local9 >>> 8;
			}
		}
		return local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZIIBILclient!pf;Lclient!qa;ILclient!lk;)Lclient!r;")
	public Class97 method1693(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) Class225 arg4, @OriginalArg(7) Class4 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class176 arg7) {
		@Pc(12) Class97 local12 = null;
		@Pc(14) int local14 = 2048;
		@Pc(16) Class299 local16 = null;
		if (arg6 != -1) {
			local16 = Static398.aClass167_1.method4607(arg6);
		}
		@Pc(27) int[] local27 = this.anIntArray118;
		if (local16 != null && local16.anIntArray772 != null) {
			local27 = new int[local16.anIntArray772.length];
			for (@Pc(39) int local39 = 0; local39 < local16.anIntArray772.length; local39++) {
				@Pc(46) int local46 = local16.anIntArray772[local39];
				if (local46 >= 0 && this.anIntArray118.length > local46) {
					local27[local39] = this.anIntArray118[local46];
				} else {
					local27[local39] = -1;
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
		@Pc(91) Class1_Sub2_Sub17 local91 = null;
		@Pc(93) Class1_Sub2_Sub17 local93 = null;
		if (arg7 != null) {
			local85 = arg7.anIntArray432[arg3];
			local14 = 2080;
			@Pc(108) int local108 = local85 >>> 16;
			local85 &= 0xFFFF;
			local91 = Static35.aClass152_1.method4041(local108);
			if (local91 != null) {
				local79 = local91.method6818(local85) | false;
				local77 = local91.method6820(local85) | false;
				local83 = local91.method6816(local85) | false;
				local81 = arg7.aBoolean394 | false;
			}
			if ((arg7.aBoolean395 || Static294.aBoolean419) && arg0 != -1 && arg0 < arg7.anIntArray432.length) {
				local89 = arg7.anIntArray433[arg3];
				local87 = arg7.anIntArray432[arg0];
				@Pc(174) int local174 = local87 >>> 16;
				local87 &= 0xFFFF;
				if (local174 == local108) {
					local93 = local91;
				} else {
					local93 = Static35.aClass152_1.method4041(local87 >>> 16);
				}
				if (local93 != null) {
					local79 |= local93.method6818(local87);
					local77 |= local93.method6820(local87);
					local83 |= local93.method6816(local87);
				}
			}
			if (local79) {
				local14 = 2208;
			}
			if (local77) {
				local14 |= 0x100;
			}
			if (local81) {
				local14 |= 0x200;
			}
			if (local83) {
				local14 |= 0x400;
			}
		}
		@Pc(255) long local255 = this.method1692(arg6, arg4 == null ? null : arg4.anIntArray647, local27, arg1);
		if (Static461.aClass277_67 != null) {
			local12 = (Class97) Static461.aClass277_67.method7014(local255);
		}
		if (local12 == null || arg5.method7167(local12.ba(), local14) != 0) {
			if (local12 != null) {
				local14 = arg5.method7184(local14, local12.ba());
			}
			@Pc(284) int local284 = local14;
			@Pc(286) boolean local286 = false;
			for (@Pc(288) int local288 = 0; local288 < local27.length; local288++) {
				if (local27[local288] != -1 && !Static181.aClass316_1.method8107(local27[local288]).method4983(arg1)) {
					local286 = true;
				}
			}
			if (local286) {
				return null;
			}
			@Pc(326) Class81[] local326 = new Class81[local27.length];
			for (@Pc(328) int local328 = 0; local328 < local27.length; local328++) {
				if (local27[local328] != -1) {
					local326[local328] = Static181.aClass316_1.method8107(local27[local328]).method4986(arg1);
				}
			}
			@Pc(382) int local382;
			if (local16 != null && local16.anIntArrayArray116 != null) {
				for (@Pc(362) int local362 = 0; local362 < local16.anIntArrayArray116.length; local362++) {
					if (local16.anIntArrayArray116[local362] != null && local326[local362] != null) {
						local382 = local16.anIntArrayArray116[local362][0];
						@Pc(389) int local389 = local16.anIntArrayArray116[local362][1];
						@Pc(396) int local396 = local16.anIntArrayArray116[local362][2];
						@Pc(403) int local403 = local16.anIntArrayArray116[local362][3];
						@Pc(410) int local410 = local16.anIntArrayArray116[local362][4];
						@Pc(417) int local417 = local16.anIntArrayArray116[local362][5];
						if (local403 != 0 || local410 != 0 || local417 != 0) {
							local326[local362].method2168(local410, local417, local403);
						}
						if (local382 != 0 || local389 != 0 || local396 != 0) {
							local326[local362].method2158(local396, local382, local389);
						}
					}
				}
			}
			@Pc(473) Class81 local473 = new Class81(local326, local326.length);
			if (arg4 != null) {
				local284 = local14 | 0x4000;
			}
			local12 = arg5.method7192(local473, local284, Static225.anInt4353, 64, 850);
			if (arg4 != null) {
				for (local382 = 0; local382 < 5; local382++) {
					if (Static407.aShortArrayArray8[local382].length > arg4.anIntArray647[local382]) {
						local12.pa(Static283.aShortArray94[local382], Static407.aShortArrayArray8[local382][arg4.anIntArray647[local382]]);
					}
					if (Static488.aShortArrayArray7[local382].length > arg4.anIntArray647[local382]) {
						local12.pa(Static429.aShortArray115[local382], Static488.aShortArrayArray7[local382][arg4.anIntArray647[local382]]);
					}
				}
			}
			if (Static461.aClass277_67 != null) {
				local12.m(local14);
				Static461.aClass277_67.method7016(local12, local255);
			}
		}
		if (arg7 == null || local91 == null) {
			return local12;
		} else {
			@Pc(569) Class97 local569 = local12.method6770((byte) 1, local14, true);
			local569.method6772(local93, local85, 0, arg7.aBoolean394, local87, local91, arg2 - 1, local89);
			return local569;
		}
	}
}
