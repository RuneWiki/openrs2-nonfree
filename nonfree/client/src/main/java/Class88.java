import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class88 {

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "Lclient!lg;")
	private final Class3_Sub2 aClass3_Sub2_70 = new Class3_Sub2();

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class88() {
		this.aClass3_Sub2_70.aClass3_Sub2_69 = this.aClass3_Sub2_70;
		this.aClass3_Sub2_70.aClass3_Sub2_68 = this.aClass3_Sub2_70;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!lg;)V")
	public void method3204(@OriginalArg(1) Class3_Sub2 arg0) {
		if (arg0.aClass3_Sub2_68 != null) {
			arg0.method3174();
		}
		arg0.aClass3_Sub2_69 = this.aClass3_Sub2_70.aClass3_Sub2_69;
		arg0.aClass3_Sub2_68 = this.aClass3_Sub2_70;
		arg0.aClass3_Sub2_68.aClass3_Sub2_69 = arg0;
		arg0.aClass3_Sub2_69.aClass3_Sub2_68 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Lclient!lg;")
	public Class3_Sub2 method3205() {
		@Pc(7) Class3_Sub2 local7 = this.aClass3_Sub2_70.aClass3_Sub2_69;
		if (local7 == this.aClass3_Sub2_70) {
			return null;
		} else {
			local7.method3174();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!lg;I)V")
	public void method3207(@OriginalArg(0) Class3_Sub2 arg0) {
		if (arg0.aClass3_Sub2_68 != null) {
			arg0.method3174();
		}
		arg0.aClass3_Sub2_69 = this.aClass3_Sub2_70;
		arg0.aClass3_Sub2_68 = this.aClass3_Sub2_70.aClass3_Sub2_68;
		arg0.aClass3_Sub2_68.aClass3_Sub2_69 = arg0;
		arg0.aClass3_Sub2_69.aClass3_Sub2_68 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)Lclient!lg;")
	public Class3_Sub2 method3211() {
		@Pc(3) Class3_Sub2 local3 = this.aClass3_Sub2_70.aClass3_Sub2_69;
		return this.aClass3_Sub2_70 == local3 ? null : local3;
	}
}
