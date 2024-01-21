import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class58 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!ci;")
	private final Class3_Sub1 aClass3_Sub1_40 = new Class3_Sub1();

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class58() {
		this.aClass3_Sub1_40.aClass3_Sub1_71 = this.aClass3_Sub1_40;
		this.aClass3_Sub1_40.aClass3_Sub1_72 = this.aClass3_Sub1_40;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lclient!ci;")
	public Class3_Sub1 method1568() {
		@Pc(7) Class3_Sub1 local7 = this.aClass3_Sub1_40.aClass3_Sub1_71;
		return this.aClass3_Sub1_40 == local7 ? null : local7;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lclient!ci;")
	public Class3_Sub1 method1570() {
		@Pc(12) Class3_Sub1 local12 = this.aClass3_Sub1_40.aClass3_Sub1_71;
		if (this.aClass3_Sub1_40 == local12) {
			return null;
		} else {
			local12.method3150();
			return local12;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ci;Z)V")
	public void method1571(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_72 != null) {
			arg0.method3150();
		}
		arg0.aClass3_Sub1_72 = this.aClass3_Sub1_40.aClass3_Sub1_72;
		arg0.aClass3_Sub1_71 = this.aClass3_Sub1_40;
		arg0.aClass3_Sub1_72.aClass3_Sub1_71 = arg0;
		arg0.aClass3_Sub1_71.aClass3_Sub1_72 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!ci;)V")
	public void method1574(@OriginalArg(1) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_72 != null) {
			arg0.method3150();
		}
		arg0.aClass3_Sub1_72 = this.aClass3_Sub1_40;
		arg0.aClass3_Sub1_71 = this.aClass3_Sub1_40.aClass3_Sub1_71;
		arg0.aClass3_Sub1_72.aClass3_Sub1_71 = arg0;
		arg0.aClass3_Sub1_71.aClass3_Sub1_72 = arg0;
	}
}
