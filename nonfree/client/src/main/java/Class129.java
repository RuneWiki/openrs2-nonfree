import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class129 {

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Z")
	protected boolean aBoolean417 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class129() {
	}

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5284(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method5285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!rh;IILclient!rh;IZ[ZLclient!rh;BIIIILclient!rh;)V")
	public final void method5286(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub2_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class14_Sub2_Sub15 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) Class14_Sub2_Sub15 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class14_Sub2_Sub15 arg13) {
		if (arg3 == -1) {
			return;
		}
		if (arg7 == null || arg2 == -1) {
			this.method5297(arg1, 0, arg9, arg6, arg3, arg0, arg13, arg11);
			return;
		}
		this.method5292();
		if (!this.NA()) {
			this.method5309();
			return;
		}
		@Pc(42) Class337 local42 = arg1.aClass337Array1[arg3];
		@Pc(45) Class14_Sub22 local45 = local42.aClass14_Sub22_1;
		@Pc(47) Class337 local47 = null;
		if (arg13 != null) {
			local47 = arg13.aClass337Array1[arg11];
			if (local45 != local47.aClass14_Sub22_1) {
				local47 = null;
			}
		}
		this.method5291(local45, arg9, false, local47, arg6, 65535, arg7, (int[]) null, arg0, local42, 0);
		@Pc(84) Class337 local84 = arg4.aClass337Array1[arg2];
		@Pc(86) Class337 local86 = null;
		if (arg8 != null) {
			local86 = arg8.aClass337Array1[arg5];
			if (local45 != local86.aClass14_Sub22_1) {
				local86 = null;
			}
		}
		this.method5284(0, new int[0], 0, 0, 0, 0, arg6);
		this.method5291(local84.aClass14_Sub22_1, arg12, true, local86, arg6, 65535, arg7, (int[]) null, arg10, local84, 0);
		this.wa();
		this.method5309();
	}

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class129 method5288(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rd;Lclient!aba;II)V")
	public abstract void method5289(@OriginalArg(0) Class263 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBIIIILclient!s;I)V")
	protected final void method5290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class159 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg3 / 2;
		@Pc(21) int local21 = -arg2 / 2;
		@Pc(33) int local33 = arg6.method8209(arg5 + local16, arg0 - -local21);
		@Pc(37) int local37 = arg3 / 2;
		@Pc(42) int local42 = -arg2 / 2;
		@Pc(54) int local54 = arg6.method8209(arg5 + local37, arg0 - -local42);
		@Pc(64) int local64 = -arg3 / 2;
		@Pc(68) int local68 = arg2 / 2;
		@Pc(78) int local78 = arg6.method8209(local64 + arg5, arg0 + local68);
		@Pc(82) int local82 = arg3 / 2;
		@Pc(86) int local86 = arg2 / 2;
		@Pc(96) int local96 = arg6.method8209(arg5 + local82, local86 + arg0);
		@Pc(104) int local104 = local54 <= local33 ? local54 : local33;
		@Pc(112) int local112 = local78 < local96 ? local78 : local96;
		@Pc(120) int local120 = local96 <= local54 ? local96 : local54;
		@Pc(168) int local168;
		if (arg2 != 0) {
			@Pc(139) int local139 = (int) (Math.atan2((double) (local104 - local112), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local139 != 0) {
				if (arg4 != 0) {
					if (local139 > 8192) {
						local168 = 16384 - arg4;
						if (local139 < local168) {
							local139 = local168;
						}
					} else if (arg4 < local139) {
						local139 = arg4;
					}
				}
				this.FA(local139);
			}
		}
		@Pc(192) int local192 = local33 < local78 ? local33 : local78;
		if (arg3 != 0) {
			@Pc(208) int local208 = (int) (Math.atan2((double) (local192 - local120), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local208 != 0) {
				if (arg7 != 0) {
					if (local208 > 8192) {
						local168 = 16384 - arg7;
						if (local168 > local208) {
							local208 = local168;
						}
					} else if (local208 > arg7) {
						local208 = arg7;
					}
				}
				this.VA(local208);
			}
		}
		@Pc(248) int local248 = local96 + local33;
		if (local248 > local78 + local54) {
			local248 = local54 + local78;
		}
		local248 = (local248 >> 1) - arg1;
		if (local248 != 0) {
			this.H(0, local248, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!jf;IZLclient!so;ZZI[Z[IILclient!so;I)V")
	private void method5291(@OriginalArg(0) Class14_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class337 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class337 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (arg3 == null || arg8 == 0) {
			for (local13 = 0; local13 < arg9.anInt9428; local13++) {
				@Pc(20) short local20 = arg9.aShortArray124[local13];
				if (arg6 == null || arg6[local20] == arg2 || arg0.anIntArray285[local20] == 0) {
					@Pc(46) short local46 = arg9.aShortArray126[local13];
					if (local46 != -1) {
						this.method5306(arg0.anIntArray284[local46] & arg5, 0, arg0.anIntArrayArray34[local46], 0, 0, arg7, arg10, arg4, 0);
					}
					this.method5306(arg0.anIntArray284[local20] & arg5, arg9.aShortArray120[local13], arg0.anIntArrayArray34[local20], arg9.aShortArray129[local13], arg0.anIntArray285[local20], arg7, arg10, arg4, arg9.aShortArray123[local13]);
				}
			}
			return;
		}
		local13 = 0;
		@Pc(115) int local115 = 0;
		for (@Pc(125) int local125 = 0; local125 < arg0.anInt5146; local125++) {
			@Pc(129) boolean local129 = false;
			if (local13 < arg9.anInt9428 && local125 == arg9.aShortArray124[local13]) {
				local129 = true;
			}
			@Pc(145) boolean local145 = false;
			if (local115 < arg3.anInt9428 && arg3.aShortArray124[local115] == local125) {
				local145 = true;
			}
			if (local129 || local145) {
				if (arg6 == null || arg2 == arg6[local125] || arg0.anIntArray285[local125] == 0) {
					@Pc(208) short local208 = 0;
					@Pc(213) int local213 = arg0.anIntArray285[local125];
					if (local213 == 3 || local213 == 10) {
						local208 = 128;
					}
					@Pc(239) short local239;
					@Pc(235) short local235;
					@Pc(237) short local237;
					@Pc(231) short local231;
					@Pc(233) byte local233;
					if (local129) {
						local233 = arg9.aByteArray101[local13];
						local231 = arg9.aShortArray126[local13];
						local235 = arg9.aShortArray120[local13];
						local239 = arg9.aShortArray129[local13];
						local237 = arg9.aShortArray123[local13];
						local13++;
					} else {
						local231 = -1;
						local233 = 0;
						local235 = local208;
						local237 = local208;
						local239 = local208;
					}
					@Pc(274) short local274;
					@Pc(279) short local279;
					@Pc(289) short local289;
					@Pc(294) short local294;
					@Pc(284) byte local284;
					if (local145) {
						local274 = arg3.aShortArray129[local115];
						local279 = arg3.aShortArray120[local115];
						local284 = arg3.aByteArray101[local115];
						local289 = arg3.aShortArray123[local115];
						local294 = arg3.aShortArray126[local115];
						local115++;
					} else {
						local279 = local208;
						local289 = local208;
						local284 = 0;
						local274 = local208;
						local294 = -1;
					}
					@Pc(325) int local325;
					@Pc(329) int local329;
					@Pc(327) int local327;
					if ((local233 & 0x2) == 0 && (local284 & 0x1) == 0) {
						@Pc(352) int local352;
						if (local213 == 2) {
							local352 = local274 - local239 & 0x3FFF;
							@Pc(480) int local480 = local279 - local235 & 0x3FFF;
							if (local480 >= 8192) {
								local480 -= 16384;
							}
							@Pc(495) int local495 = local289 - local237 & 0x3FFF;
							if (local352 >= 8192) {
								local352 -= 16384;
							}
							if (local495 >= 8192) {
								local495 -= 16384;
							}
							local325 = local239 + local352 * arg8 / arg1 & 0x3FFF;
							local329 = local235 + arg8 * local480 / arg1 & 0x3FFF;
							local327 = local237 + local495 * arg8 / arg1 & 0x3FFF;
						} else if (local213 == 9) {
							local352 = local274 - local239 & 0x3FFF;
							if (local352 >= 8192) {
								local352 -= 16384;
							}
							local327 = 0;
							local329 = 0;
							local325 = local239 + local352 * arg8 / arg1 & 0x3FFF;
						} else if (local213 == 7) {
							local352 = local274 - local239 & 0x3F;
							if (local352 >= 32) {
								local352 -= 64;
							}
							local327 = (local289 - local237) * arg8 / arg1 + local237;
							local329 = local235 + arg8 * (local279 - local235) / arg1;
							local325 = arg8 * local352 / arg1 + local239 & 0x3F;
						} else {
							local327 = local237 + (local289 - local237) * arg8 / arg1;
							local329 = arg8 * (local279 - local235) / arg1 + local235;
							local325 = (local274 - local239) * arg8 / arg1 + local239;
						}
					} else {
						local325 = local239;
						local327 = local237;
						local329 = local235;
					}
					if (local231 != -1) {
						this.method5306(arg0.anIntArray284[local231] & arg5, 0, arg0.anIntArrayArray34[local231], 0, 0, arg7, arg10, arg4, 0);
					} else if (local294 != -1) {
						this.method5306(arg5 & arg0.anIntArray284[local294], 0, arg0.anIntArrayArray34[local294], 0, 0, arg7, arg10, arg4, 0);
					}
					this.method5306(arg0.anIntArray284[local125] & arg5, local329, arg0.anIntArrayArray34[local125], local325, local213, arg7, arg10, arg4, local327);
				} else {
					if (local129) {
						local13++;
					}
					if (local145) {
						local115++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	protected abstract void method5292();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) Class159 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
	public abstract boolean method5293();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rd;)V")
	public abstract void method5294(@OriginalArg(0) Class263 arg0);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()[B")
	public abstract byte[] method5295();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!rd;ZI)Z")
	public abstract boolean method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rh;IIBZIILclient!rh;I)V")
	public final void method5297(@OriginalArg(0) Class14_Sub2_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class14_Sub2_Sub15 arg6, @OriginalArg(8) int arg7) {
		if (arg4 == -1) {
			return;
		}
		this.method5292();
		if (!this.NA()) {
			this.method5309();
			return;
		}
		@Pc(22) Class337 local22 = arg0.aClass337Array1[arg4];
		@Pc(25) Class14_Sub22 local25 = local22.aClass14_Sub22_1;
		@Pc(27) Class337 local27 = null;
		if (arg6 != null) {
			local27 = arg6.aClass337Array1[arg7];
			if (local25 != local27.aClass14_Sub22_1) {
				local27 = null;
			}
		}
		this.method5291(local25, arg2, false, local27, arg3, 65535, (boolean[]) null, (int[]) null, arg5, local22, arg1);
		this.wa();
		this.method5309();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IILclient!rh;IIZIILclient!rh;)V")
	public final void method5298(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class14_Sub2_Sub15 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class14_Sub2_Sub15 arg8) {
		if (arg6 == -1) {
			return;
		}
		this.method5292();
		if (!this.NA()) {
			this.method5309();
			return;
		}
		@Pc(32) Class337 local32 = arg3.aClass337Array1[arg6];
		@Pc(35) Class14_Sub22 local35 = local32.aClass14_Sub22_1;
		@Pc(37) Class337 local37 = null;
		if (arg8 != null) {
			local37 = arg8.aClass337Array1[arg7];
			if (local35 != local37.aClass14_Sub22_1) {
				local37 = null;
			}
		}
		this.method5291(local35, arg2, false, local37, arg5, arg0, (boolean[]) null, arg1, arg4, local32, 0);
		this.wa();
		this.method5309();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method5299(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	public abstract void method5300();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class14_Sub2_Sub5 ba(@OriginalArg(0) Class14_Sub2_Sub5 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLclient!rh;)V")
	public final void method5301(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub2_Sub15 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method5292();
		if (!this.NA()) {
			this.method5309();
			return;
		}
		@Pc(33) Class337 local33 = arg1.aClass337Array1[arg0];
		@Pc(36) Class14_Sub22 local36 = local33.aClass14_Sub22_1;
		for (@Pc(38) int local38 = 0; local38 < local33.anInt9428; local38++) {
			@Pc(45) short local45 = local33.aShortArray124[local38];
			if (local36.aBooleanArray14[local45]) {
				if (local33.aShortArray126[local38] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local36.anIntArray285[local45], local33.aShortArray129[local38], local33.aShortArray120[local38], local33.aShortArray123[local38]);
			}
		}
		this.wa();
		this.method5309();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!rd;ZII)Z")
	public abstract boolean method5302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B[B)V")
	public abstract void method5303(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!tm;")
	public abstract Class352[] method5304();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rd;IZ)V")
	public abstract void method5305(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[IIII[IIZI)V")
	private void method5306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(30) int local30;
		if (arg6 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local30 = -arg3;
				arg3 = arg8;
				arg8 = local30;
			} else if (arg4 == 3) {
				local30 = arg3;
				arg3 = arg8;
				arg8 = local30;
			} else if (arg4 == 2) {
				local30 = arg3;
				arg3 = -arg8 & 0x3FFF;
				arg8 = local30 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg8 = -arg8;
				arg3 = -arg3;
			} else if (arg4 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local30 = arg3;
				arg3 = -arg8;
				arg8 = local30;
			} else if (arg4 == 3) {
				local30 = arg3;
				arg3 = arg8;
				arg8 = local30;
			} else if (arg4 == 2) {
				local30 = arg3;
				arg3 = arg8 & 0x3FFF;
				arg8 = -local30 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.method5284(arg4, arg2, arg3, arg1, arg8, arg6, arg7);
		} else {
			this.I(arg4, arg2, arg3, arg1, arg8, arg7, arg0, arg5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rd;Lclient!aba;I)V")
	public abstract void method5307(@OriginalArg(0) Class263 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
	protected abstract void method5309();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!ih;")
	public abstract Class172[] method5310();
}
