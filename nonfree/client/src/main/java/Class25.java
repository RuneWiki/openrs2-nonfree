import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class25 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Z")
	protected boolean aBoolean674 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class25() {
	}

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
	public abstract boolean method7713();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!eca;IIIIILclient!eca;I)V")
	public final void method7715(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub5_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub5_Sub5 arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1) {
			return;
		}
		this.method7729();
		if (!this.NA()) {
			this.method7718();
			return;
		}
		@Pc(27) Class231 local27 = arg1.aClass231Array1[arg2];
		@Pc(30) Class2_Sub45 local30 = local27.aClass2_Sub45_1;
		@Pc(32) Class231 local32 = null;
		if (arg6 != null) {
			local32 = arg6.aClass231Array1[arg4];
			if (local30 != local32.aClass2_Sub45_1) {
				local32 = null;
			}
		}
		this.method7717(null, arg7, local32, 65535, local30, null, local27, false, arg3, arg0, arg5);
		this.wa();
		this.method7718();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!eca;IZII[ZLclient!eca;IIILclient!eca;Lclient!eca;II)V")
	public final void method7716(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5_Sub5 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) Class2_Sub5_Sub5 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class2_Sub5_Sub5 arg10, @OriginalArg(12) Class2_Sub5_Sub5 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == -1) {
			return;
		}
		if (arg5 == null || arg13 == -1) {
			this.method7715(arg2, arg10, arg4, 0, arg0, arg7, arg11, arg3);
			return;
		}
		this.method7729();
		if (!this.NA()) {
			this.method7718();
			return;
		}
		@Pc(42) Class231 local42 = arg10.aClass231Array1[arg4];
		@Pc(45) Class2_Sub45 local45 = local42.aClass2_Sub45_1;
		@Pc(47) Class231 local47 = null;
		if (arg11 != null) {
			local47 = arg11.aClass231Array1[arg0];
			if (local47.aClass2_Sub45_1 != local45) {
				local47 = null;
			}
		}
		this.method7717(arg5, arg3, local47, 65535, local45, null, local42, false, 0, arg2, arg7);
		@Pc(79) Class231 local79 = arg6.aClass231Array1[arg13];
		@Pc(81) Class231 local81 = null;
		if (arg1 != null) {
			local81 = arg1.aClass231Array1[arg12];
			if (local45 != local81.aClass2_Sub45_1) {
				local81 = null;
			}
		}
		this.method7714(0, new int[0], 0, 0, 0, 0, arg2);
		this.method7717(arg5, arg8, local81, 65535, local79.aClass2_Sub45_1, null, local79, true, 0, arg2, arg9);
		this.wa();
		this.method7718();
	}

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class112 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([ZILclient!nf;ILclient!sf;[ILclient!nf;ZIZIB)V")
	private void method7717(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class231 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub45 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) Class231 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (arg2 == null || arg10 == 0) {
			for (local18 = 0; local18 < arg6.anInt6652; local18++) {
				@Pc(24) short local24 = arg6.aShortArray74[local18];
				if (arg0 == null || arg0[local24] == arg7 || arg4.anIntArray591[local24] == 0) {
					@Pc(45) short local45 = arg6.aShortArray78[local18];
					if (local45 != -1) {
						this.method7722(arg4.anIntArrayArray78[local45], 0, 0, 0, arg9, 0, arg8, arg3 & arg4.anIntArray590[local45], arg5);
					}
					this.method7722(arg4.anIntArrayArray78[local24], arg6.aShortArray80[local18], arg6.aShortArray81[local18], arg4.anIntArray591[local24], arg9, arg6.aShortArray75[local18], arg8, arg4.anIntArray590[local24] & arg3, arg5);
				}
			}
			return;
		}
		local18 = 0;
		@Pc(115) int local115 = 0;
		for (@Pc(117) int local117 = 0; local117 < arg4.anInt8601; local117++) {
			@Pc(120) boolean local120 = false;
			if (local18 < arg6.anInt6652 && arg6.aShortArray74[local18] == local117) {
				local120 = true;
			}
			@Pc(134) boolean local134 = false;
			if (arg2.anInt6652 > local115 && arg2.aShortArray74[local115] == local117) {
				local134 = true;
			}
			if (local120 || local134) {
				if (arg0 == null || arg0[local117] == arg7 || arg4.anIntArray591[local117] == 0) {
					@Pc(187) short local187 = 0;
					@Pc(192) int local192 = arg4.anIntArray591[local117];
					if (local192 == 3 || local192 == 10) {
						local187 = 128;
					}
					@Pc(212) short local212;
					@Pc(206) short local206;
					@Pc(208) short local208;
					@Pc(210) short local210;
					@Pc(214) byte local214;
					if (local120) {
						local210 = arg6.aShortArray78[local18];
						local206 = arg6.aShortArray81[local18];
						local208 = arg6.aShortArray75[local18];
						local212 = arg6.aShortArray80[local18];
						local214 = arg6.aByteArray66[local18];
						local18++;
					} else {
						local206 = local187;
						local208 = local187;
						local210 = -1;
						local212 = local187;
						local214 = 0;
					}
					@Pc(263) short local263;
					@Pc(268) short local268;
					@Pc(248) short local248;
					@Pc(253) short local253;
					@Pc(258) byte local258;
					if (local134) {
						local248 = arg2.aShortArray75[local115];
						local253 = arg2.aShortArray78[local115];
						local258 = arg2.aByteArray66[local115];
						local263 = arg2.aShortArray80[local115];
						local268 = arg2.aShortArray81[local115];
						local115++;
					} else {
						local248 = local187;
						local268 = local187;
						local263 = local187;
						local253 = -1;
						local258 = 0;
					}
					@Pc(349) int local349;
					@Pc(339) int local339;
					@Pc(359) int local359;
					if ((local214 & 0x2) == 0 && (local258 & 0x1) == 0) {
						@Pc(299) int local299;
						if (local192 == 2) {
							local299 = local263 - local212 & 0x3FFF;
							@Pc(305) int local305 = local268 - local206 & 0x3FFF;
							@Pc(312) int local312 = local248 - local208 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							if (local305 >= 8192) {
								local305 -= 16384;
							}
							if (local312 >= 8192) {
								local312 -= 16384;
							}
							local339 = local206 + local305 * arg10 / arg1 & 0x3FFF;
							local349 = arg10 * local299 / arg1 + local212 & 0x3FFF;
							local359 = local208 + local312 * arg10 / arg1 & 0x3FFF;
						} else if (local192 == 9) {
							local299 = local263 - local212 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							local349 = local212 + arg10 * local299 / arg1 & 0x3FFF;
							local359 = 0;
							local339 = 0;
						} else if (local192 == 7) {
							local299 = local263 - local212 & 0x3F;
							if (local299 >= 32) {
								local299 -= 64;
							}
							local339 = local206 + arg10 * (local268 - local206) / arg1;
							local359 = (local248 - local208) * arg10 / arg1 + local208;
							local349 = local212 + arg10 * local299 / arg1 & 0x3F;
						} else {
							local339 = local206 + arg10 * (local268 - local206) / arg1;
							local349 = arg10 * (local263 - local212) / arg1 + local212;
							local359 = local208 + (local248 - local208) * arg10 / arg1;
						}
					} else {
						local339 = local206;
						local359 = local208;
						local349 = local212;
					}
					if (local210 != -1) {
						this.method7722(arg4.anIntArrayArray78[local210], 0, 0, 0, arg9, 0, arg8, arg4.anIntArray590[local210] & arg3, arg5);
					} else if (local253 != -1) {
						this.method7722(arg4.anIntArrayArray78[local253], 0, 0, 0, arg9, 0, arg8, arg3 & arg4.anIntArray590[local253], arg5);
					}
					this.method7722(arg4.anIntArrayArray78[local117], local349, local339, local192, arg9, local359, arg8, arg3 & arg4.anIntArray590[local117], arg5);
				} else {
					if (local134) {
						local115++;
					}
					if (local120) {
						local18++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	protected abstract void method7718();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLclient!eca;III[ILclient!eca;IBI)V")
	public final void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class2_Sub5_Sub5 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class2_Sub5_Sub5 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		if (arg8 == -1) {
			return;
		}
		this.method7729();
		if (!this.NA()) {
			this.method7718();
			return;
		}
		@Pc(27) Class231 local27 = arg2.aClass231Array1[arg8];
		@Pc(30) Class2_Sub45 local30 = local27.aClass2_Sub45_1;
		@Pc(32) Class231 local32 = null;
		if (arg6 != null) {
			local32 = arg6.aClass231Array1[arg0];
			if (local32.aClass2_Sub45_1 != local30) {
				local32 = null;
			}
		}
		this.method7717(null, arg7, local32, arg3, local30, arg5, local27, false, 0, arg1, arg4);
		this.wa();
		this.method7718();
	}

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!eca;I)V")
	public final void method7720(@OriginalArg(1) Class2_Sub5_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7729();
		if (!this.NA()) {
			this.method7718();
			return;
		}
		@Pc(22) Class231 local22 = arg0.aClass231Array1[arg1];
		@Pc(25) Class2_Sub45 local25 = local22.aClass2_Sub45_1;
		for (@Pc(27) int local27 = 0; local27 < local22.anInt6652; local27++) {
			@Pc(34) short local34 = local22.aShortArray74[local27];
			if (local25.aBooleanArray44[local34]) {
				if (local22.aShortArray78[local27] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local25.anIntArray591[local34], local22.aShortArray80[local27], local22.aShortArray81[local27], local22.aShortArray75[local27]);
			}
		}
		this.wa();
		this.method7718();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!kd;ZI)Z")
	public abstract boolean method7721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIBIZIII[I)V")
	private void method7722(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(17) int local17;
		if (arg6 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local17 = -arg1;
				arg1 = arg5;
				arg5 = local17;
			} else if (arg3 == 3) {
				local17 = arg1;
				arg1 = arg5;
				arg5 = local17;
			} else if (arg3 == 2) {
				local17 = arg1;
				arg1 = -arg5 & 0x3FFF;
				arg5 = local17 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg1 = -arg1;
				arg5 = -arg5;
			} else if (arg3 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg1 = -arg1 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local17 = arg1;
				arg1 = -arg5;
				arg5 = local17;
			} else if (arg3 == 3) {
				local17 = arg1;
				arg1 = arg5;
				arg5 = local17;
			} else if (arg3 == 2) {
				local17 = arg1;
				arg1 = arg5 & 0x3FFF;
				arg5 = -local17 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method7714(arg3, arg0, arg1, arg2, arg5, arg6, arg4);
		} else {
			this.I(arg3, arg0, arg1, arg2, arg5, arg4, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kd;)V")
	public abstract void method7723(@OriginalArg(0) Class6 arg0);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!uga;")
	public abstract Class337[] method7724();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kd;Lclient!ig;II)V")
	public abstract void method7725(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class11_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class2_Sub5_Sub12 ba(@OriginalArg(0) Class2_Sub5_Sub12 arg0);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method7726(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	public abstract void method7727();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!s;IIBIII)V")
	protected final void method7728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg5 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(32) int local32 = arg2.method7826(arg7 + local16, local21 + arg4);
		@Pc(36) int local36 = arg5 / 2;
		@Pc(41) int local41 = -arg1 / 2;
		@Pc(51) int local51 = arg2.method7826(local36 + arg7, local41 + arg4);
		@Pc(56) int local56 = -arg5 / 2;
		@Pc(66) int local66 = arg1 / 2;
		@Pc(79) int local79 = arg2.method7826(arg7 + local56, local66 + arg4);
		@Pc(83) int local83 = arg5 / 2;
		@Pc(87) int local87 = arg1 / 2;
		@Pc(98) int local98 = arg2.method7826(local83 + arg7, arg4 - -local87);
		@Pc(109) int local109 = local51 > local32 ? local32 : local51;
		@Pc(120) int local120 = local79 >= local98 ? local98 : local79;
		@Pc(127) int local127 = local98 > local51 ? local51 : local98;
		@Pc(134) int local134 = local79 > local32 ? local32 : local79;
		@Pc(174) int local174;
		if (arg1 != 0) {
			@Pc(150) int local150 = (int) (Math.atan2((double) (local109 - local120), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local150 != 0) {
				if (arg0 != 0) {
					if (local150 > 8192) {
						local174 = 16384 - arg0;
						if (local174 > local150) {
							local150 = local174;
						}
					} else if (local150 > arg0) {
						local150 = arg0;
					}
				}
				this.FA(local150);
			}
		}
		@Pc(187) int local187 = local32 + local98;
		if (arg5 != 0) {
			@Pc(205) int local205 = (int) (Math.atan2((double) (local134 - local127), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local205 != 0) {
				if (arg3 != 0) {
					if (local205 > 8192) {
						local174 = 16384 - arg3;
						if (local174 > local205) {
							local205 = local174;
						}
					} else if (arg3 < local205) {
						local205 = arg3;
					}
				}
				this.VA(local205);
			}
		}
		if (local51 + local79 < local187) {
			local187 = local51 + local79;
		}
		local187 = (local187 >> 1) - arg6;
		if (local187 != 0) {
			this.H(0, local187, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method7729();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!kd;ZII)Z")
	public abstract boolean method7730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!gi;")
	public abstract Class130[] method7731();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class25 method7732(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method7733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kd;IZ)V")
	public abstract void method7734(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kd;Lclient!ig;I)V")
	public abstract void method7735(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class11_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);
}
