import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class8_Sub3_Sub1_Sub1 extends Class8_Sub3_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!cca", name = "Z", descriptor = "Lclient!nu;")
	private Class242 aClass242_1;

	@OriginalMember(owner = "client!cca", name = "T", descriptor = "Z")
	private final boolean aBoolean82;

	@OriginalMember(owner = "client!cca", name = "P", descriptor = "Z")
	private final boolean aBoolean81;

	@OriginalMember(owner = "client!cca", name = "Q", descriptor = "B")
	private final byte aByte28;

	@OriginalMember(owner = "client!cca", name = "V", descriptor = "S")
	private final short aShort13;

	@OriginalMember(owner = "client!cca", name = "M", descriptor = "Z")
	private boolean aBoolean80;

	@OriginalMember(owner = "client!cca", name = "fb", descriptor = "Z")
	private final boolean aBoolean83;

	@OriginalMember(owner = "client!cca", name = "D", descriptor = "Lclient!ha;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_1;

	@OriginalMember(owner = "client!cca", name = "ab", descriptor = "Lclient!da;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!r;Lclient!et;IIIIIZIZ)V")
	public Class8_Sub3_Sub1_Sub1(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt2416);
		this.aBoolean82 = arg1.anInt2399 != 0 && !arg7;
		super.anInt9365 = arg4;
		super.anInt9370 = arg6;
		this.aBoolean81 = arg7;
		this.aByte28 = (byte) arg8;
		this.aShort13 = (short) arg1.lb;
		this.aBoolean80 = arg9;
		this.aBoolean83 = arg0.method6905() && arg1.aBoolean176 && !this.aBoolean81 && Static348.aClass1_Sub30_Sub1_1.method3908(Static113.anInt2222) != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean80) {
			local66 |= 0x10000;
		}
		@Pc(81) Class254 local81 = this.method936(this.aBoolean83, arg0, local66);
		if (local81 != null) {
			this.aClass1_Sub6_Sub5_1 = local81.aClass1_Sub6_Sub5_4;
			this.aClass63_1 = local81.aClass63_5;
			if (this.aBoolean80) {
				this.aClass63_1 = this.aClass63_1.method7417((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		if (this.aClass242_1 == null) {
			this.aClass242_1 = Static82.method1472(super.anInt9370, super.anInt9365, this.method934(arg0, 0), super.anInt9361);
		}
		return this.aClass242_1;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!r;BI)Lclient!da;")
	private Class63 method934(@OriginalArg(0) Class134 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass63_1 != null && arg0.method6915(this.aClass63_1.PA(), arg1) == 0) {
			return this.aClass63_1;
		} else {
			@Pc(32) Class254 local32 = this.method936(false, arg0, arg1);
			return local32 == null ? null : local32.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return this.aClass63_1 == null ? 0 : this.aClass63_1.J();
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7642(@OriginalArg(0) Class134 arg0) {
		@Pc(25) Class1_Sub6_Sub5 local25;
		if (this.aClass1_Sub6_Sub5_1 == null && this.aBoolean83) {
			@Pc(18) Class254 local18 = this.method936(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass1_Sub6_Sub5_4;
		} else {
			local25 = this.aClass1_Sub6_Sub5_1;
			this.aClass1_Sub6_Sub5_1 = null;
		}
		if (local25 != null) {
			Static443.method6124(local25, super.aByte124, super.anInt9365, super.anInt9370, null);
		}
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		if (this.aClass63_1 == null) {
			return null;
		}
		@Pc(11) Class113 local11 = arg0.method6963();
		local11.NA(super.anInt9365, super.anInt9361, super.anInt9370);
		@Pc(28) Class8_Sub5 local28 = null;
		if (this.aBoolean82) {
			local28 = Static418.method5818(1);
		}
		if (Static181.aBoolean242) {
			this.aClass63_1.method7420(local11, local28 == null ? null : local28.aClass8_Sub4Array1[0], Static40.anInt631, 0);
		} else {
			this.aClass63_1.method7429(local11, local28 == null ? null : local28.aClass8_Sub4Array1[0], 0);
		}
		return local28;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 instanceof Class8_Sub3_Sub1_Sub1) {
			@Pc(5) Class8_Sub3_Sub1_Sub1 local5 = (Class8_Sub3_Sub1_Sub1) arg3;
			if (this.aClass63_1 != null && local5.aClass63_1 != null) {
				this.aClass63_1.method7423(local5.aClass63_1, arg4, arg0, arg5, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7636(@OriginalArg(0) Class134 arg0) {
		@Pc(14) Class1_Sub6_Sub5 local14;
		if (this.aClass1_Sub6_Sub5_1 == null && this.aBoolean83) {
			@Pc(25) Class254 local25 = this.method936(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass1_Sub6_Sub5_4;
		} else {
			local14 = this.aClass1_Sub6_Sub5_1;
			this.aClass1_Sub6_Sub5_1 = null;
		}
		if (local14 != null) {
			Static439.method6098(local14, super.aByte124, super.anInt9365, super.anInt9370, null);
		}
	}

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7629() {
		return this.aBoolean80;
	}

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aClass63_1 == null ? false : this.aClass63_1.LA();
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		if (arg0 < 39) {
			return -3;
		} else if (this.aClass63_1 == null) {
			return 0;
		} else {
			return this.aClass63_1.RA();
		}
	}

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7641() {
		return this.aBoolean83;
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)V")
	@Override
	public void method7639() {
		if (this.aClass63_1 != null) {
			this.aClass63_1.method7411();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
	}

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return true;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)I")
	@Override
	public int method7638() {
		return 22;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)I")
	@Override
	public int method7640() {
		return this.aShort13 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)I")
	@Override
	public int method7637() {
		return this.aByte28;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZLclient!r;I)Lclient!pa;")
	private Class254 method936(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class95 local13 = Static518.aClass96_4.method1925(this.aShort13 & 0xFFFF);
		@Pc(28) Class47 local28;
		@Pc(32) Class47 local32;
		if (this.aBoolean81) {
			local28 = Static557.aClass47Array3[super.aByte124];
			local32 = Static216.aClass47Array2[0];
		} else {
			local28 = Static216.aClass47Array2[super.aByte124];
			if (super.aByte124 >= 3) {
				local32 = null;
			} else {
				local32 = Static216.aClass47Array2[super.aByte124 + 1];
			}
		}
		return local13.method1909(local28, super.anInt9361, 22, arg1, arg0, super.anInt9365, arg2, this.aByte28, local32, super.anInt9370);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class63 local16 = this.method934(arg1, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class113 local21 = arg1.method6963();
			local21.NA(super.anInt9365, super.anInt9361, super.anInt9370);
			return Static181.aBoolean242 ? local16.method7419(arg2, arg0, local21, false, Static40.anInt631) : local16.method7415(arg2, arg0, local21, false);
		}
	}

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "(I)V")
	@Override
	public void method7617() {
		this.aBoolean80 = false;
		if (this.aClass63_1 != null) {
			this.aClass63_1.SA(this.aClass63_1.PA() & 0xFFFEFFFF);
		}
	}
}
