import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class8_Sub3_Sub4_Sub2 extends Class8_Sub3_Sub4 implements Interface19 {

	@OriginalMember(owner = "client!ru", name = "M", descriptor = "Lclient!nu;")
	private Class242 aClass242_7;

	@OriginalMember(owner = "client!ru", name = "A", descriptor = "S")
	private final short aShort117;

	@OriginalMember(owner = "client!ru", name = "J", descriptor = "B")
	private final byte aByte109;

	@OriginalMember(owner = "client!ru", name = "U", descriptor = "Z")
	private final boolean aBoolean610;

	@OriginalMember(owner = "client!ru", name = "B", descriptor = "Z")
	private final boolean aBoolean609;

	@OriginalMember(owner = "client!ru", name = "hb", descriptor = "Z")
	private boolean aBoolean611;

	@OriginalMember(owner = "client!ru", name = "fb", descriptor = "B")
	private final byte aByte110;

	@OriginalMember(owner = "client!ru", name = "y", descriptor = "Z")
	private final boolean aBoolean608;

	@OriginalMember(owner = "client!ru", name = "I", descriptor = "Lclient!da;")
	public Class63 aClass63_7;

	@OriginalMember(owner = "client!ru", name = "L", descriptor = "Lclient!ha;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_6;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!r;Lclient!et;IIIIIZIIZ)V")
	public Class8_Sub3_Sub4_Sub2(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static411.method5665(arg8, arg9));
		this.aShort117 = (short) arg1.lb;
		this.aByte109 = (byte) arg9;
		this.aBoolean610 = arg7;
		this.aBoolean609 = arg1.anInt2399 != 0 && !arg7;
		this.aBoolean611 = arg10;
		super.anInt9370 = arg6;
		super.anInt9365 = arg4;
		this.aByte110 = (byte) arg8;
		this.aBoolean608 = arg0.method6905() && arg1.aBoolean176 && !this.aBoolean610 && Static348.aClass1_Sub30_Sub1_1.method3908(Static113.anInt2222) != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean611) {
			local72 |= 0x10000;
		}
		@Pc(87) Class254 local87 = this.method6379(arg0, this.aBoolean608, local72);
		if (local87 != null) {
			this.aClass63_7 = local87.aClass63_5;
			this.aClass1_Sub6_Sub5_6 = local87.aClass1_Sub6_Sub5_4;
			if (this.aBoolean611) {
				this.aClass63_7 = this.aClass63_7.method7417((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		if (arg0 <= 39) {
			return -64;
		} else if (this.aClass63_7 == null) {
			return 0;
		} else {
			return this.aClass63_7.RA();
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)I")
	@Override
	public int method7638() {
		return this.aByte110;
	}

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aClass63_7 == null ? false : this.aClass63_7.LA();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class63 local9 = this.method6377(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class113 local20 = arg1.method6963();
			local20.NA(super.anInt9365, super.anInt9361, super.anInt9370);
			return Static181.aBoolean242 ? local9.method7419(arg2, arg0, local20, false, Static40.anInt631) : local9.method7415(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7636(@OriginalArg(0) Class134 arg0) {
		@Pc(30) Class1_Sub6_Sub5 local30;
		if (this.aClass1_Sub6_Sub5_6 == null && this.aBoolean608) {
			@Pc(23) Class254 local23 = this.method6379(arg0, true, 262144);
			local30 = local23 == null ? null : local23.aClass1_Sub6_Sub5_4;
		} else {
			local30 = this.aClass1_Sub6_Sub5_6;
			this.aClass1_Sub6_Sub5_6 = null;
		}
		if (local30 != null) {
			Static439.method6098(local30, super.aByte124, super.anInt9365, super.anInt9370, null);
		}
	}

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7629() {
		return this.aBoolean611;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
	@Override
	public void method7639() {
		if (this.aClass63_7 != null) {
			this.aClass63_7.method7411();
		}
	}

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return true;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)I")
	@Override
	public int method7640() {
		return this.aShort117 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)I")
	@Override
	public int method7637() {
		return this.aByte109;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7642(@OriginalArg(0) Class134 arg0) {
		@Pc(31) Class1_Sub6_Sub5 local31;
		if (this.aClass1_Sub6_Sub5_6 == null && this.aBoolean608) {
			@Pc(24) Class254 local24 = this.method6379(arg0, true, 262144);
			local31 = local24 == null ? null : local24.aClass1_Sub6_Sub5_4;
		} else {
			local31 = this.aClass1_Sub6_Sub5_6;
			this.aClass1_Sub6_Sub5_6 = null;
		}
		if (local31 != null) {
			Static443.method6124(local31, super.aByte124, super.anInt9365, super.anInt9370, null);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BILclient!r;)Lclient!da;")
	private Class63 method6377(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1) {
		if (this.aClass63_7 != null && arg1.method6915(this.aClass63_7.PA(), arg0) == 0) {
			return this.aClass63_7;
		} else {
			@Pc(31) Class254 local31 = this.method6379(arg1, false, arg0);
			return local31 == null ? null : local31.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		if (this.aClass242_7 == null) {
			this.aClass242_7 = Static82.method1472(super.anInt9370, super.anInt9365, this.method6377(0, arg0), super.anInt9361);
		}
		return this.aClass242_7;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLclient!r;ZI)Lclient!pa;")
	private Class254 method6379(@OriginalArg(1) Class134 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class95 local19 = Static518.aClass96_4.method1925(this.aShort117 & 0xFFFF);
		@Pc(27) Class47 local27;
		@Pc(31) Class47 local31;
		if (this.aBoolean610) {
			local27 = Static557.aClass47Array3[super.aByte124];
			local31 = Static216.aClass47Array2[0];
		} else {
			if (super.aByte124 < 3) {
				local31 = Static216.aClass47Array2[super.aByte124 + 1];
			} else {
				local31 = null;
			}
			local27 = Static216.aClass47Array2[super.aByte124];
		}
		return local19.method1909(local27, super.anInt9361, this.aByte110, arg0, arg1, super.anInt9365, arg2, this.aByte109, local31, super.anInt9370);
	}

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return this.aClass63_7 == null ? 0 : this.aClass63_7.J();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZLclient!r;Lclient!rga;IIZ)V")
	@Override
	public void method7623(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) Class8_Sub3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 instanceof Class8_Sub3_Sub4_Sub2) {
			@Pc(28) Class8_Sub3_Sub4_Sub2 local28 = (Class8_Sub3_Sub4_Sub2) arg3;
			if (this.aClass63_7 != null && local28.aClass63_7 != null) {
				this.aClass63_7.method7423(local28.aClass63_7, arg4, arg0, arg5, arg1);
			}
		} else if (arg3 instanceof Class8_Sub3_Sub3_Sub4) {
			@Pc(8) Class8_Sub3_Sub3_Sub4 local8 = (Class8_Sub3_Sub3_Sub4) arg3;
			if (this.aClass63_7 != null && local8.aClass63_6 != null) {
				this.aClass63_7.method7423(local8.aClass63_6, arg4, arg0, arg5, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7641() {
		return this.aBoolean608;
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		if (this.aClass63_7 == null) {
			return null;
		}
		@Pc(17) Class113 local17 = arg0.method6963();
		local17.NA(super.anInt9365, super.anInt9361, super.anInt9370);
		@Pc(27) Class8_Sub5 local27 = null;
		if (this.aBoolean609) {
			local27 = Static418.method5818(1);
		}
		if (Static181.aBoolean242) {
			this.aClass63_7.method7420(local17, local27 == null ? null : local27.aClass8_Sub4Array1[0], Static40.anInt631, 0);
		} else {
			this.aClass63_7.method7429(local17, local27 == null ? null : local27.aClass8_Sub4Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)V")
	@Override
	public void method7617() {
		this.aBoolean611 = false;
		if (this.aClass63_7 != null) {
			this.aClass63_7.SA(this.aClass63_7.PA() & 0xFFFEFFFF);
		}
	}
}
