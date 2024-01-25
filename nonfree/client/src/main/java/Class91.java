import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public abstract class Class91 {

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	protected Class91() {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!ii;I)V")
	public abstract void method3276(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
	protected abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
	public abstract int P();

	@OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
	public abstract int m();

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public abstract void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
	protected abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()[Lclient!pd;")
	public abstract Class189[] method3278();

	@OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
	public abstract void aa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
	protected abstract boolean w();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZLclient!cq;)V")
	public final void method3279(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub5_Sub3 arg1) {
		if (arg0 == -1 || !this.w()) {
			return;
		}
		@Pc(19) Class201 local19 = arg1.aClass201Array1[arg0];
		@Pc(22) Class2_Sub16 local22 = local19.aClass2_Sub16_1;
		for (@Pc(24) int local24 = 0; local24 < local19.anInt5577; local24++) {
			@Pc(31) short local31 = local19.aShortArray101[local24];
			if (local22.aBooleanArray16[local31]) {
				if (local19.aShortArray99[local24] != -1) {
					this.N(0, 0, 0, 0);
				}
				this.N(local22.anIntArray278[local31], local19.aShortArray98[local24], local19.aShortArray102[local24], local19.aShortArray97[local24]);
			}
		}
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
	public abstract void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
	public abstract void UA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!ii;II)V")
	public abstract void method3280(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class8_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!qf;IIILclient!qf;[I[ZILclient!hl;ZBZ)V")
	private void method3281(@OriginalArg(0) Class201 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class201 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub16 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(11) boolean arg10) {
		@Pc(11) int local11;
		if (arg4 == null || arg1 == 0) {
			for (local11 = 0; local11 < arg0.anInt5577; local11++) {
				@Pc(18) short local18 = arg0.aShortArray101[local11];
				if (arg6 == null || arg6[local18] == arg10 || arg8.anIntArray278[local18] == 0) {
					@Pc(35) short local35 = arg0.aShortArray99[local11];
					if (local35 != -1) {
						this.method3283(0, arg2 & arg8.anIntArray277[local35], 0, 0, arg9, arg3, arg5, arg8.anIntArrayArray29[local35], 0);
					}
					this.method3283(arg8.anIntArray278[local18], arg8.anIntArray277[local18] & arg2, arg0.aShortArray97[local11], arg0.aShortArray98[local11], arg9, arg3, arg5, arg8.anIntArrayArray29[local18], arg0.aShortArray102[local11]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(105) int local105 = 0;
		for (@Pc(107) int local107 = 0; local107 < arg8.anInt3093; local107++) {
			@Pc(111) boolean local111 = false;
			if (local11 < arg0.anInt5577 && arg0.aShortArray101[local11] == local107) {
				local111 = true;
			}
			@Pc(133) boolean local133 = false;
			if (local105 < arg4.anInt5577 && local107 == arg4.aShortArray101[local105]) {
				local133 = true;
			}
			if (local111 || local133) {
				if (arg6 == null || arg10 == arg6[local107] || arg8.anIntArray278[local107] == 0) {
					@Pc(183) short local183 = 0;
					@Pc(188) int local188 = arg8.anIntArray278[local107];
					if (local188 == 3 || local188 == 10) {
						local183 = 128;
					}
					@Pc(208) short local208;
					@Pc(213) short local213;
					@Pc(223) short local223;
					@Pc(218) short local218;
					@Pc(203) byte local203;
					if (local111) {
						local203 = arg0.aByteArray108[local11];
						local208 = arg0.aShortArray98[local11];
						local213 = arg0.aShortArray102[local11];
						local218 = arg0.aShortArray99[local11];
						local223 = arg0.aShortArray97[local11];
						local11++;
					} else {
						local223 = local183;
						local203 = 0;
						local213 = local183;
						local208 = local183;
						local218 = -1;
					}
					@Pc(263) short local263;
					@Pc(253) short local253;
					@Pc(258) short local258;
					@Pc(248) short local248;
					@Pc(243) byte local243;
					if (local133) {
						local243 = arg4.aByteArray108[local105];
						local248 = arg4.aShortArray99[local105];
						local253 = arg4.aShortArray102[local105];
						local258 = arg4.aShortArray97[local105];
						local263 = arg4.aShortArray98[local105];
						local105++;
					} else {
						local258 = local183;
						local253 = local183;
						local243 = 0;
						local263 = local183;
						local248 = -1;
					}
					@Pc(289) int local289;
					@Pc(293) int local293;
					@Pc(291) int local291;
					if ((local203 & 0x2) == 0 && (local243 & 0x1) == 0) {
						@Pc(315) int local315;
						if (local188 == 2) {
							local315 = local263 - local208 & 0x3FFF;
							@Pc(431) int local431 = local253 - local213 & 0x3FFF;
							@Pc(438) int local438 = local258 - local223 & 0x3FFF;
							if (local315 >= 8192) {
								local315 -= 16384;
							}
							if (local431 >= 8192) {
								local431 -= 16384;
							}
							local289 = local208 + local315 * arg1 / arg7 & 0x3FFF;
							local293 = arg1 * local431 / arg7 + local213 & 0x3FFF;
							if (local438 >= 8192) {
								local438 -= 16384;
							}
							local291 = local438 * arg1 / arg7 + local223 & 0x3FFF;
						} else if (local188 == 9) {
							local315 = local263 - local208 & 0x3FFF;
							if (local315 >= 8192) {
								local315 -= 16384;
							}
							local289 = arg1 * local315 / arg7 + local208 & 0x3FFF;
							local291 = 0;
							local293 = 0;
						} else if (local188 == 7) {
							local315 = local263 - local208 & 0x3F;
							if (local315 >= 32) {
								local315 -= 64;
							}
							local293 = local213 + arg1 * (local253 - local213) / arg7;
							local291 = arg1 * (local258 - local223) / arg7 + local223;
							local289 = local208 + arg1 * local315 / arg7 & 0x3F;
						} else {
							local293 = (local253 - local213) * arg1 / arg7 + local213;
							local291 = (local258 - local223) * arg1 / arg7 + local223;
							local289 = local208 + arg1 * (local263 - local208) / arg7;
						}
					} else {
						local289 = local208;
						local291 = local223;
						local293 = local213;
					}
					if (local218 != -1) {
						this.method3283(0, arg8.anIntArray277[local218] & arg2, 0, 0, arg9, arg3, arg5, arg8.anIntArrayArray29[local218], 0);
					} else if (local248 != -1) {
						this.method3283(0, arg8.anIntArray277[local248] & arg2, 0, 0, arg9, arg3, arg5, arg8.anIntArrayArray29[local248], 0);
					}
					this.method3283(local188, arg2 & arg8.anIntArray277[local107], local291, local289, arg9, arg3, arg5, arg8.anIntArrayArray29[local107], local293);
				} else {
					if (local133) {
						local105++;
					}
					if (local111) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
	public abstract void R(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIZII[I[II)V")
	private void method3283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(48) int local48;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local48 = -arg3;
				arg3 = arg2;
				arg2 = local48;
			} else if (arg0 == 3) {
				local48 = arg3;
				arg3 = arg2;
				arg2 = local48;
			} else if (arg0 == 2) {
				local48 = arg3;
				arg3 = -arg2 & 0x3FFF;
				arg2 = local48 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg3 = -arg3;
				arg2 = -arg2;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local48 = arg3;
				arg3 = -arg2;
				arg2 = local48;
			} else if (arg0 == 3) {
				local48 = arg3;
				arg3 = arg2;
				arg2 = local48;
			} else if (arg0 == 2) {
				local48 = arg3;
				arg3 = arg2 & 0x3FFF;
				arg2 = -local48 & 0x3FFF;
			}
		}
		if (arg1 == 65535) {
			this.XA(arg0, arg7, arg3, arg8, arg2, arg5, arg4);
		} else {
			this.M(arg0, arg7, arg3, arg8, arg2, arg4, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
	public abstract void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!cq;Lclient!cq;ZIIIZLclient!cq;Lclient!cq;II[ZI)V")
	public final void method3284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub3 arg2, @OriginalArg(3) Class2_Sub5_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) Class2_Sub5_Sub3 arg8, @OriginalArg(10) Class2_Sub5_Sub3 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean[] arg12, @OriginalArg(14) int arg13) {
		if (arg5 == -1) {
			return;
		}
		if (arg12 == null || arg4 == -1) {
			this.method3294(arg8, arg10, arg7, arg5, arg9, arg0, arg6, 0);
		} else if (this.w()) {
			@Pc(34) Class201 local34 = arg8.aClass201Array1[arg5];
			@Pc(37) Class2_Sub16 local37 = local34.aClass2_Sub16_1;
			@Pc(39) Class201 local39 = null;
			if (arg9 != null) {
				local39 = arg9.aClass201Array1[arg0];
				if (local37 != local39.aClass2_Sub16_1) {
					local39 = null;
				}
			}
			this.method3281(local34, arg6, 65535, 0, local39, null, arg12, arg10, local37, arg7, false);
			@Pc(71) Class201 local71 = arg2.aClass201Array1[arg4];
			@Pc(73) Class201 local73 = null;
			if (arg3 != null) {
				local73 = arg3.aClass201Array1[arg13];
				if (local73.aClass2_Sub16_1 != local37) {
					local73 = null;
				}
			}
			this.XA(0, new int[0], 0, 0, 0, 0, arg7);
			this.method3281(local71, arg11, 65535, 0, local73, null, arg12, arg1, local71.aClass2_Sub16_1, arg7, true);
			this.j();
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lclient!t;")
	public abstract Class91 method3285(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!cq;IILclient!cq;[IIIIZ)V")
	public final void method3286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub5_Sub3 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) boolean arg8) {
		if (arg0 == -1 || !this.w()) {
			return;
		}
		@Pc(17) Class201 local17 = arg2.aClass201Array1[arg0];
		@Pc(20) Class2_Sub16 local20 = local17.aClass2_Sub16_1;
		@Pc(22) Class201 local22 = null;
		if (arg4 != null) {
			local22 = arg4.aClass201Array1[arg3];
			if (local20 != local22.aClass2_Sub16_1) {
				local22 = null;
			}
		}
		this.method3281(local17, arg1, arg6, 0, local22, arg5, null, arg7, local20, arg8, false);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
	public abstract int D();

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()Z")
	public abstract boolean method3287();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
	protected abstract void j();

	@OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
	public abstract int NA();

	@OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
	public abstract void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	public abstract Class2_Sub5_Sub1 fa(@OriginalArg(0) Class2_Sub5_Sub1 arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	public abstract void method3289(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()[Lclient!qc;")
	public abstract Class200[] method3290();

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	public abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) Class64 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)V")
	public abstract void method3291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
	public abstract void method3292();

	@OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
	protected abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIILclient!ta;IIII)V")
	protected final void method3293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class64 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg2 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(31) int local31 = arg3.a(arg5 + local16, local21 + arg6);
		@Pc(39) int local39 = arg2 / 2;
		@Pc(44) int local44 = -arg1 / 2;
		@Pc(53) int local53 = arg3.a(local39 + arg5, local44 + arg6);
		@Pc(58) int local58 = -arg2 / 2;
		@Pc(62) int local62 = arg1 / 2;
		@Pc(72) int local72 = arg3.a(arg5 + local58, local62 + arg6);
		@Pc(76) int local76 = arg2 / 2;
		@Pc(80) int local80 = arg1 / 2;
		@Pc(90) int local90 = arg3.a(arg5 + local76, local80 + arg6);
		@Pc(97) int local97 = local53 <= local31 ? local53 : local31;
		@Pc(104) int local104 = local72 < local90 ? local72 : local90;
		@Pc(115) int local115 = local53 < local90 ? local53 : local90;
		@Pc(126) int local126 = local72 <= local31 ? local72 : local31;
		@Pc(158) int local158;
		if (arg1 != 0) {
			@Pc(142) int local142 = (int) (Math.atan2((double) (local97 - local104), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local142 != 0) {
				if (arg4 != 0) {
					if (local142 > 8192) {
						local158 = 16384 - arg4;
						if (local142 < local158) {
							local142 = local158;
						}
					} else if (local142 > arg4) {
						local142 = arg4;
					}
				}
				this.Z(local142);
			}
		}
		@Pc(181) int local181 = local90 + local31;
		if (arg2 != 0) {
			@Pc(200) int local200 = (int) (Math.atan2((double) (local126 - local115), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local200 != 0) {
				if (arg7 != 0) {
					if (local200 > 8192) {
						local158 = 16384 - arg7;
						if (local200 < local158) {
							local200 = local158;
						}
					} else if (arg7 < local200) {
						local200 = arg7;
					}
				}
				this.R(local200);
			}
		}
		if (local181 > local72 + local53) {
			local181 = local72 + local53;
		}
		local181 = (local181 >> 1) - arg0;
		if (local181 != 0) {
			this.JA(0, local181, 0);
		}
	}

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
	public abstract void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!cq;IZILclient!cq;IIII)V")
	public final void method3294(@OriginalArg(0) Class2_Sub5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub5_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 == -1 || !this.w()) {
			return;
		}
		@Pc(17) Class201 local17 = arg0.aClass201Array1[arg3];
		@Pc(20) Class2_Sub16 local20 = local17.aClass2_Sub16_1;
		@Pc(22) Class201 local22 = null;
		if (arg4 != null) {
			local22 = arg4.aClass201Array1[arg5];
			if (local22.aClass2_Sub16_1 != local20) {
				local22 = null;
			}
		}
		this.method3281(local17, arg6, 65535, arg7, local22, null, null, arg1, local20, arg2, false);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
	public abstract void IA();
}
