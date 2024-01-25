import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class44_Sub1_Sub1 extends Class44_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Lclient!cp;")
	public final Class38 aClass38_1;

	@OriginalMember(owner = "client!dd", name = "D", descriptor = "Z")
	private final boolean aBoolean78;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!ja;Lclient!fb;IIIIIIIZIIII)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static9.method170(arg2, arg3));
		this.aClass38_1 = new Class38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean78 = arg1.anInt1476 != 0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class78 local16 = this.aClass38_1.method776(false, arg1, super.anInt5763, 65536, false, super.anInt5759);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class72 local23 = arg1.method2990();
			local23.method4067(super.anInt5763 + super.anInt5762, super.anInt5756, super.anInt5761 + super.anInt5759);
			return local16.method4644(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5798() {
		return this.aClass38_1.method790();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
		@Pc(24) Class78 local24 = this.aClass38_1.method776(true, arg0, super.anInt5763, 131072, false, super.anInt5759);
		if (local24 != null) {
			this.aClass38_1.method779(super.anInt5763 >> 7, arg0, super.anInt5759 >> 7, local24, false, super.anInt5763 >> 7, super.anInt5759 >> 7);
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)I")
	@Override
	public int method5795() {
		return this.aClass38_1.anInt908;
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)I")
	@Override
	public int method5230() {
		return this.aClass38_1.method789();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BILclient!ja;)Lclient!rc;")
	@Override
	public Class78 method5792(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		return this.aClass38_1.method776(false, arg1, 0, arg0, false, 0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
	@Override
	public int method5793() {
		return this.aClass38_1.anInt915;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		@Pc(16) Class78 local16 = this.aClass38_1.method776(true, arg0, super.anInt5763, 1024, false, super.anInt5759);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class72 local28 = arg0.method2990();
		local28.method4067(super.anInt5762 + super.anInt5763, super.anInt5756, super.anInt5761 + super.anInt5759);
		@Pc(44) Class20_Sub6 local44 = null;
		if (this.aBoolean78) {
			local44 = Static208.method5776(1);
		}
		if (this.aClass38_1.aClass20_Sub2_1 == null) {
			local16.method4649(local28, local44 == null ? null : local44.aClass20_Sub8Array1[0], 0);
		} else {
			@Pc(60) Class90 local60 = this.aClass38_1.aClass20_Sub2_1.method449();
			arg0.method2979(local16, local60, local28, local44 == null ? null : local44.aClass20_Sub8Array1[0]);
		}
		this.aClass38_1.method779(super.anInt5763 >> 7, arg0, super.anInt5759 >> 7, local16, true, super.anInt5763 >> 7, super.anInt5759 >> 7);
		return local44;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)I")
	@Override
	public int method5799() {
		return this.aClass38_1.anInt920;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!ja;)V")
	@Override
	public void method5794(@OriginalArg(1) Class81 arg0) {
		this.aClass38_1.method781(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!ja;I)V")
	@Override
	public void method5796(@OriginalArg(0) Class81 arg0) {
		this.aClass38_1.method777(arg0);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	@Override
	public void method5797() {
	}
}
