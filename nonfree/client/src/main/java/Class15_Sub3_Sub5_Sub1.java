import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class15_Sub3_Sub5_Sub1 extends Class15_Sub3_Sub5 implements Interface23 {

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lclient!mg;")
	private Class232 aClass232_5;

	@OriginalMember(owner = "client!mf", name = "fb", descriptor = "Z")
	private boolean aBoolean533 = false;

	@OriginalMember(owner = "client!mf", name = "Y", descriptor = "Lclient!nb;")
	public final Class241 aClass241_3;

	@OriginalMember(owner = "client!mf", name = "gb", descriptor = "Z")
	private final boolean aBoolean534;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!ha;Lclient!sea;IIIIIZII)V")
	public Class15_Sub3_Sub5_Sub1(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt9411);
		this.aClass241_3 = new Class241(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean534 = arg1.lb != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)I")
	@Override
	public int method9452() {
		return this.aClass241_3.anInt7362;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9448() {
		return this.aClass241_3.method6544();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		return this.aClass232_5;
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.aClass241_3.method6536();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!pe;)V")
	public void method6315(@OriginalArg(1) Class278 arg0) {
		this.aClass241_3.method6542(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9449(@OriginalArg(1) Class101 arg0) {
		this.aClass241_3.method6547(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		@Pc(14) Class14 local14 = this.aClass241_3.method6541(true, arg0, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class76 local21 = arg0.method8085();
		local21.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		@Pc(35) Class15_Sub9 local35 = Static401.method6614(1, this.aBoolean534);
		@Pc(45) int local45 = super.anInt11022 >> 9;
		@Pc(50) int local50 = super.anInt11024 >> 9;
		this.aClass241_3.method6537(local50, local45, local21, local14, local50, true, arg0, local45);
		if (Static110.aBoolean800) {
			local14.method8623(local21, local35.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			local14.method8641(local21, local35.aClass15_Sub6Array1[0], 0);
		}
		if (this.aClass241_3.aClass15_Sub5_6 != null) {
			@Pc(92) Class127 local92 = this.aClass241_3.aClass15_Sub5_6.method2300();
			if (Static110.aBoolean800) {
				arg0.method8115(local92, Static165.anInt3552);
			} else {
				arg0.method8065(local92);
			}
		}
		this.aBoolean533 = local14.F() || this.aClass241_3.aClass15_Sub5_6 != null;
		if (this.aClass232_5 == null) {
			this.aClass232_5 = Static264.method4550(super.anInt11024, super.anInt11029, local14, super.anInt11022);
		} else {
			Static649.method9557(super.anInt11024, super.anInt11022, super.anInt11029, this.aClass232_5, local14);
		}
		return local35;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method9430();
		}
		return this.aClass241_3.method6548();
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)I")
	@Override
	public int method9454() {
		return this.aClass241_3.anInt7342;
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aBoolean533;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)I")
	@Override
	public int method9451() {
		return this.aClass241_3.anInt7351;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9450(@OriginalArg(1) Class101 arg0) {
		this.aClass241_3.method6546(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
		@Pc(16) Class14 local16 = this.aClass241_3.method6541(true, arg0, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt11022 >> 9;
		@Pc(28) int local28 = super.anInt11024 >> 9;
		@Pc(31) Class76 local31 = arg0.method8085();
		local31.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		this.aClass241_3.method6537(local28, local23, local31, local16, local28, false, arg0, local23);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(12) Class14 local12 = this.aClass241_3.method6541(false, arg2, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class76 local19 = arg2.method8085();
			local19.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
			return Static110.aBoolean800 ? local12.method8625(arg0, arg1, local19, false, 0, Static165.anInt3552) : local12.method8624(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
	@Override
	public void method9453() {
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return false;
	}
}
