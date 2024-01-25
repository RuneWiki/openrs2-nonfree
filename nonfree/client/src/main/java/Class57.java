import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class57 {

	@OriginalMember(owner = "client!da", name = "e", descriptor = "Z")
	protected boolean aBoolean681 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	protected Class57() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([IZ[IIIIIIII)V")
	private void method7906(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(65) int local65;
		if (arg7 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local65 = -arg4;
				arg4 = arg5;
				arg5 = local65;
			} else if (arg8 == 3) {
				local65 = arg4;
				arg4 = arg5;
				arg5 = local65;
			} else if (arg8 == 2) {
				local65 = arg4;
				arg4 = -arg5 & 0x3FFF;
				arg5 = local65 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg4 = -arg4;
				arg5 = -arg5;
			} else if (arg8 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local65 = arg4;
				arg4 = -arg5;
				arg5 = local65;
			} else if (arg8 == 3) {
				local65 = arg4;
				arg4 = arg5;
				arg5 = local65;
			} else if (arg8 == 2) {
				local65 = arg4;
				arg4 = arg5 & 0x3FFF;
				arg5 = -local65 & 0x3FFF;
			}
		}
		if (arg6 == 65535) {
			this.method7931(arg8, arg0, arg4, arg3, arg5, arg7, arg1);
		} else {
			this.B(arg8, arg0, arg4, arg3, arg5, arg1, arg6, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!bca;IIIIIZLclient!bca;[II)V")
	public final void method7907(@OriginalArg(1) Class4_Sub5_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) Class4_Sub5_Sub2 arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) int arg8) {
		if (arg1 == -1) {
			return;
		}
		this.method7911();
		if (!this.F()) {
			this.method7908();
			return;
		}
		@Pc(21) Class70 local21 = arg6.aClass70Array1[arg1];
		@Pc(24) Class4_Sub34 local24 = local21.aClass4_Sub34_1;
		@Pc(26) Class70 local26 = null;
		if (arg0 != null) {
			local26 = arg0.aClass70Array1[arg3];
			if (local26.aClass4_Sub34_1 != local24) {
				local26 = null;
			}
		}
		this.method7910(arg4, local26, false, arg8, arg7, arg2, null, local24, local21, 0, arg5);
		this.L();
		this.method7908();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	protected abstract void method7908();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;IZ)V")
	public abstract void method7909(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
	public abstract void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
	public abstract int KA();

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
	public abstract boolean LA();

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
	public abstract void FA();

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!dr;ZIZ[II[ZLclient!po;Lclient!dr;IZ)V")
	private void method7910(@OriginalArg(0) int arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) Class4_Sub34 arg7, @OriginalArg(9) Class70 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(19) int local19;
		if (arg1 == null || arg5 == 0) {
			for (local19 = 0; local19 < arg8.anInt2270; local19++) {
				@Pc(26) short local26 = arg8.aShortArray27[local19];
				if (arg6 == null || arg2 == arg6[local26] || arg7.anIntArray391[local26] == 0) {
					@Pc(51) short local51 = arg8.aShortArray26[local19];
					if (local51 != -1) {
						this.method7906(arg7.anIntArrayArray46[local51], arg10, arg4, 0, 0, 0, arg7.anIntArray392[local51] & arg0, arg9, 0);
					}
					this.method7906(arg7.anIntArrayArray46[local26], arg10, arg4, arg8.aShortArray30[local19], arg8.aShortArray23[local19], arg8.aShortArray31[local19], arg0 & arg7.anIntArray392[local26], arg9, arg7.anIntArray391[local26]);
				}
			}
			return;
		}
		local19 = 0;
		@Pc(121) int local121 = 0;
		for (@Pc(123) int local123 = 0; local123 < arg7.anInt7712; local123++) {
			@Pc(127) boolean local127 = false;
			if (arg8.anInt2270 > local19 && local123 == arg8.aShortArray27[local19]) {
				local127 = true;
			}
			@Pc(149) boolean local149 = false;
			if (arg1.anInt2270 > local121 && local123 == arg1.aShortArray27[local121]) {
				local149 = true;
			}
			if (local127 || local149) {
				if (arg6 == null || arg2 == arg6[local123] || arg7.anIntArray391[local123] == 0) {
					@Pc(198) short local198 = 0;
					@Pc(203) int local203 = arg7.anIntArray391[local123];
					if (local203 == 3 || local203 == 10) {
						local198 = 128;
					}
					@Pc(223) short local223;
					@Pc(233) short local233;
					@Pc(218) short local218;
					@Pc(238) short local238;
					@Pc(228) byte local228;
					if (local127) {
						local218 = arg8.aShortArray31[local19];
						local223 = arg8.aShortArray23[local19];
						local228 = arg8.aByteArray19[local19];
						local233 = arg8.aShortArray30[local19];
						local238 = arg8.aShortArray26[local19];
						local19++;
					} else {
						local218 = local198;
						local233 = local198;
						local238 = -1;
						local223 = local198;
						local228 = 0;
					}
					@Pc(258) short local258;
					@Pc(278) short local278;
					@Pc(268) short local268;
					@Pc(273) short local273;
					@Pc(263) byte local263;
					if (local149) {
						local258 = arg1.aShortArray23[local121];
						local263 = arg1.aByteArray19[local121];
						local268 = arg1.aShortArray31[local121];
						local273 = arg1.aShortArray26[local121];
						local278 = arg1.aShortArray30[local121];
						local121++;
					} else {
						local258 = local198;
						local263 = 0;
						local278 = local198;
						local273 = -1;
						local268 = local198;
					}
					@Pc(311) int local311;
					@Pc(309) int local309;
					@Pc(307) int local307;
					if ((local228 & 0x2) == 0 && (local263 & 0x1) == 0) {
						@Pc(332) int local332;
						if (local203 == 2) {
							local332 = local258 - local223 & 0x3FFF;
							@Pc(448) int local448 = local278 - local233 & 0x3FFF;
							if (local448 >= 8192) {
								local448 -= 16384;
							}
							if (local332 >= 8192) {
								local332 -= 16384;
							}
							@Pc(467) int local467 = local268 - local218 & 0x3FFF;
							local309 = arg5 * local448 / arg3 + local233 & 0x3FFF;
							local311 = local223 + local332 * arg5 / arg3 & 0x3FFF;
							if (local467 >= 8192) {
								local467 -= 16384;
							}
							local307 = local218 + arg5 * local467 / arg3 & 0x3FFF;
						} else if (local203 == 9) {
							local332 = local258 - local223 & 0x3FFF;
							if (local332 >= 8192) {
								local332 -= 16384;
							}
							local311 = local332 * arg5 / arg3 + local223 & 0x3FFF;
							local307 = 0;
							local309 = 0;
						} else if (local203 == 7) {
							local332 = local258 - local223 & 0x3F;
							if (local332 >= 32) {
								local332 -= 64;
							}
							local311 = local223 + local332 * arg5 / arg3 & 0x3F;
							local309 = local233 + (local278 - local233) * arg5 / arg3;
							local307 = (local268 - local218) * arg5 / arg3 + local218;
						} else {
							local307 = arg5 * (local268 - local218) / arg3 + local218;
							local309 = arg5 * (local278 - local233) / arg3 + local233;
							local311 = (local258 - local223) * arg5 / arg3 + local223;
						}
					} else {
						local307 = local218;
						local309 = local233;
						local311 = local223;
					}
					if (local238 != -1) {
						this.method7906(arg7.anIntArrayArray46[local238], arg10, arg4, 0, 0, 0, arg0 & arg7.anIntArray392[local238], arg9, 0);
					} else if (local273 != -1) {
						this.method7906(arg7.anIntArrayArray46[local273], arg10, arg4, 0, 0, 0, arg7.anIntArray392[local273] & arg0, arg9, 0);
					}
					this.method7906(arg7.anIntArrayArray46[local123], arg10, arg4, local309, local311, local307, arg0 & arg7.anIntArray392[local123], arg9, local203);
				} else {
					if (local149) {
						local121++;
					}
					if (local127) {
						local19++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	protected abstract void method7911();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!da;")
	public abstract Class57 method7912(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
	protected abstract void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILclient!i;I)V")
	protected final void method7913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class83 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg2 / 2;
		@Pc(21) int local21 = -arg4 / 2;
		@Pc(32) int local32 = arg6.method7213(arg5 + local16, arg7 + local21);
		@Pc(36) int local36 = arg2 / 2;
		@Pc(41) int local41 = -arg4 / 2;
		@Pc(53) int local53 = arg6.method7213(arg5 + local36, arg7 - -local41);
		@Pc(58) int local58 = -arg2 / 2;
		@Pc(62) int local62 = arg4 / 2;
		@Pc(76) int local76 = arg6.method7213(local58 + arg5, local62 + arg7);
		@Pc(80) int local80 = arg2 / 2;
		@Pc(84) int local84 = arg4 / 2;
		@Pc(94) int local94 = arg6.method7213(local80 + arg5, local84 + arg7);
		@Pc(105) int local105 = local53 > local32 ? local32 : local53;
		@Pc(112) int local112 = local94 <= local76 ? local94 : local76;
		@Pc(123) int local123 = local94 > local53 ? local53 : local94;
		@Pc(134) int local134 = local32 < local76 ? local32 : local76;
		@Pc(173) int local173;
		if (arg4 != 0) {
			@Pc(150) int local150 = (int) (Math.atan2((double) (local105 - local112), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local150 != 0) {
				if (arg3 != 0) {
					if (local150 > 8192) {
						local173 = 16384 - arg3;
						if (local173 > local150) {
							local150 = local173;
						}
					} else if (local150 > arg3) {
						local150 = arg3;
					}
				}
				this.MA(local150);
			}
		}
		@Pc(189) int local189 = local94 + local32;
		if (arg2 != 0) {
			@Pc(208) int local208 = (int) (Math.atan2((double) (local134 - local123), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local208 != 0) {
				if (arg1 != 0) {
					if (local208 > 8192) {
						local173 = 16384 - arg1;
						if (local208 < local173) {
							local208 = local173;
						}
					} else if (arg1 < local208) {
						local208 = arg1;
					}
				}
				this.W(local208);
			}
		}
		if (local189 > local76 + local53) {
			local189 = local53 + local76;
		}
		local189 = (local189 >> 1) - arg0;
		if (local189 != 0) {
			this.oa(0, local189, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
	protected abstract boolean F();

	@OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
	public abstract int za();

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
	public abstract void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public abstract Class4_Sub5_Sub6 S(@OriginalArg(0) Class4_Sub5_Sub6 arg0);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()[Lclient!nba;")
	public abstract Class227[] method7915();

	@OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!bca;B)V")
	public final void method7916(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub5_Sub2 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method7911();
		if (!this.F()) {
			this.method7908();
			return;
		}
		@Pc(27) Class70 local27 = arg1.aClass70Array1[arg0];
		@Pc(30) Class4_Sub34 local30 = local27.aClass4_Sub34_1;
		for (@Pc(32) int local32 = 0; local32 < local27.anInt2270; local32++) {
			@Pc(39) short local39 = local27.aShortArray27[local32];
			if (local30.aBooleanArray24[local39]) {
				if (local27.aShortArray26[local32] != -1) {
					this.WA(0, 0, 0, 0);
				}
				this.WA(local30.anIntArray391[local39], local27.aShortArray23[local32], local27.aShortArray30[local32], local27.aShortArray31[local32]);
			}
		}
		this.L();
		this.method7908();
	}

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public abstract void method7917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!mj;II)V")
	public abstract void method7919(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()[Lclient!fk;")
	public abstract Class103[] method7920();

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
	public abstract void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	public abstract void method7922(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
	public abstract void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;ZI)Z")
	public abstract boolean method7924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIILclient!bca;IIILclient!bca;)V")
	public final void method7925(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub5_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class4_Sub5_Sub2 arg7) {
		if (arg3 == -1) {
			return;
		}
		this.method7911();
		if (!this.F()) {
			this.method7908();
			return;
		}
		@Pc(20) Class70 local20 = arg4.aClass70Array1[arg3];
		@Pc(27) Class4_Sub34 local27 = local20.aClass4_Sub34_1;
		@Pc(29) Class70 local29 = null;
		if (arg7 != null) {
			local29 = arg7.aClass70Array1[arg1];
			if (local29.aClass4_Sub34_1 != local27) {
				local29 = null;
			}
		}
		this.method7910(65535, local29, false, arg5, null, arg6, null, local27, local20, arg2, arg0);
		this.L();
		this.method7908();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7926(@OriginalArg(0) Class8 arg0);

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class83 arg2, @OriginalArg(3) Class83 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
	public abstract void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!mj;I)V")
	public abstract void method7927(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class1_Sub9 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!bca;Lclient!bca;Lclient!bca;[ZIIIILclient!bca;IIIZII)V")
	public final void method7928(@OriginalArg(0) Class4_Sub5_Sub2 arg0, @OriginalArg(1) Class4_Sub5_Sub2 arg1, @OriginalArg(2) Class4_Sub5_Sub2 arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub5_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == -1) {
			return;
		}
		if (arg3 == null || arg4 == -1) {
			this.method7925(arg11, arg12, 0, arg6, arg8, arg5, arg10, arg0);
			return;
		}
		this.method7911();
		if (!this.F()) {
			this.method7908();
			return;
		}
		@Pc(37) Class70 local37 = arg8.aClass70Array1[arg6];
		@Pc(40) Class4_Sub34 local40 = local37.aClass4_Sub34_1;
		@Pc(42) Class70 local42 = null;
		if (arg0 != null) {
			local42 = arg0.aClass70Array1[arg12];
			if (local40 != local42.aClass4_Sub34_1) {
				local42 = null;
			}
		}
		this.method7910(65535, local42, false, arg5, null, arg10, arg3, local40, local37, 0, arg11);
		@Pc(74) Class70 local74 = arg2.aClass70Array1[arg4];
		@Pc(76) Class70 local76 = null;
		if (arg1 != null) {
			local76 = arg1.aClass70Array1[arg9];
			if (local76.aClass4_Sub34_1 != local40) {
				local76 = null;
			}
		}
		this.method7931(0, new int[0], 0, 0, 0, 0, arg11);
		this.method7910(65535, local76, true, arg13, null, arg7, arg3, local74.aClass4_Sub34_1, local74, 0, arg11);
		this.L();
		this.method7908();
	}

	@OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
	protected abstract void L();

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
	public abstract void method7929();

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7931(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()Z")
	public abstract boolean method7932();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) boolean arg3);
}
