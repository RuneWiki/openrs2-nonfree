import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class193 {

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
	protected boolean aBoolean539 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class193() {
	}

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pda;)V")
	public abstract void method6608(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class193 method6609(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[ZIZILclient!eg;ILclient!eg;Lclient!via;ZI[I)V")
	private void method6610(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class95 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class95 arg7, @OriginalArg(8) Class2_Sub46 arg8, @OriginalArg(9) boolean arg9, @OriginalArg(11) int[] arg10) {
		@Pc(12) int local12;
		if (arg7 == null || arg2 == 0) {
			for (local12 = 0; local12 < arg5.anInt2696; local12++) {
				@Pc(18) short local18 = arg5.aShortArray41[local12];
				if (arg1 == null || arg3 == arg1[local18] || arg8.anIntArray712[local18] == 0) {
					@Pc(43) short local43 = arg5.aShortArray45[local12];
					if (local43 != -1) {
						this.method6630(0, 0, arg8.anIntArray711[local43] & arg0, arg4, arg10, 0, arg9, arg8.anIntArrayArray110[local43], 0);
					}
					this.method6630(arg5.aShortArray44[local12], arg8.anIntArray712[local18], arg0 & arg8.anIntArray711[local18], arg4, arg10, arg5.aShortArray40[local12], arg9, arg8.anIntArrayArray110[local18], arg5.aShortArray46[local12]);
				}
			}
			return;
		}
		local12 = 0;
		@Pc(118) int local118 = 0;
		for (@Pc(120) int local120 = 0; local120 < arg8.anInt10086; local120++) {
			@Pc(123) boolean local123 = false;
			if (arg5.anInt2696 > local12 && arg5.aShortArray41[local12] == local120) {
				local123 = true;
			}
			@Pc(137) boolean local137 = false;
			if (local118 < arg7.anInt2696 && arg7.aShortArray41[local118] == local120) {
				local137 = true;
			}
			if (local123 || local137) {
				if (arg1 == null || arg1[local120] == arg3 || arg8.anIntArray712[local120] == 0) {
					@Pc(185) short local185 = 0;
					@Pc(190) int local190 = arg8.anIntArray712[local120];
					if (local190 == 3 || local190 == 10) {
						local185 = 128;
					}
					@Pc(227) short local227;
					@Pc(217) short local217;
					@Pc(212) short local212;
					@Pc(207) short local207;
					@Pc(222) byte local222;
					if (local123) {
						local207 = arg5.aShortArray45[local12];
						local212 = arg5.aShortArray40[local12];
						local217 = arg5.aShortArray46[local12];
						local222 = arg5.aByteArray19[local12];
						local227 = arg5.aShortArray44[local12];
						local12++;
					} else {
						local222 = 0;
						local217 = local185;
						local212 = local185;
						local207 = -1;
						local227 = local185;
					}
					@Pc(245) short local245;
					@Pc(243) short local243;
					@Pc(249) short local249;
					@Pc(247) short local247;
					@Pc(251) byte local251;
					if (local137) {
						local247 = arg7.aShortArray45[local118];
						local249 = arg7.aShortArray40[local118];
						local245 = arg7.aShortArray44[local118];
						local243 = arg7.aShortArray46[local118];
						local251 = arg7.aByteArray19[local118];
						local118++;
					} else {
						local243 = local185;
						local245 = local185;
						local247 = -1;
						local249 = local185;
						local251 = 0;
					}
					@Pc(291) int local291;
					@Pc(293) int local293;
					@Pc(295) int local295;
					if ((local222 & 0x2) == 0 && (local251 & 0x1) == 0) {
						@Pc(348) int local348;
						if (local190 == 2) {
							local348 = local245 - local227 & 0x3FFF;
							@Pc(428) int local428 = local243 - local217 & 0x3FFF;
							if (local348 >= 8192) {
								local348 -= 16384;
							}
							@Pc(438) int local438 = local249 - local212 & 0x3FFF;
							if (local428 >= 8192) {
								local428 -= 16384;
							}
							local293 = local217 + local428 * arg2 / arg6 & 0x3FFF;
							if (local438 >= 8192) {
								local438 -= 16384;
							}
							local291 = local348 * arg2 / arg6 + local227 & 0x3FFF;
							local295 = arg2 * local438 / arg6 + local212 & 0x3FFF;
						} else if (local190 == 9) {
							local348 = local245 - local227 & 0x3FFF;
							if (local348 >= 8192) {
								local348 -= 16384;
							}
							local291 = local227 + arg2 * local348 / arg6 & 0x3FFF;
							local295 = 0;
							local293 = 0;
						} else if (local190 == 7) {
							local348 = local245 - local227 & 0x3F;
							if (local348 >= 32) {
								local348 -= 64;
							}
							local291 = arg2 * local348 / arg6 + local227 & 0x3F;
							local295 = local212 + (local249 - local212) * arg2 / arg6;
							local293 = local217 + (local243 - local217) * arg2 / arg6;
						} else {
							local295 = local212 + arg2 * (local249 - local212) / arg6;
							local291 = local227 + (local245 - local227) * arg2 / arg6;
							local293 = arg2 * (local243 - local217) / arg6 + local217;
						}
					} else {
						local291 = local227;
						local293 = local217;
						local295 = local212;
					}
					if (local207 != -1) {
						this.method6630(0, 0, arg0 & arg8.anIntArray711[local207], arg4, arg10, 0, arg9, arg8.anIntArrayArray110[local207], 0);
					} else if (local247 != -1) {
						this.method6630(0, 0, arg0 & arg8.anIntArray711[local247], arg4, arg10, 0, arg9, arg8.anIntArrayArray110[local247], 0);
					}
					this.method6630(local291, local190, arg8.anIntArray711[local120] & arg0, arg4, arg10, local295, arg9, arg8.anIntArrayArray110[local120], local293);
				} else {
					if (local137) {
						local118++;
					}
					if (local123) {
						local12++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method6611(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pda;Lclient!wt;I)V")
	public abstract void method6612(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class16_Sub10 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	protected abstract void method6613();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!ic;IILclient!ic;IIII)V")
	public final void method6614(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub7_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub7_Sub6 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 == -1) {
			return;
		}
		this.method6613();
		if (!this.NA()) {
			this.method6620();
			return;
		}
		@Pc(20) Class95 local20 = arg4.aClass95Array1[arg3];
		@Pc(28) Class2_Sub46 local28 = local20.aClass2_Sub46_1;
		@Pc(30) Class95 local30 = null;
		if (arg1 != null) {
			local30 = arg1.aClass95Array1[arg5];
			if (local30.aClass2_Sub46_1 != local28) {
				local30 = null;
			}
		}
		this.method6610(65535, (boolean[]) null, arg7, false, arg2, local20, arg6, local30, local28, arg0, (int[]) null);
		this.wa();
		this.method6620();
	}

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method6616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!pda;ZII)Z")
	public abstract boolean method6617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class2_Sub7_Sub17 ba(@OriginalArg(0) Class2_Sub7_Sub17 arg0);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
	public abstract boolean method6618();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!s;IIIIIIII)V")
	protected final void method6619(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(16) int local16 = -arg4 / 2;
		@Pc(21) int local21 = -arg3 / 2;
		@Pc(32) int local32 = arg0.method7446(arg1 + local16, arg6 - -local21);
		@Pc(36) int local36 = arg4 / 2;
		@Pc(41) int local41 = -arg3 / 2;
		@Pc(51) int local51 = arg0.method7446(arg1 + local36, arg6 + local41);
		@Pc(56) int local56 = -arg4 / 2;
		@Pc(60) int local60 = arg3 / 2;
		@Pc(71) int local71 = arg0.method7446(arg1 + local56, local60 + arg6);
		@Pc(75) int local75 = arg4 / 2;
		@Pc(79) int local79 = arg3 / 2;
		@Pc(89) int local89 = arg0.method7446(local75 + arg1, arg6 + local79);
		@Pc(100) int local100 = local32 < local51 ? local32 : local51;
		@Pc(107) int local107 = local89 > local71 ? local71 : local89;
		@Pc(114) int local114 = local89 > local51 ? local51 : local89;
		@Pc(148) int local148;
		if (arg3 != 0) {
			@Pc(133) int local133 = (int) (Math.atan2((double) (local100 - local107), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local133 != 0) {
				if (arg5 != 0) {
					if (local133 > 8192) {
						local148 = 16384 - arg5;
						if (local148 > local133) {
							local133 = local148;
						}
					} else if (arg5 < local133) {
						local133 = arg5;
					}
				}
				this.FA(local133);
			}
		}
		@Pc(178) int local178 = local32 >= local71 ? local71 : local32;
		if (arg4 != 0) {
			@Pc(194) int local194 = (int) (Math.atan2((double) (local178 - local114), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local194 != 0) {
				if (arg2 != 0) {
					if (local194 > 8192) {
						local148 = 16384 - arg2;
						if (local148 > local194) {
							local194 = local148;
						}
					} else if (local194 > arg2) {
						local194 = arg2;
					}
				}
				this.VA(local194);
			}
		}
		@Pc(233) int local233 = local89 + local32;
		if (local51 + local71 < local233) {
			local233 = local71 + local51;
		}
		local233 = (local233 >> 1) - arg7;
		if (local233 != 0) {
			this.H(0, local233, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	protected abstract void method6620();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lclient!qi;")
	public abstract Class287[] method6621();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pda;Lclient!wt;II)V")
	public abstract void method6622(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class16_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!pda;ZI)Z")
	public abstract boolean method6623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	public abstract void method6624();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!hv;")
	public abstract Class156[] method6625();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pda;IZ)V")
	public abstract void method6627(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ic;Lclient!ic;ILclient!ic;IIZI[ZILclient!ic;IIII)V")
	public final void method6628(@OriginalArg(0) Class2_Sub7_Sub6 arg0, @OriginalArg(1) Class2_Sub7_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub7_Sub6 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class2_Sub7_Sub6 arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg11 == -1) {
			return;
		}
		if (arg8 == null || arg9 == -1) {
			this.method6614(arg6, arg10, 0, arg11, arg3, arg5, arg13, arg2);
			return;
		}
		this.method6613();
		if (!this.NA()) {
			this.method6620();
			return;
		}
		@Pc(41) Class95 local41 = arg3.aClass95Array1[arg11];
		@Pc(44) Class2_Sub46 local44 = local41.aClass2_Sub46_1;
		@Pc(46) Class95 local46 = null;
		if (arg10 != null) {
			local46 = arg10.aClass95Array1[arg5];
			if (local46.aClass2_Sub46_1 != local44) {
				local46 = null;
			}
		}
		this.method6610(65535, arg8, arg2, false, 0, local41, arg13, local46, local44, arg6, (int[]) null);
		@Pc(80) Class95 local80 = arg1.aClass95Array1[arg9];
		@Pc(82) Class95 local82 = null;
		if (arg0 != null) {
			local82 = arg0.aClass95Array1[arg7];
			if (local82.aClass2_Sub46_1 != local44) {
				local82 = null;
			}
		}
		this.method6629(0, new int[0], 0, 0, 0, 0, arg6);
		this.method6610(65535, arg8, arg4, true, 0, local80, arg12, local82, local80.aClass2_Sub46_1, arg6, (int[]) null);
		this.wa();
		this.method6620();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method6629(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIB[IIZ[II)V")
	private void method6630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(62) int local62;
		if (arg3 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local62 = -arg0;
				arg0 = arg5;
				arg5 = local62;
			} else if (arg1 == 3) {
				local62 = arg0;
				arg0 = arg5;
				arg5 = local62;
			} else if (arg1 == 2) {
				local62 = arg0;
				arg0 = -arg5 & 0x3FFF;
				arg5 = local62 & 0x3FFF;
			}
		} else if (arg3 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg5 = -arg5;
				arg0 = -arg0;
			} else if (arg1 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg0 = -arg0 & 0x3FFF;
			}
		} else if (arg3 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local62 = arg0;
				arg0 = -arg5;
				arg5 = local62;
			} else if (arg1 == 3) {
				local62 = arg0;
				arg0 = arg5;
				arg5 = local62;
			} else if (arg1 == 2) {
				local62 = arg0;
				arg0 = arg5 & 0x3FFF;
				arg5 = -local62 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.method6629(arg1, arg7, arg0, arg8, arg5, arg3, arg6);
		} else {
			this.I(arg1, arg7, arg0, arg8, arg5, arg6, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIII[IIIZLclient!ic;ILclient!ic;)V")
	public final void method6631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) Class2_Sub7_Sub6 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class2_Sub7_Sub6 arg8) {
		if (arg1 == -1) {
			return;
		}
		this.method6613();
		if (!this.NA()) {
			this.method6620();
			return;
		}
		@Pc(20) Class95 local20 = arg6.aClass95Array1[arg1];
		@Pc(23) Class2_Sub46 local23 = local20.aClass2_Sub46_1;
		@Pc(25) Class95 local25 = null;
		if (arg8 != null) {
			local25 = arg8.aClass95Array1[arg0];
			if (local25.aClass2_Sub46_1 != local23) {
				local25 = null;
			}
		}
		this.method6610(arg3, (boolean[]) null, arg7, false, 0, local20, arg4, local25, local23, arg5, arg2);
		this.wa();
		this.method6620();
	}

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ic;II)V")
	public final void method6632(@OriginalArg(0) Class2_Sub7_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method6613();
		if (!this.NA()) {
			this.method6620();
			return;
		}
		@Pc(43) Class95 local43 = arg0.aClass95Array1[arg1];
		@Pc(46) Class2_Sub46 local46 = local43.aClass2_Sub46_1;
		for (@Pc(48) int local48 = 0; local48 < local43.anInt2696; local48++) {
			@Pc(55) short local55 = local43.aShortArray41[local48];
			if (local46.aBooleanArray29[local55]) {
				if (local43.aShortArray45[local48] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local46.anIntArray712[local55], local43.aShortArray44[local48], local43.aShortArray46[local48], local43.aShortArray40[local48]);
			}
		}
		this.wa();
		this.method6620();
	}

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);
}
