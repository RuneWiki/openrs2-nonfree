import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class36 {

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	protected Class36() {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!mb;II)V")
	public final void method7344(@OriginalArg(0) Class5_Sub2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.sa()) {
			return;
		}
		@Pc(19) Class218 local19 = arg0.aClass218Array1[arg1];
		@Pc(22) Class5_Sub44 local22 = local19.aClass5_Sub44_1;
		for (@Pc(28) int local28 = 0; local28 < local19.anInt6481; local28++) {
			@Pc(35) short local35 = local19.aShortArray102[local28];
			if (local22.aBooleanArray32[local35]) {
				if (local19.aShortArray105[local28] != -1) {
					this.l(0, 0, 0, 0);
				}
				this.l(local22.anIntArray590[local35], local19.aShortArray107[local28], local19.aShortArray101[local28], local19.aShortArray99[local28]);
			}
		}
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
	public abstract void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
	public abstract void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!paa;II)V")
	public abstract void method7346(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class30_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ob;Z[ILclient!sg;Lclient!ob;BIZIII[Z)V")
	private void method7347(@OriginalArg(0) Class218 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class5_Sub44 arg3, @OriginalArg(4) Class218 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(14) int local14;
		if (arg4 == null || arg5 == 0) {
			for (local14 = 0; local14 < arg0.anInt6481; local14++) {
				@Pc(21) short local21 = arg0.aShortArray102[local14];
				if (arg10 == null || arg1 == arg10[local21] || arg3.anIntArray590[local21] == 0) {
					@Pc(38) short local38 = arg0.aShortArray105[local14];
					if (local38 != -1) {
						this.method7362(arg3.anIntArray589[local38] & arg8, arg6, 0, arg3.anIntArrayArray64[local38], arg2, 0, 0, arg7, 0);
					}
					this.method7362(arg8 & arg3.anIntArray589[local21], arg6, arg0.aShortArray101[local14], arg3.anIntArrayArray64[local21], arg2, arg0.aShortArray99[local14], arg3.anIntArray590[local21], arg7, arg0.aShortArray107[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < arg3.anInt7816; local110++) {
			@Pc(114) boolean local114 = false;
			if (local14 < arg0.anInt6481 && local110 == arg0.aShortArray102[local14]) {
				local114 = true;
			}
			@Pc(136) boolean local136 = false;
			if (arg4.anInt6481 > local108 && local110 == arg4.aShortArray102[local108]) {
				local136 = true;
			}
			if (local114 || local136) {
				if (arg10 == null || arg10[local110] == arg1 || arg3.anIntArray590[local110] == 0) {
					@Pc(185) short local185 = 0;
					@Pc(190) int local190 = arg3.anIntArray590[local110];
					if (local190 == 3 || local190 == 10) {
						local185 = 128;
					}
					@Pc(210) short local210;
					@Pc(204) short local204;
					@Pc(212) short local212;
					@Pc(208) short local208;
					@Pc(206) byte local206;
					if (local114) {
						local206 = arg0.aByteArray88[local14];
						local210 = arg0.aShortArray107[local14];
						local208 = arg0.aShortArray105[local14];
						local204 = arg0.aShortArray101[local14];
						local212 = arg0.aShortArray99[local14];
						local14++;
					} else {
						local204 = local185;
						local206 = 0;
						local208 = -1;
						local210 = local185;
						local212 = local185;
					}
					@Pc(248) short local248;
					@Pc(244) short local244;
					@Pc(246) short local246;
					@Pc(252) short local252;
					@Pc(250) byte local250;
					if (local136) {
						local248 = arg4.aShortArray107[local108];
						local250 = arg4.aByteArray88[local108];
						local244 = arg4.aShortArray101[local108];
						local246 = arg4.aShortArray99[local108];
						local252 = arg4.aShortArray105[local108];
						local108++;
					} else {
						local244 = local185;
						local246 = local185;
						local248 = local185;
						local250 = 0;
						local252 = -1;
					}
					if (local208 != -1) {
						this.method7362(arg3.anIntArray589[local208] & arg8, arg6, 0, arg3.anIntArrayArray64[local208], arg2, 0, 0, arg7, 0);
					} else if (local252 != -1) {
						this.method7362(arg8 & arg3.anIntArray589[local252], arg6, 0, arg3.anIntArrayArray64[local252], arg2, 0, 0, arg7, 0);
					}
					@Pc(377) int local377;
					@Pc(367) int local367;
					@Pc(366) int local366;
					if ((local206 & 0x2) == 0 && (local250 & 0x1) == 0) {
						@Pc(359) int local359;
						if (local190 == 2) {
							local359 = local248 - local210 & 0x3FFF;
							@Pc(481) int local481 = local244 - local204 & 0x3FFF;
							if (local481 >= 8192) {
								local481 -= 16384;
							}
							if (local359 >= 8192) {
								local359 -= 16384;
							}
							@Pc(498) int local498 = local246 - local212 & 0x3FFF;
							local367 = local481 * arg5 / arg9 + local204 & 0x3FFF;
							if (local498 >= 8192) {
								local498 -= 16384;
							}
							local377 = local359 * arg5 / arg9 + local210 & 0x3FFF;
							local366 = local212 + arg5 * local498 / arg9 & 0x3FFF;
						} else if (local190 == 9) {
							local359 = local248 - local210 & 0x3FFF;
							if (local359 >= 8192) {
								local359 -= 16384;
							}
							local366 = 0;
							local367 = 0;
							local377 = arg5 * local359 / arg9 + local210 & 0x3FFF;
						} else if (local190 == 7) {
							local359 = local248 - local210 & 0x3F;
							if (local359 >= 32) {
								local359 -= 64;
							}
							local377 = arg5 * local359 / arg9 + local210 & 0x3F;
							local367 = local204 + (local244 - local204) * arg5 / arg9;
							local366 = local212 + (local246 - local212) * arg5 / arg9;
						} else {
							local367 = local204 + (local244 - local204) * arg5 / arg9;
							local366 = local212 + (local246 - local212) * arg5 / arg9;
							local377 = arg5 * (local248 - local210) / arg9 + local210;
						}
					} else {
						local366 = local212;
						local377 = local210;
						local367 = local204;
					}
					this.method7362(arg3.anIntArray589[local110] & arg8, arg6, local367, arg3.anIntArrayArray64[local110], arg2, local366, local190, arg7, local377);
				} else {
					if (local136) {
						local108++;
					}
					if (local114) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!mb;IILclient!mb;ZIB)V")
	public final void method7348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub2_Sub16 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		if (arg3 == -1 || !this.sa()) {
			return;
		}
		@Pc(17) Class218 local17 = arg5.aClass218Array1[arg3];
		@Pc(20) Class5_Sub44 local20 = local17.aClass5_Sub44_1;
		@Pc(22) Class218 local22 = null;
		if (arg2 != null) {
			local22 = arg2.aClass218Array1[arg1];
			if (local22.aClass5_Sub44_1 != local20) {
				local22 = null;
			}
		}
		this.method7347(local17, false, null, local20, local22, arg4, arg6, arg0, 65535, arg7, null);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	public abstract void method7349(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()[Lclient!on;")
	public abstract Class223[] method7350();

	@OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
	public abstract void X();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!mb;IIILclient!mb;B[ZIZLclient!mb;ILclient!mb;II)V")
	public final void method7351(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub2_Sub16 arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class5_Sub2_Sub16 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class5_Sub2_Sub16 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg7 == -1) {
			return;
		}
		if (arg6 == null || arg13 == -1) {
			this.method7348(0, arg10, arg5, arg7, arg3, arg1, arg8, arg0);
		} else if (this.sa()) {
			@Pc(34) Class218 local34 = arg1.aClass218Array1[arg7];
			@Pc(37) Class5_Sub44 local37 = local34.aClass5_Sub44_1;
			@Pc(39) Class218 local39 = null;
			if (arg5 != null) {
				local39 = arg5.aClass218Array1[arg10];
				if (local37 != local39.aClass5_Sub44_1) {
					local39 = null;
				}
			}
			this.method7347(local34, false, null, local37, local39, arg3, arg8, 0, 65535, arg0, arg6);
			@Pc(71) Class218 local71 = arg11.aClass218Array1[arg13];
			@Pc(77) Class218 local77 = null;
			if (arg9 != null) {
				local77 = arg9.aClass218Array1[arg12];
				if (local37 != local77.aClass5_Sub44_1) {
					local77 = null;
				}
			}
			this.ea(0, new int[0], 0, 0, 0, 0, arg8);
			this.method7347(local71, true, null, local71.aClass5_Sub44_1, local77, arg4, arg8, 0, 65535, arg2, arg6);
			this.MA();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method7352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()Z")
	public abstract boolean method7353();

	@OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
	public abstract int va();

	@OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public abstract void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) Class131 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!mb;IILclient!mb;ZIIIII[I)V")
	public final void method7355(@OriginalArg(0) Class5_Sub2_Sub16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub2_Sub16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8) {
		if (arg4 == -1 || !this.sa()) {
			return;
		}
		@Pc(21) Class218 local21 = arg0.aClass218Array1[arg4];
		@Pc(24) Class5_Sub44 local24 = local21.aClass5_Sub44_1;
		@Pc(26) Class218 local26 = null;
		if (arg2 != null) {
			local26 = arg2.aClass218Array1[arg5];
			if (local26.aClass5_Sub44_1 != local24) {
				local26 = null;
			}
		}
		this.method7347(local21, false, arg8, local24, local26, arg1, arg3, 0, arg6, arg7, null);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public abstract Class5_Sub2_Sub13 EA(@OriginalArg(0) Class5_Sub2_Sub13 arg0);

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lclient!r;")
	public abstract Class36 method7356(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
	public abstract void method7357();

	@OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
	protected abstract boolean sa();

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
	protected abstract void MA();

	@OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIILclient!sa;III)V")
	protected final void method7358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class131 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg7 / 2;
		@Pc(21) int local21 = -arg3 / 2;
		@Pc(32) int local32 = arg4.aa(arg2 + local16, arg1 - -local21);
		@Pc(36) int local36 = arg7 / 2;
		@Pc(41) int local41 = -arg3 / 2;
		@Pc(51) int local51 = arg4.aa(local36 + arg2, arg1 - -local41);
		@Pc(56) int local56 = -arg7 / 2;
		@Pc(60) int local60 = arg3 / 2;
		@Pc(69) int local69 = arg4.aa(local56 + arg2, arg1 + local60);
		@Pc(73) int local73 = arg7 / 2;
		@Pc(77) int local77 = arg3 / 2;
		@Pc(86) int local86 = arg4.aa(local73 + arg2, arg1 + local77);
		@Pc(93) int local93 = local51 > local32 ? local32 : local51;
		@Pc(104) int local104 = local69 >= local86 ? local86 : local69;
		@Pc(111) int local111 = local86 <= local51 ? local86 : local51;
		@Pc(118) int local118 = local32 >= local69 ? local69 : local32;
		@Pc(153) int local153;
		if (arg3 != 0) {
			@Pc(136) int local136 = (int) (Math.atan2((double) (local93 - local104), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local136 != 0) {
				if (arg5 != 0) {
					if (local136 > 8192) {
						local153 = 16384 - arg5;
						if (local136 < local153) {
							local136 = local153;
						}
					} else if (arg5 < local136) {
						local136 = arg5;
					}
				}
				this.D(local136);
			}
		}
		if (arg7 != 0) {
			@Pc(191) int local191 = (int) (Math.atan2((double) (local118 - local111), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local191 != 0) {
				if (arg0 != 0) {
					if (local191 > 8192) {
						local153 = 16384 - arg0;
						if (local153 > local191) {
							local191 = local153;
						}
					} else if (local191 > arg0) {
						local191 = arg0;
					}
				}
				this.b(local191);
			}
		}
		@Pc(233) int local233 = local86 + local32;
		if (local69 + local51 < local233) {
			local233 = local69 + local51;
		}
		local233 = (local233 >> 1) - arg6;
		if (local233 != 0) {
			this.ca(0, local233, 0);
		}
	}

	@OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
	public abstract void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
	public abstract int e();

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
	protected abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!m;Z)Z")
	public abstract boolean method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
	public abstract void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!paa;I)V")
	public abstract void method7360(@OriginalArg(0) Class78 arg0, @OriginalArg(1) Class30_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
	public abstract void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()[Lclient!tf;")
	public abstract Class280[] method7361();

	@OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
	public abstract int wa();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZII[I[IIIII)V")
	private void method7362(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(16) int local16;
		if (arg7 == 1) {
			if (arg6 == 0 || arg6 == 1) {
				local16 = -arg8;
				arg8 = arg5;
				arg5 = local16;
			} else if (arg6 == 3) {
				local16 = arg8;
				arg8 = arg5;
				arg5 = local16;
			} else if (arg6 == 2) {
				local16 = arg8;
				arg8 = -arg5 & 0x3FFF;
				arg5 = local16 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg6 == 0 || arg6 == 1) {
				arg8 = -arg8;
				arg5 = -arg5;
			} else if (arg6 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg6 == 0 || arg6 == 1) {
				local16 = arg8;
				arg8 = -arg5;
				arg5 = local16;
			} else if (arg6 == 3) {
				local16 = arg8;
				arg8 = arg5;
				arg5 = local16;
			} else if (arg6 == 2) {
				local16 = arg8;
				arg8 = arg5 & 0x3FFF;
				arg5 = -local16 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.ea(arg6, arg3, arg8, arg2, arg5, arg7, arg1);
		} else {
			this.BA(arg6, arg3, arg8, arg2, arg5, arg1, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
	public abstract int ga();
}
