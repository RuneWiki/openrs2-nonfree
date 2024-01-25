import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class11_Sub1_Sub1_Sub3_Sub1 extends Class11_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!hb", name = "zd", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!hb", name = "Gd", descriptor = "Lclient!qi;")
	public Class283 aClass283_1;

	@OriginalMember(owner = "client!hb", name = "Kd", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!hb", name = "Qd", descriptor = "I")
	public int anInt3604;

	@OriginalMember(owner = "client!hb", name = "Rd", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!hb", name = "Yd", descriptor = "I")
	private int anInt3611;

	@OriginalMember(owner = "client!hb", name = "ed", descriptor = "I")
	public int anInt3578 = 0;

	@OriginalMember(owner = "client!hb", name = "kd", descriptor = "I")
	public int anInt3583 = 0;

	@OriginalMember(owner = "client!hb", name = "fd", descriptor = "I")
	public int anInt3579 = -1;

	@OriginalMember(owner = "client!hb", name = "dd", descriptor = "Z")
	public boolean aBoolean259 = false;

	@OriginalMember(owner = "client!hb", name = "hd", descriptor = "Z")
	public boolean aBoolean260 = false;

	@OriginalMember(owner = "client!hb", name = "Ad", descriptor = "I")
	public int anInt3593 = 0;

	@OriginalMember(owner = "client!hb", name = "qd", descriptor = "B")
	private byte aByte51 = 0;

	@OriginalMember(owner = "client!hb", name = "wd", descriptor = "I")
	public int anInt3590 = -1;

	@OriginalMember(owner = "client!hb", name = "td", descriptor = "I")
	public int anInt3588 = 255;

	@OriginalMember(owner = "client!hb", name = "od", descriptor = "B")
	private byte aByte50 = 0;

	@OriginalMember(owner = "client!hb", name = "Od", descriptor = "Z")
	public boolean aBoolean262 = false;

	@OriginalMember(owner = "client!hb", name = "md", descriptor = "I")
	public int anInt3584 = -1;

	@OriginalMember(owner = "client!hb", name = "Hd", descriptor = "I")
	public int anInt3599 = -1;

	@OriginalMember(owner = "client!hb", name = "ld", descriptor = "B")
	private byte aByte49 = 0;

	@OriginalMember(owner = "client!hb", name = "gd", descriptor = "I")
	public int anInt3580 = 0;

	@OriginalMember(owner = "client!hb", name = "cd", descriptor = "I")
	public int anInt3577 = -1;

	@OriginalMember(owner = "client!hb", name = "Jd", descriptor = "Z")
	public boolean aBoolean261 = false;

	@OriginalMember(owner = "client!hb", name = "Bd", descriptor = "I")
	public int anInt3594 = -1;

	@OriginalMember(owner = "client!hb", name = "Cd", descriptor = "I")
	public int anInt3595 = -1;

	@OriginalMember(owner = "client!hb", name = "Ud", descriptor = "I")
	public int anInt3608 = -1;

	@OriginalMember(owner = "client!hb", name = "Zd", descriptor = "Z")
	public boolean aBoolean263 = false;

	@OriginalMember(owner = "client!hb", name = "ae", descriptor = "I")
	public int anInt3612 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method2947() {
		@Pc(13) String local13 = "";
		if (Static79.aStringArray2 != null) {
			local13 = local13 + Static79.aStringArray2[this.aByte50];
		}
		@Pc(35) int[] local35;
		if (this.aByte49 == 1 && Static198.anIntArray185 != null) {
			local35 = Static198.anIntArray185;
		} else {
			local35 = Static28.anIntArray27;
		}
		if (local35 != null && local35[this.aByte50] != -1) {
			@Pc(55) Class162 local55 = Static108.aClass98_1.method2399(local35[this.aByte50]);
			if (local55.aChar4 == 's') {
				local13 = local13 + local55.method3402(this.aByte51 & 0xFF);
			} else {
				Static419.method5957("gdn1", new Throwable());
				local35[this.aByte50] = -1;
			}
		}
		local13 = local13 + this.aString34;
		if (Static353.aStringArray23 != null) {
			local13 = local13 + Static353.aStringArray23[this.aByte50];
		}
		return local13;
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(I)V")
	@Override
	public void method7222() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7214() {
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIBI)V")
	public void method2948(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7591 != -1 && Static223.aClass245_1.method5312(super.anInt7591).anInt5064 == 1) {
			super.anIntArray448 = null;
			super.anInt7591 = -1;
		}
		@Pc(40) Class134 local40;
		if (super.anInt7547 != -1) {
			local40 = Static583.aClass256_2.method5466(super.anInt7547);
			if (local40.aBoolean272 && local40.anInt3775 != -1 && Static223.aClass245_1.method5312(local40.anInt3775).anInt5064 == 1) {
				super.anInt7547 = -1;
			}
		}
		if (super.anInt7570 != -1) {
			local40 = Static583.aClass256_2.method5466(super.anInt7570);
			if (local40.aBoolean272 && local40.anInt3775 != -1 && Static223.aClass245_1.method5312(local40.anInt3775).anInt5064 == 1) {
				super.anInt7570 = -1;
			}
		}
		this.anInt3594 = -1;
		if (arg2 < 0 || arg2 >= Static458.anInt9736 || arg1 < 0 || Static378.anInt6747 <= arg1) {
			this.method2956(arg2, arg1);
		} else if (super.anIntArray455[0] >= 0 && super.anIntArray455[0] < Static458.anInt9736 && super.anIntArray454[0] >= 0 && Static378.anInt6747 > super.anIntArray454[0]) {
			if (arg0 == 2) {
				Static573.method7726(this, arg1, arg2);
			}
			this.method2953(arg0, arg1, arg2);
		} else {
			this.method2956(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "(I)I")
	@Override
	protected int method6062() {
		return this.anInt3611;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(Z)Z")
	public boolean method2949() {
		return this.aClass283_1 != null;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(ZB)Ljava/lang/String;")
	public String method2950() {
		return this.aString35;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!r;)Z")
	private boolean method2951(@OriginalArg(1) int arg0, @OriginalArg(2) Class78 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class114 local11 = this.method6073();
		@Pc(26) Class197 local26 = super.anInt7591 != -1 && super.anInt7532 == 0 ? Static223.aClass245_1.method5312(super.anInt7591) : null;
		@Pc(46) Class197 local46 = super.anInt7577 == -1 || this.aBoolean263 || super.aBoolean575 && local26 != null ? null : Static223.aClass245_1.method5312(super.anInt7577);
		@Pc(49) int local49 = local11.anInt2990;
		@Pc(52) int local52 = local11.anInt3017;
		if (local49 != 0 || local52 != 0 || local11.anInt3000 != 0 || local11.anInt2995 != 0) {
			arg0 |= 0x7;
		}
		@Pc(77) int local77 = super.aClass106_7.method2484();
		@Pc(100) boolean local100 = super.aByte103 != 0 && Static518.anInt9331 >= super.anInt7589 && super.anInt7599 > Static518.anInt9331;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(144) Class52 local144 = super.aClass52Array3[0] = this.aClass283_1.method6102(super.anInt7593, Static84.aClass242_1, super.anInt7595, super.anInt7580, Static390.aClass353_29, Static223.aClass245_1, super.anIntArray453, Static230.aClass225_1, local77, super.aClass221Array3, arg0, super.anInt7525, super.anInt7558, Static423.aClass323_1, local26, super.anInt7530, local46, arg1, Static241.aClass340_1);
		@Pc(147) int local147 = Static1.method35();
		if (Static221.anInt4095 < 96 && local147 > 50) {
			Static264.method3875();
		}
		if (Static76.aClass93_3 != Static405.aClass93_6 && local147 < 50) {
			@Pc(166) int local166 = 50 - local147;
			while (Static553.anInt9224 < local166) {
				Static277.aByteArrayArray12[Static553.anInt9224] = new byte[102400];
				Static553.anInt9224++;
			}
			while (Static553.anInt9224 > local166) {
				Static553.anInt9224--;
				Static277.aByteArrayArray12[Static553.anInt9224] = null;
			}
		} else if (Static76.aClass93_3 != Static405.aClass93_6) {
			Static277.aByteArrayArray12 = new byte[50][];
			Static553.anInt9224 = 0;
		}
		if (local144 == null) {
			return false;
		}
		super.anInt7551 = local144.J();
		super.anInt7554 = local144.RA();
		this.method6063(local144);
		if (local49 == 0 && local52 == 0) {
			this.method6066(local77, 0, this.method6058() << 9, this.method6058() << 9, 0);
		} else {
			this.method6066(local77, local11.anInt3015, local52, local49, local11.anInt3016);
			if (super.anInt7548 != 0) {
				local144.MA(super.anInt7548);
			}
			if (super.anInt7520 != 0) {
				local144.W(super.anInt7520);
			}
			if (super.anInt7567 != 0) {
				local144.oa(0, super.anInt7567, 0);
			}
		}
		if (local100) {
			local144.method7408(super.aByte106, super.aByte105, super.aByte104, super.aByte103 & 0xFF);
		}
		@Pc(340) boolean local340;
		@Pc(342) int local342;
		@Pc(385) Class52 local385;
		@Pc(323) Class134 local323;
		if (this.aBoolean263 || super.anInt7547 == -1 || super.anInt7575 == -1) {
			super.aClass52Array3[1] = null;
		} else {
			local323 = Static583.aClass256_2.method5466(super.anInt7547);
			local340 = local323.aByte52 == 3 && (local49 != 0 || local52 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt7588 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.anInt7560 != 0) {
					local342 |= 0x2;
				}
			}
			local385 = super.aClass52Array3[1] = local323.method3062(super.anInt7574, Static223.aClass245_1, super.anInt7575, arg1, super.anInt7544, local342);
			if (local385 != null) {
				if (super.anInt7560 != 0) {
					local385.oa(0, -super.anInt7560 << 2, 0);
				}
				if (super.anInt7588 != 0) {
					local385.M(super.anInt7588 * 2048);
				}
				if (local340) {
					if (super.anInt7548 != 0) {
						local385.MA(super.anInt7548);
					}
					if (super.anInt7520 != 0) {
						local385.W(super.anInt7520);
					}
					if (super.anInt7567 != 0) {
						local385.oa(0, super.anInt7567, 0);
					}
				}
			}
		}
		if (this.aBoolean263 || super.anInt7570 == -1 || super.anInt7600 == -1) {
			super.aClass52Array3[2] = null;
		} else {
			local323 = Static583.aClass256_2.method5466(super.anInt7570);
			local340 = local323.aByte52 == 3 && (local49 != 0 || local52 != 0);
			local342 = local7;
			if (local340) {
				local342 = local7 | 0x7;
			} else {
				if (super.anInt7535 != 0) {
					local342 = local7 | 0x5;
				}
				if (super.anInt7553 != 0) {
					local342 |= 0x2;
				}
			}
			local385 = super.aClass52Array3[2] = local323.method3065(Static223.aClass245_1, super.anInt7600, arg1, super.anInt7592, super.anInt7533, local342);
			if (local385 != null) {
				if (super.anInt7553 != 0) {
					local385.oa(0, -super.anInt7553 << 2, 0);
				}
				if (super.anInt7535 != 0) {
					local385.M(super.anInt7535 * 2048);
				}
				if (local340) {
					if (super.anInt7548 != 0) {
						local385.MA(super.anInt7548);
					}
					if (super.anInt7520 != 0) {
						local385.W(super.anInt7520);
					}
					if (super.anInt7567 != 0) {
						local385.oa(0, super.anInt7567, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(Z)I")
	@Override
	public int method6076() {
		return -1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!da;Lclient!r;IIIILclient!q;I)V")
	private void method2952(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class34 arg6) {
		@Pc(11) int local11 = arg2 * arg2 + arg3 * arg3;
		if (local11 < 262144 || arg5 < local11) {
			return;
		}
		@Pc(29) int local29 = (int) (Math.atan2((double) arg2, (double) arg3) * 2607.5945876176133D) & 0x3FFF;
		@Pc(47) Class52 local47 = Static128.method2265(super.anInt7567, super.anInt7548, super.anInt7520, arg1, local29, arg4);
		if (local47 != null) {
			arg1.ZA(false);
			local47.method7413(arg6, null, 0);
			arg1.ZA(true);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7206(@OriginalArg(0) Class78 arg0) {
		if (this.aClass283_1 == null || !super.aBoolean579 && !this.method2951(0, arg0)) {
			return;
		}
		@Pc(20) Class34 local20 = arg0.method6848();
		local20.o(super.aClass106_7.method2484());
		local20.U(super.anInt8902, super.anInt8908 - 5, super.anInt8906);
		this.method6075(super.aClass52Array3, local20, super.aBoolean579, arg0);
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!vv;IIZLclient!r;II)V")
	@Override
	public void method7215(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIII)V")
	public void method2953(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt7604 < 9) {
			super.anInt7604++;
		}
		for (@Pc(26) int local26 = super.anInt7604; local26 > 0; local26--) {
			super.anIntArray455[local26] = super.anIntArray455[local26 - 1];
			super.anIntArray454[local26] = super.anIntArray454[local26 - 1];
			super.aByteArray75[local26] = super.aByteArray75[local26 - 1];
		}
		super.anIntArray455[0] = arg2;
		super.aByteArray75[0] = arg0;
		super.anIntArray454[0] = arg1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!q;IILclient!da;Lclient!r;IIII)V")
	private void method2955(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class52 arg3, @OriginalArg(4) Class78 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(11) int local11 = arg7 * arg7 + arg1 * arg1;
		if (local11 < 262144 || local11 > arg2) {
			return;
		}
		@Pc(34) int local34 = (int) (Math.atan2((double) arg7, (double) arg1) * 2607.5945876176133D) & 0x3FFF;
		@Pc(46) Class52 local46 = Static128.method2265(super.anInt7567, super.anInt7548, super.anInt7520, arg4, local34, arg6);
		if (local46 != null) {
			arg4.ZA(false);
			local46.method7405(arg0, null, arg5, 0);
			arg4.ZA(true);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!r;)Lclient!cr;")
	@Override
	public Class48 method7205(@OriginalArg(1) Class78 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I")
	@Override
	public int method6058() {
		return this.aClass283_1 == null || this.aClass283_1.anInt7646 == -1 ? super.method6058() : Static84.aClass242_1.method5281(this.aClass283_1.anInt7646).anInt9418;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lclient!r;I)Lclient!bca;")
	@Override
	public Class11_Sub2 method7219(@OriginalArg(0) Class78 arg0) {
		if (this.aClass283_1 == null || !this.method2951(2048, arg0)) {
			return null;
		}
		@Pc(21) Class34 local21 = arg0.method6848();
		@Pc(26) int local26 = super.aClass106_7.method2484();
		local21.o(local26);
		@Pc(44) Class360 local44 = Static568.aClass360ArrayArrayArray22[super.aByte113][super.anInt8902 >> Static166.anInt7796][super.anInt8906 >> Static166.anInt7796];
		@Pc(56) int local56;
		if (local44 == null || local44.aClass11_Sub1_Sub4_1 == null) {
			super.anInt7526 = (int) ((float) super.anInt7526 - (float) super.anInt7526 / 10.0F);
		} else {
			local56 = super.anInt7526 - local44.aClass11_Sub1_Sub4_1.aShort109;
			super.anInt7526 = (int) ((float) super.anInt7526 - (float) local56 / 10.0F);
		}
		local21.U(super.anInt8902, super.anInt8908 - super.anInt7526 - 20, super.anInt8906);
		super.aBoolean578 = false;
		if (Static86.aClass1_Sub30_Sub1_1.aBoolean477) {
			@Pc(104) Class114 local104 = this.method6073();
			if (local104.aBoolean222 && (this.aClass283_1.anInt7646 == -1 || Static84.aClass242_1.method5281(this.aClass283_1.anInt7646).aBoolean702)) {
				@Pc(139) Class197 local139 = super.anInt7591 != -1 && super.anInt7532 == 0 ? Static223.aClass245_1.method5312(super.anInt7591) : null;
				@Pc(161) Class197 local161 = super.anInt7577 == -1 || this.aBoolean263 || super.aBoolean575 && local139 != null ? null : Static223.aClass245_1.method5312(super.anInt7577);
				@Pc(193) Class52 local193 = Static524.method1214(super.anInt7548, super.anInt7567, 1, local161 == null ? local139 : local161, 0, 240, 0, local161 == null ? super.anInt7558 : super.anInt7593, super.aClass52Array3[0], arg0, 160, local26, super.anInt7520);
				if (local193 != null) {
					super.aBoolean578 = true;
					arg0.ZA(false);
					if (Static594.aBoolean718) {
						local193.method7405(local21, null, Static18.anInt503, 0);
					} else {
						local193.method7413(local21, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 == this) {
			local21.NA(super.anInt8902, super.anInt8908, super.anInt8906);
			for (local56 = Static243.aClass358Array1.length - 1; local56 >= 0; local56--) {
				@Pc(241) Class358 local241 = Static243.aClass358Array1[local56];
				if (local241 != null && local241.anInt9533 != -1) {
					@Pc(272) int local272;
					if (local241.anInt9530 == 1) {
						@Pc(260) Class1_Sub33 local260 = (Class1_Sub33) Static372.aClass91_30.method2271((long) local241.anInt9537);
						if (local260 != null) {
							@Pc(265) Class11_Sub1_Sub1_Sub3_Sub2 local265 = local260.aClass11_Sub1_Sub1_Sub3_Sub2_2;
							local272 = local265.anInt8902 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902;
							@Pc(279) int local279 = local265.anInt8906 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906;
							if (Static594.aBoolean718) {
								this.method2955(local21, local279, 92160000, super.aClass52Array3[0], arg0, Static18.anInt503, local241.anInt9533, local272);
							} else {
								this.method2952(super.aClass52Array3[0], arg0, local272, local279, local241.anInt9533, 92160000, local21);
							}
						}
					}
					@Pc(335) int local335;
					if (local241.anInt9530 == 2) {
						@Pc(326) int local326 = local241.anInt9534 + 256 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902;
						local335 = local241.anInt9532 + 256 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906;
						local272 = local241.anInt9540 << 9;
						local272 *= local272;
						if (Static594.aBoolean718) {
							this.method2955(local21, local335, local272, super.aClass52Array3[0], arg0, Static18.anInt503, local241.anInt9533, local326);
						} else {
							this.method2952(super.aClass52Array3[0], arg0, local326, local335, local241.anInt9533, local272, local21);
						}
					}
					if (local241.anInt9530 == 10 && local241.anInt9537 >= 0 && Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1.length > local241.anInt9537) {
						@Pc(399) Class11_Sub1_Sub1_Sub3_Sub1 local399 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local241.anInt9537];
						if (local399 != null) {
							local335 = local399.anInt8902 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902;
							local272 = local399.anInt8906 - Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906;
							if (Static594.aBoolean718) {
								this.method2955(local21, local272, 92160000, super.aClass52Array3[0], arg0, Static18.anInt503, local241.anInt9533, local335);
							} else {
								this.method2952(super.aClass52Array3[0], arg0, local335, local272, local241.anInt9533, 92160000, local21);
							}
						}
					}
				}
			}
			local21.o(local26);
			local21.U(super.anInt8902, super.anInt8908, super.anInt8906);
		}
		local21.o(local26);
		local21.U(super.anInt8902, super.anInt8908 - super.anInt7526 - 5, super.anInt8906);
		@Pc(488) Class11_Sub2 local488 = Static586.method7842(super.aClass52Array3.length);
		this.method6075(super.aClass52Array3, local21, false, arg0);
		@Pc(500) int local500;
		if (Static594.aBoolean718) {
			for (local500 = 0; super.aClass52Array3.length > local500; local500++) {
				if (super.aClass52Array3[local500] != null) {
					super.aClass52Array3[local500].method7405(local21, local488.aClass11_Sub4Array1[local500], Static18.anInt503, Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local500 = 0; local500 < super.aClass52Array3.length; local500++) {
				if (super.aClass52Array3[local500] != null) {
					super.aClass52Array3[local500].method7413(local21, local488.aClass11_Sub4Array1[local500], Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass11_Sub9_7 != null) {
			@Pc(574) Class64 local574 = super.aClass11_Sub9_7.method5336();
			if (Static594.aBoolean718) {
				arg0.method6850(local574, Static18.anInt503);
			} else {
				arg0.method6796(local574);
			}
		}
		for (local500 = 0; local500 < super.aClass52Array3.length; local500++) {
			if (super.aClass52Array3[local500] != null) {
				super.aBoolean578 |= super.aClass52Array3[local500].LA();
			}
		}
		super.anInt7564 = Static450.anInt7909;
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
		return local488;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILclient!r;)Z")
	@Override
	public boolean method7210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class78 arg2) {
		if (this.aClass283_1 == null || !this.method2951(131072, arg2)) {
			return false;
		}
		@Pc(19) Class34 local19 = arg2.method6848();
		@Pc(24) int local24 = super.aClass106_7.method2484();
		local19.o(local24);
		local19.U(super.anInt8902, super.anInt8908, super.anInt8906);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass52Array3.length > local39; local39++) {
			if (super.aClass52Array3[local39] != null && (Static594.aBoolean718 ? super.aClass52Array3[local39].method7392(arg1, arg0, local19, true, Static18.anInt503) : super.aClass52Array3[local39].method7402(arg1, arg0, local19, true))) {
				local37 = true;
				break;
			}
		}
		super.aClass52Array3[0] = super.aClass52Array3[1] = super.aClass52Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
	public void method2956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt7605 = 0;
		super.anInt7607 = 0;
		super.anIntArray455[0] = arg0;
		super.anInt7604 = 0;
		super.anIntArray454[0] = arg1;
		@Pc(32) int local32 = this.method6058();
		super.anInt8906 = super.anIntArray454[0] * 512 + local32 * 256;
		super.anInt8902 = local32 * 256 + super.anIntArray455[0] * 512;
		if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 == this) {
			Static585.method7837();
		}
		if (super.aClass11_Sub9_7 != null) {
			super.aClass11_Sub9_7.method5338();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!ac;B)V")
	public void method2957(@OriginalArg(0) Class1_Sub3 arg0) {
		arg0.anInt9802 = 0;
		@Pc(12) int local12 = arg0.method7974();
		this.aByte49 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean260;
		this.aBoolean260 = (local12 & 0x2) != 0;
		@Pc(44) boolean local44 = (local12 & 0x4) != 0;
		@Pc(48) int local48 = super.method6058();
		this.method6071((local12 >> 3 & 0x7) + 1);
		this.aByte50 = (byte) (local12 >> 6 & 0x3);
		super.anInt8902 += this.method6058() - local48 << 8;
		super.anInt8906 += this.method6058() - local48 << 8;
		this.aByte51 = arg0.method7963();
		this.anInt3599 = arg0.method7963();
		this.anInt3579 = arg0.method7963();
		this.aBoolean262 = arg0.method7963() == 1;
		if (Static76.aClass93_3 == Static405.aClass93_6 && Static203.anInt3822 >= 2) {
			this.aBoolean262 = false;
		}
		this.anInt3612 = 0;
		@Pc(134) int local134 = -1;
		@Pc(137) int[] local137 = new int[12];
		@Pc(157) int local157;
		@Pc(163) int local163;
		@Pc(202) int local202;
		for (@Pc(139) int local139 = 0; local139 < 12; local139++) {
			@Pc(145) int local145 = arg0.method7974();
			if (local145 == 0) {
				local137[local139] = 0;
			} else {
				local157 = arg0.method7974();
				local163 = (local145 << 8) + local157;
				if (local139 == 0 && local163 == 65535) {
					local134 = arg0.method7945();
					this.anInt3612 = arg0.method7974();
					break;
				}
				if (local163 >= 32768) {
					local163 = Static414.anIntArray465[local163 - 32768];
					local137[local139] = local163 | 0x40000000;
					local202 = Static230.aClass225_1.method4857(local163).anInt5870;
					if (local202 != 0) {
						this.anInt3612 = local202;
					}
				} else {
					local137[local139] = local163 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(229) int[] local229 = new int[5];
		for (local157 = 0; local157 < 5; local157++) {
			local163 = arg0.method7974();
			if (Static103.aShortArrayArrayArray1.length < 1 || local163 < 0 || local163 >= Static103.aShortArrayArrayArray1[0][local157].length) {
				local163 = 0;
			}
			local229[local157] = local163;
		}
		this.anInt3611 = arg0.method7945();
		this.aString34 = arg0.method7951();
		this.aString35 = this.aString34;
		this.anInt3580 = arg0.method7974();
		if (local44) {
			this.anInt3583 = arg0.method7945();
			this.anInt3578 = this.anInt3580;
			if (this.anInt3583 == 65535) {
				this.anInt3583 = -1;
			}
			this.anInt3584 = -1;
		} else {
			this.anInt3583 = 0;
			this.anInt3578 = arg0.method7974();
			this.anInt3584 = arg0.method7974();
			if (this.anInt3584 == 255) {
				this.anInt3584 = -1;
			}
		}
		local163 = this.anInt3593;
		this.anInt3593 = arg0.method7974();
		@Pc(357) int local357;
		if (this.anInt3593 == 0) {
			Static408.method5843(this);
		} else {
			local202 = this.anInt3577;
			@Pc(354) int local354 = this.anInt3608;
			local357 = this.anInt3595;
			@Pc(360) int local360 = this.anInt3590;
			@Pc(363) int local363 = this.anInt3588;
			this.anInt3577 = arg0.method7945();
			this.anInt3608 = arg0.method7945();
			this.anInt3595 = arg0.method7945();
			this.anInt3590 = arg0.method7945();
			this.anInt3588 = arg0.method7974();
			if (this.aBoolean260 != local21 || this.anInt3593 != local163 || local202 != this.anInt3577 || this.anInt3608 != local354 || this.anInt3595 != local357 || this.anInt3590 != local360 || local363 != this.anInt3588) {
				Static319.method4771(this);
			}
		}
		if (this.aClass283_1 == null) {
			this.aClass283_1 = new Class283();
		}
		local202 = this.aClass283_1.anInt7646;
		@Pc(452) int[] local452 = this.aClass283_1.anIntArray457;
		this.aClass283_1.method6098(this.aByte49 == 1, local229, local137, local134, this.method6062());
		if (local202 != local134) {
			super.anInt8902 = (super.anIntArray455[0] << 9) + (this.method6058() << 8);
			super.anInt8906 = (super.anIntArray454[0] << 9) + (this.method6058() << 8);
		}
		if (super.anInt7524 == Static310.anInt5693 && local452 != null) {
			for (local357 = 0; local357 < local229.length; local357++) {
				if (local229[local357] != local452[local357]) {
					Static230.aClass225_1.method4861();
					break;
				}
			}
		}
		if (super.aClass11_Sub9_7 != null) {
			super.aClass11_Sub9_7.method5338();
		}
		if (super.anInt7577 == -1 || !super.aBoolean575) {
			return;
		}
		@Pc(560) Class114 local560 = this.method6073();
		if (!local560.method2603(super.anInt7577)) {
			super.aBoolean575 = false;
			super.anInt7577 = -1;
			return;
		}
	}
}
