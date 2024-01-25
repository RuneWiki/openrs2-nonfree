import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class21_Sub1_Sub1_Sub1_Sub1 extends Class21_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!d", name = "cd", descriptor = "Lclient!ce;")
	public Class51 aClass51_1;

	@OriginalMember(owner = "client!d", name = "kd", descriptor = "I")
	public int anInt2171 = -1;

	@OriginalMember(owner = "client!d", name = "gd", descriptor = "I")
	public int anInt2168 = -1;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "(I)V")
	@Override
	public void method8232() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		if (this.aClass51_1 == null || !this.method1710(2048, arg0)) {
			return null;
		}
		@Pc(19) Class81 local19 = arg0.method7812();
		@Pc(24) int local24 = super.aClass133_7.method2990();
		local19.o(local24);
		@Pc(42) Class182 local42 = Static571.aClass182ArrayArrayArray3[super.aByte127][super.anInt10551 >> Static392.anInt3635][super.anInt10550 >> Static392.anInt3635];
		if (local42 == null || local42.aClass21_Sub1_Sub5_1 == null) {
			super.anInt4201 = (int) ((float) super.anInt4201 - (float) super.anInt4201 / 10.0F);
		} else {
			@Pc(69) int local69 = super.anInt4201 - local42.aClass21_Sub1_Sub5_1.aShort87;
			super.anInt4201 = (int) ((float) super.anInt4201 - (float) local69 / 10.0F);
		}
		local19.U(super.anInt10551, -super.anInt4201 + super.anInt10554 - 20, super.anInt10550);
		@Pc(98) Class252 local98 = this.method3322();
		@Pc(111) Class51 local111 = this.aClass51_1.anIntArray61 == null ? this.aClass51_1 : this.aClass51_1.method1371(Static523.aClass173_1);
		super.aBoolean298 = false;
		if (Static455.aClass4_Sub35_Sub1_1.aBoolean684 && local111.aBoolean132 && local98.aBoolean550) {
			@Pc(139) Class111 local139 = super.anInt4209 != -1 && super.anInt4214 == 0 ? Static17.aClass254_1.method5936(super.anInt4209) : null;
			@Pc(156) Class111 local156 = super.anInt4254 == -1 || super.aBoolean294 && local139 != null ? null : Static17.aClass254_1.method5936(super.anInt4254);
			@Pc(206) Class65 local206 = Static86.method1808(this.aClass51_1.aShort9 & 0xFFFF, this.aClass51_1.anInt1581, arg0, local156 == null ? local139 : local156, local24, this.aClass51_1.aByte22 & 0xFF, super.anInt4267, this.aClass51_1.aByte23 & 0xFF, super.aClass65Array3[0], local156 == null ? super.anInt4272 : super.anInt4243, this.aClass51_1.aShort10 & 0xFFFF, super.anInt4211, super.anInt4246);
			if (local206 != null) {
				super.aBoolean298 = true;
				arg0.ZA(false);
				if (Static263.aBoolean371) {
					local206.method7686(local19, null, Static18.anInt941, 0);
				} else {
					local206.method7679(local19, null, 0);
				}
				arg0.ZA(true);
			}
		}
		local19.o(local24);
		local19.U(super.anInt10551, super.anInt10554 - super.anInt4201 - 5, super.anInt10550);
		@Pc(250) Class21_Sub4 local250 = null;
		if (this.method1715()) {
			local250 = Static227.method3708(super.aClass65Array3.length);
		}
		this.method3335(false, arg0, local19, super.aClass65Array3);
		@Pc(272) int local272;
		if (Static263.aBoolean371) {
			for (local272 = 0; super.aClass65Array3.length > local272; local272++) {
				if (super.aClass65Array3[local272] != null) {
					super.aClass65Array3[local272].method7686(local19, local250 == null ? null : local250.aClass21_Sub7Array1[local272], Static18.anInt941, 0);
				}
			}
		} else {
			for (local272 = 0; super.aClass65Array3.length > local272; local272++) {
				if (super.aClass65Array3[local272] != null) {
					super.aClass65Array3[local272].method7679(local19, local250 == null ? null : local250.aClass21_Sub7Array1[local272], 0);
				}
			}
		}
		if (super.aClass21_Sub5_4 != null) {
			@Pc(344) Class276 local344 = super.aClass21_Sub5_4.method3048();
			if (Static263.aBoolean371) {
				arg0.method7832(local344, Static18.anInt941);
			} else {
				arg0.method7777(local344);
			}
		}
		for (local272 = 0; local272 < super.aClass65Array3.length; local272++) {
			if (super.aClass65Array3[local272] != null) {
				super.aBoolean298 |= super.aClass65Array3[local272].LA();
			}
		}
		super.aClass65Array3[0] = super.aClass65Array3[1] = super.aClass65Array3[2] = null;
		super.anInt4203 = Static70.anInt1864;
		return local250;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(B)Z")
	public boolean method1709() {
		return this.aClass51_1 != null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!r;)Z")
	private boolean method1710(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class252 local11 = this.method3322();
		@Pc(29) Class111 local29 = super.anInt4209 != -1 && super.anInt4214 == 0 ? Static17.aClass254_1.method5936(super.anInt4209) : null;
		@Pc(46) Class111 local46 = super.anInt4254 == -1 || super.aBoolean294 && local29 != null ? null : Static17.aClass254_1.method5936(super.anInt4254);
		@Pc(49) int local49 = local11.anInt7475;
		@Pc(52) int local52 = local11.anInt7481;
		if (local49 != 0 || local52 != 0 || local11.anInt7517 != 0 || local11.anInt7506 != 0) {
			arg0 |= 0x7;
		}
		@Pc(85) boolean local85 = super.aByte64 != 0 && Static306.anInt6122 >= super.anInt4273 && super.anInt4217 > Static306.anInt6122;
		if (local85) {
			arg0 |= 0x80000;
		}
		@Pc(101) int local101 = super.aClass133_7.method2990();
		@Pc(135) Class65 local135 = super.aClass65Array3[0] = this.aClass51_1.method1368(Static523.aClass173_1, super.anInt4266, super.anInt4252, super.anInt4243, super.anIntArray202, super.anInt4257, local46, super.aClass237Array3, super.anInt4272, super.anInt4198, Static17.aClass254_1, arg1, local101, local29, arg0, Static203.aClass230_1);
		if (local135 == null) {
			return false;
		}
		super.anInt4268 = local135.J();
		super.anInt4241 = local135.RA();
		this.method3330(local135);
		if (local49 == 0 && local52 == 0) {
			this.method3324(0, this.method3339() << 9, this.method3339() << 9, 0, local101);
		} else {
			this.method3324(local11.anInt7509, local52, local49, local11.anInt7480, local101);
			if (super.anInt4246 != 0) {
				super.aClass65Array3[0].MA(super.anInt4246);
			}
			if (super.anInt4211 != 0) {
				super.aClass65Array3[0].W(super.anInt4211);
			}
			if (super.anInt4267 != 0) {
				super.aClass65Array3[0].oa(0, super.anInt4267, 0);
			}
		}
		if (local85) {
			local135.method7683(super.aByte62, super.aByte65, super.aByte63, super.aByte64 & 0xFF);
		}
		@Pc(252) Class49 local252;
		@Pc(267) boolean local267;
		@Pc(269) int local269;
		@Pc(312) Class65 local312;
		if (super.anInt4233 == -1 || super.anInt4236 == -1) {
			super.aClass65Array3[1] = null;
		} else {
			local252 = Static342.aClass132_2.method2958(super.anInt4233);
			local267 = local252.aByte14 == 3 && (local49 != 0 || local52 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt4222 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt4234 != 0) {
					local269 |= 0x2;
				}
			}
			local312 = super.aClass65Array3[1] = local252.method1282(super.anInt4236, local269, Static17.aClass254_1, super.anInt4204, arg1, super.anInt4271);
			if (local312 != null) {
				if (super.anInt4234 != 0) {
					local312.oa(0, -super.anInt4234 << 2, 0);
				}
				if (super.anInt4222 != 0) {
					local312.M(super.anInt4222 * 2048);
				}
				if (local267) {
					if (super.anInt4246 != 0) {
						local312.MA(super.anInt4246);
					}
					if (super.anInt4211 != 0) {
						local312.W(super.anInt4211);
					}
					if (super.anInt4267 != 0) {
						local312.oa(0, super.anInt4267, 0);
					}
				}
			}
		}
		if (super.anInt4224 == -1 || super.anInt4270 == -1) {
			super.aClass65Array3[2] = null;
		} else {
			local252 = Static342.aClass132_2.method2958(super.anInt4224);
			local267 = local252.aByte14 == 3 && (local49 != 0 || local52 != 0);
			local269 = local7;
			if (local267) {
				local269 = local7 | 0x7;
			} else {
				if (super.anInt4249 != 0) {
					local269 = local7 | 0x5;
				}
				if (super.anInt4223 != 0) {
					local269 |= 0x2;
				}
			}
			local312 = super.aClass65Array3[2] = local252.method1285(super.anInt4270, super.anInt4245, super.anInt4206, Static17.aClass254_1, local269, arg1);
			if (local312 != null) {
				if (super.anInt4223 != 0) {
					local312.oa(0, -super.anInt4223 << 2, 0);
				}
				if (super.anInt4249 != 0) {
					local312.M(super.anInt4249 * 2048);
				}
				if (local267) {
					if (super.anInt4246 != 0) {
						local312.MA(super.anInt4246);
					}
					if (super.anInt4211 != 0) {
						local312.W(super.anInt4211);
					}
					if (super.anInt4267 != 0) {
						local312.oa(0, super.anInt4267, 0);
					}
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)I")
	@Override
	public int method3326() {
		if (this.aClass51_1.anIntArray61 != null) {
			@Pc(13) Class51 local13 = this.aClass51_1.method1371(Static523.aClass173_1);
			if (local13 != null && local13.anInt1612 != -1) {
				return local13.anInt1612;
			}
		}
		return this.aClass51_1.anInt1612 == -1 ? super.method3326() : this.aClass51_1.anInt1612;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
		if (this.aClass51_1 == null || !super.aBoolean297 && !this.method1710(0, arg0)) {
			return;
		}
		@Pc(27) Class81 local27 = arg0.method7812();
		local27.o(super.aClass133_7.method2990());
		local27.U(super.anInt10551, super.anInt10554 - 20, super.anInt10550);
		this.method3335(super.aBoolean297, arg0, local27, super.aClass65Array3);
		super.aClass65Array3[0] = super.aClass65Array3[1] = super.aClass65Array3[2] = null;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(Z)I")
	@Override
	public int method3327() {
		if (this.aClass51_1.anIntArray61 != null) {
			@Pc(18) Class51 local18 = this.aClass51_1.method1371(Static523.aClass173_1);
			if (local18 != null && local18.anInt1595 != -1) {
				return local18.anInt1595;
			}
		}
		return this.aClass51_1.anInt1595;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIZIII)V")
	public void method1713(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte127 = super.aByte128 = (byte) arg3;
		if (Static193.method3175(arg2, arg4)) {
			super.aByte128++;
		}
		if (super.anInt4209 != -1 && Static17.aClass254_1.method5936(super.anInt4209).anInt3150 == 1) {
			super.anIntArray205 = null;
			super.anInt4209 = -1;
		}
		@Pc(59) Class49 local59;
		if (super.anInt4233 != -1) {
			local59 = Static342.aClass132_2.method2958(super.anInt4233);
			if (local59.aBoolean119 && local59.anInt1459 != -1 && Static17.aClass254_1.method5936(local59.anInt1459).anInt3150 == 1) {
				super.anInt4233 = -1;
			}
		}
		if (super.anInt4224 != -1) {
			local59 = Static342.aClass132_2.method2958(super.anInt4224);
			if (local59.aBoolean119 && local59.anInt1459 != -1 && Static17.aClass254_1.method5936(local59.anInt1459).anInt3150 == 1) {
				super.anInt4224 = -1;
			}
		}
		if (!arg1) {
			@Pc(123) int local123 = arg4 - super.anIntArray206[0];
			@Pc(131) int local131 = arg2 - super.anIntArray207[0];
			if (local123 >= -8 && local123 <= 8 && local131 >= -8 && local131 <= 8) {
				if (super.anInt4277 < 9) {
					super.anInt4277++;
				}
				for (@Pc(158) int local158 = super.anInt4277; local158 > 0; local158--) {
					super.anIntArray206[local158] = super.anIntArray206[local158 - 1];
					super.anIntArray207[local158] = super.anIntArray207[local158 - 1];
					super.aByteArray34[local158] = super.aByteArray34[local158 - 1];
				}
				super.anIntArray206[0] = arg4;
				super.aByteArray34[0] = 1;
				super.anIntArray207[0] = arg2;
				return;
			}
		}
		super.anInt4279 = 0;
		super.anInt4277 = 0;
		super.anIntArray206[0] = arg4;
		super.anInt4280 = 0;
		super.anIntArray207[0] = arg2;
		super.anInt10551 = (super.anIntArray206[0] << 9) + (arg0 << 8);
		super.anInt10550 = (arg0 << 8) + (super.anIntArray207[0] << 9);
		if (super.aClass21_Sub5_4 != null) {
			super.aClass21_Sub5_4.method3050();
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)I")
	@Override
	protected int method3333() {
		if (this.aClass51_1.anIntArray61 != null) {
			@Pc(18) Class51 local18 = this.aClass51_1.method1371(Static523.aClass173_1);
			if (local18 != null && local18.anInt1620 != -1) {
				return local18.anInt1620;
			}
		}
		return this.aClass51_1.anInt1620;
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8225() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLclient!ce;)V")
	public void method1714(@OriginalArg(1) Class51 arg0) {
		this.aClass51_1 = arg0;
		if (super.aClass21_Sub5_4 != null) {
			super.aClass21_Sub5_4.method3050();
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!d", name = "n", descriptor = "(I)Z")
	private boolean method1715() {
		return this.aClass51_1.aBoolean131;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		if (this.aClass51_1 == null || !this.method1710(131072, arg2)) {
			return false;
		}
		@Pc(19) Class81 local19 = arg2.method7812();
		@Pc(24) int local24 = super.aClass133_7.method2990();
		local19.o(local24);
		local19.U(super.anInt10551, super.anInt10554, super.anInt10550);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass65Array3.length > local39; local39++) {
			if (super.aClass65Array3[local39] != null) {
				@Pc(69) boolean local69 = this.aClass51_1.anInt1583 == -1 ? this.aClass51_1.anInt1581 == 1 : this.aClass51_1.anInt1583 == 1;
				@Pc(81) boolean local81;
				if (Static263.aBoolean371) {
					local81 = super.aClass65Array3[local39].method7685(arg0, arg1, local19, local69, Static18.anInt941);
				} else {
					local81 = super.aClass65Array3[local39].method7684(arg0, arg1, local19, local69);
				}
				if (local81) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass65Array3[0] = super.aClass65Array3[1] = super.aClass65Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(III)V")
	public void method1716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray206[0];
		@Pc(15) int local15 = super.anIntArray207[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local10++;
			local15--;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt4209 != -1 && Static17.aClass254_1.method5936(super.anInt4209).anInt3150 == 1) {
			super.anInt4209 = -1;
			super.anIntArray205 = null;
		}
		@Pc(94) Class49 local94;
		if (super.anInt4233 != -1) {
			local94 = Static342.aClass132_2.method2958(super.anInt4233);
			if (local94.aBoolean119 && local94.anInt1459 != -1 && Static17.aClass254_1.method5936(local94.anInt1459).anInt3150 == 1) {
				super.anInt4233 = -1;
			}
		}
		if (super.anInt4224 != -1) {
			local94 = Static342.aClass132_2.method2958(super.anInt4224);
			if (local94.aBoolean119 && local94.anInt1459 != -1 && Static17.aClass254_1.method5936(local94.anInt1459).anInt3150 == 1) {
				super.anInt4224 = -1;
			}
		}
		if (super.anInt4277 < 9) {
			super.anInt4277++;
		}
		for (@Pc(161) int local161 = super.anInt4277; local161 > 0; local161--) {
			super.anIntArray206[local161] = super.anIntArray206[local161 - 1];
			super.anIntArray207[local161] = super.anIntArray207[local161 - 1];
			super.aByteArray34[local161] = super.aByteArray34[local161 - 1];
		}
		super.anIntArray206[0] = local10;
		super.anIntArray207[0] = local15;
		super.aByteArray34[0] = (byte) arg0;
	}
}
