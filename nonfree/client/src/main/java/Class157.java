import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class157 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
	protected boolean aBoolean485 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class157() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIIIII[IZI)V")
	private void method5208(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(23) int local23;
		if (arg4 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local23 = -arg5;
				arg5 = arg8;
				arg8 = local23;
			} else if (arg3 == 3) {
				local23 = arg5;
				arg5 = arg8;
				arg8 = local23;
			} else if (arg3 == 2) {
				local23 = arg5;
				arg5 = -arg8 & 0x3FFF;
				arg8 = local23 & 0x3FFF;
			}
		} else if (arg4 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg8 = -arg8;
				arg5 = -arg5;
			} else if (arg3 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg4 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local23 = arg5;
				arg5 = -arg8;
				arg8 = local23;
			} else if (arg3 == 3) {
				local23 = arg5;
				arg5 = arg8;
				arg8 = local23;
			} else if (arg3 == 2) {
				local23 = arg5;
				arg5 = arg8 & 0x3FFF;
				arg8 = -local23 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.method5213(arg3, arg0, arg5, arg1, arg8, arg4, arg7);
		} else {
			this.I(arg3, arg0, arg5, arg1, arg8, arg7, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B[B)V")
	public abstract void method5210(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class157 method5211(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method5212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5213(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!hl;")
	public abstract Class156[] method5214();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method5215();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class3_Sub4_Sub13 ba(@OriginalArg(0) Class3_Sub4_Sub13 arg0);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[B")
	public abstract byte[] method5216();

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BZII[IILclient!pha;IILclient!pha;I)V")
	public final void method5217(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class3_Sub4_Sub15 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class3_Sub4_Sub15 arg7, @OriginalArg(10) int arg8) {
		if (arg5 == -1) {
			return;
		}
		this.method5215();
		if (!this.NA()) {
			this.method5219();
			return;
		}
		@Pc(22) Class129 local22 = arg7.aClass129Array1[arg5];
		@Pc(25) Class3_Sub21 local25 = local22.aClass3_Sub21_1;
		@Pc(32) Class129 local32 = null;
		if (arg4 != null) {
			local32 = arg4.aClass129Array1[arg1];
			if (local32.aClass3_Sub21_1 != local25) {
				local32 = null;
			}
		}
		this.method5233(false, (boolean[]) null, arg3, arg8, local32, arg2, 0, arg6, local25, local22, arg0);
		this.wa();
		this.method5219();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!iu;ZI)Z")
	public abstract boolean method5218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
	protected abstract void method5219();

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!iu;IZ)V")
	public abstract void method5220(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!iu;ZII)Z")
	public abstract boolean method5221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lclient!sw;")
	public abstract Class348[] method5222();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class313 arg2, @OriginalArg(3) Class313 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()Z")
	public abstract boolean method5224();

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	public abstract void method5225();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!iu;)V")
	public abstract void method5226(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!iu;Lclient!laa;II)V")
	public abstract void method5227(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class19_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIILclient!s;)V")
	protected final void method5228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class313 arg7) {
		@Pc(16) int local16 = -arg1 / 2;
		@Pc(21) int local21 = -arg2 / 2;
		@Pc(31) int local31 = arg7.method9096(arg0 + local16, local21 + arg4);
		@Pc(35) int local35 = arg1 / 2;
		@Pc(40) int local40 = -arg2 / 2;
		@Pc(50) int local50 = arg7.method9096(arg0 + local35, local40 + arg4);
		@Pc(63) int local63 = -arg1 / 2;
		@Pc(67) int local67 = arg2 / 2;
		@Pc(77) int local77 = arg7.method9096(arg0 + local63, arg4 + local67);
		@Pc(81) int local81 = arg1 / 2;
		@Pc(85) int local85 = arg2 / 2;
		@Pc(96) int local96 = arg7.method9096(local81 + arg0, arg4 - -local85);
		@Pc(104) int local104 = local50 > local31 ? local31 : local50;
		@Pc(116) int local116 = local77 >= local96 ? local96 : local77;
		@Pc(124) int local124 = local50 >= local96 ? local96 : local50;
		@Pc(136) int local136 = local77 <= local31 ? local77 : local31;
		@Pc(173) int local173;
		if (arg2 != 0) {
			@Pc(152) int local152 = (int) (Math.atan2((double) (local104 - local116), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local152 != 0) {
				if (arg5 != 0) {
					if (local152 > 8192) {
						local173 = 16384 - arg5;
						if (local152 < local173) {
							local152 = local173;
						}
					} else if (local152 > arg5) {
						local152 = arg5;
					}
				}
				this.FA(local152);
			}
		}
		if (arg1 != 0) {
			@Pc(214) int local214 = (int) (Math.atan2((double) (local136 - local124), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local214 != 0) {
				if (arg3 != 0) {
					if (local214 > 8192) {
						local173 = 16384 - arg3;
						if (local173 > local214) {
							local214 = local173;
						}
					} else if (arg3 < local214) {
						local214 = arg3;
					}
				}
				this.VA(local214);
			}
		}
		@Pc(260) int local260 = local31 + local96;
		if (local77 + local50 < local260) {
			local260 = local77 + local50;
		}
		local260 = (local260 >> 1) - arg6;
		if (local260 != 0) {
			this.H(0, local260, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!pha;ILclient!pha;ILclient!pha;IIII[ZILclient!pha;ZZ)V")
	public final void method5229(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub4_Sub15 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub4_Sub15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class3_Sub4_Sub15 arg12, @OriginalArg(13) boolean arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg10 == null || arg11 == -1) {
			this.method5234(arg2, arg0, arg6, arg13, 0, arg9, arg5, arg1);
			return;
		}
		this.method5215();
		if (!this.NA()) {
			this.method5219();
			return;
		}
		@Pc(43) Class129 local43 = arg5.aClass129Array1[arg2];
		@Pc(46) Class3_Sub21 local46 = local43.aClass3_Sub21_1;
		@Pc(48) Class129 local48 = null;
		if (arg1 != null) {
			local48 = arg1.aClass129Array1[arg6];
			if (local48.aClass3_Sub21_1 != local46) {
				local48 = null;
			}
		}
		this.method5233(false, arg10, 65535, arg9, local48, (int[]) null, 0, arg0, local46, local43, arg13);
		@Pc(80) Class129 local80 = arg3.aClass129Array1[arg11];
		@Pc(82) Class129 local82 = null;
		if (arg12 != null) {
			local82 = arg12.aClass129Array1[arg7];
			if (local46 != local82.aClass3_Sub21_1) {
				local82 = null;
			}
		}
		this.method5213(0, new int[0], 0, 0, 0, 0, arg13);
		this.method5233(true, arg10, 65535, arg4, local82, (int[]) null, 0, arg8, local80.aClass3_Sub21_1, local80, arg13);
		this.wa();
		this.method5219();
	}

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!pha;II)V")
	public final void method5230(@OriginalArg(0) Class3_Sub4_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method5215();
		if (!this.NA()) {
			this.method5219();
			return;
		}
		@Pc(24) Class129 local24 = arg0.aClass129Array1[arg1];
		@Pc(27) Class3_Sub21 local27 = local24.aClass3_Sub21_1;
		for (@Pc(29) int local29 = 0; local29 < local24.anInt3537; local29++) {
			@Pc(36) short local36 = local24.aShortArray55[local29];
			if (local27.aBooleanArray8[local36]) {
				if (local24.aShortArray57[local29] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local27.anIntArray135[local36], local24.aShortArray60[local29], local24.aShortArray56[local29], local24.aShortArray61[local29]);
			}
		}
		this.wa();
		this.method5219();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method5231(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!iu;Lclient!laa;I)V")
	public abstract void method5232(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class19_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z[ZIILclient!gea;B[IIILclient!en;Lclient!gea;Z)V")
	private void method5233(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class129 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3_Sub21 arg8, @OriginalArg(10) Class129 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(13) int local13;
		if (arg4 == null || arg7 == 0) {
			for (local13 = 0; local13 < arg9.anInt3537; local13++) {
				@Pc(20) short local20 = arg9.aShortArray55[local13];
				if (arg1 == null || arg1[local20] == arg0 || arg8.anIntArray135[local20] == 0) {
					@Pc(51) short local51 = arg9.aShortArray57[local13];
					if (local51 != -1) {
						this.method5208(arg8.anIntArrayArray15[local51], 0, arg2 & arg8.anIntArray136[local51], 0, arg6, 0, arg5, arg10, 0);
					}
					this.method5208(arg8.anIntArrayArray15[local20], arg9.aShortArray56[local13], arg2 & arg8.anIntArray136[local20], arg8.anIntArray135[local20], arg6, arg9.aShortArray60[local13], arg5, arg10, arg9.aShortArray61[local13]);
				}
			}
			return;
		}
		local13 = 0;
		@Pc(120) int local120 = 0;
		for (@Pc(127) int local127 = 0; local127 < arg8.anInt2833; local127++) {
			@Pc(131) boolean local131 = false;
			if (local13 < arg9.anInt3537 && local127 == arg9.aShortArray55[local13]) {
				local131 = true;
			}
			@Pc(151) boolean local151 = false;
			if (arg4.anInt3537 > local120 && arg4.aShortArray55[local120] == local127) {
				local151 = true;
			}
			if (local131 || local151) {
				if (arg1 == null || arg0 == arg1[local127] || arg8.anIntArray135[local127] == 0) {
					@Pc(216) short local216 = 0;
					@Pc(221) int local221 = arg8.anIntArray135[local127];
					if (local221 == 3 || local221 == 10) {
						local216 = 128;
					}
					@Pc(262) short local262;
					@Pc(252) short local252;
					@Pc(257) short local257;
					@Pc(242) short local242;
					@Pc(247) byte local247;
					if (local131) {
						local242 = arg9.aShortArray57[local13];
						local247 = arg9.aByteArray19[local13];
						local252 = arg9.aShortArray56[local13];
						local257 = arg9.aShortArray61[local13];
						local262 = arg9.aShortArray60[local13];
						local13++;
					} else {
						local252 = local216;
						local257 = local216;
						local247 = 0;
						local262 = local216;
						local242 = -1;
					}
					@Pc(279) short local279;
					@Pc(281) short local281;
					@Pc(287) short local287;
					@Pc(283) short local283;
					@Pc(285) byte local285;
					if (local151) {
						local279 = arg4.aShortArray60[local120];
						local285 = arg4.aByteArray19[local120];
						local287 = arg4.aShortArray61[local120];
						local281 = arg4.aShortArray56[local120];
						local283 = arg4.aShortArray57[local120];
						local120++;
					} else {
						local279 = local216;
						local281 = local216;
						local283 = -1;
						local285 = 0;
						local287 = local216;
					}
					@Pc(327) int local327;
					@Pc(329) int local329;
					@Pc(331) int local331;
					if ((local247 & 0x2) == 0 && (local285 & 0x1) == 0) {
						@Pc(349) int local349;
						if (local221 == 2) {
							local349 = local279 - local262 & 0x3FFF;
							@Pc(476) int local476 = local281 - local252 & 0x3FFF;
							if (local476 >= 8192) {
								local476 -= 16384;
							}
							@Pc(491) int local491 = local287 - local257 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							local327 = local262 + arg7 * local349 / arg3 & 0x3FFF;
							local329 = local252 + local476 * arg7 / arg3 & 0x3FFF;
							if (local491 >= 8192) {
								local491 -= 16384;
							}
							local331 = arg7 * local491 / arg3 + local257 & 0x3FFF;
						} else if (local221 == 9) {
							local349 = local279 - local262 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							local327 = local262 + arg7 * local349 / arg3 & 0x3FFF;
							local331 = 0;
							local329 = 0;
						} else if (local221 == 7) {
							local349 = local279 - local262 & 0x3F;
							if (local349 >= 32) {
								local349 -= 64;
							}
							local327 = local349 * arg7 / arg3 + local262 & 0x3F;
							local329 = local252 + arg7 * (local281 - local252) / arg3;
							local331 = local257 + arg7 * (local287 - local257) / arg3;
						} else {
							local329 = arg7 * (local281 - local252) / arg3 + local252;
							local331 = local257 + (local287 - local257) * arg7 / arg3;
							local327 = local262 + arg7 * (local279 - local262) / arg3;
						}
					} else {
						local327 = local262;
						local329 = local252;
						local331 = local257;
					}
					if (local242 != -1) {
						this.method5208(arg8.anIntArrayArray15[local242], 0, arg2 & arg8.anIntArray136[local242], 0, arg6, 0, arg5, arg10, 0);
					} else if (local283 != -1) {
						this.method5208(arg8.anIntArrayArray15[local283], 0, arg8.anIntArray136[local283] & arg2, 0, arg6, 0, arg5, arg10, 0);
					}
					this.method5208(arg8.anIntArrayArray15[local127], local329, arg2 & arg8.anIntArray136[local127], local221, arg6, local327, arg5, arg10, local331);
				} else {
					if (local131) {
						local13++;
					}
					if (local151) {
						local120++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZIIILclient!pha;Lclient!pha;)V")
	public final void method5234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub4_Sub15 arg6, @OriginalArg(8) Class3_Sub4_Sub15 arg7) {
		if (arg0 == -1) {
			return;
		}
		this.method5215();
		if (!this.NA()) {
			this.method5219();
			return;
		}
		@Pc(23) Class129 local23 = arg6.aClass129Array1[arg0];
		@Pc(33) Class3_Sub21 local33 = local23.aClass3_Sub21_1;
		@Pc(35) Class129 local35 = null;
		if (arg7 != null) {
			local35 = arg7.aClass129Array1[arg2];
			if (local35.aClass3_Sub21_1 != local33) {
				local35 = null;
			}
		}
		this.method5233(false, (boolean[]) null, 65535, arg5, local35, (int[]) null, arg4, arg1, local33, local23, arg3);
		this.wa();
		this.method5219();
	}

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();
}
