import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class58 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!t;")
	private final Class1_Sub2 aClass1_Sub2_35 = new Class1_Sub2();

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class58() {
		this.aClass1_Sub2_35.aClass1_Sub2_66 = this.aClass1_Sub2_35;
		this.aClass1_Sub2_35.aClass1_Sub2_65 = this.aClass1_Sub2_35;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!t;)V")
	public void method1913(@OriginalArg(1) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_66 != null) {
			arg0.method3549();
		}
		arg0.aClass1_Sub2_66 = this.aClass1_Sub2_35.aClass1_Sub2_66;
		arg0.aClass1_Sub2_65 = this.aClass1_Sub2_35;
		arg0.aClass1_Sub2_66.aClass1_Sub2_65 = arg0;
		arg0.aClass1_Sub2_65.aClass1_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!t;I)V")
	public void method1914(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_66 != null) {
			arg0.method3549();
		}
		arg0.aClass1_Sub2_66 = this.aClass1_Sub2_35;
		arg0.aClass1_Sub2_65 = this.aClass1_Sub2_35.aClass1_Sub2_65;
		arg0.aClass1_Sub2_66.aClass1_Sub2_65 = arg0;
		arg0.aClass1_Sub2_65.aClass1_Sub2_66 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lclient!t;")
	public Class1_Sub2 method1915() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_35.aClass1_Sub2_65;
		return local7 == this.aClass1_Sub2_35 ? null : local7;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Lclient!t;")
	public Class1_Sub2 method1918() {
		@Pc(7) Class1_Sub2 local7 = this.aClass1_Sub2_35.aClass1_Sub2_65;
		if (local7 == this.aClass1_Sub2_35) {
			return null;
		} else {
			local7.method3549();
			return local7;
		}
	}
}
