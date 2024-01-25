import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public abstract class Class75 {

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	protected Class75() {
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!pl;Lclient!pl;III)V")
	public abstract void method5448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
	public abstract int method5449();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILclient!vo;IZ[ZIILclient!vo;Lclient!vo;IIILclient!vo;)V")
	public final void method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub7_Sub15 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3_Sub7_Sub15 arg8, @OriginalArg(10) Class3_Sub7_Sub15 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class3_Sub7_Sub15 arg13) {
		if (arg7 == -1) {
			return;
		}
		if (arg6 == null || arg11 == -1) {
			this.method5489(arg7, arg3, arg12, 0, arg10, arg5, arg2, arg13);
		} else if (this.method5492()) {
			@Pc(40) Class232 local40 = arg3.aClass232Array1[arg7];
			@Pc(43) Class3_Sub19 local43 = local40.aClass3_Sub19_1;
			@Pc(45) Class232 local45 = null;
			if (arg13 != null) {
				local45 = arg13.aClass232Array1[arg2];
				if (local43 != local45.aClass3_Sub19_1) {
					local45 = null;
				}
			}
			@Pc(63) Class232 local63 = arg8.aClass232Array1[arg11];
			@Pc(65) Class232 local65 = null;
			if (arg9 != null) {
				local65 = arg9.aClass232Array1[arg1];
				if (local43 != local65.aClass3_Sub19_1) {
					local65 = null;
				}
			}
			this.method5454(arg12, local43, arg6, arg5, local40, false, null, 0, 65535, arg10, local45);
			this.method5495(0, new int[0], 0, 0, 0, 0, arg5);
			this.method5454(arg0, local43, arg6, arg5, local63, true, null, 0, 65535, arg4, local65);
			this.method5494();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public abstract void method5451(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
	public abstract void method5452();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ho;[ZZLclient!ul;ZB[IIIILclient!ul;)V")
	private void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub19 arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class232 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class232 arg10) {
		@Pc(14) int local14;
		if (arg10 == null || arg9 == 0) {
			for (local14 = 0; local14 < arg4.anInt5920; local14++) {
				@Pc(21) short local21 = arg4.aShortArray87[local14];
				if (arg2 == null || arg2[local21] == arg5 || arg1.anIntArray280[local21] == 0) {
					@Pc(46) short local46 = arg4.aShortArray88[local14];
					if (local46 != -1) {
						this.method5483(arg7, arg6, arg3, arg1.anIntArrayArray23[local46], 0, 0, 0, arg1.anIntArray282[local46] & arg8, 0);
					}
					this.method5483(arg7, arg6, arg3, arg1.anIntArrayArray23[local21], arg4.aShortArray83[local14], arg4.aShortArray89[local14], arg1.anIntArray280[local21], arg8 & arg1.anIntArray282[local21], arg4.aShortArray91[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(119) int local119 = 0;
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt2645; local121++) {
			@Pc(125) boolean local125 = false;
			if (local14 < arg4.anInt5920 && local121 == arg4.aShortArray87[local14]) {
				local125 = true;
			}
			@Pc(147) boolean local147 = false;
			if (local119 < arg10.anInt5920 && local121 == arg10.aShortArray87[local119]) {
				local147 = true;
			}
			if (local125 || local147) {
				if (arg2 == null || arg5 == arg2[local121] || arg1.anIntArray280[local121] == 0) {
					@Pc(196) short local196 = 0;
					@Pc(201) int local201 = arg1.anIntArray280[local121];
					if (local201 == 3) {
						local196 = 128;
					}
					@Pc(220) short local220;
					@Pc(218) short local218;
					@Pc(214) short local214;
					@Pc(216) short local216;
					@Pc(212) byte local212;
					if (local125) {
						local214 = arg4.aShortArray83[local14];
						local218 = arg4.aShortArray89[local14];
						local216 = arg4.aShortArray88[local14];
						local212 = arg4.aByteArray84[local14];
						local220 = arg4.aShortArray91[local14];
						local14++;
					} else {
						local212 = 0;
						local214 = local196;
						local216 = -1;
						local218 = local196;
						local220 = local196;
					}
					@Pc(275) short local275;
					@Pc(265) short local265;
					@Pc(260) short local260;
					@Pc(270) short local270;
					@Pc(255) byte local255;
					if (local147) {
						local255 = arg10.aByteArray84[local119];
						local260 = arg10.aShortArray83[local119];
						local265 = arg10.aShortArray89[local119];
						local270 = arg10.aShortArray88[local119];
						local275 = arg10.aShortArray91[local119];
						local119++;
					} else {
						local275 = local196;
						local255 = 0;
						local260 = local196;
						local270 = -1;
						local265 = local196;
					}
					if (local216 != -1) {
						this.method5483(arg7, arg6, arg3, arg1.anIntArrayArray23[local216], 0, 0, 0, arg8 & arg1.anIntArray282[local216], 0);
					} else if (local270 != -1) {
						this.method5483(arg7, arg6, arg3, arg1.anIntArrayArray23[local270], 0, 0, 0, arg1.anIntArray282[local270] & arg8, 0);
					}
					@Pc(350) int local350;
					@Pc(352) int local352;
					@Pc(354) int local354;
					if ((local212 & 0x2) == 0 && (local255 & 0x1) == 0) {
						@Pc(365) int local365;
						if (local201 == 2) {
							local365 = local275 - local220 & 0x3FFF;
							@Pc(372) int local372 = local265 - local218 & 0x3FFF;
							if (local365 >= 8192) {
								local365 -= 16384;
							}
							@Pc(383) int local383 = local260 - local214 & 0x3FFF;
							if (local372 >= 8192) {
								local372 -= 16384;
							}
							local352 = local218 + arg9 * local372 / arg0 & 0x3FFF;
							if (local383 >= 8192) {
								local383 -= 16384;
							}
							local350 = local220 + arg9 * local365 / arg0 & 0x3FFF;
							local354 = arg9 * local383 / arg0 + local214 & 0x3FFF;
						} else if (local201 == 7) {
							local365 = local275 - local220 & 0x3F;
							if (local365 >= 32) {
								local365 -= 64;
							}
							local354 = local214 + (local260 - local214) * arg9 / arg0;
							local352 = local218 + arg9 * (local265 - local218) / arg0;
							local350 = local220 + local365 * arg9 / arg0 & 0x3F;
						} else {
							local354 = arg9 * (local260 - local214) / arg0 + local214;
							local352 = local218 + arg9 * (local265 - local218) / arg0;
							local350 = (local275 - local220) * arg9 / arg0 + local220;
						}
					} else {
						local350 = local220;
						local352 = local218;
						local354 = local214;
					}
					this.method5483(arg7, arg6, arg3, arg1.anIntArrayArray23[local121], local354, local352, local201, arg1.anIntArray282[local121] & arg8, local350);
				} else {
					if (local147) {
						local119++;
					}
					if (local125) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!vo;I)V")
	public final void method5455(@OriginalArg(1) Class3_Sub7_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method5492()) {
			return;
		}
		@Pc(18) Class232 local18 = arg0.aClass232Array1[arg1];
		@Pc(21) Class3_Sub19 local21 = local18.aClass3_Sub19_1;
		for (@Pc(23) int local23 = 0; local23 < local18.anInt5920; local23++) {
			@Pc(30) short local30 = local18.aShortArray87[local23];
			if (local21.aBooleanArray64[local30]) {
				if (local18.aShortArray88[local23] != -1) {
					this.method5487(0, 0, 0, 0);
				}
				this.method5487(local21.anIntArray280[local30], local18.aShortArray91[local23], local18.aShortArray89[local23], local18.aShortArray83[local23]);
			}
		}
		this.method5494();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!os;Lclient!kt;II)V")
	public abstract void method5456(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class12_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()I")
	public abstract int method5457();

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()V")
	public abstract void method5458();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(SS)V")
	public abstract void method5459(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!os;Z)Z")
	public abstract boolean method5460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!f", name = "e", descriptor = "()I")
	public abstract int method5461();

	@OriginalMember(owner = "client!f", name = "f", descriptor = "()I")
	public abstract int method5462();

	@OriginalMember(owner = "client!f", name = "g", descriptor = "()I")
	public abstract int method5464();

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	public abstract void method5466(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!f", name = "h", descriptor = "()I")
	public abstract int method5467();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II[IILclient!vo;ZLclient!vo;IIII)V")
	public final void method5468(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub7_Sub15 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class3_Sub7_Sub15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == -1 || !this.method5492()) {
			return;
		}
		@Pc(16) Class232 local16 = arg5.aClass232Array1[arg8];
		@Pc(19) Class3_Sub19 local19 = local16.aClass3_Sub19_1;
		@Pc(21) Class232 local21 = null;
		if (arg3 != null) {
			local21 = arg3.aClass232Array1[arg2];
			if (local19 != local21.aClass3_Sub19_1) {
				local21 = null;
			}
		}
		this.method5454(arg7, local19, null, arg4, local16, false, arg1, 0, arg0, arg6, local21);
		this.method5494();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!os;Lclient!kt;I)V")
	public abstract void method5469(@OriginalArg(0) Class118 arg0, @OriginalArg(1) Class12_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!tm;)Lclient!tm;")
	public abstract Class3_Sub7_Sub6 method5470(@OriginalArg(0) Class3_Sub7_Sub6 arg0);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method5471(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public abstract void method5472(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BIZ)Lclient!f;")
	public abstract Class75 method5473(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	public abstract void method5474(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	public abstract void method5475(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!f", name = "i", descriptor = "()I")
	public abstract int method5476();

	@OriginalMember(owner = "client!f", name = "j", descriptor = "()I")
	public abstract int method5477();

	@OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
	public abstract void method5478(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
	public abstract void method5479(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!f", name = "k", descriptor = "()[Lclient!vq;")
	public abstract Class241[] method5480();

	@OriginalMember(owner = "client!f", name = "l", descriptor = "()I")
	public abstract int method5481();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	public abstract void method5482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[IZ[IIIIIII)V")
	private void method5483(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(30) int local30;
		if (arg0 == 1) {
			if (arg6 == 0 || arg6 == 1) {
				local30 = -arg8;
				arg8 = arg4;
				arg4 = local30;
			} else if (arg6 == 3) {
				local30 = arg8;
				arg8 = arg4;
				arg4 = local30;
			} else if (arg6 == 2) {
				local30 = arg8;
				arg8 = -arg4 & 0x3FFF;
				arg4 = local30 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg6 == 0 || arg6 == 1) {
				arg8 = -arg8;
				arg4 = -arg4;
			} else if (arg6 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg6 == 0 || arg6 == 1) {
				local30 = arg8;
				arg8 = -arg4;
				arg4 = local30;
			} else if (arg6 == 3) {
				local30 = arg8;
				arg8 = arg4;
				arg4 = local30;
			} else if (arg6 == 2) {
				local30 = arg8;
				arg8 = arg4 & 0x3FFF;
				arg4 = -local30 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method5495(arg6, arg3, arg8, arg5, arg4, arg0, arg2);
		} else {
			this.method5471(arg6, arg3, arg8, arg5, arg4, arg2, arg7, arg1);
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(SS)V")
	public abstract void method5484(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(III)V")
	public abstract void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIILclient!pl;)V")
	protected final void method5486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class7 arg5) {
		@Pc(14) int local14 = -arg0 / 2;
		@Pc(19) int local19 = -arg2 / 2;
		@Pc(29) int local29 = arg5.method5638(arg4 + local14, local19 + arg1);
		@Pc(33) int local33 = arg0 / 2;
		@Pc(38) int local38 = -arg2 / 2;
		@Pc(48) int local48 = arg5.method5638(arg4 + local33, local38 + arg1);
		@Pc(53) int local53 = -arg0 / 2;
		@Pc(61) int local61 = arg2 / 2;
		@Pc(72) int local72 = arg5.method5638(arg4 + local53, arg1 - -local61);
		@Pc(76) int local76 = arg0 / 2;
		@Pc(80) int local80 = arg2 / 2;
		@Pc(90) int local90 = arg5.method5638(local76 + arg4, arg1 - -local80);
		@Pc(97) int local97 = local48 > local29 ? local29 : local48;
		@Pc(104) int local104 = local72 >= local90 ? local90 : local72;
		@Pc(111) int local111 = local90 > local48 ? local48 : local90;
		@Pc(122) int local122 = local72 <= local29 ? local72 : local29;
		if (arg2 != 0) {
			@Pc(137) int local137 = (int) (Math.atan2((double) (local97 - local104), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local137 != 0) {
				this.method5466(local137);
			}
		}
		@Pc(146) int local146 = local29 + local90;
		if (arg0 != 0) {
			@Pc(162) int local162 = (int) (Math.atan2((double) (local122 - local111), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local162 != 0) {
				this.method5474(local162);
			}
		}
		if (local72 + local48 < local146) {
			local146 = local72 + local48;
		}
		local146 = (local146 >> 1) - arg3;
		if (local146 != 0) {
			this.method5482(0, local146, 0);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)V")
	protected abstract void method5487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!f", name = "m", descriptor = "()[Lclient!mm;")
	public abstract Class158[] method5488();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!vo;IIIBZILclient!vo;)V")
	public final void method5489(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub7_Sub15 arg7) {
		if (arg0 == -1 || !this.method5492()) {
			return;
		}
		@Pc(21) Class232 local21 = arg1.aClass232Array1[arg0];
		@Pc(24) Class3_Sub19 local24 = local21.aClass3_Sub19_1;
		@Pc(26) Class232 local26 = null;
		if (arg7 != null) {
			local26 = arg7.aClass232Array1[arg6];
			if (local24 != local26.aClass3_Sub19_1) {
				local26 = null;
			}
		}
		this.method5454(arg2, local24, null, arg5, local21, false, null, arg3, 65535, arg4, local26);
		this.method5494();
	}

	@OriginalMember(owner = "client!f", name = "n", descriptor = "()I")
	public abstract int method5490();

	@OriginalMember(owner = "client!f", name = "o", descriptor = "()Z")
	protected abstract boolean method5492();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!f;IIIZ)V")
	public abstract void method5493(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!f", name = "p", descriptor = "()V")
	protected abstract void method5494();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5495(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!f", name = "q", descriptor = "()Z")
	public abstract boolean method5496();
}
