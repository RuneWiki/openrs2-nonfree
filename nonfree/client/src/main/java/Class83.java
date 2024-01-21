import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class83 {

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!ra;")
	private final Class4_Sub4 aClass4_Sub4_66 = new Class4_Sub4();

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class83() {
		this.aClass4_Sub4_66.aClass4_Sub4_65 = this.aClass4_Sub4_66;
		this.aClass4_Sub4_66.aClass4_Sub4_64 = this.aClass4_Sub4_66;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLclient!ra;)V")
	public void method2020(@OriginalArg(1) Class4_Sub4 arg0) {
		if (arg0.aClass4_Sub4_64 != null) {
			arg0.method1944();
		}
		arg0.aClass4_Sub4_65 = this.aClass4_Sub4_66.aClass4_Sub4_65;
		arg0.aClass4_Sub4_64 = this.aClass4_Sub4_66;
		arg0.aClass4_Sub4_64.aClass4_Sub4_65 = arg0;
		arg0.aClass4_Sub4_65.aClass4_Sub4_64 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!ra;)V")
	public void method2021(@OriginalArg(1) Class4_Sub4 arg0) {
		if (arg0.aClass4_Sub4_64 != null) {
			arg0.method1944();
		}
		arg0.aClass4_Sub4_64 = this.aClass4_Sub4_66.aClass4_Sub4_64;
		arg0.aClass4_Sub4_65 = this.aClass4_Sub4_66;
		arg0.aClass4_Sub4_64.aClass4_Sub4_65 = arg0;
		arg0.aClass4_Sub4_65.aClass4_Sub4_64 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)Lclient!ra;")
	public Class4_Sub4 method2022() {
		@Pc(3) Class4_Sub4 local3 = this.aClass4_Sub4_66.aClass4_Sub4_65;
		if (this.aClass4_Sub4_66 == local3) {
			return null;
		} else {
			local3.method1944();
			return local3;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Lclient!ra;")
	public Class4_Sub4 method2023() {
		@Pc(3) Class4_Sub4 local3 = this.aClass4_Sub4_66.aClass4_Sub4_65;
		return local3 == this.aClass4_Sub4_66 ? null : local3;
	}
}
