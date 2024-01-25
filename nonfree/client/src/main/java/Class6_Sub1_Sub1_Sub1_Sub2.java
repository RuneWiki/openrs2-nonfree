import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class6_Sub1_Sub1_Sub1_Sub2 extends Class6_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!qi", name = "hd", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!qi", name = "kd", descriptor = "I")
	public int anInt7439;

	@OriginalMember(owner = "client!qi", name = "rd", descriptor = "I")
	public int anInt7445;

	@OriginalMember(owner = "client!qi", name = "zd", descriptor = "Lclient!kn;")
	public Class194 aClass194_1;

	@OriginalMember(owner = "client!qi", name = "Dd", descriptor = "I")
	private int anInt7455;

	@OriginalMember(owner = "client!qi", name = "Id", descriptor = "Ljava/lang/String;")
	public String aString67;

	@OriginalMember(owner = "client!qi", name = "Vc", descriptor = "Z")
	public boolean aBoolean574 = false;

	@OriginalMember(owner = "client!qi", name = "jd", descriptor = "I")
	public int anInt7438 = -1;

	@OriginalMember(owner = "client!qi", name = "ed", descriptor = "I")
	public int anInt7435 = -1;

	@OriginalMember(owner = "client!qi", name = "Sc", descriptor = "B")
	private byte aByte102 = 0;

	@OriginalMember(owner = "client!qi", name = "dd", descriptor = "I")
	public int anInt7434 = -1;

	@OriginalMember(owner = "client!qi", name = "gd", descriptor = "B")
	private byte aByte103 = 0;

	@OriginalMember(owner = "client!qi", name = "Rc", descriptor = "I")
	public int anInt7426 = -1;

	@OriginalMember(owner = "client!qi", name = "cd", descriptor = "Z")
	public boolean aBoolean575 = false;

	@OriginalMember(owner = "client!qi", name = "Yc", descriptor = "I")
	public int anInt7430 = 0;

	@OriginalMember(owner = "client!qi", name = "sd", descriptor = "Z")
	public boolean aBoolean576 = false;

	@OriginalMember(owner = "client!qi", name = "xd", descriptor = "I")
	public int anInt7450 = 0;

	@OriginalMember(owner = "client!qi", name = "Hd", descriptor = "I")
	public int anInt7459 = -1;

	@OriginalMember(owner = "client!qi", name = "fd", descriptor = "I")
	public int anInt7436 = -1;

	@OriginalMember(owner = "client!qi", name = "vd", descriptor = "I")
	public int anInt7448 = -1;

	@OriginalMember(owner = "client!qi", name = "Kd", descriptor = "B")
	private byte aByte104 = 0;

	@OriginalMember(owner = "client!qi", name = "yd", descriptor = "I")
	public int anInt7451 = -1;

	@OriginalMember(owner = "client!qi", name = "ud", descriptor = "I")
	public int anInt7447 = 0;

	@OriginalMember(owner = "client!qi", name = "Md", descriptor = "I")
	public int anInt7461 = 0;

	@OriginalMember(owner = "client!qi", name = "Ld", descriptor = "Z")
	public boolean aBoolean577 = false;

	@OriginalMember(owner = "client!qi", name = "Gd", descriptor = "I")
	public int anInt7458 = 0;

	@OriginalMember(owner = "client!qi", name = "Od", descriptor = "I")
	public int anInt7462 = 255;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
		if (this.aClass194_1 == null || !super.aBoolean572 && !this.method6172(arg0, 0)) {
			return;
		}
		@Pc(20) Class68 local20 = arg0.method6222();
		local20.o(super.aClass186_7.method4106());
		local20.U(super.anInt8761, super.anInt8759 - 5, super.anInt8764);
		this.method6162(local20, super.aBoolean572, arg0, super.aClass66Array3);
		super.aClass66Array3[0] = super.aClass66Array3[1] = super.aClass66Array3[2] = null;
	}

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method7330() {
		return false;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!da;IILclient!q;IIILclient!r;)V")
	private void method6171(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class68 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class100 arg7) {
		@Pc(11) int local11 = arg0 * arg0 + arg5 * arg5;
		if (local11 < 262144 || arg3 < local11) {
			return;
		}
		@Pc(41) int local41 = (int) (Math.atan2((double) arg0, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(53) Class66 local53 = Static494.method6902(arg6, super.anInt7396, arg7, super.anInt7345, local41, super.anInt7363);
		if (local53 != null) {
			arg7.ZA(false);
			local53.method7556(arg4, null, arg2, 0);
			arg7.ZA(true);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLclient!r;I)Z")
	private boolean method6172(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class54 local11 = this.method6168();
		@Pc(29) Class84 local29 = super.anInt7370 != -1 && super.anInt7406 == 0 ? Static116.aClass140_2.method3287(super.anInt7370) : null;
		@Pc(49) Class84 local49 = super.anInt7419 == -1 || this.aBoolean577 || super.aBoolean569 && local29 != null ? null : Static116.aClass140_2.method3287(super.anInt7419);
		@Pc(52) int local52 = local11.anInt1388;
		@Pc(55) int local55 = local11.anInt1422;
		if (local52 != 0 || local55 != 0 || local11.anInt1414 != 0 || local11.anInt1403 != 0) {
			arg1 |= 0x7;
		}
		@Pc(90) boolean local90 = super.aByte101 != 0 && Static412.anInt575 >= super.anInt7417 && super.anInt7373 > Static412.anInt575;
		if (local90) {
			arg1 |= 0x80000;
		}
		@Pc(131) Class66 local131 = super.aClass66Array3[0] = this.aClass194_1.method4220(Static8.aClass57_1, Static116.aClass140_2, arg1, Static296.aClass218_1, local29, Static254.aClass202_2, super.aClass19Array3, Static70.aClass78_1, super.anInt7400, super.anInt7399, local49, super.anInt7416, super.anInt7349, super.anInt7379, Static207.aClass354_1, arg0, super.anInt7409);
		@Pc(134) int local134 = Static467.method6571();
		if (Static440.anInt7756 < 96 && local134 > 50) {
			Static192.method3653();
		}
		@Pc(167) int local167;
		if (Static207.aClass258_3 != Static375.aClass258_6 && local134 < 50) {
			local167 = 50 - local134;
			while (local167 > Static232.anInt4325) {
				Static199.aByteArrayArray16[Static232.anInt4325] = new byte[102400];
				Static232.anInt4325++;
			}
			while (Static232.anInt4325 > local167) {
				Static232.anInt4325--;
				Static199.aByteArrayArray16[Static232.anInt4325] = null;
			}
		} else if (Static375.aClass258_6 != Static207.aClass258_3) {
			Static232.anInt4325 = 0;
			Static199.aByteArrayArray16 = new byte[50][];
		}
		if (local131 == null) {
			return false;
		}
		super.anInt7418 = local131.J();
		super.anInt7394 = local131.RA();
		this.method6170(local131);
		local167 = super.aClass186_7.method4106();
		if (local52 == 0 && local55 == 0) {
			this.method6161(local167, this.method6165() << 9, 0, this.method6165() << 9, 0);
		} else {
			this.method6161(local167, local52, local11.anInt1404, local55, local11.anInt1420);
			if (super.anInt7396 != 0) {
				local131.MA(super.anInt7396);
			}
			if (super.anInt7345 != 0) {
				local131.W(super.anInt7345);
			}
			if (super.anInt7363 != 0) {
				local131.oa(0, super.anInt7363, 0);
			}
		}
		if (local90) {
			local131.method7548(super.aByte98, super.aByte99, super.aByte100, super.aByte101 & 0xFF);
		}
		@Pc(309) Class167 local309;
		@Pc(329) boolean local329;
		@Pc(331) int local331;
		@Pc(377) Class66 local377;
		if (this.aBoolean577 || super.anInt7368 == -1 || super.anInt7402 == -1) {
			super.aClass66Array3[1] = null;
		} else {
			local309 = Static215.aClass33_1.method587(super.anInt7368);
			local329 = local309.aByte59 == 3 && (local52 != 0 || local55 != 0);
			local331 = local7;
			if (local329) {
				local331 = local7 | 0x7;
			} else {
				if (super.anInt7354 != 0) {
					local331 = local7 | 0x5;
				}
				if (super.anInt7384 != 0) {
					local331 |= 0x2;
				}
			}
			local377 = super.aClass66Array3[1] = local309.method3642(super.anInt7383, arg0, Static116.aClass140_2, super.anInt7402, local331, super.anInt7364);
			if (local377 != null) {
				if (super.anInt7384 != 0) {
					local377.oa(0, -super.anInt7384 << 2, 0);
				}
				if (super.anInt7354 != 0) {
					local377.M(super.anInt7354 * 2048);
				}
				if (local329) {
					if (super.anInt7396 != 0) {
						local377.MA(super.anInt7396);
					}
					if (super.anInt7345 != 0) {
						local377.W(super.anInt7345);
					}
					if (super.anInt7363 != 0) {
						local377.oa(0, super.anInt7363, 0);
					}
				}
			}
		}
		if (this.aBoolean577 || super.anInt7356 == -1 || super.anInt7360 == -1) {
			super.aClass66Array3[2] = null;
		} else {
			local309 = Static215.aClass33_1.method587(super.anInt7356);
			local329 = local309.aByte59 == 3 && (local52 != 0 || local55 != 0);
			local331 = local7;
			if (local329) {
				local331 = local7 | 0x7;
			} else {
				if (super.anInt7393 != 0) {
					local331 = local7 | 0x5;
				}
				if (super.anInt7341 != 0) {
					local331 |= 0x2;
				}
			}
			local377 = super.aClass66Array3[2] = local309.method3643(Static116.aClass140_2, arg0, super.anInt7343, local331, super.anInt7360, super.anInt7407);
			if (local377 != null) {
				if (super.anInt7341 != 0) {
					local377.oa(0, -super.anInt7341 << 2, 0);
				}
				if (super.anInt7393 != 0) {
					local377.M(super.anInt7393 * 2048);
				}
				if (local329) {
					if (super.anInt7396 != 0) {
						local377.MA(super.anInt7396);
					}
					if (super.anInt7345 != 0) {
						local377.W(super.anInt7345);
					}
					if (super.anInt7363 != 0) {
						local377.oa(0, super.anInt7363, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIII)V")
	public void method6173(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7370 != -1 && Static116.aClass140_2.method3287(super.anInt7370).anInt2059 == 1) {
			super.anInt7370 = -1;
			super.anIntArray507 = null;
		}
		@Pc(39) Class167 local39;
		if (super.anInt7368 != -1) {
			local39 = Static215.aClass33_1.method587(super.anInt7368);
			if (local39.aBoolean352 && local39.anInt4374 != -1 && Static116.aClass140_2.method3287(local39.anInt4374).anInt2059 == 1) {
				super.anInt7368 = -1;
			}
		}
		if (super.anInt7356 != -1) {
			local39 = Static215.aClass33_1.method587(super.anInt7356);
			if (local39.aBoolean352 && local39.anInt4374 != -1 && Static116.aClass140_2.method3287(local39.anInt4374).anInt2059 == 1) {
				super.anInt7356 = -1;
			}
		}
		this.anInt7434 = -1;
		if (arg2 < 0 || Static188.anInt3850 <= arg2 || arg1 < 0 || Static49.anInt1174 <= arg1) {
			this.method6182(arg2, arg1);
		} else if (super.anIntArray510[0] >= 0 && Static188.anInt3850 > super.anIntArray510[0] && super.anIntArray509[0] >= 0 && Static49.anInt1174 > super.anIntArray509[0]) {
			if (arg0 == 2) {
				Static371.method5505(arg1, this, arg2);
			}
			this.method6177(arg2, arg0, arg1);
		} else {
			this.method6182(arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method6174() {
		@Pc(12) String local12 = "";
		if (Static288.aStringArray86 != null) {
			local12 = local12 + Static288.aStringArray86[this.aByte102];
		}
		@Pc(36) int[] local36;
		if (this.aByte104 == 1 && Static565.anIntArray669 != null) {
			local36 = Static565.anIntArray669;
		} else {
			local36 = Static225.anIntArray268;
		}
		if (local36 != null && local36[this.aByte102] != -1) {
			@Pc(56) Class309 local56 = Static522.aClass217_1.method5012(local36[this.aByte102]);
			if (local56.aChar3 == 's') {
				local12 = local12 + local56.method6908(this.aByte103 & 0xFF);
			} else {
				Static58.method946("gdn1", new Throwable());
				local36[this.aByte102] = -1;
			}
		}
		local12 = local12 + this.aString66;
		if (Static351.aStringArray111 != null) {
			local12 = local12 + Static351.aStringArray111[this.aByte102];
		}
		return local12;
	}

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "(I)Z")
	public boolean method6175() {
		return this.aClass194_1 != null;
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
	@Override
	public void method7322() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		if (this.aClass194_1 == null || !this.method6172(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class68 local19 = arg0.method6222();
		@Pc(24) int local24 = super.aClass186_7.method4106();
		local19.o(local24);
		@Pc(42) Class346 local42 = Static389.aClass346ArrayArrayArray2[super.aByte112][super.anInt8761 >> Static134.anInt2822][super.anInt8764 >> Static134.anInt2822];
		@Pc(69) int local69;
		if (local42 == null || local42.aClass6_Sub1_Sub2_1 == null) {
			super.anInt7355 = (int) ((float) super.anInt7355 - (float) super.anInt7355 / 10.0F);
		} else {
			local69 = super.anInt7355 - local42.aClass6_Sub1_Sub2_1.aShort96;
			super.anInt7355 = (int) ((float) super.anInt7355 - (float) local69 / 10.0F);
		}
		local19.U(super.anInt8761, super.anInt8759 - super.anInt7355 - 20, super.anInt8764);
		super.aBoolean573 = false;
		if (Static72.aClass2_Sub12_Sub1_1.aBoolean155) {
			@Pc(104) Class54 local104 = this.method6168();
			if (local104.aBoolean104 && (this.aClass194_1.anInt5062 == -1 || Static254.aClass202_2.method4488(this.aClass194_1.anInt5062).aBoolean191)) {
				@Pc(138) Class84 local138 = super.anInt7370 != -1 && super.anInt7406 == 0 ? Static116.aClass140_2.method3287(super.anInt7370) : null;
				@Pc(159) Class84 local159 = super.anInt7419 == -1 || this.aBoolean577 || super.aBoolean569 && local138 != null ? null : Static116.aClass140_2.method3287(super.anInt7419);
				@Pc(191) Class66 local191 = Static61.method964(240, local24, super.aClass66Array3[0], 160, 0, 1, super.anInt7345, arg0, 0, super.anInt7396, super.anInt7363, local159 == null ? super.anInt7416 : super.anInt7379, local159 == null ? local138 : local159);
				if (local191 != null) {
					super.aBoolean573 = true;
					arg0.ZA(false);
					if (Static338.aBoolean493) {
						local191.method7556(local19, null, Static401.anInt6991, 0);
					} else {
						local191.method7558(local19, null, 0);
					}
					arg0.ZA(true);
				}
			}
		}
		if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == this) {
			local19.NA(super.anInt8761, super.anInt8759, super.anInt8764);
			for (local69 = Static134.aClass246Array1.length - 1; local69 >= 0; local69--) {
				@Pc(239) Class246 local239 = Static134.aClass246Array1[local69];
				if (local239 != null && local239.anInt6843 != -1) {
					@Pc(269) int local269;
					if (local239.anInt6838 == 1) {
						@Pc(258) Class2_Sub32 local258 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local239.anInt6841);
						if (local258 != null) {
							@Pc(263) Class6_Sub1_Sub1_Sub1_Sub1 local263 = local258.aClass6_Sub1_Sub1_Sub1_Sub1_1;
							local269 = local263.anInt8761 - Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761;
							@Pc(275) int local275 = local263.anInt8764 - Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764;
							if (Static338.aBoolean493) {
								this.method6171(local269, super.aClass66Array3[0], Static401.anInt6991, 92160000, local19, local275, local239.anInt6843, arg0);
							} else {
								this.method6179(local275, local239.anInt6843, super.aClass66Array3[0], 92160000, local269, arg0, local19);
							}
						}
					}
					@Pc(330) int local330;
					if (local239.anInt6838 == 2) {
						@Pc(321) int local321 = local239.anInt6849 + 256 - Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761;
						local330 = local239.anInt6844 + 256 - Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764;
						local269 = local239.anInt6842 << 9;
						local269 *= local269;
						if (Static338.aBoolean493) {
							this.method6171(local321, super.aClass66Array3[0], Static401.anInt6991, local269, local19, local330, local239.anInt6843, arg0);
						} else {
							this.method6179(local330, local239.anInt6843, super.aClass66Array3[0], local269, local321, arg0, local19);
						}
					}
					if (local239.anInt6838 == 10 && local239.anInt6841 >= 0 && Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1.length > local239.anInt6841) {
						@Pc(398) Class6_Sub1_Sub1_Sub1_Sub2 local398 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local239.anInt6841];
						if (local398 != null) {
							local330 = local398.anInt8761 - Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761;
							local269 = local398.anInt8764 - Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764;
							if (Static338.aBoolean493) {
								this.method6171(local330, super.aClass66Array3[0], Static401.anInt6991, 92160000, local19, local269, local239.anInt6843, arg0);
							} else {
								this.method6179(local269, local239.anInt6843, super.aClass66Array3[0], 92160000, local330, arg0, local19);
							}
						}
					}
				}
			}
			local19.o(local24);
			local19.U(super.anInt8761, super.anInt8759, super.anInt8764);
		}
		local19.o(local24);
		local19.U(super.anInt8761, -super.anInt7355 + super.anInt8759 - 5, super.anInt8764);
		@Pc(490) Class6_Sub5 local490 = Static305.method4561(super.aClass66Array3.length);
		this.method6162(local19, false, arg0, super.aClass66Array3);
		@Pc(502) int local502;
		if (Static338.aBoolean493) {
			for (local502 = 0; local502 < super.aClass66Array3.length; local502++) {
				if (super.aClass66Array3[local502] != null) {
					super.aClass66Array3[local502].method7556(local19, local490.aClass6_Sub6Array1[local502], Static401.anInt6991, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
				}
			}
		} else {
			for (local502 = 0; local502 < super.aClass66Array3.length; local502++) {
				if (super.aClass66Array3[local502] != null) {
					super.aClass66Array3[local502].method7558(local19, local490.aClass6_Sub6Array1[local502], Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
				}
			}
		}
		if (super.aClass6_Sub8_7 != null) {
			@Pc(576) Class164 local576 = super.aClass6_Sub8_7.method7161();
			if (Static338.aBoolean493) {
				arg0.method6257(local576, Static401.anInt6991);
			} else {
				arg0.method6193(local576);
			}
		}
		for (local502 = 0; super.aClass66Array3.length > local502; local502++) {
			if (super.aClass66Array3[local502] != null) {
				super.aBoolean573 |= super.aClass66Array3[local502].LA();
			}
		}
		super.aClass66Array3[0] = super.aClass66Array3[1] = super.aClass66Array3[2] = null;
		super.anInt7389 = Static485.anInt8225;
		return local490;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBIZ)V")
	public void method6177(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		if (super.anInt7424 < 9) {
			super.anInt7424++;
		}
		for (@Pc(18) int local18 = super.anInt7424; local18 > 0; local18--) {
			super.anIntArray510[local18] = super.anIntArray510[local18 - 1];
			super.anIntArray509[local18] = super.anIntArray509[local18 - 1];
			super.aByteArray73[local18] = super.aByteArray73[local18 - 1];
		}
		super.anIntArray510[0] = arg0;
		super.aByteArray73[0] = arg1;
		super.anIntArray509[0] = arg2;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method6178() {
		return this.aString67;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!da;IIILclient!r;Lclient!q;)V")
	private void method6179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class100 arg5, @OriginalArg(7) Class68 arg6) {
		@Pc(17) int local17 = arg0 * arg0 + arg4 * arg4;
		if (local17 < 262144 || arg3 < local17) {
			return;
		}
		@Pc(41) int local41 = (int) (Math.atan2((double) arg4, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(53) Class66 local53 = Static494.method6902(arg1, super.anInt7396, arg5, super.anInt7345, local41, super.anInt7363);
		if (local53 != null) {
			arg5.ZA(false);
			local53.method7558(arg6, null, 0);
			arg5.ZA(true);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)I")
	@Override
	public int method6158() {
		return -1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!es;)V")
	public void method6180(@OriginalArg(1) Class2_Sub15 arg0) {
		arg0.anInt5241 = 0;
		@Pc(12) int local12 = arg0.method4325();
		this.aByte104 = (byte) (local12 & 0x1);
		@Pc(21) boolean local21 = this.aBoolean576;
		this.aBoolean576 = (local12 & 0x2) != 0;
		@Pc(41) boolean local41 = (local12 & 0x4) != 0;
		@Pc(45) int local45 = super.method6165();
		this.method6156((local12 >> 3 & 0x7) + 1);
		this.aByte102 = (byte) (local12 >> 6 & 0x3);
		super.anInt8761 += this.method6165() - local45 << 8;
		super.anInt8764 += this.method6165() - local45 << 8;
		this.aByte103 = arg0.method4304();
		this.anInt7459 = arg0.method4304();
		this.anInt7448 = arg0.method4304();
		this.anInt7458 = 0;
		@Pc(110) int local110 = -1;
		@Pc(113) int[] local113 = new int[12];
		@Pc(135) int local135;
		@Pc(141) int local141;
		@Pc(183) int local183;
		for (@Pc(115) int local115 = 0; local115 < 12; local115++) {
			@Pc(121) int local121 = arg0.method4325();
			if (local121 == 0) {
				local113[local115] = 0;
			} else {
				local135 = arg0.method4325();
				local141 = (local121 << 8) + local135;
				if (local115 == 0 && local141 == 65535) {
					local110 = arg0.method4294();
					this.anInt7458 = arg0.method4325();
					break;
				}
				if (local141 >= 32768) {
					local141 = Static287.anIntArray363[local141 - 32768];
					local113[local115] = local141 | 0x40000000;
					local183 = Static296.aClass218_1.method5067(local141).anInt8996;
					if (local183 != 0) {
						this.anInt7458 = local183;
					}
				} else {
					local113[local115] = Integer.MIN_VALUE | local141 - 256;
				}
			}
		}
		@Pc(210) int[] local210 = new int[5];
		for (local135 = 0; local135 < 5; local135++) {
			local141 = arg0.method4325();
			if (Static65.aShortArrayArrayArray1.length < 1 || local141 < 0 || local141 >= Static65.aShortArrayArrayArray1[0][local135].length) {
				local141 = 0;
			}
			local210[local135] = local141;
		}
		this.anInt7455 = arg0.method4294();
		this.aString66 = arg0.method4324();
		this.aString67 = this.aString66;
		this.anInt7430 = arg0.method4325();
		if (local41) {
			this.anInt7447 = arg0.method4294();
			if (this.anInt7447 == 65535) {
				this.anInt7447 = -1;
			}
			this.anInt7435 = -1;
			this.anInt7461 = this.anInt7430;
		} else {
			this.anInt7447 = 0;
			this.anInt7461 = arg0.method4325();
			this.anInt7435 = arg0.method4325();
			if (this.anInt7435 == 255) {
				this.anInt7435 = -1;
			}
		}
		local141 = this.anInt7450;
		this.anInt7450 = arg0.method4325();
		@Pc(339) int local339;
		if (this.anInt7450 == 0) {
			Static255.method3969(this);
		} else {
			local183 = this.anInt7426;
			@Pc(336) int local336 = this.anInt7451;
			local339 = this.anInt7436;
			@Pc(342) int local342 = this.anInt7438;
			@Pc(345) int local345 = this.anInt7462;
			this.anInt7426 = arg0.method4294();
			this.anInt7451 = arg0.method4294();
			this.anInt7436 = arg0.method4294();
			this.anInt7438 = arg0.method4294();
			this.anInt7462 = arg0.method4325();
			if (local21 != this.aBoolean576 || this.anInt7450 != local141 || local183 != this.anInt7426 || this.anInt7451 != local336 || this.anInt7436 != local339 || local342 != this.anInt7438 || this.anInt7462 != local345) {
				Static162.method2871(this);
			}
		}
		if (this.aClass194_1 == null) {
			this.aClass194_1 = new Class194();
		}
		local183 = this.aClass194_1.anInt5062;
		@Pc(444) int[] local444 = this.aClass194_1.anIntArray347;
		this.aClass194_1.method4214(local113, this.aByte104 == 1, this.method6155(), local110, local210);
		if (local110 != local183) {
			super.anInt8761 = (super.anIntArray510[0] << 9) + (this.method6165() << 8);
			super.anInt8764 = (super.anIntArray509[0] << 9) + (this.method6165() << 8);
		}
		if (Static222.anInt4184 == super.lb && local444 != null) {
			for (local339 = 0; local339 < local210.length; local339++) {
				if (local210[local339] != local444[local339]) {
					Static296.aClass218_1.method5058();
					break;
				}
			}
		}
		if (super.aClass6_Sub8_7 != null) {
			super.aClass6_Sub8_7.method7152();
		}
		if (super.anInt7419 == -1 || !super.aBoolean569) {
			return;
		}
		@Pc(547) Class54 local547 = this.method6168();
		if (!local547.method969(super.anInt7419)) {
			super.aBoolean569 = false;
			super.anInt7419 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		if (this.aClass194_1 == null || !this.method6172(arg2, 131072)) {
			return false;
		}
		@Pc(24) Class68 local24 = arg2.method6222();
		@Pc(29) int local29 = super.aClass186_7.method4106();
		local24.o(local29);
		local24.U(super.anInt8761, super.anInt8759, super.anInt8764);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; super.aClass66Array3.length > local44; local44++) {
			if (super.aClass66Array3[local44] != null && (Static338.aBoolean493 ? super.aClass66Array3[local44].method7547(arg0, arg1, local24, true, Static401.anInt6991) : super.aClass66Array3[local44].method7541(arg0, arg1, local24, true))) {
				local42 = true;
				break;
			}
		}
		super.aClass66Array3[0] = super.aClass66Array3[1] = super.aClass66Array3[2] = null;
		return local42;
	}

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "(I)I")
	@Override
	public int method6165() {
		return this.aClass194_1 == null || this.aClass194_1.anInt5062 == -1 ? super.method6165() : Static254.aClass202_2.method4488(this.aClass194_1.anInt5062).anInt2152;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public void method6182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anIntArray510[0] = arg0;
		super.anInt7421 = 0;
		super.anInt7423 = 0;
		super.anInt7424 = 0;
		super.anIntArray509[0] = arg1;
		@Pc(28) int local28 = this.method6165();
		super.anInt8761 = super.anIntArray510[0] * 512 + local28 * 256;
		super.anInt8764 = super.anIntArray509[0] * 512 + local28 * 256;
		if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == this) {
			Static6.method168();
		}
		if (super.aClass6_Sub8_7 != null) {
			super.aClass6_Sub8_7.method7152();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)I")
	@Override
	protected int method6155() {
		return this.anInt7455;
	}
}
