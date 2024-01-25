import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class37 {

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	protected Class37() {
	}

	@OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
	protected abstract void W();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([IZII[IIIIII)V")
	private void method4154(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(27) int local27;
		if (arg6 == 1) {
			if (arg2 == 0 || arg2 == 1) {
				local27 = -arg7;
				arg7 = arg4;
				arg4 = local27;
			} else if (arg2 == 3) {
				local27 = arg7;
				arg7 = arg4;
				arg4 = local27;
			} else if (arg2 == 2) {
				local27 = arg7;
				arg7 = -arg4 & 0x3FFF;
				arg4 = local27 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg2 == 0 || arg2 == 1) {
				arg7 = -arg7;
				arg4 = -arg4;
			} else if (arg2 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg7 = -arg7 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg2 == 0 || arg2 == 1) {
				local27 = arg7;
				arg7 = -arg4;
				arg4 = local27;
			} else if (arg2 == 3) {
				local27 = arg7;
				arg7 = arg4;
				arg4 = local27;
			} else if (arg2 == 2) {
				local27 = arg7;
				arg7 = arg4 & 0x3FFF;
				arg4 = -local27 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.xa(arg2, arg0, arg7, arg5, arg4, arg6, arg1);
		} else {
			this.va(arg2, arg0, arg7, arg5, arg4, arg1, arg8, arg3);
		}
	}

	@OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
	public abstract int la();

	@OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
	public abstract void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class70 arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
	public abstract void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lclient!c;")
	public abstract Class37 method4155(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
	public abstract void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public abstract Class1_Sub1_Sub3 ua(@OriginalArg(0) Class1_Sub1_Sub3 arg0);

	@OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
	public abstract void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ul;ZIIIIII[IILclient!ul;)V")
	public final void method4156(@OriginalArg(0) Class1_Sub1_Sub16 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class1_Sub1_Sub16 arg8) {
		if (arg2 == -1 || !this.FA()) {
			return;
		}
		@Pc(22) Class87 local22 = arg0.aClass87Array1[arg2];
		@Pc(25) Class1_Sub32 local25 = local22.aClass1_Sub32_1;
		@Pc(27) Class87 local27 = null;
		if (arg8 != null) {
			local27 = arg8.aClass87Array1[arg4];
			if (local27.aClass1_Sub32_1 != local25) {
				local27 = null;
			}
		}
		this.method4161(local25, 0, null, arg7, arg6, local27, arg1, arg5, arg3, false, local22);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
	public abstract int X();

	@OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
	public abstract void sa();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lclient!wq;")
	public abstract Class265[] method4157();

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()V")
	public abstract void method4158();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIIIILclient!na;II)V")
	protected final void method4159(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class70 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(24) int local24 = -arg6 / 2;
		@Pc(29) int local29 = -arg4 / 2;
		@Pc(38) int local38 = arg5.va(local24 + arg3, local29 + arg1);
		@Pc(42) int local42 = arg6 / 2;
		@Pc(47) int local47 = -arg4 / 2;
		@Pc(56) int local56 = arg5.va(local42 + arg3, local47 + arg1);
		@Pc(61) int local61 = -arg6 / 2;
		@Pc(65) int local65 = arg4 / 2;
		@Pc(74) int local74 = arg5.va(local61 + arg3, arg1 + local65);
		@Pc(78) int local78 = arg6 / 2;
		@Pc(82) int local82 = arg4 / 2;
		@Pc(92) int local92 = arg5.va(arg3 + local78, local82 + arg1);
		@Pc(103) int local103 = local56 > local38 ? local38 : local56;
		@Pc(114) int local114 = local74 >= local92 ? local92 : local74;
		@Pc(125) int local125 = local56 < local92 ? local56 : local92;
		@Pc(132) int local132 = local38 < local74 ? local38 : local74;
		@Pc(174) int local174;
		if (arg4 != 0) {
			@Pc(148) int local148 = (int) (Math.atan2((double) (local103 - local114), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local148 != 0) {
				if (arg0 != 0) {
					if (local148 > 8192) {
						local174 = 16384 - arg0;
						if (local148 < local174) {
							local148 = local174;
						}
					} else if (arg0 < local148) {
						local148 = arg0;
					}
				}
				this.WA(local148);
			}
		}
		if (arg6 != 0) {
			@Pc(205) int local205 = (int) (Math.atan2((double) (local132 - local125), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local205 != 0) {
				if (arg2 != 0) {
					if (local205 > 8192) {
						local174 = 16384 - arg2;
						if (local205 < local174) {
							local205 = local174;
						}
					} else if (local205 > arg2) {
						local205 = arg2;
					}
				}
				this.o(local205);
			}
		}
		@Pc(241) int local241 = local92 + local38;
		if (local241 > local56 + local74) {
			local241 = local56 + local74;
		}
		local241 = (local241 >> 1) - arg7;
		if (local241 != 0) {
			this.ja(0, local241, 0);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZLclient!ul;IILclient!ul;IIZ)V")
	public final void method4160(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class1_Sub1_Sub16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub16 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg3 == -1 || !this.FA()) {
			return;
		}
		@Pc(17) Class87 local17 = arg2.aClass87Array1[arg3];
		@Pc(20) Class1_Sub32 local20 = local17.aClass1_Sub32_1;
		@Pc(22) Class87 local22 = null;
		if (arg5 != null) {
			local22 = arg5.aClass87Array1[arg6];
			if (local22.aClass1_Sub32_1 != local20) {
				local22 = null;
			}
		}
		this.method4161(local20, arg7, null, arg0, null, local22, arg1, 65535, arg4, false, local17);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
	public abstract void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
	public abstract void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
	public abstract int C();

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!pd;I[ZI[ILclient!fl;ZZIIZLclient!fl;)V")
	private void method4161(@OriginalArg(0) Class1_Sub32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class87 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class87 arg10) {
		@Pc(14) int local14;
		if (arg5 == null || arg3 == 0) {
			for (local14 = 0; local14 < arg10.anInt2100; local14++) {
				@Pc(21) short local21 = arg10.aShortArray16[local14];
				if (arg2 == null || arg2[local21] == arg9 || arg0.anIntArray384[local21] == 0) {
					@Pc(42) short local42 = arg10.aShortArray17[local14];
					if (local42 != -1) {
						this.method4154(arg0.anIntArrayArray35[local42], arg6, 0, arg4, 0, 0, arg1, 0, arg0.anIntArray385[local42] & arg7);
					}
					this.method4154(arg0.anIntArrayArray35[local21], arg6, arg0.anIntArray384[local21], arg4, arg10.aShortArray20[local14], arg10.aShortArray15[local14], arg1, arg10.aShortArray14[local14], arg0.anIntArray385[local21] & arg7);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < arg0.anInt5021; local114++) {
			@Pc(123) boolean local123 = false;
			if (arg10.anInt2100 > local14 && local114 == arg10.aShortArray16[local14]) {
				local123 = true;
			}
			@Pc(137) boolean local137 = false;
			if (local112 < arg5.anInt2100 && local114 == arg5.aShortArray16[local112]) {
				local137 = true;
			}
			if (local123 || local137) {
				if (arg2 == null || arg9 == arg2[local114] || arg0.anIntArray384[local114] == 0) {
					@Pc(182) short local182 = 0;
					@Pc(187) int local187 = arg0.anIntArray384[local114];
					if (local187 == 3 || local187 == 10) {
						local182 = 128;
					}
					@Pc(203) short local203;
					@Pc(199) short local199;
					@Pc(207) short local207;
					@Pc(201) short local201;
					@Pc(205) byte local205;
					if (local123) {
						local207 = arg10.aShortArray20[local14];
						local201 = arg10.aShortArray17[local14];
						local199 = arg10.aShortArray15[local14];
						local203 = arg10.aShortArray14[local14];
						local205 = arg10.aByteArray16[local14];
						local14++;
					} else {
						local199 = local182;
						local201 = -1;
						local203 = local182;
						local205 = 0;
						local207 = local182;
					}
					@Pc(252) short local252;
					@Pc(257) short local257;
					@Pc(247) short local247;
					@Pc(262) short local262;
					@Pc(242) byte local242;
					if (local137) {
						local242 = arg5.aByteArray16[local112];
						local247 = arg5.aShortArray20[local112];
						local252 = arg5.aShortArray14[local112];
						local257 = arg5.aShortArray15[local112];
						local262 = arg5.aShortArray17[local112];
						local112++;
					} else {
						local247 = local182;
						local242 = 0;
						local262 = -1;
						local257 = local182;
						local252 = local182;
					}
					if (local201 != -1) {
						this.method4154(arg0.anIntArrayArray35[local201], arg6, 0, arg4, 0, 0, arg1, 0, arg0.anIntArray385[local201] & arg7);
					} else if (local262 != -1) {
						this.method4154(arg0.anIntArrayArray35[local262], arg6, 0, arg4, 0, 0, arg1, 0, arg7 & arg0.anIntArray385[local262]);
					}
					@Pc(365) int local365;
					@Pc(355) int local355;
					@Pc(354) int local354;
					if ((local205 & 0x2) == 0 && (local242 & 0x1) == 0) {
						@Pc(347) int local347;
						if (local187 == 2) {
							local347 = local252 - local203 & 0x3FFF;
							@Pc(465) int local465 = local257 - local199 & 0x3FFF;
							if (local465 >= 8192) {
								local465 -= 16384;
							}
							if (local347 >= 8192) {
								local347 -= 16384;
							}
							@Pc(484) int local484 = local247 - local207 & 0x3FFF;
							local365 = arg3 * local347 / arg8 + local203 & 0x3FFF;
							local355 = arg3 * local465 / arg8 + local199 & 0x3FFF;
							if (local484 >= 8192) {
								local484 -= 16384;
							}
							local354 = local484 * arg3 / arg8 + local207 & 0x3FFF;
						} else if (local187 == 9) {
							local347 = local252 - local203 & 0x3FFF;
							if (local347 >= 8192) {
								local347 -= 16384;
							}
							local354 = 0;
							local355 = 0;
							local365 = arg3 * local347 / arg8 + local203 & 0x3FFF;
						} else if (local187 == 7) {
							local347 = local252 - local203 & 0x3F;
							if (local347 >= 32) {
								local347 -= 64;
							}
							local354 = local207 + (local247 - local207) * arg3 / arg8;
							local365 = local347 * arg3 / arg8 + local203 & 0x3F;
							local355 = local199 + (local257 - local199) * arg3 / arg8;
						} else {
							local354 = local207 + (local247 - local207) * arg3 / arg8;
							local365 = arg3 * (local252 - local203) / arg8 + local203;
							local355 = (local257 - local199) * arg3 / arg8 + local199;
						}
					} else {
						local365 = local203;
						local354 = local207;
						local355 = local199;
					}
					this.method4154(arg0.anIntArrayArray35[local114], arg6, local187, arg4, local354, local355, arg1, local365, arg0.anIntArray385[local114] & arg7);
				} else {
					if (local123) {
						local14++;
					}
					if (local137) {
						local112++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
	protected abstract boolean FA();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!ul;I)V")
	public final void method4162(@OriginalArg(1) Class1_Sub1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.FA()) {
			return;
		}
		@Pc(18) Class87 local18 = arg0.aClass87Array1[arg1];
		@Pc(21) Class1_Sub32 local21 = local18.aClass1_Sub32_1;
		for (@Pc(23) int local23 = 0; local23 < local18.anInt2100; local23++) {
			@Pc(30) short local30 = local18.aShortArray16[local23];
			if (local21.aBooleanArray19[local30]) {
				if (local18.aShortArray17[local23] != -1) {
					this.K(0, 0, 0, 0);
				}
				this.K(local21.anIntArray384[local30], local18.aShortArray14[local23], local18.aShortArray15[local23], local18.aShortArray20[local23]);
			}
		}
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!sf;II)V")
	public abstract void method4163(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class36_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	public abstract void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected abstract void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
	public abstract void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	public abstract void method4165(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
	public abstract int VA();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!ia;Z)Z")
	public abstract boolean method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!sf;I)V")
	public abstract void method4167(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class36_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()Z")
	public abstract boolean method4168();

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()[Lclient!qr;")
	public abstract Class203[] method4169();

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
	public abstract int ra();

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
	public abstract void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
	protected abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[ZILclient!ul;ZLclient!ul;IILclient!ul;IILclient!ul;I)V")
	public final void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub16 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) Class1_Sub1_Sub16 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class1_Sub1_Sub16 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1_Sub1_Sub16 arg12, @OriginalArg(14) int arg13) {
		if (arg0 == -1) {
			return;
		}
		if (arg3 == null || arg10 == -1) {
			this.method4160(arg8, arg6, arg5, arg0, arg2, arg7, arg13, 0);
		} else if (this.FA()) {
			@Pc(40) Class87 local40 = arg5.aClass87Array1[arg0];
			@Pc(43) Class1_Sub32 local43 = local40.aClass1_Sub32_1;
			@Pc(45) Class87 local45 = null;
			if (arg7 != null) {
				local45 = arg7.aClass87Array1[arg13];
				if (local43 != local45.aClass1_Sub32_1) {
					local45 = null;
				}
			}
			this.method4161(local43, 0, arg3, arg8, null, local45, arg6, 65535, arg2, false, local40);
			@Pc(77) Class87 local77 = arg9.aClass87Array1[arg10];
			@Pc(79) Class87 local79 = null;
			if (arg12 != null) {
				local79 = arg12.aClass87Array1[arg11];
				if (local43 != local79.aClass1_Sub32_1) {
					local79 = null;
				}
			}
			this.xa(0, new int[0], 0, 0, 0, 0, arg6);
			this.method4161(local77.aClass1_Sub32_1, 0, arg3, arg4, null, local79, arg6, 65535, arg1, true, local77);
			this.W();
		}
	}
}
