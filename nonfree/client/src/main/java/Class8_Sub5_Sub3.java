import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class8_Sub5_Sub3 extends Class8_Sub5 implements Interface4 {

	@OriginalMember(owner = "client!pv", name = "G", descriptor = "Lclient!qp;")
	public final Class213 aClass213_2;

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "Z")
	private final boolean aBoolean369;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!ya;Lclient!ho;IIIIIZIIIIII)V")
	public Class8_Sub5_Sub3(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static84.method4131(arg12, arg11));
		this.aClass213_2 = new Class213(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean369 = arg1.anInt2871 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
		this.aClass213_2.method4403(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
		this.aClass213_2.method4398(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class116 local16 = this.aClass213_2.method4395(131072, arg0, false, false, super.anInt5133, super.anInt5128);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class35 local28 = arg0.method5398();
			local28.j(super.anInt5129 + super.anInt5128, super.anInt5123, super.anInt5130 + super.anInt5133);
			return local16.method3107(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return this.aClass213_2.method4397();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
		@Pc(16) Class116 local16 = this.aClass213_2.method4395(262144, arg0, true, false, super.anInt5133, super.anInt5128);
		if (local16 != null) {
			@Pc(27) int local27 = super.anInt5128 >> 7;
			@Pc(32) int local32 = super.anInt5133 >> 7;
			this.aClass213_2.method4400(local32, local27, local16, local27, local32, false, arg0);
		}
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return this.aClass213_2.anInt5429;
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(Z)I")
	@Override
	public int method4114() {
		return this.aClass213_2.method4392();
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return this.aClass213_2.anInt5427;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return this.aClass213_2.method4395(arg0, arg1, false, false, 0, 0);
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		@Pc(16) Class116 local16 = this.aClass213_2.method4395(2048, arg0, true, false, super.anInt5133, super.anInt5128);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class35 local23 = arg0.method5398();
		local23.j(super.anInt5128 + super.anInt5129, super.anInt5123, super.anInt5130 + super.anInt5133);
		@Pc(40) Class20_Sub5 local40 = null;
		if (this.aBoolean369) {
			local40 = Static371.method4760(1);
		}
		if (this.aClass213_2.aClass20_Sub3_4 == null) {
			local16.method3117(local23, local40 == null ? null : local40.aClass20_Sub8Array1[0], 0);
		} else {
			@Pc(56) Class83 local56 = this.aClass213_2.aClass20_Sub3_4.method2129();
			arg0.method5396(local16, local56, local23, local40 == null ? null : local40.aClass20_Sub8Array1[0]);
		}
		@Pc(89) int local89 = super.anInt5128 >> 7;
		@Pc(94) int local94 = super.anInt5133 >> 7;
		this.aClass213_2.method4400(local94, local89, local16, local89, local94, true, arg0);
		return local40;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return this.aClass213_2.anInt5417;
	}
}
