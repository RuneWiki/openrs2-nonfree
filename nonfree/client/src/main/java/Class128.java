import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class128 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
	protected boolean aBoolean639 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class128() {
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) Class274 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIZIIZ[III)V")
	private void method6269(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(24) int local24;
		if (arg5 == 1) {
			if (arg2 == 0 || arg2 == 1) {
				local24 = -arg7;
				arg7 = arg8;
				arg8 = local24;
			} else if (arg2 == 3) {
				local24 = arg7;
				arg7 = arg8;
				arg8 = local24;
			} else if (arg2 == 2) {
				local24 = arg7;
				arg7 = -arg8 & 0x3FFF;
				arg8 = local24 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg2 == 0 || arg2 == 1) {
				arg7 = -arg7;
				arg8 = -arg8;
			} else if (arg2 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg7 = -arg7 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg2 == 0 || arg2 == 1) {
				local24 = arg7;
				arg7 = -arg8;
				arg8 = local24;
			} else if (arg2 == 3) {
				local24 = arg7;
				arg7 = arg8;
				arg8 = local24;
			} else if (arg2 == 2) {
				local24 = arg7;
				arg7 = arg8 & 0x3FFF;
				arg8 = -local24 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.method6271(arg2, arg6, arg7, arg4, arg8, arg5, arg3);
		} else {
			this.I(arg2, arg6, arg7, arg4, arg8, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
	public abstract boolean method6270();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method6271(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!wc;IZ)V")
	public abstract void method6272(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZ[Z[ILclient!hl;ILclient!ss;ILclient!hl;Z)V")
	private void method6273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class133 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub45 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class133 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(14) int local14;
		if (arg9 == null || arg6 == 0) {
			for (local14 = 0; local14 < arg5.anInt4928; local14++) {
				@Pc(21) short local21 = arg5.aShortArray54[local14];
				if (arg3 == null || arg2 == arg3[local21] || arg7.anIntArray570[local21] == 0) {
					@Pc(45) short local45 = arg5.aShortArray51[local14];
					if (local45 != -1) {
						this.method6269(arg1 & arg7.anIntArray571[local45], arg4, 0, arg10, 0, arg0, arg7.anIntArrayArray90[local45], 0, 0);
					}
					this.method6269(arg1 & arg7.anIntArray571[local21], arg4, arg7.anIntArray570[local21], arg10, arg5.aShortArray52[local14], arg0, arg7.anIntArrayArray90[local21], arg5.aShortArray49[local14], arg5.aShortArray47[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(110) int local110 = 0;
		for (@Pc(112) int local112 = 0; local112 < arg7.anInt9095; local112++) {
			@Pc(116) boolean local116 = false;
			if (arg5.anInt4928 > local14 && local112 == arg5.aShortArray54[local14]) {
				local116 = true;
			}
			@Pc(134) boolean local134 = false;
			if (local110 < arg9.anInt4928 && local112 == arg9.aShortArray54[local110]) {
				local134 = true;
			}
			if (local116 || local134) {
				if (arg3 == null || arg3[local112] == arg2 || arg7.anIntArray570[local112] == 0) {
					@Pc(176) short local176 = 0;
					@Pc(181) int local181 = arg7.anIntArray570[local112];
					if (local181 == 3 || local181 == 10) {
						local176 = 128;
					}
					@Pc(205) short local205;
					@Pc(200) short local200;
					@Pc(215) short local215;
					@Pc(210) short local210;
					@Pc(220) byte local220;
					if (local116) {
						local200 = arg5.aShortArray52[local14];
						local205 = arg5.aShortArray49[local14];
						local210 = arg5.aShortArray51[local14];
						local215 = arg5.aShortArray47[local14];
						local220 = arg5.aByteArray47[local14];
						local14++;
					} else {
						local210 = -1;
						local205 = local176;
						local220 = 0;
						local200 = local176;
						local215 = local176;
					}
					@Pc(240) short local240;
					@Pc(245) short local245;
					@Pc(255) short local255;
					@Pc(250) short local250;
					@Pc(260) byte local260;
					if (local134) {
						local240 = arg9.aShortArray49[local110];
						local245 = arg9.aShortArray52[local110];
						local250 = arg9.aShortArray51[local110];
						local255 = arg9.aShortArray47[local110];
						local260 = arg9.aByteArray47[local110];
						local110++;
					} else {
						local250 = -1;
						local240 = local176;
						local260 = 0;
						local245 = local176;
						local255 = local176;
					}
					if (local210 != -1) {
						this.method6269(arg1 & arg7.anIntArray571[local210], arg4, 0, arg10, 0, arg0, arg7.anIntArrayArray90[local210], 0, 0);
					} else if (local250 != -1) {
						this.method6269(arg7.anIntArray571[local250] & arg1, arg4, 0, arg10, 0, arg0, arg7.anIntArrayArray90[local250], 0, 0);
					}
					@Pc(369) int local369;
					@Pc(359) int local359;
					@Pc(358) int local358;
					if ((local220 & 0x2) == 0 && (local260 & 0x1) == 0) {
						@Pc(349) int local349;
						if (local181 == 2) {
							local349 = local240 - local205 & 0x3FFF;
							@Pc(473) int local473 = local245 - local200 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							if (local473 >= 8192) {
								local473 -= 16384;
							}
							@Pc(492) int local492 = local255 - local215 & 0x3FFF;
							local359 = local473 * arg6 / arg8 + local200 & 0x3FFF;
							local369 = local205 + arg6 * local349 / arg8 & 0x3FFF;
							if (local492 >= 8192) {
								local492 -= 16384;
							}
							local358 = arg6 * local492 / arg8 + local215 & 0x3FFF;
						} else if (local181 == 9) {
							local349 = local240 - local205 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							local358 = 0;
							local359 = 0;
							local369 = local349 * arg6 / arg8 + local205 & 0x3FFF;
						} else if (local181 == 7) {
							local349 = local240 - local205 & 0x3F;
							if (local349 >= 32) {
								local349 -= 64;
							}
							local358 = arg6 * (local255 - local215) / arg8 + local215;
							local369 = local205 + local349 * arg6 / arg8 & 0x3F;
							local359 = (local245 - local200) * arg6 / arg8 + local200;
						} else {
							local369 = arg6 * (local240 - local205) / arg8 + local205;
							local358 = local215 + arg6 * (local255 - local215) / arg8;
							local359 = (local245 - local200) * arg6 / arg8 + local200;
						}
					} else {
						local359 = local200;
						local358 = local215;
						local369 = local205;
					}
					this.method6269(arg1 & arg7.anIntArray571[local112], arg4, local181, arg10, local359, arg0, arg7.anIntArrayArray90[local112], local369, local358);
				} else {
					if (local116) {
						local14++;
					}
					if (local134) {
						local110++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method6274(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!s;IIIIIIII)V")
	protected final void method6276(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg6 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(32) int local32 = arg0.method8043(arg5 + local21, arg1 - -local16);
		@Pc(36) int local36 = arg6 / 2;
		@Pc(41) int local41 = -arg7 / 2;
		@Pc(51) int local51 = arg0.method8043(local41 + arg5, arg1 + local36);
		@Pc(56) int local56 = -arg6 / 2;
		@Pc(64) int local64 = arg7 / 2;
		@Pc(75) int local75 = arg0.method8043(local64 + arg5, arg1 - -local56);
		@Pc(79) int local79 = arg6 / 2;
		@Pc(83) int local83 = arg7 / 2;
		@Pc(94) int local94 = arg0.method8043(arg5 + local83, local79 + arg1);
		@Pc(101) int local101 = local51 > local32 ? local32 : local51;
		@Pc(108) int local108 = local94 > local75 ? local75 : local94;
		@Pc(119) int local119 = local94 > local51 ? local51 : local94;
		@Pc(130) int local130 = local32 < local75 ? local32 : local75;
		@Pc(167) int local167;
		if (arg7 != 0) {
			@Pc(145) int local145 = (int) (Math.atan2((double) (local101 - local108), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local145 != 0) {
				if (arg4 != 0) {
					if (local145 > 8192) {
						local167 = 16384 - arg4;
						if (local167 > local145) {
							local145 = local167;
						}
					} else if (arg4 < local145) {
						local145 = arg4;
					}
				}
				this.FA(local145);
			}
		}
		@Pc(184) int local184 = local32 + local94;
		if (arg6 != 0) {
			@Pc(203) int local203 = (int) (Math.atan2((double) (local130 - local119), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local203 != 0) {
				if (arg3 != 0) {
					if (local203 > 8192) {
						local167 = 16384 - arg3;
						if (local167 > local203) {
							local203 = local167;
						}
					} else if (arg3 < local203) {
						local203 = arg3;
					}
				}
				this.VA(local203);
			}
		}
		if (local51 + local75 < local184) {
			local184 = local75 + local51;
		}
		local184 = (local184 >> 1) - arg2;
		if (local184 != 0) {
			this.H(0, local184, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lclient!al;")
	public abstract Class18[] method6277();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class3_Sub1_Sub6 ba(@OriginalArg(0) Class3_Sub1_Sub6 arg0);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!mi;")
	public abstract Class215[] method6278();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class128 method6279(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[ZIBIILclient!kga;IILclient!kga;IZILclient!kga;Lclient!kga;)V")
	public final void method6280(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub1_Sub12 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3_Sub1_Sub12 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class3_Sub1_Sub12 arg12, @OriginalArg(14) Class3_Sub1_Sub12 arg13) {
		if (arg4 == -1) {
			return;
		}
		if (arg1 == null || arg3 == -1) {
			this.method6284(0, arg7, arg5, arg10, arg4, arg6, arg13, arg2);
			return;
		}
		this.method6291();
		if (!this.NA()) {
			this.method6288();
			return;
		}
		@Pc(38) Class133 local38 = arg13.aClass133Array1[arg4];
		@Pc(41) Class3_Sub45 local41 = local38.aClass3_Sub45_1;
		@Pc(43) Class133 local43 = null;
		if (arg5 != null) {
			local43 = arg5.aClass133Array1[arg6];
			if (local43.aClass3_Sub45_1 != local41) {
				local43 = null;
			}
		}
		this.method6273(0, 65535, false, arg1, null, local38, arg2, local41, arg7, local43, arg10);
		@Pc(75) Class133 local75 = arg12.aClass133Array1[arg3];
		@Pc(82) Class133 local82 = null;
		if (arg8 != null) {
			local82 = arg8.aClass133Array1[arg11];
			if (local41 != local82.aClass3_Sub45_1) {
				local82 = null;
			}
		}
		this.method6271(0, new int[0], 0, 0, 0, 0, arg10);
		this.method6273(0, 65535, true, arg1, null, local75, arg9, local75.aClass3_Sub45_1, arg0, local82, arg10);
		this.wa();
		this.method6288();
	}

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!wc;Lclient!fda;I)V")
	public abstract void method6281(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IIZIIZLclient!kga;ILclient!kga;)V")
	public final void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class3_Sub1_Sub12 arg7, @OriginalArg(10) Class3_Sub1_Sub12 arg8) {
		if (arg1 == -1) {
			return;
		}
		this.method6291();
		if (!this.NA()) {
			this.method6288();
			return;
		}
		@Pc(21) Class133 local21 = arg8.aClass133Array1[arg1];
		@Pc(24) Class3_Sub45 local24 = local21.aClass3_Sub45_1;
		@Pc(32) Class133 local32 = null;
		if (arg7 != null) {
			local32 = arg7.aClass133Array1[arg5];
			if (local24 != local32.aClass3_Sub45_1) {
				local32 = null;
			}
		}
		this.method6273(0, arg3, false, null, arg2, local21, arg4, local24, arg0, local32, arg6);
		this.wa();
		this.method6288();
	}

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!wc;ZII)Z")
	public abstract boolean method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBILclient!kga;ZIILclient!kga;I)V")
	public final void method6284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub12 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub1_Sub12 arg6, @OriginalArg(8) int arg7) {
		if (arg4 == -1) {
			return;
		}
		this.method6291();
		if (!this.NA()) {
			this.method6288();
			return;
		}
		@Pc(28) Class133 local28 = arg6.aClass133Array1[arg4];
		@Pc(31) Class3_Sub45 local31 = local28.aClass3_Sub45_1;
		@Pc(33) Class133 local33 = null;
		if (arg2 != null) {
			local33 = arg2.aClass133Array1[arg5];
			if (local31 != local33.aClass3_Sub45_1) {
				local33 = null;
			}
		}
		this.method6273(arg0, 65535, false, null, null, local28, arg7, local31, arg1, local33, arg3);
		this.wa();
		this.method6288();
	}

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!wc;)V")
	public abstract void method6287(@OriginalArg(0) Class47 arg0);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method6288();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method6289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method6291();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!kga;I)V")
	public final void method6293(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub12 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method6291();
		if (!this.NA()) {
			this.method6288();
			return;
		}
		@Pc(21) Class133 local21 = arg1.aClass133Array1[arg0];
		@Pc(24) Class3_Sub45 local24 = local21.aClass3_Sub45_1;
		for (@Pc(26) int local26 = 0; local26 < local21.anInt4928; local26++) {
			@Pc(35) short local35 = local21.aShortArray54[local26];
			if (local24.aBooleanArray25[local35]) {
				if (local21.aShortArray51[local26] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local24.anIntArray570[local35], local21.aShortArray49[local26], local21.aShortArray52[local26], local21.aShortArray47[local26]);
			}
		}
		this.wa();
		this.method6288();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!wc;Lclient!fda;II)V")
	public abstract void method6294(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	public abstract void method6295();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!wc;ZI)Z")
	public abstract boolean method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);
}
