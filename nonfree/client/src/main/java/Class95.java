import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class95 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
	protected boolean aBoolean446 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class95() {
	}

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!uu;ZII)Z")
	public abstract boolean method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!bs;I)V")
	public final void method5651(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11_Sub1 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method5660();
		if (!this.NA()) {
			this.method5667();
			return;
		}
		@Pc(23) Class20 local23 = arg1.aClass20Array1[arg0];
		@Pc(26) Class3_Sub55 local26 = local23.aClass3_Sub55_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt520; local28++) {
			@Pc(35) short local35 = local23.aShortArray9[local28];
			if (local26.aBooleanArray56[local35]) {
				if (local23.aShortArray13[local28] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local26.anIntArray935[local35], local23.aShortArray12[local28], local23.aShortArray14[local28], local23.aShortArray15[local28]);
			}
		}
		this.wa();
		this.method5667();
	}

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uu;Lclient!taa;I)V")
	public abstract void method5653(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class28_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!cba;")
	public abstract Class49[] method5654();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!s;IIIIIII)V")
	protected final void method5655(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) int local22 = -arg4 / 2;
		@Pc(27) int local27 = -arg5 / 2;
		@Pc(37) int local37 = arg1.method7980(local27 + arg7, local22 + arg6);
		@Pc(41) int local41 = arg4 / 2;
		@Pc(46) int local46 = -arg5 / 2;
		@Pc(56) int local56 = arg1.method7980(arg7 + local46, local41 + arg6);
		@Pc(61) int local61 = -arg4 / 2;
		@Pc(65) int local65 = arg5 / 2;
		@Pc(76) int local76 = arg1.method7980(local65 + arg7, arg6 - -local61);
		@Pc(80) int local80 = arg4 / 2;
		@Pc(84) int local84 = arg5 / 2;
		@Pc(95) int local95 = arg1.method7980(arg7 + local84, local80 + arg6);
		@Pc(102) int local102 = local56 <= local37 ? local56 : local37;
		@Pc(113) int local113 = local76 < local95 ? local76 : local95;
		@Pc(124) int local124 = local56 < local95 ? local56 : local95;
		@Pc(156) int local156;
		if (arg5 != 0) {
			@Pc(142) int local142 = (int) (Math.atan2((double) (local102 - local113), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local142 != 0) {
				if (arg2 != 0) {
					if (local142 > 8192) {
						local156 = 16384 - arg2;
						if (local142 < local156) {
							local142 = local156;
						}
					} else if (arg2 < local142) {
						local142 = arg2;
					}
				}
				this.FA(local142);
			}
		}
		@Pc(186) int local186 = local37 < local76 ? local37 : local76;
		if (arg4 != 0) {
			@Pc(201) int local201 = (int) (Math.atan2((double) (local186 - local124), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local201 != 0) {
				if (arg3 != 0) {
					if (local201 > 8192) {
						local156 = 16384 - arg3;
						if (local201 < local156) {
							local201 = local156;
						}
					} else if (arg3 < local201) {
						local201 = arg3;
					}
				}
				this.VA(local201);
			}
		}
		@Pc(243) int local243 = local37 + local95;
		if (local76 + local56 < local243) {
			local243 = local76 + local56;
		}
		local243 = (local243 >> 1) - arg0;
		if (local243 != 0) {
			this.H(0, local243, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uu;IZ)V")
	public abstract void method5656(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZII[IIZLclient!bs;IILclient!bs;)V")
	public final void method5657(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class3_Sub11_Sub1 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class3_Sub11_Sub1 arg8) {
		if (arg6 == -1) {
			return;
		}
		this.method5660();
		if (!this.NA()) {
			this.method5667();
			return;
		}
		@Pc(26) Class20 local26 = arg8.aClass20Array1[arg6];
		@Pc(29) Class3_Sub55 local29 = local26.aClass3_Sub55_1;
		@Pc(31) Class20 local31 = null;
		if (arg5 != null) {
			local31 = arg5.aClass20Array1[arg7];
			if (local31.aClass3_Sub55_1 != local29) {
				local31 = null;
			}
		}
		this.method5661(local31, local29, 0, arg0, arg1, arg4, false, (boolean[]) null, local26, arg3, arg2);
		this.wa();
		this.method5667();
	}

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!uu;ZI)Z")
	public abstract boolean method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uu;Lclient!taa;II)V")
	public abstract void method5659(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class28_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	protected abstract void method5660();

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ap;Lclient!wha;IZIIIZ[ZLclient!ap;[II)V")
	private void method5661(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class3_Sub55 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) Class20 arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (arg0 == null || arg4 == 0) {
			for (local14 = 0; local14 < arg8.anInt520; local14++) {
				@Pc(21) short local21 = arg8.aShortArray9[local14];
				if (arg7 == null || arg6 == arg7[local21] || arg1.anIntArray935[local21] == 0) {
					@Pc(38) short local38 = arg8.aShortArray13[local14];
					if (local38 != -1) {
						this.method5663(arg1.anIntArray934[local38] & arg10, 0, arg3, arg2, 0, arg1.anIntArrayArray66[local38], arg9, 0, 0);
					}
					this.method5663(arg10 & arg1.anIntArray934[local21], arg8.aShortArray15[local14], arg3, arg2, arg8.aShortArray12[local14], arg1.anIntArrayArray66[local21], arg9, arg8.aShortArray14[local14], arg1.anIntArray935[local21]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(108) int local108 = 0;
		for (@Pc(110) int local110 = 0; local110 < arg1.anInt10570; local110++) {
			@Pc(114) boolean local114 = false;
			if (arg8.anInt520 > local14 && arg8.aShortArray9[local14] == local110) {
				local114 = true;
			}
			@Pc(132) boolean local132 = false;
			if (local108 < arg0.anInt520 && local110 == arg0.aShortArray9[local108]) {
				local132 = true;
			}
			if (local114 || local132) {
				if (arg7 == null || arg6 == arg7[local110] || arg1.anIntArray935[local110] == 0) {
					@Pc(174) short local174 = 0;
					@Pc(179) int local179 = arg1.anIntArray935[local110];
					if (local179 == 3 || local179 == 10) {
						local174 = 128;
					}
					@Pc(199) short local199;
					@Pc(197) short local197;
					@Pc(201) short local201;
					@Pc(195) short local195;
					@Pc(193) byte local193;
					if (local114) {
						local197 = arg8.aShortArray14[local14];
						local193 = arg8.aByteArray4[local14];
						local195 = arg8.aShortArray13[local14];
						local201 = arg8.aShortArray15[local14];
						local199 = arg8.aShortArray12[local14];
						local14++;
					} else {
						local193 = 0;
						local195 = -1;
						local197 = local174;
						local199 = local174;
						local201 = local174;
					}
					@Pc(233) short local233;
					@Pc(237) short local237;
					@Pc(239) short local239;
					@Pc(235) short local235;
					@Pc(241) byte local241;
					if (local132) {
						local237 = arg0.aShortArray14[local108];
						local241 = arg0.aByteArray4[local108];
						local235 = arg0.aShortArray13[local108];
						local239 = arg0.aShortArray15[local108];
						local233 = arg0.aShortArray12[local108];
						local108++;
					} else {
						local233 = local174;
						local235 = -1;
						local237 = local174;
						local239 = local174;
						local241 = 0;
					}
					@Pc(286) int local286;
					@Pc(282) int local282;
					@Pc(284) int local284;
					if ((local193 & 0x2) == 0 && (local241 & 0x1) == 0) {
						@Pc(298) int local298;
						if (local179 == 2) {
							local298 = local233 - local199 & 0x3FFF;
							@Pc(304) int local304 = local237 - local197 & 0x3FFF;
							if (local298 >= 8192) {
								local298 -= 16384;
							}
							if (local304 >= 8192) {
								local304 -= 16384;
							}
							@Pc(319) int local319 = local239 - local201 & 0x3FFF;
							if (local319 >= 8192) {
								local319 -= 16384;
							}
							local286 = local298 * arg4 / arg5 + local199 & 0x3FFF;
							local282 = local304 * arg4 / arg5 + local197 & 0x3FFF;
							local284 = local319 * arg4 / arg5 + local201 & 0x3FFF;
						} else if (local179 == 9) {
							local298 = local233 - local199 & 0x3FFF;
							if (local298 >= 8192) {
								local298 -= 16384;
							}
							local286 = local199 + arg4 * local298 / arg5 & 0x3FFF;
							local284 = 0;
							local282 = 0;
						} else if (local179 == 7) {
							local298 = local233 - local199 & 0x3F;
							if (local298 >= 32) {
								local298 -= 64;
							}
							local286 = local298 * arg4 / arg5 + local199 & 0x3F;
							local282 = (local237 - local197) * arg4 / arg5 + local197;
							local284 = local201 + (local239 - local201) * arg4 / arg5;
						} else {
							local284 = local201 + (local239 - local201) * arg4 / arg5;
							local286 = local199 + (local233 - local199) * arg4 / arg5;
							local282 = local197 + arg4 * (local237 - local197) / arg5;
						}
					} else {
						local282 = local197;
						local284 = local201;
						local286 = local199;
					}
					if (local195 != -1) {
						this.method5663(arg10 & arg1.anIntArray934[local195], 0, arg3, arg2, 0, arg1.anIntArrayArray66[local195], arg9, 0, 0);
					} else if (local235 != -1) {
						this.method5663(arg1.anIntArray934[local235] & arg10, 0, arg3, arg2, 0, arg1.anIntArrayArray66[local235], arg9, 0, 0);
					}
					this.method5663(arg1.anIntArray934[local110] & arg10, local284, arg3, arg2, local286, arg1.anIntArrayArray66[local110], arg9, local282, local179);
				} else {
					if (local132) {
						local108++;
					}
					if (local114) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method5662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZII[I[IZII)V")
	private void method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(22) int local22;
		if (arg3 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local22 = -arg4;
				arg4 = arg1;
				arg1 = local22;
			} else if (arg8 == 3) {
				local22 = arg4;
				arg4 = arg1;
				arg1 = local22;
			} else if (arg8 == 2) {
				local22 = arg4;
				arg4 = -arg1 & 0x3FFF;
				arg1 = local22 & 0x3FFF;
			}
		} else if (arg3 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg1 = -arg1;
				arg4 = -arg4;
			} else if (arg8 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg3 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local22 = arg4;
				arg4 = -arg1;
				arg1 = local22;
			} else if (arg8 == 3) {
				local22 = arg4;
				arg4 = arg1;
				arg1 = local22;
			} else if (arg8 == 2) {
				local22 = arg4;
				arg4 = arg1 & 0x3FFF;
				arg1 = -local22 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.method5672(arg8, arg5, arg4, arg7, arg1, arg3, arg2);
		} else {
			this.I(arg8, arg5, arg4, arg7, arg1, arg2, arg0, arg6);
		}
	}

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class95 method5664(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public abstract void method5665();

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class3_Sub11_Sub3 ba(@OriginalArg(0) Class3_Sub11_Sub3 arg0);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()Z")
	public abstract boolean method5666();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method5667();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!kw;")
	public abstract Class197[] method5668();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!uu;)V")
	public abstract void method5669(@OriginalArg(0) Class239 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZLclient!bs;IIBLclient!bs;)V")
	public final void method5670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class3_Sub11_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class3_Sub11_Sub1 arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method5660();
		if (!this.NA()) {
			this.method5667();
			return;
		}
		@Pc(26) Class20 local26 = arg4.aClass20Array1[arg1];
		@Pc(29) Class3_Sub55 local29 = local26.aClass3_Sub55_1;
		@Pc(31) Class20 local31 = null;
		if (arg7 != null) {
			local31 = arg7.aClass20Array1[arg5];
			if (local29 != local31.aClass3_Sub55_1) {
				local31 = null;
			}
		}
		this.method5661(local31, local29, arg0, arg3, arg2, arg6, false, (boolean[]) null, local26, (int[]) null, 65535);
		this.wa();
		this.method5667();
	}

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bs;Lclient!bs;[ZBIILclient!bs;IILclient!bs;IZIII)V")
	public final void method5671(@OriginalArg(0) Class3_Sub11_Sub1 arg0, @OriginalArg(1) Class3_Sub11_Sub1 arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub11_Sub1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3_Sub11_Sub1 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg3 == -1) {
			return;
		}
		if (arg2 == null || arg6 == -1) {
			this.method5670(0, arg3, arg11, arg10, arg0, arg9, arg4, arg8);
			return;
		}
		this.method5660();
		if (!this.NA()) {
			this.method5667();
			return;
		}
		@Pc(43) Class20 local43 = arg0.aClass20Array1[arg3];
		@Pc(46) Class3_Sub55 local46 = local43.aClass3_Sub55_1;
		@Pc(48) Class20 local48 = null;
		if (arg8 != null) {
			local48 = arg8.aClass20Array1[arg9];
			if (local48.aClass3_Sub55_1 != local46) {
				local48 = null;
			}
		}
		this.method5661(local48, local46, 0, arg10, arg11, arg4, false, arg2, local43, (int[]) null, 65535);
		@Pc(80) Class20 local80 = arg5.aClass20Array1[arg6];
		@Pc(82) Class20 local82 = null;
		if (arg1 != null) {
			local82 = arg1.aClass20Array1[arg7];
			if (local46 != local82.aClass3_Sub55_1) {
				local82 = null;
			}
		}
		this.method5672(0, new int[0], 0, 0, 0, 0, arg10);
		this.method5661(local82, local80.aClass3_Sub55_1, 0, arg10, arg12, arg13, true, arg2, local80, (int[]) null, 65535);
		this.wa();
		this.method5667();
	}

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5672(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method5673(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
