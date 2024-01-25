import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class236 {

	@OriginalMember(owner = "client!maa", name = "s", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!maa", name = "f", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!maa", name = "i", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "[Lclient!bba;")
	private Class22[] aClass22Array1;

	@OriginalMember(owner = "client!maa", name = "j", descriptor = "J")
	private long aLong223;

	@OriginalMember(owner = "client!maa", name = "q", descriptor = "Z")
	public boolean aBoolean538;

	@OriginalMember(owner = "client!maa", name = "o", descriptor = "I")
	private int anInt6854;

	@OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
	public int anInt6856 = -1;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
	private void method5749() {
		this.aLong223 = -1L;
		@Pc(10) long[] local10 = Class3_Sub28_Sub2.aLongArray10;
		this.aLong223 = this.aLong223 >>> 8 ^ local10[(int) ((this.aLong223 ^ (long) (this.anInt6854 >> 8)) & 0xFFL)];
		this.aLong223 = local10[(int) ((this.aLong223 ^ (long) this.anInt6854) & 0xFFL)] ^ this.aLong223 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray374.length; local50++) {
			this.aLong223 = local10[(int) ((this.aLong223 ^ (long) (this.anIntArray374[local50] >> 24)) & 0xFFL)] ^ this.aLong223 >>> 8;
			this.aLong223 = local10[(int) ((this.aLong223 ^ (long) (this.anIntArray374[local50] >> 16)) & 0xFFL)] ^ this.aLong223 >>> 8;
			this.aLong223 = local10[(int) ((this.aLong223 ^ (long) (this.anIntArray374[local50] >> 8)) & 0xFFL)] ^ this.aLong223 >>> 8;
			this.aLong223 = local10[(int) ((this.aLong223 ^ (long) this.anIntArray374[local50]) & 0xFFL)] ^ this.aLong223 >>> 8;
		}
		if (1787494472 != 1787494472) {
			this.anIntArray374 = null;
		}
		@Pc(163) int local163;
		if (this.aClass22Array1 != null) {
			for (local163 = 0; local163 < this.aClass22Array1.length; local163++) {
				if (this.aClass22Array1[local163] != null) {
					@Pc(183) int[] local183;
					@Pc(189) int[] local189;
					if (this.aBoolean538) {
						local183 = this.aClass22Array1[local163].anIntArray44;
						local189 = this.aClass22Array1[local163].anIntArray43;
					} else {
						local183 = this.aClass22Array1[local163].anIntArray42;
						local189 = this.aClass22Array1[local163].anIntArray41;
					}
					@Pc(207) int local207;
					if (local183 != null) {
						for (local207 = 0; local207 < local183.length; local207++) {
							this.aLong223 = this.aLong223 >>> 8 ^ local10[(int) (((long) (local183[local207] >> 8) ^ this.aLong223) & 0xFFL)];
							this.aLong223 = local10[(int) ((this.aLong223 ^ (long) local183[local207]) & 0xFFL)] ^ this.aLong223 >>> 8;
						}
					}
					if (local189 != null) {
						for (local207 = 0; local207 < local189.length; local207++) {
							this.aLong223 = this.aLong223 >>> 8 ^ local10[(int) ((this.aLong223 ^ (long) (local189[local207] >> 8)) & 0xFFL)];
							this.aLong223 = this.aLong223 >>> 8 ^ local10[(int) ((this.aLong223 ^ (long) local189[local207]) & 0xFFL)];
						}
					}
					if (this.aClass22Array1[local163].aShortArray16 != null) {
						for (local207 = 0; local207 < this.aClass22Array1[local163].aShortArray16.length; local207++) {
							this.aLong223 = local10[(int) (((long) (this.aClass22Array1[local163].aShortArray16[local207] >> 8) ^ this.aLong223) & 0xFFL)] ^ this.aLong223 >>> 8;
							this.aLong223 = this.aLong223 >>> 8 ^ local10[(int) ((this.aLong223 ^ (long) this.aClass22Array1[local163].aShortArray16[local207]) & 0xFFL)];
						}
					}
					if (this.aClass22Array1[local163].aShortArray15 != null) {
						for (local207 = 0; local207 < this.aClass22Array1[local163].aShortArray15.length; local207++) {
							this.aLong223 = local10[(int) (((long) (this.aClass22Array1[local163].aShortArray15[local207] >> 8) ^ this.aLong223) & 0xFFL)] ^ this.aLong223 >>> 8;
							this.aLong223 = this.aLong223 >>> 8 ^ local10[(int) ((this.aLong223 ^ (long) this.aClass22Array1[local163].aShortArray15[local207]) & 0xFFL)];
						}
					}
				}
			}
		}
		for (local163 = 0; local163 < 10; local163++) {
			this.aLong223 = this.aLong223 >>> 8 ^ local10[(int) ((this.aLong223 ^ (long) this.anIntArray373[local163]) & 0xFFL)];
		}
		this.aLong223 = this.aLong223 >>> 8 ^ local10[(int) ((this.aLong223 ^ (long) (this.aBoolean538 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IZ)V")
	public void method5750(@OriginalArg(1) boolean arg0) {
		this.aBoolean538 = arg0;
		this.method5749();
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IILclient!bi;I)V")
	public void method5752(@OriginalArg(0) int arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static597.anIntArray538[arg0];
		if (arg1.method644(arg2) != null) {
			this.anIntArray374[local7] = Integer.MIN_VALUE | arg2;
			this.method5749();
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I[IZI[I[Lclient!bba;I)V")
	public void method5753(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class22[] arg4, @OriginalArg(6) int arg5) {
		this.anIntArray373 = arg3;
		this.aBoolean538 = arg2;
		this.anIntArray374 = arg1;
		this.anInt6856 = arg5;
		if (this.anInt6854 != arg0) {
			this.anInt6854 = arg0;
		}
		this.aClass22Array1 = arg4;
		this.method5749();
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILclient!js;Lclient!wo;Lclient!ha;ILclient!bi;Lclient!eba;Lclient!iia;Lclient!io;)Lclient!ka;")
	public Class157 method5754(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class406 arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(5) Class29 arg3, @OriginalArg(6) Class85 arg4, @OriginalArg(7) Interface10 arg5, @OriginalArg(8) Class177 arg6) {
		if (this.anInt6856 != -1) {
			return arg4.method2214(this.anInt6856).method413(arg5, arg0, (Class208) null, arg2);
		}
		@Pc(35) int local35 = arg0 == null ? 2048 : arg0.method8967() | 0x800;
		@Pc(37) Class338 local37 = Static30.aClass338_1;
		@Pc(46) Class157 local46;
		synchronized (Static30.aClass338_1) {
			local46 = (Class157) Static30.aClass338_1.method8049(this.aLong223);
		}
		if (local46 == null || arg2.method7660(local46.ua(), local35) != 0) {
			if (local46 != null) {
				local35 = arg2.method7671(local35, local46.ua());
			}
			@Pc(76) boolean local76 = false;
			for (@Pc(78) int local78 = 0; local78 < this.anIntArray374.length; local78++) {
				@Pc(87) int local87 = this.anIntArray374[local78];
				@Pc(89) Class22 local89 = null;
				if ((local87 & 0x40000000) != 0) {
					if (this.aClass22Array1 != null && this.aClass22Array1[local78] != null) {
						local89 = this.aClass22Array1[local78];
					}
					if (!arg1.method9394(local87 & 0x3FFFFFFF).method2377(local89, this.aBoolean538)) {
						local76 = true;
					}
				} else if ((local87 & Integer.MIN_VALUE) != 0 && !arg3.method644(local87 & 0x3FFFFFFF).method2837()) {
					local76 = true;
				}
			}
			if (local76) {
				return null;
			}
			@Pc(165) Class178[] local165 = new Class178[this.anIntArray374.length];
			@Pc(167) int local167 = 0;
			for (@Pc(169) int local169 = 0; local169 < this.anIntArray374.length; local169++) {
				@Pc(178) int local178 = this.anIntArray374[local169];
				@Pc(180) Class22 local180 = null;
				@Pc(213) Class178 local213;
				if ((local178 & 0x40000000) != 0) {
					if (this.aClass22Array1 != null && this.aClass22Array1[local169] != null) {
						local180 = this.aClass22Array1[local169];
					}
					local213 = arg1.method9394(local178 & 0x3FFFFFFF).method2367(this.aBoolean538, local180);
					if (local213 != null) {
						local165[local167++] = local213;
					}
				} else if ((local178 & Integer.MIN_VALUE) != 0) {
					local213 = arg3.method644(local178 & 0x3FFFFFFF).method2834(-94);
					if (local213 != null) {
						local165[local167++] = local213;
					}
				}
			}
			@Pc(259) Class178 local259 = new Class178(local165, local167);
			@Pc(263) int local263 = local35 | 0x4000;
			local46 = arg2.method7653(local259, local263, Static124.anInt2384, 64, 768);
			for (@Pc(275) int local275 = 0; local275 < 10; local275++) {
				for (@Pc(279) int local279 = 0; local279 < Static576.aShortArrayArray4[local275].length; local279++) {
					if (this.anIntArray373[local275] < Static92.aShortArrayArrayArray1[local275][local279].length) {
						local46.ia(Static576.aShortArrayArray4[local275][local279], Static92.aShortArrayArrayArray1[local275][local279][this.anIntArray373[local275]]);
					}
				}
			}
			local46.s(local35);
			@Pc(339) Class338 local339 = Static30.aClass338_1;
			synchronized (Static30.aClass338_1) {
				Static30.aClass338_1.method8044(this.aLong223, local46);
			}
		}
		if (arg0 == null) {
			return local46;
		} else {
			@Pc(374) Class157 local374 = local46.method5211((byte) 4, local35, true);
			arg0.method8978(0, local374);
			return local374;
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILclient!js;ZLclient!iia;Lclient!bi;Lclient!wo;Lclient!mga;I[Lclient!js;Lclient!eba;Lclient!ha;Lclient!js;ILclient!io;[ILclient!kw;)Lclient!ka;")
	public Class157 method5755(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) Interface10 arg2, @OriginalArg(4) Class29 arg3, @OriginalArg(5) Class406 arg4, @OriginalArg(6) Class238 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class100[] arg7, @OriginalArg(9) Class85 arg8, @OriginalArg(10) Class67 arg9, @OriginalArg(11) Class100 arg10, @OriginalArg(13) Class177 arg11, @OriginalArg(14) int[] arg12, @OriginalArg(15) Class218 arg13) {
		if (this.anInt6856 != -1) {
			return arg8.method2214(this.anInt6856).method408(arg9, arg1, arg10, arg7, (Class208) null, arg2, arg6, arg5, arg0, arg12);
		}
		@Pc(30) int local30 = arg6;
		@Pc(33) long local33 = this.aLong223;
		@Pc(36) int[] local36 = this.anIntArray374;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(65) int local65;
		@Pc(111) int local111;
		if (arg1 != null) {
			@Pc(46) Class26 local46 = arg1.method8977();
			if (local46 != null && (local46.anInt775 >= 0 || local46.anInt769 >= 0)) {
				local36 = new int[this.anIntArray374.length];
				for (local65 = 0; local65 < local36.length; local65++) {
					local36[local65] = this.anIntArray374[local65];
				}
				if (local46.anInt775 >= 0 && arg13.anInt5929 != -1) {
					local38 = true;
					if (local46.anInt775 == 65535) {
						local36[arg13.anInt5929] = 0;
						local33 ^= 0xFFFFFFFF00000000L;
						for (local111 = 0; local111 < arg13.anIntArray343.length; local111++) {
							local36[arg13.anIntArray343[local111]] = 0;
						}
					} else {
						local36[arg13.anInt5929] = local46.anInt775 | 0x40000000;
						for (local111 = 0; local111 < arg13.anIntArray343.length; local111++) {
							local36[arg13.anIntArray343[local111]] = 0;
						}
						local33 ^= (long) local36[arg13.anInt5929] << 32;
					}
				}
				if (local46.anInt769 >= 0 && arg13.anInt5930 != -1) {
					if (local46.anInt769 == 65535) {
						local36[arg13.anInt5930] = 0;
						for (local111 = 0; local111 < arg13.anIntArray342.length; local111++) {
							local36[arg13.anIntArray342[local111]] = 0;
						}
						local33 ^= 0xFFFFFFFFL;
					} else {
						local36[arg13.anInt5930] = local46.anInt769 | 0x40000000;
						for (local111 = 0; local111 < arg13.anIntArray342.length; local111++) {
							local36[arg13.anIntArray342[local111]] = 0;
						}
						local33 ^= (long) local36[arg13.anInt5930];
					}
					local40 = true;
				}
			}
		}
		@Pc(280) boolean local280 = false;
		local65 = arg7 == null ? 0 : arg7.length;
		for (local111 = 0; local111 < local65; local111++) {
			if (arg7[local111] != null) {
				local280 = true;
				local30 |= arg7[local111].method8967();
			}
		}
		if (arg1 != null) {
			local30 |= arg1.method8967();
			local280 = true;
		}
		if (arg10 != null) {
			local280 = true;
			local30 |= arg10.method8967();
		}
		@Pc(338) boolean local338 = false;
		if (arg12 != null) {
			for (@Pc(342) int local342 = 0; local342 < arg12.length; local342++) {
				if (arg12[local342] != -1) {
					local338 = true;
					local30 |= 0x20;
				}
			}
		}
		@Pc(369) Class338 local369 = Static381.aClass338_35;
		@Pc(377) Class157 local377;
		synchronized (Static381.aClass338_35) {
			local377 = (Class157) Static381.aClass338_35.method8049(local33);
		}
		@Pc(385) Class274 local385 = null;
		if (this.anInt6854 != -1) {
			local385 = arg5.method5902(this.anInt6854);
		}
		@Pc(424) int local424;
		@Pc(432) int local432;
		@Pc(637) int local637;
		@Pc(643) int local643;
		if (local377 == null || arg9.method7660(local377.ua(), local30) != 0) {
			if (local377 != null) {
				local30 = arg9.method7671(local30, local377.ua());
			}
			@Pc(422) boolean local422 = false;
			local424 = 0;
			while (true) {
				@Pc(454) int local454;
				if (local424 >= local36.length) {
					if (local422) {
						if (this.aLong222 != -1L) {
							@Pc(603) Class338 local603 = Static381.aClass338_35;
							synchronized (Static381.aClass338_35) {
								local377 = (Class157) Static381.aClass338_35.method8049(this.aLong222);
							}
						}
						if (local377 == null || arg9.method7660(local377.ua(), local30) != 0) {
							return null;
						}
					} else {
						@Pc(635) Class178[] local635 = new Class178[local36.length];
						for (local637 = 0; local637 < local36.length; local637++) {
							local643 = local36[local637];
							@Pc(645) Class22 local645 = null;
							@Pc(666) boolean local666 = local637 == 5 && local38 || local637 == 3 && local40;
							@Pc(687) Class178 local687;
							if ((local643 & 0x40000000) != 0) {
								if (!local666 && this.aClass22Array1 != null && this.aClass22Array1[local637] != null) {
									local645 = this.aClass22Array1[local637];
								}
								local687 = arg4.method9394(local643 & 0x3FFFFFFF).method2383(local645, this.aBoolean538);
								if (local687 != null) {
									local635[local637] = local687;
								}
							} else if ((local643 & Integer.MIN_VALUE) != 0) {
								local687 = arg3.method644(local643 & 0x3FFFFFFF).method2839();
								if (local687 != null) {
									local635[local637] = local687;
								}
							}
						}
						@Pc(770) int local770;
						if (local385 != null && local385.anIntArrayArray44 != null) {
							for (local643 = 0; local643 < local385.anIntArrayArray44.length; local643++) {
								if (local635[local643] != null) {
									local454 = 0;
									local770 = 0;
									@Pc(772) int local772 = 0;
									@Pc(774) int local774 = 0;
									@Pc(776) int local776 = 0;
									@Pc(778) int local778 = 0;
									if (local385.anIntArrayArray44[local643] != null) {
										local774 = local385.anIntArrayArray44[local643][3] << 3;
										local454 = local385.anIntArrayArray44[local643][0];
										local778 = local385.anIntArrayArray44[local643][5] << 3;
										local776 = local385.anIntArrayArray44[local643][4] << 3;
										local772 = local385.anIntArrayArray44[local643][2];
										local770 = local385.anIntArrayArray44[local643][1];
									}
									if (local774 != 0 || local776 != 0 || local778 != 0) {
										local635[local643].method4276(local778, local774, local776);
									}
									if (local454 != 0 || local770 != 0 || local772 != 0) {
										local635[local643].method4272(local772, local770, local454);
									}
								}
							}
						}
						@Pc(881) int local881 = local30 | 0x4000;
						@Pc(888) Class178 local888 = new Class178(local635, local635.length);
						local377 = arg9.method7653(local888, local881, Static124.anInt2384, 64, 850);
						for (local454 = 0; local454 < 10; local454++) {
							for (local770 = 0; local770 < Static576.aShortArrayArray4[local454].length; local770++) {
								if (this.anIntArray373[local454] < Static92.aShortArrayArrayArray1[local454][local770].length) {
									local377.ia(Static576.aShortArrayArray4[local454][local770], Static92.aShortArrayArrayArray1[local454][local770][this.anIntArray373[local454]]);
								}
							}
						}
						if (true) {
							local377.s(local30);
							@Pc(970) Class338 local970 = Static381.aClass338_35;
							synchronized (Static381.aClass338_35) {
								Static381.aClass338_35.method8044(local33, local377);
							}
							this.aLong222 = local33;
						}
					}
					break;
				}
				local432 = local36[local424];
				@Pc(434) Class22 local434 = null;
				@Pc(436) boolean local436 = false;
				if (local38) {
					if (arg13.anInt5929 == local424) {
						local436 = true;
					} else {
						for (local454 = 0; local454 < arg13.anIntArray343.length; local454++) {
							if (arg13.anIntArray343[local454] == local424) {
								local436 = true;
								break;
							}
						}
					}
				}
				if (local40) {
					if (arg13.anInt5930 == local424) {
						local436 = true;
					} else {
						for (local454 = 0; local454 < arg13.anIntArray342.length; local454++) {
							if (local424 == arg13.anIntArray342[local454]) {
								local436 = true;
								break;
							}
						}
					}
				}
				if ((local432 & 0x40000000) != 0) {
					if (!local436 && this.aClass22Array1 != null && this.aClass22Array1[local424] != null) {
						local434 = this.aClass22Array1[local424];
					}
					if (!arg4.method9394(local432 & 0x3FFFFFFF).method2371(local434, this.aBoolean538)) {
						local422 = true;
					}
				} else if ((Integer.MIN_VALUE & local432) != 0 && !arg3.method644(local432 & 0x3FFFFFFF).method2836()) {
					local422 = true;
				}
				local424++;
			}
		}
		@Pc(994) Class157 local994 = local377.method5211((byte) 4, local30, true);
		if (!local280 && !local338) {
			return local994;
		}
		@Pc(1005) Class181[] local1005 = null;
		if (local385 != null) {
			local1005 = local385.method6902(arg9);
		}
		if (local338 && local1005 != null) {
			for (local424 = 0; local424 < arg12.length; local424++) {
				if (local1005[local424] != null) {
					local994.method5220(local1005[local424], 0x1 << local424, true);
				}
			}
		}
		local424 = 0;
		local432 = 1;
		while (local65 > local424) {
			if (arg7[local424] != null) {
				arg7[local424].method8968(local432, local994);
			}
			local424++;
			local432 <<= 0x1;
		}
		if (local338) {
			for (local637 = 0; local637 < arg12.length; local637++) {
				if (arg12[local637] != -1) {
					local643 = arg12[local637] - arg0;
					local643 &= 0x3FFF;
					@Pc(1109) Class181 local1109 = arg9.method7646();
					local1109.method6344(local643);
					local994.method5220(local1109, 0x1 << local637, false);
				}
			}
		}
		if (local338 && local1005 != null) {
			for (local637 = 0; local637 < arg12.length; local637++) {
				if (local1005[local637] != null) {
					local994.method5220(local1005[local637], 0x1 << local637, false);
				}
			}
		}
		if (arg1 != null && arg10 != null) {
			Static364.method5202(local994, arg10, arg1);
		} else if (arg1 != null) {
			arg1.method8978(0, local994);
		} else if (arg10 != null) {
			arg10.method8978(0, local994);
		}
		return local994;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBI)V")
	public void method5757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray373[arg0] = arg1;
		this.method5749();
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IILclient!wo;I)V")
	public void method5758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class406 arg2) {
		if (arg0 == -1) {
			this.anIntArray374[arg1] = 0;
		} else if (arg2.method9394(arg0) != null) {
			this.anIntArray374[arg1] = arg0 | 0x40000000;
			this.method5749();
		}
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILclient!bi;Lclient!io;IILclient!ha;IILclient!js;)Lclient!ka;")
	public Class157 method5760(@OriginalArg(1) Class29 arg0, @OriginalArg(2) Class177 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class67 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class100 arg7) {
		@Pc(16) int local16 = arg7 == null ? arg6 : arg7.method8967() | 0x800;
		@Pc(29) long local29 = (long) arg3 | (long) arg5 << 32 | (long) (arg2 << 16);
		@Pc(31) Class338 local31 = Static30.aClass338_1;
		@Pc(39) Class157 local39;
		synchronized (Static30.aClass338_1) {
			local39 = (Class157) Static30.aClass338_1.method8049(local29);
		}
		if (local39 == null || arg4.method7660(local39.ua(), local16) != 0) {
			if (local39 != null) {
				local16 = arg4.method7671(local16, local39.ua());
			}
			@Pc(73) Class178[] local73 = new Class178[3];
			@Pc(75) int local75 = 0;
			if (!arg0.method644(arg3).method2837() || !arg0.method644(arg2).method2837() || !arg0.method644(arg5).method2837()) {
				return null;
			}
			@Pc(110) Class178 local110 = arg0.method644(arg3).method2834(-115);
			if (local110 != null) {
				local75++;
				local73[0] = local110;
			}
			local110 = arg0.method644(arg2).method2834(-128);
			if (local110 != null) {
				local73[local75++] = local110;
			}
			local110 = arg0.method644(arg5).method2834(-57);
			if (local110 != null) {
				local73[local75++] = local110;
			}
			local110 = new Class178(local73, local75);
			@Pc(161) int local161 = local16 | 0x4000;
			local39 = arg4.method7653(local110, local161, Static124.anInt2384, 64, 768);
			for (@Pc(171) int local171 = 0; local171 < 10; local171++) {
				for (@Pc(175) int local175 = 0; local175 < Static576.aShortArrayArray4[local171].length; local175++) {
					if (this.anIntArray373[local171] < Static92.aShortArrayArrayArray1[local171][local175].length) {
						local39.ia(Static576.aShortArrayArray4[local171][local175], Static92.aShortArrayArrayArray1[local171][local175][this.anIntArray373[local171]]);
					}
				}
			}
			local39.s(local16);
			@Pc(233) Class338 local233 = Static30.aClass338_1;
			synchronized (Static30.aClass338_1) {
				Static30.aClass338_1.method8044(local29, local39);
			}
		}
		if (arg7 == null) {
			return local39;
		} else {
			local39 = local39.method5211((byte) 4, local16, true);
			arg7.method8978(0, local39);
			return local39;
		}
	}
}
