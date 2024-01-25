import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class15_Sub3_Sub4_Sub1 extends Class15_Sub3_Sub4 implements Interface23 {

	@OriginalMember(owner = "client!fi", name = "lb", descriptor = "Lclient!mca;")
	public static final Class229 lb = new Class229("game4", 3);

	@OriginalMember(owner = "client!fi", name = "bb", descriptor = "Lclient!mg;")
	private Class232 aClass232_2;

	@OriginalMember(owner = "client!fi", name = "ab", descriptor = "Z")
	private boolean aBoolean268 = false;

	@OriginalMember(owner = "client!fi", name = "db", descriptor = "Lclient!nb;")
	public final Class241 aClass241_1;

	@OriginalMember(owner = "client!fi", name = "X", descriptor = "Z")
	private final boolean aBoolean267;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!ha;Lclient!sea;IIIIIZIII)V")
	public Class15_Sub3_Sub4_Sub1(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static639.method9459(arg8, arg9));
		this.aClass241_1 = new Class241(arg0, arg1, arg8, arg9, super.aByte142, arg3, this, arg7, arg10);
		this.aBoolean267 = arg1.lb != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aClass241_1.method6548() : 86;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!pe;)V")
	public void method3285(@OriginalArg(1) Class278 arg0) {
		this.aClass241_1.method6542(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9449(@OriginalArg(1) Class101 arg0) {
		this.aClass241_1.method6547(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		@Pc(16) Class14 local16 = this.aClass241_1.method6541(true, arg0, 2048, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class76 local23 = arg0.method8085();
		local23.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		@Pc(37) Class15_Sub9 local37 = Static401.method6614(1, this.aBoolean267);
		@Pc(47) int local47 = super.anInt11022 >> 9;
		@Pc(52) int local52 = super.anInt11024 >> 9;
		this.aClass241_1.method6537(local52, local47, local23, local16, local52, true, arg0, local47);
		if (Static110.aBoolean800) {
			local16.method8623(local23, local37.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			local16.method8641(local23, local37.aClass15_Sub6Array1[0], 0);
		}
		if (this.aClass241_1.aClass15_Sub5_6 != null) {
			@Pc(94) Class127 local94 = this.aClass241_1.aClass15_Sub5_6.method2300();
			if (Static110.aBoolean800) {
				arg0.method8115(local94, Static165.anInt3552);
			} else {
				arg0.method8065(local94);
			}
		}
		this.aBoolean268 = local16.F() || this.aClass241_1.aClass15_Sub5_6 != null;
		if (this.aClass232_2 == null) {
			this.aClass232_2 = Static264.method4550(super.anInt11024, super.anInt11029, local16, super.anInt11022);
		} else {
			Static649.method9557(super.anInt11024, super.anInt11022, super.anInt11029, this.aClass232_2, local16);
		}
		return local37;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(12) Class14 local12 = this.aClass241_1.method6541(false, arg2, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(27) Class76 local27 = arg2.method8085();
			local27.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
			return Static110.aBoolean800 ? local12.method8625(arg0, arg1, local27, false, 0, Static165.anInt3552) : local12.method8624(arg0, arg1, local27, false, 0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.aClass241_1.method6536();
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		return this.aClass232_2;
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	@Override
	public void method9453() {
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
		@Pc(16) Class14 local16 = this.aClass241_1.method6541(true, arg0, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt11022 >> 9;
		@Pc(28) int local28 = super.anInt11024 >> 9;
		@Pc(31) Class76 local31 = arg0.method8085();
		local31.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		this.aClass241_1.method6537(local28, local23, local31, local16, local28, false, arg0, local23);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9448() {
		return this.aClass241_1.method6544();
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)I")
	@Override
	public int method9454() {
		return this.aClass241_1.anInt7342;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9450(@OriginalArg(1) Class101 arg0) {
		this.aClass241_1.method6546(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)I")
	@Override
	public int method9452() {
		return this.aClass241_1.anInt7362;
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aBoolean268;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)I")
	@Override
	public int method9451() {
		return this.aClass241_1.anInt7351;
	}
}
