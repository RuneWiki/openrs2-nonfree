import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public abstract class Class101 {

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	protected Class101() {
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public abstract void method5144(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public abstract void method5145(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIBZLclient!ja;IILclient!ja;)V")
	public final void method5146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5_Sub9_Sub11 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5_Sub9_Sub11 arg7) {
		if (arg2 == -1 || !this.method5154()) {
			return;
		}
		@Pc(25) Class153 local25 = arg4.aClass153Array1[arg2];
		@Pc(28) Class5_Sub22 local28 = local25.aClass5_Sub22_1;
		@Pc(30) Class153 local30 = null;
		if (arg7 != null) {
			local30 = arg7.aClass153Array1[arg1];
			if (local28 != local30.aClass5_Sub22_1) {
				local30 = null;
			}
		}
		this.method5166(arg3, false, null, local25, 65535, null, arg6, local30, arg5, arg0, local28);
		this.method5185();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
	public abstract int method5147();

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "()I")
	public abstract int method5148();

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	public abstract void method5149(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V")
	protected abstract void method5150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!vr;Lclient!ue;II)V")
	public abstract void method5151(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class63_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "()I")
	public abstract int method5152();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(SS)V")
	public abstract void method5153(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "()Z")
	protected abstract boolean method5154();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!ja;IIIZI[IILclient!ja;)V")
	public final void method5155(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub9_Sub11 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) boolean arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class5_Sub9_Sub11 arg8) {
		if (arg7 == -1 || !this.method5154()) {
			return;
		}
		@Pc(18) Class153 local18 = arg1.aClass153Array1[arg7];
		@Pc(21) Class5_Sub22 local21 = local18.aClass5_Sub22_1;
		@Pc(23) Class153 local23 = null;
		if (arg8 != null) {
			local23 = arg8.aClass153Array1[arg2];
			if (local23.aClass5_Sub22_1 != local21) {
				local23 = null;
			}
		}
		this.method5166(arg4, false, arg6, local18, arg0, null, 0, local23, arg5, arg3, local21);
		this.method5185();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method5156(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIILclient!ja;ILclient!ja;Lclient!ja;IIZI[ZIILclient!ja;)V")
	public final void method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub9_Sub11 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub9_Sub11 arg5, @OriginalArg(6) Class5_Sub9_Sub11 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class5_Sub9_Sub11 arg13) {
		if (arg7 == -1) {
			return;
		}
		if (arg10 == null || arg0 == -1) {
			this.method5146(arg11, arg2, arg7, arg9, arg5, arg8, 0, arg6);
		} else if (this.method5154()) {
			@Pc(33) Class153 local33 = arg5.aClass153Array1[arg7];
			@Pc(44) Class5_Sub22 local44 = local33.aClass5_Sub22_1;
			@Pc(46) Class153 local46 = null;
			if (arg6 != null) {
				local46 = arg6.aClass153Array1[arg2];
				if (local44 != local46.aClass5_Sub22_1) {
					local46 = null;
				}
			}
			@Pc(64) Class153 local64 = arg3.aClass153Array1[arg0];
			@Pc(66) Class153 local66 = null;
			if (arg13 != null) {
				local66 = arg13.aClass153Array1[arg12];
				if (local66.aClass5_Sub22_1 != local44) {
					local66 = null;
				}
			}
			this.method5166(arg9, false, null, local33, 65535, arg10, 0, local46, arg8, arg11, local44);
			this.method5176(0, new int[0], 0, 0, 0, 0, arg9);
			this.method5166(arg9, true, null, local64, 65535, arg10, 0, local66, arg4, arg1, local44);
			this.method5185();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	public abstract void method5158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(SS)V")
	public abstract void method5159(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "()[Lclient!or;")
	public abstract Class151[] method5161();

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "()I")
	public abstract int method5162();

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "()[Lclient!nr;")
	public abstract Class140[] method5164();

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "()I")
	public abstract int method5165();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZBZ[ILclient!pb;I[ZILclient!pb;IILclient!hq;)V")
	private void method5166(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class153 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class153 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class5_Sub22 arg10) {
		@Pc(11) int local11;
		if (arg7 == null || arg8 == 0) {
			for (local11 = 0; local11 < arg3.anInt4583; local11++) {
				@Pc(18) short local18 = arg3.aShortArray66[local11];
				if (arg5 == null || arg1 == arg5[local18] || arg10.anIntArray157[local18] == 0) {
					@Pc(35) short local35 = arg3.aShortArray72[local11];
					if (local35 != -1) {
						this.method5174(0, 0, arg6, arg10.anIntArrayArray15[local35], arg0, arg4 & arg10.anIntArray158[local35], arg2, 0, 0);
					}
					this.method5174(arg10.anIntArray157[local18], arg3.aShortArray69[local11], arg6, arg10.anIntArrayArray15[local18], arg0, arg4 & arg10.anIntArray158[local18], arg2, arg3.aShortArray65[local11], arg3.aShortArray68[local11]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(101) int local101 = 0;
		for (@Pc(107) int local107 = 0; local107 < arg10.anInt2593; local107++) {
			@Pc(111) boolean local111 = false;
			if (local11 < arg3.anInt4583 && local107 == arg3.aShortArray66[local11]) {
				local111 = true;
			}
			@Pc(129) boolean local129 = false;
			if (local101 < arg7.anInt4583 && local107 == arg7.aShortArray66[local101]) {
				local129 = true;
			}
			if (local111 || local129) {
				if (arg5 == null || arg1 == arg5[local107] || arg10.anIntArray157[local107] == 0) {
					@Pc(179) short local179 = 0;
					@Pc(184) int local184 = arg10.anIntArray157[local107];
					if (local184 == 3) {
						local179 = 128;
					}
					@Pc(203) short local203;
					@Pc(208) short local208;
					@Pc(198) short local198;
					@Pc(218) short local218;
					@Pc(213) byte local213;
					if (local111) {
						local198 = arg3.aShortArray69[local11];
						local203 = arg3.aShortArray65[local11];
						local208 = arg3.aShortArray68[local11];
						local213 = arg3.aByteArray66[local11];
						local218 = arg3.aShortArray72[local11];
						local11++;
					} else {
						local203 = local179;
						local198 = local179;
						local208 = local179;
						local213 = 0;
						local218 = -1;
					}
					@Pc(238) short local238;
					@Pc(253) short local253;
					@Pc(248) short local248;
					@Pc(243) short local243;
					@Pc(258) byte local258;
					if (local129) {
						local238 = arg7.aShortArray65[local101];
						local243 = arg7.aShortArray72[local101];
						local248 = arg7.aShortArray69[local101];
						local253 = arg7.aShortArray68[local101];
						local258 = arg7.aByteArray66[local101];
						local101++;
					} else {
						local258 = 0;
						local253 = local179;
						local238 = local179;
						local248 = local179;
						local243 = -1;
					}
					@Pc(289) int local289;
					@Pc(291) int local291;
					@Pc(287) int local287;
					if ((local213 & 0x2) == 0 && (local258 & 0x1) == 0) {
						@Pc(305) int local305;
						if (local184 == 2) {
							local305 = local238 - local203 & 0x3FFF;
							@Pc(312) int local312 = local253 - local208 & 0x3FFF;
							if (local312 >= 8192) {
								local312 -= 16384;
							}
							if (local305 >= 8192) {
								local305 -= 16384;
							}
							@Pc(329) int local329 = local248 - local198 & 0x3FFF;
							local289 = local305 * arg8 / arg9 + local203 & 0x3FFF;
							if (local329 >= 8192) {
								local329 -= 16384;
							}
							local291 = arg8 * local312 / arg9 + local208 & 0x3FFF;
							local287 = local198 + local329 * arg8 / arg9 & 0x3FFF;
						} else if (local184 == 7) {
							local305 = local238 - local203 & 0x3F;
							if (local305 >= 32) {
								local305 -= 64;
							}
							local289 = local203 + local305 * arg8 / arg9 & 0x3F;
							local287 = local198 + (local248 - local198) * arg8 / arg9;
							local291 = local208 + (local253 - local208) * arg8 / arg9;
						} else {
							local291 = local208 + (local253 - local208) * arg8 / arg9;
							local289 = (local238 - local203) * arg8 / arg9 + local203;
							local287 = (local248 - local198) * arg8 / arg9 + local198;
						}
					} else {
						local287 = local198;
						local289 = local203;
						local291 = local208;
					}
					if (local218 != -1) {
						this.method5174(0, 0, arg6, arg10.anIntArrayArray15[local218], arg0, arg10.anIntArray158[local218] & arg4, arg2, 0, 0);
					} else if (local243 != -1) {
						this.method5174(0, 0, arg6, arg10.anIntArrayArray15[local243], arg0, arg4 & arg10.anIntArray158[local243], arg2, 0, 0);
					}
					this.method5174(local184, local287, arg6, arg10.anIntArrayArray15[local107], arg0, arg4 & arg10.anIntArray158[local107], arg2, local289, local291);
				} else {
					if (local129) {
						local101++;
					}
					if (local111) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "()I")
	public abstract int method5168();

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "()I")
	public abstract int method5169();

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "()Z")
	public abstract boolean method5170();

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "()I")
	public abstract int method5171();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!vr;Lclient!ue;I)V")
	public abstract void method5172(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class63_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III[IZIB[III)V")
	private void method5174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(29) int local29;
		if (arg2 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local29 = -arg7;
				arg7 = arg1;
				arg1 = local29;
			} else if (arg0 == 3) {
				local29 = arg7;
				arg7 = arg1;
				arg1 = local29;
			} else if (arg0 == 2) {
				local29 = arg7;
				arg7 = -arg1 & 0x3FFF;
				arg1 = local29 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg1 = -arg1;
				arg7 = -arg7;
			} else if (arg0 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg7 = -arg7 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local29 = arg7;
				arg7 = -arg1;
				arg1 = local29;
			} else if (arg0 == 3) {
				local29 = arg7;
				arg7 = arg1;
				arg1 = local29;
			} else if (arg0 == 2) {
				local29 = arg7;
				arg7 = arg1 & 0x3FFF;
				arg1 = -local29 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.method5176(arg0, arg3, arg7, arg8, arg1, arg2, arg4);
		} else {
			this.method5156(arg0, arg3, arg7, arg8, arg1, arg4, arg5, arg6);
		}
	}

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "()V")
	public abstract void method5175();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5176(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
	public abstract void method5177(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ja;BI)V")
	public final void method5179(@OriginalArg(0) Class5_Sub9_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method5154()) {
			return;
		}
		@Pc(19) Class153 local19 = arg0.aClass153Array1[arg1];
		@Pc(22) Class5_Sub22 local22 = local19.aClass5_Sub22_1;
		for (@Pc(28) int local28 = 0; local28 < local19.anInt4583; local28++) {
			@Pc(35) short local35 = local19.aShortArray66[local28];
			if (local22.aBooleanArray10[local35]) {
				if (local19.aShortArray72[local28] != -1) {
					this.method5150(0, 0, 0, 0);
				}
				this.method5150(local22.anIntArray157[local35], local19.aShortArray65[local28], local19.aShortArray68[local28], local19.aShortArray69[local28]);
			}
		}
		this.method5185();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIILclient!ac;)V")
	protected final void method5180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3 arg5) {
		@Pc(14) int local14 = -arg4 / 2;
		@Pc(19) int local19 = -arg3 / 2;
		@Pc(28) int local28 = arg5.method5639(arg1 + local14, arg0 + local19);
		@Pc(32) int local32 = arg4 / 2;
		@Pc(37) int local37 = -arg3 / 2;
		@Pc(47) int local47 = arg5.method5639(arg1 + local32, arg0 + local37);
		@Pc(52) int local52 = -arg4 / 2;
		@Pc(56) int local56 = arg3 / 2;
		@Pc(66) int local66 = arg5.method5639(arg1 + local52, arg0 + local56);
		@Pc(70) int local70 = arg4 / 2;
		@Pc(74) int local74 = arg3 / 2;
		@Pc(83) int local83 = arg5.method5639(arg1 + local70, local74 + arg0);
		@Pc(94) int local94 = local47 > local28 ? local28 : local47;
		@Pc(101) int local101 = local83 > local66 ? local66 : local83;
		@Pc(108) int local108 = local83 > local47 ? local47 : local83;
		@Pc(115) int local115 = local66 <= local28 ? local66 : local28;
		if (arg3 != 0) {
			@Pc(131) int local131 = (int) (Math.atan2((double) (local94 - local101), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local131 != 0) {
				this.method5144(local131);
			}
		}
		@Pc(143) int local143 = local83 + local28;
		if (arg4 != 0) {
			@Pc(159) int local159 = (int) (Math.atan2((double) (local115 - local108), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local159 != 0) {
				this.method5186(local159);
			}
		}
		if (local143 > local66 + local47) {
			local143 = local47 + local66;
		}
		local143 = (local143 >> 1) - arg2;
		if (local143 != 0) {
			this.method5194(0, local143, 0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!mj;IIIZ)V")
	public abstract void method5181(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!lg;)Lclient!lg;")
	public abstract Class5_Sub9_Sub14 method5182(@OriginalArg(0) Class5_Sub9_Sub14 arg0);

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "()I")
	public abstract int method5183();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIZ)Lclient!mj;")
	public abstract Class101 method5184(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "()V")
	protected abstract void method5185();

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
	public abstract void method5186(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!vr;Z)Z")
	public abstract boolean method5187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "()I")
	public abstract int method5188();

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "()V")
	public abstract void method5189();

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
	public abstract void method5190(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
	public abstract void method5192(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V")
	public abstract void method5194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!ac;Lclient!ac;III)V")
	public abstract void method5195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) Class3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
