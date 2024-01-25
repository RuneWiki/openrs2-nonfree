import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public abstract class Class63 {

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	protected Class63() {
	}

	@OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
	public abstract int ta();

	@OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
	public abstract void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()Z")
	public abstract boolean method6280();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII[IIIZI[I)V")
	private void method6281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(15) int local15;
		if (arg1 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local15 = -arg2;
				arg2 = arg0;
				arg0 = local15;
			} else if (arg3 == 3) {
				local15 = arg2;
				arg2 = arg0;
				arg0 = local15;
			} else if (arg3 == 2) {
				local15 = arg2;
				arg2 = -arg0 & 0x3FFF;
				arg0 = local15 & 0x3FFF;
			}
		} else if (arg1 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg2 = -arg2;
				arg0 = -arg0;
			} else if (arg3 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg0 = -arg0 & 0x3FFF;
			}
		} else if (arg1 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local15 = arg2;
				arg2 = -arg0;
				arg0 = local15;
			} else if (arg3 == 3) {
				local15 = arg2;
				arg2 = arg0;
				arg0 = local15;
			} else if (arg3 == 2) {
				local15 = arg2;
				arg2 = arg0 & 0x3FFF;
				arg0 = -local15 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.va(arg3, arg4, arg2, arg7, arg0, arg1, arg6);
		} else {
			this.aa(arg3, arg4, arg2, arg7, arg0, arg6, arg5, arg8);
		}
	}

	@OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public abstract void method6282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
	protected abstract void KA();

	@OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZIIILclient!nb;Lclient!nb;ILclient!nb;Lclient!nb;B[ZII)V")
	public final void method6283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub12 arg6, @OriginalArg(7) Class2_Sub1_Sub12 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class2_Sub1_Sub12 arg9, @OriginalArg(10) Class2_Sub1_Sub12 arg10, @OriginalArg(12) boolean[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg5 == -1) {
			return;
		}
		if (arg11 == null || arg8 == -1) {
			this.method6299(0, arg5, arg3, arg9, arg12, arg2, arg0, arg10);
		} else if (this.h()) {
			@Pc(33) Class240 local33 = arg10.aClass240Array1[arg5];
			@Pc(36) Class2_Sub47 local36 = local33.aClass2_Sub47_1;
			@Pc(38) Class240 local38 = null;
			if (arg9 != null) {
				local38 = arg9.aClass240Array1[arg3];
				if (local38.aClass2_Sub47_1 != local36) {
					local38 = null;
				}
			}
			this.method6297(local33, arg11, arg0, 0, false, null, arg2, arg12, local36, local38, 65535);
			@Pc(75) Class240 local75 = arg6.aClass240Array1[arg8];
			@Pc(77) Class240 local77 = null;
			if (arg7 != null) {
				local77 = arg7.aClass240Array1[arg13];
				if (local36 != local77.aClass2_Sub47_1) {
					local77 = null;
				}
			}
			this.va(0, new int[0], 0, 0, 0, 0, arg2);
			this.method6297(local75, arg11, arg1, 0, true, null, arg2, arg4, local75.aClass2_Sub47_1, local77, 65535);
			this.KA();
		}
	}

	@OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
	public abstract void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
	public abstract int B();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	public abstract void method6284(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!nb;Z)V")
	public final void method6285(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub12 arg1) {
		if (arg0 == -1 || !this.h()) {
			return;
		}
		@Pc(19) Class240 local19 = arg1.aClass240Array1[arg0];
		@Pc(22) Class2_Sub47 local22 = local19.aClass2_Sub47_1;
		for (@Pc(24) int local24 = 0; local24 < local19.anInt6777; local24++) {
			@Pc(31) short local31 = local19.aShortArray102[local24];
			if (local22.aBooleanArray25[local31]) {
				if (local19.aShortArray100[local24] != -1) {
					this.za(0, 0, 0, 0);
				}
				this.za(local22.anIntArray626[local31], local19.aShortArray97[local24], local19.aShortArray106[local24], local19.aShortArray105[local24]);
			}
		}
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIILclient!ya;I)V")
	protected final void method6286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6, @OriginalArg(8) int arg7) {
		@Pc(22) int local22 = -arg7 / 2;
		@Pc(27) int local27 = -arg5 / 2;
		@Pc(36) int local36 = arg6.ca(arg3 + local22, local27 + arg2);
		@Pc(40) int local40 = arg7 / 2;
		@Pc(45) int local45 = -arg5 / 2;
		@Pc(54) int local54 = arg6.ca(local40 + arg3, arg2 + local45);
		@Pc(59) int local59 = -arg7 / 2;
		@Pc(63) int local63 = arg5 / 2;
		@Pc(72) int local72 = arg6.ca(local59 + arg3, local63 + arg2);
		@Pc(76) int local76 = arg7 / 2;
		@Pc(80) int local80 = arg5 / 2;
		@Pc(89) int local89 = arg6.ca(local76 + arg3, arg2 + local80);
		@Pc(96) int local96 = local54 > local36 ? local36 : local54;
		@Pc(103) int local103 = local72 >= local89 ? local89 : local72;
		@Pc(110) int local110 = local89 > local54 ? local54 : local89;
		@Pc(152) int local152;
		if (arg5 != 0) {
			@Pc(126) int local126 = (int) (Math.atan2((double) (local96 - local103), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local126 != 0) {
				if (arg0 != 0) {
					if (local126 > 8192) {
						local152 = 16384 - arg0;
						if (local126 < local152) {
							local126 = local152;
						}
					} else if (arg0 < local126) {
						local126 = arg0;
					}
				}
				this.W(local126);
			}
		}
		@Pc(167) int local167 = local36 >= local72 ? local72 : local36;
		if (arg7 != 0) {
			@Pc(183) int local183 = (int) (Math.atan2((double) (local167 - local110), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local183 != 0) {
				if (arg1 != 0) {
					if (local183 > 8192) {
						local152 = 16384 - arg1;
						if (local152 > local183) {
							local183 = local152;
						}
					} else if (local183 > arg1) {
						local183 = arg1;
					}
				}
				this.K(local183);
			}
		}
		@Pc(229) int local229 = local36 + local89;
		if (local229 > local72 + local54) {
			local229 = local54 + local72;
		}
		local229 = (local229 >> 1) - arg4;
		if (local229 != 0) {
			this.a(0, local229, 0);
		}
	}

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!kk;II)V")
	public abstract void method6287(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class28_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public abstract Class2_Sub1_Sub5 EA(@OriginalArg(0) Class2_Sub1_Sub5 arg0);

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()[Lclient!ol;")
	public abstract Class191[] method6288();

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
	public abstract int Z();

	@OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!nb;[IBLclient!nb;ZIIII)V")
	public final void method6290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub12 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) Class2_Sub1_Sub12 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		if (arg8 == -1 || !this.h()) {
			return;
		}
		@Pc(24) Class240 local24 = arg2.aClass240Array1[arg8];
		@Pc(27) Class2_Sub47 local27 = local24.aClass2_Sub47_1;
		@Pc(29) Class240 local29 = null;
		if (arg4 != null) {
			local29 = arg4.aClass240Array1[arg7];
			if (local29.aClass2_Sub47_1 != local27) {
				local29 = null;
			}
		}
		this.method6297(local24, null, arg0, 0, false, arg3, arg5, arg6, local27, local29, arg1);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()[Lclient!vc;")
	public abstract Class254[] method6291();

	@OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
	public abstract int k();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
	public abstract void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!kk;I)V")
	public abstract void method6293(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class28_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
	public abstract void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
	protected abstract boolean h();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Lclient!e;")
	public abstract Class63 method6296(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!tn;[ZIIZ[IZIILclient!wo;Lclient!tn;I)V")
	private void method6297(@OriginalArg(0) Class240 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub47 arg8, @OriginalArg(10) Class240 arg9, @OriginalArg(11) int arg10) {
		@Pc(12) int local12;
		if (arg9 == null || arg2 == 0) {
			for (local12 = 0; local12 < arg0.anInt6777; local12++) {
				@Pc(18) short local18 = arg0.aShortArray102[local12];
				if (arg1 == null || arg4 == arg1[local18] || arg8.anIntArray626[local18] == 0) {
					@Pc(46) short local46 = arg0.aShortArray100[local12];
					if (local46 != -1) {
						this.method6281(0, arg3, 0, 0, arg8.anIntArrayArray188[local46], arg10 & arg8.anIntArray627[local46], arg6, 0, arg5);
					}
					this.method6281(arg0.aShortArray105[local12], arg3, arg0.aShortArray97[local12], arg8.anIntArray626[local18], arg8.anIntArrayArray188[local18], arg8.anIntArray627[local18] & arg10, arg6, arg0.aShortArray106[local12], arg5);
				}
			}
			return;
		}
		local12 = 0;
		@Pc(116) int local116 = 0;
		for (@Pc(118) int local118 = 0; local118 < arg8.anInt7600; local118++) {
			@Pc(121) boolean local121 = false;
			if (local12 < arg0.anInt6777 && arg0.aShortArray102[local12] == local118) {
				local121 = true;
			}
			@Pc(139) boolean local139 = false;
			if (arg9.anInt6777 > local116 && arg9.aShortArray102[local116] == local118) {
				local139 = true;
			}
			if (local121 || local139) {
				if (arg1 == null || arg4 == arg1[local118] || arg8.anIntArray626[local118] == 0) {
					@Pc(183) short local183 = 0;
					@Pc(188) int local188 = arg8.anIntArray626[local118];
					if (local188 == 3 || local188 == 10) {
						local183 = 128;
					}
					@Pc(220) short local220;
					@Pc(215) short local215;
					@Pc(225) short local225;
					@Pc(205) short local205;
					@Pc(210) byte local210;
					if (local121) {
						local205 = arg0.aShortArray100[local12];
						local210 = arg0.aByteArray81[local12];
						local215 = arg0.aShortArray106[local12];
						local220 = arg0.aShortArray97[local12];
						local225 = arg0.aShortArray105[local12];
						local12++;
					} else {
						local225 = local183;
						local210 = 0;
						local205 = -1;
						local215 = local183;
						local220 = local183;
					}
					@Pc(259) short local259;
					@Pc(249) short local249;
					@Pc(254) short local254;
					@Pc(244) short local244;
					@Pc(264) byte local264;
					if (local139) {
						local244 = arg9.aShortArray100[local116];
						local249 = arg9.aShortArray106[local116];
						local254 = arg9.aShortArray105[local116];
						local259 = arg9.aShortArray97[local116];
						local264 = arg9.aByteArray81[local116];
						local116++;
					} else {
						local249 = local183;
						local264 = 0;
						local259 = local183;
						local244 = -1;
						local254 = local183;
					}
					@Pc(322) int local322;
					@Pc(332) int local332;
					@Pc(311) int local311;
					if ((local210 & 0x2) == 0 && (local264 & 0x1) == 0) {
						@Pc(340) int local340;
						if (local188 == 2) {
							local340 = local259 - local220 & 0x3FFF;
							@Pc(419) int local419 = local249 - local215 & 0x3FFF;
							@Pc(426) int local426 = local254 - local225 & 0x3FFF;
							if (local419 >= 8192) {
								local419 -= 16384;
							}
							if (local340 >= 8192) {
								local340 -= 16384;
							}
							local332 = local419 * arg2 / arg7 + local215 & 0x3FFF;
							if (local426 >= 8192) {
								local426 -= 16384;
							}
							local322 = arg2 * local340 / arg7 + local220 & 0x3FFF;
							local311 = local426 * arg2 / arg7 + local225 & 0x3FFF;
						} else if (local188 == 9) {
							local340 = local259 - local220 & 0x3FFF;
							if (local340 >= 8192) {
								local340 -= 16384;
							}
							local311 = 0;
							local332 = 0;
							local322 = local340 * arg2 / arg7 + local220 & 0x3FFF;
						} else if (local188 == 7) {
							local340 = local259 - local220 & 0x3F;
							if (local340 >= 32) {
								local340 -= 64;
							}
							local322 = local220 + local340 * arg2 / arg7 & 0x3F;
							local332 = arg2 * (local249 - local215) / arg7 + local215;
							local311 = arg2 * (local254 - local225) / arg7 + local225;
						} else {
							local311 = arg2 * (local254 - local225) / arg7 + local225;
							local322 = arg2 * (local259 - local220) / arg7 + local220;
							local332 = local215 + (local249 - local215) * arg2 / arg7;
						}
					} else {
						local311 = local225;
						local322 = local220;
						local332 = local215;
					}
					if (local205 != -1) {
						this.method6281(0, arg3, 0, 0, arg8.anIntArrayArray188[local205], arg8.anIntArray627[local205] & arg10, arg6, 0, arg5);
					} else if (local244 != -1) {
						this.method6281(0, arg3, 0, 0, arg8.anIntArrayArray188[local244], arg8.anIntArray627[local244] & arg10, arg6, 0, arg5);
					}
					this.method6281(local311, arg3, local322, local188, arg8.anIntArrayArray188[local118], arg10 & arg8.anIntArray627[local118], arg6, local332, arg5);
				} else {
					if (local121) {
						local12++;
					}
					if (local139) {
						local116++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
	public abstract void method6298();

	@OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
	public abstract void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
	public abstract int S();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIILclient!nb;IZILclient!nb;)V")
	public final void method6299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub1_Sub12 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub1_Sub12 arg7) {
		if (arg1 == -1 || !this.h()) {
			return;
		}
		@Pc(24) Class240 local24 = arg7.aClass240Array1[arg1];
		@Pc(27) Class2_Sub47 local27 = local24.aClass2_Sub47_1;
		@Pc(29) Class240 local29 = null;
		if (arg3 != null) {
			local29 = arg3.aClass240Array1[arg2];
			if (local27 != local29.aClass2_Sub47_1) {
				local29 = null;
			}
		}
		this.method6297(local24, null, arg6, arg0, false, null, arg5, arg4, local27, local29, 65535);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
	public abstract void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);
}
