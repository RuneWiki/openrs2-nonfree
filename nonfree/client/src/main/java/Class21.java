import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class21 {

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
	private int anInt550;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "[I")
	private int[] anIntArray62;

	@OriginalMember(owner = "client!bn", name = "w", descriptor = "Z")
	public boolean aBoolean39;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
	public int anInt552 = -1;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZZ)V")
	public void method463(@OriginalArg(1) boolean arg0) {
		this.aBoolean39 = arg0;
		this.method464();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	private void method464() {
		@Pc(7) long[] local7 = Class6_Sub16.aLongArray4;
		this.aLong27 = -1L;
		this.aLong27 = local7[(int) (((long) (this.anInt550 >> 8) ^ this.aLong27) & 0xFFL)] ^ this.aLong27 >>> 8;
		this.aLong27 = this.aLong27 >>> 8 ^ local7[(int) (((long) this.anInt550 ^ this.aLong27) & 0xFFL)];
		for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
			this.aLong27 = local7[(int) ((this.aLong27 ^ (long) (this.anIntArray62[local56] >> 24)) & 0xFFL)] ^ this.aLong27 >>> 8;
			this.aLong27 = local7[(int) (((long) (this.anIntArray62[local56] >> 16) ^ this.aLong27) & 0xFFL)] ^ this.aLong27 >>> 8;
			this.aLong27 = this.aLong27 >>> 8 ^ local7[(int) ((this.aLong27 ^ (long) (this.anIntArray62[local56] >> 8)) & 0xFFL)];
			this.aLong27 = local7[(int) (((long) this.anIntArray62[local56] ^ this.aLong27) & 0xFFL)] ^ this.aLong27 >>> 8;
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong27 = local7[(int) ((this.aLong27 ^ (long) this.anIntArray61[local152]) & 0xFFL)] ^ this.aLong27 >>> 8;
		}
		this.aLong27 = this.aLong27 >>> 8 ^ local7[(int) (((long) (this.aBoolean39 ? 1 : 0) ^ this.aLong27) & 0xFFL)];
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!bq;Lclient!bq;IZIB[Lclient!tn;Lclient!ja;IIIII)Lclient!rc;")
	public Class78 method466(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class192[] arg4, @OriginalArg(7) Class81 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		if (this.anInt552 != -1) {
			return Static162.method3235(this.anInt552).method360(arg8, arg7, arg2, arg5, arg0, arg1, arg9, arg10, arg6, arg4, arg3);
		}
		@Pc(30) int local30 = arg2;
		@Pc(33) long local33 = this.aLong27;
		@Pc(36) int[] local36 = this.anIntArray62;
		if (arg0 != null && (arg0.anInt596 >= 0 || arg0.anInt584 >= 0)) {
			local36 = new int[12];
			for (@Pc(49) int local49 = 0; local49 < 12; local49++) {
				local36[local49] = this.anIntArray62[local49];
			}
			if (arg0.anInt596 >= 0) {
				if (arg0.anInt596 == 65535) {
					local33 ^= 0xFFFFFFFF00000000L;
					local36[5] = 0;
				} else {
					local36[5] = arg0.anInt596 | 0x40000000;
					local33 ^= (long) local36[5] << 32;
				}
			}
			if (arg0.anInt584 >= 0) {
				if (arg0.anInt584 == 65535) {
					local33 ^= 0xFFFFFFFFL;
					local36[3] = 0;
				} else {
					local36[3] = arg0.anInt584 | 0x40000000;
					local33 ^= local36[3];
				}
			}
		}
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg0 != null || arg1 != null;
		@Pc(155) int local155 = arg4 == null ? 0 : arg4.length;
		@Pc(188) int local188;
		@Pc(193) int local193;
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			Static156.aClass6_Sub2_Sub9Array9[local157] = null;
			if (arg4[local157] != null) {
				@Pc(174) Class24 local174 = Static209.method3737(arg4[local157].anInt5797);
				if (local174.anIntArray64 != null) {
					Static277.aClass24Array2[local157] = local174;
					local148 = true;
					local188 = arg4[local157].anInt5792;
					local193 = arg4[local157].anInt5786;
					@Pc(198) int local198 = local174.anIntArray64[local188];
					Static156.aClass6_Sub2_Sub9Array9[local157] = Static109.method2198(local198 >>> 16);
					@Pc(210) int local210 = local198 & 0xFFFF;
					Static142.anIntArray334[local157] = local210;
					if (Static156.aClass6_Sub2_Sub9Array9[local157] != null) {
						local140 |= Static156.aClass6_Sub2_Sub9Array9[local157].method3163(local210);
						local138 |= Static156.aClass6_Sub2_Sub9Array9[local157].method3161(local210);
					}
					if ((local174.aBoolean43 || Static139.aBoolean207) && local193 != -1 && local174.anIntArray64.length > local193) {
						Static79.anIntArray158[local157] = local174.anIntArray66[local188];
						Static260.anIntArray525[local157] = arg4[local157].anInt5796;
						@Pc(272) int local272 = local174.anIntArray64[local193];
						Static319.aClass6_Sub2_Sub9Array8[local157] = Static109.method2198(local272 >>> 16);
						@Pc(284) int local284 = local272 & 0xFFFF;
						Static122.anIntArray302[local157] = local284;
						if (Static319.aClass6_Sub2_Sub9Array8[local157] != null) {
							local140 |= Static319.aClass6_Sub2_Sub9Array8[local157].method3163(local284);
							local138 |= Static319.aClass6_Sub2_Sub9Array8[local157].method3161(local284);
						}
					} else {
						Static79.anIntArray158[local157] = 0;
						Static260.anIntArray525[local157] = 0;
						Static319.aClass6_Sub2_Sub9Array8[local157] = null;
						Static122.anIntArray302[local157] = -1;
					}
				}
			}
		}
		@Pc(338) int local338 = -1;
		local188 = -1;
		local193 = 0;
		@Pc(344) Class6_Sub2_Sub9 local344 = null;
		@Pc(346) Class6_Sub2_Sub9 local346 = null;
		@Pc(348) int local348 = -1;
		@Pc(350) int local350 = -1;
		@Pc(352) int local352 = 0;
		@Pc(354) Class6_Sub2_Sub9 local354 = null;
		@Pc(356) Class6_Sub2_Sub9 local356 = null;
		if (local148) {
			@Pc(369) int local369;
			@Pc(420) int local420;
			if (arg0 != null) {
				local338 = arg0.anIntArray64[arg6];
				local369 = local338 >>> 16;
				local344 = Static109.method2198(local369);
				local338 &= 0xFFFF;
				if (local344 != null) {
					local140 |= local344.method3163(local338);
					local138 |= local344.method3161(local338);
				}
				if ((arg0.aBoolean43 || Static139.aBoolean207) && arg3 != -1 && arg0.anIntArray64.length > arg3) {
					local188 = arg0.anIntArray64[arg3];
					local193 = arg0.anIntArray66[arg6];
					local420 = local188 >>> 16;
					local188 &= 0xFFFF;
					if (local420 == local369) {
						local346 = local344;
					} else {
						local346 = Static109.method2198(local188 >>> 16);
					}
					if (local346 != null) {
						local140 |= local346.method3163(local188);
						local138 |= local346.method3161(local188);
					}
				}
			}
			local30 = arg2 | 0x20;
			if (arg1 != null) {
				local348 = arg1.anIntArray64[arg7];
				local369 = local348 >>> 16;
				local354 = Static109.method2198(local369);
				local348 &= 0xFFFF;
				if (local354 != null) {
					local140 |= local354.method3163(local348);
					local138 |= local354.method3161(local348);
				}
				if ((arg1.aBoolean43 || Static139.aBoolean207) && arg9 != -1 && arg9 < arg1.anIntArray64.length) {
					local352 = arg1.anIntArray66[arg7];
					local350 = arg1.anIntArray64[arg9];
					local420 = local350 >>> 16;
					local350 &= 0xFFFF;
					if (local420 == local369) {
						local356 = local354;
					} else {
						local356 = Static109.method2198(local350 >>> 16);
					}
					if (local356 != null) {
						local140 |= local356.method3163(local350);
						local138 |= local356.method3161(local350);
					}
				}
			}
			if (local140) {
				local30 |= 0x80;
			}
			if (local138) {
				local30 |= 0x100;
			}
		}
		@Pc(573) Class70 local573 = Static136.aClass70_47;
		@Pc(581) Class78 local581;
		synchronized (Static136.aClass70_47) {
			local581 = (Class78) Static136.aClass70_47.method1396(local33);
		}
		@Pc(589) Class128 local589 = null;
		if (this.anInt550 != -1) {
			local589 = Static279.method4823(this.anInt550);
		}
		@Pc(629) int local629;
		@Pc(635) int local635;
		if (local581 == null || arg5.method2958(local581.method4652(), local30) != 0 || local589 != null && local589.anIntArrayArray123 != null && this.anIntArrayArray29 == null) {
			if (local581 != null) {
				local30 = arg5.method2994(local30, local581.method4652());
			}
			@Pc(627) boolean local627 = false;
			local629 = 0;
			while (true) {
				if (local629 >= 12) {
					if (local627) {
						if (this.aLong26 != -1L) {
							@Pc(1257) Class70 local1257 = Static136.aClass70_47;
							synchronized (Static136.aClass70_47) {
								local581 = (Class78) Static136.aClass70_47.method1396(this.aLong26);
							}
						}
						if (local581 == null || arg5.method2958(local581.method4652(), local30) != 0 || local589 != null && local589.anIntArrayArray123 != null && this.anIntArrayArray29 == null) {
							return null;
						}
					} else {
						@Pc(678) Class57[] local678 = new Class57[12];
						@Pc(686) int local686;
						for (@Pc(680) int local680 = 0; local680 < 12; local680++) {
							local686 = local36[local680];
							@Pc(700) Class57 local700;
							if ((local686 & 0x40000000) != 0) {
								local700 = Static211.method3762(local686 & 0x3FFFFFFF).method3858(this.aBoolean39);
								if (local700 != null) {
									local678[local680] = local700;
								}
							} else if ((local686 & Integer.MIN_VALUE) != 0) {
								local700 = Static326.method5430(local686 & 0x3FFFFFFF).method3087();
								if (local700 != null) {
									local678[local680] = local700;
								}
							}
						}
						@Pc(759) int local759;
						if (local589 != null && local589.anIntArrayArray123 != null) {
							for (local686 = 0; local686 < local589.anIntArrayArray123.length; local686++) {
								if (local589.anIntArrayArray123[local686] != null && local678[local686] != null) {
									local759 = local589.anIntArrayArray123[local686][0];
									@Pc(766) int local766 = local589.anIntArrayArray123[local686][1];
									@Pc(773) int local773 = local589.anIntArrayArray123[local686][2];
									@Pc(782) int local782 = local589.anIntArrayArray123[local686][3] << 3;
									@Pc(791) int local791 = local589.anIntArrayArray123[local686][4] << 3;
									@Pc(800) int local800 = local589.anIntArrayArray123[local686][5] << 3;
									if (this.anIntArrayArray29 == null) {
										this.anIntArrayArray29 = new int[local589.anIntArrayArray123.length][];
									}
									if (this.anIntArrayArray29[local686] == null) {
										@Pc(822) int[] local822 = this.anIntArrayArray29[local686] = new int[15];
										if (local782 == 0 && local791 == 0 && local800 == 0) {
											local822[14] = -local773;
											local822[12] = -local759;
											local822[13] = -local766;
											local822[0] = local822[4] = local822[8] = 32768;
										} else {
											@Pc(864) int local864 = Class207.anIntArray698[local782];
											@Pc(868) int local868 = Class207.anIntArray697[local782];
											@Pc(872) int local872 = Class207.anIntArray698[local791];
											@Pc(876) int local876 = Class207.anIntArray697[local791];
											@Pc(880) int local880 = Class207.anIntArray698[local800];
											@Pc(884) int local884 = Class207.anIntArray697[local800];
											@Pc(892) int local892 = local868 * local880 + 16384 >> 15;
											@Pc(900) int local900 = local884 * local868 + 16384 >> 15;
											local822[7] = local892 * local872 + -local884 * -local876 + 16384 >> 15;
											local822[2] = local876 * local864 + 16384 >> 15;
											local822[0] = local872 * local880 + local876 * local900 + 16384 >> 15;
											local822[3] = local864 * local884 + 16384 >> 15;
											local822[5] = -local868;
											local822[4] = local864 * local880 + 16384 >> 15;
											local822[8] = local864 * local872 + 16384 >> 15;
											local822[1] = local892 * local876 + local872 * -local884 + 16384 >> 15;
											local822[6] = local880 * -local876 + local900 * local872 + 16384 >> 15;
											local822[14] = local822[2] * -local759 + local822[5] * -local766 + -local773 * local822[8] + 16384 >> 15;
											local822[13] = -local773 * local822[7] + local822[4] * -local766 + -local759 * local822[1] + 16384 >> 15;
											local822[12] = local822[6] * -local773 + local822[0] * -local759 + local822[3] * -local766 + 16384 >> 15;
										}
										local822[11] = local773;
										local822[10] = local766;
										local822[9] = local759;
									}
									if (local782 != 0 || local791 != 0 || local800 != 0) {
										local678[local686].method1140(local800, local791, local782);
									}
									if (local759 != 0 || local766 != 0 || local773 != 0) {
										local678[local686].method1132(local766, local773, local759);
									}
								}
							}
						}
						@Pc(1146) int local1146 = local30 | 0x2000;
						@Pc(1153) Class57 local1153 = new Class57(local678, local678.length);
						local581 = arg5.method3016(local1153, local1146, Static342.anInt6219, 64, 850);
						for (local759 = 0; local759 < 5; local759++) {
							if (Static263.aShortArrayArray46[local759].length > this.anIntArray61[local759]) {
								local581.method4645(Static318.aShortArray113[local759], Static263.aShortArrayArray46[local759][this.anIntArray61[local759]]);
							}
							if (Static191.aShortArrayArray32[local759].length > this.anIntArray61[local759]) {
								local581.method4645(Static230.aShortArray76[local759], Static191.aShortArrayArray32[local759][this.anIntArray61[local759]]);
							}
						}
						local581.method4624(local30);
						@Pc(1230) Class70 local1230 = Static136.aClass70_47;
						synchronized (Static136.aClass70_47) {
							Static136.aClass70_47.method1406(local581, local33);
						}
						this.aLong26 = local33;
					}
					break;
				}
				local635 = local36[local629];
				if ((local635 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local635) != 0 && !Static326.method5430(local635 & 0x3FFFFFFF).method3089()) {
						local627 = true;
					}
				} else if (!Static211.method3762(local635 & 0x3FFFFFFF).method3845(this.aBoolean39)) {
					local627 = true;
				}
				local629++;
			}
		}
		@Pc(1299) Class78 local1299 = local581.method4661((byte) 1, local30, true);
		if (!local148) {
			return local1299;
		}
		@Pc(1305) int local1305 = 0;
		local629 = 1;
		while (local1305 < local155) {
			if (Static156.aClass6_Sub2_Sub9Array9[local1305] != null) {
				local1299.method4664(Static260.anIntArray525[local1305] - 1, Static156.aClass6_Sub2_Sub9Array9[local1305], Static319.aClass6_Sub2_Sub9Array8[local1305], this.anIntArrayArray29 == null ? null : this.anIntArrayArray29[local1305], Static79.anIntArray158[local1305], Static142.anIntArray334[local1305], Static122.anIntArray302[local1305], local629, false);
			}
			local629 <<= 0x1;
			local1305++;
		}
		if (local344 != null && local354 != null) {
			local1299.method4625(arg0.aBooleanArray10, local348, local338, local188, local193, local356, false, local346, local350, local344, arg8 - 1, local354, local352, arg10 - 1);
		} else if (local344 != null) {
			local1299.method4628(local344, local188, local193, false, local346, 0, arg8 - 1, local338);
		} else if (local354 != null) {
			local1299.method4628(local354, local350, local352, false, local356, 0, arg10 - 1, local348);
		}
		for (local635 = 0; local635 < local155; local635++) {
			Static156.aClass6_Sub2_Sub9Array9[local635] = null;
			Static319.aClass6_Sub2_Sub9Array8[local635] = null;
			Static277.aClass24Array2[local635] = null;
		}
		return local1299;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)V")
	public void method468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static73.anIntArray148[arg1];
		if (0 != this.anIntArray62[local7] && Static326.method5430(arg0) != null) {
			this.anIntArray62[local7] = arg0 | Integer.MIN_VALUE;
			this.method464();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI[IZ[I)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		if (this.anInt550 != arg1) {
			this.anIntArrayArray29 = null;
			this.anInt550 = arg1;
		}
		if (arg4 == null) {
			arg4 = new int[12];
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static20.anInt325; local26++) {
					@Pc(32) Class112 local32 = Static326.method5430(local26);
					if (local32 != null && !local32.aBoolean224 && (arg3 ? Static69.anIntArray55[local22] : Static343.anIntArray709[local22]) == local32.anInt2882) {
						arg4[Static73.anIntArray148[local22]] = Integer.MIN_VALUE | local26;
						break;
					}
				}
			}
		}
		this.aBoolean39 = arg3;
		this.anIntArray62 = arg4;
		this.anIntArray61 = arg2;
		this.anInt552 = arg0;
		this.method464();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!bq;ILclient!ja;IIIII)Lclient!rc;")
	public Class78 method470(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class81 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(32) int local32;
		@Pc(36) int local36;
		if (arg1 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local32 = arg1.anIntArray64[arg0];
			local36 = local32 >>> 16;
			@Pc(40) int local40 = local32 & 0xFFFF;
			@Pc(44) Class6_Sub2_Sub9 local44 = Static109.method2198(local36);
			if (local44 != null) {
				local13 = local44.method3163(local40) | false;
				local11 = local44.method3161(local40) | false;
				local15 = arg1.aBoolean46 | false;
			}
			if ((arg1.aBoolean43 || Static139.aBoolean207) && arg7 != -1 && arg7 < arg1.anIntArray64.length) {
				@Pc(87) int local87 = arg1.anIntArray64[arg7];
				@Pc(91) int local91 = local87 >>> 16;
				@Pc(95) int local95 = local87 & 0xFFFF;
				@Pc(108) Class6_Sub2_Sub9 local108;
				if (local36 == local91) {
					local108 = local44;
				} else {
					local108 = Static109.method2198(local95 >>> 16);
				}
				if (local108 != null) {
					local13 |= local108.method3163(local95);
					local11 |= local108.method3161(local95);
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
		@Pc(158) long local158 = (long) arg4 << 32 | (long) (arg6 << 16) | (long) arg2;
		@Pc(160) Class70 local160 = Static141.aClass70_50;
		@Pc(168) Class78 local168;
		synchronized (Static141.aClass70_50) {
			local168 = (Class78) Static141.aClass70_50.method1396(local158);
		}
		if (local168 == null || arg3.method2958(local168.method4652(), local7) != 0) {
			if (local168 != null) {
				local7 = arg3.method2994(local7, local168.method4652());
			}
			@Pc(198) Class57[] local198 = new Class57[3];
			@Pc(200) int local200 = 0;
			if (!Static326.method5430(arg2).method3093() || !Static326.method5430(arg6).method3093() || !Static326.method5430(arg4).method3093()) {
				return null;
			}
			@Pc(236) Class57 local236 = Static326.method5430(arg2).method3088();
			if (local236 != null) {
				local200++;
				local198[0] = local236;
			}
			local236 = Static326.method5430(arg6).method3088();
			if (local236 != null) {
				local198[local200++] = local236;
			}
			local236 = Static326.method5430(arg4).method3088();
			if (local236 != null) {
				local198[local200++] = local236;
			}
			local32 = local7 | 0x2000;
			local236 = new Class57(local198, local200);
			local168 = arg3.method3016(local236, local32, Static342.anInt6219, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (this.anIntArray61[local36] < Static263.aShortArrayArray46[local36].length) {
					local168.method4645(Static318.aShortArray113[local36], Static263.aShortArrayArray46[local36][this.anIntArray61[local36]]);
				}
				if (this.anIntArray61[local36] < Static191.aShortArrayArray32[local36].length) {
					local168.method4645(Static230.aShortArray76[local36], Static191.aShortArrayArray32[local36][this.anIntArray61[local36]]);
				}
			}
			local168.method4624(local7);
			@Pc(344) Class70 local344 = Static141.aClass70_50;
			synchronized (Static141.aClass70_50) {
				Static141.aClass70_50.method1406(local168, local158);
			}
		}
		if (arg1 == null) {
			return local168;
		} else {
			local168 = local168.method4661((byte) 1, local7, true);
			return arg1.method495(arg5, arg7, arg0, 1024, local168);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIILclient!ja;ILclient!bq;I)Lclient!rc;")
	public Class78 method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class81 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class24 arg4) {
		if (this.anInt552 != -1) {
			return Static162.method3235(this.anInt552).method364(arg0, arg4, arg2, arg3, arg1);
		}
		@Pc(25) int local25 = 1024;
		@Pc(33) boolean local33;
		@Pc(44) int local44;
		@Pc(105) int local105;
		@Pc(54) int local54;
		@Pc(109) int local109;
		if (arg4 != null) {
			@Pc(29) boolean local29 = false;
			@Pc(31) boolean local31 = false;
			local33 = false;
			local44 = arg4.anIntArray64[arg1];
			local25 = 1056;
			local54 = local44 >>> 16;
			@Pc(58) Class6_Sub2_Sub9 local58 = Static109.method2198(local54);
			@Pc(62) int local62 = local44 & 0xFFFF;
			if (local58 != null) {
				local31 = local58.method3163(local62) | false;
				local29 = local58.method3161(local62) | false;
				local33 = arg4.aBoolean46 | false;
			}
			if ((arg4.aBoolean43 || Static139.aBoolean207) && arg0 != -1 && arg4.anIntArray64.length > arg0) {
				local105 = arg4.anIntArray64[arg0];
				local109 = local105 >>> 16;
				@Pc(113) int local113 = local105 & 0xFFFF;
				@Pc(126) Class6_Sub2_Sub9 local126;
				if (local109 == local54) {
					local126 = local58;
				} else {
					local126 = Static109.method2198(local113 >>> 16);
				}
				if (local126 != null) {
					local31 |= local126.method3163(local113);
					local29 |= local126.method3161(local113);
				}
			}
			if (local31) {
				local25 = 1184;
			}
			if (local29) {
				local25 |= 0x100;
			}
			if (local33) {
				local25 |= 0x200;
			}
		}
		@Pc(165) Class70 local165 = Static141.aClass70_50;
		@Pc(193) Class78 local193;
		synchronized (Static141.aClass70_50) {
			local193 = (Class78) Static141.aClass70_50.method1396(this.aLong27);
		}
		if (local193 == null || arg2.method2958(local193.method4652(), local25) != 0) {
			if (local193 != null) {
				local25 = arg2.method2994(local25, local193.method4652());
			}
			local33 = false;
			for (local44 = 0; local44 < 12; local44++) {
				local105 = this.anIntArray62[local44];
				if ((local105 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local105) != 0 && !Static326.method5430(local105 & 0x3FFFFFFF).method3093()) {
						local33 = true;
					}
				} else if (!Static211.method3762(local105 & 0x3FFFFFFF).method3857(this.aBoolean39)) {
					local33 = true;
				}
			}
			if (local33) {
				return null;
			}
			@Pc(277) Class57[] local277 = new Class57[12];
			@Pc(279) int local279 = 0;
			for (@Pc(281) int local281 = 0; local281 < 12; local281++) {
				local54 = this.anIntArray62[local281];
				@Pc(304) Class57 local304;
				if ((local54 & 0x40000000) != 0) {
					local304 = Static211.method3762(local54 & 0x3FFFFFFF).method3856(this.aBoolean39);
					if (local304 != null) {
						local277[local279++] = local304;
					}
				} else if ((local54 & Integer.MIN_VALUE) != 0) {
					local304 = Static326.method5430(local54 & 0x3FFFFFFF).method3088();
					if (local304 != null) {
						local277[local279++] = local304;
					}
				}
			}
			@Pc(342) int local342 = local25 | 0x2000;
			@Pc(348) Class57 local348 = new Class57(local277, local279);
			local193 = arg2.method3016(local348, local342, Static342.anInt6219, 64, 768);
			for (local109 = 0; local109 < 5; local109++) {
				if (this.anIntArray61[local109] < Static263.aShortArrayArray46[local109].length) {
					local193.method4645(Static318.aShortArray113[local109], Static263.aShortArrayArray46[local109][this.anIntArray61[local109]]);
				}
				if (Static191.aShortArrayArray32[local109].length > this.anIntArray61[local109]) {
					local193.method4645(Static230.aShortArray76[local109], Static191.aShortArrayArray32[local109][this.anIntArray61[local109]]);
				}
			}
			local193.method4624(local25);
			@Pc(423) Class70 local423 = Static141.aClass70_50;
			synchronized (Static141.aClass70_50) {
				Static141.aClass70_50.method1406(local193, this.aLong27);
			}
		}
		if (arg4 == null) {
			return local193;
		} else {
			local193.method4661((byte) 1, local25, true);
			return arg4.method495(arg3, arg0, arg1, 1024, local193);
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V")
	public void method473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray61[arg0] = arg1;
		this.method464();
	}
}
