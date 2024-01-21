import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class46 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!ph;")
	private final Class2_Sub2 aClass2_Sub2_43 = new Class2_Sub2();

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class46() {
		this.aClass2_Sub2_43.aClass2_Sub2_69 = this.aClass2_Sub2_43;
		this.aClass2_Sub2_43.aClass2_Sub2_70 = this.aClass2_Sub2_43;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(BLclient!ph;)V")
	public void method1574(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_69 != null) {
			arg0.method2843();
		}
		arg0.aClass2_Sub2_69 = this.aClass2_Sub2_43;
		arg0.aClass2_Sub2_70 = this.aClass2_Sub2_43.aClass2_Sub2_70;
		arg0.aClass2_Sub2_69.aClass2_Sub2_70 = arg0;
		arg0.aClass2_Sub2_70.aClass2_Sub2_69 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!ph;)V")
	public void method1576(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_69 != null) {
			arg0.method2843();
		}
		arg0.aClass2_Sub2_70 = this.aClass2_Sub2_43;
		arg0.aClass2_Sub2_69 = this.aClass2_Sub2_43.aClass2_Sub2_69;
		arg0.aClass2_Sub2_69.aClass2_Sub2_70 = arg0;
		arg0.aClass2_Sub2_70.aClass2_Sub2_69 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Lclient!ph;")
	public Class2_Sub2 method1578() {
		@Pc(7) Class2_Sub2 local7 = this.aClass2_Sub2_43.aClass2_Sub2_70;
		if (local7 == this.aClass2_Sub2_43) {
			return null;
		} else {
			local7.method2843();
			return local7;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)Lclient!ph;")
	public Class2_Sub2 method1581() {
		@Pc(8) Class2_Sub2 local8 = this.aClass2_Sub2_43.aClass2_Sub2_70;
		return local8 == this.aClass2_Sub2_43 ? null : local8;
	}
}
