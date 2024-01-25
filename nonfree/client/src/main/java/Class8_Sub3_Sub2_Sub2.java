import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class8_Sub3_Sub2_Sub2 extends Class8_Sub3_Sub2 implements Interface19 {

	@OriginalMember(owner = "client!hr", name = "H", descriptor = "Lclient!nu;")
	private Class242 aClass242_4;

	@OriginalMember(owner = "client!hr", name = "W", descriptor = "S")
	private final short aShort52;

	@OriginalMember(owner = "client!hr", name = "M", descriptor = "Z")
	private final boolean aBoolean308;

	@OriginalMember(owner = "client!hr", name = "cb", descriptor = "B")
	private final byte aByte66;

	@OriginalMember(owner = "client!hr", name = "N", descriptor = "Z")
	private final boolean aBoolean309;

	@OriginalMember(owner = "client!hr", name = "O", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!hr", name = "Q", descriptor = "Z")
	private boolean aBoolean310;

	@OriginalMember(owner = "client!hr", name = "R", descriptor = "Lclient!da;")
	private Class63 aClass63_3;

	@OriginalMember(owner = "client!hr", name = "L", descriptor = "Lclient!ha;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_2;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!r;Lclient!et;IIIIIZIIII)V")
	public Class8_Sub3_Sub2_Sub2(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt9370 = arg6;
		this.aShort52 = (short) arg1.lb;
		this.aBoolean308 = arg7;
		super.anInt9365 = arg4;
		this.aByte66 = (byte) arg11;
		this.aBoolean309 = arg1.anInt2399 != 0 && !arg7;
		this.aByte65 = (byte) arg10;
		this.aBoolean310 = arg0.method6905() && arg1.aBoolean176 && !this.aBoolean308 && Static348.aClass1_Sub30_Sub1_1.method3908(Static113.anInt2222) != 0;
		@Pc(70) Class254 local70 = this.method3244(this.aBoolean310, 2048, arg0);
		if (local70 != null) {
			this.aClass63_3 = local70.aClass63_5;
			this.aClass1_Sub6_Sub5_2 = local70.aClass1_Sub6_Sub5_4;
		}
	}

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return true;
	}

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aClass63_3 == null ? false : this.aClass63_3.LA();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7642(@OriginalArg(0) Class134 arg0) {
		@Pc(31) Class1_Sub6_Sub5 local31;
		if (this.aClass1_Sub6_Sub5_2 == null && this.aBoolean310) {
			@Pc(24) Class254 local24 = this.method3244(true, 262144, arg0);
			local31 = local24 == null ? null : local24.aClass1_Sub6_Sub5_4;
		} else {
			local31 = this.aClass1_Sub6_Sub5_2;
			this.aClass1_Sub6_Sub5_2 = null;
		}
		if (local31 != null) {
			Static443.method6124(local31, super.aByte124, super.anInt9365, super.anInt9370, null);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZZILclient!r;)Lclient!pa;")
	private Class254 method3244(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class134 arg2) {
		@Pc(13) Class95 local13 = Static518.aClass96_4.method1925(this.aShort52 & 0xFFFF);
		@Pc(43) Class47 local43;
		@Pc(29) Class47 local29;
		if (this.aBoolean308) {
			local43 = Static557.aClass47Array3[super.aByte124];
			local29 = Static216.aClass47Array2[0];
		} else {
			if (super.aByte124 >= 3) {
				local29 = null;
			} else {
				local29 = Static216.aClass47Array2[super.aByte124 + 1];
			}
			local43 = Static216.aClass47Array2[super.aByte124];
		}
		return local13.method1909(local43, super.anInt9361, this.aByte65, arg2, arg0, super.anInt9365, arg1, this.aByte66, local29, super.anInt9370);
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)I")
	@Override
	public int method7638() {
		return this.aByte65;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		if (this.aClass63_3 == null) {
			return null;
		}
		@Pc(11) Class113 local11 = arg0.method6963();
		local11.NA(super.anInt9365 + super.aShort51, super.anInt9361, super.aShort50 + super.anInt9370);
		@Pc(33) Class8_Sub5 local33 = null;
		if (this.aBoolean309) {
			local33 = Static418.method5818(1);
		}
		if (Static181.aBoolean242) {
			this.aClass63_3.method7420(local11, local33 == null ? null : local33.aClass8_Sub4Array1[0], Static40.anInt631, 0);
		} else {
			this.aClass63_3.method7429(local11, local33 == null ? null : local33.aClass8_Sub4Array1[0], 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I")
	@Override
	public int method7637() {
		return this.aByte66;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		if (arg0 < 39) {
			this.aBoolean310 = false;
		}
		return this.aClass63_3 == null ? 0 : this.aClass63_3.RA();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)I")
	@Override
	public int method7640() {
		return this.aShort52 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7636(@OriginalArg(0) Class134 arg0) {
		@Pc(25) Class1_Sub6_Sub5 local25;
		if (this.aClass1_Sub6_Sub5_2 == null && this.aBoolean310) {
			@Pc(18) Class254 local18 = this.method3244(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass1_Sub6_Sub5_4;
		} else {
			local25 = this.aClass1_Sub6_Sub5_2;
			this.aClass1_Sub6_Sub5_2 = null;
		}
		if (local25 != null) {
			Static439.method6098(local25, super.aByte124, super.anInt9365, super.anInt9370, null);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class63 local9 = this.method3246(arg1, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class113 local20 = arg1.method6963();
			local20.NA(super.anInt9365, super.anInt9361, super.anInt9370);
			return Static181.aBoolean242 ? local9.method7419(arg2, arg0, local20, false, Static40.anInt631) : local9.method7415(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		if (this.aClass242_4 == null) {
			this.aClass242_4 = Static82.method1472(super.anInt9370, super.anInt9365, this.method3246(arg0, 0), super.anInt9361);
		}
		return this.aClass242_4;
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7641() {
		return this.aBoolean310;
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
	@Override
	public void method7639() {
		if (this.aClass63_3 != null) {
			this.aClass63_3.method7411();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!r;I)Lclient!da;")
	private Class63 method3246(@OriginalArg(1) Class134 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass63_3 != null && arg0.method6915(this.aClass63_3.PA(), arg1) == 0) {
			return this.aClass63_3;
		} else {
			@Pc(34) Class254 local34 = this.method3244(false, arg1, arg0);
			return local34 == null ? null : local34.aClass63_5;
		}
	}

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return this.aClass63_3 == null ? 0 : this.aClass63_3.J();
	}
}
