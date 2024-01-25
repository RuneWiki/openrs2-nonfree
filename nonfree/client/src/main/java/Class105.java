import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public abstract class Class105 {

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	protected Class105() {
	}

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
	public abstract void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
	public abstract void IA();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method3526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
	public abstract void R(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
	public abstract void UA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!ta;IIIIII)V")
	protected final void method3528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(24) int local24 = -arg1 / 2;
		@Pc(29) int local29 = -arg7 / 2;
		@Pc(39) int local39 = arg2.a(arg6 + local24, arg3 - -local29);
		@Pc(43) int local43 = arg1 / 2;
		@Pc(48) int local48 = -arg7 / 2;
		@Pc(58) int local58 = arg2.a(local43 + arg6, arg3 - -local48);
		@Pc(63) int local63 = -arg1 / 2;
		@Pc(67) int local67 = arg7 / 2;
		@Pc(77) int local77 = arg2.a(arg6 + local63, local67 + arg3);
		@Pc(81) int local81 = arg1 / 2;
		@Pc(85) int local85 = arg7 / 2;
		@Pc(95) int local95 = arg2.a(arg6 + local81, local85 + arg3);
		@Pc(106) int local106 = local39 < local58 ? local39 : local58;
		@Pc(117) int local117 = local95 > local77 ? local77 : local95;
		@Pc(128) int local128 = local58 < local95 ? local58 : local95;
		@Pc(166) int local166;
		if (arg7 != 0) {
			@Pc(147) int local147 = (int) (Math.atan2((double) (local106 - local117), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local147 != 0) {
				if (arg0 != 0) {
					if (local147 > 8192) {
						local166 = 16384 - arg0;
						if (local147 < local166) {
							local147 = local166;
						}
					} else if (local147 > arg0) {
						local147 = arg0;
					}
				}
				this.Z(local147);
			}
		}
		@Pc(192) int local192 = local39 >= local77 ? local77 : local39;
		if (arg1 != 0) {
			@Pc(211) int local211 = (int) (Math.atan2((double) (local192 - local128), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local211 != 0) {
				if (arg5 != 0) {
					if (local211 > 8192) {
						local166 = 16384 - arg5;
						if (local166 > local211) {
							local211 = local166;
						}
					} else if (local211 > arg5) {
						local211 = arg5;
					}
				}
				this.R(local211);
			}
		}
		@Pc(251) int local251 = local39 + local95;
		if (local251 > local58 + local77) {
			local251 = local77 + local58;
		}
		local251 = (local251 >> 1) - arg4;
		if (local251 != 0) {
			this.JA(0, local251, 0);
		}
	}

	@OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
	public abstract int P();

	@OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
	public abstract int m();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()[Lclient!dv;")
	public abstract Class57[] method3530();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!nr;Lclient!rq;ZLclient!rq;I[ZZIIII[I)V")
	private void method3531(@OriginalArg(0) Class1_Sub32 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class214 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int[] arg10) {
		@Pc(9) int local9;
		if (arg1 == null || arg9 == 0) {
			for (local9 = 0; local9 < arg3.anInt5864; local9++) {
				@Pc(15) short local15 = arg3.aShortArray98[local9];
				if (arg5 == null || arg6 == arg5[local15] || arg0.anIntArray422[local15] == 0) {
					@Pc(36) short local36 = arg3.aShortArray94[local9];
					if (local36 != -1) {
						this.method3533(0, 0, arg0.anIntArray423[local36] & arg4, arg7, 0, arg0.anIntArrayArray49[local36], arg10, 0, arg2);
					}
					this.method3533(arg3.aShortArray95[local9], arg3.aShortArray91[local9], arg0.anIntArray423[local15] & arg4, arg7, arg3.aShortArray89[local9], arg0.anIntArrayArray49[local15], arg10, arg0.anIntArray422[local15], arg2);
				}
			}
			return;
		}
		local9 = 0;
		@Pc(109) int local109 = 0;
		for (@Pc(111) int local111 = 0; local111 < arg0.anInt4836; local111++) {
			@Pc(114) boolean local114 = false;
			if (arg3.anInt5864 > local9 && local111 == arg3.aShortArray98[local9]) {
				local114 = true;
			}
			@Pc(132) boolean local132 = false;
			if (local109 < arg1.anInt5864 && local111 == arg1.aShortArray98[local109]) {
				local132 = true;
			}
			if (local114 || local132) {
				if (arg5 == null || arg5[local111] == arg6 || arg0.anIntArray422[local111] == 0) {
					@Pc(177) short local177 = 0;
					@Pc(182) int local182 = arg0.anIntArray422[local111];
					if (local182 == 3 || local182 == 10) {
						local177 = 128;
					}
					@Pc(198) short local198;
					@Pc(200) short local200;
					@Pc(196) short local196;
					@Pc(202) short local202;
					@Pc(204) byte local204;
					if (local114) {
						local198 = arg3.aShortArray91[local9];
						local196 = arg3.aShortArray89[local9];
						local204 = arg3.aByteArray74[local9];
						local200 = arg3.aShortArray95[local9];
						local202 = arg3.aShortArray94[local9];
						local9++;
					} else {
						local196 = local177;
						local198 = local177;
						local200 = local177;
						local202 = -1;
						local204 = 0;
					}
					@Pc(258) short local258;
					@Pc(238) short local238;
					@Pc(243) short local243;
					@Pc(248) short local248;
					@Pc(253) byte local253;
					if (local132) {
						local238 = arg1.aShortArray95[local109];
						local243 = arg1.aShortArray89[local109];
						local248 = arg1.aShortArray94[local109];
						local253 = arg1.aByteArray74[local109];
						local258 = arg1.aShortArray91[local109];
						local109++;
					} else {
						local248 = -1;
						local258 = local177;
						local253 = 0;
						local238 = local177;
						local243 = local177;
					}
					@Pc(283) int local283;
					@Pc(287) int local287;
					@Pc(285) int local285;
					if ((local204 & 0x2) == 0 && (local253 & 0x1) == 0) {
						@Pc(297) int local297;
						if (local182 == 2) {
							local297 = local258 - local198 & 0x3FFF;
							@Pc(303) int local303 = local238 - local200 & 0x3FFF;
							if (local303 >= 8192) {
								local303 -= 16384;
							}
							if (local297 >= 8192) {
								local297 -= 16384;
							}
							@Pc(320) int local320 = local243 - local196 & 0x3FFF;
							local283 = local198 + local297 * arg9 / arg8 & 0x3FFF;
							local287 = local303 * arg9 / arg8 + local200 & 0x3FFF;
							if (local320 >= 8192) {
								local320 -= 16384;
							}
							local285 = local196 + arg9 * local320 / arg8 & 0x3FFF;
						} else if (local182 == 9) {
							local297 = local258 - local198 & 0x3FFF;
							if (local297 >= 8192) {
								local297 -= 16384;
							}
							local285 = 0;
							local287 = 0;
							local283 = arg9 * local297 / arg8 + local198 & 0x3FFF;
						} else if (local182 == 7) {
							local297 = local258 - local198 & 0x3F;
							if (local297 >= 32) {
								local297 -= 64;
							}
							local287 = (local238 - local200) * arg9 / arg8 + local200;
							local285 = local196 + arg9 * (local243 - local196) / arg8;
							local283 = local198 + local297 * arg9 / arg8 & 0x3F;
						} else {
							local285 = arg9 * (local243 - local196) / arg8 + local196;
							local283 = local198 + arg9 * (local258 - local198) / arg8;
							local287 = arg9 * (local238 - local200) / arg8 + local200;
						}
					} else {
						local283 = local198;
						local285 = local196;
						local287 = local200;
					}
					if (local202 != -1) {
						this.method3533(0, 0, arg4 & arg0.anIntArray423[local202], arg7, 0, arg0.anIntArrayArray49[local202], arg10, 0, arg2);
					} else if (local248 != -1) {
						this.method3533(0, 0, arg0.anIntArray423[local248] & arg4, arg7, 0, arg0.anIntArrayArray49[local248], arg10, 0, arg2);
					}
					this.method3533(local287, local283, arg0.anIntArray423[local111] & arg4, arg7, local285, arg0.anIntArrayArray49[local111], arg10, local182, arg2);
				} else {
					if (local132) {
						local109++;
					}
					if (local114) {
						local9++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	public abstract void method3532(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	public abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(3) Class149 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
	public abstract void aa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIII[I[IIZ)V")
	private void method3533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(15) int local15;
		if (arg3 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local15 = -arg1;
				arg1 = arg4;
				arg4 = local15;
			} else if (arg7 == 3) {
				local15 = arg1;
				arg1 = arg4;
				arg4 = local15;
			} else if (arg7 == 2) {
				local15 = arg1;
				arg1 = -arg4 & 0x3FFF;
				arg4 = local15 & 0x3FFF;
			}
		} else if (arg3 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg4 = -arg4;
				arg1 = -arg1;
			} else if (arg7 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg3 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local15 = arg1;
				arg1 = -arg4;
				arg4 = local15;
			} else if (arg7 == 3) {
				local15 = arg1;
				arg1 = arg4;
				arg4 = local15;
			} else if (arg7 == 2) {
				local15 = arg1;
				arg1 = arg4 & 0x3FFF;
				arg4 = -local15 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.XA(arg7, arg5, arg1, arg0, arg4, arg3, arg8);
		} else {
			this.M(arg7, arg5, arg1, arg0, arg4, arg8, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
	protected abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!ju;I)V")
	public abstract void method3534(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
	public abstract int NA();

	@OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
	public abstract void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()[Lclient!uj;")
	public abstract Class244[] method3535();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BILclient!ir;)V")
	public final void method3536(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub9 arg1) {
		if (arg0 == -1 || !this.w()) {
			return;
		}
		@Pc(19) Class214 local19 = arg1.aClass214Array1[arg0];
		@Pc(26) Class1_Sub32 local26 = local19.aClass1_Sub32_1;
		for (@Pc(28) int local28 = 0; local28 < local19.anInt5864; local28++) {
			@Pc(35) short local35 = local19.aShortArray98[local28];
			if (local26.aBooleanArray35[local35]) {
				if (local19.aShortArray94[local28] != -1) {
					this.N(0, 0, 0, 0);
				}
				this.N(local26.anIntArray422[local35], local19.aShortArray91[local28], local19.aShortArray95[local28], local19.aShortArray89[local28]);
			}
		}
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	public abstract Class1_Sub2_Sub1 fa(@OriginalArg(0) Class1_Sub2_Sub1 arg0);

	@OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
	public abstract void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
	public abstract void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()Z")
	public abstract boolean method3538();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!ir;IIBIZIILclient!ir;)V")
	public final void method3539(@OriginalArg(0) Class1_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub2_Sub9 arg7) {
		if (arg5 == -1 || !this.w()) {
			return;
		}
		@Pc(22) Class214 local22 = arg7.aClass214Array1[arg5];
		@Pc(25) Class1_Sub32 local25 = local22.aClass1_Sub32_1;
		@Pc(27) Class214 local27 = null;
		if (arg0 != null) {
			local27 = arg0.aClass214Array1[arg6];
			if (local25 != local27.aClass1_Sub32_1) {
				local27 = null;
			}
		}
		this.method3531(local25, local27, arg4, local22, 65535, null, false, arg2, arg3, arg1, null);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
	protected abstract boolean w();

	@OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
	protected abstract void j();

	@OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
	protected abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public abstract void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIILclient!ir;Lclient!ir;[ZILclient!ir;Lclient!ir;BIIZ)V")
	public final void method3541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub2_Sub9 arg5, @OriginalArg(6) Class1_Sub2_Sub9 arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class1_Sub2_Sub9 arg9, @OriginalArg(10) Class1_Sub2_Sub9 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		if (arg11 == -1) {
			return;
		}
		if (arg7 == null || arg2 == -1) {
			this.method3539(arg10, arg3, 0, arg12, arg13, arg11, arg0, arg9);
		} else if (this.w()) {
			@Pc(39) Class214 local39 = arg9.aClass214Array1[arg11];
			@Pc(42) Class1_Sub32 local42 = local39.aClass1_Sub32_1;
			@Pc(44) Class214 local44 = null;
			if (arg10 != null) {
				local44 = arg10.aClass214Array1[arg0];
				if (local44.aClass1_Sub32_1 != local42) {
					local44 = null;
				}
			}
			this.method3531(local42, local44, arg13, local39, 65535, arg7, false, 0, arg12, arg3, null);
			@Pc(76) Class214 local76 = arg6.aClass214Array1[arg2];
			@Pc(78) Class214 local78 = null;
			if (arg5 != null) {
				local78 = arg5.aClass214Array1[arg1];
				if (local78.aClass1_Sub32_1 != local42) {
					local78 = null;
				}
			}
			this.XA(0, new int[0], 0, 0, 0, 0, arg13);
			this.method3531(local76.aClass1_Sub32_1, local78, arg13, local76, 65535, arg7, true, 0, arg4, arg8, null);
			this.j();
		}
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
	public abstract void method3542();

	@OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
	public abstract int D();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!ju;II)V")
	public abstract void method3546(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
	public abstract void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
	protected abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIILclient!ir;I[IILclient!ir;IZ)V")
	public final void method3547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub2_Sub9 arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class1_Sub2_Sub9 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) boolean arg8) {
		if (arg7 == -1 || !this.w()) {
			return;
		}
		@Pc(17) Class214 local17 = arg6.aClass214Array1[arg7];
		@Pc(20) Class1_Sub32 local20 = local17.aClass1_Sub32_1;
		@Pc(22) Class214 local22 = null;
		if (arg3 != null) {
			local22 = arg3.aClass214Array1[arg0];
			if (local22.aClass1_Sub32_1 != local20) {
				local22 = null;
			}
		}
		this.method3531(local20, local22, arg8, local17, arg5, null, false, 0, arg2, arg1, arg4);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lclient!t;")
	public abstract Class105 method3548(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);
}
