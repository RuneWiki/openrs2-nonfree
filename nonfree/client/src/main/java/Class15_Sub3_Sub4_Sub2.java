import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class15_Sub3_Sub4_Sub2 extends Class15_Sub3_Sub4 implements Interface23 {

	@OriginalMember(owner = "client!vl", name = "lb", descriptor = "[Lclient!mq;")
	public static Class71[] lb;

	@OriginalMember(owner = "client!vl", name = "eb", descriptor = "Lclient!mg;")
	private Class232 aClass232_8;

	@OriginalMember(owner = "client!vl", name = "U", descriptor = "Z")
	private final boolean aBoolean793;

	@OriginalMember(owner = "client!vl", name = "R", descriptor = "B")
	private final byte aByte143;

	@OriginalMember(owner = "client!vl", name = "Z", descriptor = "Z")
	private boolean aBoolean794;

	@OriginalMember(owner = "client!vl", name = "kb", descriptor = "B")
	private final byte aByte144;

	@OriginalMember(owner = "client!vl", name = "jb", descriptor = "Z")
	private boolean aBoolean795;

	@OriginalMember(owner = "client!vl", name = "ab", descriptor = "S")
	private final short aShort127;

	@OriginalMember(owner = "client!vl", name = "rb", descriptor = "Z")
	private final boolean aBoolean796;

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "Lclient!ka;")
	public Class14 aClass14_7;

	@OriginalMember(owner = "client!vl", name = "xb", descriptor = "Lclient!r;")
	private Class2_Sub1_Sub11 aClass2_Sub1_Sub11_6;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!ha;Lclient!sea;IIIIIZIIZ)V")
	public Class15_Sub3_Sub4_Sub2(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static280.method4714(arg9, arg8));
		this.aBoolean793 = arg1.lb != 0 && !arg7;
		this.aByte143 = (byte) arg9;
		this.aBoolean794 = arg10;
		this.aByte144 = (byte) arg8;
		super.anInt11024 = arg6;
		super.anInt11022 = arg4;
		this.aBoolean795 = arg7;
		this.aShort127 = (short) arg1.anInt9434;
		this.aBoolean796 = arg0.method8134() && arg1.aBoolean698 && !this.aBoolean795 && Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6164() != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean794) {
			local69 |= 0x10000;
		}
		@Pc(84) Class173 local84 = this.method9455(arg0, this.aBoolean796, local69);
		if (local84 != null) {
			this.aClass14_7 = local84.aClass14_2;
			this.aClass2_Sub1_Sub11_6 = local84.aClass2_Sub1_Sub11_2;
			if (this.aBoolean794) {
				this.aClass14_7 = this.aClass14_7.method8622((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return this.aBoolean794;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I")
	@Override
	public int method9451() {
		return this.aShort127 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)I")
	@Override
	public int method9454() {
		return this.aByte143;
	}

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.aClass14_7 == null ? 0 : this.aClass14_7.fa();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		if (this.aClass232_8 == null) {
			this.aClass232_8 = Static264.method4550(super.anInt11024, super.anInt11029, this.method9456(0, arg0), super.anInt11022);
		}
		return this.aClass232_8;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ha;ZZI)Lclient!iu;")
	private Class173 method9455(@OriginalArg(0) Class101 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class331 local18 = Static251.aClass328_1.method8261(this.aShort127 & 0xFFFF);
		@Pc(26) Class18 local26;
		@Pc(37) Class18 local37;
		if (this.aBoolean795) {
			local37 = Static549.aClass18Array30[0];
			local26 = Static93.aClass18Array33[super.aByte141];
		} else {
			local26 = Static549.aClass18Array30[super.aByte141];
			if (super.aByte141 < 3) {
				local37 = Static549.aClass18Array30[super.aByte141 + 1];
			} else {
				local37 = null;
			}
		}
		return local18.method8293(this.aByte143, this.aByte144, super.anInt11024, arg2, arg1, super.anInt11029, local37, (Class278) null, super.anInt11022, arg0, local26);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9448() {
		return this.aBoolean796;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BILclient!ha;)Lclient!ka;")
	private Class14 method9456(@OriginalArg(1) int arg0, @OriginalArg(2) Class101 arg1) {
		if (this.aClass14_7 != null && arg1.method8083(this.aClass14_7.ua(), arg0) == 0) {
			return this.aClass14_7;
		} else {
			@Pc(34) Class173 local34 = this.method9455(arg1, false, arg0);
			return local34 == null ? null : local34.aClass14_2;
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9450(@OriginalArg(1) Class101 arg0) {
		@Pc(21) Class2_Sub1_Sub11 local21;
		if (this.aClass2_Sub1_Sub11_6 == null && this.aBoolean796) {
			@Pc(32) Class173 local32 = this.method9455(arg0, true, 262144);
			local21 = local32 == null ? null : local32.aClass2_Sub1_Sub11_2;
		} else {
			local21 = this.aClass2_Sub1_Sub11_6;
			this.aClass2_Sub1_Sub11_6 = null;
		}
		if (local21 != null) {
			Static662.method8957(local21, super.aByte141, super.anInt11022, super.anInt11024, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(9) Class14 local9 = this.method9456(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(22) Class76 local22 = arg2.method8085();
			local22.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
			return Static110.aBoolean800 ? local9.method8625(arg0, arg1, local22, false, 0, Static165.anInt3552) : local9.method8624(arg0, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		if (this.aClass14_7 == null) {
			return null;
		}
		@Pc(17) Class76 local17 = arg0.method8085();
		local17.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		@Pc(31) Class15_Sub9 local31 = Static401.method6614(1, this.aBoolean793);
		if (Static110.aBoolean800) {
			this.aClass14_7.method8623(local17, local31.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			this.aClass14_7.method8641(local17, local31.aClass15_Sub6Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V")
	@Override
	public void method9453() {
		if (this.aClass14_7 != null) {
			this.aClass14_7.method8620();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9449(@OriginalArg(1) Class101 arg0) {
		@Pc(25) Class2_Sub1_Sub11 local25;
		if (this.aClass2_Sub1_Sub11_6 == null && this.aBoolean796) {
			@Pc(18) Class173 local18 = this.method9455(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass2_Sub1_Sub11_2;
		} else {
			local25 = this.aClass2_Sub1_Sub11_6;
			this.aClass2_Sub1_Sub11_6 = null;
		}
		if (local25 != null) {
			Static13.method7472(local25, super.aByte141, super.anInt11022, super.anInt11024, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		if (this.aClass14_7 == null) {
			return true;
		} else {
			return !this.aClass14_7.r();
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
	}

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aClass14_7 == null ? false : this.aClass14_7.F();
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.aBoolean795 = false;
		}
		return this.aClass14_7 == null ? 0 : this.aClass14_7.ma();
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		this.aBoolean794 = false;
		if (this.aClass14_7 != null) {
			this.aClass14_7.s(this.aClass14_7.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I")
	@Override
	public int method9452() {
		return this.aByte144;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class15_Sub3_Sub4_Sub2) {
			@Pc(15) Class15_Sub3_Sub4_Sub2 local15 = (Class15_Sub3_Sub4_Sub2) arg3;
			if (this.aClass14_7 != null && local15.aClass14_7 != null) {
				this.aClass14_7.method8631(local15.aClass14_7, arg0, arg5, arg1, arg4);
			}
		} else if (arg3 instanceof Class15_Sub3_Sub3_Sub4) {
			@Pc(37) Class15_Sub3_Sub3_Sub4 local37 = (Class15_Sub3_Sub3_Sub4) arg3;
			if (this.aClass14_7 != null && local37.aClass14_3 != null) {
				this.aClass14_7.method8631(local37.aClass14_3, arg0, arg5, arg1, arg4);
				return;
			}
		}
	}
}
