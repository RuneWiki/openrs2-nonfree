import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class30_Sub1_Sub6 extends Class30_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!ve", name = "S", descriptor = "Lclient!pe;")
	public final Class196 aClass196_4;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "Z")
	private final boolean aBoolean485;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!za;Lclient!p;IIIIIZIIIIIII)V")
	public Class30_Sub1_Sub6(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5634 == 1, Static276.method4082(arg13, arg12));
		this.aClass196_4 = new Class196(arg0, arg1, arg12, arg13, super.aByte102, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean485 = arg1.anInt5666 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)I")
	@Override
	public int method5724() {
		return this.aClass196_4.method4406();
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return this.aClass196_4.method4405();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class17 local16 = this.aClass196_4.method4400(super.anInt7490, arg0, 131072, false, super.anInt7488, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class40 local23 = arg0.method5918();
			local23.U(super.anInt7490, super.anInt7495, super.anInt7488);
			return local16.method6203(arg2, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		@Pc(16) Class17 local16 = this.aClass196_4.method4400(super.anInt7490, arg0, 2048, true, super.anInt7488, false);
		if (local16 == null) {
			return null;
		}
		@Pc(30) Class40 local30 = arg0.method5918();
		local30.U(super.anInt7490, super.anInt7495, super.anInt7488);
		@Pc(40) Class41_Sub7 local40 = null;
		if (this.aBoolean485) {
			local40 = Static306.method4409(1);
		}
		if (this.aClass196_4.aClass41_Sub1_7 == null) {
			local16.method6189(local30, local40 == null ? null : local40.aClass41_Sub8Array1[0], 0);
		} else {
			@Pc(56) Class51 local56 = this.aClass196_4.aClass41_Sub1_7.method875();
			arg0.method5952(local16, local56, local30, local40 == null ? null : local40.aClass41_Sub8Array1[0]);
		}
		this.aClass196_4.method4398(arg0, super.aShort102, super.aShort104, local16, super.aShort105, super.aShort103, true);
		return local40;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
		this.aClass196_4.method4404(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return this.aClass196_4.anInt5744;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
		@Pc(16) Class17 local16 = this.aClass196_4.method4400(super.anInt7490, arg0, 262144, true, super.anInt7488, true);
		if (local16 != null) {
			this.aClass196_4.method4398(arg0, super.aShort102, super.aShort104, local16, super.aShort105, super.aShort103, false);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return this.aClass196_4.method4400(0, arg1, arg0, false, 0, false);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aClass196_4.anInt5733;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
		this.aClass196_4.method4402(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return this.aClass196_4.anInt5734;
	}
}
