import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class248 {

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "[I")
	public int[] anIntArray563;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Z")
	public boolean aBoolean511;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "J")
	private long aLong198;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "[I")
	private int[] anIntArray564;

	@OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
	private int anInt7242;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "J")
	private long aLong199;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
	public int anInt7240 = -1;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!qa;IIILclient!bj;ILclient!nk;BILclient!eca;II)Lclient!r;")
	public Class36 method5868(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class31 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class211 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class76 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(100) int local100;
		if (arg4 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(30) int local30 = arg4.anIntArray69[arg3];
			local7 = 2080;
			@Pc(38) int local38 = local30 >>> 16;
			@Pc(43) Class5_Sub2_Sub16 local43 = arg8.method2153(local38);
			@Pc(47) int local47 = local30 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method4953(local47) | false;
				local11 = local43.method4957(local47) | false;
				local17 = local43.method4954(local47) | false;
				local15 = arg4.aBoolean39 | false;
			}
			if ((arg4.aBoolean37 || Static457.aBoolean567) && arg9 != -1 && arg9 < arg4.anIntArray69.length) {
				local100 = arg4.anIntArray69[arg9];
				@Pc(104) int local104 = local100 >>> 16;
				@Pc(108) int local108 = local100 & 0xFFFF;
				@Pc(117) Class5_Sub2_Sub16 local117;
				if (local104 == local38) {
					local117 = local43;
				} else {
					local117 = arg8.method2153(local108 >>> 16);
				}
				if (local117 != null) {
					local13 |= local117.method4953(local108);
					local11 |= local117.method4957(local108);
					local17 |= local117.method4954(local108);
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
		@Pc(185) long local185 = (long) (arg1 << 16) | (long) arg2 << 32 | (long) arg7;
		@Pc(192) Class288 local192 = Static229.aClass288_33;
		@Pc(200) Class36 local200;
		synchronized (Static229.aClass288_33) {
			local200 = (Class36) Static229.aClass288_33.method6745(local185);
		}
		if (local200 == null || arg0.method7017(local200.ba(), local7) != 0) {
			if (local200 != null) {
				local7 = arg0.method7024(local7, local200.ba());
			}
			@Pc(230) Class184[] local230 = new Class184[3];
			local100 = 0;
			if (!arg6.method5220(arg7).method3775() || !arg6.method5220(arg1).method3775() || !arg6.method5220(arg2).method3775()) {
				return null;
			}
			@Pc(262) Class184 local262 = arg6.method5220(arg7).method3774();
			if (local262 != null) {
				local100++;
				local230[0] = local262;
			}
			local262 = arg6.method5220(arg1).method3774();
			if (local262 != null) {
				local230[local100++] = local262;
			}
			local262 = arg6.method5220(arg2).method3774();
			if (local262 != null) {
				local230[local100++] = local262;
			}
			local262 = new Class184(local230, local100);
			@Pc(307) int local307 = local7 | 0x4000;
			local200 = arg0.method7012(local262, local307, Static84.anInt1589, 64, 768);
			for (@Pc(317) int local317 = 0; local317 < 5; local317++) {
				if (Static130.aShortArrayArray2[local317].length > this.anIntArray563[local317]) {
					local200.pa(Static247.aShortArray50[local317], Static130.aShortArrayArray2[local317][this.anIntArray563[local317]]);
				}
				if (this.anIntArray563[local317] < Static141.aShortArrayArray4[local317].length) {
					local200.pa(Static399.aShortArray112[local317], Static141.aShortArrayArray4[local317][this.anIntArray563[local317]]);
				}
			}
			local200.m(local7);
			@Pc(372) Class288 local372 = Static229.aClass288_33;
			synchronized (Static229.aClass288_33) {
				Static229.aClass288_33.method6746(local200, local185);
			}
		}
		if (arg4 == null) {
			return local200;
		} else {
			local200 = local200.method7356((byte) 4, local7, true);
			return arg4.method852(local200, arg5, arg3, arg9, 2048);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILclient!nk;B)V")
	public void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class211 arg2) {
		@Pc(7) int local7 = Static106.anIntArray207[arg1];
		if (this.anIntArray564[local7] != 0 && arg2.method5220(arg0) != null) {
			this.anIntArray564[local7] = Integer.MIN_VALUE | arg0;
			this.method5875();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZZ)V")
	public void method5871(@OriginalArg(0) boolean arg0) {
		this.aBoolean511 = arg0;
		this.method5875();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ms;IBLclient!nk;ZLclient!dn;ILclient!eca;[Lclient!kba;Lclient!el;Lclient!tj;Lclient!bj;ILclient!bj;ILclient!qa;III)Lclient!r;")
	public Class36 method5872(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class211 arg2, @OriginalArg(5) Class67 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class76 arg5, @OriginalArg(8) Class170[] arg6, @OriginalArg(9) Class85 arg7, @OriginalArg(10) Class282 arg8, @OriginalArg(11) Class31 arg9, @OriginalArg(12) int arg10, @OriginalArg(13) Class31 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) Class62 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15, @OriginalArg(18) int arg16) {
		if (this.anInt7240 != -1) {
			return arg8.method6596(this.anInt7240).method7142(arg7, arg6, arg12, arg10, arg16, arg9, arg5, arg11, arg0, arg15, arg13, arg4, arg1, arg14);
		}
		@Pc(34) int local34 = arg16;
		@Pc(37) long local37 = this.aLong198;
		@Pc(40) int[] local40 = this.anIntArray564;
		if (arg9 != null && (arg9.anInt930 >= 0 || arg9.anInt917 >= 0)) {
			local40 = new int[12];
			for (@Pc(53) int local53 = 0; local53 < 12; local53++) {
				local40[local53] = this.anIntArray564[local53];
			}
			if (arg9.anInt930 >= 0) {
				if (arg9.anInt930 == 65535) {
					local40[5] = 0;
					local37 ^= 0xFFFFFFFF00000000L;
				} else {
					local40[5] = arg9.anInt930 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg9.anInt917 >= 0) {
				if (arg9.anInt917 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg9.anInt917 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(136) boolean local136 = false;
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg9 != null || arg11 != null;
		@Pc(155) int local155 = arg6 == null ? 0 : arg6.length;
		@Pc(194) int local194;
		@Pc(199) int local199;
		for (@Pc(162) int local162 = 0; local162 < local155; local162++) {
			Static332.aClass5_Sub2_Sub16Array2[local162] = null;
			if (arg6[local162] != null) {
				@Pc(180) Class31 local180 = arg5.method2152(arg6[local162].anInt5058);
				if (local180.anIntArray69 != null) {
					Static293.aClass31Array2[local162] = local180;
					local148 = true;
					local194 = arg6[local162].anInt5054;
					local199 = arg6[local162].anInt5056;
					@Pc(204) int local204 = local180.anIntArray69[local194];
					Static332.aClass5_Sub2_Sub16Array2[local162] = arg5.method2153(local204 >>> 16);
					@Pc(217) int local217 = local204 & 0xFFFF;
					Static399.anIntArray556[local162] = local217;
					if (Static332.aClass5_Sub2_Sub16Array2[local162] != null) {
						local138 |= Static332.aClass5_Sub2_Sub16Array2[local162].method4953(local217);
						local136 |= Static332.aClass5_Sub2_Sub16Array2[local162].method4957(local217);
						local140 |= Static332.aClass5_Sub2_Sub16Array2[local162].method4954(local217);
					}
					if ((local180.aBoolean37 || Static457.aBoolean567) && local199 != -1 && local199 < local180.anIntArray69.length) {
						Static298.anIntArray405[local162] = local180.anIntArray68[local194];
						Static186.anIntArray265[local162] = arg6[local162].anInt5055;
						@Pc(289) int local289 = local180.anIntArray69[local199];
						Static528.aClass5_Sub2_Sub16Array5[local162] = arg5.method2153(local289 >>> 16);
						@Pc(302) int local302 = local289 & 0xFFFF;
						Static69.anIntArray166[local162] = local302;
						if (Static528.aClass5_Sub2_Sub16Array5[local162] != null) {
							local138 |= Static528.aClass5_Sub2_Sub16Array5[local162].method4953(local302);
							local136 |= Static528.aClass5_Sub2_Sub16Array5[local162].method4957(local302);
							local140 |= Static528.aClass5_Sub2_Sub16Array5[local162].method4954(local302);
						}
					} else {
						Static298.anIntArray405[local162] = 0;
						Static186.anIntArray265[local162] = 0;
						Static528.aClass5_Sub2_Sub16Array5[local162] = null;
						Static69.anIntArray166[local162] = -1;
					}
				}
			}
		}
		@Pc(361) int local361 = -1;
		local194 = -1;
		local199 = 0;
		@Pc(367) Class5_Sub2_Sub16 local367 = null;
		@Pc(369) Class5_Sub2_Sub16 local369 = null;
		@Pc(371) int local371 = -1;
		@Pc(373) int local373 = -1;
		@Pc(375) int local375 = 0;
		@Pc(377) Class5_Sub2_Sub16 local377 = null;
		@Pc(379) Class5_Sub2_Sub16 local379 = null;
		if (local148) {
			@Pc(392) int local392;
			@Pc(456) int local456;
			if (arg9 != null) {
				local361 = arg9.anIntArray69[arg12];
				local392 = local361 >>> 16;
				local367 = arg5.method2153(local392);
				local361 &= 0xFFFF;
				if (local367 != null) {
					local138 |= local367.method4953(local361);
					local136 |= local367.method4957(local361);
					local140 |= local367.method4954(local361);
				}
				if ((arg9.aBoolean37 || Static457.aBoolean567) && arg10 != -1 && arg10 < arg9.anIntArray69.length) {
					local199 = arg9.anIntArray68[arg12];
					local194 = arg9.anIntArray69[arg10];
					local456 = local194 >>> 16;
					local194 &= 0xFFFF;
					local369 = local392 == local456 ? local367 : arg5.method2153(local456);
					if (local369 != null) {
						local138 |= local369.method4953(local194);
						local136 |= local369.method4957(local194);
						local140 |= local369.method4954(local194);
					}
				}
			}
			local34 = arg16 | 0x20;
			if (arg11 != null) {
				local371 = arg11.anIntArray69[arg4];
				local392 = local371 >>> 16;
				local377 = arg5.method2153(local392);
				local371 &= 0xFFFF;
				if (local377 != null) {
					local138 |= local377.method4953(local371);
					local136 |= local377.method4957(local371);
					local140 |= local377.method4954(local371);
				}
				if ((arg11.aBoolean37 || Static457.aBoolean567) && arg1 != -1 && arg11.anIntArray69.length > arg1) {
					local373 = arg11.anIntArray69[arg1];
					local375 = arg11.anIntArray68[arg4];
					local456 = local373 >>> 16;
					local373 &= 0xFFFF;
					local379 = local392 == local456 ? local377 : arg5.method2153(local456);
					if (local379 != null) {
						local138 |= local379.method4953(local373);
						local136 |= local379.method4957(local373);
						local140 |= local379.method4954(local373);
					}
				}
			}
			if (local138) {
				local34 |= 0x80;
			}
			if (local136) {
				local34 |= 0x100;
			}
			if (local140) {
				local34 |= 0x400;
			}
		}
		@Pc(628) Class288 local628 = Static240.aClass288_34;
		@Pc(636) Class36 local636;
		synchronized (Static240.aClass288_34) {
			local636 = (Class36) Static240.aClass288_34.method6745(local37);
		}
		@Pc(644) Class281 local644 = null;
		if (this.anInt7242 != -1) {
			local644 = arg7.method2270(this.anInt7242);
		}
		@Pc(684) int local684;
		@Pc(690) int local690;
		if (local636 == null || arg13.method7017(local636.ba(), local34) != 0 || local644 != null && local644.anIntArrayArray67 != null && this.anIntArrayArray60 == null) {
			if (local636 != null) {
				local34 = arg13.method7024(local34, local636.ba());
			}
			@Pc(682) boolean local682 = false;
			local684 = 0;
			while (true) {
				if (local684 >= 12) {
					if (local682) {
						if (this.aLong199 != -1L) {
							@Pc(737) Class288 local737 = Static240.aClass288_34;
							synchronized (Static240.aClass288_34) {
								local636 = (Class36) Static240.aClass288_34.method6745(this.aLong199);
							}
						}
						if (local636 == null || arg13.method7017(local636.ba(), local34) != 0 || local644 != null && local644.anIntArrayArray67 != null && this.anIntArrayArray60 == null) {
							return null;
						}
					} else {
						@Pc(776) Class184[] local776 = new Class184[12];
						@Pc(784) int local784;
						for (@Pc(778) int local778 = 0; local778 < 12; local778++) {
							local784 = local40[local778];
							@Pc(799) Class184 local799;
							if ((local784 & 0x40000000) != 0) {
								local799 = arg3.method2006(local784 & 0x3FFFFFFF).method677(this.aBoolean511);
								if (local799 != null) {
									local776[local778] = local799;
								}
							} else if ((local784 & Integer.MIN_VALUE) != 0) {
								local799 = arg2.method5220(local784 & 0x3FFFFFFF).method3768();
								if (local799 != null) {
									local776[local778] = local799;
								}
							}
						}
						@Pc(857) int local857;
						if (local644 != null && local644.anIntArrayArray67 != null) {
							for (local784 = 0; local784 < local644.anIntArrayArray67.length; local784++) {
								if (local644.anIntArrayArray67[local784] != null && local776[local784] != null) {
									local857 = local644.anIntArrayArray67[local784][0];
									@Pc(864) int local864 = local644.anIntArrayArray67[local784][1];
									@Pc(871) int local871 = local644.anIntArrayArray67[local784][2];
									@Pc(880) int local880 = local644.anIntArrayArray67[local784][3] << 3;
									@Pc(889) int local889 = local644.anIntArrayArray67[local784][4] << 3;
									@Pc(898) int local898 = local644.anIntArrayArray67[local784][5] << 3;
									if (this.anIntArrayArray60 == null) {
										this.anIntArrayArray60 = new int[local644.anIntArrayArray67.length][];
									}
									if (this.anIntArrayArray60[local784] == null) {
										@Pc(920) int[] local920 = this.anIntArrayArray60[local784] = new int[15];
										if (local880 == 0 && local889 == 0 && local898 == 0) {
											local920[12] = -local857;
											local920[13] = -local864;
											local920[14] = -local871;
											local920[0] = local920[4] = local920[8] = 32768;
										} else {
											@Pc(933) int local933 = Class5_Sub2_Sub16.anIntArray410[local880];
											@Pc(937) int local937 = Class5_Sub2_Sub16.anIntArray411[local880];
											@Pc(941) int local941 = Class5_Sub2_Sub16.anIntArray410[local889];
											@Pc(945) int local945 = Class5_Sub2_Sub16.anIntArray411[local889];
											@Pc(949) int local949 = Class5_Sub2_Sub16.anIntArray410[local898];
											@Pc(953) int local953 = Class5_Sub2_Sub16.anIntArray411[local898];
											@Pc(961) int local961 = local949 * local937 + 16384 >> 15;
											@Pc(969) int local969 = local953 * local937 + 16384 >> 15;
											local920[3] = local953 * local933 + 16384 >> 15;
											local920[2] = local933 * local945 + 16384 >> 15;
											local920[0] = local949 * local941 + local969 * local945 + 16384 >> 15;
											local920[4] = local933 * local949 + 16384 >> 15;
											local920[6] = local949 * -local945 + local941 * local969 + 16384 >> 15;
											local920[5] = -local937;
											local920[1] = local941 * -local953 + local945 * local961 + 16384 >> 15;
											local920[8] = local941 * local933 + 16384 >> 15;
											local920[7] = -local945 * -local953 + local941 * local961 + 16384 >> 15;
											local920[13] = -local871 * local920[7] + local920[4] * -local864 + local920[1] * -local857 + 16384 >> 15;
											local920[14] = local920[8] * -local871 + -local864 * local920[5] + -local857 * local920[2] + 16384 >> 15;
											local920[12] = -local871 * local920[6] + -local864 * local920[3] + -local857 * local920[0] + 16384 >> 15;
										}
										local920[9] = local857;
										local920[10] = local864;
										local920[11] = local871;
									}
									if (local880 != 0 || local889 != 0 || local898 != 0) {
										local776[local784].method4527(local880, local889, local898);
									}
									if (local857 != 0 || local864 != 0 || local871 != 0) {
										local776[local784].method4522(local857, local864, local871);
									}
								}
							}
						}
						@Pc(1247) int local1247 = local34 | 0x4000;
						@Pc(1254) Class184 local1254 = new Class184(local776, local776.length);
						local636 = arg13.method7012(local1254, local1247, Static84.anInt1589, 64, 850);
						for (local857 = 0; local857 < 5; local857++) {
							if (Static130.aShortArrayArray2[local857].length > this.anIntArray563[local857]) {
								local636.pa(Static247.aShortArray50[local857], Static130.aShortArrayArray2[local857][this.anIntArray563[local857]]);
							}
							if (this.anIntArray563[local857] < Static141.aShortArrayArray4[local857].length) {
								local636.pa(Static399.aShortArray112[local857], Static141.aShortArrayArray4[local857][this.anIntArray563[local857]]);
							}
						}
						local636.m(local34);
						@Pc(1325) Class288 local1325 = Static240.aClass288_34;
						synchronized (Static240.aClass288_34) {
							Static240.aClass288_34.method6746(local636, local37);
						}
						this.aLong199 = local37;
					}
					break;
				}
				local690 = local40[local684];
				if ((local690 & 0x40000000) == 0) {
					if ((local690 & Integer.MIN_VALUE) != 0 && !arg2.method5220(local690 & 0x3FFFFFFF).method3769()) {
						local682 = true;
					}
				} else if (!arg3.method2006(local690 & 0x3FFFFFFF).method682(this.aBoolean511)) {
					local682 = true;
				}
				local684++;
			}
		}
		@Pc(1347) Class36 local1347 = local636.method7356((byte) 4, local34, true);
		if (!local148) {
			return local1347;
		}
		@Pc(1353) int local1353 = 0;
		local684 = 1;
		while (local155 > local1353) {
			if (Static332.aClass5_Sub2_Sub16Array2[local1353] != null) {
				local1347.method7355(Static332.aClass5_Sub2_Sub16Array2[local1353], Static186.anIntArray265[local1353] - 1, Static528.aClass5_Sub2_Sub16Array5[local1353], false, Static399.anIntArray556[local1353], Static69.anIntArray166[local1353], local684, Static298.anIntArray405[local1353], this.anIntArrayArray60 == null ? null : this.anIntArrayArray60[local1353]);
			}
			local1353++;
			local684 <<= 0x1;
		}
		if (local367 != null && local377 != null) {
			local1347.method7351(local199, local367, local375, arg14 - 1, arg15 + -1, local369, arg9.aBooleanArray4, local361, false, local379, local194, local377, local373, local371);
		} else if (local367 != null) {
			local1347.method7348(0, local194, local369, local361, arg14 - 1, local367, false, local199);
		} else if (local377 != null) {
			local1347.method7348(0, local373, local379, local371, arg15 - 1, local377, false, local375);
		}
		for (local690 = 0; local690 < local155; local690++) {
			Static332.aClass5_Sub2_Sub16Array2[local690] = null;
			Static528.aClass5_Sub2_Sub16Array5[local690] = null;
			Static293.aClass31Array2[local690] = null;
		}
		return local1347;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ms;Lclient!dn;IILclient!nk;Lclient!qa;ILclient!tj;ILclient!bj;ILclient!eca;)Lclient!r;")
	public Class36 method5873(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class211 arg4, @OriginalArg(5) Class62 arg5, @OriginalArg(7) Class282 arg6, @OriginalArg(9) Class31 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class76 arg9) {
		if (this.anInt7240 != -1) {
			return arg6.method6596(this.anInt7240).method7145(arg0, arg9, arg8, arg3, arg7, arg5, arg2);
		}
		@Pc(35) int local35 = 2048;
		@Pc(43) boolean local43;
		@Pc(58) int local58;
		@Pc(125) int local125;
		@Pc(66) int local66;
		if (arg7 != null) {
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			local43 = false;
			@Pc(45) boolean local45 = false;
			local58 = arg7.anIntArray69[arg8];
			local35 = 2080;
			local66 = local58 >>> 16;
			@Pc(71) Class5_Sub2_Sub16 local71 = arg9.method2153(local66);
			@Pc(75) int local75 = local58 & 0xFFFF;
			if (local71 != null) {
				local41 = local71.method4953(local75) | false;
				local39 = local71.method4957(local75) | false;
				local45 = local71.method4954(local75) | false;
				local43 = arg7.aBoolean39 | false;
			}
			if ((arg7.aBoolean37 || Static457.aBoolean567) && arg3 != -1 && arg7.anIntArray69.length > arg3) {
				local125 = arg7.anIntArray69[arg3];
				@Pc(129) int local129 = local125 >>> 16;
				@Pc(143) Class5_Sub2_Sub16 local143 = local129 == local66 ? local71 : arg9.method2153(local129);
				@Pc(147) int local147 = local125 & 0xFFFF;
				if (local143 != null) {
					local41 |= local143.method4953(local147);
					local39 |= local143.method4957(local147);
					local45 |= local143.method4954(local147);
				}
			}
			if (local41) {
				local35 = 2208;
			}
			if (local39) {
				local35 |= 0x100;
			}
			if (local43) {
				local35 |= 0x200;
			}
			if (local45) {
				local35 |= 0x400;
			}
		}
		@Pc(196) Class288 local196 = Static229.aClass288_33;
		@Pc(205) Class36 local205;
		synchronized (Static229.aClass288_33) {
			local205 = (Class36) Static229.aClass288_33.method6745(this.aLong198);
		}
		if (local205 == null || arg5.method7017(local205.ba(), local35) != 0) {
			if (local205 != null) {
				local35 = arg5.method7024(local35, local205.ba());
			}
			local43 = false;
			for (@Pc(236) int local236 = 0; local236 < 12; local236++) {
				local58 = this.anIntArray564[local236];
				if ((local58 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local58) != 0 && !arg4.method5220(local58 & 0x3FFFFFFF).method3775()) {
						local43 = true;
					}
				} else if (!arg1.method2006(local58 & 0x3FFFFFFF).method689(this.aBoolean511)) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(293) Class184[] local293 = new Class184[12];
			local125 = 0;
			for (@Pc(297) int local297 = 0; local297 < 12; local297++) {
				@Pc(304) int local304 = this.anIntArray564[local297];
				@Pc(321) Class184 local321;
				if ((local304 & 0x40000000) != 0) {
					local321 = arg1.method2006(local304 & 0x3FFFFFFF).method681(this.aBoolean511);
					if (local321 != null) {
						local293[local125++] = local321;
					}
				} else if ((Integer.MIN_VALUE & local304) != 0) {
					local321 = arg4.method5220(local304 & 0x3FFFFFFF).method3774();
					if (local321 != null) {
						local293[local125++] = local321;
					}
				}
			}
			@Pc(358) Class184 local358 = new Class184(local293, local125);
			@Pc(362) int local362 = local35 | 0x4000;
			local205 = arg5.method7012(local358, local362, Static84.anInt1589, 64, 768);
			for (local66 = 0; local66 < 5; local66++) {
				if (this.anIntArray563[local66] < Static130.aShortArrayArray2[local66].length) {
					local205.pa(Static247.aShortArray50[local66], Static130.aShortArrayArray2[local66][this.anIntArray563[local66]]);
				}
				if (this.anIntArray563[local66] < Static141.aShortArrayArray4[local66].length) {
					local205.pa(Static399.aShortArray112[local66], Static141.aShortArrayArray4[local66][this.anIntArray563[local66]]);
				}
			}
			local205.m(local35);
			@Pc(431) Class288 local431 = Static229.aClass288_33;
			synchronized (Static229.aClass288_33) {
				Static229.aClass288_33.method6746(local205, this.aLong198);
			}
		}
		if (arg7 == null) {
			return local205;
		} else {
			local205.method7356((byte) 4, local35, true);
			return arg7.method852(local205, arg2, arg8, arg3, 2048);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	private void method5875() {
		this.aLong198 = -1L;
		@Pc(10) long[] local10 = Class273.aLongArray8;
		this.aLong198 = this.aLong198 >>> 8 ^ local10[(int) (((long) (this.anInt7242 >> 8) ^ this.aLong198) & 0xFFL)];
		this.aLong198 = this.aLong198 >>> 8 ^ local10[(int) (((long) this.anInt7242 ^ this.aLong198) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong198 = this.aLong198 >>> 8 ^ local10[(int) (((long) (this.anIntArray564[local50] >> 24) ^ this.aLong198) & 0xFFL)];
			this.aLong198 = this.aLong198 >>> 8 ^ local10[(int) (((long) (this.anIntArray564[local50] >> 16) ^ this.aLong198) & 0xFFL)];
			this.aLong198 = local10[(int) (((long) (this.anIntArray564[local50] >> 8) ^ this.aLong198) & 0xFFL)] ^ this.aLong198 >>> 8;
			this.aLong198 = local10[(int) (((long) this.anIntArray564[local50] ^ this.aLong198) & 0xFFL)] ^ this.aLong198 >>> 8;
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong198 = this.aLong198 >>> 8 ^ local10[(int) ((this.aLong198 ^ (long) this.anIntArray563[local146]) & 0xFFL)];
		}
		this.aLong198 = local10[(int) (((long) (this.aBoolean511 ? 1 : 0) ^ this.aLong198) & 0xFFL)] ^ this.aLong198 >>> 8;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([I[IZIIB)V")
	public void method5876(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 != this.anInt7242) {
			this.anIntArrayArray60 = null;
			this.anInt7242 = arg4;
		}
		this.anIntArray564 = arg0;
		this.anInt7240 = arg3;
		this.anIntArray563 = arg1;
		this.aBoolean511 = arg2;
		this.method5875();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBI)V")
	public void method5877(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray563[arg0] = arg1;
		this.method5875();
	}
}
