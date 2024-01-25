import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class33 {

	static {
		new Class151("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	protected Class33() {
	}

	@OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
	public abstract void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
	public abstract void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
	public abstract int VA();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lclient!u;")
	public abstract Class239[] method5380();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!lo;)V")
	public final void method5381(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub11 arg1) {
		if (arg0 == -1 || !this.FA()) {
			return;
		}
		@Pc(23) Class266 local23 = arg1.aClass266Array1[arg0];
		@Pc(26) Class1_Sub17 local26 = local23.aClass1_Sub17_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt7405; local28++) {
			@Pc(35) short local35 = local23.aShortArray126[local28];
			if (local26.aBooleanArray14[local35]) {
				if (local23.aShortArray132[local28] != -1) {
					this.K(0, 0, 0, 0);
				}
				this.K(local26.anIntArray115[local35], local23.aShortArray130[local28], local23.aShortArray134[local28], local23.aShortArray125[local28]);
			}
		}
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
	public abstract int la();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIZIII[I[III)V")
	private void method5382(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(22) int local22;
		if (arg7 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local22 = -arg8;
				arg8 = arg2;
				arg2 = local22;
			} else if (arg0 == 3) {
				local22 = arg8;
				arg8 = arg2;
				arg2 = local22;
			} else if (arg0 == 2) {
				local22 = arg8;
				arg8 = -arg2 & 0x3FFF;
				arg2 = local22 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg8 = -arg8;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local22 = arg8;
				arg8 = -arg2;
				arg2 = local22;
			} else if (arg0 == 3) {
				local22 = arg8;
				arg8 = arg2;
				arg2 = local22;
			} else if (arg0 == 2) {
				local22 = arg8;
				arg8 = arg2 & 0x3FFF;
				arg2 = -local22 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.xa(arg0, arg5, arg8, arg4, arg2, arg7, arg1);
		} else {
			this.va(arg0, arg5, arg8, arg4, arg2, arg1, arg3, arg6);
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lclient!c;")
	public abstract Class33 method5383(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
	protected abstract void W();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	public abstract void method5384(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()[Lclient!at;")
	public abstract Class15[] method5385();

	@OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
	public abstract void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
	public abstract void sa();

	@OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
	public abstract void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!vk;II)V")
	public abstract void method5386(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class13_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()Z")
	public abstract boolean method5387();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIILclient!na;IIII)V")
	protected final void method5388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg0 / 2;
		@Pc(21) int local21 = -arg3 / 2;
		@Pc(30) int local30 = arg4.va(arg1 + local16, local21 + arg7);
		@Pc(34) int local34 = arg0 / 2;
		@Pc(39) int local39 = -arg3 / 2;
		@Pc(48) int local48 = arg4.va(arg1 + local34, arg7 + local39);
		@Pc(53) int local53 = -arg0 / 2;
		@Pc(61) int local61 = arg3 / 2;
		@Pc(70) int local70 = arg4.va(local53 + arg1, local61 + arg7);
		@Pc(74) int local74 = arg0 / 2;
		@Pc(78) int local78 = arg3 / 2;
		@Pc(87) int local87 = arg4.va(local74 + arg1, arg7 + local78);
		@Pc(94) int local94 = local30 >= local48 ? local48 : local30;
		@Pc(101) int local101 = local70 >= local87 ? local87 : local70;
		@Pc(112) int local112 = local48 >= local87 ? local87 : local48;
		@Pc(119) int local119 = local70 <= local30 ? local70 : local30;
		@Pc(159) int local159;
		if (arg3 != 0) {
			@Pc(135) int local135 = (int) (Math.atan2((double) (local94 - local101), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local135 != 0) {
				if (arg5 != 0) {
					if (local135 > 8192) {
						local159 = 16384 - arg5;
						if (local159 > local135) {
							local135 = local159;
						}
					} else if (arg5 < local135) {
						local135 = arg5;
					}
				}
				this.WA(local135);
			}
		}
		@Pc(172) int local172 = local30 + local87;
		if (arg0 != 0) {
			@Pc(191) int local191 = (int) (Math.atan2((double) (local119 - local112), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local191 != 0) {
				if (arg6 != 0) {
					if (local191 > 8192) {
						local159 = 16384 - arg6;
						if (local191 < local159) {
							local191 = local159;
						}
					} else if (arg6 < local191) {
						local191 = arg6;
					}
				}
				this.o(local191);
			}
		}
		if (local70 + local48 < local172) {
			local172 = local70 + local48;
		}
		local172 = (local172 >> 1) - arg2;
		if (local172 != 0) {
			this.ja(0, local172, 0);
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
	public abstract int C();

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
	protected abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected abstract void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public abstract Class1_Sub3_Sub10 ua(@OriginalArg(0) Class1_Sub3_Sub10 arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	public abstract void method5389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
	public abstract void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!vk;I)V")
	public abstract void method5391(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class13_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!lo;IZIILclient!lo;BII)V")
	public final void method5392(@OriginalArg(0) Class1_Sub3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub3_Sub11 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 == -1 || !this.FA()) {
			return;
		}
		@Pc(22) Class266 local22 = arg0.aClass266Array1[arg6];
		@Pc(25) Class1_Sub17 local25 = local22.aClass1_Sub17_1;
		@Pc(27) Class266 local27 = null;
		if (arg5 != null) {
			local27 = arg5.aClass266Array1[arg7];
			if (local25 != local27.aClass1_Sub17_1) {
				local27 = null;
			}
		}
		this.method5393(arg2, local22, null, arg4, arg3, local25, false, arg1, null, 65535, local27);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
	public abstract int X();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLclient!wr;[IIILclient!gp;IZI[ZILclient!wr;)V")
	private void method5393(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub17 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class266 arg10) {
		@Pc(20) int local20;
		if (arg10 == null || arg4 == 0) {
			for (local20 = 0; local20 < arg1.anInt7405; local20++) {
				@Pc(27) short local27 = arg1.aShortArray126[local20];
				if (arg8 == null || arg8[local27] == arg6 || arg5.anIntArray115[local27] == 0) {
					@Pc(51) short local51 = arg1.aShortArray132[local20];
					if (local51 != -1) {
						this.method5382(0, arg0, 0, arg9 & arg5.anIntArray114[local51], 0, arg5.anIntArrayArray58[local51], arg2, arg7, 0);
					}
					this.method5382(arg5.anIntArray115[local27], arg0, arg1.aShortArray125[local20], arg5.anIntArray114[local27] & arg9, arg1.aShortArray134[local20], arg5.anIntArrayArray58[local27], arg2, arg7, arg1.aShortArray130[local20]);
				}
			}
			return;
		}
		local20 = 0;
		@Pc(121) int local121 = 0;
		for (@Pc(123) int local123 = 0; local123 < arg5.anInt2358; local123++) {
			@Pc(127) boolean local127 = false;
			if (arg1.anInt7405 > local20 && arg1.aShortArray126[local20] == local123) {
				local127 = true;
			}
			@Pc(145) boolean local145 = false;
			if (arg10.anInt7405 > local121 && arg10.aShortArray126[local121] == local123) {
				local145 = true;
			}
			if (local127 || local145) {
				if (arg8 == null || arg6 == arg8[local123] || arg5.anIntArray115[local123] == 0) {
					@Pc(198) short local198 = 0;
					@Pc(203) int local203 = arg5.anIntArray115[local123];
					if (local203 == 3 || local203 == 10) {
						local198 = 128;
					}
					@Pc(221) short local221;
					@Pc(223) short local223;
					@Pc(217) short local217;
					@Pc(225) short local225;
					@Pc(219) byte local219;
					if (local127) {
						local223 = arg1.aShortArray134[local20];
						local217 = arg1.aShortArray125[local20];
						local219 = arg1.aByteArray94[local20];
						local225 = arg1.aShortArray132[local20];
						local221 = arg1.aShortArray130[local20];
						local20++;
					} else {
						local217 = local198;
						local219 = 0;
						local221 = local198;
						local223 = local198;
						local225 = -1;
					}
					@Pc(261) short local261;
					@Pc(259) short local259;
					@Pc(257) short local257;
					@Pc(263) short local263;
					@Pc(265) byte local265;
					if (local145) {
						local265 = arg10.aByteArray94[local121];
						local261 = arg10.aShortArray130[local121];
						local263 = arg10.aShortArray132[local121];
						local259 = arg10.aShortArray134[local121];
						local257 = arg10.aShortArray125[local121];
						local121++;
					} else {
						local257 = local198;
						local259 = local198;
						local261 = local198;
						local263 = -1;
						local265 = 0;
					}
					if (local225 != -1) {
						this.method5382(0, arg0, 0, arg9 & arg5.anIntArray114[local225], 0, arg5.anIntArrayArray58[local225], arg2, arg7, 0);
					} else if (local263 != -1) {
						this.method5382(0, arg0, 0, arg9 & arg5.anIntArray114[local263], 0, arg5.anIntArrayArray58[local263], arg2, arg7, 0);
					}
					@Pc(403) int local403;
					@Pc(392) int local392;
					@Pc(381) int local381;
					if ((local219 & 0x2) == 0 && (local265 & 0x1) == 0) {
						@Pc(366) int local366;
						if (local203 == 2) {
							local366 = local261 - local221 & 0x3FFF;
							@Pc(483) int local483 = local259 - local223 & 0x3FFF;
							if (local483 >= 8192) {
								local483 -= 16384;
							}
							if (local366 >= 8192) {
								local366 -= 16384;
							}
							@Pc(500) int local500 = local257 - local217 & 0x3FFF;
							local403 = arg4 * local366 / arg3 + local221 & 0x3FFF;
							if (local500 >= 8192) {
								local500 -= 16384;
							}
							local392 = local223 + arg4 * local483 / arg3 & 0x3FFF;
							local381 = local500 * arg4 / arg3 + local217 & 0x3FFF;
						} else if (local203 == 9) {
							local366 = local261 - local221 & 0x3FFF;
							if (local366 >= 8192) {
								local366 -= 16384;
							}
							local403 = arg4 * local366 / arg3 + local221 & 0x3FFF;
							local381 = 0;
							local392 = 0;
						} else if (local203 == 7) {
							local366 = local261 - local221 & 0x3F;
							if (local366 >= 32) {
								local366 -= 64;
							}
							local381 = local217 + arg4 * (local257 - local217) / arg3;
							local392 = arg4 * (local259 - local223) / arg3 + local223;
							local403 = local221 + arg4 * local366 / arg3 & 0x3F;
						} else {
							local392 = (local259 - local223) * arg4 / arg3 + local223;
							local403 = arg4 * (local261 - local221) / arg3 + local221;
							local381 = arg4 * (local257 - local217) / arg3 + local217;
						}
					} else {
						local392 = local223;
						local403 = local221;
						local381 = local217;
					}
					this.method5382(local203, arg0, local381, arg9 & arg5.anIntArray114[local123], local392, arg5.anIntArrayArray58[local123], arg2, arg7, local403);
				} else {
					if (local127) {
						local20++;
					}
					if (local145) {
						local121++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZIIII[ILclient!lo;Lclient!lo;)V")
	public final void method5394(@OriginalArg(0) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) Class1_Sub3_Sub11 arg7, @OriginalArg(10) Class1_Sub3_Sub11 arg8) {
		if (arg4 == -1 || !this.FA()) {
			return;
		}
		@Pc(16) Class266 local16 = arg7.aClass266Array1[arg4];
		@Pc(19) Class1_Sub17 local19 = local16.aClass1_Sub17_1;
		@Pc(21) Class266 local21 = null;
		if (arg8 != null) {
			local21 = arg8.aClass266Array1[arg5];
			if (local21.aClass1_Sub17_1 != local19) {
				local21 = null;
			}
		}
		this.method5393(arg1, local16, arg6, arg2, arg3, local19, false, 0, null, arg0, local21);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
	protected abstract boolean FA();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!ia;Z)Z")
	public abstract boolean method5395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
	public abstract int ra();

	@OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class163 arg2, @OriginalArg(3) Class163 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIBZLclient!lo;IILclient!lo;IILclient!lo;[ZLclient!lo;II)V")
	public final void method5396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class1_Sub3_Sub11 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub3_Sub11 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class1_Sub3_Sub11 arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) Class1_Sub3_Sub11 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg5 == -1) {
			return;
		}
		if (arg10 == null || arg7 == -1) {
			this.method5392(arg3, 0, arg2, arg0, arg4, arg9, arg5, arg1);
		} else if (this.FA()) {
			@Pc(34) Class266 local34 = arg3.aClass266Array1[arg5];
			@Pc(37) Class1_Sub17 local37 = local34.aClass1_Sub17_1;
			@Pc(39) Class266 local39 = null;
			if (arg9 != null) {
				local39 = arg9.aClass266Array1[arg1];
				if (local37 != local39.aClass1_Sub17_1) {
					local39 = null;
				}
			}
			this.method5393(arg2, local34, null, arg4, arg0, local37, false, 0, arg10, 65535, local39);
			@Pc(71) Class266 local71 = arg11.aClass266Array1[arg7];
			@Pc(73) Class266 local73 = null;
			if (arg6 != null) {
				local73 = arg6.aClass266Array1[arg12];
				if (local37 != local73.aClass1_Sub17_1) {
					local73 = null;
				}
			}
			this.xa(0, new int[0], 0, 0, 0, 0, arg2);
			this.method5393(arg2, local71, null, arg13, arg8, local71.aClass1_Sub17_1, true, 0, arg10, 65535, local73);
			this.W();
		}
	}

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
	public abstract void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
	public abstract void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()V")
	public abstract void method5397();

	@OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
	public abstract void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);
}
