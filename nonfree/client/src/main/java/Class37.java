import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class37 {

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	protected Class37() {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lclient!c;")
	public abstract Class37 method4221(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	public abstract void method4222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!nh;II)V")
	public abstract void method4223(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class39_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
	public abstract int C();

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!d;ZLclient!d;III)V")
	public final void method4224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub2_Sub6 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1_Sub2_Sub6 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 == -1 || !this.FA()) {
			return;
		}
		@Pc(21) Class247 local21 = arg5.aClass247Array1[arg1];
		@Pc(24) Class1_Sub16 local24 = local21.aClass1_Sub16_1;
		@Pc(26) Class247 local26 = null;
		if (arg3 != null) {
			local26 = arg3.aClass247Array1[arg6];
			if (local26.aClass1_Sub16_1 != local24) {
				local26 = null;
			}
		}
		this.method4235(null, 65535, arg7, arg0, local24, local26, false, arg4, local21, arg2, null);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lclient!vj;")
	public abstract Class252[] method4225();

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII[I[IZBII)V")
	private void method4226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(64) int local64;
		if (arg2 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local64 = -arg8;
				arg8 = arg3;
				arg3 = local64;
			} else if (arg1 == 3) {
				local64 = arg8;
				arg8 = arg3;
				arg3 = local64;
			} else if (arg1 == 2) {
				local64 = arg8;
				arg8 = -arg3 & 0x3FFF;
				arg3 = local64 & 0x3FFF;
			}
		} else if (arg2 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg8 = -arg8;
				arg3 = -arg3;
			} else if (arg1 == 2) {
				arg3 = -arg3 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg2 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local64 = arg8;
				arg8 = -arg3;
				arg3 = local64;
			} else if (arg1 == 3) {
				local64 = arg8;
				arg8 = arg3;
				arg3 = local64;
			} else if (arg1 == 2) {
				local64 = arg8;
				arg8 = arg3 & 0x3FFF;
				arg3 = -local64 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.xa(arg1, arg4, arg8, arg0, arg3, arg2, arg6);
		} else {
			this.va(arg1, arg4, arg8, arg0, arg3, arg6, arg7, arg5);
		}
	}

	@OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
	public abstract void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class136 arg2, @OriginalArg(3) Class136 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([IIILclient!d;BIILclient!d;ZII)V")
	public final void method4227(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub2_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class1_Sub2_Sub6 arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg2 == -1 || !this.FA()) {
			return;
		}
		@Pc(16) Class247 local16 = arg3.aClass247Array1[arg2];
		@Pc(25) Class1_Sub16 local25 = local16.aClass1_Sub16_1;
		@Pc(27) Class247 local27 = null;
		if (arg5 != null) {
			local27 = arg5.aClass247Array1[arg1];
			if (local25 != local27.aClass1_Sub16_1) {
				local27 = null;
			}
		}
		this.method4235(null, arg8, arg7, arg4, local25, local27, false, arg6, local16, 0, arg0);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!ia;Z)Z")
	public abstract boolean method4228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
	public abstract int la();

	@OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
	public abstract void sa();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!nh;I)V")
	public abstract void method4230(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class39_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
	public abstract int VA();

	@OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
	protected abstract boolean FA();

	@OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public abstract Class1_Sub2_Sub11 ua(@OriginalArg(0) Class1_Sub2_Sub11 arg0);

	@OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
	protected abstract void W();

	@OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
	public abstract void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()[Lclient!it;")
	public abstract Class122[] method4232();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBLclient!d;)V")
	public final void method4233(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub2_Sub6 arg1) {
		if (arg0 == -1 || !this.FA()) {
			return;
		}
		@Pc(18) Class247 local18 = arg1.aClass247Array1[arg0];
		@Pc(21) Class1_Sub16 local21 = local18.aClass1_Sub16_1;
		for (@Pc(31) int local31 = 0; local31 < local18.anInt7248; local31++) {
			@Pc(38) short local38 = local18.aShortArray100[local31];
			if (local21.aBooleanArray9[local38]) {
				if (local18.aShortArray101[local31] != -1) {
					this.K(0, 0, 0, 0);
				}
				this.K(local21.anIntArray221[local38], local18.aShortArray98[local31], local18.aShortArray94[local31], local18.aShortArray92[local31]);
			}
		}
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
	public abstract void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIILclient!na;BI)V")
	protected final void method4234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class136 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg3 / 2;
		@Pc(21) int local21 = -arg2 / 2;
		@Pc(30) int local30 = arg6.va(local16 + arg5, local21 + arg7);
		@Pc(34) int local34 = arg3 / 2;
		@Pc(39) int local39 = -arg2 / 2;
		@Pc(48) int local48 = arg6.va(local34 + arg5, arg7 + local39);
		@Pc(53) int local53 = -arg3 / 2;
		@Pc(57) int local57 = arg2 / 2;
		@Pc(70) int local70 = arg6.va(local53 + arg5, local57 + arg7);
		@Pc(74) int local74 = arg3 / 2;
		@Pc(78) int local78 = arg2 / 2;
		@Pc(88) int local88 = arg6.va(local74 + arg5, arg7 - -local78);
		@Pc(95) int local95 = local30 >= local48 ? local48 : local30;
		@Pc(102) int local102 = local88 > local70 ? local70 : local88;
		@Pc(109) int local109 = local88 > local48 ? local48 : local88;
		@Pc(116) int local116 = local30 >= local70 ? local70 : local30;
		@Pc(151) int local151;
		if (arg2 != 0) {
			@Pc(132) int local132 = (int) (Math.atan2((double) (local95 - local102), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local132 != 0) {
				if (arg1 != 0) {
					if (local132 > 8192) {
						local151 = 16384 - arg1;
						if (local151 > local132) {
							local132 = local151;
						}
					} else if (local132 > arg1) {
						local132 = arg1;
					}
				}
				this.WA(local132);
			}
		}
		if (arg3 != 0) {
			@Pc(184) int local184 = (int) (Math.atan2((double) (local116 - local109), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local184 != 0) {
				if (arg4 != 0) {
					if (local184 > 8192) {
						local151 = 16384 - arg4;
						if (local184 < local151) {
							local184 = local151;
						}
					} else if (local184 > arg4) {
						local184 = arg4;
					}
				}
				this.o(local184);
			}
		}
		@Pc(221) int local221 = local30 + local88;
		if (local221 > local48 + local70) {
			local221 = local48 + local70;
		}
		local221 = (local221 >> 1) - arg0;
		if (local221 != 0) {
			this.ja(0, local221, 0);
		}
	}

	@OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
	public abstract void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([ZIIILclient!gr;Lclient!vb;ZZLclient!vb;II[I)V")
	private void method4235(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub16 arg4, @OriginalArg(5) Class247 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class247 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10) {
		@Pc(14) int local14;
		if (arg5 == null || arg3 == 0) {
			for (local14 = 0; local14 < arg8.anInt7248; local14++) {
				@Pc(21) short local21 = arg8.aShortArray100[local14];
				if (arg0 == null || arg6 == arg0[local21] || arg4.anIntArray221[local21] == 0) {
					@Pc(46) short local46 = arg8.aShortArray101[local14];
					if (local46 != -1) {
						this.method4226(0, 0, arg9, 0, arg4.anIntArrayArray68[local46], arg10, arg7, arg1 & arg4.anIntArray222[local46], 0);
					}
					this.method4226(arg8.aShortArray94[local14], arg4.anIntArray221[local21], arg9, arg8.aShortArray92[local14], arg4.anIntArrayArray68[local21], arg10, arg7, arg1 & arg4.anIntArray222[local21], arg8.aShortArray98[local14]);
				}
			}
			return;
		}
		local14 = 0;
		@Pc(121) int local121 = 0;
		for (@Pc(123) int local123 = 0; local123 < arg4.anInt2345; local123++) {
			@Pc(127) boolean local127 = false;
			if (local14 < arg8.anInt7248 && arg8.aShortArray100[local14] == local123) {
				local127 = true;
			}
			@Pc(145) boolean local145 = false;
			if (arg5.anInt7248 > local121 && local123 == arg5.aShortArray100[local121]) {
				local145 = true;
			}
			if (local127 || local145) {
				if (arg0 == null || arg0[local123] == arg6 || arg4.anIntArray221[local123] == 0) {
					@Pc(191) short local191 = 0;
					@Pc(196) int local196 = arg4.anIntArray221[local123];
					if (local196 == 3 || local196 == 10) {
						local191 = 128;
					}
					@Pc(208) short local208;
					@Pc(214) short local214;
					@Pc(216) short local216;
					@Pc(212) short local212;
					@Pc(210) byte local210;
					if (local127) {
						local216 = arg8.aShortArray92[local14];
						local210 = arg8.aByteArray85[local14];
						local208 = arg8.aShortArray98[local14];
						local212 = arg8.aShortArray101[local14];
						local214 = arg8.aShortArray94[local14];
						local14++;
					} else {
						local208 = local191;
						local210 = 0;
						local212 = -1;
						local214 = local191;
						local216 = local191;
					}
					@Pc(256) short local256;
					@Pc(254) short local254;
					@Pc(252) short local252;
					@Pc(248) short local248;
					@Pc(250) byte local250;
					if (local145) {
						local248 = arg5.aShortArray101[local121];
						local256 = arg5.aShortArray98[local121];
						local252 = arg5.aShortArray92[local121];
						local254 = arg5.aShortArray94[local121];
						local250 = arg5.aByteArray85[local121];
						local121++;
					} else {
						local248 = -1;
						local250 = 0;
						local252 = local191;
						local254 = local191;
						local256 = local191;
					}
					@Pc(320) int local320;
					@Pc(331) int local331;
					@Pc(341) int local341;
					if ((local210 & 0x2) == 0 && (local250 & 0x1) == 0) {
						@Pc(349) int local349;
						if (local196 == 2) {
							local349 = local256 - local208 & 0x3FFF;
							@Pc(430) int local430 = local254 - local214 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							@Pc(442) int local442 = local252 - local216 & 0x3FFF;
							if (local430 >= 8192) {
								local430 -= 16384;
							}
							if (local442 >= 8192) {
								local442 -= 16384;
							}
							local331 = local214 + arg3 * local430 / arg2 & 0x3FFF;
							local320 = local208 + local349 * arg3 / arg2 & 0x3FFF;
							local341 = local216 + arg3 * local442 / arg2 & 0x3FFF;
						} else if (local196 == 9) {
							local349 = local256 - local208 & 0x3FFF;
							if (local349 >= 8192) {
								local349 -= 16384;
							}
							local320 = arg3 * local349 / arg2 + local208 & 0x3FFF;
							local341 = 0;
							local331 = 0;
						} else if (local196 == 7) {
							local349 = local256 - local208 & 0x3F;
							if (local349 >= 32) {
								local349 -= 64;
							}
							local331 = local214 + (local254 - local214) * arg3 / arg2;
							local341 = local216 + (local252 - local216) * arg3 / arg2;
							local320 = arg3 * local349 / arg2 + local208 & 0x3F;
						} else {
							local320 = (local256 - local208) * arg3 / arg2 + local208;
							local331 = arg3 * (local254 - local214) / arg2 + local214;
							local341 = local216 + (local252 - local216) * arg3 / arg2;
						}
					} else {
						local320 = local208;
						local341 = local216;
						local331 = local214;
					}
					if (local212 != -1) {
						this.method4226(0, 0, arg9, 0, arg4.anIntArrayArray68[local212], arg10, arg7, arg1 & arg4.anIntArray222[local212], 0);
					} else if (local248 != -1) {
						this.method4226(0, 0, arg9, 0, arg4.anIntArrayArray68[local248], arg10, arg7, arg1 & arg4.anIntArray222[local248], 0);
					}
					this.method4226(local331, local196, arg9, local341, arg4.anIntArrayArray68[local123], arg10, arg7, arg1 & arg4.anIntArray222[local123], local320);
				} else {
					if (local145) {
						local121++;
					}
					if (local127) {
						local14++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
	public abstract void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()V")
	public abstract void method4236();

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
	public abstract void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
	public abstract int X();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	public abstract void method4237(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()Z")
	public abstract boolean method4238();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZIZLclient!d;IIILclient!d;Lclient!d;I[ZLclient!d;II)V")
	public final void method4239(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub2_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub2_Sub6 arg7, @OriginalArg(9) Class1_Sub2_Sub6 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) Class1_Sub2_Sub6 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg9 == -1) {
			return;
		}
		if (arg10 == null || arg4 == -1) {
			this.method4224(arg6, arg9, 0, arg7, arg1, arg11, arg13, arg5);
		} else if (this.FA()) {
			@Pc(33) Class247 local33 = arg11.aClass247Array1[arg9];
			@Pc(36) Class1_Sub16 local36 = local33.aClass1_Sub16_1;
			@Pc(38) Class247 local38 = null;
			if (arg7 != null) {
				local38 = arg7.aClass247Array1[arg13];
				if (local36 != local38.aClass1_Sub16_1) {
					local38 = null;
				}
			}
			this.method4235(arg10, 65535, arg5, arg6, local36, local38, false, arg1, local33, 0, null);
			@Pc(70) Class247 local70 = arg3.aClass247Array1[arg4];
			@Pc(72) Class247 local72 = null;
			if (arg8 != null) {
				local72 = arg8.aClass247Array1[arg0];
				if (local36 != local72.aClass1_Sub16_1) {
					local72 = null;
				}
			}
			this.xa(0, new int[0], 0, 0, 0, 0, arg1);
			this.method4235(arg10, 65535, arg2, arg12, local70.aClass1_Sub16_1, local72, true, arg1, local70, 0, null);
			this.W();
		}
	}

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
	protected abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
	public abstract void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
	public abstract int ra();

	@OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
	public abstract void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected abstract void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);
}
