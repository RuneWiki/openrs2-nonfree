import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class7 {

	static {
		new Class242("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	protected Class7() {
	}

	@OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
	public abstract int X();

	@OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
	public abstract int la();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lclient!c;")
	public abstract Class7 method4077(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
	public abstract void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	public abstract void method4078(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
	public abstract int ra();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIZLclient!nl;ILclient!nl;)V")
	public final void method4080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class4_Sub1_Sub12 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4_Sub1_Sub12 arg7) {
		if (arg3 == -1 || !this.FA()) {
			return;
		}
		@Pc(18) Class209 local18 = arg5.aClass209Array1[arg3];
		@Pc(21) Class4_Sub29 local21 = local18.aClass4_Sub29_1;
		@Pc(23) Class209 local23 = null;
		if (arg7 != null) {
			local23 = arg7.aClass209Array1[arg2];
			if (local23.aClass4_Sub29_1 != local21) {
				local23 = null;
			}
		}
		this.method4083(arg4, arg0, 65535, local23, local21, arg6, null, local18, false, arg1, null);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!ia;Z)Z")
	public abstract boolean method4082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
	public abstract void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
	public abstract void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIBLclient!rq;Lclient!md;I[ILclient!rq;ZI[Z)V")
	private void method4083(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class209 arg3, @OriginalArg(5) Class4_Sub29 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class209 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(14) int local14;
		if (arg3 == null || arg5 == 0) {
			for (local14 = 0; local14 < arg7.anInt6293; local14++) {
				@Pc(21) short local21 = arg7.aShortArray90[local14];
				if (arg10 == null || arg10[local21] == arg8 || arg4.anIntArray361[local21] == 0) {
					@Pc(42) short local42 = arg7.aShortArray88[local14];
					if (local42 != -1) {
						this.method4084(0, 0, arg0, arg6, arg4.anIntArray360[local42] & arg2, arg9, 0, arg4.anIntArrayArray39[local42], 0);
					}
					this.method4084(arg7.aShortArray91[local14], arg4.anIntArray361[local21], arg0, arg6, arg4.anIntArray360[local21] & arg2, arg9, arg7.aShortArray86[local14], arg4.anIntArrayArray39[local21], arg7.aShortArray89[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(111) int local111 = 0;
		for (@Pc(113) int local113 = 0; local113 < arg4.anInt4423; local113++) {
			@Pc(117) boolean local117 = false;
			if (arg7.anInt6293 > local14 && local113 == arg7.aShortArray90[local14]) {
				local117 = true;
			}
			@Pc(131) boolean local131 = false;
			if (local111 < arg3.anInt6293 && local113 == arg3.aShortArray90[local111]) {
				local131 = true;
			}
			if (local117 || local131) {
				if (arg10 == null || arg8 == arg10[local113] || arg4.anIntArray361[local113] == 0) {
					@Pc(184) short local184 = 0;
					@Pc(189) int local189 = arg4.anIntArray361[local113];
					if (local189 == 3 || local189 == 10) {
						local184 = 128;
					}
					@Pc(207) short local207;
					@Pc(205) short local205;
					@Pc(211) short local211;
					@Pc(209) short local209;
					@Pc(203) byte local203;
					if (local117) {
						local205 = arg7.aShortArray89[local14];
						local209 = arg7.aShortArray88[local14];
						local211 = arg7.aShortArray91[local14];
						local203 = arg7.aByteArray81[local14];
						local207 = arg7.aShortArray86[local14];
						local14++;
					} else {
						local203 = 0;
						local205 = local184;
						local207 = local184;
						local209 = -1;
						local211 = local184;
					}
					@Pc(256) short local256;
					@Pc(266) short local266;
					@Pc(261) short local261;
					@Pc(246) short local246;
					@Pc(251) byte local251;
					if (local131) {
						local246 = arg3.aShortArray88[local111];
						local251 = arg3.aByteArray81[local111];
						local256 = arg3.aShortArray86[local111];
						local261 = arg3.aShortArray91[local111];
						local266 = arg3.aShortArray89[local111];
						local111++;
					} else {
						local251 = 0;
						local246 = -1;
						local261 = local184;
						local256 = local184;
						local266 = local184;
					}
					if (local209 != -1) {
						this.method4084(0, 0, arg0, arg6, arg4.anIntArray360[local209] & arg2, arg9, 0, arg4.anIntArrayArray39[local209], 0);
					} else if (local246 != -1) {
						this.method4084(0, 0, arg0, arg6, arg4.anIntArray360[local246] & arg2, arg9, 0, arg4.anIntArrayArray39[local246], 0);
					}
					@Pc(395) int local395;
					@Pc(385) int local385;
					@Pc(412) int local412;
					if ((local203 & 0x2) == 0 && (local251 & 0x1) == 0) {
						@Pc(353) int local353;
						if (local189 == 2) {
							local353 = local256 - local207 & 0x3FFF;
							@Pc(360) int local360 = local266 - local205 & 0x3FFF;
							if (local360 >= 8192) {
								local360 -= 16384;
							}
							if (local353 >= 8192) {
								local353 -= 16384;
							}
							@Pc(375) int local375 = local261 - local211 & 0x3FFF;
							local385 = local360 * arg5 / arg1 + local205 & 0x3FFF;
							local395 = local207 + arg5 * local353 / arg1 & 0x3FFF;
							if (local375 >= 8192) {
								local375 -= 16384;
							}
							local412 = local211 + arg5 * local375 / arg1 & 0x3FFF;
						} else if (local189 == 9) {
							local353 = local256 - local207 & 0x3FFF;
							if (local353 >= 8192) {
								local353 -= 16384;
							}
							local412 = 0;
							local385 = 0;
							local395 = local207 + local353 * arg5 / arg1 & 0x3FFF;
						} else if (local189 == 7) {
							local353 = local256 - local207 & 0x3F;
							if (local353 >= 32) {
								local353 -= 64;
							}
							local412 = (local261 - local211) * arg5 / arg1 + local211;
							local385 = (local266 - local205) * arg5 / arg1 + local205;
							local395 = local207 + arg5 * local353 / arg1 & 0x3F;
						} else {
							local412 = local211 + arg5 * (local261 - local211) / arg1;
							local395 = local207 + (local256 - local207) * arg5 / arg1;
							local385 = local205 + arg5 * (local266 - local205) / arg1;
						}
					} else {
						local385 = local205;
						local412 = local211;
						local395 = local207;
					}
					this.method4084(local412, local189, arg0, arg6, arg2 & arg4.anIntArray360[local113], arg9, local395, arg4.anIntArrayArray39[local113], local385);
				} else {
					if (local131) {
						local111++;
					}
					if (local117) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZ[IIII[III)V")
	private void method4084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12;
		if (arg5 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local12 = -arg6;
				arg6 = arg0;
				arg0 = local12;
			} else if (arg1 == 3) {
				local12 = arg6;
				arg6 = arg0;
				arg0 = local12;
			} else if (arg1 == 2) {
				local12 = arg6;
				arg6 = -arg0 & 0x3FFF;
				arg0 = local12 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg6 = -arg6;
				arg0 = -arg0;
			} else if (arg1 == 2) {
				arg0 = -arg0 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local12 = arg6;
				arg6 = -arg0;
				arg0 = local12;
			} else if (arg1 == 3) {
				local12 = arg6;
				arg6 = arg0;
				arg0 = local12;
			} else if (arg1 == 2) {
				local12 = arg6;
				arg6 = arg0 & 0x3FFF;
				arg0 = -local12 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.xa(arg1, arg7, arg6, arg8, arg0, arg5, arg2);
		} else {
			this.va(arg1, arg7, arg6, arg8, arg0, arg2, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([ZIIILclient!nl;ILclient!nl;ILclient!nl;IZILclient!nl;II)V")
	public final void method4085(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub1_Sub12 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub1_Sub12 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4_Sub1_Sub12 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class4_Sub1_Sub12 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg12 == -1) {
			return;
		}
		if (arg0 == null || arg1 == -1) {
			this.method4080(arg13, 0, arg6, arg12, arg9, arg7, arg10, arg3);
		} else if (this.FA()) {
			@Pc(34) Class209 local34 = arg7.aClass209Array1[arg12];
			@Pc(37) Class4_Sub29 local37 = local34.aClass4_Sub29_1;
			@Pc(39) Class209 local39 = null;
			if (arg3 != null) {
				local39 = arg3.aClass209Array1[arg6];
				if (local37 != local39.aClass4_Sub29_1) {
					local39 = null;
				}
			}
			this.method4083(arg9, arg13, 65535, local39, local37, arg10, null, local34, false, 0, arg0);
			@Pc(71) Class209 local71 = arg5.aClass209Array1[arg1];
			@Pc(73) Class209 local73 = null;
			if (arg11 != null) {
				local73 = arg11.aClass209Array1[arg8];
				if (local73.aClass4_Sub29_1 != local37) {
					local73 = null;
				}
			}
			this.xa(0, new int[0], 0, 0, 0, 0, arg9);
			this.method4083(arg9, arg2, 65535, local73, local71.aClass4_Sub29_1, arg4, null, local71, true, 0, arg0);
			this.W();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!mn;II)V")
	public abstract void method4086(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class41_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	public abstract void method4087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lclient!il;")
	public abstract Class120[] method4088();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZLclient!nl;IIILclient!nl;II[I)V")
	public final void method4089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class4_Sub1_Sub12 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class4_Sub1_Sub12 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int[] arg8) {
		if (arg4 == -1 || !this.FA()) {
			return;
		}
		@Pc(22) Class209 local22 = arg3.aClass209Array1[arg4];
		@Pc(25) Class4_Sub29 local25 = local22.aClass4_Sub29_1;
		@Pc(27) Class209 local27 = null;
		if (arg6 != null) {
			local27 = arg6.aClass209Array1[arg0];
			if (local27.aClass4_Sub29_1 != local25) {
				local27 = null;
			}
		}
		this.method4083(arg2, arg1, arg5, local27, local25, arg7, arg8, local22, false, 0, null);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public abstract Class4_Sub1_Sub7 ua(@OriginalArg(0) Class4_Sub1_Sub7 arg0);

	@OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
	public abstract int C();

	@OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
	public abstract void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
	protected abstract void W();

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()Z")
	public abstract boolean method4090();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!mn;I)V")
	public abstract void method4091(@OriginalArg(0) Class116 arg0, @OriginalArg(1) Class41_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected abstract void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
	public abstract void sa();

	@OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
	public abstract void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
	public abstract int VA();

	@OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
	public abstract void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
	protected abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()[Lclient!e;")
	public abstract Class56[] method4092();

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
	public abstract void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILclient!na;II)V")
	protected final void method4094(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class146 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg4 / 2;
		@Pc(21) int local21 = -arg2 / 2;
		@Pc(30) int local30 = arg5.va(local16 + arg7, local21 + arg6);
		@Pc(34) int local34 = arg4 / 2;
		@Pc(39) int local39 = -arg2 / 2;
		@Pc(49) int local49 = arg5.va(arg7 + local34, arg6 - -local39);
		@Pc(54) int local54 = -arg4 / 2;
		@Pc(58) int local58 = arg2 / 2;
		@Pc(67) int local67 = arg5.va(local54 + arg7, local58 + arg6);
		@Pc(71) int local71 = arg4 / 2;
		@Pc(75) int local75 = arg2 / 2;
		@Pc(84) int local84 = arg5.va(local71 + arg7, arg6 + local75);
		@Pc(91) int local91 = local49 <= local30 ? local49 : local30;
		@Pc(98) int local98 = local67 >= local84 ? local84 : local67;
		@Pc(112) int local112 = local49 >= local84 ? local84 : local49;
		@Pc(119) int local119 = local67 > local30 ? local30 : local67;
		@Pc(156) int local156;
		if (arg2 != 0) {
			@Pc(138) int local138 = (int) (Math.atan2((double) (local91 - local98), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local138 != 0) {
				if (arg3 != 0) {
					if (local138 > 8192) {
						local156 = 16384 - arg3;
						if (local156 > local138) {
							local138 = local156;
						}
					} else if (arg3 < local138) {
						local138 = arg3;
					}
				}
				this.WA(local138);
			}
		}
		@Pc(168) int local168 = local30 + local84;
		if (arg4 != 0) {
			@Pc(184) int local184 = (int) (Math.atan2((double) (local119 - local112), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local184 != 0) {
				if (arg0 != 0) {
					if (local184 > 8192) {
						local156 = 16384 - arg0;
						if (local184 < local156) {
							local184 = local156;
						}
					} else if (local184 > arg0) {
						local184 = arg0;
					}
				}
				this.o(local184);
			}
		}
		if (local49 + local67 < local168) {
			local168 = local49 + local67;
		}
		local168 = (local168 >> 1) - arg1;
		if (local168 != 0) {
			this.ja(0, local168, 0);
		}
	}

	@OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) Class146 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()V")
	public abstract void method4095();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!nl;IB)V")
	public final void method4096(@OriginalArg(0) Class4_Sub1_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1 || !this.FA()) {
			return;
		}
		@Pc(25) Class209 local25 = arg0.aClass209Array1[arg1];
		@Pc(28) Class4_Sub29 local28 = local25.aClass4_Sub29_1;
		for (@Pc(30) int local30 = 0; local30 < local25.anInt6293; local30++) {
			@Pc(37) short local37 = local25.aShortArray90[local30];
			if (local28.aBooleanArray15[local37]) {
				if (local25.aShortArray88[local30] != -1) {
					this.K(0, 0, 0, 0);
				}
				this.K(local28.anIntArray361[local37], local25.aShortArray86[local30], local25.aShortArray89[local30], local25.aShortArray91[local30]);
			}
		}
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
	public abstract void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
	protected abstract boolean FA();

	@OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);
}
