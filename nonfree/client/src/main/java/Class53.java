import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class53 {

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!ad;")
	private final Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class53() {
		this.aClass1_Sub1_35.aClass1_Sub1_69 = this.aClass1_Sub1_35;
		this.aClass1_Sub1_35.aClass1_Sub1_70 = this.aClass1_Sub1_35;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)Lclient!ad;")
	public Class1_Sub1 method1712() {
		@Pc(14) Class1_Sub1 local14 = this.aClass1_Sub1_35.aClass1_Sub1_70;
		return local14 == this.aClass1_Sub1_35 ? null : local14;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ad;)V")
	public void method1713(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_69 != null) {
			arg0.method3149();
		}
		arg0.aClass1_Sub1_70 = this.aClass1_Sub1_35;
		arg0.aClass1_Sub1_69 = this.aClass1_Sub1_35.aClass1_Sub1_69;
		arg0.aClass1_Sub1_69.aClass1_Sub1_70 = arg0;
		arg0.aClass1_Sub1_70.aClass1_Sub1_69 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ad;B)V")
	public void method1715(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_69 != null) {
			arg0.method3149();
		}
		arg0.aClass1_Sub1_70 = this.aClass1_Sub1_35.aClass1_Sub1_70;
		arg0.aClass1_Sub1_69 = this.aClass1_Sub1_35;
		arg0.aClass1_Sub1_69.aClass1_Sub1_70 = arg0;
		arg0.aClass1_Sub1_70.aClass1_Sub1_69 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)Lclient!ad;")
	public Class1_Sub1 method1717() {
		@Pc(7) Class1_Sub1 local7 = this.aClass1_Sub1_35.aClass1_Sub1_70;
		if (this.aClass1_Sub1_35 == local7) {
			return null;
		} else {
			local7.method3149();
			return local7;
		}
	}
}
