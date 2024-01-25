import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class47_Sub1_Sub5_Sub1 extends Class47_Sub1_Sub5 {

	@OriginalMember(owner = "client!kh", name = "Ec", descriptor = "Lclient!qb;")
	public Class196 aClass196_1;

	@OriginalMember(owner = "client!kh", name = "ad", descriptor = "I")
	public int anInt3755 = -1;

	@OriginalMember(owner = "client!kh", name = "Xc", descriptor = "I")
	public int anInt3752 = -1;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)I")
	@Override
	public int method5447() {
		return super.anInt5356;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!qa;I)Z")
	private boolean method3151(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class231 local11 = this.method4327();
		@Pc(29) Class58 local29 = super.anInt5348 != -1 && super.anInt5370 == 0 ? Static322.aClass45_5.method690(super.anInt5348) : null;
		@Pc(46) Class58 local46 = super.anInt5393 == -1 || super.aBoolean432 && local29 != null ? null : Static322.aClass45_5.method690(super.anInt5393);
		@Pc(49) int local49 = local11.anInt6990;
		@Pc(52) int local52 = local11.anInt6999;
		if (local49 != 0 || local52 != 0 || local11.anInt7003 != 0 || local11.anInt7013 != 0) {
			arg1 |= 0x7;
		}
		@Pc(93) boolean local93 = super.aByte77 != 0 && Static123.anInt2333 >= super.anInt5340 && super.anInt5386 > Static123.anInt2333;
		if (local93) {
			arg1 |= 0x80000;
		}
		@Pc(130) Class37 local130 = super.aClass37Array3[0] = this.aClass196_1.method4407(super.anInt5407, super.anInt5391, super.anInt5372, arg0, super.anInt5388, Static322.aClass45_5, Static117.aClass81_1, super.anInt5350, local46, super.anInt5403, arg1, super.aClass226Array3, Static237.aClass80_1, local29);
		if (local130 == null) {
			return false;
		}
		super.anInt5356 = local130.b();
		this.method4312(local130);
		@Pc(147) int local147 = super.aClass134_7.method3097();
		if (local49 == 0 && local52 == 0) {
			this.method4329(this.method4317() << 7, 0, this.method4317() << 7, local147, 0);
		} else {
			this.method4329(local49, local11.anInt6977, local52, local147, local11.anInt6996);
			if (super.anInt5383 != 0) {
				super.aClass37Array3[0].WA(super.anInt5383);
			}
			if (super.anInt5410 != 0) {
				super.aClass37Array3[0].o(super.anInt5410);
			}
			if (super.anInt5362 != 0) {
				super.aClass37Array3[0].ja(0, super.anInt5362, 0);
			}
		}
		if (local93) {
			local130.method4164(super.aByte75, super.aByte74, super.aByte76, super.aByte77 & 0xFF);
		}
		@Pc(249) Class166 local249;
		@Pc(261) boolean local261;
		@Pc(263) int local263;
		@Pc(306) Class37 local306;
		if (super.anInt5381 == -1 || super.anInt5382 == -1) {
			super.aClass37Array3[1] = null;
		} else {
			local249 = Static294.aClass125_2.method2961(super.anInt5381);
			local261 = local249.aByte65 == 3 && (local49 != 0 || local52 != 0);
			local263 = local7;
			if (local261) {
				local263 = local7 | 0x7;
			} else {
				if (super.anInt5401 != 0) {
					local263 = local7 | 0x5;
				}
				if (super.lb != 0) {
					local263 |= 0x2;
				}
			}
			local306 = super.aClass37Array3[1] = local249.method3603(Static322.aClass45_5, arg0, super.anInt5374, super.anInt5345, super.anInt5382, local263);
			if (local306 != null) {
				if (super.lb != 0) {
					local306.ja(0, -super.lb << 0, 0);
				}
				if (super.anInt5401 != 0) {
					local306.k(super.anInt5401 * 2048);
				}
				if (local261) {
					if (super.anInt5383 != 0) {
						local306.WA(super.anInt5383);
					}
					if (super.anInt5410 != 0) {
						local306.o(super.anInt5410);
					}
					if (super.anInt5362 != 0) {
						local306.ja(0, super.anInt5362, 0);
					}
				}
			}
		}
		if (super.anInt5392 == -1 || super.anInt5400 == -1) {
			super.aClass37Array3[3] = null;
		} else {
			local249 = Static294.aClass125_2.method2961(super.anInt5392);
			local261 = local249.aByte65 == 3 && (local49 != 0 || local52 != 0);
			local263 = local7;
			if (local261) {
				local263 = local7 | 0x7;
			} else {
				if (super.anInt5409 != 0) {
					local263 = local7 | 0x5;
				}
				if (super.anInt5351 != 0) {
					local263 |= 0x2;
				}
			}
			local306 = super.aClass37Array3[3] = local249.method3600(arg0, Static322.aClass45_5, local263, super.anInt5354, super.anInt5400, super.anInt5349);
			if (local306 != null) {
				if (super.anInt5351 != 0) {
					local306.ja(0, -super.anInt5351 << 0, 0);
				}
				if (super.anInt5409 != 0) {
					local306.k(super.anInt5409 * 2048);
				}
				if (local261) {
					if (super.anInt5383 != 0) {
						local306.WA(super.anInt5383);
					}
					if (super.anInt5410 != 0) {
						local306.o(super.anInt5410);
					}
					if (super.anInt5362 != 0) {
						local306.ja(0, super.anInt5362, 0);
					}
				}
			}
		}
		super.aClass37Array3[2] = null;
		if (super.aClass1_Sub36_3 != null) {
			if (Static123.anInt2333 >= super.aClass1_Sub36_3.anInt6196) {
				super.aClass1_Sub36_3 = null;
			} else if (Static123.anInt2333 >= super.aClass1_Sub36_3.anInt6202) {
				@Pc(555) Class37 local555 = super.aClass1_Sub36_3.method4907(arg0, local7 | 0x7);
				if (local555 != null) {
					local555.ja(-super.anInt7060 + super.aClass1_Sub36_3.anInt6210, -super.anInt7064 + super.aClass1_Sub36_3.anInt6194, super.aClass1_Sub36_3.anInt6200 - super.anInt7066);
					if (local147 != 0) {
						local555.k(local147);
					}
					super.aClass37Array3[2] = local555;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "(I)Z")
	private boolean method3154() {
		return this.aClass196_1.aBoolean441;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I")
	@Override
	public int method4323() {
		if (this.aClass196_1.anIntArray419 != null) {
			@Pc(13) Class196 local13 = this.aClass196_1.method4412(Static237.aClass80_1);
			if (local13 != null && local13.anInt5548 != -1) {
				return local13.anInt5548;
			}
		}
		return this.aClass196_1.anInt5548 == -1 ? super.method4323() : this.aClass196_1.anInt5548;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		if (this.aClass196_1 == null || !this.method3151(arg0, 2048)) {
			return null;
		}
		@Pc(24) Class43 local24 = arg0.method4588();
		@Pc(29) int local29 = super.aClass134_7.method3097();
		local24.O(local29);
		local24.ZA(super.anInt7060, super.anInt7064, super.anInt7066);
		@Pc(44) Class231 local44 = this.method4327();
		@Pc(57) Class196 local57 = this.aClass196_1.anIntArray419 == null ? this.aClass196_1 : this.aClass196_1.method4412(Static237.aClass80_1);
		if (Static327.aClass230_Sub1_1.aBoolean613 && local57.aBoolean447 && local44.aBoolean586) {
			@Pc(82) Class58 local82 = super.anInt5348 != -1 && super.anInt5370 == 0 ? Static322.aClass45_5.method690(super.anInt5348) : null;
			@Pc(99) Class58 local99 = super.anInt5393 == -1 || super.aBoolean432 && local82 != null ? null : Static322.aClass45_5.method690(super.anInt5393);
			@Pc(153) Class37 local153 = Static100.method1625(super.anInt5410, arg0, super.aBoolean434, super.anInt5362, local29, this.aClass196_1.aByte85 & 0xFF, this.aClass196_1.aShort91 & 0xFFFF, this.aClass196_1.anInt5550, local99 == null ? local82 : local99, super.anInt5383, local99 == null ? super.anInt5350 : super.anInt5407, this.aClass196_1.aByte88 & 0xFF, this.aClass196_1.aShort92 & 0xFFFF, super.aClass37Array3[0]);
			if (local153 != null) {
				@Pc(158) float local158 = arg0.la();
				@Pc(161) float local161 = arg0.w();
				arg0.method4596(false);
				arg0.o(local158, local161 - 150.0F);
				local153.method4167(local24, null, 0);
				arg0.o(local158, local161);
				arg0.method4596(true);
			}
		}
		@Pc(184) Class36_Sub1 local184 = null;
		if (this.method3154()) {
			local184 = Static309.method4241(super.aClass37Array3.length);
		}
		if (super.aClass36_Sub7_6 == null) {
			arg0.method4585(super.aClass37Array3, local24, local184 == null ? null : local184.aClass36_Sub8Array1, 0);
		} else {
			@Pc(203) Class101 local203 = super.aClass36_Sub7_6.method4874();
			arg0.method4593(super.aClass37Array3, local203, local24, local184 == null ? null : local184.aClass36_Sub8Array1, 0);
		}
		this.method4324(super.aClass37Array3, arg0, false);
		if (super.aClass37Array3[2] != null) {
			if (local29 != 0) {
				super.aClass37Array3[2].k(local29);
			}
			super.aClass37Array3[2].ja(-super.aClass1_Sub36_3.anInt6210 + super.anInt7060, -super.aClass1_Sub36_3.anInt6194 + super.anInt7064, -super.aClass1_Sub36_3.anInt6200 + super.anInt7066);
		}
		super.anInt5376 = Static177.anInt3327;
		super.aClass37Array3[0] = super.aClass37Array3[1] = super.aClass37Array3[2] = super.aClass37Array3[3] = null;
		return local184;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)I")
	@Override
	public int method4319() {
		if (this.aClass196_1.anIntArray419 != null) {
			@Pc(18) Class196 local18 = this.aClass196_1.method4412(Static237.aClass80_1);
			if (local18 != null && local18.anInt5553 != -1) {
				return local18.anInt5553;
			}
		}
		return this.aClass196_1.anInt5553;
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "(I)Z")
	public boolean method3156() {
		return this.aClass196_1 != null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!qb;I)V")
	public void method3157(@OriginalArg(0) Class196 arg0) {
		this.aClass196_1 = arg0;
		if (super.aClass36_Sub7_6 != null) {
			super.aClass36_Sub7_6.method4877();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BZIIII)V")
	public void method3158(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte97 = (byte) arg4;
		if (super.anInt5348 != -1 && Static322.aClass45_5.method690(super.anInt5348).anInt1430 == 1) {
			super.anInt5348 = -1;
		}
		@Pc(37) Class166 local37;
		if (super.anInt5381 != -1) {
			local37 = Static294.aClass125_2.method2961(super.anInt5381);
			if (local37.aBoolean344 && local37.anInt4334 != -1 && Static322.aClass45_5.method690(local37.anInt4334).anInt1430 == 1) {
				super.anInt5381 = -1;
			}
		}
		if (super.anInt5392 != -1) {
			local37 = Static294.aClass125_2.method2961(super.anInt5392);
			if (local37.aBoolean344 && local37.anInt4334 != -1 && Static322.aClass45_5.method690(local37.anInt4334).anInt1430 == 1) {
				super.anInt5392 = -1;
			}
		}
		if (!arg0) {
			@Pc(97) int local97 = arg3 - super.anIntArray407[0];
			@Pc(105) int local105 = arg2 - super.anIntArray408[0];
			if (local97 >= -8 && local97 <= 8 && local105 >= -8 && local105 <= 8) {
				if (super.anInt5421 < 9) {
					super.anInt5421++;
				}
				for (@Pc(130) int local130 = super.anInt5421; local130 > 0; local130--) {
					super.anIntArray407[local130] = super.anIntArray407[local130 - 1];
					super.anIntArray408[local130] = super.anIntArray408[local130 - 1];
					super.aByteArray63[local130] = super.aByteArray63[local130 - 1];
				}
				super.anIntArray407[0] = arg3;
				super.aByteArray63[0] = 1;
				super.anIntArray408[0] = arg2;
				return;
			}
		}
		super.anInt5421 = 0;
		super.anInt5419 = 0;
		super.anInt5420 = 0;
		super.anIntArray407[0] = arg3;
		super.anIntArray408[0] = arg2;
		super.anInt7060 = (super.anIntArray407[0] << 7) + (arg1 << 6);
		super.anInt7066 = (arg1 << 6) + (super.anIntArray408[0] << 7);
		if (super.aClass36_Sub7_6 != null) {
			super.aClass36_Sub7_6.method4877();
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return false;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		if (this.aClass196_1 == null || !this.method3151(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class43 local19 = arg2.method4588();
		@Pc(29) int local29 = super.aClass134_7.method3097();
		local19.O(local29);
		local19.ZA(super.anInt7060, super.anInt7064, super.anInt7066);
		@Pc(42) boolean local42 = false;
		for (@Pc(44) int local44 = 0; local44 < super.aClass37Array3.length; local44++) {
			if (super.aClass37Array3[local44] != null && super.aClass37Array3[local44].method4166(arg1, arg0, local19, this.aClass196_1.anInt5550 == 1)) {
				local42 = true;
				break;
			}
		}
		super.aClass37Array3[0] = super.aClass37Array3[1] = super.aClass37Array3[2] = super.aClass37Array3[3] = null;
		return local42;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	public void method3159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray407[0];
		@Pc(15) int local15 = super.anIntArray408[0];
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
			local15--;
			local10++;
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
		if (super.anInt5348 != -1 && Static322.aClass45_5.method690(super.anInt5348).anInt1430 == 1) {
			super.anInt5348 = -1;
		}
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		@Pc(91) Class166 local91;
		if (super.anInt5381 != -1) {
			local91 = Static294.aClass125_2.method2961(super.anInt5381);
			if (local91.aBoolean344 && local91.anInt4334 != -1 && Static322.aClass45_5.method690(local91.anInt4334).anInt1430 == 1) {
				super.anInt5381 = -1;
			}
		}
		if (super.anInt5392 != -1) {
			local91 = Static294.aClass125_2.method2961(super.anInt5392);
			if (local91.aBoolean344 && local91.anInt4334 != -1 && Static322.aClass45_5.method690(local91.anInt4334).anInt1430 == 1) {
				super.anInt5392 = -1;
			}
		}
		if (super.anInt5421 < 9) {
			super.anInt5421++;
		}
		for (@Pc(154) int local154 = super.anInt5421; local154 > 0; local154--) {
			super.anIntArray407[local154] = super.anIntArray407[local154 - 1];
			super.anIntArray408[local154] = super.anIntArray408[local154 - 1];
			super.aByteArray63[local154] = super.aByteArray63[local154 - 1];
		}
		super.anIntArray407[0] = local10;
		super.aByteArray63[0] = (byte) arg0;
		super.anIntArray408[0] = local15;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
	@Override
	protected int method4322() {
		if (this.aClass196_1.anIntArray419 != null) {
			@Pc(18) Class196 local18 = this.aClass196_1.method4412(Static237.aClass80_1);
			if (local18 != null && local18.anInt5559 != -1) {
				return local18.anInt5559;
			}
		}
		return this.aClass196_1.anInt5559;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
		if (this.aClass196_1 != null && (super.aBoolean435 || this.method3151(arg0, 0))) {
			this.method4324(super.aClass37Array3, arg0, super.aBoolean435);
			super.aClass37Array3[0] = super.aClass37Array3[1] = super.aClass37Array3[2] = super.aClass37Array3[3] = null;
		}
	}
}
