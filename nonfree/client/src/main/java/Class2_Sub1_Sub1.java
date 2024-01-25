import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "Lclient!ie;")
	public final Class97 aClass97_1;

	@OriginalMember(owner = "client!aq", name = "P", descriptor = "Z")
	private final boolean aBoolean21;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!vm;Lclient!ds;IIIIIIIZIIII)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static171.method3208(arg2, arg3));
		this.aClass97_1 = new Class97(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean21 = arg1.anInt1336 != 0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		@Pc(16) Class5 local16 = this.aClass97_1.method2533(arg0, super.anInt5077, 1024, super.anInt5064, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class23 local23 = arg0.method4466();
		local23.method5091(super.anInt5065 + super.anInt5064, super.anInt5076, super.anInt5077 + super.anInt5075);
		@Pc(40) Class17_Sub2 local40 = null;
		if (this.aBoolean21) {
			local40 = Static238.method4100(1);
		}
		if (this.aClass97_1.aClass17_Sub3_3 == null) {
			local16.method4029(local23, local40 == null ? null : local40.aClass17_Sub6Array1[0], 0);
		} else {
			@Pc(56) Class88 local56 = this.aClass97_1.aClass17_Sub3_3.method1067();
			arg0.method4451(local16, local56, local23, local40 == null ? null : local40.aClass17_Sub6Array1[0]);
		}
		this.aClass97_1.method2537(super.anInt5077 >> 7, arg0, super.anInt5064 >> 7, super.anInt5077 >> 7, true, local16, super.anInt5064 >> 7);
		return local40;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLclient!vm;)V")
	@Override
	public void method4730(@OriginalArg(1) Class92 arg0) {
		this.aClass97_1.method2535(arg0);
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(B)I")
	@Override
	public int method4734() {
		return this.aClass97_1.anInt2857;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!vm;II)Lclient!jn;")
	@Override
	public Class5 method4727(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1) {
		return this.aClass97_1.method2533(arg0, 0, arg1, 0, false, false);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)V")
	@Override
	public void method4731() {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
		@Pc(16) Class5 local16 = this.aClass97_1.method2533(arg0, super.anInt5077, 131072, super.anInt5064, true, false);
		if (local16 != null) {
			this.aClass97_1.method2537(super.anInt5077 >> 7, arg0, super.anInt5064 >> 7, super.anInt5077 >> 7, false, local16, super.anInt5064 >> 7);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)I")
	@Override
	public int method4194() {
		return this.aClass97_1.method2538();
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)I")
	@Override
	public int method4729() {
		return this.aClass97_1.anInt2863;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZLclient!vm;)V")
	@Override
	public void method4732(@OriginalArg(1) Class92 arg0) {
		this.aClass97_1.method2536(arg0);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(16) Class5 local16 = this.aClass97_1.method2533(arg2, super.anInt5077, 65536, super.anInt5064, false, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class23 local28 = arg2.method4466();
			local28.method5091(super.anInt5065 + super.anInt5064, super.anInt5076, super.anInt5075 + super.anInt5077);
			return local16.method3995(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4728() {
		return this.aClass97_1.method2531();
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I")
	@Override
	public int method4733() {
		return this.aClass97_1.anInt2846;
	}
}
