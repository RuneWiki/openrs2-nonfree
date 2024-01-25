import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public abstract class Class116 {

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	protected Class116() {
	}

	@OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
	protected abstract void j();

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!vs;II)V")
	public abstract void method3104(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class20_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public abstract void method3105();

	@OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIILclient!ta;Z)V")
	protected final void method3106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class41 arg7) {
		@Pc(16) int local16 = -arg0 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(30) int local30 = arg7.a(arg3 + local16, local21 + arg2);
		@Pc(34) int local34 = arg0 / 2;
		@Pc(39) int local39 = -arg1 / 2;
		@Pc(49) int local49 = arg7.a(arg3 + local34, local39 + arg2);
		@Pc(54) int local54 = -arg0 / 2;
		@Pc(58) int local58 = arg1 / 2;
		@Pc(67) int local67 = arg7.a(local54 + arg3, local58 + arg2);
		@Pc(71) int local71 = arg0 / 2;
		@Pc(75) int local75 = arg1 / 2;
		@Pc(84) int local84 = arg7.a(local71 + arg3, arg2 + local75);
		@Pc(91) int local91 = local49 <= local30 ? local49 : local30;
		@Pc(102) int local102 = local67 >= local84 ? local84 : local67;
		@Pc(109) int local109 = local84 <= local49 ? local84 : local49;
		@Pc(116) int local116 = local30 < local67 ? local30 : local67;
		@Pc(147) int local147;
		if (arg1 != 0) {
			@Pc(132) int local132 = (int) (Math.atan2((double) (local91 - local102), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local132 != 0) {
				if (arg5 != 0) {
					if (local132 > 8192) {
						local147 = 16384 - arg5;
						if (local147 > local132) {
							local132 = local147;
						}
					} else if (local132 > arg5) {
						local132 = arg5;
					}
				}
				this.Z(local132);
			}
		}
		@Pc(170) int local170 = local84 + local30;
		if (arg0 != 0) {
			@Pc(189) int local189 = (int) (Math.atan2((double) (local116 - local109), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local189 != 0) {
				if (arg4 != 0) {
					if (local189 > 8192) {
						local147 = 16384 - arg4;
						if (local147 > local189) {
							local189 = local147;
						}
					} else if (local189 > arg4) {
						local189 = arg4;
					}
				}
				this.R(local189);
			}
		}
		if (local67 + local49 < local170) {
			local170 = local49 + local67;
		}
		local170 = (local170 >> 1) - arg6;
		if (local170 != 0) {
			this.JA(0, local170, 0);
		}
	}

	@OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
	public abstract void R(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method3107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	public abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(3) Class41 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!cm;II)V")
	public final void method3108(@OriginalArg(0) Class4_Sub2_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.w()) {
			return;
		}
		@Pc(23) Class221 local23 = arg0.aClass221Array1[arg1];
		@Pc(26) Class4_Sub23 local26 = local23.aClass4_Sub23_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt5758; local28++) {
			@Pc(35) short local35 = local23.aShortArray94[local28];
			if (local26.aBooleanArray19[local35]) {
				if (local23.aShortArray90[local28] != -1) {
					this.N(0, 0, 0, 0);
				}
				this.N(local26.anIntArray336[local35], local23.aShortArray89[local28], local23.aShortArray92[local28], local23.aShortArray91[local28]);
			}
		}
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!cm;IILclient!cm;IIII)V")
	public final void method3109(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub2_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub2_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 == -1 || !this.w()) {
			return;
		}
		@Pc(17) Class221 local17 = arg1.aClass221Array1[arg6];
		@Pc(20) Class4_Sub23 local20 = local17.aClass4_Sub23_1;
		@Pc(22) Class221 local22 = null;
		if (arg3 != null) {
			local22 = arg3.aClass221Array1[arg4];
			if (local20 != local22.aClass4_Sub23_1) {
				local22 = null;
			}
		}
		this.method3121(arg7, null, 65535, arg2, local17, local20, false, local22, arg5, arg0, null);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	public abstract Class4_Sub2_Sub3 fa(@OriginalArg(0) Class4_Sub2_Sub3 arg0);

	@OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
	protected abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
	public abstract int m();

	@OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
	protected abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()[Lclient!ew;")
	public abstract Class76[] method3111();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([IIZILclient!cm;IIILclient!cm;II)V")
	public final void method3113(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class4_Sub2_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4_Sub2_Sub6 arg7, @OriginalArg(10) int arg8) {
		if (arg1 == -1 || !this.w()) {
			return;
		}
		@Pc(21) Class221 local21 = arg7.aClass221Array1[arg1];
		@Pc(24) Class4_Sub23 local24 = local21.aClass4_Sub23_1;
		@Pc(26) Class221 local26 = null;
		if (arg3 != null) {
			local26 = arg3.aClass221Array1[arg8];
			if (local24 != local26.aClass4_Sub23_1) {
				local26 = null;
			}
		}
		this.method3121(arg4, null, arg5, arg6, local21, local24, false, local26, 0, arg2, arg0);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public abstract void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
	public abstract int D();

	@OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
	public abstract void IA();

	@OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
	public abstract int NA();

	@OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
	public abstract void aa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
	public abstract void UA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()[Lclient!fs;")
	public abstract Class88[] method3115();

	@OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
	public abstract void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!vs;I)V")
	public abstract void method3117(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class20_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
	public abstract void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	public abstract void method3118(@OriginalArg(0) Class116 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
	public abstract int P();

	@OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
	protected abstract boolean w();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
	public abstract void method3119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()Z")
	public abstract boolean method3120();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[ZIILclient!rl;Lclient!md;ZILclient!rl;IZ[I)V")
	private void method3121(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class221 arg4, @OriginalArg(5) Class4_Sub23 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) Class221 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int[] arg10) {
		@Pc(17) int local17;
		if (arg7 == null || arg3 == 0) {
			for (local17 = 0; local17 < arg4.anInt5758; local17++) {
				@Pc(24) short local24 = arg4.aShortArray94[local17];
				if (arg1 == null || arg1[local24] == arg6 || arg5.anIntArray336[local24] == 0) {
					@Pc(44) short local44 = arg4.aShortArray90[local17];
					if (local44 != -1) {
						this.method3124(arg5.anIntArrayArray49[local44], 0, arg2 & arg5.anIntArray337[local44], 0, arg9, arg8, arg10, 0, 0);
					}
					this.method3124(arg5.anIntArrayArray49[local24], arg4.aShortArray92[local17], arg2 & arg5.anIntArray337[local24], arg5.anIntArray336[local24], arg9, arg8, arg10, arg4.aShortArray91[local17], arg4.aShortArray89[local17]);
				}
			}
			return;
		}
		local17 = 0;
		@Pc(114) int local114 = 0;
		for (@Pc(116) int local116 = 0; local116 < arg5.anInt4039; local116++) {
			@Pc(120) boolean local120 = false;
			if (local17 < arg4.anInt5758 && local116 == arg4.aShortArray94[local17]) {
				local120 = true;
			}
			@Pc(138) boolean local138 = false;
			if (local114 < arg7.anInt5758 && local116 == arg7.aShortArray94[local114]) {
				local138 = true;
			}
			if (local120 || local138) {
				if (arg1 == null || arg6 == arg1[local116] || arg5.anIntArray336[local116] == 0) {
					@Pc(176) short local176 = 0;
					@Pc(181) int local181 = arg5.anIntArray336[local116];
					if (local181 == 3 || local181 == 10) {
						local176 = 128;
					}
					@Pc(213) short local213;
					@Pc(208) short local208;
					@Pc(198) short local198;
					@Pc(203) short local203;
					@Pc(218) byte local218;
					if (local120) {
						local198 = arg4.aShortArray91[local17];
						local203 = arg4.aShortArray90[local17];
						local208 = arg4.aShortArray92[local17];
						local213 = arg4.aShortArray89[local17];
						local218 = arg4.aByteArray74[local17];
						local17++;
					} else {
						local218 = 0;
						local203 = -1;
						local213 = local176;
						local198 = local176;
						local208 = local176;
					}
					@Pc(243) short local243;
					@Pc(248) short local248;
					@Pc(238) short local238;
					@Pc(253) short local253;
					@Pc(258) byte local258;
					if (local138) {
						local238 = arg7.aShortArray91[local114];
						local243 = arg7.aShortArray89[local114];
						local248 = arg7.aShortArray92[local114];
						local253 = arg7.aShortArray90[local114];
						local258 = arg7.aByteArray74[local114];
						local114++;
					} else {
						local253 = -1;
						local248 = local176;
						local238 = local176;
						local258 = 0;
						local243 = local176;
					}
					if (local203 != -1) {
						this.method3124(arg5.anIntArrayArray49[local203], 0, arg2 & arg5.anIntArray337[local203], 0, arg9, arg8, arg10, 0, 0);
					} else if (local253 != -1) {
						this.method3124(arg5.anIntArrayArray49[local253], 0, arg5.anIntArray337[local253] & arg2, 0, arg9, arg8, arg10, 0, 0);
					}
					@Pc(335) int local335;
					@Pc(333) int local333;
					@Pc(331) int local331;
					if ((local218 & 0x2) == 0 && (local258 & 0x1) == 0) {
						@Pc(352) int local352;
						if (local181 == 2) {
							local352 = local243 - local213 & 0x3FFF;
							@Pc(472) int local472 = local248 - local208 & 0x3FFF;
							if (local472 >= 8192) {
								local472 -= 16384;
							}
							if (local352 >= 8192) {
								local352 -= 16384;
							}
							@Pc(490) int local490 = local238 - local198 & 0x3FFF;
							local333 = local208 + arg3 * local472 / arg0 & 0x3FFF;
							if (local490 >= 8192) {
								local490 -= 16384;
							}
							local335 = local352 * arg3 / arg0 + local213 & 0x3FFF;
							local331 = arg3 * local490 / arg0 + local198 & 0x3FFF;
						} else if (local181 == 9) {
							local352 = local243 - local213 & 0x3FFF;
							if (local352 >= 8192) {
								local352 -= 16384;
							}
							local331 = 0;
							local333 = 0;
							local335 = arg3 * local352 / arg0 + local213 & 0x3FFF;
						} else if (local181 == 7) {
							local352 = local243 - local213 & 0x3F;
							if (local352 >= 32) {
								local352 -= 64;
							}
							local333 = (local248 - local208) * arg3 / arg0 + local208;
							local331 = local198 + (local238 - local198) * arg3 / arg0;
							local335 = local213 + local352 * arg3 / arg0 & 0x3F;
						} else {
							local331 = arg3 * (local238 - local198) / arg0 + local198;
							local335 = arg3 * (local243 - local213) / arg0 + local213;
							local333 = (local248 - local208) * arg3 / arg0 + local208;
						}
					} else {
						local331 = local198;
						local333 = local208;
						local335 = local213;
					}
					this.method3124(arg5.anIntArrayArray49[local116], local333, arg5.anIntArray337[local116] & arg2, local181, arg9, arg8, arg10, local331, local335);
				} else {
					if (local138) {
						local114++;
					}
					if (local120) {
						local17++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
	public abstract void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B[ZIIZIIIILclient!cm;ILclient!cm;ILclient!cm;Lclient!cm;)V")
	public final void method3122(@OriginalArg(1) boolean[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class4_Sub2_Sub6 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class4_Sub2_Sub6 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class4_Sub2_Sub6 arg12, @OriginalArg(14) Class4_Sub2_Sub6 arg13) {
		if (arg7 == -1) {
			return;
		}
		if (arg0 == null || arg9 == -1) {
			this.method3109(arg3, arg13, arg11, arg12, arg1, 0, arg7, arg4);
		} else if (this.w()) {
			@Pc(35) Class221 local35 = arg13.aClass221Array1[arg7];
			@Pc(38) Class4_Sub23 local38 = local35.aClass4_Sub23_1;
			@Pc(44) Class221 local44 = null;
			if (arg12 != null) {
				local44 = arg12.aClass221Array1[arg1];
				if (local38 != local44.aClass4_Sub23_1) {
					local44 = null;
				}
			}
			this.method3121(arg4, arg0, 65535, arg11, local35, local38, false, local44, 0, arg3, null);
			@Pc(76) Class221 local76 = arg10.aClass221Array1[arg9];
			@Pc(78) Class221 local78 = null;
			if (arg8 != null) {
				local78 = arg8.aClass221Array1[arg6];
				if (local78.aClass4_Sub23_1 != local38) {
					local78 = null;
				}
			}
			this.XA(0, new int[0], 0, 0, 0, 0, arg3);
			this.method3121(arg2, arg0, 65535, arg5, local76, local76.aClass4_Sub23_1, true, local78, 0, arg3, null);
			this.j();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lclient!t;")
	public abstract Class116 method3123(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[IIIIZI[III)V")
	private void method3124(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(19) int local19;
		if (arg5 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local19 = -arg8;
				arg8 = arg7;
				arg7 = local19;
			} else if (arg3 == 3) {
				local19 = arg8;
				arg8 = arg7;
				arg7 = local19;
			} else if (arg3 == 2) {
				local19 = arg8;
				arg8 = -arg7 & 0x3FFF;
				arg7 = local19 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg8 = -arg8;
				arg7 = -arg7;
			} else if (arg3 == 2) {
				arg7 = -arg7 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local19 = arg8;
				arg8 = -arg7;
				arg7 = local19;
			} else if (arg3 == 3) {
				local19 = arg8;
				arg8 = arg7;
				arg7 = local19;
			} else if (arg3 == 2) {
				local19 = arg8;
				arg8 = arg7 & 0x3FFF;
				arg7 = -local19 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.XA(arg3, arg0, arg8, arg1, arg7, arg5, arg4);
		} else {
			this.M(arg3, arg0, arg8, arg1, arg7, arg4, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
	public abstract void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
	protected abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
	public abstract int l();
}
