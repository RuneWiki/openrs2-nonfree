import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public abstract class Class63 {

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	protected Class63() {
	}

	@OriginalMember(owner = "client!r", name = "pa", descriptor = "(SS)V")
	public abstract void pa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!vq;IIIZLclient!vq;[ZZLclient!vq;IIIILclient!vq;I)V")
	public final void method7692(@OriginalArg(0) Class2_Sub13_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub13_Sub18 arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class2_Sub13_Sub18 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class2_Sub13_Sub18 arg12, @OriginalArg(14) int arg13) {
		if (arg13 == -1) {
			return;
		}
		if (arg5 == null || arg3 == -1) {
			this.method7698(arg12, arg6, arg13, 0, arg7, arg2, arg10, arg9);
		} else if (this.sa()) {
			@Pc(35) Class292 local35 = arg12.aClass292Array1[arg13];
			@Pc(38) Class2_Sub49 local38 = local35.aClass2_Sub49_1;
			@Pc(40) Class292 local40 = null;
			if (arg7 != null) {
				local40 = arg7.aClass292Array1[arg9];
				if (local38 != local40.aClass2_Sub49_1) {
					local40 = null;
				}
			}
			this.method7693(arg6, local40, false, local35, arg2, 0, null, 65535, arg10, local38, arg5);
			@Pc(72) Class292 local72 = arg4.aClass292Array1[arg3];
			@Pc(74) Class292 local74 = null;
			if (arg0 != null) {
				local74 = arg0.aClass292Array1[arg1];
				if (local38 != local74.aClass2_Sub49_1) {
					local74 = null;
				}
			}
			this.ea(0, new int[0], 0, 0, 0, 0, arg6);
			this.method7693(arg6, local74, true, local72, arg8, 0, null, 65535, arg11, local72.aClass2_Sub49_1, arg5);
			this.MA();
		}
	}

	@OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
	public abstract void g(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLclient!vaa;ZLclient!vaa;IIB[IIILclient!we;[Z)V")
	private void method7693(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class292 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class2_Sub49 arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(14) int local14;
		if (arg1 == null || arg8 == 0) {
			for (local14 = 0; local14 < arg3.anInt8761; local14++) {
				@Pc(21) short local21 = arg3.aShortArray115[local14];
				if (arg10 == null || arg2 == arg10[local21] || arg9.anIntArray713[local21] == 0) {
					@Pc(45) short local45 = arg3.aShortArray118[local14];
					if (local45 != -1) {
						this.method7704(0, arg5, arg7 & arg9.anIntArray714[local45], arg6, 0, arg9.anIntArrayArray83[local45], 0, arg0, 0);
					}
					this.method7704(arg3.aShortArray119[local14], arg5, arg9.anIntArray714[local21] & arg7, arg6, arg9.anIntArray713[local21], arg9.anIntArrayArray83[local21], arg3.aShortArray120[local14], arg0, arg3.aShortArray123[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(114) int local114 = 0;
		for (@Pc(122) int local122 = 0; local122 < arg9.anInt9260; local122++) {
			@Pc(126) boolean local126 = false;
			if (local14 < arg3.anInt8761 && local122 == arg3.aShortArray115[local14]) {
				local126 = true;
			}
			@Pc(144) boolean local144 = false;
			if (local114 < arg1.anInt8761 && local122 == arg1.aShortArray115[local114]) {
				local144 = true;
			}
			if (local126 || local144) {
				if (arg10 == null || arg10[local122] == arg2 || arg9.anIntArray713[local122] == 0) {
					@Pc(186) short local186 = 0;
					@Pc(191) int local191 = arg9.anIntArray713[local122];
					if (local191 == 3 || local191 == 10) {
						local186 = 128;
					}
					@Pc(205) short local205;
					@Pc(203) short local203;
					@Pc(209) short local209;
					@Pc(207) short local207;
					@Pc(211) byte local211;
					if (local126) {
						local209 = arg3.aShortArray123[local14];
						local203 = arg3.aShortArray119[local14];
						local211 = arg3.aByteArray114[local14];
						local207 = arg3.aShortArray118[local14];
						local205 = arg3.aShortArray120[local14];
						local14++;
					} else {
						local203 = local186;
						local205 = local186;
						local207 = -1;
						local209 = local186;
						local211 = 0;
					}
					@Pc(251) short local251;
					@Pc(266) short local266;
					@Pc(261) short local261;
					@Pc(246) short local246;
					@Pc(256) byte local256;
					if (local144) {
						local246 = arg1.aShortArray118[local114];
						local251 = arg1.aShortArray120[local114];
						local256 = arg1.aByteArray114[local114];
						local261 = arg1.aShortArray123[local114];
						local266 = arg1.aShortArray119[local114];
						local114++;
					} else {
						local256 = 0;
						local246 = -1;
						local251 = local186;
						local266 = local186;
						local261 = local186;
					}
					@Pc(295) int local295;
					@Pc(297) int local297;
					@Pc(299) int local299;
					if ((local211 & 0x2) == 0 && (local256 & 0x1) == 0) {
						@Pc(319) int local319;
						if (local191 == 2) {
							local319 = local251 - local205 & 0x3FFF;
							@Pc(435) int local435 = local266 - local203 & 0x3FFF;
							if (local319 >= 8192) {
								local319 -= 16384;
							}
							@Pc(446) int local446 = local261 - local209 & 0x3FFF;
							if (local435 >= 8192) {
								local435 -= 16384;
							}
							local297 = local203 + local435 * arg8 / arg4 & 0x3FFF;
							if (local446 >= 8192) {
								local446 -= 16384;
							}
							local295 = arg8 * local319 / arg4 + local205 & 0x3FFF;
							local299 = local446 * arg8 / arg4 + local209 & 0x3FFF;
						} else if (local191 == 9) {
							local319 = local251 - local205 & 0x3FFF;
							if (local319 >= 8192) {
								local319 -= 16384;
							}
							local299 = 0;
							local297 = 0;
							local295 = local205 + arg8 * local319 / arg4 & 0x3FFF;
						} else if (local191 == 7) {
							local319 = local251 - local205 & 0x3F;
							if (local319 >= 32) {
								local319 -= 64;
							}
							local299 = (local261 - local209) * arg8 / arg4 + local209;
							local295 = local205 + local319 * arg8 / arg4 & 0x3F;
							local297 = local203 + (local266 - local203) * arg8 / arg4;
						} else {
							local295 = arg8 * (local251 - local205) / arg4 + local205;
							local297 = arg8 * (local266 - local203) / arg4 + local203;
							local299 = local209 + arg8 * (local261 - local209) / arg4;
						}
					} else {
						local295 = local205;
						local297 = local203;
						local299 = local209;
					}
					if (local207 != -1) {
						this.method7704(0, arg5, arg9.anIntArray714[local207] & arg7, arg6, 0, arg9.anIntArrayArray83[local207], 0, arg0, 0);
					} else if (local246 != -1) {
						this.method7704(0, arg5, arg9.anIntArray714[local246] & arg7, arg6, 0, arg9.anIntArrayArray83[local246], 0, arg0, 0);
					}
					this.method7704(local297, arg5, arg7 & arg9.anIntArray714[local122], arg6, local191, arg9.anIntArrayArray83[local122], local295, arg0, local299);
				} else {
					if (local126) {
						local14++;
					}
					if (local144) {
						local114++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(I)V")
	public abstract void m(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public abstract void method7694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "RA", descriptor = "(IILclient!sa;Lclient!sa;III)V")
	public abstract void RA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75 arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!r", name = "q", descriptor = "(I)V")
	public abstract void q(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "MA", descriptor = "()V")
	protected abstract void MA();

	@OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
	public abstract int U();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!sa;IIIIII)V")
	protected final void method7695(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg6 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(30) int local30 = arg1.aa(local16 + arg5, arg3 + local21);
		@Pc(34) int local34 = arg6 / 2;
		@Pc(39) int local39 = -arg7 / 2;
		@Pc(48) int local48 = arg1.aa(local34 + arg5, arg3 + local39);
		@Pc(53) int local53 = -arg6 / 2;
		@Pc(57) int local57 = arg7 / 2;
		@Pc(66) int local66 = arg1.aa(arg5 + local53, local57 + arg3);
		@Pc(70) int local70 = arg6 / 2;
		@Pc(74) int local74 = arg7 / 2;
		@Pc(84) int local84 = arg1.aa(arg5 + local70, local74 + arg3);
		@Pc(99) int local99 = local30 < local48 ? local30 : local48;
		@Pc(110) int local110 = local66 >= local84 ? local84 : local66;
		@Pc(121) int local121 = local48 >= local84 ? local84 : local48;
		@Pc(154) int local154;
		if (arg7 != 0) {
			@Pc(137) int local137 = (int) (Math.atan2((double) (local99 - local110), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local137 != 0) {
				if (arg0 != 0) {
					if (local137 > 8192) {
						local154 = 16384 - arg0;
						if (local137 < local154) {
							local137 = local154;
						}
					} else if (local137 > arg0) {
						local137 = arg0;
					}
				}
				this.D(local137);
			}
		}
		@Pc(180) int local180 = local30 < local66 ? local30 : local66;
		if (arg6 != 0) {
			@Pc(195) int local195 = (int) (Math.atan2((double) (local180 - local121), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local195 != 0) {
				if (arg2 != 0) {
					if (local195 > 8192) {
						local154 = 16384 - arg2;
						if (local195 < local154) {
							local195 = local154;
						}
					} else if (arg2 < local195) {
						local195 = arg2;
					}
				}
				this.b(local195);
			}
		}
		@Pc(238) int local238 = local84 + local30;
		if (local66 + local48 < local238) {
			local238 = local48 + local66;
		}
		local238 = (local238 >> 1) - arg4;
		if (local238 != 0) {
			this.ca(0, local238, 0);
		}
	}

	@OriginalMember(owner = "client!r", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!r", name = "OA", descriptor = "(I)V")
	public abstract void OA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	public abstract void method7696();

	@OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
	public abstract int e();

	@OriginalMember(owner = "client!r", name = "L", descriptor = "(SS)V")
	public abstract void L(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!r", name = "BA", descriptor = "(I[IIIIZI[I)V")
	protected abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public abstract void b(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IILclient!m;Z)Z")
	public abstract boolean method7697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!vq;IZIILclient!vq;III)V")
	public final void method7698(@OriginalArg(0) Class2_Sub13_Sub18 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub13_Sub18 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1 || !this.sa()) {
			return;
		}
		@Pc(25) Class292 local25 = arg0.aClass292Array1[arg2];
		@Pc(28) Class2_Sub49 local28 = local25.aClass2_Sub49_1;
		@Pc(30) Class292 local30 = null;
		if (arg4 != null) {
			local30 = arg4.aClass292Array1[arg7];
			if (local30.aClass2_Sub49_1 != local28) {
				local30 = null;
			}
		}
		this.method7693(arg1, local30, false, local25, arg5, arg3, null, 65535, arg6, local28, null);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "ca", descriptor = "(III)V")
	public abstract void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "EA", descriptor = "(Lclient!k;)Lclient!k;")
	public abstract Class2_Sub13_Sub6 EA(@OriginalArg(0) Class2_Sub13_Sub6 arg0);

	@OriginalMember(owner = "client!r", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!r", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB[IILclient!vq;ZIIILclient!vq;I)V")
	public final void method7699(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub13_Sub18 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class2_Sub13_Sub18 arg7, @OriginalArg(10) int arg8) {
		if (arg0 == -1 || !this.sa()) {
			return;
		}
		@Pc(25) Class292 local25 = arg7.aClass292Array1[arg0];
		@Pc(28) Class2_Sub49 local28 = local25.aClass2_Sub49_1;
		@Pc(30) Class292 local30 = null;
		if (arg3 != null) {
			local30 = arg3.aClass292Array1[arg6];
			if (local28 != local30.aClass2_Sub49_1) {
				local30 = null;
			}
		}
		this.method7693(arg4, local30, false, local25, arg2, 0, arg1, arg5, arg8, local28, null);
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "wa", descriptor = "()I")
	public abstract int wa();

	@OriginalMember(owner = "client!r", name = "l", descriptor = "(IIII)V")
	protected abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!r", name = "X", descriptor = "()V")
	public abstract void X();

	@OriginalMember(owner = "client!r", name = "ga", descriptor = "()I")
	public abstract int ga();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!gr;I)V")
	public abstract void method7700(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class6_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "V", descriptor = "(III)V")
	public abstract void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!vq;IB)V")
	public final void method7701(@OriginalArg(0) Class2_Sub13_Sub18 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1 || !this.sa()) {
			return;
		}
		@Pc(19) Class292 local19 = arg0.aClass292Array1[arg1];
		@Pc(22) Class2_Sub49 local22 = local19.aClass2_Sub49_1;
		for (@Pc(24) int local24 = 0; local24 < local19.anInt8761; local24++) {
			@Pc(31) short local31 = local19.aShortArray115[local24];
			if (local22.aBooleanArray38[local31]) {
				if (local19.aShortArray118[local24] != -1) {
					this.l(0, 0, 0, 0);
				}
				this.l(local22.anIntArray713[local31], local19.aShortArray120[local24], local19.aShortArray119[local24], local19.aShortArray123[local24]);
			}
		}
		this.MA();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()[Lclient!kv;")
	public abstract Class169[] method7702();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!m;Lclient!gr;II)V")
	public abstract void method7703(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class6_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!r", name = "ea", descriptor = "(I[IIIIIZ)V")
	protected abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!r", name = "ba", descriptor = "()I")
	public abstract int ba();

	@OriginalMember(owner = "client!r", name = "va", descriptor = "()I")
	public abstract int va();

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III[IIZ[IIZI)V")
	private void method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(21) int local21;
		if (arg1 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local21 = -arg6;
				arg6 = arg8;
				arg8 = local21;
			} else if (arg4 == 3) {
				local21 = arg6;
				arg6 = arg8;
				arg8 = local21;
			} else if (arg4 == 2) {
				local21 = arg6;
				arg6 = -arg8 & 0x3FFF;
				arg8 = local21 & 0x3FFF;
			}
		} else if (arg1 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg8 = -arg8;
				arg6 = -arg6;
			} else if (arg4 == 2) {
				arg8 = -arg8 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg1 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local21 = arg6;
				arg6 = -arg8;
				arg8 = local21;
			} else if (arg4 == 3) {
				local21 = arg6;
				arg6 = arg8;
				arg8 = local21;
			} else if (arg4 == 2) {
				local21 = arg6;
				arg6 = arg8 & 0x3FFF;
				arg8 = -local21 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.ea(arg4, arg5, arg6, arg0, arg8, arg1, arg7);
		} else {
			this.BA(arg4, arg5, arg6, arg0, arg8, arg7, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!r", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!r;IIIZ)V")
	public abstract void method7705(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BIZ)Lclient!r;")
	public abstract Class63 method7706(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
	public abstract boolean method7707();

	@OriginalMember(owner = "client!r", name = "d", descriptor = "()[Lclient!mm;")
	public abstract Class192[] method7708();

	@OriginalMember(owner = "client!r", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!r", name = "sa", descriptor = "()Z")
	protected abstract boolean sa();
}
