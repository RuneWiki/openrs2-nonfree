import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class41_Sub2_Sub3_Sub2 extends Class41_Sub2_Sub3 implements Interface4 {

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "Lclient!lf;")
	private Class189 aClass189_8;

	@OriginalMember(owner = "client!vm", name = "T", descriptor = "Z")
	private boolean aBoolean714;

	@OriginalMember(owner = "client!vm", name = "lb", descriptor = "Z")
	private final boolean lb;

	@OriginalMember(owner = "client!vm", name = "ab", descriptor = "B")
	private final byte aByte115;

	@OriginalMember(owner = "client!vm", name = "hb", descriptor = "B")
	private final byte aByte116;

	@OriginalMember(owner = "client!vm", name = "gb", descriptor = "S")
	private final short aShort142;

	@OriginalMember(owner = "client!vm", name = "V", descriptor = "Z")
	private final boolean aBoolean715;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "Z")
	private final boolean aBoolean713;

	@OriginalMember(owner = "client!vm", name = "S", descriptor = "Lclient!da;")
	public Class60 aClass60_7;

	@OriginalMember(owner = "client!vm", name = "Q", descriptor = "Lclient!ha;")
	private Class3_Sub7_Sub13 aClass3_Sub7_Sub13_6;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!r;Lclient!qp;IIIIIZIIZ)V")
	public Class41_Sub2_Sub3_Sub2(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class280 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static571.method7696(arg9, arg8));
		super.anInt9442 = arg6;
		this.aBoolean714 = arg10;
		this.lb = arg1.anInt7380 != 0 && !arg7;
		this.aByte115 = (byte) arg8;
		this.aByte116 = (byte) arg9;
		this.aShort142 = (short) arg1.anInt7369;
		super.anInt9444 = arg4;
		this.aBoolean715 = arg7;
		this.aBoolean713 = arg0.method7404() && arg1.aBoolean561 && !this.aBoolean715 && Static405.aClass3_Sub3_Sub1_1.method6299(Static60.anInt1312) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean714) {
			local69 |= 0x10000;
		}
		@Pc(84) Class131 local84 = this.method7566(arg0, local69, this.aBoolean713);
		if (local84 != null) {
			this.aClass60_7 = local84.aClass60_3;
			this.aClass3_Sub7_Sub13_6 = local84.aClass3_Sub7_Sub13_3;
			if (this.aBoolean714) {
				this.aClass60_7 = this.aClass60_7.method7229((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7560(@OriginalArg(0) Class45 arg0) {
		@Pc(21) Class3_Sub7_Sub13 local21;
		if (this.aClass3_Sub7_Sub13_6 == null && this.aBoolean713) {
			@Pc(34) Class131 local34 = this.method7566(arg0, 262144, true);
			local21 = local34 == null ? null : local34.aClass3_Sub7_Sub13_3;
		} else {
			local21 = this.aClass3_Sub7_Sub13_6;
			this.aClass3_Sub7_Sub13_6 = null;
		}
		if (local21 != null) {
			Static58.method1201(local21, super.aByte118, super.anInt9444, super.anInt9442, null);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIILclient!rb;Lclient!r;Z)V")
	@Override
	public void method7840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class41_Sub2 arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 instanceof Class41_Sub2_Sub3_Sub2) {
			@Pc(28) Class41_Sub2_Sub3_Sub2 local28 = (Class41_Sub2_Sub3_Sub2) arg3;
			if (this.aClass60_7 != null && local28.aClass60_7 != null) {
				this.aClass60_7.method7233(local28.aClass60_7, arg1, arg0, arg2, arg5);
			}
		} else if (arg3 instanceof Class41_Sub2_Sub1_Sub2) {
			@Pc(8) Class41_Sub2_Sub1_Sub2 local8 = (Class41_Sub2_Sub1_Sub2) arg3;
			if (this.aClass60_7 != null && local8.aClass60_1 != null) {
				this.aClass60_7.method7233(local8.aClass60_1, arg1, arg0, arg2, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7839() {
		return this.aBoolean714;
	}

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7847() {
		return true;
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(Lclient!r;I)Lclient!lf;")
	@Override
	public Class189 method7845(@OriginalArg(0) Class45 arg0) {
		if (this.aClass189_8 == null) {
			this.aClass189_8 = Static36.method588(super.anInt9442, this.method7564(0, arg0), super.anInt9443, super.anInt9444);
		}
		return this.aClass189_8;
	}

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)I")
	@Override
	public int method7844() {
		return this.aClass60_7 == null ? 0 : this.aClass60_7.J();
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7558() {
		return this.aBoolean713;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7849(@OriginalArg(0) Class45 arg0) {
	}

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7851() {
		return this.aClass60_7 == null ? false : this.aClass60_7.LA();
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(Lclient!r;I)Lclient!wj;")
	@Override
	public Class41_Sub10 method7843(@OriginalArg(0) Class45 arg0) {
		if (this.aClass60_7 == null) {
			return null;
		}
		@Pc(16) Class11 local16 = arg0.method7397();
		local16.NA(super.anInt9444, super.anInt9443, super.anInt9442);
		@Pc(26) Class41_Sub10 local26 = null;
		if (this.lb) {
			local26 = Static458.method6411(1);
		}
		if (Static453.aBoolean599) {
			this.aClass60_7.method7224(local16, local26 == null ? null : local26.aClass41_Sub8Array1[0], Static340.anInt5962, 0);
		} else {
			this.aClass60_7.method7230(local16, local26 == null ? null : local26.aClass41_Sub8Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method7838(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class60 local13 = this.method7564(131072, arg0);
		if (local13 == null) {
			return false;
		} else {
			@Pc(18) Class11 local18 = arg0.method7397();
			local18.NA(super.anInt9444, super.anInt9443, super.anInt9442);
			return Static453.aBoolean599 ? local13.method7237(arg1, arg2, local18, false, Static340.anInt5962) : local13.method7246(arg1, arg2, local18, false);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILclient!r;)Lclient!da;")
	private Class60 method7564(@OriginalArg(1) int arg0, @OriginalArg(2) Class45 arg1) {
		if (this.aClass60_7 != null && arg1.method7393(this.aClass60_7.PA(), arg0) == 0) {
			return this.aClass60_7;
		} else {
			@Pc(34) Class131 local34 = this.method7566(arg1, arg0, false);
			return local34 == null ? null : local34.aClass60_3;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)I")
	@Override
	public int method7556() {
		return this.aByte115;
	}

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "(I)V")
	@Override
	public void method7852() {
		this.aBoolean714 = false;
		if (this.aClass60_7 != null) {
			this.aClass60_7.SA(this.aClass60_7.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	@Override
	public void method7559() {
		if (this.aClass60_7 != null) {
			this.aClass60_7.method7231();
		}
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I")
	@Override
	public int method7561() {
		return this.aShort142 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7557(@OriginalArg(0) Class45 arg0) {
		@Pc(35) Class3_Sub7_Sub13 local35;
		if (this.aClass3_Sub7_Sub13_6 == null && this.aBoolean713) {
			@Pc(28) Class131 local28 = this.method7566(arg0, 262144, true);
			local35 = local28 == null ? null : local28.aClass3_Sub7_Sub13_3;
		} else {
			local35 = this.aClass3_Sub7_Sub13_6;
			this.aClass3_Sub7_Sub13_6 = null;
		}
		if (local35 != null) {
			Static546.method7274(local35, super.aByte118, super.anInt9444, super.anInt9442, null);
		}
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(B)I")
	@Override
	public int method7842(@OriginalArg(0) byte arg0) {
		if (arg0 < 119) {
			Static560.method7563((char) 65476);
		}
		return this.aClass60_7 == null ? 0 : this.aClass60_7.RA();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)I")
	@Override
	public int method7562() {
		return this.aByte116;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!r;IIZ)Lclient!hi;")
	private Class131 method7566(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class280 local13 = Static478.aClass212_3.method4793(this.aShort142 & 0xFFFF);
		@Pc(29) Class34 local29;
		@Pc(33) Class34 local33;
		if (this.aBoolean715) {
			local29 = Static426.aClass34Array5[super.aByte118];
			local33 = Static108.aClass34Array6[0];
		} else {
			local29 = Static108.aClass34Array6[super.aByte118];
			if (super.aByte118 >= 3) {
				local33 = null;
			} else {
				local33 = Static108.aClass34Array6[super.aByte118 + 1];
			}
		}
		return local13.method6168(super.anInt9444, super.anInt9443, arg0, super.anInt9442, local29, arg1, this.aByte115, arg2, this.aByte116, local33);
	}
}
