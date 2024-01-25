import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "Lclient!gs;")
	public final Class92 aClass92_3;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "Z")
	private final boolean aBoolean201;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!qa;Lclient!cd;IIIIIZII)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt787, arg1.aBoolean46, arg1.aBoolean41);
		this.aClass92_3 = new Class92(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean201 = arg1.anInt788 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
		this.aClass92_3.method2144(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return this.aClass92_3.anInt2485;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
		this.aClass92_3.method2145(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return this.aClass92_3.anInt2489;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
		@Pc(16) Class108 local16 = this.aClass92_3.method2142(super.anInt4639, true, super.anInt4633, true, 262144, arg0);
		if (local16 != null) {
			@Pc(32) int local32 = super.anInt4633 >> 7;
			@Pc(37) int local37 = super.anInt4639 >> 7;
			this.aClass92_3.method2147(local37, local32, local37, arg0, false, local16, local32);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return this.aClass92_3.method2142(0, false, 0, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return this.aClass92_3.anInt2477;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return false;
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		@Pc(16) Class108 local16 = this.aClass92_3.method2142(super.anInt4639, false, super.anInt4633, true, 2048, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class11 local23 = arg0.method5989();
		local23.C(super.anInt4633, super.anInt4636, super.anInt4639);
		@Pc(33) Class23_Sub5 local33 = null;
		if (this.aBoolean201) {
			local33 = Static217.method1031(1);
		}
		if (this.aClass92_3.aClass23_Sub3_2 == null) {
			local16.method4931(local23, local33 == null ? null : local33.aClass23_Sub6Array1[0], 0);
		} else {
			@Pc(49) Class77 local49 = this.aClass92_3.aClass23_Sub3_2.method2974();
			arg0.method5999(local16, local49, local23, local33 == null ? null : local33.aClass23_Sub6Array1[0]);
		}
		@Pc(82) int local82 = super.anInt4633 >> 7;
		@Pc(87) int local87 = super.anInt4639 >> 7;
		this.aClass92_3.method2147(local87, local82, local87, arg0, true, local16, local82);
		return local33;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(16) Class108 local16 = this.aClass92_3.method2142(super.anInt4639, false, super.anInt4633, false, 131072, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class11 local28 = arg2.method5989();
			local28.C(super.anInt4633, super.anInt4636, super.anInt4639);
			return local16.method4937(arg1, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return this.aClass92_3.method2140();
	}
}
