import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class78 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	private int anInt2162;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "[I")
	private int[] anIntArray96;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "J")
	private long aLong57;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
	public int anInt2165 = -1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([Lclient!is;Lclient!fb;Lclient!au;Lclient!lb;Lclient!ks;IILclient!r;Lclient!oj;ILclient!bg;ILclient!nv;Lclient!lb;BIZII)Lclient!da;")
	public Class60 method1908(@OriginalArg(0) Class152[] arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) Class185 arg3, @OriginalArg(4) Interface9 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class45 arg7, @OriginalArg(8) Class240 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class33 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class229 arg12, @OriginalArg(13) Class185 arg13, @OriginalArg(15) int arg14, @OriginalArg(17) int arg15, @OriginalArg(18) int arg16) {
		if (this.anInt2165 != -1) {
			return arg12.method5396(this.anInt2165).method5997(arg15, arg3, arg9, arg4, arg10, arg7, arg14, arg5, arg11, arg0, arg6, arg8, arg16, arg13);
		}
		@Pc(34) int local34 = arg9;
		@Pc(37) long local37 = this.aLong56;
		@Pc(40) int[] local40 = this.anIntArray96;
		if (arg13 != null && (arg13.anInt4988 >= 0 || arg13.anInt4980 >= 0)) {
			local40 = new int[12];
			for (@Pc(59) int local59 = 0; local59 < 12; local59++) {
				local40[local59] = this.anIntArray96[local59];
			}
			if (arg13.anInt4988 >= 0) {
				if (arg13.anInt4988 == 65535) {
					local40[5] = 0;
					local37 ^= 0xFFFFFFFF00000000L;
				} else {
					local40[5] = arg13.anInt4988 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg13.anInt4980 >= 0) {
				if (arg13.anInt4980 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg13.anInt4980 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(145) boolean local145 = false;
		@Pc(147) boolean local147 = false;
		@Pc(149) boolean local149 = false;
		@Pc(157) boolean local157 = arg13 != null || arg3 != null;
		@Pc(164) int local164 = arg0 == null ? 0 : arg0.length;
		@Pc(203) int local203;
		@Pc(208) int local208;
		for (@Pc(171) int local171 = 0; local171 < local164; local171++) {
			Static28.aClass3_Sub7_Sub6Array1[local171] = null;
			if (arg0[local171] != null) {
				@Pc(189) Class185 local189 = arg8.method5680(arg0[local171].anInt4139);
				if (local189.anIntArray280 != null) {
					local157 = true;
					Static235.aClass185Array2[local171] = local189;
					local203 = arg0[local171].anInt4135;
					local208 = arg0[local171].anInt4137;
					@Pc(213) int local213 = local189.anIntArray280[local203];
					Static28.aClass3_Sub7_Sub6Array1[local171] = arg8.method5679(local213 >>> 16);
					@Pc(226) int local226 = local213 & 0xFFFF;
					Static250.anIntArray238[local171] = local226;
					if (Static28.aClass3_Sub7_Sub6Array1[local171] != null) {
						local147 |= Static28.aClass3_Sub7_Sub6Array1[local171].method2517(local226);
						local145 |= Static28.aClass3_Sub7_Sub6Array1[local171].method2519(local226);
						local149 |= Static28.aClass3_Sub7_Sub6Array1[local171].method2516(local226);
					}
					if ((local189.aBoolean362 || Static391.aBoolean508) && local208 != -1 && local189.anIntArray280.length > local208) {
						Static342.anIntArray323[local171] = local189.anIntArray282[local203];
						Static536.anIntArray565[local171] = arg0[local171].anInt4136;
						@Pc(294) int local294 = local189.anIntArray280[local208];
						Static318.aClass3_Sub7_Sub6Array3[local171] = arg8.method5679(local294 >>> 16);
						@Pc(307) int local307 = local294 & 0xFFFF;
						Static537.anIntArray567[local171] = local307;
						if (Static318.aClass3_Sub7_Sub6Array3[local171] != null) {
							local147 |= Static318.aClass3_Sub7_Sub6Array3[local171].method2517(local307);
							local145 |= Static318.aClass3_Sub7_Sub6Array3[local171].method2519(local307);
							local149 |= Static318.aClass3_Sub7_Sub6Array3[local171].method2516(local307);
						}
					} else {
						Static342.anIntArray323[local171] = 0;
						Static536.anIntArray565[local171] = 0;
						Static318.aClass3_Sub7_Sub6Array3[local171] = null;
						Static537.anIntArray567[local171] = -1;
					}
				}
			}
		}
		@Pc(370) int local370 = -1;
		local203 = -1;
		local208 = 0;
		@Pc(376) Class3_Sub7_Sub6 local376 = null;
		@Pc(378) Class3_Sub7_Sub6 local378 = null;
		@Pc(380) int local380 = -1;
		@Pc(382) int local382 = -1;
		@Pc(384) int local384 = 0;
		@Pc(386) Class3_Sub7_Sub6 local386 = null;
		@Pc(388) Class3_Sub7_Sub6 local388 = null;
		if (local157) {
			local34 = arg9 | 0x20;
			@Pc(405) int local405;
			@Pc(469) int local469;
			if (arg13 != null) {
				local370 = arg13.anIntArray280[arg14];
				local405 = local370 >>> 16;
				local370 &= 0xFFFF;
				local376 = arg8.method5679(local405);
				if (local376 != null) {
					local147 |= local376.method2517(local370);
					local145 |= local376.method2519(local370);
					local149 |= local376.method2516(local370);
				}
				if ((arg13.aBoolean362 || Static391.aBoolean508) && arg5 != -1 && arg13.anIntArray280.length > arg5) {
					local203 = arg13.anIntArray280[arg5];
					local208 = arg13.anIntArray282[arg14];
					local469 = local203 >>> 16;
					local203 &= 0xFFFF;
					local378 = local469 == local405 ? local376 : arg8.method5679(local469);
					if (local378 != null) {
						local147 |= local378.method2517(local203);
						local145 |= local378.method2519(local203);
						local149 |= local378.method2516(local203);
					}
				}
			}
			if (arg3 != null) {
				local380 = arg3.anIntArray280[arg15];
				local405 = local380 >>> 16;
				local380 &= 0xFFFF;
				local386 = arg8.method5679(local405);
				if (local386 != null) {
					local147 |= local386.method2517(local380);
					local145 |= local386.method2519(local380);
					local149 |= local386.method2516(local380);
				}
				if ((arg3.aBoolean362 || Static391.aBoolean508) && arg16 != -1 && arg3.anIntArray280.length > arg16) {
					local384 = arg3.anIntArray282[arg15];
					local382 = arg3.anIntArray280[arg16];
					local469 = local382 >>> 16;
					local388 = local469 == local405 ? local386 : arg8.method5679(local469);
					local382 &= 0xFFFF;
					if (local388 != null) {
						local147 |= local388.method2517(local382);
						local145 |= local388.method2519(local382);
						local149 |= local388.method2516(local382);
					}
				}
			}
			if (local147) {
				local34 |= 0x80;
			}
			if (local145) {
				local34 |= 0x100;
			}
			if (local149) {
				local34 |= 0x400;
			}
		}
		@Pc(645) Class6 local645 = Static220.aClass6_22;
		@Pc(653) Class60 local653;
		synchronized (Static220.aClass6_22) {
			local653 = (Class60) Static220.aClass6_22.method92(local37);
		}
		@Pc(661) Class365 local661 = null;
		if (this.anInt2162 != -1) {
			local661 = arg10.method659(this.anInt2162);
		}
		@Pc(701) int local701;
		@Pc(707) int local707;
		if (local653 == null || arg7.method7393(local653.PA(), local34) != 0 || local661 != null && local661.anIntArrayArray203 != null && this.anIntArrayArray44 == null) {
			if (local653 != null) {
				local34 = arg7.method7392(local34, local653.PA());
			}
			@Pc(699) boolean local699 = false;
			local701 = 0;
			while (true) {
				if (local701 >= 12) {
					if (local699) {
						if (this.aLong57 != -1L) {
							@Pc(756) Class6 local756 = Static220.aClass6_22;
							synchronized (Static220.aClass6_22) {
								local653 = (Class60) Static220.aClass6_22.method92(this.aLong57);
							}
						}
						if (local653 == null || arg7.method7393(local653.PA(), local34) != 0 || local661 != null && local661.anIntArrayArray203 != null && this.anIntArrayArray44 == null) {
							return null;
						}
					} else {
						@Pc(792) Class84[] local792 = new Class84[12];
						@Pc(800) int local800;
						for (@Pc(794) int local794 = 0; local794 < 12; local794++) {
							local800 = local40[local794];
							@Pc(823) Class84 local823;
							if ((local800 & 0x40000000) != 0) {
								local823 = arg1.method2673(local800 & 0x3FFFFFFF).method4514(this.aBoolean170);
								if (local823 != null) {
									local792[local794] = local823;
								}
							} else if ((local800 & Integer.MIN_VALUE) != 0) {
								local823 = arg2.method445(local800 & 0x3FFFFFFF).method3263();
								if (local823 != null) {
									local792[local794] = local823;
								}
							}
						}
						@Pc(888) int local888;
						@Pc(881) int local881;
						if (local661 != null && local661.anIntArrayArray203 != null) {
							for (local800 = 0; local800 < local661.anIntArrayArray203.length; local800++) {
								if (local661.anIntArrayArray203[local800] != null && local792[local800] != null) {
									local881 = local661.anIntArrayArray203[local800][0];
									local888 = local661.anIntArrayArray203[local800][1];
									@Pc(895) int local895 = local661.anIntArrayArray203[local800][2];
									@Pc(904) int local904 = local661.anIntArrayArray203[local800][3] << 3;
									@Pc(913) int local913 = local661.anIntArrayArray203[local800][4] << 3;
									@Pc(922) int local922 = local661.anIntArrayArray203[local800][5] << 3;
									if (this.anIntArrayArray44 == null) {
										this.anIntArrayArray44 = new int[local661.anIntArrayArray203.length][];
									}
									if (this.anIntArrayArray44[local800] == null) {
										@Pc(944) int[] local944 = this.anIntArrayArray44[local800] = new int[15];
										if (local904 == 0 && local913 == 0 && local922 == 0) {
											local944[13] = -local888;
											local944[0] = local944[4] = local944[8] = 32768;
											local944[14] = -local895;
											local944[12] = -local881;
										} else {
											@Pc(989) int local989 = Class356.anIntArray598[local904];
											@Pc(993) int local993 = Class356.anIntArray597[local904];
											@Pc(997) int local997 = Class356.anIntArray598[local913];
											@Pc(1001) int local1001 = Class356.anIntArray597[local913];
											@Pc(1005) int local1005 = Class356.anIntArray598[local922];
											@Pc(1009) int local1009 = Class356.anIntArray597[local922];
											@Pc(1017) int local1017 = local1005 * local993 + 8192 >> 14;
											@Pc(1025) int local1025 = local993 * local1009 + 8192 >> 14;
											local944[5] = -local993;
											local944[4] = local989 * local1005 + 8192 >> 14;
											local944[3] = local1009 * local989 + 8192 >> 14;
											local944[6] = local1025 * local997 + local1005 * -local1001 + 8192 >> 14;
											local944[1] = -local1009 * local997 + local1001 * local1017 + 8192 >> 14;
											local944[2] = local989 * local1001 + 8192 >> 14;
											local944[7] = local1017 * local997 + -local1001 * -local1009 + 8192 >> 14;
											local944[0] = local1025 * local1001 + local997 * local1005 + 8192 >> 14;
											local944[8] = local997 * local989 + 8192 >> 14;
											local944[12] = local944[6] * -local895 + local944[3] * -local888 + -local881 * local944[0] + 8192 >> 14;
											local944[14] = -local888 * local944[5] + local944[2] * -local881 + local944[8] * -local895 + 8192 >> 14;
											local944[13] = -local895 * local944[7] + local944[1] * -local881 + local944[4] * -local888 + 8192 >> 14;
										}
										local944[9] = local881;
										local944[10] = local888;
										local944[11] = local895;
									}
									if (local904 != 0 || local913 != 0 || local922 != 0) {
										local792[local800].method2434(local922, local904, local913);
									}
									if (local881 != 0 || local888 != 0 || local895 != 0) {
										local792[local800].method2431(local888, local881, local895);
									}
								}
							}
						}
						@Pc(1288) Class84 local1288 = new Class84(local792, local792.length);
						@Pc(1292) int local1292 = local34 | 0x4000;
						local653 = arg7.method7419(local1288, local1292, Static371.anInt6382, 64, 850);
						for (local881 = 0; local881 < 5; local881++) {
							for (local888 = 0; local888 < Static158.aShortArrayArrayArray1.length; local888++) {
								if (this.anIntArray97[local881] < Static158.aShortArrayArrayArray1[local888][local881].length) {
									local653.d(Static59.aShortArrayArray5[local888][local881], Static158.aShortArrayArrayArray1[local888][local881][this.anIntArray97[local881]]);
								}
							}
						}
						local653.SA(local34);
						@Pc(1360) Class6 local1360 = Static220.aClass6_22;
						synchronized (Static220.aClass6_22) {
							Static220.aClass6_22.method106(local37, local653);
						}
						this.aLong57 = local37;
					}
					break;
				}
				local707 = local40[local701];
				if ((local707 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local707) != 0 && !arg2.method445(local707 & 0x3FFFFFFF).method3265()) {
						local699 = true;
					}
				} else if (!arg1.method2673(local707 & 0x3FFFFFFF).method4525(this.aBoolean170)) {
					local699 = true;
				}
				local701++;
			}
		}
		@Pc(1382) Class60 local1382 = local653.method7229((byte) 4, local34, true);
		if (!local157) {
			return local1382;
		}
		@Pc(1388) int local1388 = 0;
		local701 = 1;
		while (local1388 < local164) {
			if (Static28.aClass3_Sub7_Sub6Array1[local1388] != null) {
				local1382.method7227(Static537.anIntArray567[local1388], false, Static318.aClass3_Sub7_Sub6Array3[local1388], Static342.anIntArray323[local1388], Static250.anIntArray238[local1388], this.anIntArrayArray44 == null ? null : this.anIntArrayArray44[local1388], Static536.anIntArray565[local1388] - 1, local701, Static28.aClass3_Sub7_Sub6Array1[local1388]);
			}
			local1388++;
			local701 <<= 0x1;
		}
		if (local376 != null && local386 != null) {
			local1382.method7240(local370, arg11 - 1, local386, local208, local380, arg13.aBooleanArray15, local376, arg6 - 1, local382, false, local388, local203, local378, local384);
		} else if (local376 != null) {
			local1382.method7226(local370, false, local378, local376, 0, local203, arg11 - 1, local208);
		} else if (local386 != null) {
			local1382.method7226(local380, false, local388, local386, 0, local382, arg6 - 1, local384);
		}
		for (local707 = 0; local707 < local164; local707++) {
			Static28.aClass3_Sub7_Sub6Array1[local707] = null;
			Static318.aClass3_Sub7_Sub6Array3[local707] = null;
			Static235.aClass185Array2[local707] = null;
		}
		return local1382;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!au;ZI)V")
	public void method1909(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static410.anIntArray437[arg2];
		if (arg1.method445(arg0) != null) {
			this.anIntArray96[local7] = Integer.MIN_VALUE | arg0;
			this.method1918();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILclient!fb;I)V")
	public void method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2) {
		if (arg0 == -1) {
			this.anIntArray96[arg1] = 0;
		} else if (arg2.method2673(arg0) != null) {
			this.anIntArray96[arg1] = arg0 | 0x40000000;
			this.method1918();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!au;ZLclient!r;Lclient!oj;ILclient!lb;IIIII)Lclient!da;")
	public Class60 method1912(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) Class45 arg2, @OriginalArg(4) Class240 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class185 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		@Pc(38) int local38;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(32) int local32 = arg5.anIntArray280[arg9];
			local38 = local32 >>> 16;
			@Pc(42) int local42 = local32 & 0xFFFF;
			@Pc(47) Class3_Sub7_Sub6 local47 = arg3.method5679(local38);
			if (local47 != null) {
				local13 = local47.method2517(local42) | false;
				local11 = local47.method2519(local42) | false;
				local17 = local47.method2516(local42) | false;
				local15 = arg5.aBoolean361 | false;
			}
			if ((arg5.aBoolean362 || Static391.aBoolean508) && arg6 != -1 && arg5.anIntArray280.length > arg6) {
				local97 = arg5.anIntArray280[arg6];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(115) Class3_Sub7_Sub6 local115;
				if (local38 == local101) {
					local115 = local47;
				} else {
					local115 = arg3.method5679(local105 >>> 16);
				}
				if (local115 != null) {
					local13 |= local115.method2517(local105);
					local11 |= local115.method2519(local105);
					local17 |= local115.method2516(local105);
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
		@Pc(178) long local178 = (long) arg7 | (long) (arg8 << 16) | (long) arg0 << 32;
		@Pc(180) Class6 local180 = Static272.aClass6_29;
		@Pc(188) Class60 local188;
		synchronized (Static272.aClass6_29) {
			local188 = (Class60) Static272.aClass6_29.method92(local178);
		}
		if (local188 == null || arg2.method7393(local188.PA(), local7) != 0) {
			if (local188 != null) {
				local7 = arg2.method7392(local7, local188.PA());
			}
			@Pc(215) Class84[] local215 = new Class84[3];
			local97 = 0;
			if (!arg1.method445(arg7).method3261() || !arg1.method445(arg8).method3261() || !arg1.method445(arg0).method3261()) {
				return null;
			}
			@Pc(247) Class84 local247 = arg1.method445(arg7).method3264();
			if (local247 != null) {
				local97++;
				local215[0] = local247;
			}
			local247 = arg1.method445(arg8).method3264();
			if (local247 != null) {
				local215[local97++] = local247;
			}
			local247 = arg1.method445(arg0).method3264();
			if (local247 != null) {
				local215[local97++] = local247;
			}
			local247 = new Class84(local215, local97);
			@Pc(292) int local292 = local7 | 0x4000;
			local188 = arg2.method7419(local247, local292, Static371.anInt6382, 64, 768);
			for (@Pc(302) int local302 = 0; local302 < 5; local302++) {
				for (local38 = 0; local38 < Static158.aShortArrayArrayArray1.length; local38++) {
					if (this.anIntArray97[local302] < Static158.aShortArrayArrayArray1[local38][local302].length) {
						local188.d(Static59.aShortArrayArray5[local38][local302], Static158.aShortArrayArrayArray1[local38][local302][this.anIntArray97[local302]]);
					}
				}
			}
			local188.SA(local7);
			@Pc(360) Class6 local360 = Static272.aClass6_29;
			synchronized (Static272.aClass6_29) {
				Static272.aClass6_29.method106(local178, local188);
			}
		}
		if (arg5 == null) {
			return local188;
		} else {
			local188 = local188.method7229((byte) 4, local7, true);
			return arg5.method4381(arg4, arg9, local188, arg6, 2048);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ks;IILclient!oj;Lclient!au;Lclient!nv;Lclient!lb;Lclient!fb;IIZLclient!r;)Lclient!da;")
	public Class60 method1914(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class240 arg3, @OriginalArg(4) Class23 arg4, @OriginalArg(5) Class229 arg5, @OriginalArg(6) Class185 arg6, @OriginalArg(7) Class92 arg7, @OriginalArg(8) int arg8, @OriginalArg(11) Class45 arg9) {
		if (this.anInt2165 != -1) {
			return arg5.method5396(this.anInt2165).method5992(arg1, arg9, arg3, arg0, arg6, arg8, arg2);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(51) int local51;
		@Pc(114) int local114;
		@Pc(59) int local59;
		@Pc(118) int local118;
		if (arg6 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local51 = arg6.anIntArray280[arg2];
			local28 = 2080;
			local59 = local51 >>> 16;
			@Pc(63) int local63 = local51 & 0xFFFF;
			@Pc(68) Class3_Sub7_Sub6 local68 = arg3.method5679(local59);
			if (local68 != null) {
				local34 = local68.method2517(local63) | false;
				local32 = local68.method2519(local63) | false;
				local38 = local68.method2516(local63) | false;
				local36 = arg6.aBoolean361 | false;
			}
			if ((arg6.aBoolean362 || Static391.aBoolean508) && arg1 != -1 && arg6.anIntArray280.length > arg1) {
				local114 = arg6.anIntArray280[arg1];
				local118 = local114 >>> 16;
				@Pc(132) Class3_Sub7_Sub6 local132 = local118 == local59 ? local68 : arg3.method5679(local118);
				@Pc(136) int local136 = local114 & 0xFFFF;
				if (local132 != null) {
					local34 |= local132.method2517(local136);
					local32 |= local132.method2519(local136);
					local38 |= local132.method2516(local136);
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
		@Pc(185) Class6 local185 = Static272.aClass6_29;
		@Pc(194) Class60 local194;
		synchronized (Static272.aClass6_29) {
			local194 = (Class60) Static272.aClass6_29.method92(this.aLong56);
		}
		if (local194 == null || arg9.method7393(local194.PA(), local28) != 0) {
			if (local194 != null) {
				local28 = arg9.method7392(local28, local194.PA());
			}
			local36 = false;
			for (@Pc(222) int local222 = 0; local222 < 12; local222++) {
				local51 = this.anIntArray96[local222];
				if ((local51 & 0x40000000) == 0) {
					if ((local51 & Integer.MIN_VALUE) != 0 && !arg4.method445(local51 & 0x3FFFFFFF).method3261()) {
						local36 = true;
					}
				} else if (!arg7.method2673(local51 & 0x3FFFFFFF).method4523(this.aBoolean170)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(279) Class84[] local279 = new Class84[12];
			local114 = 0;
			for (@Pc(283) int local283 = 0; local283 < 12; local283++) {
				@Pc(290) int local290 = this.anIntArray96[local283];
				@Pc(307) Class84 local307;
				if ((local290 & 0x40000000) != 0) {
					local307 = arg7.method2673(local290 & 0x3FFFFFFF).method4516(this.aBoolean170);
					if (local307 != null) {
						local279[local114++] = local307;
					}
				} else if ((Integer.MIN_VALUE & local290) != 0) {
					local307 = arg4.method445(local290 & 0x3FFFFFFF).method3264();
					if (local307 != null) {
						local279[local114++] = local307;
					}
				}
			}
			@Pc(344) int local344 = local28 | 0x4000;
			@Pc(350) Class84 local350 = new Class84(local279, local114);
			local194 = arg9.method7419(local350, local344, Static371.anInt6382, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local118 = 0; local118 < Static158.aShortArrayArrayArray1.length; local118++) {
					if (Static158.aShortArrayArrayArray1[local118][local59].length > this.anIntArray97[local59]) {
						local194.d(Static59.aShortArrayArray5[local118][local59], Static158.aShortArrayArrayArray1[local118][local59][this.anIntArray97[local59]]);
					}
				}
			}
			local194.SA(local28);
			@Pc(412) Class6 local412 = Static272.aClass6_29;
			synchronized (Static272.aClass6_29) {
				Static272.aClass6_29.method106(this.aLong56, local194);
			}
		}
		if (arg6 == null) {
			return local194;
		} else {
			local194.method7229((byte) 4, local28, true);
			return arg6.method4381(arg8, arg2, local194, arg1, 2048);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZII)V")
	public void method1916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray97[arg1] = arg0;
		this.method1918();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([IIBI[IZ)V")
	public void method1917(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		if (this.anInt2162 != arg1) {
			this.anIntArrayArray44 = null;
			this.anInt2162 = arg1;
		}
		this.anInt2165 = arg2;
		this.anIntArray96 = arg3;
		this.aBoolean170 = arg4;
		this.anIntArray97 = arg0;
		this.method1918();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	private void method1918() {
		this.aLong56 = -1L;
		@Pc(10) long[] local10 = Class109.aLongArray6;
		this.aLong56 = this.aLong56 >>> 8 ^ local10[(int) (((long) (this.anInt2162 >> 8) ^ this.aLong56) & 0xFFL)];
		this.aLong56 = this.aLong56 >>> 8 ^ local10[(int) (((long) this.anInt2162 ^ this.aLong56) & 0xFFL)];
		for (@Pc(61) int local61 = 0; local61 < 12; local61++) {
			this.aLong56 = this.aLong56 >>> 8 ^ local10[(int) (((long) (this.anIntArray96[local61] >> 24) ^ this.aLong56) & 0xFFL)];
			this.aLong56 = local10[(int) (((long) (this.anIntArray96[local61] >> 16) ^ this.aLong56) & 0xFFL)] ^ this.aLong56 >>> 8;
			this.aLong56 = local10[(int) ((this.aLong56 ^ (long) (this.anIntArray96[local61] >> 8)) & 0xFFL)] ^ this.aLong56 >>> 8;
			this.aLong56 = this.aLong56 >>> 8 ^ local10[(int) ((this.aLong56 ^ (long) this.anIntArray96[local61]) & 0xFFL)];
		}
		for (@Pc(157) int local157 = 0; local157 < 5; local157++) {
			this.aLong56 = this.aLong56 >>> 8 ^ local10[(int) ((this.aLong56 ^ (long) this.anIntArray97[local157]) & 0xFFL)];
		}
		this.aLong56 = this.aLong56 >>> 8 ^ local10[(int) ((this.aLong56 ^ (long) (this.aBoolean170 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZB)V")
	public void method1920(@OriginalArg(0) boolean arg0) {
		this.aBoolean170 = arg0;
		this.method1918();
	}
}
