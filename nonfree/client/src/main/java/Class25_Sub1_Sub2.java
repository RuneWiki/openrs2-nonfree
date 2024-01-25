import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class25_Sub1_Sub2 extends Class25_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "Lclient!pm;")
	public final Class190 aClass190_3;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "Z")
	private final boolean aBoolean379;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!za;Lclient!er;IIIIIZIIIIII)V")
	public Class25_Sub1_Sub2(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static31.method401(arg11, arg12));
		this.aClass190_3 = new Class190(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean379 = arg1.anInt1821 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return this.aClass190_3.anInt5385;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = this.aClass190_3.method4235(super.anInt5355, super.anInt5351, arg1, false, false, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class32 local23 = arg1.method5747();
			local23.U(super.anInt5359 + super.anInt5351, super.anInt5356, super.anInt5355 + super.anInt5353);
			return local16.method5957(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
		@Pc(20) Class57 local20 = this.aClass190_3.method4235(super.anInt5355, super.anInt5351, arg0, true, false, 262144);
		if (local20 != null) {
			@Pc(27) int local27 = super.anInt5351 >> 7;
			@Pc(32) int local32 = super.anInt5355 >> 7;
			this.aClass190_3.method4227(local20, local27, local27, local32, arg0, local32, false);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
		this.aClass190_3.method4240(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return this.aClass190_3.anInt5412;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return this.aClass190_3.method4236();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return this.aClass190_3.anInt5392;
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)I")
	@Override
	public int method4207() {
		return this.aClass190_3.method4226();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return this.aClass190_3.method4235(0, 0, arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
		this.aClass190_3.method4225(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		@Pc(16) Class57 local16 = this.aClass190_3.method4235(super.anInt5355, super.anInt5351, arg0, true, false, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class32 local23 = arg0.method5747();
		local23.U(super.anInt5351 + super.anInt5359, super.anInt5356, super.anInt5355 + super.anInt5353);
		@Pc(39) Class4_Sub7 local39 = null;
		if (this.aBoolean379) {
			local39 = Static142.method2157(1);
		}
		if (this.aClass190_3.aClass4_Sub2_7 == null) {
			local16.method5953(local23, local39 == null ? null : local39.aClass4_Sub8Array1[0], 0);
		} else {
			@Pc(55) Class71 local55 = this.aClass190_3.aClass4_Sub2_7.method1240();
			arg0.method5762(local16, local55, local23, local39 == null ? null : local39.aClass4_Sub8Array1[0]);
		}
		@Pc(88) int local88 = super.anInt5351 >> 7;
		@Pc(98) int local98 = super.anInt5355 >> 7;
		this.aClass190_3.method4227(local16, local88, local88, local98, arg0, local98, true);
		return local39;
	}
}
