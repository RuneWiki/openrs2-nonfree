import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class42 {

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!gd;")
	private final Class1_Sub1 aClass1_Sub1_39 = new Class1_Sub1();

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
	public Class42() {
		this.aClass1_Sub1_39.aClass1_Sub1_65 = this.aClass1_Sub1_39;
		this.aClass1_Sub1_39.aClass1_Sub1_66 = this.aClass1_Sub1_39;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)Lclient!gd;")
	public Class1_Sub1 method1302() {
		@Pc(8) Class1_Sub1 local8 = this.aClass1_Sub1_39.aClass1_Sub1_65;
		if (this.aClass1_Sub1_39 == local8) {
			return null;
		} else {
			local8.method2003();
			return local8;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lclient!gd;")
	public Class1_Sub1 method1303() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_39.aClass1_Sub1_65;
		return this.aClass1_Sub1_39 == local3 ? null : local3;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!gd;I)V")
	public void method1307(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_66 != null) {
			arg0.method2003();
		}
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_39;
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_39.aClass1_Sub1_66;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!gd;)V")
	public void method1308(@OriginalArg(1) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_66 != null) {
			arg0.method2003();
		}
		arg0.aClass1_Sub1_66 = this.aClass1_Sub1_39;
		arg0.aClass1_Sub1_65 = this.aClass1_Sub1_39.aClass1_Sub1_65;
		arg0.aClass1_Sub1_66.aClass1_Sub1_65 = arg0;
		arg0.aClass1_Sub1_65.aClass1_Sub1_66 = arg0;
	}
}
