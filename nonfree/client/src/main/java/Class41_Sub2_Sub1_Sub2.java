import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class41_Sub2_Sub1_Sub2 extends Class41_Sub2_Sub1 implements Interface4 {

	@OriginalMember(owner = "client!ci", name = "db", descriptor = "Lclient!lf;")
	private Class189 aClass189_1;

	@OriginalMember(owner = "client!ci", name = "P", descriptor = "Z")
	private final boolean aBoolean124;

	@OriginalMember(owner = "client!ci", name = "gb", descriptor = "Z")
	private final boolean aBoolean126;

	@OriginalMember(owner = "client!ci", name = "lb", descriptor = "Z")
	private boolean lb;

	@OriginalMember(owner = "client!ci", name = "V", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!ci", name = "Z", descriptor = "S")
	private final short aShort20;

	@OriginalMember(owner = "client!ci", name = "pb", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "Z")
	private final boolean aBoolean125;

	@OriginalMember(owner = "client!ci", name = "N", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub13 aClass3_Sub7_Sub13_1;

	@OriginalMember(owner = "client!ci", name = "hb", descriptor = "Lclient!da;")
	public Class60 aClass60_1;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!r;Lclient!qp;IIIIIZIIIIIIZ)V")
	public Class41_Sub2_Sub1_Sub2(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7399 == 1, Static404.method5854(arg13, arg12));
		this.aBoolean124 = arg7;
		this.aBoolean126 = arg1.anInt7380 != 0 && !arg7;
		super.aByte118 = (byte) arg3;
		this.lb = arg14;
		this.aByte13 = (byte) arg12;
		this.aShort20 = (short) arg1.anInt7369;
		this.aByte14 = (byte) arg13;
		this.aBoolean125 = arg0.method7404() && arg1.aBoolean561 && !this.aBoolean124 && Static405.aClass3_Sub3_Sub1_1.method6299(Static60.anInt1312) != 0;
		@Pc(77) int local77 = 2048;
		if (this.lb) {
			local77 |= 0x10000;
		}
		@Pc(92) Class131 local92 = this.method1486(this.aBoolean125, local77, arg0);
		if (local92 != null) {
			this.aClass3_Sub7_Sub13_1 = local92.aClass3_Sub7_Sub13_3;
			this.aClass60_1 = local92.aClass60_3;
			if (this.lb) {
				this.aClass60_1 = this.aClass60_1.method7229((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		if (this.aClass189_1 == null) {
			this.aClass189_1 = Static36.method588(super.anInt9442, this.method1484(0, arg0), super.anInt9443, super.anInt9444);
		}
		return this.aClass189_1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return this.lb;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7558() {
		return this.aBoolean125;
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		if (arg0 <= 119) {
			this.method7557(null);
		}
		return this.aClass60_1 == null ? 0 : this.aClass60_1.RA();
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(Z)I")
	public int method1483() {
		return this.aClass60_1 == null ? 15 : this.aClass60_1.K() / 4;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class60 local11 = this.method1484(131072, arg0);
		if (local11 == null) {
			return false;
		} else {
			@Pc(16) Class11 local16 = arg0.method7397();
			local16.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			return Static453.aBoolean599 ? local11.method7237(arg1, arg2, local16, false, Static340.anInt5962) : local11.method7246(arg1, arg2, local16, false);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!r;)Lclient!da;")
	private Class60 method1484(@OriginalArg(0) int arg0, @OriginalArg(2) Class45 arg1) {
		if (this.aClass60_1 != null && arg1.method7393(this.aClass60_1.PA(), arg0) == 0) {
			return this.aClass60_1;
		} else {
			@Pc(31) Class131 local31 = this.method1486(false, arg0, arg1);
			return local31 == null ? null : local31.aClass60_3;
		}
	}

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		this.lb = false;
		if (this.aClass60_1 != null) {
			this.aClass60_1.SA(this.aClass60_1.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)I")
	@Override
	public int method7562() {
		return this.aByte14;
	}

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.aClass60_1 == null ? 0 : this.aClass60_1.J();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	@Override
	public void method7559() {
		if (this.aClass60_1 != null) {
			this.aClass60_1.method7231();
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7560(@OriginalArg(0) Class45 arg0) {
		@Pc(27) Class3_Sub7_Sub13 local27;
		if (this.aClass3_Sub7_Sub13_1 == null && this.aBoolean125) {
			@Pc(20) Class131 local20 = this.method1486(true, 262144, arg0);
			local27 = local20 == null ? null : local20.aClass3_Sub7_Sub13_3;
		} else {
			local27 = this.aClass3_Sub7_Sub13_1;
			this.aClass3_Sub7_Sub13_1 = null;
		}
		if (local27 != null) {
			Static58.method1201(local27, super.aByte118, super.anInt9444, super.anInt9442, null);
		}
	}

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aClass60_1 == null ? false : this.aClass60_1.LA();
	}

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return true;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)I")
	@Override
	public int method7556() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7557(@OriginalArg(0) Class45 arg0) {
		@Pc(14) Class3_Sub7_Sub13 local14;
		if (this.aClass3_Sub7_Sub13_1 == null && this.aBoolean125) {
			@Pc(25) Class131 local25 = this.method1486(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass3_Sub7_Sub13_3;
		} else {
			local14 = this.aClass3_Sub7_Sub13_1;
			this.aClass3_Sub7_Sub13_1 = null;
		}
		if (local14 != null) {
			Static546.method7274(local14, super.aByte118, super.anInt9444, super.anInt9442, null);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class41_Sub2_Sub3_Sub2) {
			@Pc(38) Class41_Sub2_Sub3_Sub2 local38 = (Class41_Sub2_Sub3_Sub2) arg3;
			if (this.aClass60_1 == null || local38.aClass60_7 == null) {
				return;
			}
			this.aClass60_1.method7233(local38.aClass60_7, arg1, arg0, arg2, arg5);
		} else if (arg3 instanceof Class41_Sub2_Sub1_Sub2) {
			@Pc(19) Class41_Sub2_Sub1_Sub2 local19 = (Class41_Sub2_Sub1_Sub2) arg3;
			if (this.aClass60_1 != null && local19.aClass60_1 != null) {
				this.aClass60_1.method7233(local19.aClass60_1, arg1, arg0, arg2, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		if (this.aClass60_1 == null) {
			return null;
		}
		@Pc(11) Class11 local11 = arg0.method7397();
		local11.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		@Pc(25) Class41_Sub10 local25 = null;
		if (this.aBoolean126) {
			local25 = Static458.method6411(1);
		}
		if (Static453.aBoolean599) {
			this.aClass60_1.method7224(local11, local25 == null ? null : local25.aClass41_Sub8Array1[0], Static340.anInt5962, 0);
		} else {
			this.aClass60_1.method7230(local11, local25 == null ? null : local25.aClass41_Sub8Array1[0], 0);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZIILclient!r;)Lclient!hi;")
	private Class131 method1486(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class45 arg2) {
		@Pc(13) Class280 local13 = Static478.aClass212_3.method4793(this.aShort20 & 0xFFFF);
		@Pc(30) Class34 local30;
		@Pc(25) Class34 local25;
		if (this.aBoolean124) {
			local25 = Static108.aClass34Array6[0];
			local30 = Static426.aClass34Array5[super.aByte118];
		} else {
			local30 = Static108.aClass34Array6[super.aByte118];
			if (super.aByte118 < 3) {
				local25 = Static108.aClass34Array6[super.aByte118 + 1];
			} else {
				local25 = null;
			}
		}
		return local13.method6168(super.anInt9444, super.anInt9443, arg2, super.anInt9442, local30, arg1, this.aByte13 == 11 ? 10 : this.aByte13, arg0, this.aByte13 == 11 ? this.aByte14 + 4 : this.aByte14, local25);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.aShort20 & 0xFFFF;
	}
}
