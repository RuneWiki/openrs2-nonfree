import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public abstract class Class31 {

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
	public static final int[] anIntArray234 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_147 = new Class145(54, 8);

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 407)
	protected Class31() {
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[ZIZIIILclient!nt;Lclient!nt;ILclient!nt;Lclient!nt;II)V", line = 47)
	public final void method3812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub2_Sub13 arg8, @OriginalArg(9) Class2_Sub2_Sub13 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class2_Sub2_Sub13 arg11, @OriginalArg(12) Class2_Sub2_Sub13 arg12, @OriginalArg(14) int arg13) {
		if (arg13 == -1) {
			return;
		}
		if (arg2 == null || arg5 == -1) {
			this.method3829(arg0, arg9, arg7, arg4, arg1, arg13, arg12, 0);
		} else if (this.method3805()) {
			@Pc(33) Class159 local33 = arg12.aClass159Array1[arg13];
			@Pc(36) Class2_Sub18 local36 = local33.aClass2_Sub18_1;
			@Pc(38) Class159 local38 = null;
			if (arg9 != null) {
				local38 = arg9.aClass159Array1[arg7];
				if (local36 != local38.aClass2_Sub18_1) {
					local38 = null;
				}
			}
			@Pc(63) Class159 local63 = arg8.aClass159Array1[arg5];
			@Pc(65) Class159 local65 = null;
			if (arg11 != null) {
				local65 = arg11.aClass159Array1[arg6];
				if (local65.aClass2_Sub18_1 != local36) {
					local65 = null;
				}
			}
			this.method3850(false, null, local36, arg2, local33, 65535, 0, arg1, arg4, local38, arg0);
			this.method3822(0, new int[0], 0, 0, 0, 0, arg4);
			this.method3850(true, null, local36, arg2, local63, 65535, 0, arg3, arg4, local65, arg10);
			this.method3837();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!nt;BI)V", line = 112)
	public final void method3819(@OriginalArg(0) Class2_Sub2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method3805()) {
			return;
		}
		@Pc(19) Class159 local19 = arg0.aClass159Array1[arg1];
		@Pc(22) Class2_Sub18 local22 = local19.aClass2_Sub18_1;
		for (@Pc(28) int local28 = 0; local28 < local19.anInt4043; local28++) {
			@Pc(35) short local35 = local19.aShortArray81[local28];
			if (local22.aBooleanArray25[local35]) {
				if (local19.aShortArray88[local28] != -1) {
					this.method3826(0, 0, 0, 0);
				}
				this.method3826(local22.anIntArray168[local35], local19.aShortArray80[local28], local19.aShortArray86[local28], local19.aShortArray87[local28]);
			}
		}
		this.method3837();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!nt;IIIILclient!nt;ZZ[I)V", line = 159)
	public final void method3824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub2_Sub13 arg6, @OriginalArg(8) boolean arg7, @OriginalArg(10) int[] arg8) {
		if (arg4 == -1 || !this.method3805()) {
			return;
		}
		@Pc(16) Class159 local16 = arg6.aClass159Array1[arg4];
		@Pc(19) Class2_Sub18 local19 = local16.aClass2_Sub18_1;
		@Pc(21) Class159 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass159Array1[arg5];
			if (local21.aClass2_Sub18_1 != local19) {
				local21 = null;
			}
		}
		this.method3850(false, arg8, local19, null, local16, arg3, 0, arg1, arg7, local21, arg0);
		this.method3837();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!nt;IBZIILclient!nt;I)V", line = 194)
	public final void method3829(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub13 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub2_Sub13 arg6, @OriginalArg(8) int arg7) {
		if (arg5 == -1 || !this.method3805()) {
			return;
		}
		@Pc(22) Class159 local22 = arg6.aClass159Array1[arg5];
		@Pc(25) Class2_Sub18 local25 = local22.aClass2_Sub18_1;
		@Pc(27) Class159 local27 = null;
		if (arg1 != null) {
			local27 = arg1.aClass159Array1[arg2];
			if (local25 != local27.aClass2_Sub18_1) {
				local27 = null;
			}
		}
		this.method3850(false, null, local25, null, local22, 65535, arg7, arg4, arg3, local27, arg0);
		this.method3837();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[III[IZIII)V", line = 308)
	private void method3847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(36) int local36;
		if (arg7 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local36 = -arg8;
				arg8 = arg4;
				arg4 = local36;
			} else if (arg1 == 3) {
				local36 = arg8;
				arg8 = arg4;
				arg4 = local36;
			} else if (arg1 == 2) {
				local36 = arg8;
				arg8 = -arg4 & 0x3FFF;
				arg4 = local36 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg8 = -arg8;
				arg4 = -arg4;
			} else if (arg1 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local36 = arg8;
				arg8 = -arg4;
				arg4 = local36;
			} else if (arg1 == 3) {
				local36 = arg8;
				arg8 = arg4;
				arg4 = local36;
			} else if (arg1 == 2) {
				local36 = arg8;
				arg8 = arg4 & 0x3FFF;
				arg4 = -local36 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.method3822(arg1, arg5, arg8, arg0, arg4, arg7, arg6);
		} else {
			this.method3835(arg1, arg5, arg8, arg0, arg4, arg6, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBIIILclient!tf;I)V", line = 482)
	protected final void method3849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6 arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg0 / 2;
		@Pc(19) int local19 = -arg2 / 2;
		@Pc(29) int local29 = arg4.method5729(arg5 + local14, local19 + arg1);
		@Pc(33) int local33 = arg0 / 2;
		@Pc(38) int local38 = -arg2 / 2;
		@Pc(47) int local47 = arg4.method5729(local33 + arg5, local38 + arg1);
		@Pc(52) int local52 = -arg0 / 2;
		@Pc(56) int local56 = arg2 / 2;
		@Pc(65) int local65 = arg4.method5729(local52 + arg5, arg1 + local56);
		@Pc(69) int local69 = arg0 / 2;
		@Pc(73) int local73 = arg2 / 2;
		@Pc(82) int local82 = arg4.method5729(arg5 + local69, local73 + arg1);
		@Pc(89) int local89 = local29 < local47 ? local29 : local47;
		@Pc(100) int local100 = local82 > local65 ? local65 : local82;
		@Pc(107) int local107 = local47 >= local82 ? local82 : local47;
		if (arg2 != 0) {
			@Pc(122) int local122 = (int) (Math.atan2((double) (local89 - local100), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local122 != 0) {
				this.method3825(local122);
			}
		}
		@Pc(134) int local134 = local65 > local29 ? local29 : local65;
		@Pc(138) int local138 = local82 + local29;
		if (arg0 != 0) {
			@Pc(154) int local154 = (int) (Math.atan2((double) (local134 - local107), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local154 != 0) {
				this.method3816(local154);
			}
		}
		if (local138 > local65 + local47) {
			local138 = local47 + local65;
		}
		local138 = (local138 >> 1) - arg3;
		if (local138 != 0) {
			this.method3814(0, local138, 0);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z[ILclient!ib;[ZLclient!nd;IIIZBLclient!nd;I)V", line = 559)
	private void method3850(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class2_Sub18 arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) Class159 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) Class159 arg9, @OriginalArg(11) int arg10) {
		@Pc(18) int local18;
		if (arg9 == null || arg7 == 0) {
			for (local18 = 0; local18 < arg4.anInt4043; local18++) {
				@Pc(25) short local25 = arg4.aShortArray81[local18];
				if (arg3 == null || arg0 == arg3[local25] || arg2.anIntArray168[local25] == 0) {
					@Pc(49) short local49 = arg4.aShortArray88[local18];
					if (local49 != -1) {
						this.method3847(0, 0, arg1, arg5 & arg2.anIntArray169[local49], 0, arg2.anIntArrayArray21[local49], arg8, arg6, 0);
					}
					this.method3847(arg4.aShortArray86[local18], arg2.anIntArray168[local25], arg1, arg5 & arg2.anIntArray169[local25], arg4.aShortArray87[local18], arg2.anIntArrayArray21[local25], arg8, arg6, arg4.aShortArray80[local18]);
				}
			}
			return;
		}
		local18 = 0;
		@Pc(119) int local119 = 0;
		for (@Pc(121) int local121 = 0; local121 < arg2.anInt2676; local121++) {
			@Pc(125) boolean local125 = false;
			if (local18 < arg4.anInt4043 && arg4.aShortArray81[local18] == local121) {
				local125 = true;
			}
			@Pc(143) boolean local143 = false;
			if (arg9.anInt4043 > local119 && local121 == arg9.aShortArray81[local119]) {
				local143 = true;
			}
			if (local125 || local143) {
				if (arg3 == null || arg0 == arg3[local121] || arg2.anIntArray168[local121] == 0) {
					@Pc(193) short local193 = 0;
					@Pc(198) int local198 = arg2.anIntArray168[local121];
					if (local198 == 3) {
						local193 = 128;
					}
					@Pc(207) short local207;
					@Pc(211) short local211;
					@Pc(215) short local215;
					@Pc(213) short local213;
					@Pc(209) byte local209;
					if (local125) {
						local215 = arg4.aShortArray87[local18];
						local211 = arg4.aShortArray86[local18];
						local207 = arg4.aShortArray80[local18];
						local213 = arg4.aShortArray88[local18];
						local209 = arg4.aByteArray44[local18];
						local18++;
					} else {
						local207 = local193;
						local209 = 0;
						local211 = local193;
						local213 = -1;
						local215 = local193;
					}
					@Pc(270) short local270;
					@Pc(250) short local250;
					@Pc(265) short local265;
					@Pc(255) short local255;
					@Pc(260) byte local260;
					if (local143) {
						local250 = arg9.aShortArray86[local119];
						local255 = arg9.aShortArray88[local119];
						local260 = arg9.aByteArray44[local119];
						local265 = arg9.aShortArray87[local119];
						local270 = arg9.aShortArray80[local119];
						local119++;
					} else {
						local270 = local193;
						local260 = 0;
						local265 = local193;
						local250 = local193;
						local255 = -1;
					}
					if (local213 != -1) {
						this.method3847(0, 0, arg1, arg2.anIntArray169[local213] & arg5, 0, arg2.anIntArrayArray21[local213], arg8, arg6, 0);
					} else if (local255 != -1) {
						this.method3847(0, 0, arg1, arg5 & arg2.anIntArray169[local255], 0, arg2.anIntArrayArray21[local255], arg8, arg6, 0);
					}
					@Pc(396) int local396;
					@Pc(406) int local406;
					@Pc(420) int local420;
					if ((local209 & 0x2) == 0 && (local260 & 0x1) == 0) {
						@Pc(362) int local362;
						if (local198 == 2) {
							local362 = local270 - local207 & 0x3FFF;
							@Pc(368) int local368 = local250 - local211 & 0x3FFF;
							if (local368 >= 8192) {
								local368 -= 16384;
							}
							@Pc(379) int local379 = local265 - local215 & 0x3FFF;
							if (local362 >= 8192) {
								local362 -= 16384;
							}
							local396 = local207 + local362 * arg7 / arg10 & 0x3FFF;
							local406 = local368 * arg7 / arg10 + local211 & 0x3FFF;
							if (local379 >= 8192) {
								local379 -= 16384;
							}
							local420 = arg7 * local379 / arg10 + local215 & 0x3FFF;
						} else if (local198 == 7) {
							local362 = local270 - local207 & 0x3F;
							if (local362 >= 32) {
								local362 -= 64;
							}
							local420 = local215 + (local265 - local215) * arg7 / arg10;
							local396 = arg7 * local362 / arg10 + local207 & 0x3F;
							local406 = local211 + arg7 * (local250 - local211) / arg10;
						} else {
							local406 = local211 + (local250 - local211) * arg7 / arg10;
							local420 = local215 + arg7 * (local265 - local215) / arg10;
							local396 = arg7 * (local270 - local207) / arg10 + local207;
						}
					} else {
						local396 = local207;
						local406 = local211;
						local420 = local215;
					}
					this.method3847(local406, local198, arg1, arg5 & arg2.anIntArray169[local121], local420, arg2.anIntArrayArray21[local121], arg8, arg6, local396);
				} else {
					if (local143) {
						local119++;
					}
					if (local125) {
						local18++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIZ)Lclient!gn;")
	public abstract Class31 method3801(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "()Z")
	public abstract boolean method3802();

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "()I")
	public abstract int method3803();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!gn;IIIZ)V")
	public abstract void method3804(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "()Z")
	protected abstract boolean method3805();

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "()I")
	public abstract int method3806();

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "()I")
	public abstract int method3807();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public abstract void method3808(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "()[Lclient!jf;")
	public abstract Class114[] method3809();

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "()V")
	public abstract void method3811();

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "()I")
	public abstract int method3813();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	public abstract void method3814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public abstract void method3815(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public abstract void method3816(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(SS)V")
	public abstract void method3817(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "()I")
	public abstract int method3818();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!tf;Lclient!tf;III)V")
	public abstract void method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) Class6 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!on;Z)Z")
	public abstract boolean method3821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method3822(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "()I")
	public abstract int method3823();

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V")
	public abstract void method3825(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIII)V")
	protected abstract void method3826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "()I")
	public abstract int method3827();

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "()I")
	public abstract int method3828();

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V")
	public abstract void method3831(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "()I")
	public abstract int method3832();

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "()I")
	public abstract int method3833();

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)V")
	public abstract void method3834(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method3835(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!on;Lclient!au;I)V")
	public abstract void method3836(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "()V")
	protected abstract void method3837();

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "()V")
	public abstract void method3838();

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(SS)V")
	public abstract void method3839(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!kb;)Lclient!kb;")
	public abstract Class2_Sub2_Sub4 method3840(@OriginalArg(0) Class2_Sub2_Sub4 arg0);

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "()[Lclient!nm;")
	public abstract Class163[] method3841();

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(III)V")
	public abstract void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!on;Lclient!au;II)V")
	public abstract void method3845(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "(I)V")
	public abstract void method3846(@OriginalArg(0) int arg0);
}
