import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class44_Sub5_Sub2 extends Class44_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!si", name = "s", descriptor = "[I")
	public static final int[] anIntArray583 = new int[99];

	@OriginalMember(owner = "client!si", name = "t", descriptor = "Lclient!cp;")
	public final Class38 aClass38_4;

	@OriginalMember(owner = "client!si", name = "G", descriptor = "Z")
	private final boolean aBoolean373;

	static {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 99; local13++) {
			@Pc(18) int local18 = local13 + 1;
			@Pc(31) int local31 = (int) (Math.pow(2.0D, (double) local18 / 7.0D) * 300.0D + (double) local18);
			local11 += local31;
			anIntArray583[local13] = local11 / 4;
		}
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!ja;Lclient!fb;IIIIIIIZI)V")
	public Class44_Sub5_Sub2(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static267.method4534(arg2, arg3));
		this.aClass38_4 = new Class38(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt5417, super.anInt5412, arg9, arg10);
		this.aBoolean373 = arg1.anInt1476 != 0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLclient!ja;)V")
	@Override
	public void method5794(@OriginalArg(1) Class81 arg0) {
		this.aClass38_4.method781(arg0);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I")
	@Override
	public int method5799() {
		return this.aClass38_4.anInt920;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return false;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
	@Override
	public int method5795() {
		return this.aClass38_4.anInt908;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class78 local21 = this.aClass38_4.method776(false, arg1, super.anInt5417, 65536, false, super.anInt5412);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class72 local28 = arg1.method2990();
			local28.method4067(super.anInt5417, super.anInt5414, super.anInt5412);
			return local21.method4644(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5798() {
		return this.aClass38_4.method790();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ja;I)V")
	@Override
	public void method5796(@OriginalArg(0) Class81 arg0) {
		this.aClass38_4.method777(arg0);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		@Pc(21) Class78 local21 = this.aClass38_4.method776(true, arg0, super.anInt5417, 1024, false, super.anInt5412);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class72 local28 = arg0.method2990();
		local28.method4067(super.anInt5417, super.anInt5414, super.anInt5412);
		@Pc(38) Class20_Sub6 local38 = null;
		if (this.aBoolean373) {
			local38 = Static208.method5776(1);
		}
		if (this.aClass38_4.aClass20_Sub2_1 == null) {
			local21.method4649(local28, local38 == null ? null : local38.aClass20_Sub8Array1[0], 0);
		} else {
			@Pc(54) Class90 local54 = this.aClass38_4.aClass20_Sub2_1.method449();
			arg0.method2979(local21, local54, local28, local38 == null ? null : local38.aClass20_Sub8Array1[0]);
		}
		this.aClass38_4.method779(super.anInt5417 >> 7, arg0, super.anInt5412 >> 7, local21, true, super.anInt5417 >> 7, super.anInt5412 >> 7);
		return local38;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)I")
	@Override
	public int method5793() {
		return this.aClass38_4.anInt915;
	}

	@OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
	@Override
	public void method5797() {
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BILclient!ja;)Lclient!rc;")
	@Override
	public Class78 method5792(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		return this.aClass38_4.method776(false, arg1, 0, arg0, false, 0);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
		@Pc(16) Class78 local16 = this.aClass38_4.method776(true, arg0, super.anInt5417, 131072, true, super.anInt5412);
		if (local16 != null) {
			this.aClass38_4.method779(super.anInt5417 >> 7, arg0, super.anInt5412 >> 7, local16, false, super.anInt5417 >> 7, super.anInt5412 >> 7);
		}
	}
}
