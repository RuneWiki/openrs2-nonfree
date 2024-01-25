import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class320 {

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "J")
	private long aLong250;

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "J")
	private long aLong251;

	@OriginalMember(owner = "client!tfa", name = "j", descriptor = "Z")
	public boolean aBoolean744;

	@OriginalMember(owner = "client!tfa", name = "p", descriptor = "I")
	private int anInt9400;

	@OriginalMember(owner = "client!tfa", name = "q", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!tfa", name = "t", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!tfa", name = "s", descriptor = "I")
	public int anInt9402 = -1;

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BILclient!fga;Lclient!nh;Lclient!ha;ILclient!cj;Lclient!gaa;Lclient!sha;ILclient!me;I)Lclient!ka;")
	public Class92 method7660(@OriginalArg(1) int arg0, @OriginalArg(2) Class99 arg1, @OriginalArg(3) Class221 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface6 arg5, @OriginalArg(7) Class113 arg6, @OriginalArg(8) Class309 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class198 arg9) {
		if (this.anInt9402 != -1) {
			return arg7.method7453(this.anInt9402).method4866(arg6, arg5, arg0, arg4, arg9, arg3, (Class54) null, arg8);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(55) int local55;
		@Pc(114) int local114;
		@Pc(59) int local59;
		@Pc(118) int local118;
		if (arg6 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local28 = 2080;
			local55 = arg6.anIntArray178[arg4];
			local59 = local55 >>> 16;
			@Pc(64) Class6_Sub5_Sub18 local64 = arg9.method5707(local59);
			@Pc(68) int local68 = local55 & 0xFFFF;
			if (local64 != null) {
				local34 = local64.method4650(local68) | false;
				local32 = local64.method4648(local68) | false;
				local38 = local64.method4646(local68) | false;
				local36 = arg6.aBoolean308 | false;
			}
			if ((arg6.aBoolean310 || Static609.aBoolean809) && arg8 != -1 && arg6.anIntArray178.length > arg8) {
				local114 = arg6.anIntArray178[arg8];
				local118 = local114 >>> 16;
				@Pc(122) int local122 = local114 & 0xFFFF;
				@Pc(132) Class6_Sub5_Sub18 local132 = local118 == local59 ? local64 : arg9.method5707(local118);
				if (local132 != null) {
					local34 |= local132.method4650(local122);
					local32 |= local132.method4648(local122);
					local38 |= local132.method4646(local122);
				}
			}
			if (local34) {
				local28 = 2208;
			}
			if (local32) {
				local28 |= 0x100;
			}
			if (local36) {
				local28 |= 0x200;
			}
			if (local38) {
				local28 |= 0x400;
			}
		}
		@Pc(181) Class94 local181 = Static403.aClass94_38;
		@Pc(190) Class92 local190;
		synchronized (Static403.aClass94_38) {
			local190 = (Class92) Static403.aClass94_38.method2960(this.aLong250);
		}
		if (local190 == null || arg3.method6147(local190.ua(), local28) != 0) {
			if (local190 != null) {
				local28 = arg3.method6140(local28, local190.ua());
			}
			local36 = false;
			for (@Pc(218) int local218 = 0; local218 < 12; local218++) {
				local55 = this.anIntArray498[local218];
				if ((local55 & 0x40000000) == 0) {
					if ((local55 & Integer.MIN_VALUE) != 0 && !arg1.method3059(local55 & 0x3FFFFFFF).method5005()) {
						local36 = true;
					}
				} else if (!arg2.method5923(local55 & 0x3FFFFFFF).method7403(this.aBoolean744)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(275) Class192[] local275 = new Class192[12];
			local114 = 0;
			for (@Pc(279) int local279 = 0; local279 < 12; local279++) {
				@Pc(286) int local286 = this.anIntArray498[local279];
				@Pc(304) Class192 local304;
				if ((local286 & 0x40000000) != 0) {
					local304 = arg2.method5923(local286 & 0x3FFFFFFF).method7400(this.aBoolean744);
					if (local304 != null) {
						local275[local114++] = local304;
					}
				} else if ((Integer.MIN_VALUE & local286) != 0) {
					local304 = arg1.method3059(local286 & 0x3FFFFFFF).method5007();
					if (local304 != null) {
						local275[local114++] = local304;
					}
				}
			}
			@Pc(345) Class192 local345 = new Class192(local275, local114);
			@Pc(349) int local349 = local28 | 0x4000;
			local190 = arg3.method6153(local345, local349, Static152.anInt3555, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local118 = 0; local118 < Static119.aShortArrayArrayArray3.length; local118++) {
					if (this.anIntArray497[local59] < Static119.aShortArrayArrayArray3[local118][local59].length) {
						local190.ia(Static158.aShortArrayArray13[local118][local59], Static119.aShortArrayArrayArray3[local118][local59][this.anIntArray497[local59]]);
					}
				}
			}
			local190.s(local28);
			@Pc(411) Class94 local411 = Static403.aClass94_38;
			synchronized (Static403.aClass94_38) {
				Static403.aClass94_38.method2963(this.aLong250, local190);
			}
		}
		if (arg6 == null) {
			return local190;
		} else {
			local190.method7069((byte) 4, local28, true);
			return arg6.method3268(arg8, arg0, 2048, local190, arg4);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILclient!gaa;IIIIIILclient!fga;Lclient!ha;ILclient!me;)Lclient!ka;")
	public Class92 method7662(@OriginalArg(0) int arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class99 arg7, @OriginalArg(9) Class5 arg8, @OriginalArg(11) Class198 arg9) {
		@Pc(14) int local14 = 2048;
		@Pc(102) int local102;
		@Pc(45) int local45;
		if (arg1 != null) {
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			@Pc(24) boolean local24 = false;
			@Pc(35) int local35 = arg1.anIntArray178[arg0];
			local14 = 2080;
			local45 = local35 >>> 16;
			@Pc(52) Class6_Sub5_Sub18 local52 = arg9.method5707(local45);
			@Pc(56) int local56 = local35 & 0xFFFF;
			if (local52 != null) {
				local20 = local52.method4650(local56) | false;
				local18 = local52.method4648(local56) | false;
				local24 = local52.method4646(local56) | false;
				local22 = arg1.aBoolean308 | false;
			}
			if ((arg1.aBoolean310 || Static609.aBoolean809) && arg6 != -1 && arg1.anIntArray178.length > arg6) {
				local102 = arg1.anIntArray178[arg6];
				@Pc(106) int local106 = local102 >>> 16;
				@Pc(110) int local110 = local102 & 0xFFFF;
				@Pc(119) Class6_Sub5_Sub18 local119;
				if (local106 == local45) {
					local119 = local52;
				} else {
					local119 = arg9.method5707(local110 >>> 16);
				}
				if (local119 != null) {
					local20 |= local119.method4650(local110);
					local18 |= local119.method4648(local110);
					local24 |= local119.method4646(local110);
				}
			}
			if (local20) {
				local14 = 2208;
			}
			if (local18) {
				local14 |= 0x100;
			}
			if (local22) {
				local14 |= 0x200;
			}
			if (local24) {
				local14 |= 0x400;
			}
		}
		@Pc(189) long local189 = (long) (arg5 << 16) | (long) arg3 << 32 | (long) arg4;
		@Pc(191) Class94 local191 = Static403.aClass94_38;
		@Pc(199) Class92 local199;
		synchronized (Static403.aClass94_38) {
			local199 = (Class92) Static403.aClass94_38.method2960(local189);
		}
		if (local199 == null || arg8.method6147(local199.ua(), local14) != 0) {
			if (local199 != null) {
				local14 = arg8.method6140(local14, local199.ua());
			}
			@Pc(229) Class192[] local229 = new Class192[3];
			local102 = 0;
			if (!arg7.method3059(arg4).method5005() || !arg7.method3059(arg5).method5005() || !arg7.method3059(arg3).method5005()) {
				return null;
			}
			@Pc(267) Class192 local267 = arg7.method3059(arg4).method5007();
			if (local267 != null) {
				local102++;
				local229[0] = local267;
			}
			local267 = arg7.method3059(arg5).method5007();
			if (local267 != null) {
				local229[local102++] = local267;
			}
			local267 = arg7.method3059(arg3).method5007();
			if (local267 != null) {
				local229[local102++] = local267;
			}
			@Pc(310) int local310 = local14 | 0x4000;
			local267 = new Class192(local229, local102);
			local199 = arg8.method6153(local267, local310, Static152.anInt3555, 64, 768);
			for (@Pc(326) int local326 = 0; local326 < 5; local326++) {
				for (local45 = 0; local45 < Static119.aShortArrayArrayArray3.length; local45++) {
					if (this.anIntArray497[local326] < Static119.aShortArrayArrayArray3[local45][local326].length) {
						local199.ia(Static158.aShortArrayArray13[local45][local326], Static119.aShortArrayArrayArray3[local45][local326][this.anIntArray497[local326]]);
					}
				}
			}
			local199.s(local14);
			@Pc(376) Class94 local376 = Static403.aClass94_38;
			synchronized (Static403.aClass94_38) {
				Static403.aClass94_38.method2963(local189, local199);
			}
		}
		if (arg1 == null) {
			return local199;
		} else {
			local199 = local199.method7069((byte) 4, local14, true);
			return arg1.method3268(arg6, arg2, 2048, local199, arg0);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "([IIZ[III)V")
	public void method7663(@OriginalArg(0) int[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 != this.anInt9400) {
			this.anInt9400 = arg3;
		}
		this.anIntArray498 = arg0;
		this.aBoolean744 = arg1;
		this.anInt9402 = arg4;
		this.anIntArray497 = arg2;
		this.method7669();
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!qb;Lclient!gaa;Lclient!gaa;Lclient!me;ILclient!fga;[ILclient!nh;ZI[Lclient!oga;Lclient!sha;Lclient!cj;ZIIIIIILclient!ha;)Lclient!ka;")
	public Class92 method7664(@OriginalArg(0) Class271 arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) Class198 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class99 arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) Class221 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class241[] arg9, @OriginalArg(11) Class309 arg10, @OriginalArg(12) Interface6 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15, @OriginalArg(18) int arg16, @OriginalArg(19) int arg17, @OriginalArg(20) Class5 arg18) {
		if (this.anInt9402 != -1) {
			return arg10.method7453(this.anInt9402).method4868(arg4, arg17, arg6, arg16, arg1, arg9, arg18, arg8, arg15, arg11, (Class54) null, arg14, arg0, arg12, arg13, arg3, arg2);
		}
		@Pc(37) int local37 = arg12;
		@Pc(40) long local40 = this.aLong250;
		@Pc(43) int[] local43 = this.anIntArray498;
		if (arg1 != null && (arg1.anInt3850 >= 0 || arg1.anInt3843 >= 0)) {
			local43 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local43[local56] = this.anIntArray498[local56];
			}
			if (arg1.anInt3850 >= 0) {
				if (arg1.anInt3850 == 65535) {
					local43[5] = 0;
					local40 ^= 0xFFFFFFFF00000000L;
				} else {
					local43[5] = arg1.anInt3850 | 0x40000000;
					local40 ^= (long) local43[5] << 32;
				}
			}
			if (arg1.anInt3843 >= 0) {
				if (arg1.anInt3843 == 65535) {
					local43[3] = 0;
					local40 ^= 0xFFFFFFFFL;
				} else {
					local43[3] = arg1.anInt3843 | 0x40000000;
					local40 ^= (long) local43[3];
				}
			}
		}
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(152) boolean local152 = arg1 != null || arg2 != null;
		@Pc(159) int local159 = arg9 == null ? 0 : arg9.length;
		@Pc(193) int local193;
		@Pc(198) int local198;
		for (@Pc(161) int local161 = 0; local161 < local159; local161++) {
			Static44.aClass6_Sub5_Sub18Array4[local161] = null;
			if (arg9[local161] != null) {
				@Pc(179) Class113 local179 = arg3.method5706(arg9[local161].anInt7475);
				if (local179.anIntArray178 != null) {
					local152 = true;
					Static608.aClass113Array1[local161] = local179;
					local193 = arg9[local161].anInt7477;
					local198 = arg9[local161].anInt7476;
					@Pc(203) int local203 = local179.anIntArray178[local193];
					Static44.aClass6_Sub5_Sub18Array4[local161] = arg3.method5707(local203 >>> 16);
					@Pc(216) int local216 = local203 & 0xFFFF;
					Static625.anIntArray558[local161] = local216;
					if (Static44.aClass6_Sub5_Sub18Array4[local161] != null) {
						local142 |= Static44.aClass6_Sub5_Sub18Array4[local161].method4650(local216);
						local140 |= Static44.aClass6_Sub5_Sub18Array4[local161].method4648(local216);
						local144 |= Static44.aClass6_Sub5_Sub18Array4[local161].method4646(local216);
					}
					if ((local179.aBoolean310 || Static609.aBoolean809) && local198 != -1 && local198 < local179.anIntArray178.length) {
						Static304.anIntArray288[local161] = local179.anIntArray176[local193];
						Static389.anIntArray351[local161] = arg9[local161].anInt7482;
						@Pc(309) int local309 = local179.anIntArray178[local198];
						Static602.aClass6_Sub5_Sub18Array5[local161] = arg3.method5707(local309 >>> 16);
						@Pc(322) int local322 = local309 & 0xFFFF;
						Static510.anIntArray449[local161] = local322;
						if (Static602.aClass6_Sub5_Sub18Array5[local161] != null) {
							local142 |= Static602.aClass6_Sub5_Sub18Array5[local161].method4650(local322);
							local140 |= Static602.aClass6_Sub5_Sub18Array5[local161].method4648(local322);
							local144 |= Static602.aClass6_Sub5_Sub18Array5[local161].method4646(local322);
						}
					} else {
						Static304.anIntArray288[local161] = 0;
						Static389.anIntArray351[local161] = 0;
						Static602.aClass6_Sub5_Sub18Array5[local161] = null;
						Static510.anIntArray449[local161] = -1;
					}
				}
			}
		}
		@Pc(367) int local367 = -1;
		local193 = -1;
		local198 = 0;
		@Pc(373) Class6_Sub5_Sub18 local373 = null;
		@Pc(375) Class6_Sub5_Sub18 local375 = null;
		@Pc(377) int local377 = -1;
		@Pc(379) int local379 = -1;
		@Pc(381) int local381 = 0;
		@Pc(383) Class6_Sub5_Sub18 local383 = null;
		@Pc(385) Class6_Sub5_Sub18 local385 = null;
		if (local152) {
			local37 = arg12 | 0x20;
			@Pc(402) int local402;
			@Pc(462) int local462;
			if (arg1 != null) {
				local367 = arg1.anIntArray178[arg4];
				local402 = local367 >>> 16;
				local367 &= 0xFFFF;
				local373 = arg3.method5707(local402);
				if (local373 != null) {
					local142 |= local373.method4650(local367);
					local140 |= local373.method4648(local367);
					local144 |= local373.method4646(local367);
				}
				if ((arg1.aBoolean310 || Static609.aBoolean809) && arg15 != -1 && arg1.anIntArray178.length > arg15) {
					local193 = arg1.anIntArray178[arg15];
					local198 = arg1.anIntArray176[arg4];
					local462 = local193 >>> 16;
					local375 = local462 == local402 ? local373 : arg3.method5707(local462);
					local193 &= 0xFFFF;
					if (local375 != null) {
						local142 |= local375.method4650(local193);
						local140 |= local375.method4648(local193);
						local144 |= local375.method4646(local193);
					}
				}
			}
			if (arg2 != null) {
				local377 = arg2.anIntArray178[arg16];
				local402 = local377 >>> 16;
				local377 &= 0xFFFF;
				local383 = arg3.method5707(local402);
				if (local383 != null) {
					local142 |= local383.method4650(local377);
					local140 |= local383.method4648(local377);
					local144 |= local383.method4646(local377);
				}
				if ((arg2.aBoolean310 || Static609.aBoolean809) && arg13 != -1 && arg2.anIntArray178.length > arg13) {
					local381 = arg2.anIntArray176[arg16];
					local379 = arg2.anIntArray178[arg13];
					local462 = local379 >>> 16;
					local385 = local462 == local402 ? local383 : arg3.method5707(local462);
					local379 &= 0xFFFF;
					if (local385 != null) {
						local142 |= local385.method4650(local379);
						local140 |= local385.method4648(local379);
						local144 |= local385.method4646(local379);
					}
				}
			}
			if (local142) {
				local37 |= 0x80;
			}
			if (local140) {
				local37 |= 0x100;
			}
			if (local144) {
				local37 |= 0x400;
			}
		}
		@Pc(638) Class94 local638 = Static378.aClass94_34;
		@Pc(646) Class92 local646;
		synchronized (Static378.aClass94_34) {
			local646 = (Class92) Static378.aClass94_34.method2960(local40);
		}
		@Pc(654) Class303 local654 = null;
		if (this.anInt9400 != -1) {
			local654 = arg0.method6871(this.anInt9400);
		}
		@Pc(688) boolean local688;
		@Pc(690) int local690;
		@Pc(696) int local696;
		@Pc(747) int local747;
		@Pc(753) int local753;
		@Pc(822) int local822;
		if (local646 == null || arg18.method6147(local646.ua(), local37) != 0) {
			if (local646 != null) {
				local37 = arg18.method6140(local37, local646.ua());
			}
			local688 = false;
			for (local690 = 0; local690 < 12; local690++) {
				local696 = local43[local690];
				if ((local696 & 0x40000000) == 0) {
					if ((local696 & Integer.MIN_VALUE) != 0 && !arg5.method3059(local696 & 0x3FFFFFFF).method5006()) {
						local688 = true;
					}
				} else if (!arg7.method5923(local696 & 0x3FFFFFFF).method7406(this.aBoolean744)) {
					local688 = true;
				}
			}
			if (local688) {
				if (this.aLong251 != -1L) {
					@Pc(1029) Class94 local1029 = Static378.aClass94_34;
					synchronized (Static378.aClass94_34) {
						local646 = (Class92) Static378.aClass94_34.method2960(this.aLong251);
					}
				}
				if (local646 == null || arg18.method6147(local646.ua(), local37) != 0) {
					return null;
				}
			} else {
				@Pc(745) Class192[] local745 = new Class192[12];
				for (local747 = 0; local747 < 12; local747++) {
					local753 = local43[local747];
					@Pc(776) Class192 local776;
					if ((local753 & 0x40000000) != 0) {
						local776 = arg7.method5923(local753 & 0x3FFFFFFF).method7414(this.aBoolean744);
						if (local776 != null) {
							local745[local747] = local776;
						}
					} else if ((Integer.MIN_VALUE & local753) != 0) {
						local776 = arg5.method3059(local753 & 0x3FFFFFFF).method5004();
						if (local776 != null) {
							local745[local747] = local776;
						}
					}
				}
				@Pc(824) int local824;
				if (local654 != null && local654.anIntArrayArray47 != null) {
					for (local753 = 0; local753 < local654.anIntArrayArray47.length; local753++) {
						if (local745[local753] != null) {
							local822 = 0;
							local824 = 0;
							@Pc(826) int local826 = 0;
							@Pc(828) int local828 = 0;
							@Pc(830) int local830 = 0;
							@Pc(832) int local832 = 0;
							if (local654.anIntArrayArray47[local753] != null) {
								local832 = local654.anIntArrayArray47[local753][5] << 3;
								local828 = local654.anIntArrayArray47[local753][3] << 3;
								local824 = local654.anIntArrayArray47[local753][1];
								local830 = local654.anIntArrayArray47[local753][4] << 3;
								local822 = local654.anIntArrayArray47[local753][0];
								local826 = local654.anIntArrayArray47[local753][2];
							}
							if (local828 != 0 || local830 != 0 || local832 != 0) {
								local745[local753].method5557(local832, local828, local830);
							}
							if (local822 != 0 || local824 != 0 || local826 != 0) {
								local745[local753].method5554(local826, local822, local824);
							}
						}
					}
				}
				@Pc(929) int local929 = local37 | 0x4000;
				@Pc(936) Class192 local936 = new Class192(local745, local745.length);
				local646 = arg18.method6153(local936, local929, Static152.anInt3555, 64, 850);
				for (local822 = 0; local822 < 5; local822++) {
					for (local824 = 0; local824 < Static119.aShortArrayArrayArray3.length; local824++) {
						if (Static119.aShortArrayArrayArray3[local824][local822].length > this.anIntArray497[local822]) {
							local646.ia(Static158.aShortArrayArray13[local824][local822], Static119.aShortArrayArrayArray3[local824][local822][this.anIntArray497[local822]]);
						}
					}
				}
				local646.s(local37);
				@Pc(1004) Class94 local1004 = Static378.aClass94_34;
				synchronized (Static378.aClass94_34) {
					Static378.aClass94_34.method2963(local40, local646);
				}
				this.aLong251 = local40;
			}
		}
		@Pc(1060) Class92 local1060 = local646.method7069((byte) 4, local37, true);
		local688 = false;
		if (arg6 != null) {
			for (local690 = 0; local690 < 12; local690++) {
				if (arg6[local690] != -1) {
					local688 = true;
				}
			}
		}
		if (!local152 && !local688) {
			return local1060;
		}
		@Pc(1088) Class115[] local1088 = null;
		if (local654 != null) {
			local1088 = local654.method7368(arg18);
		}
		if (local688 && local1088 != null) {
			for (local696 = 0; local696 < 12; local696++) {
				if (local1088[local696] != null) {
					local1060.method7059(local1088[local696], 0x1 << local696, true);
				}
			}
		}
		local696 = 0;
		local747 = 1;
		while (local159 > local696) {
			if (Static44.aClass6_Sub5_Sub18Array4[local696] != null) {
				local1060.method7051(Static625.anIntArray558[local696], Static389.anIntArray351[local696] - 1, Static602.aClass6_Sub5_Sub18Array5[local696], local747, Static44.aClass6_Sub5_Sub18Array4[local696], false, Static510.anIntArray449[local696], (int[]) null, Static304.anIntArray288[local696]);
			}
			local747 <<= 0x1;
			local696++;
		}
		if (local688) {
			for (local753 = 0; local753 < 12; local753++) {
				if (arg6[local753] != -1) {
					local822 = arg6[local753] - arg17;
					local822 &= 0x3FFF;
					@Pc(1192) Class115 local1192 = arg18.method6184();
					local1192.method6291(local822);
					local1060.method7059(local1192, 0x1 << local753, false);
				}
			}
		}
		if (local688 && local1088 != null) {
			for (local753 = 0; local753 < 12; local753++) {
				if (local1088[local753] != null) {
					local1060.method7059(local1088[local753], 0x1 << local753, false);
				}
			}
		}
		if (local373 != null && local383 != null) {
			local1060.method7049(local198, local367, local373, local375, arg1.aBooleanArray9, local381, local377, local383, local379, arg14 - 1, false, local385, arg8 - 1, local193);
		} else if (local373 != null) {
			local1060.method7066(arg14 - 1, local373, local367, local375, false, 0, local198, local193);
		} else if (local383 != null) {
			local1060.method7066(arg8 - 1, local383, local377, local385, false, 0, local381, local379);
		}
		for (local753 = 0; local753 < local159; local753++) {
			Static44.aClass6_Sub5_Sub18Array4[local753] = null;
			Static602.aClass6_Sub5_Sub18Array5[local753] = null;
			Static608.aClass113Array1[local753] = null;
		}
		return local1060;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILclient!fga;I)V")
	public void method7667(@OriginalArg(1) int arg0, @OriginalArg(2) Class99 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static629.anIntArray560[arg0];
		if (arg1.method3059(arg2) != null) {
			this.anIntArray498[local7] = arg2 | Integer.MIN_VALUE;
			this.method7669();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V")
	public void method7668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray497[arg1] = arg0;
		this.method7669();
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V")
	private void method7669() {
		@Pc(7) long[] local7 = Class377.aLongArray16;
		this.aLong250 = -1L;
		this.aLong250 = this.aLong250 >>> 8 ^ local7[(int) ((this.aLong250 ^ (long) (this.anInt9400 >> 8)) & 0xFFL)];
		this.aLong250 = this.aLong250 >>> 8 ^ local7[(int) (((long) this.anInt9400 ^ this.aLong250) & 0xFFL)];
		for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
			this.aLong250 = local7[(int) ((this.aLong250 ^ (long) (this.anIntArray498[local57] >> 24)) & 0xFFL)] ^ this.aLong250 >>> 8;
			this.aLong250 = this.aLong250 >>> 8 ^ local7[(int) (((long) (this.anIntArray498[local57] >> 16) ^ this.aLong250) & 0xFFL)];
			this.aLong250 = this.aLong250 >>> 8 ^ local7[(int) (((long) (this.anIntArray498[local57] >> 8) ^ this.aLong250) & 0xFFL)];
			this.aLong250 = local7[(int) ((this.aLong250 ^ (long) this.anIntArray498[local57]) & 0xFFL)] ^ this.aLong250 >>> 8;
		}
		for (@Pc(153) int local153 = 0; local153 < 5; local153++) {
			this.aLong250 = local7[(int) (((long) this.anIntArray497[local153] ^ this.aLong250) & 0xFFL)] ^ this.aLong250 >>> 8;
		}
		this.aLong250 = this.aLong250 >>> 8 ^ local7[(int) (((long) (this.aBoolean744 ? 1 : 0) ^ this.aLong250) & 0xFFL)];
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IILclient!nh;I)V")
	public void method7670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		if (arg0 == -1) {
			this.anIntArray498[arg1] = 0;
		} else if (arg2.method5923(arg0) != null) {
			this.anIntArray498[arg1] = arg0 | 0x40000000;
			this.method7669();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZZ)V")
	public void method7671(@OriginalArg(0) boolean arg0) {
		this.aBoolean744 = arg0;
		this.method7669();
	}
}
