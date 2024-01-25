import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class90 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
	private int anInt2865;

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "Z")
	public boolean aBoolean187;

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!gv", name = "r", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
	public int anInt2861 = -1;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!kg;ILclient!qa;Lclient!rn;IZLclient!jr;ILclient!gj;ILclient!jc;IILclient!ts;Lclient!kg;[Lclient!ar;ILclient!pa;)Lclient!ka;")
	public Class57 method2563(@OriginalArg(1) Class130 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(4) Class223 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class126 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class85 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Interface2 arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) Class247 arg12, @OriginalArg(15) Class130 arg13, @OriginalArg(16) Class15[] arg14, @OriginalArg(17) int arg15, @OriginalArg(18) Class193 arg16) {
		if (this.anInt2861 != -1) {
			return arg12.method5660(this.anInt2861).method5594(arg15, arg7, arg2, arg14, arg0, arg4, arg6, arg13, arg10, arg8, arg9, arg11, arg3, arg1);
		}
		@Pc(33) int local33 = arg10;
		@Pc(36) long local36 = this.aLong90;
		@Pc(39) int[] local39 = this.anIntArray241;
		if (arg0 != null && (arg0.anInt3951 >= 0 || arg0.anInt3945 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray241[local55];
			}
			if (arg0.anInt3951 >= 0) {
				if (arg0.anInt3951 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg0.anInt3951 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg0.anInt3945 >= 0) {
				if (arg0.anInt3945 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg0.anInt3945 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(140) boolean local140 = false;
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(152) boolean local152 = arg0 != null || arg13 != null;
		@Pc(159) int local159 = arg14 == null ? 0 : arg14.length;
		@Pc(193) int local193;
		@Pc(198) int local198;
		for (@Pc(161) int local161 = 0; local161 < local159; local161++) {
			Static199.aClass4_Sub1_Sub17Array2[local161] = null;
			if (arg14[local161] != null) {
				@Pc(179) Class130 local179 = arg7.method2406(arg14[local161].anInt301);
				if (local179.anIntArray306 != null) {
					local152 = true;
					Static278.aClass130Array1[local161] = local179;
					local193 = arg14[local161].anInt297;
					local198 = arg14[local161].anInt298;
					@Pc(203) int local203 = local179.anIntArray306[local193];
					Static199.aClass4_Sub1_Sub17Array2[local161] = arg7.method2403(local203 >>> 16);
					@Pc(216) int local216 = local203 & 0xFFFF;
					Static242.anIntArray373[local161] = local216;
					if (Static199.aClass4_Sub1_Sub17Array2[local161] != null) {
						local142 |= Static199.aClass4_Sub1_Sub17Array2[local161].method5227(local216);
						local140 |= Static199.aClass4_Sub1_Sub17Array2[local161].method5223(local216);
						local144 |= Static199.aClass4_Sub1_Sub17Array2[local161].method5221(local216);
					}
					if ((local179.aBoolean247 || Static198.aBoolean245) && local198 != -1 && local179.anIntArray306.length > local198) {
						Static139.anIntArray243[local161] = local179.anIntArray308[local193];
						Static348.anIntArray498[local161] = arg14[local161].anInt302;
						@Pc(307) int local307 = local179.anIntArray306[local198];
						Static280.aClass4_Sub1_Sub17Array4[local161] = arg7.method2403(local307 >>> 16);
						@Pc(320) int local320 = local307 & 0xFFFF;
						Static50.anIntArray78[local161] = local320;
						if (Static280.aClass4_Sub1_Sub17Array4[local161] != null) {
							local142 |= Static280.aClass4_Sub1_Sub17Array4[local161].method5227(local320);
							local140 |= Static280.aClass4_Sub1_Sub17Array4[local161].method5223(local320);
							local144 |= Static280.aClass4_Sub1_Sub17Array4[local161].method5221(local320);
						}
					} else {
						Static139.anIntArray243[local161] = 0;
						Static348.anIntArray498[local161] = 0;
						Static280.aClass4_Sub1_Sub17Array4[local161] = null;
						Static50.anIntArray78[local161] = -1;
					}
				}
			}
		}
		@Pc(365) int local365 = -1;
		local193 = -1;
		local198 = 0;
		@Pc(371) Class4_Sub1_Sub17 local371 = null;
		@Pc(373) Class4_Sub1_Sub17 local373 = null;
		@Pc(375) int local375 = -1;
		@Pc(377) int local377 = -1;
		@Pc(379) int local379 = 0;
		@Pc(381) Class4_Sub1_Sub17 local381 = null;
		@Pc(383) Class4_Sub1_Sub17 local383 = null;
		if (local152) {
			@Pc(396) int local396;
			@Pc(462) int local462;
			if (arg0 != null) {
				local365 = arg0.anIntArray306[arg8];
				local396 = local365 >>> 16;
				local371 = arg7.method2403(local396);
				local365 &= 0xFFFF;
				if (local371 != null) {
					local142 |= local371.method5227(local365);
					local140 |= local371.method5223(local365);
					local144 |= local371.method5221(local365);
				}
				if ((arg0.aBoolean247 || Static198.aBoolean245) && arg15 != -1 && arg0.anIntArray306.length > arg15) {
					local198 = arg0.anIntArray308[arg8];
					local193 = arg0.anIntArray306[arg15];
					local462 = local193 >>> 16;
					local373 = local396 == local462 ? local371 : arg7.method2403(local462);
					local193 &= 0xFFFF;
					if (local373 != null) {
						local142 |= local373.method5227(local193);
						local140 |= local373.method5223(local193);
						local144 |= local373.method5221(local193);
					}
				}
			}
			local33 = arg10 | 0x20;
			if (arg13 != null) {
				local375 = arg13.anIntArray306[arg6];
				local396 = local375 >>> 16;
				local381 = arg7.method2403(local396);
				local375 &= 0xFFFF;
				if (local381 != null) {
					local142 |= local381.method5227(local375);
					local140 |= local381.method5223(local375);
					local144 |= local381.method5221(local375);
				}
				if ((arg13.aBoolean247 || Static198.aBoolean245) && arg4 != -1 && arg13.anIntArray306.length > arg4) {
					local377 = arg13.anIntArray306[arg4];
					local379 = arg13.anIntArray308[arg6];
					local462 = local377 >>> 16;
					local383 = local462 == local396 ? local381 : arg7.method2403(local462);
					local377 &= 0xFFFF;
					if (local383 != null) {
						local142 |= local383.method5227(local377);
						local140 |= local383.method5223(local377);
						local144 |= local383.method5221(local377);
					}
				}
			}
			if (local142) {
				local33 |= 0x80;
			}
			if (local140) {
				local33 |= 0x100;
			}
			if (local144) {
				local33 |= 0x400;
			}
		}
		@Pc(641) Class83 local641 = Static199.aClass83_5;
		@Pc(649) Class57 local649;
		synchronized (Static199.aClass83_5) {
			local649 = (Class57) Static199.aClass83_5.method2338(local36);
		}
		@Pc(657) Class231 local657 = null;
		if (this.anInt2865 != -1) {
			local657 = arg3.method5135(this.anInt2865);
		}
		@Pc(697) int local697;
		@Pc(703) int local703;
		if (local649 == null || arg2.method2065(local649.ma(), local33) != 0 || local657 != null && local657.anIntArrayArray45 != null && this.anIntArrayArray22 == null) {
			if (local649 != null) {
				local33 = arg2.method2102(local33, local649.ma());
			}
			@Pc(695) boolean local695 = false;
			local697 = 0;
			while (true) {
				if (local697 >= 12) {
					if (local695) {
						if (this.aLong89 != -1L) {
							@Pc(1342) Class83 local1342 = Static199.aClass83_5;
							synchronized (Static199.aClass83_5) {
								local649 = (Class57) Static199.aClass83_5.method2338(this.aLong89);
							}
						}
						if (local649 == null || arg2.method2065(local649.ma(), local33) != 0 || local657 != null && local657.anIntArrayArray45 != null && this.anIntArrayArray22 == null) {
							return null;
						}
					} else {
						@Pc(749) Class37[] local749 = new Class37[12];
						@Pc(757) int local757;
						for (@Pc(751) int local751 = 0; local751 < 12; local751++) {
							local757 = local39[local751];
							@Pc(780) Class37 local780;
							if ((local757 & 0x40000000) != 0) {
								local780 = arg16.method4650(local757 & 0x3FFFFFFF).method6268(this.aBoolean187);
								if (local780 != null) {
									local749[local751] = local780;
								}
							} else if ((Integer.MIN_VALUE & local757) != 0) {
								local780 = arg5.method3430(local757 & 0x3FFFFFFF).method3069();
								if (local780 != null) {
									local749[local751] = local780;
								}
							}
						}
						@Pc(838) int local838;
						if (local657 != null && local657.anIntArrayArray45 != null) {
							for (local757 = 0; local757 < local657.anIntArrayArray45.length; local757++) {
								if (local657.anIntArrayArray45[local757] != null && local749[local757] != null) {
									local838 = local657.anIntArrayArray45[local757][0];
									@Pc(845) int local845 = local657.anIntArrayArray45[local757][1];
									@Pc(852) int local852 = local657.anIntArrayArray45[local757][2];
									@Pc(861) int local861 = local657.anIntArrayArray45[local757][3] << 3;
									@Pc(870) int local870 = local657.anIntArrayArray45[local757][4] << 3;
									@Pc(879) int local879 = local657.anIntArrayArray45[local757][5] << 3;
									if (this.anIntArrayArray22 == null) {
										this.anIntArrayArray22 = new int[local657.anIntArrayArray45.length][];
									}
									if (this.anIntArrayArray22[local757] == null) {
										@Pc(901) int[] local901 = this.anIntArrayArray22[local757] = new int[15];
										if (local861 == 0 && local870 == 0 && local879 == 0) {
											local901[13] = -local845;
											local901[0] = local901[4] = local901[8] = 32768;
											local901[14] = -local852;
											local901[12] = -local838;
										} else {
											@Pc(920) int local920 = Class4_Sub13.anIntArray496[local861];
											@Pc(924) int local924 = Class4_Sub13.anIntArray497[local861];
											@Pc(928) int local928 = Class4_Sub13.anIntArray496[local870];
											@Pc(932) int local932 = Class4_Sub13.anIntArray497[local870];
											@Pc(936) int local936 = Class4_Sub13.anIntArray496[local879];
											@Pc(940) int local940 = Class4_Sub13.anIntArray497[local879];
											@Pc(948) int local948 = local936 * local924 + 16384 >> 15;
											@Pc(956) int local956 = local924 * local940 + 16384 >> 15;
											local901[3] = local920 * local940 + 16384 >> 15;
											local901[8] = local920 * local928 + 16384 >> 15;
											local901[2] = local920 * local932 + 16384 >> 15;
											local901[0] = local956 * local932 + local936 * local928 + 16384 >> 15;
											local901[4] = local920 * local936 + 16384 >> 15;
											local901[6] = local956 * local928 + local936 * -local932 + 16384 >> 15;
											local901[7] = -local932 * -local940 + local928 * local948 + 16384 >> 15;
											local901[1] = local932 * local948 + -local940 * local928 + 16384 >> 15;
											local901[5] = -local924;
											local901[14] = local901[2] * -local838 + local901[5] * -local845 + -local852 * local901[8] + 16384 >> 15;
											local901[13] = -local845 * local901[4] + -local838 * local901[1] + local901[7] * -local852 + 16384 >> 15;
											local901[12] = -local845 * local901[3] + -local838 * local901[0] + local901[6] * -local852 + 16384 >> 15;
										}
										local901[10] = local845;
										local901[11] = local852;
										local901[9] = local838;
									}
									if (local861 != 0 || local870 != 0 || local879 != 0) {
										local749[local757].method1002(local879, local861, local870);
									}
									if (local838 != 0 || local845 != 0 || local852 != 0) {
										local749[local757].method1008(local845, local852, local838);
									}
								}
							}
						}
						@Pc(1240) Class37 local1240 = new Class37(local749, local749.length);
						@Pc(1244) int local1244 = local33 | 0x4000;
						local649 = arg2.method2036(local1240, local1244, Static452.anInt7756, 64, 850);
						for (local838 = 0; local838 < 5; local838++) {
							if (this.anIntArray242[local838] < Static220.aShortArrayArray5[local838].length) {
								local649.i(Static117.aShortArray77[local838], Static220.aShortArrayArray5[local838][this.anIntArray242[local838]]);
							}
							if (Static160.aShortArrayArray3[local838].length > this.anIntArray242[local838]) {
								local649.i(Static411.aShortArray101[local838], Static160.aShortArrayArray3[local838][this.anIntArray242[local838]]);
							}
						}
						local649.B(local33);
						@Pc(1315) Class83 local1315 = Static199.aClass83_5;
						synchronized (Static199.aClass83_5) {
							Static199.aClass83_5.method2337(local649, local36);
						}
						this.aLong89 = local36;
					}
					break;
				}
				local703 = local39[local697];
				if ((local703 & 0x40000000) == 0) {
					if ((local703 & Integer.MIN_VALUE) != 0 && !arg5.method3430(local703 & 0x3FFFFFFF).method3067()) {
						local695 = true;
					}
				} else if (!arg16.method4650(local703 & 0x3FFFFFFF).method6265(this.aBoolean187)) {
					local695 = true;
				}
				local697++;
			}
		}
		@Pc(1384) Class57 local1384 = local649.method6075((byte) 4, local33, true);
		if (!local152) {
			return local1384;
		}
		@Pc(1390) int local1390 = 0;
		local697 = 1;
		while (local1390 < local159) {
			if (Static199.aClass4_Sub1_Sub17Array2[local1390] != null) {
				local1384.method6085(Static199.aClass4_Sub1_Sub17Array2[local1390], local697, Static348.anIntArray498[local1390] - 1, false, Static242.anIntArray373[local1390], this.anIntArrayArray22 == null ? null : this.anIntArrayArray22[local1390], Static139.anIntArray243[local1390], Static50.anIntArray78[local1390], Static280.aClass4_Sub1_Sub17Array4[local1390]);
			}
			local697 <<= 0x1;
			local1390++;
		}
		if (local371 != null && local381 != null) {
			local1384.method6086(local383, arg0.aBooleanArray76, local381, local373, arg11 - 1, local365, local375, local377, local198, local193, local379, local371, arg1 - 1, false);
		} else if (local371 != null) {
			local1384.method6077(local193, 0, local198, arg11 - 1, local371, false, local373, local365);
		} else if (local381 != null) {
			local1384.method6077(local377, 0, local379, arg1 - 1, local381, false, local383, local375);
		}
		for (local703 = 0; local703 < local159; local703++) {
			Static199.aClass4_Sub1_Sub17Array2[local703] = null;
			Static280.aClass4_Sub1_Sub17Array4[local703] = null;
			Static278.aClass130Array1[local703] = null;
		}
		return local1384;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!pa;IILclient!ts;Lclient!jc;Lclient!jr;Lclient!qa;IIILclient!kg;Lclient!gj;)Lclient!ka;")
	public Class57 method2564(@OriginalArg(0) Class193 arg0, @OriginalArg(3) Class247 arg1, @OriginalArg(4) Interface2 arg2, @OriginalArg(5) Class126 arg3, @OriginalArg(6) Class30 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class130 arg8, @OriginalArg(11) Class85 arg9) {
		if (this.anInt2861 != -1) {
			return arg1.method5660(this.anInt2861).method5598(arg5, arg6, arg4, arg7, arg2, arg9, arg8);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(48) int local48;
		@Pc(117) int local117;
		@Pc(58) int local58;
		if (arg8 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local48 = arg8.anIntArray306[arg7];
			local27 = 2080;
			local58 = local48 >>> 16;
			@Pc(63) Class4_Sub1_Sub17 local63 = arg9.method2403(local58);
			@Pc(67) int local67 = local48 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method5227(local67) | false;
				local31 = local63.method5223(local67) | false;
				local37 = local63.method5221(local67) | false;
				local35 = arg8.aBoolean246 | false;
			}
			if ((arg8.aBoolean247 || Static198.aBoolean245) && arg5 != -1 && arg5 < arg8.anIntArray306.length) {
				local117 = arg8.anIntArray306[arg5];
				@Pc(121) int local121 = local117 >>> 16;
				@Pc(131) Class4_Sub1_Sub17 local131 = local58 == local121 ? local63 : arg9.method2403(local121);
				@Pc(135) int local135 = local117 & 0xFFFF;
				if (local131 != null) {
					local33 |= local131.method5227(local135);
					local31 |= local131.method5223(local135);
					local37 |= local131.method5221(local135);
				}
			}
			if (local33) {
				local27 = 2208;
			}
			if (local31) {
				local27 |= 0x100;
			}
			if (local35) {
				local27 |= 0x200;
			}
			if (local37) {
				local27 |= 0x400;
			}
		}
		@Pc(186) Class83 local186 = Static164.aClass83_24;
		@Pc(195) Class57 local195;
		synchronized (Static164.aClass83_24) {
			local195 = (Class57) Static164.aClass83_24.method2338(this.aLong90);
		}
		if (local195 == null || arg4.method2065(local195.ma(), local27) != 0) {
			if (local195 != null) {
				local27 = arg4.method2102(local27, local195.ma());
			}
			local35 = false;
			for (@Pc(232) int local232 = 0; local232 < 12; local232++) {
				local48 = this.anIntArray241[local232];
				if ((local48 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local48) != 0 && !arg3.method3430(local48 & 0x3FFFFFFF).method3068()) {
						local35 = true;
					}
				} else if (!arg0.method4650(local48 & 0x3FFFFFFF).method6266(this.aBoolean187)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(291) Class37[] local291 = new Class37[12];
			local117 = 0;
			for (@Pc(295) int local295 = 0; local295 < 12; local295++) {
				@Pc(302) int local302 = this.anIntArray241[local295];
				@Pc(321) Class37 local321;
				if ((local302 & 0x40000000) != 0) {
					local321 = arg0.method4650(local302 & 0x3FFFFFFF).method6254(this.aBoolean187);
					if (local321 != null) {
						local291[local117++] = local321;
					}
				} else if ((local302 & Integer.MIN_VALUE) != 0) {
					local321 = arg3.method3430(local302 & 0x3FFFFFFF).method3071();
					if (local321 != null) {
						local291[local117++] = local321;
					}
				}
			}
			@Pc(356) int local356 = local27 | 0x4000;
			@Pc(362) Class37 local362 = new Class37(local291, local117);
			local195 = arg4.method2036(local362, local356, Static452.anInt7756, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (Static220.aShortArrayArray5[local58].length > this.anIntArray242[local58]) {
					local195.i(Static117.aShortArray77[local58], Static220.aShortArrayArray5[local58][this.anIntArray242[local58]]);
				}
				if (this.anIntArray242[local58] < Static160.aShortArrayArray3[local58].length) {
					local195.i(Static411.aShortArray101[local58], Static160.aShortArrayArray3[local58][this.anIntArray242[local58]]);
				}
			}
			local195.B(local27);
			@Pc(427) Class83 local427 = Static164.aClass83_24;
			synchronized (Static164.aClass83_24) {
				Static164.aClass83_24.method2337(local195, this.aLong90);
			}
		}
		if (arg8 == null) {
			return local195;
		} else {
			local195.method6075((byte) 4, local27, true);
			return arg8.method3534(local195, 2048, arg7, arg6, arg5);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!jr;IIB)V")
	public void method2566(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = Static117.anIntArray380[arg1];
		if (this.anIntArray241[local12] != 0 && arg0.method3430(arg2) != null) {
			this.anIntArray241[local12] = arg2 | Integer.MIN_VALUE;
			this.method2571();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!qa;IBLclient!gj;ILclient!kg;ILclient!jr;III)Lclient!ka;")
	public Class57 method2567(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class85 arg3, @OriginalArg(6) Class130 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class126 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(101) int local101;
		if (arg4 != null) {
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			@Pc(24) boolean local24 = false;
			@Pc(37) int local37 = arg4.anIntArray306[arg5];
			local7 = 2080;
			@Pc(45) int local45 = local37 >>> 16;
			@Pc(49) int local49 = local37 & 0xFFFF;
			@Pc(54) Class4_Sub1_Sub17 local54 = arg3.method2403(local45);
			if (local54 != null) {
				local20 = local54.method5227(local49) | false;
				local18 = local54.method5223(local49) | false;
				local24 = local54.method5221(local49) | false;
				local22 = arg4.aBoolean246 | false;
			}
			if ((arg4.aBoolean247 || Static198.aBoolean245) && arg2 != -1 && arg4.anIntArray306.length > arg2) {
				local101 = arg4.anIntArray306[arg2];
				@Pc(105) int local105 = local101 >>> 16;
				@Pc(109) int local109 = local101 & 0xFFFF;
				@Pc(119) Class4_Sub1_Sub17 local119;
				if (local105 == local45) {
					local119 = local54;
				} else {
					local119 = arg3.method2403(local109 >>> 16);
				}
				if (local119 != null) {
					local20 |= local119.method5227(local109);
					local18 |= local119.method5223(local109);
					local24 |= local119.method5221(local109);
				}
			}
			if (local20) {
				local7 = 2208;
			}
			if (local18) {
				local7 |= 0x100;
			}
			if (local22) {
				local7 |= 0x200;
			}
			if (local24) {
				local7 |= 0x400;
			}
		}
		@Pc(182) long local182 = (long) arg9 | (long) (arg0 << 16) | (long) arg8 << 32;
		@Pc(184) Class83 local184 = Static164.aClass83_24;
		@Pc(192) Class57 local192;
		synchronized (Static164.aClass83_24) {
			local192 = (Class57) Static164.aClass83_24.method2338(local182);
		}
		if (local192 == null || arg1.method2065(local192.ma(), local7) != 0) {
			if (local192 != null) {
				local7 = arg1.method2102(local7, local192.ma());
			}
			@Pc(219) Class37[] local219 = new Class37[3];
			local101 = 0;
			if (!arg6.method3430(arg9).method3068() || !arg6.method3430(arg0).method3068() || !arg6.method3430(arg8).method3068()) {
				return null;
			}
			@Pc(251) Class37 local251 = arg6.method3430(arg9).method3071();
			if (local251 != null) {
				local101++;
				local219[0] = local251;
			}
			local251 = arg6.method3430(arg0).method3071();
			if (local251 != null) {
				local219[local101++] = local251;
			}
			local251 = arg6.method3430(arg8).method3071();
			if (local251 != null) {
				local219[local101++] = local251;
			}
			local251 = new Class37(local219, local101);
			@Pc(296) int local296 = local7 | 0x4000;
			local192 = arg1.method2036(local251, local296, Static452.anInt7756, 64, 768);
			for (@Pc(306) int local306 = 0; local306 < 5; local306++) {
				if (this.anIntArray242[local306] < Static220.aShortArrayArray5[local306].length) {
					local192.i(Static117.aShortArray77[local306], Static220.aShortArrayArray5[local306][this.anIntArray242[local306]]);
				}
				if (Static160.aShortArrayArray3[local306].length > this.anIntArray242[local306]) {
					local192.i(Static411.aShortArray101[local306], Static160.aShortArrayArray3[local306][this.anIntArray242[local306]]);
				}
			}
			local192.B(local7);
			@Pc(365) Class83 local365 = Static164.aClass83_24;
			synchronized (Static164.aClass83_24) {
				Static164.aClass83_24.method2337(local192, local182);
			}
		}
		if (arg4 == null) {
			return local192;
		} else {
			local192 = local192.method6075((byte) 4, local7, true);
			return arg4.method3534(local192, 2048, arg5, arg7, arg2);
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZI)V")
	public void method2568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray242[arg1] = arg0;
		this.method2571();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BZ)V")
	public void method2570(@OriginalArg(1) boolean arg0) {
		this.aBoolean187 = arg0;
		this.method2571();
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V")
	private void method2571() {
		this.aLong90 = -1L;
		@Pc(15) long[] local15 = Class150.aLongArray5;
		this.aLong90 = this.aLong90 >>> 8 ^ local15[(int) ((this.aLong90 ^ (long) (this.anInt2865 >> 8)) & 0xFFL)];
		this.aLong90 = local15[(int) ((this.aLong90 ^ (long) this.anInt2865) & 0xFFL)] ^ this.aLong90 >>> 8;
		for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
			this.aLong90 = local15[(int) ((this.aLong90 ^ (long) (this.anIntArray241[local55] >> 24)) & 0xFFL)] ^ this.aLong90 >>> 8;
			this.aLong90 = this.aLong90 >>> 8 ^ local15[(int) (((long) (this.anIntArray241[local55] >> 16) ^ this.aLong90) & 0xFFL)];
			this.aLong90 = this.aLong90 >>> 8 ^ local15[(int) (((long) (this.anIntArray241[local55] >> 8) ^ this.aLong90) & 0xFFL)];
			this.aLong90 = local15[(int) (((long) this.anIntArray241[local55] ^ this.aLong90) & 0xFFL)] ^ this.aLong90 >>> 8;
		}
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			this.aLong90 = local15[(int) (((long) this.anIntArray242[local149] ^ this.aLong90) & 0xFFL)] ^ this.aLong90 >>> 8;
		}
		this.aLong90 = this.aLong90 >>> 8 ^ local15[(int) (((long) (this.aBoolean187 ? 1 : 0) ^ this.aLong90) & 0xFFL)];
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II[IB[IZ)V")
	public void method2572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		if (this.anInt2865 != arg1) {
			this.anIntArrayArray22 = null;
			this.anInt2865 = arg1;
		}
		this.aBoolean187 = arg4;
		this.anIntArray241 = arg2;
		this.anIntArray242 = arg3;
		this.anInt2861 = arg0;
		this.method2571();
	}
}
