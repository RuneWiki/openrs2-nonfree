import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public abstract class Class59 {

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	protected Class59() {
	}

	@OriginalMember(owner = "client!e", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public abstract Class2_Sub5_Sub7 EA(@OriginalArg(0) Class2_Sub5_Sub7 arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II[II[IIIIIZ)V")
	private void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(40) int local40;
		if (arg1 == 1) {
			if (arg6 == 0 || arg6 == 1) {
				local40 = -arg7;
				arg7 = arg5;
				arg5 = local40;
			} else if (arg6 == 3) {
				local40 = arg7;
				arg7 = arg5;
				arg5 = local40;
			} else if (arg6 == 2) {
				local40 = arg7;
				arg7 = -arg5 & 0x3FFF;
				arg5 = local40 & 0x3FFF;
			}
		} else if (arg1 == 2) {
			if (arg6 == 0 || arg6 == 1) {
				arg5 = -arg5;
				arg7 = -arg7;
			} else if (arg6 == 2) {
				arg7 = -arg7 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg1 == 3) {
			if (arg6 == 0 || arg6 == 1) {
				local40 = arg7;
				arg7 = -arg5;
				arg5 = local40;
			} else if (arg6 == 3) {
				local40 = arg7;
				arg7 = arg5;
				arg5 = local40;
			} else if (arg6 == 2) {
				local40 = arg7;
				arg7 = arg5 & 0x3FFF;
				arg5 = -local40 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.va(arg6, arg2, arg7, arg3, arg5, arg1, arg8);
		} else {
			this.aa(arg6, arg2, arg7, arg3, arg5, arg8, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
	public abstract int ta();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI[IIIILclient!wh;IILclient!wh;I)V")
	public final void method5735(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class2_Sub5_Sub18 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class2_Sub5_Sub18 arg7, @OriginalArg(10) int arg8) {
		if (arg8 == -1 || !this.h()) {
			return;
		}
		@Pc(22) Class266 local22 = arg7.aClass266Array1[arg8];
		@Pc(25) Class2_Sub4 local25 = local22.aClass2_Sub4_1;
		@Pc(27) Class266 local27 = null;
		if (arg5 != null) {
			local27 = arg5.aClass266Array1[arg4];
			if (local27.aClass2_Sub4_1 != local25) {
				local27 = null;
			}
		}
		this.method5744(arg6, local27, arg0, 0, arg2, local22, arg1, local25, null, arg3, false);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!rr;I)V")
	public abstract void method5736(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Lclient!e;")
	public abstract Class59 method5737(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
	public abstract void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
	public abstract int Z();

	@OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
	public abstract void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!wh;I)V")
	public final void method5739(@OriginalArg(1) Class2_Sub5_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.h()) {
			return;
		}
		@Pc(19) Class266 local19 = arg0.aClass266Array1[arg1];
		@Pc(22) Class2_Sub4 local22 = local19.aClass2_Sub4_1;
		for (@Pc(24) int local24 = 0; local24 < local19.anInt7169; local24++) {
			@Pc(31) short local31 = local19.aShortArray107[local24];
			if (local22.aBooleanArray2[local31]) {
				if (local19.aShortArray115[local24] != -1) {
					this.za(0, 0, 0, 0);
				}
				this.za(local22.anIntArray49[local31], local19.aShortArray113[local24], local19.aShortArray108[local24], local19.aShortArray112[local24]);
			}
		}
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIILclient!ya;II)V")
	protected final void method5741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class162 arg6, @OriginalArg(7) int arg7) {
		@Pc(16) int local16 = -arg4 / 2;
		@Pc(21) int local21 = -arg5 / 2;
		@Pc(30) int local30 = arg6.ca(local16 + arg7, local21 + arg0);
		@Pc(34) int local34 = arg4 / 2;
		@Pc(39) int local39 = -arg5 / 2;
		@Pc(48) int local48 = arg6.ca(local34 + arg7, arg0 + local39);
		@Pc(53) int local53 = -arg4 / 2;
		@Pc(57) int local57 = arg5 / 2;
		@Pc(68) int local68 = arg6.ca(arg7 + local53, arg0 - -local57);
		@Pc(72) int local72 = arg4 / 2;
		@Pc(76) int local76 = arg5 / 2;
		@Pc(86) int local86 = arg6.ca(arg7 + local72, local76 + arg0);
		@Pc(97) int local97 = local30 < local48 ? local30 : local48;
		@Pc(104) int local104 = local68 >= local86 ? local86 : local68;
		@Pc(115) int local115 = local86 > local48 ? local48 : local86;
		@Pc(126) int local126 = local30 >= local68 ? local68 : local30;
		@Pc(169) int local169;
		if (arg5 != 0) {
			@Pc(141) int local141 = (int) (Math.atan2((double) (local97 - local104), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local141 != 0) {
				if (arg3 != 0) {
					if (local141 > 8192) {
						local169 = 16384 - arg3;
						if (local169 > local141) {
							local141 = local169;
						}
					} else if (local141 > arg3) {
						local141 = arg3;
					}
				}
				this.W(local141);
			}
		}
		if (arg4 != 0) {
			@Pc(196) int local196 = (int) (Math.atan2((double) (local126 - local115), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local196 != 0) {
				if (arg1 != 0) {
					if (local196 > 8192) {
						local169 = 16384 - arg1;
						if (local196 < local169) {
							local196 = local169;
						}
					} else if (local196 > arg1) {
						local196 = arg1;
					}
				}
				this.K(local196);
			}
		}
		@Pc(239) int local239 = local86 + local30;
		if (local68 + local48 < local239) {
			local239 = local68 + local48;
		}
		local239 = (local239 >> 1) - arg2;
		if (local239 != 0) {
			this.a(0, local239, 0);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()[Lclient!mf;")
	public abstract Class155[] method5742();

	@OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
	public abstract void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	public abstract void method5743(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
	public abstract int k();

	@OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!wj;ZI[IBLclient!wj;ILclient!bg;[ZIZ)V")
	private void method5744(@OriginalArg(0) int arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) Class266 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub4 arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(14) int local14;
		if (arg1 == null || arg9 == 0) {
			for (local14 = 0; local14 < arg5.anInt7169; local14++) {
				@Pc(21) short local21 = arg5.aShortArray107[local14];
				if (arg8 == null || arg10 == arg8[local21] || arg7.anIntArray49[local21] == 0) {
					@Pc(49) short local49 = arg5.aShortArray115[local14];
					if (local49 != -1) {
						this.method5734(arg7.anIntArray48[local49] & arg0, arg3, arg7.anIntArrayArray3[local49], 0, arg4, 0, 0, 0, arg2);
					}
					this.method5734(arg0 & arg7.anIntArray48[local21], arg3, arg7.anIntArrayArray3[local21], arg5.aShortArray108[local14], arg4, arg5.aShortArray112[local14], arg7.anIntArray49[local21], arg5.aShortArray113[local14], arg2);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(125) int local125 = 0;
		for (@Pc(127) int local127 = 0; local127 < arg7.anInt579; local127++) {
			@Pc(131) boolean local131 = false;
			if (arg5.anInt7169 > local14 && arg5.aShortArray107[local14] == local127) {
				local131 = true;
			}
			@Pc(149) boolean local149 = false;
			if (local125 < arg1.anInt7169 && arg1.aShortArray107[local125] == local127) {
				local149 = true;
			}
			if (local131 || local149) {
				if (arg8 == null || arg10 == arg8[local127] || arg7.anIntArray49[local127] == 0) {
					@Pc(199) short local199 = 0;
					@Pc(204) int local204 = arg7.anIntArray49[local127];
					if (local204 == 3 || local204 == 10) {
						local199 = 128;
					}
					@Pc(228) short local228;
					@Pc(224) short local224;
					@Pc(222) short local222;
					@Pc(226) short local226;
					@Pc(220) byte local220;
					if (local131) {
						local226 = arg5.aShortArray115[local14];
						local220 = arg5.aByteArray93[local14];
						local224 = arg5.aShortArray108[local14];
						local222 = arg5.aShortArray112[local14];
						local228 = arg5.aShortArray113[local14];
						local14++;
					} else {
						local220 = 0;
						local222 = local199;
						local224 = local199;
						local226 = -1;
						local228 = local199;
					}
					@Pc(268) short local268;
					@Pc(264) short local264;
					@Pc(260) short local260;
					@Pc(262) short local262;
					@Pc(266) byte local266;
					if (local149) {
						local260 = arg1.aShortArray112[local125];
						local262 = arg1.aShortArray115[local125];
						local264 = arg1.aShortArray108[local125];
						local266 = arg1.aByteArray93[local125];
						local268 = arg1.aShortArray113[local125];
						local125++;
					} else {
						local260 = local199;
						local262 = -1;
						local264 = local199;
						local266 = 0;
						local268 = local199;
					}
					@Pc(354) int local354;
					@Pc(365) int local365;
					@Pc(375) int local375;
					if ((local220 & 0x2) == 0 && (local266 & 0x1) == 0) {
						@Pc(316) int local316;
						if (local204 == 2) {
							local316 = local268 - local228 & 0x3FFF;
							@Pc(323) int local323 = local264 - local224 & 0x3FFF;
							@Pc(330) int local330 = local260 - local222 & 0x3FFF;
							if (local323 >= 8192) {
								local323 -= 16384;
							}
							if (local316 >= 8192) {
								local316 -= 16384;
							}
							if (local330 >= 8192) {
								local330 -= 16384;
							}
							local354 = local316 * arg9 / arg6 + local228 & 0x3FFF;
							local365 = local224 + arg9 * local323 / arg6 & 0x3FFF;
							local375 = local330 * arg9 / arg6 + local222 & 0x3FFF;
						} else if (local204 == 9) {
							local316 = local268 - local228 & 0x3FFF;
							if (local316 >= 8192) {
								local316 -= 16384;
							}
							local354 = local228 + local316 * arg9 / arg6 & 0x3FFF;
							local375 = 0;
							local365 = 0;
						} else if (local204 == 7) {
							local316 = local268 - local228 & 0x3F;
							if (local316 >= 32) {
								local316 -= 64;
							}
							local375 = local222 + (local260 - local222) * arg9 / arg6;
							local365 = arg9 * (local264 - local224) / arg6 + local224;
							local354 = local228 + arg9 * local316 / arg6 & 0x3F;
						} else {
							local354 = (local268 - local228) * arg9 / arg6 + local228;
							local365 = local224 + (local264 - local224) * arg9 / arg6;
							local375 = local222 + (local260 - local222) * arg9 / arg6;
						}
					} else {
						local375 = local222;
						local354 = local228;
						local365 = local224;
					}
					if (local226 != -1) {
						this.method5734(arg0 & arg7.anIntArray48[local226], arg3, arg7.anIntArrayArray3[local226], 0, arg4, 0, 0, 0, arg2);
					} else if (local262 != -1) {
						this.method5734(arg7.anIntArray48[local262] & arg0, arg3, arg7.anIntArrayArray3[local262], 0, arg4, 0, 0, 0, arg2);
					}
					this.method5734(arg7.anIntArray48[local127] & arg0, arg3, arg7.anIntArrayArray3[local127], local365, arg4, local375, local204, local354, arg2);
				} else {
					if (local131) {
						local14++;
					}
					if (local149) {
						local125++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
	protected abstract void KA();

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()V")
	public abstract void method5745();

	@OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public abstract void method5746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZB[ZIIILclient!wh;Lclient!wh;IILclient!wh;IILclient!wh;I)V")
	public final void method5747(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub5_Sub18 arg5, @OriginalArg(7) Class2_Sub5_Sub18 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class2_Sub5_Sub18 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class2_Sub5_Sub18 arg12, @OriginalArg(14) int arg13) {
		if (arg8 == -1) {
			return;
		}
		if (arg1 == null || arg2 == -1) {
			this.method5750(arg9, arg4, arg10, 0, arg12, arg3, arg8, arg0);
		} else if (this.h()) {
			@Pc(34) Class266 local34 = arg12.aClass266Array1[arg8];
			@Pc(37) Class2_Sub4 local37 = local34.aClass2_Sub4_1;
			@Pc(39) Class266 local39 = null;
			if (arg9 != null) {
				local39 = arg9.aClass266Array1[arg10];
				if (local39.aClass2_Sub4_1 != local37) {
					local39 = null;
				}
			}
			this.method5744(65535, local39, arg0, 0, null, local34, arg3, local37, arg1, arg4, false);
			@Pc(79) Class266 local79 = arg5.aClass266Array1[arg2];
			@Pc(81) Class266 local81 = null;
			if (arg6 != null) {
				local81 = arg6.aClass266Array1[arg13];
				if (local81.aClass2_Sub4_1 != local37) {
					local81 = null;
				}
			}
			this.va(0, new int[0], 0, 0, 0, 0, arg0);
			this.method5744(65535, local81, arg0, 0, null, local79, arg11, local79.aClass2_Sub4_1, arg1, arg7, true);
			this.KA();
		}
	}

	@OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method5748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()[Lclient!qe;")
	public abstract Class199[] method5749();

	@OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
	public abstract int S();

	@OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!wh;IIILclient!wh;BIIZ)V")
	public final void method5750(@OriginalArg(0) Class2_Sub5_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub5_Sub18 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		if (arg6 == -1 || !this.h()) {
			return;
		}
		@Pc(17) Class266 local17 = arg4.aClass266Array1[arg6];
		@Pc(20) Class2_Sub4 local20 = local17.aClass2_Sub4_1;
		@Pc(22) Class266 local22 = null;
		if (arg0 != null) {
			local22 = arg0.aClass266Array1[arg2];
			if (local22.aClass2_Sub4_1 != local20) {
				local22 = null;
			}
		}
		this.method5744(65535, local22, arg7, arg3, null, local17, arg5, local20, null, arg1, false);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
	protected abstract boolean h();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!rr;II)V")
	public abstract void method5751(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(3) Class162 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
	public abstract void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
	public abstract void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()Z")
	public abstract boolean method5752();

	@OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
	public abstract void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
	public abstract int B();
}
