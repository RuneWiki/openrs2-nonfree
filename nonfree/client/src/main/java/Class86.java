import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class86 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!ue;")
	private final Class1_Sub3 aClass1_Sub3_54 = new Class1_Sub3();

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class86() {
		this.aClass1_Sub3_54.aClass1_Sub3_66 = this.aClass1_Sub3_54;
		this.aClass1_Sub3_54.aClass1_Sub3_65 = this.aClass1_Sub3_54;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLclient!ue;)V")
	public void method2883(@OriginalArg(1) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_66 != null) {
			arg0.method3367();
		}
		arg0.aClass1_Sub3_65 = this.aClass1_Sub3_54;
		arg0.aClass1_Sub3_66 = this.aClass1_Sub3_54.aClass1_Sub3_66;
		arg0.aClass1_Sub3_66.aClass1_Sub3_65 = arg0;
		arg0.aClass1_Sub3_65.aClass1_Sub3_66 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Lclient!ue;")
	public Class1_Sub3 method2885() {
		@Pc(11) Class1_Sub3 local11 = this.aClass1_Sub3_54.aClass1_Sub3_65;
		if (local11 == this.aClass1_Sub3_54) {
			return null;
		} else {
			local11.method3367();
			return local11;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!ue;)V")
	public void method2886(@OriginalArg(1) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_66 != null) {
			arg0.method3367();
		}
		arg0.aClass1_Sub3_65 = this.aClass1_Sub3_54.aClass1_Sub3_65;
		arg0.aClass1_Sub3_66 = this.aClass1_Sub3_54;
		arg0.aClass1_Sub3_66.aClass1_Sub3_65 = arg0;
		arg0.aClass1_Sub3_65.aClass1_Sub3_66 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Lclient!ue;")
	public Class1_Sub3 method2887() {
		@Pc(7) Class1_Sub3 local7 = this.aClass1_Sub3_54.aClass1_Sub3_65;
		return local7 == this.aClass1_Sub3_54 ? null : local7;
	}
}
