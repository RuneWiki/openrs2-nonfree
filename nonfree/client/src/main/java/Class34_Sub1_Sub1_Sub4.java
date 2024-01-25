import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class34_Sub1_Sub1_Sub4 extends Class34_Sub1_Sub1 implements Interface17 {

	@OriginalMember(owner = "client!hs", name = "Z", descriptor = "Lclient!ln;")
	private Class214 aClass214_5;

	@OriginalMember(owner = "client!hs", name = "lb", descriptor = "Z")
	private boolean lb = false;

	@OriginalMember(owner = "client!hs", name = "W", descriptor = "Lclient!jp;")
	public final Class187 aClass187_2;

	@OriginalMember(owner = "client!hs", name = "R", descriptor = "Z")
	private final boolean aBoolean284;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!ha;Lclient!lp;IIIIIZIIIIIII)V")
	public Class34_Sub1_Sub1_Sub4(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5951 == 1, Static626.method8456(arg13, arg12));
		this.aClass187_2 = new Class187(arg0, arg1, arg12, arg13, super.aByte132, arg3, this, arg7, arg14);
		this.aBoolean284 = arg1.anInt5978 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!jca;)V")
	public void method3559(@OriginalArg(1) Class173 arg0) {
		this.aClass187_2.method4167(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6657() {
		return this.aClass187_2.method4171();
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
	@Override
	public int method6661() {
		return this.aClass187_2.anInt4866;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
	@Override
	public void method6658() {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.lb;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		@Pc(16) Class149 local16 = this.aClass187_2.method4159(arg0, false, 2048, true);
		if (local16 == null) {
			return null;
		}
		@Pc(29) Class17 local29 = arg0.method8013();
		local29.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
		@Pc(43) Class34_Sub8 local43 = Static327.method4658(1, this.aBoolean284);
		this.aClass187_2.method4165(true, super.aShort98, super.aShort97, local29, arg0, super.aShort96, super.aShort99, local16);
		if (Static375.aBoolean532) {
			local16.method8869(local29, local43.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
		} else {
			local16.method8857(local29, local43.aClass34_Sub6Array1[0], 0);
		}
		if (this.aClass187_2.aClass34_Sub7_5 != null) {
			@Pc(89) Class347 local89 = this.aClass187_2.aClass34_Sub7_5.method5100();
			if (Static375.aBoolean532) {
				arg0.method8051(local89, Static501.anInt7929);
			} else {
				arg0.method8057(local89);
			}
		}
		this.lb = local16.F() || this.aClass187_2.aClass34_Sub7_5 != null;
		if (this.aClass214_5 == null) {
			this.aClass214_5 = Static523.method6802(local16, super.anInt9619, super.anInt9614, super.anInt9622);
		} else {
			Static571.method7503(super.anInt9614, local16, this.aClass214_5, super.anInt9619, super.anInt9622);
		}
		return local43;
	}

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "(I)V")
	@Override
	public void method7848() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)I")
	@Override
	public int method6659() {
		return this.aClass187_2.anInt4882;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6663(@OriginalArg(0) Class95 arg0) {
		this.aClass187_2.method4170(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7841() {
		return false;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)I")
	@Override
	public int method6662() {
		return this.aClass187_2.anInt4870;
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
		@Pc(19) Class149 local19 = this.aClass187_2.method4159(arg0, true, 262144, true);
		if (local19 != null) {
			@Pc(24) Class17 local24 = arg0.method8013();
			local24.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
			this.aClass187_2.method4165(false, super.aShort98, super.aShort97, local24, arg0, super.aShort96, super.aShort99, local19);
		}
	}

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		return false;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class149 local12 = this.aClass187_2.method4159(arg1, false, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class17 local19 = arg1.method8013();
			local19.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
			return Static375.aBoolean532 ? local12.method8862(arg0, arg2, local19, false, 0, Static501.anInt7929) : local12.method8866(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		return this.aClass214_5;
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return this.aClass187_2.method4169();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6660(@OriginalArg(0) Class95 arg0) {
		this.aClass187_2.method4161(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		return arg0 ? -20 : this.aClass187_2.method4160(true);
	}
}
