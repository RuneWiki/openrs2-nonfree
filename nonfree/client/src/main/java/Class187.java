import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class187 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
	protected boolean aBoolean726 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class187() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!sn;")
	public abstract Class320[] method8636();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!tc;)V")
	public abstract void method8638(@OriginalArg(0) Class113 arg0);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILclient!lk;ZLclient!lk;III)V")
	public final void method8639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub5_Sub12 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5_Sub5_Sub12 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method8658();
		if (!this.NA()) {
			this.method8653();
			return;
		}
		@Pc(20) Class332 local20 = arg2.aClass332Array1[arg1];
		@Pc(31) Class5_Sub16 local31 = local20.aClass5_Sub16_1;
		@Pc(33) Class332 local33 = null;
		if (arg4 != null) {
			local33 = arg4.aClass332Array1[arg0];
			if (local33.aClass5_Sub16_1 != local31) {
				local33 = null;
			}
		}
		this.method8640(local33, local20, 65535, arg7, arg5, arg3, null, arg6, false, local31, null);
		this.wa();
		this.method8653();
	}

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class5_Sub5_Sub14 ba(@OriginalArg(0) Class5_Sub5_Sub14 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!th;BLclient!th;IIIZ[ZIZLclient!df;[I)V")
	private void method8640(@OriginalArg(0) Class332 arg0, @OriginalArg(2) Class332 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class5_Sub16 arg9, @OriginalArg(11) int[] arg10) {
		@Pc(11) int local11;
		if (arg0 == null || arg7 == 0) {
			for (local11 = 0; local11 < arg1.anInt9180; local11++) {
				@Pc(18) short local18 = arg1.aShortArray135[local11];
				if (arg6 == null || arg8 == arg6[local18] || arg9.anIntArray120[local18] == 0) {
					@Pc(39) short local39 = arg1.aShortArray137[local11];
					if (local39 != -1) {
						this.method8652(arg5, 0, arg10, 0, arg9.anIntArray119[local39] & arg2, arg4, arg9.anIntArrayArray9[local39], 0, 0);
					}
					this.method8652(arg5, arg1.aShortArray140[local11], arg10, arg1.aShortArray138[local11], arg9.anIntArray119[local18] & arg2, arg4, arg9.anIntArrayArray9[local18], arg9.anIntArray120[local18], arg1.aShortArray132[local11]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(104) int local104 = 0;
		for (@Pc(106) int local106 = 0; local106 < arg9.anInt1893; local106++) {
			@Pc(110) boolean local110 = false;
			if (local11 < arg1.anInt9180 && local106 == arg1.aShortArray135[local11]) {
				local110 = true;
			}
			@Pc(128) boolean local128 = false;
			if (local104 < arg0.anInt9180 && local106 == arg0.aShortArray135[local104]) {
				local128 = true;
			}
			if (local110 || local128) {
				if (arg6 == null || arg8 == arg6[local106] || arg9.anIntArray120[local106] == 0) {
					@Pc(174) short local174 = 0;
					@Pc(179) int local179 = arg9.anIntArray120[local106];
					if (local179 == 3 || local179 == 10) {
						local174 = 128;
					}
					@Pc(206) short local206;
					@Pc(216) short local216;
					@Pc(201) short local201;
					@Pc(196) short local196;
					@Pc(211) byte local211;
					if (local110) {
						local196 = arg1.aShortArray137[local11];
						local201 = arg1.aShortArray140[local11];
						local206 = arg1.aShortArray132[local11];
						local211 = arg1.aByteArray96[local11];
						local216 = arg1.aShortArray138[local11];
						local11++;
					} else {
						local206 = local174;
						local196 = -1;
						local201 = local174;
						local216 = local174;
						local211 = 0;
					}
					@Pc(246) short local246;
					@Pc(256) short local256;
					@Pc(251) short local251;
					@Pc(241) short local241;
					@Pc(236) byte local236;
					if (local128) {
						local236 = arg0.aByteArray96[local104];
						local241 = arg0.aShortArray137[local104];
						local246 = arg0.aShortArray132[local104];
						local251 = arg0.aShortArray140[local104];
						local256 = arg0.aShortArray138[local104];
						local104++;
					} else {
						local246 = local174;
						local256 = local174;
						local241 = -1;
						local236 = 0;
						local251 = local174;
					}
					if (local196 != -1) {
						this.method8652(arg5, 0, arg10, 0, arg2 & arg9.anIntArray119[local196], arg4, arg9.anIntArrayArray9[local196], 0, 0);
					} else if (local241 != -1) {
						this.method8652(arg5, 0, arg10, 0, arg9.anIntArray119[local241] & arg2, arg4, arg9.anIntArrayArray9[local241], 0, 0);
					}
					@Pc(329) int local329;
					@Pc(333) int local333;
					@Pc(331) int local331;
					if ((local211 & 0x2) == 0 && (local236 & 0x1) == 0) {
						@Pc(346) int local346;
						if (local179 == 2) {
							local346 = local246 - local206 & 0x3FFF;
							@Pc(353) int local353 = local256 - local216 & 0x3FFF;
							@Pc(360) int local360 = local251 - local201 & 0x3FFF;
							if (local346 >= 8192) {
								local346 -= 16384;
							}
							if (local353 >= 8192) {
								local353 -= 16384;
							}
							if (local360 >= 8192) {
								local360 -= 16384;
							}
							local329 = local346 * arg7 / arg3 + local206 & 0x3FFF;
							local333 = local216 + arg7 * local353 / arg3 & 0x3FFF;
							local331 = arg7 * local360 / arg3 + local201 & 0x3FFF;
						} else if (local179 == 9) {
							local346 = local246 - local206 & 0x3FFF;
							if (local346 >= 8192) {
								local346 -= 16384;
							}
							local329 = local346 * arg7 / arg3 + local206 & 0x3FFF;
							local331 = 0;
							local333 = 0;
						} else if (local179 == 7) {
							local346 = local246 - local206 & 0x3F;
							if (local346 >= 32) {
								local346 -= 64;
							}
							local333 = local216 + arg7 * (local256 - local216) / arg3;
							local331 = local201 + arg7 * (local251 - local201) / arg3;
							local329 = arg7 * local346 / arg3 + local206 & 0x3F;
						} else {
							local331 = local201 + arg7 * (local251 - local201) / arg3;
							local329 = (local246 - local206) * arg7 / arg3 + local206;
							local333 = (local256 - local216) * arg7 / arg3 + local216;
						}
					} else {
						local329 = local206;
						local331 = local201;
						local333 = local216;
					}
					this.method8652(arg5, local331, arg10, local333, arg9.anIntArray119[local106] & arg2, arg4, arg9.anIntArrayArray9[local106], local179, local329);
				} else {
					if (local128) {
						local104++;
					}
					if (local110) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!tc;ZII)Z")
	public abstract boolean method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!tc;ZI)Z")
	public abstract boolean method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!s;IBIIIIII)V")
	protected final void method8643(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) int local22 = -arg5 / 2;
		@Pc(27) int local27 = -arg2 / 2;
		@Pc(39) int local39 = arg0.method8584(local27 + arg6, local22 + arg4);
		@Pc(43) int local43 = arg5 / 2;
		@Pc(48) int local48 = -arg2 / 2;
		@Pc(60) int local60 = arg0.method8584(local48 + arg6, local43 + arg4);
		@Pc(65) int local65 = -arg5 / 2;
		@Pc(69) int local69 = arg2 / 2;
		@Pc(80) int local80 = arg0.method8584(arg6 + local69, arg4 + local65);
		@Pc(84) int local84 = arg5 / 2;
		@Pc(88) int local88 = arg2 / 2;
		@Pc(98) int local98 = arg0.method8584(arg6 + local88, arg4 + local84);
		@Pc(109) int local109 = local60 > local39 ? local39 : local60;
		@Pc(116) int local116 = local80 >= local98 ? local98 : local80;
		@Pc(123) int local123 = local60 >= local98 ? local98 : local60;
		@Pc(162) int local162;
		if (arg2 != 0) {
			@Pc(139) int local139 = (int) (Math.atan2((double) (local109 - local116), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local139 != 0) {
				if (arg3 != 0) {
					if (local139 > 8192) {
						local162 = 16384 - arg3;
						if (local139 < local162) {
							local139 = local162;
						}
					} else if (local139 > arg3) {
						local139 = arg3;
					}
				}
				this.FA(local139);
			}
		}
		@Pc(185) int local185 = local39 < local80 ? local39 : local80;
		if (arg5 != 0) {
			@Pc(200) int local200 = (int) (Math.atan2((double) (local185 - local123), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local200 != 0) {
				if (arg7 != 0) {
					if (local200 > 8192) {
						local162 = 16384 - arg7;
						if (local162 > local200) {
							local200 = local162;
						}
					} else if (arg7 < local200) {
						local200 = arg7;
					}
				}
				this.VA(local200);
			}
		}
		@Pc(245) int local245 = local39 + local98;
		if (local245 > local60 + local80) {
			local245 = local80 + local60;
		}
		local245 = (local245 >> 1) - arg1;
		if (local245 != 0) {
			this.H(0, local245, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIIIILclient!lk;III[ILclient!lk;)V")
	public final void method8644(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5_Sub5_Sub12 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) Class5_Sub5_Sub12 arg8) {
		if (arg5 == -1) {
			return;
		}
		this.method8658();
		if (!this.NA()) {
			this.method8653();
			return;
		}
		@Pc(22) Class332 local22 = arg4.aClass332Array1[arg5];
		@Pc(25) Class5_Sub16 local25 = local22.aClass5_Sub16_1;
		@Pc(27) Class332 local27 = null;
		if (arg8 != null) {
			local27 = arg8.aClass332Array1[arg2];
			if (local25 != local27.aClass5_Sub16_1) {
				local27 = null;
			}
		}
		this.method8640(local27, local22, arg3, arg6, 0, arg0, null, arg1, false, local25, arg7);
		this.wa();
		this.method8653();
	}

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!tc;Lclient!qw;I)V")
	public abstract void method8645(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method8646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method8647(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!lk;ZI[ZILclient!lk;ILclient!lk;BIIILclient!lk;II)V")
	public final void method8648(@OriginalArg(0) Class5_Sub5_Sub12 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub5_Sub12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5_Sub5_Sub12 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class5_Sub5_Sub12 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg3 == null || arg12 == -1) {
			this.method8639(arg8, arg2, arg11, arg1, arg0, 0, arg10, arg9);
			return;
		}
		this.method8658();
		if (!this.NA()) {
			this.method8653();
			return;
		}
		@Pc(38) Class332 local38 = arg11.aClass332Array1[arg2];
		@Pc(41) Class5_Sub16 local41 = local38.aClass5_Sub16_1;
		@Pc(51) Class332 local51 = null;
		if (arg0 != null) {
			local51 = arg0.aClass332Array1[arg8];
			if (local51.aClass5_Sub16_1 != local41) {
				local51 = null;
			}
		}
		this.method8640(local51, local38, 65535, arg9, 0, arg1, arg3, arg10, false, local41, null);
		@Pc(83) Class332 local83 = arg5.aClass332Array1[arg12];
		@Pc(85) Class332 local85 = null;
		if (arg7 != null) {
			local85 = arg7.aClass332Array1[arg4];
			if (local85.aClass5_Sub16_1 != local41) {
				local85 = null;
			}
		}
		this.method8647(0, new int[0], 0, 0, 0, 0, arg1);
		this.method8640(local85, local83, 65535, arg6, 0, arg1, arg3, arg13, true, local83.aClass5_Sub16_1, null);
		this.wa();
		this.method8653();
	}

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
	public abstract boolean method8649();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!ou;")
	public abstract Class261[] method8650();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	public abstract void method8651();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI[IIBII[III)V")
	private void method8652(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(32) int local32;
		if (arg5 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local32 = -arg8;
				arg8 = arg1;
				arg1 = local32;
			} else if (arg7 == 3) {
				local32 = arg8;
				arg8 = arg1;
				arg1 = local32;
			} else if (arg7 == 2) {
				local32 = arg8;
				arg8 = -arg1 & 0x3FFF;
				arg1 = local32 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg1 = -arg1;
				arg8 = -arg8;
			} else if (arg7 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg1 = -arg1 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local32 = arg8;
				arg8 = -arg1;
				arg1 = local32;
			} else if (arg7 == 3) {
				local32 = arg8;
				arg8 = arg1;
				arg1 = local32;
			} else if (arg7 == 2) {
				local32 = arg8;
				arg8 = arg1 & 0x3FFF;
				arg1 = -local32 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.method8647(arg7, arg6, arg8, arg3, arg1, arg5, arg0);
		} else {
			this.I(arg7, arg6, arg8, arg3, arg1, arg0, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method8653();

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!tc;Lclient!qw;II)V")
	public abstract void method8654(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!lk;IB)V")
	public final void method8655(@OriginalArg(0) Class5_Sub5_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method8658();
		if (!this.NA()) {
			this.method8653();
			return;
		}
		@Pc(35) Class332 local35 = arg0.aClass332Array1[arg1];
		@Pc(38) Class5_Sub16 local38 = local35.aClass5_Sub16_1;
		for (@Pc(40) int local40 = 0; local40 < local35.anInt9180; local40++) {
			@Pc(47) short local47 = local35.aShortArray135[local40];
			if (local38.aBooleanArray3[local47]) {
				if (local35.aShortArray137[local40] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local38.anIntArray120[local47], local35.aShortArray132[local40], local35.aShortArray138[local40], local35.aShortArray140[local40]);
			}
		}
		this.wa();
		this.method8653();
	}

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class187 method8656(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method8657(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method8658();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!tc;IZ)V")
	public abstract void method8659(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class61 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();
}
