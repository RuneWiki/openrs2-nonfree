import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class136 {

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
	private int anInt3725;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "Z")
	public boolean aBoolean283;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "[I")
	public int[] anIntArray351;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "[I")
	private int[] anIntArray352;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	public int anInt3717 = -1;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!ii;IILclient!rj;IIZ[Lclient!mc;ILclient!rj;III)Lclient!dc;")
	public Class40 method3145(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class138[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class177 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		if (this.anInt3717 != -1) {
			return Static68.method1219(this.anInt3717).method1271(arg2, arg1, arg0, arg3, arg8, arg5, arg6, arg9, arg4, arg10, arg7);
		}
		@Pc(29) int local29 = arg4;
		@Pc(32) long local32 = this.aLong100;
		@Pc(35) int[] local35 = this.anIntArray352;
		if (arg7 != null && (arg7.anInt5415 >= 0 || arg7.anInt5419 >= 0)) {
			local35 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local35[local51] = this.anIntArray352[local51];
			}
			if (arg7.anInt5415 >= 0) {
				if (arg7.anInt5415 == 65535) {
					local32 ^= 0xFFFFFFFF00000000L;
					local35[5] = 0;
				} else {
					local35[5] = arg7.anInt5415 | 0x40000000;
					local32 ^= (long) local35[5] << 32;
				}
			}
			if (arg7.anInt5419 >= 0) {
				if (arg7.anInt5419 == 65535) {
					local32 ^= 0xFFFFFFFFL;
					local35[3] = 0;
				} else {
					local35[3] = arg7.anInt5419 | 0x40000000;
					local32 ^= local35[3];
				}
			}
		}
		@Pc(135) boolean local135 = false;
		@Pc(137) boolean local137 = false;
		@Pc(145) boolean local145 = arg7 != null || arg2 != null;
		@Pc(152) int local152 = arg5 == null ? 0 : arg5.length;
		@Pc(185) int local185;
		@Pc(190) int local190;
		for (@Pc(154) int local154 = 0; local154 < local152; local154++) {
			Static347.aClass1_Sub2_Sub13Array4[local154] = null;
			if (arg5[local154] != null) {
				@Pc(171) Class177 local171 = Static354.method5863(arg5[local154].anInt3779);
				if (local171.anIntArray529 != null) {
					local145 = true;
					Static212.aClass177Array1[local154] = local171;
					local185 = arg5[local154].anInt3778;
					local190 = arg5[local154].anInt3777;
					@Pc(195) int local195 = local171.anIntArray529[local185];
					Static347.aClass1_Sub2_Sub13Array4[local154] = Static327.method5522(local195 >>> 16);
					@Pc(207) int local207 = local195 & 0xFFFF;
					Static267.anIntArray536[local154] = local207;
					if (Static347.aClass1_Sub2_Sub13Array4[local154] != null) {
						local137 |= Static347.aClass1_Sub2_Sub13Array4[local154].method4655(local207);
						local135 |= Static347.aClass1_Sub2_Sub13Array4[local154].method4656(local207);
					}
					if ((local171.aBoolean450 || Static221.aBoolean374) && local190 != -1 && local171.anIntArray529.length > local190) {
						Static301.anIntArray578[local154] = local171.anIntArray528[local185];
						Static98.anIntArray163[local154] = arg5[local154].anInt3771;
						@Pc(287) int local287 = local171.anIntArray529[local190];
						Static211.aClass1_Sub2_Sub13Array3[local154] = Static327.method5522(local287 >>> 16);
						@Pc(299) int local299 = local287 & 0xFFFF;
						Static85.anIntArray128[local154] = local299;
						if (Static211.aClass1_Sub2_Sub13Array3[local154] != null) {
							local137 |= Static211.aClass1_Sub2_Sub13Array3[local154].method4655(local299);
							local135 |= Static211.aClass1_Sub2_Sub13Array3[local154].method4656(local299);
						}
					} else {
						Static301.anIntArray578[local154] = 0;
						Static98.anIntArray163[local154] = 0;
						Static211.aClass1_Sub2_Sub13Array3[local154] = null;
						Static85.anIntArray128[local154] = -1;
					}
				}
			}
		}
		@Pc(335) int local335 = -1;
		local185 = -1;
		local190 = 0;
		@Pc(341) Class1_Sub2_Sub13 local341 = null;
		@Pc(351) Class1_Sub2_Sub13 local351 = null;
		@Pc(353) int local353 = -1;
		@Pc(355) int local355 = -1;
		@Pc(357) int local357 = 0;
		@Pc(359) Class1_Sub2_Sub13 local359 = null;
		@Pc(361) Class1_Sub2_Sub13 local361 = null;
		if (local145) {
			@Pc(374) int local374;
			@Pc(429) int local429;
			if (arg7 != null) {
				local335 = arg7.anIntArray529[arg3];
				local374 = local335 >>> 16;
				local341 = Static327.method5522(local374);
				local335 &= 0xFFFF;
				if (local341 != null) {
					local137 |= local341.method4655(local335);
					local135 |= local341.method4656(local335);
				}
				if ((arg7.aBoolean450 || Static221.aBoolean374) && arg10 != -1 && arg10 < arg7.anIntArray529.length) {
					local185 = arg7.anIntArray529[arg10];
					local190 = arg7.anIntArray528[arg3];
					local429 = local185 >>> 16;
					local185 &= 0xFFFF;
					if (local429 == local374) {
						local351 = local341;
					} else {
						local351 = Static327.method5522(local185 >>> 16);
					}
					if (local351 != null) {
						local137 |= local351.method4655(local185);
						local135 |= local351.method4656(local185);
					}
				}
			}
			local29 = arg4 | 0x20;
			if (arg2 != null) {
				local353 = arg2.anIntArray529[arg9];
				local374 = local353 >>> 16;
				local359 = Static327.method5522(local374);
				local353 &= 0xFFFF;
				if (local359 != null) {
					local137 |= local359.method4655(local353);
					local135 |= local359.method4656(local353);
				}
				if ((arg2.aBoolean450 || Static221.aBoolean374) && arg8 != -1 && arg8 < arg2.anIntArray529.length) {
					local355 = arg2.anIntArray529[arg8];
					local357 = arg2.anIntArray528[arg9];
					local429 = local355 >>> 16;
					local355 &= 0xFFFF;
					if (local374 == local429) {
						local361 = local359;
					} else {
						local361 = Static327.method5522(local355 >>> 16);
					}
					if (local361 != null) {
						local137 |= local361.method4655(local355);
						local135 |= local361.method4656(local355);
					}
				}
			}
			if (local137) {
				local29 |= 0x80;
			}
			if (local135) {
				local29 |= 0x100;
			}
		}
		@Pc(578) Class37 local578 = Static50.aClass37_24;
		@Pc(586) Class40 local586;
		synchronized (Static50.aClass37_24) {
			local586 = (Class40) Static50.aClass37_24.method915(local32);
		}
		@Pc(594) Class118 local594 = null;
		if (this.anInt3725 != -1) {
			local594 = Static30.method504(this.anInt3725);
		}
		@Pc(636) int local636;
		@Pc(642) int local642;
		if (local586 == null || arg0.method4223(local586.method4602(), local29) != 0 || local594 != null && local594.anIntArrayArray26 != null && this.anIntArrayArray32 == null) {
			if (local586 != null) {
				local29 = arg0.method4214(local29, local586.method4602());
			}
			@Pc(634) boolean local634 = false;
			local636 = 0;
			while (true) {
				if (local636 >= 12) {
					if (local634) {
						if (this.aLong101 != -1L) {
							@Pc(691) Class37 local691 = Static50.aClass37_24;
							synchronized (Static50.aClass37_24) {
								local586 = (Class40) Static50.aClass37_24.method915(this.aLong101);
							}
						}
						if (local586 == null || arg0.method4223(local586.method4602(), local29) != 0 || local594 != null && local594.anIntArrayArray26 != null && this.anIntArrayArray32 == null) {
							return null;
						}
					} else {
						@Pc(730) Class219[] local730 = new Class219[12];
						@Pc(738) int local738;
						for (@Pc(732) int local732 = 0; local732 < 12; local732++) {
							local738 = local35[local732];
							@Pc(755) Class219 local755;
							if ((local738 & 0x40000000) != 0) {
								local755 = Static348.method5333(local738 & 0x3FFFFFFF).method1981(this.aBoolean283);
								if (local755 != null) {
									local730[local732] = local755;
								}
							} else if ((Integer.MIN_VALUE & local738) != 0) {
								local755 = Static191.method3370(local738 & 0x3FFFFFFF).method1703();
								if (local755 != null) {
									local730[local732] = local755;
								}
							}
						}
						@Pc(815) int local815;
						if (local594 != null && local594.anIntArrayArray26 != null) {
							for (local738 = 0; local738 < local594.anIntArrayArray26.length; local738++) {
								if (local594.anIntArrayArray26[local738] != null && local730[local738] != null) {
									local815 = local594.anIntArrayArray26[local738][0];
									@Pc(822) int local822 = local594.anIntArrayArray26[local738][1];
									@Pc(829) int local829 = local594.anIntArrayArray26[local738][2];
									@Pc(838) int local838 = local594.anIntArrayArray26[local738][3] << 3;
									@Pc(847) int local847 = local594.anIntArrayArray26[local738][4] << 3;
									@Pc(856) int local856 = local594.anIntArrayArray26[local738][5] << 3;
									if (this.anIntArrayArray32 == null) {
										this.anIntArrayArray32 = new int[local594.anIntArrayArray26.length][];
									}
									if (this.anIntArrayArray32[local738] == null) {
										@Pc(878) int[] local878 = this.anIntArrayArray32[local738] = new int[15];
										if (local838 == 0 && local847 == 0 && local856 == 0) {
											local878[12] = -local815;
											local878[0] = local878[4] = local878[8] = 32768;
											local878[14] = -local829;
											local878[13] = -local822;
										} else {
											@Pc(888) int local888 = Class1_Sub5_Sub15.anIntArray333[local838];
											@Pc(892) int local892 = Class1_Sub5_Sub15.anIntArray335[local838];
											@Pc(896) int local896 = Class1_Sub5_Sub15.anIntArray333[local847];
											@Pc(900) int local900 = Class1_Sub5_Sub15.anIntArray335[local847];
											@Pc(904) int local904 = Class1_Sub5_Sub15.anIntArray333[local856];
											@Pc(908) int local908 = Class1_Sub5_Sub15.anIntArray335[local856];
											@Pc(916) int local916 = local892 * local904 + 16384 >> 15;
											@Pc(924) int local924 = local908 * local892 + 16384 >> 15;
											local878[4] = local888 * local904 + 16384 >> 15;
											local878[7] = -local908 * -local900 + local896 * local916 + 16384 >> 15;
											local878[8] = local896 * local888 + 16384 >> 15;
											local878[0] = local904 * local896 + local900 * local924 + 16384 >> 15;
											local878[3] = local888 * local908 + 16384 >> 15;
											local878[5] = -local892;
											local878[1] = local916 * local900 + -local908 * local896 + 16384 >> 15;
											local878[2] = local900 * local888 + 16384 >> 15;
											local878[6] = local904 * -local900 + local924 * local896 + 16384 >> 15;
											local878[13] = local878[4] * -local822 + -local815 * local878[1] + local878[7] * -local829 + 16384 >> 15;
											local878[14] = -local815 * local878[2] + -local822 * local878[5] + -local829 * local878[8] + 16384 >> 15;
											local878[12] = -local829 * local878[6] + -local815 * local878[0] + -local822 * local878[3] + 16384 >> 15;
										}
										local878[9] = local815;
										local878[11] = local829;
										local878[10] = local822;
									}
									if (local838 != 0 || local847 != 0 || local856 != 0) {
										local730[local738].method5845(local856, local847, local838);
									}
									if (local815 != 0 || local822 != 0 || local829 != 0) {
										local730[local738].method5854(local829, local815, local822);
									}
								}
							}
						}
						@Pc(1208) Class219 local1208 = new Class219(local730, local730.length);
						@Pc(1212) int local1212 = local29 | 0x2000;
						local586 = arg0.method4301(local1208, local1212, Static295.anInt5948, 64, 850);
						for (local815 = 0; local815 < 5; local815++) {
							if (this.anIntArray351[local815] < Static259.aShortArrayArray11[local815].length) {
								local586.method4579(Static325.aShortArray47[local815], Static259.aShortArrayArray11[local815][this.anIntArray351[local815]]);
							}
							if (Static262.aShortArrayArray5[local815].length > this.anIntArray351[local815]) {
								local586.method4579(Static238.aShortArray66[local815], Static262.aShortArrayArray5[local815][this.anIntArray351[local815]]);
							}
						}
						local586.method4601(local29);
						@Pc(1287) Class37 local1287 = Static50.aClass37_24;
						synchronized (Static50.aClass37_24) {
							Static50.aClass37_24.method922(local32, local586);
						}
						this.aLong101 = local32;
					}
					break;
				}
				local642 = local35[local636];
				if ((local642 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local642) != 0 && !Static191.method3370(local642 & 0x3FFFFFFF).method1709()) {
						local634 = true;
					}
				} else if (!Static348.method5333(local642 & 0x3FFFFFFF).method1992(this.aBoolean283)) {
					local634 = true;
				}
				local636++;
			}
		}
		@Pc(1309) Class40 local1309 = local586.method4599((byte) 1, local29, true);
		if (!local145) {
			return local1309;
		}
		@Pc(1315) int local1315 = 0;
		local636 = 1;
		while (local1315 < local152) {
			if (Static347.aClass1_Sub2_Sub13Array4[local1315] != null) {
				local1309.method4575(this.anIntArrayArray32 == null ? null : this.anIntArrayArray32[local1315], Static347.aClass1_Sub2_Sub13Array4[local1315], local636, Static85.anIntArray128[local1315], Static301.anIntArray578[local1315], Static267.anIntArray536[local1315], Static98.anIntArray163[local1315] - 1, Static211.aClass1_Sub2_Sub13Array3[local1315], false);
			}
			local636 <<= 0x1;
			local1315++;
		}
		if (local341 != null && local359 != null) {
			local1309.method4584(arg7.aBooleanArray23, arg6 - 1, local361, local355, arg1 - 1, local341, local335, local353, local190, local185, local359, local357, local351, false);
		} else if (local341 != null) {
			local1309.method4596(local335, local190, local351, arg6 - 1, local185, 0, local341, false);
		} else if (local359 != null) {
			local1309.method4596(local353, local357, local361, arg1 - 1, local355, 0, local359, false);
		}
		for (local642 = 0; local642 < local152; local642++) {
			Static347.aClass1_Sub2_Sub13Array4[local642] = null;
			Static211.aClass1_Sub2_Sub13Array3[local642] = null;
			Static212.aClass177Array1[local642] = null;
		}
		return local1309;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!rj;IIIIIIILclient!ii;I)Lclient!dc;")
	public Class40 method3148(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(8) Class105 arg6, @OriginalArg(9) int arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(32) int local32;
		@Pc(36) int local36;
		if (arg0 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local32 = arg0.anIntArray529[arg3];
			local36 = local32 >>> 16;
			@Pc(42) Class1_Sub2_Sub13 local42 = Static327.method5522(local36);
			@Pc(46) int local46 = local32 & 0xFFFF;
			if (local42 != null) {
				local13 = local42.method4655(local46) | false;
				local11 = local42.method4656(local46) | false;
				local15 = arg0.aBoolean451 | false;
			}
			if ((arg0.aBoolean450 || Static221.aBoolean374) && arg7 != -1 && arg7 < arg0.anIntArray529.length) {
				@Pc(89) int local89 = arg0.anIntArray529[arg7];
				@Pc(93) int local93 = local89 >>> 16;
				@Pc(97) int local97 = local89 & 0xFFFF;
				@Pc(108) Class1_Sub2_Sub13 local108;
				if (local93 == local36) {
					local108 = local42;
				} else {
					local108 = Static327.method5522(local97 >>> 16);
				}
				if (local108 != null) {
					local13 |= local108.method4655(local97);
					local11 |= local108.method4656(local97);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(158) long local158 = (long) arg5 << 32 | (long) (arg1 << 16) | (long) arg4;
		@Pc(160) Class37 local160 = Static203.aClass37_65;
		@Pc(168) Class40 local168;
		synchronized (Static203.aClass37_65) {
			local168 = (Class40) Static203.aClass37_65.method915(local158);
		}
		if (local168 == null || arg6.method4223(local168.method4602(), local7) != 0) {
			if (local168 != null) {
				local7 = arg6.method4214(local7, local168.method4602());
			}
			@Pc(204) Class219[] local204 = new Class219[3];
			@Pc(206) int local206 = 0;
			if (!Static191.method3370(arg4).method1704() || !Static191.method3370(arg1).method1704() || !Static191.method3370(arg5).method1704()) {
				return null;
			}
			@Pc(232) Class219 local232 = Static191.method3370(arg4).method1712();
			if (local232 != null) {
				local206++;
				local204[0] = local232;
			}
			local232 = Static191.method3370(arg1).method1712();
			if (local232 != null) {
				local204[local206++] = local232;
			}
			local232 = Static191.method3370(arg5).method1712();
			if (local232 != null) {
				local204[local206++] = local232;
			}
			local32 = local7 | 0x2000;
			local232 = new Class219(local204, local206);
			local168 = arg6.method4301(local232, local32, Static295.anInt5948, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (this.anIntArray351[local36] < Static259.aShortArrayArray11[local36].length) {
					local168.method4579(Static325.aShortArray47[local36], Static259.aShortArrayArray11[local36][this.anIntArray351[local36]]);
				}
				if (this.anIntArray351[local36] < Static262.aShortArrayArray5[local36].length) {
					local168.method4579(Static238.aShortArray66[local36], Static262.aShortArrayArray5[local36][this.anIntArray351[local36]]);
				}
			}
			local168.method4601(local7);
			@Pc(350) Class37 local350 = Static203.aClass37_65;
			synchronized (Static203.aClass37_65) {
				Static203.aClass37_65.method922(local158, local168);
			}
		}
		if (arg0 == null) {
			return local168;
		} else {
			local168 = local168.method4599((byte) 1, local7, true);
			return arg0.method4746(local168, 1024, arg3, arg2, arg7);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z[I[IIII)V")
	public void method3151(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 != this.anInt3725) {
			this.anIntArrayArray32 = null;
			this.anInt3725 = arg3;
		}
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(34) int local34 = 0; local34 < 8; local34++) {
				for (@Pc(38) int local38 = 0; local38 < Static149.anInt3070; local38++) {
					@Pc(44) Class89 local44 = Static191.method3370(local38);
					if (local44 != null && !local44.aBoolean167 && local44.anInt2046 == (arg0 ? Static80.anIntArray671[local34] : Static274.anIntArray547[local34])) {
						arg2[Static107.anIntArray177[local34]] = local38 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt3717 = arg4;
		this.anIntArray352 = arg2;
		this.aBoolean283 = arg0;
		this.anIntArray351 = arg1;
		this.method3153();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)V")
	public void method3152(@OriginalArg(1) boolean arg0) {
		this.aBoolean283 = arg0;
		this.method3153();
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
	private void method3153() {
		@Pc(7) long[] local7 = Class36.aLongArray3;
		this.aLong100 = -1L;
		this.aLong100 = local7[(int) ((this.aLong100 ^ (long) (this.anInt3725 >> 8)) & 0xFFL)] ^ this.aLong100 >>> 8;
		this.aLong100 = local7[(int) (((long) this.anInt3725 ^ this.aLong100) & 0xFFL)] ^ this.aLong100 >>> 8;
		for (@Pc(69) int local69 = 0; local69 < 12; local69++) {
			this.aLong100 = local7[(int) ((this.aLong100 ^ (long) (this.anIntArray352[local69] >> 24)) & 0xFFL)] ^ this.aLong100 >>> 8;
			this.aLong100 = this.aLong100 >>> 8 ^ local7[(int) (((long) (this.anIntArray352[local69] >> 16) ^ this.aLong100) & 0xFFL)];
			this.aLong100 = this.aLong100 >>> 8 ^ local7[(int) ((this.aLong100 ^ (long) (this.anIntArray352[local69] >> 8)) & 0xFFL)];
			this.aLong100 = this.aLong100 >>> 8 ^ local7[(int) (((long) this.anIntArray352[local69] ^ this.aLong100) & 0xFFL)];
		}
		for (@Pc(163) int local163 = 0; local163 < 5; local163++) {
			this.aLong100 = this.aLong100 >>> 8 ^ local7[(int) (((long) this.anIntArray351[local163] ^ this.aLong100) & 0xFFL)];
		}
		this.aLong100 = this.aLong100 >>> 8 ^ local7[(int) ((this.aLong100 ^ (long) (this.aBoolean283 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)V")
	public void method3154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static107.anIntArray177[arg1];
		if (this.anIntArray352[local7] != 0 && Static191.method3370(arg0) != null) {
			this.anIntArray352[local7] = Integer.MIN_VALUE | arg0;
			this.method3153();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIILclient!ii;ILclient!rj;I)Lclient!dc;")
	public Class40 method3155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class105 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class177 arg4) {
		if (this.anInt3717 != -1) {
			return Static68.method1219(this.anInt3717).method1269(arg3, arg0, arg2, arg1, arg4);
		}
		@Pc(24) int local24 = 1024;
		@Pc(32) boolean local32;
		@Pc(49) int local49;
		@Pc(100) int local100;
		@Pc(53) int local53;
		@Pc(104) int local104;
		if (arg4 != null) {
			@Pc(28) boolean local28 = false;
			@Pc(30) boolean local30 = false;
			local32 = false;
			local24 = 1056;
			local49 = arg4.anIntArray529[arg3];
			local53 = local49 >>> 16;
			@Pc(57) Class1_Sub2_Sub13 local57 = Static327.method5522(local53);
			@Pc(61) int local61 = local49 & 0xFFFF;
			if (local57 != null) {
				local30 = local57.method4655(local61) | false;
				local28 = local57.method4656(local61) | false;
				local32 = arg4.aBoolean451 | false;
			}
			if ((arg4.aBoolean450 || Static221.aBoolean374) && arg0 != -1 && arg4.anIntArray529.length > arg0) {
				local100 = arg4.anIntArray529[arg0];
				local104 = local100 >>> 16;
				@Pc(108) int local108 = local100 & 0xFFFF;
				@Pc(117) Class1_Sub2_Sub13 local117;
				if (local104 == local53) {
					local117 = local57;
				} else {
					local117 = Static327.method5522(local108 >>> 16);
				}
				if (local117 != null) {
					local30 |= local117.method4655(local108);
					local28 |= local117.method4656(local108);
				}
			}
			if (local30) {
				local24 = 1184;
			}
			if (local28) {
				local24 |= 0x100;
			}
			if (local32) {
				local24 |= 0x200;
			}
		}
		@Pc(156) Class37 local156 = Static203.aClass37_65;
		@Pc(165) Class40 local165;
		synchronized (Static203.aClass37_65) {
			local165 = (Class40) Static203.aClass37_65.method915(this.aLong100);
		}
		if (local165 == null || arg2.method4223(local165.method4602(), local24) != 0) {
			if (local165 != null) {
				local24 = arg2.method4214(local24, local165.method4602());
			}
			local32 = false;
			for (local49 = 0; local49 < 12; local49++) {
				local100 = this.anIntArray352[local49];
				if ((local100 & 0x40000000) == 0) {
					if ((local100 & Integer.MIN_VALUE) != 0 && !Static191.method3370(local100 & 0x3FFFFFFF).method1704()) {
						local32 = true;
					}
				} else if (!Static348.method5333(local100 & 0x3FFFFFFF).method1978(this.aBoolean283)) {
					local32 = true;
				}
			}
			if (local32) {
				return null;
			}
			@Pc(269) Class219[] local269 = new Class219[12];
			@Pc(271) int local271 = 0;
			for (@Pc(273) int local273 = 0; local273 < 12; local273++) {
				local53 = this.anIntArray352[local273];
				@Pc(294) Class219 local294;
				if ((local53 & 0x40000000) != 0) {
					local294 = Static348.method5333(local53 & 0x3FFFFFFF).method1979(this.aBoolean283);
					if (local294 != null) {
						local269[local271++] = local294;
					}
				} else if ((Integer.MIN_VALUE & local53) != 0) {
					local294 = Static191.method3370(local53 & 0x3FFFFFFF).method1712();
					if (local294 != null) {
						local269[local271++] = local294;
					}
				}
			}
			@Pc(337) Class219 local337 = new Class219(local269, local271);
			@Pc(341) int local341 = local24 | 0x2000;
			local165 = arg2.method4301(local337, local341, Static295.anInt5948, 64, 768);
			for (local104 = 0; local104 < 5; local104++) {
				if (Static259.aShortArrayArray11[local104].length > this.anIntArray351[local104]) {
					local165.method4579(Static325.aShortArray47[local104], Static259.aShortArrayArray11[local104][this.anIntArray351[local104]]);
				}
				if (this.anIntArray351[local104] < Static262.aShortArrayArray5[local104].length) {
					local165.method4579(Static238.aShortArray66[local104], Static262.aShortArrayArray5[local104][this.anIntArray351[local104]]);
				}
			}
			local165.method4601(local24);
			@Pc(406) Class37 local406 = Static203.aClass37_65;
			synchronized (Static203.aClass37_65) {
				Static203.aClass37_65.method922(this.aLong100, local165);
			}
		}
		if (arg4 == null) {
			return local165;
		} else {
			local165.method4599((byte) 1, local24, true);
			return arg4.method4746(local165, 1024, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIB)V")
	public void method3156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray351[arg0] = arg1;
		this.method3153();
	}
}
