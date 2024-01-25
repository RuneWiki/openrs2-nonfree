import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "Lclient!gs;")
	public final Class92 aClass92_1;

	@OriginalMember(owner = "client!cj", name = "N", descriptor = "Z")
	private final boolean aBoolean61;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!qa;Lclient!cd;IIIIIZIIIIII)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static141.method2173(arg11, arg12));
		this.aClass92_1 = new Class92(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean61 = arg1.anInt788 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return this.aClass92_1.method2142(0, false, 0, false, arg0, arg1);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
		this.aClass92_1.method2145(arg0);
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return this.aClass92_1.anInt2477;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return this.aClass92_1.anInt2489;
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)I")
	@Override
	public int method6252() {
		return this.aClass92_1.method2141();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
		this.aClass92_1.method2144(arg0);
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return this.aClass92_1.anInt2485;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(16) Class108 local16 = this.aClass92_1.method2142(super.anInt7728, false, super.anInt7724, false, 131072, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(30) Class11 local30 = arg2.method5989();
			local30.C(super.anInt7724 + super.anInt7737, super.anInt7732, super.anInt7728 + super.anInt7739);
			return local16.method4937(arg1, arg0, local30, false);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return this.aClass92_1.method2140();
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
		@Pc(16) Class108 local16 = this.aClass92_1.method2142(super.anInt7728, false, super.anInt7724, true, 262144, arg0);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt7724 >> 7;
			@Pc(28) int local28 = super.anInt7728 >> 7;
			this.aClass92_1.method2147(local28, local23, local28, arg0, false, local16, local23);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		@Pc(16) Class108 local16 = this.aClass92_1.method2142(super.anInt7728, false, super.anInt7724, true, 2048, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class11 local23 = arg0.method5989();
		local23.C(super.anInt7737 + super.anInt7724, super.anInt7732, super.anInt7728 + super.anInt7739);
		@Pc(40) Class23_Sub5 local40 = null;
		if (this.aBoolean61) {
			local40 = Static217.method1031(1);
		}
		if (this.aClass92_1.aClass23_Sub3_2 == null) {
			local16.method4931(local23, local40 == null ? null : local40.aClass23_Sub6Array1[0], 0);
		} else {
			@Pc(70) Class77 local70 = this.aClass92_1.aClass23_Sub3_2.method2974();
			arg0.method5999(local16, local70, local23, local40 == null ? null : local40.aClass23_Sub6Array1[0]);
		}
		@Pc(89) int local89 = super.anInt7724 >> 7;
		@Pc(94) int local94 = super.anInt7728 >> 7;
		this.aClass92_1.method2147(local94, local89, local94, arg0, true, local16, local89);
		return local40;
	}
}
