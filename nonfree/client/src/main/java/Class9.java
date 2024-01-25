import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class9 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class9() {
	}

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
	public abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
	protected abstract void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILclient!d;IIIII)V")
	protected final void method4003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg0 / 2;
		@Pc(35) int local35 = arg3.sa(arg7 + local16, arg2 + local21);
		@Pc(39) int local39 = arg1 / 2;
		@Pc(44) int local44 = -arg0 / 2;
		@Pc(54) int local54 = arg3.sa(arg7 + local39, local44 + arg2);
		@Pc(59) int local59 = -arg1 / 2;
		@Pc(63) int local63 = arg0 / 2;
		@Pc(72) int local72 = arg3.sa(local59 + arg7, arg2 + local63);
		@Pc(76) int local76 = arg1 / 2;
		@Pc(80) int local80 = arg0 / 2;
		@Pc(89) int local89 = arg3.sa(local76 + arg7, local80 + arg2);
		@Pc(96) int local96 = local35 < local54 ? local35 : local54;
		@Pc(107) int local107 = local72 >= local89 ? local89 : local72;
		@Pc(118) int local118 = local89 > local54 ? local54 : local89;
		@Pc(125) int local125 = local72 <= local35 ? local72 : local35;
		@Pc(157) int local157;
		if (arg0 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local96 - local107), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local140 != 0) {
				if (arg6 != 0) {
					if (local140 > 8192) {
						local157 = 16384 - arg6;
						if (local140 < local157) {
							local140 = local157;
						}
					} else if (local140 > arg6) {
						local140 = arg6;
					}
				}
				this.AA(local140);
			}
		}
		if (arg1 != 0) {
			@Pc(194) int local194 = (int) (Math.atan2((double) (local125 - local118), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local194 != 0) {
				if (arg5 != 0) {
					if (local194 > 8192) {
						local157 = 16384 - arg5;
						if (local157 > local194) {
							local194 = local157;
						}
					} else if (local194 > arg5) {
						local194 = arg5;
					}
				}
				this.v(local194);
			}
		}
		@Pc(227) int local227 = local89 + local35;
		if (local227 > local72 + local54) {
			local227 = local72 + local54;
		}
		local227 = (local227 >> 1) - arg4;
		if (local227 != 0) {
			this.m(0, local227, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!ot;II)V")
	public abstract void method4004(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class26_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIILclient!wo;ILclient!wo;I)V")
	public final void method4005(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class4_Sub7_Sub19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class4_Sub7_Sub19 arg6, @OriginalArg(8) int arg7) {
		if (arg5 == -1 || !this.Q()) {
			return;
		}
		@Pc(17) Class180 local17 = arg6.aClass180Array1[arg5];
		@Pc(20) Class4_Sub42 local20 = local17.aClass4_Sub42_1;
		@Pc(22) Class180 local22 = null;
		if (arg4 != null) {
			local22 = arg4.aClass180Array1[arg3];
			if (local20 != local22.aClass4_Sub42_1) {
				local22 = null;
			}
		}
		this.method4013(local20, null, 65535, local17, arg0, arg2, false, arg1, local22, null, arg7);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lclient!ba;")
	public abstract Class9 method4006(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
	protected abstract boolean Q();

	@OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
	public abstract int LA();

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
	public abstract void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	public abstract void method4010(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
	public abstract void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
	public abstract int h();

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
	public abstract void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
	public abstract void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method4011(@OriginalArg(0) Class134 arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZIILclient!wo;IIILclient!wo;[ZILclient!wo;IZLclient!wo;)V")
	public final void method4012(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub7_Sub19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub7_Sub19 arg8, @OriginalArg(9) boolean[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class4_Sub7_Sub19 arg11, @OriginalArg(12) int arg12, @OriginalArg(14) Class4_Sub7_Sub19 arg13) {
		if (arg10 == -1) {
			return;
		}
		if (arg9 == null || arg12 == -1) {
			this.method4005(arg1, 0, arg5, arg0, arg8, arg10, arg11, arg7);
		} else if (this.Q()) {
			@Pc(34) Class180 local34 = arg11.aClass180Array1[arg10];
			@Pc(37) Class4_Sub42 local37 = local34.aClass4_Sub42_1;
			@Pc(39) Class180 local39 = null;
			if (arg8 != null) {
				local39 = arg8.aClass180Array1[arg0];
				if (local39.aClass4_Sub42_1 != local37) {
					local39 = null;
				}
			}
			this.method4013(local37, null, 65535, local34, arg1, arg5, false, 0, local39, arg9, arg7);
			@Pc(71) Class180 local71 = arg4.aClass180Array1[arg12];
			@Pc(73) Class180 local73 = null;
			if (arg13 != null) {
				local73 = arg13.aClass180Array1[arg2];
				if (local37 != local73.aClass4_Sub42_1) {
					local73 = null;
				}
			}
			this.E(0, new int[0], 0, 0, 0, 0, arg1);
			this.method4013(local71.aClass4_Sub42_1, null, 65535, local71, arg1, arg3, true, 0, local73, arg9, arg6);
			this.Y();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!rh;[IILclient!jq;ZIZILclient!jq;[ZI)V")
	private void method4013(@OriginalArg(1) Class4_Sub42 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class180 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class180 arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) int arg10) {
		@Pc(17) int local17;
		if (arg8 == null || arg10 == 0) {
			for (local17 = 0; local17 < arg3.anInt5003; local17++) {
				@Pc(24) short local24 = arg3.aShortArray99[local17];
				if (arg9 == null || arg6 == arg9[local24] || arg0.anIntArray629[local24] == 0) {
					@Pc(49) short local49 = arg3.aShortArray97[local17];
					if (local49 != -1) {
						this.method4014(arg4, 0, 0, 0, arg0.anIntArray628[local49] & arg2, arg7, arg0.anIntArrayArray68[local49], 0, arg1);
					}
					this.method4014(arg4, arg3.aShortArray96[local17], arg0.anIntArray629[local24], arg3.aShortArray101[local17], arg0.anIntArray628[local24] & arg2, arg7, arg0.anIntArrayArray68[local24], arg3.aShortArray102[local17], arg1);
				}
			}
			return;
		}
		local17 = 0;
		@Pc(114) int local114 = 0;
		for (@Pc(116) int local116 = 0; local116 < arg0.anInt7814; local116++) {
			@Pc(120) boolean local120 = false;
			if (arg3.anInt5003 > local17 && local116 == arg3.aShortArray99[local17]) {
				local120 = true;
			}
			@Pc(142) boolean local142 = false;
			if (arg8.anInt5003 > local114 && local116 == arg8.aShortArray99[local114]) {
				local142 = true;
			}
			if (local120 || local142) {
				if (arg9 == null || arg6 == arg9[local116] || arg0.anIntArray629[local116] == 0) {
					@Pc(195) short local195 = 0;
					@Pc(200) int local200 = arg0.anIntArray629[local116];
					if (local200 == 3 || local200 == 10) {
						local195 = 128;
					}
					@Pc(216) short local216;
					@Pc(220) short local220;
					@Pc(214) short local214;
					@Pc(218) short local218;
					@Pc(222) byte local222;
					if (local120) {
						local222 = arg3.aByteArray56[local17];
						local216 = arg3.aShortArray96[local17];
						local214 = arg3.aShortArray101[local17];
						local220 = arg3.aShortArray102[local17];
						local218 = arg3.aShortArray97[local17];
						local17++;
					} else {
						local214 = local195;
						local216 = local195;
						local218 = -1;
						local220 = local195;
						local222 = 0;
					}
					@Pc(254) short local254;
					@Pc(256) short local256;
					@Pc(260) short local260;
					@Pc(262) short local262;
					@Pc(258) byte local258;
					if (local142) {
						local260 = arg8.aShortArray101[local114];
						local262 = arg8.aShortArray97[local114];
						local256 = arg8.aShortArray102[local114];
						local258 = arg8.aByteArray56[local114];
						local254 = arg8.aShortArray96[local114];
						local114++;
					} else {
						local254 = local195;
						local256 = local195;
						local258 = 0;
						local260 = local195;
						local262 = -1;
					}
					@Pc(303) int local303;
					@Pc(305) int local305;
					@Pc(307) int local307;
					if ((local222 & 0x2) == 0 && (local258 & 0x1) == 0) {
						@Pc(321) int local321;
						if (local200 == 2) {
							local321 = local254 - local216 & 0x3FFF;
							@Pc(328) int local328 = local256 - local220 & 0x3FFF;
							@Pc(334) int local334 = local260 - local214 & 0x3FFF;
							if (local328 >= 8192) {
								local328 -= 16384;
							}
							if (local321 >= 8192) {
								local321 -= 16384;
							}
							local305 = local328 * arg10 / arg5 + local220 & 0x3FFF;
							local303 = local321 * arg10 / arg5 + local216 & 0x3FFF;
							if (local334 >= 8192) {
								local334 -= 16384;
							}
							local307 = local214 + arg10 * local334 / arg5 & 0x3FFF;
						} else if (local200 == 9) {
							local321 = local254 - local216 & 0x3FFF;
							if (local321 >= 8192) {
								local321 -= 16384;
							}
							local307 = 0;
							local305 = 0;
							local303 = local216 + arg10 * local321 / arg5 & 0x3FFF;
						} else if (local200 == 7) {
							local321 = local254 - local216 & 0x3F;
							if (local321 >= 32) {
								local321 -= 64;
							}
							local303 = local216 + local321 * arg10 / arg5 & 0x3F;
							local307 = local214 + arg10 * (local260 - local214) / arg5;
							local305 = local220 + (local256 - local220) * arg10 / arg5;
						} else {
							local303 = local216 + arg10 * (local254 - local216) / arg5;
							local307 = local214 + (local260 - local214) * arg10 / arg5;
							local305 = (local256 - local220) * arg10 / arg5 + local220;
						}
					} else {
						local303 = local216;
						local305 = local220;
						local307 = local214;
					}
					if (local218 != -1) {
						this.method4014(arg4, 0, 0, 0, arg2 & arg0.anIntArray628[local218], arg7, arg0.anIntArrayArray68[local218], 0, arg1);
					} else if (local262 != -1) {
						this.method4014(arg4, 0, 0, 0, arg2 & arg0.anIntArray628[local262], arg7, arg0.anIntArrayArray68[local262], 0, arg1);
					}
					this.method4014(arg4, local303, local200, local307, arg2 & arg0.anIntArray628[local116], arg7, arg0.anIntArrayArray68[local116], local305, arg1);
				} else {
					if (local142) {
						local114++;
					}
					if (local120) {
						local17++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
	protected abstract void Y();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIIIB[II[I)V")
	private void method4014(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(28) int local28;
		if (arg5 == 1) {
			if (arg2 == 0 || arg2 == 1) {
				local28 = -arg1;
				arg1 = arg3;
				arg3 = local28;
			} else if (arg2 == 3) {
				local28 = arg1;
				arg1 = arg3;
				arg3 = local28;
			} else if (arg2 == 2) {
				local28 = arg1;
				arg1 = -arg3 & 0x3FFF;
				arg3 = local28 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg2 == 0 || arg2 == 1) {
				arg1 = -arg1;
				arg3 = -arg3;
			} else if (arg2 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg2 == 0 || arg2 == 1) {
				local28 = arg1;
				arg1 = -arg3;
				arg3 = local28;
			} else if (arg2 == 3) {
				local28 = arg1;
				arg1 = arg3;
				arg3 = local28;
			} else if (arg2 == 2) {
				local28 = arg1;
				arg1 = arg3 & 0x3FFF;
				arg3 = -local28 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.E(arg2, arg6, arg1, arg7, arg3, arg5, arg0);
		} else {
			this.da(arg2, arg6, arg1, arg7, arg3, arg0, arg4, arg8);
		}
	}

	@OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
	public abstract int ha();

	@OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()[Lclient!efa;")
	public abstract Class89[] method4015();

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
	public abstract void P();

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public abstract Class4_Sub7_Sub3 Z(@OriginalArg(0) Class4_Sub7_Sub3 arg0);

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()V")
	public abstract void method4016();

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
	public abstract void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!wo;I)V")
	public final void method4017(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7_Sub19 arg1) {
		if (arg0 == -1 || !this.Q()) {
			return;
		}
		@Pc(19) Class180 local19 = arg1.aClass180Array1[arg0];
		@Pc(22) Class4_Sub42 local22 = local19.aClass4_Sub42_1;
		for (@Pc(24) int local24 = 0; local24 < local19.anInt5003; local24++) {
			@Pc(31) short local31 = local19.aShortArray99[local24];
			if (local22.aBooleanArray33[local31]) {
				if (local19.aShortArray97[local24] != -1) {
					this.ua(0, 0, 0, 0);
				}
				this.ua(local22.anIntArray629[local31], local19.aShortArray96[local24], local19.aShortArray102[local24], local19.aShortArray101[local24]);
			}
		}
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()Z")
	public abstract boolean method4018();

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
	public abstract int F();

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()[Lclient!jt;")
	public abstract Class181[] method4019();

	@OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public abstract void method4020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZLclient!wo;ILclient!wo;IIII[II)V")
	public final void method4021(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class4_Sub7_Sub19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub7_Sub19 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) int arg8) {
		if (arg3 == -1 || !this.Q()) {
			return;
		}
		@Pc(18) Class180 local18 = arg2.aClass180Array1[arg3];
		@Pc(21) Class4_Sub42 local21 = local18.aClass4_Sub42_1;
		@Pc(23) Class180 local23 = null;
		if (arg4 != null) {
			local23 = arg4.aClass180Array1[arg6];
			if (local21 != local23.aClass4_Sub42_1) {
				local23 = null;
			}
		}
		this.method4013(local21, arg7, arg0, local18, arg1, arg8, false, 0, local23, null, arg5);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
	protected abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!ot;I)V")
	public abstract void method4023(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class26_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
	public abstract int u();
}
