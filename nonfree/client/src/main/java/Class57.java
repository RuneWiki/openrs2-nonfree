import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class57 {

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
	protected boolean aBoolean706 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	protected Class57() {
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
	public abstract void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!ql;I)V")
	public abstract void method7501(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7502(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
	public abstract void FA();

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()[Lclient!tk;")
	public abstract Class323[] method7503();

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
	public abstract void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
	public abstract int za();

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
	protected abstract boolean F();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	protected abstract void method7508();

	@OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;ZI)Z")
	public abstract boolean method7509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!rc;I)V")
	public final void method7510(@OriginalArg(1) Class3_Sub3_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7508();
		if (!this.F()) {
			this.method7513();
			return;
		}
		@Pc(24) Class76 local24 = arg0.aClass76Array1[arg1];
		@Pc(27) Class3_Sub14 local27 = local24.aClass3_Sub14_1;
		for (@Pc(29) int local29 = 0; local29 < local24.anInt2656; local29++) {
			@Pc(36) short local36 = local24.aShortArray52[local29];
			if (local27.aBooleanArray3[local36]) {
				if (local24.aShortArray53[local29] != -1) {
					this.WA(0, 0, 0, 0);
				}
				this.WA(local27.anIntArray122[local36], local24.aShortArray54[local29], local24.aShortArray57[local29], local24.aShortArray50[local29]);
			}
		}
		this.L();
		this.method7513();
	}

	@OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
	protected abstract void L();

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIZI[ZLclient!rc;IILclient!rc;Lclient!rc;ILclient!rc;II)V")
	public final void method7511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) Class3_Sub3_Sub15 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3_Sub3_Sub15 arg8, @OriginalArg(10) Class3_Sub3_Sub15 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class3_Sub3_Sub15 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg12 == -1) {
			return;
		}
		if (arg5 == null || arg10 == -1) {
			this.method7527(arg11, arg3, arg2, 0, arg13, arg0, arg12, arg9);
			return;
		}
		this.method7508();
		if (!this.F()) {
			this.method7513();
			return;
		}
		@Pc(39) Class76 local39 = arg9.aClass76Array1[arg12];
		@Pc(42) Class3_Sub14 local42 = local39.aClass3_Sub14_1;
		@Pc(50) Class76 local50 = null;
		if (arg11 != null) {
			local50 = arg11.aClass76Array1[arg2];
			if (local50.aClass3_Sub14_1 != local42) {
				local50 = null;
			}
		}
		this.method7515(65535, arg0, arg13, 0, arg5, local39, local42, local50, null, false, arg3);
		@Pc(82) Class76 local82 = arg6.aClass76Array1[arg10];
		@Pc(84) Class76 local84 = null;
		if (arg8 != null) {
			local84 = arg8.aClass76Array1[arg4];
			if (local42 != local84.aClass3_Sub14_1) {
				local84 = null;
			}
		}
		this.method7502(0, new int[0], 0, 0, 0, 0, arg3);
		this.method7515(65535, arg7, arg1, 0, arg5, local82, local82.aClass3_Sub14_1, local84, null, true, arg3);
		this.L();
		this.method7513();
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	protected abstract void method7513();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIILclient!i;III)V")
	protected final void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class139 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg4 / 2;
		@Pc(21) int local21 = -arg3 / 2;
		@Pc(32) int local32 = arg5.method6890(arg7 + local16, local21 + arg6);
		@Pc(36) int local36 = arg4 / 2;
		@Pc(41) int local41 = -arg3 / 2;
		@Pc(53) int local53 = arg5.method6890(arg7 + local36, arg6 - -local41);
		@Pc(58) int local58 = -arg4 / 2;
		@Pc(62) int local62 = arg3 / 2;
		@Pc(72) int local72 = arg5.method6890(local58 + arg7, arg6 + local62);
		@Pc(76) int local76 = arg4 / 2;
		@Pc(80) int local80 = arg3 / 2;
		@Pc(90) int local90 = arg5.method6890(arg7 + local76, local80 + arg6);
		@Pc(101) int local101 = local32 < local53 ? local32 : local53;
		@Pc(112) int local112 = local72 < local90 ? local72 : local90;
		@Pc(123) int local123 = local53 >= local90 ? local90 : local53;
		@Pc(165) int local165;
		if (arg3 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local101 - local112), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local140 != 0) {
				if (arg1 != 0) {
					if (local140 > 8192) {
						local165 = 16384 - arg1;
						if (local165 > local140) {
							local140 = local165;
						}
					} else if (local140 > arg1) {
						local140 = arg1;
					}
				}
				this.MA(local140);
			}
		}
		@Pc(184) int local184 = local72 > local32 ? local32 : local72;
		if (arg4 != 0) {
			@Pc(200) int local200 = (int) (Math.atan2((double) (local184 - local123), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local200 != 0) {
				if (arg2 != 0) {
					if (local200 > 8192) {
						local165 = 16384 - arg2;
						if (local200 < local165) {
							local200 = local165;
						}
					} else if (local200 > arg2) {
						local200 = arg2;
					}
				}
				this.W(local200);
			}
		}
		@Pc(230) int local230 = local90 + local32;
		if (local72 + local53 < local230) {
			local230 = local53 + local72;
		}
		local230 = (local230 >> 1) - arg0;
		if (local230 != 0) {
			this.oa(0, local230, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
	public abstract void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
	public abstract void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
	public abstract void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII[ZLclient!eg;Lclient!cs;Lclient!eg;[IZZ)V")
	private void method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean[] arg4, @OriginalArg(6) Class76 arg5, @OriginalArg(7) Class3_Sub14 arg6, @OriginalArg(8) Class76 arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) boolean arg10) {
		@Pc(11) int local11;
		if (arg7 == null || arg1 == 0) {
			for (local11 = 0; local11 < arg5.anInt2656; local11++) {
				@Pc(18) short local18 = arg5.aShortArray52[local11];
				if (arg4 == null || arg4[local18] == arg9 || arg6.anIntArray122[local18] == 0) {
					@Pc(38) short local38 = arg5.aShortArray53[local11];
					if (local38 != -1) {
						this.method7519(arg6.anIntArrayArray8[local38], 0, 0, 0, arg0 & arg6.anIntArray124[local38], 0, arg3, arg10, arg8);
					}
					this.method7519(arg6.anIntArrayArray8[local18], arg5.aShortArray57[local11], arg5.aShortArray54[local11], arg6.anIntArray122[local18], arg6.anIntArray124[local18] & arg0, arg5.aShortArray50[local11], arg3, arg10, arg8);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(107) int local107 = 0;
		for (@Pc(109) int local109 = 0; local109 < arg6.anInt1981; local109++) {
			@Pc(113) boolean local113 = false;
			if (arg5.anInt2656 > local11 && arg5.aShortArray52[local11] == local109) {
				local113 = true;
			}
			@Pc(135) boolean local135 = false;
			if (arg7.anInt2656 > local107 && arg7.aShortArray52[local107] == local109) {
				local135 = true;
			}
			if (local113 || local135) {
				if (arg4 == null || arg4[local109] == arg9 || arg6.anIntArray122[local109] == 0) {
					@Pc(184) short local184 = 0;
					@Pc(189) int local189 = arg6.anIntArray122[local109];
					if (local189 == 3 || local189 == 10) {
						local184 = 128;
					}
					@Pc(207) short local207;
					@Pc(205) short local205;
					@Pc(211) short local211;
					@Pc(209) short local209;
					@Pc(203) byte local203;
					if (local113) {
						local205 = arg5.aShortArray57[local11];
						local209 = arg5.aShortArray53[local11];
						local211 = arg5.aShortArray50[local11];
						local207 = arg5.aShortArray54[local11];
						local203 = arg5.aByteArray24[local11];
						local11++;
					} else {
						local203 = 0;
						local205 = local184;
						local207 = local184;
						local209 = -1;
						local211 = local184;
					}
					@Pc(246) short local246;
					@Pc(266) short local266;
					@Pc(261) short local261;
					@Pc(256) short local256;
					@Pc(251) byte local251;
					if (local135) {
						local246 = arg7.aShortArray54[local107];
						local251 = arg7.aByteArray24[local107];
						local256 = arg7.aShortArray53[local107];
						local261 = arg7.aShortArray50[local107];
						local266 = arg7.aShortArray57[local107];
						local107++;
					} else {
						local266 = local184;
						local251 = 0;
						local261 = local184;
						local256 = -1;
						local246 = local184;
					}
					@Pc(350) int local350;
					@Pc(340) int local340;
					@Pc(360) int local360;
					if ((local203 & 0x2) == 0 && (local251 & 0x1) == 0) {
						@Pc(302) int local302;
						if (local189 == 2) {
							local302 = local246 - local207 & 0x3FFF;
							@Pc(309) int local309 = local266 - local205 & 0x3FFF;
							@Pc(316) int local316 = local261 - local211 & 0x3FFF;
							if (local309 >= 8192) {
								local309 -= 16384;
							}
							if (local302 >= 8192) {
								local302 -= 16384;
							}
							if (local316 >= 8192) {
								local316 -= 16384;
							}
							local340 = local309 * arg1 / arg2 + local205 & 0x3FFF;
							local350 = local302 * arg1 / arg2 + local207 & 0x3FFF;
							local360 = arg1 * local316 / arg2 + local211 & 0x3FFF;
						} else if (local189 == 9) {
							local302 = local246 - local207 & 0x3FFF;
							if (local302 >= 8192) {
								local302 -= 16384;
							}
							local350 = local302 * arg1 / arg2 + local207 & 0x3FFF;
							local360 = 0;
							local340 = 0;
						} else if (local189 == 7) {
							local302 = local246 - local207 & 0x3F;
							if (local302 >= 32) {
								local302 -= 64;
							}
							local340 = (local266 - local205) * arg1 / arg2 + local205;
							local360 = arg1 * (local261 - local211) / arg2 + local211;
							local350 = local302 * arg1 / arg2 + local207 & 0x3F;
						} else {
							local350 = local207 + arg1 * (local246 - local207) / arg2;
							local360 = local211 + (local261 - local211) * arg1 / arg2;
							local340 = local205 + (local266 - local205) * arg1 / arg2;
						}
					} else {
						local350 = local207;
						local340 = local205;
						local360 = local211;
					}
					if (local209 != -1) {
						this.method7519(arg6.anIntArrayArray8[local209], 0, 0, 0, arg6.anIntArray124[local209] & arg0, 0, arg3, arg10, arg8);
					} else if (local256 != -1) {
						this.method7519(arg6.anIntArrayArray8[local256], 0, 0, 0, arg0 & arg6.anIntArray124[local256], 0, arg3, arg10, arg8);
					}
					this.method7519(arg6.anIntArrayArray8[local109], local340, local350, local189, arg6.anIntArray124[local109] & arg0, local360, arg3, arg10, arg8);
				} else {
					if (local113) {
						local11++;
					}
					if (local135) {
						local107++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
	public abstract int KA();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()[Lclient!aq;")
	public abstract Class15[] method7516();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
	public abstract void method7517();

	@OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
	public abstract boolean LA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IIIIIIIIZ[I)V")
	private void method7519(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int[] arg8) {
		@Pc(71) int local71;
		if (arg6 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local71 = -arg2;
				arg2 = arg5;
				arg5 = local71;
			} else if (arg3 == 3) {
				local71 = arg2;
				arg2 = arg5;
				arg5 = local71;
			} else if (arg3 == 2) {
				local71 = arg2;
				arg2 = -arg5 & 0x3FFF;
				arg5 = local71 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg2 = -arg2;
				arg5 = -arg5;
			} else if (arg3 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local71 = arg2;
				arg2 = -arg5;
				arg5 = local71;
			} else if (arg3 == 3) {
				local71 = arg2;
				arg2 = arg5;
				arg5 = local71;
			} else if (arg3 == 2) {
				local71 = arg2;
				arg2 = arg5 & 0x3FFF;
				arg5 = -local71 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.method7502(arg3, arg0, arg2, arg1, arg5, arg6, arg7);
		} else {
			this.B(arg3, arg0, arg2, arg1, arg5, arg7, arg4, arg8);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[IIIIILclient!rc;IILclient!rc;I)V")
	public final void method7520(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub3_Sub15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3_Sub3_Sub15 arg8) {
		if (arg3 == -1) {
			return;
		}
		this.method7508();
		if (!this.F()) {
			this.method7513();
			return;
		}
		@Pc(20) Class76 local20 = arg5.aClass76Array1[arg3];
		@Pc(23) Class3_Sub14 local23 = local20.aClass3_Sub14_1;
		@Pc(29) Class76 local29 = null;
		if (arg8 != null) {
			local29 = arg8.aClass76Array1[arg7];
			if (local23 != local29.aClass3_Sub14_1) {
				local29 = null;
			}
		}
		this.method7515(arg4, arg2, arg6, 0, null, local20, local23, local29, arg1, false, arg0);
		this.L();
		this.method7513();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!ql;II)V")
	public abstract void method7521(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class9_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!da;")
	public abstract Class57 method7522(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!da", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public abstract Class3_Sub3_Sub10 S(@OriginalArg(0) Class3_Sub3_Sub10 arg0);

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
	protected abstract void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public abstract void method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	public abstract void method7524(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7525(@OriginalArg(0) Class109 arg0);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
	public abstract boolean method7526();

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!rc;ZIIIIIILclient!rc;)V")
	public final void method7527(@OriginalArg(0) Class3_Sub3_Sub15 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub3_Sub15 arg7) {
		if (arg6 == -1) {
			return;
		}
		this.method7508();
		if (!this.F()) {
			this.method7513();
			return;
		}
		@Pc(25) Class76 local25 = arg7.aClass76Array1[arg6];
		@Pc(28) Class3_Sub14 local28 = local25.aClass3_Sub14_1;
		@Pc(30) Class76 local30 = null;
		if (arg0 != null) {
			local30 = arg0.aClass76Array1[arg2];
			if (local30.aClass3_Sub14_1 != local28) {
				local30 = null;
			}
		}
		this.method7515(65535, arg5, arg4, arg3, null, local25, local28, local30, null, false, arg1);
		this.L();
		this.method7513();
	}
}
