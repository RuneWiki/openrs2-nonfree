import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class180 {

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Z")
	protected boolean aBoolean749 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class180() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!be;Lclient!be;IIIIIZLclient!be;IB[ZLclient!be;II)V")
	public final void method7927(@OriginalArg(0) Class5_Sub4_Sub2 arg0, @OriginalArg(1) Class5_Sub4_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class5_Sub4_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) boolean[] arg10, @OriginalArg(12) Class5_Sub4_Sub2 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg2 == -1) {
			return;
		}
		if (arg10 == null || arg9 == -1) {
			this.method7930(arg11, arg7, arg4, arg13, arg2, 0, arg5, arg8);
			return;
		}
		this.method7936();
		if (!this.NA()) {
			this.method7934();
			return;
		}
		@Pc(38) Class365 local38 = arg11.aClass365Array1[arg2];
		@Pc(41) Class5_Sub21 local41 = local38.aClass5_Sub21_1;
		@Pc(43) Class365 local43 = null;
		if (arg8 != null) {
			local43 = arg8.aClass365Array1[arg4];
			if (local43.aClass5_Sub21_1 != local41) {
				local43 = null;
			}
		}
		this.method7953(local41, arg7, 0, local38, 65535, arg13, arg10, local43, false, (int[]) null, arg5);
		@Pc(81) Class365 local81 = arg1.aClass365Array1[arg9];
		@Pc(83) Class365 local83 = null;
		if (arg0 != null) {
			local83 = arg0.aClass365Array1[arg6];
			if (local41 != local83.aClass5_Sub21_1) {
				local83 = null;
			}
		}
		this.method7947(0, new int[0], 0, 0, 0, 0, arg7);
		this.method7953(local81.aClass5_Sub21_1, arg7, 0, local81, 65535, arg3, arg10, local83, true, (int[]) null, arg12);
		this.wa();
		this.method7934();
	}

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!be;BI)V")
	public final void method7928(@OriginalArg(0) Class5_Sub4_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7936();
		if (!this.NA()) {
			this.method7934();
			return;
		}
		@Pc(22) Class365 local22 = arg0.aClass365Array1[arg1];
		@Pc(25) Class5_Sub21 local25 = local22.aClass5_Sub21_1;
		for (@Pc(35) int local35 = 0; local35 < local22.anInt10022; local35++) {
			@Pc(42) short local42 = local22.aShortArray178[local35];
			if (local25.aBooleanArray25[local42]) {
				if (local22.aShortArray180[local35] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local25.anIntArray341[local42], local22.aShortArray186[local35], local22.aShortArray185[local35], local22.aShortArray184[local35]);
			}
		}
		this.wa();
		this.method7934();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!ofa;ZII)Z")
	public abstract boolean method7929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!be;ZIIIIILclient!be;)V")
	public final void method7930(@OriginalArg(1) Class5_Sub4_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5_Sub4_Sub2 arg7) {
		if (arg4 == -1) {
			return;
		}
		this.method7936();
		if (!this.NA()) {
			this.method7934();
			return;
		}
		@Pc(20) Class365 local20 = arg0.aClass365Array1[arg4];
		@Pc(23) Class5_Sub21 local23 = local20.aClass5_Sub21_1;
		@Pc(25) Class365 local25 = null;
		if (arg7 != null) {
			local25 = arg7.aClass365Array1[arg2];
			if (local25.aClass5_Sub21_1 != local23) {
				local25 = null;
			}
		}
		this.method7953(local23, arg1, arg5, local20, 65535, arg3, (boolean[]) null, local25, false, (int[]) null, arg6);
		this.wa();
		this.method7934();
	}

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
	public abstract boolean method7931();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIZIII[ILclient!be;Lclient!be;)V")
	public final void method7933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) Class5_Sub4_Sub2 arg7, @OriginalArg(10) Class5_Sub4_Sub2 arg8) {
		if (arg4 == -1) {
			return;
		}
		this.method7936();
		if (!this.NA()) {
			this.method7934();
			return;
		}
		@Pc(22) Class365 local22 = arg8.aClass365Array1[arg4];
		@Pc(25) Class5_Sub21 local25 = local22.aClass5_Sub21_1;
		@Pc(27) Class365 local27 = null;
		if (arg7 != null) {
			local27 = arg7.aClass365Array1[arg2];
			if (local27.aClass5_Sub21_1 != local25) {
				local27 = null;
			}
		}
		this.method7953(local25, arg3, 0, local22, arg5, arg1, (boolean[]) null, local27, false, arg6, arg0);
		this.wa();
		this.method7934();
	}

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	protected abstract void method7934();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!hi;")
	public abstract Class143[] method7935();

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method7936();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method7937(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!s;IIIIIIII)V")
	protected final void method7938(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg4 / 2;
		@Pc(21) int local21 = -arg7 / 2;
		@Pc(31) int local31 = arg0.method8447(arg3 + local16, local21 + arg2);
		@Pc(35) int local35 = arg4 / 2;
		@Pc(40) int local40 = -arg7 / 2;
		@Pc(51) int local51 = arg0.method8447(local35 + arg3, arg2 - -local40);
		@Pc(56) int local56 = -arg4 / 2;
		@Pc(60) int local60 = arg7 / 2;
		@Pc(70) int local70 = arg0.method8447(local56 + arg3, local60 + arg2);
		@Pc(74) int local74 = arg4 / 2;
		@Pc(78) int local78 = arg7 / 2;
		@Pc(88) int local88 = arg0.method8447(local74 + arg3, arg2 + local78);
		@Pc(95) int local95 = local51 <= local31 ? local51 : local31;
		@Pc(106) int local106 = local70 < local88 ? local70 : local88;
		@Pc(113) int local113 = local51 >= local88 ? local88 : local51;
		@Pc(154) int local154;
		if (arg7 != 0) {
			@Pc(132) int local132 = (int) (Math.atan2((double) (local95 - local106), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local132 != 0) {
				if (arg1 != 0) {
					if (local132 > 8192) {
						local154 = 16384 - arg1;
						if (local132 < local154) {
							local132 = local154;
						}
					} else if (arg1 < local132) {
						local132 = arg1;
					}
				}
				this.FA(local132);
			}
		}
		@Pc(173) int local173 = local31 >= local70 ? local70 : local31;
		if (arg4 != 0) {
			@Pc(189) int local189 = (int) (Math.atan2((double) (local173 - local113), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local189 != 0) {
				if (arg5 != 0) {
					if (local189 > 8192) {
						local154 = 16384 - arg5;
						if (local189 < local154) {
							local189 = local154;
						}
					} else if (arg5 < local189) {
						local189 = arg5;
					}
				}
				this.VA(local189);
			}
		}
		@Pc(226) int local226 = local88 + local31;
		if (local226 > local51 + local70) {
			local226 = local70 + local51;
		}
		local226 = (local226 >> 1) - arg6;
		if (local226 != 0) {
			this.H(0, local226, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZIB[I[III)V")
	private void method7939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(58) int local58;
		if (arg8 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local58 = -arg1;
				arg1 = arg2;
				arg2 = local58;
			} else if (arg0 == 3) {
				local58 = arg1;
				arg1 = arg2;
				arg2 = local58;
			} else if (arg0 == 2) {
				local58 = arg1;
				arg1 = -arg2 & 0x3FFF;
				arg2 = local58 & 0x3FFF;
			}
		} else if (arg8 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg1 = -arg1;
				arg2 = -arg2;
			} else if (arg0 == 2) {
				arg1 = -arg1 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg8 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local58 = arg1;
				arg1 = -arg2;
				arg2 = local58;
			} else if (arg0 == 3) {
				local58 = arg1;
				arg1 = arg2;
				arg2 = local58;
			} else if (arg0 == 2) {
				local58 = arg1;
				arg1 = arg2 & 0x3FFF;
				arg2 = -local58 & 0x3FFF;
			}
		}
		if (arg4 == 65535) {
			this.method7947(arg0, arg6, arg1, arg7, arg2, arg8, arg3);
		} else {
			this.I(arg0, arg6, arg1, arg7, arg2, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()[Lclient!cm;")
	public abstract Class57[] method7940();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method7942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	public abstract void method7944();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class180 method7945(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!ofa;ZI)Z")
	public abstract boolean method7946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ofa;Lclient!vh;I)V")
	public abstract void method7949(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class14_Sub9 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class5_Sub4_Sub10 ba(@OriginalArg(0) Class5_Sub4_Sub10 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ofa;Lclient!vh;II)V")
	public abstract void method7950(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class14_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ofa;)V")
	public abstract void method7951(@OriginalArg(0) Class117 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ofa;IZ)V")
	public abstract void method7952(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!iia;ZILclient!vr;II[ZLclient!vr;Z[IBI)V")
	private void method7953(@OriginalArg(0) Class5_Sub21 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class365 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) Class365 arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (arg7 == null || arg10 == 0) {
			for (local11 = 0; local11 < arg3.anInt10022; local11++) {
				@Pc(18) short local18 = arg3.aShortArray178[local11];
				if (arg6 == null || arg6[local18] == arg8 || arg0.anIntArray341[local18] == 0) {
					@Pc(46) short local46 = arg3.aShortArray180[local11];
					if (local46 != -1) {
						this.method7939(0, 0, 0, arg1, arg0.anIntArray340[local46] & arg4, arg9, arg0.anIntArrayArray19[local46], 0, arg2);
					}
					this.method7939(arg0.anIntArray341[local18], arg3.aShortArray186[local11], arg3.aShortArray184[local11], arg1, arg0.anIntArray340[local18] & arg4, arg9, arg0.anIntArrayArray19[local18], arg3.aShortArray185[local11], arg2);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(115) int local115 = 0;
		for (@Pc(123) int local123 = 0; local123 < arg0.anInt4008; local123++) {
			@Pc(127) boolean local127 = false;
			if (local11 < arg3.anInt10022 && arg3.aShortArray178[local11] == local123) {
				local127 = true;
			}
			@Pc(141) boolean local141 = false;
			if (arg7.anInt10022 > local115 && arg7.aShortArray178[local115] == local123) {
				local141 = true;
			}
			if (local127 || local141) {
				if (arg6 == null || arg8 == arg6[local123] || arg0.anIntArray341[local123] == 0) {
					@Pc(186) short local186 = 0;
					@Pc(191) int local191 = arg0.anIntArray341[local123];
					if (local191 == 3 || local191 == 10) {
						local186 = 128;
					}
					@Pc(221) short local221;
					@Pc(211) short local211;
					@Pc(226) short local226;
					@Pc(206) short local206;
					@Pc(216) byte local216;
					if (local127) {
						local206 = arg3.aShortArray180[local11];
						local211 = arg3.aShortArray185[local11];
						local216 = arg3.aByteArray102[local11];
						local221 = arg3.aShortArray186[local11];
						local226 = arg3.aShortArray184[local11];
						local11++;
					} else {
						local226 = local186;
						local221 = local186;
						local206 = -1;
						local211 = local186;
						local216 = 0;
					}
					@Pc(247) short local247;
					@Pc(243) short local243;
					@Pc(245) short local245;
					@Pc(249) short local249;
					@Pc(251) byte local251;
					if (local141) {
						local251 = arg7.aByteArray102[local115];
						local249 = arg7.aShortArray180[local115];
						local243 = arg7.aShortArray185[local115];
						local247 = arg7.aShortArray186[local115];
						local245 = arg7.aShortArray184[local115];
						local115++;
					} else {
						local243 = local186;
						local245 = local186;
						local247 = local186;
						local249 = -1;
						local251 = 0;
					}
					@Pc(351) int local351;
					@Pc(335) int local335;
					@Pc(361) int local361;
					if ((local216 & 0x2) == 0 && (local251 & 0x1) == 0) {
						@Pc(299) int local299;
						if (local191 == 2) {
							local299 = local247 - local221 & 0x3FFF;
							@Pc(305) int local305 = local243 - local211 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							@Pc(318) int local318 = local245 - local226 & 0x3FFF;
							if (local305 >= 8192) {
								local305 -= 16384;
							}
							local335 = local211 + local305 * arg10 / arg5 & 0x3FFF;
							if (local318 >= 8192) {
								local318 -= 16384;
							}
							local351 = local299 * arg10 / arg5 + local221 & 0x3FFF;
							local361 = local318 * arg10 / arg5 + local226 & 0x3FFF;
						} else if (local191 == 9) {
							local299 = local247 - local221 & 0x3FFF;
							if (local299 >= 8192) {
								local299 -= 16384;
							}
							local361 = 0;
							local335 = 0;
							local351 = local221 + local299 * arg10 / arg5 & 0x3FFF;
						} else if (local191 == 7) {
							local299 = local247 - local221 & 0x3F;
							if (local299 >= 32) {
								local299 -= 64;
							}
							local335 = local211 + arg10 * (local243 - local211) / arg5;
							local351 = local221 + local299 * arg10 / arg5 & 0x3F;
							local361 = local226 + (local245 - local226) * arg10 / arg5;
						} else {
							local351 = local221 + arg10 * (local247 - local221) / arg5;
							local361 = local226 + arg10 * (local245 - local226) / arg5;
							local335 = local211 + (local243 - local211) * arg10 / arg5;
						}
					} else {
						local361 = local226;
						local351 = local221;
						local335 = local211;
					}
					if (local206 != -1) {
						this.method7939(0, 0, 0, arg1, arg0.anIntArray340[local206] & arg4, arg9, arg0.anIntArrayArray19[local206], 0, arg2);
					} else if (local249 != -1) {
						this.method7939(0, 0, 0, arg1, arg0.anIntArray340[local249] & arg4, arg9, arg0.anIntArrayArray19[local249], 0, arg2);
					}
					this.method7939(local191, local351, local361, arg1, arg0.anIntArray340[local123] & arg4, arg9, arg0.anIntArrayArray19[local123], local335, arg2);
				} else {
					if (local141) {
						local115++;
					}
					if (local127) {
						local11++;
					}
				}
			}
		}
	}
}
