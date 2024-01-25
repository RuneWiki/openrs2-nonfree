import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class57 {

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class57() {
	}

	@OriginalMember(owner = "client!ka", name = "IA", descriptor = "(I)V")
	public abstract void IA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(SS)V")
	public abstract void i(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "()I")
	public abstract int ia();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!o;IIIIIBII)V")
	protected final void method6068(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg5 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(30) int local30 = arg0.R(arg4 + local16, arg3 + local21);
		@Pc(34) int local34 = arg5 / 2;
		@Pc(39) int local39 = -arg1 / 2;
		@Pc(49) int local49 = arg0.R(local34 + arg4, arg3 - -local39);
		@Pc(54) int local54 = -arg5 / 2;
		@Pc(58) int local58 = arg1 / 2;
		@Pc(68) int local68 = arg0.R(arg4 + local54, arg3 + local58);
		@Pc(72) int local72 = arg5 / 2;
		@Pc(80) int local80 = arg1 / 2;
		@Pc(90) int local90 = arg0.R(arg4 + local72, arg3 - -local80);
		@Pc(101) int local101 = local30 < local49 ? local30 : local49;
		@Pc(112) int local112 = local90 > local68 ? local68 : local90;
		@Pc(123) int local123 = local49 < local90 ? local49 : local90;
		@Pc(156) int local156;
		if (arg1 != 0) {
			@Pc(139) int local139 = (int) (Math.atan2((double) (local101 - local112), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local139 != 0) {
				if (arg6 != 0) {
					if (local139 > 8192) {
						local156 = 16384 - arg6;
						if (local139 < local156) {
							local139 = local156;
						}
					} else if (arg6 < local139) {
						local139 = arg6;
					}
				}
				this.E(local139);
			}
		}
		@Pc(178) int local178 = local68 > local30 ? local30 : local68;
		@Pc(182) int local182 = local90 + local30;
		if (arg5 != 0) {
			@Pc(198) int local198 = (int) (Math.atan2((double) (local178 - local123), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local198 != 0) {
				if (arg2 != 0) {
					if (local198 > 8192) {
						local156 = 16384 - arg2;
						if (local198 < local156) {
							local198 = local156;
						}
					} else if (arg2 < local198) {
						local198 = arg2;
					}
				}
				this.S(local198);
			}
		}
		if (local68 + local49 < local182) {
			local182 = local68 + local49;
		}
		local182 = (local182 >> 1) - arg7;
		if (local182 != 0) {
			this.R(0, local182, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public abstract void method6069();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!n;Z)Z")
	public abstract boolean method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "(I)V")
	public abstract void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(Lclient!ia;)Lclient!ia;")
	public abstract Class4_Sub1_Sub6 LA(@OriginalArg(0) Class4_Sub1_Sub6 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[I[IIIZII)V")
	private void method6071(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(29) int local29;
		if (arg0 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local29 = -arg5;
				arg5 = arg7;
				arg7 = local29;
			} else if (arg8 == 3) {
				local29 = arg5;
				arg5 = arg7;
				arg7 = local29;
			} else if (arg8 == 2) {
				local29 = arg5;
				arg5 = -arg7 & 0x3FFF;
				arg7 = local29 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg5 = -arg5;
				arg7 = -arg7;
			} else if (arg8 == 2) {
				arg7 = -arg7 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local29 = arg5;
				arg5 = -arg7;
				arg7 = local29;
			} else if (arg8 == 3) {
				local29 = arg5;
				arg5 = arg7;
				arg7 = local29;
			} else if (arg8 == 2) {
				local29 = arg5;
				arg5 = arg7 & 0x3FFF;
				arg7 = -local29 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.e(arg8, arg3, arg5, arg1, arg7, arg0, arg6);
		} else {
			this.W(arg8, arg3, arg5, arg1, arg7, arg6, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "(I)V")
	public abstract void S(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!rw;Z)V")
	public final void method6072(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub17 arg1) {
		if (arg0 == -1 || !this.AA()) {
			return;
		}
		@Pc(18) Class227 local18 = arg1.aClass227Array1[arg0];
		@Pc(21) Class4_Sub24 local21 = local18.aClass4_Sub24_1;
		for (@Pc(29) int local29 = 0; local29 < local18.anInt6324; local29++) {
			@Pc(36) short local36 = local18.aShortArray99[local29];
			if (local21.aBooleanArray84[local36]) {
				if (local18.aShortArray100[local29] != -1) {
					this.la(0, 0, 0, 0);
				}
				this.la(local21.anIntArray359[local36], local18.aShortArray94[local29], local18.aShortArray96[local29], local18.aShortArray92[local29]);
			}
		}
		this.ha();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!n;Lclient!wc;I)V")
	public abstract void method6073(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class71_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "(I[IIIIZI[I)V")
	protected abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()I")
	public abstract int F();

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I[IIIIIZ)V")
	protected abstract void e(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(IILclient!o;Lclient!o;III)V")
	public abstract void g(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "(I)V")
	public abstract void l(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class57 method6075(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "(I)V")
	public abstract void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lclient!eh;")
	public abstract Class61[] method6076();

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "()I")
	public abstract int D();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIIILclient!rw;ZLclient!rw;I)V")
	public final void method6077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub1_Sub17 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class4_Sub1_Sub17 arg6, @OriginalArg(8) int arg7) {
		if (arg7 == -1 || !this.AA()) {
			return;
		}
		@Pc(22) Class227 local22 = arg4.aClass227Array1[arg7];
		@Pc(25) Class4_Sub24 local25 = local22.aClass4_Sub24_1;
		@Pc(27) Class227 local27 = null;
		if (arg6 != null) {
			local27 = arg6.aClass227Array1[arg0];
			if (local25 != local27.aClass4_Sub24_1) {
				local27 = null;
			}
		}
		this.method6082(arg3, local27, local25, arg2, null, null, 65535, local22, arg5, false, arg1);
		this.ha();
	}

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "(SS)V")
	public abstract void G(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "la", descriptor = "(IIII)V")
	protected abstract void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "(I)V")
	public abstract void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "ha", descriptor = "()V")
	protected abstract void ha();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
	public abstract boolean method6078();

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "(III)V")
	public abstract void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method6079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method6080(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "AA", descriptor = "()Z")
	protected abstract boolean AA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!rt;Lclient!ll;II[I[ZILclient!rt;ZZI)V")
	private void method6082(@OriginalArg(0) int arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(2) Class4_Sub24 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class227 arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg1 == null || arg0 == 0) {
			for (local11 = 0; local11 < arg7.anInt6324; local11++) {
				@Pc(18) short local18 = arg7.aShortArray99[local11];
				if (arg5 == null || arg5[local18] == arg9 || arg2.anIntArray359[local18] == 0) {
					@Pc(42) short local42 = arg7.aShortArray100[local11];
					if (local42 != -1) {
						this.method6071(arg10, 0, arg4, arg2.anIntArrayArray31[local42], arg2.anIntArray360[local42] & arg6, 0, arg8, 0, 0);
					}
					this.method6071(arg10, arg7.aShortArray96[local11], arg4, arg2.anIntArrayArray31[local18], arg2.anIntArray360[local18] & arg6, arg7.aShortArray94[local11], arg8, arg7.aShortArray92[local11], arg2.anIntArray359[local18]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(111) int local111 = 0;
		for (@Pc(113) int local113 = 0; local113 < arg2.anInt4507; local113++) {
			@Pc(117) boolean local117 = false;
			if (arg7.anInt6324 > local11 && arg7.aShortArray99[local11] == local113) {
				local117 = true;
			}
			@Pc(135) boolean local135 = false;
			if (local111 < arg1.anInt6324 && local113 == arg1.aShortArray99[local111]) {
				local135 = true;
			}
			if (local117 || local135) {
				if (arg5 == null || arg9 == arg5[local113] || arg2.anIntArray359[local113] == 0) {
					@Pc(181) short local181 = 0;
					@Pc(186) int local186 = arg2.anIntArray359[local113];
					if (local186 == 3 || local186 == 10) {
						local181 = 128;
					}
					@Pc(208) short local208;
					@Pc(218) short local218;
					@Pc(203) short local203;
					@Pc(223) short local223;
					@Pc(213) byte local213;
					if (local117) {
						local203 = arg7.aShortArray92[local11];
						local208 = arg7.aShortArray94[local11];
						local213 = arg7.aByteArray85[local11];
						local218 = arg7.aShortArray96[local11];
						local223 = arg7.aShortArray100[local11];
						local11++;
					} else {
						local208 = local181;
						local203 = local181;
						local213 = 0;
						local223 = -1;
						local218 = local181;
					}
					@Pc(244) short local244;
					@Pc(248) short local248;
					@Pc(240) short local240;
					@Pc(242) short local242;
					@Pc(246) byte local246;
					if (local135) {
						local248 = arg1.aShortArray96[local111];
						local240 = arg1.aShortArray92[local111];
						local246 = arg1.aByteArray85[local111];
						local242 = arg1.aShortArray100[local111];
						local244 = arg1.aShortArray94[local111];
						local111++;
					} else {
						local240 = local181;
						local242 = -1;
						local244 = local181;
						local246 = 0;
						local248 = local181;
					}
					@Pc(289) int local289;
					@Pc(291) int local291;
					@Pc(293) int local293;
					if ((local213 & 0x2) == 0 && (local246 & 0x1) == 0) {
						@Pc(305) int local305;
						if (local186 == 2) {
							local305 = local244 - local208 & 0x3FFF;
							@Pc(312) int local312 = local248 - local218 & 0x3FFF;
							if (local312 >= 8192) {
								local312 -= 16384;
							}
							@Pc(323) int local323 = local240 - local203 & 0x3FFF;
							if (local305 >= 8192) {
								local305 -= 16384;
							}
							local291 = local312 * arg0 / arg3 + local218 & 0x3FFF;
							local289 = local305 * arg0 / arg3 + local208 & 0x3FFF;
							if (local323 >= 8192) {
								local323 -= 16384;
							}
							local293 = arg0 * local323 / arg3 + local203 & 0x3FFF;
						} else if (local186 == 9) {
							local305 = local244 - local208 & 0x3FFF;
							if (local305 >= 8192) {
								local305 -= 16384;
							}
							local289 = arg0 * local305 / arg3 + local208 & 0x3FFF;
							local293 = 0;
							local291 = 0;
						} else if (local186 == 7) {
							local305 = local244 - local208 & 0x3F;
							if (local305 >= 32) {
								local305 -= 64;
							}
							local293 = arg0 * (local240 - local203) / arg3 + local203;
							local289 = arg0 * local305 / arg3 + local208 & 0x3F;
							local291 = (local248 - local218) * arg0 / arg3 + local218;
						} else {
							local289 = (local244 - local208) * arg0 / arg3 + local208;
							local293 = local203 + arg0 * (local240 - local203) / arg3;
							local291 = arg0 * (local248 - local218) / arg3 + local218;
						}
					} else {
						local289 = local208;
						local291 = local218;
						local293 = local203;
					}
					if (local223 != -1) {
						this.method6071(arg10, 0, arg4, arg2.anIntArrayArray31[local223], arg2.anIntArray360[local223] & arg6, 0, arg8, 0, 0);
					} else if (local242 != -1) {
						this.method6071(arg10, 0, arg4, arg2.anIntArrayArray31[local242], arg6 & arg2.anIntArray360[local242], 0, arg8, 0, 0);
					}
					this.method6071(arg10, local291, arg4, arg2.anIntArrayArray31[local113], arg6 & arg2.anIntArray360[local113], local289, arg8, local293, local186);
				} else {
					if (local135) {
						local111++;
					}
					if (local117) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!tb;")
	public abstract Class239[] method6083();

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "(I)V")
	public abstract void B(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rw;IIIZI[IIIILclient!rw;)V")
	public final void method6085(@OriginalArg(0) Class4_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Class4_Sub1_Sub17 arg8) {
		if (arg4 == -1 || !this.AA()) {
			return;
		}
		@Pc(18) Class227 local18 = arg0.aClass227Array1[arg4];
		@Pc(21) Class4_Sub24 local21 = local18.aClass4_Sub24_1;
		@Pc(23) Class227 local23 = null;
		if (arg8 != null) {
			local23 = arg8.aClass227Array1[arg7];
			if (local21 != local23.aClass4_Sub24_1) {
				local23 = null;
			}
		}
		this.method6082(arg2, local23, local21, arg6, arg5, null, arg1, local18, arg3, false, 0);
		this.ha();
	}

	@OriginalMember(owner = "client!ka", name = "ja", descriptor = "()I")
	public abstract int ja();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rw;[ZLclient!rw;Lclient!rw;IIIIIIIILclient!rw;IZ)V")
	public final void method6086(@OriginalArg(0) Class4_Sub1_Sub17 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) Class4_Sub1_Sub17 arg2, @OriginalArg(3) Class4_Sub1_Sub17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class4_Sub1_Sub17 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		if (arg5 == -1) {
			return;
		}
		if (arg1 == null || arg6 == -1) {
			this.method6077(arg9, 0, arg8, arg4, arg11, arg13, arg3, arg5);
		} else if (this.AA()) {
			@Pc(35) Class227 local35 = arg11.aClass227Array1[arg5];
			@Pc(38) Class4_Sub24 local38 = local35.aClass4_Sub24_1;
			@Pc(40) Class227 local40 = null;
			if (arg3 != null) {
				local40 = arg3.aClass227Array1[arg9];
				if (local40.aClass4_Sub24_1 != local38) {
					local40 = null;
				}
			}
			this.method6082(arg4, local40, local38, arg8, null, arg1, 65535, local35, arg13, false, 0);
			@Pc(77) Class227 local77 = arg2.aClass227Array1[arg6];
			@Pc(79) Class227 local79 = null;
			if (arg0 != null) {
				local79 = arg0.aClass227Array1[arg7];
				if (local79.aClass4_Sub24_1 != local38) {
					local79 = null;
				}
			}
			this.e(0, new int[0], 0, 0, 0, 0, arg13);
			this.method6082(arg12, local79, local77.aClass4_Sub24_1, arg10, null, arg1, 65535, local77, arg13, true, 0);
			this.ha();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!n;Lclient!wc;II)V")
	public abstract void method6087(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class71_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()I")
	public abstract int wa();
}
