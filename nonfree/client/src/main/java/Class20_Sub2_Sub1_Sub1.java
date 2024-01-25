import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class20_Sub2_Sub1_Sub1 extends Class20_Sub2_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!at", name = "hb", descriptor = "Lclient!cu;")
	private Class60 aClass60_1;

	@OriginalMember(owner = "client!at", name = "V", descriptor = "Z")
	private final boolean aBoolean53;

	@OriginalMember(owner = "client!at", name = "jb", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!at", name = "Z", descriptor = "S")
	private final short aShort12;

	@OriginalMember(owner = "client!at", name = "bb", descriptor = "Z")
	private final boolean aBoolean54;

	@OriginalMember(owner = "client!at", name = "P", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!at", name = "ib", descriptor = "Z")
	private final boolean aBoolean55;

	@OriginalMember(owner = "client!at", name = "rb", descriptor = "Lclient!da;")
	private Class61 aClass61_2;

	@OriginalMember(owner = "client!at", name = "cb", descriptor = "Lclient!ha;")
	private Class1_Sub3_Sub4 aClass1_Sub3_Sub4_1;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!r;Lclient!tc;IIIIIZIIII)V")
	public Class20_Sub2_Sub1_Sub1(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean53 = arg1.anInt8387 != 0 && !arg7;
		this.aByte9 = (byte) arg10;
		this.aShort12 = (short) arg1.anInt8416;
		this.aBoolean54 = arg7;
		this.aByte8 = (byte) arg11;
		super.anInt8795 = arg6;
		super.anInt8796 = arg4;
		this.aBoolean55 = arg0.method6473() && arg1.aBoolean613 && !this.aBoolean54 && Static479.aClass1_Sub7_Sub1_1.method2620(Static375.anInt6609) != 0;
		@Pc(70) Class144 local70 = this.method713(arg0, this.aBoolean55, 2048);
		if (local70 != null) {
			this.aClass61_2 = local70.aClass61_5;
			this.aClass1_Sub3_Sub4_1 = local70.aClass1_Sub3_Sub4_4;
		}
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.aClass61_2 == null ? 0 : this.aClass61_2.J();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)I")
	@Override
	public int method7276() {
		return this.aShort12 & 0xFFFF;
	}

	@OriginalMember(owner = "client!at", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aClass61_2 == null ? false : this.aClass61_2.LA();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLclient!r;ZI)Lclient!ht;")
	private Class144 method713(@OriginalArg(1) Class12 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class306 local13 = Static146.aClass214_1.method4897(this.aShort12 & 0xFFFF);
		@Pc(44) Class17 local44;
		@Pc(30) Class17 local30;
		if (this.aBoolean54) {
			local30 = Static158.aClass17Array2[0];
			local44 = Static499.aClass17Array3[super.aByte117];
		} else {
			if (super.aByte117 >= 3) {
				local30 = null;
			} else {
				local30 = Static158.aClass17Array2[super.aByte117 + 1];
			}
			local44 = Static158.aClass17Array2[super.aByte117];
		}
		return local13.method6963(super.anInt8790, this.aByte8, arg1, arg0, super.anInt8795, super.anInt8796, arg2, this.aByte9, local30, local44);
	}

	@OriginalMember(owner = "client!at", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return this.aClass61_2 == null ? 0 : this.aClass61_2.RA();
		} else {
			return -100;
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)I")
	@Override
	public int method7279() {
		return this.aByte9;
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.aByte8;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		if (this.aClass61_2 == null) {
			return null;
		}
		@Pc(11) Class209 local11 = arg0.method6441();
		local11.NA(super.anInt8796 + super.aShort70, super.anInt8790, super.aShort71 + super.anInt8795);
		@Pc(27) Class20_Sub8 local27 = null;
		if (this.aBoolean53) {
			local27 = Static593.method7897(1);
		}
		if (Static188.aBoolean320) {
			this.aClass61_2.method7592(local11, local27 == null ? null : local27.aClass20_Sub3Array1[0], Static33.anInt894, 0);
		} else {
			this.aClass61_2.method7587(local11, local27 == null ? null : local27.aClass20_Sub3Array1[0], 0);
		}
		return local27;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7277(@OriginalArg(0) Class12 arg0) {
		@Pc(21) Class1_Sub3_Sub4 local21;
		if (this.aClass1_Sub3_Sub4_1 == null && this.aBoolean55) {
			@Pc(32) Class144 local32 = this.method713(arg0, true, 262144);
			local21 = local32 == null ? null : local32.aClass1_Sub3_Sub4_4;
		} else {
			local21 = this.aClass1_Sub3_Sub4_1;
			this.aClass1_Sub3_Sub4_1 = null;
		}
		if (local21 != null) {
			Static148.method2387(local21, super.aByte117, super.anInt8796, super.anInt8795, null);
		}
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return true;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7275() {
		return this.aBoolean55;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class61 local15 = this.method718(arg0, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class209 local20 = arg0.method6441();
			local20.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			return Static188.aBoolean320 ? local15.method7606(arg2, arg1, local20, false, Static33.anInt894) : local15.method7590(arg2, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	@Override
	public void method7273() {
		if (this.aClass61_2 != null) {
			this.aClass61_2.method7589();
		}
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		if (this.aClass60_1 == null) {
			this.aClass60_1 = Static83.method1703(super.anInt8796, super.anInt8795, this.method718(arg0, 0), super.anInt8790);
		}
		return this.aClass60_1;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!r;IB)Lclient!da;")
	private Class61 method718(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass61_2 != null && arg0.method6467(this.aClass61_2.PA(), arg1) == 0) {
			return this.aClass61_2;
		} else {
			@Pc(26) Class144 local26 = this.method713(arg0, false, arg1);
			return local26 == null ? null : local26.aClass61_5;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7274(@OriginalArg(0) Class12 arg0) {
		@Pc(25) Class1_Sub3_Sub4 local25;
		if (this.aClass1_Sub3_Sub4_1 == null && this.aBoolean55) {
			@Pc(18) Class144 local18 = this.method713(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass1_Sub3_Sub4_4;
		} else {
			local25 = this.aClass1_Sub3_Sub4_1;
			this.aClass1_Sub3_Sub4_1 = null;
		}
		if (local25 != null) {
			Static221.method3670(local25, super.aByte117, super.anInt8796, super.anInt8795, null);
		}
	}
}
