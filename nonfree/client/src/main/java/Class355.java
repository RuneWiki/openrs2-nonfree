import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class355 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	private int anInt9665;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "J")
	private long aLong298;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "[I")
	private int[] anIntArray713;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray79;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "Z")
	public boolean aBoolean680;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "J")
	private long aLong299;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "[I")
	public int[] anIntArray714;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
	public int anInt9676 = -1;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZILclient!aba;II[Lclient!pba;Lclient!oa;Lclient!naa;ILclient!dv;Lclient!dv;Lclient!uc;Lclient!vd;IILclient!faa;ILclient!gr;I)Lclient!ba;")
	public Class9 method7924(@OriginalArg(1) int arg0, @OriginalArg(2) Interface1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class261[] arg4, @OriginalArg(6) Class66 arg5, @OriginalArg(7) Class237 arg6, @OriginalArg(9) Class77 arg7, @OriginalArg(10) Class77 arg8, @OriginalArg(11) Class327 arg9, @OriginalArg(12) Class345 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12, @OriginalArg(15) Class99 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class127 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt9676 != -1) {
			return arg10.method7602(this.anInt9676).method1119(arg12, arg15, arg3, arg1, arg2, arg14, arg8, arg0, arg16, arg9, arg5, arg4, arg7, arg11);
		}
		@Pc(34) int local34 = arg3;
		@Pc(37) long local37 = this.aLong298;
		@Pc(40) int[] local40 = this.anIntArray713;
		if (arg7 != null && (arg7.anInt2576 >= 0 || arg7.anInt2572 >= 0)) {
			local40 = new int[12];
			for (@Pc(59) int local59 = 0; local59 < 12; local59++) {
				local40[local59] = this.anIntArray713[local59];
			}
			if (arg7.anInt2576 >= 0) {
				if (arg7.anInt2576 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
				} else {
					local40[5] = arg7.anInt2576 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg7.anInt2572 >= 0) {
				if (arg7.anInt2572 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg7.anInt2572 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(143) boolean local143 = false;
		@Pc(145) boolean local145 = false;
		@Pc(147) boolean local147 = false;
		@Pc(155) boolean local155 = arg7 != null || arg8 != null;
		@Pc(162) int local162 = arg4 == null ? 0 : arg4.length;
		@Pc(196) int local196;
		@Pc(201) int local201;
		for (@Pc(164) int local164 = 0; local164 < local162; local164++) {
			Static40.aClass4_Sub7_Sub19Array1[local164] = null;
			if (arg4[local164] != null) {
				@Pc(182) Class77 local182 = arg9.method7326(arg4[local164].anInt6949);
				if (local182.anIntArray238 != null) {
					Static276.aClass77Array1[local164] = local182;
					local155 = true;
					local196 = arg4[local164].anInt6950;
					local201 = arg4[local164].anInt6948;
					@Pc(206) int local206 = local182.anIntArray238[local196];
					Static40.aClass4_Sub7_Sub19Array1[local164] = arg9.method7324(local206 >>> 16);
					@Pc(219) int local219 = local206 & 0xFFFF;
					Static62.anIntArray458[local164] = local219;
					if (Static40.aClass4_Sub7_Sub19Array1[local164] != null) {
						local145 |= Static40.aClass4_Sub7_Sub19Array1[local164].method7969(local219);
						local143 |= Static40.aClass4_Sub7_Sub19Array1[local164].method7967(local219);
						local147 |= Static40.aClass4_Sub7_Sub19Array1[local164].method7970(local219);
					}
					if ((local182.aBoolean206 || Static244.aBoolean365) && local201 != -1 && local182.anIntArray238.length > local201) {
						Static76.anIntArray205[local164] = local182.anIntArray240[local196];
						Static340.anIntArray488[local164] = arg4[local164].anInt6947;
						@Pc(286) int local286 = local182.anIntArray238[local201];
						Static71.aClass4_Sub7_Sub19Array2[local164] = arg9.method7324(local286 >>> 16);
						@Pc(299) int local299 = local286 & 0xFFFF;
						Static264.anIntArray441[local164] = local299;
						if (Static71.aClass4_Sub7_Sub19Array2[local164] != null) {
							local145 |= Static71.aClass4_Sub7_Sub19Array2[local164].method7969(local299);
							local143 |= Static71.aClass4_Sub7_Sub19Array2[local164].method7967(local299);
							local147 |= Static71.aClass4_Sub7_Sub19Array2[local164].method7970(local299);
						}
					} else {
						Static76.anIntArray205[local164] = 0;
						Static340.anIntArray488[local164] = 0;
						Static71.aClass4_Sub7_Sub19Array2[local164] = null;
						Static264.anIntArray441[local164] = -1;
					}
				}
			}
		}
		@Pc(362) int local362 = -1;
		local196 = -1;
		local201 = 0;
		@Pc(373) Class4_Sub7_Sub19 local373 = null;
		@Pc(375) Class4_Sub7_Sub19 local375 = null;
		@Pc(377) int local377 = -1;
		@Pc(379) int local379 = -1;
		@Pc(381) int local381 = 0;
		@Pc(383) Class4_Sub7_Sub19 local383 = null;
		@Pc(385) Class4_Sub7_Sub19 local385 = null;
		if (local155) {
			@Pc(398) int local398;
			@Pc(457) int local457;
			if (arg7 != null) {
				local362 = arg7.anIntArray238[arg16];
				local398 = local362 >>> 16;
				local373 = arg9.method7324(local398);
				local362 &= 0xFFFF;
				if (local373 != null) {
					local145 |= local373.method7969(local362);
					local143 |= local373.method7967(local362);
					local147 |= local373.method7970(local362);
				}
				if ((arg7.aBoolean206 || Static244.aBoolean365) && arg14 != -1 && arg14 < arg7.anIntArray238.length) {
					local196 = arg7.anIntArray238[arg14];
					local201 = arg7.anIntArray240[arg16];
					local457 = local196 >>> 16;
					local375 = local398 == local457 ? local373 : arg9.method7324(local457);
					local196 &= 0xFFFF;
					if (local375 != null) {
						local145 |= local375.method7969(local196);
						local143 |= local375.method7967(local196);
						local147 |= local375.method7970(local196);
					}
				}
			}
			local34 = arg3 | 0x20;
			if (arg8 != null) {
				local377 = arg8.anIntArray238[arg12];
				local398 = local377 >>> 16;
				local377 &= 0xFFFF;
				local383 = arg9.method7324(local398);
				if (local383 != null) {
					local145 |= local383.method7969(local377);
					local143 |= local383.method7967(local377);
					local147 |= local383.method7970(local377);
				}
				if ((arg8.aBoolean206 || Static244.aBoolean365) && arg2 != -1 && arg8.anIntArray238.length > arg2) {
					local381 = arg8.anIntArray240[arg12];
					local379 = arg8.anIntArray238[arg2];
					local457 = local379 >>> 16;
					local385 = local457 == local398 ? local383 : arg9.method7324(local457);
					local379 &= 0xFFFF;
					if (local385 != null) {
						local145 |= local385.method7969(local379);
						local143 |= local385.method7967(local379);
						local147 |= local385.method7970(local379);
					}
				}
			}
			if (local145) {
				local34 |= 0x80;
			}
			if (local143) {
				local34 |= 0x100;
			}
			if (local147) {
				local34 |= 0x400;
			}
		}
		@Pc(629) Class223 local629 = Static291.aClass223_42;
		@Pc(637) Class9 local637;
		synchronized (Static291.aClass223_42) {
			local637 = (Class9) Static291.aClass223_42.method4943(local37);
		}
		@Pc(645) Class130 local645 = null;
		if (this.anInt9665 != -1) {
			local645 = arg15.method3342(this.anInt9665);
		}
		@Pc(688) int local688;
		@Pc(694) int local694;
		if (local637 == null || arg5.method6831(local637.h(), local34) != 0 || local645 != null && local645.anIntArrayArray47 != null && this.anIntArrayArray79 == null) {
			if (local637 != null) {
				local34 = arg5.method6818(local34, local637.h());
			}
			@Pc(686) boolean local686 = false;
			local688 = 0;
			while (true) {
				if (local688 >= 12) {
					if (local686) {
						if (this.aLong299 != -1L) {
							@Pc(741) Class223 local741 = Static291.aClass223_42;
							synchronized (Static291.aClass223_42) {
								local637 = (Class9) Static291.aClass223_42.method4943(this.aLong299);
							}
						}
						if (local637 == null || arg5.method6831(local637.h(), local34) != 0 || local645 != null && local645.anIntArrayArray47 != null && this.anIntArrayArray79 == null) {
							return null;
						}
					} else {
						@Pc(780) Class266[] local780 = new Class266[12];
						@Pc(788) int local788;
						for (@Pc(782) int local782 = 0; local782 < 12; local782++) {
							local788 = local40[local782];
							@Pc(803) Class266 local803;
							if ((local788 & 0x40000000) != 0) {
								local803 = arg13.method2798(local788 & 0x3FFFFFFF).method4912(this.aBoolean680);
								if (local803 != null) {
									local780[local782] = local803;
								}
							} else if ((Integer.MIN_VALUE & local788) != 0) {
								local803 = arg6.method5101(local788 & 0x3FFFFFFF).method4888();
								if (local803 != null) {
									local780[local782] = local803;
								}
							}
						}
						@Pc(870) int local870;
						@Pc(863) int local863;
						if (local645 != null && local645.anIntArrayArray47 != null) {
							for (local788 = 0; local788 < local645.anIntArrayArray47.length; local788++) {
								if (local645.anIntArrayArray47[local788] != null && local780[local788] != null) {
									local863 = local645.anIntArrayArray47[local788][0];
									local870 = local645.anIntArrayArray47[local788][1];
									@Pc(877) int local877 = local645.anIntArrayArray47[local788][2];
									@Pc(886) int local886 = local645.anIntArrayArray47[local788][3] << 3;
									@Pc(895) int local895 = local645.anIntArrayArray47[local788][4] << 3;
									@Pc(904) int local904 = local645.anIntArrayArray47[local788][5] << 3;
									if (this.anIntArrayArray79 == null) {
										this.anIntArrayArray79 = new int[local645.anIntArrayArray47.length][];
									}
									if (this.anIntArrayArray79[local788] == null) {
										@Pc(926) int[] local926 = this.anIntArrayArray79[local788] = new int[15];
										if (local886 == 0 && local895 == 0 && local904 == 0) {
											local926[0] = local926[4] = local926[8] = 32768;
											local926[12] = -local863;
											local926[13] = -local870;
											local926[14] = -local877;
										} else {
											@Pc(971) int local971 = Class4_Sub11.anIntArray147[local886];
											@Pc(975) int local975 = Class4_Sub11.anIntArray148[local886];
											@Pc(979) int local979 = Class4_Sub11.anIntArray147[local895];
											@Pc(983) int local983 = Class4_Sub11.anIntArray148[local895];
											@Pc(987) int local987 = Class4_Sub11.anIntArray147[local904];
											@Pc(991) int local991 = Class4_Sub11.anIntArray148[local904];
											@Pc(999) int local999 = local975 * local987 + 8192 >> 14;
											@Pc(1007) int local1007 = local975 * local991 + 8192 >> 14;
											local926[4] = local987 * local971 + 8192 >> 14;
											local926[5] = -local975;
											local926[1] = local999 * local983 + -local991 * local979 + 8192 >> 14;
											local926[8] = local971 * local979 + 8192 >> 14;
											local926[6] = -local983 * local987 + local979 * local1007 + 8192 >> 14;
											local926[3] = local971 * local991 + 8192 >> 14;
											local926[2] = local971 * local983 + 8192 >> 14;
											local926[0] = local1007 * local983 + local979 * local987 + 8192 >> 14;
											local926[7] = -local991 * -local983 + local979 * local999 + 8192 >> 14;
											local926[12] = local926[6] * -local877 + -local863 * local926[0] + local926[3] * -local870 + 8192 >> 14;
											local926[14] = local926[2] * -local863 + -local870 * local926[5] + local926[8] * -local877 + 8192 >> 14;
											local926[13] = local926[7] * -local877 + -local870 * local926[4] + local926[1] * -local863 + 8192 >> 14;
										}
										local926[10] = local870;
										local926[9] = local863;
										local926[11] = local877;
									}
									if (local886 != 0 || local895 != 0 || local904 != 0) {
										local780[local788].method5850(local904, local895, local886);
									}
									if (local863 != 0 || local870 != 0 || local877 != 0) {
										local780[local788].method5851(local877, local863, local870);
									}
								}
							}
						}
						@Pc(1265) Class266 local1265 = new Class266(local780, local780.length);
						@Pc(1269) int local1269 = local34 | 0x4000;
						local637 = arg5.method6779(local1265, local1269, Static403.anInt6989, 64, 850);
						for (local863 = 0; local863 < 5; local863++) {
							for (local870 = 0; local870 < Static296.aShortArrayArrayArray2.length; local870++) {
								if (Static296.aShortArrayArrayArray2[local870][local863].length > this.anIntArray714[local863]) {
									local637.UA(Static356.aShortArrayArray36[local870][local863], Static296.aShortArrayArrayArray2[local870][local863][this.anIntArray714[local863]]);
								}
							}
						}
						local637.ia(local34);
						@Pc(1339) Class223 local1339 = Static291.aClass223_42;
						synchronized (Static291.aClass223_42) {
							Static291.aClass223_42.method4938(local37, local637);
						}
						this.aLong299 = local37;
					}
					break;
				}
				local694 = local40[local688];
				if ((local694 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local694) != 0 && !arg6.method5101(local694 & 0x3FFFFFFF).method4885()) {
						local686 = true;
					}
				} else if (!arg13.method2798(local694 & 0x3FFFFFFF).method4915(this.aBoolean680)) {
					local686 = true;
				}
				local688++;
			}
		}
		@Pc(1361) Class9 local1361 = local637.method4006((byte) 4, local34, true);
		if (!local155) {
			return local1361;
		}
		@Pc(1367) int local1367 = 0;
		local688 = 1;
		while (local162 > local1367) {
			if (Static40.aClass4_Sub7_Sub19Array1[local1367] != null) {
				local1361.method4021(local688, false, Static40.aClass4_Sub7_Sub19Array1[local1367], Static62.anIntArray458[local1367], Static71.aClass4_Sub7_Sub19Array2[local1367], Static340.anIntArray488[local1367] - 1, Static264.anIntArray441[local1367], this.anIntArrayArray79 == null ? null : this.anIntArrayArray79[local1367], Static76.anIntArray205[local1367]);
			}
			local688 <<= 0x1;
			local1367++;
		}
		if (local373 != null && local383 != null) {
			local1361.method4012(local196, false, local379, local381, local383, local201, arg0 - 1, arg11 - 1, local375, arg7.aBooleanArray10, local362, local373, local377, local385);
		} else if (local373 != null) {
			local1361.method4005(false, 0, local201, local196, local375, local362, local373, arg11 - 1);
		} else if (local383 != null) {
			local1361.method4005(false, 0, local381, local379, local385, local377, local383, arg0 - 1);
		}
		for (local694 = 0; local694 < local162; local694++) {
			Static40.aClass4_Sub7_Sub19Array1[local694] = null;
			Static71.aClass4_Sub7_Sub19Array2[local694] = null;
			Static276.aClass77Array1[local694] = null;
		}
		return local1361;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([IIZBI[I)V")
	public void method7925(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		this.anInt9676 = arg1;
		this.aBoolean680 = arg2;
		this.anIntArray714 = arg0;
		this.anIntArray713 = arg4;
		if (this.anInt9665 != arg3) {
			this.anInt9665 = arg3;
			this.anIntArrayArray79 = null;
		}
		this.method7927();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!uc;IIILclient!oa;IIILclient!dv;Lclient!naa;I)Lclient!ba;")
	public Class9 method7926(@OriginalArg(1) Class327 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class66 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class77 arg7, @OriginalArg(10) Class237 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(99) int local99;
		@Pc(44) int local44;
		if (arg7 != null) {
			@Pc(17) boolean local17 = false;
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			local7 = 2080;
			@Pc(40) int local40 = arg7.anIntArray238[arg1];
			local44 = local40 >>> 16;
			@Pc(49) Class4_Sub7_Sub19 local49 = arg0.method7324(local44);
			@Pc(53) int local53 = local40 & 0xFFFF;
			if (local49 != null) {
				local19 = local49.method7969(local53) | false;
				local17 = local49.method7967(local53) | false;
				local23 = local49.method7970(local53) | false;
				local21 = arg7.aBoolean207 | false;
			}
			if ((arg7.aBoolean206 || Static244.aBoolean365) && arg9 != -1 && arg7.anIntArray238.length > arg9) {
				local99 = arg7.anIntArray238[arg9];
				@Pc(103) int local103 = local99 >>> 16;
				@Pc(107) int local107 = local99 & 0xFFFF;
				@Pc(121) Class4_Sub7_Sub19 local121;
				if (local44 == local103) {
					local121 = local49;
				} else {
					local121 = arg0.method7324(local107 >>> 16);
				}
				if (local121 != null) {
					local19 |= local121.method7969(local107);
					local17 |= local121.method7967(local107);
					local23 |= local121.method7970(local107);
				}
			}
			if (local19) {
				local7 = 2208;
			}
			if (local17) {
				local7 |= 0x100;
			}
			if (local21) {
				local7 |= 0x200;
			}
			if (local23) {
				local7 |= 0x400;
			}
		}
		@Pc(184) long local184 = (long) arg6 << 32 | (long) (arg5 << 16) | (long) arg3;
		@Pc(186) Class223 local186 = Static52.aClass223_7;
		@Pc(194) Class9 local194;
		synchronized (Static52.aClass223_7) {
			local194 = (Class9) Static52.aClass223_7.method4943(local184);
		}
		if (local194 == null || arg4.method6831(local194.h(), local7) != 0) {
			if (local194 != null) {
				local7 = arg4.method6818(local7, local194.h());
			}
			@Pc(224) Class266[] local224 = new Class266[3];
			local99 = 0;
			if (!arg8.method5101(arg3).method4887() || !arg8.method5101(arg5).method4887() || !arg8.method5101(arg6).method4887()) {
				return null;
			}
			@Pc(254) Class266 local254 = arg8.method5101(arg3).method4886();
			if (local254 != null) {
				local99++;
				local224[0] = local254;
			}
			local254 = arg8.method5101(arg5).method4886();
			if (local254 != null) {
				local224[local99++] = local254;
			}
			local254 = arg8.method5101(arg6).method4886();
			if (local254 != null) {
				local224[local99++] = local254;
			}
			@Pc(293) int local293 = local7 | 0x4000;
			local254 = new Class266(local224, local99);
			local194 = arg4.method6779(local254, local293, Static403.anInt6989, 64, 768);
			for (@Pc(309) int local309 = 0; local309 < 5; local309++) {
				for (local44 = 0; local44 < Static296.aShortArrayArrayArray2.length; local44++) {
					if (Static296.aShortArrayArrayArray2[local44][local309].length > this.anIntArray714[local309]) {
						local194.UA(Static356.aShortArrayArray36[local44][local309], Static296.aShortArrayArrayArray2[local44][local309][this.anIntArray714[local309]]);
					}
				}
			}
			local194.ia(local7);
			@Pc(357) Class223 local357 = Static52.aClass223_7;
			synchronized (Static52.aClass223_7) {
				Static52.aClass223_7.method4938(local184, local194);
			}
		}
		if (arg7 == null) {
			return local194;
		} else {
			local194 = local194.method4006((byte) 4, local7, true);
			return arg7.method2294(arg1, 2048, arg2, arg9, local194);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	private void method7927() {
		this.aLong298 = -1L;
		@Pc(10) long[] local10 = Class219.aLongArray4;
		this.aLong298 = local10[(int) (((long) (this.anInt9665 >> 8) ^ this.aLong298) & 0xFFL)] ^ this.aLong298 >>> 8;
		this.aLong298 = local10[(int) ((this.aLong298 ^ (long) this.anInt9665) & 0xFFL)] ^ this.aLong298 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong298 = this.aLong298 >>> 8 ^ local10[(int) ((this.aLong298 ^ (long) (this.anIntArray713[local50] >> 24)) & 0xFFL)];
			this.aLong298 = local10[(int) ((this.aLong298 ^ (long) (this.anIntArray713[local50] >> 16)) & 0xFFL)] ^ this.aLong298 >>> 8;
			this.aLong298 = this.aLong298 >>> 8 ^ local10[(int) ((this.aLong298 ^ (long) (this.anIntArray713[local50] >> 8)) & 0xFFL)];
			this.aLong298 = this.aLong298 >>> 8 ^ local10[(int) ((this.aLong298 ^ (long) this.anIntArray713[local50]) & 0xFFL)];
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong298 = this.aLong298 >>> 8 ^ local10[(int) (((long) this.anIntArray714[local150] ^ this.aLong298) & 0xFFL)];
		}
		this.aLong298 = local10[(int) ((this.aLong298 ^ (long) (this.aBoolean680 ? 1 : 0)) & 0xFFL)] ^ this.aLong298 >>> 8;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!faa;I)V")
	public void method7929(@OriginalArg(1) int arg0, @OriginalArg(2) Class99 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			this.anIntArray713[arg0] = 0;
		} else if (arg1.method2798(arg2) == null) {
			return;
		} else {
			this.anIntArray713[arg0] = arg2 | 0x40000000;
			this.method7927();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V")
	public void method7930(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray714[arg0] = arg1;
		this.method7927();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V")
	public void method7931(@OriginalArg(0) boolean arg0) {
		this.aBoolean680 = arg0;
		this.method7927();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!oa;ILclient!aba;ILclient!uc;Lclient!vd;ILclient!dv;Lclient!naa;Lclient!faa;I)Lclient!ba;")
	public Class9 method7932(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) Interface1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class327 arg4, @OriginalArg(6) Class345 arg5, @OriginalArg(8) Class77 arg6, @OriginalArg(9) Class237 arg7, @OriginalArg(10) Class99 arg8, @OriginalArg(11) int arg9) {
		if (this.anInt9676 != -1) {
			return arg5.method7602(this.anInt9676).method1108(arg3, arg4, arg6, arg1, arg2, arg9, arg0);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(121) int local121;
		@Pc(59) int local59;
		@Pc(125) int local125;
		if (arg6 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg6.anIntArray238[arg3];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(63) int local63 = local49 & 0xFFFF;
			@Pc(68) Class4_Sub7_Sub19 local68 = arg4.method7324(local59);
			if (local68 != null) {
				local34 = local68.method7969(local63) | false;
				local32 = local68.method7967(local63) | false;
				local38 = local68.method7970(local63) | false;
				local36 = arg6.aBoolean207 | false;
			}
			if ((arg6.aBoolean206 || Static244.aBoolean365) && arg9 != -1 && arg9 < arg6.anIntArray238.length) {
				local121 = arg6.anIntArray238[arg9];
				local125 = local121 >>> 16;
				@Pc(135) Class4_Sub7_Sub19 local135 = local125 == local59 ? local68 : arg4.method7324(local125);
				@Pc(139) int local139 = local121 & 0xFFFF;
				if (local135 != null) {
					local34 |= local135.method7969(local139);
					local32 |= local135.method7967(local139);
					local38 |= local135.method7970(local139);
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
		@Pc(188) Class223 local188 = Static52.aClass223_7;
		@Pc(197) Class9 local197;
		synchronized (Static52.aClass223_7) {
			local197 = (Class9) Static52.aClass223_7.method4943(this.aLong298);
		}
		if (local197 == null || arg1.method6831(local197.h(), local28) != 0) {
			if (local197 != null) {
				local28 = arg1.method6818(local28, local197.h());
			}
			local36 = false;
			for (@Pc(228) int local228 = 0; local228 < 12; local228++) {
				local49 = this.anIntArray713[local228];
				if ((local49 & 0x40000000) == 0) {
					if ((local49 & Integer.MIN_VALUE) != 0 && !arg7.method5101(local49 & 0x3FFFFFFF).method4887()) {
						local36 = true;
					}
				} else if (!arg8.method2798(local49 & 0x3FFFFFFF).method4913(this.aBoolean680)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(290) Class266[] local290 = new Class266[12];
			local121 = 0;
			for (@Pc(294) int local294 = 0; local294 < 12; local294++) {
				@Pc(301) int local301 = this.anIntArray713[local294];
				@Pc(321) Class266 local321;
				if ((local301 & 0x40000000) != 0) {
					local321 = arg8.method2798(local301 & 0x3FFFFFFF).method4918(this.aBoolean680);
					if (local321 != null) {
						local290[local121++] = local321;
					}
				} else if ((Integer.MIN_VALUE & local301) != 0) {
					local321 = arg7.method5101(local301 & 0x3FFFFFFF).method4886();
					if (local321 != null) {
						local290[local121++] = local321;
					}
				}
			}
			@Pc(362) int local362 = local28 | 0x4000;
			@Pc(368) Class266 local368 = new Class266(local290, local121);
			local197 = arg1.method6779(local368, local362, Static403.anInt6989, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local125 = 0; local125 < Static296.aShortArrayArrayArray2.length; local125++) {
					if (Static296.aShortArrayArrayArray2[local125][local59].length > this.anIntArray714[local59]) {
						local197.UA(Static356.aShortArrayArray36[local125][local59], Static296.aShortArrayArrayArray2[local125][local59][this.anIntArray714[local59]]);
					}
				}
			}
			local197.ia(local28);
			@Pc(432) Class223 local432 = Static52.aClass223_7;
			synchronized (Static52.aClass223_7) {
				Static52.aClass223_7.method4938(this.aLong298, local197);
			}
		}
		if (arg6 == null) {
			return local197;
		} else {
			local197.method4006((byte) 4, local28, true);
			return arg6.method2294(arg3, 2048, arg0, arg9, local197);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!naa;II)V")
	public void method7933(@OriginalArg(1) Class237 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static518.anIntArray676[arg1];
		if (arg0.method5101(arg2) != null) {
			this.anIntArray713[local13] = arg2 | Integer.MIN_VALUE;
			this.method7927();
		}
	}
}
