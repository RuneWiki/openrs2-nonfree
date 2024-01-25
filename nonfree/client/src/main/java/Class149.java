import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class149 {

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Z")
	protected boolean aBoolean740 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class149() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
	public abstract boolean method8846();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method8847(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!al;)V")
	public abstract void method8848(@OriginalArg(0) Class17 arg0);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	protected abstract void method8849();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!vg;ZLclient!cea;II[ZIZLclient!vg;I[I)V")
	private void method8850(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class372 arg1, @OriginalArg(3) Class3_Sub10 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) Class372 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10) {
		@Pc(11) int local11;
		if (arg1 == null || arg3 == 0) {
			for (local11 = 0; local11 < arg8.anInt10498; local11++) {
				@Pc(18) short local18 = arg8.aShortArray141[local11];
				if (arg5 == null || arg7 == arg5[local18] || arg2.anIntArray80[local18] == 0) {
					@Pc(42) short local42 = arg8.aShortArray144[local11];
					if (local42 != -1) {
						this.method8854(arg0, 0, arg2.anIntArrayArray6[local42], 0, arg10, arg4, 0, arg9 & arg2.anIntArray79[local42], 0);
					}
					this.method8854(arg0, arg8.aShortArray146[local11], arg2.anIntArrayArray6[local18], arg2.anIntArray80[local18], arg10, arg4, arg8.aShortArray139[local11], arg2.anIntArray79[local18] & arg9, arg8.aShortArray145[local11]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(107) int local107 = 0;
		for (@Pc(113) int local113 = 0; local113 < arg2.anInt1418; local113++) {
			@Pc(117) boolean local117 = false;
			if (arg8.anInt10498 > local11 && local113 == arg8.aShortArray141[local11]) {
				local117 = true;
			}
			@Pc(135) boolean local135 = false;
			if (local107 < arg1.anInt10498 && local113 == arg1.aShortArray141[local107]) {
				local135 = true;
			}
			if (local117 || local135) {
				if (arg5 == null || arg7 == arg5[local113] || arg2.anIntArray80[local113] == 0) {
					@Pc(192) short local192 = 0;
					@Pc(197) int local197 = arg2.anIntArray80[local113];
					if (local197 == 3 || local197 == 10) {
						local192 = 128;
					}
					@Pc(213) short local213;
					@Pc(215) short local215;
					@Pc(219) short local219;
					@Pc(217) short local217;
					@Pc(211) byte local211;
					if (local117) {
						local215 = arg8.aShortArray145[local11];
						local211 = arg8.aByteArray99[local11];
						local219 = arg8.aShortArray146[local11];
						local213 = arg8.aShortArray139[local11];
						local217 = arg8.aShortArray144[local11];
						local11++;
					} else {
						local211 = 0;
						local213 = local192;
						local215 = local192;
						local217 = -1;
						local219 = local192;
					}
					@Pc(274) short local274;
					@Pc(254) short local254;
					@Pc(264) short local264;
					@Pc(259) short local259;
					@Pc(269) byte local269;
					if (local135) {
						local254 = arg1.aShortArray145[local107];
						local259 = arg1.aShortArray144[local107];
						local264 = arg1.aShortArray146[local107];
						local269 = arg1.aByteArray99[local107];
						local274 = arg1.aShortArray139[local107];
						local107++;
					} else {
						local274 = local192;
						local254 = local192;
						local259 = -1;
						local264 = local192;
						local269 = 0;
					}
					if (local217 != -1) {
						this.method8854(arg0, 0, arg2.anIntArrayArray6[local217], 0, arg10, arg4, 0, arg2.anIntArray79[local217] & arg9, 0);
					} else if (local259 != -1) {
						this.method8854(arg0, 0, arg2.anIntArrayArray6[local259], 0, arg10, arg4, 0, arg2.anIntArray79[local259] & arg9, 0);
					}
					@Pc(404) int local404;
					@Pc(393) int local393;
					@Pc(415) int local415;
					if ((local211 & 0x2) == 0 && (local269 & 0x1) == 0) {
						@Pc(354) int local354;
						if (local197 == 2) {
							local354 = local274 - local213 & 0x3FFF;
							@Pc(360) int local360 = local254 - local215 & 0x3FFF;
							if (local360 >= 8192) {
								local360 -= 16384;
							}
							@Pc(371) int local371 = local264 - local219 & 0x3FFF;
							if (local354 >= 8192) {
								local354 -= 16384;
							}
							if (local371 >= 8192) {
								local371 -= 16384;
							}
							local393 = arg3 * local360 / arg6 + local215 & 0x3FFF;
							local404 = local213 + arg3 * local354 / arg6 & 0x3FFF;
							local415 = local219 + arg3 * local371 / arg6 & 0x3FFF;
						} else if (local197 == 9) {
							local354 = local274 - local213 & 0x3FFF;
							if (local354 >= 8192) {
								local354 -= 16384;
							}
							local415 = 0;
							local393 = 0;
							local404 = local213 + local354 * arg3 / arg6 & 0x3FFF;
						} else if (local197 == 7) {
							local354 = local274 - local213 & 0x3F;
							if (local354 >= 32) {
								local354 -= 64;
							}
							local404 = local213 + local354 * arg3 / arg6 & 0x3F;
							local415 = local219 + arg3 * (local264 - local219) / arg6;
							local393 = local215 + arg3 * (local254 - local215) / arg6;
						} else {
							local393 = local215 + (local254 - local215) * arg3 / arg6;
							local415 = local219 + (local264 - local219) * arg3 / arg6;
							local404 = local213 + (local274 - local213) * arg3 / arg6;
						}
					} else {
						local415 = local219;
						local404 = local213;
						local393 = local215;
					}
					this.method8854(arg0, local415, arg2.anIntArrayArray6[local113], local197, arg10, arg4, local404, arg2.anIntArray79[local113] & arg9, local393);
				} else {
					if (local135) {
						local107++;
					}
					if (local117) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method8851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!al;IZ)V")
	public abstract void method8852(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIZ[II[IIIII)V")
	private void method8854(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(64) int local64;
		if (arg5 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local64 = -arg6;
				arg6 = arg1;
				arg1 = local64;
			} else if (arg3 == 3) {
				local64 = arg6;
				arg6 = arg1;
				arg1 = local64;
			} else if (arg3 == 2) {
				local64 = arg6;
				arg6 = -arg1 & 0x3FFF;
				arg1 = local64 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg6 = -arg6;
				arg1 = -arg1;
			} else if (arg3 == 2) {
				arg6 = -arg6 & 0x3FFF;
				arg1 = -arg1 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local64 = arg6;
				arg6 = -arg1;
				arg1 = local64;
			} else if (arg3 == 3) {
				local64 = arg6;
				arg6 = arg1;
				arg1 = local64;
			} else if (arg3 == 2) {
				local64 = arg6;
				arg6 = arg1 & 0x3FFF;
				arg1 = -local64 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method8871(arg3, arg2, arg6, arg8, arg1, arg5, arg0);
		} else {
			this.I(arg3, arg2, arg6, arg8, arg1, arg0, arg7, arg4);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILclient!bea;ZILclient!bea;I)V")
	public final void method8856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub5_Sub3 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub5_Sub3 arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method8849();
		if (!this.NA()) {
			this.method8859();
			return;
		}
		@Pc(26) Class372 local26 = arg7.aClass372Array1[arg1];
		@Pc(29) Class3_Sub10 local29 = local26.aClass3_Sub10_1;
		@Pc(31) Class372 local31 = null;
		if (arg4 != null) {
			local31 = arg4.aClass372Array1[arg3];
			if (local29 != local31.aClass3_Sub10_1) {
				local31 = null;
			}
		}
		this.method8850(arg5, local31, local29, arg6, arg0, (boolean[]) null, arg2, false, local26, 65535, (int[]) null);
		this.wa();
		this.method8859();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!al;Lclient!ju;I)V")
	public abstract void method8857(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class34_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class149 method8858(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	protected abstract void method8859();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class3_Sub5_Sub11 ba(@OriginalArg(0) Class3_Sub5_Sub11 arg0);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILclient!bea;ILclient!bea;[ZIBILclient!bea;Lclient!bea;ZI)V")
	public final void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub5_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub5_Sub3 arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class3_Sub5_Sub3 arg10, @OriginalArg(12) Class3_Sub5_Sub3 arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		if (arg9 == -1) {
			return;
		}
		if (arg7 == null || arg0 == -1) {
			this.method8856(0, arg9, arg8, arg3, arg6, arg12, arg5, arg4);
			return;
		}
		this.method8849();
		if (!this.NA()) {
			this.method8859();
			return;
		}
		@Pc(37) Class372 local37 = arg4.aClass372Array1[arg9];
		@Pc(40) Class3_Sub10 local40 = local37.aClass3_Sub10_1;
		@Pc(42) Class372 local42 = null;
		if (arg6 != null) {
			local42 = arg6.aClass372Array1[arg3];
			if (local40 != local42.aClass3_Sub10_1) {
				local42 = null;
			}
		}
		this.method8850(arg12, local42, local40, arg5, 0, arg7, arg8, false, local37, 65535, (int[]) null);
		@Pc(74) Class372 local74 = arg10.aClass372Array1[arg0];
		@Pc(76) Class372 local76 = null;
		if (arg11 != null) {
			local76 = arg11.aClass372Array1[arg1];
			if (local40 != local76.aClass3_Sub10_1) {
				local76 = null;
			}
		}
		this.method8871(0, new int[0], 0, 0, 0, 0, arg12);
		this.method8850(arg12, local76, local74.aClass3_Sub10_1, arg13, 0, arg7, arg2, true, local74, 65535, (int[]) null);
		this.wa();
		this.method8859();
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!rea;")
	public abstract Class305[] method8861();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!al;ZII)Z")
	public abstract boolean method8862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bea;IB)V")
	public final void method8863(@OriginalArg(0) Class3_Sub5_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method8849();
		if (!this.NA()) {
			this.method8859();
			return;
		}
		@Pc(23) Class372 local23 = arg0.aClass372Array1[arg1];
		@Pc(26) Class3_Sub10 local26 = local23.aClass3_Sub10_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt10498; local28++) {
			@Pc(35) short local35 = local23.aShortArray141[local28];
			if (local26.aBooleanArray5[local35]) {
				if (local23.aShortArray144[local28] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local26.anIntArray80[local35], local23.aShortArray139[local28], local23.aShortArray145[local28], local23.aShortArray146[local28]);
			}
		}
		this.wa();
		this.method8859();
	}

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILclient!s;IIIII)V")
	protected final void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg7 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(35) int local35 = arg3.method7452(arg0 + local16, arg2 - -local21);
		@Pc(39) int local39 = arg7 / 2;
		@Pc(44) int local44 = -arg1 / 2;
		@Pc(55) int local55 = arg3.method7452(arg0 + local39, local44 + arg2);
		@Pc(60) int local60 = -arg7 / 2;
		@Pc(64) int local64 = arg1 / 2;
		@Pc(75) int local75 = arg3.method7452(arg0 + local60, arg2 - -local64);
		@Pc(79) int local79 = arg7 / 2;
		@Pc(83) int local83 = arg1 / 2;
		@Pc(94) int local94 = arg3.method7452(local79 + arg0, arg2 - -local83);
		@Pc(101) int local101 = local35 >= local55 ? local55 : local35;
		@Pc(118) int local118 = local94 > local75 ? local75 : local94;
		@Pc(125) int local125 = local94 <= local55 ? local94 : local55;
		@Pc(158) int local158;
		if (arg1 != 0) {
			@Pc(141) int local141 = (int) (Math.atan2((double) (local101 - local118), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local141 != 0) {
				if (arg4 != 0) {
					if (local141 > 8192) {
						local158 = 16384 - arg4;
						if (local158 > local141) {
							local141 = local158;
						}
					} else if (local141 > arg4) {
						local141 = arg4;
					}
				}
				this.FA(local141);
			}
		}
		@Pc(188) int local188 = local75 > local35 ? local35 : local75;
		@Pc(192) int local192 = local94 + local35;
		if (arg7 != 0) {
			@Pc(208) int local208 = (int) (Math.atan2((double) (local188 - local125), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local208 != 0) {
				if (arg6 != 0) {
					if (local208 > 8192) {
						local158 = 16384 - arg6;
						if (local208 < local158) {
							local208 = local158;
						}
					} else if (arg6 < local208) {
						local208 = arg6;
					}
				}
				this.VA(local208);
			}
		}
		if (local75 + local55 < local192) {
			local192 = local75 + local55;
		}
		local192 = (local192 >> 1) - arg5;
		if (local192 != 0) {
			this.H(0, local192, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILclient!bea;[IIILclient!bea;ZI)V")
	public final void method8865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub5_Sub3 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(8) Class3_Sub5_Sub3 arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) int arg8) {
		if (arg1 == -1) {
			return;
		}
		this.method8849();
		if (!this.NA()) {
			this.method8859();
			return;
		}
		@Pc(21) Class372 local21 = arg4.aClass372Array1[arg1];
		@Pc(29) Class3_Sub10 local29 = local21.aClass3_Sub10_1;
		@Pc(31) Class372 local31 = null;
		if (arg6 != null) {
			local31 = arg6.aClass372Array1[arg8];
			if (local29 != local31.aClass3_Sub10_1) {
				local31 = null;
			}
		}
		this.method8850(arg7, local31, local29, arg0, 0, (boolean[]) null, arg3, false, local21, arg2, arg5);
		this.wa();
		this.method8859();
	}

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!al;ZI)Z")
	public abstract boolean method8866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lclient!vja;")
	public abstract Class373[] method8867();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!al;Lclient!ju;II)V")
	public abstract void method8869(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class34_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	public abstract void method8870();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method8871(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);
}
