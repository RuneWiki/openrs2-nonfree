import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class52 {

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "Lclient!qg;")
	private Class1_Sub1 aClass1_Sub1_20 = new Class1_Sub1();

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class52() {
		this.aClass1_Sub1_20.aClass1_Sub1_66 = this.aClass1_Sub1_20;
		this.aClass1_Sub1_20.aClass1_Sub1_65 = this.aClass1_Sub1_20;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!qg;)V")
	public void method1671(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_65 != null) {
			arg0.method3434();
		}
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_20;
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_20.aClass1_Sub1_65;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!qg;)V")
	public void method1675(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_65 != null) {
			arg0.method3434();
		}
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_20.aClass1_Sub1_66;
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_20;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Lclient!qg;")
	public Class1_Sub1 method1677() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_20.aClass1_Sub1_66;
		return this.aClass1_Sub1_20 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)Lclient!qg;")
	public Class1_Sub1 method1678() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_20.aClass1_Sub1_66;
		if (local7 == this.aClass1_Sub1_20) {
			return null;
		} else {
			local7.method3434();
			return local7;
		}
	}
}
