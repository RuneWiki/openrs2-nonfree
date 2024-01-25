import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class83 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
	protected boolean aBoolean702 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class83() {
	}

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method7992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class83 method7993(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!dfa;ZII)Z")
	public abstract boolean method7994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method7995(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dfa;IZ)V")
	public abstract void method7996(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class8_Sub5_Sub11 ba(@OriginalArg(0) Class8_Sub5_Sub11 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIZIIII[II)V")
	private void method7997(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(18) int local18;
		if (arg5 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local18 = -arg6;
				arg6 = arg4;
				arg4 = local18;
			} else if (arg8 == 3) {
				local18 = arg6;
				arg6 = arg4;
				arg4 = local18;
			} else if (arg8 == 2) {
				local18 = arg6;
				arg6 = -arg4 & 0x3FFF;
				arg4 = local18 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg4 = -arg4;
				arg6 = -arg6;
			} else if (arg8 == 2) {
				arg6 = -arg6 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local18 = arg6;
				arg6 = -arg4;
				arg4 = local18;
			} else if (arg8 == 3) {
				local18 = arg6;
				arg6 = arg4;
				arg4 = local18;
			} else if (arg8 == 2) {
				local18 = arg6;
				arg6 = arg4 & 0x3FFF;
				arg4 = -local18 & 0x3FFF;
			}
		}
		if (arg1 == 65535) {
			this.method8014(arg8, arg0, arg6, arg3, arg4, arg5, arg2);
		} else {
			this.I(arg8, arg0, arg6, arg3, arg4, arg2, arg1, arg7);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIILclient!wc;ILclient!wc;III)V")
	public final void method7998(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub5_Sub21 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class8_Sub5_Sub21 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1) {
			return;
		}
		this.method8000();
		if (!this.NA()) {
			this.method8011();
			return;
		}
		@Pc(26) Class222 local26 = arg5.aClass222Array1[arg2];
		@Pc(29) Class8_Sub22 local29 = local26.aClass8_Sub22_1;
		@Pc(31) Class222 local31 = null;
		if (arg3 != null) {
			local31 = arg3.aClass222Array1[arg1];
			if (local29 != local31.aClass8_Sub22_1) {
				local31 = null;
			}
		}
		this.method8006(local31, arg4, arg7, 65535, arg6, null, local29, arg0, local26, null, false);
		this.wa();
		this.method8011();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dfa;)V")
	public abstract void method7999(@OriginalArg(0) Class54 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	protected abstract void method8000();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBILclient!s;IIII)V")
	protected final void method8001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class86 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg4 / 2;
		@Pc(21) int local21 = -arg5 / 2;
		@Pc(32) int local32 = arg3.method8088(local21 + arg1, arg0 - -local16);
		@Pc(36) int local36 = arg4 / 2;
		@Pc(41) int local41 = -arg5 / 2;
		@Pc(52) int local52 = arg3.method8088(arg1 + local41, arg0 - -local36);
		@Pc(57) int local57 = -arg4 / 2;
		@Pc(61) int local61 = arg5 / 2;
		@Pc(71) int local71 = arg3.method8088(local61 + arg1, local57 + arg0);
		@Pc(75) int local75 = arg4 / 2;
		@Pc(79) int local79 = arg5 / 2;
		@Pc(90) int local90 = arg3.method8088(arg1 + local79, local75 + arg0);
		@Pc(101) int local101 = local52 > local32 ? local32 : local52;
		@Pc(108) int local108 = local71 < local90 ? local71 : local90;
		@Pc(115) int local115 = local52 < local90 ? local52 : local90;
		@Pc(130) int local130 = local32 >= local71 ? local71 : local32;
		@Pc(164) int local164;
		if (arg5 != 0) {
			@Pc(148) int local148 = (int) (Math.atan2((double) (local101 - local108), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local148 != 0) {
				if (arg6 != 0) {
					if (local148 > 8192) {
						local164 = 16384 - arg6;
						if (local148 < local164) {
							local148 = local164;
						}
					} else if (local148 > arg6) {
						local148 = arg6;
					}
				}
				this.FA(local148);
			}
		}
		@Pc(191) int local191 = local90 + local32;
		if (arg4 != 0) {
			@Pc(209) int local209 = (int) (Math.atan2((double) (local130 - local115), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local209 != 0) {
				if (arg2 != 0) {
					if (local209 > 8192) {
						local164 = 16384 - arg2;
						if (local164 > local209) {
							local209 = local164;
						}
					} else if (arg2 < local209) {
						local209 = arg2;
					}
				}
				this.VA(local209);
			}
		}
		if (local71 + local52 < local191) {
			local191 = local71 + local52;
		}
		local191 = (local191 >> 1) - arg7;
		if (local191 != 0) {
			this.H(0, local191, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	public abstract void method8002();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dfa;Lclient!im;I)V")
	public abstract void method8003(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!oia;")
	public abstract Class238[] method8005();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!nfa;IIII[IBLclient!fda;ZLclient!nfa;[ZZ)V")
	private void method8006(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) Class8_Sub22 arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) Class222 arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) boolean arg10) {
		@Pc(14) int local14;
		if (arg0 == null || arg4 == 0) {
			for (local14 = 0; local14 < arg8.anInt6931; local14++) {
				@Pc(21) short local21 = arg8.aShortArray97[local14];
				if (arg9 == null || arg10 == arg9[local21] || arg6.anIntArray190[local21] == 0) {
					@Pc(45) short local45 = arg8.aShortArray95[local14];
					if (local45 != -1) {
						this.method7997(arg6.anIntArrayArray15[local45], arg3 & arg6.anIntArray189[local45], arg7, 0, 0, arg2, 0, arg5, 0);
					}
					this.method7997(arg6.anIntArrayArray15[local21], arg6.anIntArray189[local21] & arg3, arg7, arg8.aShortArray90[local14], arg8.aShortArray89[local14], arg2, arg8.aShortArray92[local14], arg5, arg6.anIntArray190[local21]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(115) int local115 = 0;
		for (@Pc(117) int local117 = 0; local117 < arg6.anInt3691; local117++) {
			@Pc(127) boolean local127 = false;
			if (arg8.anInt6931 > local14 && arg8.aShortArray97[local14] == local117) {
				local127 = true;
			}
			@Pc(145) boolean local145 = false;
			if (arg0.anInt6931 > local115 && local117 == arg0.aShortArray97[local115]) {
				local145 = true;
			}
			if (local127 || local145) {
				if (arg9 == null || arg10 == arg9[local117] || arg6.anIntArray190[local117] == 0) {
					@Pc(191) short local191 = 0;
					@Pc(196) int local196 = arg6.anIntArray190[local117];
					if (local196 == 3 || local196 == 10) {
						local191 = 128;
					}
					@Pc(216) short local216;
					@Pc(214) short local214;
					@Pc(212) short local212;
					@Pc(218) short local218;
					@Pc(210) byte local210;
					if (local127) {
						local218 = arg8.aShortArray95[local14];
						local212 = arg8.aShortArray89[local14];
						local214 = arg8.aShortArray90[local14];
						local210 = arg8.aByteArray52[local14];
						local216 = arg8.aShortArray92[local14];
						local14++;
					} else {
						local210 = 0;
						local212 = local191;
						local214 = local191;
						local216 = local191;
						local218 = -1;
					}
					@Pc(273) short local273;
					@Pc(253) short local253;
					@Pc(258) short local258;
					@Pc(268) short local268;
					@Pc(263) byte local263;
					if (local145) {
						local253 = arg0.aShortArray90[local115];
						local258 = arg0.aShortArray89[local115];
						local263 = arg0.aByteArray52[local115];
						local268 = arg0.aShortArray95[local115];
						local273 = arg0.aShortArray92[local115];
						local115++;
					} else {
						local268 = -1;
						local253 = local191;
						local263 = 0;
						local273 = local191;
						local258 = local191;
					}
					@Pc(326) int local326;
					@Pc(330) int local330;
					@Pc(329) int local329;
					if ((local210 & 0x2) == 0 && (local263 & 0x1) == 0) {
						@Pc(312) int local312;
						if (local196 == 2) {
							local312 = local273 - local216 & 0x3FFF;
							@Pc(425) int local425 = local253 - local214 & 0x3FFF;
							if (local425 >= 8192) {
								local425 -= 16384;
							}
							if (local312 >= 8192) {
								local312 -= 16384;
							}
							@Pc(442) int local442 = local258 - local212 & 0x3FFF;
							local326 = local216 + local312 * arg4 / arg1 & 0x3FFF;
							local330 = local214 + local425 * arg4 / arg1 & 0x3FFF;
							if (local442 >= 8192) {
								local442 -= 16384;
							}
							local329 = arg4 * local442 / arg1 + local212 & 0x3FFF;
						} else if (local196 == 9) {
							local312 = local273 - local216 & 0x3FFF;
							if (local312 >= 8192) {
								local312 -= 16384;
							}
							local326 = arg4 * local312 / arg1 + local216 & 0x3FFF;
							local329 = 0;
							local330 = 0;
						} else if (local196 == 7) {
							local312 = local273 - local216 & 0x3F;
							if (local312 >= 32) {
								local312 -= 64;
							}
							local329 = (local258 - local212) * arg4 / arg1 + local212;
							local330 = arg4 * (local253 - local214) / arg1 + local214;
							local326 = local312 * arg4 / arg1 + local216 & 0x3F;
						} else {
							local329 = (local258 - local212) * arg4 / arg1 + local212;
							local330 = (local253 - local214) * arg4 / arg1 + local214;
							local326 = arg4 * (local273 - local216) / arg1 + local216;
						}
					} else {
						local329 = local212;
						local330 = local214;
						local326 = local216;
					}
					if (local218 != -1) {
						this.method7997(arg6.anIntArrayArray15[local218], arg6.anIntArray189[local218] & arg3, arg7, 0, 0, arg2, 0, arg5, 0);
					} else if (local268 != -1) {
						this.method7997(arg6.anIntArrayArray15[local268], arg3 & arg6.anIntArray189[local268], arg7, 0, 0, arg2, 0, arg5, 0);
					}
					this.method7997(arg6.anIntArrayArray15[local117], arg6.anIntArray189[local117] & arg3, arg7, local330, local329, arg2, local326, arg5, local196);
				} else {
					if (local127) {
						local14++;
					}
					if (local145) {
						local115++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!dfa;ZI)Z")
	public abstract boolean method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dfa;Lclient!im;II)V")
	public abstract void method8009(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!nda;")
	public abstract Class219[] method8010();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method8011();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()Z")
	public abstract boolean method8012();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIBILclient!wc;IIIILclient!wc;[I)V")
	public final void method8013(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class8_Sub5_Sub21 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class8_Sub5_Sub21 arg7, @OriginalArg(10) int[] arg8) {
		if (arg3 == -1) {
			return;
		}
		this.method8000();
		if (!this.NA()) {
			this.method8011();
			return;
		}
		@Pc(20) Class222 local20 = arg7.aClass222Array1[arg3];
		@Pc(23) Class8_Sub22 local23 = local20.aClass8_Sub22_1;
		@Pc(25) Class222 local25 = null;
		if (arg2 != null) {
			local25 = arg2.aClass222Array1[arg4];
			if (local23 != local25.aClass8_Sub22_1) {
				local25 = null;
			}
		}
		this.method8006(local25, arg5, 0, arg6, arg1, arg8, local23, arg0, local20, null, false);
		this.wa();
		this.method8011();
	}

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method8014(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!wc;)V")
	public final void method8015(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub5_Sub21 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method8000();
		if (!this.NA()) {
			this.method8011();
			return;
		}
		@Pc(27) Class222 local27 = arg1.aClass222Array1[arg0];
		@Pc(30) Class8_Sub22 local30 = local27.aClass8_Sub22_1;
		for (@Pc(32) int local32 = 0; local32 < local27.anInt6931; local32++) {
			@Pc(39) short local39 = local27.aShortArray97[local32];
			if (local30.aBooleanArray7[local39]) {
				if (local27.aShortArray95[local32] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local30.anIntArray190[local39], local27.aShortArray92[local32], local27.aShortArray90[local32], local27.aShortArray89[local32]);
			}
		}
		this.wa();
		this.method8011();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLclient!wc;ILclient!wc;ILclient!wc;ILclient!wc;III[ZII)V")
	public final void method8016(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8_Sub5_Sub21 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub5_Sub21 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub5_Sub21 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class8_Sub5_Sub21 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg0 == -1) {
			return;
		}
		if (arg11 == null || arg12 == -1) {
			this.method7998(arg1, arg9, arg0, arg6, arg10, arg8, arg13, 0);
			return;
		}
		this.method8000();
		if (!this.NA()) {
			this.method8011();
			return;
		}
		@Pc(38) Class222 local38 = arg8.aClass222Array1[arg0];
		@Pc(41) Class8_Sub22 local41 = local38.aClass8_Sub22_1;
		@Pc(43) Class222 local43 = null;
		if (arg6 != null) {
			local43 = arg6.aClass222Array1[arg9];
			if (local41 != local43.aClass8_Sub22_1) {
				local43 = null;
			}
		}
		this.method8006(local43, arg10, 0, 65535, arg13, null, local41, arg1, local38, arg11, false);
		@Pc(75) Class222 local75 = arg4.aClass222Array1[arg12];
		@Pc(77) Class222 local77 = null;
		if (arg2 != null) {
			local77 = arg2.aClass222Array1[arg5];
			if (local77.aClass8_Sub22_1 != local41) {
				local77 = null;
			}
		}
		this.method8014(0, new int[0], 0, 0, 0, 0, arg1);
		this.method8006(local77, arg7, 0, 65535, arg3, null, local75.aClass8_Sub22_1, arg1, local75, arg11, true);
		this.wa();
		this.method8011();
	}

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);
}
