import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class11_Sub3_Sub1 extends Class11_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!fn", name = "P", descriptor = "Lclient!ji;")
	public final Class134 aClass134_2;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "Z")
	private final boolean aBoolean123;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!za;Lclient!oq;IIIIIZII)V")
	public Class11_Sub3_Sub1(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt5445, arg1.aBoolean383, arg1.aBoolean378);
		this.aClass134_2 = new Class134(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean123 = arg1.anInt5419 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(16) Class63 local16 = this.aClass134_2.method2796(super.anInt6191, 131072, false, super.anInt6194, false, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class6 local23 = arg2.method5990();
			local23.U(super.anInt6194, super.anInt6193, super.anInt6191);
			return local16.method6292(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
		@Pc(16) Class63 local16 = this.aClass134_2.method2796(super.anInt6191, 262144, true, super.anInt6194, true, arg0);
		if (local16 != null) {
			@Pc(29) int local29 = super.anInt6194 >> 7;
			@Pc(34) int local34 = super.anInt6191 >> 7;
			this.aClass134_2.method2791(local29, local29, local34, arg0, local16, local34, false);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return this.aClass134_2.method2796(0, arg1, false, 0, false, arg0);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return this.aClass134_2.anInt3396;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return this.aClass134_2.method2797();
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
		this.aClass134_2.method2792(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return this.aClass134_2.anInt3401;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		@Pc(16) Class63 local16 = this.aClass134_2.method2796(super.anInt6191, 2048, false, super.anInt6194, true, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class6 local23 = arg0.method5990();
		local23.U(super.anInt6194, super.anInt6193, super.anInt6191);
		@Pc(33) Class28_Sub5 local33 = null;
		if (this.aBoolean123) {
			local33 = Static29.method474(1);
		}
		if (this.aClass134_2.aClass28_Sub1_4 == null) {
			local16.method6293(local23, local33 == null ? null : local33.aClass28_Sub4Array1[0], 0);
		} else {
			@Pc(63) Class56 local63 = this.aClass134_2.aClass28_Sub1_4.method536();
			arg0.method5960(local16, local63, local23, local33 == null ? null : local33.aClass28_Sub4Array1[0]);
		}
		@Pc(87) int local87 = super.anInt6194 >> 7;
		@Pc(92) int local92 = super.anInt6191 >> 7;
		this.aClass134_2.method2791(local87, local87, local92, arg0, local16, local92, true);
		return local33;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
		this.aClass134_2.method2789(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return this.aClass134_2.anInt3400;
	}
}
