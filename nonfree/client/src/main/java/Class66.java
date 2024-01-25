import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public abstract class Class66 {

	@OriginalMember(owner = "client!da", name = "f", descriptor = "Z")
	protected boolean aBoolean691 = false;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	protected Class66() {
	}

	@OriginalMember(owner = "client!da", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "B", descriptor = "(I[IIIIZI[I)V")
	protected abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!da", name = "W", descriptor = "(I)V")
	public abstract void W(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "fa", descriptor = "(I)V")
	public abstract void fa(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!i;IIIIIII)V")
	protected final void method7540(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -arg4 / 2;
		@Pc(21) int local21 = -arg0 / 2;
		@Pc(31) int local31 = arg1.method6711(local21 + arg7, local16 + arg2);
		@Pc(35) int local35 = arg4 / 2;
		@Pc(40) int local40 = -arg0 / 2;
		@Pc(50) int local50 = arg1.method6711(local40 + arg7, arg2 + local35);
		@Pc(55) int local55 = -arg4 / 2;
		@Pc(59) int local59 = arg0 / 2;
		@Pc(69) int local69 = arg1.method6711(local59 + arg7, local55 + arg2);
		@Pc(73) int local73 = arg4 / 2;
		@Pc(77) int local77 = arg0 / 2;
		@Pc(87) int local87 = arg1.method6711(arg7 + local77, arg2 + local73);
		@Pc(98) int local98 = local31 < local50 ? local31 : local50;
		@Pc(109) int local109 = local69 < local87 ? local69 : local87;
		@Pc(116) int local116 = local50 >= local87 ? local87 : local50;
		@Pc(123) int local123 = local31 < local69 ? local31 : local69;
		@Pc(159) int local159;
		if (arg0 != 0) {
			@Pc(139) int local139 = (int) (Math.atan2((double) (local98 - local109), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
			if (local139 != 0) {
				if (arg3 != 0) {
					if (local139 > 8192) {
						local159 = 16384 - arg3;
						if (local159 > local139) {
							local139 = local159;
						}
					} else if (local139 > arg3) {
						local139 = arg3;
					}
				}
				this.MA(local139);
			}
		}
		if (arg4 != 0) {
			@Pc(183) int local183 = (int) (Math.atan2((double) (local123 - local116), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local183 != 0) {
				if (arg6 != 0) {
					if (local183 > 8192) {
						local159 = 16384 - arg6;
						if (local183 < local159) {
							local183 = local159;
						}
					} else if (local183 > arg6) {
						local183 = arg6;
					}
				}
				this.W(local183);
			}
		}
		@Pc(225) int local225 = local87 + local31;
		if (local225 > local50 + local69) {
			local225 = local69 + local50;
		}
		local225 = (local225 >> 1) - arg5;
		if (local225 != 0) {
			this.oa(0, local225, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "DA", descriptor = "(SS)V")
	public abstract void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;Z)Z")
	public abstract boolean method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) boolean arg3);

	@OriginalMember(owner = "client!da", name = "K", descriptor = "()I")
	public abstract int K();

	@OriginalMember(owner = "client!da", name = "WA", descriptor = "(IIII)V")
	protected abstract void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "ga", descriptor = "(I)V")
	public abstract void ga(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!gw;ILclient!gw;IILclient!jj;[IIZ[ZI)V")
	private void method7543(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class132 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub25 arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean[] arg10) {
		@Pc(11) int local11;
		if (arg3 == null || arg8 == 0) {
			for (local11 = 0; local11 < arg1.anInt3801; local11++) {
				@Pc(18) short local18 = arg1.aShortArray51[local11];
				if (arg10 == null || arg10[local18] == arg0 || arg6.anIntArray315[local18] == 0) {
					@Pc(46) short local46 = arg1.aShortArray54[local11];
					if (local46 != -1) {
						this.method7564(0, arg7, 0, arg6.anIntArray316[local46] & arg5, 0, arg9, arg6.anIntArrayArray29[local46], arg2, 0);
					}
					this.method7564(arg1.aShortArray52[local11], arg7, arg1.aShortArray49[local11], arg5 & arg6.anIntArray316[local18], arg1.aShortArray55[local11], arg9, arg6.anIntArrayArray29[local18], arg2, arg6.anIntArray315[local18]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(111) int local111 = 0;
		for (@Pc(118) int local118 = 0; local118 < arg6.anInt4679; local118++) {
			@Pc(122) boolean local122 = false;
			if (local11 < arg1.anInt3801 && arg1.aShortArray51[local11] == local118) {
				local122 = true;
			}
			@Pc(140) boolean local140 = false;
			if (arg3.anInt3801 > local111 && arg3.aShortArray51[local111] == local118) {
				local140 = true;
			}
			if (local122 || local140) {
				if (arg10 == null || arg0 == arg10[local118] || arg6.anIntArray315[local118] == 0) {
					@Pc(178) short local178 = 0;
					@Pc(183) int local183 = arg6.anIntArray315[local118];
					if (local183 == 3 || local183 == 10) {
						local178 = 128;
					}
					@Pc(205) short local205;
					@Pc(200) short local200;
					@Pc(215) short local215;
					@Pc(220) short local220;
					@Pc(210) byte local210;
					if (local122) {
						local200 = arg1.aShortArray52[local11];
						local205 = arg1.aShortArray49[local11];
						local210 = arg1.aByteArray41[local11];
						local215 = arg1.aShortArray55[local11];
						local220 = arg1.aShortArray54[local11];
						local11++;
					} else {
						local205 = local178;
						local200 = local178;
						local210 = 0;
						local220 = -1;
						local215 = local178;
					}
					@Pc(255) short local255;
					@Pc(250) short local250;
					@Pc(260) short local260;
					@Pc(245) short local245;
					@Pc(240) byte local240;
					if (local140) {
						local240 = arg3.aByteArray41[local111];
						local245 = arg3.aShortArray54[local111];
						local250 = arg3.aShortArray52[local111];
						local255 = arg3.aShortArray49[local111];
						local260 = arg3.aShortArray55[local111];
						local111++;
					} else {
						local260 = local178;
						local240 = 0;
						local245 = -1;
						local250 = local178;
						local255 = local178;
					}
					if (local220 != -1) {
						this.method7564(0, arg7, 0, arg6.anIntArray316[local220] & arg5, 0, arg9, arg6.anIntArrayArray29[local220], arg2, 0);
					} else if (local245 != -1) {
						this.method7564(0, arg7, 0, arg5 & arg6.anIntArray316[local245], 0, arg9, arg6.anIntArrayArray29[local245], arg2, 0);
					}
					@Pc(337) int local337;
					@Pc(339) int local339;
					@Pc(335) int local335;
					if ((local210 & 0x2) == 0 && (local240 & 0x1) == 0) {
						@Pc(353) int local353;
						if (local183 == 2) {
							local353 = local255 - local205 & 0x3FFF;
							@Pc(360) int local360 = local250 - local200 & 0x3FFF;
							if (local360 >= 8192) {
								local360 -= 16384;
							}
							if (local353 >= 8192) {
								local353 -= 16384;
							}
							@Pc(376) int local376 = local260 - local215 & 0x3FFF;
							local337 = local205 + local353 * arg8 / arg4 & 0x3FFF;
							local339 = arg8 * local360 / arg4 + local200 & 0x3FFF;
							if (local376 >= 8192) {
								local376 -= 16384;
							}
							local335 = local215 + local376 * arg8 / arg4 & 0x3FFF;
						} else if (local183 == 9) {
							local353 = local255 - local205 & 0x3FFF;
							if (local353 >= 8192) {
								local353 -= 16384;
							}
							local337 = local205 + local353 * arg8 / arg4 & 0x3FFF;
							local335 = 0;
							local339 = 0;
						} else if (local183 == 7) {
							local353 = local255 - local205 & 0x3F;
							if (local353 >= 32) {
								local353 -= 64;
							}
							local339 = local200 + arg8 * (local250 - local200) / arg4;
							local335 = (local260 - local215) * arg8 / arg4 + local215;
							local337 = arg8 * local353 / arg4 + local205 & 0x3F;
						} else {
							local337 = (local255 - local205) * arg8 / arg4 + local205;
							local335 = local215 + arg8 * (local260 - local215) / arg4;
							local339 = (local250 - local200) * arg8 / arg4 + local200;
						}
					} else {
						local335 = local215;
						local337 = local205;
						local339 = local200;
					}
					this.method7564(local339, arg7, local337, arg6.anIntArray316[local118] & arg5, local335, arg9, arg6.anIntArrayArray29[local118], arg2, local183);
				} else {
					if (local122) {
						local11++;
					}
					if (local140) {
						local111++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!wa;II)V")
	public final void method7544(@OriginalArg(0) Class2_Sub3_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method7557();
		if (!this.F()) {
			this.method7555();
			return;
		}
		@Pc(23) Class132 local23 = arg0.aClass132Array1[arg1];
		@Pc(26) Class2_Sub25 local26 = local23.aClass2_Sub25_1;
		for (@Pc(32) int local32 = 0; local32 < local23.anInt3801; local32++) {
			@Pc(39) short local39 = local23.aShortArray51[local32];
			if (local26.aBooleanArray22[local39]) {
				if (local23.aShortArray54[local32] != -1) {
					this.WA(0, 0, 0, 0);
				}
				this.WA(local26.anIntArray315[local39], local23.aShortArray49[local32], local23.aShortArray52[local32], local23.aShortArray55[local32]);
			}
		}
		this.L();
		this.method7555();
	}

	@OriginalMember(owner = "client!da", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	public abstract Class2_Sub3_Sub6 S(@OriginalArg(0) Class2_Sub3_Sub6 arg0);

	@OriginalMember(owner = "client!da", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	public abstract void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) Class67 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!da", name = "T", descriptor = "(I)V")
	public abstract void T(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "PA", descriptor = "()I")
	public abstract int PA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void method7545(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	public abstract void method7546();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!q;ZI)Z")
	public abstract boolean method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!da", name = "R", descriptor = "(III)V")
	public abstract void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)V")
	public abstract void method7548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()Z")
	public abstract boolean method7549();

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()[Lclient!hi;")
	public abstract Class139[] method7550();

	@OriginalMember(owner = "client!da", name = "MA", descriptor = "(I)V")
	public abstract void MA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "L", descriptor = "()V")
	protected abstract void L();

	@OriginalMember(owner = "client!da", name = "TA", descriptor = "()I")
	public abstract int TA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BIZ)Lclient!da;")
	public abstract Class66 method7551(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!da", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!da", name = "za", descriptor = "()I")
	public abstract int za();

	@OriginalMember(owner = "client!da", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;)V")
	public abstract void method7552(@OriginalArg(0) Class68 arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	public abstract void method7553(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "OA", descriptor = "()I")
	public abstract int OA();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	protected abstract void method7555();

	@OriginalMember(owner = "client!da", name = "FA", descriptor = "()V")
	public abstract void FA();

	@OriginalMember(owner = "client!da", name = "H", descriptor = "()I")
	public abstract int H();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!pba;II)V")
	public abstract void method7556(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class6_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "e", descriptor = "()V")
	protected abstract void method7557();

	@OriginalMember(owner = "client!da", name = "LA", descriptor = "()Z")
	public abstract boolean LA();

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(SS)V")
	public abstract void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!da", name = "F", descriptor = "()Z")
	protected abstract boolean F();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!q;Lclient!pba;I)V")
	public abstract void method7558(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class6_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZBLclient!wa;IILclient!wa;III)V")
	public final void method7559(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3_Sub19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub3_Sub19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 == -1) {
			return;
		}
		this.method7557();
		if (!this.F()) {
			this.method7555();
			return;
		}
		@Pc(21) Class132 local21 = arg1.aClass132Array1[arg3];
		@Pc(28) Class2_Sub25 local28 = local21.aClass2_Sub25_1;
		@Pc(30) Class132 local30 = null;
		if (arg4 != null) {
			local30 = arg4.aClass132Array1[arg2];
			if (local30.aClass2_Sub25_1 != local28) {
				local30 = null;
			}
		}
		this.method7543(false, local21, arg6, local30, arg7, 65535, local28, null, arg5, arg0, null);
		this.L();
		this.method7555();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!wa;III[IIIZILclient!wa;)V")
	public final void method7560(@OriginalArg(1) Class2_Sub3_Sub19 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) boolean arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class2_Sub3_Sub19 arg8) {
		if (arg2 == -1) {
			return;
		}
		this.method7557();
		if (!this.F()) {
			this.method7555();
			return;
		}
		@Pc(21) Class132 local21 = arg8.aClass132Array1[arg2];
		@Pc(24) Class2_Sub25 local24 = local21.aClass2_Sub25_1;
		@Pc(26) Class132 local26 = null;
		if (arg0 != null) {
			local26 = arg0.aClass132Array1[arg5];
			if (local26.aClass2_Sub25_1 != local24) {
				local26 = null;
			}
		}
		this.method7543(false, local21, 0, local26, arg7, arg4, local24, arg3, arg1, arg6, null);
		this.L();
		this.method7555();
	}

	@OriginalMember(owner = "client!da", name = "l", descriptor = "()I")
	public abstract int l();

	@OriginalMember(owner = "client!da", name = "M", descriptor = "(I)V")
	public abstract void M(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "J", descriptor = "()I")
	public abstract int J();

	@OriginalMember(owner = "client!da", name = "SA", descriptor = "(I)V")
	public abstract void SA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()[Lclient!qg;")
	public abstract Class270[] method7561();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!wa;ILclient!wa;IILclient!wa;I[ZIIZILclient!wa;II)V")
	public final void method7563(@OriginalArg(0) Class2_Sub3_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub3_Sub19 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class2_Sub3_Sub19 arg12, @OriginalArg(14) int arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg7 == null || arg11 == -1) {
			this.method7559(arg10, arg12, arg4, arg1, arg0, arg3, 0, arg9);
			return;
		}
		this.method7557();
		if (!this.F()) {
			this.method7555();
			return;
		}
		@Pc(51) Class132 local51 = arg12.aClass132Array1[arg1];
		@Pc(54) Class2_Sub25 local54 = local51.aClass2_Sub25_1;
		@Pc(56) Class132 local56 = null;
		if (arg0 != null) {
			local56 = arg0.aClass132Array1[arg4];
			if (local56.aClass2_Sub25_1 != local54) {
				local56 = null;
			}
		}
		this.method7543(false, local51, 0, local56, arg9, 65535, local54, null, arg3, arg10, arg7);
		@Pc(88) Class132 local88 = arg5.aClass132Array1[arg11];
		@Pc(90) Class132 local90 = null;
		if (arg2 != null) {
			local90 = arg2.aClass132Array1[arg13];
			if (local90.aClass2_Sub25_1 != local54) {
				local90 = null;
			}
		}
		this.method7545(0, new int[0], 0, 0, 0, 0, arg10);
		this.method7543(true, local88, 0, local90, arg6, 65535, local88.aClass2_Sub25_1, null, arg8, arg10, arg7);
		this.L();
		this.method7555();
	}

	@OriginalMember(owner = "client!da", name = "KA", descriptor = "()I")
	public abstract int KA();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIIIZ[IIII)V")
	private void method7564(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(29) int local29;
		if (arg7 == 1) {
			if (arg8 == 0 || arg8 == 1) {
				local29 = -arg2;
				arg2 = arg4;
				arg4 = local29;
			} else if (arg8 == 3) {
				local29 = arg2;
				arg2 = arg4;
				arg4 = local29;
			} else if (arg8 == 2) {
				local29 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = local29 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg8 == 0 || arg8 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg8 == 2) {
				arg4 = -arg4 & 0x3FFF;
				arg2 = -arg2 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg8 == 0 || arg8 == 1) {
				local29 = arg2;
				arg2 = -arg4;
				arg4 = local29;
			} else if (arg8 == 3) {
				local29 = arg2;
				arg2 = arg4;
				arg4 = local29;
			} else if (arg8 == 2) {
				local29 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -local29 & 0x3FFF;
			}
		}
		if (arg3 == 65535) {
			this.method7545(arg8, arg6, arg2, arg0, arg4, arg7, arg5);
		} else {
			this.B(arg8, arg6, arg2, arg0, arg4, arg5, arg3, arg1);
		}
	}
}
