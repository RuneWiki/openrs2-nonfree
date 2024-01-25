import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class22 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class22() {
	}

	@OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
	protected abstract void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!qn;I)V")
	public abstract void method4689(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class102_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
	public abstract int u();

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public abstract void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
	protected abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III[ILclient!fv;ZIIILclient!fv;B)V")
	public final void method4691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class6_Sub1_Sub7 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6_Sub1_Sub7 arg8) {
		if (arg1 == -1 || !this.Q()) {
			return;
		}
		@Pc(20) Class342 local20 = arg8.aClass342Array1[arg1];
		@Pc(23) Class6_Sub35 local23 = local20.aClass6_Sub35_1;
		@Pc(25) Class342 local25 = null;
		if (arg3 != null) {
			local25 = arg3.aClass342Array1[arg0];
			if (local25.aClass6_Sub35_1 != local23) {
				local25 = null;
			}
		}
		this.method4694(arg4, arg6, arg5, local20, arg7, arg2, 0, null, local23, false, local25);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
	public abstract void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()[Lclient!pp;")
	public abstract Class250[] method4692();

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
	public abstract void P();

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
	public abstract int h();

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
	public abstract void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
	public abstract int LA();

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
	public abstract void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	public abstract void method4693(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) Class60 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIZLclient!we;I[II[ZLclient!mf;ZLclient!we;)V")
	private void method4694(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class342 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) Class6_Sub35 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class342 arg10) {
		@Pc(11) int local11;
		if (arg10 == null || arg2 == 0) {
			for (local11 = 0; local11 < arg3.anInt9372; local11++) {
				@Pc(18) short local18 = arg3.aShortArray153[local11];
				if (arg7 == null || arg7[local18] == arg9 || arg8.anIntArray510[local18] == 0) {
					@Pc(39) short local39 = arg3.aShortArray154[local11];
					if (local39 != -1) {
						this.method4705(arg8.anIntArrayArray65[local39], arg4 & arg8.anIntArray511[local39], 0, 0, 0, arg5, 0, arg6, arg0);
					}
					this.method4705(arg8.anIntArrayArray65[local18], arg4 & arg8.anIntArray511[local18], arg3.aShortArray146[local11], arg8.anIntArray510[local18], arg3.aShortArray149[local11], arg5, arg3.aShortArray147[local11], arg6, arg0);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(105) int local105 = 0;
		for (@Pc(107) int local107 = 0; local107 < arg8.anInt5527; local107++) {
			@Pc(116) boolean local116 = false;
			if (arg3.anInt9372 > local11 && local107 == arg3.aShortArray153[local11]) {
				local116 = true;
			}
			@Pc(138) boolean local138 = false;
			if (local105 < arg10.anInt9372 && local107 == arg10.aShortArray153[local105]) {
				local138 = true;
			}
			if (local116 || local138) {
				if (arg7 == null || arg9 == arg7[local107] || arg8.anIntArray510[local107] == 0) {
					@Pc(184) short local184 = 0;
					@Pc(189) int local189 = arg8.anIntArray510[local107];
					if (local189 == 3 || local189 == 10) {
						local184 = 128;
					}
					@Pc(209) short local209;
					@Pc(207) short local207;
					@Pc(211) short local211;
					@Pc(205) short local205;
					@Pc(213) byte local213;
					if (local116) {
						local211 = arg3.aShortArray146[local11];
						local213 = arg3.aByteArray124[local11];
						local209 = arg3.aShortArray147[local11];
						local205 = arg3.aShortArray154[local11];
						local207 = arg3.aShortArray149[local11];
						local11++;
					} else {
						local205 = -1;
						local207 = local184;
						local209 = local184;
						local211 = local184;
						local213 = 0;
					}
					@Pc(263) short local263;
					@Pc(248) short local248;
					@Pc(258) short local258;
					@Pc(253) short local253;
					@Pc(268) byte local268;
					if (local138) {
						local248 = arg10.aShortArray149[local105];
						local253 = arg10.aShortArray154[local105];
						local258 = arg10.aShortArray146[local105];
						local263 = arg10.aShortArray147[local105];
						local268 = arg10.aByteArray124[local105];
						local105++;
					} else {
						local253 = -1;
						local268 = 0;
						local258 = local184;
						local248 = local184;
						local263 = local184;
					}
					@Pc(319) int local319;
					@Pc(309) int local309;
					@Pc(308) int local308;
					if ((local213 & 0x2) == 0 && (local268 & 0x1) == 0) {
						@Pc(301) int local301;
						if (local189 == 2) {
							local301 = local263 - local209 & 0x3FFF;
							@Pc(419) int local419 = local248 - local207 & 0x3FFF;
							@Pc(426) int local426 = local258 - local211 & 0x3FFF;
							if (local301 >= 8192) {
								local301 -= 16384;
							}
							if (local419 >= 8192) {
								local419 -= 16384;
							}
							if (local426 >= 8192) {
								local426 -= 16384;
							}
							local319 = arg2 * local301 / arg1 + local209 & 0x3FFF;
							local309 = arg2 * local419 / arg1 + local207 & 0x3FFF;
							local308 = local426 * arg2 / arg1 + local211 & 0x3FFF;
						} else if (local189 == 9) {
							local301 = local263 - local209 & 0x3FFF;
							if (local301 >= 8192) {
								local301 -= 16384;
							}
							local308 = 0;
							local309 = 0;
							local319 = arg2 * local301 / arg1 + local209 & 0x3FFF;
						} else if (local189 == 7) {
							local301 = local263 - local209 & 0x3F;
							if (local301 >= 32) {
								local301 -= 64;
							}
							local308 = local211 + (local258 - local211) * arg2 / arg1;
							local319 = arg2 * local301 / arg1 + local209 & 0x3F;
							local309 = (local248 - local207) * arg2 / arg1 + local207;
						} else {
							local308 = arg2 * (local258 - local211) / arg1 + local211;
							local319 = local209 + arg2 * (local263 - local209) / arg1;
							local309 = arg2 * (local248 - local207) / arg1 + local207;
						}
					} else {
						local309 = local207;
						local319 = local209;
						local308 = local211;
					}
					if (local205 != -1) {
						this.method4705(arg8.anIntArrayArray65[local205], arg8.anIntArray511[local205] & arg4, 0, 0, 0, arg5, 0, arg6, arg0);
					} else if (local253 != -1) {
						this.method4705(arg8.anIntArrayArray65[local253], arg4 & arg8.anIntArray511[local253], 0, 0, 0, arg5, 0, arg6, arg0);
					}
					this.method4705(arg8.anIntArrayArray65[local107], arg8.anIntArray511[local107] & arg4, local308, local189, local309, arg5, local319, arg6, arg0);
				} else {
					if (local138) {
						local105++;
					}
					if (local116) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
	public abstract int ha();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!fv;ZI)V")
	public final void method4695(@OriginalArg(0) Class6_Sub1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.Q()) {
			return;
		}
		@Pc(24) Class342 local24 = arg0.aClass342Array1[arg1];
		@Pc(27) Class6_Sub35 local27 = local24.aClass6_Sub35_1;
		for (@Pc(29) int local29 = 0; local29 < local24.anInt9372; local29++) {
			@Pc(36) short local36 = local24.aShortArray153[local29];
			if (local27.aBooleanArray31[local36]) {
				if (local24.aShortArray154[local29] != -1) {
					this.ua(0, 0, 0, 0);
				}
				this.ua(local27.anIntArray510[local36], local24.aShortArray147[local29], local24.aShortArray149[local29], local24.aShortArray146[local29]);
			}
		}
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
	public abstract void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIBIIIILclient!d;)V")
	protected final void method4696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class60 arg7) {
		@Pc(16) int local16 = -arg0 / 2;
		@Pc(21) int local21 = -arg2 / 2;
		@Pc(31) int local31 = arg7.sa(local16 + arg3, arg6 - -local21);
		@Pc(35) int local35 = arg0 / 2;
		@Pc(40) int local40 = -arg2 / 2;
		@Pc(50) int local50 = arg7.sa(local35 + arg3, arg6 - -local40);
		@Pc(55) int local55 = -arg0 / 2;
		@Pc(59) int local59 = arg2 / 2;
		@Pc(68) int local68 = arg7.sa(arg3 + local55, local59 + arg6);
		@Pc(72) int local72 = arg0 / 2;
		@Pc(76) int local76 = arg2 / 2;
		@Pc(87) int local87 = arg7.sa(arg3 + local72, arg6 - -local76);
		@Pc(98) int local98 = local50 <= local31 ? local50 : local31;
		@Pc(111) int local111 = local68 >= local87 ? local87 : local68;
		@Pc(118) int local118 = local50 < local87 ? local50 : local87;
		@Pc(129) int local129 = local31 < local68 ? local31 : local68;
		@Pc(167) int local167;
		if (arg2 != 0) {
			@Pc(148) int local148 = (int) (Math.atan2((double) (local98 - local111), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local148 != 0) {
				if (arg4 != 0) {
					if (local148 > 8192) {
						local167 = 16384 - arg4;
						if (local148 < local167) {
							local148 = local167;
						}
					} else if (local148 > arg4) {
						local148 = arg4;
					}
				}
				this.AA(local148);
			}
		}
		if (arg0 != 0) {
			@Pc(198) int local198 = (int) (Math.atan2((double) (local129 - local118), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local198 != 0) {
				if (arg1 != 0) {
					if (local198 > 8192) {
						local167 = 16384 - arg1;
						if (local198 < local167) {
							local198 = local167;
						}
					} else if (arg1 < local198) {
						local198 = arg1;
					}
				}
				this.v(local198);
			}
		}
		@Pc(238) int local238 = local31 + local87;
		if (local238 > local50 + local68) {
			local238 = local50 + local68;
		}
		local238 = (local238 >> 1) - arg5;
		if (local238 != 0) {
			this.m(0, local238, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
	public abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!fv;I[ZIILclient!fv;ILclient!fv;IIIIILclient!fv;Z)V")
	public final void method4697(@OriginalArg(0) Class6_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub1_Sub7 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6_Sub1_Sub7 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class6_Sub1_Sub7 arg12, @OriginalArg(14) boolean arg13) {
		if (arg3 == -1) {
			return;
		}
		if (arg2 == null || arg7 == -1) {
			this.method4700(0, arg8, arg9, arg11, arg6, arg12, arg13, arg3);
		} else if (this.Q()) {
			@Pc(33) Class342 local33 = arg6.aClass342Array1[arg3];
			@Pc(36) Class6_Sub35 local36 = local33.aClass6_Sub35_1;
			@Pc(38) Class342 local38 = null;
			if (arg12 != null) {
				local38 = arg12.aClass342Array1[arg8];
				if (local38.aClass6_Sub35_1 != local36) {
					local38 = null;
				}
			}
			this.method4694(arg13, arg9, arg11, local33, 65535, null, 0, arg2, local36, false, local38);
			@Pc(74) Class342 local74 = arg0.aClass342Array1[arg7];
			@Pc(76) Class342 local76 = null;
			if (arg4 != null) {
				local76 = arg4.aClass342Array1[arg5];
				if (local76.aClass6_Sub35_1 != local36) {
					local76 = null;
				}
			}
			this.E(0, new int[0], 0, 0, 0, 0, arg13);
			this.method4694(arg13, arg10, arg1, local74, 65535, null, 0, arg2, local74.aClass6_Sub35_1, true, local76);
			this.Y();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method4698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
	public abstract void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lclient!ba;")
	public abstract Class22 method4699(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public abstract Class6_Sub1_Sub12 Z(@OriginalArg(0) Class6_Sub1_Sub12 arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIILclient!fv;Lclient!fv;ZI)V")
	public final void method4700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub1_Sub7 arg4, @OriginalArg(6) Class6_Sub1_Sub7 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		if (arg7 == -1 || !this.Q()) {
			return;
		}
		@Pc(16) Class342 local16 = arg4.aClass342Array1[arg7];
		@Pc(19) Class6_Sub35 local19 = local16.aClass6_Sub35_1;
		@Pc(21) Class342 local21 = null;
		if (arg5 != null) {
			local21 = arg5.aClass342Array1[arg1];
			if (local19 != local21.aClass6_Sub35_1) {
				local21 = null;
			}
		}
		this.method4694(arg6, arg2, arg3, local16, 65535, null, arg0, null, local19, false, local21);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method4701(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!qn;II)V")
	public abstract void method4702(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class102_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([IIBIII[IIIZ)V")
	private void method4705(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(17) int local17;
		if (arg7 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local17 = -arg6;
				arg6 = arg2;
				arg2 = local17;
			} else if (arg3 == 3) {
				local17 = arg6;
				arg6 = arg2;
				arg2 = local17;
			} else if (arg3 == 2) {
				local17 = arg6;
				arg6 = -arg2 & 0x3FFF;
				arg2 = local17 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg6 = -arg6;
				arg2 = -arg2;
			} else if (arg3 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local17 = arg6;
				arg6 = -arg2;
				arg2 = local17;
			} else if (arg3 == 3) {
				local17 = arg6;
				arg6 = arg2;
				arg2 = local17;
			} else if (arg3 == 2) {
				local17 = arg6;
				arg6 = arg2 & 0x3FFF;
				arg2 = -local17 & 0x3FFF;
			}
		}
		if (arg1 == 65535) {
			this.E(arg3, arg0, arg6, arg4, arg2, arg7, arg8);
		} else {
			this.da(arg3, arg0, arg6, arg4, arg2, arg8, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()V")
	public abstract void method4706();

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()[Lclient!jq;")
	public abstract Class163[] method4708();

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
	protected abstract boolean Q();

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
	protected abstract void Y();

	@OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
	public abstract int F();

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()Z")
	public abstract boolean method4709();
}
