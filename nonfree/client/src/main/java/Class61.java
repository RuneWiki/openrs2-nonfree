import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class61 {

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
	protected boolean aBoolean669 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	protected Class61() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!bc;I)V")
	public abstract void method7587(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class20_Sub3 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7588(@OriginalArg(0) Class209 arg0);

	@OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
	public abstract void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	public abstract void method7589();

	@OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
	protected abstract void L();

	@OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!da", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public abstract Class1_Sub3_Sub4 S(@OriginalArg(0) Class1_Sub3_Sub4 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!da;")
	public abstract Class61 method7591(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!bc;II)V")
	public abstract void method7592(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class20_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!ws;II[ZLclient!ms;Z[IZILclient!ws;I)V")
	private void method7593(@OriginalArg(0) int arg0, @OriginalArg(1) Class363 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) Class1_Sub31 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class363 arg10) {
		@Pc(14) int local14;
		if (arg1 == null || arg0 == 0) {
			for (local14 = 0; local14 < arg10.anInt9533; local14++) {
				@Pc(21) short local21 = arg10.aShortArray130[local14];
				if (arg4 == null || arg6 == arg4[local21] || arg5.anIntArray404[local21] == 0) {
					@Pc(45) short local45 = arg10.aShortArray134[local14];
					if (local45 != -1) {
						this.method7598(arg8, 0, arg5.anIntArrayArray40[local45], arg7, 0, 0, arg3, arg5.anIntArray405[local45] & arg2, 0);
					}
					this.method7598(arg8, arg10.aShortArray129[local14], arg5.anIntArrayArray40[local21], arg7, arg5.anIntArray404[local21], arg10.aShortArray133[local14], arg3, arg5.anIntArray405[local21] & arg2, arg10.aShortArray136[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(122) int local122 = 0;
		for (@Pc(124) int local124 = 0; local124 < arg5.anInt5963; local124++) {
			@Pc(128) boolean local128 = false;
			if (arg10.anInt9533 > local14 && local124 == arg10.aShortArray130[local14]) {
				local128 = true;
			}
			@Pc(146) boolean local146 = false;
			if (local122 < arg1.anInt9533 && local124 == arg1.aShortArray130[local122]) {
				local146 = true;
			}
			if (local128 || local146) {
				if (arg4 == null || arg4[local124] == arg6 || arg5.anIntArray404[local124] == 0) {
					@Pc(188) short local188 = 0;
					@Pc(193) int local193 = arg5.anIntArray404[local124];
					if (local193 == 3 || local193 == 10) {
						local188 = 128;
					}
					@Pc(211) short local211;
					@Pc(205) short local205;
					@Pc(213) short local213;
					@Pc(207) short local207;
					@Pc(209) byte local209;
					if (local128) {
						local209 = arg10.aByteArray103[local14];
						local213 = arg10.aShortArray136[local14];
						local211 = arg10.aShortArray133[local14];
						local205 = arg10.aShortArray129[local14];
						local207 = arg10.aShortArray134[local14];
						local14++;
					} else {
						local205 = local188;
						local207 = -1;
						local209 = 0;
						local211 = local188;
						local213 = local188;
					}
					@Pc(248) short local248;
					@Pc(263) short local263;
					@Pc(268) short local268;
					@Pc(258) short local258;
					@Pc(253) byte local253;
					if (local146) {
						local248 = arg1.aShortArray133[local122];
						local253 = arg1.aByteArray103[local122];
						local258 = arg1.aShortArray134[local122];
						local263 = arg1.aShortArray129[local122];
						local268 = arg1.aShortArray136[local122];
						local122++;
					} else {
						local263 = local188;
						local258 = -1;
						local253 = 0;
						local248 = local188;
						local268 = local188;
					}
					if (local207 != -1) {
						this.method7598(arg8, 0, arg5.anIntArrayArray40[local207], arg7, 0, 0, arg3, arg2 & arg5.anIntArray405[local207], 0);
					} else if (local258 != -1) {
						this.method7598(arg8, 0, arg5.anIntArrayArray40[local258], arg7, 0, 0, arg3, arg2 & arg5.anIntArray405[local258], 0);
					}
					@Pc(350) int local350;
					@Pc(346) int local346;
					@Pc(348) int local348;
					if ((local209 & 0x2) == 0 && (local253 & 0x1) == 0) {
						@Pc(370) int local370;
						if (local193 == 2) {
							local370 = local248 - local211 & 0x3FFF;
							@Pc(484) int local484 = local263 - local205 & 0x3FFF;
							if (local370 >= 8192) {
								local370 -= 16384;
							}
							if (local484 >= 8192) {
								local484 -= 16384;
							}
							@Pc(501) int local501 = local268 - local213 & 0x3FFF;
							if (local501 >= 8192) {
								local501 -= 16384;
							}
							local350 = local211 + arg0 * local370 / arg9 & 0x3FFF;
							local346 = local484 * arg0 / arg9 + local205 & 0x3FFF;
							local348 = local213 + local501 * arg0 / arg9 & 0x3FFF;
						} else if (local193 == 9) {
							local370 = local248 - local211 & 0x3FFF;
							if (local370 >= 8192) {
								local370 -= 16384;
							}
							local350 = local370 * arg0 / arg9 + local211 & 0x3FFF;
							local348 = 0;
							local346 = 0;
						} else if (local193 == 7) {
							local370 = local248 - local211 & 0x3F;
							if (local370 >= 32) {
								local370 -= 64;
							}
							local350 = local211 + arg0 * local370 / arg9 & 0x3F;
							local348 = arg0 * (local268 - local213) / arg9 + local213;
							local346 = arg0 * (local263 - local205) / arg9 + local205;
						} else {
							local346 = (local263 - local205) * arg0 / arg9 + local205;
							local350 = arg0 * (local248 - local211) / arg9 + local211;
							local348 = arg0 * (local268 - local213) / arg9 + local213;
						}
					} else {
						local346 = local205;
						local348 = local213;
						local350 = local211;
					}
					this.method7598(arg8, local346, arg5.anIntArrayArray40[local124], arg7, local193, local350, arg3, arg5.anIntArray405[local124] & arg2, local348);
				} else {
					if (local146) {
						local122++;
					}
					if (local128) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILclient!nt;)V")
	public final void method7594(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3_Sub13 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method7603();
		if (!this.F()) {
			this.method7605();
			return;
		}
		@Pc(29) Class363 local29 = arg1.aClass363Array1[arg0];
		@Pc(32) Class1_Sub31 local32 = local29.aClass1_Sub31_1;
		for (@Pc(34) int local34 = 0; local34 < local29.anInt9533; local34++) {
			@Pc(41) short local41 = local29.aShortArray130[local34];
			if (local32.aBooleanArray17[local41]) {
				if (local29.aShortArray134[local34] != -1) {
					this.WA(0, 0, 0, 0);
				}
				this.WA(local32.anIntArray404[local41], local29.aShortArray133[local34], local29.aShortArray129[local34], local29.aShortArray136[local34]);
			}
		}
		this.L();
		this.method7605();
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()[Lclient!mp;")
	public abstract Class219[] method7597();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI[I[IIZIIII)V")
	private void method7598(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(21) int local21;
		if (arg6 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local21 = -arg5;
				arg5 = arg8;
				arg8 = local21;
			} else if (arg4 == 3) {
				local21 = arg5;
				arg5 = arg8;
				arg8 = local21;
			} else if (arg4 == 2) {
				local21 = arg5;
				arg5 = -arg8 & 0x3FFF;
				arg8 = local21 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg5 = -arg5;
				arg8 = -arg8;
			} else if (arg4 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local21 = arg5;
				arg5 = -arg8;
				arg8 = local21;
			} else if (arg4 == 3) {
				local21 = arg5;
				arg5 = arg8;
				arg8 = local21;
			} else if (arg4 == 2) {
				local21 = arg5;
				arg5 = arg8 & 0x3FFF;
				arg8 = -local21 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method7600(arg4, arg2, arg5, arg1, arg8, arg6, arg0);
		} else {
			this.B(arg4, arg2, arg5, arg1, arg8, arg0, arg7, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
	public abstract void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()[Lclient!fk;")
	public abstract Class101[] method7599();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7600(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
	public abstract boolean method7602();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
	protected abstract void method7603();

	@OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
	public abstract int za();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!i;IIIIIII)V")
	protected final void method7604(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg6 / 2;
		@Pc(21) int local21 = -arg0 / 2;
		@Pc(37) int local37 = arg1.method6637(arg5 + local16, arg2 + local21);
		@Pc(41) int local41 = arg6 / 2;
		@Pc(46) int local46 = -arg0 / 2;
		@Pc(58) int local58 = arg1.method6637(local41 + arg5, local46 + arg2);
		@Pc(63) int local63 = -arg6 / 2;
		@Pc(67) int local67 = arg0 / 2;
		@Pc(77) int local77 = arg1.method6637(arg5 + local63, local67 + arg2);
		@Pc(81) int local81 = arg6 / 2;
		@Pc(85) int local85 = arg0 / 2;
		@Pc(97) int local97 = arg1.method6637(arg5 + local81, arg2 - -local85);
		@Pc(108) int local108 = local58 > local37 ? local37 : local58;
		@Pc(119) int local119 = local77 >= local97 ? local97 : local77;
		@Pc(130) int local130 = local58 >= local97 ? local97 : local58;
		@Pc(137) int local137 = local37 < local77 ? local37 : local77;
		@Pc(170) int local170;
		if (arg0 != 0) {
			@Pc(153) int local153 = (int) (Math.atan2((double) (local108 - local119), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local153 != 0) {
				if (arg3 != 0) {
					if (local153 > 8192) {
						local170 = 16384 - arg3;
						if (local170 > local153) {
							local153 = local170;
						}
					} else if (arg3 < local153) {
						local153 = arg3;
					}
				}
				this.MA(local153);
			}
		}
		@Pc(194) int local194 = local37 + local97;
		if (arg6 != 0) {
			@Pc(210) int local210 = (int) (Math.atan2((double) (local137 - local130), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local210 != 0) {
				if (arg7 != 0) {
					if (local210 > 8192) {
						local170 = 16384 - arg7;
						if (local170 > local210) {
							local210 = local170;
						}
					} else if (arg7 < local210) {
						local210 = arg7;
					}
				}
				this.W(local210);
			}
		}
		if (local58 + local77 < local194) {
			local194 = local58 + local77;
		}
		local194 = (local194 >> 1) - arg4;
		if (local194 != 0) {
			this.oa(0, local194, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
	protected abstract void method7605();

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
	public abstract int KA();

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;ZI)Z")
	public abstract boolean method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
	public abstract void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public abstract void method7607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
	public abstract void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
	protected abstract void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
	public abstract boolean LA();

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
	protected abstract boolean F();

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZBIIILclient!nt;Lclient!nt;ILclient!nt;IIILclient!nt;I[Z)V")
	public final void method7608(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub3_Sub13 arg4, @OriginalArg(6) Class1_Sub3_Sub13 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub3_Sub13 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class1_Sub3_Sub13 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean[] arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg13 == null || arg8 == -1) {
			this.method7611(arg0, arg6, arg1, 0, arg5, arg4, arg3, arg12);
			return;
		}
		this.method7603();
		if (!this.F()) {
			this.method7605();
			return;
		}
		@Pc(39) Class363 local39 = arg4.aClass363Array1[arg1];
		@Pc(42) Class1_Sub31 local42 = local39.aClass1_Sub31_1;
		@Pc(48) Class363 local48 = null;
		if (arg5 != null) {
			local48 = arg5.aClass363Array1[arg3];
			if (local42 != local48.aClass1_Sub31_1) {
				local48 = null;
			}
		}
		this.method7593(arg6, local48, 65535, 0, arg13, local42, false, null, arg0, arg12, local39);
		@Pc(80) Class363 local80 = arg7.aClass363Array1[arg8];
		@Pc(82) Class363 local82 = null;
		if (arg11 != null) {
			local82 = arg11.aClass363Array1[arg9];
			if (local42 != local82.aClass1_Sub31_1) {
				local82 = null;
			}
		}
		this.method7600(0, new int[0], 0, 0, 0, 0, arg0);
		this.method7593(arg2, local82, 65535, 0, arg13, local80.aClass1_Sub31_1, true, null, arg0, arg10, local80);
		this.L();
		this.method7605();
	}

	@OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
	public abstract void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
	public abstract void FA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	public abstract void method7609(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!nt;I[IIZLclient!nt;II)V")
	public final void method7610(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class1_Sub3_Sub13 arg7, @OriginalArg(9) int arg8) {
		if (arg8 == -1) {
			return;
		}
		this.method7603();
		if (!this.F()) {
			this.method7605();
			return;
		}
		@Pc(25) Class363 local25 = arg7.aClass363Array1[arg8];
		@Pc(28) Class1_Sub31 local28 = local25.aClass1_Sub31_1;
		@Pc(30) Class363 local30 = null;
		if (arg2 != null) {
			local30 = arg2.aClass363Array1[arg1];
			if (local28 != local30.aClass1_Sub31_1) {
				local30 = null;
			}
		}
		this.method7593(arg0, local30, arg3, 0, null, local28, false, arg4, arg6, arg5, local25);
		this.L();
		this.method7605();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIILclient!nt;Lclient!nt;II)V")
	public final void method7611(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub3_Sub13 arg4, @OriginalArg(6) Class1_Sub3_Sub13 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1) {
			return;
		}
		this.method7603();
		if (!this.F()) {
			this.method7605();
			return;
		}
		@Pc(21) Class363 local21 = arg5.aClass363Array1[arg2];
		@Pc(24) Class1_Sub31 local24 = local21.aClass1_Sub31_1;
		@Pc(30) Class363 local30 = null;
		if (arg4 != null) {
			local30 = arg4.aClass363Array1[arg6];
			if (local24 != local30.aClass1_Sub31_1) {
				local30 = null;
			}
		}
		this.method7593(arg1, local30, 65535, arg3, null, local24, false, null, arg0, arg7, local21);
		this.L();
		this.method7605();
	}

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	public abstract int OA();
}
