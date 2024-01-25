import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class60 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
	public int[] anIntArray196;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
	private int anInt1969;

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "Z")
	public boolean aBoolean184;

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	public int anInt1966 = -1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIILclient!uo;ILclient!bo;II)Lclient!ge;")
	public Class73 method1710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class32 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class24 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local26 = arg5.anIntArray90[arg2];
			local7 = 1056;
			local36 = local26 >>> 16;
			@Pc(40) int local40 = local26 & 0xFFFF;
			@Pc(44) Class1_Sub4_Sub19 local44 = Static115.method2445(local36);
			if (local44 != null) {
				local13 = local44.method4587(local40) | false;
				local11 = local44.method4593(local40) | false;
				local15 = arg5.aBoolean98 | false;
			}
			if ((arg5.aBoolean99 || Static159.aBoolean329) && arg0 != -1 && arg0 < arg5.anIntArray90.length) {
				@Pc(86) int local86 = arg5.anIntArray90[arg0];
				@Pc(90) int local90 = local86 >>> 16;
				@Pc(94) int local94 = local86 & 0xFFFF;
				@Pc(103) Class1_Sub4_Sub19 local103;
				if (local36 == local90) {
					local103 = local44;
				} else {
					local103 = Static115.method2445(local94 >>> 16);
				}
				if (local103 != null) {
					local13 |= local103.method4587(local94);
					local11 |= local103.method4593(local94);
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
		@Pc(153) long local153 = (long) arg6 | (long) arg1 << 32 | (long) (arg4 << 16);
		@Pc(155) Class87 local155 = Static306.aClass87_53;
		@Pc(173) Class73 local173;
		synchronized (Static306.aClass87_53) {
			local173 = (Class73) Static306.aClass87_53.method2482(local153);
		}
		if (local173 == null || arg3.method2173(local173.method3298(), local7) != 0) {
			if (local173 != null) {
				local7 = arg3.method2159(local7, local173.method3298());
			}
			@Pc(203) Class82[] local203 = new Class82[3];
			@Pc(205) int local205 = 0;
			if (!Static256.method4624(arg6).method3431() || !Static256.method4624(arg4).method3431() || !Static256.method4624(arg1).method3431()) {
				return null;
			}
			@Pc(231) Class82 local231 = Static256.method4624(arg6).method3427();
			if (local231 != null) {
				local205++;
				local203[0] = local231;
			}
			local231 = Static256.method4624(arg4).method3427();
			if (local231 != null) {
				local203[local205++] = local231;
			}
			local231 = Static256.method4624(arg1).method3427();
			if (local231 != null) {
				local203[local205++] = local231;
			}
			local26 = local7 | 0x2000;
			local231 = new Class82(local203, local205);
			local173 = arg3.method2153(local231, local26, Static230.anInt4748, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (Static331.aShortArrayArray7[local36].length > this.anIntArray196[local36]) {
					local173.method3300(Static144.aShortArray58[local36], Static331.aShortArrayArray7[local36][this.anIntArray196[local36]]);
				}
				if (Static156.aShortArrayArray3[local36].length > this.anIntArray196[local36]) {
					local173.method3300(Static71.aShortArray70[local36], Static156.aShortArrayArray3[local36][this.anIntArray196[local36]]);
				}
			}
			local173.method3287(local7);
			@Pc(347) Class87 local347 = Static306.aClass87_53;
			synchronized (Static306.aClass87_53) {
				Static306.aClass87_53.method2481(local173, local153);
			}
		}
		if (arg5 == null) {
			return local173;
		} else {
			local173 = local173.method3306((byte) 1, local7, true);
			return arg5.method766(arg7, 1024, arg2, arg0, local173);
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V")
	public void method1712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static96.anIntArray506[arg0];
		if (this.anIntArray195[local7] != 0 && Static256.method4624(arg1) != null) {
			this.anIntArray195[local7] = arg1 | Integer.MIN_VALUE;
			this.method1715();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIIILclient!uo;Lclient!bo;Lclient!bo;ZII[Lclient!rr;II)Lclient!ge;")
	public Class73 method1713(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class32 arg3, @OriginalArg(5) Class24 arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class184[] arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10) {
		if (this.anInt1966 != -1) {
			return Static133.method2749(this.anInt1966).method5484(arg1, arg5, arg9, arg0, arg4, arg2, arg7, arg3, arg6, arg10, arg8);
		}
		@Pc(30) int local30 = arg2;
		@Pc(33) long local33 = this.aLong61;
		@Pc(36) int[] local36 = this.anIntArray195;
		if (arg4 != null && (arg4.anInt1048 >= 0 || arg4.anInt1045 >= 0)) {
			local36 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local36[local52] = this.anIntArray195[local52];
			}
			if (arg4.anInt1048 >= 0) {
				if (arg4.anInt1048 == 65535) {
					local33 ^= 0xFFFFFFFF00000000L;
					local36[5] = 0;
				} else {
					local36[5] = arg4.anInt1048 | 0x40000000;
					local33 ^= (long) local36[5] << 32;
				}
			}
			if (arg4.anInt1045 >= 0) {
				if (arg4.anInt1045 == 65535) {
					local36[3] = 0;
					local33 ^= 0xFFFFFFFFL;
				} else {
					local36[3] = arg4.anInt1045 | 0x40000000;
					local33 ^= local36[3];
				}
			}
		}
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg4 != null || arg5 != null;
		@Pc(155) int local155 = arg8 == null ? 0 : arg8.length;
		@Pc(188) int local188;
		@Pc(193) int local193;
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			Static92.aClass1_Sub4_Sub19Array6[local157] = null;
			if (arg8[local157] != null) {
				@Pc(174) Class24 local174 = Static110.method5411(arg8[local157].anInt5656);
				if (local174.anIntArray90 != null) {
					Static150.aClass24Array1[local157] = local174;
					local148 = true;
					local188 = arg8[local157].anInt5658;
					local193 = arg8[local157].anInt5657;
					@Pc(198) int local198 = local174.anIntArray90[local188];
					Static92.aClass1_Sub4_Sub19Array6[local157] = Static115.method2445(local198 >>> 16);
					@Pc(210) int local210 = local198 & 0xFFFF;
					Static62.anIntArray174[local157] = local210;
					if (Static92.aClass1_Sub4_Sub19Array6[local157] != null) {
						local140 |= Static92.aClass1_Sub4_Sub19Array6[local157].method4587(local210);
						local138 |= Static92.aClass1_Sub4_Sub19Array6[local157].method4593(local210);
					}
					if ((local174.aBoolean99 || Static159.aBoolean329) && local193 != -1 && local193 < local174.anIntArray90.length) {
						Static91.anIntArray216[local157] = local174.anIntArray89[local188];
						Static326.anIntArray232[local157] = arg8[local157].anInt5659;
						@Pc(290) int local290 = local174.anIntArray90[local193];
						Static248.aClass1_Sub4_Sub19Array7[local157] = Static115.method2445(local290 >>> 16);
						@Pc(302) int local302 = local290 & 0xFFFF;
						Static169.anIntArray330[local157] = local302;
						if (Static248.aClass1_Sub4_Sub19Array7[local157] != null) {
							local140 |= Static248.aClass1_Sub4_Sub19Array7[local157].method4587(local302);
							local138 |= Static248.aClass1_Sub4_Sub19Array7[local157].method4593(local302);
						}
					} else {
						Static91.anIntArray216[local157] = 0;
						Static326.anIntArray232[local157] = 0;
						Static248.aClass1_Sub4_Sub19Array7[local157] = null;
						Static169.anIntArray330[local157] = -1;
					}
				}
			}
		}
		@Pc(334) int local334 = -1;
		local188 = -1;
		local193 = 0;
		@Pc(340) Class1_Sub4_Sub19 local340 = null;
		@Pc(342) Class1_Sub4_Sub19 local342 = null;
		@Pc(344) int local344 = -1;
		@Pc(346) int local346 = -1;
		@Pc(354) int local354 = 0;
		@Pc(356) Class1_Sub4_Sub19 local356 = null;
		@Pc(358) Class1_Sub4_Sub19 local358 = null;
		if (local148) {
			local30 = arg2 | 0x20;
			@Pc(375) int local375;
			@Pc(431) int local431;
			if (arg4 != null) {
				local334 = arg4.anIntArray90[arg9];
				local375 = local334 >>> 16;
				local340 = Static115.method2445(local375);
				local334 &= 0xFFFF;
				if (local340 != null) {
					local140 |= local340.method4587(local334);
					local138 |= local340.method4593(local334);
				}
				if ((arg4.aBoolean99 || Static159.aBoolean329) && arg10 != -1 && arg10 < arg4.anIntArray90.length) {
					local188 = arg4.anIntArray90[arg10];
					local193 = arg4.anIntArray89[arg9];
					local431 = local188 >>> 16;
					local188 &= 0xFFFF;
					local342 = local375 == local431 ? local340 : Static115.method2445(local431);
					if (local342 != null) {
						local140 |= local342.method4587(local188);
						local138 |= local342.method4593(local188);
					}
				}
			}
			if (arg5 != null) {
				local344 = arg5.anIntArray90[arg1];
				local375 = local344 >>> 16;
				local344 &= 0xFFFF;
				local356 = Static115.method2445(local375);
				if (local356 != null) {
					local140 |= local356.method4587(local344);
					local138 |= local356.method4593(local344);
				}
				if ((arg5.aBoolean99 || Static159.aBoolean329) && arg6 != -1 && arg6 < arg5.anIntArray90.length) {
					local346 = arg5.anIntArray90[arg6];
					local354 = arg5.anIntArray89[arg1];
					local431 = local346 >>> 16;
					local346 &= 0xFFFF;
					local358 = local375 == local431 ? local356 : Static115.method2445(local431);
					if (local358 != null) {
						local140 |= local358.method4587(local346);
						local138 |= local358.method4593(local346);
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
		@Pc(569) Class87 local569 = Static307.aClass87_54;
		@Pc(577) Class73 local577;
		synchronized (Static307.aClass87_54) {
			local577 = (Class73) Static307.aClass87_54.method2482(local33);
		}
		@Pc(585) Class123 local585 = null;
		if (this.anInt1969 != -1) {
			local585 = Static26.method721(this.anInt1969);
		}
		@Pc(627) int local627;
		@Pc(633) int local633;
		if (local577 == null || arg3.method2173(local577.method3298(), local30) != 0 || local585 != null && local585.anIntArrayArray43 != null && this.anIntArrayArray21 == null) {
			if (local577 != null) {
				local30 = arg3.method2159(local30, local577.method3298());
			}
			@Pc(625) boolean local625 = false;
			local627 = 0;
			while (true) {
				if (local627 >= 12) {
					if (local625) {
						if (this.aLong60 != -1L) {
							@Pc(1246) Class87 local1246 = Static307.aClass87_54;
							synchronized (Static307.aClass87_54) {
								local577 = (Class73) Static307.aClass87_54.method2482(this.aLong60);
							}
						}
						if (local577 == null || arg3.method2173(local577.method3298(), local30) != 0 || local585 != null && local585.anIntArrayArray43 != null && this.anIntArrayArray21 == null) {
							return null;
						}
					} else {
						@Pc(674) Class82[] local674 = new Class82[12];
						@Pc(682) int local682;
						for (@Pc(676) int local676 = 0; local676 < 12; local676++) {
							local682 = local36[local676];
							@Pc(699) Class82 local699;
							if ((local682 & 0x40000000) != 0) {
								local699 = Static20.method561(local682 & 0x3FFFFFFF).method3003(this.aBoolean184);
								if (local699 != null) {
									local674[local676] = local699;
								}
							} else if ((Integer.MIN_VALUE & local682) != 0) {
								local699 = Static256.method4624(local682 & 0x3FFFFFFF).method3430();
								if (local699 != null) {
									local674[local676] = local699;
								}
							}
						}
						@Pc(759) int local759;
						if (local585 != null && local585.anIntArrayArray43 != null) {
							for (local682 = 0; local682 < local585.anIntArrayArray43.length; local682++) {
								if (local585.anIntArrayArray43[local682] != null && local674[local682] != null) {
									local759 = local585.anIntArrayArray43[local682][0];
									@Pc(766) int local766 = local585.anIntArrayArray43[local682][1];
									@Pc(773) int local773 = local585.anIntArrayArray43[local682][2];
									@Pc(782) int local782 = local585.anIntArrayArray43[local682][3] << 3;
									@Pc(791) int local791 = local585.anIntArrayArray43[local682][4] << 3;
									@Pc(800) int local800 = local585.anIntArrayArray43[local682][5] << 3;
									if (this.anIntArrayArray21 == null) {
										this.anIntArrayArray21 = new int[local585.anIntArrayArray43.length][];
									}
									if (this.anIntArrayArray21[local682] == null) {
										@Pc(822) int[] local822 = this.anIntArrayArray21[local682] = new int[15];
										if (local782 == 0 && local791 == 0 && local800 == 0) {
											local822[14] = -local773;
											local822[13] = -local766;
											local822[0] = local822[4] = local822[8] = 32768;
											local822[12] = -local759;
										} else {
											@Pc(835) int local835 = Class1_Sub3_Sub8.anIntArray156[local782];
											@Pc(839) int local839 = Class1_Sub3_Sub8.anIntArray159[local782];
											@Pc(843) int local843 = Class1_Sub3_Sub8.anIntArray156[local791];
											@Pc(847) int local847 = Class1_Sub3_Sub8.anIntArray159[local791];
											@Pc(851) int local851 = Class1_Sub3_Sub8.anIntArray156[local800];
											@Pc(855) int local855 = Class1_Sub3_Sub8.anIntArray159[local800];
											@Pc(863) int local863 = local851 * local839 + 16384 >> 15;
											@Pc(871) int local871 = local855 * local839 + 16384 >> 15;
											local822[1] = local863 * local847 + local843 * -local855 + 16384 >> 15;
											local822[0] = local851 * local843 + local871 * local847 + 16384 >> 15;
											local822[2] = local847 * local835 + 16384 >> 15;
											local822[7] = local863 * local843 + -local855 * -local847 + 16384 >> 15;
											local822[5] = -local839;
											local822[6] = local843 * local871 + -local847 * local851 + 16384 >> 15;
											local822[3] = local855 * local835 + 16384 >> 15;
											local822[4] = local851 * local835 + 16384 >> 15;
											local822[8] = local835 * local843 + 16384 >> 15;
											local822[13] = -local773 * local822[7] + local822[4] * -local766 + -local759 * local822[1] + 16384 >> 15;
											local822[12] = -local766 * local822[3] + -local759 * local822[0] + local822[6] * -local773 + 16384 >> 15;
											local822[14] = -local773 * local822[8] + -local759 * local822[2] + -local766 * local822[5] + 16384 >> 15;
										}
										local822[10] = local766;
										local822[9] = local759;
										local822[11] = local773;
									}
									if (local782 != 0 || local791 != 0 || local800 != 0) {
										local674[local682].method2346(local791, local800, local782);
									}
									if (local759 != 0 || local766 != 0 || local773 != 0) {
										local674[local682].method2361(local759, local766, local773);
									}
								}
							}
						}
						@Pc(1150) Class82 local1150 = new Class82(local674, local674.length);
						@Pc(1154) int local1154 = local30 | 0x2000;
						local577 = arg3.method2153(local1150, local1154, Static230.anInt4748, 64, 850);
						for (local759 = 0; local759 < 5; local759++) {
							if (this.anIntArray196[local759] < Static331.aShortArrayArray7[local759].length) {
								local577.method3300(Static144.aShortArray58[local759], Static331.aShortArrayArray7[local759][this.anIntArray196[local759]]);
							}
							if (this.anIntArray196[local759] < Static156.aShortArrayArray3[local759].length) {
								local577.method3300(Static71.aShortArray70[local759], Static156.aShortArrayArray3[local759][this.anIntArray196[local759]]);
							}
						}
						local577.method3287(local30);
						@Pc(1221) Class87 local1221 = Static307.aClass87_54;
						synchronized (Static307.aClass87_54) {
							Static307.aClass87_54.method2481(local577, local33);
						}
						this.aLong60 = local33;
					}
					break;
				}
				local633 = local36[local627];
				if ((local633 & 0x40000000) == 0) {
					if ((local633 & Integer.MIN_VALUE) != 0 && !Static256.method4624(local633 & 0x3FFFFFFF).method3426()) {
						local625 = true;
					}
				} else if (!Static20.method561(local633 & 0x3FFFFFFF).method2993(this.aBoolean184)) {
					local625 = true;
				}
				local627++;
			}
		}
		@Pc(1288) Class73 local1288 = local577.method3306((byte) 1, local30, true);
		if (!local148) {
			return local1288;
		}
		@Pc(1294) int local1294 = 0;
		local627 = 1;
		while (local155 > local1294) {
			if (Static92.aClass1_Sub4_Sub19Array6[local1294] != null) {
				local1288.method3302(Static92.aClass1_Sub4_Sub19Array6[local1294], Static91.anIntArray216[local1294], this.anIntArrayArray21 == null ? null : this.anIntArrayArray21[local1294], Static169.anIntArray330[local1294], Static62.anIntArray174[local1294], local627, Static248.aClass1_Sub4_Sub19Array7[local1294], Static326.anIntArray232[local1294] - 1, false);
			}
			local1294++;
			local627 <<= 0x1;
		}
		if (local340 != null && local356 != null) {
			local1288.method3308(local346, local342, local193, arg4.aBooleanArray4, local358, local354, local334, local344, local356, local340, false, arg7 - 1, arg0 + -1, local188);
		} else if (local340 != null) {
			local1288.method3309(local193, false, local340, 0, local342, local188, local334, arg0 - 1);
		} else if (local356 != null) {
			local1288.method3309(local354, false, local356, 0, local358, local346, local344, arg7 - 1);
		}
		for (local633 = 0; local633 < local155; local633++) {
			Static92.aClass1_Sub4_Sub19Array6[local633] = null;
			Static248.aClass1_Sub4_Sub19Array7[local633] = null;
			Static150.aClass24Array1[local633] = null;
		}
		return local1288;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	private void method1715() {
		this.aLong61 = -1L;
		@Pc(10) long[] local10 = Class1_Sub4_Sub7.aLongArray1;
		this.aLong61 = local10[(int) ((this.aLong61 ^ (long) (this.anInt1969 >> 8)) & 0xFFL)] ^ this.aLong61 >>> 8;
		this.aLong61 = this.aLong61 >>> 8 ^ local10[(int) ((this.aLong61 ^ (long) this.anInt1969) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong61 = this.aLong61 >>> 8 ^ local10[(int) ((this.aLong61 ^ (long) (this.anIntArray195[local50] >> 24)) & 0xFFL)];
			this.aLong61 = this.aLong61 >>> 8 ^ local10[(int) ((this.aLong61 ^ (long) (this.anIntArray195[local50] >> 16)) & 0xFFL)];
			this.aLong61 = local10[(int) (((long) (this.anIntArray195[local50] >> 8) ^ this.aLong61) & 0xFFL)] ^ this.aLong61 >>> 8;
			this.aLong61 = local10[(int) ((this.aLong61 ^ (long) this.anIntArray195[local50]) & 0xFFL)] ^ this.aLong61 >>> 8;
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong61 = local10[(int) (((long) this.anIntArray196[local152] ^ this.aLong61) & 0xFFL)] ^ this.aLong61 >>> 8;
		}
		this.aLong61 = this.aLong61 >>> 8 ^ local10[(int) ((this.aLong61 ^ (long) (this.aBoolean184 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI[I[III)V")
	public void method1717(@OriginalArg(0) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (this.anInt1969 != arg4) {
			this.anIntArrayArray21 = null;
			this.anInt1969 = arg4;
		}
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static298.anInt5840; local26++) {
					@Pc(32) Class124 local32 = Static256.method4624(local26);
					if (local32 != null && !local32.aBoolean344 && (arg0 ? Static103.anIntArray229[local22] : Static86.anIntArray209[local22]) == local32.anInt3731) {
						arg2[Static96.anIntArray506[local22]] = local26 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray196 = arg1;
		this.anInt1966 = arg3;
		this.anIntArray195 = arg2;
		this.aBoolean184 = arg0;
		this.method1715();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIILclient!uo;Lclient!bo;II)Lclient!ge;")
	public Class73 method1719(@OriginalArg(1) int arg0, @OriginalArg(3) Class32 arg1, @OriginalArg(4) Class24 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (this.anInt1966 != -1) {
			return Static133.method2749(this.anInt1966).method5492(arg1, arg0, arg4, arg2, arg3);
		}
		@Pc(29) int local29 = 1024;
		@Pc(37) boolean local37;
		@Pc(54) int local54;
		@Pc(106) int local106;
		@Pc(58) int local58;
		@Pc(110) int local110;
		if (arg2 != null) {
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			local37 = false;
			local29 = 1056;
			local54 = arg2.anIntArray90[arg0];
			local58 = local54 >>> 16;
			@Pc(62) int local62 = local54 & 0xFFFF;
			@Pc(66) Class1_Sub4_Sub19 local66 = Static115.method2445(local58);
			if (local66 != null) {
				local35 = local66.method4587(local62) | false;
				local33 = local66.method4593(local62) | false;
				local37 = arg2.aBoolean98 | false;
			}
			if ((arg2.aBoolean99 || Static159.aBoolean329) && arg3 != -1 && arg3 < arg2.anIntArray90.length) {
				local106 = arg2.anIntArray90[arg3];
				local110 = local106 >>> 16;
				@Pc(121) Class1_Sub4_Sub19 local121 = local110 == local58 ? local66 : Static115.method2445(local110);
				@Pc(125) int local125 = local106 & 0xFFFF;
				if (local121 != null) {
					local35 |= local121.method4587(local125);
					local33 |= local121.method4593(local125);
				}
			}
			if (local35) {
				local29 = 1184;
			}
			if (local33) {
				local29 |= 0x100;
			}
			if (local37) {
				local29 |= 0x200;
			}
		}
		@Pc(161) Class87 local161 = Static306.aClass87_53;
		@Pc(170) Class73 local170;
		synchronized (Static306.aClass87_53) {
			local170 = (Class73) Static306.aClass87_53.method2482(this.aLong61);
		}
		if (local170 == null || arg1.method2173(local170.method3298(), local29) != 0) {
			if (local170 != null) {
				local29 = arg1.method2159(local29, local170.method3298());
			}
			local37 = false;
			for (local54 = 0; local54 < 12; local54++) {
				local106 = this.anIntArray195[local54];
				if ((local106 & 0x40000000) == 0) {
					if ((local106 & Integer.MIN_VALUE) != 0 && !Static256.method4624(local106 & 0x3FFFFFFF).method3431()) {
						local37 = true;
					}
				} else if (!Static20.method561(local106 & 0x3FFFFFFF).method2989(this.aBoolean184)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(251) Class82[] local251 = new Class82[12];
			@Pc(253) int local253 = 0;
			for (@Pc(255) int local255 = 0; local255 < 12; local255++) {
				local58 = this.anIntArray195[local255];
				@Pc(281) Class82 local281;
				if ((local58 & 0x40000000) != 0) {
					local281 = Static20.method561(local58 & 0x3FFFFFFF).method2992(this.aBoolean184);
					if (local281 != null) {
						local251[local253++] = local281;
					}
				} else if ((Integer.MIN_VALUE & local58) != 0) {
					local281 = Static256.method4624(local58 & 0x3FFFFFFF).method3427();
					if (local281 != null) {
						local251[local253++] = local281;
					}
				}
			}
			@Pc(324) Class82 local324 = new Class82(local251, local253);
			@Pc(328) int local328 = local29 | 0x2000;
			local170 = arg1.method2153(local324, local328, Static230.anInt4748, 64, 768);
			for (local110 = 0; local110 < 5; local110++) {
				if (Static331.aShortArrayArray7[local110].length > this.anIntArray196[local110]) {
					local170.method3300(Static144.aShortArray58[local110], Static331.aShortArrayArray7[local110][this.anIntArray196[local110]]);
				}
				if (Static156.aShortArrayArray3[local110].length > this.anIntArray196[local110]) {
					local170.method3300(Static71.aShortArray70[local110], Static156.aShortArrayArray3[local110][this.anIntArray196[local110]]);
				}
			}
			local170.method3287(local29);
			@Pc(401) Class87 local401 = Static306.aClass87_53;
			synchronized (Static306.aClass87_53) {
				Static306.aClass87_53.method2481(local170, this.aLong61);
			}
		}
		if (arg2 == null) {
			return local170;
		} else {
			local170.method3306((byte) 1, local29, true);
			return arg2.method766(arg4, 1024, arg0, arg3, local170);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZB)V")
	public void method1721(@OriginalArg(0) boolean arg0) {
		this.aBoolean184 = arg0;
		this.method1715();
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)V")
	public void method1724(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray196[arg0] = arg1;
		this.method1715();
	}
}
