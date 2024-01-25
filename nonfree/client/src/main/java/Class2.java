import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class2 {

	static {
		new Class67("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class2() {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZILclient!gea;ZIIILclient!gea;)V")
	public final void method5769(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub10_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub10_Sub6 arg7) {
		if (arg0 == -1 || !this.Q()) {
			return;
		}
		@Pc(17) Class189 local17 = arg3.aClass189Array1[arg0];
		@Pc(20) Class3_Sub45 local20 = local17.aClass3_Sub45_1;
		@Pc(22) Class189 local22 = null;
		if (arg7 != null) {
			local22 = arg7.aClass189Array1[arg5];
			if (local20 != local22.aClass3_Sub45_1) {
				local22 = null;
			}
		}
		this.method5790(local22, arg4, arg6, arg1, false, local17, arg2, local20, null, 65535, null);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method5770(@OriginalArg(0) Class205 arg0);

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
	protected abstract boolean Q();

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public abstract Class3_Sub10_Sub18 Z(@OriginalArg(0) Class3_Sub10_Sub18 arg0);

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
	protected abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!sda;II)V")
	public abstract void method5772(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
	public abstract int h();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[III[IZIIII)V")
	private void method5773(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(19) int local19;
		if (arg0 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local19 = -arg3;
				arg3 = arg6;
				arg6 = local19;
			} else if (arg7 == 3) {
				local19 = arg3;
				arg3 = arg6;
				arg6 = local19;
			} else if (arg7 == 2) {
				local19 = arg3;
				arg3 = -arg6 & 0x3FFF;
				arg6 = local19 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg6 = -arg6;
				arg3 = -arg3;
			} else if (arg7 == 2) {
				arg3 = -arg3 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local19 = arg3;
				arg3 = -arg6;
				arg6 = local19;
			} else if (arg7 == 3) {
				local19 = arg3;
				arg3 = arg6;
				arg6 = local19;
			} else if (arg7 == 2) {
				local19 = arg3;
				arg3 = arg6 & 0x3FFF;
				arg6 = -local19 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.E(arg7, arg4, arg3, arg8, arg6, arg0, arg5);
		} else {
			this.da(arg7, arg4, arg3, arg8, arg6, arg5, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!sda;I)V")
	public abstract void method5774(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lclient!ba;")
	public abstract Class2 method5775(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!gea;IZILclient!gea;II[IIIZ)V")
	public final void method5776(@OriginalArg(0) Class3_Sub10_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class3_Sub10_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == -1 || !this.Q()) {
			return;
		}
		@Pc(17) Class189 local17 = arg3.aClass189Array1[arg4];
		@Pc(20) Class3_Sub45 local20 = local17.aClass3_Sub45_1;
		@Pc(22) Class189 local22 = null;
		if (arg0 != null) {
			local22 = arg0.aClass189Array1[arg7];
			if (local22.aClass3_Sub45_1 != local20) {
				local22 = null;
			}
		}
		this.method5790(local22, arg8, arg1, arg2, false, local17, 0, local20, arg6, arg5, null);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!gea;BI)V")
	public final void method5777(@OriginalArg(0) Class3_Sub10_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.Q()) {
			return;
		}
		@Pc(25) Class189 local25 = arg0.aClass189Array1[arg1];
		@Pc(28) Class3_Sub45 local28 = local25.aClass3_Sub45_1;
		for (@Pc(30) int local30 = 0; local30 < local25.anInt5904; local30++) {
			@Pc(37) short local37 = local25.aShortArray111[local30];
			if (local28.aBooleanArray41[local37]) {
				if (local25.aShortArray117[local30] != -1) {
					this.ua(0, 0, 0, 0);
				}
				this.ua(local28.anIntArray708[local37], local25.aShortArray112[local30], local25.aShortArray113[local30], local25.aShortArray119[local30]);
			}
		}
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
	public abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
	protected abstract void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()[Lclient!fca;")
	public abstract Class83[] method5778();

	@OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) Class52 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
	public abstract void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
	public abstract int F();

	@OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	public abstract void method5781(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public abstract void method5782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
	public abstract void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
	public abstract int LA();

	@OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
	public abstract int ha();

	@OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
	public abstract void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!gea;IIILclient!gea;IIIZ[ZLclient!gea;IILclient!gea;Z)V")
	public final void method5784(@OriginalArg(0) Class3_Sub10_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub10_Sub6 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) Class3_Sub10_Sub6 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class3_Sub10_Sub6 arg12, @OriginalArg(14) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg8 == null || arg7 == -1) {
			this.method5769(arg1, arg13, 0, arg12, arg2, arg10, arg5, arg0);
		} else if (this.Q()) {
			@Pc(33) Class189 local33 = arg12.aClass189Array1[arg1];
			@Pc(36) Class3_Sub45 local36 = local33.aClass3_Sub45_1;
			@Pc(38) Class189 local38 = null;
			if (arg0 != null) {
				local38 = arg0.aClass189Array1[arg10];
				if (local36 != local38.aClass3_Sub45_1) {
					local38 = null;
				}
			}
			this.method5790(local38, arg2, arg5, arg13, false, local33, 0, local36, null, 65535, arg8);
			@Pc(70) Class189 local70 = arg4.aClass189Array1[arg7];
			@Pc(72) Class189 local72 = null;
			if (arg9 != null) {
				local72 = arg9.aClass189Array1[arg3];
				if (local36 != local72.aClass3_Sub45_1) {
					local72 = null;
				}
			}
			this.E(0, new int[0], 0, 0, 0, 0, arg13);
			this.method5790(local72, arg6, arg11, arg13, true, local70, 0, local70.aClass3_Sub45_1, null, 65535, arg8);
			this.Y();
		}
	}

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
	public abstract void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
	public abstract int u();

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()V")
	public abstract void method5785();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
	public abstract void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!d;IIIIIII)V")
	protected final void method5787(@OriginalArg(1) Class52 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg7 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(30) int local30 = arg0.sa(local16 + arg6, local21 + arg2);
		@Pc(34) int local34 = arg7 / 2;
		@Pc(39) int local39 = -arg1 / 2;
		@Pc(48) int local48 = arg0.sa(arg6 + local34, local39 + arg2);
		@Pc(53) int local53 = -arg7 / 2;
		@Pc(57) int local57 = arg1 / 2;
		@Pc(66) int local66 = arg0.sa(local53 + arg6, local57 + arg2);
		@Pc(70) int local70 = arg7 / 2;
		@Pc(74) int local74 = arg1 / 2;
		@Pc(83) int local83 = arg0.sa(local70 + arg6, local74 + arg2);
		@Pc(94) int local94 = local30 >= local48 ? local48 : local30;
		@Pc(105) int local105 = local83 <= local66 ? local83 : local66;
		@Pc(112) int local112 = local48 < local83 ? local48 : local83;
		@Pc(119) int local119 = local66 <= local30 ? local66 : local30;
		@Pc(162) int local162;
		if (arg1 != 0) {
			@Pc(137) int local137 = (int) (Math.atan2((double) (local94 - local105), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local137 != 0) {
				if (arg4 != 0) {
					if (local137 > 8192) {
						local162 = 16384 - arg4;
						if (local137 < local162) {
							local137 = local162;
						}
					} else if (arg4 < local137) {
						local137 = arg4;
					}
				}
				this.AA(local137);
			}
		}
		@Pc(179) int local179 = local30 + local83;
		if (arg7 != 0) {
			@Pc(197) int local197 = (int) (Math.atan2((double) (local119 - local112), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local197 != 0) {
				if (arg5 != 0) {
					if (local197 > 8192) {
						local162 = 16384 - arg5;
						if (local197 < local162) {
							local197 = local162;
						}
					} else if (local197 > arg5) {
						local197 = arg5;
					}
				}
				this.v(local197);
			}
		}
		if (local48 + local66 < local179) {
			local179 = local66 + local48;
		}
		local179 = (local179 >> 1) - arg3;
		if (local179 != 0) {
			this.m(0, local179, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
	protected abstract void Y();

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()Z")
	public abstract boolean method5788();

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()[Lclient!gl;")
	public abstract Class109[] method5789();

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
	public abstract void P();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!mc;IIZZLclient!mc;BILclient!sv;[II[Z)V")
	private void method5790(@OriginalArg(0) Class189 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class189 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub45 arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(14) int local14;
		if (arg0 == null || arg1 == 0) {
			for (local14 = 0; local14 < arg5.anInt5904; local14++) {
				@Pc(21) short local21 = arg5.aShortArray111[local14];
				if (arg10 == null || arg10[local21] == arg4 || arg7.anIntArray708[local21] == 0) {
					@Pc(49) short local49 = arg5.aShortArray117[local14];
					if (local49 != -1) {
						this.method5773(arg6, arg8, arg7.anIntArray709[local49] & arg9, 0, arg7.anIntArrayArray79[local49], arg3, 0, 0, 0);
					}
					this.method5773(arg6, arg8, arg7.anIntArray709[local21] & arg9, arg5.aShortArray112[local14], arg7.anIntArrayArray79[local21], arg3, arg5.aShortArray119[local14], arg7.anIntArray708[local21], arg5.aShortArray113[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(122) int local122 = 0;
		for (@Pc(124) int local124 = 0; local124 < arg7.anInt8243; local124++) {
			@Pc(128) boolean local128 = false;
			if (local14 < arg5.anInt5904 && local124 == arg5.aShortArray111[local14]) {
				local128 = true;
			}
			@Pc(146) boolean local146 = false;
			if (arg0.anInt5904 > local122 && local124 == arg0.aShortArray111[local122]) {
				local146 = true;
			}
			if (local128 || local146) {
				if (arg10 == null || arg4 == arg10[local124] || arg7.anIntArray708[local124] == 0) {
					@Pc(187) short local187 = 0;
					@Pc(192) int local192 = arg7.anIntArray708[local124];
					if (local192 == 3 || local192 == 10) {
						local187 = 128;
					}
					@Pc(210) short local210;
					@Pc(206) short local206;
					@Pc(212) short local212;
					@Pc(214) short local214;
					@Pc(208) byte local208;
					if (local128) {
						local206 = arg5.aShortArray113[local14];
						local214 = arg5.aShortArray117[local14];
						local210 = arg5.aShortArray112[local14];
						local208 = arg5.aByteArray55[local14];
						local212 = arg5.aShortArray119[local14];
						local14++;
					} else {
						local206 = local187;
						local208 = 0;
						local210 = local187;
						local212 = local187;
						local214 = -1;
					}
					@Pc(246) short local246;
					@Pc(252) short local252;
					@Pc(254) short local254;
					@Pc(250) short local250;
					@Pc(248) byte local248;
					if (local146) {
						local252 = arg0.aShortArray113[local122];
						local250 = arg0.aShortArray117[local122];
						local248 = arg0.aByteArray55[local122];
						local246 = arg0.aShortArray112[local122];
						local254 = arg0.aShortArray119[local122];
						local122++;
					} else {
						local246 = local187;
						local248 = 0;
						local250 = -1;
						local252 = local187;
						local254 = local187;
					}
					if (local214 != -1) {
						this.method5773(arg6, arg8, arg9 & arg7.anIntArray709[local214], 0, arg7.anIntArrayArray79[local214], arg3, 0, 0, 0);
					} else if (local250 != -1) {
						this.method5773(arg6, arg8, arg7.anIntArray709[local250] & arg9, 0, arg7.anIntArrayArray79[local250], arg3, 0, 0, 0);
					}
					@Pc(347) int local347;
					@Pc(349) int local349;
					@Pc(345) int local345;
					if ((local208 & 0x2) == 0 && (local248 & 0x1) == 0) {
						@Pc(361) int local361;
						if (local192 == 2) {
							local361 = local246 - local210 & 0x3FFF;
							@Pc(368) int local368 = local252 - local206 & 0x3FFF;
							if (local368 >= 8192) {
								local368 -= 16384;
							}
							@Pc(380) int local380 = local254 - local212 & 0x3FFF;
							if (local361 >= 8192) {
								local361 -= 16384;
							}
							local349 = local368 * arg1 / arg2 + local206 & 0x3FFF;
							if (local380 >= 8192) {
								local380 -= 16384;
							}
							local347 = local210 + arg1 * local361 / arg2 & 0x3FFF;
							local345 = local212 + arg1 * local380 / arg2 & 0x3FFF;
						} else if (local192 == 9) {
							local361 = local246 - local210 & 0x3FFF;
							if (local361 >= 8192) {
								local361 -= 16384;
							}
							local347 = arg1 * local361 / arg2 + local210 & 0x3FFF;
							local345 = 0;
							local349 = 0;
						} else if (local192 == 7) {
							local361 = local246 - local210 & 0x3F;
							if (local361 >= 32) {
								local361 -= 64;
							}
							local349 = (local252 - local206) * arg1 / arg2 + local206;
							local345 = (local254 - local212) * arg1 / arg2 + local212;
							local347 = local210 + local361 * arg1 / arg2 & 0x3F;
						} else {
							local349 = local206 + arg1 * (local252 - local206) / arg2;
							local345 = local212 + arg1 * (local254 - local212) / arg2;
							local347 = local210 + arg1 * (local246 - local210) / arg2;
						}
					} else {
						local345 = local212;
						local347 = local210;
						local349 = local206;
					}
					this.method5773(arg6, arg8, arg7.anIntArray709[local124] & arg9, local347, arg7.anIntArrayArray79[local124], arg3, local345, local192, local349);
				} else {
					if (local128) {
						local14++;
					}
					if (local146) {
						local122++;
					}
				}
			}
		}
	}
}
