import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class45 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
	protected boolean aBoolean535 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class45() {
	}

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!gw;ZII)Z")
	public abstract boolean method5743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([ZLclient!cm;IIILclient!mf;ZB[IZILclient!cm;)V")
	private void method5744(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub39 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class66 arg10) {
		@Pc(18) int local18;
		if (arg10 == null || arg9 == 0) {
			for (local18 = 0; local18 < arg1.anInt1638; local18++) {
				@Pc(25) short local25 = arg1.aShortArray23[local18];
				if (arg0 == null || arg0[local25] == arg8 || arg5.anIntArray451[local25] == 0) {
					@Pc(51) short local51 = arg1.aShortArray26[local18];
					if (local51 != -1) {
						this.method5749(arg5.anIntArrayArray45[local51], 0, arg3, arg7, 0, arg5.anIntArray450[local51] & arg4, 0, arg6, 0);
					}
					this.method5749(arg5.anIntArrayArray45[local25], arg5.anIntArray451[local25], arg3, arg7, arg1.aShortArray24[local18], arg4 & arg5.anIntArray450[local25], arg1.aShortArray27[local18], arg6, arg1.aShortArray20[local18]);
				}
			}
			return;
		}
		local18 = 0;
		@Pc(119) int local119 = 0;
		for (@Pc(121) int local121 = 0; local121 < arg5.anInt6482; local121++) {
			@Pc(125) boolean local125 = false;
			if (local18 < arg1.anInt1638 && local121 == arg1.aShortArray23[local18]) {
				local125 = true;
			}
			@Pc(145) boolean local145 = false;
			if (arg10.anInt1638 > local119 && local121 == arg10.aShortArray23[local119]) {
				local145 = true;
			}
			if (local125 || local145) {
				if (arg0 == null || arg0[local121] == arg8 || arg5.anIntArray451[local121] == 0) {
					@Pc(212) short local212 = 0;
					@Pc(217) int local217 = arg5.anIntArray451[local121];
					if (local217 == 3 || local217 == 10) {
						local212 = 128;
					}
					@Pc(241) short local241;
					@Pc(233) short local233;
					@Pc(239) short local239;
					@Pc(237) short local237;
					@Pc(235) byte local235;
					if (local125) {
						local233 = arg1.aShortArray24[local18];
						local235 = arg1.aByteArray18[local18];
						local237 = arg1.aShortArray26[local18];
						local241 = arg1.aShortArray20[local18];
						local239 = arg1.aShortArray27[local18];
						local18++;
					} else {
						local233 = local212;
						local235 = 0;
						local237 = -1;
						local239 = local212;
						local241 = local212;
					}
					@Pc(275) short local275;
					@Pc(279) short local279;
					@Pc(277) short local277;
					@Pc(281) short local281;
					@Pc(273) byte local273;
					if (local145) {
						local275 = arg10.aShortArray20[local119];
						local273 = arg10.aByteArray18[local119];
						local279 = arg10.aShortArray24[local119];
						local277 = arg10.aShortArray27[local119];
						local281 = arg10.aShortArray26[local119];
						local119++;
					} else {
						local273 = 0;
						local275 = local212;
						local277 = local212;
						local279 = local212;
						local281 = -1;
					}
					@Pc(387) int local387;
					@Pc(368) int local368;
					@Pc(398) int local398;
					if ((local235 & 0x2) == 0 && (local273 & 0x1) == 0) {
						@Pc(331) int local331;
						if (local217 == 2) {
							local331 = local275 - local241 & 0x3FFF;
							@Pc(338) int local338 = local279 - local233 & 0x3FFF;
							if (local338 >= 8192) {
								local338 -= 16384;
							}
							if (local331 >= 8192) {
								local331 -= 16384;
							}
							@Pc(357) int local357 = local277 - local239 & 0x3FFF;
							local368 = local233 + local338 * arg9 / arg2 & 0x3FFF;
							if (local357 >= 8192) {
								local357 -= 16384;
							}
							local387 = local241 + local331 * arg9 / arg2 & 0x3FFF;
							local398 = local239 + local357 * arg9 / arg2 & 0x3FFF;
						} else if (local217 == 9) {
							local331 = local275 - local241 & 0x3FFF;
							if (local331 >= 8192) {
								local331 -= 16384;
							}
							local387 = arg9 * local331 / arg2 + local241 & 0x3FFF;
							local398 = 0;
							local368 = 0;
						} else if (local217 == 7) {
							local331 = local275 - local241 & 0x3F;
							if (local331 >= 32) {
								local331 -= 64;
							}
							local368 = local233 + arg9 * (local279 - local233) / arg2;
							local398 = local239 + (local277 - local239) * arg9 / arg2;
							local387 = local241 + local331 * arg9 / arg2 & 0x3F;
						} else {
							local387 = (local275 - local241) * arg9 / arg2 + local241;
							local368 = arg9 * (local279 - local233) / arg2 + local233;
							local398 = local239 + arg9 * (local277 - local239) / arg2;
						}
					} else {
						local387 = local241;
						local398 = local239;
						local368 = local233;
					}
					if (local237 != -1) {
						this.method5749(arg5.anIntArrayArray45[local237], 0, arg3, arg7, 0, arg4 & arg5.anIntArray450[local237], 0, arg6, 0);
					} else if (local281 != -1) {
						this.method5749(arg5.anIntArrayArray45[local281], 0, arg3, arg7, 0, arg5.anIntArray450[local281] & arg4, 0, arg6, 0);
					}
					this.method5749(arg5.anIntArrayArray45[local121], local217, arg3, arg7, local368, arg4 & arg5.anIntArray450[local121], local398, arg6, local387);
				} else {
					if (local125) {
						local18++;
					}
					if (local145) {
						local119++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lclient!uc;")
	public abstract Class363[] method5745();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method5746();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
	protected abstract void method5747();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method5748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[III[IIIIZI)V")
	private void method5749(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(34) int local34;
		if (arg2 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local34 = -arg8;
				arg8 = arg6;
				arg6 = local34;
			} else if (arg1 == 3) {
				local34 = arg8;
				arg8 = arg6;
				arg6 = local34;
			} else if (arg1 == 2) {
				local34 = arg8;
				arg8 = -arg6 & 0x3FFF;
				arg6 = local34 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg8 = -arg8;
				arg6 = -arg6;
			} else if (arg1 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local34 = arg8;
				arg8 = -arg6;
				arg6 = local34;
			} else if (arg1 == 3) {
				local34 = arg8;
				arg8 = arg6;
				arg6 = local34;
			} else if (arg1 == 2) {
				local34 = arg8;
				arg8 = arg6 & 0x3FFF;
				arg6 = -local34 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.method5751(arg1, arg0, arg8, arg4, arg6, arg2, arg7);
		} else {
			this.I(arg1, arg0, arg8, arg4, arg6, arg7, arg5, arg3);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!gw;)V")
	public abstract void method5750(@OriginalArg(0) Class86 arg0);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5751(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[B")
	public abstract byte[] method5752();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!uda;")
	public abstract Class364[] method5753();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class2_Sub6_Sub9 ba(@OriginalArg(0) Class2_Sub6_Sub9 arg0);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZILclient!pb;Lclient!pb;IIIII)V")
	public final void method5754(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub14 arg2, @OriginalArg(3) Class2_Sub6_Sub14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg6 == -1) {
			return;
		}
		this.method5746();
		if (!this.NA()) {
			this.method5747();
			return;
		}
		@Pc(22) Class66 local22 = arg2.aClass66Array1[arg6];
		@Pc(25) Class2_Sub39 local25 = local22.aClass2_Sub39_1;
		@Pc(27) Class66 local27 = null;
		if (arg3 != null) {
			local27 = arg3.aClass66Array1[arg4];
			if (local27.aClass2_Sub39_1 != local25) {
				local27 = null;
			}
		}
		this.method5744((boolean[]) null, local22, arg7, arg5, 65535, local25, arg0, (int[]) null, false, arg1, local27);
		this.wa();
		this.method5747();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!pb;IIILclient!pb;Lclient!pb;ZII[ZBLclient!pb;I)V")
	public final void method5755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub6_Sub14 arg6, @OriginalArg(7) Class2_Sub6_Sub14 arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean[] arg11, @OriginalArg(13) Class2_Sub6_Sub14 arg12, @OriginalArg(14) int arg13) {
		if (arg13 == -1) {
			return;
		}
		if (arg11 == null || arg4 == -1) {
			this.method5754(arg8, arg5, arg2, arg6, arg3, 0, arg13, arg10);
			return;
		}
		this.method5746();
		if (!this.NA()) {
			this.method5747();
			return;
		}
		@Pc(44) Class66 local44 = arg2.aClass66Array1[arg13];
		@Pc(47) Class2_Sub39 local47 = local44.aClass2_Sub39_1;
		@Pc(49) Class66 local49 = null;
		if (arg6 != null) {
			local49 = arg6.aClass66Array1[arg3];
			if (local49.aClass2_Sub39_1 != local47) {
				local49 = null;
			}
		}
		this.method5744(arg11, local44, arg10, 0, 65535, local47, arg8, (int[]) null, false, arg5, local49);
		@Pc(81) Class66 local81 = arg12.aClass66Array1[arg4];
		@Pc(83) Class66 local83 = null;
		if (arg7 != null) {
			local83 = arg7.aClass66Array1[arg0];
			if (local47 != local83.aClass2_Sub39_1) {
				local83 = null;
			}
		}
		this.method5751(0, new int[0], 0, 0, 0, 0, arg8);
		this.method5744(arg11, local81, arg1, 0, 65535, local81.aClass2_Sub39_1, arg8, (int[]) null, true, arg9, local83);
		this.wa();
		this.method5747();
	}

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!gw;IZ)V")
	public abstract void method5756(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
	public abstract boolean method5757();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!gw;Lclient!fa;II)V")
	public abstract void method5759(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class4_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method5760(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILclient!pb;)V")
	public final void method5761(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6_Sub14 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method5746();
		if (!this.NA()) {
			this.method5747();
			return;
		}
		@Pc(25) Class66 local25 = arg1.aClass66Array1[arg0];
		@Pc(28) Class2_Sub39 local28 = local25.aClass2_Sub39_1;
		for (@Pc(30) int local30 = 0; local30 < local25.anInt1638; local30++) {
			@Pc(39) short local39 = local25.aShortArray23[local30];
			if (local28.aBooleanArray29[local39]) {
				if (local25.aShortArray26[local30] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local28.anIntArray451[local39], local25.aShortArray20[local30], local25.aShortArray24[local30], local25.aShortArray27[local30]);
			}
		}
		this.wa();
		this.method5747();
		if (-46 != -46) {
			Static317.aBooleanArray27 = null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B[B)V")
	public abstract void method5762(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public abstract void method5763();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIIIIILclient!s;I)V")
	protected final void method5764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class133 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg5 / 2;
		@Pc(32) int local32 = arg6.method8214(arg4 + local16, arg7 - -local21);
		@Pc(36) int local36 = arg1 / 2;
		@Pc(41) int local41 = -arg5 / 2;
		@Pc(52) int local52 = arg6.method8214(arg4 + local36, arg7 - -local41);
		@Pc(57) int local57 = -arg1 / 2;
		@Pc(61) int local61 = arg5 / 2;
		@Pc(72) int local72 = arg6.method8214(arg4 + local57, arg7 - -local61);
		@Pc(76) int local76 = arg1 / 2;
		@Pc(80) int local80 = arg5 / 2;
		@Pc(91) int local91 = arg6.method8214(arg4 + local76, arg7 + local80);
		@Pc(99) int local99 = local52 <= local32 ? local52 : local32;
		@Pc(111) int local111 = local72 >= local91 ? local91 : local72;
		@Pc(123) int local123 = local91 <= local52 ? local91 : local52;
		@Pc(131) int local131 = local72 <= local32 ? local72 : local32;
		@Pc(171) int local171;
		if (arg5 != 0) {
			@Pc(147) int local147 = (int) (Math.atan2((double) (local99 - local111), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local147 != 0) {
				if (arg0 != 0) {
					if (local147 > 8192) {
						local171 = 16384 - arg0;
						if (local147 < local171) {
							local147 = local171;
						}
					} else if (arg0 < local147) {
						local147 = arg0;
					}
				}
				this.FA(local147);
			}
		}
		@Pc(187) int local187 = local32 + local91;
		if (arg1 != 0) {
			@Pc(224) int local224 = (int) (Math.atan2((double) (local131 - local123), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local224 != 0) {
				if (arg2 != 0) {
					if (local224 > 8192) {
						local171 = 16384 - arg2;
						if (local224 < local171) {
							local224 = local171;
						}
					} else if (local224 > arg2) {
						local224 = arg2;
					}
				}
				this.VA(local224);
			}
		}
		if (local72 + local52 < local187) {
			local187 = local72 + local52;
		}
		local187 = (local187 >> 1) - arg3;
		if (local187 != 0) {
			this.H(0, local187, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pb;ZILclient!pb;I[IIBIII)V")
	public final void method5766(@OriginalArg(0) Class2_Sub6_Sub14 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub6_Sub14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg4 == -1) {
			return;
		}
		this.method5746();
		if (!this.NA()) {
			this.method5747();
			return;
		}
		@Pc(23) Class66 local23 = arg0.aClass66Array1[arg4];
		@Pc(26) Class2_Sub39 local26 = local23.aClass2_Sub39_1;
		@Pc(28) Class66 local28 = null;
		if (arg3 != null) {
			local28 = arg3.aClass66Array1[arg7];
			if (local26 != local28.aClass2_Sub39_1) {
				local28 = null;
			}
		}
		this.method5744((boolean[]) null, local23, arg2, 0, arg6, local26, arg1, arg5, false, arg8, local28);
		this.wa();
		this.method5747();
	}

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class45 method5768(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!gw;Lclient!fa;I)V")
	public abstract void method5769(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class4_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!gw;ZI)Z")
	public abstract boolean method5770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);
}
