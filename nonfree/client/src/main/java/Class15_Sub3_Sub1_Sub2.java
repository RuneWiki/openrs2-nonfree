import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class15_Sub3_Sub1_Sub2 extends Class15_Sub3_Sub1 implements Interface23 {

	@OriginalMember(owner = "client!sj", name = "W", descriptor = "Lclient!mg;")
	private Class232 aClass232_7;

	@OriginalMember(owner = "client!sj", name = "U", descriptor = "Z")
	private boolean aBoolean706 = false;

	@OriginalMember(owner = "client!sj", name = "lb", descriptor = "Lclient!nb;")
	public final Class241 lb;

	@OriginalMember(owner = "client!sj", name = "Z", descriptor = "Z")
	private final boolean aBoolean707;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!ha;Lclient!sea;IIIIIZIIIII)V")
	public Class15_Sub3_Sub1_Sub2(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.lb = new Class241(arg0, arg1, arg10, arg11, super.aByte142, arg3, this, arg7, arg12);
		this.aBoolean707 = arg1.lb != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		return this.aClass232_7;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9449(@OriginalArg(1) Class101 arg0) {
		this.lb.method6547(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
	@Override
	public void method9453() {
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		@Pc(14) Class14 local14 = this.lb.method6541(true, arg0, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class76 local21 = arg0.method8085();
		local21.method9639(super.anInt11022 + super.aShort103, super.anInt11029, super.anInt11024 + super.aShort104);
		@Pc(41) Class15_Sub9 local41 = Static401.method6614(1, this.aBoolean707);
		@Pc(52) int local52 = super.anInt11022 >> 9;
		@Pc(57) int local57 = super.anInt11024 >> 9;
		this.lb.method6537(local57, local52, local21, local14, local57, true, arg0, local52);
		if (Static110.aBoolean800) {
			local14.method8623(local21, local41.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			local14.method8641(local21, local41.aClass15_Sub6Array1[0], 0);
		}
		if (this.lb.aClass15_Sub5_6 != null) {
			@Pc(99) Class127 local99 = this.lb.aClass15_Sub5_6.method2300();
			if (Static110.aBoolean800) {
				arg0.method8115(local99, Static165.anInt3552);
			} else {
				arg0.method8065(local99);
			}
		}
		this.aBoolean706 = local14.F() || this.lb.aClass15_Sub5_6 != null;
		if (this.aClass232_7 == null) {
			this.aClass232_7 = Static264.method4550(super.anInt11024, super.anInt11029, local14, super.anInt11022);
		} else {
			Static649.method9557(super.anInt11024, super.anInt11022, super.anInt11029, this.aClass232_7, local14);
		}
		return local41;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		return false;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9448() {
		return this.lb.method6544();
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.lb.method6548() : 34;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
		@Pc(12) Class14 local12 = this.lb.method6541(true, arg0, 262144, false);
		if (local12 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt11022 >> 9;
		@Pc(33) int local33 = super.anInt11024 >> 9;
		@Pc(36) Class76 local36 = arg0.method8085();
		local36.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		this.lb.method6537(local33, local28, local36, local12, local33, false, arg0, local28);
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.lb.method6536();
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9450(@OriginalArg(1) Class101 arg0) {
		this.lb.method6546(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
	@Override
	public int method9452() {
		return this.lb.anInt7362;
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aBoolean706;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(12) Class14 local12 = this.lb.method6541(false, arg2, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class76 local19 = arg2.method8085();
			local19.method9639(super.anInt11022 + super.aShort103, super.anInt11029, super.aShort104 + super.anInt11024);
			return Static110.aBoolean800 ? local12.method8625(arg0, arg1, local19, false, 0, Static165.anInt3552) : local12.method8624(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)I")
	@Override
	public int method9454() {
		return this.lb.anInt7342;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!pe;B)V")
	public void method8415(@OriginalArg(0) Class278 arg0) {
		this.lb.method6542(arg0);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)I")
	@Override
	public int method9451() {
		return this.lb.anInt7351;
	}
}
