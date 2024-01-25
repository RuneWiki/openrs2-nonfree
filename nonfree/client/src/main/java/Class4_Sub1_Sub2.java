import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aga")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!aga", name = "I", descriptor = "Lclient!qt;")
	private Class277 aClass277_1;

	@OriginalMember(owner = "client!aga", name = "H", descriptor = "Lclient!as;")
	public final Class16 aClass16_1;

	@OriginalMember(owner = "client!aga", name = "L", descriptor = "Z")
	private final boolean aBoolean20;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!oa;Lclient!pg;IIIIIZIIIIIII)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt6928 == 1, Static38.method1009(arg12, arg13));
		this.aClass16_1 = new Class16(arg0, arg1, arg12, arg13, super.aByte108, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean20 = arg1.anInt6889 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)I")
	@Override
	public int method6265() {
		return this.aClass16_1.anInt687;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method6267(@OriginalArg(0) Class14 arg0) {
		this.aClass16_1.method732(arg0);
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)I")
	@Override
	public int method6268() {
		return this.aClass16_1.anInt682;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZLclient!oa;Lclient!nt;IIII)V")
	@Override
	public void method7787(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return this.aClass277_1;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class20 local16 = this.aClass16_1.method730(131072, arg1, super.anInt9540, false, super.anInt9542, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class54 local23 = arg1.method6851();
			local23.GA(super.anInt9542, super.anInt9541, super.anInt9540);
			return local16.method7266(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6271() {
		return this.aClass16_1.method738();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V")
	@Override
	public void method6266() {
	}

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "(I)I")
	@Override
	public int method7790() {
		return this.aClass16_1.method734();
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7785() {
		return false;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method6270(@OriginalArg(0) Class14 arg0) {
		this.aClass16_1.method729(arg0);
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
		@Pc(16) Class20 local16 = this.aClass16_1.method730(262144, arg0, super.anInt9540, true, super.anInt9542, true);
		if (local16 != null) {
			@Pc(33) Class54 local33 = arg0.method6851();
			local33.GA(super.anInt9542, super.anInt9541, super.anInt9540);
			this.aClass16_1.method735(local33, false, super.aShort123, local16, super.aShort126, arg0, super.aShort125, super.aShort124);
		}
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)I")
	@Override
	public int method6272() {
		return this.aClass16_1.anInt672;
	}

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(B)V")
	@Override
	public void method7782() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		@Pc(18) Class20 local18 = this.aClass16_1.method730(2048, arg0, super.anInt9540, false, super.anInt9542, true);
		if (local18 == null) {
			return null;
		}
		@Pc(32) Class54 local32 = arg0.method6851();
		local32.GA(super.anInt9542, super.anInt9541, super.anInt9540);
		@Pc(42) Class98_Sub8 local42 = null;
		if (this.aBoolean20) {
			local42 = Static348.method5326(1);
		}
		this.aClass16_1.method735(local32, true, super.aShort123, local18, super.aShort126, arg0, super.aShort125, super.aShort124);
		if (this.aClass16_1.aClass98_Sub3_3 == null) {
			local18.method7256(local32, local42 == null ? null : local42.aClass98_Sub5Array1[0], 0);
		} else {
			@Pc(88) Class144 local88 = this.aClass16_1.aClass98_Sub3_3.method4532();
			arg0.method6856(local18, local88, local32, local42 == null ? null : local42.aClass98_Sub5Array1[0], 0);
		}
		if (this.aClass277_1 == null) {
			this.aClass277_1 = Static323.method5117(local18, super.anInt9540, super.anInt9541, super.anInt9542);
		} else {
			Static490.method6709(local18, super.anInt9540, super.anInt9541, this.aClass277_1, super.anInt9542);
		}
		return local42;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class20 method6269(@OriginalArg(0) Class14 arg0, @OriginalArg(2) int arg1) {
		return this.aClass16_1.method730(arg1, arg0, 0, false, 0, false);
	}
}
