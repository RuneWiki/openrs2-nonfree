import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class11_Sub1_Sub4 extends Class11_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "Lclient!vr;")
	public final Class267 aClass267_3;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "Z")
	private final boolean aBoolean316;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!za;Lclient!fu;IIIIIZIIIIIII)V")
	public Class11_Sub1_Sub4(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1926 == 1, Static326.method4283(arg13, arg12));
		this.aClass267_3 = new Class267(arg0, arg1, arg12, arg13, super.aByte90, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean316 = arg1.anInt1928 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
		this.aClass267_3.method5506(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return this.aClass267_3.method5503();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return this.aClass267_3.anInt6940;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return this.aClass267_3.anInt6927;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return false;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		@Pc(16) Class8 local16 = this.aClass267_3.method5511(super.anInt6430, false, true, super.anInt6428, arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class34 local23 = arg0.method5685();
		local23.U(super.anInt6428, super.anInt6437, super.anInt6430);
		@Pc(38) Class111_Sub3 local38 = null;
		if (this.aBoolean316) {
			local38 = Static238.method3398(1);
		}
		if (this.aClass267_3.aClass111_Sub4_7 == null) {
			local16.method5987(local23, local38 == null ? null : local38.aClass111_Sub8Array1[0], 0);
		} else {
			@Pc(54) Class232 local54 = this.aClass267_3.aClass111_Sub4_7.method3422();
			arg0.method5659(local16, local54, local23, local38 == null ? null : local38.aClass111_Sub8Array1[0]);
		}
		this.aClass267_3.method5513(local16, true, super.aShort100, arg0, super.aShort103, super.aShort102, super.aShort101);
		return local38;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class8 local16 = this.aClass267_3.method5511(super.anInt6430, false, false, super.anInt6428, arg1, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class34 local28 = arg1.method5685();
			local28.U(super.anInt6428, super.anInt6437, super.anInt6430);
			return local16.method5985(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
		@Pc(16) Class8 local16 = this.aClass267_3.method5511(super.anInt6430, true, true, super.anInt6428, arg0, 262144);
		if (local16 != null) {
			this.aClass267_3.method5513(local16, false, super.aShort100, arg0, super.aShort103, super.aShort102, super.aShort101);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
		this.aClass267_3.method5502(arg0);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return this.aClass267_3.anInt6942;
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)I")
	@Override
	public int method5184() {
		return this.aClass267_3.method5505();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return this.aClass267_3.method5511(0, false, false, 0, arg0, arg1);
	}
}
