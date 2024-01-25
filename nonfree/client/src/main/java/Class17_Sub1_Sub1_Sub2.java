import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class17_Sub1_Sub1_Sub2 extends Class17_Sub1_Sub1 {

	@OriginalMember(owner = "client!pi", name = "Pc", descriptor = "Lclient!vq;")
	public Class213 aClass213_1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!uo;)Z")
	private boolean method4330(@OriginalArg(1) int arg0, @OriginalArg(2) Class32 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class123 local9 = this.method4319();
		@Pc(24) Class24 local24 = super.anInt4830 != -1 && super.anInt4856 == 0 ? Static110.method5411(super.anInt4830) : null;
		@Pc(40) Class24 local40 = super.anInt4824 == -1 || super.aBoolean471 && local24 != null ? null : Static110.method5411(super.anInt4824);
		@Pc(43) int local43 = local9.anInt3697;
		@Pc(46) int local46 = local9.anInt3660;
		if (local43 != 0 || local46 != 0 || local9.anInt3673 != 0 || local9.anInt3696 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) Class73 local100 = super.aClass73Array3[0] = this.aClass213_1.method5484(super.anInt4847, local40, super.anInt4863, super.anInt4840, local24, arg0, super.anInt4874, arg1, super.anInt4876, super.anInt4854, super.aClass184Array3);
		if (local100 == null) {
			return false;
		}
		super.anInt4834 = local100.method3327();
		this.method4313(local100);
		@Pc(119) int local119 = super.aClass135_7.method3693();
		super.anInt4870 = 0;
		super.anInt4822 = 0;
		super.anInt4875 = 0;
		if (local43 == 0 && local46 == 0) {
			this.method4314(this.method4318() << 7, this.method4318() << 7, local119);
		} else {
			this.method4314(local46, local43, local119);
			if (super.anInt4875 != 0) {
				super.aClass73Array3[0].method3284(super.anInt4875);
			}
			if (super.anInt4822 != 0) {
				super.aClass73Array3[0].method3324(super.anInt4822);
			}
			if (super.anInt4870 != 0) {
				super.aClass73Array3[0].method3293(0, super.anInt4870, 0);
			}
		}
		super.aClass73Array3[1] = null;
		if (super.anInt4884 != -1 && super.anInt4881 != -1) {
			@Pc(219) Class67 local219 = Static265.method5633(super.anInt4884);
			@Pc(238) Class73 local238 = local219.method1823(super.anInt4855, (local219.aBoolean194 ? 7 : 2) | local5, super.anInt4833, super.anInt4881, arg1);
			if (local238 != null) {
				local238.method3293(0, -super.anInt4844, 0);
				if (local219.aBoolean194 && (local43 != 0 || local46 != 0)) {
					if (super.anInt4875 != 0) {
						local238.method3284(super.anInt4875);
					}
					if (super.anInt4822 != 0) {
						local238.method3324(super.anInt4822);
					}
					if (super.anInt4870 != 0) {
						local238.method3293(0, super.anInt4870, 0);
					}
				}
				super.aClass73Array3[1] = local238;
			}
		}
		super.aClass73Array3[2] = null;
		if (super.anInterface5_3 != null) {
			if (Static5.anInt208 >= super.anInt4898) {
				super.anInterface5_3 = null;
			}
			if (Static5.anInt208 >= super.anInt4894 && Static5.anInt208 < super.anInt4898) {
				@Pc(318) Class73 local318 = super.anInterface5_3.method4798(arg1, local5 | 0x7);
				if (local318 != null) {
					local318.method3293(-super.anInt5109 + super.anInt4886, -super.anInt5112 + super.anInt4889, -super.anInt5108 + super.anInt4896);
					if (local119 != 0) {
						local318.method3319(local119);
					}
					super.aClass73Array3[2] = local318;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)V")
	public void method4331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray438[0];
		@Pc(15) int local15 = super.anIntArray439[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local10++;
			local15++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local15--;
			local10++;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		if (super.anInt4830 != -1 && Static110.method5411(super.anInt4830).anInt1035 == 1) {
			super.anInt4830 = -1;
		}
		if (super.anInt4884 != -1) {
			@Pc(84) Class67 local84 = Static265.method5633(super.anInt4884);
			if (local84.aBoolean193 && local84.anInt2088 != -1 && Static110.method5411(local84.anInt2088).anInt1035 == 1) {
				super.anInt4884 = -1;
			}
		}
		if (super.anInt4893 < 9) {
			super.anInt4893++;
		}
		for (@Pc(117) int local117 = super.anInt4893; local117 > 0; local117--) {
			super.anIntArray438[local117] = super.anIntArray438[local117 - 1];
			super.anIntArray439[local117] = super.anIntArray439[local117 - 1];
			super.aByteArray78[local117] = super.aByteArray78[local117 - 1];
		}
		super.anIntArray438[0] = local10;
		super.aByteArray78[0] = (byte) arg1;
		super.anIntArray439[0] = local15;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!vq;I)V")
	public void method4332(@OriginalArg(0) Class213 arg0) {
		this.aClass213_1 = arg0;
		if (super.aClass8_Sub6_6 != null) {
			super.aClass8_Sub6_6.method3273();
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)I")
	@Override
	protected int method4317() {
		if (this.aClass213_1.anIntArray517 != null) {
			@Pc(12) Class213 local12 = this.aClass213_1.method5480();
			if (local12 != null && local12.anInt6537 != -1) {
				return local12.anInt6537;
			}
		}
		return this.aClass213_1.anInt6537;
	}

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(B)Z")
	public boolean method4333() {
		return this.aClass213_1 != null;
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	@Override
	public Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0) {
		if (this.aClass213_1 == null || !this.method4330(1024, arg0)) {
			return null;
		}
		@Pc(17) Class109 local17 = arg0.method2194();
		@Pc(30) int local30 = super.aClass135_7.method3693();
		local17.method3871(local30);
		local17.method3874(super.anInt5109, super.anInt5112, super.anInt5108);
		@Pc(45) Class123 local45 = this.method4319();
		@Pc(57) Class213 local57 = this.aClass213_1.anIntArray517 == null ? this.aClass213_1 : this.aClass213_1.method5480();
		if (Static282.aBoolean648 && local57.aBoolean642 && local45.aBoolean343) {
			@Pc(82) Class24 local82 = super.anInt4830 != -1 && super.anInt4856 == 0 ? Static110.method5411(super.anInt4830) : null;
			@Pc(98) Class24 local98 = super.anInt4824 == -1 || super.aBoolean471 && local82 != null ? null : Static110.method5411(super.anInt4824);
			@Pc(150) Class73 local150 = Static145.method2882(local98 == null ? local82 : local98, this.aClass213_1.anInt6509, this.aClass213_1.aShort91 & 0xFFFF, this.aClass213_1.aByte76 & 0xFF, super.anInt4822, super.aBoolean472, arg0, local30, this.aClass213_1.aShort90 & 0xFFFF, local98 == null ? super.anInt4863 : super.anInt4847, super.anInt4870, super.anInt4875, super.aClass73Array3[0], this.aClass213_1.aByte73 & 0xFF);
			if (local150 != null) {
				@Pc(155) float local155 = arg0.method2212();
				@Pc(158) float local158 = arg0.method2216();
				arg0.method2142(false);
				arg0.method2225(local155, local158 - 150.0F);
				local150.method3322(local17, null, 0);
				arg0.method2225(local155, local158);
				arg0.method2142(true);
			}
		}
		@Pc(181) Class8_Sub5 local181 = null;
		if (this.method4340()) {
			local181 = Static239.method4367(super.aClass73Array3.length);
		}
		if (super.aClass8_Sub6_6 == null) {
			arg0.method2198(super.aClass73Array3, local17, local181 == null ? null : local181.aClass8_Sub3Array1, 0);
		} else {
			@Pc(212) Class191 local212 = super.aClass8_Sub6_6.method3279();
			arg0.method2172(super.aClass73Array3, local212, local17, local181 == null ? null : local181.aClass8_Sub3Array1, 0);
		}
		this.method4329(false, super.aClass73Array3, arg0);
		if (super.aClass73Array3[2] != null) {
			if (local30 != 0) {
				super.aClass73Array3[2].method3319(local30);
			}
			super.aClass73Array3[2].method3293(-super.anInt4886 + super.anInt5109, -super.anInt4889 + super.anInt5112, super.anInt5108 - super.anInt4896);
		}
		return local181;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	@Override
	public void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4778() {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I")
	@Override
	public int method4315() {
		if (this.aClass213_1.anIntArray517 != null) {
			@Pc(17) Class213 local17 = this.aClass213_1.method5480();
			if (local17 != null && local17.anInt6528 != -1) {
				return local17.anInt6528;
			}
		}
		return this.aClass213_1.anInt6528 == -1 ? super.method4315() : this.aClass213_1.anInt6528;
	}

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)I")
	@Override
	public int method4328() {
		if (this.aClass213_1.anIntArray517 != null) {
			@Pc(18) Class213 local18 = this.aClass213_1.method5480();
			if (local18 != null && local18.anInt6543 != -1) {
				return local18.anInt6543;
			}
		}
		return this.aClass213_1.anInt6543;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	@Override
	public boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass213_1 == null || !this.method4330(65536, arg0)) {
			return false;
		}
		@Pc(19) Class109 local19 = arg0.method2194();
		@Pc(24) int local24 = super.aClass135_7.method3693();
		local19.method3871(local24);
		local19.method3874(super.anInt5109, super.anInt5112, super.anInt5108);
		for (@Pc(37) int local37 = 0; super.aClass73Array3.length > local37; local37++) {
			if (super.aClass73Array3[local37] != null && super.aClass73Array3[local37].method3326(arg1, arg2, local19, this.aClass213_1.anInt6509 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLclient!uo;)V")
	@Override
	public void method4787(@OriginalArg(1) Class32 arg0) {
		if (this.aClass213_1 != null && (super.aBoolean474 || this.method4330(0, arg0))) {
			this.method4329(super.aBoolean474, super.aClass73Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V")
	@Override
	public void method4789() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "(I)Z")
	private boolean method4340() {
		return this.aClass213_1.aBoolean637;
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)I")
	@Override
	public int method4490() {
		return super.anInt4834;
	}
}
