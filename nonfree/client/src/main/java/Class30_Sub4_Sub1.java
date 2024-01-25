import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class30_Sub4_Sub1 extends Class30_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "Lclient!pe;")
	public final Class196 aClass196_1;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "Z")
	private final boolean aBoolean298;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!za;Lclient!p;IIIIIZII)V")
	public Class30_Sub4_Sub1(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt5681, arg1.aBoolean362, arg1.aBoolean351);
		this.aClass196_1 = new Class196(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean298 = arg1.anInt5666 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
		this.aClass196_1.method4402(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class17 local16 = this.aClass196_1.method4400(super.anInt5194, arg0, 131072, false, super.anInt5193, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class40 local23 = arg0.method5918();
			local23.U(super.anInt5194, super.anInt5199, super.anInt5193);
			return local16.method6203(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return this.aClass196_1.anInt5734;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return this.aClass196_1.anInt5744;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return this.aClass196_1.method4400(0, arg1, arg0, false, 0, false);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return this.aClass196_1.method4405();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
		this.aClass196_1.method4404(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aClass196_1.anInt5733;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		@Pc(16) Class17 local16 = this.aClass196_1.method4400(super.anInt5194, arg0, 2048, true, super.anInt5193, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class40 local23 = arg0.method5918();
		local23.U(super.anInt5194, super.anInt5199, super.anInt5193);
		@Pc(33) Class41_Sub7 local33 = null;
		if (this.aBoolean298) {
			local33 = Static306.method4409(1);
		}
		if (this.aClass196_1.aClass41_Sub1_7 == null) {
			local16.method6189(local23, local33 == null ? null : local33.aClass41_Sub8Array1[0], 0);
		} else {
			@Pc(63) Class51 local63 = this.aClass196_1.aClass41_Sub1_7.method875();
			arg0.method5952(local16, local63, local23, local33 == null ? null : local33.aClass41_Sub8Array1[0]);
		}
		@Pc(88) int local88 = super.anInt5194 >> 7;
		@Pc(93) int local93 = super.anInt5193 >> 7;
		this.aClass196_1.method4398(arg0, local93, local88, local16, local88, local93, true);
		return local33;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
		@Pc(16) Class17 local16 = this.aClass196_1.method4400(super.anInt5194, arg0, 262144, true, super.anInt5193, true);
		if (local16 != null) {
			@Pc(28) int local28 = super.anInt5194 >> 7;
			@Pc(33) int local33 = super.anInt5193 >> 7;
			this.aClass196_1.method4398(arg0, local33, local28, local16, local28, local33, false);
		}
	}
}
