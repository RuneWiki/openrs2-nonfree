import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class92 {

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Z")
	protected boolean aBoolean673 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class92() {
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!fk;")
	public abstract Class103[] method7048();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!jea;Lclient!jea;[ZIIILclient!jea;IIZLclient!jea;II)V")
	public final void method7049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub5_Sub18 arg2, @OriginalArg(3) Class6_Sub5_Sub18 arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class6_Sub5_Sub18 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) Class6_Sub5_Sub18 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg6 == -1) {
			this.method7066(arg9, arg2, arg1, arg3, arg10, 0, arg0, arg13);
			return;
		}
		this.method7070();
		if (!this.NA()) {
			this.method7055();
			return;
		}
		@Pc(39) Class13 local39 = arg2.aClass13Array1[arg1];
		@Pc(42) Class6_Sub2 local42 = local39.aClass6_Sub2_1;
		@Pc(44) Class13 local44 = null;
		if (arg3 != null) {
			local44 = arg3.aClass13Array1[arg13];
			if (local42 != local44.aClass6_Sub2_1) {
				local44 = null;
			}
		}
		this.method7058(local39, local42, false, local44, (int[]) null, arg4, arg10, arg9, 65535, 0, arg0);
		@Pc(81) Class13 local81 = arg7.aClass13Array1[arg6];
		@Pc(83) Class13 local83 = null;
		if (arg11 != null) {
			local83 = arg11.aClass13Array1[arg8];
			if (local83.aClass6_Sub2_1 != local42) {
				local83 = null;
			}
		}
		this.method7072(0, new int[0], 0, 0, 0, 0, arg10);
		this.method7058(local81, local81.aClass6_Sub2_1, true, local83, (int[]) null, arg4, arg10, arg12, 65535, 0, arg5);
		this.wa();
		this.method7055();
	}

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lclient!cia;")
	public abstract Class49[] method7050();

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class6_Sub5_Sub10 ba(@OriginalArg(0) Class6_Sub5_Sub10 arg0);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!jea;IILclient!jea;ZI[III)V")
	public final void method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub5_Sub18 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub5_Sub18 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(10) int arg8) {
		if (arg0 == -1) {
			return;
		}
		this.method7070();
		if (!this.NA()) {
			this.method7055();
			return;
		}
		@Pc(25) Class13 local25 = arg4.aClass13Array1[arg0];
		@Pc(28) Class6_Sub2 local28 = local25.aClass6_Sub2_1;
		@Pc(30) Class13 local30 = null;
		if (arg2 != null) {
			local30 = arg2.aClass13Array1[arg6];
			if (local28 != local30.aClass6_Sub2_1) {
				local30 = null;
			}
		}
		this.method7058(local25, local28, false, local30, arg7, (boolean[]) null, arg5, arg1, arg3, 0, arg8);
		this.wa();
		this.method7055();
	}

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
	public abstract boolean method7052();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!hba;Lclient!lda;I)V")
	public abstract void method7053(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class9_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	public abstract void method7054();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method7055();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!hba;Lclient!lda;II)V")
	public abstract void method7057(@OriginalArg(0) Class115 arg0, @OriginalArg(1) Class9_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ag;Lclient!ah;ZLclient!ag;[I[ZZBIIII)V")
	private void method7058(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class6_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class13 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg3 == null || arg7 == 0) {
			for (local11 = 0; local11 < arg0.anInt532; local11++) {
				@Pc(18) short local18 = arg0.aShortArray15[local11];
				if (arg5 == null || arg2 == arg5[local18] || arg1.anIntArray16[local18] == 0) {
					@Pc(35) short local35 = arg0.aShortArray14[local11];
					if (local35 != -1) {
						this.method7062(0, arg6, 0, 0, arg8 & arg1.anIntArray17[local35], arg9, 0, arg1.anIntArrayArray2[local35], arg4);
					}
					this.method7062(arg1.anIntArray16[local18], arg6, arg0.aShortArray7[local11], arg0.aShortArray13[local11], arg8 & arg1.anIntArray17[local18], arg9, arg0.aShortArray12[local11], arg1.anIntArrayArray2[local18], arg4);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(109) int local109 = 0;
		for (@Pc(111) int local111 = 0; local111 < arg1.anInt552; local111++) {
			@Pc(115) boolean local115 = false;
			if (local11 < arg0.anInt532 && arg0.aShortArray15[local11] == local111) {
				local115 = true;
			}
			@Pc(133) boolean local133 = false;
			if (local109 < arg3.anInt532 && arg3.aShortArray15[local109] == local111) {
				local133 = true;
			}
			if (local115 || local133) {
				if (arg5 == null || arg5[local111] == arg2 || arg1.anIntArray16[local111] == 0) {
					@Pc(178) short local178 = 0;
					@Pc(183) int local183 = arg1.anIntArray16[local111];
					if (local183 == 3 || local183 == 10) {
						local178 = 128;
					}
					@Pc(220) short local220;
					@Pc(215) short local215;
					@Pc(210) short local210;
					@Pc(200) short local200;
					@Pc(205) byte local205;
					if (local115) {
						local200 = arg0.aShortArray14[local11];
						local205 = arg0.aByteArray3[local11];
						local210 = arg0.aShortArray13[local11];
						local215 = arg0.aShortArray12[local11];
						local220 = arg0.aShortArray7[local11];
						local11++;
					} else {
						local210 = local178;
						local200 = -1;
						local215 = local178;
						local205 = 0;
						local220 = local178;
					}
					@Pc(241) short local241;
					@Pc(239) short local239;
					@Pc(237) short local237;
					@Pc(243) short local243;
					@Pc(245) byte local245;
					if (local133) {
						local239 = arg3.aShortArray12[local109];
						local237 = arg3.aShortArray13[local109];
						local245 = arg3.aByteArray3[local109];
						local243 = arg3.aShortArray14[local109];
						local241 = arg3.aShortArray7[local109];
						local109++;
					} else {
						local237 = local178;
						local239 = local178;
						local241 = local178;
						local243 = -1;
						local245 = 0;
					}
					@Pc(331) int local331;
					@Pc(347) int local347;
					@Pc(357) int local357;
					if ((local205 & 0x2) == 0 && (local245 & 0x1) == 0) {
						@Pc(298) int local298;
						if (local183 == 2) {
							local298 = local241 - local220 & 0x3FFF;
							@Pc(305) int local305 = local239 - local215 & 0x3FFF;
							if (local298 >= 8192) {
								local298 -= 16384;
							}
							@Pc(315) int local315 = local237 - local210 & 0x3FFF;
							if (local305 >= 8192) {
								local305 -= 16384;
							}
							local331 = arg7 * local298 / arg10 + local220 & 0x3FFF;
							if (local315 >= 8192) {
								local315 -= 16384;
							}
							local347 = local305 * arg7 / arg10 + local215 & 0x3FFF;
							local357 = local315 * arg7 / arg10 + local210 & 0x3FFF;
						} else if (local183 == 9) {
							local298 = local241 - local220 & 0x3FFF;
							if (local298 >= 8192) {
								local298 -= 16384;
							}
							local331 = local298 * arg7 / arg10 + local220 & 0x3FFF;
							local357 = 0;
							local347 = 0;
						} else if (local183 == 7) {
							local298 = local241 - local220 & 0x3F;
							if (local298 >= 32) {
								local298 -= 64;
							}
							local331 = local220 + arg7 * local298 / arg10 & 0x3F;
							local357 = local210 + (local237 - local210) * arg7 / arg10;
							local347 = (local239 - local215) * arg7 / arg10 + local215;
						} else {
							local347 = arg7 * (local239 - local215) / arg10 + local215;
							local331 = local220 + (local241 - local220) * arg7 / arg10;
							local357 = (local237 - local210) * arg7 / arg10 + local210;
						}
					} else {
						local347 = local215;
						local357 = local210;
						local331 = local220;
					}
					if (local200 != -1) {
						this.method7062(0, arg6, 0, 0, arg1.anIntArray17[local200] & arg8, arg9, 0, arg1.anIntArrayArray2[local200], arg4);
					} else if (local243 != -1) {
						this.method7062(0, arg6, 0, 0, arg8 & arg1.anIntArray17[local243], arg9, 0, arg1.anIntArrayArray2[local243], arg4);
					}
					this.method7062(local183, arg6, local331, local357, arg1.anIntArray17[local111] & arg8, arg9, local347, arg1.anIntArrayArray2[local111], arg4);
				} else {
					if (local133) {
						local109++;
					}
					if (local115) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!hba;IZ)V")
	public abstract void method7059(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method7060(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!hba;ZII)Z")
	public abstract boolean method7061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIIIBII[I[I)V")
	private void method7062(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8) {
		@Pc(21) int local21;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local21 = -arg2;
				arg2 = arg3;
				arg3 = local21;
			} else if (arg0 == 3) {
				local21 = arg2;
				arg2 = arg3;
				arg3 = local21;
			} else if (arg0 == 2) {
				local21 = arg2;
				arg2 = -arg3 & 0x3FFF;
				arg3 = local21 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg3 = -arg3;
				arg2 = -arg2;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local21 = arg2;
				arg2 = -arg3;
				arg3 = local21;
			} else if (arg0 == 3) {
				local21 = arg2;
				arg2 = arg3;
				arg3 = local21;
			} else if (arg0 == 2) {
				local21 = arg2;
				arg2 = arg3 & 0x3FFF;
				arg3 = -local21 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.method7072(arg0, arg7, arg2, arg6, arg3, arg5, arg1);
		} else {
			this.I(arg0, arg7, arg2, arg6, arg3, arg1, arg4, arg8);
		}
	}

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!s;IIIIII)V")
	protected final void method7064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg0 / 2;
		@Pc(32) int local32 = arg2.method7580(arg4 + local16, arg5 + local21);
		@Pc(36) int local36 = arg1 / 2;
		@Pc(41) int local41 = -arg0 / 2;
		@Pc(51) int local51 = arg2.method7580(local36 + arg4, local41 + arg5);
		@Pc(56) int local56 = -arg1 / 2;
		@Pc(60) int local60 = arg0 / 2;
		@Pc(70) int local70 = arg2.method7580(local56 + arg4, local60 + arg5);
		@Pc(74) int local74 = arg1 / 2;
		@Pc(78) int local78 = arg0 / 2;
		@Pc(88) int local88 = arg2.method7580(arg4 + local74, local78 + arg5);
		@Pc(99) int local99 = local51 <= local32 ? local51 : local32;
		@Pc(106) int local106 = local88 > local70 ? local70 : local88;
		@Pc(113) int local113 = local88 <= local51 ? local88 : local51;
		@Pc(149) int local149;
		if (arg0 != 0) {
			@Pc(132) int local132 = (int) (Math.atan2((double) (local99 - local106), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local132 != 0) {
				if (arg6 != 0) {
					if (local132 > 8192) {
						local149 = 16384 - arg6;
						if (local149 > local132) {
							local132 = local149;
						}
					} else if (local132 > arg6) {
						local132 = arg6;
					}
				}
				this.FA(local132);
			}
		}
		@Pc(179) int local179 = local32 >= local70 ? local70 : local32;
		if (arg1 != 0) {
			@Pc(195) int local195 = (int) (Math.atan2((double) (local179 - local113), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local195 != 0) {
				if (arg7 != 0) {
					if (local195 > 8192) {
						local149 = 16384 - arg7;
						if (local195 < local149) {
							local195 = local149;
						}
					} else if (arg7 < local195) {
						local195 = arg7;
					}
				}
				this.VA(local195);
			}
		}
		@Pc(240) int local240 = local32 + local88;
		if (local51 + local70 < local240) {
			local240 = local51 + local70;
		}
		local240 = (local240 >> 1) - arg3;
		if (local240 != 0) {
			this.H(0, local240, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method7065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!jea;ILclient!jea;ZIIII)V")
	public final void method7066(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub5_Sub18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub5_Sub18 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1) {
			return;
		}
		this.method7070();
		if (!this.NA()) {
			this.method7055();
			return;
		}
		@Pc(20) Class13 local20 = arg1.aClass13Array1[arg2];
		@Pc(31) Class6_Sub2 local31 = local20.aClass6_Sub2_1;
		@Pc(33) Class13 local33 = null;
		if (arg3 != null) {
			local33 = arg3.aClass13Array1[arg7];
			if (local31 != local33.aClass6_Sub2_1) {
				local33 = null;
			}
		}
		this.method7058(local20, local31, false, local33, (int[]) null, (boolean[]) null, arg4, arg0, 65535, arg5, arg6);
		this.wa();
		this.method7055();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!hba;ZI)Z")
	public abstract boolean method7067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!jea;II)V")
	public final void method7068(@OriginalArg(0) Class6_Sub5_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7070();
		if (!this.NA()) {
			this.method7055();
			return;
		}
		@Pc(22) Class13 local22 = arg0.aClass13Array1[arg1];
		@Pc(25) Class6_Sub2 local25 = local22.aClass6_Sub2_1;
		for (@Pc(27) int local27 = 0; local27 < local22.anInt532; local27++) {
			@Pc(34) short local34 = local22.aShortArray15[local27];
			if (local25.aBooleanArray1[local34]) {
				if (local22.aShortArray14[local27] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local25.anIntArray16[local34], local22.aShortArray7[local27], local22.aShortArray12[local27], local22.aShortArray13[local27]);
			}
		}
		this.wa();
		this.method7055();
	}

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) Class245 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class92 method7069(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
	protected abstract void method7070();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!hba;)V")
	public abstract void method7071(@OriginalArg(0) Class115 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7072(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();
}
