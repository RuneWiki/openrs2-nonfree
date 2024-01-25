import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public abstract class Class17 {

	static {
		new Class158("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	protected Class17() {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!tq;I)V")
	public abstract void method6189(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([IZIIII[IIII)V")
	private void method6190(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(61) int local61;
		if (arg8 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local61 = -arg2;
				arg2 = arg6;
				arg6 = local61;
			} else if (arg3 == 3) {
				local61 = arg2;
				arg2 = arg6;
				arg6 = local61;
			} else if (arg3 == 2) {
				local61 = arg2;
				arg2 = -arg6 & 0x3FFF;
				arg6 = local61 & 0x3FFF;
			}
		} else if (arg8 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg2 = -arg2;
				arg6 = -arg6;
			} else if (arg3 == 2) {
				arg6 = -arg6 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg8 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local61 = arg2;
				arg2 = -arg6;
				arg6 = local61;
			} else if (arg3 == 3) {
				local61 = arg2;
				arg2 = arg6;
				arg6 = local61;
			} else if (arg3 == 2) {
				local61 = arg2;
				arg2 = arg6 & 0x3FFF;
				arg6 = -local61 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.va(arg3, arg5, arg2, arg7, arg6, arg8, arg1);
		} else {
			this.aa(arg3, arg5, arg2, arg7, arg6, arg1, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
	protected abstract void KA();

	@OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III[ZIIILclient!dl;ILclient!dl;IZILclient!dl;Lclient!dl;)V")
	public final void method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class1_Sub1_Sub8 arg7, @OriginalArg(9) Class1_Sub1_Sub8 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1_Sub1_Sub8 arg12, @OriginalArg(14) Class1_Sub1_Sub8 arg13) {
		if (arg6 == -1) {
			return;
		}
		if (arg3 == null || arg0 == -1) {
			this.method6194(arg12, arg9, arg6, arg4, arg10, arg8, 0, arg1);
		} else if (this.h()) {
			@Pc(35) Class202 local35 = arg12.aClass202Array1[arg6];
			@Pc(38) Class1_Sub2 local38 = local35.aClass1_Sub2_1;
			@Pc(40) Class202 local40 = null;
			if (arg8 != null) {
				local40 = arg8.aClass202Array1[arg4];
				if (local38 != local40.aClass1_Sub2_1) {
					local40 = null;
				}
			}
			this.method6204(arg9, null, arg10, false, local38, arg1, 0, local35, 65535, local40, arg3);
			@Pc(72) Class202 local72 = arg13.aClass202Array1[arg0];
			@Pc(74) Class202 local74 = null;
			if (arg7 != null) {
				local74 = arg7.aClass202Array1[arg2];
				if (local74.aClass1_Sub2_1 != local38) {
					local74 = null;
				}
			}
			this.va(0, new int[0], 0, 0, 0, 0, arg10);
			this.method6204(arg5, null, arg10, true, local72.aClass1_Sub2_1, arg11, 0, local72, 65535, local74, arg3);
			this.KA();
		}
	}

	@OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III[ILclient!dl;ZLclient!dl;IIII)V")
	public final void method6192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub1_Sub8 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class1_Sub1_Sub8 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		if (arg1 == -1 || !this.h()) {
			return;
		}
		@Pc(21) Class202 local21 = arg5.aClass202Array1[arg1];
		@Pc(24) Class1_Sub2 local24 = local21.aClass1_Sub2_1;
		@Pc(26) Class202 local26 = null;
		if (arg3 != null) {
			local26 = arg3.aClass202Array1[arg8];
			if (local24 != local26.aClass1_Sub2_1) {
				local26 = null;
			}
		}
		this.method6204(arg0, arg2, arg4, false, local24, arg6, 0, local21, arg7, local26, null);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
	public abstract int B();

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
	public abstract int Z();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!dl;IIIZLclient!dl;III)V")
	public final void method6194(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1_Sub1_Sub8 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1 || !this.h()) {
			return;
		}
		@Pc(18) Class202 local18 = arg0.aClass202Array1[arg2];
		@Pc(21) Class1_Sub2 local21 = local18.aClass1_Sub2_1;
		@Pc(23) Class202 local23 = null;
		if (arg5 != null) {
			local23 = arg5.aClass202Array1[arg3];
			if (local23.aClass1_Sub2_1 != local21) {
				local23 = null;
			}
		}
		this.method6204(arg1, null, arg4, false, local21, arg7, arg6, local18, 65535, local23, null);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!tq;II)V")
	public abstract void method6195(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZILclient!dl;)V")
	public final void method6196(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub8 arg1) {
		if (arg0 == -1 || !this.h()) {
			return;
		}
		@Pc(34) Class202 local34 = arg1.aClass202Array1[arg0];
		@Pc(37) Class1_Sub2 local37 = local34.aClass1_Sub2_1;
		for (@Pc(39) int local39 = 0; local39 < local34.anInt5922; local39++) {
			@Pc(46) short local46 = local34.aShortArray108[local39];
			if (local37.aBooleanArray1[local46]) {
				if (local34.aShortArray104[local39] != -1) {
					this.za(0, 0, 0, 0);
				}
				this.za(local37.anIntArray7[local46], local34.aShortArray106[local39], local34.aShortArray107[local39], local34.aShortArray103[local39]);
			}
		}
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public abstract void method6197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
	public abstract void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public abstract void method6198();

	@OriginalMember(owner = "client!e", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
	public abstract int ta();

	@OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
	public abstract void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	public abstract void method6199(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()Z")
	public abstract boolean method6200();

	@OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
	public abstract void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()[Lclient!gh;")
	public abstract Class94[] method6201();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Lclient!e;")
	public abstract Class17 method6202(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
	protected abstract boolean h();

	@OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
	public abstract void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
	public abstract void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public abstract Class1_Sub1_Sub10 EA(@OriginalArg(0) Class1_Sub1_Sub10 arg0);

	@OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[IZZLclient!ae;IILclient!pr;ILclient!pr;[Z)V")
	private void method6204(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class202 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class202 arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(9) int local9;
		if (arg9 == null || arg5 == 0) {
			for (local9 = 0; local9 < arg7.anInt5922; local9++) {
				@Pc(15) short local15 = arg7.aShortArray108[local9];
				if (arg10 == null || arg3 == arg10[local15] || arg4.anIntArray7[local15] == 0) {
					@Pc(43) short local43 = arg7.aShortArray104[local9];
					if (local43 != -1) {
						this.method6190(arg1, arg2, 0, 0, arg8 & arg4.anIntArray8[local43], arg4.anIntArrayArray2[local43], 0, 0, arg6);
					}
					this.method6190(arg1, arg2, arg7.aShortArray106[local9], arg4.anIntArray7[local15], arg8 & arg4.anIntArray8[local15], arg4.anIntArrayArray2[local15], arg7.aShortArray103[local9], arg7.aShortArray107[local9], arg6);
				}
			}
			return;
		}
		local9 = 0;
		@Pc(120) int local120 = 0;
		for (@Pc(122) int local122 = 0; local122 < arg4.anInt84; local122++) {
			@Pc(125) boolean local125 = false;
			if (local9 < arg7.anInt5922 && arg7.aShortArray108[local9] == local122) {
				local125 = true;
			}
			@Pc(143) boolean local143 = false;
			if (arg9.anInt5922 > local120 && local122 == arg9.aShortArray108[local120]) {
				local143 = true;
			}
			if (local125 || local143) {
				if (arg10 == null || arg10[local122] == arg3 || arg4.anIntArray7[local122] == 0) {
					@Pc(187) short local187 = 0;
					@Pc(192) int local192 = arg4.anIntArray7[local122];
					if (local192 == 3 || local192 == 10) {
						local187 = 128;
					}
					@Pc(214) short local214;
					@Pc(212) short local212;
					@Pc(210) short local210;
					@Pc(206) short local206;
					@Pc(208) byte local208;
					if (local125) {
						local206 = arg7.aShortArray104[local9];
						local214 = arg7.aShortArray106[local9];
						local210 = arg7.aShortArray103[local9];
						local212 = arg7.aShortArray107[local9];
						local208 = arg7.aByteArray74[local9];
						local9++;
					} else {
						local206 = -1;
						local208 = 0;
						local210 = local187;
						local212 = local187;
						local214 = local187;
					}
					@Pc(253) short local253;
					@Pc(251) short local251;
					@Pc(245) short local245;
					@Pc(249) short local249;
					@Pc(247) byte local247;
					if (local143) {
						local253 = arg9.aShortArray106[local120];
						local245 = arg9.aShortArray103[local120];
						local249 = arg9.aShortArray104[local120];
						local247 = arg9.aByteArray74[local120];
						local251 = arg9.aShortArray107[local120];
						local120++;
					} else {
						local245 = local187;
						local247 = 0;
						local249 = -1;
						local251 = local187;
						local253 = local187;
					}
					@Pc(341) int local341;
					@Pc(352) int local352;
					@Pc(362) int local362;
					if ((local208 & 0x2) == 0 && (local247 & 0x1) == 0) {
						@Pc(304) int local304;
						if (local192 == 2) {
							local304 = local253 - local214 & 0x3FFF;
							@Pc(311) int local311 = local251 - local212 & 0x3FFF;
							@Pc(317) int local317 = local245 - local210 & 0x3FFF;
							if (local304 >= 8192) {
								local304 -= 16384;
							}
							if (local311 >= 8192) {
								local311 -= 16384;
							}
							if (local317 >= 8192) {
								local317 -= 16384;
							}
							local341 = local214 + arg5 * local304 / arg0 & 0x3FFF;
							local352 = local212 + arg5 * local311 / arg0 & 0x3FFF;
							local362 = local317 * arg5 / arg0 + local210 & 0x3FFF;
						} else if (local192 == 9) {
							local304 = local253 - local214 & 0x3FFF;
							if (local304 >= 8192) {
								local304 -= 16384;
							}
							local341 = local214 + arg5 * local304 / arg0 & 0x3FFF;
							local362 = 0;
							local352 = 0;
						} else if (local192 == 7) {
							local304 = local253 - local214 & 0x3F;
							if (local304 >= 32) {
								local304 -= 64;
							}
							local352 = local212 + arg5 * (local251 - local212) / arg0;
							local341 = local304 * arg5 / arg0 + local214 & 0x3F;
							local362 = local210 + (local245 - local210) * arg5 / arg0;
						} else {
							local341 = local214 + arg5 * (local253 - local214) / arg0;
							local362 = (local245 - local210) * arg5 / arg0 + local210;
							local352 = local212 + arg5 * (local251 - local212) / arg0;
						}
					} else {
						local362 = local210;
						local352 = local212;
						local341 = local214;
					}
					if (local206 != -1) {
						this.method6190(arg1, arg2, 0, 0, arg8 & arg4.anIntArray8[local206], arg4.anIntArrayArray2[local206], 0, 0, arg6);
					} else if (local249 != -1) {
						this.method6190(arg1, arg2, 0, 0, arg4.anIntArray8[local249] & arg8, arg4.anIntArrayArray2[local249], 0, 0, arg6);
					}
					this.method6190(arg1, arg2, local341, local192, arg8 & arg4.anIntArray8[local122], arg4.anIntArrayArray2[local122], local362, local352, arg6);
				} else {
					if (local125) {
						local9++;
					}
					if (local143) {
						local120++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
	public abstract void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
	public abstract int k();

	@OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()[Lclient!hv;")
	public abstract Class114[] method6205();

	@OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
	public abstract int S();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIILclient!ya;I)V")
	protected final void method6206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class96 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg0 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(30) int local30 = arg6.ca(local16 + arg5, local21 + arg1);
		@Pc(34) int local34 = arg0 / 2;
		@Pc(39) int local39 = -arg7 / 2;
		@Pc(49) int local49 = arg6.ca(arg5 + local34, arg1 - -local39);
		@Pc(54) int local54 = -arg0 / 2;
		@Pc(58) int local58 = arg7 / 2;
		@Pc(67) int local67 = arg6.ca(local54 + arg5, local58 + arg1);
		@Pc(71) int local71 = arg0 / 2;
		@Pc(75) int local75 = arg7 / 2;
		@Pc(84) int local84 = arg6.ca(arg5 + local71, local75 + arg1);
		@Pc(91) int local91 = local30 >= local49 ? local49 : local30;
		@Pc(102) int local102 = local84 <= local67 ? local84 : local67;
		@Pc(113) int local113 = local49 >= local84 ? local84 : local49;
		@Pc(144) int local144;
		if (arg7 != 0) {
			@Pc(132) int local132 = (int) (Math.atan2((double) (local91 - local102), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local132 != 0) {
				if (arg2 != 0) {
					if (local132 > 8192) {
						local144 = 16384 - arg2;
						if (local144 > local132) {
							local132 = local144;
						}
					} else if (arg2 < local132) {
						local132 = arg2;
					}
				}
				this.W(local132);
			}
		}
		@Pc(166) int local166 = local30 >= local67 ? local67 : local30;
		@Pc(170) int local170 = local84 + local30;
		if (arg0 != 0) {
			@Pc(188) int local188 = (int) (Math.atan2((double) (local166 - local113), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local188 != 0) {
				if (arg4 != 0) {
					if (local188 > 8192) {
						local144 = 16384 - arg4;
						if (local144 > local188) {
							local188 = local144;
						}
					} else if (local188 > arg4) {
						local188 = arg4;
					}
				}
				this.K(local188);
			}
		}
		if (local170 > local49 + local67) {
			local170 = local67 + local49;
		}
		local170 = (local170 >> 1) - arg3;
		if (local170 != 0) {
			this.a(0, local170, 0);
		}
	}
}
