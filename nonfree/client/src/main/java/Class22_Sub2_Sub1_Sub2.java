import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class22_Sub2_Sub1_Sub2 extends Class22_Sub2_Sub1 {

	@OriginalMember(owner = "client!qo", name = "Nc", descriptor = "Lclient!qr;")
	public Class174 aClass174_1;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)I")
	@Override
	public int method4410() {
		if (this.aClass174_1.anIntArray670 != null) {
			@Pc(17) Class174 local17 = this.aClass174_1.method4438();
			if (local17 != null && local17.anInt5198 != -1) {
				return local17.anInt5198;
			}
		}
		return this.aClass174_1.anInt5198;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		if (this.aClass174_1 == null || !this.method4425(65536, arg2)) {
			return false;
		}
		@Pc(19) Class70 local19 = arg2.method5427();
		@Pc(26) int local26 = super.aClass54_7.method1294();
		local19.method3711(local26);
		local19.method3707(super.anInt5973, super.anInt5968, super.anInt5967);
		for (@Pc(44) int local44 = 0; local44 < super.aClass31Array3.length; local44++) {
			if (super.aClass31Array3[local44] != null) {
				return super.aClass31Array3[local44].method1932(arg1, arg0, local19, this.aClass174_1.anInt5191 == 1);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "(I)Z")
	public boolean method4423() {
		return this.aClass174_1 != null;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!pe;Z)Z")
	private boolean method4425(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class79 local9 = this.method4417();
		@Pc(27) Class170 local27 = super.anInt5133 != -1 && super.anInt5093 == 0 ? Static261.method4379(super.anInt5133) : null;
		@Pc(43) Class170 local43 = super.anInt5100 == -1 || super.aBoolean378 && local27 != null ? null : Static261.method4379(super.anInt5100);
		@Pc(46) int local46 = local9.anInt2392;
		@Pc(49) int local49 = local9.anInt2366;
		if (local46 != 0 || local49 != 0 || local9.anInt2386 != 0 || local9.anInt2355 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) Class31 local100 = super.aClass31Array3[0] = this.aClass174_1.method4445(super.anInt5132, super.anInt5081, arg0, super.anInt5143, super.anInt5085, local27, super.anInt5117, arg1, super.anInt5137, local43, super.aClass190Array3);
		if (local100 == null) {
			return false;
		}
		super.anInt5107 = local100.method1920();
		this.method4412(local100);
		@Pc(122) int local122 = super.aClass54_7.method1294();
		super.anInt5135 = 0;
		super.anInt5142 = 0;
		super.anInt5126 = 0;
		if (local46 == 0 && local49 == 0) {
			this.method4422(this.method4421() << 7, this.method4421() << 7, local122);
		} else {
			this.method4422(local46, local49, local122);
			if (super.anInt5142 != 0) {
				super.aClass31Array3[0].method1913(super.anInt5142);
			}
			if (super.anInt5135 != 0) {
				super.aClass31Array3[0].method1924(super.anInt5135);
			}
			if (super.anInt5126 != 0) {
				super.aClass31Array3[0].method1915(0, super.anInt5126, 0);
			}
		}
		super.aClass31Array3[1] = null;
		if (super.anInt5129 != -1 && super.anInt5123 != -1) {
			@Pc(210) Class197 local210 = Static10.method162(super.anInt5129);
			@Pc(229) Class31 local229 = local210.method5136(super.anInt5123, super.anInt5131, arg1, super.anInt5127, local5 | (local210.aBoolean443 ? 7 : 2));
			if (local229 != null) {
				local229.method1915(0, -super.anInt5090, 0);
				if (local210.aBoolean443 && (local46 != 0 || local49 != 0)) {
					if (super.anInt5142 != 0) {
						local229.method1913(super.anInt5142);
					}
					if (super.anInt5135 != 0) {
						local229.method1924(super.anInt5135);
					}
					if (super.anInt5126 != 0) {
						local229.method1915(0, super.anInt5126, 0);
					}
				}
				super.aClass31Array3[1] = local229;
			}
		}
		super.aClass31Array3[2] = null;
		if (super.anInterface1_3 != null) {
			if (Static212.anInt4234 >= super.anInt5147) {
				super.anInterface1_3 = null;
			}
			if (Static212.anInt4234 >= super.anInt5148 && super.anInt5147 > Static212.anInt4234) {
				@Pc(312) Class31 local312 = super.anInterface1_3.method5364(arg1, local5 | 0x7);
				if (local312 != null) {
					local312.method1915(-super.anInt5973 + super.anInt5156, -super.anInt5968 + super.anInt5145, -super.anInt5967 + super.anInt5154);
					if (local122 != 0) {
						local312.method1956(local122);
					}
					super.aClass31Array3[2] = local312;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!qr;I)V")
	public void method4426(@OriginalArg(0) Class174 arg0) {
		this.aClass174_1 = arg0;
		if (super.aClass36_Sub3_5 != null) {
			super.aClass36_Sub3_5.method2177();
		}
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)I")
	@Override
	public int method5057() {
		return super.anInt5107;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
		if (this.aClass174_1 != null && (super.aBoolean380 || this.method4425(0, arg0))) {
			this.method4409(super.aClass31Array3, arg0, super.aBoolean380);
		}
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5343() {
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "(B)Z")
	private boolean method4428() {
		return this.aClass174_1.aBoolean384;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		if (this.aClass174_1 == null || !this.method4425(1024, arg0)) {
			return null;
		}
		@Pc(17) Class70 local17 = arg0.method5427();
		@Pc(22) int local22 = super.aClass54_7.method1294();
		local17.method3711(local22);
		local17.method3706(super.anInt5973, super.anInt5968, super.anInt5967);
		@Pc(42) Class79 local42 = this.method4417();
		@Pc(54) Class174 local54 = this.aClass174_1.anIntArray670 == null ? this.aClass174_1 : this.aClass174_1.method4438();
		if (Static231.aBoolean341 && local54.aBoolean382 && local42.aBoolean163) {
			@Pc(80) Class170 local80 = super.anInt5133 != -1 && super.anInt5093 == 0 ? Static261.method4379(super.anInt5133) : null;
			@Pc(96) Class170 local96 = super.anInt5100 == -1 || super.aBoolean378 && local80 != null ? null : Static261.method4379(super.anInt5100);
			@Pc(148) Class31 local148 = Static91.method5056(this.aClass174_1.aShort69 & 0xFFFF, arg0, this.aClass174_1.anInt5191, this.aClass174_1.aShort67 & 0xFFFF, super.anInt5135, super.anInt5126, super.aClass31Array3[0], local96 == null ? local80 : local96, this.aClass174_1.aByte55 & 0xFF, super.aBoolean376, this.aClass174_1.aByte57 & 0xFF, local22, local96 == null ? super.anInt5117 : super.anInt5081, super.anInt5142);
			if (local148 != null) {
				@Pc(153) float local153 = arg0.method5424();
				@Pc(156) float local156 = arg0.method5478();
				arg0.method5446(false);
				arg0.method5463(local153, local156 - 150.0F);
				local148.method1928(local17, null, 0);
				arg0.method5463(local153, local156);
				arg0.method5446(true);
			}
		}
		@Pc(179) Class36_Sub1 local179 = null;
		if (this.method4428()) {
			local179 = Static184.method3381(super.aClass31Array3.length);
		}
		if (super.aClass36_Sub3_5 == null) {
			arg0.method5472(super.aClass31Array3, local17, local179 == null ? null : local179.aClass36_Sub6Array1, 0);
		} else {
			@Pc(210) Class24 local210 = super.aClass36_Sub3_5.method2176();
			arg0.method5428(super.aClass31Array3, local210, local17, local179 == null ? null : local179.aClass36_Sub6Array1, 0);
		}
		this.method4409(super.aClass31Array3, arg0, false);
		if (super.aClass31Array3[2] != null) {
			if (local22 != 0) {
				super.aClass31Array3[2].method1956(local22);
			}
			super.aClass31Array3[2].method1915(-super.anInt5156 + super.anInt5973, super.anInt5968 + -super.anInt5145, -super.anInt5154 + super.anInt5967);
		}
		return local179;
	}

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "(I)I")
	@Override
	protected int method4418() {
		if (this.aClass174_1.anIntArray670 != null) {
			@Pc(12) Class174 local12 = this.aClass174_1.method4438();
			if (local12 != null && local12.anInt5179 != -1) {
				return local12.anInt5179;
			}
		}
		return this.aClass174_1.anInt5179;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(B)V")
	@Override
	public void method5338() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
	@Override
	public int method4407() {
		if (this.aClass174_1.anIntArray670 != null) {
			@Pc(17) Class174 local17 = this.aClass174_1.method4438();
			if (local17 != null && local17.anInt5211 != -1) {
				return local17.anInt5211;
			}
		}
		return this.aClass174_1.anInt5211 == -1 ? super.method4407() : this.aClass174_1.anInt5211;
	}
}
