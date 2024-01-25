import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class8_Sub2_Sub2 extends Class8_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "Lclient!qp;")
	public final Class213 aClass213_1;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "Z")
	private final boolean aBoolean229;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!ya;Lclient!ho;IIIIIZIII)V")
	public Class8_Sub2_Sub2(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static423.method5698(arg9, arg8));
		this.aClass213_1 = new Class213(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt5212, super.anInt5218, arg7, arg10);
		this.aBoolean229 = arg1.anInt2871 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return this.aClass213_1.anInt5417;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return this.aClass213_1.method4395(arg0, arg1, false, false, 0, 0);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		@Pc(16) Class116 local16 = this.aClass213_1.method4395(2048, arg0, true, false, super.anInt5218, super.anInt5212);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class35 local23 = arg0.method5398();
		local23.j(super.anInt5212, super.anInt5213, super.anInt5218);
		@Pc(33) Class20_Sub5 local33 = null;
		if (this.aBoolean229) {
			local33 = Static371.method4760(1);
		}
		if (this.aClass213_1.aClass20_Sub3_4 == null) {
			local16.method3117(local23, local33 == null ? null : local33.aClass20_Sub8Array1[0], 0);
		} else {
			@Pc(49) Class83 local49 = this.aClass213_1.aClass20_Sub3_4.method2129();
			arg0.method5396(local16, local49, local23, local33 == null ? null : local33.aClass20_Sub8Array1[0]);
		}
		@Pc(82) int local82 = super.anInt5212 >> 7;
		@Pc(87) int local87 = super.anInt5218 >> 7;
		this.aClass213_1.method4400(local87, local82, local16, local82, local87, true, arg0);
		return local33;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return this.aClass213_1.method4397();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
		this.aClass213_1.method4403(arg0);
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
		this.aClass213_1.method4398(arg0);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class116 local16 = this.aClass213_1.method4395(131072, arg0, false, false, super.anInt5218, super.anInt5212);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class35 local28 = arg0.method5398();
			local28.j(super.anInt5212, super.anInt5213, super.anInt5218);
			return local16.method3107(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return this.aClass213_1.anInt5429;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return this.aClass213_1.anInt5427;
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
		@Pc(16) Class116 local16 = this.aClass213_1.method4395(262144, arg0, true, true, super.anInt5218, super.anInt5212);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt5212 >> 7;
			@Pc(28) int local28 = super.anInt5218 >> 7;
			this.aClass213_1.method4400(local28, local23, local16, local23, local28, false, arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return false;
	}
}
