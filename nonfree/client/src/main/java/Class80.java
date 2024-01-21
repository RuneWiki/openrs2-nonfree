import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class80 {

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!eb;")
	private final Class1_Sub1 aClass1_Sub1_64 = new Class1_Sub1();

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class80() {
		this.aClass1_Sub1_64.aClass1_Sub1_65 = this.aClass1_Sub1_64;
		this.aClass1_Sub1_64.aClass1_Sub1_66 = this.aClass1_Sub1_64;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!eb;)V")
	public void method1981(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_66 != null) {
			arg0.method2004();
		}
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_64;
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_64.aClass1_Sub1_66;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!eb;I)V")
	public void method1983(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_66 != null) {
			arg0.method2004();
		}
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_64.aClass1_Sub1_65;
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_64;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Lclient!eb;")
	public Class1_Sub1 method1984() {
		@Pc(12) Class1_Sub1 local12 = this.aClass1_Sub1_64.aClass1_Sub1_65;
		if (this.aClass1_Sub1_64 == local12) {
			return null;
		} else {
			local12.method2004();
			return local12;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1 method1989() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_64.aClass1_Sub1_65;
		return this.aClass1_Sub1_64 == local7 ? null : local7;
	}
}
