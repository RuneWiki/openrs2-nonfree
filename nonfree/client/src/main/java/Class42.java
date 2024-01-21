import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class42 {

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!gb;")
	private final Class1_Sub1 aClass1_Sub1_46 = new Class1_Sub1();

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class42() {
		this.aClass1_Sub1_46.aClass1_Sub1_66 = this.aClass1_Sub1_46;
		this.aClass1_Sub1_46.aClass1_Sub1_65 = this.aClass1_Sub1_46;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!gb;B)V")
	public void method1197(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_65 != null) {
			arg0.method2110();
		}
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_46;
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_46.aClass1_Sub1_66;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Lclient!gb;")
	public Class1_Sub1 method1199() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_46.aClass1_Sub1_66;
		return this.aClass1_Sub1_46 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!gb;I)V")
	public void method1201(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_65 != null) {
			arg0.method2110();
		}
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_46.aClass1_Sub1_65;
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_46;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)Lclient!gb;")
	public Class1_Sub1 method1203() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_46.aClass1_Sub1_66;
		if (local3 == this.aClass1_Sub1_46) {
			return null;
		} else {
			local3.method2110();
			return local3;
		}
	}
}
