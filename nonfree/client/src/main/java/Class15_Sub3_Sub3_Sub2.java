import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class15_Sub3_Sub3_Sub2 extends Class15_Sub3_Sub3 implements Interface23 {

	@OriginalMember(owner = "client!g", name = "lb", descriptor = "Lclient!ow;")
	public static Class271 lb;

	@OriginalMember(owner = "client!g", name = "ob", descriptor = "Lclient!mg;")
	private Class232 aClass232_3;

	@OriginalMember(owner = "client!g", name = "fb", descriptor = "Z")
	private boolean aBoolean298 = false;

	@OriginalMember(owner = "client!g", name = "rb", descriptor = "Lclient!nb;")
	public final Class241 aClass241_2;

	@OriginalMember(owner = "client!g", name = "nb", descriptor = "Z")
	private final boolean aBoolean299;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!ha;Lclient!sea;IIIIIZIIIIIII)V")
	public Class15_Sub3_Sub3_Sub2(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class331 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9420 == 1, Static278.method4680(arg12, arg13));
		this.aClass241_2 = new Class241(arg0, arg1, arg12, arg13, super.aByte142, arg3, this, arg7, arg14);
		this.aBoolean299 = arg1.lb != 0 && !arg7;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9449(@OriginalArg(1) Class101 arg0) {
		this.aClass241_2.method6547(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9448() {
		return this.aClass241_2.method6544();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)I")
	@Override
	public int method9451() {
		return this.aClass241_2.anInt7351;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
		@Pc(12) Class14 local12 = this.aClass241_2.method6541(true, arg0, 262144, true);
		if (local12 != null) {
			@Pc(17) Class76 local17 = arg0.method8085();
			local17.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
			this.aClass241_2.method6537(super.aShort65, super.aShort62, local17, local12, super.aShort64, false, arg0, super.aShort63);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
	@Override
	public int method9452() {
		return this.aClass241_2.anInt7362;
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)I")
	@Override
	public int method9430() {
		return this.aClass241_2.method6536();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9450(@OriginalArg(1) Class101 arg0) {
		this.aClass241_2.method6546(arg0);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		return this.aClass232_3;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method9425() {
		return false;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return false;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		@Pc(20) Class14 local20 = this.aClass241_2.method6541(false, arg2, 131072, false);
		if (local20 == null) {
			return false;
		} else {
			@Pc(27) Class76 local27 = arg2.method8085();
			local27.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
			return Static110.aBoolean800 ? local20.method8625(arg0, arg1, local27, false, 0, Static165.anInt3552) : local20.method8624(arg0, arg1, local27, false, 0);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		@Pc(21) Class14 local21 = this.aClass241_2.method6541(true, arg0, 2048, false);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class76 local28 = arg0.method8085();
		local28.method9639(super.anInt11022, super.anInt11029, super.anInt11024);
		@Pc(42) Class15_Sub9 local42 = Static401.method6614(1, this.aBoolean299);
		this.aClass241_2.method6537(super.aShort65, super.aShort62, local28, local21, super.aShort64, true, arg0, super.aShort63);
		if (Static110.aBoolean800) {
			local21.method8623(local28, local42.aClass15_Sub6Array1[0], Static165.anInt3552, 0);
		} else {
			local21.method8641(local28, local42.aClass15_Sub6Array1[0], 0);
		}
		if (this.aClass241_2.aClass15_Sub5_6 != null) {
			@Pc(88) Class127 local88 = this.aClass241_2.aClass15_Sub5_6.method2300();
			if (Static110.aBoolean800) {
				arg0.method8115(local88, Static165.anInt3552);
			} else {
				arg0.method8065(local88);
			}
		}
		this.aBoolean298 = local21.F() || this.aClass241_2.aClass15_Sub5_6 != null;
		if (this.aClass232_3 == null) {
			this.aClass232_3 = Static264.method4550(super.anInt11024, super.anInt11029, local21, super.anInt11022);
		} else {
			Static649.method9557(super.anInt11024, super.anInt11022, super.anInt11029, this.aClass232_3, local21);
		}
		return local42;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
	@Override
	public void method9453() {
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)I")
	@Override
	public int method9436(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aClass241_2.method6548() : -41;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(B)I")
	@Override
	public int method9454() {
		return this.aClass241_2.anInt7342;
	}

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method9434() {
		return this.aBoolean298;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!pe;B)V")
	public void method3535(@OriginalArg(0) Class278 arg0) {
		this.aClass241_2.method6542(arg0);
	}
}
