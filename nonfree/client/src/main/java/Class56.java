import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class56 {

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "Lclient!h;")
	private final Class3_Sub1 aClass3_Sub1_30 = new Class3_Sub1();

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class56() {
		this.aClass3_Sub1_30.aClass3_Sub1_62 = this.aClass3_Sub1_30;
		this.aClass3_Sub1_30.aClass3_Sub1_61 = this.aClass3_Sub1_30;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Lclient!h;")
	public Class3_Sub1 method1190() {
		@Pc(12) Class3_Sub1 local12 = this.aClass3_Sub1_30.aClass3_Sub1_61;
		return this.aClass3_Sub1_30 == local12 ? null : local12;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)Lclient!h;")
	public Class3_Sub1 method1191() {
		@Pc(7) Class3_Sub1 local7 = this.aClass3_Sub1_30.aClass3_Sub1_61;
		if (local7 == this.aClass3_Sub1_30) {
			return null;
		} else {
			local7.method1909();
			return local7;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLclient!h;)V")
	public void method1192(@OriginalArg(1) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_62 != null) {
			arg0.method1909();
		}
		arg0.aClass3_Sub1_61 = this.aClass3_Sub1_30.aClass3_Sub1_61;
		arg0.aClass3_Sub1_62 = this.aClass3_Sub1_30;
		arg0.aClass3_Sub1_62.aClass3_Sub1_61 = arg0;
		arg0.aClass3_Sub1_61.aClass3_Sub1_62 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!h;B)V")
	public void method1193(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_62 != null) {
			arg0.method1909();
		}
		arg0.aClass3_Sub1_61 = this.aClass3_Sub1_30;
		arg0.aClass3_Sub1_62 = this.aClass3_Sub1_30.aClass3_Sub1_62;
		arg0.aClass3_Sub1_62.aClass3_Sub1_61 = arg0;
		arg0.aClass3_Sub1_61.aClass3_Sub1_62 = arg0;
	}
}
