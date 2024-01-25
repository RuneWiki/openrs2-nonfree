import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public abstract class Class40 {

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
	protected Class40() {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()I")
	public abstract int method4572();

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()I")
	public abstract int method4573();

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "()I")
	public abstract int method4574();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z[ILclient!rf;IIIIILclient!rf;ZI)V")
	public final void method4575(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class1_Sub2_Sub13 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub2_Sub13 arg7, @OriginalArg(9) boolean arg8) {
		if (arg5 == -1 || !this.method4598()) {
			return;
		}
		@Pc(22) Class184 local22 = arg1.aClass184Array1[arg5];
		@Pc(25) Class1_Sub28 local25 = local22.aClass1_Sub28_1;
		@Pc(27) Class184 local27 = null;
		if (arg7 != null) {
			local27 = arg7.aClass184Array1[arg3];
			if (local25 != local27.aClass1_Sub28_1) {
				local27 = null;
			}
		}
		this.method4578(arg2, arg8, null, false, arg4, local22, arg0, 0, local25, local27, arg6);
		this.method4609();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!ck;IBII)V")
	protected final void method4576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = -arg5 / 2;
		@Pc(24) int local24 = -arg4 / 2;
		@Pc(34) int local34 = arg2.method2698(arg1 + local19, local24 + arg0);
		@Pc(38) int local38 = arg5 / 2;
		@Pc(43) int local43 = -arg4 / 2;
		@Pc(53) int local53 = arg2.method2698(arg1 + local38, arg0 + local43);
		@Pc(58) int local58 = -arg5 / 2;
		@Pc(62) int local62 = arg4 / 2;
		@Pc(71) int local71 = arg2.method2698(arg1 + local58, local62 + arg0);
		@Pc(75) int local75 = arg5 / 2;
		@Pc(79) int local79 = arg4 / 2;
		@Pc(89) int local89 = arg2.method2698(local75 + arg1, arg0 - -local79);
		@Pc(100) int local100 = local53 > local34 ? local34 : local53;
		@Pc(111) int local111 = local71 >= local89 ? local89 : local71;
		@Pc(118) int local118 = local53 >= local89 ? local89 : local53;
		if (arg4 != 0) {
			@Pc(134) int local134 = (int) (Math.atan2((double) (local100 - local111), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local134 != 0) {
				this.method4591(local134);
			}
		}
		@Pc(150) int local150 = local34 >= local71 ? local71 : local34;
		if (arg5 != 0) {
			@Pc(169) int local169 = (int) (Math.atan2((double) (local150 - local118), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local169 != 0) {
				this.method4583(local169);
			}
		}
		@Pc(181) int local181 = local89 + local34;
		if (local71 + local53 < local181) {
			local181 = local53 + local71;
		}
		local181 = (local181 >> 1) - arg3;
		if (local181 != 0) {
			this.method4612(0, local181, 0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "()I")
	public abstract int method4577();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ[ZZILclient!sh;[IILclient!ms;Lclient!sh;I)V")
	private void method4578(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class184 arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class1_Sub28 arg8, @OriginalArg(10) Class184 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg9 == null || arg10 == 0) {
			for (local11 = 0; local11 < arg5.anInt5683; local11++) {
				@Pc(18) short local18 = arg5.aShortArray90[local11];
				if (arg2 == null || arg3 == arg2[local18] || arg8.anIntArray382[local18] == 0) {
					@Pc(39) short local39 = arg5.aShortArray94[local11];
					if (local39 != -1) {
						this.method4605(arg1, arg8.anIntArrayArray35[local39], 0, 0, arg0 & arg8.anIntArray383[local39], 0, 0, arg6, arg7);
					}
					this.method4605(arg1, arg8.anIntArrayArray35[local18], arg8.anIntArray382[local18], arg5.aShortArray92[local11], arg8.anIntArray383[local18] & arg0, arg5.aShortArray98[local11], arg5.aShortArray91[local11], arg6, arg7);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(104) int local104 = 0;
		for (@Pc(110) int local110 = 0; local110 < arg8.anInt3984; local110++) {
			@Pc(114) boolean local114 = false;
			if (arg5.anInt5683 > local11 && local110 == arg5.aShortArray90[local11]) {
				local114 = true;
			}
			@Pc(128) boolean local128 = false;
			if (local104 < arg9.anInt5683 && local110 == arg9.aShortArray90[local104]) {
				local128 = true;
			}
			if (local114 || local128) {
				if (arg2 == null || arg3 == arg2[local110] || arg8.anIntArray382[local110] == 0) {
					@Pc(169) short local169 = 0;
					@Pc(174) int local174 = arg8.anIntArray382[local110];
					if (local174 == 3) {
						local169 = 128;
					}
					@Pc(186) short local186;
					@Pc(201) short local201;
					@Pc(196) short local196;
					@Pc(206) short local206;
					@Pc(191) byte local191;
					if (local114) {
						local186 = arg5.aShortArray92[local11];
						local191 = arg5.aByteArray64[local11];
						local196 = arg5.aShortArray91[local11];
						local201 = arg5.aShortArray98[local11];
						local206 = arg5.aShortArray94[local11];
						local11++;
					} else {
						local186 = local169;
						local191 = 0;
						local196 = local169;
						local206 = -1;
						local201 = local169;
					}
					@Pc(226) short local226;
					@Pc(231) short local231;
					@Pc(241) short local241;
					@Pc(246) short local246;
					@Pc(236) byte local236;
					if (local128) {
						local226 = arg9.aShortArray92[local104];
						local231 = arg9.aShortArray98[local104];
						local236 = arg9.aByteArray64[local104];
						local241 = arg9.aShortArray91[local104];
						local246 = arg9.aShortArray94[local104];
						local104++;
					} else {
						local226 = local169;
						local236 = 0;
						local241 = local169;
						local246 = -1;
						local231 = local169;
					}
					@Pc(272) int local272;
					@Pc(276) int local276;
					@Pc(274) int local274;
					if ((local191 & 0x2) == 0 && (local236 & 0x1) == 0) {
						@Pc(295) int local295;
						if (local174 == 2) {
							local295 = local226 - local186 & 0x3FFF;
							@Pc(384) int local384 = local231 - local201 & 0x3FFF;
							@Pc(390) int local390 = local241 - local196 & 0x3FFF;
							if (local295 >= 8192) {
								local295 -= 16384;
							}
							if (local384 >= 8192) {
								local384 -= 16384;
							}
							local276 = local384 * arg10 / arg4 + local201 & 0x3FFF;
							local272 = local186 + arg10 * local295 / arg4 & 0x3FFF;
							if (local390 >= 8192) {
								local390 -= 16384;
							}
							local274 = arg10 * local390 / arg4 + local196 & 0x3FFF;
						} else if (local174 == 7) {
							local295 = local226 - local186 & 0x3F;
							if (local295 >= 32) {
								local295 -= 64;
							}
							local276 = (local231 - local201) * arg10 / arg4 + local201;
							local274 = (local241 - local196) * arg10 / arg4 + local196;
							local272 = arg10 * local295 / arg4 + local186 & 0x3F;
						} else {
							local274 = (local241 - local196) * arg10 / arg4 + local196;
							local276 = local201 + (local231 - local201) * arg10 / arg4;
							local272 = local186 + arg10 * (local226 - local186) / arg4;
						}
					} else {
						local272 = local186;
						local274 = local196;
						local276 = local201;
					}
					if (local206 != -1) {
						this.method4605(arg1, arg8.anIntArrayArray35[local206], 0, 0, arg0 & arg8.anIntArray383[local206], 0, 0, arg6, arg7);
					} else if (local246 != -1) {
						this.method4605(arg1, arg8.anIntArrayArray35[local246], 0, 0, arg0 & arg8.anIntArray383[local246], 0, 0, arg6, arg7);
					}
					this.method4605(arg1, arg8.anIntArrayArray35[local110], local174, local272, arg0 & arg8.anIntArray383[local110], local276, local274, arg6, arg7);
				} else {
					if (local128) {
						local104++;
					}
					if (local114) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(SS)V")
	public abstract void method4579(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "()I")
	public abstract int method4580();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!dc;IIIZ)V")
	public abstract void method4581(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public abstract void method4582(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public abstract void method4583(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([ZIILclient!rf;IILclient!rf;IIIILclient!rf;ILclient!rf;Z)V")
	public final void method4584(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub2_Sub13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub2_Sub13 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class1_Sub2_Sub13 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class1_Sub2_Sub13 arg12, @OriginalArg(14) boolean arg13) {
		if (arg6 == -1) {
			return;
		}
		if (arg0 == null || arg7 == -1) {
			this.method4596(arg6, arg8, arg12, arg1, arg9, 0, arg5, arg13);
		} else if (this.method4598()) {
			@Pc(34) Class184 local34 = arg5.aClass184Array1[arg6];
			@Pc(37) Class1_Sub28 local37 = local34.aClass1_Sub28_1;
			@Pc(39) Class184 local39 = null;
			if (arg12 != null) {
				local39 = arg12.aClass184Array1[arg9];
				if (local37 != local39.aClass1_Sub28_1) {
					local39 = null;
				}
			}
			@Pc(57) Class184 local57 = arg10.aClass184Array1[arg7];
			@Pc(59) Class184 local59 = null;
			if (arg2 != null) {
				local59 = arg2.aClass184Array1[arg3];
				if (local59.aClass1_Sub28_1 != local37) {
					local59 = null;
				}
			}
			this.method4578(65535, arg13, arg0, false, arg8, local34, null, 0, local37, local39, arg1);
			this.method4618(0, new int[0], 0, 0, 0, 0, arg13);
			this.method4578(65535, arg13, arg0, true, arg11, local57, null, 0, local37, local59, arg4);
			this.method4609();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!ck;Lclient!ck;III)V")
	public abstract void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!vj;Lclient!kd;I)V")
	public abstract void method4587(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class7_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public abstract void method4588(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "()[Lclient!kg;")
	public abstract Class123[] method4589();

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	public abstract void method4591(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!vj;Lclient!kd;II)V")
	public abstract void method4592(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class7_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "()I")
	public abstract int method4593();

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "()V")
	public abstract void method4594();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!rf;IIIILclient!rf;Z)V")
	public final void method4596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub13 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub2_Sub13 arg6, @OriginalArg(8) boolean arg7) {
		if (arg0 == -1 || !this.method4598()) {
			return;
		}
		@Pc(21) Class184 local21 = arg6.aClass184Array1[arg0];
		@Pc(24) Class1_Sub28 local24 = local21.aClass1_Sub28_1;
		@Pc(26) Class184 local26 = null;
		if (arg2 != null) {
			local26 = arg2.aClass184Array1[arg4];
			if (local26.aClass1_Sub28_1 != local24) {
				local26 = null;
			}
		}
		this.method4578(65535, arg7, null, false, arg1, local21, null, arg5, local24, local26, arg3);
		this.method4609();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V")
	protected abstract void method4597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "()Z")
	protected abstract boolean method4598();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BIZ)Lclient!dc;")
	public abstract Class40 method4599(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
	public abstract void method4600(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V")
	public abstract void method4601(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "()I")
	public abstract int method4602();

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "()Z")
	public abstract boolean method4603();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method4604(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ[IIIIII[II)V")
	private void method4605(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		@Pc(68) int local68;
		if (arg8 == 1) {
			if (arg2 == 0 || arg2 == 1) {
				local68 = -arg3;
				arg3 = arg6;
				arg6 = local68;
			} else if (arg2 == 3) {
				local68 = arg3;
				arg3 = arg6;
				arg6 = local68;
			} else if (arg2 == 2) {
				local68 = arg3;
				arg3 = -arg6 & 0x3FFF;
				arg6 = local68 & 0x3FFF;
			}
		} else if (arg8 == 2) {
			if (arg2 == 0 || arg2 == 1) {
				arg6 = -arg6;
				arg3 = -arg3;
			} else if (arg2 == 2) {
				arg6 = -arg6 & 0x3FFF;
				arg3 = -arg3 & 0x3FFF;
			}
		} else if (arg8 == 3) {
			if (arg2 == 0 || arg2 == 1) {
				local68 = arg3;
				arg3 = -arg6;
				arg6 = local68;
			} else if (arg2 == 3) {
				local68 = arg3;
				arg3 = arg6;
				arg6 = local68;
			} else if (arg2 == 2) {
				local68 = arg3;
				arg3 = arg6 & 0x3FFF;
				arg6 = -local68 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.method4618(arg2, arg1, arg3, arg5, arg6, arg8, arg0);
		} else {
			this.method4604(arg2, arg1, arg3, arg5, arg6, arg0, arg4, arg7);
		}
	}

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "()[Lclient!ho;")
	public abstract Class100[] method4606();

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "()I")
	public abstract int method4607();

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "()I")
	public abstract int method4608();

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "()V")
	protected abstract void method4609();

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(SS)V")
	public abstract void method4610(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)V")
	public abstract void method4611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)V")
	public abstract void method4612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ri;)Lclient!ri;")
	public abstract Class1_Sub2_Sub5 method4613(@OriginalArg(0) Class1_Sub2_Sub5 arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!vj;Z)Z")
	public abstract boolean method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "()I")
	public abstract int method4616();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBLclient!rf;)V")
	public final void method4617(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub13 arg1) {
		if (arg0 == -1 || !this.method4598()) {
			return;
		}
		@Pc(24) Class184 local24 = arg1.aClass184Array1[arg0];
		@Pc(27) Class1_Sub28 local27 = local24.aClass1_Sub28_1;
		for (@Pc(29) int local29 = 0; local29 < local24.anInt5683; local29++) {
			@Pc(36) short local36 = local24.aShortArray90[local29];
			if (local27.aBooleanArray19[local36]) {
				if (local24.aShortArray94[local29] != -1) {
					this.method4597(0, 0, 0, 0);
				}
				this.method4597(local27.anIntArray382[local36], local24.aShortArray92[local29], local24.aShortArray98[local29], local24.aShortArray91[local29]);
			}
		}
		this.method4609();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method4618(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "()V")
	public abstract void method4619();

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "(I)V")
	public abstract void method4620(@OriginalArg(0) int arg0);
}
