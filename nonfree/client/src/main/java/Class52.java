import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class52 {

	@OriginalMember(owner = "client!da", name = "i", descriptor = "Z")
	protected boolean aBoolean680 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	protected Class52() {
	}

	@OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
	public abstract void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public abstract Class1_Sub8_Sub4 S(@OriginalArg(0) Class1_Sub8_Sub4 arg0);

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7391(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;ZI)Z")
	public abstract boolean method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
	public abstract void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
	public abstract int KA();

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	protected abstract void method7393();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!ut;ZIIILclient!ut;II)V")
	public final void method7394(@OriginalArg(1) Class1_Sub8_Sub18 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub8_Sub18 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 == -1) {
			return;
		}
		this.method7393();
		if (!this.F()) {
			this.method7399();
			return;
		}
		@Pc(25) Class341 local25 = arg5.aClass341Array1[arg4];
		@Pc(28) Class1_Sub31 local28 = local25.aClass1_Sub31_1;
		@Pc(30) Class341 local30 = null;
		if (arg0 != null) {
			local30 = arg0.aClass341Array1[arg3];
			if (local30.aClass1_Sub31_1 != local28) {
				local30 = null;
			}
		}
		this.method7398(false, local28, arg6, arg2, arg1, arg7, local30, null, local25, null, 65535);
		this.L();
		this.method7399();
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()[Lclient!lp;")
	public abstract Class212[] method7395();

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
	public abstract boolean LA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([II[IIIIIZII)V")
	private void method7396(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(33) int local33;
		if (arg5 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local33 = -arg7;
				arg7 = arg3;
				arg3 = local33;
			} else if (arg1 == 3) {
				local33 = arg7;
				arg7 = arg3;
				arg3 = local33;
			} else if (arg1 == 2) {
				local33 = arg7;
				arg7 = -arg3 & 0x3FFF;
				arg3 = local33 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg3 = -arg3;
				arg7 = -arg7;
			} else if (arg1 == 2) {
				arg7 = -arg7 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local33 = arg7;
				arg7 = -arg3;
				arg3 = local33;
			} else if (arg1 == 3) {
				local33 = arg7;
				arg7 = arg3;
				arg3 = local33;
			} else if (arg1 == 2) {
				local33 = arg7;
				arg7 = arg3 & 0x3FFF;
				arg3 = -local33 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.method7391(arg1, arg0, arg7, arg4, arg3, arg5, arg6);
		} else {
			this.B(arg1, arg0, arg7, arg4, arg3, arg6, arg8, arg2);
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	public abstract void method7397();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!kaa;IIIZILclient!vb;[ILclient!vb;[ZI)V")
	private void method7398(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub31 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class341 arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) Class341 arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) int arg10) {
		@Pc(16) int local16;
		if (arg6 == null || arg3 == 0) {
			for (local16 = 0; local16 < arg8.anInt9122; local16++) {
				@Pc(23) short local23 = arg8.aShortArray125[local16];
				if (arg9 == null || arg9[local23] == arg0 || arg1.anIntArray261[local23] == 0) {
					@Pc(40) short local40 = arg8.aShortArray124[local16];
					if (local40 != -1) {
						this.method7396(arg1.anIntArrayArray23[local40], 0, arg7, 0, 0, arg2, arg4, 0, arg10 & arg1.anIntArray260[local40]);
					}
					this.method7396(arg1.anIntArrayArray23[local23], arg1.anIntArray261[local23], arg7, arg8.aShortArray127[local16], arg8.aShortArray129[local16], arg2, arg4, arg8.aShortArray128[local16], arg10 & arg1.anIntArray260[local23]);
				}
			}
			return;
		}
		local16 = 0;
		@Pc(106) int local106 = 0;
		for (@Pc(108) int local108 = 0; local108 < arg1.anInt4745; local108++) {
			@Pc(112) boolean local112 = false;
			if (local16 < arg8.anInt9122 && arg8.aShortArray125[local16] == local108) {
				local112 = true;
			}
			@Pc(130) boolean local130 = false;
			if (local106 < arg6.anInt9122 && arg6.aShortArray125[local106] == local108) {
				local130 = true;
			}
			if (local112 || local130) {
				if (arg9 == null || arg0 == arg9[local108] || arg1.anIntArray261[local108] == 0) {
					@Pc(184) short local184 = 0;
					@Pc(189) int local189 = arg1.anIntArray261[local108];
					if (local189 == 3 || local189 == 10) {
						local184 = 128;
					}
					@Pc(213) short local213;
					@Pc(223) short local223;
					@Pc(218) short local218;
					@Pc(208) short local208;
					@Pc(228) byte local228;
					if (local112) {
						local208 = arg8.aShortArray124[local16];
						local213 = arg8.aShortArray128[local16];
						local218 = arg8.aShortArray127[local16];
						local223 = arg8.aShortArray129[local16];
						local228 = arg8.aByteArray89[local16];
						local16++;
					} else {
						local228 = 0;
						local213 = local184;
						local218 = local184;
						local223 = local184;
						local208 = -1;
					}
					@Pc(247) short local247;
					@Pc(253) short local253;
					@Pc(251) short local251;
					@Pc(245) short local245;
					@Pc(249) byte local249;
					if (local130) {
						local247 = arg6.aShortArray128[local106];
						local245 = arg6.aShortArray124[local106];
						local249 = arg6.aByteArray89[local106];
						local251 = arg6.aShortArray127[local106];
						local253 = arg6.aShortArray129[local106];
						local106++;
					} else {
						local245 = -1;
						local247 = local184;
						local249 = 0;
						local251 = local184;
						local253 = local184;
					}
					if (local208 != -1) {
						this.method7396(arg1.anIntArrayArray23[local208], 0, arg7, 0, 0, arg2, arg4, 0, arg10 & arg1.anIntArray260[local208]);
					} else if (local245 != -1) {
						this.method7396(arg1.anIntArrayArray23[local245], 0, arg7, 0, 0, arg2, arg4, 0, arg10 & arg1.anIntArray260[local245]);
					}
					@Pc(374) int local374;
					@Pc(397) int local397;
					@Pc(386) int local386;
					if ((local228 & 0x2) == 0 && (local249 & 0x1) == 0) {
						@Pc(360) int local360;
						if (local189 == 2) {
							local360 = local247 - local213 & 0x3FFF;
							@Pc(476) int local476 = local253 - local223 & 0x3FFF;
							if (local476 >= 8192) {
								local476 -= 16384;
							}
							if (local360 >= 8192) {
								local360 -= 16384;
							}
							@Pc(494) int local494 = local251 - local218 & 0x3FFF;
							local374 = local213 + arg3 * local360 / arg5 & 0x3FFF;
							if (local494 >= 8192) {
								local494 -= 16384;
							}
							local397 = local223 + local476 * arg3 / arg5 & 0x3FFF;
							local386 = local494 * arg3 / arg5 + local218 & 0x3FFF;
						} else if (local189 == 9) {
							local360 = local247 - local213 & 0x3FFF;
							if (local360 >= 8192) {
								local360 -= 16384;
							}
							local386 = 0;
							local397 = 0;
							local374 = local360 * arg3 / arg5 + local213 & 0x3FFF;
						} else if (local189 == 7) {
							local360 = local247 - local213 & 0x3F;
							if (local360 >= 32) {
								local360 -= 64;
							}
							local374 = local213 + local360 * arg3 / arg5 & 0x3F;
							local386 = local218 + arg3 * (local251 - local218) / arg5;
							local397 = local223 + (local253 - local223) * arg3 / arg5;
						} else {
							local397 = local223 + arg3 * (local253 - local223) / arg5;
							local374 = local213 + (local247 - local213) * arg3 / arg5;
							local386 = (local251 - local218) * arg3 / arg5 + local218;
						}
					} else {
						local397 = local223;
						local374 = local213;
						local386 = local218;
					}
					this.method7396(arg1.anIntArrayArray23[local108], local189, arg7, local386, local397, arg2, arg4, local374, arg10 & arg1.anIntArray260[local108]);
				} else {
					if (local130) {
						local106++;
					}
					if (local112) {
						local16++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
	protected abstract boolean F();

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	protected abstract void method7399();

	@OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
	protected abstract void L();

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
	public abstract void FA();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
	public abstract void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZIIIBIILclient!ut;[IILclient!ut;)V")
	public final void method7400(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class1_Sub8_Sub18 arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class1_Sub8_Sub18 arg8) {
		if (arg7 == -1) {
			return;
		}
		this.method7393();
		if (!this.F()) {
			this.method7399();
			return;
		}
		@Pc(21) Class341 local21 = arg8.aClass341Array1[arg7];
		@Pc(24) Class1_Sub31 local24 = local21.aClass1_Sub31_1;
		@Pc(32) Class341 local32 = null;
		if (arg5 != null) {
			local32 = arg5.aClass341Array1[arg1];
			if (local32.aClass1_Sub31_1 != local24) {
				local32 = null;
			}
		}
		this.method7398(false, local24, 0, arg3, arg0, arg4, local32, arg6, local21, null, arg2);
		this.L();
		this.method7399();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIBLclient!i;)V")
	protected final void method7401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class129 arg7) {
		@Pc(16) int local16 = -arg5 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(36) int local36 = arg7.method6480(arg3 + local21, local16 + arg0);
		@Pc(40) int local40 = arg5 / 2;
		@Pc(45) int local45 = -arg1 / 2;
		@Pc(55) int local55 = arg7.method6480(arg3 + local45, local40 + arg0);
		@Pc(60) int local60 = -arg5 / 2;
		@Pc(64) int local64 = arg1 / 2;
		@Pc(74) int local74 = arg7.method6480(arg3 + local64, arg0 + local60);
		@Pc(78) int local78 = arg5 / 2;
		@Pc(82) int local82 = arg1 / 2;
		@Pc(93) int local93 = arg7.method6480(local82 + arg3, arg0 - -local78);
		@Pc(104) int local104 = local36 >= local55 ? local55 : local36;
		@Pc(111) int local111 = local93 > local74 ? local74 : local93;
		@Pc(122) int local122 = local93 > local55 ? local55 : local93;
		@Pc(133) int local133 = local74 > local36 ? local36 : local74;
		@Pc(168) int local168;
		if (arg1 != 0) {
			@Pc(152) int local152 = (int) (Math.atan2((double) (local104 - local111), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local152 != 0) {
				if (arg2 != 0) {
					if (local152 > 8192) {
						local168 = 16384 - arg2;
						if (local152 < local168) {
							local152 = local168;
						}
					} else if (arg2 < local152) {
						local152 = arg2;
					}
				}
				this.MA(local152);
			}
		}
		if (arg5 != 0) {
			@Pc(198) int local198 = (int) (Math.atan2((double) (local133 - local122), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local198 != 0) {
				if (arg6 != 0) {
					if (local198 > 8192) {
						local168 = 16384 - arg6;
						if (local198 < local168) {
							local198 = local168;
						}
					} else if (arg6 < local198) {
						local198 = arg6;
					}
				}
				this.W(local198);
			}
		}
		@Pc(232) int local232 = local93 + local36;
		if (local74 + local55 < local232) {
			local232 = local55 + local74;
		}
		local232 = (local232 >> 1) - arg4;
		if (local232 != 0) {
			this.oa(0, local232, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
	public abstract void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
	protected abstract void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;IZ)V")
	public abstract void method7403(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()[Lclient!ns;")
	public abstract Class244[] method7404();

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!et;II)V")
	public abstract void method7405(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class11_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
	public abstract void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLclient!ut;[ZILclient!ut;Lclient!ut;ILclient!ut;IIIIBI)V")
	public final void method7406(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class1_Sub8_Sub18 arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub8_Sub18 arg5, @OriginalArg(6) Class1_Sub8_Sub18 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub8_Sub18 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) int arg13) {
		if (arg12 == -1) {
			return;
		}
		if (arg3 == null || arg10 == -1) {
			this.method7394(arg2, arg1, arg7, arg9, arg12, arg5, 0, arg11);
			return;
		}
		this.method7393();
		if (!this.F()) {
			this.method7399();
			return;
		}
		@Pc(39) Class341 local39 = arg5.aClass341Array1[arg12];
		@Pc(42) Class1_Sub31 local42 = local39.aClass1_Sub31_1;
		@Pc(44) Class341 local44 = null;
		if (arg2 != null) {
			local44 = arg2.aClass341Array1[arg9];
			if (local42 != local44.aClass1_Sub31_1) {
				local44 = null;
			}
		}
		this.method7398(false, local42, 0, arg7, arg1, arg11, local44, null, local39, arg3, 65535);
		@Pc(76) Class341 local76 = arg6.aClass341Array1[arg10];
		@Pc(78) Class341 local78 = null;
		if (arg8 != null) {
			local78 = arg8.aClass341Array1[arg13];
			if (local42 != local78.aClass1_Sub31_1) {
				local78 = null;
			}
		}
		this.method7391(0, new int[0], 0, 0, 0, 0, arg1);
		this.method7398(true, local76.aClass1_Sub31_1, 0, arg4, arg1, arg0, local78, null, local76, arg3, 65535);
		this.L();
		this.method7399();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public abstract void method7408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()Z")
	public abstract boolean method7409();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7410(@OriginalArg(0) Class34 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!ut;I)V")
	public final void method7411(@OriginalArg(1) Class1_Sub8_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7393();
		if (!this.F()) {
			this.method7399();
			return;
		}
		@Pc(23) Class341 local23 = arg0.aClass341Array1[arg1];
		@Pc(26) Class1_Sub31 local26 = local23.aClass1_Sub31_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt9122; local28++) {
			@Pc(35) short local35 = local23.aShortArray125[local28];
			if (local26.aBooleanArray20[local35]) {
				if (local23.aShortArray124[local28] != -1) {
					this.WA(0, 0, 0, 0);
				}
				this.WA(local26.anIntArray261[local35], local23.aShortArray128[local28], local23.aShortArray129[local28], local23.aShortArray127[local28]);
			}
		}
		this.L();
		this.method7399();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!da;")
	public abstract Class52 method7412(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!et;I)V")
	public abstract void method7413(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class11_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
	public abstract int za();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	public abstract void method7414(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);
}
