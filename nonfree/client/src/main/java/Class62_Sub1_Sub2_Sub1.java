import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class62_Sub1_Sub2_Sub1 extends Class62_Sub1_Sub2 {

	@OriginalMember(owner = "client!qm", name = "Pc", descriptor = "Lclient!sr;")
	public Class186 aClass186_1;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)I")
	@Override
	public int method4764() {
		return super.anInt5336;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
		if (this.aClass186_1 != null && (super.aBoolean485 || this.method4719(0, arg0))) {
			this.method4781(super.aBoolean485, super.aClass7Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5564() {
		return false;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I")
	@Override
	public int method4769() {
		if (this.aClass186_1.anIntArray432 != null) {
			@Pc(19) Class186 local19 = this.aClass186_1.method5206();
			if (local19 != null && local19.anInt5954 != -1) {
				return local19.anInt5954;
			}
		}
		return this.aClass186_1.anInt5954;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
	@Override
	public int method4766() {
		if (this.aClass186_1.anIntArray432 != null) {
			@Pc(12) Class186 local12 = this.aClass186_1.method5206();
			if (local12 != null && local12.anInt5957 != -1) {
				return local12.anInt5957;
			}
		}
		return this.aClass186_1.anInt5957 == -1 ? super.method4766() : this.aClass186_1.anInt5957;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZBIILclient!na;ILclient!ae;)V")
	@Override
	public void method5570(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class4 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BILclient!ae;)Z")
	private boolean method4719(@OriginalArg(1) int arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class180 local9 = this.method4775();
		@Pc(27) Class107 local27 = super.anInt5322 != -1 && super.anInt5345 == 0 ? Static212.method3773(super.anInt5322) : null;
		@Pc(43) Class107 local43 = super.anInt5347 == -1 || super.aBoolean484 && local27 != null ? null : Static212.method3773(super.anInt5347);
		@Pc(46) int local46 = local9.anInt5745;
		@Pc(49) int local49 = local9.anInt5735;
		if (local46 != 0 || local49 != 0 || local9.anInt5737 != 0 || local9.anInt5769 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) Class7 local100 = super.aClass7Array3[0] = this.aClass186_1.method5209(super.anInt5331, super.anInt5319, super.anInt5341, arg0, local43, arg1, super.anInt5337, super.anInt5305, local27, super.aClass103Array3, super.anInt5350);
		if (local100 == null) {
			return false;
		}
		super.anInt5336 = local100.method1430();
		this.method4779(local100);
		@Pc(117) int local117 = super.aClass110_7.method3167();
		super.anInt5304 = 0;
		super.anInt5311 = 0;
		super.anInt5313 = 0;
		if (local46 == 0 && local49 == 0) {
			this.method4770(this.method4777() << 7, this.method4777() << 7, local117);
		} else {
			this.method4770(local49, local46, local117);
			if (super.anInt5313 != 0) {
				super.aClass7Array3[0].method1428(super.anInt5313);
			}
			if (super.anInt5311 != 0) {
				super.aClass7Array3[0].method1432(super.anInt5311);
			}
			if (super.anInt5304 != 0) {
				super.aClass7Array3[0].method1413(0, super.anInt5304, 0);
			}
		}
		super.aClass7Array3[1] = null;
		if (super.anInt5321 != -1 && super.anInt5356 != -1) {
			@Pc(212) Class215 local212 = Static44.method1076(super.anInt5321);
			@Pc(231) Class7 local231 = local212.method5985(local5 | (local212.aBoolean620 ? 7 : 2), arg1, super.anInt5356, super.anInt5307, super.anInt5317);
			if (local231 != null) {
				local231.method1413(0, -super.anInt5316, 0);
				if (local212.aBoolean620 && (local46 != 0 || local49 != 0)) {
					if (super.anInt5313 != 0) {
						local231.method1428(super.anInt5313);
					}
					if (super.anInt5311 != 0) {
						local231.method1432(super.anInt5311);
					}
					if (super.anInt5304 != 0) {
						local231.method1413(0, super.anInt5304, 0);
					}
				}
				super.aClass7Array3[1] = local231;
			}
		}
		super.aClass7Array3[2] = null;
		if (super.anInterface9_3 != null) {
			if (super.anInt5368 <= Static212.anInt4090) {
				super.anInterface9_3 = null;
			}
			if (Static212.anInt4090 >= super.anInt5364 && super.anInt5368 > Static212.anInt4090) {
				@Pc(310) Class7 local310 = super.anInterface9_3.method5582(arg1, local5 | 0x7);
				if (local310 != null) {
					local310.method1413(-super.anInt5289 + super.anInt5363, super.anInt5371 - super.anInt5291, -super.anInt5280 + super.anInt5361);
					if (local117 != 0) {
						local310.method1438(local117);
					}
					super.aClass7Array3[2] = local310;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		if (this.aClass186_1 == null || !this.method4719(1024, arg0)) {
			return null;
		}
		@Pc(22) Class133 local22 = arg0.method4244();
		@Pc(27) int local27 = super.aClass110_7.method3167();
		local22.method4331(local27);
		local22.method4333(super.anInt5289, super.anInt5291, super.anInt5280);
		@Pc(42) Class180 local42 = this.method4775();
		@Pc(54) Class186 local54 = this.aClass186_1.anIntArray432 == null ? this.aClass186_1 : this.aClass186_1.method5206();
		if (Static201.aBoolean337 && local54.aBoolean531 && local42.aBoolean513) {
			@Pc(77) Class107 local77 = super.anInt5322 != -1 && super.anInt5345 == 0 ? Static212.method3773(super.anInt5322) : null;
			@Pc(94) Class107 local94 = super.anInt5347 == -1 || super.aBoolean484 && local77 != null ? null : Static212.method3773(super.anInt5347);
			@Pc(146) Class7 local146 = Static6.method210(this.aClass186_1.aShort87 & 0xFFFF, arg0, local27, this.aClass186_1.aByte62 & 0xFF, super.aClass7Array3[0], super.anInt5311, local94 == null ? super.anInt5305 : super.anInt5350, this.aClass186_1.aShort88 & 0xFFFF, this.aClass186_1.aByte64 & 0xFF, super.aBoolean483, local94 == null ? local77 : local94, super.anInt5313, super.anInt5304, this.aClass186_1.anInt5977);
			if (local146 != null) {
				@Pc(151) float local151 = arg0.method4248();
				@Pc(154) float local154 = arg0.method4288();
				arg0.method4268(false);
				arg0.method4306(local151, local154 - 150.0F);
				local146.method1441(local22, null, 0);
				arg0.method4306(local151, local154);
				arg0.method4268(true);
			}
		}
		@Pc(177) Class55_Sub3 local177 = null;
		if (this.method4722()) {
			local177 = Static241.method4172(super.aClass7Array3.length);
		}
		if (super.aClass55_Sub7_7 == null) {
			arg0.method4280(super.aClass7Array3, local22, local177 == null ? null : local177.aClass55_Sub4Array1, 0);
		} else {
			@Pc(194) Class75 local194 = super.aClass55_Sub7_7.method4034();
			arg0.method4277(super.aClass7Array3, local194, local22, local177 == null ? null : local177.aClass55_Sub4Array1, 0);
		}
		this.method4781(false, super.aClass7Array3, arg0);
		if (super.aClass7Array3[2] != null) {
			if (local27 != 0) {
				super.aClass7Array3[2].method1438(local27);
			}
			super.aClass7Array3[2].method1413(super.anInt5289 - super.anInt5363, super.anInt5291 - super.anInt5371, super.anInt5280 - super.anInt5361);
		}
		return local177;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
	@Override
	protected int method4767() {
		if (this.aClass186_1.anIntArray432 != null) {
			@Pc(12) Class186 local12 = this.aClass186_1.method5206();
			if (local12 != null && local12.anInt5938 != -1) {
				return local12.anInt5938;
			}
		}
		return this.aClass186_1.anInt5938;
	}

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "(I)Z")
	public boolean method4720() {
		return this.aClass186_1 != null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBI)V")
	public void method4721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray397[0];
		@Pc(15) int local15 = super.anIntArray396[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local15++;
			local10++;
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
			local15--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt5322 != -1 && Static212.method3773(super.anInt5322).anInt3280 == 1) {
			super.anInt5322 = -1;
		}
		if (super.anInt5321 != -1) {
			@Pc(86) Class215 local86 = Static44.method1076(super.anInt5321);
			if (local86.aBoolean621 && local86.anInt6968 != -1 && Static212.method3773(local86.anInt6968).anInt3280 == 1) {
				super.anInt5321 = -1;
			}
		}
		if (super.anInt5372 < 9) {
			super.anInt5372++;
		}
		for (@Pc(118) int local118 = super.anInt5372; local118 > 0; local118--) {
			super.anIntArray397[local118] = super.anIntArray397[local118 - 1];
			super.anIntArray396[local118] = super.anIntArray396[local118 - 1];
			super.aByteArray60[local118] = super.aByteArray60[local118 - 1];
		}
		super.anIntArray397[0] = local10;
		super.aByteArray60[0] = (byte) arg1;
		super.anIntArray396[0] = local15;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)Z")
	private boolean method4722() {
		return this.aClass186_1.aBoolean529;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V")
	@Override
	public void method5569() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass186_1 == null || !this.method4719(65536, arg1)) {
			return false;
		}
		@Pc(19) Class133 local19 = arg1.method4244();
		@Pc(24) int local24 = super.aClass110_7.method3167();
		local19.method4331(local24);
		local19.method4333(super.anInt5289, super.anInt5291, super.anInt5280);
		for (@Pc(37) int local37 = 0; local37 < super.aClass7Array3.length; local37++) {
			if (super.aClass7Array3[local37] != null && super.aClass7Array3[local37].method1407(arg0, arg2, local19, this.aClass186_1.anInt5977 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!sr;I)V")
	public void method4723(@OriginalArg(0) Class186 arg0) {
		this.aClass186_1 = arg0;
		if (super.aClass55_Sub7_7 != null) {
			super.aClass55_Sub7_7.method4027();
		}
	}
}
