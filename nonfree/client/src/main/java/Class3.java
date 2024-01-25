import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public abstract class Class3 {

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	protected Class3() {
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
	public abstract void method3435();

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
	public abstract int method3436();

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "()I")
	public abstract int method3437();

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()I")
	public abstract int method3438();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method3439(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(SS)V")
	public abstract void method3440(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "()[Lclient!ta;")
	public abstract Class218[] method3441();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public abstract void method3442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!dr;Lclient!bm;I)V")
	public abstract void method3443(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class22_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!dr;Z)Z")
	public abstract boolean method3444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!mr;)Lclient!mr;")
	public abstract Class2_Sub1_Sub6 method3445(@OriginalArg(0) Class2_Sub1_Sub6 arg0);

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "()I")
	public abstract int method3446();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!em;[ILclient!ih;ILclient!em;I[ZIZZ)V")
	private void method3447(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class2_Sub19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class63 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) boolean arg10) {
		@Pc(26) int local26;
		if (arg1 == null || arg8 == 0) {
			for (local26 = 0; local26 < arg5.anInt1547; local26++) {
				@Pc(33) short local33 = arg5.aShortArray28[local26];
				if (arg7 == null || arg10 == arg7[local33] || arg3.anIntArray310[local33] == 0) {
					@Pc(50) short local50 = arg5.aShortArray30[local26];
					if (local50 != -1) {
						this.method3478(arg0, 0, 0, arg3.anIntArrayArray10[local50], 0, 0, arg2, arg6 & arg3.anIntArray311[local50], arg9);
					}
					this.method3478(arg0, arg5.aShortArray29[local26], arg5.aShortArray34[local26], arg3.anIntArrayArray10[local33], arg5.aShortArray33[local26], arg3.anIntArray310[local33], arg2, arg6 & arg3.anIntArray311[local33], arg9);
				}
			}
			return;
		}
		local26 = 0;
		@Pc(116) int local116 = 0;
		for (@Pc(118) int local118 = 0; local118 < arg3.anInt2698; local118++) {
			@Pc(122) boolean local122 = false;
			if (arg5.anInt1547 > local26 && local118 == arg5.aShortArray28[local26]) {
				local122 = true;
			}
			@Pc(136) boolean local136 = false;
			if (arg1.anInt1547 > local116 && local118 == arg1.aShortArray28[local116]) {
				local136 = true;
			}
			if (local122 || local136) {
				if (arg7 == null || arg7[local118] == arg10 || arg3.anIntArray310[local118] == 0) {
					@Pc(185) short local185 = 0;
					@Pc(190) int local190 = arg3.anIntArray310[local118];
					if (local190 == 3) {
						local185 = 128;
					}
					@Pc(209) short local209;
					@Pc(214) short local214;
					@Pc(219) short local219;
					@Pc(224) short local224;
					@Pc(204) byte local204;
					if (local122) {
						local204 = arg5.aByteArray28[local26];
						local209 = arg5.aShortArray33[local26];
						local214 = arg5.aShortArray29[local26];
						local219 = arg5.aShortArray34[local26];
						local224 = arg5.aShortArray30[local26];
						local26++;
					} else {
						local224 = -1;
						local219 = local185;
						local209 = local185;
						local204 = 0;
						local214 = local185;
					}
					@Pc(245) short local245;
					@Pc(247) short local247;
					@Pc(249) short local249;
					@Pc(243) short local243;
					@Pc(241) byte local241;
					if (local136) {
						local249 = arg1.aShortArray34[local116];
						local245 = arg1.aShortArray33[local116];
						local241 = arg1.aByteArray28[local116];
						local243 = arg1.aShortArray30[local116];
						local247 = arg1.aShortArray29[local116];
						local116++;
					} else {
						local241 = 0;
						local243 = -1;
						local245 = local185;
						local247 = local185;
						local249 = local185;
					}
					if (local224 != -1) {
						this.method3478(arg0, 0, 0, arg3.anIntArrayArray10[local224], 0, 0, arg2, arg6 & arg3.anIntArray311[local224], arg9);
					} else if (local243 != -1) {
						this.method3478(arg0, 0, 0, arg3.anIntArrayArray10[local243], 0, 0, arg2, arg3.anIntArray311[local243] & arg6, arg9);
					}
					@Pc(387) int local387;
					@Pc(397) int local397;
					@Pc(412) int local412;
					if ((local204 & 0x2) == 0 && (local241 & 0x1) == 0) {
						@Pc(354) int local354;
						if (local190 == 2) {
							local354 = local245 - local209 & 0x3FFF;
							@Pc(361) int local361 = local247 - local214 & 0x3FFF;
							@Pc(368) int local368 = local249 - local219 & 0x3FFF;
							if (local354 >= 8192) {
								local354 -= 16384;
							}
							if (local361 >= 8192) {
								local361 -= 16384;
							}
							local387 = local209 + local354 * arg8 / arg4 & 0x3FFF;
							local397 = local361 * arg8 / arg4 + local214 & 0x3FFF;
							if (local368 >= 8192) {
								local368 -= 16384;
							}
							local412 = local219 + arg8 * local368 / arg4 & 0x3FFF;
						} else if (local190 == 7) {
							local354 = local245 - local209 & 0x3F;
							if (local354 >= 32) {
								local354 -= 64;
							}
							local412 = local219 + (local249 - local219) * arg8 / arg4;
							local387 = local354 * arg8 / arg4 + local209 & 0x3F;
							local397 = local214 + (local247 - local214) * arg8 / arg4;
						} else {
							local397 = (local247 - local214) * arg8 / arg4 + local214;
							local387 = local209 + (local245 - local209) * arg8 / arg4;
							local412 = local219 + arg8 * (local249 - local219) / arg4;
						}
					} else {
						local412 = local219;
						local397 = local214;
						local387 = local209;
					}
					this.method3478(arg0, local397, local412, arg3.anIntArrayArray10[local118], local387, local190, arg2, arg6 & arg3.anIntArray311[local118], arg9);
				} else {
					if (local136) {
						local116++;
					}
					if (local122) {
						local26++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIII)V")
	protected abstract void method3448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public abstract void method3451(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "()I")
	public abstract int method3452();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!dh;Lclient!dh;III)V")
	public abstract void method3453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class33 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "()V")
	public abstract void method3454();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!aa;IIZILclient!aa;IBI)V")
	public final void method3455(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 == -1 || !this.method3479()) {
			return;
		}
		@Pc(16) Class63 local16 = arg0.aClass63Array1[arg1];
		@Pc(24) Class2_Sub19 local24 = local16.aClass2_Sub19_1;
		@Pc(26) Class63 local26 = null;
		if (arg5 != null) {
			local26 = arg5.aClass63Array1[arg2];
			if (local24 != local26.aClass2_Sub19_1) {
				local26 = null;
			}
		}
		this.method3447(arg7, local26, null, local24, arg4, local16, 65535, null, arg6, arg3, false);
		this.method3480();
	}

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "()Z")
	public abstract boolean method3456();

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public abstract void method3457(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "()I")
	public abstract int method3458();

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "()I")
	public abstract int method3459();

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
	public abstract void method3460(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	public abstract void method3461(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
	public abstract void method3462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	public abstract void method3463(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!dh;IBIII)V")
	protected final void method3464(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg5 / 2;
		@Pc(19) int local19 = -arg4 / 2;
		@Pc(28) int local28 = arg1.method4055(arg0 + local14, local19 + arg3);
		@Pc(37) int local37 = arg5 / 2;
		@Pc(42) int local42 = -arg4 / 2;
		@Pc(52) int local52 = arg1.method4055(arg0 + local37, local42 + arg3);
		@Pc(57) int local57 = -arg5 / 2;
		@Pc(61) int local61 = arg4 / 2;
		@Pc(71) int local71 = arg1.method4055(arg0 + local57, arg3 + local61);
		@Pc(75) int local75 = arg5 / 2;
		@Pc(79) int local79 = arg4 / 2;
		@Pc(90) int local90 = arg1.method4055(arg0 + local75, arg3 - -local79);
		@Pc(97) int local97 = local28 < local52 ? local28 : local52;
		@Pc(108) int local108 = local71 >= local90 ? local90 : local71;
		@Pc(119) int local119 = local90 <= local52 ? local90 : local52;
		if (arg4 != 0) {
			@Pc(137) int local137 = (int) (Math.atan2((double) (local97 - local108), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local137 != 0) {
				this.method3460(local137);
			}
		}
		@Pc(156) int local156 = local71 > local28 ? local28 : local71;
		@Pc(160) int local160 = local90 + local28;
		if (arg5 != 0) {
			@Pc(176) int local176 = (int) (Math.atan2((double) (local156 - local119), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local176 != 0) {
				this.method3463(local176);
			}
		}
		if (local160 > local52 + local71) {
			local160 = local52 + local71;
		}
		local160 = (local160 >> 1) - arg2;
		if (local160 != 0) {
			this.method3442(0, local160, 0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!dr;Lclient!bm;II)V")
	public abstract void method3465(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class22_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method3466(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(SS)V")
	public abstract void method3467(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "()I")
	public abstract int method3468();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([ZLclient!aa;IIIBILclient!aa;ILclient!aa;IILclient!aa;ZI)V")
	public final void method3469(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) Class2_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub1_Sub1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub1_Sub1 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class2_Sub1_Sub1 arg11, @OriginalArg(13) boolean arg12, @OriginalArg(14) int arg13) {
		if (arg9 == -1) {
			return;
		}
		if (arg0 == null || arg13 == -1) {
			this.method3455(arg6, arg9, arg10, arg12, arg7, arg11, arg2, 0);
		} else if (this.method3479()) {
			@Pc(33) Class63 local33 = arg6.aClass63Array1[arg9];
			@Pc(36) Class2_Sub19 local36 = local33.aClass2_Sub19_1;
			@Pc(38) Class63 local38 = null;
			if (arg11 != null) {
				local38 = arg11.aClass63Array1[arg10];
				if (local36 != local38.aClass2_Sub19_1) {
					local38 = null;
				}
			}
			@Pc(56) Class63 local56 = arg1.aClass63Array1[arg13];
			@Pc(58) Class63 local58 = null;
			if (arg8 != null) {
				local58 = arg8.aClass63Array1[arg5];
				if (local36 != local58.aClass2_Sub19_1) {
					local58 = null;
				}
			}
			this.method3447(0, local38, null, local36, arg7, local33, 65535, arg0, arg2, arg12, false);
			this.method3466(0, new int[0], 0, 0, 0, 0, arg12);
			this.method3447(0, local58, null, local36, arg4, local56, 65535, arg0, arg3, arg12, true);
			this.method3480();
		}
	}

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "()I")
	public abstract int method3471();

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
	public abstract void method3472(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
	public abstract void method3473(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "()I")
	public abstract int method3474();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ab;IIIZ)V")
	public abstract void method3475(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "()[Lclient!qm;")
	public abstract Class191[] method3476();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!aa;IILclient!aa;I[IIIIZI)V")
	public final void method3477(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		if (arg7 == -1 || !this.method3479()) {
			return;
		}
		@Pc(18) Class63 local18 = arg0.aClass63Array1[arg7];
		@Pc(21) Class2_Sub19 local21 = local18.aClass2_Sub19_1;
		@Pc(23) Class63 local23 = null;
		if (arg3 != null) {
			local23 = arg3.aClass63Array1[arg1];
			if (local23.aClass2_Sub19_1 != local21) {
				local23 = null;
			}
		}
		this.method3447(0, local23, arg5, local21, arg6, local18, arg2, null, arg4, arg8, false);
		this.method3480();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[IIII[IIZ)V")
	private void method3478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(19) int local19;
		if (arg0 == 1) {
			if (arg5 == 0 || arg5 == 1) {
				local19 = -arg4;
				arg4 = arg2;
				arg2 = local19;
			} else if (arg5 == 3) {
				local19 = arg4;
				arg4 = arg2;
				arg2 = local19;
			} else if (arg5 == 2) {
				local19 = arg4;
				arg4 = -arg2 & 0x3FFF;
				arg2 = local19 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg5 == 0 || arg5 == 1) {
				arg4 = -arg4;
				arg2 = -arg2;
			} else if (arg5 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg5 == 0 || arg5 == 1) {
				local19 = arg4;
				arg4 = -arg2;
				arg2 = local19;
			} else if (arg5 == 3) {
				local19 = arg4;
				arg4 = arg2;
				arg2 = local19;
			} else if (arg5 == 2) {
				local19 = arg4;
				arg4 = arg2 & 0x3FFF;
				arg2 = -local19 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method3466(arg5, arg3, arg4, arg1, arg2, arg0, arg8);
		} else {
			this.method3439(arg5, arg3, arg4, arg1, arg2, arg8, arg7, arg6);
		}
	}

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "()Z")
	protected abstract boolean method3479();

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "()V")
	protected abstract void method3480();

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIZ)Lclient!ab;")
	public abstract Class3 method3481(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!aa;)V")
	public final void method3482(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub1 arg1) {
		if (arg0 == -1 || !this.method3479()) {
			return;
		}
		@Pc(19) Class63 local19 = arg1.aClass63Array1[arg0];
		@Pc(22) Class2_Sub19 local22 = local19.aClass2_Sub19_1;
		for (@Pc(24) int local24 = 0; local24 < local19.anInt1547; local24++) {
			@Pc(31) short local31 = local19.aShortArray28[local24];
			if (local22.aBooleanArray61[local31]) {
				if (local19.aShortArray30[local24] != -1) {
					this.method3448(0, 0, 0, 0);
				}
				this.method3448(local22.anIntArray310[local31], local19.aShortArray33[local24], local19.aShortArray29[local24], local19.aShortArray34[local24]);
			}
		}
		this.method3480();
	}
}
