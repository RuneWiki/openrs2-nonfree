import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class17 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!ob;")
	private final Class1_Sub3 aClass1_Sub3_25 = new Class1_Sub3();

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class17() {
		this.aClass1_Sub3_25.aClass1_Sub3_64 = this.aClass1_Sub3_25;
		this.aClass1_Sub3_25.aClass1_Sub3_63 = this.aClass1_Sub3_25;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Lclient!ob;")
	public Class1_Sub3 method604() {
		@Pc(12) Class1_Sub3 local12 = this.aClass1_Sub3_25.aClass1_Sub3_64;
		if (this.aClass1_Sub3_25 == local12) {
			return null;
		} else {
			local12.method2235();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ob;B)V")
	public void method606(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_63 != null) {
			arg0.method2235();
		}
		arg0.aClass1_Sub3_63 = this.aClass1_Sub3_25.aClass1_Sub3_63;
		arg0.aClass1_Sub3_64 = this.aClass1_Sub3_25;
		arg0.aClass1_Sub3_63.aClass1_Sub3_64 = arg0;
		arg0.aClass1_Sub3_64.aClass1_Sub3_63 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Lclient!ob;")
	public Class1_Sub3 method608() {
		@Pc(7) Class1_Sub3 local7 = this.aClass1_Sub3_25.aClass1_Sub3_64;
		return local7 == this.aClass1_Sub3_25 ? null : local7;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Lclient!ob;B)V")
	public void method609(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_63 != null) {
			arg0.method2235();
		}
		arg0.aClass1_Sub3_63 = this.aClass1_Sub3_25;
		arg0.aClass1_Sub3_64 = this.aClass1_Sub3_25.aClass1_Sub3_64;
		arg0.aClass1_Sub3_63.aClass1_Sub3_64 = arg0;
		arg0.aClass1_Sub3_64.aClass1_Sub3_63 = arg0;
	}
}
