import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!cm", name = "H", descriptor = "Lclient!gs;")
	public final Class92 aClass92_2;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Z")
	private final boolean aBoolean71;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!qa;Lclient!cd;IIIIIZIII)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static343.method4799(arg9, arg8));
		this.aClass92_2 = new Class92(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6695, super.anInt6693, arg7, arg10);
		this.aBoolean71 = arg1.anInt788 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return this.aClass92_2.anInt2477;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(22) Class108 local22 = this.aClass92_2.method2142(super.anInt6693, false, super.anInt6695, false, 131072, arg2);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class11 local29 = arg2.method5989();
			local29.C(super.anInt6695, super.anInt6691, super.anInt6693);
			return local22.method4937(arg1, arg0, local29, false);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		@Pc(16) Class108 local16 = this.aClass92_2.method2142(super.anInt6693, false, super.anInt6695, true, 2048, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class11 local23 = arg0.method5989();
		local23.C(super.anInt6695, super.anInt6691, super.anInt6693);
		@Pc(33) Class23_Sub5 local33 = null;
		if (this.aBoolean71) {
			local33 = Static217.method1031(1);
		}
		if (this.aClass92_2.aClass23_Sub3_2 == null) {
			local16.method4931(local23, local33 == null ? null : local33.aClass23_Sub6Array1[0], 0);
		} else {
			@Pc(49) Class77 local49 = this.aClass92_2.aClass23_Sub3_2.method2974();
			arg0.method5999(local16, local49, local23, local33 == null ? null : local33.aClass23_Sub6Array1[0]);
		}
		@Pc(82) int local82 = super.anInt6695 >> 7;
		@Pc(87) int local87 = super.anInt6693 >> 7;
		this.aClass92_2.method2147(local87, local82, local87, arg0, true, local16, local82);
		return local33;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return this.aClass92_2.anInt2485;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
		this.aClass92_2.method2144(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return this.aClass92_2.method2140();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return this.aClass92_2.method2142(0, false, 0, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return this.aClass92_2.anInt2489;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
		this.aClass92_2.method2145(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return false;
	}

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
		@Pc(16) Class108 local16 = this.aClass92_2.method2142(super.anInt6693, true, super.anInt6695, true, 262144, arg0);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt6695 >> 7;
			@Pc(28) int local28 = super.anInt6693 >> 7;
			this.aClass92_2.method2147(local28, local23, local28, arg0, false, local16, local23);
		}
	}
}
