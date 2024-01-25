import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class153 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
	protected boolean aBoolean880 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class153() {
	}

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!sba;")
	public abstract Class313[] method8575();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
	public abstract boolean method8576();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILclient!is;I[IIZZLclient!is;)V")
	public final void method8577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub3_Sub9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) Class5_Sub3_Sub9 arg8) {
		if (arg4 == -1) {
			return;
		}
		this.method8602();
		if (!this.NA()) {
			this.method8592();
			return;
		}
		@Pc(26) Class354 local26 = arg8.aClass354Array1[arg4];
		@Pc(29) Class5_Sub55 local29 = local26.aClass5_Sub55_1;
		@Pc(31) Class354 local31 = null;
		if (arg3 != null) {
			local31 = arg3.aClass354Array1[arg1];
			if (local29 != local31.aClass5_Sub55_1) {
				local31 = null;
			}
		}
		this.method8588(0, arg2, arg5, local26, false, local29, arg0, arg6, local31, (boolean[]) null, arg7);
		this.wa();
		this.method8592();
	}

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!oha;IZ)V")
	public abstract void method8578(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class153 method8580(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method8582(@OriginalArg(0) Class153 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!is;IZ)V")
	public final void method8583(@OriginalArg(0) Class5_Sub3_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method8602();
		if (!this.NA()) {
			this.method8592();
			return;
		}
		@Pc(29) Class354 local29 = arg0.aClass354Array1[arg1];
		@Pc(32) Class5_Sub55 local32 = local29.aClass5_Sub55_1;
		for (@Pc(34) int local34 = 0; local34 < local29.anInt9977; local34++) {
			@Pc(41) short local41 = local29.aShortArray147[local34];
			if (local32.aBooleanArray40[local41]) {
				if (local29.aShortArray139[local34] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local32.anIntArray604[local41], local29.aShortArray146[local34], local29.aShortArray148[local34], local29.aShortArray140[local34]);
			}
		}
		this.wa();
		this.method8592();
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public abstract void method8584();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!oha;Lclient!vu;I)V")
	public abstract void method8585(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class28_Sub9 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!ld;")
	public abstract Class209[] method8587();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IILclient!uo;ZLclient!wha;IILclient!uo;[ZZ)V")
	private void method8588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class354 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class5_Sub55 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class354 arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) boolean arg10) {
		@Pc(9) int local9;
		if (arg8 == null || arg7 == 0) {
			for (local9 = 0; local9 < arg3.anInt9977; local9++) {
				@Pc(15) short local15 = arg3.aShortArray147[local9];
				if (arg9 == null || arg9[local15] == arg4 || arg5.anIntArray604[local15] == 0) {
					@Pc(39) short local39 = arg3.aShortArray139[local9];
					if (local39 != -1) {
						this.method8598(0, arg1 & arg5.anIntArray605[local39], 0, arg5.anIntArrayArray60[local39], 0, 0, arg2, arg0, arg10);
					}
					this.method8598(arg3.aShortArray140[local9], arg5.anIntArray605[local15] & arg1, arg3.aShortArray148[local9], arg5.anIntArrayArray60[local15], arg5.anIntArray604[local15], arg3.aShortArray146[local9], arg2, arg0, arg10);
				}
			}
			return;
		}
		local9 = 0;
		@Pc(116) int local116 = 0;
		for (@Pc(118) int local118 = 0; local118 < arg5.anInt10633; local118++) {
			@Pc(121) boolean local121 = false;
			if (local9 < arg3.anInt9977 && local118 == arg3.aShortArray147[local9]) {
				local121 = true;
			}
			@Pc(143) boolean local143 = false;
			if (arg8.anInt9977 > local116 && arg8.aShortArray147[local116] == local118) {
				local143 = true;
			}
			if (local121 || local143) {
				if (arg9 == null || arg9[local118] == arg4 || arg5.anIntArray604[local118] == 0) {
					@Pc(192) short local192 = 0;
					@Pc(197) int local197 = arg5.anIntArray604[local118];
					if (local197 == 3 || local197 == 10) {
						local192 = 128;
					}
					@Pc(219) short local219;
					@Pc(221) short local221;
					@Pc(215) short local215;
					@Pc(217) short local217;
					@Pc(213) byte local213;
					if (local121) {
						local213 = arg3.aByteArray101[local9];
						local219 = arg3.aShortArray146[local9];
						local215 = arg3.aShortArray140[local9];
						local221 = arg3.aShortArray148[local9];
						local217 = arg3.aShortArray139[local9];
						local9++;
					} else {
						local213 = 0;
						local215 = local192;
						local217 = -1;
						local219 = local192;
						local221 = local192;
					}
					@Pc(254) short local254;
					@Pc(260) short local260;
					@Pc(252) short local252;
					@Pc(256) short local256;
					@Pc(258) byte local258;
					if (local143) {
						local256 = arg8.aShortArray139[local116];
						local254 = arg8.aShortArray146[local116];
						local260 = arg8.aShortArray148[local116];
						local258 = arg8.aByteArray101[local116];
						local252 = arg8.aShortArray140[local116];
						local116++;
					} else {
						local252 = local192;
						local254 = local192;
						local256 = -1;
						local258 = 0;
						local260 = local192;
					}
					if (local217 != -1) {
						this.method8598(0, arg1 & arg5.anIntArray605[local217], 0, arg5.anIntArrayArray60[local217], 0, 0, arg2, arg0, arg10);
					} else if (local256 != -1) {
						this.method8598(0, arg1 & arg5.anIntArray605[local256], 0, arg5.anIntArrayArray60[local256], 0, 0, arg2, arg0, arg10);
					}
					@Pc(355) int local355;
					@Pc(357) int local357;
					@Pc(353) int local353;
					if ((local213 & 0x2) == 0 && (local258 & 0x1) == 0) {
						@Pc(373) int local373;
						if (local197 == 2) {
							local373 = local254 - local219 & 0x3FFF;
							@Pc(491) int local491 = local260 - local221 & 0x3FFF;
							if (local373 >= 8192) {
								local373 -= 16384;
							}
							if (local491 >= 8192) {
								local491 -= 16384;
							}
							@Pc(506) int local506 = local252 - local215 & 0x3FFF;
							local357 = local491 * arg7 / arg6 + local221 & 0x3FFF;
							local355 = local219 + arg7 * local373 / arg6 & 0x3FFF;
							if (local506 >= 8192) {
								local506 -= 16384;
							}
							local353 = local215 + local506 * arg7 / arg6 & 0x3FFF;
						} else if (local197 == 9) {
							local373 = local254 - local219 & 0x3FFF;
							if (local373 >= 8192) {
								local373 -= 16384;
							}
							local353 = 0;
							local357 = 0;
							local355 = local219 + arg7 * local373 / arg6 & 0x3FFF;
						} else if (local197 == 7) {
							local373 = local254 - local219 & 0x3F;
							if (local373 >= 32) {
								local373 -= 64;
							}
							local353 = local215 + arg7 * (local252 - local215) / arg6;
							local357 = local221 + arg7 * (local260 - local221) / arg6;
							local355 = local219 + local373 * arg7 / arg6 & 0x3F;
						} else {
							local357 = arg7 * (local260 - local221) / arg6 + local221;
							local353 = (local252 - local215) * arg7 / arg6 + local215;
							local355 = (local254 - local219) * arg7 / arg6 + local219;
						}
					} else {
						local353 = local215;
						local355 = local219;
						local357 = local221;
					}
					this.method8598(local353, arg5.anIntArray605[local118] & arg1, local357, arg5.anIntArrayArray60[local118], local197, local355, arg2, arg0, arg10);
				} else {
					if (local143) {
						local116++;
					}
					if (local121) {
						local9++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!oha;)V")
	public abstract void method8589(@OriginalArg(0) Class254 arg0);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!oha;ZII)Z")
	public abstract boolean method8590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!is;Lclient!is;Lclient!is;IIIIZLclient!is;B[ZIIII)V")
	public final void method8591(@OriginalArg(0) Class5_Sub3_Sub9 arg0, @OriginalArg(1) Class5_Sub3_Sub9 arg1, @OriginalArg(2) Class5_Sub3_Sub9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class5_Sub3_Sub9 arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg5 == -1) {
			return;
		}
		if (arg9 == null || arg11 == -1) {
			this.method8599(arg10, arg12, arg8, 0, arg5, arg4, arg7, arg0);
			return;
		}
		this.method8602();
		if (!this.NA()) {
			this.method8592();
			return;
		}
		@Pc(43) Class354 local43 = arg0.aClass354Array1[arg5];
		@Pc(46) Class5_Sub55 local46 = local43.aClass5_Sub55_1;
		@Pc(48) Class354 local48 = null;
		if (arg8 != null) {
			local48 = arg8.aClass354Array1[arg4];
			if (local48.aClass5_Sub55_1 != local46) {
				local48 = null;
			}
		}
		this.method8588(0, 65535, (int[]) null, local43, false, local46, arg12, arg10, local48, arg9, arg7);
		@Pc(80) Class354 local80 = arg2.aClass354Array1[arg11];
		@Pc(82) Class354 local82 = null;
		if (arg1 != null) {
			local82 = arg1.aClass354Array1[arg13];
			if (local82.aClass5_Sub55_1 != local46) {
				local82 = null;
			}
		}
		this.method8596(0, new int[0], 0, 0, 0, 0, arg7);
		this.method8588(0, 65535, (int[]) null, local80, true, local80.aClass5_Sub55_1, arg6, arg3, local82, arg9, arg7);
		this.wa();
		this.method8592();
	}

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method8592();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class5_Sub3_Sub7 ba(@OriginalArg(0) Class5_Sub3_Sub7 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!oha;ZI)Z")
	public abstract boolean method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!oha;Lclient!vu;II)V")
	public abstract void method8594(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class28_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!s;IIIIII)V")
	protected final void method8595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(20) int local20 = -arg6 / 2;
		@Pc(25) int local25 = -arg4 / 2;
		@Pc(35) int local35 = arg2.method7702(arg5 + local20, local25 + arg7);
		@Pc(39) int local39 = arg6 / 2;
		@Pc(44) int local44 = -arg4 / 2;
		@Pc(55) int local55 = arg2.method7702(local39 + arg5, arg7 - -local44);
		@Pc(60) int local60 = -arg6 / 2;
		@Pc(64) int local64 = arg4 / 2;
		@Pc(75) int local75 = arg2.method7702(local60 + arg5, arg7 - -local64);
		@Pc(79) int local79 = arg6 / 2;
		@Pc(83) int local83 = arg4 / 2;
		@Pc(93) int local93 = arg2.method7702(local79 + arg5, local83 + arg7);
		@Pc(104) int local104 = local55 <= local35 ? local55 : local35;
		@Pc(111) int local111 = local93 <= local75 ? local93 : local75;
		@Pc(122) int local122 = local55 >= local93 ? local93 : local55;
		@Pc(159) int local159;
		if (arg4 != 0) {
			@Pc(138) int local138 = (int) (Math.atan2((double) (local104 - local111), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local138 != 0) {
				if (arg0 != 0) {
					if (local138 > 8192) {
						local159 = 16384 - arg0;
						if (local159 > local138) {
							local138 = local159;
						}
					} else if (arg0 < local138) {
						local138 = arg0;
					}
				}
				this.FA(local138);
			}
		}
		@Pc(174) int local174 = local35 >= local75 ? local75 : local35;
		@Pc(179) int local179 = local35 + local93;
		if (arg6 != 0) {
			@Pc(195) int local195 = (int) (Math.atan2((double) (local174 - local122), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local195 != 0) {
				if (arg3 != 0) {
					if (local195 > 8192) {
						local159 = 16384 - arg3;
						if (local159 > local195) {
							local195 = local159;
						}
					} else if (arg3 < local195) {
						local195 = arg3;
					}
				}
				this.VA(local195);
			}
		}
		if (local179 > local75 + local55) {
			local179 = local55 + local75;
		}
		local179 = (local179 >> 1) - arg1;
		if (local179 != 0) {
			this.H(0, local179, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method8596(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method8597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[IIII[IIZ)V")
	private void method8598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(22) int local22;
		if (arg7 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local22 = -arg5;
				arg5 = arg0;
				arg0 = local22;
			} else if (arg4 == 3) {
				local22 = arg5;
				arg5 = arg0;
				arg0 = local22;
			} else if (arg4 == 2) {
				local22 = arg5;
				arg5 = -arg0 & 0x3FFF;
				arg0 = local22 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg0 = -arg0;
				arg5 = -arg5;
			} else if (arg4 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg0 = -arg0 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local22 = arg5;
				arg5 = -arg0;
				arg0 = local22;
			} else if (arg4 == 3) {
				local22 = arg5;
				arg5 = arg0;
				arg0 = local22;
			} else if (arg4 == 2) {
				local22 = arg5;
				arg5 = arg0 & 0x3FFF;
				arg0 = -local22 & 0x3FFF;
			}
		}
		if (arg1 == 65535) {
			this.method8596(arg4, arg3, arg5, arg2, arg0, arg7, arg8);
		} else {
			this.I(arg4, arg3, arg5, arg2, arg0, arg8, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!is;IIIIZLclient!is;)V")
	public final void method8599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub3_Sub9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class5_Sub3_Sub9 arg7) {
		if (arg4 == -1) {
			return;
		}
		this.method8602();
		if (!this.NA()) {
			this.method8592();
			return;
		}
		@Pc(22) Class354 local22 = arg7.aClass354Array1[arg4];
		@Pc(25) Class5_Sub55 local25 = local22.aClass5_Sub55_1;
		@Pc(27) Class354 local27 = null;
		if (arg2 != null) {
			local27 = arg2.aClass354Array1[arg5];
			if (local27.aClass5_Sub55_1 != local25) {
				local27 = null;
			}
		}
		this.method8588(arg3, 65535, (int[]) null, local22, false, local25, arg1, arg0, local27, (boolean[]) null, arg6);
		this.wa();
		this.method8592();
	}

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method8602();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();
}
