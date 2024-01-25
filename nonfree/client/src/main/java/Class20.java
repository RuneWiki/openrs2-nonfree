import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class20 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class20() {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()Z")
	public abstract boolean method7254();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[I[ZIBILclient!pi;ZILclient!sm;ZLclient!sm;)V")
	private void method7255(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class6_Sub38 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class308 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class308 arg10) {
		@Pc(14) int local14;
		if (arg10 == null || arg0 == 0) {
			for (local14 = 0; local14 < arg8.anInt8195; local14++) {
				@Pc(21) short local21 = arg8.aShortArray132[local14];
				if (arg2 == null || arg2[local21] == arg9 || arg5.anIntArray513[local21] == 0) {
					@Pc(45) short local45 = arg8.aShortArray126[local14];
					if (local45 != -1) {
						this.method7270(arg4, arg6, 0, arg5.anIntArrayArray64[local45], arg1, 0, arg7 & arg5.anIntArray512[local45], 0, 0);
					}
					this.method7270(arg4, arg6, arg8.aShortArray130[local14], arg5.anIntArrayArray64[local21], arg1, arg8.aShortArray123[local14], arg7 & arg5.anIntArray512[local21], arg8.aShortArray131[local14], arg5.anIntArray513[local21]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(114) int local114 = 0;
		for (@Pc(116) int local116 = 0; local116 < arg5.anInt6951; local116++) {
			@Pc(120) boolean local120 = false;
			if (arg8.anInt8195 > local14 && local116 == arg8.aShortArray132[local14]) {
				local120 = true;
			}
			@Pc(138) boolean local138 = false;
			if (arg10.anInt8195 > local114 && arg10.aShortArray132[local114] == local116) {
				local138 = true;
			}
			if (local120 || local138) {
				if (arg2 == null || arg9 == arg2[local116] || arg5.anIntArray513[local116] == 0) {
					@Pc(188) short local188 = 0;
					@Pc(193) int local193 = arg5.anIntArray513[local116];
					if (local193 == 3 || local193 == 10) {
						local188 = 128;
					}
					@Pc(228) short local228;
					@Pc(208) short local208;
					@Pc(223) short local223;
					@Pc(213) short local213;
					@Pc(218) byte local218;
					if (local120) {
						local208 = arg8.aShortArray131[local14];
						local213 = arg8.aShortArray126[local14];
						local218 = arg8.aByteArray104[local14];
						local223 = arg8.aShortArray130[local14];
						local228 = arg8.aShortArray123[local14];
						local14++;
					} else {
						local218 = 0;
						local223 = local188;
						local228 = local188;
						local208 = local188;
						local213 = -1;
					}
					@Pc(263) short local263;
					@Pc(268) short local268;
					@Pc(248) short local248;
					@Pc(253) short local253;
					@Pc(258) byte local258;
					if (local138) {
						local248 = arg10.aShortArray130[local114];
						local253 = arg10.aShortArray126[local114];
						local258 = arg10.aByteArray104[local114];
						local263 = arg10.aShortArray123[local114];
						local268 = arg10.aShortArray131[local114];
						local114++;
					} else {
						local248 = local188;
						local253 = -1;
						local263 = local188;
						local268 = local188;
						local258 = 0;
					}
					@Pc(346) int local346;
					@Pc(332) int local332;
					@Pc(356) int local356;
					if ((local218 & 0x2) == 0 && (local258 & 0x1) == 0) {
						@Pc(299) int local299;
						if (local193 == 2) {
							local299 = local263 - local228 & 0x3FFF;
							@Pc(306) int local306 = local268 - local208 & 0x3FFF;
							if (local306 >= 8192) {
								local306 -= 16384;
							}
							@Pc(318) int local318 = local248 - local223 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							local332 = local208 + local306 * arg0 / arg3 & 0x3FFF;
							if (local318 >= 8192) {
								local318 -= 16384;
							}
							local346 = arg0 * local299 / arg3 + local228 & 0x3FFF;
							local356 = local318 * arg0 / arg3 + local223 & 0x3FFF;
						} else if (local193 == 9) {
							local299 = local263 - local228 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							local356 = 0;
							local332 = 0;
							local346 = local299 * arg0 / arg3 + local228 & 0x3FFF;
						} else if (local193 == 7) {
							local299 = local263 - local228 & 0x3F;
							if (local299 >= 32) {
								local299 -= 64;
							}
							local356 = local223 + arg0 * (local248 - local223) / arg3;
							local332 = arg0 * (local268 - local208) / arg3 + local208;
							local346 = local228 + arg0 * local299 / arg3 & 0x3F;
						} else {
							local356 = arg0 * (local248 - local223) / arg3 + local223;
							local346 = (local263 - local228) * arg0 / arg3 + local228;
							local332 = arg0 * (local268 - local208) / arg3 + local208;
						}
					} else {
						local346 = local228;
						local356 = local223;
						local332 = local208;
					}
					if (local213 != -1) {
						this.method7270(arg4, arg6, 0, arg5.anIntArrayArray64[local213], arg1, 0, arg5.anIntArray512[local213] & arg7, 0, 0);
					} else if (local253 != -1) {
						this.method7270(arg4, arg6, 0, arg5.anIntArrayArray64[local253], arg1, 0, arg5.anIntArray512[local253] & arg7, 0, 0);
					}
					this.method7270(arg4, arg6, local356, arg5.anIntArrayArray64[local116], arg1, local346, arg7 & arg5.anIntArray512[local116], local332, local193);
				} else {
					if (local120) {
						local14++;
					}
					if (local138) {
						local114++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!po;I)V")
	public abstract void method7256(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class98_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBLclient!tn;)V")
	public final void method7257(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub19 arg1) {
		if (arg0 == -1 || !this.Q()) {
			return;
		}
		@Pc(18) Class308 local18 = arg1.aClass308Array1[arg0];
		@Pc(21) Class6_Sub38 local21 = local18.aClass6_Sub38_1;
		for (@Pc(23) int local23 = 0; local23 < local18.anInt8195; local23++) {
			@Pc(30) short local30 = local18.aShortArray132[local23];
			if (local21.aBooleanArray30[local30]) {
				if (local18.aShortArray126[local23] != -1) {
					this.ua(0, 0, 0, 0);
				}
				this.ua(local21.anIntArray513[local30], local18.aShortArray123[local23], local18.aShortArray131[local23], local18.aShortArray130[local23]);
			}
		}
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
	public abstract void P();

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public abstract Class6_Sub2_Sub14 Z(@OriginalArg(0) Class6_Sub2_Sub14 arg0);

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
	protected abstract void Y();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	public abstract void method7258(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
	public abstract void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!po;II)V")
	public abstract void method7259(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class98_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public abstract void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
	public abstract int ha();

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
	public abstract int F();

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()[Lclient!fd;")
	public abstract Class90[] method7261();

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
	public abstract int u();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!tn;ZIIILclient!tn;III)V")
	public final void method7262(@OriginalArg(0) Class6_Sub2_Sub19 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub2_Sub19 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 == -1 || !this.Q()) {
			return;
		}
		@Pc(22) Class308 local22 = arg0.aClass308Array1[arg4];
		@Pc(25) Class6_Sub38 local25 = local22.aClass6_Sub38_1;
		@Pc(27) Class308 local27 = null;
		if (arg5 != null) {
			local27 = arg5.aClass308Array1[arg2];
			if (local27.aClass6_Sub38_1 != local25) {
				local27 = null;
			}
		}
		this.method7255(arg6, null, null, arg3, arg7, local25, arg1, 65535, local22, false, local27);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7263(@OriginalArg(0) Class54 arg0);

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lclient!ba;")
	public abstract Class20 method7264(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
	public abstract void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!tn;ZLclient!tn;Lclient!tn;IZII[ZIIIIILclient!tn;)V")
	public final void method7265(@OriginalArg(0) Class6_Sub2_Sub19 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class6_Sub2_Sub19 arg2, @OriginalArg(3) Class6_Sub2_Sub19 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class6_Sub2_Sub19 arg13) {
		if (arg10 == -1) {
			return;
		}
		if (arg7 == null || arg6 == -1) {
			this.method7262(arg0, arg1, arg4, arg5, arg10, arg3, arg8, 0);
		} else if (this.Q()) {
			@Pc(33) Class308 local33 = arg0.aClass308Array1[arg10];
			@Pc(36) Class6_Sub38 local36 = local33.aClass6_Sub38_1;
			@Pc(38) Class308 local38 = null;
			if (arg3 != null) {
				local38 = arg3.aClass308Array1[arg4];
				if (local38.aClass6_Sub38_1 != local36) {
					local38 = null;
				}
			}
			this.method7255(arg8, null, arg7, arg5, 0, local36, arg1, 65535, local33, false, local38);
			@Pc(70) Class308 local70 = arg13.aClass308Array1[arg6];
			@Pc(72) Class308 local72 = null;
			if (arg2 != null) {
				local72 = arg2.aClass308Array1[arg11];
				if (local36 != local72.aClass6_Sub38_1) {
					local72 = null;
				}
			}
			this.E(0, new int[0], 0, 0, 0, 0, arg1);
			this.method7255(arg9, null, arg7, arg12, 0, local70.aClass6_Sub38_1, arg1, 65535, local70, true, local72);
			this.Y();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
	public abstract int h();

	@OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
	protected abstract void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()[Lclient!et;")
	public abstract Class85[] method7267();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([ILclient!tn;IIIIIZLclient!tn;II)V")
	public final void method7268(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class6_Sub2_Sub19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class6_Sub2_Sub19 arg7, @OriginalArg(10) int arg8) {
		if (arg2 == -1 || !this.Q()) {
			return;
		}
		@Pc(17) Class308 local17 = arg1.aClass308Array1[arg2];
		@Pc(20) Class6_Sub38 local20 = local17.aClass6_Sub38_1;
		@Pc(29) Class308 local29 = null;
		if (arg7 != null) {
			local29 = arg7.aClass308Array1[arg8];
			if (local29.aClass6_Sub38_1 != local20) {
				local29 = null;
			}
		}
		this.method7255(arg5, arg0, null, arg4, 0, local20, arg6, arg3, local17, false, local29);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
	public abstract void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
	public abstract void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
	protected abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBIIILclient!d;III)V")
	protected final void method7269(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class59 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg2 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(30) int local30 = arg4.sa(local16 + arg7, local21 + arg6);
		@Pc(34) int local34 = arg2 / 2;
		@Pc(39) int local39 = -arg1 / 2;
		@Pc(48) int local48 = arg4.sa(local34 + arg7, local39 + arg6);
		@Pc(53) int local53 = -arg2 / 2;
		@Pc(57) int local57 = arg1 / 2;
		@Pc(66) int local66 = arg4.sa(local53 + arg7, local57 + arg6);
		@Pc(70) int local70 = arg2 / 2;
		@Pc(74) int local74 = arg1 / 2;
		@Pc(83) int local83 = arg4.sa(local70 + arg7, local74 + arg6);
		@Pc(90) int local90 = local30 >= local48 ? local48 : local30;
		@Pc(101) int local101 = local83 <= local66 ? local83 : local66;
		@Pc(120) int local120 = local83 <= local48 ? local83 : local48;
		@Pc(158) int local158;
		if (arg1 != 0) {
			@Pc(138) int local138 = (int) (Math.atan2((double) (local90 - local101), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local138 != 0) {
				if (arg0 != 0) {
					if (local138 > 8192) {
						local158 = 16384 - arg0;
						if (local158 > local138) {
							local138 = local158;
						}
					} else if (local138 > arg0) {
						local138 = arg0;
					}
				}
				this.AA(local138);
			}
		}
		@Pc(184) int local184 = local30 < local66 ? local30 : local66;
		@Pc(188) int local188 = local83 + local30;
		if (arg2 != 0) {
			@Pc(207) int local207 = (int) (Math.atan2((double) (local184 - local120), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local207 != 0) {
				if (arg5 != 0) {
					if (local207 > 8192) {
						local158 = 16384 - arg5;
						if (local207 < local158) {
							local207 = local158;
						}
					} else if (local207 > arg5) {
						local207 = arg5;
					}
				}
				this.v(local207);
			}
		}
		if (local188 > local66 + local48) {
			local188 = local48 + local66;
		}
		local188 = (local188 >> 1) - arg3;
		if (local188 != 0) {
			this.m(0, local188, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
	public abstract void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) Class59 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZII[I[IIIII)V")
	private void method7270(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(70) int local70;
		if (arg0 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local70 = -arg5;
				arg5 = arg2;
				arg2 = local70;
			} else if (arg8 == 3) {
				local70 = arg5;
				arg5 = arg2;
				arg2 = local70;
			} else if (arg8 == 2) {
				local70 = arg5;
				arg5 = -arg2 & 0x3FFF;
				arg2 = local70 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg2 = -arg2;
				arg5 = -arg5;
			} else if (arg8 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local70 = arg5;
				arg5 = -arg2;
				arg2 = local70;
			} else if (arg8 == 3) {
				local70 = arg5;
				arg5 = arg2;
				arg2 = local70;
			} else if (arg8 == 2) {
				local70 = arg5;
				arg5 = arg2 & 0x3FFF;
				arg2 = -local70 & 0x3FFF;
			}
		}
		if (arg6 == 65535) {
			this.E(arg8, arg3, arg5, arg7, arg2, arg0, arg1);
		} else {
			this.da(arg8, arg3, arg5, arg7, arg2, arg1, arg6, arg4);
		}
	}

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
	public abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
	public abstract int LA();

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()V")
	public abstract void method7271();

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
	protected abstract boolean Q();
}
