import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class28 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
	protected boolean aBoolean619 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class28() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!sk;ZI)Z")
	public abstract boolean method6887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sk;)V")
	public abstract void method6888(@OriginalArg(0) Class25 arg0);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sk;IZ)V")
	public abstract void method6889(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!ija;)V")
	public final void method6890(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub6_Sub11 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method6907();
		if (!this.NA()) {
			this.method6896();
			return;
		}
		@Pc(23) Class136 local23 = arg1.aClass136Array1[arg0];
		@Pc(26) Class3_Sub52 local26 = local23.aClass3_Sub52_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt3404; local28++) {
			@Pc(35) short local35 = local23.aShortArray59[local28];
			if (local26.aBooleanArray27[local35]) {
				if (local23.aShortArray62[local28] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local26.anIntArray622[local35], local23.aShortArray61[local28], local23.aShortArray60[local28], local23.aShortArray66[local28]);
			}
		}
		this.wa();
		this.method6896();
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class3_Sub6_Sub12 ba(@OriginalArg(0) Class3_Sub6_Sub12 arg0);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[ZLclient!ija;IZIIIILclient!ija;ILclient!ija;Lclient!ija;)V")
	public final void method6891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[] arg2, @OriginalArg(4) Class3_Sub6_Sub11 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class3_Sub6_Sub11 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class3_Sub6_Sub11 arg12, @OriginalArg(14) Class3_Sub6_Sub11 arg13) {
		if (arg8 == -1) {
			return;
		}
		if (arg2 == null || arg1 == -1) {
			this.method6893(0, arg5, arg0, arg9, arg4, arg10, arg12, arg8);
			return;
		}
		this.method6907();
		if (!this.NA()) {
			this.method6896();
			return;
		}
		@Pc(38) Class136 local38 = arg10.aClass136Array1[arg8];
		@Pc(41) Class3_Sub52 local41 = local38.aClass3_Sub52_1;
		@Pc(43) Class136 local43 = null;
		if (arg12 != null) {
			local43 = arg12.aClass136Array1[arg4];
			if (local43.aClass3_Sub52_1 != local41) {
				local43 = null;
			}
		}
		this.method6910(local41, (int[]) null, local38, arg5, 65535, arg9, local43, arg2, arg0, 0, false);
		@Pc(80) Class136 local80 = arg13.aClass136Array1[arg1];
		@Pc(82) Class136 local82 = null;
		if (arg3 != null) {
			local82 = arg3.aClass136Array1[arg6];
			if (local41 != local82.aClass3_Sub52_1) {
				local82 = null;
			}
		}
		this.method6905(0, new int[0], 0, 0, 0, 0, arg5);
		this.method6910(local80.aClass3_Sub52_1, (int[]) null, local80, arg5, 65535, arg11, local82, arg2, arg7, 0, true);
		this.wa();
		this.method6896();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public abstract void method6892();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIIIILclient!ija;Lclient!ija;I)V")
	public final void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class3_Sub6_Sub11 arg5, @OriginalArg(7) Class3_Sub6_Sub11 arg6, @OriginalArg(8) int arg7) {
		if (arg7 == -1) {
			return;
		}
		this.method6907();
		if (!this.NA()) {
			this.method6896();
			return;
		}
		@Pc(20) Class136 local20 = arg5.aClass136Array1[arg7];
		@Pc(23) Class3_Sub52 local23 = local20.aClass3_Sub52_1;
		@Pc(25) Class136 local25 = null;
		if (arg6 != null) {
			local25 = arg6.aClass136Array1[arg4];
			if (local23 != local25.aClass3_Sub52_1) {
				local25 = null;
			}
		}
		this.method6910(local23, (int[]) null, local20, arg1, 65535, arg3, local25, (boolean[]) null, arg2, arg0, false);
		this.wa();
		this.method6896();
	}

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sk;Lclient!eea;II)V")
	public abstract void method6894(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class23_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method6895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	protected abstract void method6896();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method6897(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
	public abstract boolean method6899();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class28 method6900(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[II[IIZII)V")
	private void method6901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(27) int local27;
		if (arg0 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local27 = -arg5;
				arg5 = arg8;
				arg8 = local27;
			} else if (arg7 == 3) {
				local27 = arg5;
				arg5 = arg8;
				arg8 = local27;
			} else if (arg7 == 2) {
				local27 = arg5;
				arg5 = -arg8 & 0x3FFF;
				arg8 = local27 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg5 = -arg5;
				arg8 = -arg8;
			} else if (arg7 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local27 = arg5;
				arg5 = -arg8;
				arg8 = local27;
			} else if (arg7 == 3) {
				local27 = arg5;
				arg5 = arg8;
				arg8 = local27;
			} else if (arg7 == 2) {
				local27 = arg5;
				arg5 = arg8 & 0x3FFF;
				arg8 = -local27 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.method6905(arg7, arg4, arg5, arg1, arg8, arg0, arg6);
		} else {
			this.I(arg7, arg4, arg5, arg1, arg8, arg6, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!sk;ZII)Z")
	public abstract boolean method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method6905(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!s;IIIIII)V")
	protected final void method6906(@OriginalArg(0) int arg0, @OriginalArg(2) Class104 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg5 / 2;
		@Pc(21) int local21 = -arg4 / 2;
		@Pc(31) int local31 = arg1.method8286(local16 + arg3, arg7 + local21);
		@Pc(35) int local35 = arg5 / 2;
		@Pc(40) int local40 = -arg4 / 2;
		@Pc(51) int local51 = arg1.method8286(arg3 + local35, local40 + arg7);
		@Pc(56) int local56 = -arg5 / 2;
		@Pc(60) int local60 = arg4 / 2;
		@Pc(71) int local71 = arg1.method8286(local56 + arg3, arg7 - -local60);
		@Pc(75) int local75 = arg5 / 2;
		@Pc(79) int local79 = arg4 / 2;
		@Pc(89) int local89 = arg1.method8286(arg3 + local75, local79 + arg7);
		@Pc(96) int local96 = local31 < local51 ? local31 : local51;
		@Pc(107) int local107 = local71 < local89 ? local71 : local89;
		@Pc(118) int local118 = local89 <= local51 ? local89 : local51;
		@Pc(159) int local159;
		if (arg4 != 0) {
			@Pc(134) int local134 = (int) (Math.atan2((double) (local96 - local107), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local134 != 0) {
				if (arg0 != 0) {
					if (local134 > 8192) {
						local159 = 16384 - arg0;
						if (local134 < local159) {
							local134 = local159;
						}
					} else if (local134 > arg0) {
						local134 = arg0;
					}
				}
				this.FA(local134);
			}
		}
		@Pc(174) int local174 = local31 < local71 ? local31 : local71;
		if (arg5 != 0) {
			@Pc(193) int local193 = (int) (Math.atan2((double) (local174 - local118), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local193 != 0) {
				if (arg6 != 0) {
					if (local193 > 8192) {
						local159 = 16384 - arg6;
						if (local159 > local193) {
							local193 = local159;
						}
					} else if (local193 > arg6) {
						local193 = arg6;
					}
				}
				this.VA(local193);
			}
		}
		@Pc(229) int local229 = local89 + local31;
		if (local51 + local71 < local229) {
			local229 = local51 + local71;
		}
		local229 = (local229 >> 1) - arg2;
		if (local229 != 0) {
			this.H(0, local229, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method6907();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sk;Lclient!eea;I)V")
	public abstract void method6908(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class23_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ija;II[IIIZLclient!ija;IB)V")
	public final void method6909(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub6_Sub11 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class3_Sub6_Sub11 arg7, @OriginalArg(9) int arg8) {
		if (arg8 == -1) {
			return;
		}
		this.method6907();
		if (!this.NA()) {
			this.method6896();
			return;
		}
		@Pc(21) Class136 local21 = arg1.aClass136Array1[arg8];
		@Pc(24) Class3_Sub52 local24 = local21.aClass3_Sub52_1;
		@Pc(26) Class136 local26 = null;
		if (arg7 != null) {
			local26 = arg7.aClass136Array1[arg4];
			if (local26.aClass3_Sub52_1 != local24) {
				local26 = null;
			}
		}
		this.method6910(local24, arg3, local21, arg6, arg5, arg2, local26, (boolean[]) null, arg0, 0, false);
		this.wa();
		this.method6896();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uja;[ILclient!g;ZIIILclient!g;[ZIIZ)V")
	private void method6910(@OriginalArg(0) Class3_Sub52 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class136 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class136 arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(11) int local11;
		if (arg6 == null || arg5 == 0) {
			for (local11 = 0; local11 < arg2.anInt3404; local11++) {
				@Pc(18) short local18 = arg2.aShortArray59[local11];
				if (arg7 == null || arg10 == arg7[local18] || arg0.anIntArray622[local18] == 0) {
					@Pc(38) short local38 = arg2.aShortArray62[local11];
					if (local38 != -1) {
						this.method6901(arg9, 0, arg1, arg0.anIntArray623[local38] & arg4, arg0.anIntArrayArray100[local38], 0, arg3, 0, 0);
					}
					this.method6901(arg9, arg2.aShortArray60[local11], arg1, arg0.anIntArray623[local18] & arg4, arg0.anIntArrayArray100[local18], arg2.aShortArray61[local11], arg3, arg0.anIntArray622[local18], arg2.aShortArray66[local11]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(110) int local110 = 0;
		for (@Pc(112) int local112 = 0; local112 < arg0.anInt9526; local112++) {
			@Pc(116) boolean local116 = false;
			if (local11 < arg2.anInt3404 && local112 == arg2.aShortArray59[local11]) {
				local116 = true;
			}
			@Pc(130) boolean local130 = false;
			if (arg6.anInt3404 > local110 && arg6.aShortArray59[local110] == local112) {
				local130 = true;
			}
			if (local116 || local130) {
				if (arg7 == null || arg10 == arg7[local112] || arg0.anIntArray622[local112] == 0) {
					@Pc(176) short local176 = 0;
					@Pc(181) int local181 = arg0.anIntArray622[local112];
					if (local181 == 3 || local181 == 10) {
						local176 = 128;
					}
					@Pc(199) short local199;
					@Pc(197) short local197;
					@Pc(205) short local205;
					@Pc(203) short local203;
					@Pc(201) byte local201;
					if (local116) {
						local203 = arg2.aShortArray62[local11];
						local199 = arg2.aShortArray61[local11];
						local205 = arg2.aShortArray66[local11];
						local197 = arg2.aShortArray60[local11];
						local201 = arg2.aByteArray26[local11];
						local11++;
					} else {
						local197 = local176;
						local199 = local176;
						local201 = 0;
						local203 = -1;
						local205 = local176;
					}
					@Pc(255) short local255;
					@Pc(250) short local250;
					@Pc(240) short local240;
					@Pc(245) short local245;
					@Pc(260) byte local260;
					if (local130) {
						local240 = arg6.aShortArray66[local110];
						local245 = arg6.aShortArray62[local110];
						local250 = arg6.aShortArray60[local110];
						local255 = arg6.aShortArray61[local110];
						local260 = arg6.aByteArray26[local110];
						local110++;
					} else {
						local240 = local176;
						local260 = 0;
						local250 = local176;
						local245 = -1;
						local255 = local176;
					}
					@Pc(290) int local290;
					@Pc(288) int local288;
					@Pc(286) int local286;
					if ((local201 & 0x2) == 0 && (local260 & 0x1) == 0) {
						@Pc(305) int local305;
						if (local181 == 2) {
							local305 = local255 - local199 & 0x3FFF;
							@Pc(428) int local428 = local250 - local197 & 0x3FFF;
							if (local428 >= 8192) {
								local428 -= 16384;
							}
							if (local305 >= 8192) {
								local305 -= 16384;
							}
							@Pc(447) int local447 = local240 - local205 & 0x3FFF;
							if (local447 >= 8192) {
								local447 -= 16384;
							}
							local288 = arg5 * local428 / arg8 + local197 & 0x3FFF;
							local290 = arg5 * local305 / arg8 + local199 & 0x3FFF;
							local286 = local205 + arg5 * local447 / arg8 & 0x3FFF;
						} else if (local181 == 9) {
							local305 = local255 - local199 & 0x3FFF;
							if (local305 >= 8192) {
								local305 -= 16384;
							}
							local290 = local199 + local305 * arg5 / arg8 & 0x3FFF;
							local286 = 0;
							local288 = 0;
						} else if (local181 == 7) {
							local305 = local255 - local199 & 0x3F;
							if (local305 >= 32) {
								local305 -= 64;
							}
							local290 = local305 * arg5 / arg8 + local199 & 0x3F;
							local288 = (local250 - local197) * arg5 / arg8 + local197;
							local286 = arg5 * (local240 - local205) / arg8 + local205;
						} else {
							local288 = local197 + arg5 * (local250 - local197) / arg8;
							local286 = local205 + (local240 - local205) * arg5 / arg8;
							local290 = (local255 - local199) * arg5 / arg8 + local199;
						}
					} else {
						local286 = local205;
						local288 = local197;
						local290 = local199;
					}
					if (local203 != -1) {
						this.method6901(arg9, 0, arg1, arg0.anIntArray623[local203] & arg4, arg0.anIntArrayArray100[local203], 0, arg3, 0, 0);
					} else if (local245 != -1) {
						this.method6901(arg9, 0, arg1, arg0.anIntArray623[local245] & arg4, arg0.anIntArrayArray100[local245], 0, arg3, 0, 0);
					}
					this.method6901(arg9, local288, arg1, arg0.anIntArray623[local112] & arg4, arg0.anIntArrayArray100[local112], local290, arg3, local181, local286);
				} else {
					if (local116) {
						local11++;
					}
					if (local130) {
						local110++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lclient!qr;")
	public abstract Class298[] method6911();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!oea;")
	public abstract Class261[] method6912();

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();
}
