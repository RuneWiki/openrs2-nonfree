import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class245 {

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "J")
	private long aLong174;

	@OriginalMember(owner = "client!nba", name = "k", descriptor = "[Lclient!ca;")
	private Class38[] aClass38Array1;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
	private int anInt5764;

	@OriginalMember(owner = "client!nba", name = "s", descriptor = "J")
	private long aLong175;

	@OriginalMember(owner = "client!nba", name = "t", descriptor = "Z")
	public boolean aBoolean441;

	@OriginalMember(owner = "client!nba", name = "w", descriptor = "[I")
	public int[] anIntArray437;

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
	public int anInt5763 = -1;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IILclient!np;I)V")
	public void method5058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2) {
		@Pc(7) int local7 = Static116.anIntArray154[arg1];
		if (arg2.method5202(arg0) != null) {
			this.anIntArray435[local7] = arg0 | Integer.MIN_VALUE;
			this.method5069();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!ha;IILclient!vr;ZLclient!aaa;Lclient!fs;Lclient!np;ILclient!bh;Lclient!nq;I)Lclient!ka;")
	public Class62 method5059(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class380 arg3, @OriginalArg(5) Class2 arg4, @OriginalArg(6) Class124 arg5, @OriginalArg(7) Class254 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Interface4 arg8, @OriginalArg(10) Class255 arg9) {
		if (this.anInt5763 != -1) {
			return arg3.method8596(this.anInt5763).method7537(arg8, (Class133) null, arg2, arg4, arg1, arg0, arg5, arg7);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(115) int local115;
		@Pc(59) int local59;
		@Pc(119) int local119;
		if (arg5 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg5.anIntArray224[arg2];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(64) Class4_Sub5_Sub15 local64 = arg4.method24(local59);
			@Pc(68) int local68 = local49 & 0xFFFF;
			if (local64 != null) {
				local34 = local64.method5086(local68) | false;
				local32 = local64.method5089(local68) | false;
				local38 = local64.method5085(local68) | false;
				local36 = arg5.aBoolean221 | false;
			}
			if ((arg5.aBoolean219 || Static562.aBoolean673) && arg1 != -1 && arg5.anIntArray224.length > arg1) {
				local115 = arg5.anIntArray224[arg1];
				local119 = local115 >>> 16;
				@Pc(123) int local123 = local115 & 0xFFFF;
				@Pc(133) Class4_Sub5_Sub15 local133 = local59 == local119 ? local64 : arg4.method24(local119);
				if (local133 != null) {
					local34 |= local133.method5086(local123);
					local32 |= local133.method5089(local123);
					local38 |= local133.method5085(local123);
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
		@Pc(182) Class352 local182 = Static261.aClass352_36;
		@Pc(191) Class62 local191;
		synchronized (Static261.aClass352_36) {
			local191 = (Class62) Static261.aClass352_36.method7653(this.aLong174);
		}
		if (local191 == null || arg0.method8124(local191.ua(), local28) != 0) {
			if (local191 != null) {
				local28 = arg0.method8140(local28, local191.ua());
			}
			local36 = false;
			for (@Pc(219) int local219 = 0; local219 < this.anIntArray435.length; local219++) {
				local49 = this.anIntArray435[local219];
				@Pc(228) Class38 local228 = null;
				if ((local49 & 0x40000000) != 0) {
					if (this.aClass38Array1 != null && this.aClass38Array1[local219] != null) {
						local228 = this.aClass38Array1[local219];
					}
					if (!arg9.method5210(local49 & 0x3FFFFFFF).method2619(this.aBoolean441, local228)) {
						local36 = true;
					}
				} else if ((Integer.MIN_VALUE & local49) != 0 && !arg6.method5202(local49 & 0x3FFFFFFF).method7440()) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(297) Class334[] local297 = new Class334[this.anIntArray435.length];
			local115 = 0;
			for (@Pc(301) int local301 = 0; local301 < this.anIntArray435.length; local301++) {
				@Pc(308) int local308 = this.anIntArray435[local301];
				@Pc(310) Class38 local310 = null;
				@Pc(342) Class334 local342;
				if ((local308 & 0x40000000) != 0) {
					if (this.aClass38Array1 != null && this.aClass38Array1[local301] != null) {
						local310 = this.aClass38Array1[local301];
					}
					local342 = arg9.method5210(local308 & 0x3FFFFFFF).method2618(local310, this.aBoolean441);
					if (local342 != null) {
						local297[local115++] = local342;
					}
				} else if ((local308 & Integer.MIN_VALUE) != 0) {
					local342 = arg6.method5202(local308 & 0x3FFFFFFF).method7442();
					if (local342 != null) {
						local297[local115++] = local342;
					}
				}
			}
			@Pc(380) int local380 = local28 | 0x4000;
			@Pc(386) Class334 local386 = new Class334(local297, local115);
			local191 = arg0.method8072(local386, local380, Static294.anInt4647, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local119 = 0; local119 < Static158.aShortArrayArrayArray8.length; local119++) {
					if (Static158.aShortArrayArrayArray8[local119][local59].length > this.anIntArray437[local59]) {
						local191.ia(Static46.aShortArrayArray4[local119][local59], Static158.aShortArrayArrayArray8[local119][local59][this.anIntArray437[local59]]);
					}
				}
			}
			local191.s(local28);
			@Pc(448) Class352 local448 = Static261.aClass352_36;
			synchronized (Static261.aClass352_36) {
				Static261.aClass352_36.method7655(this.aLong174, local191);
			}
		}
		if (arg5 == null) {
			return local191;
		} else {
			local191.method7329((byte) 4, local28, true);
			return arg5.method2833(2048, arg2, arg7, local191, arg1);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILclient!np;ILclient!fs;Lclient!aaa;IIIILclient!ha;II)Lclient!ka;")
	public Class62 method5060(@OriginalArg(0) int arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class124 arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class33 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(98) int local98;
		@Pc(38) int local38;
		if (arg3 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(32) int local32 = arg3.anIntArray224[arg8];
			local38 = local32 >>> 16;
			@Pc(43) Class4_Sub5_Sub15 local43 = arg4.method24(local38);
			@Pc(47) int local47 = local32 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method5086(local47) | false;
				local11 = local43.method5089(local47) | false;
				local17 = local43.method5085(local47) | false;
				local15 = arg3.aBoolean221 | false;
			}
			if ((arg3.aBoolean219 || Static562.aBoolean673) && arg6 != -1 && arg6 < arg3.anIntArray224.length) {
				local98 = arg3.anIntArray224[arg6];
				@Pc(102) int local102 = local98 >>> 16;
				@Pc(106) int local106 = local98 & 0xFFFF;
				@Pc(116) Class4_Sub5_Sub15 local116;
				if (local102 == local38) {
					local116 = local43;
				} else {
					local116 = arg4.method24(local106 >>> 16);
				}
				if (local116 != null) {
					local13 |= local116.method5086(local106);
					local11 |= local116.method5089(local106);
					local17 |= local116.method5085(local106);
				}
			}
			if (local13) {
				local7 = 2208;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
			if (local17) {
				local7 |= 0x400;
			}
		}
		@Pc(179) long local179 = (long) arg5 | (long) arg0 << 32 | (long) (arg7 << 16);
		@Pc(187) Class352 local187 = Static261.aClass352_36;
		@Pc(195) Class62 local195;
		synchronized (Static261.aClass352_36) {
			local195 = (Class62) Static261.aClass352_36.method7653(local179);
		}
		if (local195 == null || arg9.method8124(local195.ua(), local7) != 0) {
			if (local195 != null) {
				local7 = arg9.method8140(local7, local195.ua());
			}
			@Pc(225) Class334[] local225 = new Class334[3];
			local98 = 0;
			if (!arg1.method5202(arg5).method7440() || !arg1.method5202(arg7).method7440() || !arg1.method5202(arg0).method7440()) {
				return null;
			}
			@Pc(257) Class334 local257 = arg1.method5202(arg5).method7442();
			if (local257 != null) {
				local98++;
				local225[0] = local257;
			}
			local257 = arg1.method5202(arg7).method7442();
			if (local257 != null) {
				local225[local98++] = local257;
			}
			local257 = arg1.method5202(arg0).method7442();
			if (local257 != null) {
				local225[local98++] = local257;
			}
			@Pc(296) int local296 = local7 | 0x4000;
			local257 = new Class334(local225, local98);
			local195 = arg9.method8072(local257, local296, Static294.anInt4647, 64, 768);
			for (@Pc(312) int local312 = 0; local312 < 5; local312++) {
				for (local38 = 0; local38 < Static158.aShortArrayArrayArray8.length; local38++) {
					if (Static158.aShortArrayArrayArray8[local38][local312].length > this.anIntArray437[local312]) {
						local195.ia(Static46.aShortArrayArray4[local38][local312], Static158.aShortArrayArrayArray8[local38][local312][this.anIntArray437[local312]]);
					}
				}
			}
			local195.s(local7);
			@Pc(360) Class352 local360 = Static261.aClass352_36;
			synchronized (Static261.aClass352_36) {
				Static261.aClass352_36.method7655(local179, local195);
			}
		}
		if (arg3 == null) {
			return local195;
		} else {
			local195 = local195.method7329((byte) 4, local7, true);
			return arg3.method2833(2048, arg8, arg2, local195, arg6);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[II[IZI[Lclient!ca;)V")
	public void method5061(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class38[] arg5) {
		if (this.anInt5764 != arg2) {
			this.anInt5764 = arg2;
		}
		this.aBoolean441 = arg4;
		this.aClass38Array1 = arg5;
		this.anInt5763 = arg0;
		this.anIntArray435 = arg3;
		this.anIntArray437 = arg1;
		this.method5069();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)V")
	public void method5062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray437[arg0] = arg1;
		this.method5069();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BZ)V")
	public void method5063(@OriginalArg(1) boolean arg0) {
		this.aBoolean441 = arg0;
		this.method5069();
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IILclient!nq;I)V")
	public void method5067(@OriginalArg(1) int arg0, @OriginalArg(2) Class255 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			this.anIntArray435[arg0] = 0;
		} else if (arg1.method5210(arg2) == null) {
			return;
		} else {
			this.anIntArray435[arg0] = arg2 | 0x40000000;
			this.method5069();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILclient!ha;Lclient!aaa;ILclient!vr;IILclient!fs;I[ILclient!bh;ILclient!nq;BILclient!fs;[Lclient!hb;Lclient!np;ILclient!jf;Z)Lclient!ka;")
	public Class62 method5068(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class380 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class124 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Interface4 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class255 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class124 arg14, @OriginalArg(16) Class143[] arg15, @OriginalArg(17) Class254 arg16, @OriginalArg(18) int arg17, @OriginalArg(19) Class177 arg18) {
		if (this.anInt5763 != -1) {
			return arg4.method8596(this.anInt5763).method7536(arg2, arg5, arg6, arg3, arg13, arg17, arg1, (Class133) null, arg9, arg18, arg8, arg10, arg0, arg14, arg11, arg15, arg7);
		}
		@Pc(37) int local37 = arg0;
		@Pc(40) long local40 = this.aLong174;
		@Pc(43) int[] local43 = this.anIntArray435;
		@Pc(45) boolean local45 = false;
		@Pc(47) boolean local47 = false;
		if (arg14 != null && (arg14.anInt3022 >= 0 || arg14.anInt3025 >= 0)) {
			local43 = new int[this.anIntArray435.length];
			for (@Pc(62) int local62 = 0; local62 < local43.length; local62++) {
				local43[local62] = this.anIntArray435[local62];
			}
			if (arg14.anInt3022 >= 0) {
				if (arg14.anInt3022 == 65535) {
					local43[5] = 0;
					local40 ^= 0xFFFFFFFF00000000L;
					local45 = true;
				} else {
					local43[5] = arg14.anInt3022 | 0x40000000;
					local40 ^= (long) local43[5] << 32;
				}
			}
			if (arg14.anInt3025 >= 0) {
				if (arg14.anInt3025 == 65535) {
					local43[3] = 0;
					local40 ^= 0xFFFFFFFFL;
				} else {
					local43[3] = arg14.anInt3025 | 0x40000000;
					local40 ^= (long) local43[3];
				}
				local47 = true;
			}
		}
		@Pc(155) boolean local155 = false;
		@Pc(157) boolean local157 = false;
		@Pc(159) boolean local159 = false;
		@Pc(167) boolean local167 = arg14 != null || arg7 != null;
		@Pc(174) int local174 = arg15 == null ? 0 : arg15.length;
		@Pc(208) int local208;
		@Pc(213) int local213;
		for (@Pc(176) int local176 = 0; local176 < local174; local176++) {
			Static467.aClass4_Sub5_Sub15Array5[local176] = null;
			if (arg15[local176] != null) {
				@Pc(194) Class124 local194 = arg2.method22(arg15[local176].anInt3386);
				if (local194.anIntArray224 != null) {
					local167 = true;
					Static336.aClass124Array4[local176] = local194;
					local208 = arg15[local176].anInt3388;
					local213 = arg15[local176].anInt3382;
					@Pc(218) int local218 = local194.anIntArray224[local208];
					Static467.aClass4_Sub5_Sub15Array5[local176] = arg2.method24(local218 >>> 16);
					@Pc(231) int local231 = local218 & 0xFFFF;
					Static308.anIntArray686[local176] = local231;
					if (Static467.aClass4_Sub5_Sub15Array5[local176] != null) {
						local157 |= Static467.aClass4_Sub5_Sub15Array5[local176].method5086(local231);
						local155 |= Static467.aClass4_Sub5_Sub15Array5[local176].method5089(local231);
						local159 |= Static467.aClass4_Sub5_Sub15Array5[local176].method5085(local231);
					}
					if ((local194.aBoolean219 || Static562.aBoolean673) && local213 != -1 && local213 < local194.anIntArray224.length) {
						Static478.anIntArray514[local176] = local194.anIntArray221[local208];
						Static660.anIntArray716[local176] = arg15[local176].anInt3385;
						@Pc(299) int local299 = local194.anIntArray224[local213];
						Static408.aClass4_Sub5_Sub15Array3[local176] = arg2.method24(local299 >>> 16);
						@Pc(312) int local312 = local299 & 0xFFFF;
						Static32.anIntArray63[local176] = local312;
						if (Static408.aClass4_Sub5_Sub15Array3[local176] != null) {
							local157 |= Static408.aClass4_Sub5_Sub15Array3[local176].method5086(local312);
							local155 |= Static408.aClass4_Sub5_Sub15Array3[local176].method5089(local312);
							local159 |= Static408.aClass4_Sub5_Sub15Array3[local176].method5085(local312);
						}
					} else {
						Static478.anIntArray514[local176] = 0;
						Static660.anIntArray716[local176] = 0;
						Static408.aClass4_Sub5_Sub15Array3[local176] = null;
						Static32.anIntArray63[local176] = -1;
					}
				}
			}
		}
		@Pc(375) int local375 = -1;
		local208 = -1;
		local213 = 0;
		@Pc(387) Class4_Sub5_Sub15 local387 = null;
		@Pc(389) Class4_Sub5_Sub15 local389 = null;
		@Pc(391) int local391 = -1;
		@Pc(393) int local393 = -1;
		@Pc(395) int local395 = 0;
		@Pc(397) Class4_Sub5_Sub15 local397 = null;
		@Pc(399) Class4_Sub5_Sub15 local399 = null;
		if (local167) {
			@Pc(412) int local412;
			@Pc(475) int local475;
			if (arg14 != null) {
				local375 = arg14.anIntArray224[arg3];
				local412 = local375 >>> 16;
				local387 = arg2.method24(local412);
				local375 &= 0xFFFF;
				if (local387 != null) {
					local157 |= local387.method5086(local375);
					local155 |= local387.method5089(local375);
					local159 |= local387.method5085(local375);
				}
				if ((arg14.aBoolean219 || Static562.aBoolean673) && arg6 != -1 && arg6 < arg14.anIntArray224.length) {
					local208 = arg14.anIntArray224[arg6];
					local213 = arg14.anIntArray221[arg3];
					local475 = local208 >>> 16;
					local389 = local475 == local412 ? local387 : arg2.method24(local475);
					local208 &= 0xFFFF;
					if (local389 != null) {
						local157 |= local389.method5086(local208);
						local155 |= local389.method5089(local208);
						local159 |= local389.method5085(local208);
					}
				}
			}
			local37 = arg0 | 0x20;
			if (arg7 != null) {
				local391 = arg7.anIntArray224[arg11];
				local412 = local391 >>> 16;
				local391 &= 0xFFFF;
				local397 = arg2.method24(local412);
				if (local397 != null) {
					local157 |= local397.method5086(local391);
					local155 |= local397.method5089(local391);
					local159 |= local397.method5085(local391);
				}
				if ((arg7.aBoolean219 || Static562.aBoolean673) && arg5 != -1 && arg5 < arg7.anIntArray224.length) {
					local393 = arg7.anIntArray224[arg5];
					local395 = arg7.anIntArray221[arg11];
					local475 = local393 >>> 16;
					local399 = local475 == local412 ? local397 : arg2.method24(local475);
					local393 &= 0xFFFF;
					if (local399 != null) {
						local157 |= local399.method5086(local393);
						local155 |= local399.method5089(local393);
						local159 |= local399.method5085(local393);
					}
				}
			}
			if (local157) {
				local37 |= 0x80;
			}
			if (local155) {
				local37 |= 0x100;
			}
			if (local159) {
				local37 |= 0x400;
			}
		}
		@Pc(648) Class352 local648 = Static511.aClass352_58;
		@Pc(658) Class62 local658;
		synchronized (Static511.aClass352_58) {
			local658 = (Class62) Static511.aClass352_58.method7653(local40);
		}
		@Pc(666) Class377 local666 = null;
		if (this.anInt5764 != -1) {
			local666 = arg18.method3979(this.anInt5764);
		}
		@Pc(696) boolean local696;
		@Pc(698) int local698;
		@Pc(704) int local704;
		@Pc(789) int local789;
		@Pc(795) int local795;
		@Pc(902) int local902;
		if (local658 == null || arg1.method8124(local658.ua(), local37) != 0) {
			if (local658 != null) {
				local37 = arg1.method8140(local37, local658.ua());
			}
			local696 = false;
			local698 = 0;
			while (true) {
				if (local698 >= local43.length) {
					if (local696) {
						if (this.aLong175 != -1L) {
							@Pc(1116) Class352 local1116 = Static511.aClass352_58;
							synchronized (Static511.aClass352_58) {
								local658 = (Class62) Static511.aClass352_58.method7653(this.aLong175);
							}
						}
						if (local658 == null || arg1.method8124(local658.ua(), local37) != 0) {
							return null;
						}
					} else {
						@Pc(787) Class334[] local787 = new Class334[local43.length];
						for (local789 = 0; local789 < local43.length; local789++) {
							local795 = local43[local789];
							@Pc(797) Class38 local797 = null;
							@Pc(815) boolean local815 = local789 == 5 && local45 || local789 == 3 && local47;
							@Pc(849) Class334 local849;
							if ((local795 & 0x40000000) != 0) {
								if (!local815 && this.aClass38Array1 != null && this.aClass38Array1[local789] != null) {
									local797 = this.aClass38Array1[local789];
								}
								local849 = arg12.method5210(local795 & 0x3FFFFFFF).method2612(local797, this.aBoolean441);
								if (local849 != null) {
									local787[local789] = local849;
								}
							} else if ((Integer.MIN_VALUE & local795) != 0) {
								local849 = arg16.method5202(local795 & 0x3FFFFFFF).method7435();
								if (local849 != null) {
									local787[local789] = local849;
								}
							}
						}
						@Pc(904) int local904;
						if (local666 != null && local666.anIntArrayArray62 != null) {
							for (local795 = 0; local795 < local666.anIntArrayArray62.length; local795++) {
								if (local787[local795] != null) {
									local902 = 0;
									local904 = 0;
									@Pc(906) int local906 = 0;
									@Pc(908) int local908 = 0;
									@Pc(910) int local910 = 0;
									@Pc(912) int local912 = 0;
									if (local666.anIntArrayArray62[local795] != null) {
										local904 = local666.anIntArrayArray62[local795][1];
										local908 = local666.anIntArrayArray62[local795][3] << 3;
										local906 = local666.anIntArrayArray62[local795][2];
										local912 = local666.anIntArrayArray62[local795][5] << 3;
										local902 = local666.anIntArrayArray62[local795][0];
										local910 = local666.anIntArrayArray62[local795][4] << 3;
									}
									if (local908 != 0 || local910 != 0 || local912 != 0) {
										local787[local795].method7379(local912, local910, local908);
									}
									if (local902 != 0 || local904 != 0 || local906 != 0) {
										local787[local795].method7387(local902, local906, local904);
									}
								}
							}
						}
						@Pc(1012) int local1012 = local37 | 0x4000;
						@Pc(1019) Class334 local1019 = new Class334(local787, local787.length);
						local658 = arg1.method8072(local1019, local1012, Static294.anInt4647, 64, 850);
						for (local902 = 0; local902 < 5; local902++) {
							for (local904 = 0; local904 < Static158.aShortArrayArrayArray8.length; local904++) {
								if (Static158.aShortArrayArrayArray8[local904][local902].length > this.anIntArray437[local902]) {
									local658.ia(Static46.aShortArrayArray4[local904][local902], Static158.aShortArrayArrayArray8[local904][local902][this.anIntArray437[local902]]);
								}
							}
						}
						local658.s(local37);
						@Pc(1089) Class352 local1089 = Static511.aClass352_58;
						synchronized (Static511.aClass352_58) {
							Static511.aClass352_58.method7655(local40, local658);
						}
						this.aLong175 = local40;
					}
					break;
				}
				local704 = local43[local698];
				@Pc(706) Class38 local706 = null;
				@Pc(720) boolean local720 = local698 == 5 && local45 || local698 == 3 && local47;
				if ((local704 & 0x40000000) != 0) {
					if (!local720 && this.aClass38Array1 != null && this.aClass38Array1[local698] != null) {
						local706 = this.aClass38Array1[local698];
					}
					if (!arg12.method5210(local704 & 0x3FFFFFFF).method2624(local706, this.aBoolean441)) {
						local696 = true;
					}
				} else if ((local704 & Integer.MIN_VALUE) != 0 && !arg16.method5202(local704 & 0x3FFFFFFF).method7439()) {
					local696 = true;
				}
				local698++;
			}
		}
		@Pc(1150) Class62 local1150 = local658.method7329((byte) 4, local37, true);
		local696 = false;
		if (arg9 != null) {
			for (local698 = 0; local698 < arg9.length; local698++) {
				if (arg9[local698] != -1) {
					local696 = true;
				}
			}
		}
		if (!local167 && !local696) {
			return local1150;
		}
		@Pc(1179) Class92[] local1179 = null;
		if (local666 != null) {
			local1179 = local666.method8541(arg1);
		}
		if (local696 && local1179 != null) {
			for (local704 = 0; local704 < arg9.length; local704++) {
				if (local1179[local704] != null) {
					local1150.method7350(local1179[local704], 0x1 << local704, true);
				}
			}
		}
		local704 = 0;
		local789 = 1;
		while (local174 > local704) {
			if (Static467.aClass4_Sub5_Sub15Array5[local704] != null) {
				local1150.method7351(Static308.anIntArray686[local704], Static32.anIntArray63[local704], Static478.anIntArray514[local704], local789, Static660.anIntArray716[local704] - 1, false, Static408.aClass4_Sub5_Sub15Array3[local704], (int[]) null, Static467.aClass4_Sub5_Sub15Array5[local704]);
			}
			local789 <<= 0x1;
			local704++;
		}
		if (local696) {
			for (local795 = 0; local795 < arg9.length; local795++) {
				if (arg9[local795] != -1) {
					local902 = arg9[local795] - arg8;
					local902 &= 0x3FFF;
					@Pc(1287) Class92 local1287 = arg1.method8118();
					local1287.method3858(local902);
					local1150.method7350(local1287, 0x1 << local795, false);
				}
			}
		}
		if (local696 && local1179 != null) {
			for (local795 = 0; local795 < arg9.length; local795++) {
				if (local1179[local795] != null) {
					local1150.method7350(local1179[local795], 0x1 << local795, false);
				}
			}
		}
		if (local387 != null && local397 != null) {
			local1150.method7348(local213, local393, local395, local387, arg17 - 1, local391, arg13 - 1, false, local397, local375, local399, local389, local208, arg14.aBooleanArray7);
		} else if (local387 != null) {
			local1150.method7346(local375, local213, local389, false, arg17 - 1, local387, 0, local208);
		} else if (local397 != null) {
			local1150.method7346(local391, local395, local399, false, arg13 - 1, local397, 0, local393);
		}
		for (local795 = 0; local795 < local174; local795++) {
			Static467.aClass4_Sub5_Sub15Array5[local795] = null;
			Static408.aClass4_Sub5_Sub15Array3[local795] = null;
			Static336.aClass124Array4[local795] = null;
		}
		return local1150;
	}

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)V")
	private void method5069() {
		@Pc(7) long[] local7 = Class219.aLongArray8;
		this.aLong174 = -1L;
		this.aLong174 = this.aLong174 >>> 8 ^ local7[(int) (((long) (this.anInt5764 >> 8) ^ this.aLong174) & 0xFFL)];
		this.aLong174 = this.aLong174 >>> 8 ^ local7[(int) (((long) this.anInt5764 ^ this.aLong174) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray435.length; local50++) {
			this.aLong174 = local7[(int) (((long) (this.anIntArray435[local50] >> 24) ^ this.aLong174) & 0xFFL)] ^ this.aLong174 >>> 8;
			this.aLong174 = local7[(int) ((this.aLong174 ^ (long) (this.anIntArray435[local50] >> 16)) & 0xFFL)] ^ this.aLong174 >>> 8;
			this.aLong174 = local7[(int) (((long) (this.anIntArray435[local50] >> 8) ^ this.aLong174) & 0xFFL)] ^ this.aLong174 >>> 8;
			this.aLong174 = local7[(int) (((long) this.anIntArray435[local50] ^ this.aLong174) & 0xFFL)] ^ this.aLong174 >>> 8;
		}
		@Pc(153) int local153;
		if (this.aClass38Array1 != null) {
			for (local153 = 0; local153 < this.aClass38Array1.length; local153++) {
				if (this.aClass38Array1[local153] != null) {
					@Pc(175) int[] local175;
					@Pc(169) int[] local169;
					if (this.aBoolean441) {
						local169 = this.aClass38Array1[local153].anIntArray83;
						local175 = this.aClass38Array1[local153].anIntArray81;
					} else {
						local169 = this.aClass38Array1[local153].anIntArray80;
						local175 = this.aClass38Array1[local153].anIntArray82;
					}
					@Pc(193) int local193;
					if (local175 != null) {
						for (local193 = 0; local193 < local175.length; local193++) {
							this.aLong174 = local7[(int) ((this.aLong174 ^ (long) (local175[local193] >> 8)) & 0xFFL)] ^ this.aLong174 >>> 8;
							this.aLong174 = local7[(int) ((this.aLong174 ^ (long) local175[local193]) & 0xFFL)] ^ this.aLong174 >>> 8;
						}
					}
					if (local169 != null) {
						for (local193 = 0; local193 < local169.length; local193++) {
							this.aLong174 = this.aLong174 >>> 8 ^ local7[(int) (((long) (local169[local193] >> 8) ^ this.aLong174) & 0xFFL)];
							this.aLong174 = this.aLong174 >>> 8 ^ local7[(int) (((long) local169[local193] ^ this.aLong174) & 0xFFL)];
						}
					}
					if (this.aClass38Array1[local153].aShortArray13 != null) {
						for (local193 = 0; local193 < this.aClass38Array1[local153].aShortArray13.length; local193++) {
							this.aLong174 = local7[(int) (((long) (this.aClass38Array1[local153].aShortArray13[local193] >> 8) ^ this.aLong174) & 0xFFL)] ^ this.aLong174 >>> 8;
							this.aLong174 = local7[(int) ((this.aLong174 ^ (long) this.aClass38Array1[local153].aShortArray13[local193]) & 0xFFL)] ^ this.aLong174 >>> 8;
						}
					}
					if (this.aClass38Array1[local153].aShortArray14 != null) {
						for (local193 = 0; local193 < this.aClass38Array1[local153].aShortArray14.length; local193++) {
							this.aLong174 = local7[(int) (((long) (this.aClass38Array1[local153].aShortArray14[local193] >> 8) ^ this.aLong174) & 0xFFL)] ^ this.aLong174 >>> 8;
							this.aLong174 = local7[(int) ((this.aLong174 ^ (long) this.aClass38Array1[local153].aShortArray14[local193]) & 0xFFL)] ^ this.aLong174 >>> 8;
						}
					}
				}
			}
		}
		for (local153 = 0; local153 < 5; local153++) {
			this.aLong174 = local7[(int) (((long) this.anIntArray437[local153] ^ this.aLong174) & 0xFFL)] ^ this.aLong174 >>> 8;
		}
		this.aLong174 = this.aLong174 >>> 8 ^ local7[(int) (((long) (this.aBoolean441 ? 1 : 0) ^ this.aLong174) & 0xFFL)];
	}
}
