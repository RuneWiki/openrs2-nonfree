import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class65 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Z")
	protected boolean aBoolean691 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	protected Class65() {
	}

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7665(@OriginalArg(0) Class81 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	protected abstract void method7666();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!hea;I)V")
	public final void method7667(@OriginalArg(1) Class4_Sub6_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7666();
		if (!this.F()) {
			this.method7671();
			return;
		}
		@Pc(22) Class122 local22 = arg0.aClass122Array1[arg1];
		@Pc(31) Class4_Sub50 local31 = local22.aClass4_Sub50_1;
		for (@Pc(33) int local33 = 0; local33 < local22.anInt3369; local33++) {
			@Pc(40) short local40 = local22.aShortArray33[local33];
			if (local31.aBooleanArray26[local40]) {
				if (local22.aShortArray34[local33] != -1) {
					this.WA(0, 0, 0, 0);
				}
				this.WA(local31.anIntArray558[local40], local22.aShortArray28[local33], local22.aShortArray32[local33], local22.aShortArray29[local33]);
			}
		}
		this.L();
		this.method7671();
	}

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
	public abstract void FA();

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;IZ)V")
	public abstract void method7668(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!uv;ZII[ZLclient!ge;ZLclient!ge;[IIII)V")
	private void method7669(@OriginalArg(0) Class4_Sub50 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) Class122 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) Class122 arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(17) int local17;
		if (arg7 == null || arg2 == 0) {
			for (local17 = 0; local17 < arg5.anInt3369; local17++) {
				@Pc(24) short local24 = arg5.aShortArray33[local17];
				if (arg4 == null || arg6 == arg4[local24] || arg0.anIntArray558[local24] == 0) {
					@Pc(41) short local41 = arg5.aShortArray34[local17];
					if (local41 != -1) {
						this.method7674(0, arg0.anIntArrayArray59[local41], arg8, arg0.anIntArray559[local41] & arg3, arg1, 0, 0, arg10, 0);
					}
					this.method7674(arg5.aShortArray32[local17], arg0.anIntArrayArray59[local24], arg8, arg0.anIntArray559[local24] & arg3, arg1, arg5.aShortArray28[local17], arg0.anIntArray558[local24], arg10, arg5.aShortArray29[local17]);
				}
			}
			return;
		}
		local17 = 0;
		@Pc(110) int local110 = 0;
		for (@Pc(112) int local112 = 0; local112 < arg0.anInt9983; local112++) {
			@Pc(116) boolean local116 = false;
			if (local17 < arg5.anInt3369 && arg5.aShortArray33[local17] == local112) {
				local116 = true;
			}
			@Pc(134) boolean local134 = false;
			if (local110 < arg7.anInt3369 && local112 == arg7.aShortArray33[local110]) {
				local134 = true;
			}
			if (local116 || local134) {
				if (arg4 == null || arg6 == arg4[local112] || arg0.anIntArray558[local112] == 0) {
					@Pc(179) short local179 = 0;
					@Pc(184) int local184 = arg0.anIntArray558[local112];
					if (local184 == 3 || local184 == 10) {
						local179 = 128;
					}
					@Pc(216) short local216;
					@Pc(221) short local221;
					@Pc(211) short local211;
					@Pc(201) short local201;
					@Pc(206) byte local206;
					if (local116) {
						local201 = arg5.aShortArray34[local17];
						local206 = arg5.aByteArray28[local17];
						local211 = arg5.aShortArray29[local17];
						local216 = arg5.aShortArray28[local17];
						local221 = arg5.aShortArray32[local17];
						local17++;
					} else {
						local211 = local179;
						local206 = 0;
						local221 = local179;
						local216 = local179;
						local201 = -1;
					}
					@Pc(261) short local261;
					@Pc(256) short local256;
					@Pc(246) short local246;
					@Pc(251) short local251;
					@Pc(241) byte local241;
					if (local134) {
						local241 = arg7.aByteArray28[local110];
						local246 = arg7.aShortArray29[local110];
						local251 = arg7.aShortArray34[local110];
						local256 = arg7.aShortArray32[local110];
						local261 = arg7.aShortArray28[local110];
						local110++;
					} else {
						local256 = local179;
						local246 = local179;
						local261 = local179;
						local251 = -1;
						local241 = 0;
					}
					if (local201 != -1) {
						this.method7674(0, arg0.anIntArrayArray59[local201], arg8, arg3 & arg0.anIntArray559[local201], arg1, 0, 0, arg10, 0);
					} else if (local251 != -1) {
						this.method7674(0, arg0.anIntArrayArray59[local251], arg8, arg3 & arg0.anIntArray559[local251], arg1, 0, 0, arg10, 0);
					}
					@Pc(337) int local337;
					@Pc(335) int local335;
					@Pc(339) int local339;
					if ((local206 & 0x2) == 0 && (local241 & 0x1) == 0) {
						@Pc(351) int local351;
						if (local184 == 2) {
							local351 = local261 - local216 & 0x3FFF;
							@Pc(358) int local358 = local256 - local221 & 0x3FFF;
							@Pc(365) int local365 = local246 - local211 & 0x3FFF;
							if (local351 >= 8192) {
								local351 -= 16384;
							}
							if (local358 >= 8192) {
								local358 -= 16384;
							}
							local337 = local351 * arg2 / arg9 + local216 & 0x3FFF;
							if (local365 >= 8192) {
								local365 -= 16384;
							}
							local335 = local221 + arg2 * local358 / arg9 & 0x3FFF;
							local339 = arg2 * local365 / arg9 + local211 & 0x3FFF;
						} else if (local184 == 9) {
							local351 = local261 - local216 & 0x3FFF;
							if (local351 >= 8192) {
								local351 -= 16384;
							}
							local337 = local216 + local351 * arg2 / arg9 & 0x3FFF;
							local339 = 0;
							local335 = 0;
						} else if (local184 == 7) {
							local351 = local261 - local216 & 0x3F;
							if (local351 >= 32) {
								local351 -= 64;
							}
							local337 = local216 + arg2 * local351 / arg9 & 0x3F;
							local339 = local211 + (local246 - local211) * arg2 / arg9;
							local335 = (local256 - local221) * arg2 / arg9 + local221;
						} else {
							local335 = arg2 * (local256 - local221) / arg9 + local221;
							local337 = local216 + (local261 - local216) * arg2 / arg9;
							local339 = local211 + (local246 - local211) * arg2 / arg9;
						}
					} else {
						local335 = local221;
						local337 = local216;
						local339 = local211;
					}
					this.method7674(local335, arg0.anIntArrayArray59[local112], arg8, arg0.anIntArray559[local112] & arg3, arg1, local337, local184, arg10, local339);
				} else {
					if (local134) {
						local110++;
					}
					if (local116) {
						local17++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLclient!hea;I[IIIIILclient!hea;I)V")
	public final void method7670(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class4_Sub6_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class4_Sub6_Sub8 arg7, @OriginalArg(10) int arg8) {
		if (arg8 == -1) {
			return;
		}
		this.method7666();
		if (!this.F()) {
			this.method7671();
			return;
		}
		@Pc(20) Class122 local20 = arg2.aClass122Array1[arg8];
		@Pc(23) Class4_Sub50 local23 = local20.aClass4_Sub50_1;
		@Pc(25) Class122 local25 = null;
		if (arg7 != null) {
			local25 = arg7.aClass122Array1[arg5];
			if (local25.aClass4_Sub50_1 != local23) {
				local25 = null;
			}
		}
		this.method7669(local23, arg1, arg3, arg6, null, local20, false, local25, arg4, arg0, 0);
		this.L();
		this.method7671();
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	protected abstract void method7671();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!i;IIIIIII)V")
	protected final void method7672(@OriginalArg(1) Class115 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg4 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(31) int local31 = arg0.method8064(local16 + arg5, local21 + arg7);
		@Pc(35) int local35 = arg4 / 2;
		@Pc(40) int local40 = -arg1 / 2;
		@Pc(50) int local50 = arg0.method8064(local35 + arg5, local40 + arg7);
		@Pc(55) int local55 = -arg4 / 2;
		@Pc(59) int local59 = arg1 / 2;
		@Pc(69) int local69 = arg0.method8064(local55 + arg5, arg7 + local59);
		@Pc(73) int local73 = arg4 / 2;
		@Pc(77) int local77 = arg1 / 2;
		@Pc(87) int local87 = arg0.method8064(local73 + arg5, local77 + arg7);
		@Pc(94) int local94 = local31 >= local50 ? local50 : local31;
		@Pc(105) int local105 = local69 >= local87 ? local87 : local69;
		@Pc(116) int local116 = local87 <= local50 ? local87 : local50;
		@Pc(161) int local161;
		if (arg1 != 0) {
			@Pc(132) int local132 = (int) (Math.atan2((double) (local94 - local105), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local132 != 0) {
				if (arg6 != 0) {
					if (local132 > 8192) {
						local161 = 16384 - arg6;
						if (local132 < local161) {
							local132 = local161;
						}
					} else if (local132 > arg6) {
						local132 = arg6;
					}
				}
				this.MA(local132);
			}
		}
		@Pc(180) int local180 = local31 < local69 ? local31 : local69;
		@Pc(185) int local185 = local31 + local87;
		if (arg4 != 0) {
			@Pc(203) int local203 = (int) (Math.atan2((double) (local180 - local116), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local203 != 0) {
				if (arg3 != 0) {
					if (local203 > 8192) {
						local161 = 16384 - arg3;
						if (local203 < local161) {
							local203 = local161;
						}
					} else if (arg3 < local203) {
						local203 = arg3;
					}
				}
				this.W(local203);
			}
		}
		if (local185 > local69 + local50) {
			local185 = local50 + local69;
		}
		local185 = (local185 >> 1) - arg2;
		if (local185 != 0) {
			this.oa(0, local185, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
	protected abstract boolean F();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[I[IIZIIZII)V")
	private void method7674(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(25) int local25;
		if (arg7 == 1) {
			if (arg6 == 0 || arg6 == 1) {
				local25 = -arg5;
				arg5 = arg8;
				arg8 = local25;
			} else if (arg6 == 3) {
				local25 = arg5;
				arg5 = arg8;
				arg8 = local25;
			} else if (arg6 == 2) {
				local25 = arg5;
				arg5 = -arg8 & 0x3FFF;
				arg8 = local25 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg6 == 0 || arg6 == 1) {
				arg5 = -arg5;
				arg8 = -arg8;
			} else if (arg6 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg6 == 0 || arg6 == 1) {
				local25 = arg5;
				arg5 = -arg8;
				arg8 = local25;
			} else if (arg6 == 3) {
				local25 = arg5;
				arg5 = arg8;
				arg8 = local25;
			} else if (arg6 == 2) {
				local25 = arg5;
				arg5 = arg8 & 0x3FFF;
				arg8 = -local25 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.method7673(arg6, arg1, arg5, arg0, arg8, arg7, arg4);
		} else {
			this.B(arg6, arg1, arg5, arg0, arg8, arg4, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()[Lclient!kw;")
	public abstract Class190[] method7675();

	@OriginalMember(owner = "client!da", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public abstract Class4_Sub6_Sub7 S(@OriginalArg(0) Class4_Sub6_Sub7 arg0);

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
	public abstract void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	public abstract void method7676();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	public abstract void method7677(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) Class115 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
	protected abstract void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!j;I)V")
	public abstract void method7679(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
	public abstract void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
	public abstract int KA();

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
	public abstract void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[ZLclient!hea;Lclient!hea;IZLclient!hea;IIIIILclient!hea;I)V")
	public final void method7681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) Class4_Sub6_Sub8 arg3, @OriginalArg(4) Class4_Sub6_Sub8 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) Class4_Sub6_Sub8 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class4_Sub6_Sub8 arg12, @OriginalArg(14) int arg13) {
		if (arg9 == -1) {
			return;
		}
		if (arg2 == null || arg11 == -1) {
			this.method7689(0, arg6, arg10, arg12, arg13, arg5, arg9, arg7);
			return;
		}
		this.method7666();
		if (!this.F()) {
			this.method7671();
			return;
		}
		@Pc(54) Class122 local54 = arg7.aClass122Array1[arg9];
		@Pc(57) Class4_Sub50 local57 = local54.aClass4_Sub50_1;
		@Pc(59) Class122 local59 = null;
		if (arg12 != null) {
			local59 = arg12.aClass122Array1[arg13];
			if (local59.aClass4_Sub50_1 != local57) {
				local59 = null;
			}
		}
		this.method7669(local57, arg6, arg5, 65535, arg2, local54, false, local59, null, arg10, 0);
		@Pc(91) Class122 local91 = arg4.aClass122Array1[arg11];
		@Pc(93) Class122 local93 = null;
		if (arg3 != null) {
			local93 = arg3.aClass122Array1[arg1];
			if (local93.aClass4_Sub50_1 != local57) {
				local93 = null;
			}
		}
		this.method7673(0, new int[0], 0, 0, 0, 0, arg6);
		this.method7669(local91.aClass4_Sub50_1, arg6, arg8, 65535, arg2, local91, true, local93, null, arg0, 0);
		this.L();
		this.method7671();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!da;")
	public abstract Class65 method7682(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
	public abstract int za();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public abstract void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
	protected abstract void L();

	@OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
	public abstract boolean LA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;ZI)Z")
	public abstract boolean method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
	public abstract void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!j;II)V")
	public abstract void method7686(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
	public abstract void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()Z")
	public abstract boolean method7687();

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()[Lclient!cea;")
	public abstract Class52[] method7688();

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZILclient!hea;IIIILclient!hea;)V")
	public final void method7689(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub6_Sub8 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class4_Sub6_Sub8 arg7) {
		if (arg6 == -1) {
			return;
		}
		this.method7666();
		if (!this.F()) {
			this.method7671();
			return;
		}
		@Pc(20) Class122 local20 = arg7.aClass122Array1[arg6];
		@Pc(23) Class4_Sub50 local23 = local20.aClass4_Sub50_1;
		@Pc(25) Class122 local25 = null;
		if (arg3 != null) {
			local25 = arg3.aClass122Array1[arg4];
			if (local25.aClass4_Sub50_1 != local23) {
				local25 = null;
			}
		}
		this.method7669(local23, arg1, arg5, 65535, null, local20, false, local25, null, arg2, arg0);
		this.L();
		this.method7671();
	}

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);
}
