import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public abstract class Class78 {

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	protected Class78() {
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()I")
	public abstract int method4619();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!nc;IIII)V")
	protected final void method4620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg1 / 2;
		@Pc(19) int local19 = -arg5 / 2;
		@Pc(28) int local28 = arg2.method5717(local14 + arg0, arg4 + local19);
		@Pc(37) int local37 = arg1 / 2;
		@Pc(42) int local42 = -arg5 / 2;
		@Pc(51) int local51 = arg2.method5717(arg0 + local37, local42 + arg4);
		@Pc(56) int local56 = -arg1 / 2;
		@Pc(60) int local60 = arg5 / 2;
		@Pc(69) int local69 = arg2.method5717(arg0 + local56, local60 + arg4);
		@Pc(73) int local73 = arg1 / 2;
		@Pc(77) int local77 = arg5 / 2;
		@Pc(86) int local86 = arg2.method5717(local73 + arg0, local77 + arg4);
		@Pc(97) int local97 = local28 >= local51 ? local51 : local28;
		@Pc(104) int local104 = local69 < local86 ? local69 : local86;
		@Pc(111) int local111 = local86 > local51 ? local51 : local86;
		if (arg5 != 0) {
			@Pc(130) int local130 = (int) (Math.atan2((double) (local97 - local104), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local130 != 0) {
				this.method4651(local130);
			}
		}
		@Pc(146) int local146 = local69 <= local28 ? local69 : local28;
		@Pc(151) int local151 = local28 + local86;
		if (arg1 != 0) {
			@Pc(170) int local170 = (int) (Math.atan2((double) (local146 - local111), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local170 != 0) {
				this.method4658(local170);
			}
		}
		if (local151 > local51 + local69) {
			local151 = local69 + local51;
		}
		local151 = (local151 >> 1) - arg3;
		if (local151 != 0) {
			this.method4641(0, local151, 0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "()I")
	public abstract int method4621();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!b;BI[ZIIZZLclient!q;ILclient!q;[I)V")
	private void method4622(@OriginalArg(0) Class6_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class164 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class164 arg9, @OriginalArg(11) int[] arg10) {
		@Pc(14) int local14;
		if (arg7 == null || arg3 == 0) {
			for (local14 = 0; local14 < arg9.anInt4664; local14++) {
				@Pc(21) short local21 = arg9.aShortArray86[local14];
				if (arg2 == null || arg6 == arg2[local21] || arg0.anIntArray31[local21] == 0) {
					@Pc(41) short local41 = arg9.aShortArray84[local14];
					if (local41 != -1) {
						this.method4631(0, arg8, 0, 0, 0, arg0.anIntArrayArray19[local41], arg10, arg5, arg4 & arg0.anIntArray29[local41]);
					}
					this.method4631(arg9.aShortArray85[local14], arg8, arg9.aShortArray78[local14], arg9.aShortArray82[local14], arg0.anIntArray31[local21], arg0.anIntArrayArray19[local21], arg10, arg5, arg4 & arg0.anIntArray29[local21]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(106) int local106 = 0;
		for (@Pc(108) int local108 = 0; local108 < arg0.anInt306; local108++) {
			@Pc(117) boolean local117 = false;
			if (local14 < arg9.anInt4664 && local108 == arg9.aShortArray86[local14]) {
				local117 = true;
			}
			@Pc(135) boolean local135 = false;
			if (arg7.anInt4664 > local106 && arg7.aShortArray86[local106] == local108) {
				local135 = true;
			}
			if (local117 || local135) {
				if (arg2 == null || arg6 == arg2[local108] || arg0.anIntArray31[local108] == 0) {
					@Pc(188) short local188 = 0;
					@Pc(193) int local193 = arg0.anIntArray31[local108];
					if (local193 == 3) {
						local188 = 128;
					}
					@Pc(204) short local204;
					@Pc(202) short local202;
					@Pc(210) short local210;
					@Pc(208) short local208;
					@Pc(206) byte local206;
					if (local117) {
						local202 = arg9.aShortArray82[local14];
						local204 = arg9.aShortArray85[local14];
						local208 = arg9.aShortArray84[local14];
						local206 = arg9.aByteArray75[local14];
						local210 = arg9.aShortArray78[local14];
						local14++;
					} else {
						local202 = local188;
						local204 = local188;
						local206 = 0;
						local208 = -1;
						local210 = local188;
					}
					@Pc(250) short local250;
					@Pc(265) short local265;
					@Pc(255) short local255;
					@Pc(245) short local245;
					@Pc(260) byte local260;
					if (local135) {
						local245 = arg7.aShortArray84[local106];
						local250 = arg7.aShortArray85[local106];
						local255 = arg7.aShortArray78[local106];
						local260 = arg7.aByteArray75[local106];
						local265 = arg7.aShortArray82[local106];
						local106++;
					} else {
						local255 = local188;
						local245 = -1;
						local260 = 0;
						local250 = local188;
						local265 = local188;
					}
					if (local208 != -1) {
						this.method4631(0, arg8, 0, 0, 0, arg0.anIntArrayArray19[local208], arg10, arg5, arg4 & arg0.anIntArray29[local208]);
					} else if (local245 != -1) {
						this.method4631(0, arg8, 0, 0, 0, arg0.anIntArrayArray19[local245], arg10, arg5, arg4 & arg0.anIntArray29[local245]);
					}
					@Pc(337) int local337;
					@Pc(339) int local339;
					@Pc(341) int local341;
					if ((local206 & 0x2) == 0 && (local260 & 0x1) == 0) {
						@Pc(355) int local355;
						if (local193 == 2) {
							local355 = local250 - local204 & 0x3FFF;
							@Pc(362) int local362 = local265 - local202 & 0x3FFF;
							if (local355 >= 8192) {
								local355 -= 16384;
							}
							if (local362 >= 8192) {
								local362 -= 16384;
							}
							@Pc(377) int local377 = local255 - local210 & 0x3FFF;
							local337 = local204 + local355 * arg3 / arg1 & 0x3FFF;
							if (local377 >= 8192) {
								local377 -= 16384;
							}
							local339 = local202 + arg3 * local362 / arg1 & 0x3FFF;
							local341 = local377 * arg3 / arg1 + local210 & 0x3FFF;
						} else if (local193 == 7) {
							local355 = local250 - local204 & 0x3F;
							if (local355 >= 32) {
								local355 -= 64;
							}
							local339 = (local265 - local202) * arg3 / arg1 + local202;
							local341 = local210 + arg3 * (local255 - local210) / arg1;
							local337 = arg3 * local355 / arg1 + local204 & 0x3F;
						} else {
							local337 = arg3 * (local250 - local204) / arg1 + local204;
							local339 = arg3 * (local265 - local202) / arg1 + local202;
							local341 = (local255 - local210) * arg3 / arg1 + local210;
						}
					} else {
						local337 = local204;
						local339 = local202;
						local341 = local210;
					}
					this.method4631(local337, arg8, local341, local339, local193, arg0.anIntArrayArray19[local108], arg10, arg5, arg0.anIntArray29[local108] & arg4);
				} else {
					if (local117) {
						local14++;
					}
					if (local135) {
						local106++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "()I")
	public abstract int method4623();

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
	public abstract void method4624(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([ZIIIILclient!kf;ZLclient!kf;ILclient!kf;IBLclient!kf;II)V")
	public final void method4625(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub2_Sub9 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) Class6_Sub2_Sub9 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class6_Sub2_Sub9 arg9, @OriginalArg(10) int arg10, @OriginalArg(12) Class6_Sub2_Sub9 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg0 == null || arg1 == -1) {
			this.method4628(arg9, arg3, arg4, arg6, arg7, 0, arg10, arg2);
		} else if (this.method4637()) {
			@Pc(40) Class164 local40 = arg9.aClass164Array1[arg2];
			@Pc(43) Class6_Sub4 local43 = local40.aClass6_Sub4_1;
			@Pc(45) Class164 local45 = null;
			if (arg7 != null) {
				local45 = arg7.aClass164Array1[arg3];
				if (local43 != local45.aClass6_Sub4_1) {
					local45 = null;
				}
			}
			@Pc(63) Class164 local63 = arg11.aClass164Array1[arg1];
			@Pc(65) Class164 local65 = null;
			if (arg5 != null) {
				local65 = arg5.aClass164Array1[arg8];
				if (local43 != local65.aClass6_Sub4_1) {
					local65 = null;
				}
			}
			this.method4622(local43, arg4, arg0, arg10, 65535, arg6, false, local45, 0, local40, null);
			this.method4634(0, new int[0], 0, 0, 0, 0, arg6);
			this.method4622(local43, arg12, arg0, arg13, 65535, arg6, true, local65, 0, local63, null);
			this.method4655();
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(SS)V")
	public abstract void method4626(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!rc;IIIZ)V")
	public abstract void method4627(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!kf;IIZILclient!kf;III)V")
	public final void method4628(@OriginalArg(0) Class6_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class6_Sub2_Sub9 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 == -1 || !this.method4637()) {
			return;
		}
		@Pc(17) Class164 local17 = arg0.aClass164Array1[arg7];
		@Pc(25) Class6_Sub4 local25 = local17.aClass6_Sub4_1;
		@Pc(27) Class164 local27 = null;
		if (arg4 != null) {
			local27 = arg4.aClass164Array1[arg1];
			if (local25 != local27.aClass6_Sub4_1) {
				local27 = null;
			}
		}
		this.method4622(local25, arg2, null, arg6, 65535, arg3, false, local27, arg5, local17, null);
		this.method4655();
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "()V")
	public abstract void method4629();

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "()I")
	public abstract int method4630();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII[IZ[IZI)V")
	private void method4631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(31) int local31;
		if (arg1 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local31 = -arg0;
				arg0 = arg2;
				arg2 = local31;
			} else if (arg4 == 3) {
				local31 = arg0;
				arg0 = arg2;
				arg2 = local31;
			} else if (arg4 == 2) {
				local31 = arg0;
				arg0 = -arg2 & 0x3FFF;
				arg2 = local31 & 0x3FFF;
			}
		} else if (arg1 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg2 = -arg2;
				arg0 = -arg0;
			} else if (arg4 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg0 = -arg0 & 0x3FFF;
			}
		} else if (arg1 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local31 = arg0;
				arg0 = -arg2;
				arg2 = local31;
			} else if (arg4 == 3) {
				local31 = arg0;
				arg0 = arg2;
				arg2 = local31;
			} else if (arg4 == 2) {
				local31 = arg0;
				arg0 = arg2 & 0x3FFF;
				arg2 = -local31 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.method4634(arg4, arg5, arg0, arg3, arg2, arg1, arg7);
		} else {
			this.method4659(arg4, arg5, arg0, arg3, arg2, arg7, arg8, arg6);
		}
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "()Z")
	public abstract boolean method4632();

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "()V")
	public abstract void method4633();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	public abstract void method4635(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "()I")
	public abstract int method4636();

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "()Z")
	protected abstract boolean method4637();

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V")
	public abstract void method4638(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "()I")
	public abstract int method4639();

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "()I")
	public abstract int method4640();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)V")
	public abstract void method4641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "()I")
	public abstract int method4642();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!po;Z)Z")
	public abstract boolean method4644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(SS)V")
	public abstract void method4645(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!nc;Lclient!nc;III)V")
	public abstract void method4646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLclient!kf;I)V")
	public final void method4647(@OriginalArg(1) Class6_Sub2_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method4637()) {
			return;
		}
		@Pc(18) Class164 local18 = arg0.aClass164Array1[arg1];
		@Pc(21) Class6_Sub4 local21 = local18.aClass6_Sub4_1;
		for (@Pc(28) int local28 = 0; local28 < local18.anInt4664; local28++) {
			@Pc(35) short local35 = local18.aShortArray86[local28];
			if (local21.aBooleanArray2[local35]) {
				if (local18.aShortArray84[local28] != -1) {
					this.method4660(0, 0, 0, 0);
				}
				this.method4660(local21.anIntArray31[local35], local18.aShortArray85[local28], local18.aShortArray82[local28], local18.aShortArray78[local28]);
			}
		}
		this.method4655();
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
	public abstract void method4648(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!po;Lclient!tc;I)V")
	public abstract void method4649(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class20_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "()[Lclient!bo;")
	public abstract Class22[] method4650();

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	public abstract void method4651(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "()I")
	public abstract int method4652();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!po;Lclient!tc;II)V")
	public abstract void method4653(@OriginalArg(0) Class72 arg0, @OriginalArg(1) Class20_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
	public abstract void method4654(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "()V")
	protected abstract void method4655();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!sr;)Lclient!sr;")
	public abstract Class6_Sub2_Sub17 method4656(@OriginalArg(0) Class6_Sub2_Sub17 arg0);

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V")
	public abstract void method4657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)V")
	public abstract void method4658(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
	protected abstract void method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIZ)Lclient!rc;")
	public abstract Class78 method4661(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "()[Lclient!oo;")
	public abstract Class157[] method4662();

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "()I")
	public abstract int method4663();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!kf;Lclient!kf;[IIIIIIIZ)V")
	public final void method4664(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub9 arg1, @OriginalArg(2) Class6_Sub2_Sub9 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) boolean arg8) {
		if (arg5 == -1 || !this.method4637()) {
			return;
		}
		@Pc(18) Class164 local18 = arg1.aClass164Array1[arg5];
		@Pc(21) Class6_Sub4 local21 = local18.aClass6_Sub4_1;
		@Pc(23) Class164 local23 = null;
		if (arg2 != null) {
			local23 = arg2.aClass164Array1[arg6];
			if (local21 != local23.aClass6_Sub4_1) {
				local23 = null;
			}
		}
		this.method4622(local21, arg4, null, arg0, arg7, arg8, false, local23, 0, local18, arg3);
		this.method4655();
	}
}
