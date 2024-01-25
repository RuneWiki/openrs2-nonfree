import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class44_Sub4_Sub1 extends Class44_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "Lclient!cp;")
	public final Class38 aClass38_2;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "Z")
	private final boolean aBoolean211;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!ja;Lclient!fb;IIIIIIIZIIIII)V")
	public Class44_Sub4_Sub1(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt1461 == 1, Static278.method5286(arg3, arg2));
		this.aClass38_2 = new Class38(arg0, arg1, arg2, arg3, super.aByte90, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean211 = arg1.anInt1476 != 0;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class78 local16 = this.aClass38_2.method776(false, arg1, super.anInt6340, 65536, false, super.anInt6339);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class72 local23 = arg1.method2990();
			local23.method4067(super.anInt6340, super.anInt6335, super.anInt6339);
			return local16.method4644(arg2, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)I")
	@Override
	public int method5795() {
		return this.aClass38_2.anInt908;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ja;I)V")
	@Override
	public void method5796(@OriginalArg(0) Class81 arg0) {
		this.aClass38_2.method777(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5798() {
		return this.aClass38_2.method790();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
		@Pc(16) Class78 local16 = this.aClass38_2.method776(true, arg0, super.anInt6340, 131072, true, super.anInt6339);
		if (local16 != null) {
			this.aClass38_2.method779(super.aShort87, arg0, super.aShort89, local16, false, super.aShort90, super.aShort88);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		@Pc(16) Class78 local16 = this.aClass38_2.method776(true, arg0, super.anInt6340, 1024, false, super.anInt6339);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class72 local28 = arg0.method2990();
		local28.method4067(super.anInt6340, super.anInt6335, super.anInt6339);
		@Pc(38) Class20_Sub6 local38 = null;
		if (this.aBoolean211) {
			local38 = Static208.method5776(1);
		}
		if (this.aClass38_2.aClass20_Sub2_1 == null) {
			local16.method4649(local28, local38 == null ? null : local38.aClass20_Sub8Array1[0], 0);
		} else {
			@Pc(68) Class90 local68 = this.aClass38_2.aClass20_Sub2_1.method449();
			arg0.method2979(local16, local68, local28, local38 == null ? null : local38.aClass20_Sub8Array1[0]);
		}
		this.aClass38_2.method779(super.aShort87, arg0, super.aShort89, local16, true, super.aShort90, super.aShort88);
		return local38;
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)I")
	@Override
	public int method5784() {
		return this.aClass38_2.method789();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BILclient!ja;)Lclient!rc;")
	@Override
	public Class78 method5792(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		return this.aClass38_2.method776(false, arg1, 0, arg0, false, 0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)I")
	@Override
	public int method5799() {
		return this.aClass38_2.anInt920;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V")
	@Override
	public void method5797() {
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	@Override
	public int method5793() {
		return this.aClass38_2.anInt915;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLclient!ja;)V")
	@Override
	public void method5794(@OriginalArg(1) Class81 arg0) {
		this.aClass38_2.method781(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		throw new IllegalStateException();
	}
}
