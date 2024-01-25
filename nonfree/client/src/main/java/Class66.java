import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public abstract class Class66 {

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	protected Class66() {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method5116(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public abstract void method5117(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public abstract void method5118(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BIZ)Lclient!n;")
	public abstract Class66 method5119(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!nc;IIIIIIIZ[ILclient!nc;)V")
	public final void method5120(@OriginalArg(0) Class2_Sub10_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) Class2_Sub10_Sub12 arg8) {
		if (arg3 == -1 || !this.method5159()) {
			return;
		}
		@Pc(18) Class112 local18 = arg0.aClass112Array1[arg3];
		@Pc(21) Class2_Sub39 local21 = local18.aClass2_Sub39_1;
		@Pc(23) Class112 local23 = null;
		if (arg8 != null) {
			local23 = arg8.aClass112Array1[arg2];
			if (local21 != local23.aClass2_Sub39_1) {
				local23 = null;
			}
		}
		this.method5144(false, arg4, local23, arg1, arg6, local18, arg5, 0, null, local21, arg7);
		this.method5151();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()Z")
	public abstract boolean method5122();

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()[Lclient!of;")
	public abstract Class176[] method5123();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(SS)V")
	public abstract void method5124(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!n;IIIZ)V")
	public abstract void method5125(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!de;Lclient!r;I)V")
	public abstract void method5126(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class10_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()I")
	public abstract int method5127();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5128(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!de;Z)Z")
	public abstract boolean method5131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	public abstract void method5132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!nc;Lclient!nc;IZIIIBLclient!nc;ILclient!nc;[ZI)V")
	public final void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub10_Sub12 arg2, @OriginalArg(3) Class2_Sub10_Sub12 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class2_Sub10_Sub12 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class2_Sub10_Sub12 arg11, @OriginalArg(13) boolean[] arg12, @OriginalArg(14) int arg13) {
		if (arg8 == -1) {
			return;
		}
		if (arg12 == null || arg10 == -1) {
			this.method5143(arg0, arg5, arg8, arg3, arg1, arg2, 0, arg7);
		} else if (this.method5159()) {
			@Pc(34) Class112 local34 = arg2.aClass112Array1[arg8];
			@Pc(37) Class2_Sub39 local37 = local34.aClass2_Sub39_1;
			@Pc(39) Class112 local39 = null;
			if (arg3 != null) {
				local39 = arg3.aClass112Array1[arg0];
				if (local39.aClass2_Sub39_1 != local37) {
					local39 = null;
				}
			}
			@Pc(62) Class112 local62 = arg11.aClass112Array1[arg10];
			@Pc(64) Class112 local64 = null;
			if (arg9 != null) {
				local64 = arg9.aClass112Array1[arg13];
				if (local64.aClass2_Sub39_1 != local37) {
					local64 = null;
				}
			}
			this.method5144(false, arg7, local39, arg1, arg5, local34, 65535, 0, arg12, local37, null);
			this.method5128(0, new int[0], 0, 0, 0, 0, arg5);
			this.method5144(true, arg6, local64, arg4, arg5, local62, 65535, 0, arg12, local37, null);
			this.method5151();
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "()I")
	public abstract int method5134();

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(III)V")
	public abstract void method5135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V")
	protected abstract void method5136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!n", name = "e", descriptor = "()V")
	public abstract void method5137();

	@OriginalMember(owner = "client!n", name = "f", descriptor = "()I")
	public abstract int method5138();

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	public abstract void method5139(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "g", descriptor = "()I")
	public abstract int method5140();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!dh;)Lclient!dh;")
	public abstract Class2_Sub10_Sub3 method5141(@OriginalArg(0) Class2_Sub10_Sub3 arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ij;IIIIIZ)V")
	protected final void method5142(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) int local14 = -arg3 / 2;
		@Pc(19) int local19 = -arg1 / 2;
		@Pc(28) int local28 = arg0.method4673(local14 + arg5, arg4 + local19);
		@Pc(32) int local32 = arg3 / 2;
		@Pc(45) int local45 = -arg1 / 2;
		@Pc(54) int local54 = arg0.method4673(local32 + arg5, local45 + arg4);
		@Pc(59) int local59 = -arg3 / 2;
		@Pc(63) int local63 = arg1 / 2;
		@Pc(72) int local72 = arg0.method4673(arg5 + local59, local63 + arg4);
		@Pc(76) int local76 = arg3 / 2;
		@Pc(80) int local80 = arg1 / 2;
		@Pc(90) int local90 = arg0.method4673(local76 + arg5, arg4 - -local80);
		@Pc(97) int local97 = local54 <= local28 ? local54 : local28;
		@Pc(108) int local108 = local90 <= local72 ? local90 : local72;
		@Pc(119) int local119 = local54 >= local90 ? local90 : local54;
		@Pc(126) int local126 = local28 < local72 ? local28 : local72;
		if (arg1 != 0) {
			@Pc(141) int local141 = (int) (Math.atan2((double) (local97 - local108), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local141 != 0) {
				this.method5153(local141);
			}
		}
		if (arg3 != 0) {
			@Pc(168) int local168 = (int) (Math.atan2((double) (local126 - local119), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local168 != 0) {
				this.method5145(local168);
			}
		}
		@Pc(177) int local177 = local90 + local28;
		if (local177 > local72 + local54) {
			local177 = local54 + local72;
		}
		local177 = (local177 >> 1) - arg2;
		if (local177 != 0) {
			this.method5132(0, local177, 0);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZILclient!nc;IILclient!nc;II)V")
	public final void method5143(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub10_Sub12 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class2_Sub10_Sub12 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 == -1 || !this.method5159()) {
			return;
		}
		@Pc(16) Class112 local16 = arg5.aClass112Array1[arg2];
		@Pc(19) Class2_Sub39 local19 = local16.aClass2_Sub39_1;
		@Pc(21) Class112 local21 = null;
		if (arg3 != null) {
			local21 = arg3.aClass112Array1[arg0];
			if (local21.aClass2_Sub39_1 != local19) {
				local21 = null;
			}
		}
		this.method5144(false, arg7, local21, arg4, arg1, local16, 65535, arg6, null, local19, null);
		this.method5151();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZILclient!it;IIZLclient!it;II[ZLclient!sm;[I)V")
	private void method5144(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class112 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) Class2_Sub39 arg9, @OriginalArg(11) int[] arg10) {
		@Pc(12) int local12;
		if (arg2 == null || arg1 == 0) {
			for (local12 = 0; local12 < arg5.anInt2984; local12++) {
				@Pc(18) short local18 = arg5.aShortArray52[local12];
				if (arg8 == null || arg0 == arg8[local18] || arg9.anIntArray1068[local18] == 0) {
					@Pc(42) short local42 = arg5.aShortArray51[local12];
					if (local42 != -1) {
						this.method5163(0, arg10, arg7, 0, 0, arg4, arg6 & arg9.anIntArray1069[local42], arg9.anIntArrayArray42[local42], 0);
					}
					this.method5163(arg5.aShortArray49[local12], arg10, arg7, arg5.aShortArray45[local12], arg9.anIntArray1068[local18], arg4, arg6 & arg9.anIntArray1069[local18], arg9.anIntArrayArray42[local18], arg5.aShortArray47[local12]);
				}
			}
			return;
		}
		local12 = 0;
		@Pc(107) int local107 = 0;
		for (@Pc(109) int local109 = 0; local109 < arg9.anInt5370; local109++) {
			@Pc(112) boolean local112 = false;
			if (local12 < arg5.anInt2984 && arg5.aShortArray52[local12] == local109) {
				local112 = true;
			}
			@Pc(126) boolean local126 = false;
			if (arg2.anInt2984 > local107 && local109 == arg2.aShortArray52[local107]) {
				local126 = true;
			}
			if (local112 || local126) {
				if (arg8 == null || arg8[local109] == arg0 || arg9.anIntArray1068[local109] == 0) {
					@Pc(174) short local174 = 0;
					@Pc(179) int local179 = arg9.anIntArray1068[local109];
					if (local179 == 3) {
						local174 = 128;
					}
					@Pc(211) short local211;
					@Pc(196) short local196;
					@Pc(201) short local201;
					@Pc(206) short local206;
					@Pc(191) byte local191;
					if (local112) {
						local191 = arg5.aByteArray46[local12];
						local196 = arg5.aShortArray49[local12];
						local201 = arg5.aShortArray47[local12];
						local206 = arg5.aShortArray51[local12];
						local211 = arg5.aShortArray45[local12];
						local12++;
					} else {
						local206 = -1;
						local201 = local174;
						local211 = local174;
						local196 = local174;
						local191 = 0;
					}
					@Pc(250) short local250;
					@Pc(235) short local235;
					@Pc(245) short local245;
					@Pc(240) short local240;
					@Pc(230) byte local230;
					if (local126) {
						local230 = arg2.aByteArray46[local107];
						local235 = arg2.aShortArray49[local107];
						local240 = arg2.aShortArray51[local107];
						local245 = arg2.aShortArray47[local107];
						local250 = arg2.aShortArray45[local107];
						local107++;
					} else {
						local240 = -1;
						local250 = local174;
						local235 = local174;
						local245 = local174;
						local230 = 0;
					}
					if (local206 != -1) {
						this.method5163(0, arg10, arg7, 0, 0, arg4, arg6 & arg9.anIntArray1069[local206], arg9.anIntArrayArray42[local206], 0);
					} else if (local240 != -1) {
						this.method5163(0, arg10, arg7, 0, 0, arg4, arg6 & arg9.anIntArray1069[local240], arg9.anIntArrayArray42[local240], 0);
					}
					@Pc(372) int local372;
					@Pc(382) int local382;
					@Pc(392) int local392;
					if ((local191 & 0x2) == 0 && (local230 & 0x1) == 0) {
						@Pc(330) int local330;
						if (local179 == 2) {
							local330 = local250 - local211 & 0x3FFF;
							@Pc(337) int local337 = local235 - local196 & 0x3FFF;
							if (local330 >= 8192) {
								local330 -= 16384;
							}
							if (local337 >= 8192) {
								local337 -= 16384;
							}
							@Pc(356) int local356 = local245 - local201 & 0x3FFF;
							if (local356 >= 8192) {
								local356 -= 16384;
							}
							local372 = arg1 * local330 / arg3 + local211 & 0x3FFF;
							local382 = local337 * arg1 / arg3 + local196 & 0x3FFF;
							local392 = local201 + arg1 * local356 / arg3 & 0x3FFF;
						} else if (local179 == 7) {
							local330 = local250 - local211 & 0x3F;
							if (local330 >= 32) {
								local330 -= 64;
							}
							local392 = local201 + arg1 * (local245 - local201) / arg3;
							local382 = arg1 * (local235 - local196) / arg3 + local196;
							local372 = local211 + local330 * arg1 / arg3 & 0x3F;
						} else {
							local392 = local201 + (local245 - local201) * arg1 / arg3;
							local372 = local211 + (local250 - local211) * arg1 / arg3;
							local382 = local196 + (local235 - local196) * arg1 / arg3;
						}
					} else {
						local392 = local201;
						local372 = local211;
						local382 = local196;
					}
					this.method5163(local382, arg10, arg7, local372, local179, arg4, arg9.anIntArray1069[local109] & arg6, arg9.anIntArrayArray42[local109], local392);
				} else {
					if (local126) {
						local107++;
					}
					if (local112) {
						local12++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
	public abstract void method5145(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "h", descriptor = "()I")
	public abstract int method5146();

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(SS)V")
	public abstract void method5147(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!n", name = "i", descriptor = "()I")
	public abstract int method5148();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!nc;I)V")
	public final void method5149(@OriginalArg(1) Class2_Sub10_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method5159()) {
			return;
		}
		@Pc(23) Class112 local23 = arg0.aClass112Array1[arg1];
		@Pc(26) Class2_Sub39 local26 = local23.aClass2_Sub39_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt2984; local28++) {
			@Pc(35) short local35 = local23.aShortArray52[local28];
			if (local26.aBooleanArray27[local35]) {
				if (local23.aShortArray51[local28] != -1) {
					this.method5136(0, 0, 0, 0);
				}
				this.method5136(local26.anIntArray1068[local35], local23.aShortArray45[local28], local23.aShortArray49[local28], local23.aShortArray47[local28]);
			}
		}
		this.method5151();
	}

	@OriginalMember(owner = "client!n", name = "j", descriptor = "()V")
	public abstract void method5150();

	@OriginalMember(owner = "client!n", name = "k", descriptor = "()V")
	protected abstract void method5151();

	@OriginalMember(owner = "client!n", name = "l", descriptor = "()I")
	public abstract int method5152();

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
	public abstract void method5153(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!ij;Lclient!ij;III)V")
	public abstract void method5154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) Class107 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!n", name = "g", descriptor = "(I)V")
	public abstract void method5155(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "m", descriptor = "()[Lclient!lh;")
	public abstract Class145[] method5156();

	@OriginalMember(owner = "client!n", name = "h", descriptor = "(I)V")
	public abstract void method5157(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!n", name = "n", descriptor = "()I")
	public abstract int method5158();

	@OriginalMember(owner = "client!n", name = "o", descriptor = "()Z")
	protected abstract boolean method5159();

	@OriginalMember(owner = "client!n", name = "p", descriptor = "()I")
	public abstract int method5160();

	@OriginalMember(owner = "client!n", name = "q", descriptor = "()I")
	public abstract int method5161();

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!de;Lclient!r;II)V")
	public abstract void method5162(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class10_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I[IIBIIZI[II)V")
	private void method5163(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(55) int local55;
		if (arg2 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local55 = -arg3;
				arg3 = arg8;
				arg8 = local55;
			} else if (arg4 == 3) {
				local55 = arg3;
				arg3 = arg8;
				arg8 = local55;
			} else if (arg4 == 2) {
				local55 = arg3;
				arg3 = -arg8 & 0x3FFF;
				arg8 = local55 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg3 = -arg3;
				arg8 = -arg8;
			} else if (arg4 == 2) {
				arg3 = -arg3 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local55 = arg3;
				arg3 = -arg8;
				arg8 = local55;
			} else if (arg4 == 3) {
				local55 = arg3;
				arg3 = arg8;
				arg8 = local55;
			} else if (arg4 == 2) {
				local55 = arg3;
				arg3 = arg8 & 0x3FFF;
				arg8 = -local55 & 0x3FFF;
			}
		}
		if (arg6 == 65535) {
			this.method5128(arg4, arg7, arg3, arg0, arg8, arg2, arg5);
		} else {
			this.method5116(arg4, arg7, arg3, arg0, arg8, arg5, arg6, arg1);
		}
	}
}
