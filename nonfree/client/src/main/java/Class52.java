import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class52 {

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Z")
	protected boolean aBoolean640 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	protected Class52() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;ZI)Z")
	public abstract boolean method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()[Lclient!ti;")
	public abstract Class317[] method7613();

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7614(@OriginalArg(0) Class42 arg0);

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
	public abstract void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	protected abstract void method7615();

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([III[IIZIIIB)V")
	private void method7616(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(35) int local35;
		if (arg4 == 1) {
			if (arg6 == 0 || arg6 == 1) {
				local35 = -arg1;
				arg1 = arg8;
				arg8 = local35;
			} else if (arg6 == 3) {
				local35 = arg1;
				arg1 = arg8;
				arg8 = local35;
			} else if (arg6 == 2) {
				local35 = arg1;
				arg1 = -arg8 & 0x3FFF;
				arg8 = local35 & 0x3FFF;
			}
		} else if (arg4 == 2) {
			if (arg6 == 0 || arg6 == 1) {
				arg1 = -arg1;
				arg8 = -arg8;
			} else if (arg6 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg1 = -arg1 & 0x3FFF;
			}
		} else if (arg4 == 3) {
			if (arg6 == 0 || arg6 == 1) {
				local35 = arg1;
				arg1 = -arg8;
				arg8 = local35;
			} else if (arg6 == 3) {
				local35 = arg1;
				arg1 = arg8;
				arg8 = local35;
			} else if (arg6 == 2) {
				local35 = arg1;
				arg1 = arg8 & 0x3FFF;
				arg8 = -local35 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.method7625(arg6, arg0, arg1, arg7, arg8, arg4, arg5);
		} else {
			this.B(arg6, arg0, arg1, arg7, arg8, arg5, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!b;I)V")
	public abstract void method7617(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class25_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
	public abstract void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!da;")
	public abstract Class52 method7618(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!b;II)V")
	public abstract void method7619(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class25_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
	public abstract boolean LA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!pea;I)V")
	public final void method7620(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub15 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method7615();
		if (!this.F()) {
			this.method7628();
			return;
		}
		@Pc(22) Class299 local22 = arg1.aClass299Array1[arg0];
		@Pc(25) Class3_Sub37 local25 = local22.aClass3_Sub37_1;
		for (@Pc(32) int local32 = 0; local32 < local22.anInt8360; local32++) {
			@Pc(39) short local39 = local22.aShortArray122[local32];
			if (local25.aBooleanArray18[local39]) {
				if (local22.aShortArray116[local32] != -1) {
					this.WA(0, 0, 0, 0);
				}
				this.WA(local25.anIntArray359[local39], local22.aShortArray119[local32], local22.aShortArray125[local32], local22.aShortArray124[local32]);
			}
		}
		this.L();
		this.method7628();
	}

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
	public abstract void FA();

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([ZIBILclient!no;IZZI[ILclient!sda;Lclient!sda;)V")
	private void method7622(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub37 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) Class299 arg9, @OriginalArg(11) Class299 arg10) {
		@Pc(21) int local21;
		if (arg9 == null || arg4 == 0) {
			for (local21 = 0; local21 < arg10.anInt8360; local21++) {
				@Pc(28) short local28 = arg10.aShortArray122[local21];
				if (arg0 == null || arg5 == arg0[local28] || arg3.anIntArray359[local28] == 0) {
					@Pc(52) short local52 = arg10.aShortArray116[local21];
					if (local52 != -1) {
						this.method7616(arg3.anIntArrayArray70[local52], 0, arg1 & arg3.anIntArray360[local52], arg8, arg7, arg6, 0, 0, 0);
					}
					this.method7616(arg3.anIntArrayArray70[local28], arg10.aShortArray119[local21], arg1 & arg3.anIntArray360[local28], arg8, arg7, arg6, arg3.anIntArray359[local28], arg10.aShortArray125[local21], arg10.aShortArray124[local21]);
				}
			}
			return;
		}
		local21 = 0;
		@Pc(118) int local118 = 0;
		for (@Pc(120) int local120 = 0; local120 < arg3.anInt6466; local120++) {
			@Pc(124) boolean local124 = false;
			if (arg10.anInt8360 > local21 && arg10.aShortArray122[local21] == local120) {
				local124 = true;
			}
			@Pc(142) boolean local142 = false;
			if (arg9.anInt8360 > local118 && local120 == arg9.aShortArray122[local118]) {
				local142 = true;
			}
			if (local124 || local142) {
				if (arg0 == null || arg0[local120] == arg5 || arg3.anIntArray359[local120] == 0) {
					@Pc(191) short local191 = 0;
					@Pc(196) int local196 = arg3.anIntArray359[local120];
					if (local196 == 3 || local196 == 10) {
						local191 = 128;
					}
					@Pc(228) short local228;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(233) short local233;
					@Pc(213) byte local213;
					if (local124) {
						local213 = arg10.aByteArray204[local21];
						local218 = arg10.aShortArray125[local21];
						local223 = arg10.aShortArray124[local21];
						local228 = arg10.aShortArray119[local21];
						local233 = arg10.aShortArray116[local21];
						local21++;
					} else {
						local233 = -1;
						local218 = local191;
						local228 = local191;
						local223 = local191;
						local213 = 0;
					}
					@Pc(258) short local258;
					@Pc(253) short local253;
					@Pc(263) short local263;
					@Pc(268) short local268;
					@Pc(273) byte local273;
					if (local142) {
						local253 = arg9.aShortArray125[local118];
						local258 = arg9.aShortArray119[local118];
						local263 = arg9.aShortArray124[local118];
						local268 = arg9.aShortArray116[local118];
						local273 = arg9.aByteArray204[local118];
						local118++;
					} else {
						local273 = 0;
						local253 = local191;
						local258 = local191;
						local263 = local191;
						local268 = -1;
					}
					if (local233 != -1) {
						this.method7616(arg3.anIntArrayArray70[local233], 0, arg1 & arg3.anIntArray360[local233], arg8, arg7, arg6, 0, 0, 0);
					} else if (local268 != -1) {
						this.method7616(arg3.anIntArrayArray70[local268], 0, arg3.anIntArray360[local268] & arg1, arg8, arg7, arg6, 0, 0, 0);
					}
					@Pc(392) int local392;
					@Pc(402) int local402;
					@Pc(417) int local417;
					if ((local213 & 0x2) == 0 && (local273 & 0x1) == 0) {
						@Pc(359) int local359;
						if (local196 == 2) {
							local359 = local258 - local228 & 0x3FFF;
							@Pc(366) int local366 = local253 - local218 & 0x3FFF;
							@Pc(372) int local372 = local263 - local223 & 0x3FFF;
							if (local359 >= 8192) {
								local359 -= 16384;
							}
							if (local366 >= 8192) {
								local366 -= 16384;
							}
							local392 = local228 + local359 * arg4 / arg2 & 0x3FFF;
							local402 = local218 + local366 * arg4 / arg2 & 0x3FFF;
							if (local372 >= 8192) {
								local372 -= 16384;
							}
							local417 = local223 + arg4 * local372 / arg2 & 0x3FFF;
						} else if (local196 == 9) {
							local359 = local258 - local228 & 0x3FFF;
							if (local359 >= 8192) {
								local359 -= 16384;
							}
							local392 = local359 * arg4 / arg2 + local228 & 0x3FFF;
							local417 = 0;
							local402 = 0;
						} else if (local196 == 7) {
							local359 = local258 - local228 & 0x3F;
							if (local359 >= 32) {
								local359 -= 64;
							}
							local392 = local359 * arg4 / arg2 + local228 & 0x3F;
							local402 = local218 + (local253 - local218) * arg4 / arg2;
							local417 = local223 + (local263 - local223) * arg4 / arg2;
						} else {
							local402 = (local253 - local218) * arg4 / arg2 + local218;
							local392 = (local258 - local228) * arg4 / arg2 + local228;
							local417 = arg4 * (local263 - local223) / arg2 + local223;
						}
					} else {
						local402 = local218;
						local392 = local228;
						local417 = local223;
					}
					this.method7616(arg3.anIntArrayArray70[local120], local392, arg3.anIntArray360[local120] & arg1, arg8, arg7, arg6, local196, local402, local417);
				} else {
					if (local142) {
						local118++;
					}
					if (local124) {
						local21++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
	public abstract void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!pea;IIIILclient!pea;Lclient!pea;ILclient!pea;I[ZIIZI)V")
	public final void method7623(@OriginalArg(0) Class3_Sub7_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub7_Sub15 arg5, @OriginalArg(6) Class3_Sub7_Sub15 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub7_Sub15 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		if (arg4 == -1) {
			return;
		}
		if (arg10 == null || arg11 == -1) {
			this.method7630(arg12, arg13, arg8, arg7, arg4, arg2, 0, arg0);
			return;
		}
		this.method7615();
		if (!this.F()) {
			this.method7628();
			return;
		}
		@Pc(39) Class299 local39 = arg0.aClass299Array1[arg4];
		@Pc(42) Class3_Sub37 local42 = local39.aClass3_Sub37_1;
		@Pc(44) Class299 local44 = null;
		if (arg8 != null) {
			local44 = arg8.aClass299Array1[arg13];
			if (local42 != local44.aClass3_Sub37_1) {
				local44 = null;
			}
		}
		this.method7622(arg10, 65535, arg7, local42, arg2, false, arg12, 0, null, local44, local39);
		@Pc(76) Class299 local76 = arg6.aClass299Array1[arg11];
		@Pc(78) Class299 local78 = null;
		if (arg5 != null) {
			local78 = arg5.aClass299Array1[arg1];
			if (local78.aClass3_Sub37_1 != local42) {
				local78 = null;
			}
		}
		this.method7625(0, new int[0], 0, 0, 0, 0, arg12);
		this.method7622(arg10, 65535, arg9, local76.aClass3_Sub37_1, arg3, true, arg12, 0, null, local78, local76);
		this.L();
		this.method7628();
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class127 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
	protected abstract boolean F();

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	public abstract void method7624();

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
	protected abstract void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBII[IIZLclient!pea;ILclient!pea;)V")
	public final void method7626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) Class3_Sub7_Sub15 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class3_Sub7_Sub15 arg8) {
		if (arg7 == -1) {
			return;
		}
		this.method7615();
		if (!this.F()) {
			this.method7628();
			return;
		}
		@Pc(28) Class299 local28 = arg6.aClass299Array1[arg7];
		@Pc(31) Class3_Sub37 local31 = local28.aClass3_Sub37_1;
		@Pc(33) Class299 local33 = null;
		if (arg8 != null) {
			local33 = arg8.aClass299Array1[arg2];
			if (local31 != local33.aClass3_Sub37_1) {
				local33 = null;
			}
		}
		this.method7622(null, arg0, arg3, local31, arg1, false, arg5, 0, arg4, local33, local28);
		this.L();
		this.method7628();
	}

	@OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILclient!i;ZIII)V")
	protected final void method7627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class127 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(31) int local31 = arg4.method7860(local21 + arg5, local16 + arg0);
		@Pc(35) int local35 = arg1 / 2;
		@Pc(40) int local40 = -arg7 / 2;
		@Pc(51) int local51 = arg4.method7860(local40 + arg5, arg0 - -local35);
		@Pc(56) int local56 = -arg1 / 2;
		@Pc(60) int local60 = arg7 / 2;
		@Pc(72) int local72 = arg4.method7860(arg5 + local60, arg0 - -local56);
		@Pc(76) int local76 = arg1 / 2;
		@Pc(80) int local80 = arg7 / 2;
		@Pc(91) int local91 = arg4.method7860(arg5 + local80, arg0 + local76);
		@Pc(98) int local98 = local51 > local31 ? local31 : local51;
		@Pc(105) int local105 = local91 > local72 ? local72 : local91;
		@Pc(112) int local112 = local51 < local91 ? local51 : local91;
		@Pc(157) int local157;
		if (arg7 != 0) {
			@Pc(127) int local127 = (int) (Math.atan2((double) (local98 - local105), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local127 != 0) {
				if (arg2 != 0) {
					if (local127 > 8192) {
						local157 = 16384 - arg2;
						if (local127 < local157) {
							local127 = local157;
						}
					} else if (local127 > arg2) {
						local127 = arg2;
					}
				}
				this.MA(local127);
			}
		}
		@Pc(180) int local180 = local31 < local72 ? local31 : local72;
		if (arg1 != 0) {
			@Pc(199) int local199 = (int) (Math.atan2((double) (local180 - local112), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local199 != 0) {
				if (arg6 != 0) {
					if (local199 > 8192) {
						local157 = 16384 - arg6;
						if (local157 > local199) {
							local199 = local157;
						}
					} else if (arg6 < local199) {
						local199 = arg6;
					}
				}
				this.W(local199);
			}
		}
		@Pc(242) int local242 = local91 + local31;
		if (local51 + local72 < local242) {
			local242 = local51 + local72;
		}
		local242 = (local242 >> 1) - arg3;
		if (local242 != 0) {
			this.oa(0, local242, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	protected abstract void method7628();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;IZ)V")
	public abstract void method7629(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIBLclient!pea;IIIILclient!pea;)V")
	public final void method7630(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub7_Sub15 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub7_Sub15 arg7) {
		if (arg4 == -1) {
			return;
		}
		this.method7615();
		if (!this.F()) {
			this.method7628();
			return;
		}
		@Pc(21) Class299 local21 = arg7.aClass299Array1[arg4];
		@Pc(24) Class3_Sub37 local24 = local21.aClass3_Sub37_1;
		@Pc(26) Class299 local26 = null;
		if (arg2 != null) {
			local26 = arg2.aClass299Array1[arg1];
			if (local24 != local26.aClass3_Sub37_1) {
				local26 = null;
			}
		}
		this.method7622(null, 65535, arg3, local24, arg5, false, arg0, arg6, null, local26, local21);
		this.L();
		this.method7628();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public abstract void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
	public abstract boolean method7632();

	@OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
	public abstract void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	public abstract void method7634(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
	public abstract int za();

	@OriginalMember(owner = "client!da", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public abstract Class3_Sub7_Sub3 S(@OriginalArg(0) Class3_Sub7_Sub3 arg0);

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
	public abstract int KA();

	@OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
	protected abstract void L();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
	public abstract void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()[Lclient!rea;")
	public abstract Class280[] method7636();
}
