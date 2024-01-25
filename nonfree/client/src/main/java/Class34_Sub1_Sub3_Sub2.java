import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class34_Sub1_Sub3_Sub2 extends Class34_Sub1_Sub3 implements Interface17 {

	@OriginalMember(owner = "client!rb", name = "M", descriptor = "Lclient!ln;")
	private Class214 aClass214_8;

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "Z")
	private boolean aBoolean561 = false;

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "Lclient!jp;")
	public final Class187 aClass187_4;

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "Z")
	private final boolean aBoolean562;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!ha;Lclient!lp;IIIIIZIIIII)V")
	public Class34_Sub1_Sub3_Sub2(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass187_4 = new Class187(arg0, arg1, arg10, arg11, super.aByte132, arg3, this, arg7, arg12);
		this.aBoolean562 = arg1.anInt5978 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6663(@OriginalArg(0) Class95 arg0) {
		this.aClass187_4.method4170(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		return this.aClass214_8;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6660(@OriginalArg(0) Class95 arg0) {
		this.aClass187_4.method4161(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method7840(false);
		}
		return this.aClass187_4.method4160(true);
	}

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.aBoolean561;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return this.aClass187_4.method4169();
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
		@Pc(16) Class149 local16 = this.aClass187_4.method4159(arg0, false, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt9614 >> 9;
		@Pc(28) int local28 = super.anInt9619 >> 9;
		@Pc(31) Class17 local31 = arg0.method8013();
		local31.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
		this.aClass187_4.method4165(false, local23, local23, local31, arg0, local28, local28, local16);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class149 local12 = this.aClass187_4.method4159(arg1, false, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(26) Class17 local26 = arg1.method8013();
			local26.method6231(super.anInt9614 + super.aShort72, super.anInt9622, super.aShort73 + super.anInt9619);
			return Static375.aBoolean532 ? local12.method8862(arg0, arg2, local26, false, 0, Static501.anInt7929) : local12.method8866(arg0, arg2, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)I")
	@Override
	public int method6661() {
		return this.aClass187_4.anInt4866;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	@Override
	public void method6658() {
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)I")
	@Override
	public int method6662() {
		return this.aClass187_4.anInt4870;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		@Pc(19) Class149 local19 = this.aClass187_4.method4159(arg0, false, 2048, true);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class17 local26 = arg0.method8013();
		local26.method6231(super.anInt9614 + super.aShort72, super.anInt9622, super.anInt9619 + super.aShort73);
		@Pc(46) Class34_Sub8 local46 = Static327.method4658(1, this.aBoolean562);
		@Pc(51) int local51 = super.anInt9614 >> 9;
		@Pc(56) int local56 = super.anInt9619 >> 9;
		this.aClass187_4.method4165(true, local51, local51, local26, arg0, local56, local56, local19);
		if (Static375.aBoolean532) {
			local19.method8869(local26, local46.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
		} else {
			local19.method8857(local26, local46.aClass34_Sub6Array1[0], 0);
		}
		if (this.aClass187_4.aClass34_Sub7_5 != null) {
			@Pc(98) Class347 local98 = this.aClass187_4.aClass34_Sub7_5.method5100();
			if (Static375.aBoolean532) {
				arg0.method8051(local98, Static501.anInt7929);
			} else {
				arg0.method8057(local98);
			}
		}
		this.aBoolean561 = local19.F() || this.aClass187_4.aClass34_Sub7_5 != null;
		if (this.aClass214_8 == null) {
			this.aClass214_8 = Static523.method6802(local19, super.anInt9619, super.anInt9614, super.anInt9622);
		} else {
			Static571.method7503(super.anInt9614, local19, this.aClass214_8, super.anInt9619, super.anInt9622);
		}
		return local46;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6657() {
		return this.aClass187_4.method4171();
	}

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		return false;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)I")
	@Override
	public int method6659() {
		return this.aClass187_4.anInt4882;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZLclient!jca;)V")
	public void method6665(@OriginalArg(1) Class173 arg0) {
		this.aClass187_4.method4167(arg0);
	}
}
