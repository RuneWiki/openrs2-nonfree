import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class17 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
	protected boolean aBoolean443 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class17() {
	}

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class17 method5409(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sk;IZ)V")
	public abstract void method5410(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sk;Lclient!nl;I)V")
	public abstract void method5411(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIILclient!s;IIIII)V")
	protected final void method5412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class51 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg7 / 2;
		@Pc(21) int local21 = -arg5 / 2;
		@Pc(31) int local31 = arg2.method7839(local16 + arg3, local21 + arg0);
		@Pc(35) int local35 = arg7 / 2;
		@Pc(40) int local40 = -arg5 / 2;
		@Pc(51) int local51 = arg2.method7839(arg3 + local35, local40 + arg0);
		@Pc(56) int local56 = -arg7 / 2;
		@Pc(60) int local60 = arg5 / 2;
		@Pc(70) int local70 = arg2.method7839(local56 + arg3, local60 + arg0);
		@Pc(74) int local74 = arg7 / 2;
		@Pc(78) int local78 = arg5 / 2;
		@Pc(89) int local89 = arg2.method7839(arg3 + local74, arg0 + local78);
		@Pc(100) int local100 = local51 <= local31 ? local51 : local31;
		@Pc(111) int local111 = local89 > local70 ? local70 : local89;
		@Pc(122) int local122 = local51 >= local89 ? local89 : local51;
		@Pc(157) int local157;
		if (arg5 != 0) {
			@Pc(138) int local138 = (int) (Math.atan2((double) (local100 - local111), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local138 != 0) {
				if (arg6 != 0) {
					if (local138 > 8192) {
						local157 = 16384 - arg6;
						if (local157 > local138) {
							local138 = local157;
						}
					} else if (arg6 < local138) {
						local138 = arg6;
					}
				}
				this.FA(local138);
			}
		}
		@Pc(172) int local172 = local31 < local70 ? local31 : local70;
		@Pc(182) int local182 = local89 + local31;
		if (arg7 != 0) {
			@Pc(198) int local198 = (int) (Math.atan2((double) (local172 - local122), (double) arg7) * 2607.5945876176133D) & 0x3FFF;
			if (local198 != 0) {
				if (arg4 != 0) {
					if (local198 > 8192) {
						local157 = 16384 - arg4;
						if (local198 < local157) {
							local198 = local157;
						}
					} else if (arg4 < local198) {
						local198 = arg4;
					}
				}
				this.VA(local198);
			}
		}
		if (local182 > local51 + local70) {
			local182 = local51 + local70;
		}
		local182 = (local182 >> 1) - arg1;
		if (local182 != 0) {
			this.H(0, local182, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sk;Lclient!nl;II)V")
	public abstract void method5413(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII[II[IZII)V")
	private void method5414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) int arg8) {
		@Pc(41) int local41;
		if (arg0 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local41 = -arg5;
				arg5 = arg8;
				arg8 = local41;
			} else if (arg1 == 3) {
				local41 = arg5;
				arg5 = arg8;
				arg8 = local41;
			} else if (arg1 == 2) {
				local41 = arg5;
				arg5 = -arg8 & 0x3FFF;
				arg8 = local41 & 0x3FFF;
			}
		} else if (arg0 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg5 = -arg5;
				arg8 = -arg8;
			} else if (arg1 == 2) {
				arg5 = -arg5 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg0 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local41 = arg5;
				arg5 = -arg8;
				arg8 = local41;
			} else if (arg1 == 3) {
				local41 = arg5;
				arg5 = arg8;
				arg8 = local41;
			} else if (arg1 == 2) {
				local41 = arg5;
				arg5 = arg8 & 0x3FFF;
				arg8 = -local41 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.method5424(arg1, arg4, arg5, arg2, arg8, arg0, arg7);
		} else {
			this.I(arg1, arg4, arg5, arg2, arg8, arg7, arg3, arg6);
		}
	}

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class3_Sub4_Sub5 ba(@OriginalArg(0) Class3_Sub4_Sub5 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()[Lclient!vea;")
	public abstract Class353[] method5415();

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()[Lclient!qv;")
	public abstract Class284[] method5417();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!gba;I)V")
	public final void method5418(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub8 arg1) {
		if (arg0 == -1) {
			return;
		}
		this.method5423();
		if (!this.NA()) {
			this.method5427();
			return;
		}
		@Pc(23) Class60 local23 = arg1.aClass60Array1[arg0];
		@Pc(26) Class3_Sub17 local26 = local23.aClass3_Sub17_1;
		for (@Pc(28) int local28 = 0; local28 < local23.anInt2091; local28++) {
			@Pc(35) short local35 = local23.aShortArray16[local28];
			if (local26.aBooleanArray7[local35]) {
				if (local23.aShortArray21[local28] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local26.anIntArray106[local35], local23.aShortArray22[local28], local23.aShortArray18[local28], local23.aShortArray15[local28]);
			}
		}
		this.wa();
		this.method5427();
	}

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!gba;IIII[ILclient!gba;IZ)V")
	public final void method5419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) Class3_Sub4_Sub8 arg7, @OriginalArg(10) boolean arg8) {
		if (arg4 == -1) {
			return;
		}
		this.method5423();
		if (!this.NA()) {
			this.method5427();
			return;
		}
		@Pc(21) Class60 local21 = arg7.aClass60Array1[arg4];
		@Pc(24) Class3_Sub17 local24 = local21.aClass3_Sub17_1;
		@Pc(26) Class60 local26 = null;
		if (arg2 != null) {
			local26 = arg2.aClass60Array1[arg1];
			if (local26.aClass3_Sub17_1 != local24) {
				local26 = null;
			}
		}
		this.method5430(local26, arg6, arg0, null, local24, local21, arg5, 0, false, arg3, arg8);
		this.wa();
		this.method5427();
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!sk;ZII)Z")
	public abstract boolean method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLclient!gba;IILclient!gba;III)V")
	public final void method5421(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub4_Sub8 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub4_Sub8 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 == -1) {
			return;
		}
		this.method5423();
		if (!this.NA()) {
			this.method5427();
			return;
		}
		@Pc(22) Class60 local22 = arg1.aClass60Array1[arg3];
		@Pc(25) Class3_Sub17 local25 = local22.aClass3_Sub17_1;
		@Pc(27) Class60 local27 = null;
		if (arg4 != null) {
			local27 = arg4.aClass60Array1[arg7];
			if (local27.aClass3_Sub17_1 != local25) {
				local27 = null;
			}
		}
		this.method5430(local27, null, arg5, null, local25, local22, arg6, arg2, false, 65535, arg0);
		this.wa();
		this.method5427();
	}

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()Z")
	public abstract boolean method5422();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void method5423();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sk;)V")
	public abstract void method5425(@OriginalArg(0) Class39 arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	public abstract void method5426();

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()V")
	protected abstract void method5427();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!gba;Lclient!gba;I[ZBLclient!gba;IIIIILclient!gba;IZ)V")
	public final void method5428(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub8 arg1, @OriginalArg(2) Class3_Sub4_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(6) Class3_Sub4_Sub8 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class3_Sub4_Sub8 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) boolean arg13) {
		if (arg8 == -1) {
			return;
		}
		if (arg4 == null || arg10 == -1) {
			this.method5421(arg13, arg5, 0, arg8, arg1, arg7, arg12, arg6);
			return;
		}
		this.method5423();
		if (!this.NA()) {
			this.method5427();
			return;
		}
		@Pc(43) Class60 local43 = arg5.aClass60Array1[arg8];
		@Pc(46) Class3_Sub17 local46 = local43.aClass3_Sub17_1;
		@Pc(48) Class60 local48 = null;
		if (arg1 != null) {
			local48 = arg1.aClass60Array1[arg6];
			if (local46 != local48.aClass3_Sub17_1) {
				local48 = null;
			}
		}
		this.method5430(local48, null, arg7, arg4, local46, local43, arg12, 0, false, 65535, arg13);
		@Pc(80) Class60 local80 = arg11.aClass60Array1[arg10];
		@Pc(82) Class60 local82 = null;
		if (arg2 != null) {
			local82 = arg2.aClass60Array1[arg9];
			if (local46 != local82.aClass3_Sub17_1) {
				local82 = null;
			}
		}
		this.method5424(0, new int[0], 0, 0, 0, 0, arg13);
		this.method5430(local82, null, arg0, arg4, local80.aClass3_Sub17_1, local80, arg3, 0, true, 65535, arg13);
		this.wa();
		this.method5427();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void method5429(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!cv;[II[ZLclient!ed;Lclient!cv;IIZIZB)V")
	private void method5430(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[] arg3, @OriginalArg(4) Class3_Sub17 arg4, @OriginalArg(5) Class60 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		@Pc(16) int local16;
		if (arg0 == null || arg2 == 0) {
			for (local16 = 0; local16 < arg5.anInt2091; local16++) {
				@Pc(23) short local23 = arg5.aShortArray16[local16];
				if (arg3 == null || arg8 == arg3[local23] || arg4.anIntArray106[local23] == 0) {
					@Pc(51) short local51 = arg5.aShortArray21[local16];
					if (local51 != -1) {
						this.method5414(arg7, 0, 0, arg9 & arg4.anIntArray107[local51], arg4.anIntArrayArray12[local51], 0, arg1, arg10, 0);
					}
					this.method5414(arg7, arg4.anIntArray106[local23], arg5.aShortArray18[local16], arg9 & arg4.anIntArray107[local23], arg4.anIntArrayArray12[local23], arg5.aShortArray22[local16], arg1, arg10, arg5.aShortArray15[local16]);
				}
			}
			return;
		}
		local16 = 0;
		@Pc(116) int local116 = 0;
		for (@Pc(118) int local118 = 0; local118 < arg4.anInt2565; local118++) {
			@Pc(122) boolean local122 = false;
			if (arg5.anInt2091 > local16 && arg5.aShortArray16[local16] == local118) {
				local122 = true;
			}
			@Pc(136) boolean local136 = false;
			if (local116 < arg0.anInt2091 && arg0.aShortArray16[local116] == local118) {
				local136 = true;
			}
			if (local122 || local136) {
				if (arg3 == null || arg3[local118] == arg8 || arg4.anIntArray106[local118] == 0) {
					@Pc(182) short local182 = 0;
					@Pc(187) int local187 = arg4.anIntArray106[local118];
					if (local187 == 3 || local187 == 10) {
						local182 = 128;
					}
					@Pc(201) short local201;
					@Pc(207) short local207;
					@Pc(199) short local199;
					@Pc(205) short local205;
					@Pc(203) byte local203;
					if (local122) {
						local203 = arg5.aByteArray9[local16];
						local201 = arg5.aShortArray22[local16];
						local199 = arg5.aShortArray15[local16];
						local205 = arg5.aShortArray21[local16];
						local207 = arg5.aShortArray18[local16];
						local16++;
					} else {
						local199 = local182;
						local201 = local182;
						local203 = 0;
						local205 = -1;
						local207 = local182;
					}
					@Pc(239) short local239;
					@Pc(241) short local241;
					@Pc(247) short local247;
					@Pc(245) short local245;
					@Pc(243) byte local243;
					if (local136) {
						local247 = arg0.aShortArray15[local116];
						local241 = arg0.aShortArray18[local116];
						local243 = arg0.aByteArray9[local116];
						local239 = arg0.aShortArray22[local116];
						local245 = arg0.aShortArray21[local116];
						local116++;
					} else {
						local239 = local182;
						local241 = local182;
						local243 = 0;
						local245 = -1;
						local247 = local182;
					}
					@Pc(295) int local295;
					@Pc(293) int local293;
					@Pc(291) int local291;
					if ((local203 & 0x2) == 0 && (local243 & 0x1) == 0) {
						@Pc(307) int local307;
						if (local187 == 2) {
							local307 = local239 - local201 & 0x3FFF;
							@Pc(314) int local314 = local241 - local207 & 0x3FFF;
							if (local314 >= 8192) {
								local314 -= 16384;
							}
							if (local307 >= 8192) {
								local307 -= 16384;
							}
							@Pc(330) int local330 = local247 - local199 & 0x3FFF;
							if (local330 >= 8192) {
								local330 -= 16384;
							}
							local295 = local201 + local307 * arg2 / arg6 & 0x3FFF;
							local293 = local314 * arg2 / arg6 + local207 & 0x3FFF;
							local291 = local330 * arg2 / arg6 + local199 & 0x3FFF;
						} else if (local187 == 9) {
							local307 = local239 - local201 & 0x3FFF;
							if (local307 >= 8192) {
								local307 -= 16384;
							}
							local295 = local307 * arg2 / arg6 + local201 & 0x3FFF;
							local291 = 0;
							local293 = 0;
						} else if (local187 == 7) {
							local307 = local239 - local201 & 0x3F;
							if (local307 >= 32) {
								local307 -= 64;
							}
							local291 = local199 + arg2 * (local247 - local199) / arg6;
							local293 = arg2 * (local241 - local207) / arg6 + local207;
							local295 = local201 + local307 * arg2 / arg6 & 0x3F;
						} else {
							local293 = arg2 * (local241 - local207) / arg6 + local207;
							local291 = (local247 - local199) * arg2 / arg6 + local199;
							local295 = (local239 - local201) * arg2 / arg6 + local201;
						}
					} else {
						local291 = local199;
						local293 = local207;
						local295 = local201;
					}
					if (local205 != -1) {
						this.method5414(arg7, 0, 0, arg9 & arg4.anIntArray107[local205], arg4.anIntArrayArray12[local205], 0, arg1, arg10, 0);
					} else if (local245 != -1) {
						this.method5414(arg7, 0, 0, arg9 & arg4.anIntArray107[local245], arg4.anIntArrayArray12[local245], 0, arg1, arg10, 0);
					}
					this.method5414(arg7, local187, local293, arg4.anIntArray107[local118] & arg9, arg4.anIntArrayArray12[local118], local295, arg1, arg10, local291);
				} else {
					if (local122) {
						local16++;
					}
					if (local136) {
						local116++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!sk;ZI)Z")
	public abstract boolean method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);
}
