import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class74 {

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "Lclient!rf;")
	private final Class2_Sub1 aClass2_Sub1_54 = new Class2_Sub1();

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class74() {
		this.aClass2_Sub1_54.aClass2_Sub1_65 = this.aClass2_Sub1_54;
		this.aClass2_Sub1_54.aClass2_Sub1_66 = this.aClass2_Sub1_54;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Lclient!rf;")
	public Class2_Sub1 method1824() {
		@Pc(15) Class2_Sub1 local15 = this.aClass2_Sub1_54.aClass2_Sub1_66;
		if (this.aClass2_Sub1_54 == local15) {
			return null;
		} else {
			local15.method2057();
			return local15;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!rf;Z)V")
	public void method1825(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_65 != null) {
			arg0.method2057();
		}
		arg0.aClass2_Sub1_66 = this.aClass2_Sub1_54.aClass2_Sub1_66;
		arg0.aClass2_Sub1_65 = this.aClass2_Sub1_54;
		arg0.aClass2_Sub1_65.aClass2_Sub1_66 = arg0;
		arg0.aClass2_Sub1_66.aClass2_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!rf;)V")
	public void method1827(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_65 != null) {
			arg0.method2057();
		}
		arg0.aClass2_Sub1_65 = this.aClass2_Sub1_54.aClass2_Sub1_65;
		arg0.aClass2_Sub1_66 = this.aClass2_Sub1_54;
		arg0.aClass2_Sub1_65.aClass2_Sub1_66 = arg0;
		arg0.aClass2_Sub1_66.aClass2_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)Lclient!rf;")
	public Class2_Sub1 method1829() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_54.aClass2_Sub1_66;
		return local3 == this.aClass2_Sub1_54 ? null : local3;
	}
}
