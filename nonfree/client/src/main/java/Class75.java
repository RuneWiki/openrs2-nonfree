import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class75 {

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
	protected boolean aBoolean561 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class75() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method6782(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ro;I)V")
	public final void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub18 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method6784();
		if (!this.NA()) {
			this.method6791();
			return;
		}
		@Pc(22) Class225 local22 = arg1.aClass225Array1[arg0];
		@Pc(25) Class3_Sub15 local25 = local22.aClass3_Sub15_1;
		for (@Pc(27) int local27 = 0; local27 < local22.anInt6624; local27++) {
			@Pc(34) short local34 = local22.aShortArray79[local27];
			if (local25.aBooleanArray7[local34]) {
				if (local22.aShortArray75[local27] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local25.anIntArray169[local34], local22.aShortArray78[local27], local22.aShortArray74[local27], local22.aShortArray73[local27]);
			}
		}
		this.wa();
		this.method6791();
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	protected abstract void method6784();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	public abstract void method6785();

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ro;ILclient!ro;IIIZII)V")
	public final void method6786(@OriginalArg(0) Class3_Sub7_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub18 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 == -1) {
			return;
		}
		this.method6784();
		if (!this.NA()) {
			this.method6791();
			return;
		}
		@Pc(27) Class225 local27 = arg0.aClass225Array1[arg3];
		@Pc(30) Class3_Sub15 local30 = local27.aClass3_Sub15_1;
		@Pc(32) Class225 local32 = null;
		if (arg2 != null) {
			local32 = arg2.aClass225Array1[arg6];
			if (local30 != local32.aClass3_Sub15_1) {
				local32 = null;
			}
		}
		this.method6803(arg7, arg1, 65535, false, arg4, local30, arg5, (boolean[]) null, (int[]) null, local27, local32);
		this.wa();
		this.method6791();
	}

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ih;Lclient!kia;II)V")
	public abstract void method6788(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class9_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
	public abstract boolean method6789();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method6791();

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method6792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lclient!mv;")
	public abstract Class228[] method6794();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ro;Lclient!ro;IZIIII[II)V")
	public final void method6795(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub18 arg1, @OriginalArg(2) Class3_Sub7_Sub18 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		if (arg3 == -1) {
			return;
		}
		this.method6784();
		if (!this.NA()) {
			this.method6791();
			return;
		}
		@Pc(26) Class225 local26 = arg1.aClass225Array1[arg3];
		@Pc(29) Class3_Sub15 local29 = local26.aClass3_Sub15_1;
		@Pc(31) Class225 local31 = null;
		if (arg2 != null) {
			local31 = arg2.aClass225Array1[arg5];
			if (local29 != local31.aClass3_Sub15_1) {
				local31 = null;
			}
		}
		this.method6803(arg6, 0, arg0, false, arg7, local29, arg4, (boolean[]) null, arg8, local26, local31);
		this.wa();
		this.method6791();
	}

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class3_Sub7_Sub17 ba(@OriginalArg(0) Class3_Sub7_Sub17 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method6796(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ih;)V")
	public abstract void method6797(@OriginalArg(0) Class31 arg0);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ih;IZ)V")
	public abstract void method6798(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ih;Lclient!kia;I)V")
	public abstract void method6799(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class9_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!ih;ZII)Z")
	public abstract boolean method6800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!nba;")
	public abstract Class232[] method6801();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[II[IIIIZ)V")
	private void method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(17) int local17;
		if (arg6 == 1) {
			if (arg2 == 0 || arg2 == 1) {
				local17 = -arg1;
				arg1 = arg4;
				arg4 = local17;
			} else if (arg2 == 3) {
				local17 = arg1;
				arg1 = arg4;
				arg4 = local17;
			} else if (arg2 == 2) {
				local17 = arg1;
				arg1 = -arg4 & 0x3FFF;
				arg4 = local17 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg2 == 0 || arg2 == 1) {
				arg1 = -arg1;
				arg4 = -arg4;
			} else if (arg2 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg1 = -arg1 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg2 == 0 || arg2 == 1) {
				local17 = arg1;
				arg1 = -arg4;
				arg4 = local17;
			} else if (arg2 == 3) {
				local17 = arg1;
				arg1 = arg4;
				arg4 = local17;
			} else if (arg2 == 2) {
				local17 = arg1;
				arg1 = arg4 & 0x3FFF;
				arg4 = -local17 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.method6796(arg2, arg3, arg1, arg7, arg4, arg6, arg8);
		} else {
			this.I(arg2, arg3, arg1, arg7, arg4, arg8, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIIZILclient!ega;Z[Z[ILclient!mp;Lclient!mp;)V")
	private void method6803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub15 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) Class225 arg9, @OriginalArg(11) Class225 arg10) {
		@Pc(14) int local14;
		if (arg10 == null || arg0 == 0) {
			for (local14 = 0; local14 < arg9.anInt6624; local14++) {
				@Pc(21) short local21 = arg9.aShortArray79[local14];
				if (arg7 == null || arg3 == arg7[local21] || arg5.anIntArray169[local21] == 0) {
					@Pc(42) short local42 = arg9.aShortArray75[local14];
					if (local42 != -1) {
						this.method6802(arg5.anIntArray171[local42] & arg2, 0, 0, arg5.anIntArrayArray11[local42], 0, arg8, arg1, 0, arg6);
					}
					this.method6802(arg2 & arg5.anIntArray171[local21], arg9.aShortArray78[local14], arg5.anIntArray169[local21], arg5.anIntArrayArray11[local21], arg9.aShortArray73[local14], arg8, arg1, arg9.aShortArray74[local14], arg6);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(109) int local109 = 0;
		for (@Pc(111) int local111 = 0; local111 < arg5.anInt2697; local111++) {
			@Pc(117) boolean local117 = false;
			if (local14 < arg9.anInt6624 && arg9.aShortArray79[local14] == local111) {
				local117 = true;
			}
			@Pc(131) boolean local131 = false;
			if (local109 < arg10.anInt6624 && arg10.aShortArray79[local109] == local111) {
				local131 = true;
			}
			if (local117 || local131) {
				if (arg7 == null || arg7[local111] == arg3 || arg5.anIntArray169[local111] == 0) {
					@Pc(181) short local181 = 0;
					@Pc(186) int local186 = arg5.anIntArray169[local111];
					if (local186 == 3 || local186 == 10) {
						local181 = 128;
					}
					@Pc(206) short local206;
					@Pc(200) short local200;
					@Pc(198) short local198;
					@Pc(202) short local202;
					@Pc(204) byte local204;
					if (local117) {
						local198 = arg9.aShortArray73[local14];
						local206 = arg9.aShortArray78[local14];
						local202 = arg9.aShortArray75[local14];
						local204 = arg9.aByteArray56[local14];
						local200 = arg9.aShortArray74[local14];
						local14++;
					} else {
						local198 = local181;
						local200 = local181;
						local202 = -1;
						local204 = 0;
						local206 = local181;
					}
					@Pc(238) short local238;
					@Pc(240) short local240;
					@Pc(242) short local242;
					@Pc(246) short local246;
					@Pc(244) byte local244;
					if (local131) {
						local246 = arg10.aShortArray75[local109];
						local242 = arg10.aShortArray73[local109];
						local238 = arg10.aShortArray78[local109];
						local240 = arg10.aShortArray74[local109];
						local244 = arg10.aByteArray56[local109];
						local109++;
					} else {
						local238 = local181;
						local240 = local181;
						local242 = local181;
						local244 = 0;
						local246 = -1;
					}
					if (local202 != -1) {
						this.method6802(arg5.anIntArray171[local202] & arg2, 0, 0, arg5.anIntArrayArray11[local202], 0, arg8, arg1, 0, arg6);
					} else if (local246 != -1) {
						this.method6802(arg2 & arg5.anIntArray171[local246], 0, 0, arg5.anIntArrayArray11[local246], 0, arg8, arg1, 0, arg6);
					}
					@Pc(365) int local365;
					@Pc(369) int local369;
					@Pc(368) int local368;
					if ((local204 & 0x2) == 0 && (local244 & 0x1) == 0) {
						@Pc(349) int local349;
						if (local186 == 2) {
							local349 = local238 - local206 & 0x3FFF;
							@Pc(468) int local468 = local240 - local200 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							if (local468 >= 8192) {
								local468 -= 16384;
							}
							@Pc(484) int local484 = local242 - local198 & 0x3FFF;
							if (local484 >= 8192) {
								local484 -= 16384;
							}
							local369 = local200 + arg0 * local468 / arg4 & 0x3FFF;
							local365 = local206 + arg0 * local349 / arg4 & 0x3FFF;
							local368 = local484 * arg0 / arg4 + local198 & 0x3FFF;
						} else if (local186 == 9) {
							local349 = local238 - local206 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							local365 = arg0 * local349 / arg4 + local206 & 0x3FFF;
							local368 = 0;
							local369 = 0;
						} else if (local186 == 7) {
							local349 = local238 - local206 & 0x3F;
							if (local349 >= 32) {
								local349 -= 64;
							}
							local365 = local349 * arg0 / arg4 + local206 & 0x3F;
							local368 = local198 + arg0 * (local242 - local198) / arg4;
							local369 = local200 + (local240 - local200) * arg0 / arg4;
						} else {
							local365 = (local238 - local206) * arg0 / arg4 + local206;
							local368 = local198 + (local242 - local198) * arg0 / arg4;
							local369 = arg0 * (local240 - local200) / arg4 + local200;
						}
					} else {
						local368 = local198;
						local365 = local206;
						local369 = local200;
					}
					this.method6802(arg5.anIntArray171[local111] & arg2, local365, local186, arg5.anIntArrayArray11[local111], local368, arg8, arg1, local369, arg6);
				} else {
					if (local131) {
						local109++;
					}
					if (local117) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!ih;ZI)Z")
	public abstract boolean method6804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class75 method6805(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILclient!s;III)V")
	protected final void method6806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class91 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(16) int local16 = -arg6 / 2;
		@Pc(21) int local21 = -arg0 / 2;
		@Pc(32) int local32 = arg5.method7725(local16 + arg3, arg2 - -local21);
		@Pc(36) int local36 = arg6 / 2;
		@Pc(41) int local41 = -arg0 / 2;
		@Pc(51) int local51 = arg5.method7725(local36 + arg3, arg2 + local41);
		@Pc(56) int local56 = -arg6 / 2;
		@Pc(60) int local60 = arg0 / 2;
		@Pc(71) int local71 = arg5.method7725(local56 + arg3, arg2 - -local60);
		@Pc(75) int local75 = arg6 / 2;
		@Pc(79) int local79 = arg0 / 2;
		@Pc(89) int local89 = arg5.method7725(arg3 + local75, local79 + arg2);
		@Pc(96) int local96 = local51 > local32 ? local32 : local51;
		@Pc(107) int local107 = local71 < local89 ? local71 : local89;
		@Pc(114) int local114 = local51 >= local89 ? local89 : local51;
		@Pc(160) int local160;
		if (arg0 != 0) {
			@Pc(133) int local133 = (int) (Math.atan2((double) (local96 - local107), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local133 != 0) {
				if (arg1 != 0) {
					if (local133 > 8192) {
						local160 = 16384 - arg1;
						if (local133 < local160) {
							local133 = local160;
						}
					} else if (arg1 < local133) {
						local133 = arg1;
					}
				}
				this.FA(local133);
			}
		}
		@Pc(175) int local175 = local71 > local32 ? local32 : local71;
		@Pc(180) int local180 = local32 + local89;
		if (arg6 != 0) {
			@Pc(195) int local195 = (int) (Math.atan2((double) (local175 - local114), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local195 != 0) {
				if (arg7 != 0) {
					if (local195 > 8192) {
						local160 = 16384 - arg7;
						if (local160 > local195) {
							local195 = local160;
						}
					} else if (arg7 < local195) {
						local195 = arg7;
					}
				}
				this.VA(local195);
			}
		}
		if (local180 > local51 + local71) {
			local180 = local71 + local51;
		}
		local180 = (local180 >> 1) - arg4;
		if (local180 != 0) {
			this.H(0, local180, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ro;IIIIIIIILclient!ro;Lclient!ro;ZI[ZLclient!ro;)V")
	public final void method6807(@OriginalArg(0) Class3_Sub7_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class3_Sub7_Sub18 arg9, @OriginalArg(10) Class3_Sub7_Sub18 arg10, @OriginalArg(11) boolean arg11, @OriginalArg(13) boolean[] arg12, @OriginalArg(14) Class3_Sub7_Sub18 arg13) {
		if (arg8 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6786(arg10, 0, arg13, arg8, arg5, arg11, arg2, arg1);
			return;
		}
		this.method6784();
		if (!this.NA()) {
			this.method6791();
			return;
		}
		@Pc(46) Class225 local46 = arg10.aClass225Array1[arg8];
		@Pc(49) Class3_Sub15 local49 = local46.aClass3_Sub15_1;
		@Pc(51) Class225 local51 = null;
		if (arg13 != null) {
			local51 = arg13.aClass225Array1[arg2];
			if (local51.aClass3_Sub15_1 != local49) {
				local51 = null;
			}
		}
		this.method6803(arg1, 0, 65535, false, arg5, local49, arg11, arg12, (int[]) null, local46, local51);
		@Pc(83) Class225 local83 = arg0.aClass225Array1[arg7];
		@Pc(85) Class225 local85 = null;
		if (arg9 != null) {
			local85 = arg9.aClass225Array1[arg6];
			if (local49 != local85.aClass3_Sub15_1) {
				local85 = null;
			}
		}
		this.method6796(0, new int[0], 0, 0, 0, 0, arg11);
		this.method6803(arg3, 0, 65535, true, arg4, local83.aClass3_Sub15_1, arg11, arg12, (int[]) null, local83, local85);
		this.wa();
		this.method6791();
	}

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();
}
