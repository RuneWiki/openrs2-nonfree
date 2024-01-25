import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class5_Sub4_Sub4_Sub2 extends Class5_Sub4_Sub4 {

	@OriginalMember(owner = "client!qc", name = "Ac", descriptor = "Lclient!lc;")
	public Class119 aClass119_1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
	@Override
	public int method4204() {
		if (this.aClass119_1.anIntArray248 != null) {
			@Pc(19) Class119 local19 = this.aClass119_1.method2882();
			if (local19 != null && local19.anInt3647 != -1) {
				return local19.anInt3647;
			}
		}
		return this.aClass119_1.anInt3647;
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)Z")
	public boolean method4217() {
		return this.aClass119_1 != null;
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
	@Override
	public void method5328() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "(I)Z")
	private boolean method4219() {
		return this.aClass119_1.aBoolean205;
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)I")
	@Override
	protected int method4206() {
		if (this.aClass119_1.anIntArray248 != null) {
			@Pc(12) Class119 local12 = this.aClass119_1.method2882();
			if (local12 != null && local12.anInt3661 != -1) {
				return local12.anInt3661;
			}
		}
		return this.aClass119_1.anInt3661;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!tj;BIZLclient!km;I)V")
	@Override
	public void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class5 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!lc;B)V")
	public void method4223(@OriginalArg(0) Class119 arg0) {
		this.aClass119_1 = arg0;
		if (super.aClass8_Sub5_6 != null) {
			super.aClass8_Sub5_6.method3573();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!tj;I)Lclient!ri;")
	@Override
	public Class8_Sub7 method5329(@OriginalArg(0) Class122 arg0) {
		if (this.aClass119_1 == null || !this.method4224(1024, arg0)) {
			return null;
		}
		@Pc(17) Class56 local17 = arg0.method4739();
		@Pc(22) int local22 = super.aClass193_7.method5174();
		local17.method4688(local22);
		local17.method4691(super.anInt5901, super.anInt5907, super.anInt5905);
		@Pc(37) Class54 local37 = this.method4201();
		@Pc(51) Class119 local51 = this.aClass119_1.anIntArray248 == null ? this.aClass119_1 : this.aClass119_1.method2882();
		if (Static21.aBoolean29 && local51.aBoolean200 && local37.aBoolean75) {
			@Pc(77) Class131 local77 = super.anInt4915 != -1 && super.anInt4918 == 0 ? Static343.method5604(super.anInt4915) : null;
			@Pc(96) Class131 local96 = super.anInt4911 == -1 || super.aBoolean285 && local77 != null ? null : Static343.method5604(super.anInt4911);
			@Pc(148) Class124 local148 = Static191.method3418(this.aClass119_1.aShort47 & 0xFFFF, super.aBoolean284, local96 == null ? local77 : local96, this.aClass119_1.aShort48 & 0xFFFF, this.aClass119_1.aByte38 & 0xFF, local96 == null ? super.anInt4912 : super.anInt4932, this.aClass119_1.anInt3645, super.aClass124Array3[0], super.anInt4899, arg0, this.aClass119_1.aByte39 & 0xFF, super.anInt4908, super.anInt4890, local22);
			if (local148 != null) {
				@Pc(153) float local153 = arg0.method4722();
				@Pc(156) float local156 = arg0.method4778();
				arg0.method4705(false);
				arg0.method4744(local153, local156 - 150.0F);
				local148.method4079(local17, null, 0);
				arg0.method4744(local153, local156);
				arg0.method4705(true);
			}
		}
		@Pc(179) Class8_Sub7 local179 = null;
		if (this.method4219()) {
			local179 = Static97.method1655(super.aClass124Array3.length);
		}
		if (super.aClass8_Sub5_6 == null) {
			arg0.method4761(super.aClass124Array3, local17, local179 == null ? null : local179.aClass8_Sub2Array1, 0);
		} else {
			@Pc(201) Class9 local201 = super.aClass8_Sub5_6.method3570();
			arg0.method4741(super.aClass124Array3, local201, local17, local179 == null ? null : local179.aClass8_Sub2Array1, 0);
		}
		this.method4203(false, super.aClass124Array3, arg0);
		if (super.aClass124Array3[2] != null) {
			if (local22 != 0) {
				super.aClass124Array3[2].method4091(local22);
			}
			super.aClass124Array3[2].method4077(super.anInt5901 - super.anInt4950, -super.anInt4959 + super.anInt5907, -super.anInt4955 + super.anInt5905);
		}
		return local179;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)I")
	@Override
	public int method4209() {
		if (this.aClass119_1.anIntArray248 != null) {
			@Pc(17) Class119 local17 = this.aClass119_1.method2882();
			if (local17 != null && local17.anInt3673 != -1) {
				return local17.anInt3673;
			}
		}
		return this.aClass119_1.anInt3673 == -1 ? super.method4209() : this.aClass119_1.anInt3673;
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)I")
	@Override
	public int method5039() {
		return super.anInt4934;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!tj;I)Z")
	private boolean method4224(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class54 local9 = this.method4201();
		@Pc(32) Class131 local32 = super.anInt4915 != -1 && super.anInt4918 == 0 ? Static343.method5604(super.anInt4915) : null;
		@Pc(48) Class131 local48 = super.anInt4911 == -1 || super.aBoolean285 && local32 != null ? null : Static343.method5604(super.anInt4911);
		@Pc(51) int local51 = local9.anInt1515;
		@Pc(54) int local54 = local9.anInt1489;
		if (local51 != 0 || local54 != 0 || local9.anInt1486 != 0 || local9.anInt1478 != 0) {
			arg0 |= 0x7;
		}
		@Pc(99) Class124 local99 = super.aClass124Array3[0] = this.aClass119_1.method2883(super.aClass46Array3, super.anInt4932, local32, super.anInt4929, super.anInt4928, arg0, super.anInt4903, super.anInt4927, super.anInt4912, local48, arg1);
		if (local99 == null) {
			return false;
		}
		super.anInt4934 = local99.method4106();
		this.method4216(local99);
		@Pc(118) int local118 = super.aClass193_7.method5174();
		super.anInt4908 = 0;
		super.anInt4890 = 0;
		super.anInt4899 = 0;
		if (local51 == 0 && local54 == 0) {
			this.method4214(this.method4208() << 7, local118, this.method4208() << 7);
		} else {
			this.method4214(local51, local118, local54);
			if (super.anInt4908 != 0) {
				super.aClass124Array3[0].method4105(super.anInt4908);
			}
			if (super.anInt4899 != 0) {
				super.aClass124Array3[0].method4111(super.anInt4899);
			}
			if (super.anInt4890 != 0) {
				super.aClass124Array3[0].method4077(0, super.anInt4890, 0);
			}
		}
		super.aClass124Array3[1] = null;
		if (super.anInt4910 != -1 && super.anInt4887 != -1) {
			@Pc(212) Class2 local212 = Static155.method1566(super.anInt4910);
			@Pc(231) Class124 local231 = local212.method9(super.anInt4930, (local212.aBoolean6 ? 7 : 2) | local5, arg1, super.anInt4891, super.anInt4887);
			if (local231 != null) {
				local231.method4077(0, -super.anInt4906, 0);
				if (local212.aBoolean6 && (local51 != 0 || local54 != 0)) {
					if (super.anInt4908 != 0) {
						local231.method4105(super.anInt4908);
					}
					if (super.anInt4899 != 0) {
						local231.method4111(super.anInt4899);
					}
					if (super.anInt4890 != 0) {
						local231.method4077(0, super.anInt4890, 0);
					}
				}
				super.aClass124Array3[1] = local231;
			}
		}
		super.aClass124Array3[2] = null;
		if (super.anInterface5_3 != null) {
			if (super.anInt4951 <= Static51.anInt1101) {
				super.anInterface5_3 = null;
			}
			if (Static51.anInt1101 >= super.anInt4949 && super.anInt4951 > Static51.anInt1101) {
				@Pc(318) Class124 local318 = super.anInterface5_3.method5339(arg1, local5 | 0x7);
				if (local318 != null) {
					local318.method4077(super.anInt4950 - super.anInt5901, super.anInt4959 - super.anInt5907, -super.anInt5905 + super.anInt4955);
					if (local118 != 0) {
						local318.method4091(local118);
					}
					super.aClass124Array3[2] = local318;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!tj;)V")
	@Override
	public void method5331(@OriginalArg(1) Class122 arg0) {
		if (this.aClass119_1 != null && (super.aBoolean286 || this.method4224(0, arg0))) {
			this.method4203(super.aBoolean286, super.aClass124Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!tj;II)Z")
	@Override
	public boolean method5330(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass119_1 == null || !this.method4224(65536, arg1)) {
			return false;
		}
		@Pc(19) Class56 local19 = arg1.method4739();
		@Pc(24) int local24 = super.aClass193_7.method5174();
		local19.method4688(local24);
		local19.method4683(super.anInt5901, super.anInt5907, super.anInt5905);
		for (@Pc(37) int local37 = 0; local37 < super.aClass124Array3.length; local37++) {
			if (super.aClass124Array3[local37] != null) {
				return super.aClass124Array3[local37].method4116(arg2, arg0, local19, this.aClass119_1.anInt3645 == 1);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5327() {
		return false;
	}
}
