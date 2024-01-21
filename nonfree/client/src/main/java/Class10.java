import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class10 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!jb;")
	private final Class1_Sub1 aClass1_Sub1_13 = new Class1_Sub1();

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class10() {
		this.aClass1_Sub1_13.aClass1_Sub1_66 = this.aClass1_Sub1_13;
		this.aClass1_Sub1_13.aClass1_Sub1_65 = this.aClass1_Sub1_13;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)Lclient!jb;")
	public Class1_Sub1 method264() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_13.aClass1_Sub1_65;
		if (this.aClass1_Sub1_13 == local7) {
			return null;
		} else {
			local7.method2079();
			return local7;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!jb;B)V")
	public void method265(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_66 != null) {
			arg0.method2079();
		}
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_13;
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_13.aClass1_Sub1_66;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)Lclient!jb;")
	public Class1_Sub1 method266() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_13.aClass1_Sub1_65;
		return this.aClass1_Sub1_13 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Lclient!jb;B)V")
	public void method267(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_66 != null) {
			arg0.method2079();
		}
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_13.aClass1_Sub1_65;
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_13;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
	}
}
