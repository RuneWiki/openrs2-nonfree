import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class8_Sub3_Sub3_Sub4 extends Class8_Sub3_Sub3 implements Interface19 {

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "Lclient!nu;")
	private Class242 aClass242_6;

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "Z")
	private boolean aBoolean559;

	@OriginalMember(owner = "client!pc", name = "mb", descriptor = "S")
	private final short aShort93;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "Z")
	private final boolean aBoolean561;

	@OriginalMember(owner = "client!pc", name = "kb", descriptor = "B")
	private final byte aByte99;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "Z")
	private final boolean aBoolean562;

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "B")
	private final byte aByte98;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "Z")
	private boolean aBoolean560;

	@OriginalMember(owner = "client!pc", name = "N", descriptor = "Lclient!ha;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_5;

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "Lclient!da;")
	public Class63 aClass63_6;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!r;Lclient!et;IIIIIZIIIIIIZ)V")
	public Class8_Sub3_Sub3_Sub4(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2434 == 1, Static556.method7581(arg12, arg13));
		this.aBoolean559 = arg14;
		this.aShort93 = (short) arg1.lb;
		this.aBoolean561 = arg1.anInt2399 != 0 && !arg7;
		this.aByte99 = (byte) arg13;
		this.aBoolean562 = arg7;
		super.aByte124 = (byte) arg3;
		this.aByte98 = (byte) arg12;
		this.aBoolean560 = arg0.method6905() && arg1.aBoolean176 && !this.aBoolean562 && Static348.aClass1_Sub30_Sub1_1.method3908(Static113.anInt2222) != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean559) {
			local78 |= 0x10000;
		}
		@Pc(93) Class254 local93 = this.method5492(this.aBoolean560, arg0, local78);
		if (local93 != null) {
			this.aClass1_Sub6_Sub5_5 = local93.aClass1_Sub6_Sub5_4;
			this.aClass63_6 = local93.aClass63_5;
			if (this.aBoolean559) {
				this.aClass63_6 = this.aClass63_6.method7417((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aClass63_6 == null ? false : this.aClass63_6.LA();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!r;I)Lclient!da;")
	private Class63 method5489(@OriginalArg(1) Class134 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass63_6 != null && arg0.method6915(this.aClass63_6.PA(), arg1) == 0) {
			return this.aClass63_6;
		} else {
			@Pc(32) Class254 local32 = this.method5492(false, arg0, arg1);
			return local32 == null ? null : local32.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	@Override
	public void method7639() {
		if (this.aClass63_6 != null) {
			this.aClass63_6.method7411();
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)I")
	@Override
	public int method7638() {
		return this.aByte98;
	}

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "(I)I")
	public int method5490() {
		return this.aClass63_6 == null ? 15 : this.aClass63_6.K() / 4;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		if (this.aClass63_6 == null) {
			return null;
		}
		@Pc(17) Class113 local17 = arg0.method6963();
		local17.NA(super.anInt9365, super.anInt9361, super.anInt9370);
		@Pc(27) Class8_Sub5 local27 = null;
		if (this.aBoolean561) {
			local27 = Static418.method5818(1);
		}
		if (Static181.aBoolean242) {
			this.aClass63_6.method7420(local17, local27 == null ? null : local27.aClass8_Sub4Array1[0], Static40.anInt631, 0);
		} else {
			this.aClass63_6.method7429(local17, local27 == null ? null : local27.aClass8_Sub4Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLclient!r;I)Lclient!pa;")
	private Class254 method5492(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class95 local21 = Static518.aClass96_4.method1925(this.aShort93 & 0xFFFF);
		@Pc(29) Class47 local29;
		@Pc(37) Class47 local37;
		if (this.aBoolean562) {
			local29 = Static557.aClass47Array3[super.aByte124];
			local37 = Static216.aClass47Array2[0];
		} else {
			local29 = Static216.aClass47Array2[super.aByte124];
			if (super.aByte124 >= 3) {
				local37 = null;
			} else {
				local37 = Static216.aClass47Array2[super.aByte124 + 1];
			}
		}
		return local21.method1909(local29, super.anInt9361, this.aByte98 == 11 ? 10 : this.aByte98, arg1, arg0, super.anInt9365, arg2, this.aByte98 == 11 ? this.aByte99 + 4 : this.aByte99, local37, super.anInt9370);
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7641() {
		return this.aBoolean560;
	}

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7629() {
		return this.aBoolean559;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	@Override
	public void method7617() {
		this.aBoolean559 = false;
		if (this.aClass63_6 != null) {
			this.aClass63_6.SA(this.aClass63_6.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return this.aClass63_6 == null ? 0 : this.aClass63_6.J();
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		if (this.aClass242_6 == null) {
			this.aClass242_6 = Static82.method1472(super.anInt9370, super.anInt9365, this.method5489(arg0, 0), super.anInt9361);
		}
		return this.aClass242_6;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	@Override
	public int method7637() {
		return this.aByte99;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)I")
	@Override
	public int method7640() {
		return this.aShort93 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7642(@OriginalArg(0) Class134 arg0) {
		@Pc(14) Class1_Sub6_Sub5 local14;
		if (this.aClass1_Sub6_Sub5_5 == null && this.aBoolean560) {
			@Pc(25) Class254 local25 = this.method5492(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass1_Sub6_Sub5_4;
		} else {
			local14 = this.aClass1_Sub6_Sub5_5;
			this.aClass1_Sub6_Sub5_5 = null;
		}
		if (local14 != null) {
			Static443.method6124(local14, super.aByte124, super.anInt9365, super.anInt9370, null);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7636(@OriginalArg(0) Class134 arg0) {
		@Pc(25) Class1_Sub6_Sub5 local25;
		if (this.aClass1_Sub6_Sub5_5 == null && this.aBoolean560) {
			@Pc(18) Class254 local18 = this.method5492(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass1_Sub6_Sub5_4;
		} else {
			local25 = this.aClass1_Sub6_Sub5_5;
			this.aClass1_Sub6_Sub5_5 = null;
		}
		if (local25 != null) {
			Static439.method6098(local25, super.aByte124, super.anInt9365, super.anInt9370, null);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class63 local9 = this.method5489(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class113 local14 = arg1.method6963();
			local14.NA(super.anInt9365, super.anInt9361, super.anInt9370);
			return Static181.aBoolean242 ? local9.method7419(arg2, arg0, local14, false, Static40.anInt631) : local9.method7415(arg2, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 instanceof Class8_Sub3_Sub4_Sub2) {
			@Pc(37) Class8_Sub3_Sub4_Sub2 local37 = (Class8_Sub3_Sub4_Sub2) arg3;
			if (this.aClass63_6 == null || local37.aClass63_7 == null) {
				return;
			}
			this.aClass63_6.method7423(local37.aClass63_7, arg4, arg0, arg5, arg1);
		} else if (arg3 instanceof Class8_Sub3_Sub3_Sub4) {
			@Pc(18) Class8_Sub3_Sub3_Sub4 local18 = (Class8_Sub3_Sub3_Sub4) arg3;
			if (this.aClass63_6 != null && local18.aClass63_6 != null) {
				this.aClass63_6.method7423(local18.aClass63_6, arg4, arg0, arg5, arg1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		if (arg0 < 39) {
			this.aBoolean560 = true;
		}
		return this.aClass63_6 == null ? 0 : this.aClass63_6.RA();
	}
}
