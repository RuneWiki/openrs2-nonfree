import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class24 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class24() {
	}

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()[Lclient!bh;")
	public abstract Class33[] method7383();

	@OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public abstract void method7384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
	public abstract int u();

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!rs;IIBZIIILclient!rs;[I)V")
	public final void method7385(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub5_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class6_Sub5_Sub15 arg7, @OriginalArg(10) int[] arg8) {
		if (arg0 == -1 || !this.Q()) {
			return;
		}
		@Pc(17) Class258 local17 = arg7.aClass258Array1[arg0];
		@Pc(25) Class6_Sub32 local25 = local17.aClass6_Sub32_1;
		@Pc(27) Class258 local27 = null;
		if (arg1 != null) {
			local27 = arg1.aClass258Array1[arg2];
			if (local25 != local27.aClass6_Sub32_1) {
				local27 = null;
			}
		}
		this.method7394(0, arg3, null, local17, arg4, arg5, arg8, local27, local25, false, arg6);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) Class46 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!rs;IIILclient!rs;I[ZIZLclient!rs;Lclient!rs;IZII)V")
	public final void method7387(@OriginalArg(0) Class6_Sub5_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub5_Sub15 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class6_Sub5_Sub15 arg9, @OriginalArg(10) Class6_Sub5_Sub15 arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg6 == null || arg1 == -1) {
			this.method7395(arg3, arg2, arg8, arg5, 0, arg0, arg12, arg9);
		} else if (this.Q()) {
			@Pc(35) Class258 local35 = arg9.aClass258Array1[arg2];
			@Pc(38) Class6_Sub32 local38 = local35.aClass6_Sub32_1;
			@Pc(40) Class258 local40 = null;
			if (arg0 != null) {
				local40 = arg0.aClass258Array1[arg5];
				if (local38 != local40.aClass6_Sub32_1) {
					local40 = null;
				}
			}
			this.method7394(0, arg3, arg6, local35, arg8, 65535, null, local40, local38, false, arg12);
			@Pc(72) Class258 local72 = arg4.aClass258Array1[arg1];
			@Pc(74) Class258 local74 = null;
			if (arg10 != null) {
				local74 = arg10.aClass258Array1[arg11];
				if (local74.aClass6_Sub32_1 != local38) {
					local74 = null;
				}
			}
			this.E(0, new int[0], 0, 0, 0, 0, arg8);
			this.method7394(0, arg13, arg6, local72, arg8, 65535, null, local74, local72.aClass6_Sub32_1, true, arg7);
			this.Y();
		}
	}

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
	public abstract void P();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7388(@OriginalArg(0) Class93 arg0);

	@OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
	public abstract void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	public abstract void method7389(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
	public abstract void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
	public abstract int LA();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[IBII[IIZII)V")
	private void method7391(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(21) int local21;
		if (arg2 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local21 = -arg3;
				arg3 = arg8;
				arg8 = local21;
			} else if (arg7 == 3) {
				local21 = arg3;
				arg3 = arg8;
				arg8 = local21;
			} else if (arg7 == 2) {
				local21 = arg3;
				arg3 = -arg8 & 0x3FFF;
				arg8 = local21 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg3 = -arg3;
				arg8 = -arg8;
			} else if (arg7 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local21 = arg3;
				arg3 = -arg8;
				arg8 = local21;
			} else if (arg7 == 3) {
				local21 = arg3;
				arg3 = arg8;
				arg8 = local21;
			} else if (arg7 == 2) {
				local21 = arg3;
				arg3 = arg8 & 0x3FFF;
				arg8 = -local21 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.E(arg7, arg4, arg3, arg0, arg8, arg2, arg6);
		} else {
			this.da(arg7, arg4, arg3, arg0, arg8, arg6, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!rc;II)V")
	public abstract void method7392(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class60_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!rc;I)V")
	public abstract void method7393(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class60_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[ZLclient!qb;ZI[ILclient!qb;ILclient!od;ZI)V")
	private void method7394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) Class258 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) Class258 arg7, @OriginalArg(9) Class6_Sub32 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (arg7 == null || arg1 == 0) {
			for (local14 = 0; local14 < arg3.anInt7400; local14++) {
				@Pc(21) short local21 = arg3.aShortArray128[local14];
				if (arg2 == null || arg9 == arg2[local21] || arg8.anIntArray469[local21] == 0) {
					@Pc(42) short local42 = arg3.aShortArray123[local14];
					if (local42 != -1) {
						this.method7391(0, arg6, arg0, 0, arg8.anIntArrayArray55[local42], arg8.anIntArray470[local42] & arg5, arg4, 0, 0);
					}
					this.method7391(arg3.aShortArray129[local14], arg6, arg0, arg3.aShortArray130[local14], arg8.anIntArrayArray55[local21], arg8.anIntArray470[local21] & arg5, arg4, arg8.anIntArray469[local21], arg3.aShortArray126[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(111) int local111 = 0;
		for (@Pc(117) int local117 = 0; local117 < arg8.anInt6682; local117++) {
			@Pc(121) boolean local121 = false;
			if (local14 < arg3.anInt7400 && local117 == arg3.aShortArray128[local14]) {
				local121 = true;
			}
			@Pc(139) boolean local139 = false;
			if (local111 < arg7.anInt7400 && local117 == arg7.aShortArray128[local111]) {
				local139 = true;
			}
			if (local121 || local139) {
				if (arg2 == null || arg2[local117] == arg9 || arg8.anIntArray469[local117] == 0) {
					@Pc(185) short local185 = 0;
					@Pc(190) int local190 = arg8.anIntArray469[local117];
					if (local190 == 3 || local190 == 10) {
						local185 = 128;
					}
					@Pc(204) short local204;
					@Pc(212) short local212;
					@Pc(206) short local206;
					@Pc(210) short local210;
					@Pc(208) byte local208;
					if (local121) {
						local210 = arg3.aShortArray123[local14];
						local208 = arg3.aByteArray94[local14];
						local212 = arg3.aShortArray129[local14];
						local206 = arg3.aShortArray126[local14];
						local204 = arg3.aShortArray130[local14];
						local14++;
					} else {
						local204 = local185;
						local206 = local185;
						local208 = 0;
						local210 = -1;
						local212 = local185;
					}
					@Pc(262) short local262;
					@Pc(247) short local247;
					@Pc(252) short local252;
					@Pc(267) short local267;
					@Pc(257) byte local257;
					if (local139) {
						local247 = arg7.aShortArray129[local111];
						local252 = arg7.aShortArray126[local111];
						local257 = arg7.aByteArray94[local111];
						local262 = arg7.aShortArray130[local111];
						local267 = arg7.aShortArray123[local111];
						local111++;
					} else {
						local247 = local185;
						local252 = local185;
						local262 = local185;
						local257 = 0;
						local267 = -1;
					}
					@Pc(310) int local310;
					@Pc(333) int local333;
					@Pc(321) int local321;
					if ((local208 & 0x2) == 0 && (local257 & 0x1) == 0) {
						@Pc(341) int local341;
						if (local190 == 2) {
							local341 = local262 - local204 & 0x3FFF;
							@Pc(421) int local421 = local247 - local212 & 0x3FFF;
							if (local421 >= 8192) {
								local421 -= 16384;
							}
							@Pc(431) int local431 = local252 - local206 & 0x3FFF;
							if (local341 >= 8192) {
								local341 -= 16384;
							}
							if (local431 >= 8192) {
								local431 -= 16384;
							}
							local333 = arg1 * local421 / arg10 + local212 & 0x3FFF;
							local310 = local341 * arg1 / arg10 + local204 & 0x3FFF;
							local321 = local206 + local431 * arg1 / arg10 & 0x3FFF;
						} else if (local190 == 9) {
							local341 = local262 - local204 & 0x3FFF;
							if (local341 >= 8192) {
								local341 -= 16384;
							}
							local310 = arg1 * local341 / arg10 + local204 & 0x3FFF;
							local321 = 0;
							local333 = 0;
						} else if (local190 == 7) {
							local341 = local262 - local204 & 0x3F;
							if (local341 >= 32) {
								local341 -= 64;
							}
							local310 = arg1 * local341 / arg10 + local204 & 0x3F;
							local321 = local206 + (local252 - local206) * arg1 / arg10;
							local333 = arg1 * (local247 - local212) / arg10 + local212;
						} else {
							local310 = local204 + arg1 * (local262 - local204) / arg10;
							local321 = local206 + (local252 - local206) * arg1 / arg10;
							local333 = local212 + (local247 - local212) * arg1 / arg10;
						}
					} else {
						local333 = local212;
						local310 = local204;
						local321 = local206;
					}
					if (local210 != -1) {
						this.method7391(0, arg6, arg0, 0, arg8.anIntArrayArray55[local210], arg5 & arg8.anIntArray470[local210], arg4, 0, 0);
					} else if (local267 != -1) {
						this.method7391(0, arg6, arg0, 0, arg8.anIntArrayArray55[local267], arg5 & arg8.anIntArray470[local267], arg4, 0, 0);
					}
					this.method7391(local333, arg6, arg0, local310, arg8.anIntArrayArray55[local117], arg8.anIntArray470[local117] & arg5, arg4, local190, local321);
				} else {
					if (local121) {
						local14++;
					}
					if (local139) {
						local111++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZIILclient!rs;IILclient!rs;)V")
	public final void method7395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub5_Sub15 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class6_Sub5_Sub15 arg7) {
		if (arg1 == -1 || !this.Q()) {
			return;
		}
		@Pc(20) Class258 local20 = arg7.aClass258Array1[arg1];
		@Pc(23) Class6_Sub32 local23 = local20.aClass6_Sub32_1;
		@Pc(25) Class258 local25 = null;
		if (arg5 != null) {
			local25 = arg5.aClass258Array1[arg3];
			if (local25.aClass6_Sub32_1 != local23) {
				local25 = null;
			}
		}
		this.method7394(arg4, arg0, null, local20, arg2, 65535, null, local25, local23, false, arg6);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
	protected abstract boolean Q();

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public abstract Class6_Sub5_Sub10 Z(@OriginalArg(0) Class6_Sub5_Sub10 arg0);

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIILclient!d;)V")
	protected final void method7396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class46 arg7) {
		@Pc(21) int local21 = -arg6 / 2;
		@Pc(26) int local26 = -arg5 / 2;
		@Pc(35) int local35 = arg7.sa(arg0 + local21, arg3 + local26);
		@Pc(39) int local39 = arg6 / 2;
		@Pc(44) int local44 = -arg5 / 2;
		@Pc(53) int local53 = arg7.sa(arg0 + local39, arg3 + local44);
		@Pc(58) int local58 = -arg6 / 2;
		@Pc(62) int local62 = arg5 / 2;
		@Pc(71) int local71 = arg7.sa(local58 + arg0, arg3 + local62);
		@Pc(75) int local75 = arg6 / 2;
		@Pc(79) int local79 = arg5 / 2;
		@Pc(88) int local88 = arg7.sa(arg0 + local75, arg3 + local79);
		@Pc(99) int local99 = local53 > local35 ? local35 : local53;
		@Pc(106) int local106 = local88 > local71 ? local71 : local88;
		@Pc(117) int local117 = local88 <= local53 ? local88 : local53;
		@Pc(124) int local124 = local35 < local71 ? local35 : local71;
		@Pc(170) int local170;
		if (arg5 != 0) {
			@Pc(143) int local143 = (int) (Math.atan2((double) (local99 - local106), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local143 != 0) {
				if (arg2 != 0) {
					if (local143 > 8192) {
						local170 = 16384 - arg2;
						if (local170 > local143) {
							local143 = local170;
						}
					} else if (arg2 < local143) {
						local143 = arg2;
					}
				}
				this.AA(local143);
			}
		}
		if (arg6 != 0) {
			@Pc(197) int local197 = (int) (Math.atan2((double) (local124 - local117), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local197 != 0) {
				if (arg4 != 0) {
					if (local197 > 8192) {
						local170 = 16384 - arg4;
						if (local197 < local170) {
							local197 = local170;
						}
					} else if (local197 > arg4) {
						local197 = arg4;
					}
				}
				this.v(local197);
			}
		}
		@Pc(234) int local234 = local88 + local35;
		if (local234 > local71 + local53) {
			local234 = local71 + local53;
		}
		local234 = (local234 >> 1) - arg1;
		if (local234 != 0) {
			this.m(0, local234, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()Z")
	public abstract boolean method7397();

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
	protected abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lclient!ba;")
	public abstract Class24 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
	protected abstract void Y();

	@OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
	public abstract void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
	public abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
	public abstract int h();

	@OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
	public abstract void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!rs;Z)V")
	public final void method7400(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub5_Sub15 arg1) {
		if (arg0 == -1 || !this.Q()) {
			return;
		}
		@Pc(27) Class258 local27 = arg1.aClass258Array1[arg0];
		@Pc(30) Class6_Sub32 local30 = local27.aClass6_Sub32_1;
		for (@Pc(32) int local32 = 0; local32 < local27.anInt7400; local32++) {
			@Pc(39) short local39 = local27.aShortArray128[local32];
			if (local30.aBooleanArray22[local39]) {
				if (local27.aShortArray123[local32] != -1) {
					this.ua(0, 0, 0, 0);
				}
				this.ua(local30.anIntArray469[local39], local27.aShortArray130[local32], local27.aShortArray129[local32], local27.aShortArray126[local32]);
			}
		}
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
	public abstract void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()V")
	public abstract void method7401();

	@OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
	protected abstract void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()[Lclient!vp;")
	public abstract Class335[] method7402();

	@OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
	public abstract int ha();

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
	public abstract int F();
}
