import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class24 {

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
	protected boolean aBoolean539 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class24() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ql;Lclient!eda;II)V")
	public abstract void method6845(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!tca;IZ[IBLclient!ps;Lclient!ps;IZI[Z)V")
	private void method6847(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) Class261 arg5, @OriginalArg(7) Class261 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(14) int local14;
		if (arg5 == null || arg7 == 0) {
			for (local14 = 0; local14 < arg6.anInt7981; local14++) {
				@Pc(21) short local21 = arg6.aShortArray99[local14];
				if (arg10 == null || arg10[local21] == arg3 || arg1.anIntArray570[local21] == 0) {
					@Pc(42) short local42 = arg6.aShortArray100[local14];
					if (local42 != -1) {
						this.method6863(0, 0, arg0, 0, arg1.anIntArrayArray51[local42], arg8, arg4, 0, arg1.anIntArray569[local42] & arg2);
					}
					this.method6863(arg6.aShortArray105[local14], arg1.anIntArray570[local21], arg0, arg6.aShortArray104[local14], arg1.anIntArrayArray51[local21], arg8, arg4, arg6.aShortArray106[local14], arg1.anIntArray569[local21] & arg2);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(113) int local113 = 0;
		for (@Pc(115) int local115 = 0; local115 < arg1.anInt9296; local115++) {
			@Pc(119) boolean local119 = false;
			if (local14 < arg6.anInt7981 && local115 == arg6.aShortArray99[local14]) {
				local119 = true;
			}
			@Pc(141) boolean local141 = false;
			if (local113 < arg5.anInt7981 && arg5.aShortArray99[local113] == local115) {
				local141 = true;
			}
			if (local119 || local141) {
				if (arg10 == null || arg3 == arg10[local115] || arg1.anIntArray570[local115] == 0) {
					@Pc(187) short local187 = 0;
					@Pc(192) int local192 = arg1.anIntArray570[local115];
					if (local192 == 3 || local192 == 10) {
						local187 = 128;
					}
					@Pc(208) short local208;
					@Pc(204) short local204;
					@Pc(212) short local212;
					@Pc(210) short local210;
					@Pc(206) byte local206;
					if (local119) {
						local206 = arg6.aByteArray91[local14];
						local208 = arg6.aShortArray106[local14];
						local204 = arg6.aShortArray105[local14];
						local210 = arg6.aShortArray100[local14];
						local212 = arg6.aShortArray104[local14];
						local14++;
					} else {
						local204 = local187;
						local206 = 0;
						local208 = local187;
						local210 = -1;
						local212 = local187;
					}
					@Pc(252) short local252;
					@Pc(247) short local247;
					@Pc(262) short local262;
					@Pc(267) short local267;
					@Pc(257) byte local257;
					if (local141) {
						local247 = arg5.aShortArray105[local113];
						local252 = arg5.aShortArray106[local113];
						local257 = arg5.aByteArray91[local113];
						local262 = arg5.aShortArray104[local113];
						local267 = arg5.aShortArray100[local113];
						local113++;
					} else {
						local252 = local187;
						local247 = local187;
						local257 = 0;
						local267 = -1;
						local262 = local187;
					}
					if (local210 != -1) {
						this.method6863(0, 0, arg0, 0, arg1.anIntArrayArray51[local210], arg8, arg4, 0, arg1.anIntArray569[local210] & arg2);
					} else if (local267 != -1) {
						this.method6863(0, 0, arg0, 0, arg1.anIntArrayArray51[local267], arg8, arg4, 0, arg2 & arg1.anIntArray569[local267]);
					}
					@Pc(341) int local341;
					@Pc(345) int local345;
					@Pc(343) int local343;
					if ((local206 & 0x2) == 0 && (local257 & 0x1) == 0) {
						@Pc(359) int local359;
						if (local192 == 2) {
							local359 = local252 - local208 & 0x3FFF;
							@Pc(366) int local366 = local247 - local204 & 0x3FFF;
							@Pc(373) int local373 = local262 - local212 & 0x3FFF;
							if (local366 >= 8192) {
								local366 -= 16384;
							}
							if (local359 >= 8192) {
								local359 -= 16384;
							}
							if (local373 >= 8192) {
								local373 -= 16384;
							}
							local345 = local204 + arg7 * local366 / arg9 & 0x3FFF;
							local341 = local208 + local359 * arg7 / arg9 & 0x3FFF;
							local343 = arg7 * local373 / arg9 + local212 & 0x3FFF;
						} else if (local192 == 9) {
							local359 = local252 - local208 & 0x3FFF;
							if (local359 >= 8192) {
								local359 -= 16384;
							}
							local343 = 0;
							local345 = 0;
							local341 = arg7 * local359 / arg9 + local208 & 0x3FFF;
						} else if (local192 == 7) {
							local359 = local252 - local208 & 0x3F;
							if (local359 >= 32) {
								local359 -= 64;
							}
							local343 = local212 + arg7 * (local262 - local212) / arg9;
							local341 = arg7 * local359 / arg9 + local208 & 0x3F;
							local345 = local204 + arg7 * (local247 - local204) / arg9;
						} else {
							local341 = local208 + arg7 * (local252 - local208) / arg9;
							local345 = arg7 * (local247 - local204) / arg9 + local204;
							local343 = local212 + (local262 - local212) * arg7 / arg9;
						}
					} else {
						local341 = local208;
						local343 = local212;
						local345 = local204;
					}
					this.method6863(local345, local192, arg0, local343, arg1.anIntArrayArray51[local115], arg8, arg4, local341, arg2 & arg1.anIntArray569[local115]);
				} else {
					if (local119) {
						local14++;
					}
					if (local141) {
						local113++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ql;IZ)V")
	public abstract void method6848(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method6849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class6_Sub2_Sub16 ba(@OriginalArg(0) Class6_Sub2_Sub16 arg0);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class24 method6850(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILclient!s;II)V")
	protected final void method6851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class199 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg0 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(31) int local31 = arg5.method8531(local21 + arg7, local16 + arg6);
		@Pc(35) int local35 = arg0 / 2;
		@Pc(40) int local40 = -arg1 / 2;
		@Pc(51) int local51 = arg5.method8531(arg7 + local40, local35 + arg6);
		@Pc(56) int local56 = -arg0 / 2;
		@Pc(60) int local60 = arg1 / 2;
		@Pc(71) int local71 = arg5.method8531(arg7 + local60, local56 + arg6);
		@Pc(75) int local75 = arg0 / 2;
		@Pc(79) int local79 = arg1 / 2;
		@Pc(89) int local89 = arg5.method8531(arg7 + local79, arg6 + local75);
		@Pc(100) int local100 = local31 < local51 ? local31 : local51;
		@Pc(111) int local111 = local71 < local89 ? local71 : local89;
		@Pc(130) int local130 = local51 >= local89 ? local89 : local51;
		@Pc(137) int local137 = local31 >= local71 ? local71 : local31;
		@Pc(179) int local179;
		if (arg1 != 0) {
			@Pc(152) int local152 = (int) (Math.atan2((double) (local100 - local111), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local152 != 0) {
				if (arg3 != 0) {
					if (local152 > 8192) {
						local179 = 16384 - arg3;
						if (local152 < local179) {
							local152 = local179;
						}
					} else if (local152 > arg3) {
						local152 = arg3;
					}
				}
				this.FA(local152);
			}
		}
		@Pc(195) int local195 = local31 + local89;
		if (arg0 != 0) {
			@Pc(211) int local211 = (int) (Math.atan2((double) (local137 - local130), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local211 != 0) {
				if (arg2 != 0) {
					if (local211 > 8192) {
						local179 = 16384 - arg2;
						if (local211 < local179) {
							local211 = local179;
						}
					} else if (local211 > arg2) {
						local211 = arg2;
					}
				}
				this.VA(local211);
			}
		}
		if (local195 > local51 + local71) {
			local195 = local71 + local51;
		}
		local195 = (local195 >> 1) - arg4;
		if (local195 != 0) {
			this.H(0, local195, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZLclient!ae;[IIIIILclient!ae;I)V")
	public final void method6852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class6_Sub2_Sub1 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6_Sub2_Sub1 arg8) {
		if (arg0 == -1) {
			return;
		}
		this.method6870();
		if (!this.NA()) {
			this.method6856();
			return;
		}
		@Pc(25) Class261 local25 = arg3.aClass261Array1[arg0];
		@Pc(28) Class6_Sub44 local28 = local25.aClass6_Sub44_1;
		@Pc(30) Class261 local30 = null;
		if (arg8 != null) {
			local30 = arg8.aClass261Array1[arg1];
			if (local28 != local30.aClass6_Sub44_1) {
				local30 = null;
			}
		}
		this.method6847(0, local28, arg7, false, arg4, local30, local25, arg6, arg2, arg5, (boolean[]) null);
		this.wa();
		this.method6856();
	}

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!wr;")
	public abstract Class382[] method6853();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method6854(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!ql;ZI)Z")
	public abstract boolean method6855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	protected abstract void method6856();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ae;IIILclient!ae;ZII)V")
	public final void method6857(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub2_Sub1 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1) {
			return;
		}
		this.method6870();
		if (!this.NA()) {
			this.method6856();
			return;
		}
		@Pc(22) Class261 local22 = arg4.aClass261Array1[arg2];
		@Pc(25) Class6_Sub44 local25 = local22.aClass6_Sub44_1;
		@Pc(27) Class261 local27 = null;
		if (arg1 != null) {
			local27 = arg1.aClass261Array1[arg0];
			if (local25 != local27.aClass6_Sub44_1) {
				local27 = null;
			}
		}
		this.method6847(arg7, local25, 65535, false, (int[]) null, local27, local22, arg6, arg5, arg3, (boolean[]) null);
		this.wa();
		this.method6856();
	}

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public abstract void method6859();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(3) Class199 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILclient!ae;)V")
	public final void method6860(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub2_Sub1 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method6870();
		if (!this.NA()) {
			this.method6856();
			return;
		}
		@Pc(30) Class261 local30 = arg1.aClass261Array1[arg0];
		@Pc(33) Class6_Sub44 local33 = local30.aClass6_Sub44_1;
		for (@Pc(35) int local35 = 0; local35 < local30.anInt7981; local35++) {
			@Pc(42) short local42 = local30.aShortArray99[local35];
			if (local33.aBooleanArray51[local42]) {
				if (local30.aShortArray100[local35] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local33.anIntArray570[local42], local30.aShortArray106[local35], local30.aShortArray105[local35], local30.aShortArray104[local35]);
			}
		}
		this.wa();
		this.method6856();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ql;)V")
	public abstract void method6861(@OriginalArg(0) Class154 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ql;Lclient!eda;I)V")
	public abstract void method6862(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZII[IZ[III)V")
	private void method6863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(30) int local30;
		if (arg2 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local30 = -arg7;
				arg7 = arg3;
				arg3 = local30;
			} else if (arg1 == 3) {
				local30 = arg7;
				arg7 = arg3;
				arg3 = local30;
			} else if (arg1 == 2) {
				local30 = arg7;
				arg7 = -arg3 & 0x3FFF;
				arg3 = local30 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg3 = -arg3;
				arg7 = -arg7;
			} else if (arg1 == 2) {
				arg7 = -arg7 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local30 = arg7;
				arg7 = -arg3;
				arg3 = local30;
			} else if (arg1 == 3) {
				local30 = arg7;
				arg7 = arg3;
				arg3 = local30;
			} else if (arg1 == 2) {
				local30 = arg7;
				arg7 = arg3 & 0x3FFF;
				arg3 = -local30 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.method6858(arg1, arg4, arg7, arg0, arg3, arg2, arg5);
		} else {
			this.I(arg1, arg4, arg7, arg0, arg3, arg5, arg8, arg6);
		}
	}

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!ol;")
	public abstract Class243[] method6865();

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()Z")
	public abstract boolean method6866();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!ql;ZII)Z")
	public abstract boolean method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZIILclient!ae;IILclient!ae;Lclient!ae;[ZLclient!ae;II)V")
	public final void method6869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6_Sub2_Sub1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6_Sub2_Sub1 arg8, @OriginalArg(10) Class6_Sub2_Sub1 arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) Class6_Sub2_Sub1 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == -1) {
			return;
		}
		if (arg10 == null || arg7 == -1) {
			this.method6857(arg12, arg8, arg6, arg4, arg11, arg2, arg0, 0);
			return;
		}
		this.method6870();
		if (!this.NA()) {
			this.method6856();
			return;
		}
		@Pc(40) Class261 local40 = arg11.aClass261Array1[arg6];
		@Pc(43) Class6_Sub44 local43 = local40.aClass6_Sub44_1;
		@Pc(45) Class261 local45 = null;
		if (arg8 != null) {
			local45 = arg8.aClass261Array1[arg12];
			if (local45.aClass6_Sub44_1 != local43) {
				local45 = null;
			}
		}
		this.method6847(0, local43, 65535, false, (int[]) null, local45, local40, arg0, arg2, arg4, arg10);
		@Pc(77) Class261 local77 = arg9.aClass261Array1[arg7];
		@Pc(79) Class261 local79 = null;
		if (arg5 != null) {
			local79 = arg5.aClass261Array1[arg13];
			if (local43 != local79.aClass6_Sub44_1) {
				local79 = null;
			}
		}
		this.method6858(0, new int[0], 0, 0, 0, 0, arg2);
		this.method6847(0, local77.aClass6_Sub44_1, 65535, true, (int[]) null, local79, local77, arg1, arg2, arg3, arg10);
		this.wa();
		this.method6856();
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method6870();

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();
}
