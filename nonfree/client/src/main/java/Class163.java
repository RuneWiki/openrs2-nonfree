import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public abstract class Class163 {

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	protected Class163() {
	}

	@OriginalMember(owner = "client!t", name = "M", descriptor = "(I[IIIIZI[I)V")
	protected abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!qb;II)V")
	public abstract void method4650(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class28_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public abstract void c(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "NA", descriptor = "()I")
	public abstract int NA();

	@OriginalMember(owner = "client!t", name = "D", descriptor = "()I")
	public abstract int D();

	@OriginalMember(owner = "client!t", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!t", name = "R", descriptor = "(I)V")
	public abstract void R(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "JA", descriptor = "(III)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "XA", descriptor = "(I[IIIIIZ)V")
	protected abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!t", name = "BA", descriptor = "(SS)V")
	public abstract void BA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()Z")
	public abstract boolean method4651();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!wg;II)V")
	public final void method4652(@OriginalArg(0) Class7_Sub4_Sub18 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1 || !this.w()) {
			return;
		}
		@Pc(20) Class91 local20 = arg0.aClass91Array1[arg1];
		@Pc(23) Class7_Sub26 local23 = local20.aClass7_Sub26_1;
		for (@Pc(25) int local25 = 0; local25 < local20.anInt2516; local25++) {
			@Pc(32) short local32 = local20.aShortArray45[local25];
			if (local23.aBooleanArray16[local32]) {
				if (local20.aShortArray42[local25] != -1) {
					this.N(0, 0, 0, 0);
				}
				this.N(local23.anIntArray287[local32], local20.aShortArray43[local25], local20.aShortArray40[local25], local20.aShortArray44[local25]);
			}
		}
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(IILclient!ta;Lclient!ta;III)V")
	public abstract void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class165 arg2, @OriginalArg(3) Class165 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method4653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BIZ)Lclient!t;")
	public abstract Class163 method4654(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "(I)V")
	public abstract void Q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "I", descriptor = "(SS)V")
	public abstract void I(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!t", name = "IA", descriptor = "()V")
	public abstract void IA();

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IIII)V")
	public abstract void method4656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!t", name = "N", descriptor = "(IIII)V")
	protected abstract void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!t", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!t", name = "UA", descriptor = "(I)V")
	public abstract void UA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "m", descriptor = "()I")
	public abstract int m();

	@OriginalMember(owner = "client!t", name = "j", descriptor = "()V")
	protected abstract void j();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!t;IIIZ)V")
	public abstract void method4658(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!t", name = "P", descriptor = "()I")
	public abstract int P();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!wg;IILclient!wg;[IIIIII)V")
	public final void method4659(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class7_Sub4_Sub18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class7_Sub4_Sub18 arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg8 == -1 || !this.w()) {
			return;
		}
		@Pc(18) Class91 local18 = arg3.aClass91Array1[arg8];
		@Pc(21) Class7_Sub26 local21 = local18.aClass7_Sub26_1;
		@Pc(23) Class91 local23 = null;
		if (arg1 != null) {
			local23 = arg1.aClass91Array1[arg6];
			if (local21 != local23.aClass7_Sub26_1) {
				local23 = null;
			}
		}
		this.method4662(arg4, arg0, arg5, local21, null, local23, arg2, 0, arg7, false, local18);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IZLclient!wg;ILclient!wg;IIII)V")
	public final void method4660(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class7_Sub4_Sub18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class7_Sub4_Sub18 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 == -1 || !this.w()) {
			return;
		}
		@Pc(16) Class91 local16 = arg1.aClass91Array1[arg5];
		@Pc(19) Class7_Sub26 local19 = local16.aClass7_Sub26_1;
		@Pc(21) Class91 local21 = null;
		if (arg3 != null) {
			local21 = arg3.aClass91Array1[arg6];
			if (local21.aClass7_Sub26_1 != local19) {
				local21 = null;
			}
		}
		this.method4662(null, arg0, 65535, local19, null, local21, arg4, arg2, arg7, false, local16);
		this.j();
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()[Lclient!ng;")
	public abstract Class167[] method4661();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([IZIILclient!ir;[ZLclient!gh;IIIZLclient!gh;)V")
	private void method4662(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class7_Sub26 arg3, @OriginalArg(5) boolean[] arg4, @OriginalArg(6) Class91 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class91 arg10) {
		@Pc(14) int local14;
		if (arg5 == null || arg6 == 0) {
			for (local14 = 0; local14 < arg10.anInt2516; local14++) {
				@Pc(21) short local21 = arg10.aShortArray45[local14];
				if (arg4 == null || arg4[local21] == arg9 || arg3.anIntArray287[local21] == 0) {
					@Pc(42) short local42 = arg10.aShortArray42[local14];
					if (local42 != -1) {
						this.method4669(arg7, arg0, arg3.anIntArray286[local42] & arg2, arg1, 0, 0, 0, arg3.anIntArrayArray26[local42], 0);
					}
					this.method4669(arg7, arg0, arg2 & arg3.anIntArray286[local21], arg1, arg3.anIntArray287[local21], arg10.aShortArray43[local14], arg10.aShortArray40[local14], arg3.anIntArrayArray26[local21], arg10.aShortArray44[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(116) int local116 = 0;
		for (@Pc(118) int local118 = 0; local118 < arg3.anInt3236; local118++) {
			@Pc(122) boolean local122 = false;
			if (arg10.anInt2516 > local14 && local118 == arg10.aShortArray45[local14]) {
				local122 = true;
			}
			@Pc(136) boolean local136 = false;
			if (arg5.anInt2516 > local116 && arg5.aShortArray45[local116] == local118) {
				local136 = true;
			}
			if (local122 || local136) {
				if (arg4 == null || arg4[local118] == arg9 || arg3.anIntArray287[local118] == 0) {
					@Pc(177) short local177 = 0;
					@Pc(182) int local182 = arg3.anIntArray287[local118];
					if (local182 == 3 || local182 == 10) {
						local177 = 128;
					}
					@Pc(200) short local200;
					@Pc(196) short local196;
					@Pc(194) short local194;
					@Pc(202) short local202;
					@Pc(198) byte local198;
					if (local122) {
						local198 = arg10.aByteArray28[local14];
						local202 = arg10.aShortArray42[local14];
						local200 = arg10.aShortArray43[local14];
						local194 = arg10.aShortArray44[local14];
						local196 = arg10.aShortArray40[local14];
						local14++;
					} else {
						local194 = local177;
						local196 = local177;
						local198 = 0;
						local200 = local177;
						local202 = -1;
					}
					@Pc(242) short local242;
					@Pc(238) short local238;
					@Pc(240) short local240;
					@Pc(234) short local234;
					@Pc(236) byte local236;
					if (local136) {
						local238 = arg5.aShortArray40[local116];
						local236 = arg5.aByteArray28[local116];
						local240 = arg5.aShortArray44[local116];
						local242 = arg5.aShortArray43[local116];
						local234 = arg5.aShortArray42[local116];
						local116++;
					} else {
						local234 = -1;
						local236 = 0;
						local238 = local177;
						local240 = local177;
						local242 = local177;
					}
					if (local202 != -1) {
						this.method4669(arg7, arg0, arg2 & arg3.anIntArray286[local202], arg1, 0, 0, 0, arg3.anIntArrayArray26[local202], 0);
					} else if (local234 != -1) {
						this.method4669(arg7, arg0, arg3.anIntArray286[local234] & arg2, arg1, 0, 0, 0, arg3.anIntArrayArray26[local234], 0);
					}
					@Pc(377) int local377;
					@Pc(387) int local387;
					@Pc(397) int local397;
					if ((local198 & 0x2) == 0 && (local236 & 0x1) == 0) {
						@Pc(338) int local338;
						if (local182 == 2) {
							local338 = local242 - local200 & 0x3FFF;
							@Pc(344) int local344 = local238 - local196 & 0x3FFF;
							if (local338 >= 8192) {
								local338 -= 16384;
							}
							@Pc(355) int local355 = local240 - local194 & 0x3FFF;
							if (local344 >= 8192) {
								local344 -= 16384;
							}
							if (local355 >= 8192) {
								local355 -= 16384;
							}
							local377 = arg6 * local338 / arg8 + local200 & 0x3FFF;
							local387 = arg6 * local344 / arg8 + local196 & 0x3FFF;
							local397 = local355 * arg6 / arg8 + local194 & 0x3FFF;
						} else if (local182 == 9) {
							local338 = local242 - local200 & 0x3FFF;
							if (local338 >= 8192) {
								local338 -= 16384;
							}
							local377 = local200 + arg6 * local338 / arg8 & 0x3FFF;
							local397 = 0;
							local387 = 0;
						} else if (local182 == 7) {
							local338 = local242 - local200 & 0x3F;
							if (local338 >= 32) {
								local338 -= 64;
							}
							local397 = arg6 * (local240 - local194) / arg8 + local194;
							local387 = local196 + arg6 * (local238 - local196) / arg8;
							local377 = local200 + local338 * arg6 / arg8 & 0x3F;
						} else {
							local387 = (local238 - local196) * arg6 / arg8 + local196;
							local377 = (local242 - local200) * arg6 / arg8 + local200;
							local397 = local194 + arg6 * (local240 - local194) / arg8;
						}
					} else {
						local387 = local196;
						local377 = local200;
						local397 = local194;
					}
					this.method4669(arg7, arg0, arg2 & arg3.anIntArray286[local118], arg1, local182, local377, local387, arg3.anIntArrayArray26[local118], local397);
				} else {
					if (local122) {
						local14++;
					}
					if (local136) {
						local116++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()[Lclient!dh;")
	public abstract Class52[] method4663();

	@OriginalMember(owner = "client!t", name = "E", descriptor = "(I)V")
	public abstract void E(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!t", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!t", name = "fa", descriptor = "(Lclient!ba;)Lclient!ba;")
	public abstract Class7_Sub4_Sub2 fa(@OriginalArg(0) Class7_Sub4_Sub2 arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!wg;IIZIILclient!wg;ZLclient!wg;Lclient!wg;I[ZIII)V")
	public final void method4664(@OriginalArg(0) Class7_Sub4_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class7_Sub4_Sub18 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class7_Sub4_Sub18 arg7, @OriginalArg(9) Class7_Sub4_Sub18 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg13 == -1) {
			return;
		}
		if (arg10 == null || arg11 == -1) {
			this.method4660(arg6, arg0, 0, arg5, arg3, arg13, arg1, arg12);
		} else if (this.w()) {
			@Pc(35) Class91 local35 = arg0.aClass91Array1[arg13];
			@Pc(38) Class7_Sub26 local38 = local35.aClass7_Sub26_1;
			@Pc(40) Class91 local40 = null;
			if (arg5 != null) {
				local40 = arg5.aClass91Array1[arg1];
				if (local38 != local40.aClass7_Sub26_1) {
					local40 = null;
				}
			}
			this.method4662(null, arg6, 65535, local38, arg10, local40, arg3, 0, arg12, false, local35);
			@Pc(72) Class91 local72 = arg8.aClass91Array1[arg11];
			@Pc(74) Class91 local74 = null;
			if (arg7 != null) {
				local74 = arg7.aClass91Array1[arg4];
				if (local74.aClass7_Sub26_1 != local38) {
					local74 = null;
				}
			}
			this.XA(0, new int[0], 0, 0, 0, 0, arg6);
			this.method4662(null, arg6, 65535, local72.aClass7_Sub26_1, arg10, local74, arg9, 0, arg2, true, local72);
			this.j();
		}
	}

	@OriginalMember(owner = "client!t", name = "aa", descriptor = "(I)V")
	public abstract void aa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!c;Lclient!qb;I)V")
	public abstract void method4667(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class28_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!t", name = "w", descriptor = "()Z")
	protected abstract boolean w();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIILclient!ta;I)V")
	protected final void method4668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class165 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg7 / 2;
		@Pc(21) int local21 = -arg5 / 2;
		@Pc(30) int local30 = arg6.a(local16 + arg4, local21 + arg0);
		@Pc(34) int local34 = arg7 / 2;
		@Pc(39) int local39 = -arg5 / 2;
		@Pc(48) int local48 = arg6.a(local34 + arg4, arg0 + local39);
		@Pc(53) int local53 = -arg7 / 2;
		@Pc(57) int local57 = arg5 / 2;
		@Pc(67) int local67 = arg6.a(arg4 + local53, local57 + arg0);
		@Pc(71) int local71 = arg7 / 2;
		@Pc(75) int local75 = arg5 / 2;
		@Pc(84) int local84 = arg6.a(local71 + arg4, local75 + arg0);
		@Pc(95) int local95 = local30 < local48 ? local30 : local48;
		@Pc(102) int local102 = local84 > local67 ? local67 : local84;
		@Pc(113) int local113 = local84 > local48 ? local48 : local84;
		@Pc(148) int local148;
		if (arg5 != 0) {
			@Pc(132) int local132 = (int) (Math.atan2((double) (local95 - local102), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local132 != 0) {
				if (arg1 != 0) {
					if (local132 > 8192) {
						local148 = 16384 - arg1;
						if (local132 < local148) {
							local132 = local148;
						}
					} else if (arg1 < local132) {
						local132 = arg1;
					}
				}
				this.Z(local132);
			}
		}
		@Pc(174) int local174 = local30 >= local67 ? local67 : local30;
		if (arg7 != 0) {
			@Pc(190) int local190 = (int) (Math.atan2((double) (local174 - local113), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local190 != 0) {
				if (arg2 != 0) {
					if (local190 > 8192) {
						local148 = 16384 - arg2;
						if (local190 < local148) {
							local190 = local148;
						}
					} else if (local190 > arg2) {
						local190 = arg2;
					}
				}
				this.R(local190);
			}
		}
		@Pc(234) int local234 = local30 + local84;
		if (local67 + local48 < local234) {
			local234 = local67 + local48;
		}
		local234 = (local234 >> 1) - arg3;
		if (local234 != 0) {
			this.JA(0, local234, 0);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I[IIZIII[IIB)V")
	private void method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8) {
		@Pc(17) int local17;
		if (arg0 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local17 = -arg5;
				arg5 = arg8;
				arg8 = local17;
			} else if (arg4 == 3) {
				local17 = arg5;
				arg5 = arg8;
				arg8 = local17;
			} else if (arg4 == 2) {
				local17 = arg5;
				arg5 = -arg8 & 0x3FFF;
				arg8 = local17 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg8 = -arg8;
				arg5 = -arg5;
			} else if (arg4 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local17 = arg5;
				arg5 = -arg8;
				arg8 = local17;
			} else if (arg4 == 3) {
				local17 = arg5;
				arg5 = arg8;
				arg8 = local17;
			} else if (arg4 == 2) {
				local17 = arg5;
				arg5 = arg8 & 0x3FFF;
				arg8 = -local17 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.XA(arg4, arg7, arg5, arg6, arg8, arg0, arg3);
		} else {
			this.M(arg4, arg7, arg5, arg6, arg8, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!t", name = "Z", descriptor = "(I)V")
	public abstract void Z(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
	public abstract void method4671();
}
