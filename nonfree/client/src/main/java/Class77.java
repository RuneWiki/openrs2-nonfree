import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class77 {

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!bd;")
	private final Class1_Sub1 aClass1_Sub1_66 = new Class1_Sub1();

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class77() {
		this.aClass1_Sub1_66.aClass1_Sub1_69 = this.aClass1_Sub1_66;
		this.aClass1_Sub1_66.aClass1_Sub1_70 = this.aClass1_Sub1_66;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!bd;)V")
	public void method2926(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_70 != null) {
			arg0.method3147();
		}
		arg0.aClass1_Sub1_70 = this.aClass1_Sub1_66;
		arg0.aClass1_Sub1_69 = this.aClass1_Sub1_66.aClass1_Sub1_69;
		arg0.aClass1_Sub1_70.aClass1_Sub1_69 = arg0;
		arg0.aClass1_Sub1_69.aClass1_Sub1_70 = arg0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Lclient!bd;")
	public Class1_Sub1 method2927() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_66.aClass1_Sub1_69;
		if (this.aClass1_Sub1_66 == local3) {
			return null;
		} else {
			local3.method3147();
			return local3;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Lclient!bd;")
	public Class1_Sub1 method2929() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_66.aClass1_Sub1_69;
		return this.aClass1_Sub1_66 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(ILclient!bd;)V")
	public void method2931(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_70 != null) {
			arg0.method3147();
		}
		arg0.aClass1_Sub1_69 = this.aClass1_Sub1_66;
		arg0.aClass1_Sub1_70 = this.aClass1_Sub1_66.aClass1_Sub1_70;
		arg0.aClass1_Sub1_70.aClass1_Sub1_69 = arg0;
		arg0.aClass1_Sub1_69.aClass1_Sub1_70 = arg0;
	}
}
