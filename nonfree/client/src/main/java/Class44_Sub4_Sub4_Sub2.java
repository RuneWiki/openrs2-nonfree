import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class44_Sub4_Sub4_Sub2 extends Class44_Sub4_Sub4 {

	@OriginalMember(owner = "client!ri", name = "gd", descriptor = "Lclient!bh;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		if (this.aClass18_1 == null || !this.method4729(arg0, 1024)) {
			return null;
		}
		@Pc(17) Class72 local17 = arg0.method2990();
		@Pc(22) int local22 = super.aClass219_7.method5750();
		local17.method4081(local22);
		local17.method4068(super.anInt6340, super.anInt6335, super.anInt6339);
		@Pc(42) Class128 local42 = this.method4716();
		@Pc(54) Class18 local54 = this.aClass18_1.anIntArray37 == null ? this.aClass18_1 : this.aClass18_1.method369();
		if (Static196.aBoolean281 && local54.aBoolean29 && local42.aBoolean245) {
			@Pc(77) Class24 local77 = super.anInt5099 != -1 && super.anInt5118 == 0 ? Static209.method3737(super.anInt5099) : null;
			@Pc(93) Class24 local93 = super.anInt5116 == -1 || super.aBoolean358 && local77 != null ? null : Static209.method3737(super.anInt5116);
			@Pc(145) Class78 local145 = Static342.method5629(this.aClass18_1.aByte2 & 0xFF, super.aClass78Array3[0], super.anInt5138, arg0, local93 == null ? local77 : local93, this.aClass18_1.anInt409, this.aClass18_1.aByte3 & 0xFF, this.aClass18_1.aShort3 & 0xFFFF, local22, super.anInt5101, super.aBoolean355, local93 == null ? super.anInt5152 : super.anInt5129, this.aClass18_1.aShort2 & 0xFFFF, super.anInt5090);
			if (local145 != null) {
				@Pc(150) float local150 = arg0.method3040();
				@Pc(153) float local153 = arg0.method2970();
				arg0.method2957(false);
				arg0.method2974(local150, local153 - 150.0F);
				local145.method4649(local17, null, 0);
				arg0.method2974(local150, local153);
				arg0.method2957(true);
			}
		}
		@Pc(176) Class20_Sub6 local176 = null;
		if (this.method4727()) {
			local176 = Static208.method5776(super.aClass78Array3.length);
		}
		if (super.aClass20_Sub2_7 == null) {
			arg0.method3037(super.aClass78Array3, local17, local176 == null ? null : local176.aClass20_Sub8Array1, 0);
		} else {
			@Pc(207) Class90 local207 = super.aClass20_Sub2_7.method449();
			arg0.method2971(super.aClass78Array3, local207, local17, local176 == null ? null : local176.aClass20_Sub8Array1, 0);
		}
		this.method4710(super.aClass78Array3, arg0, false);
		if (super.aClass78Array3[2] != null) {
			if (local22 != 0) {
				super.aClass78Array3[2].method4648(local22);
			}
			super.aClass78Array3[2].method4641(-super.anInt5166 + super.anInt6340, -super.anInt5157 + super.anInt6335, super.anInt6339 - super.anInt5164);
		}
		return local176;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)I")
	@Override
	public int method4709() {
		if (this.aClass18_1.anIntArray37 != null) {
			@Pc(17) Class18 local17 = this.aClass18_1.method369();
			if (local17 != null && local17.anInt404 != -1) {
				return local17.anInt404;
			}
		}
		return this.aClass18_1.anInt404;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass18_1 == null || !this.method4729(arg1, 65536)) {
			return false;
		}
		@Pc(19) Class72 local19 = arg1.method2990();
		@Pc(24) int local24 = super.aClass219_7.method5750();
		local19.method4081(local24);
		local19.method4067(super.anInt6340, super.anInt6335, super.anInt6339);
		for (@Pc(37) int local37 = 0; super.aClass78Array3.length > local37; local37++) {
			if (super.aClass78Array3[local37] != null) {
				return super.aClass78Array3[local37].method4644(arg2, arg0, local19, this.aClass18_1.anInt409 == 1);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)I")
	@Override
	protected int method4718() {
		if (this.aClass18_1.anIntArray37 != null) {
			@Pc(20) Class18 local20 = this.aClass18_1.method369();
			if (local20 != null && local20.anInt398 != -1) {
				return local20.anInt398;
			}
		}
		return this.aClass18_1.anInt398;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return false;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
		if (this.aClass18_1 != null && (super.aBoolean360 || this.method4729(arg0, 0))) {
			this.method4710(super.aClass78Array3, arg0, super.aBoolean360);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!bh;I)V")
	public void method4726(@OriginalArg(0) Class18 arg0) {
		this.aClass18_1 = arg0;
		if (super.aClass20_Sub2_7 != null) {
			super.aClass20_Sub2_7.method450();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)I")
	@Override
	public int method4713() {
		if (this.aClass18_1.anIntArray37 != null) {
			@Pc(17) Class18 local17 = this.aClass18_1.method369();
			if (local17 != null && local17.anInt390 != -1) {
				return local17.anInt390;
			}
		}
		return this.aClass18_1.anInt390 == -1 ? super.method4713() : this.aClass18_1.anInt390;
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(Z)Z")
	private boolean method4727() {
		return this.aClass18_1.aBoolean34;
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)I")
	@Override
	public int method5784() {
		return super.anInt5095;
	}

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)Z")
	public boolean method4728() {
		return this.aClass18_1 != null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ja;II)Z")
	private boolean method4729(@OriginalArg(0) Class81 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class128 local9 = this.method4716();
		@Pc(27) Class24 local27 = super.anInt5099 != -1 && super.anInt5118 == 0 ? Static209.method3737(super.anInt5099) : null;
		@Pc(43) Class24 local43 = super.anInt5116 == -1 || super.aBoolean358 && local27 != null ? null : Static209.method3737(super.anInt5116);
		@Pc(46) int local46 = local9.anInt3382;
		@Pc(49) int local49 = local9.anInt3380;
		if (local46 != 0 || local49 != 0 || local9.anInt3392 != 0 || local9.anInt3371 != 0) {
			arg1 |= 0x7;
		}
		@Pc(96) Class78 local96 = super.aClass78Array3[0] = this.aClass18_1.method360(super.anInt5119, super.anInt5129, arg1, arg0, local27, local43, super.anInt5091, super.anInt5114, super.anInt5152, super.aClass192Array3, super.anInt5133);
		if (local96 == null) {
			return false;
		}
		super.anInt5095 = local96.method4639();
		this.method4707(local96);
		@Pc(113) int local113 = super.aClass219_7.method5750();
		super.anInt5101 = 0;
		super.anInt5138 = 0;
		super.anInt5090 = 0;
		if (local46 == 0 && local49 == 0) {
			this.method4721(this.method4714() << 7, this.method4714() << 7, local113);
		} else {
			this.method4721(local46, local49, local113);
			if (super.anInt5101 != 0) {
				super.aClass78Array3[0].method4651(super.anInt5101);
			}
			if (super.anInt5090 != 0) {
				super.aClass78Array3[0].method4658(super.anInt5090);
			}
			if (super.anInt5138 != 0) {
				super.aClass78Array3[0].method4641(0, super.anInt5138, 0);
			}
		}
		super.aClass78Array3[1] = null;
		if (super.anInt5148 != -1 && super.anInt5107 != -1) {
			@Pc(210) Class166 local210 = Static62.method999(super.anInt5148);
			@Pc(231) Class78 local231 = local210.method4372(arg0, (local210.aBoolean334 ? 7 : 2) | local5, super.anInt5147, super.anInt5122, super.anInt5107);
			if (local231 != null) {
				local231.method4641(0, -super.anInt5139, 0);
				if (local210.aBoolean334 && (local46 != 0 || local49 != 0)) {
					if (super.anInt5101 != 0) {
						local231.method4651(super.anInt5101);
					}
					if (super.anInt5090 != 0) {
						local231.method4658(super.anInt5090);
					}
					if (super.anInt5138 != 0) {
						local231.method4641(0, super.anInt5138, 0);
					}
				}
				super.aClass78Array3[1] = local231;
			}
		}
		super.aClass78Array3[2] = null;
		if (super.anInterface7_3 != null) {
			if (super.anInt5165 <= Static76.anInt2853) {
				super.anInterface7_3 = null;
			}
			if (super.anInt5163 <= Static76.anInt2853 && super.anInt5165 > Static76.anInt2853) {
				@Pc(321) Class78 local321 = super.anInterface7_3.method5792(local5 | 0x7, arg0);
				if (local321 != null) {
					local321.method4641(super.anInt5166 - super.anInt6340, -super.anInt6335 + super.anInt5157, -super.anInt6339 + super.anInt5164);
					if (local113 != 0) {
						local321.method4648(local113);
					}
					super.aClass78Array3[2] = local321;
				}
			}
		}
		return true;
	}
}
