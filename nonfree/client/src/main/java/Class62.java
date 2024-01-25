import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class62 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
	protected boolean aBoolean661 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class62() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class62 method7329(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIZI[ZILclient!ov;ILclient!of;ZLclient!of;I)V")
	private void method7330(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub39 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class264 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class264 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg7 == null || arg1 == 0) {
			for (local11 = 0; local11 < arg9.anInt6763; local11++) {
				@Pc(18) short local18 = arg9.aShortArray83[local11];
				if (arg3 == null || arg3[local18] == arg8 || arg5.anIntArray483[local18] == 0) {
					@Pc(42) short local42 = arg9.aShortArray85[local11];
					if (local42 != -1) {
						this.method7352(0, arg4, arg2, 0, arg6 & arg5.anIntArray482[local42], arg0, 0, 0, arg5.anIntArrayArray42[local42]);
					}
					this.method7352(arg9.aShortArray78[local11], arg4, arg2, arg5.anIntArray483[local18], arg5.anIntArray482[local18] & arg6, arg0, arg9.aShortArray79[local11], arg9.aShortArray82[local11], arg5.anIntArrayArray42[local18]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(107) int local107 = 0;
		for (@Pc(117) int local117 = 0; local117 < arg5.anInt6958; local117++) {
			@Pc(121) boolean local121 = false;
			if (arg9.anInt6763 > local11 && arg9.aShortArray83[local11] == local117) {
				local121 = true;
			}
			@Pc(139) boolean local139 = false;
			if (arg7.anInt6763 > local107 && arg7.aShortArray83[local107] == local117) {
				local139 = true;
			}
			if (local121 || local139) {
				if (arg3 == null || arg8 == arg3[local117] || arg5.anIntArray483[local117] == 0) {
					@Pc(189) short local189 = 0;
					@Pc(194) int local194 = arg5.anIntArray483[local117];
					if (local194 == 3 || local194 == 10) {
						local189 = 128;
					}
					@Pc(208) short local208;
					@Pc(206) short local206;
					@Pc(212) short local212;
					@Pc(214) short local214;
					@Pc(210) byte local210;
					if (local121) {
						local206 = arg9.aShortArray78[local11];
						local212 = arg9.aShortArray82[local11];
						local208 = arg9.aShortArray79[local11];
						local214 = arg9.aShortArray85[local11];
						local210 = arg9.aByteArray62[local11];
						local11++;
					} else {
						local206 = local189;
						local208 = local189;
						local210 = 0;
						local212 = local189;
						local214 = -1;
					}
					@Pc(252) short local252;
					@Pc(246) short local246;
					@Pc(248) short local248;
					@Pc(250) short local250;
					@Pc(254) byte local254;
					if (local139) {
						local252 = arg7.aShortArray79[local107];
						local246 = arg7.aShortArray78[local107];
						local254 = arg7.aByteArray62[local107];
						local250 = arg7.aShortArray85[local107];
						local248 = arg7.aShortArray82[local107];
						local107++;
					} else {
						local246 = local189;
						local248 = local189;
						local250 = -1;
						local252 = local189;
						local254 = 0;
					}
					@Pc(295) int local295;
					@Pc(297) int local297;
					@Pc(299) int local299;
					if ((local210 & 0x2) == 0 && (local254 & 0x1) == 0) {
						@Pc(313) int local313;
						if (local194 == 2) {
							local313 = local252 - local208 & 0x3FFF;
							@Pc(320) int local320 = local246 - local206 & 0x3FFF;
							@Pc(327) int local327 = local248 - local212 & 0x3FFF;
							if (local320 >= 8192) {
								local320 -= 16384;
							}
							if (local313 >= 8192) {
								local313 -= 16384;
							}
							if (local327 >= 8192) {
								local327 -= 16384;
							}
							local295 = local313 * arg1 / arg10 + local208 & 0x3FFF;
							local297 = local206 + local320 * arg1 / arg10 & 0x3FFF;
							local299 = local327 * arg1 / arg10 + local212 & 0x3FFF;
						} else if (local194 == 9) {
							local313 = local252 - local208 & 0x3FFF;
							if (local313 >= 8192) {
								local313 -= 16384;
							}
							local299 = 0;
							local297 = 0;
							local295 = local208 + local313 * arg1 / arg10 & 0x3FFF;
						} else if (local194 == 7) {
							local313 = local252 - local208 & 0x3F;
							if (local313 >= 32) {
								local313 -= 64;
							}
							local295 = arg1 * local313 / arg10 + local208 & 0x3F;
							local299 = local212 + (local248 - local212) * arg1 / arg10;
							local297 = local206 + arg1 * (local246 - local206) / arg10;
						} else {
							local295 = local208 + arg1 * (local252 - local208) / arg10;
							local299 = arg1 * (local248 - local212) / arg10 + local212;
							local297 = arg1 * (local246 - local206) / arg10 + local206;
						}
					} else {
						local295 = local208;
						local297 = local206;
						local299 = local212;
					}
					if (local214 != -1) {
						this.method7352(0, arg4, arg2, 0, arg6 & arg5.anIntArray482[local214], arg0, 0, 0, arg5.anIntArrayArray42[local214]);
					} else if (local250 != -1) {
						this.method7352(0, arg4, arg2, 0, arg5.anIntArray482[local250] & arg6, arg0, 0, 0, arg5.anIntArrayArray42[local250]);
					}
					this.method7352(local297, arg4, arg2, local194, arg5.anIntArray482[local117] & arg6, arg0, local295, local299, arg5.anIntArrayArray42[local117]);
				} else {
					if (local121) {
						local11++;
					}
					if (local139) {
						local107++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!mk;")
	public abstract Class235[] method7331();

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!nh;Lclient!gca;II)V")
	public abstract void method7332(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lclient!ir;")
	public abstract Class170[] method7333();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ne;IB)V")
	public final void method7334(@OriginalArg(0) Class4_Sub5_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7345();
		if (!this.NA()) {
			this.method7340();
			return;
		}
		@Pc(22) Class264 local22 = arg0.aClass264Array1[arg1];
		@Pc(25) Class4_Sub39 local25 = local22.aClass4_Sub39_1;
		for (@Pc(32) int local32 = 0; local32 < local22.anInt6763; local32++) {
			@Pc(39) short local39 = local22.aShortArray83[local32];
			if (local25.aBooleanArray14[local39]) {
				if (local22.aShortArray85[local32] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local25.anIntArray483[local39], local22.aShortArray79[local32], local22.aShortArray78[local32], local22.aShortArray82[local32]);
			}
		}
		this.wa();
		this.method7340();
	}

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!nh;Lclient!gca;I)V")
	public abstract void method7335(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!nh;)V")
	public abstract void method7336(@OriginalArg(0) Class92 arg0);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public abstract void method7338();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method7339(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method7340();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!nh;ZII)Z")
	public abstract boolean method7341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7342(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class4_Sub5_Sub9 ba(@OriginalArg(0) Class4_Sub5_Sub9 arg0);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!s;IIIIII)V")
	protected final void method7343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg4 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(31) int local31 = arg2.method7453(local16 + arg3, local21 + arg7);
		@Pc(35) int local35 = arg4 / 2;
		@Pc(40) int local40 = -arg1 / 2;
		@Pc(50) int local50 = arg2.method7453(arg3 + local35, local40 + arg7);
		@Pc(55) int local55 = -arg4 / 2;
		@Pc(59) int local59 = arg1 / 2;
		@Pc(70) int local70 = arg2.method7453(arg3 + local55, arg7 + local59);
		@Pc(74) int local74 = arg4 / 2;
		@Pc(78) int local78 = arg1 / 2;
		@Pc(90) int local90 = arg2.method7453(local74 + arg3, arg7 + local78);
		@Pc(97) int local97 = local50 <= local31 ? local50 : local31;
		@Pc(104) int local104 = local70 < local90 ? local70 : local90;
		@Pc(111) int local111 = local50 < local90 ? local50 : local90;
		@Pc(143) int local143;
		if (arg1 != 0) {
			@Pc(129) int local129 = (int) (Math.atan2((double) (local97 - local104), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local129 != 0) {
				if (arg5 != 0) {
					if (local129 > 8192) {
						local143 = 16384 - arg5;
						if (local143 > local129) {
							local129 = local143;
						}
					} else if (local129 > arg5) {
						local129 = arg5;
					}
				}
				this.FA(local129);
			}
		}
		@Pc(169) int local169 = local70 <= local31 ? local70 : local31;
		if (arg4 != 0) {
			@Pc(188) int local188 = (int) (Math.atan2((double) (local169 - local111), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local188 != 0) {
				if (arg0 != 0) {
					if (local188 > 8192) {
						local143 = 16384 - arg0;
						if (local188 < local143) {
							local188 = local143;
						}
					} else if (local188 > arg0) {
						local188 = arg0;
					}
				}
				this.VA(local188);
			}
		}
		@Pc(227) int local227 = local90 + local31;
		if (local227 > local70 + local50) {
			local227 = local50 + local70;
		}
		local227 = (local227 >> 1) - arg6;
		if (local227 != 0) {
			this.H(0, local227, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()Z")
	public abstract boolean method7344();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method7345();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!ne;ZIILclient!ne;II)V")
	public final void method7346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub5_Sub15 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4_Sub5_Sub15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == -1) {
			return;
		}
		this.method7345();
		if (!this.NA()) {
			this.method7340();
			return;
		}
		@Pc(29) Class264 local29 = arg5.aClass264Array1[arg0];
		@Pc(32) Class4_Sub39 local32 = local29.aClass4_Sub39_1;
		@Pc(34) Class264 local34 = null;
		if (arg2 != null) {
			local34 = arg2.aClass264Array1[arg7];
			if (local34.aClass4_Sub39_1 != local32) {
				local34 = null;
			}
		}
		this.method7330((int[]) null, arg4, arg3, (boolean[]) null, arg6, local32, 65535, local34, false, local29, arg1);
		this.wa();
		this.method7340();
	}

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!nh;ZI)Z")
	public abstract boolean method7347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILclient!ne;IIIZLclient!ne;ILclient!ne;Lclient!ne;II[Z)V")
	public final void method7348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub5_Sub15 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class4_Sub5_Sub15 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class4_Sub5_Sub15 arg10, @OriginalArg(11) Class4_Sub5_Sub15 arg11, @OriginalArg(12) int arg12, @OriginalArg(14) boolean[] arg13) {
		if (arg9 == -1) {
			return;
		}
		if (arg13 == null || arg5 == -1) {
			this.method7346(arg9, arg0, arg11, arg7, arg4, arg3, 0, arg12);
			return;
		}
		this.method7345();
		if (!this.NA()) {
			this.method7340();
			return;
		}
		@Pc(40) Class264 local40 = arg3.aClass264Array1[arg9];
		@Pc(43) Class4_Sub39 local43 = local40.aClass4_Sub39_1;
		@Pc(45) Class264 local45 = null;
		if (arg11 != null) {
			local45 = arg11.aClass264Array1[arg12];
			if (local45.aClass4_Sub39_1 != local43) {
				local45 = null;
			}
		}
		this.method7330((int[]) null, arg4, arg7, arg13, 0, local43, 65535, local45, false, local40, arg0);
		@Pc(77) Class264 local77 = arg8.aClass264Array1[arg5];
		@Pc(79) Class264 local79 = null;
		if (arg10 != null) {
			local79 = arg10.aClass264Array1[arg1];
			if (local79.aClass4_Sub39_1 != local43) {
				local79 = null;
			}
		}
		this.method7342(0, new int[0], 0, 0, 0, 0, arg7);
		this.method7330((int[]) null, arg6, arg7, arg13, 0, local77.aClass4_Sub39_1, 65535, local79, true, local77, arg2);
		this.wa();
		this.method7340();
	}

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!nh;IZ)V")
	public abstract void method7350(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIZLclient!ne;[IILclient!ne;)V")
	public final void method7351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class4_Sub5_Sub15 arg6, @OriginalArg(8) int[] arg7, @OriginalArg(10) Class4_Sub5_Sub15 arg8) {
		if (arg0 == -1) {
			return;
		}
		this.method7345();
		if (!this.NA()) {
			this.method7340();
			return;
		}
		@Pc(22) Class264 local22 = arg8.aClass264Array1[arg0];
		@Pc(25) Class4_Sub39 local25 = local22.aClass4_Sub39_1;
		@Pc(27) Class264 local27 = null;
		if (arg6 != null) {
			local27 = arg6.aClass264Array1[arg1];
			if (local27.aClass4_Sub39_1 != local25) {
				local27 = null;
			}
		}
		this.method7330(arg7, arg4, arg5, (boolean[]) null, 0, local25, arg3, local27, false, local22, arg2);
		this.wa();
		this.method7340();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIZII[III[I)V")
	private void method7352(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(46) int local46;
		if (arg1 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local46 = -arg6;
				arg6 = arg7;
				arg7 = local46;
			} else if (arg3 == 3) {
				local46 = arg6;
				arg6 = arg7;
				arg7 = local46;
			} else if (arg3 == 2) {
				local46 = arg6;
				arg6 = -arg7 & 0x3FFF;
				arg7 = local46 & 0x3FFF;
			}
		} else if (arg1 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg6 = -arg6;
				arg7 = -arg7;
			} else if (arg3 == 2) {
				arg6 = -arg6 & 0x3FFF;
				arg7 = -arg7 & 0x3FFF;
			}
		} else if (arg1 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local46 = arg6;
				arg6 = -arg7;
				arg7 = local46;
			} else if (arg3 == 3) {
				local46 = arg6;
				arg6 = arg7;
				arg7 = local46;
			} else if (arg3 == 2) {
				local46 = arg6;
				arg6 = arg7 & 0x3FFF;
				arg7 = -local46 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.method7342(arg3, arg8, arg6, arg0, arg7, arg1, arg2);
		} else {
			this.I(arg3, arg8, arg6, arg0, arg7, arg2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();
}
