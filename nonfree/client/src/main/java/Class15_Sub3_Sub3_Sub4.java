import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class15_Sub3_Sub3_Sub4 extends Class15_Sub3_Sub3 implements Interface23 {

	@OriginalMember(owner = "client!kb", name = "vb", descriptor = "Lclient!mg;")
	private Class232 aClass232_4;

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "S")
	private final short aShort59;

	@OriginalMember(owner = "client!kb", name = "nb", descriptor = "Z")
	private boolean aBoolean413;

	@OriginalMember(owner = "client!kb", name = "ib", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "Z")
	private final boolean aBoolean411;

	@OriginalMember(owner = "client!kb", name = "sb", descriptor = "Z")
	private final boolean aBoolean415;

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "B")
	private final byte aByte81;

	@OriginalMember(owner = "client!kb", name = "mb", descriptor = "Z")
	private final boolean aBoolean412;

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lclient!ka;")
	public Class14 aClass14_3;

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "Lclient!r;")
	private Class2_Sub1_Sub11 aClass2_Sub1_Sub11_3;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!ha;Lclient!sea;IIIIIZIIIIIIZ)V")
	public Class15_Sub3_Sub3_Sub4(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9420 == 1, Static574.method8720(arg12, arg13));
		this.aShort59 = (short) arg1.anInt9434;
		this.aBoolean413 = arg14;
		this.aByte82 = (byte) arg12;
		this.aBoolean411 = arg7;
		this.aBoolean415 = arg1.lb != 0 && !arg7;
		super.aByte141 = (byte) arg3;
		this.aByte81 = (byte) arg13;
		this.aBoolean412 = arg0.method8134() && arg1.aBoolean698 && !this.aBoolean411 && Static230.aClass2_Sub54_15.aClass4_Sub18_1.method6164() != 0;
		@Pc(78) int local78 = 2048;
		if (this.aBoolean413) {
			local78 |= 0x10000;
		}
		@Pc(93) Class173 local93 = this.method5000(this.aBoolean412, local78, arg0);
		if (local93 != null) {
			this.aClass14_3 = local93.aClass14_2;
			this.aClass2_Sub1_Sub11_3 = local93.aClass2_Sub1_Sub11_2;
			if (this.aBoolean413) {
				this.aClass14_3 = this.aClass14_3.method8622((byte) 0, local78, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		if (this.aClass14_3 == null) {
			return null;
		}
		@Pc(18) Class76 local18 = arg0.method8085();
		local18.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		@Pc(32) Class15_Sub9 local32 = Static401.method6614(1, this.aBoolean415);
		if (Static110.aBoolean800) {
			this.aClass14_3.method8623(local18, local32.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			this.aClass14_3.method8641(local18, local32.aClass15_Sub6Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return this.aClass14_3 == null ? 0 : this.aClass14_3.ma();
		} else {
			return 10;
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		this.aBoolean413 = false;
		if (this.aClass14_3 != null) {
			this.aClass14_3.s(this.aClass14_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(17) Class14 local17 = this.method5002(arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class76 local22 = arg2.method8085();
			local22.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
			return Static110.aBoolean800 ? local17.method8625(arg0, arg1, local22, false, 0, Static165.anInt3552) : local17.method8624(arg0, arg1, local22, false, 0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class15_Sub3_Sub4_Sub2) {
			@Pc(32) Class15_Sub3_Sub4_Sub2 local32 = (Class15_Sub3_Sub4_Sub2) arg3;
			if (this.aClass14_3 != null && local32.aClass14_7 != null) {
				this.aClass14_3.method8631(local32.aClass14_7, arg0, arg5, arg1, arg4);
			}
		} else if (arg3 instanceof Class15_Sub3_Sub3_Sub4) {
			@Pc(12) Class15_Sub3_Sub3_Sub4 local12 = (Class15_Sub3_Sub3_Sub4) arg3;
			if (this.aClass14_3 != null && local12.aClass14_3 != null) {
				this.aClass14_3.method8631(local12.aClass14_3, arg0, arg5, arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9448() {
		return this.aBoolean412;
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "(I)I")
	public int method4999() {
		return this.aClass14_3 == null ? 15 : this.aClass14_3.na() / 4;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZILclient!ha;B)Lclient!iu;")
	private Class173 method5000(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class101 arg2) {
		@Pc(20) Class331 local20 = Static251.aClass328_1.method8261(this.aShort59 & 0xFFFF);
		@Pc(43) Class18 local43;
		@Pc(34) Class18 local34;
		if (this.aBoolean411) {
			local43 = Static93.aClass18Array33[super.aByte141];
			local34 = Static549.aClass18Array30[0];
		} else {
			if (super.aByte141 < 3) {
				local34 = Static549.aClass18Array30[super.aByte141 + 1];
			} else {
				local34 = null;
			}
			local43 = Static549.aClass18Array30[super.aByte141];
		}
		return local20.method8293(this.aByte82 == 11 ? this.aByte81 + 4 : this.aByte81, this.aByte82 == 11 ? 10 : this.aByte82, super.anInt11024, arg1, arg0, super.anInt11029, local34, (Class278) null, super.anInt11022, arg2, local43);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return this.aBoolean413;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.aClass14_3 == null ? 0 : this.aClass14_3.fa();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I")
	@Override
	public int method9452() {
		return this.aByte82;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class14 method5002(@OriginalArg(0) Class101 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass14_3 != null && arg0.method8083(this.aClass14_3.ua(), arg1) == 0) {
			return this.aClass14_3;
		} else {
			@Pc(28) Class173 local28 = this.method5000(false, arg1, arg0);
			return local28 == null ? null : local28.aClass14_2;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	@Override
	public void method9453() {
		if (this.aClass14_3 != null) {
			this.aClass14_3.method8620();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)I")
	@Override
	public int method9454() {
		return this.aByte81;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
	@Override
	public int method9451() {
		return this.aShort59 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		if (this.aClass14_3 == null) {
			return true;
		} else {
			return !this.aClass14_3.r();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9450(@OriginalArg(1) Class101 arg0) {
		@Pc(14) Class2_Sub1_Sub11 local14;
		if (this.aClass2_Sub1_Sub11_3 == null && this.aBoolean412) {
			@Pc(25) Class173 local25 = this.method5000(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub1_Sub11_2;
		} else {
			local14 = this.aClass2_Sub1_Sub11_3;
			this.aClass2_Sub1_Sub11_3 = null;
		}
		if (local14 != null) {
			Static662.method8957(local14, super.aByte141, super.anInt11022, super.anInt11024, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		if (this.aClass232_4 == null) {
			this.aClass232_4 = Static264.method4550(super.anInt11024, super.anInt11029, this.method5002(arg0, 0), super.anInt11022);
		}
		return this.aClass232_4;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9449(@OriginalArg(1) Class101 arg0) {
		@Pc(25) Class2_Sub1_Sub11 local25;
		if (this.aClass2_Sub1_Sub11_3 == null && this.aBoolean412) {
			@Pc(18) Class173 local18 = this.method5000(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass2_Sub1_Sub11_2;
		} else {
			local25 = this.aClass2_Sub1_Sub11_3;
			this.aClass2_Sub1_Sub11_3 = null;
		}
		if (local25 != null) {
			Static13.method7472(local25, super.aByte141, super.anInt11022, super.anInt11024, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aClass14_3 == null ? false : this.aClass14_3.F();
	}
}
