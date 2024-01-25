import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public abstract class Class63 {

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	protected Class63() {
	}

	@OriginalMember(owner = "client!e", name = "h", descriptor = "()Z")
	protected abstract boolean h();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!nj;ZZZLclient!eb;[II[ZIIILclient!nj;)V")
	private void method6085(@OriginalArg(0) Class174 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class10_Sub13 arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class174 arg10) {
		@Pc(11) int local11;
		if (arg10 == null || arg5 == 0) {
			for (local11 = 0; local11 < arg0.anInt4761; local11++) {
				@Pc(18) short local18 = arg0.aShortArray78[local11];
				if (arg6 == null || arg1 == arg6[local18] || arg3.anIntArray148[local18] == 0) {
					@Pc(46) short local46 = arg0.aShortArray76[local11];
					if (local46 != -1) {
						this.method6095(0, arg4, 0, arg7, arg3.anIntArray149[local46] & arg8, 0, 0, arg2, arg3.anIntArrayArray15[local46]);
					}
					this.method6095(arg3.anIntArray148[local18], arg4, arg0.aShortArray82[local11], arg7, arg8 & arg3.anIntArray149[local18], arg0.aShortArray79[local11], arg0.aShortArray75[local11], arg2, arg3.anIntArrayArray15[local18]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(111) int local111 = 0;
		for (@Pc(118) int local118 = 0; local118 < arg3.anInt1841; local118++) {
			@Pc(122) boolean local122 = false;
			if (local11 < arg0.anInt4761 && arg0.aShortArray78[local11] == local118) {
				local122 = true;
			}
			@Pc(136) boolean local136 = false;
			if (local111 < arg10.anInt4761 && local118 == arg10.aShortArray78[local111]) {
				local136 = true;
			}
			if (local122 || local136) {
				if (arg6 == null || arg6[local118] == arg1 || arg3.anIntArray148[local118] == 0) {
					@Pc(177) short local177 = 0;
					@Pc(182) int local182 = arg3.anIntArray148[local118];
					if (local182 == 3 || local182 == 10) {
						local177 = 128;
					}
					@Pc(197) short local197;
					@Pc(207) short local207;
					@Pc(212) short local212;
					@Pc(202) short local202;
					@Pc(217) byte local217;
					if (local122) {
						local197 = arg0.aShortArray79[local11];
						local202 = arg0.aShortArray76[local11];
						local207 = arg0.aShortArray75[local11];
						local212 = arg0.aShortArray82[local11];
						local217 = arg0.aByteArray57[local11];
						local11++;
					} else {
						local202 = -1;
						local212 = local177;
						local197 = local177;
						local207 = local177;
						local217 = 0;
					}
					@Pc(237) short local237;
					@Pc(257) short local257;
					@Pc(242) short local242;
					@Pc(252) short local252;
					@Pc(247) byte local247;
					if (local136) {
						local237 = arg10.aShortArray79[local111];
						local242 = arg10.aShortArray82[local111];
						local247 = arg10.aByteArray57[local111];
						local252 = arg10.aShortArray76[local111];
						local257 = arg10.aShortArray75[local111];
						local111++;
					} else {
						local242 = local177;
						local247 = 0;
						local257 = local177;
						local252 = -1;
						local237 = local177;
					}
					@Pc(288) int local288;
					@Pc(286) int local286;
					@Pc(290) int local290;
					if ((local217 & 0x2) == 0 && (local247 & 0x1) == 0) {
						@Pc(344) int local344;
						if (local182 == 2) {
							local344 = local237 - local197 & 0x3FFF;
							@Pc(425) int local425 = local257 - local207 & 0x3FFF;
							if (local344 >= 8192) {
								local344 -= 16384;
							}
							if (local425 >= 8192) {
								local425 -= 16384;
							}
							@Pc(444) int local444 = local242 - local212 & 0x3FFF;
							local288 = arg5 * local344 / arg9 + local197 & 0x3FFF;
							if (local444 >= 8192) {
								local444 -= 16384;
							}
							local286 = local207 + arg5 * local425 / arg9 & 0x3FFF;
							local290 = local212 + local444 * arg5 / arg9 & 0x3FFF;
						} else if (local182 == 9) {
							local344 = local237 - local197 & 0x3FFF;
							if (local344 >= 8192) {
								local344 -= 16384;
							}
							local288 = local197 + local344 * arg5 / arg9 & 0x3FFF;
							local290 = 0;
							local286 = 0;
						} else if (local182 == 7) {
							local344 = local237 - local197 & 0x3F;
							if (local344 >= 32) {
								local344 -= 64;
							}
							local288 = local197 + local344 * arg5 / arg9 & 0x3F;
							local286 = local207 + (local257 - local207) * arg5 / arg9;
							local290 = local212 + arg5 * (local242 - local212) / arg9;
						} else {
							local290 = (local242 - local212) * arg5 / arg9 + local212;
							local288 = arg5 * (local237 - local197) / arg9 + local197;
							local286 = local207 + (local257 - local207) * arg5 / arg9;
						}
					} else {
						local286 = local207;
						local288 = local197;
						local290 = local212;
					}
					if (local202 != -1) {
						this.method6095(0, arg4, 0, arg7, arg8 & arg3.anIntArray149[local202], 0, 0, arg2, arg3.anIntArrayArray15[local202]);
					} else if (local252 != -1) {
						this.method6095(0, arg4, 0, arg7, arg3.anIntArray149[local252] & arg8, 0, 0, arg2, arg3.anIntArrayArray15[local252]);
					}
					this.method6095(local182, arg4, local290, arg7, arg3.anIntArray149[local118] & arg8, local288, local286, arg2, arg3.anIntArrayArray15[local118]);
				} else {
					if (local122) {
						local11++;
					}
					if (local136) {
						local111++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!e", name = "ma", descriptor = "(I)V")
	public abstract void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "pa", descriptor = "()I")
	public abstract int pa();

	@OriginalMember(owner = "client!e", name = "K", descriptor = "(I)V")
	public abstract void K(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "EA", descriptor = "(Lclient!i;)Lclient!i;")
	public abstract Class10_Sub1_Sub7 EA(@OriginalArg(0) Class10_Sub1_Sub7 arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	public abstract void method6086(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!e", name = "L", descriptor = "()V")
	public abstract void L();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	public abstract void method6087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!ei;I)V")
	public final void method6088(@OriginalArg(1) Class10_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.h()) {
			return;
		}
		@Pc(18) Class174 local18 = arg0.aClass174Array1[arg1];
		@Pc(21) Class10_Sub13 local21 = local18.aClass10_Sub13_1;
		for (@Pc(23) int local23 = 0; local23 < local18.anInt4761; local23++) {
			@Pc(30) short local30 = local18.aShortArray78[local23];
			if (local21.aBooleanArray2[local30]) {
				if (local18.aShortArray76[local23] != -1) {
					this.za(0, 0, 0, 0);
				}
				this.za(local21.anIntArray148[local30], local18.aShortArray79[local23], local18.aShortArray75[local23], local18.aShortArray82[local23]);
			}
		}
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "n", descriptor = "(III)V")
	public abstract void n(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public abstract void method6089();

	@OriginalMember(owner = "client!e", name = "q", descriptor = "(SS)V")
	public abstract void q(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "ta", descriptor = "()I")
	public abstract int ta();

	@OriginalMember(owner = "client!e", name = "u", descriptor = "(SS)V")
	public abstract void u(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
	public abstract int k();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!pr;I)V")
	public abstract void method6090(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class40_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "B", descriptor = "()I")
	public abstract int B();

	@OriginalMember(owner = "client!e", name = "Y", descriptor = "()I")
	public abstract int Y();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZIIILclient!ei;ILclient!ei;II)V")
	public final void method6091(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class10_Sub1_Sub4 arg6, @OriginalArg(8) int arg7) {
		if (arg7 == -1 || !this.h()) {
			return;
		}
		@Pc(16) Class174 local16 = arg4.aClass174Array1[arg7];
		@Pc(19) Class10_Sub13 local19 = local16.aClass10_Sub13_1;
		@Pc(21) Class174 local21 = null;
		if (arg6 != null) {
			local21 = arg6.aClass174Array1[arg5];
			if (local21.aClass10_Sub13_1 != local19) {
				local21 = null;
			}
		}
		this.method6085(local16, false, arg0, local19, null, arg3, null, arg1, 65535, arg2, local21);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZ)Lclient!e;")
	public abstract Class63 method6093(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!e", name = "S", descriptor = "()I")
	public abstract int S();

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()[Lclient!fi;")
	public abstract Class78[] method6094();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[IIIIIIZI[I)V")
	private void method6095(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) int[] arg8) {
		@Pc(16) int local16;
		if (arg3 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local16 = -arg5;
				arg5 = arg2;
				arg2 = local16;
			} else if (arg0 == 3) {
				local16 = arg5;
				arg5 = arg2;
				arg2 = local16;
			} else if (arg0 == 2) {
				local16 = arg5;
				arg5 = -arg2 & 0x3FFF;
				arg2 = local16 & 0x3FFF;
			}
		} else if (arg3 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg5 = -arg5;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg5 = -arg5 & 0x3FFF;
			}
		} else if (arg3 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local16 = arg5;
				arg5 = -arg2;
				arg2 = local16;
			} else if (arg0 == 3) {
				local16 = arg5;
				arg5 = arg2;
				arg2 = local16;
			} else if (arg0 == 2) {
				local16 = arg5;
				arg5 = arg2 & 0x3FFF;
				arg2 = -local16 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.va(arg0, arg8, arg5, arg6, arg2, arg3, arg7);
		} else {
			this.aa(arg0, arg8, arg5, arg6, arg2, arg7, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!e", name = "KA", descriptor = "()V")
	protected abstract void KA();

	@OriginalMember(owner = "client!e", name = "aa", descriptor = "(I[IIIIZI[I)V")
	protected abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()Z")
	public abstract boolean method6096();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!c;Lclient!pr;II)V")
	public abstract void method6097(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class40_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()[Lclient!kh;")
	public abstract Class141[] method6098();

	@OriginalMember(owner = "client!e", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "()I")
	public abstract int Z();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILclient!ya;IIIII)V")
	protected final void method6099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class154 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg5 / 2;
		@Pc(21) int local21 = -arg4 / 2;
		@Pc(30) int local30 = arg3.ca(local16 + arg6, local21 + arg1);
		@Pc(34) int local34 = arg5 / 2;
		@Pc(39) int local39 = -arg4 / 2;
		@Pc(48) int local48 = arg3.ca(local34 + arg6, local39 + arg1);
		@Pc(53) int local53 = -arg5 / 2;
		@Pc(57) int local57 = arg4 / 2;
		@Pc(67) int local67 = arg3.ca(local53 + arg6, arg1 - -local57);
		@Pc(71) int local71 = arg5 / 2;
		@Pc(75) int local75 = arg4 / 2;
		@Pc(84) int local84 = arg3.ca(local71 + arg6, local75 + arg1);
		@Pc(95) int local95 = local30 < local48 ? local30 : local48;
		@Pc(106) int local106 = local67 >= local84 ? local84 : local67;
		@Pc(113) int local113 = local84 > local48 ? local48 : local84;
		@Pc(120) int local120 = local67 <= local30 ? local67 : local30;
		@Pc(162) int local162;
		if (arg4 != 0) {
			@Pc(136) int local136 = (int) (Math.atan2((double) (local95 - local106), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local136 != 0) {
				if (arg0 != 0) {
					if (local136 > 8192) {
						local162 = 16384 - arg0;
						if (local136 < local162) {
							local136 = local162;
						}
					} else if (local136 > arg0) {
						local136 = arg0;
					}
				}
				this.W(local136);
			}
		}
		@Pc(174) int local174 = local84 + local30;
		if (arg5 != 0) {
			@Pc(192) int local192 = (int) (Math.atan2((double) (local120 - local113), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local192 != 0) {
				if (arg7 != 0) {
					if (local192 > 8192) {
						local162 = 16384 - arg7;
						if (local192 < local162) {
							local192 = local162;
						}
					} else if (local192 > arg7) {
						local192 = arg7;
					}
				}
				this.K(local192);
			}
		}
		if (local67 + local48 < local174) {
			local174 = local48 + local67;
		}
		local174 = (local174 >> 1) - arg2;
		if (local174 != 0) {
			this.a(0, local174, 0);
		}
	}

	@OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[ZLclient!ei;IBLclient!ei;IIIIZILclient!ei;Lclient!ei;I)V")
	public final void method6100(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) Class10_Sub1_Sub4 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class10_Sub1_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class10_Sub1_Sub4 arg11, @OriginalArg(13) Class10_Sub1_Sub4 arg12, @OriginalArg(14) int arg13) {
		if (arg8 == -1) {
			return;
		}
		if (arg1 == null || arg10 == -1) {
			this.method6091(arg9, 0, arg5, arg0, arg2, arg3, arg4, arg8);
		} else if (this.h()) {
			@Pc(35) Class174 local35 = arg2.aClass174Array1[arg8];
			@Pc(38) Class10_Sub13 local38 = local35.aClass10_Sub13_1;
			@Pc(40) Class174 local40 = null;
			if (arg4 != null) {
				local40 = arg4.aClass174Array1[arg3];
				if (local40.aClass10_Sub13_1 != local38) {
					local40 = null;
				}
			}
			this.method6085(local35, false, arg9, local38, null, arg0, arg1, 0, 65535, arg5, local40);
			@Pc(78) Class174 local78 = arg12.aClass174Array1[arg10];
			@Pc(80) Class174 local80 = null;
			if (arg11 != null) {
				local80 = arg11.aClass174Array1[arg7];
				if (local38 != local80.aClass10_Sub13_1) {
					local80 = null;
				}
			}
			this.va(0, new int[0], 0, 0, 0, 0, arg9);
			this.method6085(local78, true, arg9, local78.aClass10_Sub13_1, null, arg6, arg1, 0, 65535, arg13, local80);
			this.KA();
		}
	}

	@OriginalMember(owner = "client!e", name = "za", descriptor = "(IIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!c;Z)Z")
	public abstract boolean method6101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!e", name = "va", descriptor = "(I[IIIIIZ)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ei;I[IIIZILclient!ei;IZI)V")
	public final void method6103(@OriginalArg(0) Class10_Sub1_Sub4 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class10_Sub1_Sub4 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		if (arg7 == -1 || !this.h()) {
			return;
		}
		@Pc(17) Class174 local17 = arg0.aClass174Array1[arg7];
		@Pc(20) Class10_Sub13 local20 = local17.aClass10_Sub13_1;
		@Pc(22) Class174 local22 = null;
		if (arg6 != null) {
			local22 = arg6.aClass174Array1[arg2];
			if (local20 != local22.aClass10_Sub13_1) {
				local22 = null;
			}
		}
		this.method6085(local17, false, arg4, local20, arg1, arg3, null, 0, arg5, arg8, local22);
		this.KA();
	}

	@OriginalMember(owner = "client!e", name = "da", descriptor = "(IILclient!ya;Lclient!ya;III)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) Class154 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!e", name = "A", descriptor = "(I)V")
	public abstract void A(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!e", name = "MA", descriptor = "()I")
	public abstract int MA();
}
