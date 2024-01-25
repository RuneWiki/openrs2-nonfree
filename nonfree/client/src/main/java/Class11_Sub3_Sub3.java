import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class11_Sub3_Sub3 extends Class11_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "Lclient!vr;")
	public final Class267 aClass267_4;

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "Z")
	private final boolean aBoolean363;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!za;Lclient!fu;IIIIIZIII)V")
	public Class11_Sub3_Sub3(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static18.method3406(arg8, arg9));
		this.aClass267_4 = new Class267(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt3997, super.anInt3996, arg7, arg10);
		this.aBoolean363 = arg1.anInt1928 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return this.aClass267_4.anInt6940;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return this.aClass267_4.anInt6942;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
		this.aClass267_4.method5502(arg0);
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		@Pc(16) Class8 local16 = this.aClass267_4.method5511(super.anInt3996, false, true, super.anInt3997, arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class34 local23 = arg0.method5685();
		local23.U(super.anInt3997, super.anInt4001, super.anInt3996);
		@Pc(33) Class111_Sub3 local33 = null;
		if (this.aBoolean363) {
			local33 = Static238.method3398(1);
		}
		if (this.aClass267_4.aClass111_Sub4_7 == null) {
			local16.method5987(local23, local33 == null ? null : local33.aClass111_Sub8Array1[0], 0);
		} else {
			@Pc(68) Class232 local68 = this.aClass267_4.aClass111_Sub4_7.method3422();
			arg0.method5659(local16, local68, local23, local33 == null ? null : local33.aClass111_Sub8Array1[0]);
		}
		@Pc(87) int local87 = super.anInt3997 >> 7;
		@Pc(92) int local92 = super.anInt3996 >> 7;
		this.aClass267_4.method5513(local16, true, local87, arg0, local87, local92, local92);
		return local33;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class8 local16 = this.aClass267_4.method5511(super.anInt3996, false, false, super.anInt3997, arg1, 131072);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class34 local23 = arg1.method5685();
			local23.U(super.anInt3997, super.anInt4001, super.anInt3996);
			return local16.method5985(arg0, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return this.aClass267_4.anInt6927;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
		@Pc(16) Class8 local16 = this.aClass267_4.method5511(super.anInt3996, true, true, super.anInt3997, arg0, 262144);
		if (local16 != null) {
			@Pc(27) int local27 = super.anInt3997 >> 7;
			@Pc(32) int local32 = super.anInt3996 >> 7;
			this.aClass267_4.method5513(local16, false, local27, arg0, local27, local32, local32);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	@Override
	public void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return this.aClass267_4.method5503();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5183() {
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
		this.aClass267_4.method5506(arg0);
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V")
	@Override
	public void method5177() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return this.aClass267_4.method5511(0, false, false, 0, arg0, arg1);
	}
}
