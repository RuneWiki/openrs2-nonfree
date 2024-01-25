import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public abstract class Class8 {

	static {
		new Class142("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	protected Class8() {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!mh;I)V")
	public final void method5981(@OriginalArg(1) Class1_Sub3_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.h()) {
			return;
		}
		@Pc(19) Class167 local19 = arg0.aClass167Array1[arg1];
		@Pc(22) Class1_Sub16 local22 = local19.aClass1_Sub16_1;
		for (@Pc(30) int local30 = 0; local30 < local19.anInt4697; local30++) {
			@Pc(37) short local37 = local19.aShortArray67[local30];
			if (local22.aBooleanArray53[local37]) {
				if (local19.aShortArray72[local30] != -1) {
					this.za(0, 0, 0, 0);
				}
				this.za(local22.anIntArray181[local37], local19.aShortArray71[local30], local19.aShortArray70[local30], local19.aShortArray69[local30]);
			}
		}
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
	public abstract void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public abstract void method5982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
	protected abstract boolean h();

	@OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Lclient!e;")
	public abstract Class8 method5983(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method5985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
	public abstract int k();

	@OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
	public abstract void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) Class139 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!e", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public abstract Class1_Sub3_Sub11 EA(@OriginalArg(0) Class1_Sub3_Sub11 arg0);

	@OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
	protected abstract void KA();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!wp;I)V")
	public abstract void method5987(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class111_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
	public abstract int Z();

	@OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()[Lclient!sd;")
	public abstract Class230[] method5988();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!mh;IIIZI[IIILclient!mh;)V")
	public final void method5989(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class1_Sub3_Sub14 arg8) {
		if (arg6 == -1 || !this.h()) {
			return;
		}
		@Pc(33) Class167 local33 = arg8.aClass167Array1[arg6];
		@Pc(36) Class1_Sub16 local36 = local33.aClass1_Sub16_1;
		@Pc(38) Class167 local38 = null;
		if (arg1 != null) {
			local38 = arg1.aClass167Array1[arg2];
			if (local36 != local38.aClass1_Sub16_1) {
				local38 = null;
			}
		}
		this.method5990(arg5, 0, local36, local33, false, arg0, arg3, arg4, null, local38, arg7);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
	public abstract int S();

	@OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([IILclient!gg;Lclient!nb;ZIIZ[ZLclient!nb;II)V")
	private void method5990(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub16 arg2, @OriginalArg(3) Class167 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) Class167 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg9 == null || arg6 == 0) {
			for (local11 = 0; local11 < arg3.anInt4697; local11++) {
				@Pc(18) short local18 = arg3.aShortArray67[local11];
				if (arg8 == null || arg4 == arg8[local18] || arg2.anIntArray181[local18] == 0) {
					@Pc(43) short local43 = arg3.aShortArray72[local11];
					if (local43 != -1) {
						this.method6000(0, arg7, arg0, 0, 0, 0, arg1, arg2.anIntArrayArray21[local43], arg2.anIntArray180[local43] & arg10);
					}
					this.method6000(arg3.aShortArray70[local11], arg7, arg0, arg2.anIntArray181[local18], arg3.aShortArray71[local11], arg3.aShortArray69[local11], arg1, arg2.anIntArrayArray21[local18], arg2.anIntArray180[local18] & arg10);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(112) int local112 = 0;
		for (@Pc(122) int local122 = 0; local122 < arg2.anInt2066; local122++) {
			@Pc(126) boolean local126 = false;
			if (arg3.anInt4697 > local11 && arg3.aShortArray67[local11] == local122) {
				local126 = true;
			}
			@Pc(144) boolean local144 = false;
			if (local112 < arg9.anInt4697 && arg9.aShortArray67[local112] == local122) {
				local144 = true;
			}
			if (local126 || local144) {
				if (arg8 == null || arg4 == arg8[local122] || arg2.anIntArray181[local122] == 0) {
					@Pc(186) short local186 = 0;
					@Pc(191) int local191 = arg2.anIntArray181[local122];
					if (local191 == 3 || local191 == 10) {
						local186 = 128;
					}
					@Pc(208) short local208;
					@Pc(218) short local218;
					@Pc(228) short local228;
					@Pc(223) short local223;
					@Pc(213) byte local213;
					if (local126) {
						local208 = arg3.aShortArray71[local11];
						local213 = arg3.aByteArray69[local11];
						local218 = arg3.aShortArray70[local11];
						local223 = arg3.aShortArray72[local11];
						local228 = arg3.aShortArray69[local11];
						local11++;
					} else {
						local213 = 0;
						local208 = local186;
						local218 = local186;
						local223 = -1;
						local228 = local186;
					}
					@Pc(249) short local249;
					@Pc(245) short local245;
					@Pc(253) short local253;
					@Pc(251) short local251;
					@Pc(247) byte local247;
					if (local144) {
						local249 = arg9.aShortArray71[local112];
						local251 = arg9.aShortArray72[local112];
						local253 = arg9.aShortArray69[local112];
						local247 = arg9.aByteArray69[local112];
						local245 = arg9.aShortArray70[local112];
						local112++;
					} else {
						local245 = local186;
						local247 = 0;
						local249 = local186;
						local251 = -1;
						local253 = local186;
					}
					@Pc(344) int local344;
					@Pc(334) int local334;
					@Pc(361) int local361;
					if ((local213 & 0x2) == 0 && (local247 & 0x1) == 0) {
						@Pc(304) int local304;
						if (local191 == 2) {
							local304 = local249 - local208 & 0x3FFF;
							@Pc(310) int local310 = local245 - local218 & 0x3FFF;
							if (local310 >= 8192) {
								local310 -= 16384;
							}
							if (local304 >= 8192) {
								local304 -= 16384;
							}
							@Pc(324) int local324 = local253 - local228 & 0x3FFF;
							local334 = local310 * arg6 / arg5 + local218 & 0x3FFF;
							local344 = local304 * arg6 / arg5 + local208 & 0x3FFF;
							if (local324 >= 8192) {
								local324 -= 16384;
							}
							local361 = local228 + local324 * arg6 / arg5 & 0x3FFF;
						} else if (local191 == 9) {
							local304 = local249 - local208 & 0x3FFF;
							if (local304 >= 8192) {
								local304 -= 16384;
							}
							local361 = 0;
							local334 = 0;
							local344 = local208 + local304 * arg6 / arg5 & 0x3FFF;
						} else if (local191 == 7) {
							local304 = local249 - local208 & 0x3F;
							if (local304 >= 32) {
								local304 -= 64;
							}
							local344 = local208 + local304 * arg6 / arg5 & 0x3F;
							local334 = arg6 * (local245 - local218) / arg5 + local218;
							local361 = local228 + (local253 - local228) * arg6 / arg5;
						} else {
							local334 = local218 + (local245 - local218) * arg6 / arg5;
							local344 = arg6 * (local249 - local208) / arg5 + local208;
							local361 = local228 + (local253 - local228) * arg6 / arg5;
						}
					} else {
						local344 = local208;
						local334 = local218;
						local361 = local228;
					}
					if (local223 != -1) {
						this.method6000(0, arg7, arg0, 0, 0, 0, arg1, arg2.anIntArrayArray21[local223], arg10 & arg2.anIntArray180[local223]);
					} else if (local251 != -1) {
						this.method6000(0, arg7, arg0, 0, 0, 0, arg1, arg2.anIntArrayArray21[local251], arg2.anIntArray180[local251] & arg10);
					}
					this.method6000(local334, arg7, arg0, local191, local344, local361, arg1, arg2.anIntArrayArray21[local122], arg2.anIntArray180[local122] & arg10);
				} else {
					if (local126) {
						local11++;
					}
					if (local144) {
						local112++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()V")
	public abstract void method5991();

	@OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZILclient!mh;II[ZLclient!mh;ILclient!mh;IIIIILclient!mh;)V")
	public final void method5992(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean[] arg5, @OriginalArg(6) Class1_Sub3_Sub14 arg6, @OriginalArg(8) Class1_Sub3_Sub14 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class1_Sub3_Sub14 arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg5 == null || arg9 == -1) {
			this.method5998(arg1, arg10, arg6, 0, arg4, arg3, arg0, arg13);
		} else if (this.h()) {
			@Pc(34) Class167 local34 = arg13.aClass167Array1[arg1];
			@Pc(37) Class1_Sub16 local37 = local34.aClass1_Sub16_1;
			@Pc(39) Class167 local39 = null;
			if (arg6 != null) {
				local39 = arg6.aClass167Array1[arg10];
				if (local39.aClass1_Sub16_1 != local37) {
					local39 = null;
				}
			}
			this.method5990(null, 0, local37, local34, false, arg3, arg4, arg0, arg5, local39, 65535);
			@Pc(81) Class167 local81 = arg2.aClass167Array1[arg9];
			@Pc(83) Class167 local83 = null;
			if (arg7 != null) {
				local83 = arg7.aClass167Array1[arg12];
				if (local83.aClass1_Sub16_1 != local37) {
					local83 = null;
				}
			}
			this.va(0, new int[0], 0, 0, 0, 0, arg0);
			this.method5990(null, 0, local81.aClass1_Sub16_1, local81, true, arg11, arg8, arg0, arg5, local83, 65535);
			this.KA();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIILclient!ya;II)V")
	protected final void method5993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class139 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg0 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(31) int local31 = arg5.ca(arg6 + local16, arg3 - -local21);
		@Pc(35) int local35 = arg0 / 2;
		@Pc(40) int local40 = -arg1 / 2;
		@Pc(49) int local49 = arg5.ca(arg6 + local35, arg3 + local40);
		@Pc(59) int local59 = -arg0 / 2;
		@Pc(63) int local63 = arg1 / 2;
		@Pc(73) int local73 = arg5.ca(arg6 + local59, arg3 - -local63);
		@Pc(77) int local77 = arg0 / 2;
		@Pc(81) int local81 = arg1 / 2;
		@Pc(90) int local90 = arg5.ca(arg6 + local77, local81 + arg3);
		@Pc(101) int local101 = local49 > local31 ? local31 : local49;
		@Pc(108) int local108 = local90 > local73 ? local73 : local90;
		@Pc(119) int local119 = local90 <= local49 ? local90 : local49;
		@Pc(126) int local126 = local73 <= local31 ? local73 : local31;
		@Pc(156) int local156;
		if (arg1 != 0) {
			@Pc(141) int local141 = (int) (Math.atan2((double) (local101 - local108), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local141 != 0) {
				if (arg4 != 0) {
					if (local141 > 8192) {
						local156 = 16384 - arg4;
						if (local141 < local156) {
							local141 = local156;
						}
					} else if (arg4 < local141) {
						local141 = arg4;
					}
				}
				this.W(local141);
			}
		}
		@Pc(180) int local180 = local31 + local90;
		if (arg0 != 0) {
			@Pc(196) int local196 = (int) (Math.atan2((double) (local126 - local119), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local196 != 0) {
				if (arg2 != 0) {
					if (local196 > 8192) {
						local156 = 16384 - arg2;
						if (local156 > local196) {
							local196 = local156;
						}
					} else if (local196 > arg2) {
						local196 = arg2;
					}
				}
				this.K(local196);
			}
		}
		if (local73 + local49 < local180) {
			local180 = local73 + local49;
		}
		local180 = (local180 >> 1) - arg7;
		if (local180 != 0) {
			this.a(0, local180, 0);
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()Z")
	public abstract boolean method5994();

	@OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
	public abstract int B();

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()[Lclient!ck;")
	public abstract Class40[] method5995();

	@OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	public abstract void method5996(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
	public abstract void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
	public abstract int ta();

	@OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
	public abstract void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
	public abstract void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
	public abstract void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIILclient!mh;IIIZLclient!mh;)V")
	public final void method5998(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub14 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class1_Sub3_Sub14 arg7) {
		if (arg0 == -1 || !this.h()) {
			return;
		}
		@Pc(21) Class167 local21 = arg7.aClass167Array1[arg0];
		@Pc(24) Class1_Sub16 local24 = local21.aClass1_Sub16_1;
		@Pc(26) Class167 local26 = null;
		if (arg2 != null) {
			local26 = arg2.aClass167Array1[arg1];
			if (local24 != local26.aClass1_Sub16_1) {
				local26 = null;
			}
		}
		this.method5990(null, arg3, local24, local21, false, arg5, arg4, arg6, null, local26, 65535);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!wp;II)V")
	public abstract void method5999(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class111_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ[IIIIII[II)V")
	private void method6000(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(21) int local21;
		if (arg6 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local21 = -arg4;
				arg4 = arg5;
				arg5 = local21;
			} else if (arg3 == 3) {
				local21 = arg4;
				arg4 = arg5;
				arg5 = local21;
			} else if (arg3 == 2) {
				local21 = arg4;
				arg4 = -arg5 & 0x3FFF;
				arg5 = local21 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg5 = -arg5;
				arg4 = -arg4;
			} else if (arg3 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local21 = arg4;
				arg4 = -arg5;
				arg5 = local21;
			} else if (arg3 == 3) {
				local21 = arg4;
				arg4 = arg5;
				arg5 = local21;
			} else if (arg3 == 2) {
				local21 = arg4;
				arg4 = arg5 & 0x3FFF;
				arg5 = -local21 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.va(arg3, arg7, arg4, arg0, arg5, arg6, arg1);
		} else {
			this.aa(arg3, arg7, arg4, arg0, arg5, arg1, arg8, arg2);
		}
	}

	@OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);
}
