import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public abstract class Class39 {

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	protected Class39() {
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public abstract void method4861(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public abstract void method4862(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BIZ)Lclient!cd;")
	public abstract Class39 method4863(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ql;Lclient!ni;II)V")
	public abstract void method4864(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class48_Sub7 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()Z")
	public abstract boolean method4865();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!h;)Lclient!h;")
	public abstract Class6_Sub1_Sub8 method4866(@OriginalArg(0) Class6_Sub1_Sub8 arg0);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()I")
	public abstract int method4867();

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "()I")
	public abstract int method4868();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
	public abstract void method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	public abstract void method4870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!fo;Lclient!fo;III)V")
	public abstract void method4872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(IIII)V")
	protected abstract void method4873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)V")
	public abstract void method4874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "()I")
	public abstract int method4875();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z[IBLclient!eb;IZLclient!ua;[ZIIILclient!ua;)V")
	private void method4876(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class6_Sub9 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class241 arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class241 arg10) {
		@Pc(19) int local19;
		if (arg10 == null || arg7 == 0) {
			for (local19 = 0; local19 < arg5.anInt6533; local19++) {
				@Pc(26) short local26 = arg5.aShortArray90[local19];
				if (arg6 == null || arg6[local26] == arg0 || arg2.anIntArray165[local26] == 0) {
					@Pc(51) short local51 = arg5.aShortArray93[local19];
					if (local51 != -1) {
						this.method4892(0, arg2.anIntArrayArray19[local51], 0, 0, 0, arg1, arg9, arg4, arg3 & arg2.anIntArray164[local51]);
					}
					this.method4892(arg5.aShortArray97[local19], arg2.anIntArrayArray19[local26], arg5.aShortArray94[local19], arg5.aShortArray89[local19], arg2.anIntArray165[local26], arg1, arg9, arg4, arg2.anIntArray164[local26] & arg3);
				}
			}
			return;
		}
		local19 = 0;
		@Pc(120) int local120 = 0;
		for (@Pc(122) int local122 = 0; local122 < arg2.anInt1604; local122++) {
			@Pc(126) boolean local126 = false;
			if (arg5.anInt6533 > local19 && arg5.aShortArray90[local19] == local122) {
				local126 = true;
			}
			@Pc(144) boolean local144 = false;
			if (local120 < arg10.anInt6533 && arg10.aShortArray90[local120] == local122) {
				local144 = true;
			}
			if (local126 || local144) {
				if (arg6 == null || arg0 == arg6[local122] || arg2.anIntArray165[local122] == 0) {
					@Pc(197) short local197 = 0;
					@Pc(202) int local202 = arg2.anIntArray165[local122];
					if (local202 == 3 || local202 == 10) {
						local197 = 128;
					}
					@Pc(224) short local224;
					@Pc(234) short local234;
					@Pc(219) short local219;
					@Pc(229) short local229;
					@Pc(239) byte local239;
					if (local126) {
						local219 = arg5.aShortArray89[local19];
						local224 = arg5.aShortArray94[local19];
						local229 = arg5.aShortArray93[local19];
						local234 = arg5.aShortArray97[local19];
						local239 = arg5.aByteArray84[local19];
						local19++;
					} else {
						local229 = -1;
						local239 = 0;
						local234 = local197;
						local224 = local197;
						local219 = local197;
					}
					@Pc(269) short local269;
					@Pc(274) short local274;
					@Pc(279) short local279;
					@Pc(259) short local259;
					@Pc(264) byte local264;
					if (local144) {
						local259 = arg10.aShortArray93[local120];
						local264 = arg10.aByteArray84[local120];
						local269 = arg10.aShortArray94[local120];
						local274 = arg10.aShortArray97[local120];
						local279 = arg10.aShortArray89[local120];
						local120++;
					} else {
						local274 = local197;
						local279 = local197;
						local259 = -1;
						local269 = local197;
						local264 = 0;
					}
					@Pc(351) int local351;
					@Pc(361) int local361;
					@Pc(377) int local377;
					if ((local239 & 0x2) == 0 && (local264 & 0x1) == 0) {
						@Pc(315) int local315;
						if (local202 == 2) {
							local315 = local269 - local224 & 0x3FFF;
							@Pc(322) int local322 = local274 - local234 & 0x3FFF;
							@Pc(329) int local329 = local279 - local219 & 0x3FFF;
							if (local315 >= 8192) {
								local315 -= 16384;
							}
							if (local322 >= 8192) {
								local322 -= 16384;
							}
							local351 = local224 + local315 * arg7 / arg8 & 0x3FFF;
							local361 = local234 + local322 * arg7 / arg8 & 0x3FFF;
							if (local329 >= 8192) {
								local329 -= 16384;
							}
							local377 = local219 + arg7 * local329 / arg8 & 0x3FFF;
						} else if (local202 == 9) {
							local315 = local269 - local224 & 0x3FFF;
							if (local315 >= 8192) {
								local315 -= 16384;
							}
							local377 = 0;
							local361 = 0;
							local351 = arg7 * local315 / arg8 + local224 & 0x3FFF;
						} else if (local202 == 7) {
							local315 = local269 - local224 & 0x3F;
							if (local315 >= 32) {
								local315 -= 64;
							}
							local361 = local234 + (local274 - local234) * arg7 / arg8;
							local351 = local224 + arg7 * local315 / arg8 & 0x3F;
							local377 = local219 + (local279 - local219) * arg7 / arg8;
						} else {
							local377 = (local279 - local219) * arg7 / arg8 + local219;
							local351 = arg7 * (local269 - local224) / arg8 + local224;
							local361 = local234 + (local274 - local234) * arg7 / arg8;
						}
					} else {
						local361 = local234;
						local351 = local224;
						local377 = local219;
					}
					if (local229 != -1) {
						this.method4892(0, arg2.anIntArrayArray19[local229], 0, 0, 0, arg1, arg9, arg4, arg3 & arg2.anIntArray164[local229]);
					} else if (local259 != -1) {
						this.method4892(0, arg2.anIntArrayArray19[local259], 0, 0, 0, arg1, arg9, arg4, arg2.anIntArray164[local259] & arg3);
					}
					this.method4892(local361, arg2.anIntArrayArray19[local122], local351, local377, local202, arg1, arg9, arg4, arg2.anIntArray164[local122] & arg3);
				} else {
					if (local144) {
						local120++;
					}
					if (local126) {
						local19++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "()I")
	public abstract int method4877();

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "()Z")
	protected abstract boolean method4878();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILclient!fo;IIIII)V")
	protected final void method4879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg2 / 2;
		@Pc(26) int local26 = -arg7 / 2;
		@Pc(35) int local35 = arg3.method5334(local16 + arg1, local26 + arg4);
		@Pc(39) int local39 = arg2 / 2;
		@Pc(44) int local44 = -arg7 / 2;
		@Pc(55) int local55 = arg3.method5334(arg1 + local39, arg4 - -local44);
		@Pc(60) int local60 = -arg2 / 2;
		@Pc(64) int local64 = arg7 / 2;
		@Pc(73) int local73 = arg3.method5334(local60 + arg1, local64 + arg4);
		@Pc(77) int local77 = arg2 / 2;
		@Pc(81) int local81 = arg7 / 2;
		@Pc(90) int local90 = arg3.method5334(arg1 + local77, arg4 + local81);
		@Pc(101) int local101 = local35 >= local55 ? local55 : local35;
		@Pc(108) int local108 = local73 < local90 ? local73 : local90;
		@Pc(119) int local119 = local90 <= local55 ? local90 : local55;
		@Pc(130) int local130 = local35 >= local73 ? local73 : local35;
		@Pc(175) int local175;
		if (arg7 != 0) {
			@Pc(149) int local149 = (int) (Math.atan2((double) (local101 - local108), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local149 != 0) {
				if (arg5 != 0) {
					if (local149 > 8192) {
						local175 = 16384 - arg5;
						if (local149 < local175) {
							local149 = local175;
						}
					} else if (arg5 < local149) {
						local149 = arg5;
					}
				}
				this.method4883(local149);
			}
		}
		if (arg2 != 0) {
			@Pc(203) int local203 = (int) (Math.atan2((double) (local130 - local119), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local203 != 0) {
				if (arg0 != 0) {
					if (local203 > 8192) {
						local175 = 16384 - arg0;
						if (local175 > local203) {
							local203 = local175;
						}
					} else if (local203 > arg0) {
						local203 = arg0;
					}
				}
				this.method4886(local203);
			}
		}
		@Pc(237) int local237 = local35 + local90;
		if (local237 > local55 + local73) {
			local237 = local55 + local73;
		}
		local237 = (local237 >> 1) - arg6;
		if (local237 != 0) {
			this.method4874(0, local237, 0);
		}
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "()I")
	public abstract int method4881();

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "()V")
	public abstract void method4882();

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	public abstract void method4883(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "()[Lclient!ma;")
	public abstract Class161[] method4885();

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
	public abstract void method4886(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "()V")
	public abstract void method4887();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!ql;Z)Z")
	public abstract boolean method4888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method4889(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "()I")
	public abstract int method4890();

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public abstract void method4891(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIII[IIZI)V")
	private void method4892(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(72) int local72;
		if (arg6 == 1) {
			if (arg4 == 0 || arg4 == 1) {
				local72 = -arg2;
				arg2 = arg3;
				arg3 = local72;
			} else if (arg4 == 3) {
				local72 = arg2;
				arg2 = arg3;
				arg3 = local72;
			} else if (arg4 == 2) {
				local72 = arg2;
				arg2 = -arg3 & 0x3FFF;
				arg3 = local72 & 0x3FFF;
			}
		} else if (arg6 == 2) {
			if (arg4 == 0 || arg4 == 1) {
				arg3 = -arg3;
				arg2 = -arg2;
			} else if (arg4 == 2) {
				arg3 = -arg3 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg6 == 3) {
			if (arg4 == 0 || arg4 == 1) {
				local72 = arg2;
				arg2 = -arg3;
				arg3 = local72;
			} else if (arg4 == 3) {
				local72 = arg2;
				arg2 = arg3;
				arg3 = local72;
			} else if (arg4 == 2) {
				local72 = arg2;
				arg2 = arg3 & 0x3FFF;
				arg3 = -local72 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.method4889(arg4, arg1, arg2, arg0, arg3, arg6, arg7);
		} else {
			this.method4908(arg4, arg1, arg2, arg0, arg3, arg7, arg8, arg5);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBLclient!cq;IIIZLclient!cq;)V")
	public final void method4893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub1_Sub5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class6_Sub1_Sub5 arg7) {
		if (arg3 == -1 || !this.method4878()) {
			return;
		}
		@Pc(20) Class241 local20 = arg7.aClass241Array1[arg3];
		@Pc(23) Class6_Sub9 local23 = local20.aClass6_Sub9_1;
		@Pc(25) Class241 local25 = null;
		if (arg2 != null) {
			local25 = arg2.aClass241Array1[arg5];
			if (local23 != local25.aClass6_Sub9_1) {
				local25 = null;
			}
		}
		this.method4876(false, null, local23, 65535, arg6, local20, null, arg4, arg1, arg0, local25);
		this.method4897();
	}

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "()I")
	public abstract int method4894();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!cd;IIIZ)V")
	public abstract void method4895(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILclient!cq;ILclient!cq;IBI[ZILclient!cq;Lclient!cq;IZ)V")
	public final void method4896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub1_Sub5 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class6_Sub1_Sub5 arg10, @OriginalArg(12) Class6_Sub1_Sub5 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		if (arg4 == -1) {
			return;
		}
		if (arg8 == null || arg7 == -1) {
			this.method4893(0, arg0, arg10, arg4, arg2, arg12, arg13, arg3);
		} else if (this.method4878()) {
			@Pc(34) Class241 local34 = arg3.aClass241Array1[arg4];
			@Pc(42) Class6_Sub9 local42 = local34.aClass6_Sub9_1;
			@Pc(44) Class241 local44 = null;
			if (arg10 != null) {
				local44 = arg10.aClass241Array1[arg12];
				if (local42 != local44.aClass6_Sub9_1) {
					local44 = null;
				}
			}
			this.method4876(false, null, local42, 65535, arg13, local34, arg8, arg2, arg0, 0, local44);
			@Pc(76) Class241 local76 = arg5.aClass241Array1[arg7];
			@Pc(78) Class241 local78 = null;
			if (arg11 != null) {
				local78 = arg11.aClass241Array1[arg9];
				if (local78.aClass6_Sub9_1 != local42) {
					local78 = null;
				}
			}
			this.method4889(0, new int[0], 0, 0, 0, 0, arg13);
			this.method4876(true, null, local76.aClass6_Sub9_1, 65535, arg13, local76, arg8, arg6, arg1, 0, local78);
			this.method4897();
		}
	}

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "()V")
	protected abstract void method4897();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!cq;II)V")
	public final void method4898(@OriginalArg(0) Class6_Sub1_Sub5 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1 || !this.method4878()) {
			return;
		}
		@Pc(17) Class241 local17 = arg0.aClass241Array1[arg1];
		@Pc(20) Class6_Sub9 local20 = local17.aClass6_Sub9_1;
		for (@Pc(22) int local22 = 0; local22 < local17.anInt6533; local22++) {
			@Pc(31) short local31 = local17.aShortArray90[local22];
			if (local20.aBooleanArray11[local31]) {
				if (local17.aShortArray93[local22] != -1) {
					this.method4873(0, 0, 0, 0);
				}
				this.method4873(local20.anIntArray165[local31], local17.aShortArray94[local22], local17.aShortArray97[local22], local17.aShortArray89[local22]);
			}
		}
		this.method4897();
	}

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "()[Lclient!oo;")
	public abstract Class192[] method4899();

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "()I")
	public abstract int method4900();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(SS)V")
	public abstract void method4901(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "()I")
	public abstract int method4902();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[IZIIILclient!cq;IILclient!cq;)V")
	public final void method4903(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class6_Sub1_Sub5 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class6_Sub1_Sub5 arg8) {
		if (arg6 == -1 || !this.method4878()) {
			return;
		}
		@Pc(21) Class241 local21 = arg8.aClass241Array1[arg6];
		@Pc(24) Class6_Sub9 local24 = local21.aClass6_Sub9_1;
		@Pc(26) Class241 local26 = null;
		if (arg5 != null) {
			local26 = arg5.aClass241Array1[arg3];
			if (local24 != local26.aClass6_Sub9_1) {
				local26 = null;
			}
		}
		this.method4876(false, arg1, local24, arg0, arg2, local21, null, arg7, arg4, 0, local26);
		this.method4897();
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
	public abstract void method4904(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "()I")
	public abstract int method4905();

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
	public abstract void method4907(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method4908(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(SS)V")
	public abstract void method4909(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ql;Lclient!ni;I)V")
	public abstract void method4910(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class48_Sub7 arg1, @OriginalArg(2) int arg2);
}
