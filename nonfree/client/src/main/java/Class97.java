import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class97 {

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	protected Class97() {
	}

	@OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public abstract Class1_Sub2_Sub2 EA(@OriginalArg(0) Class1_Sub2_Sub2 arg0);

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
	protected abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
	public abstract void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()[Lclient!fr;")
	public abstract Class106[] method6767();

	@OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
	public abstract int ga();

	@OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIILclient!sba;Lclient!sba;ZII[I)V")
	public final void method6768(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class1_Sub2_Sub17 arg3, @OriginalArg(6) Class1_Sub2_Sub17 arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8) {
		if (arg2 == -1 || !this.sa()) {
			return;
		}
		@Pc(16) Class77 local16 = arg3.aClass77Array1[arg2];
		@Pc(19) Class1_Sub7 local19 = local16.aClass1_Sub7_1;
		@Pc(26) Class77 local26 = null;
		if (arg4 != null) {
			local26 = arg4.aClass77Array1[arg6];
			if (local26.aClass1_Sub7_1 != local19) {
				local26 = null;
			}
		}
		this.method6783(arg1, local26, local16, arg0, null, arg8, false, 0, arg7, arg5, local19);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
	public abstract void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
	public abstract int wa();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	public abstract void method6769(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
	public abstract int va();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lclient!r;")
	public abstract Class97 method6770(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZZI[IIIII[I)V")
	private void method6771(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(35) int local35;
		if (arg6 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local35 = -arg7;
				arg7 = arg4;
				arg4 = local35;
			} else if (arg0 == 3) {
				local35 = arg7;
				arg7 = arg4;
				arg4 = local35;
			} else if (arg0 == 2) {
				local35 = arg7;
				arg7 = -arg4 & 0x3FFF;
				arg4 = local35 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg4 = -arg4;
				arg7 = -arg7;
			} else if (arg0 == 2) {
				arg7 = -arg7 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local35 = arg7;
				arg7 = -arg4;
				arg4 = local35;
			} else if (arg0 == 3) {
				local35 = arg7;
				arg7 = arg4;
				arg4 = local35;
			} else if (arg0 == 2) {
				local35 = arg7;
				arg7 = arg4 & 0x3FFF;
				arg4 = -local35 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.ea(arg0, arg3, arg7, arg5, arg4, arg6, arg1);
		} else {
			this.BA(arg0, arg3, arg7, arg5, arg4, arg1, arg2, arg8);
		}
	}

	@OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
	public abstract void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
	public abstract void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!sba;IIIZILclient!sba;II)V")
	public final void method6772(@OriginalArg(0) Class1_Sub2_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub2_Sub17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 == -1 || !this.sa()) {
			return;
		}
		@Pc(18) Class77 local18 = arg5.aClass77Array1[arg1];
		@Pc(21) Class1_Sub7 local21 = local18.aClass1_Sub7_1;
		@Pc(23) Class77 local23 = null;
		if (arg0 != null) {
			local23 = arg0.aClass77Array1[arg4];
			if (local21 != local23.aClass1_Sub7_1) {
				local23 = null;
			}
		}
		this.method6783(65535, local23, local18, arg7, null, null, false, arg2, arg6, arg3, local21);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!cf;I)V")
	public abstract void method6773(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
	public abstract void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILclient!sa;II)V")
	protected final void method6774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class7 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg6 / 2;
		@Pc(21) int local21 = -arg3 / 2;
		@Pc(30) int local30 = arg5.aa(arg4 + local16, local21 + arg2);
		@Pc(34) int local34 = arg6 / 2;
		@Pc(39) int local39 = -arg3 / 2;
		@Pc(49) int local49 = arg5.aa(local34 + arg4, arg2 - -local39);
		@Pc(54) int local54 = -arg6 / 2;
		@Pc(58) int local58 = arg3 / 2;
		@Pc(67) int local67 = arg5.aa(local54 + arg4, local58 + arg2);
		@Pc(71) int local71 = arg6 / 2;
		@Pc(75) int local75 = arg3 / 2;
		@Pc(84) int local84 = arg5.aa(local71 + arg4, local75 + arg2);
		@Pc(95) int local95 = local49 > local30 ? local30 : local49;
		@Pc(102) int local102 = local84 > local67 ? local67 : local84;
		@Pc(113) int local113 = local49 >= local84 ? local84 : local49;
		@Pc(124) int local124 = local67 > local30 ? local30 : local67;
		@Pc(157) int local157;
		if (arg3 != 0) {
			@Pc(143) int local143 = (int) (Math.atan2((double) (local95 - local102), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local143 != 0) {
				if (arg1 != 0) {
					if (local143 > 8192) {
						local157 = 16384 - arg1;
						if (local157 > local143) {
							local143 = local157;
						}
					} else if (arg1 < local143) {
						local143 = arg1;
					}
				}
				this.D(local143);
			}
		}
		@Pc(180) int local180 = local30 + local84;
		if (arg6 != 0) {
			@Pc(195) int local195 = (int) (Math.atan2((double) (local124 - local113), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local195 != 0) {
				if (arg0 != 0) {
					if (local195 > 8192) {
						local157 = 16384 - arg0;
						if (local195 < local157) {
							local195 = local157;
						}
					} else if (local195 > arg0) {
						local195 = arg0;
					}
				}
				this.b(local195);
			}
		}
		if (local67 + local49 < local180) {
			local180 = local49 + local67;
		}
		local180 = (local180 >> 1) - arg7;
		if (local180 != 0) {
			this.ca(0, local180, 0);
		}
	}

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
	public abstract void X();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
	public abstract int e();

	@OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
	protected abstract boolean sa();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!sba;IIIIIII[ZZILclient!sba;Lclient!sba;Lclient!sba;I)V")
	public final void method6775(@OriginalArg(0) Class1_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class1_Sub2_Sub17 arg10, @OriginalArg(12) Class1_Sub2_Sub17 arg11, @OriginalArg(13) Class1_Sub2_Sub17 arg12, @OriginalArg(14) int arg13) {
		if (arg4 == -1) {
			return;
		}
		if (arg7 == null || arg9 == -1) {
			this.method6772(arg0, arg4, 0, arg8, arg5, arg12, arg1, arg3);
		} else if (this.sa()) {
			@Pc(35) Class77 local35 = arg12.aClass77Array1[arg4];
			@Pc(38) Class1_Sub7 local38 = local35.aClass1_Sub7_1;
			@Pc(40) Class77 local40 = null;
			if (arg0 != null) {
				local40 = arg0.aClass77Array1[arg5];
				if (local40.aClass1_Sub7_1 != local38) {
					local40 = null;
				}
			}
			this.method6783(65535, local40, local35, arg3, arg7, null, false, 0, arg1, arg8, local38);
			@Pc(77) Class77 local77 = arg11.aClass77Array1[arg9];
			@Pc(79) Class77 local79 = null;
			if (arg10 != null) {
				local79 = arg10.aClass77Array1[arg6];
				if (local38 != local79.aClass1_Sub7_1) {
					local79 = null;
				}
			}
			this.ea(0, new int[0], 0, 0, 0, 0, arg8);
			this.method6783(65535, local79, local77, arg13, arg7, null, true, 0, arg2, arg8, local77.aClass1_Sub7_1);
			this.MA();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()V")
	public abstract void method6777();

	@OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!cf;II)V")
	public abstract void method6778(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class46_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!sba;)V")
	public final void method6780(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub17 arg1) {
		if (arg0 == -1 || !this.sa()) {
			return;
		}
		@Pc(18) Class77 local18 = arg1.aClass77Array1[arg0];
		@Pc(21) Class1_Sub7 local21 = local18.aClass1_Sub7_1;
		for (@Pc(27) int local27 = 0; local27 < local18.anInt2092; local27++) {
			@Pc(34) short local34 = local18.aShortArray27[local27];
			if (local21.aBooleanArray1[local34]) {
				if (local18.aShortArray35[local27] != -1) {
					this.l(0, 0, 0, 0);
				}
				this.l(local21.anIntArray96[local34], local18.aShortArray32[local27], local18.aShortArray30[local27], local18.aShortArray36[local27]);
			}
		}
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
	protected abstract void MA();

	@OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()[Lclient!dl;")
	public abstract Class68[] method6782();

	@OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public abstract void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!eaa;Lclient!eaa;I[Z[IZIIZBLclient!cda;)V")
	private void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(11) Class1_Sub7 arg10) {
		@Pc(11) int local11;
		if (arg1 == null || arg8 == 0) {
			for (local11 = 0; local11 < arg2.anInt2092; local11++) {
				@Pc(18) short local18 = arg2.aShortArray27[local11];
				if (arg4 == null || arg4[local18] == arg6 || arg10.anIntArray96[local18] == 0) {
					@Pc(43) short local43 = arg2.aShortArray35[local11];
					if (local43 != -1) {
						this.method6771(0, arg9, arg10.anIntArray95[local43] & arg0, arg10.anIntArrayArray11[local43], 0, 0, arg7, 0, arg5);
					}
					this.method6771(arg10.anIntArray96[local18], arg9, arg10.anIntArray95[local18] & arg0, arg10.anIntArrayArray11[local18], arg2.aShortArray36[local11], arg2.aShortArray30[local11], arg7, arg2.aShortArray32[local11], arg5);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(109) int local109 = 0;
		for (@Pc(115) int local115 = 0; local115 < arg10.anInt1416; local115++) {
			@Pc(119) boolean local119 = false;
			if (arg2.anInt2092 > local11 && arg2.aShortArray27[local11] == local115) {
				local119 = true;
			}
			@Pc(137) boolean local137 = false;
			if (local109 < arg1.anInt2092 && local115 == arg1.aShortArray27[local109]) {
				local137 = true;
			}
			if (local119 || local137) {
				if (arg4 == null || arg4[local115] == arg6 || arg10.anIntArray96[local115] == 0) {
					@Pc(186) short local186 = 0;
					@Pc(191) int local191 = arg10.anIntArray96[local115];
					if (local191 == 3 || local191 == 10) {
						local186 = 128;
					}
					@Pc(209) short local209;
					@Pc(207) short local207;
					@Pc(203) short local203;
					@Pc(211) short local211;
					@Pc(205) byte local205;
					if (local119) {
						local205 = arg2.aByteArray20[local11];
						local209 = arg2.aShortArray32[local11];
						local207 = arg2.aShortArray30[local11];
						local211 = arg2.aShortArray35[local11];
						local203 = arg2.aShortArray36[local11];
						local11++;
					} else {
						local203 = local186;
						local205 = 0;
						local207 = local186;
						local209 = local186;
						local211 = -1;
					}
					@Pc(266) short local266;
					@Pc(251) short local251;
					@Pc(256) short local256;
					@Pc(246) short local246;
					@Pc(261) byte local261;
					if (local137) {
						local246 = arg1.aShortArray35[local109];
						local251 = arg1.aShortArray30[local109];
						local256 = arg1.aShortArray36[local109];
						local261 = arg1.aByteArray20[local109];
						local266 = arg1.aShortArray32[local109];
						local109++;
					} else {
						local266 = local186;
						local261 = 0;
						local251 = local186;
						local246 = -1;
						local256 = local186;
					}
					if (local211 != -1) {
						this.method6771(0, arg9, arg0 & arg10.anIntArray95[local211], arg10.anIntArrayArray11[local211], 0, 0, arg7, 0, arg5);
					} else if (local246 != -1) {
						this.method6771(0, arg9, arg10.anIntArray95[local246] & arg0, arg10.anIntArrayArray11[local246], 0, 0, arg7, 0, arg5);
					}
					@Pc(343) int local343;
					@Pc(345) int local345;
					@Pc(341) int local341;
					if ((local205 & 0x2) == 0 && (local261 & 0x1) == 0) {
						@Pc(357) int local357;
						if (local191 == 2) {
							local357 = local266 - local209 & 0x3FFF;
							@Pc(363) int local363 = local251 - local207 & 0x3FFF;
							if (local363 >= 8192) {
								local363 -= 16384;
							}
							@Pc(376) int local376 = local256 - local203 & 0x3FFF;
							if (local357 >= 8192) {
								local357 -= 16384;
							}
							local343 = local357 * arg8 / arg3 + local209 & 0x3FFF;
							local345 = arg8 * local363 / arg3 + local207 & 0x3FFF;
							if (local376 >= 8192) {
								local376 -= 16384;
							}
							local341 = local203 + arg8 * local376 / arg3 & 0x3FFF;
						} else if (local191 == 9) {
							local357 = local266 - local209 & 0x3FFF;
							if (local357 >= 8192) {
								local357 -= 16384;
							}
							local343 = local209 + local357 * arg8 / arg3 & 0x3FFF;
							local341 = 0;
							local345 = 0;
						} else if (local191 == 7) {
							local357 = local266 - local209 & 0x3F;
							if (local357 >= 32) {
								local357 -= 64;
							}
							local341 = local203 + (local256 - local203) * arg8 / arg3;
							local345 = local207 + arg8 * (local251 - local207) / arg3;
							local343 = local209 + local357 * arg8 / arg3 & 0x3F;
						} else {
							local341 = arg8 * (local256 - local203) / arg3 + local203;
							local343 = local209 + (local266 - local209) * arg8 / arg3;
							local345 = (local251 - local207) * arg8 / arg3 + local207;
						}
					} else {
						local341 = local203;
						local343 = local209;
						local345 = local207;
					}
					this.method6771(local191, arg9, arg0 & arg10.anIntArray95[local115], arg10.anIntArrayArray11[local115], local341, local345, arg7, local343, arg5);
				} else {
					if (local119) {
						local11++;
					}
					if (local137) {
						local109++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
	public abstract boolean method6784();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!m;Z)Z")
	public abstract boolean method6785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();
}
