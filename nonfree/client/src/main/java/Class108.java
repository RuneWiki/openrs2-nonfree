import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class108 {

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class108() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class108 method4930(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!n;Lclient!st;I)V")
	public abstract void method4931(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class23_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "(I)V")
	public abstract void B(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "IA", descriptor = "(I)V")
	public abstract void IA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!vs;)V")
	public final void method4932(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub17 arg1) {
		if (arg0 == -1 || !this.AA()) {
			return;
		}
		@Pc(18) Class53 local18 = arg1.aClass53Array1[arg0];
		@Pc(21) Class3_Sub24 local21 = local18.aClass3_Sub24_1;
		for (@Pc(23) int local23 = 0; local23 < local18.anInt1407; local23++) {
			@Pc(30) short local30 = local18.aShortArray22[local23];
			if (local21.aBooleanArray11[local30]) {
				if (local18.aShortArray27[local23] != -1) {
					this.la(0, 0, 0, 0);
				}
				this.la(local21.anIntArray158[local30], local18.aShortArray24[local23], local18.aShortArray29[local23], local18.aShortArray26[local23]);
			}
		}
		this.ha();
	}

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "(I)V")
	public abstract void S(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "(I)V")
	public abstract void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(Lclient!ia;)Lclient!ia;")
	public abstract Class3_Sub3_Sub9 LA(@OriginalArg(0) Class3_Sub3_Sub9 arg0);

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "(I)V")
	public abstract void l(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!n;Lclient!st;II)V")
	public abstract void method4933(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class23_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I[IIIIIZ)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "ja", descriptor = "()I")
	public abstract int ja();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[ILclient!vs;IIILclient!vs;IZB)V")
	public final void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class3_Sub3_Sub17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class3_Sub3_Sub17 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		if (arg5 == -1 || !this.AA()) {
			return;
		}
		@Pc(16) Class53 local16 = arg3.aClass53Array1[arg5];
		@Pc(24) Class3_Sub24 local24 = local16.aClass3_Sub24_1;
		@Pc(26) Class53 local26 = null;
		if (arg6 != null) {
			local26 = arg6.aClass53Array1[arg0];
			if (local26.aClass3_Sub24_1 != local24) {
				local26 = null;
			}
		}
		this.method4939(local24, arg8, arg4, local16, false, null, local26, arg2, 0, arg7, arg1);
		this.ha();
	}

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "()I")
	public abstract int ia();

	@OriginalMember(owner = "client!ka", name = "AA", descriptor = "()Z")
	protected abstract boolean AA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIZ[IIII)V")
	private void method4935(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(21) int local21;
		if (arg6 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local21 = -arg3;
				arg3 = arg2;
				arg2 = local21;
			} else if (arg7 == 3) {
				local21 = arg3;
				arg3 = arg2;
				arg2 = local21;
			} else if (arg7 == 2) {
				local21 = arg3;
				arg3 = -arg2 & 0x3FFF;
				arg2 = local21 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg2 = -arg2;
				arg3 = -arg3;
			} else if (arg7 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local21 = arg3;
				arg3 = -arg2;
				arg2 = local21;
			} else if (arg7 == 3) {
				local21 = arg3;
				arg3 = arg2;
				arg2 = local21;
			} else if (arg7 == 2) {
				local21 = arg3;
				arg3 = arg2 & 0x3FFF;
				arg2 = -local21 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.e(arg7, arg1, arg3, arg0, arg2, arg6, arg4);
		} else {
			this.W(arg7, arg1, arg3, arg0, arg2, arg4, arg8, arg5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
	public abstract boolean method4936();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!n;Z)Z")
	public abstract boolean method4937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ii;ZIILclient!dt;Z[ZLclient!dt;[IIII)V")
	private void method4939(@OriginalArg(0) Class3_Sub24 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class53 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) Class53 arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg6 == null || arg10 == 0) {
			for (local11 = 0; local11 < arg3.anInt1407; local11++) {
				@Pc(18) short local18 = arg3.aShortArray22[local11];
				if (arg5 == null || arg4 == arg5[local18] || arg0.anIntArray158[local18] == 0) {
					@Pc(39) short local39 = arg3.aShortArray27[local11];
					if (local39 != -1) {
						this.method4935(0, arg0.anIntArrayArray15[local39], 0, 0, arg1, arg7, arg8, 0, arg9 & arg0.anIntArray159[local39]);
					}
					this.method4935(arg3.aShortArray29[local11], arg0.anIntArrayArray15[local18], arg3.aShortArray26[local11], arg3.aShortArray24[local11], arg1, arg7, arg8, arg0.anIntArray158[local18], arg9 & arg0.anIntArray159[local18]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(105) int local105 = 0;
		for (@Pc(112) int local112 = 0; local112 < arg0.anInt3101; local112++) {
			@Pc(116) boolean local116 = false;
			if (local11 < arg3.anInt1407 && arg3.aShortArray22[local11] == local112) {
				local116 = true;
			}
			@Pc(134) boolean local134 = false;
			if (local105 < arg6.anInt1407 && local112 == arg6.aShortArray22[local105]) {
				local134 = true;
			}
			if (local116 || local134) {
				if (arg5 == null || arg4 == arg5[local112] || arg0.anIntArray158[local112] == 0) {
					@Pc(180) short local180 = 0;
					@Pc(185) int local185 = arg0.anIntArray158[local112];
					if (local185 == 3 || local185 == 10) {
						local180 = 128;
					}
					@Pc(222) short local222;
					@Pc(202) short local202;
					@Pc(217) short local217;
					@Pc(212) short local212;
					@Pc(207) byte local207;
					if (local116) {
						local202 = arg3.aShortArray29[local11];
						local207 = arg3.aByteArray30[local11];
						local212 = arg3.aShortArray27[local11];
						local217 = arg3.aShortArray26[local11];
						local222 = arg3.aShortArray24[local11];
						local11++;
					} else {
						local217 = local180;
						local207 = 0;
						local202 = local180;
						local222 = local180;
						local212 = -1;
					}
					@Pc(262) short local262;
					@Pc(242) short local242;
					@Pc(247) short local247;
					@Pc(252) short local252;
					@Pc(257) byte local257;
					if (local134) {
						local242 = arg6.aShortArray29[local105];
						local247 = arg6.aShortArray26[local105];
						local252 = arg6.aShortArray27[local105];
						local257 = arg6.aByteArray30[local105];
						local262 = arg6.aShortArray24[local105];
						local105++;
					} else {
						local252 = -1;
						local247 = local180;
						local262 = local180;
						local242 = local180;
						local257 = 0;
					}
					@Pc(335) int local335;
					@Pc(345) int local345;
					@Pc(355) int local355;
					if ((local207 & 0x2) == 0 && (local257 & 0x1) == 0) {
						@Pc(294) int local294;
						if (local185 == 2) {
							local294 = local262 - local222 & 0x3FFF;
							@Pc(301) int local301 = local242 - local202 & 0x3FFF;
							if (local294 >= 8192) {
								local294 -= 16384;
							}
							if (local301 >= 8192) {
								local301 -= 16384;
							}
							@Pc(318) int local318 = local247 - local217 & 0x3FFF;
							if (local318 >= 8192) {
								local318 -= 16384;
							}
							local335 = local222 + local294 * arg10 / arg2 & 0x3FFF;
							local345 = local301 * arg10 / arg2 + local202 & 0x3FFF;
							local355 = arg10 * local318 / arg2 + local217 & 0x3FFF;
						} else if (local185 == 9) {
							local294 = local262 - local222 & 0x3FFF;
							if (local294 >= 8192) {
								local294 -= 16384;
							}
							local355 = 0;
							local345 = 0;
							local335 = local222 + local294 * arg10 / arg2 & 0x3FFF;
						} else if (local185 == 7) {
							local294 = local262 - local222 & 0x3F;
							if (local294 >= 32) {
								local294 -= 64;
							}
							local355 = (local247 - local217) * arg10 / arg2 + local217;
							local345 = local202 + (local242 - local202) * arg10 / arg2;
							local335 = local222 + arg10 * local294 / arg2 & 0x3F;
						} else {
							local335 = arg10 * (local262 - local222) / arg2 + local222;
							local355 = local217 + (local247 - local217) * arg10 / arg2;
							local345 = arg10 * (local242 - local202) / arg2 + local202;
						}
					} else {
						local345 = local202;
						local355 = local217;
						local335 = local222;
					}
					if (local212 != -1) {
						this.method4935(0, arg0.anIntArrayArray15[local212], 0, 0, arg1, arg7, arg8, 0, arg9 & arg0.anIntArray159[local212]);
					} else if (local252 != -1) {
						this.method4935(0, arg0.anIntArrayArray15[local252], 0, 0, arg1, arg7, arg8, 0, arg0.anIntArray159[local252] & arg9);
					}
					this.method4935(local345, arg0.anIntArrayArray15[local112], local355, local335, arg1, arg7, arg8, local185, arg9 & arg0.anIntArray159[local112]);
				} else {
					if (local116) {
						local11++;
					}
					if (local134) {
						local105++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "(I[IIIIZI[I)V")
	protected abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "la", descriptor = "(IIII)V")
	protected abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "(I)V")
	public abstract void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()I")
	public abstract int F();

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lclient!hd;")
	public abstract Class95[] method4940();

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()I")
	public abstract int wa();

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "()I")
	public abstract int D();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!o;IZIIIII)V")
	protected final void method4941(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg0 / 2;
		@Pc(21) int local21 = -arg2 / 2;
		@Pc(32) int local32 = arg1.R(arg4 + local16, arg6 - -local21);
		@Pc(36) int local36 = arg0 / 2;
		@Pc(41) int local41 = -arg2 / 2;
		@Pc(51) int local51 = arg1.R(arg4 + local36, arg6 - -local41);
		@Pc(56) int local56 = -arg0 / 2;
		@Pc(60) int local60 = arg2 / 2;
		@Pc(69) int local69 = arg1.R(arg4 + local56, local60 + arg6);
		@Pc(73) int local73 = arg0 / 2;
		@Pc(77) int local77 = arg2 / 2;
		@Pc(87) int local87 = arg1.R(local73 + arg4, arg6 - -local77);
		@Pc(94) int local94 = local32 >= local51 ? local51 : local32;
		@Pc(105) int local105 = local87 <= local69 ? local87 : local69;
		@Pc(117) int local117 = local87 > local51 ? local51 : local87;
		@Pc(128) int local128 = local69 <= local32 ? local69 : local32;
		@Pc(169) int local169;
		if (arg2 != 0) {
			@Pc(144) int local144 = (int) (Math.atan2((double) (local94 - local105), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local144 != 0) {
				if (arg3 != 0) {
					if (local144 > 8192) {
						local169 = 16384 - arg3;
						if (local144 < local169) {
							local144 = local169;
						}
					} else if (local144 > arg3) {
						local144 = arg3;
					}
				}
				this.E(local144);
			}
		}
		@Pc(185) int local185 = local87 + local32;
		if (arg0 != 0) {
			@Pc(203) int local203 = (int) (Math.atan2((double) (local128 - local117), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local203 != 0) {
				if (arg5 != 0) {
					if (local203 > 8192) {
						local169 = 16384 - arg5;
						if (local169 > local203) {
							local203 = local169;
						}
					} else if (arg5 < local203) {
						local203 = arg5;
					}
				}
				this.S(local203);
			}
		}
		if (local51 + local69 < local185) {
			local185 = local51 + local69;
		}
		local185 = (local185 >> 1) - arg7;
		if (local185 != 0) {
			this.R(0, local185, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!vs;IILclient!vs;IBI[ZLclient!vs;ILclient!vs;IIZI)V")
	public final void method4942(@OriginalArg(0) Class3_Sub3_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub3_Sub17 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) Class3_Sub3_Sub17 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3_Sub3_Sub17 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg6 == null || arg5 == -1) {
			this.method4943(arg12, arg0, arg1, arg9, arg13, arg2, arg10, 0);
		} else if (this.AA()) {
			@Pc(33) Class53 local33 = arg9.aClass53Array1[arg2];
			@Pc(36) Class3_Sub24 local36 = local33.aClass3_Sub24_1;
			@Pc(38) Class53 local38 = null;
			if (arg0 != null) {
				local38 = arg0.aClass53Array1[arg1];
				if (local38.aClass3_Sub24_1 != local36) {
					local38 = null;
				}
			}
			this.method4939(local36, arg12, arg13, local33, false, arg6, local38, null, 0, 65535, arg10);
			@Pc(77) Class53 local77 = arg3.aClass53Array1[arg5];
			@Pc(79) Class53 local79 = null;
			if (arg7 != null) {
				local79 = arg7.aClass53Array1[arg11];
				if (local36 != local79.aClass3_Sub24_1) {
					local79 = null;
				}
			}
			this.e(0, new int[0], 0, 0, 0, 0, arg12);
			this.method4939(local77.aClass3_Sub24_1, arg12, arg4, local77, true, arg6, local79, null, 0, 65535, arg8);
			this.ha();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!vs;ILclient!vs;IIIIB)V")
	public final void method4943(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub3_Sub17 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub3_Sub17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg5 == -1 || !this.AA()) {
			return;
		}
		@Pc(20) Class53 local20 = arg3.aClass53Array1[arg5];
		@Pc(23) Class3_Sub24 local23 = local20.aClass3_Sub24_1;
		@Pc(25) Class53 local25 = null;
		if (arg1 != null) {
			local25 = arg1.aClass53Array1[arg2];
			if (local25.aClass3_Sub24_1 != local23) {
				local25 = null;
			}
		}
		this.method4939(local23, arg0, arg4, local20, false, null, local25, null, arg7, 65535, arg6);
		this.ha();
	}

	@OriginalMember(owner = "client!ka", name = "ha", descriptor = "()V")
	protected abstract void ha();

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "(III)V")
	public abstract void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(SS)V")
	public abstract void i(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!lq;")
	public abstract Class141[] method4944();

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "(I)V")
	public abstract void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	public abstract void method4945();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "(SS)V")
	public abstract void G(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(IILclient!o;Lclient!o;III)V")
	public abstract void g(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2, @OriginalArg(3) Class55 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method4947(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
