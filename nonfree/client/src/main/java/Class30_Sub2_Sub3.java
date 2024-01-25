import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class30_Sub2_Sub3 extends Class30_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!up", name = "B", descriptor = "Lclient!pe;")
	public final Class196 aClass196_3;

	@OriginalMember(owner = "client!up", name = "C", descriptor = "Z")
	private final boolean aBoolean474;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!za;Lclient!p;IIIIIZIIIIII)V")
	public Class30_Sub2_Sub3(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static85.method1523(arg12, arg11));
		this.aClass196_3 = new Class196(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean474 = arg1.anInt5666 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class17 local21 = this.aClass196_3.method4400(super.anInt7376, arg0, 131072, false, super.anInt7385, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class40 local28 = arg0.method5918();
			local28.U(super.anInt7380 + super.anInt7376, super.anInt7379, super.anInt7381 + super.anInt7385);
			return local21.method6203(arg2, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return this.aClass196_3.anInt5734;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
		@Pc(16) Class17 local16 = this.aClass196_3.method4400(super.anInt7376, arg0, 262144, true, super.anInt7385, false);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt7376 >> 7;
			@Pc(28) int local28 = super.anInt7385 >> 7;
			this.aClass196_3.method4398(arg0, local28, local23, local16, local23, local28, false);
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return this.aClass196_3.method4405();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
		this.aClass196_3.method4404(arg0);
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		@Pc(16) Class17 local16 = this.aClass196_3.method4400(super.anInt7376, arg0, 2048, true, super.anInt7385, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class40 local23 = arg0.method5918();
		local23.U(super.anInt7376 + super.anInt7380, super.anInt7379, super.anInt7381 + super.anInt7385);
		@Pc(39) Class41_Sub7 local39 = null;
		if (this.aBoolean474) {
			local39 = Static306.method4409(1);
		}
		if (this.aClass196_3.aClass41_Sub1_7 == null) {
			local16.method6189(local23, local39 == null ? null : local39.aClass41_Sub8Array1[0], 0);
		} else {
			@Pc(69) Class51 local69 = this.aClass196_3.aClass41_Sub1_7.method875();
			arg0.method5952(local16, local69, local23, local39 == null ? null : local39.aClass41_Sub8Array1[0]);
		}
		@Pc(88) int local88 = super.anInt7376 >> 7;
		@Pc(93) int local93 = super.anInt7385 >> 7;
		this.aClass196_3.method4398(arg0, local93, local88, local16, local88, local93, true);
		return local39;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return this.aClass196_3.method4400(0, arg1, arg0, false, 0, false);
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(I)I")
	@Override
	public int method5620() {
		return this.aClass196_3.method4406();
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aClass196_3.anInt5733;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return this.aClass196_3.anInt5744;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
		this.aClass196_3.method4402(arg0);
	}
}
