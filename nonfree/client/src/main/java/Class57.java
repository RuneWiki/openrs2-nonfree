import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public abstract class Class57 {

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	protected Class57() {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!cc;ZLclient!cc;ILclient!cc;Lclient!cc;IIIIIIB[Z)V")
	public final void method5949(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1_Sub5_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub5_Sub2 arg5, @OriginalArg(6) Class1_Sub5_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(14) boolean[] arg13) {
		if (arg9 == -1) {
			return;
		}
		if (arg13 == null || arg0 == -1) {
			this.method5962(arg3, 0, arg10, arg4, arg7, arg9, arg2, arg5);
		} else if (this.h()) {
			@Pc(43) Class251 local43 = arg3.aClass251Array1[arg9];
			@Pc(46) Class1_Sub37 local46 = local43.aClass1_Sub37_1;
			@Pc(48) Class251 local48 = null;
			if (arg5 != null) {
				local48 = arg5.aClass251Array1[arg7];
				if (local48.aClass1_Sub37_1 != local46) {
					local48 = null;
				}
			}
			this.method5951(arg13, null, arg4, 0, local48, false, arg10, 65535, local46, local43, arg2);
			@Pc(80) Class251 local80 = arg6.aClass251Array1[arg0];
			@Pc(82) Class251 local82 = null;
			if (arg1 != null) {
				local82 = arg1.aClass251Array1[arg8];
				if (local82.aClass1_Sub37_1 != local46) {
					local82 = null;
				}
			}
			this.va(0, new int[0], 0, 0, 0, 0, arg2);
			this.method5951(arg13, null, arg11, 0, local82, true, arg12, 65535, local80.aClass1_Sub37_1, local80, arg2);
			this.KA();
		}
	}

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
	public abstract int Z();

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
	public abstract int ta();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public abstract void method5950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
	public abstract int k();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([Z[IIILclient!vg;ZIILclient!r;Lclient!vg;IZ)V")
	private void method5951(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class251 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub37 arg8, @OriginalArg(9) Class251 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(14) int local14;
		if (arg4 == null || arg2 == 0) {
			for (local14 = 0; local14 < arg9.anInt7156; local14++) {
				@Pc(21) short local21 = arg9.aShortArray106[local14];
				if (arg0 == null || arg0[local21] == arg5 || arg8.anIntArray401[local21] == 0) {
					@Pc(45) short local45 = arg9.aShortArray108[local14];
					if (local45 != -1) {
						this.method5955(0, arg8.anIntArray402[local45] & arg7, arg10, 0, arg8.anIntArrayArray51[local45], arg1, arg3, 0, 0);
					}
					this.method5955(arg9.aShortArray103[local14], arg8.anIntArray402[local21] & arg7, arg10, arg9.aShortArray107[local14], arg8.anIntArrayArray51[local21], arg1, arg3, arg8.anIntArray401[local21], arg9.aShortArray111[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(114) int local114 = 0;
		for (@Pc(116) int local116 = 0; local116 < arg8.anInt5830; local116++) {
			@Pc(126) boolean local126 = false;
			if (local14 < arg9.anInt7156 && local116 == arg9.aShortArray106[local14]) {
				local126 = true;
			}
			@Pc(140) boolean local140 = false;
			if (arg4.anInt7156 > local114 && local116 == arg4.aShortArray106[local114]) {
				local140 = true;
			}
			if (local126 || local140) {
				if (arg0 == null || arg0[local116] == arg5 || arg8.anIntArray401[local116] == 0) {
					@Pc(186) short local186 = 0;
					@Pc(191) int local191 = arg8.anIntArray401[local116];
					if (local191 == 3 || local191 == 10) {
						local186 = 128;
					}
					@Pc(203) short local203;
					@Pc(207) short local207;
					@Pc(205) short local205;
					@Pc(211) short local211;
					@Pc(209) byte local209;
					if (local126) {
						local211 = arg9.aShortArray108[local14];
						local203 = arg9.aShortArray107[local14];
						local205 = arg9.aShortArray111[local14];
						local209 = arg9.aByteArray89[local14];
						local207 = arg9.aShortArray103[local14];
						local14++;
					} else {
						local203 = local186;
						local205 = local186;
						local207 = local186;
						local209 = 0;
						local211 = -1;
					}
					@Pc(246) short local246;
					@Pc(251) short local251;
					@Pc(261) short local261;
					@Pc(266) short local266;
					@Pc(256) byte local256;
					if (local140) {
						local246 = arg4.aShortArray107[local114];
						local251 = arg4.aShortArray103[local114];
						local256 = arg4.aByteArray89[local114];
						local261 = arg4.aShortArray111[local114];
						local266 = arg4.aShortArray108[local114];
						local114++;
					} else {
						local261 = local186;
						local266 = -1;
						local256 = 0;
						local246 = local186;
						local251 = local186;
					}
					@Pc(333) int local333;
					@Pc(343) int local343;
					@Pc(359) int local359;
					if ((local209 & 0x2) == 0 && (local256 & 0x1) == 0) {
						@Pc(297) int local297;
						if (local191 == 2) {
							local297 = local246 - local203 & 0x3FFF;
							@Pc(304) int local304 = local251 - local207 & 0x3FFF;
							if (local304 >= 8192) {
								local304 -= 16384;
							}
							if (local297 >= 8192) {
								local297 -= 16384;
							}
							@Pc(323) int local323 = local261 - local205 & 0x3FFF;
							local333 = local203 + arg2 * local297 / arg6 & 0x3FFF;
							local343 = arg2 * local304 / arg6 + local207 & 0x3FFF;
							if (local323 >= 8192) {
								local323 -= 16384;
							}
							local359 = arg2 * local323 / arg6 + local205 & 0x3FFF;
						} else if (local191 == 9) {
							local297 = local246 - local203 & 0x3FFF;
							if (local297 >= 8192) {
								local297 -= 16384;
							}
							local333 = local297 * arg2 / arg6 + local203 & 0x3FFF;
							local359 = 0;
							local343 = 0;
						} else if (local191 == 7) {
							local297 = local246 - local203 & 0x3F;
							if (local297 >= 32) {
								local297 -= 64;
							}
							local343 = (local251 - local207) * arg2 / arg6 + local207;
							local359 = local205 + (local261 - local205) * arg2 / arg6;
							local333 = local203 + arg2 * local297 / arg6 & 0x3F;
						} else {
							local333 = local203 + (local246 - local203) * arg2 / arg6;
							local359 = local205 + (local261 - local205) * arg2 / arg6;
							local343 = (local251 - local207) * arg2 / arg6 + local207;
						}
					} else {
						local333 = local203;
						local343 = local207;
						local359 = local205;
					}
					if (local211 != -1) {
						this.method5955(0, arg7 & arg8.anIntArray402[local211], arg10, 0, arg8.anIntArrayArray51[local211], arg1, arg3, 0, 0);
					} else if (local266 != -1) {
						this.method5955(0, arg8.anIntArray402[local266] & arg7, arg10, 0, arg8.anIntArrayArray51[local266], arg1, arg3, 0, 0);
					}
					this.method5955(local343, arg7 & arg8.anIntArray402[local116], arg10, local333, arg8.anIntArrayArray51[local116], arg1, arg3, local191, local359);
				} else {
					if (local140) {
						local114++;
					}
					if (local126) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
	public abstract void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()Z")
	public abstract boolean method5952();

	@OriginalMember(owner = "client!e", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!ut;I)V")
	public abstract void method5953(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILclient!ya;IIIII)V")
	protected final void method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class157 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg5 / 2;
		@Pc(21) int local21 = -arg6 / 2;
		@Pc(30) int local30 = arg3.ca(local16 + arg2, local21 + arg0);
		@Pc(34) int local34 = arg5 / 2;
		@Pc(39) int local39 = -arg6 / 2;
		@Pc(48) int local48 = arg3.ca(arg2 + local34, arg0 + local39);
		@Pc(53) int local53 = -arg5 / 2;
		@Pc(57) int local57 = arg6 / 2;
		@Pc(66) int local66 = arg3.ca(arg2 + local53, local57 + arg0);
		@Pc(70) int local70 = arg5 / 2;
		@Pc(74) int local74 = arg6 / 2;
		@Pc(84) int local84 = arg3.ca(arg2 + local70, arg0 + local74);
		@Pc(91) int local91 = local30 >= local48 ? local48 : local30;
		@Pc(98) int local98 = local66 < local84 ? local66 : local84;
		@Pc(109) int local109 = local84 > local48 ? local48 : local84;
		@Pc(141) int local141;
		if (arg6 != 0) {
			@Pc(125) int local125 = (int) (Math.atan2((double) (local91 - local98), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local125 != 0) {
				if (arg7 != 0) {
					if (local125 > 8192) {
						local141 = 16384 - arg7;
						if (local141 > local125) {
							local125 = local141;
						}
					} else if (arg7 < local125) {
						local125 = arg7;
					}
				}
				this.W(local125);
			}
		}
		@Pc(171) int local171 = local66 <= local30 ? local66 : local30;
		@Pc(175) int local175 = local84 + local30;
		if (arg5 != 0) {
			@Pc(194) int local194 = (int) (Math.atan2((double) (local171 - local109), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local194 != 0) {
				if (arg4 != 0) {
					if (local194 > 8192) {
						local141 = 16384 - arg4;
						if (local141 > local194) {
							local194 = local141;
						}
					} else if (local194 > arg4) {
						local194 = arg4;
					}
				}
				this.K(local194);
			}
		}
		if (local48 + local66 < local175) {
			local175 = local48 + local66;
		}
		local175 = (local175 >> 1) - arg1;
		if (local175 != 0) {
			this.a(0, local175, 0);
		}
	}

	@OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZI[I[IBIII)V")
	private void method5955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(21) int local21;
		if (arg6 == 1) {
			if (arg7 == 0 || arg7 == 1) {
				local21 = -arg3;
				arg3 = arg8;
				arg8 = local21;
			} else if (arg7 == 3) {
				local21 = arg3;
				arg3 = arg8;
				arg8 = local21;
			} else if (arg7 == 2) {
				local21 = arg3;
				arg3 = -arg8 & 0x3FFF;
				arg8 = local21 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg7 == 0 || arg7 == 1) {
				arg8 = -arg8;
				arg3 = -arg3;
			} else if (arg7 == 2) {
				arg3 = -arg3 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg7 == 0 || arg7 == 1) {
				local21 = arg3;
				arg3 = -arg8;
				arg8 = local21;
			} else if (arg7 == 3) {
				local21 = arg3;
				arg3 = arg8;
				arg8 = local21;
			} else if (arg7 == 2) {
				local21 = arg3;
				arg3 = arg8 & 0x3FFF;
				arg8 = -local21 & 0x3FFF;
			}
		}
		if (arg1 == 65535) {
			this.va(arg7, arg4, arg3, arg0, arg8, arg6, arg2);
		} else {
			this.aa(arg7, arg4, arg3, arg0, arg8, arg2, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
	public abstract void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	public abstract void method5956(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!e", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public abstract Class1_Sub5_Sub10 EA(@OriginalArg(0) Class1_Sub5_Sub10 arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method5957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()[Lclient!su;")
	public abstract Class229[] method5958();

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()[Lclient!op;")
	public abstract Class181[] method5959();

	@OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
	public abstract int S();

	@OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
	protected abstract boolean h();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZIIII[ILclient!cc;Lclient!cc;)V")
	public final void method5961(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) Class1_Sub5_Sub2 arg7, @OriginalArg(10) Class1_Sub5_Sub2 arg8) {
		if (arg4 == -1 || !this.h()) {
			return;
		}
		@Pc(17) Class251 local17 = arg8.aClass251Array1[arg4];
		@Pc(20) Class1_Sub37 local20 = local17.aClass1_Sub37_1;
		@Pc(22) Class251 local22 = null;
		if (arg7 != null) {
			local22 = arg7.aClass251Array1[arg0];
			if (local22.aClass1_Sub37_1 != local20) {
				local22 = null;
			}
		}
		this.method5951(null, arg6, arg3, 0, local22, false, arg5, arg1, local20, local17, arg2);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
	public abstract void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
	public abstract void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cc;IIIIIIZLclient!cc;)V")
	public final void method5962(@OriginalArg(0) Class1_Sub5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class1_Sub5_Sub2 arg7) {
		if (arg5 == -1 || !this.h()) {
			return;
		}
		@Pc(21) Class251 local21 = arg0.aClass251Array1[arg5];
		@Pc(24) Class1_Sub37 local24 = local21.aClass1_Sub37_1;
		@Pc(26) Class251 local26 = null;
		if (arg7 != null) {
			local26 = arg7.aClass251Array1[arg4];
			if (local26.aClass1_Sub37_1 != local24) {
				local26 = null;
			}
		}
		this.method5951(null, null, arg3, arg1, local26, false, arg2, 65535, local24, local21, arg6);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
	public abstract int MA();

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()V")
	public abstract void method5963();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!cc;)V")
	public final void method5964(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5_Sub2 arg1) {
		if (arg0 == -1 || !this.h()) {
			return;
		}
		@Pc(20) Class251 local20 = arg1.aClass251Array1[arg0];
		@Pc(23) Class1_Sub37 local23 = local20.aClass1_Sub37_1;
		for (@Pc(25) int local25 = 0; local25 < local20.anInt7156; local25++) {
			@Pc(32) short local32 = local20.aShortArray106[local25];
			if (local23.aBooleanArray20[local32]) {
				if (local20.aShortArray108[local25] != -1) {
					this.za(0, 0, 0, 0);
				}
				this.za(local23.anIntArray401[local32], local20.aShortArray107[local25], local20.aShortArray103[local25], local20.aShortArray111[local25]);
			}
		}
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
	public abstract void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
	public abstract void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Lclient!e;")
	public abstract Class57 method5966(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!ut;II)V")
	public abstract void method5967(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
	public abstract int B();

	@OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
	protected abstract void KA();
}
