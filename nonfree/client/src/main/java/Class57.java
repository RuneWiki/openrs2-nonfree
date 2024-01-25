import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public abstract class Class57 {

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	protected Class57() {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public abstract void method6057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!go;IIILclient!go;ZII[II)V")
	public final void method6058(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5_Sub2_Sub6 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		if (arg3 == -1 || !this.h()) {
			return;
		}
		@Pc(16) Class126 local16 = arg1.aClass126Array1[arg3];
		@Pc(19) Class5_Sub21 local19 = local16.aClass5_Sub21_1;
		@Pc(21) Class126 local21 = null;
		if (arg4 != null) {
			local21 = arg4.aClass126Array1[arg6];
			if (local19 != local21.aClass5_Sub21_1) {
				local21 = null;
			}
		}
		this.method6070(arg8, 0, arg7, arg0, arg2, null, local16, local19, arg5, local21, false);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
	public abstract int Z();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!go;ZLclient!go;IIIIBI)V")
	public final void method6059(@OriginalArg(0) Class5_Sub2_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class5_Sub2_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 == -1 || !this.h()) {
			return;
		}
		@Pc(17) Class126 local17 = arg2.aClass126Array1[arg6];
		@Pc(20) Class5_Sub21 local20 = local17.aClass5_Sub21_1;
		@Pc(30) Class126 local30 = null;
		if (arg0 != null) {
			local30 = arg0.aClass126Array1[arg5];
			if (local30.aClass5_Sub21_1 != local20) {
				local30 = null;
			}
		}
		this.method6070(null, arg7, 65535, arg3, arg4, null, local17, local20, arg1, local30, false);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!wg;I)V")
	public abstract void method6060(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class88_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
	public abstract void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[ZIILclient!go;ZILclient!go;ILclient!go;ILclient!go;II)V")
	public final void method6061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub2_Sub6 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5_Sub2_Sub6 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class5_Sub2_Sub6 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5_Sub2_Sub6 arg12, @OriginalArg(13) int arg13) {
		if (arg0 == -1) {
			return;
		}
		if (arg2 == null || arg1 == -1) {
			this.method6059(arg8, arg6, arg12, arg3, arg9, arg13, arg0, 0);
		} else if (this.h()) {
			@Pc(34) Class126 local34 = arg12.aClass126Array1[arg0];
			@Pc(37) Class5_Sub21 local37 = local34.aClass5_Sub21_1;
			@Pc(39) Class126 local39 = null;
			if (arg8 != null) {
				local39 = arg8.aClass126Array1[arg13];
				if (local37 != local39.aClass5_Sub21_1) {
					local39 = null;
				}
			}
			this.method6070(null, 0, 65535, arg3, arg9, arg2, local34, local37, arg6, local39, false);
			@Pc(71) Class126 local71 = arg5.aClass126Array1[arg1];
			@Pc(73) Class126 local73 = null;
			if (arg10 != null) {
				local73 = arg10.aClass126Array1[arg11];
				if (local37 != local73.aClass5_Sub21_1) {
					local73 = null;
				}
			}
			this.va(0, new int[0], 0, 0, 0, 0, arg6);
			this.method6070(null, 0, 65535, arg7, arg4, arg2, local71, local71.aClass5_Sub21_1, arg6, local73, true);
			this.KA();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIILclient!ya;II)V")
	protected final void method6062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class125 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg5 / 2;
		@Pc(30) int local30 = -arg0 / 2;
		@Pc(39) int local39 = arg6.ca(local16 + arg1, local30 + arg7);
		@Pc(43) int local43 = arg5 / 2;
		@Pc(48) int local48 = -arg0 / 2;
		@Pc(58) int local58 = arg6.ca(arg1 + local43, arg7 - -local48);
		@Pc(63) int local63 = -arg5 / 2;
		@Pc(67) int local67 = arg0 / 2;
		@Pc(76) int local76 = arg6.ca(local63 + arg1, local67 + arg7);
		@Pc(80) int local80 = arg5 / 2;
		@Pc(84) int local84 = arg0 / 2;
		@Pc(93) int local93 = arg6.ca(local80 + arg1, arg7 + local84);
		@Pc(100) int local100 = local39 >= local58 ? local58 : local39;
		@Pc(107) int local107 = local76 < local93 ? local76 : local93;
		@Pc(114) int local114 = local93 <= local58 ? local93 : local58;
		@Pc(125) int local125 = local39 < local76 ? local39 : local76;
		@Pc(162) int local162;
		if (arg0 != 0) {
			@Pc(144) int local144 = (int) (Math.atan2((double) (local100 - local107), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local144 != 0) {
				if (arg3 != 0) {
					if (local144 > 8192) {
						local162 = 16384 - arg3;
						if (local162 > local144) {
							local144 = local162;
						}
					} else if (arg3 < local144) {
						local144 = arg3;
					}
				}
				this.W(local144);
			}
		}
		if (arg5 != 0) {
			@Pc(192) int local192 = (int) (Math.atan2((double) (local125 - local114), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local192 != 0) {
				if (arg2 != 0) {
					if (local192 > 8192) {
						local162 = 16384 - arg2;
						if (local162 > local192) {
							local192 = local162;
						}
					} else if (local192 > arg2) {
						local192 = arg2;
					}
				}
				this.K(local192);
			}
		}
		@Pc(233) int local233 = local39 + local93;
		if (local58 + local76 < local233) {
			local233 = local58 + local76;
		}
		local233 = (local233 >> 1) - arg4;
		if (local233 != 0) {
			this.a(0, local233, 0);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	public abstract void method6063(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
	protected abstract boolean h();

	@OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()[Lclient!u;")
	public abstract Class236[] method6064();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!go;BI)V")
	public final void method6065(@OriginalArg(0) Class5_Sub2_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.h()) {
			return;
		}
		@Pc(18) Class126 local18 = arg0.aClass126Array1[arg1];
		@Pc(21) Class5_Sub21 local21 = local18.aClass5_Sub21_1;
		for (@Pc(23) int local23 = 0; local23 < local18.anInt3341; local23++) {
			@Pc(30) short local30 = local18.aShortArray53[local23];
			if (local21.aBooleanArray11[local30]) {
				if (local18.aShortArray47[local23] != -1) {
					this.za(0, 0, 0, 0);
				}
				this.za(local21.anIntArray182[local30], local18.aShortArray51[local23], local18.aShortArray52[local23], local18.aShortArray48[local23]);
			}
		}
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Lclient!e;")
	public abstract Class57 method6066(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
	public abstract int ta();

	@OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
	public abstract void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[IIBIZIII[I)V")
	private void method6067(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(15) int local15;
		if (arg5 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local15 = -arg2;
				arg2 = arg0;
				arg0 = local15;
			} else if (arg3 == 3) {
				local15 = arg2;
				arg2 = arg0;
				arg0 = local15;
			} else if (arg3 == 2) {
				local15 = arg2;
				arg2 = -arg0 & 0x3FFF;
				arg0 = local15 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg0 = -arg0;
				arg2 = -arg2;
			} else if (arg3 == 2) {
				arg0 = -arg0 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local15 = arg2;
				arg2 = -arg0;
				arg0 = local15;
			} else if (arg3 == 3) {
				local15 = arg2;
				arg2 = arg0;
				arg0 = local15;
			} else if (arg3 == 2) {
				local15 = arg2;
				arg2 = arg0 & 0x3FFF;
				arg0 = -local15 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.va(arg3, arg8, arg2, arg6, arg0, arg5, arg4);
		} else {
			this.aa(arg3, arg8, arg2, arg6, arg0, arg4, arg7, arg1);
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()Z")
	public abstract boolean method6068();

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()V")
	public abstract void method6069();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([IIIIII[ZLclient!jm;Lclient!jd;ZLclient!jm;Z)V")
	private void method6070(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) Class126 arg6, @OriginalArg(8) Class5_Sub21 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class126 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(14) int local14;
		if (arg9 == null || arg3 == 0) {
			for (local14 = 0; local14 < arg6.anInt3341; local14++) {
				@Pc(21) short local21 = arg6.aShortArray53[local14];
				if (arg5 == null || arg10 == arg5[local21] || arg7.anIntArray182[local21] == 0) {
					@Pc(42) short local42 = arg6.aShortArray47[local14];
					if (local42 != -1) {
						this.method6067(0, arg0, 0, 0, arg8, arg1, 0, arg7.anIntArray181[local42] & arg2, arg7.anIntArrayArray21[local42]);
					}
					this.method6067(arg6.aShortArray48[local14], arg0, arg6.aShortArray51[local14], arg7.anIntArray182[local21], arg8, arg1, arg6.aShortArray52[local14], arg2 & arg7.anIntArray181[local21], arg7.anIntArrayArray21[local21]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(114) int local114 = 0;
		for (@Pc(116) int local116 = 0; local116 < arg7.anInt3192; local116++) {
			@Pc(120) boolean local120 = false;
			if (local14 < arg6.anInt3341 && arg6.aShortArray53[local14] == local116) {
				local120 = true;
			}
			@Pc(134) boolean local134 = false;
			if (arg9.anInt3341 > local114 && arg9.aShortArray53[local114] == local116) {
				local134 = true;
			}
			if (local120 || local134) {
				if (arg5 == null || arg10 == arg5[local116] || arg7.anIntArray182[local116] == 0) {
					@Pc(184) short local184 = 0;
					@Pc(189) int local189 = arg7.anIntArray182[local116];
					if (local189 == 3 || local189 == 10) {
						local184 = 128;
					}
					@Pc(207) short local207;
					@Pc(201) short local201;
					@Pc(209) short local209;
					@Pc(203) short local203;
					@Pc(205) byte local205;
					if (local120) {
						local203 = arg6.aShortArray47[local14];
						local201 = arg6.aShortArray52[local14];
						local205 = arg6.aByteArray49[local14];
						local207 = arg6.aShortArray51[local14];
						local209 = arg6.aShortArray48[local14];
						local14++;
					} else {
						local201 = local184;
						local203 = -1;
						local205 = 0;
						local207 = local184;
						local209 = local184;
					}
					@Pc(264) short local264;
					@Pc(244) short local244;
					@Pc(249) short local249;
					@Pc(259) short local259;
					@Pc(254) byte local254;
					if (local134) {
						local244 = arg9.aShortArray52[local114];
						local249 = arg9.aShortArray48[local114];
						local254 = arg9.aByteArray49[local114];
						local259 = arg9.aShortArray47[local114];
						local264 = arg9.aShortArray51[local114];
						local114++;
					} else {
						local244 = local184;
						local259 = -1;
						local254 = 0;
						local264 = local184;
						local249 = local184;
					}
					@Pc(317) int local317;
					@Pc(307) int local307;
					@Pc(306) int local306;
					if ((local205 & 0x2) == 0 && (local254 & 0x1) == 0) {
						@Pc(299) int local299;
						if (local189 == 2) {
							local299 = local264 - local207 & 0x3FFF;
							@Pc(419) int local419 = local244 - local201 & 0x3FFF;
							@Pc(426) int local426 = local249 - local209 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							if (local419 >= 8192) {
								local419 -= 16384;
							}
							local317 = arg3 * local299 / arg4 + local207 & 0x3FFF;
							local307 = local419 * arg3 / arg4 + local201 & 0x3FFF;
							if (local426 >= 8192) {
								local426 -= 16384;
							}
							local306 = local426 * arg3 / arg4 + local209 & 0x3FFF;
						} else if (local189 == 9) {
							local299 = local264 - local207 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							local306 = 0;
							local307 = 0;
							local317 = local299 * arg3 / arg4 + local207 & 0x3FFF;
						} else if (local189 == 7) {
							local299 = local264 - local207 & 0x3F;
							if (local299 >= 32) {
								local299 -= 64;
							}
							local306 = arg3 * (local249 - local209) / arg4 + local209;
							local307 = arg3 * (local244 - local201) / arg4 + local201;
							local317 = local207 + local299 * arg3 / arg4 & 0x3F;
						} else {
							local307 = local201 + arg3 * (local244 - local201) / arg4;
							local306 = local209 + arg3 * (local249 - local209) / arg4;
							local317 = (local264 - local207) * arg3 / arg4 + local207;
						}
					} else {
						local307 = local201;
						local306 = local209;
						local317 = local207;
					}
					if (local203 != -1) {
						this.method6067(0, arg0, 0, 0, arg8, arg1, 0, arg7.anIntArray181[local203] & arg2, arg7.anIntArrayArray21[local203]);
					} else if (local259 != -1) {
						this.method6067(0, arg0, 0, 0, arg8, arg1, 0, arg7.anIntArray181[local259] & arg2, arg7.anIntArrayArray21[local259]);
					}
					this.method6067(local306, arg0, local317, local189, arg8, arg1, local307, arg7.anIntArray181[local116] & arg2, arg7.anIntArrayArray21[local116]);
				} else {
					if (local120) {
						local14++;
					}
					if (local134) {
						local114++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
	public abstract int k();

	@OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
	protected abstract void KA();

	@OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method6071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
	public abstract void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!wg;II)V")
	public abstract void method6072(@OriginalArg(0) Class29 arg0, @OriginalArg(1) Class88_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
	public abstract void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(3) Class125 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!e", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public abstract Class5_Sub2_Sub1 EA(@OriginalArg(0) Class5_Sub2_Sub1 arg0);

	@OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
	public abstract void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
	public abstract void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
	public abstract int S();

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()[Lclient!od;")
	public abstract Class179[] method6073();

	@OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
	public abstract int B();
}
