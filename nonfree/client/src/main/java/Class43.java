import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class43 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Z")
	protected boolean aBoolean748 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class43() {
	}

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class43 method8840(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!vu;ILclient!vu;ZZIIII)V")
	public final void method8841(@OriginalArg(0) Class5_Sub1_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub21 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 == -1) {
			return;
		}
		this.method8850();
		if (!this.NA()) {
			this.method8843();
			return;
		}
		@Pc(32) Class218 local32 = arg2.aClass218Array1[arg4];
		@Pc(35) Class5_Sub35 local35 = local32.aClass5_Sub35_1;
		@Pc(37) Class218 local37 = null;
		if (arg0 != null) {
			local37 = arg0.aClass218Array1[arg7];
			if (local35 != local37.aClass5_Sub35_1) {
				local37 = null;
			}
		}
		this.method8848(65535, local37, (int[]) null, (boolean[]) null, arg3, arg5, local35, local32, arg1, false, arg6);
		this.wa();
		this.method8843();
	}

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	protected abstract void method8843();

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!sj;ZII)Z")
	public abstract boolean method8844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method8845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sj;Lclient!rp;II)V")
	public abstract void method8846(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sj;)V")
	public abstract void method8847(@OriginalArg(0) Class10 arg0);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!le;[I[ZIZILclient!maa;Lclient!le;IZI)V")
	private void method8848(@OriginalArg(0) int arg0, @OriginalArg(1) Class218 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class5_Sub35 arg6, @OriginalArg(8) Class218 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(24) int local24;
		if (arg1 == null || arg10 == 0) {
			for (local24 = 0; local24 < arg7.anInt5534; local24++) {
				@Pc(31) short local31 = arg7.aShortArray77[local24];
				if (arg3 == null || arg3[local31] == arg9 || arg6.anIntArray336[local31] == 0) {
					@Pc(55) short local55 = arg7.aShortArray79[local24];
					if (local55 != -1) {
						this.method8855(arg0 & arg6.anIntArray334[local55], arg4, 0, arg2, arg6.anIntArrayArray40[local55], arg5, 0, 0, 0);
					}
					this.method8855(arg0 & arg6.anIntArray334[local31], arg4, arg7.aShortArray76[local24], arg2, arg6.anIntArrayArray40[local31], arg5, arg7.aShortArray81[local24], arg6.anIntArray336[local31], arg7.aShortArray75[local24]);
				}
			}
			return;
		}
		local24 = 0;
		@Pc(127) int local127 = 0;
		for (@Pc(129) int local129 = 0; local129 < arg6.anInt5757; local129++) {
			@Pc(133) boolean local133 = false;
			if (local24 < arg7.anInt5534 && arg7.aShortArray77[local24] == local129) {
				local133 = true;
			}
			@Pc(149) boolean local149 = false;
			if (arg1.anInt5534 > local127 && arg1.aShortArray77[local127] == local129) {
				local149 = true;
			}
			if (local133 || local149) {
				if (arg3 == null || arg3[local129] == arg9 || arg6.anIntArray336[local129] == 0) {
					@Pc(215) short local215 = 0;
					@Pc(220) int local220 = arg6.anIntArray336[local129];
					if (local220 == 3 || local220 == 10) {
						local215 = 128;
					}
					@Pc(242) short local242;
					@Pc(244) short local244;
					@Pc(238) short local238;
					@Pc(240) short local240;
					@Pc(236) byte local236;
					if (local133) {
						local236 = arg7.aByteArray61[local24];
						local240 = arg7.aShortArray79[local24];
						local242 = arg7.aShortArray75[local24];
						local238 = arg7.aShortArray76[local24];
						local244 = arg7.aShortArray81[local24];
						local24++;
					} else {
						local236 = 0;
						local238 = local215;
						local240 = -1;
						local242 = local215;
						local244 = local215;
					}
					@Pc(278) short local278;
					@Pc(276) short local276;
					@Pc(284) short local284;
					@Pc(280) short local280;
					@Pc(282) byte local282;
					if (local149) {
						local278 = arg1.aShortArray75[local127];
						local284 = arg1.aShortArray76[local127];
						local280 = arg1.aShortArray79[local127];
						local282 = arg1.aByteArray61[local127];
						local276 = arg1.aShortArray81[local127];
						local127++;
					} else {
						local276 = local215;
						local278 = local215;
						local280 = -1;
						local282 = 0;
						local284 = local215;
					}
					if (local240 != -1) {
						this.method8855(arg0 & arg6.anIntArray334[local240], arg4, 0, arg2, arg6.anIntArrayArray40[local240], arg5, 0, 0, 0);
					} else if (local280 != -1) {
						this.method8855(arg6.anIntArray334[local280] & arg0, arg4, 0, arg2, arg6.anIntArrayArray40[local280], arg5, 0, 0, 0);
					}
					@Pc(425) int local425;
					@Pc(435) int local435;
					@Pc(451) int local451;
					if ((local236 & 0x2) == 0 && (local282 & 0x1) == 0) {
						@Pc(388) int local388;
						if (local220 == 2) {
							local388 = local278 - local242 & 0x3FFF;
							@Pc(395) int local395 = local276 - local244 & 0x3FFF;
							if (local395 >= 8192) {
								local395 -= 16384;
							}
							if (local388 >= 8192) {
								local388 -= 16384;
							}
							@Pc(415) int local415 = local284 - local238 & 0x3FFF;
							local425 = local388 * arg10 / arg8 + local242 & 0x3FFF;
							local435 = local395 * arg10 / arg8 + local244 & 0x3FFF;
							if (local415 >= 8192) {
								local415 -= 16384;
							}
							local451 = local238 + arg10 * local415 / arg8 & 0x3FFF;
						} else if (local220 == 9) {
							local388 = local278 - local242 & 0x3FFF;
							if (local388 >= 8192) {
								local388 -= 16384;
							}
							local425 = local242 + arg10 * local388 / arg8 & 0x3FFF;
							local451 = 0;
							local435 = 0;
						} else if (local220 == 7) {
							local388 = local278 - local242 & 0x3F;
							if (local388 >= 32) {
								local388 -= 64;
							}
							local435 = arg10 * (local276 - local244) / arg8 + local244;
							local451 = local238 + arg10 * (local284 - local238) / arg8;
							local425 = local388 * arg10 / arg8 + local242 & 0x3F;
						} else {
							local435 = (local276 - local244) * arg10 / arg8 + local244;
							local451 = local238 + arg10 * (local284 - local238) / arg8;
							local425 = local242 + arg10 * (local278 - local242) / arg8;
						}
					} else {
						local425 = local242;
						local451 = local238;
						local435 = local244;
					}
					this.method8855(arg6.anIntArray334[local129] & arg0, arg4, local451, arg2, arg6.anIntArrayArray40[local129], arg5, local435, local220, local425);
				} else {
					if (local133) {
						local24++;
					}
					if (local149) {
						local127++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sj;Lclient!rp;I)V")
	public abstract void method8849(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method8850();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLclient!vu;)V")
	public final void method8851(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub21 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method8850();
		if (!this.NA()) {
			this.method8843();
			return;
		}
		@Pc(25) Class218 local25 = arg1.aClass218Array1[arg0];
		@Pc(28) Class5_Sub35 local28 = local25.aClass5_Sub35_1;
		for (@Pc(41) int local41 = 0; local41 < local25.anInt5534; local41++) {
			@Pc(48) short local48 = local25.aShortArray77[local41];
			if (local28.aBooleanArray16[local48]) {
				if (local25.aShortArray79[local41] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local28.anIntArray336[local48], local25.aShortArray75[local41], local25.aShortArray81[local41], local25.aShortArray76[local41]);
			}
		}
		this.wa();
		this.method8843();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!sj;ZI)Z")
	public abstract boolean method8852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!ui;")
	public abstract Class363[] method8853();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IZILclient!vu;IILclient!vu;IIII)V")
	public final void method8854(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class5_Sub1_Sub21 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub1_Sub21 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		if (arg7 == -1) {
			return;
		}
		this.method8850();
		if (!this.NA()) {
			this.method8843();
			return;
		}
		@Pc(29) Class218 local29 = arg2.aClass218Array1[arg7];
		@Pc(32) Class5_Sub35 local32 = local29.aClass5_Sub35_1;
		@Pc(34) Class218 local34 = null;
		if (arg5 != null) {
			local34 = arg5.aClass218Array1[arg4];
			if (local32 != local34.aClass5_Sub35_1) {
				local34 = null;
			}
		}
		this.method8848(arg8, local34, arg0, (boolean[]) null, arg1, 0, local32, local29, arg3, false, arg6);
		this.wa();
		this.method8843();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZI[I[IBIIII)V")
	private void method8855(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(23) int local23;
		if (arg5 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local23 = -arg8;
				arg8 = arg2;
				arg2 = local23;
			} else if (arg7 == 3) {
				local23 = arg8;
				arg8 = arg2;
				arg2 = local23;
			} else if (arg7 == 2) {
				local23 = arg8;
				arg8 = -arg2 & 0x3FFF;
				arg2 = local23 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg8 = -arg8;
				arg2 = -arg2;
			} else if (arg7 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local23 = arg8;
				arg8 = -arg2;
				arg2 = local23;
			} else if (arg7 == 3) {
				local23 = arg8;
				arg8 = arg2;
				arg2 = local23;
			} else if (arg7 == 2) {
				local23 = arg8;
				arg8 = arg2 & 0x3FFF;
				arg2 = -local23 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.method8860(arg7, arg4, arg8, arg6, arg2, arg5, arg1);
		} else {
			this.I(arg7, arg4, arg8, arg6, arg2, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sj;IZ)V")
	public abstract void method8856(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!vu;II[ZLclient!vu;IILclient!vu;IZIIIILclient!vu;)V")
	public final void method8857(@OriginalArg(0) Class5_Sub1_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) Class5_Sub1_Sub21 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class5_Sub1_Sub21 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class5_Sub1_Sub21 arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg3 == null || arg11 == -1) {
			this.method8841(arg4, arg1, arg0, arg8, arg2, 0, arg7, arg9);
			return;
		}
		this.method8850();
		if (!this.NA()) {
			this.method8843();
			return;
		}
		@Pc(42) Class218 local42 = arg0.aClass218Array1[arg2];
		@Pc(45) Class5_Sub35 local45 = local42.aClass5_Sub35_1;
		@Pc(47) Class218 local47 = null;
		if (arg4 != null) {
			local47 = arg4.aClass218Array1[arg9];
			if (local45 != local47.aClass5_Sub35_1) {
				local47 = null;
			}
		}
		this.method8848(65535, local47, (int[]) null, arg3, arg8, 0, local45, local42, arg1, false, arg7);
		@Pc(79) Class218 local79 = arg13.aClass218Array1[arg11];
		@Pc(81) Class218 local81 = null;
		if (arg6 != null) {
			local81 = arg6.aClass218Array1[arg5];
			if (local45 != local81.aClass5_Sub35_1) {
				local81 = null;
			}
		}
		this.method8860(0, new int[0], 0, 0, 0, 0, arg8);
		this.method8848(65535, local81, (int[]) null, arg3, arg8, 0, local79.aClass5_Sub35_1, local79, arg10, true, arg12);
		this.wa();
		this.method8843();
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()Z")
	public abstract boolean method8858();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method8861(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIILclient!s;)V")
	protected final void method8862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class84 arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg6 / 2;
		@Pc(33) int local33 = arg7.method7625(arg2 + local16, arg5 - -local21);
		@Pc(37) int local37 = arg1 / 2;
		@Pc(42) int local42 = -arg6 / 2;
		@Pc(53) int local53 = arg7.method7625(arg2 + local37, local42 + arg5);
		@Pc(58) int local58 = -arg1 / 2;
		@Pc(62) int local62 = arg6 / 2;
		@Pc(74) int local74 = arg7.method7625(arg2 + local58, arg5 - -local62);
		@Pc(78) int local78 = arg1 / 2;
		@Pc(82) int local82 = arg6 / 2;
		@Pc(93) int local93 = arg7.method7625(arg2 + local78, local82 + arg5);
		@Pc(105) int local105 = local33 >= local53 ? local53 : local33;
		@Pc(113) int local113 = local93 <= local74 ? local93 : local74;
		@Pc(121) int local121 = local53 < local93 ? local53 : local93;
		@Pc(129) int local129 = local33 >= local74 ? local74 : local33;
		@Pc(163) int local163;
		if (arg6 != 0) {
			@Pc(148) int local148 = (int) (Math.atan2((double) (local105 - local113), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local148 != 0) {
				if (arg3 != 0) {
					if (local148 > 8192) {
						local163 = 16384 - arg3;
						if (local163 > local148) {
							local148 = local163;
						}
					} else if (local148 > arg3) {
						local148 = arg3;
					}
				}
				this.FA(local148);
			}
		}
		@Pc(188) int local188 = local93 + local33;
		if (arg1 != 0) {
			@Pc(207) int local207 = (int) (Math.atan2((double) (local129 - local121), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local207 != 0) {
				if (arg0 != 0) {
					if (local207 > 8192) {
						local163 = 16384 - arg0;
						if (local163 > local207) {
							local207 = local163;
						}
					} else if (arg0 < local207) {
						local207 = arg0;
					}
				}
				this.VA(local207);
			}
		}
		if (local188 > local74 + local53) {
			local188 = local74 + local53;
		}
		local188 = (local188 >> 1) - arg4;
		if (local188 != 0) {
			this.H(0, local188, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class5_Sub1_Sub15 ba(@OriginalArg(0) Class5_Sub1_Sub15 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lclient!ok;")
	public abstract Class270[] method8863();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	public abstract void method8864();
}
