import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public abstract class Class224 {

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	protected Class224() {
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZLclient!kt;IILclient!kt;III)V")
	public final void method5793(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class6_Sub2_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub2_Sub8 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 == -1 || !this.method5805()) {
			return;
		}
		@Pc(17) Class191 local17 = arg2.aClass191Array1[arg3];
		@Pc(20) Class6_Sub12 local20 = local17.aClass6_Sub12_1;
		@Pc(22) Class191 local22 = null;
		if (arg5 != null) {
			local22 = arg5.aClass191Array1[arg4];
			if (local20 != local22.aClass6_Sub12_1) {
				local22 = null;
			}
		}
		this.method5801(arg1, null, false, null, local17, arg6, arg0, arg7, local20, local22, 65535);
		this.method5810();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "()[Lclient!in;")
	public abstract Class119[] method5794();

	@OriginalMember(owner = "client!va", name = "b", descriptor = "()I")
	public abstract int method5795();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!gs;Lclient!la;II)V")
	public abstract void method5796(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class57_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!va", name = "c", descriptor = "()I")
	public abstract int method5797();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!gs;Lclient!la;I)V")
	public abstract void method5798(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class57_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!va", name = "d", descriptor = "()V")
	public abstract void method5799();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z[ZZZ[ILclient!pb;IIILclient!ds;Lclient!pb;I)V")
	private void method5801(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class191 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class6_Sub12 arg8, @OriginalArg(10) Class191 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg9 == null || arg5 == 0) {
			for (local11 = 0; local11 < arg4.anInt5282; local11++) {
				@Pc(18) short local18 = arg4.aShortArray81[local11];
				if (arg1 == null || arg2 == arg1[local18] || arg8.anIntArray115[local18] == 0) {
					@Pc(46) short local46 = arg4.aShortArray73[local11];
					if (local46 != -1) {
						this.method5804(arg8.anIntArrayArray10[local46], arg3, 0, arg6, 0, arg0, 0, 0, arg8.anIntArray114[local46] & arg10);
					}
					this.method5804(arg8.anIntArrayArray10[local18], arg3, arg8.anIntArray115[local18], arg6, arg4.aShortArray75[local11], arg0, arg4.aShortArray80[local11], arg4.aShortArray82[local11], arg8.anIntArray114[local18] & arg10);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(111) int local111 = 0;
		for (@Pc(117) int local117 = 0; local117 < arg8.anInt1955; local117++) {
			@Pc(121) boolean local121 = false;
			if (local11 < arg4.anInt5282 && local117 == arg4.aShortArray81[local11]) {
				local121 = true;
			}
			@Pc(139) boolean local139 = false;
			if (arg9.anInt5282 > local111 && local117 == arg9.aShortArray81[local111]) {
				local139 = true;
			}
			if (local121 || local139) {
				if (arg1 == null || arg2 == arg1[local117] || arg8.anIntArray115[local117] == 0) {
					@Pc(185) short local185 = 0;
					@Pc(190) int local190 = arg8.anIntArray115[local117];
					if (local190 == 3 || local190 == 10) {
						local185 = 128;
					}
					@Pc(215) short local215;
					@Pc(225) short local225;
					@Pc(205) short local205;
					@Pc(220) short local220;
					@Pc(210) byte local210;
					if (local121) {
						local205 = arg4.aShortArray80[local11];
						local210 = arg4.aByteArray66[local11];
						local215 = arg4.aShortArray75[local11];
						local220 = arg4.aShortArray73[local11];
						local225 = arg4.aShortArray82[local11];
						local11++;
					} else {
						local215 = local185;
						local205 = local185;
						local220 = -1;
						local210 = 0;
						local225 = local185;
					}
					@Pc(244) short local244;
					@Pc(250) short local250;
					@Pc(248) short local248;
					@Pc(246) short local246;
					@Pc(242) byte local242;
					if (local139) {
						local244 = arg9.aShortArray75[local111];
						local246 = arg9.aShortArray73[local111];
						local248 = arg9.aShortArray80[local111];
						local250 = arg9.aShortArray82[local111];
						local242 = arg9.aByteArray66[local111];
						local111++;
					} else {
						local242 = 0;
						local244 = local185;
						local246 = -1;
						local248 = local185;
						local250 = local185;
					}
					@Pc(293) int local293;
					@Pc(291) int local291;
					@Pc(295) int local295;
					if ((local210 & 0x2) == 0 && (local242 & 0x1) == 0) {
						@Pc(309) int local309;
						if (local190 == 2) {
							local309 = local244 - local215 & 0x3FFF;
							@Pc(316) int local316 = local250 - local225 & 0x3FFF;
							if (local309 >= 8192) {
								local309 -= 16384;
							}
							if (local316 >= 8192) {
								local316 -= 16384;
							}
							@Pc(333) int local333 = local248 - local205 & 0x3FFF;
							local293 = arg5 * local309 / arg7 + local215 & 0x3FFF;
							if (local333 >= 8192) {
								local333 -= 16384;
							}
							local291 = local225 + local316 * arg5 / arg7 & 0x3FFF;
							local295 = arg5 * local333 / arg7 + local205 & 0x3FFF;
						} else if (local190 == 9) {
							local309 = local244 - local215 & 0x3FFF;
							if (local309 >= 8192) {
								local309 -= 16384;
							}
							local293 = local309 * arg5 / arg7 + local215 & 0x3FFF;
							local295 = 0;
							local291 = 0;
						} else if (local190 == 7) {
							local309 = local244 - local215 & 0x3F;
							if (local309 >= 32) {
								local309 -= 64;
							}
							local291 = local225 + (local250 - local225) * arg5 / arg7;
							local293 = local309 * arg5 / arg7 + local215 & 0x3F;
							local295 = local205 + (local248 - local205) * arg5 / arg7;
						} else {
							local293 = local215 + (local244 - local215) * arg5 / arg7;
							local291 = local225 + (local250 - local225) * arg5 / arg7;
							local295 = arg5 * (local248 - local205) / arg7 + local205;
						}
					} else {
						local291 = local225;
						local293 = local215;
						local295 = local205;
					}
					if (local220 != -1) {
						this.method5804(arg8.anIntArrayArray10[local220], arg3, 0, arg6, 0, arg0, 0, 0, arg8.anIntArray114[local220] & arg10);
					} else if (local246 != -1) {
						this.method5804(arg8.anIntArrayArray10[local246], arg3, 0, arg6, 0, arg0, 0, 0, arg8.anIntArray114[local246] & arg10);
					}
					this.method5804(arg8.anIntArrayArray10[local117], arg3, local190, arg6, local293, arg0, local295, local291, arg8.anIntArray114[local117] & arg10);
				} else {
					if (local121) {
						local11++;
					}
					if (local139) {
						local111++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!kt;Lclient!kt;[ZIILclient!kt;IZIIILclient!kt;III)V")
	public final void method5802(@OriginalArg(0) Class6_Sub2_Sub8 arg0, @OriginalArg(1) Class6_Sub2_Sub8 arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub2_Sub8 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class6_Sub2_Sub8 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg13 == -1) {
			return;
		}
		if (arg2 == null || arg11 == -1) {
			this.method5793(0, arg6, arg5, arg13, arg3, arg1, arg12, arg4);
		} else if (this.method5805()) {
			@Pc(43) Class191 local43 = arg5.aClass191Array1[arg13];
			@Pc(46) Class6_Sub12 local46 = local43.aClass6_Sub12_1;
			@Pc(48) Class191 local48 = null;
			if (arg1 != null) {
				local48 = arg1.aClass191Array1[arg3];
				if (local48.aClass6_Sub12_1 != local46) {
					local48 = null;
				}
			}
			this.method5801(arg6, arg2, false, null, local43, arg12, 0, arg4, local46, local48, 65535);
			@Pc(80) Class191 local80 = arg10.aClass191Array1[arg11];
			@Pc(82) Class191 local82 = null;
			if (arg0 != null) {
				local82 = arg0.aClass191Array1[arg7];
				if (local82.aClass6_Sub12_1 != local46) {
					local82 = null;
				}
			}
			this.method5842(0, new int[0], 0, 0, 0, 0, arg6);
			this.method5801(arg6, arg2, true, null, local80, arg9, 0, arg8, local80.aClass6_Sub12_1, local82, 65535);
			this.method5810();
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "()V")
	public abstract void method5803();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([I[IIIIZIIZI)V")
	private void method5804(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15;
		if (arg3 == 1) {
			if (arg2 == 0 || arg2 == 1) {
				local15 = -arg4;
				arg4 = arg6;
				arg6 = local15;
			} else if (arg2 == 3) {
				local15 = arg4;
				arg4 = arg6;
				arg6 = local15;
			} else if (arg2 == 2) {
				local15 = arg4;
				arg4 = -arg6 & 0x3FFF;
				arg6 = local15 & 0x3FFF;
			}
		} else if (arg3 == 2) {
			if (arg2 == 0 || arg2 == 1) {
				arg4 = -arg4;
				arg6 = -arg6;
			} else if (arg2 == 2) {
				arg6 = -arg6 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg3 == 3) {
			if (arg2 == 0 || arg2 == 1) {
				local15 = arg4;
				arg4 = -arg6;
				arg6 = local15;
			} else if (arg2 == 3) {
				local15 = arg4;
				arg4 = arg6;
				arg6 = local15;
			} else if (arg2 == 2) {
				local15 = arg4;
				arg4 = arg6 & 0x3FFF;
				arg6 = -local15 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.method5842(arg2, arg0, arg4, arg7, arg6, arg3, arg5);
		} else {
			this.method5822(arg2, arg0, arg4, arg7, arg6, arg5, arg8, arg1);
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "()Z")
	protected abstract boolean method5805();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V")
	public abstract void method5806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!va", name = "g", descriptor = "()[Lclient!gq;")
	public abstract Class94[] method5807();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BIZ)Lclient!va;")
	public abstract Class224 method5808(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public abstract void method5809(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!va", name = "h", descriptor = "()V")
	protected abstract void method5810();

	@OriginalMember(owner = "client!va", name = "i", descriptor = "()I")
	public abstract int method5811();

	@OriginalMember(owner = "client!va", name = "j", descriptor = "()I")
	public abstract int method5812();

	@OriginalMember(owner = "client!va", name = "k", descriptor = "()I")
	public abstract int method5813();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII)V")
	public abstract void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!va", name = "l", descriptor = "()I")
	public abstract int method5815();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!kt;[IIIIZIIILclient!kt;I)V")
	public final void method5816(@OriginalArg(0) Class6_Sub2_Sub8 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class6_Sub2_Sub8 arg8) {
		if (arg4 == -1 || !this.method5805()) {
			return;
		}
		@Pc(24) Class191 local24 = arg8.aClass191Array1[arg4];
		@Pc(27) Class6_Sub12 local27 = local24.aClass6_Sub12_1;
		@Pc(29) Class191 local29 = null;
		if (arg0 != null) {
			local29 = arg0.aClass191Array1[arg2];
			if (local29.aClass6_Sub12_1 != local27) {
				local29 = null;
			}
		}
		this.method5801(arg5, null, false, arg1, local24, arg3, 0, arg6, local27, local29, arg7);
		this.method5810();
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public abstract void method5817(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!og;Lclient!og;III)V")
	public abstract void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!va", name = "m", descriptor = "()I")
	public abstract int method5820();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method5822(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(III)V")
	public abstract void method5823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(SS)V")
	public abstract void method5824(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!va;IIIZ)V")
	public abstract void method5825(@OriginalArg(0) Class224 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!va", name = "n", descriptor = "()Z")
	public abstract boolean method5826();

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
	public abstract void method5827(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(IIII)V")
	protected abstract void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	public abstract void method5829(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(SS)V")
	public abstract void method5830(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIILclient!og;III)V")
	protected final void method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class86 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg7 / 2;
		@Pc(21) int local21 = -arg1 / 2;
		@Pc(31) int local31 = arg4.method6590(arg3 + local16, local21 + arg0);
		@Pc(35) int local35 = arg7 / 2;
		@Pc(40) int local40 = -arg1 / 2;
		@Pc(49) int local49 = arg4.method6590(local35 + arg3, arg0 + local40);
		@Pc(54) int local54 = -arg7 / 2;
		@Pc(58) int local58 = arg1 / 2;
		@Pc(68) int local68 = arg4.method6590(arg3 + local54, local58 + arg0);
		@Pc(72) int local72 = arg7 / 2;
		@Pc(76) int local76 = arg1 / 2;
		@Pc(86) int local86 = arg4.method6590(local72 + arg3, arg0 - -local76);
		@Pc(97) int local97 = local31 < local49 ? local31 : local49;
		@Pc(104) int local104 = local86 > local68 ? local68 : local86;
		@Pc(115) int local115 = local49 < local86 ? local49 : local86;
		@Pc(122) int local122 = local31 >= local68 ? local68 : local31;
		@Pc(164) int local164;
		if (arg1 != 0) {
			@Pc(141) int local141 = (int) (Math.atan2((double) (local97 - local104), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
			if (local141 != 0) {
				if (arg6 != 0) {
					if (local141 > 8192) {
						local164 = 16384 - arg6;
						if (local164 > local141) {
							local141 = local164;
						}
					} else if (local141 > arg6) {
						local141 = arg6;
					}
				}
				this.method5817(local141);
			}
		}
		@Pc(177) int local177 = local31 + local86;
		if (arg7 != 0) {
			@Pc(196) int local196 = (int) (Math.atan2((double) (local122 - local115), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local196 != 0) {
				if (arg5 != 0) {
					if (local196 > 8192) {
						local164 = 16384 - arg5;
						if (local196 < local164) {
							local196 = local164;
						}
					} else if (local196 > arg5) {
						local196 = arg5;
					}
				}
				this.method5840(local196);
			}
		}
		if (local68 + local49 < local177) {
			local177 = local68 + local49;
		}
		local177 = (local177 >> 1) - arg2;
		if (local177 != 0) {
			this.method5806(0, local177, 0);
		}
	}

	@OriginalMember(owner = "client!va", name = "o", descriptor = "()I")
	public abstract int method5834();

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!kt;)V")
	public final void method5835(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub8 arg1) {
		if (arg0 == -1 || !this.method5805()) {
			return;
		}
		@Pc(23) Class191 local23 = arg1.aClass191Array1[arg0];
		@Pc(26) Class6_Sub12 local26 = local23.aClass6_Sub12_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt5282; local28++) {
			@Pc(35) short local35 = local23.aShortArray81[local28];
			if (local26.aBooleanArray5[local35]) {
				if (local23.aShortArray73[local28] != -1) {
					this.method5828(0, 0, 0, 0);
				}
				this.method5828(local26.anIntArray115[local35], local23.aShortArray75[local28], local23.aShortArray82[local28], local23.aShortArray80[local28]);
			}
		}
		this.method5810();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!gs;Z)Z")
	public abstract boolean method5836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ss;)Lclient!ss;")
	public abstract Class6_Sub2_Sub10 method5837(@OriginalArg(0) Class6_Sub2_Sub10 arg0);

	@OriginalMember(owner = "client!va", name = "p", descriptor = "()I")
	public abstract int method5838();

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
	public abstract void method5839(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
	public abstract void method5840(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
	public abstract void method5841(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5842(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!va", name = "q", descriptor = "()I")
	public abstract int method5843();
}
