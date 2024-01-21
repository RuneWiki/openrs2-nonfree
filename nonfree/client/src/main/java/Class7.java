import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class7 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!ba;")
	private final Class3_Sub2 aClass3_Sub2_5 = new Class3_Sub2();

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class7() {
		this.aClass3_Sub2_5.aClass3_Sub2_69 = this.aClass3_Sub2_5;
		this.aClass3_Sub2_5.aClass3_Sub2_70 = this.aClass3_Sub2_5;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lclient!ba;")
	public Class3_Sub2 method297() {
		@Pc(7) Class3_Sub2 local7 = this.aClass3_Sub2_5.aClass3_Sub2_69;
		return local7 == this.aClass3_Sub2_5 ? null : local7;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ba;Z)V")
	public void method299(@OriginalArg(0) Class3_Sub2 arg0) {
		if (arg0.aClass3_Sub2_70 != null) {
			arg0.method2886();
		}
		arg0.aClass3_Sub2_70 = this.aClass3_Sub2_5;
		arg0.aClass3_Sub2_69 = this.aClass3_Sub2_5.aClass3_Sub2_69;
		arg0.aClass3_Sub2_70.aClass3_Sub2_69 = arg0;
		arg0.aClass3_Sub2_69.aClass3_Sub2_70 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!ba;)V")
	public void method300(@OriginalArg(1) Class3_Sub2 arg0) {
		if (arg0.aClass3_Sub2_70 != null) {
			arg0.method2886();
		}
		arg0.aClass3_Sub2_69 = this.aClass3_Sub2_5;
		arg0.aClass3_Sub2_70 = this.aClass3_Sub2_5.aClass3_Sub2_70;
		arg0.aClass3_Sub2_70.aClass3_Sub2_69 = arg0;
		arg0.aClass3_Sub2_69.aClass3_Sub2_70 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)Lclient!ba;")
	public Class3_Sub2 method301() {
		@Pc(7) Class3_Sub2 local7 = this.aClass3_Sub2_5.aClass3_Sub2_69;
		if (this.aClass3_Sub2_5 == local7) {
			return null;
		} else {
			local7.method2886();
			return local7;
		}
	}
}
