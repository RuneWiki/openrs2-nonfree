import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class73 {

	@OriginalMember(owner = "client!dea", name = "q", descriptor = "Z")
	public boolean aBoolean114;

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!dea", name = "r", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!dea", name = "e", descriptor = "I")
	private int anInt1398;

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!dea", name = "t", descriptor = "[Lclient!vq;")
	private Class383[] aClass383Array1;

	@OriginalMember(owner = "client!dea", name = "u", descriptor = "[I")
	public int[] anIntArray88;

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
	public int anInt1402 = -1;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
	private void method1360() {
		@Pc(7) long[] local7 = Class20.aLongArray1;
		this.aLong59 = -1L;
		this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) ((this.aLong59 ^ (long) (this.anInt1398 >> 8)) & 0xFFL)];
		this.aLong59 = local7[(int) ((this.aLong59 ^ (long) this.anInt1398) & 0xFFL)] ^ this.aLong59 >>> 8;
		for (@Pc(58) int local58 = 0; local58 < this.anIntArray87.length; local58++) {
			this.aLong59 = local7[(int) ((this.aLong59 ^ (long) (this.anIntArray87[local58] >> 24)) & 0xFFL)] ^ this.aLong59 >>> 8;
			this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) ((this.aLong59 ^ (long) (this.anIntArray87[local58] >> 16)) & 0xFFL)];
			this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) (((long) (this.anIntArray87[local58] >> 8) ^ this.aLong59) & 0xFFL)];
			this.aLong59 = local7[(int) ((this.aLong59 ^ (long) this.anIntArray87[local58]) & 0xFFL)] ^ this.aLong59 >>> 8;
		}
		@Pc(163) int local163;
		if (this.aClass383Array1 != null) {
			for (local163 = 0; local163 < this.aClass383Array1.length; local163++) {
				if (this.aClass383Array1[local163] != null) {
					@Pc(189) int[] local189;
					@Pc(183) int[] local183;
					if (this.aBoolean114) {
						local183 = this.aClass383Array1[local163].anIntArray681;
						local189 = this.aClass383Array1[local163].anIntArray683;
					} else {
						local189 = this.aClass383Array1[local163].anIntArray680;
						local183 = this.aClass383Array1[local163].anIntArray682;
					}
					@Pc(207) int local207;
					if (local189 != null) {
						for (local207 = 0; local207 < local189.length; local207++) {
							this.aLong59 = local7[(int) (((long) (local189[local207] >> 8) ^ this.aLong59) & 0xFFL)] ^ this.aLong59 >>> 8;
							this.aLong59 = local7[(int) (((long) local189[local207] ^ this.aLong59) & 0xFFL)] ^ this.aLong59 >>> 8;
						}
					}
					if (local183 != null) {
						for (local207 = 0; local207 < local183.length; local207++) {
							this.aLong59 = local7[(int) (((long) (local183[local207] >> 8) ^ this.aLong59) & 0xFFL)] ^ this.aLong59 >>> 8;
							this.aLong59 = local7[(int) ((this.aLong59 ^ (long) local183[local207]) & 0xFFL)] ^ this.aLong59 >>> 8;
						}
					}
					if (this.aClass383Array1[local163].aShortArray158 != null) {
						for (local207 = 0; local207 < this.aClass383Array1[local163].aShortArray158.length; local207++) {
							this.aLong59 = local7[(int) ((this.aLong59 ^ (long) (this.aClass383Array1[local163].aShortArray158[local207] >> 8)) & 0xFFL)] ^ this.aLong59 >>> 8;
							this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) ((this.aLong59 ^ (long) this.aClass383Array1[local163].aShortArray158[local207]) & 0xFFL)];
						}
					}
					if (this.aClass383Array1[local163].aShortArray157 != null) {
						for (local207 = 0; local207 < this.aClass383Array1[local163].aShortArray157.length; local207++) {
							this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) ((this.aLong59 ^ (long) (this.aClass383Array1[local163].aShortArray157[local207] >> 8)) & 0xFFL)];
							this.aLong59 = local7[(int) ((this.aLong59 ^ (long) this.aClass383Array1[local163].aShortArray157[local207]) & 0xFFL)] ^ this.aLong59 >>> 8;
						}
					}
				}
			}
		}
		for (local163 = 0; local163 < 5; local163++) {
			this.aLong59 = this.aLong59 >>> 8 ^ local7[(int) ((this.aLong59 ^ (long) this.anIntArray88[local163]) & 0xFFL)];
		}
		this.aLong59 = local7[(int) (((long) (this.aBoolean114 ? 1 : 0) ^ this.aLong59) & 0xFFL)] ^ this.aLong59 >>> 8;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IILclient!nb;I)V")
	public void method1361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class244 arg2) {
		if (arg0 == -1) {
			this.anIntArray87[arg1] = 0;
		} else if (arg2.method5958(arg0) != null) {
			this.anIntArray87[arg1] = arg0 | 0x40000000;
			this.method1360();
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!rl;III)V")
	public void method1362(@OriginalArg(0) Class319 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static527.anIntArray577[arg2];
		if (arg0.method7623(arg1) != null) {
			this.anIntArray87[local7] = Integer.MIN_VALUE | arg1;
			this.method1360();
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!rl;ZLclient!oc;Lclient!qu;Lclient!wh;BILclient!qu;Lclient!cq;Lclient!hq;Lclient!nb;Lclient!daa;[Lclient!qu;Lclient!ha;I[I)Lclient!ka;")
	public Class54 method1364(@OriginalArg(0) Class319 arg0, @OriginalArg(2) Class262 arg1, @OriginalArg(3) Class104 arg2, @OriginalArg(4) Class392 arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class104 arg6, @OriginalArg(8) Interface10 arg7, @OriginalArg(9) Class164 arg8, @OriginalArg(10) Class244 arg9, @OriginalArg(11) Class68 arg10, @OriginalArg(12) Class104[] arg11, @OriginalArg(13) Class75 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[] arg14) {
		if (this.anInt1402 != -1) {
			return arg8.method4157(this.anInt1402).method7161(arg6, arg7, arg5, arg2, arg12, arg13, arg3, (Class174) null, arg11, arg14);
		}
		@Pc(30) int local30 = arg13;
		@Pc(33) long local33 = this.aLong59;
		@Pc(36) int[] local36 = this.anIntArray87;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(68) int local68;
		@Pc(122) int local122;
		if (arg6 != null) {
			@Pc(46) Class212 local46 = arg6.method9041();
			if (local46 != null && (local46.anInt5517 >= 0 || local46.anInt5522 >= 0)) {
				local36 = new int[this.anIntArray87.length];
				for (local68 = 0; local68 < local36.length; local68++) {
					local36[local68] = this.anIntArray87[local68];
				}
				if (local46.anInt5517 >= 0 && arg1.anInt7208 != -1) {
					local38 = true;
					if (local46.anInt5517 == 65535) {
						local36[arg1.anInt7208] = 0;
						local33 ^= 0xFFFFFFFF00000000L;
						for (local122 = 0; local122 < arg1.anIntArray462.length; local122++) {
							local36[arg1.anIntArray462[local122]] = 0;
						}
					} else {
						local36[arg1.anInt7208] = local46.anInt5517 | 0x40000000;
						for (local122 = 0; local122 < arg1.anIntArray462.length; local122++) {
							local36[arg1.anIntArray462[local122]] = 0;
						}
						local33 ^= (long) local36[arg1.anInt7208] << 32;
					}
				}
				if (local46.anInt5522 >= 0 && arg1.anInt7210 != -1) {
					if (local46.anInt5522 == 65535) {
						local36[arg1.anInt7210] = 0;
						local33 ^= 0xFFFFFFFFL;
						for (local122 = 0; local122 < arg1.anIntArray461.length; local122++) {
							local36[arg1.anIntArray461[local122]] = 0;
						}
					} else {
						local36[arg1.anInt7210] = local46.anInt5522 | 0x40000000;
						for (local122 = 0; local122 < arg1.anIntArray461.length; local122++) {
							local36[arg1.anIntArray461[local122]] = 0;
						}
						local33 ^= (long) local36[arg1.anInt7210];
					}
					local40 = true;
				}
			}
		}
		@Pc(279) boolean local279 = false;
		local68 = arg11 == null ? 0 : arg11.length;
		for (local122 = 0; local122 < local68; local122++) {
			if (arg11[local122] != null) {
				local30 |= arg11[local122].method9025();
				local279 = true;
			}
		}
		if (arg6 != null) {
			local279 = true;
			local30 |= arg6.method9025();
		}
		if (arg2 != null) {
			local30 |= arg2.method9025();
			local279 = true;
		}
		@Pc(341) boolean local341 = false;
		if (arg14 != null) {
			for (@Pc(345) int local345 = 0; local345 < arg14.length; local345++) {
				if (arg14[local345] != -1) {
					local341 = true;
					local30 |= 0x20;
				}
			}
		}
		@Pc(367) Class359 local367 = Static535.aClass359_24;
		@Pc(375) Class54 local375;
		synchronized (Static535.aClass359_24) {
			local375 = (Class54) Static535.aClass359_24.method8517(local33);
		}
		@Pc(383) Class396 local383 = null;
		if (this.anInt1398 != -1) {
			local383 = arg3.method8909(this.anInt1398);
		}
		@Pc(423) int local423;
		@Pc(431) int local431;
		@Pc(647) int local647;
		@Pc(653) int local653;
		if (local375 == null || arg12.method6712(local375.ua(), local30) != 0) {
			if (local375 != null) {
				local30 = arg12.method6686(local30, local375.ua());
			}
			@Pc(421) boolean local421 = false;
			local423 = 0;
			while (true) {
				@Pc(449) int local449;
				if (local423 >= local36.length) {
					if (local421) {
						if (this.aLong58 != -1L) {
							@Pc(613) Class359 local613 = Static535.aClass359_24;
							synchronized (Static535.aClass359_24) {
								local375 = (Class54) Static535.aClass359_24.method8517(this.aLong58);
							}
						}
						if (local375 == null || arg12.method6712(local375.ua(), local30) != 0) {
							return null;
						}
					} else {
						@Pc(645) Class316[] local645 = new Class316[local36.length];
						for (local647 = 0; local647 < local36.length; local647++) {
							local653 = local36[local647];
							@Pc(655) Class383 local655 = null;
							@Pc(676) boolean local676 = local647 == 5 && local38 || local647 == 3 && local40;
							@Pc(713) Class316 local713;
							if ((local653 & 0x40000000) != 0) {
								if (!local676 && this.aClass383Array1 != null && this.aClass383Array1[local647] != null) {
									local655 = this.aClass383Array1[local647];
								}
								local713 = arg9.method5958(local653 & 0x3FFFFFFF).method6982(this.aBoolean114, local655);
								if (local713 != null) {
									local645[local647] = local713;
								}
							} else if ((local653 & Integer.MIN_VALUE) != 0) {
								local713 = arg0.method7623(local653 & 0x3FFFFFFF).method6109();
								if (local713 != null) {
									local645[local647] = local713;
								}
							}
						}
						@Pc(777) int local777;
						if (local383 != null && local383.anIntArrayArray60 != null) {
							for (local653 = 0; local653 < local383.anIntArrayArray60.length; local653++) {
								if (local645[local653] != null) {
									local449 = 0;
									local777 = 0;
									@Pc(779) int local779 = 0;
									@Pc(781) int local781 = 0;
									@Pc(783) int local783 = 0;
									@Pc(785) int local785 = 0;
									if (local383.anIntArrayArray60[local653] != null) {
										local781 = local383.anIntArrayArray60[local653][3] << 3;
										local783 = local383.anIntArrayArray60[local653][4] << 3;
										local779 = local383.anIntArrayArray60[local653][2];
										local449 = local383.anIntArrayArray60[local653][0];
										local785 = local383.anIntArrayArray60[local653][5] << 3;
										local777 = local383.anIntArrayArray60[local653][1];
									}
									if (local781 != 0 || local783 != 0 || local785 != 0) {
										local645[local653].method7541(local785, local781, local783);
									}
									if (local449 != 0 || local777 != 0 || local779 != 0) {
										local645[local653].method7544(local449, local779, local777);
									}
								}
							}
						}
						@Pc(901) int local901 = local30 | 0x4000;
						@Pc(908) Class316 local908 = new Class316(local645, local645.length);
						local375 = arg12.method6688(local908, local901, Static287.anInt5150, 64, 850);
						for (local449 = 0; local449 < 5; local449++) {
							for (local777 = 0; local777 < Static299.aShortArrayArrayArray2.length; local777++) {
								if (this.anIntArray88[local449] < Static299.aShortArrayArrayArray2[local777][local449].length) {
									local375.ia(Static98.aShortArrayArray4[local777][local449], Static299.aShortArrayArrayArray2[local777][local449][this.anIntArray88[local449]]);
								}
							}
						}
						if (true) {
							local375.s(local30);
							@Pc(986) Class359 local986 = Static535.aClass359_24;
							synchronized (Static535.aClass359_24) {
								Static535.aClass359_24.method8515(local33, local375);
							}
							this.aLong58 = local33;
						}
					}
					break;
				}
				local431 = local36[local423];
				@Pc(433) Class383 local433 = null;
				@Pc(435) boolean local435 = false;
				if (local38) {
					if (local423 == arg1.anInt7208) {
						local435 = true;
					} else {
						for (local449 = 0; local449 < arg1.anIntArray462.length; local449++) {
							if (arg1.anIntArray462[local449] == local423) {
								local435 = true;
								break;
							}
						}
					}
				}
				if (local40) {
					if (local423 == arg1.anInt7210) {
						local435 = true;
					} else {
						for (local449 = 0; local449 < arg1.anIntArray461.length; local449++) {
							if (local423 == arg1.anIntArray461[local449]) {
								local435 = true;
								break;
							}
						}
					}
				}
				if ((local431 & 0x40000000) != 0) {
					if (!local435 && this.aClass383Array1 != null && this.aClass383Array1[local423] != null) {
						local433 = this.aClass383Array1[local423];
					}
					if (!arg9.method5958(local431 & 0x3FFFFFFF).method6971(this.aBoolean114, local433)) {
						local421 = true;
					}
				} else if ((Integer.MIN_VALUE & local431) != 0 && !arg0.method7623(local431 & 0x3FFFFFFF).method6112()) {
					local421 = true;
				}
				local423++;
			}
		}
		@Pc(1008) Class54 local1008 = local375.method7398((byte) 4, local30, true);
		if (!local279 && !local341) {
			return local1008;
		}
		@Pc(1019) Class109[] local1019 = null;
		if (local383 != null) {
			local1019 = local383.method8962(arg12);
		}
		if (local341 && local1019 != null) {
			for (local423 = 0; local423 < arg14.length; local423++) {
				if (local1019[local423] != null) {
					local1008.method7416(local1019[local423], 0x1 << local423, true);
				}
			}
		}
		local423 = 0;
		local431 = 1;
		if (arg4 < 62) {
			this.aLong59 = -120L;
		}
		while (local68 > local423) {
			if (arg11[local423] != null) {
				arg11[local423].method9036(local431, local1008);
			}
			local423++;
			local431 <<= 0x1;
		}
		if (local341) {
			for (local647 = 0; local647 < arg14.length; local647++) {
				if (arg14[local647] != -1) {
					local653 = arg14[local647] - arg5;
					local653 &= 0x3FFF;
					@Pc(1139) Class109 local1139 = arg12.method6709();
					local1139.method4605(local653);
					local1008.method7416(local1139, 0x1 << local647, false);
				}
			}
		}
		if (local341 && local1019 != null) {
			for (local647 = 0; local647 < arg14.length; local647++) {
				if (local1019[local647] != null) {
					local1008.method7416(local1019[local647], 0x1 << local647, false);
				}
			}
		}
		if (arg6 != null && arg2 != null) {
			Static578.method8057(arg2, local1008, arg6);
		} else if (arg6 != null) {
			arg6.method9020(0, local1008);
		} else if (arg2 != null) {
			arg2.method9020(0, local1008);
		}
		return local1008;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!qu;Lclient!nb;ILclient!daa;Lclient!hq;Lclient!ha;Lclient!cq;ZLclient!rl;)Lclient!ka;")
	public Class54 method1367(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(3) Class68 arg2, @OriginalArg(4) Class164 arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) Interface10 arg5, @OriginalArg(8) Class319 arg6) {
		if (this.anInt1402 != -1) {
			return arg3.method4157(this.anInt1402).method7166((Class174) null, arg4, arg0, arg5);
		}
		@Pc(35) int local35 = arg0 == null ? 2048 : arg0.method9025() | 0x800;
		@Pc(37) Class359 local37 = Static296.aClass359_42;
		@Pc(46) Class54 local46;
		synchronized (Static296.aClass359_42) {
			local46 = (Class54) Static296.aClass359_42.method8517(this.aLong59);
		}
		if (local46 == null || arg4.method6712(local46.ua(), local35) != 0) {
			if (local46 != null) {
				local35 = arg4.method6686(local35, local46.ua());
			}
			@Pc(76) boolean local76 = false;
			for (@Pc(78) int local78 = 0; local78 < this.anIntArray87.length; local78++) {
				@Pc(87) int local87 = this.anIntArray87[local78];
				@Pc(89) Class383 local89 = null;
				if ((local87 & 0x40000000) != 0) {
					if (this.aClass383Array1 != null && this.aClass383Array1[local78] != null) {
						local89 = this.aClass383Array1[local78];
					}
					if (!arg1.method5958(local87 & 0x3FFFFFFF).method6979(local89, this.aBoolean114)) {
						local76 = true;
					}
				} else if ((Integer.MIN_VALUE & local87) != 0 && !arg6.method7623(local87 & 0x3FFFFFFF).method6114()) {
					local76 = true;
				}
			}
			if (local76) {
				return null;
			}
			@Pc(169) Class316[] local169 = new Class316[this.anIntArray87.length];
			@Pc(171) int local171 = 0;
			for (@Pc(173) int local173 = 0; local173 < this.anIntArray87.length; local173++) {
				@Pc(182) int local182 = this.anIntArray87[local173];
				@Pc(184) Class383 local184 = null;
				@Pc(217) Class316 local217;
				if ((local182 & 0x40000000) != 0) {
					if (this.aClass383Array1 != null && this.aClass383Array1[local173] != null) {
						local184 = this.aClass383Array1[local173];
					}
					local217 = arg1.method5958(local182 & 0x3FFFFFFF).method6978(this.aBoolean114, local184);
					if (local217 != null) {
						local169[local171++] = local217;
					}
				} else if ((local182 & Integer.MIN_VALUE) != 0) {
					local217 = arg6.method7623(local182 & 0x3FFFFFFF).method6113();
					if (local217 != null) {
						local169[local171++] = local217;
					}
				}
			}
			@Pc(264) Class316 local264 = new Class316(local169, local171);
			@Pc(268) int local268 = local35 | 0x4000;
			local46 = arg4.method6688(local264, local268, Static287.anInt5150, 64, 768);
			for (@Pc(280) int local280 = 0; local280 < 5; local280++) {
				for (@Pc(284) int local284 = 0; local284 < Static299.aShortArrayArrayArray2.length; local284++) {
					if (this.anIntArray88[local280] < Static299.aShortArrayArrayArray2[local284][local280].length) {
						local46.ia(Static98.aShortArrayArray4[local284][local280], Static299.aShortArrayArrayArray2[local284][local280][this.anIntArray88[local280]]);
					}
				}
			}
			local46.s(local35);
			@Pc(346) Class359 local346 = Static296.aClass359_42;
			synchronized (Static296.aClass359_42) {
				Static296.aClass359_42.method8515(this.aLong59, local46);
			}
		}
		if (arg0 == null) {
			return local46;
		} else {
			@Pc(371) Class54 local371 = local46.method7398((byte) 4, local35, true);
			arg0.method9020(0, local371);
			return local371;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IILclient!daa;Lclient!qu;IILclient!ha;ILclient!rl;)Lclient!ka;")
	public Class54 method1368(@OriginalArg(1) int arg0, @OriginalArg(2) Class68 arg1, @OriginalArg(3) Class104 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class75 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class319 arg6) {
		@Pc(30) int local30 = arg2 == null ? 2048 : arg2.method9025() | 0x800;
		@Pc(43) long local43 = (long) arg3 << 32 | (long) (arg0 << 16) | (long) arg5;
		@Pc(45) Class359 local45 = Static296.aClass359_42;
		@Pc(53) Class54 local53;
		synchronized (Static296.aClass359_42) {
			local53 = (Class54) Static296.aClass359_42.method8517(local43);
		}
		if (local53 == null || arg4.method6712(local53.ua(), local30) != 0) {
			if (local53 != null) {
				local30 = arg4.method6686(local30, local53.ua());
			}
			@Pc(84) Class316[] local84 = new Class316[3];
			@Pc(86) int local86 = 0;
			if (!arg6.method7623(arg5).method6114() || !arg6.method7623(arg0).method6114() || !arg6.method7623(arg3).method6114()) {
				return null;
			}
			@Pc(121) Class316 local121 = arg6.method7623(arg5).method6113();
			if (local121 != null) {
				local86++;
				local84[0] = local121;
			}
			local121 = arg6.method7623(arg0).method6113();
			if (local121 != null) {
				local84[local86++] = local121;
			}
			local121 = arg6.method7623(arg3).method6113();
			if (local121 != null) {
				local84[local86++] = local121;
			}
			local121 = new Class316(local84, local86);
			@Pc(172) int local172 = local30 | 0x4000;
			local53 = arg4.method6688(local121, local172, Static287.anInt5150, 64, 768);
			for (@Pc(182) int local182 = 0; local182 < 5; local182++) {
				for (@Pc(186) int local186 = 0; local186 < Static299.aShortArrayArrayArray2.length; local186++) {
					if (this.anIntArray88[local182] < Static299.aShortArrayArrayArray2[local186][local182].length) {
						local53.ia(Static98.aShortArrayArray4[local186][local182], Static299.aShortArrayArrayArray2[local186][local182][this.anIntArray88[local182]]);
					}
				}
			}
			local53.s(local30);
			@Pc(238) Class359 local238 = Static296.aClass359_42;
			synchronized (Static296.aClass359_42) {
				Static296.aClass359_42.method8515(local43, local53);
			}
		}
		if (arg2 == null) {
			return local53;
		} else {
			local53 = local53.method7398((byte) 4, local30, true);
			arg2.method9020(0, local53);
			return local53;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([Lclient!vq;[IZBII[I)V")
	public void method1369(@OriginalArg(0) Class383[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5) {
		this.anIntArray87 = arg5;
		this.anIntArray88 = arg1;
		this.anInt1402 = arg4;
		if (this.anInt1398 != arg3) {
			this.anInt1398 = arg3;
		}
		this.aBoolean114 = arg2;
		this.aClass383Array1 = arg0;
		this.method1360();
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)V")
	public void method1370(@OriginalArg(0) boolean arg0) {
		this.aBoolean114 = arg0;
		this.method1360();
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(III)V")
	public void method1371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray88[arg0] = arg1;
		this.method1360();
	}
}
