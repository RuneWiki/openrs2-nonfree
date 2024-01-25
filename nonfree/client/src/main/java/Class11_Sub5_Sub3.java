import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class11_Sub5_Sub3 extends Class11_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "Lclient!ji;")
	public final Class134 aClass134_4;

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "Z")
	private final boolean aBoolean195;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!za;Lclient!oq;IIIIIZIIIIIII)V")
	public Class11_Sub5_Sub3(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5441 == 1, Static336.method4764(arg13, arg12));
		this.aClass134_4 = new Class134(arg0, arg1, arg12, arg13, super.aByte101, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean195 = arg1.anInt5419 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
		@Pc(16) Class63 local16 = this.aClass134_4.method2796(super.anInt7622, 262144, true, super.anInt7626, true, arg0);
		if (local16 != null) {
			this.aClass134_4.method2791(super.aShort107, super.aShort108, super.aShort109, arg0, local16, super.aShort106, false);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return this.aClass134_4.anInt3401;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(16) Class63 local16 = this.aClass134_4.method2796(super.anInt7622, 131072, false, super.anInt7626, false, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class6 local28 = arg2.method5990();
			local28.U(super.anInt7626, super.anInt7624, super.anInt7622);
			return local16.method6292(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return this.aClass134_4.method2796(0, arg1, false, 0, false, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(Z)I")
	@Override
	public int method6213() {
		return this.aClass134_4.method2788();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
		this.aClass134_4.method2789(arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return this.aClass134_4.anInt3396;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return this.aClass134_4.anInt3400;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
		this.aClass134_4.method2792(arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return this.aClass134_4.method2797();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		@Pc(16) Class63 local16 = this.aClass134_4.method2796(super.anInt7622, 2048, false, super.anInt7626, true, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class6 local28 = arg0.method5990();
		local28.U(super.anInt7626, super.anInt7624, super.anInt7622);
		@Pc(38) Class28_Sub5 local38 = null;
		if (this.aBoolean195) {
			local38 = Static29.method474(1);
		}
		if (this.aClass134_4.aClass28_Sub1_4 == null) {
			local16.method6293(local28, local38 == null ? null : local38.aClass28_Sub4Array1[0], 0);
		} else {
			@Pc(70) Class56 local70 = this.aClass134_4.aClass28_Sub1_4.method536();
			arg0.method5960(local16, local70, local28, local38 == null ? null : local38.aClass28_Sub4Array1[0]);
		}
		this.aClass134_4.method2791(super.aShort107, super.aShort108, super.aShort109, arg0, local16, super.aShort106, true);
		return local38;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
	}
}
