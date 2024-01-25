import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "[I")
	public int[] anIntArray80 = new int[1];

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "[I")
	public int[] anIntArray82 = new int[] { -1 };

	static {
		new Class96("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([I[IIIZ)J")
	private long method1248(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) long[] local7 = Class1_Sub25.aLongArray5;
		@Pc(9) long local9 = -1L;
		@Pc(25) long local25 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) (arg2 >> 8)) & 0xFFL)];
		local9 = local25 >>> 8 ^ local7[(int) (((long) arg2 ^ local25) & 0xFFL)];
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 24)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local7[(int) ((local9 ^ (long) (arg1[local41] >> 16)) & 0xFFL)] ^ local9 >>> 8;
			local9 = local9 >>> 8 ^ local7[(int) (((long) (arg1[local41] >> 8) ^ local9) & 0xFFL)];
			local9 = local7[(int) ((local9 ^ (long) arg1[local41]) & 0xFFL)] ^ local9 >>> 8;
		}
		if (arg0 != null) {
			for (@Pc(126) int local126 = 0; local126 < 5; local126++) {
				local9 = local9 >>> 8 ^ local7[(int) ((local9 ^ (long) arg0[local126]) & 0xFFL)];
			}
		}
		return local7[(int) ((local9 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)] ^ local9 >>> 8;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZILclient!qn;ILclient!qa;Lclient!dn;IZI)Lclient!c;")
	public Class37 method1250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class201 arg2, @OriginalArg(5) Class121 arg3, @OriginalArg(6) Class58 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) int arg7) {
		@Pc(7) Class37 local7 = null;
		@Pc(9) int local9 = 2048;
		@Pc(11) Class231 local11 = null;
		if (arg5 != -1) {
			local11 = Static117.aClass81_1.method1629(arg5);
		}
		@Pc(22) int[] local22 = this.anIntArray82;
		if (local11 != null && local11.anIntArray517 != null) {
			local22 = new int[local11.anIntArray517.length];
			for (@Pc(34) int local34 = 0; local34 < local11.anIntArray517.length; local34++) {
				@Pc(41) int local41 = local11.anIntArray517[local34];
				if (local41 >= 0 && this.anIntArray82.length > local41) {
					local22[local34] = this.anIntArray82[local41];
				} else {
					local22[local34] = -1;
				}
			}
		}
		@Pc(73) boolean local73 = false;
		@Pc(75) boolean local75 = false;
		@Pc(77) boolean local77 = false;
		@Pc(79) boolean local79 = false;
		@Pc(81) int local81 = -1;
		@Pc(83) int local83 = -1;
		@Pc(85) int local85 = 0;
		@Pc(87) Class1_Sub1_Sub16 local87 = null;
		@Pc(89) Class1_Sub1_Sub16 local89 = null;
		if (arg4 != null) {
			local81 = arg4.anIntArray65[arg0];
			local9 = 2080;
			@Pc(104) int local104 = local81 >>> 16;
			local81 &= 0xFFFF;
			local87 = Static322.aClass45_5.method689(local104);
			if (local87 != null) {
				local75 = local87.method5532(local81) | false;
				local73 = local87.method5530(local81) | false;
				local79 = local87.method5531(local81) | false;
				local77 = arg4.aBoolean121 | false;
			}
			if ((arg4.aBoolean124 || Static147.aBoolean259) && arg7 != -1 && arg4.anIntArray65.length > arg7) {
				local83 = arg4.anIntArray65[arg7];
				local85 = arg4.anIntArray66[arg0];
				@Pc(169) int local169 = local83 >>> 16;
				local83 &= 0xFFFF;
				if (local104 == local169) {
					local89 = local87;
				} else {
					local89 = Static322.aClass45_5.method689(local83 >>> 16);
				}
				if (local89 != null) {
					local75 |= local89.method5532(local83);
					local73 |= local89.method5530(local83);
					local79 |= local89.method5531(local83);
				}
			}
			if (local75) {
				local9 = 2208;
			}
			if (local73) {
				local9 |= 0x100;
			}
			if (local77) {
				local9 |= 0x200;
			}
			if (local79) {
				local9 |= 0x400;
			}
		}
		@Pc(250) long local250 = this.method1248(arg2 == null ? null : arg2.anIntArray442, local22, arg5, arg6);
		if (Static223.aClass151_103 != null) {
			local7 = (Class37) Static223.aClass151_103.method3288(local250);
		}
		if (local7 == null || arg3.method4634(local7.n(), local9) != 0) {
			if (local7 != null) {
				local9 = arg3.method4643(local9, local7.n());
			}
			@Pc(276) int local276 = local9;
			@Pc(278) boolean local278 = false;
			for (@Pc(280) int local280 = 0; local280 < local22.length; local280++) {
				if (local22[local280] != -1 && !Static388.aClass193_3.method4249(local22[local280]).method4964(arg6)) {
					local278 = true;
				}
			}
			if (local278) {
				return null;
			}
			@Pc(313) Class155[] local313 = new Class155[local22.length];
			for (@Pc(315) int local315 = 0; local315 < local22.length; local315++) {
				if (local22[local315] != -1) {
					local313[local315] = Static388.aClass193_3.method4249(local22[local315]).method4966(arg6);
				}
			}
			@Pc(367) int local367;
			if (local11 != null && local11.anIntArrayArray51 != null) {
				for (@Pc(347) int local347 = 0; local347 < local11.anIntArrayArray51.length; local347++) {
					if (local11.anIntArrayArray51[local347] != null && local313[local347] != null) {
						local367 = local11.anIntArrayArray51[local347][0];
						@Pc(374) int local374 = local11.anIntArrayArray51[local347][1];
						@Pc(381) int local381 = local11.anIntArrayArray51[local347][2];
						@Pc(388) int local388 = local11.anIntArrayArray51[local347][3];
						@Pc(395) int local395 = local11.anIntArrayArray51[local347][4];
						@Pc(402) int local402 = local11.anIntArrayArray51[local347][5];
						if (local388 != 0 || local395 != 0 || local402 != 0) {
							local313[local347].method3400(local402, local395, local388);
						}
						if (local367 != 0 || local374 != 0 || local381 != 0) {
							local313[local347].method3395(local381, local367, local374);
						}
					}
				}
			}
			@Pc(452) Class155 local452 = new Class155(local313, local313.length);
			if (arg2 != null) {
				local276 = local9 | 0x4000;
			}
			local7 = arg3.method4617(local452, local276, Static192.anInt3512, 64, 850);
			if (arg2 != null) {
				for (local367 = 0; local367 < 5; local367++) {
					if (arg2.anIntArray442[local367] < Static207.aShortArrayArray3[local367].length) {
						local7.N(Static324.aShortArray98[local367], Static207.aShortArrayArray3[local367][arg2.anIntArray442[local367]]);
					}
					if (arg2.anIntArray442[local367] < Static68.aShortArrayArray2[local367].length) {
						local7.N(Static396.aShortArray112[local367], Static68.aShortArrayArray2[local367][arg2.anIntArray442[local367]]);
					}
				}
			}
			if (Static223.aClass151_103 != null) {
				local7.u(local9);
				Static223.aClass151_103.method3291(local250, local7);
			}
		}
		if (arg4 == null || local87 == null) {
			return local7;
		} else {
			@Pc(546) Class37 local546 = local7.method4155((byte) 1, local9, true);
			local546.method4160(arg1 - 1, arg4.aBoolean121, local87, local81, local85, local89, local83, 0);
			return local546;
		}
	}
}
