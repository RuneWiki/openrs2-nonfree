import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class41_Sub2_Sub2_Sub2 extends Class41_Sub2_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!fda", name = "mb", descriptor = "Lclient!lf;")
	private Class189 aClass189_3;

	@OriginalMember(owner = "client!fda", name = "nb", descriptor = "B")
	private final byte aByte32;

	@OriginalMember(owner = "client!fda", name = "fb", descriptor = "Z")
	private final boolean aBoolean249;

	@OriginalMember(owner = "client!fda", name = "kb", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!fda", name = "Z", descriptor = "Z")
	private final boolean aBoolean248;

	@OriginalMember(owner = "client!fda", name = "V", descriptor = "S")
	private final short aShort37;

	@OriginalMember(owner = "client!fda", name = "L", descriptor = "Z")
	private final boolean aBoolean247;

	@OriginalMember(owner = "client!fda", name = "X", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub13 aClass3_Sub7_Sub13_2;

	@OriginalMember(owner = "client!fda", name = "T", descriptor = "Lclient!da;")
	private Class60 aClass60_2;

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lclient!r;Lclient!qp;IIIIIZIIII)V")
	public Class41_Sub2_Sub2_Sub2(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aByte32 = (byte) arg11;
		this.aBoolean249 = arg1.anInt7380 != 0 && !arg7;
		super.anInt9442 = arg6;
		this.aByte31 = (byte) arg10;
		super.anInt9444 = arg4;
		this.aBoolean248 = arg7;
		this.aShort37 = (short) arg1.anInt7369;
		this.aBoolean247 = arg0.method7404() && arg1.aBoolean561 && !this.aBoolean248 && Static405.aClass3_Sub3_Sub1_1.method6299(Static60.anInt1312) != 0;
		@Pc(73) Class131 local73 = this.method2760(arg0, 2048, this.aBoolean247);
		if (local73 != null) {
			this.aClass3_Sub7_Sub13_2 = local73.aClass3_Sub7_Sub13_3;
			this.aClass60_2 = local73.aClass60_3;
		}
	}

	@OriginalMember(owner = "client!fda", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		if (this.aClass189_3 == null) {
			this.aClass189_3 = Static36.method588(super.anInt9442, this.method2759(arg0, 0), super.anInt9443, super.anInt9444);
		}
		return this.aClass189_3;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7557(@OriginalArg(0) Class45 arg0) {
		@Pc(14) Class3_Sub7_Sub13 local14;
		if (this.aClass3_Sub7_Sub13_2 == null && this.aBoolean247) {
			@Pc(25) Class131 local25 = this.method2760(arg0, 262144, true);
			local14 = local25 == null ? null : local25.aClass3_Sub7_Sub13_3;
		} else {
			local14 = this.aClass3_Sub7_Sub13_2;
			this.aClass3_Sub7_Sub13_2 = null;
		}
		if (local14 != null) {
			Static546.method7274(local14, super.aByte118, super.anInt9444, super.anInt9442, null);
		}
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.aShort37 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7558() {
		return this.aBoolean247;
	}

	@OriginalMember(owner = "client!fda", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aClass60_2 == null ? false : this.aClass60_2.LA();
	}

	@OriginalMember(owner = "client!fda", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		if (arg0 <= 119) {
			this.method7556();
		}
		return this.aClass60_2 == null ? 0 : this.aClass60_2.RA();
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)I")
	@Override
	public int method7562() {
		return this.aByte32;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class60 local9 = this.method2759(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class11 local14 = arg0.method7397();
			local14.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			return Static453.aBoolean599 ? local9.method7237(arg1, arg2, local14, false, Static340.anInt5962) : local9.method7246(arg1, arg2, local14, false);
		}
	}

	@OriginalMember(owner = "client!fda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return true;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!r;II)Lclient!da;")
	private Class60 method2759(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass60_2 != null && arg0.method7393(this.aClass60_2.PA(), arg1) == 0) {
			return this.aClass60_2;
		} else {
			@Pc(30) Class131 local30 = this.method2760(arg0, arg1, false);
			return local30 == null ? null : local30.aClass60_3;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)I")
	@Override
	public int method7556() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!fda", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		if (this.aClass60_2 == null) {
			return null;
		}
		@Pc(11) Class11 local11 = arg0.method7397();
		local11.NA(super.anInt9444 + super.aShort35, super.anInt9443, super.aShort36 + super.anInt9442);
		@Pc(34) Class41_Sub10 local34 = null;
		if (this.aBoolean249) {
			local34 = Static458.method6411(1);
		}
		if (Static453.aBoolean599) {
			this.aClass60_2.method7224(local11, local34 == null ? null : local34.aClass41_Sub8Array1[0], Static340.anInt5962, 0);
		} else {
			this.aClass60_2.method7230(local11, local34 == null ? null : local34.aClass41_Sub8Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!fda", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.aClass60_2 == null ? 0 : this.aClass60_2.J();
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!r;IZI)Lclient!hi;")
	private Class131 method2760(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class280 local13 = Static478.aClass212_3.method4793(this.aShort37 & 0xFFFF);
		@Pc(27) Class34 local27;
		@Pc(38) Class34 local38;
		if (this.aBoolean248) {
			local38 = Static108.aClass34Array6[0];
			local27 = Static426.aClass34Array5[super.aByte118];
		} else {
			local27 = Static108.aClass34Array6[super.aByte118];
			if (super.aByte118 < 3) {
				local38 = Static108.aClass34Array6[super.aByte118 + 1];
			} else {
				local38 = null;
			}
		}
		return local13.method6168(super.anInt9444, super.anInt9443, arg0, super.anInt9442, local27, arg1, this.aByte31, arg2, this.aByte32, local38);
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7560(@OriginalArg(0) Class45 arg0) {
		@Pc(20) Class3_Sub7_Sub13 local20;
		if (this.aClass3_Sub7_Sub13_2 == null && this.aBoolean247) {
			@Pc(31) Class131 local31 = this.method2760(arg0, 262144, true);
			local20 = local31 == null ? null : local31.aClass3_Sub7_Sub13_3;
		} else {
			local20 = this.aClass3_Sub7_Sub13_2;
			this.aClass3_Sub7_Sub13_2 = null;
		}
		if (local20 != null) {
			Static58.method1201(local20, super.aByte118, super.anInt9444, super.anInt9442, null);
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
	@Override
	public void method7559() {
		if (this.aClass60_2 != null) {
			this.aClass60_2.method7231();
		}
	}
}
