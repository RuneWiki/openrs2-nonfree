import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public abstract class Class73 {

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	protected Class73() {
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public abstract void method3284(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "()Z")
	protected abstract boolean method3285();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([IIBZIIIII[I)V")
	private void method3286(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(23) int local23;
		if (arg6 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local23 = -arg3;
				arg3 = arg5;
				arg5 = local23;
			} else if (arg4 == 3) {
				local23 = arg3;
				arg3 = arg5;
				arg5 = local23;
			} else if (arg4 == 2) {
				local23 = arg3;
				arg3 = -arg5 & 0x3FFF;
				arg5 = local23 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg5 = -arg5;
				arg3 = -arg3;
			} else if (arg4 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local23 = arg3;
				arg3 = -arg5;
				arg5 = local23;
			} else if (arg4 == 3) {
				local23 = arg3;
				arg3 = arg5;
				arg5 = local23;
			} else if (arg4 == 2) {
				local23 = arg3;
				arg3 = arg5 & 0x3FFF;
				arg5 = -local23 & 0x3FFF;
			}
		}
		if (arg1 == 65535) {
			this.method3307(arg4, arg0, arg3, arg7, arg5, arg6, arg2);
		} else {
			this.method3288(arg4, arg0, arg3, arg7, arg5, arg2, arg1, arg8);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public abstract void method3287(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method3288(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "()I")
	public abstract int method3289();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
	public abstract void method3290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "()I")
	public abstract int method3291();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(SS)V")
	public abstract void method3292(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
	public abstract void method3293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "()I")
	public abstract int method3295();

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public abstract void method3296(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "()I")
	public abstract int method3297();

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "()I")
	public abstract int method3298();

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
	public abstract void method3299(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(SS)V")
	public abstract void method3300(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	public abstract void method3301(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!qg;I[IIIIILclient!qg;IZI)V")
	public final void method3302(@OriginalArg(0) Class1_Sub4_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub4_Sub19 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		if (arg4 == -1 || !this.method3285()) {
			return;
		}
		@Pc(17) Class49 local17 = arg0.aClass49Array1[arg4];
		@Pc(20) Class1_Sub36 local20 = local17.aClass1_Sub36_1;
		@Pc(22) Class49 local22 = null;
		if (arg6 != null) {
			local22 = arg6.aClass49Array1[arg3];
			if (local22.aClass1_Sub36_1 != local20) {
				local22 = null;
			}
		}
		this.method3317(arg7, local22, arg1, false, arg8, 0, local20, arg2, local17, arg5, null);
		this.method3329();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!gi;)Lclient!gi;")
	public abstract Class1_Sub4_Sub10 method3304(@OriginalArg(0) Class1_Sub4_Sub10 arg0);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ge;IIIZ)V")
	public abstract void method3305(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIZ)Lclient!ge;")
	public abstract Class73 method3306(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method3307(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!qg;II[ZLclient!qg;IIILclient!qg;Lclient!qg;ZIII)V")
	public final void method3308(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub4_Sub19 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[] arg3, @OriginalArg(5) Class1_Sub4_Sub19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class1_Sub4_Sub19 arg8, @OriginalArg(10) Class1_Sub4_Sub19 arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg6 == -1) {
			return;
		}
		if (arg3 == null || arg7 == -1) {
			this.method3309(arg2, arg10, arg9, 0, arg1, arg13, arg6, arg12);
		} else if (this.method3285()) {
			@Pc(33) Class49 local33 = arg9.aClass49Array1[arg6];
			@Pc(36) Class1_Sub36 local36 = local33.aClass1_Sub36_1;
			@Pc(38) Class49 local38 = null;
			if (arg1 != null) {
				local38 = arg1.aClass49Array1[arg13];
				if (local36 != local38.aClass1_Sub36_1) {
					local38 = null;
				}
			}
			@Pc(56) Class49 local56 = arg8.aClass49Array1[arg7];
			@Pc(58) Class49 local58 = null;
			if (arg4 != null) {
				local58 = arg4.aClass49Array1[arg0];
				if (local36 != local58.aClass1_Sub36_1) {
					local58 = null;
				}
			}
			this.method3317(arg12, local38, arg2, false, arg10, 0, local36, null, local33, 65535, arg3);
			this.method3307(0, new int[0], 0, 0, 0, 0, arg10);
			this.method3317(arg11, local58, arg5, true, arg10, 0, local36, null, local56, 65535, arg3);
			this.method3329();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZLclient!qg;ILclient!qg;IIII)V")
	public final void method3309(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class1_Sub4_Sub19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub4_Sub19 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 == -1 || !this.method3285()) {
			return;
		}
		@Pc(16) Class49 local16 = arg2.aClass49Array1[arg6];
		@Pc(19) Class1_Sub36 local19 = local16.aClass1_Sub36_1;
		@Pc(21) Class49 local21 = null;
		if (arg4 != null) {
			local21 = arg4.aClass49Array1[arg5];
			if (local21.aClass1_Sub36_1 != local19) {
				local21 = null;
			}
		}
		this.method3317(arg7, local21, arg0, false, arg1, arg3, local19, null, local16, 65535, null);
		this.method3329();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!wr;Lclient!fi;II)V")
	public abstract void method3310(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class8_Sub3 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIILclient!ip;BII)V")
	protected final void method3311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class53 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg1 / 2;
		@Pc(19) int local19 = -arg5 / 2;
		@Pc(29) int local29 = arg3.method2792(local14 + arg2, arg4 - -local19);
		@Pc(33) int local33 = arg1 / 2;
		@Pc(38) int local38 = -arg5 / 2;
		@Pc(47) int local47 = arg3.method2792(local33 + arg2, local38 + arg4);
		@Pc(52) int local52 = -arg1 / 2;
		@Pc(56) int local56 = arg5 / 2;
		@Pc(66) int local66 = arg3.method2792(local52 + arg2, arg4 - -local56);
		@Pc(70) int local70 = arg1 / 2;
		@Pc(74) int local74 = arg5 / 2;
		@Pc(84) int local84 = arg3.method2792(arg2 + local70, arg4 - -local74);
		@Pc(91) int local91 = local29 < local47 ? local29 : local47;
		@Pc(102) int local102 = local66 >= local84 ? local84 : local66;
		@Pc(109) int local109 = local47 < local84 ? local47 : local84;
		@Pc(120) int local120 = local66 <= local29 ? local66 : local29;
		if (arg5 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local91 - local102), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local140 != 0) {
				this.method3284(local140);
			}
		}
		@Pc(152) int local152 = local84 + local29;
		if (arg1 != 0) {
			@Pc(168) int local168 = (int) (Math.atan2((double) (local120 - local109), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local168 != 0) {
				this.method3324(local168);
			}
		}
		if (local47 + local66 < local152) {
			local152 = local47 + local66;
		}
		local152 = (local152 >> 1) - arg0;
		if (local152 != 0) {
			this.method3293(0, local152, 0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IIII)V")
	protected abstract void method3312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "()Z")
	public abstract boolean method3313();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!ip;Lclient!ip;III)V")
	public abstract void method3314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) Class53 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "()I")
	public abstract int method3315();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!qg;II)V")
	public final void method3316(@OriginalArg(0) Class1_Sub4_Sub19 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method3285()) {
			return;
		}
		@Pc(18) Class49 local18 = arg0.aClass49Array1[arg1];
		@Pc(29) Class1_Sub36 local29 = local18.aClass1_Sub36_1;
		for (@Pc(31) int local31 = 0; local31 < local18.anInt1765; local31++) {
			@Pc(38) short local38 = local18.aShortArray22[local31];
			if (local29.aBooleanArray27[local38]) {
				if (local18.aShortArray19[local31] != -1) {
					this.method3312(0, 0, 0, 0);
				}
				this.method3312(local29.anIntArray501[local38], local18.aShortArray16[local31], local18.aShortArray21[local31], local18.aShortArray18[local31]);
			}
		}
		this.method3329();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ea;IZZILclient!uf;[IZLclient!ea;I[Z)V")
	private void method3317(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub36 arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) Class49 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10) {
		@Pc(19) int local19;
		if (arg1 == null || arg0 == 0) {
			for (local19 = 0; local19 < arg8.anInt1765; local19++) {
				@Pc(26) short local26 = arg8.aShortArray22[local19];
				if (arg10 == null || arg10[local26] == arg3 || arg6.anIntArray501[local26] == 0) {
					@Pc(50) short local50 = arg8.aShortArray19[local19];
					if (local50 != -1) {
						this.method3286(arg6.anIntArrayArray60[local50], arg9 & arg6.anIntArray502[local50], arg4, 0, 0, 0, arg5, 0, arg7);
					}
					this.method3286(arg6.anIntArrayArray60[local26], arg6.anIntArray502[local26] & arg9, arg4, arg8.aShortArray16[local19], arg6.anIntArray501[local26], arg8.aShortArray18[local19], arg5, arg8.aShortArray21[local19], arg7);
				}
			}
			return;
		}
		local19 = 0;
		@Pc(119) int local119 = 0;
		for (@Pc(121) int local121 = 0; local121 < arg6.anInt6147; local121++) {
			@Pc(125) boolean local125 = false;
			if (local19 < arg8.anInt1765 && arg8.aShortArray22[local19] == local121) {
				local125 = true;
			}
			@Pc(143) boolean local143 = false;
			if (arg1.anInt1765 > local119 && local121 == arg1.aShortArray22[local119]) {
				local143 = true;
			}
			if (local125 || local143) {
				if (arg10 == null || arg3 == arg10[local121] || arg6.anIntArray501[local121] == 0) {
					@Pc(184) short local184 = 0;
					@Pc(189) int local189 = arg6.anIntArray501[local121];
					if (local189 == 3) {
						local184 = 128;
					}
					@Pc(204) short local204;
					@Pc(206) short local206;
					@Pc(208) short local208;
					@Pc(202) short local202;
					@Pc(200) byte local200;
					if (local125) {
						local204 = arg8.aShortArray16[local19];
						local206 = arg8.aShortArray21[local19];
						local200 = arg8.aByteArray23[local19];
						local208 = arg8.aShortArray18[local19];
						local202 = arg8.aShortArray19[local19];
						local19++;
					} else {
						local200 = 0;
						local202 = -1;
						local204 = local184;
						local206 = local184;
						local208 = local184;
					}
					@Pc(263) short local263;
					@Pc(248) short local248;
					@Pc(258) short local258;
					@Pc(243) short local243;
					@Pc(253) byte local253;
					if (local143) {
						local243 = arg1.aShortArray19[local119];
						local248 = arg1.aShortArray21[local119];
						local253 = arg1.aByteArray23[local119];
						local258 = arg1.aShortArray18[local119];
						local263 = arg1.aShortArray16[local119];
						local119++;
					} else {
						local253 = 0;
						local248 = local184;
						local263 = local184;
						local258 = local184;
						local243 = -1;
					}
					@Pc(337) int local337;
					@Pc(347) int local347;
					@Pc(363) int local363;
					if ((local200 & 0x2) == 0 && (local253 & 0x1) == 0) {
						@Pc(302) int local302;
						if (local189 == 2) {
							local302 = local263 - local204 & 0x3FFF;
							@Pc(309) int local309 = local248 - local206 & 0x3FFF;
							if (local309 >= 8192) {
								local309 -= 16384;
							}
							@Pc(322) int local322 = local258 - local208 & 0x3FFF;
							if (local302 >= 8192) {
								local302 -= 16384;
							}
							local337 = local204 + local302 * arg0 / arg2 & 0x3FFF;
							local347 = arg0 * local309 / arg2 + local206 & 0x3FFF;
							if (local322 >= 8192) {
								local322 -= 16384;
							}
							local363 = local208 + local322 * arg0 / arg2 & 0x3FFF;
						} else if (local189 == 7) {
							local302 = local263 - local204 & 0x3F;
							if (local302 >= 32) {
								local302 -= 64;
							}
							local347 = arg0 * (local248 - local206) / arg2 + local206;
							local363 = local208 + (local258 - local208) * arg0 / arg2;
							local337 = local204 + arg0 * local302 / arg2 & 0x3F;
						} else {
							local363 = arg0 * (local258 - local208) / arg2 + local208;
							local337 = local204 + arg0 * (local263 - local204) / arg2;
							local347 = local206 + arg0 * (local248 - local206) / arg2;
						}
					} else {
						local363 = local208;
						local337 = local204;
						local347 = local206;
					}
					if (local202 != -1) {
						this.method3286(arg6.anIntArrayArray60[local202], arg9 & arg6.anIntArray502[local202], arg4, 0, 0, 0, arg5, 0, arg7);
					} else if (local243 != -1) {
						this.method3286(arg6.anIntArrayArray60[local243], arg6.anIntArray502[local243] & arg9, arg4, 0, 0, 0, arg5, 0, arg7);
					}
					this.method3286(arg6.anIntArrayArray60[local121], arg6.anIntArray502[local121] & arg9, arg4, local337, local189, local363, arg5, local347, arg7);
				} else {
					if (local125) {
						local19++;
					}
					if (local143) {
						local119++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "()V")
	public abstract void method3318();

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "(I)V")
	public abstract void method3319(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "()I")
	public abstract int method3320();

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "()V")
	public abstract void method3321();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!wr;Lclient!fi;I)V")
	public abstract void method3322(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class8_Sub3 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "()I")
	public abstract int method3323();

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "(I)V")
	public abstract void method3324(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "()[Lclient!kh;")
	public abstract Class115[] method3325();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!wr;Z)Z")
	public abstract boolean method3326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "()I")
	public abstract int method3327();

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "()I")
	public abstract int method3328();

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "()V")
	protected abstract void method3329();

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "()[Lclient!un;")
	public abstract Class206[] method3330();
}
