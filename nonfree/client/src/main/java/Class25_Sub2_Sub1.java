import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class25_Sub2_Sub1 extends Class25_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!bo", name = "X", descriptor = "Lclient!pm;")
	public final Class190 aClass190_1;

	@OriginalMember(owner = "client!bo", name = "K", descriptor = "Z")
	private final boolean aBoolean76;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!za;Lclient!er;IIIIIZII)V")
	public Class25_Sub2_Sub1(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt1813, arg1.aBoolean206, arg1.aBoolean208);
		this.aClass190_1 = new Class190(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean76 = arg1.anInt1821 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	@Override
	public Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		return this.aClass190_1.method4235(0, 0, arg1, false, false, arg0);
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	@Override
	public void method4616() {
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4619() {
		return this.aClass190_1.method4236();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I")
	@Override
	public int method4617() {
		return this.aClass190_1.anInt5412;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
		@Pc(16) Class57 local16 = this.aClass190_1.method4235(super.anInt4823, super.anInt4822, arg0, true, true, 262144);
		if (local16 != null) {
			@Pc(32) int local32 = super.anInt4822 >> 7;
			@Pc(37) int local37 = super.anInt4823 >> 7;
			this.aClass190_1.method4227(local16, local32, local32, local37, arg0, local37, false);
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		@Pc(16) Class57 local16 = this.aClass190_1.method4235(super.anInt4823, super.anInt4822, arg0, true, false, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class32 local23 = arg0.method5747();
		local23.U(super.anInt4822, super.anInt4821, super.anInt4823);
		@Pc(33) Class4_Sub7 local33 = null;
		if (this.aBoolean76) {
			local33 = Static142.method2157(1);
		}
		if (this.aClass190_1.aClass4_Sub2_7 == null) {
			local16.method5953(local23, local33 == null ? null : local33.aClass4_Sub8Array1[0], 0);
		} else {
			@Pc(63) Class71 local63 = this.aClass190_1.aClass4_Sub2_7.method1240();
			arg0.method5762(local16, local63, local23, local33 == null ? null : local33.aClass4_Sub8Array1[0]);
		}
		@Pc(82) int local82 = super.anInt4822 >> 7;
		@Pc(94) int local94 = super.anInt4823 >> 7;
		this.aClass190_1.method4227(local16, local82, local82, local94, arg0, local94, true);
		return local33;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)I")
	@Override
	public int method4623() {
		return this.aClass190_1.anInt5385;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)I")
	@Override
	public int method4620() {
		return this.aClass190_1.anInt5392;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method4622(@OriginalArg(1) Class34 arg0) {
		this.aClass190_1.method4225(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4621(@OriginalArg(1) Class34 arg0) {
		this.aClass190_1.method4240(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = this.aClass190_1.method4235(super.anInt4823, super.anInt4822, arg1, false, false, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class32 local29 = arg1.method5747();
			local29.U(super.anInt4822, super.anInt4821, super.anInt4823);
			return local16.method5957(arg2, arg0, local29, false);
		}
	}
}
