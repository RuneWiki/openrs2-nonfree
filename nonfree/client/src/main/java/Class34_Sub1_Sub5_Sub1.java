import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class34_Sub1_Sub5_Sub1 extends Class34_Sub1_Sub5 implements Interface17 {

	@OriginalMember(owner = "client!hca", name = "J", descriptor = "Lclient!ln;")
	private Class214 aClass214_4;

	@OriginalMember(owner = "client!hca", name = "cb", descriptor = "Z")
	private boolean aBoolean265 = false;

	@OriginalMember(owner = "client!hca", name = "Y", descriptor = "Lclient!jp;")
	public final Class187 aClass187_1;

	@OriginalMember(owner = "client!hca", name = "R", descriptor = "Z")
	private final boolean aBoolean264;

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lclient!ha;Lclient!lp;IIIIIZIII)V")
	public Class34_Sub1_Sub5_Sub1(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static150.method2437(arg9, arg8));
		this.aClass187_1 = new Class187(arg0, arg1, arg8, arg9, super.aByte132, arg3, this, arg7, arg10);
		this.aBoolean264 = arg1.anInt5978 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hca", name = "h", descriptor = "(I)V")
	@Override
	public void method7848() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7841() {
		return false;
	}

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
		@Pc(16) Class149 local16 = this.aClass187_1.method4159(arg0, true, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt9614 >> 9;
		@Pc(28) int local28 = super.anInt9619 >> 9;
		@Pc(31) Class17 local31 = arg0.method8013();
		local31.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
		this.aClass187_1.method4165(false, local23, local23, local31, arg0, local28, local28, local16);
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		@Pc(14) Class149 local14 = this.aClass187_1.method4159(arg0, false, 2048, true);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class17 local21 = arg0.method8013();
		local21.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
		@Pc(40) Class34_Sub8 local40 = Static327.method4658(1, this.aBoolean264);
		@Pc(45) int local45 = super.anInt9614 >> 9;
		@Pc(50) int local50 = super.anInt9619 >> 9;
		this.aClass187_1.method4165(true, local45, local45, local21, arg0, local50, local50, local14);
		if (Static375.aBoolean532) {
			local14.method8869(local21, local40.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
		} else {
			local14.method8857(local21, local40.aClass34_Sub6Array1[0], 0);
		}
		if (this.aClass187_1.aClass34_Sub7_5 != null) {
			@Pc(92) Class347 local92 = this.aClass187_1.aClass34_Sub7_5.method5100();
			if (Static375.aBoolean532) {
				arg0.method8051(local92, Static501.anInt7929);
			} else {
				arg0.method8057(local92);
			}
		}
		this.aBoolean265 = local14.F() || this.aClass187_1.aClass34_Sub7_5 != null;
		if (this.aClass214_4 == null) {
			this.aClass214_4 = Static523.method6802(local14, super.anInt9619, super.anInt9614, super.anInt9622);
		} else {
			Static571.method7503(super.anInt9614, local14, this.aClass214_4, super.anInt9619, super.anInt9622);
		}
		return local40;
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		return this.aClass214_4;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)I")
	@Override
	public int method6662() {
		return this.aClass187_1.anInt4870;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hca", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.aBoolean265;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)I")
	@Override
	public int method6659() {
		return this.aClass187_1.anInt4882;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.aBoolean265 = false;
		}
		return this.aClass187_1.method4160(true);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)V")
	@Override
	public void method6658() {
	}

	@OriginalMember(owner = "client!hca", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		return false;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6657() {
		return this.aClass187_1.method4171();
	}

	@OriginalMember(owner = "client!hca", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return this.aClass187_1.method4169();
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6660(@OriginalArg(0) Class95 arg0) {
		this.aClass187_1.method4161(arg0);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!jca;Z)V")
	public void method3250(@OriginalArg(0) Class173 arg0) {
		this.aClass187_1.method4167(arg0);
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)I")
	@Override
	public int method6661() {
		return this.aClass187_1.anInt4866;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class149 local21 = this.aClass187_1.method4159(arg1, false, 131072, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class17 local28 = arg1.method8013();
			local28.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
			return Static375.aBoolean532 ? local21.method8862(arg0, arg2, local28, false, 0, Static501.anInt7929) : local21.method8866(arg0, arg2, local28, false, 0);
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6663(@OriginalArg(0) Class95 arg0) {
		this.aClass187_1.method4170(arg0);
	}
}
