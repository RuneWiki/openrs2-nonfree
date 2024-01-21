import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!cd;")
	private final Class2_Sub1 aClass2_Sub1_1 = new Class2_Sub1();

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1() {
		this.aClass2_Sub1_1.aClass2_Sub1_64 = this.aClass2_Sub1_1;
		this.aClass2_Sub1_1.aClass2_Sub1_63 = this.aClass2_Sub1_1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLclient!cd;)V")
	public void method2(@OriginalArg(1) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_63 != null) {
			arg0.method2025();
		}
		arg0.aClass2_Sub1_64 = this.aClass2_Sub1_1.aClass2_Sub1_64;
		arg0.aClass2_Sub1_63 = this.aClass2_Sub1_1;
		arg0.aClass2_Sub1_63.aClass2_Sub1_64 = arg0;
		arg0.aClass2_Sub1_64.aClass2_Sub1_63 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)Lclient!cd;")
	public Class2_Sub1 method3() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_1.aClass2_Sub1_64;
		return local3 == this.aClass2_Sub1_1 ? null : local3;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!cd;I)V")
	public void method5(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_63 != null) {
			arg0.method2025();
		}
		arg0.aClass2_Sub1_63 = this.aClass2_Sub1_1.aClass2_Sub1_63;
		arg0.aClass2_Sub1_64 = this.aClass2_Sub1_1;
		arg0.aClass2_Sub1_63.aClass2_Sub1_64 = arg0;
		arg0.aClass2_Sub1_64.aClass2_Sub1_63 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)Lclient!cd;")
	public Class2_Sub1 method6() {
		@Pc(7) Class2_Sub1 local7 = this.aClass2_Sub1_1.aClass2_Sub1_64;
		if (this.aClass2_Sub1_1 == local7) {
			return null;
		} else {
			local7.method2025();
			return local7;
		}
	}
}
