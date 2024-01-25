import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public final class Class75 {

	@OriginalMember(owner = "client!efa", name = "H", descriptor = "[Lclient!fca;")
	private static final Class92[] aClass92Array1 = new Class92[32];

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "Z")
	public boolean aBoolean214;

	@OriginalMember(owner = "client!efa", name = "h", descriptor = "[I")
	public int[] anIntArray193;

	@OriginalMember(owner = "client!efa", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "I")
	private int anInt2649;

	@OriginalMember(owner = "client!efa", name = "r", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
	public int anInt2650 = -1;

	static {
		@Pc(95) Class92[] local95 = Static182.method3150();
		for (@Pc(97) int local97 = 0; local97 < local95.length; local97++) {
			aClass92Array1[local95[local97].anInt2893] = local95[local97];
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZILclient!vn;IILclient!qs;Lclient!ie;[Lclient!cp;Lclient!rb;Lclient!as;Lclient!r;Lclient!rf;IILclient!hq;IIILclient!as;)Lclient!da;")
	public Class57 method2378(@OriginalArg(1) int arg0, @OriginalArg(2) Class352 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface21 arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) Class52[] arg6, @OriginalArg(8) Class279 arg7, @OriginalArg(9) Class17 arg8, @OriginalArg(10) Class43 arg9, @OriginalArg(11) Class284 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class135 arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(18) Class17 arg16) {
		if (this.anInt2650 != -1) {
			return arg10.method6281(this.anInt2650).method6438(arg13, arg11, arg8, arg0, arg2, arg12, arg15, arg4, arg6, arg14, arg3, arg16, arg9, arg7);
		}
		@Pc(33) int local33 = arg11;
		@Pc(36) long local36 = this.aLong74;
		@Pc(39) int[] local39 = this.anIntArray192;
		if (arg8 != null && (arg8.anInt558 >= 0 || arg8.anInt563 >= 0)) {
			local39 = new int[12];
			for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
				local39[local58] = this.anIntArray192[local58];
			}
			if (arg8.anInt558 >= 0) {
				if (arg8.anInt558 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg8.anInt558 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg8.anInt563 >= 0) {
				if (arg8.anInt563 == 65535) {
					local36 ^= 0xFFFFFFFFL;
					local39[3] = 0;
				} else {
					local39[3] = arg8.anInt563 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(145) boolean local145 = false;
		@Pc(147) boolean local147 = false;
		@Pc(149) boolean local149 = false;
		@Pc(157) boolean local157 = arg8 != null || arg16 != null;
		@Pc(164) int local164 = arg6 == null ? 0 : arg6.length;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (@Pc(166) int local166 = 0; local166 < local164; local166++) {
			Static468.aClass3_Sub3_Sub15Array5[local166] = null;
			if (arg6[local166] != null) {
				@Pc(184) Class17 local184 = arg7.method6216(arg6[local166].anInt1940);
				if (local184.anIntArray55 != null) {
					local157 = true;
					Static534.aClass17Array5[local166] = local184;
					local198 = arg6[local166].anInt1945;
					local203 = arg6[local166].anInt1942;
					@Pc(208) int local208 = local184.anIntArray55[local198];
					Static468.aClass3_Sub3_Sub15Array5[local166] = arg7.method6220(local208 >>> 16);
					@Pc(221) int local221 = local208 & 0xFFFF;
					Static152.anIntArray263[local166] = local221;
					if (Static468.aClass3_Sub3_Sub15Array5[local166] != null) {
						local147 |= Static468.aClass3_Sub3_Sub15Array5[local166].method6248(local221);
						local145 |= Static468.aClass3_Sub3_Sub15Array5[local166].method6250(local221);
						local149 |= Static468.aClass3_Sub3_Sub15Array5[local166].method6254(local221);
					}
					if ((local184.aBoolean47 || Static233.aBoolean341) && local203 != -1 && local184.anIntArray55.length > local203) {
						Static360.anIntArray492[local166] = local184.anIntArray54[local198];
						Static536.anIntArray637[local166] = arg6[local166].anInt1944;
						@Pc(295) int local295 = local184.anIntArray55[local203];
						Static561.aClass3_Sub3_Sub15Array4[local166] = arg7.method6220(local295 >>> 16);
						@Pc(308) int local308 = local295 & 0xFFFF;
						Static328.anIntArray455[local166] = local308;
						if (Static561.aClass3_Sub3_Sub15Array4[local166] != null) {
							local147 |= Static561.aClass3_Sub3_Sub15Array4[local166].method6248(local308);
							local145 |= Static561.aClass3_Sub3_Sub15Array4[local166].method6250(local308);
							local149 |= Static561.aClass3_Sub3_Sub15Array4[local166].method6254(local308);
						}
					} else {
						Static360.anIntArray492[local166] = 0;
						Static536.anIntArray637[local166] = 0;
						Static561.aClass3_Sub3_Sub15Array4[local166] = null;
						Static328.anIntArray455[local166] = -1;
					}
				}
			}
		}
		@Pc(371) int local371 = -1;
		local198 = -1;
		local203 = 0;
		@Pc(377) Class3_Sub3_Sub15 local377 = null;
		@Pc(379) Class3_Sub3_Sub15 local379 = null;
		@Pc(381) int local381 = -1;
		@Pc(383) int local383 = -1;
		@Pc(385) int local385 = 0;
		@Pc(387) Class3_Sub3_Sub15 local387 = null;
		@Pc(389) Class3_Sub3_Sub15 local389 = null;
		if (local157) {
			@Pc(402) int local402;
			@Pc(463) int local463;
			if (arg8 != null) {
				local371 = arg8.anIntArray55[arg3];
				local402 = local371 >>> 16;
				local371 &= 0xFFFF;
				local377 = arg7.method6220(local402);
				if (local377 != null) {
					local147 |= local377.method6248(local371);
					local145 |= local377.method6250(local371);
					local149 |= local377.method6254(local371);
				}
				if ((arg8.aBoolean47 || Static233.aBoolean341) && arg15 != -1 && arg15 < arg8.anIntArray55.length) {
					local203 = arg8.anIntArray54[arg3];
					local198 = arg8.anIntArray55[arg15];
					local463 = local198 >>> 16;
					local198 &= 0xFFFF;
					local379 = local463 == local402 ? local377 : arg7.method6220(local463);
					if (local379 != null) {
						local147 |= local379.method6248(local198);
						local145 |= local379.method6250(local198);
						local149 |= local379.method6254(local198);
					}
				}
			}
			local33 = arg11 | 0x20;
			if (arg16 != null) {
				local381 = arg16.anIntArray55[arg12];
				local402 = local381 >>> 16;
				local387 = arg7.method6220(local402);
				local381 &= 0xFFFF;
				if (local387 != null) {
					local147 |= local387.method6248(local381);
					local145 |= local387.method6250(local381);
					local149 |= local387.method6254(local381);
				}
				if ((arg16.aBoolean47 || Static233.aBoolean341) && arg14 != -1 && arg14 < arg16.anIntArray55.length) {
					local385 = arg16.anIntArray54[arg12];
					local383 = arg16.anIntArray55[arg14];
					local463 = local383 >>> 16;
					local383 &= 0xFFFF;
					local389 = local402 == local463 ? local387 : arg7.method6220(local463);
					if (local389 != null) {
						local147 |= local389.method6248(local383);
						local145 |= local389.method6250(local383);
						local149 |= local389.method6254(local383);
					}
				}
			}
			if (local147) {
				local33 |= 0x80;
			}
			if (local145) {
				local33 |= 0x100;
			}
			if (local149) {
				local33 |= 0x400;
			}
		}
		@Pc(643) Class10 local643 = Static220.aClass10_20;
		@Pc(651) Class57 local651;
		synchronized (Static220.aClass10_20) {
			local651 = (Class57) Static220.aClass10_20.method250(local36);
		}
		@Pc(659) Class267 local659 = null;
		if (this.anInt2649 != -1) {
			local659 = arg13.method3664(this.anInt2649);
		}
		@Pc(703) int local703;
		@Pc(709) int local709;
		if (local651 == null || arg9.method7169(local651.PA(), local33) != 0 || local659 != null && local659.anIntArrayArray53 != null && this.anIntArrayArray13 == null) {
			if (local651 != null) {
				local33 = arg9.method7203(local33, local651.PA());
			}
			@Pc(701) boolean local701 = false;
			local703 = 0;
			while (true) {
				if (local703 >= 12) {
					if (local701) {
						if (this.aLong73 != -1L) {
							@Pc(1339) Class10 local1339 = Static220.aClass10_20;
							synchronized (Static220.aClass10_20) {
								local651 = (Class57) Static220.aClass10_20.method250(this.aLong73);
							}
						}
						if (local651 == null || arg9.method7169(local651.PA(), local33) != 0 || local659 != null && local659.anIntArrayArray53 != null && this.anIntArrayArray13 == null) {
							return null;
						}
					} else {
						@Pc(758) Class226[] local758 = new Class226[12];
						@Pc(766) int local766;
						for (@Pc(760) int local760 = 0; local760 < 12; local760++) {
							local766 = local39[local760];
							@Pc(781) Class226 local781;
							if ((local766 & 0x40000000) != 0) {
								local781 = arg5.method3798(local766 & 0x3FFFFFFF).method7320(this.aBoolean214);
								if (local781 != null) {
									local758[local760] = local781;
								}
							} else if ((Integer.MIN_VALUE & local766) != 0) {
								local781 = arg1.method7548(local766 & 0x3FFFFFFF).method7566();
								if (local781 != null) {
									local758[local760] = local781;
								}
							}
						}
						@Pc(851) int local851;
						@Pc(844) int local844;
						if (local659 != null && local659.anIntArrayArray53 != null) {
							for (local766 = 0; local766 < local659.anIntArrayArray53.length; local766++) {
								if (local659.anIntArrayArray53[local766] != null && local758[local766] != null) {
									local844 = local659.anIntArrayArray53[local766][0];
									local851 = local659.anIntArrayArray53[local766][1];
									@Pc(858) int local858 = local659.anIntArrayArray53[local766][2];
									@Pc(867) int local867 = local659.anIntArrayArray53[local766][3] << 3;
									@Pc(876) int local876 = local659.anIntArrayArray53[local766][4] << 3;
									@Pc(885) int local885 = local659.anIntArrayArray53[local766][5] << 3;
									if (this.anIntArrayArray13 == null) {
										this.anIntArrayArray13 = new int[local659.anIntArrayArray53.length][];
									}
									if (this.anIntArrayArray13[local766] == null) {
										@Pc(907) int[] local907 = this.anIntArrayArray13[local766] = new int[15];
										if (local867 == 0 && local876 == 0 && local885 == 0) {
											local907[13] = -local851;
											local907[0] = local907[4] = local907[8] = 32768;
											local907[14] = -local858;
											local907[12] = -local844;
										} else {
											@Pc(923) int local923 = Class3_Sub17.anIntArray177[local867];
											@Pc(927) int local927 = Class3_Sub17.anIntArray175[local867];
											@Pc(931) int local931 = Class3_Sub17.anIntArray177[local876];
											@Pc(935) int local935 = Class3_Sub17.anIntArray175[local876];
											@Pc(939) int local939 = Class3_Sub17.anIntArray177[local885];
											@Pc(943) int local943 = Class3_Sub17.anIntArray175[local885];
											@Pc(951) int local951 = local939 * local927 + 8192 >> 14;
											@Pc(959) int local959 = local927 * local943 + 8192 >> 14;
											local907[8] = local923 * local931 + 8192 >> 14;
											local907[4] = local923 * local939 + 8192 >> 14;
											local907[3] = local943 * local923 + 8192 >> 14;
											local907[0] = local959 * local935 + local939 * local931 + 8192 >> 14;
											local907[1] = -local943 * local931 + local951 * local935 + 8192 >> 14;
											local907[5] = -local927;
											local907[6] = local939 * -local935 + local959 * local931 + 8192 >> 14;
											local907[7] = local931 * local951 + -local935 * -local943 + 8192 >> 14;
											local907[2] = local935 * local923 + 8192 >> 14;
											local907[13] = local907[7] * -local858 + -local851 * local907[4] + local907[1] * -local844 + 8192 >> 14;
											local907[14] = -local858 * local907[8] + local907[5] * -local851 + -local844 * local907[2] + 8192 >> 14;
											local907[12] = local907[6] * -local858 + -local851 * local907[3] + -local844 * local907[0] + 8192 >> 14;
										}
										local907[9] = local844;
										local907[11] = local858;
										local907[10] = local851;
									}
									if (local867 != 0 || local876 != 0 || local885 != 0) {
										local758[local766].method5285(local885, local876, local867);
									}
									if (local844 != 0 || local851 != 0 || local858 != 0) {
										local758[local766].method5287(local851, local858, local844);
									}
								}
							}
						}
						@Pc(1246) Class226 local1246 = new Class226(local758, local758.length);
						@Pc(1250) int local1250 = local33 | 0x4000;
						local651 = arg9.method7178(local1246, local1250, Static482.anInt7798, 64, 850);
						for (local844 = 0; local844 < 5; local844++) {
							for (local851 = 0; local851 < Static429.aShortArrayArrayArray3.length; local851++) {
								if (Static429.aShortArrayArrayArray3[local851][local844].length > this.anIntArray193[local844]) {
									local651.d(Static295.aShortArrayArray50[local851][local844], Static429.aShortArrayArrayArray3[local851][local844][this.anIntArray193[local844]]);
								}
							}
						}
						local651.SA(local33);
						@Pc(1314) Class10 local1314 = Static220.aClass10_20;
						synchronized (Static220.aClass10_20) {
							Static220.aClass10_20.method254(local651, local36);
						}
						this.aLong73 = local36;
					}
					break;
				}
				local709 = local39[local703];
				if ((local709 & 0x40000000) == 0) {
					if ((local709 & Integer.MIN_VALUE) != 0 && !arg1.method7548(local709 & 0x3FFFFFFF).method7563()) {
						local701 = true;
					}
				} else if (!arg5.method3798(local709 & 0x3FFFFFFF).method7304(this.aBoolean214)) {
					local701 = true;
				}
				local703++;
			}
		}
		@Pc(1380) Class57 local1380 = local651.method7522((byte) 4, local33, true);
		if (!local157) {
			return local1380;
		}
		@Pc(1391) int local1391 = 0;
		local703 = 1;
		while (local1391 < local164) {
			if (Static468.aClass3_Sub3_Sub15Array5[local1391] != null) {
				local1380.method7520(false, this.anIntArrayArray13 == null ? null : this.anIntArrayArray13[local1391], Static536.anIntArray637[local1391] - 1, Static152.anIntArray263[local1391], local703, Static468.aClass3_Sub3_Sub15Array5[local1391], Static360.anIntArray492[local1391], Static328.anIntArray455[local1391], Static561.aClass3_Sub3_Sub15Array4[local1391]);
			}
			local1391++;
			local703 <<= 0x1;
		}
		if (local377 != null && local387 != null) {
			local1380.method7511(arg2 - 1, local385, local198, false, local383, arg8.aBooleanArray2, local387, arg0 - 1, local389, local377, local381, local379, local371, local203);
		} else if (local377 != null) {
			local1380.method7527(local379, false, local198, 0, local203, arg2 - 1, local371, local377);
		} else if (local387 != null) {
			local1380.method7527(local389, false, local383, 0, local385, arg0 - 1, local381, local387);
		}
		for (local709 = 0; local709 < local164; local709++) {
			Static468.aClass3_Sub3_Sub15Array5[local709] = null;
			Static561.aClass3_Sub3_Sub15Array4[local709] = null;
			Static534.aClass17Array5[local709] = null;
		}
		return local1380;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZZ)V")
	public void method2379(@OriginalArg(1) boolean arg0) {
		this.aBoolean214 = arg0;
		this.method2386();
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!as;ILclient!rb;IIIILclient!vn;ILclient!r;I)Lclient!da;")
	public Class57 method2381(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class279 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) Class352 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class43 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(96) int local96;
		@Pc(38) int local38;
		if (arg1 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg1.anIntArray55[arg0];
			local38 = local34 >>> 16;
			@Pc(43) Class3_Sub3_Sub15 local43 = arg3.method6220(local38);
			@Pc(47) int local47 = local34 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method6248(local47) | false;
				local11 = local43.method6250(local47) | false;
				local17 = local43.method6254(local47) | false;
				local15 = arg1.aBoolean45 | false;
			}
			if ((arg1.aBoolean47 || Static233.aBoolean341) && arg7 != -1 && arg7 < arg1.anIntArray55.length) {
				local96 = arg1.anIntArray55[arg7];
				@Pc(100) int local100 = local96 >>> 16;
				@Pc(104) int local104 = local96 & 0xFFFF;
				@Pc(118) Class3_Sub3_Sub15 local118;
				if (local100 == local38) {
					local118 = local43;
				} else {
					local118 = arg3.method6220(local104 >>> 16);
				}
				if (local118 != null) {
					local13 |= local118.method6248(local104);
					local11 |= local118.method6250(local104);
					local17 |= local118.method6254(local104);
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
		@Pc(187) long local187 = (long) arg5 << 32 | (long) (arg2 << 16) | (long) arg4;
		@Pc(189) Class10 local189 = Static391.aClass10_41;
		@Pc(197) Class57 local197;
		synchronized (Static391.aClass10_41) {
			local197 = (Class57) Static391.aClass10_41.method250(local187);
		}
		if (local197 == null || arg8.method7169(local197.PA(), local7) != 0) {
			if (local197 != null) {
				local7 = arg8.method7203(local7, local197.PA());
			}
			@Pc(224) Class226[] local224 = new Class226[3];
			local96 = 0;
			if (!arg6.method7548(arg4).method7564() || !arg6.method7548(arg2).method7564() || !arg6.method7548(arg5).method7564()) {
				return null;
			}
			@Pc(260) Class226 local260 = arg6.method7548(arg4).method7561();
			if (local260 != null) {
				local96++;
				local224[0] = local260;
			}
			local260 = arg6.method7548(arg2).method7561();
			if (local260 != null) {
				local224[local96++] = local260;
			}
			local260 = arg6.method7548(arg5).method7561();
			if (local260 != null) {
				local224[local96++] = local260;
			}
			local260 = new Class226(local224, local96);
			@Pc(305) int local305 = local7 | 0x4000;
			local197 = arg8.method7178(local260, local305, Static482.anInt7798, 64, 768);
			for (@Pc(315) int local315 = 0; local315 < 5; local315++) {
				for (local38 = 0; local38 < Static429.aShortArrayArrayArray3.length; local38++) {
					if (this.anIntArray193[local315] < Static429.aShortArrayArrayArray3[local38][local315].length) {
						local197.d(Static295.aShortArrayArray50[local38][local315], Static429.aShortArrayArrayArray3[local38][local315][this.anIntArray193[local315]]);
					}
				}
			}
			local197.SA(local7);
			@Pc(371) Class10 local371 = Static391.aClass10_41;
			synchronized (Static391.aClass10_41) {
				Static391.aClass10_41.method254(local197, local187);
			}
		}
		if (arg1 == null) {
			return local197;
		} else {
			local197 = local197.method7522((byte) 4, local7, true);
			return arg1.method455(local197, arg0, arg9, 2048, arg7);
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IILclient!vn;I)V")
	public void method2382(@OriginalArg(0) int arg0, @OriginalArg(2) Class352 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static122.anIntArray242[arg2];
		if (arg1.method7548(arg0) != null) {
			this.anIntArray192[local7] = arg0 | Integer.MIN_VALUE;
			this.method2386();
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!vn;IILclient!ie;Lclient!rf;ILclient!qs;Lclient!r;ILclient!rb;ILclient!as;)Lclient!da;")
	public Class57 method2383(@OriginalArg(0) Class352 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class145 arg2, @OriginalArg(4) Class284 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface21 arg5, @OriginalArg(7) Class43 arg6, @OriginalArg(9) Class279 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class17 arg9) {
		if (this.anInt2650 != -1) {
			return arg3.method6281(this.anInt2650).method6430(arg5, arg1, arg7, arg4, arg8, arg9, arg6);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(51) int local51;
		@Pc(120) int local120;
		@Pc(59) int local59;
		@Pc(124) int local124;
		if (arg9 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local51 = arg9.anIntArray55[arg4];
			local28 = 2080;
			local59 = local51 >>> 16;
			@Pc(64) Class3_Sub3_Sub15 local64 = arg7.method6220(local59);
			@Pc(68) int local68 = local51 & 0xFFFF;
			if (local64 != null) {
				local34 = local64.method6248(local68) | false;
				local32 = local64.method6250(local68) | false;
				local38 = local64.method6254(local68) | false;
				local36 = arg9.aBoolean45 | false;
			}
			if ((arg9.aBoolean47 || Static233.aBoolean341) && arg1 != -1 && arg9.anIntArray55.length > arg1) {
				local120 = arg9.anIntArray55[arg1];
				local124 = local120 >>> 16;
				@Pc(138) Class3_Sub3_Sub15 local138 = local59 == local124 ? local64 : arg7.method6220(local124);
				@Pc(142) int local142 = local120 & 0xFFFF;
				if (local138 != null) {
					local34 |= local138.method6248(local142);
					local32 |= local138.method6250(local142);
					local38 |= local138.method6254(local142);
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
		@Pc(193) Class10 local193 = Static391.aClass10_41;
		@Pc(202) Class57 local202;
		synchronized (Static391.aClass10_41) {
			local202 = (Class57) Static391.aClass10_41.method250(this.aLong74);
		}
		if (local202 == null || arg6.method7169(local202.PA(), local28) != 0) {
			if (local202 != null) {
				local28 = arg6.method7203(local28, local202.PA());
			}
			local36 = false;
			for (@Pc(230) int local230 = 0; local230 < 12; local230++) {
				local51 = this.anIntArray192[local230];
				if ((local51 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local51) != 0 && !arg0.method7548(local51 & 0x3FFFFFFF).method7564()) {
						local36 = true;
					}
				} else if (!arg2.method3798(local51 & 0x3FFFFFFF).method7308(this.aBoolean214)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(288) Class226[] local288 = new Class226[12];
			local120 = 0;
			for (@Pc(292) int local292 = 0; local292 < 12; local292++) {
				@Pc(299) int local299 = this.anIntArray192[local292];
				@Pc(314) Class226 local314;
				if ((local299 & 0x40000000) != 0) {
					local314 = arg2.method3798(local299 & 0x3FFFFFFF).method7313(this.aBoolean214);
					if (local314 != null) {
						local288[local120++] = local314;
					}
				} else if ((local299 & Integer.MIN_VALUE) != 0) {
					local314 = arg0.method7548(local299 & 0x3FFFFFFF).method7561();
					if (local314 != null) {
						local288[local120++] = local314;
					}
				}
			}
			@Pc(356) Class226 local356 = new Class226(local288, local120);
			@Pc(360) int local360 = local28 | 0x4000;
			local202 = arg6.method7178(local356, local360, Static482.anInt7798, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local124 = 0; local124 < Static429.aShortArrayArrayArray3.length; local124++) {
					if (Static429.aShortArrayArrayArray3[local124][local59].length > this.anIntArray193[local59]) {
						local202.d(Static295.aShortArrayArray50[local124][local59], Static429.aShortArrayArrayArray3[local124][local59][this.anIntArray193[local59]]);
					}
				}
			}
			local202.SA(local28);
			@Pc(424) Class10 local424 = Static391.aClass10_41;
			synchronized (Static391.aClass10_41) {
				Static391.aClass10_41.method254(local202, this.aLong74);
			}
		}
		if (arg9 == null) {
			return local202;
		} else {
			local202.method7522((byte) 4, local28, true);
			return arg9.method455(local202, arg4, arg8, 2048, arg1);
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!ie;II)V")
	public void method2384(@OriginalArg(1) Class145 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			this.anIntArray192[arg1] = 0;
		} else if (arg0.method3798(arg2) == null) {
			return;
		} else {
			this.anIntArray192[arg1] = arg2 | 0x40000000;
			this.method2386();
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "([IIZII[I)V")
	public void method2385(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		this.aBoolean214 = arg2;
		if (this.anInt2649 != arg3) {
			this.anIntArrayArray13 = null;
			this.anInt2649 = arg3;
		}
		this.anInt2650 = arg1;
		this.anIntArray193 = arg4;
		this.anIntArray192 = arg0;
		this.method2386();
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
	private void method2386() {
		@Pc(7) long[] local7 = Class3_Sub49.aLongArray17;
		this.aLong74 = -1L;
		this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) (((long) (this.anInt2649 >> 8) ^ this.aLong74) & 0xFFL)];
		this.aLong74 = local7[(int) ((this.aLong74 ^ (long) this.anInt2649) & 0xFFL)] ^ this.aLong74 >>> 8;
		for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
			this.aLong74 = local7[(int) ((this.aLong74 ^ (long) (this.anIntArray192[local56] >> 24)) & 0xFFL)] ^ this.aLong74 >>> 8;
			this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) ((this.aLong74 ^ (long) (this.anIntArray192[local56] >> 16)) & 0xFFL)];
			this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) ((this.aLong74 ^ (long) (this.anIntArray192[local56] >> 8)) & 0xFFL)];
			this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) ((this.aLong74 ^ (long) this.anIntArray192[local56]) & 0xFFL)];
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) (((long) this.anIntArray193[local152] ^ this.aLong74) & 0xFFL)];
		}
		this.aLong74 = this.aLong74 >>> 8 ^ local7[(int) (((long) (this.aBoolean214 ? 1 : 0) ^ this.aLong74) & 0xFFL)];
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BII)V")
	public void method2387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray193[arg1] = arg0;
		this.method2386();
	}
}
