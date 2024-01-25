import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Lclient!ji;")
	public final Class134 aClass134_3;

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "Z")
	private final boolean aBoolean165;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!za;Lclient!oq;IIIIIZIII)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static11.method173(arg8, arg9));
		this.aClass134_3 = new Class134(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt3189, super.anInt3192, arg7, arg10);
		this.aBoolean165 = arg1.anInt5419 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return this.aClass134_3.method2796(0, arg1, false, 0, false, arg0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
		this.aClass134_3.method2789(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return this.aClass134_3.anInt3400;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
		@Pc(16) Class63 local16 = this.aClass134_3.method2796(super.anInt3192, 262144, true, super.anInt3189, true, arg0);
		if (local16 != null) {
			@Pc(30) int local30 = super.anInt3189 >> 7;
			@Pc(35) int local35 = super.anInt3192 >> 7;
			this.aClass134_3.method2791(local30, local30, local35, arg0, local16, local35, false);
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
		this.aClass134_3.method2792(arg0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return this.aClass134_3.anInt3401;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return this.aClass134_3.anInt3396;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return this.aClass134_3.method2797();
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		@Pc(16) Class63 local16 = this.aClass134_3.method2796(super.anInt3192, 2048, false, super.anInt3189, true, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class6 local23 = arg0.method5990();
		local23.U(super.anInt3189, super.anInt3193, super.anInt3192);
		@Pc(33) Class28_Sub5 local33 = null;
		if (this.aBoolean165) {
			local33 = Static29.method474(1);
		}
		if (this.aClass134_3.aClass28_Sub1_4 == null) {
			local16.method6293(local23, local33 == null ? null : local33.aClass28_Sub4Array1[0], 0);
		} else {
			@Pc(63) Class56 local63 = this.aClass134_3.aClass28_Sub1_4.method536();
			arg0.method5960(local16, local63, local23, local33 == null ? null : local33.aClass28_Sub4Array1[0]);
		}
		@Pc(94) int local94 = super.anInt3189 >> 7;
		@Pc(99) int local99 = super.anInt3192 >> 7;
		this.aClass134_3.method2791(local94, local94, local99, arg0, local16, local99, true);
		return local33;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(22) Class63 local22 = this.aClass134_3.method2796(super.anInt3192, 131072, false, super.anInt3189, false, arg2);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class6 local29 = arg2.method5990();
			local29.U(super.anInt3189, super.anInt3193, super.anInt3192);
			return local22.method6292(arg0, arg1, local29, false);
		}
	}
}
