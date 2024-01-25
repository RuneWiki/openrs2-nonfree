import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class4_Sub5_Sub2_Sub2 extends Class4_Sub5_Sub2 {

	@OriginalMember(owner = "client!rd", name = "Lc", descriptor = "Lclient!jr;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
		if (this.aClass106_1 != null && (super.aBoolean449 || this.method4827(0, arg0))) {
			this.method4804(super.aBoolean449, super.aClass112Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "(I)I")
	@Override
	public int method4815() {
		if (this.aClass106_1.anIntArray326 != null) {
			@Pc(19) Class106 local19 = this.aClass106_1.method2829();
			if (local19 != null && local19.anInt3142 != -1) {
				return local19.anInt3142;
			}
		}
		return this.aClass106_1.anInt3142;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)I")
	@Override
	public int method4803() {
		if (this.aClass106_1.anIntArray326 != null) {
			@Pc(16) Class106 local16 = this.aClass106_1.method2829();
			if (local16 != null && local16.anInt3156 != -1) {
				return local16.anInt3156;
			}
		}
		return this.aClass106_1.anInt3156 == -1 ? super.method4803() : this.aClass106_1.anInt3156;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	public void method4818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray523[0];
		@Pc(15) int local15 = super.anIntArray522[0];
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
		if (super.anInt5383 != -1 && Static162.method2849(super.anInt5383).anInt2456 == 1) {
			super.anInt5383 = -1;
		}
		if (arg1 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt5398 != -1) {
			@Pc(90) Class163 local90 = Static325.method5628(super.anInt5398);
			if (local90.aBoolean418 && local90.anInt5031 != -1 && Static162.method2849(local90.anInt5031).anInt2456 == 1) {
				super.anInt5398 = -1;
			}
		}
		if (super.anInt5413 < 9) {
			super.anInt5413++;
		}
		for (@Pc(121) int local121 = super.anInt5413; local121 > 0; local121--) {
			super.anIntArray523[local121] = super.anIntArray523[local121 - 1];
			super.anIntArray522[local121] = super.anIntArray522[local121 - 1];
			super.aByteArray74[local121] = super.aByteArray74[local121 - 1];
		}
		super.anIntArray523[0] = local10;
		super.aByteArray74[0] = (byte) arg0;
		super.anIntArray522[0] = local15;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method4821(@OriginalArg(0) Class106 arg0) {
		this.aClass106_1 = arg0;
		if (super.aClass32_Sub7_7 != null) {
			super.aClass32_Sub7_7.method4960();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)I")
	@Override
	public int method5902() {
		return super.anInt5370;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		if (this.aClass106_1 == null || !this.method4827(1024, arg0)) {
			return null;
		}
		@Pc(17) Class66 local17 = arg0.method5195();
		@Pc(22) int local22 = super.aClass207_7.method5877();
		local17.method5826(local22);
		local17.method5825(super.anInt6631, super.anInt6633, super.anInt6632);
		@Pc(37) Class88 local37 = this.method4805();
		@Pc(49) Class106 local49 = this.aClass106_1.anIntArray326 == null ? this.aClass106_1 : this.aClass106_1.method2829();
		if (Static157.aBoolean233 && local49.aBoolean244 && local37.aBoolean173) {
			@Pc(71) Class89 local71 = super.anInt5383 != -1 && super.anInt5382 == 0 ? Static162.method2849(super.anInt5383) : null;
			@Pc(87) Class89 local87 = super.anInt5361 == -1 || super.aBoolean446 && local71 != null ? null : Static162.method2849(super.anInt5361);
			@Pc(139) Class112 local139 = Static28.method627(local22, this.aClass106_1.anInt3135, super.aClass112Array3[0], local87 == null ? local71 : local87, super.aBoolean445, super.anInt5411, super.anInt5366, local87 == null ? super.anInt5365 : super.anInt5385, arg0, this.aClass106_1.aShort24 & 0xFFFF, this.aClass106_1.aShort25 & 0xFFFF, this.aClass106_1.aByte14 & 0xFF, super.anInt5367, this.aClass106_1.aByte13 & 0xFF);
			if (local139 != null) {
				@Pc(144) float local144 = arg0.method5231();
				@Pc(147) float local147 = arg0.method5232();
				arg0.method5259(false);
				arg0.method5156(local144, local147 - 150.0F);
				local139.method4338(local17, null, 0);
				arg0.method5156(local144, local147);
				arg0.method5259(true);
			}
		}
		@Pc(170) Class32_Sub4 local170 = null;
		if (this.method4825()) {
			local170 = Static232.method4183(super.aClass112Array3.length);
		}
		if (super.aClass32_Sub7_7 == null) {
			arg0.method5244(super.aClass112Array3, local17, local170 == null ? null : local170.aClass32_Sub8Array1, 0);
		} else {
			@Pc(187) Class146 local187 = super.aClass32_Sub7_7.method4955();
			arg0.method5214(super.aClass112Array3, local187, local17, local170 == null ? null : local170.aClass32_Sub8Array1, 0);
		}
		this.method4804(false, super.aClass112Array3, arg0);
		if (super.aClass112Array3[2] != null) {
			if (local22 != 0) {
				super.aClass112Array3[2].method4309(local22);
			}
			super.aClass112Array3[2].method4324(-super.anInt5418 + super.anInt6631, super.anInt6633 - super.anInt5424, -super.anInt5415 + super.anInt6632);
		}
		return local170;
	}

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "(I)Z")
	private boolean method4825() {
		return this.aClass106_1.aBoolean241;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass106_1 == null || !this.method4827(65536, arg1)) {
			return false;
		}
		@Pc(31) Class66 local31 = arg1.method5195();
		@Pc(36) int local36 = super.aClass207_7.method5877();
		local31.method5826(local36);
		local31.method5825(super.anInt6631, super.anInt6633, super.anInt6632);
		for (@Pc(49) int local49 = 0; local49 < super.aClass112Array3.length; local49++) {
			if (super.aClass112Array3[local49] != null && super.aClass112Array3[local49].method4340(arg2, arg0, local31, this.aClass106_1.anInt3135 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "(I)Z")
	public boolean method4826() {
		return this.aClass106_1 != null;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!ea;I)Z")
	private boolean method4827(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class88 local9 = this.method4805();
		@Pc(23) Class89 local23 = super.anInt5383 != -1 && super.anInt5382 == 0 ? Static162.method2849(super.anInt5383) : null;
		@Pc(40) Class89 local40 = super.anInt5361 == -1 || super.aBoolean446 && local23 != null ? null : Static162.method2849(super.anInt5361);
		@Pc(43) int local43 = local9.anInt2302;
		@Pc(46) int local46 = local9.anInt2273;
		if (local43 != 0 || local46 != 0 || local9.anInt2282 != 0 || local9.anInt2313 != 0) {
			arg0 |= 0x7;
		}
		@Pc(94) Class112 local94 = super.aClass112Array3[0] = this.aClass106_1.method2834(arg0, local40, arg1, super.anInt5389, super.aClass193Array3, super.anInt5365, super.anInt5384, super.anInt5385, super.anInt5409, local23, super.anInt5396);
		if (local94 == null) {
			return false;
		}
		super.anInt5370 = local94.method4331();
		this.method4817(local94);
		@Pc(111) int local111 = super.aClass207_7.method5877();
		super.anInt5411 = 0;
		super.anInt5367 = 0;
		super.anInt5366 = 0;
		if (local43 == 0 && local46 == 0) {
			this.method4816(this.method4807() << 7, local111, this.method4807() << 7);
		} else {
			this.method4816(local43, local111, local46);
			if (super.anInt5367 != 0) {
				super.aClass112Array3[0].method4352(super.anInt5367);
			}
			if (super.anInt5411 != 0) {
				super.aClass112Array3[0].method4315(super.anInt5411);
			}
			if (super.anInt5366 != 0) {
				super.aClass112Array3[0].method4324(0, super.anInt5366, 0);
			}
		}
		super.aClass112Array3[1] = null;
		if (super.anInt5398 != -1 && super.anInt5404 != -1) {
			@Pc(209) Class163 local209 = Static325.method5628(super.anInt5398);
			@Pc(228) Class112 local228 = local209.method4486(super.anInt5404, super.anInt5369, arg1, local5 | (local209.aBoolean417 ? 7 : 2), super.anInt5358);
			if (local228 != null) {
				local228.method4324(0, -super.anInt5373, 0);
				if (local209.aBoolean417 && (local43 != 0 || local46 != 0)) {
					if (super.anInt5367 != 0) {
						local228.method4352(super.anInt5367);
					}
					if (super.anInt5411 != 0) {
						local228.method4315(super.anInt5411);
					}
					if (super.anInt5366 != 0) {
						local228.method4324(0, super.anInt5366, 0);
					}
				}
				super.aClass112Array3[1] = local228;
			}
		}
		super.aClass112Array3[2] = null;
		if (super.anInterface5_3 != null) {
			if (Static283.anInt5563 >= super.anInt5420) {
				super.anInterface5_3 = null;
			}
			if (Static283.anInt5563 >= super.anInt5425 && Static283.anInt5563 < super.anInt5420) {
				@Pc(310) Class112 local310 = super.anInterface5_3.method5906(arg1, local5 | 0x7);
				if (local310 != null) {
					local310.method4324(-super.anInt6631 + super.anInt5418, super.anInt5424 - super.anInt6633, super.anInt5415 - super.anInt6632);
					if (local111 != 0) {
						local310.method4309(local111);
					}
					super.aClass112Array3[2] = local310;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)I")
	@Override
	protected int method4801() {
		if (this.aClass106_1.anIntArray326 != null) {
			@Pc(20) Class106 local20 = this.aClass106_1.method2829();
			if (local20 != null && local20.anInt3168 != -1) {
				return local20.anInt3168;
			}
		}
		return this.aClass106_1.anInt3168;
	}
}
