import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class184 {

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
	protected boolean aBoolean716 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class184() {
	}

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIZLclient!am;I[ZI[IILclient!am;Lclient!jo;I)V")
	private void method8640(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) Class20 arg8, @OriginalArg(10) Class6_Sub31 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg3 == null || arg10 == 0) {
			for (local11 = 0; local11 < arg8.anInt498; local11++) {
				@Pc(18) short local18 = arg8.aShortArray8[local11];
				if (arg5 == null || arg2 == arg5[local18] || arg9.anIntArray277[local18] == 0) {
					@Pc(43) short local43 = arg8.aShortArray10[local11];
					if (local43 != -1) {
						this.method8664(arg6, arg9.anIntArrayArray26[local43], 0, 0, arg1 & arg9.anIntArray276[local43], 0, arg7, 0, arg0);
					}
					this.method8664(arg6, arg9.anIntArrayArray26[local18], arg8.aShortArray12[local11], arg8.aShortArray7[local11], arg1 & arg9.anIntArray276[local18], arg9.anIntArray277[local18], arg7, arg8.aShortArray9[local11], arg0);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(109) int local109 = 0;
		for (@Pc(111) int local111 = 0; local111 < arg9.anInt4851; local111++) {
			@Pc(115) boolean local115 = false;
			if (arg8.anInt498 > local11 && local111 == arg8.aShortArray8[local11]) {
				local115 = true;
			}
			@Pc(137) boolean local137 = false;
			if (arg3.anInt498 > local109 && arg3.aShortArray8[local109] == local111) {
				local137 = true;
			}
			if (local115 || local137) {
				if (arg5 == null || arg2 == arg5[local111] || arg9.anIntArray277[local111] == 0) {
					@Pc(186) short local186 = 0;
					@Pc(191) int local191 = arg9.anIntArray277[local111];
					if (local191 == 3 || local191 == 10) {
						local186 = 128;
					}
					@Pc(208) short local208;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(213) byte local213;
					if (local115) {
						local208 = arg8.aShortArray7[local11];
						local213 = arg8.aByteArray2[local11];
						local218 = arg8.aShortArray12[local11];
						local223 = arg8.aShortArray9[local11];
						local228 = arg8.aShortArray10[local11];
						local11++;
					} else {
						local208 = local186;
						local213 = 0;
						local223 = local186;
						local218 = local186;
						local228 = -1;
					}
					@Pc(263) short local263;
					@Pc(268) short local268;
					@Pc(248) short local248;
					@Pc(253) short local253;
					@Pc(258) byte local258;
					if (local137) {
						local248 = arg3.aShortArray9[local109];
						local253 = arg3.aShortArray10[local109];
						local258 = arg3.aByteArray2[local109];
						local263 = arg3.aShortArray7[local109];
						local268 = arg3.aShortArray12[local109];
						local109++;
					} else {
						local258 = 0;
						local253 = -1;
						local248 = local186;
						local268 = local186;
						local263 = local186;
					}
					@Pc(293) int local293;
					@Pc(291) int local291;
					@Pc(295) int local295;
					if ((local213 & 0x2) == 0 && (local258 & 0x1) == 0) {
						@Pc(312) int local312;
						if (local191 == 2) {
							local312 = local263 - local208 & 0x3FFF;
							@Pc(434) int local434 = local268 - local218 & 0x3FFF;
							if (local434 >= 8192) {
								local434 -= 16384;
							}
							if (local312 >= 8192) {
								local312 -= 16384;
							}
							@Pc(451) int local451 = local248 - local223 & 0x3FFF;
							local293 = local208 + arg10 * local312 / arg4 & 0x3FFF;
							local291 = local218 + arg10 * local434 / arg4 & 0x3FFF;
							if (local451 >= 8192) {
								local451 -= 16384;
							}
							local295 = arg10 * local451 / arg4 + local223 & 0x3FFF;
						} else if (local191 == 9) {
							local312 = local263 - local208 & 0x3FFF;
							if (local312 >= 8192) {
								local312 -= 16384;
							}
							local293 = arg10 * local312 / arg4 + local208 & 0x3FFF;
							local295 = 0;
							local291 = 0;
						} else if (local191 == 7) {
							local312 = local263 - local208 & 0x3F;
							if (local312 >= 32) {
								local312 -= 64;
							}
							local295 = local223 + arg10 * (local248 - local223) / arg4;
							local291 = arg10 * (local268 - local218) / arg4 + local218;
							local293 = arg10 * local312 / arg4 + local208 & 0x3F;
						} else {
							local293 = local208 + (local263 - local208) * arg10 / arg4;
							local291 = local218 + arg10 * (local268 - local218) / arg4;
							local295 = local223 + (local248 - local223) * arg10 / arg4;
						}
					} else {
						local291 = local218;
						local293 = local208;
						local295 = local223;
					}
					if (local228 != -1) {
						this.method8664(arg6, arg9.anIntArrayArray26[local228], 0, 0, arg9.anIntArray276[local228] & arg1, 0, arg7, 0, arg0);
					} else if (local253 != -1) {
						this.method8664(arg6, arg9.anIntArrayArray26[local253], 0, 0, arg9.anIntArray276[local253] & arg1, 0, arg7, 0, arg0);
					}
					this.method8664(arg6, arg9.anIntArrayArray26[local111], local291, local293, arg1 & arg9.anIntArray276[local111], local191, arg7, local295, arg0);
				} else {
					if (local137) {
						local109++;
					}
					if (local115) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILclient!g;ILclient!g;Z)V")
	public final void method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class6_Sub4_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6_Sub4_Sub4 arg6, @OriginalArg(8) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method8665();
		if (!this.NA()) {
			this.method8647();
			return;
		}
		@Pc(26) Class20 local26 = arg4.aClass20Array1[arg1];
		@Pc(29) Class6_Sub31 local29 = local26.aClass6_Sub31_1;
		@Pc(31) Class20 local31 = null;
		if (arg6 != null) {
			local31 = arg6.aClass20Array1[arg3];
			if (local31.aClass6_Sub31_1 != local29) {
				local31 = null;
			}
		}
		this.method8640(arg7, 65535, false, local31, arg2, (boolean[]) null, arg0, (int[]) null, local26, local29, arg5);
		this.wa();
		this.method8647();
	}

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!oo;IZ)V")
	public abstract void method8642(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!mb;")
	public abstract Class218[] method8643();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IZILclient!g;IIIILclient!g;)V")
	public final void method8644(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub4_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class6_Sub4_Sub4 arg8) {
		if (arg0 == -1) {
			return;
		}
		this.method8665();
		if (!this.NA()) {
			this.method8647();
			return;
		}
		@Pc(25) Class20 local25 = arg8.aClass20Array1[arg0];
		@Pc(28) Class6_Sub31 local28 = local25.aClass6_Sub31_1;
		@Pc(30) Class20 local30 = null;
		if (arg4 != null) {
			local30 = arg4.aClass20Array1[arg3];
			if (local28 != local30.aClass6_Sub31_1) {
				local30 = null;
			}
		}
		this.method8640(arg2, arg5, false, local30, arg7, (boolean[]) null, 0, arg1, local25, local28, arg6);
		this.wa();
		this.method8647();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
	public abstract boolean method8645();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	protected abstract void method8647();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!g;)V")
	public final void method8648(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub4_Sub4 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method8665();
		if (!this.NA()) {
			this.method8647();
			return;
		}
		@Pc(30) Class20 local30 = arg1.aClass20Array1[arg0];
		@Pc(33) Class6_Sub31 local33 = local30.aClass6_Sub31_1;
		for (@Pc(35) int local35 = 0; local35 < local30.anInt498; local35++) {
			@Pc(42) short local42 = local30.aShortArray8[local35];
			if (local33.aBooleanArray16[local42]) {
				if (local30.aShortArray10[local35] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local33.anIntArray277[local42], local30.aShortArray7[local35], local30.aShortArray12[local35], local30.aShortArray9[local35]);
			}
		}
		this.wa();
		this.method8647();
	}

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!g;IIZILclient!g;ILclient!g;I[ZIIILclient!g;I)V")
	public final void method8649(@OriginalArg(0) Class6_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub4_Sub4 arg5, @OriginalArg(7) Class6_Sub4_Sub4 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class6_Sub4_Sub4 arg12, @OriginalArg(14) int arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg8 == null || arg1 == -1) {
			this.method8641(0, arg2, arg7, arg9, arg12, arg4, arg0, arg3);
			return;
		}
		this.method8665();
		if (!this.NA()) {
			this.method8647();
			return;
		}
		@Pc(37) Class20 local37 = arg12.aClass20Array1[arg2];
		@Pc(45) Class6_Sub31 local45 = local37.aClass6_Sub31_1;
		@Pc(47) Class20 local47 = null;
		if (arg0 != null) {
			local47 = arg0.aClass20Array1[arg9];
			if (local45 != local47.aClass6_Sub31_1) {
				local47 = null;
			}
		}
		this.method8640(arg3, 65535, false, local47, arg7, arg8, 0, (int[]) null, local37, local45, arg4);
		@Pc(81) Class20 local81 = arg6.aClass20Array1[arg1];
		@Pc(83) Class20 local83 = null;
		if (arg5 != null) {
			local83 = arg5.aClass20Array1[arg13];
			if (local45 != local83.aClass6_Sub31_1) {
				local83 = null;
			}
		}
		this.method8650(0, new int[0], 0, 0, 0, 0, arg3);
		this.method8640(arg3, 65535, true, local83, arg10, arg8, 0, (int[]) null, local81, local81.aClass6_Sub31_1, arg11);
		this.wa();
		this.method8647();
	}

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method8650(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method8651(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!oo;ZII)Z")
	public abstract boolean method8653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method8654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class6_Sub4_Sub5 ba(@OriginalArg(0) Class6_Sub4_Sub5 arg0);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!oo;ZI)Z")
	public abstract boolean method8656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!fba;")
	public abstract Class100[] method8657();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!oo;Lclient!ea;II)V")
	public abstract void method8658(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!oo;)V")
	public abstract void method8659(@OriginalArg(0) Class207 arg0);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class184 method8660(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBILclient!s;IIIII)V")
	protected final void method8661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg6 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(32) int local32 = arg2.method7854(arg5 + local21, arg0 + local16);
		@Pc(36) int local36 = arg6 / 2;
		@Pc(41) int local41 = -arg7 / 2;
		@Pc(65) int local65 = arg2.method7854(local41 + arg5, local36 + arg0);
		@Pc(70) int local70 = -arg6 / 2;
		@Pc(74) int local74 = arg7 / 2;
		@Pc(86) int local86 = arg2.method7854(arg5 + local74, arg0 - -local70);
		@Pc(90) int local90 = arg6 / 2;
		@Pc(94) int local94 = arg7 / 2;
		@Pc(104) int local104 = arg2.method7854(local94 + arg5, arg0 + local90);
		@Pc(115) int local115 = local65 > local32 ? local32 : local65;
		@Pc(126) int local126 = local86 < local104 ? local86 : local104;
		@Pc(133) int local133 = local104 > local65 ? local65 : local104;
		@Pc(160) int local160;
		if (arg7 != 0) {
			@Pc(148) int local148 = (int) (Math.atan2((double) (local115 - local126), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local148 != 0) {
				if (arg4 != 0) {
					if (local148 > 8192) {
						local160 = 16384 - arg4;
						if (local160 > local148) {
							local148 = local160;
						}
					} else if (local148 > arg4) {
						local148 = arg4;
					}
				}
				this.FA(local148);
			}
		}
		@Pc(190) int local190 = local32 >= local86 ? local86 : local32;
		@Pc(194) int local194 = local104 + local32;
		if (arg6 != 0) {
			@Pc(213) int local213 = (int) (Math.atan2((double) (local190 - local133), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local213 != 0) {
				if (arg3 != 0) {
					if (local213 > 8192) {
						local160 = 16384 - arg3;
						if (local213 < local160) {
							local213 = local160;
						}
					} else if (local213 > arg3) {
						local213 = arg3;
					}
				}
				this.VA(local213);
			}
		}
		if (local194 > local86 + local65) {
			local194 = local86 + local65;
		}
		local194 = (local194 >> 1) - arg1;
		if (local194 != 0) {
			this.H(0, local194, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!oo;Lclient!ea;I)V")
	public abstract void method8662(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	public abstract void method8663();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIII[IIZ)V")
	private void method8664(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(37) int local37;
		if (arg0 == 1) {
			if (arg5 == 0 || arg5 == 1) {
				local37 = -arg3;
				arg3 = arg7;
				arg7 = local37;
			} else if (arg5 == 3) {
				local37 = arg3;
				arg3 = arg7;
				arg7 = local37;
			} else if (arg5 == 2) {
				local37 = arg3;
				arg3 = -arg7 & 0x3FFF;
				arg7 = local37 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg5 == 0 || arg5 == 1) {
				arg7 = -arg7;
				arg3 = -arg3;
			} else if (arg5 == 2) {
				arg3 = -arg3 & 0x3FFF;
				arg7 = -arg7 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg5 == 0 || arg5 == 1) {
				local37 = arg3;
				arg3 = -arg7;
				arg7 = local37;
			} else if (arg5 == 3) {
				local37 = arg3;
				arg3 = arg7;
				arg7 = local37;
			} else if (arg5 == 2) {
				local37 = arg3;
				arg3 = arg7 & 0x3FFF;
				arg7 = -local37 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.method8650(arg5, arg1, arg3, arg2, arg7, arg0, arg8);
		} else {
			this.I(arg5, arg1, arg3, arg2, arg7, arg8, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method8665();
}
