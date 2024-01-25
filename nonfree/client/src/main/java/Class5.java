import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public abstract class Class5 {

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	protected Class5() {
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "()I")
	public abstract int method3980();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!fh;ZIIIIBLclient!db;[ZZ[ILclient!db;)V")
	private void method3981(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class43 arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) Class43 arg10) {
		@Pc(11) int local11;
		if (arg10 == null || arg4 == 0) {
			for (local11 = 0; local11 < arg6.anInt1194; local11++) {
				@Pc(18) short local18 = arg6.aShortArray30[local11];
				if (arg7 == null || arg7[local18] == arg1 || arg0.anIntArray198[local18] == 0) {
					@Pc(42) short local42 = arg6.aShortArray29[local11];
					if (local42 != -1) {
						this.method4019(arg5, arg0.anIntArray199[local42] & arg3, arg8, 0, 0, 0, 0, arg0.anIntArrayArray23[local42], arg9);
					}
					this.method4019(arg5, arg3 & arg0.anIntArray199[local18], arg8, arg6.aShortArray26[local11], arg6.aShortArray28[local11], arg6.aShortArray24[local11], arg0.anIntArray198[local18], arg0.anIntArrayArray23[local18], arg9);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < arg0.anInt1941; local114++) {
			@Pc(118) boolean local118 = false;
			if (local11 < arg6.anInt1194 && local114 == arg6.aShortArray30[local11]) {
				local118 = true;
			}
			@Pc(140) boolean local140 = false;
			if (local112 < arg10.anInt1194 && arg10.aShortArray30[local112] == local114) {
				local140 = true;
			}
			if (local118 || local140) {
				if (arg7 == null || arg7[local114] == arg1 || arg0.anIntArray198[local114] == 0) {
					@Pc(182) short local182 = 0;
					@Pc(187) int local187 = arg0.anIntArray198[local114];
					if (local187 == 3) {
						local182 = 128;
					}
					@Pc(204) short local204;
					@Pc(196) short local196;
					@Pc(198) short local198;
					@Pc(202) short local202;
					@Pc(200) byte local200;
					if (local118) {
						local200 = arg6.aByteArray21[local11];
						local198 = arg6.aShortArray26[local11];
						local196 = arg6.aShortArray28[local11];
						local202 = arg6.aShortArray29[local11];
						local204 = arg6.aShortArray24[local11];
						local11++;
					} else {
						local196 = local182;
						local198 = local182;
						local200 = 0;
						local202 = -1;
						local204 = local182;
					}
					@Pc(239) short local239;
					@Pc(244) short local244;
					@Pc(254) short local254;
					@Pc(249) short local249;
					@Pc(259) byte local259;
					if (local140) {
						local239 = arg10.aShortArray24[local112];
						local244 = arg10.aShortArray28[local112];
						local249 = arg10.aShortArray29[local112];
						local254 = arg10.aShortArray26[local112];
						local259 = arg10.aByteArray21[local112];
						local112++;
					} else {
						local244 = local182;
						local239 = local182;
						local259 = 0;
						local249 = -1;
						local254 = local182;
					}
					@Pc(341) int local341;
					@Pc(327) int local327;
					@Pc(352) int local352;
					if ((local200 & 0x2) == 0 && (local259 & 0x1) == 0) {
						@Pc(292) int local292;
						if (local187 == 2) {
							local292 = local239 - local204 & 0x3FFF;
							@Pc(299) int local299 = local244 - local196 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							@Pc(311) int local311 = local254 - local198 & 0x3FFF;
							if (local292 >= 8192) {
								local292 -= 16384;
							}
							local327 = arg4 * local299 / arg2 + local196 & 0x3FFF;
							if (local311 >= 8192) {
								local311 -= 16384;
							}
							local341 = local204 + arg4 * local292 / arg2 & 0x3FFF;
							local352 = local198 + arg4 * local311 / arg2 & 0x3FFF;
						} else if (local187 == 7) {
							local292 = local239 - local204 & 0x3F;
							if (local292 >= 32) {
								local292 -= 64;
							}
							local352 = (local254 - local198) * arg4 / arg2 + local198;
							local327 = local196 + (local244 - local196) * arg4 / arg2;
							local341 = local204 + arg4 * local292 / arg2 & 0x3F;
						} else {
							local352 = local198 + arg4 * (local254 - local198) / arg2;
							local327 = local196 + arg4 * (local244 - local196) / arg2;
							local341 = local204 + (local239 - local204) * arg4 / arg2;
						}
					} else {
						local327 = local196;
						local352 = local198;
						local341 = local204;
					}
					if (local202 != -1) {
						this.method4019(arg5, arg0.anIntArray199[local202] & arg3, arg8, 0, 0, 0, 0, arg0.anIntArrayArray23[local202], arg9);
					} else if (local249 != -1) {
						this.method4019(arg5, arg3 & arg0.anIntArray199[local249], arg8, 0, 0, 0, 0, arg0.anIntArrayArray23[local249], arg9);
					}
					this.method4019(arg5, arg3 & arg0.anIntArray199[local114], arg8, local352, local327, local341, local187, arg0.anIntArrayArray23[local114], arg9);
				} else {
					if (local118) {
						local11++;
					}
					if (local140) {
						local112++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "()I")
	public abstract int method3982();

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "()I")
	public abstract int method3983();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!bl;Lclient!bl;III)V")
	public abstract void method3984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) Class26 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ib;Lclient!pf;II)V")
	public abstract void method3985(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class17_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!om;IIILclient!om;ILclient!om;ILclient!om;ZZIII[Z)V")
	public final void method3986(@OriginalArg(0) Class4_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub16 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub1_Sub16 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub1_Sub16 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean[] arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg13 == null || arg10 == -1) {
			this.method3993(arg8, arg5, arg0, 0, arg9, arg1, arg7, arg2);
		} else if (this.method4006()) {
			@Pc(34) Class43 local34 = arg0.aClass43Array1[arg1];
			@Pc(37) Class4_Sub10 local37 = local34.aClass4_Sub10_1;
			@Pc(39) Class43 local39 = null;
			if (arg8 != null) {
				local39 = arg8.aClass43Array1[arg2];
				if (local37 != local39.aClass4_Sub10_1) {
					local39 = null;
				}
			}
			@Pc(57) Class43 local57 = arg6.aClass43Array1[arg10];
			@Pc(59) Class43 local59 = null;
			if (arg4 != null) {
				local59 = arg4.aClass43Array1[arg11];
				if (local37 != local59.aClass4_Sub10_1) {
					local59 = null;
				}
			}
			this.method3981(local37, false, arg7, 65535, arg5, 0, local34, arg13, arg9, null, local39);
			this.method4021(0, new int[0], 0, 0, 0, 0, arg9);
			this.method3981(local37, true, arg3, 65535, arg12, 0, local57, arg13, arg9, null, local59);
			this.method4016();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public abstract void method3987(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public abstract void method3988(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "()[Lclient!md;")
	public abstract Class125[] method3989();

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "()I")
	public abstract int method3990();

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "()I")
	public abstract int method3992();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!om;ILclient!om;IIZIII)V")
	public final void method3993(@OriginalArg(0) Class4_Sub1_Sub16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 == -1 || !this.method4006()) {
			return;
		}
		@Pc(16) Class43 local16 = arg2.aClass43Array1[arg5];
		@Pc(19) Class4_Sub10 local19 = local16.aClass4_Sub10_1;
		@Pc(21) Class43 local21 = null;
		if (arg0 != null) {
			local21 = arg0.aClass43Array1[arg7];
			if (local19 != local21.aClass4_Sub10_1) {
				local21 = null;
			}
		}
		this.method3981(local19, false, arg6, 65535, arg1, arg3, local16, null, arg4, null, local21);
		this.method4016();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBLclient!om;ZILclient!om;IIII[I)V")
	public final void method3994(@OriginalArg(2) Class4_Sub1_Sub16 arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class4_Sub1_Sub16 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8) {
		if (arg2 == -1 || !this.method4006()) {
			return;
		}
		@Pc(17) Class43 local17 = arg0.aClass43Array1[arg2];
		@Pc(20) Class4_Sub10 local20 = local17.aClass4_Sub10_1;
		@Pc(22) Class43 local22 = null;
		if (arg3 != null) {
			local22 = arg3.aClass43Array1[arg7];
			if (local22.aClass4_Sub10_1 != local20) {
				local22 = null;
			}
		}
		this.method3981(local20, false, arg4, arg5, arg6, 0, local17, null, arg1, arg8, local22);
		this.method4016();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!ib;Z)Z")
	public abstract boolean method3995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class23 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "()I")
	public abstract int method3996();

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
	public abstract void method3997(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V")
	public abstract void method3998(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "()V")
	public abstract void method3999();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!om;)V")
	public final void method4000(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub16 arg1) {
		if (arg0 == -1 || !this.method4006()) {
			return;
		}
		@Pc(22) Class43 local22 = arg1.aClass43Array1[arg0];
		@Pc(25) Class4_Sub10 local25 = local22.aClass4_Sub10_1;
		for (@Pc(27) int local27 = 0; local27 < local22.anInt1194; local27++) {
			@Pc(34) short local34 = local22.aShortArray30[local27];
			if (local25.aBooleanArray14[local34]) {
				if (local22.aShortArray29[local27] != -1) {
					this.method4014(0, 0, 0, 0);
				}
				this.method4014(local25.anIntArray198[local34], local22.aShortArray24[local27], local22.aShortArray28[local27], local22.aShortArray26[local27]);
			}
		}
		this.method4016();
	}

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "()[Lclient!oa;")
	public abstract Class143[] method4002();

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)V")
	public abstract void method4003(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ve;)Lclient!ve;")
	public abstract Class4_Sub1_Sub1 method4004(@OriginalArg(0) Class4_Sub1_Sub1 arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!jn;IIIZ)V")
	public abstract void method4005(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "()Z")
	protected abstract boolean method4006();

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "()I")
	public abstract int method4007();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIILclient!bl;)V")
	protected final void method4008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class26 arg5) {
		@Pc(14) int local14 = -arg4 / 2;
		@Pc(19) int local19 = -arg2 / 2;
		@Pc(29) int local29 = arg5.method4990(local14 + arg3, arg0 - -local19);
		@Pc(33) int local33 = arg4 / 2;
		@Pc(38) int local38 = -arg2 / 2;
		@Pc(47) int local47 = arg5.method4990(arg3 + local33, local38 + arg0);
		@Pc(52) int local52 = -arg4 / 2;
		@Pc(56) int local56 = arg2 / 2;
		@Pc(66) int local66 = arg5.method4990(arg3 + local52, local56 + arg0);
		@Pc(70) int local70 = arg4 / 2;
		@Pc(74) int local74 = arg2 / 2;
		@Pc(84) int local84 = arg5.method4990(arg3 + local70, arg0 - -local74);
		@Pc(95) int local95 = local47 > local29 ? local29 : local47;
		@Pc(102) int local102 = local66 >= local84 ? local84 : local66;
		@Pc(113) int local113 = local47 < local84 ? local47 : local84;
		if (arg2 != 0) {
			@Pc(129) int local129 = (int) (Math.atan2((double) (local95 - local102), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local129 != 0) {
				this.method4003(local129);
			}
		}
		@Pc(148) int local148 = local29 >= local66 ? local66 : local29;
		@Pc(152) int local152 = local29 + local84;
		if (arg4 != 0) {
			@Pc(172) int local172 = (int) (Math.atan2((double) (local148 - local113), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local172 != 0) {
				this.method3987(local172);
			}
		}
		if (local152 > local66 + local47) {
			local152 = local47 + local66;
		}
		local152 = (local152 >> 1) - arg1;
		if (local152 != 0) {
			this.method4026(0, local152, 0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(SS)V")
	public abstract void method4009(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "()I")
	public abstract int method4010();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V")
	protected abstract void method4014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V")
	public abstract void method4015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "()V")
	protected abstract void method4016();

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "()Z")
	public abstract boolean method4017();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BIZ)Lclient!jn;")
	public abstract Class5 method4018(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIIZIIII[I[I)V")
	private void method4019(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8) {
		@Pc(31) int local31;
		if (arg0 == 1) {
			if (arg6 == 0 || arg6 == 1) {
				local31 = -arg5;
				arg5 = arg3;
				arg3 = local31;
			} else if (arg6 == 3) {
				local31 = arg5;
				arg5 = arg3;
				arg3 = local31;
			} else if (arg6 == 2) {
				local31 = arg5;
				arg5 = -arg3 & 0x3FFF;
				arg3 = local31 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg6 == 0 || arg6 == 1) {
				arg5 = -arg5;
				arg3 = -arg3;
			} else if (arg6 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg6 == 0 || arg6 == 1) {
				local31 = arg5;
				arg5 = -arg3;
				arg3 = local31;
			} else if (arg6 == 3) {
				local31 = arg5;
				arg5 = arg3;
				arg3 = local31;
			} else if (arg6 == 2) {
				local31 = arg5;
				arg5 = arg3 & 0x3FFF;
				arg3 = -local31 & 0x3FFF;
			}
		}
		if (arg1 == 65535) {
			this.method4021(arg6, arg7, arg5, arg4, arg3, arg0, arg2);
		} else {
			this.method4028(arg6, arg7, arg5, arg4, arg3, arg2, arg1, arg8);
		}
	}

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "()I")
	public abstract int method4020();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method4021(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(SS)V")
	public abstract void method4022(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "(I)V")
	public abstract void method4023(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "()V")
	public abstract void method4024();

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "()I")
	public abstract int method4025();

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(III)V")
	public abstract void method4026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)V")
	public abstract void method4027(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ib;Lclient!pf;I)V")
	public abstract void method4029(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class17_Sub6 arg1, @OriginalArg(2) int arg2);
}
