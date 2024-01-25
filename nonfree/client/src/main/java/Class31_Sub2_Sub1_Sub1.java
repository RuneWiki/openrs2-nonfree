import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class31_Sub2_Sub1_Sub1 extends Class31_Sub2_Sub1 {

	@OriginalMember(owner = "client!cl", name = "Fc", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!cl", name = "Jc", descriptor = "I")
	public int anInt1295;

	@OriginalMember(owner = "client!cl", name = "Uc", descriptor = "I")
	public int anInt1306;

	@OriginalMember(owner = "client!cl", name = "Xc", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!cl", name = "ad", descriptor = "I")
	private int anInt1310;

	@OriginalMember(owner = "client!cl", name = "ed", descriptor = "Lclient!ed;")
	public Class60 aClass60_1;

	@OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
	public int anInt1286 = -1;

	@OriginalMember(owner = "client!cl", name = "Cc", descriptor = "Z")
	public boolean aBoolean70 = false;

	@OriginalMember(owner = "client!cl", name = "zc", descriptor = "I")
	public int anInt1289 = 0;

	@OriginalMember(owner = "client!cl", name = "Dc", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!cl", name = "Yc", descriptor = "I")
	public int anInt1309 = -1;

	@OriginalMember(owner = "client!cl", name = "cd", descriptor = "B")
	private byte aByte20 = 0;

	@OriginalMember(owner = "client!cl", name = "Wc", descriptor = "I")
	public int anInt1308 = -1;

	@OriginalMember(owner = "client!cl", name = "dd", descriptor = "I")
	public int anInt1312 = -1;

	@OriginalMember(owner = "client!cl", name = "fd", descriptor = "I")
	public int anInt1313 = -1;

	@OriginalMember(owner = "client!cl", name = "id", descriptor = "I")
	public int anInt1316 = -1;

	@OriginalMember(owner = "client!cl", name = "Qc", descriptor = "I")
	public int anInt1302 = 0;

	@OriginalMember(owner = "client!cl", name = "Zc", descriptor = "B")
	private byte aByte19 = 0;

	@OriginalMember(owner = "client!cl", name = "Sc", descriptor = "I")
	public int anInt1304 = 0;

	@OriginalMember(owner = "client!cl", name = "nd", descriptor = "I")
	public int anInt1320 = -1;

	@OriginalMember(owner = "client!cl", name = "kd", descriptor = "B")
	private byte aByte21 = 0;

	@OriginalMember(owner = "client!cl", name = "Ec", descriptor = "I")
	public int anInt1291 = 0;

	@OriginalMember(owner = "client!cl", name = "Hc", descriptor = "I")
	public int anInt1293 = -1;

	@OriginalMember(owner = "client!cl", name = "qd", descriptor = "I")
	public int anInt1322 = 0;

	@OriginalMember(owner = "client!cl", name = "od", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!cl", name = "ld", descriptor = "I")
	public int anInt1318 = 255;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
		if (this.aClass60_1 != null && (super.aBoolean508 || this.method1182(0, arg0))) {
			this.method5986(super.aClass105Array3, super.aBoolean508, arg0);
			super.aClass105Array3[0] = super.aClass105Array3[1] = super.aClass105Array3[2] = super.aClass105Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)I")
	@Override
	public int method5983() {
		return -1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!ya;)Z")
	private boolean method1182(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class21 local9 = this.method5982();
		@Pc(25) Class223 local25 = super.anInt7365 != -1 && super.anInt7323 == 0 ? Static293.aClass127_1.method2975(super.anInt7365) : null;
		@Pc(51) Class223 local51 = super.anInt7338 == -1 || this.aBoolean71 || super.aBoolean505 && local25 != null ? null : Static293.aClass127_1.method2975(super.anInt7338);
		@Pc(54) int local54 = local9.anInt613;
		@Pc(57) int local57 = local9.anInt593;
		if (local54 != 0 || local57 != 0 || local9.anInt633 != 0 || local9.anInt630 != 0) {
			arg0 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte103 != 0 && super.anInt7360 <= Static378.anInt4244 && super.anInt7339 > Static378.anInt4244;
		if (local97) {
			arg0 |= 0x80000;
		}
		@Pc(138) Class105 local138 = super.aClass105Array3[0] = this.aClass60_1.method1648(Static293.aClass127_1, local25, Static238.aClass116_2, super.anInt7334, super.anInt7350, super.anInt7317, arg1, Static117.aClass75_1, super.aClass225Array3, super.anInt7335, Static165.aClass19_1, super.anInt7370, local51, Static394.aClass23_1, arg0, super.anInt7320, Static184.aClass158_1);
		@Pc(141) int local141 = Static359.method4936();
		if (Static79.anInt1766 < 96 && local141 > 50) {
			Static352.method4872();
		}
		@Pc(172) int local172;
		if (Static35.aClass137_11 != Static45.aClass137_10 && local141 < 50) {
			local172 = 50 - local141;
			while (local172 > Static190.anInt3417) {
				Static287.aByteArrayArray15[Static190.anInt3417] = new byte[102400];
				Static190.anInt3417++;
			}
			while (local172 < Static190.anInt3417) {
				Static190.anInt3417--;
				Static287.aByteArrayArray15[Static190.anInt3417] = null;
			}
		} else if (Static45.aClass137_10 != Static35.aClass137_11) {
			Static287.aByteArrayArray15 = new byte[50][];
			Static190.anInt3417 = 0;
		}
		if (local138 == null) {
			return false;
		}
		super.anInt7309 = local138.MA();
		this.method5994(local138);
		local172 = super.aClass98_7.method2351();
		if (local54 == 0 && local57 == 0) {
			this.method5990(local172, this.method5989() << 7, this.method5989() << 7, 0, 0);
		} else {
			this.method5990(local172, local54, local57, local9.anInt618, local9.anInt604);
			if (super.anInt7373 != 0) {
				local138.Z(super.anInt7373);
			}
			if (super.anInt7346 != 0) {
				local138.R(super.anInt7346);
			}
			if (super.anInt7355 != 0) {
				local138.JA(0, super.anInt7355, 0);
			}
		}
		if (local97) {
			local138.method3537(super.aByte102, super.aByte104, super.aByte105, super.aByte103 & 0xFF);
		}
		@Pc(324) Class38 local324;
		@Pc(339) boolean local339;
		@Pc(341) int local341;
		@Pc(386) Class105 local386;
		if (this.aBoolean71 || super.anInt7321 == -1 || super.anInt7357 == -1) {
			super.aClass105Array3[1] = null;
		} else {
			local324 = Static67.aClass263_2.method5782(super.anInt7321);
			local339 = local324.aByte3 == 3 && (local54 != 0 || local57 != 0);
			local341 = local5;
			if (local339) {
				local341 = local5 | 0x7;
			} else {
				if (super.anInt7307 != 0) {
					local341 = local5 | 0x5;
				}
				if (super.anInt7374 != 0) {
					local341 |= 0x2;
				}
			}
			local386 = super.aClass105Array3[1] = local324.method918(super.anInt7357, super.anInt7314, super.anInt7367, local341, arg1, Static293.aClass127_1);
			if (local386 != null) {
				if (super.anInt7374 != 0) {
					local386.JA(0, -super.anInt7374 << 0, 0);
				}
				if (super.anInt7307 != 0) {
					local386.Q(super.anInt7307 * 2048);
				}
				if (local339) {
					if (super.anInt7373 != 0) {
						local386.Z(super.anInt7373);
					}
					if (super.anInt7346 != 0) {
						local386.R(super.anInt7346);
					}
					if (super.anInt7355 != 0) {
						local386.JA(0, super.anInt7355, 0);
					}
				}
			}
		}
		if (this.aBoolean71 || super.anInt7368 == -1 || super.anInt7371 == -1) {
			super.aClass105Array3[3] = null;
		} else {
			local324 = Static67.aClass263_2.method5782(super.anInt7368);
			local339 = local324.aByte3 == 3 && (local54 != 0 || local57 != 0);
			local341 = local5;
			if (local339) {
				local341 = local5 | 0x7;
			} else {
				if (super.anInt7318 != 0) {
					local341 = local5 | 0x5;
				}
				if (super.anInt7311 != 0) {
					local341 |= 0x2;
				}
			}
			local386 = super.aClass105Array3[3] = local324.method913(super.anInt7315, local341, Static293.aClass127_1, super.anInt7371, arg1, super.anInt7356);
			if (local386 != null) {
				if (super.anInt7311 != 0) {
					local386.JA(0, -super.anInt7311 << 0, 0);
				}
				if (super.anInt7318 != 0) {
					local386.Q(super.anInt7318 * 2048);
				}
				if (local339) {
					if (super.anInt7373 != 0) {
						local386.Z(super.anInt7373);
					}
					if (super.anInt7346 != 0) {
						local386.R(super.anInt7346);
					}
					if (super.anInt7355 != 0) {
						local386.JA(0, super.anInt7355, 0);
					}
				}
			}
		}
		super.aClass105Array3[2] = null;
		if (!this.aBoolean71 && super.aClass1_Sub28_3 != null) {
			if (Static378.anInt4244 >= super.aClass1_Sub28_3.anInt4397) {
				super.aClass1_Sub28_3 = null;
			} else if (super.aClass1_Sub28_3.anInt4383 <= Static378.anInt4244) {
				@Pc(621) Class105 local621 = super.aClass1_Sub28_3.method3622(arg1, local5 | 0x7);
				if (local621 != null) {
					local621.JA(-super.anInt7300 + super.aClass1_Sub28_3.anInt4392, super.aClass1_Sub28_3.anInt4386 - super.anInt7296, super.aClass1_Sub28_3.anInt4393 - super.anInt7298);
					if (local172 != 0) {
						local621.Q(-local172 & 0x3FFF);
					}
					super.aClass105Array3[2] = local621;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIBB)V")
	public void method1183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (super.anInt7378 < 9) {
			super.anInt7378++;
		}
		for (@Pc(20) int local20 = super.anInt7378; local20 > 0; local20--) {
			super.anIntArray658[local20] = super.anIntArray658[local20 - 1];
			super.anIntArray657[local20] = super.anIntArray657[local20 - 1];
			super.aByteArray96[local20] = super.aByteArray96[local20 - 1];
		}
		super.anIntArray658[0] = arg1;
		super.anIntArray657[0] = arg0;
		super.aByteArray96[0] = arg2;
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
	@Override
	public int method5989() {
		return this.aClass60_1 == null || this.aClass60_1.anInt1900 == -1 ? super.method5989() : Static238.aClass116_2.method2822(this.aClass60_1.anInt1900).anInt1728;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cl", name = "h", descriptor = "(B)Z")
	public boolean method1184() {
		return this.aClass60_1 != null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass60_1 == null || !this.method1182(131072, arg0)) {
			return false;
		}
		@Pc(17) Class33 local17 = arg0.method4516();
		@Pc(22) int local22 = super.aClass98_7.method2351();
		local17.ra(local22);
		local17.o(super.anInt7300, super.anInt7296, super.anInt7298);
		@Pc(35) boolean local35 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass105Array3.length; local44++) {
			if (super.aClass105Array3[local44] != null && super.aClass105Array3[local44].method3526(arg2, arg1, local17, true)) {
				local35 = true;
				break;
			}
		}
		super.aClass105Array3[0] = super.aClass105Array3[1] = super.aClass105Array3[2] = super.aClass105Array3[3] = null;
		return local35;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZII)V")
	public void method1185(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.anInt7380 = 0;
		super.anInt7379 = 0;
		super.anIntArray658[0] = arg1;
		super.anInt7378 = 0;
		super.anIntArray657[0] = arg0;
		@Pc(26) int local26 = this.method5989();
		super.anInt7300 = local26 * 64 + super.anIntArray658[0] * 128;
		super.anInt7298 = super.anIntArray657[0] * 128 + local26 * 64;
		if (Static452.aClass31_Sub2_Sub1_Sub1_2 == this) {
			Static355.method4889();
		}
		if (super.aClass4_Sub7_7 != null) {
			super.aClass4_Sub7_7.method3773();
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method1186() {
		@Pc(10) String local10 = "";
		if (Static380.aStringArray40 != null) {
			local10 = local10 + Static380.aStringArray40[this.aByte20];
		}
		@Pc(34) int[] local34;
		if (this.aByte21 == 1 && Static317.anIntArray499 != null) {
			local34 = Static317.anIntArray499;
		} else {
			local34 = Static425.anIntArray616;
		}
		if (local34 != null && local34[this.aByte20] != -1) {
			@Pc(54) Class165 local54 = Static389.aClass242_1.method5431(local34[this.aByte20]);
			if (local54.aChar2 == 's') {
				local10 = local10 + local54.method3794(this.aByte19 & 0xFF);
			} else {
				Static158.method2570(new Throwable(), "gdn1");
				local34[this.aByte20] = -1;
			}
		}
		local10 = local10 + this.aString9;
		if (Static112.aStringArray16 != null) {
			local10 = local10 + Static112.aStringArray16[this.aByte20];
		}
		return local10;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		if (this.aClass60_1 == null || !this.method1182(2048, arg0)) {
			return null;
		}
		@Pc(26) Class33 local26 = arg0.method4516();
		@Pc(31) int local31 = super.aClass98_7.method2351();
		local26.ra(local31);
		local26.o(super.anInt7300, super.anInt7296, super.anInt7298);
		@Pc(45) float local45 = arg0.W();
		@Pc(48) float local48 = arg0.xa();
		if (Static38.aClass135_Sub1_1.aBoolean364) {
			@Pc(55) Class21 local55 = this.method5982();
			if (local55.aBoolean27 && (this.aClass60_1.anInt1900 == -1 || Static238.aClass116_2.method2822(this.aClass60_1.anInt1900).aBoolean94)) {
				@Pc(88) Class223 local88 = super.anInt7365 != -1 && super.anInt7323 == 0 ? Static293.aClass127_1.method2975(super.anInt7365) : null;
				@Pc(109) Class223 local109 = super.anInt7338 == -1 || this.aBoolean71 || super.aBoolean505 && local88 != null ? null : Static293.aClass127_1.method2975(super.anInt7338);
				@Pc(143) Class105 local143 = Static155.method2550(1, super.anInt7355, super.aBoolean507, 160, 240, super.anInt7373, local109 == null ? local88 : local109, arg0, local109 == null ? super.anInt7350 : super.anInt7335, local31, super.anInt7346, super.aClass105Array3[0], 0, 0);
				if (local143 != null) {
					arg0.g(local45, local48 - 128.0F);
					arg0.method4504(false);
					local143.method3534(local26, null, 0);
					arg0.method4504(true);
				}
			}
		}
		if (Static452.aClass31_Sub2_Sub1_Sub1_2 == this) {
			arg0.g(local45, local48 - 144.0F);
			local26.j(super.anInt7300, super.anInt7296, super.anInt7298);
			for (@Pc(184) int local184 = Static353.aClass83Array2.length - 1; local184 >= 0; local184--) {
				@Pc(190) Class83 local190 = Static353.aClass83Array2[local184];
				if (local190 != null && local190.anInt2465 != -1) {
					@Pc(231) int local231;
					@Pc(225) int local225;
					if (local190.anInt2462 == 1 && local190.anInt2459 >= 0 && Static98.aClass31_Sub2_Sub1_Sub2Array1.length > local190.anInt2459) {
						@Pc(216) Class31_Sub2_Sub1_Sub2 local216 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local190.anInt2459];
						if (local216 != null) {
							local225 = local216.anInt7300 - Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300;
							local231 = local216.anInt7298 - Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298;
							this.method1190(local225, 5760000, super.aClass105Array3[0], local190.anInt2465, local26, arg0, local231);
						}
					}
					if (local190.anInt2462 == 2) {
						@Pc(257) int local257 = local190.anInt2457 + 64 - Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300;
						local225 = local190.anInt2463 + 64 - Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298;
						local231 = local190.anInt2466 << 7;
						local231 *= local231;
						this.method1190(local257, local231, super.aClass105Array3[0], local190.anInt2465, local26, arg0, local225);
					}
					if (local190.anInt2462 == 10 && local190.anInt2459 >= 0 && local190.anInt2459 < Static458.aClass31_Sub2_Sub1_Sub1Array1.length) {
						@Pc(309) Class31_Sub2_Sub1_Sub1 local309 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local190.anInt2459];
						if (local309 != null) {
							local225 = local309.anInt7300 - Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300;
							local231 = local309.anInt7298 - Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298;
							this.method1190(local225, 5760000, super.aClass105Array3[0], local190.anInt2465, local26, arg0, local231);
						}
					}
				}
			}
			local26.ra(local31);
			local26.o(super.anInt7300, super.anInt7296, super.anInt7298);
		}
		arg0.g(local45, local48);
		@Pc(366) Class4_Sub1 local366 = Static241.method3635(super.aClass105Array3.length);
		if (super.aClass4_Sub7_7 == null) {
			arg0.method4497(super.aClass105Array3, local26, local366.aClass4_Sub5Array1, Static452.aClass31_Sub2_Sub1_Sub1_2 == this ? 1 : 0);
		} else {
			@Pc(373) Class140 local373 = super.aClass4_Sub7_7.method3777();
			arg0.method4502(super.aClass105Array3, local373, local26, local366.aClass4_Sub5Array1, Static452.aClass31_Sub2_Sub1_Sub1_2 == this ? 1 : 0);
		}
		this.method5986(super.aClass105Array3, false, arg0);
		if (super.aClass105Array3[2] != null) {
			if (local31 != 0) {
				super.aClass105Array3[2].Q(local31);
			}
			super.aClass105Array3[2].JA(super.anInt7300 - super.aClass1_Sub28_3.anInt4392, super.anInt7296 + -super.aClass1_Sub28_3.anInt4386, super.anInt7298 - super.aClass1_Sub28_3.anInt4393);
		}
		super.anInt7343 = Static244.anInt4494;
		super.aClass105Array3[0] = super.aClass105Array3[1] = super.aClass105Array3[2] = super.aClass105Array3[3] = null;
		return local366;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLclient!hp;)V")
	public void method1188(@OriginalArg(1) Class1_Sub5 arg0) {
		arg0.anInt6475 = 0;
		@Pc(12) int local12 = arg0.method5366();
		this.aByte21 = (byte) (local12 & 0x1);
		@Pc(26) boolean local26 = (local12 & 0x2) != 0;
		@Pc(34) boolean local34 = (local12 & 0x4) != 0;
		@Pc(38) int local38 = super.method5989();
		this.method5979((local12 >> 3 & 0x7) + 1);
		this.aByte20 = (byte) (local12 >> 6 & 0x3);
		super.anInt7300 += this.method5989() - local38 << 6;
		super.anInt7298 += this.method5989() - local38 << 6;
		this.aByte19 = arg0.method5416();
		this.anInt1286 = arg0.method5416();
		this.anInt1316 = arg0.method5416();
		this.anInt1302 = 0;
		@Pc(109) int local109 = -1;
		@Pc(112) int[] local112 = new int[12];
		@Pc(132) int local132;
		@Pc(138) int local138;
		@Pc(177) int local177;
		for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
			@Pc(120) int local120 = arg0.method5366();
			if (local120 == 0) {
				local112[local114] = 0;
			} else {
				local132 = arg0.method5366();
				local138 = local132 + (local120 << 8);
				if (local114 == 0 && local138 == 65535) {
					local109 = arg0.method5362();
					this.anInt1302 = arg0.method5366();
					break;
				}
				if (local138 >= 32768) {
					local138 = Static302.anIntArray450[local138 - 32768];
					local112[local114] = local138 | 0x40000000;
					local177 = Static165.aClass19_1.method560(local138).anInt4204;
					if (local177 != 0) {
						this.anInt1302 = local177;
					}
				} else {
					local112[local114] = Integer.MIN_VALUE | local138 - 256;
				}
			}
		}
		@Pc(199) int[] local199 = new int[5];
		for (local132 = 0; local132 < 5; local132++) {
			local138 = arg0.method5366();
			if (local138 < 0 || Static191.aShortArrayArray5[local132].length <= local138) {
				local138 = 0;
			}
			local199[local132] = local138;
		}
		this.anInt1310 = arg0.method5362();
		this.aString9 = arg0.method5401();
		if (local26) {
			this.aString10 = arg0.method5401();
		} else {
			this.aString10 = this.aString9;
		}
		this.anInt1289 = arg0.method5366();
		if (local34) {
			this.anInt1322 = arg0.method5362();
			this.anInt1309 = -1;
			this.anInt1304 = this.anInt1289;
		} else {
			this.anInt1322 = 0;
			this.anInt1304 = arg0.method5366();
			this.anInt1309 = arg0.method5366();
			if (this.anInt1309 == 255) {
				this.anInt1309 = -1;
			}
		}
		local138 = this.anInt1291;
		this.anInt1291 = arg0.method5366();
		@Pc(323) int local323;
		if (this.anInt1291 == 0) {
			Static87.method1623(this);
		} else {
			local177 = this.anInt1312;
			@Pc(320) int local320 = this.anInt1320;
			local323 = this.anInt1308;
			@Pc(326) int local326 = this.anInt1313;
			@Pc(329) int local329 = this.anInt1318;
			this.anInt1312 = arg0.method5362();
			this.anInt1320 = arg0.method5362();
			this.anInt1308 = arg0.method5362();
			this.anInt1313 = arg0.method5362();
			this.anInt1318 = arg0.method5366();
			if (this.anInt1291 != local138 || local177 != this.anInt1312 || local320 != this.anInt1320 || local323 != this.anInt1308 || this.anInt1313 != local326 || local329 != this.anInt1318) {
				Static267.method3942(this);
			}
		}
		if (this.aClass60_1 == null) {
			this.aClass60_1 = new Class60();
		}
		local177 = this.aClass60_1.anInt1900;
		@Pc(409) int[] local409 = this.aClass60_1.anIntArray159;
		this.aClass60_1.method1644(local112, this.method5992(), local199, this.aByte21 == 1, local109);
		if (local109 != local177) {
			super.anInt7300 = (super.anIntArray658[0] << 7) + (this.method5989() << 6);
			super.anInt7298 = (super.anIntArray657[0] << 7) + (this.method5989() << 6);
		}
		if (super.anInt7301 == Static102.anInt2165 && local409 != null) {
			for (local323 = 0; local323 < local199.length; local323++) {
				if (local409[local323] != local199[local323]) {
					Static165.aClass19_1.method552();
					break;
				}
			}
		}
		if (super.aClass4_Sub7_7 != null) {
			super.aClass4_Sub7_7.method3773();
		}
		if (super.anInt7338 == -1 || !super.aBoolean505) {
			return;
		}
		@Pc(511) Class21 local511 = this.method5982();
		if (!local511.method574(super.anInt7338)) {
			super.aBoolean505 = false;
			super.anInt7338 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)I")
	@Override
	public int method5976() {
		return super.anInt7309;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBBI)V")
	public void method1189(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		if (super.anInt7365 != -1 && Static293.aClass127_1.method2975(super.anInt7365).anInt6040 == 1) {
			super.anInt7365 = -1;
		}
		@Pc(32) Class38 local32;
		if (super.anInt7321 != -1) {
			local32 = Static67.aClass263_2.method5782(super.anInt7321);
			if (local32.aBoolean50 && local32.anInt1014 != -1 && Static293.aClass127_1.method2975(local32.anInt1014).anInt6040 == 1) {
				super.anInt7321 = -1;
			}
		}
		if (super.anInt7368 != -1) {
			local32 = Static67.aClass263_2.method5782(super.anInt7368);
			if (local32.aBoolean50 && local32.anInt1014 != -1 && Static293.aClass127_1.method2975(local32.anInt1014).anInt6040 == 1) {
				super.anInt7368 = -1;
			}
		}
		this.anInt1293 = -1;
		if (arg2 < 0 || arg2 >= Static195.anInt3537 || arg0 < 0 || Static118.anInt2419 <= arg0) {
			this.method1185(arg0, arg2);
		} else if (super.anIntArray658[0] >= 0 && super.anIntArray658[0] < Static195.anInt3537 && super.anIntArray657[0] >= 0 && Static118.anInt2419 > super.anIntArray657[0]) {
			if (arg1 == 2) {
				Static444.method5855(arg2, arg0, this);
			}
			this.method1183(arg0, arg2, arg1);
		} else {
			this.method1185(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!t;ILclient!c;Lclient!ya;II)V")
	private void method1190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(5) Class39 arg5, @OriginalArg(6) int arg6) {
		@Pc(12) int local12 = arg0 * arg0 + arg6 * arg6;
		if (local12 < 16384 || local12 > arg1) {
			return;
		}
		@Pc(34) int local34 = (int) (Math.atan2((double) arg0, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(48) Class105 local48 = Static30.method604(super.anInt7346, arg5, arg3, super.anInt7373, super.anInt7355, local34);
		if (local48 != null) {
			arg5.method4504(false);
			local48.method3534(arg4, null, 0);
			arg5.method4504(true);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method1191() {
		return this.aString10;
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)I")
	@Override
	protected int method5992() {
		return this.anInt1310;
	}
}
