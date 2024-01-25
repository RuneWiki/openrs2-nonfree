import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class54 {

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
	protected boolean aBoolean651 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class54() {
	}

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIIZI[II[III)V")
	private void method7397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(22) int local22;
		if (arg1 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local22 = -arg8;
				arg8 = arg7;
				arg7 = local22;
			} else if (arg3 == 3) {
				local22 = arg8;
				arg8 = arg7;
				arg7 = local22;
			} else if (arg3 == 2) {
				local22 = arg8;
				arg8 = -arg7 & 0x3FFF;
				arg7 = local22 & 0x3FFF;
			}
		} else if (arg1 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg8 = -arg8;
				arg7 = -arg7;
			} else if (arg3 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg7 = -arg7 & 0x3FFF;
			}
		} else if (arg1 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local22 = arg8;
				arg8 = -arg7;
				arg7 = local22;
			} else if (arg3 == 3) {
				local22 = arg8;
				arg8 = arg7;
				arg7 = local22;
			} else if (arg3 == 2) {
				local22 = arg8;
				arg8 = arg7 & 0x3FFF;
				arg7 = -local22 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.method7403(arg3, arg4, arg8, arg0, arg7, arg1, arg2);
		} else {
			this.I(arg3, arg4, arg8, arg0, arg7, arg2, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class54 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!qa;ZII)Z")
	public abstract boolean method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qa;Lclient!wha;I)V")
	public abstract void method7401(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class60_Sub10 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7403(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
	public abstract boolean method7404();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method7405(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!dt;IIIZII[IILclient!dt;)V")
	public final void method7406(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(10) Class6_Sub2_Sub5 arg8) {
		if (arg6 == -1) {
			return;
		}
		this.method7420();
		if (!this.NA()) {
			this.method7418();
			return;
		}
		@Pc(22) Class291 local22 = arg8.aClass291Array1[arg6];
		@Pc(25) Class6_Sub5 local25 = local22.aClass6_Sub5_1;
		@Pc(32) Class291 local32 = null;
		if (arg1 != null) {
			local32 = arg1.aClass291Array1[arg3];
			if (local32.aClass6_Sub5_1 != local25) {
				local32 = null;
			}
		}
		this.method7421(arg2, false, local32, (boolean[]) null, arg4, local22, arg7, arg5, 0, local25, arg0);
		this.wa();
		this.method7418();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qa;Lclient!wha;II)V")
	public abstract void method7407(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class60_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "()[Lclient!kw;")
	public abstract Class216[] method7408();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!iia;")
	public abstract Class173[] method7409();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qa;)V")
	public abstract void method7410(@OriginalArg(0) Class109 arg0);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILclient!s;BI)V")
	protected final void method7411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class96 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(31) int local31 = arg6.method8077(local16 + arg0, local21 + arg3);
		@Pc(35) int local35 = arg1 / 2;
		@Pc(40) int local40 = -arg7 / 2;
		@Pc(50) int local50 = arg6.method8077(local35 + arg0, local40 + arg3);
		@Pc(55) int local55 = -arg1 / 2;
		@Pc(59) int local59 = arg7 / 2;
		@Pc(69) int local69 = arg6.method8077(local55 + arg0, local59 + arg3);
		@Pc(83) int local83 = arg1 / 2;
		@Pc(87) int local87 = arg7 / 2;
		@Pc(97) int local97 = arg6.method8077(arg0 + local83, local87 + arg3);
		@Pc(109) int local109 = local50 <= local31 ? local50 : local31;
		@Pc(117) int local117 = local97 <= local69 ? local97 : local69;
		@Pc(129) int local129 = local50 < local97 ? local50 : local97;
		@Pc(179) int local179;
		if (arg7 != 0) {
			@Pc(145) int local145 = (int) (Math.atan2((double) (local109 - local117), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local145 != 0) {
				if (arg5 != 0) {
					if (local145 > 8192) {
						local179 = 16384 - arg5;
						if (local145 < local179) {
							local145 = local179;
						}
					} else if (arg5 < local145) {
						local145 = arg5;
					}
				}
				this.FA(local145);
			}
		}
		@Pc(199) int local199 = local69 > local31 ? local31 : local69;
		@Pc(203) int local203 = local31 + local97;
		if (arg1 != 0) {
			@Pc(222) int local222 = (int) (Math.atan2((double) (local199 - local129), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local222 != 0) {
				if (arg4 != 0) {
					if (local222 > 8192) {
						local179 = 16384 - arg4;
						if (local222 < local179) {
							local222 = local179;
						}
					} else if (local222 > arg4) {
						local222 = arg4;
					}
				}
				this.VA(local222);
			}
		}
		if (local50 + local69 < local203) {
			local203 = local50 + local69;
		}
		local203 = (local203 >> 1) - arg2;
		if (local203 != 0) {
			this.H(0, local203, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dt;IB)V")
	public final void method7413(@OriginalArg(0) Class6_Sub2_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7420();
		if (!this.NA()) {
			this.method7418();
			return;
		}
		@Pc(31) Class291 local31 = arg0.aClass291Array1[arg1];
		@Pc(34) Class6_Sub5 local34 = local31.aClass6_Sub5_1;
		for (@Pc(36) int local36 = 0; local36 < local31.anInt8089; local36++) {
			@Pc(43) short local43 = local31.aShortArray106[local36];
			if (local34.aBooleanArray3[local43]) {
				if (local31.aShortArray102[local36] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local34.anIntArray28[local43], local31.aShortArray103[local36], local31.aShortArray99[local36], local31.aShortArray101[local36]);
			}
		}
		this.wa();
		this.method7418();
	}

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public abstract void method7414();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qa;IZ)V")
	public abstract void method7416(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class6_Sub2_Sub18 ba(@OriginalArg(0) Class6_Sub2_Sub18 arg0);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!qa;ZI)Z")
	public abstract boolean method7417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method7418();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!dt;[ZIIIIILclient!dt;Lclient!dt;IIIZLclient!dt;I)V")
	public final void method7419(@OriginalArg(0) Class6_Sub2_Sub5 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6_Sub2_Sub5 arg6, @OriginalArg(8) Class6_Sub2_Sub5 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) Class6_Sub2_Sub5 arg12, @OriginalArg(14) int arg13) {
		if (arg5 == -1) {
			return;
		}
		if (arg1 == null || arg9 == -1) {
			this.method7422(arg8, arg11, arg12, 0, arg6, arg2, arg10, arg5);
			return;
		}
		this.method7420();
		if (!this.NA()) {
			this.method7418();
			return;
		}
		@Pc(44) Class291 local44 = arg6.aClass291Array1[arg5];
		@Pc(47) Class6_Sub5 local47 = local44.aClass6_Sub5_1;
		@Pc(49) Class291 local49 = null;
		if (arg12 != null) {
			local49 = arg12.aClass291Array1[arg10];
			if (local49.aClass6_Sub5_1 != local47) {
				local49 = null;
			}
		}
		this.method7421(arg2, false, local49, arg1, arg11, local44, (int[]) null, arg8, 0, local47, 65535);
		@Pc(89) Class291 local89 = arg0.aClass291Array1[arg9];
		@Pc(91) Class291 local91 = null;
		if (arg7 != null) {
			local91 = arg7.aClass291Array1[arg13];
			if (local91.aClass6_Sub5_1 != local47) {
				local91 = null;
			}
		}
		this.method7403(0, new int[0], 0, 0, 0, 0, arg11);
		this.method7421(arg4, true, local91, arg1, arg11, local89, (int[]) null, arg3, 0, local89.aClass6_Sub5_1, 65535);
		this.wa();
		this.method7418();
	}

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method7420();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLclient!pv;[ZZLclient!pv;B[IIILclient!bb;I)V")
	private void method7421(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class291 arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class291 arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class6_Sub5 arg9, @OriginalArg(11) int arg10) {
		@Pc(16) int local16;
		if (arg2 == null || arg7 == 0) {
			for (local16 = 0; local16 < arg5.anInt8089; local16++) {
				@Pc(23) short local23 = arg5.aShortArray106[local16];
				if (arg3 == null || arg1 == arg3[local23] || arg9.anIntArray28[local23] == 0) {
					@Pc(49) short local49 = arg5.aShortArray102[local16];
					if (local49 != -1) {
						this.method7397(0, arg8, arg4, 0, arg9.anIntArrayArray3[local49], arg9.anIntArray26[local49] & arg10, arg6, 0, 0);
					}
					this.method7397(arg5.aShortArray99[local16], arg8, arg4, arg9.anIntArray28[local23], arg9.anIntArrayArray3[local23], arg10 & arg9.anIntArray26[local23], arg6, arg5.aShortArray101[local16], arg5.aShortArray103[local16]);
				}
			}
			return;
		}
		local16 = 0;
		@Pc(118) int local118 = 0;
		for (@Pc(127) int local127 = 0; local127 < arg9.anInt437; local127++) {
			@Pc(131) boolean local131 = false;
			if (arg5.anInt8089 > local16 && local127 == arg5.aShortArray106[local16]) {
				local131 = true;
			}
			@Pc(151) boolean local151 = false;
			if (arg2.anInt8089 > local118 && local127 == arg2.aShortArray106[local118]) {
				local151 = true;
			}
			if (local131 || local151) {
				if (arg3 == null || arg3[local127] == arg1 || arg9.anIntArray28[local127] == 0) {
					@Pc(221) short local221 = 0;
					@Pc(226) int local226 = arg9.anIntArray28[local127];
					if (local226 == 3 || local226 == 10) {
						local221 = 128;
					}
					@Pc(263) short local263;
					@Pc(258) short local258;
					@Pc(243) short local243;
					@Pc(248) short local248;
					@Pc(253) byte local253;
					if (local131) {
						local243 = arg5.aShortArray101[local16];
						local248 = arg5.aShortArray102[local16];
						local253 = arg5.aByteArray80[local16];
						local258 = arg5.aShortArray99[local16];
						local263 = arg5.aShortArray103[local16];
						local16++;
					} else {
						local243 = local221;
						local253 = 0;
						local263 = local221;
						local258 = local221;
						local248 = -1;
					}
					@Pc(288) short local288;
					@Pc(282) short local282;
					@Pc(286) short local286;
					@Pc(284) short local284;
					@Pc(280) byte local280;
					if (local151) {
						local286 = arg2.aShortArray101[local118];
						local284 = arg2.aShortArray102[local118];
						local280 = arg2.aByteArray80[local118];
						local288 = arg2.aShortArray103[local118];
						local282 = arg2.aShortArray99[local118];
						local118++;
					} else {
						local280 = 0;
						local282 = local221;
						local284 = -1;
						local286 = local221;
						local288 = local221;
					}
					if (local248 != -1) {
						this.method7397(0, arg8, arg4, 0, arg9.anIntArrayArray3[local248], arg9.anIntArray26[local248] & arg10, arg6, 0, 0);
					} else if (local284 != -1) {
						this.method7397(0, arg8, arg4, 0, arg9.anIntArrayArray3[local284], arg9.anIntArray26[local284] & arg10, arg6, 0, 0);
					}
					@Pc(384) int local384;
					@Pc(382) int local382;
					@Pc(386) int local386;
					if ((local253 & 0x2) == 0 && (local280 & 0x1) == 0) {
						@Pc(407) int local407;
						if (local226 == 2) {
							local407 = local288 - local263 & 0x3FFF;
							@Pc(535) int local535 = local282 - local258 & 0x3FFF;
							@Pc(541) int local541 = local286 - local243 & 0x3FFF;
							if (local535 >= 8192) {
								local535 -= 16384;
							}
							if (local407 >= 8192) {
								local407 -= 16384;
							}
							local382 = local258 + arg7 * local535 / arg0 & 0x3FFF;
							local384 = arg7 * local407 / arg0 + local263 & 0x3FFF;
							if (local541 >= 8192) {
								local541 -= 16384;
							}
							local386 = local243 + arg7 * local541 / arg0 & 0x3FFF;
						} else if (local226 == 9) {
							local407 = local288 - local263 & 0x3FFF;
							if (local407 >= 8192) {
								local407 -= 16384;
							}
							local384 = local263 + local407 * arg7 / arg0 & 0x3FFF;
							local386 = 0;
							local382 = 0;
						} else if (local226 == 7) {
							local407 = local288 - local263 & 0x3F;
							if (local407 >= 32) {
								local407 -= 64;
							}
							local384 = local407 * arg7 / arg0 + local263 & 0x3F;
							local382 = local258 + arg7 * (local282 - local258) / arg0;
							local386 = (local286 - local243) * arg7 / arg0 + local243;
						} else {
							local382 = arg7 * (local282 - local258) / arg0 + local258;
							local386 = local243 + (local286 - local243) * arg7 / arg0;
							local384 = local263 + arg7 * (local288 - local263) / arg0;
						}
					} else {
						local382 = local258;
						local384 = local263;
						local386 = local243;
					}
					this.method7397(local382, arg8, arg4, local226, arg9.anIntArrayArray3[local127], arg9.anIntArray26[local127] & arg10, arg6, local386, local384);
				} else {
					if (local151) {
						local118++;
					}
					if (local131) {
						local16++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZILclient!dt;ILclient!dt;III)V")
	public final void method7422(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class6_Sub2_Sub5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub2_Sub5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 == -1) {
			return;
		}
		this.method7420();
		if (!this.NA()) {
			this.method7418();
			return;
		}
		@Pc(24) Class291 local24 = arg4.aClass291Array1[arg7];
		@Pc(27) Class6_Sub5 local27 = local24.aClass6_Sub5_1;
		@Pc(29) Class291 local29 = null;
		if (arg2 != null) {
			local29 = arg2.aClass291Array1[arg6];
			if (local27 != local29.aClass6_Sub5_1) {
				local29 = null;
			}
		}
		this.method7421(arg5, false, local29, (boolean[]) null, arg1, local24, (int[]) null, arg0, arg3, local27, 65535);
		this.wa();
		this.method7418();
	}

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()[B")
	public abstract byte[] method7423();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B[B)V")
	public abstract void method7424(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method7425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
