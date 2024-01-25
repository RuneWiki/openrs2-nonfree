import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class14 {

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
	protected boolean aBoolean722 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class14() {
	}

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	protected abstract void method8618();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method8619(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	public abstract void method8620();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dm;IZ)V")
	public abstract void method8621(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class14 method8622(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dm;Lclient!et;II)V")
	public abstract void method8623(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!dm;ZI)Z")
	public abstract boolean method8624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!dm;ZII)Z")
	public abstract boolean method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sk;IB)V")
	public final void method8626(@OriginalArg(0) Class2_Sub1_Sub18 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method8618();
		if (!this.NA()) {
			this.method8639();
			return;
		}
		@Pc(28) Class25 local28 = arg0.aClass25Array1[arg1];
		@Pc(31) Class2_Sub51 local31 = local28.aClass2_Sub51_1;
		for (@Pc(33) int local33 = 0; local33 < local28.anInt541; local33++) {
			@Pc(40) short local40 = local28.aShortArray23[local33];
			if (local31.aBooleanArray64[local40]) {
				if (local28.aShortArray19[local33] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local31.anIntArray564[local40], local28.aShortArray24[local33], local28.aShortArray21[local33], local28.aShortArray27[local33]);
			}
		}
		this.wa();
		this.method8639();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!sk;IZIILclient!sk;II)V")
	public final void method8627(@OriginalArg(1) Class2_Sub1_Sub18 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub1_Sub18 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 == -1) {
			return;
		}
		this.method8618();
		if (!this.NA()) {
			this.method8639();
			return;
		}
		@Pc(22) Class25 local22 = arg0.aClass25Array1[arg3];
		@Pc(25) Class2_Sub51 local25 = local22.aClass2_Sub51_1;
		@Pc(27) Class25 local27 = null;
		if (arg5 != null) {
			local27 = arg5.aClass25Array1[arg6];
			if (local27.aClass2_Sub51_1 != local25) {
				local27 = null;
			}
		}
		this.method8628(65535, (boolean[]) null, arg4, arg2, arg7, local22, local27, local25, false, (int[]) null, arg1);
		this.wa();
		this.method8639();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[ZIZILclient!aw;Lclient!aw;Lclient!vca;ZB[II)V")
	private void method8628(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class25 arg5, @OriginalArg(6) Class25 arg6, @OriginalArg(7) Class2_Sub51 arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (arg6 == null || arg10 == 0) {
			for (local14 = 0; local14 < arg5.anInt541; local14++) {
				@Pc(21) short local21 = arg5.aShortArray23[local14];
				if (arg1 == null || arg1[local21] == arg8 || arg7.anIntArray564[local21] == 0) {
					@Pc(42) short local42 = arg5.aShortArray19[local14];
					if (local42 != -1) {
						this.method8640(0, 0, arg3, arg7.anIntArrayArray58[local42], arg0 & arg7.anIntArray563[local42], arg9, 0, 0, arg2);
					}
					this.method8640(arg7.anIntArray564[local21], arg5.aShortArray21[local14], arg3, arg7.anIntArrayArray58[local21], arg0 & arg7.anIntArray563[local21], arg9, arg5.aShortArray24[local14], arg5.aShortArray27[local14], arg2);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(114) int local114 = 0;
		for (@Pc(116) int local116 = 0; local116 < arg7.anInt10880; local116++) {
			@Pc(120) boolean local120 = false;
			if (local14 < arg5.anInt541 && arg5.aShortArray23[local14] == local116) {
				local120 = true;
			}
			@Pc(134) boolean local134 = false;
			if (arg6.anInt541 > local114 && local116 == arg6.aShortArray23[local114]) {
				local134 = true;
			}
			if (local120 || local134) {
				if (arg1 == null || arg8 == arg1[local116] || arg7.anIntArray564[local116] == 0) {
					@Pc(179) short local179 = 0;
					@Pc(184) int local184 = arg7.anIntArray564[local116];
					if (local184 == 3 || local184 == 10) {
						local179 = 128;
					}
					@Pc(221) short local221;
					@Pc(201) short local201;
					@Pc(211) short local211;
					@Pc(206) short local206;
					@Pc(216) byte local216;
					if (local120) {
						local201 = arg5.aShortArray21[local14];
						local206 = arg5.aShortArray19[local14];
						local211 = arg5.aShortArray27[local14];
						local216 = arg5.aByteArray12[local14];
						local221 = arg5.aShortArray24[local14];
						local14++;
					} else {
						local206 = -1;
						local201 = local179;
						local216 = 0;
						local221 = local179;
						local211 = local179;
					}
					@Pc(242) short local242;
					@Pc(238) short local238;
					@Pc(244) short local244;
					@Pc(246) short local246;
					@Pc(240) byte local240;
					if (local134) {
						local238 = arg6.aShortArray21[local114];
						local246 = arg6.aShortArray19[local114];
						local240 = arg6.aByteArray12[local114];
						local242 = arg6.aShortArray24[local114];
						local244 = arg6.aShortArray27[local114];
						local114++;
					} else {
						local238 = local179;
						local240 = 0;
						local242 = local179;
						local244 = local179;
						local246 = -1;
					}
					@Pc(290) int local290;
					@Pc(294) int local294;
					@Pc(292) int local292;
					if ((local216 & 0x2) == 0 && (local240 & 0x1) == 0) {
						@Pc(351) int local351;
						if (local184 == 2) {
							local351 = local242 - local221 & 0x3FFF;
							@Pc(433) int local433 = local238 - local201 & 0x3FFF;
							@Pc(440) int local440 = local244 - local211 & 0x3FFF;
							if (local433 >= 8192) {
								local433 -= 16384;
							}
							if (local351 >= 8192) {
								local351 -= 16384;
							}
							if (local440 >= 8192) {
								local440 -= 16384;
							}
							local290 = arg10 * local351 / arg4 + local221 & 0x3FFF;
							local294 = arg10 * local433 / arg4 + local201 & 0x3FFF;
							local292 = arg10 * local440 / arg4 + local211 & 0x3FFF;
						} else if (local184 == 9) {
							local351 = local242 - local221 & 0x3FFF;
							if (local351 >= 8192) {
								local351 -= 16384;
							}
							local290 = arg10 * local351 / arg4 + local221 & 0x3FFF;
							local292 = 0;
							local294 = 0;
						} else if (local184 == 7) {
							local351 = local242 - local221 & 0x3F;
							if (local351 >= 32) {
								local351 -= 64;
							}
							local294 = local201 + arg10 * (local238 - local201) / arg4;
							local292 = (local244 - local211) * arg10 / arg4 + local211;
							local290 = local221 + local351 * arg10 / arg4 & 0x3F;
						} else {
							local292 = local211 + (local244 - local211) * arg10 / arg4;
							local290 = arg10 * (local242 - local221) / arg4 + local221;
							local294 = arg10 * (local238 - local201) / arg4 + local201;
						}
					} else {
						local290 = local221;
						local292 = local211;
						local294 = local201;
					}
					if (local206 != -1) {
						this.method8640(0, 0, arg3, arg7.anIntArrayArray58[local206], arg0 & arg7.anIntArray563[local206], arg9, 0, 0, arg2);
					} else if (local246 != -1) {
						this.method8640(0, 0, arg3, arg7.anIntArrayArray58[local246], arg7.anIntArray563[local246] & arg0, arg9, 0, 0, arg2);
					}
					this.method8640(local184, local294, arg3, arg7.anIntArrayArray58[local116], arg7.anIntArray563[local116] & arg0, arg9, local290, local292, arg2);
				} else {
					if (local134) {
						local114++;
					}
					if (local120) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!pi;")
	public abstract Class283[] method8630();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method8631(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dm;)V")
	public abstract void method8632(@OriginalArg(0) Class76 arg0);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIIBILclient!sk;Lclient!sk;IIZ)V")
	public final void method8633(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class2_Sub1_Sub18 arg4, @OriginalArg(7) Class2_Sub1_Sub18 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) boolean arg8) {
		if (arg3 == -1) {
			return;
		}
		this.method8618();
		if (!this.NA()) {
			this.method8639();
			return;
		}
		@Pc(20) Class25 local20 = arg4.aClass25Array1[arg3];
		@Pc(23) Class2_Sub51 local23 = local20.aClass2_Sub51_1;
		@Pc(25) Class25 local25 = null;
		if (arg5 != null) {
			local25 = arg5.aClass25Array1[arg7];
			if (local23 != local25.aClass2_Sub51_1) {
				local25 = null;
			}
		}
		this.method8628(arg2, (boolean[]) null, 0, arg8, arg6, local20, local25, local23, false, arg0, arg1);
		this.wa();
		this.method8639();
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!gfa;")
	public abstract Class123[] method8634();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()Z")
	public abstract boolean method8635();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZIIILclient!sk;[ZLclient!sk;Lclient!sk;Lclient!sk;IIIII)V")
	public final void method8636(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub1_Sub18 arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) Class2_Sub1_Sub18 arg6, @OriginalArg(8) Class2_Sub1_Sub18 arg7, @OriginalArg(9) Class2_Sub1_Sub18 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg9 == -1) {
			return;
		}
		if (arg5 == null || arg13 == -1) {
			this.method8627(arg7, arg12, arg0, arg9, 0, arg4, arg2, arg1);
			return;
		}
		this.method8618();
		if (!this.NA()) {
			this.method8639();
			return;
		}
		@Pc(38) Class25 local38 = arg7.aClass25Array1[arg9];
		@Pc(41) Class2_Sub51 local41 = local38.aClass2_Sub51_1;
		@Pc(43) Class25 local43 = null;
		if (arg4 != null) {
			local43 = arg4.aClass25Array1[arg2];
			if (local43.aClass2_Sub51_1 != local41) {
				local43 = null;
			}
		}
		this.method8628(65535, arg5, 0, arg0, arg1, local38, local43, local41, false, (int[]) null, arg12);
		@Pc(75) Class25 local75 = arg6.aClass25Array1[arg13];
		@Pc(77) Class25 local77 = null;
		if (arg8 != null) {
			local77 = arg8.aClass25Array1[arg11];
			if (local41 != local77.aClass2_Sub51_1) {
				local77 = null;
			}
		}
		this.method8619(0, new int[0], 0, 0, 0, 0, arg0);
		this.method8628(65535, arg5, 0, arg0, arg10, local75, local77, local75.aClass2_Sub51_1, true, (int[]) null, arg3);
		this.wa();
		this.method8639();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIILclient!s;)V")
	protected final void method8637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class18 arg7) {
		@Pc(16) int local16 = -arg2 / 2;
		@Pc(21) int local21 = -arg3 / 2;
		@Pc(32) int local32 = arg7.method8542(arg6 + local21, arg5 - -local16);
		@Pc(36) int local36 = arg2 / 2;
		@Pc(41) int local41 = -arg3 / 2;
		@Pc(51) int local51 = arg7.method8542(arg6 + local41, local36 + arg5);
		@Pc(56) int local56 = -arg2 / 2;
		@Pc(64) int local64 = arg3 / 2;
		@Pc(74) int local74 = arg7.method8542(local64 + arg6, arg5 + local56);
		@Pc(78) int local78 = arg2 / 2;
		@Pc(82) int local82 = arg3 / 2;
		@Pc(92) int local92 = arg7.method8542(local82 + arg6, arg5 + local78);
		@Pc(103) int local103 = local51 <= local32 ? local51 : local32;
		@Pc(110) int local110 = local92 > local74 ? local74 : local92;
		@Pc(121) int local121 = local51 < local92 ? local51 : local92;
		@Pc(170) int local170;
		if (arg3 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local103 - local110), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local140 != 0) {
				if (arg4 != 0) {
					if (local140 > 8192) {
						local170 = 16384 - arg4;
						if (local140 < local170) {
							local140 = local170;
						}
					} else if (local140 > arg4) {
						local140 = arg4;
					}
				}
				this.FA(local140);
			}
		}
		@Pc(193) int local193 = local74 <= local32 ? local74 : local32;
		if (arg2 != 0) {
			@Pc(209) int local209 = (int) (Math.atan2((double) (local193 - local121), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local209 != 0) {
				if (arg0 != 0) {
					if (local209 > 8192) {
						local170 = 16384 - arg0;
						if (local170 > local209) {
							local209 = local170;
						}
					} else if (local209 > arg0) {
						local209 = arg0;
					}
				}
				this.VA(local209);
			}
		}
		@Pc(243) int local243 = local92 + local32;
		if (local74 + local51 < local243) {
			local243 = local51 + local74;
		}
		local243 = (local243 >> 1) - arg1;
		if (local243 != 0) {
			this.H(0, local243, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method8638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method8639();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class2_Sub1_Sub11 ba(@OriginalArg(0) Class2_Sub1_Sub11 arg0);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZ[II[IIIII)V")
	private void method8640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(24) int local24;
		if (arg8 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local24 = -arg6;
				arg6 = arg7;
				arg7 = local24;
			} else if (arg0 == 3) {
				local24 = arg6;
				arg6 = arg7;
				arg7 = local24;
			} else if (arg0 == 2) {
				local24 = arg6;
				arg6 = -arg7 & 0x3FFF;
				arg7 = local24 & 0x3FFF;
			}
		} else if (arg8 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg6 = -arg6;
				arg7 = -arg7;
			} else if (arg0 == 2) {
				arg6 = -arg6 & 0x3FFF;
				arg7 = -arg7 & 0x3FFF;
			}
		} else if (arg8 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local24 = arg6;
				arg6 = -arg7;
				arg7 = local24;
			} else if (arg0 == 3) {
				local24 = arg6;
				arg6 = arg7;
				arg7 = local24;
			} else if (arg0 == 2) {
				local24 = arg6;
				arg6 = arg7 & 0x3FFF;
				arg7 = -local24 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.method8619(arg0, arg3, arg6, arg1, arg7, arg8, arg2);
		} else {
			this.I(arg0, arg3, arg6, arg1, arg7, arg2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dm;Lclient!et;I)V")
	public abstract void method8641(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();
}
