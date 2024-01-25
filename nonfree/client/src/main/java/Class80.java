import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class80 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Z")
	protected boolean aBoolean525 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class80() {
	}

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
	public abstract boolean method6371();

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lclient!oq;")
	public abstract Class265[] method6372();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qja;)V")
	public abstract void method6373(@OriginalArg(0) Class26 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!ak;ILclient!ak;IIIIILclient!ak;[ZLclient!ak;III)V")
	public final void method6374(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14_Sub3_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14_Sub3_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class14_Sub3_Sub1 arg9, @OriginalArg(10) boolean[] arg10, @OriginalArg(11) Class14_Sub3_Sub1 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg4 == -1) {
			return;
		}
		if (arg10 == null || arg13 == -1) {
			this.method6387(arg3, arg4, arg8, arg2, arg12, arg0, arg9, 0);
			return;
		}
		this.method6381();
		if (!this.NA()) {
			this.method6377();
			return;
		}
		@Pc(42) Class357 local42 = arg9.aClass357Array1[arg4];
		@Pc(45) Class14_Sub23 local45 = local42.aClass14_Sub23_1;
		@Pc(47) Class357 local47 = null;
		if (arg3 != null) {
			local47 = arg3.aClass357Array1[arg2];
			if (local45 != local47.aClass14_Sub23_1) {
				local47 = null;
			}
		}
		this.method6379(local45, arg10, 65535, 0, arg0, false, (int[]) null, arg8, local47, local42, arg12);
		@Pc(79) Class357 local79 = arg1.aClass357Array1[arg13];
		@Pc(81) Class357 local81 = null;
		if (arg11 != null) {
			local81 = arg11.aClass357Array1[arg5];
			if (local81.aClass14_Sub23_1 != local45) {
				local81 = null;
			}
		}
		this.method6384(0, new int[0], 0, 0, 0, 0, arg0);
		this.method6379(local79.aClass14_Sub23_1, arg10, 65535, 0, arg0, true, (int[]) null, arg6, local81, local79, arg7);
		this.wa();
		this.method6377();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qja;Lclient!ag;II)V")
	public abstract void method6375(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!gv;")
	public abstract Class136[] method6376();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method6377();

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class80 method6378(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!he;[ZIIZZ[IILclient!ut;Lclient!ut;ZI)V")
	private void method6379(@OriginalArg(0) Class14_Sub23 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class357 arg8, @OriginalArg(9) Class357 arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (arg8 == null || arg7 == 0) {
			for (local14 = 0; local14 < arg9.anInt10346; local14++) {
				@Pc(21) short local21 = arg9.aShortArray151[local14];
				if (arg1 == null || arg5 == arg1[local21] || arg0.anIntArray324[local21] == 0) {
					@Pc(45) short local45 = arg9.aShortArray144[local14];
					if (local45 != -1) {
						this.method6390(arg6, 0, arg4, 0, arg3, arg2 & arg0.anIntArray323[local45], 0, arg0.anIntArrayArray29[local45], 0);
					}
					this.method6390(arg6, arg0.anIntArray324[local21], arg4, arg9.aShortArray148[local14], arg3, arg0.anIntArray323[local21] & arg2, arg9.aShortArray146[local14], arg0.anIntArrayArray29[local21], arg9.aShortArray145[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(110) int local110 = 0;
		for (@Pc(112) int local112 = 0; local112 < arg0.anInt4026; local112++) {
			@Pc(116) boolean local116 = false;
			if (arg9.anInt10346 > local14 && local112 == arg9.aShortArray151[local14]) {
				local116 = true;
			}
			@Pc(134) boolean local134 = false;
			if (local110 < arg8.anInt10346 && local112 == arg8.aShortArray151[local110]) {
				local134 = true;
			}
			if (local116 || local134) {
				if (arg1 == null || arg5 == arg1[local112] || arg0.anIntArray324[local112] == 0) {
					@Pc(179) short local179 = 0;
					@Pc(184) int local184 = arg0.anIntArray324[local112];
					if (local184 == 3 || local184 == 10) {
						local179 = 128;
					}
					@Pc(209) short local209;
					@Pc(219) short local219;
					@Pc(199) short local199;
					@Pc(204) short local204;
					@Pc(214) byte local214;
					if (local116) {
						local199 = arg9.aShortArray146[local14];
						local204 = arg9.aShortArray144[local14];
						local209 = arg9.aShortArray148[local14];
						local214 = arg9.aByteArray128[local14];
						local219 = arg9.aShortArray145[local14];
						local14++;
					} else {
						local209 = local179;
						local204 = -1;
						local219 = local179;
						local199 = local179;
						local214 = 0;
					}
					@Pc(244) short local244;
					@Pc(236) short local236;
					@Pc(238) short local238;
					@Pc(242) short local242;
					@Pc(240) byte local240;
					if (local134) {
						local244 = arg8.aShortArray148[local110];
						local242 = arg8.aShortArray144[local110];
						local240 = arg8.aByteArray128[local110];
						local236 = arg8.aShortArray145[local110];
						local238 = arg8.aShortArray146[local110];
						local110++;
					} else {
						local236 = local179;
						local238 = local179;
						local240 = 0;
						local242 = -1;
						local244 = local179;
					}
					if (local204 != -1) {
						this.method6390(arg6, 0, arg4, 0, arg3, arg2 & arg0.anIntArray323[local204], 0, arg0.anIntArrayArray29[local204], 0);
					} else if (local242 != -1) {
						this.method6390(arg6, 0, arg4, 0, arg3, arg0.anIntArray323[local242] & arg2, 0, arg0.anIntArrayArray29[local242], 0);
					}
					@Pc(370) int local370;
					@Pc(359) int local359;
					@Pc(358) int local358;
					if ((local214 & 0x2) == 0 && (local240 & 0x1) == 0) {
						@Pc(349) int local349;
						if (local184 == 2) {
							local349 = local244 - local209 & 0x3FFF;
							@Pc(476) int local476 = local236 - local219 & 0x3FFF;
							if (local476 >= 8192) {
								local476 -= 16384;
							}
							@Pc(487) int local487 = local238 - local199 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							if (local487 >= 8192) {
								local487 -= 16384;
							}
							local370 = local209 + arg7 * local349 / arg10 & 0x3FFF;
							local359 = arg7 * local476 / arg10 + local219 & 0x3FFF;
							local358 = arg7 * local487 / arg10 + local199 & 0x3FFF;
						} else if (local184 == 9) {
							local349 = local244 - local209 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							local358 = 0;
							local359 = 0;
							local370 = local209 + local349 * arg7 / arg10 & 0x3FFF;
						} else if (local184 == 7) {
							local349 = local244 - local209 & 0x3F;
							if (local349 >= 32) {
								local349 -= 64;
							}
							local370 = local209 + arg7 * local349 / arg10 & 0x3F;
							local359 = local219 + arg7 * (local236 - local219) / arg10;
							local358 = arg7 * (local238 - local199) / arg10 + local199;
						} else {
							local358 = local199 + (local238 - local199) * arg7 / arg10;
							local370 = local209 + arg7 * (local244 - local209) / arg10;
							local359 = arg7 * (local236 - local219) / arg10 + local219;
						}
					} else {
						local370 = local209;
						local358 = local199;
						local359 = local219;
					}
					this.method6390(arg6, local184, arg4, local370, arg3, arg0.anIntArray323[local112] & arg2, local358, arg0.anIntArrayArray29[local112], local359);
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

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!qja;ZI)Z")
	public abstract boolean method6380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	protected abstract void method6381();

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qja;IZ)V")
	public abstract void method6382(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method6384(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method6385(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!qja;ZII)Z")
	public abstract boolean method6386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ak;IIIIZBLclient!ak;I)V")
	public final void method6387(@OriginalArg(0) Class14_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) Class14_Sub3_Sub1 arg6, @OriginalArg(8) int arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method6381();
		if (!this.NA()) {
			this.method6377();
			return;
		}
		@Pc(20) Class357 local20 = arg6.aClass357Array1[arg1];
		@Pc(23) Class14_Sub23 local23 = local20.aClass14_Sub23_1;
		@Pc(25) Class357 local25 = null;
		if (arg0 != null) {
			local25 = arg0.aClass357Array1[arg3];
			if (local25.aClass14_Sub23_1 != local23) {
				local25 = null;
			}
		}
		this.method6379(local23, (boolean[]) null, 65535, arg7, arg5, false, (int[]) null, arg2, local25, local20, arg4);
		this.wa();
		this.method6377();
	}

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ak;ZILclient!ak;[IIIIII)V")
	public final void method6388(@OriginalArg(1) Class14_Sub3_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) Class14_Sub3_Sub1 arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg6 == -1) {
			return;
		}
		this.method6381();
		if (!this.NA()) {
			this.method6377();
			return;
		}
		@Pc(20) Class357 local20 = arg0.aClass357Array1[arg6];
		@Pc(31) Class14_Sub23 local31 = local20.aClass14_Sub23_1;
		@Pc(33) Class357 local33 = null;
		if (arg2 != null) {
			local33 = arg2.aClass357Array1[arg7];
			if (local33.aClass14_Sub23_1 != local31) {
				local33 = null;
			}
		}
		this.method6379(local31, (boolean[]) null, arg4, 0, arg1, false, arg3, arg5, local33, local20, arg8);
		this.wa();
		this.method6377();
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	public abstract void method6389();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIZIIII[III)V")
	private void method6390(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8) {
		@Pc(19) int local19;
		if (arg4 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local19 = -arg3;
				arg3 = arg6;
				arg6 = local19;
			} else if (arg1 == 3) {
				local19 = arg3;
				arg3 = arg6;
				arg6 = local19;
			} else if (arg1 == 2) {
				local19 = arg3;
				arg3 = -arg6 & 0x3FFF;
				arg6 = local19 & 0x3FFF;
			}
		} else if (arg4 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg3 = -arg3;
				arg6 = -arg6;
			} else if (arg1 == 2) {
				arg6 = -arg6 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg4 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local19 = arg3;
				arg3 = -arg6;
				arg6 = local19;
			} else if (arg1 == 3) {
				local19 = arg3;
				arg3 = arg6;
				arg6 = local19;
			} else if (arg1 == 2) {
				local19 = arg3;
				arg3 = arg6 & 0x3FFF;
				arg6 = -local19 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.method6384(arg1, arg7, arg3, arg8, arg6, arg4, arg2);
		} else {
			this.I(arg1, arg7, arg3, arg8, arg6, arg2, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!qja;Lclient!ag;I)V")
	public abstract void method6391(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!s;IIIIIIII)V")
	protected final void method6392(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg5 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(32) int local32 = arg0.method7866(arg6 + local16, local21 + arg3);
		@Pc(36) int local36 = arg5 / 2;
		@Pc(41) int local41 = -arg7 / 2;
		@Pc(52) int local52 = arg0.method7866(arg6 + local36, local41 + arg3);
		@Pc(57) int local57 = -arg5 / 2;
		@Pc(61) int local61 = arg7 / 2;
		@Pc(72) int local72 = arg0.method7866(arg6 + local57, local61 + arg3);
		@Pc(76) int local76 = arg5 / 2;
		@Pc(80) int local80 = arg7 / 2;
		@Pc(99) int local99 = arg0.method7866(local76 + arg6, arg3 - -local80);
		@Pc(106) int local106 = local32 < local52 ? local32 : local52;
		@Pc(113) int local113 = local72 < local99 ? local72 : local99;
		@Pc(124) int local124 = local52 < local99 ? local52 : local99;
		@Pc(135) int local135 = local72 <= local32 ? local72 : local32;
		@Pc(176) int local176;
		if (arg7 != 0) {
			@Pc(151) int local151 = (int) (Math.atan2((double) (local106 - local113), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local151 != 0) {
				if (arg4 != 0) {
					if (local151 > 8192) {
						local176 = 16384 - arg4;
						if (local176 > local151) {
							local151 = local176;
						}
					} else if (arg4 < local151) {
						local151 = arg4;
					}
				}
				this.FA(local151);
			}
		}
		if (arg5 != 0) {
			@Pc(204) int local204 = (int) (Math.atan2((double) (local135 - local124), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local204 != 0) {
				if (arg2 != 0) {
					if (local204 > 8192) {
						local176 = 16384 - arg2;
						if (local204 < local176) {
							local204 = local176;
						}
					} else if (local204 > arg2) {
						local204 = arg2;
					}
				}
				this.VA(local204);
			}
		}
		@Pc(241) int local241 = local32 + local99;
		if (local52 + local72 < local241) {
			local241 = local52 + local72;
		}
		local241 = (local241 >> 1) - arg1;
		if (local241 != 0) {
			this.H(0, local241, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BILclient!ak;)V")
	public final void method6395(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub3_Sub1 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method6381();
		if (!this.NA()) {
			this.method6377();
			return;
		}
		@Pc(26) Class357 local26 = arg1.aClass357Array1[arg0];
		@Pc(29) Class14_Sub23 local29 = local26.aClass14_Sub23_1;
		for (@Pc(31) int local31 = 0; local31 < local26.anInt10346; local31++) {
			@Pc(38) short local38 = local26.aShortArray151[local31];
			if (local29.aBooleanArray11[local38]) {
				if (local26.aShortArray144[local31] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local29.anIntArray324[local38], local26.aShortArray148[local31], local26.aShortArray145[local31], local26.aShortArray146[local31]);
			}
		}
		this.wa();
		this.method6377();
	}

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class14_Sub3_Sub14 ba(@OriginalArg(0) Class14_Sub3_Sub14 arg0);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
