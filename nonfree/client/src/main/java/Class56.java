import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class56 {

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!ea;")
	private final Class2_Sub1 aClass2_Sub1_48 = new Class2_Sub1();

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	public Class56() {
		this.aClass2_Sub1_48.aClass2_Sub1_66 = this.aClass2_Sub1_48;
		this.aClass2_Sub1_48.aClass2_Sub1_65 = this.aClass2_Sub1_48;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)Lclient!ea;")
	public Class2_Sub1 method1583() {
		@Pc(7) Class2_Sub1 local7 = this.aClass2_Sub1_48.aClass2_Sub1_65;
		if (this.aClass2_Sub1_48 == local7) {
			return null;
		} else {
			local7.method2211();
			return local7;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ea;I)V")
	public void method1584(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_66 != null) {
			arg0.method2211();
		}
		arg0.aClass2_Sub1_65 = this.aClass2_Sub1_48;
		arg0.aClass2_Sub1_66 = this.aClass2_Sub1_48.aClass2_Sub1_66;
		arg0.aClass2_Sub1_66.aClass2_Sub1_65 = arg0;
		arg0.aClass2_Sub1_65.aClass2_Sub1_66 = arg0;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Lclient!ea;")
	public Class2_Sub1 method1585() {
		@Pc(7) Class2_Sub1 local7 = this.aClass2_Sub1_48.aClass2_Sub1_65;
		return local7 == this.aClass2_Sub1_48 ? null : local7;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Lclient!ea;I)V")
	public void method1587(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_66 != null) {
			arg0.method2211();
		}
		arg0.aClass2_Sub1_65 = this.aClass2_Sub1_48.aClass2_Sub1_65;
		arg0.aClass2_Sub1_66 = this.aClass2_Sub1_48;
		arg0.aClass2_Sub1_66.aClass2_Sub1_65 = arg0;
		arg0.aClass2_Sub1_65.aClass2_Sub1_66 = arg0;
	}
}
