import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class20_Sub2_Sub4_Sub5 extends Class20_Sub2_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!ud", name = "pb", descriptor = "Lclient!cu;")
	private Class60 aClass60_7;

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "B")
	private final byte aByte115;

	@OriginalMember(owner = "client!ud", name = "yb", descriptor = "Z")
	private final boolean aBoolean643;

	@OriginalMember(owner = "client!ud", name = "tb", descriptor = "Z")
	private final boolean aBoolean642;

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "B")
	private final byte aByte114;

	@OriginalMember(owner = "client!ud", name = "sb", descriptor = "Z")
	private boolean aBoolean641;

	@OriginalMember(owner = "client!ud", name = "ib", descriptor = "S")
	private final short aShort101;

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "Z")
	private final boolean aBoolean639;

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "Lclient!ha;")
	private Class1_Sub3_Sub4 aClass1_Sub3_Sub4_6;

	@OriginalMember(owner = "client!ud", name = "lb", descriptor = "Lclient!da;")
	public Class61 lb;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!r;Lclient!tc;IIIIIZIIIIIIZ)V")
	public Class20_Sub2_Sub4_Sub5(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8401 == 1, Static486.method6806(arg12, arg13));
		this.aByte115 = (byte) arg13;
		this.aBoolean643 = arg1.anInt8387 != 0 && !arg7;
		super.aByte117 = (byte) arg3;
		this.aBoolean642 = arg7;
		this.aByte114 = (byte) arg12;
		this.aBoolean641 = arg14;
		this.aShort101 = (short) arg1.anInt8416;
		this.aBoolean639 = arg0.method6473() && arg1.aBoolean613 && !this.aBoolean642 && Static479.aClass1_Sub7_Sub1_1.method2620(Static375.anInt6609) != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean641) {
			local80 |= 0x10000;
		}
		@Pc(95) Class144 local95 = this.method7216(arg0, local80, this.aBoolean639);
		if (local95 != null) {
			this.aClass1_Sub3_Sub4_6 = local95.aClass1_Sub3_Sub4_4;
			this.lb = local95.aClass61_5;
			if (this.aBoolean641) {
				this.lb = this.lb.method7591((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		this.aBoolean641 = false;
		if (this.lb != null) {
			this.lb.SA(this.lb.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		if (arg1 instanceof Class20_Sub2_Sub2_Sub1) {
			@Pc(17) Class20_Sub2_Sub2_Sub1 local17 = (Class20_Sub2_Sub2_Sub1) arg1;
			if (this.lb != null && local17.aClass61_3 != null) {
				this.lb.method7609(local17.aClass61_3, arg5, arg3, arg0, arg2);
			}
		} else if (arg1 instanceof Class20_Sub2_Sub4_Sub5) {
			@Pc(39) Class20_Sub2_Sub4_Sub5 local39 = (Class20_Sub2_Sub4_Sub5) arg1;
			if (this.lb != null && local39.lb != null) {
				this.lb.method7609(local39.lb, arg5, arg3, arg0, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		if (this.lb == null) {
			return null;
		}
		@Pc(18) Class209 local18 = arg0.method6441();
		local18.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		@Pc(28) Class20_Sub8 local28 = null;
		if (this.aBoolean643) {
			local28 = Static593.method7897(1);
		}
		if (Static188.aBoolean320) {
			this.lb.method7592(local18, local28 == null ? null : local28.aClass20_Sub3Array1[0], Static33.anInt894, 0);
		} else {
			this.lb.method7587(local18, local28 == null ? null : local28.aClass20_Sub3Array1[0], 0);
		}
		return local28;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)I")
	@Override
	public int method7279() {
		return this.aByte114;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7277(@OriginalArg(0) Class12 arg0) {
		@Pc(29) Class1_Sub3_Sub4 local29;
		if (this.aClass1_Sub3_Sub4_6 == null && this.aBoolean639) {
			@Pc(22) Class144 local22 = this.method7216(arg0, 262144, true);
			local29 = local22 == null ? null : local22.aClass1_Sub3_Sub4_4;
		} else {
			local29 = this.aClass1_Sub3_Sub4_6;
			this.aClass1_Sub3_Sub4_6 = null;
		}
		if (local29 != null) {
			Static148.method2387(local29, super.aByte117, super.anInt8796, super.anInt8795, null);
		}
	}

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "(I)I")
	public int method7211() {
		return this.lb == null ? 15 : this.lb.K() / 4;
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.lb == null ? false : this.lb.LA();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	@Override
	public void method7273() {
		if (this.lb != null) {
			this.lb.method7589();
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7275() {
		return this.aBoolean639;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.aByte115;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7274(@OriginalArg(0) Class12 arg0) {
		@Pc(25) Class1_Sub3_Sub4 local25;
		if (this.aClass1_Sub3_Sub4_6 == null && this.aBoolean639) {
			@Pc(18) Class144 local18 = this.method7216(arg0, 262144, true);
			local25 = local18 == null ? null : local18.aClass1_Sub3_Sub4_4;
		} else {
			local25 = this.aClass1_Sub3_Sub4_6;
			this.aClass1_Sub3_Sub4_6 = null;
		}
		if (local25 != null) {
			Static221.method3670(local25, super.aByte117, super.anInt8796, super.anInt8795, null);
		}
	}

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method7216(null, -56, true);
		}
		return this.lb == null ? 0 : this.lb.RA();
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		if (this.aClass60_7 == null) {
			this.aClass60_7 = Static83.method1703(super.anInt8796, super.anInt8795, this.method7215(arg0, 0), super.anInt8790);
		}
		return this.aClass60_7;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLclient!r;I)Lclient!da;")
	private Class61 method7215(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1) {
		if (this.lb != null && arg0.method6467(this.lb.PA(), arg1) == 0) {
			return this.lb;
		} else {
			@Pc(31) Class144 local31 = this.method7216(arg0, arg1, false);
			return local31 == null ? null : local31.aClass61_5;
		}
	}

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return this.aBoolean641;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.lb == null ? 0 : this.lb.J();
	}

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I")
	@Override
	public int method7276() {
		return this.aShort101 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!r;IZI)Lclient!ht;")
	private Class144 method7216(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class306 local13 = Static146.aClass214_1.method4897(this.aShort101 & 0xFFFF);
		@Pc(21) Class17 local21;
		@Pc(29) Class17 local29;
		if (this.aBoolean642) {
			local29 = Static158.aClass17Array2[0];
			local21 = Static499.aClass17Array3[super.aByte117];
		} else {
			local21 = Static158.aClass17Array2[super.aByte117];
			if (super.aByte117 >= 3) {
				local29 = null;
			} else {
				local29 = Static158.aClass17Array2[super.aByte117 + 1];
			}
		}
		return local13.method6963(super.anInt8790, this.aByte114 == 11 ? this.aByte115 + 4 : this.aByte115, arg2, arg0, super.anInt8795, super.anInt8796, arg1, this.aByte114 == 11 ? 10 : this.aByte114, local29, local21);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class61 local14 = this.method7215(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class209 local19 = arg0.method6441();
			local19.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			return Static188.aBoolean320 ? local14.method7606(arg2, arg1, local19, false, Static33.anInt894) : local14.method7590(arg2, arg1, local19, false);
		}
	}
}
