import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class38 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!lb;")
	private final Class1_Sub1 aClass1_Sub1_40 = new Class1_Sub1();

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class38() {
		this.aClass1_Sub1_40.aClass1_Sub1_64 = this.aClass1_Sub1_40;
		this.aClass1_Sub1_40.aClass1_Sub1_63 = this.aClass1_Sub1_40;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)Lclient!lb;")
	public Class1_Sub1 method1204() {
		@Pc(10) Class1_Sub1 local10 = this.aClass1_Sub1_40.aClass1_Sub1_63;
		if (this.aClass1_Sub1_40 == local10) {
			return null;
		} else {
			local10.method1855();
			return local10;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!lb;I)V")
	public void method1206(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_64 != null) {
			arg0.method1855();
		}
		arg0.aClass1_Sub1_64 = this.aClass1_Sub1_40;
		arg0.aClass1_Sub1_63 = this.aClass1_Sub1_40.aClass1_Sub1_63;
		arg0.aClass1_Sub1_64.aClass1_Sub1_63 = arg0;
		arg0.aClass1_Sub1_63.aClass1_Sub1_64 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!lb;B)V")
	public void method1207(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_64 != null) {
			arg0.method1855();
		}
		arg0.aClass1_Sub1_64 = this.aClass1_Sub1_40.aClass1_Sub1_64;
		arg0.aClass1_Sub1_63 = this.aClass1_Sub1_40;
		arg0.aClass1_Sub1_64.aClass1_Sub1_63 = arg0;
		arg0.aClass1_Sub1_63.aClass1_Sub1_64 = arg0;
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Lclient!lb;")
	public Class1_Sub1 method1208() {
		@Pc(12) Class1_Sub1 local12 = this.aClass1_Sub1_40.aClass1_Sub1_63;
		return local12 == this.aClass1_Sub1_40 ? null : local12;
	}
}
