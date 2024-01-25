import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public abstract class Class49 {

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "[Lclient!tm;")
	public static final Class193[] aClass193Array3 = new Class193[5];

	static {
		for (@Pc(15) int local15 = 0; local15 < aClass193Array3.length; local15++) {
			aClass193Array3[local15] = new Class193();
		}
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	protected Class49() {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
	public abstract void method5809(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BIZ)Lclient!wp;")
	public abstract Class49 method5810(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
	public abstract void method5811(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!dm;Lclient!dm;[IIIIIIZI)V")
	public final void method5813(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub9_Sub2 arg1, @OriginalArg(2) Class2_Sub9_Sub2 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) int arg8) {
		if (arg4 == -1 || !this.method5836()) {
			return;
		}
		@Pc(18) Class127 local18 = arg2.aClass127Array1[arg4];
		@Pc(21) Class2_Sub4 local21 = local18.aClass2_Sub4_1;
		@Pc(23) Class127 local23 = null;
		if (arg1 != null) {
			local23 = arg1.aClass127Array1[arg5];
			if (local21 != local23.aClass2_Sub4_1) {
				local23 = null;
			}
		}
		this.method5819(arg0, local21, local23, local18, arg7, 0, arg6, null, false, arg3, arg8);
		this.method5823();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()Z")
	public abstract boolean method5814();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILclient!jd;Z)Z")
	public abstract boolean method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method5817(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "()I")
	public abstract int method5818();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ah;BLclient!li;Lclient!li;ZII[ZZ[II)V")
	private void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1, @OriginalArg(3) Class127 arg2, @OriginalArg(4) Class127 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean[] arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (arg2 == null || arg10 == 0) {
			for (local14 = 0; local14 < arg3.anInt4079; local14++) {
				@Pc(21) short local21 = arg3.aShortArray62[local14];
				if (arg7 == null || arg7[local21] == arg8 || arg1.anIntArray23[local21] == 0) {
					@Pc(41) short local41 = arg3.aShortArray65[local14];
					if (local41 != -1) {
						this.method5841(arg4, 0, 0, 0, arg1.anIntArrayArray3[local41], arg1.anIntArray22[local41] & arg6, arg5, 0, arg9);
					}
					this.method5841(arg4, arg3.aShortArray60[local14], arg3.aShortArray66[local14], arg3.aShortArray64[local14], arg1.anIntArrayArray3[local21], arg6 & arg1.anIntArray22[local21], arg5, arg1.anIntArray23[local21], arg9);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(106) int local106 = 0;
		for (@Pc(108) int local108 = 0; local108 < arg1.anInt169; local108++) {
			@Pc(112) boolean local112 = false;
			if (local14 < arg3.anInt4079 && local108 == arg3.aShortArray62[local14]) {
				local112 = true;
			}
			@Pc(130) boolean local130 = false;
			if (local106 < arg2.anInt4079 && arg2.aShortArray62[local106] == local108) {
				local130 = true;
			}
			if (local112 || local130) {
				if (arg7 == null || arg7[local108] == arg8 || arg1.anIntArray23[local108] == 0) {
					@Pc(175) short local175 = 0;
					@Pc(180) int local180 = arg1.anIntArray23[local108];
					if (local180 == 3) {
						local175 = 128;
					}
					@Pc(197) short local197;
					@Pc(192) short local192;
					@Pc(207) short local207;
					@Pc(202) short local202;
					@Pc(212) byte local212;
					if (local112) {
						local192 = arg3.aShortArray60[local14];
						local197 = arg3.aShortArray66[local14];
						local202 = arg3.aShortArray65[local14];
						local207 = arg3.aShortArray64[local14];
						local212 = arg3.aByteArray46[local14];
						local14++;
					} else {
						local197 = local175;
						local207 = local175;
						local192 = local175;
						local202 = -1;
						local212 = 0;
					}
					@Pc(247) short local247;
					@Pc(237) short local237;
					@Pc(232) short local232;
					@Pc(242) short local242;
					@Pc(252) byte local252;
					if (local130) {
						local232 = arg2.aShortArray64[local106];
						local237 = arg2.aShortArray60[local106];
						local242 = arg2.aShortArray65[local106];
						local247 = arg2.aShortArray66[local106];
						local252 = arg2.aByteArray46[local106];
						local106++;
					} else {
						local232 = local175;
						local247 = local175;
						local252 = 0;
						local237 = local175;
						local242 = -1;
					}
					if (local202 != -1) {
						this.method5841(arg4, 0, 0, 0, arg1.anIntArrayArray3[local202], arg6 & arg1.anIntArray22[local202], arg5, 0, arg9);
					} else if (local242 != -1) {
						this.method5841(arg4, 0, 0, 0, arg1.anIntArrayArray3[local242], arg6 & arg1.anIntArray22[local242], arg5, 0, arg9);
					}
					@Pc(369) int local369;
					@Pc(380) int local380;
					@Pc(397) int local397;
					if ((local212 & 0x2) == 0 && (local252 & 0x1) == 0) {
						@Pc(337) int local337;
						if (local180 == 2) {
							local337 = local247 - local197 & 0x3FFF;
							@Pc(343) int local343 = local237 - local192 & 0x3FFF;
							@Pc(350) int local350 = local232 - local207 & 0x3FFF;
							if (local337 >= 8192) {
								local337 -= 16384;
							}
							if (local343 >= 8192) {
								local343 -= 16384;
							}
							local369 = local197 + local337 * arg10 / arg0 & 0x3FFF;
							local380 = local192 + arg10 * local343 / arg0 & 0x3FFF;
							if (local350 >= 8192) {
								local350 -= 16384;
							}
							local397 = local207 + arg10 * local350 / arg0 & 0x3FFF;
						} else if (local180 == 7) {
							local337 = local247 - local197 & 0x3F;
							if (local337 >= 32) {
								local337 -= 64;
							}
							local380 = local192 + (local237 - local192) * arg10 / arg0;
							local369 = arg10 * local337 / arg0 + local197 & 0x3F;
							local397 = arg10 * (local232 - local207) / arg0 + local207;
						} else {
							local397 = local207 + arg10 * (local232 - local207) / arg0;
							local380 = arg10 * (local237 - local192) / arg0 + local192;
							local369 = (local247 - local197) * arg10 / arg0 + local197;
						}
					} else {
						local397 = local207;
						local369 = local197;
						local380 = local192;
					}
					this.method5841(arg4, local380, local369, local397, arg1.anIntArrayArray3[local108], arg1.anIntArray22[local108] & arg6, arg5, local180, arg9);
				} else {
					if (local112) {
						local14++;
					}
					if (local130) {
						local106++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "()I")
	public abstract int method5820();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "()V")
	protected abstract void method5823();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!qn;)Lclient!qn;")
	public abstract Class2_Sub9_Sub16 method5824(@OriginalArg(0) Class2_Sub9_Sub16 arg0);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!jd;Lclient!id;I)V")
	public abstract void method5825(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class57_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "()I")
	public abstract int method5826();

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "()I")
	public abstract int method5827();

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "()[Lclient!tr;")
	public abstract Class197[] method5828();

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V")
	public abstract void method5829(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!wp;IIIZ)V")
	public abstract void method5831(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "()[Lclient!mp;")
	public abstract Class136[] method5832();

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "()V")
	public abstract void method5833();

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "()I")
	public abstract int method5834();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!jd;Lclient!id;II)V")
	public abstract void method5835(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class57_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "()Z")
	protected abstract boolean method5836();

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(IIII)V")
	protected abstract void method5837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!dm;ZIILclient!dm;IILclient!dm;III[ZLclient!dm;I)V")
	public final void method5839(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub9_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub9_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class2_Sub9_Sub2 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean[] arg11, @OriginalArg(13) Class2_Sub9_Sub2 arg12, @OriginalArg(14) int arg13) {
		if (arg6 == -1) {
			return;
		}
		if (arg11 == null || arg3 == -1) {
			this.method5848(arg9, arg8, 0, arg12, arg13, arg7, arg2, arg6);
		} else if (this.method5836()) {
			@Pc(34) Class127 local34 = arg7.aClass127Array1[arg6];
			@Pc(37) Class2_Sub4 local37 = local34.aClass2_Sub4_1;
			@Pc(39) Class127 local39 = null;
			if (arg12 != null) {
				local39 = arg12.aClass127Array1[arg8];
				if (local37 != local39.aClass2_Sub4_1) {
					local39 = null;
				}
			}
			@Pc(57) Class127 local57 = arg1.aClass127Array1[arg3];
			@Pc(59) Class127 local59 = null;
			if (arg5 != null) {
				local59 = arg5.aClass127Array1[arg0];
				if (local59.aClass2_Sub4_1 != local37) {
					local59 = null;
				}
			}
			this.method5819(arg9, local37, local39, local34, arg2, 0, 65535, arg11, false, null, arg13);
			this.method5822(0, new int[0], 0, 0, 0, 0, arg2);
			this.method5819(arg4, local37, local59, local57, arg2, 0, 65535, arg11, true, null, arg10);
			this.method5823();
		}
	}

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "()V")
	public abstract void method5840();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIIII[IIII[I)V")
	private void method5841(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(58) int local58;
		if (arg6 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local58 = -arg2;
				arg2 = arg3;
				arg3 = local58;
			} else if (arg7 == 3) {
				local58 = arg2;
				arg2 = arg3;
				arg3 = local58;
			} else if (arg7 == 2) {
				local58 = arg2;
				arg2 = -arg3 & 0x3FFF;
				arg3 = local58 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg2 = -arg2;
				arg3 = -arg3;
			} else if (arg7 == 2) {
				arg3 = -arg3 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local58 = arg2;
				arg2 = -arg3;
				arg3 = local58;
			} else if (arg7 == 3) {
				local58 = arg2;
				arg2 = arg3;
				arg3 = local58;
			} else if (arg7 == 2) {
				local58 = arg2;
				arg2 = arg3 & 0x3FFF;
				arg3 = -local58 & 0x3FFF;
			}
		}
		if (arg5 == 65535) {
			this.method5822(arg7, arg4, arg2, arg1, arg3, arg6, arg0);
		} else {
			this.method5817(arg7, arg4, arg2, arg1, arg3, arg0, arg5, arg8);
		}
	}

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "()I")
	public abstract int method5842();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILclient!dm;)V")
	public final void method5844(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub9_Sub2 arg1) {
		if (arg0 == -1 || !this.method5836()) {
			return;
		}
		@Pc(23) Class127 local23 = arg1.aClass127Array1[arg0];
		@Pc(26) Class2_Sub4 local26 = local23.aClass2_Sub4_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt4079; local28++) {
			@Pc(35) short local35 = local23.aShortArray62[local28];
			if (local26.aBooleanArray3[local35]) {
				if (local23.aShortArray65[local28] != -1) {
					this.method5837(0, 0, 0, 0);
				}
				this.method5837(local26.anIntArray23[local35], local23.aShortArray66[local28], local23.aShortArray60[local28], local23.aShortArray64[local28]);
			}
		}
		this.method5823();
	}

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "()I")
	public abstract int method5845();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)V")
	public abstract void method5846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(SS)V")
	public abstract void method5847(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIBLclient!dm;ILclient!dm;ZI)V")
	public final void method5848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub9_Sub2 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		if (arg7 == -1 || !this.method5836()) {
			return;
		}
		@Pc(22) Class127 local22 = arg5.aClass127Array1[arg7];
		@Pc(25) Class2_Sub4 local25 = local22.aClass2_Sub4_1;
		@Pc(27) Class127 local27 = null;
		if (arg3 != null) {
			local27 = arg3.aClass127Array1[arg1];
			if (local25 != local27.aClass2_Sub4_1) {
				local27 = null;
			}
		}
		this.method5819(arg0, local25, local27, local22, arg6, arg2, 65535, null, false, null, arg4);
		this.method5823();
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(III)V")
	public abstract void method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(SS)V")
	public abstract void method5850(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "()I")
	public abstract int method5851();

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(I)V")
	public abstract void method5852(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "()I")
	public abstract int method5853();

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)V")
	public abstract void method5854(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void method5855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) Class105 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "(I)V")
	public abstract void method5856(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)V")
	public abstract void method5857(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "()I")
	public abstract int method5859();

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!s;IIIII)V")
	protected final void method5860(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = -arg0 / 2;
		@Pc(24) int local24 = -arg4 / 2;
		@Pc(34) int local34 = arg1.method4452(arg3 + local19, local24 + arg2);
		@Pc(38) int local38 = arg0 / 2;
		@Pc(43) int local43 = -arg4 / 2;
		@Pc(52) int local52 = arg1.method4452(local38 + arg3, local43 + arg2);
		@Pc(57) int local57 = -arg0 / 2;
		@Pc(61) int local61 = arg4 / 2;
		@Pc(70) int local70 = arg1.method4452(local57 + arg3, local61 + arg2);
		@Pc(74) int local74 = arg0 / 2;
		@Pc(78) int local78 = arg4 / 2;
		@Pc(87) int local87 = arg1.method4452(arg3 + local74, local78 + arg2);
		@Pc(98) int local98 = local52 > local34 ? local34 : local52;
		@Pc(105) int local105 = local87 <= local70 ? local87 : local70;
		@Pc(116) int local116 = local52 < local87 ? local52 : local87;
		@Pc(123) int local123 = local70 > local34 ? local34 : local70;
		if (arg4 != 0) {
			@Pc(139) int local139 = (int) (Math.atan2((double) (local98 - local105), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local139 != 0) {
				this.method5856(local139);
			}
		}
		if (arg0 != 0) {
			@Pc(159) int local159 = (int) (Math.atan2((double) (local123 - local116), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local159 != 0) {
				this.method5829(local159);
			}
		}
		@Pc(171) int local171 = local87 + local34;
		if (local171 > local70 + local52) {
			local171 = local70 + local52;
		}
		local171 = (local171 >> 1) - arg5;
		if (local171 != 0) {
			this.method5849(0, local171, 0);
		}
	}
}
