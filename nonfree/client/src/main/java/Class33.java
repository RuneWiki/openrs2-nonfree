import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class33 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Z")
	protected boolean aBoolean762 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	protected Class33() {
	}

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIBILclient!i;I)V")
	protected final void method7179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class151 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(31) int local31 = arg6.method7680(local16 + arg3, local21 + arg0);
		@Pc(35) int local35 = arg1 / 2;
		@Pc(45) int local45 = -arg7 / 2;
		@Pc(55) int local55 = arg6.method7680(local35 + arg3, local45 + arg0);
		@Pc(60) int local60 = -arg1 / 2;
		@Pc(64) int local64 = arg7 / 2;
		@Pc(74) int local74 = arg6.method7680(local60 + arg3, local64 + arg0);
		@Pc(78) int local78 = arg1 / 2;
		@Pc(82) int local82 = arg7 / 2;
		@Pc(92) int local92 = arg6.method7680(local78 + arg3, local82 + arg0);
		@Pc(103) int local103 = local55 > local31 ? local31 : local55;
		@Pc(110) int local110 = local92 > local74 ? local74 : local92;
		@Pc(121) int local121 = local92 <= local55 ? local92 : local55;
		@Pc(132) int local132 = local74 <= local31 ? local74 : local31;
		@Pc(165) int local165;
		if (arg7 != 0) {
			@Pc(147) int local147 = (int) (Math.atan2((double) (local103 - local110), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local147 != 0) {
				if (arg2 != 0) {
					if (local147 > 8192) {
						local165 = 16384 - arg2;
						if (local147 < local165) {
							local147 = local165;
						}
					} else if (arg2 < local147) {
						local147 = arg2;
					}
				}
				this.MA(local147);
			}
		}
		@Pc(184) int local184 = local31 + local92;
		if (arg1 != 0) {
			@Pc(202) int local202 = (int) (Math.atan2((double) (local132 - local121), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local202 != 0) {
				if (arg4 != 0) {
					if (local202 > 8192) {
						local165 = 16384 - arg4;
						if (local165 > local202) {
							local202 = local165;
						}
					} else if (arg4 < local202) {
						local202 = arg4;
					}
				}
				this.W(local202);
			}
		}
		if (local184 > local74 + local55) {
			local184 = local55 + local74;
		}
		local184 = (local184 >> 1) - arg5;
		if (local184 != 0) {
			this.oa(0, local184, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
	public abstract void FA();

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(3) Class151 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()Z")
	public abstract boolean method7180();

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
	protected abstract void L();

	@OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
	public abstract void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
	protected abstract void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
	public abstract void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	public abstract void method7182();

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
	public abstract boolean LA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!qh;II)V")
	public abstract void method7183(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class12_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIILclient!ofa;Lclient!ofa;IIIZ)V")
	public final void method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub2_Sub15 arg3, @OriginalArg(4) Class2_Sub2_Sub15 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method7190();
		if (!this.F()) {
			this.method7205();
			return;
		}
		@Pc(22) Class95 local22 = arg4.aClass95Array1[arg1];
		@Pc(25) Class2_Sub18 local25 = local22.aClass2_Sub18_1;
		@Pc(27) Class95 local27 = null;
		if (arg3 != null) {
			local27 = arg3.aClass95Array1[arg6];
			if (local27.aClass2_Sub18_1 != local25) {
				local27 = null;
			}
		}
		this.method7187(null, false, arg2, 65535, local25, arg0, null, arg7, arg5, local22, local27);
		this.L();
		this.method7205();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!ofa;)V")
	public final void method7185(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub15 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method7190();
		if (!this.F()) {
			this.method7205();
			return;
		}
		@Pc(22) Class95 local22 = arg1.aClass95Array1[arg0];
		@Pc(25) Class2_Sub18 local25 = local22.aClass2_Sub18_1;
		for (@Pc(32) int local32 = 0; local32 < local22.anInt2101; local32++) {
			@Pc(39) short local39 = local22.aShortArray66[local32];
			if (local25.aBooleanArray8[local39]) {
				if (local22.aShortArray59[local32] != -1) {
					this.WA(0, 0, 0, 0);
				}
				this.WA(local25.anIntArray230[local39], local22.aShortArray58[local32], local22.aShortArray67[local32], local22.aShortArray61[local32]);
			}
		}
		this.L();
		this.method7205();
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
	public abstract void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
	public abstract void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIIII[IILclient!ofa;Lclient!ofa;)V")
	public final void method7186(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(9) Class2_Sub2_Sub15 arg7, @OriginalArg(10) Class2_Sub2_Sub15 arg8) {
		if (arg3 == -1) {
			return;
		}
		this.method7190();
		if (!this.F()) {
			this.method7205();
			return;
		}
		@Pc(21) Class95 local21 = arg7.aClass95Array1[arg3];
		@Pc(24) Class2_Sub18 local24 = local21.aClass2_Sub18_1;
		@Pc(26) Class95 local26 = null;
		if (arg8 != null) {
			local26 = arg8.aClass95Array1[arg5];
			if (local24 != local26.aClass2_Sub18_1) {
				local26 = null;
			}
		}
		this.method7187(null, false, 0, arg4, local24, arg2, arg6, arg0, arg1, local21, local26);
		this.L();
		this.method7205();
	}

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
	protected abstract boolean F();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([ZZIIBLclient!hba;I[IZILclient!eq;Lclient!eq;)V")
	private void method7187(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub18 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class95 arg9, @OriginalArg(11) Class95 arg10) {
		@Pc(11) int local11;
		if (arg10 == null || arg8 == 0) {
			for (local11 = 0; local11 < arg9.anInt2101; local11++) {
				@Pc(18) short local18 = arg9.aShortArray66[local11];
				if (arg0 == null || arg1 == arg0[local18] || arg4.anIntArray230[local18] == 0) {
					@Pc(43) short local43 = arg9.aShortArray59[local11];
					if (local43 != -1) {
						this.method7199(arg4.anIntArrayArray32[local43], 0, arg2, arg4.anIntArray231[local43] & arg3, arg7, 0, 0, 0, arg6);
					}
					this.method7199(arg4.anIntArrayArray32[local18], arg9.aShortArray58[local11], arg2, arg4.anIntArray231[local18] & arg3, arg7, arg9.aShortArray61[local11], arg9.aShortArray67[local11], arg4.anIntArray230[local18], arg6);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(120) int local120 = 0;
		for (@Pc(122) int local122 = 0; local122 < arg4.anInt2787; local122++) {
			@Pc(126) boolean local126 = false;
			if (local11 < arg9.anInt2101 && local122 == arg9.aShortArray66[local11]) {
				local126 = true;
			}
			@Pc(148) boolean local148 = false;
			if (local120 < arg10.anInt2101 && arg10.aShortArray66[local120] == local122) {
				local148 = true;
			}
			if (local126 || local148) {
				if (arg0 == null || arg0[local122] == arg1 || arg4.anIntArray230[local122] == 0) {
					@Pc(194) short local194 = 0;
					@Pc(199) int local199 = arg4.anIntArray230[local122];
					if (local199 == 3 || local199 == 10) {
						local194 = 128;
					}
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(238) short local238;
					@Pc(218) short local218;
					@Pc(233) byte local233;
					if (local126) {
						local218 = arg9.aShortArray59[local11];
						local223 = arg9.aShortArray58[local11];
						local228 = arg9.aShortArray67[local11];
						local233 = arg9.aByteArray37[local11];
						local238 = arg9.aShortArray61[local11];
						local11++;
					} else {
						local238 = local194;
						local218 = -1;
						local228 = local194;
						local223 = local194;
						local233 = 0;
					}
					@Pc(261) short local261;
					@Pc(263) short local263;
					@Pc(259) short local259;
					@Pc(255) short local255;
					@Pc(257) byte local257;
					if (local148) {
						local259 = arg10.aShortArray61[local120];
						local255 = arg10.aShortArray59[local120];
						local257 = arg10.aByteArray37[local120];
						local261 = arg10.aShortArray58[local120];
						local263 = arg10.aShortArray67[local120];
						local120++;
					} else {
						local255 = -1;
						local257 = 0;
						local259 = local194;
						local261 = local194;
						local263 = local194;
					}
					if (local218 != -1) {
						this.method7199(arg4.anIntArrayArray32[local218], 0, arg2, arg4.anIntArray231[local218] & arg3, arg7, 0, 0, 0, arg6);
					} else if (local255 != -1) {
						this.method7199(arg4.anIntArrayArray32[local255], 0, arg2, arg3 & arg4.anIntArray231[local255], arg7, 0, 0, 0, arg6);
					}
					@Pc(395) int local395;
					@Pc(405) int local405;
					@Pc(419) int local419;
					if ((local233 & 0x2) == 0 && (local257 & 0x1) == 0) {
						@Pc(360) int local360;
						if (local199 == 2) {
							local360 = local261 - local223 & 0x3FFF;
							@Pc(367) int local367 = local263 - local228 & 0x3FFF;
							if (local360 >= 8192) {
								local360 -= 16384;
							}
							@Pc(379) int local379 = local259 - local238 & 0x3FFF;
							if (local367 >= 8192) {
								local367 -= 16384;
							}
							local395 = local223 + arg8 * local360 / arg5 & 0x3FFF;
							local405 = local228 + arg8 * local367 / arg5 & 0x3FFF;
							if (local379 >= 8192) {
								local379 -= 16384;
							}
							local419 = local379 * arg8 / arg5 + local238 & 0x3FFF;
						} else if (local199 == 9) {
							local360 = local261 - local223 & 0x3FFF;
							if (local360 >= 8192) {
								local360 -= 16384;
							}
							local419 = 0;
							local405 = 0;
							local395 = local360 * arg8 / arg5 + local223 & 0x3FFF;
						} else if (local199 == 7) {
							local360 = local261 - local223 & 0x3F;
							if (local360 >= 32) {
								local360 -= 64;
							}
							local395 = local360 * arg8 / arg5 + local223 & 0x3F;
							local419 = local238 + arg8 * (local259 - local238) / arg5;
							local405 = arg8 * (local263 - local228) / arg5 + local228;
						} else {
							local395 = (local261 - local223) * arg8 / arg5 + local223;
							local419 = local238 + (local259 - local238) * arg8 / arg5;
							local405 = local228 + arg8 * (local263 - local228) / arg5;
						}
					} else {
						local395 = local223;
						local405 = local228;
						local419 = local238;
					}
					this.method7199(arg4.anIntArrayArray32[local122], local395, arg2, arg4.anIntArray231[local122] & arg3, arg7, local419, local405, local199, arg6);
				} else {
					if (local148) {
						local120++;
					}
					if (local126) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!ofa;ILclient!ofa;IILclient!ofa;ZLclient!ofa;IIII[ZI)V")
	public final void method7188(@OriginalArg(1) Class2_Sub2_Sub15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub2_Sub15 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class2_Sub2_Sub15 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean[] arg12, @OriginalArg(14) int arg13) {
		if (arg11 == -1) {
			return;
		}
		if (arg12 == null || arg10 == -1) {
			this.method7184(arg9, arg11, 0, arg7, arg0, arg4, arg13, arg6);
			return;
		}
		this.method7190();
		if (!this.F()) {
			this.method7205();
			return;
		}
		@Pc(39) Class95 local39 = arg0.aClass95Array1[arg11];
		@Pc(42) Class2_Sub18 local42 = local39.aClass2_Sub18_1;
		@Pc(44) Class95 local44 = null;
		if (arg7 != null) {
			local44 = arg7.aClass95Array1[arg13];
			if (local42 != local44.aClass2_Sub18_1) {
				local44 = null;
			}
		}
		this.method7187(arg12, false, 0, 65535, local42, arg9, null, arg6, arg4, local39, local44);
		@Pc(76) Class95 local76 = arg2.aClass95Array1[arg10];
		@Pc(78) Class95 local78 = null;
		if (arg5 != null) {
			local78 = arg5.aClass95Array1[arg8];
			if (local78.aClass2_Sub18_1 != local42) {
				local78 = null;
			}
		}
		this.method7194(0, new int[0], 0, 0, 0, 0, arg6);
		this.method7187(arg12, true, 0, 65535, local76.aClass2_Sub18_1, arg1, null, arg6, arg3, local76, local78);
		this.L();
		this.method7205();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	public abstract void method7189(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	protected abstract void method7190();

	@OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()[Lclient!il;")
	public abstract Class163[] method7191();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!qh;I)V")
	public abstract void method7192(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class12_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7194(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
	public abstract int KA();

	@OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
	public abstract int za();

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()[Lclient!rca;")
	public abstract Class293[] method7196();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;IZ)V")
	public abstract void method7197(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B[IIIIZIII[I)V")
	private void method7199(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(25) int local25;
		if (arg2 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local25 = -arg1;
				arg1 = arg5;
				arg5 = local25;
			} else if (arg7 == 3) {
				local25 = arg1;
				arg1 = arg5;
				arg5 = local25;
			} else if (arg7 == 2) {
				local25 = arg1;
				arg1 = -arg5 & 0x3FFF;
				arg5 = local25 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg5 = -arg5;
				arg1 = -arg1;
			} else if (arg7 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local25 = arg1;
				arg1 = -arg5;
				arg5 = local25;
			} else if (arg7 == 3) {
				local25 = arg1;
				arg1 = arg5;
				arg5 = local25;
			} else if (arg7 == 2) {
				local25 = arg1;
				arg1 = arg5 & 0x3FFF;
				arg5 = -local25 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.method7194(arg7, arg0, arg1, arg6, arg5, arg2, arg4);
		} else {
			this.B(arg7, arg0, arg1, arg6, arg5, arg4, arg3, arg8);
		}
	}

	@OriginalMember(owner = "client!da", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public abstract Class2_Sub2_Sub8 S(@OriginalArg(0) Class2_Sub2_Sub8 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!da;")
	public abstract Class33 method7200(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
	public abstract void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;ZI)Z")
	public abstract boolean method7201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7202(@OriginalArg(0) Class25 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public abstract void method7204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
	protected abstract void method7205();
}
