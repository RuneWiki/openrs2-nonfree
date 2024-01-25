import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class11_Sub4_Sub1 extends Class11_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!fj", name = "L", descriptor = "Lclient!vr;")
	public final Class267 aClass267_2;

	@OriginalMember(owner = "client!fj", name = "D", descriptor = "Z")
	private final boolean aBoolean190;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!za;Lclient!fu;IIIIIZIIIIII)V")
	public Class11_Sub4_Sub1(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static188.method2697(arg12, arg11));
		this.aClass267_2 = new Class267(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean190 = arg1.anInt1928 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)I")
	@Override
	public int method4889() {
		return this.aClass267_2.method5505();
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)I")
	@Override
	public int method4899() {
		return this.aClass267_2.anInt6927;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!za;I)Z")
	@Override
	public boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class8 local21 = this.aClass267_2.method5511(super.anInt6086, false, false, super.anInt6083, arg1, 131072);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class34 local28 = arg1.method5685();
			local28.U(super.anInt6083 + super.anInt6090, super.anInt6089, super.anInt6085 + super.anInt6086);
			return local21.method5985(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)I")
	@Override
	public int method4895() {
		return this.aClass267_2.anInt6940;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)I")
	@Override
	public int method4897() {
		return this.aClass267_2.anInt6942;
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
	@Override
	public void method4900() {
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4898() {
		return this.aClass267_2.method5503();
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	@Override
	public Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0) {
		@Pc(16) Class8 local16 = this.aClass267_2.method5511(super.anInt6086, false, true, super.anInt6083, arg0, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(30) Class34 local30 = arg0.method5685();
		local30.U(super.anInt6083 + super.anInt6090, super.anInt6089, super.anInt6086 + super.anInt6085);
		@Pc(47) Class111_Sub3 local47 = null;
		if (this.aBoolean190) {
			local47 = Static238.method3398(1);
		}
		if (this.aClass267_2.aClass111_Sub4_7 == null) {
			local16.method5987(local30, local47 == null ? null : local47.aClass111_Sub8Array1[0], 0);
		} else {
			@Pc(63) Class232 local63 = this.aClass267_2.aClass111_Sub4_7.method3422();
			arg0.method5659(local16, local63, local30, local47 == null ? null : local47.aClass111_Sub8Array1[0]);
		}
		@Pc(96) int local96 = super.anInt6083 >> 7;
		@Pc(101) int local101 = super.anInt6086 >> 7;
		this.aClass267_2.method5513(local16, true, local96, arg0, local96, local101, local101);
		return local47;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class8 method4901(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1) {
		return this.aClass267_2.method5511(0, false, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method4902(@OriginalArg(0) Class117 arg0) {
		this.aClass267_2.method5502(arg0);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method4896(@OriginalArg(1) Class117 arg0) {
		this.aClass267_2.method5506(arg0);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5182(@OriginalArg(0) Class117 arg0) {
		@Pc(22) Class8 local22 = this.aClass267_2.method5511(super.anInt6086, false, true, super.anInt6083, arg0, 262144);
		if (local22 != null) {
			@Pc(29) int local29 = super.anInt6083 >> 7;
			@Pc(34) int local34 = super.anInt6086 >> 7;
			this.aClass267_2.method5513(local22, false, local29, arg0, local29, local34, local34);
		}
	}
}
