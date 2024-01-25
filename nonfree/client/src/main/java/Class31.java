import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public abstract class Class31 {

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	protected Class31() {
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	public abstract int b();

	@OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
	public abstract int n();

	@OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
	protected abstract void W();

	@OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
	public abstract void sa();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!c;IIIZ)V")
	public abstract void method5700(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
	public abstract void ZA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()Z")
	public abstract boolean method5701();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IILclient!ia;Z)Z")
	public abstract boolean method5702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
	public abstract void N(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIIII[I[IIZ)V")
	private void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8) {
		@Pc(26) int local26;
		if (arg4 == 1) {
			if (arg3 == 0 || arg3 == 1) {
				local26 = -arg0;
				arg0 = arg2;
				arg2 = local26;
			} else if (arg3 == 3) {
				local26 = arg0;
				arg0 = arg2;
				arg2 = local26;
			} else if (arg3 == 2) {
				local26 = arg0;
				arg0 = -arg2 & 0x3FFF;
				arg2 = local26 & 0x3FFF;
			}
		} else if (arg4 == 2) {
			if (arg3 == 0 || arg3 == 1) {
				arg0 = -arg0;
				arg2 = -arg2;
			} else if (arg3 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg0 = -arg0 & 0x3FFF;
			}
		} else if (arg4 == 3) {
			if (arg3 == 0 || arg3 == 1) {
				local26 = arg0;
				arg0 = -arg2;
				arg2 = local26;
			} else if (arg3 == 3) {
				local26 = arg0;
				arg0 = arg2;
				arg2 = local26;
			} else if (arg3 == 2) {
				local26 = arg0;
				arg0 = arg2 & 0x3FFF;
				arg2 = -local26 & 0x3FFF;
			}
		}
		if (arg1 == 65535) {
			this.xa(arg3, arg6, arg0, arg7, arg2, arg4, arg8);
		} else {
			this.va(arg3, arg6, arg0, arg7, arg2, arg8, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
	public abstract void o(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILclient!na;Lclient!na;III)V")
	public abstract void ea(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) Class64 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
	public abstract int Q();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!aq;I)V")
	public abstract void method5704(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lclient!j;)Lclient!j;")
	public abstract Class3_Sub3_Sub4 ua(@OriginalArg(0) Class3_Sub3_Sub4 arg0);

	@OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
	public abstract void ja(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
	public abstract int VA();

	@OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
	public abstract void YA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
	public abstract void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()[Lclient!ot;")
	public abstract Class178[] method5705();

	@OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
	protected abstract void va(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!ia;Lclient!aq;II)V")
	public abstract void method5706(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class13_Sub1 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
	public abstract int la();

	@OriginalMember(owner = "client!c", name = "d", descriptor = "()[Lclient!sm;")
	public abstract Class209[] method5707();

	@OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
	public abstract int C();

	@OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
	protected abstract void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IBLclient!iu;)V")
	public final void method5709(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3_Sub13 arg1) {
		if (arg0 == -1 || !this.FA()) {
			return;
		}
		@Pc(19) Class46 local19 = arg1.aClass46Array1[arg0];
		@Pc(28) Class3_Sub39 local28 = local19.aClass3_Sub39_1;
		for (@Pc(30) int local30 = 0; local30 < local19.anInt1560; local30++) {
			@Pc(37) short local37 = local19.aShortArray8[local30];
			if (local28.aBooleanArray20[local37]) {
				if (local19.aShortArray6[local30] != -1) {
					this.K(0, 0, 0, 0);
				}
				this.K(local28.anIntArray471[local37], local19.aShortArray5[local30], local19.aShortArray12[local30], local19.aShortArray13[local30]);
			}
		}
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
	public abstract int ra();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lclient!c;")
	public abstract Class31 method5710(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
	protected abstract void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II[ZIIILclient!iu;ZILclient!iu;Lclient!iu;IIILclient!iu;)V")
	public final void method5711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub3_Sub13 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) Class3_Sub3_Sub13 arg8, @OriginalArg(10) Class3_Sub3_Sub13 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class3_Sub3_Sub13 arg13) {
		if (arg3 == -1) {
			return;
		}
		if (arg2 == null || arg10 == -1) {
			this.method5717(arg3, arg13, arg4, arg1, 0, arg11, arg8, arg7);
		} else if (this.FA()) {
			@Pc(41) Class46 local41 = arg13.aClass46Array1[arg3];
			@Pc(44) Class3_Sub39 local44 = local41.aClass3_Sub39_1;
			@Pc(46) Class46 local46 = null;
			if (arg8 != null) {
				local46 = arg8.aClass46Array1[arg11];
				if (local46.aClass3_Sub39_1 != local44) {
					local46 = null;
				}
			}
			this.method5715(local46, arg4, 0, arg7, arg2, false, null, local44, arg1, local41, 65535);
			@Pc(78) Class46 local78 = arg6.aClass46Array1[arg10];
			@Pc(80) Class46 local80 = null;
			if (arg9 != null) {
				local80 = arg9.aClass46Array1[arg5];
				if (local44 != local80.aClass3_Sub39_1) {
					local80 = null;
				}
			}
			this.xa(0, new int[0], 0, 0, 0, 0, arg7);
			this.method5715(local80, arg12, 0, arg7, arg2, true, null, local78.aClass3_Sub39_1, arg0, local78, 65535);
			this.W();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIBILclient!na;)V")
	protected final void method5712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class64 arg7) {
		@Pc(16) int local16 = -arg3 / 2;
		@Pc(21) int local21 = -arg2 / 2;
		@Pc(32) int local32 = arg7.va(arg6 + local16, arg5 - -local21);
		@Pc(36) int local36 = arg3 / 2;
		@Pc(41) int local41 = -arg2 / 2;
		@Pc(50) int local50 = arg7.va(local36 + arg6, local41 + arg5);
		@Pc(55) int local55 = -arg3 / 2;
		@Pc(59) int local59 = arg2 / 2;
		@Pc(68) int local68 = arg7.va(local55 + arg6, arg5 + local59);
		@Pc(72) int local72 = arg3 / 2;
		@Pc(76) int local76 = arg2 / 2;
		@Pc(85) int local85 = arg7.va(local72 + arg6, arg5 + local76);
		@Pc(96) int local96 = local50 > local32 ? local32 : local50;
		@Pc(107) int local107 = local68 < local85 ? local68 : local85;
		@Pc(118) int local118 = local50 < local85 ? local50 : local85;
		@Pc(152) int local152;
		if (arg2 != 0) {
			@Pc(137) int local137 = (int) (Math.atan2((double) (local96 - local107), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local137 != 0) {
				if (arg0 != 0) {
					if (local137 > 8192) {
						local152 = 16384 - arg0;
						if (local152 > local137) {
							local137 = local152;
						}
					} else if (local137 > arg0) {
						local137 = arg0;
					}
				}
				this.WA(local137);
			}
		}
		@Pc(182) int local182 = local68 <= local32 ? local68 : local32;
		@Pc(186) int local186 = local32 + local85;
		if (arg3 != 0) {
			@Pc(211) int local211 = (int) (Math.atan2((double) (local182 - local118), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local211 != 0) {
				if (arg1 != 0) {
					if (local211 > 8192) {
						local152 = 16384 - arg1;
						if (local211 < local152) {
							local211 = local152;
						}
					} else if (local211 > arg1) {
						local211 = arg1;
					}
				}
				this.o(local211);
			}
		}
		if (local68 + local50 < local186) {
			local186 = local50 + local68;
		}
		local186 = (local186 >> 1) - arg4;
		if (local186 != 0) {
			this.ja(0, local186, 0);
		}
	}

	@OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!iu;I[IZIIIZIILclient!iu;)V")
	public final void method5713(@OriginalArg(0) Class3_Sub3_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class3_Sub3_Sub13 arg8) {
		if (arg5 == -1 || !this.FA()) {
			return;
		}
		@Pc(21) Class46 local21 = arg0.aClass46Array1[arg5];
		@Pc(24) Class3_Sub39 local24 = local21.aClass3_Sub39_1;
		@Pc(26) Class46 local26 = null;
		if (arg8 != null) {
			local26 = arg8.aClass46Array1[arg6];
			if (local24 != local26.aClass3_Sub39_1) {
				local26 = null;
			}
		}
		this.method5715(local26, arg4, 0, arg3, null, false, arg2, local24, arg7, local21, arg1);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	public abstract void method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!dc;IIZ[ZZZ[ILclient!sp;ILclient!dc;I)V")
	private void method5715(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class3_Sub39 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class46 arg9, @OriginalArg(11) int arg10) {
		@Pc(12) int local12;
		if (arg0 == null || arg8 == 0) {
			for (local12 = 0; local12 < arg9.anInt1560; local12++) {
				@Pc(18) short local18 = arg9.aShortArray8[local12];
				if (arg4 == null || arg4[local18] == arg5 || arg7.anIntArray471[local18] == 0) {
					@Pc(43) short local43 = arg9.aShortArray6[local12];
					if (local43 != -1) {
						this.method5703(0, arg7.anIntArray470[local43] & arg10, 0, 0, arg2, arg6, arg7.anIntArrayArray52[local43], 0, arg3);
					}
					this.method5703(arg9.aShortArray5[local12], arg10 & arg7.anIntArray470[local18], arg9.aShortArray13[local12], arg7.anIntArray471[local18], arg2, arg6, arg7.anIntArrayArray52[local18], arg9.aShortArray12[local12], arg3);
				}
			}
			return;
		}
		local12 = 0;
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < arg7.anInt6572; local114++) {
			@Pc(117) boolean local117 = false;
			if (arg9.anInt1560 > local12 && arg9.aShortArray8[local12] == local114) {
				local117 = true;
			}
			@Pc(139) boolean local139 = false;
			if (local112 < arg0.anInt1560 && local114 == arg0.aShortArray8[local112]) {
				local139 = true;
			}
			if (local117 || local139) {
				if (arg4 == null || arg4[local114] == arg5 || arg7.anIntArray471[local114] == 0) {
					@Pc(187) short local187 = 0;
					@Pc(192) int local192 = arg7.anIntArray471[local114];
					if (local192 == 3 || local192 == 10) {
						local187 = 128;
					}
					@Pc(229) short local229;
					@Pc(209) short local209;
					@Pc(224) short local224;
					@Pc(219) short local219;
					@Pc(214) byte local214;
					if (local117) {
						local209 = arg9.aShortArray12[local12];
						local214 = arg9.aByteArray18[local12];
						local219 = arg9.aShortArray6[local12];
						local224 = arg9.aShortArray13[local12];
						local229 = arg9.aShortArray5[local12];
						local12++;
					} else {
						local229 = local187;
						local219 = -1;
						local224 = local187;
						local214 = 0;
						local209 = local187;
					}
					@Pc(253) short local253;
					@Pc(245) short local245;
					@Pc(249) short local249;
					@Pc(251) short local251;
					@Pc(247) byte local247;
					if (local139) {
						local247 = arg0.aByteArray18[local112];
						local249 = arg0.aShortArray13[local112];
						local245 = arg0.aShortArray12[local112];
						local251 = arg0.aShortArray6[local112];
						local253 = arg0.aShortArray5[local112];
						local112++;
					} else {
						local245 = local187;
						local247 = 0;
						local249 = local187;
						local251 = -1;
						local253 = local187;
					}
					@Pc(300) int local300;
					@Pc(298) int local298;
					@Pc(296) int local296;
					if ((local214 & 0x2) == 0 && (local247 & 0x1) == 0) {
						@Pc(354) int local354;
						if (local192 == 2) {
							local354 = local253 - local229 & 0x3FFF;
							@Pc(432) int local432 = local245 - local209 & 0x3FFF;
							@Pc(438) int local438 = local249 - local224 & 0x3FFF;
							if (local354 >= 8192) {
								local354 -= 16384;
							}
							if (local432 >= 8192) {
								local432 -= 16384;
							}
							if (local438 >= 8192) {
								local438 -= 16384;
							}
							local298 = local209 + local432 * arg8 / arg1 & 0x3FFF;
							local300 = local229 + arg8 * local354 / arg1 & 0x3FFF;
							local296 = arg8 * local438 / arg1 + local224 & 0x3FFF;
						} else if (local192 == 9) {
							local354 = local253 - local229 & 0x3FFF;
							if (local354 >= 8192) {
								local354 -= 16384;
							}
							local296 = 0;
							local298 = 0;
							local300 = local229 + local354 * arg8 / arg1 & 0x3FFF;
						} else if (local192 == 7) {
							local354 = local253 - local229 & 0x3F;
							if (local354 >= 32) {
								local354 -= 64;
							}
							local298 = (local245 - local209) * arg8 / arg1 + local209;
							local296 = local224 + arg8 * (local249 - local224) / arg1;
							local300 = local229 + local354 * arg8 / arg1 & 0x3F;
						} else {
							local296 = local224 + arg8 * (local249 - local224) / arg1;
							local298 = local209 + (local245 - local209) * arg8 / arg1;
							local300 = local229 + (local253 - local229) * arg8 / arg1;
						}
					} else {
						local296 = local224;
						local298 = local209;
						local300 = local229;
					}
					if (local219 != -1) {
						this.method5703(0, arg7.anIntArray470[local219] & arg10, 0, 0, arg2, arg6, arg7.anIntArrayArray52[local219], 0, arg3);
					} else if (local251 != -1) {
						this.method5703(0, arg10 & arg7.anIntArray470[local251], 0, 0, arg2, arg6, arg7.anIntArrayArray52[local251], 0, arg3);
					}
					this.method5703(local300, arg7.anIntArray470[local114] & arg10, local296, local192, arg2, arg6, arg7.anIntArrayArray52[local114], local298, arg3);
				} else {
					if (local139) {
						local112++;
					}
					if (local117) {
						local12++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
	public abstract void u(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "e", descriptor = "()V")
	public abstract void method5716();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!iu;IIIILclient!iu;ZB)V")
	public final void method5717(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3_Sub13 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub3_Sub13 arg6, @OriginalArg(7) boolean arg7) {
		if (arg0 == -1 || !this.FA()) {
			return;
		}
		@Pc(21) Class46 local21 = arg1.aClass46Array1[arg0];
		@Pc(24) Class3_Sub39 local24 = local21.aClass3_Sub39_1;
		@Pc(26) Class46 local26 = null;
		if (arg6 != null) {
			local26 = arg6.aClass46Array1[arg5];
			if (local24 != local26.aClass3_Sub39_1) {
				local26 = null;
			}
		}
		this.method5715(local26, arg2, arg4, arg7, null, false, null, local24, arg3, local21, 65535);
		this.W();
	}

	@OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
	public abstract void WA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
	public abstract void oa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
	public abstract int X();

	@OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
	protected abstract boolean FA();
}
