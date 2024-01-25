import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class20_Sub2_Sub2_Sub1 extends Class20_Sub2_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!bv", name = "X", descriptor = "Lclient!cu;")
	private Class60 aClass60_2;

	@OriginalMember(owner = "client!bv", name = "hb", descriptor = "Z")
	private boolean aBoolean103;

	@OriginalMember(owner = "client!bv", name = "S", descriptor = "Z")
	private final boolean aBoolean101;

	@OriginalMember(owner = "client!bv", name = "ob", descriptor = "Z")
	private final boolean aBoolean104;

	@OriginalMember(owner = "client!bv", name = "W", descriptor = "S")
	private final short aShort15;

	@OriginalMember(owner = "client!bv", name = "ab", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!bv", name = "lb", descriptor = "B")
	private final byte lb;

	@OriginalMember(owner = "client!bv", name = "cb", descriptor = "Z")
	private final boolean aBoolean102;

	@OriginalMember(owner = "client!bv", name = "gb", descriptor = "Lclient!da;")
	public Class61 aClass61_3;

	@OriginalMember(owner = "client!bv", name = "kb", descriptor = "Lclient!ha;")
	private Class1_Sub3_Sub4 aClass1_Sub3_Sub4_2;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!r;Lclient!tc;IIIIIZIIZ)V")
	public Class20_Sub2_Sub2_Sub1(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static107.method1921(arg8, arg9));
		this.aBoolean103 = arg10;
		this.aBoolean101 = arg1.anInt8387 != 0 && !arg7;
		this.aBoolean104 = arg7;
		this.aShort15 = (short) arg1.anInt8416;
		super.anInt8796 = arg4;
		super.anInt8795 = arg6;
		this.aByte15 = (byte) arg9;
		this.lb = (byte) arg8;
		this.aBoolean102 = arg0.method6473() && arg1.aBoolean613 && !this.aBoolean104 && Static479.aClass1_Sub7_Sub1_1.method2620(Static375.anInt6609) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean103) {
			local69 |= 0x10000;
		}
		@Pc(84) Class144 local84 = this.method1237(local69, arg0, this.aBoolean102);
		if (local84 != null) {
			this.aClass61_3 = local84.aClass61_5;
			this.aClass1_Sub3_Sub4_2 = local84.aClass1_Sub3_Sub4_4;
			if (this.aBoolean103) {
				this.aClass61_3 = this.aClass61_3.method7591((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		if (arg1 instanceof Class20_Sub2_Sub2_Sub1) {
			@Pc(28) Class20_Sub2_Sub2_Sub1 local28 = (Class20_Sub2_Sub2_Sub1) arg1;
			if (this.aClass61_3 != null && local28.aClass61_3 != null) {
				this.aClass61_3.method7609(local28.aClass61_3, arg5, arg3, arg0, arg2);
			}
		} else if (arg1 instanceof Class20_Sub2_Sub4_Sub5) {
			@Pc(8) Class20_Sub2_Sub4_Sub5 local8 = (Class20_Sub2_Sub4_Sub5) arg1;
			if (this.aClass61_3 != null && local8.lb != null) {
				this.aClass61_3.method7609(local8.lb, arg5, arg3, arg0, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return this.aClass61_3 == null ? 0 : this.aClass61_3.RA();
		} else {
			return -108;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		if (this.aClass61_3 == null) {
			return null;
		}
		@Pc(16) Class209 local16 = arg0.method6441();
		local16.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		@Pc(26) Class20_Sub8 local26 = null;
		if (this.aBoolean101) {
			local26 = Static593.method7897(1);
		}
		if (Static188.aBoolean320) {
			this.aClass61_3.method7592(local16, local26 == null ? null : local26.aClass20_Sub3Array1[0], Static33.anInt894, 0);
		} else {
			this.aClass61_3.method7587(local16, local26 == null ? null : local26.aClass20_Sub3Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7274(@OriginalArg(0) Class12 arg0) {
		@Pc(22) Class1_Sub3_Sub4 local22;
		if (this.aClass1_Sub3_Sub4_2 == null && this.aBoolean102) {
			@Pc(33) Class144 local33 = this.method1237(262144, arg0, true);
			local22 = local33 == null ? null : local33.aClass1_Sub3_Sub4_4;
		} else {
			local22 = this.aClass1_Sub3_Sub4_2;
			this.aClass1_Sub3_Sub4_2 = null;
		}
		if (local22 != null) {
			Static221.method3670(local22, super.aByte117, super.anInt8796, super.anInt8795, null);
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7275() {
		return this.aBoolean102;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!r;)Lclient!da;")
	private Class61 method1234(@OriginalArg(0) int arg0, @OriginalArg(2) Class12 arg1) {
		if (this.aClass61_3 != null && arg1.method6467(this.aClass61_3.PA(), arg0) == 0) {
			return this.aClass61_3;
		} else {
			@Pc(28) Class144 local28 = this.method1237(arg0, arg1, false);
			return local28 == null ? null : local28.aClass61_5;
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		if (this.aClass60_2 == null) {
			this.aClass60_2 = Static83.method1703(super.anInt8796, super.anInt8795, this.method1234(0, arg0), super.anInt8790);
		}
		return this.aClass60_2;
	}

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return this.aBoolean103;
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return true;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	@Override
	public void method7273() {
		if (this.aClass61_3 != null) {
			this.aClass61_3.method7589();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7277(@OriginalArg(0) Class12 arg0) {
		@Pc(21) Class1_Sub3_Sub4 local21;
		if (this.aClass1_Sub3_Sub4_2 == null && this.aBoolean102) {
			@Pc(34) Class144 local34 = this.method1237(262144, arg0, true);
			local21 = local34 == null ? null : local34.aClass1_Sub3_Sub4_4;
		} else {
			local21 = this.aClass1_Sub3_Sub4_2;
			this.aClass1_Sub3_Sub4_2 = null;
		}
		if (local21 != null) {
			Static148.method2387(local21, super.aByte117, super.anInt8796, super.anInt8795, null);
		}
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.aByte15;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)I")
	@Override
	public int method7276() {
		return this.aShort15 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aClass61_3 == null ? false : this.aClass61_3.LA();
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		this.aBoolean103 = false;
		if (this.aClass61_3 != null) {
			this.aClass61_3.SA(this.aClass61_3.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class61 local15 = this.method1234(131072, arg0);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class209 local20 = arg0.method6441();
			local20.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			return Static188.aBoolean320 ? local15.method7606(arg2, arg1, local20, false, Static33.anInt894) : local15.method7590(arg2, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)I")
	@Override
	public int method7279() {
		return this.lb;
	}

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.aClass61_3 == null ? 0 : this.aClass61_3.J();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!r;Z)Lclient!ht;")
	private Class144 method1237(@OriginalArg(1) int arg0, @OriginalArg(2) Class12 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class306 local13 = Static146.aClass214_1.method4897(this.aShort15 & 0xFFFF);
		@Pc(31) Class17 local31;
		@Pc(26) Class17 local26;
		if (this.aBoolean104) {
			local26 = Static158.aClass17Array2[0];
			local31 = Static499.aClass17Array3[super.aByte117];
		} else {
			if (super.aByte117 < 3) {
				local26 = Static158.aClass17Array2[super.aByte117 + 1];
			} else {
				local26 = null;
			}
			local31 = Static158.aClass17Array2[super.aByte117];
		}
		return local13.method6963(super.anInt8790, this.aByte15, arg2, arg1, super.anInt8795, super.anInt8796, arg0, this.lb, local26, local31);
	}
}
