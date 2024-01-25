import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public abstract class Class112 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	protected Class112() {
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "()I")
	public abstract int method4305();

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "()I")
	public abstract int method4306();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public abstract void method4307(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "()I")
	public abstract int method4308();

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	public abstract void method4309(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "()I")
	public abstract int method4310();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ts;IIIZ)V")
	public abstract void method4311(@OriginalArg(0) Class112 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "()I")
	public abstract int method4313();

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "()Z")
	protected abstract boolean method4314();

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
	public abstract void method4315(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)V")
	protected abstract void method4316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!in;I)V")
	public final void method4318(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub9 arg1) {
		if (arg0 == -1 || !this.method4314()) {
			return;
		}
		@Pc(24) Class149 local24 = arg1.aClass149Array1[arg0];
		@Pc(27) Class5_Sub4 local27 = local24.aClass5_Sub4_1;
		for (@Pc(29) int local29 = 0; local29 < local24.anInt4578; local29++) {
			@Pc(35) short local35 = local24.aShortArray67[local29];
			if (local27.aBooleanArray3[local35]) {
				if (local24.aShortArray70[local29] != -1) {
					this.method4316(0, 0, 0, 0);
				}
				this.method4316(local27.anIntArray43[local35], local24.aShortArray71[local29], local24.aShortArray62[local29], local24.aShortArray66[local29]);
			}
		}
		this.method4330();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(SS)V")
	public abstract void method4319(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!in;ILclient!in;ILclient!in;III[ZZILclient!in;BI)V")
	public final void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub1_Sub9 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub1_Sub9 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean[] arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class5_Sub1_Sub9 arg12, @OriginalArg(14) int arg13) {
		if (arg11 == -1) {
			return;
		}
		if (arg9 == null || arg2 == -1) {
			this.method4333(arg7, arg10, arg11, arg6, arg12, arg5, 0, arg8);
		} else if (this.method4314()) {
			@Pc(34) Class149 local34 = arg12.aClass149Array1[arg11];
			@Pc(37) Class5_Sub4 local37 = local34.aClass5_Sub4_1;
			@Pc(44) Class149 local44 = null;
			if (arg5 != null) {
				local44 = arg5.aClass149Array1[arg6];
				if (local44.aClass5_Sub4_1 != local37) {
					local44 = null;
				}
			}
			@Pc(62) Class149 local62 = arg3.aClass149Array1[arg2];
			@Pc(64) Class149 local64 = null;
			if (arg1 != null) {
				local64 = arg1.aClass149Array1[arg4];
				if (local37 != local64.aClass5_Sub4_1) {
					local64 = null;
				}
			}
			this.method4337(false, 0, arg7, local37, arg10, arg8, null, arg9, local34, local44, 65535);
			this.method4345(0, new int[0], 0, 0, 0, 0, arg10);
			this.method4337(true, 0, arg0, local37, arg10, arg13, null, arg9, local62, local64, 65535);
			this.method4330();
		}
	}

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "()[Lclient!kg;")
	public abstract Class113[] method4321();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!in;ZIIIILclient!in;[III)V")
	public final void method4322(@OriginalArg(1) Class5_Sub1_Sub9 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5_Sub1_Sub9 arg6, @OriginalArg(8) int[] arg7, @OriginalArg(10) int arg8) {
		if (arg4 == -1 || !this.method4314()) {
			return;
		}
		@Pc(24) Class149 local24 = arg6.aClass149Array1[arg4];
		@Pc(27) Class5_Sub4 local27 = local24.aClass5_Sub4_1;
		@Pc(29) Class149 local29 = null;
		if (arg0 != null) {
			local29 = arg0.aClass149Array1[arg2];
			if (local27 != local29.aClass5_Sub4_1) {
				local29 = null;
			}
		}
		this.method4337(false, 0, arg3, local27, arg1, arg5, arg7, null, local24, local29, arg8);
		this.method4330();
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ve;Lclient!uh;II)V")
	public abstract void method4323(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class32_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
	public abstract void method4324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIILclient!dn;III)V")
	protected final void method4325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class51 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg1 / 2;
		@Pc(19) int local19 = -arg5 / 2;
		@Pc(29) int local29 = arg2.method1844(local14 + arg3, arg0 - -local19);
		@Pc(33) int local33 = arg1 / 2;
		@Pc(38) int local38 = -arg5 / 2;
		@Pc(48) int local48 = arg2.method1844(arg3 + local33, local38 + arg0);
		@Pc(57) int local57 = -arg1 / 2;
		@Pc(61) int local61 = arg5 / 2;
		@Pc(71) int local71 = arg2.method1844(arg3 + local57, local61 + arg0);
		@Pc(75) int local75 = arg1 / 2;
		@Pc(79) int local79 = arg5 / 2;
		@Pc(88) int local88 = arg2.method1844(arg3 + local75, local79 + arg0);
		@Pc(95) int local95 = local48 <= local29 ? local48 : local29;
		@Pc(106) int local106 = local71 < local88 ? local71 : local88;
		@Pc(117) int local117 = local88 <= local48 ? local88 : local48;
		@Pc(124) int local124 = local71 > local29 ? local29 : local71;
		if (arg5 != 0) {
			@Pc(143) int local143 = (int) (Math.atan2((double) (local95 - local106), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local143 != 0) {
				this.method4352(local143);
			}
		}
		@Pc(155) int local155 = local29 + local88;
		if (arg1 != 0) {
			@Pc(174) int local174 = (int) (Math.atan2((double) (local124 - local117), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local174 != 0) {
				this.method4315(local174);
			}
		}
		if (local71 + local48 < local155) {
			local155 = local71 + local48;
		}
		local155 = (local155 >> 1) - arg4;
		if (local155 != 0) {
			this.method4324(0, local155, 0);
		}
	}

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "()I")
	public abstract int method4326();

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "()Z")
	public abstract boolean method4327();

	@OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V")
	public abstract void method4328(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "()V")
	public abstract void method4329();

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "()V")
	protected abstract void method4330();

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "()I")
	public abstract int method4331();

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)V")
	public abstract void method4332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZIIILclient!in;Lclient!in;II)V")
	public final void method4333(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5_Sub1_Sub9 arg4, @OriginalArg(6) Class5_Sub1_Sub9 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1 || !this.method4314()) {
			return;
		}
		@Pc(18) Class149 local18 = arg4.aClass149Array1[arg2];
		@Pc(21) Class5_Sub4 local21 = local18.aClass5_Sub4_1;
		@Pc(23) Class149 local23 = null;
		if (arg5 != null) {
			local23 = arg5.aClass149Array1[arg3];
			if (local21 != local23.aClass5_Sub4_1) {
				local23 = null;
			}
		}
		this.method4337(false, arg6, arg0, local21, arg1, arg7, null, null, local18, local23, 65535);
		this.method4330();
	}

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "()[Lclient!od;")
	public abstract Class148[] method4334();

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "()I")
	public abstract int method4335();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZIILclient!ak;ZI[IB[ZLclient!og;Lclient!og;I)V")
	private void method4337(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub4 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) Class149 arg8, @OriginalArg(10) Class149 arg9, @OriginalArg(11) int arg10) {
		@Pc(12) int local12;
		if (arg9 == null || arg5 == 0) {
			for (local12 = 0; local12 < arg8.anInt4578; local12++) {
				@Pc(18) short local18 = arg8.aShortArray67[local12];
				if (arg7 == null || arg7[local18] == arg0 || arg3.anIntArray43[local18] == 0) {
					@Pc(35) short local35 = arg8.aShortArray70[local12];
					if (local35 != -1) {
						this.method4342(arg6, 0, arg1, arg3.anIntArrayArray7[local35], 0, arg10 & arg3.anIntArray42[local35], 0, 0, arg4);
					}
					this.method4342(arg6, arg8.aShortArray66[local12], arg1, arg3.anIntArrayArray7[local18], arg8.aShortArray71[local12], arg10 & arg3.anIntArray42[local18], arg3.anIntArray43[local18], arg8.aShortArray62[local12], arg4);
				}
			}
			return;
		}
		local12 = 0;
		@Pc(101) int local101 = 0;
		for (@Pc(111) int local111 = 0; local111 < arg3.anInt214; local111++) {
			@Pc(114) boolean local114 = false;
			if (local12 < arg8.anInt4578 && arg8.aShortArray67[local12] == local111) {
				local114 = true;
			}
			@Pc(132) boolean local132 = false;
			if (local101 < arg9.anInt4578 && arg9.aShortArray67[local101] == local111) {
				local132 = true;
			}
			if (local114 || local132) {
				if (arg7 == null || arg0 == arg7[local111] || arg3.anIntArray43[local111] == 0) {
					@Pc(176) short local176 = 0;
					@Pc(181) int local181 = arg3.anIntArray43[local111];
					if (local181 == 3) {
						local176 = 128;
					}
					@Pc(200) short local200;
					@Pc(205) short local205;
					@Pc(215) short local215;
					@Pc(210) short local210;
					@Pc(195) byte local195;
					if (local114) {
						local195 = arg8.aByteArray62[local12];
						local200 = arg8.aShortArray71[local12];
						local205 = arg8.aShortArray62[local12];
						local210 = arg8.aShortArray70[local12];
						local215 = arg8.aShortArray66[local12];
						local12++;
					} else {
						local215 = local176;
						local210 = -1;
						local205 = local176;
						local200 = local176;
						local195 = 0;
					}
					@Pc(235) short local235;
					@Pc(239) short local239;
					@Pc(237) short local237;
					@Pc(231) short local231;
					@Pc(233) byte local233;
					if (local132) {
						local235 = arg9.aShortArray71[local101];
						local231 = arg9.aShortArray70[local101];
						local237 = arg9.aShortArray66[local101];
						local233 = arg9.aByteArray62[local101];
						local239 = arg9.aShortArray62[local101];
						local101++;
					} else {
						local231 = -1;
						local233 = 0;
						local235 = local176;
						local237 = local176;
						local239 = local176;
					}
					@Pc(281) int local281;
					@Pc(283) int local283;
					@Pc(279) int local279;
					if ((local195 & 0x2) == 0 && (local233 & 0x1) == 0) {
						@Pc(296) int local296;
						if (local181 == 2) {
							local296 = local235 - local200 & 0x3FFF;
							@Pc(303) int local303 = local239 - local205 & 0x3FFF;
							if (local296 >= 8192) {
								local296 -= 16384;
							}
							@Pc(314) int local314 = local237 - local215 & 0x3FFF;
							if (local303 >= 8192) {
								local303 -= 16384;
							}
							local283 = local303 * arg5 / arg2 + local205 & 0x3FFF;
							if (local314 >= 8192) {
								local314 -= 16384;
							}
							local281 = local296 * arg5 / arg2 + local200 & 0x3FFF;
							local279 = arg5 * local314 / arg2 + local215 & 0x3FFF;
						} else if (local181 == 7) {
							local296 = local235 - local200 & 0x3F;
							if (local296 >= 32) {
								local296 -= 64;
							}
							local281 = arg5 * local296 / arg2 + local200 & 0x3F;
							local279 = arg5 * (local237 - local215) / arg2 + local215;
							local283 = arg5 * (local239 - local205) / arg2 + local205;
						} else {
							local281 = (local235 - local200) * arg5 / arg2 + local200;
							local283 = local205 + (local239 - local205) * arg5 / arg2;
							local279 = local215 + arg5 * (local237 - local215) / arg2;
						}
					} else {
						local279 = local215;
						local281 = local200;
						local283 = local205;
					}
					if (local210 != -1) {
						this.method4342(arg6, 0, arg1, arg3.anIntArrayArray7[local210], 0, arg3.anIntArray42[local210] & arg10, 0, 0, arg4);
					} else if (local231 != -1) {
						this.method4342(arg6, 0, arg1, arg3.anIntArrayArray7[local231], 0, arg3.anIntArray42[local231] & arg10, 0, 0, arg4);
					}
					this.method4342(arg6, local279, arg1, arg3.anIntArrayArray7[local111], local281, arg3.anIntArray42[local111] & arg10, local181, local283, arg4);
				} else {
					if (local114) {
						local12++;
					}
					if (local132) {
						local101++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!ve;Lclient!uh;I)V")
	public abstract void method4338(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class32_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ts", name = "f", descriptor = "(I)V")
	public abstract void method4339(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!ve;Z)Z")
	public abstract boolean method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "()I")
	public abstract int method4341();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "([III[IIIIIIZ)V")
	private void method4342(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(17) int local17;
		if (arg2 == 1) {
			if (arg6 == 0 || arg6 == 1) {
				local17 = -arg4;
				arg4 = arg1;
				arg1 = local17;
			} else if (arg6 == 3) {
				local17 = arg4;
				arg4 = arg1;
				arg1 = local17;
			} else if (arg6 == 2) {
				local17 = arg4;
				arg4 = -arg1 & 0x3FFF;
				arg1 = local17 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg6 == 0 || arg6 == 1) {
				arg4 = -arg4;
				arg1 = -arg1;
			} else if (arg6 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg6 == 0 || arg6 == 1) {
				local17 = arg4;
				arg4 = -arg1;
				arg1 = local17;
			} else if (arg6 == 3) {
				local17 = arg4;
				arg4 = arg1;
				arg1 = local17;
			} else if (arg6 == 2) {
				local17 = arg4;
				arg4 = arg1 & 0x3FFF;
				arg1 = -local17 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.method4345(arg6, arg3, arg4, arg7, arg1, arg2, arg8);
		} else {
			this.method4344(arg6, arg3, arg4, arg7, arg1, arg8, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "()V")
	public abstract void method4343();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method4344(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method4345(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILclient!dn;Lclient!dn;III)V")
	public abstract void method4346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "()I")
	public abstract int method4347();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!lb;)Lclient!lb;")
	public abstract Class5_Sub1_Sub10 method4348(@OriginalArg(0) Class5_Sub1_Sub10 arg0);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BIZ)Lclient!ts;")
	public abstract Class112 method4349(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "(I)V")
	public abstract void method4350(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(SS)V")
	public abstract void method4351(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "(I)V")
	public abstract void method4352(@OriginalArg(0) int arg0);
}
