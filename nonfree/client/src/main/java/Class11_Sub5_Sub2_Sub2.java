import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class11_Sub5_Sub2_Sub2 extends Class11_Sub5_Sub2 {

	@OriginalMember(owner = "client!sg", name = "Wc", descriptor = "Lclient!ti;")
	public Class241 aClass241_1;

	@OriginalMember(owner = "client!sg", name = "Tc", descriptor = "I")
	public int anInt6566 = -1;

	@OriginalMember(owner = "client!sg", name = "ad", descriptor = "I")
	public int anInt6572 = -1;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(B)I")
	@Override
	public int method5307() {
		if (this.aClass241_1.anIntArray565 != null) {
			@Pc(21) Class241 local21 = this.aClass241_1.method5593(Static67.aClass224_1);
			if (local21 != null && local21.anInt7019 != -1) {
				return local21.anInt7019;
			}
		}
		return this.aClass241_1.anInt7019 == -1 ? super.method5307() : this.aClass241_1.anInt7019;
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)Z")
	private boolean method5309() {
		return this.aClass241_1.aBoolean514;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6303(@OriginalArg(0) Class30 arg0) {
		if (this.aClass241_1 != null && (super.aBoolean478 || this.method5310(0, arg0))) {
			this.method5290(arg0, super.aClass57Array3, super.aBoolean478);
			super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6301() {
		return false;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)I")
	@Override
	public int method5296() {
		if (this.aClass241_1.anIntArray565 != null) {
			@Pc(21) Class241 local21 = this.aClass241_1.method5593(Static67.aClass224_1);
			if (local21 != null && local21.anInt7026 != -1) {
				return local21.anInt7026;
			}
		}
		return this.aClass241_1.anInt7026;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)I")
	@Override
	protected int method5295() {
		if (this.aClass241_1.anIntArray565 != null) {
			@Pc(19) Class241 local19 = this.aClass241_1.method5593(Static67.aClass224_1);
			if (local19 != null && local19.anInt7027 != -1) {
				return local19.anInt7027;
			}
		}
		return this.aClass241_1.anInt7027;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!qa;)Z")
	private boolean method5310(@OriginalArg(0) int arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class231 local11 = this.method5306();
		@Pc(29) Class130 local29 = super.anInt6505 != -1 && super.anInt6496 == 0 ? Static143.aClass85_1.method2406(super.anInt6505) : null;
		@Pc(47) Class130 local47 = super.anInt6484 == -1 || super.aBoolean475 && local29 != null ? null : Static143.aClass85_1.method2406(super.anInt6484);
		@Pc(50) int local50 = local11.anInt6417;
		@Pc(53) int local53 = local11.anInt6383;
		if (local50 != 0 || local53 != 0 || local11.anInt6386 != 0 || local11.anInt6420 != 0) {
			arg0 |= 0x7;
		}
		@Pc(99) boolean local99 = super.aByte78 != 0 && super.anInt6492 <= Static277.anInt2834 && super.anInt6524 > Static277.anInt2834;
		if (local99) {
			arg0 |= 0x80000;
		}
		@Pc(136) Class57 local136 = super.aClass57Array3[0] = this.aClass241_1.method5594(super.anInt6487, Static143.aClass85_1, arg1, super.aClass15Array3, local29, super.anInt6540, super.anInt6491, local47, arg0, super.anInt6543, Static67.aClass224_1, super.anInt6479, Static123.aClass223_1, super.anInt6472);
		if (local136 == null) {
			return false;
		}
		super.anInt6523 = local136.ja();
		this.method5308(local136);
		@Pc(153) int local153 = super.aClass102_7.method2899();
		if (local50 == 0 && local53 == 0) {
			this.method5293(this.method5302() << 7, 0, this.method5302() << 7, local153, 0);
		} else {
			this.method5293(local50, local11.anInt6393, local53, local153, local11.anInt6387);
			if (super.anInt6483 != 0) {
				super.aClass57Array3[0].E(super.anInt6483);
			}
			if (super.anInt6510 != 0) {
				super.aClass57Array3[0].S(super.anInt6510);
			}
			if (super.anInt6480 != 0) {
				super.aClass57Array3[0].R(0, super.anInt6480, 0);
			}
		}
		if (local99) {
			local136.method6079(super.aByte80, super.aByte79, super.aByte77, super.aByte78 & 0xFF);
		}
		@Pc(261) Class149 local261;
		@Pc(275) boolean local275;
		@Pc(277) int local277;
		@Pc(320) Class57 local320;
		if (super.anInt6515 == -1 || super.anInt6512 == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local261 = Static193.aClass186_1.method4462(super.anInt6515);
			local275 = local261.aByte46 == 3 && (local50 != 0 || local53 != 0);
			local277 = local7;
			if (local275) {
				local277 = local7 | 0x7;
			} else {
				if (super.anInt6507 != 0) {
					local277 = local7 | 0x5;
				}
				if (super.anInt6504 != 0) {
					local277 |= 0x2;
				}
			}
			local320 = super.aClass57Array3[1] = local261.method3923(arg1, Static143.aClass85_1, super.anInt6490, local277, super.anInt6512, super.anInt6521);
			if (local320 != null) {
				if (super.anInt6504 != 0) {
					local320.R(0, -super.anInt6504 << 0, 0);
				}
				if (super.anInt6507 != 0) {
					local320.l(super.anInt6507 * 2048);
				}
				if (local275) {
					if (super.anInt6483 != 0) {
						local320.E(super.anInt6483);
					}
					if (super.anInt6510 != 0) {
						local320.S(super.anInt6510);
					}
					if (super.anInt6480 != 0) {
						local320.R(0, super.anInt6480, 0);
					}
				}
			}
		}
		if (super.anInt6486 == -1 || super.anInt6494 == -1) {
			super.aClass57Array3[3] = null;
		} else {
			local261 = Static193.aClass186_1.method4462(super.anInt6486);
			local275 = local261.aByte46 == 3 && (local50 != 0 || local53 != 0);
			local277 = local7;
			if (local275) {
				local277 = local7 | 0x7;
			} else {
				if (super.anInt6528 != 0) {
					local277 = local7 | 0x5;
				}
				if (super.anInt6493 != 0) {
					local277 |= 0x2;
				}
			}
			local320 = super.aClass57Array3[3] = local261.method3925(Static143.aClass85_1, local277, arg1, super.anInt6534, super.anInt6497, super.anInt6494);
			if (local320 != null) {
				if (super.anInt6493 != 0) {
					local320.R(0, -super.anInt6493 << 0, 0);
				}
				if (super.anInt6528 != 0) {
					local320.l(super.anInt6528 * 2048);
				}
				if (local275) {
					if (super.anInt6483 != 0) {
						local320.E(super.anInt6483);
					}
					if (super.anInt6510 != 0) {
						local320.S(super.anInt6510);
					}
					if (super.anInt6480 != 0) {
						local320.R(0, super.anInt6480, 0);
					}
				}
			}
		}
		super.aClass57Array3[2] = null;
		if (super.aClass4_Sub46_3 != null) {
			if (super.aClass4_Sub46_3.anInt7379 <= Static277.anInt2834) {
				super.aClass4_Sub46_3 = null;
			} else if (Static277.anInt2834 >= super.aClass4_Sub46_3.anInt7373) {
				@Pc(554) Class57 local554 = super.aClass4_Sub46_3.method5933(arg1, local7 | 0x7);
				if (local554 != null) {
					local554.R(super.aClass4_Sub46_3.anInt7381 - super.anInt7514, -super.anInt7511 + super.aClass4_Sub46_3.anInt7387, -super.anInt7515 + super.aClass4_Sub46_3.anInt7374);
					if (local153 != 0) {
						local554.l(local153);
					}
					super.aClass57Array3[2] = local554;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)I")
	@Override
	public int method6044() {
		return super.anInt6523;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ti;I)V")
	public void method5311(@OriginalArg(0) Class241 arg0) {
		this.aClass241_1 = arg0;
		if (super.aClass71_Sub6_6 != null) {
			super.aClass71_Sub6_6.method5793();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!qa;)Lclient!nj;")
	@Override
	public Class71_Sub3 method6304(@OriginalArg(1) Class30 arg0) {
		if (this.aClass241_1 == null || !this.method5310(2048, arg0)) {
			return null;
		}
		@Pc(17) Class72 local17 = arg0.method2092();
		@Pc(22) int local22 = super.aClass102_7.method2899();
		local17.s(local22);
		local17.J(super.anInt7514, super.anInt7511, super.anInt7515);
		@Pc(37) Class231 local37 = this.method5306();
		@Pc(50) Class241 local50 = this.aClass241_1.anIntArray565 == null ? this.aClass241_1 : this.aClass241_1.method5593(Static67.aClass224_1);
		if (Static157.aClass185_Sub1_1.aBoolean395 && local50.aBoolean519 && local37.aBoolean472) {
			@Pc(79) Class130 local79 = super.anInt6505 != -1 && super.anInt6496 == 0 ? Static143.aClass85_1.method2406(super.anInt6505) : null;
			@Pc(96) Class130 local96 = super.anInt6484 == -1 || super.aBoolean475 && local79 != null ? null : Static143.aClass85_1.method2406(super.anInt6484);
			@Pc(98) int local98 = 0;
			if (super.anInt6481 != 0) {
				local98 = this.method5300();
			}
			@Pc(158) Class57 local158 = Static219.method3807(local96 == null ? local79 : local96, local96 == null ? super.anInt6543 : super.anInt6491, this.aClass241_1.aByte90 & 0xFF, local98, super.anInt6483, this.aClass241_1.anInt7007, arg0, local22, super.aClass57Array3[0], this.aClass241_1.aShort84 & 0xFFFF, super.anInt6480, super.anInt6510, this.aClass241_1.aByte87 & 0xFF, this.aClass241_1.aShort83 & 0xFFFF);
			if (local158 != null) {
				@Pc(163) float local163 = arg0.I();
				@Pc(166) float local166 = arg0.s();
				arg0.method2106(false);
				arg0.PA(local163, local166 - 150.0F);
				local158.method6073(local17, null, 0);
				arg0.PA(local163, local166);
				arg0.method2106(true);
			}
		}
		@Pc(189) Class71_Sub3 local189 = null;
		if (this.method5309()) {
			local189 = Static127.method2399(super.aClass57Array3.length);
		}
		if (super.aClass71_Sub6_6 == null) {
			arg0.method2050(super.aClass57Array3, local17, local189 == null ? null : local189.aClass71_Sub7Array1, 0);
		} else {
			@Pc(206) Class270 local206 = super.aClass71_Sub6_6.method5794();
			arg0.method2078(super.aClass57Array3, local206, local17, local189 == null ? null : local189.aClass71_Sub7Array1, 0);
		}
		this.method5290(arg0, super.aClass57Array3, false);
		if (super.aClass57Array3[2] != null) {
			if (local22 != 0) {
				super.aClass57Array3[2].l(local22);
			}
			super.aClass57Array3[2].R(-super.aClass4_Sub46_3.anInt7381 + super.anInt7514, -super.aClass4_Sub46_3.anInt7387 + super.anInt7511, super.anInt7515 - super.aClass4_Sub46_3.anInt7374);
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		super.anInt6473 = Static213.anInt4343;
		return local189;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZBIII)V")
	public void method5313(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte100 = (byte) arg3;
		if (super.anInt6505 != -1 && Static143.aClass85_1.method2406(super.anInt6505).anInt3950 == 1) {
			super.anInt6505 = -1;
		}
		@Pc(35) Class149 local35;
		if (super.anInt6515 != -1) {
			local35 = Static193.aClass186_1.method4462(super.anInt6515);
			if (local35.aBoolean297 && local35.anInt4573 != -1 && Static143.aClass85_1.method2406(local35.anInt4573).anInt3950 == 1) {
				super.anInt6515 = -1;
			}
		}
		if (super.anInt6486 != -1) {
			local35 = Static193.aClass186_1.method4462(super.anInt6486);
			if (local35.aBoolean297 && local35.anInt4573 != -1 && Static143.aClass85_1.method2406(local35.anInt4573).anInt3950 == 1) {
				super.anInt6486 = -1;
			}
		}
		if (!arg1) {
			@Pc(97) int local97 = arg2 - super.anIntArray523[0];
			@Pc(105) int local105 = arg4 - super.anIntArray524[0];
			if (local97 >= -8 && local97 <= 8 && local105 >= -8 && local105 <= 8) {
				if (super.anInt6549 < 9) {
					super.anInt6549++;
				}
				for (@Pc(138) int local138 = super.anInt6549; local138 > 0; local138--) {
					super.anIntArray523[local138] = super.anIntArray523[local138 - 1];
					super.anIntArray524[local138] = super.anIntArray524[local138 - 1];
					super.aByteArray87[local138] = super.aByteArray87[local138 - 1];
				}
				super.anIntArray523[0] = arg2;
				super.anIntArray524[0] = arg4;
				super.aByteArray87[0] = 1;
				return;
			}
		}
		super.anIntArray523[0] = arg2;
		super.anInt6549 = 0;
		super.anInt6550 = 0;
		super.anInt6551 = 0;
		super.anIntArray524[0] = arg4;
		super.anInt7515 = (super.anIntArray524[0] << 7) + (arg0 << 6);
		super.anInt7514 = (arg0 << 6) + (super.anIntArray523[0] << 7);
		if (super.aClass71_Sub6_6 != null) {
			super.aClass71_Sub6_6.method5793();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class30 arg2) {
		if (this.aClass241_1 == null || !this.method5310(131072, arg2)) {
			return false;
		}
		@Pc(19) Class72 local19 = arg2.method2092();
		@Pc(24) int local24 = super.aClass102_7.method2899();
		local19.s(local24);
		local19.J(super.anInt7514, super.anInt7511, super.anInt7515);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass57Array3.length > local39; local39++) {
			if (super.aClass57Array3[local39] != null && super.aClass57Array3[local39].method6070(arg1, arg0, local19, this.aClass241_1.anInt7007 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "(I)Z")
	public boolean method5315() {
		return this.aClass241_1 != null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIILclient!qa;ZLclient!ee;Z)V")
	@Override
	public void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class30 arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lclient!qa;B)Lclient!em;")
	@Override
	public Class64 method6305(@OriginalArg(0) Class30 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	@Override
	public void method6307() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)V")
	public void method5318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray523[0];
		@Pc(15) int local15 = super.anIntArray524[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local15++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local15--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (super.anInt6505 != -1 && Static143.aClass85_1.method2406(super.anInt6505).anInt3950 == 1) {
			super.anInt6505 = -1;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		@Pc(93) Class149 local93;
		if (super.anInt6515 != -1) {
			local93 = Static193.aClass186_1.method4462(super.anInt6515);
			if (local93.aBoolean297 && local93.anInt4573 != -1 && Static143.aClass85_1.method2406(local93.anInt4573).anInt3950 == 1) {
				super.anInt6515 = -1;
			}
		}
		if (super.anInt6486 != -1) {
			local93 = Static193.aClass186_1.method4462(super.anInt6486);
			if (local93.aBoolean297 && local93.anInt4573 != -1 && Static143.aClass85_1.method2406(local93.anInt4573).anInt3950 == 1) {
				super.anInt6486 = -1;
			}
		}
		if (super.anInt6549 < 9) {
			super.anInt6549++;
		}
		for (@Pc(161) int local161 = super.anInt6549; local161 > 0; local161--) {
			super.anIntArray523[local161] = super.anIntArray523[local161 - 1];
			super.anIntArray524[local161] = super.anIntArray524[local161 - 1];
			super.aByteArray87[local161] = super.aByteArray87[local161 - 1];
		}
		super.anIntArray523[0] = local10;
		super.aByteArray87[0] = (byte) arg0;
		super.anIntArray524[0] = local15;
	}
}
