import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class60 {

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
	protected boolean aBoolean668 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	protected Class60() {
	}

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
	protected abstract void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!ufa;II)V")
	public abstract void method7224(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
	public abstract void FA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIILclient!i;I)V")
	protected final void method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class34 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg3 / 2;
		@Pc(31) int local31 = arg6.method6530(local16 + arg2, local21 + arg7);
		@Pc(39) int local39 = arg1 / 2;
		@Pc(44) int local44 = -arg3 / 2;
		@Pc(54) int local54 = arg6.method6530(local39 + arg2, arg7 + local44);
		@Pc(59) int local59 = -arg1 / 2;
		@Pc(63) int local63 = arg3 / 2;
		@Pc(73) int local73 = arg6.method6530(local59 + arg2, arg7 + local63);
		@Pc(77) int local77 = arg1 / 2;
		@Pc(81) int local81 = arg3 / 2;
		@Pc(91) int local91 = arg6.method6530(arg2 + local77, local81 + arg7);
		@Pc(102) int local102 = local31 >= local54 ? local54 : local31;
		@Pc(113) int local113 = local73 < local91 ? local73 : local91;
		@Pc(124) int local124 = local54 >= local91 ? local91 : local54;
		@Pc(131) int local131 = local73 <= local31 ? local73 : local31;
		@Pc(168) int local168;
		if (arg3 != 0) {
			@Pc(150) int local150 = (int) (Math.atan2((double) (local102 - local113), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local150 != 0) {
				if (arg0 != 0) {
					if (local150 > 8192) {
						local168 = 16384 - arg0;
						if (local168 > local150) {
							local150 = local168;
						}
					} else if (local150 > arg0) {
						local150 = arg0;
					}
				}
				this.MA(local150);
			}
		}
		if (arg1 != 0) {
			@Pc(201) int local201 = (int) (Math.atan2((double) (local131 - local124), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local201 != 0) {
				if (arg4 != 0) {
					if (local201 > 8192) {
						local168 = 16384 - arg4;
						if (local168 > local201) {
							local201 = local168;
						}
					} else if (local201 > arg4) {
						local201 = arg4;
					}
				}
				this.W(local201);
			}
		}
		@Pc(244) int local244 = local31 + local91;
		if (local73 + local54 < local244) {
			local244 = local54 + local73;
		}
		local244 = (local244 >> 1) - arg5;
		if (local244 != 0) {
			this.oa(0, local244, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
	public abstract void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLclient!ej;ILclient!ej;IIII)V")
	public final void method7226(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub7_Sub6 arg2, @OriginalArg(4) Class3_Sub7_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 == -1) {
			return;
		}
		this.method7245();
		if (!this.F()) {
			this.method7228();
			return;
		}
		@Pc(27) Class110 local27 = arg3.aClass110Array1[arg0];
		@Pc(30) Class3_Sub23 local30 = local27.aClass3_Sub23_1;
		@Pc(32) Class110 local32 = null;
		if (arg2 != null) {
			local32 = arg2.aClass110Array1[arg5];
			if (local32.aClass3_Sub23_1 != local30) {
				local32 = null;
			}
		}
		this.method7241(null, arg6, 65535, local27, false, arg7, arg1, arg4, local32, null, local30);
		this.L();
		this.method7228();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLclient!ej;IIII[IIILclient!ej;)V")
	public final void method7227(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub7_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class3_Sub7_Sub6 arg8) {
		if (arg4 == -1) {
			return;
		}
		this.method7245();
		if (!this.F()) {
			this.method7228();
			return;
		}
		@Pc(22) Class110 local22 = arg8.aClass110Array1[arg4];
		@Pc(25) Class3_Sub23 local25 = local22.aClass3_Sub23_1;
		@Pc(27) Class110 local27 = null;
		if (arg2 != null) {
			local27 = arg2.aClass110Array1[arg0];
			if (local27.aClass3_Sub23_1 != local25) {
				local27 = null;
			}
		}
		this.method7241(null, arg6, arg7, local22, false, arg3, arg1, 0, local27, arg5, local25);
		this.L();
		this.method7228();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	protected abstract void method7228();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!da;")
	public abstract Class60 method7229(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!ufa;I)V")
	public abstract void method7230(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class41_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
	protected abstract boolean F();

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
	public abstract void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	public abstract void method7231();

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
	public abstract void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public abstract void method7232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
	public abstract void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	public abstract void method7233(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
	public abstract boolean LA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7234(@OriginalArg(0) Class11 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!ej;)V")
	public final void method7235(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7_Sub6 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method7245();
		if (!this.F()) {
			this.method7228();
			return;
		}
		@Pc(23) Class110 local23 = arg1.aClass110Array1[arg0];
		@Pc(26) Class3_Sub23 local26 = local23.aClass3_Sub23_1;
		for (@Pc(34) int local34 = 0; local34 < local23.anInt3382; local34++) {
			@Pc(41) short local41 = local23.aShortArray37[local34];
			if (local26.aBooleanArray12[local41]) {
				if (local23.aShortArray41[local34] != -1) {
					this.WA(0, 0, 0, 0);
				}
				this.WA(local26.anIntArray179[local41], local23.aShortArray35[local34], local23.aShortArray40[local34], local23.aShortArray42[local34]);
			}
		}
		this.L();
		this.method7228();
	}

	@OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
	public abstract int za();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7236(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;ZI)Z")
	public abstract boolean method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()[Lclient!ow;")
	public abstract Class248[] method7238();

	@OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!da", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public abstract Class3_Sub7_Sub13 S(@OriginalArg(0) Class3_Sub7_Sub13 arg0);

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[III[IIIIII)V")
	private void method7239(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(29) int local29;
		if (arg5 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local29 = -arg6;
				arg6 = arg7;
				arg7 = local29;
			} else if (arg8 == 3) {
				local29 = arg6;
				arg6 = arg7;
				arg7 = local29;
			} else if (arg8 == 2) {
				local29 = arg6;
				arg6 = -arg7 & 0x3FFF;
				arg7 = local29 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg7 = -arg7;
				arg6 = -arg6;
			} else if (arg8 == 2) {
				arg7 = -arg7 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local29 = arg6;
				arg6 = -arg7;
				arg7 = local29;
			} else if (arg8 == 3) {
				local29 = arg6;
				arg6 = arg7;
				arg7 = local29;
			} else if (arg8 == 2) {
				local29 = arg6;
				arg6 = arg7 & 0x3FFF;
				arg7 = -local29 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.method7236(arg8, arg3, arg6, arg4, arg7, arg5, arg0);
		} else {
			this.B(arg8, arg3, arg6, arg4, arg7, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!ej;II[ZLclient!ej;IIIZLclient!ej;ILclient!ej;I)V")
	public final void method7240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) Class3_Sub7_Sub6 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class3_Sub7_Sub6 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class3_Sub7_Sub6 arg12, @OriginalArg(14) int arg13) {
		if (arg0 == -1) {
			return;
		}
		if (arg5 == null || arg4 == -1) {
			this.method7226(arg0, arg9, arg12, arg6, 0, arg11, arg1, arg3);
			return;
		}
		this.method7245();
		if (!this.F()) {
			this.method7228();
			return;
		}
		@Pc(38) Class110 local38 = arg6.aClass110Array1[arg0];
		@Pc(41) Class3_Sub23 local41 = local38.aClass3_Sub23_1;
		@Pc(43) Class110 local43 = null;
		if (arg12 != null) {
			local43 = arg12.aClass110Array1[arg11];
			if (local43.aClass3_Sub23_1 != local41) {
				local43 = null;
			}
		}
		this.method7241(arg5, arg1, 65535, local38, false, arg3, arg9, 0, local43, null, local41);
		@Pc(79) Class110 local79 = arg2.aClass110Array1[arg4];
		@Pc(81) Class110 local81 = null;
		if (arg10 != null) {
			local81 = arg10.aClass110Array1[arg8];
			if (local41 != local81.aClass3_Sub23_1) {
				local81 = null;
			}
		}
		this.method7236(0, new int[0], 0, 0, 0, 0, arg9);
		this.method7241(arg5, arg7, 65535, local79, true, arg13, arg9, 0, local81, null, local79.aClass3_Sub23_1);
		this.L();
		this.method7228();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([ZIILclient!gf;ZIZILclient!gf;[ILclient!go;B)V")
	private void method7241(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class110 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class110 arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class3_Sub23 arg10) {
		@Pc(11) int local11;
		if (arg8 == null || arg1 == 0) {
			for (local11 = 0; local11 < arg3.anInt3382; local11++) {
				@Pc(18) short local18 = arg3.aShortArray37[local11];
				if (arg0 == null || arg0[local18] == arg4 || arg10.anIntArray179[local18] == 0) {
					@Pc(35) short local35 = arg3.aShortArray41[local11];
					if (local35 != -1) {
						this.method7239(arg6, arg9, arg2 & arg10.anIntArray181[local35], arg10.anIntArrayArray76[local35], 0, arg7, 0, 0, 0);
					}
					this.method7239(arg6, arg9, arg2 & arg10.anIntArray181[local18], arg10.anIntArrayArray76[local18], arg3.aShortArray40[local11], arg7, arg3.aShortArray35[local11], arg3.aShortArray42[local11], arg10.anIntArray179[local18]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(104) int local104 = 0;
		for (@Pc(106) int local106 = 0; local106 < arg10.anInt3475; local106++) {
			@Pc(110) boolean local110 = false;
			if (arg3.anInt3382 > local11 && local106 == arg3.aShortArray37[local11]) {
				local110 = true;
			}
			@Pc(124) boolean local124 = false;
			if (local104 < arg8.anInt3382 && local106 == arg8.aShortArray37[local104]) {
				local124 = true;
			}
			if (local110 || local124) {
				if (arg0 == null || arg0[local106] == arg4 || arg10.anIntArray179[local106] == 0) {
					@Pc(170) short local170 = 0;
					@Pc(175) int local175 = arg10.anIntArray179[local106];
					if (local175 == 3 || local175 == 10) {
						local170 = 128;
					}
					@Pc(195) short local195;
					@Pc(189) short local189;
					@Pc(191) short local191;
					@Pc(187) short local187;
					@Pc(193) byte local193;
					if (local110) {
						local195 = arg3.aShortArray35[local11];
						local187 = arg3.aShortArray41[local11];
						local189 = arg3.aShortArray40[local11];
						local193 = arg3.aByteArray35[local11];
						local191 = arg3.aShortArray42[local11];
						local11++;
					} else {
						local187 = -1;
						local189 = local170;
						local191 = local170;
						local193 = 0;
						local195 = local170;
					}
					@Pc(231) short local231;
					@Pc(235) short local235;
					@Pc(229) short local229;
					@Pc(227) short local227;
					@Pc(233) byte local233;
					if (local124) {
						local229 = arg8.aShortArray42[local104];
						local233 = arg8.aByteArray35[local104];
						local227 = arg8.aShortArray41[local104];
						local235 = arg8.aShortArray40[local104];
						local231 = arg8.aShortArray35[local104];
						local104++;
					} else {
						local227 = -1;
						local229 = local170;
						local231 = local170;
						local233 = 0;
						local235 = local170;
					}
					if (local187 != -1) {
						this.method7239(arg6, arg9, arg2 & arg10.anIntArray181[local187], arg10.anIntArrayArray76[local187], 0, arg7, 0, 0, 0);
					} else if (local227 != -1) {
						this.method7239(arg6, arg9, arg10.anIntArray181[local227] & arg2, arg10.anIntArrayArray76[local227], 0, arg7, 0, 0, 0);
					}
					@Pc(353) int local353;
					@Pc(357) int local357;
					@Pc(356) int local356;
					if ((local193 & 0x2) == 0 && (local233 & 0x1) == 0) {
						@Pc(337) int local337;
						if (local175 == 2) {
							local337 = local231 - local195 & 0x3FFF;
							@Pc(458) int local458 = local235 - local189 & 0x3FFF;
							if (local458 >= 8192) {
								local458 -= 16384;
							}
							@Pc(469) int local469 = local229 - local191 & 0x3FFF;
							if (local337 >= 8192) {
								local337 -= 16384;
							}
							local353 = local195 + arg1 * local337 / arg5 & 0x3FFF;
							if (local469 >= 8192) {
								local469 -= 16384;
							}
							local357 = local189 + arg1 * local458 / arg5 & 0x3FFF;
							local356 = local191 + local469 * arg1 / arg5 & 0x3FFF;
						} else if (local175 == 9) {
							local337 = local231 - local195 & 0x3FFF;
							if (local337 >= 8192) {
								local337 -= 16384;
							}
							local353 = arg1 * local337 / arg5 + local195 & 0x3FFF;
							local356 = 0;
							local357 = 0;
						} else if (local175 == 7) {
							local337 = local231 - local195 & 0x3F;
							if (local337 >= 32) {
								local337 -= 64;
							}
							local357 = (local235 - local189) * arg1 / arg5 + local189;
							local356 = local191 + (local229 - local191) * arg1 / arg5;
							local353 = local195 + local337 * arg1 / arg5 & 0x3F;
						} else {
							local353 = local195 + arg1 * (local231 - local195) / arg5;
							local356 = (local229 - local191) * arg1 / arg5 + local191;
							local357 = arg1 * (local235 - local189) / arg5 + local189;
						}
					} else {
						local357 = local189;
						local353 = local195;
						local356 = local191;
					}
					this.method7239(arg6, arg9, arg2 & arg10.anIntArray181[local106], arg10.anIntArrayArray76[local106], local357, arg7, local353, local356, local175);
				} else {
					if (local124) {
						local104++;
					}
					if (local110) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()Z")
	public abstract boolean method7242();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()[Lclient!qr;")
	public abstract Class281[] method7244();

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()V")
	protected abstract void method7245();

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
	public abstract int KA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
	public abstract void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
	protected abstract void L();
}
