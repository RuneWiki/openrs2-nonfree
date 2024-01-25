import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public abstract class Class21 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class21() {
	}

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "()V")
	protected abstract void Y();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZ)Lclient!ba;")
	public abstract Class21 method7131(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(III)V")
	public abstract void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "ka", descriptor = "(SS)V")
	public abstract void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZLclient!ga;IIIIILclient!ga;I)V")
	public final void method7132(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub4_Sub12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class3_Sub4_Sub12 arg6, @OriginalArg(8) int arg7) {
		if (arg4 == -1 || !this.Q()) {
			return;
		}
		@Pc(17) Class80 local17 = arg6.aClass80Array1[arg4];
		@Pc(20) Class3_Sub44 local20 = local17.aClass3_Sub44_1;
		@Pc(22) Class80 local22 = null;
		if (arg1 != null) {
			local22 = arg1.aClass80Array1[arg2];
			if (local22.aClass3_Sub44_1 != local20) {
				local22 = null;
			}
		}
		this.method7144(null, local20, local17, arg7, arg5, arg0, local22, null, 65535, arg3, false);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!ht;II)V")
	public abstract void method7133(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()Z")
	public abstract boolean method7134();

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "()[Lclient!rea;")
	public abstract Class280[] method7135();

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "()I")
	public abstract int h();

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "()V")
	public abstract void P();

	@OriginalMember(owner = "client!ba", name = "ua", descriptor = "(IIII)V")
	protected abstract void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ba", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ba", name = "AA", descriptor = "(I)V")
	public abstract void AA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI[ZIBILclient!ga;Lclient!ga;IILclient!ga;ILclient!ga;II)V")
	public final void method7136(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub4_Sub12 arg5, @OriginalArg(7) Class3_Sub4_Sub12 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3_Sub4_Sub12 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class3_Sub4_Sub12 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg10 == -1) {
			return;
		}
		if (arg2 == null || arg4 == -1) {
			this.method7132(arg0, arg5, arg8, arg3, arg10, 0, arg11, arg12);
		} else if (this.Q()) {
			@Pc(39) Class80 local39 = arg11.aClass80Array1[arg10];
			@Pc(42) Class3_Sub44 local42 = local39.aClass3_Sub44_1;
			@Pc(44) Class80 local44 = null;
			if (arg5 != null) {
				local44 = arg5.aClass80Array1[arg8];
				if (local44.aClass3_Sub44_1 != local42) {
					local44 = null;
				}
			}
			this.method7144(null, local42, local39, arg12, 0, arg0, local44, arg2, 65535, arg3, false);
			@Pc(76) Class80 local76 = arg9.aClass80Array1[arg4];
			@Pc(78) Class80 local78 = null;
			if (arg6 != null) {
				local78 = arg6.aClass80Array1[arg13];
				if (local78.aClass3_Sub44_1 != local42) {
					local78 = null;
				}
			}
			this.E(0, new int[0], 0, 0, 0, 0, arg0);
			this.method7144(null, local76.aClass3_Sub44_1, local76, arg1, 0, arg0, local78, arg2, 65535, arg7, true);
			this.Y();
		}
	}

	@OriginalMember(owner = "client!ba", name = "Q", descriptor = "()Z")
	protected abstract boolean Q();

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "(I)V")
	public abstract void v(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "m", descriptor = "(III)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "LA", descriptor = "()I")
	public abstract int LA();

	@OriginalMember(owner = "client!ba", name = "da", descriptor = "(I[IIIIZI[I)V")
	protected abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI[I[IIIIII)V")
	private void method7137(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(19) int local19;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local19 = -arg4;
				arg4 = arg6;
				arg6 = local19;
			} else if (arg0 == 3) {
				local19 = arg4;
				arg4 = arg6;
				arg6 = local19;
			} else if (arg0 == 2) {
				local19 = arg4;
				arg4 = -arg6 & 0x3FFF;
				arg6 = local19 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg4 = -arg4;
				arg6 = -arg6;
			} else if (arg0 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg6 = -arg6 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local19 = arg4;
				arg4 = -arg6;
				arg6 = local19;
			} else if (arg0 == 3) {
				local19 = arg4;
				arg4 = arg6;
				arg6 = local19;
			} else if (arg0 == 2) {
				local19 = arg4;
				arg4 = arg6 & 0x3FFF;
				arg6 = -local19 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.E(arg0, arg2, arg4, arg7, arg6, arg5, arg1);
		} else {
			this.da(arg0, arg2, arg4, arg7, arg6, arg1, arg8, arg3);
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "()[Lclient!gi;")
	public abstract Class121[] method7138();

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "(I)V")
	public abstract void V(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIILclient!d;I)V")
	protected final void method7139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class4 arg6, @OriginalArg(8) int arg7) {
		@Pc(21) int local21 = -arg3 / 2;
		@Pc(26) int local26 = -arg4 / 2;
		@Pc(35) int local35 = arg6.sa(local21 + arg0, local26 + arg5);
		@Pc(39) int local39 = arg3 / 2;
		@Pc(44) int local44 = -arg4 / 2;
		@Pc(53) int local53 = arg6.sa(local39 + arg0, local44 + arg5);
		@Pc(58) int local58 = -arg3 / 2;
		@Pc(62) int local62 = arg4 / 2;
		@Pc(72) int local72 = arg6.sa(local58 + arg0, arg5 - -local62);
		@Pc(76) int local76 = arg3 / 2;
		@Pc(80) int local80 = arg4 / 2;
		@Pc(90) int local90 = arg6.sa(arg0 + local76, local80 + arg5);
		@Pc(101) int local101 = local53 > local35 ? local35 : local53;
		@Pc(112) int local112 = local90 <= local72 ? local90 : local72;
		@Pc(119) int local119 = local90 <= local53 ? local90 : local53;
		@Pc(126) int local126 = local72 > local35 ? local35 : local72;
		@Pc(166) int local166;
		if (arg4 != 0) {
			@Pc(142) int local142 = (int) (Math.atan2((double) (local101 - local112), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local142 != 0) {
				if (arg1 != 0) {
					if (local142 > 8192) {
						local166 = 16384 - arg1;
						if (local142 < local166) {
							local142 = local166;
						}
					} else if (local142 > arg1) {
						local142 = arg1;
					}
				}
				this.AA(local142);
			}
		}
		@Pc(183) int local183 = local35 + local90;
		if (arg3 != 0) {
			@Pc(202) int local202 = (int) (Math.atan2((double) (local126 - local119), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local202 != 0) {
				if (arg2 != 0) {
					if (local202 > 8192) {
						local166 = 16384 - arg2;
						if (local202 < local166) {
							local202 = local166;
						}
					} else if (arg2 < local202) {
						local202 = arg2;
					}
				}
				this.v(local202);
			}
		}
		if (local183 > local72 + local53) {
			local183 = local72 + local53;
		}
		local183 = (local183 >> 1) - arg7;
		if (local183 != 0) {
			this.m(0, local183, 0);
		}
	}

	@OriginalMember(owner = "client!ba", name = "ZA", descriptor = "()I")
	public abstract int ZA();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ga;I)V")
	public final void method7141(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub12 arg1) {
		if (arg0 == -1 || !this.Q()) {
			return;
		}
		@Pc(16) Class80 local16 = arg1.aClass80Array1[arg0];
		@Pc(23) Class3_Sub44 local23 = local16.aClass3_Sub44_1;
		for (@Pc(25) int local25 = 0; local25 < local16.anInt2606; local25++) {
			@Pc(31) short local31 = local16.aShortArray43[local25];
			if (local23.aBooleanArray36[local31]) {
				if (local16.aShortArray47[local25] != -1) {
					this.ua(0, 0, 0, 0);
				}
				this.ua(local23.anIntArray580[local31], local16.aShortArray44[local25], local16.aShortArray38[local25], local16.aShortArray41[local25]);
			}
		}
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "va", descriptor = "(I)V")
	public abstract void va(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "DA", descriptor = "()I")
	public abstract int DA();

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "()I")
	public abstract int u();

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "()V")
	public abstract void method7142();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7143(@OriginalArg(0) Class255 arg0);

	@OriginalMember(owner = "client!ba", name = "ha", descriptor = "()I")
	public abstract int ha();

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	public abstract Class3_Sub4_Sub2 Z(@OriginalArg(0) Class3_Sub4_Sub2 arg0);

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "(I)V")
	public abstract void I(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([ILclient!sfa;Lclient!eea;IIZLclient!eea;[ZIIZI)V")
	private void method7144(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class3_Sub44 arg1, @OriginalArg(2) Class80 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class80 arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		@Pc(9) int local9;
		if (arg6 == null || arg9 == 0) {
			for (local9 = 0; local9 < arg2.anInt2606; local9++) {
				@Pc(15) short local15 = arg2.aShortArray43[local9];
				if (arg7 == null || arg7[local15] == arg10 || arg1.anIntArray580[local15] == 0) {
					@Pc(39) short local39 = arg2.aShortArray47[local9];
					if (local39 != -1) {
						this.method7137(0, arg5, arg1.anIntArrayArray71[local39], arg0, 0, arg4, 0, 0, arg1.anIntArray581[local39] & arg8);
					}
					this.method7137(arg1.anIntArray580[local15], arg5, arg1.anIntArrayArray71[local15], arg0, arg2.aShortArray44[local9], arg4, arg2.aShortArray41[local9], arg2.aShortArray38[local9], arg1.anIntArray581[local15] & arg8);
				}
			}
			return;
		}
		local9 = 0;
		@Pc(110) int local110 = 0;
		for (@Pc(112) int local112 = 0; local112 < arg1.anInt8919; local112++) {
			@Pc(115) boolean local115 = false;
			if (local9 < arg2.anInt2606 && local112 == arg2.aShortArray43[local9]) {
				local115 = true;
			}
			@Pc(133) boolean local133 = false;
			if (local110 < arg6.anInt2606 && local112 == arg6.aShortArray43[local110]) {
				local133 = true;
			}
			if (local115 || local133) {
				if (arg7 == null || arg7[local112] == arg10 || arg1.anIntArray580[local112] == 0) {
					@Pc(174) short local174 = 0;
					@Pc(179) int local179 = arg1.anIntArray580[local112];
					if (local179 == 3 || local179 == 10) {
						local174 = 128;
					}
					@Pc(199) short local199;
					@Pc(195) short local195;
					@Pc(203) short local203;
					@Pc(201) short local201;
					@Pc(197) byte local197;
					if (local115) {
						local195 = arg2.aShortArray38[local9];
						local197 = arg2.aByteArray36[local9];
						local199 = arg2.aShortArray44[local9];
						local203 = arg2.aShortArray41[local9];
						local201 = arg2.aShortArray47[local9];
						local9++;
					} else {
						local195 = local174;
						local197 = 0;
						local199 = local174;
						local201 = -1;
						local203 = local174;
					}
					@Pc(236) short local236;
					@Pc(240) short local240;
					@Pc(234) short local234;
					@Pc(238) short local238;
					@Pc(242) byte local242;
					if (local133) {
						local240 = arg6.aShortArray38[local110];
						local236 = arg6.aShortArray44[local110];
						local242 = arg6.aByteArray36[local110];
						local234 = arg6.aShortArray41[local110];
						local238 = arg6.aShortArray47[local110];
						local110++;
					} else {
						local234 = local174;
						local236 = local174;
						local238 = -1;
						local240 = local174;
						local242 = 0;
					}
					if (local201 != -1) {
						this.method7137(0, arg5, arg1.anIntArrayArray71[local201], arg0, 0, arg4, 0, 0, arg8 & arg1.anIntArray581[local201]);
					} else if (local238 != -1) {
						this.method7137(0, arg5, arg1.anIntArrayArray71[local238], arg0, 0, arg4, 0, 0, arg8 & arg1.anIntArray581[local238]);
					}
					@Pc(332) int local332;
					@Pc(336) int local336;
					@Pc(334) int local334;
					if ((local197 & 0x2) == 0 && (local242 & 0x1) == 0) {
						@Pc(351) int local351;
						if (local179 == 2) {
							local351 = local236 - local199 & 0x3FFF;
							@Pc(464) int local464 = local240 - local195 & 0x3FFF;
							@Pc(471) int local471 = local234 - local203 & 0x3FFF;
							if (local351 >= 8192) {
								local351 -= 16384;
							}
							if (local464 >= 8192) {
								local464 -= 16384;
							}
							local336 = arg9 * local464 / arg3 + local195 & 0x3FFF;
							if (local471 >= 8192) {
								local471 -= 16384;
							}
							local332 = local351 * arg9 / arg3 + local199 & 0x3FFF;
							local334 = arg9 * local471 / arg3 + local203 & 0x3FFF;
						} else if (local179 == 9) {
							local351 = local236 - local199 & 0x3FFF;
							if (local351 >= 8192) {
								local351 -= 16384;
							}
							local334 = 0;
							local336 = 0;
							local332 = local199 + arg9 * local351 / arg3 & 0x3FFF;
						} else if (local179 == 7) {
							local351 = local236 - local199 & 0x3F;
							if (local351 >= 32) {
								local351 -= 64;
							}
							local334 = (local234 - local203) * arg9 / arg3 + local203;
							local332 = local199 + local351 * arg9 / arg3 & 0x3F;
							local336 = (local240 - local195) * arg9 / arg3 + local195;
						} else {
							local332 = local199 + arg9 * (local236 - local199) / arg3;
							local336 = arg9 * (local240 - local195) / arg3 + local195;
							local334 = local203 + (local234 - local203) * arg9 / arg3;
						}
					} else {
						local332 = local199;
						local334 = local203;
						local336 = local195;
					}
					this.method7137(local179, arg5, arg1.anIntArrayArray71[local112], arg0, local332, arg4, local334, local336, arg1.anIntArray581[local112] & arg8);
				} else {
					if (local133) {
						local110++;
					}
					if (local115) {
						local9++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "()I")
	public abstract int F();

	@OriginalMember(owner = "client!ba", name = "ia", descriptor = "(I)V")
	public abstract void ia(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "(I)V")
	public abstract void D(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!q;Lclient!ht;I)V")
	public abstract void method7145(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class55_Sub3 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "(I[IIIIIZ)V")
	protected abstract void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ba", name = "UA", descriptor = "(SS)V")
	public abstract void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	public abstract void method7147(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!ba", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	public abstract void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) Class4 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZLclient!ga;BIILclient!ga;[IIIII)V")
	public final void method7149(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub4_Sub12 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub4_Sub12 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg6 == -1 || !this.Q()) {
			return;
		}
		@Pc(17) Class80 local17 = arg1.aClass80Array1[arg6];
		@Pc(20) Class3_Sub44 local20 = local17.aClass3_Sub44_1;
		@Pc(22) Class80 local22 = null;
		if (arg4 != null) {
			local22 = arg4.aClass80Array1[arg8];
			if (local20 != local22.aClass3_Sub44_1) {
				local22 = null;
			}
		}
		this.method7144(arg5, local20, local17, arg2, 0, arg0, local22, null, arg3, arg7, false);
		this.Y();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIII)V")
	public abstract void method7150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
