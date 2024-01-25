import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class32 {

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	protected Class32() {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
	public abstract void method5666();

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()[Lclient!au;")
	public abstract Class17[] method5667();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZBLclient!dr;ILclient!dr;III)V")
	public final void method5668(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class2_Sub2_Sub7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub2_Sub7 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 == -1 || !this.FA()) {
			return;
		}
		@Pc(24) Class189 local24 = arg2.aClass189Array1[arg3];
		@Pc(27) Class2_Sub35 local27 = local24.aClass2_Sub35_1;
		@Pc(29) Class189 local29 = null;
		if (arg4 != null) {
			local29 = arg4.aClass189Array1[arg5];
			if (local29.aClass2_Sub35_1 != local27) {
				local29 = null;
			}
		}
		this.method5680(arg7, arg6, null, false, null, arg0, 65535, local24, local29, local27, arg1);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!dr;I)V")
	public final void method5669(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub7 arg1) {
		if (arg0 == -1 || !this.FA()) {
			return;
		}
		@Pc(18) Class189 local18 = arg1.aClass189Array1[arg0];
		@Pc(21) Class2_Sub35 local21 = local18.aClass2_Sub35_1;
		for (@Pc(27) int local27 = 0; local27 < local18.anInt5318; local27++) {
			@Pc(34) short local34 = local18.aShortArray72[local27];
			if (local21.aBooleanArray44[local34]) {
				if (local18.aShortArray75[local27] != -1) {
					this.K(0, 0, 0, 0);
				}
				this.K(local21.anIntArray379[local34], local18.aShortArray70[local27], local18.aShortArray74[local27], local18.aShortArray68[local27]);
			}
		}
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZLclient!dr;Lclient!dr;ILclient!dr;[ZIILclient!dr;IIII)V")
	public final void method5670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class2_Sub2_Sub7 arg3, @OriginalArg(4) Class2_Sub2_Sub7 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub7 arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class2_Sub2_Sub7 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (arg8 == -1) {
			return;
		}
		if (arg7 == null || arg13 == -1) {
			this.method5668(0, arg2, arg10, arg8, arg4, arg1, arg5, arg11);
		} else if (this.FA()) {
			@Pc(34) Class189 local34 = arg10.aClass189Array1[arg8];
			@Pc(37) Class2_Sub35 local37 = local34.aClass2_Sub35_1;
			@Pc(39) Class189 local39 = null;
			if (arg4 != null) {
				local39 = arg4.aClass189Array1[arg1];
				if (local37 != local39.aClass2_Sub35_1) {
					local39 = null;
				}
			}
			this.method5680(arg11, arg5, arg7, false, null, 0, 65535, local34, local39, local37, arg2);
			@Pc(76) Class189 local76 = arg6.aClass189Array1[arg13];
			@Pc(78) Class189 local78 = null;
			if (arg3 != null) {
				local78 = arg3.aClass189Array1[arg12];
				if (local78.aClass2_Sub35_1 != local37) {
					local78 = null;
				}
			}
			this.xa(0, new int[0], 0, 0, 0, 0, arg2);
			this.method5680(arg0, arg9, arg7, true, null, 0, 65535, local76, local78, local76.aClass2_Sub35_1, arg2);
			this.W();
		}
	}

	@OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
	protected abstract void W();

	@OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
	public abstract int la();

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
	protected abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!ia;Z)Z")
	public abstract boolean method5671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	public abstract void method5672(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
	public abstract void sa();

	@OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
	public abstract int X();

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()[Lclient!qm;")
	public abstract Class202[] method5673();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!fo;I)V")
	public abstract void method5675(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class38_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()Z")
	public abstract boolean method5676();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!fo;II)V")
	public abstract void method5677(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class38_Sub4 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public abstract Class2_Sub2_Sub9 ua(@OriginalArg(0) Class2_Sub2_Sub9 arg0);

	@OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
	public abstract void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
	public abstract void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
	public abstract int C();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lclient!c;")
	public abstract Class32 method5678(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
	public abstract void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[ZZ[IIIILclient!pf;Lclient!pf;Lclient!qs;Z)V")
	private void method5680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class189 arg7, @OriginalArg(9) Class189 arg8, @OriginalArg(10) Class2_Sub35 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(14) int local14;
		if (arg8 == null || arg0 == 0) {
			for (local14 = 0; local14 < arg7.anInt5318; local14++) {
				@Pc(21) short local21 = arg7.aShortArray72[local14];
				if (arg2 == null || arg3 == arg2[local21] || arg9.anIntArray379[local21] == 0) {
					@Pc(42) short local42 = arg7.aShortArray75[local14];
					if (local42 != -1) {
						this.method5682(0, 0, arg9.anIntArrayArray45[local42], 0, arg5, arg4, 0, arg10, arg6 & arg9.anIntArray380[local42]);
					}
					this.method5682(arg7.aShortArray74[local14], arg7.aShortArray68[local14], arg9.anIntArrayArray45[local21], arg7.aShortArray70[local14], arg5, arg4, arg9.anIntArray379[local21], arg10, arg6 & arg9.anIntArray380[local21]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(108) int local108 = 0;
		for (@Pc(115) int local115 = 0; local115 < arg9.anInt5879; local115++) {
			@Pc(119) boolean local119 = false;
			if (arg7.anInt5318 > local14 && local115 == arg7.aShortArray72[local14]) {
				local119 = true;
			}
			@Pc(137) boolean local137 = false;
			if (arg8.anInt5318 > local108 && arg8.aShortArray72[local108] == local115) {
				local137 = true;
			}
			if (local119 || local137) {
				if (arg2 == null || arg3 == arg2[local115] || arg9.anIntArray379[local115] == 0) {
					@Pc(179) short local179 = 0;
					@Pc(184) int local184 = arg9.anIntArray379[local115];
					if (local184 == 3 || local184 == 10) {
						local179 = 128;
					}
					@Pc(201) short local201;
					@Pc(221) short local221;
					@Pc(206) short local206;
					@Pc(216) short local216;
					@Pc(211) byte local211;
					if (local119) {
						local201 = arg7.aShortArray70[local14];
						local206 = arg7.aShortArray68[local14];
						local211 = arg7.aByteArray149[local14];
						local216 = arg7.aShortArray75[local14];
						local221 = arg7.aShortArray74[local14];
						local14++;
					} else {
						local216 = -1;
						local201 = local179;
						local211 = 0;
						local221 = local179;
						local206 = local179;
					}
					@Pc(244) short local244;
					@Pc(240) short local240;
					@Pc(242) short local242;
					@Pc(238) short local238;
					@Pc(246) byte local246;
					if (local137) {
						local240 = arg8.aShortArray74[local108];
						local242 = arg8.aShortArray68[local108];
						local238 = arg8.aShortArray75[local108];
						local244 = arg8.aShortArray70[local108];
						local246 = arg8.aByteArray149[local108];
						local108++;
					} else {
						local238 = -1;
						local240 = local179;
						local242 = local179;
						local244 = local179;
						local246 = 0;
					}
					if (local216 != -1) {
						this.method5682(0, 0, arg9.anIntArrayArray45[local216], 0, arg5, arg4, 0, arg10, arg9.anIntArray380[local216] & arg6);
					} else if (local238 != -1) {
						this.method5682(0, 0, arg9.anIntArrayArray45[local238], 0, arg5, arg4, 0, arg10, arg9.anIntArray380[local238] & arg6);
					}
					@Pc(339) int local339;
					@Pc(335) int local335;
					@Pc(337) int local337;
					if ((local211 & 0x2) == 0 && (local246 & 0x1) == 0) {
						@Pc(353) int local353;
						if (local184 == 2) {
							local353 = local244 - local201 & 0x3FFF;
							@Pc(360) int local360 = local240 - local221 & 0x3FFF;
							if (local360 >= 8192) {
								local360 -= 16384;
							}
							if (local353 >= 8192) {
								local353 -= 16384;
							}
							@Pc(376) int local376 = local242 - local206 & 0x3FFF;
							local339 = arg0 * local353 / arg1 + local201 & 0x3FFF;
							if (local376 >= 8192) {
								local376 -= 16384;
							}
							local335 = local221 + local360 * arg0 / arg1 & 0x3FFF;
							local337 = local206 + local376 * arg0 / arg1 & 0x3FFF;
						} else if (local184 == 9) {
							local353 = local244 - local201 & 0x3FFF;
							if (local353 >= 8192) {
								local353 -= 16384;
							}
							local337 = 0;
							local335 = 0;
							local339 = local353 * arg0 / arg1 + local201 & 0x3FFF;
						} else if (local184 == 7) {
							local353 = local244 - local201 & 0x3F;
							if (local353 >= 32) {
								local353 -= 64;
							}
							local335 = (local240 - local221) * arg0 / arg1 + local221;
							local339 = local201 + local353 * arg0 / arg1 & 0x3F;
							local337 = local206 + arg0 * (local242 - local206) / arg1;
						} else {
							local339 = local201 + (local244 - local201) * arg0 / arg1;
							local337 = local206 + arg0 * (local242 - local206) / arg1;
							local335 = local221 + (local240 - local221) * arg0 / arg1;
						}
					} else {
						local335 = local221;
						local337 = local206;
						local339 = local201;
					}
					this.method5682(local335, local337, arg9.anIntArrayArray45[local115], local339, arg5, arg4, local184, arg10, arg9.anIntArray380[local115] & arg6);
				} else {
					if (local137) {
						local108++;
					}
					if (local119) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
	public abstract void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
	public abstract void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[III[IIIZI)V")
	private void method5682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(34) int local34;
		if (arg4 == 1) {
			if (arg6 == 0 || arg6 == 1) {
				local34 = -arg3;
				arg3 = arg1;
				arg1 = local34;
			} else if (arg6 == 3) {
				local34 = arg3;
				arg3 = arg1;
				arg1 = local34;
			} else if (arg6 == 2) {
				local34 = arg3;
				arg3 = -arg1 & 0x3FFF;
				arg1 = local34 & 0x3FFF;
			}
		} else if (arg4 == 2) {
			if (arg6 == 0 || arg6 == 1) {
				arg3 = -arg3;
				arg1 = -arg1;
			} else if (arg6 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg4 == 3) {
			if (arg6 == 0 || arg6 == 1) {
				local34 = arg3;
				arg3 = -arg1;
				arg1 = local34;
			} else if (arg6 == 3) {
				local34 = arg3;
				arg3 = arg1;
				arg1 = local34;
			} else if (arg6 == 2) {
				local34 = arg3;
				arg3 = arg1 & 0x3FFF;
				arg1 = -local34 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.xa(arg6, arg2, arg3, arg0, arg1, arg4, arg7);
		} else {
			this.va(arg6, arg2, arg3, arg0, arg1, arg7, arg8, arg5);
		}
	}

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected abstract void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
	public abstract void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
	public abstract int VA();

	@OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
	protected abstract boolean FA();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IIIZLclient!dr;Lclient!dr;IIII)V")
	public final void method5683(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class2_Sub2_Sub7 arg4, @OriginalArg(6) Class2_Sub2_Sub7 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg1 == -1 || !this.FA()) {
			return;
		}
		@Pc(17) Class189 local17 = arg4.aClass189Array1[arg1];
		@Pc(20) Class2_Sub35 local20 = local17.aClass2_Sub35_1;
		@Pc(22) Class189 local22 = null;
		if (arg5 != null) {
			local22 = arg5.aClass189Array1[arg7];
			if (local20 != local22.aClass2_Sub35_1) {
				local22 = null;
			}
		}
		this.method5680(arg2, arg8, null, false, arg0, 0, arg6, local17, local22, local20, arg3);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
	public abstract void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
	public abstract void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	public abstract void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILclient!na;IIII)V")
	protected final void method5685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class106 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg0 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(31) int local31 = arg4.va(arg5 + local16, local21 + arg1);
		@Pc(35) int local35 = arg0 / 2;
		@Pc(40) int local40 = -arg7 / 2;
		@Pc(49) int local49 = arg4.va(arg5 + local35, local40 + arg1);
		@Pc(54) int local54 = -arg0 / 2;
		@Pc(58) int local58 = arg7 / 2;
		@Pc(68) int local68 = arg4.va(local54 + arg5, arg1 - -local58);
		@Pc(72) int local72 = arg0 / 2;
		@Pc(76) int local76 = arg7 / 2;
		@Pc(85) int local85 = arg4.va(arg5 + local72, arg1 + local76);
		@Pc(96) int local96 = local31 < local49 ? local31 : local49;
		@Pc(107) int local107 = local68 >= local85 ? local85 : local68;
		@Pc(114) int local114 = local85 > local49 ? local49 : local85;
		@Pc(125) int local125 = local68 > local31 ? local31 : local68;
		@Pc(167) int local167;
		if (arg7 != 0) {
			@Pc(141) int local141 = (int) (Math.atan2((double) (local96 - local107), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local141 != 0) {
				if (arg3 != 0) {
					if (local141 > 8192) {
						local167 = 16384 - arg3;
						if (local167 > local141) {
							local141 = local167;
						}
					} else if (arg3 < local141) {
						local141 = arg3;
					}
				}
				this.WA(local141);
			}
		}
		if (arg0 != 0) {
			@Pc(191) int local191 = (int) (Math.atan2((double) (local125 - local114), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local191 != 0) {
				if (arg2 != 0) {
					if (local191 > 8192) {
						local167 = 16384 - arg2;
						if (local167 > local191) {
							local191 = local167;
						}
					} else if (arg2 < local191) {
						local191 = arg2;
					}
				}
				this.o(local191);
			}
		}
		@Pc(233) int local233 = local31 + local85;
		if (local233 > local49 + local68) {
			local233 = local68 + local49;
		}
		local233 = (local233 >> 1) - arg6;
		if (local233 != 0) {
			this.ja(0, local233, 0);
		}
	}

	@OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
	public abstract int ra();
}
