import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class19 {

	static {
		new Class114("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	protected Class19() {
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()[Lclient!ia;")
	public abstract Class129[] method7246();

	@OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
	public abstract void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!gm;Lclient!gm;ILclient!gm;ZIIII[ZIILclient!gm;II)V")
	public final void method7247(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) Class1_Sub1_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub8 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class1_Sub1_Sub8 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg8 == null || arg5 == -1) {
			this.method7250(arg1, arg0, arg7, arg9, 0, arg2, arg12, arg4);
		} else if (this.sa()) {
			@Pc(42) Class285 local42 = arg1.aClass285Array1[arg2];
			@Pc(45) Class1_Sub29 local45 = local42.aClass1_Sub29_1;
			@Pc(47) Class285 local47 = null;
			if (arg0 != null) {
				local47 = arg0.aClass285Array1[arg9];
				if (local45 != local47.aClass1_Sub29_1) {
					local47 = null;
				}
			}
			this.method7262(arg7, local45, false, 65535, local47, null, arg12, arg4, arg8, 0, local42);
			@Pc(79) Class285 local79 = arg3.aClass285Array1[arg5];
			@Pc(81) Class285 local81 = null;
			if (arg11 != null) {
				local81 = arg11.aClass285Array1[arg13];
				if (local81.aClass1_Sub29_1 != local45) {
					local81 = null;
				}
			}
			this.ea(0, new int[0], 0, 0, 0, 0, arg4);
			this.method7262(arg10, local79.aClass1_Sub29_1, true, 65535, local81, null, arg6, arg4, arg8, 0, local79);
			this.MA();
		}
	}

	@OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
	public abstract int va();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([IBII[IIZIII)V")
	private void method7248(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(23) int local23;
		if (arg2 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local23 = -arg4;
				arg4 = arg8;
				arg8 = local23;
			} else if (arg7 == 3) {
				local23 = arg4;
				arg4 = arg8;
				arg8 = local23;
			} else if (arg7 == 2) {
				local23 = arg4;
				arg4 = -arg8 & 0x3FFF;
				arg8 = local23 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg8 = -arg8;
				arg4 = -arg4;
			} else if (arg7 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local23 = arg4;
				arg4 = -arg8;
				arg8 = local23;
			} else if (arg7 == 3) {
				local23 = arg4;
				arg4 = arg8;
				arg8 = local23;
			} else if (arg7 == 2) {
				local23 = arg4;
				arg4 = arg8 & 0x3FFF;
				arg8 = -local23 & 0x3FFF;
			}
		}
		if (arg6 == 65535) {
			this.ea(arg7, arg3, arg4, arg1, arg8, arg2, arg5);
		} else {
			this.BA(arg7, arg3, arg4, arg1, arg8, arg5, arg6, arg0);
		}
	}

	@OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
	protected abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!gm;Lclient!gm;IIIIIIZ)V")
	public final void method7250(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) Class1_Sub1_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		if (arg5 == -1 || !this.sa()) {
			return;
		}
		@Pc(22) Class285 local22 = arg0.aClass285Array1[arg5];
		@Pc(25) Class1_Sub29 local25 = local22.aClass1_Sub29_1;
		@Pc(27) Class285 local27 = null;
		if (arg1 != null) {
			local27 = arg1.aClass285Array1[arg3];
			if (local25 != local27.aClass1_Sub29_1) {
				local27 = null;
			}
		}
		this.method7262(arg2, local25, false, 65535, local27, null, arg6, arg7, null, arg4, local22);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()[Lclient!lh;")
	public abstract Class178[] method7251();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method7252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!pr;II)V")
	public abstract void method7253(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!gm;I[IIILclient!gm;IZZI)V")
	public final void method7254(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub1_Sub8 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(10) int arg8) {
		if (arg8 == -1 || !this.sa()) {
			return;
		}
		@Pc(17) Class285 local17 = arg1.aClass285Array1[arg8];
		@Pc(20) Class1_Sub29 local20 = local17.aClass1_Sub29_1;
		@Pc(22) Class285 local22 = null;
		if (arg5 != null) {
			local22 = arg5.aClass285Array1[arg2];
			if (local22.aClass1_Sub29_1 != local20) {
				local22 = null;
			}
		}
		this.method7262(arg6, local20, false, arg0, local22, arg3, arg4, arg7, null, 0, local17);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
	protected abstract void MA();

	@OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public abstract void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
	protected abstract boolean sa();

	@OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
	public abstract void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public abstract Class1_Sub1_Sub4 EA(@OriginalArg(0) Class1_Sub1_Sub4 arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!gm;I)V")
	public final void method7255(@OriginalArg(1) Class1_Sub1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.sa()) {
			return;
		}
		@Pc(16) Class285 local16 = arg0.aClass285Array1[arg1];
		@Pc(19) Class1_Sub29 local19 = local16.aClass1_Sub29_1;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt8222; local21++) {
			@Pc(32) short local32 = local16.aShortArray150[local21];
			if (local19.aBooleanArray20[local32]) {
				if (local16.aShortArray144[local21] != -1) {
					this.l(0, 0, 0, 0);
				}
				this.l(local19.anIntArray366[local32], local16.aShortArray145[local21], local16.aShortArray142[local21], local16.aShortArray146[local21]);
			}
		}
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
	public abstract boolean method7256();

	@OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
	public abstract int ga();

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!m;Z)Z")
	public abstract boolean method7257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
	public abstract void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!pr;I)V")
	public abstract void method7258(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class2_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
	public abstract int wa();

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
	public abstract void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
	public abstract int e();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
	public abstract void method7259();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lclient!r;")
	public abstract Class19 method7260(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
	public abstract void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!kw;IZILclient!uca;[IIZ[ZILclient!uca;)V")
	private void method7262(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub29 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class285 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class285 arg10) {
		@Pc(9) int local9;
		if (arg4 == null || arg6 == 0) {
			for (local9 = 0; local9 < arg10.anInt8222; local9++) {
				@Pc(15) short local15 = arg10.aShortArray150[local9];
				if (arg8 == null || arg2 == arg8[local15] || arg1.anIntArray366[local15] == 0) {
					@Pc(39) short local39 = arg10.aShortArray144[local9];
					if (local39 != -1) {
						this.method7248(arg5, 0, arg9, arg1.anIntArrayArray35[local39], 0, arg7, arg3 & arg1.anIntArray365[local39], 0, 0);
					}
					this.method7248(arg5, arg10.aShortArray142[local9], arg9, arg1.anIntArrayArray35[local15], arg10.aShortArray145[local9], arg7, arg1.anIntArray365[local15] & arg3, arg1.anIntArray366[local15], arg10.aShortArray146[local9]);
				}
			}
			return;
		}
		local9 = 0;
		@Pc(104) int local104 = 0;
		for (@Pc(106) int local106 = 0; local106 < arg1.anInt5145; local106++) {
			@Pc(114) boolean local114 = false;
			if (arg10.anInt8222 > local9 && arg10.aShortArray150[local9] == local106) {
				local114 = true;
			}
			@Pc(136) boolean local136 = false;
			if (arg4.anInt8222 > local104 && arg4.aShortArray150[local104] == local106) {
				local136 = true;
			}
			if (local114 || local136) {
				if (arg8 == null || arg8[local106] == arg2 || arg1.anIntArray366[local106] == 0) {
					@Pc(188) short local188 = 0;
					@Pc(193) int local193 = arg1.anIntArray366[local106];
					if (local193 == 3 || local193 == 10) {
						local188 = 128;
					}
					@Pc(220) short local220;
					@Pc(225) short local225;
					@Pc(230) short local230;
					@Pc(215) short local215;
					@Pc(210) byte local210;
					if (local114) {
						local210 = arg10.aByteArray101[local9];
						local215 = arg10.aShortArray144[local9];
						local220 = arg10.aShortArray145[local9];
						local225 = arg10.aShortArray142[local9];
						local230 = arg10.aShortArray146[local9];
						local9++;
					} else {
						local225 = local188;
						local210 = 0;
						local220 = local188;
						local215 = -1;
						local230 = local188;
					}
					@Pc(264) short local264;
					@Pc(269) short local269;
					@Pc(254) short local254;
					@Pc(249) short local249;
					@Pc(259) byte local259;
					if (local136) {
						local249 = arg4.aShortArray144[local104];
						local254 = arg4.aShortArray146[local104];
						local259 = arg4.aByteArray101[local104];
						local264 = arg4.aShortArray145[local104];
						local269 = arg4.aShortArray142[local104];
						local104++;
					} else {
						local264 = local188;
						local249 = -1;
						local259 = 0;
						local269 = local188;
						local254 = local188;
					}
					if (local215 != -1) {
						this.method7248(arg5, 0, arg9, arg1.anIntArrayArray35[local215], 0, arg7, arg1.anIntArray365[local215] & arg3, 0, 0);
					} else if (local249 != -1) {
						this.method7248(arg5, 0, arg9, arg1.anIntArrayArray35[local249], 0, arg7, arg1.anIntArray365[local249] & arg3, 0, 0);
					}
					@Pc(375) int local375;
					@Pc(365) int local365;
					@Pc(364) int local364;
					if ((local210 & 0x2) == 0 && (local259 & 0x1) == 0) {
						@Pc(357) int local357;
						if (local193 == 2) {
							local357 = local264 - local220 & 0x3FFF;
							@Pc(470) int local470 = local269 - local225 & 0x3FFF;
							if (local357 >= 8192) {
								local357 -= 16384;
							}
							@Pc(483) int local483 = local254 - local230 & 0x3FFF;
							if (local470 >= 8192) {
								local470 -= 16384;
							}
							local365 = local470 * arg6 / arg0 + local225 & 0x3FFF;
							if (local483 >= 8192) {
								local483 -= 16384;
							}
							local375 = local357 * arg6 / arg0 + local220 & 0x3FFF;
							local364 = arg6 * local483 / arg0 + local230 & 0x3FFF;
						} else if (local193 == 9) {
							local357 = local264 - local220 & 0x3FFF;
							if (local357 >= 8192) {
								local357 -= 16384;
							}
							local364 = 0;
							local365 = 0;
							local375 = local220 + local357 * arg6 / arg0 & 0x3FFF;
						} else if (local193 == 7) {
							local357 = local264 - local220 & 0x3F;
							if (local357 >= 32) {
								local357 -= 64;
							}
							local365 = local225 + arg6 * (local269 - local225) / arg0;
							local364 = (local254 - local230) * arg6 / arg0 + local230;
							local375 = local220 + arg6 * local357 / arg0 & 0x3F;
						} else {
							local375 = local220 + (local264 - local220) * arg6 / arg0;
							local365 = arg6 * (local269 - local225) / arg0 + local225;
							local364 = arg6 * (local254 - local230) / arg0 + local230;
						}
					} else {
						local365 = local225;
						local375 = local220;
						local364 = local230;
					}
					this.method7248(arg5, local365, arg9, arg1.anIntArrayArray35[local106], local375, arg7, arg3 & arg1.anIntArray365[local106], local193, local364);
				} else {
					if (local136) {
						local104++;
					}
					if (local114) {
						local9++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	public abstract void method7263(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
	public abstract void X();

	@OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBIIIILclient!sa;I)V")
	protected final void method7264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class10 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg0 / 2;
		@Pc(31) int local31 = arg6.aa(arg2 + local16, local21 + arg7);
		@Pc(35) int local35 = arg1 / 2;
		@Pc(40) int local40 = -arg0 / 2;
		@Pc(50) int local50 = arg6.aa(arg2 + local35, arg7 - -local40);
		@Pc(55) int local55 = -arg1 / 2;
		@Pc(59) int local59 = arg0 / 2;
		@Pc(68) int local68 = arg6.aa(local55 + arg2, local59 + arg7);
		@Pc(72) int local72 = arg1 / 2;
		@Pc(76) int local76 = arg0 / 2;
		@Pc(85) int local85 = arg6.aa(arg2 + local72, arg7 + local76);
		@Pc(96) int local96 = local50 <= local31 ? local50 : local31;
		@Pc(103) int local103 = local85 > local68 ? local68 : local85;
		@Pc(114) int local114 = local85 <= local50 ? local85 : local50;
		@Pc(156) int local156;
		if (arg0 != 0) {
			@Pc(133) int local133 = (int) (Math.atan2((double) (local96 - local103), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local133 != 0) {
				if (arg3 != 0) {
					if (local133 > 8192) {
						local156 = 16384 - arg3;
						if (local156 > local133) {
							local133 = local156;
						}
					} else if (local133 > arg3) {
						local133 = arg3;
					}
				}
				this.D(local133);
			}
		}
		@Pc(175) int local175 = local31 < local68 ? local31 : local68;
		if (arg1 != 0) {
			@Pc(194) int local194 = (int) (Math.atan2((double) (local175 - local114), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local194 != 0) {
				if (arg4 != 0) {
					if (local194 > 8192) {
						local156 = 16384 - arg4;
						if (local156 > local194) {
							local194 = local156;
						}
					} else if (local194 > arg4) {
						local194 = arg4;
					}
				}
				this.b(local194);
			}
		}
		@Pc(231) int local231 = local85 + local31;
		if (local68 + local50 < local231) {
			local231 = local50 + local68;
		}
		local231 = (local231 >> 1) - arg5;
		if (local231 != 0) {
			this.ca(0, local231, 0);
		}
	}
}
