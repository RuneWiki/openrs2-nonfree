import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public abstract class Class126 {

	static {
		new Class117("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	protected Class126() {
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ph;I)V")
	public final void method3115(@OriginalArg(1) Class11_Sub4_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1 || !this.method3153()) {
			return;
		}
		@Pc(20) Class28 local20 = arg0.aClass28Array1[arg1];
		@Pc(23) Class11_Sub43 local23 = local20.aClass11_Sub43_1;
		for (@Pc(25) int local25 = 0; local25 < local20.anInt466; local25++) {
			@Pc(32) short local32 = local20.aShortArray14[local25];
			if (local23.aBooleanArray27[local32]) {
				if (local20.aShortArray19[local25] != -1) {
					this.method3157(0, 0, 0, 0);
				}
				this.method3157(local23.anIntArray543[local32], local20.aShortArray15[local25], local20.aShortArray20[local25], local20.aShortArray16[local25]);
			}
		}
		this.method3152();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!mc;)Lclient!mc;")
	public abstract Class11_Sub4_Sub4 method3116(@OriginalArg(0) Class11_Sub4_Sub4 arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "()I")
	public abstract int method3117();

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "()I")
	public abstract int method3118();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!ij;Lclient!ij;III)V")
	public abstract void method3119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) Class77 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "()I")
	public abstract int method3120();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!mj;IIIZ)V")
	public abstract void method3121(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "()I")
	public abstract int method3122();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "([ZIILclient!ph;IILclient!ph;ZLclient!ph;ILclient!ph;IIIZ)V")
	public final void method3123(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub4_Sub14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class11_Sub4_Sub14 arg6, @OriginalArg(8) Class11_Sub4_Sub14 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class11_Sub4_Sub14 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg0 == null || arg2 == -1) {
			this.method3144(arg8, arg6, arg13, arg1, arg9, 0, arg11, arg4);
		} else if (this.method3153()) {
			@Pc(35) Class28 local35 = arg6.aClass28Array1[arg1];
			@Pc(38) Class11_Sub43 local38 = local35.aClass11_Sub43_1;
			@Pc(40) Class28 local40 = null;
			if (arg9 != null) {
				local40 = arg9.aClass28Array1[arg8];
				if (local40.aClass11_Sub43_1 != local38) {
					local40 = null;
				}
			}
			@Pc(58) Class28 local58 = arg3.aClass28Array1[arg2];
			@Pc(60) Class28 local60 = null;
			if (arg7 != null) {
				local60 = arg7.aClass28Array1[arg5];
				if (local60.aClass11_Sub43_1 != local38) {
					local60 = null;
				}
			}
			this.method3149(false, arg0, 65535, arg13, 0, arg11, local35, null, local38, arg4, local40);
			this.method3127(0, new int[0], 0, 0, 0, 0, arg13);
			this.method3149(true, arg0, 65535, arg13, 0, arg12, local58, null, local38, arg10, local60);
			this.method3152();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public abstract void method3124(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public abstract void method3125(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	public abstract void method3126(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method3127(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
	public abstract void method3128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[II[IIIZII)V")
	private void method3129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(54) int local54;
		if (arg7 == 1) {
			if (arg5 == 0 || arg5 == 1) {
				local54 = -arg0;
				arg0 = arg3;
				arg3 = local54;
			} else if (arg5 == 3) {
				local54 = arg0;
				arg0 = arg3;
				arg3 = local54;
			} else if (arg5 == 2) {
				local54 = arg0;
				arg0 = -arg3 & 0x3FFF;
				arg3 = local54 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg5 == 0 || arg5 == 1) {
				arg0 = -arg0;
				arg3 = -arg3;
			} else if (arg5 == 2) {
				arg3 = -arg3 & 0x3FFF;
				arg0 = -arg0 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg5 == 0 || arg5 == 1) {
				local54 = arg0;
				arg0 = -arg3;
				arg3 = local54;
			} else if (arg5 == 3) {
				local54 = arg0;
				arg0 = arg3;
				arg3 = local54;
			} else if (arg5 == 2) {
				local54 = arg0;
				arg0 = arg3 & 0x3FFF;
				arg3 = -local54 & 0x3FFF;
			}
		}
		if (arg8 == 65535) {
			this.method3127(arg5, arg2, arg0, arg1, arg3, arg7, arg6);
		} else {
			this.method3131(arg5, arg2, arg0, arg1, arg3, arg6, arg8, arg4);
		}
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
	public abstract void method3130(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[IIIIZI[I)V")
	protected abstract void method3131(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ph;Lclient!ph;IIII[IZII)V")
	public final void method3132(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub4_Sub14 arg1, @OriginalArg(2) Class11_Sub4_Sub14 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8) {
		if (arg0 == -1 || !this.method3153()) {
			return;
		}
		@Pc(18) Class28 local18 = arg2.aClass28Array1[arg0];
		@Pc(21) Class11_Sub43 local21 = local18.aClass11_Sub43_1;
		@Pc(23) Class28 local23 = null;
		if (arg1 != null) {
			local23 = arg1.aClass28Array1[arg5];
			if (local23.aClass11_Sub43_1 != local21) {
				local23 = null;
			}
		}
		this.method3149(false, null, arg8, arg7, 0, arg4, local18, arg6, local21, arg3, local23);
		this.method3152();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ic;Lclient!vf;II)V")
	public abstract void method3133(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class10_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(III)V")
	public abstract void method3134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "()V")
	public abstract void method3135();

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "()I")
	public abstract int method3137();

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "()I")
	public abstract int method3138();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ic;Lclient!vf;I)V")
	public abstract void method3139(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class10_Sub8 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "()I")
	public abstract int method3140();

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "()[Lclient!wg;")
	public abstract Class212[] method3141();

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "()I")
	public abstract int method3142();

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
	public abstract void method3143(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ph;ZIBLclient!ph;III)V")
	public final void method3144(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub4_Sub14 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class11_Sub4_Sub14 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 == -1 || !this.method3153()) {
			return;
		}
		@Pc(16) Class28 local16 = arg1.aClass28Array1[arg3];
		@Pc(19) Class11_Sub43 local19 = local16.aClass11_Sub43_1;
		@Pc(21) Class28 local21 = null;
		if (arg4 != null) {
			local21 = arg4.aClass28Array1[arg0];
			if (local21.aClass11_Sub43_1 != local19) {
				local21 = null;
			}
		}
		this.method3149(false, null, 65535, arg2, arg5, arg6, local16, null, local19, arg7, local21);
		this.method3152();
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
	public abstract void method3145(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(SS)V")
	public abstract void method3146(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "()V")
	public abstract void method3147();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ij;IIIIII)V")
	protected final void method3148(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = -arg3 / 2;
		@Pc(19) int local19 = -arg2 / 2;
		@Pc(28) int local28 = arg0.method4133(local14 + arg5, arg1 + local19);
		@Pc(32) int local32 = arg3 / 2;
		@Pc(37) int local37 = -arg2 / 2;
		@Pc(46) int local46 = arg0.method4133(local32 + arg5, local37 + arg1);
		@Pc(51) int local51 = -arg3 / 2;
		@Pc(55) int local55 = arg2 / 2;
		@Pc(64) int local64 = arg0.method4133(arg5 + local51, arg1 + local55);
		@Pc(68) int local68 = arg3 / 2;
		@Pc(72) int local72 = arg2 / 2;
		@Pc(81) int local81 = arg0.method4133(local68 + arg5, local72 + arg1);
		@Pc(92) int local92 = local46 > local28 ? local28 : local46;
		@Pc(103) int local103 = local81 > local64 ? local64 : local81;
		@Pc(110) int local110 = local81 > local46 ? local46 : local81;
		if (arg2 != 0) {
			@Pc(129) int local129 = (int) (Math.atan2((double) (local92 - local103), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
			if (local129 != 0) {
				this.method3145(local129);
			}
		}
		@Pc(144) int local144 = local28 >= local64 ? local64 : local28;
		@Pc(148) int local148 = local81 + local28;
		if (arg3 != 0) {
			@Pc(163) int local163 = (int) (Math.atan2((double) (local144 - local110), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
			if (local163 != 0) {
				this.method3156(local163);
			}
		}
		if (local148 > local46 + local64) {
			local148 = local46 + local64;
		}
		local148 = (local148 >> 1) - arg4;
		if (local148 != 0) {
			this.method3128(0, local148, 0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ[ZIZIILclient!bm;[ILclient!wb;ILclient!bm;)V")
	private void method3149(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class28 arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) Class11_Sub43 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class28 arg10) {
		@Pc(22) int local22;
		if (arg10 == null || arg9 == 0) {
			for (local22 = 0; local22 < arg6.anInt466; local22++) {
				@Pc(29) short local29 = arg6.aShortArray14[local22];
				if (arg1 == null || arg0 == arg1[local29] || arg8.anIntArray543[local29] == 0) {
					@Pc(53) short local53 = arg6.aShortArray19[local22];
					if (local53 != -1) {
						this.method3129(0, 0, arg8.anIntArrayArray78[local53], 0, arg7, 0, arg3, arg4, arg2 & arg8.anIntArray542[local53]);
					}
					this.method3129(arg6.aShortArray15[local22], arg6.aShortArray20[local22], arg8.anIntArrayArray78[local29], arg6.aShortArray16[local22], arg7, arg8.anIntArray543[local29], arg3, arg4, arg8.anIntArray542[local29] & arg2);
				}
			}
			return;
		}
		local22 = 0;
		@Pc(122) int local122 = 0;
		for (@Pc(124) int local124 = 0; local124 < arg8.anInt6574; local124++) {
			@Pc(128) boolean local128 = false;
			if (arg6.anInt466 > local22 && arg6.aShortArray14[local22] == local124) {
				local128 = true;
			}
			@Pc(150) boolean local150 = false;
			if (local122 < arg10.anInt466 && arg10.aShortArray14[local122] == local124) {
				local150 = true;
			}
			if (local128 || local150) {
				if (arg1 == null || arg1[local124] == arg0 || arg8.anIntArray543[local124] == 0) {
					@Pc(192) short local192 = 0;
					@Pc(197) int local197 = arg8.anIntArray543[local124];
					if (local197 == 3) {
						local192 = 128;
					}
					@Pc(210) short local210;
					@Pc(216) short local216;
					@Pc(208) short local208;
					@Pc(212) short local212;
					@Pc(214) byte local214;
					if (local128) {
						local210 = arg6.aShortArray15[local22];
						local216 = arg6.aShortArray20[local22];
						local208 = arg6.aShortArray16[local22];
						local212 = arg6.aShortArray19[local22];
						local214 = arg6.aByteArray6[local22];
						local22++;
					} else {
						local208 = local192;
						local210 = local192;
						local212 = -1;
						local214 = 0;
						local216 = local192;
					}
					@Pc(256) short local256;
					@Pc(251) short local251;
					@Pc(261) short local261;
					@Pc(271) short local271;
					@Pc(266) byte local266;
					if (local150) {
						local251 = arg10.aShortArray20[local122];
						local256 = arg10.aShortArray15[local122];
						local261 = arg10.aShortArray16[local122];
						local266 = arg10.aByteArray6[local122];
						local271 = arg10.aShortArray19[local122];
						local122++;
					} else {
						local271 = -1;
						local261 = local192;
						local251 = local192;
						local256 = local192;
						local266 = 0;
					}
					if (local212 != -1) {
						this.method3129(0, 0, arg8.anIntArrayArray78[local212], 0, arg7, 0, arg3, arg4, arg2 & arg8.anIntArray542[local212]);
					} else if (local271 != -1) {
						this.method3129(0, 0, arg8.anIntArrayArray78[local271], 0, arg7, 0, arg3, arg4, arg8.anIntArray542[local271] & arg2);
					}
					@Pc(354) int local354;
					@Pc(352) int local352;
					@Pc(350) int local350;
					if ((local214 & 0x2) == 0 && (local266 & 0x1) == 0) {
						@Pc(366) int local366;
						if (local197 == 2) {
							local366 = local256 - local210 & 0x3FFF;
							@Pc(373) int local373 = local251 - local216 & 0x3FFF;
							if (local366 >= 8192) {
								local366 -= 16384;
							}
							if (local373 >= 8192) {
								local373 -= 16384;
							}
							@Pc(392) int local392 = local261 - local208 & 0x3FFF;
							local354 = local210 + local366 * arg9 / arg5 & 0x3FFF;
							local352 = arg9 * local373 / arg5 + local216 & 0x3FFF;
							if (local392 >= 8192) {
								local392 -= 16384;
							}
							local350 = local392 * arg9 / arg5 + local208 & 0x3FFF;
						} else if (local197 == 7) {
							local366 = local256 - local210 & 0x3F;
							if (local366 >= 32) {
								local366 -= 64;
							}
							local352 = local216 + arg9 * (local251 - local216) / arg5;
							local354 = local210 + arg9 * local366 / arg5 & 0x3F;
							local350 = (local261 - local208) * arg9 / arg5 + local208;
						} else {
							local354 = arg9 * (local256 - local210) / arg5 + local210;
							local352 = arg9 * (local251 - local216) / arg5 + local216;
							local350 = local208 + (local261 - local208) * arg9 / arg5;
						}
					} else {
						local350 = local208;
						local352 = local216;
						local354 = local210;
					}
					this.method3129(local354, local352, arg8.anIntArrayArray78[local124], local350, arg7, local197, arg3, arg4, arg2 & arg8.anIntArray542[local124]);
				} else {
					if (local128) {
						local22++;
					}
					if (local150) {
						local122++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "()I")
	public abstract int method3150();

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "()[Lclient!rf;")
	public abstract Class174[] method3151();

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "()V")
	protected abstract void method3152();

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "()Z")
	protected abstract boolean method3153();

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "()I")
	public abstract int method3155();

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
	public abstract void method3156(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V")
	protected abstract void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BIZ)Lclient!mj;")
	public abstract Class126 method3158(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!ic;Z)Z")
	public abstract boolean method3160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "()Z")
	public abstract boolean method3161();

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(SS)V")
	public abstract void method3162(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);
}
