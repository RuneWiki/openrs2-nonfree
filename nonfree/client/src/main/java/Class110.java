import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public abstract class Class110 {

	static {
		new Class83("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	protected Class110() {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!mi;II)V")
	public abstract void method4880(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class3_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()[Lclient!bu;")
	public abstract Class29[] method4881();

	@OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIZIILclient!pt;Lclient!pt;II)V")
	public final void method4883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4_Sub1_Sub17 arg5, @OriginalArg(6) Class4_Sub1_Sub17 arg6, @OriginalArg(7) int arg7) {
		if (arg3 == -1 || !this.w()) {
			return;
		}
		@Pc(16) Class88 local16 = arg5.aClass88Array1[arg3];
		@Pc(19) Class4_Sub32 local19 = local16.aClass4_Sub32_1;
		@Pc(21) Class88 local21 = null;
		if (arg6 != null) {
			local21 = arg6.aClass88Array1[arg4];
			if (local21.aClass4_Sub32_1 != local19) {
				local21 = null;
			}
		}
		this.method4896(local21, null, local19, arg7, arg2, arg0, local16, false, arg1, 65535, null);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIILclient!ta;III)V")
	protected final void method4884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class65 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(21) int local21 = -arg5 / 2;
		@Pc(26) int local26 = -arg2 / 2;
		@Pc(35) int local35 = arg4.a(local21 + arg0, local26 + arg1);
		@Pc(39) int local39 = arg5 / 2;
		@Pc(44) int local44 = -arg2 / 2;
		@Pc(53) int local53 = arg4.a(local39 + arg0, local44 + arg1);
		@Pc(58) int local58 = -arg5 / 2;
		@Pc(62) int local62 = arg2 / 2;
		@Pc(71) int local71 = arg4.a(local58 + arg0, arg1 + local62);
		@Pc(75) int local75 = arg5 / 2;
		@Pc(79) int local79 = arg2 / 2;
		@Pc(89) int local89 = arg4.a(arg0 + local75, local79 + arg1);
		@Pc(100) int local100 = local53 > local35 ? local35 : local53;
		@Pc(107) int local107 = local71 >= local89 ? local89 : local71;
		@Pc(114) int local114 = local53 >= local89 ? local89 : local53;
		@Pc(121) int local121 = local71 > local35 ? local35 : local71;
		@Pc(148) int local148;
		if (arg2 != 0) {
			@Pc(137) int local137 = (int) (Math.atan2((double) (local100 - local107), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local137 != 0) {
				if (arg3 != 0) {
					if (local137 > 8192) {
						local148 = 16384 - arg3;
						if (local148 > local137) {
							local137 = local148;
						}
					} else if (local137 > arg3) {
						local137 = arg3;
					}
				}
				this.Z(local137);
			}
		}
		@Pc(171) int local171 = local35 + local89;
		if (arg5 != 0) {
			@Pc(190) int local190 = (int) (Math.atan2((double) (local121 - local114), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local190 != 0) {
				if (arg6 != 0) {
					if (local190 > 8192) {
						local148 = 16384 - arg6;
						if (local190 < local148) {
							local190 = local148;
						}
					} else if (local190 > arg6) {
						local190 = arg6;
					}
				}
				this.R(local190);
			}
		}
		if (local171 > local53 + local71) {
			local171 = local53 + local71;
		}
		local171 = (local171 >> 1) - arg7;
		if (local171 != 0) {
			this.JA(0, local171, 0);
		}
	}

	@OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
	public abstract void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()[Lclient!pf;")
	public abstract Class179[] method4885();

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()V")
	public abstract void method4886();

	@OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
	public abstract void IA();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lclient!t;")
	public abstract Class110 method4887(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[IIIIZI[III)V")
	private void method4888(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(71) int local71;
		if (arg4 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local71 = -arg8;
				arg8 = arg2;
				arg2 = local71;
			} else if (arg0 == 3) {
				local71 = arg8;
				arg8 = arg2;
				arg2 = local71;
			} else if (arg0 == 2) {
				local71 = arg8;
				arg8 = -arg2 & 0x3FFF;
				arg2 = local71 & 0x3FFF;
			}
		} else if (arg4 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg8 = -arg8;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg4 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local71 = arg8;
				arg8 = -arg2;
				arg2 = local71;
			} else if (arg0 == 3) {
				local71 = arg8;
				arg8 = arg2;
				arg2 = local71;
			} else if (arg0 == 2) {
				local71 = arg8;
				arg8 = arg2 & 0x3FFF;
				arg2 = -local71 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.XA(arg0, arg6, arg8, arg7, arg2, arg4, arg5);
		} else {
			this.M(arg0, arg6, arg8, arg7, arg2, arg5, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!mi;I)V")
	public abstract void method4889(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class3_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
	protected abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
	protected abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	public abstract Class4_Sub1_Sub4 fa(@OriginalArg(0) Class4_Sub1_Sub4 arg0);

	@OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
	public abstract int P();

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()Z")
	public abstract boolean method4890();

	@OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	public abstract void method4891(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
	public abstract int NA();

	@OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
	public abstract int m();

	@OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
	public abstract void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
	public abstract void R(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!pt;)V")
	public final void method4892(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub17 arg1) {
		if (arg0 == -1 || !this.w()) {
			return;
		}
		@Pc(18) Class88 local18 = arg1.aClass88Array1[arg0];
		@Pc(21) Class4_Sub32 local21 = local18.aClass4_Sub32_1;
		for (@Pc(23) int local23 = 0; local23 < local18.anInt2756; local23++) {
			@Pc(30) short local30 = local18.aShortArray77[local23];
			if (local21.aBooleanArray16[local30]) {
				if (local18.aShortArray76[local23] != -1) {
					this.N(0, 0, 0, 0);
				}
				this.N(local21.anIntArray318[local30], local18.aShortArray72[local23], local18.aShortArray75[local23], local18.aShortArray80[local23]);
			}
		}
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
	public abstract void method4893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public abstract void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	public abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
	public abstract void aa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method4894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
	public abstract void UA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
	public abstract void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!gr;[ZLclient!nk;IZIILclient!gr;ZII[I)V")
	private void method4896(@OriginalArg(0) Class88 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) Class4_Sub32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class88 arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10) {
		@Pc(11) int local11;
		if (arg0 == null || arg3 == 0) {
			for (local11 = 0; local11 < arg6.anInt2756; local11++) {
				@Pc(18) short local18 = arg6.aShortArray77[local11];
				if (arg1 == null || arg1[local18] == arg7 || arg2.anIntArray318[local18] == 0) {
					@Pc(43) short local43 = arg6.aShortArray76[local11];
					if (local43 != -1) {
						this.method4888(0, arg10, 0, arg2.anIntArray320[local43] & arg9, arg5, arg4, arg2.anIntArrayArray42[local43], 0, 0);
					}
					this.method4888(arg2.anIntArray318[local18], arg10, arg6.aShortArray80[local11], arg9 & arg2.anIntArray320[local18], arg5, arg4, arg2.anIntArrayArray42[local18], arg6.aShortArray75[local11], arg6.aShortArray72[local11]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(115) int local115 = 0;
		for (@Pc(117) int local117 = 0; local117 < arg2.anInt4981; local117++) {
			@Pc(121) boolean local121 = false;
			if (local11 < arg6.anInt2756 && local117 == arg6.aShortArray77[local11]) {
				local121 = true;
			}
			@Pc(139) boolean local139 = false;
			if (arg0.anInt2756 > local115 && arg0.aShortArray77[local115] == local117) {
				local139 = true;
			}
			if (local121 || local139) {
				if (arg1 == null || arg1[local117] == arg7 || arg2.anIntArray318[local117] == 0) {
					@Pc(181) short local181 = 0;
					@Pc(186) int local186 = arg2.anIntArray318[local117];
					if (local186 == 3 || local186 == 10) {
						local181 = 128;
					}
					@Pc(223) short local223;
					@Pc(203) short local203;
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(208) byte local208;
					if (local121) {
						local203 = arg6.aShortArray75[local11];
						local208 = arg6.aByteArray28[local11];
						local213 = arg6.aShortArray80[local11];
						local218 = arg6.aShortArray76[local11];
						local223 = arg6.aShortArray72[local11];
						local11++;
					} else {
						local208 = 0;
						local223 = local181;
						local213 = local181;
						local218 = -1;
						local203 = local181;
					}
					@Pc(246) short local246;
					@Pc(242) short local242;
					@Pc(248) short local248;
					@Pc(244) short local244;
					@Pc(240) byte local240;
					if (local139) {
						local244 = arg0.aShortArray76[local115];
						local248 = arg0.aShortArray80[local115];
						local242 = arg0.aShortArray75[local115];
						local246 = arg0.aShortArray72[local115];
						local240 = arg0.aByteArray28[local115];
						local115++;
					} else {
						local240 = 0;
						local242 = local181;
						local244 = -1;
						local246 = local181;
						local248 = local181;
					}
					if (local218 != -1) {
						this.method4888(0, arg10, 0, arg2.anIntArray320[local218] & arg9, arg5, arg4, arg2.anIntArrayArray42[local218], 0, 0);
					} else if (local244 != -1) {
						this.method4888(0, arg10, 0, arg9 & arg2.anIntArray320[local244], arg5, arg4, arg2.anIntArrayArray42[local244], 0, 0);
					}
					@Pc(386) int local386;
					@Pc(402) int local402;
					@Pc(412) int local412;
					if ((local208 & 0x2) == 0 && (local240 & 0x1) == 0) {
						@Pc(352) int local352;
						if (local186 == 2) {
							local352 = local246 - local223 & 0x3FFF;
							@Pc(359) int local359 = local242 - local203 & 0x3FFF;
							if (local352 >= 8192) {
								local352 -= 16384;
							}
							@Pc(372) int local372 = local248 - local213 & 0x3FFF;
							if (local359 >= 8192) {
								local359 -= 16384;
							}
							local386 = local223 + local352 * arg3 / arg8 & 0x3FFF;
							if (local372 >= 8192) {
								local372 -= 16384;
							}
							local402 = local203 + arg3 * local359 / arg8 & 0x3FFF;
							local412 = local213 + local372 * arg3 / arg8 & 0x3FFF;
						} else if (local186 == 9) {
							local352 = local246 - local223 & 0x3FFF;
							if (local352 >= 8192) {
								local352 -= 16384;
							}
							local412 = 0;
							local402 = 0;
							local386 = local352 * arg3 / arg8 + local223 & 0x3FFF;
						} else if (local186 == 7) {
							local352 = local246 - local223 & 0x3F;
							if (local352 >= 32) {
								local352 -= 64;
							}
							local402 = local203 + arg3 * (local242 - local203) / arg8;
							local412 = arg3 * (local248 - local213) / arg8 + local213;
							local386 = local352 * arg3 / arg8 + local223 & 0x3F;
						} else {
							local412 = local213 + arg3 * (local248 - local213) / arg8;
							local402 = local203 + (local242 - local203) * arg3 / arg8;
							local386 = local223 + (local246 - local223) * arg3 / arg8;
						}
					} else {
						local402 = local203;
						local386 = local223;
						local412 = local213;
					}
					this.method4888(local186, arg10, local412, arg2.anIntArray320[local117] & arg9, arg5, arg4, arg2.anIntArrayArray42[local117], local402, local386);
				} else {
					if (local139) {
						local115++;
					}
					if (local121) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
	public abstract void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!pt;[IZIIIILclient!pt;II)V")
	public final void method4897(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub17 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class4_Sub1_Sub17 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg4 == -1 || !this.w()) {
			return;
		}
		@Pc(17) Class88 local17 = arg6.aClass88Array1[arg4];
		@Pc(20) Class4_Sub32 local20 = local17.aClass4_Sub32_1;
		@Pc(30) Class88 local30 = null;
		if (arg1 != null) {
			local30 = arg1.aClass88Array1[arg0];
			if (local30.aClass4_Sub32_1 != local20) {
				local30 = null;
			}
		}
		this.method4896(local30, null, local20, arg7, arg3, 0, local17, false, arg5, arg8, arg2);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
	public abstract int D();

	@OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
	protected abstract boolean w();

	@OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
	protected abstract void j();

	@OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
	protected abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!pt;ZIIILclient!pt;Lclient!pt;I[ZLclient!pt;III)V")
	public final void method4899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub17 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class4_Sub1_Sub17 arg7, @OriginalArg(8) Class4_Sub1_Sub17 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean[] arg10, @OriginalArg(11) Class4_Sub1_Sub17 arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (arg0 == -1) {
			return;
		}
		if (arg10 == null || arg6 == -1) {
			this.method4883(0, arg1, arg3, arg0, arg13, arg8, arg11, arg12);
		} else if (this.w()) {
			@Pc(38) Class88 local38 = arg8.aClass88Array1[arg0];
			@Pc(41) Class4_Sub32 local41 = local38.aClass4_Sub32_1;
			@Pc(43) Class88 local43 = null;
			if (arg11 != null) {
				local43 = arg11.aClass88Array1[arg13];
				if (local43.aClass4_Sub32_1 != local41) {
					local43 = null;
				}
			}
			this.method4896(local43, arg10, local41, arg12, arg3, 0, local38, false, arg1, 65535, null);
			@Pc(75) Class88 local75 = arg7.aClass88Array1[arg6];
			@Pc(77) Class88 local77 = null;
			if (arg2 != null) {
				local77 = arg2.aClass88Array1[arg9];
				if (local41 != local77.aClass4_Sub32_1) {
					local77 = null;
				}
			}
			this.XA(0, new int[0], 0, 0, 0, 0, arg3);
			this.method4896(local77, arg10, local75.aClass4_Sub32_1, arg5, arg3, 0, local75, true, arg4, 65535, null);
			this.j();
		}
	}
}
