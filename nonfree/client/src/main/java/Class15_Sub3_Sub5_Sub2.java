import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class15_Sub3_Sub5_Sub2 extends Class15_Sub3_Sub5 implements Interface23 {

	@OriginalMember(owner = "client!paa", name = "fb", descriptor = "Lclient!mg;")
	private Class232 aClass232_6;

	@OriginalMember(owner = "client!paa", name = "sb", descriptor = "Z")
	private boolean aBoolean604;

	@OriginalMember(owner = "client!paa", name = "X", descriptor = "S")
	private final short aShort75;

	@OriginalMember(owner = "client!paa", name = "Q", descriptor = "Z")
	private final boolean aBoolean601;

	@OriginalMember(owner = "client!paa", name = "xb", descriptor = "B")
	private final byte aByte107;

	@OriginalMember(owner = "client!paa", name = "R", descriptor = "Z")
	private final boolean aBoolean602;

	@OriginalMember(owner = "client!paa", name = "rb", descriptor = "Z")
	private final boolean aBoolean603;

	@OriginalMember(owner = "client!paa", name = "ib", descriptor = "Lclient!r;")
	private Class2_Sub1_Sub11 aClass2_Sub1_Sub11_5;

	@OriginalMember(owner = "client!paa", name = "cb", descriptor = "Lclient!ka;")
	private Class14 aClass14_5;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!ha;Lclient!sea;IIIIIZIZ)V")
	public Class15_Sub3_Sub5_Sub2(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt9411);
		this.aBoolean604 = arg9;
		this.aShort75 = (short) arg1.anInt9434;
		this.aBoolean601 = arg1.lb != 0 && !arg7;
		super.anInt11024 = arg6;
		this.aByte107 = (byte) arg8;
		this.aBoolean602 = arg7;
		super.anInt11022 = arg4;
		this.aBoolean603 = arg0.method8134() && arg1.aBoolean698 && !this.aBoolean602 && Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6164() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean604) {
			local66 |= 0x10000;
		}
		@Pc(81) Class173 local81 = this.method7244(local66, arg0, this.aBoolean603);
		if (local81 != null) {
			this.aClass2_Sub1_Sub11_5 = local81.aClass2_Sub1_Sub11_2;
			this.aClass14_5 = local81.aClass14_2;
			if (this.aBoolean604) {
				this.aClass14_5 = this.aClass14_5.method8622((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)I")
	@Override
	public int method9451() {
		return this.aShort75 & 0xFFFF;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class14 method7243(@OriginalArg(0) Class101 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass14_5 != null && arg0.method8083(this.aClass14_5.ua(), arg1) == 0) {
			return this.aClass14_5;
		} else {
			@Pc(26) Class173 local26 = this.method7244(arg1, arg0, false);
			return local26 == null ? null : local26.aClass14_2;
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9450(@OriginalArg(1) Class101 arg0) {
		@Pc(21) Class2_Sub1_Sub11 local21;
		if (this.aClass2_Sub1_Sub11_5 == null && this.aBoolean603) {
			@Pc(32) Class173 local32 = this.method7244(262144, arg0, true);
			local21 = local32 == null ? null : local32.aClass2_Sub1_Sub11_2;
		} else {
			local21 = this.aClass2_Sub1_Sub11_5;
			this.aClass2_Sub1_Sub11_5 = null;
		}
		if (local21 != null) {
			Static662.method8957(local21, super.aByte141, super.anInt11022, super.anInt11024, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		this.aBoolean604 = false;
		if (this.aClass14_5 != null) {
			this.aClass14_5.s(this.aClass14_5.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return this.aBoolean604;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		if (this.aClass232_6 == null) {
			this.aClass232_6 = Static264.method4550(super.anInt11024, super.anInt11029, this.method7243(arg0, 0), super.anInt11022);
		}
		return this.aClass232_6;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9448() {
		return this.aBoolean603;
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(B)V")
	@Override
	public void method9453() {
		if (this.aClass14_5 != null) {
			this.aClass14_5.method8620();
		}
	}

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.aClass14_5 == null ? 0 : this.aClass14_5.fa();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(9) Class14 local9 = this.method7243(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class76 local14 = arg2.method8085();
			local14.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
			return Static110.aBoolean800 ? local9.method8625(arg0, arg1, local14, false, 0, Static165.anInt3552) : local9.method8624(arg0, arg1, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9449(@OriginalArg(1) Class101 arg0) {
		@Pc(30) Class2_Sub1_Sub11 local30;
		if (this.aClass2_Sub1_Sub11_5 == null && this.aBoolean603) {
			@Pc(23) Class173 local23 = this.method7244(262144, arg0, true);
			local30 = local23 == null ? null : local23.aClass2_Sub1_Sub11_2;
		} else {
			local30 = this.aClass2_Sub1_Sub11_5;
			this.aClass2_Sub1_Sub11_5 = null;
		}
		if (local30 != null) {
			Static13.method7472(local30, super.aByte141, super.anInt11022, super.anInt11024, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method9442((Class101) null);
		}
		return this.aClass14_5 == null ? 0 : this.aClass14_5.ma();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BILclient!ha;Z)Lclient!iu;")
	private Class173 method7244(@OriginalArg(1) int arg0, @OriginalArg(2) Class101 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class331 local13 = Static251.aClass328_1.method8261(this.aShort75 & 0xFFFF);
		@Pc(26) Class18 local26;
		@Pc(30) Class18 local30;
		if (this.aBoolean602) {
			local26 = Static93.aClass18Array33[super.aByte141];
			local30 = Static549.aClass18Array30[0];
		} else {
			if (super.aByte141 >= 3) {
				local30 = null;
			} else {
				local30 = Static549.aClass18Array30[super.aByte141 + 1];
			}
			local26 = Static549.aClass18Array30[super.aByte141];
		}
		return local13.method8293(this.aByte107, 22, super.anInt11024, arg0, arg2, super.anInt11029, local30, (Class278) null, super.anInt11022, arg1, local26);
	}

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aClass14_5 == null ? false : this.aClass14_5.F();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I")
	@Override
	public int method9452() {
		return 22;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		if (this.aClass14_5 == null) {
			return null;
		}
		@Pc(25) Class76 local25 = arg0.method8085();
		local25.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		@Pc(39) Class15_Sub9 local39 = Static401.method6614(1, this.aBoolean601);
		if (Static110.aBoolean800) {
			this.aClass14_5.method8623(local25, local39.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			this.aClass14_5.method8641(local25, local39.aClass15_Sub6Array1[0], 0);
		}
		return local39;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (!(arg3 instanceof Class15_Sub3_Sub5_Sub2)) {
			return;
		}
		@Pc(13) Class15_Sub3_Sub5_Sub2 local13 = (Class15_Sub3_Sub5_Sub2) arg3;
		if (this.aClass14_5 != null && local13.aClass14_5 != null) {
			this.aClass14_5.method8631(local13.aClass14_5, arg0, arg5, arg1, arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		if (this.aClass14_5 == null) {
			return true;
		} else {
			return !this.aClass14_5.r();
		}
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(B)I")
	@Override
	public int method9454() {
		return this.aByte107;
	}
}
