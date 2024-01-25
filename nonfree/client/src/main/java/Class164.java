import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class164 {

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Z")
	protected boolean aBoolean778 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class164() {
	}

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!qq;ZII)Z")
	public abstract boolean method9069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!hja;")
	public abstract Class161[] method9070();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class164 method9072(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qq;Lclient!ng;I)V")
	public abstract void method9073(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class8_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kl;ZIILclient!kl;Lclient!kl;I[ZLclient!kl;IIIIII)V")
	public final void method9074(@OriginalArg(0) Class5_Sub5_Sub15 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub5_Sub15 arg4, @OriginalArg(5) Class5_Sub5_Sub15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) Class5_Sub5_Sub15 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg12 == -1) {
			return;
		}
		if (arg7 == null || arg13 == -1) {
			this.method9094(arg9, arg0, arg10, arg4, arg1, arg12, arg11, 0);
			return;
		}
		this.method9079();
		if (!this.NA()) {
			this.method9088();
			return;
		}
		@Pc(43) Class294 local43 = arg4.aClass294Array1[arg12];
		@Pc(46) Class5_Sub39 local46 = local43.aClass5_Sub39_1;
		@Pc(48) Class294 local48 = null;
		if (arg0 != null) {
			local48 = arg0.aClass294Array1[arg10];
			if (local46 != local48.aClass5_Sub39_1) {
				local48 = null;
			}
		}
		this.method9078(arg11, local48, false, arg7, local46, 0, local43, arg9, arg1, (int[]) null, 65535);
		@Pc(80) Class294 local80 = arg5.aClass294Array1[arg13];
		@Pc(82) Class294 local82 = null;
		if (arg8 != null) {
			local82 = arg8.aClass294Array1[arg2];
			if (local46 != local82.aClass5_Sub39_1) {
				local82 = null;
			}
		}
		this.method9076(0, new int[0], 0, 0, 0, 0, arg1);
		this.method9078(arg6, local82, true, arg7, local80.aClass5_Sub39_1, 0, local80, arg3, arg1, (int[]) null, 65535);
		this.wa();
		this.method9088();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLclient!kl;)V")
	public final void method9075(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub5_Sub15 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method9079();
		if (!this.NA()) {
			this.method9088();
			return;
		}
		@Pc(31) Class294 local31 = arg1.aClass294Array1[arg0];
		@Pc(34) Class5_Sub39 local34 = local31.aClass5_Sub39_1;
		for (@Pc(36) int local36 = 0; local36 < local31.anInt8153; local36++) {
			@Pc(43) short local43 = local31.aShortArray106[local36];
			if (local34.aBooleanArray18[local43]) {
				if (local31.aShortArray104[local36] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local34.anIntArray463[local43], local31.aShortArray105[local36], local31.aShortArray103[local36], local31.aShortArray111[local36]);
			}
		}
		this.wa();
		this.method9088();
	}

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method9076(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!qk;Z[ZLclient!pfa;ZILclient!qk;IZ[II)V")
	private void method9078(@OriginalArg(0) int arg0, @OriginalArg(1) Class294 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) Class5_Sub39 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class294 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (arg1 == null || arg0 == 0) {
			for (local13 = 0; local13 < arg6.anInt8153; local13++) {
				@Pc(20) short local20 = arg6.aShortArray106[local13];
				if (arg3 == null || arg2 == arg3[local20] || arg4.anIntArray463[local20] == 0) {
					@Pc(51) short local51 = arg6.aShortArray104[local13];
					if (local51 != -1) {
						this.method9085(arg4.anIntArrayArray45[local51], 0, arg5, 0, 0, arg9, arg8, arg4.anIntArray462[local51] & arg10, 0);
					}
					this.method9085(arg4.anIntArrayArray45[local20], arg4.anIntArray463[local20], arg5, arg6.aShortArray103[local13], arg6.aShortArray105[local13], arg9, arg8, arg4.anIntArray462[local20] & arg10, arg6.aShortArray111[local13]);
				}
			}
			return;
		}
		local13 = 0;
		@Pc(129) int local129 = 0;
		for (@Pc(131) int local131 = 0; local131 < arg4.anInt7685; local131++) {
			@Pc(135) boolean local135 = false;
			if (local13 < arg6.anInt8153 && arg6.aShortArray106[local13] == local131) {
				local135 = true;
			}
			@Pc(151) boolean local151 = false;
			if (arg1.anInt8153 > local129 && local131 == arg1.aShortArray106[local129]) {
				local151 = true;
			}
			if (local135 || local151) {
				if (arg3 == null || arg2 == arg3[local131] || arg4.anIntArray463[local131] == 0) {
					@Pc(210) short local210 = 0;
					@Pc(215) int local215 = arg4.anIntArray463[local131];
					if (local215 == 3 || local215 == 10) {
						local210 = 128;
					}
					@Pc(251) short local251;
					@Pc(241) short local241;
					@Pc(236) short local236;
					@Pc(246) short local246;
					@Pc(256) byte local256;
					if (local135) {
						local236 = arg6.aShortArray111[local13];
						local241 = arg6.aShortArray103[local13];
						local246 = arg6.aShortArray104[local13];
						local251 = arg6.aShortArray105[local13];
						local256 = arg6.aByteArray80[local13];
						local13++;
					} else {
						local241 = local210;
						local236 = local210;
						local246 = -1;
						local256 = 0;
						local251 = local210;
					}
					@Pc(286) short local286;
					@Pc(291) short local291;
					@Pc(276) short local276;
					@Pc(281) short local281;
					@Pc(296) byte local296;
					if (local151) {
						local276 = arg1.aShortArray111[local129];
						local281 = arg1.aShortArray104[local129];
						local286 = arg1.aShortArray105[local129];
						local291 = arg1.aShortArray103[local129];
						local296 = arg1.aByteArray80[local129];
						local129++;
					} else {
						local286 = local210;
						local291 = local210;
						local276 = local210;
						local281 = -1;
						local296 = 0;
					}
					if (local246 != -1) {
						this.method9085(arg4.anIntArrayArray45[local246], 0, arg5, 0, 0, arg9, arg8, arg4.anIntArray462[local246] & arg10, 0);
					} else if (local281 != -1) {
						this.method9085(arg4.anIntArrayArray45[local281], 0, arg5, 0, 0, arg9, arg8, arg10 & arg4.anIntArray462[local281], 0);
					}
					@Pc(380) int local380;
					@Pc(376) int local376;
					@Pc(378) int local378;
					if ((local256 & 0x2) == 0 && (local296 & 0x1) == 0) {
						@Pc(443) int local443;
						if (local215 == 2) {
							local443 = local286 - local251 & 0x3FFF;
							@Pc(525) int local525 = local291 - local241 & 0x3FFF;
							if (local443 >= 8192) {
								local443 -= 16384;
							}
							@Pc(539) int local539 = local276 - local236 & 0x3FFF;
							if (local525 >= 8192) {
								local525 -= 16384;
							}
							local380 = arg0 * local443 / arg7 + local251 & 0x3FFF;
							if (local539 >= 8192) {
								local539 -= 16384;
							}
							local376 = local241 + arg0 * local525 / arg7 & 0x3FFF;
							local378 = local236 + local539 * arg0 / arg7 & 0x3FFF;
						} else if (local215 == 9) {
							local443 = local286 - local251 & 0x3FFF;
							if (local443 >= 8192) {
								local443 -= 16384;
							}
							local378 = 0;
							local376 = 0;
							local380 = local251 + local443 * arg0 / arg7 & 0x3FFF;
						} else if (local215 == 7) {
							local443 = local286 - local251 & 0x3F;
							if (local443 >= 32) {
								local443 -= 64;
							}
							local380 = local443 * arg0 / arg7 + local251 & 0x3F;
							local376 = (local291 - local241) * arg0 / arg7 + local241;
							local378 = local236 + (local276 - local236) * arg0 / arg7;
						} else {
							local380 = arg0 * (local286 - local251) / arg7 + local251;
							local378 = arg0 * (local276 - local236) / arg7 + local236;
							local376 = arg0 * (local291 - local241) / arg7 + local241;
						}
					} else {
						local376 = local241;
						local378 = local236;
						local380 = local251;
					}
					this.method9085(arg4.anIntArrayArray45[local131], local215, arg5, local376, local380, arg9, arg8, arg10 & arg4.anIntArray462[local131], local378);
				} else {
					if (local151) {
						local129++;
					}
					if (local135) {
						local13++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method9079();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IIIZILclient!kl;ILclient!kl;I)V")
	public final void method9080(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5_Sub5_Sub15 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class5_Sub5_Sub15 arg8) {
		if (arg5 == -1) {
			return;
		}
		this.method9079();
		if (!this.NA()) {
			this.method9088();
			return;
		}
		@Pc(31) Class294 local31 = arg8.aClass294Array1[arg5];
		@Pc(34) Class5_Sub39 local34 = local31.aClass5_Sub39_1;
		@Pc(36) Class294 local36 = null;
		if (arg6 != null) {
			local36 = arg6.aClass294Array1[arg2];
			if (local34 != local36.aClass5_Sub39_1) {
				local36 = null;
			}
		}
		this.method9078(arg7, local36, false, (boolean[]) null, local34, 0, local31, arg0, arg4, arg1, arg3);
		this.wa();
		this.method9088();
	}

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!jk;")
	public abstract Class189[] method9081();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method9082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()Z")
	public abstract boolean method9083();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qq;IZ)V")
	public abstract void method9084(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIII[IZZII)V")
	private void method9085(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(48) int local48;
		if (arg2 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local48 = -arg4;
				arg4 = arg8;
				arg8 = local48;
			} else if (arg1 == 3) {
				local48 = arg4;
				arg4 = arg8;
				arg8 = local48;
			} else if (arg1 == 2) {
				local48 = arg4;
				arg4 = -arg8 & 0x3FFF;
				arg8 = local48 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg4 = -arg4;
				arg8 = -arg8;
			} else if (arg1 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local48 = arg4;
				arg4 = -arg8;
				arg8 = local48;
			} else if (arg1 == 3) {
				local48 = arg4;
				arg4 = arg8;
				arg8 = local48;
			} else if (arg1 == 2) {
				local48 = arg4;
				arg4 = arg8 & 0x3FFF;
				arg8 = -local48 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method9076(arg1, arg0, arg4, arg3, arg8, arg2, arg6);
		} else {
			this.I(arg1, arg0, arg4, arg3, arg8, arg6, arg7, arg5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method9086(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIIIIILclient!s;I)V")
	protected final void method9087(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6, @OriginalArg(8) int arg7) {
		@Pc(23) int local23 = -arg5 / 2;
		@Pc(28) int local28 = -arg0 / 2;
		@Pc(38) int local38 = arg6.method8032(local23 + arg7, local28 + arg3);
		@Pc(42) int local42 = arg5 / 2;
		@Pc(47) int local47 = -arg0 / 2;
		@Pc(58) int local58 = arg6.method8032(arg7 + local42, arg3 + local47);
		@Pc(63) int local63 = -arg5 / 2;
		@Pc(67) int local67 = arg0 / 2;
		@Pc(77) int local77 = arg6.method8032(local63 + arg7, local67 + arg3);
		@Pc(81) int local81 = arg5 / 2;
		@Pc(85) int local85 = arg0 / 2;
		@Pc(95) int local95 = arg6.method8032(local81 + arg7, local85 + arg3);
		@Pc(103) int local103 = local58 > local38 ? local38 : local58;
		@Pc(111) int local111 = local77 < local95 ? local77 : local95;
		@Pc(123) int local123 = local95 <= local58 ? local95 : local58;
		@Pc(160) int local160;
		if (arg0 != 0) {
			@Pc(142) int local142 = (int) (Math.atan2((double) (local103 - local111), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local142 != 0) {
				if (arg1 != 0) {
					if (local142 > 8192) {
						local160 = 16384 - arg1;
						if (local160 > local142) {
							local142 = local160;
						}
					} else if (arg1 < local142) {
						local142 = arg1;
					}
				}
				this.FA(local142);
			}
		}
		@Pc(189) int local189 = local77 > local38 ? local38 : local77;
		if (arg5 != 0) {
			@Pc(208) int local208 = (int) (Math.atan2((double) (local189 - local123), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local208 != 0) {
				if (arg2 != 0) {
					if (local208 > 8192) {
						local160 = 16384 - arg2;
						if (local208 < local160) {
							local208 = local160;
						}
					} else if (arg2 < local208) {
						local208 = arg2;
					}
				}
				this.VA(local208);
			}
		}
		@Pc(261) int local261 = local38 + local95;
		if (local261 > local58 + local77) {
			local261 = local77 + local58;
		}
		local261 = (local261 >> 1) - arg4;
		if (local261 != 0) {
			this.H(0, local261, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	protected abstract void method9088();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qq;)V")
	public abstract void method9090(@OriginalArg(0) Class203 arg0);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	public abstract void method9091();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qq;Lclient!ng;II)V")
	public abstract void method9092(@OriginalArg(0) Class203 arg0, @OriginalArg(1) Class8_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class5_Sub5_Sub4 ba(@OriginalArg(0) Class5_Sub5_Sub4 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!qq;ZI)Z")
	public abstract boolean method9093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!kl;ILclient!kl;ZIIII)V")
	public final void method9094(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub5_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub5_Sub15 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 == -1) {
			return;
		}
		this.method9079();
		if (!this.NA()) {
			this.method9088();
			return;
		}
		@Pc(22) Class294 local22 = arg3.aClass294Array1[arg5];
		@Pc(25) Class5_Sub39 local25 = local22.aClass5_Sub39_1;
		@Pc(27) Class294 local27 = null;
		if (arg1 != null) {
			local27 = arg1.aClass294Array1[arg2];
			if (local27.aClass5_Sub39_1 != local25) {
				local27 = null;
			}
		}
		this.method9078(arg6, local27, false, (boolean[]) null, local25, arg7, local22, arg0, arg4, (int[]) null, 65535);
		this.wa();
		this.method9088();
	}
}
