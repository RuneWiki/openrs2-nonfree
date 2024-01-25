import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class114 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Z")
	protected boolean aBoolean788 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class114() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!eh;IZ)V")
	public abstract void method8789(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!nha;")
	public abstract Class244[] method8790();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method8791(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IZZII[III)V")
	private void method8792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(59) int local59;
		if (arg7 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local59 = -arg1;
				arg1 = arg5;
				arg5 = local59;
			} else if (arg4 == 3) {
				local59 = arg1;
				arg1 = arg5;
				arg5 = local59;
			} else if (arg4 == 2) {
				local59 = arg1;
				arg1 = -arg5 & 0x3FFF;
				arg5 = local59 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg5 = -arg5;
				arg1 = -arg1;
			} else if (arg4 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local59 = arg1;
				arg1 = -arg5;
				arg5 = local59;
			} else if (arg4 == 3) {
				local59 = arg1;
				arg1 = arg5;
				arg5 = local59;
			} else if (arg4 == 2) {
				local59 = arg1;
				arg1 = arg5 & 0x3FFF;
				arg5 = -local59 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.method8809(arg4, arg6, arg1, arg0, arg5, arg7, arg3);
		} else {
			this.I(arg4, arg6, arg1, arg0, arg5, arg3, arg8, arg2);
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	protected abstract void method8793();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILclient!va;Lclient!va;ZIII)V")
	public final void method8794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub2_Sub20 arg2, @OriginalArg(4) Class5_Sub2_Sub20 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 == -1) {
			return;
		}
		this.method8805();
		if (!this.NA()) {
			this.method8793();
			return;
		}
		@Pc(21) Class347 local21 = arg2.aClass347Array1[arg6];
		@Pc(24) Class5_Sub37 local24 = local21.aClass5_Sub37_1;
		@Pc(26) Class347 local26 = null;
		if (arg3 != null) {
			local26 = arg3.aClass347Array1[arg1];
			if (local24 != local26.aClass5_Sub37_1) {
				local26 = null;
			}
		}
		this.method8802(65535, arg7, arg4, local24, false, (int[]) null, arg5, local21, (boolean[]) null, arg0, local26);
		this.wa();
		this.method8793();
	}

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!eh;ZI)Z")
	public abstract boolean method8795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
	public abstract boolean method8796();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class5_Sub2_Sub7 ba(@OriginalArg(0) Class5_Sub2_Sub7 arg0);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILclient!s;III)V")
	protected final void method8797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class88 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg2 / 2;
		@Pc(21) int local21 = -arg6 / 2;
		@Pc(31) int local31 = arg4.method8753(local16 + arg7, local21 + arg3);
		@Pc(35) int local35 = arg2 / 2;
		@Pc(40) int local40 = -arg6 / 2;
		@Pc(52) int local52 = arg4.method8753(arg7 + local35, arg3 - -local40);
		@Pc(57) int local57 = -arg2 / 2;
		@Pc(61) int local61 = arg6 / 2;
		@Pc(71) int local71 = arg4.method8753(arg7 + local57, local61 + arg3);
		@Pc(75) int local75 = arg2 / 2;
		@Pc(79) int local79 = arg6 / 2;
		@Pc(90) int local90 = arg4.method8753(local75 + arg7, arg3 - -local79);
		@Pc(97) int local97 = local52 > local31 ? local31 : local52;
		@Pc(104) int local104 = local71 < local90 ? local71 : local90;
		@Pc(111) int local111 = local90 <= local52 ? local90 : local52;
		@Pc(155) int local155;
		if (arg6 != 0) {
			@Pc(130) int local130 = (int) (Math.atan2((double) (local97 - local104), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local130 != 0) {
				if (arg0 != 0) {
					if (local130 > 8192) {
						local155 = 16384 - arg0;
						if (local155 > local130) {
							local130 = local155;
						}
					} else if (local130 > arg0) {
						local130 = arg0;
					}
				}
				this.FA(local130);
			}
		}
		@Pc(170) int local170 = local31 < local71 ? local31 : local71;
		if (arg2 != 0) {
			@Pc(186) int local186 = (int) (Math.atan2((double) (local170 - local111), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local186 != 0) {
				if (arg1 != 0) {
					if (local186 > 8192) {
						local155 = 16384 - arg1;
						if (local155 > local186) {
							local186 = local155;
						}
					} else if (local186 > arg1) {
						local186 = arg1;
					}
				}
				this.VA(local186);
			}
		}
		@Pc(221) int local221 = local31 + local90;
		if (local221 > local71 + local52) {
			local221 = local52 + local71;
		}
		local221 = (local221 >> 1) - arg5;
		if (local221 != 0) {
			this.H(0, local221, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!eh;ZII)Z")
	public abstract boolean method8798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	public abstract void method8799();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!eh;Lclient!sp;I)V")
	public abstract void method8801(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class41_Sub9 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZILclient!mt;Z[IILclient!u;[ZILclient!u;)V")
	private void method8802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class5_Sub37 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class347 arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class347 arg10) {
		@Pc(9) int local9;
		if (arg10 == null || arg1 == 0) {
			for (local9 = 0; local9 < arg7.anInt9616; local9++) {
				@Pc(15) short local15 = arg7.aShortArray119[local9];
				if (arg8 == null || arg8[local15] == arg4 || arg3.anIntArray371[local15] == 0) {
					@Pc(36) short local36 = arg7.aShortArray112[local9];
					if (local36 != -1) {
						this.method8792(0, 0, arg5, arg2, 0, 0, arg3.anIntArrayArray51[local36], arg6, arg0 & arg3.anIntArray370[local36]);
					}
					this.method8792(arg7.aShortArray114[local9], arg7.aShortArray120[local9], arg5, arg2, arg3.anIntArray371[local15], arg7.aShortArray116[local9], arg3.anIntArrayArray51[local15], arg6, arg3.anIntArray370[local15] & arg0);
				}
			}
			return;
		}
		local9 = 0;
		@Pc(101) int local101 = 0;
		for (@Pc(109) int local109 = 0; local109 < arg3.anInt6584; local109++) {
			@Pc(112) boolean local112 = false;
			if (local9 < arg7.anInt9616 && arg7.aShortArray119[local9] == local109) {
				local112 = true;
			}
			@Pc(130) boolean local130 = false;
			if (local101 < arg10.anInt9616 && arg10.aShortArray119[local101] == local109) {
				local130 = true;
			}
			if (local112 || local130) {
				if (arg8 == null || arg4 == arg8[local109] || arg3.anIntArray371[local109] == 0) {
					@Pc(178) short local178 = 0;
					@Pc(183) int local183 = arg3.anIntArray371[local109];
					if (local183 == 3 || local183 == 10) {
						local178 = 128;
					}
					@Pc(200) short local200;
					@Pc(205) short local205;
					@Pc(210) short local210;
					@Pc(215) short local215;
					@Pc(220) byte local220;
					if (local112) {
						local200 = arg7.aShortArray120[local9];
						local205 = arg7.aShortArray114[local9];
						local210 = arg7.aShortArray116[local9];
						local215 = arg7.aShortArray112[local9];
						local220 = arg7.aByteArray92[local9];
						local9++;
					} else {
						local205 = local178;
						local200 = local178;
						local220 = 0;
						local215 = -1;
						local210 = local178;
					}
					@Pc(259) short local259;
					@Pc(244) short local244;
					@Pc(249) short local249;
					@Pc(254) short local254;
					@Pc(239) byte local239;
					if (local130) {
						local239 = arg10.aByteArray92[local101];
						local244 = arg10.aShortArray114[local101];
						local249 = arg10.aShortArray116[local101];
						local254 = arg10.aShortArray112[local101];
						local259 = arg10.aShortArray120[local101];
						local101++;
					} else {
						local244 = local178;
						local259 = local178;
						local239 = 0;
						local249 = local178;
						local254 = -1;
					}
					@Pc(327) int local327;
					@Pc(338) int local338;
					@Pc(353) int local353;
					if ((local220 & 0x2) == 0 && (local239 & 0x1) == 0) {
						@Pc(293) int local293;
						if (local183 == 2) {
							local293 = local259 - local200 & 0x3FFF;
							@Pc(300) int local300 = local244 - local205 & 0x3FFF;
							if (local300 >= 8192) {
								local300 -= 16384;
							}
							@Pc(312) int local312 = local249 - local210 & 0x3FFF;
							if (local293 >= 8192) {
								local293 -= 16384;
							}
							local327 = local200 + local293 * arg1 / arg9 & 0x3FFF;
							local338 = local205 + local300 * arg1 / arg9 & 0x3FFF;
							if (local312 >= 8192) {
								local312 -= 16384;
							}
							local353 = local210 + local312 * arg1 / arg9 & 0x3FFF;
						} else if (local183 == 9) {
							local293 = local259 - local200 & 0x3FFF;
							if (local293 >= 8192) {
								local293 -= 16384;
							}
							local327 = local200 + local293 * arg1 / arg9 & 0x3FFF;
							local353 = 0;
							local338 = 0;
						} else if (local183 == 7) {
							local293 = local259 - local200 & 0x3F;
							if (local293 >= 32) {
								local293 -= 64;
							}
							local353 = (local249 - local210) * arg1 / arg9 + local210;
							local338 = (local244 - local205) * arg1 / arg9 + local205;
							local327 = local200 + local293 * arg1 / arg9 & 0x3F;
						} else {
							local327 = local200 + arg1 * (local259 - local200) / arg9;
							local353 = arg1 * (local249 - local210) / arg9 + local210;
							local338 = (local244 - local205) * arg1 / arg9 + local205;
						}
					} else {
						local338 = local205;
						local327 = local200;
						local353 = local210;
					}
					if (local215 != -1) {
						this.method8792(0, 0, arg5, arg2, 0, 0, arg3.anIntArrayArray51[local215], arg6, arg3.anIntArray370[local215] & arg0);
					} else if (local254 != -1) {
						this.method8792(0, 0, arg5, arg2, 0, 0, arg3.anIntArrayArray51[local254], arg6, arg3.anIntArray370[local254] & arg0);
					}
					this.method8792(local338, local327, arg5, arg2, local183, local353, arg3.anIntArrayArray51[local109], arg6, arg0 & arg3.anIntArray370[local109]);
				} else {
					if (local112) {
						local9++;
					}
					if (local130) {
						local101++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILclient!va;Lclient!va;IIZLclient!va;[ZILclient!va;)V")
	public final void method8803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5_Sub2_Sub20 arg6, @OriginalArg(7) Class5_Sub2_Sub20 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class5_Sub2_Sub20 arg10, @OriginalArg(12) boolean[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class5_Sub2_Sub20 arg13) {
		if (arg0 == -1) {
			return;
		}
		if (arg11 == null || arg12 == -1) {
			this.method8794(arg1, arg4, arg13, arg6, arg9, 0, arg0, arg2);
			return;
		}
		this.method8805();
		if (!this.NA()) {
			this.method8793();
			return;
		}
		@Pc(38) Class347 local38 = arg13.aClass347Array1[arg0];
		@Pc(41) Class5_Sub37 local41 = local38.aClass5_Sub37_1;
		@Pc(43) Class347 local43 = null;
		if (arg6 != null) {
			local43 = arg6.aClass347Array1[arg4];
			if (local41 != local43.aClass5_Sub37_1) {
				local43 = null;
			}
		}
		this.method8802(65535, arg2, arg9, local41, false, (int[]) null, 0, local38, arg11, arg1, local43);
		@Pc(75) Class347 local75 = arg7.aClass347Array1[arg12];
		@Pc(77) Class347 local77 = null;
		if (arg10 != null) {
			local77 = arg10.aClass347Array1[arg8];
			if (local41 != local77.aClass5_Sub37_1) {
				local77 = null;
			}
		}
		this.method8809(0, new int[0], 0, 0, 0, 0, arg9);
		this.method8802(65535, arg5, arg9, local75.aClass5_Sub37_1, true, (int[]) null, 0, local75, arg11, arg3, local77);
		this.wa();
		this.method8793();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IILclient!va;ILclient!va;ZIII)V")
	public final void method8804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class5_Sub2_Sub20 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub2_Sub20 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg0 == -1) {
			return;
		}
		this.method8805();
		if (!this.NA()) {
			this.method8793();
			return;
		}
		@Pc(30) Class347 local30 = arg5.aClass347Array1[arg0];
		@Pc(33) Class5_Sub37 local33 = local30.aClass5_Sub37_1;
		@Pc(35) Class347 local35 = null;
		if (arg3 != null) {
			local35 = arg3.aClass347Array1[arg7];
			if (local35.aClass5_Sub37_1 != local33) {
				local35 = null;
			}
		}
		this.method8802(arg8, arg1, arg6, local33, false, arg2, 0, local30, (boolean[]) null, arg4, local35);
		this.wa();
		this.method8793();
	}

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method8805();

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!rf;")
	public abstract Class303[] method8806();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!eh;Lclient!sp;II)V")
	public abstract void method8807(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class41_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method8809(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class114 method8810(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!eh;)V")
	public abstract void method8811(@OriginalArg(0) Class56 arg0);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLclient!va;)V")
	public final void method8812(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub2_Sub20 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method8805();
		if (!this.NA()) {
			this.method8793();
			return;
		}
		@Pc(27) Class347 local27 = arg1.aClass347Array1[arg0];
		@Pc(30) Class5_Sub37 local30 = local27.aClass5_Sub37_1;
		for (@Pc(32) int local32 = 0; local32 < local27.anInt9616; local32++) {
			@Pc(38) short local38 = local27.aShortArray119[local32];
			if (local30.aBooleanArray16[local38]) {
				if (local27.aShortArray112[local32] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local30.anIntArray371[local38], local27.aShortArray120[local32], local27.aShortArray114[local32], local27.aShortArray116[local32]);
			}
		}
		this.wa();
		this.method8793();
	}

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();
}
