import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class12_Sub1_Sub2_Sub1 extends Class12_Sub1_Sub2 {

	@OriginalMember(owner = "client!ld", name = "Cc", descriptor = "Lclient!vl;")
	public Class240 aClass240_1;

	@OriginalMember(owner = "client!ld", name = "tc", descriptor = "I")
	public int anInt3550 = -1;

	@OriginalMember(owner = "client!ld", name = "oc", descriptor = "I")
	public int anInt3545 = -1;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
		if (this.aClass240_1 != null && (super.aBoolean423 || this.method3262(0, arg0))) {
			this.method4700(arg0, super.aBoolean423, super.aClass3Array3);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass240_1 == null || !this.method3262(65536, arg0)) {
			return false;
		}
		@Pc(19) Class54 local19 = arg0.method4556();
		@Pc(24) int local24 = super.aClass32_7.method773();
		local19.method4782(local24);
		local19.method4783(super.anInt6328, super.anInt6322, super.anInt6317);
		for (@Pc(37) int local37 = 0; local37 < super.aClass3Array3.length; local37++) {
			if (super.aClass3Array3[local37] != null && super.aClass3Array3[local37].method3444(arg2, arg1, local19, this.aClass240_1.anInt6483 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)I")
	@Override
	public int method4709() {
		if (this.aClass240_1.anIntArray781 != null) {
			@Pc(18) Class240 local18 = this.aClass240_1.method5567(Static248.aClass125_1);
			if (local18 != null && local18.anInt6474 != -1) {
				return local18.anInt6474;
			}
		}
		return this.aClass240_1.anInt6474 == -1 ? super.method4709() : this.aClass240_1.anInt6474;
	}

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)Z")
	public boolean method3258() {
		return this.aClass240_1 != null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!vl;I)V")
	public void method3260(@OriginalArg(0) Class240 arg0) {
		this.aClass240_1 = arg0;
		if (super.aClass22_Sub6_6 != null) {
			super.aClass22_Sub6_6.method3565();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!km;)Z")
	private boolean method3262(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class170 local11 = this.method4711();
		@Pc(27) Class189 local27 = super.anInt5371 != -1 && super.anInt5357 == 0 ? Static351.aClass175_3.method4107(super.anInt5371) : null;
		@Pc(44) Class189 local44 = super.anInt5339 == -1 || super.aBoolean422 && local27 != null ? null : Static351.aClass175_3.method4107(super.anInt5339);
		@Pc(47) int local47 = local11.anInt4531;
		@Pc(50) int local50 = local11.anInt4545;
		if (local47 != 0 || local50 != 0 || local11.anInt4559 != 0 || local11.anInt4570 != 0) {
			arg0 |= 0x7;
		}
		@Pc(98) Class3 local98 = super.aClass3Array3[0] = this.aClass240_1.method5574(arg0, super.anInt5316, super.anInt5370, super.anInt5318, super.aClass95Array3, Static248.aClass125_1, Static351.aClass175_3, super.anInt5368, Static225.aClass47_1, super.anInt5331, local44, super.anInt5338, arg1, local27);
		if (local98 == null) {
			return false;
		}
		super.anInt5332 = local98.method3459();
		this.method4704(local98);
		@Pc(115) int local115 = super.aClass32_7.method773();
		super.anInt5334 = 0;
		super.anInt5351 = 0;
		super.anInt5343 = 0;
		if (local47 == 0 && local50 == 0) {
			this.method4705(this.method4706() << 7, this.method4706() << 7, local115);
		} else {
			this.method4705(local47, local50, local115);
			if (super.anInt5334 != 0) {
				super.aClass3Array3[0].method3460(super.anInt5334);
			}
			if (super.anInt5351 != 0) {
				super.aClass3Array3[0].method3463(super.anInt5351);
			}
			if (super.anInt5343 != 0) {
				super.aClass3Array3[0].method3442(0, super.anInt5343, 0);
			}
		}
		super.aClass3Array3[1] = null;
		if (super.anInt5330 != -1 && super.anInt5341 != -1) {
			@Pc(208) Class220 local208 = Static168.aClass74_1.method1772(super.anInt5330);
			@Pc(228) Class3 local228 = local208.method5219(Static351.aClass175_3, arg1, local7 | (local208.aBoolean453 ? 7 : 2), super.anInt5341, super.anInt5327, super.anInt5369);
			if (local228 != null) {
				local228.method3442(0, -super.anInt5375, 0);
				if (local208.aBoolean453 && (local47 != 0 || local50 != 0)) {
					if (super.anInt5334 != 0) {
						local228.method3460(super.anInt5334);
					}
					if (super.anInt5351 != 0) {
						local228.method3463(super.anInt5351);
					}
					if (super.anInt5343 != 0) {
						local228.method3442(0, super.anInt5343, 0);
					}
				}
				super.aClass3Array3[1] = local228;
			}
		}
		super.aClass3Array3[2] = null;
		if (super.aClass2_Sub3_3 != null) {
			if (Static295.anInt5281 >= super.aClass2_Sub3_3.anInt153) {
				super.aClass2_Sub3_3 = null;
			} else if (Static295.anInt5281 >= super.aClass2_Sub3_3.anInt155) {
				@Pc(310) Class3 local310 = super.aClass2_Sub3_3.method187(local7 | 0x7, arg1);
				if (local310 != null) {
					local310.method3442(super.aClass2_Sub3_3.anInt145 - super.anInt6328, super.aClass2_Sub3_3.anInt148 + -super.anInt6322, super.aClass2_Sub3_3.anInt146 - super.anInt6317);
					if (local115 != 0) {
						local310.method3451(local115);
					}
					super.aClass3Array3[2] = local310;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBZI)V")
	public void method3263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte74 = (byte) arg2;
		if (super.anInt5371 != -1 && Static351.aClass175_3.method4107(super.anInt5371).anInt5167 == 1) {
			super.anInt5371 = -1;
		}
		if (super.anInt5330 != -1) {
			@Pc(36) Class220 local36 = Static168.aClass74_1.method1772(super.anInt5330);
			if (local36.aBoolean455 && local36.anInt6020 != -1 && Static351.aClass175_3.method4107(local36.anInt6020).anInt5167 == 1) {
				super.anInt5330 = -1;
			}
		}
		if (!arg3) {
			@Pc(66) int local66 = arg4 - super.anIntArray659[0];
			@Pc(74) int local74 = arg1 - super.anIntArray658[0];
			if (local66 >= -8 && local66 <= 8 && local74 >= -8 && local74 <= 8) {
				if (super.anInt5380 < 9) {
					super.anInt5380++;
				}
				for (@Pc(105) int local105 = super.anInt5380; local105 > 0; local105--) {
					super.anIntArray659[local105] = super.anIntArray659[local105 - 1];
					super.anIntArray658[local105] = super.anIntArray658[local105 - 1];
					super.aByteArray84[local105] = super.aByteArray84[local105 - 1];
				}
				super.anIntArray659[0] = arg4;
				super.aByteArray84[0] = 1;
				super.anIntArray658[0] = arg1;
				return;
			}
		}
		super.anIntArray659[0] = arg4;
		super.anInt5378 = 0;
		super.anInt5377 = 0;
		super.anInt5380 = 0;
		super.anIntArray658[0] = arg1;
		super.anInt6328 = arg0 * 64 + super.anIntArray659[0] * 128;
		super.anInt6317 = super.anIntArray658[0] * 128 + arg0 * 64;
		if (super.aClass22_Sub6_6 != null) {
			super.aClass22_Sub6_6.method3565();
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)I")
	@Override
	protected int method4707() {
		if (this.aClass240_1.anIntArray781 != null) {
			@Pc(13) Class240 local13 = this.aClass240_1.method5567(Static248.aClass125_1);
			if (local13 != null && local13.anInt6488 != -1) {
				return local13.anInt6488;
			}
		}
		return this.aClass240_1.anInt6488;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)I")
	@Override
	public int method5459() {
		return super.anInt5332;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)Z")
	private boolean method3264() {
		return this.aClass240_1.aBoolean481;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	public void method3265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray659[0];
		@Pc(15) int local15 = super.anIntArray658[0];
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
			local10--;
			local15++;
		}
		if (super.anInt5371 != -1 && Static351.aClass175_3.method4107(super.anInt5371).anInt5167 == 1) {
			super.anInt5371 = -1;
		}
		if (super.anInt5330 != -1) {
			@Pc(91) Class220 local91 = Static168.aClass74_1.method1772(super.anInt5330);
			if (local91.aBoolean455 && local91.anInt6020 != -1 && Static351.aClass175_3.method4107(local91.anInt6020).anInt5167 == 1) {
				super.anInt5330 = -1;
			}
		}
		if (super.anInt5380 < 9) {
			super.anInt5380++;
		}
		for (@Pc(127) int local127 = super.anInt5380; local127 > 0; local127--) {
			super.anIntArray659[local127] = super.anIntArray659[local127 - 1];
			super.anIntArray658[local127] = super.anIntArray658[local127 - 1];
			super.aByteArray84[local127] = super.aByteArray84[local127 - 1];
		}
		super.anIntArray659[0] = local10;
		super.anIntArray658[0] = local15;
		super.aByteArray84[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)I")
	@Override
	public int method4701() {
		if (this.aClass240_1.anIntArray781 != null) {
			@Pc(19) Class240 local19 = this.aClass240_1.method5567(Static248.aClass125_1);
			if (local19 != null && local19.anInt6464 != -1) {
				return local19.anInt6464;
			}
		}
		return this.aClass240_1.anInt6464;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		if (this.aClass240_1 == null || !this.method3262(1024, arg0)) {
			return null;
		}
		@Pc(17) Class54 local17 = arg0.method4556();
		@Pc(22) int local22 = super.aClass32_7.method773();
		local17.method4782(local22);
		local17.method4783(super.anInt6328, super.anInt6322, super.anInt6317);
		@Pc(37) Class170 local37 = this.method4711();
		@Pc(50) Class240 local50 = this.aClass240_1.anIntArray781 == null ? this.aClass240_1 : this.aClass240_1.method5567(Static248.aClass125_1);
		if (Static80.aBoolean128 && local50.aBoolean485 && local37.aBoolean339) {
			@Pc(82) Class189 local82 = super.anInt5371 != -1 && super.anInt5357 == 0 ? Static351.aClass175_3.method4107(super.anInt5371) : null;
			@Pc(100) Class189 local100 = super.anInt5339 == -1 || super.aBoolean422 && local82 != null ? null : Static351.aClass175_3.method4107(super.anInt5339);
			@Pc(152) Class3 local152 = Static106.method1855(arg0, this.aClass240_1.aByte76 & 0xFF, this.aClass240_1.aByte77 & 0xFF, super.anInt5351, super.anInt5334, super.aBoolean419, this.aClass240_1.anInt6483, this.aClass240_1.aShort99 & 0xFFFF, local100 == null ? local82 : local100, local100 == null ? super.anInt5318 : super.anInt5316, super.aClass3Array3[0], super.anInt5343, local22, this.aClass240_1.aShort98 & 0xFFFF);
			if (local152 != null) {
				@Pc(157) float local157 = arg0.method4479();
				@Pc(160) float local160 = arg0.method4546();
				arg0.method4555(false);
				arg0.method4516(local157, local160 - 150.0F);
				local152.method3443(local17, null, 0);
				arg0.method4516(local157, local160);
				arg0.method4555(true);
			}
		}
		@Pc(183) Class22_Sub8 local183 = null;
		if (this.method3264()) {
			local183 = Static128.method2279(super.aClass3Array3.length);
		}
		if (super.aClass22_Sub6_6 == null) {
			arg0.method4535(super.aClass3Array3, local17, local183 == null ? null : local183.aClass22_Sub1Array1, 0);
		} else {
			@Pc(214) Class157 local214 = super.aClass22_Sub6_6.method3555();
			arg0.method4545(super.aClass3Array3, local214, local17, local183 == null ? null : local183.aClass22_Sub1Array1, 0);
		}
		this.method4700(arg0, false, super.aClass3Array3);
		if (super.aClass3Array3[2] != null) {
			if (local22 != 0) {
				super.aClass3Array3[2].method3451(local22);
			}
			super.aClass3Array3[2].method3442(super.anInt6328 - super.aClass2_Sub3_3.anInt145, super.anInt6322 - super.aClass2_Sub3_3.anInt148, super.anInt6317 - super.aClass2_Sub3_3.anInt146);
		}
		return local183;
	}
}
