import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class30_Sub3_Sub3 extends Class30_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!pe;")
	public final Class196 aClass196_2;

	@OriginalMember(owner = "client!of", name = "t", descriptor = "Z")
	private final boolean aBoolean338;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!za;Lclient!p;IIIIIZIII)V")
	public Class30_Sub3_Sub3(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static360.method5078(arg9, arg8));
		this.aClass196_2 = new Class196(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt5437, super.anInt5438, arg7, arg10);
		this.aBoolean338 = arg1.anInt5666 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return this.aClass196_2.anInt5734;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
		this.aClass196_2.method4402(arg0);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		@Pc(16) Class17 local16 = this.aClass196_2.method4400(super.anInt5437, arg0, 2048, true, super.anInt5438, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class40 local23 = arg0.method5918();
		local23.U(super.anInt5437, super.anInt5439, super.anInt5438);
		@Pc(33) Class41_Sub7 local33 = null;
		if (this.aBoolean338) {
			local33 = Static306.method4409(1);
		}
		if (this.aClass196_2.aClass41_Sub1_7 == null) {
			local16.method6189(local23, local33 == null ? null : local33.aClass41_Sub8Array1[0], 0);
		} else {
			@Pc(57) Class51 local57 = this.aClass196_2.aClass41_Sub1_7.method875();
			arg0.method5952(local16, local57, local23, local33 == null ? null : local33.aClass41_Sub8Array1[0]);
		}
		@Pc(90) int local90 = super.anInt5437 >> 7;
		@Pc(95) int local95 = super.anInt5438 >> 7;
		this.aClass196_2.method4398(arg0, local95, local90, local16, local90, local95, true);
		return local33;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
		this.aClass196_2.method4404(arg0);
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class17 local16 = this.aClass196_2.method4400(super.anInt5437, arg0, 131072, false, super.anInt5438, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class40 local28 = arg0.method5918();
			local28.U(super.anInt5437, super.anInt5439, super.anInt5438);
			return local16.method6203(arg2, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return this.aClass196_2.method4405();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
		@Pc(16) Class17 local16 = this.aClass196_2.method4400(super.anInt5437, arg0, 262144, true, super.anInt5438, true);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt5437 >> 7;
			@Pc(28) int local28 = super.anInt5438 >> 7;
			this.aClass196_2.method4398(arg0, local28, local23, local16, local23, local28, false);
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aClass196_2.anInt5733;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return this.aClass196_2.method4400(0, arg1, arg0, false, 0, false);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return this.aClass196_2.anInt5744;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return false;
	}
}
