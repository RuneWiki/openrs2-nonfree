import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!pv", name = "Qc", descriptor = "Lclient!ju;")
	public Class131 aClass131_1;

	@OriginalMember(owner = "client!pv", name = "Fc", descriptor = "I")
	public int anInt5275 = -1;

	@OriginalMember(owner = "client!pv", name = "Vc", descriptor = "I")
	public int anInt5288 = -1;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)I")
	@Override
	protected int method4903() {
		if (this.aClass131_1.anIntArray209 != null) {
			@Pc(15) Class131 local15 = this.aClass131_1.method2781(Static408.aClass39_1);
			if (local15 != null && local15.anInt3465 != -1) {
				return local15.anInt3465;
			}
		}
		return this.aClass131_1.anInt3465;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)I")
	@Override
	public int method4902() {
		if (this.aClass131_1.anIntArray209 != null) {
			@Pc(13) Class131 local13 = this.aClass131_1.method2781(Static408.aClass39_1);
			if (local13 != null && local13.anInt3479 != -1) {
				return local13.anInt3479;
			}
		}
		return this.aClass131_1.anInt3479 == -1 ? super.method4902() : this.aClass131_1.anInt3479;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass131_1 == null || !this.method4082(131072, arg0)) {
			return false;
		}
		@Pc(19) Class29 local19 = arg0.method5866();
		@Pc(24) int local24 = super.aClass110_7.method2353();
		local19.ca(local24);
		local19.W(super.anInt7500, super.anInt7501, super.anInt7502);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass57Array3.length; local44++) {
			if (super.aClass57Array3[local44] != null && super.aClass57Array3[local44].method6071(arg1, arg2, local19, this.aClass131_1.anInt3463 == 1)) {
				local42 = true;
				break;
			}
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		return local42;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!za;I)Z")
	private boolean method4082(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(13) Class133 local13 = this.method4910();
		@Pc(31) Class143 local31 = super.anInt6193 != -1 && super.anInt6147 == 0 ? Static271.aClass219_4.method4752(super.anInt6193) : null;
		@Pc(48) Class143 local48 = super.lb == -1 || super.aBoolean410 && local31 != null ? null : Static271.aClass219_4.method4752(super.lb);
		@Pc(51) int local51 = local13.anInt3538;
		@Pc(54) int local54 = local13.anInt3530;
		if (local51 != 0 || local54 != 0 || local13.anInt3534 != 0 || local13.anInt3508 != 0) {
			arg0 |= 0x7;
		}
		@Pc(92) boolean local92 = super.aByte88 != 0 && Static85.anInt1536 >= super.anInt6121 && Static85.anInt1536 < super.anInt6168;
		if (local92) {
			arg0 |= 0x80000;
		}
		@Pc(129) Class57 local129 = super.aClass57Array3[0] = this.aClass131_1.method2780(local31, super.anInt6160, local48, super.anInt6183, Static27.aClass149_1, super.anInt6164, Static271.aClass219_4, super.anInt6143, super.aClass185Array3, arg1, super.anInt6145, super.anInt6117, Static408.aClass39_1, arg0);
		if (local129 == null) {
			return false;
		}
		super.anInt6182 = local129.B();
		this.method4918(local129);
		@Pc(146) int local146 = super.aClass110_7.method2353();
		if (local51 == 0 && local54 == 0) {
			this.method4917(this.method4913() << 7, local146, 0, this.method4913() << 7, 0);
		} else {
			this.method4917(local54, local146, local13.anInt3523, local51, local13.anInt3540);
			if (super.anInt6161 != 0) {
				super.aClass57Array3[0].W(super.anInt6161);
			}
			if (super.anInt6139 != 0) {
				super.aClass57Array3[0].K(super.anInt6139);
			}
			if (super.anInt6166 != 0) {
				super.aClass57Array3[0].a(0, super.anInt6166, 0);
			}
		}
		if (local92) {
			local129.method6057(super.aByte87, super.aByte86, super.aByte89, super.aByte88 & 0xFF);
		}
		@Pc(246) Class63 local246;
		@Pc(263) boolean local263;
		@Pc(265) int local265;
		@Pc(310) Class57 local310;
		if (super.anInt6125 == -1 || super.anInt6149 == -1) {
			super.aClass57Array3[1] = null;
		} else {
			local246 = Static3.aClass203_1.method4360(super.anInt6125);
			local263 = local246.aByte14 == 3 && (local51 != 0 || local54 != 0);
			local265 = local7;
			if (local263) {
				local265 = local7 | 0x7;
			} else {
				if (super.anInt6170 != 0) {
					local265 = local7 | 0x5;
				}
				if (super.anInt6155 != 0) {
					local265 |= 0x2;
				}
			}
			local310 = super.aClass57Array3[1] = local246.method1392(local265, Static271.aClass219_4, super.anInt6187, super.anInt6151, super.anInt6149, arg1);
			if (local310 != null) {
				if (super.anInt6155 != 0) {
					local310.a(0, -super.anInt6155 << 0, 0);
				}
				if (super.anInt6170 != 0) {
					local310.ma(super.anInt6170 * 2048);
				}
				if (local263) {
					if (super.anInt6161 != 0) {
						local310.W(super.anInt6161);
					}
					if (super.anInt6139 != 0) {
						local310.K(super.anInt6139);
					}
					if (super.anInt6166 != 0) {
						local310.a(0, super.anInt6166, 0);
					}
				}
			}
		}
		if (super.anInt6173 == -1 || super.anInt6124 == -1) {
			super.aClass57Array3[3] = null;
		} else {
			local246 = Static3.aClass203_1.method4360(super.anInt6173);
			local263 = local246.aByte14 == 3 && (local51 != 0 || local54 != 0);
			local265 = local7;
			if (local263) {
				local265 = local7 | 0x7;
			} else {
				if (super.anInt6119 != 0) {
					local265 = local7 | 0x5;
				}
				if (super.anInt6191 != 0) {
					local265 |= 0x2;
				}
			}
			local310 = super.aClass57Array3[3] = local246.method1400(super.anInt6185, super.anInt6124, local265, Static271.aClass219_4, super.anInt6194, arg1);
			if (local310 != null) {
				if (super.anInt6191 != 0) {
					local310.a(0, -super.anInt6191 << 0, 0);
				}
				if (super.anInt6119 != 0) {
					local310.ma(super.anInt6119 * 2048);
				}
				if (local263) {
					if (super.anInt6161 != 0) {
						local310.W(super.anInt6161);
					}
					if (super.anInt6139 != 0) {
						local310.K(super.anInt6139);
					}
					if (super.anInt6166 != 0) {
						local310.a(0, super.anInt6166, 0);
					}
				}
			}
		}
		super.aClass57Array3[2] = null;
		if (super.aClass5_Sub11_3 != null) {
			if (Static85.anInt1536 >= super.aClass5_Sub11_3.anInt1512) {
				super.aClass5_Sub11_3 = null;
			} else if (Static85.anInt1536 >= super.aClass5_Sub11_3.anInt1522) {
				@Pc(540) Class57 local540 = super.aClass5_Sub11_3.method1240(local7 | 0x7, arg1);
				if (local540 != null) {
					local540.a(-super.anInt7500 + super.aClass5_Sub11_3.anInt1527, super.aClass5_Sub11_3.anInt1528 + -super.anInt7501, super.aClass5_Sub11_3.anInt1514 - super.anInt7502);
					if (local146 != 0) {
						local540.ma(local146);
					}
					super.aClass57Array3[2] = local540;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIZI)V")
	public void method4083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte105 = (byte) arg0;
		if (super.anInt6193 != -1 && Static271.aClass219_4.method4752(super.anInt6193).anInt3770 == 1) {
			super.anInt6193 = -1;
		}
		@Pc(36) Class63 local36;
		if (super.anInt6125 != -1) {
			local36 = Static3.aClass203_1.method4360(super.anInt6125);
			if (local36.aBoolean114 && local36.anInt1705 != -1 && Static271.aClass219_4.method4752(local36.anInt1705).anInt3770 == 1) {
				super.anInt6125 = -1;
			}
		}
		if (super.anInt6173 != -1) {
			local36 = Static3.aClass203_1.method4360(super.anInt6173);
			if (local36.aBoolean114 && local36.anInt1705 != -1 && Static271.aClass219_4.method4752(local36.anInt1705).anInt3770 == 1) {
				super.anInt6173 = -1;
			}
		}
		if (!arg3) {
			@Pc(98) int local98 = arg4 - super.anIntArray434[0];
			@Pc(105) int local105 = arg1 - super.anIntArray433[0];
			if (local98 >= -8 && local98 <= 8 && local105 >= -8 && local105 <= 8) {
				if (super.anInt6199 < 9) {
					super.anInt6199++;
				}
				for (@Pc(138) int local138 = super.anInt6199; local138 > 0; local138--) {
					super.anIntArray434[local138] = super.anIntArray434[local138 - 1];
					super.anIntArray433[local138] = super.anIntArray433[local138 - 1];
					super.aByteArray78[local138] = super.aByteArray78[local138 - 1];
				}
				super.anIntArray434[0] = arg4;
				super.anIntArray433[0] = arg1;
				super.aByteArray78[0] = 1;
				return;
			}
		}
		super.anInt6197 = 0;
		super.anIntArray434[0] = arg4;
		super.anInt6199 = 0;
		super.anInt6196 = 0;
		super.anIntArray433[0] = arg1;
		super.anInt7500 = (super.anIntArray434[0] << 7) + (arg2 << 6);
		super.anInt7502 = (arg2 << 6) + (super.anIntArray433[0] << 7);
		if (super.aClass88_Sub6_7 != null) {
			super.aClass88_Sub6_7.method5047();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "(B)Z")
	private boolean method4087() {
		return this.aClass131_1.aBoolean224;
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(Z)Z")
	public boolean method4088() {
		return this.aClass131_1 != null;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)I")
	@Override
	public int method6031() {
		return super.anInt6182;
	}

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "(B)I")
	@Override
	public int method4914() {
		if (this.aClass131_1.anIntArray209 != null) {
			@Pc(18) Class131 local18 = this.aClass131_1.method2781(Static408.aClass39_1);
			if (local18 != null && local18.anInt3471 != -1) {
				return local18.anInt3471;
			}
		}
		return this.aClass131_1.anInt3471;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
		if (this.aClass131_1 != null && (super.aBoolean411 || this.method4082(0, arg0))) {
			this.method4911(super.aBoolean411, arg0, super.aClass57Array3);
			super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		if (this.aClass131_1 == null || !this.method4082(2048, arg0)) {
			return null;
		}
		@Pc(17) Class29 local17 = arg0.method5866();
		@Pc(22) int local22 = super.aClass110_7.method2353();
		local17.ca(local22);
		local17.W(super.anInt7500, super.anInt7501, super.anInt7502);
		@Pc(37) Class133 local37 = this.method4910();
		@Pc(50) Class131 local50 = this.aClass131_1.anIntArray209 == null ? this.aClass131_1 : this.aClass131_1.method2781(Static408.aClass39_1);
		if (Static216.aClass1_Sub1_1.aBoolean303 && local50.aBoolean225 && local37.aBoolean229) {
			@Pc(77) Class143 local77 = super.anInt6193 != -1 && super.anInt6147 == 0 ? Static271.aClass219_4.method4752(super.anInt6193) : null;
			@Pc(97) Class143 local97 = super.lb == -1 || super.aBoolean410 && local77 != null ? null : Static271.aClass219_4.method4752(super.lb);
			@Pc(99) int local99 = 0;
			if (super.anInt6177 != 0) {
				local99 = this.method4916();
			}
			@Pc(164) Class57 local164 = Static42.method669(super.anInt6166, this.aClass131_1.aShort35 & 0xFFFF, arg0, local99, super.aClass57Array3[0], local22, super.anInt6139, local97 == null ? local77 : local97, this.aClass131_1.aShort34 & 0xFFFF, this.aClass131_1.aByte36 & 0xFF, local97 == null ? super.anInt6117 : super.anInt6145, this.aClass131_1.anInt3463, super.anInt6161, this.aClass131_1.aByte40 & 0xFF);
			if (local164 != null) {
				@Pc(169) float local169 = arg0.T();
				@Pc(172) float local172 = arg0.aa();
				arg0.method5859(false);
				arg0.da(local169, local172 - 150.0F);
				local164.method6060(local17, null, 0);
				arg0.da(local169, local172);
				arg0.method5859(true);
			}
		}
		@Pc(195) Class88_Sub2 local195 = null;
		if (this.method4087()) {
			local195 = Static232.method3033(super.aClass57Array3.length);
		}
		if (super.aClass88_Sub6_7 == null) {
			arg0.method5843(super.aClass57Array3, local17, local195 == null ? null : local195.aClass88_Sub8Array1, 0);
		} else {
			@Pc(226) Class255 local226 = super.aClass88_Sub6_7.method5045();
			arg0.method5874(super.aClass57Array3, local226, local17, local195 == null ? null : local195.aClass88_Sub8Array1, 0);
		}
		this.method4911(false, arg0, super.aClass57Array3);
		if (super.aClass57Array3[2] != null) {
			if (local22 != 0) {
				super.aClass57Array3[2].ma(local22);
			}
			super.aClass57Array3[2].a(-super.aClass5_Sub11_3.anInt1527 + super.anInt7500, -super.aClass5_Sub11_3.anInt1528 + super.anInt7501, super.anInt7502 - super.aClass5_Sub11_3.anInt1514);
		}
		super.aClass57Array3[0] = super.aClass57Array3[1] = super.aClass57Array3[2] = super.aClass57Array3[3] = null;
		super.anInt6141 = Static409.anInt6832;
		return local195;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IBI)V")
	public void method4089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray434[0];
		@Pc(15) int local15 = super.anIntArray433[0];
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
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt6193 != -1 && Static271.aClass219_4.method4752(super.anInt6193).anInt3770 == 1) {
			super.anInt6193 = -1;
		}
		@Pc(88) Class63 local88;
		if (super.anInt6125 != -1) {
			local88 = Static3.aClass203_1.method4360(super.anInt6125);
			if (local88.aBoolean114 && local88.anInt1705 != -1 && Static271.aClass219_4.method4752(local88.anInt1705).anInt3770 == 1) {
				super.anInt6125 = -1;
			}
		}
		if (super.anInt6173 != -1) {
			local88 = Static3.aClass203_1.method4360(super.anInt6173);
			if (local88.aBoolean114 && local88.anInt1705 != -1 && Static271.aClass219_4.method4752(local88.anInt1705).anInt3770 == 1) {
				super.anInt6173 = -1;
			}
		}
		if (super.anInt6199 < 9) {
			super.anInt6199++;
		}
		for (@Pc(148) int local148 = super.anInt6199; local148 > 0; local148--) {
			super.anIntArray434[local148] = super.anIntArray434[local148 - 1];
			super.anIntArray433[local148] = super.anIntArray433[local148 - 1];
			super.aByteArray78[local148] = super.aByteArray78[local148 - 1];
		}
		super.anIntArray434[0] = local10;
		super.aByteArray78[0] = (byte) arg0;
		super.anIntArray433[0] = local15;
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!ju;)V")
	public void method4091(@OriginalArg(1) Class131 arg0) {
		this.aClass131_1 = arg0;
		if (super.aClass88_Sub6_7 != null) {
			super.aClass88_Sub6_7.method5047();
		}
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return false;
	}
}
