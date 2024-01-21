import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class5 {

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Lclient!wb;")
	private final Class1_Sub1 aClass1_Sub1_7 = new Class1_Sub1();

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class5() {
		this.aClass1_Sub1_7.aClass1_Sub1_60 = this.aClass1_Sub1_7;
		this.aClass1_Sub1_7.aClass1_Sub1_59 = this.aClass1_Sub1_7;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!wb;)V")
	public void method105(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_59 != null) {
			arg0.method1828();
		}
		arg0.aClass1_Sub1_59 = this.aClass1_Sub1_7;
		arg0.aClass1_Sub1_60 = this.aClass1_Sub1_7.aClass1_Sub1_60;
		arg0.aClass1_Sub1_59.aClass1_Sub1_60 = arg0;
		arg0.aClass1_Sub1_60.aClass1_Sub1_59 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Lclient!wb;")
	public Class1_Sub1 method106() {
		@Pc(14) Class1_Sub1 local14 = this.aClass1_Sub1_7.aClass1_Sub1_60;
		return this.aClass1_Sub1_7 == local14 ? null : local14;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Lclient!wb;")
	public Class1_Sub1 method108() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_7.aClass1_Sub1_60;
		if (this.aClass1_Sub1_7 == local7) {
			return null;
		} else {
			local7.method1828();
			return local7;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!wb;I)V")
	public void method110(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_59 != null) {
			arg0.method1828();
		}
		arg0.aClass1_Sub1_59 = this.aClass1_Sub1_7.aClass1_Sub1_59;
		arg0.aClass1_Sub1_60 = this.aClass1_Sub1_7;
		arg0.aClass1_Sub1_59.aClass1_Sub1_60 = arg0;
		arg0.aClass1_Sub1_60.aClass1_Sub1_59 = arg0;
	}
}
