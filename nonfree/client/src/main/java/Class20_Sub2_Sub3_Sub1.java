import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class20_Sub2_Sub3_Sub1 extends Class20_Sub2_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "Lclient!cu;")
	private Class60 aClass60_3;

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "Z")
	private final boolean aBoolean111;

	@OriginalMember(owner = "client!cc", name = "kb", descriptor = "Z")
	private boolean aBoolean114;

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "S")
	private final short aShort18;

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "Z")
	private final boolean aBoolean112;

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!cc", name = "ib", descriptor = "Z")
	private final boolean aBoolean113;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "Lclient!ha;")
	private Class1_Sub3_Sub4 aClass1_Sub3_Sub4_3;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "Lclient!da;")
	private Class61 aClass61_4;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!r;Lclient!tc;IIIIIZIZ)V")
	public Class20_Sub2_Sub3_Sub1(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8384);
		this.aBoolean111 = arg7;
		this.aBoolean114 = arg9;
		super.anInt8796 = arg4;
		super.anInt8795 = arg6;
		this.aShort18 = (short) arg1.anInt8416;
		this.aBoolean112 = arg1.anInt8387 != 0 && !arg7;
		this.aByte20 = (byte) arg8;
		this.aBoolean113 = arg0.method6473() && arg1.aBoolean613 && !this.aBoolean111 && Static479.aClass1_Sub7_Sub1_1.method2620(Static375.anInt6609) != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean114) {
			local63 |= 0x10000;
		}
		@Pc(78) Class144 local78 = this.method1360(arg0, this.aBoolean113, local63);
		if (local78 != null) {
			this.aClass1_Sub3_Sub4_3 = local78.aClass1_Sub3_Sub4_4;
			this.aClass61_4 = local78.aClass61_5;
			if (this.aBoolean114) {
				this.aClass61_4 = this.aClass61_4.method7591((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)I")
	@Override
	public int method7264() {
		return this.aClass61_4 == null ? 0 : this.aClass61_4.J();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	@Override
	public void method7273() {
		if (this.aClass61_4 != null) {
			this.aClass61_4.method7589();
		}
	}

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method7256() {
		return this.aClass61_4 == null ? false : this.aClass61_4.LA();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)I")
	@Override
	public int method7279() {
		return 22;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!r;ZII)Lclient!ht;")
	private Class144 method1360(@OriginalArg(0) Class12 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class306 local13 = Static146.aClass214_1.method4897(this.aShort18 & 0xFFFF);
		@Pc(28) Class17 local28;
		@Pc(32) Class17 local32;
		if (this.aBoolean111) {
			local28 = Static499.aClass17Array3[super.aByte117];
			local32 = Static158.aClass17Array2[0];
		} else {
			if (super.aByte117 >= 3) {
				local32 = null;
			} else {
				local32 = Static158.aClass17Array2[super.aByte117 + 1];
			}
			local28 = Static158.aClass17Array2[super.aByte117];
		}
		return local13.method6963(super.anInt8790, this.aByte20, arg1, arg0, super.anInt8795, super.anInt8796, arg2, 22, local32, local28);
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7249() {
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "(I)I")
	@Override
	public int method7261(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aBoolean114 = true;
		}
		return this.aClass61_4 == null ? 0 : this.aClass61_4.RA();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I")
	@Override
	public int method7276() {
		return this.aShort18 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	@Override
	public Class60 method7262(@OriginalArg(0) Class12 arg0) {
		if (this.aClass60_3 == null) {
			this.aClass60_3 = Static83.method1703(super.anInt8796, super.anInt8795, this.method1363(arg0, 0), super.anInt8790);
		}
		return this.aClass60_3;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!r;II)Z")
	@Override
	public boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class61 local9 = this.method1363(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class209 local14 = arg0.method6441();
			local14.NA(super.anInt8796, super.anInt8790, super.anInt8795);
			return Static188.aBoolean320 ? local9.method7606(arg2, arg1, local14, false, Static33.anInt894) : local9.method7590(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!r;I)V")
	@Override
	public void method7277(@OriginalArg(0) Class12 arg0) {
		@Pc(29) Class1_Sub3_Sub4 local29;
		if (this.aClass1_Sub3_Sub4_3 == null && this.aBoolean113) {
			@Pc(22) Class144 local22 = this.method1360(arg0, true, 262144);
			local29 = local22 == null ? null : local22.aClass1_Sub3_Sub4_4;
		} else {
			local29 = this.aClass1_Sub3_Sub4_3;
			this.aClass1_Sub3_Sub4_3 = null;
		}
		if (local29 != null) {
			Static148.method2387(local29, super.aByte117, super.anInt8796, super.anInt8795, null);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7274(@OriginalArg(0) Class12 arg0) {
		@Pc(22) Class1_Sub3_Sub4 local22;
		if (this.aClass1_Sub3_Sub4_3 == null && this.aBoolean113) {
			@Pc(33) Class144 local33 = this.method1360(arg0, true, 262144);
			local22 = local33 == null ? null : local33.aClass1_Sub3_Sub4_4;
		} else {
			local22 = this.aClass1_Sub3_Sub4_3;
			this.aClass1_Sub3_Sub4_3 = null;
		}
		if (local22 != null) {
			Static221.method3670(local22, super.aByte117, super.anInt8796, super.anInt8795, null);
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	@Override
	public void method7263() {
		this.aBoolean114 = false;
		if (this.aClass61_4 != null) {
			this.aClass61_4.SA(this.aClass61_4.PA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7254() {
		return this.aBoolean114;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7275() {
		return this.aBoolean113;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	@Override
	public Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0) {
		if (this.aClass61_4 == null) {
			return null;
		}
		@Pc(11) Class209 local11 = arg0.method6441();
		local11.NA(super.anInt8796, super.anInt8790, super.anInt8795);
		@Pc(21) Class20_Sub8 local21 = null;
		if (this.aBoolean112) {
			local21 = Static593.method7897(1);
		}
		if (Static188.aBoolean320) {
			this.aClass61_4.method7592(local11, local21 == null ? null : local21.aClass20_Sub3Array1[0], Static33.anInt894, 0);
		} else {
			this.aClass61_4.method7587(local11, local21 == null ? null : local21.aClass20_Sub3Array1[0], 0);
		}
		return local21;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	@Override
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5) {
		if (arg1 instanceof Class20_Sub2_Sub3_Sub1) {
			@Pc(5) Class20_Sub2_Sub3_Sub1 local5 = (Class20_Sub2_Sub3_Sub1) arg1;
			if (this.aClass61_4 != null && local5.aClass61_4 != null) {
				this.aClass61_4.method7609(local5.aClass61_4, arg5, arg3, arg0, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)I")
	@Override
	public int method7278() {
		return this.aByte20;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method7265(@OriginalArg(0) Class12 arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!r;IZ)Lclient!da;")
	private Class61 method1363(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass61_4 != null && arg0.method6467(this.aClass61_4.PA(), arg1) == 0) {
			return this.aClass61_4;
		} else {
			@Pc(26) Class144 local26 = this.method1360(arg0, false, arg1);
			return local26 == null ? null : local26.aClass61_5;
		}
	}
}
