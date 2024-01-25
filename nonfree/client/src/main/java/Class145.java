import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class145 {

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	protected Class145() {
	}

	@OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public abstract Class1_Sub1_Sub9 EA(@OriginalArg(0) Class1_Sub1_Sub9 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[III[IZIIII)V")
	private void method6667(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(56) int local56;
		if (arg6 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local56 = -arg8;
				arg8 = arg2;
				arg2 = local56;
			} else if (arg7 == 3) {
				local56 = arg8;
				arg8 = arg2;
				arg2 = local56;
			} else if (arg7 == 2) {
				local56 = arg8;
				arg8 = -arg2 & 0x3FFF;
				arg2 = local56 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg8 = -arg8;
				arg2 = -arg2;
			} else if (arg7 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local56 = arg8;
				arg8 = -arg2;
				arg2 = local56;
			} else if (arg7 == 3) {
				local56 = arg8;
				arg8 = arg2;
				arg2 = local56;
			} else if (arg7 == 2) {
				local56 = arg8;
				arg8 = arg2 & 0x3FFF;
				arg2 = -local56 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.ea(arg7, arg3, arg8, arg5, arg2, arg6, arg4);
		} else {
			this.BA(arg7, arg3, arg8, arg5, arg2, arg4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	public abstract void method6668();

	@OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
	public abstract void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII[I[ZZLclient!h;ILclient!h;Lclient!gea;Z)V")
	private void method6669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean[] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class115 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class115 arg8, @OriginalArg(10) Class1_Sub20 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(11) int local11;
		if (arg6 == null || arg0 == 0) {
			for (local11 = 0; local11 < arg8.anInt3074; local11++) {
				@Pc(18) short local18 = arg8.aShortArray55[local11];
				if (arg4 == null || arg4[local18] == arg10 || arg9.anIntArray276[local18] == 0) {
					@Pc(42) short local42 = arg8.aShortArray56[local11];
					if (local42 != -1) {
						this.method6667(arg9.anIntArray277[local42] & arg1, arg3, 0, arg9.anIntArrayArray34[local42], arg5, 0, arg7, 0, 0);
					}
					this.method6667(arg9.anIntArray277[local18] & arg1, arg3, arg8.aShortArray54[local11], arg9.anIntArrayArray34[local18], arg5, arg8.aShortArray57[local11], arg7, arg9.anIntArray276[local18], arg8.aShortArray60[local11]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(111) int local111 = 0;
		for (@Pc(113) int local113 = 0; local113 < arg9.anInt2899; local113++) {
			@Pc(117) boolean local117 = false;
			if (local11 < arg8.anInt3074 && local113 == arg8.aShortArray55[local11]) {
				local117 = true;
			}
			@Pc(131) boolean local131 = false;
			if (local111 < arg6.anInt3074 && local113 == arg6.aShortArray55[local111]) {
				local131 = true;
			}
			if (local117 || local131) {
				if (arg4 == null || arg10 == arg4[local113] || arg9.anIntArray276[local113] == 0) {
					@Pc(184) short local184 = 0;
					@Pc(189) int local189 = arg9.anIntArray276[local113];
					if (local189 == 3 || local189 == 10) {
						local184 = 128;
					}
					@Pc(216) short local216;
					@Pc(221) short local221;
					@Pc(206) short local206;
					@Pc(226) short local226;
					@Pc(211) byte local211;
					if (local117) {
						local206 = arg8.aShortArray54[local11];
						local211 = arg8.aByteArray45[local11];
						local216 = arg8.aShortArray60[local11];
						local221 = arg8.aShortArray57[local11];
						local226 = arg8.aShortArray56[local11];
						local11++;
					} else {
						local206 = local184;
						local221 = local184;
						local211 = 0;
						local216 = local184;
						local226 = -1;
					}
					@Pc(247) short local247;
					@Pc(243) short local243;
					@Pc(251) short local251;
					@Pc(245) short local245;
					@Pc(249) byte local249;
					if (local131) {
						local247 = arg6.aShortArray60[local111];
						local243 = arg6.aShortArray57[local111];
						local249 = arg6.aByteArray45[local111];
						local245 = arg6.aShortArray56[local111];
						local251 = arg6.aShortArray54[local111];
						local111++;
					} else {
						local243 = local184;
						local245 = -1;
						local247 = local184;
						local249 = 0;
						local251 = local184;
					}
					@Pc(295) int local295;
					@Pc(299) int local299;
					@Pc(297) int local297;
					if ((local211 & 0x2) == 0 && (local249 & 0x1) == 0) {
						@Pc(313) int local313;
						if (local189 == 2) {
							local313 = local247 - local216 & 0x3FFF;
							@Pc(432) int local432 = local243 - local221 & 0x3FFF;
							if (local432 >= 8192) {
								local432 -= 16384;
							}
							@Pc(443) int local443 = local251 - local206 & 0x3FFF;
							if (local313 >= 8192) {
								local313 -= 16384;
							}
							local299 = local221 + arg0 * local432 / arg2 & 0x3FFF;
							if (local443 >= 8192) {
								local443 -= 16384;
							}
							local295 = arg0 * local313 / arg2 + local216 & 0x3FFF;
							local297 = local443 * arg0 / arg2 + local206 & 0x3FFF;
						} else if (local189 == 9) {
							local313 = local247 - local216 & 0x3FFF;
							if (local313 >= 8192) {
								local313 -= 16384;
							}
							local295 = local216 + arg0 * local313 / arg2 & 0x3FFF;
							local297 = 0;
							local299 = 0;
						} else if (local189 == 7) {
							local313 = local247 - local216 & 0x3F;
							if (local313 >= 32) {
								local313 -= 64;
							}
							local297 = local206 + arg0 * (local251 - local206) / arg2;
							local299 = arg0 * (local243 - local221) / arg2 + local221;
							local295 = arg0 * local313 / arg2 + local216 & 0x3F;
						} else {
							local295 = local216 + arg0 * (local247 - local216) / arg2;
							local297 = arg0 * (local251 - local206) / arg2 + local206;
							local299 = arg0 * (local243 - local221) / arg2 + local221;
						}
					} else {
						local295 = local216;
						local297 = local206;
						local299 = local221;
					}
					if (local226 != -1) {
						this.method6667(arg1 & arg9.anIntArray277[local226], arg3, 0, arg9.anIntArrayArray34[local226], arg5, 0, arg7, 0, 0);
					} else if (local245 != -1) {
						this.method6667(arg1 & arg9.anIntArray277[local245], arg3, 0, arg9.anIntArrayArray34[local245], arg5, 0, arg7, 0, 0);
					}
					this.method6667(arg9.anIntArray277[local113] & arg1, arg3, local297, arg9.anIntArrayArray34[local113], arg5, local299, arg7, local189, local295);
				} else {
					if (local131) {
						local111++;
					}
					if (local117) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
	protected abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()Z")
	public abstract boolean method6670();

	@OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
	protected abstract boolean sa();

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
	protected abstract void MA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method6671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lclient!r;")
	public abstract Class145 method6672(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
	public abstract void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIZLclient!sa;IIII)V")
	protected final void method6673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class205 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg2 / 2;
		@Pc(31) int local31 = arg3.aa(arg6 + local16, arg7 + local21);
		@Pc(35) int local35 = arg1 / 2;
		@Pc(40) int local40 = -arg2 / 2;
		@Pc(51) int local51 = arg3.aa(arg6 + local35, arg7 - -local40);
		@Pc(56) int local56 = -arg1 / 2;
		@Pc(60) int local60 = arg2 / 2;
		@Pc(69) int local69 = arg3.aa(local56 + arg6, arg7 + local60);
		@Pc(73) int local73 = arg1 / 2;
		@Pc(77) int local77 = arg2 / 2;
		@Pc(101) int local101 = arg3.aa(arg6 + local73, arg7 + local77);
		@Pc(112) int local112 = local31 >= local51 ? local51 : local31;
		@Pc(119) int local119 = local101 <= local69 ? local101 : local69;
		@Pc(126) int local126 = local101 <= local51 ? local101 : local51;
		@Pc(160) int local160;
		if (arg2 != 0) {
			@Pc(145) int local145 = (int) (Math.atan2((double) (local112 - local119), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local145 != 0) {
				if (arg0 != 0) {
					if (local145 > 8192) {
						local160 = 16384 - arg0;
						if (local160 > local145) {
							local145 = local160;
						}
					} else if (arg0 < local145) {
						local145 = arg0;
					}
				}
				this.D(local145);
			}
		}
		@Pc(190) int local190 = local69 > local31 ? local31 : local69;
		@Pc(195) int local195 = local31 + local101;
		if (arg1 != 0) {
			@Pc(210) int local210 = (int) (Math.atan2((double) (local190 - local126), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local210 != 0) {
				if (arg5 != 0) {
					if (local210 > 8192) {
						local160 = 16384 - arg5;
						if (local160 > local210) {
							local210 = local160;
						}
					} else if (local210 > arg5) {
						local210 = arg5;
					}
				}
				this.b(local210);
			}
		}
		if (local51 + local69 < local195) {
			local195 = local51 + local69;
		}
		local195 = (local195 >> 1) - arg4;
		if (local195 != 0) {
			this.ca(0, local195, 0);
		}
	}

	@OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
	public abstract void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	public abstract void method6674(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
	public abstract int e();

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!eca;II)V")
	public abstract void method6676(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class72_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
	public abstract void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()[Lclient!kca;")
	public abstract Class161[] method6677();

	@OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public abstract void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class205 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!hr;IBII[ZIILclient!hr;IIILclient!hr;Lclient!hr;Z)V")
	public final void method6679(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub1_Sub6 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class1_Sub1_Sub6 arg11, @OriginalArg(13) Class1_Sub1_Sub6 arg12, @OriginalArg(14) boolean arg13) {
		if (arg10 == -1) {
			return;
		}
		if (arg4 == null || arg6 == -1) {
			this.method6687(arg0, arg9, arg5, arg7, arg1, 0, arg10, arg13);
		} else if (this.sa()) {
			@Pc(34) Class115 local34 = arg0.aClass115Array1[arg10];
			@Pc(37) Class1_Sub20 local37 = local34.aClass1_Sub20_1;
			@Pc(39) Class115 local39 = null;
			if (arg7 != null) {
				local39 = arg7.aClass115Array1[arg1];
				if (local37 != local39.aClass1_Sub20_1) {
					local39 = null;
				}
			}
			this.method6669(arg5, 65535, arg9, null, arg4, arg13, local39, 0, local34, local37, false);
			@Pc(76) Class115 local76 = arg11.aClass115Array1[arg6];
			@Pc(78) Class115 local78 = null;
			if (arg12 != null) {
				local78 = arg12.aClass115Array1[arg3];
				if (local37 != local78.aClass1_Sub20_1) {
					local78 = null;
				}
			}
			this.ea(0, new int[0], 0, 0, 0, 0, arg13);
			this.method6669(arg2, 65535, arg8, null, arg4, arg13, local78, 0, local76, local76.aClass1_Sub20_1, true);
			this.MA();
		}
	}

	@OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
	public abstract int ga();

	@OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!m;Z)Z")
	public abstract boolean method6683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
	public abstract void X();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()[Lclient!fi;")
	public abstract Class93[] method6684();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!eca;I)V")
	public abstract void method6686(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class72_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!hr;IILclient!hr;IIIIZ)V")
	public final void method6687(@OriginalArg(0) Class1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub6 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		if (arg6 == -1 || !this.sa()) {
			return;
		}
		@Pc(17) Class115 local17 = arg0.aClass115Array1[arg6];
		@Pc(20) Class1_Sub20 local20 = local17.aClass1_Sub20_1;
		@Pc(22) Class115 local22 = null;
		if (arg3 != null) {
			local22 = arg3.aClass115Array1[arg4];
			if (local20 != local22.aClass1_Sub20_1) {
				local22 = null;
			}
		}
		this.method6669(arg2, 65535, arg1, null, null, arg7, local22, arg5, local17, local20, false);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
	public abstract int wa();

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
	public abstract void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!hr;IIZII[IILclient!hr;)V")
	public final void method6688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class1_Sub1_Sub6 arg8) {
		if (arg0 == -1 || !this.sa()) {
			return;
		}
		@Pc(18) Class115 local18 = arg2.aClass115Array1[arg0];
		@Pc(21) Class1_Sub20 local21 = local18.aClass1_Sub20_1;
		@Pc(23) Class115 local23 = null;
		if (arg8 != null) {
			local23 = arg8.aClass115Array1[arg1];
			if (local21 != local23.aClass1_Sub20_1) {
				local23 = null;
			}
		}
		this.method6669(arg3, arg5, arg7, arg6, null, arg4, local23, 0, local18, local21, false);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!hr;)V")
	public final void method6689(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub6 arg1) {
		if (arg0 == -1 || !this.sa()) {
			return;
		}
		@Pc(19) Class115 local19 = arg1.aClass115Array1[arg0];
		@Pc(26) Class1_Sub20 local26 = local19.aClass1_Sub20_1;
		for (@Pc(28) int local28 = 0; local28 < local19.anInt3074; local28++) {
			@Pc(35) short local35 = local19.aShortArray55[local28];
			if (local26.aBooleanArray16[local35]) {
				if (local19.aShortArray56[local28] != -1) {
					this.l(0, 0, 0, 0);
				}
				this.l(local26.anIntArray276[local35], local19.aShortArray60[local28], local19.aShortArray57[local28], local19.aShortArray54[local28]);
			}
		}
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
	public abstract int va();

	@OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
