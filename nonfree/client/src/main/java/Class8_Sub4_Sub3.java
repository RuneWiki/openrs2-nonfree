import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class8_Sub4_Sub3 extends Class8_Sub4 implements Interface4 {

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "Lclient!qp;")
	public final Class213 aClass213_3;

	@OriginalMember(owner = "client!uh", name = "D", descriptor = "Z")
	private final boolean aBoolean487;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!ya;Lclient!ho;IIIIIZII)V")
	public Class8_Sub4_Sub3(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean214, arg1.aBoolean215);
		this.aClass213_3 = new Class213(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean487 = arg1.anInt2871 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		@Pc(16) Class116 local16 = this.aClass213_3.method4395(2048, arg0, true, false, super.anInt6829, super.anInt6834);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class35 local23 = arg0.method5398();
		local23.j(super.anInt6834, super.anInt6831, super.anInt6829);
		@Pc(33) Class20_Sub5 local33 = null;
		if (this.aBoolean487) {
			local33 = Static371.method4760(1);
		}
		if (this.aClass213_3.aClass20_Sub3_4 == null) {
			local16.method3117(local23, local33 == null ? null : local33.aClass20_Sub8Array1[0], 0);
		} else {
			@Pc(49) Class83 local49 = this.aClass213_3.aClass20_Sub3_4.method2129();
			arg0.method5396(local16, local49, local23, local33 == null ? null : local33.aClass20_Sub8Array1[0]);
		}
		@Pc(82) int local82 = super.anInt6834 >> 7;
		@Pc(87) int local87 = super.anInt6829 >> 7;
		this.aClass213_3.method4400(local87, local82, local16, local82, local87, true, arg0);
		return local33;
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return this.aClass213_3.anInt5427;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return this.aClass213_3.method4397();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return this.aClass213_3.anInt5417;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return this.aClass213_3.anInt5429;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
		@Pc(23) Class116 local23 = this.aClass213_3.method4395(262144, arg0, true, true, super.anInt6829, super.anInt6834);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt6834 >> 7;
			@Pc(35) int local35 = super.anInt6829 >> 7;
			this.aClass213_3.method4400(local35, local30, local23, local30, local35, false, arg0);
		}
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
		this.aClass213_3.method4398(arg0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return this.aClass213_3.method4395(arg0, arg1, false, false, 0, 0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class116 local21 = this.aClass213_3.method4395(131072, arg0, false, false, super.anInt6829, super.anInt6834);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class35 local28 = arg0.method5398();
			local28.j(super.anInt6834, super.anInt6831, super.anInt6829);
			return local21.method3107(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
		this.aClass213_3.method4403(arg0);
	}
}
