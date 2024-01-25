import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class11_Sub2_Sub2 extends Class11_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!bw", name = "K", descriptor = "Lclient!vr;")
	public final Class267 aClass267_1;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "Z")
	private final boolean aBoolean97;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!za;Lclient!fu;IIIIIZII)V")
	public Class11_Sub2_Sub2(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt1930, arg1.aBoolean214, arg1.aBoolean202);
		this.aClass267_1 = new Class267(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean97 = arg1.anInt1928 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		@Pc(16) Class8 local16 = this.aClass267_1.method5511(super.anInt4843, false, true, super.anInt4842, arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class34 local28 = arg0.method5685();
		local28.U(super.anInt4842, super.anInt4844, super.anInt4843);
		@Pc(38) Class111_Sub3 local38 = null;
		if (this.aBoolean97) {
			local38 = Static238.method3398(1);
		}
		if (this.aClass267_1.aClass111_Sub4_7 == null) {
			local16.method5987(local28, local38 == null ? null : local38.aClass111_Sub8Array1[0], 0);
		} else {
			@Pc(68) Class232 local68 = this.aClass267_1.aClass111_Sub4_7.method3422();
			arg0.method5659(local16, local68, local28, local38 == null ? null : local38.aClass111_Sub8Array1[0]);
		}
		@Pc(87) int local87 = super.anInt4842 >> 7;
		@Pc(92) int local92 = super.anInt4843 >> 7;
		this.aClass267_1.method5513(local16, true, local87, arg0, local87, local92, local92);
		return local38;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return this.aClass267_1.method5503();
	}

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return this.aClass267_1.anInt6927;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
		this.aClass267_1.method5506(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return this.aClass267_1.method5511(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return this.aClass267_1.anInt6940;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
		this.aClass267_1.method5502(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
		@Pc(20) Class8 local20 = this.aClass267_1.method5511(super.anInt4843, true, true, super.anInt4842, arg0, 262144);
		if (local20 != null) {
			@Pc(27) int local27 = super.anInt4842 >> 7;
			@Pc(32) int local32 = super.anInt4843 >> 7;
			this.aClass267_1.method5513(local20, false, local27, arg0, local27, local32, local32);
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class8 local21 = this.aClass267_1.method5511(super.anInt4843, false, false, super.anInt4842, arg1, 131072);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class34 local28 = arg1.method5685();
			local28.U(super.anInt4842, super.anInt4844, super.anInt4843);
			return local21.method5985(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return false;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return this.aClass267_1.anInt6942;
	}
}
