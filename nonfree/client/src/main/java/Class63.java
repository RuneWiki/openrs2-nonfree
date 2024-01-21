import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class63 {

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!kb;")
	private final Class2_Sub1 aClass2_Sub1_60 = new Class2_Sub1();

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class63() {
		this.aClass2_Sub1_60.aClass2_Sub1_59 = this.aClass2_Sub1_60;
		this.aClass2_Sub1_60.aClass2_Sub1_58 = this.aClass2_Sub1_60;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!kb;)V")
	public void method1748(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_59 != null) {
			arg0.method1702();
		}
		arg0.aClass2_Sub1_59 = this.aClass2_Sub1_60.aClass2_Sub1_59;
		arg0.aClass2_Sub1_58 = this.aClass2_Sub1_60;
		arg0.aClass2_Sub1_59.aClass2_Sub1_58 = arg0;
		arg0.aClass2_Sub1_58.aClass2_Sub1_59 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!kb;I)V")
	public void method1749(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_59 != null) {
			arg0.method1702();
		}
		arg0.aClass2_Sub1_59 = this.aClass2_Sub1_60;
		arg0.aClass2_Sub1_58 = this.aClass2_Sub1_60.aClass2_Sub1_58;
		arg0.aClass2_Sub1_59.aClass2_Sub1_58 = arg0;
		arg0.aClass2_Sub1_58.aClass2_Sub1_59 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!kb;")
	public Class2_Sub1 method1751() {
		@Pc(12) Class2_Sub1 local12 = this.aClass2_Sub1_60.aClass2_Sub1_58;
		return local12 == this.aClass2_Sub1_60 ? null : local12;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)Lclient!kb;")
	public Class2_Sub1 method1752() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_60.aClass2_Sub1_58;
		if (local3 == this.aClass2_Sub1_60) {
			return null;
		} else {
			local3.method1702();
			return local3;
		}
	}
}
