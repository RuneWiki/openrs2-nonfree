import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class44_Sub3_Sub2 extends Class44_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "Lclient!cp;")
	public final Class38 aClass38_3;

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "Z")
	private final boolean aBoolean320;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!ja;Lclient!fb;IIIIIIZI)V")
	public Class44_Sub3_Sub2(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean104, arg1.aBoolean111);
		this.aClass38_3 = new Class38(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean320 = arg1.anInt1476 != 0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!ja;I)V")
	@Override
	public void method5796(@OriginalArg(0) Class81 arg0) {
		this.aClass38_3.method777(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)I")
	@Override
	public int method5799() {
		return this.aClass38_3.anInt920;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLclient!ja;)V")
	@Override
	public void method5794(@OriginalArg(1) Class81 arg0) {
		this.aClass38_3.method781(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
	@Override
	public int method5793() {
		return this.aClass38_3.anInt915;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		@Pc(16) Class78 local16 = this.aClass38_3.method776(true, arg0, super.anInt4578, 1024, false, super.anInt4572);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class72 local23 = arg0.method2990();
		local23.method4067(super.anInt4578, super.anInt4570, super.anInt4572);
		@Pc(33) Class20_Sub6 local33 = null;
		if (this.aBoolean320) {
			local33 = Static208.method5776(1);
		}
		if (this.aClass38_3.aClass20_Sub2_1 == null) {
			local16.method4649(local23, local33 == null ? null : local33.aClass20_Sub8Array1[0], 0);
		} else {
			@Pc(63) Class90 local63 = this.aClass38_3.aClass20_Sub2_1.method449();
			arg0.method2979(local16, local63, local23, local33 == null ? null : local33.aClass20_Sub8Array1[0]);
		}
		this.aClass38_3.method779(super.anInt4578 >> 7, arg0, super.anInt4572 >> 7, local16, true, super.anInt4578 >> 7, super.anInt4572 >> 7);
		return local33;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class78 local16 = this.aClass38_3.method776(false, arg1, super.anInt4578, 65536, false, super.anInt4572);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class72 local23 = arg1.method2990();
			local23.method4067(super.anInt4578, super.anInt4570, super.anInt4572);
			return local16.method4644(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5798() {
		return this.aClass38_3.method790();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
		@Pc(24) Class78 local24 = this.aClass38_3.method776(true, arg0, super.anInt4578, 131072, true, super.anInt4572);
		if (local24 != null) {
			this.aClass38_3.method779(super.anInt4578 >> 7, arg0, super.anInt4572 >> 7, local24, false, super.anInt4578 >> 7, super.anInt4572 >> 7);
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
	@Override
	public int method5795() {
		return this.aClass38_3.anInt908;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILclient!ja;)Lclient!rc;")
	@Override
	public Class78 method5792(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		return this.aClass38_3.method776(false, arg1, 0, arg0, false, 0);
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V")
	@Override
	public void method5797() {
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return false;
	}
}
