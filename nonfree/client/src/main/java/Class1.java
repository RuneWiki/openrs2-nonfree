import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!rc;")
	private final Class3_Sub1 aClass3_Sub1_1 = new Class3_Sub1();

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1() {
		this.aClass3_Sub1_1.aClass3_Sub1_65 = this.aClass3_Sub1_1;
		this.aClass3_Sub1_1.aClass3_Sub1_66 = this.aClass3_Sub1_1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!rc;I)V")
	public void method1(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_65 != null) {
			arg0.method2210();
		}
		arg0.aClass3_Sub1_66 = this.aClass3_Sub1_1;
		arg0.aClass3_Sub1_65 = this.aClass3_Sub1_1.aClass3_Sub1_65;
		arg0.aClass3_Sub1_65.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lclient!rc;")
	public Class3_Sub1 method2() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_1.aClass3_Sub1_66;
		return this.aClass3_Sub1_1 == local3 ? null : local3;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Lclient!rc;I)V")
	public void method3(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_65 != null) {
			arg0.method2210();
		}
		arg0.aClass3_Sub1_65 = this.aClass3_Sub1_1;
		arg0.aClass3_Sub1_66 = this.aClass3_Sub1_1.aClass3_Sub1_66;
		arg0.aClass3_Sub1_65.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Lclient!rc;")
	public Class3_Sub1 method5() {
		@Pc(15) Class3_Sub1 local15 = this.aClass3_Sub1_1.aClass3_Sub1_66;
		if (this.aClass3_Sub1_1 == local15) {
			return null;
		} else {
			local15.method2210();
			return local15;
		}
	}
}
