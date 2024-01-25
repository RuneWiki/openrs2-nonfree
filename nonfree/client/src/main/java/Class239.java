import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class239 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "J")
	private long aLong191;

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Z")
	public boolean aBoolean474;

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "[I")
	public int[] anIntArray374;

	@OriginalMember(owner = "client!mw", name = "j", descriptor = "[Lclient!af;")
	private Class9[] aClass9Array1;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "J")
	private long aLong192;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
	private int anInt6629;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	public int anInt6621 = -1;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "([IZIII[I[Lclient!af;)V")
	public void method5579(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class9[] arg5) {
		this.anIntArray375 = arg4;
		this.anIntArray374 = arg0;
		this.aClass9Array1 = arg5;
		this.aBoolean474 = arg1;
		if (this.anInt6629 != arg3) {
			this.anInt6629 = arg3;
		}
		this.anInt6621 = arg2;
		this.method5583();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I[ILclient!co;IBZLclient!ds;Lclient!gf;Lclient!co;IILclient!me;Lclient!gl;ILclient!it;Lclient!qi;Lclient!ha;III[Lclient!gda;)Lclient!ka;")
	public Class114 method5580(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int arg3, @OriginalArg(6) Class83 arg4, @OriginalArg(7) Class128 arg5, @OriginalArg(8) Class65 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class230 arg9, @OriginalArg(12) Class135 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) Class172 arg12, @OriginalArg(15) Interface23 arg13, @OriginalArg(16) Class143 arg14, @OriginalArg(17) int arg15, @OriginalArg(18) int arg16, @OriginalArg(19) int arg17, @OriginalArg(20) Class127[] arg18) {
		if (this.anInt6621 != -1) {
			return arg9.method5297(this.anInt6621).method7330(arg18, arg0, arg1, arg6, arg17, arg15, arg2, arg7, (Class316) null, arg13, arg11, arg16, arg5, arg8, arg3, arg12, arg14);
		}
		@Pc(34) int local34 = arg8;
		@Pc(37) long local37 = this.aLong191;
		@Pc(40) int[] local40 = this.anIntArray375;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		if (arg6 != null && (arg6.anInt1423 >= 0 || arg6.anInt1433 >= 0)) {
			local40 = new int[this.anIntArray375.length];
			for (@Pc(62) int local62 = 0; local62 < local40.length; local62++) {
				local40[local62] = this.anIntArray375[local62];
			}
			if (arg6.anInt1423 >= 0) {
				if (arg6.anInt1423 == 65535) {
					local40[5] = 0;
					local37 ^= 0xFFFFFFFF00000000L;
					local42 = true;
				} else {
					local40[5] = arg6.anInt1423 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg6.anInt1433 >= 0) {
				local44 = true;
				if (arg6.anInt1433 == 65535) {
					local40[3] = 0;
					local37 ^= 0xFFFFFFFFL;
				} else {
					local40[3] = arg6.anInt1433 | 0x40000000;
					local37 ^= (long) local40[3];
				}
			}
		}
		@Pc(153) boolean local153 = false;
		@Pc(155) boolean local155 = false;
		@Pc(157) boolean local157 = false;
		@Pc(165) boolean local165 = arg6 != null || arg2 != null;
		@Pc(172) int local172 = arg18 == null ? 0 : arg18.length;
		@Pc(205) int local205;
		@Pc(210) int local210;
		for (@Pc(174) int local174 = 0; local174 < local172; local174++) {
			Static434.aClass5_Sub2_Sub20Array4[local174] = null;
			if (arg18[local174] != null) {
				@Pc(191) Class65 local191 = arg5.method2686(arg18[local174].anInt2995);
				if (local191.anIntArray75 != null) {
					local165 = true;
					Static564.aClass65Array2[local174] = local191;
					local205 = arg18[local174].anInt2993;
					local210 = arg18[local174].anInt2994;
					@Pc(215) int local215 = local191.anIntArray75[local205];
					Static434.aClass5_Sub2_Sub20Array4[local174] = arg5.method2690(local215 >>> 16);
					@Pc(228) int local228 = local215 & 0xFFFF;
					Static603.anIntArray556[local174] = local228;
					if (Static434.aClass5_Sub2_Sub20Array4[local174] != null) {
						local155 |= Static434.aClass5_Sub2_Sub20Array4[local174].method8287(local228);
						local153 |= Static434.aClass5_Sub2_Sub20Array4[local174].method8283(local228);
						local157 |= Static434.aClass5_Sub2_Sub20Array4[local174].method8288(local228);
					}
					if ((local191.aBoolean107 || Static67.aBoolean65) && local210 != -1 && local210 < local191.anIntArray75.length) {
						Static491.anIntArray457[local174] = local191.anIntArray71[local205];
						Static151.anIntArray481[local174] = arg18[local174].anInt2991;
						@Pc(296) int local296 = local191.anIntArray75[local210];
						Static400.aClass5_Sub2_Sub20Array3[local174] = arg5.method2690(local296 >>> 16);
						@Pc(309) int local309 = local296 & 0xFFFF;
						Static218.anIntArray192[local174] = local309;
						if (Static400.aClass5_Sub2_Sub20Array3[local174] != null) {
							local155 |= Static400.aClass5_Sub2_Sub20Array3[local174].method8287(local309);
							local153 |= Static400.aClass5_Sub2_Sub20Array3[local174].method8283(local309);
							local157 |= Static400.aClass5_Sub2_Sub20Array3[local174].method8288(local309);
						}
					} else {
						Static491.anIntArray457[local174] = 0;
						Static151.anIntArray481[local174] = 0;
						Static400.aClass5_Sub2_Sub20Array3[local174] = null;
						Static218.anIntArray192[local174] = -1;
					}
				}
			}
		}
		@Pc(371) int local371 = -1;
		local205 = -1;
		local210 = 0;
		@Pc(377) Class5_Sub2_Sub20 local377 = null;
		@Pc(379) Class5_Sub2_Sub20 local379 = null;
		@Pc(381) int local381 = -1;
		@Pc(383) int local383 = -1;
		@Pc(385) int local385 = 0;
		@Pc(387) Class5_Sub2_Sub20 local387 = null;
		@Pc(389) Class5_Sub2_Sub20 local389 = null;
		if (local165) {
			@Pc(402) int local402;
			@Pc(462) int local462;
			if (arg6 != null) {
				local371 = arg6.anIntArray75[arg15];
				local402 = local371 >>> 16;
				local377 = arg5.method2690(local402);
				local371 &= 0xFFFF;
				if (local377 != null) {
					local155 |= local377.method8287(local371);
					local153 |= local377.method8283(local371);
					local157 |= local377.method8288(local371);
				}
				if ((arg6.aBoolean107 || Static67.aBoolean65) && arg16 != -1 && arg16 < arg6.anIntArray75.length) {
					local205 = arg6.anIntArray75[arg16];
					local210 = arg6.anIntArray71[arg15];
					local462 = local205 >>> 16;
					local379 = local402 == local462 ? local377 : arg5.method2690(local462);
					local205 &= 0xFFFF;
					if (local379 != null) {
						local155 |= local379.method8287(local205);
						local153 |= local379.method8283(local205);
						local157 |= local379.method8288(local205);
					}
				}
			}
			local34 = arg8 | 0x20;
			if (arg2 != null) {
				local381 = arg2.anIntArray75[arg3];
				local402 = local381 >>> 16;
				local381 &= 0xFFFF;
				local387 = arg5.method2690(local402);
				if (local387 != null) {
					local155 |= local387.method8287(local381);
					local153 |= local387.method8283(local381);
					local157 |= local387.method8288(local381);
				}
				if ((arg2.aBoolean107 || Static67.aBoolean65) && arg0 != -1 && arg0 < arg2.anIntArray75.length) {
					local385 = arg2.anIntArray71[arg3];
					local383 = arg2.anIntArray75[arg0];
					local462 = local383 >>> 16;
					local383 &= 0xFFFF;
					local389 = local462 == local402 ? local387 : arg5.method2690(local462);
					if (local389 != null) {
						local155 |= local389.method8287(local383);
						local153 |= local389.method8283(local383);
						local157 |= local389.method8288(local383);
					}
				}
			}
			if (local155) {
				local34 |= 0x80;
			}
			if (local153) {
				local34 |= 0x100;
			}
			if (local157) {
				local34 |= 0x400;
			}
		}
		@Pc(643) Class265 local643 = Static168.aClass265_9;
		@Pc(651) Class114 local651;
		synchronized (Static168.aClass265_9) {
			local651 = (Class114) Static168.aClass265_9.method6577(local37);
		}
		@Pc(659) Class201 local659 = null;
		if (this.anInt6629 != -1) {
			local659 = arg12.method3615(this.anInt6629);
		}
		@Pc(693) boolean local693;
		@Pc(695) int local695;
		@Pc(700) int local700;
		@Pc(783) int local783;
		@Pc(788) int local788;
		@Pc(885) int local885;
		if (local651 == null || arg14.method6226(local651.ua(), local34) != 0) {
			if (local651 != null) {
				local34 = arg14.method6204(local34, local651.ua());
			}
			local693 = false;
			local695 = 0;
			while (true) {
				if (local695 >= local40.length) {
					if (local693) {
						if (this.aLong192 != -1L) {
							@Pc(1091) Class265 local1091 = Static168.aClass265_9;
							synchronized (Static168.aClass265_9) {
								local651 = (Class114) Static168.aClass265_9.method6577(this.aLong192);
							}
						}
						if (local651 == null || arg14.method6226(local651.ua(), local34) != 0) {
							return null;
						}
					} else {
						@Pc(781) Class156[] local781 = new Class156[local40.length];
						for (local783 = 0; local783 < local40.length; local783++) {
							local788 = local40[local783];
							@Pc(790) Class9 local790 = null;
							@Pc(806) boolean local806 = local783 == 5 && local42 || local783 == 3 && local44;
							@Pc(837) Class156 local837;
							if ((local788 & 0x40000000) != 0) {
								if (!local806 && this.aClass9Array1 != null && this.aClass9Array1[local783] != null) {
									local790 = this.aClass9Array1[local783];
								}
								local837 = arg10.method2776(local788 & 0x3FFFFFFF).method5165(local790, this.aBoolean474);
								if (local837 != null) {
									local781[local783] = local837;
								}
							} else if ((local788 & Integer.MIN_VALUE) != 0) {
								local837 = arg4.method1835(local788 & 0x3FFFFFFF).method8295();
								if (local837 != null) {
									local781[local783] = local837;
								}
							}
						}
						@Pc(887) int local887;
						if (local659 != null && local659.anIntArrayArray44 != null) {
							for (local788 = 0; local788 < local659.anIntArrayArray44.length; local788++) {
								if (local781[local788] != null) {
									local885 = 0;
									local887 = 0;
									@Pc(889) int local889 = 0;
									@Pc(891) int local891 = 0;
									@Pc(893) int local893 = 0;
									@Pc(895) int local895 = 0;
									if (local659.anIntArrayArray44[local788] != null) {
										local893 = local659.anIntArrayArray44[local788][4] << 3;
										local887 = local659.anIntArrayArray44[local788][1];
										local889 = local659.anIntArrayArray44[local788][2];
										local891 = local659.anIntArrayArray44[local788][3] << 3;
										local885 = local659.anIntArrayArray44[local788][0];
										local895 = local659.anIntArrayArray44[local788][5] << 3;
									}
									if (local891 != 0 || local893 != 0 || local895 != 0) {
										local781[local788].method3278(local895, local891, local893);
									}
									if (local885 != 0 || local887 != 0 || local889 != 0) {
										local781[local788].method3274(local889, local887, local885);
									}
								}
							}
						}
						@Pc(1001) Class156 local1001 = new Class156(local781, local781.length);
						@Pc(1005) int local1005 = local34 | 0x4000;
						local651 = arg14.method6203(local1001, local1005, Static250.anInt4004, 64, 850);
						for (local885 = 0; local885 < 5; local885++) {
							for (local887 = 0; local887 < Static469.aShortArrayArrayArray4.length; local887++) {
								if (Static469.aShortArrayArrayArray4[local887][local885].length > this.anIntArray374[local885]) {
									local651.ia(Static544.aShortArrayArray16[local887][local885], Static469.aShortArrayArrayArray4[local887][local885][this.anIntArray374[local885]]);
								}
							}
						}
						local651.s(local34);
						@Pc(1067) Class265 local1067 = Static168.aClass265_9;
						synchronized (Static168.aClass265_9) {
							Static168.aClass265_9.method6566(local651, local37);
						}
						this.aLong192 = local37;
					}
					break;
				}
				local700 = local40[local695];
				@Pc(702) Class9 local702 = null;
				@Pc(718) boolean local718 = local695 == 5 && local42 || local695 == 3 && local44;
				if ((local700 & 0x40000000) != 0) {
					if (!local718 && this.aClass9Array1 != null && this.aClass9Array1[local695] != null) {
						local702 = this.aClass9Array1[local695];
					}
					if (!arg10.method2776(local700 & 0x3FFFFFFF).method5183(this.aBoolean474, local702)) {
						local693 = true;
					}
				} else if ((local700 & Integer.MIN_VALUE) != 0 && !arg4.method1835(local700 & 0x3FFFFFFF).method8300()) {
					local693 = true;
				}
				local695++;
			}
		}
		@Pc(1128) Class114 local1128 = local651.method8810((byte) 4, local34, true);
		local693 = false;
		if (arg1 != null) {
			for (local695 = 0; local695 < arg1.length; local695++) {
				if (arg1[local695] != -1) {
					local693 = true;
				}
			}
		}
		if (!local165 && !local693) {
			return local1128;
		}
		@Pc(1160) Class56[] local1160 = null;
		if (local659 != null) {
			local1160 = local659.method4157(arg14);
		}
		if (local693 && local1160 != null) {
			for (local700 = 0; local700 < arg1.length; local700++) {
				if (local1160[local700] != null) {
					local1128.method8789(local1160[local700], 0x1 << local700, true);
				}
			}
		}
		local700 = 0;
		local783 = 1;
		while (local700 < local172) {
			if (Static434.aClass5_Sub2_Sub20Array4[local700] != null) {
				local1128.method8804(Static603.anIntArray556[local700], Static151.anIntArray481[local700] - 1, (int[]) null, Static400.aClass5_Sub2_Sub20Array3[local700], Static491.anIntArray457[local700], Static434.aClass5_Sub2_Sub20Array4[local700], false, Static218.anIntArray192[local700], local783);
			}
			local700++;
			local783 <<= 0x1;
		}
		if (local693) {
			for (local788 = 0; local788 < arg1.length; local788++) {
				if (arg1[local788] != -1) {
					local885 = arg1[local788] - arg11;
					local885 &= 0x3FFF;
					@Pc(1264) Class56 local1264 = arg14.method6232();
					local1264.method8391(local885);
					local1128.method8789(local1264, 0x1 << local788, false);
				}
			}
		}
		if (local693 && local1160 != null) {
			for (local788 = 0; local788 < arg1.length; local788++) {
				if (local1160[local788] != null) {
					local1128.method8789(local1160[local788], 0x1 << local788, false);
				}
			}
		}
		if (local377 != null && local387 != null) {
			local1128.method8803(local371, local210, arg17 - 1, local385, local205, arg7 - 1, local379, local387, local383, false, local389, arg6.aBooleanArray2, local381, local377);
		} else if (local377 != null) {
			local1128.method8794(local210, local205, local377, local379, false, 0, local371, arg17 - 1);
		} else if (local387 != null) {
			local1128.method8794(local385, local383, local387, local389, false, 0, local381, arg7 - 1);
		}
		for (local788 = 0; local788 < local172; local788++) {
			Static434.aClass5_Sub2_Sub20Array4[local788] = null;
			Static400.aClass5_Sub2_Sub20Array3[local788] = null;
			Static564.aClass65Array2[local788] = null;
		}
		return local1128;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!co;IILclient!ha;Lclient!ds;Lclient!qi;Lclient!gl;Lclient!me;Lclient!gf;III)Lclient!ka;")
	public Class114 method5581(@OriginalArg(0) Class65 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class143 arg2, @OriginalArg(4) Class83 arg3, @OriginalArg(5) Interface23 arg4, @OriginalArg(6) Class135 arg5, @OriginalArg(7) Class230 arg6, @OriginalArg(8) Class128 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		if (this.anInt6621 != -1) {
			return arg6.method5297(this.anInt6621).method7331(arg9, arg0, (Class316) null, arg8, arg7, arg4, arg1, arg2);
		}
		@Pc(31) int local31 = 2048;
		@Pc(39) boolean local39;
		@Pc(52) int local52;
		@Pc(124) int local124;
		@Pc(62) int local62;
		@Pc(128) int local128;
		if (arg0 != null) {
			@Pc(35) boolean local35 = false;
			@Pc(37) boolean local37 = false;
			local39 = false;
			@Pc(41) boolean local41 = false;
			local52 = arg0.anIntArray75[arg8];
			local31 = 2080;
			local62 = local52 >>> 16;
			@Pc(69) Class5_Sub2_Sub20 local69 = arg7.method2690(local62);
			@Pc(73) int local73 = local52 & 0xFFFF;
			if (local69 != null) {
				local37 = local69.method8287(local73) | false;
				local35 = local69.method8283(local73) | false;
				local41 = local69.method8288(local73) | false;
				local39 = arg0.aBoolean106 | false;
			}
			if ((arg0.aBoolean107 || Static67.aBoolean65) && arg1 != -1 && arg0.anIntArray75.length > arg1) {
				local124 = arg0.anIntArray75[arg1];
				local128 = local124 >>> 16;
				@Pc(132) int local132 = local124 & 0xFFFF;
				@Pc(146) Class5_Sub2_Sub20 local146 = local128 == local62 ? local69 : arg7.method2690(local128);
				if (local146 != null) {
					local37 |= local146.method8287(local132);
					local35 |= local146.method8283(local132);
					local41 |= local146.method8288(local132);
				}
			}
			if (local37) {
				local31 = 2208;
			}
			if (local35) {
				local31 |= 0x100;
			}
			if (local39) {
				local31 |= 0x200;
			}
			if (local41) {
				local31 |= 0x400;
			}
		}
		@Pc(195) Class265 local195 = Static360.aClass265_36;
		@Pc(204) Class114 local204;
		synchronized (Static360.aClass265_36) {
			local204 = (Class114) Static360.aClass265_36.method6577(this.aLong191);
		}
		if (local204 == null || arg2.method6226(local204.ua(), local31) != 0) {
			if (local204 != null) {
				local31 = arg2.method6204(local31, local204.ua());
			}
			local39 = false;
			for (@Pc(232) int local232 = 0; local232 < this.anIntArray375.length; local232++) {
				local52 = this.anIntArray375[local232];
				@Pc(240) Class9 local240 = null;
				if ((local52 & 0x40000000) != 0) {
					if (this.aClass9Array1 != null && this.aClass9Array1[local232] != null) {
						local240 = this.aClass9Array1[local232];
					}
					if (!arg5.method2776(local52 & 0x3FFFFFFF).method5167(this.aBoolean474, local240)) {
						local39 = true;
					}
				} else if ((Integer.MIN_VALUE & local52) != 0 && !arg3.method1835(local52 & 0x3FFFFFFF).method8298()) {
					local39 = true;
				}
			}
			if (local39) {
				return null;
			}
			@Pc(305) Class156[] local305 = new Class156[this.anIntArray375.length];
			local124 = 0;
			for (@Pc(309) int local309 = 0; local309 < this.anIntArray375.length; local309++) {
				@Pc(315) int local315 = this.anIntArray375[local309];
				@Pc(317) Class9 local317 = null;
				@Pc(349) Class156 local349;
				if ((local315 & 0x40000000) != 0) {
					if (this.aClass9Array1 != null && this.aClass9Array1[local309] != null) {
						local317 = this.aClass9Array1[local309];
					}
					local349 = arg5.method2776(local315 & 0x3FFFFFFF).method5182(local317, this.aBoolean474);
					if (local349 != null) {
						local305[local124++] = local349;
					}
				} else if ((local315 & Integer.MIN_VALUE) != 0) {
					local349 = arg3.method1835(local315 & 0x3FFFFFFF).method8302();
					if (local349 != null) {
						local305[local124++] = local349;
					}
				}
			}
			@Pc(393) Class156 local393 = new Class156(local305, local124);
			@Pc(397) int local397 = local31 | 0x4000;
			local204 = arg2.method6203(local393, local397, Static250.anInt4004, 64, 768);
			for (local62 = 0; local62 < 5; local62++) {
				for (local128 = 0; local128 < Static469.aShortArrayArrayArray4.length; local128++) {
					if (this.anIntArray374[local62] < Static469.aShortArrayArrayArray4[local128][local62].length) {
						local204.ia(Static544.aShortArrayArray16[local128][local62], Static469.aShortArrayArrayArray4[local128][local62][this.anIntArray374[local62]]);
					}
				}
			}
			local204.s(local31);
			@Pc(461) Class265 local461 = Static360.aClass265_36;
			synchronized (Static360.aClass265_36) {
				Static360.aClass265_36.method6566(local204, this.aLong191);
			}
		}
		if (arg0 == null) {
			return local204;
		} else {
			local204.method8810((byte) 4, local31, true);
			return arg0.method1295(local204, 2048, arg1, arg9, arg8);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ha;ILclient!ds;ILclient!gf;Lclient!co;IIIIIB)Lclient!ka;")
	public Class114 method5582(@OriginalArg(0) Class143 arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class128 arg3, @OriginalArg(5) Class65 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = 2048;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(95) int local95;
		if (arg4 != null) {
			@Pc(9) boolean local9 = false;
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local5 = 2080;
			local32 = arg4.anIntArray75[arg6];
			local36 = local32 >>> 16;
			@Pc(41) Class5_Sub2_Sub20 local41 = arg3.method2690(local36);
			@Pc(45) int local45 = local32 & 0xFFFF;
			if (local41 != null) {
				local11 = local41.method8287(local45) | false;
				local9 = local41.method8283(local45) | false;
				local15 = local41.method8288(local45) | false;
				local13 = arg4.aBoolean106 | false;
			}
			if ((arg4.aBoolean107 || Static67.aBoolean65) && arg5 != -1 && arg5 < arg4.anIntArray75.length) {
				@Pc(91) int local91 = arg4.anIntArray75[arg5];
				local95 = local91 >>> 16;
				@Pc(99) int local99 = local91 & 0xFFFF;
				@Pc(104) Class5_Sub2_Sub20 local104;
				if (local36 == local95) {
					local104 = local41;
				} else {
					local104 = arg3.method2690(local99 >>> 16);
				}
				if (local104 != null) {
					local11 |= local104.method8287(local99);
					local9 |= local104.method8283(local99);
					local15 |= local104.method8288(local99);
				}
			}
			if (local11) {
				local5 = 2208;
			}
			if (local9) {
				local5 |= 0x100;
			}
			if (local13) {
				local5 |= 0x200;
			}
			if (local15) {
				local5 |= 0x400;
			}
		}
		@Pc(172) long local172 = (long) arg2 | (long) arg7 << 32 | (long) (arg9 << 16);
		@Pc(182) Class265 local182 = Static360.aClass265_36;
		@Pc(190) Class114 local190;
		synchronized (Static360.aClass265_36) {
			local190 = (Class114) Static360.aClass265_36.method6577(local172);
		}
		if (local190 == null || arg0.method6226(local190.ua(), local5) != 0) {
			if (local190 != null) {
				local5 = arg0.method6204(local5, local190.ua());
			}
			@Pc(217) Class156[] local217 = new Class156[3];
			@Pc(219) int local219 = 0;
			if (!arg1.method1835(arg2).method8298() || !arg1.method1835(arg9).method8298() || !arg1.method1835(arg7).method8298()) {
				return null;
			}
			@Pc(247) Class156 local247 = arg1.method1835(arg2).method8302();
			if (local247 != null) {
				local219++;
				local217[0] = local247;
			}
			local247 = arg1.method1835(arg9).method8302();
			if (local247 != null) {
				local217[local219++] = local247;
			}
			local247 = arg1.method1835(arg7).method8302();
			if (local247 != null) {
				local217[local219++] = local247;
			}
			local32 = local5 | 0x4000;
			local247 = new Class156(local217, local219);
			local190 = arg0.method6203(local247, local32, Static250.anInt4004, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				for (local95 = 0; local95 < Static469.aShortArrayArrayArray4.length; local95++) {
					if (this.anIntArray374[local36] < Static469.aShortArrayArrayArray4[local95][local36].length) {
						local190.ia(Static544.aShortArrayArray16[local95][local36], Static469.aShortArrayArrayArray4[local95][local36][this.anIntArray374[local36]]);
					}
				}
			}
			local190.s(local5);
			@Pc(356) Class265 local356 = Static360.aClass265_36;
			synchronized (Static360.aClass265_36) {
				Static360.aClass265_36.method6566(local190, local172);
			}
		}
		if (arg4 == null) {
			return local190;
		} else {
			local190 = local190.method8810((byte) 4, local5, true);
			return arg4.method1295(local190, 2048, arg5, arg8, arg6);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	private void method5583() {
		@Pc(5) long[] local5 = Class153_Sub4.aLongArray22;
		this.aLong191 = -1L;
		this.aLong191 = local5[(int) ((this.aLong191 ^ (long) (this.anInt6629 >> 8)) & 0xFFL)] ^ this.aLong191 >>> 8;
		this.aLong191 = local5[(int) (((long) this.anInt6629 ^ this.aLong191) & 0xFFL)] ^ this.aLong191 >>> 8;
		for (@Pc(48) int local48 = 0; local48 < this.anIntArray375.length; local48++) {
			this.aLong191 = local5[(int) ((this.aLong191 ^ (long) (this.anIntArray375[local48] >> 24)) & 0xFFL)] ^ this.aLong191 >>> 8;
			this.aLong191 = local5[(int) ((this.aLong191 ^ (long) (this.anIntArray375[local48] >> 16)) & 0xFFL)] ^ this.aLong191 >>> 8;
			this.aLong191 = this.aLong191 >>> 8 ^ local5[(int) ((this.aLong191 ^ (long) (this.anIntArray375[local48] >> 8)) & 0xFFL)];
			this.aLong191 = local5[(int) (((long) this.anIntArray375[local48] ^ this.aLong191) & 0xFFL)] ^ this.aLong191 >>> 8;
		}
		@Pc(146) int local146;
		if (this.aClass9Array1 != null) {
			for (local146 = 0; local146 < this.aClass9Array1.length; local146++) {
				if (this.aClass9Array1[local146] != null) {
					@Pc(167) int[] local167;
					@Pc(161) int[] local161;
					if (this.aBoolean474) {
						local161 = this.aClass9Array1[local146].anIntArray18;
						local167 = this.aClass9Array1[local146].anIntArray20;
					} else {
						local161 = this.aClass9Array1[local146].anIntArray21;
						local167 = this.aClass9Array1[local146].anIntArray22;
					}
					@Pc(184) int local184;
					if (local167 != null) {
						for (local184 = 0; local184 < local167.length; local184++) {
							this.aLong191 = local5[(int) ((this.aLong191 ^ (long) (local167[local184] >> 8)) & 0xFFL)] ^ this.aLong191 >>> 8;
							this.aLong191 = this.aLong191 >>> 8 ^ local5[(int) ((this.aLong191 ^ (long) local167[local184]) & 0xFFL)];
						}
					}
					if (local161 != null) {
						for (local184 = 0; local184 < local161.length; local184++) {
							this.aLong191 = this.aLong191 >>> 8 ^ local5[(int) (((long) (local161[local184] >> 8) ^ this.aLong191) & 0xFFL)];
							this.aLong191 = this.aLong191 >>> 8 ^ local5[(int) (((long) local161[local184] ^ this.aLong191) & 0xFFL)];
						}
					}
					if (this.aClass9Array1[local146].aShortArray2 != null) {
						for (local184 = 0; local184 < this.aClass9Array1[local146].aShortArray2.length; local184++) {
							this.aLong191 = this.aLong191 >>> 8 ^ local5[(int) ((this.aLong191 ^ (long) (this.aClass9Array1[local146].aShortArray2[local184] >> 8)) & 0xFFL)];
							this.aLong191 = local5[(int) (((long) this.aClass9Array1[local146].aShortArray2[local184] ^ this.aLong191) & 0xFFL)] ^ this.aLong191 >>> 8;
						}
					}
					if (this.aClass9Array1[local146].aShortArray1 != null) {
						for (local184 = 0; local184 < this.aClass9Array1[local146].aShortArray1.length; local184++) {
							this.aLong191 = local5[(int) (((long) (this.aClass9Array1[local146].aShortArray1[local184] >> 8) ^ this.aLong191) & 0xFFL)] ^ this.aLong191 >>> 8;
							this.aLong191 = local5[(int) ((this.aLong191 ^ (long) this.aClass9Array1[local146].aShortArray1[local184]) & 0xFFL)] ^ this.aLong191 >>> 8;
						}
					}
				}
			}
		}
		for (local146 = 0; local146 < 5; local146++) {
			this.aLong191 = this.aLong191 >>> 8 ^ local5[(int) ((this.aLong191 ^ (long) this.anIntArray374[local146]) & 0xFFL)];
		}
		this.aLong191 = local5[(int) ((this.aLong191 ^ (long) (this.aBoolean474 ? 1 : 0)) & 0xFFL)] ^ this.aLong191 >>> 8;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!ds;III)V")
	public void method5584(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = Static316.anIntArray453[arg2];
		if (arg0.method1835(arg1) != null) {
			this.anIntArray375[local11] = Integer.MIN_VALUE | arg1;
			this.method5583();
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZZ)V")
	public void method5585(@OriginalArg(0) boolean arg0) {
		this.aBoolean474 = arg0;
		this.method5583();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IBILclient!gl;)V")
	public void method5587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class135 arg2) {
		if (arg0 == -1) {
			this.anIntArray375[arg1] = 0;
		} else if (arg2.method2776(arg0) != null) {
			this.anIntArray375[arg1] = arg0 | 0x40000000;
			this.method5583();
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZII)V")
	public void method5588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray374[arg1] = arg0;
		this.method5583();
	}
}
