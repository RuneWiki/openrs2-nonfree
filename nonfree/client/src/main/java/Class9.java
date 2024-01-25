import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class9 {

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	protected Class9() {
	}

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
	public abstract void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
	public abstract int ra();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lclient!wv;")
	public abstract Class269[] method5680();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBILclient!na;III)V")
	protected final void method5681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class159 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg2 / 2;
		@Pc(30) int local30 = arg4.va(arg6 + local16, arg0 + local21);
		@Pc(34) int local34 = arg1 / 2;
		@Pc(39) int local39 = -arg2 / 2;
		@Pc(48) int local48 = arg4.va(local34 + arg6, local39 + arg0);
		@Pc(53) int local53 = -arg1 / 2;
		@Pc(57) int local57 = arg2 / 2;
		@Pc(66) int local66 = arg4.va(local53 + arg6, local57 + arg0);
		@Pc(70) int local70 = arg1 / 2;
		@Pc(78) int local78 = arg2 / 2;
		@Pc(88) int local88 = arg4.va(local70 + arg6, arg0 - -local78);
		@Pc(99) int local99 = local30 >= local48 ? local48 : local30;
		@Pc(106) int local106 = local66 >= local88 ? local88 : local66;
		@Pc(113) int local113 = local88 <= local48 ? local88 : local48;
		@Pc(120) int local120 = local66 <= local30 ? local66 : local30;
		@Pc(165) int local165;
		if (arg2 != 0) {
			@Pc(139) int local139 = (int) (Math.atan2((double) (local99 - local106), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local139 != 0) {
				if (arg7 != 0) {
					if (local139 > 8192) {
						local165 = 16384 - arg7;
						if (local165 > local139) {
							local139 = local165;
						}
					} else if (arg7 < local139) {
						local139 = arg7;
					}
				}
				this.WA(local139);
			}
		}
		@Pc(181) int local181 = local88 + local30;
		if (arg1 != 0) {
			@Pc(196) int local196 = (int) (Math.atan2((double) (local120 - local113), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local196 != 0) {
				if (arg5 != 0) {
					if (local196 > 8192) {
						local165 = 16384 - arg5;
						if (local196 < local165) {
							local196 = local165;
						}
					} else if (arg5 < local196) {
						local196 = arg5;
					}
				}
				this.o(local196);
			}
		}
		if (local66 + local48 < local181) {
			local181 = local66 + local48;
		}
		local181 = (local181 >> 1) - arg3;
		if (local181 != 0) {
			this.ja(0, local181, 0);
		}
	}

	@OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
	public abstract void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
	protected abstract boolean FA();

	@OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
	public abstract void sa();

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()V")
	public abstract void method5682();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!lc;II)V")
	public abstract void method5683(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class6_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) Class159 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wg;IZILclient!wg;I[IBIII)V")
	public final void method5684(@OriginalArg(0) Class3_Sub4_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub4_Sub16 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		if (arg3 == -1 || !this.FA()) {
			return;
		}
		@Pc(17) Class238 local17 = arg4.aClass238Array1[arg3];
		@Pc(20) Class3_Sub28 local20 = local17.aClass3_Sub28_1;
		@Pc(22) Class238 local22 = null;
		if (arg0 != null) {
			local22 = arg0.aClass238Array1[arg7];
			if (local20 != local22.aClass3_Sub28_1) {
				local22 = null;
			}
		}
		this.method5689(false, local20, arg1, 0, local17, arg6, arg2, arg8, arg5, local22, null);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
	public abstract void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()[Lclient!nk;")
	public abstract Class165[] method5685();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ[IIII[III)V")
	private void method5686(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(55) int local55;
		if (arg7 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local55 = -arg0;
				arg0 = arg4;
				arg4 = local55;
			} else if (arg8 == 3) {
				local55 = arg0;
				arg0 = arg4;
				arg4 = local55;
			} else if (arg8 == 2) {
				local55 = arg0;
				arg0 = -arg4 & 0x3FFF;
				arg4 = local55 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg4 = -arg4;
				arg0 = -arg0;
			} else if (arg8 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg0 = -arg0 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local55 = arg0;
				arg0 = -arg4;
				arg4 = local55;
			} else if (arg8 == 3) {
				local55 = arg0;
				arg0 = arg4;
				arg4 = local55;
			} else if (arg8 == 2) {
				local55 = arg0;
				arg0 = arg4 & 0x3FFF;
				arg4 = -local55 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.xa(arg8, arg6, arg0, arg5, arg4, arg7, arg1);
		} else {
			this.va(arg8, arg6, arg0, arg5, arg4, arg1, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
	public abstract void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
	public abstract int la();

	@OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
	public abstract void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
	public abstract int VA();

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLclient!ki;IILclient!tr;[IZIIILclient!tr;[Z)V")
	private void method5689(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class238 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class238 arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(9) int local9;
		if (arg9 == null || arg7 == 0) {
			for (local9 = 0; local9 < arg4.anInt6539; local9++) {
				@Pc(15) short local15 = arg4.aShortArray137[local9];
				if (arg10 == null || arg0 == arg10[local15] || arg1.anIntArray260[local15] == 0) {
					@Pc(43) short local43 = arg4.aShortArray139[local9];
					if (local43 != -1) {
						this.method5686(0, arg6, arg5, arg2 & arg1.anIntArray261[local43], 0, 0, arg1.anIntArrayArray27[local43], arg3, 0);
					}
					this.method5686(arg4.aShortArray134[local9], arg6, arg5, arg2 & arg1.anIntArray261[local15], arg4.aShortArray136[local9], arg4.aShortArray133[local9], arg1.anIntArrayArray27[local15], arg3, arg1.anIntArray260[local15]);
				}
			}
			return;
		}
		local9 = 0;
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < arg1.anInt4001; local114++) {
			@Pc(117) boolean local117 = false;
			if (local9 < arg4.anInt6539 && arg4.aShortArray137[local9] == local114) {
				local117 = true;
			}
			@Pc(131) boolean local131 = false;
			if (local112 < arg9.anInt6539 && local114 == arg9.aShortArray137[local112]) {
				local131 = true;
			}
			if (local117 || local131) {
				if (arg10 == null || arg10[local114] == arg0 || arg1.anIntArray260[local114] == 0) {
					@Pc(187) short local187 = 0;
					@Pc(192) int local192 = arg1.anIntArray260[local114];
					if (local192 == 3 || local192 == 10) {
						local187 = 128;
					}
					@Pc(219) short local219;
					@Pc(224) short local224;
					@Pc(209) short local209;
					@Pc(214) short local214;
					@Pc(229) byte local229;
					if (local117) {
						local209 = arg4.aShortArray136[local9];
						local214 = arg4.aShortArray139[local9];
						local219 = arg4.aShortArray134[local9];
						local224 = arg4.aShortArray133[local9];
						local229 = arg4.aByteArray83[local9];
						local9++;
					} else {
						local209 = local187;
						local214 = -1;
						local224 = local187;
						local219 = local187;
						local229 = 0;
					}
					@Pc(249) short local249;
					@Pc(251) short local251;
					@Pc(245) short local245;
					@Pc(253) short local253;
					@Pc(247) byte local247;
					if (local131) {
						local251 = arg9.aShortArray133[local112];
						local253 = arg9.aShortArray139[local112];
						local245 = arg9.aShortArray136[local112];
						local247 = arg9.aByteArray83[local112];
						local249 = arg9.aShortArray134[local112];
						local112++;
					} else {
						local245 = local187;
						local247 = 0;
						local249 = local187;
						local251 = local187;
						local253 = -1;
					}
					if (local214 != -1) {
						this.method5686(0, arg6, arg5, arg2 & arg1.anIntArray261[local214], 0, 0, arg1.anIntArrayArray27[local214], arg3, 0);
					} else if (local253 != -1) {
						this.method5686(0, arg6, arg5, arg2 & arg1.anIntArray261[local253], 0, 0, arg1.anIntArrayArray27[local253], arg3, 0);
					}
					@Pc(391) int local391;
					@Pc(381) int local381;
					@Pc(407) int local407;
					if ((local229 & 0x2) == 0 && (local247 & 0x1) == 0) {
						@Pc(349) int local349;
						if (local192 == 2) {
							local349 = local249 - local219 & 0x3FFF;
							@Pc(356) int local356 = local251 - local224 & 0x3FFF;
							if (local356 >= 8192) {
								local356 -= 16384;
							}
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							@Pc(371) int local371 = local245 - local209 & 0x3FFF;
							local381 = arg7 * local356 / arg8 + local224 & 0x3FFF;
							local391 = local349 * arg7 / arg8 + local219 & 0x3FFF;
							if (local371 >= 8192) {
								local371 -= 16384;
							}
							local407 = local371 * arg7 / arg8 + local209 & 0x3FFF;
						} else if (local192 == 9) {
							local349 = local249 - local219 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							local391 = local349 * arg7 / arg8 + local219 & 0x3FFF;
							local407 = 0;
							local381 = 0;
						} else if (local192 == 7) {
							local349 = local249 - local219 & 0x3F;
							if (local349 >= 32) {
								local349 -= 64;
							}
							local391 = local219 + arg7 * local349 / arg8 & 0x3F;
							local381 = arg7 * (local251 - local224) / arg8 + local224;
							local407 = local209 + (local245 - local209) * arg7 / arg8;
						} else {
							local391 = arg7 * (local249 - local219) / arg8 + local219;
							local381 = local224 + arg7 * (local251 - local224) / arg8;
							local407 = local209 + arg7 * (local245 - local209) / arg8;
						}
					} else {
						local407 = local209;
						local391 = local219;
						local381 = local224;
					}
					this.method5686(local391, arg6, arg5, arg2 & arg1.anIntArray261[local114], local407, local381, arg1.anIntArrayArray27[local114], arg3, local192);
				} else {
					if (local131) {
						local112++;
					}
					if (local117) {
						local9++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()Z")
	public abstract boolean method5690();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wg;ZLclient!wg;IIIIII)V")
	public final void method5691(@OriginalArg(0) Class3_Sub4_Sub16 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub4_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 == -1 || !this.FA()) {
			return;
		}
		@Pc(16) Class238 local16 = arg0.aClass238Array1[arg4];
		@Pc(19) Class3_Sub28 local19 = local16.aClass3_Sub28_1;
		@Pc(21) Class238 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass238Array1[arg7];
			if (local21.aClass3_Sub28_1 != local19) {
				local21 = null;
			}
		}
		this.method5689(false, local19, 65535, arg6, local16, null, arg1, arg5, arg3, local21, null);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected abstract void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
	public abstract int C();

	@OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
	public abstract void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
	public abstract void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!ia;Z)Z")
	public abstract boolean method5693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!lc;I)V")
	public abstract void method5695(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class6_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	public abstract void method5696(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
	protected abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
	public abstract int X();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wg;IIZILclient!wg;I[ZLclient!wg;IIIIILclient!wg;)V")
	public final void method5697(@OriginalArg(0) Class3_Sub4_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub4_Sub16 arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) Class3_Sub4_Sub16 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class3_Sub4_Sub16 arg13) {
		if (arg9 == -1) {
			return;
		}
		if (arg6 == null || arg8 == -1) {
			this.method5691(arg13, arg3, arg0, arg12, arg9, arg10, 0, arg4);
		} else if (this.FA()) {
			@Pc(36) Class238 local36 = arg13.aClass238Array1[arg9];
			@Pc(39) Class3_Sub28 local39 = local36.aClass3_Sub28_1;
			@Pc(41) Class238 local41 = null;
			if (arg0 != null) {
				local41 = arg0.aClass238Array1[arg4];
				if (local41.aClass3_Sub28_1 != local39) {
					local41 = null;
				}
			}
			this.method5689(false, local39, 65535, 0, local36, null, arg3, arg10, arg12, local41, arg6);
			@Pc(73) Class238 local73 = arg5.aClass238Array1[arg8];
			@Pc(75) Class238 local75 = null;
			if (arg7 != null) {
				local75 = arg7.aClass238Array1[arg2];
				if (local39 != local75.aClass3_Sub28_1) {
					local75 = null;
				}
			}
			this.xa(0, new int[0], 0, 0, 0, 0, arg3);
			this.method5689(true, local73.aClass3_Sub28_1, 65535, 0, local73, null, arg3, arg11, arg1, local75, arg6);
			this.W();
		}
	}

	@OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
	public abstract void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
	protected abstract void W();

	@OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public abstract Class3_Sub4_Sub4 ua(@OriginalArg(0) Class3_Sub4_Sub4 arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!wg;II)V")
	public final void method5698(@OriginalArg(0) Class3_Sub4_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1 || !this.FA()) {
			return;
		}
		@Pc(18) Class238 local18 = arg0.aClass238Array1[arg1];
		@Pc(21) Class3_Sub28 local21 = local18.aClass3_Sub28_1;
		for (@Pc(23) int local23 = 0; local23 < local18.anInt6539; local23++) {
			@Pc(30) short local30 = local18.aShortArray137[local23];
			if (local21.aBooleanArray16[local30]) {
				if (local18.aShortArray139[local23] != -1) {
					this.K(0, 0, 0, 0);
				}
				this.K(local21.anIntArray260[local30], local18.aShortArray134[local23], local18.aShortArray133[local23], local18.aShortArray136[local23]);
			}
		}
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lclient!c;")
	public abstract Class9 method5699(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	public abstract void method5700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
