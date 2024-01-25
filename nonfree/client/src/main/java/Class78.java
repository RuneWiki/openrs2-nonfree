import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public abstract class Class78 {

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	protected Class78() {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "()V")
	public abstract void method4359();

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "()V")
	public abstract void method4360();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIBLclient!sm;II)V")
	protected final void method4362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class41 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = -arg4 / 2;
		@Pc(23) int local23 = -arg5 / 2;
		@Pc(33) int local33 = arg3.method5433(local18 + arg1, arg0 - -local23);
		@Pc(37) int local37 = arg4 / 2;
		@Pc(42) int local42 = -arg5 / 2;
		@Pc(51) int local51 = arg3.method5433(local37 + arg1, arg0 + local42);
		@Pc(56) int local56 = -arg4 / 2;
		@Pc(60) int local60 = arg5 / 2;
		@Pc(70) int local70 = arg3.method5433(arg1 + local56, local60 + arg0);
		@Pc(74) int local74 = arg4 / 2;
		@Pc(78) int local78 = arg5 / 2;
		@Pc(88) int local88 = arg3.method5433(local74 + arg1, arg0 - -local78);
		@Pc(99) int local99 = local51 <= local33 ? local51 : local33;
		@Pc(110) int local110 = local88 > local70 ? local70 : local88;
		@Pc(121) int local121 = local88 <= local51 ? local88 : local51;
		if (arg5 != 0) {
			@Pc(140) int local140 = (int) (Math.atan2((double) (local99 - local110), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local140 != 0) {
				this.method4369(local140);
			}
		}
		@Pc(152) int local152 = local70 <= local33 ? local70 : local33;
		if (arg4 != 0) {
			@Pc(170) int local170 = (int) (Math.atan2((double) (local152 - local121), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local170 != 0) {
				this.method4389(local170);
			}
		}
		@Pc(179) int local179 = local88 + local33;
		if (local51 + local70 < local179) {
			local179 = local70 + local51;
		}
		local179 = (local179 >> 1) - arg2;
		if (local179 != 0) {
			this.method4399(0, local179, 0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "()I")
	public abstract int method4363();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!bl;II)V")
	public final void method4364(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1 || !this.method4392()) {
			return;
		}
		@Pc(19) Class207 local19 = arg0.aClass207Array1[arg1];
		@Pc(22) Class1_Sub30 local22 = local19.aClass1_Sub30_1;
		for (@Pc(31) int local31 = 0; local31 < local19.anInt6145; local31++) {
			@Pc(38) short local38 = local19.aShortArray96[local31];
			if (local22.aBooleanArray25[local38]) {
				if (local19.aShortArray101[local31] != -1) {
					this.method4375(0, 0, 0, 0);
				}
				this.method4375(local22.anIntArray592[local38], local19.aShortArray104[local31], local19.aShortArray102[local31], local19.aShortArray103[local31]);
			}
		}
		this.method4402();
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "()I")
	public abstract int method4365();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method4366(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ[IIIIIII[I)V")
	private void method4367(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int[] arg8) {
		@Pc(25) int local25;
		if (arg5 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local25 = -arg7;
				arg7 = arg4;
				arg4 = local25;
			} else if (arg3 == 3) {
				local25 = arg7;
				arg7 = arg4;
				arg4 = local25;
			} else if (arg3 == 2) {
				local25 = arg7;
				arg7 = -arg4 & 0x3FFF;
				arg4 = local25 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg4 = -arg4;
				arg7 = -arg7;
			} else if (arg3 == 2) {
				arg7 = -arg7 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local25 = arg7;
				arg7 = -arg4;
				arg4 = local25;
			} else if (arg3 == 3) {
				local25 = arg7;
				arg7 = arg4;
				arg4 = local25;
			} else if (arg3 == 2) {
				local25 = arg7;
				arg7 = arg4 & 0x3FFF;
				arg4 = -local25 & 0x3FFF;
			}
		}
		if (arg0 == 65535) {
			this.method4395(arg3, arg2, arg7, arg6, arg4, arg5, arg1);
		} else {
			this.method4366(arg3, arg2, arg7, arg6, arg4, arg1, arg0, arg8);
		}
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "()I")
	public abstract int method4368();

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public abstract void method4369(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "()Z")
	public abstract boolean method4370();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!uo;Lclient!uo;Lclient!pf;I[IIIIZZ[ZB)V")
	private void method4371(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class1_Sub30 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean[] arg10) {
		@Pc(11) int local11;
		if (arg1 == null || arg3 == 0) {
			for (local11 = 0; local11 < arg0.anInt6145; local11++) {
				@Pc(18) short local18 = arg0.aShortArray96[local11];
				if (arg10 == null || arg8 == arg10[local18] || arg2.anIntArray592[local18] == 0) {
					@Pc(43) short local43 = arg0.aShortArray101[local11];
					if (local43 != -1) {
						this.method4367(arg2.anIntArray591[local43] & arg5, arg9, arg2.anIntArrayArray49[local43], 0, 0, arg7, 0, 0, arg4);
					}
					this.method4367(arg2.anIntArray591[local18] & arg5, arg9, arg2.anIntArrayArray49[local18], arg2.anIntArray592[local18], arg0.aShortArray103[local11], arg7, arg0.aShortArray102[local11], arg0.aShortArray104[local11], arg4);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(112) int local112 = 0;
		for (@Pc(119) int local119 = 0; local119 < arg2.anInt4614; local119++) {
			@Pc(123) boolean local123 = false;
			if (arg0.anInt6145 > local11 && arg0.aShortArray96[local11] == local119) {
				local123 = true;
			}
			@Pc(141) boolean local141 = false;
			if (arg1.anInt6145 > local112 && local119 == arg1.aShortArray96[local112]) {
				local141 = true;
			}
			if (local123 || local141) {
				if (arg10 == null || arg10[local119] == arg8 || arg2.anIntArray592[local119] == 0) {
					@Pc(187) short local187 = 0;
					@Pc(192) int local192 = arg2.anIntArray592[local119];
					if (local192 == 3) {
						local187 = 128;
					}
					@Pc(219) short local219;
					@Pc(214) short local214;
					@Pc(224) short local224;
					@Pc(204) short local204;
					@Pc(209) byte local209;
					if (local123) {
						local204 = arg0.aShortArray101[local11];
						local209 = arg0.aByteArray91[local11];
						local214 = arg0.aShortArray102[local11];
						local219 = arg0.aShortArray104[local11];
						local224 = arg0.aShortArray103[local11];
						local11++;
					} else {
						local214 = local187;
						local219 = local187;
						local224 = local187;
						local204 = -1;
						local209 = 0;
					}
					@Pc(244) short local244;
					@Pc(264) short local264;
					@Pc(254) short local254;
					@Pc(249) short local249;
					@Pc(259) byte local259;
					if (local141) {
						local244 = arg1.aShortArray104[local112];
						local249 = arg1.aShortArray101[local112];
						local254 = arg1.aShortArray103[local112];
						local259 = arg1.aByteArray91[local112];
						local264 = arg1.aShortArray102[local112];
						local112++;
					} else {
						local249 = -1;
						local254 = local187;
						local264 = local187;
						local259 = 0;
						local244 = local187;
					}
					@Pc(340) int local340;
					@Pc(350) int local350;
					@Pc(360) int local360;
					if ((local209 & 0x2) == 0 && (local259 & 0x1) == 0) {
						@Pc(299) int local299;
						if (local192 == 2) {
							local299 = local244 - local219 & 0x3FFF;
							@Pc(306) int local306 = local264 - local214 & 0x3FFF;
							if (local306 >= 8192) {
								local306 -= 16384;
							}
							@Pc(319) int local319 = local254 - local224 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							if (local319 >= 8192) {
								local319 -= 16384;
							}
							local340 = local219 + arg3 * local299 / arg6 & 0x3FFF;
							local350 = local306 * arg3 / arg6 + local214 & 0x3FFF;
							local360 = arg3 * local319 / arg6 + local224 & 0x3FFF;
						} else if (local192 == 7) {
							local299 = local244 - local219 & 0x3F;
							if (local299 >= 32) {
								local299 -= 64;
							}
							local360 = arg3 * (local254 - local224) / arg6 + local224;
							local350 = local214 + (local264 - local214) * arg3 / arg6;
							local340 = arg3 * local299 / arg6 + local219 & 0x3F;
						} else {
							local360 = (local254 - local224) * arg3 / arg6 + local224;
							local350 = local214 + arg3 * (local264 - local214) / arg6;
							local340 = (local244 - local219) * arg3 / arg6 + local219;
						}
					} else {
						local350 = local214;
						local360 = local224;
						local340 = local219;
					}
					if (local204 != -1) {
						this.method4367(arg2.anIntArray591[local204] & arg5, arg9, arg2.anIntArrayArray49[local204], 0, 0, arg7, 0, 0, arg4);
					} else if (local249 != -1) {
						this.method4367(arg5 & arg2.anIntArray591[local249], arg9, arg2.anIntArrayArray49[local249], 0, 0, arg7, 0, 0, arg4);
					}
					this.method4367(arg2.anIntArray591[local119] & arg5, arg9, arg2.anIntArrayArray49[local119], local192, local360, arg7, local350, local340, arg4);
				} else {
					if (local141) {
						local112++;
					}
					if (local123) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	public abstract void method4372(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	public abstract void method4373(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(SS)V")
	public abstract void method4374(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
	protected abstract void method4375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "()[Lclient!hp;")
	public abstract Class85[] method4376();

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
	public abstract void method4377(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "()I")
	public abstract int method4378();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ci;Lclient!bd;I)V")
	public abstract void method4379(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class15_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
	public abstract void method4380(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILclient!ci;Z)Z")
	public abstract boolean method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZLclient!bl;IILclient!bl;B)V")
	public final void method4382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class1_Sub1_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class1_Sub1_Sub3 arg7) {
		if (arg1 == -1 || !this.method4392()) {
			return;
		}
		@Pc(24) Class207 local24 = arg4.aClass207Array1[arg1];
		@Pc(27) Class1_Sub30 local27 = local24.aClass1_Sub30_1;
		@Pc(29) Class207 local29 = null;
		if (arg7 != null) {
			local29 = arg7.aClass207Array1[arg0];
			if (local29.aClass1_Sub30_1 != local27) {
				local29 = null;
			}
		}
		this.method4371(local24, local29, local27, arg6, null, 65535, arg2, arg5, false, arg3, null);
		this.method4402();
	}

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "()[Lclient!pd;")
	public abstract Class154[] method4383();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ci;Lclient!bd;II)V")
	public abstract void method4384(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class15_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "()I")
	public abstract int method4385();

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
	public abstract void method4386(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "()I")
	public abstract int method4387();

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "()I")
	public abstract int method4388();

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)V")
	public abstract void method4389(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "()I")
	public abstract int method4390();

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "()I")
	public abstract int method4391();

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "()Z")
	protected abstract boolean method4392();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public abstract void method4393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BIZ)Lclient!hc;")
	public abstract Class78 method4394(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method4395(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILclient!sm;Lclient!sm;III)V")
	public abstract void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class41 arg2, @OriginalArg(3) Class41 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLclient!bl;[IILclient!bl;IIIIII)V")
	public final void method4397(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class1_Sub1_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg4 == -1 || !this.method4392()) {
			return;
		}
		@Pc(22) Class207 local22 = arg1.aClass207Array1[arg4];
		@Pc(25) Class1_Sub30 local25 = local22.aClass1_Sub30_1;
		@Pc(27) Class207 local27 = null;
		if (arg3 != null) {
			local27 = arg3.aClass207Array1[arg6];
			if (local27.aClass1_Sub30_1 != local25) {
				local27 = null;
			}
		}
		this.method4371(local22, local27, local25, arg5, arg2, arg8, arg7, 0, false, arg0, null);
		this.method4402();
	}

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "()I")
	public abstract int method4398();

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	public abstract void method4399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!hc;IIIZ)V")
	public abstract void method4400(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!bl;IZLclient!bl;ILclient!bl;Lclient!bl;III[ZIII)V")
	public final void method4401(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class1_Sub1_Sub3 arg4, @OriginalArg(6) Class1_Sub1_Sub3 arg5, @OriginalArg(7) Class1_Sub1_Sub3 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg10 == null || arg11 == -1) {
			this.method4382(arg7, arg2, arg8, arg3, arg4, 0, arg12, arg1);
		} else if (this.method4392()) {
			@Pc(33) Class207 local33 = arg4.aClass207Array1[arg2];
			@Pc(36) Class1_Sub30 local36 = local33.aClass1_Sub30_1;
			@Pc(38) Class207 local38 = null;
			if (arg1 != null) {
				local38 = arg1.aClass207Array1[arg7];
				if (local38.aClass1_Sub30_1 != local36) {
					local38 = null;
				}
			}
			@Pc(56) Class207 local56 = arg6.aClass207Array1[arg11];
			@Pc(58) Class207 local58 = null;
			if (arg5 != null) {
				local58 = arg5.aClass207Array1[arg13];
				if (local36 != local58.aClass1_Sub30_1) {
					local58 = null;
				}
			}
			this.method4371(local33, local38, local36, arg12, null, 65535, arg8, 0, false, arg3, arg10);
			this.method4395(0, new int[0], 0, 0, 0, 0, arg3);
			this.method4371(local56, local58, local36, arg0, null, 65535, arg9, 0, true, arg3, arg10);
			this.method4402();
		}
	}

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "()V")
	protected abstract void method4402();

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ek;)Lclient!ek;")
	public abstract Class1_Sub1_Sub8 method4403(@OriginalArg(0) Class1_Sub1_Sub8 arg0);

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(SS)V")
	public abstract void method4404(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);
}
